// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudapi20160201.models.*;
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

    CompletableFuture<CheckAoneAppAuditResponse> checkAoneAppAudit(CheckAoneAppAuditRequest request);

    CompletableFuture<CreateApiGroupResponse> createApiGroup(CreateApiGroupRequest request);

    CompletableFuture<CreateAppForBackendResponse> createAppForBackend(CreateAppForBackendRequest request);

    CompletableFuture<CreateAppForInnerResponse> createAppForInner(CreateAppForInnerRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateUserWhiteListResponse> createUserWhiteList(CreateUserWhiteListRequest request);

    CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request);

    CompletableFuture<DeleteAppForInnerResponse> deleteAppForInner(DeleteAppForInnerRequest request);

    CompletableFuture<DeleteSecretKeyResponse> deleteSecretKey(DeleteSecretKeyRequest request);

    CompletableFuture<DeleteUserWhiteListByTypeResponse> deleteUserWhiteListByType(DeleteUserWhiteListByTypeRequest request);

    CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request);

    CompletableFuture<DescribeApiDocsResponse> describeApiDocs(DescribeApiDocsRequest request);

    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    CompletableFuture<DescribeApiMarketInstanceResponse> describeApiMarketInstance(DescribeApiMarketInstanceRequest request);

    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    CompletableFuture<DescribeApisForConsoleResponse> describeApisForConsole(DescribeApisForConsoleRequest request);

    CompletableFuture<DescribeAppSecuritiesResponse> describeAppSecurities(DescribeAppSecuritiesRequest request);

    CompletableFuture<DescribeAppSecurityForInnerResponse> describeAppSecurityForInner(DescribeAppSecurityForInnerRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeAvailableVipsResponse> describeAvailableVips(DescribeAvailableVipsRequest request);

    CompletableFuture<DescribeBidByUserIdForInnerResponse> describeBidByUserIdForInner(DescribeBidByUserIdForInnerRequest request);

    CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request);

    CompletableFuture<DescribeModelsForInnerResponse> describeModelsForInner(DescribeModelsForInnerRequest request);

    CompletableFuture<DescribePurchasedApiGroupsResponse> describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSecretKeysResponse> describeSecretKeys(DescribeSecretKeysRequest request);

    CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request);

    CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request);

    CompletableFuture<DescribeUserWhiteListsResponse> describeUserWhiteLists(DescribeUserWhiteListsRequest request);

    CompletableFuture<ModifyApiMarketInstanceAttributeResponse> modifyApiMarketInstanceAttribute(ModifyApiMarketInstanceAttributeRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyAppForInnerResponse> modifyAppForInner(ModifyAppForInnerRequest request);

    CompletableFuture<ModifyGroupAuthAppCodeForBackendResponse> modifyGroupAuthAppCodeForBackend(ModifyGroupAuthAppCodeForBackendRequest request);

    CompletableFuture<ResetAppCodeForInnerResponse> resetAppCodeForInner(ResetAppCodeForInnerRequest request);

    CompletableFuture<ResetSecretByAppKeyForInnerResponse> resetSecretByAppKeyForInner(ResetSecretByAppKeyForInnerRequest request);

    CompletableFuture<SetAccessPermissionByGroupForBackendResponse> setAccessPermissionByGroupForBackend(SetAccessPermissionByGroupForBackendRequest request);

    CompletableFuture<SetPurchasedApiGroupStatusResponse> setPurchasedApiGroupStatus(SetPurchasedApiGroupStatusRequest request);

    CompletableFuture<TagResourcesSystemTagsResponse> tagResourcesSystemTags(TagResourcesSystemTagsRequest request);

    CompletableFuture<VipMigrationResponse> vipMigration(VipMigrationRequest request);

}
