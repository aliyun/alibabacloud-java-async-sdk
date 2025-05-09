// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.computenestsupplier20210521.models.*;
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
        this.product = "ComputeNestSupplier";
        this.version = "2021-05-21";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddServiceSharedAccounts  AddServiceSharedAccountsRequest
     * @return AddServiceSharedAccountsResponse
     */
    @Override
    public CompletableFuture<AddServiceSharedAccountsResponse> addServiceSharedAccounts(AddServiceSharedAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddServiceSharedAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddServiceSharedAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddServiceSharedAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApproveServiceUsage  ApproveServiceUsageRequest
     * @return ApproveServiceUsageResponse
     */
    @Override
    public CompletableFuture<ApproveServiceUsageResponse> approveServiceUsage(ApproveServiceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApproveServiceUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApproveServiceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApproveServiceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only service registration in the Submitted status can be canceled.</p>
     * 
     * @param request the request parameters of CancelServiceRegistration  CancelServiceRegistrationRequest
     * @return CancelServiceRegistrationResponse
     */
    @Override
    public CompletableFuture<CancelServiceRegistrationResponse> cancelServiceRegistration(CancelServiceRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelServiceRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelServiceRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelServiceRegistrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContinueDeployServiceInstance  ContinueDeployServiceInstanceRequest
     * @return ContinueDeployServiceInstanceResponse
     */
    @Override
    public CompletableFuture<ContinueDeployServiceInstanceResponse> continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContinueDeployServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContinueDeployServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContinueDeployServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateArtifact  CreateArtifactRequest
     * @return CreateArtifactResponse
     */
    @Override
    public CompletableFuture<CreateArtifactResponse> createArtifact(CreateArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateArtifact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    @Override
    public CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceInstance  CreateServiceInstanceRequest
     * @return CreateServiceInstanceResponse
     */
    @Override
    public CompletableFuture<CreateServiceInstanceResponse> createServiceInstance(CreateServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceTestCase  CreateServiceTestCaseRequest
     * @return CreateServiceTestCaseResponse
     */
    @Override
    public CompletableFuture<CreateServiceTestCaseResponse> createServiceTestCase(CreateServiceTestCaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceTestCase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceTestCaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceTestCaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceTestTask  CreateServiceTestTaskRequest
     * @return CreateServiceTestTaskResponse
     */
    @Override
    public CompletableFuture<CreateServiceTestTaskResponse> createServiceTestTask(CreateServiceTestTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceTestTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceTestTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceTestTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceUsage  CreateServiceUsageRequest
     * @return CreateServiceUsageResponse
     */
    @Override
    public CompletableFuture<CreateServiceUsageResponse> createServiceUsage(CreateServiceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSupplierRegistration  CreateSupplierRegistrationRequest
     * @return CreateSupplierRegistrationResponse
     */
    @Override
    public CompletableFuture<CreateSupplierRegistrationResponse> createSupplierRegistration(CreateSupplierRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSupplierRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSupplierRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSupplierRegistrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteArtifact  DeleteArtifactRequest
     * @return DeleteArtifactResponse
     */
    @Override
    public CompletableFuture<DeleteArtifactResponse> deleteArtifact(DeleteArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteArtifact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    @Override
    public CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceInstances  DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    @Override
    public CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceTestCase  DeleteServiceTestCaseRequest
     * @return DeleteServiceTestCaseResponse
     */
    @Override
    public CompletableFuture<DeleteServiceTestCaseResponse> deleteServiceTestCase(DeleteServiceTestCaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceTestCase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceTestCaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceTestCaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployServiceInstance  DeployServiceInstanceRequest
     * @return DeployServiceInstanceResponse
     */
    @Override
    public CompletableFuture<DeployServiceInstanceResponse> deployServiceInstance(DeployServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateDefaultServiceTestConfig  GenerateDefaultServiceTestConfigRequest
     * @return GenerateDefaultServiceTestConfigResponse
     */
    @Override
    public CompletableFuture<GenerateDefaultServiceTestConfigResponse> generateDefaultServiceTestConfig(GenerateDefaultServiceTestConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDefaultServiceTestConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDefaultServiceTestConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDefaultServiceTestConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateServicePolicy  GenerateServicePolicyRequest
     * @return GenerateServicePolicyResponse
     */
    @Override
    public CompletableFuture<GenerateServicePolicyResponse> generateServicePolicy(GenerateServicePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateServicePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateServicePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateServicePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    @Override
    public CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetArtifact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetArtifactRepositoryCredentials  GetArtifactRepositoryCredentialsRequest
     * @return GetArtifactRepositoryCredentialsResponse
     */
    @Override
    public CompletableFuture<GetArtifactRepositoryCredentialsResponse> getArtifactRepositoryCredentials(GetArtifactRepositoryCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetArtifactRepositoryCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetArtifactRepositoryCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetArtifactRepositoryCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    @Override
    public CompletableFuture<GetServiceResponse> getService(GetServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceEstimateCost  GetServiceEstimateCostRequest
     * @return GetServiceEstimateCostResponse
     */
    @Override
    public CompletableFuture<GetServiceEstimateCostResponse> getServiceEstimateCost(GetServiceEstimateCostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceEstimateCost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEstimateCostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEstimateCostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceInstance  GetServiceInstanceRequest
     * @return GetServiceInstanceResponse
     */
    @Override
    public CompletableFuture<GetServiceInstanceResponse> getServiceInstance(GetServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceProvisions  GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    @Override
    public CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceProvisions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceProvisionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceProvisionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceRegistration  GetServiceRegistrationRequest
     * @return GetServiceRegistrationResponse
     */
    @Override
    public CompletableFuture<GetServiceRegistrationResponse> getServiceRegistration(GetServiceRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceRegistrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceTemplateParameterConstraints  GetServiceTemplateParameterConstraintsRequest
     * @return GetServiceTemplateParameterConstraintsResponse
     */
    @Override
    public CompletableFuture<GetServiceTemplateParameterConstraintsResponse> getServiceTemplateParameterConstraints(GetServiceTemplateParameterConstraintsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceTemplateParameterConstraints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceTemplateParameterConstraintsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceTemplateParameterConstraintsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceTestTask  GetServiceTestTaskRequest
     * @return GetServiceTestTaskResponse
     */
    @Override
    public CompletableFuture<GetServiceTestTaskResponse> getServiceTestTask(GetServiceTestTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceTestTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceTestTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceTestTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSupplierInformation  GetSupplierInformationRequest
     * @return GetSupplierInformationResponse
     */
    @Override
    public CompletableFuture<GetSupplierInformationResponse> getSupplierInformation(GetSupplierInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSupplierInformation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSupplierInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSupplierInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUploadCredentials  GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     */
    @Override
    public CompletableFuture<GetUploadCredentialsResponse> getUploadCredentials(GetUploadCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUploadCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LaunchService  LaunchServiceRequest
     * @return LaunchServiceResponse
     */
    @Override
    public CompletableFuture<LaunchServiceResponse> launchService(LaunchServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LaunchService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LaunchServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LaunchServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAcrImageRepositories  ListAcrImageRepositoriesRequest
     * @return ListAcrImageRepositoriesResponse
     */
    @Override
    public CompletableFuture<ListAcrImageRepositoriesResponse> listAcrImageRepositories(ListAcrImageRepositoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAcrImageRepositories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAcrImageRepositoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAcrImageRepositoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAcrImageTags  ListAcrImageTagsRequest
     * @return ListAcrImageTagsResponse
     */
    @Override
    public CompletableFuture<ListAcrImageTagsResponse> listAcrImageTags(ListAcrImageTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAcrImageTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAcrImageTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAcrImageTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListArtifactRisks  ListArtifactRisksRequest
     * @return ListArtifactRisksResponse
     */
    @Override
    public CompletableFuture<ListArtifactRisksResponse> listArtifactRisks(ListArtifactRisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListArtifactRisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListArtifactRisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListArtifactRisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListArtifactVersions  ListArtifactVersionsRequest
     * @return ListArtifactVersionsResponse
     */
    @Override
    public CompletableFuture<ListArtifactVersionsResponse> listArtifactVersions(ListArtifactVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListArtifactVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListArtifactVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListArtifactVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListArtifacts  ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    @Override
    public CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListArtifacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListArtifactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListArtifactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResellers  ListResellersRequest
     * @return ListResellersResponse
     */
    @Override
    public CompletableFuture<ListResellersResponse> listResellers(ListResellersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResellers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResellersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResellersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceBill  ListServiceInstanceBillRequest
     * @return ListServiceInstanceBillResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceBillResponse> listServiceInstanceBill(ListServiceInstanceBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceDeployDetails  ListServiceInstanceDeployDetailsRequest
     * @return ListServiceInstanceDeployDetailsResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceDeployDetailsResponse> listServiceInstanceDeployDetails(ListServiceInstanceDeployDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceDeployDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceDeployDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceDeployDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceLogs  ListServiceInstanceLogsRequest
     * @return ListServiceInstanceLogsResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceLogsResponse> listServiceInstanceLogs(ListServiceInstanceLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceResources  ListServiceInstanceResourcesRequest
     * @return ListServiceInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceResourcesResponse> listServiceInstanceResources(ListServiceInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstanceUpgradeHistory  ListServiceInstanceUpgradeHistoryRequest
     * @return ListServiceInstanceUpgradeHistoryResponse
     */
    @Override
    public CompletableFuture<ListServiceInstanceUpgradeHistoryResponse> listServiceInstanceUpgradeHistory(ListServiceInstanceUpgradeHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstanceUpgradeHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstanceUpgradeHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstanceUpgradeHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceInstances  ListServiceInstancesRequest
     * @return ListServiceInstancesResponse
     */
    @Override
    public CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceRegistrations  ListServiceRegistrationsRequest
     * @return ListServiceRegistrationsResponse
     */
    @Override
    public CompletableFuture<ListServiceRegistrationsResponse> listServiceRegistrations(ListServiceRegistrationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceRegistrations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceRegistrationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceRegistrationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceSharedAccounts  ListServiceSharedAccountsRequest
     * @return ListServiceSharedAccountsResponse
     */
    @Override
    public CompletableFuture<ListServiceSharedAccountsResponse> listServiceSharedAccounts(ListServiceSharedAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceSharedAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceSharedAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceSharedAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceTestCases  ListServiceTestCasesRequest
     * @return ListServiceTestCasesResponse
     */
    @Override
    public CompletableFuture<ListServiceTestCasesResponse> listServiceTestCases(ListServiceTestCasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceTestCases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceTestCasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceTestCasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceTestTaskLogs  ListServiceTestTaskLogsRequest
     * @return ListServiceTestTaskLogsResponse
     */
    @Override
    public CompletableFuture<ListServiceTestTaskLogsResponse> listServiceTestTaskLogs(ListServiceTestTaskLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceTestTaskLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceTestTaskLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceTestTaskLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceTestTasks  ListServiceTestTasksRequest
     * @return ListServiceTestTasksResponse
     */
    @Override
    public CompletableFuture<ListServiceTestTasksResponse> listServiceTestTasks(ListServiceTestTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceTestTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceTestTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceTestTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceUsages  ListServiceUsagesRequest
     * @return ListServiceUsagesResponse
     */
    @Override
    public CompletableFuture<ListServiceUsagesResponse> listServiceUsages(ListServiceUsagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceUsages").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceUsagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceUsagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    @Override
    public CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSupplierRegistrations  ListSupplierRegistrationsRequest
     * @return ListSupplierRegistrationsResponse
     */
    @Override
    public CompletableFuture<ListSupplierRegistrationsResponse> listSupplierRegistrations(ListSupplierRegistrationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSupplierRegistrations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupplierRegistrationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupplierRegistrationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyServiceInstanceResources  ModifyServiceInstanceResourcesRequest
     * @return ModifyServiceInstanceResourcesResponse
     */
    @Override
    public CompletableFuture<ModifyServiceInstanceResourcesResponse> modifyServiceInstanceResources(ModifyServiceInstanceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyServiceInstanceResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyServiceInstanceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyServiceInstanceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreLaunchService  PreLaunchServiceRequest
     * @return PreLaunchServiceResponse
     */
    @Override
    public CompletableFuture<PreLaunchServiceResponse> preLaunchService(PreLaunchServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreLaunchService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreLaunchServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreLaunchServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    @Override
    public CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushMeteringData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushMeteringDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushMeteringDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterService  RegisterServiceRequest
     * @return RegisterServiceResponse
     */
    @Override
    public CompletableFuture<RegisterServiceResponse> registerService(RegisterServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RejectServiceUsage  RejectServiceUsageRequest
     * @return RejectServiceUsageResponse
     */
    @Override
    public CompletableFuture<RejectServiceUsageResponse> rejectServiceUsage(RejectServiceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectServiceUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectServiceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectServiceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseArtifact  ReleaseArtifactRequest
     * @return ReleaseArtifactResponse
     */
    @Override
    public CompletableFuture<ReleaseArtifactResponse> releaseArtifact(ReleaseArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseArtifact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveServiceSharedAccounts  RemoveServiceSharedAccountsRequest
     * @return RemoveServiceSharedAccountsResponse
     */
    @Override
    public CompletableFuture<RemoveServiceSharedAccountsResponse> removeServiceSharedAccounts(RemoveServiceSharedAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveServiceSharedAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveServiceSharedAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveServiceSharedAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartServiceInstance  RestartServiceInstanceRequest
     * @return RestartServiceInstanceResponse
     */
    @Override
    public CompletableFuture<RestartServiceInstanceResponse> restartServiceInstance(RestartServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackServiceInstance  RollbackServiceInstanceRequest
     * @return RollbackServiceInstanceResponse
     */
    @Override
    public CompletableFuture<RollbackServiceInstanceResponse> rollbackServiceInstance(RollbackServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartServiceInstance  StartServiceInstanceRequest
     * @return StartServiceInstanceResponse
     */
    @Override
    public CompletableFuture<StartServiceInstanceResponse> startServiceInstance(StartServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopServiceInstance  StopServiceInstanceRequest
     * @return StopServiceInstanceResponse
     */
    @Override
    public CompletableFuture<StopServiceInstanceResponse> stopServiceInstance(StopServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    @Override
    public CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateArtifact  UpdateArtifactRequest
     * @return UpdateArtifactResponse
     */
    @Override
    public CompletableFuture<UpdateArtifactResponse> updateArtifact(UpdateArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateArtifact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    @Override
    public CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServiceInstanceAttribute  UpdateServiceInstanceAttributeRequest
     * @return UpdateServiceInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateServiceInstanceAttributeResponse> updateServiceInstanceAttribute(UpdateServiceInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServiceInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServiceInstanceSpec  UpdateServiceInstanceSpecRequest
     * @return UpdateServiceInstanceSpecResponse
     */
    @Override
    public CompletableFuture<UpdateServiceInstanceSpecResponse> updateServiceInstanceSpec(UpdateServiceInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServiceInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServiceTestCase  UpdateServiceTestCaseRequest
     * @return UpdateServiceTestCaseResponse
     */
    @Override
    public CompletableFuture<UpdateServiceTestCaseResponse> updateServiceTestCase(UpdateServiceTestCaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServiceTestCase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceTestCaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceTestCaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSharedAccountPermission  UpdateSharedAccountPermissionRequest
     * @return UpdateSharedAccountPermissionResponse
     */
    @Override
    public CompletableFuture<UpdateSharedAccountPermissionResponse> updateSharedAccountPermission(UpdateSharedAccountPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSharedAccountPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSharedAccountPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSharedAccountPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSupplierInformation  UpdateSupplierInformationRequest
     * @return UpdateSupplierInformationResponse
     */
    @Override
    public CompletableFuture<UpdateSupplierInformationResponse> updateSupplierInformation(UpdateSupplierInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSupplierInformation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSupplierInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSupplierInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeServiceInstance  UpgradeServiceInstanceRequest
     * @return UpgradeServiceInstanceResponse
     */
    @Override
    public CompletableFuture<UpgradeServiceInstanceResponse> upgradeServiceInstance(UpgradeServiceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeServiceInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeServiceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeServiceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WithdrawService  WithdrawServiceRequest
     * @return WithdrawServiceResponse
     */
    @Override
    public CompletableFuture<WithdrawServiceResponse> withdrawService(WithdrawServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WithdrawService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WithdrawServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WithdrawServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
