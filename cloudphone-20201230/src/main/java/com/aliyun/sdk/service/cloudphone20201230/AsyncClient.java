// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudphone20201230.models.*;
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

    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    CompletableFuture<CancelImportImageResponse> cancelImportImage(CancelImportImageRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<FetchFileResponse> fetchFile(FetchFileRequest request);

    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    CompletableFuture<InstallApplicationResponse> installApplication(InstallApplicationRequest request);

    CompletableFuture<ListImageSharePermissionResponse> listImageSharePermission(ListImageSharePermissionRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request);

    CompletableFuture<ListInstanceVncUrlResponse> listInstanceVncUrl(ListInstanceVncUrlRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListKeyPairsResponse> listKeyPairs(ListKeyPairsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    CompletableFuture<RenewInstancesResponse> renewInstances(RenewInstancesRequest request);

    CompletableFuture<ResetInstancesResponse> resetInstances(ResetInstancesRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    CompletableFuture<UninstallApplicationResponse> uninstallApplication(UninstallApplicationRequest request);

    CompletableFuture<UpdateImageAttributeResponse> updateImageAttribute(UpdateImageAttributeRequest request);

    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

}
