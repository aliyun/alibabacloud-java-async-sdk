// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qualitycheck20190115.models.*;
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
     * @param request the request parameters of AddBusinessCategory  AddBusinessCategoryRequest
     * @return AddBusinessCategoryResponse
     */
    CompletableFuture<AddBusinessCategoryResponse> addBusinessCategory(AddBusinessCategoryRequest request);

    /**
     * @param request the request parameters of AddRuleCategory  AddRuleCategoryRequest
     * @return AddRuleCategoryResponse
     */
    CompletableFuture<AddRuleCategoryResponse> addRuleCategory(AddRuleCategoryRequest request);

    /**
     * @param request the request parameters of AddRuleV4  AddRuleV4Request
     * @return AddRuleV4Response
     */
    CompletableFuture<AddRuleV4Response> addRuleV4(AddRuleV4Request request);

    /**
     * @param request the request parameters of AnalyzeLabel  AnalyzeLabelRequest
     * @return AnalyzeLabelResponse
     */
    CompletableFuture<AnalyzeLabelResponse> analyzeLabel(AnalyzeLabelRequest request);

    /**
     * @param request the request parameters of ApplyWsToken  ApplyWsTokenRequest
     * @return ApplyWsTokenResponse
     */
    CompletableFuture<ApplyWsTokenResponse> applyWsToken(ApplyWsTokenRequest request);

    /**
     * <b>description</b> :
     * <p>You can manually assign files that have completed quality inspection to reviewers. Assignments can be made one file at a time or in batches:
     * Single-file assignment: Assign a specific file to a specified reviewer.
     * Batch assignment: Assign multiple filtered files to one or more reviewers. You can specify how many files each reviewer receives, or let the system distribute the files evenly among reviewers.</p>
     * 
     * @param request the request parameters of AssignReviewer  AssignReviewerRequest
     * @return AssignReviewerResponse
     */
    CompletableFuture<AssignReviewerResponse> assignReviewer(AssignReviewerRequest request);

    /**
     * @deprecated OpenAPI AssignReviewerBySessionGroup is deprecated  * @param request  the request parameters of AssignReviewerBySessionGroup  AssignReviewerBySessionGroupRequest
     * @return AssignReviewerBySessionGroupResponse
     */
    @Deprecated
    CompletableFuture<AssignReviewerBySessionGroupResponse> assignReviewerBySessionGroup(AssignReviewerBySessionGroupRequest request);

    /**
     * @param request the request parameters of BatchSubmitReviewInfo  BatchSubmitReviewInfoRequest
     * @return BatchSubmitReviewInfoResponse
     */
    CompletableFuture<BatchSubmitReviewInfoResponse> batchSubmitReviewInfo(BatchSubmitReviewInfoRequest request);

    /**
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
     * @param request the request parameters of CreateAgentTask  CreateAgentTaskRequest
     * @return CreateAgentTaskResponse
     */
    CompletableFuture<CreateAgentTaskResponse> createAgentTask(CreateAgentTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Hotwords help improve recognition accuracy for specific terms, such as names, place names, or technical terms. <a href="https://help.aliyun.com/document_detail/213249.html">Learn more</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAsrVocab  CreateAsrVocabRequest
     * @return CreateAsrVocabResponse
     */
    CompletableFuture<CreateAsrVocabResponse> createAsrVocab(CreateAsrVocabRequest request);

    /**
     * @param request the request parameters of CreateCheckTypeToScheme  CreateCheckTypeToSchemeRequest
     * @return CreateCheckTypeToSchemeResponse
     */
    CompletableFuture<CreateCheckTypeToSchemeResponse> createCheckTypeToScheme(CreateCheckTypeToSchemeRequest request);

    /**
     * @param request the request parameters of CreateMiningTask  CreateMiningTaskRequest
     * @return CreateMiningTaskResponse
     */
    CompletableFuture<CreateMiningTaskResponse> createMiningTask(CreateMiningTaskRequest request);

    /**
     * @param request the request parameters of CreateQualityCheckScheme  CreateQualityCheckSchemeRequest
     * @return CreateQualityCheckSchemeResponse
     */
    CompletableFuture<CreateQualityCheckSchemeResponse> createQualityCheckScheme(CreateQualityCheckSchemeRequest request);

    /**
     * @param request the request parameters of CreateSchemeTaskConfig  CreateSchemeTaskConfigRequest
     * @return CreateSchemeTaskConfigResponse
     */
    CompletableFuture<CreateSchemeTaskConfigResponse> createSchemeTaskConfig(CreateSchemeTaskConfigRequest request);

    /**
     * @deprecated OpenAPI CreateSkillGroupConfig is deprecated  * @param request  the request parameters of CreateSkillGroupConfig  CreateSkillGroupConfigRequest
     * @return CreateSkillGroupConfigResponse
     */
    @Deprecated
    CompletableFuture<CreateSkillGroupConfigResponse> createSkillGroupConfig(CreateSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of CreateTaskAssignRule  CreateTaskAssignRuleRequest
     * @return CreateTaskAssignRuleResponse
     */
    CompletableFuture<CreateTaskAssignRuleResponse> createTaskAssignRule(CreateTaskAssignRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud uses Resource Access Management (RAM) for unified account management. Before you create a user in Smart Conversation Analysis, first create the user in <a href="https://ram.console.aliyun.com">RAM</a>. Then, obtain the user’s UID, username, and display name. Finally, add the RAM user to Smart Conversation Analysis to grant them access to the Smart Conversation Analysis service.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateWarningConfig  CreateWarningConfigRequest
     * @return CreateWarningConfigResponse
     */
    CompletableFuture<CreateWarningConfigResponse> createWarningConfig(CreateWarningConfigRequest request);

    /**
     * @param request the request parameters of CreateWarningStrategyConfig  CreateWarningStrategyConfigRequest
     * @return CreateWarningStrategyConfigResponse
     */
    CompletableFuture<CreateWarningStrategyConfigResponse> createWarningStrategyConfig(CreateWarningStrategyConfigRequest request);

    /**
     * @param request the request parameters of DelRuleCategory  DelRuleCategoryRequest
     * @return DelRuleCategoryResponse
     */
    CompletableFuture<DelRuleCategoryResponse> delRuleCategory(DelRuleCategoryRequest request);

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * @param request the request parameters of DeleteAsrVocab  DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     */
    CompletableFuture<DeleteAsrVocabResponse> deleteAsrVocab(DeleteAsrVocabRequest request);

    /**
     * @param request the request parameters of DeleteBusinessCategory  DeleteBusinessCategoryRequest
     * @return DeleteBusinessCategoryResponse
     */
    CompletableFuture<DeleteBusinessCategoryResponse> deleteBusinessCategory(DeleteBusinessCategoryRequest request);

    /**
     * @param request the request parameters of DeleteCheckTypeToScheme  DeleteCheckTypeToSchemeRequest
     * @return DeleteCheckTypeToSchemeResponse
     */
    CompletableFuture<DeleteCheckTypeToSchemeResponse> deleteCheckTypeToScheme(DeleteCheckTypeToSchemeRequest request);

    /**
     * @param request the request parameters of DeleteCustomizationConfig  DeleteCustomizationConfigRequest
     * @return DeleteCustomizationConfigResponse
     */
    CompletableFuture<DeleteCustomizationConfigResponse> deleteCustomizationConfig(DeleteCustomizationConfigRequest request);

    /**
     * @deprecated OpenAPI DeleteDataSet is deprecated  * @param request  the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    @Deprecated
    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    /**
     * @param request the request parameters of DeleteQualityCheckScheme  DeleteQualityCheckSchemeRequest
     * @return DeleteQualityCheckSchemeResponse
     */
    CompletableFuture<DeleteQualityCheckSchemeResponse> deleteQualityCheckScheme(DeleteQualityCheckSchemeRequest request);

    /**
     * @deprecated OpenAPI DeleteRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.  * @param request  the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    @Deprecated
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * @param request the request parameters of DeleteRuleV4  DeleteRuleV4Request
     * @return DeleteRuleV4Response
     */
    CompletableFuture<DeleteRuleV4Response> deleteRuleV4(DeleteRuleV4Request request);

    /**
     * @param request the request parameters of DeleteSchemeTaskConfig  DeleteSchemeTaskConfigRequest
     * @return DeleteSchemeTaskConfigResponse
     */
    CompletableFuture<DeleteSchemeTaskConfigResponse> deleteSchemeTaskConfig(DeleteSchemeTaskConfigRequest request);

    /**
     * @deprecated OpenAPI DeleteSkillGroupConfig is deprecated  * @param request  the request parameters of DeleteSkillGroupConfig  DeleteSkillGroupConfigRequest
     * @return DeleteSkillGroupConfigResponse
     */
    @Deprecated
    CompletableFuture<DeleteSkillGroupConfigResponse> deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DeleteTaskAssignRule  DeleteTaskAssignRuleRequest
     * @return DeleteTaskAssignRuleResponse
     */
    CompletableFuture<DeleteTaskAssignRuleResponse> deleteTaskAssignRule(DeleteTaskAssignRuleRequest request);

    /**
     * @param request the request parameters of DeleteWarningConfig  DeleteWarningConfigRequest
     * @return DeleteWarningConfigResponse
     */
    CompletableFuture<DeleteWarningConfigResponse> deleteWarningConfig(DeleteWarningConfigRequest request);

    /**
     * @param request the request parameters of DeleteWarningStrategyConfig  DeleteWarningStrategyConfigRequest
     * @return DeleteWarningStrategyConfigResponse
     */
    CompletableFuture<DeleteWarningStrategyConfigResponse> deleteWarningStrategyConfig(DeleteWarningStrategyConfigRequest request);

    /**
     * @param request the request parameters of ExecuteAgent  ExecuteAgentRequest
     * @return ExecuteAgentResponse
     */
    CompletableFuture<ExecuteAgentResponse> executeAgent(ExecuteAgentRequest request);

    ResponseIterable<ExecuteAgentResponseBody> executeAgentWithResponseIterable(ExecuteAgentRequest request);

    /**
     * @param request the request parameters of GenerateLabel  GenerateLabelRequest
     * @return GenerateLabelResponse
     */
    CompletableFuture<GenerateLabelResponse> generateLabel(GenerateLabelRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * @param request the request parameters of GetAgentMJobInfo  GetAgentMJobInfoRequest
     * @return GetAgentMJobInfoResponse
     */
    CompletableFuture<GetAgentMJobInfoResponse> getAgentMJobInfo(GetAgentMJobInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries data uploaded through <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>, or queries data from a dataset quality check task <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can query by task ID (taskId) or by time range.
     * By default, only partial parameters are returned in the response. Use the requiredFields request parameter to specify which fields to include in the response.</p>
     * 
     * @param request the request parameters of GetAgentTaskResult  GetAgentTaskResultRequest
     * @return GetAgentTaskResultResponse
     */
    CompletableFuture<GetAgentTaskResultResponse> getAgentTaskResult(GetAgentTaskResultRequest request);

    /**
     * @param request the request parameters of GetAsrVocab  GetAsrVocabRequest
     * @return GetAsrVocabResponse
     */
    CompletableFuture<GetAsrVocabResponse> getAsrVocab(GetAsrVocabRequest request);

    /**
     * @param request the request parameters of GetBusinessCategoryList  GetBusinessCategoryListRequest
     * @return GetBusinessCategoryListResponse
     */
    CompletableFuture<GetBusinessCategoryListResponse> getBusinessCategoryList(GetBusinessCategoryListRequest request);

    /**
     * @param request the request parameters of GetCustomizationConfigList  GetCustomizationConfigListRequest
     * @return GetCustomizationConfigListResponse
     */
    CompletableFuture<GetCustomizationConfigListResponse> getCustomizationConfigList(GetCustomizationConfigListRequest request);

    /**
     * @param request the request parameters of GetLabelAnalysisResult  GetLabelAnalysisResultRequest
     * @return GetLabelAnalysisResultResponse
     */
    CompletableFuture<GetLabelAnalysisResultResponse> getLabelAnalysisResult(GetLabelAnalysisResultRequest request);

    /**
     * @param request the request parameters of GetLabelGeneratedResult  GetLabelGeneratedResultRequest
     * @return GetLabelGeneratedResultResponse
     */
    CompletableFuture<GetLabelGeneratedResultResponse> getLabelGeneratedResult(GetLabelGeneratedResultRequest request);

    /**
     * @param request the request parameters of GetMiningTaskResult  GetMiningTaskResultRequest
     * @return GetMiningTaskResultResponse
     */
    CompletableFuture<GetMiningTaskResultResponse> getMiningTaskResult(GetMiningTaskResultRequest request);

    /**
     * @param request the request parameters of GetNextResultToVerify  GetNextResultToVerifyRequest
     * @return GetNextResultToVerifyResponse
     */
    CompletableFuture<GetNextResultToVerifyResponse> getNextResultToVerify(GetNextResultToVerifyRequest request);

    /**
     * @param request the request parameters of GetQualityCheckScheme  GetQualityCheckSchemeRequest
     * @return GetQualityCheckSchemeResponse
     */
    CompletableFuture<GetQualityCheckSchemeResponse> getQualityCheckScheme(GetQualityCheckSchemeRequest request);

    /**
     * <b>description</b> :
     * <p>You can query data uploaded using <a href="https://help.aliyun.com/document_detail/139399.html">UploadAudioData</a> or <a href="https://help.aliyun.com/document_detail/111394.html">UploadData</a>. You can also query data from dataset-based quality inspection tasks created with <a href="https://help.aliyun.com/document_detail/158890.html">SubmitQualityCheckTask</a>. You can search by task ID (taskId) or by time range.</p>
     * 
     * @param request the request parameters of GetResult  GetResultRequest
     * @return GetResultResponse
     */
    CompletableFuture<GetResultResponse> getResult(GetResultRequest request);

    /**
     * @param request the request parameters of GetResultToReview  GetResultToReviewRequest
     * @return GetResultToReviewResponse
     */
    CompletableFuture<GetResultToReviewResponse> getResultToReview(GetResultToReviewRequest request);

    /**
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @description > This operation returns basic rule information such as the **id** and **name**. You can use this information with [GetRuleDetails](https://help.aliyun.com/document_detail/142310.html).
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    @Deprecated
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
     * @deprecated OpenAPI GetRuleById is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRuleById  GetRuleByIdRequest
     * @return GetRuleByIdResponse
     */
    @Deprecated
    CompletableFuture<GetRuleByIdResponse> getRuleById(GetRuleByIdRequest request);

    /**
     * @param request the request parameters of GetRuleCategory  GetRuleCategoryRequest
     * @return GetRuleCategoryResponse
     */
    CompletableFuture<GetRuleCategoryResponse> getRuleCategory(GetRuleCategoryRequest request);

    /**
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @description > This operation is used in conjunction with [Get basic rule information](https://help.aliyun.com/document_detail/142333.html). First, call the GetRule operation to obtain the rule ID. Then, use the rule ID as a parameter to call the **GetRuleDetail** operation.
     * 
     * @param request the request parameters of GetRuleDetail  GetRuleDetailRequest
     * @return GetRuleDetailResponse
     */
    @Deprecated
    CompletableFuture<GetRuleDetailResponse> getRuleDetail(GetRuleDetailRequest request);

    /**
     * @param request the request parameters of GetRuleV4  GetRuleV4Request
     * @return GetRuleV4Response
     */
    CompletableFuture<GetRuleV4Response> getRuleV4(GetRuleV4Request request);

    /**
     * @param request the request parameters of GetRulesCountList  GetRulesCountListRequest
     * @return GetRulesCountListResponse
     */
    CompletableFuture<GetRulesCountListResponse> getRulesCountList(GetRulesCountListRequest request);

    /**
     * @param request the request parameters of GetSchemeTaskConfig  GetSchemeTaskConfigRequest
     * @return GetSchemeTaskConfigResponse
     */
    CompletableFuture<GetSchemeTaskConfigResponse> getSchemeTaskConfig(GetSchemeTaskConfigRequest request);

    /**
     * @deprecated OpenAPI GetSkillGroupConfig is deprecated  * @param request  the request parameters of GetSkillGroupConfig  GetSkillGroupConfigRequest
     * @return GetSkillGroupConfigResponse
     */
    @Deprecated
    CompletableFuture<GetSkillGroupConfigResponse> getSkillGroupConfig(GetSkillGroupConfigRequest request);

    /**
     * @deprecated OpenAPI GetSyncResult is deprecated, please use Qualitycheck::2019-01-15::GetResult instead.  * @param request  the request parameters of GetSyncResult  GetSyncResultRequest
     * @return GetSyncResultResponse
     */
    @Deprecated
    CompletableFuture<GetSyncResultResponse> getSyncResult(GetSyncResultRequest request);

    /**
     * @param request the request parameters of GetTag  GetTagRequest
     * @return GetTagResponse
     */
    CompletableFuture<GetTagResponse> getTag(GetTagRequest request);

    /**
     * @param request the request parameters of GetWarningStrategyConfig  GetWarningStrategyConfigRequest
     * @return GetWarningStrategyConfigResponse
     */
    CompletableFuture<GetWarningStrategyConfigResponse> getWarningStrategyConfig(GetWarningStrategyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only quality checkers or administrators can call this operation.</p>
     * 
     * @param request the request parameters of HandleComplaint  HandleComplaintRequest
     * @return HandleComplaintResponse
     */
    CompletableFuture<HandleComplaintResponse> handleComplaint(HandleComplaintRequest request);

    /**
     * @deprecated OpenAPI InvalidRule is deprecated, please use Qualitycheck::2019-01-15::DeleteRuleV4 instead.  * @param request  the request parameters of InvalidRule  InvalidRuleRequest
     * @return InvalidRuleResponse
     */
    @Deprecated
    CompletableFuture<InvalidRuleResponse> invalidRule(InvalidRuleRequest request);

    /**
     * @param request the request parameters of ListAgentMJobInfo  ListAgentMJobInfoRequest
     * @return ListAgentMJobInfoResponse
     */
    CompletableFuture<ListAgentMJobInfoResponse> listAgentMJobInfo(ListAgentMJobInfoRequest request);

    /**
     * @param request the request parameters of ListAsrVocab  ListAsrVocabRequest
     * @return ListAsrVocabResponse
     */
    CompletableFuture<ListAsrVocabResponse> listAsrVocab(ListAsrVocabRequest request);

    /**
     * @deprecated OpenAPI ListDataSet is deprecated  * @param request  the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    @Deprecated
    CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request);

    /**
     * @param request the request parameters of ListQualityCheckScheme  ListQualityCheckSchemeRequest
     * @return ListQualityCheckSchemeResponse
     */
    CompletableFuture<ListQualityCheckSchemeResponse> listQualityCheckScheme(ListQualityCheckSchemeRequest request);

    /**
     * @deprecated OpenAPI ListRules is deprecated, please use Qualitycheck::2019-01-15::ListRulesV4 instead.  * @param request  the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    @Deprecated
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListRulesV4  ListRulesV4Request
     * @return ListRulesV4Response
     */
    CompletableFuture<ListRulesV4Response> listRulesV4(ListRulesV4Request request);

    /**
     * @param request the request parameters of ListSchemeTaskConfig  ListSchemeTaskConfigRequest
     * @return ListSchemeTaskConfigResponse
     */
    CompletableFuture<ListSchemeTaskConfigResponse> listSchemeTaskConfig(ListSchemeTaskConfigRequest request);

    /**
     * @deprecated OpenAPI ListSessionGroup is deprecated  * @param request  the request parameters of ListSessionGroup  ListSessionGroupRequest
     * @return ListSessionGroupResponse
     */
    @Deprecated
    CompletableFuture<ListSessionGroupResponse> listSessionGroup(ListSessionGroupRequest request);

    /**
     * @deprecated OpenAPI ListSkillGroupConfig is deprecated  * @param request  the request parameters of ListSkillGroupConfig  ListSkillGroupConfigRequest
     * @return ListSkillGroupConfigResponse
     */
    @Deprecated
    CompletableFuture<ListSkillGroupConfigResponse> listSkillGroupConfig(ListSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of ListTag  ListTagRequest
     * @return ListTagResponse
     */
    CompletableFuture<ListTagResponse> listTag(ListTagRequest request);

    /**
     * @param request the request parameters of ListTaskAssignRules  ListTaskAssignRulesRequest
     * @return ListTaskAssignRulesResponse
     */
    CompletableFuture<ListTaskAssignRulesResponse> listTaskAssignRules(ListTaskAssignRulesRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListWarningConfig  ListWarningConfigRequest
     * @return ListWarningConfigResponse
     */
    CompletableFuture<ListWarningConfigResponse> listWarningConfig(ListWarningConfigRequest request);

    /**
     * @param request the request parameters of ListWarningStrategyConfig  ListWarningStrategyConfigRequest
     * @return ListWarningStrategyConfigResponse
     */
    CompletableFuture<ListWarningStrategyConfigResponse> listWarningStrategyConfig(ListWarningStrategyConfigRequest request);

    /**
     * @param request the request parameters of RevertAssignedSession  RevertAssignedSessionRequest
     * @return RevertAssignedSessionResponse
     */
    CompletableFuture<RevertAssignedSessionResponse> revertAssignedSession(RevertAssignedSessionRequest request);

    /**
     * @deprecated OpenAPI RevertAssignedSessionGroup is deprecated  * @param request  the request parameters of RevertAssignedSessionGroup  RevertAssignedSessionGroupRequest
     * @return RevertAssignedSessionGroupResponse
     */
    @Deprecated
    CompletableFuture<RevertAssignedSessionGroupResponse> revertAssignedSessionGroup(RevertAssignedSessionGroupRequest request);

    /**
     * @param request the request parameters of RunCompletionMessage  RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    CompletableFuture<RunCompletionMessageResponse> runCompletionMessage(RunCompletionMessageRequest request);

    ResponseIterable<RunCompletionMessageResponseBody> runCompletionMessageWithResponseIterable(RunCompletionMessageRequest request);

    /**
     * @deprecated OpenAPI SaveConfigDataSet is deprecated  * @param request  the request parameters of SaveConfigDataSet  SaveConfigDataSetRequest
     * @return SaveConfigDataSetResponse
     */
    @Deprecated
    CompletableFuture<SaveConfigDataSetResponse> saveConfigDataSet(SaveConfigDataSetRequest request);

    /**
     * @param request the request parameters of SubmitComplaint  SubmitComplaintRequest
     * @return SubmitComplaintResponse
     */
    CompletableFuture<SubmitComplaintResponse> submitComplaint(SubmitComplaintRequest request);

    /**
     * @param request the request parameters of SubmitQualityCheckTask  SubmitQualityCheckTaskRequest
     * @return SubmitQualityCheckTaskResponse
     */
    CompletableFuture<SubmitQualityCheckTaskResponse> submitQualityCheckTask(SubmitQualityCheckTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can manually review files after quality inspection. After completing the review, call this API to save the review results. This involves manually reviewing rules identified by the system as hits to determine if they are true hits or false positives. Refer to the file review feature on the console page. For more information, see <a href="https://help.aliyun.com/document_detail/139653.html#h2-u6587u4EF6u590Du68385">File Review</a>.</p>
     * 
     * @param request the request parameters of SubmitReviewInfo  SubmitReviewInfoRequest
     * @return SubmitReviewInfoResponse
     */
    CompletableFuture<SubmitReviewInfoResponse> submitReviewInfo(SubmitReviewInfoRequest request);

    /**
     * @param request the request parameters of SubmitReviewInfoV4  SubmitReviewInfoV4Request
     * @return SubmitReviewInfoV4Response
     */
    CompletableFuture<SubmitReviewInfoV4Response> submitReviewInfoV4(SubmitReviewInfoV4Request request);

    /**
     * <b>description</b> :
     * <p>Real-time hotline quality inspection transcribes spoken dialogue into text during a call. It sends the text to the Smart Conversation Analysis system for real-time quality inspection to detect potential issues or risks. You can display the dialogue text and inspection results in real time on the customer service representative\&quot;s workbench (a third-party system). This differs from offline quality inspection, which uses UploadAudioData for inspection or dataset inspection. For details, see the developer guide. Offline quality inspection occurs after the call ends and the recording file is generated.
     * <strong>Usage Flow</strong>
     * You can implement real-time transcription of audio streams to text during calls, or use Alibaba Cloud Call Center (CC) directly. CC integrates deeply with Smart Conversation Analysis, enabling real-time quality inspection during calls without API integration.
     * If you implement audio-to-text conversion yourself, invoke the SyncQualityCheck API for real-time quality inspection after a speaker finishes a sentence and generates dialogue text. This returns the inspection result for that sentence synchronously.
     * You should include skill group information when uploading data. Then, you can use the Call Center Quality Inspection - Configuration Management feature to configure different quality inspection rules for calls from different skill groups.
     * After the call ends, you can store the recording file on a storage server accessible over the public network. You can invoke the recording information maintenance API: UpdateSyncQualityCheckData. You can submit the recording name, recording file URL, and other details to the Smart Conversation Analysis service. This lets quality inspectors play back the recording during review.
     * After the call ends, you can view the quality inspection results in Call Center Quality Inspection - Result Display - Real-time Quality Inspection Results. You can also invoke the real-time quality inspection result query API: GetSyncResult to retrieve the results. You can use Score Dashboard - Real-time Dashboard to view data charts for customer service representatives, skill groups, and scoring items.
     * <strong>Full-Text Quality Inspection</strong>
     * Quality inspection rules include dozens of operators. Some operators require dialogue context (multi-turn conversations between customer service representatives and customers) for analysis. However, real-time quality inspection occurs during a call and typically uses text from only one sentence spoken by a single speaker. Some operators are not suitable for real-time quality inspection. Therefore, quality inspection rules are divided into real-time quality inspection rules and full-text quality inspection rules:
     * <strong>Real-time quality inspection rules</strong>: Rules used for real-time quality inspection. They support a limited number of operator types. They do not support specifying the detection range for operators.
     * <strong>Full-text quality inspection rules</strong>: Rules used for offline quality inspection. They support all operator types. They support custom detection ranges for operators.
     * For calls that underwent real-time quality inspection, you can apply full-text quality inspection rules to the complete dialogue text after the call ends. To enable full-text quality inspection after real-time inspection, see the full-text quality inspection description in Call Center Quality Inspection - Configuration Management.</p>
     * 
     * @param request the request parameters of SyncQualityCheck  SyncQualityCheckRequest
     * @return SyncQualityCheckResponse
     */
    CompletableFuture<SyncQualityCheckResponse> syncQualityCheck(SyncQualityCheckRequest request);

    /**
     * @param request the request parameters of TestRuleV4  TestRuleV4Request
     * @return TestRuleV4Response
     */
    CompletableFuture<TestRuleV4Response> testRuleV4(TestRuleV4Request request);

    /**
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * @param request the request parameters of UpdateAsrVocab  UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     */
    CompletableFuture<UpdateAsrVocabResponse> updateAsrVocab(UpdateAsrVocabRequest request);

    /**
     * @param request the request parameters of UpdateCheckTypeToScheme  UpdateCheckTypeToSchemeRequest
     * @return UpdateCheckTypeToSchemeResponse
     */
    CompletableFuture<UpdateCheckTypeToSchemeResponse> updateCheckTypeToScheme(UpdateCheckTypeToSchemeRequest request);

    /**
     * @param request the request parameters of UpdateQualityCheckData  UpdateQualityCheckDataRequest
     * @return UpdateQualityCheckDataResponse
     */
    CompletableFuture<UpdateQualityCheckDataResponse> updateQualityCheckData(UpdateQualityCheckDataRequest request);

    /**
     * @param request the request parameters of UpdateQualityCheckScheme  UpdateQualityCheckSchemeRequest
     * @return UpdateQualityCheckSchemeResponse
     */
    CompletableFuture<UpdateQualityCheckSchemeResponse> updateQualityCheckScheme(UpdateQualityCheckSchemeRequest request);

    /**
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @description > Update an existing rule. You can modify its conditions and operators as needed. The rule ID (rid) remains unchanged, but condition IDs and operator IDs may change.
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    @Deprecated
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateRuleById is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @param request  the request parameters of UpdateRuleById  UpdateRuleByIdRequest
     * @return UpdateRuleByIdResponse
     */
    @Deprecated
    CompletableFuture<UpdateRuleByIdResponse> updateRuleById(UpdateRuleByIdRequest request);

    /**
     * @param request the request parameters of UpdateRuleToScheme  UpdateRuleToSchemeRequest
     * @return UpdateRuleToSchemeResponse
     */
    CompletableFuture<UpdateRuleToSchemeResponse> updateRuleToScheme(UpdateRuleToSchemeRequest request);

    /**
     * @param request the request parameters of UpdateRuleV4  UpdateRuleV4Request
     * @return UpdateRuleV4Response
     */
    CompletableFuture<UpdateRuleV4Response> updateRuleV4(UpdateRuleV4Request request);

    /**
     * <b>description</b> :
     * <p>Updates quality inspection task information.</p>
     * 
     * @param request the request parameters of UpdateSchemeTaskConfig  UpdateSchemeTaskConfigRequest
     * @return UpdateSchemeTaskConfigResponse
     */
    CompletableFuture<UpdateSchemeTaskConfigResponse> updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request);

    /**
     * @deprecated OpenAPI UpdateSkillGroupConfig is deprecated  * @param request  the request parameters of UpdateSkillGroupConfig  UpdateSkillGroupConfigRequest
     * @return UpdateSkillGroupConfigResponse
     */
    @Deprecated
    CompletableFuture<UpdateSkillGroupConfigResponse> updateSkillGroupConfig(UpdateSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of UpdateSyncQualityCheckData  UpdateSyncQualityCheckDataRequest
     * @return UpdateSyncQualityCheckDataResponse
     */
    CompletableFuture<UpdateSyncQualityCheckDataResponse> updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request);

    /**
     * @param request the request parameters of UpdateTag  UpdateTagRequest
     * @return UpdateTagResponse
     */
    CompletableFuture<UpdateTagResponse> updateTag(UpdateTagRequest request);

    /**
     * @param request the request parameters of UpdateTaskAssignRule  UpdateTaskAssignRuleRequest
     * @return UpdateTaskAssignRuleResponse
     */
    CompletableFuture<UpdateTaskAssignRuleResponse> updateTaskAssignRule(UpdateTaskAssignRuleRequest request);

    /**
     * <b>description</b> :
     * <p>When you update users, you can modify only their roles. You cannot modify other account information because all Alibaba Cloud products use a unified account management system. Smart Conversation Analysis uses these accounts. To modify account information, go to <a href="https://ram.console.aliyun.com/">Resource Access Management (RAM)</a>.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * @param request the request parameters of UpdateWarningConfig  UpdateWarningConfigRequest
     * @return UpdateWarningConfigResponse
     */
    CompletableFuture<UpdateWarningConfigResponse> updateWarningConfig(UpdateWarningConfigRequest request);

    /**
     * @param request the request parameters of UpdateWarningStrategyConfig  UpdateWarningStrategyConfigRequest
     * @return UpdateWarningStrategyConfigResponse
     */
    CompletableFuture<UpdateWarningStrategyConfigResponse> updateWarningStrategyConfig(UpdateWarningStrategyConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Process description</h3>
     * <p>Call the API to upload audio quality inspection =&gt; Convert the recording file to text =&gt; Separate roles in the text based on the specified channel splitting method (distinguish between agent and customer) =&gt; Analyze using quality inspection rules =&gt; Quality inspection complete.</p>
     * <h3>Task execution efficiency</h3>
     * <p>The speed of task execution depends on the speed of converting the recording file to text. Ideally, a 5-minute recording file can be transcribed within 2 minutes. However, when the transcription service has many queued tasks, there will be a queuing wait time. Generally, transcription completes within 6 hours, except for bulk uploads of large-scale data (more than 500 hours of recordings uploaded within 30 minutes). After transcription is complete, quality inspection analysis takes only milliseconds.</p>
     * <h3>Recording file URL requirements</h3>
     * <ul>
     * <li>Supports single-channel/dual-channel WAV and MP3 format recording files. The file size must be less than 512 MB.</li>
     * <li>The URL must be an HTTP-accessible URL address. Local file submission is not supported. The recording file access permissions must be set to public.</li>
     * <li>The URL can only use domain names, not IP addresses. The URL cannot contain spaces. Avoid using Chinese characters.</li>
     * <li>After converting the recording to text, the system deletes the downloaded recording file and does not retain a copy.</li>
     * <li>If your recording URL has an access expiration period (for example, the recording is stored in Alibaba Cloud OSS and you specified an expiration period when generating the recording URL through OSS), set the expiration period to at least 12 hours, or 24 hours if possible. This is because file transcription takes time and occasional queuing may occur. If the queuing time is long, the recording is downloaded only when transcription begins. This prevents the recording URL from expiring before the download.</li>
     * <li>After quality inspection analysis is complete, the recording is still played using the URL you provided when reviewing files in the console. Ensure that the URL remains active long-term. Otherwise, the recording cannot be played.</li>
     * </ul>
     * <h3>Role separation description</h3>
     * <p>After the recording is converted to text, the system automatically separates the text into two conversation roles. However, the system cannot determine which role is the agent and which is the customer. You need to perform role separation based on certain rules. The accuracy of role separation is critical because the rules used for quality inspection analysis often have role detection restrictions (a rule only checks the agent or the customer). If role separation is incorrect, the accuracy of quality inspection results is significantly affected.
     * Recording files are typically divided into two types: single-channel (mono) and dual-channel (stereo):</p>
     * <ul>
     * <li>Single-channel recording: The voices of both the agent and customer are stored on one channel. After the recording file is converted to text, the system uses a built-in algorithm to distinguish between two roles. By setting a list of keywords that the agent is likely to say, the system analyzes the transcribed text sentence by sentence from top to bottom. When a sentence matches a keyword, the role of that sentence is determined to be the agent, and the other role is the customer. For details, see recognizeRoleDataSetId and serviceChannelKeywords in the request parameters. Due to the unpredictability of conversation content (for example, cross-talk between two roles or both people speaking simultaneously), role separation for single-channel recordings cannot be guaranteed to be 100% accurate. Save recording files as dual-channel recordings whenever possible.</li>
     * <li>Dual-channel recording: The voices of the agent and customer are stored on two separate channels. Even if the conversation overlaps, the recording-to-text conversion can accurately distinguish between the two. Specify the agent and customer by using the serviceChannel and clientChannel request parameters.</li>
     * </ul>
     * <h3>Retrieve quality inspection analysis results</h3>
     * <p>Because recording file recognition is not real-time, you need to asynchronously retrieve quality inspection analysis results. The following three methods are available:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">MSMQ</a>. After receiving a message, invoke the GetResult operation to retrieve detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is complete. After receiving the callback, invoke the GetResult operation to retrieve detailed results.</li>
     * <li>Polling: The operation returns a task ID (taskId). Use the taskId to poll the <code>getResult</code> operation to asynchronously retrieve results. Check whether the <code>status</code> in the response parameters indicates completion. Do not set the polling interval too short. Analysis normally completes within a few minutes. Set the polling interval to 30 seconds or more. (Not recommended)</li>
     * </ul>
     * 
     * @param request the request parameters of UploadAudioData  UploadAudioDataRequest
     * @return UploadAudioDataResponse
     */
    CompletableFuture<UploadAudioDataResponse> uploadAudioData(UploadAudioDataRequest request);

    /**
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.  * @description You can call UploadData.json to upload text-based quality inspection data. Text typically originates from online customer service interactions or tickets. The API returns a task ID. You can retrieve results in one of three ways:
     * - Message notification: For details, see [message queues](https://help.aliyun.com/document_detail/213237.html). After you receive a message, call the GetResult API to retrieve detailed results. (Recommended)
     * - Callback: Specify a callback URL in your request parameters. After the task completes, the system sends a callback to that URL. Then call the GetResult API to retrieve detailed results.
     * - Polling: Use the returned task ID to poll the GetResult API asynchronously. Check whether the status field in the response indicates completion. (Not recommended)
     * 
     * @param request the request parameters of UploadData  UploadDataRequest
     * @return UploadDataResponse
     */
    @Deprecated
    CompletableFuture<UploadDataResponse> uploadData(UploadDataRequest request);

    /**
     * <b>description</b> :
     * <p>Pushes text data in a specific format to SCA for real-time quality inspection analysis based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one role finishes one or more sentences, providing higher real-time performance. Notes:</p>
     * <ul>
     * <li>If the pushed text is a single sentence from one role, some operators in the rules become ineffective due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.</li>
     * <li>Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadDataSync  UploadDataSyncRequest
     * @return UploadDataSyncResponse
     */
    CompletableFuture<UploadDataSyncResponse> uploadDataSync(UploadDataSyncRequest request);

    /**
     * <b>description</b> :
     * <p>Pushes text data in a specific format to Smart Conversation Analysis (SCA) for real-time quality inspection based on user-specified rules, and synchronously returns the analysis results. Compared with uploaded text quality inspection, which typically uploads the complete conversation text after a conversation ends, real-time text quality inspection allows you to push text to SCA for analysis after one or more sentences are spoken by a role, providing higher real-time performance. Special notes:
     * If the pushed text is a single sentence from one role, some operators in the rules may not work due to the lack of conversation context, such as context repetition check, interruption check, and call silence check.
     * Real-time quality inspection synchronously returns analysis results. SCA does not save call records, so you cannot query quality inspection results through APIs.</p>
     * 
     * @param request the request parameters of UploadDataSyncForLLM  UploadDataSyncForLLMRequest
     * @return UploadDataSyncForLLMResponse
     */
    CompletableFuture<UploadDataSyncForLLMResponse> uploadDataSyncForLLM(UploadDataSyncForLLMRequest request);

    /**
     * <b>description</b> :
     * <p>Calls UploadData.json to upload text quality inspection data. The text typically comes from online customer service or tickets. The operation returns a taskId. You can obtain results in three ways:</p>
     * <ul>
     * <li>Message notification: For details, see <a href="https://help.aliyun.com/document_detail/213237.html">Message channel</a>. After receiving a message, call the GetResult operation to obtain detailed results. (Recommended)</li>
     * <li>Callback: Specify a callbackUrl in the request parameters. The system initiates a callback after the task is completed. After receiving the callback, call the GetResult operation to obtain detailed results.</li>
     * <li>Polling: Use the task ID returned by this operation to poll the GetResult operation asynchronously. Check whether the status in the response indicates completion. (Not recommended)</li>
     * </ul>
     * 
     * @param request the request parameters of UploadDataV4  UploadDataV4Request
     * @return UploadDataV4Response
     */
    CompletableFuture<UploadDataV4Response> uploadDataV4(UploadDataV4Request request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/213225.html">Rule configuration</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UploadRule  UploadRuleRequest
     * @return UploadRuleResponse
     */
    CompletableFuture<UploadRuleResponse> uploadRule(UploadRuleRequest request);

}
