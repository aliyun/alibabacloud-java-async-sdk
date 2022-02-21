// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cr20160607.models.*;
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

    CompletableFuture<CancelRepoBuildResponse> cancelRepoBuild(CancelRepoBuildRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<CreateRepoResponse> createRepo(CreateRepoRequest request);

    CompletableFuture<CreateRepoBuildRuleResponse> createRepoBuildRule(CreateRepoBuildRuleRequest request);

    CompletableFuture<CreateRepoTagSyncResponse> createRepoTagSync(CreateRepoTagSyncRequest request);

    CompletableFuture<CreateRepoWebhookResponse> createRepoWebhook(CreateRepoWebhookRequest request);

    CompletableFuture<CreateUserInfoResponse> createUserInfo(CreateUserInfoRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteRepoResponse> deleteRepo(DeleteRepoRequest request);

    CompletableFuture<DeleteRepoBuildRuleResponse> deleteRepoBuildRule(DeleteRepoBuildRuleRequest request);

    CompletableFuture<DeleteRepoWebhookResponse> deleteRepoWebhook(DeleteRepoWebhookRequest request);

    CompletableFuture<GetAuthorizationTokenResponse> getAuthorizationToken(GetAuthorizationTokenRequest request);

    CompletableFuture<GetImageLayerResponse> getImageLayer(GetImageLayerRequest request);

    CompletableFuture<GetImageManifestResponse> getImageManifest(GetImageManifestRequest request);

    CompletableFuture<GetNamespaceResponse> getNamespace(GetNamespaceRequest request);

    CompletableFuture<GetNamespaceListResponse> getNamespaceList(GetNamespaceListRequest request);

    CompletableFuture<GetRegionListResponse> getRegionList(GetRegionListRequest request);

    CompletableFuture<GetRepoResponse> getRepo(GetRepoRequest request);

    CompletableFuture<GetRepoBuildListResponse> getRepoBuildList(GetRepoBuildListRequest request);

    CompletableFuture<GetRepoBuildRuleListResponse> getRepoBuildRuleList(GetRepoBuildRuleListRequest request);

    CompletableFuture<GetRepoBuildStatusResponse> getRepoBuildStatus(GetRepoBuildStatusRequest request);

    CompletableFuture<GetRepoListResponse> getRepoList(GetRepoListRequest request);

    CompletableFuture<GetRepoListByNamespaceResponse> getRepoListByNamespace(GetRepoListByNamespaceRequest request);

    CompletableFuture<GetRepoTagResponse> getRepoTag(GetRepoTagRequest request);

    CompletableFuture<GetRepoTagScanListResponse> getRepoTagScanList(GetRepoTagScanListRequest request);

    CompletableFuture<GetRepoTagScanStatusResponse> getRepoTagScanStatus(GetRepoTagScanStatusRequest request);

    CompletableFuture<GetRepoTagScanSummaryResponse> getRepoTagScanSummary(GetRepoTagScanSummaryRequest request);

    CompletableFuture<GetRepoTagsResponse> getRepoTags(GetRepoTagsRequest request);

    CompletableFuture<GetRepoWebhookResponse> getRepoWebhook(GetRepoWebhookRequest request);

    CompletableFuture<StartImageScanResponse> startImageScan(StartImageScanRequest request);

    CompletableFuture<StartRepoBuildByRuleResponse> startRepoBuildByRule(StartRepoBuildByRuleRequest request);

    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    CompletableFuture<UpdateRepoResponse> updateRepo(UpdateRepoRequest request);

    CompletableFuture<UpdateRepoBuildRuleResponse> updateRepoBuildRule(UpdateRepoBuildRuleRequest request);

    CompletableFuture<UpdateRepoWebhookResponse> updateRepoWebhook(UpdateRepoWebhookRequest request);

    CompletableFuture<UpdateUserInfoResponse> updateUserInfo(UpdateUserInfoRequest request);

}
