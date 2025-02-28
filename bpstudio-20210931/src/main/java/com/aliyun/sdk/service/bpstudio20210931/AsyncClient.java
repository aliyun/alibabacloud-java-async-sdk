// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bpstudio20210931.models.*;
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
     * <p>You can call this operation to switch a disaster recovery application back to the primary zone.</p>
     * 
     * @param request the request parameters of AppFailBack  AppFailBackRequest
     * @return AppFailBackResponse
     */
    CompletableFuture<AppFailBackResponse> appFailBack(AppFailBackRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to switch a disaster recovery application to another supported zone.</p>
     * 
     * @param request the request parameters of AppFailOver  AppFailOverRequest
     * @return AppFailOverResponse
     */
    CompletableFuture<AppFailOverResponse> appFailOver(AppFailOverRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an application, make sure that the application is in the <code>Destroyed_Success</code> state. Otherwise, the application fails to be deleted.`` You can call the <a href="https://www.alibabacloud.com/help/en/bp-studio/latest/api-bpstudio-2021-09-31-getapplication">GetApplication</a> operation to query the status of an application.</p>
     * 
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeployApplication  DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    /**
     * @param request the request parameters of ExecuteOperationASync  ExecuteOperationASyncRequest
     * @return ExecuteOperationASyncResponse
     */
    CompletableFuture<ExecuteOperationASyncResponse> executeOperationASync(ExecuteOperationASyncRequest request);

    /**
     * @param request the request parameters of ExecuteOperationSync  ExecuteOperationSyncRequest
     * @return ExecuteOperationSyncResponse
     */
    CompletableFuture<ExecuteOperationSyncResponse> executeOperationSync(ExecuteOperationSyncRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetApplicationVariables  GetApplicationVariablesRequest
     * @return GetApplicationVariablesResponse
     */
    CompletableFuture<GetApplicationVariablesResponse> getApplicationVariables(GetApplicationVariablesRequest request);

    /**
     * @param request the request parameters of GetApplicationVariables4Fail  GetApplicationVariables4FailRequest
     * @return GetApplicationVariables4FailResponse
     */
    CompletableFuture<GetApplicationVariables4FailResponse> getApplicationVariables4Fail(GetApplicationVariables4FailRequest request);

    /**
     * @param request the request parameters of GetExecuteOperationResult  GetExecuteOperationResultRequest
     * @return GetExecuteOperationResultResponse
     */
    CompletableFuture<GetExecuteOperationResultResponse> getExecuteOperationResult(GetExecuteOperationResultRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the status of a disaster recovery switchover task by task ID.</p>
     * 
     * @param request the request parameters of GetFoTaskStatus  GetFoTaskStatusRequest
     * @return GetFoTaskStatusResponse
     */
    CompletableFuture<GetFoTaskStatusResponse> getFoTaskStatus(GetFoTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the zones where the specified disaster recovery service can be switched.</p>
     * 
     * @param request the request parameters of GetPotentialFailZones  GetPotentialFailZonesRequest
     * @return GetPotentialFailZonesResponse
     */
    CompletableFuture<GetPotentialFailZonesResponse> getPotentialFailZones(GetPotentialFailZonesRequest request);

    /**
     * @param request the request parameters of GetResource4ModifyRecord  GetResource4ModifyRecordRequest
     * @return GetResource4ModifyRecordResponse
     */
    CompletableFuture<GetResource4ModifyRecordResponse> getResource4ModifyRecord(GetResource4ModifyRecordRequest request);

    /**
     * @param request the request parameters of GetResult4QueryInstancePrice4Modify  GetResult4QueryInstancePrice4ModifyRequest
     * @return GetResult4QueryInstancePrice4ModifyResponse
     */
    CompletableFuture<GetResult4QueryInstancePrice4ModifyResponse> getResult4QueryInstancePrice4Modify(GetResult4QueryInstancePrice4ModifyRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @deprecated OpenAPI GetToken is deprecated, please use BPStudio::2021-09-31::GetApplication instead.  * @description >Danger:  This API is no longer recommended, and the image related to the Application has included access authorization in the GetApplication property.
     * 
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Deprecated
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to prepare for application switchover and initiate a switchover task.</p>
     * 
     * @param request the request parameters of InitAppFailOver  InitAppFailOverRequest
     * @return InitAppFailOverResponse
     */
    CompletableFuture<InitAppFailOverResponse> initAppFailOver(InitAppFailOverRequest request);

    /**
     * @param request the request parameters of ListApplication  ListApplicationRequest
     * @return ListApplicationResponse
     */
    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information about all disaster recovery plans of the current account.</p>
     * 
     * @param request the request parameters of ListFoCreatedApps  ListFoCreatedAppsRequest
     * @return ListFoCreatedAppsResponse
     */
    CompletableFuture<ListFoCreatedAppsResponse> listFoCreatedApps(ListFoCreatedAppsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTemplate  ListTemplateRequest
     * @return ListTemplateResponse
     */
    CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request);

    /**
     * @param request the request parameters of ModifyApplicationSpec  ModifyApplicationSpecRequest
     * @return ModifyApplicationSpecResponse
     */
    CompletableFuture<ModifyApplicationSpecResponse> modifyApplicationSpec(ModifyApplicationSpecRequest request);

    /**
     * @param request the request parameters of QueryInstancePrice4Modify  QueryInstancePrice4ModifyRequest
     * @return QueryInstancePrice4ModifyResponse
     */
    CompletableFuture<QueryInstancePrice4ModifyResponse> queryInstancePrice4Modify(QueryInstancePrice4ModifyRequest request);

    /**
     * @param request the request parameters of QueryInstanceSpec4Modify  QueryInstanceSpec4ModifyRequest
     * @return QueryInstanceSpec4ModifyResponse
     */
    CompletableFuture<QueryInstanceSpec4ModifyResponse> queryInstanceSpec4Modify(QueryInstanceSpec4ModifyRequest request);

    /**
     * @param request the request parameters of ReConfigApplication  ReConfigApplicationRequest
     * @return ReConfigApplicationResponse
     */
    CompletableFuture<ReConfigApplicationResponse> reConfigApplication(ReConfigApplicationRequest request);

    /**
     * @param request the request parameters of ReleaseApplication  ReleaseApplicationRequest
     * @return ReleaseApplicationResponse
     */
    CompletableFuture<ReleaseApplicationResponse> releaseApplication(ReleaseApplicationRequest request);

    /**
     * @param request the request parameters of ValidateApplication  ValidateApplicationRequest
     * @return ValidateApplicationResponse
     */
    CompletableFuture<ValidateApplicationResponse> validateApplication(ValidateApplicationRequest request);

    /**
     * @param request the request parameters of ValuateApplication  ValuateApplicationRequest
     * @return ValuateApplicationResponse
     */
    CompletableFuture<ValuateApplicationResponse> valuateApplication(ValuateApplicationRequest request);

    /**
     * @param request the request parameters of ValuateTemplate  ValuateTemplateRequest
     * @return ValuateTemplateResponse
     */
    CompletableFuture<ValuateTemplateResponse> valuateTemplate(ValuateTemplateRequest request);

}
