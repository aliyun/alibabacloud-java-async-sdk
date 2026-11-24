// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.market20151101.models.*;
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
        this.product = "Market";
        this.version = "2015-11-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "market.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "market.aliyuncs.com"),
            new TeaPair("cn-chengdu", "market.aliyuncs.com"),
            new TeaPair("cn-hongkong", "market.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "market.aliyuncs.com"),
            new TeaPair("cn-qingdao", "market.aliyuncs.com"),
            new TeaPair("cn-shanghai", "market.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "market.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "market.aliyuncs.com"),
            new TeaPair("eu-central-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "market.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "market.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "market.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "market.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    @Override
    public CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AutoRenewInstance  AutoRenewInstanceRequest
     * @return AutoRenewInstanceResponse
     */
    @Override
    public CompletableFuture<AutoRenewInstanceResponse> autoRenewInstance(AutoRenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AutoRenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AutoRenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AutoRenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Confirms the receipt of a subscription notification failure message.</p>
     * <ul>
     * <li>After a successful call, the message will no longer be returned in subsequent queries. The platform considers that the merchant has correctly processed the message.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfirmNotification  ConfirmNotificationRequest
     * @return ConfirmNotificationResponse
     */
    @Override
    public CompletableFuture<ConfirmNotificationResponse> confirmNotification(ConfirmNotificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmNotification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmNotificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmNotificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing method and <a href="https://market.aliyun.com/">pricing</a> of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    @Override
    public CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CrossAccountVerifyToken  CrossAccountVerifyTokenRequest
     * @return CrossAccountVerifyTokenResponse
     */
    @Override
    public CompletableFuture<CrossAccountVerifyTokenResponse> crossAccountVerifyToken(CrossAccountVerifyTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CrossAccountVerifyToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CrossAccountVerifyTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CrossAccountVerifyTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><strong>Note: This API operation supports Alibaba Cloud accounts and RAM users in retrieving API quota, total capacity, and usage information.</strong></h3>
     * 
     * @param request the request parameters of DescribeApiMetering  DescribeApiMeteringRequest
     * @return DescribeApiMeteringResponse
     */
    @Override
    public CompletableFuture<DescribeApiMeteringResponse> describeApiMetering(DescribeApiMeteringRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiMetering").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiMeteringResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiMeteringResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCurrentNodeInfo  DescribeCurrentNodeInfoRequest
     * @return DescribeCurrentNodeInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCurrentNodeInfoResponse> describeCurrentNodeInfo(DescribeCurrentNodeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCurrentNodeInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCurrentNodeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCurrentNodeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account.</p>
     * 
     * @param request the request parameters of DescribeDistributionProducts  DescribeDistributionProductsRequest
     * @return DescribeDistributionProductsResponse
     */
    @Override
    public CompletableFuture<DescribeDistributionProductsResponse> describeDistributionProducts(DescribeDistributionProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDistributionProducts").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDistributionProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDistributionProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account. Calls from non-promotion service provider accounts will fail.</p>
     * 
     * @param request the request parameters of DescribeDistributionProductsLink  DescribeDistributionProductsLinkRequest
     * @return DescribeDistributionProductsLinkResponse
     */
    @Override
    public CompletableFuture<DescribeDistributionProductsLinkResponse> describeDistributionProductsLink(DescribeDistributionProductsLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDistributionProductsLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDistributionProductsLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDistributionProductsLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the information about failed subscription notifications for a service provider.</p>
     * <ul>
     * <li>If no unconfirmed failed notifications exist, TotalCount returns 0.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFailedNotifications  DescribeFailedNotificationsRequest
     * @return DescribeFailedNotificationsResponse
     */
    @Override
    public CompletableFuture<DescribeFailedNotificationsResponse> describeFailedNotifications(DescribeFailedNotificationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFailedNotifications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFailedNotificationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFailedNotificationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageInstanceForIsv  DescribeImageInstanceForIsvRequest
     * @return DescribeImageInstanceForIsvResponse
     */
    @Override
    public CompletableFuture<DescribeImageInstanceForIsvResponse> describeImageInstanceForIsv(DescribeImageInstanceForIsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageInstanceForIsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageInstanceForIsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageInstanceForIsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceForIsv  DescribeInstanceForIsvRequest
     * @return DescribeInstanceForIsvResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceForIsvResponse> describeInstanceForIsv(DescribeInstanceForIsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceForIsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceForIsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceForIsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries business information based on an authorization code and first verifies whether the authorization code is valid.</p>
     * <ul>
     * <li>If the authorization code is invalid, an error message is returned.</li>
     * <li>If the authorization code is valid, the authorization information is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvoiceForIsv  DescribeInvoiceForIsvRequest
     * @return DescribeInvoiceForIsvResponse
     */
    @Override
    public CompletableFuture<DescribeInvoiceForIsvResponse> describeInvoiceForIsv(DescribeInvoiceForIsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvoiceForIsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvoiceForIsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvoiceForIsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLicense  DescribeLicenseRequest
     * @return DescribeLicenseResponse
     */
    @Override
    public CompletableFuture<DescribeLicenseResponse> describeLicense(DescribeLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOrder  DescribeOrderRequest
     * @return DescribeOrderResponse
     */
    @Override
    public CompletableFuture<DescribeOrderResponse> describeOrder(DescribeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOrderForIsv  DescribeOrderForIsvRequest
     * @return DescribeOrderForIsvResponse
     */
    @Override
    public CompletableFuture<DescribeOrderForIsvResponse> describeOrderForIsv(DescribeOrderForIsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOrderForIsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOrderForIsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOrderForIsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    @Override
    public CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProduct  DescribeProductRequest
     * @return DescribeProductResponse
     */
    @Override
    public CompletableFuture<DescribeProductResponse> describeProduct(DescribeProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProducts  DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    @Override
    public CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProjectAttachments  DescribeProjectAttachmentsRequest
     * @return DescribeProjectAttachmentsResponse
     */
    @Override
    public CompletableFuture<DescribeProjectAttachmentsResponse> describeProjectAttachments(DescribeProjectAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProjectInfo  DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     */
    @Override
    public CompletableFuture<DescribeProjectInfoResponse> describeProjectInfo(DescribeProjectInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProjectMessages  DescribeProjectMessagesRequest
     * @return DescribeProjectMessagesResponse
     */
    @Override
    public CompletableFuture<DescribeProjectMessagesResponse> describeProjectMessages(DescribeProjectMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectMessages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProjectNodes  DescribeProjectNodesRequest
     * @return DescribeProjectNodesResponse
     */
    @Override
    public CompletableFuture<DescribeProjectNodesResponse> describeProjectNodes(DescribeProjectNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProjectOperateLogs  DescribeProjectOperateLogsRequest
     * @return DescribeProjectOperateLogsResponse
     */
    @Override
    public CompletableFuture<DescribeProjectOperateLogsResponse> describeProjectOperateLogs(DescribeProjectOperateLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProjectOperateLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProjectOperateLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProjectOperateLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of FinishCurrentProjectNode  FinishCurrentProjectNodeRequest
     * @return FinishCurrentProjectNodeResponse
     */
    @Override
    public CompletableFuture<FinishCurrentProjectNodeResponse> finishCurrentProjectNode(FinishCurrentProjectNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FinishCurrentProjectNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishCurrentProjectNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishCurrentProjectNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries information about failed subscription notifications for merchants.</p>
     * <ul>
     * <li>If no unconfirmed notification failure information exists, TotalCount returns 0.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInvoiceForIsv  ModifyInvoiceForIsvRequest
     * @return ModifyInvoiceForIsvResponse
     */
    @Override
    public CompletableFuture<ModifyInvoiceForIsvResponse> modifyInvoiceForIsv(ModifyInvoiceForIsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInvoiceForIsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInvoiceForIsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInvoiceForIsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of PauseProject  PauseProjectRequest
     * @return PauseProjectResponse
     */
    @Override
    public CompletableFuture<PauseProjectResponse> pauseProject(PauseProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Encoding and format requirements</h3>
     * <ul>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Ensure that the Metering field in the parameters is submitted strictly according to the examples in the documentation. In the past, many submissions were not valid JSON fields. You can use a JSON formatting tool to check the field before submission. Otherwise, the API call will fail.</li>
     * </ul>
     * <h3>Request frequency and single write volume limits</h3>
     * <ul>
     * <li>For hourly or daily metering: Alibaba Cloud Marketplace limits requests to once every 60 seconds per InstanceId, and each request supports writing up to 100 metering data records.</li>
     * <li>For real-time metering (for large model scenarios): Alibaba Cloud Marketplace has no frequency limit for requests per InstanceId, and each request supports writing up to 10 metering data records.</li>
     * </ul>
     * <h3>Limits on batch pushing of metering data</h3>
     * <ul>
     * <li>Batch pushing across InstanceIds of different products is not supported. When pushing in batches, ensure that all InstanceIds belong to the same product.</li>
     * <li>When pushing metering data in batches, the InstanceId attribute must belong to instances generated by the same product. Pushing instances of multiple products at the same time is not supported.</li>
     * </ul>
     * <h3>Time requirements for pushing metering data</h3>
     * <ul>
     * <li>For products billed hourly, the billing cutoff time is the next hour, and metering data must be pushed on time. For example, if the metering data is for 08:10 to 08:20, it must be pushed before 09:59. Otherwise, no bill will be generated. The rule for daily billing is similar: the data for the previous day must be pushed before 01:59 the next day. Otherwise, an error will be reported when pushing the metering data, and no bill will be generated.</li>
     * <li>For products billed by the minute, real-time pushed data is aggregated by the minute, and bills are generated by the minute.</li>
     * <li>If a product is set to real-time billing, StartTime and EndTime can be of any time width, but EndTime must be greater than StartTime.</li>
     * <li>If a product is set to non-real-time billing (such as hourly or daily), the interval between StartTime and EndTime must be greater than 5 minutes.</li>
     * </ul>
     * <h3>Timeliness of pushing data and billing</h3>
     * <ul>
     * <li>If the instance status is expired, metering data pushed after the expiration will not be billed. For example, if an instance expires at 2025-07-09 12:20:00, the metering data pushed for the hour from 2025-07-09 13:00:00 to 2025-07-09 14:00:00 will not be billed. However, the metering data for the hour from 2025-07-09 12:00:00 to 2025-07-09 13:00:00 can still be billed normally.</li>
     * <li>After metering data is pushed, bills are not generated immediately. For hourly billing, the bill is generated in the next time interval. For example, the bill for 08:00 to 09:00 is generated after 10:00. For daily billing, the bill is generated the next day. After the bill is generated, customers can view it in <a href="https://billing-cost.console.aliyun.com/finance/expense-report/expense-detail-by-instance">Alibaba Cloud Bill Details</a>.</li>
     * </ul>
     * <h3>Rounding down of amounts</h3>
     * <ul>
     * <li>If the bill amount is too small and a single bill amount is less than 0.01 CNY, the bill amount for the buyer is 0. For example, if the unit price of a product is 0.001 CNY per time and it is billed by the minute, and 9 times are consumed every minute, the bill amount per minute is 0. If it is billed hourly and the bill amount for a single hour is less than 0.01 CNY, the bill amount for the buyer is 0. The probability of rounding down to zero for minute-level billing may be higher than that for hourly billing.</li>
     * </ul>
     * 
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    @Override
    public CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushMeteringData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushMeteringDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushMeteringDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation applies to prepaid pay-per-use products. Service providers can use this operation to push user usage deductions to Alibaba Cloud Marketplace.</li>
     * <li>This operation uses a forced update mode to directly deduct the specified number of uses. The caller must determine whether the user\&quot;s usage exceeds the limit.</li>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. The same <code>ClientToken</code> cannot be submitted repeatedly within 24 hours.</li>
     * <li>Retries for the same deduction operation must use the same <code>ClientToken</code>. New operations must use a new <code>ClientToken</code>.</li>
     * <li>If the previous request succeeded, even if no response was received due to a gateway timeout, a retry with the same <code>ClientToken</code> returns a success response idempotently without duplicate deductions.</li>
     * <li>If the result of the previous request is undetermined and the request is in the PROCESSING state, a retry with the same <code>ClientToken</code> returns a <code>DuplicateClientToken</code> error. Retry later or contact Alibaba Cloud Marketplace to confirm the push status.</li>
     * <li>Only one operation can be executed for the same <code>InstanceId</code> at a time. Concurrent requests return a <code>Throttling</code> error. Retry later.</li>
     * <li>You can directly call this operation in <a href="https://api.aliyun.com/#product=Market&api=PushTimesUsage&type=RPC&version=2015-11-01">OpenAPI Explorer</a> without the need to manually calculate the signature.</li>
     * </ul>
     * 
     * @param request the request parameters of PushTimesUsage  PushTimesUsageRequest
     * @return PushTimesUsageResponse
     */
    @Override
    public CompletableFuture<PushTimesUsageResponse> pushTimesUsage(PushTimesUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushTimesUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushTimesUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushTimesUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of ResumeProject  ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    @Override
    public CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of RollbackCurrentProjectNode  RollbackCurrentProjectNodeRequest
     * @return RollbackCurrentProjectNodeResponse
     */
    @Override
    public CompletableFuture<RollbackCurrentProjectNodeResponse> rollbackCurrentProjectNode(RollbackCurrentProjectNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackCurrentProjectNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackCurrentProjectNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackCurrentProjectNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
