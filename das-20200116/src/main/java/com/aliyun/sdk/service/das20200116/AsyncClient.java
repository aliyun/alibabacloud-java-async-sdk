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
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of AddHDMInstance  AddHDMInstanceRequest
     * @return AddHDMInstanceResponse
     */
    CompletableFuture<AddHDMInstanceResponse> addHDMInstance(AddHDMInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition activated support creating batch tasks. For databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * For more methods and examples of interacting with DAS Agent by using the Chat API, see <a href="https://www.alibabacloud.com/help/en/das/developer-reference/chat-api-best-practice">Best practices for DAS Agent interaction (integrating the Chat API)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of Chat  ChatRequest
     * @return ChatResponse
     */
    CompletableFuture<ChatResponse> chat(ChatRequest request);

    ResponseIterable<ChatResponseBody> chatWithResponseIterable(ChatRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only Redis data structures and the following Tair-developed data structures are supported for analysis: TairString, TairHash, TairGIS, TairBloom, TairDoc, TairCpc, and TairZset. Other Tair-developed data structures are not supported.</li>
     * <li>If the specifications of the target instance have been changed, backup files generated before the change cannot be analyzed.</li>
     * <li>Tair ESSD-based instances are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCacheAnalysisJob  CreateCacheAnalysisJobRequest
     * @return CreateCacheAnalysisJobResponse
     */
    CompletableFuture<CreateCacheAnalysisJobResponse> createCacheAnalysisJob(CreateCacheAnalysisJobRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing to help you verify whether your instance type needs to be scaled out to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>. The database must meet the following prerequisites:</p>
     * <ul>
     * <li>The source database only supports RDS MySQL High Availability Edition or RDS Enterprise Edition, and PolarDB MySQL cluster edition.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The instance is connected to DAS. For more information, see <a href="https://help.aliyun.com/document_detail/65405.html">Connect to Alibaba Cloud database instances</a>.</li>
     * <li>DAS Enterprise Edition must be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
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
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
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
     * <b>description</b> :
     * <p>This operation creates a recent deadlock analysis task. Database Autonomy Service (DAS) analyzes the most recent deadlock log returned by SHOW ENGINE INNODB STATUS. If multiple deadlocks have occurred, DAS analyzes only the most recent one. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Recent deadlock analysis</a>.
     * Before you begin, make sure the following prerequisites are met:</p>
     * <ul>
     * <li>The database engine is one of the following: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>If you use the China site (Chinese) or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLatestDeadLockAnalysis  CreateLatestDeadLockAnalysisRequest
     * @return CreateLatestDeadLockAnalysisResponse
     */
    CompletableFuture<CreateLatestDeadLockAnalysisResponse> createLatestDeadLockAnalysis(CreateLatestDeadLockAnalysisRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>RDS PostgreSQL</li>
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
     * <p>The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
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
     * <p>Before you begin:</p>
     * <ul>
     * <li>If you use the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition activated support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Limits:
     * The maximum number of concurrent executions is 10.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityIPGroup  CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     */
    CompletableFuture<CreateSecurityIPGroupResponse> createSecurityIPGroup(CreateSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When you call DAS operations by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition enabled support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Rate limit:
     * The maximum number of concurrent tasks is 10.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSqlLogTask  CreateSqlLogTaskRequest
     * @return CreateSqlLogTaskResponse
     */
    CompletableFuture<CreateSqlLogTaskResponse> createSqlLogTask(CreateSqlLogTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
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
     * <p>Call this API to delete a stress testing task. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DeleteCloudBenchTask  DeleteCloudBenchTaskRequest
     * @return DeleteCloudBenchTaskResponse
     */
    CompletableFuture<DeleteCloudBenchTaskResponse> deleteCloudBenchTask(DeleteCloudBenchTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is used to delete the released DBgateway metadata from intelligent stress testing tasks created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.</li>
     * <li>When using the SDK to call DAS, specify the region as cn-shanghai.<blockquote>
     * <p>When a DBGateway has no heartbeat with the access point for more than 20 seconds, the DBGateway is in the stopped state.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityIPGroup  DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     */
    CompletableFuture<DeleteSecurityIPGroupResponse> deleteSecurityIPGroup(DeleteSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Call this API to delete metadata for inactive database gateway instances that were created during stress testing created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.
     * When you use an SDK to call the DAS service, you must specify the region as <code>cn-shanghai</code>.</p>
     * <blockquote>
     * <p>A database gateway is considered &quot;stopped&quot; if it has not sent a heartbeat to the DAS service for more than 20 seconds.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteStopGateway  DeleteStopGatewayRequest
     * @return DeleteStopGatewayResponse
     */
    CompletableFuture<DeleteStopGatewayResponse> deleteStopGateway(DeleteStopGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditLogs  DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     */
    CompletableFuture<DescribeAuditLogsResponse> describeAuditLogs(DescribeAuditLogsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoScalingConfig  DescribeAutoScalingConfigRequest
     * @return DescribeAutoScalingConfigResponse
     */
    CompletableFuture<DescribeAutoScalingConfigResponse> describeAutoScalingConfig(DescribeAutoScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, only the automatic performance scaling history of ApsaraDB RDS for MySQL instances in the high-availability series with cloud disks is supported.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
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
     * <p>Returns the top 500 keys in a cache analysis task.</p>
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
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudBenchTasks  DescribeCloudBenchTasksRequest
     * @return DescribeCloudBenchTasksResponse
     */
    CompletableFuture<DescribeCloudBenchTasksResponse> describeCloudBenchTasks(DescribeCloudBenchTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTask  DescribeCloudbenchTaskRequest
     * @return DescribeCloudbenchTaskResponse
     */
    CompletableFuture<DescribeCloudbenchTaskResponse> describeCloudbenchTask(DescribeCloudbenchTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Call this API to get the configuration details of a stress testing task for advanced debugging, or to understand how the Database Autonomy Service (DAS) stress testing feature operates. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTaskConfig  DescribeCloudbenchTaskConfigRequest
     * @return DescribeCloudbenchTaskConfigResponse
     */
    CompletableFuture<DescribeCloudbenchTaskConfigResponse> describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following prerequisites:</p>
     * <ul>
     * <li>If you use the China site (aliyun.com) or China site International (Chinese) SDK, use the latest version.</li>
     * <li>When you call a DAS operation by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDasOpsConfig  DescribeDasOpsConfigRequest
     * @return DescribeDasOpsConfigResponse
     */
    CompletableFuture<DescribeDasOpsConfigResponse> describeDasOpsConfig(DescribeDasOpsConfigRequest request);

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
     * <p>Queries the error log details of an instance within a specified time range.
     * Before you begin, make sure the following prerequisites are met:</p>
     * <ul>
     * <li>The target database engine is one of the following: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for MySQL, PolarDB for PostgreSQL, PolarDB for PostgreSQL (Compatible with Oracle), or ApsaraDB for MongoDB.</li>
     * <li>If you use the SDK of Alibaba Cloud or DAS, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeErrorLogRecords  DescribeErrorLogRecordsRequest
     * @return DescribeErrorLogRecordsResponse
     */
    CompletableFuture<DescribeErrorLogRecordsResponse> describeErrorLogRecords(DescribeErrorLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>For keys with data structures of List, Hash, Set, or Zset, the top 3 keys are sorted and displayed by the number of elements in the key, and are recorded as big keys. If the QPS of a key exceeds 5,000, the key is recorded as a hot key. For more information about the definitions of big keys and hot keys, see <a href="https://www.alibabacloud.com/help/en/das/user-guide/key-analysis">Top Key statistics</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For instances running Redis Community Edition 7.0.18, 6.0.2.9, 5.5.2.9, or earlier versions, or Tair (Enhanced Edition) in-memory instances running version 5.0.50, 25.2.0.0, or earlier versions, a key with a QPS greater than 3,000 is recorded as a hot key. This threshold cannot be adjusted.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>Use DAS SDK 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is Redis Community Edition or Tair (Redis® OSS-Compatible) in-memory.</li>
     * <li>The minor version of the instance is the latest.</li>
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
     * <p>Before you begin:</p>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>The version of the DAS SDK must be 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is a Redis Community Edition instance or a Tair (Redis® OSS-Compatible) memory-optimized instance.</li>
     * <li>The minor engine version of the instance is the latest.</li>
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
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation to query the DAS Enterprise Edition configurations of a database instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceDasPro  DescribeInstanceDasProRequest
     * @return DescribeInstanceDasProResponse
     */
    CompletableFuture<DescribeInstanceDasProResponse> describeInstanceDasPro(DescribeInstanceDasProRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation supports only ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling the DAS service with the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeQueryExplain  DescribeQueryExplainRequest
     * @return DescribeQueryExplainResponse
     */
    CompletableFuture<DescribeQueryExplainResponse> describeQueryExplain(DescribeQueryExplainRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityIPGroup  DescribeSecurityIPGroupRequest
     * @return DescribeSecurityIPGroupResponse
     */
    CompletableFuture<DescribeSecurityIPGroupResponse> describeSecurityIPGroup(DescribeSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityIPGroupRelation  DescribeSecurityIPGroupRelationRequest
     * @return DescribeSecurityIPGroupRelationResponse
     */
    CompletableFuture<DescribeSecurityIPGroupRelationResponse> describeSecurityIPGroupRelation(DescribeSecurityIPGroupRelationRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/156195.html">billing methods and pricing</a> of DAS.</em>*
     * Before you begin:</p>
     * <ul>
     * <li>DAS Enterprise Edition or the Alibaba Cloud Managed Services (not yet online) is enabled for the requested instance.</li>
     * <li>If you use the Alibaba Cloud SDK or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.
     * This operation uses asynchronous calls and does not immediately return complete results. If the value of isFinish in the response is false, wait 1 second and invoke the operation again until the value of isFinish is true, which indicates that complete results are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogHistogramAsync  DescribeSlowLogHistogramAsyncRequest
     * @return DescribeSlowLogHistogramAsyncResponse
     */
    CompletableFuture<DescribeSlowLogHistogramAsyncResponse> describeSlowLogHistogramAsync(DescribeSlowLogHistogramAsyncRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>InstanceId is the instance ID. This parameter is required.</li>
     * <li>StartTime and EndTime specify the time range for the query. These parameters are required.</li>
     * <li>Settings PageNumber and PageSize to retrieve results by paging.</li>
     * <li>Use the OrderBy parameter to sort the results. For more information about the sortable fields, refer to the References.</li>
     * <li>Use the Filters parameter to further refine query conditions, such as filtering by host address or SQL ID.
     * <notice>Certain database types, such as PostgreSQL and PolarDB for PostgreSQL, do not support specific sorting methods. Select appropriate parameters based on your database type.</notice></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/156195.html">billing</a> of DAS.</em>*
     * Before you invoke this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Alibaba Cloud Managed Services is enabled for the instance.</li>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When you invoke DAS operations by using the SDK, set the region to cn-shanghai.
     * This is an asynchronous operation. After a call is made, the complete result is not immediately returned. If the value of isFinish in the response is false, wait 1 second and invoke the operation again. The complete result is returned only when the value of isFinish is true.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogStatistic  DescribeSlowLogStatisticRequest
     * @return DescribeSlowLogStatisticResponse
     */
    CompletableFuture<DescribeSlowLogStatisticResponse> describeSlowLogStatistic(DescribeSlowLogStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>SQL Explorer must be enabled for the target instance. If SQL Explorer is not enabled, the operation returns an error.
     * Usage notes:</li>
     * <li><strong>This is an asynchronous operation. The first call returns a ResultId and State. Poll with the exact same request parameters until State is SUCCESS to obtain the statistical results in Data.</strong></li>
     * <li>Both StartTime and EndTime are millisecond-level timestamps. StartTime must be within the last 30 days, and the span between StartTime and EndTime must not exceed 7 days.</li>
     * <li>Because data aggregation involves latency, EndTime is automatically trimmed to a few minutes before the current time. Data from the most recent minutes may not be available.</li>
     * <li>StartTime is automatically adjusted to be no earlier than the time when SQL Explorer was enabled for the instance.
     * Response description:</li>
     * <li>Data.Data.List contains statistical results grouped by the aggregation dimension. Each element corresponds to a SQL template or an aggregation key, not an individual execution record.</li>
     * <li>Scnt, AvgScnt, Rows, AvgRows, Frows, and AvgFrows are metrics exclusive to PolarDB-X compute nodes and are returned only when Role is polarx_cn.</li>
     * <li>Writes, AvgWrites, MaxWrites, MinWrites, PhysicalRead, AvgPhysicalRead, MaxPhysicalRead, MinPhysicalRead, CpuTime, AvgCpuTime, MaxCpuTime, and MinCpuTime are metrics exclusive to SQL Server instances.</li>
     * <li>Trend is returned only when the DoFillTrend request parameter is set to true and the trend filling capability is enabled for the instance. The time slice interval is automatically determined by the query span.</li>
     * <li>SQL sample dimension fields such as SqlNew, Params, FirstTime, and Extra are not returned by this operation. This operation provides template-level aggregated statistics.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlInsightStatistic  DescribeSqlInsightStatisticRequest
     * @return DescribeSqlInsightStatisticResponse
     */
    CompletableFuture<DescribeSqlInsightStatisticResponse> describeSqlInsightStatistic(DescribeSqlInsightStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogConfig  DescribeSqlLogConfigRequest
     * @return DescribeSqlLogConfigResponse
     */
    CompletableFuture<DescribeSqlLogConfigResponse> describeSqlLogConfig(DescribeSqlLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, note the following:</p>
     * <ul>
     * <li>When you use an Alibaba Cloud or Database Autonomy Service (DAS) SDK, we recommend that you use the latest version.</li>
     * <li>When you call the DAS service by using an SDK, you must set the region to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogRecords  DescribeSqlLogRecordsRequest
     * @return DescribeSqlLogRecordsResponse
     */
    CompletableFuture<DescribeSqlLogRecordsResponse> describeSqlLogRecords(DescribeSqlLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogStatistic  DescribeSqlLogStatisticRequest
     * @return DescribeSqlLogStatisticResponse
     */
    CompletableFuture<DescribeSqlLogStatisticResponse> describeSqlLogStatistic(DescribeSqlLogStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSqlLogTask  DescribeSqlLogTaskRequest
     * @return DescribeSqlLogTaskResponse
     */
    CompletableFuture<DescribeSqlLogTaskResponse> describeSqlLogTask(DescribeSqlLogTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
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
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
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
     * <p>A key is identified as a hot key if its QPS exceeds 3,000.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is 4.3.3 or later. We recommend using the latest version.</li>
     * <li>The DAS SDK version must be 1.0.2 or later.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is an open source Redis instance or a Tair (Enterprise Edition) memory-optimized instance.</li>
     * <li>The instance runs on the latest minor version.</li>
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
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to enable or disable DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</p>
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
     * <ul>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to activate or deactivate DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</p>
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
     * <p>GetAsyncErrorRequestListByCode is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the <strong>isFinish</strong> parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the <strong>isFinish</strong> parameter is <strong>true</strong>, the complete results are returned.</p>
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
     * <p>GetAsyncErrorRequestStatByCode is an asynchronous operation After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
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
     * <p>This is an asynchronous call, so the complete results are not returned immediately. If the <strong>isFinish</strong> field in the response is <strong>false</strong>, wait 1s and retry the call. The complete results are returned when <strong>isFinish</strong> is <strong>true</strong>.</p>
     * </blockquote>
     * <ul>
     * <li>This operation supports only RDS MySQL and PolarDB for MySQL instances. Before you call this operation, ensure that DAS Enterprise Edition is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>When you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAsyncErrorRequestStatResult  GetAsyncErrorRequestStatResultRequest
     * @return GetAsyncErrorRequestStatResultResponse
     */
    CompletableFuture<GetAsyncErrorRequestStatResultResponse> getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
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
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
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
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
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
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
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
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>The database instance is connected to DAS.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDBInstanceConnectivityDiagnosis  GetDBInstanceConnectivityDiagnosisRequest
     * @return GetDBInstanceConnectivityDiagnosisResponse
     */
    CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>This is a paid API that is billed based on the number of output characters. Before using this API, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/das/product-overview/billing-details-of-the-previous-version#cad160563fbkd">pricing</a> of the DAS Agent product.</p>
     * 
     * @param request the request parameters of GetDasAgentSSE  GetDasAgentSSERequest
     * @return GetDasAgentSSEResponse
     */
    CompletableFuture<GetDasAgentSSEResponse> getDasAgentSSE(GetDasAgentSSERequest request);

    ResponseIterable<GetDasAgentSSEResponseBody> getDasAgentSSEWithResponseIterable(GetDasAgentSSERequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the supported databases, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When invoking DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>Use the <a href="https://help.aliyun.com/document_detail/2778836.html">DescribeSqlLogStatistic</a> operation to query the statistics information of DAS Enterprise Edition.</p>
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
     * <p>Before you call this API, ensure that you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When using an SDK to call the DAS service, specify the region as <code>cn-shanghai</code>.</li>
     * <li>Supported engines: PolarDB MySQL, ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQLServer.</li>
     * <li>Enable log indexing for the instance.<blockquote>
     * <p>The query start time must be within the last 7 days. The query duration cannot exceed 1 day. The API returns up to 10,000 records.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetDasSQLLogHotData  GetDasSQLLogHotDataRequest
     * @return GetDasSQLLogHotDataResponse
     */
    CompletableFuture<GetDasSQLLogHotDataResponse> getDasSQLLogHotData(GetDasSQLLogHotDataRequest request);

    /**
     * <b>description</b> :
     * <p>This API fetches the full details of a specific deadlock, including the transactions involved, the SQL statements, and the locks held and waited for. The deadlock can be from either a recent analysis or a full historical analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * Before you call this operation, ensure the following:</p>
     * <ul>
     * <li><strong>Supported engines</strong>:<ul>
     * <li>For recent deadlock analysis: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, PolarDB-X 2.0.</li>
     * <li>For full deadlock analysis: ApsaraDB RDS for MySQL or PolarDB for MySQL with <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Economy Edition</a> or <a href="https://help.aliyun.com/document_detail/190912.html">DAS Professional Edition</a> enabled.</li>
     * </ul>
     * </li>
     * <li><strong>SDK version</strong>: Use the latest version of the Alibaba Cloud SDK.</li>
     * <li><strong>Region</strong>: If you call the API via the SDK, set the region ID to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeadLockDetail  GetDeadLockDetailRequest
     * @return GetDeadLockDetailResponse
     */
    CompletableFuture<GetDeadLockDetailResponse> getDeadLockDetail(GetDeadLockDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeadLockDetailList  GetDeadLockDetailListRequest
     * @return GetDeadLockDetailListResponse
     */
    CompletableFuture<GetDeadLockDetailListResponse> getDeadLockDetailList(GetDeadLockDetailListRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the historical analysis records for recent and full deadlock analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * The following requirements must be met before you call this operation:</p>
     * <ul>
     * <li>To query historical analysis records of recent deadlocks, the destination database engine must be RDS MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>To query historical analysis records of full deadlocks, the destination database engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly known as Economy Edition)</a> must be enabled.</li>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeadLockHistory  GetDeadLockHistoryRequest
     * @return GetDeadLockHistoryResponse
     */
    CompletableFuture<GetDeadLockHistoryResponse> getDeadLockHistory(GetDeadLockHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the deadlock count from full deadlock analysis within a specified time range. DAS periodically analyzes fault logs, parses deadlock information, and collects statistics on deadlock count trends. For details, see <a href="https://help.aliyun.com/document_detail/2858236.html">Full deadlock analysis</a>.
     * Before you begin:</p>
     * <ul>
     * <li>The database DPI engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly DAS Economy Edition)</a> must be enabled.</li>
     * <li>If you use the China site (aliyun.com) or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeadlockHistogram  GetDeadlockHistogramRequest
     * @return GetDeadlockHistogramResponse
     */
    CompletableFuture<GetDeadlockHistogramResponse> getDeadlockHistogram(GetDeadlockHistogramRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetErrorRequestSample is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
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
     * <p>The SQL Explorer feature allows you to diagnose SQL health and troubleshoot performance issues. For details, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For information about supported database engines, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</li>
     * <li>When you use an SDK to invoke DAS, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetFullRequestSampleByInstanceId  GetFullRequestSampleByInstanceIdRequest
     * @return GetFullRequestSampleByInstanceIdResponse
     */
    CompletableFuture<GetFullRequestSampleByInstanceIdResponse> getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetFullRequestStatResultByInstanceId is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the isFinish parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the isFinish parameter is <strong>true</strong>, the complete results are returned.
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
     * <b>description</b> :
     * <p>Enabling the automated operations report feature for DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported. This operation is used to query report details.
     * Before you begin:</p>
     * <ul>
     * <li>Activate DAS Agent and ensure that the agent is still within its validity period.</li>
     * <li>Enable the daily report feature on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>Use DAS SDK 1.0.3 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceGroupInspectReportDetail  GetInstanceGroupInspectReportDetailRequest
     * @return GetInstanceGroupInspectReportDetailResponse
     */
    CompletableFuture<GetInstanceGroupInspectReportDetailResponse> getInstanceGroupInspectReportDetail(GetInstanceGroupInspectReportDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Enabling the O&amp;M report feature of DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported.
     * Before you begin:</p>
     * <ul>
     * <li>Activate DAS Agent and ensure that the Agent is still within its validity period.</li>
     * <li>Enable the daily report feature on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>Use DAS SDK 1.0.3 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to ap-southeast-1.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceGroupInspectReportList  GetInstanceGroupInspectReportListRequest
     * @return GetInstanceGroupInspectReportListResponse
     */
    CompletableFuture<GetInstanceGroupInspectReportListResponse> getInstanceGroupInspectReportList(GetInstanceGroupInspectReportListRequest request);

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
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
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
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
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
     * <ul>
     * <li>This operation is applicable only to MongoDB instances.</li>
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
     * <p>GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a request ID. You need to use the request ID to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
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
     * <p>Prerequisites for using this API:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling the DAS service using the SDK, specify the region as cn-shanghai.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The target database instance has Performance Insight (New Version) enabled. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance Insight (New Version)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPfsSqlSummaries  GetPfsSqlSummariesRequest
     * @return GetPfsSqlSummariesResponse
     */
    CompletableFuture<GetPfsSqlSummariesResponse> getPfsSqlSummaries(GetPfsSqlSummariesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
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
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
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
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
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
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
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
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
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
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
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
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
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
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
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
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>RDS PostgreSQL</li>
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
     * <ul>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * <li>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.<blockquote>
     * <p>This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.</p>
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
     * <p>The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
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
     * <p>This API has the following prerequisites:</p>
     * <ul>
     * <li>When you use an SDK to call the DAS service, you must set the region to cn-shanghai.</li>
     * <li>This API does not support querying diagnosis results for automatic SQL optimization.</li>
     * <li>This API supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Oracle-Compatible)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>RDS PostgreSQL instances require minor kernel version 20220130 or later. To view and upgrade the minor kernel version, see <a href="https://help.aliyun.com/document_detail/146895.html">Upgrade the minor kernel version</a>.</p>
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
     * <p>The SQL diagnostics feature provides instance diagnosis suggestions. You can use the suggestions to optimize instance indexes. For details, see <a href="https://help.aliyun.com/document_detail/167895.html">Automatic SQL optimization</a>.</p>
     * <blockquote>
     * <p>You can invoke this operation only to query diagnostic suggestions generated by the DAS automatic SQL optimization feature.
     * Before you begin:</p>
     * </blockquote>
     * <ul>
     * <li>The database DPI engine is RDS MySQL or PolarDB for MySQL.</li>
     * <li>If you use the China site (aliyun.com) or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSqlOptimizeAdvice  GetSqlOptimizeAdviceRequest
     * @return GetSqlOptimizeAdviceResponse
     */
    CompletableFuture<GetSqlOptimizeAdviceResponse> getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The physical file size indicates the actual size of an obtained file. Only specific deployment modes of database instances support the display of physical file sizes. The statistics on tables are obtained from <code>information_schema.tables</code>. Statistics in MySQL are not updated in real time. Therefore, the statistics may be different from the physical file sizes. If you want to obtain the latest data, you can execute the <code>ANALYZE TABLE</code> statement on the relevant tables during off-peak hours.</p>
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
     * @param request the request parameters of GetYaoChiAgent  GetYaoChiAgentRequest
     * @return GetYaoChiAgentResponse
     */
    CompletableFuture<GetYaoChiAgentResponse> getYaoChiAgent(GetYaoChiAgentRequest request);

    ResponseIterable<GetYaoChiAgentResponseBody> getYaoChiAgentWithResponseIterable(GetYaoChiAgentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to the Redis engine.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>The version of the DAS SDK must be 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * @param request the request parameters of KillInstanceAllSession  KillInstanceAllSessionRequest
     * @return KillInstanceAllSessionResponse
     */
    CompletableFuture<KillInstanceAllSessionResponse> killInstanceAllSession(KillInstanceAllSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the following auto scaling configurations for an instance: <strong>auto scaling for specifications</strong>, <strong>automatic storage expansion</strong>, <strong>automatic bandwidth adjustment</strong>, and <strong>auto scaling for resources</strong>.</p>
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
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation enables the latest supported version by default. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDasOpsConfig  ModifyDasOpsConfigRequest
     * @return ModifyDasOpsConfigResponse
     */
    CompletableFuture<ModifyDasOpsConfigResponse> modifyDasOpsConfig(ModifyDasOpsConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following prerequisites:</p>
     * <ul>
     * <li>If you use the Alibaba Cloud SDK or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation enables the latest supported version by default. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyForwardSqlLogConfig  ModifyForwardSqlLogConfigRequest
     * @return ModifyForwardSqlLogConfigResponse
     */
    CompletableFuture<ModifyForwardSqlLogConfigResponse> modifyForwardSqlLogConfig(ModifyForwardSqlLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, note the following:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, specify the cn-shanghai region.</li>
     * <li>This operation uses the latest supported version by default. For more information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityIPGroup  ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     */
    CompletableFuture<ModifySecurityIPGroupResponse> modifySecurityIPGroup(ModifySecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>For information about the supported database instances, see the <a href="https://help.aliyun.com/document_detail/92561.html">feature overview</a> of SQL Explorer.</li>
     * <li>SQL Explorer (original version) must be enabled for the target database instance. For more information, see <a href="https://help.aliyun.com/document_detail/92561.html">Enable SQL Explorer and Audit</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityIPGroupRelation  ModifySecurityIPGroupRelationRequest
     * @return ModifySecurityIPGroupRelationResponse
     */
    CompletableFuture<ModifySecurityIPGroupRelationResponse> modifySecurityIPGroupRelation(ModifySecurityIPGroupRelationRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation enables the latest supported version of DAS Enterprise Edition by default. See <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a> for the databases and regions supported by each version of DAS Enterprise Edition.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySqlLogConfig  ModifySqlLogConfigRequest
     * @return ModifySqlLogConfigResponse
     */
    CompletableFuture<ModifySqlLogConfigResponse> modifySqlLogConfig(ModifySqlLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you determine whether your instance type needs to be scaled out to handle peak service traffic. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
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
     * <p>Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.\<em>\</em>\<em>\</em> In this case, you must call this operation at least twice.
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
     * <p>An asynchronous call does not immediately return complete results. First, call this operation to obtain the <strong>ResultId</strong>. Then, use the returned <strong>ResultId</strong> to initiate the call again until <strong>isFinish</strong> is <strong>true</strong>, at which point the complete results are returned. This means that you must call this operation at least twice to obtain complete data.
     * Before you begin:</p>
     * </blockquote>
     * <ul>
     * <li>When using the SDK to call DAS, specify the region as cn-shanghai.</li>
     * <li>The autonomy service is enabled for the target database instance. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>The target database instance is one of the following:<ul>
     * <li>ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 high-availability series or RDS Enterprise Edition.</li>
     * <li>PolarDB for MySQL 5.6 Cluster Edition, 5.7 Cluster Edition, or 8.0 Cluster Edition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAutoThrottleRulesAsync  UpdateAutoThrottleRulesAsyncRequest
     * @return UpdateAutoThrottleRulesAsyncResponse
     */
    CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request);

}
