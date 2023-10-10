// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.edas20170801.models.*;
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

    CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request);

    CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request);

    CompletableFuture<AddLogPathResponse> addLogPath(AddLogPathRequest request);

    CompletableFuture<AuthorizeApplicationResponse> authorizeApplication(AuthorizeApplicationRequest request);

    CompletableFuture<AuthorizeResourceGroupResponse> authorizeResourceGroup(AuthorizeResourceGroupRequest request);

    CompletableFuture<AuthorizeRoleResponse> authorizeRole(AuthorizeRoleRequest request);

    CompletableFuture<BindEcsSlbResponse> bindEcsSlb(BindEcsSlbRequest request);

    CompletableFuture<BindK8sSlbResponse> bindK8sSlb(BindK8sSlbRequest request);

    CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request);

    CompletableFuture<ChangeDeployGroupResponse> changeDeployGroup(ChangeDeployGroupRequest request);

    CompletableFuture<ContinuePipelineResponse> continuePipeline(ContinuePipelineRequest request);

    CompletableFuture<ConvertK8sResourceResponse> convertK8sResource(ConvertK8sResourceRequest request);

    CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request);

    CompletableFuture<CreateConfigTemplateResponse> createConfigTemplate(CreateConfigTemplateRequest request);

    /**
      * ## Description
      * You must call the CreateIDCImportCommand operation first to generate a command used to import hybrid cloud ECS instances to a hybrid cloud ECS cluster. Then, run this command on the instances to import the instances to the cluster.
      *
     */
    CompletableFuture<CreateIDCImportCommandResponse> createIDCImportCommand(CreateIDCImportCommandRequest request);

    CompletableFuture<CreateK8sConfigMapResponse> createK8sConfigMap(CreateK8sConfigMapRequest request);

    CompletableFuture<CreateK8sIngressRuleResponse> createK8sIngressRule(CreateK8sIngressRuleRequest request);

    CompletableFuture<CreateK8sSecretResponse> createK8sSecret(CreateK8sSecretRequest request);

    CompletableFuture<CreateK8sServiceResponse> createK8sService(CreateK8sServiceRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteClusterMemberResponse> deleteClusterMember(DeleteClusterMemberRequest request);

    CompletableFuture<DeleteConfigTemplateResponse> deleteConfigTemplate(DeleteConfigTemplateRequest request);

    CompletableFuture<DeleteDeployGroupResponse> deleteDeployGroup(DeleteDeployGroupRequest request);

    CompletableFuture<DeleteEcuResponse> deleteEcu(DeleteEcuRequest request);

    CompletableFuture<DeleteK8sApplicationResponse> deleteK8sApplication(DeleteK8sApplicationRequest request);

    CompletableFuture<DeleteK8sConfigMapResponse> deleteK8sConfigMap(DeleteK8sConfigMapRequest request);

    CompletableFuture<DeleteK8sIngressRuleResponse> deleteK8sIngressRule(DeleteK8sIngressRuleRequest request);

    CompletableFuture<DeleteK8sSecretResponse> deleteK8sSecret(DeleteK8sSecretRequest request);

    CompletableFuture<DeleteK8sServiceResponse> deleteK8sService(DeleteK8sServiceRequest request);

    CompletableFuture<DeleteLogPathResponse> deleteLogPath(DeleteLogPathRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    CompletableFuture<DeleteServiceGroupResponse> deleteServiceGroup(DeleteServiceGroupRequest request);

    CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request);

    CompletableFuture<DeleteUserDefineRegionResponse> deleteUserDefineRegion(DeleteUserDefineRegionRequest request);

    /**
      * > To deploy an application in a Container Service for Kubernetes (ACK) cluster that is imported into Enterprise Distributed Application Service (EDAS), call the DeployK8sApplication operation provided by EDAS. For more information, see [](~~149420~~)DeployK8sApplication.
      *
     */
    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    CompletableFuture<DeployK8sApplicationResponse> deployK8sApplication(DeployK8sApplicationRequest request);

    CompletableFuture<DescribeAppInstanceListResponse> describeAppInstanceList(DescribeAppInstanceListRequest request);

    CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request);

    CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request);

    CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request);

    CompletableFuture<GetAppDeploymentResponse> getAppDeployment(GetAppDeploymentRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetChangeOrderInfoResponse> getChangeOrderInfo(GetChangeOrderInfoRequest request);

    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    CompletableFuture<GetContainerConfigurationResponse> getContainerConfiguration(GetContainerConfigurationRequest request);

    CompletableFuture<GetJavaStartUpConfigResponse> getJavaStartUpConfig(GetJavaStartUpConfigRequest request);

    CompletableFuture<GetJvmConfigurationResponse> getJvmConfiguration(GetJvmConfigurationRequest request);

    CompletableFuture<GetK8sAppPrecheckResultResponse> getK8sAppPrecheckResult(GetK8sAppPrecheckResultRequest request);

    CompletableFuture<GetK8sApplicationResponse> getK8sApplication(GetK8sApplicationRequest request);

    CompletableFuture<GetK8sClusterResponse> getK8sCluster(GetK8sClusterRequest request);

    CompletableFuture<GetK8sServicesResponse> getK8sServices(GetK8sServicesRequest request);

    CompletableFuture<GetPackageStorageCredentialResponse> getPackageStorageCredential(GetPackageStorageCredentialRequest request);

    CompletableFuture<GetScalingRulesResponse> getScalingRules(GetScalingRulesRequest request);

    CompletableFuture<GetSecureTokenResponse> getSecureToken(GetSecureTokenRequest request);

    CompletableFuture<GetServiceConsumersPageResponse> getServiceConsumersPage(GetServiceConsumersPageRequest request);

    CompletableFuture<GetServiceDetailResponse> getServiceDetail(GetServiceDetailRequest request);

    CompletableFuture<GetServiceListPageResponse> getServiceListPage(GetServiceListPageRequest request);

    CompletableFuture<GetServiceMethodPageResponse> getServiceMethodPage(GetServiceMethodPageRequest request);

    CompletableFuture<GetServiceProvidersPageResponse> getServiceProvidersPage(GetServiceProvidersPageRequest request);

    /**
      * ***
      *
     */
    CompletableFuture<GetWebContainerConfigResponse> getWebContainerConfig(GetWebContainerConfigRequest request);

    CompletableFuture<ImportK8sClusterResponse> importK8sCluster(ImportK8sClusterRequest request);

    /**
      * > To create an application in a Kubernetes cluster, call the InsertK8sApplication operation provided by Enterprise Distributed Application Service (EDAS).
      *
     */
    CompletableFuture<InsertApplicationResponse> insertApplication(InsertApplicationRequest request);

    CompletableFuture<InsertClusterResponse> insertCluster(InsertClusterRequest request);

    /**
      * ##
      * If you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all original data of the ECS instance is deleted. In addition, you must set a logon password for the ECS instance. Make sure that no important data exists on the ECS instance that you want to import or data has been backed up for the ECS instance.
      * > We recommend that you call the InstallAgent operation instead of this operation. For more information, see [InstallAgent](~~127023~~).
      *
     */
    CompletableFuture<InsertClusterMemberResponse> insertClusterMember(InsertClusterMemberRequest request);

    CompletableFuture<InsertDeployGroupResponse> insertDeployGroup(InsertDeployGroupRequest request);

    CompletableFuture<InsertK8sApplicationResponse> insertK8sApplication(InsertK8sApplicationRequest request);

    CompletableFuture<InsertOrUpdateRegionResponse> insertOrUpdateRegion(InsertOrUpdateRegionRequest request);

    CompletableFuture<InsertRoleResponse> insertRole(InsertRoleRequest request);

    CompletableFuture<InsertServiceGroupResponse> insertServiceGroup(InsertServiceGroupRequest request);

    CompletableFuture<InsertSwimmingLaneResponse> insertSwimmingLane(InsertSwimmingLaneRequest request);

    CompletableFuture<InsertSwimmingLaneGroupResponse> insertSwimmingLaneGroup(InsertSwimmingLaneGroupRequest request);

    /**
      * If you call this operation to import an ECS instance into EDAS, the operating system of the ECS instance is not reinstalled. We recommend that you call this operation to import ECS instances into EDAS.
      *
     */
    CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request);

    CompletableFuture<ListAliyunRegionResponse> listAliyunRegion(ListAliyunRegionRequest request);

    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    CompletableFuture<ListApplicationEcuResponse> listApplicationEcu(ListApplicationEcuRequest request);

    CompletableFuture<ListAuthorityResponse> listAuthority(ListAuthorityRequest request);

    CompletableFuture<ListBuildPackResponse> listBuildPack(ListBuildPackRequest request);

    CompletableFuture<ListClusterResponse> listCluster(ListClusterRequest request);

    CompletableFuture<ListClusterMembersResponse> listClusterMembers(ListClusterMembersRequest request);

    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    CompletableFuture<ListConfigTemplatesResponse> listConfigTemplates(ListConfigTemplatesRequest request);

    CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request);

    CompletableFuture<ListConvertableEcuResponse> listConvertableEcu(ListConvertableEcuRequest request);

    CompletableFuture<ListDeployGroupResponse> listDeployGroup(ListDeployGroupRequest request);

    CompletableFuture<ListEcsNotInClusterResponse> listEcsNotInCluster(ListEcsNotInClusterRequest request);

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
     */
    CompletableFuture<ListEcuByRegionResponse> listEcuByRegion(ListEcuByRegionRequest request);

    CompletableFuture<ListHistoryDeployVersionResponse> listHistoryDeployVersion(ListHistoryDeployVersionRequest request);

    CompletableFuture<ListK8sConfigMapsResponse> listK8sConfigMaps(ListK8sConfigMapsRequest request);

    CompletableFuture<ListK8sIngressRulesResponse> listK8sIngressRules(ListK8sIngressRulesRequest request);

    CompletableFuture<ListK8sNamespacesResponse> listK8sNamespaces(ListK8sNamespacesRequest request);

    CompletableFuture<ListK8sSecretsResponse> listK8sSecrets(ListK8sSecretsRequest request);

    CompletableFuture<ListMethodsResponse> listMethods(ListMethodsRequest request);

    CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request);

    CompletableFuture<ListRecentChangeOrderResponse> listRecentChangeOrder(ListRecentChangeOrderRequest request);

    CompletableFuture<ListResourceGroupResponse> listResourceGroup(ListResourceGroupRequest request);

    CompletableFuture<ListRoleResponse> listRole(ListRoleRequest request);

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
     */
    CompletableFuture<ListScaleOutEcuResponse> listScaleOutEcu(ListScaleOutEcuRequest request);

    CompletableFuture<ListServiceGroupsResponse> listServiceGroups(ListServiceGroupsRequest request);

    CompletableFuture<ListSlbResponse> listSlb(ListSlbRequest request);

    CompletableFuture<ListSubAccountResponse> listSubAccount(ListSubAccountRequest request);

    CompletableFuture<ListSwimmingLaneResponse> listSwimmingLane(ListSwimmingLaneRequest request);

    CompletableFuture<ListSwimmingLaneGroupResponse> listSwimmingLaneGroup(ListSwimmingLaneGroupRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserDefineRegionResponse> listUserDefineRegion(ListUserDefineRegionRequest request);

    CompletableFuture<ListVpcResponse> listVpc(ListVpcRequest request);

    /**
      * ## Limits
      * We recommend that you do not call this operation. Instead, we recommend that you call the TransformClusterMember operation. For more information, see [TransformClusterMember](~~71514~~).
      * When you call this operation to import an Elastic Compute Service (ECS) instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources and microservices in Enterprise Distributed Application Service (EDAS). The resources include clusters, ECS instances, and applications. You can use a default or custom namespace. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources or microservices.
      * *   **ECU**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
     */
    CompletableFuture<MigrateEcuResponse> migrateEcu(MigrateEcuRequest request);

    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    CompletableFuture<QueryApplicationStatusResponse> queryApplicationStatus(QueryApplicationStatusRequest request);

    CompletableFuture<QueryEccInfoResponse> queryEccInfo(QueryEccInfoRequest request);

    CompletableFuture<QueryMigrateEcuListResponse> queryMigrateEcuList(QueryMigrateEcuListRequest request);

    CompletableFuture<QueryMigrateRegionListResponse> queryMigrateRegionList(QueryMigrateRegionListRequest request);

    CompletableFuture<QueryRegionConfigResponse> queryRegionConfig(QueryRegionConfigRequest request);

    CompletableFuture<QuerySlsLogStoreListResponse> querySlsLogStoreList(QuerySlsLogStoreListRequest request);

    CompletableFuture<ResetApplicationResponse> resetApplication(ResetApplicationRequest request);

    CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request);

    CompletableFuture<RestartK8sApplicationResponse> restartK8sApplication(RestartK8sApplicationRequest request);

    CompletableFuture<RetryChangeOrderTaskResponse> retryChangeOrderTask(RetryChangeOrderTaskRequest request);

    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    CompletableFuture<RollbackChangeOrderResponse> rollbackChangeOrder(RollbackChangeOrderRequest request);

    CompletableFuture<ScaleInApplicationResponse> scaleInApplication(ScaleInApplicationRequest request);

    CompletableFuture<ScaleK8sApplicationResponse> scaleK8sApplication(ScaleK8sApplicationRequest request);

    CompletableFuture<ScaleOutApplicationResponse> scaleOutApplication(ScaleOutApplicationRequest request);

    /**
      * ## Limits
      * Assume that the auto scaling feature is configured and enabled for an application. When an auto scale-in is triggered for the application, the ECS instances that are purchased by calling this operation are removed first.
      *
     */
    CompletableFuture<ScaleoutApplicationWithNewInstancesResponse> scaleoutApplicationWithNewInstances(ScaleoutApplicationWithNewInstancesRequest request);

    CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request);

    CompletableFuture<StartK8sAppPrecheckResponse> startK8sAppPrecheck(StartK8sAppPrecheckRequest request);

    CompletableFuture<StartK8sApplicationResponse> startK8sApplication(StartK8sApplicationRequest request);

    CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request);

    CompletableFuture<StopK8sApplicationResponse> stopK8sApplication(StopK8sApplicationRequest request);

    /**
      * To call the SwitchAdvancedMonitoring operation, you must make sure that the version of Enterprise Distributed Application Service (EDAS) SDK for Java or Python is 3.15.2 or later.
      *
     */
    CompletableFuture<SwitchAdvancedMonitoringResponse> switchAdvancedMonitoring(SwitchAdvancedMonitoringRequest request);

    /**
      * If you call this operation to synchronize ECS resource information, all instance data is synchronized from ECS. If you have more than 100 ECS instances, we recommend that you do not frequently call this operation.
      *
     */
    CompletableFuture<SynchronizeResourceResponse> synchronizeResource(SynchronizeResourceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * ## Limits
      * When you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      *
     */
    CompletableFuture<TransformClusterMemberResponse> transformClusterMember(TransformClusterMemberRequest request);

    CompletableFuture<UnbindK8sSlbResponse> unbindK8sSlb(UnbindK8sSlbRequest request);

    CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAccountInfoResponse> updateAccountInfo(UpdateAccountInfoRequest request);

    CompletableFuture<UpdateApplicationBaseInfoResponse> updateApplicationBaseInfo(UpdateApplicationBaseInfoRequest request);

    CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request);

    CompletableFuture<UpdateConfigTemplateResponse> updateConfigTemplate(UpdateConfigTemplateRequest request);

    CompletableFuture<UpdateContainerResponse> updateContainer(UpdateContainerRequest request);

    CompletableFuture<UpdateContainerConfigurationResponse> updateContainerConfiguration(UpdateContainerConfigurationRequest request);

    CompletableFuture<UpdateHealthCheckUrlResponse> updateHealthCheckUrl(UpdateHealthCheckUrlRequest request);

    CompletableFuture<UpdateHookConfigurationResponse> updateHookConfiguration(UpdateHookConfigurationRequest request);

    CompletableFuture<UpdateJvmConfigurationResponse> updateJvmConfiguration(UpdateJvmConfigurationRequest request);

    CompletableFuture<UpdateK8sApplicationBaseInfoResponse> updateK8sApplicationBaseInfo(UpdateK8sApplicationBaseInfoRequest request);

    CompletableFuture<UpdateK8sApplicationConfigResponse> updateK8sApplicationConfig(UpdateK8sApplicationConfigRequest request);

    CompletableFuture<UpdateK8sConfigMapResponse> updateK8sConfigMap(UpdateK8sConfigMapRequest request);

    CompletableFuture<UpdateK8sIngressRuleResponse> updateK8sIngressRule(UpdateK8sIngressRuleRequest request);

    /**
      * > You can update only Deployments.
      *
     */
    CompletableFuture<UpdateK8sResourceResponse> updateK8sResource(UpdateK8sResourceRequest request);

    CompletableFuture<UpdateK8sSecretResponse> updateK8sSecret(UpdateK8sSecretRequest request);

    CompletableFuture<UpdateK8sServiceResponse> updateK8sService(UpdateK8sServiceRequest request);

    CompletableFuture<UpdateK8sSlbResponse> updateK8sSlb(UpdateK8sSlbRequest request);

    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    CompletableFuture<UpdateSlsLogStoreResponse> updateSlsLogStore(UpdateSlsLogStoreRequest request);

    CompletableFuture<UpdateSwimmingLaneResponse> updateSwimmingLane(UpdateSwimmingLaneRequest request);

    CompletableFuture<UpdateSwimmingLaneGroupResponse> updateSwimmingLaneGroup(UpdateSwimmingLaneGroupRequest request);

}
