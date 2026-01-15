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
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleBasicInfo  DescribeCustomerModuleBasicInfoRequest
     * @return DescribeCustomerModuleBasicInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleBasicInfoResponse> describeCustomerModuleBasicInfo(DescribeCustomerModuleBasicInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleMetaInfo  DescribeCustomerModuleMetaInfoRequest
     * @return DescribeCustomerModuleMetaInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleMetaInfoResponse> describeCustomerModuleMetaInfo(DescribeCustomerModuleMetaInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleOutputInfo  DescribeCustomerModuleOutputInfoRequest
     * @return DescribeCustomerModuleOutputInfoResponse
     */
    CompletableFuture<DescribeCustomerModuleOutputInfoResponse> describeCustomerModuleOutputInfo(DescribeCustomerModuleOutputInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFeatureOption  DescribeFeatureOptionRequest
     * @return DescribeFeatureOptionResponse
     */
    CompletableFuture<DescribeFeatureOptionResponse> describeFeatureOption(DescribeFeatureOptionRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
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
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
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
     * <p>该接口用于通过提供的<code>customerModuleId</code>来检查特定的模型服务是否已经存在。如果存在，则返回<code>true</code>；反之则返回<code>false</code>。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>customerModuleId</code>是必须提供的参数，且为字符串类型。</li>
     * <li>此API主要用于前端页面展示或逻辑判断时使用，以确认用户所选模型是否有对应的服务被创建。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModuleServiceExist  DescribeModuleServiceExistRequest
     * @return DescribeModuleServiceExistResponse
     */
    CompletableFuture<DescribeModuleServiceExistResponse> describeModuleServiceExist(DescribeModuleServiceExistRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeModuleStatus  DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     */
    CompletableFuture<DescribeModuleStatusResponse> describeModuleStatus(DescribeModuleStatusRequest request);

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
     * <h2>请求说明</h2>
     * <p>该 API 用于查询特定用户下的所有模型信息，并支持通过分页参数进行分页查询。可以通过 <code>name</code> 参数进行模糊搜索。</p>
     * <ul>
     * <li><code>regId</code>: 地域标识，必填。</li>
     * <li><code>pageSize</code>: 每页显示的条目数，必填。</li>
     * <li><code>currentPage</code>: 当前页码，从1开始计数，必填。</li>
     * <li><code>userId</code>: 用户ID，必填。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserModelList  DescribeUserModelListRequest
     * @return DescribeUserModelListResponse
     */
    CompletableFuture<DescribeUserModelListResponse> describeUserModelList(DescribeUserModelListRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
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
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
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
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * @param request the request parameters of OnlineModel  OnlineModelRequest
     * @return OnlineModelResponse
     */
    CompletableFuture<OnlineModelResponse> onlineModel(OnlineModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of TestModel  TestModelRequest
     * @return TestModelResponse
     */
    CompletableFuture<TestModelResponse> testModel(TestModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of TestPreModel  TestPreModelRequest
     * @return TestPreModelResponse
     */
    CompletableFuture<TestPreModelResponse> testPreModel(TestPreModelRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
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
