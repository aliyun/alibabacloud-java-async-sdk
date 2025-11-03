// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.edas20170801.models.*;
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
     * @param request the request parameters of AbortAndRollbackChangeOrder  AbortAndRollbackChangeOrderRequest
     * @return AbortAndRollbackChangeOrderResponse
     */
    CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request);

    /**
     * @param request the request parameters of AbortChangeOrder  AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request);

    /**
     * @param request the request parameters of AddLogPath  AddLogPathRequest
     * @return AddLogPathResponse
     */
    CompletableFuture<AddLogPathResponse> addLogPath(AddLogPathRequest request);

    /**
     * @param request the request parameters of AuthorizeApplication  AuthorizeApplicationRequest
     * @return AuthorizeApplicationResponse
     */
    CompletableFuture<AuthorizeApplicationResponse> authorizeApplication(AuthorizeApplicationRequest request);

    /**
     * @param request the request parameters of AuthorizeResourceGroup  AuthorizeResourceGroupRequest
     * @return AuthorizeResourceGroupResponse
     */
    CompletableFuture<AuthorizeResourceGroupResponse> authorizeResourceGroup(AuthorizeResourceGroupRequest request);

    /**
     * @param request the request parameters of AuthorizeRole  AuthorizeRoleRequest
     * @return AuthorizeRoleResponse
     */
    CompletableFuture<AuthorizeRoleResponse> authorizeRole(AuthorizeRoleRequest request);

    /**
     * @param request the request parameters of BindEcsSlb  BindEcsSlbRequest
     * @return BindEcsSlbResponse
     */
    CompletableFuture<BindEcsSlbResponse> bindEcsSlb(BindEcsSlbRequest request);

    /**
     * @param request the request parameters of BindK8sSlb  BindK8sSlbRequest
     * @return BindK8sSlbResponse
     */
    CompletableFuture<BindK8sSlbResponse> bindK8sSlb(BindK8sSlbRequest request);

    /**
     * @param request the request parameters of BindSlb  BindSlbRequest
     * @return BindSlbResponse
     */
    CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request);

    /**
     * @param request the request parameters of ChangeDeployGroup  ChangeDeployGroupRequest
     * @return ChangeDeployGroupResponse
     */
    CompletableFuture<ChangeDeployGroupResponse> changeDeployGroup(ChangeDeployGroupRequest request);

    /**
     * @param request the request parameters of ContinuePipeline  ContinuePipelineRequest
     * @return ContinuePipelineResponse
     */
    CompletableFuture<ContinuePipelineResponse> continuePipeline(ContinuePipelineRequest request);

    /**
     * @param request the request parameters of ConvertK8sResource  ConvertK8sResourceRequest
     * @return ConvertK8sResourceResponse
     */
    CompletableFuture<ConvertK8sResourceResponse> convertK8sResource(ConvertK8sResourceRequest request);

    /**
     * @param request the request parameters of CreateApplicationScalingRule  CreateApplicationScalingRuleRequest
     * @return CreateApplicationScalingRuleResponse
     */
    CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of CreateConfigTemplate  CreateConfigTemplateRequest
     * @return CreateConfigTemplateResponse
     */
    CompletableFuture<CreateConfigTemplateResponse> createConfigTemplate(CreateConfigTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>You must call the CreateIDCImportCommand operation first to generate a command used to import hybrid cloud ECS instances to a hybrid cloud ECS cluster. Then, run this command on the instances to import the instances to the cluster.</p>
     * 
     * @param request the request parameters of CreateIDCImportCommand  CreateIDCImportCommandRequest
     * @return CreateIDCImportCommandResponse
     */
    CompletableFuture<CreateIDCImportCommandResponse> createIDCImportCommand(CreateIDCImportCommandRequest request);

    /**
     * @param request the request parameters of CreateK8sConfigMap  CreateK8sConfigMapRequest
     * @return CreateK8sConfigMapResponse
     */
    CompletableFuture<CreateK8sConfigMapResponse> createK8sConfigMap(CreateK8sConfigMapRequest request);

    /**
     * @param request the request parameters of CreateK8sIngressRule  CreateK8sIngressRuleRequest
     * @return CreateK8sIngressRuleResponse
     */
    CompletableFuture<CreateK8sIngressRuleResponse> createK8sIngressRule(CreateK8sIngressRuleRequest request);

    /**
     * @param request the request parameters of CreateK8sSecret  CreateK8sSecretRequest
     * @return CreateK8sSecretResponse
     */
    CompletableFuture<CreateK8sSecretResponse> createK8sSecret(CreateK8sSecretRequest request);

    /**
     * @param request the request parameters of CreateK8sService  CreateK8sServiceRequest
     * @return CreateK8sServiceResponse
     */
    CompletableFuture<CreateK8sServiceResponse> createK8sService(CreateK8sServiceRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeleteApplicationScalingRule  DeleteApplicationScalingRuleRequest
     * @return DeleteApplicationScalingRuleResponse
     */
    CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteClusterMember  DeleteClusterMemberRequest
     * @return DeleteClusterMemberResponse
     */
    CompletableFuture<DeleteClusterMemberResponse> deleteClusterMember(DeleteClusterMemberRequest request);

    /**
     * @param request the request parameters of DeleteConfigTemplate  DeleteConfigTemplateRequest
     * @return DeleteConfigTemplateResponse
     */
    CompletableFuture<DeleteConfigTemplateResponse> deleteConfigTemplate(DeleteConfigTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDeployGroup  DeleteDeployGroupRequest
     * @return DeleteDeployGroupResponse
     */
    CompletableFuture<DeleteDeployGroupResponse> deleteDeployGroup(DeleteDeployGroupRequest request);

    /**
     * @param request the request parameters of DeleteEcu  DeleteEcuRequest
     * @return DeleteEcuResponse
     */
    CompletableFuture<DeleteEcuResponse> deleteEcu(DeleteEcuRequest request);

    /**
     * @param request the request parameters of DeleteK8sApplication  DeleteK8sApplicationRequest
     * @return DeleteK8sApplicationResponse
     */
    CompletableFuture<DeleteK8sApplicationResponse> deleteK8sApplication(DeleteK8sApplicationRequest request);

    /**
     * @param request the request parameters of DeleteK8sConfigMap  DeleteK8sConfigMapRequest
     * @return DeleteK8sConfigMapResponse
     */
    CompletableFuture<DeleteK8sConfigMapResponse> deleteK8sConfigMap(DeleteK8sConfigMapRequest request);

    /**
     * @param request the request parameters of DeleteK8sIngressRule  DeleteK8sIngressRuleRequest
     * @return DeleteK8sIngressRuleResponse
     */
    CompletableFuture<DeleteK8sIngressRuleResponse> deleteK8sIngressRule(DeleteK8sIngressRuleRequest request);

    /**
     * @param request the request parameters of DeleteK8sSecret  DeleteK8sSecretRequest
     * @return DeleteK8sSecretResponse
     */
    CompletableFuture<DeleteK8sSecretResponse> deleteK8sSecret(DeleteK8sSecretRequest request);

    /**
     * @param request the request parameters of DeleteK8sService  DeleteK8sServiceRequest
     * @return DeleteK8sServiceResponse
     */
    CompletableFuture<DeleteK8sServiceResponse> deleteK8sService(DeleteK8sServiceRequest request);

    /**
     * @param request the request parameters of DeleteLogPath  DeleteLogPathRequest
     * @return DeleteLogPathResponse
     */
    CompletableFuture<DeleteLogPathResponse> deleteLogPath(DeleteLogPathRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * @param request the request parameters of DeleteServiceGroup  DeleteServiceGroupRequest
     * @return DeleteServiceGroupResponse
     */
    CompletableFuture<DeleteServiceGroupResponse> deleteServiceGroup(DeleteServiceGroupRequest request);

    /**
     * @param request the request parameters of DeleteSwimmingLane  DeleteSwimmingLaneRequest
     * @return DeleteSwimmingLaneResponse
     */
    CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request);

    /**
     * @param request the request parameters of DeleteUserDefineRegion  DeleteUserDefineRegionRequest
     * @return DeleteUserDefineRegionResponse
     */
    CompletableFuture<DeleteUserDefineRegionResponse> deleteUserDefineRegion(DeleteUserDefineRegionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To deploy an application in a Container Service for Kubernetes (ACK) cluster that is imported into Enterprise Distributed Application Service (EDAS), call the DeployK8sApplication operation provided by EDAS. For more information, see <a href="~~149420~~"></a>DeployK8sApplication.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeployApplication  DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    /**
     * @param request the request parameters of DeployK8sApplication  DeployK8sApplicationRequest
     * @return DeployK8sApplicationResponse
     */
    CompletableFuture<DeployK8sApplicationResponse> deployK8sApplication(DeployK8sApplicationRequest request);

    /**
     * @param request the request parameters of DescribeAppInstanceList  DescribeAppInstanceListRequest
     * @return DescribeAppInstanceListResponse
     */
    CompletableFuture<DescribeAppInstanceListResponse> describeAppInstanceList(DescribeAppInstanceListRequest request);

    /**
     * @param request the request parameters of DescribeApplicationScalingRules  DescribeApplicationScalingRulesRequest
     * @return DescribeApplicationScalingRulesResponse
     */
    CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request);

    /**
     * @param request the request parameters of DescribeLocalitySetting  DescribeLocalitySettingRequest
     * @return DescribeLocalitySettingResponse
     */
    CompletableFuture<DescribeLocalitySettingResponse> describeLocalitySetting(DescribeLocalitySettingRequest request);

    /**
     * @param request the request parameters of DisableApplicationScalingRule  DisableApplicationScalingRuleRequest
     * @return DisableApplicationScalingRuleResponse
     */
    CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of EnableApplicationScalingRule  EnableApplicationScalingRuleRequest
     * @return EnableApplicationScalingRuleResponse
     */
    CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of GetAppDeployment  GetAppDeploymentRequest
     * @return GetAppDeploymentResponse
     */
    CompletableFuture<GetAppDeploymentResponse> getAppDeployment(GetAppDeploymentRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetChangeOrderInfo  GetChangeOrderInfoRequest
     * @return GetChangeOrderInfoResponse
     */
    CompletableFuture<GetChangeOrderInfoResponse> getChangeOrderInfo(GetChangeOrderInfoRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetContainerConfiguration  GetContainerConfigurationRequest
     * @return GetContainerConfigurationResponse
     */
    CompletableFuture<GetContainerConfigurationResponse> getContainerConfiguration(GetContainerConfigurationRequest request);

    /**
     * @param request the request parameters of GetJavaStartUpConfig  GetJavaStartUpConfigRequest
     * @return GetJavaStartUpConfigResponse
     */
    CompletableFuture<GetJavaStartUpConfigResponse> getJavaStartUpConfig(GetJavaStartUpConfigRequest request);

    /**
     * @param request the request parameters of GetJvmConfiguration  GetJvmConfigurationRequest
     * @return GetJvmConfigurationResponse
     */
    CompletableFuture<GetJvmConfigurationResponse> getJvmConfiguration(GetJvmConfigurationRequest request);

    /**
     * @param request the request parameters of GetK8sAppPrecheckResult  GetK8sAppPrecheckResultRequest
     * @return GetK8sAppPrecheckResultResponse
     */
    CompletableFuture<GetK8sAppPrecheckResultResponse> getK8sAppPrecheckResult(GetK8sAppPrecheckResultRequest request);

    /**
     * @param request the request parameters of GetK8sApplication  GetK8sApplicationRequest
     * @return GetK8sApplicationResponse
     */
    CompletableFuture<GetK8sApplicationResponse> getK8sApplication(GetK8sApplicationRequest request);

    /**
     * @param request the request parameters of GetK8sCluster  GetK8sClusterRequest
     * @return GetK8sClusterResponse
     */
    CompletableFuture<GetK8sClusterResponse> getK8sCluster(GetK8sClusterRequest request);

    /**
     * @param request the request parameters of GetK8sServices  GetK8sServicesRequest
     * @return GetK8sServicesResponse
     */
    CompletableFuture<GetK8sServicesResponse> getK8sServices(GetK8sServicesRequest request);

    /**
     * @param request the request parameters of GetPackageStorageCredential  GetPackageStorageCredentialRequest
     * @return GetPackageStorageCredentialResponse
     */
    CompletableFuture<GetPackageStorageCredentialResponse> getPackageStorageCredential(GetPackageStorageCredentialRequest request);

    /**
     * @param request the request parameters of GetScalingRules  GetScalingRulesRequest
     * @return GetScalingRulesResponse
     */
    CompletableFuture<GetScalingRulesResponse> getScalingRules(GetScalingRulesRequest request);

    /**
     * @param request the request parameters of GetSecureToken  GetSecureTokenRequest
     * @return GetSecureTokenResponse
     */
    CompletableFuture<GetSecureTokenResponse> getSecureToken(GetSecureTokenRequest request);

    /**
     * @param request the request parameters of GetServiceConsumersPage  GetServiceConsumersPageRequest
     * @return GetServiceConsumersPageResponse
     */
    CompletableFuture<GetServiceConsumersPageResponse> getServiceConsumersPage(GetServiceConsumersPageRequest request);

    /**
     * @param request the request parameters of GetServiceDetail  GetServiceDetailRequest
     * @return GetServiceDetailResponse
     */
    CompletableFuture<GetServiceDetailResponse> getServiceDetail(GetServiceDetailRequest request);

    /**
     * @param request the request parameters of GetServiceListPage  GetServiceListPageRequest
     * @return GetServiceListPageResponse
     */
    CompletableFuture<GetServiceListPageResponse> getServiceListPage(GetServiceListPageRequest request);

    /**
     * @param request the request parameters of GetServiceMethodPage  GetServiceMethodPageRequest
     * @return GetServiceMethodPageResponse
     */
    CompletableFuture<GetServiceMethodPageResponse> getServiceMethodPage(GetServiceMethodPageRequest request);

    /**
     * @param request the request parameters of GetServiceProvidersPage  GetServiceProvidersPageRequest
     * @return GetServiceProvidersPageResponse
     */
    CompletableFuture<GetServiceProvidersPageResponse> getServiceProvidersPage(GetServiceProvidersPageRequest request);

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * @param request the request parameters of GetWebContainerConfig  GetWebContainerConfigRequest
     * @return GetWebContainerConfigResponse
     */
    CompletableFuture<GetWebContainerConfigResponse> getWebContainerConfig(GetWebContainerConfigRequest request);

    /**
     * @param request the request parameters of ImportK8sCluster  ImportK8sClusterRequest
     * @return ImportK8sClusterResponse
     */
    CompletableFuture<ImportK8sClusterResponse> importK8sCluster(ImportK8sClusterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To create an application in a Kubernetes cluster, call the InsertK8sApplication operation provided by Enterprise Distributed Application Service (EDAS).</p>
     * </blockquote>
     * 
     * @param request the request parameters of InsertApplication  InsertApplicationRequest
     * @return InsertApplicationResponse
     */
    CompletableFuture<InsertApplicationResponse> insertApplication(InsertApplicationRequest request);

    /**
     * @param request the request parameters of InsertCluster  InsertClusterRequest
     * @return InsertClusterResponse
     */
    CompletableFuture<InsertClusterResponse> insertCluster(InsertClusterRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>If you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all original data of the ECS instance is deleted. In addition, you must set a logon password for the ECS instance. Make sure that no important data exists on the ECS instance that you want to import or data has been backed up for the ECS instance.</p>
     * <blockquote>
     * <p>We recommend that you call the InstallAgent operation instead of this operation. For more information, see <a href="https://help.aliyun.com/document_detail/127023.html">InstallAgent</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InsertClusterMember  InsertClusterMemberRequest
     * @return InsertClusterMemberResponse
     */
    CompletableFuture<InsertClusterMemberResponse> insertClusterMember(InsertClusterMemberRequest request);

    /**
     * @param request the request parameters of InsertDeployGroup  InsertDeployGroupRequest
     * @return InsertDeployGroupResponse
     */
    CompletableFuture<InsertDeployGroupResponse> insertDeployGroup(InsertDeployGroupRequest request);

    /**
     * @param request the request parameters of InsertK8sApplication  InsertK8sApplicationRequest
     * @return InsertK8sApplicationResponse
     */
    CompletableFuture<InsertK8sApplicationResponse> insertK8sApplication(InsertK8sApplicationRequest request);

    /**
     * @param request the request parameters of InsertOrUpdateRegion  InsertOrUpdateRegionRequest
     * @return InsertOrUpdateRegionResponse
     */
    CompletableFuture<InsertOrUpdateRegionResponse> insertOrUpdateRegion(InsertOrUpdateRegionRequest request);

    /**
     * @param request the request parameters of InsertRole  InsertRoleRequest
     * @return InsertRoleResponse
     */
    CompletableFuture<InsertRoleResponse> insertRole(InsertRoleRequest request);

    /**
     * @param request the request parameters of InsertServiceGroup  InsertServiceGroupRequest
     * @return InsertServiceGroupResponse
     */
    CompletableFuture<InsertServiceGroupResponse> insertServiceGroup(InsertServiceGroupRequest request);

    /**
     * @param request the request parameters of InsertSwimmingLane  InsertSwimmingLaneRequest
     * @return InsertSwimmingLaneResponse
     */
    CompletableFuture<InsertSwimmingLaneResponse> insertSwimmingLane(InsertSwimmingLaneRequest request);

    /**
     * @param request the request parameters of InsertSwimmingLaneGroup  InsertSwimmingLaneGroupRequest
     * @return InsertSwimmingLaneGroupResponse
     */
    CompletableFuture<InsertSwimmingLaneGroupResponse> insertSwimmingLaneGroup(InsertSwimmingLaneGroupRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to import an ECS instance into EDAS, the operating system of the ECS instance is not reinstalled. We recommend that you call this operation to import ECS instances into EDAS.</p>
     * 
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request);

    /**
     * @param request the request parameters of ListAliyunRegion  ListAliyunRegionRequest
     * @return ListAliyunRegionResponse
     */
    CompletableFuture<ListAliyunRegionResponse> listAliyunRegion(ListAliyunRegionRequest request);

    /**
     * @param request the request parameters of ListApplication  ListApplicationRequest
     * @return ListApplicationResponse
     */
    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    /**
     * @param request the request parameters of ListApplicationEcu  ListApplicationEcuRequest
     * @return ListApplicationEcuResponse
     */
    CompletableFuture<ListApplicationEcuResponse> listApplicationEcu(ListApplicationEcuRequest request);

    /**
     * @param request the request parameters of ListAuthority  ListAuthorityRequest
     * @return ListAuthorityResponse
     */
    CompletableFuture<ListAuthorityResponse> listAuthority(ListAuthorityRequest request);

    /**
     * @param request the request parameters of ListBuildPack  ListBuildPackRequest
     * @return ListBuildPackResponse
     */
    CompletableFuture<ListBuildPackResponse> listBuildPack(ListBuildPackRequest request);

    /**
     * @param request the request parameters of ListCluster  ListClusterRequest
     * @return ListClusterResponse
     */
    CompletableFuture<ListClusterResponse> listCluster(ListClusterRequest request);

    /**
     * @param request the request parameters of ListClusterMembers  ListClusterMembersRequest
     * @return ListClusterMembersResponse
     */
    CompletableFuture<ListClusterMembersResponse> listClusterMembers(ListClusterMembersRequest request);

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * @param request the request parameters of ListConfigTemplates  ListConfigTemplatesRequest
     * @return ListConfigTemplatesResponse
     */
    CompletableFuture<ListConfigTemplatesResponse> listConfigTemplates(ListConfigTemplatesRequest request);

    /**
     * @param request the request parameters of ListConsumedServices  ListConsumedServicesRequest
     * @return ListConsumedServicesResponse
     */
    CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request);

    /**
     * @param request the request parameters of ListConvertableEcu  ListConvertableEcuRequest
     * @return ListConvertableEcuResponse
     */
    CompletableFuture<ListConvertableEcuResponse> listConvertableEcu(ListConvertableEcuRequest request);

    /**
     * @param request the request parameters of ListDeployGroup  ListDeployGroupRequest
     * @return ListDeployGroupResponse
     */
    CompletableFuture<ListDeployGroupResponse> listDeployGroup(ListDeployGroupRequest request);

    /**
     * @param request the request parameters of ListEcsNotInCluster  ListEcsNotInClusterRequest
     * @return ListEcsNotInClusterResponse
     */
    CompletableFuture<ListEcsNotInClusterResponse> listEcsNotInCluster(ListEcsNotInClusterRequest request);

    /**
     * <b>description</b> :
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.</li>
     * <li><strong>Elastic compute unit (ECU)</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of ListEcuByRegion  ListEcuByRegionRequest
     * @return ListEcuByRegionResponse
     */
    CompletableFuture<ListEcuByRegionResponse> listEcuByRegion(ListEcuByRegionRequest request);

    /**
     * @param request the request parameters of ListHistoryDeployVersion  ListHistoryDeployVersionRequest
     * @return ListHistoryDeployVersionResponse
     */
    CompletableFuture<ListHistoryDeployVersionResponse> listHistoryDeployVersion(ListHistoryDeployVersionRequest request);

    /**
     * @param request the request parameters of ListK8sConfigMaps  ListK8sConfigMapsRequest
     * @return ListK8sConfigMapsResponse
     */
    CompletableFuture<ListK8sConfigMapsResponse> listK8sConfigMaps(ListK8sConfigMapsRequest request);

    /**
     * @param request the request parameters of ListK8sIngressRules  ListK8sIngressRulesRequest
     * @return ListK8sIngressRulesResponse
     */
    CompletableFuture<ListK8sIngressRulesResponse> listK8sIngressRules(ListK8sIngressRulesRequest request);

    /**
     * @param request the request parameters of ListK8sNamespaces  ListK8sNamespacesRequest
     * @return ListK8sNamespacesResponse
     */
    CompletableFuture<ListK8sNamespacesResponse> listK8sNamespaces(ListK8sNamespacesRequest request);

    /**
     * @param request the request parameters of ListK8sSecrets  ListK8sSecretsRequest
     * @return ListK8sSecretsResponse
     */
    CompletableFuture<ListK8sSecretsResponse> listK8sSecrets(ListK8sSecretsRequest request);

    /**
     * @param request the request parameters of ListMethods  ListMethodsRequest
     * @return ListMethodsResponse
     */
    CompletableFuture<ListMethodsResponse> listMethods(ListMethodsRequest request);

    /**
     * @param request the request parameters of ListPublishedServices  ListPublishedServicesRequest
     * @return ListPublishedServicesResponse
     */
    CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request);

    /**
     * @param request the request parameters of ListRecentChangeOrder  ListRecentChangeOrderRequest
     * @return ListRecentChangeOrderResponse
     */
    CompletableFuture<ListRecentChangeOrderResponse> listRecentChangeOrder(ListRecentChangeOrderRequest request);

    /**
     * @param request the request parameters of ListResourceGroup  ListResourceGroupRequest
     * @return ListResourceGroupResponse
     */
    CompletableFuture<ListResourceGroupResponse> listResourceGroup(ListResourceGroupRequest request);

    /**
     * @param request the request parameters of ListRole  ListRoleRequest
     * @return ListRoleResponse
     */
    CompletableFuture<ListRoleResponse> listRole(ListRoleRequest request);

    /**
     * <b>description</b> :
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.</li>
     * <li><strong>Elastic compute unit (ECU)</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of ListScaleOutEcu  ListScaleOutEcuRequest
     * @return ListScaleOutEcuResponse
     */
    CompletableFuture<ListScaleOutEcuResponse> listScaleOutEcu(ListScaleOutEcuRequest request);

    /**
     * @param request the request parameters of ListServiceGroups  ListServiceGroupsRequest
     * @return ListServiceGroupsResponse
     */
    CompletableFuture<ListServiceGroupsResponse> listServiceGroups(ListServiceGroupsRequest request);

    /**
     * @param request the request parameters of ListSlb  ListSlbRequest
     * @return ListSlbResponse
     */
    CompletableFuture<ListSlbResponse> listSlb(ListSlbRequest request);

    /**
     * @param request the request parameters of ListSubAccount  ListSubAccountRequest
     * @return ListSubAccountResponse
     */
    CompletableFuture<ListSubAccountResponse> listSubAccount(ListSubAccountRequest request);

    /**
     * @param request the request parameters of ListSwimmingLane  ListSwimmingLaneRequest
     * @return ListSwimmingLaneResponse
     */
    CompletableFuture<ListSwimmingLaneResponse> listSwimmingLane(ListSwimmingLaneRequest request);

    /**
     * @param request the request parameters of ListSwimmingLaneGroup  ListSwimmingLaneGroupRequest
     * @return ListSwimmingLaneGroupResponse
     */
    CompletableFuture<ListSwimmingLaneGroupResponse> listSwimmingLaneGroup(ListSwimmingLaneGroupRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUserDefineRegion  ListUserDefineRegionRequest
     * @return ListUserDefineRegionResponse
     */
    CompletableFuture<ListUserDefineRegionResponse> listUserDefineRegion(ListUserDefineRegionRequest request);

    /**
     * @param request the request parameters of ListVpc  ListVpcRequest
     * @return ListVpcResponse
     */
    CompletableFuture<ListVpcResponse> listVpc(ListVpcRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>We recommend that you do not call this operation. Instead, we recommend that you call the TransformClusterMember operation. For more information, see <a href="https://help.aliyun.com/document_detail/71514.html">TransformClusterMember</a>.
     * When you call this operation to import an Elastic Compute Service (ECS) instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.</p>
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources and microservices in Enterprise Distributed Application Service (EDAS). The resources include clusters, ECS instances, and applications. You can use a default or custom namespace. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources or microservices.</li>
     * <li><strong>ECU</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateEcu  MigrateEcuRequest
     * @return MigrateEcuResponse
     */
    CompletableFuture<MigrateEcuResponse> migrateEcu(MigrateEcuRequest request);

    /**
     * @param request the request parameters of ModifyScalingRule  ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    /**
     * @param request the request parameters of QueryApplicationStatus  QueryApplicationStatusRequest
     * @return QueryApplicationStatusResponse
     */
    CompletableFuture<QueryApplicationStatusResponse> queryApplicationStatus(QueryApplicationStatusRequest request);

    /**
     * @param request the request parameters of QueryEccInfo  QueryEccInfoRequest
     * @return QueryEccInfoResponse
     */
    CompletableFuture<QueryEccInfoResponse> queryEccInfo(QueryEccInfoRequest request);

    /**
     * @param request the request parameters of QueryMigrateEcuList  QueryMigrateEcuListRequest
     * @return QueryMigrateEcuListResponse
     */
    CompletableFuture<QueryMigrateEcuListResponse> queryMigrateEcuList(QueryMigrateEcuListRequest request);

    /**
     * @param request the request parameters of QueryMigrateRegionList  QueryMigrateRegionListRequest
     * @return QueryMigrateRegionListResponse
     */
    CompletableFuture<QueryMigrateRegionListResponse> queryMigrateRegionList(QueryMigrateRegionListRequest request);

    /**
     * @param request the request parameters of QueryRegionConfig  QueryRegionConfigRequest
     * @return QueryRegionConfigResponse
     */
    CompletableFuture<QueryRegionConfigResponse> queryRegionConfig(QueryRegionConfigRequest request);

    /**
     * @param request the request parameters of QuerySlsLogStoreList  QuerySlsLogStoreListRequest
     * @return QuerySlsLogStoreListResponse
     */
    CompletableFuture<QuerySlsLogStoreListResponse> querySlsLogStoreList(QuerySlsLogStoreListRequest request);

    /**
     * @param request the request parameters of ResetApplication  ResetApplicationRequest
     * @return ResetApplicationResponse
     */
    CompletableFuture<ResetApplicationResponse> resetApplication(ResetApplicationRequest request);

    /**
     * @param request the request parameters of RestartApplication  RestartApplicationRequest
     * @return RestartApplicationResponse
     */
    CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request);

    /**
     * @param request the request parameters of RestartK8sApplication  RestartK8sApplicationRequest
     * @return RestartK8sApplicationResponse
     */
    CompletableFuture<RestartK8sApplicationResponse> restartK8sApplication(RestartK8sApplicationRequest request);

    /**
     * @param request the request parameters of RetryChangeOrderTask  RetryChangeOrderTaskRequest
     * @return RetryChangeOrderTaskResponse
     */
    CompletableFuture<RetryChangeOrderTaskResponse> retryChangeOrderTask(RetryChangeOrderTaskRequest request);

    /**
     * @param request the request parameters of RollbackApplication  RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    /**
     * @param request the request parameters of RollbackChangeOrder  RollbackChangeOrderRequest
     * @return RollbackChangeOrderResponse
     */
    CompletableFuture<RollbackChangeOrderResponse> rollbackChangeOrder(RollbackChangeOrderRequest request);

    /**
     * @param request the request parameters of ScaleInApplication  ScaleInApplicationRequest
     * @return ScaleInApplicationResponse
     */
    CompletableFuture<ScaleInApplicationResponse> scaleInApplication(ScaleInApplicationRequest request);

    /**
     * @param request the request parameters of ScaleK8sApplication  ScaleK8sApplicationRequest
     * @return ScaleK8sApplicationResponse
     */
    CompletableFuture<ScaleK8sApplicationResponse> scaleK8sApplication(ScaleK8sApplicationRequest request);

    /**
     * @param request the request parameters of ScaleOutApplication  ScaleOutApplicationRequest
     * @return ScaleOutApplicationResponse
     */
    CompletableFuture<ScaleOutApplicationResponse> scaleOutApplication(ScaleOutApplicationRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Assume that the auto scaling feature is configured and enabled for an application. When an auto scale-in is triggered for the application, the ECS instances that are purchased by calling this operation are removed first.</p>
     * 
     * @param request the request parameters of ScaleoutApplicationWithNewInstances  ScaleoutApplicationWithNewInstancesRequest
     * @return ScaleoutApplicationWithNewInstancesResponse
     */
    CompletableFuture<ScaleoutApplicationWithNewInstancesResponse> scaleoutApplicationWithNewInstances(ScaleoutApplicationWithNewInstancesRequest request);

    /**
     * @param request the request parameters of StartApplication  StartApplicationRequest
     * @return StartApplicationResponse
     */
    CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request);

    /**
     * @param request the request parameters of StartK8sAppPrecheck  StartK8sAppPrecheckRequest
     * @return StartK8sAppPrecheckResponse
     */
    CompletableFuture<StartK8sAppPrecheckResponse> startK8sAppPrecheck(StartK8sAppPrecheckRequest request);

    /**
     * @param request the request parameters of StartK8sApplication  StartK8sApplicationRequest
     * @return StartK8sApplicationResponse
     */
    CompletableFuture<StartK8sApplicationResponse> startK8sApplication(StartK8sApplicationRequest request);

    /**
     * @param request the request parameters of StopApplication  StopApplicationRequest
     * @return StopApplicationResponse
     */
    CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request);

    /**
     * @param request the request parameters of StopK8sApplication  StopK8sApplicationRequest
     * @return StopK8sApplicationResponse
     */
    CompletableFuture<StopK8sApplicationResponse> stopK8sApplication(StopK8sApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>To call the SwitchAdvancedMonitoring operation, you must make sure that the version of Enterprise Distributed Application Service (EDAS) SDK for Java or Python is 3.15.2 or later.</p>
     * 
     * @param request the request parameters of SwitchAdvancedMonitoring  SwitchAdvancedMonitoringRequest
     * @return SwitchAdvancedMonitoringResponse
     */
    CompletableFuture<SwitchAdvancedMonitoringResponse> switchAdvancedMonitoring(SwitchAdvancedMonitoringRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to synchronize ECS resource information, all instance data is synchronized from ECS. If you have more than 100 ECS instances, we recommend that you do not frequently call this operation.</p>
     * 
     * @param request the request parameters of SynchronizeResource  SynchronizeResourceRequest
     * @return SynchronizeResourceResponse
     */
    CompletableFuture<SynchronizeResourceResponse> synchronizeResource(SynchronizeResourceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>When you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.</p>
     * 
     * @param request the request parameters of TransformClusterMember  TransformClusterMemberRequest
     * @return TransformClusterMemberResponse
     */
    CompletableFuture<TransformClusterMemberResponse> transformClusterMember(TransformClusterMemberRequest request);

    /**
     * @param request the request parameters of UnbindK8sSlb  UnbindK8sSlbRequest
     * @return UnbindK8sSlbResponse
     */
    CompletableFuture<UnbindK8sSlbResponse> unbindK8sSlb(UnbindK8sSlbRequest request);

    /**
     * @param request the request parameters of UnbindSlb  UnbindSlbRequest
     * @return UnbindSlbResponse
     */
    CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAccountInfo  UpdateAccountInfoRequest
     * @return UpdateAccountInfoResponse
     */
    CompletableFuture<UpdateAccountInfoResponse> updateAccountInfo(UpdateAccountInfoRequest request);

    /**
     * @param request the request parameters of UpdateApplicationBaseInfo  UpdateApplicationBaseInfoRequest
     * @return UpdateApplicationBaseInfoResponse
     */
    CompletableFuture<UpdateApplicationBaseInfoResponse> updateApplicationBaseInfo(UpdateApplicationBaseInfoRequest request);

    /**
     * @param request the request parameters of UpdateApplicationScalingRule  UpdateApplicationScalingRuleRequest
     * @return UpdateApplicationScalingRuleResponse
     */
    CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of UpdateConfigTemplate  UpdateConfigTemplateRequest
     * @return UpdateConfigTemplateResponse
     */
    CompletableFuture<UpdateConfigTemplateResponse> updateConfigTemplate(UpdateConfigTemplateRequest request);

    /**
     * @param request the request parameters of UpdateContainer  UpdateContainerRequest
     * @return UpdateContainerResponse
     */
    CompletableFuture<UpdateContainerResponse> updateContainer(UpdateContainerRequest request);

    /**
     * @param request the request parameters of UpdateContainerConfiguration  UpdateContainerConfigurationRequest
     * @return UpdateContainerConfigurationResponse
     */
    CompletableFuture<UpdateContainerConfigurationResponse> updateContainerConfiguration(UpdateContainerConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateHealthCheckUrl  UpdateHealthCheckUrlRequest
     * @return UpdateHealthCheckUrlResponse
     */
    CompletableFuture<UpdateHealthCheckUrlResponse> updateHealthCheckUrl(UpdateHealthCheckUrlRequest request);

    /**
     * @param request the request parameters of UpdateHookConfiguration  UpdateHookConfigurationRequest
     * @return UpdateHookConfigurationResponse
     */
    CompletableFuture<UpdateHookConfigurationResponse> updateHookConfiguration(UpdateHookConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateJvmConfiguration  UpdateJvmConfigurationRequest
     * @return UpdateJvmConfigurationResponse
     */
    CompletableFuture<UpdateJvmConfigurationResponse> updateJvmConfiguration(UpdateJvmConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateK8sApplicationBaseInfo  UpdateK8sApplicationBaseInfoRequest
     * @return UpdateK8sApplicationBaseInfoResponse
     */
    CompletableFuture<UpdateK8sApplicationBaseInfoResponse> updateK8sApplicationBaseInfo(UpdateK8sApplicationBaseInfoRequest request);

    /**
     * @param request the request parameters of UpdateK8sApplicationConfig  UpdateK8sApplicationConfigRequest
     * @return UpdateK8sApplicationConfigResponse
     */
    CompletableFuture<UpdateK8sApplicationConfigResponse> updateK8sApplicationConfig(UpdateK8sApplicationConfigRequest request);

    /**
     * @param request the request parameters of UpdateK8sConfigMap  UpdateK8sConfigMapRequest
     * @return UpdateK8sConfigMapResponse
     */
    CompletableFuture<UpdateK8sConfigMapResponse> updateK8sConfigMap(UpdateK8sConfigMapRequest request);

    /**
     * @param request the request parameters of UpdateK8sIngressRule  UpdateK8sIngressRuleRequest
     * @return UpdateK8sIngressRuleResponse
     */
    CompletableFuture<UpdateK8sIngressRuleResponse> updateK8sIngressRule(UpdateK8sIngressRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can update only Deployments.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateK8sResource  UpdateK8sResourceRequest
     * @return UpdateK8sResourceResponse
     */
    CompletableFuture<UpdateK8sResourceResponse> updateK8sResource(UpdateK8sResourceRequest request);

    /**
     * @param request the request parameters of UpdateK8sSecret  UpdateK8sSecretRequest
     * @return UpdateK8sSecretResponse
     */
    CompletableFuture<UpdateK8sSecretResponse> updateK8sSecret(UpdateK8sSecretRequest request);

    /**
     * @param request the request parameters of UpdateK8sService  UpdateK8sServiceRequest
     * @return UpdateK8sServiceResponse
     */
    CompletableFuture<UpdateK8sServiceResponse> updateK8sService(UpdateK8sServiceRequest request);

    /**
     * @param request the request parameters of UpdateK8sSlb  UpdateK8sSlbRequest
     * @return UpdateK8sSlbResponse
     */
    CompletableFuture<UpdateK8sSlbResponse> updateK8sSlb(UpdateK8sSlbRequest request);

    /**
     * @param request the request parameters of UpdateLocalitySetting  UpdateLocalitySettingRequest
     * @return UpdateLocalitySettingResponse
     */
    CompletableFuture<UpdateLocalitySettingResponse> updateLocalitySetting(UpdateLocalitySettingRequest request);

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * @param request the request parameters of UpdateSlsLogStore  UpdateSlsLogStoreRequest
     * @return UpdateSlsLogStoreResponse
     */
    CompletableFuture<UpdateSlsLogStoreResponse> updateSlsLogStore(UpdateSlsLogStoreRequest request);

    /**
     * @param request the request parameters of UpdateSwimmingLane  UpdateSwimmingLaneRequest
     * @return UpdateSwimmingLaneResponse
     */
    CompletableFuture<UpdateSwimmingLaneResponse> updateSwimmingLane(UpdateSwimmingLaneRequest request);

    /**
     * @param request the request parameters of UpdateSwimmingLaneGroup  UpdateSwimmingLaneGroupRequest
     * @return UpdateSwimmingLaneGroupResponse
     */
    CompletableFuture<UpdateSwimmingLaneGroupResponse> updateSwimmingLaneGroup(UpdateSwimmingLaneGroupRequest request);

}
