// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.config20200907.models.*;
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
        this.product = "Config";
        this.version = "2020-09-07";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-shanghai", "config.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "config.ap-southeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Enables one or more rules in an account group. After a rule is enabled, the rule continues to automatically evaluate resources based on the trigger mechanism.</p>
     * 
     * @param request the request parameters of ActiveAggregateConfigRules  ActiveAggregateConfigRulesRequest
     * @return ActiveAggregateConfigRulesResponse
     */
    @Override
    public CompletableFuture<ActiveAggregateConfigRulesResponse> activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActiveAggregateConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveAggregateConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveAggregateConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The rule is in the <code>INACTIVE</code> state.</p>
     * 
     * @param request the request parameters of ActiveConfigRules  ActiveConfigRulesRequest
     * @return ActiveConfigRulesResponse
     */
    @Override
    public CompletableFuture<ActiveConfigRulesResponse> activeConfigRules(ActiveConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActiveConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to add the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of AttachAggregateConfigRuleToCompliancePack  AttachAggregateConfigRuleToCompliancePackRequest
     * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    @Override
    public CompletableFuture<AttachAggregateConfigRuleToCompliancePackResponse> attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachAggregateConfigRuleToCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachAggregateConfigRuleToCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachAggregateConfigRuleToCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the <code>cr-6cc4626622af00e7****</code> rule to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of AttachConfigRuleToCompliancePack  AttachConfigRuleToCompliancePackRequest
     * @return AttachConfigRuleToCompliancePackResponse
     */
    @Override
    public CompletableFuture<AttachConfigRuleToCompliancePackResponse> attachConfigRuleToCompliancePack(AttachConfigRuleToCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachConfigRuleToCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachConfigRuleToCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachConfigRuleToCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyCompliancePacks  CopyCompliancePacksRequest
     * @return CopyCompliancePacksResponse
     */
    @Override
    public CompletableFuture<CopyCompliancePacksResponse> copyCompliancePacks(CopyCompliancePacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyCompliancePacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyCompliancePacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyCompliancePacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyConfigRules  CopyConfigRulesRequest
     * @return CopyConfigRulesResponse
     */
    @Override
    public CompletableFuture<CopyConfigRulesResponse> copyConfigRules(CopyConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAdvancedSearchFile  CreateAdvancedSearchFileRequest
     * @return CreateAdvancedSearchFileResponse
     */
    @Override
    public CompletableFuture<CreateAdvancedSearchFileResponse> createAdvancedSearchFile(CreateAdvancedSearchFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAdvancedSearchFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAdvancedSearchFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAdvancedSearchFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a downloadable resource file for an account group whose ID is <code>ca-edd3626622af00b3****</code>. The resource file includes all the ECS instances in the account group.</p>
     * 
     * @param request the request parameters of CreateAggregateAdvancedSearchFile  CreateAggregateAdvancedSearchFileRequest
     * @return CreateAggregateAdvancedSearchFileResponse
     */
    @Override
    public CompletableFuture<CreateAggregateAdvancedSearchFileResponse> createAggregateAdvancedSearchFile(CreateAggregateAdvancedSearchFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregateAdvancedSearchFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregateAdvancedSearchFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregateAdvancedSearchFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a compliance package for the account group <code>ca-f632626622af0079****</code> by using the compliance package template <code>ClassifiedProtectionPreCheck</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateCompliancePack  CreateAggregateCompliancePackRequest
     * @return CreateAggregateCompliancePackResponse
     */
    @Override
    public CompletableFuture<CreateAggregateCompliancePackResponse> createAggregateCompliancePack(CreateAggregateCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregateCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregateCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregateCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created for an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created. The ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateConfigDeliveryChannel  CreateAggregateConfigDeliveryChannelRequest
     * @return CreateAggregateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<CreateAggregateConfigDeliveryChannelResponse> createAggregateConfigDeliveryChannel(CreateAggregateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can create up to 200 rules for each management account.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to create a rule based on the required-tags managed rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that the rule is created and its ID is <code>cr-4e3d626622af0080****</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateConfigRule  CreateAggregateConfigRuleRequest
     * @return CreateAggregateConfigRuleResponse
     */
    @Override
    public CompletableFuture<CreateAggregateConfigRuleResponse> createAggregateConfigRule(CreateAggregateConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregateConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregateConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregateConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateRemediation  CreateAggregateRemediationRequest
     * @return CreateAggregateRemediationResponse
     */
    @Override
    public CompletableFuture<CreateAggregateRemediationResponse> createAggregateRemediation(CreateAggregateRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregateRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregateRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregateRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
     * Cloud Config supports the following types of account groups:</p>
     * <ul>
     * <li>Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.</li>
     * <li>Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
     * This topic provides an example on how to create an account group of the <code>CUSTOM</code> type. The custom account group is named <code>Test_Group</code>, and its description is <code>Test account group</code>. The custom account group contains the following two member accounts:</li>
     * <li>Member account ID: <code>171322098523****</code>. Member account name: <code>Alice</code>.</li>
     * <li>Member account ID: <code>100532098349****</code>. Member account name: <code>Tom</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAggregator  CreateAggregatorRequest
     * @return CreateAggregatorResponse
     */
    @Override
    public CompletableFuture<CreateAggregatorResponse> createAggregator(CreateAggregatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAggregator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAggregatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAggregatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Each ordinary account can create up to five compliance packages.
     * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named <code>eip-bandwidth-limit</code>.</p>
     * 
     * @param request the request parameters of CreateCompliancePack  CreateCompliancePackRequest
     * @return CreateCompliancePackResponse
     */
    @Override
    public CompletableFuture<CreateCompliancePackResponse> createCompliancePack(CreateCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * @param request the request parameters of CreateConfigDeliveryChannel  CreateConfigDeliveryChannelRequest
     * @return CreateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<CreateConfigDeliveryChannelResponse> createConfigDeliveryChannel(CreateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can use a common account to create up to 200 rules.</p>
     * 
     * @param request the request parameters of CreateConfigRule  CreateConfigRuleRequest
     * @return CreateConfigRuleResponse
     */
    @Override
    public CompletableFuture<CreateConfigRuleResponse> createConfigRule(CreateConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDeliveryChannel is deprecated, please use Config::2020-09-07::CreateConfigDeliveryChannel,Config::2020-09-07::CreateAggregateConfigDeliveryChannel instead.  * @description In this example, a delivery channel is created. The type of the delivery channel is `OSS`, the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`, and the ARN of the role that is assigned to the delivery channel is `acs:ram::100931896542****:role/aliyunserviceroleforconfig`. The returned result shows that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
     * 
     * @param request the request parameters of CreateDeliveryChannel  CreateDeliveryChannelRequest
     * @return CreateDeliveryChannelResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDeliveryChannelResponse> createDeliveryChannel(CreateDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * @param request the request parameters of CreateRemediation  CreateRemediationRequest
     * @return CreateRemediationResponse
     */
    @Override
    public CompletableFuture<CreateRemediationResponse> createRemediation(CreateRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-5772ba41209e007b****</code> rule in the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * @param request the request parameters of DeactiveAggregateConfigRules  DeactiveAggregateConfigRulesRequest
     * @return DeactiveAggregateConfigRulesResponse
     */
    @Override
    public CompletableFuture<DeactiveAggregateConfigRulesResponse> deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactiveAggregateConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactiveAggregateConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactiveAggregateConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-19a56457e0d90058****</code> rule.</p>
     * 
     * @param request the request parameters of DeactiveConfigRules  DeactiveConfigRulesRequest
     * @return DeactiveConfigRulesResponse
     */
    @Override
    public CompletableFuture<DeactiveConfigRulesResponse> deactiveConfigRules(DeactiveConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactiveConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactiveConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactiveConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package from the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * @param request the request parameters of DeleteAggregateCompliancePacks  DeleteAggregateCompliancePacksRequest
     * @return DeleteAggregateCompliancePacksResponse
     */
    @Override
    public CompletableFuture<DeleteAggregateCompliancePacksResponse> deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAggregateCompliancePacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAggregateCompliancePacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAggregateCompliancePacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel from the <code>ca-23c6626622af0041****</code> account group. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * @param request the request parameters of DeleteAggregateConfigDeliveryChannel  DeleteAggregateConfigDeliveryChannelRequest
     * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<DeleteAggregateConfigDeliveryChannelResponse> deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAggregateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAggregateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAggregateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cr-4e3d626622af0080****</code> rule from the <code>ca-a4e5626622af0079****</code> account group.</p>
     * 
     * @param request the request parameters of DeleteAggregateConfigRules  DeleteAggregateConfigRulesRequest
     * @return DeleteAggregateConfigRulesResponse
     */
    @Override
    public CompletableFuture<DeleteAggregateConfigRulesResponse> deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAggregateConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAggregateConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAggregateConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> from the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * @param request the request parameters of DeleteAggregateRemediations  DeleteAggregateRemediationsRequest
     * @return DeleteAggregateRemediationsResponse
     */
    @Override
    public CompletableFuture<DeleteAggregateRemediationsResponse> deleteAggregateRemediations(DeleteAggregateRemediationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAggregateRemediations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAggregateRemediationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAggregateRemediationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>After you delete an account group, the following changes occur to Cloud Config:</p>
     * <ul>
     * <li>The rules and compliance packages of the account group are deleted and cannot be recovered.</li>
     * <li>All compliance results generated in the account group are automatically deleted and cannot be recovered.</li>
     * <li>Service-linked roles for Cloud Config of member accounts in the account group are retained.</li>
     * <li>If the account groups to which a member belongs are all deleted, the member account uses Cloud Config as an independent Alibaba Cloud account.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to delete the account group whose ID is <code>ca-9190626622af00a9****</code>.</p>
     * 
     * @param request the request parameters of DeleteAggregators  DeleteAggregatorsRequest
     * @return DeleteAggregatorsResponse
     */
    @Override
    public CompletableFuture<DeleteAggregatorsResponse> deleteAggregators(DeleteAggregatorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAggregators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAggregatorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAggregatorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package.</p>
     * 
     * @param request the request parameters of DeleteCompliancePacks  DeleteCompliancePacksRequest
     * @return DeleteCompliancePacksResponse
     */
    @Override
    public CompletableFuture<DeleteCompliancePacksResponse> deleteCompliancePacks(DeleteCompliancePacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCompliancePacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCompliancePacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCompliancePacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * @param request the request parameters of DeleteConfigDeliveryChannel  DeleteConfigDeliveryChannelRequest
     * @return DeleteConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<DeleteConfigDeliveryChannelResponse> deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the rule whose ID is cr-9908626622af0035\<em>\</em>\<em>\</em> is deleted.</p>
     * 
     * @param request the request parameters of DeleteConfigRules  DeleteConfigRulesRequest
     * @return DeleteConfigRulesResponse
     */
    @Override
    public CompletableFuture<DeleteConfigRulesResponse> deleteConfigRules(DeleteConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template <code>crr-909ba2d4716700eb****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * @param request the request parameters of DeleteRemediations  DeleteRemediationsRequest
     * @return DeleteRemediationsResponse
     */
    @Override
    public CompletableFuture<DeleteRemediationsResponse> deleteRemediations(DeleteRemediationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRemediations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRemediationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRemediationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRemediation  DescribeRemediationRequest
     * @return DescribeRemediationResponse
     */
    @Override
    public CompletableFuture<DescribeRemediationResponse> describeRemediation(DescribeRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRemediation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>The sample request in this topic shows you how to remove the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of DetachAggregateConfigRuleToCompliancePack  DetachAggregateConfigRuleToCompliancePackRequest
     * @return DetachAggregateConfigRuleToCompliancePackResponse
     */
    @Override
    public CompletableFuture<DetachAggregateConfigRuleToCompliancePackResponse> detachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachAggregateConfigRuleToCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachAggregateConfigRuleToCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachAggregateConfigRuleToCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to remove the <code>cr-6cc4626622af00e7****</code> rule from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of DetachConfigRuleToCompliancePack  DetachConfigRuleToCompliancePackRequest
     * @return DetachConfigRuleToCompliancePackResponse
     */
    @Override
    public CompletableFuture<DetachConfigRuleToCompliancePackResponse> detachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachConfigRuleToCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachConfigRuleToCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachConfigRuleToCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EvaluatePreConfigRules  EvaluatePreConfigRulesRequest
     * @return EvaluatePreConfigRulesResponse
     */
    @Override
    public CompletableFuture<EvaluatePreConfigRulesResponse> evaluatePreConfigRules(EvaluatePreConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EvaluatePreConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvaluatePreConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvaluatePreConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262699.html">GetAggregateCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateAggregateCompliancePackReport  GenerateAggregateCompliancePackReportRequest
     * @return GenerateAggregateCompliancePackReportResponse
     */
    @Override
    public CompletableFuture<GenerateAggregateCompliancePackReportResponse> generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAggregateCompliancePackReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAggregateCompliancePackReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAggregateCompliancePackReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262706.html">GetAggregateConfigRulesReport</a>.
     * The topic provides an example on how to generate a compliance evaluation report based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateAggregateConfigRulesReport  GenerateAggregateConfigRulesReportRequest
     * @return GenerateAggregateConfigRulesReportResponse
     */
    @Override
    public CompletableFuture<GenerateAggregateConfigRulesReportResponse> generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAggregateConfigRulesReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAggregateConfigRulesReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAggregateConfigRulesReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to generate a downloadable inventory for global resources in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of GenerateAggregateResourceInventory  GenerateAggregateResourceInventoryRequest
     * @return GenerateAggregateResourceInventoryResponse
     */
    @Override
    public CompletableFuture<GenerateAggregateResourceInventoryResponse> generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAggregateResourceInventory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAggregateResourceInventoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAggregateResourceInventoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263347.html">GetCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-a8a8626622af0082****</code> compliance package.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateCompliancePackReport  GenerateCompliancePackReportRequest
     * @return GenerateCompliancePackReportResponse
     */
    @Override
    public CompletableFuture<GenerateCompliancePackReportResponse> generateCompliancePackReport(GenerateCompliancePackReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateCompliancePackReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCompliancePackReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCompliancePackReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263608.html">GetConfigRulesReport</a>.
     * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateConfigRulesReport  GenerateConfigRulesReportRequest
     * @return GenerateConfigRulesReportResponse
     */
    @Override
    public CompletableFuture<GenerateConfigRulesReportResponse> generateConfigRulesReport(GenerateConfigRulesReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateConfigRulesReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateConfigRulesReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateConfigRulesReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to generate a resource inventory for global resources of the current account.</p>
     * 
     * @param request the request parameters of GenerateResourceInventory  GenerateResourceInventoryRequest
     * @return GenerateResourceInventoryResponse
     */
    @Override
    public CompletableFuture<GenerateResourceInventoryResponse> generateResourceInventory(GenerateResourceInventoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateResourceInventory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateResourceInventoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateResourceInventoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/2511967.html">CreateAdvancedSearchFile</a> operation to create a resource advanced search file. Then, you can call this operation to obtain the URL of the resource advanced search file.</p>
     * 
     * @param request the request parameters of GetAdvancedSearchFile  GetAdvancedSearchFileRequest
     * @return GetAdvancedSearchFileResponse
     */
    @Override
    public CompletableFuture<GetAdvancedSearchFileResponse> getAdvancedSearchFile(GetAdvancedSearchFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAdvancedSearchFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAdvancedSearchFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAdvancedSearchFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of member accounts for which the <code>cp-541e626622af0087****</code> compliance package takes effect in the <code>ca-04b3fd170e340007****</code> account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetAggregateAccountComplianceByPack  GetAggregateAccountComplianceByPackRequest
     * @return GetAggregateAccountComplianceByPackResponse
     */
    @Override
    public CompletableFuture<GetAggregateAccountComplianceByPackResponse> getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateAccountComplianceByPack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateAccountComplianceByPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateAccountComplianceByPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAggregateAdvancedSearchFile  GetAggregateAdvancedSearchFileRequest
     * @return GetAggregateAdvancedSearchFileResponse
     */
    @Override
    public CompletableFuture<GetAggregateAdvancedSearchFileResponse> getAggregateAdvancedSearchFile(GetAggregateAdvancedSearchFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateAdvancedSearchFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateAdvancedSearchFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateAdvancedSearchFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code> in an account group whose ID is <code>ca-f632626622af0079****</code>.</p>
     * 
     * @param request the request parameters of GetAggregateCompliancePack  GetAggregateCompliancePackRequest
     * @return GetAggregateCompliancePackResponse
     */
    @Override
    public CompletableFuture<GetAggregateCompliancePackResponse> getAggregateCompliancePack(GetAggregateCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateCompliancePack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/262687.html">GenerateAggregateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetAggregateCompliancePackReport  GetAggregateCompliancePackReportRequest
     * @return GetAggregateCompliancePackReportResponse
     */
    @Override
    public CompletableFuture<GetAggregateCompliancePackReportResponse> getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateCompliancePackReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateCompliancePackReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateCompliancePackReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of GetAggregateComplianceSummary  GetAggregateComplianceSummaryRequest
     * @return GetAggregateComplianceSummaryResponse
     */
    @Override
    public CompletableFuture<GetAggregateComplianceSummaryResponse> getAggregateComplianceSummary(GetAggregateComplianceSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateComplianceSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateComplianceSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateComplianceSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAggregateConfigDeliveryChannel  GetAggregateConfigDeliveryChannelRequest
     * @return GetAggregateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<GetAggregateConfigDeliveryChannelResponse> getAggregateConfigDeliveryChannel(GetAggregateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This example shows how to query the details of the <code>cr-7f7d626622af0041****</code> rule in the <code>ca-7f00626622af0041****</code> account group.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRule  GetAggregateConfigRuleRequest
     * @return GetAggregateConfigRuleResponse
     */
    @Override
    public CompletableFuture<GetAggregateConfigRuleResponse> getAggregateConfigRule(GetAggregateConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance evaluation results based on rules in the <code>cp-541e626622af0087****</code> compliance package that is created for the <code>ca-04b3fd170e340007****</code> account group. The return result shows a total of <code>one</code> rule. <code>No resources</code> are evaluated as non-compliant based on the rule.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRuleComplianceByPack  GetAggregateConfigRuleComplianceByPackRequest
     * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    @Override
    public CompletableFuture<GetAggregateConfigRuleComplianceByPackResponse> getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateConfigRuleComplianceByPack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateConfigRuleComplianceByPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateConfigRuleComplianceByPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the <code>ca-3a58626622af0005****</code> account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRuleSummaryByRiskLevel  GetAggregateConfigRuleSummaryByRiskLevelRequest
     * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    @Override
    public CompletableFuture<GetAggregateConfigRuleSummaryByRiskLevelResponse> getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateConfigRuleSummaryByRiskLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateConfigRuleSummaryByRiskLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateConfigRuleSummaryByRiskLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see <a href="https://help.aliyun.com/document_detail/262701.html">GenerateAggregateConfigRulesReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetAggregateConfigRulesReport  GetAggregateConfigRulesReportRequest
     * @return GetAggregateConfigRulesReportResponse
     */
    @Override
    public CompletableFuture<GetAggregateConfigRulesReportResponse> getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateConfigRulesReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateConfigRulesReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateConfigRulesReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region in the account group <code>ca-5885626622af0008****</code>.</p>
     * 
     * @param request the request parameters of GetAggregateDiscoveredResource  GetAggregateDiscoveredResourceRequest
     * @return GetAggregateDiscoveredResourceResponse
     */
    @Override
    public CompletableFuture<GetAggregateDiscoveredResourceResponse> getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateDiscoveredResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateDiscoveredResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateDiscoveredResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results based on the <code>cr-d369626622af008e****</code> rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceByConfigRule  GetAggregateResourceComplianceByConfigRuleRequest
     * @return GetAggregateResourceComplianceByConfigRuleResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceComplianceByConfigRuleResponse> getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceComplianceByConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceComplianceByConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceComplianceByConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code>account group. The returned result shows that the total number of monitored resources is <code>10</code> and the number of non-compliant resources is <code>7</code>.</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceByPack  GetAggregateResourceComplianceByPackRequest
     * @return GetAggregateResourceComplianceByPackResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceComplianceByPackResponse> getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceComplianceByPack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceComplianceByPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceComplianceByPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAggregateResourceComplianceGroupByRegion  GetAggregateResourceComplianceGroupByRegionRequest
     * @return GetAggregateResourceComplianceGroupByRegionResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceComplianceGroupByRegionResponse> getAggregateResourceComplianceGroupByRegion(GetAggregateResourceComplianceGroupByRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceComplianceGroupByRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceComplianceGroupByRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceComplianceGroupByRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAggregateResourceComplianceGroupByResourceType  GetAggregateResourceComplianceGroupByResourceTypeRequest
     * @return GetAggregateResourceComplianceGroupByResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceComplianceGroupByResourceTypeResponse> getAggregateResourceComplianceGroupByResourceType(GetAggregateResourceComplianceGroupByResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceComplianceGroupByResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceComplianceGroupByResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceComplianceGroupByResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceTimeline  GetAggregateResourceComplianceTimelineRequest
     * @return GetAggregateResourceComplianceTimelineResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceComplianceTimelineResponse> getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceComplianceTimeline").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceComplianceTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceComplianceTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetAggregateResourceConfigurationTimeline  GetAggregateResourceConfigurationTimelineRequest
     * @return GetAggregateResourceConfigurationTimelineResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceConfigurationTimelineResponse> getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceConfigurationTimeline").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceConfigurationTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceConfigurationTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group named <code>ca-a260626622af0005****</code> by region. The returned result shows that a total of <code>10</code> resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetAggregateResourceCountsGroupByRegion  GetAggregateResourceCountsGroupByRegionRequest
     * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceCountsGroupByRegionResponse> getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceCountsGroupByRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceCountsGroupByRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceCountsGroupByRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group whose ID is <code>ca-a260626622af0005****</code> by resource type. The returned result shows that the account group has a total of <code>seven</code> resources of the <code>ACS::RAM::Role</code> resource type.</p>
     * 
     * @param request the request parameters of GetAggregateResourceCountsGroupByResourceType  GetAggregateResourceCountsGroupByResourceTypeRequest
     * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceCountsGroupByResourceTypeResponse> getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceCountsGroupByResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceCountsGroupByResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceCountsGroupByResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <a href="https://help.aliyun.com/document_detail/2398353.html">GenerateAggregateResourceInventory</a> operation is called to generate a resource inventory. Then, this operation is called to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of GetAggregateResourceInventory  GetAggregateResourceInventoryRequest
     * @return GetAggregateResourceInventoryResponse
     */
    @Override
    public CompletableFuture<GetAggregateResourceInventoryResponse> getAggregateResourceInventory(GetAggregateResourceInventoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregateResourceInventory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregateResourceInventoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregateResourceInventoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the details of the <code>ca-88ea626622af0055****</code> account group. The return result shows that the account group is named <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type. The account group is in the <code>1</code> state, which indicates that it is created.</p>
     * 
     * @param request the request parameters of GetAggregator  GetAggregatorRequest
     * @return GetAggregatorResponse
     */
    @Override
    public CompletableFuture<GetAggregatorResponse> getAggregator(GetAggregatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAggregator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAggregatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAggregatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code>. The returned result shows that the name of the compliance package is <code>ClassifiedProtectionPreCheck</code>, the compliance package is in the <code>ACTIVE</code> state, and the risk level of the rules in the compliance package is <code>1</code>, which indicates high risk level.</p>
     * 
     * @param request the request parameters of GetCompliancePack  GetCompliancePackRequest
     * @return GetCompliancePackResponse
     */
    @Override
    public CompletableFuture<GetCompliancePackResponse> getCompliancePack(GetCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCompliancePack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/263525.html">GenerateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetCompliancePackReport  GetCompliancePackReportRequest
     * @return GetCompliancePackReportResponse
     */
    @Override
    public CompletableFuture<GetCompliancePackReportResponse> getCompliancePackReport(GetCompliancePackReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCompliancePackReport").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCompliancePackReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCompliancePackReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the current account group.</p>
     * 
     * @param request the request parameters of GetComplianceSummary  GetComplianceSummaryRequest
     * @return GetComplianceSummaryResponse
     */
    @Override
    public CompletableFuture<GetComplianceSummaryResponse> getComplianceSummary(GetComplianceSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComplianceSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComplianceSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComplianceSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConfigDeliveryChannel  GetConfigDeliveryChannelRequest
     * @return GetConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<GetConfigDeliveryChannelResponse> getConfigDeliveryChannel(GetConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of GetConfigRule  GetConfigRuleRequest
     * @return GetConfigRuleResponse
     */
    @Override
    public CompletableFuture<GetConfigRuleResponse> getConfigRule(GetConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cp-541e626622af0087****</code> compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetConfigRuleComplianceByPack  GetConfigRuleComplianceByPackRequest
     * @return GetConfigRuleComplianceByPackResponse
     */
    @Override
    public CompletableFuture<GetConfigRuleComplianceByPackResponse> getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigRuleComplianceByPack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigRuleComplianceByPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigRuleComplianceByPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.</p>
     * 
     * @param request the request parameters of GetConfigRuleSummaryByRiskLevel  GetConfigRuleSummaryByRiskLevelRequest
     * @return GetConfigRuleSummaryByRiskLevelResponse
     */
    @Override
    public CompletableFuture<GetConfigRuleSummaryByRiskLevelResponse> getConfigRuleSummaryByRiskLevel(GetConfigRuleSummaryByRiskLevelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigRuleSummaryByRiskLevel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigRuleSummaryByRiskLevelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigRuleSummaryByRiskLevelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see <a href="https://help.aliyun.com/document_detail/263601.html">GenerateConfigRulesReport</a>.
     * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetConfigRulesReport  GetConfigRulesReportRequest
     * @return GetConfigRulesReportResponse
     */
    @Override
    public CompletableFuture<GetConfigRulesReportResponse> getConfigRulesReport(GetConfigRulesReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigRulesReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigRulesReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigRulesReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * 
     * @param request the request parameters of GetConfigurationRecorder  GetConfigurationRecorderRequest
     * @return GetConfigurationRecorderResponse
     */
    @Override
    public CompletableFuture<GetConfigurationRecorderResponse> getConfigurationRecorder(GetConfigurationRecorderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConfigurationRecorder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigurationRecorderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigurationRecorderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetDiscoveredResource  GetDiscoveredResourceRequest
     * @return GetDiscoveredResourceResponse
     */
    @Override
    public CompletableFuture<GetDiscoveredResourceResponse> getDiscoveredResource(GetDiscoveredResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDiscoveredResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiscoveredResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiscoveredResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to demonstrate how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetDiscoveredResourceCountsGroupByRegion  GetDiscoveredResourceCountsGroupByRegionRequest
     * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    @Override
    public CompletableFuture<GetDiscoveredResourceCountsGroupByRegionResponse> getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDiscoveredResourceCountsGroupByRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiscoveredResourceCountsGroupByRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiscoveredResourceCountsGroupByRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the <code>ACS::ECS::Instance</code> resource type exist.</p>
     * 
     * @param request the request parameters of GetDiscoveredResourceCountsGroupByResourceType  GetDiscoveredResourceCountsGroupByResourceTypeRequest
     * @return GetDiscoveredResourceCountsGroupByResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetDiscoveredResourceCountsGroupByResourceTypeResponse> getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDiscoveredResourceCountsGroupByResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiscoveredResourceCountsGroupByResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiscoveredResourceCountsGroupByResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIntegratedServiceStatus  GetIntegratedServiceStatusRequest
     * @return GetIntegratedServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetIntegratedServiceStatusResponse> getIntegratedServiceStatus(GetIntegratedServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIntegratedServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIntegratedServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIntegratedServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the managed rule <code>cdn-domain-https-enabled</code>.</p>
     * 
     * @param request the request parameters of GetManagedRule  GetManagedRuleRequest
     * @return GetManagedRuleResponse
     */
    @Override
    public CompletableFuture<GetManagedRuleResponse> getManagedRule(GetManagedRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetManagedRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetManagedRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetManagedRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the automatic remediation template ACS-ALB-BulkyEnableDeletionProtection.</p>
     * 
     * @param request the request parameters of GetRemediationTemplate  GetRemediationTemplateRequest
     * @return GetRemediationTemplateResponse
     */
    @Override
    public CompletableFuture<GetRemediationTemplateResponse> getRemediationTemplate(GetRemediationTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRemediationTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRemediationTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRemediationTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cr-d369626622af008e****</code> rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and <code>five</code> of them are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetResourceComplianceByConfigRule  GetResourceComplianceByConfigRuleRequest
     * @return GetResourceComplianceByConfigRuleResponse
     */
    @Override
    public CompletableFuture<GetResourceComplianceByConfigRuleResponse> getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceComplianceByConfigRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceComplianceByConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceComplianceByConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored by using the <code>cp-541e626622af0087****</code> compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.</p>
     * 
     * @param request the request parameters of GetResourceComplianceByPack  GetResourceComplianceByPackRequest
     * @return GetResourceComplianceByPackResponse
     */
    @Override
    public CompletableFuture<GetResourceComplianceByPackResponse> getResourceComplianceByPack(GetResourceComplianceByPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceComplianceByPack").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceComplianceByPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceComplianceByPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceComplianceGroupByRegion  GetResourceComplianceGroupByRegionRequest
     * @return GetResourceComplianceGroupByRegionResponse
     */
    @Override
    public CompletableFuture<GetResourceComplianceGroupByRegionResponse> getResourceComplianceGroupByRegion(GetResourceComplianceGroupByRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceComplianceGroupByRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceComplianceGroupByRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceComplianceGroupByRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceComplianceGroupByResourceType  GetResourceComplianceGroupByResourceTypeRequest
     * @return GetResourceComplianceGroupByResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetResourceComplianceGroupByResourceTypeResponse> getResourceComplianceGroupByResourceType(GetResourceComplianceGroupByResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceComplianceGroupByResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceComplianceGroupByResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceComplianceGroupByResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In Cloud Config, each resource has a compliance timeline. Cloud Config generates a compliance evaluation record for a resource each time the resource is evaluated based on a rule. The compliance evaluation records of a resource are displayed in a compliance timeline. You can configure Cloud Config to execute a rule to evaluate a resource on a regular basis or each time you change the resource configuration. You can also manually execute a rule to evaluate a resource.
     * This topic provides an example on how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The resource is an Object Storage Service (OSS) bucket. The returned result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetResourceComplianceTimeline  GetResourceComplianceTimelineRequest
     * @return GetResourceComplianceTimelineResponse
     */
    @Override
    public CompletableFuture<GetResourceComplianceTimelineResponse> getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceComplianceTimeline").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceComplianceTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceComplianceTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetResourceConfigurationTimeline  GetResourceConfigurationTimelineRequest
     * @return GetResourceConfigurationTimelineResponse
     */
    @Override
    public CompletableFuture<GetResourceConfigurationTimelineResponse> getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceConfigurationTimeline").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceConfigurationTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceConfigurationTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2398354.html">GenerateResourceInventory</a> operation to generate a resource inventory. Then, you can call the GetResourceInventory operation to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the current Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of GetResourceInventory  GetResourceInventoryRequest
     * @return GetResourceInventoryResponse
     */
    @Override
    public CompletableFuture<GetResourceInventoryResponse> getResourceInventory(GetResourceInventoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceInventory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceInventoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceInventoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.</p>
     * 
     * @param request the request parameters of GetSupportedResourceRelationConfig  GetSupportedResourceRelationConfigRequest
     * @return GetSupportedResourceRelationConfigResponse
     */
    @Override
    public CompletableFuture<GetSupportedResourceRelationConfigResponse> getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSupportedResourceRelationConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSupportedResourceRelationConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSupportedResourceRelationConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> incompliant resource that is evaluated by using the <code>cr-7e72626622af0051***</code> rule in the <code>120886317861****</code> member account of the <code>ca-5b6c626622af008f****</code> account group. The ID of the region where the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * @param request the request parameters of IgnoreAggregateEvaluationResults  IgnoreAggregateEvaluationResultsRequest
     * @return IgnoreAggregateEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<IgnoreAggregateEvaluationResultsResponse> ignoreAggregateEvaluationResults(IgnoreAggregateEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IgnoreAggregateEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IgnoreAggregateEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IgnoreAggregateEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> resource that is evaluated as incompliant by using the <code>cr-7e72626622af0051****</code> rule in the <code>100931896542****</code> account. The ID of the region in which the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * @param request the request parameters of IgnoreEvaluationResults  IgnoreEvaluationResultsRequest
     * @return IgnoreEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<IgnoreEvaluationResultsResponse> ignoreEvaluationResults(IgnoreEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IgnoreEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IgnoreEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IgnoreEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>ca-f632626622af0079****</code> account group is used as an example. The return result shows one compliance package whose ID is <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * @param request the request parameters of ListAggregateCompliancePacks  ListAggregateCompliancePacksRequest
     * @return ListAggregateCompliancePacksResponse
     */
    @Override
    public CompletableFuture<ListAggregateCompliancePacksResponse> listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateCompliancePacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateCompliancePacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateCompliancePacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAggregateConfigDeliveryChannels  ListAggregateConfigDeliveryChannelsRequest
     * @return ListAggregateConfigDeliveryChannelsResponse
     */
    @Override
    public CompletableFuture<ListAggregateConfigDeliveryChannelsResponse> listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateConfigDeliveryChannels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateConfigDeliveryChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateConfigDeliveryChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources based on the <code>cr-888f626622af00ae****</code> rule in the <code>ca-d1e3326622af00cb****</code> account group. The returned result indicates that the <code>Bucket-test</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRuleEvaluationResults  ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<ListAggregateConfigRuleEvaluationResultsResponse> listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateConfigRuleEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateConfigRuleEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateConfigRuleEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of compliance evaluation results of an account group whose ID is ca-edd3626622af00b3\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRuleEvaluationStatistics  ListAggregateConfigRuleEvaluationStatisticsRequest
     * @return ListAggregateConfigRuleEvaluationStatisticsResponse
     */
    @Override
    public CompletableFuture<ListAggregateConfigRuleEvaluationStatisticsResponse> listAggregateConfigRuleEvaluationStatistics(ListAggregateConfigRuleEvaluationStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateConfigRuleEvaluationStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateConfigRuleEvaluationStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateConfigRuleEvaluationStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules in an account group whose ID is <code>ca-f632626622af0079****</code>. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as <code>COMPLIANT</code>.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRules  ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     */
    @Override
    public CompletableFuture<ListAggregateConfigRulesResponse> listAggregateConfigRules(ListAggregateConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources within the member account <code>100931896542****</code> of the account group <code>ca-c560626622af0005****</code>. The result indicates that eight resources are queried.</p>
     * 
     * @param request the request parameters of ListAggregateDiscoveredResources  ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     */
    @Override
    public CompletableFuture<ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateDiscoveredResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateDiscoveredResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateDiscoveredResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the <code>cr-d04a626622af00af****</code> rule in the <code>ca-edd3626622af00b3****</code> account group.</p>
     * 
     * @param request the request parameters of ListAggregateRemediationExecutions  ListAggregateRemediationExecutionsRequest
     * @return ListAggregateRemediationExecutionsResponse
     */
    @Override
    public CompletableFuture<ListAggregateRemediationExecutionsResponse> listAggregateRemediationExecutions(ListAggregateRemediationExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateRemediationExecutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateRemediationExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateRemediationExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates of the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * @param request the request parameters of ListAggregateRemediations  ListAggregateRemediationsRequest
     * @return ListAggregateRemediationsResponse
     */
    @Override
    public CompletableFuture<ListAggregateRemediationsResponse> listAggregateRemediations(ListAggregateRemediationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateRemediations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateRemediationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateRemediationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This example shows how to query the compliance evaluation result of the <code>23642660635396****</code> resource in the <code>ca-7f00626622af0041****</code> account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of ListAggregateResourceEvaluationResults  ListAggregateResourceEvaluationResultsRequest
     * @return ListAggregateResourceEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<ListAggregateResourceEvaluationResultsResponse> listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateResourceEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateResourceEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateResourceEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.</p>
     * 
     * @param request the request parameters of ListAggregateResourceRelations  ListAggregateResourceRelationsRequest
     * @return ListAggregateResourceRelationsResponse
     */
    @Override
    public CompletableFuture<ListAggregateResourceRelationsResponse> listAggregateResourceRelations(ListAggregateResourceRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateResourceRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateResourceRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateResourceRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see<a href="https://github.com/aliyun/alibabacloud-config-resource-schema"> Alibaba Cloud Config Resource Schema</a></p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> in the account group <code>ca-4b05626622af000c****</code> by using the advanced search feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAggregateResourcesByAdvancedSearch  ListAggregateResourcesByAdvancedSearchRequest
     * @return ListAggregateResourcesByAdvancedSearchResponse
     */
    @Override
    public CompletableFuture<ListAggregateResourcesByAdvancedSearchResponse> listAggregateResourcesByAdvancedSearch(ListAggregateResourcesByAdvancedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregateResourcesByAdvancedSearch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregateResourcesByAdvancedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregateResourcesByAdvancedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type, which indicates a custom account group. The account group contains two member accounts.</p>
     * 
     * @param request the request parameters of ListAggregators  ListAggregatorsRequest
     * @return ListAggregatorsResponse
     */
    @Override
    public CompletableFuture<ListAggregatorsResponse> listAggregators(ListAggregatorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAggregators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAggregatorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAggregatorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A compliance package template is a collection of rules that Cloud Config can create based on compliance scenarios.</p>
     * 
     * @param request the request parameters of ListCompliancePackTemplates  ListCompliancePackTemplatesRequest
     * @return ListCompliancePackTemplatesResponse
     */
    @Override
    public CompletableFuture<ListCompliancePackTemplatesResponse> listCompliancePackTemplates(ListCompliancePackTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCompliancePackTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCompliancePackTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCompliancePackTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query compliance packages. The return result shows the details of the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * 
     * @param request the request parameters of ListCompliancePacks  ListCompliancePacksRequest
     * @return ListCompliancePacksResponse
     */
    @Override
    public CompletableFuture<ListCompliancePacksResponse> listCompliancePacks(ListCompliancePacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCompliancePacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCompliancePacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCompliancePacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConfigDeliveryChannels  ListConfigDeliveryChannelsRequest
     * @return ListConfigDeliveryChannelsResponse
     */
    @Override
    public CompletableFuture<ListConfigDeliveryChannelsResponse> listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigDeliveryChannels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigDeliveryChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigDeliveryChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is <code>cr-cac56457e0d900d3****</code>. The returned result indicates that the <code>i-hp3e4kvhzqn2s11t****</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request the request parameters of ListConfigRuleEvaluationResults  ListConfigRuleEvaluationResultsRequest
     * @return ListConfigRuleEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<ListConfigRuleEvaluationResultsResponse> listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigRuleEvaluationResults").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigRuleEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigRuleEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConfigRuleEvaluationStatistics  ListConfigRuleEvaluationStatisticsRequest
     * @return ListConfigRuleEvaluationStatisticsResponse
     */
    @Override
    public CompletableFuture<ListConfigRuleEvaluationStatisticsResponse> listConfigRuleEvaluationStatistics(ListConfigRuleEvaluationStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigRuleEvaluationStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigRuleEvaluationStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigRuleEvaluationStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules of the current account. The response shows that the current account has a total of one rule and three evaluated resources. The resources are evaluated as compliant.</p>
     * 
     * @param request the request parameters of ListConfigRules  ListConfigRulesRequest
     * @return ListConfigRulesResponse
     */
    @Override
    public CompletableFuture<ListConfigRulesResponse> listConfigRules(ListConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.</p>
     * 
     * @param request the request parameters of ListDiscoveredResources  ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     */
    @Override
    public CompletableFuture<ListDiscoveredResourcesResponse> listDiscoveredResources(ListDiscoveredResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDiscoveredResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiscoveredResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiscoveredResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the cloud services that can be integrated by the current Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ListIntegratedService  ListIntegratedServiceRequest
     * @return ListIntegratedServiceResponse
     */
    @Override
    public CompletableFuture<ListIntegratedServiceResponse> listIntegratedService(ListIntegratedServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntegratedService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntegratedServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntegratedServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>For more information about how to define, execute, and integrate a managed rule, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and execution of rules</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query all managed rules whose keyword is <code>CDN</code>. The response shows that 21 managed rules exist.</p>
     * 
     * @param request the request parameters of ListManagedRules  ListManagedRulesRequest
     * @return ListManagedRulesResponse
     */
    @Override
    public CompletableFuture<ListManagedRulesResponse> listManagedRules(ListManagedRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListManagedRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListManagedRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListManagedRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to define, execute, and integrate an evaluation rule, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and execution of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     * 
     * @param request the request parameters of ListPreManagedRules  ListPreManagedRulesRequest
     * @return ListPreManagedRulesResponse
     */
    @Override
    public CompletableFuture<ListPreManagedRulesResponse> listPreManagedRules(ListPreManagedRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPreManagedRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPreManagedRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPreManagedRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the rule cr-5392626622af0000\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of ListRemediationExecutions  ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     */
    @Override
    public CompletableFuture<ListRemediationExecutionsResponse> listRemediationExecutions(ListRemediationExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRemediationExecutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRemediationExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRemediationExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>oss-bucket-public-write-prohibited</code> managed rule is used as an example. The return result shows the details of the remediation template of the <code>OOS</code> type for the managed rule. OOS represents Operation Orchestration Service.</p>
     * 
     * @param request the request parameters of ListRemediationTemplates  ListRemediationTemplatesRequest
     * @return ListRemediationTemplatesResponse
     */
    @Override
    public CompletableFuture<ListRemediationTemplatesResponse> listRemediationTemplates(ListRemediationTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRemediationTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRemediationTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRemediationTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates for the rule whose ID is <code>cr-6b7c626622af00b4****</code>.</p>
     * 
     * @param request the request parameters of ListRemediations  ListRemediationsRequest
     * @return ListRemediationsResponse
     */
    @Override
    public CompletableFuture<ListRemediationsResponse> listRemediations(ListRemediationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRemediations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRemediationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRemediationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the compliance evaluation result of the <code>23642660635396****</code> resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of ListResourceEvaluationResults  ListResourceEvaluationResultsRequest
     * @return ListResourceEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<ListResourceEvaluationResultsResponse> listResourceEvaluationResults(ListResourceEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For information about the Alibaba Cloud services and resource types supported by Cloud Config, see <a href="https://help.aliyun.com/document_detail/127411.html">Alibaba Cloud services and resource types supported by Cloud Config</a>.
     * This topic provides an example on how to query the information about the disks that are attached to an Elastic Compute Service (ECS) instance named <code>i-j6cajg9yrfoh4sas****</code> that is created by the current Alibaba Cloud account in the China (Shanghai) region.</p>
     * 
     * @param request the request parameters of ListResourceRelations  ListResourceRelationsRequest
     * @return ListResourceRelationsResponse
     */
    @Override
    public CompletableFuture<ListResourceRelationsResponse> listResourceRelations(ListResourceRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see <a href="https://github.com/aliyun/alibabacloud-config-resource-schema">Alibaba Cloud Config Resource Schema</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> within the current account by using the advanced search feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ListResourcesByAdvancedSearch  ListResourcesByAdvancedSearchRequest
     * @return ListResourcesByAdvancedSearchResponse
     */
    @Override
    public CompletableFuture<ListResourcesByAdvancedSearchResponse> listResourcesByAdvancedSearch(ListResourcesByAdvancedSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourcesByAdvancedSearch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesByAdvancedSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesByAdvancedSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the Alibaba Cloud services and resource types supported by a Cloud Config.</p>
     * 
     * @param request the request parameters of ListSupportedProducts  ListSupportedProductsRequest
     * @return ListSupportedProductsResponse
     */
    @Override
    public CompletableFuture<ListSupportedProductsResponse> listSupportedProducts(ListSupportedProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSupportedProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupportedProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupportedProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>For more information about the definition, use scenarios, and execution of custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and execution of custom function rules</a>.</p>
     * 
     * @param request the request parameters of PutEvaluations  PutEvaluationsRequest
     * @return PutEvaluationsResponse
     */
    @Override
    public CompletableFuture<PutEvaluationsResponse> putEvaluations(PutEvaluationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutEvaluations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutEvaluationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutEvaluationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/607054.html">IgnoreAggregateEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule of the <code>120886317861****</code> member in the <code>ca-5b6c626622af008f****</code> group account. The ID of the region in which the resource resides is <code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * @param request the request parameters of RevertAggregateEvaluationResults  RevertAggregateEvaluationResultsRequest
     * @return RevertAggregateEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<RevertAggregateEvaluationResultsResponse> revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevertAggregateEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevertAggregateEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevertAggregateEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/606990.html">IgnoreEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the <code>lb-hp3a3b4ztyfm2plgm****</code> non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule. The ID of the region in which the resource resides is<code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * @param request the request parameters of RevertEvaluationResults  RevertEvaluationResultsRequest
     * @return RevertEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<RevertEvaluationResultsResponse> revertEvaluationResults(RevertEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevertEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevertEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevertEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see <a href="https://help.aliyun.com/document_detail/265979.html">ListAggregateConfigRuleEvaluationResults</a>.
     * The sample request in this topic shows how to use the <code>cr-c169626622af009f****</code> rule in the <code>ca-3a58626622af0005****</code> account group to evaluate resources.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StartAggregateConfigRuleEvaluation  StartAggregateConfigRuleEvaluationRequest
     * @return StartAggregateConfigRuleEvaluationResponse
     */
    @Override
    public CompletableFuture<StartAggregateConfigRuleEvaluationResponse> startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAggregateConfigRuleEvaluation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAggregateConfigRuleEvaluationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAggregateConfigRuleEvaluationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The return result shows that the manual execution is successful.</p>
     * 
     * @param request the request parameters of StartAggregateRemediation  StartAggregateRemediationRequest
     * @return StartAggregateRemediationResponse
     */
    @Override
    public CompletableFuture<StartAggregateRemediationResponse> startAggregateRemediation(StartAggregateRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAggregateRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAggregateRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAggregateRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the cr-9920626622af0035\<em>\</em>\<em>\</em> rule is used to re-evaluate the compliance of resources.</p>
     * 
     * @param request the request parameters of StartConfigRuleEvaluation  StartConfigRuleEvaluationRequest
     * @return StartConfigRuleEvaluationResponse
     */
    @Override
    public CompletableFuture<StartConfigRuleEvaluationResponse> startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartConfigRuleEvaluation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartConfigRuleEvaluationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartConfigRuleEvaluationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to enable Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of StartConfigurationRecorder  StartConfigurationRecorderRequest
     * @return StartConfigurationRecorderResponse
     */
    @Override
    public CompletableFuture<StartConfigurationRecorderResponse> startConfigurationRecorder(StartConfigurationRecorderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartConfigurationRecorder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartConfigurationRecorderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartConfigurationRecorderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to perform a remediation operation by using the rule whose ID is <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that the manual execution is successful.</p>
     * 
     * @param request the request parameters of StartRemediation  StartRemediationRequest
     * @return StartRemediationResponse
     */
    @Override
    public CompletableFuture<StartRemediationResponse> startRemediation(StartRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After you deactivate Cloud Config, the resource configurations, created rules, and compliance evaluation results that are stored in Cloud Config are automatically cleared and cannot be restored. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StopConfigurationRecorder  StopConfigurationRecorderRequest
     * @return StopConfigurationRecorderResponse
     */
    @Override
    public CompletableFuture<StopConfigurationRecorderResponse> stopConfigurationRecorder(StopConfigurationRecorderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopConfigurationRecorder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopConfigurationRecorderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopConfigurationRecorderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter in the rule template of the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code> to <code>20</code>.</p>
     * 
     * @param request the request parameters of UpdateAggregateCompliancePack  UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     */
    @Override
    public CompletableFuture<UpdateAggregateCompliancePackResponse> updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAggregateCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAggregateCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAggregateCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>. The Status parameter is set to <code>0</code>. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.</p>
     * 
     * @param request the request parameters of UpdateAggregateConfigDeliveryChannel  UpdateAggregateConfigDeliveryChannelRequest
     * @return UpdateAggregateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<UpdateAggregateConfigDeliveryChannelResponse> updateAggregateConfigDeliveryChannel(UpdateAggregateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAggregateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAggregateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAggregateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in an account group <code>ca-a4e5626622af0079****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * @param request the request parameters of UpdateAggregateConfigRule  UpdateAggregateConfigRuleRequest
     * @return UpdateAggregateConfigRuleResponse
     */
    @Override
    public CompletableFuture<UpdateAggregateConfigRuleResponse> updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAggregateConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAggregateConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAggregateConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting for a rule in the <code>ca-6b4a626622af0012****</code> account group to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * @param request the request parameters of UpdateAggregateRemediation  UpdateAggregateRemediationRequest
     * @return UpdateAggregateRemediationResponse
     */
    @Override
    public CompletableFuture<UpdateAggregateRemediationResponse> updateAggregateRemediation(UpdateAggregateRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAggregateRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAggregateRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAggregateRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member ID is <code>173808452267****</code>, the member name is <code>Tony</code>, and the member belongs to the resource directory <code>ResourceDirectory</code>.</p>
     * 
     * @param request the request parameters of UpdateAggregator  UpdateAggregatorRequest
     * @return UpdateAggregatorResponse
     */
    @Override
    public CompletableFuture<UpdateAggregatorResponse> updateAggregator(UpdateAggregatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAggregator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAggregatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAggregatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter of a rule in the compliance package <code>cp-a8a8626622af0082****</code> to <code>20</code>.</p>
     * 
     * @param request the request parameters of UpdateCompliancePack  UpdateCompliancePackRequest
     * @return UpdateCompliancePackResponse
     */
    @Override
    public CompletableFuture<UpdateCompliancePackResponse> updateCompliancePack(UpdateCompliancePackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCompliancePack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCompliancePackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCompliancePackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.</p>
     * 
     * @param request the request parameters of UpdateConfigDeliveryChannel  UpdateConfigDeliveryChannelRequest
     * @return UpdateConfigDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<UpdateConfigDeliveryChannelResponse> updateConfigDeliveryChannel(UpdateConfigDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConfigDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * @param request the request parameters of UpdateConfigRule  UpdateConfigRuleRequest
     * @return UpdateConfigRuleResponse
     */
    @Override
    public CompletableFuture<UpdateConfigRuleResponse> updateConfigRule(UpdateConfigRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConfigRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the resource monitoring scope of the current account to ACS::ECS::Instance.</p>
     * 
     * @param request the request parameters of UpdateConfigurationRecorder  UpdateConfigurationRecorderRequest
     * @return UpdateConfigurationRecorderResponse
     */
    @Override
    public CompletableFuture<UpdateConfigurationRecorderResponse> updateConfigurationRecorder(UpdateConfigurationRecorderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConfigurationRecorder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigurationRecorderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigurationRecorderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateDeliveryChannel is deprecated, please use Config::2020-09-07::UpdateConfigDeliveryChannel,Config::2020-09-07::UpdateAggregateConfigDeliveryChannel instead.  * @description This topic provides an example on how to change the status of the delivery channel whose ID is `cdc-8e45ff4e06a3a8****` to 0, which indicates that the delivery channel is disabled. After the delivery channel is disabled, Cloud Config retains the last delivery configuration and stops resource data delivery.
     * 
     * @param request the request parameters of UpdateDeliveryChannel  UpdateDeliveryChannelRequest
     * @return UpdateDeliveryChannelResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateDeliveryChannelResponse> updateDeliveryChannel(UpdateDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIntegratedServiceStatus  UpdateIntegratedServiceStatusRequest
     * @return UpdateIntegratedServiceStatusResponse
     */
    @Override
    public CompletableFuture<UpdateIntegratedServiceStatusResponse> updateIntegratedServiceStatus(UpdateIntegratedServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIntegratedServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIntegratedServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIntegratedServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * @param request the request parameters of UpdateRemediation  UpdateRemediationRequest
     * @return UpdateRemediationResponse
     */
    @Override
    public CompletableFuture<UpdateRemediationResponse> updateRemediation(UpdateRemediationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRemediation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRemediationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRemediationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
