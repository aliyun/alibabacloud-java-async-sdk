// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.websitebuild20250429.models.*;
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
     * @param request the request parameters of CreateLogoTask  CreateLogoTaskRequest
     * @return CreateLogoTaskResponse
     */
    CompletableFuture<CreateLogoTaskResponse> createLogoTask(CreateLogoTaskRequest request);

    /**
     * @param request the request parameters of GetCreateLogoTask  GetCreateLogoTaskRequest
     * @return GetCreateLogoTaskResponse
     */
    CompletableFuture<GetCreateLogoTaskResponse> getCreateLogoTask(GetCreateLogoTaskRequest request);

    /**
     * @param request the request parameters of GetIcpFilingInfoForPartner  GetIcpFilingInfoForPartnerRequest
     * @return GetIcpFilingInfoForPartnerResponse
     */
    CompletableFuture<GetIcpFilingInfoForPartnerResponse> getIcpFilingInfoForPartner(GetIcpFilingInfoForPartnerRequest request);

    /**
     * @param request the request parameters of GetUserTmpIdentityForPartner  GetUserTmpIdentityForPartnerRequest
     * @return GetUserTmpIdentityForPartnerResponse
     */
    CompletableFuture<GetUserTmpIdentityForPartnerResponse> getUserTmpIdentityForPartner(GetUserTmpIdentityForPartnerRequest request);

    /**
     * @param request the request parameters of OperateAppInstanceForPartner  OperateAppInstanceForPartnerRequest
     * @return OperateAppInstanceForPartnerResponse
     */
    CompletableFuture<OperateAppInstanceForPartnerResponse> operateAppInstanceForPartner(OperateAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of OperateAppServiceForPartner  OperateAppServiceForPartnerRequest
     * @return OperateAppServiceForPartnerResponse
     */
    CompletableFuture<OperateAppServiceForPartnerResponse> operateAppServiceForPartner(OperateAppServiceForPartnerRequest request);

    /**
     * @param request the request parameters of SearchImage  SearchImageRequest
     * @return SearchImageResponse
     */
    CompletableFuture<SearchImageResponse> searchImage(SearchImageRequest request);

    /**
     * @param request the request parameters of SyncAppInstanceForPartner  SyncAppInstanceForPartnerRequest
     * @return SyncAppInstanceForPartnerResponse
     */
    CompletableFuture<SyncAppInstanceForPartnerResponse> syncAppInstanceForPartner(SyncAppInstanceForPartnerRequest request);

}
