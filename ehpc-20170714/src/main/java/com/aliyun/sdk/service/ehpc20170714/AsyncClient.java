// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpc20170714.models.*;
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

    CompletableFuture<AddNodesResponse> addNodes(AddNodesRequest request);

    CompletableFuture<AddUsersResponse> addUsers(AddUsersRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateJobTemplateResponse> createJobTemplate(CreateJobTemplateRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteJobTemplatesResponse> deleteJobTemplates(DeleteJobTemplatesRequest request);

    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request);

    CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<EditJobTemplateResponse> editJobTemplate(EditJobTemplateRequest request);

    CompletableFuture<GetAutoScaleConfigResponse> getAutoScaleConfig(GetAutoScaleConfigRequest request);

    CompletableFuture<ListClusterLogsResponse> listClusterLogs(ListClusterLogsRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListCurrentClientVersionResponse> listCurrentClientVersion(ListCurrentClientVersionRequest request);

    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListJobTemplatesResponse> listJobTemplates(ListJobTemplatesRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListNodesNoPagingResponse> listNodesNoPaging(ListNodesNoPagingRequest request);

    CompletableFuture<ListPreferredEcsTypesResponse> listPreferredEcsTypes(ListPreferredEcsTypesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListVolumesResponse> listVolumes(ListVolumesRequest request);

    CompletableFuture<ModifyClusterAttributesResponse> modifyClusterAttributes(ModifyClusterAttributesRequest request);

    CompletableFuture<ModifyUserGroupsResponse> modifyUserGroups(ModifyUserGroupsRequest request);

    CompletableFuture<ModifyUserPasswordsResponse> modifyUserPasswords(ModifyUserPasswordsRequest request);

    CompletableFuture<RerunJobsResponse> rerunJobs(RerunJobsRequest request);

    CompletableFuture<ResetNodesResponse> resetNodes(ResetNodesRequest request);

    CompletableFuture<SetAutoScaleConfigResponse> setAutoScaleConfig(SetAutoScaleConfigRequest request);

    CompletableFuture<SetJobUserResponse> setJobUser(SetJobUserRequest request);

    CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request);

    CompletableFuture<SubmitJobResponse> submitJob(SubmitJobRequest request);

    CompletableFuture<UpgradeClientResponse> upgradeClient(UpgradeClientRequest request);

}
