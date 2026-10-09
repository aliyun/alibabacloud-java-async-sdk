// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cas20200630.models.*;
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
     * <p>Queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of AssignCertificateCount  AssignCertificateCountRequest
     * @return AssignCertificateCountResponse
     */
    CompletableFuture<AssignCertificateCountResponse> assignCertificateCount(AssignCertificateCountRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateClientCertificate  CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue client certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of CreateClientCertificateWithCsr  CreateClientCertificateWithCsrRequest
     * @return CreateClientCertificateWithCsrResponse
     */
    CompletableFuture<CreateClientCertificateWithCsrResponse> createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request);

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
    CompletableFuture<CreateCustomCertificateResponse> createCustomCertificate(CreateCustomCertificateRequest request);

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
    CompletableFuture<CreateExternalCACertificateResponse> createExternalCACertificate(CreateExternalCACertificateRequest request);

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
    CompletableFuture<CreateRevokeClientCertificateResponse> createRevokeClientCertificate(CreateRevokeClientCertificateRequest request);

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
    CompletableFuture<CreateRootCACertificateResponse> createRootCACertificate(CreateRootCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465975.html">CreateSubCACertificate</a> to create a subordinate CA certificate. Only subordinate CA certificates can issue server certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateServerCertificate  CreateServerCertificateRequest
     * @return CreateServerCertificateResponse
     */
    CompletableFuture<CreateServerCertificateResponse> createServerCertificate(CreateServerCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub-CA certificate. Only sub-CA certificates can issue server certificates.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateServerCertificateWithCsr  CreateServerCertificateWithCsrRequest
     * @return CreateServerCertificateWithCsrResponse
     */
    CompletableFuture<CreateServerCertificateWithCsrResponse> createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request);

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
    CompletableFuture<CreateSubCACertificateResponse> createSubCACertificate(CreateSubCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/465972.html">CreateRevokeClientCertificate</a> to revoke the client or server-side certificate.</p>
     * <h2>QPS limit</h2>
     * <p>This operation supports up to 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DeleteClientCertificate  DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    CompletableFuture<DeleteClientCertificateResponse> deleteClientCertificate(DeleteClientCertificateRequest request);

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
    CompletableFuture<DescribeCACertificateResponse> describeCACertificate(DescribeCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the number of CA certificates that you have created, including root CA certificates and subordinate CA certificates.</p>
     * <h2>QPS limit</h2>
     * <p>Each user is limited to 10 queries per second (QPS) for this API operation. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeCACertificateCount  DescribeCACertificateCountRequest
     * @return DescribeCACertificateCountResponse
     */
    CompletableFuture<DescribeCACertificateCountResponse> describeCACertificateCount(DescribeCACertificateCountRequest request);

    /**
     * <b>description</b> :
     * <p>You can invoke this operation to query detailed information about all CA certificates (including root CA certificates and subordinate CA certificates) that you have created by using paging. The information includes the unique identifier, sequence number, subject information, and certificate content of each CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Invoke this operation appropriately.</p>
     * 
     * @param request the request parameters of DescribeCACertificateList  DescribeCACertificateListRequest
     * @return DescribeCACertificateListResponse
     */
    CompletableFuture<DescribeCACertificateListResponse> describeCACertificateList(DescribeCACertificateListRequest request);

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
    CompletableFuture<DescribeCertificatePrivateKeyResponse> describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request);

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
    CompletableFuture<DescribeClientCertificateResponse> describeClientCertificate(DescribeClientCertificateRequest request);

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
    CompletableFuture<DescribeClientCertificateForSerialNumberResponse> describeClientCertificateForSerialNumber(DescribeClientCertificateForSerialNumberRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the status of client certificates or server certificates in batches by their unique identifiers. For example, you can check whether a certificate has been revoked.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of DescribeClientCertificateStatus  DescribeClientCertificateStatusRequest
     * @return DescribeClientCertificateStatusResponse
     */
    CompletableFuture<DescribeClientCertificateStatusResponse> describeClientCertificateStatus(DescribeClientCertificateStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the status of client certificates or server certificates in batches by certificate serial number. For example, you can check whether a certificate has been revoked.</p>
     * <h2>QPS limit</h2>
     * <p>The China QPS limit for this operation is 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribeClientCertificateStatusForSerialNumber  DescribeClientCertificateStatusForSerialNumberRequest
     * @return DescribeClientCertificateStatusForSerialNumberResponse
     */
    CompletableFuture<DescribeClientCertificateStatusForSerialNumberResponse> describeClientCertificateStatusForSerialNumber(DescribeClientCertificateStatusForSerialNumberRequest request);

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the detailed information of all CA certificates (including root CA certificates and subordinate CA certificates) that you have created by using paging. The information includes the unique identifier, serial number, subject information, and certificate content of each CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this API is 10 invokes per second. If this limit is exceeded, the API invokes are throttled, which may affect your business. Invoke this API appropriately.</p>
     * 
     * @param request the request parameters of DescribePcaAndExternalCACertificateList  DescribePcaAndExternalCACertificateListRequest
     * @return DescribePcaAndExternalCACertificateListResponse
     */
    CompletableFuture<DescribePcaAndExternalCACertificateListResponse> describePcaAndExternalCACertificateList(DescribePcaAndExternalCACertificateListRequest request);

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
    CompletableFuture<GetCAInstanceStatusResponse> getCAInstanceStatus(GetCAInstanceStatusRequest request);

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
    CompletableFuture<GetCaInstanceCrlAddressResponse> getCaInstanceCrlAddress(GetCaInstanceCrlAddressRequest request);

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
    CompletableFuture<ListAllEndEntityInstanceResponse> listAllEndEntityInstance(ListAllEndEntityInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API to query the operation logs for a Certificate Authority (CA) certificate. These logs record operations, such as certificate creation and status changes, for both root and subordinate CA certificates.
     * This API is limited to 10 queries per second (QPS) per user. API calls that exceed this limit are throttled. This can impact your business. Ensure that you call the API within this limit.</p>
     * 
     * @param request the request parameters of ListCACertificateLog  ListCACertificateLogRequest
     * @return ListCACertificateLogResponse
     */
    CompletableFuture<ListCACertificateLogResponse> listCACertificateLog(ListCACertificateLogRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of certificates. If you want to query certificates by a specific intermediate CA and do not have the unique identifier of the CA certificate, call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> first and pass the returned Identifier as the ParentIdentifier parameter.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of ListCert  ListCertRequest
     * @return ListCertResponse
     */
    CompletableFuture<ListCertResponse> listCert(ListCertRequest request);

    /**
     * <b>description</b> :
     * <p>This API performs a paged query to retrieve the details of all client and server-side certificates that you have created. These details include the unique identifier, serial number, subject information, content, and status of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListClientCertificate  ListClientCertificateRequest
     * @return ListClientCertificateResponse
     */
    CompletableFuture<ListClientCertificateResponse> listClientCertificate(ListClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation lists CA certificates, including root and subordinate CA certificates.
     * This operation has a limit of 10 queries per second (QPS) for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListPcaCaCertificate  ListPcaCaCertificateRequest
     * @return ListPcaCaCertificateResponse
     */
    CompletableFuture<ListPcaCaCertificateResponse> listPcaCaCertificate(ListPcaCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve the details of all revoked client and server-side certificates, such as the unique identifier, serial number, and revocation date.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListRevokeCertificate  ListRevokeCertificateRequest
     * @return ListRevokeCertificateResponse
     */
    CompletableFuture<ListRevokeCertificateResponse> listRevokeCertificate(ListRevokeCertificateRequest request);

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
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

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
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

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
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

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
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

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
    CompletableFuture<UpdateCACertificateStatusResponse> updateCACertificateStatus(UpdateCACertificateStatusRequest request);

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
    CompletableFuture<UpdatePcaCertificateResponse> updatePcaCertificate(UpdatePcaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation uploads a PCA certificate to a certificate repository.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 calls per second for each user. If you exceed the limit, your API calls are throttled. Throttling may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of UploadPcaCertToCas  UploadPcaCertToCasRequest
     * @return UploadPcaCertToCasResponse
     */
    CompletableFuture<UploadPcaCertToCasResponse> uploadPcaCertToCas(UploadPcaCertToCasRequest request);

}
