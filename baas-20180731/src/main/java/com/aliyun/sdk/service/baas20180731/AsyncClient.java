// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.baas20180731.models.*;
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

    CompletableFuture<AcceptEthereumInvitationResponse> acceptEthereumInvitation(AcceptEthereumInvitationRequest request);

    CompletableFuture<AcceptInvitationResponse> acceptInvitation(AcceptInvitationRequest request);

    CompletableFuture<AddAntChainSubnetMemberCheckResponse> addAntChainSubnetMemberCheck(AddAntChainSubnetMemberCheckRequest request);

    CompletableFuture<AddAntChainSubnetNodeCheckResponse> addAntChainSubnetNodeCheck(AddAntChainSubnetNodeCheckRequest request);

    CompletableFuture<AddEthereumNodeResponse> addEthereumNode(AddEthereumNodeRequest request);

    CompletableFuture<AddFabricExternalOrganizationToChannelResponse> addFabricExternalOrganizationToChannel(AddFabricExternalOrganizationToChannelRequest request);

    CompletableFuture<AddFabricOrganizationToExternalChannelResponse> addFabricOrganizationToExternalChannel(AddFabricOrganizationToExternalChannelRequest request);

    CompletableFuture<ApplyAntChainResponse> applyAntChain(ApplyAntChainRequest request);

    CompletableFuture<ApplyAntChainCertificateResponse> applyAntChainCertificate(ApplyAntChainCertificateRequest request);

    CompletableFuture<ApplyAntChainCertificateWithKeyAutoCreationResponse> applyAntChainCertificateWithKeyAutoCreation(ApplyAntChainCertificateWithKeyAutoCreationRequest request);

    CompletableFuture<ApplyAntChainWithKeyAutoCreationResponse> applyAntChainWithKeyAutoCreation(ApplyAntChainWithKeyAutoCreationRequest request);

    CompletableFuture<ApplyBlockchainResponse> applyBlockchain(ApplyBlockchainRequest request);

    CompletableFuture<ApplyBlockchainWithKeyAutoCreationResponse> applyBlockchainWithKeyAutoCreation(ApplyBlockchainWithKeyAutoCreationRequest request);

    CompletableFuture<ApplyPublicAntChainResponse> applyPublicAntChain(ApplyPublicAntChainRequest request);

    CompletableFuture<ApplyPublicAntChainWithKeyAutoCreationResponse> applyPublicAntChainWithKeyAutoCreation(ApplyPublicAntChainWithKeyAutoCreationRequest request);

    CompletableFuture<ApproveEthereumInviteeResponse> approveEthereumInvitee(ApproveEthereumInviteeRequest request);

    CompletableFuture<ApproveFabricChaincodeDefinitionResponse> approveFabricChaincodeDefinition(ApproveFabricChaincodeDefinitionRequest request);

    CompletableFuture<BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse> batchAddAntChainMiniAppQRCodeAuthorizedUsers(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request);

    CompletableFuture<BindFabricManagementChaincodeResponse> bindFabricManagementChaincode(BindFabricManagementChaincodeRequest request);

    CompletableFuture<CheckConsortiumDomainResponse> checkConsortiumDomain(CheckConsortiumDomainRequest request);

    CompletableFuture<CheckOrganizationDomainResponse> checkOrganizationDomain(CheckOrganizationDomainRequest request);

    CompletableFuture<ConfirmConsortiumMemberResponse> confirmConsortiumMember(ConfirmConsortiumMemberRequest request);

    CompletableFuture<CopyAntChainContractProjectResponse> copyAntChainContractProject(CopyAntChainContractProjectRequest request);

    CompletableFuture<CreateAccessTokenResponse> createAccessToken(CreateAccessTokenRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateAccountWithKeyPairAutoCreationResponse> createAccountWithKeyPairAutoCreation(CreateAccountWithKeyPairAutoCreationRequest request);

    CompletableFuture<CreateAntChainResponse> createAntChain(CreateAntChainRequest request);

    CompletableFuture<CreateAntChainAccountResponse> createAntChainAccount(CreateAntChainAccountRequest request);

    CompletableFuture<CreateAntChainAccountWithKeyPairAutoCreationResponse> createAntChainAccountWithKeyPairAutoCreation(CreateAntChainAccountWithKeyPairAutoCreationRequest request);

    CompletableFuture<CreateAntChainConsortiumResponse> createAntChainConsortium(CreateAntChainConsortiumRequest request);

    CompletableFuture<CreateAntChainContractContentResponse> createAntChainContractContent(CreateAntChainContractContentRequest request);

    CompletableFuture<CreateAntChainContractProjectResponse> createAntChainContractProject(CreateAntChainContractProjectRequest request);

    CompletableFuture<CreateBlockchainResponse> createBlockchain(CreateBlockchainRequest request);

    CompletableFuture<CreateBlockchainApplicationResponse> createBlockchainApplication(CreateBlockchainApplicationRequest request);

    CompletableFuture<CreateBlockchainApplyResponse> createBlockchainApply(CreateBlockchainApplyRequest request);

    CompletableFuture<CreateChaincodeResponse> createChaincode(CreateChaincodeRequest request);

    CompletableFuture<CreateChannelResponse> createChannel(CreateChannelRequest request);

    CompletableFuture<CreateChannelMemberResponse> createChannelMember(CreateChannelMemberRequest request);

    CompletableFuture<CreateCloudIntegrationServiceTokenResponse> createCloudIntegrationServiceToken(CreateCloudIntegrationServiceTokenRequest request);

    CompletableFuture<CreateCloudServiceIntegrationResponse> createCloudServiceIntegration(CreateCloudServiceIntegrationRequest request);

    CompletableFuture<CreateCloudServiceSessionResponse> createCloudServiceSession(CreateCloudServiceSessionRequest request);

    CompletableFuture<CreateConsortiumResponse> createConsortium(CreateConsortiumRequest request);

    CompletableFuture<CreateConsortiumMemberResponse> createConsortiumMember(CreateConsortiumMemberRequest request);

    CompletableFuture<CreateEcosphereResponse> createEcosphere(CreateEcosphereRequest request);

    CompletableFuture<CreateEthereumResponse> createEthereum(CreateEthereumRequest request);

    CompletableFuture<CreateEthereumInvitationResponse> createEthereumInvitation(CreateEthereumInvitationRequest request);

    CompletableFuture<CreateFabricChaincodePackageResponse> createFabricChaincodePackage(CreateFabricChaincodePackageRequest request);

    CompletableFuture<CreateOrganizationResponse> createOrganization(CreateOrganizationRequest request);

    CompletableFuture<CreateOrganizationUserResponse> createOrganizationUser(CreateOrganizationUserRequest request);

    CompletableFuture<CreateOwnAccountResponse> createOwnAccount(CreateOwnAccountRequest request);

    CompletableFuture<CreatePublicAccountWithKeyPairAutoCreationResponse> createPublicAccountWithKeyPairAutoCreation(CreatePublicAccountWithKeyPairAutoCreationRequest request);

    CompletableFuture<CreatePublicAntChainAccountResponse> createPublicAntChainAccount(CreatePublicAntChainAccountRequest request);

    CompletableFuture<CreateSmartContractJobResponse> createSmartContractJob(CreateSmartContractJobRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<DeleteAntChainConsortiumResponse> deleteAntChainConsortium(DeleteAntChainConsortiumRequest request);

    CompletableFuture<DeleteAntChainContractContentResponse> deleteAntChainContractContent(DeleteAntChainContractContentRequest request);

    CompletableFuture<DeleteAntChainContractProjectResponse> deleteAntChainContractProject(DeleteAntChainContractProjectRequest request);

    CompletableFuture<DeleteAntChainMiniAppQRCodeAuthorizedUserResponse> deleteAntChainMiniAppQRCodeAuthorizedUser(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request);

    CompletableFuture<DeleteChaincodeResponse> deleteChaincode(DeleteChaincodeRequest request);

    CompletableFuture<DeleteGovernanceTaskResponse> deleteGovernanceTask(DeleteGovernanceTaskRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DescribeAntChainAccountsResponse> describeAntChainAccounts(DescribeAntChainAccountsRequest request);

    CompletableFuture<DescribeAntChainAccountsNewResponse> describeAntChainAccountsNew(DescribeAntChainAccountsNewRequest request);

    CompletableFuture<DescribeAntChainApplicationsResponse> describeAntChainApplications(DescribeAntChainApplicationsRequest request);

    CompletableFuture<DescribeAntChainBlockResponse> describeAntChainBlock(DescribeAntChainBlockRequest request);

    CompletableFuture<DescribeAntChainBlockNewResponse> describeAntChainBlockNew(DescribeAntChainBlockNewRequest request);

    CompletableFuture<DescribeAntChainCertificateApplicationsResponse> describeAntChainCertificateApplications(DescribeAntChainCertificateApplicationsRequest request);

    CompletableFuture<DescribeAntChainCertificateApplicationsNewResponse> describeAntChainCertificateApplicationsNew(DescribeAntChainCertificateApplicationsNewRequest request);

    CompletableFuture<DescribeAntChainConfigOptionsResponse> describeAntChainConfigOptions(DescribeAntChainConfigOptionsRequest request);

    CompletableFuture<DescribeAntChainConsortiumsResponse> describeAntChainConsortiums(DescribeAntChainConsortiumsRequest request);

    CompletableFuture<DescribeAntChainConsortiumsNewResponse> describeAntChainConsortiumsNew(DescribeAntChainConsortiumsNewRequest request);

    CompletableFuture<DescribeAntChainContractProjectContentTreeResponse> describeAntChainContractProjectContentTree(DescribeAntChainContractProjectContentTreeRequest request);

    CompletableFuture<DescribeAntChainContractProjectContentTreeNewResponse> describeAntChainContractProjectContentTreeNew(DescribeAntChainContractProjectContentTreeNewRequest request);

    CompletableFuture<DescribeAntChainContractProjectsResponse> describeAntChainContractProjects(DescribeAntChainContractProjectsRequest request);

    CompletableFuture<DescribeAntChainContractProjectsNewResponse> describeAntChainContractProjectsNew(DescribeAntChainContractProjectsNewRequest request);

    CompletableFuture<DescribeAntChainDownloadPathsResponse> describeAntChainDownloadPaths(DescribeAntChainDownloadPathsRequest request);

    CompletableFuture<DescribeAntChainDownloadPathsNewResponse> describeAntChainDownloadPathsNew(DescribeAntChainDownloadPathsNewRequest request);

    CompletableFuture<DescribeAntChainInformationResponse> describeAntChainInformation(DescribeAntChainInformationRequest request);

    CompletableFuture<DescribeAntChainInformationNewResponse> describeAntChainInformationNew(DescribeAntChainInformationNewRequest request);

    CompletableFuture<DescribeAntChainLatestBlocksResponse> describeAntChainLatestBlocks(DescribeAntChainLatestBlocksRequest request);

    CompletableFuture<DescribeAntChainLatestBlocksNewResponse> describeAntChainLatestBlocksNew(DescribeAntChainLatestBlocksNewRequest request);

    CompletableFuture<DescribeAntChainLatestTransactionDigestsResponse> describeAntChainLatestTransactionDigests(DescribeAntChainLatestTransactionDigestsRequest request);

    CompletableFuture<DescribeAntChainLatestTransactionDigestsNewResponse> describeAntChainLatestTransactionDigestsNew(DescribeAntChainLatestTransactionDigestsNewRequest request);

    CompletableFuture<DescribeAntChainMembersResponse> describeAntChainMembers(DescribeAntChainMembersRequest request);

    CompletableFuture<DescribeAntChainMembersNewResponse> describeAntChainMembersNew(DescribeAntChainMembersNewRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse> describeAntChainMiniAppBrowserQRCodeAccessLog(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse> describeAntChainMiniAppBrowserQRCodeAccessLogNew(DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse> describeAntChainMiniAppBrowserQRCodeAuthorizedUsers(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse> describeAntChainMiniAppBrowserQRCodeAuthorizedUsersNew(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserTransactionQRCodeResponse> describeAntChainMiniAppBrowserTransactionQRCode(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request);

    CompletableFuture<DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse> describeAntChainMiniAppBrowserTransactionQRCodeNew(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request);

    CompletableFuture<DescribeAntChainNodesNewResponse> describeAntChainNodesNew(DescribeAntChainNodesNewRequest request);

    CompletableFuture<DescribeAntChainQRCodeAuthorizationResponse> describeAntChainQRCodeAuthorization(DescribeAntChainQRCodeAuthorizationRequest request);

    CompletableFuture<DescribeAntChainQRCodeAuthorizationNewResponse> describeAntChainQRCodeAuthorizationNew(DescribeAntChainQRCodeAuthorizationNewRequest request);

    CompletableFuture<DescribeAntChainRegionNamesResponse> describeAntChainRegionNames(DescribeAntChainRegionNamesRequest request);

    CompletableFuture<DescribeAntChainRegionsForSaleResponse> describeAntChainRegionsForSale(DescribeAntChainRegionsForSaleRequest request);

    CompletableFuture<DescribeAntChainResourceTypesResponse> describeAntChainResourceTypes(DescribeAntChainResourceTypesRequest request);

    CompletableFuture<DescribeAntChainRestResponse> describeAntChainRest(DescribeAntChainRestRequest request);

    CompletableFuture<DescribeAntChainSubnetListResponse> describeAntChainSubnetList(DescribeAntChainSubnetListRequest request);

    CompletableFuture<DescribeAntChainSubnetMemberListResponse> describeAntChainSubnetMemberList(DescribeAntChainSubnetMemberListRequest request);

    CompletableFuture<DescribeAntChainSubnetNodeListResponse> describeAntChainSubnetNodeList(DescribeAntChainSubnetNodeListRequest request);

    CompletableFuture<DescribeAntChainTransactionResponse> describeAntChainTransaction(DescribeAntChainTransactionRequest request);

    CompletableFuture<DescribeAntChainTransactionNewResponse> describeAntChainTransactionNew(DescribeAntChainTransactionNewRequest request);

    CompletableFuture<DescribeAntChainTransactionReceiptNewResponse> describeAntChainTransactionReceiptNew(DescribeAntChainTransactionReceiptNewRequest request);

    CompletableFuture<DescribeAntChainTransactionStatisticsResponse> describeAntChainTransactionStatistics(DescribeAntChainTransactionStatisticsRequest request);

    CompletableFuture<DescribeAntChainTransactionStatisticsNewResponse> describeAntChainTransactionStatisticsNew(DescribeAntChainTransactionStatisticsNewRequest request);

    CompletableFuture<DescribeAntChainsResponse> describeAntChains(DescribeAntChainsRequest request);

    CompletableFuture<DescribeAntChainsNewResponse> describeAntChainsNew(DescribeAntChainsNewRequest request);

    CompletableFuture<DescribeAntRegionsResponse> describeAntRegions(DescribeAntRegionsRequest request);

    CompletableFuture<DescribeAppliesResponse> describeApplies(DescribeAppliesRequest request);

    CompletableFuture<DescribeBcSchemaResponse> describeBcSchema(DescribeBcSchemaRequest request);

    CompletableFuture<DescribeBlockResponse> describeBlock(DescribeBlockRequest request);

    CompletableFuture<DescribeBlockchainApplicationResponse> describeBlockchainApplication(DescribeBlockchainApplicationRequest request);

    CompletableFuture<DescribeBlockchainConfigOptionResponse> describeBlockchainConfigOption(DescribeBlockchainConfigOptionRequest request);

    CompletableFuture<DescribeBlockchainCreateTaskResponse> describeBlockchainCreateTask(DescribeBlockchainCreateTaskRequest request);

    CompletableFuture<DescribeBlockchainCreationConfigOptionsResponse> describeBlockchainCreationConfigOptions(DescribeBlockchainCreationConfigOptionsRequest request);

    CompletableFuture<DescribeBlockchainInfoResponse> describeBlockchainInfo(DescribeBlockchainInfoRequest request);

    CompletableFuture<DescribeBlockchainSchemaResponse> describeBlockchainSchema(DescribeBlockchainSchemaRequest request);

    CompletableFuture<DescribeBlockchainSchemaDetailResponse> describeBlockchainSchemaDetail(DescribeBlockchainSchemaDetailRequest request);

    CompletableFuture<DescribeBlockchainSchemaFileOSSPropertiesResponse> describeBlockchainSchemaFileOSSProperties(DescribeBlockchainSchemaFileOSSPropertiesRequest request);

    CompletableFuture<DescribeBlockchainSchemaTemplatesResponse> describeBlockchainSchemaTemplates(DescribeBlockchainSchemaTemplatesRequest request);

    CompletableFuture<DescribeCSIGatewayEndpointResponse> describeCSIGatewayEndpoint(DescribeCSIGatewayEndpointRequest request);

    CompletableFuture<DescribeCandidateOrganizationsResponse> describeCandidateOrganizations(DescribeCandidateOrganizationsRequest request);

    CompletableFuture<DescribeChaincodeCollectionConfigResponse> describeChaincodeCollectionConfig(DescribeChaincodeCollectionConfigRequest request);

    CompletableFuture<DescribeChaincodeDefinitionTaskResponse> describeChaincodeDefinitionTask(DescribeChaincodeDefinitionTaskRequest request);

    CompletableFuture<DescribeChaincodeUploadPolicyResponse> describeChaincodeUploadPolicy(DescribeChaincodeUploadPolicyRequest request);

    CompletableFuture<DescribeChannelChaincodesResponse> describeChannelChaincodes(DescribeChannelChaincodesRequest request);

    CompletableFuture<DescribeChannelMembersResponse> describeChannelMembers(DescribeChannelMembersRequest request);

    CompletableFuture<DescribeChannelTriggersResponse> describeChannelTriggers(DescribeChannelTriggersRequest request);

    CompletableFuture<DescribeCloudIntegrationServiceTokenResponse> describeCloudIntegrationServiceToken(DescribeCloudIntegrationServiceTokenRequest request);

    CompletableFuture<DescribeCloudServiceOrganizationStatusResponse> describeCloudServiceOrganizationStatus(DescribeCloudServiceOrganizationStatusRequest request);

    CompletableFuture<DescribeCloudServiceTypeStatusResponse> describeCloudServiceTypeStatus(DescribeCloudServiceTypeStatusRequest request);

    CompletableFuture<DescribeConsortiumAdminStatusResponse> describeConsortiumAdminStatus(DescribeConsortiumAdminStatusRequest request);

    CompletableFuture<DescribeConsortiumChaincodesResponse> describeConsortiumChaincodes(DescribeConsortiumChaincodesRequest request);

    CompletableFuture<DescribeConsortiumChannelsResponse> describeConsortiumChannels(DescribeConsortiumChannelsRequest request);

    CompletableFuture<DescribeConsortiumConfigResponse> describeConsortiumConfig(DescribeConsortiumConfigRequest request);

    CompletableFuture<DescribeConsortiumDeletableResponse> describeConsortiumDeletable(DescribeConsortiumDeletableRequest request);

    CompletableFuture<DescribeConsortiumMemberApprovalResponse> describeConsortiumMemberApproval(DescribeConsortiumMemberApprovalRequest request);

    CompletableFuture<DescribeConsortiumMembersResponse> describeConsortiumMembers(DescribeConsortiumMembersRequest request);

    CompletableFuture<DescribeConsortiumOrderersResponse> describeConsortiumOrderers(DescribeConsortiumOrderersRequest request);

    CompletableFuture<DescribeConsortiumSpecsResponse> describeConsortiumSpecs(DescribeConsortiumSpecsRequest request);

    CompletableFuture<DescribeConsortiumsResponse> describeConsortiums(DescribeConsortiumsRequest request);

    CompletableFuture<DescribeDownloadPathsResponse> describeDownloadPaths(DescribeDownloadPathsRequest request);

    CompletableFuture<DescribeDownloadPathsOfContractChainResponse> describeDownloadPathsOfContractChain(DescribeDownloadPathsOfContractChainRequest request);

    CompletableFuture<DescribeDownloadPathsOfNotaryChainResponse> describeDownloadPathsOfNotaryChain(DescribeDownloadPathsOfNotaryChainRequest request);

    CompletableFuture<DescribeEcosphereSpecsResponse> describeEcosphereSpecs(DescribeEcosphereSpecsRequest request);

    CompletableFuture<DescribeEthereumResponse> describeEthereum(DescribeEthereumRequest request);

    CompletableFuture<DescribeEthereumClientUsersResponse> describeEthereumClientUsers(DescribeEthereumClientUsersRequest request);

    CompletableFuture<DescribeEthereumDeletableResponse> describeEthereumDeletable(DescribeEthereumDeletableRequest request);

    CompletableFuture<DescribeEthereumInvitaionResponse> describeEthereumInvitaion(DescribeEthereumInvitaionRequest request);

    CompletableFuture<DescribeEthereumInviteeResponse> describeEthereumInvitee(DescribeEthereumInviteeRequest request);

    CompletableFuture<DescribeEthereumNodeResponse> describeEthereumNode(DescribeEthereumNodeRequest request);

    CompletableFuture<DescribeEthereumNodeConfigurationResponse> describeEthereumNodeConfiguration(DescribeEthereumNodeConfigurationRequest request);

    CompletableFuture<DescribeEthereumNodeInfoResponse> describeEthereumNodeInfo(DescribeEthereumNodeInfoRequest request);

    CompletableFuture<DescribeEthereumNodeLogsResponse> describeEthereumNodeLogs(DescribeEthereumNodeLogsRequest request);

    CompletableFuture<DescribeEthereumNodesResponse> describeEthereumNodes(DescribeEthereumNodesRequest request);

    CompletableFuture<DescribeEthereumsResponse> describeEthereums(DescribeEthereumsRequest request);

    CompletableFuture<DescribeExplorerResponse> describeExplorer(DescribeExplorerRequest request);

    CompletableFuture<DescribeExplorerURLResponse> describeExplorerURL(DescribeExplorerURLRequest request);

    CompletableFuture<DescribeFabricChaincodeEndorsePolicyResponse> describeFabricChaincodeEndorsePolicy(DescribeFabricChaincodeEndorsePolicyRequest request);

    CompletableFuture<DescribeFabricChaincodeLogsResponse> describeFabricChaincodeLogs(DescribeFabricChaincodeLogsRequest request);

    CompletableFuture<DescribeFabricChannelConfigResponse> describeFabricChannelConfig(DescribeFabricChannelConfigRequest request);

    CompletableFuture<DescribeFabricChannelOrdererResponse> describeFabricChannelOrderer(DescribeFabricChannelOrdererRequest request);

    CompletableFuture<DescribeFabricChannelOrganizationsResponse> describeFabricChannelOrganizations(DescribeFabricChannelOrganizationsRequest request);

    CompletableFuture<DescribeFabricJoinRequestResponse> describeFabricJoinRequest(DescribeFabricJoinRequestRequest request);

    CompletableFuture<DescribeFabricJoinResponseResponse> describeFabricJoinResponse(DescribeFabricJoinResponseRequest request);

    CompletableFuture<DescribeFabricManagementChaincodesResponse> describeFabricManagementChaincodes(DescribeFabricManagementChaincodesRequest request);

    CompletableFuture<DescribeFabricOrganizationChaincodePackageResponse> describeFabricOrganizationChaincodePackage(DescribeFabricOrganizationChaincodePackageRequest request);

    CompletableFuture<DescribeFabricOrganizationEgressResponse> describeFabricOrganizationEgress(DescribeFabricOrganizationEgressRequest request);

    CompletableFuture<DescribeFabricPeerChannelsResponse> describeFabricPeerChannels(DescribeFabricPeerChannelsRequest request);

    CompletableFuture<DescribeGovernanceTaskResponse> describeGovernanceTask(DescribeGovernanceTaskRequest request);

    CompletableFuture<DescribeGovernanceTasksResponse> describeGovernanceTasks(DescribeGovernanceTasksRequest request);

    CompletableFuture<DescribeInvitationCodeResponse> describeInvitationCode(DescribeInvitationCodeRequest request);

    CompletableFuture<DescribeInvitationListResponse> describeInvitationList(DescribeInvitationListRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeInviterResponse> describeInviter(DescribeInviterRequest request);

    CompletableFuture<DescribeLatest15BlocksResponse> describeLatest15Blocks(DescribeLatest15BlocksRequest request);

    CompletableFuture<DescribeLatest15TransDigestsResponse> describeLatest15TransDigests(DescribeLatest15TransDigestsRequest request);

    CompletableFuture<DescribeLatestBlocksResponse> describeLatestBlocks(DescribeLatestBlocksRequest request);

    CompletableFuture<DescribeLatestTransactionDigestsResponse> describeLatestTransactionDigests(DescribeLatestTransactionDigestsRequest request);

    CompletableFuture<DescribeMemberRoleResponse> describeMemberRole(DescribeMemberRoleRequest request);

    CompletableFuture<DescribeMembersResponse> describeMembers(DescribeMembersRequest request);

    CompletableFuture<DescribeMetricResponse> describeMetric(DescribeMetricRequest request);

    CompletableFuture<DescribeMyBlockchainsResponse> describeMyBlockchains(DescribeMyBlockchainsRequest request);

    CompletableFuture<DescribeMyBlockchanInfosResponse> describeMyBlockchanInfos(DescribeMyBlockchanInfosRequest request);

    CompletableFuture<DescribeMySuccessAppliesResponse> describeMySuccessApplies(DescribeMySuccessAppliesRequest request);

    CompletableFuture<DescribeMySuccessfulApplicationResponse> describeMySuccessfulApplication(DescribeMySuccessfulApplicationRequest request);

    CompletableFuture<DescribeNetstatURLResponse> describeNetstatURL(DescribeNetstatURLRequest request);

    CompletableFuture<DescribeOrdererLogsResponse> describeOrdererLogs(DescribeOrdererLogsRequest request);

    CompletableFuture<DescribeOrganizationResponse> describeOrganization(DescribeOrganizationRequest request);

    CompletableFuture<DescribeOrganizationChaincodesResponse> describeOrganizationChaincodes(DescribeOrganizationChaincodesRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeOrganizationChannelsResponse> describeOrganizationChannels(DescribeOrganizationChannelsRequest request);

    CompletableFuture<DescribeOrganizationDeletableResponse> describeOrganizationDeletable(DescribeOrganizationDeletableRequest request);

    CompletableFuture<DescribeOrganizationMembersResponse> describeOrganizationMembers(DescribeOrganizationMembersRequest request);

    CompletableFuture<DescribeOrganizationPeersResponse> describeOrganizationPeers(DescribeOrganizationPeersRequest request);

    CompletableFuture<DescribeOrganizationSpecsResponse> describeOrganizationSpecs(DescribeOrganizationSpecsRequest request);

    CompletableFuture<DescribeOrganizationTriggersResponse> describeOrganizationTriggers(DescribeOrganizationTriggersRequest request);

    CompletableFuture<DescribeOrganizationUserCertsResponse> describeOrganizationUserCerts(DescribeOrganizationUserCertsRequest request);

    CompletableFuture<DescribeOrganizationUsersResponse> describeOrganizationUsers(DescribeOrganizationUsersRequest request);

    CompletableFuture<DescribeOrganizationsResponse> describeOrganizations(DescribeOrganizationsRequest request);

    CompletableFuture<DescribeOrgnaizationChaincodesResponse> describeOrgnaizationChaincodes(DescribeOrgnaizationChaincodesRequest request);

    CompletableFuture<DescribeOssPropertiesResponse> describeOssProperties(DescribeOssPropertiesRequest request);

    CompletableFuture<DescribePeerLogsResponse> describePeerLogs(DescribePeerLogsRequest request);

    CompletableFuture<DescribePublicAntChainContractProjectContentTreeResponse> describePublicAntChainContractProjectContentTree(DescribePublicAntChainContractProjectContentTreeRequest request);

    CompletableFuture<DescribePublicAntChainDownloadPathsResponse> describePublicAntChainDownloadPaths(DescribePublicAntChainDownloadPathsRequest request);

    CompletableFuture<DescribePublicCloudIDEEnvConfigsResponse> describePublicCloudIDEEnvConfigs(DescribePublicCloudIDEEnvConfigsRequest request);

    CompletableFuture<DescribeQRCodeAccessLogResponse> describeQRCodeAccessLog(DescribeQRCodeAccessLogRequest request);

    CompletableFuture<DescribeQRCodeAuthorityResponse> describeQRCodeAuthority(DescribeQRCodeAuthorityRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeResourceTypeResponse> describeResourceType(DescribeResourceTypeRequest request);

    CompletableFuture<DescribeResourceTypesResponse> describeResourceTypes(DescribeResourceTypesRequest request);

    CompletableFuture<DescribeRootDomainResponse> describeRootDomain(DescribeRootDomainRequest request);

    CompletableFuture<DescribeSchemaDetailResponse> describeSchemaDetail(DescribeSchemaDetailRequest request);

    CompletableFuture<DescribeSmartContractJobStatusResponse> describeSmartContractJobStatus(DescribeSmartContractJobStatusRequest request);

    CompletableFuture<DescribeSmartContractJobsResponse> describeSmartContractJobs(DescribeSmartContractJobsRequest request);

    CompletableFuture<DescribeSmartContractJobsByNameResponse> describeSmartContractJobsByName(DescribeSmartContractJobsByNameRequest request);

    CompletableFuture<DescribeSmartContractResultResponse> describeSmartContractResult(DescribeSmartContractResultRequest request);

    CompletableFuture<DescribeSmartContractResultContentResponse> describeSmartContractResultContent(DescribeSmartContractResultContentRequest request);

    CompletableFuture<DescribeSubscribeCloudServiceIntegrationStateResponse> describeSubscribeCloudServiceIntegrationState(DescribeSubscribeCloudServiceIntegrationStateRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeTransactionResponse> describeTransaction(DescribeTransactionRequest request);

    CompletableFuture<DescribeTransactionFor2CBrowserResponse> describeTransactionFor2CBrowser(DescribeTransactionFor2CBrowserRequest request);

    CompletableFuture<DescribeTransactionQRCodeResponse> describeTransactionQRCode(DescribeTransactionQRCodeRequest request);

    CompletableFuture<DescribeTransactionReceiptFor2CBrowserResponse> describeTransactionReceiptFor2CBrowser(DescribeTransactionReceiptFor2CBrowserRequest request);

    CompletableFuture<DescribeTriggerResponse> describeTrigger(DescribeTriggerRequest request);

    CompletableFuture<DestroyConsortiumResponse> destroyConsortium(DestroyConsortiumRequest request);

    CompletableFuture<DestroyEthereumResponse> destroyEthereum(DestroyEthereumRequest request);

    CompletableFuture<DestroyOrganizationResponse> destroyOrganization(DestroyOrganizationRequest request);

    CompletableFuture<DownloadAllResponse> downloadAll(DownloadAllRequest request);

    CompletableFuture<DownloadBizviewResponse> downloadBizview(DownloadBizviewRequest request);

    CompletableFuture<DownloadFabricChannelSDKResponse> downloadFabricChannelSDK(DownloadFabricChannelSDKRequest request);

    CompletableFuture<DownloadOrganizationSDKResponse> downloadOrganizationSDK(DownloadOrganizationSDKRequest request);

    CompletableFuture<DownloadSDK2Response> downloadSDK2(DownloadSDK2Request request);

    CompletableFuture<DownloadSdkResponse> downloadSdk(DownloadSdkRequest request);

    CompletableFuture<DownloadSignedDataResponse> downloadSignedData(DownloadSignedDataRequest request);

    CompletableFuture<DuplicateAntChainContractProjectResponse> duplicateAntChainContractProject(DuplicateAntChainContractProjectRequest request);

    CompletableFuture<FreezeAccountResponse> freezeAccount(FreezeAccountRequest request);

    CompletableFuture<FreezeAntChainAccountResponse> freezeAntChainAccount(FreezeAntChainAccountRequest request);

    CompletableFuture<GetAppliesResponse> getApplies(GetAppliesRequest request);

    CompletableFuture<GetBcSchemaResponse> getBcSchema(GetBcSchemaRequest request);

    CompletableFuture<GetBlockchainCreateTaskResponse> getBlockchainCreateTask(GetBlockchainCreateTaskRequest request);

    CompletableFuture<GetBlockchainInfoResponse> getBlockchainInfo(GetBlockchainInfoRequest request);

    CompletableFuture<GetMyBlockchainsResponse> getMyBlockchains(GetMyBlockchainsRequest request);

    CompletableFuture<GetMySuccessAppliesResponse> getMySuccessApplies(GetMySuccessAppliesRequest request);

    CompletableFuture<GetOssPropertiesResponse> getOssProperties(GetOssPropertiesRequest request);

    CompletableFuture<GetTemplatesResponse> getTemplates(GetTemplatesRequest request);

    CompletableFuture<InstallChaincodeResponse> installChaincode(InstallChaincodeRequest request);

    CompletableFuture<InstallFabricChaincodePackageResponse> installFabricChaincodePackage(InstallFabricChaincodePackageRequest request);

    CompletableFuture<InstantiateChaincodeResponse> instantiateChaincode(InstantiateChaincodeRequest request);

    CompletableFuture<InviteUserResponse> inviteUser(InviteUserRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<JoinChannelResponse> joinChannel(JoinChannelRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyTriggerResponse> modifyTrigger(ModifyTriggerRequest request);

    CompletableFuture<OperateUserResponse> operateUser(OperateUserRequest request);

    CompletableFuture<ProcessCloudIDEContractTransactionResponse> processCloudIDEContractTransaction(ProcessCloudIDEContractTransactionRequest request);

    CompletableFuture<ProcessPublicCloudIDEContractTransactionResponse> processPublicCloudIDEContractTransaction(ProcessPublicCloudIDEContractTransactionRequest request);

    CompletableFuture<QueryBlockResponse> queryBlock(QueryBlockRequest request);

    CompletableFuture<QueryConsortiumDeletableResponse> queryConsortiumDeletable(QueryConsortiumDeletableRequest request);

    CompletableFuture<QueryEthereumDeletableResponse> queryEthereumDeletable(QueryEthereumDeletableRequest request);

    CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request);

    CompletableFuture<QueryOrganizationDeletableResponse> queryOrganizationDeletable(QueryOrganizationDeletableRequest request);

    CompletableFuture<QueryTransactionResponse> queryTransaction(QueryTransactionRequest request);

    CompletableFuture<RejectUserResponse> rejectUser(RejectUserRequest request);

    CompletableFuture<RenameBlockchainResponse> renameBlockchain(RenameBlockchainRequest request);

    CompletableFuture<ResetAntChainCertificateResponse> resetAntChainCertificate(ResetAntChainCertificateRequest request);

    CompletableFuture<ResetAntChainUserCertificateResponse> resetAntChainUserCertificate(ResetAntChainUserCertificateRequest request);

    CompletableFuture<ResetCertificateResponse> resetCertificate(ResetCertificateRequest request);

    CompletableFuture<ResetOrganizationUserPasswordResponse> resetOrganizationUserPassword(ResetOrganizationUserPasswordRequest request);

    CompletableFuture<ResetPublicAntChainCertificateResponse> resetPublicAntChainCertificate(ResetPublicAntChainCertificateRequest request);

    CompletableFuture<ResetUserResponse> resetUser(ResetUserRequest request);

    CompletableFuture<SchemaDetailResponse> schemaDetail(SchemaDetailRequest request);

    CompletableFuture<StartSmartContractJobResponse> startSmartContractJob(StartSmartContractJobRequest request);

    CompletableFuture<SubmitFabricChaincodeDefinitionResponse> submitFabricChaincodeDefinition(SubmitFabricChaincodeDefinitionRequest request);

    CompletableFuture<SyncFabricChaincodeStatusResponse> syncFabricChaincodeStatus(SyncFabricChaincodeStatusRequest request);

    CompletableFuture<SynchronizeChaincodeResponse> synchronizeChaincode(SynchronizeChaincodeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnfreezeAccountResponse> unfreezeAccount(UnfreezeAccountRequest request);

    CompletableFuture<UnfreezeAntChainAccountResponse> unfreezeAntChainAccount(UnfreezeAntChainAccountRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAntChainResponse> updateAntChain(UpdateAntChainRequest request);

    CompletableFuture<UpdateAntChainConsortiumResponse> updateAntChainConsortium(UpdateAntChainConsortiumRequest request);

    CompletableFuture<UpdateAntChainContractContentResponse> updateAntChainContractContent(UpdateAntChainContractContentRequest request);

    CompletableFuture<UpdateAntChainContractProjectResponse> updateAntChainContractProject(UpdateAntChainContractProjectRequest request);

    CompletableFuture<UpdateAntChainMemberResponse> updateAntChainMember(UpdateAntChainMemberRequest request);

    CompletableFuture<UpdateAntChainQRCodeAuthorizationResponse> updateAntChainQRCodeAuthorization(UpdateAntChainQRCodeAuthorizationRequest request);

    CompletableFuture<UpdateBlockchainSchemaResponse> updateBlockchainSchema(UpdateBlockchainSchemaRequest request);

    CompletableFuture<UpdateChannelConfigResponse> updateChannelConfig(UpdateChannelConfigRequest request);

    CompletableFuture<UpdateEthereumResponse> updateEthereum(UpdateEthereumRequest request);

    CompletableFuture<UpdateEthereumClientUserPasswordResponse> updateEthereumClientUserPassword(UpdateEthereumClientUserPasswordRequest request);

    CompletableFuture<UpdateEthereumNodeResponse> updateEthereumNode(UpdateEthereumNodeRequest request);

    CompletableFuture<UpdateEthereumNodeConfigurationResponse> updateEthereumNodeConfiguration(UpdateEthereumNodeConfigurationRequest request);

    CompletableFuture<UpdateGovernanceTaskResponse> updateGovernanceTask(UpdateGovernanceTaskRequest request);

    CompletableFuture<UpdateMemberRoleResponse> updateMemberRole(UpdateMemberRoleRequest request);

    CompletableFuture<UpdateQRCodeAuthorityResponse> updateQRCodeAuthority(UpdateQRCodeAuthorityRequest request);

    CompletableFuture<UpdateSchemaResponse> updateSchema(UpdateSchemaRequest request);

    CompletableFuture<UpgradeChaincodeResponse> upgradeChaincode(UpgradeChaincodeRequest request);

    CompletableFuture<UpgradeFabricChaincodeDefinitionResponse> upgradeFabricChaincodeDefinition(UpgradeFabricChaincodeDefinitionRequest request);

}
