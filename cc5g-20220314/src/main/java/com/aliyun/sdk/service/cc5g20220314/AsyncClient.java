// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cc5g20220314.models.*;
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

    CompletableFuture<AddDNSAuthorizationRuleResponse> addDNSAuthorizationRule(AddDNSAuthorizationRuleRequest request);

    CompletableFuture<AddGroupDnsAuthorizationRuleResponse> addGroupDnsAuthorizationRule(AddGroupDnsAuthorizationRuleRequest request);

    CompletableFuture<AddWirelessCloudConnectorToGroupResponse> addWirelessCloudConnectorToGroup(AddWirelessCloudConnectorToGroupRequest request);

    CompletableFuture<AttachVpcToNetLinkResponse> attachVpcToNetLink(AttachVpcToNetLinkRequest request);

    CompletableFuture<CreateAuthorizationRuleResponse> createAuthorizationRule(CreateAuthorizationRuleRequest request);

    CompletableFuture<CreateBatchOperateCardsTaskResponse> createBatchOperateCardsTask(CreateBatchOperateCardsTaskRequest request);

    CompletableFuture<CreateGroupAuthorizationRuleResponse> createGroupAuthorizationRule(CreateGroupAuthorizationRuleRequest request);

    CompletableFuture<CreateIoTCloudConnectorBackhaulRouteResponse> createIoTCloudConnectorBackhaulRoute(CreateIoTCloudConnectorBackhaulRouteRequest request);

    CompletableFuture<CreateWirelessCloudConnectorResponse> createWirelessCloudConnector(CreateWirelessCloudConnectorRequest request);

    CompletableFuture<CreateWirelessCloudConnectorGroupResponse> createWirelessCloudConnectorGroup(CreateWirelessCloudConnectorGroupRequest request);

    CompletableFuture<DeleteAuthorizationRuleResponse> deleteAuthorizationRule(DeleteAuthorizationRuleRequest request);

    CompletableFuture<DeleteBatchOperateCardsTaskResponse> deleteBatchOperateCardsTask(DeleteBatchOperateCardsTaskRequest request);

    CompletableFuture<DeleteGroupAuthorizationRuleResponse> deleteGroupAuthorizationRule(DeleteGroupAuthorizationRuleRequest request);

    CompletableFuture<DeleteIoTCloudConnectorBackhaulRouteResponse> deleteIoTCloudConnectorBackhaulRoute(DeleteIoTCloudConnectorBackhaulRouteRequest request);

    CompletableFuture<DeleteWirelessCloudConnectorResponse> deleteWirelessCloudConnector(DeleteWirelessCloudConnectorRequest request);

    CompletableFuture<DeleteWirelessCloudConnectorGroupResponse> deleteWirelessCloudConnectorGroup(DeleteWirelessCloudConnectorGroupRequest request);

    CompletableFuture<DetachVpcFromNetLinkResponse> detachVpcFromNetLink(DetachVpcFromNetLinkRequest request);

    CompletableFuture<FailCardsResponse> failCards(FailCardsRequest request);

    CompletableFuture<GetCardResponse> getCard(GetCardRequest request);

    CompletableFuture<GetCardLockReasonResponse> getCardLockReason(GetCardLockReasonRequest request);

    CompletableFuture<GetCreateCustomerInformationResponse> getCreateCustomerInformation(GetCreateCustomerInformationRequest request);

    CompletableFuture<GetDiagnoseResultForSingleCardResponse> getDiagnoseResultForSingleCard(GetDiagnoseResultForSingleCardRequest request);

    CompletableFuture<GetWirelessCloudConnectorResponse> getWirelessCloudConnector(GetWirelessCloudConnectorRequest request);

    CompletableFuture<GrantNetLinkResponse> grantNetLink(GrantNetLinkRequest request);

    CompletableFuture<ListAPNsResponse> listAPNs(ListAPNsRequest request);

    CompletableFuture<ListAuthorizationRulesResponse> listAuthorizationRules(ListAuthorizationRulesRequest request);

    CompletableFuture<ListBatchOperateCardsTasksResponse> listBatchOperateCardsTasks(ListBatchOperateCardsTasksRequest request);

    CompletableFuture<ListCardsResponse> listCards(ListCardsRequest request);

    CompletableFuture<ListDataPackagesResponse> listDataPackages(ListDataPackagesRequest request);

    CompletableFuture<ListDiagnoseInfoForSingleCardResponse> listDiagnoseInfoForSingleCard(ListDiagnoseInfoForSingleCardRequest request);

    CompletableFuture<ListGroupAuthorizationRulesResponse> listGroupAuthorizationRules(ListGroupAuthorizationRulesRequest request);

    CompletableFuture<ListIoTCloudConnectorBackhaulRouteResponse> listIoTCloudConnectorBackhaulRoute(ListIoTCloudConnectorBackhaulRouteRequest request);

    CompletableFuture<ListOrdersResponse> listOrders(ListOrdersRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListWirelessCloudConnectorGroupsResponse> listWirelessCloudConnectorGroups(ListWirelessCloudConnectorGroupsRequest request);

    CompletableFuture<ListWirelessCloudConnectorsResponse> listWirelessCloudConnectors(ListWirelessCloudConnectorsRequest request);

    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    CompletableFuture<LockCardsResponse> lockCards(LockCardsRequest request);

    CompletableFuture<ModifyWirelessCloudConnectorFeatureResponse> modifyWirelessCloudConnectorFeature(ModifyWirelessCloudConnectorFeatureRequest request);

    CompletableFuture<OpenCc5gServiceResponse> openCc5gService(OpenCc5gServiceRequest request);

    CompletableFuture<RemoveWirelessCloudConnectorFromGroupResponse> removeWirelessCloudConnectorFromGroup(RemoveWirelessCloudConnectorFromGroupRequest request);

    CompletableFuture<ResumeCardsResponse> resumeCards(ResumeCardsRequest request);

    CompletableFuture<RevokeNetLinkResponse> revokeNetLink(RevokeNetLinkRequest request);

    CompletableFuture<StopCardsResponse> stopCards(StopCardsRequest request);

    CompletableFuture<SubmitDiagnoseTaskForSingleCardResponse> submitDiagnoseTaskForSingleCard(SubmitDiagnoseTaskForSingleCardRequest request);

    CompletableFuture<SwitchWirelessCloudConnectorToBusinessResponse> switchWirelessCloudConnectorToBusiness(SwitchWirelessCloudConnectorToBusinessRequest request);

    CompletableFuture<UnlockCardsResponse> unlockCards(UnlockCardsRequest request);

    CompletableFuture<UpdateAuthorizationRuleResponse> updateAuthorizationRule(UpdateAuthorizationRuleRequest request);

    CompletableFuture<UpdateBatchOperateCardsTaskResponse> updateBatchOperateCardsTask(UpdateBatchOperateCardsTaskRequest request);

    CompletableFuture<UpdateCardResponse> updateCard(UpdateCardRequest request);

    CompletableFuture<UpdateDNSAuthorizationRuleResponse> updateDNSAuthorizationRule(UpdateDNSAuthorizationRuleRequest request);

    CompletableFuture<UpdateGroupAuthorizationRuleResponse> updateGroupAuthorizationRule(UpdateGroupAuthorizationRuleRequest request);

    CompletableFuture<UpdateGroupDnsAuthorizationRuleResponse> updateGroupDnsAuthorizationRule(UpdateGroupDnsAuthorizationRuleRequest request);

    CompletableFuture<UpdateWirelessCloudConnectorResponse> updateWirelessCloudConnector(UpdateWirelessCloudConnectorRequest request);

    CompletableFuture<UpdateWirelessCloudConnectorGroupResponse> updateWirelessCloudConnectorGroup(UpdateWirelessCloudConnectorGroupRequest request);

}
