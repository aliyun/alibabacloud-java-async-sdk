// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iot20180120.models.*;
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
     * @param request the request parameters of AddDataForApiSource  AddDataForApiSourceRequest
     * @return AddDataForApiSourceResponse
     */
    CompletableFuture<AddDataForApiSourceResponse> addDataForApiSource(AddDataForApiSourceRequest request);

    /**
     * @param request the request parameters of AddDeviceToSharePromotion  AddDeviceToSharePromotionRequest
     * @return AddDeviceToSharePromotionResponse
     */
    CompletableFuture<AddDeviceToSharePromotionResponse> addDeviceToSharePromotion(AddDeviceToSharePromotionRequest request);

    /**
     * @param request the request parameters of AddPowerStation  AddPowerStationRequest
     * @return AddPowerStationResponse
     */
    CompletableFuture<AddPowerStationResponse> addPowerStation(AddPowerStationRequest request);

    /**
     * @param request the request parameters of AddShareTaskDevice  AddShareTaskDeviceRequest
     * @return AddShareTaskDeviceResponse
     */
    CompletableFuture<AddShareTaskDeviceResponse> addShareTaskDevice(AddShareTaskDeviceRequest request);

    /**
     * @param request the request parameters of AsyncRRpc  AsyncRRpcRequest
     * @return AsyncRRpcResponse
     */
    CompletableFuture<AsyncRRpcResponse> asyncRRpc(AsyncRRpcRequest request);

    /**
     * @param request the request parameters of AttachDestination  AttachDestinationRequest
     * @return AttachDestinationResponse
     */
    CompletableFuture<AttachDestinationResponse> attachDestination(AttachDestinationRequest request);

    /**
     * @param request the request parameters of AttachParserDataSource  AttachParserDataSourceRequest
     * @return AttachParserDataSourceResponse
     */
    CompletableFuture<AttachParserDataSourceResponse> attachParserDataSource(AttachParserDataSourceRequest request);

    /**
     * @param request the request parameters of BatchAddDataForApiSource  BatchAddDataForApiSourceRequest
     * @return BatchAddDataForApiSourceResponse
     */
    CompletableFuture<BatchAddDataForApiSourceResponse> batchAddDataForApiSource(BatchAddDataForApiSourceRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of BatchAddDeviceGroupRelations  BatchAddDeviceGroupRelationsRequest
     * @return BatchAddDeviceGroupRelationsResponse
     */
    CompletableFuture<BatchAddDeviceGroupRelationsResponse> batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can attach up to 10 sub-devices to a gateway in a single call.</p>
     * <ul>
     * <li>The API operation caller must be the gateway owner.</li>
     * <li>If you specify a sub-device that is already attached to a gateway, the original gateway is replaced with the specified gateway.</li>
     * <li>If one of the specified sub-devices fails to establish a topological relationship with the gateway, the system rolls back, and all specified sub-devices fail to establish topological relationships with the gateway.</li>
     * <li>After you call this operation to establish topological relationships between sub-devices and the gateway, IoT Platform uses the <code>/sys/${productKey}/${deviceName}/thing/topo/change</code> topic to push information that includes the result of this operation to the gateway. For more information, see <a href="https://help.aliyun.com/document_detail/89299.html">Notify gateways of changes of topological relationships</a>.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per Alibaba Cloud account. </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchAddThingTopo  BatchAddThingTopoRequest
     * @return BatchAddThingTopoResponse
     */
    CompletableFuture<BatchAddThingTopoResponse> batchAddThingTopo(BatchAddThingTopoRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of BatchBindDeviceToEdgeInstanceWithDriver  BatchBindDeviceToEdgeInstanceWithDriverRequest
     * @return BatchBindDeviceToEdgeInstanceWithDriverResponse
     */
    CompletableFuture<BatchBindDeviceToEdgeInstanceWithDriverResponse> batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request);

    /**
     * @param request the request parameters of BatchBindDevicesIntoProject  BatchBindDevicesIntoProjectRequest
     * @return BatchBindDevicesIntoProjectResponse
     */
    CompletableFuture<BatchBindDevicesIntoProjectResponse> batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request);

    /**
     * @param request the request parameters of BatchBindProductsIntoProject  BatchBindProductsIntoProjectRequest
     * @return BatchBindProductsIntoProjectResponse
     */
    CompletableFuture<BatchBindProductsIntoProjectResponse> batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation with the <strong>BatchRegisterDeviceWithApplyId</strong> operation to register multiple devices under a product. Each device carries a unique DeviceName.
     * Procedure:
     * 1\. Call this operation to specify the DeviceNames of the devices to be registered. IoT Platform returns an application ID (<strong>ApplyId</strong>). A successful response indicates that the request to verify the DeviceNames is submitted. The actual registration process is asynchronously implemented and takes some minutes.
     * 2\. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the name setting result.
     * 3\. Call the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> operation to register multiple devices.
     * 4\. Optional. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to view the registration result.
     * 5\. Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to query the information about the registered devices.</p>
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 10,000 DeviceNames in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchCheckDeviceNames  BatchCheckDeviceNamesRequest
     * @return BatchCheckDeviceNamesResponse
     */
    CompletableFuture<BatchCheckDeviceNamesResponse> batchCheckDeviceNames(BatchCheckDeviceNamesRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchCheckImportDevice  BatchCheckImportDeviceRequest
     * @return BatchCheckImportDeviceResponse
     */
    CompletableFuture<BatchCheckImportDeviceResponse> batchCheckImportDevice(BatchCheckImportDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>The invalid device models returned if the call fails.</p>
     * 
     * @param request the request parameters of BatchCheckVehicleDevice  BatchCheckVehicleDeviceRequest
     * @return BatchCheckVehicleDeviceResponse
     */
    CompletableFuture<BatchCheckVehicleDeviceResponse> batchCheckVehicleDevice(BatchCheckVehicleDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchClearEdgeInstanceDeviceConfig  BatchClearEdgeInstanceDeviceConfigRequest
     * @return BatchClearEdgeInstanceDeviceConfigResponse
     */
    CompletableFuture<BatchClearEdgeInstanceDeviceConfigResponse> batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request);

    /**
     * @param request the request parameters of BatchCreateSoundCodeLabel  BatchCreateSoundCodeLabelRequest
     * @return BatchCreateSoundCodeLabelResponse
     */
    CompletableFuture<BatchCreateSoundCodeLabelResponse> batchCreateSoundCodeLabel(BatchCreateSoundCodeLabelRequest request);

    /**
     * @param request the request parameters of BatchCreateSoundCodeLabelWithLabels  BatchCreateSoundCodeLabelWithLabelsRequest
     * @return BatchCreateSoundCodeLabelWithLabelsResponse
     */
    CompletableFuture<BatchCreateSoundCodeLabelWithLabelsResponse> batchCreateSoundCodeLabelWithLabels(BatchCreateSoundCodeLabelWithLabelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchDeleteDeviceGroupRelations  BatchDeleteDeviceGroupRelationsRequest
     * @return BatchDeleteDeviceGroupRelationsResponse
     */
    CompletableFuture<BatchDeleteDeviceGroupRelationsResponse> batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request);

    /**
     * @param request the request parameters of BatchDeleteEdgeInstanceChannel  BatchDeleteEdgeInstanceChannelRequest
     * @return BatchDeleteEdgeInstanceChannelResponse
     */
    CompletableFuture<BatchDeleteEdgeInstanceChannelResponse> batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request);

    /**
     * @param request the request parameters of BatchGetDeviceBindStatus  BatchGetDeviceBindStatusRequest
     * @return BatchGetDeviceBindStatusResponse
     */
    CompletableFuture<BatchGetDeviceBindStatusResponse> batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can perform the following operations:</p>
     * <ul>
     * <li>You can specify a value for the <strong>ProductKey</strong> parameter and multiple values for the <strong>DeviceName</strong> parameter to query the status of devices that belong to a product.</li>
     * <li>You can specify multiple values for the <strong>IotId</strong> parameter to query the status of devices that belong to different products.****<blockquote>
     * <p>You can query the status of up to 50 devices in a call.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetDeviceState  BatchGetDeviceStateRequest
     * @return BatchGetDeviceStateResponse
     */
    CompletableFuture<BatchGetDeviceStateResponse> batchGetDeviceState(BatchGetDeviceStateRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeDriver  BatchGetEdgeDriverRequest
     * @return BatchGetEdgeDriverResponse
     */
    CompletableFuture<BatchGetEdgeDriverResponse> batchGetEdgeDriver(BatchGetEdgeDriverRequest request);

    /**
     * @param request the request parameters of BatchGetEdgeInstanceChannel  BatchGetEdgeInstanceChannelRequest
     * @return BatchGetEdgeInstanceChannelResponse
     */
    CompletableFuture<BatchGetEdgeInstanceChannelResponse> batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request);

    /**
     * @param request the request parameters of BatchGetEdgeInstanceDeviceChannel  BatchGetEdgeInstanceDeviceChannelRequest
     * @return BatchGetEdgeInstanceDeviceChannelResponse
     */
    CompletableFuture<BatchGetEdgeInstanceDeviceChannelResponse> batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeInstanceDeviceConfig  BatchGetEdgeInstanceDeviceConfigRequest
     * @return BatchGetEdgeInstanceDeviceConfigResponse
     */
    CompletableFuture<BatchGetEdgeInstanceDeviceConfigResponse> batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request);

    /**
     * @param request the request parameters of BatchGetEdgeInstanceDeviceDriver  BatchGetEdgeInstanceDeviceDriverRequest
     * @return BatchGetEdgeInstanceDeviceDriverResponse
     */
    CompletableFuture<BatchGetEdgeInstanceDeviceDriverResponse> batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeInstanceDriverConfigs  BatchGetEdgeInstanceDriverConfigsRequest
     * @return BatchGetEdgeInstanceDriverConfigsResponse
     */
    CompletableFuture<BatchGetEdgeInstanceDriverConfigsResponse> batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request);

    /**
     * @param request the request parameters of BatchGrayMigrationDevice  BatchGrayMigrationDeviceRequest
     * @return BatchGrayMigrationDeviceResponse
     */
    CompletableFuture<BatchGrayMigrationDeviceResponse> batchGrayMigrationDevice(BatchGrayMigrationDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that an MQTT gateway and the related product are created and the <strong>ProductKey</strong> of the product is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/433804.html">Create an MQTT gateway</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchImportDevice  BatchImportDeviceRequest
     * @return BatchImportDeviceResponse
     */
    CompletableFuture<BatchImportDeviceResponse> batchImportDevice(BatchImportDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>Indicates whether the call was successful. Valid values: </p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchImportVehicleDevice  BatchImportVehicleDeviceRequest
     * @return BatchImportVehicleDeviceResponse
     */
    CompletableFuture<BatchImportVehicleDeviceResponse> batchImportVehicleDevice(BatchImportVehicleDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to publish a message to a maximum of 100 devices of a product at a time.</p>
     * <ul>
     * <li>The BatchPub operation cannot be used to send commands of setting properties or calling services. If you need to set properties, use the <a href="https://help.aliyun.com/document_detail/69579.html">SetDeviceProperty</a> or <a href="https://help.aliyun.com/document_detail/96243.html">SetDevicesProperty</a> operation. If you need to call services, use the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> or <a href="https://help.aliyun.com/document_detail/96242.html">InvokeThingsService</a> operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchPub  BatchPubRequest
     * @return BatchPubResponse
     */
    CompletableFuture<BatchPubResponse> batchPub(BatchPubRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query a maximum of 100 devices in a single call.</li>
     * <li>You can query the details of devices that belong only to the current Alibaba Cloud account. If you specify a device that does not belong to the current account, an error message is returned.</li>
     * <li>If you specify multiple devices and some devices do not exist, only the details of existing devices are returned.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchQueryDeviceDetail  BatchQueryDeviceDetailRequest
     * @return BatchQueryDeviceDetailResponse
     */
    CompletableFuture<BatchQueryDeviceDetailResponse> batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to register multiple devices:</p>
     * <ul>
     * <li>If you want to generate random DeviceNames, call the BatchRegisterDevice operation.
     * Perform the following steps to register devices and view the result:
     * 1\. Call the BatchRegisterDevice operation to register multiple devices. A successful response indicates that the registration request is submitted. The actual registration process is asynchronously implemented and takes some minutes.
     * 2\. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the device registration result.
     * 3\. Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to view the details of registered devices. The details include the DeviceName, DeviceSecret, and IotId parameters.</li>
     * <li>If you want to specify custom DeviceNames, call the BatchRegisterDeviceWithApplyId operation. For more information, see <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>You can create a maximum of 10,000 devices in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchRegisterDevice  BatchRegisterDeviceRequest
     * @return BatchRegisterDeviceResponse
     */
    CompletableFuture<BatchRegisterDeviceResponse> batchRegisterDevice(BatchRegisterDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to register multiple devices at a time:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/69473.html">BatchRegisterDevice</a> operation to generate random DeviceNames.</li>
     * <li>Call the BatchRegisterDeviceWithApplyId and <strong>BatchCheckDeviceNames</strong> operations to specify custom DeviceNames. Procedure:
     * Call the <a href="https://help.aliyun.com/document_detail/69482.html">BatchCheckDeviceNames</a> operation and specify the names of devices that you want to register. If the DeviceNames are valid, IoT Platform returns an application ID that is specified by the <strong>ApplyId</strong> parameter. You can query the DeviceName setting results, device registration results, and device details by <strong>ApplyId</strong>.
     * Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the name setting result.
     * Call the BatchRegisterDeviceWithApplyId operation to register multiple devices. The successful result that is returned by this operation indicates that only the batch registration request is submitted. In actual scenarios, the registration process takes a few minutes.
     * Optional. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the device registration result.
     * Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to view the details of devices that are registered in batches.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchRegisterDeviceWithApplyId  BatchRegisterDeviceWithApplyIdRequest
     * @return BatchRegisterDeviceWithApplyIdResponse
     */
    CompletableFuture<BatchRegisterDeviceWithApplyIdResponse> batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request);

    /**
     * @param request the request parameters of BatchSetEdgeInstanceDeviceChannel  BatchSetEdgeInstanceDeviceChannelRequest
     * @return BatchSetEdgeInstanceDeviceChannelResponse
     */
    CompletableFuture<BatchSetEdgeInstanceDeviceChannelResponse> batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request);

    /**
     * @param request the request parameters of BatchSetEdgeInstanceDeviceConfig  BatchSetEdgeInstanceDeviceConfigRequest
     * @return BatchSetEdgeInstanceDeviceConfigResponse
     */
    CompletableFuture<BatchSetEdgeInstanceDeviceConfigResponse> batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchUnbindDeviceFromEdgeInstance  BatchUnbindDeviceFromEdgeInstanceRequest
     * @return BatchUnbindDeviceFromEdgeInstanceResponse
     */
    CompletableFuture<BatchUnbindDeviceFromEdgeInstanceResponse> batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request);

    /**
     * @param request the request parameters of BatchUnbindProjectDevices  BatchUnbindProjectDevicesRequest
     * @return BatchUnbindProjectDevicesResponse
     */
    CompletableFuture<BatchUnbindProjectDevicesResponse> batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request);

    /**
     * @param request the request parameters of BatchUnbindProjectProducts  BatchUnbindProjectProductsRequest
     * @return BatchUnbindProjectProductsResponse
     */
    CompletableFuture<BatchUnbindProjectProductsResponse> batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchUpdateDeviceNickname  BatchUpdateDeviceNicknameRequest
     * @return BatchUpdateDeviceNicknameResponse
     */
    CompletableFuture<BatchUpdateDeviceNicknameResponse> batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request);

    /**
     * @param request the request parameters of BindApplicationToEdgeInstance  BindApplicationToEdgeInstanceRequest
     * @return BindApplicationToEdgeInstanceResponse
     */
    CompletableFuture<BindApplicationToEdgeInstanceResponse> bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindDriverToEdgeInstance  BindDriverToEdgeInstanceRequest
     * @return BindDriverToEdgeInstanceResponse
     */
    CompletableFuture<BindDriverToEdgeInstanceResponse> bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindGatewayToEdgeInstance  BindGatewayToEdgeInstanceRequest
     * @return BindGatewayToEdgeInstanceResponse
     */
    CompletableFuture<BindGatewayToEdgeInstanceResponse> bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that the following steps are complete:</p>
     * <ol>
     * <li>A license is purchased. For more information, see <a href="https://help.aliyun.com/document_detail/427935.html">Purchase a license</a>.</li>
     * <li>The license is bound to a product. The devices to which you want to bind the license belong to the product. For more information, see <a href="https://help.aliyun.com/document_detail/427956.html">BindLicenseProduct</a> or <a href="https://help.aliyun.com/document_detail/427937.html">Bind a license to a product</a>.</li>
     * </ol>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindLicenseDevice  BindLicenseDeviceRequest
     * @return BindLicenseDeviceResponse
     */
    CompletableFuture<BindLicenseDeviceResponse> bindLicenseDevice(BindLicenseDeviceRequest request);

    /**
     * @param request the request parameters of BindLicenseProduct  BindLicenseProductRequest
     * @return BindLicenseProductResponse
     */
    CompletableFuture<BindLicenseProductResponse> bindLicenseProduct(BindLicenseProductRequest request);

    /**
     * @param request the request parameters of BindRoleToEdgeInstance  BindRoleToEdgeInstanceRequest
     * @return BindRoleToEdgeInstanceResponse
     */
    CompletableFuture<BindRoleToEdgeInstanceResponse> bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request);

    /**
     * @param request the request parameters of BindSceneRuleToEdgeInstance  BindSceneRuleToEdgeInstanceRequest
     * @return BindSceneRuleToEdgeInstanceResponse
     */
    CompletableFuture<BindSceneRuleToEdgeInstanceResponse> bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request);

    /**
     * @param request the request parameters of CancelJob  CancelJobRequest
     * @return CancelJobResponse
     */
    CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can cancel only the dynamic update policy that is attached to a dynamic update batch. This operation is not applicable to static update batches.
     * After the operation is successful, the <strong>JobStatus</strong> parameter is set to CANCELED.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CancelOTAStrategyByJob  CancelOTAStrategyByJobRequest
     * @return CancelOTAStrategyByJobResponse
     */
    CompletableFuture<CancelOTAStrategyByJobResponse> cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can cancel device update tasks only when the tasks are in the to be pushed, pushed, or in upgrade state.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelOTATaskByDevice  CancelOTATaskByDeviceRequest
     * @return CancelOTATaskByDeviceResponse
     */
    CompletableFuture<CancelOTATaskByDeviceResponse> cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, make sure that you specify at least one of the CancelScheduledTask, CancelQueuedTask, CancelInProgressTask, CancelNotifiedTask, and CancelUnconfirmedTask parameters. Otherwise, the request will fail.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelOTATaskByJob  CancelOTATaskByJobRequest
     * @return CancelOTATaskByJobResponse
     */
    CompletableFuture<CancelOTATaskByJobResponse> cancelOTATaskByJob(CancelOTATaskByJobRequest request);

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelReleaseProduct  CancelReleaseProductRequest
     * @return CancelReleaseProductResponse
     */
    CompletableFuture<CancelReleaseProductResponse> cancelReleaseProduct(CancelReleaseProductRequest request);

    /**
     * @param request the request parameters of CheckBindLicenseDeviceProgress  CheckBindLicenseDeviceProgressRequest
     * @return CheckBindLicenseDeviceProgressResponse
     */
    CompletableFuture<CheckBindLicenseDeviceProgressResponse> checkBindLicenseDeviceProgress(CheckBindLicenseDeviceProgressRequest request);

    /**
     * <b>description</b> :
     * <p>  Each time you call this operation, you must specify the identifiers of properties whose desired values you want to delete for the <strong>Identifies</strong> parameter. If you do not configure the <strong>Identifies</strong> parameter, the call fails.</p>
     * <ul>
     * <li>You can specify up to 10 property identifiers for the <strong>Identifies</strong> parameter in a single call.</li>
     * <li>After you call this operation to deletes the desired values of properties of a device, you can call the <a href="https://help.aliyun.com/document_detail/107566.html">QueryDeviceDesiredProperty</a> operation to query the desired values of properties of the device. In this case, the QueryDeviceDesiredProperty operation returns the <strong>Identifier</strong> parameter instead of the <strong>Value</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ClearDeviceDesiredProperty  ClearDeviceDesiredPropertyRequest
     * @return ClearDeviceDesiredPropertyResponse
     */
    CompletableFuture<ClearDeviceDesiredPropertyResponse> clearDeviceDesiredProperty(ClearDeviceDesiredPropertyRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ClearEdgeInstanceDriverConfigs  ClearEdgeInstanceDriverConfigsRequest
     * @return ClearEdgeInstanceDriverConfigsResponse
     */
    CompletableFuture<ClearEdgeInstanceDriverConfigsResponse> clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request);

    /**
     * @param request the request parameters of CloseDeviceTunnel  CloseDeviceTunnelRequest
     * @return CloseDeviceTunnelResponse
     */
    CompletableFuture<CloseDeviceTunnelResponse> closeDeviceTunnel(CloseDeviceTunnelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CloseEdgeInstanceDeployment  CloseEdgeInstanceDeploymentRequest
     * @return CloseEdgeInstanceDeploymentResponse
     */
    CompletableFuture<CloseEdgeInstanceDeploymentResponse> closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request);

    /**
     * <b>description</b> :
     * <p>To confirm update tasks in a scheduled update batch, you must call this operation within the specified time range.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfirmOTATask  ConfirmOTATaskRequest
     * @return ConfirmOTATaskResponse
     */
    CompletableFuture<ConfirmOTATaskResponse> confirmOTATask(ConfirmOTATaskRequest request);

    /**
     * <b>description</b> :
     * <p>  If a destination product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you can copy a TSL model.</p>
     * <ul>
     * <li>The categories of the source product and destination product must be the same. The product category is indicated by the <strong>CategoryKey</strong> parameter. You can call the <a href="https://help.aliyun.com/document_detail/69272.html">QueryProduct</a> operation and view the <strong>CategoryKey</strong> parameter of a product in the returned result.</li>
     * <li>You must specify the version of the TSL model that you want to copy by using the <strong>SourceModelVersion</strong> parameter in the request. Otherwise, the CopyThingModel operation fails.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to five queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CopyThingModel  CopyThingModelRequest
     * @return CopyThingModelResponse
     */
    CompletableFuture<CopyThingModelResponse> copyThingModel(CopyThingModelRequest request);

    /**
     * @param request the request parameters of CopyThingModelAsync  CopyThingModelAsyncRequest
     * @return CopyThingModelAsyncResponse
     */
    CompletableFuture<CopyThingModelAsyncResponse> copyThingModelAsync(CopyThingModelAsyncRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to query the shared speeches that were broadcasted six hours ago. For example, if a speech was broadcasted at 07:15, you can query the speech after 13:15.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CountSpeechBroadcastHour  CountSpeechBroadcastHourRequest
     * @return CountSpeechBroadcastHourResponse
     */
    CompletableFuture<CountSpeechBroadcastHourResponse> countSpeechBroadcastHour(CountSpeechBroadcastHourRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroupSubscribeRelation  CreateConsumerGroupSubscribeRelationRequest
     * @return CreateConsumerGroupSubscribeRelationResponse
     */
    CompletableFuture<CreateConsumerGroupSubscribeRelationResponse> createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request);

    /**
     * @param request the request parameters of CreateDataAPIService  CreateDataAPIServiceRequest
     * @return CreateDataAPIServiceResponse
     */
    CompletableFuture<CreateDataAPIServiceResponse> createDataAPIService(CreateDataAPIServiceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, perform the following steps: First, create a data source. For information about how to create a data source, see Step 1 to Step 6 in the <a href="https://help.aliyun.com/document_detail/270932.html">Create a data source</a> topic. Second, go to the <strong>Data Source</strong> tab on the <strong>Message Forwarding</strong> page of the instance that you want to manage in the IoT Platform console. Then, view and record the ID of the <strong>data source</strong> that you created.</p>
     * <blockquote>
     * <p> If you set Topic to a custom topic for a product or device that uses the open source Message Queuing Telemetry Transport (MQTT) protocol, you must specify ScopeType and ProductKey. If ScopeType is set to DEVICE, you must also specify DeviceName.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDataSourceItem  CreateDataSourceItemRequest
     * @return CreateDataSourceItemResponse
     */
    CompletableFuture<CreateDataSourceItemResponse> createDataSourceItem(CreateDataSourceItemRequest request);

    /**
     * @param request the request parameters of CreateDestination  CreateDestinationRequest
     * @return CreateDestinationResponse
     */
    CompletableFuture<CreateDestinationResponse> createDestination(CreateDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>To distribute devices, perform the following steps:
     * 1\. Asynchronously call this operation to create a device distribution task and obtain the <strong>JobId</strong> parameter.
     * 2\. Use <strong>JobId</strong> as a request parameter and repeatedly call the <a href="https://help.aliyun.com/document_detail/199536.html">QueryDeviceDistributeJob</a> operation to obtain the <strong>Status</strong> parameter.</p>
     * <blockquote>
     * <p> You must control the frequency of calls based on the QPS limit of the QueryDeviceDistributeJob operation.
     * If either of the following values is returned for the <strong>Status</strong> parameter, the distribution task ends:</p>
     * </blockquote>
     * <ul>
     * <li><strong>2</strong>: The device distribution task is completed. This return value does not indicate that the devices are distributed. To obtain the distribution result of each device, perform the next step.</li>
     * <li><strong>3</strong>: The distribution is unexpectedly interrupted. After you process the error, you can initiate a device distribution task again.
     * 3\. Use <strong>JobId</strong> that is returned in Step 1 as a request parameter and call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation to obtain the <strong>File</strong> parameter. The File parameter indicates the file URL of the distribution result.<blockquote>
     * <p> The file URL is valid for 10 minutes.
     * 4\. Obtain the distribution result by using the file URL. The <strong>Code</strong> parameter indicates whether a device is distributed. If the value of the <strong>Code</strong> parameter is 200, the device is distributed.
     * If the distribution fails, you can perform the preceding steps to distribute devices again.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</li>
     * <li>You cannot call this operation to distribute devices across accounts.</li>
     * <li>Each Alibaba Cloud account can create a maximum of 10 tasks to distribute products or devices. For more information about how to create a product distribution task, see <a href="/help/en/iot-platform/latest/createproductdistributejob">CreateProductDistributeJob</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDeviceDistributeJob  CreateDeviceDistributeJobRequest
     * @return CreateDeviceDistributeJobResponse
     */
    CompletableFuture<CreateDeviceDistributeJobResponse> createDeviceDistributeJob(CreateDeviceDistributeJobRequest request);

    /**
     * @param request the request parameters of CreateDeviceDynamicGroup  CreateDeviceDynamicGroupRequest
     * @return CreateDeviceDynamicGroupResponse
     */
    CompletableFuture<CreateDeviceDynamicGroupResponse> createDeviceDynamicGroup(CreateDeviceDynamicGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDeviceGroup  CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     */
    CompletableFuture<CreateDeviceGroupResponse> createDeviceGroup(CreateDeviceGroupRequest request);

    /**
     * @param request the request parameters of CreateDeviceTunnel  CreateDeviceTunnelRequest
     * @return CreateDeviceTunnelResponse
     */
    CompletableFuture<CreateDeviceTunnelResponse> createDeviceTunnel(CreateDeviceTunnelRequest request);

    /**
     * @param request the request parameters of CreateDownloadDataJob  CreateDownloadDataJobRequest
     * @return CreateDownloadDataJobResponse
     */
    CompletableFuture<CreateDownloadDataJobResponse> createDownloadDataJob(CreateDownloadDataJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeDriver  CreateEdgeDriverRequest
     * @return CreateEdgeDriverResponse
     */
    CompletableFuture<CreateEdgeDriverResponse> createEdgeDriver(CreateEdgeDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeDriverVersion  CreateEdgeDriverVersionRequest
     * @return CreateEdgeDriverVersionResponse
     */
    CompletableFuture<CreateEdgeDriverVersionResponse> createEdgeDriverVersion(CreateEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeInstance  CreateEdgeInstanceRequest
     * @return CreateEdgeInstanceResponse
     */
    CompletableFuture<CreateEdgeInstanceResponse> createEdgeInstance(CreateEdgeInstanceRequest request);

    /**
     * @param request the request parameters of CreateEdgeInstanceChannel  CreateEdgeInstanceChannelRequest
     * @return CreateEdgeInstanceChannelResponse
     */
    CompletableFuture<CreateEdgeInstanceChannelResponse> createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeInstanceDeployment  CreateEdgeInstanceDeploymentRequest
     * @return CreateEdgeInstanceDeploymentResponse
     */
    CompletableFuture<CreateEdgeInstanceDeploymentResponse> createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request);

    /**
     * @param request the request parameters of CreateEdgeInstanceMessageRouting  CreateEdgeInstanceMessageRoutingRequest
     * @return CreateEdgeInstanceMessageRoutingResponse
     */
    CompletableFuture<CreateEdgeInstanceMessageRoutingResponse> createEdgeInstanceMessageRouting(CreateEdgeInstanceMessageRoutingRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeOssPreSignedAddress  CreateEdgeOssPreSignedAddressRequest
     * @return CreateEdgeOssPreSignedAddressResponse
     */
    CompletableFuture<CreateEdgeOssPreSignedAddressResponse> createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to create up to 500 devices.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoRaNodesTask  CreateLoRaNodesTaskRequest
     * @return CreateLoRaNodesTaskResponse
     */
    CompletableFuture<CreateLoRaNodesTaskResponse> createLoRaNodesTask(CreateLoRaNodesTaskRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of CreateOTADynamicUpgradeJob  CreateOTADynamicUpgradeJobRequest
     * @return CreateOTADynamicUpgradeJobResponse
     */
    CompletableFuture<CreateOTADynamicUpgradeJobResponse> createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create an OTA update package, you must call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate the information about the files that you want to add to the OTA update package and call the Object Storage Service (OSS) <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation to upload the files.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can have up to 500 update packages. </p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAFirmware  CreateOTAFirmwareRequest
     * @return CreateOTAFirmwareResponse
     */
    CompletableFuture<CreateOTAFirmwareResponse> createOTAFirmware(CreateOTAFirmwareRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>OTA modules are the updatable units of the devices that belong to the same product. The default module indicates the entire firmware of a device. You can call this operation to create a custom OTA module.</p>
     * <ul>
     * <li>You can create a maximum of 10 custom OTA modules for each product.</li>
     * <li>After an OTA module is created, you cannot modify its name. You can call the <a href="https://help.aliyun.com/document_detail/186061.html">UpdateOTAModule</a> operation to modify the module alias and description.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateOTAModule  CreateOTAModuleRequest
     * @return CreateOTAModuleResponse
     */
    CompletableFuture<CreateOTAModuleResponse> createOTAModule(CreateOTAModuleRequest request);

    /**
     * <b>description</b> :
     * <p>  If you specify that an update package does not need to be verified when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation, you must make sure that the update package is verified before you call the CreateOTAStaticUpgradeJob operation to create an update batch. For more information about how to create a task to verify an update package, see <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>.</p>
     * <ul>
     * <li>You can initiate update tasks for a maximum of 200 devices in each call. If you use a device list file, you can initiate update tasks for a maximum of 1,000,000 devices. However, you must call the <a href="https://help.aliyun.com/document_detail/186062.html">GenerateDeviceNameListURL</a> operation to generate a URL for the device list file. Then, you can perform the operations as prompted to upload the device list file.</li>
     * <li>When you initiate update tasks for multiple devices, the devices that already have the destination firmware versions are skipped.</li>
     * <li>Each device can be in the pending or updating status only in one update task. If you initiate another update task for a device that is in the pending or updating status, the update task fails.</li>
     * <li>You can create multiple static update batches by using a single update package.</li>
     * <li>Downloading update packages through the MQTT protocol is supported only in the China (Shanghai) region.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAStaticUpgradeJob  CreateOTAStaticUpgradeJobRequest
     * @return CreateOTAStaticUpgradeJobResponse
     */
    CompletableFuture<CreateOTAStaticUpgradeJobResponse> createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You must verify an update package before you push the package to devices for a batch update. Only verified update packages can be used to update devices in batches. You can call the <a href="https://help.aliyun.com/document_detail/147461.html">QueryOTAFirmware</a> operation to view the status of a verification task.</p>
     * <ul>
     * <li>You cannot initiate a verification task for an update package that is being verified or has been verified.</li>
     * <li>You can specify a maximum of 10 devices for a verification task.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAVerifyJob  CreateOTAVerifyJobRequest
     * @return CreateOTAVerifyJobResponse
     */
    CompletableFuture<CreateOTAVerifyJobResponse> createOTAVerifyJob(CreateOTAVerifyJobRequest request);

    /**
     * @param request the request parameters of CreateParser  CreateParserRequest
     * @return CreateParserResponse
     */
    CompletableFuture<CreateParserResponse> createParser(CreateParserRequest request);

    /**
     * @param request the request parameters of CreateParserDataSource  CreateParserDataSourceRequest
     * @return CreateParserDataSourceResponse
     */
    CompletableFuture<CreateParserDataSourceResponse> createParserDataSource(CreateParserDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>If a Thing Specification Language (TSL) model is required to create a product, you must set the <strong>AliyunCommodityCode</strong> parameter to iothub_senior and configure the <strong>DataFormat</strong> parameter.******** For more information, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>You cannot call this operation to distribute a product across accounts.</li>
     * <li>A product distribution task does not distribute the devices under the product.</li>
     * <li>After a product is distributed, you cannot modify its TSL model and scripts.</li>
     * <li>Each Alibaba Cloud account can create a maximum of 10 tasks to distribute products or devices. For more information about how to create a device distribution task, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).
     * **
     * <strong>Note</strong> RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProductDistributeJob  CreateProductDistributeJobRequest
     * @return CreateProductDistributeJobResponse
     */
    CompletableFuture<CreateProductDistributeJobResponse> createProductDistributeJob(CreateProductDistributeJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create a maximum of 10 tags for a product in a single call.</p>
     * <ul>
     * <li>Each product can have a maximum of 100 tags.<blockquote>
     * <p>You must specify the tag keys and tag values. Otherwise, the call fails. For description about the tag values, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProductTags  CreateProductTagsRequest
     * @return CreateProductTagsResponse
     */
    CompletableFuture<CreateProductTagsResponse> createProductTags(CreateProductTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 1 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProductTopic  CreateProductTopicRequest
     * @return CreateProductTopicResponse
     */
    CompletableFuture<CreateProductTopicResponse> createProductTopic(CreateProductTopicRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must specify the <strong>ProductKey</strong> parameter in the request.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Destination Alibaba Cloud services that are supported by the rules engine vary based on regions. For more information about the regions and destination cloud services that are supported by the rules engine, see <a href="https://help.aliyun.com/document_detail/85669.html">Regions and zones</a>.</li>
     * <li>You can create a maximum of 10 rule actions for each rule.</li>
     * <li>You can call this API operation to define rule actions to forward data to an IoT Platform topic, AMQP consumer group, or Alibaba Cloud service. The supported Alibaba Cloud services include Message Service (MNS), Function Compute, and Tablestore. If you need to forward data to ApsaraDB RDS, you must use the <a href="https://iot.console.aliyun.com">IoT Platform console</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRuleAction  CreateRuleActionRequest
     * @return CreateRuleActionResponse
     */
    CompletableFuture<CreateRuleActionResponse> createRuleAction(CreateRuleActionRequest request);

    /**
     * @param request the request parameters of CreateSceneRule  CreateSceneRuleRequest
     * @return CreateSceneRuleResponse
     */
    CompletableFuture<CreateSceneRuleResponse> createSceneRule(CreateSceneRuleRequest request);

    /**
     * @param request the request parameters of CreateSchedulePeriod  CreateSchedulePeriodRequest
     * @return CreateSchedulePeriodResponse
     */
    CompletableFuture<CreateSchedulePeriodResponse> createSchedulePeriod(CreateSchedulePeriodRequest request);

    /**
     * @param request the request parameters of CreateSharePromotionActivity  CreateSharePromotionActivityRequest
     * @return CreateSharePromotionActivityResponse
     */
    CompletableFuture<CreateSharePromotionActivityResponse> createSharePromotionActivity(CreateSharePromotionActivityRequest request);

    /**
     * @param request the request parameters of CreateSharePromotionSpeechModel  CreateSharePromotionSpeechModelRequest
     * @return CreateSharePromotionSpeechModelResponse
     */
    CompletableFuture<CreateSharePromotionSpeechModelResponse> createSharePromotionSpeechModel(CreateSharePromotionSpeechModelRequest request);

    /**
     * @param request the request parameters of CreateSoundCode  CreateSoundCodeRequest
     * @return CreateSoundCodeResponse
     */
    CompletableFuture<CreateSoundCodeResponse> createSoundCode(CreateSoundCodeRequest request);

    /**
     * @param request the request parameters of CreateSoundCodeLabel  CreateSoundCodeLabelRequest
     * @return CreateSoundCodeLabelResponse
     */
    CompletableFuture<CreateSoundCodeLabelResponse> createSoundCodeLabel(CreateSoundCodeLabelRequest request);

    /**
     * @param request the request parameters of CreateSoundCodeSchedule  CreateSoundCodeScheduleRequest
     * @return CreateSoundCodeScheduleResponse
     */
    CompletableFuture<CreateSoundCodeScheduleResponse> createSoundCodeSchedule(CreateSoundCodeScheduleRequest request);

    /**
     * @param request the request parameters of CreateSpeech  CreateSpeechRequest
     * @return CreateSpeechResponse
     */
    CompletableFuture<CreateSpeechResponse> createSpeech(CreateSpeechRequest request);

    /**
     * @param request the request parameters of CreateStudioAppDomainOpen  CreateStudioAppDomainOpenRequest
     * @return CreateStudioAppDomainOpenResponse
     */
    CompletableFuture<CreateStudioAppDomainOpenResponse> createStudioAppDomainOpen(CreateStudioAppDomainOpenRequest request);

    /**
     * <b>description</b> :
     * <p>Server-side subscriptions are categorized into the following two types:</p>
     * <ul>
     * <li>MNS subscription: pushes subscribed messages to MNS queues. Your server applications listen to MNS queues to receive device messages. For more information, see <a href="https://help.aliyun.com/document_detail/68948.html">Configure MNS server-side subscriptions</a>. You can call this operation to create an MNS subscription.</li>
     * <li>AMQP subscription: pushes subscribed messages to your server by using the AMQP channel. For more information, see <a href="https://help.aliyun.com/document_detail/142376.html">Configure AMQP server-side subscriptions</a>. To configure an AMQP subscription, perform the following steps:
     * 1\. Call the <a href="https://help.aliyun.com/document_detail/170388.html">CreateConsumerGroup</a> operation to create a consumer group and obtain the returned consumer group ID. Messages are pushed to the consumer group. The AMQP client carries the consumer group ID when the client connected to IoT Platform. For more information, see <a href="https://help.aliyun.com/document_detail/142489.html">Connect an AMQP client to IoT Platform</a>.
     * 2\. Call the CreateSubscribeRelation operation to create an AMQP subscription.
     * 3\. Optional. Call the <a href="https://help.aliyun.com/document_detail/170354.html">CreateConsumerGroupSubscribeRelation</a> operation to add a consumer group to the AMQP subscription. You can also call the <a href="https://help.aliyun.com/document_detail/170357.html">DeleteConsumerGroupSubscribeRelation</a> operation to remove a consumer group from an AMQP subscription.
     * 4\. Optional. Call the <a href="https://help.aliyun.com/document_detail/170358.html">QueryConsumerGroupStatus</a> operation to query the status of a consumer group, including online client information, message consumption rate, number of accumulated messages, and last message consumption time. You can also call the <a href="https://help.aliyun.com/document_detail/170355.html">ResetConsumerGroupPosition</a> operation to clear the accumulated messages of the consumer group.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSubscribeRelation  CreateSubscribeRelationRequest
     * @return CreateSubscribeRelationResponse
     */
    CompletableFuture<CreateSubscribeRelationResponse> createSubscribeRelation(CreateSubscribeRelationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Before you call the operation, you can use the <a href="https://github.com/everit-org/json-schema?spm=a2c4g.11186623.2.23.575832d9zD7fZb">json-schema</a> library to verify the input parameters in <strong>ThingModelJson</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</li>
     * <li>You can call this operation to add a maximum of 10 TSL features. TSL features include properties, services, and events.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateThingModel  CreateThingModelRequest
     * @return CreateThingModelResponse
     */
    CompletableFuture<CreateThingModelResponse> createThingModel(CreateThingModelRequest request);

    /**
     * <b>description</b> :
     * <p>A data parsing script is used to convert data submitted by devices into the JSON format. The data submitted by devices is in a custom format. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <blockquote>
     * <p>If the data format is <strong>Alink JSON</strong>, the CreateThingScript operation is not supported. Alink JSON is a standard data format that is defined by IoT Connectivity Alliance (ICA).</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateThingScript  CreateThingScriptRequest
     * @return CreateThingScriptResponse
     */
    CompletableFuture<CreateThingScriptResponse> createThingScript(CreateThingScriptRequest request);

    /**
     * @param request the request parameters of CreateTopicConfig  CreateTopicConfigRequest
     * @return CreateTopicConfigResponse
     */
    CompletableFuture<CreateTopicConfigResponse> createTopicConfig(CreateTopicConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 100 destination topics for a source topic.</li>
     * <li>The device to which the source topic belongs must be activated.</li>
     * <li>The source and destination topics support only custom topics.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTopicRouteTable  CreateTopicRouteTableRequest
     * @return CreateTopicRouteTableResponse
     */
    CompletableFuture<CreateTopicRouteTableResponse> createTopicRouteTable(CreateTopicRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/371985.html">QueryClientIds</a> operation to view the ClientIDs of a device and obtain the number of ClientIDs.</p>
     * <ul>
     * <li>After you call the DeleteClientIds operation, all ClientIDs of the device are deleted and cannot be resumed. To obtain a new ClientID, you can register the device again.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteClientIds  DeleteClientIdsRequest
     * @return DeleteClientIdsResponse
     */
    CompletableFuture<DeleteClientIdsResponse> deleteClientIds(DeleteClientIdsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You cannot delete the default consumer group provided by IoT Platform.</li>
     * <li>If the consumer group is associated with an AMQP subscription, you must disassociate the consumer group from the subscription. If the subscription has multiple consumer groups, you can call the <a href="https://help.aliyun.com/document_detail/170357.html">DeleteConsumerGroupSubscribeRelation</a> operation to remove the consumer group from the subscription. If the subscription has only one consumer group, you can call the <a href="https://help.aliyun.com/document_detail/170351.html">UpdateSubscribeRelation</a> operation to change the consumer group or call the <a href="https://help.aliyun.com/document_detail/170353.html">DeleteSubscribeRelation</a> operation to delete the subscription.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If the AMQP subscription has only one consumer group, you cannot call this operation to remove the consumer group.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConsumerGroupSubscribeRelation  DeleteConsumerGroupSubscribeRelationRequest
     * @return DeleteConsumerGroupSubscribeRelationResponse
     */
    CompletableFuture<DeleteConsumerGroupSubscribeRelationResponse> deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request);

    /**
     * @param request the request parameters of DeleteDataSourceItem  DeleteDataSourceItemRequest
     * @return DeleteDataSourceItemResponse
     */
    CompletableFuture<DeleteDataSourceItemResponse> deleteDataSourceItem(DeleteDataSourceItemRequest request);

    /**
     * @param request the request parameters of DeleteDestination  DeleteDestinationRequest
     * @return DeleteDestinationResponse
     */
    CompletableFuture<DeleteDestinationResponse> deleteDestination(DeleteDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call this operation with an Alibaba Cloud account, IoT Platform sends a verification code by text message to confirm your identity.</p>
     * <ul>
     * <li>When you call this operation with a RAM user, IoT Platform does not send a verification code. To ensure device security, you can create custom permission policies to perform fine-grained permission management. For more information, see <a href="https://help.aliyun.com/document_detail/47485.html">Mapping of IoT Platform operations and RAM policies</a> and <a href="https://help.aliyun.com/document_detail/47495.html">Custom permissions</a>.
     * <strong>Warning</strong></li>
     * <li>After a device is deleted, the device ID (<strong>IotId</strong>) becomes invalid, and all other information associated with the device is deleted. In addition, you can no longer perform an operation on the device.</li>
     * <li>Before you delete a device in the IoT Platform console, make sure that the corresponding actual device is offline. Otherwise, after the device is deleted from IoT Platform, the actual device continues to initiate connection requests to IoT Platform. If the number of requests exceeds the upper limit, IoT Platform starts request throttling. In this case, access of other devices within your Alibaba Cloud account is affected.</li>
     * <li>After you delete a device, the certificate of the device becomes invalid and cannot be restored. Proceed with caution.</li>
     * </ul>
     * <hr>
     * <ul>
     * <li>You must specify a value for the <strong>IotId</strong> parameter or values for the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters to identify a device.</li>
     * <li>If you specify a gateway and the number of sub-devices that belong to the gateway exceeds 2,000, you can call this operation to create a device job to delete the topological relationships in an asynchronous manner. The operation returns the <strong>JobId</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDevice  DeleteDeviceRequest
     * @return DeleteDeviceResponse
     */
    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDeviceDistributeJob  DeleteDeviceDistributeJobRequest
     * @return DeleteDeviceDistributeJobResponse
     */
    CompletableFuture<DeleteDeviceDistributeJobResponse> deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request);

    /**
     * @param request the request parameters of DeleteDeviceDynamicGroup  DeleteDeviceDynamicGroupRequest
     * @return DeleteDeviceDynamicGroupResponse
     */
    CompletableFuture<DeleteDeviceDynamicGroupResponse> deleteDeviceDynamicGroup(DeleteDeviceDynamicGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceFile  DeleteDeviceFileRequest
     * @return DeleteDeviceFileResponse
     */
    CompletableFuture<DeleteDeviceFileResponse> deleteDeviceFile(DeleteDeviceFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceGroup  DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     */
    CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroup(DeleteDeviceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceProp  DeleteDevicePropRequest
     * @return DeleteDevicePropResponse
     */
    CompletableFuture<DeleteDevicePropResponse> deleteDeviceProp(DeleteDevicePropRequest request);

    /**
     * @param request the request parameters of DeleteDeviceSpeech  DeleteDeviceSpeechRequest
     * @return DeleteDeviceSpeechResponse
     */
    CompletableFuture<DeleteDeviceSpeechResponse> deleteDeviceSpeech(DeleteDeviceSpeechRequest request);

    /**
     * @param request the request parameters of DeleteDeviceTunnel  DeleteDeviceTunnelRequest
     * @return DeleteDeviceTunnelResponse
     */
    CompletableFuture<DeleteDeviceTunnelResponse> deleteDeviceTunnel(DeleteDeviceTunnelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You are not allowed to delete a driver that has a published version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEdgeDriver  DeleteEdgeDriverRequest
     * @return DeleteEdgeDriverResponse
     */
    CompletableFuture<DeleteEdgeDriverResponse> deleteEdgeDriver(DeleteEdgeDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You are not allowed to delete a published driver version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEdgeDriverVersion  DeleteEdgeDriverVersionRequest
     * @return DeleteEdgeDriverVersionResponse
     */
    CompletableFuture<DeleteEdgeDriverVersionResponse> deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteEdgeInstance  DeleteEdgeInstanceRequest
     * @return DeleteEdgeInstanceResponse
     */
    CompletableFuture<DeleteEdgeInstanceResponse> deleteEdgeInstance(DeleteEdgeInstanceRequest request);

    /**
     * @param request the request parameters of DeleteEdgeInstanceMessageRouting  DeleteEdgeInstanceMessageRoutingRequest
     * @return DeleteEdgeInstanceMessageRoutingResponse
     */
    CompletableFuture<DeleteEdgeInstanceMessageRoutingResponse> deleteEdgeInstanceMessageRouting(DeleteEdgeInstanceMessageRoutingRequest request);

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteOTAFirmware  DeleteOTAFirmwareRequest
     * @return DeleteOTAFirmwareResponse
     */
    CompletableFuture<DeleteOTAFirmwareResponse> deleteOTAFirmware(DeleteOTAFirmwareRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The default module cannot be deleted.</li>
     * <li>If an update package exists in an OTA module, you cannot delete the OTA module.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteOTAModule  DeleteOTAModuleRequest
     * @return DeleteOTAModuleResponse
     */
    CompletableFuture<DeleteOTAModuleResponse> deleteOTAModule(DeleteOTAModuleRequest request);

    /**
     * @param request the request parameters of DeleteParser  DeleteParserRequest
     * @return DeleteParserResponse
     */
    CompletableFuture<DeleteParserResponse> deleteParser(DeleteParserRequest request);

    /**
     * @param request the request parameters of DeleteParserDataSource  DeleteParserDataSourceRequest
     * @return DeleteParserDataSourceResponse
     */
    CompletableFuture<DeleteParserDataSourceResponse> deleteParserDataSource(DeleteParserDataSourceRequest request);

    /**
     * @param request the request parameters of DeletePowerStation  DeletePowerStationRequest
     * @return DeletePowerStationResponse
     */
    CompletableFuture<DeletePowerStationResponse> deletePowerStation(DeletePowerStationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After a product is deleted, the ProductKey of the product is invalid. The related information about the product is also deleted. You cannot perform the required operations on the product.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can delete a maximum of 10 tags in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProductTags  DeleteProductTagsRequest
     * @return DeleteProductTagsResponse
     */
    CompletableFuture<DeleteProductTagsResponse> deleteProductTags(DeleteProductTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteProductTopic  DeleteProductTopicRequest
     * @return DeleteProductTopicResponse
     */
    CompletableFuture<DeleteProductTopicResponse> deleteProductTopic(DeleteProductTopicRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRuleAction  DeleteRuleActionRequest
     * @return DeleteRuleActionResponse
     */
    CompletableFuture<DeleteRuleActionResponse> deleteRuleAction(DeleteRuleActionRequest request);

    /**
     * @param request the request parameters of DeleteSceneRule  DeleteSceneRuleRequest
     * @return DeleteSceneRuleResponse
     */
    CompletableFuture<DeleteSceneRuleResponse> deleteSceneRule(DeleteSceneRuleRequest request);

    /**
     * @param request the request parameters of DeleteSchedulePeriod  DeleteSchedulePeriodRequest
     * @return DeleteSchedulePeriodResponse
     */
    CompletableFuture<DeleteSchedulePeriodResponse> deleteSchedulePeriod(DeleteSchedulePeriodRequest request);

    /**
     * @param request the request parameters of DeleteShareTaskDevice  DeleteShareTaskDeviceRequest
     * @return DeleteShareTaskDeviceResponse
     */
    CompletableFuture<DeleteShareTaskDeviceResponse> deleteShareTaskDevice(DeleteShareTaskDeviceRequest request);

    /**
     * @param request the request parameters of DeleteSoundCode  DeleteSoundCodeRequest
     * @return DeleteSoundCodeResponse
     */
    CompletableFuture<DeleteSoundCodeResponse> deleteSoundCode(DeleteSoundCodeRequest request);

    /**
     * @param request the request parameters of DeleteSoundCodeLabel  DeleteSoundCodeLabelRequest
     * @return DeleteSoundCodeLabelResponse
     */
    CompletableFuture<DeleteSoundCodeLabelResponse> deleteSoundCodeLabel(DeleteSoundCodeLabelRequest request);

    /**
     * @param request the request parameters of DeleteSoundCodeSchedule  DeleteSoundCodeScheduleRequest
     * @return DeleteSoundCodeScheduleResponse
     */
    CompletableFuture<DeleteSoundCodeScheduleResponse> deleteSoundCodeSchedule(DeleteSoundCodeScheduleRequest request);

    /**
     * @param request the request parameters of DeleteSpeech  DeleteSpeechRequest
     * @return DeleteSpeechResponse
     */
    CompletableFuture<DeleteSpeechResponse> deleteSpeech(DeleteSpeechRequest request);

    /**
     * @param request the request parameters of DeleteStudioAppDomainOpen  DeleteStudioAppDomainOpenRequest
     * @return DeleteStudioAppDomainOpenResponse
     */
    CompletableFuture<DeleteStudioAppDomainOpenResponse> deleteStudioAppDomainOpen(DeleteStudioAppDomainOpenRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteSubscribeRelation  DeleteSubscribeRelationRequest
     * @return DeleteSubscribeRelationResponse
     */
    CompletableFuture<DeleteSubscribeRelationResponse> deleteSubscribeRelation(DeleteSubscribeRelationRequest request);

    /**
     * <b>description</b> :
     * <p>  If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call the DeleteThingModel operation.</p>
     * <ul>
     * <li>If an existing feature or custom TSL module in a product is not published, you can call the DeleteThingModel operation to remove the feature or delete the custom TSL module.</li>
     * <li>When you call the DeleteThingModel operation, you must specify a value for the <strong>ProductKey</strong> parameter. The following list describes how the DeleteThingModel operation works:<ul>
     * <li>If you specify a value only for the <strong>ProductKey</strong> parameter, the operation deletes all custom TSL modules and removes all features in the default TSL module from the specified product.</li>
     * <li>If you specify values only for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters, the operation deletes the specified custom TSL module from the specified product.</li>
     * <li>If you specify a value for the <strong>ProductKey</strong> parameter and a value for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from the default TSL module of the specified product. The operation removes the specified features only if the features exist. If the value that you specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter does not exist in the default TSL module, the operation returns the same result as when you specify a value only for the <strong>ProductKey</strong> parameter.</li>
     * <li>If you specify values for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters and a value for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from a specified custom TSL module in a specified product. The operation removes the specified features only if the features exist. If the value that you specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter does not exist, the operation returns the same result as when you specify values only for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters.<blockquote>
     * <p>You must specify up to 10 identifiers for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>After you call the DeleteThingModel operation to remove one or more features from a product, you must call the <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a> operation to re-publish the TSL model of the product. This way, the change takes effect.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteThingModel  DeleteThingModelRequest
     * @return DeleteThingModelResponse
     */
    CompletableFuture<DeleteThingModelResponse> deleteThingModel(DeleteThingModelRequest request);

    /**
     * @param request the request parameters of DeleteTopicConfig  DeleteTopicConfigRequest
     * @return DeleteTopicConfigResponse
     */
    CompletableFuture<DeleteTopicConfigResponse> deleteTopicConfig(DeleteTopicConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteTopicRouteTable  DeleteTopicRouteTableRequest
     * @return DeleteTopicRouteTableResponse
     */
    CompletableFuture<DeleteTopicRouteTableResponse> deleteTopicRouteTable(DeleteTopicRouteTableRequest request);

    /**
     * @param request the request parameters of DeleteUserDefineTableDataByPrimaryKey  DeleteUserDefineTableDataByPrimaryKeyRequest
     * @return DeleteUserDefineTableDataByPrimaryKeyResponse
     */
    CompletableFuture<DeleteUserDefineTableDataByPrimaryKeyResponse> deleteUserDefineTableDataByPrimaryKey(DeleteUserDefineTableDataByPrimaryKeyRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DetachDestination  DetachDestinationRequest
     * @return DetachDestinationResponse
     */
    CompletableFuture<DetachDestinationResponse> detachDestination(DetachDestinationRequest request);

    /**
     * @param request the request parameters of DetachParserDataSource  DetachParserDataSourceRequest
     * @return DetachParserDataSourceResponse
     */
    CompletableFuture<DetachParserDataSourceResponse> detachParserDataSource(DetachParserDataSourceRequest request);

    /**
     * @param request the request parameters of DisableDeviceTunnel  DisableDeviceTunnelRequest
     * @return DisableDeviceTunnelResponse
     */
    CompletableFuture<DisableDeviceTunnelResponse> disableDeviceTunnel(DisableDeviceTunnelRequest request);

    /**
     * @param request the request parameters of DisableDeviceTunnelShare  DisableDeviceTunnelShareRequest
     * @return DisableDeviceTunnelShareResponse
     */
    CompletableFuture<DisableDeviceTunnelShareResponse> disableDeviceTunnelShare(DisableDeviceTunnelShareRequest request);

    /**
     * @param request the request parameters of DisableSceneRule  DisableSceneRuleRequest
     * @return DisableSceneRuleResponse
     */
    CompletableFuture<DisableSceneRuleResponse> disableSceneRule(DisableSceneRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After a device is disabled, you cannot connect the device to IoT Platform. You can perform device-specific operations on the device. However, the information about the device is still retained in IoT Platform. You can use the <a href="https://help.aliyun.com/document_detail/69603.html">EnableThing</a> API operation to connect the disabled device to IoT Platform again.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableThing  DisableThingRequest
     * @return DisableThingResponse
     */
    CompletableFuture<DisableThingResponse> disableThing(DisableThingRequest request);

    /**
     * @param request the request parameters of EnableDeviceTunnel  EnableDeviceTunnelRequest
     * @return EnableDeviceTunnelResponse
     */
    CompletableFuture<EnableDeviceTunnelResponse> enableDeviceTunnel(EnableDeviceTunnelRequest request);

    /**
     * @param request the request parameters of EnableDeviceTunnelShare  EnableDeviceTunnelShareRequest
     * @return EnableDeviceTunnelShareResponse
     */
    CompletableFuture<EnableDeviceTunnelShareResponse> enableDeviceTunnelShare(EnableDeviceTunnelShareRequest request);

    /**
     * @param request the request parameters of EnableSceneRule  EnableSceneRuleRequest
     * @return EnableSceneRuleResponse
     */
    CompletableFuture<EnableSceneRuleResponse> enableSceneRule(EnableSceneRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableThing  EnableThingRequest
     * @return EnableThingResponse
     */
    CompletableFuture<EnableThingResponse> enableThing(EnableThingRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be used with other operations to upload a device list file. Procedure:</p>
     * <ol>
     * <li>Call this operation to generate the information of a device list file that you want to upload to OSS.<br>The response parameters of this API operation include:
     * The following request parameters of the OSS <a href="/help/en/object-storage-service/latest/postobject">PostObject</a> operation that is used to upload the device list file: <strong>Key</strong>, <strong>AccessKeyId</strong>, <strong>Signature</strong>, and <strong>Policy</strong>.  </li>
     * <li>Use an <a href="/help/en/object-storage-service/latest/sdk-code-samples-overview">OSS SDK</a> to call the <a href="/help/en/object-storage-service/latest/postobject">PostObject</a> operation to upload the device list file within 1 minute after a response is returned. For more information about sample code, see the &quot;Usage of response parameters&quot; section in this topic.  <blockquote>
     * <p> The parameter information that is returned by this operation is valid for 1 minute. You must upload the device list file within 1 minute.  3. After you upload the device list file, call the <a href="/help/en/iot-platform/latest/e1qtmo">CreateOTAStaticUpgradeJob</a> operation of IoT Platform to create a static update batch within 60 minutes.<br>If you upload device list files but you do not call the CreateOTAStaticUpgradeJob operation to create a static update batch, the system automatically deletes the uploaded files. The system deletes files on a regular basis.</p>
     * </blockquote>
     * </li>
     * </ol>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account. </p>
     * </blockquote>
     * <h2>Requirements</h2>
     * <ul>
     * <li>A device list file contains the names of devices. Separate multiple device names with line feeds. Each line contains only one device name. A device list file must be in the CSV format. The maximum size of a device list file is 5 MB.</li>
     * <li>Each device list file can contain up to 10,000 names for the devices in a product that is related to an update package. If the number of device names in a device list file exceeds the limit, an error occurs when you use the file to create a static update batch.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDeviceNameListURL  GenerateDeviceNameListURLRequest
     * @return GenerateDeviceNameListURLResponse
     */
    CompletableFuture<GenerateDeviceNameListURLResponse> generateDeviceNameListURL(GenerateDeviceNameListURLRequest request);

    /**
     * @param request the request parameters of GenerateFileUploadURL  GenerateFileUploadURLRequest
     * @return GenerateFileUploadURLResponse
     */
    CompletableFuture<GenerateFileUploadURLResponse> generateFileUploadURL(GenerateFileUploadURLRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be used together with other operations to create an update package. Procedure:
     * 1\. Call this API operation to generate the details of an update package file that you want to upload to OSS.
     * The following section describes the response parameters of this API operation:</p>
     * <ul>
     * <li>The following request parameters of the OSS <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation that is used to upload the update package file: <strong>Key</strong>, <strong>OSSAccessKeyId</strong>, <strong>Signature</strong>, and <strong>Policy</strong>.</li>
     * <li>The following request parameter of the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation that is used to create the update package: <strong>FirmwareUrl</strong>.
     * 2\. Use an <a href="https://help.aliyun.com/document_detail/52834.html">OSS SDK</a> to call the <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation to upload the update package file. For more information about sample code, see the &quot;Usage of response parameters&quot; section.<blockquote>
     * <p>The parameter information that is returned by this operation is valid for 1 minute. You must upload the update package file within 1 minute. The maximum size of the uploaded update package file is 1,000 MB.
     * 3\. After the update package file is uploaded, call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create an update package within 60 minutes.
     * If update package files are uploaded but you do not call the CreateOTAFirmware operation to create update packages for the files, the uploaded files are automatically deleted by the system on a regular basis.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateOTAUploadURL  GenerateOTAUploadURLRequest
     * @return GenerateOTAUploadURLResponse
     */
    CompletableFuture<GenerateOTAUploadURLResponse> generateOTAUploadURL(GenerateOTAUploadURLRequest request);

    /**
     * @param request the request parameters of GetDataAPIServiceDetail  GetDataAPIServiceDetailRequest
     * @return GetDataAPIServiceDetailResponse
     */
    CompletableFuture<GetDataAPIServiceDetailResponse> getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request);

    /**
     * @param request the request parameters of GetDestination  GetDestinationRequest
     * @return GetDestinationResponse
     */
    CompletableFuture<GetDestinationResponse> getDestination(GetDestinationRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 500 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetDeviceShadow  GetDeviceShadowRequest
     * @return GetDeviceShadowResponse
     */
    CompletableFuture<GetDeviceShadowResponse> getDeviceShadow(GetDeviceShadowRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetDeviceStatus  GetDeviceStatusRequest
     * @return GetDeviceStatusResponse
     */
    CompletableFuture<GetDeviceStatusResponse> getDeviceStatus(GetDeviceStatusRequest request);

    /**
     * @param request the request parameters of GetDeviceTunnelShareStatus  GetDeviceTunnelShareStatusRequest
     * @return GetDeviceTunnelShareStatusResponse
     */
    CompletableFuture<GetDeviceTunnelShareStatusResponse> getDeviceTunnelShareStatus(GetDeviceTunnelShareStatusRequest request);

    /**
     * @param request the request parameters of GetDeviceTunnelStatus  GetDeviceTunnelStatusRequest
     * @return GetDeviceTunnelStatusResponse
     */
    CompletableFuture<GetDeviceTunnelStatusResponse> getDeviceTunnelStatus(GetDeviceTunnelStatusRequest request);

    /**
     * @param request the request parameters of GetDownloadFile  GetDownloadFileRequest
     * @return GetDownloadFileResponse
     */
    CompletableFuture<GetDownloadFileResponse> getDownloadFile(GetDownloadFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeDriverVersion  GetEdgeDriverVersionRequest
     * @return GetEdgeDriverVersionResponse
     */
    CompletableFuture<GetEdgeDriverVersionResponse> getEdgeDriverVersion(GetEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeInstance  GetEdgeInstanceRequest
     * @return GetEdgeInstanceResponse
     */
    CompletableFuture<GetEdgeInstanceResponse> getEdgeInstance(GetEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeInstanceDeployment  GetEdgeInstanceDeploymentRequest
     * @return GetEdgeInstanceDeploymentResponse
     */
    CompletableFuture<GetEdgeInstanceDeploymentResponse> getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request);

    /**
     * @param request the request parameters of GetEdgeInstanceMessageRouting  GetEdgeInstanceMessageRoutingRequest
     * @return GetEdgeInstanceMessageRoutingResponse
     */
    CompletableFuture<GetEdgeInstanceMessageRoutingResponse> getEdgeInstanceMessageRouting(GetEdgeInstanceMessageRoutingRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetGatewayBySubDevice  GetGatewayBySubDeviceRequest
     * @return GetGatewayBySubDeviceResponse
     */
    CompletableFuture<GetGatewayBySubDeviceResponse> getGatewayBySubDevice(GetGatewayBySubDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetLoraNodesTask  GetLoraNodesTaskRequest
     * @return GetLoraNodesTaskResponse
     */
    CompletableFuture<GetLoraNodesTaskResponse> getLoraNodesTask(GetLoraNodesTaskRequest request);

    /**
     * @param request the request parameters of GetParser  GetParserRequest
     * @return GetParserResponse
     */
    CompletableFuture<GetParserResponse> getParser(GetParserRequest request);

    /**
     * @param request the request parameters of GetParserDataSource  GetParserDataSourceRequest
     * @return GetParserDataSourceResponse
     */
    CompletableFuture<GetParserDataSourceResponse> getParserDataSource(GetParserDataSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of GetRuleAction  GetRuleActionRequest
     * @return GetRuleActionResponse
     */
    CompletableFuture<GetRuleActionResponse> getRuleAction(GetRuleActionRequest request);

    /**
     * @param request the request parameters of GetSceneRule  GetSceneRuleRequest
     * @return GetSceneRuleResponse
     */
    CompletableFuture<GetSceneRuleResponse> getSceneRule(GetSceneRuleRequest request);

    /**
     * @param request the request parameters of GetShareSpeechModelAudio  GetShareSpeechModelAudioRequest
     * @return GetShareSpeechModelAudioResponse
     */
    CompletableFuture<GetShareSpeechModelAudioResponse> getShareSpeechModelAudio(GetShareSpeechModelAudioRequest request);

    /**
     * @param request the request parameters of GetShareTaskByDeviceOpen  GetShareTaskByDeviceOpenRequest
     * @return GetShareTaskByDeviceOpenResponse
     */
    CompletableFuture<GetShareTaskByDeviceOpenResponse> getShareTaskByDeviceOpen(GetShareTaskByDeviceOpenRequest request);

    /**
     * @param request the request parameters of GetSoundCodeAudio  GetSoundCodeAudioRequest
     * @return GetSoundCodeAudioResponse
     */
    CompletableFuture<GetSoundCodeAudioResponse> getSoundCodeAudio(GetSoundCodeAudioRequest request);

    /**
     * @param request the request parameters of GetSoundCodeSchedule  GetSoundCodeScheduleRequest
     * @return GetSoundCodeScheduleResponse
     */
    CompletableFuture<GetSoundCodeScheduleResponse> getSoundCodeSchedule(GetSoundCodeScheduleRequest request);

    /**
     * @param request the request parameters of GetSpeechDeviceDetail  GetSpeechDeviceDetailRequest
     * @return GetSpeechDeviceDetailResponse
     */
    CompletableFuture<GetSpeechDeviceDetailResponse> getSpeechDeviceDetail(GetSpeechDeviceDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetSpeechLicenseDeviceStatistics  GetSpeechLicenseDeviceStatisticsRequest
     * @return GetSpeechLicenseDeviceStatisticsResponse
     */
    CompletableFuture<GetSpeechLicenseDeviceStatisticsResponse> getSpeechLicenseDeviceStatistics(GetSpeechLicenseDeviceStatisticsRequest request);

    /**
     * @param request the request parameters of GetSpeechVoice  GetSpeechVoiceRequest
     * @return GetSpeechVoiceResponse
     */
    CompletableFuture<GetSpeechVoiceResponse> getSpeechVoice(GetSpeechVoiceRequest request);

    /**
     * @param request the request parameters of GetStudioAppTokenOpen  GetStudioAppTokenOpenRequest
     * @return GetStudioAppTokenOpenResponse
     */
    CompletableFuture<GetStudioAppTokenOpenResponse> getStudioAppTokenOpen(GetStudioAppTokenOpenRequest request);

    /**
     * @param request the request parameters of GetThingModelStatusInner  GetThingModelStatusInnerRequest
     * @return GetThingModelStatusInnerResponse
     */
    CompletableFuture<GetThingModelStatusInnerResponse> getThingModelStatusInner(GetThingModelStatusInnerRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of GetThingModelTsl  GetThingModelTslRequest
     * @return GetThingModelTslResponse
     */
    CompletableFuture<GetThingModelTslResponse> getThingModelTsl(GetThingModelTslRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingModelTslPublished  GetThingModelTslPublishedRequest
     * @return GetThingModelTslPublishedResponse
     */
    CompletableFuture<GetThingModelTslPublishedResponse> getThingModelTslPublished(GetThingModelTslPublishedRequest request);

    /**
     * <b>description</b> :
     * <p>  A data parsing script is used to convert the custom-formatted data to JSON data after the data is submitted by a device. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetThingScript  GetThingScriptRequest
     * @return GetThingScriptResponse
     */
    CompletableFuture<GetThingScriptResponse> getThingScript(GetThingScriptRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingTemplate  GetThingTemplateRequest
     * @return GetThingTemplateResponse
     */
    CompletableFuture<GetThingTemplateResponse> getThingTemplate(GetThingTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can initiate a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingTopo  GetThingTopoRequest
     * @return GetThingTopoResponse
     */
    CompletableFuture<GetThingTopoResponse> getThingTopo(GetThingTopoRequest request);

    /**
     * @param request the request parameters of GisQueryDeviceLocation  GisQueryDeviceLocationRequest
     * @return GisQueryDeviceLocationResponse
     */
    CompletableFuture<GisQueryDeviceLocationResponse> gisQueryDeviceLocation(GisQueryDeviceLocationRequest request);

    /**
     * @param request the request parameters of GisSearchDeviceTrace  GisSearchDeviceTraceRequest
     * @return GisSearchDeviceTraceResponse
     */
    CompletableFuture<GisSearchDeviceTraceResponse> gisSearchDeviceTrace(GisSearchDeviceTraceRequest request);

    /**
     * @param request the request parameters of ImportDTData  ImportDTDataRequest
     * @return ImportDTDataResponse
     */
    CompletableFuture<ImportDTDataResponse> importDTData(ImportDTDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that an MQTT gateway and the related product are created and the <strong>ProductKey</strong> of the product is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/433804.html">Create an MQTT gateway</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ImportDevice  ImportDeviceRequest
     * @return ImportDeviceResponse
     */
    CompletableFuture<ImportDeviceResponse> importDevice(ImportDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportThingModelTsl  ImportThingModelTslRequest
     * @return ImportThingModelTslResponse
     */
    CompletableFuture<ImportThingModelTslResponse> importThingModelTsl(ImportThingModelTslRequest request);

    /**
     * @param request the request parameters of InvokeDataAPIService  InvokeDataAPIServiceRequest
     * @return InvokeDataAPIServiceResponse
     */
    CompletableFuture<InvokeDataAPIServiceResponse> invokeDataAPIService(InvokeDataAPIServiceRequest request);

    /**
     * <b>description</b> :
     * <p>When you define a service in a Thing Specification Language (TSL) model, the mode in which the service is called is specified. When you call a service by using this operation, IoT Platform uses a call mode based on the value of the <strong>Identifier</strong> parameter.</p>
     * <ul>
     * <li>Synchronous mode: IoT Platform sends a revert-remote procedure call (RRPC) request to a device. Then, the device synchronously returns an RRPC response. For more information about how to use an RRPC, see <a href="https://help.aliyun.com/document_detail/90567.html">What is RRPC?</a></li>
     * <li>Asynchronous mode: IoT Platform sends an RRPC request to a device. Then, the device asynchronously returns an RRPC response. For more information about topics, see <a href="https://help.aliyun.com/document_detail/89301.html">Device properties, events, and services</a>.<blockquote>
     * <p>If you set the Checksum Type parameter to <strong>Verification-free</strong> when you create a product, the asynchronous mode is used.
     * When the device receives the service call, the device returns a response to the service caller. When you configure the device, you must specify the response logic and response parameters. The data formats of response parameters must comply with the Alink protocol. Example:</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
     *     &quot;id&quot;: &quot;58***89&quot;,
     *     &quot;code&quot;: 200,
     *     &quot;data&quot;: {},
     *     &quot;message&quot;: &quot;success&quot;,
     *     &quot;localizedMsg&quot;: &quot;localizedMsg&quot;
     * }
     * </code></pre>
     * <blockquote>
     * <ul>
     * <li>The <strong>id</strong> parameter specifies the unique identifier of the request. The ID is generated by IoT Platform. The device can obtain the ID from the request parameters and then return the ID.</li>
     * <li>The <strong>code</strong> parameter specifies the result of the service call. The value of the parameter is an integer.</li>
     * <li>The <strong>data</strong> parameter specifies the result of the service call. This parameter is returned to the service caller. You can configure the parameters that you want to include in the returned result. The data must be in the JSON format.</li>
     * <li>The <strong>message</strong> and <strong>localizedMsg</strong> parameters are optional.</li>
     * <li>Link SDK for C of IoT Platform provides an example on how to use a TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/258239.html">Call device services</a>.</li>
     * </ul>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>If you synchronously call a service, the timeout period is 8 seconds. If a server does not receive a response within 8 seconds, a timeout error occurs. No limit is imposed on the timeout period of asynchronous calls. </p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InvokeThingService  InvokeThingServiceRequest
     * @return InvokeThingServiceResponse
     */
    CompletableFuture<InvokeThingServiceResponse> invokeThingService(InvokeThingServiceRequest request);

    /**
     * <b>description</b> :
     * <p>You can only asynchronously call this operation.
     * When the device receives the service call, the device returns a response to the service caller. When you configure the device, you must specify the response logic and response parameters. The data formats of response parameters must comply with the Alink protocol. Example:</p>
     * <pre><code>{
     *     &quot;id&quot;: &quot;58***89&quot;,
     *     &quot;code&quot;: 200,
     *     &quot;data&quot;: {},
     *     &quot;message&quot;: &quot;success&quot;,
     *     &quot;localizedMsg&quot;: &quot;localizedMsg&quot;
     * }
     * </code></pre>
     * <blockquote>
     * <ul>
     * <li>The <strong>id</strong> parameter specifies the unique identifier of the request. The ID is generated by IoT Platform. The device can obtain the ID from the request parameters and return the ID.</li>
     * <li>The <strong>code</strong> parameter specifies the result of the service call. The value of the parameter is an integer.</li>
     * <li>The <strong>data</strong> parameter specifies the result of the service call. This parameter is returned to the service caller. You can specify the parameters included in the returned result. The data must be in JSON format.</li>
     * <li>The <strong>message</strong> and <strong>localizedMsg</strong> parameters are optional.</li>
     * <li>Link SDK for C of IoT Platform provides an example on how to use a TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/258239.html">Call device services</a>.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InvokeThingsService  InvokeThingsServiceRequest
     * @return InvokeThingsServiceResponse
     */
    CompletableFuture<InvokeThingsServiceResponse> invokeThingsService(InvokeThingsServiceRequest request);

    /**
     * @param request the request parameters of ListAnalyticsData  ListAnalyticsDataRequest
     * @return ListAnalyticsDataResponse
     */
    CompletableFuture<ListAnalyticsDataResponse> listAnalyticsData(ListAnalyticsDataRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDataSourceItem  ListDataSourceItemRequest
     * @return ListDataSourceItemResponse
     */
    CompletableFuture<ListDataSourceItemResponse> listDataSourceItem(ListDataSourceItemRequest request);

    /**
     * @param request the request parameters of ListDestination  ListDestinationRequest
     * @return ListDestinationResponse
     */
    CompletableFuture<ListDestinationResponse> listDestination(ListDestinationRequest request);

    /**
     * <b>description</b> :
     * <p>If you use an Enterprise Edition instance, you must specify the <strong>IotInstanceId</strong> parameter when you call this operation. Otherwise, the call fails.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDeviceDistributeJob  ListDeviceDistributeJobRequest
     * @return ListDeviceDistributeJobResponse
     */
    CompletableFuture<ListDeviceDistributeJobResponse> listDeviceDistributeJob(ListDeviceDistributeJobRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * <li>Multiple Alibaba Cloud accounts can run a maximum of 200 QPS at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDistributedDevice  ListDistributedDeviceRequest
     * @return ListDistributedDeviceResponse
     */
    CompletableFuture<ListDistributedDeviceResponse> listDistributedDevice(ListDistributedDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDistributedProduct  ListDistributedProductRequest
     * @return ListDistributedProductResponse
     */
    CompletableFuture<ListDistributedProductResponse> listDistributedProduct(ListDistributedProductRequest request);

    /**
     * @param request the request parameters of ListJob  ListJobRequest
     * @return ListJobResponse
     */
    CompletableFuture<ListJobResponse> listJob(ListJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAFirmware  ListOTAFirmwareRequest
     * @return ListOTAFirmwareResponse
     */
    CompletableFuture<ListOTAFirmwareResponse> listOTAFirmware(ListOTAFirmwareRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAJobByDevice  ListOTAJobByDeviceRequest
     * @return ListOTAJobByDeviceResponse
     */
    CompletableFuture<ListOTAJobByDeviceResponse> listOTAJobByDevice(ListOTAJobByDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAJobByFirmware  ListOTAJobByFirmwareRequest
     * @return ListOTAJobByFirmwareResponse
     */
    CompletableFuture<ListOTAJobByFirmwareResponse> listOTAJobByFirmware(ListOTAJobByFirmwareRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAModuleByProduct  ListOTAModuleByProductRequest
     * @return ListOTAModuleByProductResponse
     */
    CompletableFuture<ListOTAModuleByProductResponse> listOTAModuleByProduct(ListOTAModuleByProductRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAModuleVersionsByDevice  ListOTAModuleVersionsByDeviceRequest
     * @return ListOTAModuleVersionsByDeviceResponse
     */
    CompletableFuture<ListOTAModuleVersionsByDeviceResponse> listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTATaskByJob  ListOTATaskByJobRequest
     * @return ListOTATaskByJobResponse
     */
    CompletableFuture<ListOTATaskByJobResponse> listOTATaskByJob(ListOTATaskByJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAUnfinishedTaskByDevice  ListOTAUnfinishedTaskByDeviceRequest
     * @return ListOTAUnfinishedTaskByDeviceResponse
     */
    CompletableFuture<ListOTAUnfinishedTaskByDeviceResponse> listOTAUnfinishedTaskByDevice(ListOTAUnfinishedTaskByDeviceRequest request);

    /**
     * @param request the request parameters of ListParser  ListParserRequest
     * @return ListParserResponse
     */
    CompletableFuture<ListParserResponse> listParser(ListParserRequest request);

    /**
     * @param request the request parameters of ListParserDataSource  ListParserDataSourceRequest
     * @return ListParserDataSourceResponse
     */
    CompletableFuture<ListParserDataSourceResponse> listParserDataSource(ListParserDataSourceRequest request);

    /**
     * @param request the request parameters of ListParserDestination  ListParserDestinationRequest
     * @return ListParserDestinationResponse
     */
    CompletableFuture<ListParserDestinationResponse> listParserDestination(ListParserDestinationRequest request);

    /**
     * @param request the request parameters of ListPowerStation  ListPowerStationRequest
     * @return ListPowerStationResponse
     */
    CompletableFuture<ListPowerStationResponse> listPowerStation(ListPowerStationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * <li>You can specify a tag key or a tag key-value pair for search.</li>
     * <li>If you specify multiple tags, the logical relationship among these tags is <strong>OR</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListProductByTags  ListProductByTagsRequest
     * @return ListProductByTagsResponse
     */
    CompletableFuture<ListProductByTagsResponse> listProductByTags(ListProductByTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListProductTags  ListProductTagsRequest
     * @return ListProductTagsResponse
     */
    CompletableFuture<ListProductTagsResponse> listProductTags(ListProductTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 20 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRule  ListRuleRequest
     * @return ListRuleResponse
     */
    CompletableFuture<ListRuleResponse> listRule(ListRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRuleActions  ListRuleActionsRequest
     * @return ListRuleActionsResponse
     */
    CompletableFuture<ListRuleActionsResponse> listRuleActions(ListRuleActionsRequest request);

    /**
     * @param request the request parameters of ListTask  ListTaskRequest
     * @return ListTaskResponse
     */
    CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can manage TSL models by version. After you import a TSL model by calling the <a href="https://help.aliyun.com/document_detail/150320.html">ImportThingModelTsl</a> operation, copy a TSL model by calling the <a href="https://help.aliyun.com/document_detail/150322.html">CopyThingModel</a> operation, or edit a TSL model, you must publish the TSL model by calling the <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a> operation. Then, the TSL model can be used. Each time a TSL model of a product is published, a new version is generated.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListThingModelVersion  ListThingModelVersionRequest
     * @return ListThingModelVersionResponse
     */
    CompletableFuture<ListThingModelVersionResponse> listThingModelVersion(ListThingModelVersionRequest request);

    /**
     * <b>description</b> :
     * <p>IoT Platform provides product categories that have defined TSL models, such as street lamps, vehicle location cards, and water immersion detectors.
     * When you call the <a href="https://help.aliyun.com/document_detail/69123.html">CreateProduct</a> operation to create a product, you can set the CategoryKey parameter to specify a product category. The product that you create references the standardized TSL model of the specified category.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListThingTemplates  ListThingTemplatesRequest
     * @return ListThingTemplatesResponse
     */
    CompletableFuture<ListThingTemplatesResponse> listThingTemplates(ListThingTemplatesRequest request);

    /**
     * @param request the request parameters of ModifyOTAFirmware  ModifyOTAFirmwareRequest
     * @return ModifyOTAFirmwareResponse
     */
    CompletableFuture<ModifyOTAFirmwareResponse> modifyOTAFirmware(ModifyOTAFirmwareRequest request);

    /**
     * @param request the request parameters of ModifyPowerStation  ModifyPowerStationRequest
     * @return ModifyPowerStationResponse
     */
    CompletableFuture<ModifyPowerStationResponse> modifyPowerStation(ModifyPowerStationRequest request);

    /**
     * <b>description</b> :
     * <p>A successful response indicates that the command to add topological relationships is sent to the gateway. It does not indicate that the topological relationships are added.
     * When you develop the gateway, you must subscribe to the topic that is used to send notifications when you add topological relationships. For more information about the topic and message format, see <a href="https://help.aliyun.com/document_detail/89299.html">Manage topological relationships</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of NotifyAddThingTopo  NotifyAddThingTopoRequest
     * @return NotifyAddThingTopoResponse
     */
    CompletableFuture<NotifyAddThingTopoResponse> notifyAddThingTopo(NotifyAddThingTopoRequest request);

    /**
     * @param request the request parameters of OpenIotService  OpenIotServiceRequest
     * @return OpenIotServiceResponse
     */
    CompletableFuture<OpenIotServiceResponse> openIotService(OpenIotServiceRequest request);

    /**
     * @param request the request parameters of PackageSoundCodeLabelBatchAudio  PackageSoundCodeLabelBatchAudioRequest
     * @return PackageSoundCodeLabelBatchAudioResponse
     */
    CompletableFuture<PackageSoundCodeLabelBatchAudioResponse> packageSoundCodeLabelBatchAudio(PackageSoundCodeLabelBatchAudioRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PageQuerySharedSpeechOpen  PageQuerySharedSpeechOpenRequest
     * @return PageQuerySharedSpeechOpenResponse
     */
    CompletableFuture<PageQuerySharedSpeechOpenResponse> pageQuerySharedSpeechOpen(PageQuerySharedSpeechOpenRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to query only shared speech broadcasting data six hours ago. For example, if a shared speech was broadcasted at 07:15, you can query the speech after 13:15.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PageQuerySpeechBroadcastHour  PageQuerySpeechBroadcastHourRequest
     * @return PageQuerySpeechBroadcastHourResponse
     */
    CompletableFuture<PageQuerySpeechBroadcastHourResponse> pageQuerySpeechBroadcastHour(PageQuerySpeechBroadcastHourRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Before you call this operation, a receipt template must be available in the Letter Sending Service console. Otherwise, the request fails.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PrintByTemplate  PrintByTemplateRequest
     * @return PrintByTemplateResponse
     */
    CompletableFuture<PrintByTemplateResponse> printByTemplate(PrintByTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not support device property settings and service invocations.</p>
     * <ul>
     * <li>To set properties, call the <a href="https://help.aliyun.com/document_detail/69579.html">SetDeviceProperty</a> or <a href="https://help.aliyun.com/document_detail/96243.html">SetDevicesProperty</a> operation.</li>
     * <li>To invoke a service, call the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> or <a href="https://help.aliyun.com/document_detail/96242.html">InvokeThingsService</a> operation.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 1,600 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of Pub  PubRequest
     * @return PubResponse
     */
    CompletableFuture<PubResponse> pub(PubRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the <strong>TopicFullName</strong> parameter in the <strong>request</strong> to specify the devices to which you want to broadcast messages. For more information, see the description about the <strong>TopicFullName</strong> parameter in this topic.</p>
     * <h2>QPS limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run only one query per second (QPS) to broadcast a message to devices that subscribe to a topic.</li>
     * <li>Each Alibaba Cloud account can run only one query per minute (QPM) to broadcast a message to all online devices of a product.      &gt;  The RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of PubBroadcast  PubBroadcastRequest
     * @return PubBroadcastResponse
     */
    CompletableFuture<PubBroadcastResponse> pubBroadcast(PubBroadcastRequest request);

    /**
     * @param request the request parameters of PublishScript  PublishScriptRequest
     * @return PublishScriptResponse
     */
    CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request);

    /**
     * @param request the request parameters of PublishStudioApp  PublishStudioAppRequest
     * @return PublishStudioAppResponse
     */
    CompletableFuture<PublishStudioAppResponse> publishStudioApp(PublishStudioAppRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of PublishThingModel  PublishThingModelRequest
     * @return PublishThingModelResponse
     */
    CompletableFuture<PublishThingModelResponse> publishThingModel(PublishThingModelRequest request);

    /**
     * @param request the request parameters of PublishThingModelAsync  PublishThingModelAsyncRequest
     * @return PublishThingModelAsyncResponse
     */
    CompletableFuture<PublishThingModelAsyncResponse> publishThingModelAsync(PublishThingModelAsyncRequest request);

    /**
     * @param request the request parameters of PublishThingModelAsyncInner  PublishThingModelAsyncInnerRequest
     * @return PublishThingModelAsyncInnerResponse
     */
    CompletableFuture<PublishThingModelAsyncInnerResponse> publishThingModelAsyncInner(PublishThingModelAsyncInnerRequest request);

    /**
     * @param request the request parameters of PushSpeech  PushSpeechRequest
     * @return PushSpeechResponse
     */
    CompletableFuture<PushSpeechResponse> pushSpeech(PushSpeechRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryBatchRegisterDeviceStatus  QueryBatchRegisterDeviceStatusRequest
     * @return QueryBatchRegisterDeviceStatusResponse
     */
    CompletableFuture<QueryBatchRegisterDeviceStatusResponse> queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryCertUrlByApplyId  QueryCertUrlByApplyIdRequest
     * @return QueryCertUrlByApplyIdResponse
     */
    CompletableFuture<QueryCertUrlByApplyIdResponse> queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryClientIds  QueryClientIdsRequest
     * @return QueryClientIdsResponse
     */
    CompletableFuture<QueryClientIdsResponse> queryClientIds(QueryClientIdsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupByGroupId  QueryConsumerGroupByGroupIdRequest
     * @return QueryConsumerGroupByGroupIdResponse
     */
    CompletableFuture<QueryConsumerGroupByGroupIdResponse> queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupList  QueryConsumerGroupListRequest
     * @return QueryConsumerGroupListResponse
     */
    CompletableFuture<QueryConsumerGroupListResponse> queryConsumerGroupList(QueryConsumerGroupListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupStatus  QueryConsumerGroupStatusRequest
     * @return QueryConsumerGroupStatusResponse
     */
    CompletableFuture<QueryConsumerGroupStatusResponse> queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request);

    /**
     * @param request the request parameters of QueryCustomTimelineTableStatus  QueryCustomTimelineTableStatusRequest
     * @return QueryCustomTimelineTableStatusResponse
     */
    CompletableFuture<QueryCustomTimelineTableStatusResponse> queryCustomTimelineTableStatus(QueryCustomTimelineTableStatusRequest request);

    /**
     * @param request the request parameters of QueryDetailSceneRuleLog  QueryDetailSceneRuleLogRequest
     * @return QueryDetailSceneRuleLogResponse
     */
    CompletableFuture<QueryDetailSceneRuleLogResponse> queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request);

    /**
     * <b>description</b> :
     * <p>The QueryDevice operation can return up to one million devices each time you call the operation.</p>
     * <h2>QPS limits</h2>
     * <ul>
     * <li>You can call this API operation up to 50 times per second per account. &gt;  The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</li>
     * <li>If the product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter is greater than or equal to 100,000, the queries per second (QPS) of this operation decreases. 
     * In this case, you can call this API operation up to two times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDevice  QueryDeviceRequest
     * @return QueryDeviceResponse
     */
    CompletableFuture<QueryDeviceResponse> queryDevice(QueryDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query devices on Enterprise Edition instances only in the China (Shanghai) and Japan (Tokyo) regions.</p>
     * <ul>
     * <li>The QueryDeviceBySQL operation can return up to 10,000 devices each time you call the operation. For more information, see the &quot;<code>Syntax of LIMIT clauses</code>&quot; section of this topic.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceBySQL  QueryDeviceBySQLRequest
     * @return QueryDeviceBySQLResponse
     */
    CompletableFuture<QueryDeviceBySQLResponse> queryDeviceBySQL(QueryDeviceBySQLRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After the status of a device changes, the new status is applied within 10 seconds. After the new status is applied, you can search for the device by using the new status. Before the new status is applied, you can search for the device by using the previous status.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceByStatus  QueryDeviceByStatusRequest
     * @return QueryDeviceByStatusResponse
     */
    CompletableFuture<QueryDeviceByStatusResponse> queryDeviceByStatus(QueryDeviceByStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 10 tags in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceByTags  QueryDeviceByTagsRequest
     * @return QueryDeviceByTagsResponse
     */
    CompletableFuture<QueryDeviceByTagsResponse> queryDeviceByTags(QueryDeviceByTagsRequest request);

    /**
     * @param request the request parameters of QueryDeviceCert  QueryDeviceCertRequest
     * @return QueryDeviceCertResponse
     */
    CompletableFuture<QueryDeviceCertResponse> queryDeviceCert(QueryDeviceCertRequest request);

    /**
     * <b>description</b> :
     * <p>  The desired values of read-only properties cannot be queried.</p>
     * <ul>
     * <li>You can query the desired values of up to 10 properties in a single call.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceDesiredProperty  QueryDeviceDesiredPropertyRequest
     * @return QueryDeviceDesiredPropertyResponse
     */
    CompletableFuture<QueryDeviceDesiredPropertyResponse> queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceDetail  QueryDeviceDetailRequest
     * @return QueryDeviceDetailResponse
     */
    CompletableFuture<QueryDeviceDetailResponse> queryDeviceDetail(QueryDeviceDetailRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceDistributeDetail  QueryDeviceDistributeDetailRequest
     * @return QueryDeviceDistributeDetailResponse
     */
    CompletableFuture<QueryDeviceDistributeDetailResponse> queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceDistributeJob  QueryDeviceDistributeJobRequest
     * @return QueryDeviceDistributeJobResponse
     */
    CompletableFuture<QueryDeviceDistributeJobResponse> queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can query only the event records that are generated in the previous 30 days.</p>
     * <blockquote>
     * <p> The storage period of an event record is calculated from the day when the record is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceEventData  QueryDeviceEventDataRequest
     * @return QueryDeviceEventDataResponse
     */
    CompletableFuture<QueryDeviceEventDataResponse> queryDeviceEventData(QueryDeviceEventDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceFile  QueryDeviceFileRequest
     * @return QueryDeviceFileResponse
     */
    CompletableFuture<QueryDeviceFileResponse> queryDeviceFile(QueryDeviceFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The returned file information for this operation call does not contain download URLs. To obtain the download URL of a file, call <a href="https://help.aliyun.com/document_detail/112002.html">QueryDeviceFile</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceFileList  QueryDeviceFileListRequest
     * @return QueryDeviceFileListResponse
     */
    CompletableFuture<QueryDeviceFileListResponse> queryDeviceFileList(QueryDeviceFileListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can add a device to a maximum of 10 groups.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceGroupByDevice  QueryDeviceGroupByDeviceRequest
     * @return QueryDeviceGroupByDeviceResponse
     */
    CompletableFuture<QueryDeviceGroupByDeviceResponse> queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupByTags  QueryDeviceGroupByTagsRequest
     * @return QueryDeviceGroupByTagsResponse
     */
    CompletableFuture<QueryDeviceGroupByTagsResponse> queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 30 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupInfo  QueryDeviceGroupInfoRequest
     * @return QueryDeviceGroupInfoResponse
     */
    CompletableFuture<QueryDeviceGroupInfoResponse> queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 100 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupList  QueryDeviceGroupListRequest
     * @return QueryDeviceGroupListResponse
     */
    CompletableFuture<QueryDeviceGroupListResponse> queryDeviceGroupList(QueryDeviceGroupListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupTagList  QueryDeviceGroupTagListRequest
     * @return QueryDeviceGroupTagListResponse
     */
    CompletableFuture<QueryDeviceGroupTagListResponse> queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of QueryDeviceInfo  QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceListByDeviceGroup  QueryDeviceListByDeviceGroupRequest
     * @return QueryDeviceListByDeviceGroupResponse
     */
    CompletableFuture<QueryDeviceListByDeviceGroupResponse> queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query only the event records that are generated in the last 30 days.<blockquote>
     * <p> The storage period of an event record is calculated from the day when the record is generated.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceOriginalEventData  QueryDeviceOriginalEventDataRequest
     * @return QueryDeviceOriginalEventDataResponse
     */
    CompletableFuture<QueryDeviceOriginalEventDataResponse> queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can query only the property records that are generated within the previous 30 days.</p>
     * <blockquote>
     * <p> The data of a property is stored from the day when the data is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceOriginalPropertyData  QueryDeviceOriginalPropertyDataRequest
     * @return QueryDeviceOriginalPropertyDataResponse
     */
    CompletableFuture<QueryDeviceOriginalPropertyDataResponse> queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceOriginalPropertyStatus  QueryDeviceOriginalPropertyStatusRequest
     * @return QueryDeviceOriginalPropertyStatusResponse
     */
    CompletableFuture<QueryDeviceOriginalPropertyStatusResponse> queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query only the service call records that are generated in the last 30 days.<blockquote>
     * <p> The storage period of a service call record is calculated from the day when the service is called.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceOriginalServiceData  QueryDeviceOriginalServiceDataRequest
     * @return QueryDeviceOriginalServiceDataResponse
     */
    CompletableFuture<QueryDeviceOriginalServiceDataResponse> queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceProp  QueryDevicePropRequest
     * @return QueryDevicePropResponse
     */
    CompletableFuture<QueryDevicePropResponse> queryDeviceProp(QueryDevicePropRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to query property records within a specified period, the number of records for a property at a point in time may reach the limit.**** The limit is specified by the <strong>PageSize</strong> parameter. In this case, the query stops. Some records of other properties may be not returned.**** You can check whether all records of a property are returned based on the NextValid repsonse parameter: </p>
     * <ul>
     * <li>If the value of the <strong>NextValid</strong> parameter is true, unretrieved records exist in the period that is indicated by the <strong>NextTime</strong> and <strong>EndTime</strong> parameter.<br>You can use the value of the <strong>NextTime</strong> response parameter as the value of the StartTime request parameter and call this operation again to query the rest records. You can call this operation multiple times until the value of the <strong>NextValid</strong> parameter is false.  &gt;  To retrieve all property records within a specified period, you can set the <strong>PageSize</strong> parameter to the maximum value. Then, call this operation multiple times until the value of the <strong>NextValid</strong> parameter is false.</li>
     * <li>If the value of the <strong>NextValid</strong> parameter is false, all property records are returned.</li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>A maximum of 10 properties can be queried at a time. A maximum of 100 records can be queried for each property.</li>
     * <li>You can query property data that is generated within the last 30 days.<blockquote>
     * <p>The storage period of a property record is calculated from the day when the property record was generated.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDevicePropertiesData  QueryDevicePropertiesDataRequest
     * @return QueryDevicePropertiesDataResponse
     */
    CompletableFuture<QueryDevicePropertiesDataResponse> queryDevicePropertiesData(QueryDevicePropertiesDataRequest request);

    /**
     * <b>description</b> :
     * <p>If a device or a digital twin node has multiple properties, you can call this operation to query the data of the properties multiple times. You must specify a value for the <strong>Identifier</strong> parameter each time you call the operation. You can also call the <a href="https://help.aliyun.com/document_detail/99237.html">QueryDevicePropertiesData</a> operation and specify multiple values for the <strong>Identifier</strong> parameter to query the data of the properties.</p>
     * <h2>Limits</h2>
     * <p>You can query only property data that is generated within the previous 30 days. </p>
     * <blockquote>
     * <p> The data of a property is stored from the day when the data is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDevicePropertyData  QueryDevicePropertyDataRequest
     * @return QueryDevicePropertyDataResponse
     */
    CompletableFuture<QueryDevicePropertyDataResponse> queryDevicePropertyData(QueryDevicePropertyDataRequest request);

    /**
     * <b>description</b> :
     * <p>To query the property data of a digital twin node, you must set the <strong>IotId</strong> parameter to the ID of the digital twin node.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 200 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDevicePropertyStatus  QueryDevicePropertyStatusRequest
     * @return QueryDevicePropertyStatusResponse
     */
    CompletableFuture<QueryDevicePropertyStatusResponse> queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request);

    /**
     * @param request the request parameters of QueryDeviceProvisioning  QueryDeviceProvisioningRequest
     * @return QueryDeviceProvisioningResponse
     */
    CompletableFuture<QueryDeviceProvisioningResponse> queryDeviceProvisioning(QueryDeviceProvisioningRequest request);

    /**
     * <b>description</b> :
     * <p>You can query only the service call records of the previous 30 days.</p>
     * <blockquote>
     * <p> The storage period of a service call record is calculated from the day when the service is called.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceServiceData  QueryDeviceServiceDataRequest
     * @return QueryDeviceServiceDataResponse
     */
    CompletableFuture<QueryDeviceServiceDataResponse> queryDeviceServiceData(QueryDeviceServiceDataRequest request);

    /**
     * @param request the request parameters of QueryDeviceSpeech  QueryDeviceSpeechRequest
     * @return QueryDeviceSpeechResponse
     */
    CompletableFuture<QueryDeviceSpeechResponse> queryDeviceSpeech(QueryDeviceSpeechRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceStatistics  QueryDeviceStatisticsRequest
     * @return QueryDeviceStatisticsResponse
     */
    CompletableFuture<QueryDeviceStatisticsResponse> queryDeviceStatistics(QueryDeviceStatisticsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceSubTopic  QueryDeviceSubTopicRequest
     * @return QueryDeviceSubTopicResponse
     */
    CompletableFuture<QueryDeviceSubTopicResponse> queryDeviceSubTopic(QueryDeviceSubTopicRequest request);

    /**
     * @param request the request parameters of QueryDeviceTunnel  QueryDeviceTunnelRequest
     * @return QueryDeviceTunnelResponse
     */
    CompletableFuture<QueryDeviceTunnelResponse> queryDeviceTunnel(QueryDeviceTunnelRequest request);

    /**
     * @param request the request parameters of QueryDevicesHotStorageData  QueryDevicesHotStorageDataRequest
     * @return QueryDevicesHotStorageDataResponse
     */
    CompletableFuture<QueryDevicesHotStorageDataResponse> queryDevicesHotStorageData(QueryDevicesHotStorageDataRequest request);

    /**
     * @param request the request parameters of QueryDevicesHotStorageDataStatus  QueryDevicesHotStorageDataStatusRequest
     * @return QueryDevicesHotStorageDataStatusResponse
     */
    CompletableFuture<QueryDevicesHotStorageDataStatusResponse> queryDevicesHotStorageDataStatus(QueryDevicesHotStorageDataStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The dynamic group feature is available for public instances and Enterprise Edition instances in the China (Shanghai) region. For more information, see <a href="https://help.aliyun.com/document_detail/147356.html">Manage instances</a>.</li>
     * <li>Each Alibaba Cloud account can run up to 50 queries per second (QPS).
     * **
     * <strong>Note</strong>The RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDynamicGroupDevices  QueryDynamicGroupDevicesRequest
     * @return QueryDynamicGroupDevicesResponse
     */
    CompletableFuture<QueryDynamicGroupDevicesResponse> queryDynamicGroupDevices(QueryDynamicGroupDevicesRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeDriver  QueryEdgeDriverRequest
     * @return QueryEdgeDriverResponse
     */
    CompletableFuture<QueryEdgeDriverResponse> queryEdgeDriver(QueryEdgeDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeDriverVersion  QueryEdgeDriverVersionRequest
     * @return QueryEdgeDriverVersionResponse
     */
    CompletableFuture<QueryEdgeDriverVersionResponse> queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding exclusive request parameters, you must specify common request parameters when calling this API operation. For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of QueryEdgeInstance  QueryEdgeInstanceRequest
     * @return QueryEdgeInstanceResponse
     */
    CompletableFuture<QueryEdgeInstanceResponse> queryEdgeInstance(QueryEdgeInstanceRequest request);

    /**
     * @param request the request parameters of QueryEdgeInstanceChannel  QueryEdgeInstanceChannelRequest
     * @return QueryEdgeInstanceChannelResponse
     */
    CompletableFuture<QueryEdgeInstanceChannelResponse> queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceDevice  QueryEdgeInstanceDeviceRequest
     * @return QueryEdgeInstanceDeviceResponse
     */
    CompletableFuture<QueryEdgeInstanceDeviceResponse> queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request);

    /**
     * @param request the request parameters of QueryEdgeInstanceDeviceByDriver  QueryEdgeInstanceDeviceByDriverRequest
     * @return QueryEdgeInstanceDeviceByDriverResponse
     */
    CompletableFuture<QueryEdgeInstanceDeviceByDriverResponse> queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceDriver  QueryEdgeInstanceDriverRequest
     * @return QueryEdgeInstanceDriverResponse
     */
    CompletableFuture<QueryEdgeInstanceDriverResponse> queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceGateway  QueryEdgeInstanceGatewayRequest
     * @return QueryEdgeInstanceGatewayResponse
     */
    CompletableFuture<QueryEdgeInstanceGatewayResponse> queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceHistoricDeployment  QueryEdgeInstanceHistoricDeploymentRequest
     * @return QueryEdgeInstanceHistoricDeploymentResponse
     */
    CompletableFuture<QueryEdgeInstanceHistoricDeploymentResponse> queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request);

    /**
     * @param request the request parameters of QueryEdgeInstanceMessageRouting  QueryEdgeInstanceMessageRoutingRequest
     * @return QueryEdgeInstanceMessageRoutingResponse
     */
    CompletableFuture<QueryEdgeInstanceMessageRoutingResponse> queryEdgeInstanceMessageRouting(QueryEdgeInstanceMessageRoutingRequest request);

    /**
     * @param request the request parameters of QueryEdgeInstanceSceneRule  QueryEdgeInstanceSceneRuleRequest
     * @return QueryEdgeInstanceSceneRuleResponse
     */
    CompletableFuture<QueryEdgeInstanceSceneRuleResponse> queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryImportedDeviceByApplyId  QueryImportedDeviceByApplyIdRequest
     * @return QueryImportedDeviceByApplyIdResponse
     */
    CompletableFuture<QueryImportedDeviceByApplyIdResponse> queryImportedDeviceByApplyId(QueryImportedDeviceByApplyIdRequest request);

    /**
     * @param request the request parameters of QueryJob  QueryJobRequest
     * @return QueryJobResponse
     */
    CompletableFuture<QueryJobResponse> queryJob(QueryJobRequest request);

    /**
     * @param request the request parameters of QueryJobStatistics  QueryJobStatisticsRequest
     * @return QueryJobStatisticsResponse
     */
    CompletableFuture<QueryJobStatisticsResponse> queryJobStatistics(QueryJobStatisticsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryLicenseDeviceList  QueryLicenseDeviceListRequest
     * @return QueryLicenseDeviceListResponse
     */
    CompletableFuture<QueryLicenseDeviceListResponse> queryLicenseDeviceList(QueryLicenseDeviceListRequest request);

    /**
     * @param request the request parameters of QueryLoRaJoinPermissions  QueryLoRaJoinPermissionsRequest
     * @return QueryLoRaJoinPermissionsResponse
     */
    CompletableFuture<QueryLoRaJoinPermissionsResponse> queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request);

    /**
     * @param request the request parameters of QueryMessageInfo  QueryMessageInfoRequest
     * @return QueryMessageInfoResponse
     */
    CompletableFuture<QueryMessageInfoResponse> queryMessageInfo(QueryMessageInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryOTAFirmware  QueryOTAFirmwareRequest
     * @return QueryOTAFirmwareResponse
     */
    CompletableFuture<QueryOTAFirmwareResponse> queryOTAFirmware(QueryOTAFirmwareRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create an update batch, the <strong>JobId</strong> parameter is returned. You can use this parameter to query the details of the update batch.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryOTAJob  QueryOTAJobRequest
     * @return QueryOTAJobResponse
     */
    CompletableFuture<QueryOTAJobResponse> queryOTAJob(QueryOTAJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPageByApplyId  QueryPageByApplyIdRequest
     * @return QueryPageByApplyIdResponse
     */
    CompletableFuture<QueryPageByApplyIdResponse> queryPageByApplyId(QueryPageByApplyIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProduct  QueryProductRequest
     * @return QueryProductResponse
     */
    CompletableFuture<QueryProductResponse> queryProduct(QueryProductRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProductCertInfo  QueryProductCertInfoRequest
     * @return QueryProductCertInfoResponse
     */
    CompletableFuture<QueryProductCertInfoResponse> queryProductCertInfo(QueryProductCertInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run up to 50 queries per second (QPS).<blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>If the product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter is greater than or equal to 100,000, the QPS of this operation decreases.
     * In this case, each Alibaba Cloud account can run up to 2 QPS.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryProductList  QueryProductListRequest
     * @return QueryProductListResponse
     */
    CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 3 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProductTopic  QueryProductTopicRequest
     * @return QueryProductTopicResponse
     */
    CompletableFuture<QueryProductTopicResponse> queryProductTopic(QueryProductTopicRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProjectShareDeviceList  QueryProjectShareDeviceListRequest
     * @return QueryProjectShareDeviceListResponse
     */
    CompletableFuture<QueryProjectShareDeviceListResponse> queryProjectShareDeviceList(QueryProjectShareDeviceListRequest request);

    /**
     * @param request the request parameters of QuerySceneRule  QuerySceneRuleRequest
     * @return QuerySceneRuleResponse
     */
    CompletableFuture<QuerySceneRuleResponse> querySceneRule(QuerySceneRuleRequest request);

    /**
     * @param request the request parameters of QuerySchedulePeriodList  QuerySchedulePeriodListRequest
     * @return QuerySchedulePeriodListResponse
     */
    CompletableFuture<QuerySchedulePeriodListResponse> querySchedulePeriodList(QuerySchedulePeriodListRequest request);

    /**
     * @param request the request parameters of QueryShareProductNameByProductKey  QueryShareProductNameByProductKeyRequest
     * @return QueryShareProductNameByProductKeyResponse
     */
    CompletableFuture<QueryShareProductNameByProductKeyResponse> queryShareProductNameByProductKey(QueryShareProductNameByProductKeyRequest request);

    /**
     * @param request the request parameters of QuerySharePromotionActivityAuditResult  QuerySharePromotionActivityAuditResultRequest
     * @return QuerySharePromotionActivityAuditResultResponse
     */
    CompletableFuture<QuerySharePromotionActivityAuditResultResponse> querySharePromotionActivityAuditResult(QuerySharePromotionActivityAuditResultRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryShareTaskDeviceList  QueryShareTaskDeviceListRequest
     * @return QueryShareTaskDeviceListResponse
     */
    CompletableFuture<QueryShareTaskDeviceListResponse> queryShareTaskDeviceList(QueryShareTaskDeviceListRequest request);

    /**
     * @param request the request parameters of QuerySolutionDeviceGroupPage  QuerySolutionDeviceGroupPageRequest
     * @return QuerySolutionDeviceGroupPageResponse
     */
    CompletableFuture<QuerySolutionDeviceGroupPageResponse> querySolutionDeviceGroupPage(QuerySolutionDeviceGroupPageRequest request);

    /**
     * @param request the request parameters of QuerySoundCodeLabelBatchFailedResult  QuerySoundCodeLabelBatchFailedResultRequest
     * @return QuerySoundCodeLabelBatchFailedResultResponse
     */
    CompletableFuture<QuerySoundCodeLabelBatchFailedResultResponse> querySoundCodeLabelBatchFailedResult(QuerySoundCodeLabelBatchFailedResultRequest request);

    /**
     * @param request the request parameters of QuerySoundCodeLabelBatchList  QuerySoundCodeLabelBatchListRequest
     * @return QuerySoundCodeLabelBatchListResponse
     */
    CompletableFuture<QuerySoundCodeLabelBatchListResponse> querySoundCodeLabelBatchList(QuerySoundCodeLabelBatchListRequest request);

    /**
     * @param request the request parameters of QuerySoundCodeLabelList  QuerySoundCodeLabelListRequest
     * @return QuerySoundCodeLabelListResponse
     */
    CompletableFuture<QuerySoundCodeLabelListResponse> querySoundCodeLabelList(QuerySoundCodeLabelListRequest request);

    /**
     * @param request the request parameters of QuerySoundCodeList  QuerySoundCodeListRequest
     * @return QuerySoundCodeListResponse
     */
    CompletableFuture<QuerySoundCodeListResponse> querySoundCodeList(QuerySoundCodeListRequest request);

    /**
     * @param request the request parameters of QuerySoundCodeScheduleList  QuerySoundCodeScheduleListRequest
     * @return QuerySoundCodeScheduleListResponse
     */
    CompletableFuture<QuerySoundCodeScheduleListResponse> querySoundCodeScheduleList(QuerySoundCodeScheduleListRequest request);

    /**
     * @param request the request parameters of QuerySpeech  QuerySpeechRequest
     * @return QuerySpeechResponse
     */
    CompletableFuture<QuerySpeechResponse> querySpeech(QuerySpeechRequest request);

    /**
     * @param request the request parameters of QuerySpeechDevice  QuerySpeechDeviceRequest
     * @return QuerySpeechDeviceResponse
     */
    CompletableFuture<QuerySpeechDeviceResponse> querySpeechDevice(QuerySpeechDeviceRequest request);

    /**
     * @param request the request parameters of QuerySpeechLicenseAvailableQuota  QuerySpeechLicenseAvailableQuotaRequest
     * @return QuerySpeechLicenseAvailableQuotaResponse
     */
    CompletableFuture<QuerySpeechLicenseAvailableQuotaResponse> querySpeechLicenseAvailableQuota(QuerySpeechLicenseAvailableQuotaRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySpeechLicenseDeviceList  QuerySpeechLicenseDeviceListRequest
     * @return QuerySpeechLicenseDeviceListResponse
     */
    CompletableFuture<QuerySpeechLicenseDeviceListResponse> querySpeechLicenseDeviceList(QuerySpeechLicenseDeviceListRequest request);

    /**
     * @param request the request parameters of QuerySpeechList  QuerySpeechListRequest
     * @return QuerySpeechListResponse
     */
    CompletableFuture<QuerySpeechListResponse> querySpeechList(QuerySpeechListRequest request);

    /**
     * @param request the request parameters of QuerySpeechPushJob  QuerySpeechPushJobRequest
     * @return QuerySpeechPushJobResponse
     */
    CompletableFuture<QuerySpeechPushJobResponse> querySpeechPushJob(QuerySpeechPushJobRequest request);

    /**
     * @param request the request parameters of QuerySpeechPushJobDevice  QuerySpeechPushJobDeviceRequest
     * @return QuerySpeechPushJobDeviceResponse
     */
    CompletableFuture<QuerySpeechPushJobDeviceResponse> querySpeechPushJobDevice(QuerySpeechPushJobDeviceRequest request);

    /**
     * @param request the request parameters of QuerySpeechPushJobSpeech  QuerySpeechPushJobSpeechRequest
     * @return QuerySpeechPushJobSpeechResponse
     */
    CompletableFuture<QuerySpeechPushJobSpeechResponse> querySpeechPushJobSpeech(QuerySpeechPushJobSpeechRequest request);

    /**
     * @param request the request parameters of QueryStudioAppDomainListOpen  QueryStudioAppDomainListOpenRequest
     * @return QueryStudioAppDomainListOpenResponse
     */
    CompletableFuture<QueryStudioAppDomainListOpenResponse> queryStudioAppDomainListOpen(QueryStudioAppDomainListOpenRequest request);

    /**
     * @param request the request parameters of QueryStudioAppList  QueryStudioAppListRequest
     * @return QueryStudioAppListResponse
     */
    CompletableFuture<QueryStudioAppListResponse> queryStudioAppList(QueryStudioAppListRequest request);

    /**
     * @param request the request parameters of QueryStudioAppPageListOpen  QueryStudioAppPageListOpenRequest
     * @return QueryStudioAppPageListOpenResponse
     */
    CompletableFuture<QueryStudioAppPageListOpenResponse> queryStudioAppPageListOpen(QueryStudioAppPageListOpenRequest request);

    /**
     * @param request the request parameters of QueryStudioProjectList  QueryStudioProjectListRequest
     * @return QueryStudioProjectListResponse
     */
    CompletableFuture<QueryStudioProjectListResponse> queryStudioProjectList(QueryStudioProjectListRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySubscribeRelation  QuerySubscribeRelationRequest
     * @return QuerySubscribeRelationResponse
     */
    CompletableFuture<QuerySubscribeRelationResponse> querySubscribeRelation(QuerySubscribeRelationRequest request);

    /**
     * @param request the request parameters of QuerySummarySceneRuleLog  QuerySummarySceneRuleLogRequest
     * @return QuerySummarySceneRuleLogResponse
     */
    CompletableFuture<QuerySummarySceneRuleLogResponse> querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySuperDeviceGroup  QuerySuperDeviceGroupRequest
     * @return QuerySuperDeviceGroupResponse
     */
    CompletableFuture<QuerySuperDeviceGroupResponse> querySuperDeviceGroup(QuerySuperDeviceGroupRequest request);

    /**
     * @param request the request parameters of QueryTask  QueryTaskRequest
     * @return QueryTaskResponse
     */
    CompletableFuture<QueryTaskResponse> queryTask(QueryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>TSL features include properties, services, and events.
     * If you add custom modules to a TSL model and the value of the <strong>FunctionBlockId</strong> parameter is empty, you can obtain the TSL features of each custom module. If the value of the FunctionBlockId parameter is not empty, you can obtain the TSL features of a specified custom module.
     * For more information about the data format of the <strong>ThingModelJson</strong> parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModel  QueryThingModelRequest
     * @return QueryThingModelResponse
     */
    CompletableFuture<QueryThingModelResponse> queryThingModel(QueryThingModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelExtendConfig  QueryThingModelExtendConfigRequest
     * @return QueryThingModelExtendConfigResponse
     */
    CompletableFuture<QueryThingModelExtendConfigResponse> queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelExtendConfigPublished  QueryThingModelExtendConfigPublishedRequest
     * @return QueryThingModelExtendConfigPublishedResponse
     */
    CompletableFuture<QueryThingModelExtendConfigPublishedResponse> queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelPublished  QueryThingModelPublishedRequest
     * @return QueryThingModelPublishedResponse
     */
    CompletableFuture<QueryThingModelPublishedResponse> queryThingModelPublished(QueryThingModelPublishedRequest request);

    /**
     * @param request the request parameters of QueryTopicConfig  QueryTopicConfigRequest
     * @return QueryTopicConfigResponse
     */
    CompletableFuture<QueryTopicConfigResponse> queryTopicConfig(QueryTopicConfigRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of QueryTopicReverseRouteTable  QueryTopicReverseRouteTableRequest
     * @return QueryTopicReverseRouteTableResponse
     */
    CompletableFuture<QueryTopicReverseRouteTableResponse> queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryTopicRouteTable  QueryTopicRouteTableRequest
     * @return QueryTopicRouteTableResponse
     */
    CompletableFuture<QueryTopicRouteTableResponse> queryTopicRouteTable(QueryTopicRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the information about a device of a JT/T 808 gateway product.</p>
     * <ul>
     * <li>When you call this operation, you must specify a <strong>ProductKey</strong> and a <strong>DeviceName</strong>. Otherwise, the call fails.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryVehicleDevice  QueryVehicleDeviceRequest
     * @return QueryVehicleDeviceResponse
     */
    CompletableFuture<QueryVehicleDeviceResponse> queryVehicleDevice(QueryVehicleDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>If the device fails to send a response within the timeout period after you call the operation, IoT Platform considers that the call fails even if the device receives the message. The timeout period is specified by the <strong>Timeout</strong> parameter.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 1000 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RRpc  RRpcRequest
     * @return RRpcResponse
     */
    CompletableFuture<RRpcResponse> rRpc(RRpcRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReBindLicenseDevice  ReBindLicenseDeviceRequest
     * @return ReBindLicenseDeviceResponse
     */
    CompletableFuture<ReBindLicenseDeviceResponse> reBindLicenseDevice(ReBindLicenseDeviceRequest request);

    /**
     * @param request the request parameters of RefreshDeviceTunnelSharePassword  RefreshDeviceTunnelSharePasswordRequest
     * @return RefreshDeviceTunnelSharePasswordResponse
     */
    CompletableFuture<RefreshDeviceTunnelSharePasswordResponse> refreshDeviceTunnelSharePassword(RefreshDeviceTunnelSharePasswordRequest request);

    /**
     * @param request the request parameters of RefreshStudioAppTokenOpen  RefreshStudioAppTokenOpenRequest
     * @return RefreshStudioAppTokenOpenResponse
     */
    CompletableFuture<RefreshStudioAppTokenOpenResponse> refreshStudioAppTokenOpen(RefreshStudioAppTokenOpenRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to register a device under a product, the device is added to the product in the IoT Platform console. After the device is registered, IoT Platform issues the IotId parameter to the device. This parameter is a globally unique identifier (GUID) of the device. To perform operations on a device, you must use the IotId parameter to identify the device.
     * You can also use a combination of the ProductKey and DeviceName parameters to identify a device. A ProductKey is issued by IoT Platform to a product when you create the product. A DeviceName is specified or randomly generated when you create a device. The IotId parameter has a higher priority than a combination of the ProductKey and DeviceName parameters.
     * For information about how to register multiple devices under a product at the same time, see <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 30 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RegisterDevice  RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    /**
     * @param request the request parameters of ReleaseEdgeDriverVersion  ReleaseEdgeDriverVersionRequest
     * @return ReleaseEdgeDriverVersionResponse
     */
    CompletableFuture<ReleaseEdgeDriverVersionResponse> releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <p>  After a product is published, you cannot call the <a href="https://help.aliyun.com/document_detail/150323.html">CreateThingModel</a>, <a href="https://help.aliyun.com/document_detail/151240.html">UpdateThingModel</a>, <a href="https://help.aliyun.com/document_detail/150320.html">ImportThingModelTSL</a>, <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a>, <a href="https://help.aliyun.com/document_detail/150312.html">DeleteThingModel</a>, or <a href="https://help.aliyun.com/document_detail/150322.html">CopyThingModel</a> operation to edit the Thing Specification Language (TSL) model of the product. To edit the TSL model, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseProduct  ReleaseProductRequest
     * @return ReleaseProductResponse
     */
    CompletableFuture<ReleaseProductResponse> releaseProduct(ReleaseProductRequest request);

    /**
     * <b>description</b> :
     * <p>  If you specify a gateway, this operation removes the topological relationships between the gateway and all attached sub-devices.</p>
     * <ul>
     * <li>If you specify a sub-device, this operation removes the topological relationship between the sub-device and the gateway to which the sub-device is attached.</li>
     * </ul>
     * <h1>QPS limits</h1>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveThingTopo  RemoveThingTopoRequest
     * @return RemoveThingTopoResponse
     */
    CompletableFuture<RemoveThingTopoResponse> removeThingTopo(RemoveThingTopoRequest request);

    /**
     * @param request the request parameters of ReplaceEdgeInstanceGateway  ReplaceEdgeInstanceGatewayRequest
     * @return ReplaceEdgeInstanceGatewayResponse
     */
    CompletableFuture<ReplaceEdgeInstanceGatewayResponse> replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request);

    /**
     * @param request the request parameters of RerunJob  RerunJobRequest
     * @return RerunJobResponse
     */
    CompletableFuture<RerunJobResponse> rerunJob(RerunJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetConsumerGroupPosition  ResetConsumerGroupPositionRequest
     * @return ResetConsumerGroupPositionResponse
     */
    CompletableFuture<ResetConsumerGroupPositionResponse> resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request);

    /**
     * @param request the request parameters of ResetDeviceTimeline  ResetDeviceTimelineRequest
     * @return ResetDeviceTimelineResponse
     */
    CompletableFuture<ResetDeviceTimelineResponse> resetDeviceTimeline(ResetDeviceTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>  After you use dynamic registration to obtain the device certificate information of a directly connected device and activate the device, you can call this operation to reset the dynamic registration status of the status to unregistered in the IoT Platform console. Then, you can use dynamic registration again to obtain the device certificate information. The device certificate information includes ProductKey, DeviceName, and DeviceSecret.</p>
     * <blockquote>
     * <p>This operation is called to reset the dynamic registration status instead of activation status of a device. After you call the operation to reset the dynamic registration status of a device, the status of the device in the IoT Platform console is not reset to inactive.</p>
     * </blockquote>
     * <ul>
     * <li>If you specify a gateway and the number of sub-devices that belong to the gateway exceeds 2,000, you can call this operation to create a device job to delete the topological relationships in an asynchronous manner. The operation returns the <strong>JobId</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetThing  ResetThingRequest
     * @return ResetThingResponse
     */
    CompletableFuture<ResetThingResponse> resetThing(ResetThingRequest request);

    /**
     * @param request the request parameters of RetrySoundCodeLabelBatch  RetrySoundCodeLabelBatchRequest
     * @return RetrySoundCodeLabelBatchResponse
     */
    CompletableFuture<RetrySoundCodeLabelBatchResponse> retrySoundCodeLabelBatch(RetrySoundCodeLabelBatchRequest request);

    /**
     * <b>description</b> :
     * <p>If the update task requires confirmation, you must make sure that it has been confirmed before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/254666.html">ConfirmOTATask</a> operation to confirm update tasks.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReupgradeOTATask  ReupgradeOTATaskRequest
     * @return ReupgradeOTATaskResponse
     */
    CompletableFuture<ReupgradeOTATaskResponse> reupgradeOTATask(ReupgradeOTATaskRequest request);

    /**
     * <b>description</b> :
     * <p>  A device can have a maximum of 100 tags.</p>
     * <ul>
     * <li>You can modify or add a maximum of 100 tags at a time.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SaveDeviceProp  SaveDevicePropRequest
     * @return SaveDevicePropResponse
     */
    CompletableFuture<SaveDevicePropResponse> saveDeviceProp(SaveDevicePropRequest request);

    /**
     * @param request the request parameters of SaveScript  SaveScriptRequest
     * @return SaveScriptResponse
     */
    CompletableFuture<SaveScriptResponse> saveScript(SaveScriptRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot query the desired values of read-only properties.</p>
     * <ul>
     * <li>You can specify up to 10 desired property values in a call.</li>
     * <li>After a device is created, the value of the <strong>Version</strong> parameter is 0. If you want to configure the <strong>Version</strong> parameter the first time you specify a desired property value, set the <strong>Version</strong> parameter to 0.<blockquote>
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceDesiredProperty  SetDeviceDesiredPropertyRequest
     * @return SetDeviceDesiredPropertyResponse
     */
    CompletableFuture<SetDeviceDesiredPropertyResponse> setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request);

    /**
     * <b>description</b> :
     * <p>A device group can have a maximum of 100 tags.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceGroupTags  SetDeviceGroupTagsRequest
     * @return SetDeviceGroupTagsResponse
     */
    CompletableFuture<SetDeviceGroupTagsResponse> setDeviceGroupTags(SetDeviceGroupTagsRequest request);

    /**
     * <b>description</b> :
     * <p>After IoT Platform sends a request to configure device properties, the device receives and processes the request in an asynchronous manner. When you call this operation, a successful response indicates that IoT Platform sent a request. The response does not indicate that the device received and processed the request. After the device SDK responds to the request, the device properties are configured.</p>
     * <blockquote>
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceProperty  SetDevicePropertyRequest
     * @return SetDevicePropertyResponse
     */
    CompletableFuture<SetDevicePropertyResponse> setDeviceProperty(SetDevicePropertyRequest request);

    /**
     * <b>description</b> :
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDevicesProperty  SetDevicesPropertyRequest
     * @return SetDevicesPropertyResponse
     */
    CompletableFuture<SetDevicesPropertyResponse> setDevicesProperty(SetDevicesPropertyRequest request);

    /**
     * @param request the request parameters of SetEdgeInstanceDriverConfigs  SetEdgeInstanceDriverConfigsRequest
     * @return SetEdgeInstanceDriverConfigsResponse
     */
    CompletableFuture<SetEdgeInstanceDriverConfigsResponse> setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetProductCertInfo  SetProductCertInfoRequest
     * @return SetProductCertInfoResponse
     */
    CompletableFuture<SetProductCertInfoResponse> setProductCertInfo(SetProductCertInfoRequest request);

    /**
     * @param request the request parameters of SetStudioProjectCooperation  SetStudioProjectCooperationRequest
     * @return SetStudioProjectCooperationResponse
     */
    CompletableFuture<SetStudioProjectCooperationResponse> setStudioProjectCooperation(SetStudioProjectCooperationRequest request);

    /**
     * @param request the request parameters of SetupStudioAppAuthModeOpen  SetupStudioAppAuthModeOpenRequest
     * @return SetupStudioAppAuthModeOpenResponse
     */
    CompletableFuture<SetupStudioAppAuthModeOpenResponse> setupStudioAppAuthModeOpen(SetupStudioAppAuthModeOpenRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ShareSpeechByCombination  ShareSpeechByCombinationRequest
     * @return ShareSpeechByCombinationResponse
     */
    CompletableFuture<ShareSpeechByCombinationResponse> shareSpeechByCombination(ShareSpeechByCombinationRequest request);

    /**
     * @param request the request parameters of SpeechByCombination  SpeechByCombinationRequest
     * @return SpeechByCombinationResponse
     */
    CompletableFuture<SpeechByCombinationResponse> speechByCombination(SpeechByCombinationRequest request);

    /**
     * @param request the request parameters of SpeechBySynthesis  SpeechBySynthesisRequest
     * @return SpeechBySynthesisResponse
     */
    CompletableFuture<SpeechBySynthesisResponse> speechBySynthesis(SpeechBySynthesisRequest request);

    /**
     * @param request the request parameters of StartPTDetection  StartPTDetectionRequest
     * @return StartPTDetectionResponse
     */
    CompletableFuture<StartPTDetectionResponse> startPTDetection(StartPTDetectionRequest request);

    /**
     * @param request the request parameters of StartParser  StartParserRequest
     * @return StartParserResponse
     */
    CompletableFuture<StartParserResponse> startParser(StartParserRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You must verify that the rule has SQL statements configured before you start the rule. If you do not set an SQL statement when you create the rule, call the <a href="https://help.aliyun.com/document_detail/69513.html">UpdateRule</a> operation to add an SQL statement and update the rule.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartRule  StartRuleRequest
     * @return StartRuleResponse
     */
    CompletableFuture<StartRuleResponse> startRule(StartRuleRequest request);

    /**
     * @param request the request parameters of StopParser  StopParserRequest
     * @return StopParserResponse
     */
    CompletableFuture<StopParserResponse> stopParser(StopParserRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StopRule  StopRuleRequest
     * @return StopRuleResponse
     */
    CompletableFuture<StopRuleResponse> stopRule(StopRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  The device that needs to subscribe to topics must be connected to IoT Platform and online.</p>
     * <ul>
     * <li>You can call this operation to subscribe to the topics of a specified device. You can specify a maximum of 10 topics in a single call.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SubscribeTopic  SubscribeTopicRequest
     * @return SubscribeTopicResponse
     */
    CompletableFuture<SubscribeTopicResponse> subscribeTopic(SubscribeTopicRequest request);

    /**
     * @param request the request parameters of SyncSpeechByCombination  SyncSpeechByCombinationRequest
     * @return SyncSpeechByCombinationResponse
     */
    CompletableFuture<SyncSpeechByCombinationResponse> syncSpeechByCombination(SyncSpeechByCombinationRequest request);

    /**
     * @param request the request parameters of TestSpeech  TestSpeechRequest
     * @return TestSpeechResponse
     */
    CompletableFuture<TestSpeechResponse> testSpeech(TestSpeechRequest request);

    /**
     * @param request the request parameters of TestSwitch  TestSwitchRequest
     * @return TestSwitchResponse
     */
    CompletableFuture<TestSwitchResponse> testSwitch(TestSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/371985.html">QueryClientIds</a> operation to view the ClientIDs of a device.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TransformClientId  TransformClientIdRequest
     * @return TransformClientIdResponse
     */
    CompletableFuture<TransformClientIdResponse> transformClientId(TransformClientIdRequest request);

    /**
     * @param request the request parameters of TriggerSceneRule  TriggerSceneRuleRequest
     * @return TriggerSceneRuleResponse
     */
    CompletableFuture<TriggerSceneRuleResponse> triggerSceneRule(TriggerSceneRuleRequest request);

    /**
     * @param request the request parameters of UnbindApplicationFromEdgeInstance  UnbindApplicationFromEdgeInstanceRequest
     * @return UnbindApplicationFromEdgeInstanceResponse
     */
    CompletableFuture<UnbindApplicationFromEdgeInstanceResponse> unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UnbindDriverFromEdgeInstance  UnbindDriverFromEdgeInstanceRequest
     * @return UnbindDriverFromEdgeInstanceResponse
     */
    CompletableFuture<UnbindDriverFromEdgeInstanceResponse> unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>A license is bound with a product. For more information, see <a href="https://help.aliyun.com/document_detail/427956.html">BindLicenseProduct</a> or <a href="https://help.aliyun.com/document_detail/427937.html">Bind a license to a product</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UnbindLicenseProduct  UnbindLicenseProductRequest
     * @return UnbindLicenseProductResponse
     */
    CompletableFuture<UnbindLicenseProductResponse> unbindLicenseProduct(UnbindLicenseProductRequest request);

    /**
     * @param request the request parameters of UnbindRoleFromEdgeInstance  UnbindRoleFromEdgeInstanceRequest
     * @return UnbindRoleFromEdgeInstanceResponse
     */
    CompletableFuture<UnbindRoleFromEdgeInstanceResponse> unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request);

    /**
     * @param request the request parameters of UnbindSceneRuleFromEdgeInstance  UnbindSceneRuleFromEdgeInstanceRequest
     * @return UnbindSceneRuleFromEdgeInstanceResponse
     */
    CompletableFuture<UnbindSceneRuleFromEdgeInstanceResponse> unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request);

    /**
     * @param request the request parameters of UnsubscribeTopic  UnsubscribeTopicRequest
     * @return UnsubscribeTopicResponse
     */
    CompletableFuture<UnsubscribeTopicResponse> unsubscribeTopic(UnsubscribeTopicRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You cannot modify the default consumer group provided by IoT Platform.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    /**
     * @param request the request parameters of UpdateDestination  UpdateDestinationRequest
     * @return UpdateDestinationResponse
     */
    CompletableFuture<UpdateDestinationResponse> updateDestination(UpdateDestinationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDeviceGroup  UpdateDeviceGroupRequest
     * @return UpdateDeviceGroupResponse
     */
    CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroup(UpdateDeviceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 500 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDeviceShadow  UpdateDeviceShadowRequest
     * @return UpdateDeviceShadowResponse
     */
    CompletableFuture<UpdateDeviceShadowResponse> updateDeviceShadow(UpdateDeviceShadowRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a request parameter is not specified, the original value of the parameter will be cleared for the driver version.</li>
     * <li>You are not allowed to update a published driver version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEdgeDriverVersion  UpdateEdgeDriverVersionRequest
     * @return UpdateEdgeDriverVersionResponse
     */
    CompletableFuture<UpdateEdgeDriverVersionResponse> updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateEdgeInstance  UpdateEdgeInstanceRequest
     * @return UpdateEdgeInstanceResponse
     */
    CompletableFuture<UpdateEdgeInstanceResponse> updateEdgeInstance(UpdateEdgeInstanceRequest request);

    /**
     * @param request the request parameters of UpdateEdgeInstanceChannel  UpdateEdgeInstanceChannelRequest
     * @return UpdateEdgeInstanceChannelResponse
     */
    CompletableFuture<UpdateEdgeInstanceChannelResponse> updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request);

    /**
     * @param request the request parameters of UpdateEdgeInstanceMessageRouting  UpdateEdgeInstanceMessageRoutingRequest
     * @return UpdateEdgeInstanceMessageRoutingResponse
     */
    CompletableFuture<UpdateEdgeInstanceMessageRoutingResponse> updateEdgeInstanceMessageRouting(UpdateEdgeInstanceMessageRoutingRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    /**
     * @param request the request parameters of UpdateOTAJob  UpdateOTAJobRequest
     * @return UpdateOTAJobResponse
     */
    CompletableFuture<UpdateOTAJobResponse> updateOTAJob(UpdateOTAJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateOTAModule  UpdateOTAModuleRequest
     * @return UpdateOTAModuleResponse
     */
    CompletableFuture<UpdateOTAModuleResponse> updateOTAModule(UpdateOTAModuleRequest request);

    /**
     * @param request the request parameters of UpdateParser  UpdateParserRequest
     * @return UpdateParserResponse
     */
    CompletableFuture<UpdateParserResponse> updateParser(UpdateParserRequest request);

    /**
     * @param request the request parameters of UpdateParserDataSource  UpdateParserDataSourceRequest
     * @return UpdateParserDataSourceResponse
     */
    CompletableFuture<UpdateParserDataSourceResponse> updateParserDataSource(UpdateParserDataSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * <b>description</b> :
     * <h2>Message deduplication rules</h2>
     * <p>Based on the rules that you set, IoT Platform determines whether to use the rules engine or server-side subscriptions to forward property data that is submitted by devices to a specified destination.
     * The triggering conditions of rules are related by the logic AND relation. For example, if you set the PropertyValueFilter=true and PropertyTimestampFilter=true conditions, the rule to remove duplicate messages is triggered only when both of the conditions are met.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductFilterConfig  UpdateProductFilterConfigRequest
     * @return UpdateProductFilterConfigResponse
     */
    CompletableFuture<UpdateProductFilterConfigResponse> updateProductFilterConfig(UpdateProductFilterConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can update a maximum of 10 tags in a single call.</p>
     * <blockquote>
     * <p>You must specify the tag keys and tag values. Otherwise, the call fails. For description about the tag values, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductTags  UpdateProductTagsRequest
     * @return UpdateProductTagsResponse
     */
    CompletableFuture<UpdateProductTagsResponse> updateProductTags(UpdateProductTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductTopic  UpdateProductTopicRequest
     * @return UpdateProductTopicResponse
     */
    CompletableFuture<UpdateProductTopicResponse> updateProductTopic(UpdateProductTopicRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateRuleAction  UpdateRuleActionRequest
     * @return UpdateRuleActionResponse
     */
    CompletableFuture<UpdateRuleActionResponse> updateRuleAction(UpdateRuleActionRequest request);

    /**
     * @param request the request parameters of UpdateSceneRule  UpdateSceneRuleRequest
     * @return UpdateSceneRuleResponse
     */
    CompletableFuture<UpdateSceneRuleResponse> updateSceneRule(UpdateSceneRuleRequest request);

    /**
     * @param request the request parameters of UpdateSchedulePeriod  UpdateSchedulePeriodRequest
     * @return UpdateSchedulePeriodResponse
     */
    CompletableFuture<UpdateSchedulePeriodResponse> updateSchedulePeriod(UpdateSchedulePeriodRequest request);

    /**
     * @param request the request parameters of UpdateSoundCode  UpdateSoundCodeRequest
     * @return UpdateSoundCodeResponse
     */
    CompletableFuture<UpdateSoundCodeResponse> updateSoundCode(UpdateSoundCodeRequest request);

    /**
     * @param request the request parameters of UpdateSoundCodeLabel  UpdateSoundCodeLabelRequest
     * @return UpdateSoundCodeLabelResponse
     */
    CompletableFuture<UpdateSoundCodeLabelResponse> updateSoundCodeLabel(UpdateSoundCodeLabelRequest request);

    /**
     * @param request the request parameters of UpdateSoundCodeSchedule  UpdateSoundCodeScheduleRequest
     * @return UpdateSoundCodeScheduleResponse
     */
    CompletableFuture<UpdateSoundCodeScheduleResponse> updateSoundCodeSchedule(UpdateSoundCodeScheduleRequest request);

    /**
     * @param request the request parameters of UpdateSpeech  UpdateSpeechRequest
     * @return UpdateSpeechResponse
     */
    CompletableFuture<UpdateSpeechResponse> updateSpeech(UpdateSpeechRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateSubscribeRelation  UpdateSubscribeRelationRequest
     * @return UpdateSubscribeRelationResponse
     */
    CompletableFuture<UpdateSubscribeRelationResponse> updateSubscribeRelation(UpdateSubscribeRelationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>When you call this operation, you can use the <a href="https://github.com/everit-org/json-schema?spm=a2c4g.11186623.2.23.575832d9zD7fZb">json-schema</a> library to verify the input parameters in <strong>ThingModelJson</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</li>
     * <li>You can call this operation to update only one feature. TSL features include properties, services, and events.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateThingModel  UpdateThingModelRequest
     * @return UpdateThingModelResponse
     */
    CompletableFuture<UpdateThingModelResponse> updateThingModel(UpdateThingModelRequest request);

    /**
     * <b>description</b> :
     * <p>  A data parsing script is used to convert the custom-formatted data to JSON data after the data is submitted by a device. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateThingScript  UpdateThingScriptRequest
     * @return UpdateThingScriptResponse
     */
    CompletableFuture<UpdateThingScriptResponse> updateThingScript(UpdateThingScriptRequest request);

    /**
     * @param request the request parameters of UpdateTopicConfig  UpdateTopicConfigRequest
     * @return UpdateTopicConfigResponse
     */
    CompletableFuture<UpdateTopicConfigResponse> updateTopicConfig(UpdateTopicConfigRequest request);

    /**
     * @param request the request parameters of WriteDevicesHotStorageData  WriteDevicesHotStorageDataRequest
     * @return WriteDevicesHotStorageDataResponse
     */
    CompletableFuture<WriteDevicesHotStorageDataResponse> writeDevicesHotStorageData(WriteDevicesHotStorageDataRequest request);

}
