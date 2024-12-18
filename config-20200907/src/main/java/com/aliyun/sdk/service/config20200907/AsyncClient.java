// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.config20200907.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The rule is in the <code>INACTIVE</code> state.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to enable the <code>cr-5772ba41209e007b****</code> rule in the <code>ca-a4e5626622af0079****</code> account group.</p>
     * 
     * @param request the request parameters of ActiveAggregateConfigRules  ActiveAggregateConfigRulesRequest
     * @return ActiveAggregateConfigRulesResponse
     */
    CompletableFuture<ActiveAggregateConfigRulesResponse> activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The rule is in the <code>INACTIVE</code> state.</p>
     * 
     * @param request the request parameters of ActiveConfigRules  ActiveConfigRulesRequest
     * @return ActiveConfigRulesResponse
     */
    CompletableFuture<ActiveConfigRulesResponse> activeConfigRules(ActiveConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to add the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of AttachAggregateConfigRuleToCompliancePack  AttachAggregateConfigRuleToCompliancePackRequest
     * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    CompletableFuture<AttachAggregateConfigRuleToCompliancePackResponse> attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the <code>cr-6cc4626622af00e7****</code> rule to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * @param request the request parameters of AttachConfigRuleToCompliancePack  AttachConfigRuleToCompliancePackRequest
     * @return AttachConfigRuleToCompliancePackResponse
     */
    CompletableFuture<AttachConfigRuleToCompliancePackResponse> attachConfigRuleToCompliancePack(AttachConfigRuleToCompliancePackRequest request);

    /**
     * @param request the request parameters of CopyCompliancePacks  CopyCompliancePacksRequest
     * @return CopyCompliancePacksResponse
     */
    CompletableFuture<CopyCompliancePacksResponse> copyCompliancePacks(CopyCompliancePacksRequest request);

    /**
     * @param request the request parameters of CopyConfigRules  CopyConfigRulesRequest
     * @return CopyConfigRulesResponse
     */
    CompletableFuture<CopyConfigRulesResponse> copyConfigRules(CopyConfigRulesRequest request);

    /**
     * @param request the request parameters of CreateAdvancedSearchFile  CreateAdvancedSearchFileRequest
     * @return CreateAdvancedSearchFileResponse
     */
    CompletableFuture<CreateAdvancedSearchFileResponse> createAdvancedSearchFile(CreateAdvancedSearchFileRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a downloadable resource file for an account group whose ID is <code>ca-edd3626622af00b3****</code>. The resource file includes all the ECS instances in the account group.</p>
     * 
     * @param request the request parameters of CreateAggregateAdvancedSearchFile  CreateAggregateAdvancedSearchFileRequest
     * @return CreateAggregateAdvancedSearchFileResponse
     */
    CompletableFuture<CreateAggregateAdvancedSearchFileResponse> createAggregateAdvancedSearchFile(CreateAggregateAdvancedSearchFileRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a compliance package for the account group <code>ca-f632626622af0079****</code> by using the compliance package template <code>ClassifiedProtectionPreCheck</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateCompliancePack  CreateAggregateCompliancePackRequest
     * @return CreateAggregateCompliancePackResponse
     */
    CompletableFuture<CreateAggregateCompliancePackResponse> createAggregateCompliancePack(CreateAggregateCompliancePackRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created for an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created. The ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateConfigDeliveryChannel  CreateAggregateConfigDeliveryChannelRequest
     * @return CreateAggregateConfigDeliveryChannelResponse
     */
    CompletableFuture<CreateAggregateConfigDeliveryChannelResponse> createAggregateConfigDeliveryChannel(CreateAggregateConfigDeliveryChannelRequest request);

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
    CompletableFuture<CreateAggregateConfigRuleResponse> createAggregateConfigRule(CreateAggregateConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * @param request the request parameters of CreateAggregateRemediation  CreateAggregateRemediationRequest
     * @return CreateAggregateRemediationResponse
     */
    CompletableFuture<CreateAggregateRemediationResponse> createAggregateRemediation(CreateAggregateRemediationRequest request);

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
    CompletableFuture<CreateAggregatorResponse> createAggregator(CreateAggregatorRequest request);

    /**
     * <b>description</b> :
     * <p>Each ordinary account can create up to five compliance packages.
     * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named <code>eip-bandwidth-limit</code>.</p>
     * 
     * @param request the request parameters of CreateCompliancePack  CreateCompliancePackRequest
     * @return CreateCompliancePackResponse
     */
    CompletableFuture<CreateCompliancePackResponse> createCompliancePack(CreateCompliancePackRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * @param request the request parameters of CreateConfigDeliveryChannel  CreateConfigDeliveryChannelRequest
     * @return CreateConfigDeliveryChannelResponse
     */
    CompletableFuture<CreateConfigDeliveryChannelResponse> createConfigDeliveryChannel(CreateConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can use a common account to create up to 200 rules.</p>
     * 
     * @param request the request parameters of CreateConfigRule  CreateConfigRuleRequest
     * @return CreateConfigRuleResponse
     */
    CompletableFuture<CreateConfigRuleResponse> createConfigRule(CreateConfigRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDeliveryChannel is deprecated, please use Config::2020-09-07::CreateConfigDeliveryChannel,Config::2020-09-07::CreateAggregateConfigDeliveryChannel instead.  * @description In this example, a delivery channel is created. The type of the delivery channel is `OSS`, the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`, and the ARN of the role that is assigned to the delivery channel is `acs:ram::100931896542****:role/aliyunserviceroleforconfig`. The returned result shows that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
     * 
     * @param request the request parameters of CreateDeliveryChannel  CreateDeliveryChannelRequest
     * @return CreateDeliveryChannelResponse
     */
    @Deprecated
    CompletableFuture<CreateDeliveryChannelResponse> createDeliveryChannel(CreateDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * @param request the request parameters of CreateRemediation  CreateRemediationRequest
     * @return CreateRemediationResponse
     */
    CompletableFuture<CreateRemediationResponse> createRemediation(CreateRemediationRequest request);

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
    CompletableFuture<DeactiveAggregateConfigRulesResponse> deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request);

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
    CompletableFuture<DeactiveConfigRulesResponse> deactiveConfigRules(DeactiveConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package from the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * @param request the request parameters of DeleteAggregateCompliancePacks  DeleteAggregateCompliancePacksRequest
     * @return DeleteAggregateCompliancePacksResponse
     */
    CompletableFuture<DeleteAggregateCompliancePacksResponse> deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel from the <code>ca-23c6626622af0041****</code> account group. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * @param request the request parameters of DeleteAggregateConfigDeliveryChannel  DeleteAggregateConfigDeliveryChannelRequest
     * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    CompletableFuture<DeleteAggregateConfigDeliveryChannelResponse> deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cr-4e3d626622af0080****</code> rule from the <code>ca-a4e5626622af0079****</code> account group.</p>
     * 
     * @param request the request parameters of DeleteAggregateConfigRules  DeleteAggregateConfigRulesRequest
     * @return DeleteAggregateConfigRulesResponse
     */
    CompletableFuture<DeleteAggregateConfigRulesResponse> deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> from the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * @param request the request parameters of DeleteAggregateRemediations  DeleteAggregateRemediationsRequest
     * @return DeleteAggregateRemediationsResponse
     */
    CompletableFuture<DeleteAggregateRemediationsResponse> deleteAggregateRemediations(DeleteAggregateRemediationsRequest request);

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
    CompletableFuture<DeleteAggregatorsResponse> deleteAggregators(DeleteAggregatorsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package.</p>
     * 
     * @param request the request parameters of DeleteCompliancePacks  DeleteCompliancePacksRequest
     * @return DeleteCompliancePacksResponse
     */
    CompletableFuture<DeleteCompliancePacksResponse> deleteCompliancePacks(DeleteCompliancePacksRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * @param request the request parameters of DeleteConfigDeliveryChannel  DeleteConfigDeliveryChannelRequest
     * @return DeleteConfigDeliveryChannelResponse
     */
    CompletableFuture<DeleteConfigDeliveryChannelResponse> deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the rule whose ID is cr-9908626622af0035\<em>\</em>\<em>\</em> is deleted.</p>
     * 
     * @param request the request parameters of DeleteConfigRules  DeleteConfigRulesRequest
     * @return DeleteConfigRulesResponse
     */
    CompletableFuture<DeleteConfigRulesResponse> deleteConfigRules(DeleteConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template <code>crr-909ba2d4716700eb****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * @param request the request parameters of DeleteRemediations  DeleteRemediationsRequest
     * @return DeleteRemediationsResponse
     */
    CompletableFuture<DeleteRemediationsResponse> deleteRemediations(DeleteRemediationsRequest request);

    /**
     * @param request the request parameters of DescribeRemediation  DescribeRemediationRequest
     * @return DescribeRemediationResponse
     */
    CompletableFuture<DescribeRemediationResponse> describeRemediation(DescribeRemediationRequest request);

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
    CompletableFuture<DetachAggregateConfigRuleToCompliancePackResponse> detachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest request);

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
    CompletableFuture<DetachConfigRuleToCompliancePackResponse> detachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest request);

    /**
     * @param request the request parameters of EvaluatePreConfigRules  EvaluatePreConfigRulesRequest
     * @return EvaluatePreConfigRulesResponse
     */
    CompletableFuture<EvaluatePreConfigRulesResponse> evaluatePreConfigRules(EvaluatePreConfigRulesRequest request);

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
    CompletableFuture<GenerateAggregateCompliancePackReportResponse> generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request);

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
    CompletableFuture<GenerateAggregateConfigRulesReportResponse> generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to generate a downloadable inventory for global resources in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of GenerateAggregateResourceInventory  GenerateAggregateResourceInventoryRequest
     * @return GenerateAggregateResourceInventoryResponse
     */
    CompletableFuture<GenerateAggregateResourceInventoryResponse> generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request);

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
    CompletableFuture<GenerateCompliancePackReportResponse> generateCompliancePackReport(GenerateCompliancePackReportRequest request);

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
    CompletableFuture<GenerateConfigRulesReportResponse> generateConfigRulesReport(GenerateConfigRulesReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to generate a resource inventory for global resources of the current account.</p>
     * 
     * @param request the request parameters of GenerateResourceInventory  GenerateResourceInventoryRequest
     * @return GenerateResourceInventoryResponse
     */
    CompletableFuture<GenerateResourceInventoryResponse> generateResourceInventory(GenerateResourceInventoryRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/2511967.html">CreateAdvancedSearchFile</a> operation to create a resource advanced search file. Then, you can call this operation to obtain the URL of the resource advanced search file.</p>
     * 
     * @param request the request parameters of GetAdvancedSearchFile  GetAdvancedSearchFileRequest
     * @return GetAdvancedSearchFileResponse
     */
    CompletableFuture<GetAdvancedSearchFileResponse> getAdvancedSearchFile(GetAdvancedSearchFileRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of member accounts for which the <code>cp-541e626622af0087****</code> compliance package takes effect in the <code>ca-04b3fd170e340007****</code> account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetAggregateAccountComplianceByPack  GetAggregateAccountComplianceByPackRequest
     * @return GetAggregateAccountComplianceByPackResponse
     */
    CompletableFuture<GetAggregateAccountComplianceByPackResponse> getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request);

    /**
     * @param request the request parameters of GetAggregateAdvancedSearchFile  GetAggregateAdvancedSearchFileRequest
     * @return GetAggregateAdvancedSearchFileResponse
     */
    CompletableFuture<GetAggregateAdvancedSearchFileResponse> getAggregateAdvancedSearchFile(GetAggregateAdvancedSearchFileRequest request);

    /**
     * <b>description</b> :
     * <p>The topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code> in an account group whose ID is <code>ca-f632626622af0079****</code>.</p>
     * 
     * @param request the request parameters of GetAggregateCompliancePack  GetAggregateCompliancePackRequest
     * @return GetAggregateCompliancePackResponse
     */
    CompletableFuture<GetAggregateCompliancePackResponse> getAggregateCompliancePack(GetAggregateCompliancePackRequest request);

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
    CompletableFuture<GetAggregateCompliancePackReportResponse> getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of GetAggregateComplianceSummary  GetAggregateComplianceSummaryRequest
     * @return GetAggregateComplianceSummaryResponse
     */
    CompletableFuture<GetAggregateComplianceSummaryResponse> getAggregateComplianceSummary(GetAggregateComplianceSummaryRequest request);

    /**
     * @param request the request parameters of GetAggregateConfigDeliveryChannel  GetAggregateConfigDeliveryChannelRequest
     * @return GetAggregateConfigDeliveryChannelResponse
     */
    CompletableFuture<GetAggregateConfigDeliveryChannelResponse> getAggregateConfigDeliveryChannel(GetAggregateConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This example shows how to query the details of the <code>cr-7f7d626622af0041****</code> rule in the <code>ca-7f00626622af0041****</code> account group.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRule  GetAggregateConfigRuleRequest
     * @return GetAggregateConfigRuleResponse
     */
    CompletableFuture<GetAggregateConfigRuleResponse> getAggregateConfigRule(GetAggregateConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance evaluation results based on rules in the <code>cp-541e626622af0087****</code> compliance package that is created for the <code>ca-04b3fd170e340007****</code> account group. The return result shows a total of <code>one</code> rule. <code>No resources</code> are evaluated as non-compliant based on the rule.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRuleComplianceByPack  GetAggregateConfigRuleComplianceByPackRequest
     * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    CompletableFuture<GetAggregateConfigRuleComplianceByPackResponse> getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the <code>ca-3a58626622af0005****</code> account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.</p>
     * 
     * @param request the request parameters of GetAggregateConfigRuleSummaryByRiskLevel  GetAggregateConfigRuleSummaryByRiskLevelRequest
     * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    CompletableFuture<GetAggregateConfigRuleSummaryByRiskLevelResponse> getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request);

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
    CompletableFuture<GetAggregateConfigRulesReportResponse> getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region in the account group <code>ca-5885626622af0008****</code>.</p>
     * 
     * @param request the request parameters of GetAggregateDiscoveredResource  GetAggregateDiscoveredResourceRequest
     * @return GetAggregateDiscoveredResourceResponse
     */
    CompletableFuture<GetAggregateDiscoveredResourceResponse> getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results based on the <code>cr-d369626622af008e****</code> rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceByConfigRule  GetAggregateResourceComplianceByConfigRuleRequest
     * @return GetAggregateResourceComplianceByConfigRuleResponse
     */
    CompletableFuture<GetAggregateResourceComplianceByConfigRuleResponse> getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code>account group. The returned result shows that the total number of monitored resources is <code>10</code> and the number of non-compliant resources is <code>7</code>.</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceByPack  GetAggregateResourceComplianceByPackRequest
     * @return GetAggregateResourceComplianceByPackResponse
     */
    CompletableFuture<GetAggregateResourceComplianceByPackResponse> getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request);

    /**
     * @param request the request parameters of GetAggregateResourceComplianceGroupByRegion  GetAggregateResourceComplianceGroupByRegionRequest
     * @return GetAggregateResourceComplianceGroupByRegionResponse
     */
    CompletableFuture<GetAggregateResourceComplianceGroupByRegionResponse> getAggregateResourceComplianceGroupByRegion(GetAggregateResourceComplianceGroupByRegionRequest request);

    /**
     * @param request the request parameters of GetAggregateResourceComplianceGroupByResourceType  GetAggregateResourceComplianceGroupByResourceTypeRequest
     * @return GetAggregateResourceComplianceGroupByResourceTypeResponse
     */
    CompletableFuture<GetAggregateResourceComplianceGroupByResourceTypeResponse> getAggregateResourceComplianceGroupByResourceType(GetAggregateResourceComplianceGroupByResourceTypeRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetAggregateResourceComplianceTimeline  GetAggregateResourceComplianceTimelineRequest
     * @return GetAggregateResourceComplianceTimelineResponse
     */
    CompletableFuture<GetAggregateResourceComplianceTimelineResponse> getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetAggregateResourceConfigurationTimeline  GetAggregateResourceConfigurationTimelineRequest
     * @return GetAggregateResourceConfigurationTimelineResponse
     */
    CompletableFuture<GetAggregateResourceConfigurationTimelineResponse> getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group named <code>ca-a260626622af0005****</code> by region. The returned result shows that a total of <code>10</code> resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetAggregateResourceCountsGroupByRegion  GetAggregateResourceCountsGroupByRegionRequest
     * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    CompletableFuture<GetAggregateResourceCountsGroupByRegionResponse> getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group whose ID is <code>ca-a260626622af0005****</code> by resource type. The returned result shows that the account group has a total of <code>seven</code> resources of the <code>ACS::RAM::Role</code> resource type.</p>
     * 
     * @param request the request parameters of GetAggregateResourceCountsGroupByResourceType  GetAggregateResourceCountsGroupByResourceTypeRequest
     * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    CompletableFuture<GetAggregateResourceCountsGroupByResourceTypeResponse> getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request);

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
    CompletableFuture<GetAggregateResourceInventoryResponse> getAggregateResourceInventory(GetAggregateResourceInventoryRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the details of the <code>ca-88ea626622af0055****</code> account group. The return result shows that the account group is named <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type. The account group is in the <code>1</code> state, which indicates that it is created.</p>
     * 
     * @param request the request parameters of GetAggregator  GetAggregatorRequest
     * @return GetAggregatorResponse
     */
    CompletableFuture<GetAggregatorResponse> getAggregator(GetAggregatorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code>. The returned result shows that the name of the compliance package is <code>ClassifiedProtectionPreCheck</code>, the compliance package is in the <code>ACTIVE</code> state, and the risk level of the rules in the compliance package is <code>1</code>, which indicates high risk level.</p>
     * 
     * @param request the request parameters of GetCompliancePack  GetCompliancePackRequest
     * @return GetCompliancePackResponse
     */
    CompletableFuture<GetCompliancePackResponse> getCompliancePack(GetCompliancePackRequest request);

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
    CompletableFuture<GetCompliancePackReportResponse> getCompliancePackReport(GetCompliancePackReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the current account group.</p>
     * 
     * @param request the request parameters of GetComplianceSummary  GetComplianceSummaryRequest
     * @return GetComplianceSummaryResponse
     */
    CompletableFuture<GetComplianceSummaryResponse> getComplianceSummary(GetComplianceSummaryRequest request);

    /**
     * @param request the request parameters of GetConfigDeliveryChannel  GetConfigDeliveryChannelRequest
     * @return GetConfigDeliveryChannelResponse
     */
    CompletableFuture<GetConfigDeliveryChannelResponse> getConfigDeliveryChannel(GetConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of GetConfigRule  GetConfigRuleRequest
     * @return GetConfigRuleResponse
     */
    CompletableFuture<GetConfigRuleResponse> getConfigRule(GetConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cp-541e626622af0087****</code> compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetConfigRuleComplianceByPack  GetConfigRuleComplianceByPackRequest
     * @return GetConfigRuleComplianceByPackResponse
     */
    CompletableFuture<GetConfigRuleComplianceByPackResponse> getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.</p>
     * 
     * @param request the request parameters of GetConfigRuleSummaryByRiskLevel  GetConfigRuleSummaryByRiskLevelRequest
     * @return GetConfigRuleSummaryByRiskLevelResponse
     */
    CompletableFuture<GetConfigRuleSummaryByRiskLevelResponse> getConfigRuleSummaryByRiskLevel(GetConfigRuleSummaryByRiskLevelRequest request);

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
    CompletableFuture<GetConfigRulesReportResponse> getConfigRulesReport(GetConfigRulesReportRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * 
     * @param request the request parameters of GetConfigurationRecorder  GetConfigurationRecorderRequest
     * @return GetConfigurationRecorderResponse
     */
    CompletableFuture<GetConfigurationRecorderResponse> getConfigurationRecorder(GetConfigurationRecorderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetDiscoveredResource  GetDiscoveredResourceRequest
     * @return GetDiscoveredResourceResponse
     */
    CompletableFuture<GetDiscoveredResourceResponse> getDiscoveredResource(GetDiscoveredResourceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to demonstrate how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetDiscoveredResourceCountsGroupByRegion  GetDiscoveredResourceCountsGroupByRegionRequest
     * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    CompletableFuture<GetDiscoveredResourceCountsGroupByRegionResponse> getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the <code>ACS::ECS::Instance</code> resource type exist.</p>
     * 
     * @param request the request parameters of GetDiscoveredResourceCountsGroupByResourceType  GetDiscoveredResourceCountsGroupByResourceTypeRequest
     * @return GetDiscoveredResourceCountsGroupByResourceTypeResponse
     */
    CompletableFuture<GetDiscoveredResourceCountsGroupByResourceTypeResponse> getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request);

    /**
     * @param request the request parameters of GetIntegratedServiceStatus  GetIntegratedServiceStatusRequest
     * @return GetIntegratedServiceStatusResponse
     */
    CompletableFuture<GetIntegratedServiceStatusResponse> getIntegratedServiceStatus(GetIntegratedServiceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the managed rule <code>cdn-domain-https-enabled</code>.</p>
     * 
     * @param request the request parameters of GetManagedRule  GetManagedRuleRequest
     * @return GetManagedRuleResponse
     */
    CompletableFuture<GetManagedRuleResponse> getManagedRule(GetManagedRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the automatic remediation template ACS-ALB-BulkyEnableDeletionProtection.</p>
     * 
     * @param request the request parameters of GetRemediationTemplate  GetRemediationTemplateRequest
     * @return GetRemediationTemplateResponse
     */
    CompletableFuture<GetRemediationTemplateResponse> getRemediationTemplate(GetRemediationTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cr-d369626622af008e****</code> rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and <code>five</code> of them are evaluated as compliant.</p>
     * 
     * @param request the request parameters of GetResourceComplianceByConfigRule  GetResourceComplianceByConfigRuleRequest
     * @return GetResourceComplianceByConfigRuleResponse
     */
    CompletableFuture<GetResourceComplianceByConfigRuleResponse> getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored by using the <code>cp-541e626622af0087****</code> compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.</p>
     * 
     * @param request the request parameters of GetResourceComplianceByPack  GetResourceComplianceByPackRequest
     * @return GetResourceComplianceByPackResponse
     */
    CompletableFuture<GetResourceComplianceByPackResponse> getResourceComplianceByPack(GetResourceComplianceByPackRequest request);

    /**
     * @param request the request parameters of GetResourceComplianceGroupByRegion  GetResourceComplianceGroupByRegionRequest
     * @return GetResourceComplianceGroupByRegionResponse
     */
    CompletableFuture<GetResourceComplianceGroupByRegionResponse> getResourceComplianceGroupByRegion(GetResourceComplianceGroupByRegionRequest request);

    /**
     * @param request the request parameters of GetResourceComplianceGroupByResourceType  GetResourceComplianceGroupByResourceTypeRequest
     * @return GetResourceComplianceGroupByResourceTypeResponse
     */
    CompletableFuture<GetResourceComplianceGroupByResourceTypeResponse> getResourceComplianceGroupByResourceType(GetResourceComplianceGroupByResourceTypeRequest request);

    /**
     * <b>description</b> :
     * <p>In Cloud Config, each resource has a compliance timeline. Cloud Config generates a compliance evaluation record for a resource each time the resource is evaluated based on a rule. The compliance evaluation records of a resource are displayed in a compliance timeline. You can configure Cloud Config to execute a rule to evaluate a resource on a regular basis or each time you change the resource configuration. You can also manually execute a rule to evaluate a resource.
     * This topic provides an example on how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The resource is an Object Storage Service (OSS) bucket. The returned result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetResourceComplianceTimeline  GetResourceComplianceTimelineRequest
     * @return GetResourceComplianceTimelineResponse
     */
    CompletableFuture<GetResourceComplianceTimelineResponse> getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * @param request the request parameters of GetResourceConfigurationTimeline  GetResourceConfigurationTimelineRequest
     * @return GetResourceConfigurationTimelineResponse
     */
    CompletableFuture<GetResourceConfigurationTimelineResponse> getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request);

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
    CompletableFuture<GetResourceInventoryResponse> getResourceInventory(GetResourceInventoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.</p>
     * 
     * @param request the request parameters of GetSupportedResourceRelationConfig  GetSupportedResourceRelationConfigRequest
     * @return GetSupportedResourceRelationConfigResponse
     */
    CompletableFuture<GetSupportedResourceRelationConfigResponse> getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> incompliant resource that is evaluated by using the <code>cr-7e72626622af0051***</code> rule in the <code>120886317861****</code> member account of the <code>ca-5b6c626622af008f****</code> account group. The ID of the region where the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * @param request the request parameters of IgnoreAggregateEvaluationResults  IgnoreAggregateEvaluationResultsRequest
     * @return IgnoreAggregateEvaluationResultsResponse
     */
    CompletableFuture<IgnoreAggregateEvaluationResultsResponse> ignoreAggregateEvaluationResults(IgnoreAggregateEvaluationResultsRequest request);

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> resource that is evaluated as incompliant by using the <code>cr-7e72626622af0051****</code> rule in the <code>100931896542****</code> account. The ID of the region in which the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * @param request the request parameters of IgnoreEvaluationResults  IgnoreEvaluationResultsRequest
     * @return IgnoreEvaluationResultsResponse
     */
    CompletableFuture<IgnoreEvaluationResultsResponse> ignoreEvaluationResults(IgnoreEvaluationResultsRequest request);

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>ca-f632626622af0079****</code> account group is used as an example. The return result shows one compliance package whose ID is <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * @param request the request parameters of ListAggregateCompliancePacks  ListAggregateCompliancePacksRequest
     * @return ListAggregateCompliancePacksResponse
     */
    CompletableFuture<ListAggregateCompliancePacksResponse> listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request);

    /**
     * @param request the request parameters of ListAggregateConfigDeliveryChannels  ListAggregateConfigDeliveryChannelsRequest
     * @return ListAggregateConfigDeliveryChannelsResponse
     */
    CompletableFuture<ListAggregateConfigDeliveryChannelsResponse> listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources based on the <code>cr-888f626622af00ae****</code> rule in the <code>ca-d1e3326622af00cb****</code> account group. The returned result indicates that the <code>Bucket-test</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRuleEvaluationResults  ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    CompletableFuture<ListAggregateConfigRuleEvaluationResultsResponse> listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of compliance evaluation results of an account group whose ID is ca-edd3626622af00b3\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRuleEvaluationStatistics  ListAggregateConfigRuleEvaluationStatisticsRequest
     * @return ListAggregateConfigRuleEvaluationStatisticsResponse
     */
    CompletableFuture<ListAggregateConfigRuleEvaluationStatisticsResponse> listAggregateConfigRuleEvaluationStatistics(ListAggregateConfigRuleEvaluationStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules in an account group whose ID is <code>ca-f632626622af0079****</code>. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as <code>COMPLIANT</code>.</p>
     * 
     * @param request the request parameters of ListAggregateConfigRules  ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     */
    CompletableFuture<ListAggregateConfigRulesResponse> listAggregateConfigRules(ListAggregateConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources within the member account <code>100931896542****</code> of the account group <code>ca-c560626622af0005****</code>. The result indicates that eight resources are queried.</p>
     * 
     * @param request the request parameters of ListAggregateDiscoveredResources  ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     */
    CompletableFuture<ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the <code>cr-d04a626622af00af****</code> rule in the <code>ca-edd3626622af00b3****</code> account group.</p>
     * 
     * @param request the request parameters of ListAggregateRemediationExecutions  ListAggregateRemediationExecutionsRequest
     * @return ListAggregateRemediationExecutionsResponse
     */
    CompletableFuture<ListAggregateRemediationExecutionsResponse> listAggregateRemediationExecutions(ListAggregateRemediationExecutionsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates of the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * @param request the request parameters of ListAggregateRemediations  ListAggregateRemediationsRequest
     * @return ListAggregateRemediationsResponse
     */
    CompletableFuture<ListAggregateRemediationsResponse> listAggregateRemediations(ListAggregateRemediationsRequest request);

    /**
     * <b>description</b> :
     * <p>This example shows how to query the compliance evaluation result of the <code>23642660635396****</code> resource in the <code>ca-7f00626622af0041****</code> account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of ListAggregateResourceEvaluationResults  ListAggregateResourceEvaluationResultsRequest
     * @return ListAggregateResourceEvaluationResultsResponse
     */
    CompletableFuture<ListAggregateResourceEvaluationResultsResponse> listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.</p>
     * 
     * @param request the request parameters of ListAggregateResourceRelations  ListAggregateResourceRelationsRequest
     * @return ListAggregateResourceRelationsResponse
     */
    CompletableFuture<ListAggregateResourceRelationsResponse> listAggregateResourceRelations(ListAggregateResourceRelationsRequest request);

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
    CompletableFuture<ListAggregateResourcesByAdvancedSearchResponse> listAggregateResourcesByAdvancedSearch(ListAggregateResourcesByAdvancedSearchRequest request);

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type, which indicates a custom account group. The account group contains two member accounts.</p>
     * 
     * @param request the request parameters of ListAggregators  ListAggregatorsRequest
     * @return ListAggregatorsResponse
     */
    CompletableFuture<ListAggregatorsResponse> listAggregators(ListAggregatorsRequest request);

    /**
     * <b>description</b> :
     * <p>A compliance package template is a collection of rules that Cloud Config can create based on compliance scenarios.</p>
     * 
     * @param request the request parameters of ListCompliancePackTemplates  ListCompliancePackTemplatesRequest
     * @return ListCompliancePackTemplatesResponse
     */
    CompletableFuture<ListCompliancePackTemplatesResponse> listCompliancePackTemplates(ListCompliancePackTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query compliance packages. The return result shows the details of the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * 
     * @param request the request parameters of ListCompliancePacks  ListCompliancePacksRequest
     * @return ListCompliancePacksResponse
     */
    CompletableFuture<ListCompliancePacksResponse> listCompliancePacks(ListCompliancePacksRequest request);

    /**
     * @param request the request parameters of ListConfigDeliveryChannels  ListConfigDeliveryChannelsRequest
     * @return ListConfigDeliveryChannelsResponse
     */
    CompletableFuture<ListConfigDeliveryChannelsResponse> listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is <code>cr-cac56457e0d900d3****</code>. The returned result indicates that the <code>i-hp3e4kvhzqn2s11t****</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request the request parameters of ListConfigRuleEvaluationResults  ListConfigRuleEvaluationResultsRequest
     * @return ListConfigRuleEvaluationResultsResponse
     */
    CompletableFuture<ListConfigRuleEvaluationResultsResponse> listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request);

    /**
     * @param request the request parameters of ListConfigRuleEvaluationStatistics  ListConfigRuleEvaluationStatisticsRequest
     * @return ListConfigRuleEvaluationStatisticsResponse
     */
    CompletableFuture<ListConfigRuleEvaluationStatisticsResponse> listConfigRuleEvaluationStatistics(ListConfigRuleEvaluationStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules of the current account. The response shows that the current account has a total of one rule and three evaluated resources. The resources are evaluated as compliant.</p>
     * 
     * @param request the request parameters of ListConfigRules  ListConfigRulesRequest
     * @return ListConfigRulesResponse
     */
    CompletableFuture<ListConfigRulesResponse> listConfigRules(ListConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.</p>
     * 
     * @param request the request parameters of ListDiscoveredResources  ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     */
    CompletableFuture<ListDiscoveredResourcesResponse> listDiscoveredResources(ListDiscoveredResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the cloud services that can be integrated by the current Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ListIntegratedService  ListIntegratedServiceRequest
     * @return ListIntegratedServiceResponse
     */
    CompletableFuture<ListIntegratedServiceResponse> listIntegratedService(ListIntegratedServiceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>For more information about how to define, execute, and integrate an evaluation rule, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and execution of evaluation rules</a>.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>This topic provides an example on how to query all managed rules whose keyword is <code>CDN</code>. The response shows that 21 managed rules exist.</p>
     * 
     * @param request the request parameters of ListManagedRules  ListManagedRulesRequest
     * @return ListManagedRulesResponse
     */
    CompletableFuture<ListManagedRulesResponse> listManagedRules(ListManagedRulesRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to define, execute, and integrate an evaluation rule, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and execution of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     * 
     * @param request the request parameters of ListPreManagedRules  ListPreManagedRulesRequest
     * @return ListPreManagedRulesResponse
     */
    CompletableFuture<ListPreManagedRulesResponse> listPreManagedRules(ListPreManagedRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the rule cr-5392626622af0000\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request the request parameters of ListRemediationExecutions  ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     */
    CompletableFuture<ListRemediationExecutionsResponse> listRemediationExecutions(ListRemediationExecutionsRequest request);

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>oss-bucket-public-write-prohibited</code> managed rule is used as an example. The return result shows the details of the remediation template of the <code>OOS</code> type for the managed rule. OOS represents Operation Orchestration Service.</p>
     * 
     * @param request the request parameters of ListRemediationTemplates  ListRemediationTemplatesRequest
     * @return ListRemediationTemplatesResponse
     */
    CompletableFuture<ListRemediationTemplatesResponse> listRemediationTemplates(ListRemediationTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates for the rule whose ID is <code>cr-6b7c626622af00b4****</code>.</p>
     * 
     * @param request the request parameters of ListRemediations  ListRemediationsRequest
     * @return ListRemediationsResponse
     */
    CompletableFuture<ListRemediationsResponse> listRemediations(ListRemediationsRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the compliance evaluation result of the <code>23642660635396****</code> resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * @param request the request parameters of ListResourceEvaluationResults  ListResourceEvaluationResultsRequest
     * @return ListResourceEvaluationResultsResponse
     */
    CompletableFuture<ListResourceEvaluationResultsResponse> listResourceEvaluationResults(ListResourceEvaluationResultsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance within the current Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ListResourceRelations  ListResourceRelationsRequest
     * @return ListResourceRelationsResponse
     */
    CompletableFuture<ListResourceRelationsResponse> listResourceRelations(ListResourceRelationsRequest request);

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
    CompletableFuture<ListResourcesByAdvancedSearchResponse> listResourcesByAdvancedSearch(ListResourcesByAdvancedSearchRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the Alibaba Cloud services and resource types supported by a Cloud Config.</p>
     * 
     * @param request the request parameters of ListSupportedProducts  ListSupportedProductsRequest
     * @return ListSupportedProductsResponse
     */
    CompletableFuture<ListSupportedProductsResponse> listSupportedProducts(ListSupportedProductsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the definition, use scenarios, and execution of custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and execution of custom function rules</a>.</p>
     * 
     * @param request the request parameters of PutEvaluations  PutEvaluationsRequest
     * @return PutEvaluationsResponse
     */
    CompletableFuture<PutEvaluationsResponse> putEvaluations(PutEvaluationsRequest request);

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
    CompletableFuture<RevertAggregateEvaluationResultsResponse> revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request);

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
    CompletableFuture<RevertEvaluationResultsResponse> revertEvaluationResults(RevertEvaluationResultsRequest request);

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
    CompletableFuture<StartAggregateConfigRuleEvaluationResponse> startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The return result shows that the manual execution is successful.</p>
     * 
     * @param request the request parameters of StartAggregateRemediation  StartAggregateRemediationRequest
     * @return StartAggregateRemediationResponse
     */
    CompletableFuture<StartAggregateRemediationResponse> startAggregateRemediation(StartAggregateRemediationRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the cr-9920626622af0035\<em>\</em>\<em>\</em> rule is used to re-evaluate the compliance of resources.</p>
     * 
     * @param request the request parameters of StartConfigRuleEvaluation  StartConfigRuleEvaluationRequest
     * @return StartConfigRuleEvaluationResponse
     */
    CompletableFuture<StartConfigRuleEvaluationResponse> startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to enable Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of StartConfigurationRecorder  StartConfigurationRecorderRequest
     * @return StartConfigurationRecorderResponse
     */
    CompletableFuture<StartConfigurationRecorderResponse> startConfigurationRecorder(StartConfigurationRecorderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to perform a remediation operation by using the rule whose ID is <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that the manual execution is successful.</p>
     * 
     * @param request the request parameters of StartRemediation  StartRemediationRequest
     * @return StartRemediationResponse
     */
    CompletableFuture<StartRemediationResponse> startRemediation(StartRemediationRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After you deactivate Cloud Config, the resource configurations, created rules, and compliance evaluation results that are stored in Cloud Config are automatically cleared and cannot be restored. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StopConfigurationRecorder  StopConfigurationRecorderRequest
     * @return StopConfigurationRecorderResponse
     */
    CompletableFuture<StopConfigurationRecorderResponse> stopConfigurationRecorder(StopConfigurationRecorderRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter in the rule template of the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code> to <code>20</code>.</p>
     * 
     * @param request the request parameters of UpdateAggregateCompliancePack  UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     */
    CompletableFuture<UpdateAggregateCompliancePackResponse> updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>. The Status parameter is set to <code>0</code>. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.</p>
     * 
     * @param request the request parameters of UpdateAggregateConfigDeliveryChannel  UpdateAggregateConfigDeliveryChannelRequest
     * @return UpdateAggregateConfigDeliveryChannelResponse
     */
    CompletableFuture<UpdateAggregateConfigDeliveryChannelResponse> updateAggregateConfigDeliveryChannel(UpdateAggregateConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in an account group <code>ca-a4e5626622af0079****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * @param request the request parameters of UpdateAggregateConfigRule  UpdateAggregateConfigRuleRequest
     * @return UpdateAggregateConfigRuleResponse
     */
    CompletableFuture<UpdateAggregateConfigRuleResponse> updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting for a rule in the <code>ca-6b4a626622af0012****</code> account group to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * @param request the request parameters of UpdateAggregateRemediation  UpdateAggregateRemediationRequest
     * @return UpdateAggregateRemediationResponse
     */
    CompletableFuture<UpdateAggregateRemediationResponse> updateAggregateRemediation(UpdateAggregateRemediationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member ID is <code>173808452267****</code>, the member name is <code>Tony</code>, and the member belongs to the resource directory <code>ResourceDirectory</code>.</p>
     * 
     * @param request the request parameters of UpdateAggregator  UpdateAggregatorRequest
     * @return UpdateAggregatorResponse
     */
    CompletableFuture<UpdateAggregatorResponse> updateAggregator(UpdateAggregatorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter of a rule in the compliance package <code>cp-a8a8626622af0082****</code> to <code>20</code>.</p>
     * 
     * @param request the request parameters of UpdateCompliancePack  UpdateCompliancePackRequest
     * @return UpdateCompliancePackResponse
     */
    CompletableFuture<UpdateCompliancePackResponse> updateCompliancePack(UpdateCompliancePackRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.</p>
     * 
     * @param request the request parameters of UpdateConfigDeliveryChannel  UpdateConfigDeliveryChannelRequest
     * @return UpdateConfigDeliveryChannelResponse
     */
    CompletableFuture<UpdateConfigDeliveryChannelResponse> updateConfigDeliveryChannel(UpdateConfigDeliveryChannelRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * @param request the request parameters of UpdateConfigRule  UpdateConfigRuleRequest
     * @return UpdateConfigRuleResponse
     */
    CompletableFuture<UpdateConfigRuleResponse> updateConfigRule(UpdateConfigRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the resource monitoring scope of the current account to ACS::ECS::Instance.</p>
     * 
     * @param request the request parameters of UpdateConfigurationRecorder  UpdateConfigurationRecorderRequest
     * @return UpdateConfigurationRecorderResponse
     */
    CompletableFuture<UpdateConfigurationRecorderResponse> updateConfigurationRecorder(UpdateConfigurationRecorderRequest request);

    /**
     * @deprecated OpenAPI UpdateDeliveryChannel is deprecated, please use Config::2020-09-07::UpdateConfigDeliveryChannel,Config::2020-09-07::UpdateAggregateConfigDeliveryChannel instead.  * @description This topic provides an example on how to change the status of the delivery channel whose ID is `cdc-8e45ff4e06a3a8****` to 0, which indicates that the delivery channel is disabled. After the delivery channel is disabled, Cloud Config retains the last delivery configuration and stops resource data delivery.
     * 
     * @param request the request parameters of UpdateDeliveryChannel  UpdateDeliveryChannelRequest
     * @return UpdateDeliveryChannelResponse
     */
    @Deprecated
    CompletableFuture<UpdateDeliveryChannelResponse> updateDeliveryChannel(UpdateDeliveryChannelRequest request);

    /**
     * @param request the request parameters of UpdateIntegratedServiceStatus  UpdateIntegratedServiceStatusRequest
     * @return UpdateIntegratedServiceStatusResponse
     */
    CompletableFuture<UpdateIntegratedServiceStatusResponse> updateIntegratedServiceStatus(UpdateIntegratedServiceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * @param request the request parameters of UpdateRemediation  UpdateRemediationRequest
     * @return UpdateRemediationResponse
     */
    CompletableFuture<UpdateRemediationResponse> updateRemediation(UpdateRemediationRequest request);

}
