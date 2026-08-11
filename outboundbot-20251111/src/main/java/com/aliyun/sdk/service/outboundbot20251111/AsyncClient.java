// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.outboundbot20251111.models.*;
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
     * @param request the request parameters of CreateCloneVoice  CreateCloneVoiceRequest
     * @return CreateCloneVoiceResponse
     */
    CompletableFuture<CreateCloneVoiceResponse> createCloneVoice(CreateCloneVoiceRequest request);

    /**
     * @param request the request parameters of CreateFlashSmsAccessProfile  CreateFlashSmsAccessProfileRequest
     * @return CreateFlashSmsAccessProfileResponse
     */
    CompletableFuture<CreateFlashSmsAccessProfileResponse> createFlashSmsAccessProfile(CreateFlashSmsAccessProfileRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateOutboundCallRestriction  CreateOutboundCallRestrictionRequest
     * @return CreateOutboundCallRestrictionResponse
     */
    CompletableFuture<CreateOutboundCallRestrictionResponse> createOutboundCallRestriction(CreateOutboundCallRestrictionRequest request);

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
     * @param request the request parameters of CreateVoiceAccessProfile  CreateVoiceAccessProfileRequest
     * @return CreateVoiceAccessProfileResponse
     */
    CompletableFuture<CreateVoiceAccessProfileResponse> createVoiceAccessProfile(CreateVoiceAccessProfileRequest request);

    /**
     * @param request the request parameters of DeleteCloneVoice  DeleteCloneVoiceRequest
     * @return DeleteCloneVoiceResponse
     */
    CompletableFuture<DeleteCloneVoiceResponse> deleteCloneVoice(DeleteCloneVoiceRequest request);

    /**
     * @param request the request parameters of DeleteFlashSmsAccessProfile  DeleteFlashSmsAccessProfileRequest
     * @return DeleteFlashSmsAccessProfileResponse
     */
    CompletableFuture<DeleteFlashSmsAccessProfileResponse> deleteFlashSmsAccessProfile(DeleteFlashSmsAccessProfileRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteOutboundCallRestriction  DeleteOutboundCallRestrictionRequest
     * @return DeleteOutboundCallRestrictionResponse
     */
    CompletableFuture<DeleteOutboundCallRestrictionResponse> deleteOutboundCallRestriction(DeleteOutboundCallRestrictionRequest request);

    /**
     * @param request the request parameters of DeleteScript  DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request);

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
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetScriptProfileTemplate  GetScriptProfileTemplateRequest
     * @return GetScriptProfileTemplateResponse
     */
    CompletableFuture<GetScriptProfileTemplateResponse> getScriptProfileTemplate(GetScriptProfileTemplateRequest request);

    /**
     * @param request the request parameters of GetSubscription  GetSubscriptionRequest
     * @return GetSubscriptionResponse
     */
    CompletableFuture<GetSubscriptionResponse> getSubscription(GetSubscriptionRequest request);

    /**
     * @param request the request parameters of ListCloneVoiceModels  ListCloneVoiceModelsRequest
     * @return ListCloneVoiceModelsResponse
     */
    CompletableFuture<ListCloneVoiceModelsResponse> listCloneVoiceModels(ListCloneVoiceModelsRequest request);

    /**
     * @param request the request parameters of ListCloneVoices  ListCloneVoicesRequest
     * @return ListCloneVoicesResponse
     */
    CompletableFuture<ListCloneVoicesResponse> listCloneVoices(ListCloneVoicesRequest request);

    /**
     * @param request the request parameters of ListFlashSmsAccessProfiles  ListFlashSmsAccessProfilesRequest
     * @return ListFlashSmsAccessProfilesResponse
     */
    CompletableFuture<ListFlashSmsAccessProfilesResponse> listFlashSmsAccessProfiles(ListFlashSmsAccessProfilesRequest request);

    /**
     * @param request the request parameters of ListFlashSmsProviders  ListFlashSmsProvidersRequest
     * @return ListFlashSmsProvidersResponse
     */
    CompletableFuture<ListFlashSmsProvidersResponse> listFlashSmsProviders(ListFlashSmsProvidersRequest request);

    /**
     * @param request the request parameters of ListFlashSmsTemplates  ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    CompletableFuture<ListFlashSmsTemplatesResponse> listFlashSmsTemplates(ListFlashSmsTemplatesRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListOutboundCallRestrictions  ListOutboundCallRestrictionsRequest
     * @return ListOutboundCallRestrictionsResponse
     */
    CompletableFuture<ListOutboundCallRestrictionsResponse> listOutboundCallRestrictions(ListOutboundCallRestrictionsRequest request);

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
     * @param request the request parameters of ListScriptsByFlow  ListScriptsByFlowRequest
     * @return ListScriptsByFlowResponse
     */
    CompletableFuture<ListScriptsByFlowResponse> listScriptsByFlow(ListScriptsByFlowRequest request);

    /**
     * @param request the request parameters of ListSystemConfigs  ListSystemConfigsRequest
     * @return ListSystemConfigsResponse
     */
    CompletableFuture<ListSystemConfigsResponse> listSystemConfigs(ListSystemConfigsRequest request);

    /**
     * @param request the request parameters of ListVoiceAccessProfiles  ListVoiceAccessProfilesRequest
     * @return ListVoiceAccessProfilesResponse
     */
    CompletableFuture<ListVoiceAccessProfilesResponse> listVoiceAccessProfiles(ListVoiceAccessProfilesRequest request);

    /**
     * @param request the request parameters of PublishScript  PublishScriptRequest
     * @return PublishScriptResponse
     */
    CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request);

    /**
     * @param request the request parameters of UpdateCloneVoice  UpdateCloneVoiceRequest
     * @return UpdateCloneVoiceResponse
     */
    CompletableFuture<UpdateCloneVoiceResponse> updateCloneVoice(UpdateCloneVoiceRequest request);

    /**
     * @param request the request parameters of UpdateFlashSmsAccessProfile  UpdateFlashSmsAccessProfileRequest
     * @return UpdateFlashSmsAccessProfileResponse
     */
    CompletableFuture<UpdateFlashSmsAccessProfileResponse> updateFlashSmsAccessProfile(UpdateFlashSmsAccessProfileRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateScript  UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of UpdateScriptVersion  UpdateScriptVersionRequest
     * @return UpdateScriptVersionResponse
     */
    CompletableFuture<UpdateScriptVersionResponse> updateScriptVersion(UpdateScriptVersionRequest request);

    /**
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

    /**
     * @param request the request parameters of UpdateSystemConfigs  UpdateSystemConfigsRequest
     * @return UpdateSystemConfigsResponse
     */
    CompletableFuture<UpdateSystemConfigsResponse> updateSystemConfigs(UpdateSystemConfigsRequest request);

    /**
     * @param request the request parameters of UpdateVoiceAccessProfile  UpdateVoiceAccessProfileRequest
     * @return UpdateVoiceAccessProfileResponse
     */
    CompletableFuture<UpdateVoiceAccessProfileResponse> updateVoiceAccessProfile(UpdateVoiceAccessProfileRequest request);

}
