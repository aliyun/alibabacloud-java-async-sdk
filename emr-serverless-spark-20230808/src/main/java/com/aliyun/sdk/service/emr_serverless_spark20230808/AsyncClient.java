// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr_serverless_spark20230808.models.*;
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

    CompletableFuture<AddMembersResponse> addMembers(AddMembersRequest request);

    CompletableFuture<CancelJobRunResponse> cancelJobRun(CancelJobRunRequest request);

    CompletableFuture<CreateSqlStatementResponse> createSqlStatement(CreateSqlStatementRequest request);

    CompletableFuture<GetJobRunResponse> getJobRun(GetJobRunRequest request);

    CompletableFuture<GetSqlStatementResponse> getSqlStatement(GetSqlStatementRequest request);

    CompletableFuture<GrantRoleToUsersResponse> grantRoleToUsers(GrantRoleToUsersRequest request);

    CompletableFuture<ListJobRunsResponse> listJobRuns(ListJobRunsRequest request);

    CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request);

    CompletableFuture<ListSessionClustersResponse> listSessionClusters(ListSessionClustersRequest request);

    CompletableFuture<ListWorkspaceQueuesResponse> listWorkspaceQueues(ListWorkspaceQueuesRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<StartJobRunResponse> startJobRun(StartJobRunRequest request);

    CompletableFuture<TerminateSqlStatementResponse> terminateSqlStatement(TerminateSqlStatementRequest request);

}
