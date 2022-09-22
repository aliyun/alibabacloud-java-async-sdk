// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs20160314.models.*;
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

    CompletableFuture<AddMigratableInstancesResponse> addMigratableInstances(AddMigratableInstancesRequest request);

    CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request);

    CompletableFuture<CancelMigrationInstancesResponse> cancelMigrationInstances(CancelMigrationInstancesRequest request);

    CompletableFuture<CancelMigrationPlanResponse> cancelMigrationPlan(CancelMigrationPlanRequest request);

    CompletableFuture<ConfigureSecurityGroupPermissionsResponse> configureSecurityGroupPermissions(ConfigureSecurityGroupPermissionsRequest request);

    CompletableFuture<ConfirmReservationDemandResponse> confirmReservationDemand(ConfirmReservationDemandRequest request);

    CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request);

    CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request);

    CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request);

    CompletableFuture<CreateDefaultAutoSnapshotPolicyResponse> createDefaultAutoSnapshotPolicy(CreateDefaultAutoSnapshotPolicyRequest request);

    CompletableFuture<CreateDiagnoseResponse> createDiagnose(CreateDiagnoseRequest request);

    CompletableFuture<CreateDiagnosisOperateRecordsResponse> createDiagnosisOperateRecords(CreateDiagnosisOperateRecordsRequest request);

    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    CompletableFuture<CreateDisksResponse> createDisks(CreateDisksRequest request);

    CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request);

    CompletableFuture<CreateEniQosGroupResponse> createEniQosGroup(CreateEniQosGroupRequest request);

    CompletableFuture<CreateFunctionFeedbackResponse> createFunctionFeedback(CreateFunctionFeedbackRequest request);

    CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request);

    CompletableFuture<CreateIssueCategoryReportRelationResponse> createIssueCategoryReportRelation(CreateIssueCategoryReportRelationRequest request);

    CompletableFuture<CreateMigrationPlanResponse> createMigrationPlan(CreateMigrationPlanRequest request);

    CompletableFuture<CreateNetworkInsightsPathResponse> createNetworkInsightsPath(CreateNetworkInsightsPathRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateReservationDemandResponse> createReservationDemand(CreateReservationDemandRequest request);

    CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request);

    CompletableFuture<CreateUserQuotaApplicationResponse> createUserQuotaApplication(CreateUserQuotaApplicationRequest request);

    CompletableFuture<CreateVolumesResponse> createVolumes(CreateVolumesRequest request);

    CompletableFuture<CreateWaitingOrderResponse> createWaitingOrder(CreateWaitingOrderRequest request);

    CompletableFuture<DeleteDedicatedHostClusterResponse> deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request);

    CompletableFuture<DeleteEniQosGroupResponse> deleteEniQosGroup(DeleteEniQosGroupRequest request);

    CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request);

    CompletableFuture<DeleteMigratableInstancesResponse> deleteMigratableInstances(DeleteMigratableInstancesRequest request);

    CompletableFuture<DeleteNetworkInsightsAnalysisResponse> deleteNetworkInsightsAnalysis(DeleteNetworkInsightsAnalysisRequest request);

    CompletableFuture<DeleteNetworkInsightsPathResponse> deleteNetworkInsightsPath(DeleteNetworkInsightsPathRequest request);

    CompletableFuture<DeleteReservationDemandResponse> deleteReservationDemand(DeleteReservationDemandRequest request);

    CompletableFuture<DeleteStorageSetResponse> deleteStorageSet(DeleteStorageSetRequest request);

    CompletableFuture<DeleteUserQuotaApplicationResponse> deleteUserQuotaApplication(DeleteUserQuotaApplicationRequest request);

    CompletableFuture<DeleteWaitingOrdersResponse> deleteWaitingOrders(DeleteWaitingOrdersRequest request);

    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

    CompletableFuture<DescribeAccountLimitsResponse> describeAccountLimits(DescribeAccountLimitsRequest request);

    CompletableFuture<DescribeAccountQuotaAttributesResponse> describeAccountQuotaAttributes(DescribeAccountQuotaAttributesRequest request);

    CompletableFuture<DescribeAutoProvisioningGroupCapacitiesResponse> describeAutoProvisioningGroupCapacities(DescribeAutoProvisioningGroupCapacitiesRequest request);

    CompletableFuture<DescribeBandwidthPriceResponse> describeBandwidthPrice(DescribeBandwidthPriceRequest request);

    CompletableFuture<DescribeCapacityReservationsResponse> describeCapacityReservations(DescribeCapacityReservationsRequest request);

    CompletableFuture<DescribeCustomerIssueCategoryResponse> describeCustomerIssueCategory(DescribeCustomerIssueCategoryRequest request);

    CompletableFuture<DescribeDedicatedHostAutoRenewResponse> describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request);

    CompletableFuture<DescribeDedicatedHostClustersResponse> describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request);

    CompletableFuture<DescribeDedicatedHostTypesResponse> describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request);

    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    CompletableFuture<DescribeDiagnoseResponse> describeDiagnose(DescribeDiagnoseRequest request);

    CompletableFuture<DescribeDiagnosisOperateRecordsResponse> describeDiagnosisOperateRecords(DescribeDiagnosisOperateRecordsRequest request);

    CompletableFuture<DescribeDiagnosticReportsResponse> describeDiagnosticReports(DescribeDiagnosticReportsRequest request);

    CompletableFuture<DescribeDiskReplicaPairsResponse> describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request);

    CompletableFuture<DescribeEcsScenarioFacadeResponse> describeEcsScenarioFacade(DescribeEcsScenarioFacadeRequest request);

    CompletableFuture<DescribeEniQosGroupInfoResponse> describeEniQosGroupInfo(DescribeEniQosGroupInfoRequest request);

    CompletableFuture<DescribeFunctionFeedbackResponse> describeFunctionFeedback(DescribeFunctionFeedbackRequest request);

    CompletableFuture<DescribeHavsInstanceTypesResponse> describeHavsInstanceTypes(DescribeHavsInstanceTypesRequest request);

    CompletableFuture<DescribeImageAgreementResponse> describeImageAgreement(DescribeImageAgreementRequest request);

    CompletableFuture<DescribeImageCachesResponse> describeImageCaches(DescribeImageCachesRequest request);

    CompletableFuture<DescribeImageFamiliesResponse> describeImageFamilies(DescribeImageFamiliesRequest request);

    CompletableFuture<DescribeInstanceAutoRebootTimeResponse> describeInstanceAutoRebootTime(DescribeInstanceAutoRebootTimeRequest request);

    CompletableFuture<DescribeInstanceHealthStatusResponse> describeInstanceHealthStatus(DescribeInstanceHealthStatusRequest request);

    CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request);

    CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request);

    CompletableFuture<DescribeInstanceNeedRebootResponse> describeInstanceNeedReboot(DescribeInstanceNeedRebootRequest request);

    CompletableFuture<DescribeInstancePerformanceRestrictHistoryResponse> describeInstancePerformanceRestrictHistory(DescribeInstancePerformanceRestrictHistoryRequest request);

    CompletableFuture<DescribeInstanceTypeResourceResponse> describeInstanceTypeResource(DescribeInstanceTypeResourceRequest request);

    CompletableFuture<DescribeKMSKeyAttributeResponse> describeKMSKeyAttribute(DescribeKMSKeyAttributeRequest request);

    CompletableFuture<DescribeKMSKeysResponse> describeKMSKeys(DescribeKMSKeysRequest request);

    CompletableFuture<DescribeLinkedKMSKeysResponse> describeLinkedKMSKeys(DescribeLinkedKMSKeysRequest request);

    CompletableFuture<DescribeLocalDiskRepairActivitiesResponse> describeLocalDiskRepairActivities(DescribeLocalDiskRepairActivitiesRequest request);

    CompletableFuture<DescribeMigrationInstancesResponse> describeMigrationInstances(DescribeMigrationInstancesRequest request);

    CompletableFuture<DescribeMigrationPlansResponse> describeMigrationPlans(DescribeMigrationPlansRequest request);

    CompletableFuture<DescribeMigrationPreferencesResponse> describeMigrationPreferences(DescribeMigrationPreferencesRequest request);

    CompletableFuture<DescribeNetworkInsightsAnalysisResultResponse> describeNetworkInsightsAnalysisResult(DescribeNetworkInsightsAnalysisResultRequest request);

    CompletableFuture<DescribeNetworkInsightsAnalysisesResponse> describeNetworkInsightsAnalysises(DescribeNetworkInsightsAnalysisesRequest request);

    CompletableFuture<DescribeNetworkInsightsPathsResponse> describeNetworkInsightsPaths(DescribeNetworkInsightsPathsRequest request);

    CompletableFuture<DescribeOrderAutoRebootTimeResponse> describeOrderAutoRebootTime(DescribeOrderAutoRebootTimeRequest request);

    CompletableFuture<DescribePrePaidResourceRefundPriceResponse> describePrePaidResourceRefundPrice(DescribePrePaidResourceRefundPriceRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribePrivatePoolsResponse> describePrivatePools(DescribePrivatePoolsRequest request);

    CompletableFuture<DescribeRecommendProductResponse> describeRecommendProduct(DescribeRecommendProductRequest request);

    CompletableFuture<DescribeReservationDemandCommittedAmountResponse> describeReservationDemandCommittedAmount(DescribeReservationDemandCommittedAmountRequest request);

    CompletableFuture<DescribeReservationDemandsResponse> describeReservationDemands(DescribeReservationDemandsRequest request);

    CompletableFuture<DescribeReservedInstanceAllocationsResponse> describeReservedInstanceAllocations(DescribeReservedInstanceAllocationsRequest request);

    CompletableFuture<DescribeReservedInstanceCategoriesResponse> describeReservedInstanceCategories(DescribeReservedInstanceCategoriesRequest request);

    CompletableFuture<DescribeReservedInstancePriceResponse> describeReservedInstancePrice(DescribeReservedInstancePriceRequest request);

    CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request);

    CompletableFuture<DescribeResourceAggregationsResponse> describeResourceAggregations(DescribeResourceAggregationsRequest request);

    CompletableFuture<DescribeResourceAllocationResponse> describeResourceAllocation(DescribeResourceAllocationRequest request);

    CompletableFuture<DescribeResourceDisplayResponse> describeResourceDisplay(DescribeResourceDisplayRequest request);

    CompletableFuture<DescribeResourceFilterAttributesResponse> describeResourceFilterAttributes(DescribeResourceFilterAttributesRequest request);

    CompletableFuture<DescribeResourceRecommendFiltersResponse> describeResourceRecommendFilters(DescribeResourceRecommendFiltersRequest request);

    CompletableFuture<DescribeResourceSolutionsResponse> describeResourceSolutions(DescribeResourceSolutionsRequest request);

    CompletableFuture<DescribeResourcesResponse> describeResources(DescribeResourcesRequest request);

    CompletableFuture<DescribeRiUtilizationResponse> describeRiUtilization(DescribeRiUtilizationRequest request);

    CompletableFuture<DescribeScenePurchaseRecommendResponse> describeScenePurchaseRecommend(DescribeScenePurchaseRecommendRequest request);

    CompletableFuture<DescribeSceneResourceRecommendResponse> describeSceneResourceRecommend(DescribeSceneResourceRecommendRequest request);

    CompletableFuture<DescribeSpotInstanceAdviceResponse> describeSpotInstanceAdvice(DescribeSpotInstanceAdviceRequest request);

    CompletableFuture<DescribeStorageCapacityUnitAllocationsResponse> describeStorageCapacityUnitAllocations(DescribeStorageCapacityUnitAllocationsRequest request);

    CompletableFuture<DescribeStorageCapacityUnitDeductFactorResponse> describeStorageCapacityUnitDeductFactor(DescribeStorageCapacityUnitDeductFactorRequest request);

    CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request);

    CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request);

    CompletableFuture<DescribeTransitionVSwitchesResponse> describeTransitionVSwitches(DescribeTransitionVSwitchesRequest request);

    CompletableFuture<DescribeTransitionVpcAndVSwitchResponse> describeTransitionVpcAndVSwitch(DescribeTransitionVpcAndVSwitchRequest request);

    CompletableFuture<DescribeTransitionVpcsResponse> describeTransitionVpcs(DescribeTransitionVpcsRequest request);

    CompletableFuture<DescribeUserAvailableIpServiceProvidersResponse> describeUserAvailableIpServiceProviders(DescribeUserAvailableIpServiceProvidersRequest request);

    CompletableFuture<DescribeUserQuotaApplicationsResponse> describeUserQuotaApplications(DescribeUserQuotaApplicationsRequest request);

    CompletableFuture<DescribeVpcHavsInstancesResponse> describeVpcHavsInstances(DescribeVpcHavsInstancesRequest request);

    CompletableFuture<DescribeWaitingOrdersResponse> describeWaitingOrders(DescribeWaitingOrdersRequest request);

    CompletableFuture<FeedbackDiagnoseResponse> feedbackDiagnose(FeedbackDiagnoseRequest request);

    CompletableFuture<GetLaunchTemplateDataResponse> getLaunchTemplateData(GetLaunchTemplateDataRequest request);

    CompletableFuture<InnerDescribeNetworkInterfaceInGroupResponse> innerDescribeNetworkInterfaceInGroup(InnerDescribeNetworkInterfaceInGroupRequest request);

    CompletableFuture<JoinEniQosGroupResponse> joinEniQosGroup(JoinEniQosGroupRequest request);

    CompletableFuture<LeaveEniQosGroupResponse> leaveEniQosGroup(LeaveEniQosGroupRequest request);

    CompletableFuture<ListAccountEcsQuotasResponse> listAccountEcsQuotas(ListAccountEcsQuotasRequest request);

    CompletableFuture<ListServiceSettingsResponse> listServiceSettings(ListServiceSettingsRequest request);

    CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request);

    CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request);

    CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request);

    CompletableFuture<ModifyDiagnoseResponse> modifyDiagnose(ModifyDiagnoseRequest request);

    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    CompletableFuture<ModifyEniQosGroupResponse> modifyEniQosGroup(ModifyEniQosGroupRequest request);

    CompletableFuture<ModifyImageAdvancedAttributeResponse> modifyImageAdvancedAttribute(ModifyImageAdvancedAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoRebootTimeResponse> modifyInstanceAutoRebootTime(ModifyInstanceAutoRebootTimeRequest request);

    CompletableFuture<ModifyInstanceCapacityReservationAttributesResponse> modifyInstanceCapacityReservationAttributes(ModifyInstanceCapacityReservationAttributesRequest request);

    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request);

    CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request);

    CompletableFuture<ModifyMigratableInstancesResponse> modifyMigratableInstances(ModifyMigratableInstancesRequest request);

    CompletableFuture<ModifyMigrationInstancesResponse> modifyMigrationInstances(ModifyMigrationInstancesRequest request);

    CompletableFuture<ModifyMigrationPlanResponse> modifyMigrationPlan(ModifyMigrationPlanRequest request);

    CompletableFuture<ModifyOrderAutoRebootTimeResponse> modifyOrderAutoRebootTime(ModifyOrderAutoRebootTimeRequest request);

    CompletableFuture<ModifyPrivatePoolResponse> modifyPrivatePool(ModifyPrivatePoolRequest request);

    CompletableFuture<ModifyReservationDemandResponse> modifyReservationDemand(ModifyReservationDemandRequest request);

    CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request);

    CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request);

    CompletableFuture<ModifyResourceDiagnosisStatusResponse> modifyResourceDiagnosisStatus(ModifyResourceDiagnosisStatusRequest request);

    CompletableFuture<ModifyResourceMetaResponse> modifyResourceMeta(ModifyResourceMetaRequest request);

    CompletableFuture<ModifyStorageSetAttributeResponse> modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request);

    CompletableFuture<ModifyWaitingOrderResponse> modifyWaitingOrder(ModifyWaitingOrderRequest request);

    CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request);

    CompletableFuture<PurchaseSavingPlanOfferingResponse> purchaseSavingPlanOffering(PurchaseSavingPlanOfferingRequest request);

    CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request);

    CompletableFuture<QueryEniQosGroupByEniResponse> queryEniQosGroupByEni(QueryEniQosGroupByEniRequest request);

    CompletableFuture<QueryEniQosGroupByInstanceResponse> queryEniQosGroupByInstance(QueryEniQosGroupByInstanceRequest request);

    CompletableFuture<ReAddMigrationTaskInPlanResponse> reAddMigrationTaskInPlan(ReAddMigrationTaskInPlanRequest request);

    CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request);

    CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request);

    CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request);

    CompletableFuture<ReviewDiagnosticReportResponse> reviewDiagnosticReport(ReviewDiagnosticReportRequest request);

    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    CompletableFuture<SetInstanceAutoReleaseTimeResponse> setInstanceAutoReleaseTime(SetInstanceAutoReleaseTimeRequest request);

    CompletableFuture<StartNetworkInsightsAnalysisResponse> startNetworkInsightsAnalysis(StartNetworkInsightsAnalysisRequest request);

    CompletableFuture<UpdateServiceSettingsResponse> updateServiceSettings(UpdateServiceSettingsRequest request);

    CompletableFuture<UnmountPEDiskResponse> unmountPEDisk(UnmountPEDiskRequest request);

}
