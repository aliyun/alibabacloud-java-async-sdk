// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.das20200116.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      *
     */
    CompletableFuture<AddHDMInstanceResponse> addHDMInstance(AddHDMInstanceRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. You can create an Advanced Database & Application Migration (ADAM) stress testing task to check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see [Intelligent stress testing](~~155068~~).
      * Make sure that your database instances meet the following requirements:
      * *   The source database instance is an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition or X-Engine Edition cluster.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.
      * *   The source and destination database instances are connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Enterprise Edition is enabled for the source and destination database instances. For more information, see [Overview](~~190912~~).
      *
     */
    CompletableFuture<CreateAdamBenchTaskResponse> createAdamBenchTask(CreateAdamBenchTaskRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis Community Edition instances and performance-enhanced instances of the ApsaraDB for Redis Enhanced Edition (Tair).
      * >  Redis 7.0 is not supported. You are not allowed to use custom modules.
      *
     */
    CompletableFuture<CreateCacheAnalysisJobResponse> createCacheAnalysisJob(CreateCacheAnalysisJobRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~). Before you call this API operation, make sure that your database instances meet the following requirements:
      * *   The source database instance is an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition or X-Engine Edition cluster.
      * *   The destination database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The source and destination database instances are connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Enterprise Edition is enabled for the source and destination database instances. For more information, see [Overview](~~190912~~).
      *
     */
    CompletableFuture<CreateCloudBenchTasksResponse> createCloudBenchTasks(CreateCloudBenchTasksRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   RDS MySQL
      *     *   PolarDB for MySQL
      *     *   Redis
      *
     */
    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<CreateKillInstanceSessionTaskResponse> createKillInstanceSessionTask(CreateKillInstanceSessionTaskRequest request);

    CompletableFuture<CreateKillInstanceSessionTaskWithMaintainUserResponse> createKillInstanceSessionTaskWithMaintainUser(CreateKillInstanceSessionTaskWithMaintainUserRequest request);

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<CreateQueryOptimizeTagResponse> createQueryOptimizeTag(CreateQueryOptimizeTagRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
     */
    CompletableFuture<CreateRequestDiagnosisResponse> createRequestDiagnosis(CreateRequestDiagnosisRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   You can create an offline task only for database instances for which DAS Enterprise Edition V2 or V3 is enabled. For more information about the databases and regions that are supported by various versions of DAS Enterprise Edition, see [Editions and supported features](~~156204~~).
      *
     */
    CompletableFuture<CreateSqlLogTaskResponse> createSqlLogTask(CreateSqlLogTaskRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.
      * *   For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<CreateStorageAnalysisTaskResponse> createStorageAnalysisTask(CreateStorageAnalysisTaskRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<DeleteCloudBenchTaskResponse> deleteCloudBenchTask(DeleteCloudBenchTaskRequest request);

    /**
      * *   This operation is used to delete the metadata of a DBGateway that is released in a stress testing task created by calling the [CreateCloudBenchTasks](~~230665~~) operation.
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  If the heartbeat is lost between a DBGateway and the access point for more than 20 seconds, the DBGateway is considered stopped.
      *
     */
    CompletableFuture<DeleteStopGatewayResponse> deleteStopGateway(DeleteStopGatewayRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeAutoScalingConfigResponse> describeAutoScalingConfig(DescribeAutoScalingConfigRequest request);

    /**
      * *   You can call this operation to query the history information about the automatic performance scaling only of ApsaraDB RDS for MySQL High-availability Edition instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeAutoScalingHistoryResponse> describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
      * >  You can call this operation to query the top 500 keys in a cache analysis task.
      *
     */
    CompletableFuture<DescribeCacheAnalysisJobResponse> describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
      *
     */
    CompletableFuture<DescribeCacheAnalysisJobsResponse> describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<DescribeCloudBenchTasksResponse> describeCloudBenchTasks(DescribeCloudBenchTasksRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<DescribeCloudbenchTaskResponse> describeCloudbenchTask(DescribeCloudbenchTaskRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<DescribeCloudbenchTaskConfigResponse> describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable to the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB for Redis
      *
     */
    CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request);

    /**
      * This operation sorts list, hash, set, and zset keys based on the number of elements contained in these keys. The top three keys that contain the most elements are considered large keys. If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for ApsaraDB for Redis instances that meet the following requirements:
      *     *   The instance is a Community Edition instance that uses a major version of 5.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
     */
    CompletableFuture<DescribeHotBigKeysResponse> describeHotBigKeys(DescribeHotBigKeysRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances that meet the following requirements:
      *     *   The ApsaraDB for Redis instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For more information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
     */
    CompletableFuture<DescribeHotKeysResponse> describeHotKeys(DescribeHotKeysRequest request);

    /**
      * *   For more information about database instances that support DAS Enterprise Edition, see [Overview of DAS Enterprise Edition](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to DAS Enterprise Edition V1 and V2.
      *
     */
    CompletableFuture<DescribeInstanceDasProResponse> describeInstanceDasPro(DescribeInstanceDasProRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeSqlLogConfigResponse> describeSqlLogConfig(DescribeSqlLogConfigRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeSqlLogRecordsResponse> describeSqlLogRecords(DescribeSqlLogRecordsRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeSqlLogStatisticResponse> describeSqlLogStatistic(DescribeSqlLogStatisticRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeSqlLogTaskResponse> describeSqlLogTask(DescribeSqlLogTaskRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeSqlLogTasksResponse> describeSqlLogTasks(DescribeSqlLogTasksRequest request);

    /**
      * The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
     */
    CompletableFuture<DescribeTopBigKeysResponse> describeTopBigKeys(DescribeTopBigKeysRequest request);

    /**
      * If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [DescribeEngineVersion](~~95268~~) and [ModifyInstanceMinorVersion](~~129381~~).
      *
     */
    CompletableFuture<DescribeTopHotKeysResponse> describeTopHotKeys(DescribeTopHotKeysRequest request);

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<DisableAllSqlConcurrencyControlRulesResponse> disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request);

    /**
      * If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DisableAutoResourceOptimizeRulesResponse> disableAutoResourceOptimizeRules(DisableAutoResourceOptimizeRulesRequest request);

    /**
      * If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DisableAutoThrottleRulesResponse> disableAutoThrottleRules(DisableAutoThrottleRulesRequest request);

    /**
      * *   For more information about database instances that support DAS Enterprise Edition, see [Overview of DAS Enterprise Edition](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to DAS Enterprise Edition V1.
      *
     */
    CompletableFuture<DisableDasProResponse> disableDasPro(DisableDasProRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances.
      *
     */
    CompletableFuture<DisableInstanceDasConfigResponse> disableInstanceDasConfig(DisableInstanceDasConfigRequest request);

    /**
      * This operation is applicable to the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<DisableSqlConcurrencyControlResponse> disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request);

    /**
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to DAS Enterprise Edition V1.
      * >  If your database instance supports DAS Enterprise Edition V3, you cannot call this operation to enable DAS Enterprise Edition V1. You can call the [ModifySqlLogConfig](~~2778835~~) operation to enable DAS Enterprise Edition V3 for your database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see [Editions and supported features](~~156204~~).
      *
     */
    CompletableFuture<EnableDasProResponse> enableDasPro(EnableDasProRequest request);

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<EnableSqlConcurrencyControlResponse> enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request);

    /**
      * >  GetAsyncErrorRequestListByCode is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then send a request again. If the value of **isFinish** is **true**, the complete results are returned.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see [Purchase DAS Enterprise Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestListByCodeResponse> getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request);

    /**
      * >  GetAsyncErrorRequestStatByCode is an asynchronous operation After a request is sent, the complete results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then send a request again. If the value of **isFinish** is **true**, the complete results are returned.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see [Purchase DAS Enterprise Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestStatByCodeResponse> getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request);

    /**
      * >  GetAsyncErrorRequestStatResult is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then send a request again. If the value of **isFinish** is **true**, the complete results are returned.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see [Purchase DAS Enterprise Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestStatResultResponse> getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      *
     */
    CompletableFuture<GetAutoIncrementUsageStatisticResponse> getAutoIncrementUsageStatistic(GetAutoIncrementUsageStatisticRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance is an ApsaraDB RDS for MySQL instance of High-availability Edition.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
      *
     */
    CompletableFuture<GetAutoResourceOptimizeRulesResponse> getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, or PolarDB for MySQL X-Engine Edition instance that runs MySQL 8.0.
      *
     */
    CompletableFuture<GetAutoThrottleRulesResponse> getAutoThrottleRules(GetAutoThrottleRulesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
      *
     */
    CompletableFuture<GetAutonomousNotifyEventContentResponse> getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
      *
     */
    CompletableFuture<GetAutonomousNotifyEventsInRangeResponse> getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for SQL Server instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetBlockingDetailListResponse> getBlockingDetailList(GetBlockingDetailListRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
     */
    CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request);

    /**
      * *   For information about database instances that support this operation, see [Overview of DAS Enterprise Edition](~~190912~~).
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to DAS Enterprise Edition V1 and V2.
      *
     */
    CompletableFuture<GetDasProServiceUsageResponse> getDasProServiceUsage(GetDasProServiceUsageRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster in the China (Shanghai) region.
      * >  You can query only the data generated after DAS Enterprise Edition V2 or V3 was enabled. The beginning of the time range to query can be up to seven days earlier than the current time. The interval between the beginning and the end of the time range to query cannot exceed 24 hours.
      *
     */
    CompletableFuture<GetDasSQLLogHotDataResponse> getDasSQLLogHotData(GetDasSQLLogHotDataRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for SQL Server instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetDeadLockDetailListResponse> getDeadLockDetailList(GetDeadLockDetailListRequest request);

    CompletableFuture<GetEndpointSwitchTaskResponse> getEndpointSwitchTask(GetEndpointSwitchTaskRequest request);

    /**
      * >  GetErrorRequestSample is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then send a request again. If the value of **isFinish** is **true**, the complete results are returned.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see [Purchase DAS Enterprise Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetErrorRequestSampleResponse> getErrorRequestSample(GetErrorRequestSampleRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
     */
    CompletableFuture<GetEventSubscriptionResponse> getEventSubscription(GetEventSubscriptionRequest request);

    /**
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about database instances that support this feature, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetFullRequestOriginStatByInstanceIdResponse> getFullRequestOriginStatByInstanceId(GetFullRequestOriginStatByInstanceIdRequest request);

    /**
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about the database engines that support SQL Explorer, see [SQL Explorer](~~204096~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetFullRequestSampleByInstanceIdResponse> getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request);

    /**
      * >  The complete query results are not returned immediately after an asynchronous request is sent. If the value of isFinish is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of isFinish is **true**.
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetFullRequestStatResultByInstanceIdResponse> getFullRequestStatResultByInstanceId(GetFullRequestStatResultByInstanceIdRequest request);

    CompletableFuture<GetHDMAliyunResourceSyncResultResponse> getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request);

    CompletableFuture<GetHDMLastAliyunResourceSyncResultResponse> getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request);

    /**
      * Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see [Inspection and scoring](~~205659~~).
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of DAS SDK must be V1.0.3 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetInstanceInspectionsResponse> getInstanceInspections(GetInstanceInspectionsRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for SQL Server instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetInstanceMissingIndexListResponse> getInstanceMissingIndexList(GetInstanceMissingIndexListRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.
      *
     */
    CompletableFuture<GetInstanceSqlOptimizeStatisticResponse> getInstanceSqlOptimizeStatistic(GetInstanceSqlOptimizeStatisticRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetKillInstanceSessionTaskResultResponse> getKillInstanceSessionTaskResult(GetKillInstanceSessionTaskResultRequest request);

    /**
      * *   This operation is applicable only to MongoDB instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
      *
     */
    CompletableFuture<GetMongoDBCurrentOpResponse> getMongoDBCurrentOp(GetMongoDBCurrentOpRequest request);

    /**
      * >  GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a request ID. You need to use the request ID to initiate requests until the value of the **isFinish** field in the returned results is **true**, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and PolarDB-X 2.0 instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetMySQLAllSessionAsyncResponse> getMySQLAllSessionAsync(GetMySQLAllSessionAsyncRequest request);

    /**
      * We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the [heatmap](~~470302~~) feature of Database Autonomy Service (DAS) to query the data.
      *
     */
    CompletableFuture<GetPartitionsHeatmapResponse> getPartitionsHeatmap(GetPartitionsHeatmapRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
     */
    CompletableFuture<GetPfsMetricTrendsResponse> getPfsMetricTrends(GetPfsMetricTrendsRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
     */
    CompletableFuture<GetPfsSqlSampleResponse> getPfsSqlSample(GetPfsSqlSampleRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
     */
    CompletableFuture<GetPfsSqlSummariesResponse> getPfsSqlSummaries(GetPfsSqlSummariesRequest request);

    /**
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeDataStatsResponse> getQueryOptimizeDataStats(GetQueryOptimizeDataStatsRequest request);

    /**
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeDataTopResponse> getQueryOptimizeDataTop(GetQueryOptimizeDataTopRequest request);

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeDataTrendResponse> getQueryOptimizeDataTrend(GetQueryOptimizeDataTrendRequest request);

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeExecErrorSampleResponse> getQueryOptimizeExecErrorSample(GetQueryOptimizeExecErrorSampleRequest request);

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeExecErrorStatsResponse> getQueryOptimizeExecErrorStats(GetQueryOptimizeExecErrorStatsRequest request);

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeRuleListResponse> getQueryOptimizeRuleList(GetQueryOptimizeRuleListRequest request);

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeShareUrlResponse> getQueryOptimizeShareUrl(GetQueryOptimizeShareUrlRequest request);

    /**
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeSolutionResponse> getQueryOptimizeSolution(GetQueryOptimizeSolutionRequest request);

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
     */
    CompletableFuture<GetQueryOptimizeTagResponse> getQueryOptimizeTag(GetQueryOptimizeTagRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB for Redis instances.
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.
      *
     */
    CompletableFuture<GetRedisAllSessionResponse> getRedisAllSession(GetRedisAllSessionRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (Compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
     */
    CompletableFuture<GetRequestDiagnosisPageResponse> getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
     */
    CompletableFuture<GetRequestDiagnosisResultResponse> getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request);

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<GetRunningSqlConcurrencyControlRulesResponse> getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request);

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<GetSqlConcurrencyControlKeywordsFromSqlTextResponse> getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request);

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
     */
    CompletableFuture<GetSqlConcurrencyControlRulesHistoryResponse> getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request);

    /**
      * The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see [Automatic SQL optimization](~~167895~~).
      * >  You can call this operation to query only the optimization suggestions that are automatically generated by the SQL diagnostics feature.
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetSqlOptimizeAdviceResponse> getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request);

    /**
      * >  The physical file size indicates the actual size of an obtained file. Only specific deployment modes of database instances support the display of physical file sizes. The statistics on tables are obtained from `information_schema.tables`. Statistics in MySQL are not updated in real time. Therefore, the statistics may be different from the physical file sizes. If you want to obtain the latest data, you can execute the `ANALYZE TABLE` statement on the relevant tables during off-peak hours.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.
      * *   For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetStorageAnalysisResultResponse> getStorageAnalysisResult(GetStorageAnalysisResultRequest request);

    /**
      * *   This operation is applicable only to ApsaraDB for Redis.
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<KillInstanceAllSessionResponse> killInstanceAllSession(KillInstanceAllSessionRequest request);

    /**
      * You can call this operation to modify the following auto scaling configurations of an instance: **auto scaling for specifications**, **automatic storage expansion**, **automatic bandwidth adjustment**, and **auto scaling for resources**.
      * *   You can modify the configurations of the **auto scaling feature for specifications** for the following types of database instances:
      *     *   PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   You can modify the configurations of the **automatic storage expansion** feature for the following types of database instances:
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see [Automatic space expansion](~~173345~~).
      * *   You can modify the configurations of the **automatic bandwidth adjustment** feature for the following types of database instances:
      *     *   ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see [Automatic bandwidth adjustment](~~216312~~).
      * *   You can modify the configurations of the **auto scaling feature for resources** for the following types of database instances:
      *     *   General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   By default, the latest version of DAS Enterprise Edition that supports the database instance is enabled. For information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see [Editions and supported features](~~156204~~).
      *
     */
    CompletableFuture<ModifySqlLogConfigResponse> modifySqlLogConfig(ModifySqlLogConfigRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<RunCloudBenchTaskResponse> runCloudBenchTask(RunCloudBenchTaskRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.
      * *   Make sure that the database instance that you want to manage is connected to DAS.
      *
     */
    CompletableFuture<SetEventSubscriptionResponse> setEventSubscription(SetEventSubscriptionRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<StopCloudBenchTaskResponse> stopCloudBenchTask(StopCloudBenchTaskRequest request);

    CompletableFuture<SyncHDMAliyunResourceResponse> syncHDMAliyunResource(SyncHDMAliyunResourceRequest request);

    /**
      * >  Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of **ResultId** returned in the response to re-initiate the call until the value of **isFinish** is **true**.**** In this case, you must call this operation at least twice.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instances must be an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   DAS Enterprise Edition must be enabled for the database instance. You can call the call [DescribeInstanceDasPro](~~413866~~) operation to query whether DAS Enterprise Edition is enabled.
      * *   The database instance has four or more CPU cores, and **innodb_file_per_table** is set to **ON**.
      *
     */
    CompletableFuture<UpdateAutoResourceOptimizeRulesAsyncResponse> updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   DAS Enterprise Edition must be enabled for the database instance that you want to manage. To enable DAS Enterprise Edition for a database instance, you can call the [EnableDasPro](~~411645~~) operation.
      * *   The autonomy service must be enabled for the database instance that you want to manage. For more information, see [Autonomy center](~~152139~~).
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition
      *     *   PolarDB for MySQL Cluster Edition or X-Engine Edition
      *
     */
    CompletableFuture<UpdateAutoSqlOptimizeStatusResponse> updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request);

    /**
      * >  Asynchronous calls do not immediately return the complete results. You must use the value of **ResultId** returned in the response to re-initiate the call until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The autonomy service must be enabled for the database instance that you want to manage. For more information, see [Autonomy center](~~152139~~).
      * *   The database instance that you want to manage must be of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0
      *     *   PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, or PolarDB for MySQL X-Engine Edition that runs MySQL 8.0
      *
     */
    CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request);

}
