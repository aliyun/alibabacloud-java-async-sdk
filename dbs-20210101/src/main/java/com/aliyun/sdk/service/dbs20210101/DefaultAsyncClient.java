// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dbs20210101.models.*;
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
        this.product = "Dbs";
        this.version = "2021-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dbs-api.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dbs-api.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dbs-api.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dbs-api.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dbs-api.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dbs-api.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "dbs-api.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("eu-central-1", "dbs-api.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-south-1", "dbs-api.ap-south-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dbs-api.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dbs-api.me-east-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfigureBackupSetInfo  ConfigureBackupSetInfoRequest
     * @return ConfigureBackupSetInfoResponse
     */
    @Override
    public CompletableFuture<ConfigureBackupSetInfoResponse> configureBackupSetInfo(ConfigureBackupSetInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureBackupSetInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureBackupSetInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureBackupSetInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAdvancedPolicy  CreateAdvancedPolicyRequest
     * @return CreateAdvancedPolicyResponse
     */
    @Override
    public CompletableFuture<CreateAdvancedPolicyResponse> createAdvancedPolicy(CreateAdvancedPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAdvancedPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAdvancedPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAdvancedPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDownload  CreateDownloadRequest
     * @return CreateDownloadResponse
     */
    @Override
    public CompletableFuture<CreateDownloadResponse> createDownload(CreateDownloadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDownload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDownloadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDownloadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DeleteSandboxInstance  DeleteSandboxInstanceRequest
     * @return DeleteSandboxInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteSandboxInstanceResponse> deleteSandboxInstance(DeleteSandboxInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSandboxInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSandboxInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSandboxInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID: 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/88172.html">Back up data of PolarDB for MySQL</a></p>
     * 
     * @param request the request parameters of DescribeBackupDataList  DescribeBackupDataListRequest
     * @return DescribeBackupDataListResponse
     */
    @Override
    public CompletableFuture<DescribeBackupDataListResponse> describeBackupDataList(DescribeBackupDataListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupDataList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupDataListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupDataListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> The API operation is available only to specific customers. If you want to call this API operation, request permissions by joining the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/280422.html">Topics related to backup policies of PolarDB for MySQL instances</a></p>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBakDataSourceStorageAccessInfo  DescribeBakDataSourceStorageAccessInfoRequest
     * @return DescribeBakDataSourceStorageAccessInfoResponse
     */
    @Override
    public CompletableFuture<DescribeBakDataSourceStorageAccessInfoResponse> describeBakDataSourceStorageAccessInfo(DescribeBakDataSourceStorageAccessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBakDataSourceStorageAccessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBakDataSourceStorageAccessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBakDataSourceStorageAccessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCostInfoByDbsInstance  DescribeCostInfoByDbsInstanceRequest
     * @return DescribeCostInfoByDbsInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeCostInfoByDbsInstanceResponse> describeCostInfoByDbsInstance(DescribeCostInfoByDbsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCostInfoByDbsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCostInfoByDbsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCostInfoByDbsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryBackupSet  DescribeDBTablesRecoveryBackupSetRequest
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    @Override
    public CompletableFuture<DescribeDBTablesRecoveryBackupSetResponse> describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBTablesRecoveryBackupSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBTablesRecoveryBackupSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBTablesRecoveryBackupSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryState  DescribeDBTablesRecoveryStateRequest
     * @return DescribeDBTablesRecoveryStateResponse
     */
    @Override
    public CompletableFuture<DescribeDBTablesRecoveryStateResponse> describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBTablesRecoveryState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBTablesRecoveryStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBTablesRecoveryStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryTimeRange  DescribeDBTablesRecoveryTimeRangeRequest
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    @Override
    public CompletableFuture<DescribeDBTablesRecoveryTimeRangeResponse> describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBTablesRecoveryTimeRange").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBTablesRecoveryTimeRangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBTablesRecoveryTimeRangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL that uses Enterprise SSDs (ESSDs)</li>
     * <li>RDS PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadBackupSetStorageInfo  DescribeDownloadBackupSetStorageInfoRequest
     * @return DescribeDownloadBackupSetStorageInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDownloadBackupSetStorageInfoResponse> describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDownloadBackupSetStorageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDownloadBackupSetStorageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDownloadBackupSetStorageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadSupport  DescribeDownloadSupportRequest
     * @return DescribeDownloadSupportResponse
     */
    @Override
    public CompletableFuture<DescribeDownloadSupportResponse> describeDownloadSupport(DescribeDownloadSupportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDownloadSupport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDownloadSupportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDownloadSupportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadTask  DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    @Override
    public CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDownloadTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxBackupSets  DescribeSandboxBackupSetsRequest
     * @return DescribeSandboxBackupSetsResponse
     */
    @Override
    public CompletableFuture<DescribeSandboxBackupSetsResponse> describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSandboxBackupSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSandboxBackupSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSandboxBackupSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxInstances  DescribeSandboxInstancesRequest
     * @return DescribeSandboxInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeSandboxInstancesResponse> describeSandboxInstances(DescribeSandboxInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSandboxInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSandboxInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSandboxInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxRecoveryTime  DescribeSandboxRecoveryTimeRequest
     * @return DescribeSandboxRecoveryTimeResponse
     */
    @Override
    public CompletableFuture<DescribeSandboxRecoveryTimeResponse> describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSandboxRecoveryTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSandboxRecoveryTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSandboxRecoveryTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDBTablesRecoveryState  ModifyDBTablesRecoveryStateRequest
     * @return ModifyDBTablesRecoveryStateResponse
     */
    @Override
    public CompletableFuture<ModifyDBTablesRecoveryStateResponse> modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBTablesRecoveryState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBTablesRecoveryStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBTablesRecoveryStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryDownloadTask  RetryDownloadTaskRequest
     * @return RetryDownloadTaskResponse
     */
    @Override
    public CompletableFuture<RetryDownloadTaskResponse> retryDownloadTask(RetryDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryDownloadTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SupportDBTableRecovery  SupportDBTableRecoveryRequest
     * @return SupportDBTableRecoveryResponse
     */
    @Override
    public CompletableFuture<SupportDBTableRecoveryResponse> supportDBTableRecovery(SupportDBTableRecoveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SupportDBTableRecovery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SupportDBTableRecoveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SupportDBTableRecoveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
