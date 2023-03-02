// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ltl20190510.models.*;
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

    CompletableFuture<ApplyDataModelConfigInfoResponse> applyDataModelConfigInfo(ApplyDataModelConfigInfoRequest request);

    CompletableFuture<AttachDataResponse> attachData(AttachDataRequest request);

    CompletableFuture<AttachDataWithSignatureResponse> attachDataWithSignature(AttachDataWithSignatureRequest request);

    CompletableFuture<AuthorizeDeviceResponse> authorizeDevice(AuthorizeDeviceRequest request);

    CompletableFuture<AuthorizeDeviceGroupResponse> authorizeDeviceGroup(AuthorizeDeviceGroupRequest request);

    CompletableFuture<BatchUploadMPCoSPhaseDigestInfoResponse> batchUploadMPCoSPhaseDigestInfo(BatchUploadMPCoSPhaseDigestInfoRequest request);

    CompletableFuture<BatchUploadMPCoSPhaseDigestInfoByDeviceResponse> batchUploadMPCoSPhaseDigestInfoByDevice(BatchUploadMPCoSPhaseDigestInfoByDeviceRequest request);

    CompletableFuture<BatchUploadMPCoSPhaseTextInfoResponse> batchUploadMPCoSPhaseTextInfo(BatchUploadMPCoSPhaseTextInfoRequest request);

    CompletableFuture<BatchUploadMPCoSPhaseTextInfoByDeviceResponse> batchUploadMPCoSPhaseTextInfoByDevice(BatchUploadMPCoSPhaseTextInfoByDeviceRequest request);

    CompletableFuture<CreateMPCoSPhaseResponse> createMPCoSPhase(CreateMPCoSPhaseRequest request);

    CompletableFuture<CreateMPCoSPhaseGroupResponse> createMPCoSPhaseGroup(CreateMPCoSPhaseGroupRequest request);

    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    CompletableFuture<DescribeCapacityInfoResponse> describeCapacityInfo(DescribeCapacityInfoRequest request);

    CompletableFuture<DescribeMPCoSAuthorizedInfoResponse> describeMPCoSAuthorizedInfo(DescribeMPCoSAuthorizedInfoRequest request);

    CompletableFuture<DescribeMPCoSPhaseInfoResponse> describeMPCoSPhaseInfo(DescribeMPCoSPhaseInfoRequest request);

    CompletableFuture<DescribeMPCoSResourceInfoResponse> describeMPCoSResourceInfo(DescribeMPCoSResourceInfoRequest request);

    CompletableFuture<DescribeMemberCapacityInfoResponse> describeMemberCapacityInfo(DescribeMemberCapacityInfoRequest request);

    CompletableFuture<DescribeResourceInfoResponse> describeResourceInfo(DescribeResourceInfoRequest request);

    CompletableFuture<GetBlockChainInfoResponse> getBlockChainInfo(GetBlockChainInfoRequest request);

    CompletableFuture<GetDataResponse> getData(GetDataRequest request);

    CompletableFuture<GetDataModelConfigInfoResponse> getDataModelConfigInfo(GetDataModelConfigInfoRequest request);

    CompletableFuture<GetHistoryDataCountResponse> getHistoryDataCount(GetHistoryDataCountRequest request);

    CompletableFuture<GetHistoryDataListResponse> getHistoryDataList(GetHistoryDataListRequest request);

    CompletableFuture<ListDependentDataModelsResponse> listDependentDataModels(ListDependentDataModelsRequest request);

    CompletableFuture<ListDeviceResponse> listDevice(ListDeviceRequest request);

    CompletableFuture<ListDeviceGroupResponse> listDeviceGroup(ListDeviceGroupRequest request);

    CompletableFuture<ListMPCoSPhaseResponse> listMPCoSPhase(ListMPCoSPhaseRequest request);

    CompletableFuture<ListMPCoSPhaseGroupResponse> listMPCoSPhaseGroup(ListMPCoSPhaseGroupRequest request);

    CompletableFuture<ListMPCoSPhaseHistoryResponse> listMPCoSPhaseHistory(ListMPCoSPhaseHistoryRequest request);

    CompletableFuture<ListMemberResponse> listMember(ListMemberRequest request);

    CompletableFuture<ListMultiPartyCollaborationChainResponse> listMultiPartyCollaborationChain(ListMultiPartyCollaborationChainRequest request);

    CompletableFuture<ListPSMemberDataTypeCodeResponse> listPSMemberDataTypeCode(ListPSMemberDataTypeCodeRequest request);

    CompletableFuture<ListProofChainResponse> listProofChain(ListProofChainRequest request);

    CompletableFuture<LockMemberResponse> lockMember(LockMemberRequest request);

    CompletableFuture<ModifyMPCoSPhaseResponse> modifyMPCoSPhase(ModifyMPCoSPhaseRequest request);

    CompletableFuture<ModifyMPCoSPhaseGroupResponse> modifyMPCoSPhaseGroup(ModifyMPCoSPhaseGroupRequest request);

    CompletableFuture<ModifyMemberResponse> modifyMember(ModifyMemberRequest request);

    CompletableFuture<RegisterDeviceGroupResponse> registerDeviceGroup(RegisterDeviceGroupRequest request);

    CompletableFuture<SetDataResponse> setData(SetDataRequest request);

    CompletableFuture<SetDataWithSignatureResponse> setDataWithSignature(SetDataWithSignatureRequest request);

    CompletableFuture<UnAuthorizeDeviceResponse> unAuthorizeDevice(UnAuthorizeDeviceRequest request);

    CompletableFuture<UnAuthorizeDeviceGroupResponse> unAuthorizeDeviceGroup(UnAuthorizeDeviceGroupRequest request);

    CompletableFuture<UnLockMemberResponse> unLockMember(UnLockMemberRequest request);

    CompletableFuture<UpdateMPCoSAuthorizedInfoResponse> updateMPCoSAuthorizedInfo(UpdateMPCoSAuthorizedInfoRequest request);

    CompletableFuture<UploadMPCoSPhaseDigestInfoResponse> uploadMPCoSPhaseDigestInfo(UploadMPCoSPhaseDigestInfoRequest request);

    CompletableFuture<UploadMPCoSPhaseDigestInfoByDeviceResponse> uploadMPCoSPhaseDigestInfoByDevice(UploadMPCoSPhaseDigestInfoByDeviceRequest request);

    CompletableFuture<UploadMPCoSPhaseTextInfoResponse> uploadMPCoSPhaseTextInfo(UploadMPCoSPhaseTextInfoRequest request);

    CompletableFuture<UploadMPCoSPhaseTextInfoByDeviceResponse> uploadMPCoSPhaseTextInfoByDevice(UploadMPCoSPhaseTextInfoByDeviceRequest request);

}
