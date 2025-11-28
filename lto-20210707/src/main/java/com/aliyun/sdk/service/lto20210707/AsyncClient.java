// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.lto20210707.models.*;
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
     * @param request the request parameters of AddBaaSAntChainBizChain  AddBaaSAntChainBizChainRequest
     * @return AddBaaSAntChainBizChainResponse
     */
    CompletableFuture<AddBaaSAntChainBizChainResponse> addBaaSAntChainBizChain(AddBaaSAntChainBizChainRequest request);

    /**
     * @param request the request parameters of AddBaaSFabricBizChain  AddBaaSFabricBizChainRequest
     * @return AddBaaSFabricBizChainResponse
     */
    CompletableFuture<AddBaaSFabricBizChainResponse> addBaaSFabricBizChain(AddBaaSFabricBizChainRequest request);

    /**
     * @param request the request parameters of AddBsnFabricBizChain  AddBsnFabricBizChainRequest
     * @return AddBsnFabricBizChainResponse
     */
    CompletableFuture<AddBsnFabricBizChainResponse> addBsnFabricBizChain(AddBsnFabricBizChainRequest request);

    /**
     * @param request the request parameters of AddDeviceGroup  AddDeviceGroupRequest
     * @return AddDeviceGroupResponse
     */
    CompletableFuture<AddDeviceGroupResponse> addDeviceGroup(AddDeviceGroupRequest request);

    /**
     * @param request the request parameters of AddMember  AddMemberRequest
     * @return AddMemberResponse
     */
    CompletableFuture<AddMemberResponse> addMember(AddMemberRequest request);

    /**
     * @param request the request parameters of AddPrivacyRule  AddPrivacyRuleRequest
     * @return AddPrivacyRuleResponse
     */
    CompletableFuture<AddPrivacyRuleResponse> addPrivacyRule(AddPrivacyRuleRequest request);

    /**
     * @param request the request parameters of AddRouteRule  AddRouteRuleRequest
     * @return AddRouteRuleResponse
     */
    CompletableFuture<AddRouteRuleResponse> addRouteRule(AddRouteRuleRequest request);

    /**
     * @param request the request parameters of AgreeMemberAccess  AgreeMemberAccessRequest
     * @return AgreeMemberAccessResponse
     */
    CompletableFuture<AgreeMemberAccessResponse> agreeMemberAccess(AgreeMemberAccessRequest request);

    /**
     * @param request the request parameters of AuthorizeBaaS  AuthorizeBaaSRequest
     * @return AuthorizeBaaSResponse
     */
    CompletableFuture<AuthorizeBaaSResponse> authorizeBaaS(AuthorizeBaaSRequest request);

    /**
     * @param request the request parameters of AuthorizeDeviceGroupBizChain  AuthorizeDeviceGroupBizChainRequest
     * @return AuthorizeDeviceGroupBizChainResponse
     */
    CompletableFuture<AuthorizeDeviceGroupBizChainResponse> authorizeDeviceGroupBizChain(AuthorizeDeviceGroupBizChainRequest request);

    /**
     * @param request the request parameters of AuthorizeMemberBizChain  AuthorizeMemberBizChainRequest
     * @return AuthorizeMemberBizChainResponse
     */
    CompletableFuture<AuthorizeMemberBizChainResponse> authorizeMemberBizChain(AuthorizeMemberBizChainRequest request);

    /**
     * @param request the request parameters of DeletePrivacyRule  DeletePrivacyRuleRequest
     * @return DeletePrivacyRuleResponse
     */
    CompletableFuture<DeletePrivacyRuleResponse> deletePrivacyRule(DeletePrivacyRuleRequest request);

    /**
     * @param request the request parameters of DeleteRouteRule  DeleteRouteRuleRequest
     * @return DeleteRouteRuleResponse
     */
    CompletableFuture<DeleteRouteRuleResponse> deleteRouteRule(DeleteRouteRuleRequest request);

    /**
     * @param request the request parameters of DeniedMemberAccess  DeniedMemberAccessRequest
     * @return DeniedMemberAccessResponse
     */
    CompletableFuture<DeniedMemberAccessResponse> deniedMemberAccess(DeniedMemberAccessRequest request);

    /**
     * @param request the request parameters of DescribeAccountRole  DescribeAccountRoleRequest
     * @return DescribeAccountRoleResponse
     */
    CompletableFuture<DescribeAccountRoleResponse> describeAccountRole(DescribeAccountRoleRequest request);

    /**
     * @param request the request parameters of DescribeAdminInfo  DescribeAdminInfoRequest
     * @return DescribeAdminInfoResponse
     */
    CompletableFuture<DescribeAdminInfoResponse> describeAdminInfo(DescribeAdminInfoRequest request);

    /**
     * @param request the request parameters of DescribeBizChainStatInfo  DescribeBizChainStatInfoRequest
     * @return DescribeBizChainStatInfoResponse
     */
    CompletableFuture<DescribeBizChainStatInfoResponse> describeBizChainStatInfo(DescribeBizChainStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeDashboardApiInfo  DescribeDashboardApiInfoRequest
     * @return DescribeDashboardApiInfoResponse
     */
    CompletableFuture<DescribeDashboardApiInfoResponse> describeDashboardApiInfo(DescribeDashboardApiInfoRequest request);

    /**
     * @param request the request parameters of DescribeDashboardBaseInfo  DescribeDashboardBaseInfoRequest
     * @return DescribeDashboardBaseInfoResponse
     */
    CompletableFuture<DescribeDashboardBaseInfoResponse> describeDashboardBaseInfo(DescribeDashboardBaseInfoRequest request);

    /**
     * @param request the request parameters of DescribeDashboardDeviceInfo  DescribeDashboardDeviceInfoRequest
     * @return DescribeDashboardDeviceInfoResponse
     */
    CompletableFuture<DescribeDashboardDeviceInfoResponse> describeDashboardDeviceInfo(DescribeDashboardDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeDashboardMemberApiInfo  DescribeDashboardMemberApiInfoRequest
     * @return DescribeDashboardMemberApiInfoResponse
     */
    CompletableFuture<DescribeDashboardMemberApiInfoResponse> describeDashboardMemberApiInfo(DescribeDashboardMemberApiInfoRequest request);

    /**
     * @param request the request parameters of DescribeDashboardMemberDeviceInfo  DescribeDashboardMemberDeviceInfoRequest
     * @return DescribeDashboardMemberDeviceInfoResponse
     */
    CompletableFuture<DescribeDashboardMemberDeviceInfoResponse> describeDashboardMemberDeviceInfo(DescribeDashboardMemberDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeDeviceInfo  DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    CompletableFuture<DescribeDeviceInfoResponse> describeDeviceInfo(DescribeDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeEdgeStatInfo  DescribeEdgeStatInfoRequest
     * @return DescribeEdgeStatInfoResponse
     */
    CompletableFuture<DescribeEdgeStatInfoResponse> describeEdgeStatInfo(DescribeEdgeStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeMemberBizChainStatInfo  DescribeMemberBizChainStatInfoRequest
     * @return DescribeMemberBizChainStatInfoResponse
     */
    CompletableFuture<DescribeMemberBizChainStatInfoResponse> describeMemberBizChainStatInfo(DescribeMemberBizChainStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeMemberStatInfo  DescribeMemberStatInfoRequest
     * @return DescribeMemberStatInfoResponse
     */
    CompletableFuture<DescribeMemberStatInfoResponse> describeMemberStatInfo(DescribeMemberStatInfoRequest request);

    /**
     * @param request the request parameters of DescribeMemberTotalStatInfo  DescribeMemberTotalStatInfoRequest
     * @return DescribeMemberTotalStatInfoResponse
     */
    CompletableFuture<DescribeMemberTotalStatInfoResponse> describeMemberTotalStatInfo(DescribeMemberTotalStatInfoRequest request);

    /**
     * @param request the request parameters of DescribePackgeInfo  DescribePackgeInfoRequest
     * @return DescribePackgeInfoResponse
     */
    CompletableFuture<DescribePackgeInfoResponse> describePackgeInfo(DescribePackgeInfoRequest request);

    /**
     * @param request the request parameters of DescribeStatDeviceInfo  DescribeStatDeviceInfoRequest
     * @return DescribeStatDeviceInfoResponse
     */
    CompletableFuture<DescribeStatDeviceInfoResponse> describeStatDeviceInfo(DescribeStatDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeStatMemberDeviceInfo  DescribeStatMemberDeviceInfoRequest
     * @return DescribeStatMemberDeviceInfoResponse
     */
    CompletableFuture<DescribeStatMemberDeviceInfoResponse> describeStatMemberDeviceInfo(DescribeStatMemberDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeTotalStatInfo  DescribeTotalStatInfoRequest
     * @return DescribeTotalStatInfoResponse
     */
    CompletableFuture<DescribeTotalStatInfoResponse> describeTotalStatInfo(DescribeTotalStatInfoRequest request);

    /**
     * @param request the request parameters of DisableDevice  DisableDeviceRequest
     * @return DisableDeviceResponse
     */
    CompletableFuture<DisableDeviceResponse> disableDevice(DisableDeviceRequest request);

    /**
     * @param request the request parameters of DisableDeviceGroup  DisableDeviceGroupRequest
     * @return DisableDeviceGroupResponse
     */
    CompletableFuture<DisableDeviceGroupResponse> disableDeviceGroup(DisableDeviceGroupRequest request);

    /**
     * @param request the request parameters of DownloadPrivacyKey  DownloadPrivacyKeyRequest
     * @return DownloadPrivacyKeyResponse
     */
    CompletableFuture<DownloadPrivacyKeyResponse> downloadPrivacyKey(DownloadPrivacyKeyRequest request);

    /**
     * @param request the request parameters of EnableDevice  EnableDeviceRequest
     * @return EnableDeviceResponse
     */
    CompletableFuture<EnableDeviceResponse> enableDevice(EnableDeviceRequest request);

    /**
     * @param request the request parameters of EnableDeviceGroup  EnableDeviceGroupRequest
     * @return EnableDeviceGroupResponse
     */
    CompletableFuture<EnableDeviceGroupResponse> enableDeviceGroup(EnableDeviceGroupRequest request);

    /**
     * @param request the request parameters of FreezeMember  FreezeMemberRequest
     * @return FreezeMemberResponse
     */
    CompletableFuture<FreezeMemberResponse> freezeMember(FreezeMemberRequest request);

    /**
     * @param request the request parameters of GetEdgeTotalDeviceCount  GetEdgeTotalDeviceCountRequest
     * @return GetEdgeTotalDeviceCountResponse
     */
    CompletableFuture<GetEdgeTotalDeviceCountResponse> getEdgeTotalDeviceCount(GetEdgeTotalDeviceCountRequest request);

    /**
     * @param request the request parameters of ListAllAdmin  ListAllAdminRequest
     * @return ListAllAdminResponse
     */
    CompletableFuture<ListAllAdminResponse> listAllAdmin(ListAllAdminRequest request);

    /**
     * @param request the request parameters of ListAllBizChain  ListAllBizChainRequest
     * @return ListAllBizChainResponse
     */
    CompletableFuture<ListAllBizChainResponse> listAllBizChain(ListAllBizChainRequest request);

    /**
     * @param request the request parameters of ListAllBizChainContract  ListAllBizChainContractRequest
     * @return ListAllBizChainContractResponse
     */
    CompletableFuture<ListAllBizChainContractResponse> listAllBizChainContract(ListAllBizChainContractRequest request);

    /**
     * @param request the request parameters of ListAllDeviceGroup  ListAllDeviceGroupRequest
     * @return ListAllDeviceGroupResponse
     */
    CompletableFuture<ListAllDeviceGroupResponse> listAllDeviceGroup(ListAllDeviceGroupRequest request);

    /**
     * @param request the request parameters of ListAllMember  ListAllMemberRequest
     * @return ListAllMemberResponse
     */
    CompletableFuture<ListAllMemberResponse> listAllMember(ListAllMemberRequest request);

    /**
     * @param request the request parameters of ListAllPrivacyAlgorithm  ListAllPrivacyAlgorithmRequest
     * @return ListAllPrivacyAlgorithmResponse
     */
    CompletableFuture<ListAllPrivacyAlgorithmResponse> listAllPrivacyAlgorithm(ListAllPrivacyAlgorithmRequest request);

    /**
     * @param request the request parameters of ListAllPrivacyRule  ListAllPrivacyRuleRequest
     * @return ListAllPrivacyRuleResponse
     */
    CompletableFuture<ListAllPrivacyRuleResponse> listAllPrivacyRule(ListAllPrivacyRuleRequest request);

    /**
     * @param request the request parameters of ListAllProductKey  ListAllProductKeyRequest
     * @return ListAllProductKeyResponse
     */
    CompletableFuture<ListAllProductKeyResponse> listAllProductKey(ListAllProductKeyRequest request);

    /**
     * @param request the request parameters of ListAllSystemContract  ListAllSystemContractRequest
     * @return ListAllSystemContractResponse
     */
    CompletableFuture<ListAllSystemContractResponse> listAllSystemContract(ListAllSystemContractRequest request);

    /**
     * @param request the request parameters of ListBaaSAntChain  ListBaaSAntChainRequest
     * @return ListBaaSAntChainResponse
     */
    CompletableFuture<ListBaaSAntChainResponse> listBaaSAntChain(ListBaaSAntChainRequest request);

    /**
     * @param request the request parameters of ListBaaSAntChainConsortium  ListBaaSAntChainConsortiumRequest
     * @return ListBaaSAntChainConsortiumResponse
     */
    CompletableFuture<ListBaaSAntChainConsortiumResponse> listBaaSAntChainConsortium(ListBaaSAntChainConsortiumRequest request);

    /**
     * @param request the request parameters of ListBaaSAntChainPeer  ListBaaSAntChainPeerRequest
     * @return ListBaaSAntChainPeerResponse
     */
    CompletableFuture<ListBaaSAntChainPeerResponse> listBaaSAntChainPeer(ListBaaSAntChainPeerRequest request);

    /**
     * @param request the request parameters of ListBaaSFabricChannel  ListBaaSFabricChannelRequest
     * @return ListBaaSFabricChannelResponse
     */
    CompletableFuture<ListBaaSFabricChannelResponse> listBaaSFabricChannel(ListBaaSFabricChannelRequest request);

    /**
     * @param request the request parameters of ListBaaSFabricConsortium  ListBaaSFabricConsortiumRequest
     * @return ListBaaSFabricConsortiumResponse
     */
    CompletableFuture<ListBaaSFabricConsortiumResponse> listBaaSFabricConsortium(ListBaaSFabricConsortiumRequest request);

    /**
     * @param request the request parameters of ListBaaSFabricOrganization  ListBaaSFabricOrganizationRequest
     * @return ListBaaSFabricOrganizationResponse
     */
    CompletableFuture<ListBaaSFabricOrganizationResponse> listBaaSFabricOrganization(ListBaaSFabricOrganizationRequest request);

    /**
     * @param request the request parameters of ListBizChain  ListBizChainRequest
     * @return ListBizChainResponse
     */
    CompletableFuture<ListBizChainResponse> listBizChain(ListBizChainRequest request);

    /**
     * @param request the request parameters of ListBizChainData  ListBizChainDataRequest
     * @return ListBizChainDataResponse
     */
    CompletableFuture<ListBizChainDataResponse> listBizChainData(ListBizChainDataRequest request);

    /**
     * @param request the request parameters of ListDevice  ListDeviceRequest
     * @return ListDeviceResponse
     */
    CompletableFuture<ListDeviceResponse> listDevice(ListDeviceRequest request);

    /**
     * @param request the request parameters of ListDeviceGroup  ListDeviceGroupRequest
     * @return ListDeviceGroupResponse
     */
    CompletableFuture<ListDeviceGroupResponse> listDeviceGroup(ListDeviceGroupRequest request);

    /**
     * @param request the request parameters of ListDeviceGroupAuthorizedBizChain  ListDeviceGroupAuthorizedBizChainRequest
     * @return ListDeviceGroupAuthorizedBizChainResponse
     */
    CompletableFuture<ListDeviceGroupAuthorizedBizChainResponse> listDeviceGroupAuthorizedBizChain(ListDeviceGroupAuthorizedBizChainRequest request);

    /**
     * @param request the request parameters of ListEdgeDevice  ListEdgeDeviceRequest
     * @return ListEdgeDeviceResponse
     */
    CompletableFuture<ListEdgeDeviceResponse> listEdgeDevice(ListEdgeDeviceRequest request);

    /**
     * @param request the request parameters of ListEdgeDeviceGroup  ListEdgeDeviceGroupRequest
     * @return ListEdgeDeviceGroupResponse
     */
    CompletableFuture<ListEdgeDeviceGroupResponse> listEdgeDeviceGroup(ListEdgeDeviceGroupRequest request);

    /**
     * @param request the request parameters of ListMember  ListMemberRequest
     * @return ListMemberResponse
     */
    CompletableFuture<ListMemberResponse> listMember(ListMemberRequest request);

    /**
     * @param request the request parameters of ListMemberAccessRecord  ListMemberAccessRecordRequest
     * @return ListMemberAccessRecordResponse
     */
    CompletableFuture<ListMemberAccessRecordResponse> listMemberAccessRecord(ListMemberAccessRecordRequest request);

    /**
     * @param request the request parameters of ListMemberAuthorizedBizChain  ListMemberAuthorizedBizChainRequest
     * @return ListMemberAuthorizedBizChainResponse
     */
    CompletableFuture<ListMemberAuthorizedBizChainResponse> listMemberAuthorizedBizChain(ListMemberAuthorizedBizChainRequest request);

    /**
     * @param request the request parameters of ListPrivacyRule  ListPrivacyRuleRequest
     * @return ListPrivacyRuleResponse
     */
    CompletableFuture<ListPrivacyRuleResponse> listPrivacyRule(ListPrivacyRuleRequest request);

    /**
     * @param request the request parameters of ListPrivacyRuleSharedMember  ListPrivacyRuleSharedMemberRequest
     * @return ListPrivacyRuleSharedMemberResponse
     */
    CompletableFuture<ListPrivacyRuleSharedMemberResponse> listPrivacyRuleSharedMember(ListPrivacyRuleSharedMemberRequest request);

    /**
     * @param request the request parameters of ListRouteRule  ListRouteRuleRequest
     * @return ListRouteRuleResponse
     */
    CompletableFuture<ListRouteRuleResponse> listRouteRule(ListRouteRuleRequest request);

    /**
     * @param request the request parameters of QueryBlockchainData  QueryBlockchainDataRequest
     * @return QueryBlockchainDataResponse
     */
    CompletableFuture<QueryBlockchainDataResponse> queryBlockchainData(QueryBlockchainDataRequest request);

    /**
     * @param request the request parameters of QueryBlockchainMetadata  QueryBlockchainMetadataRequest
     * @return QueryBlockchainMetadataResponse
     */
    CompletableFuture<QueryBlockchainMetadataResponse> queryBlockchainMetadata(QueryBlockchainMetadataRequest request);

    /**
     * @param request the request parameters of SharePrivacyRule  SharePrivacyRuleRequest
     * @return SharePrivacyRuleResponse
     */
    CompletableFuture<SharePrivacyRuleResponse> sharePrivacyRule(SharePrivacyRuleRequest request);

    /**
     * @param request the request parameters of UnFreezeMember  UnFreezeMemberRequest
     * @return UnFreezeMemberResponse
     */
    CompletableFuture<UnFreezeMemberResponse> unFreezeMember(UnFreezeMemberRequest request);

    /**
     * @param request the request parameters of UpdateBizChain  UpdateBizChainRequest
     * @return UpdateBizChainResponse
     */
    CompletableFuture<UpdateBizChainResponse> updateBizChain(UpdateBizChainRequest request);

    /**
     * @param request the request parameters of UpdateMember  UpdateMemberRequest
     * @return UpdateMemberResponse
     */
    CompletableFuture<UpdateMemberResponse> updateMember(UpdateMemberRequest request);

    /**
     * @param request the request parameters of UpdatePrivacyRule  UpdatePrivacyRuleRequest
     * @return UpdatePrivacyRuleResponse
     */
    CompletableFuture<UpdatePrivacyRuleResponse> updatePrivacyRule(UpdatePrivacyRuleRequest request);

    /**
     * @param request the request parameters of UpdateRouteRule  UpdateRouteRuleRequest
     * @return UpdateRouteRuleResponse
     */
    CompletableFuture<UpdateRouteRuleResponse> updateRouteRule(UpdateRouteRuleRequest request);

    /**
     * @param request the request parameters of UploadIoTDataToBlockchain  UploadIoTDataToBlockchainRequest
     * @return UploadIoTDataToBlockchainResponse
     */
    CompletableFuture<UploadIoTDataToBlockchainResponse> uploadIoTDataToBlockchain(UploadIoTDataToBlockchainRequest request);

}
