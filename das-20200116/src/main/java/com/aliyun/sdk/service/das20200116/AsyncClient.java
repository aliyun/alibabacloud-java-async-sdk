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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of AddHDMInstance  AddHDMInstanceRequest
     * @return AddHDMInstanceResponse
     */
    CompletableFuture<AddHDMInstanceResponse> addHDMInstance(AddHDMInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>You can call this operation to analyze the data structures of ApsaraDB for Redis and the following self-developed data structures of Tair: TairString, TairHash, TairGIS, TairBloom, TairDoc, TairCpc, and TairZset. Other self-developed Tair data structures are not supported.</li>
     * <li>If the specifications of the database instance that you want to analyze are changed, the backup file generated before the specification change cannot be analyzed.</li>
     * <li>Tair ESSD/SSD-based instances are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCacheAnalysisJob  CreateCacheAnalysisJobRequest
     * @return CreateCacheAnalysisJobResponse
     */
    CompletableFuture<CreateCacheAnalysisJobResponse> createCacheAnalysisJob(CreateCacheAnalysisJobRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>. Before you call this API operation, make sure that your database instances meet the following requirements:</p>
     * <ul>
     * <li>The source database instance is an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition cluster.</li>
     * <li>The destination database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</li>
     * <li>The source and destination database instances are connected to DAS. For information about how to connect database instances to DAS, see <a href="https://help.aliyun.com/document_detail/65405.html">Connect an Alibaba Cloud database instance to DAS</a>.</li>
     * <li>DAS Enterprise Edition is enabled for the source and destination database instances. For more information, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCloudBenchTasks  CreateCloudBenchTasksRequest
     * @return CreateCloudBenchTasksResponse
     */
    CompletableFuture<CreateCloudBenchTasksResponse> createCloudBenchTasks(CreateCloudBenchTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDiagnosticReport  CreateDiagnosticReportRequest
     * @return CreateDiagnosticReportResponse
     */
    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKillInstanceSessionTask  CreateKillInstanceSessionTaskRequest
     * @return CreateKillInstanceSessionTaskResponse
     */
    CompletableFuture<CreateKillInstanceSessionTaskResponse> createKillInstanceSessionTask(CreateKillInstanceSessionTaskRequest request);

    /**
     * @param request the request parameters of CreateKillInstanceSessionTaskWithMaintainUser  CreateKillInstanceSessionTaskWithMaintainUserRequest
     * @return CreateKillInstanceSessionTaskWithMaintainUserResponse
     */
    CompletableFuture<CreateKillInstanceSessionTaskWithMaintainUserResponse> createKillInstanceSessionTaskWithMaintainUser(CreateKillInstanceSessionTaskWithMaintainUserRequest request);

    /**
     * @param request the request parameters of CreateLatestDeadLockAnalysis  CreateLatestDeadLockAnalysisRequest
     * @return CreateLatestDeadLockAnalysisResponse
     */
    CompletableFuture<CreateLatestDeadLockAnalysisResponse> createLatestDeadLockAnalysis(CreateLatestDeadLockAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</p>
     * <ul>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateQueryOptimizeTag  CreateQueryOptimizeTagRequest
     * @return CreateQueryOptimizeTagResponse
     */
    CompletableFuture<CreateQueryOptimizeTagResponse> createQueryOptimizeTag(CreateQueryOptimizeTagRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p> The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRequestDiagnosis  CreateRequestDiagnosisRequest
     * @return CreateRequestDiagnosisResponse
     */
    CompletableFuture<CreateRequestDiagnosisResponse> createRequestDiagnosis(CreateRequestDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>You can create an offline task only for database instances for which DAS Enterprise Edition V2 or V3 is enabled. For more information about the databases and regions that are supported by various versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSqlLogTask  CreateSqlLogTaskRequest
     * @return CreateSqlLogTaskResponse
     */
    CompletableFuture<CreateSqlLogTaskResponse> createSqlLogTask(CreateSqlLogTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</p>
     * <ul>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateStorageAnalysisTask  CreateStorageAnalysisTaskRequest
     * @return CreateStorageAnalysisTaskResponse
     */
    CompletableFuture<CreateStorageAnalysisTaskResponse> createStorageAnalysisTask(CreateStorageAnalysisTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DeleteCloudBenchTask  DeleteCloudBenchTaskRequest
     * @return DeleteCloudBenchTaskResponse
     */
    CompletableFuture<DeleteCloudBenchTaskResponse> deleteCloudBenchTask(DeleteCloudBenchTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is used to delete the metadata of a DBGateway that is released in a stress testing task created by calling the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.<blockquote>
     * <p> If the heartbeat is lost between a DBGateway and the access point for more than 20 seconds, the DBGateway is considered stopped.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteStopGateway  DeleteStopGatewayRequest
     * @return DeleteStopGatewayResponse
     */
    CompletableFuture<DeleteStopGatewayResponse> deleteStopGateway(DeleteStopGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoScalingConfig  DescribeAutoScalingConfigRequest
     * @return DescribeAutoScalingConfigResponse
     */
    CompletableFuture<DescribeAutoScalingConfigResponse> describeAutoScalingConfig(DescribeAutoScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the history information about the automatic performance scaling only of ApsaraDB RDS for MySQL High-availability Edition instances.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoScalingHistory  DescribeAutoScalingHistoryRequest
     * @return DescribeAutoScalingHistoryResponse
     */
    CompletableFuture<DescribeAutoScalingHistoryResponse> describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.<blockquote>
     * <p> You can call this operation to query the top 500 keys in a cache analysis task.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCacheAnalysisJob  DescribeCacheAnalysisJobRequest
     * @return DescribeCacheAnalysisJobResponse
     */
    CompletableFuture<DescribeCacheAnalysisJobResponse> describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCacheAnalysisJobs  DescribeCacheAnalysisJobsRequest
     * @return DescribeCacheAnalysisJobsResponse
     */
    CompletableFuture<DescribeCacheAnalysisJobsResponse> describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudBenchTasks  DescribeCloudBenchTasksRequest
     * @return DescribeCloudBenchTasksResponse
     */
    CompletableFuture<DescribeCloudBenchTasksResponse> describeCloudBenchTasks(DescribeCloudBenchTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTask  DescribeCloudbenchTaskRequest
     * @return DescribeCloudbenchTaskResponse
     */
    CompletableFuture<DescribeCloudbenchTaskResponse> describeCloudbenchTask(DescribeCloudbenchTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTaskConfig  DescribeCloudbenchTaskConfigRequest
     * @return DescribeCloudbenchTaskConfigResponse
     */
    CompletableFuture<DescribeCloudbenchTaskConfigResponse> describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable to the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB for Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDiagnosticReportList  DescribeDiagnosticReportListRequest
     * @return DescribeDiagnosticReportListResponse
     */
    CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation sorts list, hash, set, and zset keys based on the number of elements contained in these keys. The top three keys that contain the most elements are considered large keys. If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for ApsaraDB for Redis instances that meet the following requirements:<ul>
     * <li>The instance is a Community Edition instance that uses a major version of 5.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.<blockquote>
     * <p> For information about how to query and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a> and <a href="https://help.aliyun.com/document_detail/95268.html">DescribeEngineVersion</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHotBigKeys  DescribeHotBigKeysRequest
     * @return DescribeHotBigKeysResponse
     */
    CompletableFuture<DescribeHotBigKeysResponse> describeHotBigKeys(DescribeHotBigKeysRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis instances that meet the following requirements:<ul>
     * <li>The ApsaraDB for Redis instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.<blockquote>
     * <p> For more information about how to query and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a> and <a href="https://help.aliyun.com/document_detail/95268.html">DescribeEngineVersion</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHotKeys  DescribeHotKeysRequest
     * @return DescribeHotKeysResponse
     */
    CompletableFuture<DescribeHotKeysResponse> describeHotKeys(DescribeHotKeysRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</p>
     * <ul>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation to query the DAS Enterprise Edition configurations of a database instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceDasPro  DescribeInstanceDasProRequest
     * @return DescribeInstanceDasProResponse
     */
    CompletableFuture<DescribeInstanceDasProResponse> describeInstanceDasPro(DescribeInstanceDasProRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogHistogramAsync  DescribeSlowLogHistogramAsyncRequest
     * @return DescribeSlowLogHistogramAsyncResponse
     */
    CompletableFuture<DescribeSlowLogHistogramAsyncResponse> describeSlowLogHistogramAsync(DescribeSlowLogHistogramAsyncRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogStatistic  DescribeSlowLogStatisticRequest
     * @return DescribeSlowLogStatisticResponse
     */
    CompletableFuture<DescribeSlowLogStatisticResponse> describeSlowLogStatistic(DescribeSlowLogStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogConfig  DescribeSqlLogConfigRequest
     * @return DescribeSqlLogConfigResponse
     */
    CompletableFuture<DescribeSqlLogConfigResponse> describeSqlLogConfig(DescribeSqlLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogRecords  DescribeSqlLogRecordsRequest
     * @return DescribeSqlLogRecordsResponse
     */
    CompletableFuture<DescribeSqlLogRecordsResponse> describeSqlLogRecords(DescribeSqlLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogStatistic  DescribeSqlLogStatisticRequest
     * @return DescribeSqlLogStatisticResponse
     */
    CompletableFuture<DescribeSqlLogStatisticResponse> describeSqlLogStatistic(DescribeSqlLogStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogTask  DescribeSqlLogTaskRequest
     * @return DescribeSqlLogTaskResponse
     */
    CompletableFuture<DescribeSqlLogTaskResponse> describeSqlLogTask(DescribeSqlLogTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogTasks  DescribeSqlLogTasksRequest
     * @return DescribeSqlLogTasksResponse
     */
    CompletableFuture<DescribeSqlLogTasksResponse> describeSqlLogTasks(DescribeSqlLogTasksRequest request);

    /**
     * <b>description</b> :
     * <p>The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for an ApsaraDB for Redis instance of one of the following versions:<ul>
     * <li>The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.<blockquote>
     * <p> For information about how to query and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a> and <a href="https://help.aliyun.com/document_detail/95268.html">DescribeEngineVersion</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTopBigKeys  DescribeTopBigKeysRequest
     * @return DescribeTopBigKeysResponse
     */
    CompletableFuture<DescribeTopBigKeysResponse> describeTopBigKeys(DescribeTopBigKeysRequest request);

    /**
     * <b>description</b> :
     * <p>If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for an ApsaraDB for Redis instance of one of the following versions:<ul>
     * <li>The instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.<blockquote>
     * <p> For information about how to query and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/95268.html">DescribeEngineVersion</a> and <a href="https://help.aliyun.com/document_detail/129381.html">ModifyInstanceMinorVersion</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTopHotKeys  DescribeTopHotKeysRequest
     * @return DescribeTopHotKeysResponse
     */
    CompletableFuture<DescribeTopHotKeysResponse> describeTopHotKeys(DescribeTopHotKeysRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DisableAllSqlConcurrencyControlRules  DisableAllSqlConcurrencyControlRulesRequest
     * @return DisableAllSqlConcurrencyControlRulesResponse
     */
    CompletableFuture<DisableAllSqlConcurrencyControlRulesResponse> disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request);

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * @param request the request parameters of DisableAutoResourceOptimizeRules  DisableAutoResourceOptimizeRulesRequest
     * @return DisableAutoResourceOptimizeRulesResponse
     */
    CompletableFuture<DisableAutoResourceOptimizeRulesResponse> disableAutoResourceOptimizeRules(DisableAutoResourceOptimizeRulesRequest request);

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * @param request the request parameters of DisableAutoThrottleRules  DisableAutoThrottleRulesRequest
     * @return DisableAutoThrottleRulesResponse
     */
    CompletableFuture<DisableAutoThrottleRulesResponse> disableAutoThrottleRules(DisableAutoThrottleRulesRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</p>
     * <ul>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to enable or disable DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableDasPro  DisableDasProRequest
     * @return DisableDasProResponse
     */
    CompletableFuture<DisableDasProResponse> disableDasPro(DisableDasProRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableInstanceDasConfig  DisableInstanceDasConfigRequest
     * @return DisableInstanceDasConfigResponse
     */
    CompletableFuture<DisableInstanceDasConfigResponse> disableInstanceDasConfig(DisableInstanceDasConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DisableSqlConcurrencyControl  DisableSqlConcurrencyControlRequest
     * @return DisableSqlConcurrencyControlResponse
     */
    CompletableFuture<DisableSqlConcurrencyControlResponse> disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</p>
     * <ul>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to activate or deactivate DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableDasPro  EnableDasProRequest
     * @return EnableDasProResponse
     */
    CompletableFuture<EnableDasProResponse> enableDasPro(EnableDasProRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of EnableSqlConcurrencyControl  EnableSqlConcurrencyControlRequest
     * @return EnableSqlConcurrencyControlResponse
     */
    CompletableFuture<EnableSqlConcurrencyControlResponse> enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetAsyncErrorRequestListByCode is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the <strong>isFinish</strong> parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the <strong>isFinish</strong> parameter is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Enable and manage DAS Economy Edition and DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAsyncErrorRequestListByCode  GetAsyncErrorRequestListByCodeRequest
     * @return GetAsyncErrorRequestListByCodeResponse
     */
    CompletableFuture<GetAsyncErrorRequestListByCodeResponse> getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetAsyncErrorRequestStatByCode is an asynchronous operation After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAsyncErrorRequestStatByCode  GetAsyncErrorRequestStatByCodeRequest
     * @return GetAsyncErrorRequestStatByCodeResponse
     */
    CompletableFuture<GetAsyncErrorRequestStatByCodeResponse> getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetAsyncErrorRequestStatResult is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAsyncErrorRequestStatResult  GetAsyncErrorRequestStatResultRequest
     * @return GetAsyncErrorRequestStatResultResponse
     */
    CompletableFuture<GetAsyncErrorRequestStatResultResponse> getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAutoIncrementUsageStatistic  GetAutoIncrementUsageStatisticRequest
     * @return GetAutoIncrementUsageStatisticResponse
     */
    CompletableFuture<GetAutoIncrementUsageStatisticResponse> getAutoIncrementUsageStatistic(GetAutoIncrementUsageStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance is an ApsaraDB RDS for MySQL instance of High-availability Edition.</li>
     * <li>The database instance has four or more cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAutoResourceOptimizeRules  GetAutoResourceOptimizeRulesRequest
     * @return GetAutoResourceOptimizeRulesResponse
     */
    CompletableFuture<GetAutoResourceOptimizeRulesResponse> getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAutoThrottleRules  GetAutoThrottleRulesRequest
     * @return GetAutoThrottleRulesResponse
     */
    CompletableFuture<GetAutoThrottleRulesResponse> getAutoThrottleRules(GetAutoThrottleRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p> You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAutonomousNotifyEventContent  GetAutonomousNotifyEventContentRequest
     * @return GetAutonomousNotifyEventContentResponse
     */
    CompletableFuture<GetAutonomousNotifyEventContentResponse> getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p> You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetAutonomousNotifyEventsInRange  GetAutonomousNotifyEventsInRangeRequest
     * @return GetAutonomousNotifyEventsInRangeResponse
     */
    CompletableFuture<GetAutonomousNotifyEventsInRangeResponse> getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for SQL Server instances.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetBlockingDetailList  GetBlockingDetailListRequest
     * @return GetBlockingDetailListResponse
     */
    CompletableFuture<GetBlockingDetailListResponse> getBlockingDetailList(GetBlockingDetailListRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDBInstanceConnectivityDiagnosis  GetDBInstanceConnectivityDiagnosisRequest
     * @return GetDBInstanceConnectivityDiagnosisResponse
     */
    CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>  For information about the database instances that support this operation, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778836.html">DescribeSqlLogStatistic</a> operation to query the data statistics of a database instance for which DAS Enterprise Edition is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDasProServiceUsage  GetDasProServiceUsageRequest
     * @return GetDasProServiceUsageResponse
     */
    CompletableFuture<GetDasProServiceUsageResponse> getDasProServiceUsage(GetDasProServiceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable to PolarDB for MySQL, ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQL Server.<blockquote>
     * <p> The beginning of the time range to query can be up to seven days earlier than the current time. The interval between the start time and the end time cannot exceed one day. This operation can return a maximum of 10,000 entries.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDasSQLLogHotData  GetDasSQLLogHotDataRequest
     * @return GetDasSQLLogHotDataResponse
     */
    CompletableFuture<GetDasSQLLogHotDataResponse> getDasSQLLogHotData(GetDasSQLLogHotDataRequest request);

    /**
     * @param request the request parameters of GetDeadLockDetail  GetDeadLockDetailRequest
     * @return GetDeadLockDetailResponse
     */
    CompletableFuture<GetDeadLockDetailResponse> getDeadLockDetail(GetDeadLockDetailRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for SQL Server instances.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeadLockDetailList  GetDeadLockDetailListRequest
     * @return GetDeadLockDetailListResponse
     */
    CompletableFuture<GetDeadLockDetailListResponse> getDeadLockDetailList(GetDeadLockDetailListRequest request);

    /**
     * @param request the request parameters of GetDeadLockHistory  GetDeadLockHistoryRequest
     * @return GetDeadLockHistoryResponse
     */
    CompletableFuture<GetDeadLockHistoryResponse> getDeadLockHistory(GetDeadLockHistoryRequest request);

    /**
     * @param request the request parameters of GetDeadlockHistogram  GetDeadlockHistogramRequest
     * @return GetDeadlockHistogramResponse
     */
    CompletableFuture<GetDeadlockHistogramResponse> getDeadlockHistogram(GetDeadlockHistogramRequest request);

    /**
     * @param request the request parameters of GetEndpointSwitchTask  GetEndpointSwitchTaskRequest
     * @return GetEndpointSwitchTaskResponse
     */
    CompletableFuture<GetEndpointSwitchTaskResponse> getEndpointSwitchTask(GetEndpointSwitchTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetErrorRequestSample is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetErrorRequestSample  GetErrorRequestSampleRequest
     * @return GetErrorRequestSampleResponse
     */
    CompletableFuture<GetErrorRequestSampleResponse> getErrorRequestSample(GetErrorRequestSampleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * @param request the request parameters of GetEventSubscription  GetEventSubscriptionRequest
     * @return GetEventSubscriptionResponse
     */
    CompletableFuture<GetEventSubscriptionResponse> getEventSubscription(GetEventSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFullRequestOriginStatByInstanceId  GetFullRequestOriginStatByInstanceIdRequest
     * @return GetFullRequestOriginStatByInstanceIdResponse
     */
    CompletableFuture<GetFullRequestOriginStatByInstanceIdResponse> getFullRequestOriginStatByInstanceId(GetFullRequestOriginStatByInstanceIdRequest request);

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about the database engines that support SQL Explorer, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFullRequestSampleByInstanceId  GetFullRequestSampleByInstanceIdRequest
     * @return GetFullRequestSampleByInstanceIdResponse
     */
    CompletableFuture<GetFullRequestSampleByInstanceIdResponse> getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetFullRequestStatResultByInstanceId is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the isFinish parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the isFinish parameter is <strong>true</strong>, the complete results are returned.
     * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFullRequestStatResultByInstanceId  GetFullRequestStatResultByInstanceIdRequest
     * @return GetFullRequestStatResultByInstanceIdResponse
     */
    CompletableFuture<GetFullRequestStatResultByInstanceIdResponse> getFullRequestStatResultByInstanceId(GetFullRequestStatResultByInstanceIdRequest request);

    /**
     * @param request the request parameters of GetHDMAliyunResourceSyncResult  GetHDMAliyunResourceSyncResultRequest
     * @return GetHDMAliyunResourceSyncResultResponse
     */
    CompletableFuture<GetHDMAliyunResourceSyncResultResponse> getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request);

    /**
     * @param request the request parameters of GetHDMLastAliyunResourceSyncResult  GetHDMLastAliyunResourceSyncResultRequest
     * @return GetHDMLastAliyunResourceSyncResultResponse
     */
    CompletableFuture<GetHDMLastAliyunResourceSyncResultResponse> getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see <a href="https://help.aliyun.com/document_detail/205659.html">Inspection and scoring</a>.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.</li>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of DAS SDK must be V1.0.3 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceInspections  GetInstanceInspectionsRequest
     * @return GetInstanceInspectionsResponse
     */
    CompletableFuture<GetInstanceInspectionsResponse> getInstanceInspections(GetInstanceInspectionsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for SQL Server instances.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceMissingIndexList  GetInstanceMissingIndexListRequest
     * @return GetInstanceMissingIndexListResponse
     */
    CompletableFuture<GetInstanceMissingIndexListResponse> getInstanceMissingIndexList(GetInstanceMissingIndexListRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceSqlOptimizeStatistic  GetInstanceSqlOptimizeStatisticRequest
     * @return GetInstanceSqlOptimizeStatisticResponse
     */
    CompletableFuture<GetInstanceSqlOptimizeStatisticResponse> getInstanceSqlOptimizeStatistic(GetInstanceSqlOptimizeStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetKillInstanceSessionTaskResult  GetKillInstanceSessionTaskResultRequest
     * @return GetKillInstanceSessionTaskResultResponse
     */
    CompletableFuture<GetKillInstanceSessionTaskResultResponse> getKillInstanceSessionTaskResult(GetKillInstanceSessionTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to MongoDB instances.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMongoDBCurrentOp  GetMongoDBCurrentOpRequest
     * @return GetMongoDBCurrentOpResponse
     */
    CompletableFuture<GetMongoDBCurrentOpResponse> getMongoDBCurrentOp(GetMongoDBCurrentOpRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a request ID. You need to use the request ID to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and PolarDB-X 2.0 instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMySQLAllSessionAsync  GetMySQLAllSessionAsyncRequest
     * @return GetMySQLAllSessionAsyncResponse
     */
    CompletableFuture<GetMySQLAllSessionAsyncResponse> getMySQLAllSessionAsync(GetMySQLAllSessionAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the <a href="https://help.aliyun.com/document_detail/470302.html">heatmap</a> feature of Database Autonomy Service (DAS) to query the data.</p>
     * 
     * @param request the request parameters of GetPartitionsHeatmap  GetPartitionsHeatmapRequest
     * @return GetPartitionsHeatmapResponse
     */
    CompletableFuture<GetPartitionsHeatmapResponse> getPartitionsHeatmap(GetPartitionsHeatmapRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPfsMetricTrends  GetPfsMetricTrendsRequest
     * @return GetPfsMetricTrendsResponse
     */
    CompletableFuture<GetPfsMetricTrendsResponse> getPfsMetricTrends(GetPfsMetricTrendsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPfsSqlSample  GetPfsSqlSampleRequest
     * @return GetPfsSqlSampleResponse
     */
    CompletableFuture<GetPfsSqlSampleResponse> getPfsSqlSample(GetPfsSqlSampleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPfsSqlSummaries  GetPfsSqlSummariesRequest
     * @return GetPfsSqlSummariesResponse
     */
    CompletableFuture<GetPfsSqlSummariesResponse> getPfsSqlSummaries(GetPfsSqlSummariesRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</p>
     * <ul>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeDataStats  GetQueryOptimizeDataStatsRequest
     * @return GetQueryOptimizeDataStatsResponse
     */
    CompletableFuture<GetQueryOptimizeDataStatsResponse> getQueryOptimizeDataStats(GetQueryOptimizeDataStatsRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</p>
     * <ul>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeDataTop  GetQueryOptimizeDataTopRequest
     * @return GetQueryOptimizeDataTopResponse
     */
    CompletableFuture<GetQueryOptimizeDataTopResponse> getQueryOptimizeDataTop(GetQueryOptimizeDataTopRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</p>
     * <ul>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeDataTrend  GetQueryOptimizeDataTrendRequest
     * @return GetQueryOptimizeDataTrendResponse
     */
    CompletableFuture<GetQueryOptimizeDataTrendResponse> getQueryOptimizeDataTrend(GetQueryOptimizeDataTrendRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</p>
     * <ul>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeExecErrorSample  GetQueryOptimizeExecErrorSampleRequest
     * @return GetQueryOptimizeExecErrorSampleResponse
     */
    CompletableFuture<GetQueryOptimizeExecErrorSampleResponse> getQueryOptimizeExecErrorSample(GetQueryOptimizeExecErrorSampleRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</p>
     * <ul>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeExecErrorStats  GetQueryOptimizeExecErrorStatsRequest
     * @return GetQueryOptimizeExecErrorStatsResponse
     */
    CompletableFuture<GetQueryOptimizeExecErrorStatsResponse> getQueryOptimizeExecErrorStats(GetQueryOptimizeExecErrorStatsRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</p>
     * <ul>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeRuleList  GetQueryOptimizeRuleListRequest
     * @return GetQueryOptimizeRuleListResponse
     */
    CompletableFuture<GetQueryOptimizeRuleListResponse> getQueryOptimizeRuleList(GetQueryOptimizeRuleListRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</p>
     * <ul>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeShareUrl  GetQueryOptimizeShareUrlRequest
     * @return GetQueryOptimizeShareUrlResponse
     */
    CompletableFuture<GetQueryOptimizeShareUrlResponse> getQueryOptimizeShareUrl(GetQueryOptimizeShareUrlRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</p>
     * <ul>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeSolution  GetQueryOptimizeSolutionRequest
     * @return GetQueryOptimizeSolutionResponse
     */
    CompletableFuture<GetQueryOptimizeSolutionResponse> getQueryOptimizeSolution(GetQueryOptimizeSolutionRequest request);

    /**
     * <b>description</b> :
     * <p>  If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</p>
     * <ul>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetQueryOptimizeTag  GetQueryOptimizeTagRequest
     * @return GetQueryOptimizeTagResponse
     */
    CompletableFuture<GetQueryOptimizeTagResponse> getQueryOptimizeTag(GetQueryOptimizeTagRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB for Redis instances.</p>
     * <ul>
     * <li>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.<blockquote>
     * <p> This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetRedisAllSession  GetRedisAllSessionRequest
     * @return GetRedisAllSessionResponse
     */
    CompletableFuture<GetRedisAllSessionResponse> getRedisAllSession(GetRedisAllSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p> The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetRequestDiagnosisPage  GetRequestDiagnosisPageRequest
     * @return GetRequestDiagnosisPageResponse
     */
    CompletableFuture<GetRequestDiagnosisPageResponse> getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>You cannot call this operation to query the diagnostic result of the automatic SQL optimization feature.</li>
     * <li>This operation is applicable to the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p> If your instance is an ApsaraDB RDS for PostgreSQL instance, make sure that the minor engine version of your instance is 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetRequestDiagnosisResult  GetRequestDiagnosisResultRequest
     * @return GetRequestDiagnosisResultResponse
     */
    CompletableFuture<GetRequestDiagnosisResultResponse> getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of GetRunningSqlConcurrencyControlRules  GetRunningSqlConcurrencyControlRulesRequest
     * @return GetRunningSqlConcurrencyControlRulesResponse
     */
    CompletableFuture<GetRunningSqlConcurrencyControlRulesResponse> getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of GetSqlConcurrencyControlKeywordsFromSqlText  GetSqlConcurrencyControlKeywordsFromSqlTextRequest
     * @return GetSqlConcurrencyControlKeywordsFromSqlTextResponse
     */
    CompletableFuture<GetSqlConcurrencyControlKeywordsFromSqlTextResponse> getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of GetSqlConcurrencyControlRulesHistory  GetSqlConcurrencyControlRulesHistoryRequest
     * @return GetSqlConcurrencyControlRulesHistoryResponse
     */
    CompletableFuture<GetSqlConcurrencyControlRulesHistoryResponse> getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see <a href="https://help.aliyun.com/document_detail/167895.html">Automatic SQL optimization</a>.</p>
     * <blockquote>
     * <p> You can call this operation to query only the optimization suggestions that are automatically generated by the SQL diagnostics feature.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSqlOptimizeAdvice  GetSqlOptimizeAdviceRequest
     * @return GetSqlOptimizeAdviceResponse
     */
    CompletableFuture<GetSqlOptimizeAdviceResponse> getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The physical file size indicates the actual size of an obtained file. Only specific deployment modes of database instances support the display of physical file sizes. The statistics on tables are obtained from <code>information_schema.tables</code>. Statistics in MySQL are not updated in real time. Therefore, the statistics may be different from the physical file sizes. If you want to obtain the latest data, you can execute the <code>ANALYZE TABLE</code> statement on the relevant tables during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetStorageAnalysisResult  GetStorageAnalysisResultRequest
     * @return GetStorageAnalysisResultResponse
     */
    CompletableFuture<GetStorageAnalysisResultResponse> getStorageAnalysisResult(GetStorageAnalysisResultRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to ApsaraDB for Redis.</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of KillInstanceAllSession  KillInstanceAllSessionRequest
     * @return KillInstanceAllSessionResponse
     */
    CompletableFuture<KillInstanceAllSessionResponse> killInstanceAllSession(KillInstanceAllSessionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the following auto scaling configurations of an instance: <strong>auto scaling for specifications</strong>, <strong>automatic storage expansion</strong>, <strong>automatic bandwidth adjustment</strong>, and <strong>auto scaling for resources</strong>.</p>
     * <ul>
     * <li>You can modify the configurations of the <strong>auto scaling feature for specifications</strong> for the following types of database instances:<ul>
     * <li>PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic storage expansion</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/173345.html">Automatic space expansion</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic bandwidth adjustment</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/216312.html">Automatic bandwidth adjustment</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>auto scaling feature for resources</strong> for the following types of database instances:<ul>
     * <li>General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoScalingConfig  ModifyAutoScalingConfigRequest
     * @return ModifyAutoScalingConfigResponse
     */
    CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>By default, the latest version of DAS Enterprise Edition that supports the database instance is enabled. For information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySqlLogConfig  ModifySqlLogConfigRequest
     * @return ModifySqlLogConfigResponse
     */
    CompletableFuture<ModifySqlLogConfigResponse> modifySqlLogConfig(ModifySqlLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of RunCloudBenchTask  RunCloudBenchTaskRequest
     * @return RunCloudBenchTaskResponse
     */
    CompletableFuture<RunCloudBenchTaskResponse> runCloudBenchTask(RunCloudBenchTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>Make sure that the database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * @param request the request parameters of SetEventSubscription  SetEventSubscriptionRequest
     * @return SetEventSubscriptionResponse
     */
    CompletableFuture<SetEventSubscriptionResponse> setEventSubscription(SetEventSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.**** In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instances must be an ApsaraDB RDS for MySQL High-availability Edition instance.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance. You can call the call <a href="https://help.aliyun.com/document_detail/413866.html">DescribeInstanceDasPro</a> operation to query whether DAS Enterprise Edition is enabled.</li>
     * <li>The database instance has four or more CPU cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAutoResourceOptimizeRulesAsync  UpdateAutoResourceOptimizeRulesAsyncRequest
     * @return UpdateAutoResourceOptimizeRulesAsyncResponse
     */
    CompletableFuture<UpdateAutoResourceOptimizeRulesAsyncResponse> updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance that you want to manage. To enable DAS Enterprise Edition for a database instance, you can call the <a href="https://help.aliyun.com/document_detail/411645.html">EnableDasPro</a> operation.</li>
     * <li>The autonomy service must be enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition</li>
     * <li>PolarDB for MySQL Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAutoSqlOptimizeStatus  UpdateAutoSqlOptimizeStatusRequest
     * @return UpdateAutoSqlOptimizeStatusResponse
     */
    CompletableFuture<UpdateAutoSqlOptimizeStatusResponse> updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.**** In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The autonomy service must be enabled for the database instance that you want to manage. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAutoThrottleRulesAsync  UpdateAutoThrottleRulesAsyncRequest
     * @return UpdateAutoThrottleRulesAsyncResponse
     */
    CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request);

}
