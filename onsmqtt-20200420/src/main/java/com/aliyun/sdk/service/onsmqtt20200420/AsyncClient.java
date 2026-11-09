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
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the ActiveCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The ActiveCaCertificate operation only supports CA certificates that are registered on the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query the registered CA certificates under a specified instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ActiveCaCertificate  ActiveCaCertificateRequest
     * @return ActiveCaCertificateResponse
     */
    CompletableFuture<ActiveCaCertificateResponse> activeCaCertificate(ActiveCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the ActiveDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of MSMQ for MQTT. DingTalk group ID: 35228338.</li>
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
     * <ul>
     * <li>The request frequency limit for a single user is 100 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * <li>Each time you successfully call the <strong>ApplyToken</strong> API operation, it is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyToken  ApplyTokenRequest
     * @return ApplyTokenResponse
     */
    CompletableFuture<ApplyTokenResponse> applyToken(ApplyTokenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The QPS limit for the <strong>BatchQuerySessionByClientIds</strong> operation is 100. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
     * <li>You can query the online status of up to 10 client IDs each time you call the <strong>BatchQuerySessionByClientIds</strong> operation.</li>
     * <li>Each successful call to the <strong>BatchQuerySessionByClientIds</strong> operation is counted as one message TPS, which affects your billing. For billing details, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>Considering the performance impact, the <strong>BatchQuerySessionByClientIds</strong> operation uses an internal cache for queries, which may result in data inconsistency. For exact queries, use the <a href="https://help.aliyun.com/document_detail/2603924.html">QuerySessionByClientId</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchQuerySessionByClientIds  BatchQuerySessionByClientIdsRequest
     * @return BatchQuerySessionByClientIdsResponse
     */
    CompletableFuture<BatchQuerySessionByClientIdsResponse> batchQuerySessionByClientIds(BatchQuerySessionByClientIdsRequest request);

    /**
     * @param request the request parameters of CloseConnection  CloseConnectionRequest
     * @return CloseConnectionResponse
     */
    CompletableFuture<CloseConnectionResponse> closeConnection(CloseConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>CreateGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of CreateGroupId  CreateGroupIdRequest
     * @return CreateGroupIdResponse
     */
    CompletableFuture<CreateGroupIdResponse> createGroupId(CreateGroupIdRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional instances support the DeleteCaCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 requests per second. For special requirements, contact ApsaraMQ for MQTT technical support. DingTalk group ID: 35228338.</li>
     * <li>The DeleteCaCertificate operation only supports CA certificates that are already registered with the ApsaraMQ for MQTT server. You can invoke the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation to query registered CA certificates under a specific instance.</li>
     * <li>When you delete a specified CA certificate, all device certificates issued by this CA certificate and registered with the ApsaraMQ for MQTT server are also automatically deleted.</li>
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
     * <ul>
     * <li>Only Platinum&lt;props=&quot;china&quot;&gt; and Professional edition instances support the DeleteDeviceCertificate operation.</li>
     * <li>The request frequency limit for a single user is 500 calls per second. If you have special requirements, contact the technical support team of ApsaraMQ for MQTT. DingTalk group ID: 35228338.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDeviceCertificate  DeleteDeviceCertificateRequest
     * @return DeleteDeviceCertificateResponse
     */
    CompletableFuture<DeleteDeviceCertificateResponse> deleteDeviceCertificate(DeleteDeviceCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Each successful call to the <strong>DeleteGroupId</strong> operation is counted as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of DeleteGroupId  DeleteGroupIdRequest
     * @return DeleteGroupIdResponse
     */
    CompletableFuture<DeleteGroupIdResponse> deleteGroupId(DeleteGroupIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteWildcardByTopic  DeleteWildcardByTopicRequest
     * @return DeleteWildcardByTopicResponse
     */
    CompletableFuture<DeleteWildcardByTopicResponse> deleteWildcardByTopic(DeleteWildcardByTopicRequest request);

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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt; and Professional Edition instances support the InactivateCaCertificate operation.</li>
     * <li>The request rate for a single user is limited to 500 per second. If you have special requirements, contact ApsaraMQ for MQTT technical support. The DingTalk group number is 35228338.</li>
     * <li>You can call this operation only for CA certificates that are registered with ApsaraMQ for MQTT. To query the registered CA certificates for an instance, call the <a href="https://help.aliyun.com/document_detail/2604958.html">ListCaCertificate</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of InactivateCaCertificate  InactivateCaCertificateRequest
     * @return InactivateCaCertificateResponse
     */
    CompletableFuture<InactivateCaCertificateResponse> inactivateCaCertificate(InactivateCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Platinum Edition&lt;props=&quot;china&quot;&gt;and Professional Edition instances support the InactivateDeviceCertificate operation.</li>
     * <li>The request frequency for a single user is limited to 500 calls per second. For special requirements, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
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
     * <p>Each successful call to the <strong>ListGroupId</strong> operation is counted as one message transaction and is billed based on transactions per second (TPS). For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">billing details</a>.</p>
     * 
     * @param request the request parameters of ListGroupId  ListGroupIdRequest
     * @return ListGroupIdResponse
     */
    CompletableFuture<ListGroupIdResponse> listGroupId(ListGroupIdRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceDevice</strong> operation counts as one message TPS, which affects your billing. For more information about billing, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing</a>.</li>
     * <li>The queries per second (QPS) limit for a single user on this operation is 500. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">QPS limits</a>.</li>
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
     * <ul>
     * <li>Each successful call to the <strong>QueryMqttTraceMessageSubscribe</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</li>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryMqttTraceMessageSubscribe  QueryMqttTraceMessageSubscribeRequest
     * @return QueryMqttTraceMessageSubscribeResponse
     */
    CompletableFuture<QueryMqttTraceMessageSubscribeResponse> queryMqttTraceMessageSubscribe(QueryMqttTraceMessageSubscribeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation up to 500 times per second.\<em>\</em>\<em>\</em> For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <blockquote>
     * <p>Each successful call to the <strong>DeleteTopic</strong> operation counts as one message TPS, which affects your billing. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryWildcardByTopic  QueryWildcardByTopicRequest
     * @return QueryWildcardByTopicResponse
     */
    CompletableFuture<QueryWildcardByTopicResponse> queryWildcardByTopic(QueryWildcardByTopicRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</p>
     * <blockquote>
     * <p>Each successful call to the <strong>RefreshDeviceCredential</strong> operation increases the messaging transactions per second (TPS) by one. This affects the billing of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/52819.html">Billing rules</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RefreshDeviceCredential  RefreshDeviceCredentialRequest
     * @return RefreshDeviceCredentialResponse
     */
    CompletableFuture<RefreshDeviceCredentialResponse> refreshDeviceCredential(RefreshDeviceCredentialRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only ApsaraMQ for MQTT Enterprise Platinum Edition instances support this operation.</li>
     * <li>You can call this operation up to 500 times per second per Alibaba Cloud account. If you want to increase the limit, join the DingTalk group (ID: 35228338) to contact ApsaraMQ for MQTT technical support.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterCaCertificate  RegisterCaCertificateRequest
     * @return RegisterCaCertificateResponse
     */
    CompletableFuture<RegisterCaCertificateResponse> registerCaCertificate(RegisterCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
     * <ul>
     * <li>You can call this operation up to 500 times per second per account. If the limit is exceeded, throttling is triggered. This may affect your business. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/163047.html">Limits on QPS</a>.</li>
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
