// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sophonsoar20250903.models.*;
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
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Ingress Traffic) before using this interface.</p>
     * 
     * @param request the request parameters of CreateComponentAsset  CreateComponentAssetRequest
     * @return CreateComponentAssetResponse
     */
    CompletableFuture<CreateComponentAssetResponse> createComponentAsset(CreateComponentAssetRequest request);

    /**
     * @param request the request parameters of CreatePlaybook  CreatePlaybookRequest
     * @return CreatePlaybookResponse
     */
    CompletableFuture<CreatePlaybookResponse> createPlaybook(CreatePlaybookRequest request);

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Access Traffic).</p>
     * 
     * @param request the request parameters of DeleteComponentAsset  DeleteComponentAssetRequest
     * @return DeleteComponentAssetResponse
     */
    CompletableFuture<DeleteComponentAssetResponse> deleteComponentAsset(DeleteComponentAssetRequest request);

    /**
     * @param request the request parameters of DeletePlaybook  DeletePlaybookRequest
     * @return DeletePlaybookResponse
     */
    CompletableFuture<DeletePlaybookResponse> deletePlaybook(DeletePlaybookRequest request);

    /**
     * @param request the request parameters of ExecuteComponent  ExecuteComponentRequest
     * @return ExecuteComponentResponse
     */
    CompletableFuture<ExecuteComponentResponse> executeComponent(ExecuteComponentRequest request);

    /**
     * @param request the request parameters of GetPlaybook  GetPlaybookRequest
     * @return GetPlaybookResponse
     */
    CompletableFuture<GetPlaybookResponse> getPlaybook(GetPlaybookRequest request);

    /**
     * @param request the request parameters of ListComponentAssets  ListComponentAssetsRequest
     * @return ListComponentAssetsResponse
     */
    CompletableFuture<ListComponentAssetsResponse> listComponentAssets(ListComponentAssetsRequest request);

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * @param request the request parameters of ListPlaybooks  ListPlaybooksRequest
     * @return ListPlaybooksResponse
     */
    CompletableFuture<ListPlaybooksResponse> listPlaybooks(ListPlaybooksRequest request);

    /**
     * @param request the request parameters of UpdateComponentAsset  UpdateComponentAssetRequest
     * @return UpdateComponentAssetResponse
     */
    CompletableFuture<UpdateComponentAssetResponse> updateComponentAsset(UpdateComponentAssetRequest request);

    /**
     * @param request the request parameters of UpdatePlaybook  UpdatePlaybookRequest
     * @return UpdatePlaybookResponse
     */
    CompletableFuture<UpdatePlaybookResponse> updatePlaybook(UpdatePlaybookRequest request);

}
