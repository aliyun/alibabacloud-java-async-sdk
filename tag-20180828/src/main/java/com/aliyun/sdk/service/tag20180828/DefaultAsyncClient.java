// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.tag20180828.models.*;
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
        this.product = "Tag";
        this.version = "2018-08-28";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tag.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tag.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tag.aliyuncs.com"),
            new TeaPair("us-west-1", "tag.aliyuncs.com"),
            new TeaPair("us-east-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tag.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-edge-1", "tag.aliyuncs.com"),
            new TeaPair("cn-fujian", "tag.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "tag.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-wuhan", "tag.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "tag.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "tag.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "tag.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "tag.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CreateTagsResponse> createTags(CreateTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTagResponse> future = new CompletableFuture<>();
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
    public CompletableFuture<ListResourcesByTagResponse> listResourcesByTag(ListResourcesByTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourcesByTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesByTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesByTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
