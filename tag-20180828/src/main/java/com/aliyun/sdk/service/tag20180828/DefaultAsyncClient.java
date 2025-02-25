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
            new TeaPair("us-west-1", "tag.us-east-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tag.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "tag.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-edge-1", "tag.aliyuncs.com"),
            new TeaPair("cn-fujian", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "tag.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "tag.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "tag.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "tag.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "tag.aliyuncs.com"),
            new TeaPair("cn-wuhan", "tag.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "tag.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "tag.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "tag.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "tag.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "tag.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "tag.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to attach a tag policy to the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to attach a tag policy to the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to attach the tag policy with an ID of <code>p-de62a0bf400e4b69****</code> to the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of AttachPolicy  AttachPolicyRequest
     * @return AttachPolicyResponse
     */
    @Override
    public CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckCreatedByEnabled  CheckCreatedByEnabledRequest
     * @return CheckCreatedByEnabledResponse
     */
    @Override
    public CompletableFuture<CheckCreatedByEnabledResponse> checkCreatedByEnabled(CheckCreatedByEnabledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCreatedByEnabled").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCreatedByEnabledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCreatedByEnabledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseCreatedBy  CloseCreatedByRequest
     * @return CloseCreatedByResponse
     */
    @Override
    public CompletableFuture<CloseCreatedByResponse> closeCreatedBy(CloseCreatedByRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseCreatedBy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseCreatedByResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseCreatedByResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAssociatedResourceRules  CreateAssociatedResourceRulesRequest
     * @return CreateAssociatedResourceRulesResponse
     */
    @Override
    public CompletableFuture<CreateAssociatedResourceRulesResponse> createAssociatedResourceRules(CreateAssociatedResourceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAssociatedResourceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAssociatedResourceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAssociatedResourceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to call the API operation to create a tag policy named <code>test</code>. In this example, the Tag Policy feature in multi-account mode is used. The tag policy defines that resources to which the <code>CostCenter:Beijing</code> or <code>CostCenter:Shanghai</code> tag is added are compliant and other resources are not compliant.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    @Override
    public CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>A preset tag is a tag that you create in advance and is available for the resources in all regions. You can create preset tags in the stage of tag planning and add them to specific resources in the stage of tag implementation. When you create a preset tag, you can specify only the tag key. You can specify a tag value in the future.
     * This topic provides an example on how to call the API operation to create a preset tag whose tag key is <code>Environment</code> to indicate the business environment.</p>
     * 
     * @param request the request parameters of CreateTags  CreateTagsRequest
     * @return CreateTagsResponse
     */
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

    /**
     * @param request the request parameters of DeleteAssociatedResourceRule  DeleteAssociatedResourceRuleRequest
     * @return DeleteAssociatedResourceRuleResponse
     */
    @Override
    public CompletableFuture<DeleteAssociatedResourceRuleResponse> deleteAssociatedResourceRule(DeleteAssociatedResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAssociatedResourceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAssociatedResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAssociatedResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a tag policy, make sure that the tag policy is detached from all objects to which the tag policy is attached. For more information about how to detach a tag policy, see <a href="https://help.aliyun.com/document_detail/429724.html">DetachPolicy</a>.
     * This topic provides an example on how to call the API operation to delete the tag policy with an ID of <code>p-557cb141331f41c7****</code>.</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    @Override
    public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to delete the preset tag whose tag key is <code>Environment</code> and tag value is <code>test</code>.</p>
     * 
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
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

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
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

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to detach a tag policy from the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to detach a tag policy from the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to detach the tag policy with an ID of <code>p-a3381efe2fe34a75****</code> from the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of DetachPolicy  DetachPolicyRequest
     * @return DetachPolicyResponse
     */
    @Override
    public CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisablePolicyType  DisablePolicyTypeRequest
     * @return DisablePolicyTypeResponse
     */
    @Override
    public CompletableFuture<DisablePolicyTypeResponse> disablePolicyType(DisablePolicyTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisablePolicyType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisablePolicyTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisablePolicyTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnablePolicyType  EnablePolicyTypeRequest
     * @return EnablePolicyTypeResponse
     */
    @Override
    public CompletableFuture<EnablePolicyTypeResponse> enablePolicyType(EnablePolicyTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnablePolicyType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnablePolicyTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnablePolicyTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to generate a resource non-compliance report for the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to generate a resource non-compliance report for the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call this API operation to generate a resource non-compliance report for the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of GenerateConfigRuleReport  GenerateConfigRuleReportRequest
     * @return GenerateConfigRuleReportResponse
     */
    @Override
    public CompletableFuture<GenerateConfigRuleReportResponse> generateConfigRuleReport(GenerateConfigRuleReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateConfigRuleReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateConfigRuleReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateConfigRuleReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the basic information of the resource non-compliance report that is last generated for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the basic information of the resource non-compliance report that is last generated for an object in the resource directory. The object can be the Root folder, a folder other than the Root folder, or a member. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call this API operation to query the basic information of the resource non-compliance report that is last generated for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that the ID of the report is <code>crp-ao0786618088006c****</code>.</p>
     * 
     * @param request the request parameters of GetConfigRuleReport  GetConfigRuleReportRequest
     * @return GetConfigRuleReportResponse
     */
    @Override
    public CompletableFuture<GetConfigRuleReportResponse> getConfigRuleReport(GetConfigRuleReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigRuleReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigRuleReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigRuleReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the effective tag policy for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the effective tag policy for the Root folder, a folder other than the Root folder, or a member in the resource directory. You can also use a member of a resource directory to call this API operation to query the effective tag policy for the member. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * An effective tag policy is obtained based on tag policy inheritance. For more information, see <a href="https://help.aliyun.com/document_detail/417435.html">Inheritance of a tag policy and calculation of an effective tag policy</a>.
     * This topic provides an example on how to call the API operation to query the effective tag policy for the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of GetEffectivePolicy  GetEffectivePolicyRequest
     * @return GetEffectivePolicyResponse
     */
    @Override
    public CompletableFuture<GetEffectivePolicyResponse> getEffectivePolicy(GetEffectivePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEffectivePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEffectivePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEffectivePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the details of the tag policy with an ID of <code>p-557cb141331f41c7****</code>.</p>
     * 
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    @Override
    public CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the status of the Tag Policy feature for the current logon account. The response shows that the Tag Policy feature in multi-account mode is enabled for the current logon account.</p>
     * 
     * @param request the request parameters of GetPolicyEnableStatus  GetPolicyEnableStatusRequest
     * @return GetPolicyEnableStatusResponse
     */
    @Override
    public CompletableFuture<GetPolicyEnableStatusResponse> getPolicyEnableStatus(GetPolicyEnableStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPolicyEnableStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyEnableStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyEnableStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssociatedResourceRules  ListAssociatedResourceRulesRequest
     * @return ListAssociatedResourceRulesResponse
     */
    @Override
    public CompletableFuture<ListAssociatedResourceRulesResponse> listAssociatedResourceRules(ListAssociatedResourceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssociatedResourceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssociatedResourceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssociatedResourceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the tag detection tasks for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the tag detection tasks for the Root folder, a folder other than the Root folder, or a member in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the tag detection tasks for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that only one tag detection task exists.</p>
     * 
     * @param request the request parameters of ListConfigRulesForTarget  ListConfigRulesForTargetRequest
     * @return ListConfigRulesForTargetResponse
     */
    @Override
    public CompletableFuture<ListConfigRulesForTargetResponse> listConfigRulesForTarget(ListConfigRulesForTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigRulesForTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigRulesForTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigRulesForTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query all tag policies that are created for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query all tag policies that are created for the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query all tag policies that are created for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that two tag policies are created.</p>
     * 
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    @Override
    public CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the tag policies that are attached to the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the tag policies that are attached to the Root folder, a folder other than the Root folder, or a member in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the tag policies that are attached to the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that only one tag policy is attached to the current logon account.</p>
     * 
     * @param request the request parameters of ListPoliciesForTarget  ListPoliciesForTargetRequest
     * @return ListPoliciesForTargetResponse
     */
    @Override
    public CompletableFuture<ListPoliciesForTargetResponse> listPoliciesForTarget(ListPoliciesForTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPoliciesForTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPoliciesForTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPoliciesForTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation in the China (Shenzhen) region to query virtual private clouds (VPCs) to which the tag key <code>k1</code> is added. The response shows that the tag key is added to two VPCs.</p>
     * 
     * @param request the request parameters of ListResourcesByTag  ListResourcesByTagRequest
     * @return ListResourcesByTagResponse
     */
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

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Call example</h3>
     * <ul>
     * <li>Query a list of resource types supported by TagResources or UntagResources. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22,%22SupportCode%22:%22TAG_CONSOLE_SUPPORT%22%7D">Example</a>.</li>
     * <li>Query a list of resource types supported by ListTagResources or ListResourcesByTag. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22%7D">Example</a>.</li>
     * <li>Query a list of resource types that support createdby tags. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22,%22SupportCode%22:%22CREATED_BY_TAG_CONSOLE_SUPPORT%22%7D">Example</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSupportResourceTypes  ListSupportResourceTypesRequest
     * @return ListSupportResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListSupportResourceTypesResponse> listSupportResourceTypes(ListSupportResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSupportResourceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupportResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupportResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tag keys in the <code>cn-hangzhou</code> region. The response shows that the following tag keys exist: <code>team</code>, <code>k1</code>, and <code>k2</code>.</p>
     * 
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
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

    /**
     * <b>description</b> :
     * <p>For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the values of the tag key <code>k1</code> in the <code>cn-hangzhou</code> region. The response shows that the value of the tag key <code>k1</code> is <code>v1</code>.</p>
     * 
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the object to which a tag policy is attached. The object is the current logon account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the objects to which a tag policy is attached. The objects include the Root folder, folders other than the Root folder, and members in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the objects to which the tag policy with an ID of <code>p-de62a0bf400e4b69****</code> is attached. In this example, the Tag Policy feature in multi-account mode is used. The response shows that the tag policy is attached to two members in the related resource directory.</p>
     * 
     * @param request the request parameters of ListTargetsForPolicy  ListTargetsForPolicyRequest
     * @return ListTargetsForPolicyResponse
     */
    @Override
    public CompletableFuture<ListTargetsForPolicyResponse> listTargetsForPolicy(ListTargetsForPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTargetsForPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTargetsForPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTargetsForPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to change the name of a tag policy to <code>test</code>.</p>
     * 
     * @param request the request parameters of ModifyPolicy  ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>createdby tags can help you analyze costs and bills and manage the costs of cloud resources in an efficient manner. You can identify the creators of resources based on the createdby tags added to the resources. createdby tags are system tags that are provided by Alibaba Cloud and automatically added to resources. The key of createdby tags is <code>acs:tag:createdby</code>.</p>
     * 
     * @param request the request parameters of OpenCreatedBy  OpenCreatedByRequest
     * @return OpenCreatedByResponse
     */
    @Override
    public CompletableFuture<OpenCreatedByResponse> openCreatedBy(OpenCreatedByRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenCreatedBy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenCreatedByResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenCreatedByResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Tags are used to identify resources. Tags allow you to categorize, search for, and aggregate resources that have the same characteristics from different dimensions. This facilitates resource management. For more information, see <a href="https://help.aliyun.com/document_detail/156983.html">Tag overview</a>.
     * For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>After you remove a tag, the tag is automatically deleted within 24 hours if it is not added to other resources.
     * For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
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

    /**
     * @param request the request parameters of UpdateAssociatedResourceRule  UpdateAssociatedResourceRuleRequest
     * @return UpdateAssociatedResourceRuleResponse
     */
    @Override
    public CompletableFuture<UpdateAssociatedResourceRuleResponse> updateAssociatedResourceRule(UpdateAssociatedResourceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAssociatedResourceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAssociatedResourceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAssociatedResourceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
