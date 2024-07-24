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

    CompletableFuture<AddBusinessCategoryResponse> addBusinessCategory(AddBusinessCategoryRequest request);

    CompletableFuture<AddRuleCategoryResponse> addRuleCategory(AddRuleCategoryRequest request);

    CompletableFuture<AddRuleV4Response> addRuleV4(AddRuleV4Request request);

    CompletableFuture<AssignReviewerResponse> assignReviewer(AssignReviewerRequest request);

    CompletableFuture<AssignReviewerBySessionGroupResponse> assignReviewerBySessionGroup(AssignReviewerBySessionGroupRequest request);

    CompletableFuture<BatchSubmitReviewInfoResponse> batchSubmitReviewInfo(BatchSubmitReviewInfoRequest request);

    CompletableFuture<CreateAsrVocabResponse> createAsrVocab(CreateAsrVocabRequest request);

    CompletableFuture<CreateCheckTypeToSchemeResponse> createCheckTypeToScheme(CreateCheckTypeToSchemeRequest request);

    CompletableFuture<CreateQualityCheckSchemeResponse> createQualityCheckScheme(CreateQualityCheckSchemeRequest request);

    CompletableFuture<CreateSchemeTaskConfigResponse> createSchemeTaskConfig(CreateSchemeTaskConfigRequest request);

    CompletableFuture<CreateSkillGroupConfigResponse> createSkillGroupConfig(CreateSkillGroupConfigRequest request);

    CompletableFuture<CreateTaskAssignRuleResponse> createTaskAssignRule(CreateTaskAssignRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateWarningConfigResponse> createWarningConfig(CreateWarningConfigRequest request);

    CompletableFuture<CreateWarningStrategyConfigResponse> createWarningStrategyConfig(CreateWarningStrategyConfigRequest request);

    CompletableFuture<DelRuleCategoryResponse> delRuleCategory(DelRuleCategoryRequest request);

    CompletableFuture<DeleteAsrVocabResponse> deleteAsrVocab(DeleteAsrVocabRequest request);

    CompletableFuture<DeleteBusinessCategoryResponse> deleteBusinessCategory(DeleteBusinessCategoryRequest request);

    CompletableFuture<DeleteCustomizationConfigResponse> deleteCustomizationConfig(DeleteCustomizationConfigRequest request);

    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    CompletableFuture<DeletePrecisionTaskResponse> deletePrecisionTask(DeletePrecisionTaskRequest request);

    CompletableFuture<DeleteQualityCheckSchemeResponse> deleteQualityCheckScheme(DeleteQualityCheckSchemeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DeleteRuleV4Response> deleteRuleV4(DeleteRuleV4Request request);

    CompletableFuture<DeleteSchemeTaskConfigResponse> deleteSchemeTaskConfig(DeleteSchemeTaskConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteScoreForApiResponse> deleteScoreForApi(DeleteScoreForApiRequest request);

    CompletableFuture<DeleteSkillGroupConfigResponse> deleteSkillGroupConfig(DeleteSkillGroupConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteSubScoreForApiResponse> deleteSubScoreForApi(DeleteSubScoreForApiRequest request);

    CompletableFuture<DeleteTaskAssignRuleResponse> deleteTaskAssignRule(DeleteTaskAssignRuleRequest request);

    CompletableFuture<DeleteWarningConfigResponse> deleteWarningConfig(DeleteWarningConfigRequest request);

    CompletableFuture<DeleteWarningStrategyConfigResponse> deleteWarningStrategyConfig(DeleteWarningStrategyConfigRequest request);

    CompletableFuture<GetAsrVocabResponse> getAsrVocab(GetAsrVocabRequest request);

    CompletableFuture<GetBusinessCategoryListResponse> getBusinessCategoryList(GetBusinessCategoryListRequest request);

    CompletableFuture<GetCustomizationConfigListResponse> getCustomizationConfigList(GetCustomizationConfigListRequest request);

    CompletableFuture<GetNextResultToVerifyResponse> getNextResultToVerify(GetNextResultToVerifyRequest request);

    CompletableFuture<GetPrecisionTaskResponse> getPrecisionTask(GetPrecisionTaskRequest request);

    CompletableFuture<GetQualityCheckSchemeResponse> getQualityCheckScheme(GetQualityCheckSchemeRequest request);

    CompletableFuture<GetResultResponse> getResult(GetResultRequest request);

    CompletableFuture<GetResultToReviewResponse> getResultToReview(GetResultToReviewRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetRuleByIdResponse> getRuleById(GetRuleByIdRequest request);

    CompletableFuture<GetRuleCategoryResponse> getRuleCategory(GetRuleCategoryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetRuleDetailResponse> getRuleDetail(GetRuleDetailRequest request);

    CompletableFuture<GetRuleV4Response> getRuleV4(GetRuleV4Request request);

    CompletableFuture<GetRulesCountListResponse> getRulesCountList(GetRulesCountListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetScoreInfoResponse> getScoreInfo(GetScoreInfoRequest request);

    CompletableFuture<GetSkillGroupConfigResponse> getSkillGroupConfig(GetSkillGroupConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetSyncResultResponse> getSyncResult(GetSyncResultRequest request);

    CompletableFuture<GetWarningStrategyConfigResponse> getWarningStrategyConfig(GetWarningStrategyConfigRequest request);

    CompletableFuture<HandleComplaintResponse> handleComplaint(HandleComplaintRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<InsertScoreForApiResponse> insertScoreForApi(InsertScoreForApiRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<InsertSubScoreForApiResponse> insertSubScoreForApi(InsertSubScoreForApiRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<InvalidRuleResponse> invalidRule(InvalidRuleRequest request);

    CompletableFuture<ListAsrVocabResponse> listAsrVocab(ListAsrVocabRequest request);

    CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request);

    CompletableFuture<ListPrecisionTaskResponse> listPrecisionTask(ListPrecisionTaskRequest request);

    CompletableFuture<ListQualityCheckSchemeResponse> listQualityCheckScheme(ListQualityCheckSchemeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListRulesV4Response> listRulesV4(ListRulesV4Request request);

    CompletableFuture<ListSchemeTaskConfigResponse> listSchemeTaskConfig(ListSchemeTaskConfigRequest request);

    CompletableFuture<ListSessionGroupResponse> listSessionGroup(ListSessionGroupRequest request);

    CompletableFuture<ListSkillGroupConfigResponse> listSkillGroupConfig(ListSkillGroupConfigRequest request);

    CompletableFuture<ListTaskAssignRulesResponse> listTaskAssignRules(ListTaskAssignRulesRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListWarningConfigResponse> listWarningConfig(ListWarningConfigRequest request);

    CompletableFuture<ListWarningStrategyConfigResponse> listWarningStrategyConfig(ListWarningStrategyConfigRequest request);

    CompletableFuture<RevertAssignedSessionResponse> revertAssignedSession(RevertAssignedSessionRequest request);

    CompletableFuture<RevertAssignedSessionGroupResponse> revertAssignedSessionGroup(RevertAssignedSessionGroupRequest request);

    CompletableFuture<SaveConfigDataSetResponse> saveConfigDataSet(SaveConfigDataSetRequest request);

    CompletableFuture<SubmitComplaintResponse> submitComplaint(SubmitComplaintRequest request);

    CompletableFuture<SubmitPrecisionTaskResponse> submitPrecisionTask(SubmitPrecisionTaskRequest request);

    CompletableFuture<SubmitQualityCheckTaskResponse> submitQualityCheckTask(SubmitQualityCheckTaskRequest request);

    CompletableFuture<SubmitReviewInfoResponse> submitReviewInfo(SubmitReviewInfoRequest request);

    CompletableFuture<SyncQualityCheckResponse> syncQualityCheck(SyncQualityCheckRequest request);

    CompletableFuture<TestRuleV4Response> testRuleV4(TestRuleV4Request request);

    CompletableFuture<UpdateAsrVocabResponse> updateAsrVocab(UpdateAsrVocabRequest request);

    CompletableFuture<UpdateCheckTypeToSchemeResponse> updateCheckTypeToScheme(UpdateCheckTypeToSchemeRequest request);

    CompletableFuture<UpdateQualityCheckDataResponse> updateQualityCheckData(UpdateQualityCheckDataRequest request);

    CompletableFuture<UpdateQualityCheckSchemeResponse> updateQualityCheckScheme(UpdateQualityCheckSchemeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateRuleByIdResponse> updateRuleById(UpdateRuleByIdRequest request);

    CompletableFuture<UpdateRuleToSchemeResponse> updateRuleToScheme(UpdateRuleToSchemeRequest request);

    CompletableFuture<UpdateRuleV4Response> updateRuleV4(UpdateRuleV4Request request);

    CompletableFuture<UpdateSchemeTaskConfigResponse> updateSchemeTaskConfig(UpdateSchemeTaskConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateScoreForApiResponse> updateScoreForApi(UpdateScoreForApiRequest request);

    CompletableFuture<UpdateSkillGroupConfigResponse> updateSkillGroupConfig(UpdateSkillGroupConfigRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateSubScoreForApiResponse> updateSubScoreForApi(UpdateSubScoreForApiRequest request);

    CompletableFuture<UpdateSyncQualityCheckDataResponse> updateSyncQualityCheckData(UpdateSyncQualityCheckDataRequest request);

    CompletableFuture<UpdateTaskAssignRuleResponse> updateTaskAssignRule(UpdateTaskAssignRuleRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateWarningConfigResponse> updateWarningConfig(UpdateWarningConfigRequest request);

    CompletableFuture<UpdateWarningStrategyConfigResponse> updateWarningStrategyConfig(UpdateWarningStrategyConfigRequest request);

    CompletableFuture<UploadAudioDataResponse> uploadAudioData(UploadAudioDataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UploadDataResponse> uploadData(UploadDataRequest request);

    CompletableFuture<UploadDataSyncResponse> uploadDataSync(UploadDataSyncRequest request);

    CompletableFuture<UploadDataV4Response> uploadDataV4(UploadDataV4Request request);

    CompletableFuture<UploadRuleResponse> uploadRule(UploadRuleRequest request);

    CompletableFuture<VerifyFileResponse> verifyFile(VerifyFileRequest request);

    CompletableFuture<VerifySentenceResponse> verifySentence(VerifySentenceRequest request);

}
