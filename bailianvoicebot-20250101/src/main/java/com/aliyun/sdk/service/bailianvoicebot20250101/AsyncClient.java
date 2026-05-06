// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailianvoicebot20250101.models.*;
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
     * @param request the request parameters of BridgeWebCall  BridgeWebCallRequest
     * @return BridgeWebCallResponse
     */
    CompletableFuture<BridgeWebCallResponse> bridgeWebCall(BridgeWebCallRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateApplicationVersion  CreateApplicationVersionRequest
     * @return CreateApplicationVersionResponse
     */
    CompletableFuture<CreateApplicationVersionResponse> createApplicationVersion(CreateApplicationVersionRequest request);

    /**
     * @param request the request parameters of CreateCloneVoice  CreateCloneVoiceRequest
     * @return CreateCloneVoiceResponse
     */
    CompletableFuture<CreateCloneVoiceResponse> createCloneVoice(CreateCloneVoiceRequest request);

    /**
     * @param request the request parameters of CreateVariable  CreateVariableRequest
     * @return CreateVariableResponse
     */
    CompletableFuture<CreateVariableResponse> createVariable(CreateVariableRequest request);

    /**
     * @param request the request parameters of CreateVocabulary  CreateVocabularyRequest
     * @return CreateVocabularyResponse
     */
    CompletableFuture<CreateVocabularyResponse> createVocabulary(CreateVocabularyRequest request);

    /**
     * @param request the request parameters of CreateVoiceAccessProfile  CreateVoiceAccessProfileRequest
     * @return CreateVoiceAccessProfileResponse
     */
    CompletableFuture<CreateVoiceAccessProfileResponse> createVoiceAccessProfile(CreateVoiceAccessProfileRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeleteCloneVoice  DeleteCloneVoiceRequest
     * @return DeleteCloneVoiceResponse
     */
    CompletableFuture<DeleteCloneVoiceResponse> deleteCloneVoice(DeleteCloneVoiceRequest request);

    /**
     * @param request the request parameters of DeleteVariable  DeleteVariableRequest
     * @return DeleteVariableResponse
     */
    CompletableFuture<DeleteVariableResponse> deleteVariable(DeleteVariableRequest request);

    /**
     * @param request the request parameters of DeleteVocabulary  DeleteVocabularyRequest
     * @return DeleteVocabularyResponse
     */
    CompletableFuture<DeleteVocabularyResponse> deleteVocabulary(DeleteVocabularyRequest request);

    /**
     * @param request the request parameters of DeleteVoiceAccessProfile  DeleteVoiceAccessProfileRequest
     * @return DeleteVoiceAccessProfileResponse
     */
    CompletableFuture<DeleteVoiceAccessProfileResponse> deleteVoiceAccessProfile(DeleteVoiceAccessProfileRequest request);

    /**
     * @param request the request parameters of DisableSubscription  DisableSubscriptionRequest
     * @return DisableSubscriptionResponse
     */
    CompletableFuture<DisableSubscriptionResponse> disableSubscription(DisableSubscriptionRequest request);

    /**
     * @param request the request parameters of ExportVocabulary  ExportVocabularyRequest
     * @return ExportVocabularyResponse
     */
    CompletableFuture<ExportVocabularyResponse> exportVocabulary(ExportVocabularyRequest request);

    /**
     * @param request the request parameters of GenerateFileUploadParams  GenerateFileUploadParamsRequest
     * @return GenerateFileUploadParamsResponse
     */
    CompletableFuture<GenerateFileUploadParamsResponse> generateFileUploadParams(GenerateFileUploadParamsRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetDataChannelCredential  GetDataChannelCredentialRequest
     * @return GetDataChannelCredentialResponse
     */
    CompletableFuture<GetDataChannelCredentialResponse> getDataChannelCredential(GetDataChannelCredentialRequest request);

    /**
     * @param request the request parameters of GetSubscription  GetSubscriptionRequest
     * @return GetSubscriptionResponse
     */
    CompletableFuture<GetSubscriptionResponse> getSubscription(GetSubscriptionRequest request);

    /**
     * @param request the request parameters of GetVocabulary  GetVocabularyRequest
     * @return GetVocabularyResponse
     */
    CompletableFuture<GetVocabularyResponse> getVocabulary(GetVocabularyRequest request);

    /**
     * @param request the request parameters of ImportVocabulary  ImportVocabularyRequest
     * @return ImportVocabularyResponse
     */
    CompletableFuture<ImportVocabularyResponse> importVocabulary(ImportVocabularyRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListBackgroundMusics  ListBackgroundMusicsRequest
     * @return ListBackgroundMusicsResponse
     */
    CompletableFuture<ListBackgroundMusicsResponse> listBackgroundMusics(ListBackgroundMusicsRequest request);

    /**
     * @param request the request parameters of ListCloneVoice  ListCloneVoiceRequest
     * @return ListCloneVoiceResponse
     */
    CompletableFuture<ListCloneVoiceResponse> listCloneVoice(ListCloneVoiceRequest request);

    /**
     * @param request the request parameters of ListCloneVoiceModels  ListCloneVoiceModelsRequest
     * @return ListCloneVoiceModelsResponse
     */
    CompletableFuture<ListCloneVoiceModelsResponse> listCloneVoiceModels(ListCloneVoiceModelsRequest request);

    /**
     * @param request the request parameters of ListNluModels  ListNluModelsRequest
     * @return ListNluModelsResponse
     */
    CompletableFuture<ListNluModelsResponse> listNluModels(ListNluModelsRequest request);

    /**
     * @param request the request parameters of ListVariable  ListVariableRequest
     * @return ListVariableResponse
     */
    CompletableFuture<ListVariableResponse> listVariable(ListVariableRequest request);

    /**
     * @param request the request parameters of ListVocabulary  ListVocabularyRequest
     * @return ListVocabularyResponse
     */
    CompletableFuture<ListVocabularyResponse> listVocabulary(ListVocabularyRequest request);

    /**
     * @param request the request parameters of ListVoiceAccessProfile  ListVoiceAccessProfileRequest
     * @return ListVoiceAccessProfileResponse
     */
    CompletableFuture<ListVoiceAccessProfileResponse> listVoiceAccessProfile(ListVoiceAccessProfileRequest request);

    /**
     * @param request the request parameters of ListVoiceEngines  ListVoiceEnginesRequest
     * @return ListVoiceEnginesResponse
     */
    CompletableFuture<ListVoiceEnginesResponse> listVoiceEngines(ListVoiceEnginesRequest request);

    /**
     * @param request the request parameters of ListVoices  ListVoicesRequest
     * @return ListVoicesResponse
     */
    CompletableFuture<ListVoicesResponse> listVoices(ListVoicesRequest request);

    /**
     * @param request the request parameters of PreviewVoice  PreviewVoiceRequest
     * @return PreviewVoiceResponse
     */
    CompletableFuture<PreviewVoiceResponse> previewVoice(PreviewVoiceRequest request);

    /**
     * @param request the request parameters of PublishApplicationVersion  PublishApplicationVersionRequest
     * @return PublishApplicationVersionResponse
     */
    CompletableFuture<PublishApplicationVersionResponse> publishApplicationVersion(PublishApplicationVersionRequest request);

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    /**
     * @param request the request parameters of UpdateApplicationVersion  UpdateApplicationVersionRequest
     * @return UpdateApplicationVersionResponse
     */
    CompletableFuture<UpdateApplicationVersionResponse> updateApplicationVersion(UpdateApplicationVersionRequest request);

    /**
     * @param request the request parameters of UpdateCloneVoice  UpdateCloneVoiceRequest
     * @return UpdateCloneVoiceResponse
     */
    CompletableFuture<UpdateCloneVoiceResponse> updateCloneVoice(UpdateCloneVoiceRequest request);

    /**
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

    /**
     * @param request the request parameters of UpdateVariable  UpdateVariableRequest
     * @return UpdateVariableResponse
     */
    CompletableFuture<UpdateVariableResponse> updateVariable(UpdateVariableRequest request);

    /**
     * @param request the request parameters of UpdateVocabulary  UpdateVocabularyRequest
     * @return UpdateVocabularyResponse
     */
    CompletableFuture<UpdateVocabularyResponse> updateVocabulary(UpdateVocabularyRequest request);

    /**
     * @param request the request parameters of UpdateVoiceAccessProfile  UpdateVoiceAccessProfileRequest
     * @return UpdateVoiceAccessProfileResponse
     */
    CompletableFuture<UpdateVoiceAccessProfileResponse> updateVoiceAccessProfile(UpdateVoiceAccessProfileRequest request);

}
