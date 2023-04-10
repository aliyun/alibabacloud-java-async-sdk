// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iotcc20210513.models.*;
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

    CompletableFuture<AddCidrToConnectionPoolResponse> addCidrToConnectionPool(AddCidrToConnectionPoolRequest request);

    CompletableFuture<AddIoTCloudConnectorToGroupResponse> addIoTCloudConnectorToGroup(AddIoTCloudConnectorToGroupRequest request);

    CompletableFuture<AssociateIpWithConnectionPoolResponse> associateIpWithConnectionPool(AssociateIpWithConnectionPoolRequest request);

    CompletableFuture<AssociateVSwitchWithIoTCloudConnectorResponse> associateVSwitchWithIoTCloudConnector(AssociateVSwitchWithIoTCloudConnectorRequest request);

    CompletableFuture<ConfirmIoTCloudConnectorResponse> confirmIoTCloudConnector(ConfirmIoTCloudConnectorRequest request);

    CompletableFuture<CreateAuthorizationRuleResponse> createAuthorizationRule(CreateAuthorizationRuleRequest request);

    CompletableFuture<CreateAuthorizationRulesResponse> createAuthorizationRules(CreateAuthorizationRulesRequest request);

    CompletableFuture<CreateConnectionPoolResponse> createConnectionPool(CreateConnectionPoolRequest request);

    CompletableFuture<CreateDNSServiceRuleResponse> createDNSServiceRule(CreateDNSServiceRuleRequest request);

    CompletableFuture<CreateGroupAuthorizationRuleResponse> createGroupAuthorizationRule(CreateGroupAuthorizationRuleRequest request);

    CompletableFuture<CreateGroupDNSServiceRuleResponse> createGroupDNSServiceRule(CreateGroupDNSServiceRuleRequest request);

    CompletableFuture<CreateGroupIpMappingRuleResponse> createGroupIpMappingRule(CreateGroupIpMappingRuleRequest request);

    CompletableFuture<CreateIoTCloudConnectorResponse> createIoTCloudConnector(CreateIoTCloudConnectorRequest request);

    CompletableFuture<CreateIoTCloudConnectorBackhaulRouteResponse> createIoTCloudConnectorBackhaulRoute(CreateIoTCloudConnectorBackhaulRouteRequest request);

    CompletableFuture<CreateIoTCloudConnectorGroupResponse> createIoTCloudConnectorGroup(CreateIoTCloudConnectorGroupRequest request);

    CompletableFuture<CreateIpMappingRuleResponse> createIpMappingRule(CreateIpMappingRuleRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateServiceEntryResponse> createServiceEntry(CreateServiceEntryRequest request);

    CompletableFuture<DeleteAuthorizationRuleResponse> deleteAuthorizationRule(DeleteAuthorizationRuleRequest request);

    CompletableFuture<DeleteAuthorizationRulesResponse> deleteAuthorizationRules(DeleteAuthorizationRulesRequest request);

    CompletableFuture<DeleteConnectionPoolResponse> deleteConnectionPool(DeleteConnectionPoolRequest request);

    CompletableFuture<DeleteDNSServiceRuleResponse> deleteDNSServiceRule(DeleteDNSServiceRuleRequest request);

    CompletableFuture<DeleteGroupAuthorizationRuleResponse> deleteGroupAuthorizationRule(DeleteGroupAuthorizationRuleRequest request);

    CompletableFuture<DeleteGroupDNSServiceRuleResponse> deleteGroupDNSServiceRule(DeleteGroupDNSServiceRuleRequest request);

    CompletableFuture<DeleteGroupIpMappingRuleResponse> deleteGroupIpMappingRule(DeleteGroupIpMappingRuleRequest request);

    CompletableFuture<DeleteIoTCloudConnectorResponse> deleteIoTCloudConnector(DeleteIoTCloudConnectorRequest request);

    CompletableFuture<DeleteIoTCloudConnectorGroupResponse> deleteIoTCloudConnectorGroup(DeleteIoTCloudConnectorGroupRequest request);

    CompletableFuture<DeleteIoTCloudConnetorBackhaulRouteResponse> deleteIoTCloudConnetorBackhaulRoute(DeleteIoTCloudConnetorBackhaulRouteRequest request);

    CompletableFuture<DeleteIpMappingRuleResponse> deleteIpMappingRule(DeleteIpMappingRuleRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceEntryResponse> deleteServiceEntry(DeleteServiceEntryRequest request);

    CompletableFuture<DisableIoTCloudConnectorAccessLogResponse> disableIoTCloudConnectorAccessLog(DisableIoTCloudConnectorAccessLogRequest request);

    CompletableFuture<DissociateIpFromConnectionPoolResponse> dissociateIpFromConnectionPool(DissociateIpFromConnectionPoolRequest request);

    CompletableFuture<DissociateVSwitchFromIoTCloudConnectorResponse> dissociateVSwitchFromIoTCloudConnector(DissociateVSwitchFromIoTCloudConnectorRequest request);

    CompletableFuture<EnableIoTCloudConnectorAccessLogResponse> enableIoTCloudConnectorAccessLog(EnableIoTCloudConnectorAccessLogRequest request);

    CompletableFuture<GetConnectionPoolIpOperationResultResponse> getConnectionPoolIpOperationResult(GetConnectionPoolIpOperationResultRequest request);

    CompletableFuture<GetDiagnoseResultForSingleCardResponse> getDiagnoseResultForSingleCard(GetDiagnoseResultForSingleCardRequest request);

    CompletableFuture<GetIoTCloudConnectorAccessLogResponse> getIoTCloudConnectorAccessLog(GetIoTCloudConnectorAccessLogRequest request);

    CompletableFuture<GetStsInfoAndOssPathResponse> getStsInfoAndOssPath(GetStsInfoAndOssPathRequest request);

    CompletableFuture<GrantVirtualBorderRouterResponse> grantVirtualBorderRouter(GrantVirtualBorderRouterRequest request);

    CompletableFuture<ListAPNsResponse> listAPNs(ListAPNsRequest request);

    CompletableFuture<ListAuthorizationRulesResponse> listAuthorizationRules(ListAuthorizationRulesRequest request);

    CompletableFuture<ListConnectionPoolAllIpsResponse> listConnectionPoolAllIps(ListConnectionPoolAllIpsRequest request);

    CompletableFuture<ListConnectionPoolIpsResponse> listConnectionPoolIps(ListConnectionPoolIpsRequest request);

    CompletableFuture<ListConnectionPoolsResponse> listConnectionPools(ListConnectionPoolsRequest request);

    CompletableFuture<ListDNSServiceRulesResponse> listDNSServiceRules(ListDNSServiceRulesRequest request);

    CompletableFuture<ListDiagnoseInfoForSingleCardResponse> listDiagnoseInfoForSingleCard(ListDiagnoseInfoForSingleCardRequest request);

    CompletableFuture<ListGroupAuthorizationRulesResponse> listGroupAuthorizationRules(ListGroupAuthorizationRulesRequest request);

    CompletableFuture<ListGroupDNSServiceRulesResponse> listGroupDNSServiceRules(ListGroupDNSServiceRulesRequest request);

    CompletableFuture<ListGroupIpMappingRulesResponse> listGroupIpMappingRules(ListGroupIpMappingRulesRequest request);

    CompletableFuture<ListIoTCloudConnectorAvailableZonesResponse> listIoTCloudConnectorAvailableZones(ListIoTCloudConnectorAvailableZonesRequest request);

    CompletableFuture<ListIoTCloudConnectorEIPsResponse> listIoTCloudConnectorEIPs(ListIoTCloudConnectorEIPsRequest request);

    CompletableFuture<ListIoTCloudConnectorGroupsResponse> listIoTCloudConnectorGroups(ListIoTCloudConnectorGroupsRequest request);

    CompletableFuture<ListIoTCloudConnectorsResponse> listIoTCloudConnectors(ListIoTCloudConnectorsRequest request);

    CompletableFuture<ListIoTCoudConnectorBackhaulRouteResponse> listIoTCoudConnectorBackhaulRoute(ListIoTCoudConnectorBackhaulRouteRequest request);

    CompletableFuture<ListIpMappingRulesResponse> listIpMappingRules(ListIpMappingRulesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListServiceResponse> listService(ListServiceRequest request);

    CompletableFuture<ListServiceEntriesResponse> listServiceEntries(ListServiceEntriesRequest request);

    CompletableFuture<MoveAuthorizationRuleToDNSServiceResponse> moveAuthorizationRuleToDNSService(MoveAuthorizationRuleToDNSServiceRequest request);

    CompletableFuture<MoveGroupAuthorizationRuleToDNSServiceResponse> moveGroupAuthorizationRuleToDNSService(MoveGroupAuthorizationRuleToDNSServiceRequest request);

    CompletableFuture<OpenIoTCloudConnectorServiceResponse> openIoTCloudConnectorService(OpenIoTCloudConnectorServiceRequest request);

    CompletableFuture<RemoveIoTCloudConnectorFromGroupResponse> removeIoTCloudConnectorFromGroup(RemoveIoTCloudConnectorFromGroupRequest request);

    CompletableFuture<RevertIoTCloudConnectorResponse> revertIoTCloudConnector(RevertIoTCloudConnectorRequest request);

    CompletableFuture<SubmitDiagnoseTaskForSingleCardResponse> submitDiagnoseTaskForSingleCard(SubmitDiagnoseTaskForSingleCardRequest request);

    CompletableFuture<UpdateAuthorizationRuleAttributeResponse> updateAuthorizationRuleAttribute(UpdateAuthorizationRuleAttributeRequest request);

    CompletableFuture<UpdateConnectionPoolAttributeResponse> updateConnectionPoolAttribute(UpdateConnectionPoolAttributeRequest request);

    CompletableFuture<UpdateDNSServiceRuleAttributeResponse> updateDNSServiceRuleAttribute(UpdateDNSServiceRuleAttributeRequest request);

    CompletableFuture<UpdateGroupAuthorizationRuleAttributeResponse> updateGroupAuthorizationRuleAttribute(UpdateGroupAuthorizationRuleAttributeRequest request);

    CompletableFuture<UpdateGroupDNSServiceRuleAttributeResponse> updateGroupDNSServiceRuleAttribute(UpdateGroupDNSServiceRuleAttributeRequest request);

    CompletableFuture<UpdateGroupIpMappingRuleResponse> updateGroupIpMappingRule(UpdateGroupIpMappingRuleRequest request);

    CompletableFuture<UpdateIoTCloudConnectorAttributeResponse> updateIoTCloudConnectorAttribute(UpdateIoTCloudConnectorAttributeRequest request);

    CompletableFuture<UpdateIoTCloudConnectorGroupAttributeResponse> updateIoTCloudConnectorGroupAttribute(UpdateIoTCloudConnectorGroupAttributeRequest request);

    CompletableFuture<UpdateIpMappingRuleResponse> updateIpMappingRule(UpdateIpMappingRuleRequest request);

    CompletableFuture<UpdateServiceAttributeResponse> updateServiceAttribute(UpdateServiceAttributeRequest request);

    CompletableFuture<UpdateServiceEntryAttributeResponse> updateServiceEntryAttribute(UpdateServiceEntryAttributeRequest request);

}
