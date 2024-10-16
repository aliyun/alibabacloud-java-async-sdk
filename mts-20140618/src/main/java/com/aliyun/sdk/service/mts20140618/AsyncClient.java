// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mts20140618.models.*;
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
     * <b>description</b> :
     * <p>You can call this operation to activate a media workflow that has been deactivated. After you activate a media workflow, you cannot modify the workflow information, such as the name, topology, or trigger mode. A media workflow is activated by default after it is created.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ActivateMediaWorkflow  ActivateMediaWorkflowRequest
     * @return ActivateMediaWorkflowResponse
     */
    CompletableFuture<ActivateMediaWorkflowResponse> activateMediaWorkflow(ActivateMediaWorkflowRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to process videos that are uploaded to Object Storage Service (OSS) but not processed. This way, you do not need to upload the videos to OSS again. If you have configured media workflows, OSS automatically notifies ApsaraVideo Media Processing (MPS) when a media file is uploaded to OSS. MPS automatically finds the corresponding workflow in the Active state based on the specified OSS bucket and object. Therefore, in most cases, you do not need to manually call the AddMedia operation to process the media file.</p>
     * <ul>
     * <li>Media information is automatically obtained only when the specified media workflow is in the Active state. If no media workflow is specified or the specified media workflow is not in the Active state, media information is not obtained.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddMedia  AddMediaRequest
     * @return AddMediaResponse
     */
    CompletableFuture<AddMediaResponse> addMedia(AddMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to add only one tag. To add multiple tags at a time, you can call the <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddMediaTag  AddMediaTagRequest
     * @return AddMediaTagResponse
     */
    CompletableFuture<AddMediaTagResponse> addMediaTag(AddMediaTagRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to define the topology, activities, and dependencies of a media workflow. The topology is represented by a directed acyclic graph (DAG) in the console. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Workflow activities</a>. You can view and run the workflows that are created by calling this operation in the ApsaraVideo Media Processing (MPS) console.</p>
     * <ul>
     * <li>MPS media workflows can be automatically triggered only by using the prefix of the file path. Automatic triggering by using the suffix is not supported. For more information about the trigger rules, see <a href="https://help.aliyun.com/document_detail/68574.html">Workflow triggering rules for files</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddMediaWorkflow  AddMediaWorkflowRequest
     * @return AddMediaWorkflowResponse
     */
    CompletableFuture<AddMediaWorkflowResponse> addMediaWorkflow(AddMediaWorkflowRequest request);

    /**
     * @param request the request parameters of AddPipeline  AddPipelineRequest
     * @return AddPipelineResponse
     */
    CompletableFuture<AddPipelineResponse> addPipeline(AddPipelineRequest request);

    /**
     * @param request the request parameters of AddSmarttagTemplate  AddSmarttagTemplateRequest
     * @return AddSmarttagTemplateResponse
     */
    CompletableFuture<AddSmarttagTemplateResponse> addSmarttagTemplate(AddSmarttagTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, you need to set transcoding parameters such as those related to the container format, video stream, and audio stream. If you do not specify some parameters, streams that are generated by using the template do not contain the information specified by those parameters.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddTemplate  AddTemplateRequest
     * @return AddTemplateResponse
     */
    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a watermark template by calling this operation, you can specify the watermark template and watermark asset when you <a href="https://help.aliyun.com/document_detail/29226.html">submit a transcoding job</a>. This allows you to add watermark information to the output video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddWaterMarkTemplate  AddWaterMarkTemplateRequest
     * @return AddWaterMarkTemplateResponse
     */
    CompletableFuture<AddWaterMarkTemplateResponse> addWaterMarkTemplate(AddWaterMarkTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an input media bucket, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of BindInputBucket  BindInputBucketRequest
     * @return BindInputBucketResponse
     */
    CompletableFuture<BindInputBucketResponse> bindInputBucket(BindInputBucketRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an output media bucket to the media library, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of BindOutputBucket  BindOutputBucketRequest
     * @return BindOutputBucketResponse
     */
    CompletableFuture<BindOutputBucketResponse> bindOutputBucket(BindOutputBucketRequest request);

    /**
     * <b>description</b> :
     * <p>  You can cancel a transcoding job only if the job is in the Submitted state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of CancelJob  CancelJobRequest
     * @return CancelJobResponse
     */
    CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request);

    /**
     * @param request the request parameters of CreateCustomEntity  CreateCustomEntityRequest
     * @return CreateCustomEntityResponse
     */
    CompletableFuture<CreateCustomEntityResponse> createCustomEntity(CreateCustomEntityRequest request);

    /**
     * @param request the request parameters of CreateCustomGroup  CreateCustomGroupRequest
     * @return CreateCustomGroupResponse
     */
    CompletableFuture<CreateCustomGroupResponse> createCustomGroup(CreateCustomGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a job to create a video or text fingerprint library. You can use a text fingerprint library to store fingerprints for text.</p>
     * <ul>
     * <li>You can submit a job of creating a text fingerprint library only in the China (Shanghai) region.</li>
     * <li>By default, you can submit up to 10 jobs of creating a video fingerprint library to an ApsaraVideo Media Processing (MPS) queue at a time. If you submit more than 10 jobs at a time, the call may fail.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of CreateFpShotDB  CreateFpShotDBRequest
     * @return CreateFpShotDBResponse
     */
    CompletableFuture<CreateFpShotDBResponse> createFpShotDB(CreateFpShotDBRequest request);

    /**
     * <b>description</b> :
     * <p>The time when the media workflow was created.</p>
     * 
     * @param request the request parameters of DeactivateMediaWorkflow  DeactivateMediaWorkflowRequest
     * @return DeactivateMediaWorkflowResponse
     */
    CompletableFuture<DeactivateMediaWorkflowResponse> deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request);

    /**
     * @param request the request parameters of DeleteCustomEntity  DeleteCustomEntityRequest
     * @return DeleteCustomEntityResponse
     */
    CompletableFuture<DeleteCustomEntityResponse> deleteCustomEntity(DeleteCustomEntityRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteCustomGroup  DeleteCustomGroupRequest
     * @return DeleteCustomGroupResponse
     */
    CompletableFuture<DeleteCustomGroupResponse> deleteCustomGroup(DeleteCustomGroupRequest request);

    /**
     * @param request the request parameters of DeleteCustomView  DeleteCustomViewRequest
     * @return DeleteCustomViewResponse
     */
    CompletableFuture<DeleteCustomViewResponse> deleteCustomView(DeleteCustomViewRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to logically delete a media file. The media file can no longer be processed, but the corresponding objects in the input and output Object Storage Service (OSS) buckets are retained.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMedia  DeleteMediaRequest
     * @return DeleteMediaResponse
     */
    CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove only one tag at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMediaTag  DeleteMediaTagRequest
     * @return DeleteMediaTagResponse
     */
    CompletableFuture<DeleteMediaTagResponse> deleteMediaTag(DeleteMediaTagRequest request);

    /**
     * <b>description</b> :
     * <p>After you delete or disable a workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteMediaWorkflow  DeleteMediaWorkflowRequest
     * @return DeleteMediaWorkflowResponse
     */
    CompletableFuture<DeleteMediaWorkflowResponse> deleteMediaWorkflow(DeleteMediaWorkflowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one MPS queue at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one template at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteSmarttagTemplate  DeleteSmarttagTemplateRequest
     * @return DeleteSmarttagTemplateResponse
     */
    CompletableFuture<DeleteSmarttagTemplateResponse> deleteSmarttagTemplate(DeleteSmarttagTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be deleted if it is being used by a job that has been submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>A watermark template cannot be deleted if it is being used by a submitted job.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteWaterMarkTemplate  DeleteWaterMarkTemplateRequest
     * @return DeleteWaterMarkTemplateResponse
     */
    CompletableFuture<DeleteWaterMarkTemplateResponse> deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  The moderation results are synchronously returned after the moderation is complete.</p>
     * <ul>
     * <li>You can use the image and text moderation feature only in the China (Beijing), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ImAudit  ImAuditRequest
     * @return ImAuditResponse
     */
    CompletableFuture<ImAuditResponse> imAudit(ImAuditRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to import multiple text files to a text fingerprint library at a time. The system extracts fingerprints from the text files and saves the fingerprints to the text fingerprint library.</p>
     * <ul>
     * <li>You can call this operation only in the China (Shanghai) region.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ImportFpShotJob  ImportFpShotJobRequest
     * @return ImportFpShotJobResponse
     */
    CompletableFuture<ImportFpShotJobResponse> importFpShotJob(ImportFpShotJobRequest request);

    /**
     * <b>description</b> :
     * <p>A maximum of 100 media buckets can be returned.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListAllMediaBucket  ListAllMediaBucketRequest
     * @return ListAllMediaBucketResponse
     */
    CompletableFuture<ListAllMediaBucketResponse> listAllMediaBucket(ListAllMediaBucketRequest request);

    /**
     * @param request the request parameters of ListCustomEntities  ListCustomEntitiesRequest
     * @return ListCustomEntitiesResponse
     */
    CompletableFuture<ListCustomEntitiesResponse> listCustomEntities(ListCustomEntitiesRequest request);

    /**
     * @param request the request parameters of ListCustomGroups  ListCustomGroupsRequest
     * @return ListCustomGroupsResponse
     */
    CompletableFuture<ListCustomGroupsResponse> listCustomGroups(ListCustomGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a figure or a figure library to query the corresponding information. If neither the figure ID nor figure library ID is specified, the operation returns the information about all figures and faces in all figure libraries within the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListCustomPersons  ListCustomPersonsRequest
     * @return ListCustomPersonsResponse
     */
    CompletableFuture<ListCustomPersonsResponse> listCustomPersons(ListCustomPersonsRequest request);

    /**
     * @param request the request parameters of ListCustomViews  ListCustomViewsRequest
     * @return ListCustomViewsResponse
     */
    CompletableFuture<ListCustomViewsResponse> listCustomViews(ListCustomViewsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status and information about the media fingerprint libraries based on the specified IDs.</p>
     * <ul>
     * <li>You can query text fingerprint libraries only in the China (Shanghai) region.</li>
     * <li>You can call this operation to query up to 10 media fingerprint libraries.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotDB  ListFpShotDBRequest
     * @return ListFpShotDBResponse
     */
    CompletableFuture<ListFpShotDBResponse> listFpShotDB(ListFpShotDBRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query media files in a specific media fingerprint library based on the library ID. This operation supports paged queries.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotFiles  ListFpShotFilesRequest
     * @return ListFpShotFilesResponse
     */
    CompletableFuture<ListFpShotFilesResponse> listFpShotFiles(ListFpShotFilesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Shanghai) region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListFpShotImportJob  ListFpShotImportJobRequest
     * @return ListFpShotImportJobResponse
     */
    CompletableFuture<ListFpShotImportJobResponse> listFpShotImportJob(ListFpShotImportJobRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, the returned transcoding jobs are sorted by CreationTime in descending order.</p>
     * <ul>
     * <li>You can call this operation to return transcoding jobs of the last 90 days. The jobs are returned based on the specified time range.</li>
     * <li>You can filter query results by configuring request parameters such as job status, creation time interval, and ApsaraVideo Media Processing (MPS) queue for transcoding.</li>
     * <li>By default, MPS does not allow you to access data across regions within the same account. Before you call this operation, make sure that the region that you specify is the same as the region of the transcoding jobs to be queried. Otherwise, this operation may fail to be called, or invalid information may be returned.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListJob  ListJobRequest
     * @return ListJobResponse
     */
    CompletableFuture<ListJobResponse> listJob(ListJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns execution instances only in the recent 90 days.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListMediaWorkflowExecutions  ListMediaWorkflowExecutionsRequest
     * @return ListMediaWorkflowExecutionsResponse
     */
    CompletableFuture<ListMediaWorkflowExecutionsResponse> listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request);

    /**
     * <b>description</b> :
     * <p>The time when the job was created.</p>
     * 
     * @param request the request parameters of QueryAnalysisJobList  QueryAnalysisJobListRequest
     * @return QueryAnalysisJobListResponse
     */
    CompletableFuture<QueryAnalysisJobListResponse> queryAnalysisJobList(QueryAnalysisJobListRequest request);

    /**
     * @param request the request parameters of QueryCopyrightExtractJob  QueryCopyrightExtractJobRequest
     * @return QueryCopyrightExtractJobResponse
     */
    CompletableFuture<QueryCopyrightExtractJobResponse> queryCopyrightExtractJob(QueryCopyrightExtractJobRequest request);

    /**
     * @param request the request parameters of QueryCopyrightJob  QueryCopyrightJobRequest
     * @return QueryCopyrightJobResponse
     */
    CompletableFuture<QueryCopyrightJobResponse> queryCopyrightJob(QueryCopyrightJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of clearing or deleting a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryFpDBDeleteJobList  QueryFpDBDeleteJobListRequest
     * @return QueryFpDBDeleteJobListResponse
     */
    CompletableFuture<QueryFpDBDeleteJobListResponse> queryFpDBDeleteJobList(QueryFpDBDeleteJobListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of deleting media files from a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryFpFileDeleteJobList  QueryFpFileDeleteJobListRequest
     * @return QueryFpFileDeleteJobListResponse
     */
    CompletableFuture<QueryFpFileDeleteJobListResponse> queryFpFileDeleteJobList(QueryFpFileDeleteJobListRequest request);

    /**
     * <b>description</b> :
     * <p>  After a media fingerprint analysis job is submitted, the media fingerprinting service compares the fingerprints of the job input with those of the media files in the media fingerprint library. You can call this operation to query the job results.</p>
     * <ul>
     * <li>You can query the results of a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of QueryFpShotJobList  QueryFpShotJobListRequest
     * @return QueryFpShotJobListResponse
     */
    CompletableFuture<QueryFpShotJobListResponse> queryFpShotJobList(QueryFpShotJobListRequest request);

    /**
     * @param request the request parameters of QueryIProductionJob  QueryIProductionJobRequest
     * @return QueryIProductionJobResponse
     */
    CompletableFuture<QueryIProductionJobResponse> queryIProductionJob(QueryIProductionJobRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, returned jobs are sorted in descending order by CreationTime.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 transcoding jobs at a time.</li>
     * <li>If you do not set the JobIds parameter, the <code>InvalidParameter</code> error code is returned.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryJobList  QueryJobListRequest
     * @return QueryJobListResponse
     */
    CompletableFuture<QueryJobListResponse> queryJobList(QueryJobListRequest request);

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobDetail  QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the content moderation jobs within three months.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobList  QueryMediaCensorJobListRequest
     * @return QueryMediaCensorJobListResponse
     */
    CompletableFuture<QueryMediaCensorJobListResponse> queryMediaCensorJobList(QueryMediaCensorJobListRequest request);

    /**
     * <b>description</b> :
     * <p>  In asynchronous mode, the media information can be retrieved only after the Message Service (MNS) callback of <strong>submitting a media information job</strong> is returned. If you have not retrieved the media information for a long period, the job may have failed.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 media information analysis jobs at a time.</li>
     * <li>By default, returned jobs are sorted in descending order by CreationTime.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaInfoJobList  QueryMediaInfoJobListRequest
     * @return QueryMediaInfoJobListResponse
     */
    CompletableFuture<QueryMediaInfoJobListResponse> queryMediaInfoJobList(QueryMediaInfoJobListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media files at a time.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request the request parameters of QueryMediaList  QueryMediaListRequest
     * @return QueryMediaListResponse
     */
    CompletableFuture<QueryMediaListResponse> queryMediaList(QueryMediaListRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 media files at a time.</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation to add media files.</li>
     * <li>You can call this operation to query only media files that are processed in a workflow. To obtain comprehensive information about a media file that is newly uploaded to OSS, you can call this operation after the corresponding workflow is complete. To query media files that are not processed in a workflow, you must call the <a href="https://help.aliyun.com/document_detail/29220.html">SubmitMediaInfoJob</a> operation to submit a media information analysis job. After the job is complete, you can query the information about the media files.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaListByURL  QueryMediaListByURLRequest
     * @return QueryMediaListByURLResponse
     */
    CompletableFuture<QueryMediaListByURLResponse> queryMediaListByURL(QueryMediaListByURLRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query a maximum of 10 media workflow execution instances at a time.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the workflow pipeline is enabled. Otherwise, the workflow may not run as expected. For example, the following exceptions may occur: the workflow node is invalid and jobs created in the workflow cannot be executed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaWorkflowExecutionList  QueryMediaWorkflowExecutionListRequest
     * @return QueryMediaWorkflowExecutionListResponse
     */
    CompletableFuture<QueryMediaWorkflowExecutionListResponse> queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media workflows at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryMediaWorkflowList  QueryMediaWorkflowListRequest
     * @return QueryMediaWorkflowListResponse
     */
    CompletableFuture<QueryMediaWorkflowListResponse> queryMediaWorkflowList(QueryMediaWorkflowListRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 MPS queues at a time.</p>
     * <ul>
     * <li>If <code>&quot;Code&quot;: &quot;InvalidIdentity.ServiceDisabled&quot;,&quot;Message&quot;: &quot;The request identity was not allowed operated.&quot;,&quot;Recommend&quot;</code> is returned after you call this operation, check whether the RAM user that you use is assigned the AliyunMTSDefaultRole role to obtain the permissions on MPS and whether your Alibaba Cloud account has overdue payments.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryPipelineList  QueryPipelineListRequest
     * @return QueryPipelineListResponse
     */
    CompletableFuture<QueryPipelineListResponse> queryPipelineList(QueryPipelineListRequest request);

    /**
     * @param request the request parameters of QuerySmarttagJob  QuerySmarttagJobRequest
     * @return QuerySmarttagJobResponse
     */
    CompletableFuture<QuerySmarttagJobResponse> querySmarttagJob(QuerySmarttagJobRequest request);

    /**
     * <b>description</b> :
     * <p>If you call this operation to query the information about a smart tagging template, you must specify the template ID. Otherwise, the operation returns the information about all the templates that are created by the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QuerySmarttagTemplateList  QuerySmarttagTemplateListRequest
     * @return QuerySmarttagTemplateListResponse
     */
    CompletableFuture<QuerySmarttagTemplateListResponse> querySmarttagTemplateList(QuerySmarttagTemplateListRequest request);

    /**
     * <b>description</b> :
     * <p>The status of the snapshot jobs that you want to query.</p>
     * <ul>
     * <li><strong>Submitted</strong>: The job was submitted.</li>
     * <li><strong>Snapshoting</strong>: The job is being processed.</li>
     * <li><strong>Success</strong>: The job was successfully processed.</li>
     * <li><strong>Fail</strong>: The job failed.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySnapshotJobList  QuerySnapshotJobListRequest
     * @return QuerySnapshotJobListResponse
     */
    CompletableFuture<QuerySnapshotJobListResponse> querySnapshotJobList(QuerySnapshotJobListRequest request);

    /**
     * <b>description</b> :
     * <p>The IDs of the transcoding templates that you want to query. You can query up to 10 transcoding templates at a time. Separate multiple IDs of custom transcoding templates with commas (,).</p>
     * 
     * @param request the request parameters of QueryTemplateList  QueryTemplateListRequest
     * @return QueryTemplateListResponse
     */
    CompletableFuture<QueryTemplateListResponse> queryTemplateList(QueryTemplateListRequest request);

    /**
     * @param request the request parameters of QueryTraceAbJob  QueryTraceAbJobRequest
     * @return QueryTraceAbJobResponse
     */
    CompletableFuture<QueryTraceAbJobResponse> queryTraceAbJob(QueryTraceAbJobRequest request);

    /**
     * @param request the request parameters of QueryTraceExtractJob  QueryTraceExtractJobRequest
     * @return QueryTraceExtractJobResponse
     */
    CompletableFuture<QueryTraceExtractJobResponse> queryTraceExtractJob(QueryTraceExtractJobRequest request);

    /**
     * @param request the request parameters of QueryTraceM3u8Job  QueryTraceM3u8JobRequest
     * @return QueryTraceM3u8JobResponse
     */
    CompletableFuture<QueryTraceM3u8JobResponse> queryTraceM3u8Job(QueryTraceM3u8JobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 watermark templates at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of QueryWaterMarkTemplateList  QueryWaterMarkTemplateListRequest
     * @return QueryWaterMarkTemplateListResponse
     */
    CompletableFuture<QueryWaterMarkTemplateListResponse> queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to register only one custom face at a time.</p>
     * <ul>
     * <li>A maximum of 10 images can be registered for a custom face.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of RegisterCustomFace  RegisterCustomFaceRequest
     * @return RegisterCustomFaceResponse
     */
    CompletableFuture<RegisterCustomFaceResponse> registerCustomFace(RegisterCustomFaceRequest request);

    /**
     * @param request the request parameters of RegisterCustomView  RegisterCustomViewRequest
     * @return RegisterCustomViewResponse
     */
    CompletableFuture<RegisterCustomViewResponse> registerCustomView(RegisterCustomViewRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media workflows in the specified state. If you do not specify the state, all media workflows are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchMediaWorkflow  SearchMediaWorkflowRequest
     * @return SearchMediaWorkflowResponse
     */
    CompletableFuture<SearchMediaWorkflowResponse> searchMediaWorkflow(SearchMediaWorkflowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MPS queues in the specified state. If you do not specify the state, all MPS queues are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchPipeline  SearchPipelineRequest
     * @return SearchPipelineResponse
     */
    CompletableFuture<SearchPipelineResponse> searchPipeline(SearchPipelineRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SearchTemplate  SearchTemplateRequest
     * @return SearchTemplateResponse
     */
    CompletableFuture<SearchTemplateResponse> searchTemplate(SearchTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>The total number of returned entries.</p>
     * 
     * @param request the request parameters of SearchWaterMarkTemplate  SearchWaterMarkTemplateRequest
     * @return SearchWaterMarkTemplateResponse
     */
    CompletableFuture<SearchWaterMarkTemplateResponse> searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  After you call the SubmitAnalysisJob operation to submit a preset template analysis job, ApsaraVideo Media Processing (MPS) intelligently analyzes the input file of the job and recommends a suitable preset template. You can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a> operation to query the analysis result or enable asynchronous notifications to receive the analysis result.</p>
     * <ul>
     * <li>The analysis result is retained only for two weeks after it is generated. The analysis result is deleted after two weeks. If you use the recommended preset template in a transcoding job after two weeks, the job fails, and the <code>AnalysisResultNotFound</code> error code is returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitAnalysisJob  SubmitAnalysisJobRequest
     * @return SubmitAnalysisJobResponse
     */
    CompletableFuture<SubmitAnalysisJobResponse> submitAnalysisJob(SubmitAnalysisJobRequest request);

    /**
     * @param request the request parameters of SubmitCopyrightExtractJob  SubmitCopyrightExtractJobRequest
     * @return SubmitCopyrightExtractJobResponse
     */
    CompletableFuture<SubmitCopyrightExtractJobResponse> submitCopyrightExtractJob(SubmitCopyrightExtractJobRequest request);

    /**
     * @param request the request parameters of SubmitCopyrightJob  SubmitCopyrightJobRequest
     * @return SubmitCopyrightJobResponse
     */
    CompletableFuture<SubmitCopyrightJobResponse> submitCopyrightJob(SubmitCopyrightJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to clear or delete the specified media fingerprint library based on the library ID. If you clear a media fingerprint library, the content in the library is deleted, but the library is not deleted. If you delete a media fingerprint library, both the library and the content in the library are deleted. If you do not specify the operation type, the system clears the media fingerprint library by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitFpDBDeleteJob  SubmitFpDBDeleteJobRequest
     * @return SubmitFpDBDeleteJobResponse
     */
    CompletableFuture<SubmitFpDBDeleteJobResponse> submitFpDBDeleteJob(SubmitFpDBDeleteJobRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>You can call this operation to delete up to 200 media files from a media fingerprint library at a time.</li>
     * <li>This operation is available in the following regions: China (Beijing), China (Hangzhou), China (Shanghai), and Singapore.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitFpFileDeleteJob  SubmitFpFileDeleteJobRequest
     * @return SubmitFpFileDeleteJobResponse
     */
    CompletableFuture<SubmitFpFileDeleteJobResponse> submitFpFileDeleteJob(SubmitFpFileDeleteJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a video, audio, image, or text fingerprint analysis job.</p>
     * <ul>
     * <li>This operation asynchronously submits a job. The query results may not have been generated when the response is returned. After the results are generated, an asynchronous message is returned.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * <li>The input file of the job must be in one of the following formats:<ul>
     * <li>Image formats: JPEG, PNG, and BMP.</li>
     * <li>Video formats: MP4, AVI, MKV, MPG, TS, MOV, FLV, MXF.</li>
     * <li>Video encoding formats: MPEG2, MPEG4, H264, HEVC, and WMV.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 150 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitFpShotJob  SubmitFpShotJobRequest
     * @return SubmitFpShotJobResponse
     */
    CompletableFuture<SubmitFpShotJobResponse> submitFpShotJob(SubmitFpShotJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Jobs that are submitted by calling this operation run in an asynchronous manner. After a job is added to the ApsaraVideo Media Processing (MPS) queue, the job is scheduled to run. You can call the <a href="https://help.aliyun.com/document_detail/170217.html">QueryIProductionJob</a> operation or configure a callback to query the job result.</p>
     * <ul>
     * <li>Capabilities provided by the intelligent production feature vary based on the region. Before you call this operation to submit an intelligent production job, check whether the job is supported in the region in which your service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/43248.html">Regions and endpoints</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitIProductionJob  SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request);

    /**
     * @param request the request parameters of SubmitImageCopyright  SubmitImageCopyrightRequest
     * @return SubmitImageCopyrightResponse
     */
    CompletableFuture<SubmitImageCopyrightResponse> submitImageCopyright(SubmitImageCopyrightRequest request);

    /**
     * <b>description</b> :
     * <p>  SubmitJobs is an asynchronous operation. After you submit transcoding jobs, the jobs are added to an MPS queue to be scheduled and run. The transcoding jobs may not have been complete when the response is returned. After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/602836.html">QueryJobList</a> operation to query the job results. You can also associate a Message Service (MNS) queue or topic with the MPS queue to receive notifications on the jobs. For more information, see <a href="https://help.aliyun.com/document_detail/42618.html">Receive notifications</a>.</p>
     * <ul>
     * <li>An input file can be up to 100 GB in size. If the size of the input file exceeds this limit, the job may fail.</li>
     * <li>If you use an <strong>intelligent preset template</strong> to transcode an input file, you must first call the <a href="https://help.aliyun.com/document_detail/29223.html">SubmitAnalysisJob</a> operation to submit a preset template analysis job. After the analysis job is complete, you can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a>operation to obtain the available preset templates for the input file. When you submit a transcoding job, set TemplateId to the ID of an available preset template. If you specify a preset template that is not in the available preset templates, the transcoding job fails.</li>
     * <li>If you use a <strong>static preset template</strong> to transcode an input file, you do not need to submit a preset template analysis job.</li>
     * <li>If you want to use multiple accounts in MPS, you can create Resource Access Management (RAM) users by using your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/42841.html">Create a RAM user and grant permissions to the RAM user</a>. If the Alibaba Cloud account that is used to query transcoding jobs is not the one that is used to submit the transcoding jobs, no data is returned.</li>
     * <li>For information about transcoding FAQ, see <a href="https://help.aliyun.com/document_detail/38986.html">FAQ about MPS</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitJobs  SubmitJobsRequest
     * @return SubmitJobsResponse
     */
    CompletableFuture<SubmitJobsResponse> submitJobs(SubmitJobsRequest request);

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue and then scheduled, queued, and run. You can call the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job result.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitMediaCensorJob  SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you submit a media information analysis job, make sure that the input file is uploaded to an Object Storage Service (OSS) bucket. Otherwise, the job fails. You can configure upload callbacks to be notified of the upload status of files.****</p>
     * <ul>
     * <li>A media information analysis job can be run in synchronous or asynchronous mode.</li>
     * <li>In asynchronous mode, the media information analysis job is submitted to and scheduled in an ApsaraVideo Media Processing (MPS) queue. In this case, the media information analysis job may be queued. The media information analysis job may not be generated when the response to the SubmitMediaInfoJob operation is returned. After the execution is complete, you can call the <a href="https://help.aliyun.com/document_detail/602828.html">QueryMediaInfoJobList</a> operation to poll the execution results, or associate a Message Service (MNS) queue or topic with the MPS queue to receive the execution results. For more information, see <a href="https://www.alibabacloud.com/help/en/mps/receive-message-notifications/?spm=a2c63.p38356.0.0.b48576d2jxNSca">Receive message notifications</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of requests that you send to call this operation within one second reaches the request limit of this operation, new requests fail and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitMediaInfoJob  SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    /**
     * @param request the request parameters of SubmitSmarttagJob  SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Only JPG images can be generated by calling this operation.</p>
     * <ul>
     * <li>Asynchronous mode: This operation may return a response before snapshots are captured. Snapshot jobs are queued in the background and asynchronously processed by ApsaraVideo Media Processing (MPS). If the <strong>Interval</strong> or <strong>Num</strong> parameter is set, the snapshot job is processed in asynchronous mode. For more information about FAQ about capturing snapshots, see <a href="https://help.aliyun.com/document_detail/60805.html">FAQ about taking snapshots</a>.</li>
     * <li>Notifications: When you submit a snapshot job, the <strong>PipelineId</strong> parameter is required. An asynchronous message is sent only after the notification feature is enabled for the MPS queue.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceAbJob  SubmitTraceAbJobRequest
     * @return SubmitTraceAbJobResponse
     */
    CompletableFuture<SubmitTraceAbJobResponse> submitTraceAbJob(SubmitTraceAbJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceExtractJob  SubmitTraceExtractJobRequest
     * @return SubmitTraceExtractJobResponse
     */
    CompletableFuture<SubmitTraceExtractJobResponse> submitTraceExtractJob(SubmitTraceExtractJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceM3u8Job  SubmitTraceM3u8JobRequest
     * @return SubmitTraceM3u8JobResponse
     */
    CompletableFuture<SubmitTraceM3u8JobResponse> submitTraceM3u8Job(SubmitTraceM3u8JobRequest request);

    /**
     * <b>description</b> :
     * <p>The response parameters.</p>
     * 
     * @param request the request parameters of TagCustomPerson  TagCustomPersonRequest
     * @return TagCustomPersonResponse
     */
    CompletableFuture<TagCustomPersonResponse> tagCustomPerson(TagCustomPersonRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation to unbind an input media bucket from the media library based on the name of the output media bucket.</p>
     * <h1>QPS limits</h1>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UnbindInputBucket  UnbindInputBucketRequest
     * @return UnbindInputBucketResponse
     */
    CompletableFuture<UnbindInputBucketResponse> unbindInputBucket(UnbindInputBucketRequest request);

    /**
     * <b>description</b> :
     * <p>The name of the output media bucket to be unbound. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS)</strong> console and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>Object Storage Service (OSS) console</strong> and click <strong>My OSS Paths</strong>.</p>
     * 
     * @param request the request parameters of UnbindOutputBucket  UnbindOutputBucketRequest
     * @return UnbindOutputBucketResponse
     */
    CompletableFuture<UnbindOutputBucketResponse> unbindOutputBucket(UnbindOutputBucketRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specific custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UnregisterCustomFace  UnregisterCustomFaceRequest
     * @return UnregisterCustomFaceResponse
     */
    CompletableFuture<UnregisterCustomFaceResponse> unregisterCustomFace(UnregisterCustomFaceRequest request);

    /**
     * <b>description</b> :
     * <p>The basic information that you can update by calling this operation includes the title, description, and category of a media file. This operation applies to a full update. You must set all the parameters unless you want to replace the value of a specific parameter with a NULL value.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMedia  UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the category of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaCategory  UpdateMediaCategoryRequest
     * @return UpdateMediaCategoryResponse
     */
    CompletableFuture<UpdateMediaCategoryResponse> updateMediaCategory(UpdateMediaCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the thumbnail of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h2>Limits on QPS</h2>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaCover  UpdateMediaCoverRequest
     * @return UpdateMediaCoverResponse
     */
    CompletableFuture<UpdateMediaCoverResponse> updateMediaCover(UpdateMediaCoverRequest request);

    /**
     * <b>description</b> :
     * <p>The published state indicates that the access control list (ACL) of media playback resources and snapshot files is set to inherit the ACL of the bucket to which they belong. The unpublished state indicates that the ACL of media playback resources and snapshot files is set to private.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaPublishState  UpdateMediaPublishStateRequest
     * @return UpdateMediaPublishStateResponse
     */
    CompletableFuture<UpdateMediaPublishStateResponse> updateMediaPublishState(UpdateMediaPublishStateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the topology of a media workflow. To update the trigger mode of a media workflow, call the <a href="https://help.aliyun.com/document_detail/70372.html">UpdateMediaWorkflowTriggerMode</a> operation.</p>
     * <ul>
     * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.
     * <warning>Deleting or deactivating a workflow will not affect tasks that have already been submitted. If a workflow is deleted or deactivated after a task has been submitted, tasks that are already in the processing queue will not be canceled and will be executed normally and charged the corresponding fees.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.&gt;</p>
     * 
     * @param request the request parameters of UpdateMediaWorkflow  UpdateMediaWorkflowRequest
     * @return UpdateMediaWorkflowResponse
     */
    CompletableFuture<UpdateMediaWorkflowResponse> updateMediaWorkflow(UpdateMediaWorkflowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only to modify the trigger mode of a media workflow. To modify other information about the workflow, call the <a href="https://help.aliyun.com/document_detail/44438.html">UpdateMediaWorkflow</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateMediaWorkflowTriggerMode  UpdateMediaWorkflowTriggerModeRequest
     * @return UpdateMediaWorkflowTriggerModeResponse
     */
    CompletableFuture<UpdateMediaWorkflowTriggerModeResponse> updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify the name, status, and notification settings of the specified MPS queue.</p>
     * <ul>
     * <li>If a paused MPS queue is selected in a workflow or a job, such as a video review or media fingerprint job, the workflow or job fails.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * @param request the request parameters of UpdateSmarttagTemplate  UpdateSmarttagTemplateRequest
     * @return UpdateSmarttagTemplateResponse
     */
    CompletableFuture<UpdateSmarttagTemplateResponse> updateSmarttagTemplate(UpdateSmarttagTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be updated if it is being used by a job that has been submitted.The ID of the template. You can obtain the template ID from the response of the <a href="https://help.aliyun.com/document_detail/213306.html">AddTemplate</a> operation.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the information about a watermark template based on the ID of the watermark template. For example, you can update the name and configurations of a watermark template.</p>
     * <ul>
     * <li>A watermark template cannot be updated if it is being used by a job that has been submitted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of UpdateWaterMarkTemplate  UpdateWaterMarkTemplateRequest
     * @return UpdateWaterMarkTemplateResponse
     */
    CompletableFuture<UpdateWaterMarkTemplateResponse> updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request);

}
