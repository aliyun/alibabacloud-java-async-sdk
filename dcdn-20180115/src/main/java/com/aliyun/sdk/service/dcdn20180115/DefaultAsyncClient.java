// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dcdn20180115.models.*;
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
        this.product = "dcdn";
        this.version = "2018-01-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dcdn.aliyuncs.com"),
            new TeaPair("ap-south-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dcdn.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-fujian", "dcdn.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dcdn.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dcdn.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-central-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dcdn.aliyuncs.com"),
            new TeaPair("me-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dcdn.aliyuncs.com"),
            new TeaPair("us-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("us-west-1", "dcdn.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * > *   Dynamic Content Delivery Network (DCDN) is activated.
      * > *   Internet content provider (ICP) filing is complete for the accelerated domain name.
      * > *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * > *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<AddDcdnDomainResponse> addDcdnDomain(AddDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Make sure that the IPA service is activated before you add a domain name to accelerate.
      * *   Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    @Override
    public CompletableFuture<AddDcdnIpaDomainResponse> addDcdnIpaDomain(AddDcdnIpaDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDcdnIpaDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDcdnIpaDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDcdnIpaDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **Prerequisites**:
      * *   The [DCDN service is activated](~~64926~~).
      * *   Internet content provider (ICP) filing is complete for the accelerated domain names.
      * > *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * >*   You can specify up to 50 domain names in each request.
      * >*   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchAddDcdnDomainResponse> batchAddDcdnDomain(BatchAddDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAddDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchCreateDcdnWafRulesResponse> batchCreateDcdnWafRules(BatchCreateDcdnWafRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateDcdnWafRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateDcdnWafRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateDcdnWafRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > - You can specify up to 50 domain names in each request.
      * > - You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchDeleteDcdnDomainConfigsResponse> batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteDcdnDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteDcdnDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteDcdnDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BatchDeleteDcdnKvResponse> batchDeleteDcdnKv(BatchDeleteDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteDcdnKv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<BatchDeleteDcdnWafRulesResponse> batchDeleteDcdnWafRules(BatchDeleteDcdnWafRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteDcdnWafRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteDcdnWafRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteDcdnWafRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchModifyDcdnWafRulesResponse> batchModifyDcdnWafRules(BatchModifyDcdnWafRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchModifyDcdnWafRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchModifyDcdnWafRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchModifyDcdnWafRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BatchPutDcdnKvResponse> batchPutDcdnKv(BatchPutDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchPutDcdnKv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchPutDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchPutDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchSetDcdnDomainCertificateResponse> batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetDcdnDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetDcdnDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetDcdnDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchSetDcdnDomainConfigsResponse> batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetDcdnDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetDcdnDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetDcdnDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchSetDcdnIpaDomainConfigsResponse> batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetDcdnIpaDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetDcdnIpaDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetDcdnIpaDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<BatchSetDcdnWafDomainConfigsResponse> batchSetDcdnWafDomainConfigs(BatchSetDcdnWafDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetDcdnWafDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetDcdnWafDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetDcdnWafDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If an accelerated domain name is in an invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchStartDcdnDomainResponse> batchStartDcdnDomain(BatchStartDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchStartDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStartDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStartDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.
      * >*   You can specify up to 50 domain names in each request.
      * >*   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<BatchStopDcdnDomainResponse> batchStopDcdnDomain(BatchStopDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchStopDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStopDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStopDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<CheckDcdnProjectExistResponse> checkDcdnProjectExist(CheckDcdnProjectExistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDcdnProjectExist").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDcdnProjectExistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDcdnProjectExistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The call frequency of the API is no more than 100 queries per second.
      *
     */
    @Override
    public CompletableFuture<CommitStagingRoutineCodeResponse> commitStagingRoutineCode(CommitStagingRoutineCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CommitStagingRoutineCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommitStagingRoutineCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommitStagingRoutineCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDcdnCertificateSigningRequestResponse> createDcdnCertificateSigningRequest(CreateDcdnCertificateSigningRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnCertificateSigningRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnCertificateSigningRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnCertificateSigningRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **
      * **You can call this operation up to three times per second.
      *
     */
    @Override
    public CompletableFuture<CreateDcdnDeliverTaskResponse> createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnDeliverTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnDeliverTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnDeliverTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<CreateDcdnSLSRealTimeLogDeliveryResponse> createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnSLSRealTimeLogDelivery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnSLSRealTimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnSLSRealTimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.
      * > *   You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<CreateDcdnSubTaskResponse> createDcdnSubTask(CreateDcdnSubTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnSubTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnSubTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnSubTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDcdnWafGroupResponse> createDcdnWafGroup(CreateDcdnWafGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnWafGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnWafGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnWafGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 20 times per second per user.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<CreateDcdnWafPolicyResponse> createDcdnWafPolicy(CreateDcdnWafPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDcdnWafPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDcdnWafPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDcdnWafPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.
      * >*   You can only specify the production and staging environments when you call this operation.
      * >*   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<CreateRoutineResponse> createRoutine(CreateRoutineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRoutine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRoutineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRoutineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<CreateSlrAndSlsProjectResponse> createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSlrAndSlsProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSlrAndSlsProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSlrAndSlsProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 3.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnDeliverTaskResponse> deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnDeliverTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnDeliverTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnDeliverTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   Before you delete your domain name, you need to request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * > *   If you call the **DeleteDcdnDomain** operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the [StopDcdnDomain](~~130622~~) operation.
      * > *   You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnDomainResponse> deleteDcdnDomain(DeleteDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * *   This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the **StopDcdnIpaDomain** operation.****
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnIpaDomainResponse> deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnIpaDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnIpaDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnIpaDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnIpaSpecificConfigResponse> deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnIpaSpecificConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnIpaSpecificConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnIpaSpecificConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDcdnKvResponse> deleteDcdnKv(DeleteDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnKv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDcdnKvNamespaceResponse> deleteDcdnKvNamespace(DeleteDcdnKvNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnKvNamespace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnKvNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnKvNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnRealTimeLogProjectResponse> deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnRealTimeLogProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnRealTimeLogProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnRealTimeLogProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnSpecificConfigResponse> deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnSpecificConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnSpecificConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnSpecificConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnSpecificStagingConfigResponse> deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnSpecificStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnSpecificStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnSpecificStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 3 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnSubTaskResponse> deleteDcdnSubTask(DeleteDcdnSubTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnSubTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnSubTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnSubTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDcdnUserConfigResponse> deleteDcdnUserConfig(DeleteDcdnUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnUserConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDcdnWafGroupResponse> deleteDcdnWafGroup(DeleteDcdnWafGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnWafGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnWafGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnWafGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<DeleteDcdnWafPolicyResponse> deleteDcdnWafPolicy(DeleteDcdnWafPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDcdnWafPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDcdnWafPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDcdnWafPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteRoutineResponse> deleteRoutine(DeleteRoutineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRoutine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoutineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoutineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteRoutineCodeRevisionResponse> deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRoutineCodeRevision").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoutineCodeRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoutineCodeRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DeleteRoutineConfEnvsResponse> deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRoutineConfEnvs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoutineConfEnvsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoutineConfEnvsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnAclFieldsResponse> describeDcdnAclFields(DescribeDcdnAclFieldsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnAclFields").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnAclFieldsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnAclFieldsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnBgpBpsDataResponse> describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnBgpBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnBgpBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnBgpBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnBgpTrafficDataResponse> describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnBgpTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnBgpTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnBgpTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnBlockedRegionsResponse> describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnBlockedRegions").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnBlockedRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnBlockedRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnCertificateDetailResponse> describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnCertificateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnCertificateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnCertificateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnCertificateListResponse> describeDcdnCertificateList(DescribeDcdnCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnDdosServiceResponse> describeDcdnDdosService(DescribeDcdnDdosServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDdosService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDdosServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDdosServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnDdosSpecInfoResponse> describeDcdnDdosSpecInfo(DescribeDcdnDdosSpecInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDdosSpecInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDdosSpecInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDdosSpecInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDeletedDomainsResponse> describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDeletedDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDeletedDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDeletedDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >You can call this operation up to three times per second.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDeliverListResponse> describeDcdnDeliverList(DescribeDcdnDeliverListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDeliverList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDeliverListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDeliverListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainBpsDataResponse> describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set **StartTime** or **EndTime**, the request returns the data collected in the last 24 hours. If you set both **StartTime** and **EndTime**, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainBpsDataByLayerResponse> describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainBpsDataByLayer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainBpsDataByLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainBpsDataByLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainByCertificateResponse> describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainByCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainByCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainByCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.
      * *   You can query data collected over the last 30 days.
      * *   You can call the RefreshObjectCaches operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainCcActivityLogResponse> describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainCcActivityLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainCcActivityLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainCcActivityLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainCertificateInfoResponse> describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainCertificateInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainCertificateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainCertificateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainCnameResponse> describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainCname").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainCnameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainCnameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   You can query the configurations of one or more features in a request.
      * > *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainConfigsResponse> describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainDetailResponse> describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainHitRateDataResponse> describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainHitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainHttpCodeDataResponse> describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 20 times per second per account.
      * * You cannot query the distribution of HTTP status codes by IP protocol.
      * * If you do not specify the **StartTime** or **EndTime** parameter, the data that is collected within the last 24 hours is collected. If you specify both the **StartTime** and **EndTime** parameters, the data that is collected within the time range that you specify is collected.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainHttpCodeDataByLayerResponse> describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainHttpCodeDataByLayer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainHttpCodeDataByLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainHttpCodeDataByLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   The bandwidth is measured in bit/s.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainIpaBpsDataResponse> describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainIpaBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainIpaBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainIpaBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 10 times per second per user.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainIpaConnDataResponse> describeDcdnDomainIpaConnData(DescribeDcdnDomainIpaConnDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainIpaConnData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainIpaConnDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainIpaConnDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   Unit: bytes.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainIpaTrafficDataResponse> describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainIpaTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainIpaTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainIpaTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   If **StartTime** is set but **EndTime** is not set, the data within the hour that starts from **StartTime** is queried.
      * *   If **EndTime** is set but **StartTime** is not set, the data within the last hour that precedes **EndTime** is queried.
      * *   You can query data of a domain name or all domain names that belong to your account.
      * *   You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by **StartTime** and **EndTime**.
      *     *   **If the time range is shorter than or equal to one hour**, data is queried every minute.
      *     *   **If the time range is longer than 1 hour but shorter than or equal to three days**, data is queried every five minutes.
      *     *   **If the time range is longer than three days but shorter than or equal to seven days**, data is queried every hour.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainIspDataResponse> describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainIspData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainIspDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainIspDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.********
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainLogResponse> describeDcdnDomainLog(DescribeDcdnDomainLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnDomainLogExTtlResponse> describeDcdnDomainLogExTtl(DescribeDcdnDomainLogExTtlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainLogExTtl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainLogExTtlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainLogExTtlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.
      * *   You can specify one or more accelerated domain names. Separate domain names with commas (,).
      * *   You can query data within the last 90 days.
      * *   The time range cannot exceed 1 hour.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainMultiUsageDataResponse> describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainMultiUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainMultiUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainMultiUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainOriginBpsDataResponse> describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainOriginBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainOriginBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainOriginBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * - You can call this operation up to 100 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameters, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainOriginTrafficDataResponse> describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainOriginTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainOriginTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainOriginTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainPropertyResponse> describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnDomainPvDataResponse> describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainPvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainPvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainPvDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainQpsDataResponse> describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainQpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainQpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainQpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainQpsDataByLayerResponse> describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainQpsDataByLayer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainQpsDataByLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainQpsDataByLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify **StartTime** or **EndTime**, the request returns the data collected in the last hour by default. If you specify both parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|3 to 4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeBpsDataResponse> describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeBpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * |----|------|-----|--------|
      * | 1 minute | 1 hour | 7 days | 5 minutes |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeByteHitRateDataResponse> describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeByteHitRateData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeByteHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeByteHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeDetailDataResponse> describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeDetailData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeDetailDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeDetailDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeHttpCodeDataResponse> describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeQpsDataResponse> describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeQpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeQpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeQpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per user.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeReqHitRateDataResponse> describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeReqHitRateData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeReqHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeReqHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay | 
      * |-----|-----|-----|--------| 
      * | 1 minute | 1 hour | 7 days | 5 minutes | 
      * | 5 minutes | 3 days | 93 days | 15 minutes | | 1 hour | 31 days | 186 days | 4 hours |
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeSrcBpsDataResponse> describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeSrcBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeSrcBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeSrcBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse> describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeSrcHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeSrcTrafficDataResponse> describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeSrcTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeSrcTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeSrcTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 50 times per second per user.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRealTimeTrafficDataResponse> describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRealTimeTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRealTimeTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRealTimeTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainRegionDataResponse> describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainRegionData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainRegionDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainRegionDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainStagingConfigResponse> describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not set the StartTime parameter, the data on the previous day is queried.
      * *   You can specify only one domain name.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainTopReferVisitResponse> describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainTopReferVisit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainTopReferVisitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainTopReferVisitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can query data in the last seven days.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainTopUrlVisitResponse> describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainTopUrlVisit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainTopUrlVisitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainTopUrlVisitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainTrafficDataResponse> describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 10 times per second per account.
      * * Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainUsageDataResponse> describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainUvDataResponse> describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainUvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainUvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainUvDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainWebsocketBpsDataResponse> describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainWebsocketBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainWebsocketBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainWebsocketBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainWebsocketHttpCodeDataResponse> describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainWebsocketHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainWebsocketHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainWebsocketHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnDomainWebsocketTrafficDataResponse> describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainWebsocketTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainWebsocketTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainWebsocketTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnDomainsBySourceResponse> describeDcdnDomainsBySource(DescribeDcdnDomainsBySourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnDomainsBySource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnDomainsBySourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnDomainsBySourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnErUsageDataResponse> describeDcdnErUsageData(DescribeDcdnErUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnErUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnErUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnErUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   If you specify IP addresses or CIDR blocks, IP addresses that are effective and the corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.
      * > *   The results are written to OSS and returned as OSS URLs. The content in OSS objects is in the format of `IP address-Corresponding expiration time`. The expiration time is in the YYYY-MM-DD hh:mm:ss format.
      * > *   You can share OSS URLs with others. The shared URLs are valid for three days.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnFullDomainsBlockIPConfigResponse> describeDcdnFullDomainsBlockIPConfig(DescribeDcdnFullDomainsBlockIPConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnFullDomainsBlockIPConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnFullDomainsBlockIPConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnFullDomainsBlockIPConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.
      * *   If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.
      * *   The maximum time range to query is 90 days.
      * *   If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnFullDomainsBlockIPHistoryResponse> describeDcdnFullDomainsBlockIPHistory(DescribeDcdnFullDomainsBlockIPHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnFullDomainsBlockIPHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnFullDomainsBlockIPHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnFullDomainsBlockIPHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnHttpsDomainListResponse> describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnHttpsDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnHttpsDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnHttpsDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpInfoResponse> describeDcdnIpInfo(DescribeDcdnIpInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation can be called globally up to 50 times per second. This operation can be called up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpaDomainCidrResponse> describeDcdnIpaDomainCidr(DescribeDcdnIpaDomainCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpaDomainCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpaDomainCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpaDomainCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpaDomainConfigsResponse> describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpaDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpaDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpaDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpaDomainDetailResponse> describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpaDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpaDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpaDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpaServiceResponse> describeDcdnIpaService(DescribeDcdnIpaServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpaService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpaServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpaServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnIpaUserDomainsResponse> describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnIpaUserDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnIpaUserDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnIpaUserDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnKvAccountResponse> describeDcdnKvAccount(DescribeDcdnKvAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnKvAccount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnKvAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnKvAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnKvAccountStatusResponse> describeDcdnKvAccountStatus(DescribeDcdnKvAccountStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnKvAccountStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnKvAccountStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnKvAccountStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnKvNamespaceResponse> describeDcdnKvNamespace(DescribeDcdnKvNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnKvNamespace").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnKvNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnKvNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   To use this operation, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex).
      * > *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnL2IpsResponse> describeDcdnL2Ips(DescribeDcdnL2IpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnL2Ips").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnL2IpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnL2IpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnL2VipsResponse> describeDcdnL2Vips(DescribeDcdnL2VipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnL2Vips").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnL2VipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnL2VipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnOriginSiteHealthStatusResponse> describeDcdnOriginSiteHealthStatus(DescribeDcdnOriginSiteHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnOriginSiteHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnOriginSiteHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnOriginSiteHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this API operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnRealTimeDeliveryFieldResponse> describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnRealTimeDeliveryField").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnRealTimeDeliveryFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnRealTimeDeliveryFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   You can call the **RefreshDcdnObjectCaches** operation to refresh content and call the **PreloadDcdnObjectCaches** operation to prefetch content.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnRefreshQuotaResponse> describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnRefreshQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnRefreshQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnRefreshQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   You can query data within the last three days.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnRefreshTaskByIdResponse> describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnRefreshTaskById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnRefreshTaskByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnRefreshTaskByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can query the refresh or prefetch tasks by ID or URL.
      * *   You can set both **TaskId** and **ObjectPath** in a request. If you do not set **TaskId** or **ObjectPath**, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.
      * *   If you specify **DomainName** or **Status**, you must also specify **ObjectType**.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnRefreshTasksResponse> describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnRefreshTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnRefreshTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnRefreshTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnRegionAndIspResponse> describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnRegionAndIsp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnRegionAndIspResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnRegionAndIspResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnReportResponse> describeDcdnReport(DescribeDcdnReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > * This operation queries the metadata of all operations reports. The statistics in the reports are not returned.
      * > * You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnReportListResponse> describeDcdnReportList(DescribeDcdnReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnSLSRealTimeLogTypeResponse> describeDcdnSLSRealTimeLogType(DescribeDcdnSLSRealTimeLogTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSLSRealTimeLogType").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSLSRealTimeLogTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSLSRealTimeLogTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSLSRealtimeLogDeliveryResponse> describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSLSRealtimeLogDelivery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSLSRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSLSRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSMCertificateDetailResponse> describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSMCertificateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSMCertificateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSMCertificateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSMCertificateListResponse> describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSMCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSMCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSMCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnSSLCertificateListResponse> describeDcdnSSLCertificateList(DescribeDcdnSSLCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSSLCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSSLCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSSLCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSecFuncInfoResponse> describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSecFuncInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSecFuncInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSecFuncInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSecSpecInfoResponse> describeDcdnSecSpecInfo(DescribeDcdnSecSpecInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSecSpecInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSecSpecInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSecSpecInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnServiceResponse> describeDcdnService(DescribeDcdnServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnStagingIpResponse> describeDcdnStagingIp(DescribeDcdnStagingIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnStagingIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnStagingIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnStagingIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.
      * > *   You can call this API operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnSubListResponse> describeDcdnSubList(DescribeDcdnSubListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnSubList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnSubListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnSubListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnTagResourcesResponse> describeDcdnTagResources(DescribeDcdnTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you do not specify the StartTime and EndTime parameters, the data within the current month is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnTopDomainsByFlowResponse> describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnTopDomainsByFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnTopDomainsByFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnTopDomainsByFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserBillHistoryResponse> describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserBillHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserBillHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserBillHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnUserBillTypeResponse> describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserBillType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserBillTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserBillTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserCertificateExpireCountResponse> describeDcdnUserCertificateExpireCount(DescribeDcdnUserCertificateExpireCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserCertificateExpireCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserCertificateExpireCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserCertificateExpireCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserConfigsResponse> describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 80 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserDomainsResponse> describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserDomainsByFuncResponse> describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserDomainsByFunc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserDomainsByFuncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserDomainsByFuncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The maximum number of times that each user can call this operation per second is 30.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserQuotaResponse> describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserRealTimeDeliveryFieldResponse> describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserRealTimeDeliveryField").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserRealTimeDeliveryFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserRealTimeDeliveryFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The maximum number of times that each user can call this operation per second is 30.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserResourcePackageResponse> describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserResourcePackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserResourcePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserResourcePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserSecDropResponse> describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserSecDrop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserSecDropResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserSecDropResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserSecDropByMinuteResponse> describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserSecDropByMinute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserSecDropByMinuteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserSecDropByMinuteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserTagsResponse> describeDcdnUserTags(DescribeDcdnUserTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnUserVipsByDomainResponse> describeDcdnUserVipsByDomain(DescribeDcdnUserVipsByDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnUserVipsByDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnUserVipsByDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnUserVipsByDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnVerifyContentResponse> describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnVerifyContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnVerifyContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnVerifyContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnWafBotAppKeyResponse> describeDcdnWafBotAppKey(DescribeDcdnWafBotAppKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafBotAppKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafBotAppKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafBotAppKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnWafDefaultRulesResponse> describeDcdnWafDefaultRules(DescribeDcdnWafDefaultRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafDefaultRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafDefaultRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafDefaultRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafDomainResponse> describeDcdnWafDomain(DescribeDcdnWafDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafDomainDetailResponse> describeDcdnWafDomainDetail(DescribeDcdnWafDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafDomainsResponse> describeDcdnWafDomains(DescribeDcdnWafDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafFilterInfoResponse> describeDcdnWafFilterInfo(DescribeDcdnWafFilterInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafFilterInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafFilterInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafFilterInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafGeoInfoResponse> describeDcdnWafGeoInfo(DescribeDcdnWafGeoInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafGeoInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafGeoInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafGeoInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnWafGroupResponse> describeDcdnWafGroup(DescribeDcdnWafGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDcdnWafGroupsResponse> describeDcdnWafGroups(DescribeDcdnWafGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   The log data is collected every hour.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafLogsResponse> describeDcdnWafLogs(DescribeDcdnWafLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafPoliciesResponse> describeDcdnWafPolicies(DescribeDcdnWafPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafPolicyResponse> describeDcdnWafPolicy(DescribeDcdnWafPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafPolicyDomainsResponse> describeDcdnWafPolicyDomains(DescribeDcdnWafPolicyDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafPolicyDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafPolicyDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafPolicyDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafPolicyValidDomainsResponse> describeDcdnWafPolicyValidDomains(DescribeDcdnWafPolicyValidDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafPolicyValidDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafPolicyValidDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafPolicyValidDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafRuleResponse> describeDcdnWafRule(DescribeDcdnWafRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafRulesResponse> describeDcdnWafRules(DescribeDcdnWafRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per user.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafScenesResponse> describeDcdnWafScenes(DescribeDcdnWafScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafScenes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafServiceResponse> describeDcdnWafService(DescribeDcdnWafServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafSpecInfoResponse> describeDcdnWafSpecInfo(DescribeDcdnWafSpecInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafSpecInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafSpecInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafSpecInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnWafUsageDataResponse> describeDcdnWafUsageData(DescribeDcdnWafUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnWafUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnWafUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnWafUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeDcdnsecServiceResponse> describeDcdnsecService(DescribeDcdnsecServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDcdnsecService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDcdnsecServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDcdnsecServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDdosAllEventListResponse> describeDdosAllEventList(DescribeDdosAllEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDdosAllEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDdosAllEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDdosAllEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEncryptRoutineUidResponse> describeEncryptRoutineUid(DescribeEncryptRoutineUidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEncryptRoutineUid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEncryptRoutineUidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEncryptRoutineUidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHighlightInfoResponse> describeHighlightInfo(DescribeHighlightInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHighlightInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHighlightInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHighlightInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **Note*** You can call this operation up to 5 times per second per account.
      * * The usage data indicates the number of requests.
      * **Time granularity:** This operation supports only the time granularity of 1 hour.
      * |Time granularity|Time range to query|Historical data available|Data latency|
      * |---|---|---|---|
      * |1 hour|31 days|90 days|3 to 4 hours|
      *
     */
    @Override
    public CompletableFuture<DescribeKvUsageDataResponse> describeKvUsageData(DescribeKvUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKvUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKvUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKvUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRDDomainConfigResponse> describeRDDomainConfig(DescribeRDDomainConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRDDomainConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRDDomainConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRDDomainConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * A domain name can be in one of the following states:
      * *   online
      * *   offline
      * *   configuring
      * *   configure_failed
      * *   checking
      * *   check_failed
      *
     */
    @Override
    public CompletableFuture<DescribeRDDomainsResponse> describeRDDomains(DescribeRDDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRDDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRDDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRDDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeRoutineResponse> describeRoutine(DescribeRoutineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeRoutineCanaryEnvsResponse> describeRoutineCanaryEnvs(DescribeRoutineCanaryEnvsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutineCanaryEnvs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineCanaryEnvsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineCanaryEnvsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeRoutineCodeRevisionResponse> describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutineCodeRevision").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineCodeRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineCodeRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRoutineRelatedDomainsResponse> describeRoutineRelatedDomains(DescribeRoutineRelatedDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutineRelatedDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineRelatedDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineRelatedDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeRoutineSpecResponse> describeRoutineSpec(DescribeRoutineSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutineSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeRoutineUserInfoResponse> describeRoutineUserInfo(DescribeRoutineUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRoutineUserInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRoutineUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRoutineUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
     */
    @Override
    public CompletableFuture<DescribeUserDcdnIpaStatusResponse> describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserDcdnIpaStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserDcdnIpaStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserDcdnIpaStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeUserDcdnStatusResponse> describeUserDcdnStatus(DescribeUserDcdnStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserDcdnStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserDcdnStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserDcdnStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeUserErStatusResponse> describeUserErStatus(DescribeUserErStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserErStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserErStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserErStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<DescribeUserLogserviceStatusResponse> describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserLogserviceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserLogserviceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserLogserviceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   This operation modifies only the specified configurations. Other configurations remain unchanged.
      * *   If you want to delete a setting, delete the parameter value.
      * *   This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.
      * *   Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:
      *     *   Outside China: presetCanaryOverseas.
      *     *   In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<EditRoutineConfResponse> editRoutineConf(EditRoutineConfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditRoutineConf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditRoutineConfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditRoutineConfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDcdnKvResponse> getDcdnKv(GetDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDcdnKv").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDcdnKvStatusResponse> getDcdnKvStatus(GetDcdnKvStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDcdnKvStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDcdnKvStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDcdnKvStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDcdnKvResponse> listDcdnKv(ListDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDcdnKv").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<ListDcdnRealTimeDeliveryProjectResponse> listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDcdnRealTimeDeliveryProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDcdnRealTimeDeliveryProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDcdnRealTimeDeliveryProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<ModifyDCdnDomainSchdmByPropertyResponse> modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDCdnDomainSchdmByProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDCdnDomainSchdmByPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDCdnDomainSchdmByPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDcdnWafGroupResponse> modifyDcdnWafGroup(ModifyDcdnWafGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDcdnWafGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDcdnWafGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDcdnWafGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<ModifyDcdnWafPolicyResponse> modifyDcdnWafPolicy(ModifyDcdnWafPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDcdnWafPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDcdnWafPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDcdnWafPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
     */
    @Override
    public CompletableFuture<ModifyDcdnWafPolicyDomainsResponse> modifyDcdnWafPolicyDomains(ModifyDcdnWafPolicyDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDcdnWafPolicyDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDcdnWafPolicyDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDcdnWafPolicyDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      * *   You must configure at least one of the **RuleStatus**, **RuleName** and **RuleConfig** parameters.
      *
     */
    @Override
    public CompletableFuture<ModifyDcdnWafRuleResponse> modifyDcdnWafRule(ModifyDcdnWafRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDcdnWafRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDcdnWafRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDcdnWafRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.
      * *   You can call this operation up to five times per second per user.
      *
     */
    @Override
    public CompletableFuture<OpenDcdnServiceResponse> openDcdnService(OpenDcdnServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenDcdnService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenDcdnServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenDcdnServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * *   By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.
      * *   You can specify up to 100 URLs to prefetch.
      * *   The prefetch queue of each Alibaba Cloud account can contain up to 100,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.
      * *   You can call this operation up to 15 times per second per account.
      * ## Description
      * *   After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.
      * *   To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
     */
    @Override
    public CompletableFuture<PreloadDcdnObjectCachesResponse> preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreloadDcdnObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreloadDcdnObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreloadDcdnObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<PublishDcdnStagingConfigToProductionResponse> publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishDcdnStagingConfigToProduction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishDcdnStagingConfigToProductionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishDcdnStagingConfigToProductionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<PublishRoutineCodeRevisionResponse> publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishRoutineCodeRevision").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRoutineCodeRevisionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRoutineCodeRevisionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutDcdnKvResponse> putDcdnKv(PutDcdnKvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDcdnKv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDcdnKvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDcdnKvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutDcdnKvNamespaceResponse> putDcdnKvNamespace(PutDcdnKvNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDcdnKvNamespace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDcdnKvNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDcdnKvNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutDcdnKvWithHighCapacityResponse> putDcdnKvWithHighCapacity(PutDcdnKvWithHighCapacityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDcdnKvWithHighCapacity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDcdnKvWithHighCapacityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDcdnKvWithHighCapacityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RefreshDcdnObjectCacheByCacheTagResponse> refreshDcdnObjectCacheByCacheTag(RefreshDcdnObjectCacheByCacheTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshDcdnObjectCacheByCacheTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshDcdnObjectCacheByCacheTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshDcdnObjectCacheByCacheTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to purge content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   By default, each Alibaba Cloud account can purge content from a maximum of 10,000 URLs and 100 directories including subdirectories per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 200 Mbit/s, [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to request a quota increase. Alibaba Cloud determines whether to approve your application based on your workloads.
      * *   You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.
      * *   You can specify up to 1,000 URLs that you want to purge per minute for each domain name.
      * *   You can call this operation up to 30 times per second per account.
      * #### [](#)Precautions
      * *   After a purge task is completed, your resources that are cached on points of presence (POPs) are removed. When a POP receives a request for your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on POPs. If you frequently run purge tasks, more requests are redirected to the origin server for resources. This results in high bandwidth costs and more loads on the origin server.
      * *   A purge task takes effect 5 to 6 minutes after being submitted. If the resource you want to purge has a TTL of less than 5 minutes, you wait for it to expire instead of manually running a purge task.
      * *   To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
     */
    @Override
    public CompletableFuture<RefreshDcdnObjectCachesResponse> refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshDcdnObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshDcdnObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshDcdnObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * > *   Related operation: [RefreshDcdnObjectCaches](~~130620~~).
      * > *   By default, each Alibaba Cloud account can purge content from a maxim> um of 10,000 URLs and 100 directories including subdirectories per day.
      * > *   You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.
      * > *   You can specify up to 1,000 URLs that you want to purge per minute for each domain name.
      * > *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<RefreshErObjectCachesResponse> refreshErObjectCaches(RefreshErObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshErObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshErObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshErObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<RollbackDcdnStagingConfigResponse> rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackDcdnStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackDcdnStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackDcdnStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetDcdnDomainCSRCertificateResponse> setDcdnDomainCSRCertificate(SetDcdnDomainCSRCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnDomainCSRCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnDomainCSRCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnDomainCSRCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<SetDcdnDomainCertificateResponse> setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<SetDcdnDomainSMCertificateResponse> setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnDomainSMCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnDomainSMCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnDomainSMCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetDcdnDomainSSLCertificateResponse> setDcdnDomainSSLCertificate(SetDcdnDomainSSLCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnDomainSSLCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnDomainSSLCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnDomainSSLCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<SetDcdnDomainStagingConfigResponse> setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation to block or unblock a large number of IP addresses or CIDR blocks. You can block or unblock up to 1,000 IP addresses or CIDR blocks in a request.
      *
     */
    @Override
    public CompletableFuture<SetDcdnFullDomainsBlockIPResponse> setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnFullDomainsBlockIP").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnFullDomainsBlockIPResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnFullDomainsBlockIPResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<SetDcdnUserConfigResponse> setDcdnUserConfig(SetDcdnUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDcdnUserConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDcdnUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDcdnUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<SetRoutineSubdomainResponse> setRoutineSubdomain(SetRoutineSubdomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetRoutineSubdomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRoutineSubdomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRoutineSubdomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<StartDcdnDomainResponse> startDcdnDomain(StartDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<StartDcdnIpaDomainResponse> startDcdnIpaDomain(StartDcdnIpaDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDcdnIpaDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDcdnIpaDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDcdnIpaDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   After an accelerated domain is disabled, Dynamic Content Delivery Network (DCDN) retains its information and routes all the requests that are destined for the accelerated domain to the origin server.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<StopDcdnDomainResponse> stopDcdnDomain(StopDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<StopDcdnIpaDomainResponse> stopDcdnIpaDomain(StopDcdnIpaDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDcdnIpaDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDcdnIpaDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDcdnIpaDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<TagDcdnResourcesResponse> tagDcdnResources(TagDcdnResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagDcdnResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagDcdnResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagDcdnResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UntagDcdnResourcesResponse> untagDcdnResources(UntagDcdnResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagDcdnResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagDcdnResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagDcdnResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnDeliverTaskResponse> updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnDeliverTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnDeliverTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnDeliverTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnDomainResponse> updateDcdnDomain(UpdateDcdnDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can call this operation up to 20 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnIpaDomainResponse> updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnIpaDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnIpaDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnIpaDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnSLSRealtimeLogDeliveryResponse> updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnSLSRealtimeLogDelivery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnSLSRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnSLSRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnSubTaskResponse> updateDcdnSubTask(UpdateDcdnSubTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnSubTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnSubTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnSubTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UpdateDcdnUserRealTimeDeliveryFieldResponse> updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDcdnUserRealTimeDeliveryField").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDcdnUserRealTimeDeliveryFieldResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDcdnUserRealTimeDeliveryFieldResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Each time you submit code, a version of the code is generated. You can manage and publish code by version.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UploadRoutineCodeResponse> uploadRoutineCode(UploadRoutineCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadRoutineCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadRoutineCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadRoutineCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.
      * *   The code is automatically published to a staging environment.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<UploadStagingRoutineCodeResponse> uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadStagingRoutineCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadStagingRoutineCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadStagingRoutineCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    @Override
    public CompletableFuture<VerifyDcdnDomainOwnerResponse> verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyDcdnDomainOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyDcdnDomainOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyDcdnDomainOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
