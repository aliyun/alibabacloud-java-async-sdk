// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.expressconnectrouter20230901.models.*;
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
     * @param request the request parameters of ActivateFlowLog  ActivateFlowLogRequest
     * @return ActivateFlowLogResponse
     */
    CompletableFuture<ActivateFlowLogResponse> activateFlowLog(ActivateFlowLogRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>AttachExpressConnectRouterChildInstance</strong> operation to associate a VBR with an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * @param request the request parameters of AttachExpressConnectRouterChildInstance  AttachExpressConnectRouterChildInstanceRequest
     * @return AttachExpressConnectRouterChildInstanceResponse
     */
    CompletableFuture<AttachExpressConnectRouterChildInstanceResponse> attachExpressConnectRouterChildInstance(AttachExpressConnectRouterChildInstanceRequest request);

    /**
     * @param request the request parameters of CheckAddRegionToExpressConnectRouter  CheckAddRegionToExpressConnectRouterRequest
     * @return CheckAddRegionToExpressConnectRouterResponse
     */
    CompletableFuture<CheckAddRegionToExpressConnectRouterResponse> checkAddRegionToExpressConnectRouter(CheckAddRegionToExpressConnectRouterRequest request);

    /**
     * <b>description</b> :
     * <p>After you create an ECR, it enters the <strong>Active</strong> state.</p>
     * 
     * @param request the request parameters of CreateExpressConnectRouter  CreateExpressConnectRouterRequest
     * @return CreateExpressConnectRouterResponse
     */
    CompletableFuture<CreateExpressConnectRouterResponse> createExpressConnectRouter(CreateExpressConnectRouterRequest request);

    /**
     * @param request the request parameters of CreateExpressConnectRouterAssociation  CreateExpressConnectRouterAssociationRequest
     * @return CreateExpressConnectRouterAssociationResponse
     */
    CompletableFuture<CreateExpressConnectRouterAssociationResponse> createExpressConnectRouterAssociation(CreateExpressConnectRouterAssociationRequest request);

    /**
     * @param request the request parameters of CreateFlowLog  CreateFlowLogRequest
     * @return CreateFlowLogResponse
     */
    CompletableFuture<CreateFlowLogResponse> createFlowLog(CreateFlowLogRequest request);

    /**
     * @param request the request parameters of DeactivateFlowLog  DeactivateFlowLogRequest
     * @return DeactivateFlowLogResponse
     */
    CompletableFuture<DeactivateFlowLogResponse> deactivateFlowLog(DeactivateFlowLogRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Before you call this operation, make sure that all resources are disassociated from the ECR.</li>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteExpressConnectRouter  DeleteExpressConnectRouterRequest
     * @return DeleteExpressConnectRouterResponse
     */
    CompletableFuture<DeleteExpressConnectRouterResponse> deleteExpressConnectRouter(DeleteExpressConnectRouterRequest request);

    /**
     * @param request the request parameters of DeleteExpressConnectRouterAssociation  DeleteExpressConnectRouterAssociationRequest
     * @return DeleteExpressConnectRouterAssociationResponse
     */
    CompletableFuture<DeleteExpressConnectRouterAssociationResponse> deleteExpressConnectRouterAssociation(DeleteExpressConnectRouterAssociationRequest request);

    /**
     * @param request the request parameters of DeleteFlowlog  DeleteFlowlogRequest
     * @return DeleteFlowlogResponse
     */
    CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request);

    /**
     * @param request the request parameters of DescribeDisabledExpressConnectRouterRouteEntries  DescribeDisabledExpressConnectRouterRouteEntriesRequest
     * @return DescribeDisabledExpressConnectRouterRouteEntriesResponse
     */
    CompletableFuture<DescribeDisabledExpressConnectRouterRouteEntriesResponse> describeDisabledExpressConnectRouterRouteEntries(DescribeDisabledExpressConnectRouterRouteEntriesRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouter  DescribeExpressConnectRouterRequest
     * @return DescribeExpressConnectRouterResponse
     */
    CompletableFuture<DescribeExpressConnectRouterResponse> describeExpressConnectRouter(DescribeExpressConnectRouterRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterAllowedPrefixHistory  DescribeExpressConnectRouterAllowedPrefixHistoryRequest
     * @return DescribeExpressConnectRouterAllowedPrefixHistoryResponse
     */
    CompletableFuture<DescribeExpressConnectRouterAllowedPrefixHistoryResponse> describeExpressConnectRouterAllowedPrefixHistory(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterAssociation  DescribeExpressConnectRouterAssociationRequest
     * @return DescribeExpressConnectRouterAssociationResponse
     */
    CompletableFuture<DescribeExpressConnectRouterAssociationResponse> describeExpressConnectRouterAssociation(DescribeExpressConnectRouterAssociationRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterChildInstance  DescribeExpressConnectRouterChildInstanceRequest
     * @return DescribeExpressConnectRouterChildInstanceResponse
     */
    CompletableFuture<DescribeExpressConnectRouterChildInstanceResponse> describeExpressConnectRouterChildInstance(DescribeExpressConnectRouterChildInstanceRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterInterRegionTransitMode  DescribeExpressConnectRouterInterRegionTransitModeRequest
     * @return DescribeExpressConnectRouterInterRegionTransitModeResponse
     */
    CompletableFuture<DescribeExpressConnectRouterInterRegionTransitModeResponse> describeExpressConnectRouterInterRegionTransitMode(DescribeExpressConnectRouterInterRegionTransitModeRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterRegion  DescribeExpressConnectRouterRegionRequest
     * @return DescribeExpressConnectRouterRegionResponse
     */
    CompletableFuture<DescribeExpressConnectRouterRegionResponse> describeExpressConnectRouterRegion(DescribeExpressConnectRouterRegionRequest request);

    /**
     * @param request the request parameters of DescribeExpressConnectRouterRouteEntries  DescribeExpressConnectRouterRouteEntriesRequest
     * @return DescribeExpressConnectRouterRouteEntriesResponse
     */
    CompletableFuture<DescribeExpressConnectRouterRouteEntriesResponse> describeExpressConnectRouterRouteEntries(DescribeExpressConnectRouterRouteEntriesRequest request);

    /**
     * @param request the request parameters of DescribeFlowLogs  DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     */
    CompletableFuture<DescribeFlowLogsResponse> describeFlowLogs(DescribeFlowLogsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceGrantedToExpressConnectRouter  DescribeInstanceGrantedToExpressConnectRouterRequest
     * @return DescribeInstanceGrantedToExpressConnectRouterResponse
     */
    CompletableFuture<DescribeInstanceGrantedToExpressConnectRouterResponse> describeInstanceGrantedToExpressConnectRouter(DescribeInstanceGrantedToExpressConnectRouterRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DetachExpressConnectRouterChildInstance</strong> operation to uninstall a VBR from an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * @param request the request parameters of DetachExpressConnectRouterChildInstance  DetachExpressConnectRouterChildInstanceRequest
     * @return DetachExpressConnectRouterChildInstanceResponse
     */
    CompletableFuture<DetachExpressConnectRouterChildInstanceResponse> detachExpressConnectRouterChildInstance(DetachExpressConnectRouterChildInstanceRequest request);

    /**
     * @param request the request parameters of DisableExpressConnectRouterRouteEntries  DisableExpressConnectRouterRouteEntriesRequest
     * @return DisableExpressConnectRouterRouteEntriesResponse
     */
    CompletableFuture<DisableExpressConnectRouterRouteEntriesResponse> disableExpressConnectRouterRouteEntries(DisableExpressConnectRouterRouteEntriesRequest request);

    /**
     * @param request the request parameters of EnableExpressConnectRouterRouteEntries  EnableExpressConnectRouterRouteEntriesRequest
     * @return EnableExpressConnectRouterRouteEntriesResponse
     */
    CompletableFuture<EnableExpressConnectRouterRouteEntriesResponse> enableExpressConnectRouterRouteEntries(EnableExpressConnectRouterRouteEntriesRequest request);

    /**
     * <b>description</b> :
     * <p>  If you forcefully delete an ECR, all the resources associated with the ECR are disassociated at a time. Make sure that the disassociation does not affect the stability of your business.</p>
     * <ul>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of ForceDeleteExpressConnectRouter  ForceDeleteExpressConnectRouterRequest
     * @return ForceDeleteExpressConnectRouterResponse
     */
    CompletableFuture<ForceDeleteExpressConnectRouterResponse> forceDeleteExpressConnectRouter(ForceDeleteExpressConnectRouterRequest request);

    /**
     * <b>description</b> :
     * <p>When you associate a network instance of another account with an ECR, you must grant permissions on the network instance to the ECR.</p>
     * 
     * @param request the request parameters of GrantInstanceToExpressConnectRouter  GrantInstanceToExpressConnectRouterRequest
     * @return GrantInstanceToExpressConnectRouterResponse
     */
    CompletableFuture<GrantInstanceToExpressConnectRouterResponse> grantInstanceToExpressConnectRouter(GrantInstanceToExpressConnectRouterRequest request);

    /**
     * @param request the request parameters of ListExpressConnectRouterSupportedRegion  ListExpressConnectRouterSupportedRegionRequest
     * @return ListExpressConnectRouterSupportedRegionResponse
     */
    CompletableFuture<ListExpressConnectRouterSupportedRegionResponse> listExpressConnectRouterSupportedRegion(ListExpressConnectRouterSupportedRegionRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify only properties of ECRs in the <strong>Active</strong> state.</p>
     * 
     * @param request the request parameters of ModifyExpressConnectRouter  ModifyExpressConnectRouterRequest
     * @return ModifyExpressConnectRouterResponse
     */
    CompletableFuture<ModifyExpressConnectRouterResponse> modifyExpressConnectRouter(ModifyExpressConnectRouterRequest request);

    /**
     * @param request the request parameters of ModifyExpressConnectRouterAssociationAllowedPrefix  ModifyExpressConnectRouterAssociationAllowedPrefixRequest
     * @return ModifyExpressConnectRouterAssociationAllowedPrefixResponse
     */
    CompletableFuture<ModifyExpressConnectRouterAssociationAllowedPrefixResponse> modifyExpressConnectRouterAssociationAllowedPrefix(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request);

    /**
     * @param request the request parameters of ModifyExpressConnectRouterInterRegionTransitMode  ModifyExpressConnectRouterInterRegionTransitModeRequest
     * @return ModifyExpressConnectRouterInterRegionTransitModeResponse
     */
    CompletableFuture<ModifyExpressConnectRouterInterRegionTransitModeResponse> modifyExpressConnectRouterInterRegionTransitMode(ModifyExpressConnectRouterInterRegionTransitModeRequest request);

    /**
     * @param request the request parameters of ModifyFlowLogAttribute  ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of RevokeInstanceFromExpressConnectRouter  RevokeInstanceFromExpressConnectRouterRequest
     * @return RevokeInstanceFromExpressConnectRouterResponse
     */
    CompletableFuture<RevokeInstanceFromExpressConnectRouterResponse> revokeInstanceFromExpressConnectRouter(RevokeInstanceFromExpressConnectRouterRequest request);

    /**
     * <b>description</b> :
     * <p>Updates are allowed only when the ECR is in the <strong>Active</strong> state.</p>
     * 
     * @param request the request parameters of SynchronizeExpressConnectRouterInterRegionBandwidth  SynchronizeExpressConnectRouterInterRegionBandwidthRequest
     * @return SynchronizeExpressConnectRouterInterRegionBandwidthResponse
     */
    CompletableFuture<SynchronizeExpressConnectRouterInterRegionBandwidthResponse> synchronizeExpressConnectRouterInterRegionBandwidth(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request);

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

}
