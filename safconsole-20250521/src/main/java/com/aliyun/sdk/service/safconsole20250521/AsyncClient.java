// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.safconsole20250521.models.*;
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyBastionAccount  ApplyBastionAccountRequest
     * @return ApplyBastionAccountResponse
     */
    CompletableFuture<ApplyBastionAccountResponse> applyBastionAccount(ApplyBastionAccountRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of AssociatePocTask  AssociatePocTaskRequest
     * @return AssociatePocTaskResponse
     */
    CompletableFuture<AssociatePocTaskResponse> associatePocTask(AssociatePocTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of CompleteModelingProject  CompleteModelingProjectRequest
     * @return CompleteModelingProjectResponse
     */
    CompletableFuture<CompleteModelingProjectResponse> completeModelingProject(CompleteModelingProjectRequest request);

    /**
     * @param request the request parameters of CreateCustomerModuleBasicInfo  CreateCustomerModuleBasicInfoRequest
     * @return CreateCustomerModuleBasicInfoResponse
     */
    CompletableFuture<CreateCustomerModuleBasicInfoResponse> createCustomerModuleBasicInfo(CreateCustomerModuleBasicInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each option including a label (label) and value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomerModuleMetaInfo  CreateCustomerModuleMetaInfoRequest
     * @return CreateCustomerModuleMetaInfoResponse
     */
    CompletableFuture<CreateCustomerModuleMetaInfoResponse> createCustomerModuleMetaInfo(CreateCustomerModuleMetaInfoRequest request);

    /**
     * @param request the request parameters of CreateCustomerModuleOutputInfo  CreateCustomerModuleOutputInfoRequest
     * @return CreateCustomerModuleOutputInfoResponse
     */
    CompletableFuture<CreateCustomerModuleOutputInfoResponse> createCustomerModuleOutputInfo(CreateCustomerModuleOutputInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModelingProject  CreateModelingProjectRequest
     * @return CreateModelingProjectResponse
     */
    CompletableFuture<CreateModelingProjectResponse> createModelingProject(CreateModelingProjectRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DeployModelFile  DeployModelFileRequest
     * @return DeployModelFileResponse
     */
    CompletableFuture<DeployModelFileResponse> deployModelFile(DeployModelFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleBasicInfo  DescribeCustomerModuleBasicInfoRequest
     * @return DescribeCustomerModuleBasicInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleBasicInfoResponse> describeCustomerModuleBasicInfo(DescribeCustomerModuleBasicInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleMetaInfo  DescribeCustomerModuleMetaInfoRequest
     * @return DescribeCustomerModuleMetaInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleMetaInfoResponse> describeCustomerModuleMetaInfo(DescribeCustomerModuleMetaInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleOutputInfo  DescribeCustomerModuleOutputInfoRequest
     * @return DescribeCustomerModuleOutputInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleOutputInfoResponse> describeCustomerModuleOutputInfo(DescribeCustomerModuleOutputInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFeatureOption  DescribeFeatureOptionRequest
     * @return DescribeFeatureOptionResponse
     */
    CompletableFuture<DescribeFeatureOptionResponse> describeFeatureOption(DescribeFeatureOptionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which consists of a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFeatureTemplateList  DescribeFeatureTemplateListRequest
     * @return DescribeFeatureTemplateListResponse
     */
    CompletableFuture<DescribeFeatureTemplateListResponse> describeFeatureTemplateList(DescribeFeatureTemplateListRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFileDownloadUrl  DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     */
    CompletableFuture<DescribeFileDownloadUrlResponse> describeFileDownloadUrl(DescribeFileDownloadUrlRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each including a label (label) and value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelFeature  DescribeModelFeatureRequest
     * @return DescribeModelFeatureResponse
     */
    CompletableFuture<DescribeModelFeatureResponse> describeModelFeature(DescribeModelFeatureRequest request);

    /**
     * @param request the request parameters of DescribeModelOssToken  DescribeModelOssTokenRequest
     * @return DescribeModelOssTokenResponse
     */
    CompletableFuture<DescribeModelOssTokenResponse> describeModelOssToken(DescribeModelOssTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelingProjectDetail  DescribeModelingProjectDetailRequest
     * @return DescribeModelingProjectDetailResponse
     */
    CompletableFuture<DescribeModelingProjectDetailResponse> describeModelingProjectDetail(DescribeModelingProjectDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定租户下的所有建模项目的概览信息。</li>
     * <li>支持通过<code>pageSize</code>和<code>currentPage</code>参数进行分页查询，默认每页显示10条记录。</li>
     * <li>可选地，使用<code>status</code>参数来过滤特定状态（如<code>active</code>, <code>released</code>等）的项目。</li>
     * <li>返回结果中包含每个项目的ID、名称、环境状态、建模状态、开始时间及结束时间（如果有的话），以及创建该项目的登录账号。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelingProjectList  DescribeModelingProjectListRequest
     * @return DescribeModelingProjectListResponse
     */
    CompletableFuture<DescribeModelingProjectListResponse> describeModelingProjectList(DescribeModelingProjectListRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This interface is used to check whether a specific model service exists by providing the <code>customerModuleId</code>. If it exists, it returns <code>true</code>; otherwise, it returns <code>false</code>.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li><code>customerModuleId</code> is a required parameter and must be of string type.</li>
     * <li>This API is mainly used for front-end page display or logical judgment to confirm whether the service corresponding to the user\&quot;s selected model has been created.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModuleServiceExist  DescribeModuleServiceExistRequest
     * @return DescribeModuleServiceExistResponse
     */
    CompletableFuture<DescribeModuleServiceExistResponse> describeModuleServiceExist(DescribeModuleServiceExistRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeModuleStatus  DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     */
    CompletableFuture<DescribeModuleStatusResponse> describeModuleStatus(DescribeModuleStatusRequest request);

    /**
     * @param request the request parameters of DescribePocTaskList  DescribePocTaskListRequest
     * @return DescribePocTaskListResponse
     */
    CompletableFuture<DescribePocTaskListResponse> describePocTaskList(DescribePocTaskListRequest request);

    /**
     * @param request the request parameters of DescribeSafRmmpOrder  DescribeSafRmmpOrderRequest
     * @return DescribeSafRmmpOrderResponse
     */
    CompletableFuture<DescribeSafRmmpOrderResponse> describeSafRmmpOrder(DescribeSafRmmpOrderRequest request);

    /**
     * @param request the request parameters of DescribeServiceAndScene  DescribeServiceAndSceneRequest
     * @return DescribeServiceAndSceneResponse
     */
    CompletableFuture<DescribeServiceAndSceneResponse> describeServiceAndScene(DescribeServiceAndSceneRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to query all model information under a specific user and supports pagination through page parameters. Fuzzy search can be performed using the <code>name</code> parameter.</p>
     * <ul>
     * <li><code>regId</code>: Region identifier, required.</li>
     * <li><code>pageSize</code>: Number of items per page, required.</li>
     * <li><code>currentPage</code>: Current page number, starting from 1, required.</li>
     * <li><code>userId</code>: User ID, required.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserModelList  DescribeUserModelListRequest
     * @return DescribeUserModelListResponse
     */
    CompletableFuture<DescribeUserModelListResponse> describeUserModelList(DescribeUserModelListRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DuplicateModel  DuplicateModelRequest
     * @return DuplicateModelResponse
     */
    CompletableFuture<DuplicateModelResponse> duplicateModel(DuplicateModelRequest request);

    /**
     * @param request the request parameters of EditModel  EditModelRequest
     * @return EditModelResponse
     */
    CompletableFuture<EditModelResponse> editModel(EditModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of GetBastionHostCertification  GetBastionHostCertificationRequest
     * @return GetBastionHostCertificationResponse
     */
    CompletableFuture<GetBastionHostCertificationResponse> getBastionHostCertification(GetBastionHostCertificationRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of IterateModel  IterateModelRequest
     * @return IterateModelResponse
     */
    CompletableFuture<IterateModelResponse> iterateModel(IterateModelRequest request);

    /**
     * @param request the request parameters of OfflineModel  OfflineModelRequest
     * @return OfflineModelResponse
     */
    CompletableFuture<OfflineModelResponse> offlineModel(OfflineModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of OnlineModel  OnlineModelRequest
     * @return OnlineModelResponse
     */
    CompletableFuture<OnlineModelResponse> onlineModel(OnlineModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of ParseExpressionParameters  ParseExpressionParametersRequest
     * @return ParseExpressionParametersResponse
     */
    CompletableFuture<ParseExpressionParametersResponse> parseExpressionParameters(ParseExpressionParametersRequest request);

    /**
     * @param request the request parameters of PrepublishModel  PrepublishModelRequest
     * @return PrepublishModelResponse
     */
    CompletableFuture<PrepublishModelResponse> prepublishModel(PrepublishModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of RequestModelFileSync  RequestModelFileSyncRequest
     * @return RequestModelFileSyncResponse
     */
    CompletableFuture<RequestModelFileSyncResponse> requestModelFileSync(RequestModelFileSyncRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of RollbackModel  RollbackModelRequest
     * @return RollbackModelResponse
     */
    CompletableFuture<RollbackModelResponse> rollbackModel(RollbackModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of TestModel  TestModelRequest
     * @return TestModelResponse
     */
    CompletableFuture<TestModelResponse> testModel(TestModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of TestPreModel  TestPreModelRequest
     * @return TestPreModelResponse
     */
    CompletableFuture<TestPreModelResponse> testPreModel(TestPreModelRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of TestProcessExpression  TestProcessExpressionRequest
     * @return TestProcessExpressionResponse
     */
    CompletableFuture<TestProcessExpressionResponse> testProcessExpression(TestProcessExpressionRequest request);

    /**
     * @param request the request parameters of UpdateModuleBasicInfo  UpdateModuleBasicInfoRequest
     * @return UpdateModuleBasicInfoResponse
     */
    CompletableFuture<UpdateModuleBasicInfoResponse> updateModuleBasicInfo(UpdateModuleBasicInfoRequest request);

    /**
     * @param request the request parameters of ValidateModelFile  ValidateModelFileRequest
     * @return ValidateModelFileResponse
     */
    CompletableFuture<ValidateModelFileResponse> validateModelFile(ValidateModelFileRequest request);

    /**
     * @param request the request parameters of ValidateTestFile  ValidateTestFileRequest
     * @return ValidateTestFileResponse
     */
    CompletableFuture<ValidateTestFileResponse> validateTestFile(ValidateTestFileRequest request);

}
