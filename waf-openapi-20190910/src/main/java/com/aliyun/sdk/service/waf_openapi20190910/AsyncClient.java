// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.waf_openapi20190910.models.*;
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

    CompletableFuture<CreateCertificateResponse> createCertificate(CreateCertificateRequest request);

    CompletableFuture<CreateCertificateByCertificateIdResponse> createCertificateByCertificateId(CreateCertificateByCertificateIdRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateProtectionModuleRuleResponse> createProtectionModuleRule(CreateProtectionModuleRuleRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteProtectionModuleRuleResponse> deleteProtectionModuleRule(DeleteProtectionModuleRuleRequest request);

    CompletableFuture<DescribeCertMatchStatusResponse> describeCertMatchStatus(DescribeCertMatchStatusRequest request);

    CompletableFuture<DescribeCertificatesResponse> describeCertificates(DescribeCertificatesRequest request);

    CompletableFuture<DescribeDomainResponse> describeDomain(DescribeDomainRequest request);

    CompletableFuture<DescribeDomainAdvanceConfigsResponse> describeDomainAdvanceConfigs(DescribeDomainAdvanceConfigsRequest request);

    CompletableFuture<DescribeDomainBasicConfigsResponse> describeDomainBasicConfigs(DescribeDomainBasicConfigsRequest request);

    CompletableFuture<DescribeDomainListResponse> describeDomainList(DescribeDomainListRequest request);

    CompletableFuture<DescribeDomainNamesResponse> describeDomainNames(DescribeDomainNamesRequest request);

    CompletableFuture<DescribeDomainRuleGroupResponse> describeDomainRuleGroup(DescribeDomainRuleGroupRequest request);

    CompletableFuture<DescribeInstanceInfoResponse> describeInstanceInfo(DescribeInstanceInfoRequest request);

    CompletableFuture<DescribeInstanceSpecInfoResponse> describeInstanceSpecInfo(DescribeInstanceSpecInfoRequest request);

    CompletableFuture<DescribeLogServiceStatusResponse> describeLogServiceStatus(DescribeLogServiceStatusRequest request);

    CompletableFuture<DescribeProtectionModuleCodeConfigResponse> describeProtectionModuleCodeConfig(DescribeProtectionModuleCodeConfigRequest request);

    CompletableFuture<DescribeProtectionModuleModeResponse> describeProtectionModuleMode(DescribeProtectionModuleModeRequest request);

    CompletableFuture<DescribeProtectionModuleRulesResponse> describeProtectionModuleRules(DescribeProtectionModuleRulesRequest request);

    CompletableFuture<DescribeProtectionModuleStatusResponse> describeProtectionModuleStatus(DescribeProtectionModuleStatusRequest request);

    CompletableFuture<DescribeRuleGroupsResponse> describeRuleGroups(DescribeRuleGroupsRequest request);

    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    CompletableFuture<DescribeWafSourceIpSegmentResponse> describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request);

    CompletableFuture<ModifyDomainResponse> modifyDomain(ModifyDomainRequest request);

    CompletableFuture<ModifyDomainIpv6StatusResponse> modifyDomainIpv6Status(ModifyDomainIpv6StatusRequest request);

    CompletableFuture<ModifyLogRetrievalStatusResponse> modifyLogRetrievalStatus(ModifyLogRetrievalStatusRequest request);

    CompletableFuture<ModifyLogServiceStatusResponse> modifyLogServiceStatus(ModifyLogServiceStatusRequest request);

    CompletableFuture<ModifyProtectionModuleModeResponse> modifyProtectionModuleMode(ModifyProtectionModuleModeRequest request);

    CompletableFuture<ModifyProtectionModuleRuleResponse> modifyProtectionModuleRule(ModifyProtectionModuleRuleRequest request);

    CompletableFuture<ModifyProtectionModuleStatusResponse> modifyProtectionModuleStatus(ModifyProtectionModuleStatusRequest request);

    CompletableFuture<ModifyProtectionRuleCacheStatusResponse> modifyProtectionRuleCacheStatus(ModifyProtectionRuleCacheStatusRequest request);

    CompletableFuture<ModifyProtectionRuleStatusResponse> modifyProtectionRuleStatus(ModifyProtectionRuleStatusRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<SetDomainRuleGroupResponse> setDomainRuleGroup(SetDomainRuleGroupRequest request);

}
