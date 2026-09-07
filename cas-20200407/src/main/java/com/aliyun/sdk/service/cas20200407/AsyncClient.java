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
     * <p>The single-user QPS limit for this API is 100 queries per second (QPS). Calls that exceed this limit are throttled, which can affect your business operations. Call this API at a reasonable rate to avoid throttling.</p>
     * 
     * @param request the request parameters of AddCloudAccess  AddCloudAccessRequest
     * @return AddCloudAccessResponse
     */
    CompletableFuture<AddCloudAccessResponse> addCloudAccess(AddCloudAccessRequest request);

    /**
     * @param request the request parameters of ApplyCertificate  ApplyCertificateRequest
     * @return ApplyCertificateResponse
     */
    CompletableFuture<ApplyCertificateResponse> applyCertificate(ApplyCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>After a CA certificate is created, it is in the normal issuance state by default. You can call this operation to change the status of a CA certificate from normal issuance to revoked. In the normal issuance state, the CA certificate can be used to issue certificates. In the revoked state, the CA certificate cannot be used to issue certificates, and the certificates that have been issued by the CA certificate also become invalid accordingly.
     * Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/465962.html">CreateRootCACertificate</a> to create a root CA certificate and called <a href="https://help.aliyun.com/document_detail/465959.html">CreateSubCACertificate</a> to create a sub CA certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly.</p>
     * 
     * @param request the request parameters of BatchUpdateNoticeStatus  BatchUpdateNoticeStatusRequest
     * @return BatchUpdateNoticeStatusResponse
     */
    CompletableFuture<BatchUpdateNoticeStatusResponse> batchUpdateNoticeStatus(BatchUpdateNoticeStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This API has a limit of 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This can affect your business. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of CancelCertificateForPackageRequest  CancelCertificateForPackageRequestRequest
     * @return CancelCertificateForPackageRequestResponse
     */
    CompletableFuture<CancelCertificateForPackageRequestResponse> cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 100 queries per second (QPS) for each user. API calls that exceed this limit are throttled. Because this can impact your business, you should call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of CancelOrderRequest  CancelOrderRequestRequest
     * @return CancelOrderRequestResponse
     */
    CompletableFuture<CancelOrderRequestResponse> cancelOrderRequest(CancelOrderRequestRequest request);

    /**
     * @param request the request parameters of CancelPendingCertificate  CancelPendingCertificateRequest
     * @return CancelPendingCertificateResponse
     */
    CompletableFuture<CancelPendingCertificateResponse> cancelPendingCertificate(CancelPendingCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a certificate resource plan of the required specifications. For more information about how to purchase a certificate resource plan, see <a href="https://help.aliyun.com/document_detail/28542.html">Purchase a certificate resource plan</a>. You can call the <a href="https://help.aliyun.com/document_detail/455800.html">DescribePackageState</a> operation to query the usage of a certificate resource plan of specified specifications, including the total number of certificate resource plans that you purchase, the number of certificate applications that you submit, and the number of certificates that are issued.</li>
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
     * <ul>
     * <li>You can call this operation to apply for only DV certificates. If you want to apply for an organization validated (OV) or extended validation (EV) certificate, we recommend that you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation. This operation allows you to apply for certificates of all specifications and specify the method to generate a certificate signing request (CSR) file.</li>
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
     * <ul>
     * <li>You can use this operation to apply for only a domain validated (DV) certificate. You cannot use this operation to apply for an organization validated (OV) certificate. We recommend that you use the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a> operation to apply for a certificate. You can use the CreateCertificateForPackageRequest operation to apply for certificates of all types and specify the CSR generation method.</li>
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
     * @param request the request parameters of CreateCompany  CreateCompanyRequest
     * @return CreateCompanyResponse
     */
    CompletableFuture<CreateCompanyResponse> createCompany(CreateCompanyRequest request);

    /**
     * @param request the request parameters of CreateContact  CreateContactRequest
     * @return CreateContactResponse
     */
    CompletableFuture<CreateContactResponse> createContact(CreateContactRequest request);

    /**
     * @param request the request parameters of CreateCsr  CreateCsrRequest
     * @return CreateCsrResponse
     */
    CompletableFuture<CreateCsrResponse> createCsr(CreateCsrRequest request);

    /**
     * <b>description</b> :
     * <p>After the task creation is completed, the task will be in the editing state. You need to call the UpdateDeploymentJobStatus interface to change the status to the pending state, otherwise the task will not be executed.</p>
     * 
     * @param request the request parameters of CreateDeploymentJob  CreateDeploymentJobRequest
     * @return CreateDeploymentJobResponse
     */
    CompletableFuture<CreateDeploymentJobResponse> createDeploymentJob(CreateDeploymentJobRequest request);

    /**
     * @param request the request parameters of CreateRollbackTask  CreateRollbackTaskRequest
     * @return CreateRollbackTaskResponse
     */
    CompletableFuture<CreateRollbackTaskResponse> createRollbackTask(CreateRollbackTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 QPS per user. Exceeding this limit triggers throttling, which can affect your business. Call this API at a reasonable rate to avoid disruption.</p>
     * 
     * @param request the request parameters of CreateWHClientCertificate  CreateWHClientCertificateRequest
     * @return CreateWHClientCertificateResponse
     */
    CompletableFuture<CreateWHClientCertificateResponse> createWHClientCertificate(CreateWHClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the list of certificate repositories.</p>
     * <h3>QPS limit</h3>
     * <p>The China single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateWarehouse  CreateWarehouseRequest
     * @return CreateWarehouseResponse
     */
    CompletableFuture<CreateWarehouseResponse> createWarehouse(CreateWarehouseRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this API operation is 10 per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
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
     * <b>description</b> :
     * <p>This operation is limited to 100 queries per second (QPS) per user. API calls that exceed this limit are throttled, which can impact your business.</p>
     * 
     * @param request the request parameters of DeleteCloudAccess  DeleteCloudAccessRequest
     * @return DeleteCloudAccessResponse
     */
    CompletableFuture<DeleteCloudAccessResponse> deleteCloudAccess(DeleteCloudAccessRequest request);

    /**
     * @param request the request parameters of DeleteCompany  DeleteCompanyRequest
     * @return DeleteCompanyResponse
     */
    CompletableFuture<DeleteCompanyResponse> deleteCompany(DeleteCompanyRequest request);

    /**
     * @param request the request parameters of DeleteContact  DeleteContactRequest
     * @return DeleteContactResponse
     */
    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

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
     * <p>Queries the status information of a private Certificate Authority (CA) instance that you purchased in the SSL Certificate console by using the ID of the private CA instance. For example, you can query the status of the CA instance, the number of certificates included, and the number of certificates issued.
     * Before you invoke this operation, you must have purchased a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Invoke this operation as needed.</p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

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
     * <p>The China single-user queries per second (QPS) limit for this operation is 100. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of DeleteUserCertificate  DeleteUserCertificateRequest
     * @return DeleteUserCertificateResponse
     */
    CompletableFuture<DeleteUserCertificateResponse> deleteUserCertificate(DeleteUserCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation deletes a certificate warehouse.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a QPS limit of 10 requests per second per user. Exceeding this limit causes subsequent API calls to be throttled, which can impact your services. To ensure service availability, call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeleteWarehouse  DeleteWarehouseRequest
     * @return DeleteWarehouseResponse
     */
    CompletableFuture<DeleteWarehouseResponse> deleteWarehouse(DeleteWarehouseRequest request);

    /**
     * @param request the request parameters of DeleteWorkerResource  DeleteWorkerResourceRequest
     * @return DeleteWorkerResourceResponse
     */
    CompletableFuture<DeleteWorkerResourceResponse> deleteWorkerResource(DeleteWorkerResourceRequest request);

    /**
     * <b>description</b> :
     * <p>If you have not completed domain ownership validation after submitting a certificate request, you can call this operation to obtain the information required to complete domain validation. Using the returned domain validation information, you can complete domain validation on the DNS management platform (DNS validation method) or on the domain server (file validation method).
     * Your certificate request will enter the CA center review stage only after you complete domain validation. After the CA center approves your certificate request, a certificate will be issued to you. If the certificate has been issued, you can call this operation to obtain the issued certificate file and private key content.
     * &lt;props=&quot;china&quot;&gt;
     * For the complete process of requesting a certificate using the resource plan API, see <a href="https://help.aliyun.com/document_detail/204741.html">Process of requesting a certificate using API operations</a>.</p>
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
     * @param request the request parameters of DescribeWarehouseCert  DescribeWarehouseCertRequest
     * @return DescribeWarehouseCertResponse
     */
    CompletableFuture<DescribeWarehouseCertResponse> describeWarehouseCert(DescribeWarehouseCertRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may affect your business. To prevent this, call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    CompletableFuture<EncryptResponse> encrypt(EncryptRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * @param request the request parameters of GetAssetCount  GetAssetCountRequest
     * @return GetAssetCountResponse
     */
    CompletableFuture<GetAssetCountResponse> getAssetCount(GetAssetCountRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, your API calls are throttled. This may impact your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of GetCertWarehouseQuota  GetCertWarehouseQuotaRequest
     * @return GetCertWarehouseQuotaResponse
     */
    CompletableFuture<GetCertWarehouseQuotaResponse> getCertWarehouseQuota(GetCertWarehouseQuotaRequest request);

    /**
     * @param request the request parameters of GetCertificateDetail  GetCertificateDetailRequest
     * @return GetCertificateDetailResponse
     */
    CompletableFuture<GetCertificateDetailResponse> getCertificateDetail(GetCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of GetCertificatePackageCount  GetCertificatePackageCountRequest
     * @return GetCertificatePackageCountResponse
     */
    CompletableFuture<GetCertificatePackageCountResponse> getCertificatePackageCount(GetCertificatePackageCountRequest request);

    /**
     * @param request the request parameters of GetCompany  GetCompanyRequest
     * @return GetCompanyResponse
     */
    CompletableFuture<GetCompanyResponse> getCompany(GetCompanyRequest request);

    /**
     * @param request the request parameters of GetContact  GetContactRequest
     * @return GetContactResponse
     */
    CompletableFuture<GetContactResponse> getContact(GetContactRequest request);

    /**
     * @param request the request parameters of GetCsrDetail  GetCsrDetailRequest
     * @return GetCsrDetailResponse
     */
    CompletableFuture<GetCsrDetailResponse> getCsrDetail(GetCsrDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the status information of a Private Certificate Authority (PCA) instance that you purchased in the Certificate Management Service console by using the instance ID. The status information includes the CA instance status, the number of digital certificates included, and the number of digital certificates issued.
     * Before you invoke this operation, you must have purchased a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, throttling is triggered, which may affect your business. Invoke this operation as appropriate.</p>
     * 
     * @param request the request parameters of GetInstanceDetail  GetInstanceDetailRequest
     * @return GetInstanceDetailResponse
     */
    CompletableFuture<GetInstanceDetailResponse> getInstanceDetail(GetInstanceDetailRequest request);

    /**
     * @param request the request parameters of GetInstanceSummary  GetInstanceSummaryRequest
     * @return GetInstanceSummaryResponse
     */
    CompletableFuture<GetInstanceSummaryResponse> getInstanceSummary(GetInstanceSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>本接口用于通过私有 CA 实例的 ID，查询您通过 SSL 证书服务控制台购买的私有 CA 实例的状态信息，例如，CA 实例的状态、包含的证书数量、已签发的证书数量等。
     * 调用本接口前，您必须已经通过<a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">数字证书管理服务控制台</a>购买了私有 CA。具体操作，请参见<a href="https://help.aliyun.com/document_detail/208553.html">购买私有 CA</a>。</p>
     * <h2>QPS 限制</h2>
     * <p>本接口的单用户 QPS 限制为 10 次/秒。超过限制，API 调用将会被限流，这可能影响您的业务，请合理调用。</p>
     * 
     * @param request the request parameters of GetMatchedResources  GetMatchedResourcesRequest
     * @return GetMatchedResourcesResponse
     */
    CompletableFuture<GetMatchedResourcesResponse> getMatchedResources(GetMatchedResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the number of created Certificate Authority (CA) certificates, including root and subordinate CA certificates.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are rate-limited, which may affect your business. We recommend that you call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of GetRiskCount  GetRiskCountRequest
     * @return GetRiskCountResponse
     */
    CompletableFuture<GetRiskCountResponse> getRiskCount(GetRiskCountRequest request);

    /**
     * @param request the request parameters of GetTaskAttribute  GetTaskAttributeRequest
     * @return GetTaskAttributeResponse
     */
    CompletableFuture<GetTaskAttributeResponse> getTaskAttribute(GetTaskAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The China single-user QPS limit for this operation is 100 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of GetUserCertificateDetail  GetUserCertificateDetailRequest
     * @return GetUserCertificateDetailResponse
     */
    CompletableFuture<GetUserCertificateDetailResponse> getUserCertificateDetail(GetUserCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the number of CA certificates (including root CA certificates and subordinate CA certificates) that you have created.</p>
     * <h2>QPS limit</h2>
     * <p>The China single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of ListAssetCount  ListAssetCountRequest
     * @return ListAssetCountResponse
     */
    CompletableFuture<ListAssetCountResponse> listAssetCount(ListAssetCountRequest request);

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this API is 10. Calls exceeding this limit are throttled, which may impact your business. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of ListCert  ListCertRequest
     * @return ListCertResponse
     */
    CompletableFuture<ListCertResponse> listCert(ListCertRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of certificate repositories.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.</p>
     * 
     * @param request the request parameters of ListCertWarehouse  ListCertWarehouseRequest
     * @return ListCertWarehouseResponse
     */
    CompletableFuture<ListCertWarehouseResponse> listCertWarehouse(ListCertWarehouseRequest request);

    /**
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

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
     * @param request the request parameters of ListCompanies  ListCompaniesRequest
     * @return ListCompaniesResponse
     */
    CompletableFuture<ListCompaniesResponse> listCompanies(ListCompaniesRequest request);

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
     * <p>Queries the status information of Private Certificate Authority (PCA) instances that you purchased through the SSL Certificate console by using the IDs of the PCA instances. For example, you can query the status of a CA instance, the number of digital certificates included, and the number of digital certificates issued.
     * Before you invoke this operation, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your business. Invoke this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status information of a private Certificate Authority (CA) instance that you purchased in the SSL Certificate console by using the ID of the private CA instance. For example, you can query the status of the CA instance, the number of certificates included, and the number of certificates issued.
     * Before you invoke this operation, you must have purchased a private CA in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Invoke this operation as appropriate.</p>
     * 
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the status information of a private Certificate Authority (CA) instance that you purchased through the SSL Certificate console by using the ID of the private CA instance. For example, you can query the status of the CA instance, the number of digital certificates included, and the number of digital certificates issued.
     * Before you invoke this operation, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Invoke this operation appropriately.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the managed orders for a certificate or order.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ListTrusteeOrder  ListTrusteeOrderRequest
     * @return ListTrusteeOrderResponse
     */
    CompletableFuture<ListTrusteeOrderResponse> listTrusteeOrder(ListTrusteeOrderRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the list of user certificates or orders. If OrderType is set to CERT or UPLOAD, the certificate list is queried. If OrderType is set to CPACK or BUY, the order list is queried.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ListUserCertificateOrder  ListUserCertificateOrderRequest
     * @return ListUserCertificateOrderResponse
     */
    CompletableFuture<ListUserCertificateOrderResponse> listUserCertificateOrder(ListUserCertificateOrderRequest request);

    /**
     * <b>description</b> :
     * <p>This operation lists your warehouses.</p>
     * <h3>QPS limit</h3>
     * <p>This operation has a per-user QPS limit of 10 requests per second. Calls exceeding this limit are throttled, which can affect your business.</p>
     * 
     * @param request the request parameters of ListWarehouse  ListWarehouseRequest
     * @return ListWarehouseResponse
     */
    CompletableFuture<ListWarehouseResponse> listWarehouse(ListWarehouseRequest request);

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
     * @param request the request parameters of RefundInstance  RefundInstanceRequest
     * @return RefundInstanceResponse
     */
    CompletableFuture<RefundInstanceResponse> refundInstance(RefundInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a> operation to query the status of a certificate application order. If the value of the <strong>Type</strong> response parameter is <strong>certificate</strong>, the certificate is issued.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RenewCertificateOrderForPackageRequest  RenewCertificateOrderForPackageRequestRequest
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    CompletableFuture<RenewCertificateOrderForPackageRequestResponse> renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request);

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the details of all revoked client certificates and server certificates by paging. The details include the unique identifier, serial number, and revocation date of each certificate.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user for this operation is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Invoke this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of RevokeCertificate  RevokeCertificateRequest
     * @return RevokeCertificateResponse
     */
    CompletableFuture<RevokeCertificateResponse> revokeCertificate(RevokeCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>The rate limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, subsequent API calls will be throttled, which can disrupt your services. We recommend that you call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of RevokeWHClientCertificate  RevokeWHClientCertificateRequest
     * @return RevokeWHClientCertificateResponse
     */
    CompletableFuture<RevokeWHClientCertificateResponse> revokeWHClientCertificate(RevokeWHClientCertificateRequest request);

    /**
     * @param request the request parameters of ShareCertificate  ShareCertificateRequest
     * @return ShareCertificateResponse
     */
    CompletableFuture<ShareCertificateResponse> shareCertificate(ShareCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates a digital signature with a PCA certificate from a certificate repository.</p>
     * <h3>QPS limit</h3>
     * <p>This operation supports up to 1,000 queries per second (QPS) for a single user. If you exceed this limit, the system throttles your API calls, which can impact your business. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of Sign  SignRequest
     * @return SignResponse
     */
    CompletableFuture<SignResponse> sign(SignRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status information of a private Certificate Authority (CA) instance that you purchased through the SSL Certificate console by using the ID of the private CA instance. For example, you can query the status of the CA instance, the number of certificates included, and the number of certificates issued.
     * Before you invoke this operation, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Invoke this operation as needed.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status information of a private Certificate Authority (CA) instance that you purchased through the SSL Certificate console by using the ID of the private CA instance. The status information includes the CA instance status, the number of digital certificates included, and the number of digital certificates issued.
     * Before you invoke this operation, you must have purchased a private CA through the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/208553.html">Purchase a private CA</a>.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Invoke this operation as needed.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCompany  UpdateCompanyRequest
     * @return UpdateCompanyResponse
     */
    CompletableFuture<UpdateCompanyResponse> updateCompany(UpdateCompanyRequest request);

    /**
     * @param request the request parameters of UpdateContact  UpdateContactRequest
     * @return UpdateContactResponse
     */
    CompletableFuture<UpdateContactResponse> updateContact(UpdateContactRequest request);

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
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

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
     * <p>Uploads a PCA certificate to a certificate repository.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of UploadPCACert  UploadPCACertRequest
     * @return UploadPCACertResponse
     */
    CompletableFuture<UploadPCACertResponse> uploadPCACert(UploadPCACertRequest request);

    /**
     * <b>description</b> :
     * <p>The China SM certificate refers to a certificate that uses the ShangMi (SM) cryptographic algorithms. The China SM certificate includes an encryption certificate and a signing certificate. The China SM certificate is used in China to comply with the national cryptographic standards.
     * The China SM certificate refers to a certificate that uses the ShangMi (SM) cryptographic algorithms.
     * The China SM certificate includes an encryption certificate and a signing certificate.
     * The China SM certificate is used in China to comply with the national cryptographic standards.
     * The China SM certificate refers to a certificate that uses the ShangMi (SM) cryptographic algorithms.
     * The China SM certificate includes an encryption certificate and a signing certificate.
     * The throttling limit for this API is 100 queries per second (QPS) per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of UploadUserCertificate  UploadUserCertificateRequest
     * @return UploadUserCertificateResponse
     */
    CompletableFuture<UploadUserCertificateResponse> uploadUserCertificate(UploadUserCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This API verifies the signatures of PCA certificates and SSL certificates in the certificate repository.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 1,000 for a single user. For your specific QPS limit, refer to the certificate repository. If you exceed this limit, API calls are throttled, which may affect your business. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of Verify  VerifyRequest
     * @return VerifyResponse
     */
    CompletableFuture<VerifyResponse> verify(VerifyRequest request);

}
