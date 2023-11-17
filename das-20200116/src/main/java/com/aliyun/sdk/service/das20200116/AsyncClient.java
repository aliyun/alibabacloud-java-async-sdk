// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.das20200116.models.*;
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. You use an ADAM stress testing task to check whether you need to scale up or scale out your database instance to handle workloads during peak hours. For more information, see [Intelligent Stress Testing](~~155068~~).
      * Make sure that your database instances meet the following requirements:
      * *   The source instance supports the following database engines: ApsaraDB RDS for MySQL on High-availability Edition or Enterprise Edition, and PolarDB for MySQL on Cluster Edition or X-Engine.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The database instance is connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is activated for the source and destination database instances. For more information, see [DAS Professional Edition](~~190912~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~). Before you call this API operation, make sure that your database instances meet the following requirements:
      * *   The source database instance must be an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition or X-Engine Edition instance.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The source instance and the destination instance are connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is enabled for the source instance and the destination instance. For more information, see [DAS Professional Edition](~~190912~~).
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
      *     *   RDS MySQL
      *     *   RDS PostgreSQL
      *     *   RDS SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (Compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For information about how to update the minor engine version, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
     */
    CompletableFuture<CreateRequestDiagnosisResponse> createRequestDiagnosis(CreateRequestDiagnosisRequest request);

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
      * *   You can query only the history of automatic performance scaling of ApsaraDB RDS for MySQL instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
      *
     */
    CompletableFuture<DescribeAutoScalingHistoryResponse> describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
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
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<DescribeInstanceDasProResponse> describeInstanceDasPro(DescribeInstanceDasProRequest request);

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
      * *   For information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which DAS Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestListByCodeResponse> getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request);

    /**
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestStatByCodeResponse> getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request);

    /**
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetAsyncErrorRequestStatResultResponse> getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance for which you want to query automatic fragment recycling rules is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
      *
     */
    CompletableFuture<GetAutoResourceOptimizeRulesResponse> getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0
      *     *   PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, or PolarDB for MySQL X-Engine Edition that runs MySQL 8.0.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
     */
    CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request);

    /**
      * *   For information about databases that are supported, see [Overview](~~190912~~).
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<GetDasProServiceUsageResponse> getDasProServiceUsage(GetDasProServiceUsageRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL database or a PolarDB for MySQL database in the China (Shanghai) region is connected to DAS.
      * *   The new SQL Explorer and Audit feature is enabled for the database instance. For more information, see the [Enable the SQL Explorer and Audit feature](~~92561~~) section of the "Overview" topic.
      * >  You can query only the data that is generated after the new SQL Explorer and Audit feature is enabled. The start time can be up to seven days earlier than the current time. The interval between the start time and the end time cannot exceed 24 hours.
      *
     */
    CompletableFuture<GetDasSQLLogHotDataResponse> getDasSQLLogHotData(GetDasSQLLogHotDataRequest request);

    CompletableFuture<GetEndpointSwitchTaskResponse> getEndpointSwitchTask(GetEndpointSwitchTaskRequest request);

    /**
      * >  The complete query results are not immediately returned after an asynchronous request is sent. If the value of **isFinish** is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  Asynchronous calls do not immediately return the complete results. You must use the value of **ResultId** returned in the response to re-initiate the call. The complete results are returned only if the value of **IsFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
     */
    CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request);

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
     */
    CompletableFuture<RunCloudBenchTaskResponse> runCloudBenchTask(RunCloudBenchTaskRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
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
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   DAS Professional Edition is enabled for the database instance. You can call the [DescribeInstanceDasPro](~~413866~~) operation to check whether DAS Professional Edition is enabled for a database instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
      *
     */
    CompletableFuture<UpdateAutoResourceOptimizeRulesAsyncResponse> updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   DAS Professional Edition is enabled for the database instance that you want to manage. To enable DAS Professional Edition for a database instance, you can call the [EnableDasPro](~~411645~~) operation.
      * *   The autonomy service is enabled for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL High-availability Edition and Enterprise Edition
      *     *   PolarDB for MySQL Cluster Edition and X-Engine Edition
      *
     */
    CompletableFuture<UpdateAutoSqlOptimizeStatusResponse> updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request);

    /**
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   Enable Autonomy Service is turned on for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, and PolarDB for MySQL X-Engine Edition that runs MySQL 8.0.
      *
     */
    CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request);

}
