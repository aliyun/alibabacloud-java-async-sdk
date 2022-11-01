// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210901.models.*;
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

    CompletableFuture<ApproveOtaTaskResponse> approveOtaTask(ApproveOtaTaskRequest request);

    CompletableFuture<AuthorizeInstanceGroupResponse> authorizeInstanceGroup(AuthorizeInstanceGroupRequest request);

    CompletableFuture<CancelOtaTaskResponse> cancelOtaTask(CancelOtaTaskRequest request);

    CompletableFuture<CreateAppInstanceGroupResponse> createAppInstanceGroup(CreateAppInstanceGroupRequest request);

    CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request);

    CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request);

    CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request);

    CompletableFuture<ListNodeInstanceTypeResponse> listNodeInstanceType(ListNodeInstanceTypeRequest request);

    CompletableFuture<ListOtaTaskResponse> listOtaTask(ListOtaTaskRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request);

    CompletableFuture<ModifyNodePoolAttributeResponse> modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request);

    CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request);

    CompletableFuture<UpdateAppInstanceGroupImageResponse> updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request);

}
