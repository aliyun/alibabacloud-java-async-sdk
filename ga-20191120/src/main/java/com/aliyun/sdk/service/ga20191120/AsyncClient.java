// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ga20191120.models.*;
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

    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    CompletableFuture<AttachDdosToAcceleratorResponse> attachDdosToAccelerator(AttachDdosToAcceleratorRequest request);

    CompletableFuture<AttachLogStoreToEndpointGroupResponse> attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request);

    CompletableFuture<BandwidthPackageAddAcceleratorResponse> bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request);

    CompletableFuture<BandwidthPackageRemoveAcceleratorResponse> bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request);

    CompletableFuture<ConfigEndpointProbeResponse> configEndpointProbe(ConfigEndpointProbeRequest request);

    CompletableFuture<CreateAcceleratorResponse> createAccelerator(CreateAcceleratorRequest request);

    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    CompletableFuture<CreateApplicationMonitorResponse> createApplicationMonitor(CreateApplicationMonitorRequest request);

    CompletableFuture<CreateBandwidthPackageResponse> createBandwidthPackage(CreateBandwidthPackageRequest request);

    CompletableFuture<CreateBasicAcceleratorResponse> createBasicAccelerator(CreateBasicAcceleratorRequest request);

    CompletableFuture<CreateBasicEndpointGroupResponse> createBasicEndpointGroup(CreateBasicEndpointGroupRequest request);

    CompletableFuture<CreateBasicIpSetResponse> createBasicIpSet(CreateBasicIpSetRequest request);

    CompletableFuture<CreateEndpointGroupResponse> createEndpointGroup(CreateEndpointGroupRequest request);

    CompletableFuture<CreateEndpointGroupsResponse> createEndpointGroups(CreateEndpointGroupsRequest request);

    CompletableFuture<CreateForwardingRulesResponse> createForwardingRules(CreateForwardingRulesRequest request);

    CompletableFuture<CreateIpSetsResponse> createIpSets(CreateIpSetsRequest request);

    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    CompletableFuture<CreateSpareIpResponse> createSpareIp(CreateSpareIpRequest request);

    CompletableFuture<CreateSpareIpsResponse> createSpareIps(CreateSpareIpsRequest request);

    CompletableFuture<DeleteAcceleratorResponse> deleteAccelerator(DeleteAcceleratorRequest request);

    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    CompletableFuture<DeleteApplicationMonitorResponse> deleteApplicationMonitor(DeleteApplicationMonitorRequest request);

    CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request);

    CompletableFuture<DeleteBasicAcceleratorResponse> deleteBasicAccelerator(DeleteBasicAcceleratorRequest request);

    CompletableFuture<DeleteBasicEndpointGroupResponse> deleteBasicEndpointGroup(DeleteBasicEndpointGroupRequest request);

    CompletableFuture<DeleteBasicIpSetResponse> deleteBasicIpSet(DeleteBasicIpSetRequest request);

    CompletableFuture<DeleteEndpointGroupResponse> deleteEndpointGroup(DeleteEndpointGroupRequest request);

    CompletableFuture<DeleteEndpointGroupsResponse> deleteEndpointGroups(DeleteEndpointGroupsRequest request);

    CompletableFuture<DeleteForwardingRuleResponse> deleteForwardingRule(DeleteForwardingRuleRequest request);

    CompletableFuture<DeleteForwardingRulesResponse> deleteForwardingRules(DeleteForwardingRulesRequest request);

    CompletableFuture<DeleteIpSetResponse> deleteIpSet(DeleteIpSetRequest request);

    CompletableFuture<DeleteIpSetsResponse> deleteIpSets(DeleteIpSetsRequest request);

    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    CompletableFuture<DeleteSpareIpResponse> deleteSpareIp(DeleteSpareIpRequest request);

    CompletableFuture<DeleteSpareIpsResponse> deleteSpareIps(DeleteSpareIpsRequest request);

    CompletableFuture<DescribeAcceleratorResponse> describeAccelerator(DescribeAcceleratorRequest request);

    CompletableFuture<DescribeAcceleratorAutoRenewAttributeResponse> describeAcceleratorAutoRenewAttribute(DescribeAcceleratorAutoRenewAttributeRequest request);

    CompletableFuture<DescribeApplicationMonitorResponse> describeApplicationMonitor(DescribeApplicationMonitorRequest request);

    CompletableFuture<DescribeBandwidthPackageResponse> describeBandwidthPackage(DescribeBandwidthPackageRequest request);

    CompletableFuture<DescribeEndpointGroupResponse> describeEndpointGroup(DescribeEndpointGroupRequest request);

    CompletableFuture<DescribeIpSetResponse> describeIpSet(DescribeIpSetRequest request);

    CompletableFuture<DescribeListenerResponse> describeListener(DescribeListenerRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSpareIpResponse> describeSpareIp(DescribeSpareIpRequest request);

    CompletableFuture<DetachDdosFromAcceleratorResponse> detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request);

    CompletableFuture<DetachLogStoreFromEndpointGroupResponse> detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request);

    CompletableFuture<DetectApplicationMonitorResponse> detectApplicationMonitor(DetectApplicationMonitorRequest request);

    CompletableFuture<DisableApplicationMonitorResponse> disableApplicationMonitor(DisableApplicationMonitorRequest request);

    CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request);

    CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request);

    CompletableFuture<DissociateAdditionalCertificatesWithListenerResponse> dissociateAdditionalCertificatesWithListener(DissociateAdditionalCertificatesWithListenerRequest request);

    CompletableFuture<EnableApplicationMonitorResponse> enableApplicationMonitor(EnableApplicationMonitorRequest request);

    CompletableFuture<GetAclResponse> getAcl(GetAclRequest request);

    CompletableFuture<GetBasicAcceleratorResponse> getBasicAccelerator(GetBasicAcceleratorRequest request);

    CompletableFuture<GetBasicEndpointGroupResponse> getBasicEndpointGroup(GetBasicEndpointGroupRequest request);

    CompletableFuture<GetBasicIpSetResponse> getBasicIpSet(GetBasicIpSetRequest request);

    CompletableFuture<GetHealthStatusResponse> getHealthStatus(GetHealthStatusRequest request);

    CompletableFuture<GetSpareIpResponse> getSpareIp(GetSpareIpRequest request);

    CompletableFuture<ListAccelerateAreasResponse> listAccelerateAreas(ListAccelerateAreasRequest request);

    CompletableFuture<ListAcceleratorsResponse> listAccelerators(ListAcceleratorsRequest request);

    CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request);

    CompletableFuture<ListApplicationMonitorResponse> listApplicationMonitor(ListApplicationMonitorRequest request);

    CompletableFuture<ListApplicationMonitorDetectResultResponse> listApplicationMonitorDetectResult(ListApplicationMonitorDetectResultRequest request);

    CompletableFuture<ListAvailableAccelerateAreasResponse> listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request);

    CompletableFuture<ListAvailableBusiRegionsResponse> listAvailableBusiRegions(ListAvailableBusiRegionsRequest request);

    CompletableFuture<ListBandwidthPackagesResponse> listBandwidthPackages(ListBandwidthPackagesRequest request);

    CompletableFuture<ListBandwidthackagesResponse> listBandwidthackages(ListBandwidthackagesRequest request);

    CompletableFuture<ListBasicAcceleratorsResponse> listBasicAccelerators(ListBasicAcceleratorsRequest request);

    CompletableFuture<ListBusiRegionsResponse> listBusiRegions(ListBusiRegionsRequest request);

    CompletableFuture<ListEndpointGroupsResponse> listEndpointGroups(ListEndpointGroupsRequest request);

    CompletableFuture<ListForwardingRulesResponse> listForwardingRules(ListForwardingRulesRequest request);

    CompletableFuture<ListIpSetsResponse> listIpSets(ListIpSetsRequest request);

    CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request);

    CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request);

    CompletableFuture<ListSpareIpsResponse> listSpareIps(ListSpareIpsRequest request);

    CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request);

    CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request);

    CompletableFuture<ReplaceBandwidthPackageResponse> replaceBandwidthPackage(ReplaceBandwidthPackageRequest request);

    CompletableFuture<UpdateAcceleratorResponse> updateAccelerator(UpdateAcceleratorRequest request);

    CompletableFuture<UpdateAcceleratorAutoRenewAttributeResponse> updateAcceleratorAutoRenewAttribute(UpdateAcceleratorAutoRenewAttributeRequest request);

    CompletableFuture<UpdateAcceleratorConfirmResponse> updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request);

    CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request);

    CompletableFuture<UpdateApplicationMonitorResponse> updateApplicationMonitor(UpdateApplicationMonitorRequest request);

    CompletableFuture<UpdateBandwidthPackageResponse> updateBandwidthPackage(UpdateBandwidthPackageRequest request);

    CompletableFuture<UpdateBasicAcceleratorResponse> updateBasicAccelerator(UpdateBasicAcceleratorRequest request);

    CompletableFuture<UpdateBasicEndpointGroupResponse> updateBasicEndpointGroup(UpdateBasicEndpointGroupRequest request);

    CompletableFuture<UpdateEndpointGroupResponse> updateEndpointGroup(UpdateEndpointGroupRequest request);

    CompletableFuture<UpdateEndpointGroupAttributeResponse> updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request);

    CompletableFuture<UpdateEndpointGroupsResponse> updateEndpointGroups(UpdateEndpointGroupsRequest request);

    CompletableFuture<UpdateForwardingRuleAttributeResponse> updateForwardingRuleAttribute(UpdateForwardingRuleAttributeRequest request);

    CompletableFuture<UpdateForwardingRulesResponse> updateForwardingRules(UpdateForwardingRulesRequest request);

    CompletableFuture<UpdateIpSetResponse> updateIpSet(UpdateIpSetRequest request);

    CompletableFuture<UpdateIpSetsResponse> updateIpSets(UpdateIpSetsRequest request);

    CompletableFuture<UpdateListenerResponse> updateListener(UpdateListenerRequest request);

}
