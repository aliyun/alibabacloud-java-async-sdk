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
      * You can call this operation to switch a disaster recovery application back to the primary zone.
      *
     */
    CompletableFuture<AppFailBackResponse> appFailBack(AppFailBackRequest request);

    /**
      * You can call this operation to switch a disaster recovery application to another supported zone.
      *
     */
    CompletableFuture<AppFailOverResponse> appFailOver(AppFailOverRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
      * Before you call this operation to delete an application, make sure that the application is in the `Destroyed_Success` state. Otherwise, the application fails to be deleted.`` You can call the [GetApplication](https://www.alibabacloud.com/help/en/bp-studio/latest/api-bpstudio-2021-09-31-getapplication) operation to query the status of an application.
      *
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    CompletableFuture<ExecuteOperationASyncResponse> executeOperationASync(ExecuteOperationASyncRequest request);

    CompletableFuture<ExecuteOperationSyncResponse> executeOperationSync(ExecuteOperationSyncRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetApplicationVariablesResponse> getApplicationVariables(GetApplicationVariablesRequest request);

    CompletableFuture<GetApplicationVariables4FailResponse> getApplicationVariables4Fail(GetApplicationVariables4FailRequest request);

    CompletableFuture<GetExecuteOperationResultResponse> getExecuteOperationResult(GetExecuteOperationResultRequest request);

    /**
      * You can call this operation to query the status of a disaster recovery switchover task by task ID.
      *
     */
    CompletableFuture<GetFoTaskStatusResponse> getFoTaskStatus(GetFoTaskStatusRequest request);

    /**
      * You can call this operation to query the zones where the specified disaster recovery service can be switched.
      *
     */
    CompletableFuture<GetPotentialFailZonesResponse> getPotentialFailZones(GetPotentialFailZonesRequest request);

    CompletableFuture<GetResource4ModifyRecordResponse> getResource4ModifyRecord(GetResource4ModifyRecordRequest request);

    CompletableFuture<GetResult4QueryInstancePrice4ModifyResponse> getResult4QueryInstancePrice4Modify(GetResult4QueryInstancePrice4ModifyRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
      * @deprecated
      * ><danger> This API is no longer recommended, and the image related to the Application has included access authorization in the GetApplication property.></danger>
      *
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
      * You can call this operation to prepare for application switchover and initiate a switchover task.
      *
     */
    CompletableFuture<InitAppFailOverResponse> initAppFailOver(InitAppFailOverRequest request);

    CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request);

    /**
      * You can call this operation to query all disaster recovery plans.
      *
     */
    CompletableFuture<ListFoCreatedAppsResponse> listFoCreatedApps(ListFoCreatedAppsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request);

    CompletableFuture<ModifyApplicationSpecResponse> modifyApplicationSpec(ModifyApplicationSpecRequest request);

    CompletableFuture<QueryInstancePrice4ModifyResponse> queryInstancePrice4Modify(QueryInstancePrice4ModifyRequest request);

    CompletableFuture<QueryInstanceSpec4ModifyResponse> queryInstanceSpec4Modify(QueryInstanceSpec4ModifyRequest request);

    CompletableFuture<ReConfigApplicationResponse> reConfigApplication(ReConfigApplicationRequest request);

    CompletableFuture<ReleaseApplicationResponse> releaseApplication(ReleaseApplicationRequest request);

    CompletableFuture<ValidateApplicationResponse> validateApplication(ValidateApplicationRequest request);

    CompletableFuture<ValuateApplicationResponse> valuateApplication(ValuateApplicationRequest request);

    CompletableFuture<ValuateTemplateResponse> valuateTemplate(ValuateTemplateRequest request);

}
