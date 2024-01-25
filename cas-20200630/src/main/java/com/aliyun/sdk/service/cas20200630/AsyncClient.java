// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cas20200630.models.*;
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
      * Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the [CreateRootCACertificate] operation and an intermediate CA certificate by calling the [CreateSubCACertificate] operation. Only intermediate CA certificates can issue client certificates.
      * ## QPS limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request);

    /**
      * Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the [CreateRootCACertificate](~~328093~~) operation and an intermediate CA certificate by calling the [CreateSubCACertificate](~~328094~~) operation. Only intermediate CA certificates can be used to issue client certificates.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateClientCertificateWithCsrResponse> createClientCertificateWithCsr(CreateClientCertificateWithCsrRequest request);

    /**
      * By default, the name of the entity is obtained from the certificate signing request (CSR) of the certificate that you want to issue. If you specify a different name for the entity, the name of the entity in the CSR becomes invalid. The specified name is used to issue the certificate.
      * You must specify the key usage and extended key usage based on the certificate type. The following list describes common certificate types:
      * *   Server certificate
      * Key usage: digitalSignature or keyEncipherment
      * Extended key usage: serverAuth
      * *   Client certificate
      * Key usage: digitalSignature or keyEncipherment
      * Extended key usage: clientAuth
      * *   Mutual Transport Layer Security (TLS) authentication certificate
      * Key usage: digitalSignature or keyEncipherment
      * Extended key usage: serverAuth or clientAuth
      * *   Email certificate
      * Key usage: digitalSignature or contentCommitment
      * Extended key usage: emailProtection
      * Note: Compliant certificate authorities (CAs) are managed by third-party authorities. This operation is not supported for compliant CAs.
      *
     */
    CompletableFuture<CreateCustomCertificateResponse> createCustomCertificate(CreateCustomCertificateRequest request);

    CompletableFuture<CreateRevokeClientCertificateResponse> createRevokeClientCertificate(CreateRevokeClientCertificateRequest request);

    /**
      * The root CA certificate in the PEM format.
      *
     */
    CompletableFuture<CreateRootCACertificateResponse> createRootCACertificate(CreateRootCACertificateRequest request);

    /**
      * Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the [CreateRootCACertificate](~~328093~~) operation and an intermediate CA certificate by calling the [CreateSubCACertificate](~~328094~~) operation. Only intermediate CA certificates can be used to issue server certificates.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateServerCertificateResponse> createServerCertificate(CreateServerCertificateRequest request);

    /**
      * Before you call this operation, make sure that you have created a root certificate authority (CA) certificate by calling the [CreateRootCACertificate](~~328093~~) operation and an intermediate CA certificate by calling the [CreateSubCACertificate](~~328094~~) operation. Only intermediate CA certificates can be used to issue server certificates.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateServerCertificateWithCsrResponse> createServerCertificateWithCsr(CreateServerCertificateWithCsrRequest request);

    /**
      * You can call this operation to issue an intermediate certificate authority (CA) certificate by using an existing root CA certificate. Intermediate CA certificates can be used to issue client certificates and server certificates.
      * Before you call this operation, make sure that you have issued a root CA certificate by calling the [CreateRootCACertificate] operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateSubCACertificateResponse> createSubCACertificate(CreateSubCACertificateRequest request);

    CompletableFuture<DeleteClientCertificateResponse> deleteClientCertificate(DeleteClientCertificateRequest request);

    /**
      * You can call the DescribeCACertificate operation to query the details about a root CA certificate or an intermediate CA certificate by using the unique identifier of the root CA certificate or intermediate CA certificate. The details include the serial number, user information, and content of a CA certificate.
      * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeCACertificateResponse> describeCACertificate(DescribeCACertificateRequest request);

    CompletableFuture<DescribeCACertificateCountResponse> describeCACertificateCount(DescribeCACertificateCountRequest request);

    /**
      * You can call the DescribeCACertificateList operation to perform a paged query of the details about all CA certificates that you create. The details include the unique identifier, serial number, user information, and content of each root CA certificate or intermediate CA certificate.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeCACertificateListResponse> describeCACertificateList(DescribeCACertificateListRequest request);

    /**
      * ## Usage notes
      * You can call the DescribeCertificatePrivateKey operation to obtain the encrypted private key of a client certificate or a server certificate. The certificate is issued based on a system-generated certificate signing request (CSR). Before you call this operation, make sure that you have issued a client certificate or a server certificate by calling the following operation:
      * *   [CreateClientCertificate](~~330873~~)
      * *   [CreateServerCertificate](~~330877~~)
      * To ensure the security of private key transmission, the DescribeCertificatePrivateKey operation encrypts the private key by using the private key password that you specify and returns the encrypted private key. The private key password is a string that is used to encrypt the private key. After you obtain the encrypted private key of the certificate, you can use the following methods to decrypt the private key:
      * *   If the encryption algorithm of the certificate is RSA, you must run the `openssl rsa -in <Encrypted private key file> -passin pass:<Private key password> -out <Decrypted private key file>` command in the computer on which [OpenSSL](https://www.openssl.org/source/) or [BabaSSL](https://github.com/BabaSSL/BabaSSL) is installed.
      * *   If the encryption algorithm of the certificate is ECC, you must run the `openssl ec -in <Encrypted private key file> -passin pass:<Private key password> -out <Decrypted private key file>` command in the computer on which [OpenSSL](https://www.openssl.org/source/) or [BabaSSL](https://github.com/BabaSSL/BabaSSL) is installed.
      * *   If the encryption algorithm of the certificate is SM2, you must run the `openssl ec -in <Encrypted private key file> -passin pass:<Private key password> -out <Decrypted private key file>` command in the computer on which [BabaSSL](https://github.com/BabaSSL/BabaSSL) is installed.
      * >  You can call the [DescribeClientCertificate] operation to query the encryption algorithm type of a client certificate or a server certificate.
      * ## Limits
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeCertificatePrivateKeyResponse> describeCertificatePrivateKey(DescribeCertificatePrivateKeyRequest request);

    /**
      * You can call the DescribeClientCertificate operation to query the details about a client certificate or a server certificate by using the unique identifier of the certificate. The details include the serial number, user information, content, and status of each certificate.
      * Before you call this operation, make sure that you have created a client certificate or a server certificate.
      * For more information about how to call an operation to create a client certificate, see the following topics:
      * *   [CreateClientCertificate](~~330873~~)
      * *   [CreateClientCertificateWithCsr](~~330875~~)
      * For more information about how to call an operation to create a server certificate, see the following topics:
      * *   [CreateServerCertificate](~~330877~~)
      * *   [CreateServerCertificateWithCsr](~~330878~~)
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeClientCertificateResponse> describeClientCertificate(DescribeClientCertificateRequest request);

    CompletableFuture<DescribeClientCertificateStatusResponse> describeClientCertificateStatus(DescribeClientCertificateStatusRequest request);

    /**
      * ## Usage notes
      * You can call the GetCAInstanceStatus operation to query the status information of a private CA instance by using the ID of the instance. The instance is purchased by using the SSL Certificates Service console. The status information includes the status of the private CA instance, the number of certificates that can be issued by using the private CA instance, and the number of issued certificates.
      * Before you call this operation, make sure that you have purchased a private CA by using the [SSL Certificates Service console](https://yundun.console.aliyun.com/?p=cas#/pca/rootlist). For more information, see [Create a private CA](~~208553~~).
      *
     */
    CompletableFuture<GetCAInstanceStatusResponse> getCAInstanceStatus(GetCAInstanceStatusRequest request);

    /**
      * You can call the ListClientCertificate operation to perform a paged query of the details about all client certificates and server certificates that you create. The details include the unique identifier, serial number, user information, content, and status of each certificate.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListClientCertificateResponse> listClientCertificate(ListClientCertificateRequest request);

    /**
      * You can call the ListRevokeCertificate operation to perform a paged query of the details about all revoked client certificates and server certificates. The details include the unique identifier, serial number, and revocation date of each certificate.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListRevokeCertificateResponse> listRevokeCertificate(ListRevokeCertificateRequest request);

    /**
      * After a CA certificate is created, the CA certificate is in the ISSUE state by default. You can call the UpdateCACertificateStatus operation to change the status of a CA certificate from ISSUE to REVOKE. If a CA certificate is in the ISSUE state, the CA certificate can be used to issue certificates. If a CA certificate is in the REVOKE state, the CA certificate cannot be used to issue certificates, and the certificates that are issued from the CA certificate become invalid.
      * Before you call this operation, make sure that you have created a root CA by calling the [CreateRootCACertificate] operation or an intermediate CA certificate by calling the [CreateSubCACertificate] operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UpdateCACertificateStatusResponse> updateCACertificateStatus(UpdateCACertificateStatusRequest request);

}
