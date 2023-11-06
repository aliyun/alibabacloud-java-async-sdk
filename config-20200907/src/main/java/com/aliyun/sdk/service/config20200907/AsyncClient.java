// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.config20200907.models.*;
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
      * This topic provides an example on how to enable the `cr-5772ba41209e007b****` rule in the `ca-a4e5626622af0079****` account group.
      *
     */
    CompletableFuture<ActiveAggregateConfigRulesResponse> activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request);

    CompletableFuture<ActiveConfigRulesResponse> activeConfigRules(ActiveConfigRulesRequest request);

    /**
      * The sample request in this topic shows you how to add the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group to the `cp-5bb1626622af00bd****` compliance package.
      *
     */
    CompletableFuture<AttachAggregateConfigRuleToCompliancePackResponse> attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request);

    /**
      * This topic provides an example on how to add the `cr-6cc4626622af00e7****` rule to the `cp-5bb1626622af00bd****` compliance package.
      *
     */
    CompletableFuture<AttachConfigRuleToCompliancePackResponse> attachConfigRuleToCompliancePack(AttachConfigRuleToCompliancePackRequest request);

    CompletableFuture<CopyCompliancePacksResponse> copyCompliancePacks(CopyCompliancePacksRequest request);

    CompletableFuture<CopyConfigRulesResponse> copyConfigRules(CopyConfigRulesRequest request);

    CompletableFuture<CreateAdvancedSearchFileResponse> createAdvancedSearchFile(CreateAdvancedSearchFileRequest request);

    /**
      * This topic provides an example on how to create a downloadable resource file for an account group whose ID is `ca-edd3626622af00b3****`. The resource file includes all the ECS instances in the account group.
      *
     */
    CompletableFuture<CreateAggregateAdvancedSearchFileResponse> createAggregateAdvancedSearchFile(CreateAggregateAdvancedSearchFileRequest request);

    /**
      * You can use your management account to create up to five compliance packages for each account group.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck for the `ca-f632626622af0079****` account group. The compliance package contains the `eip-bandwidth-limit` managed rule.
      *
     */
    CompletableFuture<CreateAggregateCompliancePackResponse> createAggregateCompliancePack(CreateAggregateCompliancePackRequest request);

    /**
      * In this example, a delivery channel is created for an account group. The ID of the account group is `ca-a4e5626622af0079****`. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
     */
    CompletableFuture<CreateAggregateConfigDeliveryChannelResponse> createAggregateConfigDeliveryChannel(CreateAggregateConfigDeliveryChannelRequest request);

    /**
      * ### Limits
      * You can create up to 200 rules for each management account.
      * ### Usage notes
      * This topic provides an example on how to create a rule based on the required-tags managed rule in the `ca-a4e5626622af0079****` account group. The returned result shows that the rule is created and its ID is `cr-4e3d626622af0080****`.
      *
     */
    CompletableFuture<CreateAggregateConfigRuleResponse> createAggregateConfigRule(CreateAggregateConfigRuleRequest request);

    /**
      * This topic provides an example on how to create a remediation template for the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
     */
    CompletableFuture<CreateAggregateRemediationResponse> createAggregateRemediation(CreateAggregateRemediationRequest request);

    /**
      * Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
      * Cloud Config supports the following types of account groups:
      * *   Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.
      * *   Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
      * This topic provides an example on how to create an account group of the `CUSTOM` type. The custom account group is named `Test_Group`, and its description is `Test account group`. The custom account group contains the following two member accounts:
      * *   Member account ID: `171322098523****`. Member account name: `Alice`.
      * *   Member account ID: `100532098349****`. Member account name: `Tom`.
      *
     */
    CompletableFuture<CreateAggregatorResponse> createAggregator(CreateAggregatorRequest request);

    /**
      * Each ordinary account can create up to five compliance packages.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named `eip-bandwidth-limit`.
      *
     */
    CompletableFuture<CreateCompliancePackResponse> createCompliancePack(CreateCompliancePackRequest request);

    /**
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
     */
    CompletableFuture<CreateConfigDeliveryChannelResponse> createConfigDeliveryChannel(CreateConfigDeliveryChannelRequest request);

    /**
      * ### Limits
      * You can use an ordinary account to create up to 200 rules.
      * ### Usage notes
      * This topic provides an example on how to create a managed rule named required-tags. The returned result indicates that the rule is created and the ID of the rule is `cr-5772ba41209e007b****`.
      *
     */
    CompletableFuture<CreateConfigRuleResponse> createConfigRule(CreateConfigRuleRequest request);

    /**
      * @deprecated
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS`, the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`, and the ARN of the role that is assigned to the delivery channel is `acs:ram::100931896542****:role/aliyunserviceroleforconfig`. The returned result shows that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
     */
    CompletableFuture<CreateDeliveryChannelResponse> createDeliveryChannel(CreateDeliveryChannelRequest request);

    /**
      * This topic provides an example on how to create a remediation template for the rule `cr-8a973ac2e2be00a2****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
     */
    CompletableFuture<CreateRemediationResponse> createRemediation(CreateRemediationRequest request);

    /**
      * This topic provides an example on how to disable the `cr-5772ba41209e007b****` rule in the `ca-04b3fd170e340007****` account group.
      *
     */
    CompletableFuture<DeactiveAggregateConfigRulesResponse> deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request);

    /**
      * In this example, the `cr-19a56457e0d90058****` rule is used.
      *
     */
    CompletableFuture<DeactiveConfigRulesResponse> deactiveConfigRules(DeactiveConfigRulesRequest request);

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package from the `ca-04b3fd170e340007****` account group.
      *
     */
    CompletableFuture<DeleteAggregateCompliancePacksResponse> deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request);

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel from the `ca-23c6626622af0041****` account group. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
     */
    CompletableFuture<DeleteAggregateConfigDeliveryChannelResponse> deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request);

    /**
      * ### Background information
      * You can delete a rule in the Cloud Config console. After you delete the rule, the configurations of the rule are deleted.
      * ### Usage notes
      * This topic provides an example on how to delete the `cr-4e3d626622af0080****` rule from the `ca-a4e5626622af0079****` account group.
      *
     */
    CompletableFuture<DeleteAggregateConfigRulesResponse> deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request);

    /**
      * This topic provides an example on how to delete the remediation template whose ID is `crr-909ba2d4716700eb****` from the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
     */
    CompletableFuture<DeleteAggregateRemediationsResponse> deleteAggregateRemediations(DeleteAggregateRemediationsRequest request);

    /**
      * This topic provides an example on how to delete the account group whose ID is `ca-9190626622af00a9****`.
      *
     */
    CompletableFuture<DeleteAggregatorsResponse> deleteAggregators(DeleteAggregatorsRequest request);

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package.
      *
     */
    CompletableFuture<DeleteCompliancePacksResponse> deleteCompliancePacks(DeleteCompliancePacksRequest request);

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
     */
    CompletableFuture<DeleteConfigDeliveryChannelResponse> deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request);

    /**
      * In this example, the rule whose ID is cr-9908626622af0035\\*\\*\\*\\* is deleted.
      *
     */
    CompletableFuture<DeleteConfigRulesResponse> deleteConfigRules(DeleteConfigRulesRequest request);

    /**
      * This topic provides an example on how to delete the remediation template `crr-909ba2d4716700eb****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
     */
    CompletableFuture<DeleteRemediationsResponse> deleteRemediations(DeleteRemediationsRequest request);

    CompletableFuture<DescribeRemediationResponse> describeRemediation(DescribeRemediationRequest request);

    /**
      * ### Prerequisites
      * One or more rules are added to a compliance package.
      * ### Usage notes
      * The sample request in this topic shows you how to remove the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group from the `cp-5bb1626622af00bd****` compliance package.
      *
     */
    CompletableFuture<DetachAggregateConfigRuleToCompliancePackResponse> detachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest request);

    /**
      * ### Prerequisites
      * One or more rules are added to a compliance package.
      * ### Usage notes
      * This topic provides an example on how to remove the `cr-6cc4626622af00e7****` rule from the `cp-5bb1626622af00bd****` compliance package.
      *
     */
    CompletableFuture<DetachConfigRuleToCompliancePackResponse> detachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest request);

    CompletableFuture<EvaluatePreConfigRulesResponse> evaluatePreConfigRules(EvaluatePreConfigRulesRequest request);

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateCompliancePackReport](~~262699~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
     */
    CompletableFuture<GenerateAggregateCompliancePackReportResponse> generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request);

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateConfigRulesReport](~~262706~~).
      * The topic provides an example on how to generate a compliance evaluation report based on all rules in the `ca-f632626622af0079****` account group.
      *
     */
    CompletableFuture<GenerateAggregateConfigRulesReportResponse> generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request);

    /**
      * This topic provides an example to show how to generate a downloadable inventory for global resources in the account group ca-a91d626622af0035\\*\\*\\*\\*.
      *
     */
    CompletableFuture<GenerateAggregateResourceInventoryResponse> generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request);

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see [GetCompliancePackReport](~~263347~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-a8a8626622af0082****` compliance package.
      *
     */
    CompletableFuture<GenerateCompliancePackReportResponse> generateCompliancePackReport(GenerateCompliancePackReportRequest request);

    /**
      * >  You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see [GetConfigRulesReport](~~263608~~).
      * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.
      *
     */
    CompletableFuture<GenerateConfigRulesReportResponse> generateConfigRulesReport(GenerateConfigRulesReportRequest request);

    /**
      * This topic provides an example on how to generate a resource inventory for global resources of the current account.
      *
     */
    CompletableFuture<GenerateResourceInventoryResponse> generateResourceInventory(GenerateResourceInventoryRequest request);

    CompletableFuture<GetAdvancedSearchFileResponse> getAdvancedSearchFile(GetAdvancedSearchFileRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation results of member accounts for which the `cp-541e626622af0087****` compliance package takes effect in the `ca-04b3fd170e340007****` account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.
      *
     */
    CompletableFuture<GetAggregateAccountComplianceByPackResponse> getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request);

    CompletableFuture<GetAggregateAdvancedSearchFileResponse> getAggregateAdvancedSearchFile(GetAggregateAdvancedSearchFileRequest request);

    /**
      * The topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****` in an account group whose ID is `ca-f632626622af0079****`.
      *
     */
    CompletableFuture<GetAggregateCompliancePackResponse> getAggregateCompliancePack(GetAggregateCompliancePackRequest request);

    /**
      * > Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateAggregateCompliancePackReport](~~262687~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
     */
    CompletableFuture<GetAggregateCompliancePackReportResponse> getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request);

    /**
      * This topic provides an example on how to query the compliance statistics of resources and rules in the account group ca-a91d626622af0035\\*\\*\\*\\*.
      *
     */
    CompletableFuture<GetAggregateComplianceSummaryResponse> getAggregateComplianceSummary(GetAggregateComplianceSummaryRequest request);

    CompletableFuture<GetAggregateConfigDeliveryChannelResponse> getAggregateConfigDeliveryChannel(GetAggregateConfigDeliveryChannelRequest request);

    /**
      * This example shows how to query the details of the `cr-7f7d626622af0041****` rule in the `ca-7f00626622af0041****` account group.
      *
     */
    CompletableFuture<GetAggregateConfigRuleResponse> getAggregateConfigRule(GetAggregateConfigRuleRequest request);

    /**
      * The sample request in this topic shows you how to query the compliance evaluation results based on rules in the `cp-541e626622af0087****` compliance package that is created for the `ca-04b3fd170e340007****` account group. The return result shows a total of `one` rule. `No resources` are evaluated as non-compliant based on the rule.
      *
     */
    CompletableFuture<GetAggregateConfigRuleComplianceByPackResponse> getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request);

    /**
      * This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the `ca-3a58626622af0005****` account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.
      *
     */
    CompletableFuture<GetAggregateConfigRuleSummaryByRiskLevelResponse> getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request);

    /**
      * > Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see [GenerateAggregateConfigRulesReport](~~262701~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the `ca-f632626622af0079****` account group.
      *
     */
    CompletableFuture<GetAggregateConfigRulesReportResponse> getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request);

    /**
      * This topic provides an example on how to query the `new-bucket` resource in the `ca-5885626622af0008****` account group.
      *
     */
    CompletableFuture<GetAggregateDiscoveredResourceResponse> getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation results based on the `cr-d369626622af008e****` rule in the `ca-a4e5626622af0079****` account group. The returned result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.
      *
     */
    CompletableFuture<GetAggregateResourceComplianceByConfigRuleResponse> getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****`account group. The returned result shows that the total number of monitored resources is `10` and the number of non-compliant resources is `7`.
      *
     */
    CompletableFuture<GetAggregateResourceComplianceByPackResponse> getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request);

    CompletableFuture<GetAggregateResourceComplianceGroupByRegionResponse> getAggregateResourceComplianceGroupByRegion(GetAggregateResourceComplianceGroupByRegionRequest request);

    CompletableFuture<GetAggregateResourceComplianceGroupByResourceTypeResponse> getAggregateResourceComplianceGroupByResourceType(GetAggregateResourceComplianceGroupByResourceTypeRequest request);

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
     */
    CompletableFuture<GetAggregateResourceComplianceTimelineResponse> getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request);

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
     */
    CompletableFuture<GetAggregateResourceConfigurationTimelineResponse> getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request);

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group named `ca-a260626622af0005****` by region. The returned result shows that a total of `10` resources exist in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<GetAggregateResourceCountsGroupByRegionResponse> getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request);

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group whose ID is `ca-a260626622af0005****` by resource type. The returned result shows that the account group has a total of `seven` resources of the `ACS::RAM::Role` resource type.
      *
     */
    CompletableFuture<GetAggregateResourceCountsGroupByResourceTypeResponse> getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request);

    /**
      * This topic provides an example on how to query the most recently generated resource inventory of an account group whose ID is ca-a91d626622af0035\\*\\*\\*\\*.
      *
     */
    CompletableFuture<GetAggregateResourceInventoryResponse> getAggregateResourceInventory(GetAggregateResourceInventoryRequest request);

    /**
      * The sample request in this topic shows you how to query the details of the `ca-88ea626622af0055****` account group. The return result shows that the account group is named `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type. The account group is in the `1` state, which indicates that it is created.
      *
     */
    CompletableFuture<GetAggregatorResponse> getAggregator(GetAggregatorRequest request);

    /**
      * This topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****`. The returned result shows that the name of the compliance package is `ClassifiedProtectionPreCheck`, the compliance package is in the `ACTIVE` state, and the risk level of the rules in the compliance package is `1`, which indicates high risk level.
      *
     */
    CompletableFuture<GetCompliancePackResponse> getCompliancePack(GetCompliancePackRequest request);

    /**
      * > Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateCompliancePackReport](~~263525~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package.
      *
     */
    CompletableFuture<GetCompliancePackReportResponse> getCompliancePackReport(GetCompliancePackReportRequest request);

    /**
      * This topic provides an example on how to query the compliance statistics of resources and rules in the current account group.
      *
     */
    CompletableFuture<GetComplianceSummaryResponse> getComplianceSummary(GetComplianceSummaryRequest request);

    CompletableFuture<GetConfigDeliveryChannelResponse> getConfigDeliveryChannel(GetConfigDeliveryChannelRequest request);

    /**
      * This topic provides an example on how to query the details of the `cr-7f7d626622af0041****` rule.
      *
     */
    CompletableFuture<GetConfigRuleResponse> getConfigRule(GetConfigRuleRequest request);

    /**
      * In this topic, the `cp-541e626622af0087****` compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.
      *
     */
    CompletableFuture<GetConfigRuleComplianceByPackResponse> getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request);

    /**
      * This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.
      *
     */
    CompletableFuture<GetConfigRuleSummaryByRiskLevelResponse> getConfigRuleSummaryByRiskLevel(GetConfigRuleSummaryByRiskLevelRequest request);

    /**
      * >  Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see [GenerateConfigRulesReport](~~263601~~).
      * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.
      *
     */
    CompletableFuture<GetConfigRulesReportResponse> getConfigRulesReport(GetConfigRulesReportRequest request);

    /**
      * This topic provides an example on how to query the activation status and resource monitoring scope of Cloud Config for the current account.
      *
     */
    CompletableFuture<GetConfigurationRecorderResponse> getConfigurationRecorder(GetConfigurationRecorderRequest request);

    /**
      * The sample request in this topic shows you how to query the details of the `new-bucket` resource.
      *
     */
    CompletableFuture<GetDiscoveredResourceResponse> getDiscoveredResource(GetDiscoveredResourceRequest request);

    /**
      * This topic provides an example to demonstrate how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<GetDiscoveredResourceCountsGroupByRegionResponse> getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request);

    /**
      * This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the `ACS::ECS::Instance` resource type exist.
      *
     */
    CompletableFuture<GetDiscoveredResourceCountsGroupByResourceTypeResponse> getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request);

    CompletableFuture<GetIntegratedServiceStatusResponse> getIntegratedServiceStatus(GetIntegratedServiceStatusRequest request);

    /**
      * In this topic, the `cdn-domain-https-enabled` managed rule is used as an example.
      *
     */
    CompletableFuture<GetManagedRuleResponse> getManagedRule(GetManagedRuleRequest request);

    /**
      * This topic provides an example on how to query the details of the automatic remediation template ACS-ALB-BulkyEnableDeletionProtection.
      *
     */
    CompletableFuture<GetRemediationTemplateResponse> getRemediationTemplate(GetRemediationTemplateRequest request);

    /**
      * In this topic, the `cr-d369626622af008e****` rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and `five` of them are evaluated as compliant.
      *
     */
    CompletableFuture<GetResourceComplianceByConfigRuleResponse> getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored by using the `cp-541e626622af0087****` compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.
      *
     */
    CompletableFuture<GetResourceComplianceByPackResponse> getResourceComplianceByPack(GetResourceComplianceByPackRequest request);

    CompletableFuture<GetResourceComplianceGroupByRegionResponse> getResourceComplianceGroupByRegion(GetResourceComplianceGroupByRegionRequest request);

    CompletableFuture<GetResourceComplianceGroupByResourceTypeResponse> getResourceComplianceGroupByResourceType(GetResourceComplianceGroupByResourceTypeRequest request);

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
     */
    CompletableFuture<GetResourceComplianceTimelineResponse> getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request);

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
     */
    CompletableFuture<GetResourceConfigurationTimelineResponse> getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request);

    /**
      * This topic provides an example on how to query the most recently generated resource inventory of the current Alibaba Cloud account.
      *
     */
    CompletableFuture<GetResourceInventoryResponse> getResourceInventory(GetResourceInventoryRequest request);

    /**
      * This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.
      *
     */
    CompletableFuture<GetSupportedResourceRelationConfigResponse> getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request);

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` incompliant resource that is evaluated by using the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region where the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
     */
    CompletableFuture<IgnoreAggregateEvaluationResultsResponse> ignoreAggregateEvaluationResults(IgnoreAggregateEvaluationResultsRequest request);

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` resource that is evaluated as incompliant by using the `cr-7e72626622af0051****` rule in the `100931896542****` account. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
     */
    CompletableFuture<IgnoreEvaluationResultsResponse> ignoreEvaluationResults(IgnoreEvaluationResultsRequest request);

    /**
      * In this topic, the `ca-f632626622af0079****` account group is used as an example. The return result shows one compliance package whose ID is `cp-fdc8626622af00f9****`.
      *
     */
    CompletableFuture<ListAggregateCompliancePacksResponse> listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request);

    CompletableFuture<ListAggregateConfigDeliveryChannelsResponse> listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources based on the `cr-888f626622af00ae****` rule in the `ca-d1e3326622af00cb****` account group. The returned result indicates that the `Bucket-test` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Object Storage Service (OSS) bucket.
      *
     */
    CompletableFuture<ListAggregateConfigRuleEvaluationResultsResponse> listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request);

    /**
      * This topic provides an example on how to query the statistics of compliance evaluation results of an account group whose ID is ca-edd3626622af00b3\\*\\*\\*\\*.
      *
     */
    CompletableFuture<ListAggregateConfigRuleEvaluationStatisticsResponse> listAggregateConfigRuleEvaluationStatistics(ListAggregateConfigRuleEvaluationStatisticsRequest request);

    /**
      * This topic provides an example on how to query the rules in an account group whose ID is `ca-f632626622af0079****`. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as `COMPLIANT`.
      *
     */
    CompletableFuture<ListAggregateConfigRulesResponse> listAggregateConfigRules(ListAggregateConfigRulesRequest request);

    /**
      * This topic provides an example on how to query a list of resources in the `ca-c560626622af0005****` account group. The returned result shows that eight resources exist in the account group.
      *
     */
    CompletableFuture<ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request);

    /**
      * This topic provides an example on how to query the remediation records of the `cr-d04a626622af00af****` rule in the `ca-edd3626622af00b3****` account group.
      *
     */
    CompletableFuture<ListAggregateRemediationExecutionsResponse> listAggregateRemediationExecutions(ListAggregateRemediationExecutionsRequest request);

    /**
      * This topic provides an example on how to query the remediation templates of the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`.
      *
     */
    CompletableFuture<ListAggregateRemediationsResponse> listAggregateRemediations(ListAggregateRemediationsRequest request);

    /**
      * This example shows how to query the compliance evaluation result of the `23642660635396****` resource in the `ca-7f00626622af0041****` account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
     */
    CompletableFuture<ListAggregateResourceEvaluationResultsResponse> listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request);

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.
      *
     */
    CompletableFuture<ListAggregateResourceRelationsResponse> listAggregateResourceRelations(ListAggregateResourceRelationsRequest request);

    CompletableFuture<ListAggregateResourcesByAdvancedSearchResponse> listAggregateResourcesByAdvancedSearch(ListAggregateResourcesByAdvancedSearchRequest request);

    /**
      * The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type, which indicates a custom account group. The account group contains two member accounts.
      *
     */
    CompletableFuture<ListAggregatorsResponse> listAggregators(ListAggregatorsRequest request);

    /**
      * This topic provides an example on how to query the details of a compliance package template whose ID is `ct-d254ff4e06a300cf****`. The returned result indicates that the template name is `BestPracticesForNetwork`, the template ID is `ct-d254ff4e06a300cf****`, and the ID of the managed rule of the template is `slb-servercertificate-expired-check`.
      *
     */
    CompletableFuture<ListCompliancePackTemplatesResponse> listCompliancePackTemplates(ListCompliancePackTemplatesRequest request);

    /**
      * This topic provides an example of how to query compliance packages. The return result shows the details of the `cp-fdc8626622af00f9****` compliance package.
      *
     */
    CompletableFuture<ListCompliancePacksResponse> listCompliancePacks(ListCompliancePacksRequest request);

    CompletableFuture<ListConfigDeliveryChannelsResponse> listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request);

    /**
      * This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is `cr-cac56457e0d900d3****`. The returned result indicates that the `i-hp3e4kvhzqn2s11t****` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Elastic Compute Service (ECS) instance.
      *
     */
    CompletableFuture<ListConfigRuleEvaluationResultsResponse> listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request);

    CompletableFuture<ListConfigRuleEvaluationStatisticsResponse> listConfigRuleEvaluationStatistics(ListConfigRuleEvaluationStatisticsRequest request);

    /**
      * This topic provides an example on how to query the rules of the current account. The response shows that the current account has a total of one rule and three evaluated resources. The resources are evaluated as compliant.
      *
     */
    CompletableFuture<ListConfigRulesResponse> listConfigRules(ListConfigRulesRequest request);

    /**
      * This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.
      *
     */
    CompletableFuture<ListDiscoveredResourcesResponse> listDiscoveredResources(ListDiscoveredResourcesRequest request);

    /**
      * This topic provides an example on how to query the cloud services that can be integrated by the current Alibaba Cloud account.
      *
     */
    CompletableFuture<ListIntegratedServiceResponse> listIntegratedService(ListIntegratedServiceRequest request);

    /**
      * This topic describes how to query the managed rules of Alibaba Cloud CDN by using the `CDN` keyword. The returned result shows that only one managed rule exists. You can view the rule details in the result.
      *
     */
    CompletableFuture<ListManagedRulesResponse> listManagedRules(ListManagedRulesRequest request);

    CompletableFuture<ListPreManagedRulesResponse> listPreManagedRules(ListPreManagedRulesRequest request);

    /**
      * This topic provides an example on how to query the remediation records of the rule cr-5392626622af0000\\*\\*\\*\\*.
      *
     */
    CompletableFuture<ListRemediationExecutionsResponse> listRemediationExecutions(ListRemediationExecutionsRequest request);

    /**
      * In this topic, the `oss-bucket-public-write-prohibited` managed rule is used as an example. The return result shows the details of the remediation template of the `OOS` type for the managed rule. OOS represents Operation Orchestration Service.
      *
     */
    CompletableFuture<ListRemediationTemplatesResponse> listRemediationTemplates(ListRemediationTemplatesRequest request);

    /**
      * This topic provides an example on how to query the remediation templates for the rule whose ID is `cr-6b7c626622af00b4****`.
      *
     */
    CompletableFuture<ListRemediationsResponse> listRemediations(ListRemediationsRequest request);

    /**
      * In this example, the compliance evaluation result of the `23642660635396****` resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
     */
    CompletableFuture<ListResourceEvaluationResultsResponse> listResourceEvaluationResults(ListResourceEvaluationResultsRequest request);

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance within the current Alibaba Cloud account.
      *
     */
    CompletableFuture<ListResourceRelationsResponse> listResourceRelations(ListResourceRelationsRequest request);

    /**
      * This topic provides an example on how to query all resources with the business tag key and the online tag value in the current Alibaba Cloud account.
      *
     */
    CompletableFuture<ListResourcesByAdvancedSearchResponse> listResourcesByAdvancedSearch(ListResourcesByAdvancedSearchRequest request);

    /**
      * This topic provides an example on how to query the cloud services and resource types that are supported by Cloud Config.
      *
     */
    CompletableFuture<ListSupportedProductsResponse> listSupportedProducts(ListSupportedProductsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<PutEvaluationsResponse> putEvaluations(PutEvaluationsRequest request);

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated based on a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
     */
    CompletableFuture<RevertAggregateEvaluationResultsResponse> revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request);

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated by a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051****` rule. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.``
      *
     */
    CompletableFuture<RevertEvaluationResultsResponse> revertEvaluationResults(RevertEvaluationResultsRequest request);

    /**
      * > After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see [ListAggregateConfigRuleEvaluationResults](~~265979~~).
      * The sample request in this topic shows how to use the `cr-c169626622af009f****` rule in the `ca-3a58626622af0005****` account group to evaluate resources.
      *
     */
    CompletableFuture<StartAggregateConfigRuleEvaluationResponse> startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request);

    /**
      * This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The return result shows that the manual execution is successful.
      *
     */
    CompletableFuture<StartAggregateRemediationResponse> startAggregateRemediation(StartAggregateRemediationRequest request);

    /**
      * In this example, the cr-9920626622af0035\\*\\*\\*\\* rule is used to re-evaluate the compliance of resources.
      *
     */
    CompletableFuture<StartConfigRuleEvaluationResponse> startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request);

    /**
      * This topic provides an example on how to enable Cloud Config to monitor the resources of your Alibaba Cloud account.
      *
     */
    CompletableFuture<StartConfigurationRecorderResponse> startConfigurationRecorder(StartConfigurationRecorderRequest request);

    /**
      * This topic provides an example on how to perform a remediation operation by using the rule whose ID is `cr-8a973ac2e2be00a2****`. The returned result shows that the manual execution is successful.
      *
     */
    CompletableFuture<StartRemediationResponse> startRemediation(StartRemediationRequest request);

    CompletableFuture<StopConfigurationRecorderResponse> stopConfigurationRecorder(StopConfigurationRecorderRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
     */
    CompletableFuture<UpdateAggregateCompliancePackResponse> updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request);

    /**
      * This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is `ca-a4e5626622af0079****`, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`. The Status parameter is set to `0`. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.
      *
     */
    CompletableFuture<UpdateAggregateConfigDeliveryChannelResponse> updateAggregateConfigDeliveryChannel(UpdateAggregateConfigDeliveryChannelRequest request);

    /**
      * The sample request in this topic shows you how to change the risk level specified for the `cr-4e3d626622af0080****` managed rule to `3`, which indicates low risk level, in the `ca-a4e5626622af0079****` account group.
      *
     */
    CompletableFuture<UpdateAggregateConfigRuleResponse> updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request);

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting for a rule in the `ca-6b4a626622af0012****` account group to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
     */
    CompletableFuture<UpdateAggregateRemediationResponse> updateAggregateRemediation(UpdateAggregateRemediationRequest request);

    /**
      * The sample request in this topic shows you how to add a member account to the account group whose ID is `ca-dacf86d8314e00eb****`. The member account ID is `173808452267****` and the member account name is `Tony`. The member account belongs to `ResourceDirectory`.
      *
     */
    CompletableFuture<UpdateAggregatorResponse> updateAggregator(UpdateAggregatorRequest request);

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-a8a8626622af0082****` compliance package.
      *
     */
    CompletableFuture<UpdateCompliancePackResponse> updateCompliancePack(UpdateCompliancePackRequest request);

    /**
      * In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.
      *
     */
    CompletableFuture<UpdateConfigDeliveryChannelResponse> updateConfigDeliveryChannel(UpdateConfigDeliveryChannelRequest request);

    /**
      * This topic provides an example on how to change the risk level of a managed rule whose ID is `cr-a260626622af0005****` to `3` (low risk level).
      *
     */
    CompletableFuture<UpdateConfigRuleResponse> updateConfigRule(UpdateConfigRuleRequest request);

    /**
      * This topic provides an example on how to change the resource monitoring scope of the current account to ACS::ECS::Instance.
      *
     */
    CompletableFuture<UpdateConfigurationRecorderResponse> updateConfigurationRecorder(UpdateConfigurationRecorderRequest request);

    /**
      * @deprecated
      * This topic provides an example on how to change the status of the delivery channel whose ID is `cdc-8e45ff4e06a3a8****` to 0, which indicates that the delivery channel is disabled. After the delivery channel is disabled, Cloud Config retains the last delivery configuration and stops resource data delivery.
      *
     */
    CompletableFuture<UpdateDeliveryChannelResponse> updateDeliveryChannel(UpdateDeliveryChannelRequest request);

    CompletableFuture<UpdateIntegratedServiceStatusResponse> updateIntegratedServiceStatus(UpdateIntegratedServiceStatusRequest request);

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
     */
    CompletableFuture<UpdateRemediationResponse> updateRemediation(UpdateRemediationRequest request);

}
