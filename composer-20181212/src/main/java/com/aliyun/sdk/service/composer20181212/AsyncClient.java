// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.composer20181212.models.*;
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
      * @deprecated
      *
     */
    CompletableFuture<CloneFlowResponse> cloneFlow(CloneFlowRequest request);

    /**
      * After you create a workflow, the system automatically creates a version for the workflow. You can call the GetVersion operation to obtain the version information.
      *
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    /**
      * If you delete a workflow, all the versions and execution records of the workflow are automatically deleted.
      *
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DisableFlowResponse> disableFlow(DisableFlowRequest request);

    CompletableFuture<EnableFlowResponse> enableFlow(EnableFlowRequest request);

    CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetVersionResponse> getVersion(GetVersionRequest request);

    /**
      * *   You can call this operation to trigger a workflow to be executed more than 100 times per second. If the desired execution frequency does not exceed 100 times per second, we recommend that you call the InvokeFlow operation.
      * *   However, you may need to call the GroupInvokeFlow operation multiple times. For example, assume that you want a workflow to be executed 1,000 times per second and the 1,000 times of execution are divided into ten groups. You need to call the operation ten times for the ten groups and specify a group key for each group.
      * *   Each call corresponds to a group execution. Logic Composer automatically determines when a group execution starts. You must set the Data parameter to a JSON array of strings to specify the information required by the execution. Each string provides the information required by one time of execution. The string must use the format of the Data parameter in the InvokeFlow operation.
      *
     */
    CompletableFuture<GroupInvokeFlowResponse> groupInvokeFlow(GroupInvokeFlowRequest request);

    CompletableFuture<InvokeFlowResponse> invokeFlow(InvokeFlowRequest request);

    CompletableFuture<ListFlowsResponse> listFlows(ListFlowsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<ListVersionsResponse> listVersions(ListVersionsRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateFlowResponse> updateFlow(UpdateFlowRequest request);

}
