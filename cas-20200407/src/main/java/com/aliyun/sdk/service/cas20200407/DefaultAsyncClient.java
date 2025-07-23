// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cas20200407.models.*;
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
        this.version = "2020-04-07";
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
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CancelCertificateForPackageRequest  CancelCertificateForPackageRequestRequest
     * @return CancelCertificateForPackageRequestResponse
     */
    @Override
    public CompletableFuture<CancelCertificateForPackageRequestResponse> cancelCertificateForPackageRequest(CancelCertificateForPackageRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCertificateForPackageRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCertificateForPackageRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCertificateForPackageRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CancelOrderRequest  CancelOrderRequestRequest
     * @return CancelOrderRequestResponse
     */
    @Override
    public CompletableFuture<CancelOrderRequestResponse> cancelOrderRequest(CancelOrderRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOrderRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOrderRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOrderRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCertificateForPackageRequestResponse> createCertificateForPackageRequest(CreateCertificateForPackageRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCertificateForPackageRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCertificateForPackageRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCertificateForPackageRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCertificateRequestResponse> createCertificateRequest(CreateCertificateRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCertificateRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCertificateRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCertificateRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCertificateWithCsrRequestResponse> createCertificateWithCsrRequest(CreateCertificateWithCsrRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCertificateWithCsrRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCertificateWithCsrRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCertificateWithCsrRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCsr  CreateCsrRequest
     * @return CreateCsrResponse
     */
    @Override
    public CompletableFuture<CreateCsrResponse> createCsr(CreateCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After the task creation is completed, the task will be in the editing state. You need to call the UpdateDeploymentJobStatus interface to change the status to the pending state, otherwise the task will not be executed.</p>
     * 
     * @param request the request parameters of CreateDeploymentJob  CreateDeploymentJobRequest
     * @return CreateDeploymentJobResponse
     */
    @Override
    public CompletableFuture<CreateDeploymentJobResponse> createDeploymentJob(CreateDeploymentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeploymentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeploymentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeploymentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Decrypt  DecryptRequest
     * @return DecryptResponse
     */
    @Override
    public CompletableFuture<DecryptResponse> decrypt(DecryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Decrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCertificateRequestResponse> deleteCertificateRequest(DeleteCertificateRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCertificateRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCertificateRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCertificateRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCsr  DeleteCsrRequest
     * @return DeleteCsrResponse
     */
    @Override
    public CompletableFuture<DeleteCsrResponse> deleteCsr(DeleteCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeploymentJob  DeleteDeploymentJobRequest
     * @return DeleteDeploymentJobResponse
     */
    @Override
    public CompletableFuture<DeleteDeploymentJobResponse> deleteDeploymentJob(DeleteDeploymentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeploymentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeploymentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeploymentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeletePCACert operation to delete a private certificate from a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePCACert  DeletePCACertRequest
     * @return DeletePCACertResponse
     */
    @Override
    public CompletableFuture<DeletePCACertResponse> deletePCACert(DeletePCACertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePCACert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePCACertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePCACertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteUserCertificate  DeleteUserCertificateRequest
     * @return DeleteUserCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteUserCertificateResponse> deleteUserCertificate(DeleteUserCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUserCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkerResource  DeleteWorkerResourceRequest
     * @return DeleteWorkerResourceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkerResourceResponse> deleteWorkerResource(DeleteWorkerResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWorkerResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkerResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkerResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you do not complete the verification of the domain name ownership after you submit a certificate application, you can call this operation to obtain the information that is required to complete the verification. You can complete the verification of the domain name ownership based on the data returned. If you use the DNS verification method, you must complete the verification on the management platform of the domain name. If you use the file verification method, you must complete the verification on the DNS server.
     * The certificate authority (CA) reviews your certificate application only after you complete the verification of the domain name ownership. After the CA approves your certificate application, the CA issues the certificate. If a certificate is issued, you can call this operation to obtain the CA certificate and private key of the certificate.</p>
     * 
     * @param request the request parameters of DescribeCertificateState  DescribeCertificateStateRequest
     * @return DescribeCertificateStateResponse
     */
    @Override
    public CompletableFuture<DescribeCertificateStateResponse> describeCertificateState(DescribeCertificateStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCertificateState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCertificateStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCertificateStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCloudResourceStatus  DescribeCloudResourceStatusRequest
     * @return DescribeCloudResourceStatusResponse
     */
    @Override
    public CompletableFuture<DescribeCloudResourceStatusResponse> describeCloudResourceStatus(DescribeCloudResourceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudResourceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudResourceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudResourceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeploymentJob  DescribeDeploymentJobRequest
     * @return DescribeDeploymentJobResponse
     */
    @Override
    public CompletableFuture<DescribeDeploymentJobResponse> describeDeploymentJob(DescribeDeploymentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeploymentJobStatus  DescribeDeploymentJobStatusRequest
     * @return DescribeDeploymentJobStatusResponse
     */
    @Override
    public CompletableFuture<DescribeDeploymentJobStatusResponse> describeDeploymentJobStatus(DescribeDeploymentJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePackageState  DescribePackageStateRequest
     * @return DescribePackageStateResponse
     */
    @Override
    public CompletableFuture<DescribePackageStateResponse> describePackageState(DescribePackageStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePackageState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePackageStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePackageStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    @Override
    public CompletableFuture<EncryptResponse> encrypt(EncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Encrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCertWarehouseQuota  GetCertWarehouseQuotaRequest
     * @return GetCertWarehouseQuotaResponse
     */
    @Override
    public CompletableFuture<GetCertWarehouseQuotaResponse> getCertWarehouseQuota(GetCertWarehouseQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCertWarehouseQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCertWarehouseQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCertWarehouseQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCsrDetail  GetCsrDetailRequest
     * @return GetCsrDetailResponse
     */
    @Override
    public CompletableFuture<GetCsrDetailResponse> getCsrDetail(GetCsrDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCsrDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCsrDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCsrDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetUserCertificateDetail  GetUserCertificateDetailRequest
     * @return GetUserCertificateDetailResponse
     */
    @Override
    public CompletableFuture<GetUserCertificateDetailResponse> getUserCertificateDetail(GetUserCertificateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserCertificateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserCertificateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserCertificateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call the ListCertWarehouse operation to query certificate repositories.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListCertWarehouse  ListCertWarehouseRequest
     * @return ListCertWarehouseResponse
     */
    @Override
    public CompletableFuture<ListCertWarehouseResponse> listCertWarehouse(ListCertWarehouseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCertWarehouse").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCertWarehouseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCertWarehouseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCloudAccess  ListCloudAccessRequest
     * @return ListCloudAccessResponse
     */
    @Override
    public CompletableFuture<ListCloudAccessResponse> listCloudAccess(ListCloudAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCloudAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCloudAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCloudAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCloudResources  ListCloudResourcesRequest
     * @return ListCloudResourcesResponse
     */
    @Override
    public CompletableFuture<ListCloudResourcesResponse> listCloudResources(ListCloudResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCloudResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCloudResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCloudResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContact  ListContactRequest
     * @return ListContactResponse
     */
    @Override
    public CompletableFuture<ListContactResponse> listContact(ListContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCsr  ListCsrRequest
     * @return ListCsrResponse
     */
    @Override
    public CompletableFuture<ListCsrResponse> listCsr(ListCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeploymentJob  ListDeploymentJobRequest
     * @return ListDeploymentJobResponse
     */
    @Override
    public CompletableFuture<ListDeploymentJobResponse> listDeploymentJob(ListDeploymentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeploymentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeploymentJobCert  ListDeploymentJobCertRequest
     * @return ListDeploymentJobCertResponse
     */
    @Override
    public CompletableFuture<ListDeploymentJobCertResponse> listDeploymentJobCert(ListDeploymentJobCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeploymentJobCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentJobCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentJobCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeploymentJobResource  ListDeploymentJobResourceRequest
     * @return ListDeploymentJobResourceResponse
     */
    @Override
    public CompletableFuture<ListDeploymentJobResourceResponse> listDeploymentJobResource(ListDeploymentJobResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeploymentJobResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentJobResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentJobResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ListUserCertificateOrder operation to query the certificates or certificate orders of users. If you set OrderType to CERT or UPLOAD, certificates are returned. If you set OrderType to CPACK or BUY, certificate orders are returned.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListUserCertificateOrder  ListUserCertificateOrderRequest
     * @return ListUserCertificateOrderResponse
     */
    @Override
    public CompletableFuture<ListUserCertificateOrderResponse> listUserCertificateOrder(ListUserCertificateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserCertificateOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserCertificateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserCertificateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkerResource  ListWorkerResourceRequest
     * @return ListWorkerResourceResponse
     */
    @Override
    public CompletableFuture<ListWorkerResourceResponse> listWorkerResource(ListWorkerResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkerResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkerResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkerResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <p>You can call the RenewCertificateOrderForPackageRequest operation to submit a renewal application for a certificate only when the order of the certificate is in the expiring state. After the renewal is complete, a new certificate order whose status is pending application is generated. You must submit a certificate application for the new certificate order and install the new certificate after the new certificate is issued.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a> operation to query the status of a certificate application order. If the value of the <strong>Type</strong> response parameter is <strong>certificate</strong>, the certificate is issued.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RenewCertificateOrderForPackageRequest  RenewCertificateOrderForPackageRequestRequest
     * @return RenewCertificateOrderForPackageRequestResponse
     */
    @Override
    public CompletableFuture<RenewCertificateOrderForPackageRequestResponse> renewCertificateOrderForPackageRequest(RenewCertificateOrderForPackageRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewCertificateOrderForPackageRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewCertificateOrderForPackageRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewCertificateOrderForPackageRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the Sign operation to sign a private certificate in a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Sign  SignRequest
     * @return SignResponse
     */
    @Override
    public CompletableFuture<SignResponse> sign(SignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Sign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCsr  UpdateCsrRequest
     * @return UpdateCsrResponse
     */
    @Override
    public CompletableFuture<UpdateCsrResponse> updateCsr(UpdateCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDeploymentJob  UpdateDeploymentJobRequest
     * @return UpdateDeploymentJobResponse
     */
    @Override
    public CompletableFuture<UpdateDeploymentJobResponse> updateDeploymentJob(UpdateDeploymentJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeploymentJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeploymentJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeploymentJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDeploymentJobStatus  UpdateDeploymentJobStatusRequest
     * @return UpdateDeploymentJobStatusResponse
     */
    @Override
    public CompletableFuture<UpdateDeploymentJobStatusResponse> updateDeploymentJobStatus(UpdateDeploymentJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeploymentJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeploymentJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeploymentJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkerResourceStatus  UpdateWorkerResourceStatusRequest
     * @return UpdateWorkerResourceStatusResponse
     */
    @Override
    public CompletableFuture<UpdateWorkerResourceStatusResponse> updateWorkerResourceStatus(UpdateWorkerResourceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorkerResourceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkerResourceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkerResourceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadCsr  UploadCsrRequest
     * @return UploadCsrResponse
     */
    @Override
    public CompletableFuture<UploadCsrResponse> uploadCsr(UploadCsrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadCsr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadCsrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadCsrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UploadUserCertificate  UploadUserCertificateRequest
     * @return UploadUserCertificateResponse
     */
    @Override
    public CompletableFuture<UploadUserCertificateResponse> uploadUserCertificate(UploadUserCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadUserCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadUserCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadUserCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the Verify operation to verify the signature of a private certificate in a certificate application repository.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of Verify  VerifyRequest
     * @return VerifyResponse
     */
    @Override
    public CompletableFuture<VerifyResponse> verify(VerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Verify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
