// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.linkvisual20180120.models.*;
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
        this.product = "Linkvisual";
        this.version = "2018-01-20";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkvisual.aliyuncs.com"),
            new TeaPair("me-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("us-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("us-west-1", "linkvisual.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddEventRecordPlanDevice  AddEventRecordPlanDeviceRequest
     * @return AddEventRecordPlanDeviceResponse
     */
    @Override
    public CompletableFuture<AddEventRecordPlanDeviceResponse> addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEventRecordPlanDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEventRecordPlanDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEventRecordPlanDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the device group (<strong>DeviceGroupId</strong>). Save this value locally for use when invoking other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceDeviceGroup  AddFaceDeviceGroupRequest
     * @return AddFaceDeviceGroupResponse
     */
    @Override
    public CompletableFuture<AddFaceDeviceGroupResponse> addFaceDeviceGroup(AddFaceDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddFaceDeviceToDeviceGroup  AddFaceDeviceToDeviceGroupRequest
     * @return AddFaceDeviceToDeviceGroupResponse
     */
    @Override
    public CompletableFuture<AddFaceDeviceToDeviceGroupResponse> addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceDeviceToDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceDeviceToDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceDeviceToDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a URL for downloading the user\&quot;s face image in advance.<blockquote>
     * <p>Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns a user ID (<strong>UserId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUser  AddFaceUserRequest
     * @return AddFaceUserResponse
     */
    @Override
    public CompletableFuture<AddFaceUserResponse> addFaceUser(AddFaceUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) limit for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the ID of the user group (<strong>UserGroupId</strong>). Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUserGroup  AddFaceUserGroupRequest
     * @return AddFaceUserGroupResponse
     */
    @Override
    public CompletableFuture<AddFaceUserGroupResponse> addFaceUserGroup(AddFaceUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddFaceUserGroupAndDeviceGroupRelation  AddFaceUserGroupAndDeviceGroupRelationRequest
     * @return AddFaceUserGroupAndDeviceGroupRelationResponse
     */
    @Override
    public CompletableFuture<AddFaceUserGroupAndDeviceGroupRelationResponse> addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceUserGroupAndDeviceGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceUserGroupAndDeviceGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceUserGroupAndDeviceGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>Configure a download URL for the user\&quot;s face image in advance.<blockquote>
     * <p>Only images in JPEG and JPG format are supported, and the image URL cannot contain Chinese characters.</p>
     * </blockquote>
     * </li>
     * <li>After you invoke this API operation, the system returns the unique identity (<strong>Data</strong>) of the user\&quot;s face image. Save this value locally for use when you invoke other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFaceUserPicture  AddFaceUserPictureRequest
     * @return AddFaceUserPictureResponse
     */
    @Override
    public CompletableFuture<AddFaceUserPictureResponse> addFaceUserPicture(AddFaceUserPictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceUserPicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceUserPictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceUserPictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of AddFaceUserToUserGroup  AddFaceUserToUserGroupRequest
     * @return AddFaceUserToUserGroupResponse
     */
    @Override
    public CompletableFuture<AddFaceUserToUserGroupResponse> addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFaceUserToUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFaceUserToUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFaceUserToUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddRecordPlanDevice  AddRecordPlanDeviceRequest
     * @return AddRecordPlanDeviceResponse
     */
    @Override
    public CompletableFuture<AddRecordPlanDeviceResponse> addRecordPlanDevice(AddRecordPlanDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRecordPlanDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRecordPlanDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRecordPlanDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchQueryVisionDeviceInfo  BatchQueryVisionDeviceInfoRequest
     * @return BatchQueryVisionDeviceInfoResponse
     */
    @Override
    public CompletableFuture<BatchQueryVisionDeviceInfoResponse> batchQueryVisionDeviceInfo(BatchQueryVisionDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchQueryVisionDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryVisionDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryVisionDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the invocation failed.</p>
     * 
     * @param request the request parameters of BindPictureSearchAppWithDevices  BindPictureSearchAppWithDevicesRequest
     * @return BindPictureSearchAppWithDevicesResponse
     */
    @Override
    public CompletableFuture<BindPictureSearchAppWithDevicesResponse> bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindPictureSearchAppWithDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindPictureSearchAppWithDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindPictureSearchAppWithDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckFaceUserDoExistOnDevice  CheckFaceUserDoExistOnDeviceRequest
     * @return CheckFaceUserDoExistOnDeviceResponse
     */
    @Override
    public CompletableFuture<CheckFaceUserDoExistOnDeviceResponse> checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckFaceUserDoExistOnDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckFaceUserDoExistOnDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckFaceUserDoExistOnDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ClearFaceDeviceDB  ClearFaceDeviceDBRequest
     * @return ClearFaceDeviceDBResponse
     */
    @Override
    public CompletableFuture<ClearFaceDeviceDBResponse> clearFaceDeviceDB(ClearFaceDeviceDBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearFaceDeviceDB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearFaceDeviceDBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearFaceDeviceDBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEventRecordPlan  CreateEventRecordPlanRequest
     * @return CreateEventRecordPlanResponse
     */
    @Override
    public CompletableFuture<CreateEventRecordPlanResponse> createEventRecordPlan(CreateEventRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEventRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEventRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEventRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGbDevice  CreateGbDeviceRequest
     * @return CreateGbDeviceResponse
     */
    @Override
    public CompletableFuture<CreateGbDeviceResponse> createGbDevice(CreateGbDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGbDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGbDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGbDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A single local video recording upload job supports uploading up to 200 files. The maximum number of items in the TimeSlot list is 200.</p>
     * 
     * @param request the request parameters of CreateLocalFileUploadJob  CreateLocalFileUploadJobRequest
     * @return CreateLocalFileUploadJobResponse
     */
    @Override
    public CompletableFuture<CreateLocalFileUploadJobResponse> createLocalFileUploadJob(CreateLocalFileUploadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLocalFileUploadJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLocalFileUploadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLocalFileUploadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The maximum duration for a single time-based download is 30 minutes.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>A single instance supports up to 10 concurrent downloads. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the downloaded recording defaults to the first half of the recording.</li>
     * <li>Due to fluctuations in the device\&quot;s upstream network, the link may be abnormally disconnected or the device may actively drop data. As a result, the uploaded and downloaded recordings may be incomplete.</li>
     * <li>The downloaded recording data is determined by the device\&quot;s stream pushing logic. If the pushed data is abnormal, the duration of the downloaded recording may not match the time period specified in the task settings.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLocalRecordDownloadByTimeJob  CreateLocalRecordDownloadByTimeJobRequest
     * @return CreateLocalRecordDownloadByTimeJobResponse
     */
    @Override
    public CompletableFuture<CreateLocalRecordDownloadByTimeJobResponse> createLocalRecordDownloadByTimeJob(CreateLocalRecordDownloadByTimeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLocalRecordDownloadByTimeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLocalRecordDownloadByTimeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLocalRecordDownloadByTimeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>A Resource Access Management (RAM) user shares the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePictureSearchApp  CreatePictureSearchAppRequest
     * @return CreatePictureSearchAppResponse
     */
    @Override
    public CompletableFuture<CreatePictureSearchAppResponse> createPictureSearchApp(CreatePictureSearchAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePictureSearchApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePictureSearchAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePictureSearchAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both face and human body features simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePictureSearchJob  CreatePictureSearchJobRequest
     * @return CreatePictureSearchJobResponse
     */
    @Override
    public CompletableFuture<CreatePictureSearchJobResponse> createPictureSearchJob(CreatePictureSearchJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePictureSearchJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePictureSearchJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePictureSearchJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Maximum duration for a single time-based download: 30 minutes.</li>
     * <li>Download time precision: The precision of the download time range is within 10 seconds. For example, if you select a 20-second data segment to download, up to 30 seconds of data may be downloaded.</li>
     * <li>Maximum number of recording files for a single time-based download: 100.</li>
     * <li>Download tasks and files are retained for up to 1 day. You can re-download them after they expire.</li>
     * <li>Maximum concurrent downloads per instance: 10. Completed downloads are not counted.</li>
     * <li>If the audio and video encoding parameters change, the first half of the recording is downloaded by default.</li>
     * <li>If the download time ranges of recordings overlap, the cloud deduplicates the overlapping data.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRecordDownloadByTimeJob  CreateRecordDownloadByTimeJobRequest
     * @return CreateRecordDownloadByTimeJobResponse
     */
    @Override
    public CompletableFuture<CreateRecordDownloadByTimeJobResponse> createRecordDownloadByTimeJob(CreateRecordDownloadByTimeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRecordDownloadByTimeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecordDownloadByTimeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecordDownloadByTimeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRecordPlan  CreateRecordPlanRequest
     * @return CreateRecordPlanResponse
     */
    @Override
    public CompletableFuture<CreateRecordPlanResponse> createRecordPlan(CreateRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRtmpDevice  CreateRtmpDeviceRequest
     * @return CreateRtmpDeviceResponse
     */
    @Override
    public CompletableFuture<CreateRtmpDeviceResponse> createRtmpDevice(CreateRtmpDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRtmpDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRtmpDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRtmpDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateStreamPushJob  CreateStreamPushJobRequest
     * @return CreateStreamPushJobResponse
     */
    @Override
    public CompletableFuture<CreateStreamPushJobResponse> createStreamPushJob(CreateStreamPushJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStreamPushJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStreamPushJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStreamPushJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateStreamSnapshotJob  CreateStreamSnapshotJobRequest
     * @return CreateStreamSnapshotJobResponse
     */
    @Override
    public CompletableFuture<CreateStreamSnapshotJobResponse> createStreamSnapshotJob(CreateStreamSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStreamSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStreamSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStreamSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTimeTemplate  CreateTimeTemplateRequest
     * @return CreateTimeTemplateResponse
     */
    @Override
    public CompletableFuture<CreateTimeTemplateResponse> createTimeTemplate(CreateTimeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTimeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTimeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTimeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEventRecordPlan  DeleteEventRecordPlanRequest
     * @return DeleteEventRecordPlanResponse
     */
    @Override
    public CompletableFuture<DeleteEventRecordPlanResponse> deleteEventRecordPlan(DeleteEventRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEventRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEventRecordPlanDevice  DeleteEventRecordPlanDeviceRequest
     * @return DeleteEventRecordPlanDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteEventRecordPlanDeviceResponse> deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEventRecordPlanDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventRecordPlanDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventRecordPlanDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFaceDeviceGroup  DeleteFaceDeviceGroupRequest
     * @return DeleteFaceDeviceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteFaceDeviceGroupResponse> deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFaceUser  DeleteFaceUserRequest
     * @return DeleteFaceUserResponse
     */
    @Override
    public CompletableFuture<DeleteFaceUserResponse> deleteFaceUser(DeleteFaceUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFaceUserGroup  DeleteFaceUserGroupRequest
     * @return DeleteFaceUserGroupResponse
     */
    @Override
    public CompletableFuture<DeleteFaceUserGroupResponse> deleteFaceUserGroup(DeleteFaceUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>The maximum number of queries per second (QPS) per Alibaba Cloud account for invoking this operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of DeleteFaceUserGroupAndDeviceGroupRelation  DeleteFaceUserGroupAndDeviceGroupRelationRequest
     * @return DeleteFaceUserGroupAndDeviceGroupRelationResponse
     */
    @Override
    public CompletableFuture<DeleteFaceUserGroupAndDeviceGroupRelationResponse> deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceUserGroupAndDeviceGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceUserGroupAndDeviceGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceUserGroupAndDeviceGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFaceUserPicture  DeleteFaceUserPictureRequest
     * @return DeleteFaceUserPictureResponse
     */
    @Override
    public CompletableFuture<DeleteFaceUserPictureResponse> deleteFaceUserPicture(DeleteFaceUserPictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceUserPicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceUserPictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceUserPictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGbDevice  DeleteGbDeviceRequest
     * @return DeleteGbDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteGbDeviceResponse> deleteGbDevice(DeleteGbDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGbDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGbDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGbDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you stop a local recording upload task, the recording files that have been created are not deleted.</p>
     * 
     * @param request the request parameters of DeleteLocalFileUploadJob  DeleteLocalFileUploadJobRequest
     * @return DeleteLocalFileUploadJobResponse
     */
    @Override
    public CompletableFuture<DeleteLocalFileUploadJobResponse> deleteLocalFileUploadJob(DeleteLocalFileUploadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLocalFileUploadJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLocalFileUploadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLocalFileUploadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePicture  DeletePictureRequest
     * @return DeletePictureResponse
     */
    @Override
    public CompletableFuture<DeletePictureResponse> deletePicture(DeletePictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRecord  DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    @Override
    public CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRecordPlan  DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     */
    @Override
    public CompletableFuture<DeleteRecordPlanResponse> deleteRecordPlan(DeleteRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRecordPlanDevice  DeleteRecordPlanDeviceRequest
     * @return DeleteRecordPlanDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteRecordPlanDeviceResponse> deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRecordPlanDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRecordPlanDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRecordPlanDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRtmpDevice  DeleteRtmpDeviceRequest
     * @return DeleteRtmpDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteRtmpDeviceResponse> deleteRtmpDevice(DeleteRtmpDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRtmpDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRtmpDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRtmpDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRtmpKey  DeleteRtmpKeyRequest
     * @return DeleteRtmpKeyResponse
     */
    @Override
    public CompletableFuture<DeleteRtmpKeyResponse> deleteRtmpKey(DeleteRtmpKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRtmpKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRtmpKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRtmpKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single Alibaba Cloud account can invoke this operation up to 50 times per second (QPS).</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of that account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteStreamPushJob  DeleteStreamPushJobRequest
     * @return DeleteStreamPushJobResponse
     */
    @Override
    public CompletableFuture<DeleteStreamPushJobResponse> deleteStreamPushJob(DeleteStreamPushJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStreamPushJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStreamPushJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStreamPushJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteStreamSnapshotJob  DeleteStreamSnapshotJobRequest
     * @return DeleteStreamSnapshotJobResponse
     */
    @Override
    public CompletableFuture<DeleteStreamSnapshotJobResponse> deleteStreamSnapshotJob(DeleteStreamSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStreamSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStreamSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStreamSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTimeTemplate  DeleteTimeTemplateRequest
     * @return DeleteTimeTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTimeTemplateResponse> deleteTimeTemplate(DeleteTimeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTimeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTimeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTimeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableGbSubDevice  EnableGbSubDeviceRequest
     * @return EnableGbSubDeviceResponse
     */
    @Override
    public CompletableFuture<EnableGbSubDeviceResponse> enableGbSubDevice(EnableGbSubDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableGbSubDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableGbSubDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableGbSubDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search retrieves both facial and body features during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetPictureSearchJobStatus  GetPictureSearchJobStatusRequest
     * @return GetPictureSearchJobStatusResponse
     */
    @Override
    public CompletableFuture<GetPictureSearchJobStatusResponse> getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPictureSearchJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPictureSearchJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPictureSearchJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PictureSearchPicture  PictureSearchPictureRequest
     * @return PictureSearchPictureResponse
     */
    @Override
    public CompletableFuture<PictureSearchPictureResponse> pictureSearchPicture(PictureSearchPictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PictureSearchPicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PictureSearchPictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PictureSearchPictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 10.  </p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryCarProcessEvents  QueryCarProcessEventsRequest
     * @return QueryCarProcessEventsResponse
     */
    @Override
    public CompletableFuture<QueryCarProcessEventsResponse> queryCarProcessEvents(QueryCarProcessEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCarProcessEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCarProcessEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCarProcessEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceEvent  QueryDeviceEventRequest
     * @return QueryDeviceEventResponse
     */
    @Override
    public CompletableFuture<QueryDeviceEventResponse> queryDeviceEvent(QueryDeviceEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceEventPicture  QueryDeviceEventPictureRequest
     * @return QueryDeviceEventPictureResponse
     */
    @Override
    public CompletableFuture<QueryDeviceEventPictureResponse> queryDeviceEventPicture(QueryDeviceEventPictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceEventPicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceEventPictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceEventPictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceEventRecord  QueryDeviceEventRecordRequest
     * @return QueryDeviceEventRecordResponse
     */
    @Override
    public CompletableFuture<QueryDeviceEventRecordResponse> queryDeviceEventRecord(QueryDeviceEventRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceEventRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceEventRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceEventRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicePictureByList  QueryDevicePictureByListRequest
     * @return QueryDevicePictureByListResponse
     */
    @Override
    public CompletableFuture<QueryDevicePictureByListResponse> queryDevicePictureByList(QueryDevicePictureByListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePictureByList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePictureByListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePictureByListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicePictureFile  QueryDevicePictureFileRequest
     * @return QueryDevicePictureFileResponse
     */
    @Override
    public CompletableFuture<QueryDevicePictureFileResponse> queryDevicePictureFile(QueryDevicePictureFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePictureFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePictureFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePictureFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicePictureLifeCycle  QueryDevicePictureLifeCycleRequest
     * @return QueryDevicePictureLifeCycleResponse
     */
    @Override
    public CompletableFuture<QueryDevicePictureLifeCycleResponse> queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePictureLifeCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePictureLifeCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePictureLifeCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceRecordLifeCycle  QueryDeviceRecordLifeCycleRequest
     * @return QueryDeviceRecordLifeCycleResponse
     */
    @Override
    public CompletableFuture<QueryDeviceRecordLifeCycleResponse> queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceRecordLifeCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceRecordLifeCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceRecordLifeCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceVodUrl  QueryDeviceVodUrlRequest
     * @return QueryDeviceVodUrlResponse
     */
    @Override
    public CompletableFuture<QueryDeviceVodUrlResponse> queryDeviceVodUrl(QueryDeviceVodUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceVodUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceVodUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceVodUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>This operation is supported only in scenarios where IPC devices are directly connected to IoT Platform.</p>
     * 
     * @param request the request parameters of QueryDeviceVodUrlByTime  QueryDeviceVodUrlByTimeRequest
     * @return QueryDeviceVodUrlByTimeResponse
     */
    @Override
    public CompletableFuture<QueryDeviceVodUrlByTimeResponse> queryDeviceVodUrlByTime(QueryDeviceVodUrlByTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceVodUrlByTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceVodUrlByTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceVodUrlByTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEventRecordPlanDetail  QueryEventRecordPlanDetailRequest
     * @return QueryEventRecordPlanDetailResponse
     */
    @Override
    public CompletableFuture<QueryEventRecordPlanDetailResponse> queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEventRecordPlanDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEventRecordPlanDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEventRecordPlanDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEventRecordPlanDeviceByDevice  QueryEventRecordPlanDeviceByDeviceRequest
     * @return QueryEventRecordPlanDeviceByDeviceResponse
     */
    @Override
    public CompletableFuture<QueryEventRecordPlanDeviceByDeviceResponse> queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEventRecordPlanDeviceByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEventRecordPlanDeviceByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEventRecordPlanDeviceByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEventRecordPlanDeviceByPlan  QueryEventRecordPlanDeviceByPlanRequest
     * @return QueryEventRecordPlanDeviceByPlanResponse
     */
    @Override
    public CompletableFuture<QueryEventRecordPlanDeviceByPlanResponse> queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEventRecordPlanDeviceByPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEventRecordPlanDeviceByPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEventRecordPlanDeviceByPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEventRecordPlans  QueryEventRecordPlansRequest
     * @return QueryEventRecordPlansResponse
     */
    @Override
    public CompletableFuture<QueryEventRecordPlansResponse> queryEventRecordPlans(QueryEventRecordPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEventRecordPlans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEventRecordPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEventRecordPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceAllDeviceGroup  QueryFaceAllDeviceGroupRequest
     * @return QueryFaceAllDeviceGroupResponse
     */
    @Override
    public CompletableFuture<QueryFaceAllDeviceGroupResponse> queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceAllDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceAllDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceAllDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceAllUserGroup  QueryFaceAllUserGroupRequest
     * @return QueryFaceAllUserGroupResponse
     */
    @Override
    public CompletableFuture<QueryFaceAllUserGroupResponse> queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceAllUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceAllUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceAllUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceAllUserGroupAndDeviceGroupRelation  QueryFaceAllUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceAllUserGroupAndDeviceGroupRelationResponse
     */
    @Override
    public CompletableFuture<QueryFaceAllUserGroupAndDeviceGroupRelationResponse> queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceAllUserGroupAndDeviceGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceAllUserGroupAndDeviceGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceAllUserGroupAndDeviceGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceAllUserIdsByGroupId  QueryFaceAllUserIdsByGroupIdRequest
     * @return QueryFaceAllUserIdsByGroupIdResponse
     */
    @Override
    public CompletableFuture<QueryFaceAllUserIdsByGroupIdResponse> queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceAllUserIdsByGroupId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceAllUserIdsByGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceAllUserIdsByGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceCustomUserIdByUserId  QueryFaceCustomUserIdByUserIdRequest
     * @return QueryFaceCustomUserIdByUserIdResponse
     */
    @Override
    public CompletableFuture<QueryFaceCustomUserIdByUserIdResponse> queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceCustomUserIdByUserId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceCustomUserIdByUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceCustomUserIdByUserIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceDeviceGroupsByDevice  QueryFaceDeviceGroupsByDeviceRequest
     * @return QueryFaceDeviceGroupsByDeviceResponse
     */
    @Override
    public CompletableFuture<QueryFaceDeviceGroupsByDeviceResponse> queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceDeviceGroupsByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceDeviceGroupsByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceDeviceGroupsByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceUser  QueryFaceUserRequest
     * @return QueryFaceUserResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserResponse> queryFaceUser(QueryFaceUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryFaceUserBatch  QueryFaceUserBatchRequest
     * @return QueryFaceUserBatchResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserBatchResponse> queryFaceUserBatch(QueryFaceUserBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUserBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.<blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryFaceUserByName  QueryFaceUserByNameRequest
     * @return QueryFaceUserByNameResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserByNameResponse> queryFaceUserByName(QueryFaceUserByNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUserByName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserByNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserByNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceUserGroup  QueryFaceUserGroupRequest
     * @return QueryFaceUserGroupResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserGroupResponse> queryFaceUserGroup(QueryFaceUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceUserGroupAndDeviceGroupRelation  QueryFaceUserGroupAndDeviceGroupRelationRequest
     * @return QueryFaceUserGroupAndDeviceGroupRelationResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserGroupAndDeviceGroupRelationResponse> queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUserGroupAndDeviceGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserGroupAndDeviceGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserGroupAndDeviceGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceUserIdByCustomUserId  QueryFaceUserIdByCustomUserIdRequest
     * @return QueryFaceUserIdByCustomUserIdResponse
     */
    @Override
    public CompletableFuture<QueryFaceUserIdByCustomUserIdResponse> queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceUserIdByCustomUserId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceUserIdByCustomUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceUserIdByCustomUserIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryGbSubDeviceList  QueryGbSubDeviceListRequest
     * @return QueryGbSubDeviceListResponse
     */
    @Override
    public CompletableFuture<QueryGbSubDeviceListResponse> queryGbSubDeviceList(QueryGbSubDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGbSubDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGbSubDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGbSubDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLiveStreaming  QueryLiveStreamingRequest
     * @return QueryLiveStreamingResponse
     */
    @Override
    public CompletableFuture<QueryLiveStreamingResponse> queryLiveStreaming(QueryLiveStreamingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLiveStreaming").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLiveStreamingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLiveStreamingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLocalFileUploadJob  QueryLocalFileUploadJobRequest
     * @return QueryLocalFileUploadJobResponse
     */
    @Override
    public CompletableFuture<QueryLocalFileUploadJobResponse> queryLocalFileUploadJob(QueryLocalFileUploadJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLocalFileUploadJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLocalFileUploadJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLocalFileUploadJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMonthRecord  QueryMonthRecordRequest
     * @return QueryMonthRecordResponse
     */
    @Override
    public CompletableFuture<QueryMonthRecordResponse> queryMonthRecord(QueryMonthRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMonthRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMonthRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMonthRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 500.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureFiles  QueryPictureFilesRequest
     * @return QueryPictureFilesResponse
     */
    @Override
    public CompletableFuture<QueryPictureFilesResponse> queryPictureFiles(QueryPictureFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPictureSearchAiboxes  QueryPictureSearchAiboxesRequest
     * @return QueryPictureSearchAiboxesResponse
     */
    @Override
    public CompletableFuture<QueryPictureSearchAiboxesResponse> queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureSearchAiboxes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureSearchAiboxesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureSearchAiboxesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.</p>
     * <blockquote>
     * <p>Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureSearchApps  QueryPictureSearchAppsRequest
     * @return QueryPictureSearchAppsResponse
     */
    @Override
    public CompletableFuture<QueryPictureSearchAppsResponse> queryPictureSearchApps(QueryPictureSearchAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureSearchApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureSearchAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureSearchAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPictureSearchDevices  QueryPictureSearchDevicesRequest
     * @return QueryPictureSearchDevicesResponse
     */
    @Override
    public CompletableFuture<QueryPictureSearchDevicesResponse> queryPictureSearchDevices(QueryPictureSearchDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureSearchDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureSearchDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureSearchDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Integrated image search means that both faces and human bodies are retrieved simultaneously during an image search.</p>
     * <blockquote>
     * <p>This feature requires the deployment of face and human body detection algorithms on V-series edge all-in-one machines.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPictureSearchJob  QueryPictureSearchJobRequest
     * @return QueryPictureSearchJobResponse
     */
    @Override
    public CompletableFuture<QueryPictureSearchJobResponse> queryPictureSearchJob(QueryPictureSearchJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureSearchJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureSearchJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureSearchJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPictureSearchJobResult  QueryPictureSearchJobResultRequest
     * @return QueryPictureSearchJobResultResponse
     */
    @Override
    public CompletableFuture<QueryPictureSearchJobResultResponse> queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPictureSearchJobResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPictureSearchJobResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPictureSearchJobResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 250.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecord  QueryRecordRequest
     * @return QueryRecordResponse
     */
    @Override
    public CompletableFuture<QueryRecordResponse> queryRecord(QueryRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordByRecordId  QueryRecordByRecordIdRequest
     * @return QueryRecordByRecordIdResponse
     */
    @Override
    public CompletableFuture<QueryRecordByRecordIdResponse> queryRecordByRecordId(QueryRecordByRecordIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordByRecordId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordByRecordIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordByRecordIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecordDownloadJobById  QueryRecordDownloadJobByIdRequest
     * @return QueryRecordDownloadJobByIdResponse
     */
    @Override
    public CompletableFuture<QueryRecordDownloadJobByIdResponse> queryRecordDownloadJobById(QueryRecordDownloadJobByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordDownloadJobById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordDownloadJobByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordDownloadJobByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The obtained recording download URL is valid for 1 hour.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryRecordDownloadJobList  QueryRecordDownloadJobListRequest
     * @return QueryRecordDownloadJobListResponse
     */
    @Override
    public CompletableFuture<QueryRecordDownloadJobListResponse> queryRecordDownloadJobList(QueryRecordDownloadJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordDownloadJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordDownloadJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordDownloadJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Generating a cloud recording file takes a long time. You must poll this operation to obtain the progress. The download URL is generated only after the progress is complete.</p>
     * 
     * @param request the request parameters of QueryRecordDownloadUrl  QueryRecordDownloadUrlRequest
     * @return QueryRecordDownloadUrlResponse
     */
    @Override
    public CompletableFuture<QueryRecordDownloadUrlResponse> queryRecordDownloadUrl(QueryRecordDownloadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordDownloadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordDownloadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordDownloadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordPlanDetail  QueryRecordPlanDetailRequest
     * @return QueryRecordPlanDetailResponse
     */
    @Override
    public CompletableFuture<QueryRecordPlanDetailResponse> queryRecordPlanDetail(QueryRecordPlanDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordPlanDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordPlanDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordPlanDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordPlanDeviceByDevice  QueryRecordPlanDeviceByDeviceRequest
     * @return QueryRecordPlanDeviceByDeviceResponse
     */
    @Override
    public CompletableFuture<QueryRecordPlanDeviceByDeviceResponse> queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordPlanDeviceByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordPlanDeviceByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordPlanDeviceByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordPlanDeviceByPlan  QueryRecordPlanDeviceByPlanRequest
     * @return QueryRecordPlanDeviceByPlanResponse
     */
    @Override
    public CompletableFuture<QueryRecordPlanDeviceByPlanResponse> queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordPlanDeviceByPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordPlanDeviceByPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordPlanDeviceByPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordPlans  QueryRecordPlansRequest
     * @return QueryRecordPlansResponse
     */
    @Override
    public CompletableFuture<QueryRecordPlansResponse> queryRecordPlans(QueryRecordPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordPlans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordUrl  QueryRecordUrlRequest
     * @return QueryRecordUrlResponse
     */
    @Override
    public CompletableFuture<QueryRecordUrlResponse> queryRecordUrl(QueryRecordUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRecordUrlByTime  QueryRecordUrlByTimeRequest
     * @return QueryRecordUrlByTimeResponse
     */
    @Override
    public CompletableFuture<QueryRecordUrlByTimeResponse> queryRecordUrlByTime(QueryRecordUrlByTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecordUrlByTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecordUrlByTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecordUrlByTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRtmpKey  QueryRtmpKeyRequest
     * @return QueryRtmpKeyResponse
     */
    @Override
    public CompletableFuture<QueryRtmpKeyResponse> queryRtmpKey(QueryRtmpKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRtmpKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRtmpKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRtmpKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to call this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users within a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamPushJob  QueryStreamPushJobRequest
     * @return QueryStreamPushJobResponse
     */
    @Override
    public CompletableFuture<QueryStreamPushJobResponse> queryStreamPushJob(QueryStreamPushJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStreamPushJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStreamPushJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStreamPushJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamPushJobList  QueryStreamPushJobListRequest
     * @return QueryStreamPushJobListResponse
     */
    @Override
    public CompletableFuture<QueryStreamPushJobListResponse> queryStreamPushJobList(QueryStreamPushJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStreamPushJobList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStreamPushJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStreamPushJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 50.</p>
     * <blockquote>
     * <p>All Resource Access Management (RAM) users under a single Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryStreamSnapshotJob  QueryStreamSnapshotJobRequest
     * @return QueryStreamSnapshotJobResponse
     */
    @Override
    public CompletableFuture<QueryStreamSnapshotJobResponse> queryStreamSnapshotJob(QueryStreamSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStreamSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStreamSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStreamSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTimeTemplate  QueryTimeTemplateRequest
     * @return QueryTimeTemplateResponse
     */
    @Override
    public CompletableFuture<QueryTimeTemplateResponse> queryTimeTemplate(QueryTimeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTimeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTimeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTimeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTimeTemplateDetail  QueryTimeTemplateDetailRequest
     * @return QueryTimeTemplateDetailResponse
     */
    @Override
    public CompletableFuture<QueryTimeTemplateDetailResponse> queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTimeTemplateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTimeTemplateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTimeTemplateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVisionDeviceInfo  QueryVisionDeviceInfoRequest
     * @return QueryVisionDeviceInfoResponse
     */
    @Override
    public CompletableFuture<QueryVisionDeviceInfoResponse> queryVisionDeviceInfo(QueryVisionDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVisionDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVisionDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVisionDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryVoiceIntercom  QueryVoiceIntercomRequest
     * @return QueryVoiceIntercomResponse
     */
    @Override
    public CompletableFuture<QueryVoiceIntercomResponse> queryVoiceIntercom(QueryVoiceIntercomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVoiceIntercom").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVoiceIntercomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVoiceIntercomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshGbSubDeviceList  RefreshGbSubDeviceListRequest
     * @return RefreshGbSubDeviceListResponse
     */
    @Override
    public CompletableFuture<RefreshGbSubDeviceListResponse> refreshGbSubDeviceList(RefreshGbSubDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshGbSubDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshGbSubDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshGbSubDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveFaceDeviceFromDeviceGroup  RemoveFaceDeviceFromDeviceGroupRequest
     * @return RemoveFaceDeviceFromDeviceGroupResponse
     */
    @Override
    public CompletableFuture<RemoveFaceDeviceFromDeviceGroupResponse> removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveFaceDeviceFromDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveFaceDeviceFromDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveFaceDeviceFromDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveFaceUserFromUserGroup  RemoveFaceUserFromUserGroupRequest
     * @return RemoveFaceUserFromUserGroupResponse
     */
    @Override
    public CompletableFuture<RemoveFaceUserFromUserGroupResponse> removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveFaceUserFromUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveFaceUserFromUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveFaceUserFromUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, images are permanently stored in the cloud before you configure the cloud storage image lifecycle.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDevicePictureLifeCycle  SetDevicePictureLifeCycleRequest
     * @return SetDevicePictureLifeCycleResponse
     */
    @Override
    public CompletableFuture<SetDevicePictureLifeCycleResponse> setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDevicePictureLifeCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDevicePictureLifeCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDevicePictureLifeCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDeviceRecordLifeCycle  SetDeviceRecordLifeCycleRequest
     * @return SetDeviceRecordLifeCycleResponse
     */
    @Override
    public CompletableFuture<SetDeviceRecordLifeCycleResponse> setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeviceRecordLifeCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeviceRecordLifeCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeviceRecordLifeCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you invoke this operation, you must implement the Thing Specification Language (TSL) model service for stopping live streaming with the identity <strong>StopPushStreaming</strong> on the IPC device. If this service is not implemented on the IPC device, or the IPC device does not return a normal response after receiving the service invocation, the IPC device will not stop pushing the stream. For more information about TSL models, see <a href="https://help.aliyun.com/document_detail/73727.html">What is a TSL model</a>.</li>
     * <li>If no one is watching the stream on the IPC device, you do not need to invoke this operation. IoT Platform automatically triggers the device to stop pushing the stream.</li>
     * <li>During the procedure of triggering a video recording event, invoking this operation causes interruptions to the video file. Use this operation with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of StopLiveStreaming  StopLiveStreamingRequest
     * @return StopLiveStreamingResponse
     */
    @Override
    public CompletableFuture<StopLiveStreamingResponse> stopLiveStreaming(StopLiveStreamingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLiveStreaming").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLiveStreamingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLiveStreamingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopTriggeredRecord  StopTriggeredRecordRequest
     * @return StopTriggeredRecordResponse
     */
    @Override
    public CompletableFuture<StopTriggeredRecordResponse> stopTriggeredRecord(StopTriggeredRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopTriggeredRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTriggeredRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTriggeredRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to transfer devices to another instance, contact technical support to evaluate the migration plan and prevent features from becoming unavailable after the migration.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The devices to be transferred have the video service feature enabled.<ul>
     * <li>Devices in the Enterprise instance: Log on to the IoT Platform console and click <strong>Enterprise instance</strong>. In the left-side navigation pane, choose <strong>Video Service</strong> &gt; <strong>Access Service</strong>. On the <strong>Access Service</strong> page, click the <strong>Product Management</strong> tab. Check the product to which the device to be transferred belongs, and make sure that the <strong>Enabled/Disabled Status</strong> column displays <strong>Enabled</strong>.</li>
     * <li>Devices in an Enterprise Edition instance: The video service is enabled.</li>
     * </ul>
     * </li>
     * <li>The device distribution task is complete. For more information, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a> or <a href="https://help.aliyun.com/document_detail/143450.html">Device distribution</a>.</li>
     * <li>Make sure that a picture lifecycle is configured for camera devices. If no picture lifecycle is configured for a camera device, calling this operation automatically sets the picture lifecycle to 180 days. For more information, see <a href="https://help.aliyun.com/document_detail/107880.html">SetDevicePictureLifeCycle</a>.
     * <strong>Background information</strong></li>
     * <li>If the source instance and target instance are of different types, review the Billable methods of the instances before the migration. For more information about Billable methods, see <a href="https://help.aliyun.com/document_detail/124250.html">Billing overview</a>.</li>
     * <li>During the migration, devices go offline. The more devices you migrate, the longer the migration takes. Data generated by the devices during this period cannot be retained.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferDeviceInstance  TransferDeviceInstanceRequest
     * @return TransferDeviceInstanceResponse
     */
    @Override
    public CompletableFuture<TransferDeviceInstanceResponse> transferDeviceInstance(TransferDeviceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferDeviceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferDeviceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferDeviceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerCapturePicture  TriggerCapturePictureRequest
     * @return TriggerCapturePictureResponse
     */
    @Override
    public CompletableFuture<TriggerCapturePictureResponse> triggerCapturePicture(TriggerCapturePictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerCapturePicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerCapturePictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerCapturePictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerRecord  TriggerRecordRequest
     * @return TriggerRecordResponse
     */
    @Override
    public CompletableFuture<TriggerRecordResponse> triggerRecord(TriggerRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>If you invoke this operation on an Enterprise instance, you must specify the <strong>IotInstanceId</strong> request parameter. Otherwise, the call is failed.</p>
     * 
     * @param request the request parameters of UnbindPictureSearchAppWithDevices  UnbindPictureSearchAppWithDevicesRequest
     * @return UnbindPictureSearchAppWithDevicesResponse
     */
    @Override
    public CompletableFuture<UnbindPictureSearchAppWithDevicesResponse> unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindPictureSearchAppWithDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindPictureSearchAppWithDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindPictureSearchAppWithDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEventRecordPlan  UpdateEventRecordPlanRequest
     * @return UpdateEventRecordPlanResponse
     */
    @Override
    public CompletableFuture<UpdateEventRecordPlanResponse> updateEventRecordPlan(UpdateEventRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEventRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEventRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEventRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFaceUser  UpdateFaceUserRequest
     * @return UpdateFaceUserResponse
     */
    @Override
    public CompletableFuture<UpdateFaceUserResponse> updateFaceUser(UpdateFaceUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFaceUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFaceUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFaceUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The maximum queries per second (QPS) for a single Alibaba Cloud account to invoke this API operation is 100.
     *     &gt; Resource Access Management (RAM) users share the quota of the Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of UpdateFaceUserGroupAndDeviceGroupRelation  UpdateFaceUserGroupAndDeviceGroupRelationRequest
     * @return UpdateFaceUserGroupAndDeviceGroupRelationResponse
     */
    @Override
    public CompletableFuture<UpdateFaceUserGroupAndDeviceGroupRelationResponse> updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFaceUserGroupAndDeviceGroupRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFaceUserGroupAndDeviceGroupRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFaceUserGroupAndDeviceGroupRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGbDevice  UpdateGbDeviceRequest
     * @return UpdateGbDeviceResponse
     */
    @Override
    public CompletableFuture<UpdateGbDeviceResponse> updateGbDevice(UpdateGbDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGbDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGbDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGbDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceInternetProtocol  UpdateInstanceInternetProtocolRequest
     * @return UpdateInstanceInternetProtocolResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceInternetProtocolResponse> updateInstanceInternetProtocol(UpdateInstanceInternetProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceInternetProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceInternetProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceInternetProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePictureSearchApp  UpdatePictureSearchAppRequest
     * @return UpdatePictureSearchAppResponse
     */
    @Override
    public CompletableFuture<UpdatePictureSearchAppResponse> updatePictureSearchApp(UpdatePictureSearchAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePictureSearchApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePictureSearchAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePictureSearchAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRecordPlan  UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     */
    @Override
    public CompletableFuture<UpdateRecordPlanResponse> updateRecordPlan(UpdateRecordPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRecordPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecordPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecordPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRtmpKey  UpdateRtmpKeyRequest
     * @return UpdateRtmpKeyResponse
     */
    @Override
    public CompletableFuture<UpdateRtmpKeyResponse> updateRtmpKey(UpdateRtmpKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRtmpKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRtmpKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRtmpKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTimeTemplate  UpdateTimeTemplateRequest
     * @return UpdateTimeTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTimeTemplateResponse> updateTimeTemplate(UpdateTimeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTimeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTimeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTimeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
