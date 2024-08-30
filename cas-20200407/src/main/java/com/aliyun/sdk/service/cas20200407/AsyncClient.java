// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cas20200407.models.*;
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
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CancelCertificateForPackageRequestResponse> cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CancelOrderRequestResponse> cancelOrderRequest(CancelOrderRequestRequest request);

    /**
      * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](~~28542~~). You can call the [DescribePackageState](~~455800~~) operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.
      * *   After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate that you want to apply for.
      * *   After you call this operation to submit a certificate application, you also need to call the [DescribeCertificateState](~~455800~~) operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.
      *
     */
    CompletableFuture<CreateCertificateForPackageRequestResponse> createCertificateForPackageRequest(CreateCertificateForPackageRequestRequest request);

    /**
      * *   You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the [CreateCertificateForPackageRequest](~~455296~~) operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.
      * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](~~28542~~). You can call the [DescribePackageState](~~455803~~) operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.
      * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate.
      * *   After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the [DescribeCertificateState](~~455800~~) operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.
      *
     */
    CompletableFuture<CreateCertificateRequestResponse> createCertificateRequest(CreateCertificateRequestRequest request);

    /**
      * *   You can use this operation to apply for only a domain validated (DV) certificate. You cannot use this operation to apply for an organization validated (OV) certificate. We recommend that you use the [CreateCertificateForPackageRequest](~~455296~~) operation to apply for a certificate. You can use the CreateCertificateForPackageRequest operation to apply for certificates of all types and specify the CSR generation method.
      * *   Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see [Purchase a certificate resource plan](~~28542~~). You can call the [DescribePackageState](~~455803~~) operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.
      * *   When you call this operation, you can use the **ProductCode** parameter to specify the specifications of the certificate that you want to apply for.
      * *   After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you must call the [DescribeCertificateState](~~455800~~) operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.
      *
     */
    CompletableFuture<CreateCertificateWithCsrRequestResponse> createCertificateWithCsrRequest(CreateCertificateWithCsrRequestRequest request);

    CompletableFuture<CreateCsrResponse> createCsr(CreateCsrRequest request);

    CompletableFuture<CreateDeploymentJobResponse> createDeploymentJob(CreateDeploymentJobRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DecryptResponse> decrypt(DecryptRequest request);

    /**
      * You can call this operation to delete a certificate application order only in the following scenarios:
      * *   The status of the order is **review failed**. You have called the [DescribeCertificateState](~~455800~~) operation to query the status of the certificate application order and the value of the **Type** parameter is **verify_fail**.
      * *   The status of the order is **pending application**. You have called the [CancelOrderRequest](~~455299~~) operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to **pending application**.
      *
     */
    CompletableFuture<DeleteCertificateRequestResponse> deleteCertificateRequest(DeleteCertificateRequestRequest request);

    CompletableFuture<DeleteCsrResponse> deleteCsr(DeleteCsrRequest request);

    CompletableFuture<DeleteDeploymentJobResponse> deleteDeploymentJob(DeleteDeploymentJobRequest request);

    CompletableFuture<DeletePCACertResponse> deletePCACert(DeletePCACertRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteUserCertificateResponse> deleteUserCertificate(DeleteUserCertificateRequest request);

    CompletableFuture<DeleteWorkerResourceResponse> deleteWorkerResource(DeleteWorkerResourceRequest request);

    /**
      * If you do not complete the verification of the domain name ownership after you submit a certificate application, you can call this operation to obtain the information that is required to complete the verification. You can complete the verification of the domain name ownership based on the data returned. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on the DNS server.
      * The certificate authority (CA) reviews your certificate application only after you complete the verification of the domain name ownership. After the CA approves your certificate application, the CA issues the certificate. If a certificate is issued, you can call this operation to obtain the CA certificate and private key of the certificate.
      *
     */
    CompletableFuture<DescribeCertificateStateResponse> describeCertificateState(DescribeCertificateStateRequest request);

    CompletableFuture<DescribeCloudResourceStatusResponse> describeCloudResourceStatus(DescribeCloudResourceStatusRequest request);

    CompletableFuture<DescribeDeploymentJobResponse> describeDeploymentJob(DescribeDeploymentJobRequest request);

    CompletableFuture<DescribeDeploymentJobStatusResponse> describeDeploymentJobStatus(DescribeDeploymentJobStatusRequest request);

    CompletableFuture<DescribePackageStateResponse> describePackageState(DescribePackageStateRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetCertWarehouseQuotaResponse> getCertWarehouseQuota(GetCertWarehouseQuotaRequest request);

    CompletableFuture<GetCsrDetailResponse> getCsrDetail(GetCsrDetailRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetUserCertificateDetailResponse> getUserCertificateDetail(GetUserCertificateDetailRequest request);

    /**
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListCertResponse> listCert(ListCertRequest request);

    /**
      * You can call the ListCertWarehouse operation to query certificate repositories.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListCertWarehouseResponse> listCertWarehouse(ListCertWarehouseRequest request);

    CompletableFuture<ListCloudAccessResponse> listCloudAccess(ListCloudAccessRequest request);

    CompletableFuture<ListCloudResourcesResponse> listCloudResources(ListCloudResourcesRequest request);

    CompletableFuture<ListContactResponse> listContact(ListContactRequest request);

    CompletableFuture<ListCsrResponse> listCsr(ListCsrRequest request);

    CompletableFuture<ListDeploymentJobResponse> listDeploymentJob(ListDeploymentJobRequest request);

    CompletableFuture<ListDeploymentJobCertResponse> listDeploymentJobCert(ListDeploymentJobCertRequest request);

    CompletableFuture<ListDeploymentJobResourceResponse> listDeploymentJobResource(ListDeploymentJobResourceRequest request);

    /**
      * You can call the ListUserCertificateOrder operation to query the certificates or certificate orders of users. If you set OrderType to CERT or UPLOAD, certificates are returned. If you set OrderType to CPACK or BUY, certificate orders are returned.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListUserCertificateOrderResponse> listUserCertificateOrder(ListUserCertificateOrderRequest request);

    CompletableFuture<ListWorkerResourceResponse> listWorkerResource(ListWorkerResourceRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.
      * >  You can call the [DescribeCertificateState](~~164111~~) operation to query the status of a certificate application order. If the value of the **Type** response parameter is **certificate**, the certificate is issued.
      *
     */
    CompletableFuture<RenewCertificateOrderForPackageRequestResponse> renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request);

    /**
      * You can call the Sign operation to sign a private certificate in a certificate application repository.
      * ### Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SignResponse> sign(SignRequest request);

    CompletableFuture<UpdateCsrResponse> updateCsr(UpdateCsrRequest request);

    CompletableFuture<UpdateDeploymentJobResponse> updateDeploymentJob(UpdateDeploymentJobRequest request);

    CompletableFuture<UpdateDeploymentJobStatusResponse> updateDeploymentJobStatus(UpdateDeploymentJobStatusRequest request);

    CompletableFuture<UpdateWorkerResourceStatusResponse> updateWorkerResourceStatus(UpdateWorkerResourceStatusRequest request);

    CompletableFuture<UploadCsrResponse> uploadCsr(UploadCsrRequest request);

    /**
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UploadUserCertificateResponse> uploadUserCertificate(UploadUserCertificateRequest request);

    /**
      * You can call the Verify operation to verify the signature of a private certificate in a certificate application repository.
      * ### Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<VerifyResponse> verify(VerifyRequest request);

}
