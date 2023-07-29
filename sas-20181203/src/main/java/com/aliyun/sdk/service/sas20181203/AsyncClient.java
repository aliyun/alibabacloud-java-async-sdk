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

    CompletableFuture<AddImageVulWhiteListResponse> addImageVulWhiteList(AddImageVulWhiteListRequest request);

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

    CompletableFuture<ChangeAssetRefreshTaskConfigResponse> changeAssetRefreshTaskConfig(ChangeAssetRefreshTaskConfigRequest request);

    CompletableFuture<ChangeCheckConfigResponse> changeCheckConfig(ChangeCheckConfigRequest request);

    CompletableFuture<ChangeCheckCustomConfigResponse> changeCheckCustomConfig(ChangeCheckCustomConfigRequest request);

    CompletableFuture<CheckQuaraFileIdResponse> checkQuaraFileId(CheckQuaraFileIdRequest request);

    CompletableFuture<CheckSecurityEventIdResponse> checkSecurityEventId(CheckSecurityEventIdRequest request);

    CompletableFuture<CheckUserHasEcsResponse> checkUserHasEcs(CheckUserHasEcsRequest request);

    CompletableFuture<ConfirmVirusEventsResponse> confirmVirusEvents(ConfirmVirusEventsRequest request);

    CompletableFuture<CreateAgentlessScanTaskResponse> createAgentlessScanTask(CreateAgentlessScanTaskRequest request);

    CompletableFuture<CreateAntiBruteForceRuleResponse> createAntiBruteForceRule(CreateAntiBruteForceRuleRequest request);

    CompletableFuture<CreateAssetSelectionConfigResponse> createAssetSelectionConfig(CreateAssetSelectionConfigRequest request);

    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    CompletableFuture<CreateContainerScanTaskResponse> createContainerScanTask(CreateContainerScanTaskRequest request);

    CompletableFuture<CreateCustomBlockRecordResponse> createCustomBlockRecord(CreateCustomBlockRecordRequest request);

    CompletableFuture<CreateCycleTaskResponse> createCycleTask(CreateCycleTaskRequest request);

    /**
      * You can call this operation to push a file to the cloud for detection. Before you call this operation, make sure that the file is uploaded. You can call the CreateFileDetectUploadUrl operation to upload the file.
      * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only hexadecimal MD5 hash values of complete file content are supported. You must calculate the MD5 hash value before you call this operation.
      * To calculate the hexadecimal MD5 hash value for a file, you can perform the following steps:
      * 1\\. Use the MD5 algorithm to encrypt data and generate a 128-bit hash value. You can use a tool such as MessageDigest for Java and the hashlib module for Python.
      * 2\\. Convert the hash value to a hexadecimal string. You can use a tool such as Codec for Java and the hex() function for Python.
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
      * A server can belong only to one server group. If you call the CreateOrUpdateAssetGroup operation and the server specified in request parameters belongs to Server Group A, the server is removed from Server Group A and then added to the newly created or specified server group after the call is complete.
      *
     */
    CompletableFuture<CreateOrUpdateAssetGroupResponse> createOrUpdateAssetGroup(CreateOrUpdateAssetGroupRequest request);

    CompletableFuture<CreateOrUpdateDingTalkResponse> createOrUpdateDingTalk(CreateOrUpdateDingTalkRequest request);

    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    /**
      * For more information about service-linked roles, see [Service-linked roles](~~160674~~).
      *
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateServiceTrailResponse> createServiceTrail(CreateServiceTrailRequest request);

    CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request);

    CompletableFuture<CreateSuspEventNoteResponse> createSuspEventNote(CreateSuspEventNoteRequest request);

    CompletableFuture<CreateUniBackupPolicyResponse> createUniBackupPolicy(CreateUniBackupPolicyRequest request);

    CompletableFuture<CreateUniRestorePlanResponse> createUniRestorePlan(CreateUniRestorePlanRequest request);

    CompletableFuture<CreateVulAutoRepairConfigResponse> createVulAutoRepairConfig(CreateVulAutoRepairConfigRequest request);

    CompletableFuture<DeleteAntiBruteForceRuleResponse> deleteAntiBruteForceRule(DeleteAntiBruteForceRuleRequest request);

    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    CompletableFuture<DeleteBackupPolicyMachineResponse> deleteBackupPolicyMachine(DeleteBackupPolicyMachineRequest request);

    CompletableFuture<DeleteBinarySecurityPolicyResponse> deleteBinarySecurityPolicy(DeleteBinarySecurityPolicyRequest request);

    CompletableFuture<DeleteClientUserDefineRuleResponse> deleteClientUserDefineRule(DeleteClientUserDefineRuleRequest request);

    CompletableFuture<DeleteCustomBlockRecordResponse> deleteCustomBlockRecord(DeleteCustomBlockRecordRequest request);

    CompletableFuture<DeleteCycleTaskResponse> deleteCycleTask(DeleteCycleTaskRequest request);

    /**
      * The **Default** server group that is provided by Security Center cannot be deleted. After you delete a group, the assets in this group are moved to the **Default** group.
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

    CompletableFuture<DeleteServiceTrailResponse> deleteServiceTrail(DeleteServiceTrailRequest request);

    CompletableFuture<DeleteStrategyResponse> deleteStrategy(DeleteStrategyRequest request);

    CompletableFuture<DeleteSuspEventNodeResponse> deleteSuspEventNode(DeleteSuspEventNodeRequest request);

    /**
      * Security Center provides asset importance tags and custom tags. You can call this operation to remove only the custom tag that is added to an asset.
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

    CompletableFuture<DescribeAttachRecordsResponse> describeAttachRecords(DescribeAttachRecordsRequest request);

    CompletableFuture<DescribeAttackAnalysisDataResponse> describeAttackAnalysisData(DescribeAttackAnalysisDataRequest request);

    CompletableFuture<DescribeAutoDelConfigResponse> describeAutoDelConfig(DescribeAutoDelConfigRequest request);

    CompletableFuture<DescribeBackUpExportInfoResponse> describeBackUpExportInfo(DescribeBackUpExportInfoRequest request);

    /**
      * You can call the DescribeBackupClients operation to query the servers on which the anti-ransomware agent is installed in a specified region.
      *
     */
    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request);

    CompletableFuture<DescribeBackupMachineStatusResponse> describeBackupMachineStatus(DescribeBackupMachineStatusRequest request);

    CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
      * If you have created restoration tasks, you can call this operation to query the number of restoration tasks that are in the **restored** or **being restored** state.
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
      * Only users who created a Container Registry Enterprise Edition instance can call this operation.
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
      * Security Center can scan for security risks and collect statistics only for **Container Registry Enterprise Edition instances**.
      * >  Security Center cannot scan for security risks or collect statistics for **default** Container Registry instances.
      *
     */
    CompletableFuture<DescribeImageStatisticsResponse> describeImageStatistics(DescribeImageStatisticsRequest request);

    /**
      * To query the information about the recently detected image vulnerabilities, call the [PublicCreateImageScanTask](~~PublicCreateImageScanTask~~) operation. Wait 1 to 5 minutes until the call is successful and call the DescribeImageVulList operation.
      *
     */
    CompletableFuture<DescribeImageVulListResponse> describeImageVulList(DescribeImageVulListRequest request);

    CompletableFuture<DescribeImageVulWhiteListResponse> describeImageVulWhiteList(DescribeImageVulWhiteListRequest request);

    CompletableFuture<DescribeInstallCaptchaResponse> describeInstallCaptcha(DescribeInstallCaptchaRequest request);

    CompletableFuture<DescribeInstallCodeResponse> describeInstallCode(DescribeInstallCodeRequest request);

    /**
      * You can call the DescribeInstallCodes operation to query the commands that are used to manually install the Security Center agent. The returned results contain the installation verification code and the server information. If you want to manually install the Security Center agent on your server, you can call this operation to query installation commands.
      * # Limits
      * You can call this API operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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

    CompletableFuture<DescribeMonitorAccountsResponse> describeMonitorAccounts(DescribeMonitorAccountsRequest request);

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
      * If the data on your servers is encrypted by ransomware, you can create a restoration task to restore the data on your servers by using backup data in Security Center.
      * >  After you enable an anti-ransomware policy, the data on your servers is backed up based on the policy. For more information about anti-ransomware policies, see [Manage protection policies](~~164781~~).
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
      * This operation is phased out. You can use the GetCheckSummary operation.
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
      * This operation is phased out. You can use the ListCheckResult operation. When you call the ListCheckResult operation, set the Statuses parameter to NOT_PASS.
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

    CompletableFuture<DescribeSecurityEventMarkMissListResponse> describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request);

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
      * You can call the operation to export the following check result lists:
      * *   The list of servers on the Host page.
      * *   The lists of image system vulnerabilities, image application vulnerabilities, image baseline check results, and malicious image samples on the Image Security page.
      * *   The list of attack analysis data on the Attack Awareness page.
      * *   The list of check results for AccessKey pair leaks on the AK leak detection page.
      *
     */
    CompletableFuture<ExportRecordResponse> exportRecord(ExportRecordRequest request);

    CompletableFuture<ExportSuspEventsResponse> exportSuspEvents(ExportSuspEventsRequest request);

    /**
      * You can call the ExportVul operation to export the following types of vulnerabilities: Linux software vulnerabilities, Windows system vulnerabilities, Web-CMS vulnerabilities, application vulnerabilities, and urgent vulnerabilities.
      * You can use this operation together with the DescribeVulExportInfo operation. After you call the ExportVul operation to create a vulnerability export task, you can call the DescribeVulExportInfo operation to query the progress of the task by specifying the ID of the task.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ExportVulResponse> exportVul(ExportVulRequest request);

    CompletableFuture<ExportWarningResponse> exportWarning(ExportWarningRequest request);

    CompletableFuture<FindContainerNetworkConnectResponse> findContainerNetworkConnect(FindContainerNetworkConnectRequest request);

    CompletableFuture<FixCheckWarningsResponse> fixCheckWarnings(FixCheckWarningsRequest request);

    CompletableFuture<GenerateOnceTaskResponse> generateOnceTask(GenerateOnceTaskRequest request);

    CompletableFuture<GetAgentlessTaskCountResponse> getAgentlessTaskCount(GetAgentlessTaskCountRequest request);

    CompletableFuture<GetAlarmMachineCountResponse> getAlarmMachineCount(GetAlarmMachineCountRequest request);

    CompletableFuture<GetAppNetworkResponse> getAppNetwork(GetAppNetworkRequest request);

    CompletableFuture<GetAssetDetailByUuidResponse> getAssetDetailByUuid(GetAssetDetailByUuidRequest request);

    CompletableFuture<GetAssetSelectionConfigResponse> getAssetSelectionConfig(GetAssetSelectionConfigRequest request);

    CompletableFuture<GetAssetsPropertyDetailResponse> getAssetsPropertyDetail(GetAssetsPropertyDetailRequest request);

    CompletableFuture<GetAssetsPropertyItemResponse> getAssetsPropertyItem(GetAssetsPropertyItemRequest request);

    CompletableFuture<GetBackupStorageCountResponse> getBackupStorageCount(GetBackupStorageCountRequest request);

    CompletableFuture<GetCheckConfigResponse> getCheckConfig(GetCheckConfigRequest request);

    CompletableFuture<GetCheckDetailResponse> getCheckDetail(GetCheckDetailRequest request);

    CompletableFuture<GetCheckProcessResponse> getCheckProcess(GetCheckProcessRequest request);

    CompletableFuture<GetCheckRiskStatisticsResponse> getCheckRiskStatistics(GetCheckRiskStatisticsRequest request);

    CompletableFuture<GetCheckSummaryResponse> getCheckSummary(GetCheckSummaryRequest request);

    CompletableFuture<GetClientRatioStatisticResponse> getClientRatioStatistic(GetClientRatioStatisticRequest request);

    CompletableFuture<GetClientUserDefineRuleResponse> getClientUserDefineRule(GetClientUserDefineRuleRequest request);

    CompletableFuture<GetCloudAssetCriteriaResponse> getCloudAssetCriteria(GetCloudAssetCriteriaRequest request);

    CompletableFuture<GetCloudAssetDetailResponse> getCloudAssetDetail(GetCloudAssetDetailRequest request);

    CompletableFuture<GetCloudAssetSummaryResponse> getCloudAssetSummary(GetCloudAssetSummaryRequest request);

    CompletableFuture<GetClusterCheckItemWarningStatisticsResponse> getClusterCheckItemWarningStatistics(GetClusterCheckItemWarningStatisticsRequest request);

    CompletableFuture<GetClusterRuleSummaryResponse> getClusterRuleSummary(GetClusterRuleSummaryRequest request);

    CompletableFuture<GetClusterSuspEventStatisticsResponse> getClusterSuspEventStatistics(GetClusterSuspEventStatisticsRequest request);

    CompletableFuture<GetFileDetectApiInvokeInfoResponse> getFileDetectApiInvokeInfo(GetFileDetectApiInvokeInfoRequest request);

    /**
      * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.
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

    CompletableFuture<GetServiceTrailResponse> getServiceTrail(GetServiceTrailRequest request);

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

    CompletableFuture<InstallRaspAttachResponse> installRaspAttach(InstallRaspAttachRequest request);

    CompletableFuture<InstallUniBackupAgentResponse> installUniBackupAgent(InstallUniBackupAgentRequest request);

    CompletableFuture<JoinWebLockProcessWhiteListResponse> joinWebLockProcessWhiteList(JoinWebLockProcessWhiteListRequest request);

    CompletableFuture<ListAgentlessRegionResponse> listAgentlessRegion(ListAgentlessRegionRequest request);

    CompletableFuture<ListAgentlessRelateMaliciousResponse> listAgentlessRelateMalicious(ListAgentlessRelateMaliciousRequest request);

    CompletableFuture<ListAgentlessRiskUuidResponse> listAgentlessRiskUuid(ListAgentlessRiskUuidRequest request);

    CompletableFuture<ListAgentlessTaskResponse> listAgentlessTask(ListAgentlessTaskRequest request);

    CompletableFuture<ListAssetCleanConfigResponse> listAssetCleanConfig(ListAssetCleanConfigRequest request);

    CompletableFuture<ListAssetRefreshTaskConfigResponse> listAssetRefreshTaskConfig(ListAssetRefreshTaskConfigRequest request);

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

    CompletableFuture<ListCloudVendorRegionsResponse> listCloudVendorRegions(ListCloudVendorRegionsRequest request);

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

    CompletableFuture<ModifyAssetCleanConfigResponse> modifyAssetCleanConfig(ModifyAssetCleanConfigRequest request);

    /**
      * You can call the ModifyAssetGroup operation to change the server group to which one or more servers belong. After you create a server group by calling the [CreateOrUpdateAssetGroup](~~CreateOrUpdateAssetGroup~~) operation, you can call the ModifyAssetGroup operation to change the server group to which your servers belong.
      * ### Limits
      * You can call this API operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
      * **Prerequisites** A service-linked role is created, and Security Center is authorized to access cloud resources. You can call the [CreateServiceLinkedRole](~~CreateServiceLinkedRole~~) operation to create service-linked roles and authorize Security Center to access cloud resources. **Scenarios** Before you use the log analysis feature of Security Center, you must call the ModifyOpenLogShipper operation to activate Log Service.
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
      * This operation is phased out. You can use the ChangeCheckConfig operation.
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
      * Before you call the PublicCreateImageScanTask operation, we recommend that you call the [PublicPreCheckImageScanTask](~~PublicPreCheckImageScanTask~~) operation to query the number of images to scan and the quota for container image scan to be consumed by the image scan task. Make sure that the remaining quota for container image scan is sufficient. This prevents the task from being stopped due to an insufficient quota.
      *
     */
    CompletableFuture<PublicCreateImageScanTaskResponse> publicCreateImageScanTask(PublicCreateImageScanTaskRequest request);

    CompletableFuture<PublicPreCheckImageScanTaskResponse> publicPreCheckImageScanTask(PublicPreCheckImageScanTaskRequest request);

    CompletableFuture<PublicSyncAndCreateImageScanTaskResponse> publicSyncAndCreateImageScanTask(PublicSyncAndCreateImageScanTaskRequest request);

    CompletableFuture<QueryDiscoverDatabaseResponse> queryDiscoverDatabase(QueryDiscoverDatabaseRequest request);

    /**
      * You can call the QueryGroupIdByGroupName operation to query the ID of an asset group to which your assets belong by using the name of the asset group. When you call operations such as [GetSuspiciousStatistics](~~GetSuspiciousStatistics~~) and [DeleteGroup](~~DeleteGroup~~), you must specify the ID of the asset group. To query the ID of an asset group, call the QueryGroupIdByGroupName operation.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
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

    CompletableFuture<UninstallRaspAttachResponse> uninstallRaspAttach(UninstallRaspAttachRequest request);

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
