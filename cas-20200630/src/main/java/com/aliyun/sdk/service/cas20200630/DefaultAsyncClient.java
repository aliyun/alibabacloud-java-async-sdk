// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cas20200630.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "cas";
        this.version = "2020-06-30";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "cas.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cas.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cas.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cas.aliyuncs.com"),
            new TeaPair("cn-fujian", "cas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cas.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cas.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "cas.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cas.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cas.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "cas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cas.aliyuncs.com"),
            new TeaPair("eu-west-1", "cas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cas.aliyuncs.com"),
            new TeaPair("us-east-1", "cas.aliyuncs.com"),
            new TeaPair("us-west-1", "cas.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="~~CreateRootCACertificate~~">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="~~CreateRootCACertificate~~">CreateSubCACertificate</a> operation. Only intermediate CA certificates can issue client certificates.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateClientCertificate  CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    @Override
    public CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue client certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateClientCertificateWithCsr  CreateClientCertificateWithCsrRequest
     * @return CreateClientCertificateWithCsrResponse
     */
    @Override
    public CompletableFuture<CreateClientCertificateWithCsrResponse> createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientCertificateWithCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientCertificateWithCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientCertificateWithCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, the name of the entity is obtained from the certificate signing request (CSR) of the certificate that you want to issue. If you specify a different name for the entity, the name of the entity in the CSR becomes invalid. The specified name is used to issue the certificate.
     * You must specify the key usage and extended key usage based on the certificate type. The following list describes common certificate types:</p>
     * <ul>
     * <li>Server certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>Mutual Transport Layer Security (TLS) authentication certificate
     * Key usage: digitalSignature or keyEncipherment
     * Extended key usage: serverAuth or clientAuth</li>
     * <li>Email certificate
     * Key usage: digitalSignature or contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliant certificate authorities (CAs) are managed by third-party authorities. This operation is not supported for compliant CAs.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomCertificate  CreateCustomCertificateRequest
     * @return CreateCustomCertificateResponse
     */
    @Override
    public CompletableFuture<CreateCustomCertificateResponse> createCustomCertificate(CreateCustomCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExternalCACertificate  CreateExternalCACertificateRequest
     * @return CreateExternalCACertificateResponse
     */
    @Override
    public CompletableFuture<CreateExternalCACertificateResponse> createExternalCACertificate(CreateExternalCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExternalCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After a client certificate or a server certificate is revoked, the client or the server on which the certificate is installed cannot establish HTTPS connections with other devices.
     * After a client certificate or a server certificate is revoked, you can call the <a href="https://help.aliyun.com/document_detail/330880.html">DeleteClientCertificate</a> operation to permanently delete the certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRevokeClientCertificate  CreateRevokeClientCertificateRequest
     * @return CreateRevokeClientCertificateResponse
     */
    @Override
    public CompletableFuture<CreateRevokeClientCertificateResponse> createRevokeClientCertificate(CreateRevokeClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRevokeClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRevokeClientCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRevokeClientCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateRootCACertificate operation to create a self-signed root CA certificate. A root CA certificate is the trust anchor in a chain of trust for private certificates that are used within an enterprise. You must create a root CA certificate before you can use the root CA certificate to issue intermediate CA certificates. Then, you can use the intermediate CA certificates to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have purchased a private root CA instance by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRootCACertificate  CreateRootCACertificateRequest
     * @return CreateRootCACertificateResponse
     */
    @Override
    public CompletableFuture<CreateRootCACertificateResponse> createRootCACertificate(CreateRootCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRootCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRootCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRootCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateServerCertificate  CreateServerCertificateRequest
     * @return CreateServerCertificateResponse
     */
    @Override
    public CompletableFuture<CreateServerCertificateResponse> createServerCertificate(CreateServerCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServerCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServerCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServerCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * 
     * @param request the request parameters of CreateServerCertificateWithCsr  CreateServerCertificateWithCsrRequest
     * @return CreateServerCertificateWithCsrResponse
     */
    @Override
    public CompletableFuture<CreateServerCertificateWithCsrResponse> createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServerCertificateWithCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServerCertificateWithCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServerCertificateWithCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to issue an intermediate certificate authority (CA) certificate by using an existing root CA certificate. Intermediate CA certificates can be used to issue client certificates and server certificates.
     * Before you call this operation, make sure that you have issued a root CA certificate by calling the [CreateRootCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateSubCACertificate  CreateSubCACertificateRequest
     * @return CreateSubCACertificateResponse
     */
    @Override
    public CompletableFuture<CreateSubCACertificateResponse> createSubCACertificate(CreateSubCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSubCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/330876.html">CreateRevokeClientCertificate</a> operation to revoke a client certificate or a server certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteClientCertificate  DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteClientCertificateResponse> deleteClientCertificate(DeleteClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificate operation to query the details about a root CA certificate or an intermediate CA certificate by using the unique identifier of the root CA certificate or intermediate CA certificate. The details include the serial number, user information, and content of a CA certificate.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCACertificate  DescribeCACertificateRequest
     * @return DescribeCACertificateResponse
     */
    @Override
    public CompletableFuture<DescribeCACertificateResponse> describeCACertificate(DescribeCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificateCount operation to query the number of created CA certificates, which includes root CA certificates and intermediate CA certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCACertificateCount  DescribeCACertificateCountRequest
     * @return DescribeCACertificateCountResponse
     */
    @Override
    public CompletableFuture<DescribeCACertificateCountResponse> describeCACertificateCount(DescribeCACertificateCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCACertificateCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCACertificateCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCACertificateCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificateList operation to perform a paged query of the details about all CA certificates that you create. The details include the unique identifier, serial number, user information, and content of each root CA certificate or intermediate CA certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCACertificateList  DescribeCACertificateListRequest
     * @return DescribeCACertificateListResponse
     */
    @Override
    public CompletableFuture<DescribeCACertificateListResponse> describeCACertificateList(DescribeCACertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCACertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCACertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCACertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the DescribeCertificatePrivateKey operation to obtain the encrypted private key of a client certificate or a server certificate. The certificate is issued based on a system-generated certificate signing request (CSR). Before you call this operation, make sure that you have issued a client certificate or a server certificate by calling the following operation:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a>
     * To ensure the security of private key transmission, the DescribeCertificatePrivateKey operation encrypts the private key by using the private key password that you specify and returns the encrypted private key. The private key password is a string that is used to encrypt the private key. After you obtain the encrypted private key of the certificate, you can use the following methods to decrypt the private key:</li>
     * <li>If the encryption algorithm of the certificate is RSA, you must run the <code>openssl rsa -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is ECC, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.</li>
     * <li>If the encryption algorithm of the certificate is SM2, you must run the <code>openssl ec -in &lt;Encrypted private key file&gt; -passin pass:&lt;Private key password&gt; -out &lt;Decrypted private key file&gt;</code> command in the computer on which <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> is installed.<blockquote>
     * <p> You can call the [DescribeClientCertificate] operation to query the encryption algorithm type of a client certificate or a server certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCertificatePrivateKey  DescribeCertificatePrivateKeyRequest
     * @return DescribeCertificatePrivateKeyResponse
     */
    @Override
    public CompletableFuture<DescribeCertificatePrivateKeyResponse> describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCertificatePrivateKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCertificatePrivateKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCertificatePrivateKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeClientCertificate operation to query the details about a client certificate or a server certificate by using the unique identifier of the certificate. The details include the serial number, user information, content, and status of each certificate.
     * Before you call this operation, make sure that you have created a client certificate or a server certificate.
     * For more information about how to call an operation to create a client certificate, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/330873.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330875.html">CreateClientCertificateWithCsr</a>
     * For more information about how to call an operation to create a server certificate, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/330877.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/330878.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeClientCertificate  DescribeClientCertificateRequest
     * @return DescribeClientCertificateResponse
     */
    @Override
    public CompletableFuture<DescribeClientCertificateResponse> describeClientCertificate(DescribeClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeClientCertificateStatus operation to query the status information about multiple client certificates or server certificates at a time by using the unique identifiers of the certificates. For example, you can check whether a certificate is revoked.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeClientCertificateStatus  DescribeClientCertificateStatusRequest
     * @return DescribeClientCertificateStatusResponse
     */
    @Override
    public CompletableFuture<DescribeClientCertificateStatusResponse> describeClientCertificateStatus(DescribeClientCertificateStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientCertificateStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientCertificateStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientCertificateStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the GetCAInstanceStatus operation to query the status information of a private CA instance by using the ID of the instance. The instance is purchased by using the SSL Certificates Service console. The status information includes the status of the private CA instance, the number of certificates that can be issued by using the private CA instance, and the number of issued certificates.
     * Before you call this operation, make sure that you have purchased a private CA by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * 
     * @param request the request parameters of GetCAInstanceStatus  GetCAInstanceStatusRequest
     * @return GetCAInstanceStatusResponse
     */
    @Override
    public CompletableFuture<GetCAInstanceStatusResponse> getCAInstanceStatus(GetCAInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCAInstanceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCAInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCAInstanceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCert  ListCertRequest
     * @return ListCertResponse
     */
    @Override
    public CompletableFuture<ListCertResponse> listCert(ListCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListClientCertificate operation to perform a paged query of the details about all client certificates and server certificates that you create. The details include the unique identifier, serial number, user information, content, and status of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListClientCertificate  ListClientCertificateRequest
     * @return ListClientCertificateResponse
     */
    @Override
    public CompletableFuture<ListClientCertificateResponse> listClientCertificate(ListClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPcaCaCertificate  ListPcaCaCertificateRequest
     * @return ListPcaCaCertificateResponse
     */
    @Override
    public CompletableFuture<ListPcaCaCertificateResponse> listPcaCaCertificate(ListPcaCaCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPcaCaCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPcaCaCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPcaCaCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListRevokeCertificate operation to perform a paged query of the details about all revoked client certificates and server certificates. The details include the unique identifier, serial number, and revocation date of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListRevokeCertificate  ListRevokeCertificateRequest
     * @return ListRevokeCertificateResponse
     */
    @Override
    public CompletableFuture<ListRevokeCertificateResponse> listRevokeCertificate(ListRevokeCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRevokeCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRevokeCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRevokeCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After a CA certificate is created, the CA certificate is in the ISSUE state by default. You can call the UpdateCACertificateStatus operation to change the status of a CA certificate from ISSUE to REVOKE. If a CA certificate is in the ISSUE state, the CA certificate can be used to issue certificates. If a CA certificate is in the REVOKE state, the CA certificate cannot be used to issue certificates, and the certificates that are issued from the CA certificate become invalid.
     * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCACertificateStatus  UpdateCACertificateStatusRequest
     * @return UpdateCACertificateStatusResponse
     */
    @Override
    public CompletableFuture<UpdateCACertificateStatusResponse> updateCACertificateStatus(UpdateCACertificateStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCACertificateStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCACertificateStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCACertificateStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadPcaCertToCas  UploadPcaCertToCasRequest
     * @return UploadPcaCertToCasResponse
     */
    @Override
    public CompletableFuture<UploadPcaCertToCasResponse> uploadPcaCertToCas(UploadPcaCertToCasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadPcaCertToCas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadPcaCertToCasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadPcaCertToCasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
