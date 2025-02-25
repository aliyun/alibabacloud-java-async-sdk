// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cams20200606.models.*;
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
     * @param request the request parameters of AddChatappPhoneNumber  AddChatappPhoneNumberRequest
     * @return AddChatappPhoneNumberResponse
     */
    CompletableFuture<AddChatappPhoneNumberResponse> addChatappPhoneNumber(AddChatappPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of BeeBotAssociate  BeeBotAssociateRequest
     * @return BeeBotAssociateResponse
     */
    CompletableFuture<BeeBotAssociateResponse> beeBotAssociate(BeeBotAssociateRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the session.</p>
     * 
     * @param request the request parameters of BeeBotChat  BeeBotChatRequest
     * @return BeeBotChatResponse
     */
    CompletableFuture<BeeBotChatResponse> beeBotChat(BeeBotChatRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappBindWaba  ChatappBindWabaRequest
     * @return ChatappBindWabaResponse
     */
    CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappEmbedSignUp  ChatappEmbedSignUpRequest
     * @return ChatappEmbedSignUpResponse
     */
    CompletableFuture<ChatappEmbedSignUpResponse> chatappEmbedSignUp(ChatappEmbedSignUpRequest request);

    /**
     * <b>description</b> :
     * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
     * 
     * @param request the request parameters of ChatappMigrationRegister  ChatappMigrationRegisterRequest
     * @return ChatappMigrationRegisterResponse
     */
    CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappMigrationVerified  ChatappMigrationVerifiedRequest
     * @return ChatappMigrationVerifiedResponse
     */
    CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberDeregister  ChatappPhoneNumberDeregisterRequest
     * @return ChatappPhoneNumberDeregisterResponse
     */
    CompletableFuture<ChatappPhoneNumberDeregisterResponse> chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberRegister  ChatappPhoneNumberRegisterRequest
     * @return ChatappPhoneNumberRegisterResponse
     */
    CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappSyncPhoneNumber  ChatappSyncPhoneNumberRequest
     * @return ChatappSyncPhoneNumberResponse
     */
    CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappVerifyAndRegister  ChatappVerifyAndRegisterRequest
     * @return ChatappVerifyAndRegisterResponse
     */
    CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>The status of the phone number.</p>
     * 
     * @param request the request parameters of CreateChatappMigrationInitiate  CreateChatappMigrationInitiateRequest
     * @return CreateChatappMigrationInitiateResponse
     */
    CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateChatappTemplate  CreateChatappTemplateRequest
     * @return CreateChatappTemplateResponse
     */
    CompletableFuture<CreateChatappTemplateResponse> createChatappTemplate(CreateChatappTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    /**
     * @param request the request parameters of CreatePhoneMessageQrdl  CreatePhoneMessageQrdlRequest
     * @return CreatePhoneMessageQrdlResponse
     */
    CompletableFuture<CreatePhoneMessageQrdlResponse> createPhoneMessageQrdl(CreatePhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteChatappTemplate  DeleteChatappTemplateRequest
     * @return DeleteChatappTemplateResponse
     */
    CompletableFuture<DeleteChatappTemplateResponse> deleteChatappTemplate(DeleteChatappTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    /**
     * @param request the request parameters of DeletePhoneMessageQrdl  DeletePhoneMessageQrdlRequest
     * @return DeletePhoneMessageQrdlResponse
     */
    CompletableFuture<DeletePhoneMessageQrdlResponse> deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request);

    /**
     * @param request the request parameters of DeprecateFlow  DeprecateFlowRequest
     * @return DeprecateFlowResponse
     */
    CompletableFuture<DeprecateFlowResponse> deprecateFlow(DeprecateFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of EnableWhatsappROIMetric  EnableWhatsappROIMetricRequest
     * @return EnableWhatsappROIMetricResponse
     */
    CompletableFuture<EnableWhatsappROIMetricResponse> enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappPhoneNumberMetric  GetChatappPhoneNumberMetricRequest
     * @return GetChatappPhoneNumberMetricResponse
     */
    CompletableFuture<GetChatappPhoneNumberMetricResponse> getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappTemplateDetail  GetChatappTemplateDetailRequest
     * @return GetChatappTemplateDetailResponse
     */
    CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappTemplateMetric  GetChatappTemplateMetricRequest
     * @return GetChatappTemplateMetricResponse
     */
    CompletableFuture<GetChatappTemplateMetricResponse> getChatappTemplateMetric(GetChatappTemplateMetricRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappUploadAuthorization  GetChatappUploadAuthorizationRequest
     * @return GetChatappUploadAuthorizationResponse
     */
    CompletableFuture<GetChatappUploadAuthorizationResponse> getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappVerifyCode  GetChatappVerifyCodeRequest
     * @return GetChatappVerifyCodeResponse
     */
    CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCommerceSetting  GetCommerceSettingRequest
     * @return GetCommerceSettingResponse
     */
    CompletableFuture<GetCommerceSettingResponse> getCommerceSetting(GetCommerceSettingRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetConversationalAutomation  GetConversationalAutomationRequest
     * @return GetConversationalAutomationResponse
     */
    CompletableFuture<GetConversationalAutomationResponse> getConversationalAutomation(GetConversationalAutomationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetFlow  GetFlowRequest
     * @return GetFlowResponse
     */
    CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request);

    /**
     * @param request the request parameters of GetFlowJSONAssest  GetFlowJSONAssestRequest
     * @return GetFlowJSONAssestResponse
     */
    CompletableFuture<GetFlowJSONAssestResponse> getFlowJSONAssest(GetFlowJSONAssestRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetFlowPreviewUrl  GetFlowPreviewUrlRequest
     * @return GetFlowPreviewUrlResponse
     */
    CompletableFuture<GetFlowPreviewUrlResponse> getFlowPreviewUrl(GetFlowPreviewUrlRequest request);

    /**
     * <b>description</b> :
     * <p>The single user QPS limit for this interface is 10 times per second. Exceeding the limit may result in restricted API calls, which may affect your business. Please make reasonable calls.</p>
     * 
     * @param request the request parameters of GetMigrationVerifyCode  GetMigrationVerifyCodeRequest
     * @return GetMigrationVerifyCodeResponse
     */
    CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request);

    /**
     * @param request the request parameters of GetPermissionByCode  GetPermissionByCodeRequest
     * @return GetPermissionByCodeResponse
     */
    CompletableFuture<GetPermissionByCodeResponse> getPermissionByCode(GetPermissionByCodeRequest request);

    /**
     * @param request the request parameters of GetPhoneEncryptionPublicKey  GetPhoneEncryptionPublicKeyRequest
     * @return GetPhoneEncryptionPublicKeyResponse
     */
    CompletableFuture<GetPhoneEncryptionPublicKeyResponse> getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetPhoneNumberVerificationStatus  GetPhoneNumberVerificationStatusRequest
     * @return GetPhoneNumberVerificationStatusResponse
     */
    CompletableFuture<GetPhoneNumberVerificationStatusResponse> getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetPreValidatePhoneId  GetPreValidatePhoneIdRequest
     * @return GetPreValidatePhoneIdResponse
     */
    CompletableFuture<GetPreValidatePhoneIdResponse> getPreValidatePhoneId(GetPreValidatePhoneIdRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetWhatsappConnectionCatalog  GetWhatsappConnectionCatalogRequest
     * @return GetWhatsappConnectionCatalogResponse
     */
    CompletableFuture<GetWhatsappConnectionCatalogResponse> getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetWhatsappHealthStatus  GetWhatsappHealthStatusRequest
     * @return GetWhatsappHealthStatusResponse
     */
    CompletableFuture<GetWhatsappHealthStatusResponse> getWhatsappHealthStatus(GetWhatsappHealthStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of IsvGetAppId  IsvGetAppIdRequest
     * @return IsvGetAppIdResponse
     */
    CompletableFuture<IsvGetAppIdResponse> isvGetAppId(IsvGetAppIdRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListChatappTemplate  ListChatappTemplateRequest
     * @return ListChatappTemplateResponse
     */
    CompletableFuture<ListChatappTemplateResponse> listChatappTemplate(ListChatappTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListFlow  ListFlowRequest
     * @return ListFlowResponse
     */
    CompletableFuture<ListFlowResponse> listFlow(ListFlowRequest request);

    /**
     * @param request the request parameters of ListPhoneMessageQrdl  ListPhoneMessageQrdlRequest
     * @return ListPhoneMessageQrdlResponse
     */
    CompletableFuture<ListPhoneMessageQrdlResponse> listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListProduct  ListProductRequest
     * @return ListProductResponse
     */
    CompletableFuture<ListProductResponse> listProduct(ListProductRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListProductCatalog  ListProductCatalogRequest
     * @return ListProductCatalogResponse
     */
    CompletableFuture<ListProductCatalogResponse> listProductCatalog(ListProductCatalogRequest request);

    /**
     * <b>description</b> :
     * <p>The name of the message template.</p>
     * 
     * @param request the request parameters of ModifyChatappTemplate  ModifyChatappTemplateRequest
     * @return ModifyChatappTemplateResponse
     */
    CompletableFuture<ModifyChatappTemplateResponse> modifyChatappTemplate(ModifyChatappTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyFlow  ModifyFlowRequest
     * @return ModifyFlowResponse
     */
    CompletableFuture<ModifyFlowResponse> modifyFlow(ModifyFlowRequest request);

    /**
     * <b>description</b> :
     * <p>ModifyPhoneBusinessProfile</p>
     * 
     * @param request the request parameters of ModifyPhoneBusinessProfile  ModifyPhoneBusinessProfileRequest
     * @return ModifyPhoneBusinessProfileResponse
     */
    CompletableFuture<ModifyPhoneBusinessProfileResponse> modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PublishFlow  PublishFlowRequest
     * @return PublishFlowResponse
     */
    CompletableFuture<PublishFlowResponse> publishFlow(PublishFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryChatappBindWaba  QueryChatappBindWabaRequest
     * @return QueryChatappBindWabaResponse
     */
    CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryChatappPhoneNumbers  QueryChatappPhoneNumbersRequest
     * @return QueryChatappPhoneNumbersResponse
     */
    CompletableFuture<QueryChatappPhoneNumbersResponse> queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryPhoneBusinessProfile  QueryPhoneBusinessProfileRequest
     * @return QueryPhoneBusinessProfileResponse
     */
    CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryWabaBusinessInfo  QueryWabaBusinessInfoRequest
     * @return QueryWabaBusinessInfoResponse
     */
    CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * You can send messages to up to 1,000 phone numbers in a single request.</p>
     * 
     * @param request the request parameters of SendChatappMassMessage  SendChatappMassMessageRequest
     * @return SendChatappMassMessageResponse
     */
    CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendChatappMessage  SendChatappMessageRequest
     * @return SendChatappMessageResponse
     */
    CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <ul>
     * <li>After you call the <a href="~~GetChatappUploadAuthorization~~">GetChatappUploadAuthorization</a> operation to obtain the authentication information for uploading the file to Object Storage Service (OSS), you can use the authentication information to upload the file to the OSS server. To upload the file, you can call the SDK provided by OSS. When you upload the file, set the value of the key to the value of <code>Dir + &quot;/&quot; + file name</code>, such as C200293990209/isvTerms.pdf. The value of Dir is obtained from the <a href="~~GetChatappUploadAuthorization~~">GetChatappUploadAuthorization</a> operation. The value of IsvTerms is obtained from the PutObject operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitIsvCustomerTerms  SubmitIsvCustomerTermsRequest
     * @return SubmitIsvCustomerTermsResponse
     */
    CompletableFuture<SubmitIsvCustomerTermsResponse> submitIsvCustomerTerms(SubmitIsvCustomerTermsRequest request);

    /**
     * <b>description</b> :
     * <p>After triggering an online flow, if your flow contains components that incur costs for cloud products, such as message sending or function calls, please ensure you fully understand the billing methods and prices of the related products before using this interface.</p>
     * 
     * @param request the request parameters of TriggerChatFlow  TriggerChatFlowRequest
     * @return TriggerChatFlowResponse
     */
    CompletableFuture<TriggerChatFlowResponse> triggerChatFlow(TriggerChatFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateAccountWebhook  UpdateAccountWebhookRequest
     * @return UpdateAccountWebhookResponse
     */
    CompletableFuture<UpdateAccountWebhookResponse> updateAccountWebhook(UpdateAccountWebhookRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCommerceSetting  UpdateCommerceSettingRequest
     * @return UpdateCommerceSettingResponse
     */
    CompletableFuture<UpdateCommerceSettingResponse> updateCommerceSetting(UpdateCommerceSettingRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateConversationalAutomation  UpdateConversationalAutomationRequest
     * @return UpdateConversationalAutomationResponse
     */
    CompletableFuture<UpdateConversationalAutomationResponse> updateConversationalAutomation(UpdateConversationalAutomationRequest request);

    /**
     * @param request the request parameters of UpdateFlowJSONAsset  UpdateFlowJSONAssetRequest
     * @return UpdateFlowJSONAssetResponse
     */
    CompletableFuture<UpdateFlowJSONAssetResponse> updateFlowJSONAsset(UpdateFlowJSONAssetRequest request);

    /**
     * @param request the request parameters of UpdatePhoneEncryptionPublicKey  UpdatePhoneEncryptionPublicKeyRequest
     * @return UpdatePhoneEncryptionPublicKeyResponse
     */
    CompletableFuture<UpdatePhoneEncryptionPublicKeyResponse> updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request);

    /**
     * @param request the request parameters of UpdatePhoneMessageQrdl  UpdatePhoneMessageQrdlRequest
     * @return UpdatePhoneMessageQrdlResponse
     */
    CompletableFuture<UpdatePhoneMessageQrdlResponse> updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>The error message returned.</p>
     * 
     * @param request the request parameters of UpdatePhoneWebhook  UpdatePhoneWebhookRequest
     * @return UpdatePhoneWebhookResponse
     */
    CompletableFuture<UpdatePhoneWebhookResponse> updatePhoneWebhook(UpdatePhoneWebhookRequest request);

}
