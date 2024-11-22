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
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CancelCertificateForPackageRequest  CancelCertificateForPackageRequestRequest
     * @return CancelCertificateForPackageRequestResponse
     */
    CompletableFuture<CancelCertificateForPackageRequestResponse> cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CancelOrderRequest  CancelOrderRequestRequest
     * @return CancelOrderRequestResponse
     */
    CompletableFuture<CancelOrderRequestResponse> cancelOrderRequest(CancelOrderRequestRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</p>
     * <ul>
     * <li>After you call this operation to submit a certificate application and the certificate is issued, the certificate quota provided by the resource plan that you purchased is consumed. When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCertificateForPackageRequest  CreateCertificateForPackageRequestRequest
     * @return CreateCertificateForPackageRequestResponse
     */
    CompletableFuture<CreateCertificateForPackageRequestResponse> createCertificateForPackageRequest(CreateCertificateForPackageRequestRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate.</li>
     * <li>After you call this operation to submit a certificate application, Certificate Management Service automatically creates a CSR file for your application and consumes the certificate quota in the certificate resource plans of the specified specifications that you purchased. After you call this operation, you also need to call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required to complete domain name verification, and manually complete the verification. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on your DNS server. Then, the certificate authority (CA) will review your certificate application.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCertificateRequest  CreateCertificateRequestRequest
     * @return CreateCertificateRequestResponse
     */
    CompletableFuture<CreateCertificateRequestResponse> createCertificateRequest(CreateCertificateRequestRequest request);

    /**
     * <b>description</b> :
     * <p>  You can use this operation to apply for only a domain validated (DV) certificate. You cannot use this operation to apply for an organization validated (OV) certificate. We recommend that you use the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation to apply for a certificate. You can use the CreateCertificateForPackageRequest operation to apply for certificates of all types and specify the CSR generation method.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455803.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
     * <li>When you call this operation, you can use the <strong>ProductCode</strong> parameter to specify the specifications of the certificate that you want to apply for.</li>
     * <li>After you call this operation to submit a certificate application, the certificate quota of the required specifications that you purchased is consumed. After you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to obtain the information that is required for domain name ownership verification and manually complete the verification. Then, your certificate application is reviewed by the certificate authority (CA). If you use the Domain Name System (DNS) verification method, you must complete the verification on your DNS service provider system. If you use the file verification method, you must complete the verification on the DNS server.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCertificateWithCsrRequest  CreateCertificateWithCsrRequestRequest
     * @return CreateCertificateWithCsrRequestResponse
     */
    CompletableFuture<CreateCertificateWithCsrRequestResponse> createCertificateWithCsrRequest(CreateCertificateWithCsrRequestRequest request);

    /**
     * @param request the request parameters of CreateCsr  CreateCsrRequest
     * @return CreateCsrResponse
     */
    CompletableFuture<CreateCsrResponse> createCsr(CreateCsrRequest request);

    /**
     * @param request the request parameters of CreateDeploymentJob  CreateDeploymentJobRequest
     * @return CreateDeploymentJobResponse
     */
    CompletableFuture<CreateDeploymentJobResponse> createDeploymentJob(CreateDeploymentJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Decrypt  DecryptRequest
     * @return DecryptResponse
     */
    CompletableFuture<DecryptResponse> decrypt(DecryptRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a certificate application order only in the following scenarios:</p>
     * <ul>
     * <li>The status of the order is <strong>review failed</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455800.html">DescribeCertificateState</a> operation to query the status of the certificate application order and the value of the <strong>Type</strong> parameter is <strong>verify_fail</strong>.</li>
     * <li>The status of the order is <strong>pending application</strong>. You have called the <a href="https://help.aliyun.com/document_detail/455299.html">CancelOrderRequest</a> operation to cancel a certificate application order whose status is pending review or being reviewed. The status of the certificate application order that is canceled in this case changes to <strong>pending application</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCertificateRequest  DeleteCertificateRequestRequest
     * @return DeleteCertificateRequestResponse
     */
    CompletableFuture<DeleteCertificateRequestResponse> deleteCertificateRequest(DeleteCertificateRequestRequest request);

    /**
     * @param request the request parameters of DeleteCsr  DeleteCsrRequest
     * @return DeleteCsrResponse
     */
    CompletableFuture<DeleteCsrResponse> deleteCsr(DeleteCsrRequest request);

    /**
     * @param request the request parameters of DeleteDeploymentJob  DeleteDeploymentJobRequest
     * @return DeleteDeploymentJobResponse
     */
    CompletableFuture<DeleteDeploymentJobResponse> deleteDeploymentJob(DeleteDeploymentJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeletePCACert operation to delete a private certificate from a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePCACert  DeletePCACertRequest
     * @return DeletePCACertResponse
     */
    CompletableFuture<DeletePCACertResponse> deletePCACert(DeletePCACertRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteUserCertificate  DeleteUserCertificateRequest
     * @return DeleteUserCertificateResponse
     */
    CompletableFuture<DeleteUserCertificateResponse> deleteUserCertificate(DeleteUserCertificateRequest request);

    /**
     * @param request the request parameters of DeleteWorkerResource  DeleteWorkerResourceRequest
     * @return DeleteWorkerResourceResponse
     */
    CompletableFuture<DeleteWorkerResourceResponse> deleteWorkerResource(DeleteWorkerResourceRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not complete the verification of the domain name ownership after you submit a certificate application, you can call this operation to obtain the information that is required to complete the verification. You can complete the verification of the domain name ownership based on the data returned. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on the DNS server.
     * The certificate authority (CA) reviews your certificate application only after you complete the verification of the domain name ownership. After the CA approves your certificate application, the CA issues the certificate. If a certificate is issued, you can call this operation to obtain the CA certificate and private key of the certificate.</p>
     * 
     * @param request the request parameters of DescribeCertificateState  DescribeCertificateStateRequest
     * @return DescribeCertificateStateResponse
     */
    CompletableFuture<DescribeCertificateStateResponse> describeCertificateState(DescribeCertificateStateRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceStatus  DescribeCloudResourceStatusRequest
     * @return DescribeCloudResourceStatusResponse
     */
    CompletableFuture<DescribeCloudResourceStatusResponse> describeCloudResourceStatus(DescribeCloudResourceStatusRequest request);

    /**
     * @param request the request parameters of DescribeDeploymentJob  DescribeDeploymentJobRequest
     * @return DescribeDeploymentJobResponse
     */
    CompletableFuture<DescribeDeploymentJobResponse> describeDeploymentJob(DescribeDeploymentJobRequest request);

    /**
     * @param request the request parameters of DescribeDeploymentJobStatus  DescribeDeploymentJobStatusRequest
     * @return DescribeDeploymentJobStatusResponse
     */
    CompletableFuture<DescribeDeploymentJobStatusResponse> describeDeploymentJobStatus(DescribeDeploymentJobStatusRequest request);

    /**
     * @param request the request parameters of DescribePackageState  DescribePackageStateRequest
     * @return DescribePackageStateResponse
     */
    CompletableFuture<DescribePackageStateResponse> describePackageState(DescribePackageStateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCertWarehouseQuota  GetCertWarehouseQuotaRequest
     * @return GetCertWarehouseQuotaResponse
     */
    CompletableFuture<GetCertWarehouseQuotaResponse> getCertWarehouseQuota(GetCertWarehouseQuotaRequest request);

    /**
     * @param request the request parameters of GetCsrDetail  GetCsrDetailRequest
     * @return GetCsrDetailResponse
     */
    CompletableFuture<GetCsrDetailResponse> getCsrDetail(GetCsrDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetUserCertificateDetail  GetUserCertificateDetailRequest
     * @return GetUserCertificateDetailResponse
     */
    CompletableFuture<GetUserCertificateDetailResponse> getUserCertificateDetail(GetUserCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListCert  ListCertRequest
     * @return ListCertResponse
     */
    CompletableFuture<ListCertResponse> listCert(ListCertRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListCertWarehouse operation to query certificate repositories.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListCertWarehouse  ListCertWarehouseRequest
     * @return ListCertWarehouseResponse
     */
    CompletableFuture<ListCertWarehouseResponse> listCertWarehouse(ListCertWarehouseRequest request);

    /**
     * @param request the request parameters of ListCloudAccess  ListCloudAccessRequest
     * @return ListCloudAccessResponse
     */
    CompletableFuture<ListCloudAccessResponse> listCloudAccess(ListCloudAccessRequest request);

    /**
     * @param request the request parameters of ListCloudResources  ListCloudResourcesRequest
     * @return ListCloudResourcesResponse
     */
    CompletableFuture<ListCloudResourcesResponse> listCloudResources(ListCloudResourcesRequest request);

    /**
     * @param request the request parameters of ListContact  ListContactRequest
     * @return ListContactResponse
     */
    CompletableFuture<ListContactResponse> listContact(ListContactRequest request);

    /**
     * @param request the request parameters of ListCsr  ListCsrRequest
     * @return ListCsrResponse
     */
    CompletableFuture<ListCsrResponse> listCsr(ListCsrRequest request);

    /**
     * @param request the request parameters of ListDeploymentJob  ListDeploymentJobRequest
     * @return ListDeploymentJobResponse
     */
    CompletableFuture<ListDeploymentJobResponse> listDeploymentJob(ListDeploymentJobRequest request);

    /**
     * @param request the request parameters of ListDeploymentJobCert  ListDeploymentJobCertRequest
     * @return ListDeploymentJobCertResponse
     */
    CompletableFuture<ListDeploymentJobCertResponse> listDeploymentJobCert(ListDeploymentJobCertRequest request);

    /**
     * @param request the request parameters of ListDeploymentJobResource  ListDeploymentJobResourceRequest
     * @return ListDeploymentJobResourceResponse
     */
    CompletableFuture<ListDeploymentJobResourceResponse> listDeploymentJobResource(ListDeploymentJobResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListUserCertificateOrder operation to query the certificates or certificate orders of users. If you set OrderType to CERT or UPLOAD, certificates are returned. If you set OrderType to CPACK or BUY, certificate orders are returned.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListUserCertificateOrder  ListUserCertificateOrderRequest
     * @return ListUserCertificateOrderResponse
     */
    CompletableFuture<ListUserCertificateOrderResponse> listUserCertificateOrder(ListUserCertificateOrderRequest request);

    /**
     * @param request the request parameters of ListWorkerResource  ListWorkerResourceRequest
     * @return ListWorkerResourceResponse
     */
    CompletableFuture<ListWorkerResourceResponse> listWorkerResource(ListWorkerResourceRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a> operation to query the status of a certificate application order. If the value of the <strong>Type</strong> response parameter is <strong>certificate</strong>, the certificate is issued.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RenewCertificateOrderForPackageRequest  RenewCertificateOrderForPackageRequestRequest
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    CompletableFuture<RenewCertificateOrderForPackageRequestResponse> renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the Sign operation to sign a private certificate in a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Sign  SignRequest
     * @return SignResponse
     */
    CompletableFuture<SignResponse> sign(SignRequest request);

    /**
     * @param request the request parameters of UpdateCsr  UpdateCsrRequest
     * @return UpdateCsrResponse
     */
    CompletableFuture<UpdateCsrResponse> updateCsr(UpdateCsrRequest request);

    /**
     * @param request the request parameters of UpdateDeploymentJob  UpdateDeploymentJobRequest
     * @return UpdateDeploymentJobResponse
     */
    CompletableFuture<UpdateDeploymentJobResponse> updateDeploymentJob(UpdateDeploymentJobRequest request);

    /**
     * @param request the request parameters of UpdateDeploymentJobStatus  UpdateDeploymentJobStatusRequest
     * @return UpdateDeploymentJobStatusResponse
     */
    CompletableFuture<UpdateDeploymentJobStatusResponse> updateDeploymentJobStatus(UpdateDeploymentJobStatusRequest request);

    /**
     * @param request the request parameters of UpdateWorkerResourceStatus  UpdateWorkerResourceStatusRequest
     * @return UpdateWorkerResourceStatusResponse
     */
    CompletableFuture<UpdateWorkerResourceStatusResponse> updateWorkerResourceStatus(UpdateWorkerResourceStatusRequest request);

    /**
     * @param request the request parameters of UploadCsr  UploadCsrRequest
     * @return UploadCsrResponse
     */
    CompletableFuture<UploadCsrResponse> uploadCsr(UploadCsrRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UploadUserCertificate  UploadUserCertificateRequest
     * @return UploadUserCertificateResponse
     */
    CompletableFuture<UploadUserCertificateResponse> uploadUserCertificate(UploadUserCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the Verify operation to verify the signature of a private certificate in a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Verify  VerifyRequest
     * @return VerifyResponse
     */
    CompletableFuture<VerifyResponse> verify(VerifyRequest request);

}
