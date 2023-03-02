// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.companyreg20200306.models.*;
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
        this.product = "companyreg";
        this.version = "2020-03-06";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "companyreg.aliyuncs.com"),
            new TeaPair("ap-south-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-chengdu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-edge-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-fujian", "companyreg.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wuhan", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-central-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "companyreg.aliyuncs.com"),
            new TeaPair("me-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "companyreg.aliyuncs.com"),
            new TeaPair("us-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("us-west-1", "companyreg.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<BindProduceAuthorizationResponse> bindProduceAuthorization(BindProduceAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindProduceAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindProduceAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindProduceAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CloseIntentionForPartnerResponse> closeIntentionForPartner(CloseIntentionForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseIntentionForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseIntentionForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseIntentionForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CloseUserIntentionResponse> closeUserIntention(CloseUserIntentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseUserIntention").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseUserIntentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseUserIntentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateBusinessOpportunityResponse> createBusinessOpportunity(CreateBusinessOpportunityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBusinessOpportunity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBusinessOpportunityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBusinessOpportunityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateProduceForPartnerResponse> createProduceForPartner(CreateProduceForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProduceForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProduceForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProduceForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePartnerConfigResponse> describePartnerConfig(DescribePartnerConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePartnerConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePartnerConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePartnerConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GenerateUploadFilePolicyResponse> generateUploadFilePolicy(GenerateUploadFilePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateUploadFilePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateUploadFilePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateUploadFilePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAlipayUrl").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlipayUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlipayUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIntentionNoteResponse> listIntentionNote(ListIntentionNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntentionNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntentionNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntentionNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListProduceAuthorizationResponse> listProduceAuthorization(ListProduceAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProduceAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProduceAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProduceAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListUserDetailSolutionsResponse> listUserDetailSolutions(ListUserDetailSolutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserDetailSolutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserDetailSolutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserDetailSolutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListUserIntentionNotesResponse> listUserIntentionNotes(ListUserIntentionNotesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserIntentionNotes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserIntentionNotesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserIntentionNotesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListUserIntentionsResponse> listUserIntentions(ListUserIntentionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserIntentions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserIntentionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserIntentionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListUserProduceOperateLogsResponse> listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserProduceOperateLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserProduceOperateLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserProduceOperateLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListUserSolutionsResponse> listUserSolutions(ListUserSolutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserSolutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserSolutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserSolutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<OperateProduceForPartnerResponse> operateProduceForPartner(OperateProduceForPartnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateProduceForPartner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateProduceForPartnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateProduceForPartnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMeasureData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMeasureDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMeasureDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutMeasureReadyFlagResponse> putMeasureReadyFlag(PutMeasureReadyFlagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMeasureReadyFlag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMeasureReadyFlagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMeasureReadyFlagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryAvailableNumbersResponse> queryAvailableNumbers(QueryAvailableNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAvailableNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvailableNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvailableNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryBagRemainingResponse> queryBagRemaining(QueryBagRemainingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBagRemaining").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBagRemainingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBagRemainingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryCommodityConfigResponse> queryCommodityConfig(QueryCommodityConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCommodityConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCommodityConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCommodityConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryInstanceResponse> queryInstance(QueryInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryPartnerIntentionListResponse> queryPartnerIntentionList(QueryPartnerIntentionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPartnerIntentionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPartnerIntentionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPartnerIntentionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryPartnerProduceListResponse> queryPartnerProduceList(QueryPartnerProduceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPartnerProduceList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPartnerProduceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPartnerProduceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryUserNeedAuthResponse> queryUserNeedAuth(QueryUserNeedAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryUserNeedAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUserNeedAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUserNeedAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RecordPostBackResponse> recordPostBack(RecordPostBackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecordPostBack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecordPostBackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecordPostBackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RejectSolutionResponse> rejectSolution(RejectSolutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectSolution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectSolutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectSolutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RejectUserSolutionResponse> rejectUserSolution(RejectUserSolutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectUserSolution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectUserSolutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectUserSolutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleaseProduceAuthorizationResponse> releaseProduceAuthorization(ReleaseProduceAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseProduceAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseProduceAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseProduceAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartBackToBackCallResponse> startBackToBackCall(StartBackToBackCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartBackToBackCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartBackToBackCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartBackToBackCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitIntentionNoteResponse> submitIntentionNote(SubmitIntentionNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitIntentionNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIntentionNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIntentionNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitSolutionResponse> submitSolution(SubmitSolutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSolution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSolutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSolutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TransferIntentionOwnerResponse> transferIntentionOwner(TransferIntentionOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferIntentionOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferIntentionOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferIntentionOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TransferProduceOwnerResponse> transferProduceOwner(TransferProduceOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferProduceOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferProduceOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferProduceOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
