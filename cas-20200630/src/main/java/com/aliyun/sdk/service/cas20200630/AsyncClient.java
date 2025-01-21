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
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="~~CreateRootCACertificate~~">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="~~CreateRootCACertificate~~">CreateSubCACertificate</a> operation. Only intermediate CA certificates can issue client certificates.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateClientCertificate  CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue client certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateClientCertificateWithCsr  CreateClientCertificateWithCsrRequest
     * @return CreateClientCertificateWithCsrResponse
     */
    CompletableFuture<CreateClientCertificateWithCsrResponse> createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request);

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
    CompletableFuture<CreateCustomCertificateResponse> createCustomCertificate(CreateCustomCertificateRequest request);

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
    CompletableFuture<CreateRevokeClientCertificateResponse> createRevokeClientCertificate(CreateRevokeClientCertificateRequest request);

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
    CompletableFuture<CreateRootCACertificateResponse> createRootCACertificate(CreateRootCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateServerCertificate  CreateServerCertificateRequest
     * @return CreateServerCertificateResponse
     */
    CompletableFuture<CreateServerCertificateResponse> createServerCertificate(CreateServerCertificateRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the <a href="https://help.aliyun.com/document_detail/328093.html">CreateRootCACertificate</a> operation and an intermediate CA certificate by calling the <a href="https://help.aliyun.com/document_detail/328094.html">CreateSubCACertificate</a> operation. Only intermediate CA certificates can be used to issue server certificates.</p>
     * 
     * @param request the request parameters of CreateServerCertificateWithCsr  CreateServerCertificateWithCsrRequest
     * @return CreateServerCertificateWithCsrResponse
     */
    CompletableFuture<CreateServerCertificateWithCsrResponse> createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request);

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
    CompletableFuture<CreateSubCACertificateResponse> createSubCACertificate(CreateSubCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/330876.html">CreateRevokeClientCertificate</a> operation to revoke a client certificate or a server certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteClientCertificate  DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    CompletableFuture<DeleteClientCertificateResponse> deleteClientCertificate(DeleteClientCertificateRequest request);

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
    CompletableFuture<DescribeCACertificateResponse> describeCACertificate(DescribeCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificateCount operation to query the number of created CA certificates, which includes root CA certificates and intermediate CA certificates.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCACertificateCount  DescribeCACertificateCountRequest
     * @return DescribeCACertificateCountResponse
     */
    CompletableFuture<DescribeCACertificateCountResponse> describeCACertificateCount(DescribeCACertificateCountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCACertificateList operation to perform a paged query of the details about all CA certificates that you create. The details include the unique identifier, serial number, user information, and content of each root CA certificate or intermediate CA certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCACertificateList  DescribeCACertificateListRequest
     * @return DescribeCACertificateListResponse
     */
    CompletableFuture<DescribeCACertificateListResponse> describeCACertificateList(DescribeCACertificateListRequest request);

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
    CompletableFuture<DescribeCertificatePrivateKeyResponse> describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request);

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
    CompletableFuture<DescribeClientCertificateResponse> describeClientCertificate(DescribeClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeClientCertificateStatus operation to query the status information about multiple client certificates or server certificates at a time by using the unique identifiers of the certificates. For example, you can check whether a certificate is revoked.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeClientCertificateStatus  DescribeClientCertificateStatusRequest
     * @return DescribeClientCertificateStatusResponse
     */
    CompletableFuture<DescribeClientCertificateStatusResponse> describeClientCertificateStatus(DescribeClientCertificateStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call the GetCAInstanceStatus operation to query the status information of a private CA instance by using the ID of the instance. The instance is purchased by using the SSL Certificates Service console. The status information includes the status of the private CA instance, the number of certificates that can be issued by using the private CA instance, and the number of issued certificates.
     * Before you call this operation, make sure that you have purchased a private CA by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Create a private CA</a>.</p>
     * 
     * @param request the request parameters of GetCAInstanceStatus  GetCAInstanceStatusRequest
     * @return GetCAInstanceStatusResponse
     */
    CompletableFuture<GetCAInstanceStatusResponse> getCAInstanceStatus(GetCAInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListClientCertificate operation to perform a paged query of the details about all client certificates and server certificates that you create. The details include the unique identifier, serial number, user information, content, and status of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListClientCertificate  ListClientCertificateRequest
     * @return ListClientCertificateResponse
     */
    CompletableFuture<ListClientCertificateResponse> listClientCertificate(ListClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListRevokeCertificate operation to perform a paged query of the details about all revoked client certificates and server certificates. The details include the unique identifier, serial number, and revocation date of each certificate.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListRevokeCertificate  ListRevokeCertificateRequest
     * @return ListRevokeCertificateResponse
     */
    CompletableFuture<ListRevokeCertificateResponse> listRevokeCertificate(ListRevokeCertificateRequest request);

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
    CompletableFuture<UpdateCACertificateStatusResponse> updateCACertificateStatus(UpdateCACertificateStatusRequest request);

}
