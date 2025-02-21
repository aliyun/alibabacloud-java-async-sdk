// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.brain_industrial20200920.models.*;
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
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request);

    /**
     * @param request the request parameters of CreateEssOptJob  CreateEssOptJobRequest
     * @return CreateEssOptJobResponse
     */
    CompletableFuture<CreateEssOptJobResponse> createEssOptJob(CreateEssOptJobRequest request);

    /**
     * @param request the request parameters of CreateLoadForecastJob  CreateLoadForecastJobRequest
     * @return CreateLoadForecastJobResponse
     */
    CompletableFuture<CreateLoadForecastJobResponse> createLoadForecastJob(CreateLoadForecastJobRequest request);

    /**
     * @param request the request parameters of CreatePowerForecastJob  CreatePowerForecastJobRequest
     * @return CreatePowerForecastJobResponse
     */
    CompletableFuture<CreatePowerForecastJobResponse> createPowerForecastJob(CreatePowerForecastJobRequest request);

    /**
     * @param request the request parameters of GetAivppAlgoJob  GetAivppAlgoJobRequest
     * @return GetAivppAlgoJobResponse
     */
    CompletableFuture<GetAivppAlgoJobResponse> getAivppAlgoJob(GetAivppAlgoJobRequest request);

    /**
     * @param request the request parameters of GetLicense  GetLicenseRequest
     * @return GetLicenseResponse
     */
    CompletableFuture<GetLicenseResponse> getLicense(GetLicenseRequest request);

    /**
     * @param request the request parameters of ListAivppResources  ListAivppResourcesRequest
     * @return ListAivppResourcesResponse
     */
    CompletableFuture<ListAivppResourcesResponse> listAivppResources(ListAivppResourcesRequest request);

    /**
     * @param request the request parameters of ListLicenses  ListLicensesRequest
     * @return ListLicensesResponse
     */
    CompletableFuture<ListLicensesResponse> listLicenses(ListLicensesRequest request);

    /**
     * @param request the request parameters of ListUserResources  ListUserResourcesRequest
     * @return ListUserResourcesResponse
     */
    CompletableFuture<ListUserResourcesResponse> listUserResources(ListUserResourcesRequest request);

    /**
     * @param request the request parameters of UpdateLicenseDescription  UpdateLicenseDescriptionRequest
     * @return UpdateLicenseDescriptionResponse
     */
    CompletableFuture<UpdateLicenseDescriptionResponse> updateLicenseDescription(UpdateLicenseDescriptionRequest request);

}
