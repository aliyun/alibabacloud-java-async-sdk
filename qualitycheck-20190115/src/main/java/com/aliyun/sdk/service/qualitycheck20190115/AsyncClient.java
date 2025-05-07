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
     * @param request the request parameters of ApplyWsToken  ApplyWsTokenRequest
     * @return ApplyWsTokenResponse
     */
    CompletableFuture<ApplyWsTokenResponse> applyWsToken(ApplyWsTokenRequest request);

    /**
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
     * @param request the request parameters of CreateSkillGroupConfig  CreateSkillGroupConfigRequest
     * @return CreateSkillGroupConfigResponse
     */
    CompletableFuture<CreateSkillGroupConfigResponse> createSkillGroupConfig(CreateSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of CreateTaskAssignRule  CreateTaskAssignRuleRequest
     * @return CreateTaskAssignRuleResponse
     */
    CompletableFuture<CreateTaskAssignRuleResponse> createTaskAssignRule(CreateTaskAssignRuleRequest request);

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
     * @param request the request parameters of DeletePrecisionTask  DeletePrecisionTaskRequest
     * @return DeletePrecisionTaskResponse
     */
    CompletableFuture<DeletePrecisionTaskResponse> deletePrecisionTask(DeletePrecisionTaskRequest request);

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
     * @param request the request parameters of DeleteSkillGroupConfig  DeleteSkillGroupConfigRequest
     * @return DeleteSkillGroupConfigResponse
     */
    CompletableFuture<DeleteSkillGroupConfigResponse> deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request);

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
     * @param request the request parameters of GetNextResultToVerify  GetNextResultToVerifyRequest
     * @return GetNextResultToVerifyResponse
     */
    CompletableFuture<GetNextResultToVerifyResponse> getNextResultToVerify(GetNextResultToVerifyRequest request);

    /**
     * @param request the request parameters of GetPrecisionTask  GetPrecisionTaskRequest
     * @return GetPrecisionTaskResponse
     */
    CompletableFuture<GetPrecisionTaskResponse> getPrecisionTask(GetPrecisionTaskRequest request);

    /**
     * @param request the request parameters of GetQualityCheckScheme  GetQualityCheckSchemeRequest
     * @return GetQualityCheckSchemeResponse
     */
    CompletableFuture<GetQualityCheckSchemeResponse> getQualityCheckScheme(GetQualityCheckSchemeRequest request);

    /**
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
     * @deprecated OpenAPI GetRule is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRule  GetRuleRequest
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
     * @deprecated OpenAPI GetRuleDetail is deprecated, please use Qualitycheck::2019-01-15::GetRuleV4 instead.  * @param request  the request parameters of GetRuleDetail  GetRuleDetailRequest
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
     * @deprecated OpenAPI GetScoreInfo is deprecated  * @param request  the request parameters of GetScoreInfo  GetScoreInfoRequest
     * @return GetScoreInfoResponse
     */
    @Deprecated
    CompletableFuture<GetScoreInfoResponse> getScoreInfo(GetScoreInfoRequest request);

    /**
     * @param request the request parameters of GetSkillGroupConfig  GetSkillGroupConfigRequest
     * @return GetSkillGroupConfigResponse
     */
    CompletableFuture<GetSkillGroupConfigResponse> getSkillGroupConfig(GetSkillGroupConfigRequest request);

    /**
     * @deprecated OpenAPI GetSyncResult is deprecated, please use Qualitycheck::2019-01-15::GetResult instead.  * @param request  the request parameters of GetSyncResult  GetSyncResultRequest
     * @return GetSyncResultResponse
     */
    @Deprecated
    CompletableFuture<GetSyncResultResponse> getSyncResult(GetSyncResultRequest request);

    /**
     * @param request the request parameters of GetWarningStrategyConfig  GetWarningStrategyConfigRequest
     * @return GetWarningStrategyConfigResponse
     */
    CompletableFuture<GetWarningStrategyConfigResponse> getWarningStrategyConfig(GetWarningStrategyConfigRequest request);

    /**
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
     * @param request the request parameters of ListPrecisionTask  ListPrecisionTaskRequest
     * @return ListPrecisionTaskResponse
     */
    CompletableFuture<ListPrecisionTaskResponse> listPrecisionTask(ListPrecisionTaskRequest request);

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
     * @param request the request parameters of ListSkillGroupConfig  ListSkillGroupConfigRequest
     * @return ListSkillGroupConfigResponse
     */
    CompletableFuture<ListSkillGroupConfigResponse> listSkillGroupConfig(ListSkillGroupConfigRequest request);

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
     * @param request the request parameters of SubmitPrecisionTask  SubmitPrecisionTaskRequest
     * @return SubmitPrecisionTaskResponse
     */
    CompletableFuture<SubmitPrecisionTaskResponse> submitPrecisionTask(SubmitPrecisionTaskRequest request);

    /**
     * @param request the request parameters of SubmitQualityCheckTask  SubmitQualityCheckTaskRequest
     * @return SubmitQualityCheckTaskResponse
     */
    CompletableFuture<SubmitQualityCheckTaskResponse> submitQualityCheckTask(SubmitQualityCheckTaskRequest request);

    /**
     * @param request the request parameters of SubmitReviewInfo  SubmitReviewInfoRequest
     * @return SubmitReviewInfoResponse
     */
    CompletableFuture<SubmitReviewInfoResponse> submitReviewInfo(SubmitReviewInfoRequest request);

    /**
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
     * @deprecated OpenAPI UpdateRule is deprecated, please use Qualitycheck::2019-01-15::UpdateRuleV4 instead.  * @param request  the request parameters of UpdateRule  UpdateRuleRequest
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
     * @param request the request parameters of UpdateSchemeTaskConfig  UpdateSchemeTaskConfigRequest
     * @return UpdateSchemeTaskConfigResponse
     */
    CompletableFuture<UpdateSchemeTaskConfigResponse> updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request);

    /**
     * @param request the request parameters of UpdateSkillGroupConfig  UpdateSkillGroupConfigRequest
     * @return UpdateSkillGroupConfigResponse
     */
    CompletableFuture<UpdateSkillGroupConfigResponse> updateSkillGroupConfig(UpdateSkillGroupConfigRequest request);

    /**
     * @param request the request parameters of UpdateSyncQualityCheckData  UpdateSyncQualityCheckDataRequest
     * @return UpdateSyncQualityCheckDataResponse
     */
    CompletableFuture<UpdateSyncQualityCheckDataResponse> updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request);

    /**
     * @param request the request parameters of UpdateTaskAssignRule  UpdateTaskAssignRuleRequest
     * @return UpdateTaskAssignRuleResponse
     */
    CompletableFuture<UpdateTaskAssignRuleResponse> updateTaskAssignRule(UpdateTaskAssignRuleRequest request);

    /**
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
     * @param request the request parameters of UploadAudioData  UploadAudioDataRequest
     * @return UploadAudioDataResponse
     */
    CompletableFuture<UploadAudioDataResponse> uploadAudioData(UploadAudioDataRequest request);

    /**
     * @deprecated OpenAPI UploadData is deprecated, please use Qualitycheck::2019-01-15::UploadDataV4 instead.  * @param request  the request parameters of UploadData  UploadDataRequest
     * @return UploadDataResponse
     */
    @Deprecated
    CompletableFuture<UploadDataResponse> uploadData(UploadDataRequest request);

    /**
     * @param request the request parameters of UploadDataSync  UploadDataSyncRequest
     * @return UploadDataSyncResponse
     */
    CompletableFuture<UploadDataSyncResponse> uploadDataSync(UploadDataSyncRequest request);

    /**
     * @param request the request parameters of UploadDataSyncForLLM  UploadDataSyncForLLMRequest
     * @return UploadDataSyncForLLMResponse
     */
    CompletableFuture<UploadDataSyncForLLMResponse> uploadDataSyncForLLM(UploadDataSyncForLLMRequest request);

    /**
     * @param request the request parameters of UploadDataV4  UploadDataV4Request
     * @return UploadDataV4Response
     */
    CompletableFuture<UploadDataV4Response> uploadDataV4(UploadDataV4Request request);

    /**
     * @param request the request parameters of UploadRule  UploadRuleRequest
     * @return UploadRuleResponse
     */
    CompletableFuture<UploadRuleResponse> uploadRule(UploadRuleRequest request);

    /**
     * @param request the request parameters of VerifyFile  VerifyFileRequest
     * @return VerifyFileResponse
     */
    CompletableFuture<VerifyFileResponse> verifyFile(VerifyFileRequest request);

    /**
     * @param request the request parameters of VerifySentence  VerifySentenceRequest
     * @return VerifySentenceResponse
     */
    CompletableFuture<VerifySentenceResponse> verifySentence(VerifySentenceRequest request);

}
