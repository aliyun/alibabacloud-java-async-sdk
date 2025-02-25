// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.starrocks20221019.models.*;
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
        this.product = "starrocks";
        this.version = "2022-10-19";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCu  ModifyCuRequest
     * @return ModifyCuResponse
     */
    @Override
    public CompletableFuture<ModifyCuResponse> modifyCu(ModifyCuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyCu").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyCu").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCuPreCheck  ModifyCuPreCheckRequest
     * @return ModifyCuPreCheckResponse
     */
    @Override
    public CompletableFuture<ModifyCuPreCheckResponse> modifyCuPreCheck(ModifyCuPreCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyCuPreCheck").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyCuPreCheck").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCuPreCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCuPreCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskNumber  ModifyDiskNumberRequest
     * @return ModifyDiskNumberResponse
     */
    @Override
    public CompletableFuture<ModifyDiskNumberResponse> modifyDiskNumber(ModifyDiskNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDiskNumber").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyDiskNumber").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and sfter the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskPerformanceLevel  ModifyDiskPerformanceLevelRequest
     * @return ModifyDiskPerformanceLevelResponse
     */
    @Override
    public CompletableFuture<ModifyDiskPerformanceLevelResponse> modifyDiskPerformanceLevel(ModifyDiskPerformanceLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDiskPerformanceLevel").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyDiskPerformanceLevel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskPerformanceLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskPerformanceLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSize  ModifyDiskSizeRequest
     * @return ModifyDiskSizeResponse
     */
    @Override
    public CompletableFuture<ModifyDiskSizeResponse> modifyDiskSize(ModifyDiskSizeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyDiskSize").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyDiskSize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskSizeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskSizeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNodeNumber  ModifyNodeNumberRequest
     * @return ModifyNodeNumberResponse
     */
    @Override
    public CompletableFuture<ModifyNodeNumberResponse> modifyNodeNumber(ModifyNodeNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyNodeNumber").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyNodeNumber").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodeNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodeNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyNodeNumberPreCheck  ModifyNodeNumberPreCheckRequest
     * @return ModifyNodeNumberPreCheckResponse
     */
    @Override
    public CompletableFuture<ModifyNodeNumberPreCheckResponse> modifyNodeNumberPreCheck(ModifyNodeNumberPreCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyNodeNumberPreCheck").setMethod(HttpMethod.POST).setPathRegex("/webapi/resourceChange/modifyNodeNumberPreCheck").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodeNumberPreCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodeNumberPreCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryUpgradableVersions  QueryUpgradableVersionsRequest
     * @return QueryUpgradableVersionsResponse
     */
    @Override
    public CompletableFuture<QueryUpgradableVersionsResponse> queryUpgradableVersions(QueryUpgradableVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryUpgradableVersions").setMethod(HttpMethod.POST).setPathRegex("/webapi/starrocks/queryUpgradableVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUpgradableVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUpgradableVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReleaseInstance").setMethod(HttpMethod.POST).setPathRegex("/webapi/cluster/release").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    @Override
    public CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/webapi/starrocks/restartCluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceName").setMethod(HttpMethod.POST).setPathRegex("/webapi/cluster/update_name").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * @param request the request parameters of UpgradeVersion  UpgradeVersionRequest
     * @return UpgradeVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeVersionResponse> upgradeVersion(UpgradeVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeVersion").setMethod(HttpMethod.POST).setPathRegex("/webapi/starrocks/upgradeVersion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
