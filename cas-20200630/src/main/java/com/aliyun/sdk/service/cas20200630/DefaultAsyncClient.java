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
     * <p>Queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of AssignCertificateCount  AssignCertificateCountRequest
     * @return AssignCertificateCountResponse
     */
    @Override
    public CompletableFuture<AssignCertificateCountResponse> assignCertificateCount(AssignCertificateCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignCertificateCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignCertificateCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignCertificateCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateClientCertificate  CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    @Override
    public CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation as appropriate.</p>
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
     * <p>By default, the certificate subject is retrieved from the Certificate Signing Request (CSR). If you specify a certificate subject, the subject from the CSR is ignored and the specified subject is used to issue the certificate.
     * You must specify the key usage or extended key usage based on your scenario. The following examples show common scenarios:</p>
     * <ul>
     * <li>Server-side authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth</li>
     * <li>Client authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: clientAuth</li>
     * <li>mTLS mutual authentication certificate
     * Key usage: digitalSignature, keyEncipherment
     * Extended key usage: serverAuth, clientAuth</li>
     * <li>Email signing certificate
     * Key usage: digitalSignature, contentCommitment
     * Extended key usage: emailProtection
     * Note: Compliance CAs are managed by third-party authorities and do not support this operation.</li>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates an external subordinate CA certificate based on the provided certificate signing request (CSR) and optional pass parameter configurations through the API.</li>
     * <li><code>InstanceId</code> is required and specifies the instance ID of the external subordinate CA instance to activate.</li>
     * <li>The <code>Csr</code> field must contain a valid certificate signing request.</li>
     * <li>The <code>Validity</code> parameter defines the certificate validity period and supports both relative time and absolute time formats.</li>
     * <li>You can use <code>ApiPassthrough</code> to overwrite certain information in the CSR or add additional certificate extensions, such as Subject and Extensions.</li>
     * <li>Note: For EndEntity CA certificates, the Settings of <code>pathLenConstraint</code> should be 0.</li>
     * </ul>
     * 
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
     * <p>After a client or server certificate is revoked, the client or server where the certificate is installed cannot establish HTTPS connections with other devices.
     * After a client or server certificate is revoked, you can call <a href="https://help.aliyun.com/document_detail/465981.html">DeleteClientCertificate</a> to permanently delete the certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The limit on queries per second (QPS) for this operation is 10 per user. If you exceed this limit, API calls are throttled, which can affect your business. Plan your API calls accordingly.</p>
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
     * <p>This operation creates a self-signed root CA certificate. A root CA certificate is the starting point of a private trust chain within an enterprise. After you create a root CA certificate, you can use it to issue intermediate CA certificates. You can then use the intermediate CA certificates to issue client and server-side certificates.
     * Before calling this operation, purchase a private root CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificate Service console</a>. Otherwise, the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed the limit, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
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
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465975.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Only subordinate CA certificates can issue server certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
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
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue server certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
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
     * <p>This operation issues a subordinate CA certificate by using an existing root CA certificate. The subordinate CA certificate can be used to issue client and server certificates.
     * Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The China site (aliyun.com) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site (Chinese): The China site (Chinese) and China site.</p>
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
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465972.html">CreateRevokeClientCertificate</a> to revoke the client or server-side certificate.</p>
     * <h2>QPS limit</h2>
     * <p>This operation supports up to 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
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
     * <p>This operation queries the details of a root CA certificate or sub-CA certificate by using the unique identifier of the certificate. For example, you can query the serial number, subject information, and certificate content of a CA certificate.
     * Before you call this operation, you must have created a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and created a sub-CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
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
     * <p>This operation queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limit</h2>
     * <p>Each user is limited to 10 queries per second (QPS) for this API operation. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
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
     * <p>You can invoke this operation to query detailed information about all CA certificates (including root CA certificates and subordinate CA certificates) that you have created by using paging. The information includes the unique identifier, sequence number, subject information, and certificate content of each CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Invoke this operation appropriately.</p>
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
     * <p>This API applies only to certificates that are issued from a system-generated Certificate Signing Request (CSR). You can use this API to retrieve the encrypted private key of a client certificate or a server-side certificate. Before you call this API, you must have issued a client or server-side certificate by calling one of the following APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a>
     * To keep the private key secure during transmission, this API uses a password that you set to encrypt the private key. The API then returns the encrypted private key. After you retrieve the encrypted private key, you can decrypt it using one of the following methods:</li>
     * <li>If the certificate uses the RSA encryption algorithm, run the <code>openssl rsa -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the ECC encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://www.openssl.org/source/">OpenSSL</a> or <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.</li>
     * <li>If the certificate uses the SM2 encryption algorithm, run the <code>openssl ec -in &lt;encrypted_private_key_file&gt; -passin pass:&lt;private_key_password&gt; -out &lt;decrypted_private_key_file&gt;</code> command to decrypt the private key. You must run this command on a computer that has <a href="https://github.com/BabaSSL/BabaSSL">BabaSSL</a> installed.<blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/465985.html">DescribeClientCertificate</a> to query the encryption algorithm of the client or server-side certificate.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This API has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, your API calls are throttled. Throttling can affect your business. Plan your calls accordingly.</p>
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
     * <p>You can call this operation to query the details of a client certificate or a server-side certificate by its unique identifier. The details include the serial number, subject, content, and status of the certificate.
     * Before you call this operation, you must create a client certificate or a server-side certificate.
     * To create a client certificate by calling an API, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/465967.html">CreateClientCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465970.html">CreateClientCertificateWithCsr</a>
     * To create a server-side certificate by calling an API, see the following topics:</li>
     * <li><a href="https://help.aliyun.com/document_detail/465975.html">CreateServerCertificate</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465979.html">CreateServerCertificateWithCsr</a></li>
     * </ul>
     * <h2>Limits</h2>
     * <p>The queries per second (QPS) limit for this API call is 10 per user. If you exceed this limit, throttling is triggered, which may affect your business. Plan your calls accordingly.</p>
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
     * @deprecated OpenAPI DescribeClientCertificateForSerialNumber is deprecated, please use cas::2020-06-30::DescribeClientCertificate instead.  * @description # Description
     * This operation allows you to query the details of client certificates or server certificates in batch by certificate serial number. The details include the serial number, subject information, content, and status of the certificates.
     * Before you call this operation, you must have created client certificates or server certificates.
     * For information about how to call an API operation to create a client certificate, see:
     * - [CreateClientCertificate](https://help.aliyun.com/document_detail/330873.html)
     * - [CreateClientCertificateWithCsr](https://help.aliyun.com/document_detail/330875.html)
     * For information about how to call an API operation to create a server certificate, see:
     * - [CreateServerCertificate](https://help.aliyun.com/document_detail/330877.html)
     * - [CreateServerCertificateWithCsr](https://help.aliyun.com/document_detail/330878.html)
     * # QPS limit
     * The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as appropriate.
     * 
     * @param request the request parameters of DescribeClientCertificateForSerialNumber  DescribeClientCertificateForSerialNumberRequest
     * @return DescribeClientCertificateForSerialNumberResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClientCertificateForSerialNumberResponse> describeClientCertificateForSerialNumber(DescribeClientCertificateForSerialNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientCertificateForSerialNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientCertificateForSerialNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientCertificateForSerialNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the status of client certificates or server certificates in batches by their unique identifiers. For example, you can check whether a certificate has been revoked.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
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
     * <p>This operation allows you to query the status of client certificates or server certificates in batches by certificate serial number. For example, you can check whether a certificate has been revoked.</p>
     * <h2>QPS limit</h2>
     * <p>The China QPS limit for this operation is 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribeClientCertificateStatusForSerialNumber  DescribeClientCertificateStatusForSerialNumberRequest
     * @return DescribeClientCertificateStatusForSerialNumberResponse
     */
    @Override
    public CompletableFuture<DescribeClientCertificateStatusForSerialNumberResponse> describeClientCertificateStatusForSerialNumber(DescribeClientCertificateStatusForSerialNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientCertificateStatusForSerialNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientCertificateStatusForSerialNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientCertificateStatusForSerialNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the detailed information of all CA certificates (including root CA certificates and subordinate CA certificates) that you have created by using paging. The information includes the unique identifier, serial number, subject information, and certificate content of each CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this API is 10 invokes per second. If this limit is exceeded, the API invokes are throttled, which may affect your business. Invoke this API appropriately.</p>
     * 
     * @param request the request parameters of DescribePcaAndExternalCACertificateList  DescribePcaAndExternalCACertificateListRequest
     * @return DescribePcaAndExternalCACertificateListResponse
     */
    @Override
    public CompletableFuture<DescribePcaAndExternalCACertificateListResponse> describePcaAndExternalCACertificateList(DescribePcaAndExternalCACertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePcaAndExternalCACertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePcaAndExternalCACertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePcaAndExternalCACertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to query the status of a private CA instance by its ID. The status information includes the instance\&quot;s status, the total number of certificates it can issue, and the number of certificates already issued.
     * Before you call this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation at a reasonable rate.</p>
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
     * <b>description</b> :
     * <p>Queries the status information of a private CA instance that you purchased through the SSL Certificate Service console by using the ID of the private CA instance. For example, you can query the status of the CA instance, the number of certificates included, and the number of certificates issued.
     * Before you invoke this operation, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Digital Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Invoke this operation as needed.</p>
     * 
     * @param request the request parameters of GetCaInstanceCrlAddress  GetCaInstanceCrlAddressRequest
     * @return GetCaInstanceCrlAddressResponse
     */
    @Override
    public CompletableFuture<GetCaInstanceCrlAddressResponse> getCaInstanceCrlAddress(GetCaInstanceCrlAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCaInstanceCrlAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCaInstanceCrlAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCaInstanceCrlAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status of a private Certificate Authority (CA) instance by its ID. It returns details for a private CA instance that you purchased in the Certificate Management Service (CAS) console. These details include the instance status, the number of certificates it contains, and the number of issued certificates.
     * Before calling this operation, purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ListAllEndEntityInstance  ListAllEndEntityInstanceRequest
     * @return ListAllEndEntityInstanceResponse
     */
    @Override
    public CompletableFuture<ListAllEndEntityInstanceResponse> listAllEndEntityInstance(ListAllEndEntityInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAllEndEntityInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllEndEntityInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllEndEntityInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this API to query the operation logs for a Certificate Authority (CA) certificate. These logs record operations, such as certificate creation and status changes, for both root and subordinate CA certificates.
     * This API is limited to 10 queries per second (QPS) per user. API calls that exceed this limit are throttled. This can impact your business. Ensure that you call the API within this limit.</p>
     * 
     * @param request the request parameters of ListCACertificateLog  ListCACertificateLogRequest
     * @return ListCACertificateLogResponse
     */
    @Override
    public CompletableFuture<ListCACertificateLogResponse> listCACertificateLog(ListCACertificateLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCACertificateLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCACertificateLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCACertificateLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of certificates. If you want to query certificates by a specific intermediate CA and do not have the unique identifier of the CA certificate, call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> first and pass the returned Identifier as the ParentIdentifier parameter.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed.</p>
     * 
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
     * <p>This API performs a paged query to retrieve the details of all client and server-side certificates that you have created. These details include the unique identifier, serial number, subject information, content, and status of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
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
     * <b>description</b> :
     * <p>This operation lists CA certificates, including root and subordinate CA certificates.
     * This operation has a limit of 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
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
     * <p>Performs a paged query to retrieve the details of all revoked client and server-side certificates, such as the unique identifier, serial number, and revocation date.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this API at a reasonable rate.</p>
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
     * <p>Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.
     * You can call this operation up to 10 times per second per Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds this limit, throttling is triggered, which may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the status information of a private CA instance that you purchased in the Certificate Management Service (CAS) console. You can query by the private CA instance ID to retrieve information such as the status of the CA instance, the number of certificates it contains, and the number of issued certificates.
     * Before you call this operation, you must purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this operation within the specified limit.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    @Override
    public CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation adds tags to one or more resources. You can add tags to private CA instances that you purchased in the Certificate Management Service (CAS) console.
     * Before calling this operation, purchase a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries status information for a private Certificate Authority (CA) instance that you purchased in the Certificate Management Service (CAS) console. You can use the private CA instance ID to retrieve information such as the instance status, the number of certificates it contains, and the number of certificates issued.
     * Before you call this operation, you must purchase a private CA from the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you create a CA certificate, its status is ISSUE by default. You can call this API operation to change the status of a CA certificate from ISSUE to REVOKE. A CA certificate in the ISSUE state can be used to issue certificates. A CA certificate in the REVOKE state cannot be used to issue certificates, and all certificates issued by this CA certificate become invalid.
     * Before you call this API operation, create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and an intermediate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
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
     * <b>description</b> :
     * <p>When a Certificate Authority (CA) certificate is created, its status is Normal by default. You can call this API operation to change the status of a CA certificate to Revoked. A CA certificate in the Normal status can be used to issue certificates. A revoked CA certificate cannot be used to issue certificates, and all certificates previously issued by it become invalid.
     * Before you call this API operation, you must create a root CA certificate by calling <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> and a subordinate CA certificate by calling <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a>.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of UpdatePcaCertificate  UpdatePcaCertificateRequest
     * @return UpdatePcaCertificateResponse
     */
    @Override
    public CompletableFuture<UpdatePcaCertificateResponse> updatePcaCertificate(UpdatePcaCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePcaCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePcaCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePcaCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation uploads a PCA certificate to a certificate repository.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 calls per second for each user. If you exceed the limit, your API calls are throttled. Throttling may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
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
