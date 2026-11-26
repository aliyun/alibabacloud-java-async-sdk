// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aligeniessp_1_0.models.*;
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
        this.product = "AliGenie";
        this.version = "ssp_1.0";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddAndRemoveFavoriteContent  AddAndRemoveFavoriteContentRequest
     * @return AddAndRemoveFavoriteContentResponse
     */
    @Override
    public CompletableFuture<AddAndRemoveFavoriteContentResponse> addAndRemoveFavoriteContent(AddAndRemoveFavoriteContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddAndRemoveFavoriteContent").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/AddAndRemoveFavoriteContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAndRemoveFavoriteContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAndRemoveFavoriteContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSub  AddSubRequest
     * @return AddSubResponse
     */
    @Override
    public CompletableFuture<AddSubResponse> addSub(AddSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddSub").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/addSub").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthLoginWithAligenieUserInfo  AuthLoginWithAligenieUserInfoRequest
     * @return AuthLoginWithAligenieUserInfoResponse
     */
    @Override
    public CompletableFuture<AuthLoginWithAligenieUserInfoResponse> authLoginWithAligenieUserInfo(AuthLoginWithAligenieUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthLoginWithAligenieUserInfo").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/authLoginWithAligenieUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthLoginWithAligenieUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthLoginWithAligenieUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthLoginWithAligenieUserInfoGeneratedByPhoneNumber  AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest
     * @return AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse
     */
    @Override
    public CompletableFuture<AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse> authLoginWithAligenieUserInfoGeneratedByPhoneNumber(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthLoginWithAligenieUserInfoGeneratedByPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/authLoginWithAligenieUserInfoGeneratedByPhoneNumber").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthLoginWithTaobaoUserInfo  AuthLoginWithTaobaoUserInfoRequest
     * @return AuthLoginWithTaobaoUserInfoResponse
     */
    @Override
    public CompletableFuture<AuthLoginWithTaobaoUserInfoResponse> authLoginWithTaobaoUserInfo(AuthLoginWithTaobaoUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthLoginWithTaobaoUserInfo").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/authLoginWithTaobaoUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthLoginWithTaobaoUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthLoginWithTaobaoUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthLoginWithThirdUserInfo  AuthLoginWithThirdUserInfoRequest
     * @return AuthLoginWithThirdUserInfoResponse
     */
    @Override
    public CompletableFuture<AuthLoginWithThirdUserInfoResponse> authLoginWithThirdUserInfo(AuthLoginWithThirdUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthLoginWithThirdUserInfo").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/authLoginWithThirdUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthLoginWithThirdUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthLoginWithThirdUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAndDoVoipCallForHotel  CheckAndDoVoipCallForHotelRequest
     * @return CheckAndDoVoipCallForHotelResponse
     */
    @Override
    public CompletableFuture<CheckAndDoVoipCallForHotelResponse> checkAndDoVoipCallForHotel(CheckAndDoVoipCallForHotelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckAndDoVoipCallForHotel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/checkAndDoVoipCallForHotel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAndDoVoipCallForHotelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAndDoVoipCallForHotelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAuthCodeBindForExt  CheckAuthCodeBindForExtRequest
     * @return CheckAuthCodeBindForExtResponse
     */
    @Override
    public CompletableFuture<CheckAuthCodeBindForExtResponse> checkAuthCodeBindForExt(CheckAuthCodeBindForExtRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckAuthCodeBindForExt").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/checkAuthCodeBindForExt").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAuthCodeBindForExtResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAuthCodeBindForExtResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After synchronously validating the input parameters, the system asynchronously creates the playlist.</p>
     * 
     * @param request the request parameters of CloudPlayer  CloudPlayerRequest
     * @return CloudPlayerResponse
     */
    @Override
    public CompletableFuture<CloudPlayerResponse> cloudPlayer(CloudPlayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloudPlayer").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/cloud/player").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloudPlayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloudPlayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlarm  CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    @Override
    public CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/createAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePlayingList  CreatePlayingListRequest
     * @return CreatePlayingListResponse
     */
    @Override
    public CompletableFuture<CreatePlayingListResponse> createPlayingList(CreatePlayingListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePlayingList").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/CreatePlayingList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePlayingListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePlayingListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePlayingListOAuth2  CreatePlayingListOAuth2Request
     * @return CreatePlayingListOAuth2Response
     */
    @Override
    public CompletableFuture<CreatePlayingListOAuth2Response> createPlayingListOAuth2(CreatePlayingListOAuth2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePlayingListOAuth2").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/CreatePlayingListOAuth2").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePlayingListOAuth2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePlayingListOAuth2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Configure a triggering task for Custom instruction data in the ecosystem based on scheduling rules such as one-time, daily, or business days.</p>
     * 
     * @param request the request parameters of CreateScheduleTask  CreateScheduleTaskRequest
     * @return CreateScheduleTaskResponse
     */
    @Override
    public CompletableFuture<CreateScheduleTaskResponse> createScheduleTask(CreateScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/CreateScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlarms  DeleteAlarmsRequest
     * @return DeleteAlarmsResponse
     */
    @Override
    public CompletableFuture<DeleteAlarmsResponse> deleteAlarms(DeleteAlarmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlarms").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/deleteAlarms").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlarmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlarmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified scheduled task by its ID.</p>
     * 
     * @param request the request parameters of DeleteScheduleTask  DeleteScheduleTaskRequest
     * @return DeleteScheduleTaskResponse
     */
    @Override
    public CompletableFuture<DeleteScheduleTaskResponse> deleteScheduleTask(DeleteScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/DeleteScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSub  DeleteSubRequest
     * @return DeleteSubResponse
     */
    @Override
    public CompletableFuture<DeleteSubResponse> deleteSub(DeleteSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSub").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/deleteSub").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Specify a device to modify property values such as volume.</p>
     * 
     * @param request the request parameters of DeviceControl  DeviceControlRequest
     * @return DeviceControlResponse
     */
    @Override
    public CompletableFuture<DeviceControlResponse> deviceControl(DeviceControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeviceControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/control").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeviceControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeviceControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Note: When the login state expires, the integrator must reinitiate the authorization login flow to obtain a new login state (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the login-state access credential (LoginStateAccessToken) parameter by using the Java SDK (for SDKs in other languages, consult Tmall Genie developers during integration).<br>If the API call throws a TeaException and TeaException.code is InvalidAuthentication, the login state has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the login-state access credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the login state has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of EcologyOpennessAuthenticate  EcologyOpennessAuthenticateRequest
     * @return EcologyOpennessAuthenticateResponse
     */
    @Override
    public CompletableFuture<EcologyOpennessAuthenticateResponse> ecologyOpennessAuthenticate(EcologyOpennessAuthenticateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EcologyOpennessAuthenticate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ecologyOpennessAuthenticate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EcologyOpennessAuthenticateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EcologyOpennessAuthenticateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EcologyOpennessSendVerificationCode  EcologyOpennessSendVerificationCodeRequest
     * @return EcologyOpennessSendVerificationCodeResponse
     */
    @Override
    public CompletableFuture<EcologyOpennessSendVerificationCodeResponse> ecologyOpennessSendVerificationCode(EcologyOpennessSendVerificationCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EcologyOpennessSendVerificationCode").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ecologyOpennessSendVerificationCode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EcologyOpennessSendVerificationCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EcologyOpennessSendVerificationCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindUserlistToAuthLoginWithPhoneNumber  FindUserlistToAuthLoginWithPhoneNumberRequest
     * @return FindUserlistToAuthLoginWithPhoneNumberResponse
     */
    @Override
    public CompletableFuture<FindUserlistToAuthLoginWithPhoneNumberResponse> findUserlistToAuthLoginWithPhoneNumber(FindUserlistToAuthLoginWithPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FindUserlistToAuthLoginWithPhoneNumber").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/findUserlistToAuthLoginWithPhoneNumber").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindUserlistToAuthLoginWithPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindUserlistToAuthLoginWithPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlarm  GetAlarmRequest
     * @return GetAlarmResponse
     */
    @Override
    public CompletableFuture<GetAlarmResponse> getAlarm(GetAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/getAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlbum  GetAlbumRequest
     * @return GetAlbumResponse
     */
    @Override
    public CompletableFuture<GetAlbumResponse> getAlbum(GetAlbumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlbum").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetAlbum").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlbumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlbumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlbumDetailById  GetAlbumDetailByIdRequest
     * @return GetAlbumDetailByIdResponse
     */
    @Override
    public CompletableFuture<GetAlbumDetailByIdResponse> getAlbumDetailById(GetAlbumDetailByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlbumDetailById").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/getAlbumDetailById").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlbumDetailByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlbumDetailByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Note: When the logon state expires, the integrator must initiate the authorization logon flow again to obtain a new logon state (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the logon state access credential (LoginStateAccessToken) parameter by using the Java software development kit (SDK). For SDKs in other languages, consult the Tmall Genie developer team during integration.<br>If the API call throws a TeaException and TeaException.code is InvalidAuthentication, the logon state has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the logon state access credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the logon state has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAligenieUserInfo  GetAligenieUserInfoRequest
     * @return GetAligenieUserInfoResponse
     */
    @Override
    public CompletableFuture<GetAligenieUserInfoResponse> getAligenieUserInfo(GetAligenieUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAligenieUserInfo").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getAligenieUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAligenieUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAligenieUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the corresponding authCode by specifying the user ID.</p>
     * 
     * @param request the request parameters of GetCodeEnhance  GetCodeEnhanceRequest
     * @return GetCodeEnhanceResponse
     */
    @Override
    public CompletableFuture<GetCodeEnhanceResponse> getCodeEnhance(GetCodeEnhanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCodeEnhance").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getCodeEnhance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCodeEnhanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCodeEnhanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContent  GetContentRequest
     * @return GetContentResponse
     */
    @Override
    public CompletableFuture<GetContentResponse> getContent(GetContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContent").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetContent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCurrentPlayingItem  GetCurrentPlayingItemRequest
     * @return GetCurrentPlayingItemResponse
     */
    @Override
    public CompletableFuture<GetCurrentPlayingItemResponse> getCurrentPlayingItem(GetCurrentPlayingItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCurrentPlayingItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetCurrentPlayingItem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCurrentPlayingItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCurrentPlayingItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCurrentPlayingList  GetCurrentPlayingListRequest
     * @return GetCurrentPlayingListResponse
     */
    @Override
    public CompletableFuture<GetCurrentPlayingListResponse> getCurrentPlayingList(GetCurrentPlayingListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCurrentPlayingList").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetCurrentPlayingList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCurrentPlayingListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCurrentPlayingListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceBasicInfo  GetDeviceBasicInfoRequest
     * @return GetDeviceBasicInfoResponse
     */
    @Override
    public CompletableFuture<GetDeviceBasicInfoResponse> getDeviceBasicInfo(GetDeviceBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceBasicInfo").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceBasicInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceIdByIdentity  GetDeviceIdByIdentityRequest
     * @return GetDeviceIdByIdentityResponse
     */
    @Override
    public CompletableFuture<GetDeviceIdByIdentityResponse> getDeviceIdByIdentity(GetDeviceIdByIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceIdByIdentity").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceIdByIdentity").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceIdByIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceIdByIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceSetting  GetDeviceSettingRequest
     * @return GetDeviceSettingResponse
     */
    @Override
    public CompletableFuture<GetDeviceSettingResponse> getDeviceSetting(GetDeviceSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceSetting").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceSetting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceStatusDetail  GetDeviceStatusDetailRequest
     * @return GetDeviceStatusDetailResponse
     */
    @Override
    public CompletableFuture<GetDeviceStatusDetailResponse> getDeviceStatusDetail(GetDeviceStatusDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceStatusDetail").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceStatusDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceStatusDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceStatusDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceStatusInfo  GetDeviceStatusInfoRequest
     * @return GetDeviceStatusInfoResponse
     */
    @Override
    public CompletableFuture<GetDeviceStatusInfoResponse> getDeviceStatusInfo(GetDeviceStatusInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceStatusInfo").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceStatusInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceStatusInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceStatusInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceTag  GetDeviceTagRequest
     * @return GetDeviceTagResponse
     */
    @Override
    public CompletableFuture<GetDeviceTagResponse> getDeviceTag(GetDeviceTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceTag").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getDeviceTag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJiangSuTelecomData  GetJiangSuTelecomDataRequest
     * @return GetJiangSuTelecomDataResponse
     */
    @Override
    public CompletableFuture<GetJiangSuTelecomDataResponse> getJiangSuTelecomData(GetJiangSuTelecomDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJiangSuTelecomData").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetJiangSuTelecomData").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJiangSuTelecomDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJiangSuTelecomDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the details of a specified scheduled task by its ID.</p>
     * 
     * @param request the request parameters of GetScheduleTask  GetScheduleTaskRequest
     * @return GetScheduleTaskResponse
     */
    @Override
    public CompletableFuture<GetScheduleTaskResponse> getScheduleTask(GetScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetScheduleTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUnreadMessageCount  GetUnreadMessageCountRequest
     * @return GetUnreadMessageCountResponse
     */
    @Override
    public CompletableFuture<GetUnreadMessageCountResponse> getUnreadMessageCount(GetUnreadMessageCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUnreadMessageCount").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getUnreadMessageCount").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUnreadMessageCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUnreadMessageCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserByDeviceId  GetUserByDeviceIdRequest
     * @return GetUserByDeviceIdResponse
     */
    @Override
    public CompletableFuture<GetUserByDeviceIdResponse> getUserByDeviceId(GetUserByDeviceIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserByDeviceId").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/getUserByDeviceId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserByDeviceIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserByDeviceIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the weather data for the location of the device based on the Device Information obtained from system parameters.</p>
     * 
     * @param request the request parameters of GetWeather  GetWeatherRequest
     * @return GetWeatherResponse
     */
    @Override
    public CompletableFuture<GetWeatherResponse> getWeather(GetWeatherRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWeather").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/GetWeather").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWeatherResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWeatherResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IndexControlPlayingList  IndexControlPlayingListRequest
     * @return IndexControlPlayingListResponse
     */
    @Override
    public CompletableFuture<IndexControlPlayingListResponse> indexControlPlayingList(IndexControlPlayingListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IndexControlPlayingList").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/IndexControlPlayingList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IndexControlPlayingListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IndexControlPlayingListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Modify message notification template  </p>
     * <ul>
     * <li>You need to query the templateId first, then modify other parameters based on the templateId.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of InvalidateThirdPartyAppLoginState  InvalidateThirdPartyAppLoginStateRequest
     * @return InvalidateThirdPartyAppLoginStateResponse
     */
    @Override
    public CompletableFuture<InvalidateThirdPartyAppLoginStateResponse> invalidateThirdPartyAppLoginState(InvalidateThirdPartyAppLoginStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvalidateThirdPartyAppLoginState").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/invalidateThirdPartyAppLoginState").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvalidateThirdPartyAppLoginStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvalidateThirdPartyAppLoginStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlarms  ListAlarmsRequest
     * @return ListAlarmsResponse
     */
    @Override
    public CompletableFuture<ListAlarmsResponse> listAlarms(ListAlarmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlarms").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlarmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlarmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlbumDetail  ListAlbumDetailRequest
     * @return ListAlbumDetailResponse
     */
    @Override
    public CompletableFuture<ListAlbumDetailResponse> listAlbumDetail(ListAlbumDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlbumDetail").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListAlbumDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlbumDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlbumDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlbumIsAdded  ListAlbumIsAddedRequest
     * @return ListAlbumIsAddedResponse
     */
    @Override
    public CompletableFuture<ListAlbumIsAddedResponse> listAlbumIsAdded(ListAlbumIsAddedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlbumIsAdded").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listAlbumIsAdded").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlbumIsAddedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlbumIsAddedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCateContent  ListCateContentRequest
     * @return ListCateContentResponse
     */
    @Override
    public CompletableFuture<ListCateContentResponse> listCateContent(ListCateContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCateContent").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListCateContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCateContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCateContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCateInfo  ListCateInfoRequest
     * @return ListCateInfoResponse
     */
    @Override
    public CompletableFuture<ListCateInfoResponse> listCateInfo(ListCateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCateInfo").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListCateInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCommonCateFirstFloor  ListCommonCateFirstFloorRequest
     * @return ListCommonCateFirstFloorResponse
     */
    @Override
    public CompletableFuture<ListCommonCateFirstFloorResponse> listCommonCateFirstFloor(ListCommonCateFirstFloorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCommonCateFirstFloor").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListCommonCateFirstFloor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommonCateFirstFloorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommonCateFirstFloorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCommonCateSecondFloor  ListCommonCateSecondFloorRequest
     * @return ListCommonCateSecondFloorResponse
     */
    @Override
    public CompletableFuture<ListCommonCateSecondFloorResponse> listCommonCateSecondFloor(ListCommonCateSecondFloorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCommonCateSecondFloor").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListCommonCateSecondFloor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommonCateSecondFloorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommonCateSecondFloorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeviceBasicInfo  ListDeviceBasicInfoRequest
     * @return ListDeviceBasicInfoResponse
     */
    @Override
    public CompletableFuture<ListDeviceBasicInfoResponse> listDeviceBasicInfo(ListDeviceBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeviceBasicInfo").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/listDeviceBasicInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeviceBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeviceBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeviceByUserId  ListDeviceByUserIdRequest
     * @return ListDeviceByUserIdResponse
     */
    @Override
    public CompletableFuture<ListDeviceByUserIdResponse> listDeviceByUserId(ListDeviceByUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeviceByUserId").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/listDeviceByUserId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeviceByUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeviceByUserIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeviceByUserIdAndChanel  ListDeviceByUserIdAndChanelRequest
     * @return ListDeviceByUserIdAndChanelResponse
     */
    @Override
    public CompletableFuture<ListDeviceByUserIdAndChanelResponse> listDeviceByUserIdAndChanel(ListDeviceByUserIdAndChanelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeviceByUserIdAndChanel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listDeviceByUserIdAndChanel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeviceByUserIdAndChanelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeviceByUserIdAndChanelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeviceIdByIdentities  ListDeviceIdByIdentitiesRequest
     * @return ListDeviceIdByIdentitiesResponse
     */
    @Override
    public CompletableFuture<ListDeviceIdByIdentitiesResponse> listDeviceIdByIdentities(ListDeviceIdByIdentitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeviceIdByIdentities").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/listDeviceIdByIdentities").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeviceIdByIdentitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeviceIdByIdentitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMusic  ListMusicRequest
     * @return ListMusicResponse
     */
    @Override
    public CompletableFuture<ListMusicResponse> listMusic(ListMusicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMusic").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listMusic").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMusicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMusicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPlayHistory  ListPlayHistoryRequest
     * @return ListPlayHistoryResponse
     */
    @Override
    public CompletableFuture<ListPlayHistoryResponse> listPlayHistory(ListPlayHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPlayHistory").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListPlayHistory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPlayHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPlayHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRecommendContent  ListRecommendContentRequest
     * @return ListRecommendContentResponse
     */
    @Override
    public CompletableFuture<ListRecommendContentResponse> listRecommendContent(ListRecommendContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecommendContent").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ListRecommendContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecommendContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecommendContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSub  ListSubRequest
     * @return ListSubResponse
     */
    @Override
    public CompletableFuture<ListSubResponse> listSub(ListSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSub").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listSub").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubAlbum  ListSubAlbumRequest
     * @return ListSubAlbumResponse
     */
    @Override
    public CompletableFuture<ListSubAlbumResponse> listSubAlbum(ListSubAlbumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubAlbum").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listSubAlbum").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubAlbumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubAlbumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubscriptionAlbumCategory  ListSubscriptionAlbumCategoryRequest
     * @return ListSubscriptionAlbumCategoryResponse
     */
    @Override
    public CompletableFuture<ListSubscriptionAlbumCategoryResponse> listSubscriptionAlbumCategory(ListSubscriptionAlbumCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubscriptionAlbumCategory").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/listSubscriptionAlbumCategory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubscriptionAlbumCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubscriptionAlbumCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserMessage  ListUserMessageRequest
     * @return ListUserMessageResponse
     */
    @Override
    public CompletableFuture<ListUserMessageResponse> listUserMessage(ListUserMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserMessage").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/listUserMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Different scenarios (such as daily recommendations and popular songs) can be distinguished by the Type parameter.</p>
     * 
     * @param request the request parameters of MobileRecommend  MobileRecommendRequest
     * @return MobileRecommendResponse
     */
    @Override
    public CompletableFuture<MobileRecommendResponse> mobileRecommend(MobileRecommendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MobileRecommend").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/mobile/recommend/music").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MobileRecommendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MobileRecommendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PlayAndPauseControl  PlayAndPauseControlRequest
     * @return PlayAndPauseControlResponse
     */
    @Override
    public CompletableFuture<PlayAndPauseControlResponse> playAndPauseControl(PlayAndPauseControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PlayAndPauseControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/PlayAndPauseControl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlayAndPauseControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlayAndPauseControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PlayModeControl  PlayModeControlRequest
     * @return PlayModeControlResponse
     */
    @Override
    public CompletableFuture<PlayModeControlResponse> playModeControl(PlayModeControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PlayModeControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/PlayModeControl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlayModeControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlayModeControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreviousAndNextControl  PreviousAndNextControlRequest
     * @return PreviousAndNextControlResponse
     */
    @Override
    public CompletableFuture<PreviousAndNextControlResponse> previousAndNextControl(PreviousAndNextControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviousAndNextControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/PreviousAndNextControl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviousAndNextControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviousAndNextControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProgressControl  ProgressControlRequest
     * @return ProgressControlResponse
     */
    @Override
    public CompletableFuture<ProgressControlResponse> progressControl(ProgressControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ProgressControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/ProgressControl").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProgressControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProgressControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushDeviceRenderMessage  PushDeviceRenderMessageRequest
     * @return PushDeviceRenderMessageResponse
     */
    @Override
    public CompletableFuture<PushDeviceRenderMessageResponse> pushDeviceRenderMessage(PushDeviceRenderMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushDeviceRenderMessage").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/pushDeviceRenderMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushDeviceRenderMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushDeviceRenderMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushDeviceToastMessage  PushDeviceToastMessageRequest
     * @return PushDeviceToastMessageResponse
     */
    @Override
    public CompletableFuture<PushDeviceToastMessageResponse> pushDeviceToastMessage(PushDeviceToastMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushDeviceToastMessage").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/pushDeviceToastMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushDeviceToastMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushDeviceToastMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMusicType  QueryMusicTypeRequest
     * @return QueryMusicTypeResponse
     */
    @Override
    public CompletableFuture<QueryMusicTypeResponse> queryMusicType(QueryMusicTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMusicType").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/queryMusicType").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMusicTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMusicTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryUserDeviceListByTmeUserId  QueryUserDeviceListByTmeUserIdRequest
     * @return QueryUserDeviceListByTmeUserIdResponse
     */
    @Override
    public CompletableFuture<QueryUserDeviceListByTmeUserIdResponse> queryUserDeviceListByTmeUserId(QueryUserDeviceListByTmeUserIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryUserDeviceListByTmeUserId").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/queryUserDeviceListByTmeUserId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUserDeviceListByTmeUserIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUserDeviceListByTmeUserIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReadMessage  ReadMessageRequest
     * @return ReadMessageResponse
     */
    @Override
    public CompletableFuture<ReadMessageResponse> readMessage(ReadMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReadMessage").setMethod(HttpMethod.GET).setPathRegex("/v1.0/ssp/readMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Perform activation and attachment by scanning the QR code related to activation and attachment displayed on the device.</p>
     * 
     * @param request the request parameters of ScanCodeBind  ScanCodeBindRequest
     * @return ScanCodeBindResponse
     */
    @Override
    public CompletableFuture<ScanCodeBindResponse> scanCodeBind(ScanCodeBindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScanCodeBind").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/scanCode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScanCodeBindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScanCodeBindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScgSearch  ScgSearchRequest
     * @return ScgSearchResponse
     */
    @Override
    public CompletableFuture<ScgSearchResponse> scgSearch(ScgSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScgSearch").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/scgSearch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScgSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScgSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchContent  SearchContentRequest
     * @return SearchContentResponse
     */
    @Override
    public CompletableFuture<SearchContentResponse> searchContent(SearchContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchContent").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/SearchContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    @Override
    public CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendMessage").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/sendMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDeviceSetting  SetDeviceSettingRequest
     * @return SetDeviceSettingResponse
     */
    @Override
    public CompletableFuture<SetDeviceSettingResponse> setDeviceSetting(SetDeviceSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetDeviceSetting").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/setDeviceSetting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeviceSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeviceSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ThirdImmediateMsgPush  ThirdImmediateMsgPushRequest
     * @return ThirdImmediateMsgPushResponse
     */
    @Override
    public CompletableFuture<ThirdImmediateMsgPushResponse> thirdImmediateMsgPush(ThirdImmediateMsgPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ThirdImmediateMsgPush").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/thirdImmediateMsgPush").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ThirdImmediateMsgPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ThirdImmediateMsgPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Note: When the logon credential expires, the integrator must initiate the authorization logon flow again to obtain a new logon credential (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the logon credential (LoginStateAccessToken) parameter via the Java software development kit (SDK). For SDKs in other languages, consult Tmall Genie developers during integration.<br>If the API call throws a TeaException and TeaException.code is &quot;InvalidAuthentication&quot;, the logon credential has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the logon credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the logon credential has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of UnbindAligenieUser  UnbindAligenieUserRequest
     * @return UnbindAligenieUserResponse
     */
    @Override
    public CompletableFuture<UnbindAligenieUserResponse> unbindAligenieUser(UnbindAligenieUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindAligenieUser").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/unbindAligenieUser").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindAligenieUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindAligenieUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindDevice  UnbindDeviceRequest
     * @return UnbindDeviceResponse
     */
    @Override
    public CompletableFuture<UnbindDeviceResponse> unbindDevice(UnbindDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindDevice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/unbindDevice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlarm  UpdateAlarmRequest
     * @return UpdateAlarmResponse
     */
    @Override
    public CompletableFuture<UpdateAlarmResponse> updateAlarm(UpdateAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ssp/updateAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
