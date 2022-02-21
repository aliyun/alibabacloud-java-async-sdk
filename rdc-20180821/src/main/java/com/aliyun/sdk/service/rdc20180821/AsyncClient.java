// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rdc20180821.models.*;
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

    CompletableFuture<AddEnterpriseMemberResponse> addEnterpriseMember(AddEnterpriseMemberRequest request);

    CompletableFuture<AddRamMemberResponse> addRamMember(AddRamMemberRequest request);

    CompletableFuture<ApproveJoinCompanyResponse> approveJoinCompany(ApproveJoinCompanyRequest request);

    CompletableFuture<CreateEnterpriseResponse> createEnterprise(CreateEnterpriseRequest request);

    CompletableFuture<CreateWorkitemResponse> createWorkitem(CreateWorkitemRequest request);

    CompletableFuture<GetBindedUserByDingIdResponse> getBindedUserByDingId(GetBindedUserByDingIdRequest request);

    CompletableFuture<GetChangeLogResponse> getChangeLog(GetChangeLogRequest request);

    CompletableFuture<GetCustomFieldsByTemplateIdResponse> getCustomFieldsByTemplateId(GetCustomFieldsByTemplateIdRequest request);

    CompletableFuture<GetIssueByIdResponse> getIssueById(GetIssueByIdRequest request);

    CompletableFuture<GetJoinCodeResponse> getJoinCode(GetJoinCodeRequest request);

    CompletableFuture<GetProjectMembersResponse> getProjectMembers(GetProjectMembersRequest request);

    CompletableFuture<GetUserByAliyunPkResponse> getUserByAliyunPk(GetUserByAliyunPkRequest request);

    CompletableFuture<GetWorkitemByIdResponse> getWorkitemById(GetWorkitemByIdRequest request);

    CompletableFuture<JoinCompanyResponse> joinCompany(JoinCompanyRequest request);

    CompletableFuture<SearchProjectsByRegionResponse> searchProjectsByRegion(SearchProjectsByRegionRequest request);

    CompletableFuture<SearchTestCaseResponse> searchTestCase(SearchTestCaseRequest request);

    CompletableFuture<SearchWorkitemResponse> searchWorkitem(SearchWorkitemRequest request);

    CompletableFuture<SearchWorkitemWithTotalCountResponse> searchWorkitemWithTotalCount(SearchWorkitemWithTotalCountRequest request);

    CompletableFuture<SyncUserToRdcResponse> syncUserToRdc(SyncUserToRdcRequest request);

    CompletableFuture<UpdateWorkitemResponse> updateWorkitem(UpdateWorkitemRequest request);

}
