// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.onsmqtt20200420.models.*;
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
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * <li>You can call this operation to reactivate only CA certificates that are registered with ApsaraMQ for MQTT brokers. You can call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query CA certificates that are registered with an ApsaraMQ for MQTT instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ActiveCaCertificate  ActiveCaCertificateRequest
     * @return ActiveCaCertificateResponse
     */
    CompletableFuture<ActiveCaCertificateResponse> activeCaCertificate(ActiveCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of ActiveDeviceCertificate  ActiveDeviceCertificateRequest
     * @return ActiveDeviceCertificateResponse
     */
    CompletableFuture<ActiveDeviceCertificateResponse> activeDeviceCertificate(ActiveDeviceCertificateRequest request);

    /**
     * @param request the request parameters of AddCustomAuthConnectBlack  AddCustomAuthConnectBlackRequest
     * @return AddCustomAuthConnectBlackResponse
     */
    CompletableFuture<AddCustomAuthConnectBlackResponse> addCustomAuthConnectBlack(AddCustomAuthConnectBlackRequest request);

    /**
     * @param request the request parameters of AddCustomAuthIdentity  AddCustomAuthIdentityRequest
     * @return AddCustomAuthIdentityResponse
     */
    CompletableFuture<AddCustomAuthIdentityResponse> addCustomAuthIdentity(AddCustomAuthIdentityRequest request);

    /**
     * @param request the request parameters of AddCustomAuthPermission  AddCustomAuthPermissionRequest
     * @return AddCustomAuthPermissionResponse
     */
    CompletableFuture<AddCustomAuthPermissionResponse> addCustomAuthPermission(AddCustomAuthPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>ApplyToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyToken  ApplyTokenRequest
     * @return ApplyTokenResponse
     */
    CompletableFuture<ApplyTokenResponse> applyToken(ApplyTokenRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>BatchQuerySessionByClientIds</strong> operation up to 100 times per second. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>You can call the <strong>BatchQuerySessionByClientIds</strong> operation to query the status of up to 10 ApsaraMQ for MQTT clients in a single query.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchQuerySessionByClientIds  BatchQuerySessionByClientIdsRequest
     * @return BatchQuerySessionByClientIdsResponse
     */
    CompletableFuture<BatchQuerySessionByClientIdsResponse> batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request);

    /**
     * <b>description</b> :
     * <p>This API is still in the testing phase and is only available for Professional Edition instances in the Shanghai region. Legacy instances are not supported at this time.</p>
     * 
     * @param request the request parameters of CloseConnection  CloseConnectionRequest
     * @return CloseConnectionResponse
     */
    CompletableFuture<CloseConnectionResponse> closeConnection(CloseConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * @param request the request parameters of CreateGroupId  CreateGroupIdRequest
     * @return CreateGroupIdResponse
     */
    CompletableFuture<CreateGroupIdResponse> createGroupId(CreateGroupIdRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * <li>You can call this operation to delete only CA certificates that are registered with ApsaraMQ for MQTT brokers. You can call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query CA certificates that are registered with an ApsaraMQ for MQTT instance.</li>
     * <li>If you delete a specific CA certificate from an ApsaraMQ for MQTT broker, all device certificates that are issued by the CA certificate and are registered with the ApsaraMQ for MQTT broker are automatically deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCaCertificate  DeleteCaCertificateRequest
     * @return DeleteCaCertificateResponse
     */
    CompletableFuture<DeleteCaCertificateResponse> deleteCaCertificate(DeleteCaCertificateRequest request);

    /**
     * @param request the request parameters of DeleteCustomAuthConnectBlack  DeleteCustomAuthConnectBlackRequest
     * @return DeleteCustomAuthConnectBlackResponse
     */
    CompletableFuture<DeleteCustomAuthConnectBlackResponse> deleteCustomAuthConnectBlack(DeleteCustomAuthConnectBlackRequest request);

    /**
     * @param request the request parameters of DeleteCustomAuthIdentity  DeleteCustomAuthIdentityRequest
     * @return DeleteCustomAuthIdentityResponse
     */
    CompletableFuture<DeleteCustomAuthIdentityResponse> deleteCustomAuthIdentity(DeleteCustomAuthIdentityRequest request);

    /**
     * @param request the request parameters of DeleteCustomAuthPermission  DeleteCustomAuthPermissionRequest
     * @return DeleteCustomAuthPermissionResponse
     */
    CompletableFuture<DeleteCustomAuthPermissionResponse> deleteCustomAuthPermission(DeleteCustomAuthPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDeviceCertificate  DeleteDeviceCertificateRequest
     * @return DeleteDeviceCertificateResponse
     */
    CompletableFuture<DeleteDeviceCertificateResponse> deleteDeviceCertificate(DeleteDeviceCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * @param request the request parameters of DeleteGroupId  DeleteGroupIdRequest
     * @return DeleteGroupIdResponse
     */
    CompletableFuture<DeleteGroupIdResponse> deleteGroupId(DeleteGroupIdRequest request);

    /**
     * @param request the request parameters of DisasterDowngrade  DisasterDowngradeRequest
     * @return DisasterDowngradeResponse
     */
    CompletableFuture<DisasterDowngradeResponse> disasterDowngrade(DisasterDowngradeRequest request);

    /**
     * @param request the request parameters of DisasterRecovery  DisasterRecoveryRequest
     * @return DisasterRecoveryResponse
     */
    CompletableFuture<DisasterRecoveryResponse> disasterRecovery(DisasterRecoveryRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of GetCaCertificate  GetCaCertificateRequest
     * @return GetCaCertificateResponse
     */
    CompletableFuture<GetCaCertificateResponse> getCaCertificate(GetCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeviceCertificate  GetDeviceCertificateRequest
     * @return GetDeviceCertificateResponse
     */
    CompletableFuture<GetDeviceCertificateResponse> getDeviceCertificate(GetDeviceCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>GetDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeviceCredential  GetDeviceCredentialRequest
     * @return GetDeviceCredentialResponse
     */
    CompletableFuture<GetDeviceCredentialResponse> getDeviceCredential(GetDeviceCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of GetRegisterCode  GetRegisterCodeRequest
     * @return GetRegisterCodeResponse
     */
    CompletableFuture<GetRegisterCodeResponse> getRegisterCode(GetRegisterCodeRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * <li>You can call this operation to deregister only CA certificates that are registered with ApsaraMQ for MQTT brokers. You can call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query CA certificates that are registered with an ApsaraMQ for MQTT instance.</li>
     * </ul>
     * 
     * @param request the request parameters of InactivateCaCertificate  InactivateCaCertificateRequest
     * @return InactivateCaCertificateResponse
     */
    CompletableFuture<InactivateCaCertificateResponse> inactivateCaCertificate(InactivateCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of InactivateDeviceCertificate  InactivateDeviceCertificateRequest
     * @return InactivateDeviceCertificateResponse
     */
    CompletableFuture<InactivateDeviceCertificateResponse> inactivateDeviceCertificate(InactivateDeviceCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of ListCaCertificate  ListCaCertificateRequest
     * @return ListCaCertificateResponse
     */
    CompletableFuture<ListCaCertificateResponse> listCaCertificate(ListCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDeviceCertificate  ListDeviceCertificateRequest
     * @return ListDeviceCertificateResponse
     */
    CompletableFuture<ListDeviceCertificateResponse> listDeviceCertificate(ListDeviceCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDeviceCertificateByCaSn  ListDeviceCertificateByCaSnRequest
     * @return ListDeviceCertificateByCaSnResponse
     */
    CompletableFuture<ListDeviceCertificateByCaSnResponse> listDeviceCertificateByCaSn(ListDeviceCertificateByCaSnRequest request);

    /**
     * @param request the request parameters of ListDeviceCredentialClientId  ListDeviceCredentialClientIdRequest
     * @return ListDeviceCredentialClientIdResponse
     */
    CompletableFuture<ListDeviceCredentialClientIdResponse> listDeviceCredentialClientId(ListDeviceCredentialClientIdRequest request);

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>ListGroupId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * 
     * @param request the request parameters of ListGroupId  ListGroupIdRequest
     * @return ListGroupIdResponse
     */
    CompletableFuture<ListGroupIdResponse> listGroupId(ListGroupIdRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of QueryCustomAuthConnectBlack  QueryCustomAuthConnectBlackRequest
     * @return QueryCustomAuthConnectBlackResponse
     */
    CompletableFuture<QueryCustomAuthConnectBlackResponse> queryCustomAuthConnectBlack(QueryCustomAuthConnectBlackRequest request);

    /**
     * @param request the request parameters of QueryCustomAuthIdentity  QueryCustomAuthIdentityRequest
     * @return QueryCustomAuthIdentityResponse
     */
    CompletableFuture<QueryCustomAuthIdentityResponse> queryCustomAuthIdentity(QueryCustomAuthIdentityRequest request);

    /**
     * @param request the request parameters of QueryCustomAuthPermission  QueryCustomAuthPermissionRequest
     * @return QueryCustomAuthPermissionResponse
     */
    CompletableFuture<QueryCustomAuthPermissionResponse> queryCustomAuthPermission(QueryCustomAuthPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceDevice</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryMqttTraceDevice  QueryMqttTraceDeviceRequest
     * @return QueryMqttTraceDeviceResponse
     */
    CompletableFuture<QueryMqttTraceDeviceResponse> queryMqttTraceDevice(QueryMqttTraceDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageOfClient</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryMqttTraceMessageOfClient  QueryMqttTraceMessageOfClientRequest
     * @return QueryMqttTraceMessageOfClientResponse
     */
    CompletableFuture<QueryMqttTraceMessageOfClientResponse> queryMqttTraceMessageOfClient(QueryMqttTraceMessageOfClientRequest request);

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessagePublish</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryMqttTraceMessagePublish  QueryMqttTraceMessagePublishRequest
     * @return QueryMqttTraceMessagePublishResponse
     */
    CompletableFuture<QueryMqttTraceMessagePublishResponse> queryMqttTraceMessagePublish(QueryMqttTraceMessagePublishRequest request);

    /**
     * <b>description</b> :
     * <p>  Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryMqttTraceMessageSubscribe  QueryMqttTraceMessageSubscribeRequest
     * @return QueryMqttTraceMessageSubscribeResponse
     */
    CompletableFuture<QueryMqttTraceMessageSubscribeResponse> queryMqttTraceMessageSubscribe(QueryMqttTraceMessageSubscribeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second.**** For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>QuerySessionByClientId</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySessionByClientId  QuerySessionByClientIdRequest
     * @return QuerySessionByClientIdResponse
     */
    CompletableFuture<QuerySessionByClientIdResponse> querySessionByClientId(QuerySessionByClientIdRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>QueryToken</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryToken  QueryTokenRequest
     * @return QueryTokenResponse
     */
    CompletableFuture<QueryTokenResponse> queryToken(QueryTokenRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <blockquote>
     * <p> Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RefreshDeviceCredential  RefreshDeviceCredentialRequest
     * @return RefreshDeviceCredentialResponse
     */
    CompletableFuture<RefreshDeviceCredentialResponse> refreshDeviceCredential(RefreshDeviceCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>  Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</p>
     * <ul>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterCaCertificate  RegisterCaCertificateRequest
     * @return RegisterCaCertificateResponse
     */
    CompletableFuture<RegisterCaCertificateResponse> registerCaCertificate(RegisterCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>RegisterDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterDeviceCredential  RegisterDeviceCredentialRequest
     * @return RegisterDeviceCredentialResponse
     */
    CompletableFuture<RegisterDeviceCredentialResponse> registerDeviceCredential(RegisterDeviceCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5 times per second per account. If you want to increase the limit, join the DingTalk group 35228338 to contact ApsaraMQ for MQTT technical support.</p>
     * <ul>
     * <li>Each successful call to the <strong>RevokeToken</strong> operation increases the messaging transactions per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeToken  RevokeTokenRequest
     * @return RevokeTokenResponse
     */
    CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request);

    /**
     * <b>description</b> :
     * <p>  The <strong>SendMessage</strong> operation is called by an application on a cloud server. This operation is complementary to the operation that is called to send a message from an ApsaraMQ for MQTT client. For information about the differences between the scenarios of sending messages from applications on cloud servers and the scenarios of sending messages from ApsaraMQ for MQTT clients, see <a href="https://help.aliyun.com/document_detail/179160.html">Developer guide</a>.</p>
     * <ul>
     * <li>Messages that are sent by calling the <strong>SendMessage</strong> operation cannot be forwarded to ApsaraMQ for RocketMQ. If you want to use an ApsaraMQ for MQTT broker to forward messages to ApsaraMQ for RocketMQ, use <a href="https://help.aliyun.com/document_detail/174527.html">an SDK to send the messages</a>. The <strong>SendMessage</strong> operation supports up to 1,000 queries per second (QPS). For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>Each successful call to the <strong>SendMessage</strong> operation is calculated as a message transaction per second (TPS). This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    /**
     * @param request the request parameters of SetSniConfig  SetSniConfigRequest
     * @return SetSniConfigResponse
     */
    CompletableFuture<SetSniConfigResponse> setSniConfig(SetSniConfigRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <ul>
     * <li>Each successful call to the <strong>UnRegisterDeviceCredential</strong> operation increases the number of transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UnRegisterDeviceCredential  UnRegisterDeviceCredentialRequest
     * @return UnRegisterDeviceCredentialResponse
     */
    CompletableFuture<UnRegisterDeviceCredentialResponse> unRegisterDeviceCredential(UnRegisterDeviceCredentialRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCustomAuthIdentity  UpdateCustomAuthIdentityRequest
     * @return UpdateCustomAuthIdentityResponse
     */
    CompletableFuture<UpdateCustomAuthIdentityResponse> updateCustomAuthIdentity(UpdateCustomAuthIdentityRequest request);

    /**
     * @param request the request parameters of UpdateCustomAuthPermission  UpdateCustomAuthPermissionRequest
     * @return UpdateCustomAuthPermissionResponse
     */
    CompletableFuture<UpdateCustomAuthPermissionResponse> updateCustomAuthPermission(UpdateCustomAuthPermissionRequest request);

}
