// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sas20210114.models.*;
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
        this.product = "Sas";
        this.version = "2021-01-14";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("eu-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao-acdr-ut-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-mybk", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "tds.cn-shanghai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateScreenSetting  CreateScreenSettingRequest
     * @return CreateScreenSettingResponse
     */
    @Override
    public CompletableFuture<CreateScreenSettingResponse> createScreenSetting(CreateScreenSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScreenSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScreenSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScreenSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScreenSetting  DeleteScreenSettingRequest
     * @return DeleteScreenSettingResponse
     */
    @Override
    public CompletableFuture<DeleteScreenSettingResponse> deleteScreenSetting(DeleteScreenSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScreenSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScreenSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScreenSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenAlarmEventList  DescribeScreenAlarmEventListRequest
     * @return DescribeScreenAlarmEventListResponse
     */
    @Override
    public CompletableFuture<DescribeScreenAlarmEventListResponse> describeScreenAlarmEventList(DescribeScreenAlarmEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenAlarmEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenAlarmEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenAlarmEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenAttackAnalysisData  DescribeScreenAttackAnalysisDataRequest
     * @return DescribeScreenAttackAnalysisDataResponse
     */
    @Override
    public CompletableFuture<DescribeScreenAttackAnalysisDataResponse> describeScreenAttackAnalysisData(DescribeScreenAttackAnalysisDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenAttackAnalysisData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenAttackAnalysisDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenAttackAnalysisDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenCloudHcRisk  DescribeScreenCloudHcRiskRequest
     * @return DescribeScreenCloudHcRiskResponse
     */
    @Override
    public CompletableFuture<DescribeScreenCloudHcRiskResponse> describeScreenCloudHcRisk(DescribeScreenCloudHcRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenCloudHcRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenCloudHcRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenCloudHcRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenDataMap  DescribeScreenDataMapRequest
     * @return DescribeScreenDataMapResponse
     */
    @Override
    public CompletableFuture<DescribeScreenDataMapResponse> describeScreenDataMap(DescribeScreenDataMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenDataMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenDataMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenDataMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenEmerRisk  DescribeScreenEmerRiskRequest
     * @return DescribeScreenEmerRiskResponse
     */
    @Override
    public CompletableFuture<DescribeScreenEmerRiskResponse> describeScreenEmerRisk(DescribeScreenEmerRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenEmerRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenEmerRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenEmerRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenHostStatistics  DescribeScreenHostStatisticsRequest
     * @return DescribeScreenHostStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeScreenHostStatisticsResponse> describeScreenHostStatistics(DescribeScreenHostStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenHostStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenHostStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenHostStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenOperateInfo  DescribeScreenOperateInfoRequest
     * @return DescribeScreenOperateInfoResponse
     */
    @Override
    public CompletableFuture<DescribeScreenOperateInfoResponse> describeScreenOperateInfo(DescribeScreenOperateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenOperateInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenOperateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenOperateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenOssUploadInfo  DescribeScreenOssUploadInfoRequest
     * @return DescribeScreenOssUploadInfoResponse
     */
    @Override
    public CompletableFuture<DescribeScreenOssUploadInfoResponse> describeScreenOssUploadInfo(DescribeScreenOssUploadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenOssUploadInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenOssUploadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenOssUploadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenScoreThread  DescribeScreenScoreThreadRequest
     * @return DescribeScreenScoreThreadResponse
     */
    @Override
    public CompletableFuture<DescribeScreenScoreThreadResponse> describeScreenScoreThread(DescribeScreenScoreThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenScoreThread").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenScoreThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenScoreThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenSecurityStatInfo  DescribeScreenSecurityStatInfoRequest
     * @return DescribeScreenSecurityStatInfoResponse
     */
    @Override
    public CompletableFuture<DescribeScreenSecurityStatInfoResponse> describeScreenSecurityStatInfo(DescribeScreenSecurityStatInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenSecurityStatInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenSecurityStatInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenSecurityStatInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenSetting  DescribeScreenSettingRequest
     * @return DescribeScreenSettingResponse
     */
    @Override
    public CompletableFuture<DescribeScreenSettingResponse> describeScreenSetting(DescribeScreenSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenSummaryInfo  DescribeScreenSummaryInfoRequest
     * @return DescribeScreenSummaryInfoResponse
     */
    @Override
    public CompletableFuture<DescribeScreenSummaryInfoResponse> describeScreenSummaryInfo(DescribeScreenSummaryInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenSummaryInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenSummaryInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenSummaryInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenTitles  DescribeScreenTitlesRequest
     * @return DescribeScreenTitlesResponse
     */
    @Override
    public CompletableFuture<DescribeScreenTitlesResponse> describeScreenTitles(DescribeScreenTitlesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenTitles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenTitlesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenTitlesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenUploadPicture  DescribeScreenUploadPictureRequest
     * @return DescribeScreenUploadPictureResponse
     */
    @Override
    public CompletableFuture<DescribeScreenUploadPictureResponse> describeScreenUploadPicture(DescribeScreenUploadPictureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenUploadPicture").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenUploadPictureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenUploadPictureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenVersionConfig  DescribeScreenVersionConfigRequest
     * @return DescribeScreenVersionConfigResponse
     */
    @Override
    public CompletableFuture<DescribeScreenVersionConfigResponse> describeScreenVersionConfig(DescribeScreenVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenVersionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileDetectResultInner  GetFileDetectResultInnerRequest
     * @return GetFileDetectResultInnerResponse
     */
    @Override
    public CompletableFuture<GetFileDetectResultInnerResponse> getFileDetectResultInner(GetFileDetectResultInnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileDetectResultInner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileDetectResultInnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileDetectResultInnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGlobalUserConfig  ListGlobalUserConfigRequest
     * @return ListGlobalUserConfigResponse
     */
    @Override
    public CompletableFuture<ListGlobalUserConfigResponse> listGlobalUserConfig(ListGlobalUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGlobalUserConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGlobalUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGlobalUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
