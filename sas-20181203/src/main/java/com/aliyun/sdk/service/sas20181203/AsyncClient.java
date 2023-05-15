// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sas20181203.models.*;
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

    CompletableFuture<AddAssetSelectionCriteriaResponse> addAssetSelectionCriteria(AddAssetSelectionCriteriaRequest request);

    CompletableFuture<AddCheckInstanceResultWhiteListResponse> addCheckInstanceResultWhiteList(AddCheckInstanceResultWhiteListRequest request);

    CompletableFuture<AddCheckResultWhiteListResponse> addCheckResultWhiteList(AddCheckResultWhiteListRequest request);

    CompletableFuture<AddClientUserDefineRuleResponse> addClientUserDefineRule(AddClientUserDefineRuleRequest request);

    CompletableFuture<AddInstallCodeResponse> addInstallCode(AddInstallCodeRequest request);

    CompletableFuture<AddPrivateRegistryResponse> addPrivateRegistry(AddPrivateRegistryRequest request);

    /**
      * Security Center provides asset importance tags and custom tags. You can call the AddTagWithUuid operation to add only a custom tag to assets.
      *
     */
    CompletableFuture<AddTagWithUuidResponse> addTagWithUuid(AddTagWithUuidRequest request);

    CompletableFuture<AddUninstallClientsByUuidsResponse> addUninstallClientsByUuids(AddUninstallClientsByUuidsRequest request);

    CompletableFuture<AddVpcHoneyPotResponse> addVpcHoneyPot(AddVpcHoneyPotRequest request);

    CompletableFuture<AdvanceSecurityEventOperationsResponse> advanceSecurityEventOperations(AdvanceSecurityEventOperationsRequest request);

    CompletableFuture<BatchOperateCommonOverallConfigResponse> batchOperateCommonOverallConfig(BatchOperateCommonOverallConfigRequest request);

    CompletableFuture<BindAuthToMachineResponse> bindAuthToMachine(BindAuthToMachineRequest request);

    CompletableFuture<CancelOnceTaskResponse> cancelOnceTask(CancelOnceTaskRequest request);

    CompletableFuture<ChangeCheckConfigResponse> changeCheckConfig(ChangeCheckConfigRequest request);

    CompletableFuture<ChangeCheckCustomConfigResponse> changeCheckCustomConfig(ChangeCheckCustomConfigRequest request);

    CompletableFuture<CheckQuaraFileIdResponse> checkQuaraFileId(CheckQuaraFileIdRequest request);

    CompletableFuture<CheckSecurityEventIdResponse> checkSecurityEventId(CheckSecurityEventIdRequest request);

    CompletableFuture<CheckUserHasEcsResponse> checkUserHasEcs(CheckUserHasEcsRequest request);

    CompletableFuture<ConfirmVirusEventsResponse> confirmVirusEvents(ConfirmVirusEventsRequest request);

    CompletableFuture<CreateAntiBruteForceRuleResponse> createAntiBruteForceRule(CreateAntiBruteForceRuleRequest request);

    CompletableFuture<CreateAssetSelectionConfigResponse> createAssetSelectionConfig(CreateAssetSelectionConfigRequest request);

    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    CompletableFuture<CreateContainerScanTaskResponse> createContainerScanTask(CreateContainerScanTaskRequest request);

    CompletableFuture<CreateCustomBlockRecordResponse> createCustomBlockRecord(CreateCustomBlockRecordRequest request);

    CompletableFuture<CreateCycleTaskResponse> createCycleTask(CreateCycleTaskRequest request);

    /**
      * The identifier of the file. Only MD5 hash values are supported.
      *
     */
    CompletableFuture<CreateFileDetectResponse> createFileDetect(CreateFileDetectRequest request);

    /**
      * You can call this operation to query the parameters that are required to upload a file for detection. If the value of the response parameter FileExist is true, the file that you want to upload for detection already exists in the cloud. In this case, you can directly push the file for detection. If the value of the response parameter FileExist is false, you must use the form upload method to upload the file to the specified Object Storage Service (OSS) bucket based on the response parameters of this operation.
      * The form upload method is provided by OSS. For more information, see [Form upload](~~84788~~).
      * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.
      *
     */
    CompletableFuture<CreateFileDetectUploadUrlResponse> createFileDetectUploadUrl(CreateFileDetectUploadUrlRequest request);

    CompletableFuture<CreateHoneypotResponse> createHoneypot(CreateHoneypotRequest request);

    CompletableFuture<CreateHoneypotNodeResponse> createHoneypotNode(CreateHoneypotNodeRequest request);

    CompletableFuture<CreateHoneypotPresetResponse> createHoneypotPreset(CreateHoneypotPresetRequest request);

    CompletableFuture<CreateHoneypotProbeResponse> createHoneypotProbe(CreateHoneypotProbeRequest request);

    CompletableFuture<CreateInterceptionRuleResponse> createInterceptionRule(CreateInterceptionRuleRequest request);

    CompletableFuture<CreateInterceptionTargetResponse> createInterceptionTarget(CreateInterceptionTargetRequest request);

    CompletableFuture<CreateJenkinsImageRegistryResponse> createJenkinsImageRegistry(CreateJenkinsImageRegistryRequest request);

    /**
      * The ID of the request, which is used to locate and troubleshoot issues.
      *
     */
    CompletableFuture<CreateOrUpdateAssetGroupResponse> createOrUpdateAssetGroup(CreateOrUpdateAssetGroupRequest request);

    CompletableFuture<CreateOrUpdateDingTalkResponse> createOrUpdateDingTalk(CreateOrUpdateDingTalkRequest request);

    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request);

    CompletableFuture<CreateSuspEventNoteResponse> createSuspEventNote(CreateSuspEventNoteRequest request);

    CompletableFuture<CreateUniBackupPolicyResponse> createUniBackupPolicy(CreateUniBackupPolicyRequest request);

    CompletableFuture<CreateUniRestorePlanResponse> createUniRestorePlan(CreateUniRestorePlanRequest request);

    CompletableFuture<CreateVulAutoRepairConfigResponse> createVulAutoRepairConfig(CreateVulAutoRepairConfigRequest request);

    CompletableFuture<DeleteAntiBruteForceRuleResponse> deleteAntiBruteForceRule(DeleteAntiBruteForceRuleRequest request);

    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    CompletableFuture<DeleteBackupPolicyMachineResponse> deleteBackupPolicyMachine(DeleteBackupPolicyMachineRequest request);

    CompletableFuture<DeleteClientUserDefineRuleResponse> deleteClientUserDefineRule(DeleteClientUserDefineRuleRequest request);

    CompletableFuture<DeleteCustomBlockRecordResponse> deleteCustomBlockRecord(DeleteCustomBlockRecordRequest request);

    CompletableFuture<DeleteCycleTaskResponse> deleteCycleTask(DeleteCycleTaskRequest request);

    /**
      * 200
      *
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteHoneypotResponse> deleteHoneypot(DeleteHoneypotRequest request);

    CompletableFuture<DeleteHoneypotNodeResponse> deleteHoneypotNode(DeleteHoneypotNodeRequest request);

    CompletableFuture<DeleteHoneypotPresetResponse> deleteHoneypotPreset(DeleteHoneypotPresetRequest request);

    CompletableFuture<DeleteHoneypotProbeResponse> deleteHoneypotProbe(DeleteHoneypotProbeRequest request);

    CompletableFuture<DeleteInstallCodeResponse> deleteInstallCode(DeleteInstallCodeRequest request);

    CompletableFuture<DeleteInterceptionRuleResponse> deleteInterceptionRule(DeleteInterceptionRuleRequest request);

    CompletableFuture<DeleteInterceptionTargetResponse> deleteInterceptionTarget(DeleteInterceptionTargetRequest request);

    CompletableFuture<DeleteLoginBaseConfigResponse> deleteLoginBaseConfig(DeleteLoginBaseConfigRequest request);

    CompletableFuture<DeletePrivateRegistryResponse> deletePrivateRegistry(DeletePrivateRegistryRequest request);

    CompletableFuture<DeleteSecurityEventMarkMissListResponse> deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request);

    CompletableFuture<DeleteStrategyResponse> deleteStrategy(DeleteStrategyRequest request);

    CompletableFuture<DeleteSuspEventNodeResponse> deleteSuspEventNode(DeleteSuspEventNodeRequest request);

    /**
      * The ID of the request, which is used to locate and troubleshoot issues.
      *
     */
    CompletableFuture<DeleteTagWithUuidResponse> deleteTagWithUuid(DeleteTagWithUuidRequest request);

    CompletableFuture<DeleteUniBackupPolicyResponse> deleteUniBackupPolicy(DeleteUniBackupPolicyRequest request);

    CompletableFuture<DeleteVpcHoneyPotResponse> deleteVpcHoneyPot(DeleteVpcHoneyPotRequest request);

    CompletableFuture<DeleteVulWhitelistResponse> deleteVulWhitelist(DeleteVulWhitelistRequest request);

    CompletableFuture<DescribeAccessKeyLeakDetailResponse> describeAccessKeyLeakDetail(DescribeAccessKeyLeakDetailRequest request);

    CompletableFuture<DescribeAccesskeyLeakListResponse> describeAccesskeyLeakList(DescribeAccesskeyLeakListRequest request);

    CompletableFuture<DescribeAffectedAssetsResponse> describeAffectedAssets(DescribeAffectedAssetsRequest request);

    CompletableFuture<DescribeAffectedMaliciousFileImagesResponse> describeAffectedMaliciousFileImages(DescribeAffectedMaliciousFileImagesRequest request);

    CompletableFuture<DescribeAgentInstallStatusResponse> describeAgentInstallStatus(DescribeAgentInstallStatusRequest request);

    CompletableFuture<DescribeAlarmEventDetailResponse> describeAlarmEventDetail(DescribeAlarmEventDetailRequest request);

    CompletableFuture<DescribeAlarmEventStackInfoResponse> describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request);

    CompletableFuture<DescribeAllEntityResponse> describeAllEntity(DescribeAllEntityRequest request);

    CompletableFuture<DescribeAllGroupsResponse> describeAllGroups(DescribeAllGroupsRequest request);

    CompletableFuture<DescribeAllImageBaselineResponse> describeAllImageBaseline(DescribeAllImageBaselineRequest request);

    CompletableFuture<DescribeAntiBruteForceRulesResponse> describeAntiBruteForceRules(DescribeAntiBruteForceRulesRequest request);

    CompletableFuture<DescribeAppVulScanCycleResponse> describeAppVulScanCycle(DescribeAppVulScanCycleRequest request);

    CompletableFuture<DescribeAssetDetailByUuidResponse> describeAssetDetailByUuid(DescribeAssetDetailByUuidRequest request);

    CompletableFuture<DescribeAssetDetailByUuidsResponse> describeAssetDetailByUuids(DescribeAssetDetailByUuidsRequest request);

    CompletableFuture<DescribeAssetSummaryResponse> describeAssetSummary(DescribeAssetSummaryRequest request);

    CompletableFuture<DescribeAssetsSecurityEventSummaryResponse> describeAssetsSecurityEventSummary(DescribeAssetsSecurityEventSummaryRequest request);

    CompletableFuture<DescribeAttackAnalysisDataResponse> describeAttackAnalysisData(DescribeAttackAnalysisDataRequest request);

    CompletableFuture<DescribeAutoDelConfigResponse> describeAutoDelConfig(DescribeAutoDelConfigRequest request);

    CompletableFuture<DescribeBackUpExportInfoResponse> describeBackUpExportInfo(DescribeBackUpExportInfoRequest request);

    /**
      * The data returned.
      *
     */
    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request);

    CompletableFuture<DescribeBackupMachineStatusResponse> describeBackupMachineStatus(DescribeBackupMachineStatusRequest request);

    CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
      * The number of the restoration tasks that are in the **being restored** state.
      *
     */
    CompletableFuture<DescribeBackupRestoreCountResponse> describeBackupRestoreCount(DescribeBackupRestoreCountRequest request);

    CompletableFuture<DescribeBruteForceRecordsResponse> describeBruteForceRecords(DescribeBruteForceRecordsRequest request);

    CompletableFuture<DescribeBruteForceSummaryResponse> describeBruteForceSummary(DescribeBruteForceSummaryRequest request);

    CompletableFuture<DescribeCheckEcsWarningsResponse> describeCheckEcsWarnings(DescribeCheckEcsWarningsRequest request);

    CompletableFuture<DescribeCheckFixDetailsResponse> describeCheckFixDetails(DescribeCheckFixDetailsRequest request);

    CompletableFuture<DescribeCheckWarningDetailResponse> describeCheckWarningDetail(DescribeCheckWarningDetailRequest request);

    CompletableFuture<DescribeCheckWarningMachinesResponse> describeCheckWarningMachines(DescribeCheckWarningMachinesRequest request);

    CompletableFuture<DescribeCheckWarningSummaryResponse> describeCheckWarningSummary(DescribeCheckWarningSummaryRequest request);

    CompletableFuture<DescribeCheckWarningsResponse> describeCheckWarnings(DescribeCheckWarningsRequest request);

    CompletableFuture<DescribeClientConfSetupResponse> describeClientConfSetup(DescribeClientConfSetupRequest request);

    CompletableFuture<DescribeClientConfStrategyResponse> describeClientConfStrategy(DescribeClientConfStrategyRequest request);

    /**
      * You can search for assets by using search conditions, such as the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can also configure a logical relationship between multiple search conditions to search for the assets that meet the search conditions.
      *
     */
    CompletableFuture<DescribeCloudCenterInstancesResponse> describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request);

    CompletableFuture<DescribeCloudProductFieldStatisticsResponse> describeCloudProductFieldStatistics(DescribeCloudProductFieldStatisticsRequest request);

    CompletableFuture<DescribeClusterBasicInfoResponse> describeClusterBasicInfo(DescribeClusterBasicInfoRequest request);

    CompletableFuture<DescribeClusterInfoListResponse> describeClusterInfoList(DescribeClusterInfoListRequest request);

    CompletableFuture<DescribeClusterNetworkResponse> describeClusterNetwork(DescribeClusterNetworkRequest request);

    CompletableFuture<DescribeClusterVulStatisticsResponse> describeClusterVulStatistics(DescribeClusterVulStatisticsRequest request);

    CompletableFuture<DescribeCommonOverallConfigResponse> describeCommonOverallConfig(DescribeCommonOverallConfigRequest request);

    CompletableFuture<DescribeCommonOverallConfigListResponse> describeCommonOverallConfigList(DescribeCommonOverallConfigListRequest request);

    CompletableFuture<DescribeCommonTargetConfigResponse> describeCommonTargetConfig(DescribeCommonTargetConfigRequest request);

    CompletableFuture<DescribeCommonTargetResultListResponse> describeCommonTargetResultList(DescribeCommonTargetResultListRequest request);

    CompletableFuture<DescribeConcernNecessityResponse> describeConcernNecessity(DescribeConcernNecessityRequest request);

    CompletableFuture<DescribeContainerCriteriaResponse> describeContainerCriteria(DescribeContainerCriteriaRequest request);

    CompletableFuture<DescribeContainerInstancesResponse> describeContainerInstances(DescribeContainerInstancesRequest request);

    /**
      * The number of nodes on which alerts are generated in the current container cluster.
      *
     */
    CompletableFuture<DescribeContainerStatisticsResponse> describeContainerStatistics(DescribeContainerStatisticsRequest request);

    CompletableFuture<DescribeContainerTagsResponse> describeContainerTags(DescribeContainerTagsRequest request);

    CompletableFuture<DescribeCountNotScannedImageResponse> describeCountNotScannedImage(DescribeCountNotScannedImageRequest request);

    CompletableFuture<DescribeCountScannedImageResponse> describeCountScannedImage(DescribeCountScannedImageRequest request);

    CompletableFuture<DescribeCriteriaResponse> describeCriteria(DescribeCriteriaRequest request);

    CompletableFuture<DescribeCustomBlockRecordsResponse> describeCustomBlockRecords(DescribeCustomBlockRecordsRequest request);

    CompletableFuture<DescribeCycleTaskListResponse> describeCycleTaskList(DescribeCycleTaskListRequest request);

    CompletableFuture<DescribeDingTalkResponse> describeDingTalk(DescribeDingTalkRequest request);

    CompletableFuture<DescribeDomainCountResponse> describeDomainCount(DescribeDomainCountRequest request);

    CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request);

    CompletableFuture<DescribeDomainListResponse> describeDomainList(DescribeDomainListRequest request);

    CompletableFuture<DescribeEmgUserAgreementResponse> describeEmgUserAgreement(DescribeEmgUserAgreementRequest request);

    CompletableFuture<DescribeEmgVulItemResponse> describeEmgVulItem(DescribeEmgVulItemRequest request);

    CompletableFuture<DescribeEventLevelCountResponse> describeEventLevelCount(DescribeEventLevelCountRequest request);

    CompletableFuture<DescribeEventOnStageResponse> describeEventOnStage(DescribeEventOnStageRequest request);

    CompletableFuture<DescribeExcludeSystemPathResponse> describeExcludeSystemPath(DescribeExcludeSystemPathRequest request);

    CompletableFuture<DescribeExportInfoResponse> describeExportInfo(DescribeExportInfoRequest request);

    CompletableFuture<DescribeExposedCheckWarningResponse> describeExposedCheckWarning(DescribeExposedCheckWarningRequest request);

    CompletableFuture<DescribeExposedInstanceCriteriaResponse> describeExposedInstanceCriteria(DescribeExposedInstanceCriteriaRequest request);

    CompletableFuture<DescribeExposedInstanceDetailResponse> describeExposedInstanceDetail(DescribeExposedInstanceDetailRequest request);

    CompletableFuture<DescribeExposedInstanceListResponse> describeExposedInstanceList(DescribeExposedInstanceListRequest request);

    CompletableFuture<DescribeExposedStatisticsResponse> describeExposedStatistics(DescribeExposedStatisticsRequest request);

    CompletableFuture<DescribeExposedStatisticsDetailResponse> describeExposedStatisticsDetail(DescribeExposedStatisticsDetailRequest request);

    CompletableFuture<DescribeFieldStatisticsResponse> describeFieldStatistics(DescribeFieldStatisticsRequest request);

    CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request);

    CompletableFuture<DescribeGroupStructResponse> describeGroupStruct(DescribeGroupStructRequest request);

    CompletableFuture<DescribeGroupedContainerInstancesResponse> describeGroupedContainerInstances(DescribeGroupedContainerInstancesRequest request);

    CompletableFuture<DescribeGroupedInstancesResponse> describeGroupedInstances(DescribeGroupedInstancesRequest request);

    CompletableFuture<DescribeGroupedMaliciousFilesResponse> describeGroupedMaliciousFiles(DescribeGroupedMaliciousFilesRequest request);

    CompletableFuture<DescribeGroupedTagsResponse> describeGroupedTags(DescribeGroupedTagsRequest request);

    CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request);

    CompletableFuture<DescribeHcExportInfoResponse> describeHcExportInfo(DescribeHcExportInfoRequest request);

    CompletableFuture<DescribeHoneyPotAuthResponse> describeHoneyPotAuth(DescribeHoneyPotAuthRequest request);

    CompletableFuture<DescribeHoneyPotSuspStatisticsResponse> describeHoneyPotSuspStatistics(DescribeHoneyPotSuspStatisticsRequest request);

    CompletableFuture<DescribeImageResponse> describeImage(DescribeImageRequest request);

    CompletableFuture<DescribeImageBaselineCheckResultResponse> describeImageBaselineCheckResult(DescribeImageBaselineCheckResultRequest request);

    CompletableFuture<DescribeImageBaselineCheckSummaryResponse> describeImageBaselineCheckSummary(DescribeImageBaselineCheckSummaryRequest request);

    CompletableFuture<DescribeImageBaselineDetailResponse> describeImageBaselineDetail(DescribeImageBaselineDetailRequest request);

    CompletableFuture<DescribeImageBaselineItemListResponse> describeImageBaselineItemList(DescribeImageBaselineItemListRequest request);

    CompletableFuture<DescribeImageBaselineStrategyResponse> describeImageBaselineStrategy(DescribeImageBaselineStrategyRequest request);

    CompletableFuture<DescribeImageCriteriaResponse> describeImageCriteria(DescribeImageCriteriaRequest request);

    CompletableFuture<DescribeImageFixTaskResponse> describeImageFixTask(DescribeImageFixTaskRequest request);

    CompletableFuture<DescribeImageGroupedVulListResponse> describeImageGroupedVulList(DescribeImageGroupedVulListRequest request);

    CompletableFuture<DescribeImageInfoListResponse> describeImageInfoList(DescribeImageInfoListRequest request);

    CompletableFuture<DescribeImageInstancesResponse> describeImageInstances(DescribeImageInstancesRequest request);

    CompletableFuture<DescribeImageLatestScanTaskResponse> describeImageLatestScanTask(DescribeImageLatestScanTaskRequest request);

    CompletableFuture<DescribeImageListBySensitiveFileResponse> describeImageListBySensitiveFile(DescribeImageListBySensitiveFileRequest request);

    CompletableFuture<DescribeImageListWithBaselineNameResponse> describeImageListWithBaselineName(DescribeImageListWithBaselineNameRequest request);

    CompletableFuture<DescribeImageRepoCriteriaResponse> describeImageRepoCriteria(DescribeImageRepoCriteriaRequest request);

    CompletableFuture<DescribeImageRepoDetailListResponse> describeImageRepoDetailList(DescribeImageRepoDetailListRequest request);

    CompletableFuture<DescribeImageRepoListResponse> describeImageRepoList(DescribeImageRepoListRequest request);

    CompletableFuture<DescribeImageScanAuthCountResponse> describeImageScanAuthCount(DescribeImageScanAuthCountRequest request);

    CompletableFuture<DescribeImageScanAuthorizationResponse> describeImageScanAuthorization(DescribeImageScanAuthorizationRequest request);

    CompletableFuture<DescribeImageSensitiveFileByKeyResponse> describeImageSensitiveFileByKey(DescribeImageSensitiveFileByKeyRequest request);

    CompletableFuture<DescribeImageSensitiveFileListResponse> describeImageSensitiveFileList(DescribeImageSensitiveFileListRequest request);

    /**
      * Queries the risk statistics of container images.
      *
     */
    CompletableFuture<DescribeImageStatisticsResponse> describeImageStatistics(DescribeImageStatisticsRequest request);

    /**
      * To query the information about the recently detected image vulnerabilities, call the [PublicCreateImageScanTask](~~PublicCreateImageScanTask~~) operation. Wait 1 to 5 minutes until the call is successful and call the DescribeImageVulList operation.
      *
     */
    CompletableFuture<DescribeImageVulListResponse> describeImageVulList(DescribeImageVulListRequest request);

    CompletableFuture<DescribeInstallCaptchaResponse> describeInstallCaptcha(DescribeInstallCaptchaRequest request);

    CompletableFuture<DescribeInstallCodeResponse> describeInstallCode(DescribeInstallCodeRequest request);

    /**
      * The ID of the server group to which the server belongs.
      *
     */
    CompletableFuture<DescribeInstallCodesResponse> describeInstallCodes(DescribeInstallCodesRequest request);

    CompletableFuture<DescribeInstanceAntiBruteForceRulesResponse> describeInstanceAntiBruteForceRules(DescribeInstanceAntiBruteForceRulesRequest request);

    CompletableFuture<DescribeInstanceRebootStatusResponse> describeInstanceRebootStatus(DescribeInstanceRebootStatusRequest request);

    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    CompletableFuture<DescribeIpTagsResponse> describeIpTags(DescribeIpTagsRequest request);

    CompletableFuture<DescribeLatestScanTaskResponse> describeLatestScanTask(DescribeLatestScanTaskRequest request);

    CompletableFuture<DescribeLogMetaResponse> describeLogMeta(DescribeLogMetaRequest request);

    CompletableFuture<DescribeLogShipperStatusResponse> describeLogShipperStatus(DescribeLogShipperStatusRequest request);

    CompletableFuture<DescribeLoginBaseConfigsResponse> describeLoginBaseConfigs(DescribeLoginBaseConfigsRequest request);

    CompletableFuture<DescribeLoginSwitchConfigsResponse> describeLoginSwitchConfigs(DescribeLoginSwitchConfigsRequest request);

    CompletableFuture<DescribeLogstoreStorageResponse> describeLogstoreStorage(DescribeLogstoreStorageRequest request);

    CompletableFuture<DescribeMachineCanRebootResponse> describeMachineCanReboot(DescribeMachineCanRebootRequest request);

    CompletableFuture<DescribeModuleConfigResponse> describeModuleConfig(DescribeModuleConfigRequest request);

    CompletableFuture<DescribeNoticeConfigResponse> describeNoticeConfig(DescribeNoticeConfigRequest request);

    CompletableFuture<DescribeNsasSuspEventTypeResponse> describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request);

    CompletableFuture<DescribeOfflineMachinesResponse> describeOfflineMachines(DescribeOfflineMachinesRequest request);

    CompletableFuture<DescribeOnceTaskResponse> describeOnceTask(DescribeOnceTaskRequest request);

    CompletableFuture<DescribeOnceTaskLeafRecordPageResponse> describeOnceTaskLeafRecordPage(DescribeOnceTaskLeafRecordPageRequest request);

    CompletableFuture<DescribePropertyCountResponse> describePropertyCount(DescribePropertyCountRequest request);

    CompletableFuture<DescribePropertyCronDetailResponse> describePropertyCronDetail(DescribePropertyCronDetailRequest request);

    CompletableFuture<DescribePropertyCronItemResponse> describePropertyCronItem(DescribePropertyCronItemRequest request);

    CompletableFuture<DescribePropertyPortDetailResponse> describePropertyPortDetail(DescribePropertyPortDetailRequest request);

    CompletableFuture<DescribePropertyPortItemResponse> describePropertyPortItem(DescribePropertyPortItemRequest request);

    CompletableFuture<DescribePropertyProcDetailResponse> describePropertyProcDetail(DescribePropertyProcDetailRequest request);

    CompletableFuture<DescribePropertyProcItemResponse> describePropertyProcItem(DescribePropertyProcItemRequest request);

    CompletableFuture<DescribePropertyScaDetailResponse> describePropertyScaDetail(DescribePropertyScaDetailRequest request);

    CompletableFuture<DescribePropertyScaItemResponse> describePropertyScaItem(DescribePropertyScaItemRequest request);

    CompletableFuture<DescribePropertyScheduleConfigResponse> describePropertyScheduleConfig(DescribePropertyScheduleConfigRequest request);

    CompletableFuture<DescribePropertySoftwareDetailResponse> describePropertySoftwareDetail(DescribePropertySoftwareDetailRequest request);

    CompletableFuture<DescribePropertySoftwareItemResponse> describePropertySoftwareItem(DescribePropertySoftwareItemRequest request);

    CompletableFuture<DescribePropertyTypeScaItemResponse> describePropertyTypeScaItem(DescribePropertyTypeScaItemRequest request);

    CompletableFuture<DescribePropertyUsageNewestResponse> describePropertyUsageNewest(DescribePropertyUsageNewestRequest request);

    CompletableFuture<DescribePropertyUserDetailResponse> describePropertyUserDetail(DescribePropertyUserDetailRequest request);

    CompletableFuture<DescribePropertyUserItemResponse> describePropertyUserItem(DescribePropertyUserItemRequest request);

    CompletableFuture<DescribeQuaraFileDownloadInfoResponse> describeQuaraFileDownloadInfo(DescribeQuaraFileDownloadInfoRequest request);

    /**
      * The name of the CSV file. The CSV file contains the files that fail to be restored.
      *
     */
    CompletableFuture<DescribeRestoreJobsResponse> describeRestoreJobs(DescribeRestoreJobsRequest request);

    CompletableFuture<DescribeRestorePlansResponse> describeRestorePlans(DescribeRestorePlansRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the ListCheckInstanceResult operation.
      *
     */
    CompletableFuture<DescribeRiskCheckItemResultResponse> describeRiskCheckItemResult(DescribeRiskCheckItemResultRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the ListCheckResult operation.
      *
     */
    CompletableFuture<DescribeRiskCheckResultResponse> describeRiskCheckResult(DescribeRiskCheckResultRequest request);

    /**
      * @deprecated
      * The number of detected risk items.
      *
     */
    CompletableFuture<DescribeRiskCheckSummaryResponse> describeRiskCheckSummary(DescribeRiskCheckSummaryRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the ListCheckStandard operation instead.
      *
     */
    CompletableFuture<DescribeRiskItemTypeResponse> describeRiskItemType(DescribeRiskItemTypeRequest request);

    /**
      * @deprecated
      * The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).
      * > If you do not specify this parameter, an empty list is returned.
      *
     */
    CompletableFuture<DescribeRiskListCheckResultResponse> describeRiskListCheckResult(DescribeRiskListCheckResultRequest request);

    CompletableFuture<DescribeRiskTypeResponse> describeRiskType(DescribeRiskTypeRequest request);

    CompletableFuture<DescribeRisksResponse> describeRisks(DescribeRisksRequest request);

    CompletableFuture<DescribeSasPmAgentListResponse> describeSasPmAgentList(DescribeSasPmAgentListRequest request);

    CompletableFuture<DescribeScanTaskProgressResponse> describeScanTaskProgress(DescribeScanTaskProgressRequest request);

    CompletableFuture<DescribeScanTaskStatisticsResponse> describeScanTaskStatistics(DescribeScanTaskStatisticsRequest request);

    CompletableFuture<DescribeSearchConditionResponse> describeSearchCondition(DescribeSearchConditionRequest request);

    CompletableFuture<DescribeSecureSuggestionResponse> describeSecureSuggestion(DescribeSecureSuggestionRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the GetCheckConfig operation.
      *
     */
    CompletableFuture<DescribeSecurityCheckScheduleConfigResponse> describeSecurityCheckScheduleConfig(DescribeSecurityCheckScheduleConfigRequest request);

    CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request);

    CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request);

    CompletableFuture<DescribeSecurityStatInfoResponse> describeSecurityStatInfo(DescribeSecurityStatInfoRequest request);

    CompletableFuture<DescribeServiceLinkedRoleStatusResponse> describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request);

    CompletableFuture<DescribeSimilarEventScenariosResponse> describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request);

    CompletableFuture<DescribeSimilarSecurityEventsResponse> describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeStrategyResponse> describeStrategy(DescribeStrategyRequest request);

    CompletableFuture<DescribeStrategyDetailResponse> describeStrategyDetail(DescribeStrategyDetailRequest request);

    CompletableFuture<DescribeStrategyExecDetailResponse> describeStrategyExecDetail(DescribeStrategyExecDetailRequest request);

    CompletableFuture<DescribeStrategyTargetResponse> describeStrategyTarget(DescribeStrategyTargetRequest request);

    CompletableFuture<DescribeSummaryInfoResponse> describeSummaryInfo(DescribeSummaryInfoRequest request);

    CompletableFuture<DescribeSupportRegionResponse> describeSupportRegion(DescribeSupportRegionRequest request);

    CompletableFuture<DescribeSuspEventDetailResponse> describeSuspEventDetail(DescribeSuspEventDetailRequest request);

    CompletableFuture<DescribeSuspEventExportInfoResponse> describeSuspEventExportInfo(DescribeSuspEventExportInfoRequest request);

    CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request);

    CompletableFuture<DescribeSuspEventUserSettingResponse> describeSuspEventUserSetting(DescribeSuspEventUserSettingRequest request);

    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    CompletableFuture<DescribeSuspiciousOverallConfigResponse> describeSuspiciousOverallConfig(DescribeSuspiciousOverallConfigRequest request);

    CompletableFuture<DescribeSuspiciousUUIDConfigResponse> describeSuspiciousUUIDConfig(DescribeSuspiciousUUIDConfigRequest request);

    CompletableFuture<DescribeTargetResponse> describeTarget(DescribeTargetRequest request);

    CompletableFuture<DescribeTaskErrorLogResponse> describeTaskErrorLog(DescribeTaskErrorLogRequest request);

    CompletableFuture<DescribeTotalStatisticsResponse> describeTotalStatistics(DescribeTotalStatisticsRequest request);

    CompletableFuture<DescribeTraceInfoDetailResponse> describeTraceInfoDetail(DescribeTraceInfoDetailRequest request);

    CompletableFuture<DescribeTraceInfoNodeResponse> describeTraceInfoNode(DescribeTraceInfoNodeRequest request);

    CompletableFuture<DescribeUniBackupDatabaseResponse> describeUniBackupDatabase(DescribeUniBackupDatabaseRequest request);

    CompletableFuture<DescribeUniBackupPoliciesResponse> describeUniBackupPolicies(DescribeUniBackupPoliciesRequest request);

    CompletableFuture<DescribeUniBackupPolicyDetailResponse> describeUniBackupPolicyDetail(DescribeUniBackupPolicyDetailRequest request);

    CompletableFuture<DescribeUniRecoverableListResponse> describeUniRecoverableList(DescribeUniRecoverableListRequest request);

    CompletableFuture<DescribeUniSupportRegionResponse> describeUniSupportRegion(DescribeUniSupportRegionRequest request);

    CompletableFuture<DescribeUserBackupMachinesResponse> describeUserBackupMachines(DescribeUserBackupMachinesRequest request);

    CompletableFuture<DescribeUserBaselineAuthorizationResponse> describeUserBaselineAuthorization(DescribeUserBaselineAuthorizationRequest request);

    CompletableFuture<DescribeUserLayoutAuthorizationResponse> describeUserLayoutAuthorization(DescribeUserLayoutAuthorizationRequest request);

    CompletableFuture<DescribeUuidsByVulNamesResponse> describeUuidsByVulNames(DescribeUuidsByVulNamesRequest request);

    CompletableFuture<DescribeVendorListResponse> describeVendorList(DescribeVendorListRequest request);

    CompletableFuture<DescribeVersionConfigResponse> describeVersionConfig(DescribeVersionConfigRequest request);

    CompletableFuture<DescribeVpcHoneyPotCriteriaResponse> describeVpcHoneyPotCriteria(DescribeVpcHoneyPotCriteriaRequest request);

    /**
      * If you specify only the Action request parameter in your request, Security Center returns the list of all VPCs regardless of whether a honeypot is deployed on a VPC.
      *
     */
    CompletableFuture<DescribeVpcHoneyPotListResponse> describeVpcHoneyPotList(DescribeVpcHoneyPotListRequest request);

    CompletableFuture<DescribeVpcListResponse> describeVpcList(DescribeVpcListRequest request);

    CompletableFuture<DescribeVulCheckTaskStatusDetailResponse> describeVulCheckTaskStatusDetail(DescribeVulCheckTaskStatusDetailRequest request);

    CompletableFuture<DescribeVulConfigResponse> describeVulConfig(DescribeVulConfigRequest request);

    CompletableFuture<DescribeVulDetailsResponse> describeVulDetails(DescribeVulDetailsRequest request);

    /**
      * If the value of ExportStatus is success, the URL at which you can download the exported Excel file is returned.
      *
     */
    CompletableFuture<DescribeVulExportInfoResponse> describeVulExportInfo(DescribeVulExportInfoRequest request);

    CompletableFuture<DescribeVulFixStatisticsResponse> describeVulFixStatistics(DescribeVulFixStatisticsRequest request);

    CompletableFuture<DescribeVulListResponse> describeVulList(DescribeVulListRequest request);

    CompletableFuture<DescribeVulListPageResponse> describeVulListPage(DescribeVulListPageRequest request);

    CompletableFuture<DescribeVulNumStatisticsResponse> describeVulNumStatistics(DescribeVulNumStatisticsRequest request);

    CompletableFuture<DescribeVulTargetConfigResponse> describeVulTargetConfig(DescribeVulTargetConfigRequest request);

    CompletableFuture<DescribeVulTargetStatisticsResponse> describeVulTargetStatistics(DescribeVulTargetStatisticsRequest request);

    CompletableFuture<DescribeVulWhitelistResponse> describeVulWhitelist(DescribeVulWhitelistRequest request);

    CompletableFuture<DescribeWarningExportInfoResponse> describeWarningExportInfo(DescribeWarningExportInfoRequest request);

    CompletableFuture<DescribeWarningMachinesResponse> describeWarningMachines(DescribeWarningMachinesRequest request);

    CompletableFuture<DescribeWebLockBindListResponse> describeWebLockBindList(DescribeWebLockBindListRequest request);

    CompletableFuture<DescribeWebLockConfigListResponse> describeWebLockConfigList(DescribeWebLockConfigListRequest request);

    CompletableFuture<DescribeWebLockExclusiveFileTypeResponse> describeWebLockExclusiveFileType(DescribeWebLockExclusiveFileTypeRequest request);

    CompletableFuture<DescribeWebLockFileChangeStatisticsResponse> describeWebLockFileChangeStatistics(DescribeWebLockFileChangeStatisticsRequest request);

    CompletableFuture<DescribeWebLockFileEventsResponse> describeWebLockFileEvents(DescribeWebLockFileEventsRequest request);

    CompletableFuture<DescribeWebLockFileTypeSummaryResponse> describeWebLockFileTypeSummary(DescribeWebLockFileTypeSummaryRequest request);

    CompletableFuture<DescribeWebLockInclusiveFileTypeResponse> describeWebLockInclusiveFileType(DescribeWebLockInclusiveFileTypeRequest request);

    CompletableFuture<DescribeWebLockProcessBlockStatisticsResponse> describeWebLockProcessBlockStatistics(DescribeWebLockProcessBlockStatisticsRequest request);

    CompletableFuture<DescribeWebLockProcessListResponse> describeWebLockProcessList(DescribeWebLockProcessListRequest request);

    CompletableFuture<DescribeWebLockStatusResponse> describeWebLockStatus(DescribeWebLockStatusRequest request);

    CompletableFuture<DescribeWebLockTotalFileChangeCountResponse> describeWebLockTotalFileChangeCount(DescribeWebLockTotalFileChangeCountRequest request);

    CompletableFuture<DescribeWebPathResponse> describeWebPath(DescribeWebPathRequest request);

    CompletableFuture<DisableBruteForceRecordResponse> disableBruteForceRecord(DisableBruteForceRecordRequest request);

    CompletableFuture<DisableCustomBlockRecordResponse> disableCustomBlockRecord(DisableCustomBlockRecordRequest request);

    CompletableFuture<EnableBruteForceRecordResponse> enableBruteForceRecord(EnableBruteForceRecordRequest request);

    CompletableFuture<EnableCustomBlockRecordResponse> enableCustomBlockRecord(EnableCustomBlockRecordRequest request);

    CompletableFuture<ExecStrategyResponse> execStrategy(ExecStrategyRequest request);

    /**
      * The ID of the exported file.
      *
     */
    CompletableFuture<ExportRecordResponse> exportRecord(ExportRecordRequest request);

    CompletableFuture<ExportSuspEventsResponse> exportSuspEvents(ExportSuspEventsRequest request);

    /**
      * The ID of the exported file.
      *
     */
    CompletableFuture<ExportVulResponse> exportVul(ExportVulRequest request);

    CompletableFuture<ExportWarningResponse> exportWarning(ExportWarningRequest request);

    CompletableFuture<FindContainerNetworkConnectResponse> findContainerNetworkConnect(FindContainerNetworkConnectRequest request);

    CompletableFuture<FixCheckWarningsResponse> fixCheckWarnings(FixCheckWarningsRequest request);

    CompletableFuture<GenerateOnceTaskResponse> generateOnceTask(GenerateOnceTaskRequest request);

    CompletableFuture<GetAlarmMachineCountResponse> getAlarmMachineCount(GetAlarmMachineCountRequest request);

    CompletableFuture<GetAppNetworkResponse> getAppNetwork(GetAppNetworkRequest request);

    CompletableFuture<GetAssetSelectionConfigResponse> getAssetSelectionConfig(GetAssetSelectionConfigRequest request);

    CompletableFuture<GetAssetsPropertyDetailResponse> getAssetsPropertyDetail(GetAssetsPropertyDetailRequest request);

    CompletableFuture<GetAssetsPropertyItemResponse> getAssetsPropertyItem(GetAssetsPropertyItemRequest request);

    CompletableFuture<GetBackupStorageCountResponse> getBackupStorageCount(GetBackupStorageCountRequest request);

    CompletableFuture<GetCheckConfigResponse> getCheckConfig(GetCheckConfigRequest request);

    CompletableFuture<GetCheckDetailResponse> getCheckDetail(GetCheckDetailRequest request);

    CompletableFuture<GetCheckProcessResponse> getCheckProcess(GetCheckProcessRequest request);

    CompletableFuture<GetCheckRiskStatisticsResponse> getCheckRiskStatistics(GetCheckRiskStatisticsRequest request);

    CompletableFuture<GetCheckSummaryResponse> getCheckSummary(GetCheckSummaryRequest request);

    CompletableFuture<GetClientUserDefineRuleResponse> getClientUserDefineRule(GetClientUserDefineRuleRequest request);

    CompletableFuture<GetCloudAssetCriteriaResponse> getCloudAssetCriteria(GetCloudAssetCriteriaRequest request);

    CompletableFuture<GetCloudAssetDetailResponse> getCloudAssetDetail(GetCloudAssetDetailRequest request);

    CompletableFuture<GetCloudAssetSummaryResponse> getCloudAssetSummary(GetCloudAssetSummaryRequest request);

    CompletableFuture<GetClusterCheckItemWarningStatisticsResponse> getClusterCheckItemWarningStatistics(GetClusterCheckItemWarningStatisticsRequest request);

    CompletableFuture<GetClusterRuleSummaryResponse> getClusterRuleSummary(GetClusterRuleSummaryRequest request);

    CompletableFuture<GetClusterSuspEventStatisticsResponse> getClusterSuspEventStatistics(GetClusterSuspEventStatisticsRequest request);

    CompletableFuture<GetFileDetectApiInvokeInfoResponse> getFileDetectApiInvokeInfo(GetFileDetectApiInvokeInfoRequest request);

    /**
      * The extended information about the file detection result.
      *
     */
    CompletableFuture<GetFileDetectResultResponse> getFileDetectResult(GetFileDetectResultRequest request);

    CompletableFuture<GetHoneypotNodeResponse> getHoneypotNode(GetHoneypotNodeRequest request);

    CompletableFuture<GetHoneypotPresetResponse> getHoneypotPreset(GetHoneypotPresetRequest request);

    CompletableFuture<GetHoneypotProbeResponse> getHoneypotProbe(GetHoneypotProbeRequest request);

    CompletableFuture<GetImageScanNumInPeriodResponse> getImageScanNumInPeriod(GetImageScanNumInPeriodRequest request);

    CompletableFuture<GetInterceptionRuleDetailResponse> getInterceptionRuleDetail(GetInterceptionRuleDetailRequest request);

    CompletableFuture<GetInterceptionSummaryResponse> getInterceptionSummary(GetInterceptionSummaryRequest request);

    CompletableFuture<GetInterceptionTargetDetailResponse> getInterceptionTargetDetail(GetInterceptionTargetDetailRequest request);

    CompletableFuture<GetLastOnceTaskInfoResponse> getLastOnceTaskInfo(GetLastOnceTaskInfoRequest request);

    CompletableFuture<GetModuleConfigResponse> getModuleConfig(GetModuleConfigRequest request);

    CompletableFuture<GetOnceTaskResultInfoResponse> getOnceTaskResultInfo(GetOnceTaskResultInfoRequest request);

    CompletableFuture<GetPropertyScheduleConfigResponse> getPropertyScheduleConfig(GetPropertyScheduleConfigRequest request);

    CompletableFuture<GetRulesCountResponse> getRulesCount(GetRulesCountRequest request);

    CompletableFuture<GetSuspiciousStatisticsResponse> getSuspiciousStatistics(GetSuspiciousStatisticsRequest request);

    CompletableFuture<GetVulStatisticsResponse> getVulStatistics(GetVulStatisticsRequest request);

    CompletableFuture<GetVulWhitelistResponse> getVulWhitelist(GetVulWhitelistRequest request);

    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    CompletableFuture<HandleSimilarSecurityEventsResponse> handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request);

    CompletableFuture<IgnoreCheckItemsResponse> ignoreCheckItems(IgnoreCheckItemsRequest request);

    CompletableFuture<IgnoreHcCheckWarningsResponse> ignoreHcCheckWarnings(IgnoreHcCheckWarningsRequest request);

    CompletableFuture<InstallBackupClientResponse> installBackupClient(InstallBackupClientRequest request);

    /**
      * > Before you call this operation, make sure that the Security Center agent on your servers is online and the servers can access Alibaba Cloud services.
      *
     */
    CompletableFuture<InstallCloudMonitorResponse> installCloudMonitor(InstallCloudMonitorRequest request);

    CompletableFuture<InstallPmAgentResponse> installPmAgent(InstallPmAgentRequest request);

    CompletableFuture<InstallUniBackupAgentResponse> installUniBackupAgent(InstallUniBackupAgentRequest request);

    CompletableFuture<JoinWebLockProcessWhiteListResponse> joinWebLockProcessWhiteList(JoinWebLockProcessWhiteListRequest request);

    CompletableFuture<ListAssetSelectionSelectedTargetResponse> listAssetSelectionSelectedTarget(ListAssetSelectionSelectedTargetRequest request);

    CompletableFuture<ListAssetSelectionTargetResponse> listAssetSelectionTarget(ListAssetSelectionTargetRequest request);

    CompletableFuture<ListAvailableHoneypotResponse> listAvailableHoneypot(ListAvailableHoneypotRequest request);

    CompletableFuture<ListCheckInstanceResultResponse> listCheckInstanceResult(ListCheckInstanceResultRequest request);

    CompletableFuture<ListCheckItemWarningMachineResponse> listCheckItemWarningMachine(ListCheckItemWarningMachineRequest request);

    CompletableFuture<ListCheckItemWarningSummaryResponse> listCheckItemWarningSummary(ListCheckItemWarningSummaryRequest request);

    CompletableFuture<ListCheckResultResponse> listCheckResult(ListCheckResultRequest request);

    CompletableFuture<ListCheckStandardResponse> listCheckStandard(ListCheckStandardRequest request);

    CompletableFuture<ListClientUserDefineRuleTypesResponse> listClientUserDefineRuleTypes(ListClientUserDefineRuleTypesRequest request);

    CompletableFuture<ListClientUserDefineRulesResponse> listClientUserDefineRules(ListClientUserDefineRulesRequest request);

    CompletableFuture<ListCloudAssetInstancesResponse> listCloudAssetInstances(ListCloudAssetInstancesRequest request);

    CompletableFuture<ListClusterCnnfStatusDetailResponse> listClusterCnnfStatusDetail(ListClusterCnnfStatusDetailRequest request);

    CompletableFuture<ListClusterInterceptionConfigResponse> listClusterInterceptionConfig(ListClusterInterceptionConfigRequest request);

    CompletableFuture<ListHoneypotResponse> listHoneypot(ListHoneypotRequest request);

    CompletableFuture<ListHoneypotAlarmEventsResponse> listHoneypotAlarmEvents(ListHoneypotAlarmEventsRequest request);

    CompletableFuture<ListHoneypotNodeResponse> listHoneypotNode(ListHoneypotNodeRequest request);

    CompletableFuture<ListHoneypotPresetResponse> listHoneypotPreset(ListHoneypotPresetRequest request);

    CompletableFuture<ListHoneypotProbeResponse> listHoneypotProbe(ListHoneypotProbeRequest request);

    CompletableFuture<ListImageRegistryRegionResponse> listImageRegistryRegion(ListImageRegistryRegionRequest request);

    CompletableFuture<ListImageRiskResponse> listImageRisk(ListImageRiskRequest request);

    CompletableFuture<ListInstanceCatalogResponse> listInstanceCatalog(ListInstanceCatalogRequest request);

    CompletableFuture<ListInterceptionHistoryResponse> listInterceptionHistory(ListInterceptionHistoryRequest request);

    CompletableFuture<ListInterceptionRulePageResponse> listInterceptionRulePage(ListInterceptionRulePageRequest request);

    CompletableFuture<ListInterceptionTargetPageResponse> listInterceptionTargetPage(ListInterceptionTargetPageRequest request);

    CompletableFuture<ListPluginForUuidResponse> listPluginForUuid(ListPluginForUuidRequest request);

    CompletableFuture<ListPodRiskResponse> listPodRisk(ListPodRiskRequest request);

    CompletableFuture<ListPrivateRegistryListResponse> listPrivateRegistryList(ListPrivateRegistryListRequest request);

    CompletableFuture<ListPrivateRegistryTypeResponse> listPrivateRegistryType(ListPrivateRegistryTypeRequest request);

    CompletableFuture<ListQueryRaspAppInfoResponse> listQueryRaspAppInfo(ListQueryRaspAppInfoRequest request);

    CompletableFuture<ListRuleTargetAllResponse> listRuleTargetAll(ListRuleTargetAllRequest request);

    CompletableFuture<ListSystemAggregationRulesResponse> listSystemAggregationRules(ListSystemAggregationRulesRequest request);

    CompletableFuture<ListSystemClientRuleTypesResponse> listSystemClientRuleTypes(ListSystemClientRuleTypesRequest request);

    CompletableFuture<ListSystemClientRulesResponse> listSystemClientRules(ListSystemClientRulesRequest request);

    CompletableFuture<ListSystemRuleAggregationTypesResponse> listSystemRuleAggregationTypes(ListSystemRuleAggregationTypesRequest request);

    CompletableFuture<ListUninstallAegisMachinesResponse> listUninstallAegisMachines(ListUninstallAegisMachinesRequest request);

    CompletableFuture<ListUuidsByWebPathResponse> listUuidsByWebPath(ListUuidsByWebPathRequest request);

    CompletableFuture<ListVulAutoRepairConfigResponse> listVulAutoRepairConfig(ListVulAutoRepairConfigRequest request);

    CompletableFuture<ModifyAccessKeyLeakDealResponse> modifyAccessKeyLeakDeal(ModifyAccessKeyLeakDealRequest request);

    CompletableFuture<ModifyAntiBruteForceRuleResponse> modifyAntiBruteForceRule(ModifyAntiBruteForceRuleRequest request);

    CompletableFuture<ModifyAppVulScanCycleResponse> modifyAppVulScanCycle(ModifyAppVulScanCycleRequest request);

    /**
      * The ID of the new server group to which the servers belong.
      * >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
      *
     */
    CompletableFuture<ModifyAssetGroupResponse> modifyAssetGroup(ModifyAssetGroupRequest request);

    CompletableFuture<ModifyAssetImportantResponse> modifyAssetImportant(ModifyAssetImportantRequest request);

    CompletableFuture<ModifyAutoDelConfigResponse> modifyAutoDelConfig(ModifyAutoDelConfigRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyBackupPolicyStatusResponse> modifyBackupPolicyStatus(ModifyBackupPolicyStatusRequest request);

    CompletableFuture<ModifyClearLogstoreStorageResponse> modifyClearLogstoreStorage(ModifyClearLogstoreStorageRequest request);

    CompletableFuture<ModifyClientConfSetupResponse> modifyClientConfSetup(ModifyClientConfSetupRequest request);

    CompletableFuture<ModifyClientConfStrategyResponse> modifyClientConfStrategy(ModifyClientConfStrategyRequest request);

    CompletableFuture<ModifyClientUserDefineRuleResponse> modifyClientUserDefineRule(ModifyClientUserDefineRuleRequest request);

    CompletableFuture<ModifyClusterCnnfStatusUserConfirmResponse> modifyClusterCnnfStatusUserConfirm(ModifyClusterCnnfStatusUserConfirmRequest request);

    CompletableFuture<ModifyConcernNecessityResponse> modifyConcernNecessity(ModifyConcernNecessityRequest request);

    CompletableFuture<ModifyCreateVulWhitelistResponse> modifyCreateVulWhitelist(ModifyCreateVulWhitelistRequest request);

    CompletableFuture<ModifyCustomBlockRecordResponse> modifyCustomBlockRecord(ModifyCustomBlockRecordRequest request);

    CompletableFuture<ModifyCycleTaskResponse> modifyCycleTask(ModifyCycleTaskRequest request);

    CompletableFuture<ModifyEmgVulSubmitResponse> modifyEmgVulSubmit(ModifyEmgVulSubmitRequest request);

    CompletableFuture<ModifyGroupPropertyResponse> modifyGroupProperty(ModifyGroupPropertyRequest request);

    CompletableFuture<ModifyInstanceAntiBruteForceRuleResponse> modifyInstanceAntiBruteForceRule(ModifyInstanceAntiBruteForceRuleRequest request);

    CompletableFuture<ModifyInterceptionRuleResponse> modifyInterceptionRule(ModifyInterceptionRuleRequest request);

    CompletableFuture<ModifyInterceptionRuleSwitchResponse> modifyInterceptionRuleSwitch(ModifyInterceptionRuleSwitchRequest request);

    CompletableFuture<ModifyInterceptionTargetResponse> modifyInterceptionTarget(ModifyInterceptionTargetRequest request);

    CompletableFuture<ModifyLogMetaStatusResponse> modifyLogMetaStatus(ModifyLogMetaStatusRequest request);

    CompletableFuture<ModifyLoginBaseConfigResponse> modifyLoginBaseConfig(ModifyLoginBaseConfigRequest request);

    CompletableFuture<ModifyLoginSwitchConfigResponse> modifyLoginSwitchConfig(ModifyLoginSwitchConfigRequest request);

    CompletableFuture<ModifyNoticeConfigResponse> modifyNoticeConfig(ModifyNoticeConfigRequest request);

    /**
      * The ID of the request, which is used to locate and troubleshoot issues.
      *
     */
    CompletableFuture<ModifyOpenLogShipperResponse> modifyOpenLogShipper(ModifyOpenLogShipperRequest request);

    CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request);

    CompletableFuture<ModifyPropertyScheduleConfigResponse> modifyPropertyScheduleConfig(ModifyPropertyScheduleConfigRequest request);

    CompletableFuture<ModifyPushAllTaskResponse> modifyPushAllTask(ModifyPushAllTaskRequest request);

    CompletableFuture<ModifyRefreshProcessInfoResponse> modifyRefreshProcessInfo(ModifyRefreshProcessInfoRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the following operations:
      * \\-To **ignore a check item**, use the AddCheckResultWhiteList operation.
      * \\-To **cancel ignoring a check item**, use the RemoveCheckResultWhiteList operation.
      *
     */
    CompletableFuture<ModifyRiskCheckStatusResponse> modifyRiskCheckStatus(ModifyRiskCheckStatusRequest request);

    /**
      * @deprecated
      * This operation is phased out. You can use the following operations:
      * \\-To **ignore a risk item**, use the AddCheckInstanceResultWhiteList operation.
      * \\-To **cancel ignoring a risk item**, use the RemoveCheckInstanceResultWhiteList operation.
      *
     */
    CompletableFuture<ModifyRiskSingleResultStatusResponse> modifyRiskSingleResultStatus(ModifyRiskSingleResultStatusRequest request);

    /**
      * @deprecated
      * The ID of the request, which is used to locate and troubleshoot issues.
      *
     */
    CompletableFuture<ModifySecurityCheckScheduleConfigResponse> modifySecurityCheckScheduleConfig(ModifySecurityCheckScheduleConfigRequest request);

    CompletableFuture<ModifySecurityEventMarkMissIndividuallyResponse> modifySecurityEventMarkMissIndividually(ModifySecurityEventMarkMissIndividuallyRequest request);

    CompletableFuture<ModifyStartVulScanResponse> modifyStartVulScan(ModifyStartVulScanRequest request);

    CompletableFuture<ModifyStrategyResponse> modifyStrategy(ModifyStrategyRequest request);

    CompletableFuture<ModifyStrategyTargetResponse> modifyStrategyTarget(ModifyStrategyTargetRequest request);

    CompletableFuture<ModifyTagWithUuidResponse> modifyTagWithUuid(ModifyTagWithUuidRequest request);

    CompletableFuture<ModifyUniBackupPolicyResponse> modifyUniBackupPolicy(ModifyUniBackupPolicyRequest request);

    CompletableFuture<ModifyVpcHoneyPotResponse> modifyVpcHoneyPot(ModifyVpcHoneyPotRequest request);

    CompletableFuture<ModifyVulConfigResponse> modifyVulConfig(ModifyVulConfigRequest request);

    CompletableFuture<ModifyVulTargetResponse> modifyVulTarget(ModifyVulTargetRequest request);

    CompletableFuture<ModifyVulTargetConfigResponse> modifyVulTargetConfig(ModifyVulTargetConfigRequest request);

    CompletableFuture<ModifyVulWhitelistTargetResponse> modifyVulWhitelistTarget(ModifyVulWhitelistTargetRequest request);

    CompletableFuture<ModifyWebLockCreateConfigResponse> modifyWebLockCreateConfig(ModifyWebLockCreateConfigRequest request);

    /**
      * After you delete a directory that has web tamper proofing enabled on a server, files in the directory are no longer protected by web tamper proofing. The information about the websites that are hosted on the server may be maliciously modified by attackers. Proceed with caution.
      *
     */
    CompletableFuture<ModifyWebLockDeleteConfigResponse> modifyWebLockDeleteConfig(ModifyWebLockDeleteConfigRequest request);

    CompletableFuture<ModifyWebLockProcessStatusResponse> modifyWebLockProcessStatus(ModifyWebLockProcessStatusRequest request);

    CompletableFuture<ModifyWebLockStartResponse> modifyWebLockStart(ModifyWebLockStartRequest request);

    CompletableFuture<ModifyWebLockStatusResponse> modifyWebLockStatus(ModifyWebLockStatusRequest request);

    CompletableFuture<ModifyWebLockUnbindResponse> modifyWebLockUnbind(ModifyWebLockUnbindRequest request);

    CompletableFuture<ModifyWebLockUpdateConfigResponse> modifyWebLockUpdateConfig(ModifyWebLockUpdateConfigRequest request);

    CompletableFuture<ModifyWebPathResponse> modifyWebPath(ModifyWebPathRequest request);

    CompletableFuture<OpenSensitiveFileScanResponse> openSensitiveFileScan(OpenSensitiveFileScanRequest request);

    CompletableFuture<OperateAgentClientInstallResponse> operateAgentClientInstall(OperateAgentClientInstallRequest request);

    CompletableFuture<OperateCommonOverallConfigResponse> operateCommonOverallConfig(OperateCommonOverallConfigRequest request);

    CompletableFuture<OperateCommonTargetConfigResponse> operateCommonTargetConfig(OperateCommonTargetConfigRequest request);

    CompletableFuture<OperateImageBaselineWhitelistResponse> operateImageBaselineWhitelist(OperateImageBaselineWhitelistRequest request);

    CompletableFuture<OperateImageVulResponse> operateImageVul(OperateImageVulRequest request);

    CompletableFuture<OperateSuspiciousOverallConfigResponse> operateSuspiciousOverallConfig(OperateSuspiciousOverallConfigRequest request);

    CompletableFuture<OperateSuspiciousTargetConfigResponse> operateSuspiciousTargetConfig(OperateSuspiciousTargetConfigRequest request);

    CompletableFuture<OperateVirusEventsResponse> operateVirusEvents(OperateVirusEventsRequest request);

    CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request);

    CompletableFuture<OperateWebLockFileEventsResponse> operateWebLockFileEvents(OperateWebLockFileEventsRequest request);

    CompletableFuture<OperationCancelIgnoreSuspEventResponse> operationCancelIgnoreSuspEvent(OperationCancelIgnoreSuspEventRequest request);

    CompletableFuture<OperationSuspEventsResponse> operationSuspEvents(OperationSuspEventsRequest request);

    CompletableFuture<PageImageRegistryResponse> pageImageRegistry(PageImageRegistryRequest request);

    CompletableFuture<PauseClientResponse> pauseClient(PauseClientRequest request);

    /**
      * The result of the image scan task. Valid values:
      * *   **SUCCESS**: The task is successful.
      * *   **TASK_NOT_SUPPORT_REGION**: The images are deployed in a region that is not supported by container image scan.
      * > For more information about the regions supported by container image scan, see the "Regions supported by container image scan" section in this topic.
      *
     */
    CompletableFuture<PublicCreateImageScanTaskResponse> publicCreateImageScanTask(PublicCreateImageScanTaskRequest request);

    CompletableFuture<PublicPreCheckImageScanTaskResponse> publicPreCheckImageScanTask(PublicPreCheckImageScanTaskRequest request);

    CompletableFuture<PublicSyncAndCreateImageScanTaskResponse> publicSyncAndCreateImageScanTask(PublicSyncAndCreateImageScanTaskRequest request);

    CompletableFuture<QueryDiscoverDatabaseResponse> queryDiscoverDatabase(QueryDiscoverDatabaseRequest request);

    CompletableFuture<QueryGroupIdByGroupNameResponse> queryGroupIdByGroupName(QueryGroupIdByGroupNameRequest request);

    CompletableFuture<QueryGroupedSecurityEventMarkMissListResponse> queryGroupedSecurityEventMarkMissList(QueryGroupedSecurityEventMarkMissListRequest request);

    CompletableFuture<QueryJenkinsImageRegistryPersistenceDayResponse> queryJenkinsImageRegistryPersistenceDay(QueryJenkinsImageRegistryPersistenceDayRequest request);

    CompletableFuture<QueryPreCheckDatabaseResponse> queryPreCheckDatabase(QueryPreCheckDatabaseRequest request);

    CompletableFuture<RebootMachineResponse> rebootMachine(RebootMachineRequest request);

    CompletableFuture<RefreshAssetsResponse> refreshAssets(RefreshAssetsRequest request);

    CompletableFuture<RefreshContainerAssetsResponse> refreshContainerAssets(RefreshContainerAssetsRequest request);

    CompletableFuture<RemoveCheckInstanceResultWhiteListResponse> removeCheckInstanceResultWhiteList(RemoveCheckInstanceResultWhiteListRequest request);

    CompletableFuture<RemoveCheckResultWhiteListResponse> removeCheckResultWhiteList(RemoveCheckResultWhiteListRequest request);

    CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request);

    CompletableFuture<SasInstallCodeResponse> sasInstallCode(SasInstallCodeRequest request);

    CompletableFuture<SaveImageBaselineStrategyResponse> saveImageBaselineStrategy(SaveImageBaselineStrategyRequest request);

    CompletableFuture<SaveSuspEventUserSettingResponse> saveSuspEventUserSetting(SaveSuspEventUserSettingRequest request);

    CompletableFuture<SetClusterInterceptionConfigResponse> setClusterInterceptionConfig(SetClusterInterceptionConfigRequest request);

    CompletableFuture<SetRegistryScanDayNumResponse> setRegistryScanDayNum(SetRegistryScanDayNumRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartBaselineSecurityCheckResponse> startBaselineSecurityCheck(StartBaselineSecurityCheckRequest request);

    CompletableFuture<StartDiscoverDatabaseTaskResponse> startDiscoverDatabaseTask(StartDiscoverDatabaseTaskRequest request);

    CompletableFuture<StartPreCheckDatabaseResponse> startPreCheckDatabase(StartPreCheckDatabaseRequest request);

    CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request);

    CompletableFuture<SubmitCheckResponse> submitCheck(SubmitCheckRequest request);

    /**
      * If you no longer require protection for servers that are not deployed on Alibaba Cloud, you can call this operation to unbind the servers from Security Center. After you unbind a server that is not deployed on Alibaba Cloud from Security Center, the server no longer consumes the quota of protected servers or protected server vCPUs. This way, you can install the Security Center agent on other servers to meet your business requirements.
      * > You can unbind only the servers that are not deployed on Alibaba Cloud from Security Center. If you use an Alibaba Cloud Elastic Compute Service (ECS) instance, you do not need to unbind the ECS instance. If you uninstall the Security Center agent from an ECS instance, the ECS instance still exists as a disconnected server in the asset list of the Security Center console. The ECS instance is not removed from the asset list.
      * **Prerequisites**
      * *   The server that you want to unbind from Security Center is not deployed on Alibaba Cloud and the Security Center agent is disabled for the server. In this case, the agent is in the Close state and Security Center does not protect the server. You can call the [PauseClient](~~PauseClient~~) operation to disable the agent.
      * *   The client protection feature is disabled for the server that you want to unbind from Security Center. For more information about how to disable the client protection feature, see [Use the client protection feature](https://www.alibabacloud.com/help/en/security-center/latest/local-file-detection-engine).
      *
     */
    CompletableFuture<UnbindAegisResponse> unbindAegis(UnbindAegisRequest request);

    CompletableFuture<UninstallBackupClientResponse> uninstallBackupClient(UninstallBackupClientRequest request);

    CompletableFuture<UninstallUniBackupAgentResponse> uninstallUniBackupAgent(UninstallUniBackupAgentRequest request);

    CompletableFuture<UpdateHoneypotResponse> updateHoneypot(UpdateHoneypotRequest request);

    CompletableFuture<UpdateHoneypotNodeResponse> updateHoneypotNode(UpdateHoneypotNodeRequest request);

    CompletableFuture<UpdateHoneypotPresetResponse> updateHoneypotPreset(UpdateHoneypotPresetRequest request);

    CompletableFuture<UpdateHoneypotProbeResponse> updateHoneypotProbe(UpdateHoneypotProbeRequest request);

    CompletableFuture<UpdateJenkinsImageRegistryNameResponse> updateJenkinsImageRegistryName(UpdateJenkinsImageRegistryNameRequest request);

    CompletableFuture<UpdateJenkinsImageRegistryPersistenceDayResponse> updateJenkinsImageRegistryPersistenceDay(UpdateJenkinsImageRegistryPersistenceDayRequest request);

    CompletableFuture<UpgradeBackupPolicyVersionResponse> upgradeBackupPolicyVersion(UpgradeBackupPolicyVersionRequest request);

    CompletableFuture<ValidateHcWarningsResponse> validateHcWarnings(ValidateHcWarningsRequest request);

    CompletableFuture<VerifyCheckInstanceResultResponse> verifyCheckInstanceResult(VerifyCheckInstanceResultRequest request);

    CompletableFuture<VerifyCheckResultResponse> verifyCheckResult(VerifyCheckResultRequest request);

}
