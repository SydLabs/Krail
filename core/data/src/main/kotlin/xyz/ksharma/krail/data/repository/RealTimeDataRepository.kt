package xyz.ksharma.krail.data.repository

import xyz.ksharma.krail.data.model.DemoDataModel

/**
 * The repository for fetching the [DemoDataModel].
 */
interface RealTimeDataRepository {

    suspend fun getSydneyTrains()
}
