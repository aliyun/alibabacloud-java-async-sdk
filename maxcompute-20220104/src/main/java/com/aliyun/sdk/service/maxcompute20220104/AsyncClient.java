// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.maxcompute20220104.models.*;
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

    CompletableFuture<CreatePackageResponse> createPackage(CreatePackageRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateQuotaPlanResponse> createQuotaPlan(CreateQuotaPlanRequest request);

    CompletableFuture<CreateQuotaScheduleResponse> createQuotaSchedule(CreateQuotaScheduleRequest request);

    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    CompletableFuture<DeleteQuotaPlanResponse> deleteQuotaPlan(DeleteQuotaPlanRequest request);

    CompletableFuture<GetJobResourceUsageResponse> getJobResourceUsage(GetJobResourceUsageRequest request);

    CompletableFuture<GetPackageResponse> getPackage(GetPackageRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    CompletableFuture<GetQuotaPlanResponse> getQuotaPlan(GetQuotaPlanRequest request);

    CompletableFuture<GetRoleAclResponse> getRoleAcl(GetRoleAclRequest request);

    CompletableFuture<GetRoleAclOnObjectResponse> getRoleAclOnObject(GetRoleAclOnObjectRequest request);

    CompletableFuture<GetRolePolicyResponse> getRolePolicy(GetRolePolicyRequest request);

    CompletableFuture<GetRunningJobsResponse> getRunningJobs(GetRunningJobsRequest request);

    CompletableFuture<GetTrustedProjectsResponse> getTrustedProjects(GetTrustedProjectsRequest request);

    CompletableFuture<KillJobsResponse> killJobs(KillJobsRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListPackagesResponse> listPackages(ListPackagesRequest request);

    CompletableFuture<ListProjectUsersResponse> listProjectUsers(ListProjectUsersRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    CompletableFuture<ListQuotasPlansResponse> listQuotasPlans(ListQuotasPlansRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersByRoleResponse> listUsersByRole(ListUsersByRoleRequest request);

    CompletableFuture<UpdatePackageResponse> updatePackage(UpdatePackageRequest request);

    CompletableFuture<UpdateProjectIpWhiteListResponse> updateProjectIpWhiteList(UpdateProjectIpWhiteListRequest request);

    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

    CompletableFuture<UpdateQuotaPlanResponse> updateQuotaPlan(UpdateQuotaPlanRequest request);

    CompletableFuture<UpdateQuotaScheduleResponse> updateQuotaSchedule(UpdateQuotaScheduleRequest request);

}
