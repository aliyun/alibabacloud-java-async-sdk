// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hologram20220601.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateHoloWarehouse  CreateHoloWarehouseRequest
     * @return CreateHoloWarehouseResponse
     */
    CompletableFuture<CreateHoloWarehouseResponse> createHoloWarehouse(CreateHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/developer-reference/api-hologram-2022-06-01-createinstance">Pricing</a>.</li>
     * <li>When you purchase a Hologres instance, you must specify the region and zone in which the Hologres instance resides. A region may correspond to multiple zones. Example:<!---->
     * cn-hangzhou: cn-hangzhou-h, cn-hangzhou-j
     *    cn-shanghai: cn-shanghai-e, cn-shanghai-f
     *    cn-beijing: cn-beijing-i, cn-beijing-g
     *    cn-zhangjiakou: cn-zhangjiakou-b
     *    cn-shenzhen: cn-shenzhen-e
     *    cn-hongkong: cn-hongkong-b
     *    cn-shanghai-finance-1: cn-shanghai-finance-1z
     *    ap-northeast-1: ap-northeast-1a
     *    ap-southeast-1: ap-southeast-1c
     *    ap-southeast-3: ap-southeast-3b
     *    ap-southeast-5: ap-southeast-5b
     *    ap-south-1: ap-south-1b
     *    eu-central-1: eu-central-1a
     *    us-east-1: us-east-1a
     *    us-west-1: us-west-1b</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of DeleteHoloWarehouse  DeleteHoloWarehouseRequest
     * @return DeleteHoloWarehouseResponse
     */
    CompletableFuture<DeleteHoloWarehouseResponse> deleteHoloWarehouse(DeleteHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, read the documentation and make sure that you understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li>After you delete a Hologres instance, data and objects in the instance cannot be restored. Proceed with caution. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview#section-h6a-x58-jc0">Billing overview</a>.</li>
     * <li>You can delete only pay-as-you-go instances.</li>
     * <li>If you want to unsubscribe from a subscription instance, submit a ticket.<a href="https://help.aliyun.com/document_detail/150284.html#section-ogc-9vc-858"></a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DisableHiveAccess  DisableHiveAccessRequest
     * @return DisableHiveAccessResponse
     */
    CompletableFuture<DisableHiveAccessResponse> disableHiveAccess(DisableHiveAccessRequest request);

    /**
     * @param request the request parameters of EnableHiveAccess  EnableHiveAccessRequest
     * @return EnableHiveAccessResponse
     */
    CompletableFuture<EnableHiveAccessResponse> enableHiveAccess(EnableHiveAccessRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetWarehouseDetail  GetWarehouseDetailRequest
     * @return GetWarehouseDetailResponse
     */
    CompletableFuture<GetWarehouseDetailResponse> getWarehouseDetail(GetWarehouseDetailRequest request);

    /**
     * @param request the request parameters of ListBackupData  ListBackupDataRequest
     * @return ListBackupDataResponse
     */
    CompletableFuture<ListBackupDataResponse> listBackupData(ListBackupDataRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListWarehouses  ListWarehousesRequest
     * @return ListWarehousesResponse
     */
    CompletableFuture<ListWarehousesResponse> listWarehouses(ListWarehousesRequest request);

    /**
     * @param request the request parameters of RebalanceHoloWarehouse  RebalanceHoloWarehouseRequest
     * @return RebalanceHoloWarehouseResponse
     */
    CompletableFuture<RebalanceHoloWarehouseResponse> rebalanceHoloWarehouse(RebalanceHoloWarehouseRequest request);

    /**
     * @param request the request parameters of RenameHoloWarehouse  RenameHoloWarehouseRequest
     * @return RenameHoloWarehouseResponse
     */
    CompletableFuture<RenameHoloWarehouseResponse> renameHoloWarehouse(RenameHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about billing details of Hologres, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/billing-overview">Pricing</a>.</li>
     * <li>For more information about how to renew a Hologres instance, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/manage-renewals?spm=a2c63.p38356.0.0.73f27c8d1Q0FUi">Manage renewals</a>.</li>
     * <li>You can renew only subscription instances.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RestartHoloWarehouse  RestartHoloWarehouseRequest
     * @return RestartHoloWarehouseResponse
     */
    CompletableFuture<RestartHoloWarehouseResponse> restartHoloWarehouse(RestartHoloWarehouseRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of ResumeHoloWarehouse  ResumeHoloWarehouseRequest
     * @return ResumeHoloWarehouseResponse
     */
    CompletableFuture<ResumeHoloWarehouseResponse> resumeHoloWarehouse(ResumeHoloWarehouseRequest request);

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * @param request the request parameters of ScaleHoloWarehouse  ScaleHoloWarehouseRequest
     * @return ScaleHoloWarehouseResponse
     */
    CompletableFuture<ScaleHoloWarehouseResponse> scaleHoloWarehouse(ScaleHoloWarehouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Hologres because this operation is charged.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about the billing of Hologres, see <a href="https://www.alibabacloud.com/help/zh/hologres/product-overview/billing-overview">Billing overview</a>.</li>
     * <li>During the change of computing resource specifications of a Hologres instance, the instance is unavailable. During the change of storage resource specifications of a Hologres instance, the instance can work normally. Do not frequently change instance specifications. For more information, see <a href="https://www.alibabacloud.com/help/en/hologres/product-overview/upgrade-or-downgrade-instance-specifications">Upgrade or downgrade instance specifications</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleInstance  ScaleInstanceRequest
     * @return ScaleInstanceResponse
     */
    CompletableFuture<ScaleInstanceResponse> scaleInstance(ScaleInstanceRequest request);

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of SuspendHoloWarehouse  SuspendHoloWarehouseRequest
     * @return SuspendHoloWarehouseResponse
     */
    CompletableFuture<SuspendHoloWarehouseResponse> suspendHoloWarehouse(SuspendHoloWarehouseRequest request);

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateInstanceNetworkType  UpdateInstanceNetworkTypeRequest
     * @return UpdateInstanceNetworkTypeResponse
     */
    CompletableFuture<UpdateInstanceNetworkTypeResponse> updateInstanceNetworkType(UpdateInstanceNetworkTypeRequest request);

}
