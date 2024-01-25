// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudauth_intl20220809.models.*;
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
        this.product = "Cloudauth-intl";
        this.version = "2022-08-09";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CardOcrResponse> cardOcr(CardOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CardOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CardOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CardOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CheckResultResponse> checkResult(CheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DeleteVerifyResultResponse> deleteVerifyResult(DeleteVerifyResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVerifyResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVerifyResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVerifyResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAddressLabelsResponse> describeAddressLabels(DescribeAddressLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAddressLabels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddressLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddressLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAddressOverviewResponse> describeAddressOverview(DescribeAddressOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAddressOverview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddressOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddressOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeMaliciousAddressResponse> describeMaliciousAddress(DescribeMaliciousAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMaliciousAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMaliciousAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMaliciousAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRiskScoreResponse> describeRiskScore(DescribeRiskScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskScore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTransactionsListResponse> describeTransactionsList(DescribeTransactionsListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTransactionsList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTransactionsListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTransactionsListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeWeb3AddressLabelsResponse> describeWeb3AddressLabels(DescribeWeb3AddressLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWeb3AddressLabels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWeb3AddressLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWeb3AddressLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeWeb3RiskScoreResponse> describeWeb3RiskScore(DescribeWeb3RiskScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWeb3RiskScore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWeb3RiskScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWeb3RiskScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeWeb3TransactionLabelsResponse> describeWeb3TransactionLabels(DescribeWeb3TransactionLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWeb3TransactionLabels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWeb3TransactionLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWeb3TransactionLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DocOcrResponse> docOcr(DocOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DocOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EkycVerifyResponse> ekycVerify(EkycVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EkycVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EkycVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EkycVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FaceCompareResponse> faceCompare(FaceCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceCompare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FaceLivenessResponse> faceLiveness(FaceLivenessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceLiveness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceLivenessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceLivenessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<FraudResultCallBackResponse> fraudResultCallBack(FraudResultCallBackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FraudResultCallBack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FraudResultCallBackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FraudResultCallBackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<Id2MetaVerifyIntlResponse> id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InitializeResponse> initialize(InitializeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Initialize").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<Mobile3MetaVerifyIntlResponse> mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
