// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ledgerdb20191122.models.*;
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

    CompletableFuture<AcceptMemberResponse> acceptMember(AcceptMemberRequest request);

    CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request);

    CompletableFuture<DeleteLedgerResponse> deleteLedger(DeleteLedgerRequest request);

    CompletableFuture<DeleteMemberResponse> deleteMember(DeleteMemberRequest request);

    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    CompletableFuture<DescribeLedgerResponse> describeLedger(DescribeLedgerRequest request);

    CompletableFuture<DescribeLedgersResponse> describeLedgers(DescribeLedgersRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeTSAResponse> describeTSA(DescribeTSARequest request);

    CompletableFuture<DisableMemberResponse> disableMember(DisableMemberRequest request);

    CompletableFuture<EnableMemberResponse> enableMember(EnableMemberRequest request);

    CompletableFuture<GetAccessAttributeResponse> getAccessAttribute(GetAccessAttributeRequest request);

    CompletableFuture<GetIpWhiteListResponse> getIpWhiteList(GetIpWhiteListRequest request);

    CompletableFuture<GetJournalResponse> getJournal(GetJournalRequest request);

    CompletableFuture<GetJournalProofResponse> getJournalProof(GetJournalProofRequest request);

    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    CompletableFuture<GrantServiceLinkedRoleResponse> grantServiceLinkedRole(GrantServiceLinkedRoleRequest request);

    CompletableFuture<InviteMembersResponse> inviteMembers(InviteMembersRequest request);

    CompletableFuture<ListJournalsResponse> listJournals(ListJournalsRequest request);

    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    CompletableFuture<ListTimeAnchorsResponse> listTimeAnchors(ListTimeAnchorsRequest request);

    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    CompletableFuture<ModifyAccessAttributeResponse> modifyAccessAttribute(ModifyAccessAttributeRequest request);

    CompletableFuture<ModifyIpWhiteListResponse> modifyIpWhiteList(ModifyIpWhiteListRequest request);

    CompletableFuture<ModifyLedgerAttributeResponse> modifyLedgerAttribute(ModifyLedgerAttributeRequest request);

    CompletableFuture<ModifyMemberACLsResponse> modifyMemberACLs(ModifyMemberACLsRequest request);

    CompletableFuture<ModifyMemberKeyResponse> modifyMemberKey(ModifyMemberKeyRequest request);

    CompletableFuture<UpdateMemberKeyByKMSResponse> updateMemberKeyByKMS(UpdateMemberKeyByKMSRequest request);

}
