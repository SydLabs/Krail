// Code generated by Wire protocol buffer compiler, do not edit.
// Source: transit_realtime.VehicleDescriptor in xyz/ksharma/transport/gtfs_realtime.proto
@file:Suppress("DEPRECATION")

package xyz.ksharma.krail.network.model

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okio.ByteString

public class VehicleDescriptor(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val id: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 1,
  )
  @JvmField
  public val label: String? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  @JvmField
  public val license_plate: String? = null,
  /**
   * NEW
   * Extension source: xyz/ksharma/transport/gtfs_realtime.proto
   */
  @field:WireField(
    tag = 1_007,
    adapter = "xyz.ksharma.krail.network.model.TfnswVehicleDescriptor#ADAPTER",
    schemaIndex = 3,
  )
  @JvmField
  public val tfnsw_vehicle_descriptor: TfnswVehicleDescriptor? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<VehicleDescriptor, VehicleDescriptor.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.id = id
    builder.label = label
    builder.license_plate = license_plate
    builder.tfnsw_vehicle_descriptor = tfnsw_vehicle_descriptor
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is VehicleDescriptor) return false
    if (unknownFields != other.unknownFields) return false
    if (id != other.id) return false
    if (label != other.label) return false
    if (license_plate != other.license_plate) return false
    if (tfnsw_vehicle_descriptor != other.tfnsw_vehicle_descriptor) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (id?.hashCode() ?: 0)
      result = result * 37 + (label?.hashCode() ?: 0)
      result = result * 37 + (license_plate?.hashCode() ?: 0)
      result = result * 37 + (tfnsw_vehicle_descriptor?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (id != null) result += """id=${sanitize(id)}"""
    if (label != null) result += """label=${sanitize(label)}"""
    if (license_plate != null) result += """license_plate=${sanitize(license_plate)}"""
    if (tfnsw_vehicle_descriptor != null) result +=
        """tfnsw_vehicle_descriptor=$tfnsw_vehicle_descriptor"""
    return result.joinToString(prefix = "VehicleDescriptor{", separator = ", ", postfix = "}")
  }

  public fun copy(
    id: String? = this.id,
    label: String? = this.label,
    license_plate: String? = this.license_plate,
    tfnsw_vehicle_descriptor: TfnswVehicleDescriptor? = this.tfnsw_vehicle_descriptor,
    unknownFields: ByteString = this.unknownFields,
  ): VehicleDescriptor = VehicleDescriptor(id, label, license_plate, tfnsw_vehicle_descriptor,
      unknownFields)

  public class Builder : Message.Builder<VehicleDescriptor, Builder>() {
    @JvmField
    public var id: String? = null

    @JvmField
    public var label: String? = null

    @JvmField
    public var license_plate: String? = null

    @JvmField
    public var tfnsw_vehicle_descriptor: TfnswVehicleDescriptor? = null

    public fun id(id: String?): Builder {
      this.id = id
      return this
    }

    public fun label(label: String?): Builder {
      this.label = label
      return this
    }

    public fun license_plate(license_plate: String?): Builder {
      this.license_plate = license_plate
      return this
    }

    /**
     * NEW
     */
    public fun tfnsw_vehicle_descriptor(tfnsw_vehicle_descriptor: TfnswVehicleDescriptor?):
        Builder {
      this.tfnsw_vehicle_descriptor = tfnsw_vehicle_descriptor
      return this
    }

    override fun build(): VehicleDescriptor = VehicleDescriptor(
      id = id,
      label = label,
      license_plate = license_plate,
      tfnsw_vehicle_descriptor = tfnsw_vehicle_descriptor,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<VehicleDescriptor> = object : ProtoAdapter<VehicleDescriptor>(
      FieldEncoding.LENGTH_DELIMITED, 
      VehicleDescriptor::class, 
      "type.googleapis.com/transit_realtime.VehicleDescriptor", 
      PROTO_2, 
      null, 
      "xyz/ksharma/transport/gtfs_realtime.proto"
    ) {
      override fun encodedSize(`value`: VehicleDescriptor): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.label)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.license_plate)
        size += TfnswVehicleDescriptor.ADAPTER.encodedSizeWithTag(1_007,
            value.tfnsw_vehicle_descriptor)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: VehicleDescriptor) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.license_plate)
        TfnswVehicleDescriptor.ADAPTER.encodeWithTag(writer, 1_007, value.tfnsw_vehicle_descriptor)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: VehicleDescriptor) {
        writer.writeBytes(value.unknownFields)
        TfnswVehicleDescriptor.ADAPTER.encodeWithTag(writer, 1_007, value.tfnsw_vehicle_descriptor)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.license_plate)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id)
      }

      override fun decode(reader: ProtoReader): VehicleDescriptor {
        var id: String? = null
        var label: String? = null
        var license_plate: String? = null
        var tfnsw_vehicle_descriptor: TfnswVehicleDescriptor? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> id = ProtoAdapter.STRING.decode(reader)
            2 -> label = ProtoAdapter.STRING.decode(reader)
            3 -> license_plate = ProtoAdapter.STRING.decode(reader)
            1_007 -> tfnsw_vehicle_descriptor = TfnswVehicleDescriptor.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return VehicleDescriptor(
          id = id,
          label = label,
          license_plate = license_plate,
          tfnsw_vehicle_descriptor = tfnsw_vehicle_descriptor,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: VehicleDescriptor): VehicleDescriptor = value.copy(
        tfnsw_vehicle_descriptor =
            value.tfnsw_vehicle_descriptor?.let(TfnswVehicleDescriptor.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): VehicleDescriptor =
        Builder().apply(body).build()
  }
}
