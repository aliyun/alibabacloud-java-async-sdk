// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.das20200116.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "DAS";
        this.version = "2020-01-16";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-shanghai", "das.cn-shanghai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<AddHDMInstanceResponse> addHDMInstance(AddHDMInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddHDMInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddHDMInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddHDMInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCacheAnalysisJobResponse> createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCacheAnalysisJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCacheAnalysisJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCacheAnalysisJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCloudBenchTasksResponse> createCloudBenchTasks(CreateCloudBenchTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudBenchTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudBenchTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudBenchTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiagnosticReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosticReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosticReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateKillInstanceSessionTaskResponse> createKillInstanceSessionTask(CreateKillInstanceSessionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKillInstanceSessionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKillInstanceSessionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKillInstanceSessionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateKillInstanceSessionTaskWithMaintainUser  CreateKillInstanceSessionTaskWithMaintainUserRequest
     * @return CreateKillInstanceSessionTaskWithMaintainUserResponse
     */
    @Override
    public CompletableFuture<CreateKillInstanceSessionTaskWithMaintainUserResponse> createKillInstanceSessionTaskWithMaintainUser(CreateKillInstanceSessionTaskWithMaintainUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKillInstanceSessionTaskWithMaintainUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKillInstanceSessionTaskWithMaintainUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKillInstanceSessionTaskWithMaintainUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLatestDeadLockAnalysis  CreateLatestDeadLockAnalysisRequest
     * @return CreateLatestDeadLockAnalysisResponse
     */
    @Override
    public CompletableFuture<CreateLatestDeadLockAnalysisResponse> createLatestDeadLockAnalysis(CreateLatestDeadLockAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLatestDeadLockAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLatestDeadLockAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLatestDeadLockAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateQueryOptimizeTagResponse> createQueryOptimizeTag(CreateQueryOptimizeTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQueryOptimizeTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQueryOptimizeTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQueryOptimizeTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateRequestDiagnosisResponse> createRequestDiagnosis(CreateRequestDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRequestDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRequestDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRequestDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateSqlLogTaskResponse> createSqlLogTask(CreateSqlLogTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSqlLogTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSqlLogTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSqlLogTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateStorageAnalysisTaskResponse> createStorageAnalysisTask(CreateStorageAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStorageAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStorageAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStorageAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DeleteCloudBenchTask  DeleteCloudBenchTaskRequest
     * @return DeleteCloudBenchTaskResponse
     */
    @Override
    public CompletableFuture<DeleteCloudBenchTaskResponse> deleteCloudBenchTask(DeleteCloudBenchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCloudBenchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCloudBenchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCloudBenchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteStopGatewayResponse> deleteStopGateway(DeleteStopGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStopGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStopGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStopGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeAutoScalingConfigResponse> describeAutoScalingConfig(DescribeAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeAutoScalingHistoryResponse> describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoScalingHistory").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoScalingHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoScalingHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeCacheAnalysisJobResponse> describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCacheAnalysisJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCacheAnalysisJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCacheAnalysisJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeCacheAnalysisJobsResponse> describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCacheAnalysisJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCacheAnalysisJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCacheAnalysisJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudBenchTasks  DescribeCloudBenchTasksRequest
     * @return DescribeCloudBenchTasksResponse
     */
    @Override
    public CompletableFuture<DescribeCloudBenchTasksResponse> describeCloudBenchTasks(DescribeCloudBenchTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudBenchTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudBenchTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudBenchTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTask  DescribeCloudbenchTaskRequest
     * @return DescribeCloudbenchTaskResponse
     */
    @Override
    public CompletableFuture<DescribeCloudbenchTaskResponse> describeCloudbenchTask(DescribeCloudbenchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudbenchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudbenchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudbenchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of DescribeCloudbenchTaskConfig  DescribeCloudbenchTaskConfigRequest
     * @return DescribeCloudbenchTaskConfigResponse
     */
    @Override
    public CompletableFuture<DescribeCloudbenchTaskConfigResponse> describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudbenchTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudbenchTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudbenchTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation sorts list, hash, set, and zset keys based on the number of elements contained in these keys. The top three keys that contain the most elements are considered large keys. If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for ApsaraDB for Redis instances that meet the following requirements:<ul>
     * <li>The instance is a Community Edition instance that uses a major version of 5.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHotBigKeys  DescribeHotBigKeysRequest
     * @return DescribeHotBigKeysResponse
     */
    @Override
    public CompletableFuture<DescribeHotBigKeysResponse> describeHotBigKeys(DescribeHotBigKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHotBigKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHotBigKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHotBigKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis instances that meet the following requirements:<ul>
     * <li>The ApsaraDB for Redis instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHotKeys  DescribeHotKeysRequest
     * @return DescribeHotKeysResponse
     */
    @Override
    public CompletableFuture<DescribeHotKeysResponse> describeHotKeys(DescribeHotKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHotKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHotKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHotKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceDasProResponse> describeInstanceDasPro(DescribeInstanceDasProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceDasPro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceDasProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceDasProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQueryExplain  DescribeQueryExplainRequest
     * @return DescribeQueryExplainResponse
     */
    @Override
    public CompletableFuture<DescribeQueryExplainResponse> describeQueryExplain(DescribeQueryExplainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQueryExplain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQueryExplainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQueryExplainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSlowLogHistogramAsync  DescribeSlowLogHistogramAsyncRequest
     * @return DescribeSlowLogHistogramAsyncResponse
     */
    @Override
    public CompletableFuture<DescribeSlowLogHistogramAsyncResponse> describeSlowLogHistogramAsync(DescribeSlowLogHistogramAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogHistogramAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogHistogramAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogHistogramAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSlowLogStatistic  DescribeSlowLogStatisticRequest
     * @return DescribeSlowLogStatisticResponse
     */
    @Override
    public CompletableFuture<DescribeSlowLogStatisticResponse> describeSlowLogStatistic(DescribeSlowLogStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSqlLogConfigResponse> describeSqlLogConfig(DescribeSqlLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSqlLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSqlLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSqlLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSqlLogRecordsResponse> describeSqlLogRecords(DescribeSqlLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSqlLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSqlLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSqlLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSqlLogStatisticResponse> describeSqlLogStatistic(DescribeSqlLogStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSqlLogStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSqlLogStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSqlLogStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSqlLogTaskResponse> describeSqlLogTask(DescribeSqlLogTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSqlLogTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSqlLogTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSqlLogTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSqlLogTasksResponse> describeSqlLogTasks(DescribeSqlLogTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSqlLogTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSqlLogTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSqlLogTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeTopBigKeysResponse> describeTopBigKeys(DescribeTopBigKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTopBigKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTopBigKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTopBigKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for an ApsaraDB for Redis instance of one of the following versions:<ul>
     * <li>The instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTopHotKeys  DescribeTopHotKeysRequest
     * @return DescribeTopHotKeysResponse
     */
    @Override
    public CompletableFuture<DescribeTopHotKeysResponse> describeTopHotKeys(DescribeTopHotKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTopHotKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTopHotKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTopHotKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableAllSqlConcurrencyControlRulesResponse> disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAllSqlConcurrencyControlRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAllSqlConcurrencyControlRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAllSqlConcurrencyControlRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * @param request the request parameters of DisableAutoResourceOptimizeRules  DisableAutoResourceOptimizeRulesRequest
     * @return DisableAutoResourceOptimizeRulesResponse
     */
    @Override
    public CompletableFuture<DisableAutoResourceOptimizeRulesResponse> disableAutoResourceOptimizeRules(DisableAutoResourceOptimizeRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAutoResourceOptimizeRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAutoResourceOptimizeRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAutoResourceOptimizeRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * @param request the request parameters of DisableAutoThrottleRules  DisableAutoThrottleRulesRequest
     * @return DisableAutoThrottleRulesResponse
     */
    @Override
    public CompletableFuture<DisableAutoThrottleRulesResponse> disableAutoThrottleRules(DisableAutoThrottleRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAutoThrottleRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAutoThrottleRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAutoThrottleRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableDasProResponse> disableDasPro(DisableDasProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDasPro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDasProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDasProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableInstanceDasConfigResponse> disableInstanceDasConfig(DisableInstanceDasConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableInstanceDasConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableInstanceDasConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableInstanceDasConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableSqlConcurrencyControlResponse> disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSqlConcurrencyControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSqlConcurrencyControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSqlConcurrencyControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<EnableDasProResponse> enableDasPro(EnableDasProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDasPro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDasProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDasProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<EnableSqlConcurrencyControlResponse> enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSqlConcurrencyControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSqlConcurrencyControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSqlConcurrencyControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAsyncErrorRequestListByCodeResponse> getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAsyncErrorRequestListByCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncErrorRequestListByCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncErrorRequestListByCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAsyncErrorRequestStatByCodeResponse> getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAsyncErrorRequestStatByCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncErrorRequestStatByCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncErrorRequestStatByCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAsyncErrorRequestStatResultResponse> getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAsyncErrorRequestStatResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAsyncErrorRequestStatResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAsyncErrorRequestStatResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAutoIncrementUsageStatisticResponse> getAutoIncrementUsageStatistic(GetAutoIncrementUsageStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoIncrementUsageStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoIncrementUsageStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoIncrementUsageStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAutoResourceOptimizeRulesResponse> getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoResourceOptimizeRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoResourceOptimizeRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoResourceOptimizeRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAutoThrottleRulesResponse> getAutoThrottleRules(GetAutoThrottleRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoThrottleRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoThrottleRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoThrottleRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAutonomousNotifyEventContentResponse> getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutonomousNotifyEventContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutonomousNotifyEventContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutonomousNotifyEventContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAutonomousNotifyEventsInRangeResponse> getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutonomousNotifyEventsInRange").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutonomousNotifyEventsInRangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutonomousNotifyEventsInRangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetBlockingDetailListResponse> getBlockingDetailList(GetBlockingDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBlockingDetailList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBlockingDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBlockingDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDBInstanceConnectivityDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDBInstanceConnectivityDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDBInstanceConnectivityDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetDasProServiceUsageResponse> getDasProServiceUsage(GetDasProServiceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDasProServiceUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDasProServiceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDasProServiceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetDasSQLLogHotDataResponse> getDasSQLLogHotData(GetDasSQLLogHotDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDasSQLLogHotData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDasSQLLogHotDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDasSQLLogHotDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeadLockDetail  GetDeadLockDetailRequest
     * @return GetDeadLockDetailResponse
     */
    @Override
    public CompletableFuture<GetDeadLockDetailResponse> getDeadLockDetail(GetDeadLockDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeadLockDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeadLockDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeadLockDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetDeadLockDetailListResponse> getDeadLockDetailList(GetDeadLockDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeadLockDetailList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeadLockDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeadLockDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeadLockHistory  GetDeadLockHistoryRequest
     * @return GetDeadLockHistoryResponse
     */
    @Override
    public CompletableFuture<GetDeadLockHistoryResponse> getDeadLockHistory(GetDeadLockHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeadLockHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeadLockHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeadLockHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeadlockHistogram  GetDeadlockHistogramRequest
     * @return GetDeadlockHistogramResponse
     */
    @Override
    public CompletableFuture<GetDeadlockHistogramResponse> getDeadlockHistogram(GetDeadlockHistogramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeadlockHistogram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeadlockHistogramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeadlockHistogramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEndpointSwitchTask  GetEndpointSwitchTaskRequest
     * @return GetEndpointSwitchTaskResponse
     */
    @Override
    public CompletableFuture<GetEndpointSwitchTaskResponse> getEndpointSwitchTask(GetEndpointSwitchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEndpointSwitchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEndpointSwitchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEndpointSwitchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetErrorRequestSampleResponse> getErrorRequestSample(GetErrorRequestSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetErrorRequestSample").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErrorRequestSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErrorRequestSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetEventSubscriptionResponse> getEventSubscription(GetEventSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEventSubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEventSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEventSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetFullRequestOriginStatByInstanceIdResponse> getFullRequestOriginStatByInstanceId(GetFullRequestOriginStatByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFullRequestOriginStatByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFullRequestOriginStatByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFullRequestOriginStatByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetFullRequestSampleByInstanceIdResponse> getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFullRequestSampleByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFullRequestSampleByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFullRequestSampleByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetFullRequestStatResultByInstanceIdResponse> getFullRequestStatResultByInstanceId(GetFullRequestStatResultByInstanceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFullRequestStatResultByInstanceId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFullRequestStatResultByInstanceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFullRequestStatResultByInstanceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHDMAliyunResourceSyncResult  GetHDMAliyunResourceSyncResultRequest
     * @return GetHDMAliyunResourceSyncResultResponse
     */
    @Override
    public CompletableFuture<GetHDMAliyunResourceSyncResultResponse> getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHDMAliyunResourceSyncResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHDMAliyunResourceSyncResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHDMAliyunResourceSyncResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHDMLastAliyunResourceSyncResult  GetHDMLastAliyunResourceSyncResultRequest
     * @return GetHDMLastAliyunResourceSyncResultResponse
     */
    @Override
    public CompletableFuture<GetHDMLastAliyunResourceSyncResultResponse> getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHDMLastAliyunResourceSyncResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHDMLastAliyunResourceSyncResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHDMLastAliyunResourceSyncResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetInstanceInspectionsResponse> getInstanceInspections(GetInstanceInspectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceInspections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceInspectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceInspectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetInstanceMissingIndexListResponse> getInstanceMissingIndexList(GetInstanceMissingIndexListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceMissingIndexList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceMissingIndexListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceMissingIndexListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetInstanceSqlOptimizeStatisticResponse> getInstanceSqlOptimizeStatistic(GetInstanceSqlOptimizeStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceSqlOptimizeStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceSqlOptimizeStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceSqlOptimizeStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetKillInstanceSessionTaskResultResponse> getKillInstanceSessionTaskResult(GetKillInstanceSessionTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetKillInstanceSessionTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKillInstanceSessionTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKillInstanceSessionTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetMongoDBCurrentOpResponse> getMongoDBCurrentOp(GetMongoDBCurrentOpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMongoDBCurrentOp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMongoDBCurrentOpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMongoDBCurrentOpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetMySQLAllSessionAsyncResponse> getMySQLAllSessionAsync(GetMySQLAllSessionAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMySQLAllSessionAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMySQLAllSessionAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMySQLAllSessionAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the <a href="https://help.aliyun.com/document_detail/470302.html">heatmap</a> feature of Database Autonomy Service (DAS) to query the data.</p>
     * 
     * @param request the request parameters of GetPartitionsHeatmap  GetPartitionsHeatmapRequest
     * @return GetPartitionsHeatmapResponse
     */
    @Override
    public CompletableFuture<GetPartitionsHeatmapResponse> getPartitionsHeatmap(GetPartitionsHeatmapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPartitionsHeatmap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPartitionsHeatmapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPartitionsHeatmapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetPfsMetricTrendsResponse> getPfsMetricTrends(GetPfsMetricTrendsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPfsMetricTrends").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPfsMetricTrendsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPfsMetricTrendsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetPfsSqlSampleResponse> getPfsSqlSample(GetPfsSqlSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPfsSqlSample").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPfsSqlSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPfsSqlSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetPfsSqlSummariesResponse> getPfsSqlSummaries(GetPfsSqlSummariesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPfsSqlSummaries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPfsSqlSummariesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPfsSqlSummariesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeDataStatsResponse> getQueryOptimizeDataStats(GetQueryOptimizeDataStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeDataStats").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeDataStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeDataStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeDataTopResponse> getQueryOptimizeDataTop(GetQueryOptimizeDataTopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeDataTop").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeDataTopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeDataTopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeDataTrendResponse> getQueryOptimizeDataTrend(GetQueryOptimizeDataTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeDataTrend").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeDataTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeDataTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeExecErrorSampleResponse> getQueryOptimizeExecErrorSample(GetQueryOptimizeExecErrorSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeExecErrorSample").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeExecErrorSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeExecErrorSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeExecErrorStatsResponse> getQueryOptimizeExecErrorStats(GetQueryOptimizeExecErrorStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeExecErrorStats").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeExecErrorStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeExecErrorStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeRuleListResponse> getQueryOptimizeRuleList(GetQueryOptimizeRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeRuleList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeShareUrlResponse> getQueryOptimizeShareUrl(GetQueryOptimizeShareUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeShareUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeShareUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeShareUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeSolutionResponse> getQueryOptimizeSolution(GetQueryOptimizeSolutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeSolution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeSolutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeSolutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetQueryOptimizeTagResponse> getQueryOptimizeTag(GetQueryOptimizeTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueryOptimizeTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryOptimizeTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryOptimizeTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetRedisAllSessionResponse> getRedisAllSession(GetRedisAllSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRedisAllSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRedisAllSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRedisAllSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetRequestDiagnosisPageResponse> getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRequestDiagnosisPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRequestDiagnosisPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRequestDiagnosisPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetRequestDiagnosisResultResponse> getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRequestDiagnosisResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRequestDiagnosisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRequestDiagnosisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetRunningSqlConcurrencyControlRulesResponse> getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRunningSqlConcurrencyControlRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRunningSqlConcurrencyControlRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRunningSqlConcurrencyControlRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSqlConcurrencyControlKeywordsFromSqlTextResponse> getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSqlConcurrencyControlKeywordsFromSqlText").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlConcurrencyControlKeywordsFromSqlTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlConcurrencyControlKeywordsFromSqlTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSqlConcurrencyControlRulesHistoryResponse> getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSqlConcurrencyControlRulesHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlConcurrencyControlRulesHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlConcurrencyControlRulesHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSqlOptimizeAdviceResponse> getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSqlOptimizeAdvice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlOptimizeAdviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlOptimizeAdviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetStorageAnalysisResultResponse> getStorageAnalysisResult(GetStorageAnalysisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageAnalysisResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageAnalysisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageAnalysisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<KillInstanceAllSessionResponse> killInstanceAllSession(KillInstanceAllSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KillInstanceAllSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KillInstanceAllSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KillInstanceAllSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifySqlLogConfigResponse> modifySqlLogConfig(ModifySqlLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySqlLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySqlLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySqlLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * @param request the request parameters of RunCloudBenchTask  RunCloudBenchTaskRequest
     * @return RunCloudBenchTaskResponse
     */
    @Override
    public CompletableFuture<RunCloudBenchTaskResponse> runCloudBenchTask(RunCloudBenchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCloudBenchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCloudBenchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCloudBenchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SetEventSubscriptionResponse> setEventSubscription(SetEventSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetEventSubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEventSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEventSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateAutoResourceOptimizeRulesAsyncResponse> updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAutoResourceOptimizeRulesAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoResourceOptimizeRulesAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoResourceOptimizeRulesAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateAutoSqlOptimizeStatusResponse> updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAutoSqlOptimizeStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoSqlOptimizeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoSqlOptimizeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAutoThrottleRulesAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAutoThrottleRulesAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAutoThrottleRulesAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
