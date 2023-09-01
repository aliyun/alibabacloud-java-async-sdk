// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eais20190624.models.*;
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
        this.product = "eais";
        this.version = "2019-06-24";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "eais.aliyuncs.com"),
            new TeaPair("ap-south-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "eais.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-edge-1", "eais.aliyuncs.com"),
            new TeaPair("cn-fujian", "eais.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "eais.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong", "eais.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "eais.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao", "eais.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "eais.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-wuhan", "eais.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "eais.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "eais.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "eais.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "eais.aliyuncs.com"),
            new TeaPair("eu-central-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1", "eais.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "eais.aliyuncs.com"),
            new TeaPair("me-east-1", "eais.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "eais.aliyuncs.com"),
            new TeaPair("us-east-1", "eais.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AttachEaiResponse> attachEai(AttachEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AttachEaisEiResponse> attachEaisEi(AttachEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiResponse> createEai(CreateEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateEaiAllResponse> createEaiAll(CreateEaiAllRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaiAll").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiAllResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiAllResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiEciResponse> createEaiEci(CreateEaiEciRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaiEci").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiEciResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiEciResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiEcsResponse> createEaiEcs(CreateEaiEcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaiEcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiEcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiEcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaiJupyterResponse> createEaiJupyter(CreateEaiJupyterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaiJupyter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaiJupyterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaiJupyterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEaisEiResponse> createEaisEi(CreateEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEaiResponse> deleteEai(DeleteEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEaiAllResponse> deleteEaiAll(DeleteEaiAllRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEaiAll").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEaiAllResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEaiAllResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEaisEiResponse> deleteEaisEi(DeleteEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEaisResponse> describeEais(DescribeEaisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEais").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEaisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEaisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachEaiResponse> detachEai(DetachEaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachEai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachEaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachEaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachEaisEiResponse> detachEaisEi(DetachEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetInstanceMetricsResponse> getInstanceMetrics(GetInstanceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartEaisEiResponse> startEaisEi(StartEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopEaisEiResponse> stopEaisEi(StopEaisEiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopEaisEi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopEaisEiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopEaisEiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
