// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.voicenavigator20251111.models.*;
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
     * @param request the request parameters of BeginSession  BeginSessionRequest
     * @return BeginSessionResponse
     */
    CompletableFuture<BeginSessionResponse> beginSession(BeginSessionRequest request);

    ResponseIterable<BeginSessionResponseBody> beginSessionWithResponseIterable(BeginSessionRequest request);

    /**
     * @param request the request parameters of BridgeWebCall  BridgeWebCallRequest
     * @return BridgeWebCallResponse
     */
    CompletableFuture<BridgeWebCallResponse> bridgeWebCall(BridgeWebCallRequest request);

    /**
     * @param request the request parameters of CreateCallCenterProvider  CreateCallCenterProviderRequest
     * @return CreateCallCenterProviderResponse
     */
    CompletableFuture<CreateCallCenterProviderResponse> createCallCenterProvider(CreateCallCenterProviderRequest request);

    /**
     * @param request the request parameters of CreateCloneVoice  CreateCloneVoiceRequest
     * @return CreateCloneVoiceResponse
     */
    CompletableFuture<CreateCloneVoiceResponse> createCloneVoice(CreateCloneVoiceRequest request);

    /**
     * @param request the request parameters of CreateInstruction  CreateInstructionRequest
     * @return CreateInstructionResponse
     */
    CompletableFuture<CreateInstructionResponse> createInstruction(CreateInstructionRequest request);

    /**
     * @param request the request parameters of CreateLlmAccessProfile  CreateLlmAccessProfileRequest
     * @return CreateLlmAccessProfileResponse
     */
    CompletableFuture<CreateLlmAccessProfileResponse> createLlmAccessProfile(CreateLlmAccessProfileRequest request);

    /**
     * @param request the request parameters of CreateScript  CreateScriptRequest
     * @return CreateScriptResponse
     */
    CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request);

    /**
     * @param request the request parameters of CreateScriptVersion  CreateScriptVersionRequest
     * @return CreateScriptVersionResponse
     */
    CompletableFuture<CreateScriptVersionResponse> createScriptVersion(CreateScriptVersionRequest request);

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
     * @param request the request parameters of DeleteCallCenterProvider  DeleteCallCenterProviderRequest
     * @return DeleteCallCenterProviderResponse
     */
    CompletableFuture<DeleteCallCenterProviderResponse> deleteCallCenterProvider(DeleteCallCenterProviderRequest request);

    /**
     * @param request the request parameters of DeleteCloneVoice  DeleteCloneVoiceRequest
     * @return DeleteCloneVoiceResponse
     */
    CompletableFuture<DeleteCloneVoiceResponse> deleteCloneVoice(DeleteCloneVoiceRequest request);

    /**
     * @param request the request parameters of DeleteInstruction  DeleteInstructionRequest
     * @return DeleteInstructionResponse
     */
    CompletableFuture<DeleteInstructionResponse> deleteInstruction(DeleteInstructionRequest request);

    /**
     * @param request the request parameters of DeleteLlmAccessProfile  DeleteLlmAccessProfileRequest
     * @return DeleteLlmAccessProfileResponse
     */
    CompletableFuture<DeleteLlmAccessProfileResponse> deleteLlmAccessProfile(DeleteLlmAccessProfileRequest request);

    /**
     * @param request the request parameters of DeleteScript  DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

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
     * @param request the request parameters of Dialogue  DialogueRequest
     * @return DialogueResponse
     */
    CompletableFuture<DialogueResponse> dialogue(DialogueRequest request);

    ResponseIterable<DialogueResponseBody> dialogueWithResponseIterable(DialogueRequest request);

    /**
     * @param request the request parameters of DisableSubscription  DisableSubscriptionRequest
     * @return DisableSubscriptionResponse
     */
    CompletableFuture<DisableSubscriptionResponse> disableSubscription(DisableSubscriptionRequest request);

    /**
     * @param request the request parameters of EndSession  EndSessionRequest
     * @return EndSessionResponse
     */
    CompletableFuture<EndSessionResponse> endSession(EndSessionRequest request);

    /**
     * @param request the request parameters of ExportScript  ExportScriptRequest
     * @return ExportScriptResponse
     */
    CompletableFuture<ExportScriptResponse> exportScript(ExportScriptRequest request);

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
     * @param request the request parameters of GetCallDetailRecord  GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    CompletableFuture<GetCallDetailRecordResponse> getCallDetailRecord(GetCallDetailRecordRequest request);

    /**
     * @param request the request parameters of GetDataChannelCredential  GetDataChannelCredentialRequest
     * @return GetDataChannelCredentialResponse
     */
    CompletableFuture<GetDataChannelCredentialResponse> getDataChannelCredential(GetDataChannelCredentialRequest request);

    /**
     * @param request the request parameters of GetRealtimeInstanceStats  GetRealtimeInstanceStatsRequest
     * @return GetRealtimeInstanceStatsResponse
     */
    CompletableFuture<GetRealtimeInstanceStatsResponse> getRealtimeInstanceStats(GetRealtimeInstanceStatsRequest request);

    /**
     * @param request the request parameters of GetRecording  GetRecordingRequest
     * @return GetRecordingResponse
     */
    CompletableFuture<GetRecordingResponse> getRecording(GetRecordingRequest request);

    /**
     * @param request the request parameters of GetScript  GetScriptRequest
     * @return GetScriptResponse
     */
    CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request);

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
     * @param request the request parameters of ListBackgroundMusics  ListBackgroundMusicsRequest
     * @return ListBackgroundMusicsResponse
     */
    CompletableFuture<ListBackgroundMusicsResponse> listBackgroundMusics(ListBackgroundMusicsRequest request);

    /**
     * @param request the request parameters of ListCallCenterProviders  ListCallCenterProvidersRequest
     * @return ListCallCenterProvidersResponse
     */
    CompletableFuture<ListCallCenterProvidersResponse> listCallCenterProviders(ListCallCenterProvidersRequest request);

    /**
     * @param request the request parameters of ListCallDetailRecords  ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    CompletableFuture<ListCallDetailRecordsResponse> listCallDetailRecords(ListCallDetailRecordsRequest request);

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
     * @param request the request parameters of ListInstructions  ListInstructionsRequest
     * @return ListInstructionsResponse
     */
    CompletableFuture<ListInstructionsResponse> listInstructions(ListInstructionsRequest request);

    /**
     * @param request the request parameters of ListLlmAccessProfiles  ListLlmAccessProfilesRequest
     * @return ListLlmAccessProfilesResponse
     */
    CompletableFuture<ListLlmAccessProfilesResponse> listLlmAccessProfiles(ListLlmAccessProfilesRequest request);

    /**
     * @param request the request parameters of ListNluModels  ListNluModelsRequest
     * @return ListNluModelsResponse
     */
    CompletableFuture<ListNluModelsResponse> listNluModels(ListNluModelsRequest request);

    /**
     * @param request the request parameters of ListScriptProfileTemplates  ListScriptProfileTemplatesRequest
     * @return ListScriptProfileTemplatesResponse
     */
    CompletableFuture<ListScriptProfileTemplatesResponse> listScriptProfileTemplates(ListScriptProfileTemplatesRequest request);

    /**
     * @param request the request parameters of ListScripts  ListScriptsRequest
     * @return ListScriptsResponse
     */
    CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request);

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
     * @param request the request parameters of PublishScript  PublishScriptRequest
     * @return PublishScriptResponse
     */
    CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request);

    /**
     * @param request the request parameters of UpdateCallCenterProvider  UpdateCallCenterProviderRequest
     * @return UpdateCallCenterProviderResponse
     */
    CompletableFuture<UpdateCallCenterProviderResponse> updateCallCenterProvider(UpdateCallCenterProviderRequest request);

    /**
     * @param request the request parameters of UpdateCloneVoice  UpdateCloneVoiceRequest
     * @return UpdateCloneVoiceResponse
     */
    CompletableFuture<UpdateCloneVoiceResponse> updateCloneVoice(UpdateCloneVoiceRequest request);

    /**
     * @param request the request parameters of UpdateInstruction  UpdateInstructionRequest
     * @return UpdateInstructionResponse
     */
    CompletableFuture<UpdateInstructionResponse> updateInstruction(UpdateInstructionRequest request);

    /**
     * @param request the request parameters of UpdateLlmAccessProfile  UpdateLlmAccessProfileRequest
     * @return UpdateLlmAccessProfileResponse
     */
    CompletableFuture<UpdateLlmAccessProfileResponse> updateLlmAccessProfile(UpdateLlmAccessProfileRequest request);

    /**
     * @param request the request parameters of UpdateScript  UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request);

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
