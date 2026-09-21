// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sas20181203.models.*;
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
     * @param request the request parameters of AddAssetSelectionCriteria  AddAssetSelectionCriteriaRequest
     * @return AddAssetSelectionCriteriaResponse
     */
    CompletableFuture<AddAssetSelectionCriteriaResponse> addAssetSelectionCriteria(AddAssetSelectionCriteriaRequest request);

    /**
     * @param request the request parameters of AddBaselineCheckWhiteRecord  AddBaselineCheckWhiteRecordRequest
     * @return AddBaselineCheckWhiteRecordResponse
     */
    CompletableFuture<AddBaselineCheckWhiteRecordResponse> addBaselineCheckWhiteRecord(AddBaselineCheckWhiteRecordRequest request);

    /**
     * @param request the request parameters of AddCheckInstanceResultWhiteList  AddCheckInstanceResultWhiteListRequest
     * @return AddCheckInstanceResultWhiteListResponse
     */
    CompletableFuture<AddCheckInstanceResultWhiteListResponse> addCheckInstanceResultWhiteList(AddCheckInstanceResultWhiteListRequest request);

    /**
     * @param request the request parameters of AddCheckResultWhiteList  AddCheckResultWhiteListRequest
     * @return AddCheckResultWhiteListResponse
     */
    CompletableFuture<AddCheckResultWhiteListResponse> addCheckResultWhiteList(AddCheckResultWhiteListRequest request);

    /**
     * @param request the request parameters of AddClientUserDefineRule  AddClientUserDefineRuleRequest
     * @return AddClientUserDefineRuleResponse
     */
    CompletableFuture<AddClientUserDefineRuleResponse> addClientUserDefineRule(AddClientUserDefineRuleRequest request);

    /**
     * @param request the request parameters of AddCloudVendorAccountAK  AddCloudVendorAccountAKRequest
     * @return AddCloudVendorAccountAKResponse
     */
    CompletableFuture<AddCloudVendorAccountAKResponse> addCloudVendorAccountAK(AddCloudVendorAccountAKRequest request);

    /**
     * @param request the request parameters of AddCloudVendorTrialConfig  AddCloudVendorTrialConfigRequest
     * @return AddCloudVendorTrialConfigResponse
     */
    CompletableFuture<AddCloudVendorTrialConfigResponse> addCloudVendorTrialConfig(AddCloudVendorTrialConfigRequest request);

    /**
     * @param request the request parameters of AddContainerDefenseRule  AddContainerDefenseRuleRequest
     * @return AddContainerDefenseRuleResponse
     */
    CompletableFuture<AddContainerDefenseRuleResponse> addContainerDefenseRule(AddContainerDefenseRuleRequest request);

    /**
     * @param request the request parameters of AddContainerPluginRule  AddContainerPluginRuleRequest
     * @return AddContainerPluginRuleResponse
     */
    CompletableFuture<AddContainerPluginRuleResponse> addContainerPluginRule(AddContainerPluginRuleRequest request);

    /**
     * @param request the request parameters of AddFileProtectBindMachine  AddFileProtectBindMachineRequest
     * @return AddFileProtectBindMachineResponse
     */
    CompletableFuture<AddFileProtectBindMachineResponse> addFileProtectBindMachine(AddFileProtectBindMachineRequest request);

    /**
     * <b>description</b> :
     * <p>Security Center allows you to create an IDC probe only on servers on which the Security Center agent is installed.</p>
     * 
     * @param request the request parameters of AddIdcProbe  AddIdcProbeRequest
     * @return AddIdcProbeResponse
     */
    CompletableFuture<AddIdcProbeResponse> addIdcProbe(AddIdcProbeRequest request);

    /**
     * @param request the request parameters of AddImageEventOperation  AddImageEventOperationRequest
     * @return AddImageEventOperationResponse
     */
    CompletableFuture<AddImageEventOperationResponse> addImageEventOperation(AddImageEventOperationRequest request);

    /**
     * @param request the request parameters of AddImageVulWhiteList  AddImageVulWhiteListRequest
     * @return AddImageVulWhiteListResponse
     */
    CompletableFuture<AddImageVulWhiteListResponse> addImageVulWhiteList(AddImageVulWhiteListRequest request);

    /**
     * @param request the request parameters of AddInstallCode  AddInstallCodeRequest
     * @return AddInstallCodeResponse
     */
    CompletableFuture<AddInstallCodeResponse> addInstallCode(AddInstallCodeRequest request);

    /**
     * @param request the request parameters of AddPrivateRegistry  AddPrivateRegistryRequest
     * @return AddPrivateRegistryResponse
     */
    CompletableFuture<AddPrivateRegistryResponse> addPrivateRegistry(AddPrivateRegistryRequest request);

    /**
     * @param request the request parameters of AddProtectVpcList  AddProtectVpcListRequest
     * @return AddProtectVpcListResponse
     */
    CompletableFuture<AddProtectVpcListResponse> addProtectVpcList(AddProtectVpcListRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call GetCurrentVersionPublish to check the account eligibility. You can call this operation only when the returned BigCustomer parameter is true, which indicates that the account is a premium customer.</p>
     * 
     * @param request the request parameters of AddPublishBatch  AddPublishBatchRequest
     * @return AddPublishBatchResponse
     */
    CompletableFuture<AddPublishBatchResponse> addPublishBatch(AddPublishBatchRequest request);

    /**
     * @param request the request parameters of AddSasContainerWebDefenseRule  AddSasContainerWebDefenseRuleRequest
     * @return AddSasContainerWebDefenseRuleResponse
     */
    CompletableFuture<AddSasContainerWebDefenseRuleResponse> addSasContainerWebDefenseRule(AddSasContainerWebDefenseRuleRequest request);

    /**
     * @param request the request parameters of AddSasModuleTrial  AddSasModuleTrialRequest
     * @return AddSasModuleTrialResponse
     */
    CompletableFuture<AddSasModuleTrialResponse> addSasModuleTrial(AddSasModuleTrialRequest request);

    /**
     * <b>description</b> :
     * <p>Security Center provides asset importance tags and custom tags. You can call the AddTagWithUuid operation to add only a custom tag to assets.</p>
     * 
     * @param request the request parameters of AddTagWithUuid  AddTagWithUuidRequest
     * @return AddTagWithUuidResponse
     */
    CompletableFuture<AddTagWithUuidResponse> addTagWithUuid(AddTagWithUuidRequest request);

    /**
     * @param request the request parameters of AddUninstallClientsByUuids  AddUninstallClientsByUuidsRequest
     * @return AddUninstallClientsByUuidsResponse
     */
    CompletableFuture<AddUninstallClientsByUuidsResponse> addUninstallClientsByUuids(AddUninstallClientsByUuidsRequest request);

    /**
     * @param request the request parameters of AddUnknownThreatDetectProcess  AddUnknownThreatDetectProcessRequest
     * @return AddUnknownThreatDetectProcessResponse
     */
    CompletableFuture<AddUnknownThreatDetectProcessResponse> addUnknownThreatDetectProcess(AddUnknownThreatDetectProcessRequest request);

    /**
     * @param request the request parameters of AddVpcHoneyPot  AddVpcHoneyPotRequest
     * @return AddVpcHoneyPotResponse
     */
    CompletableFuture<AddVpcHoneyPotResponse> addVpcHoneyPot(AddVpcHoneyPotRequest request);

    /**
     * @param request the request parameters of AdvanceSecurityEventOperations  AdvanceSecurityEventOperationsRequest
     * @return AdvanceSecurityEventOperationsResponse
     */
    CompletableFuture<AdvanceSecurityEventOperationsResponse> advanceSecurityEventOperations(AdvanceSecurityEventOperationsRequest request);

    /**
     * @param request the request parameters of BatchCreateMaliciousNote  BatchCreateMaliciousNoteRequest
     * @return BatchCreateMaliciousNoteResponse
     */
    CompletableFuture<BatchCreateMaliciousNoteResponse> batchCreateMaliciousNote(BatchCreateMaliciousNoteRequest request);

    /**
     * @param request the request parameters of BatchDeleteMaliciousFileWhitelistConfig  BatchDeleteMaliciousFileWhitelistConfigRequest
     * @return BatchDeleteMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<BatchDeleteMaliciousFileWhitelistConfigResponse> batchDeleteMaliciousFileWhitelistConfig(BatchDeleteMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of BatchOperateCommonOverallConfig  BatchOperateCommonOverallConfigRequest
     * @return BatchOperateCommonOverallConfigResponse
     */
    CompletableFuture<BatchOperateCommonOverallConfigResponse> batchOperateCommonOverallConfig(BatchOperateCommonOverallConfigRequest request);

    /**
     * @param request the request parameters of BatchUpdateMaliciousFileWhitelistConfig  BatchUpdateMaliciousFileWhitelistConfigRequest
     * @return BatchUpdateMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<BatchUpdateMaliciousFileWhitelistConfigResponse> batchUpdateMaliciousFileWhitelistConfig(BatchUpdateMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of BindAuthToMachine  BindAuthToMachineRequest
     * @return BindAuthToMachineResponse
     */
    CompletableFuture<BindAuthToMachineResponse> bindAuthToMachine(BindAuthToMachineRequest request);

    /**
     * @param request the request parameters of BindHybridProxy  BindHybridProxyRequest
     * @return BindHybridProxyResponse
     */
    CompletableFuture<BindHybridProxyResponse> bindHybridProxy(BindHybridProxyRequest request);

    /**
     * @param request the request parameters of CancelOnceTask  CancelOnceTaskRequest
     * @return CancelOnceTaskResponse
     */
    CompletableFuture<CancelOnceTaskResponse> cancelOnceTask(CancelOnceTaskRequest request);

    /**
     * @param request the request parameters of ChangeAssetRefreshTaskConfig  ChangeAssetRefreshTaskConfigRequest
     * @return ChangeAssetRefreshTaskConfigResponse
     */
    CompletableFuture<ChangeAssetRefreshTaskConfigResponse> changeAssetRefreshTaskConfig(ChangeAssetRefreshTaskConfigRequest request);

    /**
     * @param request the request parameters of ChangeCheckConfig  ChangeCheckConfigRequest
     * @return ChangeCheckConfigResponse
     */
    CompletableFuture<ChangeCheckConfigResponse> changeCheckConfig(ChangeCheckConfigRequest request);

    /**
     * @param request the request parameters of ChangeCheckCustomConfig  ChangeCheckCustomConfigRequest
     * @return ChangeCheckCustomConfigResponse
     */
    CompletableFuture<ChangeCheckCustomConfigResponse> changeCheckCustomConfig(ChangeCheckCustomConfigRequest request);

    /**
     * @param request the request parameters of ChangeCheckScopeConfigInstance  ChangeCheckScopeConfigInstanceRequest
     * @return ChangeCheckScopeConfigInstanceResponse
     */
    CompletableFuture<ChangeCheckScopeConfigInstanceResponse> changeCheckScopeConfigInstance(ChangeCheckScopeConfigInstanceRequest request);

    /**
     * @param request the request parameters of ChangeSecurityScoreRule  ChangeSecurityScoreRuleRequest
     * @return ChangeSecurityScoreRuleResponse
     */
    CompletableFuture<ChangeSecurityScoreRuleResponse> changeSecurityScoreRule(ChangeSecurityScoreRuleRequest request);

    /**
     * @param request the request parameters of ChangeUserLang  ChangeUserLangRequest
     * @return ChangeUserLangResponse
     */
    CompletableFuture<ChangeUserLangResponse> changeUserLang(ChangeUserLangRequest request);

    /**
     * @param request the request parameters of CheckSecurityEventId  CheckSecurityEventIdRequest
     * @return CheckSecurityEventIdResponse
     */
    CompletableFuture<CheckSecurityEventIdResponse> checkSecurityEventId(CheckSecurityEventIdRequest request);

    /**
     * @param request the request parameters of CheckStsTokenAuth  CheckStsTokenAuthRequest
     * @return CheckStsTokenAuthResponse
     */
    CompletableFuture<CheckStsTokenAuthResponse> checkStsTokenAuth(CheckStsTokenAuthRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to check whether the remaining quota of the vulnerability fixing feature is sufficient in free trial scenarios. This operation does not trigger vulnerability fixing.</p>
     * 
     * @param request the request parameters of CheckTrialFixCount  CheckTrialFixCountRequest
     * @return CheckTrialFixCountResponse
     */
    CompletableFuture<CheckTrialFixCountResponse> checkTrialFixCount(CheckTrialFixCountRequest request);

    /**
     * @param request the request parameters of CheckUserHasEcs  CheckUserHasEcsRequest
     * @return CheckUserHasEcsResponse
     */
    CompletableFuture<CheckUserHasEcsResponse> checkUserHasEcs(CheckUserHasEcsRequest request);

    /**
     * @param request the request parameters of ConfirmVirusEvents  ConfirmVirusEventsRequest
     * @return ConfirmVirusEventsResponse
     */
    CompletableFuture<ConfirmVirusEventsResponse> confirmVirusEvents(ConfirmVirusEventsRequest request);

    /**
     * @param request the request parameters of CopyCustomizeReportConfig  CopyCustomizeReportConfigRequest
     * @return CopyCustomizeReportConfigResponse
     */
    CompletableFuture<CopyCustomizeReportConfigResponse> copyCustomizeReportConfig(CopyCustomizeReportConfigRequest request);

    /**
     * @param request the request parameters of CreateAgentlessScanTask  CreateAgentlessScanTaskRequest
     * @return CreateAgentlessScanTaskResponse
     */
    CompletableFuture<CreateAgentlessScanTaskResponse> createAgentlessScanTask(CreateAgentlessScanTaskRequest request);

    /**
     * @param request the request parameters of CreateAntiBruteForceRule  CreateAntiBruteForceRuleRequest
     * @return CreateAntiBruteForceRuleResponse
     */
    CompletableFuture<CreateAntiBruteForceRuleResponse> createAntiBruteForceRule(CreateAntiBruteForceRuleRequest request);

    /**
     * @param request the request parameters of CreateAssetSelectionConfig  CreateAssetSelectionConfigRequest
     * @return CreateAssetSelectionConfigResponse
     */
    CompletableFuture<CreateAssetSelectionConfigResponse> createAssetSelectionConfig(CreateAssetSelectionConfigRequest request);

    /**
     * @param request the request parameters of CreateAttackPathSensitiveAssetConfig  CreateAttackPathSensitiveAssetConfigRequest
     * @return CreateAttackPathSensitiveAssetConfigResponse
     */
    CompletableFuture<CreateAttackPathSensitiveAssetConfigResponse> createAttackPathSensitiveAssetConfig(CreateAttackPathSensitiveAssetConfigRequest request);

    /**
     * @param request the request parameters of CreateAttackPathWhitelist  CreateAttackPathWhitelistRequest
     * @return CreateAttackPathWhitelistResponse
     */
    CompletableFuture<CreateAttackPathWhitelistResponse> createAttackPathWhitelist(CreateAttackPathWhitelistRequest request);

    /**
     * @param request the request parameters of CreateAttestor  CreateAttestorRequest
     * @return CreateAttestorResponse
     */
    CompletableFuture<CreateAttestorResponse> createAttestor(CreateAttestorRequest request);

    /**
     * @param request the request parameters of CreateBackupPolicy  CreateBackupPolicyRequest
     * @return CreateBackupPolicyResponse
     */
    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    /**
     * @param request the request parameters of CreateBatchUploadUrl  CreateBatchUploadUrlRequest
     * @return CreateBatchUploadUrlResponse
     */
    CompletableFuture<CreateBatchUploadUrlResponse> createBatchUploadUrl(CreateBatchUploadUrlRequest request);

    /**
     * @param request the request parameters of CreateBinarySecurityPolicy  CreateBinarySecurityPolicyRequest
     * @return CreateBinarySecurityPolicyResponse
     */
    CompletableFuture<CreateBinarySecurityPolicyResponse> createBinarySecurityPolicy(CreateBinarySecurityPolicyRequest request);

    /**
     * @param request the request parameters of CreateCheckItem  CreateCheckItemRequest
     * @return CreateCheckItemResponse
     */
    CompletableFuture<CreateCheckItemResponse> createCheckItem(CreateCheckItemRequest request);

    /**
     * @param request the request parameters of CreateCheckPolicy  CreateCheckPolicyRequest
     * @return CreateCheckPolicyResponse
     */
    CompletableFuture<CreateCheckPolicyResponse> createCheckPolicy(CreateCheckPolicyRequest request);

    /**
     * @param request the request parameters of CreateContainerScanTask  CreateContainerScanTaskRequest
     * @return CreateContainerScanTaskResponse
     */
    CompletableFuture<CreateContainerScanTaskResponse> createContainerScanTask(CreateContainerScanTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that your current Security Center edition supports container runtime scanning. Call <a href="~~DescribeVersionConfig~~">DescribeVersionConfig</a> and verify that the response parameter IsNewContainerVersion is true, which indicates that container runtime scanning is available. If the value is false, upgrade your Security Center edition before calling this operation.</p>
     * 
     * @param request the request parameters of CreateContainerScanTaskByAppName  CreateContainerScanTaskByAppNameRequest
     * @return CreateContainerScanTaskByAppNameResponse
     */
    CompletableFuture<CreateContainerScanTaskByAppNameResponse> createContainerScanTaskByAppName(CreateContainerScanTaskByAppNameRequest request);

    /**
     * @param request the request parameters of CreateCustomBlockRecord  CreateCustomBlockRecordRequest
     * @return CreateCustomBlockRecordResponse
     */
    CompletableFuture<CreateCustomBlockRecordResponse> createCustomBlockRecord(CreateCustomBlockRecordRequest request);

    /**
     * @param request the request parameters of CreateCustomizedDict  CreateCustomizedDictRequest
     * @return CreateCustomizedDictResponse
     */
    CompletableFuture<CreateCustomizedDictResponse> createCustomizedDict(CreateCustomizedDictRequest request);

    /**
     * @param request the request parameters of CreateCycleTask  CreateCycleTaskRequest
     * @return CreateCycleTaskResponse
     */
    CompletableFuture<CreateCycleTaskResponse> createCycleTask(CreateCycleTaskRequest request);

    /**
     * @deprecated OpenAPI CreateDynamicDict is deprecated, please use Sas::2018-12-03::CreateCustomizedDict instead.  * @param request  the request parameters of CreateDynamicDict  CreateDynamicDictRequest
     * @return CreateDynamicDictResponse
     */
    @Deprecated
    CompletableFuture<CreateDynamicDictResponse> createDynamicDict(CreateDynamicDictRequest request);

    /**
     * <b>description</b> :
     * <p>Pushes a file to the cloud for detection.</p>
     * <h3>File upload methods</h3>
     * <p>Two file upload methods are supported: pre-upload and download URL.
     * If you use the pre-upload method, confirm that the file is uploaded before you invoke this operation. For more information about how to upload a file, see the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation.
     * If you use the download URL method, pass in a download URL that supports public network access by using the DownloadUrl parameter.</p>
     * <h3>Unique file identifier</h3>
     * <p>All file detection operations include the HashKey parameter, which specifies the unique identifier of the file to be detected and is used to query detection results.
     * Calculate the HashKey before you call this operation. Only the MD5 or SHA-256 hash of the complete file content is supported.
     * To calculate the MD5 or SHA-256 hash of the file content, perform the following steps:</p>
     * <ol>
     * <li>Use the MD5 or SHA-256 algorithm to encrypt the data and generate a 128-bit or 256-bit hash value. Available libraries include Java MessageDigest and Python hashlib.</li>
     * <li>Encode the generated hash value as a hexadecimal string. Available libraries include Java Codec and the Python hex function. Make sure the final string is a combination of digits and lowercase letters. The MD5 hash is 32 characters long, and the SHA-256 hash is 64 characters long.
     * The push and query operations for a single detection must use the same HashKey. Otherwise, the detection cannot be correctly pushed and the results cannot be queried.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateFileDetect  CreateFileDetectRequest
     * @return CreateFileDetectResponse
     */
    CompletableFuture<CreateFileDetectResponse> createFileDetect(CreateFileDetectRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the parameters that are required to upload a file for detection. If the value of the response parameter FileExist is true, the file that you want to upload for detection already exists in the cloud. In this case, you can directly push the file for detection. If the value of the response parameter FileExist is false, you must use the form upload method to upload the file to the specified Object Storage Service (OSS) bucket based on the response parameters of this operation.
     * The form upload method is provided by OSS. For more information, see <a href="https://help.aliyun.com/document_detail/84788.html">Form upload</a>.
     * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.</p>
     * 
     * @param request the request parameters of CreateFileDetectUploadUrl  CreateFileDetectUploadUrlRequest
     * @return CreateFileDetectUploadUrlResponse
     */
    CompletableFuture<CreateFileDetectUploadUrlResponse> createFileDetectUploadUrl(CreateFileDetectUploadUrlRequest request);

    /**
     * @param request the request parameters of CreateFileProtectClientRule  CreateFileProtectClientRuleRequest
     * @return CreateFileProtectClientRuleResponse
     */
    CompletableFuture<CreateFileProtectClientRuleResponse> createFileProtectClientRule(CreateFileProtectClientRuleRequest request);

    /**
     * @param request the request parameters of CreateFileProtectRule  CreateFileProtectRuleRequest
     * @return CreateFileProtectRuleResponse
     */
    CompletableFuture<CreateFileProtectRuleResponse> createFileProtectRule(CreateFileProtectRuleRequest request);

    /**
     * @param request the request parameters of CreateFileUploadLimit  CreateFileUploadLimitRequest
     * @return CreateFileUploadLimitResponse
     */
    CompletableFuture<CreateFileUploadLimitResponse> createFileUploadLimit(CreateFileUploadLimitRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation to create a honeypot instance, complete the following steps:</p>
     * <ol>
     * <li>If no honeypot management node exists in your account, call the CreateHoneypotNode operation to create a honeypot management node.</li>
     * <li>Call the ListHoneypotNode operation to obtain the NodeId of the honeypot management node.</li>
     * <li>Use the obtained NodeId to call this operation (CreateHoneypot) to create a honeypot instance.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateHoneypot  CreateHoneypotRequest
     * @return CreateHoneypotResponse
     */
    CompletableFuture<CreateHoneypotResponse> createHoneypot(CreateHoneypotRequest request);

    /**
     * <b>description</b> :
     * <p>Before creating a management node, make sure that your account has a sufficient honeypot probe quota. Call <a href="~~DescribeHoneyPotAuth~~">DescribeHoneyPotAuth</a> and <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> to query the quota and node usage. If the quota is insufficient, call <a href="~~DeleteHoneypotNode~~">DeleteHoneypotNode</a> to release existing nodes or purchase more probe capacity.</p>
     * 
     * @param request the request parameters of CreateHoneypotNode  CreateHoneypotNodeRequest
     * @return CreateHoneypotNodeResponse
     */
    CompletableFuture<CreateHoneypotNodeResponse> createHoneypotNode(CreateHoneypotNodeRequest request);

    /**
     * @param request the request parameters of CreateHoneypotPreset  CreateHoneypotPresetRequest
     * @return CreateHoneypotPresetResponse
     */
    CompletableFuture<CreateHoneypotPresetResponse> createHoneypotPreset(CreateHoneypotPresetRequest request);

    /**
     * @param request the request parameters of CreateHoneypotProbe  CreateHoneypotProbeRequest
     * @return CreateHoneypotProbeResponse
     */
    CompletableFuture<CreateHoneypotProbeResponse> createHoneypotProbe(CreateHoneypotProbeRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation to create a probe service, prepare the honeypot infrastructure: purchase a probe authorization quota, and then call the CreateHoneypotNode operation to create a honeypot management node, the CreateHoneypotProbe operation to create a honeypot probe, and the CreateHoneypot operation to create a honeypot instance. After creating these resources, you can call this operation.</p>
     * 
     * @param request the request parameters of CreateHoneypotProbeBind  CreateHoneypotProbeBindRequest
     * @return CreateHoneypotProbeBindResponse
     */
    CompletableFuture<CreateHoneypotProbeBindResponse> createHoneypotProbeBind(CreateHoneypotProbeBindRequest request);

    /**
     * @param request the request parameters of CreateHybridProxyCluster  CreateHybridProxyClusterRequest
     * @return CreateHybridProxyClusterResponse
     */
    CompletableFuture<CreateHybridProxyClusterResponse> createHybridProxyCluster(CreateHybridProxyClusterRequest request);

    /**
     * @param request the request parameters of CreateInterceptionRule  CreateInterceptionRuleRequest
     * @return CreateInterceptionRuleResponse
     */
    CompletableFuture<CreateInterceptionRuleResponse> createInterceptionRule(CreateInterceptionRuleRequest request);

    /**
     * @param request the request parameters of CreateInterceptionTarget  CreateInterceptionTargetRequest
     * @return CreateInterceptionTargetResponse
     */
    CompletableFuture<CreateInterceptionTargetResponse> createInterceptionTarget(CreateInterceptionTargetRequest request);

    /**
     * @param request the request parameters of CreateJenkinsImageRegistry  CreateJenkinsImageRegistryRequest
     * @return CreateJenkinsImageRegistryResponse
     */
    CompletableFuture<CreateJenkinsImageRegistryResponse> createJenkinsImageRegistry(CreateJenkinsImageRegistryRequest request);

    /**
     * @param request the request parameters of CreateJenkinsImageScanTask  CreateJenkinsImageScanTaskRequest
     * @return CreateJenkinsImageScanTaskResponse
     */
    CompletableFuture<CreateJenkinsImageScanTaskResponse> createJenkinsImageScanTask(CreateJenkinsImageScanTaskRequest request);

    /**
     * @param request the request parameters of CreateMaliciousFileWhitelistConfig  CreateMaliciousFileWhitelistConfigRequest
     * @return CreateMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<CreateMaliciousFileWhitelistConfigResponse> createMaliciousFileWhitelistConfig(CreateMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of CreateMaliciousNote  CreateMaliciousNoteRequest
     * @return CreateMaliciousNoteResponse
     */
    CompletableFuture<CreateMaliciousNoteResponse> createMaliciousNote(CreateMaliciousNoteRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the management account of a resource directory or a delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of CreateMonitorAccount  CreateMonitorAccountRequest
     * @return CreateMonitorAccountResponse
     */
    CompletableFuture<CreateMonitorAccountResponse> createMonitorAccount(CreateMonitorAccountRequest request);

    /**
     * @param request the request parameters of CreateOpaClusterPlugin  CreateOpaClusterPluginRequest
     * @return CreateOpaClusterPluginResponse
     */
    CompletableFuture<CreateOpaClusterPluginResponse> createOpaClusterPlugin(CreateOpaClusterPluginRequest request);

    /**
     * @param request the request parameters of CreateOpaStrategyNew  CreateOpaStrategyNewRequest
     * @return CreateOpaStrategyNewResponse
     */
    CompletableFuture<CreateOpaStrategyNewResponse> createOpaStrategyNew(CreateOpaStrategyNewRequest request);

    /**
     * <b>description</b> :
     * <p>A server can belong only to one server group. If you call the CreateOrUpdateAssetGroup operation and the server specified in request parameters belongs to Server Group A, the server is removed from Server Group A and then added to the newly created or specified server group after the call is complete.</p>
     * 
     * @param request the request parameters of CreateOrUpdateAssetGroup  CreateOrUpdateAssetGroupRequest
     * @return CreateOrUpdateAssetGroupResponse
     */
    CompletableFuture<CreateOrUpdateAssetGroupResponse> createOrUpdateAssetGroup(CreateOrUpdateAssetGroupRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateAutoTagRule  CreateOrUpdateAutoTagRuleRequest
     * @return CreateOrUpdateAutoTagRuleResponse
     */
    CompletableFuture<CreateOrUpdateAutoTagRuleResponse> createOrUpdateAutoTagRule(CreateOrUpdateAutoTagRuleRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateDingTalk  CreateOrUpdateDingTalkRequest
     * @return CreateOrUpdateDingTalkResponse
     */
    CompletableFuture<CreateOrUpdateDingTalkResponse> createOrUpdateDingTalk(CreateOrUpdateDingTalkRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation to create an OSS bucket malicious file scan task, complete the following prerequisites in order:</p>
     * <ol>
     * <li>The OSS malicious file detection feature is activated for the Security Center instance.</li>
     * <li>The service-linked role AliyunServiceRoleForSas is created.</li>
     * <li>The OSS bucket to be scanned is created.</li>
     * <li>The RefreshOssBucketScanInfo operation is called to synchronize the OSS bucket information to Security Center.
     * After completing the preceding steps, you can call this operation to create a scan task.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateOssBucketScanTask  CreateOssBucketScanTaskRequest
     * @return CreateOssBucketScanTaskResponse
     */
    CompletableFuture<CreateOssBucketScanTaskResponse> createOssBucketScanTask(CreateOssBucketScanTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the <a href="~~PublicPreCheckImageScanTask~~">PublicPreCheckImageScanTask</a> operation to query the number of container images that the image scan task covers and the number of authorizations consumed. Make sure that sufficient authorizations are available for the image scan task to prevent the image scan task from being overwritten due to insufficient authorizations.</p>
     * 
     * @param request the request parameters of CreateOssScanConfig  CreateOssScanConfigRequest
     * @return CreateOssScanConfigResponse
     */
    CompletableFuture<CreateOssScanConfigResponse> createOssScanConfig(CreateOssScanConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using the management account of the resource directory or the delegated administrator account of Security Center. Before calling this operation, enable the multi-account security management feature by calling <a href="~~EnableServiceAccessResourceDirectory~~">EnableServiceAccessResourceDirectory</a>.</p>
     * 
     * @param request the request parameters of CreateRdDefaultSyncList  CreateRdDefaultSyncListRequest
     * @return CreateRdDefaultSyncListResponse
     */
    CompletableFuture<CreateRdDefaultSyncListResponse> createRdDefaultSyncList(CreateRdDefaultSyncListRequest request);

    /**
     * @param request the request parameters of CreateRestoreJob  CreateRestoreJobRequest
     * @return CreateRestoreJobResponse
     */
    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    /**
     * @param request the request parameters of CreateSasTrial  CreateSasTrialRequest
     * @return CreateSasTrialResponse
     */
    CompletableFuture<CreateSasTrialResponse> createSasTrial(CreateSasTrialRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about service-linked roles, see <a href="https://help.aliyun.com/document_detail/160674.html">Service-linked roles</a>.</p>
     * 
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>ActionTrail data delivery</strong> feature requires Cloud Security Posture Management (CSPM) and security alerting to read ActionTrail data. To use this feature, enable the <strong>ActionTrail data delivery</strong> toggle in the Security Center console and authorize the service-linked role <strong>AliyunServiceRoleForSas</strong> for Security Center. After authorization, ActionTrail data is delivered to the LogStore of Security Center.
     * For more information about the service-linked role <strong>AliyunServiceRoleForSas</strong> for Security Center, see <a href="https://help.aliyun.com/document_detail/460226.html">Service-linked role for Security Center</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before calling this operation, enable the <strong>ActionTrail data delivery</strong> toggle. For more information, see <a href="https://help.aliyun.com/document_detail/197302.html">Access control</a>.</p>
     * 
     * @param request the request parameters of CreateServiceTrail  CreateServiceTrailRequest
     * @return CreateServiceTrailResponse
     */
    CompletableFuture<CreateServiceTrailResponse> createServiceTrail(CreateServiceTrailRequest request);

    /**
     * @param request the request parameters of CreateSimilarSecurityEventsQueryTask  CreateSimilarSecurityEventsQueryTaskRequest
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation. Other editions do not support this operation.</p>
     * 
     * @param request the request parameters of CreateSoarStrategyTask  CreateSoarStrategyTaskRequest
     * @return CreateSoarStrategyTaskResponse
     */
    CompletableFuture<CreateSoarStrategyTaskResponse> createSoarStrategyTask(CreateSoarStrategyTaskRequest request);

    /**
     * @param request the request parameters of CreateSuspEventNote  CreateSuspEventNoteRequest
     * @return CreateSuspEventNoteResponse
     */
    CompletableFuture<CreateSuspEventNoteResponse> createSuspEventNote(CreateSuspEventNoteRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, choose one of the following paths:</p>
     * <ul>
     * <li>If DatabaseAddByUser is not set to true, install the Security Center agent on the ECS instance first, call StartDiscoverDatabaseTask to initiate database discovery, and then call DescribeUniBackupDatabase to confirm that the target database has been discovered.</li>
     * <li>If DatabaseAddByUser is set to true, you can manually register the database.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUniBackupPolicy  CreateUniBackupPolicyRequest
     * @return CreateUniBackupPolicyResponse
     */
    CompletableFuture<CreateUniBackupPolicyResponse> createUniBackupPolicy(CreateUniBackupPolicyRequest request);

    /**
     * @param request the request parameters of CreateUniRestorePlan  CreateUniRestorePlanRequest
     * @return CreateUniRestorePlanResponse
     */
    CompletableFuture<CreateUniRestorePlanResponse> createUniRestorePlan(CreateUniRestorePlanRequest request);

    /**
     * @param request the request parameters of CreateUnknownThreatDetectStrategy  CreateUnknownThreatDetectStrategyRequest
     * @return CreateUnknownThreatDetectStrategyResponse
     */
    CompletableFuture<CreateUnknownThreatDetectStrategyResponse> createUnknownThreatDetectStrategy(CreateUnknownThreatDetectStrategyRequest request);

    /**
     * @param request the request parameters of CreateUserSetting  CreateUserSettingRequest
     * @return CreateUserSettingResponse
     */
    CompletableFuture<CreateUserSettingResponse> createUserSetting(CreateUserSettingRequest request);

    /**
     * @param request the request parameters of CreateVirusScanOnceTask  CreateVirusScanOnceTaskRequest
     * @return CreateVirusScanOnceTaskResponse
     */
    CompletableFuture<CreateVirusScanOnceTaskResponse> createVirusScanOnceTask(CreateVirusScanOnceTaskRequest request);

    /**
     * @param request the request parameters of CreateVulAutoRepairConfig  CreateVulAutoRepairConfigRequest
     * @return CreateVulAutoRepairConfigResponse
     */
    CompletableFuture<CreateVulAutoRepairConfigResponse> createVulAutoRepairConfig(CreateVulAutoRepairConfigRequest request);

    /**
     * @param request the request parameters of DeleteAntiBruteForceRule  DeleteAntiBruteForceRuleRequest
     * @return DeleteAntiBruteForceRuleResponse
     */
    CompletableFuture<DeleteAntiBruteForceRuleResponse> deleteAntiBruteForceRule(DeleteAntiBruteForceRuleRequest request);

    /**
     * @param request the request parameters of DeleteAttackPathSensitiveAssetConfig  DeleteAttackPathSensitiveAssetConfigRequest
     * @return DeleteAttackPathSensitiveAssetConfigResponse
     */
    CompletableFuture<DeleteAttackPathSensitiveAssetConfigResponse> deleteAttackPathSensitiveAssetConfig(DeleteAttackPathSensitiveAssetConfigRequest request);

    /**
     * @param request the request parameters of DeleteAttackPathWhitelist  DeleteAttackPathWhitelistRequest
     * @return DeleteAttackPathWhitelistResponse
     */
    CompletableFuture<DeleteAttackPathWhitelistResponse> deleteAttackPathWhitelist(DeleteAttackPathWhitelistRequest request);

    /**
     * @param request the request parameters of DeleteAttestor  DeleteAttestorRequest
     * @return DeleteAttestorResponse
     */
    CompletableFuture<DeleteAttestorResponse> deleteAttestor(DeleteAttestorRequest request);

    /**
     * @param request the request parameters of DeleteAutoTagRules  DeleteAutoTagRulesRequest
     * @return DeleteAutoTagRulesResponse
     */
    CompletableFuture<DeleteAutoTagRulesResponse> deleteAutoTagRules(DeleteAutoTagRulesRequest request);

    /**
     * @param request the request parameters of DeleteBackupPolicy  DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    /**
     * @param request the request parameters of DeleteBackupPolicyMachine  DeleteBackupPolicyMachineRequest
     * @return DeleteBackupPolicyMachineResponse
     */
    CompletableFuture<DeleteBackupPolicyMachineResponse> deleteBackupPolicyMachine(DeleteBackupPolicyMachineRequest request);

    /**
     * @param request the request parameters of DeleteBackupSnapshot  DeleteBackupSnapshotRequest
     * @return DeleteBackupSnapshotResponse
     */
    CompletableFuture<DeleteBackupSnapshotResponse> deleteBackupSnapshot(DeleteBackupSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteBaselineCheckWhiteRecord  DeleteBaselineCheckWhiteRecordRequest
     * @return DeleteBaselineCheckWhiteRecordResponse
     */
    CompletableFuture<DeleteBaselineCheckWhiteRecordResponse> deleteBaselineCheckWhiteRecord(DeleteBaselineCheckWhiteRecordRequest request);

    /**
     * @param request the request parameters of DeleteBinarySecurityPolicy  DeleteBinarySecurityPolicyRequest
     * @return DeleteBinarySecurityPolicyResponse
     */
    CompletableFuture<DeleteBinarySecurityPolicyResponse> deleteBinarySecurityPolicy(DeleteBinarySecurityPolicyRequest request);

    /**
     * @param request the request parameters of DeleteCheckItem  DeleteCheckItemRequest
     * @return DeleteCheckItemResponse
     */
    CompletableFuture<DeleteCheckItemResponse> deleteCheckItem(DeleteCheckItemRequest request);

    /**
     * @param request the request parameters of DeleteCheckPolicy  DeleteCheckPolicyRequest
     * @return DeleteCheckPolicyResponse
     */
    CompletableFuture<DeleteCheckPolicyResponse> deleteCheckPolicy(DeleteCheckPolicyRequest request);

    /**
     * @param request the request parameters of DeleteClientUserDefineRule  DeleteClientUserDefineRuleRequest
     * @return DeleteClientUserDefineRuleResponse
     */
    CompletableFuture<DeleteClientUserDefineRuleResponse> deleteClientUserDefineRule(DeleteClientUserDefineRuleRequest request);

    /**
     * @param request the request parameters of DeleteCloudVendorAccountAK  DeleteCloudVendorAccountAKRequest
     * @return DeleteCloudVendorAccountAKResponse
     */
    CompletableFuture<DeleteCloudVendorAccountAKResponse> deleteCloudVendorAccountAK(DeleteCloudVendorAccountAKRequest request);

    /**
     * @param request the request parameters of DeleteContainerDefenseRule  DeleteContainerDefenseRuleRequest
     * @return DeleteContainerDefenseRuleResponse
     */
    CompletableFuture<DeleteContainerDefenseRuleResponse> deleteContainerDefenseRule(DeleteContainerDefenseRuleRequest request);

    /**
     * @param request the request parameters of DeleteContainerPluginRule  DeleteContainerPluginRuleRequest
     * @return DeleteContainerPluginRuleResponse
     */
    CompletableFuture<DeleteContainerPluginRuleResponse> deleteContainerPluginRule(DeleteContainerPluginRuleRequest request);

    /**
     * @param request the request parameters of DeleteCustomBlockRecord  DeleteCustomBlockRecordRequest
     * @return DeleteCustomBlockRecordResponse
     */
    CompletableFuture<DeleteCustomBlockRecordResponse> deleteCustomBlockRecord(DeleteCustomBlockRecordRequest request);

    /**
     * @param request the request parameters of DeleteCustomizeReport  DeleteCustomizeReportRequest
     * @return DeleteCustomizeReportResponse
     */
    CompletableFuture<DeleteCustomizeReportResponse> deleteCustomizeReport(DeleteCustomizeReportRequest request);

    /**
     * @param request the request parameters of DeleteCustomizedDict  DeleteCustomizedDictRequest
     * @return DeleteCustomizedDictResponse
     */
    CompletableFuture<DeleteCustomizedDictResponse> deleteCustomizedDict(DeleteCustomizedDictRequest request);

    /**
     * @param request the request parameters of DeleteCycleTask  DeleteCycleTaskRequest
     * @return DeleteCycleTaskResponse
     */
    CompletableFuture<DeleteCycleTaskResponse> deleteCycleTask(DeleteCycleTaskRequest request);

    /**
     * @param request the request parameters of DeleteDingTalk  DeleteDingTalkRequest
     * @return DeleteDingTalkResponse
     */
    CompletableFuture<DeleteDingTalkResponse> deleteDingTalk(DeleteDingTalkRequest request);

    /**
     * @param request the request parameters of DeleteFileProtectClientRule  DeleteFileProtectClientRuleRequest
     * @return DeleteFileProtectClientRuleResponse
     */
    CompletableFuture<DeleteFileProtectClientRuleResponse> deleteFileProtectClientRule(DeleteFileProtectClientRuleRequest request);

    /**
     * @param request the request parameters of DeleteFileProtectRule  DeleteFileProtectRuleRequest
     * @return DeleteFileProtectRuleResponse
     */
    CompletableFuture<DeleteFileProtectRuleResponse> deleteFileProtectRule(DeleteFileProtectRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete the default server group provided by Security Center, which is <strong>Ungrouped</strong>. After you delete a group, the assets in the group are moved to <strong>Ungrouped</strong> by default.</p>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteHoneypot  DeleteHoneypotRequest
     * @return DeleteHoneypotResponse
     */
    CompletableFuture<DeleteHoneypotResponse> deleteHoneypot(DeleteHoneypotRequest request);

    /**
     * @param request the request parameters of DeleteHoneypotNode  DeleteHoneypotNodeRequest
     * @return DeleteHoneypotNodeResponse
     */
    CompletableFuture<DeleteHoneypotNodeResponse> deleteHoneypotNode(DeleteHoneypotNodeRequest request);

    /**
     * @param request the request parameters of DeleteHoneypotPreset  DeleteHoneypotPresetRequest
     * @return DeleteHoneypotPresetResponse
     */
    CompletableFuture<DeleteHoneypotPresetResponse> deleteHoneypotPreset(DeleteHoneypotPresetRequest request);

    /**
     * @param request the request parameters of DeleteHoneypotProbe  DeleteHoneypotProbeRequest
     * @return DeleteHoneypotProbeResponse
     */
    CompletableFuture<DeleteHoneypotProbeResponse> deleteHoneypotProbe(DeleteHoneypotProbeRequest request);

    /**
     * @param request the request parameters of DeleteHoneypotProbeBind  DeleteHoneypotProbeBindRequest
     * @return DeleteHoneypotProbeBindResponse
     */
    CompletableFuture<DeleteHoneypotProbeBindResponse> deleteHoneypotProbeBind(DeleteHoneypotProbeBindRequest request);

    /**
     * @param request the request parameters of DeleteHybridProxy  DeleteHybridProxyRequest
     * @return DeleteHybridProxyResponse
     */
    CompletableFuture<DeleteHybridProxyResponse> deleteHybridProxy(DeleteHybridProxyRequest request);

    /**
     * @param request the request parameters of DeleteHybridProxyCluster  DeleteHybridProxyClusterRequest
     * @return DeleteHybridProxyClusterResponse
     */
    CompletableFuture<DeleteHybridProxyClusterResponse> deleteHybridProxyCluster(DeleteHybridProxyClusterRequest request);

    /**
     * @param request the request parameters of DeleteIdcProbe  DeleteIdcProbeRequest
     * @return DeleteIdcProbeResponse
     */
    CompletableFuture<DeleteIdcProbeResponse> deleteIdcProbe(DeleteIdcProbeRequest request);

    /**
     * @param request the request parameters of DeleteImageEventOperation  DeleteImageEventOperationRequest
     * @return DeleteImageEventOperationResponse
     */
    CompletableFuture<DeleteImageEventOperationResponse> deleteImageEventOperation(DeleteImageEventOperationRequest request);

    /**
     * @param request the request parameters of DeleteImageVulWhitelist  DeleteImageVulWhitelistRequest
     * @return DeleteImageVulWhitelistResponse
     */
    CompletableFuture<DeleteImageVulWhitelistResponse> deleteImageVulWhitelist(DeleteImageVulWhitelistRequest request);

    /**
     * @param request the request parameters of DeleteInstallCode  DeleteInstallCodeRequest
     * @return DeleteInstallCodeResponse
     */
    CompletableFuture<DeleteInstallCodeResponse> deleteInstallCode(DeleteInstallCodeRequest request);

    /**
     * @param request the request parameters of DeleteInterceptionRule  DeleteInterceptionRuleRequest
     * @return DeleteInterceptionRuleResponse
     */
    CompletableFuture<DeleteInterceptionRuleResponse> deleteInterceptionRule(DeleteInterceptionRuleRequest request);

    /**
     * @param request the request parameters of DeleteInterceptionTarget  DeleteInterceptionTargetRequest
     * @return DeleteInterceptionTargetResponse
     */
    CompletableFuture<DeleteInterceptionTargetResponse> deleteInterceptionTarget(DeleteInterceptionTargetRequest request);

    /**
     * @param request the request parameters of DeleteK8sAccessInfo  DeleteK8sAccessInfoRequest
     * @return DeleteK8sAccessInfoResponse
     */
    CompletableFuture<DeleteK8sAccessInfoResponse> deleteK8sAccessInfo(DeleteK8sAccessInfoRequest request);

    /**
     * @param request the request parameters of DeleteLoginBaseConfig  DeleteLoginBaseConfigRequest
     * @return DeleteLoginBaseConfigResponse
     */
    CompletableFuture<DeleteLoginBaseConfigResponse> deleteLoginBaseConfig(DeleteLoginBaseConfigRequest request);

    /**
     * @param request the request parameters of DeleteMaliciousFileWhitelistConfig  DeleteMaliciousFileWhitelistConfigRequest
     * @return DeleteMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<DeleteMaliciousFileWhitelistConfigResponse> deleteMaliciousFileWhitelistConfig(DeleteMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of DeleteMaliciousNote  DeleteMaliciousNoteRequest
     * @return DeleteMaliciousNoteResponse
     */
    CompletableFuture<DeleteMaliciousNoteResponse> deleteMaliciousNote(DeleteMaliciousNoteRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using the management account of the resource directory or the delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of DeleteMonitorAccount  DeleteMonitorAccountRequest
     * @return DeleteMonitorAccountResponse
     */
    CompletableFuture<DeleteMonitorAccountResponse> deleteMonitorAccount(DeleteMonitorAccountRequest request);

    /**
     * @param request the request parameters of DeleteOpaStrategyNew  DeleteOpaStrategyNewRequest
     * @return DeleteOpaStrategyNewResponse
     */
    CompletableFuture<DeleteOpaStrategyNewResponse> deleteOpaStrategyNew(DeleteOpaStrategyNewRequest request);

    /**
     * @param request the request parameters of DeleteOssScanConfig  DeleteOssScanConfigRequest
     * @return DeleteOssScanConfigResponse
     */
    CompletableFuture<DeleteOssScanConfigResponse> deleteOssScanConfig(DeleteOssScanConfigRequest request);

    /**
     * @param request the request parameters of DeletePrivateRegistry  DeletePrivateRegistryRequest
     * @return DeletePrivateRegistryResponse
     */
    CompletableFuture<DeletePrivateRegistryResponse> deletePrivateRegistry(DeletePrivateRegistryRequest request);

    /**
     * @param request the request parameters of DeleteSasContainerWebDefenseRule  DeleteSasContainerWebDefenseRuleRequest
     * @return DeleteSasContainerWebDefenseRuleResponse
     */
    CompletableFuture<DeleteSasContainerWebDefenseRuleResponse> deleteSasContainerWebDefenseRule(DeleteSasContainerWebDefenseRuleRequest request);

    /**
     * @param request the request parameters of DeleteSearchCondition  DeleteSearchConditionRequest
     * @return DeleteSearchConditionResponse
     */
    CompletableFuture<DeleteSearchConditionResponse> deleteSearchCondition(DeleteSearchConditionRequest request);

    /**
     * @deprecated OpenAPI DeleteSecurityEventMarkMissList is deprecated, please use Sas::2018-12-03::ModifySecurityEventMarkMissIndividually instead.  * @param request  the request parameters of DeleteSecurityEventMarkMissList  DeleteSecurityEventMarkMissListRequest
     * @return DeleteSecurityEventMarkMissListResponse
     */
    @Deprecated
    CompletableFuture<DeleteSecurityEventMarkMissListResponse> deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request);

    /**
     * @param request the request parameters of DeleteServiceTrail  DeleteServiceTrailRequest
     * @return DeleteServiceTrailResponse
     */
    CompletableFuture<DeleteServiceTrailResponse> deleteServiceTrail(DeleteServiceTrailRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API call. Other editions are not supported.</p>
     * 
     * @param request the request parameters of DeleteSoarStrategyTask  DeleteSoarStrategyTaskRequest
     * @return DeleteSoarStrategyTaskResponse
     */
    CompletableFuture<DeleteSoarStrategyTaskResponse> deleteSoarStrategyTask(DeleteSoarStrategyTaskRequest request);

    /**
     * @param request the request parameters of DeleteStrategy  DeleteStrategyRequest
     * @return DeleteStrategyResponse
     */
    CompletableFuture<DeleteStrategyResponse> deleteStrategy(DeleteStrategyRequest request);

    /**
     * @param request the request parameters of DeleteSuspEventNode  DeleteSuspEventNodeRequest
     * @return DeleteSuspEventNodeResponse
     */
    CompletableFuture<DeleteSuspEventNodeResponse> deleteSuspEventNode(DeleteSuspEventNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Asset labels are classified into asset importance labels and custom labels. When you call this operation, only custom labels bound to assets can be deleted. Asset importance labels cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteTagWithUuid  DeleteTagWithUuidRequest
     * @return DeleteTagWithUuidResponse
     */
    CompletableFuture<DeleteTagWithUuidResponse> deleteTagWithUuid(DeleteTagWithUuidRequest request);

    /**
     * @param request the request parameters of DeleteUniBackupPolicy  DeleteUniBackupPolicyRequest
     * @return DeleteUniBackupPolicyResponse
     */
    CompletableFuture<DeleteUniBackupPolicyResponse> deleteUniBackupPolicy(DeleteUniBackupPolicyRequest request);

    /**
     * @param request the request parameters of DeleteUnknownThreatDetectProcess  DeleteUnknownThreatDetectProcessRequest
     * @return DeleteUnknownThreatDetectProcessResponse
     */
    CompletableFuture<DeleteUnknownThreatDetectProcessResponse> deleteUnknownThreatDetectProcess(DeleteUnknownThreatDetectProcessRequest request);

    /**
     * @param request the request parameters of DeleteUnknownThreatDetectStrategy  DeleteUnknownThreatDetectStrategyRequest
     * @return DeleteUnknownThreatDetectStrategyResponse
     */
    CompletableFuture<DeleteUnknownThreatDetectStrategyResponse> deleteUnknownThreatDetectStrategy(DeleteUnknownThreatDetectStrategyRequest request);

    /**
     * @param request the request parameters of DeleteVpcHoneyPot  DeleteVpcHoneyPotRequest
     * @return DeleteVpcHoneyPotResponse
     */
    CompletableFuture<DeleteVpcHoneyPotResponse> deleteVpcHoneyPot(DeleteVpcHoneyPotRequest request);

    /**
     * @param request the request parameters of DeleteVulAutoRepairConfig  DeleteVulAutoRepairConfigRequest
     * @return DeleteVulAutoRepairConfigResponse
     */
    CompletableFuture<DeleteVulAutoRepairConfigResponse> deleteVulAutoRepairConfig(DeleteVulAutoRepairConfigRequest request);

    /**
     * @param request the request parameters of DeleteVulWhitelist  DeleteVulWhitelistRequest
     * @return DeleteVulWhitelistResponse
     */
    CompletableFuture<DeleteVulWhitelistResponse> deleteVulWhitelist(DeleteVulWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeAIAssetSummary  DescribeAIAssetSummaryRequest
     * @return DescribeAIAssetSummaryResponse
     */
    CompletableFuture<DescribeAIAssetSummaryResponse> describeAIAssetSummary(DescribeAIAssetSummaryRequest request);

    /**
     * @param request the request parameters of DescribeAccessKeyLeakDetail  DescribeAccessKeyLeakDetailRequest
     * @return DescribeAccessKeyLeakDetailResponse
     */
    CompletableFuture<DescribeAccessKeyLeakDetailResponse> describeAccessKeyLeakDetail(DescribeAccessKeyLeakDetailRequest request);

    /**
     * @param request the request parameters of DescribeAccesskeyLeakList  DescribeAccesskeyLeakListRequest
     * @return DescribeAccesskeyLeakListResponse
     */
    CompletableFuture<DescribeAccesskeyLeakListResponse> describeAccesskeyLeakList(DescribeAccesskeyLeakListRequest request);

    /**
     * @param request the request parameters of DescribeAffectedAssets  DescribeAffectedAssetsRequest
     * @return DescribeAffectedAssetsResponse
     */
    CompletableFuture<DescribeAffectedAssetsResponse> describeAffectedAssets(DescribeAffectedAssetsRequest request);

    /**
     * @param request the request parameters of DescribeAffectedMaliciousFileImages  DescribeAffectedMaliciousFileImagesRequest
     * @return DescribeAffectedMaliciousFileImagesResponse
     */
    CompletableFuture<DescribeAffectedMaliciousFileImagesResponse> describeAffectedMaliciousFileImages(DescribeAffectedMaliciousFileImagesRequest request);

    /**
     * @param request the request parameters of DescribeAgentInstallStatus  DescribeAgentInstallStatusRequest
     * @return DescribeAgentInstallStatusResponse
     */
    CompletableFuture<DescribeAgentInstallStatusResponse> describeAgentInstallStatus(DescribeAgentInstallStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts that have activated the pay-as-you-go billing method for the agentless detection feature of Security Center can call this operation.</p>
     * 
     * @param request the request parameters of DescribeAgentlessSensitiveFileByKey  DescribeAgentlessSensitiveFileByKeyRequest
     * @return DescribeAgentlessSensitiveFileByKeyResponse
     */
    CompletableFuture<DescribeAgentlessSensitiveFileByKeyResponse> describeAgentlessSensitiveFileByKey(DescribeAgentlessSensitiveFileByKeyRequest request);

    /**
     * @param request the request parameters of DescribeAlarmEventDetail  DescribeAlarmEventDetailRequest
     * @return DescribeAlarmEventDetailResponse
     */
    CompletableFuture<DescribeAlarmEventDetailResponse> describeAlarmEventDetail(DescribeAlarmEventDetailRequest request);

    /**
     * @deprecated OpenAPI DescribeAlarmEventStackInfo is deprecated  * @param request  the request parameters of DescribeAlarmEventStackInfo  DescribeAlarmEventStackInfoRequest
     * @return DescribeAlarmEventStackInfoResponse
     */
    @Deprecated
    CompletableFuture<DescribeAlarmEventStackInfoResponse> describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request);

    /**
     * @param request the request parameters of DescribeAllEntity  DescribeAllEntityRequest
     * @return DescribeAllEntityResponse
     */
    CompletableFuture<DescribeAllEntityResponse> describeAllEntity(DescribeAllEntityRequest request);

    /**
     * @param request the request parameters of DescribeAllGroups  DescribeAllGroupsRequest
     * @return DescribeAllGroupsResponse
     */
    CompletableFuture<DescribeAllGroupsResponse> describeAllGroups(DescribeAllGroupsRequest request);

    /**
     * @param request the request parameters of DescribeAllImageBaseline  DescribeAllImageBaselineRequest
     * @return DescribeAllImageBaselineResponse
     */
    CompletableFuture<DescribeAllImageBaselineResponse> describeAllImageBaseline(DescribeAllImageBaselineRequest request);

    /**
     * @param request the request parameters of DescribeAllRegionsStatistics  DescribeAllRegionsStatisticsRequest
     * @return DescribeAllRegionsStatisticsResponse
     */
    CompletableFuture<DescribeAllRegionsStatisticsResponse> describeAllRegionsStatistics(DescribeAllRegionsStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeAntiBruteForceRules  DescribeAntiBruteForceRulesRequest
     * @return DescribeAntiBruteForceRulesResponse
     */
    CompletableFuture<DescribeAntiBruteForceRulesResponse> describeAntiBruteForceRules(DescribeAntiBruteForceRulesRequest request);

    /**
     * @param request the request parameters of DescribeAppVulScanCycle  DescribeAppVulScanCycleRequest
     * @return DescribeAppVulScanCycleResponse
     */
    CompletableFuture<DescribeAppVulScanCycleResponse> describeAppVulScanCycle(DescribeAppVulScanCycleRequest request);

    /**
     * @deprecated OpenAPI DescribeAssetDetailByUuid is deprecated, please use Sas::2018-12-03::GetAssetDetailByUuid instead.  * @description This operation is about to be deprecated. Call the [GetAssetDetailByUuid](~~GetAssetDetailByUuid~~) operation to obtain asset details.
     * 
     * @param request the request parameters of DescribeAssetDetailByUuid  DescribeAssetDetailByUuidRequest
     * @return DescribeAssetDetailByUuidResponse
     */
    @Deprecated
    CompletableFuture<DescribeAssetDetailByUuidResponse> describeAssetDetailByUuid(DescribeAssetDetailByUuidRequest request);

    /**
     * @param request the request parameters of DescribeAssetDetailByUuids  DescribeAssetDetailByUuidsRequest
     * @return DescribeAssetDetailByUuidsResponse
     */
    CompletableFuture<DescribeAssetDetailByUuidsResponse> describeAssetDetailByUuids(DescribeAssetDetailByUuidsRequest request);

    /**
     * @param request the request parameters of DescribeAssetSummary  DescribeAssetSummaryRequest
     * @return DescribeAssetSummaryResponse
     */
    CompletableFuture<DescribeAssetSummaryResponse> describeAssetSummary(DescribeAssetSummaryRequest request);

    /**
     * @param request the request parameters of DescribeAssetsScaProcessNum  DescribeAssetsScaProcessNumRequest
     * @return DescribeAssetsScaProcessNumResponse
     */
    CompletableFuture<DescribeAssetsScaProcessNumResponse> describeAssetsScaProcessNum(DescribeAssetsScaProcessNumRequest request);

    /**
     * @param request the request parameters of DescribeAssetsSecurityEventSummary  DescribeAssetsSecurityEventSummaryRequest
     * @return DescribeAssetsSecurityEventSummaryResponse
     */
    CompletableFuture<DescribeAssetsSecurityEventSummaryResponse> describeAssetsSecurityEventSummary(DescribeAssetsSecurityEventSummaryRequest request);

    /**
     * @deprecated OpenAPI DescribeAttackAnalysisData is deprecated, please use Sas::2018-12-03::ListAttackEventInfo instead.  * @param request  the request parameters of DescribeAttackAnalysisData  DescribeAttackAnalysisDataRequest
     * @return DescribeAttackAnalysisDataResponse
     */
    @Deprecated
    CompletableFuture<DescribeAttackAnalysisDataResponse> describeAttackAnalysisData(DescribeAttackAnalysisDataRequest request);

    /**
     * @param request the request parameters of DescribeAttestors  DescribeAttestorsRequest
     * @return DescribeAttestorsResponse
     */
    CompletableFuture<DescribeAttestorsResponse> describeAttestors(DescribeAttestorsRequest request);

    /**
     * @param request the request parameters of DescribeAutoDelConfig  DescribeAutoDelConfigRequest
     * @return DescribeAutoDelConfigResponse
     */
    CompletableFuture<DescribeAutoDelConfigResponse> describeAutoDelConfig(DescribeAutoDelConfigRequest request);

    /**
     * @param request the request parameters of DescribeBackUpExportInfo  DescribeBackUpExportInfoRequest
     * @return DescribeBackUpExportInfoResponse
     */
    CompletableFuture<DescribeBackUpExportInfoResponse> describeBackUpExportInfo(DescribeBackUpExportInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries servers that have the anti-ransomware client installed in a specified region.</p>
     * 
     * @param request the request parameters of DescribeBackupClients  DescribeBackupClientsRequest
     * @return DescribeBackupClientsResponse
     */
    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    /**
     * @param request the request parameters of DescribeBackupFiles  DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     */
    CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request);

    /**
     * @param request the request parameters of DescribeBackupMachineStatus  DescribeBackupMachineStatusRequest
     * @return DescribeBackupMachineStatusResponse
     */
    CompletableFuture<DescribeBackupMachineStatusResponse> describeBackupMachineStatus(DescribeBackupMachineStatusRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicies  DescribeBackupPoliciesRequest
     * @return DescribeBackupPoliciesResponse
     */
    CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>If you have created anti-ransomware restoration tasks, you can call this operation to query the number of anti-ransomware restoration tasks in the <strong>Restored</strong> and <strong>Restoring</strong> states.</p>
     * 
     * @param request the request parameters of DescribeBackupRestoreCount  DescribeBackupRestoreCountRequest
     * @return DescribeBackupRestoreCountResponse
     */
    CompletableFuture<DescribeBackupRestoreCountResponse> describeBackupRestoreCount(DescribeBackupRestoreCountRequest request);

    /**
     * @param request the request parameters of DescribeBinarySecurityPolicies  DescribeBinarySecurityPoliciesRequest
     * @return DescribeBinarySecurityPoliciesResponse
     */
    CompletableFuture<DescribeBinarySecurityPoliciesResponse> describeBinarySecurityPolicies(DescribeBinarySecurityPoliciesRequest request);

    /**
     * @param request the request parameters of DescribeBruteForceRecords  DescribeBruteForceRecordsRequest
     * @return DescribeBruteForceRecordsResponse
     */
    CompletableFuture<DescribeBruteForceRecordsResponse> describeBruteForceRecords(DescribeBruteForceRecordsRequest request);

    /**
     * @param request the request parameters of DescribeBruteForceSummary  DescribeBruteForceSummaryRequest
     * @return DescribeBruteForceSummaryResponse
     */
    CompletableFuture<DescribeBruteForceSummaryResponse> describeBruteForceSummary(DescribeBruteForceSummaryRequest request);

    /**
     * @param request the request parameters of DescribeCanAccessVpcSale  DescribeCanAccessVpcSaleRequest
     * @return DescribeCanAccessVpcSaleResponse
     */
    CompletableFuture<DescribeCanAccessVpcSaleResponse> describeCanAccessVpcSale(DescribeCanAccessVpcSaleRequest request);

    /**
     * @param request the request parameters of DescribeCanFixVulList  DescribeCanFixVulListRequest
     * @return DescribeCanFixVulListResponse
     */
    CompletableFuture<DescribeCanFixVulListResponse> describeCanFixVulList(DescribeCanFixVulListRequest request);

    /**
     * @param request the request parameters of DescribeCanTrySas  DescribeCanTrySasRequest
     * @return DescribeCanTrySasResponse
     */
    CompletableFuture<DescribeCanTrySasResponse> describeCanTrySas(DescribeCanTrySasRequest request);

    /**
     * <b>description</b> :
     * <p>Before querying chart data for a custom report, perform the following steps in order:</p>
     * <ol>
     * <li>Call <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> to obtain the ReportId and confirm the report version.</li>
     * <li>Call <a href="~~DescribeChartList~~">DescribeChartList</a>, set ProjectCode to customize_report, and pass in the ReportId to obtain the chart ID.</li>
     * <li>Call this operation to query chart data. If the report version is 1.0.0, the CharId parameter is required. If the report version is 2.0.0, the ChartId parameter is required. Use the IDs returned by the corresponding report and chart.</li>
     * </ol>
     * 
     * @param request the request parameters of DescribeChartData  DescribeChartDataRequest
     * @return DescribeChartDataResponse
     */
    CompletableFuture<DescribeChartDataResponse> describeChartData(DescribeChartDataRequest request);

    /**
     * @param request the request parameters of DescribeChartList  DescribeChartListRequest
     * @return DescribeChartListResponse
     */
    CompletableFuture<DescribeChartListResponse> describeChartList(DescribeChartListRequest request);

    /**
     * @param request the request parameters of DescribeCheckEcsWarnings  DescribeCheckEcsWarningsRequest
     * @return DescribeCheckEcsWarningsResponse
     */
    CompletableFuture<DescribeCheckEcsWarningsResponse> describeCheckEcsWarnings(DescribeCheckEcsWarningsRequest request);

    /**
     * @param request the request parameters of DescribeCheckFixDetails  DescribeCheckFixDetailsRequest
     * @return DescribeCheckFixDetailsResponse
     */
    CompletableFuture<DescribeCheckFixDetailsResponse> describeCheckFixDetails(DescribeCheckFixDetailsRequest request);

    /**
     * @param request the request parameters of DescribeCheckResult  DescribeCheckResultRequest
     * @return DescribeCheckResultResponse
     */
    CompletableFuture<DescribeCheckResultResponse> describeCheckResult(DescribeCheckResultRequest request);

    /**
     * @param request the request parameters of DescribeCheckWarningCount  DescribeCheckWarningCountRequest
     * @return DescribeCheckWarningCountResponse
     */
    CompletableFuture<DescribeCheckWarningCountResponse> describeCheckWarningCount(DescribeCheckWarningCountRequest request);

    /**
     * @param request the request parameters of DescribeCheckWarningDetail  DescribeCheckWarningDetailRequest
     * @return DescribeCheckWarningDetailResponse
     */
    CompletableFuture<DescribeCheckWarningDetailResponse> describeCheckWarningDetail(DescribeCheckWarningDetailRequest request);

    /**
     * @param request the request parameters of DescribeCheckWarningMachines  DescribeCheckWarningMachinesRequest
     * @return DescribeCheckWarningMachinesResponse
     */
    CompletableFuture<DescribeCheckWarningMachinesResponse> describeCheckWarningMachines(DescribeCheckWarningMachinesRequest request);

    /**
     * @param request the request parameters of DescribeCheckWarningSummary  DescribeCheckWarningSummaryRequest
     * @return DescribeCheckWarningSummaryResponse
     */
    CompletableFuture<DescribeCheckWarningSummaryResponse> describeCheckWarningSummary(DescribeCheckWarningSummaryRequest request);

    /**
     * @param request the request parameters of DescribeCheckWarnings  DescribeCheckWarningsRequest
     * @return DescribeCheckWarningsResponse
     */
    CompletableFuture<DescribeCheckWarningsResponse> describeCheckWarnings(DescribeCheckWarningsRequest request);

    /**
     * @param request the request parameters of DescribeClientConfSetup  DescribeClientConfSetupRequest
     * @return DescribeClientConfSetupResponse
     */
    CompletableFuture<DescribeClientConfSetupResponse> describeClientConfSetup(DescribeClientConfSetupRequest request);

    /**
     * @param request the request parameters of DescribeClientConfStrategy  DescribeClientConfStrategyRequest
     * @return DescribeClientConfStrategyResponse
     */
    CompletableFuture<DescribeClientConfStrategyResponse> describeClientConfStrategy(DescribeClientConfStrategyRequest request);

    /**
     * @param request the request parameters of DescribeClientProblemType  DescribeClientProblemTypeRequest
     * @return DescribeClientProblemTypeResponse
     */
    CompletableFuture<DescribeClientProblemTypeResponse> describeClientProblemType(DescribeClientProblemTypeRequest request);

    /**
     * <b>description</b> :
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. You can also set logical relationships between different search conditions to search for assets that meet multiple criteria.</p>
     * 
     * @param request the request parameters of DescribeCloudCenterInstances  DescribeCloudCenterInstancesRequest
     * @return DescribeCloudCenterInstancesResponse
     */
    CompletableFuture<DescribeCloudCenterInstancesResponse> describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeCloudProductFieldStatistics is deprecated, please use Sas::2018-12-03::GetCloudAssetSummary instead.  * @param request  the request parameters of DescribeCloudProductFieldStatistics  DescribeCloudProductFieldStatisticsRequest
     * @return DescribeCloudProductFieldStatisticsResponse
     */
    @Deprecated
    CompletableFuture<DescribeCloudProductFieldStatisticsResponse> describeCloudProductFieldStatistics(DescribeCloudProductFieldStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeCloudVendorAccountAKList  DescribeCloudVendorAccountAKListRequest
     * @return DescribeCloudVendorAccountAKListResponse
     */
    CompletableFuture<DescribeCloudVendorAccountAKListResponse> describeCloudVendorAccountAKList(DescribeCloudVendorAccountAKListRequest request);

    /**
     * @param request the request parameters of DescribeCloudVendorProductTemplateConfig  DescribeCloudVendorProductTemplateConfigRequest
     * @return DescribeCloudVendorProductTemplateConfigResponse
     */
    CompletableFuture<DescribeCloudVendorProductTemplateConfigResponse> describeCloudVendorProductTemplateConfig(DescribeCloudVendorProductTemplateConfigRequest request);

    /**
     * @param request the request parameters of DescribeCloudVendorTrialConfig  DescribeCloudVendorTrialConfigRequest
     * @return DescribeCloudVendorTrialConfigResponse
     */
    CompletableFuture<DescribeCloudVendorTrialConfigResponse> describeCloudVendorTrialConfig(DescribeCloudVendorTrialConfigRequest request);

    /**
     * @param request the request parameters of DescribeClusterBasicInfo  DescribeClusterBasicInfoRequest
     * @return DescribeClusterBasicInfoResponse
     */
    CompletableFuture<DescribeClusterBasicInfoResponse> describeClusterBasicInfo(DescribeClusterBasicInfoRequest request);

    /**
     * @param request the request parameters of DescribeClusterHostSecuritySummary  DescribeClusterHostSecuritySummaryRequest
     * @return DescribeClusterHostSecuritySummaryResponse
     */
    CompletableFuture<DescribeClusterHostSecuritySummaryResponse> describeClusterHostSecuritySummary(DescribeClusterHostSecuritySummaryRequest request);

    /**
     * @param request the request parameters of DescribeClusterImageSecuritySummary  DescribeClusterImageSecuritySummaryRequest
     * @return DescribeClusterImageSecuritySummaryResponse
     */
    CompletableFuture<DescribeClusterImageSecuritySummaryResponse> describeClusterImageSecuritySummary(DescribeClusterImageSecuritySummaryRequest request);

    /**
     * @param request the request parameters of DescribeClusterInfoList  DescribeClusterInfoListRequest
     * @return DescribeClusterInfoListResponse
     */
    CompletableFuture<DescribeClusterInfoListResponse> describeClusterInfoList(DescribeClusterInfoListRequest request);

    /**
     * @param request the request parameters of DescribeClusterNetwork  DescribeClusterNetworkRequest
     * @return DescribeClusterNetworkResponse
     */
    CompletableFuture<DescribeClusterNetworkResponse> describeClusterNetwork(DescribeClusterNetworkRequest request);

    /**
     * @param request the request parameters of DescribeClusterScannerList  DescribeClusterScannerListRequest
     * @return DescribeClusterScannerListResponse
     */
    CompletableFuture<DescribeClusterScannerListResponse> describeClusterScannerList(DescribeClusterScannerListRequest request);

    /**
     * @param request the request parameters of DescribeClusterVulStatistics  DescribeClusterVulStatisticsRequest
     * @return DescribeClusterVulStatisticsResponse
     */
    CompletableFuture<DescribeClusterVulStatisticsResponse> describeClusterVulStatistics(DescribeClusterVulStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeCommonOverallConfig  DescribeCommonOverallConfigRequest
     * @return DescribeCommonOverallConfigResponse
     */
    CompletableFuture<DescribeCommonOverallConfigResponse> describeCommonOverallConfig(DescribeCommonOverallConfigRequest request);

    /**
     * @param request the request parameters of DescribeCommonOverallConfigList  DescribeCommonOverallConfigListRequest
     * @return DescribeCommonOverallConfigListResponse
     */
    CompletableFuture<DescribeCommonOverallConfigListResponse> describeCommonOverallConfigList(DescribeCommonOverallConfigListRequest request);

    /**
     * @param request the request parameters of DescribeCommonTargetConfig  DescribeCommonTargetConfigRequest
     * @return DescribeCommonTargetConfigResponse
     */
    CompletableFuture<DescribeCommonTargetConfigResponse> describeCommonTargetConfig(DescribeCommonTargetConfigRequest request);

    /**
     * @param request the request parameters of DescribeCommonTargetResultList  DescribeCommonTargetResultListRequest
     * @return DescribeCommonTargetResultListResponse
     */
    CompletableFuture<DescribeCommonTargetResultListResponse> describeCommonTargetResultList(DescribeCommonTargetResultListRequest request);

    /**
     * @param request the request parameters of DescribeConcernNecessity  DescribeConcernNecessityRequest
     * @return DescribeConcernNecessityResponse
     */
    CompletableFuture<DescribeConcernNecessityResponse> describeConcernNecessity(DescribeConcernNecessityRequest request);

    /**
     * @param request the request parameters of DescribeContainerApps  DescribeContainerAppsRequest
     * @return DescribeContainerAppsResponse
     */
    CompletableFuture<DescribeContainerAppsResponse> describeContainerApps(DescribeContainerAppsRequest request);

    /**
     * @param request the request parameters of DescribeContainerCriteria  DescribeContainerCriteriaRequest
     * @return DescribeContainerCriteriaResponse
     */
    CompletableFuture<DescribeContainerCriteriaResponse> describeContainerCriteria(DescribeContainerCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeContainerFieldStatistics  DescribeContainerFieldStatisticsRequest
     * @return DescribeContainerFieldStatisticsResponse
     */
    CompletableFuture<DescribeContainerFieldStatisticsResponse> describeContainerFieldStatistics(DescribeContainerFieldStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeContainerGroupedFieldDetail  DescribeContainerGroupedFieldDetailRequest
     * @return DescribeContainerGroupedFieldDetailResponse
     */
    CompletableFuture<DescribeContainerGroupedFieldDetailResponse> describeContainerGroupedFieldDetail(DescribeContainerGroupedFieldDetailRequest request);

    /**
     * @param request the request parameters of DescribeContainerInstances  DescribeContainerInstancesRequest
     * @return DescribeContainerInstancesResponse
     */
    CompletableFuture<DescribeContainerInstancesResponse> describeContainerInstances(DescribeContainerInstancesRequest request);

    /**
     * @param request the request parameters of DescribeContainerScanConfig  DescribeContainerScanConfigRequest
     * @return DescribeContainerScanConfigResponse
     */
    CompletableFuture<DescribeContainerScanConfigResponse> describeContainerScanConfig(DescribeContainerScanConfigRequest request);

    /**
     * @param request the request parameters of DescribeContainerServiceK8sClusterKritisStatus  DescribeContainerServiceK8sClusterKritisStatusRequest
     * @return DescribeContainerServiceK8sClusterKritisStatusResponse
     */
    CompletableFuture<DescribeContainerServiceK8sClusterKritisStatusResponse> describeContainerServiceK8sClusterKritisStatus(DescribeContainerServiceK8sClusterKritisStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to query the namespaces of a Container Service for Kubernetes (ACK) cluster, make sure that the following prerequisites are met: An ACK cluster exists within the current account. How to obtain the ClusterId: View the cluster ID in the Container Service console, or call the DescribeClustersV1 operation of Container Service to obtain the ID of the ACK managed cluster.</p>
     * 
     * @param request the request parameters of DescribeContainerServiceK8sClusterNamespaces  DescribeContainerServiceK8sClusterNamespacesRequest
     * @return DescribeContainerServiceK8sClusterNamespacesResponse
     */
    CompletableFuture<DescribeContainerServiceK8sClusterNamespacesResponse> describeContainerServiceK8sClusterNamespaces(DescribeContainerServiceK8sClusterNamespacesRequest request);

    /**
     * @param request the request parameters of DescribeContainerServiceK8sClusters  DescribeContainerServiceK8sClustersRequest
     * @return DescribeContainerServiceK8sClustersResponse
     */
    CompletableFuture<DescribeContainerServiceK8sClustersResponse> describeContainerServiceK8sClusters(DescribeContainerServiceK8sClustersRequest request);

    /**
     * <b>description</b> :
     * <p>Only users who have purchased Container Registry Enterprise instances can invoke this operation.</p>
     * 
     * @param request the request parameters of DescribeContainerStatistics  DescribeContainerStatisticsRequest
     * @return DescribeContainerStatisticsResponse
     */
    CompletableFuture<DescribeContainerStatisticsResponse> describeContainerStatistics(DescribeContainerStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeContainerTags  DescribeContainerTagsRequest
     * @return DescribeContainerTagsResponse
     */
    CompletableFuture<DescribeContainerTagsResponse> describeContainerTags(DescribeContainerTagsRequest request);

    /**
     * @param request the request parameters of DescribeCountNotScannedImage  DescribeCountNotScannedImageRequest
     * @return DescribeCountNotScannedImageResponse
     */
    CompletableFuture<DescribeCountNotScannedImageResponse> describeCountNotScannedImage(DescribeCountNotScannedImageRequest request);

    /**
     * @param request the request parameters of DescribeCountScannedImage  DescribeCountScannedImageRequest
     * @return DescribeCountScannedImageResponse
     */
    CompletableFuture<DescribeCountScannedImageResponse> describeCountScannedImage(DescribeCountScannedImageRequest request);

    /**
     * @param request the request parameters of DescribeCriteria  DescribeCriteriaRequest
     * @return DescribeCriteriaResponse
     */
    CompletableFuture<DescribeCriteriaResponse> describeCriteria(DescribeCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeCustomBlockInstances  DescribeCustomBlockInstancesRequest
     * @return DescribeCustomBlockInstancesResponse
     */
    CompletableFuture<DescribeCustomBlockInstancesResponse> describeCustomBlockInstances(DescribeCustomBlockInstancesRequest request);

    /**
     * @param request the request parameters of DescribeCustomBlockRecords  DescribeCustomBlockRecordsRequest
     * @return DescribeCustomBlockRecordsResponse
     */
    CompletableFuture<DescribeCustomBlockRecordsResponse> describeCustomBlockRecords(DescribeCustomBlockRecordsRequest request);

    /**
     * @param request the request parameters of DescribeCustomizeReportConfigDetail  DescribeCustomizeReportConfigDetailRequest
     * @return DescribeCustomizeReportConfigDetailResponse
     */
    CompletableFuture<DescribeCustomizeReportConfigDetailResponse> describeCustomizeReportConfigDetail(DescribeCustomizeReportConfigDetailRequest request);

    /**
     * @param request the request parameters of DescribeCustomizeReportList  DescribeCustomizeReportListRequest
     * @return DescribeCustomizeReportListResponse
     */
    CompletableFuture<DescribeCustomizeReportListResponse> describeCustomizeReportList(DescribeCustomizeReportListRequest request);

    /**
     * @param request the request parameters of DescribeCustomizedDict  DescribeCustomizedDictRequest
     * @return DescribeCustomizedDictResponse
     */
    CompletableFuture<DescribeCustomizedDictResponse> describeCustomizedDict(DescribeCustomizedDictRequest request);

    /**
     * @param request the request parameters of DescribeCustomizedDictUploadInfo  DescribeCustomizedDictUploadInfoRequest
     * @return DescribeCustomizedDictUploadInfoResponse
     */
    CompletableFuture<DescribeCustomizedDictUploadInfoResponse> describeCustomizedDictUploadInfo(DescribeCustomizedDictUploadInfoRequest request);

    /**
     * @param request the request parameters of DescribeCustomizedStrategyTargets  DescribeCustomizedStrategyTargetsRequest
     * @return DescribeCustomizedStrategyTargetsResponse
     */
    CompletableFuture<DescribeCustomizedStrategyTargetsResponse> describeCustomizedStrategyTargets(DescribeCustomizedStrategyTargetsRequest request);

    /**
     * @param request the request parameters of DescribeCycleTaskList  DescribeCycleTaskListRequest
     * @return DescribeCycleTaskListResponse
     */
    CompletableFuture<DescribeCycleTaskListResponse> describeCycleTaskList(DescribeCycleTaskListRequest request);

    /**
     * @param request the request parameters of DescribeDataSource  DescribeDataSourceRequest
     * @return DescribeDataSourceResponse
     */
    CompletableFuture<DescribeDataSourceResponse> describeDataSource(DescribeDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeDefaultKeyInfo  DescribeDefaultKeyInfoRequest
     * @return DescribeDefaultKeyInfoResponse
     */
    CompletableFuture<DescribeDefaultKeyInfoResponse> describeDefaultKeyInfo(DescribeDefaultKeyInfoRequest request);

    /**
     * @param request the request parameters of DescribeDefaultProxyInstallVersion  DescribeDefaultProxyInstallVersionRequest
     * @return DescribeDefaultProxyInstallVersionResponse
     */
    CompletableFuture<DescribeDefaultProxyInstallVersionResponse> describeDefaultProxyInstallVersion(DescribeDefaultProxyInstallVersionRequest request);

    /**
     * @param request the request parameters of DescribeDingTalk  DescribeDingTalkRequest
     * @return DescribeDingTalkResponse
     */
    CompletableFuture<DescribeDingTalkResponse> describeDingTalk(DescribeDingTalkRequest request);

    /**
     * @param request the request parameters of DescribeDomainCount  DescribeDomainCountRequest
     * @return DescribeDomainCountResponse
     */
    CompletableFuture<DescribeDomainCountResponse> describeDomainCount(DescribeDomainCountRequest request);

    /**
     * @param request the request parameters of DescribeDomainDetail  DescribeDomainDetailRequest
     * @return DescribeDomainDetailResponse
     */
    CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeDomainList  DescribeDomainListRequest
     * @return DescribeDomainListResponse
     */
    CompletableFuture<DescribeDomainListResponse> describeDomainList(DescribeDomainListRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureAlarmList  DescribeDomainSecureAlarmListRequest
     * @return DescribeDomainSecureAlarmListResponse
     */
    CompletableFuture<DescribeDomainSecureAlarmListResponse> describeDomainSecureAlarmList(DescribeDomainSecureAlarmListRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureRiskList  DescribeDomainSecureRiskListRequest
     * @return DescribeDomainSecureRiskListResponse
     */
    CompletableFuture<DescribeDomainSecureRiskListResponse> describeDomainSecureRiskList(DescribeDomainSecureRiskListRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureScore  DescribeDomainSecureScoreRequest
     * @return DescribeDomainSecureScoreResponse
     */
    CompletableFuture<DescribeDomainSecureScoreResponse> describeDomainSecureScore(DescribeDomainSecureScoreRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureStatistics  DescribeDomainSecureStatisticsRequest
     * @return DescribeDomainSecureStatisticsResponse
     */
    CompletableFuture<DescribeDomainSecureStatisticsResponse> describeDomainSecureStatistics(DescribeDomainSecureStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureSuggests  DescribeDomainSecureSuggestsRequest
     * @return DescribeDomainSecureSuggestsResponse
     */
    CompletableFuture<DescribeDomainSecureSuggestsResponse> describeDomainSecureSuggests(DescribeDomainSecureSuggestsRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecureVulList  DescribeDomainSecureVulListRequest
     * @return DescribeDomainSecureVulListResponse
     */
    CompletableFuture<DescribeDomainSecureVulListResponse> describeDomainSecureVulList(DescribeDomainSecureVulListRequest request);

    /**
     * @deprecated OpenAPI DescribeDynamicDict is deprecated, please use Sas::2018-12-03::DescribeCustomizedDict instead.  * @param request  the request parameters of DescribeDynamicDict  DescribeDynamicDictRequest
     * @return DescribeDynamicDictResponse
     */
    @Deprecated
    CompletableFuture<DescribeDynamicDictResponse> describeDynamicDict(DescribeDynamicDictRequest request);

    /**
     * @deprecated OpenAPI DescribeDynamicDictUploadInfo is deprecated, please use Sas::2018-12-03::DescribeCustomizedDictUploadInfo instead.  * @param request  the request parameters of DescribeDynamicDictUploadInfo  DescribeDynamicDictUploadInfoRequest
     * @return DescribeDynamicDictUploadInfoResponse
     */
    @Deprecated
    CompletableFuture<DescribeDynamicDictUploadInfoResponse> describeDynamicDictUploadInfo(DescribeDynamicDictUploadInfoRequest request);

    /**
     * @param request the request parameters of DescribeEmgUserAgreement  DescribeEmgUserAgreementRequest
     * @return DescribeEmgUserAgreementResponse
     */
    CompletableFuture<DescribeEmgUserAgreementResponse> describeEmgUserAgreement(DescribeEmgUserAgreementRequest request);

    /**
     * @param request the request parameters of DescribeEmgVulItem  DescribeEmgVulItemRequest
     * @return DescribeEmgVulItemResponse
     */
    CompletableFuture<DescribeEmgVulItemResponse> describeEmgVulItem(DescribeEmgVulItemRequest request);

    /**
     * @param request the request parameters of DescribeEventLevelCount  DescribeEventLevelCountRequest
     * @return DescribeEventLevelCountResponse
     */
    CompletableFuture<DescribeEventLevelCountResponse> describeEventLevelCount(DescribeEventLevelCountRequest request);

    /**
     * @param request the request parameters of DescribeEventOnStage  DescribeEventOnStageRequest
     * @return DescribeEventOnStageResponse
     */
    CompletableFuture<DescribeEventOnStageResponse> describeEventOnStage(DescribeEventOnStageRequest request);

    /**
     * @param request the request parameters of DescribeExcludeSystemPath  DescribeExcludeSystemPathRequest
     * @return DescribeExcludeSystemPathResponse
     */
    CompletableFuture<DescribeExcludeSystemPathResponse> describeExcludeSystemPath(DescribeExcludeSystemPathRequest request);

    /**
     * @param request the request parameters of DescribeExportInfo  DescribeExportInfoRequest
     * @return DescribeExportInfoResponse
     */
    CompletableFuture<DescribeExportInfoResponse> describeExportInfo(DescribeExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeExposedCheckWarning  DescribeExposedCheckWarningRequest
     * @return DescribeExposedCheckWarningResponse
     */
    CompletableFuture<DescribeExposedCheckWarningResponse> describeExposedCheckWarning(DescribeExposedCheckWarningRequest request);

    /**
     * @param request the request parameters of DescribeExposedInstanceCriteria  DescribeExposedInstanceCriteriaRequest
     * @return DescribeExposedInstanceCriteriaResponse
     */
    CompletableFuture<DescribeExposedInstanceCriteriaResponse> describeExposedInstanceCriteria(DescribeExposedInstanceCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeExposedInstanceDetail  DescribeExposedInstanceDetailRequest
     * @return DescribeExposedInstanceDetailResponse
     */
    CompletableFuture<DescribeExposedInstanceDetailResponse> describeExposedInstanceDetail(DescribeExposedInstanceDetailRequest request);

    /**
     * @param request the request parameters of DescribeExposedInstanceList  DescribeExposedInstanceListRequest
     * @return DescribeExposedInstanceListResponse
     */
    CompletableFuture<DescribeExposedInstanceListResponse> describeExposedInstanceList(DescribeExposedInstanceListRequest request);

    /**
     * @param request the request parameters of DescribeExposedStatistics  DescribeExposedStatisticsRequest
     * @return DescribeExposedStatisticsResponse
     */
    CompletableFuture<DescribeExposedStatisticsResponse> describeExposedStatistics(DescribeExposedStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeExposedStatisticsDetail  DescribeExposedStatisticsDetailRequest
     * @return DescribeExposedStatisticsDetailResponse
     */
    CompletableFuture<DescribeExposedStatisticsDetailResponse> describeExposedStatisticsDetail(DescribeExposedStatisticsDetailRequest request);

    /**
     * @param request the request parameters of DescribeFieldStatistics  DescribeFieldStatisticsRequest
     * @return DescribeFieldStatisticsResponse
     */
    CompletableFuture<DescribeFieldStatisticsResponse> describeFieldStatistics(DescribeFieldStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeFixUsedCount  DescribeFixUsedCountRequest
     * @return DescribeFixUsedCountResponse
     */
    CompletableFuture<DescribeFixUsedCountResponse> describeFixUsedCount(DescribeFixUsedCountRequest request);

    /**
     * @param request the request parameters of DescribeFrontVulPatchList  DescribeFrontVulPatchListRequest
     * @return DescribeFrontVulPatchListResponse
     */
    CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request);

    /**
     * @param request the request parameters of DescribeGraph4InvestigationOnline  DescribeGraph4InvestigationOnlineRequest
     * @return DescribeGraph4InvestigationOnlineResponse
     */
    CompletableFuture<DescribeGraph4InvestigationOnlineResponse> describeGraph4InvestigationOnline(DescribeGraph4InvestigationOnlineRequest request);

    /**
     * @param request the request parameters of DescribeGroupStruct  DescribeGroupStructRequest
     * @return DescribeGroupStructResponse
     */
    CompletableFuture<DescribeGroupStructResponse> describeGroupStruct(DescribeGroupStructRequest request);

    /**
     * @param request the request parameters of DescribeGroupedContainerInstances  DescribeGroupedContainerInstancesRequest
     * @return DescribeGroupedContainerInstancesResponse
     */
    CompletableFuture<DescribeGroupedContainerInstancesResponse> describeGroupedContainerInstances(DescribeGroupedContainerInstancesRequest request);

    /**
     * @param request the request parameters of DescribeGroupedInstances  DescribeGroupedInstancesRequest
     * @return DescribeGroupedInstancesResponse
     */
    CompletableFuture<DescribeGroupedInstancesResponse> describeGroupedInstances(DescribeGroupedInstancesRequest request);

    /**
     * @param request the request parameters of DescribeGroupedMaliciousFiles  DescribeGroupedMaliciousFilesRequest
     * @return DescribeGroupedMaliciousFilesResponse
     */
    CompletableFuture<DescribeGroupedMaliciousFilesResponse> describeGroupedMaliciousFiles(DescribeGroupedMaliciousFilesRequest request);

    /**
     * @param request the request parameters of DescribeGroupedTags  DescribeGroupedTagsRequest
     * @return DescribeGroupedTagsResponse
     */
    CompletableFuture<DescribeGroupedTagsResponse> describeGroupedTags(DescribeGroupedTagsRequest request);

    /**
     * @param request the request parameters of DescribeGroupedVul  DescribeGroupedVulRequest
     * @return DescribeGroupedVulResponse
     */
    CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request);

    /**
     * @param request the request parameters of DescribeHcExportInfo  DescribeHcExportInfoRequest
     * @return DescribeHcExportInfoResponse
     */
    CompletableFuture<DescribeHcExportInfoResponse> describeHcExportInfo(DescribeHcExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeHoneyPotAuth  DescribeHoneyPotAuthRequest
     * @return DescribeHoneyPotAuthResponse
     */
    CompletableFuture<DescribeHoneyPotAuthResponse> describeHoneyPotAuth(DescribeHoneyPotAuthRequest request);

    /**
     * @param request the request parameters of DescribeHoneyPotSuspStatistics  DescribeHoneyPotSuspStatisticsRequest
     * @return DescribeHoneyPotSuspStatisticsResponse
     */
    CompletableFuture<DescribeHoneyPotSuspStatisticsResponse> describeHoneyPotSuspStatistics(DescribeHoneyPotSuspStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeHybridProxyClusterList  DescribeHybridProxyClusterListRequest
     * @return DescribeHybridProxyClusterListResponse
     */
    CompletableFuture<DescribeHybridProxyClusterListResponse> describeHybridProxyClusterList(DescribeHybridProxyClusterListRequest request);

    /**
     * @param request the request parameters of DescribeHybridProxyLinkedClientList  DescribeHybridProxyLinkedClientListRequest
     * @return DescribeHybridProxyLinkedClientListResponse
     */
    CompletableFuture<DescribeHybridProxyLinkedClientListResponse> describeHybridProxyLinkedClientList(DescribeHybridProxyLinkedClientListRequest request);

    /**
     * @param request the request parameters of DescribeHybridProxyList  DescribeHybridProxyListRequest
     * @return DescribeHybridProxyListResponse
     */
    CompletableFuture<DescribeHybridProxyListResponse> describeHybridProxyList(DescribeHybridProxyListRequest request);

    /**
     * @param request the request parameters of DescribeHybridProxyPolicy  DescribeHybridProxyPolicyRequest
     * @return DescribeHybridProxyPolicyResponse
     */
    CompletableFuture<DescribeHybridProxyPolicyResponse> describeHybridProxyPolicy(DescribeHybridProxyPolicyRequest request);

    /**
     * @param request the request parameters of DescribeIdcAssetCriteria  DescribeIdcAssetCriteriaRequest
     * @return DescribeIdcAssetCriteriaResponse
     */
    CompletableFuture<DescribeIdcAssetCriteriaResponse> describeIdcAssetCriteria(DescribeIdcAssetCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeIdcProbeList  DescribeIdcProbeListRequest
     * @return DescribeIdcProbeListResponse
     */
    CompletableFuture<DescribeIdcProbeListResponse> describeIdcProbeList(DescribeIdcProbeListRequest request);

    /**
     * @param request the request parameters of DescribeIdcProbeScanResultList  DescribeIdcProbeScanResultListRequest
     * @return DescribeIdcProbeScanResultListResponse
     */
    CompletableFuture<DescribeIdcProbeScanResultListResponse> describeIdcProbeScanResultList(DescribeIdcProbeScanResultListRequest request);

    /**
     * @param request the request parameters of DescribeImage  DescribeImageRequest
     * @return DescribeImageResponse
     */
    CompletableFuture<DescribeImageResponse> describeImage(DescribeImageRequest request);

    /**
     * @param request the request parameters of DescribeImageBaselineCheckResult  DescribeImageBaselineCheckResultRequest
     * @return DescribeImageBaselineCheckResultResponse
     */
    CompletableFuture<DescribeImageBaselineCheckResultResponse> describeImageBaselineCheckResult(DescribeImageBaselineCheckResultRequest request);

    /**
     * @param request the request parameters of DescribeImageBaselineCheckSummary  DescribeImageBaselineCheckSummaryRequest
     * @return DescribeImageBaselineCheckSummaryResponse
     */
    CompletableFuture<DescribeImageBaselineCheckSummaryResponse> describeImageBaselineCheckSummary(DescribeImageBaselineCheckSummaryRequest request);

    /**
     * @param request the request parameters of DescribeImageBaselineDetail  DescribeImageBaselineDetailRequest
     * @return DescribeImageBaselineDetailResponse
     */
    CompletableFuture<DescribeImageBaselineDetailResponse> describeImageBaselineDetail(DescribeImageBaselineDetailRequest request);

    /**
     * @param request the request parameters of DescribeImageBaselineItemList  DescribeImageBaselineItemListRequest
     * @return DescribeImageBaselineItemListResponse
     */
    CompletableFuture<DescribeImageBaselineItemListResponse> describeImageBaselineItemList(DescribeImageBaselineItemListRequest request);

    /**
     * @param request the request parameters of DescribeImageBaselineStrategy  DescribeImageBaselineStrategyRequest
     * @return DescribeImageBaselineStrategyResponse
     */
    CompletableFuture<DescribeImageBaselineStrategyResponse> describeImageBaselineStrategy(DescribeImageBaselineStrategyRequest request);

    /**
     * @param request the request parameters of DescribeImageBuildRiskByKey  DescribeImageBuildRiskByKeyRequest
     * @return DescribeImageBuildRiskByKeyResponse
     */
    CompletableFuture<DescribeImageBuildRiskByKeyResponse> describeImageBuildRiskByKey(DescribeImageBuildRiskByKeyRequest request);

    /**
     * @param request the request parameters of DescribeImageBuildRiskList  DescribeImageBuildRiskListRequest
     * @return DescribeImageBuildRiskListResponse
     */
    CompletableFuture<DescribeImageBuildRiskListResponse> describeImageBuildRiskList(DescribeImageBuildRiskListRequest request);

    /**
     * @param request the request parameters of DescribeImageCriteria  DescribeImageCriteriaRequest
     * @return DescribeImageCriteriaResponse
     */
    CompletableFuture<DescribeImageCriteriaResponse> describeImageCriteria(DescribeImageCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeImageEventOperationCondition  DescribeImageEventOperationConditionRequest
     * @return DescribeImageEventOperationConditionResponse
     */
    CompletableFuture<DescribeImageEventOperationConditionResponse> describeImageEventOperationCondition(DescribeImageEventOperationConditionRequest request);

    /**
     * @param request the request parameters of DescribeImageEventOperationPage  DescribeImageEventOperationPageRequest
     * @return DescribeImageEventOperationPageResponse
     */
    CompletableFuture<DescribeImageEventOperationPageResponse> describeImageEventOperationPage(DescribeImageEventOperationPageRequest request);

    /**
     * @param request the request parameters of DescribeImageFixCycleConfig  DescribeImageFixCycleConfigRequest
     * @return DescribeImageFixCycleConfigResponse
     */
    CompletableFuture<DescribeImageFixCycleConfigResponse> describeImageFixCycleConfig(DescribeImageFixCycleConfigRequest request);

    /**
     * @param request the request parameters of DescribeImageFixTask  DescribeImageFixTaskRequest
     * @return DescribeImageFixTaskResponse
     */
    CompletableFuture<DescribeImageFixTaskResponse> describeImageFixTask(DescribeImageFixTaskRequest request);

    /**
     * @param request the request parameters of DescribeImageGroupedVulList  DescribeImageGroupedVulListRequest
     * @return DescribeImageGroupedVulListResponse
     */
    CompletableFuture<DescribeImageGroupedVulListResponse> describeImageGroupedVulList(DescribeImageGroupedVulListRequest request);

    /**
     * @param request the request parameters of DescribeImageInfoList  DescribeImageInfoListRequest
     * @return DescribeImageInfoListResponse
     */
    CompletableFuture<DescribeImageInfoListResponse> describeImageInfoList(DescribeImageInfoListRequest request);

    /**
     * @param request the request parameters of DescribeImageInstances  DescribeImageInstancesRequest
     * @return DescribeImageInstancesResponse
     */
    CompletableFuture<DescribeImageInstancesResponse> describeImageInstances(DescribeImageInstancesRequest request);

    /**
     * @param request the request parameters of DescribeImageLatestScanTask  DescribeImageLatestScanTaskRequest
     * @return DescribeImageLatestScanTaskResponse
     */
    CompletableFuture<DescribeImageLatestScanTaskResponse> describeImageLatestScanTask(DescribeImageLatestScanTaskRequest request);

    /**
     * @param request the request parameters of DescribeImageListByBuildRisk  DescribeImageListByBuildRiskRequest
     * @return DescribeImageListByBuildRiskResponse
     */
    CompletableFuture<DescribeImageListByBuildRiskResponse> describeImageListByBuildRisk(DescribeImageListByBuildRiskRequest request);

    /**
     * @param request the request parameters of DescribeImageListBySensitiveFile  DescribeImageListBySensitiveFileRequest
     * @return DescribeImageListBySensitiveFileResponse
     */
    CompletableFuture<DescribeImageListBySensitiveFileResponse> describeImageListBySensitiveFile(DescribeImageListBySensitiveFileRequest request);

    /**
     * @param request the request parameters of DescribeImageListWithBaselineName  DescribeImageListWithBaselineNameRequest
     * @return DescribeImageListWithBaselineNameResponse
     */
    CompletableFuture<DescribeImageListWithBaselineNameResponse> describeImageListWithBaselineName(DescribeImageListWithBaselineNameRequest request);

    /**
     * @param request the request parameters of DescribeImageRepoCriteria  DescribeImageRepoCriteriaRequest
     * @return DescribeImageRepoCriteriaResponse
     */
    CompletableFuture<DescribeImageRepoCriteriaResponse> describeImageRepoCriteria(DescribeImageRepoCriteriaRequest request);

    /**
     * @param request the request parameters of DescribeImageRepoDetailList  DescribeImageRepoDetailListRequest
     * @return DescribeImageRepoDetailListResponse
     */
    CompletableFuture<DescribeImageRepoDetailListResponse> describeImageRepoDetailList(DescribeImageRepoDetailListRequest request);

    /**
     * @param request the request parameters of DescribeImageRepoList  DescribeImageRepoListRequest
     * @return DescribeImageRepoListResponse
     */
    CompletableFuture<DescribeImageRepoListResponse> describeImageRepoList(DescribeImageRepoListRequest request);

    /**
     * @param request the request parameters of DescribeImageRiskLevelStatistic  DescribeImageRiskLevelStatisticRequest
     * @return DescribeImageRiskLevelStatisticResponse
     */
    CompletableFuture<DescribeImageRiskLevelStatisticResponse> describeImageRiskLevelStatistic(DescribeImageRiskLevelStatisticRequest request);

    /**
     * @param request the request parameters of DescribeImageScanAuthCount  DescribeImageScanAuthCountRequest
     * @return DescribeImageScanAuthCountResponse
     */
    CompletableFuture<DescribeImageScanAuthCountResponse> describeImageScanAuthCount(DescribeImageScanAuthCountRequest request);

    /**
     * @param request the request parameters of DescribeImageSecurityScanCount  DescribeImageSecurityScanCountRequest
     * @return DescribeImageSecurityScanCountResponse
     */
    CompletableFuture<DescribeImageSecurityScanCountResponse> describeImageSecurityScanCount(DescribeImageSecurityScanCountRequest request);

    /**
     * @param request the request parameters of DescribeImageSensitiveFileByKey  DescribeImageSensitiveFileByKeyRequest
     * @return DescribeImageSensitiveFileByKeyResponse
     */
    CompletableFuture<DescribeImageSensitiveFileByKeyResponse> describeImageSensitiveFileByKey(DescribeImageSensitiveFileByKeyRequest request);

    /**
     * @param request the request parameters of DescribeImageSensitiveFileList  DescribeImageSensitiveFileListRequest
     * @return DescribeImageSensitiveFileListResponse
     */
    CompletableFuture<DescribeImageSensitiveFileListResponse> describeImageSensitiveFileList(DescribeImageSensitiveFileListRequest request);

    /**
     * <b>description</b> :
     * <p>Security Center supports scanning container images only in <strong>Enterprise instances</strong> of Container Registry for security risks and provides statistics.</p>
     * <blockquote>
     * <p>Security Center does not support scanning container images in <strong>default instances</strong> of Container Registry for security risks and does not provide statistics for <strong>default instances</strong>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeImageStatistics  DescribeImageStatisticsRequest
     * @return DescribeImageStatisticsResponse
     */
    CompletableFuture<DescribeImageStatisticsResponse> describeImageStatistics(DescribeImageStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>To view the latest container image vulnerability information, call the <a href="~~PublicCreateImageScanTask~~">PublicCreateImageScanTask</a> operation to create an image scan task first. Wait 1 to 5 minutes, and then call this operation to query the container image vulnerability list.</p>
     * 
     * @param request the request parameters of DescribeImageVulList  DescribeImageVulListRequest
     * @return DescribeImageVulListResponse
     */
    CompletableFuture<DescribeImageVulListResponse> describeImageVulList(DescribeImageVulListRequest request);

    /**
     * @param request the request parameters of DescribeImageVulWhiteList  DescribeImageVulWhiteListRequest
     * @return DescribeImageVulWhiteListResponse
     */
    CompletableFuture<DescribeImageVulWhiteListResponse> describeImageVulWhiteList(DescribeImageVulWhiteListRequest request);

    /**
     * @param request the request parameters of DescribeInstallCaptcha  DescribeInstallCaptchaRequest
     * @return DescribeInstallCaptchaResponse
     */
    CompletableFuture<DescribeInstallCaptchaResponse> describeInstallCaptcha(DescribeInstallCaptchaRequest request);

    /**
     * @param request the request parameters of DescribeInstallCode  DescribeInstallCodeRequest
     * @return DescribeInstallCodeResponse
     */
    CompletableFuture<DescribeInstallCodeResponse> describeInstallCode(DescribeInstallCodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the commands for manually installing the Security Center agent on servers. The query results include installation verification codes and server-related information. If you need to manually install the Security Center agent on a server, call this operation to obtain the manual installation commands.</p>
     * <h3>Rate limit</h3>
     * <p>The single-user queries per second (QPS) limit for this operation is 10. If the number of calls exceeds the limit, throttling is triggered, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribeInstallCodes  DescribeInstallCodesRequest
     * @return DescribeInstallCodesResponse
     */
    CompletableFuture<DescribeInstallCodesResponse> describeInstallCodes(DescribeInstallCodesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAntiBruteForceRules  DescribeInstanceAntiBruteForceRulesRequest
     * @return DescribeInstanceAntiBruteForceRulesResponse
     */
    CompletableFuture<DescribeInstanceAntiBruteForceRulesResponse> describeInstanceAntiBruteForceRules(DescribeInstanceAntiBruteForceRulesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRebootStatus  DescribeInstanceRebootStatusRequest
     * @return DescribeInstanceRebootStatusResponse
     */
    CompletableFuture<DescribeInstanceRebootStatusResponse> describeInstanceRebootStatus(DescribeInstanceRebootStatusRequest request);

    /**
     * @param request the request parameters of DescribeInstanceStatistics  DescribeInstanceStatisticsRequest
     * @return DescribeInstanceStatisticsResponse
     */
    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceVulStatistics  DescribeInstanceVulStatisticsRequest
     * @return DescribeInstanceVulStatisticsResponse
     */
    CompletableFuture<DescribeInstanceVulStatisticsResponse> describeInstanceVulStatistics(DescribeInstanceVulStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeLatestScanTask  DescribeLatestScanTaskRequest
     * @return DescribeLatestScanTaskResponse
     */
    CompletableFuture<DescribeLatestScanTaskResponse> describeLatestScanTask(DescribeLatestScanTaskRequest request);

    /**
     * @param request the request parameters of DescribeLogMeta  DescribeLogMetaRequest
     * @return DescribeLogMetaResponse
     */
    CompletableFuture<DescribeLogMetaResponse> describeLogMeta(DescribeLogMetaRequest request);

    /**
     * @param request the request parameters of DescribeLogShipperStatus  DescribeLogShipperStatusRequest
     * @return DescribeLogShipperStatusResponse
     */
    CompletableFuture<DescribeLogShipperStatusResponse> describeLogShipperStatus(DescribeLogShipperStatusRequest request);

    /**
     * @param request the request parameters of DescribeLoginBaseConfigs  DescribeLoginBaseConfigsRequest
     * @return DescribeLoginBaseConfigsResponse
     */
    CompletableFuture<DescribeLoginBaseConfigsResponse> describeLoginBaseConfigs(DescribeLoginBaseConfigsRequest request);

    /**
     * @param request the request parameters of DescribeLoginSwitchConfigs  DescribeLoginSwitchConfigsRequest
     * @return DescribeLoginSwitchConfigsResponse
     */
    CompletableFuture<DescribeLoginSwitchConfigsResponse> describeLoginSwitchConfigs(DescribeLoginSwitchConfigsRequest request);

    /**
     * @param request the request parameters of DescribeLogstoreStorage  DescribeLogstoreStorageRequest
     * @return DescribeLogstoreStorageResponse
     */
    CompletableFuture<DescribeLogstoreStorageResponse> describeLogstoreStorage(DescribeLogstoreStorageRequest request);

    /**
     * @param request the request parameters of DescribeMachineCanReboot  DescribeMachineCanRebootRequest
     * @return DescribeMachineCanRebootResponse
     */
    CompletableFuture<DescribeMachineCanRebootResponse> describeMachineCanReboot(DescribeMachineCanRebootRequest request);

    /**
     * @param request the request parameters of DescribeMatchedMaliciousNames  DescribeMatchedMaliciousNamesRequest
     * @return DescribeMatchedMaliciousNamesResponse
     */
    CompletableFuture<DescribeMatchedMaliciousNamesResponse> describeMatchedMaliciousNames(DescribeMatchedMaliciousNamesRequest request);

    /**
     * @param request the request parameters of DescribeModuleConfig  DescribeModuleConfigRequest
     * @return DescribeModuleConfigResponse
     */
    CompletableFuture<DescribeModuleConfigResponse> describeModuleConfig(DescribeModuleConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be a resource directory management account or a Security Center delegated administrator account. Before invoking this operation, verify the role of the current account in the resource directory. Member accounts must be configured as delegated administrators by the management account before they can execute management operations.</p>
     * 
     * @param request the request parameters of DescribeMonitorAccounts  DescribeMonitorAccountsRequest
     * @return DescribeMonitorAccountsResponse
     */
    CompletableFuture<DescribeMonitorAccountsResponse> describeMonitorAccounts(DescribeMonitorAccountsRequest request);

    /**
     * @param request the request parameters of DescribeNeedAsyncQuery  DescribeNeedAsyncQueryRequest
     * @return DescribeNeedAsyncQueryResponse
     */
    CompletableFuture<DescribeNeedAsyncQueryResponse> describeNeedAsyncQuery(DescribeNeedAsyncQueryRequest request);

    /**
     * @param request the request parameters of DescribeNoticeConfig  DescribeNoticeConfigRequest
     * @return DescribeNoticeConfigResponse
     */
    CompletableFuture<DescribeNoticeConfigResponse> describeNoticeConfig(DescribeNoticeConfigRequest request);

    /**
     * @param request the request parameters of DescribeNsasSuspEventType  DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    CompletableFuture<DescribeNsasSuspEventTypeResponse> describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request);

    /**
     * @param request the request parameters of DescribeOfflineMachines  DescribeOfflineMachinesRequest
     * @return DescribeOfflineMachinesResponse
     */
    CompletableFuture<DescribeOfflineMachinesResponse> describeOfflineMachines(DescribeOfflineMachinesRequest request);

    /**
     * @param request the request parameters of DescribeOnceTask  DescribeOnceTaskRequest
     * @return DescribeOnceTaskResponse
     */
    CompletableFuture<DescribeOnceTaskResponse> describeOnceTask(DescribeOnceTaskRequest request);

    /**
     * @param request the request parameters of DescribeOnceTaskLeafRecordPage  DescribeOnceTaskLeafRecordPageRequest
     * @return DescribeOnceTaskLeafRecordPageResponse
     */
    CompletableFuture<DescribeOnceTaskLeafRecordPageResponse> describeOnceTaskLeafRecordPage(DescribeOnceTaskLeafRecordPageRequest request);

    /**
     * @param request the request parameters of DescribePluginSummary  DescribePluginSummaryRequest
     * @return DescribePluginSummaryResponse
     */
    CompletableFuture<DescribePluginSummaryResponse> describePluginSummary(DescribePluginSummaryRequest request);

    /**
     * @param request the request parameters of DescribePropertyCount  DescribePropertyCountRequest
     * @return DescribePropertyCountResponse
     */
    CompletableFuture<DescribePropertyCountResponse> describePropertyCount(DescribePropertyCountRequest request);

    /**
     * @param request the request parameters of DescribePropertyCronDetail  DescribePropertyCronDetailRequest
     * @return DescribePropertyCronDetailResponse
     */
    CompletableFuture<DescribePropertyCronDetailResponse> describePropertyCronDetail(DescribePropertyCronDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyCronItem  DescribePropertyCronItemRequest
     * @return DescribePropertyCronItemResponse
     */
    CompletableFuture<DescribePropertyCronItemResponse> describePropertyCronItem(DescribePropertyCronItemRequest request);

    /**
     * @param request the request parameters of DescribePropertyPortDetail  DescribePropertyPortDetailRequest
     * @return DescribePropertyPortDetailResponse
     */
    CompletableFuture<DescribePropertyPortDetailResponse> describePropertyPortDetail(DescribePropertyPortDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyPortItem  DescribePropertyPortItemRequest
     * @return DescribePropertyPortItemResponse
     */
    CompletableFuture<DescribePropertyPortItemResponse> describePropertyPortItem(DescribePropertyPortItemRequest request);

    /**
     * @param request the request parameters of DescribePropertyProcDetail  DescribePropertyProcDetailRequest
     * @return DescribePropertyProcDetailResponse
     */
    CompletableFuture<DescribePropertyProcDetailResponse> describePropertyProcDetail(DescribePropertyProcDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyProcItem  DescribePropertyProcItemRequest
     * @return DescribePropertyProcItemResponse
     */
    CompletableFuture<DescribePropertyProcItemResponse> describePropertyProcItem(DescribePropertyProcItemRequest request);

    /**
     * @param request the request parameters of DescribePropertyScaDetail  DescribePropertyScaDetailRequest
     * @return DescribePropertyScaDetailResponse
     */
    CompletableFuture<DescribePropertyScaDetailResponse> describePropertyScaDetail(DescribePropertyScaDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyScaItem  DescribePropertyScaItemRequest
     * @return DescribePropertyScaItemResponse
     */
    CompletableFuture<DescribePropertyScaItemResponse> describePropertyScaItem(DescribePropertyScaItemRequest request);

    /**
     * @param request the request parameters of DescribePropertyScaProcessDetail  DescribePropertyScaProcessDetailRequest
     * @return DescribePropertyScaProcessDetailResponse
     */
    CompletableFuture<DescribePropertyScaProcessDetailResponse> describePropertyScaProcessDetail(DescribePropertyScaProcessDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyScheduleConfig  DescribePropertyScheduleConfigRequest
     * @return DescribePropertyScheduleConfigResponse
     */
    CompletableFuture<DescribePropertyScheduleConfigResponse> describePropertyScheduleConfig(DescribePropertyScheduleConfigRequest request);

    /**
     * @param request the request parameters of DescribePropertySoftwareDetail  DescribePropertySoftwareDetailRequest
     * @return DescribePropertySoftwareDetailResponse
     */
    CompletableFuture<DescribePropertySoftwareDetailResponse> describePropertySoftwareDetail(DescribePropertySoftwareDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertySoftwareItem  DescribePropertySoftwareItemRequest
     * @return DescribePropertySoftwareItemResponse
     */
    CompletableFuture<DescribePropertySoftwareItemResponse> describePropertySoftwareItem(DescribePropertySoftwareItemRequest request);

    /**
     * @param request the request parameters of DescribePropertyTypeScaItem  DescribePropertyTypeScaItemRequest
     * @return DescribePropertyTypeScaItemResponse
     */
    CompletableFuture<DescribePropertyTypeScaItemResponse> describePropertyTypeScaItem(DescribePropertyTypeScaItemRequest request);

    /**
     * <b>description</b> :
     * <p>Only Security Center Enterprise or Ultimate Edition users can call this operation.</p>
     * 
     * @param request the request parameters of DescribePropertyUsageTop  DescribePropertyUsageTopRequest
     * @return DescribePropertyUsageTopResponse
     */
    CompletableFuture<DescribePropertyUsageTopResponse> describePropertyUsageTop(DescribePropertyUsageTopRequest request);

    /**
     * @param request the request parameters of DescribePropertyUserDetail  DescribePropertyUserDetailRequest
     * @return DescribePropertyUserDetailResponse
     */
    CompletableFuture<DescribePropertyUserDetailResponse> describePropertyUserDetail(DescribePropertyUserDetailRequest request);

    /**
     * @param request the request parameters of DescribePropertyUserItem  DescribePropertyUserItemRequest
     * @return DescribePropertyUserItemResponse
     */
    CompletableFuture<DescribePropertyUserItemResponse> describePropertyUserItem(DescribePropertyUserItemRequest request);

    /**
     * @param request the request parameters of DescribeQuaraFileDownloadInfo  DescribeQuaraFileDownloadInfoRequest
     * @return DescribeQuaraFileDownloadInfoResponse
     */
    CompletableFuture<DescribeQuaraFileDownloadInfoResponse> describeQuaraFileDownloadInfo(DescribeQuaraFileDownloadInfoRequest request);

    /**
     * @param request the request parameters of DescribeReportExport  DescribeReportExportRequest
     * @return DescribeReportExportResponse
     */
    CompletableFuture<DescribeReportExportResponse> describeReportExport(DescribeReportExportRequest request);

    /**
     * @param request the request parameters of DescribeReportRecipientStatus  DescribeReportRecipientStatusRequest
     * @return DescribeReportRecipientStatusResponse
     */
    CompletableFuture<DescribeReportRecipientStatusResponse> describeReportRecipientStatus(DescribeReportRecipientStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If the data on your servers is encrypted by ransomware, you can create a restoration task to restore the data on your servers by using backup data in Security Center.</p>
     * <blockquote>
     * <p> After you enable an anti-ransomware policy, the data on your servers is backed up based on the policy. For more information about anti-ransomware policies, see <a href="https://help.aliyun.com/document_detail/164781.html">Manage protection policies</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRestoreJobs  DescribeRestoreJobsRequest
     * @return DescribeRestoreJobsResponse
     */
    CompletableFuture<DescribeRestoreJobsResponse> describeRestoreJobs(DescribeRestoreJobsRequest request);

    /**
     * @param request the request parameters of DescribeRestorePlans  DescribeRestorePlansRequest
     * @return DescribeRestorePlansResponse
     */
    CompletableFuture<DescribeRestorePlansResponse> describeRestorePlans(DescribeRestorePlansRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskCheckItemResult is deprecated  * @description This interface has been deprecated. Use the upgraded interface ListCheckInstanceResult instead.
     * 
     * @param request the request parameters of DescribeRiskCheckItemResult  DescribeRiskCheckItemResultRequest
     * @return DescribeRiskCheckItemResultResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskCheckItemResultResponse> describeRiskCheckItemResult(DescribeRiskCheckItemResultRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskCheckResult is deprecated  * @description This operation is phased out. You can use the [ListCheckResult](~~ListCheckResult~~) operation.
     * 
     * @param request the request parameters of DescribeRiskCheckResult  DescribeRiskCheckResultRequest
     * @return DescribeRiskCheckResultResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskCheckResultResponse> describeRiskCheckResult(DescribeRiskCheckResultRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskCheckSummary is deprecated  * @description This operation is deprecated. Use the GetCheckSummary operation instead.
     * 
     * @param request the request parameters of DescribeRiskCheckSummary  DescribeRiskCheckSummaryRequest
     * @return DescribeRiskCheckSummaryResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskCheckSummaryResponse> describeRiskCheckSummary(DescribeRiskCheckSummaryRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskItemType is deprecated  * @description This operation is offline. Use the upgraded operation ListCheckStandard instead.
     * 
     * @param request the request parameters of DescribeRiskItemType  DescribeRiskItemTypeRequest
     * @return DescribeRiskItemTypeResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskItemTypeResponse> describeRiskItemType(DescribeRiskItemTypeRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskListCheckResult is deprecated  * @description This operation is phased out. You can use the ListCheckResult operation. When you call the ListCheckResult operation, set the Statuses parameter to NOT_PASS.
     * 
     * @param request the request parameters of DescribeRiskListCheckResult  DescribeRiskListCheckResultRequest
     * @return DescribeRiskListCheckResultResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskListCheckResultResponse> describeRiskListCheckResult(DescribeRiskListCheckResultRequest request);

    /**
     * @param request the request parameters of DescribeRiskType  DescribeRiskTypeRequest
     * @return DescribeRiskTypeResponse
     */
    CompletableFuture<DescribeRiskTypeResponse> describeRiskType(DescribeRiskTypeRequest request);

    /**
     * @param request the request parameters of DescribeRisks  DescribeRisksRequest
     * @return DescribeRisksResponse
     */
    CompletableFuture<DescribeRisksResponse> describeRisks(DescribeRisksRequest request);

    /**
     * @param request the request parameters of DescribeSasPmAgentList  DescribeSasPmAgentListRequest
     * @return DescribeSasPmAgentListResponse
     */
    CompletableFuture<DescribeSasPmAgentListResponse> describeSasPmAgentList(DescribeSasPmAgentListRequest request);

    /**
     * @param request the request parameters of DescribeScanTaskProgress  DescribeScanTaskProgressRequest
     * @return DescribeScanTaskProgressResponse
     */
    CompletableFuture<DescribeScanTaskProgressResponse> describeScanTaskProgress(DescribeScanTaskProgressRequest request);

    /**
     * @param request the request parameters of DescribeScanTaskStatistics  DescribeScanTaskStatisticsRequest
     * @return DescribeScanTaskStatisticsResponse
     */
    CompletableFuture<DescribeScanTaskStatisticsResponse> describeScanTaskStatistics(DescribeScanTaskStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeScreenScoreThread  DescribeScreenScoreThreadRequest
     * @return DescribeScreenScoreThreadResponse
     */
    CompletableFuture<DescribeScreenScoreThreadResponse> describeScreenScoreThread(DescribeScreenScoreThreadRequest request);

    /**
     * @param request the request parameters of DescribeSearchCondition  DescribeSearchConditionRequest
     * @return DescribeSearchConditionResponse
     */
    CompletableFuture<DescribeSearchConditionResponse> describeSearchCondition(DescribeSearchConditionRequest request);

    /**
     * @param request the request parameters of DescribeSecureSuggestion  DescribeSecureSuggestionRequest
     * @return DescribeSecureSuggestionResponse
     */
    CompletableFuture<DescribeSecureSuggestionResponse> describeSecureSuggestion(DescribeSecureSuggestionRequest request);

    /**
     * @deprecated OpenAPI DescribeSecurityCheckScheduleConfig is deprecated  * @description This operation is deprecated. Use the GetCheckConfig operation instead.
     * 
     * @param request the request parameters of DescribeSecurityCheckScheduleConfig  DescribeSecurityCheckScheduleConfigRequest
     * @return DescribeSecurityCheckScheduleConfigResponse
     */
    @Deprecated
    CompletableFuture<DescribeSecurityCheckScheduleConfigResponse> describeSecurityCheckScheduleConfig(DescribeSecurityCheckScheduleConfigRequest request);

    /**
     * @param request the request parameters of DescribeSecurityEventMarkMissList  DescribeSecurityEventMarkMissListRequest
     * @return DescribeSecurityEventMarkMissListResponse
     */
    CompletableFuture<DescribeSecurityEventMarkMissListResponse> describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request);

    /**
     * @param request the request parameters of DescribeSecurityEventOperationStatus  DescribeSecurityEventOperationStatusRequest
     * @return DescribeSecurityEventOperationStatusResponse
     */
    CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request);

    /**
     * @param request the request parameters of DescribeSecurityEventOperations  DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request);

    /**
     * @param request the request parameters of DescribeSecurityStatInfo  DescribeSecurityStatInfoRequest
     * @return DescribeSecurityStatInfoResponse
     */
    CompletableFuture<DescribeSecurityStatInfoResponse> describeSecurityStatInfo(DescribeSecurityStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeServiceLinkedRoleStatus  DescribeServiceLinkedRoleStatusRequest
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    CompletableFuture<DescribeServiceLinkedRoleStatusResponse> describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request);

    /**
     * @param request the request parameters of DescribeSimilarEventScenarios  DescribeSimilarEventScenariosRequest
     * @return DescribeSimilarEventScenariosResponse
     */
    CompletableFuture<DescribeSimilarEventScenariosResponse> describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request);

    /**
     * @param request the request parameters of DescribeSimilarSecurityEvents  DescribeSimilarSecurityEventsRequest
     * @return DescribeSimilarSecurityEventsResponse
     */
    CompletableFuture<DescribeSimilarSecurityEventsResponse> describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request);

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <p>This API is only supported by the Enterprise and Flagship editions of Cloud Security Center, other versions do not support it.</p>
     * 
     * @param request the request parameters of DescribeSoarPlaybookTaskDetail  DescribeSoarPlaybookTaskDetailRequest
     * @return DescribeSoarPlaybookTaskDetailResponse
     */
    CompletableFuture<DescribeSoarPlaybookTaskDetailResponse> describeSoarPlaybookTaskDetail(DescribeSoarPlaybookTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategies  DescribeSoarStrategiesRequest
     * @return DescribeSoarStrategiesResponse
     */
    CompletableFuture<DescribeSoarStrategiesResponse> describeSoarStrategies(DescribeSoarStrategiesRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyParam  DescribeSoarStrategyParamRequest
     * @return DescribeSoarStrategyParamResponse
     */
    CompletableFuture<DescribeSoarStrategyParamResponse> describeSoarStrategyParam(DescribeSoarStrategyParamRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API call. Other editions are not supported.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTaskDetail  DescribeSoarStrategyTaskDetailRequest
     * @return DescribeSoarStrategyTaskDetailResponse
     */
    CompletableFuture<DescribeSoarStrategyTaskDetailResponse> describeSoarStrategyTaskDetail(DescribeSoarStrategyTaskDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation. Other editions do not support this operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTaskParams  DescribeSoarStrategyTaskParamsRequest
     * @return DescribeSoarStrategyTaskParamsResponse
     */
    CompletableFuture<DescribeSoarStrategyTaskParamsResponse> describeSoarStrategyTaskParams(DescribeSoarStrategyTaskParamsRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API call. Other editions are not supported.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTaskResult  DescribeSoarStrategyTaskResultRequest
     * @return DescribeSoarStrategyTaskResultResponse
     */
    CompletableFuture<DescribeSoarStrategyTaskResultResponse> describeSoarStrategyTaskResult(DescribeSoarStrategyTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTasks  DescribeSoarStrategyTasksRequest
     * @return DescribeSoarStrategyTasksResponse
     */
    CompletableFuture<DescribeSoarStrategyTasksResponse> describeSoarStrategyTasks(DescribeSoarStrategyTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation. Other editions do not support this operation.</p>
     * 
     * @param request the request parameters of DescribeSoarSubscribedStrategy  DescribeSoarSubscribedStrategyRequest
     * @return DescribeSoarSubscribedStrategyResponse
     */
    CompletableFuture<DescribeSoarSubscribedStrategyResponse> describeSoarSubscribedStrategy(DescribeSoarSubscribedStrategyRequest request);

    /**
     * @param request the request parameters of DescribeStrategy  DescribeStrategyRequest
     * @return DescribeStrategyResponse
     */
    CompletableFuture<DescribeStrategyResponse> describeStrategy(DescribeStrategyRequest request);

    /**
     * @param request the request parameters of DescribeStrategyDetail  DescribeStrategyDetailRequest
     * @return DescribeStrategyDetailResponse
     */
    CompletableFuture<DescribeStrategyDetailResponse> describeStrategyDetail(DescribeStrategyDetailRequest request);

    /**
     * @param request the request parameters of DescribeStrategyExecDetail  DescribeStrategyExecDetailRequest
     * @return DescribeStrategyExecDetailResponse
     */
    CompletableFuture<DescribeStrategyExecDetailResponse> describeStrategyExecDetail(DescribeStrategyExecDetailRequest request);

    /**
     * @param request the request parameters of DescribeStrategyTarget  DescribeStrategyTargetRequest
     * @return DescribeStrategyTargetResponse
     */
    CompletableFuture<DescribeStrategyTargetResponse> describeStrategyTarget(DescribeStrategyTargetRequest request);

    /**
     * @param request the request parameters of DescribeStrictEventName  DescribeStrictEventNameRequest
     * @return DescribeStrictEventNameResponse
     */
    CompletableFuture<DescribeStrictEventNameResponse> describeStrictEventName(DescribeStrictEventNameRequest request);

    /**
     * @param request the request parameters of DescribeSummaryInfo  DescribeSummaryInfoRequest
     * @return DescribeSummaryInfoResponse
     */
    CompletableFuture<DescribeSummaryInfoResponse> describeSummaryInfo(DescribeSummaryInfoRequest request);

    /**
     * @param request the request parameters of DescribeSupervisonInfo  DescribeSupervisonInfoRequest
     * @return DescribeSupervisonInfoResponse
     */
    CompletableFuture<DescribeSupervisonInfoResponse> describeSupervisonInfo(DescribeSupervisonInfoRequest request);

    /**
     * @param request the request parameters of DescribeSupportRegion  DescribeSupportRegionRequest
     * @return DescribeSupportRegionResponse
     */
    CompletableFuture<DescribeSupportRegionResponse> describeSupportRegion(DescribeSupportRegionRequest request);

    /**
     * @param request the request parameters of DescribeSuspEventDetail  DescribeSuspEventDetailRequest
     * @return DescribeSuspEventDetailResponse
     */
    CompletableFuture<DescribeSuspEventDetailResponse> describeSuspEventDetail(DescribeSuspEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeSuspEventExportInfo  DescribeSuspEventExportInfoRequest
     * @return DescribeSuspEventExportInfoResponse
     */
    CompletableFuture<DescribeSuspEventExportInfoResponse> describeSuspEventExportInfo(DescribeSuspEventExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeSuspEventQuaraFiles  DescribeSuspEventQuaraFilesRequest
     * @return DescribeSuspEventQuaraFilesResponse
     */
    CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request);

    /**
     * @param request the request parameters of DescribeSuspEventUserSetting  DescribeSuspEventUserSettingRequest
     * @return DescribeSuspEventUserSettingResponse
     */
    CompletableFuture<DescribeSuspEventUserSettingResponse> describeSuspEventUserSetting(DescribeSuspEventUserSettingRequest request);

    /**
     * @param request the request parameters of DescribeSuspEvents  DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    /**
     * @param request the request parameters of DescribeSuspiciousOverallConfig  DescribeSuspiciousOverallConfigRequest
     * @return DescribeSuspiciousOverallConfigResponse
     */
    CompletableFuture<DescribeSuspiciousOverallConfigResponse> describeSuspiciousOverallConfig(DescribeSuspiciousOverallConfigRequest request);

    /**
     * @param request the request parameters of DescribeSuspiciousSecurityEventyStatistics  DescribeSuspiciousSecurityEventyStatisticsRequest
     * @return DescribeSuspiciousSecurityEventyStatisticsResponse
     */
    CompletableFuture<DescribeSuspiciousSecurityEventyStatisticsResponse> describeSuspiciousSecurityEventyStatistics(DescribeSuspiciousSecurityEventyStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeSuspiciousUUIDConfig  DescribeSuspiciousUUIDConfigRequest
     * @return DescribeSuspiciousUUIDConfigResponse
     */
    CompletableFuture<DescribeSuspiciousUUIDConfigResponse> describeSuspiciousUUIDConfig(DescribeSuspiciousUUIDConfigRequest request);

    /**
     * @param request the request parameters of DescribeSyncAssetTaskList  DescribeSyncAssetTaskListRequest
     * @return DescribeSyncAssetTaskListResponse
     */
    CompletableFuture<DescribeSyncAssetTaskListResponse> describeSyncAssetTaskList(DescribeSyncAssetTaskListRequest request);

    /**
     * @param request the request parameters of DescribeSyncAssetTaskLogDetail  DescribeSyncAssetTaskLogDetailRequest
     * @return DescribeSyncAssetTaskLogDetailResponse
     */
    CompletableFuture<DescribeSyncAssetTaskLogDetailResponse> describeSyncAssetTaskLogDetail(DescribeSyncAssetTaskLogDetailRequest request);

    /**
     * @param request the request parameters of DescribeTarget  DescribeTargetRequest
     * @return DescribeTargetResponse
     */
    CompletableFuture<DescribeTargetResponse> describeTarget(DescribeTargetRequest request);

    /**
     * @param request the request parameters of DescribeTaskErrorLog  DescribeTaskErrorLogRequest
     * @return DescribeTaskErrorLogResponse
     */
    CompletableFuture<DescribeTaskErrorLogResponse> describeTaskErrorLog(DescribeTaskErrorLogRequest request);

    /**
     * @param request the request parameters of DescribeTotalStatistics  DescribeTotalStatisticsRequest
     * @return DescribeTotalStatisticsResponse
     */
    CompletableFuture<DescribeTotalStatisticsResponse> describeTotalStatistics(DescribeTotalStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeTraceInfoDetail  DescribeTraceInfoDetailRequest
     * @return DescribeTraceInfoDetailResponse
     */
    CompletableFuture<DescribeTraceInfoDetailResponse> describeTraceInfoDetail(DescribeTraceInfoDetailRequest request);

    /**
     * @param request the request parameters of DescribeTraceInfoNode  DescribeTraceInfoNodeRequest
     * @return DescribeTraceInfoNodeResponse
     */
    CompletableFuture<DescribeTraceInfoNodeResponse> describeTraceInfoNode(DescribeTraceInfoNodeRequest request);

    /**
     * @param request the request parameters of DescribeUniBackupDatabase  DescribeUniBackupDatabaseRequest
     * @return DescribeUniBackupDatabaseResponse
     */
    CompletableFuture<DescribeUniBackupDatabaseResponse> describeUniBackupDatabase(DescribeUniBackupDatabaseRequest request);

    /**
     * @param request the request parameters of DescribeUniBackupPolicies  DescribeUniBackupPoliciesRequest
     * @return DescribeUniBackupPoliciesResponse
     */
    CompletableFuture<DescribeUniBackupPoliciesResponse> describeUniBackupPolicies(DescribeUniBackupPoliciesRequest request);

    /**
     * @param request the request parameters of DescribeUniBackupPolicyDetail  DescribeUniBackupPolicyDetailRequest
     * @return DescribeUniBackupPolicyDetailResponse
     */
    CompletableFuture<DescribeUniBackupPolicyDetailResponse> describeUniBackupPolicyDetail(DescribeUniBackupPolicyDetailRequest request);

    /**
     * @param request the request parameters of DescribeUniBackupStatistics  DescribeUniBackupStatisticsRequest
     * @return DescribeUniBackupStatisticsResponse
     */
    CompletableFuture<DescribeUniBackupStatisticsResponse> describeUniBackupStatistics(DescribeUniBackupStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeUniRecoverableList  DescribeUniRecoverableListRequest
     * @return DescribeUniRecoverableListResponse
     */
    CompletableFuture<DescribeUniRecoverableListResponse> describeUniRecoverableList(DescribeUniRecoverableListRequest request);

    /**
     * @param request the request parameters of DescribeUniSupportRegion  DescribeUniSupportRegionRequest
     * @return DescribeUniSupportRegionResponse
     */
    CompletableFuture<DescribeUniSupportRegionResponse> describeUniSupportRegion(DescribeUniSupportRegionRequest request);

    /**
     * @param request the request parameters of DescribeUserBackupMachines  DescribeUserBackupMachinesRequest
     * @return DescribeUserBackupMachinesResponse
     */
    CompletableFuture<DescribeUserBackupMachinesResponse> describeUserBackupMachines(DescribeUserBackupMachinesRequest request);

    /**
     * @param request the request parameters of DescribeUserBaselineAuthorization  DescribeUserBaselineAuthorizationRequest
     * @return DescribeUserBaselineAuthorizationResponse
     */
    CompletableFuture<DescribeUserBaselineAuthorizationResponse> describeUserBaselineAuthorization(DescribeUserBaselineAuthorizationRequest request);

    /**
     * @param request the request parameters of DescribeUserSetting  DescribeUserSettingRequest
     * @return DescribeUserSettingResponse
     */
    CompletableFuture<DescribeUserSettingResponse> describeUserSetting(DescribeUserSettingRequest request);

    /**
     * @param request the request parameters of DescribeUuidVulNumClassifyStatistic  DescribeUuidVulNumClassifyStatisticRequest
     * @return DescribeUuidVulNumClassifyStatisticResponse
     */
    CompletableFuture<DescribeUuidVulNumClassifyStatisticResponse> describeUuidVulNumClassifyStatistic(DescribeUuidVulNumClassifyStatisticRequest request);

    /**
     * @param request the request parameters of DescribeUuidsByVulNames  DescribeUuidsByVulNamesRequest
     * @return DescribeUuidsByVulNamesResponse
     */
    CompletableFuture<DescribeUuidsByVulNamesResponse> describeUuidsByVulNames(DescribeUuidsByVulNamesRequest request);

    /**
     * @param request the request parameters of DescribeVendorList  DescribeVendorListRequest
     * @return DescribeVendorListResponse
     */
    CompletableFuture<DescribeVendorListResponse> describeVendorList(DescribeVendorListRequest request);

    /**
     * @param request the request parameters of DescribeVersionConfig  DescribeVersionConfigRequest
     * @return DescribeVersionConfigResponse
     */
    CompletableFuture<DescribeVersionConfigResponse> describeVersionConfig(DescribeVersionConfigRequest request);

    /**
     * @param request the request parameters of DescribeVolDingdingMessage  DescribeVolDingdingMessageRequest
     * @return DescribeVolDingdingMessageResponse
     */
    CompletableFuture<DescribeVolDingdingMessageResponse> describeVolDingdingMessage(DescribeVolDingdingMessageRequest request);

    /**
     * @param request the request parameters of DescribeVpcHoneyPotCriteria  DescribeVpcHoneyPotCriteriaRequest
     * @return DescribeVpcHoneyPotCriteriaResponse
     */
    CompletableFuture<DescribeVpcHoneyPotCriteriaResponse> describeVpcHoneyPotCriteria(DescribeVpcHoneyPotCriteriaRequest request);

    /**
     * <b>description</b> :
     * <p>If you specify only the Action parameter without specifying any other request parameters, Security Center returns the list of all VPCs regardless of whether honeypot instances are created in the VPCs.</p>
     * 
     * @param request the request parameters of DescribeVpcHoneyPotList  DescribeVpcHoneyPotListRequest
     * @return DescribeVpcHoneyPotListResponse
     */
    CompletableFuture<DescribeVpcHoneyPotListResponse> describeVpcHoneyPotList(DescribeVpcHoneyPotListRequest request);

    /**
     * @param request the request parameters of DescribeVpcList  DescribeVpcListRequest
     * @return DescribeVpcListResponse
     */
    CompletableFuture<DescribeVpcListResponse> describeVpcList(DescribeVpcListRequest request);

    /**
     * @param request the request parameters of DescribeVulCheckTaskStatusDetail  DescribeVulCheckTaskStatusDetailRequest
     * @return DescribeVulCheckTaskStatusDetailResponse
     */
    CompletableFuture<DescribeVulCheckTaskStatusDetailResponse> describeVulCheckTaskStatusDetail(DescribeVulCheckTaskStatusDetailRequest request);

    /**
     * @param request the request parameters of DescribeVulConfig  DescribeVulConfigRequest
     * @return DescribeVulConfigResponse
     */
    CompletableFuture<DescribeVulConfigResponse> describeVulConfig(DescribeVulConfigRequest request);

    /**
     * @param request the request parameters of DescribeVulDefendCountStatistics  DescribeVulDefendCountStatisticsRequest
     * @return DescribeVulDefendCountStatisticsResponse
     */
    CompletableFuture<DescribeVulDefendCountStatisticsResponse> describeVulDefendCountStatistics(DescribeVulDefendCountStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeVulDetails  DescribeVulDetailsRequest
     * @return DescribeVulDetailsResponse
     */
    CompletableFuture<DescribeVulDetailsResponse> describeVulDetails(DescribeVulDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>A download link is returned when the export task status is success.</p>
     * 
     * @param request the request parameters of DescribeVulExportInfo  DescribeVulExportInfoRequest
     * @return DescribeVulExportInfoResponse
     */
    CompletableFuture<DescribeVulExportInfoResponse> describeVulExportInfo(DescribeVulExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeVulFixStatistics  DescribeVulFixStatisticsRequest
     * @return DescribeVulFixStatisticsResponse
     */
    CompletableFuture<DescribeVulFixStatisticsResponse> describeVulFixStatistics(DescribeVulFixStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeVulList  DescribeVulListRequest
     * @return DescribeVulListResponse
     */
    CompletableFuture<DescribeVulListResponse> describeVulList(DescribeVulListRequest request);

    /**
     * @param request the request parameters of DescribeVulListPage  DescribeVulListPageRequest
     * @return DescribeVulListPageResponse
     */
    CompletableFuture<DescribeVulListPageResponse> describeVulListPage(DescribeVulListPageRequest request);

    /**
     * @param request the request parameters of DescribeVulMetaCountStatistics  DescribeVulMetaCountStatisticsRequest
     * @return DescribeVulMetaCountStatisticsResponse
     */
    CompletableFuture<DescribeVulMetaCountStatisticsResponse> describeVulMetaCountStatistics(DescribeVulMetaCountStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeVulNumStatistics  DescribeVulNumStatisticsRequest
     * @return DescribeVulNumStatisticsResponse
     */
    CompletableFuture<DescribeVulNumStatisticsResponse> describeVulNumStatistics(DescribeVulNumStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeVulTargetConfig  DescribeVulTargetConfigRequest
     * @return DescribeVulTargetConfigResponse
     */
    CompletableFuture<DescribeVulTargetConfigResponse> describeVulTargetConfig(DescribeVulTargetConfigRequest request);

    /**
     * @param request the request parameters of DescribeVulTargetStatistics  DescribeVulTargetStatisticsRequest
     * @return DescribeVulTargetStatisticsResponse
     */
    CompletableFuture<DescribeVulTargetStatisticsResponse> describeVulTargetStatistics(DescribeVulTargetStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeVulWhitelist  DescribeVulWhitelistRequest
     * @return DescribeVulWhitelistResponse
     */
    CompletableFuture<DescribeVulWhitelistResponse> describeVulWhitelist(DescribeVulWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeWarningExportInfo  DescribeWarningExportInfoRequest
     * @return DescribeWarningExportInfoResponse
     */
    CompletableFuture<DescribeWarningExportInfoResponse> describeWarningExportInfo(DescribeWarningExportInfoRequest request);

    /**
     * @param request the request parameters of DescribeWarningMachines  DescribeWarningMachinesRequest
     * @return DescribeWarningMachinesResponse
     */
    CompletableFuture<DescribeWarningMachinesResponse> describeWarningMachines(DescribeWarningMachinesRequest request);

    /**
     * @param request the request parameters of DescribeWebLockBindList  DescribeWebLockBindListRequest
     * @return DescribeWebLockBindListResponse
     */
    CompletableFuture<DescribeWebLockBindListResponse> describeWebLockBindList(DescribeWebLockBindListRequest request);

    /**
     * @param request the request parameters of DescribeWebLockConfigList  DescribeWebLockConfigListRequest
     * @return DescribeWebLockConfigListResponse
     */
    CompletableFuture<DescribeWebLockConfigListResponse> describeWebLockConfigList(DescribeWebLockConfigListRequest request);

    /**
     * @param request the request parameters of DescribeWebLockExclusiveFileType  DescribeWebLockExclusiveFileTypeRequest
     * @return DescribeWebLockExclusiveFileTypeResponse
     */
    CompletableFuture<DescribeWebLockExclusiveFileTypeResponse> describeWebLockExclusiveFileType(DescribeWebLockExclusiveFileTypeRequest request);

    /**
     * @param request the request parameters of DescribeWebLockFileChangeStatistics  DescribeWebLockFileChangeStatisticsRequest
     * @return DescribeWebLockFileChangeStatisticsResponse
     */
    CompletableFuture<DescribeWebLockFileChangeStatisticsResponse> describeWebLockFileChangeStatistics(DescribeWebLockFileChangeStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeWebLockFileEvents  DescribeWebLockFileEventsRequest
     * @return DescribeWebLockFileEventsResponse
     */
    CompletableFuture<DescribeWebLockFileEventsResponse> describeWebLockFileEvents(DescribeWebLockFileEventsRequest request);

    /**
     * @param request the request parameters of DescribeWebLockFileTypeSummary  DescribeWebLockFileTypeSummaryRequest
     * @return DescribeWebLockFileTypeSummaryResponse
     */
    CompletableFuture<DescribeWebLockFileTypeSummaryResponse> describeWebLockFileTypeSummary(DescribeWebLockFileTypeSummaryRequest request);

    /**
     * @param request the request parameters of DescribeWebLockInclusiveFileType  DescribeWebLockInclusiveFileTypeRequest
     * @return DescribeWebLockInclusiveFileTypeResponse
     */
    CompletableFuture<DescribeWebLockInclusiveFileTypeResponse> describeWebLockInclusiveFileType(DescribeWebLockInclusiveFileTypeRequest request);

    /**
     * @param request the request parameters of DescribeWebLockProcessBlockStatistics  DescribeWebLockProcessBlockStatisticsRequest
     * @return DescribeWebLockProcessBlockStatisticsResponse
     */
    CompletableFuture<DescribeWebLockProcessBlockStatisticsResponse> describeWebLockProcessBlockStatistics(DescribeWebLockProcessBlockStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeWebLockProcessList  DescribeWebLockProcessListRequest
     * @return DescribeWebLockProcessListResponse
     */
    CompletableFuture<DescribeWebLockProcessListResponse> describeWebLockProcessList(DescribeWebLockProcessListRequest request);

    /**
     * @param request the request parameters of DescribeWebLockStatus  DescribeWebLockStatusRequest
     * @return DescribeWebLockStatusResponse
     */
    CompletableFuture<DescribeWebLockStatusResponse> describeWebLockStatus(DescribeWebLockStatusRequest request);

    /**
     * @param request the request parameters of DescribeWebLockTotalFileChangeCount  DescribeWebLockTotalFileChangeCountRequest
     * @return DescribeWebLockTotalFileChangeCountResponse
     */
    CompletableFuture<DescribeWebLockTotalFileChangeCountResponse> describeWebLockTotalFileChangeCount(DescribeWebLockTotalFileChangeCountRequest request);

    /**
     * @param request the request parameters of DescribeWebPath  DescribeWebPathRequest
     * @return DescribeWebPathResponse
     */
    CompletableFuture<DescribeWebPathResponse> describeWebPath(DescribeWebPathRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListAsset  DescribeWhiteListAssetRequest
     * @return DescribeWhiteListAssetResponse
     */
    CompletableFuture<DescribeWhiteListAssetResponse> describeWhiteListAsset(DescribeWhiteListAssetRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist is a China site China site public preview feature that is no longer open for new applications. Users who have already applied for or are using this feature can call this operation as expected.</p>
     * 
     * @param request the request parameters of DescribeWhiteListAuthorize  DescribeWhiteListAuthorizeRequest
     * @return DescribeWhiteListAuthorizeResponse
     */
    CompletableFuture<DescribeWhiteListAuthorizeResponse> describeWhiteListAuthorize(DescribeWhiteListAuthorizeRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in-use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListEffectiveAssets  DescribeWhiteListEffectiveAssetsRequest
     * @return DescribeWhiteListEffectiveAssetsResponse
     */
    CompletableFuture<DescribeWhiteListEffectiveAssetsResponse> describeWhiteListEffectiveAssets(DescribeWhiteListEffectiveAssetsRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListProcess  DescribeWhiteListProcessRequest
     * @return DescribeWhiteListProcessResponse
     */
    CompletableFuture<DescribeWhiteListProcessResponse> describeWhiteListProcess(DescribeWhiteListProcessRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyList  DescribeWhiteListStrategyListRequest
     * @return DescribeWhiteListStrategyListResponse
     */
    CompletableFuture<DescribeWhiteListStrategyListResponse> describeWhiteListStrategyList(DescribeWhiteListStrategyListRequest request);

    /**
     * <b>description</b> :
     * <p>Application whitelist is a China-site public preview feature that is no longer open for new applications. Users who have already applied for or are using this feature can call this operation as usual.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyStatistics  DescribeWhiteListStrategyStatisticsRequest
     * @return DescribeWhiteListStrategyStatisticsResponse
     */
    CompletableFuture<DescribeWhiteListStrategyStatisticsResponse> describeWhiteListStrategyStatistics(DescribeWhiteListStrategyStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in-use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyUuidCount  DescribeWhiteListStrategyUuidCountRequest
     * @return DescribeWhiteListStrategyUuidCountResponse
     */
    CompletableFuture<DescribeWhiteListStrategyUuidCountResponse> describeWhiteListStrategyUuidCount(DescribeWhiteListStrategyUuidCountRequest request);

    /**
     * @param request the request parameters of DingTalkOnlineTest  DingTalkOnlineTestRequest
     * @return DingTalkOnlineTestResponse
     */
    CompletableFuture<DingTalkOnlineTestResponse> dingTalkOnlineTest(DingTalkOnlineTestRequest request);

    /**
     * @param request the request parameters of DisableBruteForceRecord  DisableBruteForceRecordRequest
     * @return DisableBruteForceRecordResponse
     */
    CompletableFuture<DisableBruteForceRecordResponse> disableBruteForceRecord(DisableBruteForceRecordRequest request);

    /**
     * @param request the request parameters of DisableCustomBlockRecord  DisableCustomBlockRecordRequest
     * @return DisableCustomBlockRecordResponse
     */
    CompletableFuture<DisableCustomBlockRecordResponse> disableCustomBlockRecord(DisableCustomBlockRecordRequest request);

    /**
     * @param request the request parameters of EnableBruteForceRecord  EnableBruteForceRecordRequest
     * @return EnableBruteForceRecordResponse
     */
    CompletableFuture<EnableBruteForceRecordResponse> enableBruteForceRecord(EnableBruteForceRecordRequest request);

    /**
     * @param request the request parameters of EnableCustomBlockRecord  EnableCustomBlockRecordRequest
     * @return EnableCustomBlockRecordResponse
     */
    CompletableFuture<EnableCustomBlockRecordResponse> enableCustomBlockRecord(EnableCustomBlockRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, associate the target instance with a specified blocking rule by calling <a href="~~ModifyCustomBlockRecord~~">ModifyCustomBlockRecord</a>. You can call <a href="~~CreateCustomBlockRecord~~">CreateCustomBlockRecord</a> to create a rule, call <a href="~~DescribeCustomBlockRecords~~">DescribeCustomBlockRecords</a> to query rules, and then perform the association and enablement operations.</p>
     * 
     * @param request the request parameters of EnableCustomInstanceBlockRecord  EnableCustomInstanceBlockRecordRequest
     * @return EnableCustomInstanceBlockRecordResponse
     */
    CompletableFuture<EnableCustomInstanceBlockRecordResponse> enableCustomInstanceBlockRecord(EnableCustomInstanceBlockRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using the management account of the resource directory or a delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of EnableServiceAccessResourceDirectory  EnableServiceAccessResourceDirectoryRequest
     * @return EnableServiceAccessResourceDirectoryResponse
     */
    CompletableFuture<EnableServiceAccessResourceDirectoryResponse> enableServiceAccessResourceDirectory(EnableServiceAccessResourceDirectoryRequest request);

    /**
     * @param request the request parameters of ExecStrategy  ExecStrategyRequest
     * @return ExecStrategyResponse
     */
    CompletableFuture<ExecStrategyResponse> execStrategy(ExecStrategyRequest request);

    /**
     * @param request the request parameters of ExportCustomizeReport  ExportCustomizeReportRequest
     * @return ExportCustomizeReportResponse
     */
    CompletableFuture<ExportCustomizeReportResponse> exportCustomizeReport(ExportCustomizeReportRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, you can call the <a href="~~DescribeExportInfo~~">DescribeExportInfo</a> operation to query the export progress and retrieve the download URL for the exported Excel file.</p>
     * 
     * @param request the request parameters of ExportRecord  ExportRecordRequest
     * @return ExportRecordResponse
     */
    CompletableFuture<ExportRecordResponse> exportRecord(ExportRecordRequest request);

    /**
     * @param request the request parameters of ExportSuspEvents  ExportSuspEventsRequest
     * @return ExportSuspEventsResponse
     */
    CompletableFuture<ExportSuspEventsResponse> exportSuspEvents(ExportSuspEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Exports a vulnerability list. You can export vulnerability lists for Linux software vulnerabilities, Windows system vulnerabilities, Web-CMS vulnerabilities, application vulnerabilities, and emergency vulnerabilities.
     * This operation is used together with the DescribeVulExportInfo operation. After you call this operation to create a vulnerability export task, call the <a href="~~DescribeVulExportInfo~~">DescribeVulExportInfo</a> operation with the export task ID to check the progress of the export task.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Manage your calls appropriately.</p>
     * 
     * @param request the request parameters of ExportVul  ExportVulRequest
     * @return ExportVulResponse
     */
    CompletableFuture<ExportVulResponse> exportVul(ExportVulRequest request);

    /**
     * @deprecated OpenAPI ExportWarning is deprecated, please use Sas::2018-12-03::ExportRecord instead.  * @param request  the request parameters of ExportWarning  ExportWarningRequest
     * @return ExportWarningResponse
     */
    @Deprecated
    CompletableFuture<ExportWarningResponse> exportWarning(ExportWarningRequest request);

    /**
     * @param request the request parameters of FindContainerNetworkConnect  FindContainerNetworkConnectRequest
     * @return FindContainerNetworkConnectResponse
     */
    CompletableFuture<FindContainerNetworkConnectResponse> findContainerNetworkConnect(FindContainerNetworkConnectRequest request);

    /**
     * @param request the request parameters of FinishGuidTask  FinishGuidTaskRequest
     * @return FinishGuidTaskResponse
     */
    CompletableFuture<FinishGuidTaskResponse> finishGuidTask(FinishGuidTaskRequest request);

    /**
     * @param request the request parameters of FixCheckWarnings  FixCheckWarningsRequest
     * @return FixCheckWarningsResponse
     */
    CompletableFuture<FixCheckWarningsResponse> fixCheckWarnings(FixCheckWarningsRequest request);

    /**
     * @param request the request parameters of GenerateClusterScannerWebhookYaml  GenerateClusterScannerWebhookYamlRequest
     * @return GenerateClusterScannerWebhookYamlResponse
     */
    CompletableFuture<GenerateClusterScannerWebhookYamlResponse> generateClusterScannerWebhookYaml(GenerateClusterScannerWebhookYamlRequest request);

    /**
     * @param request the request parameters of GenerateDynamicDict  GenerateDynamicDictRequest
     * @return GenerateDynamicDictResponse
     */
    CompletableFuture<GenerateDynamicDictResponse> generateDynamicDict(GenerateDynamicDictRequest request);

    /**
     * @param request the request parameters of GenerateK8sAccessInfo  GenerateK8sAccessInfoRequest
     * @return GenerateK8sAccessInfoResponse
     */
    CompletableFuture<GenerateK8sAccessInfoResponse> generateK8sAccessInfo(GenerateK8sAccessInfoRequest request);

    /**
     * @param request the request parameters of GenerateOnceTask  GenerateOnceTaskRequest
     * @return GenerateOnceTaskResponse
     */
    CompletableFuture<GenerateOnceTaskResponse> generateOnceTask(GenerateOnceTaskRequest request);

    /**
     * @param request the request parameters of GetAccountLabel  GetAccountLabelRequest
     * @return GetAccountLabelResponse
     */
    CompletableFuture<GetAccountLabelResponse> getAccountLabel(GetAccountLabelRequest request);

    /**
     * <b>description</b> :
     * <p>Only users of the Ultimate edition of Security Center can call this operation.</p>
     * 
     * @param request the request parameters of GetAegisContainerPluginRule  GetAegisContainerPluginRuleRequest
     * @return GetAegisContainerPluginRuleResponse
     */
    CompletableFuture<GetAegisContainerPluginRuleResponse> getAegisContainerPluginRule(GetAegisContainerPluginRuleRequest request);

    /**
     * @param request the request parameters of GetAegisContainerPluginRuleCriteria  GetAegisContainerPluginRuleCriteriaRequest
     * @return GetAegisContainerPluginRuleCriteriaResponse
     */
    CompletableFuture<GetAegisContainerPluginRuleCriteriaResponse> getAegisContainerPluginRuleCriteria(GetAegisContainerPluginRuleCriteriaRequest request);

    /**
     * @param request the request parameters of GetAgentlessTaskCount  GetAgentlessTaskCountRequest
     * @return GetAgentlessTaskCountResponse
     */
    CompletableFuture<GetAgentlessTaskCountResponse> getAgentlessTaskCount(GetAgentlessTaskCountRequest request);

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts that have activated the pay-as-you-go billing method for Security Center agentless detection can call this operation. UuidList can contain up to 100 UUIDs. Duplicate UUIDs are deduplicated based on the order of first occurrence. The returned Data is keyed by UUID and does not aggregate results across multiple resources. RiskMachine, ScanMachine, and LastTaskTime are account-level statistics and remain consistent across all resources in the same request.</p>
     * 
     * @param request the request parameters of GetAgentlessTaskCountBatch  GetAgentlessTaskCountBatchRequest
     * @return GetAgentlessTaskCountBatchResponse
     */
    CompletableFuture<GetAgentlessTaskCountBatchResponse> getAgentlessTaskCountBatch(GetAgentlessTaskCountBatchRequest request);

    /**
     * @param request the request parameters of GetAgentlessTaskUsedSizeEstimate  GetAgentlessTaskUsedSizeEstimateRequest
     * @return GetAgentlessTaskUsedSizeEstimateResponse
     */
    CompletableFuture<GetAgentlessTaskUsedSizeEstimateResponse> getAgentlessTaskUsedSizeEstimate(GetAgentlessTaskUsedSizeEstimateRequest request);

    /**
     * @param request the request parameters of GetAlarmMachineCount  GetAlarmMachineCountRequest
     * @return GetAlarmMachineCountResponse
     */
    CompletableFuture<GetAlarmMachineCountResponse> getAlarmMachineCount(GetAlarmMachineCountRequest request);

    /**
     * @param request the request parameters of GetAppNetwork  GetAppNetworkRequest
     * @return GetAppNetworkResponse
     */
    CompletableFuture<GetAppNetworkResponse> getAppNetwork(GetAppNetworkRequest request);

    /**
     * @param request the request parameters of GetAssetDetailByUuid  GetAssetDetailByUuidRequest
     * @return GetAssetDetailByUuidResponse
     */
    CompletableFuture<GetAssetDetailByUuidResponse> getAssetDetailByUuid(GetAssetDetailByUuidRequest request);

    /**
     * @param request the request parameters of GetAssetSelectionConfig  GetAssetSelectionConfigRequest
     * @return GetAssetSelectionConfigResponse
     */
    CompletableFuture<GetAssetSelectionConfigResponse> getAssetSelectionConfig(GetAssetSelectionConfigRequest request);

    /**
     * @param request the request parameters of GetAssetsPropertyDetail  GetAssetsPropertyDetailRequest
     * @return GetAssetsPropertyDetailResponse
     */
    CompletableFuture<GetAssetsPropertyDetailResponse> getAssetsPropertyDetail(GetAssetsPropertyDetailRequest request);

    /**
     * @param request the request parameters of GetAssetsPropertyItem  GetAssetsPropertyItemRequest
     * @return GetAssetsPropertyItemResponse
     */
    CompletableFuture<GetAssetsPropertyItemResponse> getAssetsPropertyItem(GetAssetsPropertyItemRequest request);

    /**
     * @param request the request parameters of GetAttackEventDashboard  GetAttackEventDashboardRequest
     * @return GetAttackEventDashboardResponse
     */
    CompletableFuture<GetAttackEventDashboardResponse> getAttackEventDashboard(GetAttackEventDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation to retrieve the details of an attack analysis event, call the ListAttackEventInfo operation to obtain a valid attack analysis event ID.</p>
     * 
     * @param request the request parameters of GetAttackEventDetail  GetAttackEventDetailRequest
     * @return GetAttackEventDetailResponse
     */
    CompletableFuture<GetAttackEventDetailResponse> getAttackEventDetail(GetAttackEventDetailRequest request);

    /**
     * @param request the request parameters of GetAttackPathEventDetail  GetAttackPathEventDetailRequest
     * @return GetAttackPathEventDetailResponse
     */
    CompletableFuture<GetAttackPathEventDetailResponse> getAttackPathEventDetail(GetAttackPathEventDetailRequest request);

    /**
     * @param request the request parameters of GetAttackPathEventStatistics  GetAttackPathEventStatisticsRequest
     * @return GetAttackPathEventStatisticsResponse
     */
    CompletableFuture<GetAttackPathEventStatisticsResponse> getAttackPathEventStatistics(GetAttackPathEventStatisticsRequest request);

    /**
     * @param request the request parameters of GetAttackPathSensitiveAssetConfig  GetAttackPathSensitiveAssetConfigRequest
     * @return GetAttackPathSensitiveAssetConfigResponse
     */
    CompletableFuture<GetAttackPathSensitiveAssetConfigResponse> getAttackPathSensitiveAssetConfig(GetAttackPathSensitiveAssetConfigRequest request);

    /**
     * @param request the request parameters of GetAttackPathWhitelist  GetAttackPathWhitelistRequest
     * @return GetAttackPathWhitelistResponse
     */
    CompletableFuture<GetAttackPathWhitelistResponse> getAttackPathWhitelist(GetAttackPathWhitelistRequest request);

    /**
     * @param request the request parameters of GetAttackTypeList  GetAttackTypeListRequest
     * @return GetAttackTypeListResponse
     */
    CompletableFuture<GetAttackTypeListResponse> getAttackTypeList(GetAttackTypeListRequest request);

    /**
     * @param request the request parameters of GetAuthSummary  GetAuthSummaryRequest
     * @return GetAuthSummaryResponse
     */
    CompletableFuture<GetAuthSummaryResponse> getAuthSummary(GetAuthSummaryRequest request);

    /**
     * @param request the request parameters of GetAuthVersionStatistic  GetAuthVersionStatisticRequest
     * @return GetAuthVersionStatisticResponse
     */
    CompletableFuture<GetAuthVersionStatisticResponse> getAuthVersionStatistic(GetAuthVersionStatisticRequest request);

    /**
     * @param request the request parameters of GetBackupAutoConfigStatus  GetBackupAutoConfigStatusRequest
     * @return GetBackupAutoConfigStatusResponse
     */
    CompletableFuture<GetBackupAutoConfigStatusResponse> getBackupAutoConfigStatus(GetBackupAutoConfigStatusRequest request);

    /**
     * @param request the request parameters of GetBackupStorageCount  GetBackupStorageCountRequest
     * @return GetBackupStorageCountResponse
     */
    CompletableFuture<GetBackupStorageCountResponse> getBackupStorageCount(GetBackupStorageCountRequest request);

    /**
     * @param request the request parameters of GetBuildRiskDefineRuleConfig  GetBuildRiskDefineRuleConfigRequest
     * @return GetBuildRiskDefineRuleConfigResponse
     */
    CompletableFuture<GetBuildRiskDefineRuleConfigResponse> getBuildRiskDefineRuleConfig(GetBuildRiskDefineRuleConfigRequest request);

    /**
     * @param request the request parameters of GetCanTrySas  GetCanTrySasRequest
     * @return GetCanTrySasResponse
     */
    CompletableFuture<GetCanTrySasResponse> getCanTrySas(GetCanTrySasRequest request);

    /**
     * @param request the request parameters of GetCheckConfig  GetCheckConfigRequest
     * @return GetCheckConfigResponse
     */
    CompletableFuture<GetCheckConfigResponse> getCheckConfig(GetCheckConfigRequest request);

    /**
     * @param request the request parameters of GetCheckCountStatistic  GetCheckCountStatisticRequest
     * @return GetCheckCountStatisticResponse
     */
    CompletableFuture<GetCheckCountStatisticResponse> getCheckCountStatistic(GetCheckCountStatisticRequest request);

    /**
     * @param request the request parameters of GetCheckDetail  GetCheckDetailRequest
     * @return GetCheckDetailResponse
     */
    CompletableFuture<GetCheckDetailResponse> getCheckDetail(GetCheckDetailRequest request);

    /**
     * @param request the request parameters of GetCheckProcess  GetCheckProcessRequest
     * @return GetCheckProcessResponse
     */
    CompletableFuture<GetCheckProcessResponse> getCheckProcess(GetCheckProcessRequest request);

    /**
     * @param request the request parameters of GetCheckRiskStatistics  GetCheckRiskStatisticsRequest
     * @return GetCheckRiskStatisticsResponse
     */
    CompletableFuture<GetCheckRiskStatisticsResponse> getCheckRiskStatistics(GetCheckRiskStatisticsRequest request);

    /**
     * @param request the request parameters of GetCheckSale  GetCheckSaleRequest
     * @return GetCheckSaleResponse
     */
    CompletableFuture<GetCheckSaleResponse> getCheckSale(GetCheckSaleRequest request);

    /**
     * @param request the request parameters of GetCheckScopeConfig  GetCheckScopeConfigRequest
     * @return GetCheckScopeConfigResponse
     */
    CompletableFuture<GetCheckScopeConfigResponse> getCheckScopeConfig(GetCheckScopeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud platform configuration check feature requires a purchase before use.</p>
     * 
     * @param request the request parameters of GetCheckStructure  GetCheckStructureRequest
     * @return GetCheckStructureResponse
     */
    CompletableFuture<GetCheckStructureResponse> getCheckStructure(GetCheckStructureRequest request);

    /**
     * @param request the request parameters of GetCheckSummary  GetCheckSummaryRequest
     * @return GetCheckSummaryResponse
     */
    CompletableFuture<GetCheckSummaryResponse> getCheckSummary(GetCheckSummaryRequest request);

    /**
     * @param request the request parameters of GetCheckTimeDimensionStatistic  GetCheckTimeDimensionStatisticRequest
     * @return GetCheckTimeDimensionStatisticResponse
     */
    CompletableFuture<GetCheckTimeDimensionStatisticResponse> getCheckTimeDimensionStatistic(GetCheckTimeDimensionStatisticRequest request);

    /**
     * @param request the request parameters of GetClientRatioStatistic  GetClientRatioStatisticRequest
     * @return GetClientRatioStatisticResponse
     */
    CompletableFuture<GetClientRatioStatisticResponse> getClientRatioStatistic(GetClientRatioStatisticRequest request);

    /**
     * @param request the request parameters of GetClientUserDefineRule  GetClientUserDefineRuleRequest
     * @return GetClientUserDefineRuleResponse
     */
    CompletableFuture<GetClientUserDefineRuleResponse> getClientUserDefineRule(GetClientUserDefineRuleRequest request);

    /**
     * @param request the request parameters of GetCloudAssetCriteria  GetCloudAssetCriteriaRequest
     * @return GetCloudAssetCriteriaResponse
     */
    CompletableFuture<GetCloudAssetCriteriaResponse> getCloudAssetCriteria(GetCloudAssetCriteriaRequest request);

    /**
     * @param request the request parameters of GetCloudAssetDetail  GetCloudAssetDetailRequest
     * @return GetCloudAssetDetailResponse
     */
    CompletableFuture<GetCloudAssetDetailResponse> getCloudAssetDetail(GetCloudAssetDetailRequest request);

    /**
     * @param request the request parameters of GetCloudAssetSummary  GetCloudAssetSummaryRequest
     * @return GetCloudAssetSummaryResponse
     */
    CompletableFuture<GetCloudAssetSummaryResponse> getCloudAssetSummary(GetCloudAssetSummaryRequest request);

    /**
     * @param request the request parameters of GetClusterCheckItemWarningStatistics  GetClusterCheckItemWarningStatisticsRequest
     * @return GetClusterCheckItemWarningStatisticsResponse
     */
    CompletableFuture<GetClusterCheckItemWarningStatisticsResponse> getClusterCheckItemWarningStatistics(GetClusterCheckItemWarningStatisticsRequest request);

    /**
     * @param request the request parameters of GetClusterCheckSummary  GetClusterCheckSummaryRequest
     * @return GetClusterCheckSummaryResponse
     */
    CompletableFuture<GetClusterCheckSummaryResponse> getClusterCheckSummary(GetClusterCheckSummaryRequest request);

    /**
     * @param request the request parameters of GetClusterRuleSummary  GetClusterRuleSummaryRequest
     * @return GetClusterRuleSummaryResponse
     */
    CompletableFuture<GetClusterRuleSummaryResponse> getClusterRuleSummary(GetClusterRuleSummaryRequest request);

    /**
     * @param request the request parameters of GetClusterScannerYaml  GetClusterScannerYamlRequest
     * @return GetClusterScannerYamlResponse
     */
    CompletableFuture<GetClusterScannerYamlResponse> getClusterScannerYaml(GetClusterScannerYamlRequest request);

    /**
     * @param request the request parameters of GetClusterStrategyCount  GetClusterStrategyCountRequest
     * @return GetClusterStrategyCountResponse
     */
    CompletableFuture<GetClusterStrategyCountResponse> getClusterStrategyCount(GetClusterStrategyCountRequest request);

    /**
     * @param request the request parameters of GetClusterSuspEventStatistics  GetClusterSuspEventStatisticsRequest
     * @return GetClusterSuspEventStatisticsResponse
     */
    CompletableFuture<GetClusterSuspEventStatisticsResponse> getClusterSuspEventStatistics(GetClusterSuspEventStatisticsRequest request);

    /**
     * @param request the request parameters of GetCommonSwitchConfig  GetCommonSwitchConfigRequest
     * @return GetCommonSwitchConfigResponse
     */
    CompletableFuture<GetCommonSwitchConfigResponse> getCommonSwitchConfig(GetCommonSwitchConfigRequest request);

    /**
     * @param request the request parameters of GetConsoleFuncGrayStatus  GetConsoleFuncGrayStatusRequest
     * @return GetConsoleFuncGrayStatusResponse
     */
    CompletableFuture<GetConsoleFuncGrayStatusResponse> getConsoleFuncGrayStatus(GetConsoleFuncGrayStatusRequest request);

    /**
     * @param request the request parameters of GetContainerDefenseRuleDetail  GetContainerDefenseRuleDetailRequest
     * @return GetContainerDefenseRuleDetailResponse
     */
    CompletableFuture<GetContainerDefenseRuleDetailResponse> getContainerDefenseRuleDetail(GetContainerDefenseRuleDetailRequest request);

    /**
     * @param request the request parameters of GetCurrentVersionPublish  GetCurrentVersionPublishRequest
     * @return GetCurrentVersionPublishResponse
     */
    CompletableFuture<GetCurrentVersionPublishResponse> getCurrentVersionPublish(GetCurrentVersionPublishRequest request);

    /**
     * @param request the request parameters of GetDataTrend  GetDataTrendRequest
     * @return GetDataTrendResponse
     */
    CompletableFuture<GetDataTrendResponse> getDataTrend(GetDataTrendRequest request);

    /**
     * @param request the request parameters of GetDefenceCount  GetDefenceCountRequest
     * @return GetDefenceCountResponse
     */
    CompletableFuture<GetDefenceCountResponse> getDefenceCount(GetDefenceCountRequest request);

    /**
     * @param request the request parameters of GetDockerhubImageRiskRankInfo  GetDockerhubImageRiskRankInfoRequest
     * @return GetDockerhubImageRiskRankInfoResponse
     */
    CompletableFuture<GetDockerhubImageRiskRankInfoResponse> getDockerhubImageRiskRankInfo(GetDockerhubImageRiskRankInfoRequest request);

    /**
     * @param request the request parameters of GetDockerhubImageRiskStatistic  GetDockerhubImageRiskStatisticRequest
     * @return GetDockerhubImageRiskStatisticResponse
     */
    CompletableFuture<GetDockerhubImageRiskStatisticResponse> getDockerhubImageRiskStatistic(GetDockerhubImageRiskStatisticRequest request);

    /**
     * @param request the request parameters of GetFileDetectApiInvokeInfo  GetFileDetectApiInvokeInfoRequest
     * @return GetFileDetectApiInvokeInfoResponse
     */
    CompletableFuture<GetFileDetectApiInvokeInfoResponse> getFileDetectApiInvokeInfo(GetFileDetectApiInvokeInfoRequest request);

    /**
     * @param request the request parameters of GetFileDetectReport  GetFileDetectReportRequest
     * @return GetFileDetectReportResponse
     */
    CompletableFuture<GetFileDetectReportResponse> getFileDetectReport(GetFileDetectReportRequest request);

    /**
     * <b>description</b> :
     * <p>You can retrieve detection results only for files that have been submitted for detection. Detection results are retained for 5 hours and can be queried repeatedly within this period. To submit files for detection, refer to <a href="~~CreateFileDetect~~">CreateFileDetect</a>.</p>
     * <h3>File unique identifier</h3>
     * <p>All file detection-related operations include the HashKey parameter, which represents the unique identifier of the file being detected and is used to query detection results. Only the MD5 or SHA-256 hash of the complete file content is supported.</p>
     * <h3>Query detection results</h3>
     * <p>You can filter file properties by using the FileLabel field in the Ext extension field. For example, you can combine the encrypted and Zip properties to filter encrypted archives. Supported file labels for compressed file types: Zip, RAR, 7-Zip, XAR, ZLib, GZip, and tar. You can use the Highlight field in the Ext extension field to locate malicious code segments in web shell files. The Highlight field is a list type. Each element in the list corresponds to a code range, and the numbers represent the offset in characters from the beginning of the file.
     * Before querying file detection results, complete the following steps in order:</p>
     * <ol>
     * <li>Call <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> to obtain OSS upload parameters.</li>
     * <li>Use the returned signature information to upload the file to OSS by using a form. For more information about the upload method, see <a href="https://www.alibabacloud.com/help/zh/oss/developer-reference/postobject">OSS PostObject form upload documentation</a>.</li>
     * <li>Call <a href="~~CreateFileDetect~~">CreateFileDetect</a> to submit a file detection task.</li>
     * <li>Call <a href="~~GetFileDetectResult~~">GetFileDetectResult</a> to query the detection result.</li>
     * </ol>
     * 
     * @param request the request parameters of GetFileDetectResult  GetFileDetectResultRequest
     * @return GetFileDetectResultResponse
     */
    CompletableFuture<GetFileDetectResultResponse> getFileDetectResult(GetFileDetectResultRequest request);

    /**
     * @param request the request parameters of GetFileProtectClientEvent  GetFileProtectClientEventRequest
     * @return GetFileProtectClientEventResponse
     */
    CompletableFuture<GetFileProtectClientEventResponse> getFileProtectClientEvent(GetFileProtectClientEventRequest request);

    /**
     * @param request the request parameters of GetFileProtectClientEventDashboard  GetFileProtectClientEventDashboardRequest
     * @return GetFileProtectClientEventDashboardResponse
     */
    CompletableFuture<GetFileProtectClientEventDashboardResponse> getFileProtectClientEventDashboard(GetFileProtectClientEventDashboardRequest request);

    /**
     * @param request the request parameters of GetFileProtectClientRule  GetFileProtectClientRuleRequest
     * @return GetFileProtectClientRuleResponse
     */
    CompletableFuture<GetFileProtectClientRuleResponse> getFileProtectClientRule(GetFileProtectClientRuleRequest request);

    /**
     * @param request the request parameters of GetFileProtectClientRuleDashboard  GetFileProtectClientRuleDashboardRequest
     * @return GetFileProtectClientRuleDashboardResponse
     */
    CompletableFuture<GetFileProtectClientRuleDashboardResponse> getFileProtectClientRuleDashboard(GetFileProtectClientRuleDashboardRequest request);

    /**
     * @param request the request parameters of GetFileProtectDashboard  GetFileProtectDashboardRequest
     * @return GetFileProtectDashboardResponse
     */
    CompletableFuture<GetFileProtectDashboardResponse> getFileProtectDashboard(GetFileProtectDashboardRequest request);

    /**
     * @param request the request parameters of GetFileProtectEvent  GetFileProtectEventRequest
     * @return GetFileProtectEventResponse
     */
    CompletableFuture<GetFileProtectEventResponse> getFileProtectEvent(GetFileProtectEventRequest request);

    /**
     * @param request the request parameters of GetFileProtectEventCount  GetFileProtectEventCountRequest
     * @return GetFileProtectEventCountResponse
     */
    CompletableFuture<GetFileProtectEventCountResponse> getFileProtectEventCount(GetFileProtectEventCountRequest request);

    /**
     * @param request the request parameters of GetFileProtectRule  GetFileProtectRuleRequest
     * @return GetFileProtectRuleResponse
     */
    CompletableFuture<GetFileProtectRuleResponse> getFileProtectRule(GetFileProtectRuleRequest request);

    /**
     * @param request the request parameters of GetFileUploadLimit  GetFileUploadLimitRequest
     * @return GetFileUploadLimitResponse
     */
    CompletableFuture<GetFileUploadLimitResponse> getFileUploadLimit(GetFileUploadLimitRequest request);

    /**
     * @param request the request parameters of GetFunctionTrialStatus  GetFunctionTrialStatusRequest
     * @return GetFunctionTrialStatusResponse
     */
    CompletableFuture<GetFunctionTrialStatusResponse> getFunctionTrialStatus(GetFunctionTrialStatusRequest request);

    /**
     * @param request the request parameters of GetHoneyPotUploadPolicyInfo  GetHoneyPotUploadPolicyInfoRequest
     * @return GetHoneyPotUploadPolicyInfoResponse
     */
    CompletableFuture<GetHoneyPotUploadPolicyInfoResponse> getHoneyPotUploadPolicyInfo(GetHoneyPotUploadPolicyInfoRequest request);

    /**
     * @param request the request parameters of GetHoneypotAttackStatistics  GetHoneypotAttackStatisticsRequest
     * @return GetHoneypotAttackStatisticsResponse
     */
    CompletableFuture<GetHoneypotAttackStatisticsResponse> getHoneypotAttackStatistics(GetHoneypotAttackStatisticsRequest request);

    /**
     * @param request the request parameters of GetHoneypotEventTrend  GetHoneypotEventTrendRequest
     * @return GetHoneypotEventTrendResponse
     */
    CompletableFuture<GetHoneypotEventTrendResponse> getHoneypotEventTrend(GetHoneypotEventTrendRequest request);

    /**
     * @param request the request parameters of GetHoneypotNode  GetHoneypotNodeRequest
     * @return GetHoneypotNodeResponse
     */
    CompletableFuture<GetHoneypotNodeResponse> getHoneypotNode(GetHoneypotNodeRequest request);

    /**
     * @param request the request parameters of GetHoneypotNodeMetricList  GetHoneypotNodeMetricListRequest
     * @return GetHoneypotNodeMetricListResponse
     */
    CompletableFuture<GetHoneypotNodeMetricListResponse> getHoneypotNodeMetricList(GetHoneypotNodeMetricListRequest request);

    /**
     * @param request the request parameters of GetHoneypotPreset  GetHoneypotPresetRequest
     * @return GetHoneypotPresetResponse
     */
    CompletableFuture<GetHoneypotPresetResponse> getHoneypotPreset(GetHoneypotPresetRequest request);

    /**
     * @param request the request parameters of GetHoneypotProbe  GetHoneypotProbeRequest
     * @return GetHoneypotProbeResponse
     */
    CompletableFuture<GetHoneypotProbeResponse> getHoneypotProbe(GetHoneypotProbeRequest request);

    /**
     * @param request the request parameters of GetHoneypotStatistics  GetHoneypotStatisticsRequest
     * @return GetHoneypotStatisticsResponse
     */
    CompletableFuture<GetHoneypotStatisticsResponse> getHoneypotStatistics(GetHoneypotStatisticsRequest request);

    /**
     * @param request the request parameters of GetImageEventOperation  GetImageEventOperationRequest
     * @return GetImageEventOperationResponse
     */
    CompletableFuture<GetImageEventOperationResponse> getImageEventOperation(GetImageEventOperationRequest request);

    /**
     * @param request the request parameters of GetImageScanNumInPeriod  GetImageScanNumInPeriodRequest
     * @return GetImageScanNumInPeriodResponse
     */
    CompletableFuture<GetImageScanNumInPeriodResponse> getImageScanNumInPeriod(GetImageScanNumInPeriodRequest request);

    /**
     * @param request the request parameters of GetInstallCodeForUuid  GetInstallCodeForUuidRequest
     * @return GetInstallCodeForUuidResponse
     */
    CompletableFuture<GetInstallCodeForUuidResponse> getInstallCodeForUuid(GetInstallCodeForUuidRequest request);

    /**
     * @param request the request parameters of GetInstanceAlarmStatistics  GetInstanceAlarmStatisticsRequest
     * @return GetInstanceAlarmStatisticsResponse
     */
    CompletableFuture<GetInstanceAlarmStatisticsResponse> getInstanceAlarmStatistics(GetInstanceAlarmStatisticsRequest request);

    /**
     * @param request the request parameters of GetInstanceAuthRange  GetInstanceAuthRangeRequest
     * @return GetInstanceAuthRangeResponse
     */
    CompletableFuture<GetInstanceAuthRangeResponse> getInstanceAuthRange(GetInstanceAuthRangeRequest request);

    /**
     * @param request the request parameters of GetInterceptionRuleDetail  GetInterceptionRuleDetailRequest
     * @return GetInterceptionRuleDetailResponse
     */
    CompletableFuture<GetInterceptionRuleDetailResponse> getInterceptionRuleDetail(GetInterceptionRuleDetailRequest request);

    /**
     * @param request the request parameters of GetInterceptionSummary  GetInterceptionSummaryRequest
     * @return GetInterceptionSummaryResponse
     */
    CompletableFuture<GetInterceptionSummaryResponse> getInterceptionSummary(GetInterceptionSummaryRequest request);

    /**
     * @param request the request parameters of GetInterceptionTargetDetail  GetInterceptionTargetDetailRequest
     * @return GetInterceptionTargetDetailResponse
     */
    CompletableFuture<GetInterceptionTargetDetailResponse> getInterceptionTargetDetail(GetInterceptionTargetDetailRequest request);

    /**
     * @param request the request parameters of GetLastOnceTaskInfo  GetLastOnceTaskInfoRequest
     * @return GetLastOnceTaskInfoResponse
     */
    CompletableFuture<GetLastOnceTaskInfoResponse> getLastOnceTaskInfo(GetLastOnceTaskInfoRequest request);

    /**
     * @param request the request parameters of GetLocalDefaultRegion  GetLocalDefaultRegionRequest
     * @return GetLocalDefaultRegionResponse
     */
    CompletableFuture<GetLocalDefaultRegionResponse> getLocalDefaultRegion(GetLocalDefaultRegionRequest request);

    /**
     * @param request the request parameters of GetLogMeta  GetLogMetaRequest
     * @return GetLogMetaResponse
     */
    CompletableFuture<GetLogMetaResponse> getLogMeta(GetLogMetaRequest request);

    /**
     * @param request the request parameters of GetMaliciousFileWhitelistConfig  GetMaliciousFileWhitelistConfigRequest
     * @return GetMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<GetMaliciousFileWhitelistConfigResponse> getMaliciousFileWhitelistConfig(GetMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of GetModuleConfig  GetModuleConfigRequest
     * @return GetModuleConfigResponse
     */
    CompletableFuture<GetModuleConfigResponse> getModuleConfig(GetModuleConfigRequest request);

    /**
     * @param request the request parameters of GetModuleConfigStatus  GetModuleConfigStatusRequest
     * @return GetModuleConfigStatusResponse
     */
    CompletableFuture<GetModuleConfigStatusResponse> getModuleConfigStatus(GetModuleConfigStatusRequest request);

    /**
     * @param request the request parameters of GetModuleTrialAuthInfo  GetModuleTrialAuthInfoRequest
     * @return GetModuleTrialAuthInfoResponse
     */
    CompletableFuture<GetModuleTrialAuthInfoResponse> getModuleTrialAuthInfo(GetModuleTrialAuthInfoRequest request);

    /**
     * @param request the request parameters of GetObjectScanEvent  GetObjectScanEventRequest
     * @return GetObjectScanEventResponse
     */
    CompletableFuture<GetObjectScanEventResponse> getObjectScanEvent(GetObjectScanEventRequest request);

    /**
     * @param request the request parameters of GetOnceTaskResultInfo  GetOnceTaskResultInfoRequest
     * @return GetOnceTaskResultInfoResponse
     */
    CompletableFuture<GetOnceTaskResultInfoResponse> getOnceTaskResultInfo(GetOnceTaskResultInfoRequest request);

    /**
     * @param request the request parameters of GetOpaClusterBaseLineList  GetOpaClusterBaseLineListRequest
     * @return GetOpaClusterBaseLineListResponse
     */
    CompletableFuture<GetOpaClusterBaseLineListResponse> getOpaClusterBaseLineList(GetOpaClusterBaseLineListRequest request);

    /**
     * @param request the request parameters of GetOpaClusterImageList  GetOpaClusterImageListRequest
     * @return GetOpaClusterImageListResponse
     */
    CompletableFuture<GetOpaClusterImageListResponse> getOpaClusterImageList(GetOpaClusterImageListRequest request);

    /**
     * @param request the request parameters of GetOpaClusterLabelList  GetOpaClusterLabelListRequest
     * @return GetOpaClusterLabelListResponse
     */
    CompletableFuture<GetOpaClusterLabelListResponse> getOpaClusterLabelList(GetOpaClusterLabelListRequest request);

    /**
     * @param request the request parameters of GetOpaClusterNamespaceList  GetOpaClusterNamespaceListRequest
     * @return GetOpaClusterNamespaceListResponse
     */
    CompletableFuture<GetOpaClusterNamespaceListResponse> getOpaClusterNamespaceList(GetOpaClusterNamespaceListRequest request);

    /**
     * @param request the request parameters of GetOpaPluginStatus  GetOpaPluginStatusRequest
     * @return GetOpaPluginStatusResponse
     */
    CompletableFuture<GetOpaPluginStatusResponse> getOpaPluginStatus(GetOpaPluginStatusRequest request);

    /**
     * @param request the request parameters of GetOpaStrategyDetailNew  GetOpaStrategyDetailNewRequest
     * @return GetOpaStrategyDetailNewResponse
     */
    CompletableFuture<GetOpaStrategyDetailNewResponse> getOpaStrategyDetailNew(GetOpaStrategyDetailNewRequest request);

    /**
     * @param request the request parameters of GetOpaStrategyTemplateSummary  GetOpaStrategyTemplateSummaryRequest
     * @return GetOpaStrategyTemplateSummaryResponse
     */
    CompletableFuture<GetOpaStrategyTemplateSummaryResponse> getOpaStrategyTemplateSummary(GetOpaStrategyTemplateSummaryRequest request);

    /**
     * @param request the request parameters of GetOssBucketScanStatistic  GetOssBucketScanStatisticRequest
     * @return GetOssBucketScanStatisticResponse
     */
    CompletableFuture<GetOssBucketScanStatisticResponse> getOssBucketScanStatistic(GetOssBucketScanStatisticRequest request);

    /**
     * @param request the request parameters of GetOssScanConfig  GetOssScanConfigRequest
     * @return GetOssScanConfigResponse
     */
    CompletableFuture<GetOssScanConfigResponse> getOssScanConfig(GetOssScanConfigRequest request);

    /**
     * @param request the request parameters of GetPropertyScheduleConfig  GetPropertyScheduleConfigRequest
     * @return GetPropertyScheduleConfigResponse
     */
    CompletableFuture<GetPropertyScheduleConfigResponse> getPropertyScheduleConfig(GetPropertyScheduleConfigRequest request);

    /**
     * @param request the request parameters of GetPublishCron  GetPublishCronRequest
     * @return GetPublishCronResponse
     */
    CompletableFuture<GetPublishCronResponse> getPublishCron(GetPublishCronRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using the management account of the resource directory or the delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of GetRdTree  GetRdTreeRequest
     * @return GetRdTreeResponse
     */
    CompletableFuture<GetRdTreeResponse> getRdTree(GetRdTreeRequest request);

    /**
     * @param request the request parameters of GetRegistryScanDayNum  GetRegistryScanDayNumRequest
     * @return GetRegistryScanDayNumResponse
     */
    CompletableFuture<GetRegistryScanDayNumResponse> getRegistryScanDayNum(GetRegistryScanDayNumRequest request);

    /**
     * @param request the request parameters of GetRulesCount  GetRulesCountRequest
     * @return GetRulesCountResponse
     */
    CompletableFuture<GetRulesCountResponse> getRulesCount(GetRulesCountRequest request);

    /**
     * @param request the request parameters of GetSasContainerWebDefenseRule  GetSasContainerWebDefenseRuleRequest
     * @return GetSasContainerWebDefenseRuleResponse
     */
    CompletableFuture<GetSasContainerWebDefenseRuleResponse> getSasContainerWebDefenseRule(GetSasContainerWebDefenseRuleRequest request);

    /**
     * @param request the request parameters of GetSasContainerWebDefenseRuleApplication  GetSasContainerWebDefenseRuleApplicationRequest
     * @return GetSasContainerWebDefenseRuleApplicationResponse
     */
    CompletableFuture<GetSasContainerWebDefenseRuleApplicationResponse> getSasContainerWebDefenseRuleApplication(GetSasContainerWebDefenseRuleApplicationRequest request);

    /**
     * @param request the request parameters of GetSasContainerWebDefenseRuleCriteria  GetSasContainerWebDefenseRuleCriteriaRequest
     * @return GetSasContainerWebDefenseRuleCriteriaResponse
     */
    CompletableFuture<GetSasContainerWebDefenseRuleCriteriaResponse> getSasContainerWebDefenseRuleCriteria(GetSasContainerWebDefenseRuleCriteriaRequest request);

    /**
     * @param request the request parameters of GetSecurityScoreRule  GetSecurityScoreRuleRequest
     * @return GetSecurityScoreRuleResponse
     */
    CompletableFuture<GetSecurityScoreRuleResponse> getSecurityScoreRule(GetSecurityScoreRuleRequest request);

    /**
     * @param request the request parameters of GetSensitiveDefineRuleConfig  GetSensitiveDefineRuleConfigRequest
     * @return GetSensitiveDefineRuleConfigResponse
     */
    CompletableFuture<GetSensitiveDefineRuleConfigResponse> getSensitiveDefineRuleConfig(GetSensitiveDefineRuleConfigRequest request);

    /**
     * @param request the request parameters of GetServerlessAppAuthDetail  GetServerlessAppAuthDetailRequest
     * @return GetServerlessAppAuthDetailResponse
     */
    CompletableFuture<GetServerlessAppAuthDetailResponse> getServerlessAppAuthDetail(GetServerlessAppAuthDetailRequest request);

    /**
     * @param request the request parameters of GetServerlessAuthSummary  GetServerlessAuthSummaryRequest
     * @return GetServerlessAuthSummaryResponse
     */
    CompletableFuture<GetServerlessAuthSummaryResponse> getServerlessAuthSummary(GetServerlessAuthSummaryRequest request);

    /**
     * @param request the request parameters of GetServiceTrail  GetServiceTrailRequest
     * @return GetServiceTrailResponse
     */
    CompletableFuture<GetServiceTrailResponse> getServiceTrail(GetServiceTrailRequest request);

    /**
     * @param request the request parameters of GetStrategyTemplateDetail  GetStrategyTemplateDetailRequest
     * @return GetStrategyTemplateDetailResponse
     */
    CompletableFuture<GetStrategyTemplateDetailResponse> getStrategyTemplateDetail(GetStrategyTemplateDetailRequest request);

    /**
     * @param request the request parameters of GetSupportedModules  GetSupportedModulesRequest
     * @return GetSupportedModulesResponse
     */
    CompletableFuture<GetSupportedModulesResponse> getSupportedModules(GetSupportedModulesRequest request);

    /**
     * @param request the request parameters of GetSuspiciousStatistics  GetSuspiciousStatisticsRequest
     * @return GetSuspiciousStatisticsResponse
     */
    CompletableFuture<GetSuspiciousStatisticsResponse> getSuspiciousStatistics(GetSuspiciousStatisticsRequest request);

    /**
     * @param request the request parameters of GetSwitchRegionDetail  GetSwitchRegionDetailRequest
     * @return GetSwitchRegionDetailResponse
     */
    CompletableFuture<GetSwitchRegionDetailResponse> getSwitchRegionDetail(GetSwitchRegionDetailRequest request);

    /**
     * @param request the request parameters of GetTenantCheckAvailable  GetTenantCheckAvailableRequest
     * @return GetTenantCheckAvailableResponse
     */
    CompletableFuture<GetTenantCheckAvailableResponse> getTenantCheckAvailable(GetTenantCheckAvailableRequest request);

    /**
     * @param request the request parameters of GetUnknownThreatDetectStatistic  GetUnknownThreatDetectStatisticRequest
     * @return GetUnknownThreatDetectStatisticResponse
     */
    CompletableFuture<GetUnknownThreatDetectStatisticResponse> getUnknownThreatDetectStatistic(GetUnknownThreatDetectStatisticRequest request);

    /**
     * @param request the request parameters of GetUserLang  GetUserLangRequest
     * @return GetUserLangResponse
     */
    CompletableFuture<GetUserLangResponse> getUserLang(GetUserLangRequest request);

    /**
     * @param request the request parameters of GetValidDeductInstances  GetValidDeductInstancesRequest
     * @return GetValidDeductInstancesResponse
     */
    CompletableFuture<GetValidDeductInstancesResponse> getValidDeductInstances(GetValidDeductInstancesRequest request);

    /**
     * @param request the request parameters of GetVirusScanConfig  GetVirusScanConfigRequest
     * @return GetVirusScanConfigResponse
     */
    CompletableFuture<GetVirusScanConfigResponse> getVirusScanConfig(GetVirusScanConfigRequest request);

    /**
     * @param request the request parameters of GetVirusScanLatestTaskStatistic  GetVirusScanLatestTaskStatisticRequest
     * @return GetVirusScanLatestTaskStatisticResponse
     */
    CompletableFuture<GetVirusScanLatestTaskStatisticResponse> getVirusScanLatestTaskStatistic(GetVirusScanLatestTaskStatisticRequest request);

    /**
     * @param request the request parameters of GetVulStatistics  GetVulStatisticsRequest
     * @return GetVulStatisticsResponse
     */
    CompletableFuture<GetVulStatisticsResponse> getVulStatistics(GetVulStatisticsRequest request);

    /**
     * @param request the request parameters of GetVulWhitelist  GetVulWhitelistRequest
     * @return GetVulWhitelistResponse
     */
    CompletableFuture<GetVulWhitelistResponse> getVulWhitelist(GetVulWhitelistRequest request);

    /**
     * @param request the request parameters of GrantSwitchAgreement  GrantSwitchAgreementRequest
     * @return GrantSwitchAgreementResponse
     */
    CompletableFuture<GrantSwitchAgreementResponse> grantSwitchAgreement(GrantSwitchAgreementRequest request);

    /**
     * @param request the request parameters of HandleMaliciousFiles  HandleMaliciousFilesRequest
     * @return HandleMaliciousFilesResponse
     */
    CompletableFuture<HandleMaliciousFilesResponse> handleMaliciousFiles(HandleMaliciousFilesRequest request);

    /**
     * @param request the request parameters of HandleObjectScanEvent  HandleObjectScanEventRequest
     * @return HandleObjectScanEventResponse
     */
    CompletableFuture<HandleObjectScanEventResponse> handleObjectScanEvent(HandleObjectScanEventRequest request);

    /**
     * @param request the request parameters of HandleSecurityEvents  HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    /**
     * <b>description</b> :
     * <p>***.</p>
     * 
     * @param request the request parameters of HandleSimilarMaliciousFiles  HandleSimilarMaliciousFilesRequest
     * @return HandleSimilarMaliciousFilesResponse
     */
    CompletableFuture<HandleSimilarMaliciousFilesResponse> handleSimilarMaliciousFiles(HandleSimilarMaliciousFilesRequest request);

    /**
     * <b>description</b> :
     * <p>Before processing, call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to check the CanBeDealOnLine and EventStatus fields of the events. An event can be processed only when CanBeDealOnLine is true. If CanBeDealOnLine is false or EventStatus is 64, the event has expired and cannot be processed by this operation. <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> returns an empty array for expired events.</p>
     * 
     * @param request the request parameters of HandleSimilarSecurityEvents  HandleSimilarSecurityEventsRequest
     * @return HandleSimilarSecurityEventsResponse
     */
    CompletableFuture<HandleSimilarSecurityEventsResponse> handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request);

    /**
     * @param request the request parameters of HandleUnknownThreatDetectEvent  HandleUnknownThreatDetectEventRequest
     * @return HandleUnknownThreatDetectEventResponse
     */
    CompletableFuture<HandleUnknownThreatDetectEventResponse> handleUnknownThreatDetectEvent(HandleUnknownThreatDetectEventRequest request);

    /**
     * @param request the request parameters of IgnoreCheckItems  IgnoreCheckItemsRequest
     * @return IgnoreCheckItemsResponse
     */
    CompletableFuture<IgnoreCheckItemsResponse> ignoreCheckItems(IgnoreCheckItemsRequest request);

    /**
     * @deprecated OpenAPI IgnoreHcCheckWarnings is deprecated, please use Sas::2018-12-03::IgnoreCheckItems instead.  * @param request  the request parameters of IgnoreHcCheckWarnings  IgnoreHcCheckWarningsRequest
     * @return IgnoreHcCheckWarningsResponse
     */
    @Deprecated
    CompletableFuture<IgnoreHcCheckWarningsResponse> ignoreHcCheckWarnings(IgnoreHcCheckWarningsRequest request);

    /**
     * @param request the request parameters of IgnoreIdcProbeScanResult  IgnoreIdcProbeScanResultRequest
     * @return IgnoreIdcProbeScanResultResponse
     */
    CompletableFuture<IgnoreIdcProbeScanResultResponse> ignoreIdcProbeScanResult(IgnoreIdcProbeScanResultRequest request);

    /**
     * @param request the request parameters of InstallAegisForLingjun  InstallAegisForLingjunRequest
     * @return InstallAegisForLingjunResponse
     */
    CompletableFuture<InstallAegisForLingjunResponse> installAegisForLingjun(InstallAegisForLingjunRequest request);

    /**
     * @param request the request parameters of InstallBackupClient  InstallBackupClientRequest
     * @return InstallBackupClientResponse
     */
    CompletableFuture<InstallBackupClientResponse> installBackupClient(InstallBackupClientRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before installation, make sure that the Security Center client on your server is online and that your server can access Alibaba Cloud services over the network.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InstallCloudMonitor  InstallCloudMonitorRequest
     * @return InstallCloudMonitorResponse
     */
    CompletableFuture<InstallCloudMonitorResponse> installCloudMonitor(InstallCloudMonitorRequest request);

    /**
     * @param request the request parameters of InstallHybridProxy  InstallHybridProxyRequest
     * @return InstallHybridProxyResponse
     */
    CompletableFuture<InstallHybridProxyResponse> installHybridProxy(InstallHybridProxyRequest request);

    /**
     * @param request the request parameters of InstallPmAgent  InstallPmAgentRequest
     * @return InstallPmAgentResponse
     */
    CompletableFuture<InstallPmAgentResponse> installPmAgent(InstallPmAgentRequest request);

    /**
     * @param request the request parameters of InstallUniBackupAgent  InstallUniBackupAgentRequest
     * @return InstallUniBackupAgentResponse
     */
    CompletableFuture<InstallUniBackupAgentResponse> installUniBackupAgent(InstallUniBackupAgentRequest request);

    /**
     * @param request the request parameters of JoinWebLockProcessWhiteList  JoinWebLockProcessWhiteListRequest
     * @return JoinWebLockProcessWhiteListResponse
     */
    CompletableFuture<JoinWebLockProcessWhiteListResponse> joinWebLockProcessWhiteList(JoinWebLockProcessWhiteListRequest request);

    /**
     * <b>description</b> :
     * <p>Appelez cette opération à l\&quot;aide du compte de gestion du répertoire de ressources ou du compte administrateur délégué de Security Center.</p>
     * 
     * @param request the request parameters of ListAccountsInResourceDirectory  ListAccountsInResourceDirectoryRequest
     * @return ListAccountsInResourceDirectoryResponse
     */
    CompletableFuture<ListAccountsInResourceDirectoryResponse> listAccountsInResourceDirectory(ListAccountsInResourceDirectoryRequest request);

    /**
     * @param request the request parameters of ListAegisContainerPluginRule  ListAegisContainerPluginRuleRequest
     * @return ListAegisContainerPluginRuleResponse
     */
    CompletableFuture<ListAegisContainerPluginRuleResponse> listAegisContainerPluginRule(ListAegisContainerPluginRuleRequest request);

    /**
     * @param request the request parameters of ListAegisForLingjunStatus  ListAegisForLingjunStatusRequest
     * @return ListAegisForLingjunStatusResponse
     */
    CompletableFuture<ListAegisForLingjunStatusResponse> listAegisForLingjunStatus(ListAegisForLingjunStatusRequest request);

    /**
     * @param request the request parameters of ListAgentlessAsset  ListAgentlessAssetRequest
     * @return ListAgentlessAssetResponse
     */
    CompletableFuture<ListAgentlessAssetResponse> listAgentlessAsset(ListAgentlessAssetRequest request);

    /**
     * @param request the request parameters of ListAgentlessMaliciousFiles  ListAgentlessMaliciousFilesRequest
     * @return ListAgentlessMaliciousFilesResponse
     */
    CompletableFuture<ListAgentlessMaliciousFilesResponse> listAgentlessMaliciousFiles(ListAgentlessMaliciousFilesRequest request);

    /**
     * @param request the request parameters of ListAgentlessRegion  ListAgentlessRegionRequest
     * @return ListAgentlessRegionResponse
     */
    CompletableFuture<ListAgentlessRegionResponse> listAgentlessRegion(ListAgentlessRegionRequest request);

    /**
     * @param request the request parameters of ListAgentlessRelateMalicious  ListAgentlessRelateMaliciousRequest
     * @return ListAgentlessRelateMaliciousResponse
     */
    CompletableFuture<ListAgentlessRelateMaliciousResponse> listAgentlessRelateMalicious(ListAgentlessRelateMaliciousRequest request);

    /**
     * @param request the request parameters of ListAgentlessRiskUuid  ListAgentlessRiskUuidRequest
     * @return ListAgentlessRiskUuidResponse
     */
    CompletableFuture<ListAgentlessRiskUuidResponse> listAgentlessRiskUuid(ListAgentlessRiskUuidRequest request);

    /**
     * @param request the request parameters of ListAgentlessTask  ListAgentlessTaskRequest
     * @return ListAgentlessTaskResponse
     */
    CompletableFuture<ListAgentlessTaskResponse> listAgentlessTask(ListAgentlessTaskRequest request);

    /**
     * @param request the request parameters of ListAssetCleanConfig  ListAssetCleanConfigRequest
     * @return ListAssetCleanConfigResponse
     */
    CompletableFuture<ListAssetCleanConfigResponse> listAssetCleanConfig(ListAssetCleanConfigRequest request);

    /**
     * @param request the request parameters of ListAssetInfoPublish  ListAssetInfoPublishRequest
     * @return ListAssetInfoPublishResponse
     */
    CompletableFuture<ListAssetInfoPublishResponse> listAssetInfoPublish(ListAssetInfoPublishRequest request);

    /**
     * @param request the request parameters of ListAssetRefreshTaskConfig  ListAssetRefreshTaskConfigRequest
     * @return ListAssetRefreshTaskConfigResponse
     */
    CompletableFuture<ListAssetRefreshTaskConfigResponse> listAssetRefreshTaskConfig(ListAssetRefreshTaskConfigRequest request);

    /**
     * @param request the request parameters of ListAssetSelectionSelectedTarget  ListAssetSelectionSelectedTargetRequest
     * @return ListAssetSelectionSelectedTargetResponse
     */
    CompletableFuture<ListAssetSelectionSelectedTargetResponse> listAssetSelectionSelectedTarget(ListAssetSelectionSelectedTargetRequest request);

    /**
     * @param request the request parameters of ListAssetSelectionTarget  ListAssetSelectionTargetRequest
     * @return ListAssetSelectionTargetResponse
     */
    CompletableFuture<ListAssetSelectionTargetResponse> listAssetSelectionTarget(ListAssetSelectionTargetRequest request);

    /**
     * @param request the request parameters of ListAttackEventInfo  ListAttackEventInfoRequest
     * @return ListAttackEventInfoResponse
     */
    CompletableFuture<ListAttackEventInfoResponse> listAttackEventInfo(ListAttackEventInfoRequest request);

    /**
     * @param request the request parameters of ListAttackPathEvent  ListAttackPathEventRequest
     * @return ListAttackPathEventResponse
     */
    CompletableFuture<ListAttackPathEventResponse> listAttackPathEvent(ListAttackPathEventRequest request);

    /**
     * @param request the request parameters of ListAttackPathWhitelist  ListAttackPathWhitelistRequest
     * @return ListAttackPathWhitelistResponse
     */
    CompletableFuture<ListAttackPathWhitelistResponse> listAttackPathWhitelist(ListAttackPathWhitelistRequest request);

    /**
     * @param request the request parameters of ListAutoTagRules  ListAutoTagRulesRequest
     * @return ListAutoTagRulesResponse
     */
    CompletableFuture<ListAutoTagRulesResponse> listAutoTagRules(ListAutoTagRulesRequest request);

    /**
     * @param request the request parameters of ListAvailableAttackPath  ListAvailableAttackPathRequest
     * @return ListAvailableAttackPathResponse
     */
    CompletableFuture<ListAvailableAttackPathResponse> listAvailableAttackPath(ListAvailableAttackPathRequest request);

    /**
     * @param request the request parameters of ListAvailableHoneypot  ListAvailableHoneypotRequest
     * @return ListAvailableHoneypotResponse
     */
    CompletableFuture<ListAvailableHoneypotResponse> listAvailableHoneypot(ListAvailableHoneypotRequest request);

    /**
     * @param request the request parameters of ListBackupRecord  ListBackupRecordRequest
     * @return ListBackupRecordResponse
     */
    CompletableFuture<ListBackupRecordResponse> listBackupRecord(ListBackupRecordRequest request);

    /**
     * @param request the request parameters of ListBaselineCheckWhiteRecord  ListBaselineCheckWhiteRecordRequest
     * @return ListBaselineCheckWhiteRecordResponse
     */
    CompletableFuture<ListBaselineCheckWhiteRecordResponse> listBaselineCheckWhiteRecord(ListBaselineCheckWhiteRecordRequest request);

    /**
     * @param request the request parameters of ListCheckInstanceResult  ListCheckInstanceResultRequest
     * @return ListCheckInstanceResultResponse
     */
    CompletableFuture<ListCheckInstanceResultResponse> listCheckInstanceResult(ListCheckInstanceResultRequest request);

    /**
     * @param request the request parameters of ListCheckItem  ListCheckItemRequest
     * @return ListCheckItemResponse
     */
    CompletableFuture<ListCheckItemResponse> listCheckItem(ListCheckItemRequest request);

    /**
     * @param request the request parameters of ListCheckItemWarningMachine  ListCheckItemWarningMachineRequest
     * @return ListCheckItemWarningMachineResponse
     */
    CompletableFuture<ListCheckItemWarningMachineResponse> listCheckItemWarningMachine(ListCheckItemWarningMachineRequest request);

    /**
     * @param request the request parameters of ListCheckItemWarningSummary  ListCheckItemWarningSummaryRequest
     * @return ListCheckItemWarningSummaryResponse
     */
    CompletableFuture<ListCheckItemWarningSummaryResponse> listCheckItemWarningSummary(ListCheckItemWarningSummaryRequest request);

    /**
     * @param request the request parameters of ListCheckItems  ListCheckItemsRequest
     * @return ListCheckItemsResponse
     */
    CompletableFuture<ListCheckItemsResponse> listCheckItems(ListCheckItemsRequest request);

    /**
     * @param request the request parameters of ListCheckPolicies  ListCheckPoliciesRequest
     * @return ListCheckPoliciesResponse
     */
    CompletableFuture<ListCheckPoliciesResponse> listCheckPolicies(ListCheckPoliciesRequest request);

    /**
     * @param request the request parameters of ListCheckResult  ListCheckResultRequest
     * @return ListCheckResultResponse
     */
    CompletableFuture<ListCheckResultResponse> listCheckResult(ListCheckResultRequest request);

    /**
     * @param request the request parameters of ListCheckRule  ListCheckRuleRequest
     * @return ListCheckRuleResponse
     */
    CompletableFuture<ListCheckRuleResponse> listCheckRule(ListCheckRuleRequest request);

    /**
     * @param request the request parameters of ListCheckRuleInstance  ListCheckRuleInstanceRequest
     * @return ListCheckRuleInstanceResponse
     */
    CompletableFuture<ListCheckRuleInstanceResponse> listCheckRuleInstance(ListCheckRuleInstanceRequest request);

    /**
     * @param request the request parameters of ListCheckStandard  ListCheckStandardRequest
     * @return ListCheckStandardResponse
     */
    CompletableFuture<ListCheckStandardResponse> listCheckStandard(ListCheckStandardRequest request);

    /**
     * @param request the request parameters of ListCheckTypes  ListCheckTypesRequest
     * @return ListCheckTypesResponse
     */
    CompletableFuture<ListCheckTypesResponse> listCheckTypes(ListCheckTypesRequest request);

    /**
     * @param request the request parameters of ListClientAlertMode  ListClientAlertModeRequest
     * @return ListClientAlertModeResponse
     */
    CompletableFuture<ListClientAlertModeResponse> listClientAlertMode(ListClientAlertModeRequest request);

    /**
     * @param request the request parameters of ListClientUserDefineRuleTypes  ListClientUserDefineRuleTypesRequest
     * @return ListClientUserDefineRuleTypesResponse
     */
    CompletableFuture<ListClientUserDefineRuleTypesResponse> listClientUserDefineRuleTypes(ListClientUserDefineRuleTypesRequest request);

    /**
     * @param request the request parameters of ListClientUserDefineRules  ListClientUserDefineRulesRequest
     * @return ListClientUserDefineRulesResponse
     */
    CompletableFuture<ListClientUserDefineRulesResponse> listClientUserDefineRules(ListClientUserDefineRulesRequest request);

    /**
     * @param request the request parameters of ListCloudAssetInstances  ListCloudAssetInstancesRequest
     * @return ListCloudAssetInstancesResponse
     */
    CompletableFuture<ListCloudAssetInstancesResponse> listCloudAssetInstances(ListCloudAssetInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Gets the list of cloud asset data operators.</p>
     * 
     * @param request the request parameters of ListCloudAssetMatchOperators  ListCloudAssetMatchOperatorsRequest
     * @return ListCloudAssetMatchOperatorsResponse
     */
    CompletableFuture<ListCloudAssetMatchOperatorsResponse> listCloudAssetMatchOperators(ListCloudAssetMatchOperatorsRequest request);

    /**
     * @param request the request parameters of ListCloudAssetSchemas  ListCloudAssetSchemasRequest
     * @return ListCloudAssetSchemasResponse
     */
    CompletableFuture<ListCloudAssetSchemasResponse> listCloudAssetSchemas(ListCloudAssetSchemasRequest request);

    /**
     * @param request the request parameters of ListCloudVendorRegions  ListCloudVendorRegionsRequest
     * @return ListCloudVendorRegionsResponse
     */
    CompletableFuture<ListCloudVendorRegionsResponse> listCloudVendorRegions(ListCloudVendorRegionsRequest request);

    /**
     * @param request the request parameters of ListClusterCheckResult  ListClusterCheckResultRequest
     * @return ListClusterCheckResultResponse
     */
    CompletableFuture<ListClusterCheckResultResponse> listClusterCheckResult(ListClusterCheckResultRequest request);

    /**
     * @param request the request parameters of ListClusterCnnfStatusDetail  ListClusterCnnfStatusDetailRequest
     * @return ListClusterCnnfStatusDetailResponse
     */
    CompletableFuture<ListClusterCnnfStatusDetailResponse> listClusterCnnfStatusDetail(ListClusterCnnfStatusDetailRequest request);

    /**
     * @param request the request parameters of ListClusterInterceptionConfig  ListClusterInterceptionConfigRequest
     * @return ListClusterInterceptionConfigResponse
     */
    CompletableFuture<ListClusterInterceptionConfigResponse> listClusterInterceptionConfig(ListClusterInterceptionConfigRequest request);

    /**
     * @param request the request parameters of ListClusterPluginInfo  ListClusterPluginInfoRequest
     * @return ListClusterPluginInfoResponse
     */
    CompletableFuture<ListClusterPluginInfoResponse> listClusterPluginInfo(ListClusterPluginInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Only files that have been submitted for detection and identified as compressed archives can be queried through this operation. Detection results are retained for 5 hours and can be queried repeatedly within that period. To submit a file for detection, refer to <a href="~~CreateFileDetect~~">CreateFileDetect</a>. To retrieve the detection result of the compressed archive file itself, refer to <a href="~~GetFileDetectResult~~">GetFileDetectResult</a>.
     * All file detection operations include the HashKey parameter, which represents the unique identifier of a file.
     * In the malicious file detection scenario (Type is 0), only the MD5 or SHA-256 hash of the complete file content is supported. Calculate this value before calling the operation.
     * In the Skill compressed archive detection scenario (Type is 6), obtain the value from the response of the CreateFileDetect operation.
     * Note that the submission and query operations for a single detection must use the same HashKey. Otherwise, the detection cannot be correctly submitted or the results cannot be correctly queried.</p>
     * <h3>Compressed archive detection workflow</h3>
     * <p>To retrieve the detection results of files within a compressed archive, complete the following four steps in order:</p>
     * <ol>
     * <li>Call the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation to obtain a file upload URL.</li>
     * <li>Upload the file to be detected to OSS.</li>
     * <li>Call the <a href="~~CreateFileDetect~~">CreateFileDetect</a> operation to submit the file for detection, and set the Decompress parameter to true.</li>
     * <li>Call this operation (ListCompressFileDetectResult) to query the detection results of files within the compressed archive.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCompressFileDetectResult  ListCompressFileDetectResultRequest
     * @return ListCompressFileDetectResultResponse
     */
    CompletableFuture<ListCompressFileDetectResultResponse> listCompressFileDetectResult(ListCompressFileDetectResultRequest request);

    /**
     * @param request the request parameters of ListContainerDefenseRule  ListContainerDefenseRuleRequest
     * @return ListContainerDefenseRuleResponse
     */
    CompletableFuture<ListContainerDefenseRuleResponse> listContainerDefenseRule(ListContainerDefenseRuleRequest request);

    /**
     * @param request the request parameters of ListContainerDefenseRuleClusters  ListContainerDefenseRuleClustersRequest
     * @return ListContainerDefenseRuleClustersResponse
     */
    CompletableFuture<ListContainerDefenseRuleClustersResponse> listContainerDefenseRuleClusters(ListContainerDefenseRuleClustersRequest request);

    /**
     * @param request the request parameters of ListCriteriaStrategy  ListCriteriaStrategyRequest
     * @return ListCriteriaStrategyResponse
     */
    CompletableFuture<ListCriteriaStrategyResponse> listCriteriaStrategy(ListCriteriaStrategyRequest request);

    /**
     * @param request the request parameters of ListDockerhubImage  ListDockerhubImageRequest
     * @return ListDockerhubImageResponse
     */
    CompletableFuture<ListDockerhubImageResponse> listDockerhubImage(ListDockerhubImageRequest request);

    /**
     * @param request the request parameters of ListFileProtectBindMachine  ListFileProtectBindMachineRequest
     * @return ListFileProtectBindMachineResponse
     */
    CompletableFuture<ListFileProtectBindMachineResponse> listFileProtectBindMachine(ListFileProtectBindMachineRequest request);

    /**
     * @param request the request parameters of ListFileProtectClientEvent  ListFileProtectClientEventRequest
     * @return ListFileProtectClientEventResponse
     */
    CompletableFuture<ListFileProtectClientEventResponse> listFileProtectClientEvent(ListFileProtectClientEventRequest request);

    /**
     * @param request the request parameters of ListFileProtectClientRule  ListFileProtectClientRuleRequest
     * @return ListFileProtectClientRuleResponse
     */
    CompletableFuture<ListFileProtectClientRuleResponse> listFileProtectClientRule(ListFileProtectClientRuleRequest request);

    /**
     * @param request the request parameters of ListFileProtectClientRuleFileType  ListFileProtectClientRuleFileTypeRequest
     * @return ListFileProtectClientRuleFileTypeResponse
     */
    CompletableFuture<ListFileProtectClientRuleFileTypeResponse> listFileProtectClientRuleFileType(ListFileProtectClientRuleFileTypeRequest request);

    /**
     * @param request the request parameters of ListFileProtectEvent  ListFileProtectEventRequest
     * @return ListFileProtectEventResponse
     */
    CompletableFuture<ListFileProtectEventResponse> listFileProtectEvent(ListFileProtectEventRequest request);

    /**
     * @param request the request parameters of ListFileProtectPluginStatus  ListFileProtectPluginStatusRequest
     * @return ListFileProtectPluginStatusResponse
     */
    CompletableFuture<ListFileProtectPluginStatusResponse> listFileProtectPluginStatus(ListFileProtectPluginStatusRequest request);

    /**
     * @param request the request parameters of ListFileProtectRule  ListFileProtectRuleRequest
     * @return ListFileProtectRuleResponse
     */
    CompletableFuture<ListFileProtectRuleResponse> listFileProtectRule(ListFileProtectRuleRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * @param request the request parameters of ListHoneypot  ListHoneypotRequest
     * @return ListHoneypotResponse
     */
    CompletableFuture<ListHoneypotResponse> listHoneypot(ListHoneypotRequest request);

    /**
     * @param request the request parameters of ListHoneypotAlarmEvents  ListHoneypotAlarmEventsRequest
     * @return ListHoneypotAlarmEventsResponse
     */
    CompletableFuture<ListHoneypotAlarmEventsResponse> listHoneypotAlarmEvents(ListHoneypotAlarmEventsRequest request);

    /**
     * @param request the request parameters of ListHoneypotAttackerPortrait  ListHoneypotAttackerPortraitRequest
     * @return ListHoneypotAttackerPortraitResponse
     */
    CompletableFuture<ListHoneypotAttackerPortraitResponse> listHoneypotAttackerPortrait(ListHoneypotAttackerPortraitRequest request);

    /**
     * @param request the request parameters of ListHoneypotAttackerSource  ListHoneypotAttackerSourceRequest
     * @return ListHoneypotAttackerSourceResponse
     */
    CompletableFuture<ListHoneypotAttackerSourceResponse> listHoneypotAttackerSource(ListHoneypotAttackerSourceRequest request);

    /**
     * @param request the request parameters of ListHoneypotEventFlows  ListHoneypotEventFlowsRequest
     * @return ListHoneypotEventFlowsResponse
     */
    CompletableFuture<ListHoneypotEventFlowsResponse> listHoneypotEventFlows(ListHoneypotEventFlowsRequest request);

    /**
     * @param request the request parameters of ListHoneypotEvents  ListHoneypotEventsRequest
     * @return ListHoneypotEventsResponse
     */
    CompletableFuture<ListHoneypotEventsResponse> listHoneypotEvents(ListHoneypotEventsRequest request);

    /**
     * @param request the request parameters of ListHoneypotNode  ListHoneypotNodeRequest
     * @return ListHoneypotNodeResponse
     */
    CompletableFuture<ListHoneypotNodeResponse> listHoneypotNode(ListHoneypotNodeRequest request);

    /**
     * @param request the request parameters of ListHoneypotPreset  ListHoneypotPresetRequest
     * @return ListHoneypotPresetResponse
     */
    CompletableFuture<ListHoneypotPresetResponse> listHoneypotPreset(ListHoneypotPresetRequest request);

    /**
     * @param request the request parameters of ListHoneypotProbe  ListHoneypotProbeRequest
     * @return ListHoneypotProbeResponse
     */
    CompletableFuture<ListHoneypotProbeResponse> listHoneypotProbe(ListHoneypotProbeRequest request);

    /**
     * @param request the request parameters of ListHoneypotProbeUuid  ListHoneypotProbeUuidRequest
     * @return ListHoneypotProbeUuidResponse
     */
    CompletableFuture<ListHoneypotProbeUuidResponse> listHoneypotProbeUuid(ListHoneypotProbeUuidRequest request);

    /**
     * @param request the request parameters of ListImageBuildRiskItem  ListImageBuildRiskItemRequest
     * @return ListImageBuildRiskItemResponse
     */
    CompletableFuture<ListImageBuildRiskItemResponse> listImageBuildRiskItem(ListImageBuildRiskItemRequest request);

    /**
     * @param request the request parameters of ListImageRegistryExtra  ListImageRegistryExtraRequest
     * @return ListImageRegistryExtraResponse
     */
    CompletableFuture<ListImageRegistryExtraResponse> listImageRegistryExtra(ListImageRegistryExtraRequest request);

    /**
     * @param request the request parameters of ListImageRegistryRegion  ListImageRegistryRegionRequest
     * @return ListImageRegistryRegionResponse
     */
    CompletableFuture<ListImageRegistryRegionResponse> listImageRegistryRegion(ListImageRegistryRegionRequest request);

    /**
     * @param request the request parameters of ListImageRisk  ListImageRiskRequest
     * @return ListImageRiskResponse
     */
    CompletableFuture<ListImageRiskResponse> listImageRisk(ListImageRiskRequest request);

    /**
     * @param request the request parameters of ListInstanceCatalog  ListInstanceCatalogRequest
     * @return ListInstanceCatalogResponse
     */
    CompletableFuture<ListInstanceCatalogResponse> listInstanceCatalog(ListInstanceCatalogRequest request);

    /**
     * @param request the request parameters of ListInstanceRiskLevels  ListInstanceRiskLevelsRequest
     * @return ListInstanceRiskLevelsResponse
     */
    CompletableFuture<ListInstanceRiskLevelsResponse> listInstanceRiskLevels(ListInstanceRiskLevelsRequest request);

    /**
     * @param request the request parameters of ListInstanceRiskNum  ListInstanceRiskNumRequest
     * @return ListInstanceRiskNumResponse
     */
    CompletableFuture<ListInstanceRiskNumResponse> listInstanceRiskNum(ListInstanceRiskNumRequest request);

    /**
     * @param request the request parameters of ListInterceptionHistory  ListInterceptionHistoryRequest
     * @return ListInterceptionHistoryResponse
     */
    CompletableFuture<ListInterceptionHistoryResponse> listInterceptionHistory(ListInterceptionHistoryRequest request);

    /**
     * @param request the request parameters of ListInterceptionRulePage  ListInterceptionRulePageRequest
     * @return ListInterceptionRulePageResponse
     */
    CompletableFuture<ListInterceptionRulePageResponse> listInterceptionRulePage(ListInterceptionRulePageRequest request);

    /**
     * @param request the request parameters of ListInterceptionTargetPage  ListInterceptionTargetPageRequest
     * @return ListInterceptionTargetPageResponse
     */
    CompletableFuture<ListInterceptionTargetPageResponse> listInterceptionTargetPage(ListInterceptionTargetPageRequest request);

    /**
     * <b>description</b> :
     * <p>Lists K8s access information.</p>
     * 
     * @param request the request parameters of ListK8sAccessInfo  ListK8sAccessInfoRequest
     * @return ListK8sAccessInfoResponse
     */
    CompletableFuture<ListK8sAccessInfoResponse> listK8sAccessInfo(ListK8sAccessInfoRequest request);

    /**
     * @param request the request parameters of ListKspmInstances  ListKspmInstancesRequest
     * @return ListKspmInstancesResponse
     */
    CompletableFuture<ListKspmInstancesResponse> listKspmInstances(ListKspmInstancesRequest request);

    /**
     * @param request the request parameters of ListLogShipperRegions  ListLogShipperRegionsRequest
     * @return ListLogShipperRegionsResponse
     */
    CompletableFuture<ListLogShipperRegionsResponse> listLogShipperRegions(ListLogShipperRegionsRequest request);

    /**
     * @param request the request parameters of ListMachineApps  ListMachineAppsRequest
     * @return ListMachineAppsResponse
     */
    CompletableFuture<ListMachineAppsResponse> listMachineApps(ListMachineAppsRequest request);

    /**
     * @param request the request parameters of ListMaliciousFileWhitelistConfigs  ListMaliciousFileWhitelistConfigsRequest
     * @return ListMaliciousFileWhitelistConfigsResponse
     */
    CompletableFuture<ListMaliciousFileWhitelistConfigsResponse> listMaliciousFileWhitelistConfigs(ListMaliciousFileWhitelistConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. You can also set logical relationships between different search conditions to search for assets that meet multiple search conditions.</p>
     * 
     * @param request the request parameters of ListMultiUserInstances  ListMultiUserInstancesRequest
     * @return ListMultiUserInstancesResponse
     */
    CompletableFuture<ListMultiUserInstancesResponse> listMultiUserInstances(ListMultiUserInstancesRequest request);

    /**
     * @param request the request parameters of ListObjectScanEvent  ListObjectScanEventRequest
     * @return ListObjectScanEventResponse
     */
    CompletableFuture<ListObjectScanEventResponse> listObjectScanEvent(ListObjectScanEventRequest request);

    /**
     * @param request the request parameters of ListOpaClusterStrategyNew  ListOpaClusterStrategyNewRequest
     * @return ListOpaClusterStrategyNewResponse
     */
    CompletableFuture<ListOpaClusterStrategyNewResponse> listOpaClusterStrategyNew(ListOpaClusterStrategyNewRequest request);

    /**
     * <b>description</b> :
     * <p>Only users who have purchased the cloud platform configuration check quota or enabled pay-as-you-go billing for cloud platform configuration checks can call this operation.</p>
     * 
     * @param request the request parameters of ListOperationCheck  ListOperationCheckRequest
     * @return ListOperationCheckResponse
     */
    CompletableFuture<ListOperationCheckResponse> listOperationCheck(ListOperationCheckRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only check operation task queries are supported.</p>
     * 
     * @param request the request parameters of ListOperationProcess  ListOperationProcessRequest
     * @return ListOperationProcessResponse
     */
    CompletableFuture<ListOperationProcessResponse> listOperationProcess(ListOperationProcessRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only check operation subtask queries are supported. Before calling this operation, call the ListOperationProcess operation to obtain operation tasks. The TaskIds parameter of this operation can be obtained from the ListOperationProcess operation.</p>
     * 
     * @param request the request parameters of ListOperationProcessDetail  ListOperationProcessDetailRequest
     * @return ListOperationProcessDetailResponse
     */
    CompletableFuture<ListOperationProcessDetailResponse> listOperationProcessDetail(ListOperationProcessDetailRequest request);

    /**
     * @param request the request parameters of ListOperationTask  ListOperationTaskRequest
     * @return ListOperationTaskResponse
     */
    CompletableFuture<ListOperationTaskResponse> listOperationTask(ListOperationTaskRequest request);

    /**
     * @param request the request parameters of ListOssBucket  ListOssBucketRequest
     * @return ListOssBucketResponse
     */
    CompletableFuture<ListOssBucketResponse> listOssBucket(ListOssBucketRequest request);

    /**
     * @param request the request parameters of ListOssBucketScanInfo  ListOssBucketScanInfoRequest
     * @return ListOssBucketScanInfoResponse
     */
    CompletableFuture<ListOssBucketScanInfoResponse> listOssBucketScanInfo(ListOssBucketScanInfoRequest request);

    /**
     * @param request the request parameters of ListOssScanConfig  ListOssScanConfigRequest
     * @return ListOssScanConfigResponse
     */
    CompletableFuture<ListOssScanConfigResponse> listOssScanConfig(ListOssScanConfigRequest request);

    /**
     * @param request the request parameters of ListPluginForUuid  ListPluginForUuidRequest
     * @return ListPluginForUuidResponse
     */
    CompletableFuture<ListPluginForUuidResponse> listPluginForUuid(ListPluginForUuidRequest request);

    /**
     * @param request the request parameters of ListPodRisk  ListPodRiskRequest
     * @return ListPodRiskResponse
     */
    CompletableFuture<ListPodRiskResponse> listPodRisk(ListPodRiskRequest request);

    /**
     * @param request the request parameters of ListPrivateK8s  ListPrivateK8sRequest
     * @return ListPrivateK8sResponse
     */
    CompletableFuture<ListPrivateK8sResponse> listPrivateK8s(ListPrivateK8sRequest request);

    /**
     * @param request the request parameters of ListPrivateRegistryList  ListPrivateRegistryListRequest
     * @return ListPrivateRegistryListResponse
     */
    CompletableFuture<ListPrivateRegistryListResponse> listPrivateRegistryList(ListPrivateRegistryListRequest request);

    /**
     * @param request the request parameters of ListPrivateRegistryType  ListPrivateRegistryTypeRequest
     * @return ListPrivateRegistryTypeResponse
     */
    CompletableFuture<ListPrivateRegistryTypeResponse> listPrivateRegistryType(ListPrivateRegistryTypeRequest request);

    /**
     * @param request the request parameters of ListPublishBatch  ListPublishBatchRequest
     * @return ListPublishBatchResponse
     */
    CompletableFuture<ListPublishBatchResponse> listPublishBatch(ListPublishBatchRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using the management account of the resource directory or the delegated administrator account of Security Center.
     * Before calling this operation, enable the multi-account security management feature by calling <a href="~~EnableServiceAccessResourceDirectory~~">EnableServiceAccessResourceDirectory</a>. Otherwise, the API returns a ServiceDisable error.</p>
     * 
     * @param request the request parameters of ListRdDefaultSyncList  ListRdDefaultSyncListRequest
     * @return ListRdDefaultSyncListResponse
     */
    CompletableFuture<ListRdDefaultSyncListResponse> listRdDefaultSyncList(ListRdDefaultSyncListRequest request);

    /**
     * @param request the request parameters of ListRuleTargetAll  ListRuleTargetAllRequest
     * @return ListRuleTargetAllResponse
     */
    CompletableFuture<ListRuleTargetAllResponse> listRuleTargetAll(ListRuleTargetAllRequest request);

    /**
     * @param request the request parameters of ListSasContainerWebDefenseRule  ListSasContainerWebDefenseRuleRequest
     * @return ListSasContainerWebDefenseRuleResponse
     */
    CompletableFuture<ListSasContainerWebDefenseRuleResponse> listSasContainerWebDefenseRule(ListSasContainerWebDefenseRuleRequest request);

    /**
     * @param request the request parameters of ListSupportAttackPathAsset  ListSupportAttackPathAssetRequest
     * @return ListSupportAttackPathAssetResponse
     */
    CompletableFuture<ListSupportAttackPathAssetResponse> listSupportAttackPathAsset(ListSupportAttackPathAssetRequest request);

    /**
     * @param request the request parameters of ListSupportObjectSuffix  ListSupportObjectSuffixRequest
     * @return ListSupportObjectSuffixResponse
     */
    CompletableFuture<ListSupportObjectSuffixResponse> listSupportObjectSuffix(ListSupportObjectSuffixRequest request);

    /**
     * @param request the request parameters of ListSystemAggregationRules  ListSystemAggregationRulesRequest
     * @return ListSystemAggregationRulesResponse
     */
    CompletableFuture<ListSystemAggregationRulesResponse> listSystemAggregationRules(ListSystemAggregationRulesRequest request);

    /**
     * @param request the request parameters of ListSystemClientRuleTypes  ListSystemClientRuleTypesRequest
     * @return ListSystemClientRuleTypesResponse
     */
    CompletableFuture<ListSystemClientRuleTypesResponse> listSystemClientRuleTypes(ListSystemClientRuleTypesRequest request);

    /**
     * @param request the request parameters of ListSystemClientRules  ListSystemClientRulesRequest
     * @return ListSystemClientRulesResponse
     */
    CompletableFuture<ListSystemClientRulesResponse> listSystemClientRules(ListSystemClientRulesRequest request);

    /**
     * @param request the request parameters of ListSystemRuleAggregationTypes  ListSystemRuleAggregationTypesRequest
     * @return ListSystemRuleAggregationTypesResponse
     */
    CompletableFuture<ListSystemRuleAggregationTypesResponse> listSystemRuleAggregationTypes(ListSystemRuleAggregationTypesRequest request);

    /**
     * @param request the request parameters of ListTargetByBatch  ListTargetByBatchRequest
     * @return ListTargetByBatchResponse
     */
    CompletableFuture<ListTargetByBatchResponse> listTargetByBatch(ListTargetByBatchRequest request);

    /**
     * @param request the request parameters of ListUnfinishedOnceTask  ListUnfinishedOnceTaskRequest
     * @return ListUnfinishedOnceTaskResponse
     */
    CompletableFuture<ListUnfinishedOnceTaskResponse> listUnfinishedOnceTask(ListUnfinishedOnceTaskRequest request);

    /**
     * @param request the request parameters of ListUniBackupRecord  ListUniBackupRecordRequest
     * @return ListUniBackupRecordResponse
     */
    CompletableFuture<ListUniBackupRecordResponse> listUniBackupRecord(ListUniBackupRecordRequest request);

    /**
     * @param request the request parameters of ListUninstallAegisMachines  ListUninstallAegisMachinesRequest
     * @return ListUninstallAegisMachinesResponse
     */
    CompletableFuture<ListUninstallAegisMachinesResponse> listUninstallAegisMachines(ListUninstallAegisMachinesRequest request);

    /**
     * @param request the request parameters of ListUnknownThreatDetectEvent  ListUnknownThreatDetectEventRequest
     * @return ListUnknownThreatDetectEventResponse
     */
    CompletableFuture<ListUnknownThreatDetectEventResponse> listUnknownThreatDetectEvent(ListUnknownThreatDetectEventRequest request);

    /**
     * @param request the request parameters of ListUnknownThreatDetectMachine  ListUnknownThreatDetectMachineRequest
     * @return ListUnknownThreatDetectMachineResponse
     */
    CompletableFuture<ListUnknownThreatDetectMachineResponse> listUnknownThreatDetectMachine(ListUnknownThreatDetectMachineRequest request);

    /**
     * @param request the request parameters of ListUnknownThreatDetectProcess  ListUnknownThreatDetectProcessRequest
     * @return ListUnknownThreatDetectProcessResponse
     */
    CompletableFuture<ListUnknownThreatDetectProcessResponse> listUnknownThreatDetectProcess(ListUnknownThreatDetectProcessRequest request);

    /**
     * @param request the request parameters of ListUnknownThreatDetectStrategy  ListUnknownThreatDetectStrategyRequest
     * @return ListUnknownThreatDetectStrategyResponse
     */
    CompletableFuture<ListUnknownThreatDetectStrategyResponse> listUnknownThreatDetectStrategy(ListUnknownThreatDetectStrategyRequest request);

    /**
     * @param request the request parameters of ListUserVpc  ListUserVpcRequest
     * @return ListUserVpcResponse
     */
    CompletableFuture<ListUserVpcResponse> listUserVpc(ListUserVpcRequest request);

    /**
     * @param request the request parameters of ListUuidsByAppId  ListUuidsByAppIdRequest
     * @return ListUuidsByAppIdResponse
     */
    CompletableFuture<ListUuidsByAppIdResponse> listUuidsByAppId(ListUuidsByAppIdRequest request);

    /**
     * @param request the request parameters of ListUuidsByWebPath  ListUuidsByWebPathRequest
     * @return ListUuidsByWebPathResponse
     */
    CompletableFuture<ListUuidsByWebPathResponse> listUuidsByWebPath(ListUuidsByWebPathRequest request);

    /**
     * @param request the request parameters of ListVirusScanMachine  ListVirusScanMachineRequest
     * @return ListVirusScanMachineResponse
     */
    CompletableFuture<ListVirusScanMachineResponse> listVirusScanMachine(ListVirusScanMachineRequest request);

    /**
     * @param request the request parameters of ListVirusScanMachineEvent  ListVirusScanMachineEventRequest
     * @return ListVirusScanMachineEventResponse
     */
    CompletableFuture<ListVirusScanMachineEventResponse> listVirusScanMachineEvent(ListVirusScanMachineEventRequest request);

    /**
     * @param request the request parameters of ListVirusScanTask  ListVirusScanTaskRequest
     * @return ListVirusScanTaskResponse
     */
    CompletableFuture<ListVirusScanTaskResponse> listVirusScanTask(ListVirusScanTaskRequest request);

    /**
     * @param request the request parameters of ListVulAutoRepairConfig  ListVulAutoRepairConfigRequest
     * @return ListVulAutoRepairConfigResponse
     */
    CompletableFuture<ListVulAutoRepairConfigResponse> listVulAutoRepairConfig(ListVulAutoRepairConfigRequest request);

    /**
     * @param request the request parameters of ListVulGlobalConfig  ListVulGlobalConfigRequest
     * @return ListVulGlobalConfigResponse
     */
    CompletableFuture<ListVulGlobalConfigResponse> listVulGlobalConfig(ListVulGlobalConfigRequest request);

    /**
     * @param request the request parameters of MarkMonitorAccounts  MarkMonitorAccountsRequest
     * @return MarkMonitorAccountsResponse
     */
    CompletableFuture<MarkMonitorAccountsResponse> markMonitorAccounts(MarkMonitorAccountsRequest request);

    /**
     * <b>description</b> :
     * <p>An HTTP 200 status code only indicates that the request was accepted, not that the record was actually modified. Call <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> to query and verify the operation result.</p>
     * 
     * @param request the request parameters of ModifyAccessKeyLeakDeal  ModifyAccessKeyLeakDealRequest
     * @return ModifyAccessKeyLeakDealResponse
     */
    CompletableFuture<ModifyAccessKeyLeakDealResponse> modifyAccessKeyLeakDeal(ModifyAccessKeyLeakDealRequest request);

    /**
     * @param request the request parameters of ModifyAntiBruteForceRule  ModifyAntiBruteForceRuleRequest
     * @return ModifyAntiBruteForceRuleResponse
     */
    CompletableFuture<ModifyAntiBruteForceRuleResponse> modifyAntiBruteForceRule(ModifyAntiBruteForceRuleRequest request);

    /**
     * @param request the request parameters of ModifyAppVulScanCycle  ModifyAppVulScanCycleRequest
     * @return ModifyAppVulScanCycleResponse
     */
    CompletableFuture<ModifyAppVulScanCycleResponse> modifyAppVulScanCycle(ModifyAppVulScanCycleRequest request);

    /**
     * @param request the request parameters of ModifyAssetCleanConfig  ModifyAssetCleanConfigRequest
     * @return ModifyAssetCleanConfigResponse
     */
    CompletableFuture<ModifyAssetCleanConfigResponse> modifyAssetCleanConfig(ModifyAssetCleanConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the group of servers. You can use this operation to modify the group of one or more servers. After you create a group by calling the <a href="~~CreateOrUpdateAssetGroup~~">CreateOrUpdateAssetGroup</a> operation, you can call this operation to modify the group of servers.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls exceeds the limit, throttling is triggered, which may affect your business. Use this operation appropriately.</p>
     * 
     * @param request the request parameters of ModifyAssetGroup  ModifyAssetGroupRequest
     * @return ModifyAssetGroupResponse
     */
    CompletableFuture<ModifyAssetGroupResponse> modifyAssetGroup(ModifyAssetGroupRequest request);

    /**
     * @param request the request parameters of ModifyAssetImportant  ModifyAssetImportantRequest
     * @return ModifyAssetImportantResponse
     */
    CompletableFuture<ModifyAssetImportantResponse> modifyAssetImportant(ModifyAssetImportantRequest request);

    /**
     * @param request the request parameters of ModifyAttestor  ModifyAttestorRequest
     * @return ModifyAttestorResponse
     */
    CompletableFuture<ModifyAttestorResponse> modifyAttestor(ModifyAttestorRequest request);

    /**
     * @param request the request parameters of ModifyAutoDelConfig  ModifyAutoDelConfigRequest
     * @return ModifyAutoDelConfigResponse
     */
    CompletableFuture<ModifyAutoDelConfigResponse> modifyAutoDelConfig(ModifyAutoDelConfigRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicyStatus  ModifyBackupPolicyStatusRequest
     * @return ModifyBackupPolicyStatusResponse
     */
    CompletableFuture<ModifyBackupPolicyStatusResponse> modifyBackupPolicyStatus(ModifyBackupPolicyStatusRequest request);

    /**
     * @param request the request parameters of ModifyBinarySecurityPolicy  ModifyBinarySecurityPolicyRequest
     * @return ModifyBinarySecurityPolicyResponse
     */
    CompletableFuture<ModifyBinarySecurityPolicyResponse> modifyBinarySecurityPolicy(ModifyBinarySecurityPolicyRequest request);

    /**
     * @param request the request parameters of ModifyCheckRule  ModifyCheckRuleRequest
     * @return ModifyCheckRuleResponse
     */
    CompletableFuture<ModifyCheckRuleResponse> modifyCheckRule(ModifyCheckRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Cleared logs cannot be recovered. Before calling this operation, perform a log export and save the logs to a local device, and then call this operation to clear the logs and free up storage capacity space.</p>
     * 
     * @param request the request parameters of ModifyClearLogstoreStorage  ModifyClearLogstoreStorageRequest
     * @return ModifyClearLogstoreStorageResponse
     */
    CompletableFuture<ModifyClearLogstoreStorageResponse> modifyClearLogstoreStorage(ModifyClearLogstoreStorageRequest request);

    /**
     * @param request the request parameters of ModifyClientConfSetup  ModifyClientConfSetupRequest
     * @return ModifyClientConfSetupResponse
     */
    CompletableFuture<ModifyClientConfSetupResponse> modifyClientConfSetup(ModifyClientConfSetupRequest request);

    /**
     * @param request the request parameters of ModifyClientConfStrategy  ModifyClientConfStrategyRequest
     * @return ModifyClientConfStrategyResponse
     */
    CompletableFuture<ModifyClientConfStrategyResponse> modifyClientConfStrategy(ModifyClientConfStrategyRequest request);

    /**
     * @param request the request parameters of ModifyClientUserDefineRule  ModifyClientUserDefineRuleRequest
     * @return ModifyClientUserDefineRuleResponse
     */
    CompletableFuture<ModifyClientUserDefineRuleResponse> modifyClientUserDefineRule(ModifyClientUserDefineRuleRequest request);

    /**
     * @param request the request parameters of ModifyCloudVendorAccountAK  ModifyCloudVendorAccountAKRequest
     * @return ModifyCloudVendorAccountAKResponse
     */
    CompletableFuture<ModifyCloudVendorAccountAKResponse> modifyCloudVendorAccountAK(ModifyCloudVendorAccountAKRequest request);

    /**
     * @param request the request parameters of ModifyCloudVendorTrialConfig  ModifyCloudVendorTrialConfigRequest
     * @return ModifyCloudVendorTrialConfigResponse
     */
    CompletableFuture<ModifyCloudVendorTrialConfigResponse> modifyCloudVendorTrialConfig(ModifyCloudVendorTrialConfigRequest request);

    /**
     * @param request the request parameters of ModifyClusterCnnfStatusUserConfirm  ModifyClusterCnnfStatusUserConfirmRequest
     * @return ModifyClusterCnnfStatusUserConfirmResponse
     */
    CompletableFuture<ModifyClusterCnnfStatusUserConfirmResponse> modifyClusterCnnfStatusUserConfirm(ModifyClusterCnnfStatusUserConfirmRequest request);

    /**
     * @param request the request parameters of ModifyConcernNecessity  ModifyConcernNecessityRequest
     * @return ModifyConcernNecessityResponse
     */
    CompletableFuture<ModifyConcernNecessityResponse> modifyConcernNecessity(ModifyConcernNecessityRequest request);

    /**
     * @param request the request parameters of ModifyContainerDefenseRule  ModifyContainerDefenseRuleRequest
     * @return ModifyContainerDefenseRuleResponse
     */
    CompletableFuture<ModifyContainerDefenseRuleResponse> modifyContainerDefenseRule(ModifyContainerDefenseRuleRequest request);

    /**
     * @param request the request parameters of ModifyContainerDefenseRuleSwitch  ModifyContainerDefenseRuleSwitchRequest
     * @return ModifyContainerDefenseRuleSwitchResponse
     */
    CompletableFuture<ModifyContainerDefenseRuleSwitchResponse> modifyContainerDefenseRuleSwitch(ModifyContainerDefenseRuleSwitchRequest request);

    /**
     * @param request the request parameters of ModifyContainerPluginRule  ModifyContainerPluginRuleRequest
     * @return ModifyContainerPluginRuleResponse
     */
    CompletableFuture<ModifyContainerPluginRuleResponse> modifyContainerPluginRule(ModifyContainerPluginRuleRequest request);

    /**
     * @param request the request parameters of ModifyContainerScanConfig  ModifyContainerScanConfigRequest
     * @return ModifyContainerScanConfigResponse
     */
    CompletableFuture<ModifyContainerScanConfigResponse> modifyContainerScanConfig(ModifyContainerScanConfigRequest request);

    /**
     * @param request the request parameters of ModifyCreateVulWhitelist  ModifyCreateVulWhitelistRequest
     * @return ModifyCreateVulWhitelistResponse
     */
    CompletableFuture<ModifyCreateVulWhitelistResponse> modifyCreateVulWhitelist(ModifyCreateVulWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyCustomBlockRecord  ModifyCustomBlockRecordRequest
     * @return ModifyCustomBlockRecordResponse
     */
    CompletableFuture<ModifyCustomBlockRecordResponse> modifyCustomBlockRecord(ModifyCustomBlockRecordRequest request);

    /**
     * @param request the request parameters of ModifyCycleTask  ModifyCycleTaskRequest
     * @return ModifyCycleTaskResponse
     */
    CompletableFuture<ModifyCycleTaskResponse> modifyCycleTask(ModifyCycleTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you use Security Center Enterprise.</p>
     * 
     * @param request the request parameters of ModifyDingTalkStatus  ModifyDingTalkStatusRequest
     * @return ModifyDingTalkStatusResponse
     */
    CompletableFuture<ModifyDingTalkStatusResponse> modifyDingTalkStatus(ModifyDingTalkStatusRequest request);

    /**
     * @param request the request parameters of ModifyEmgVulSubmit  ModifyEmgVulSubmitRequest
     * @return ModifyEmgVulSubmitResponse
     */
    CompletableFuture<ModifyEmgVulSubmitResponse> modifyEmgVulSubmit(ModifyEmgVulSubmitRequest request);

    /**
     * @param request the request parameters of ModifyGroupProperty  ModifyGroupPropertyRequest
     * @return ModifyGroupPropertyResponse
     */
    CompletableFuture<ModifyGroupPropertyResponse> modifyGroupProperty(ModifyGroupPropertyRequest request);

    /**
     * @param request the request parameters of ModifyHybridProxyCluster  ModifyHybridProxyClusterRequest
     * @return ModifyHybridProxyClusterResponse
     */
    CompletableFuture<ModifyHybridProxyClusterResponse> modifyHybridProxyCluster(ModifyHybridProxyClusterRequest request);

    /**
     * @param request the request parameters of ModifyHybridProxyPolicy  ModifyHybridProxyPolicyRequest
     * @return ModifyHybridProxyPolicyResponse
     */
    CompletableFuture<ModifyHybridProxyPolicyResponse> modifyHybridProxyPolicy(ModifyHybridProxyPolicyRequest request);

    /**
     * @param request the request parameters of ModifyIdcProbe  ModifyIdcProbeRequest
     * @return ModifyIdcProbeResponse
     */
    CompletableFuture<ModifyIdcProbeResponse> modifyIdcProbe(ModifyIdcProbeRequest request);

    /**
     * @param request the request parameters of ModifyImageFixCycleConfig  ModifyImageFixCycleConfigRequest
     * @return ModifyImageFixCycleConfigResponse
     */
    CompletableFuture<ModifyImageFixCycleConfigResponse> modifyImageFixCycleConfig(ModifyImageFixCycleConfigRequest request);

    /**
     * @param request the request parameters of ModifyImageRegistry  ModifyImageRegistryRequest
     * @return ModifyImageRegistryResponse
     */
    CompletableFuture<ModifyImageRegistryResponse> modifyImageRegistry(ModifyImageRegistryRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAntiBruteForceRule  ModifyInstanceAntiBruteForceRuleRequest
     * @return ModifyInstanceAntiBruteForceRuleResponse
     */
    CompletableFuture<ModifyInstanceAntiBruteForceRuleResponse> modifyInstanceAntiBruteForceRule(ModifyInstanceAntiBruteForceRuleRequest request);

    /**
     * @param request the request parameters of ModifyInterceptionRule  ModifyInterceptionRuleRequest
     * @return ModifyInterceptionRuleResponse
     */
    CompletableFuture<ModifyInterceptionRuleResponse> modifyInterceptionRule(ModifyInterceptionRuleRequest request);

    /**
     * @param request the request parameters of ModifyInterceptionRuleSwitch  ModifyInterceptionRuleSwitchRequest
     * @return ModifyInterceptionRuleSwitchResponse
     */
    CompletableFuture<ModifyInterceptionRuleSwitchResponse> modifyInterceptionRuleSwitch(ModifyInterceptionRuleSwitchRequest request);

    /**
     * @param request the request parameters of ModifyInterceptionTarget  ModifyInterceptionTargetRequest
     * @return ModifyInterceptionTargetResponse
     */
    CompletableFuture<ModifyInterceptionTargetResponse> modifyInterceptionTarget(ModifyInterceptionTargetRequest request);

    /**
     * @param request the request parameters of ModifyLogMetaStatus  ModifyLogMetaStatusRequest
     * @return ModifyLogMetaStatusResponse
     */
    CompletableFuture<ModifyLogMetaStatusResponse> modifyLogMetaStatus(ModifyLogMetaStatusRequest request);

    /**
     * @param request the request parameters of ModifyLoginBaseConfig  ModifyLoginBaseConfigRequest
     * @return ModifyLoginBaseConfigResponse
     */
    CompletableFuture<ModifyLoginBaseConfigResponse> modifyLoginBaseConfig(ModifyLoginBaseConfigRequest request);

    /**
     * @param request the request parameters of ModifyLoginSwitchConfig  ModifyLoginSwitchConfigRequest
     * @return ModifyLoginSwitchConfigResponse
     */
    CompletableFuture<ModifyLoginSwitchConfigResponse> modifyLoginSwitchConfig(ModifyLoginSwitchConfigRequest request);

    /**
     * @param request the request parameters of ModifyNoticeConfig  ModifyNoticeConfigRequest
     * @return ModifyNoticeConfigResponse
     */
    CompletableFuture<ModifyNoticeConfigResponse> modifyNoticeConfig(ModifyNoticeConfigRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Activate &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/48863.html">Simple Log Service</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/log-service/latest/billable-items">Log Service</a>.
     * Create a service-linked role and authorize Security Center to access cloud resources. You can call the <a href="~~CreateServiceLinkedRole~~">CreateServiceLinkedRole</a> operation to create a service-linked role and authorize Security Center to access cloud resources.
     * <strong>Common scenarios</strong>
     * Before you use the log analysis feature of Security Center, call the <a href="~~ModifyOpenLogShipper~~">ModifyOpenLogShipper</a> operation to activate Simple Log Service.</p>
     * 
     * @param request the request parameters of ModifyOpenLogShipper  ModifyOpenLogShipperRequest
     * @return ModifyOpenLogShipperResponse
     */
    CompletableFuture<ModifyOpenLogShipperResponse> modifyOpenLogShipper(ModifyOpenLogShipperRequest request);

    /**
     * @param request the request parameters of ModifyOperateVul  ModifyOperateVulRequest
     * @return ModifyOperateVulResponse
     */
    CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request);

    /**
     * @param request the request parameters of ModifyPostPayModuleSwitch  ModifyPostPayModuleSwitchRequest
     * @return ModifyPostPayModuleSwitchResponse
     */
    CompletableFuture<ModifyPostPayModuleSwitchResponse> modifyPostPayModuleSwitch(ModifyPostPayModuleSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist is a China-site public preview feature that is no longer open for new applications. Users who have already applied for or are using this feature can call this operation as expected.</p>
     * 
     * @param request the request parameters of ModifyProcessWhiteList  ModifyProcessWhiteListRequest
     * @return ModifyProcessWhiteListResponse
     */
    CompletableFuture<ModifyProcessWhiteListResponse> modifyProcessWhiteList(ModifyProcessWhiteListRequest request);

    /**
     * @param request the request parameters of ModifyPropertyScheduleConfig  ModifyPropertyScheduleConfigRequest
     * @return ModifyPropertyScheduleConfigResponse
     */
    CompletableFuture<ModifyPropertyScheduleConfigResponse> modifyPropertyScheduleConfig(ModifyPropertyScheduleConfigRequest request);

    /**
     * @param request the request parameters of ModifyPushAllTask  ModifyPushAllTaskRequest
     * @return ModifyPushAllTaskResponse
     */
    CompletableFuture<ModifyPushAllTaskResponse> modifyPushAllTask(ModifyPushAllTaskRequest request);

    /**
     * @param request the request parameters of ModifyRefreshProcessInfo  ModifyRefreshProcessInfoRequest
     * @return ModifyRefreshProcessInfoResponse
     */
    CompletableFuture<ModifyRefreshProcessInfoResponse> modifyRefreshProcessInfo(ModifyRefreshProcessInfoRequest request);

    /**
     * @param request the request parameters of ModifySasContainerWebDefenseRule  ModifySasContainerWebDefenseRuleRequest
     * @return ModifySasContainerWebDefenseRuleResponse
     */
    CompletableFuture<ModifySasContainerWebDefenseRuleResponse> modifySasContainerWebDefenseRule(ModifySasContainerWebDefenseRuleRequest request);

    /**
     * @param request the request parameters of ModifySearchCondition  ModifySearchConditionRequest
     * @return ModifySearchConditionResponse
     */
    CompletableFuture<ModifySearchConditionResponse> modifySearchCondition(ModifySearchConditionRequest request);

    /**
     * @deprecated OpenAPI ModifySecurityCheckScheduleConfig is deprecated, please use Sas::2018-12-03::ChangeCheckConfig instead.  * @description This operation is deprecated. Use the ChangeCheckConfig operation instead.
     * 
     * @param request the request parameters of ModifySecurityCheckScheduleConfig  ModifySecurityCheckScheduleConfigRequest
     * @return ModifySecurityCheckScheduleConfigResponse
     */
    @Deprecated
    CompletableFuture<ModifySecurityCheckScheduleConfigResponse> modifySecurityCheckScheduleConfig(ModifySecurityCheckScheduleConfigRequest request);

    /**
     * @param request the request parameters of ModifySecurityEventMarkMissIndividually  ModifySecurityEventMarkMissIndividuallyRequest
     * @return ModifySecurityEventMarkMissIndividuallyResponse
     */
    CompletableFuture<ModifySecurityEventMarkMissIndividuallyResponse> modifySecurityEventMarkMissIndividually(ModifySecurityEventMarkMissIndividuallyRequest request);

    /**
     * @param request the request parameters of ModifyServerlessAuthToMachine  ModifyServerlessAuthToMachineRequest
     * @return ModifyServerlessAuthToMachineResponse
     */
    CompletableFuture<ModifyServerlessAuthToMachineResponse> modifyServerlessAuthToMachine(ModifyServerlessAuthToMachineRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API call. Other editions do not support this call.</p>
     * 
     * @param request the request parameters of ModifySoarStrategySubscribe  ModifySoarStrategySubscribeRequest
     * @return ModifySoarStrategySubscribeResponse
     */
    CompletableFuture<ModifySoarStrategySubscribeResponse> modifySoarStrategySubscribe(ModifySoarStrategySubscribeRequest request);

    /**
     * @param request the request parameters of ModifyStartVulScan  ModifyStartVulScanRequest
     * @return ModifyStartVulScanResponse
     */
    CompletableFuture<ModifyStartVulScanResponse> modifyStartVulScan(ModifyStartVulScanRequest request);

    /**
     * @param request the request parameters of ModifyStrategy  ModifyStrategyRequest
     * @return ModifyStrategyResponse
     */
    CompletableFuture<ModifyStrategyResponse> modifyStrategy(ModifyStrategyRequest request);

    /**
     * @param request the request parameters of ModifyStrategyTarget  ModifyStrategyTargetRequest
     * @return ModifyStrategyTargetResponse
     */
    CompletableFuture<ModifyStrategyTargetResponse> modifyStrategyTarget(ModifyStrategyTargetRequest request);

    /**
     * @param request the request parameters of ModifyTagWithUuid  ModifyTagWithUuidRequest
     * @return ModifyTagWithUuidResponse
     */
    CompletableFuture<ModifyTagWithUuidResponse> modifyTagWithUuid(ModifyTagWithUuidRequest request);

    /**
     * @param request the request parameters of ModifyUniBackupPolicy  ModifyUniBackupPolicyRequest
     * @return ModifyUniBackupPolicyResponse
     */
    CompletableFuture<ModifyUniBackupPolicyResponse> modifyUniBackupPolicy(ModifyUniBackupPolicyRequest request);

    /**
     * @deprecated OpenAPI ModifyVpcHoneyPot is deprecated  * @param request  the request parameters of ModifyVpcHoneyPot  ModifyVpcHoneyPotRequest
     * @return ModifyVpcHoneyPotResponse
     */
    @Deprecated
    CompletableFuture<ModifyVpcHoneyPotResponse> modifyVpcHoneyPot(ModifyVpcHoneyPotRequest request);

    /**
     * @param request the request parameters of ModifyVulConfig  ModifyVulConfigRequest
     * @return ModifyVulConfigResponse
     */
    CompletableFuture<ModifyVulConfigResponse> modifyVulConfig(ModifyVulConfigRequest request);

    /**
     * @param request the request parameters of ModifyVulTarget  ModifyVulTargetRequest
     * @return ModifyVulTargetResponse
     */
    CompletableFuture<ModifyVulTargetResponse> modifyVulTarget(ModifyVulTargetRequest request);

    /**
     * @param request the request parameters of ModifyVulTargetConfig  ModifyVulTargetConfigRequest
     * @return ModifyVulTargetConfigResponse
     */
    CompletableFuture<ModifyVulTargetConfigResponse> modifyVulTargetConfig(ModifyVulTargetConfigRequest request);

    /**
     * @param request the request parameters of ModifyVulWhitelistTarget  ModifyVulWhitelistTargetRequest
     * @return ModifyVulWhitelistTargetResponse
     */
    CompletableFuture<ModifyVulWhitelistTargetResponse> modifyVulWhitelistTarget(ModifyVulWhitelistTargetRequest request);

    /**
     * @param request the request parameters of ModifyWebLockCreateConfig  ModifyWebLockCreateConfigRequest
     * @return ModifyWebLockCreateConfigResponse
     */
    CompletableFuture<ModifyWebLockCreateConfigResponse> modifyWebLockCreateConfig(ModifyWebLockCreateConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you delete a protected directory from a server, tamper-proofing no longer protects the files in the directory. The website information on your server may be maliciously tampered with. Proceed with caution.</p>
     * 
     * @param request the request parameters of ModifyWebLockDeleteConfig  ModifyWebLockDeleteConfigRequest
     * @return ModifyWebLockDeleteConfigResponse
     */
    CompletableFuture<ModifyWebLockDeleteConfigResponse> modifyWebLockDeleteConfig(ModifyWebLockDeleteConfigRequest request);

    /**
     * @param request the request parameters of ModifyWebLockProcessStatus  ModifyWebLockProcessStatusRequest
     * @return ModifyWebLockProcessStatusResponse
     */
    CompletableFuture<ModifyWebLockProcessStatusResponse> modifyWebLockProcessStatus(ModifyWebLockProcessStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If an exception occurs when you enable or disable the web tamper proofing feature for a server, you can call this operation to refresh the status of the web tamper proofing feature.</p>
     * 
     * @param request the request parameters of ModifyWebLockRefresh  ModifyWebLockRefreshRequest
     * @return ModifyWebLockRefreshResponse
     */
    CompletableFuture<ModifyWebLockRefreshResponse> modifyWebLockRefresh(ModifyWebLockRefreshRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, purchase and allocate the web tamper-proofing value-added service authorization for the specified server. You can query the number of active authorizations by using the WhiteCount field of <a href="~~DescribeWebLockStatus~~">DescribeWebLockStatus</a>, and allocate authorizations through the console or by invoking <a href="~~BindAuthToMachine~~">BindAuthToMachine</a>.</p>
     * 
     * @param request the request parameters of ModifyWebLockStart  ModifyWebLockStartRequest
     * @return ModifyWebLockStartResponse
     */
    CompletableFuture<ModifyWebLockStartResponse> modifyWebLockStart(ModifyWebLockStartRequest request);

    /**
     * @param request the request parameters of ModifyWebLockStatus  ModifyWebLockStatusRequest
     * @return ModifyWebLockStatusResponse
     */
    CompletableFuture<ModifyWebLockStatusResponse> modifyWebLockStatus(ModifyWebLockStatusRequest request);

    /**
     * @param request the request parameters of ModifyWebLockUnbind  ModifyWebLockUnbindRequest
     * @return ModifyWebLockUnbindResponse
     */
    CompletableFuture<ModifyWebLockUnbindResponse> modifyWebLockUnbind(ModifyWebLockUnbindRequest request);

    /**
     * @param request the request parameters of ModifyWebLockUpdateConfig  ModifyWebLockUpdateConfigRequest
     * @return ModifyWebLockUpdateConfigResponse
     */
    CompletableFuture<ModifyWebLockUpdateConfigResponse> modifyWebLockUpdateConfig(ModifyWebLockUpdateConfigRequest request);

    /**
     * @param request the request parameters of ModifyWebPath  ModifyWebPathRequest
     * @return ModifyWebPathResponse
     */
    CompletableFuture<ModifyWebPathResponse> modifyWebPath(ModifyWebPathRequest request);

    /**
     * @param request the request parameters of OpenBackupAutoConfig  OpenBackupAutoConfigRequest
     * @return OpenBackupAutoConfigResponse
     */
    CompletableFuture<OpenBackupAutoConfigResponse> openBackupAutoConfig(OpenBackupAutoConfigRequest request);

    /**
     * @param request the request parameters of OpenPartialBuy  OpenPartialBuyRequest
     * @return OpenPartialBuyResponse
     */
    CompletableFuture<OpenPartialBuyResponse> openPartialBuy(OpenPartialBuyRequest request);

    /**
     * @param request the request parameters of OpenSensitiveFileScan  OpenSensitiveFileScanRequest
     * @return OpenSensitiveFileScanResponse
     */
    CompletableFuture<OpenSensitiveFileScanResponse> openSensitiveFileScan(OpenSensitiveFileScanRequest request);

    /**
     * @param request the request parameters of OperateAgentClientInstall  OperateAgentClientInstallRequest
     * @return OperateAgentClientInstallResponse
     */
    CompletableFuture<OperateAgentClientInstallResponse> operateAgentClientInstall(OperateAgentClientInstallRequest request);

    /**
     * @param request the request parameters of OperateApplication  OperateApplicationRequest
     * @return OperateApplicationResponse
     */
    CompletableFuture<OperateApplicationResponse> operateApplication(OperateApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, the following prerequisites must be met:</p>
     * <ol>
     * <li>The OSS bucket has been discovered by Security Center (SAS). You can call the ListOssBucket operation to query the bucket.</li>
     * <li>An active scan task exists for the bucket. You can call the CreateOssBucketScanTask operation to create a scan task.
     * The complete API call chain is: PutBucket → RefreshOssBucketScanInfo → CreateOssBucketScanTask → OperateBucketScanTask. Additional implicit prerequisites, such as activating the service in the console, may also apply.</li>
     * </ol>
     * 
     * @param request the request parameters of OperateBucketScanTask  OperateBucketScanTaskRequest
     * @return OperateBucketScanTaskResponse
     */
    CompletableFuture<OperateBucketScanTaskResponse> operateBucketScanTask(OperateBucketScanTaskRequest request);

    /**
     * @param request the request parameters of OperateCommonOverallConfig  OperateCommonOverallConfigRequest
     * @return OperateCommonOverallConfigResponse
     */
    CompletableFuture<OperateCommonOverallConfigResponse> operateCommonOverallConfig(OperateCommonOverallConfigRequest request);

    /**
     * @param request the request parameters of OperateCommonTargetConfig  OperateCommonTargetConfigRequest
     * @return OperateCommonTargetConfigResponse
     */
    CompletableFuture<OperateCommonTargetConfigResponse> operateCommonTargetConfig(OperateCommonTargetConfigRequest request);

    /**
     * @param request the request parameters of OperateImageBaselineWhitelist  OperateImageBaselineWhitelistRequest
     * @return OperateImageBaselineWhitelistResponse
     */
    CompletableFuture<OperateImageBaselineWhitelistResponse> operateImageBaselineWhitelist(OperateImageBaselineWhitelistRequest request);

    /**
     * @param request the request parameters of OperateImageVul  OperateImageVulRequest
     * @return OperateImageVulResponse
     */
    CompletableFuture<OperateImageVulResponse> operateImageVul(OperateImageVulRequest request);

    /**
     * @param request the request parameters of OperateSuspiciousOverallConfig  OperateSuspiciousOverallConfigRequest
     * @return OperateSuspiciousOverallConfigResponse
     */
    CompletableFuture<OperateSuspiciousOverallConfigResponse> operateSuspiciousOverallConfig(OperateSuspiciousOverallConfigRequest request);

    /**
     * @param request the request parameters of OperateSuspiciousTargetConfig  OperateSuspiciousTargetConfigRequest
     * @return OperateSuspiciousTargetConfigResponse
     */
    CompletableFuture<OperateSuspiciousTargetConfigResponse> operateSuspiciousTargetConfig(OperateSuspiciousTargetConfigRequest request);

    /**
     * @param request the request parameters of OperateSwitchStatus  OperateSwitchStatusRequest
     * @return OperateSwitchStatusResponse
     */
    CompletableFuture<OperateSwitchStatusResponse> operateSwitchStatus(OperateSwitchStatusRequest request);

    /**
     * @param request the request parameters of OperateUnknownThreatDetectMachine  OperateUnknownThreatDetectMachineRequest
     * @return OperateUnknownThreatDetectMachineResponse
     */
    CompletableFuture<OperateUnknownThreatDetectMachineResponse> operateUnknownThreatDetectMachine(OperateUnknownThreatDetectMachineRequest request);

    /**
     * @param request the request parameters of OperateVirusEvents  OperateVirusEventsRequest
     * @return OperateVirusEventsResponse
     */
    CompletableFuture<OperateVirusEventsResponse> operateVirusEvents(OperateVirusEventsRequest request);

    /**
     * @param request the request parameters of OperateVuls  OperateVulsRequest
     * @return OperateVulsResponse
     */
    CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request);

    /**
     * @param request the request parameters of OperateWebLockFileEvents  OperateWebLockFileEventsRequest
     * @return OperateWebLockFileEventsResponse
     */
    CompletableFuture<OperateWebLockFileEventsResponse> operateWebLockFileEvents(OperateWebLockFileEventsRequest request);

    /**
     * @param request the request parameters of OperationCancelIgnoreSuspEvent  OperationCancelIgnoreSuspEventRequest
     * @return OperationCancelIgnoreSuspEventResponse
     */
    CompletableFuture<OperationCancelIgnoreSuspEventResponse> operationCancelIgnoreSuspEvent(OperationCancelIgnoreSuspEventRequest request);

    /**
     * @param request the request parameters of OperationCustomizeReportChart  OperationCustomizeReportChartRequest
     * @return OperationCustomizeReportChartResponse
     */
    CompletableFuture<OperationCustomizeReportChartResponse> operationCustomizeReportChart(OperationCustomizeReportChartRequest request);

    /**
     * @param request the request parameters of OperationSuspEvents  OperationSuspEventsRequest
     * @return OperationSuspEventsResponse
     */
    CompletableFuture<OperationSuspEventsResponse> operationSuspEvents(OperationSuspEventsRequest request);

    /**
     * @param request the request parameters of PageImageRegistry  PageImageRegistryRequest
     * @return PageImageRegistryResponse
     */
    CompletableFuture<PageImageRegistryResponse> pageImageRegistry(PageImageRegistryRequest request);

    /**
     * @param request the request parameters of PauseClient  PauseClientRequest
     * @return PauseClientResponse
     */
    CompletableFuture<PauseClientResponse> pauseClient(PauseClientRequest request);

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API call. Other editions are not supported.</p>
     * 
     * @param request the request parameters of ProcessSoarStrategyTask  ProcessSoarStrategyTaskRequest
     * @return ProcessSoarStrategyTaskResponse
     */
    CompletableFuture<ProcessSoarStrategyTaskResponse> processSoarStrategyTask(ProcessSoarStrategyTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call the <a href="~~PublicPreCheckImageScanTask~~">PublicPreCheckImageScanTask</a> operation to query the number of container images covered by the image scan node and the number of authorizations consumed. This ensures that sufficient authorizations are available for the image scan node and prevents the image scan node from a break due to insufficient authorizations.</p>
     * 
     * @param request the request parameters of PublicCreateImageScanTask  PublicCreateImageScanTaskRequest
     * @return PublicCreateImageScanTaskResponse
     */
    CompletableFuture<PublicCreateImageScanTaskResponse> publicCreateImageScanTask(PublicCreateImageScanTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the PublicPreCheckImageScanTask operation to estimate the quota for container image scan to be consumed by the task. This ensures that you know the quota to be consumed before you perform the task. If the remaining quota for container image scan is less than the quota to be consumed by the task, you must purchase a sufficient quota. This prevents the task from being stopped due to an insufficient quota.
     * If you do not specify the optional parameters when you call this operation, the total number of protected images and the quota for container image scan to be consumed by scanning all the protected images are queried. If you specify the optional parameters, the number of images that meet the specified conditions and the quota for container image scan to be consumed by scanning the images are queried.</p>
     * 
     * @param request the request parameters of PublicPreCheckImageScanTask  PublicPreCheckImageScanTaskRequest
     * @return PublicPreCheckImageScanTaskResponse
     */
    CompletableFuture<PublicPreCheckImageScanTaskResponse> publicPreCheckImageScanTask(PublicPreCheckImageScanTaskRequest request);

    /**
     * @param request the request parameters of PublicSyncAndCreateImageScanTask  PublicSyncAndCreateImageScanTaskRequest
     * @return PublicSyncAndCreateImageScanTaskResponse
     */
    CompletableFuture<PublicSyncAndCreateImageScanTaskResponse> publicSyncAndCreateImageScanTask(PublicSyncAndCreateImageScanTaskRequest request);

    /**
     * @param request the request parameters of QueryAttackCount  QueryAttackCountRequest
     * @return QueryAttackCountResponse
     */
    CompletableFuture<QueryAttackCountResponse> queryAttackCount(QueryAttackCountRequest request);

    /**
     * @param request the request parameters of QueryDiscoverDatabase  QueryDiscoverDatabaseRequest
     * @return QueryDiscoverDatabaseResponse
     */
    CompletableFuture<QueryDiscoverDatabaseResponse> queryDiscoverDatabase(QueryDiscoverDatabaseRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the ID of an asset group by the group name. If you need to specify an asset group ID when you call other operations such as <a href="~~GetSuspiciousStatistics~~">GetSuspiciousStatistics</a> and <a href="~~DeleteGroup~~">DeleteGroup</a>, you can call this operation to obtain the asset group ID.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled. This may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of QueryGroupIdByGroupName  QueryGroupIdByGroupNameRequest
     * @return QueryGroupIdByGroupNameResponse
     */
    CompletableFuture<QueryGroupIdByGroupNameResponse> queryGroupIdByGroupName(QueryGroupIdByGroupNameRequest request);

    /**
     * @param request the request parameters of QueryGroupedSecurityEventMarkMissList  QueryGroupedSecurityEventMarkMissListRequest
     * @return QueryGroupedSecurityEventMarkMissListResponse
     */
    CompletableFuture<QueryGroupedSecurityEventMarkMissListResponse> queryGroupedSecurityEventMarkMissList(QueryGroupedSecurityEventMarkMissListRequest request);

    /**
     * @param request the request parameters of QueryGuidTaskList  QueryGuidTaskListRequest
     * @return QueryGuidTaskListResponse
     */
    CompletableFuture<QueryGuidTaskListResponse> queryGuidTaskList(QueryGuidTaskListRequest request);

    /**
     * @param request the request parameters of QueryJenkinsImageRegistryPersistenceDay  QueryJenkinsImageRegistryPersistenceDayRequest
     * @return QueryJenkinsImageRegistryPersistenceDayResponse
     */
    CompletableFuture<QueryJenkinsImageRegistryPersistenceDayResponse> queryJenkinsImageRegistryPersistenceDay(QueryJenkinsImageRegistryPersistenceDayRequest request);

    /**
     * @param request the request parameters of QueryPreCheckDatabase  QueryPreCheckDatabaseRequest
     * @return QueryPreCheckDatabaseResponse
     */
    CompletableFuture<QueryPreCheckDatabaseResponse> queryPreCheckDatabase(QueryPreCheckDatabaseRequest request);

    /**
     * @param request the request parameters of RebootMachine  RebootMachineRequest
     * @return RebootMachineResponse
     */
    CompletableFuture<RebootMachineResponse> rebootMachine(RebootMachineRequest request);

    /**
     * @param request the request parameters of ReceiveFunctionTrialRewardByAliUid  ReceiveFunctionTrialRewardByAliUidRequest
     * @return ReceiveFunctionTrialRewardByAliUidResponse
     */
    CompletableFuture<ReceiveFunctionTrialRewardByAliUidResponse> receiveFunctionTrialRewardByAliUid(ReceiveFunctionTrialRewardByAliUidRequest request);

    /**
     * @param request the request parameters of RefreshAssets  RefreshAssetsRequest
     * @return RefreshAssetsResponse
     */
    CompletableFuture<RefreshAssetsResponse> refreshAssets(RefreshAssetsRequest request);

    /**
     * @param request the request parameters of RefreshContainerAssets  RefreshContainerAssetsRequest
     * @return RefreshContainerAssetsResponse
     */
    CompletableFuture<RefreshContainerAssetsResponse> refreshContainerAssets(RefreshContainerAssetsRequest request);

    /**
     * @param request the request parameters of RefreshOssBucketScanInfo  RefreshOssBucketScanInfoRequest
     * @return RefreshOssBucketScanInfoResponse
     */
    CompletableFuture<RefreshOssBucketScanInfoResponse> refreshOssBucketScanInfo(RefreshOssBucketScanInfoRequest request);

    /**
     * @param request the request parameters of RefreshRegistryToken  RefreshRegistryTokenRequest
     * @return RefreshRegistryTokenResponse
     */
    CompletableFuture<RefreshRegistryTokenResponse> refreshRegistryToken(RefreshRegistryTokenRequest request);

    /**
     * @param request the request parameters of ReleaseSasInstance  ReleaseSasInstanceRequest
     * @return ReleaseSasInstanceResponse
     */
    CompletableFuture<ReleaseSasInstanceResponse> releaseSasInstance(ReleaseSasInstanceRequest request);

    /**
     * @param request the request parameters of RemoveCheckInstanceResultWhiteList  RemoveCheckInstanceResultWhiteListRequest
     * @return RemoveCheckInstanceResultWhiteListResponse
     */
    CompletableFuture<RemoveCheckInstanceResultWhiteListResponse> removeCheckInstanceResultWhiteList(RemoveCheckInstanceResultWhiteListRequest request);

    /**
     * @param request the request parameters of RemoveCheckResultWhiteList  RemoveCheckResultWhiteListRequest
     * @return RemoveCheckResultWhiteListResponse
     */
    CompletableFuture<RemoveCheckResultWhiteListResponse> removeCheckResultWhiteList(RemoveCheckResultWhiteListRequest request);

    /**
     * @param request the request parameters of ResetHoneypot  ResetHoneypotRequest
     * @return ResetHoneypotResponse
     */
    CompletableFuture<ResetHoneypotResponse> resetHoneypot(ResetHoneypotRequest request);

    /**
     * @param request the request parameters of ResetLogShipper  ResetLogShipperRequest
     * @return ResetLogShipperResponse
     */
    CompletableFuture<ResetLogShipperResponse> resetLogShipper(ResetLogShipperRequest request);

    /**
     * @param request the request parameters of RetryAgentlessTask  RetryAgentlessTaskRequest
     * @return RetryAgentlessTaskResponse
     */
    CompletableFuture<RetryAgentlessTaskResponse> retryAgentlessTask(RetryAgentlessTaskRequest request);

    /**
     * @param request the request parameters of RetryInstallProbe  RetryInstallProbeRequest
     * @return RetryInstallProbeResponse
     */
    CompletableFuture<RetryInstallProbeResponse> retryInstallProbe(RetryInstallProbeRequest request);

    /**
     * @param request the request parameters of RollbackSuspEventQuaraFile  RollbackSuspEventQuaraFileRequest
     * @return RollbackSuspEventQuaraFileResponse
     */
    CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request);

    /**
     * @param request the request parameters of SasInstallCode  SasInstallCodeRequest
     * @return SasInstallCodeResponse
     */
    CompletableFuture<SasInstallCodeResponse> sasInstallCode(SasInstallCodeRequest request);

    /**
     * @param request the request parameters of SaveCustomizeReportConfig  SaveCustomizeReportConfigRequest
     * @return SaveCustomizeReportConfigResponse
     */
    CompletableFuture<SaveCustomizeReportConfigResponse> saveCustomizeReportConfig(SaveCustomizeReportConfigRequest request);

    /**
     * @param request the request parameters of SaveImageBaselineStrategy  SaveImageBaselineStrategyRequest
     * @return SaveImageBaselineStrategyResponse
     */
    CompletableFuture<SaveImageBaselineStrategyResponse> saveImageBaselineStrategy(SaveImageBaselineStrategyRequest request);

    /**
     * @param request the request parameters of SaveSuspEventUserSetting  SaveSuspEventUserSettingRequest
     * @return SaveSuspEventUserSettingResponse
     */
    CompletableFuture<SaveSuspEventUserSettingResponse> saveSuspEventUserSetting(SaveSuspEventUserSettingRequest request);

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or enabled the feature, you can call this operation.</p>
     * 
     * @param request the request parameters of SaveWhiteListStrategy  SaveWhiteListStrategyRequest
     * @return SaveWhiteListStrategyResponse
     */
    CompletableFuture<SaveWhiteListStrategyResponse> saveWhiteListStrategy(SaveWhiteListStrategyRequest request);

    /**
     * @param request the request parameters of SaveWhiteListStrategyAssets  SaveWhiteListStrategyAssetsRequest
     * @return SaveWhiteListStrategyAssetsResponse
     */
    CompletableFuture<SaveWhiteListStrategyAssetsResponse> saveWhiteListStrategyAssets(SaveWhiteListStrategyAssetsRequest request);

    /**
     * @param request the request parameters of SendCustomizeReport  SendCustomizeReportRequest
     * @return SendCustomizeReportResponse
     */
    CompletableFuture<SendCustomizeReportResponse> sendCustomizeReport(SendCustomizeReportRequest request);

    /**
     * @param request the request parameters of SetBuildRiskDefineRuleConfig  SetBuildRiskDefineRuleConfigRequest
     * @return SetBuildRiskDefineRuleConfigResponse
     */
    CompletableFuture<SetBuildRiskDefineRuleConfigResponse> setBuildRiskDefineRuleConfig(SetBuildRiskDefineRuleConfigRequest request);

    /**
     * @param request the request parameters of SetClusterInterceptionConfig  SetClusterInterceptionConfigRequest
     * @return SetClusterInterceptionConfigResponse
     */
    CompletableFuture<SetClusterInterceptionConfigResponse> setClusterInterceptionConfig(SetClusterInterceptionConfigRequest request);

    /**
     * @param request the request parameters of SetImageBuildRiskStatus  SetImageBuildRiskStatusRequest
     * @return SetImageBuildRiskStatusResponse
     */
    CompletableFuture<SetImageBuildRiskStatusResponse> setImageBuildRiskStatus(SetImageBuildRiskStatusRequest request);

    /**
     * @param request the request parameters of SetImageSensitiveFileStatus  SetImageSensitiveFileStatusRequest
     * @return SetImageSensitiveFileStatusResponse
     */
    CompletableFuture<SetImageSensitiveFileStatusResponse> setImageSensitiveFileStatus(SetImageSensitiveFileStatusRequest request);

    /**
     * @param request the request parameters of SetRegistryScanDayNum  SetRegistryScanDayNumRequest
     * @return SetRegistryScanDayNumResponse
     */
    CompletableFuture<SetRegistryScanDayNumResponse> setRegistryScanDayNum(SetRegistryScanDayNumRequest request);

    /**
     * @param request the request parameters of SetSensitiveDefineRuleConfig  SetSensitiveDefineRuleConfigRequest
     * @return SetSensitiveDefineRuleConfigResponse
     */
    CompletableFuture<SetSensitiveDefineRuleConfigResponse> setSensitiveDefineRuleConfig(SetSensitiveDefineRuleConfigRequest request);

    /**
     * @param request the request parameters of SetSyncRefreshRegion  SetSyncRefreshRegionRequest
     * @return SetSyncRefreshRegionResponse
     */
    CompletableFuture<SetSyncRefreshRegionResponse> setSyncRefreshRegion(SetSyncRefreshRegionRequest request);

    /**
     * @deprecated OpenAPI StartBaselineSecurityCheck is deprecated, please use Sas::2018-12-03::SubmitCheck instead.  * @description This API operation is deprecated. Use SubmitCheck instead.
     * 
     * @param request the request parameters of StartBaselineSecurityCheck  StartBaselineSecurityCheckRequest
     * @return StartBaselineSecurityCheckResponse
     */
    @Deprecated
    CompletableFuture<StartBaselineSecurityCheckResponse> startBaselineSecurityCheck(StartBaselineSecurityCheckRequest request);

    /**
     * @param request the request parameters of StartDiscoverDatabaseTask  StartDiscoverDatabaseTaskRequest
     * @return StartDiscoverDatabaseTaskResponse
     */
    CompletableFuture<StartDiscoverDatabaseTaskResponse> startDiscoverDatabaseTask(StartDiscoverDatabaseTaskRequest request);

    /**
     * @param request the request parameters of StartHoneypot  StartHoneypotRequest
     * @return StartHoneypotResponse
     */
    CompletableFuture<StartHoneypotResponse> startHoneypot(StartHoneypotRequest request);

    /**
     * @param request the request parameters of StartIdcProbeScan  StartIdcProbeScanRequest
     * @return StartIdcProbeScanResponse
     */
    CompletableFuture<StartIdcProbeScanResponse> startIdcProbeScan(StartIdcProbeScanRequest request);

    /**
     * @param request the request parameters of StartPreCheckDatabase  StartPreCheckDatabaseRequest
     * @return StartPreCheckDatabaseResponse
     */
    CompletableFuture<StartPreCheckDatabaseResponse> startPreCheckDatabase(StartPreCheckDatabaseRequest request);

    /**
     * @param request the request parameters of StartVirusScanTask  StartVirusScanTaskRequest
     * @return StartVirusScanTaskResponse
     */
    CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that you have sufficient honeypot probe quota. First, create a management node by calling CreateHoneypotNode, then create a honeypot by calling CreateHoneypot. Wait until the honeypot enters the running state before calling this operation.</p>
     * 
     * @param request the request parameters of StopHoneypot  StopHoneypotRequest
     * @return StopHoneypotResponse
     */
    CompletableFuture<StopHoneypotResponse> stopHoneypot(StopHoneypotRequest request);

    /**
     * @param request the request parameters of SubmitCheck  SubmitCheckRequest
     * @return SubmitCheckResponse
     */
    CompletableFuture<SubmitCheckResponse> submitCheck(SubmitCheckRequest request);

    /**
     * @param request the request parameters of SubmitOperationTask  SubmitOperationTaskRequest
     * @return SubmitOperationTaskResponse
     */
    CompletableFuture<SubmitOperationTaskResponse> submitOperationTask(SubmitOperationTaskRequest request);

    /**
     * @param request the request parameters of SubmitTenantCheck  SubmitTenantCheckRequest
     * @return SubmitTenantCheckResponse
     */
    CompletableFuture<SubmitTenantCheckResponse> submitTenantCheck(SubmitTenantCheckRequest request);

    /**
     * @param request the request parameters of TriggerCheck  TriggerCheckRequest
     * @return TriggerCheckResponse
     */
    CompletableFuture<TriggerCheckResponse> triggerCheck(TriggerCheckRequest request);

    /**
     * @param request the request parameters of UnBindHybridProxy  UnBindHybridProxyRequest
     * @return UnBindHybridProxyResponse
     */
    CompletableFuture<UnBindHybridProxyResponse> unBindHybridProxy(UnBindHybridProxyRequest request);

    /**
     * @param request the request parameters of UnMarkMonitorAccounts  UnMarkMonitorAccountsRequest
     * @return UnMarkMonitorAccountsResponse
     */
    CompletableFuture<UnMarkMonitorAccountsResponse> unMarkMonitorAccounts(UnMarkMonitorAccountsRequest request);

    /**
     * <b>description</b> :
     * <p>If you no longer need Security Center to protect your non-Alibaba Cloud servers, you can call the UnbindAegis operation to unbind the servers. After a non-Alibaba Cloud server is unbound, the server no longer consumes your Security Center quota (the number of servers or compute cores). The released quota can then be used to protect other servers.</p>
     * <blockquote>
     * <p>Only non-Alibaba Cloud servers require the unbinding operation. Alibaba Cloud ECS instances do not require unbinding. For ECS instances, even if you uninstall the agent, the server still appears in the asset management list in an offline state and is not removed from the list.<br><strong>Before you begin</strong></p>
     * </blockquote>
     * <ul>
     * <li>The agent on the non-Alibaba Cloud server that you want to unbind has been paused (the client status is disabled). You can call the <a href="~~PauseClient~~">PauseClient</a> operation to pause the agent.</li>
     * <li>Client self-protection has been disabled on the non-Alibaba Cloud server that you want to unbind. For more information, see <a href="https://help.aliyun.com/document_detail/460802.html">Client self-protection</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UnbindAegis  UnbindAegisRequest
     * @return UnbindAegisResponse
     */
    CompletableFuture<UnbindAegisResponse> unbindAegis(UnbindAegisRequest request);

    /**
     * @param request the request parameters of UninstallBackupClient  UninstallBackupClientRequest
     * @return UninstallBackupClientResponse
     */
    CompletableFuture<UninstallBackupClientResponse> uninstallBackupClient(UninstallBackupClientRequest request);

    /**
     * @param request the request parameters of UninstallUniBackupAgent  UninstallUniBackupAgentRequest
     * @return UninstallUniBackupAgentResponse
     */
    CompletableFuture<UninstallUniBackupAgentResponse> uninstallUniBackupAgent(UninstallUniBackupAgentRequest request);

    /**
     * @param request the request parameters of UpdateAlarmEvent  UpdateAlarmEventRequest
     * @return UpdateAlarmEventResponse
     */
    CompletableFuture<UpdateAlarmEventResponse> updateAlarmEvent(UpdateAlarmEventRequest request);

    /**
     * @param request the request parameters of UpdateAttackPathSensitiveAssetConfig  UpdateAttackPathSensitiveAssetConfigRequest
     * @return UpdateAttackPathSensitiveAssetConfigResponse
     */
    CompletableFuture<UpdateAttackPathSensitiveAssetConfigResponse> updateAttackPathSensitiveAssetConfig(UpdateAttackPathSensitiveAssetConfigRequest request);

    /**
     * @param request the request parameters of UpdateAttackPathWhitelist  UpdateAttackPathWhitelistRequest
     * @return UpdateAttackPathWhitelistResponse
     */
    CompletableFuture<UpdateAttackPathWhitelistResponse> updateAttackPathWhitelist(UpdateAttackPathWhitelistRequest request);

    /**
     * @param request the request parameters of UpdateBaselineCheckWhiteRecord  UpdateBaselineCheckWhiteRecordRequest
     * @return UpdateBaselineCheckWhiteRecordResponse
     */
    CompletableFuture<UpdateBaselineCheckWhiteRecordResponse> updateBaselineCheckWhiteRecord(UpdateBaselineCheckWhiteRecordRequest request);

    /**
     * @param request the request parameters of UpdateCheckItem  UpdateCheckItemRequest
     * @return UpdateCheckItemResponse
     */
    CompletableFuture<UpdateCheckItemResponse> updateCheckItem(UpdateCheckItemRequest request);

    /**
     * @param request the request parameters of UpdateCheckPolicy  UpdateCheckPolicyRequest
     * @return UpdateCheckPolicyResponse
     */
    CompletableFuture<UpdateCheckPolicyResponse> updateCheckPolicy(UpdateCheckPolicyRequest request);

    /**
     * @param request the request parameters of UpdateCheckScopeConfig  UpdateCheckScopeConfigRequest
     * @return UpdateCheckScopeConfigResponse
     */
    CompletableFuture<UpdateCheckScopeConfigResponse> updateCheckScopeConfig(UpdateCheckScopeConfigRequest request);

    /**
     * @param request the request parameters of UpdateClientAlertMode  UpdateClientAlertModeRequest
     * @return UpdateClientAlertModeResponse
     */
    CompletableFuture<UpdateClientAlertModeResponse> updateClientAlertMode(UpdateClientAlertModeRequest request);

    /**
     * @param request the request parameters of UpdateCommonSwitchConfig  UpdateCommonSwitchConfigRequest
     * @return UpdateCommonSwitchConfigResponse
     */
    CompletableFuture<UpdateCommonSwitchConfigResponse> updateCommonSwitchConfig(UpdateCommonSwitchConfigRequest request);

    /**
     * @param request the request parameters of UpdateCustomizeReportStatus  UpdateCustomizeReportStatusRequest
     * @return UpdateCustomizeReportStatusResponse
     */
    CompletableFuture<UpdateCustomizeReportStatusResponse> updateCustomizeReportStatus(UpdateCustomizeReportStatusRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectClientEvent  UpdateFileProtectClientEventRequest
     * @return UpdateFileProtectClientEventResponse
     */
    CompletableFuture<UpdateFileProtectClientEventResponse> updateFileProtectClientEvent(UpdateFileProtectClientEventRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectClientRule  UpdateFileProtectClientRuleRequest
     * @return UpdateFileProtectClientRuleResponse
     */
    CompletableFuture<UpdateFileProtectClientRuleResponse> updateFileProtectClientRule(UpdateFileProtectClientRuleRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectClientRuleStatus  UpdateFileProtectClientRuleStatusRequest
     * @return UpdateFileProtectClientRuleStatusResponse
     */
    CompletableFuture<UpdateFileProtectClientRuleStatusResponse> updateFileProtectClientRuleStatus(UpdateFileProtectClientRuleStatusRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectEventStatus  UpdateFileProtectEventStatusRequest
     * @return UpdateFileProtectEventStatusResponse
     */
    CompletableFuture<UpdateFileProtectEventStatusResponse> updateFileProtectEventStatus(UpdateFileProtectEventStatusRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectRemark  UpdateFileProtectRemarkRequest
     * @return UpdateFileProtectRemarkResponse
     */
    CompletableFuture<UpdateFileProtectRemarkResponse> updateFileProtectRemark(UpdateFileProtectRemarkRequest request);

    /**
     * @param request the request parameters of UpdateFileProtectRule  UpdateFileProtectRuleRequest
     * @return UpdateFileProtectRuleResponse
     */
    CompletableFuture<UpdateFileProtectRuleResponse> updateFileProtectRule(UpdateFileProtectRuleRequest request);

    /**
     * @param request the request parameters of UpdateFileUploadLimit  UpdateFileUploadLimitRequest
     * @return UpdateFileUploadLimitResponse
     */
    CompletableFuture<UpdateFileUploadLimitResponse> updateFileUploadLimit(UpdateFileUploadLimitRequest request);

    /**
     * @param request the request parameters of UpdateHoneypot  UpdateHoneypotRequest
     * @return UpdateHoneypotResponse
     */
    CompletableFuture<UpdateHoneypotResponse> updateHoneypot(UpdateHoneypotRequest request);

    /**
     * @param request the request parameters of UpdateHoneypotNode  UpdateHoneypotNodeRequest
     * @return UpdateHoneypotNodeResponse
     */
    CompletableFuture<UpdateHoneypotNodeResponse> updateHoneypotNode(UpdateHoneypotNodeRequest request);

    /**
     * @param request the request parameters of UpdateHoneypotPreset  UpdateHoneypotPresetRequest
     * @return UpdateHoneypotPresetResponse
     */
    CompletableFuture<UpdateHoneypotPresetResponse> updateHoneypotPreset(UpdateHoneypotPresetRequest request);

    /**
     * @param request the request parameters of UpdateHoneypotProbe  UpdateHoneypotProbeRequest
     * @return UpdateHoneypotProbeResponse
     */
    CompletableFuture<UpdateHoneypotProbeResponse> updateHoneypotProbe(UpdateHoneypotProbeRequest request);

    /**
     * @param request the request parameters of UpdateHoneypotProbeBind  UpdateHoneypotProbeBindRequest
     * @return UpdateHoneypotProbeBindResponse
     */
    CompletableFuture<UpdateHoneypotProbeBindResponse> updateHoneypotProbeBind(UpdateHoneypotProbeBindRequest request);

    /**
     * @param request the request parameters of UpdateHybridProxy  UpdateHybridProxyRequest
     * @return UpdateHybridProxyResponse
     */
    CompletableFuture<UpdateHybridProxyResponse> updateHybridProxy(UpdateHybridProxyRequest request);

    /**
     * @param request the request parameters of UpdateImageEventOperation  UpdateImageEventOperationRequest
     * @return UpdateImageEventOperationResponse
     */
    CompletableFuture<UpdateImageEventOperationResponse> updateImageEventOperation(UpdateImageEventOperationRequest request);

    /**
     * @param request the request parameters of UpdateImageVulWhitelistTarget  UpdateImageVulWhitelistTargetRequest
     * @return UpdateImageVulWhitelistTargetResponse
     */
    CompletableFuture<UpdateImageVulWhitelistTargetResponse> updateImageVulWhitelistTarget(UpdateImageVulWhitelistTargetRequest request);

    /**
     * @param request the request parameters of UpdateJenkinsImageRegistryName  UpdateJenkinsImageRegistryNameRequest
     * @return UpdateJenkinsImageRegistryNameResponse
     */
    CompletableFuture<UpdateJenkinsImageRegistryNameResponse> updateJenkinsImageRegistryName(UpdateJenkinsImageRegistryNameRequest request);

    /**
     * @param request the request parameters of UpdateJenkinsImageRegistryPersistenceDay  UpdateJenkinsImageRegistryPersistenceDayRequest
     * @return UpdateJenkinsImageRegistryPersistenceDayResponse
     */
    CompletableFuture<UpdateJenkinsImageRegistryPersistenceDayResponse> updateJenkinsImageRegistryPersistenceDay(UpdateJenkinsImageRegistryPersistenceDayRequest request);

    /**
     * @param request the request parameters of UpdateMaliciousFileWhitelistConfig  UpdateMaliciousFileWhitelistConfigRequest
     * @return UpdateMaliciousFileWhitelistConfigResponse
     */
    CompletableFuture<UpdateMaliciousFileWhitelistConfigResponse> updateMaliciousFileWhitelistConfig(UpdateMaliciousFileWhitelistConfigRequest request);

    /**
     * @param request the request parameters of UpdateMultiUserInstances  UpdateMultiUserInstancesRequest
     * @return UpdateMultiUserInstancesResponse
     */
    CompletableFuture<UpdateMultiUserInstancesResponse> updateMultiUserInstances(UpdateMultiUserInstancesRequest request);

    /**
     * @param request the request parameters of UpdateOpaStrategyNew  UpdateOpaStrategyNewRequest
     * @return UpdateOpaStrategyNewResponse
     */
    CompletableFuture<UpdateOpaStrategyNewResponse> updateOpaStrategyNew(UpdateOpaStrategyNewRequest request);

    /**
     * @param request the request parameters of UpdateOssScanConfig  UpdateOssScanConfigRequest
     * @return UpdateOssScanConfigResponse
     */
    CompletableFuture<UpdateOssScanConfigResponse> updateOssScanConfig(UpdateOssScanConfigRequest request);

    /**
     * @param request the request parameters of UpdatePostPaidBindRel  UpdatePostPaidBindRelRequest
     * @return UpdatePostPaidBindRelResponse
     */
    CompletableFuture<UpdatePostPaidBindRelResponse> updatePostPaidBindRel(UpdatePostPaidBindRelRequest request);

    /**
     * @param request the request parameters of UpdatePublishAutoUpgrade  UpdatePublishAutoUpgradeRequest
     * @return UpdatePublishAutoUpgradeResponse
     */
    CompletableFuture<UpdatePublishAutoUpgradeResponse> updatePublishAutoUpgrade(UpdatePublishAutoUpgradeRequest request);

    /**
     * @param request the request parameters of UpdatePublishBatch  UpdatePublishBatchRequest
     * @return UpdatePublishBatchResponse
     */
    CompletableFuture<UpdatePublishBatchResponse> updatePublishBatch(UpdatePublishBatchRequest request);

    /**
     * @param request the request parameters of UpdatePublishCron  UpdatePublishCronRequest
     * @return UpdatePublishCronResponse
     */
    CompletableFuture<UpdatePublishCronResponse> updatePublishCron(UpdatePublishCronRequest request);

    /**
     * @param request the request parameters of UpdatePublishGraySwitch  UpdatePublishGraySwitchRequest
     * @return UpdatePublishGraySwitchResponse
     */
    CompletableFuture<UpdatePublishGraySwitchResponse> updatePublishGraySwitch(UpdatePublishGraySwitchRequest request);

    /**
     * @param request the request parameters of UpdateSelectionKeyByType  UpdateSelectionKeyByTypeRequest
     * @return UpdateSelectionKeyByTypeResponse
     */
    CompletableFuture<UpdateSelectionKeyByTypeResponse> updateSelectionKeyByType(UpdateSelectionKeyByTypeRequest request);

    /**
     * @param request the request parameters of UpdateStrictEventName  UpdateStrictEventNameRequest
     * @return UpdateStrictEventNameResponse
     */
    CompletableFuture<UpdateStrictEventNameResponse> updateStrictEventName(UpdateStrictEventNameRequest request);

    /**
     * @param request the request parameters of UpdateTargetListByBatch  UpdateTargetListByBatchRequest
     * @return UpdateTargetListByBatchResponse
     */
    CompletableFuture<UpdateTargetListByBatchResponse> updateTargetListByBatch(UpdateTargetListByBatchRequest request);

    /**
     * @param request the request parameters of UpdateUnknownThreatDetectProcess  UpdateUnknownThreatDetectProcessRequest
     * @return UpdateUnknownThreatDetectProcessResponse
     */
    CompletableFuture<UpdateUnknownThreatDetectProcessResponse> updateUnknownThreatDetectProcess(UpdateUnknownThreatDetectProcessRequest request);

    /**
     * @param request the request parameters of UpdateUnknownThreatDetectStrategy  UpdateUnknownThreatDetectStrategyRequest
     * @return UpdateUnknownThreatDetectStrategyResponse
     */
    CompletableFuture<UpdateUnknownThreatDetectStrategyResponse> updateUnknownThreatDetectStrategy(UpdateUnknownThreatDetectStrategyRequest request);

    /**
     * @param request the request parameters of UpdateWhiteList  UpdateWhiteListRequest
     * @return UpdateWhiteListResponse
     */
    CompletableFuture<UpdateWhiteListResponse> updateWhiteList(UpdateWhiteListRequest request);

    /**
     * <b>description</b> :
     * <p>Application whitelist is a China-site public preview feature that no longer accepts new applications. Users who have already applied for or are using this feature can call this operation as usual.</p>
     * 
     * @param request the request parameters of UpdateWhiteListStrategyStatus  UpdateWhiteListStrategyStatusRequest
     * @return UpdateWhiteListStrategyStatusResponse
     */
    CompletableFuture<UpdateWhiteListStrategyStatusResponse> updateWhiteListStrategyStatus(UpdateWhiteListStrategyStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation upgrades a v1.0.0 backup policy to v2.0.0. Before you call this operation, make sure that the ECS instance is running, Cloud Assistant is installed, the Security Center agent is online, and a v1.0.0 policy exists. You can call <a href="~~CreateBackupPolicy~~">CreateBackupPolicy</a> with PolicyVersion set to 1.0.0 to create a policy, and then call DescribeBackupPolicies to obtain the policy ID.
     * Before you call this operation, you can check or complete the following prerequisites:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Prerequisite</th>
     * <th>Related API</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>The ECS instance is running.</td>
     * <td><a href="https://api.aliyun.com/document/Ecs/2014-05-26/StartInstance">Ecs/StartInstance</a></td>
     * </tr>
     * <tr>
     * <td>Cloud Assistant is installed on the ECS instance.</td>
     * <td><a href="https://api.aliyun.com/document/Ecs/2014-05-26/InstallCloudAssistant">Ecs/InstallCloudAssistant</a></td>
     * </tr>
     * <tr>
     * <td>The Security Center agent is installed.</td>
     * <td><a href="~~OperateAgentClientInstall~~">OperateAgentClientInstall</a></td>
     * </tr>
     * <tr>
     * <td>Check the agent installation status.</td>
     * <td><a href="~~DescribeAgentInstallStatus~~">DescribeAgentInstallStatus</a></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpgradeBackupPolicyVersion  UpgradeBackupPolicyVersionRequest
     * @return UpgradeBackupPolicyVersionResponse
     */
    CompletableFuture<UpgradeBackupPolicyVersionResponse> upgradeBackupPolicyVersion(UpgradeBackupPolicyVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation to upgrade a honeypot management node version, ensure the following prerequisites are met:</p>
     * <ol>
     * <li>A honeypot management node already exists. If no node exists, call the CreateHoneypotNode operation to create one first.</li>
     * <li>The probe quota is greater than zero (TotalProbeCount is greater than 0). The probe quota is allocated by purchasing a Security Center honeypot subscription.</li>
     * <li>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain the NodeId of the management node to be upgraded.</li>
     * </ol>
     * 
     * @param request the request parameters of UpgradeHoneypotNode  UpgradeHoneypotNodeRequest
     * @return UpgradeHoneypotNodeResponse
     */
    CompletableFuture<UpgradeHoneypotNodeResponse> upgradeHoneypotNode(UpgradeHoneypotNodeRequest request);

    /**
     * @param request the request parameters of UpgradeVersionByUuids  UpgradeVersionByUuidsRequest
     * @return UpgradeVersionByUuidsResponse
     */
    CompletableFuture<UpgradeVersionByUuidsResponse> upgradeVersionByUuids(UpgradeVersionByUuidsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, complete the following steps in order:</p>
     * <ol>
     * <li>Call <a href="~~CreateHoneypotNode~~">CreateHoneypotNode</a> to create a management node, or call <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> to query existing nodes and obtain a valid NodeId.</li>
     * <li>Call <a href="~~GetHoneyPotUploadPolicyInfo~~">GetHoneyPotUploadPolicyInfo</a> to obtain the OSS upload credentials, upload policy, and Data.Key.</li>
     * <li>Use the returned STS credentials to upload the file to the specified bucket by using the OSS PostObject protocol.</li>
     * <li>After the file is uploaded, call this operation to register the upload result.</li>
     * </ol>
     * 
     * @param request the request parameters of UploadedHoneyPotFile  UploadedHoneyPotFileRequest
     * @return UploadedHoneyPotFileResponse
     */
    CompletableFuture<UploadedHoneyPotFileResponse> uploadedHoneyPotFile(UploadedHoneyPotFileRequest request);

    /**
     * @param request the request parameters of ValidateHcWarnings  ValidateHcWarningsRequest
     * @return ValidateHcWarningsResponse
     */
    CompletableFuture<ValidateHcWarningsResponse> validateHcWarnings(ValidateHcWarningsRequest request);

    /**
     * @param request the request parameters of VerifyCheckCustomConfig  VerifyCheckCustomConfigRequest
     * @return VerifyCheckCustomConfigResponse
     */
    CompletableFuture<VerifyCheckCustomConfigResponse> verifyCheckCustomConfig(VerifyCheckCustomConfigRequest request);

    /**
     * @param request the request parameters of VerifyCheckInstanceResult  VerifyCheckInstanceResultRequest
     * @return VerifyCheckInstanceResultResponse
     */
    CompletableFuture<VerifyCheckInstanceResultResponse> verifyCheckInstanceResult(VerifyCheckInstanceResultRequest request);

    /**
     * @param request the request parameters of VerifyCheckResult  VerifyCheckResultRequest
     * @return VerifyCheckResultResponse
     */
    CompletableFuture<VerifyCheckResultResponse> verifyCheckResult(VerifyCheckResultRequest request);

}
