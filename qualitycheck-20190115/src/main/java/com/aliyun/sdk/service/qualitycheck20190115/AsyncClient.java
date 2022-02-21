// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qualitycheck20190115.models.*;
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

    CompletableFuture<ASResponse> aS(ASRequest request);

    CompletableFuture<AddBusinessCategoryResponse> addBusinessCategory(AddBusinessCategoryRequest request);

    CompletableFuture<AddRuleCategoryResponse> addRuleCategory(AddRuleCategoryRequest request);

    CompletableFuture<AddThesaurusForApiResponse> addThesaurusForApi(AddThesaurusForApiRequest request);

    CompletableFuture<AssignReviewerResponse> assignReviewer(AssignReviewerRequest request);

    CompletableFuture<CeateWarningStrategyConfigResponse> ceateWarningStrategyConfig(CeateWarningStrategyConfigRequest request);

    CompletableFuture<CreateAsrVocabResponse> createAsrVocab(CreateAsrVocabRequest request);

    CompletableFuture<CreateHotWordsTaskResponse> createHotWordsTask(CreateHotWordsTaskRequest request);

    CompletableFuture<CreateSkillGroupConfigResponse> createSkillGroupConfig(CreateSkillGroupConfigRequest request);

    CompletableFuture<CreateTaskAssignRuleResponse> createTaskAssignRule(CreateTaskAssignRuleRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateWarningConfigResponse> createWarningConfig(CreateWarningConfigRequest request);

    CompletableFuture<CreateWarningStrategyConfigResponse> createWarningStrategyConfig(CreateWarningStrategyConfigRequest request);

    CompletableFuture<DelRuleCategoryResponse> delRuleCategory(DelRuleCategoryRequest request);

    CompletableFuture<DelThesaurusForApiResponse> delThesaurusForApi(DelThesaurusForApiRequest request);

    CompletableFuture<DeleteAsrVocabResponse> deleteAsrVocab(DeleteAsrVocabRequest request);

    CompletableFuture<DeleteBusinessCategoryResponse> deleteBusinessCategory(DeleteBusinessCategoryRequest request);

    CompletableFuture<DeleteCustomizationConfigResponse> deleteCustomizationConfig(DeleteCustomizationConfigRequest request);

    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    CompletableFuture<DeleteHotWordsTaskResponse> deleteHotWordsTask(DeleteHotWordsTaskRequest request);

    CompletableFuture<DeletePrecisionTaskResponse> deletePrecisionTask(DeletePrecisionTaskRequest request);

    CompletableFuture<DeleteScoreForApiResponse> deleteScoreForApi(DeleteScoreForApiRequest request);

    CompletableFuture<DeleteSkillGroupConfigResponse> deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request);

    CompletableFuture<DeleteSubScoreForApiResponse> deleteSubScoreForApi(DeleteSubScoreForApiRequest request);

    CompletableFuture<DeleteTaskAssignRuleResponse> deleteTaskAssignRule(DeleteTaskAssignRuleRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteWarningConfigResponse> deleteWarningConfig(DeleteWarningConfigRequest request);

    CompletableFuture<DeleteWarningStrategyConfigResponse> deleteWarningStrategyConfig(DeleteWarningStrategyConfigRequest request);

    CompletableFuture<EditThesaurusForApiResponse> editThesaurusForApi(EditThesaurusForApiRequest request);

    CompletableFuture<GetAsrVocabResponse> getAsrVocab(GetAsrVocabRequest request);

    CompletableFuture<GetBusinessCategoryListResponse> getBusinessCategoryList(GetBusinessCategoryListRequest request);

    CompletableFuture<GetCustomizationConfigListResponse> getCustomizationConfigList(GetCustomizationConfigListRequest request);

    CompletableFuture<GetHitResultResponse> getHitResult(GetHitResultRequest request);

    CompletableFuture<GetNextResultToVerifyResponse> getNextResultToVerify(GetNextResultToVerifyRequest request);

    CompletableFuture<GetPrecisionTaskResponse> getPrecisionTask(GetPrecisionTaskRequest request);

    CompletableFuture<GetResultResponse> getResult(GetResultRequest request);

    CompletableFuture<GetResultCallbackResponse> getResultCallback(GetResultCallbackRequest request);

    CompletableFuture<GetResultToReviewResponse> getResultToReview(GetResultToReviewRequest request);

    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    CompletableFuture<GetRuleCategoryResponse> getRuleCategory(GetRuleCategoryRequest request);

    CompletableFuture<GetRuleDetailResponse> getRuleDetail(GetRuleDetailRequest request);

    CompletableFuture<GetScoreInfoResponse> getScoreInfo(GetScoreInfoRequest request);

    CompletableFuture<GetSkillGroupConfigResponse> getSkillGroupConfig(GetSkillGroupConfigRequest request);

    CompletableFuture<GetSyncQualityCheckResultResponse> getSyncQualityCheckResult(GetSyncQualityCheckResultRequest request);

    CompletableFuture<GetSyncResultResponse> getSyncResult(GetSyncResultRequest request);

    CompletableFuture<GetThesaurusBySynonymForApiResponse> getThesaurusBySynonymForApi(GetThesaurusBySynonymForApiRequest request);

    CompletableFuture<GetWarningStrategyConfigResponse> getWarningStrategyConfig(GetWarningStrategyConfigRequest request);

    CompletableFuture<HandleComplaintResponse> handleComplaint(HandleComplaintRequest request);

    CompletableFuture<InsertScoreForApiResponse> insertScoreForApi(InsertScoreForApiRequest request);

    CompletableFuture<InsertSubScoreForApiResponse> insertSubScoreForApi(InsertSubScoreForApiRequest request);

    CompletableFuture<InvalidRuleResponse> invalidRule(InvalidRuleRequest request);

    CompletableFuture<ListAsrVocabResponse> listAsrVocab(ListAsrVocabRequest request);

    CompletableFuture<ListBizTagDistributeResponse> listBizTagDistribute(ListBizTagDistributeRequest request);

    CompletableFuture<ListHotWordsTaskExecResultsResponse> listHotWordsTaskExecResults(ListHotWordsTaskExecResultsRequest request);

    CompletableFuture<ListHotWordsTaskHistoriesResponse> listHotWordsTaskHistories(ListHotWordsTaskHistoriesRequest request);

    CompletableFuture<ListHotWordsTasksResponse> listHotWordsTasks(ListHotWordsTasksRequest request);

    CompletableFuture<ListPrecisionTaskResponse> listPrecisionTask(ListPrecisionTaskRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListSessionDurationDistributeResponse> listSessionDurationDistribute(ListSessionDurationDistributeRequest request);

    CompletableFuture<ListSessionRateTrendResponse> listSessionRateTrend(ListSessionRateTrendRequest request);

    CompletableFuture<ListSkillGroupConfigResponse> listSkillGroupConfig(ListSkillGroupConfigRequest request);

    CompletableFuture<ListTaskAssignRulesResponse> listTaskAssignRules(ListTaskAssignRulesRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListWarningConfigResponse> listWarningConfig(ListWarningConfigRequest request);

    CompletableFuture<ListWarningStrategyConfigResponse> listWarningStrategyConfig(ListWarningStrategyConfigRequest request);

    CompletableFuture<RestartAsrTaskResponse> restartAsrTask(RestartAsrTaskRequest request);

    CompletableFuture<SaveConfigDataSetResponse> saveConfigDataSet(SaveConfigDataSetRequest request);

    CompletableFuture<SubmitComplaintResponse> submitComplaint(SubmitComplaintRequest request);

    CompletableFuture<SubmitPrecisionTaskResponse> submitPrecisionTask(SubmitPrecisionTaskRequest request);

    CompletableFuture<SubmitQualityCheckTaskResponse> submitQualityCheckTask(SubmitQualityCheckTaskRequest request);

    CompletableFuture<SubmitReviewInfoResponse> submitReviewInfo(SubmitReviewInfoRequest request);

    CompletableFuture<SyncQualityCheckResponse> syncQualityCheck(SyncQualityCheckRequest request);

    CompletableFuture<UndoVerifyTaskResponse> undoVerifyTask(UndoVerifyTaskRequest request);

    CompletableFuture<UpdateAsrVocabResponse> updateAsrVocab(UpdateAsrVocabRequest request);

    CompletableFuture<UpdateHotWordsTaskResponse> updateHotWordsTask(UpdateHotWordsTaskRequest request);

    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    CompletableFuture<UpdateScoreForApiResponse> updateScoreForApi(UpdateScoreForApiRequest request);

    CompletableFuture<UpdateSkillGroupConfigResponse> updateSkillGroupConfig(UpdateSkillGroupConfigRequest request);

    CompletableFuture<UpdateSubScoreForApiResponse> updateSubScoreForApi(UpdateSubScoreForApiRequest request);

    CompletableFuture<UpdateSyncQualityCheckDataResponse> updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request);

    CompletableFuture<UpdateTaskAssignRuleResponse> updateTaskAssignRule(UpdateTaskAssignRuleRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserConfigResponse> updateUserConfig(UpdateUserConfigRequest request);

    CompletableFuture<UpdateWarningConfigResponse> updateWarningConfig(UpdateWarningConfigRequest request);

    CompletableFuture<UpdateWarningStrategyConfigResponse> updateWarningStrategyConfig(UpdateWarningStrategyConfigRequest request);

    CompletableFuture<UploadAudioDataResponse> uploadAudioData(UploadAudioDataRequest request);

    CompletableFuture<UploadDataResponse> uploadData(UploadDataRequest request);

    CompletableFuture<UploadDataSyncResponse> uploadDataSync(UploadDataSyncRequest request);

    CompletableFuture<UploadRuleResponse> uploadRule(UploadRuleRequest request);

    CompletableFuture<VerifyFileResponse> verifyFile(VerifyFileRequest request);

    CompletableFuture<VerifySentenceResponse> verifySentence(VerifySentenceRequest request);

}
