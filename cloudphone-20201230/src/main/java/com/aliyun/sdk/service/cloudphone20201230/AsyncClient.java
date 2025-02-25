// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudphone20201230.models.*;
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

    /**
      * When you call this operation, take note of the following item:
      * *   If the task is executed, you fail to call the operation and an error is returned.
      *
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The custom image that you want to copy must be in the Available state.
      * *   You can only copy images within your own Alibaba Cloud account. Images cannot be copied from one account to another.
      * *   A single region can have only one image copy task running at a time. Other image copy tasks queue up for the current task to complete before they run in sequence.
      *
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You need to only specify the ID (InstanceId) of an ECP instance. The instance is used as a template. The instance must be in the Running or Stopped state.
      * *   You can use the created custom image only if the image is in the Available state.
      *
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
      * ## [](#)Usage notes
      * When you call this operation, take note of the following items:
      * *   Images that are shared with recipient users can be deleted only after you unshare the images.
      * *   Images that are used by other Elastic Cloud Phone (ECP) instances can only be forcefully deleted.
      *
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    /**
      * *   Before you call the operation, take note of the following items:
      *     *   If you delete a key pair of a cloud phone, you cannot query the key pair of the cloud phone by calling the ListKeyPairs operation.
      *     *   If you delete a key pair that is bound to an existing Elastic Cloud Phone (ECP) instance, Alibaba Cloud no longer saves the key pair for you, but the ECP instance can use the key pair as expected.
      *
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    CompletableFuture<FetchFileResponse> fetchFile(FetchFileRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Before you import the image, you must upload the image to an Object Storage Service (OSS) bucket. For more information, see [Upload objects](~~31886~~).
      * *   When you import an image for the first time, you must use Resource Access Management (RAM) to grant permissions on the access to OSS buckets in advance to obtain [Cloud Resource Access Authorization](https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22%3A%5B%7B%22Service%22%3A%22CloudPhone%22%2C%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunCloudPhoneDefaultRole%22%2C%22TemplateId%22%3A%22AliyunCloudPhoneDefaultRole%22%7D%5D%7D%5D%2C%22ReturnUrl%22%3A%22https%3A%2F%2Fcloudphone.console.aliyun.com%2F%23%2Finstances%22%7D) with one click.
      * *   You can import an image only to a region that is the same as that of the OSS bucket to which the image file was imported.
      *
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
      * Usage notes Before you call this operation, take note of the following items:
      * *   You can create up to 500 key pairs in each region.
      * *   The imported public key pair must generate the public key of a key pair for Android Debug Bridge (ADB).
      *
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    CompletableFuture<InstallApplicationResponse> installApplication(InstallApplicationRequest request);

    CompletableFuture<ListImageSharePermissionResponse> listImageSharePermission(ListImageSharePermissionRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request);

    /**
      * ## [](#)Usage notes
      * When you call this operation, take note of the following items:
      * *   The URL returned is valid only for 15 seconds. If no connection is established within 15 seconds after a successful query, the URL expires. You must query the URL again if you still want to use the URL.
      * *   The keep-alive duration of a single URL of a management terminal is 60 seconds. If no interaction is detected within the 60 seconds, the management terminal is automatically disconnected.
      * *   After the management terminal is disconnected, you can only reconnect to the terminal up to 30 times per minute.
      * *   You need to add vncUrl=\\*\\*\\*\\*, instanceId= ****and password=**** to the end of the link https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html? and use ampersands (&) between the parameters. Parameter description:
      *     *   vncUrl: the value that is returned after the operation is called.
      *     *   instanceId: the instance ID.
      *     *   (Optional) password: the password for remote connection of the instance, which can contain six characters in length. The password can be digits or letters. If you specify this parameter, you do not need to enter your password again when the management terminal is being connected.
      * Example:
      * https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****\\&instanceId=cp-wz9hhwq5a6tm****
      * Or:
      * https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****\\&instanceId=cp-wz9hhwq5a6tm****\\&password=\\*\\*\\*\\*
      *
     */
    CompletableFuture<ListInstanceVncUrlResponse> listInstanceVncUrl(ListInstanceVncUrlRequest request);

    /**
      * *   This operation only supports the NextToken query method.
      * *   Results are returned in descending order based on the time when ECP instances were created.
      * *   When you use NextToken to specify a query token, set the value to the NextToken value that is returned in the last call to the ListInstances operation. Then, use MaxResults to specify the maximum number of entries to return on each page.
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * You can call this operation to query one or more key pairs of cloud phones.
      *
     */
    CompletableFuture<ListKeyPairsResponse> listKeyPairs(ListKeyPairsRequest request);

    /**
      * *   You can call this operation to query regions where ECP is available.
      *
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
      * ## [](#)Usage notes
      * *   You can call the operation to query zones available in a specified region.
      *
     */
    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
      * *   You can call the operation to renew multiple ECP instances at a time.
      *
     */
    CompletableFuture<RenewInstancesResponse> renewInstances(RenewInstancesRequest request);

    /**
      * ## [](#)Usage notes
      * When you call this operation, take note of the following items:
      * *   This operation is valid only for ECP instances that are in the Stopped state.
      * *   If the images based on which the instances are created are deleted, the instances cannot be reset.
      *
     */
    CompletableFuture<ResetInstancesResponse> resetInstances(ResetInstancesRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * Preparations:
      * *   The real-name verification is complete. For more information, see [Real-name verification](~~428525~~).
      * Precautions:
      * *   You can create up to 100 ECP instances at a time.
      * *   You can call this operation to create and start ECP instances.
      * *   If an ECP instance fails to be created due to force majeure factors, such as insufficient inventory, the ECP instance is automatically rolled back and released.
      *
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UninstallApplicationResponse> uninstallApplication(UninstallApplicationRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can share only your own custom images with other Alibaba Cloud accounts.
      * *   You can share a custom image with up to 10 Alibaba Cloud accounts at a time.
      *
     */
    CompletableFuture<UpdateImageAttributeResponse> updateImageAttribute(UpdateImageAttributeRequest request);

    /**
      * You can call this operation to modify the name, key pair, Virtual Network Computing (VNC) password, and resolution of an ECP instance. Take note that the modified key pair and resolution takes effect the next time you restart the instance.
      *
     */
    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

}
