// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sas20181203.models.*;
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
        this.product = "Sas";
        this.version = "2018-12-03";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing", "tds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "tds.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "tds.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tds.aliyuncs.com"),
            new TeaPair("cn-nanjing", "tds.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tds.aliyuncs.com"),
            new TeaPair("cn-heyuan", "tds.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tds.aliyuncs.com"),
            new TeaPair("eu-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "tds.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "tds.aliyuncs.com"),
            new TeaPair("cn-qingdao-acdr-ut-1", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-mybk", "tds.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "tds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "tds.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddAssetSelectionCriteria  AddAssetSelectionCriteriaRequest
     * @return AddAssetSelectionCriteriaResponse
     */
    @Override
    public CompletableFuture<AddAssetSelectionCriteriaResponse> addAssetSelectionCriteria(AddAssetSelectionCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAssetSelectionCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAssetSelectionCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAssetSelectionCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddBaselineCheckWhiteRecord  AddBaselineCheckWhiteRecordRequest
     * @return AddBaselineCheckWhiteRecordResponse
     */
    @Override
    public CompletableFuture<AddBaselineCheckWhiteRecordResponse> addBaselineCheckWhiteRecord(AddBaselineCheckWhiteRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBaselineCheckWhiteRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBaselineCheckWhiteRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBaselineCheckWhiteRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCheckInstanceResultWhiteList  AddCheckInstanceResultWhiteListRequest
     * @return AddCheckInstanceResultWhiteListResponse
     */
    @Override
    public CompletableFuture<AddCheckInstanceResultWhiteListResponse> addCheckInstanceResultWhiteList(AddCheckInstanceResultWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCheckInstanceResultWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCheckInstanceResultWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCheckInstanceResultWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCheckResultWhiteList  AddCheckResultWhiteListRequest
     * @return AddCheckResultWhiteListResponse
     */
    @Override
    public CompletableFuture<AddCheckResultWhiteListResponse> addCheckResultWhiteList(AddCheckResultWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCheckResultWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCheckResultWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCheckResultWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddClientUserDefineRule  AddClientUserDefineRuleRequest
     * @return AddClientUserDefineRuleResponse
     */
    @Override
    public CompletableFuture<AddClientUserDefineRuleResponse> addClientUserDefineRule(AddClientUserDefineRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddClientUserDefineRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddClientUserDefineRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddClientUserDefineRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCloudVendorAccountAK  AddCloudVendorAccountAKRequest
     * @return AddCloudVendorAccountAKResponse
     */
    @Override
    public CompletableFuture<AddCloudVendorAccountAKResponse> addCloudVendorAccountAK(AddCloudVendorAccountAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCloudVendorAccountAK").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCloudVendorAccountAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCloudVendorAccountAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddContainerDefenseRule  AddContainerDefenseRuleRequest
     * @return AddContainerDefenseRuleResponse
     */
    @Override
    public CompletableFuture<AddContainerDefenseRuleResponse> addContainerDefenseRule(AddContainerDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddContainerDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddContainerDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddContainerDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddContainerPluginRule  AddContainerPluginRuleRequest
     * @return AddContainerPluginRuleResponse
     */
    @Override
    public CompletableFuture<AddContainerPluginRuleResponse> addContainerPluginRule(AddContainerPluginRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddContainerPluginRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddContainerPluginRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddContainerPluginRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Security Center allows you to create an IDC probe only on servers on which the Security Center agent is installed.</p>
     * 
     * @param request the request parameters of AddIdcProbe  AddIdcProbeRequest
     * @return AddIdcProbeResponse
     */
    @Override
    public CompletableFuture<AddIdcProbeResponse> addIdcProbe(AddIdcProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddIdcProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddIdcProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddIdcProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddImageEventOperation  AddImageEventOperationRequest
     * @return AddImageEventOperationResponse
     */
    @Override
    public CompletableFuture<AddImageEventOperationResponse> addImageEventOperation(AddImageEventOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddImageEventOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddImageEventOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddImageEventOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddImageVulWhiteList  AddImageVulWhiteListRequest
     * @return AddImageVulWhiteListResponse
     */
    @Override
    public CompletableFuture<AddImageVulWhiteListResponse> addImageVulWhiteList(AddImageVulWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddImageVulWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddImageVulWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddImageVulWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddInstallCode  AddInstallCodeRequest
     * @return AddInstallCodeResponse
     */
    @Override
    public CompletableFuture<AddInstallCodeResponse> addInstallCode(AddInstallCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddInstallCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddInstallCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddInstallCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPrivateRegistry  AddPrivateRegistryRequest
     * @return AddPrivateRegistryResponse
     */
    @Override
    public CompletableFuture<AddPrivateRegistryResponse> addPrivateRegistry(AddPrivateRegistryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPrivateRegistry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPrivateRegistryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPrivateRegistryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPublishBatch  AddPublishBatchRequest
     * @return AddPublishBatchResponse
     */
    @Override
    public CompletableFuture<AddPublishBatchResponse> addPublishBatch(AddPublishBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPublishBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPublishBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPublishBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSasContainerWebDefenseRule  AddSasContainerWebDefenseRuleRequest
     * @return AddSasContainerWebDefenseRuleResponse
     */
    @Override
    public CompletableFuture<AddSasContainerWebDefenseRuleResponse> addSasContainerWebDefenseRule(AddSasContainerWebDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSasContainerWebDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSasContainerWebDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSasContainerWebDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSasModuleTrial  AddSasModuleTrialRequest
     * @return AddSasModuleTrialResponse
     */
    @Override
    public CompletableFuture<AddSasModuleTrialResponse> addSasModuleTrial(AddSasModuleTrialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSasModuleTrial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSasModuleTrialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSasModuleTrialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Security Center provides asset importance tags and custom tags. You can call the AddTagWithUuid operation to add only a custom tag to assets.</p>
     * 
     * @param request the request parameters of AddTagWithUuid  AddTagWithUuidRequest
     * @return AddTagWithUuidResponse
     */
    @Override
    public CompletableFuture<AddTagWithUuidResponse> addTagWithUuid(AddTagWithUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTagWithUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagWithUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagWithUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddUninstallClientsByUuids  AddUninstallClientsByUuidsRequest
     * @return AddUninstallClientsByUuidsResponse
     */
    @Override
    public CompletableFuture<AddUninstallClientsByUuidsResponse> addUninstallClientsByUuids(AddUninstallClientsByUuidsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUninstallClientsByUuids").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUninstallClientsByUuidsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUninstallClientsByUuidsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddVpcHoneyPot  AddVpcHoneyPotRequest
     * @return AddVpcHoneyPotResponse
     */
    @Override
    public CompletableFuture<AddVpcHoneyPotResponse> addVpcHoneyPot(AddVpcHoneyPotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVpcHoneyPot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVpcHoneyPotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVpcHoneyPotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AdvanceSecurityEventOperations  AdvanceSecurityEventOperationsRequest
     * @return AdvanceSecurityEventOperationsResponse
     */
    @Override
    public CompletableFuture<AdvanceSecurityEventOperationsResponse> advanceSecurityEventOperations(AdvanceSecurityEventOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AdvanceSecurityEventOperations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AdvanceSecurityEventOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AdvanceSecurityEventOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateMaliciousNote  BatchCreateMaliciousNoteRequest
     * @return BatchCreateMaliciousNoteResponse
     */
    @Override
    public CompletableFuture<BatchCreateMaliciousNoteResponse> batchCreateMaliciousNote(BatchCreateMaliciousNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateMaliciousNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateMaliciousNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateMaliciousNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeleteMaliciousFileWhitelistConfig  BatchDeleteMaliciousFileWhitelistConfigRequest
     * @return BatchDeleteMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<BatchDeleteMaliciousFileWhitelistConfigResponse> batchDeleteMaliciousFileWhitelistConfig(BatchDeleteMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchOperateCommonOverallConfig  BatchOperateCommonOverallConfigRequest
     * @return BatchOperateCommonOverallConfigResponse
     */
    @Override
    public CompletableFuture<BatchOperateCommonOverallConfigResponse> batchOperateCommonOverallConfig(BatchOperateCommonOverallConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchOperateCommonOverallConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchOperateCommonOverallConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchOperateCommonOverallConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUpdateMaliciousFileWhitelistConfig  BatchUpdateMaliciousFileWhitelistConfigRequest
     * @return BatchUpdateMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<BatchUpdateMaliciousFileWhitelistConfigResponse> batchUpdateMaliciousFileWhitelistConfig(BatchUpdateMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUpdateMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindAuthToMachine  BindAuthToMachineRequest
     * @return BindAuthToMachineResponse
     */
    @Override
    public CompletableFuture<BindAuthToMachineResponse> bindAuthToMachine(BindAuthToMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindAuthToMachine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindAuthToMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindAuthToMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindHybridProxy  BindHybridProxyRequest
     * @return BindHybridProxyResponse
     */
    @Override
    public CompletableFuture<BindHybridProxyResponse> bindHybridProxy(BindHybridProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindHybridProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindHybridProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindHybridProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelOnceTask  CancelOnceTaskRequest
     * @return CancelOnceTaskResponse
     */
    @Override
    public CompletableFuture<CancelOnceTaskResponse> cancelOnceTask(CancelOnceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOnceTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOnceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOnceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeAssetRefreshTaskConfig  ChangeAssetRefreshTaskConfigRequest
     * @return ChangeAssetRefreshTaskConfigResponse
     */
    @Override
    public CompletableFuture<ChangeAssetRefreshTaskConfigResponse> changeAssetRefreshTaskConfig(ChangeAssetRefreshTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeAssetRefreshTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeAssetRefreshTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeAssetRefreshTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeCheckConfig  ChangeCheckConfigRequest
     * @return ChangeCheckConfigResponse
     */
    @Override
    public CompletableFuture<ChangeCheckConfigResponse> changeCheckConfig(ChangeCheckConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeCheckConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeCheckConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeCheckConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeCheckCustomConfig  ChangeCheckCustomConfigRequest
     * @return ChangeCheckCustomConfigResponse
     */
    @Override
    public CompletableFuture<ChangeCheckCustomConfigResponse> changeCheckCustomConfig(ChangeCheckCustomConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeCheckCustomConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeCheckCustomConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeCheckCustomConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeSecurityScoreRule  ChangeSecurityScoreRuleRequest
     * @return ChangeSecurityScoreRuleResponse
     */
    @Override
    public CompletableFuture<ChangeSecurityScoreRuleResponse> changeSecurityScoreRule(ChangeSecurityScoreRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeSecurityScoreRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeSecurityScoreRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeSecurityScoreRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeUserLang  ChangeUserLangRequest
     * @return ChangeUserLangResponse
     */
    @Override
    public CompletableFuture<ChangeUserLangResponse> changeUserLang(ChangeUserLangRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeUserLang").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeUserLangResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeUserLangResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CheckQuaraFileId is deprecated  * @param request  the request parameters of CheckQuaraFileId  CheckQuaraFileIdRequest
     * @return CheckQuaraFileIdResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CheckQuaraFileIdResponse> checkQuaraFileId(CheckQuaraFileIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckQuaraFileId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckQuaraFileIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckQuaraFileIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckSecurityEventId  CheckSecurityEventIdRequest
     * @return CheckSecurityEventIdResponse
     */
    @Override
    public CompletableFuture<CheckSecurityEventIdResponse> checkSecurityEventId(CheckSecurityEventIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckSecurityEventId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckSecurityEventIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckSecurityEventIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckStsTokenAuth  CheckStsTokenAuthRequest
     * @return CheckStsTokenAuthResponse
     */
    @Override
    public CompletableFuture<CheckStsTokenAuthResponse> checkStsTokenAuth(CheckStsTokenAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckStsTokenAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckStsTokenAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckStsTokenAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to check whether the remaining quota of the vulnerability fixing feature is sufficient in free trial scenarios. This operation does not trigger vulnerability fixing.</p>
     * 
     * @param request the request parameters of CheckTrialFixCount  CheckTrialFixCountRequest
     * @return CheckTrialFixCountResponse
     */
    @Override
    public CompletableFuture<CheckTrialFixCountResponse> checkTrialFixCount(CheckTrialFixCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckTrialFixCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckTrialFixCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckTrialFixCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckUserHasEcs  CheckUserHasEcsRequest
     * @return CheckUserHasEcsResponse
     */
    @Override
    public CompletableFuture<CheckUserHasEcsResponse> checkUserHasEcs(CheckUserHasEcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckUserHasEcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckUserHasEcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckUserHasEcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConfirmVirusEvents  ConfirmVirusEventsRequest
     * @return ConfirmVirusEventsResponse
     */
    @Override
    public CompletableFuture<ConfirmVirusEventsResponse> confirmVirusEvents(ConfirmVirusEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmVirusEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmVirusEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmVirusEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyCustomizeReportConfig  CopyCustomizeReportConfigRequest
     * @return CopyCustomizeReportConfigResponse
     */
    @Override
    public CompletableFuture<CopyCustomizeReportConfigResponse> copyCustomizeReportConfig(CopyCustomizeReportConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyCustomizeReportConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyCustomizeReportConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyCustomizeReportConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgentlessScanTask  CreateAgentlessScanTaskRequest
     * @return CreateAgentlessScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateAgentlessScanTaskResponse> createAgentlessScanTask(CreateAgentlessScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgentlessScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentlessScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentlessScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAntiBruteForceRule  CreateAntiBruteForceRuleRequest
     * @return CreateAntiBruteForceRuleResponse
     */
    @Override
    public CompletableFuture<CreateAntiBruteForceRuleResponse> createAntiBruteForceRule(CreateAntiBruteForceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAntiBruteForceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAntiBruteForceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAntiBruteForceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAssetSelectionConfig  CreateAssetSelectionConfigRequest
     * @return CreateAssetSelectionConfigResponse
     */
    @Override
    public CompletableFuture<CreateAssetSelectionConfigResponse> createAssetSelectionConfig(CreateAssetSelectionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAssetSelectionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAssetSelectionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAssetSelectionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAttestor  CreateAttestorRequest
     * @return CreateAttestorResponse
     */
    @Override
    public CompletableFuture<CreateAttestorResponse> createAttestor(CreateAttestorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAttestor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAttestorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAttestorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBackupPolicy  CreateBackupPolicyRequest
     * @return CreateBackupPolicyResponse
     */
    @Override
    public CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBinarySecurityPolicy  CreateBinarySecurityPolicyRequest
     * @return CreateBinarySecurityPolicyResponse
     */
    @Override
    public CompletableFuture<CreateBinarySecurityPolicyResponse> createBinarySecurityPolicy(CreateBinarySecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBinarySecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBinarySecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBinarySecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContainerScanTask  CreateContainerScanTaskRequest
     * @return CreateContainerScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateContainerScanTaskResponse> createContainerScanTask(CreateContainerScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContainerScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContainerScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContainerScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContainerScanTaskByAppName  CreateContainerScanTaskByAppNameRequest
     * @return CreateContainerScanTaskByAppNameResponse
     */
    @Override
    public CompletableFuture<CreateContainerScanTaskByAppNameResponse> createContainerScanTaskByAppName(CreateContainerScanTaskByAppNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContainerScanTaskByAppName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContainerScanTaskByAppNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContainerScanTaskByAppNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomBlockRecord  CreateCustomBlockRecordRequest
     * @return CreateCustomBlockRecordResponse
     */
    @Override
    public CompletableFuture<CreateCustomBlockRecordResponse> createCustomBlockRecord(CreateCustomBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomizedDict  CreateCustomizedDictRequest
     * @return CreateCustomizedDictResponse
     */
    @Override
    public CompletableFuture<CreateCustomizedDictResponse> createCustomizedDict(CreateCustomizedDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomizedDict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomizedDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomizedDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCycleTask  CreateCycleTaskRequest
     * @return CreateCycleTaskResponse
     */
    @Override
    public CompletableFuture<CreateCycleTaskResponse> createCycleTask(CreateCycleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCycleTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCycleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCycleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDynamicDict  CreateDynamicDictRequest
     * @return CreateDynamicDictResponse
     */
    @Override
    public CompletableFuture<CreateDynamicDictResponse> createDynamicDict(CreateDynamicDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDynamicDict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDynamicDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDynamicDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to push a file to the cloud for detection. Before you call this operation, make sure that the file is uploaded. You can call the CreateFileDetectUploadUrl operation to upload the file.
     * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.</p>
     * 
     * @param request the request parameters of CreateFileDetect  CreateFileDetectRequest
     * @return CreateFileDetectResponse
     */
    @Override
    public CompletableFuture<CreateFileDetectResponse> createFileDetect(CreateFileDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the parameters that are required to upload a file for detection. If the value of the response parameter FileExist is true, the file that you want to upload for detection already exists in the cloud. In this case, you can directly push the file for detection. If the value of the response parameter FileExist is false, you must use the form upload method to upload the file to the specified Object Storage Service (OSS) bucket based on the response parameters of this operation.
     * The form upload method is provided by OSS. For more information, see <a href="https://help.aliyun.com/document_detail/84788.html">Form upload</a>.
     * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.</p>
     * 
     * @param request the request parameters of CreateFileDetectUploadUrl  CreateFileDetectUploadUrlRequest
     * @return CreateFileDetectUploadUrlResponse
     */
    @Override
    public CompletableFuture<CreateFileDetectUploadUrlResponse> createFileDetectUploadUrl(CreateFileDetectUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileDetectUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileDetectUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileDetectUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFileProtectRule  CreateFileProtectRuleRequest
     * @return CreateFileProtectRuleResponse
     */
    @Override
    public CompletableFuture<CreateFileProtectRuleResponse> createFileProtectRule(CreateFileProtectRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileProtectRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileProtectRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileProtectRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFileUploadLimit  CreateFileUploadLimitRequest
     * @return CreateFileUploadLimitResponse
     */
    @Override
    public CompletableFuture<CreateFileUploadLimitResponse> createFileUploadLimit(CreateFileUploadLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileUploadLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileUploadLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileUploadLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoneypot  CreateHoneypotRequest
     * @return CreateHoneypotResponse
     */
    @Override
    public CompletableFuture<CreateHoneypotResponse> createHoneypot(CreateHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoneypotNode  CreateHoneypotNodeRequest
     * @return CreateHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<CreateHoneypotNodeResponse> createHoneypotNode(CreateHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoneypotPreset  CreateHoneypotPresetRequest
     * @return CreateHoneypotPresetResponse
     */
    @Override
    public CompletableFuture<CreateHoneypotPresetResponse> createHoneypotPreset(CreateHoneypotPresetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHoneypotPreset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoneypotPresetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoneypotPresetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoneypotProbe  CreateHoneypotProbeRequest
     * @return CreateHoneypotProbeResponse
     */
    @Override
    public CompletableFuture<CreateHoneypotProbeResponse> createHoneypotProbe(CreateHoneypotProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHoneypotProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoneypotProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoneypotProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHoneypotProbeBind  CreateHoneypotProbeBindRequest
     * @return CreateHoneypotProbeBindResponse
     */
    @Override
    public CompletableFuture<CreateHoneypotProbeBindResponse> createHoneypotProbeBind(CreateHoneypotProbeBindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHoneypotProbeBind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHoneypotProbeBindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHoneypotProbeBindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHybridProxyCluster  CreateHybridProxyClusterRequest
     * @return CreateHybridProxyClusterResponse
     */
    @Override
    public CompletableFuture<CreateHybridProxyClusterResponse> createHybridProxyCluster(CreateHybridProxyClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHybridProxyCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHybridProxyClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHybridProxyClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInterceptionRule  CreateInterceptionRuleRequest
     * @return CreateInterceptionRuleResponse
     */
    @Override
    public CompletableFuture<CreateInterceptionRuleResponse> createInterceptionRule(CreateInterceptionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInterceptionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInterceptionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInterceptionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInterceptionTarget  CreateInterceptionTargetRequest
     * @return CreateInterceptionTargetResponse
     */
    @Override
    public CompletableFuture<CreateInterceptionTargetResponse> createInterceptionTarget(CreateInterceptionTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInterceptionTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInterceptionTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInterceptionTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateJenkinsImageRegistry  CreateJenkinsImageRegistryRequest
     * @return CreateJenkinsImageRegistryResponse
     */
    @Override
    public CompletableFuture<CreateJenkinsImageRegistryResponse> createJenkinsImageRegistry(CreateJenkinsImageRegistryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateJenkinsImageRegistry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJenkinsImageRegistryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJenkinsImageRegistryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateJenkinsImageScanTask  CreateJenkinsImageScanTaskRequest
     * @return CreateJenkinsImageScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateJenkinsImageScanTaskResponse> createJenkinsImageScanTask(CreateJenkinsImageScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateJenkinsImageScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJenkinsImageScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJenkinsImageScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMaliciousFileWhitelistConfig  CreateMaliciousFileWhitelistConfigRequest
     * @return CreateMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<CreateMaliciousFileWhitelistConfigResponse> createMaliciousFileWhitelistConfig(CreateMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMaliciousNote  CreateMaliciousNoteRequest
     * @return CreateMaliciousNoteResponse
     */
    @Override
    public CompletableFuture<CreateMaliciousNoteResponse> createMaliciousNote(CreateMaliciousNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMaliciousNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMaliciousNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMaliciousNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the management account of a resource directory or a delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of CreateMonitorAccount  CreateMonitorAccountRequest
     * @return CreateMonitorAccountResponse
     */
    @Override
    public CompletableFuture<CreateMonitorAccountResponse> createMonitorAccount(CreateMonitorAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOpaClusterPlugin  CreateOpaClusterPluginRequest
     * @return CreateOpaClusterPluginResponse
     */
    @Override
    public CompletableFuture<CreateOpaClusterPluginResponse> createOpaClusterPlugin(CreateOpaClusterPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOpaClusterPlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOpaClusterPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOpaClusterPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOpaStrategyNew  CreateOpaStrategyNewRequest
     * @return CreateOpaStrategyNewResponse
     */
    @Override
    public CompletableFuture<CreateOpaStrategyNewResponse> createOpaStrategyNew(CreateOpaStrategyNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOpaStrategyNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOpaStrategyNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOpaStrategyNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A server can belong only to one server group. If you call the CreateOrUpdateAssetGroup operation and the server specified in request parameters belongs to Server Group A, the server is removed from Server Group A and then added to the newly created or specified server group after the call is complete.</p>
     * 
     * @param request the request parameters of CreateOrUpdateAssetGroup  CreateOrUpdateAssetGroupRequest
     * @return CreateOrUpdateAssetGroupResponse
     */
    @Override
    public CompletableFuture<CreateOrUpdateAssetGroupResponse> createOrUpdateAssetGroup(CreateOrUpdateAssetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrUpdateAssetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrUpdateAssetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrUpdateAssetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrUpdateAutoTagRule  CreateOrUpdateAutoTagRuleRequest
     * @return CreateOrUpdateAutoTagRuleResponse
     */
    @Override
    public CompletableFuture<CreateOrUpdateAutoTagRuleResponse> createOrUpdateAutoTagRule(CreateOrUpdateAutoTagRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrUpdateAutoTagRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrUpdateAutoTagRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrUpdateAutoTagRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrUpdateDingTalk  CreateOrUpdateDingTalkRequest
     * @return CreateOrUpdateDingTalkResponse
     */
    @Override
    public CompletableFuture<CreateOrUpdateDingTalkResponse> createOrUpdateDingTalk(CreateOrUpdateDingTalkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrUpdateDingTalk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrUpdateDingTalkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrUpdateDingTalkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOssBucketScanTask  CreateOssBucketScanTaskRequest
     * @return CreateOssBucketScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateOssBucketScanTaskResponse> createOssBucketScanTask(CreateOssBucketScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOssBucketScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOssBucketScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOssBucketScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOssScanConfig  CreateOssScanConfigRequest
     * @return CreateOssScanConfigResponse
     */
    @Override
    public CompletableFuture<CreateOssScanConfigResponse> createOssScanConfig(CreateOssScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOssScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOssScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOssScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the management account of a resource directory or a delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of CreateRdDefaultSyncList  CreateRdDefaultSyncListRequest
     * @return CreateRdDefaultSyncListResponse
     */
    @Override
    public CompletableFuture<CreateRdDefaultSyncListResponse> createRdDefaultSyncList(CreateRdDefaultSyncListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRdDefaultSyncList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRdDefaultSyncListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRdDefaultSyncListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRestoreJob  CreateRestoreJobRequest
     * @return CreateRestoreJobResponse
     */
    @Override
    public CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRestoreJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRestoreJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRestoreJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSasTrial  CreateSasTrialRequest
     * @return CreateSasTrialResponse
     */
    @Override
    public CompletableFuture<CreateSasTrialResponse> createSasTrial(CreateSasTrialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSasTrial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSasTrialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSasTrialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about service-linked roles, see <a href="https://help.aliyun.com/document_detail/160674.html">Service-linked roles</a>.</p>
     * 
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    @Override
    public CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceTrail  CreateServiceTrailRequest
     * @return CreateServiceTrailResponse
     */
    @Override
    public CompletableFuture<CreateServiceTrailResponse> createServiceTrail(CreateServiceTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSimilarSecurityEventsQueryTask  CreateSimilarSecurityEventsQueryTaskRequest
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    @Override
    public CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimilarSecurityEventsQueryTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSimilarSecurityEventsQueryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of CreateSoarStrategyTask  CreateSoarStrategyTaskRequest
     * @return CreateSoarStrategyTaskResponse
     */
    @Override
    public CompletableFuture<CreateSoarStrategyTaskResponse> createSoarStrategyTask(CreateSoarStrategyTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSoarStrategyTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSoarStrategyTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSoarStrategyTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSuspEventNote  CreateSuspEventNoteRequest
     * @return CreateSuspEventNoteResponse
     */
    @Override
    public CompletableFuture<CreateSuspEventNoteResponse> createSuspEventNote(CreateSuspEventNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSuspEventNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSuspEventNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSuspEventNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUniBackupPolicy  CreateUniBackupPolicyRequest
     * @return CreateUniBackupPolicyResponse
     */
    @Override
    public CompletableFuture<CreateUniBackupPolicyResponse> createUniBackupPolicy(CreateUniBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUniBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUniBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUniBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUniRestorePlan  CreateUniRestorePlanRequest
     * @return CreateUniRestorePlanResponse
     */
    @Override
    public CompletableFuture<CreateUniRestorePlanResponse> createUniRestorePlan(CreateUniRestorePlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUniRestorePlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUniRestorePlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUniRestorePlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUserSetting  CreateUserSettingRequest
     * @return CreateUserSettingResponse
     */
    @Override
    public CompletableFuture<CreateUserSettingResponse> createUserSetting(CreateUserSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUserSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVirusScanOnceTask  CreateVirusScanOnceTaskRequest
     * @return CreateVirusScanOnceTaskResponse
     */
    @Override
    public CompletableFuture<CreateVirusScanOnceTaskResponse> createVirusScanOnceTask(CreateVirusScanOnceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirusScanOnceTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirusScanOnceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirusScanOnceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVulAutoRepairConfig  CreateVulAutoRepairConfigRequest
     * @return CreateVulAutoRepairConfigResponse
     */
    @Override
    public CompletableFuture<CreateVulAutoRepairConfigResponse> createVulAutoRepairConfig(CreateVulAutoRepairConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVulAutoRepairConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVulAutoRepairConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVulAutoRepairConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAntiBruteForceRule  DeleteAntiBruteForceRuleRequest
     * @return DeleteAntiBruteForceRuleResponse
     */
    @Override
    public CompletableFuture<DeleteAntiBruteForceRuleResponse> deleteAntiBruteForceRule(DeleteAntiBruteForceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAntiBruteForceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAntiBruteForceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAntiBruteForceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAttestor  DeleteAttestorRequest
     * @return DeleteAttestorResponse
     */
    @Override
    public CompletableFuture<DeleteAttestorResponse> deleteAttestor(DeleteAttestorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAttestor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAttestorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAttestorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAutoTagRules  DeleteAutoTagRulesRequest
     * @return DeleteAutoTagRulesResponse
     */
    @Override
    public CompletableFuture<DeleteAutoTagRulesResponse> deleteAutoTagRules(DeleteAutoTagRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoTagRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoTagRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoTagRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackupPolicy  DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackupPolicyMachine  DeleteBackupPolicyMachineRequest
     * @return DeleteBackupPolicyMachineResponse
     */
    @Override
    public CompletableFuture<DeleteBackupPolicyMachineResponse> deleteBackupPolicyMachine(DeleteBackupPolicyMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupPolicyMachine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupPolicyMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupPolicyMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackupSnapshot  DeleteBackupSnapshotRequest
     * @return DeleteBackupSnapshotResponse
     */
    @Override
    public CompletableFuture<DeleteBackupSnapshotResponse> deleteBackupSnapshot(DeleteBackupSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBaselineCheckWhiteRecord  DeleteBaselineCheckWhiteRecordRequest
     * @return DeleteBaselineCheckWhiteRecordResponse
     */
    @Override
    public CompletableFuture<DeleteBaselineCheckWhiteRecordResponse> deleteBaselineCheckWhiteRecord(DeleteBaselineCheckWhiteRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBaselineCheckWhiteRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBaselineCheckWhiteRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBaselineCheckWhiteRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBinarySecurityPolicy  DeleteBinarySecurityPolicyRequest
     * @return DeleteBinarySecurityPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteBinarySecurityPolicyResponse> deleteBinarySecurityPolicy(DeleteBinarySecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBinarySecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBinarySecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBinarySecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClientUserDefineRule  DeleteClientUserDefineRuleRequest
     * @return DeleteClientUserDefineRuleResponse
     */
    @Override
    public CompletableFuture<DeleteClientUserDefineRuleResponse> deleteClientUserDefineRule(DeleteClientUserDefineRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientUserDefineRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientUserDefineRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientUserDefineRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCloudVendorAccountAK  DeleteCloudVendorAccountAKRequest
     * @return DeleteCloudVendorAccountAKResponse
     */
    @Override
    public CompletableFuture<DeleteCloudVendorAccountAKResponse> deleteCloudVendorAccountAK(DeleteCloudVendorAccountAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCloudVendorAccountAK").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCloudVendorAccountAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCloudVendorAccountAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContainerDefenseRule  DeleteContainerDefenseRuleRequest
     * @return DeleteContainerDefenseRuleResponse
     */
    @Override
    public CompletableFuture<DeleteContainerDefenseRuleResponse> deleteContainerDefenseRule(DeleteContainerDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContainerDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContainerDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContainerDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContainerPluginRule  DeleteContainerPluginRuleRequest
     * @return DeleteContainerPluginRuleResponse
     */
    @Override
    public CompletableFuture<DeleteContainerPluginRuleResponse> deleteContainerPluginRule(DeleteContainerPluginRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContainerPluginRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContainerPluginRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContainerPluginRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomBlockRecord  DeleteCustomBlockRecordRequest
     * @return DeleteCustomBlockRecordResponse
     */
    @Override
    public CompletableFuture<DeleteCustomBlockRecordResponse> deleteCustomBlockRecord(DeleteCustomBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomizeReport  DeleteCustomizeReportRequest
     * @return DeleteCustomizeReportResponse
     */
    @Override
    public CompletableFuture<DeleteCustomizeReportResponse> deleteCustomizeReport(DeleteCustomizeReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomizeReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomizeReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomizeReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomizedDict  DeleteCustomizedDictRequest
     * @return DeleteCustomizedDictResponse
     */
    @Override
    public CompletableFuture<DeleteCustomizedDictResponse> deleteCustomizedDict(DeleteCustomizedDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomizedDict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomizedDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomizedDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCycleTask  DeleteCycleTaskRequest
     * @return DeleteCycleTaskResponse
     */
    @Override
    public CompletableFuture<DeleteCycleTaskResponse> deleteCycleTask(DeleteCycleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCycleTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCycleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCycleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDingTalk  DeleteDingTalkRequest
     * @return DeleteDingTalkResponse
     */
    @Override
    public CompletableFuture<DeleteDingTalkResponse> deleteDingTalk(DeleteDingTalkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDingTalk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDingTalkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDingTalkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFileProtectRule  DeleteFileProtectRuleRequest
     * @return DeleteFileProtectRuleResponse
     */
    @Override
    public CompletableFuture<DeleteFileProtectRuleResponse> deleteFileProtectRule(DeleteFileProtectRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFileProtectRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileProtectRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileProtectRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <strong>Default</strong> server group that is provided by Security Center cannot be deleted. After you delete a group, the assets in this group are moved to the <strong>Default</strong> group.</p>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    @Override
    public CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoneypot  DeleteHoneypotRequest
     * @return DeleteHoneypotResponse
     */
    @Override
    public CompletableFuture<DeleteHoneypotResponse> deleteHoneypot(DeleteHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoneypotNode  DeleteHoneypotNodeRequest
     * @return DeleteHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<DeleteHoneypotNodeResponse> deleteHoneypotNode(DeleteHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoneypotPreset  DeleteHoneypotPresetRequest
     * @return DeleteHoneypotPresetResponse
     */
    @Override
    public CompletableFuture<DeleteHoneypotPresetResponse> deleteHoneypotPreset(DeleteHoneypotPresetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHoneypotPreset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoneypotPresetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoneypotPresetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoneypotProbe  DeleteHoneypotProbeRequest
     * @return DeleteHoneypotProbeResponse
     */
    @Override
    public CompletableFuture<DeleteHoneypotProbeResponse> deleteHoneypotProbe(DeleteHoneypotProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHoneypotProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoneypotProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoneypotProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHoneypotProbeBind  DeleteHoneypotProbeBindRequest
     * @return DeleteHoneypotProbeBindResponse
     */
    @Override
    public CompletableFuture<DeleteHoneypotProbeBindResponse> deleteHoneypotProbeBind(DeleteHoneypotProbeBindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHoneypotProbeBind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHoneypotProbeBindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHoneypotProbeBindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHybridProxy  DeleteHybridProxyRequest
     * @return DeleteHybridProxyResponse
     */
    @Override
    public CompletableFuture<DeleteHybridProxyResponse> deleteHybridProxy(DeleteHybridProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHybridProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHybridProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHybridProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHybridProxyCluster  DeleteHybridProxyClusterRequest
     * @return DeleteHybridProxyClusterResponse
     */
    @Override
    public CompletableFuture<DeleteHybridProxyClusterResponse> deleteHybridProxyCluster(DeleteHybridProxyClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHybridProxyCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHybridProxyClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHybridProxyClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIdcProbe  DeleteIdcProbeRequest
     * @return DeleteIdcProbeResponse
     */
    @Override
    public CompletableFuture<DeleteIdcProbeResponse> deleteIdcProbe(DeleteIdcProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIdcProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIdcProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIdcProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteImageEventOperation  DeleteImageEventOperationRequest
     * @return DeleteImageEventOperationResponse
     */
    @Override
    public CompletableFuture<DeleteImageEventOperationResponse> deleteImageEventOperation(DeleteImageEventOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImageEventOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageEventOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageEventOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteImageVulWhitelist  DeleteImageVulWhitelistRequest
     * @return DeleteImageVulWhitelistResponse
     */
    @Override
    public CompletableFuture<DeleteImageVulWhitelistResponse> deleteImageVulWhitelist(DeleteImageVulWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImageVulWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageVulWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageVulWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstallCode  DeleteInstallCodeRequest
     * @return DeleteInstallCodeResponse
     */
    @Override
    public CompletableFuture<DeleteInstallCodeResponse> deleteInstallCode(DeleteInstallCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstallCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstallCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstallCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInterceptionRule  DeleteInterceptionRuleRequest
     * @return DeleteInterceptionRuleResponse
     */
    @Override
    public CompletableFuture<DeleteInterceptionRuleResponse> deleteInterceptionRule(DeleteInterceptionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInterceptionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInterceptionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInterceptionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInterceptionTarget  DeleteInterceptionTargetRequest
     * @return DeleteInterceptionTargetResponse
     */
    @Override
    public CompletableFuture<DeleteInterceptionTargetResponse> deleteInterceptionTarget(DeleteInterceptionTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInterceptionTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInterceptionTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInterceptionTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sAccessInfo  DeleteK8sAccessInfoRequest
     * @return DeleteK8sAccessInfoResponse
     */
    @Override
    public CompletableFuture<DeleteK8sAccessInfoResponse> deleteK8sAccessInfo(DeleteK8sAccessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteK8sAccessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sAccessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sAccessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLoginBaseConfig  DeleteLoginBaseConfigRequest
     * @return DeleteLoginBaseConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLoginBaseConfigResponse> deleteLoginBaseConfig(DeleteLoginBaseConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoginBaseConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoginBaseConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoginBaseConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMaliciousFileWhitelistConfig  DeleteMaliciousFileWhitelistConfigRequest
     * @return DeleteMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<DeleteMaliciousFileWhitelistConfigResponse> deleteMaliciousFileWhitelistConfig(DeleteMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMaliciousNote  DeleteMaliciousNoteRequest
     * @return DeleteMaliciousNoteResponse
     */
    @Override
    public CompletableFuture<DeleteMaliciousNoteResponse> deleteMaliciousNote(DeleteMaliciousNoteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMaliciousNote").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMaliciousNoteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMaliciousNoteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the management account of your resource directory or a delegated administrator account of Security Center to call this operation.</p>
     * 
     * @param request the request parameters of DeleteMonitorAccount  DeleteMonitorAccountRequest
     * @return DeleteMonitorAccountResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorAccountResponse> deleteMonitorAccount(DeleteMonitorAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOpaStrategyNew  DeleteOpaStrategyNewRequest
     * @return DeleteOpaStrategyNewResponse
     */
    @Override
    public CompletableFuture<DeleteOpaStrategyNewResponse> deleteOpaStrategyNew(DeleteOpaStrategyNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOpaStrategyNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOpaStrategyNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOpaStrategyNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOssScanConfig  DeleteOssScanConfigRequest
     * @return DeleteOssScanConfigResponse
     */
    @Override
    public CompletableFuture<DeleteOssScanConfigResponse> deleteOssScanConfig(DeleteOssScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOssScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOssScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOssScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivateRegistry  DeletePrivateRegistryRequest
     * @return DeletePrivateRegistryResponse
     */
    @Override
    public CompletableFuture<DeletePrivateRegistryResponse> deletePrivateRegistry(DeletePrivateRegistryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrivateRegistry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivateRegistryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivateRegistryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSasContainerWebDefenseRule  DeleteSasContainerWebDefenseRuleRequest
     * @return DeleteSasContainerWebDefenseRuleResponse
     */
    @Override
    public CompletableFuture<DeleteSasContainerWebDefenseRuleResponse> deleteSasContainerWebDefenseRule(DeleteSasContainerWebDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSasContainerWebDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSasContainerWebDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSasContainerWebDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSearchCondition  DeleteSearchConditionRequest
     * @return DeleteSearchConditionResponse
     */
    @Override
    public CompletableFuture<DeleteSearchConditionResponse> deleteSearchCondition(DeleteSearchConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSearchCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSearchConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSearchConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteSecurityEventMarkMissList is deprecated, please use Sas::2018-12-03::ModifySecurityEventMarkMissIndividually instead.  * @param request  the request parameters of DeleteSecurityEventMarkMissList  DeleteSecurityEventMarkMissListRequest
     * @return DeleteSecurityEventMarkMissListResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteSecurityEventMarkMissListResponse> deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityEventMarkMissList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityEventMarkMissListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityEventMarkMissListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceTrail  DeleteServiceTrailRequest
     * @return DeleteServiceTrailResponse
     */
    @Override
    public CompletableFuture<DeleteServiceTrailResponse> deleteServiceTrail(DeleteServiceTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DeleteSoarStrategyTask  DeleteSoarStrategyTaskRequest
     * @return DeleteSoarStrategyTaskResponse
     */
    @Override
    public CompletableFuture<DeleteSoarStrategyTaskResponse> deleteSoarStrategyTask(DeleteSoarStrategyTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSoarStrategyTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSoarStrategyTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSoarStrategyTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStrategy  DeleteStrategyRequest
     * @return DeleteStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteStrategyResponse> deleteStrategy(DeleteStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSuspEventNode  DeleteSuspEventNodeRequest
     * @return DeleteSuspEventNodeResponse
     */
    @Override
    public CompletableFuture<DeleteSuspEventNodeResponse> deleteSuspEventNode(DeleteSuspEventNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSuspEventNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSuspEventNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSuspEventNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Security Center provides asset importance tags and custom tags. You can call this operation to remove only the custom tag that is added to an asset.</p>
     * 
     * @param request the request parameters of DeleteTagWithUuid  DeleteTagWithUuidRequest
     * @return DeleteTagWithUuidResponse
     */
    @Override
    public CompletableFuture<DeleteTagWithUuidResponse> deleteTagWithUuid(DeleteTagWithUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTagWithUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTagWithUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTagWithUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUniBackupPolicy  DeleteUniBackupPolicyRequest
     * @return DeleteUniBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteUniBackupPolicyResponse> deleteUniBackupPolicy(DeleteUniBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUniBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUniBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUniBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVpcHoneyPot  DeleteVpcHoneyPotRequest
     * @return DeleteVpcHoneyPotResponse
     */
    @Override
    public CompletableFuture<DeleteVpcHoneyPotResponse> deleteVpcHoneyPot(DeleteVpcHoneyPotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcHoneyPot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcHoneyPotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcHoneyPotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVulAutoRepairConfig  DeleteVulAutoRepairConfigRequest
     * @return DeleteVulAutoRepairConfigResponse
     */
    @Override
    public CompletableFuture<DeleteVulAutoRepairConfigResponse> deleteVulAutoRepairConfig(DeleteVulAutoRepairConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVulAutoRepairConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVulAutoRepairConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVulAutoRepairConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVulWhitelist  DeleteVulWhitelistRequest
     * @return DeleteVulWhitelistResponse
     */
    @Override
    public CompletableFuture<DeleteVulWhitelistResponse> deleteVulWhitelist(DeleteVulWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVulWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVulWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVulWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessKeyLeakDetail  DescribeAccessKeyLeakDetailRequest
     * @return DescribeAccessKeyLeakDetailResponse
     */
    @Override
    public CompletableFuture<DescribeAccessKeyLeakDetailResponse> describeAccessKeyLeakDetail(DescribeAccessKeyLeakDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessKeyLeakDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessKeyLeakDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessKeyLeakDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccesskeyLeakList  DescribeAccesskeyLeakListRequest
     * @return DescribeAccesskeyLeakListResponse
     */
    @Override
    public CompletableFuture<DescribeAccesskeyLeakListResponse> describeAccesskeyLeakList(DescribeAccesskeyLeakListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccesskeyLeakList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccesskeyLeakListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccesskeyLeakListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAffectedAssets  DescribeAffectedAssetsRequest
     * @return DescribeAffectedAssetsResponse
     */
    @Override
    public CompletableFuture<DescribeAffectedAssetsResponse> describeAffectedAssets(DescribeAffectedAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAffectedAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAffectedAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAffectedAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAffectedMaliciousFileImages  DescribeAffectedMaliciousFileImagesRequest
     * @return DescribeAffectedMaliciousFileImagesResponse
     */
    @Override
    public CompletableFuture<DescribeAffectedMaliciousFileImagesResponse> describeAffectedMaliciousFileImages(DescribeAffectedMaliciousFileImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAffectedMaliciousFileImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAffectedMaliciousFileImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAffectedMaliciousFileImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAgentInstallStatus  DescribeAgentInstallStatusRequest
     * @return DescribeAgentInstallStatusResponse
     */
    @Override
    public CompletableFuture<DescribeAgentInstallStatusResponse> describeAgentInstallStatus(DescribeAgentInstallStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAgentInstallStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAgentInstallStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAgentInstallStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the agentless detection feature is purchased by using the pay-as-you-go billing method within your Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of DescribeAgentlessSensitiveFileByKey  DescribeAgentlessSensitiveFileByKeyRequest
     * @return DescribeAgentlessSensitiveFileByKeyResponse
     */
    @Override
    public CompletableFuture<DescribeAgentlessSensitiveFileByKeyResponse> describeAgentlessSensitiveFileByKey(DescribeAgentlessSensitiveFileByKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAgentlessSensitiveFileByKey").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAgentlessSensitiveFileByKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAgentlessSensitiveFileByKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAlarmEventDetail  DescribeAlarmEventDetailRequest
     * @return DescribeAlarmEventDetailResponse
     */
    @Override
    public CompletableFuture<DescribeAlarmEventDetailResponse> describeAlarmEventDetail(DescribeAlarmEventDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlarmEventDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlarmEventDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlarmEventDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAlarmEventStackInfo  DescribeAlarmEventStackInfoRequest
     * @return DescribeAlarmEventStackInfoResponse
     */
    @Override
    public CompletableFuture<DescribeAlarmEventStackInfoResponse> describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlarmEventStackInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlarmEventStackInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlarmEventStackInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAllEntity  DescribeAllEntityRequest
     * @return DescribeAllEntityResponse
     */
    @Override
    public CompletableFuture<DescribeAllEntityResponse> describeAllEntity(DescribeAllEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAllEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAllEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAllEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAllGroups  DescribeAllGroupsRequest
     * @return DescribeAllGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeAllGroupsResponse> describeAllGroups(DescribeAllGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAllGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAllGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAllGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAllImageBaseline  DescribeAllImageBaselineRequest
     * @return DescribeAllImageBaselineResponse
     */
    @Override
    public CompletableFuture<DescribeAllImageBaselineResponse> describeAllImageBaseline(DescribeAllImageBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAllImageBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAllImageBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAllImageBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAllRegionsStatistics  DescribeAllRegionsStatisticsRequest
     * @return DescribeAllRegionsStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeAllRegionsStatisticsResponse> describeAllRegionsStatistics(DescribeAllRegionsStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAllRegionsStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAllRegionsStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAllRegionsStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAntiBruteForceRules  DescribeAntiBruteForceRulesRequest
     * @return DescribeAntiBruteForceRulesResponse
     */
    @Override
    public CompletableFuture<DescribeAntiBruteForceRulesResponse> describeAntiBruteForceRules(DescribeAntiBruteForceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAntiBruteForceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAntiBruteForceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAntiBruteForceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAppVulScanCycle  DescribeAppVulScanCycleRequest
     * @return DescribeAppVulScanCycleResponse
     */
    @Override
    public CompletableFuture<DescribeAppVulScanCycleResponse> describeAppVulScanCycle(DescribeAppVulScanCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppVulScanCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppVulScanCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppVulScanCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeAssetDetailByUuid is deprecated, please use Sas::2018-12-03::GetAssetDetailByUuid instead.  * @description This operation will be discontinued soon. You must call the [GetAssetDetailByUuid](~~GetAssetDetailByUuid~~) operation to query the details of the server.
     * 
     * @param request the request parameters of DescribeAssetDetailByUuid  DescribeAssetDetailByUuidRequest
     * @return DescribeAssetDetailByUuidResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeAssetDetailByUuidResponse> describeAssetDetailByUuid(DescribeAssetDetailByUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetDetailByUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetDetailByUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetDetailByUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetDetailByUuids  DescribeAssetDetailByUuidsRequest
     * @return DescribeAssetDetailByUuidsResponse
     */
    @Override
    public CompletableFuture<DescribeAssetDetailByUuidsResponse> describeAssetDetailByUuids(DescribeAssetDetailByUuidsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetDetailByUuids").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetDetailByUuidsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetDetailByUuidsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetSummary  DescribeAssetSummaryRequest
     * @return DescribeAssetSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeAssetSummaryResponse> describeAssetSummary(DescribeAssetSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetsScaProcessNum  DescribeAssetsScaProcessNumRequest
     * @return DescribeAssetsScaProcessNumResponse
     */
    @Override
    public CompletableFuture<DescribeAssetsScaProcessNumResponse> describeAssetsScaProcessNum(DescribeAssetsScaProcessNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetsScaProcessNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetsScaProcessNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetsScaProcessNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetsSecurityEventSummary  DescribeAssetsSecurityEventSummaryRequest
     * @return DescribeAssetsSecurityEventSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeAssetsSecurityEventSummaryResponse> describeAssetsSecurityEventSummary(DescribeAssetsSecurityEventSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetsSecurityEventSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetsSecurityEventSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetsSecurityEventSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAttackAnalysisData  DescribeAttackAnalysisDataRequest
     * @return DescribeAttackAnalysisDataResponse
     */
    @Override
    public CompletableFuture<DescribeAttackAnalysisDataResponse> describeAttackAnalysisData(DescribeAttackAnalysisDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAttackAnalysisData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAttackAnalysisDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAttackAnalysisDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAttestors  DescribeAttestorsRequest
     * @return DescribeAttestorsResponse
     */
    @Override
    public CompletableFuture<DescribeAttestorsResponse> describeAttestors(DescribeAttestorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAttestors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAttestorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAttestorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAutoDelConfig  DescribeAutoDelConfigRequest
     * @return DescribeAutoDelConfigResponse
     */
    @Override
    public CompletableFuture<DescribeAutoDelConfigResponse> describeAutoDelConfig(DescribeAutoDelConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoDelConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoDelConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoDelConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackUpExportInfo  DescribeBackUpExportInfoRequest
     * @return DescribeBackUpExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeBackUpExportInfoResponse> describeBackUpExportInfo(DescribeBackUpExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackUpExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackUpExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackUpExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeBackupClients operation to query the servers on which the anti-ransomware agent is installed in a specified region.</p>
     * 
     * @param request the request parameters of DescribeBackupClients  DescribeBackupClientsRequest
     * @return DescribeBackupClientsResponse
     */
    @Override
    public CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupFiles  DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     */
    @Override
    public CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupMachineStatus  DescribeBackupMachineStatusRequest
     * @return DescribeBackupMachineStatusResponse
     */
    @Override
    public CompletableFuture<DescribeBackupMachineStatusResponse> describeBackupMachineStatus(DescribeBackupMachineStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupMachineStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupMachineStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupMachineStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupPolicies  DescribeBackupPoliciesRequest
     * @return DescribeBackupPoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have created restoration tasks, you can call this operation to query the number of restoration tasks that are in the <strong>restored</strong> or <strong>being restored</strong> state.</p>
     * 
     * @param request the request parameters of DescribeBackupRestoreCount  DescribeBackupRestoreCountRequest
     * @return DescribeBackupRestoreCountResponse
     */
    @Override
    public CompletableFuture<DescribeBackupRestoreCountResponse> describeBackupRestoreCount(DescribeBackupRestoreCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupRestoreCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupRestoreCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupRestoreCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBinarySecurityPolicies  DescribeBinarySecurityPoliciesRequest
     * @return DescribeBinarySecurityPoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeBinarySecurityPoliciesResponse> describeBinarySecurityPolicies(DescribeBinarySecurityPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBinarySecurityPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBinarySecurityPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBinarySecurityPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBruteForceRecords  DescribeBruteForceRecordsRequest
     * @return DescribeBruteForceRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeBruteForceRecordsResponse> describeBruteForceRecords(DescribeBruteForceRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBruteForceRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBruteForceRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBruteForceRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBruteForceSummary  DescribeBruteForceSummaryRequest
     * @return DescribeBruteForceSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeBruteForceSummaryResponse> describeBruteForceSummary(DescribeBruteForceSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBruteForceSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBruteForceSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBruteForceSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCanFixVulList  DescribeCanFixVulListRequest
     * @return DescribeCanFixVulListResponse
     */
    @Override
    public CompletableFuture<DescribeCanFixVulListResponse> describeCanFixVulList(DescribeCanFixVulListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCanFixVulList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCanFixVulListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCanFixVulListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCanTrySas  DescribeCanTrySasRequest
     * @return DescribeCanTrySasResponse
     */
    @Override
    public CompletableFuture<DescribeCanTrySasResponse> describeCanTrySas(DescribeCanTrySasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCanTrySas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCanTrySasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCanTrySasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeChartData  DescribeChartDataRequest
     * @return DescribeChartDataResponse
     */
    @Override
    public CompletableFuture<DescribeChartDataResponse> describeChartData(DescribeChartDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChartData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChartDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChartDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeChartList  DescribeChartListRequest
     * @return DescribeChartListResponse
     */
    @Override
    public CompletableFuture<DescribeChartListResponse> describeChartList(DescribeChartListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChartList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChartListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChartListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckEcsWarnings  DescribeCheckEcsWarningsRequest
     * @return DescribeCheckEcsWarningsResponse
     */
    @Override
    public CompletableFuture<DescribeCheckEcsWarningsResponse> describeCheckEcsWarnings(DescribeCheckEcsWarningsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckEcsWarnings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckEcsWarningsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckEcsWarningsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckFixDetails  DescribeCheckFixDetailsRequest
     * @return DescribeCheckFixDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeCheckFixDetailsResponse> describeCheckFixDetails(DescribeCheckFixDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckFixDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckFixDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckFixDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckResult  DescribeCheckResultRequest
     * @return DescribeCheckResultResponse
     */
    @Override
    public CompletableFuture<DescribeCheckResultResponse> describeCheckResult(DescribeCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckWarningCount  DescribeCheckWarningCountRequest
     * @return DescribeCheckWarningCountResponse
     */
    @Override
    public CompletableFuture<DescribeCheckWarningCountResponse> describeCheckWarningCount(DescribeCheckWarningCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckWarningCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckWarningCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckWarningCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckWarningDetail  DescribeCheckWarningDetailRequest
     * @return DescribeCheckWarningDetailResponse
     */
    @Override
    public CompletableFuture<DescribeCheckWarningDetailResponse> describeCheckWarningDetail(DescribeCheckWarningDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckWarningDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckWarningDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckWarningDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckWarningMachines  DescribeCheckWarningMachinesRequest
     * @return DescribeCheckWarningMachinesResponse
     */
    @Override
    public CompletableFuture<DescribeCheckWarningMachinesResponse> describeCheckWarningMachines(DescribeCheckWarningMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckWarningMachines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckWarningMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckWarningMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckWarningSummary  DescribeCheckWarningSummaryRequest
     * @return DescribeCheckWarningSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeCheckWarningSummaryResponse> describeCheckWarningSummary(DescribeCheckWarningSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckWarningSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckWarningSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckWarningSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckWarnings  DescribeCheckWarningsRequest
     * @return DescribeCheckWarningsResponse
     */
    @Override
    public CompletableFuture<DescribeCheckWarningsResponse> describeCheckWarnings(DescribeCheckWarningsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCheckWarnings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckWarningsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckWarningsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClientConfSetup  DescribeClientConfSetupRequest
     * @return DescribeClientConfSetupResponse
     */
    @Override
    public CompletableFuture<DescribeClientConfSetupResponse> describeClientConfSetup(DescribeClientConfSetupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientConfSetup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientConfSetupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientConfSetupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClientConfStrategy  DescribeClientConfStrategyRequest
     * @return DescribeClientConfStrategyResponse
     */
    @Override
    public CompletableFuture<DescribeClientConfStrategyResponse> describeClientConfStrategy(DescribeClientConfStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientConfStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientConfStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientConfStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClientProblemType  DescribeClientProblemTypeRequest
     * @return DescribeClientProblemTypeResponse
     */
    @Override
    public CompletableFuture<DescribeClientProblemTypeResponse> describeClientProblemType(DescribeClientProblemTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientProblemType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientProblemTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientProblemTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can search for an asset by using search conditions, such as the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can also configure a logical relationship between multiple search conditions to search for the assets that meet the search conditions.</p>
     * 
     * @param request the request parameters of DescribeCloudCenterInstances  DescribeCloudCenterInstancesRequest
     * @return DescribeCloudCenterInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeCloudCenterInstancesResponse> describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudCenterInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudCenterInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudCenterInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeCloudProductFieldStatistics is deprecated, please use Sas::2018-12-03::GetCloudAssetSummary instead.  * @param request  the request parameters of DescribeCloudProductFieldStatistics  DescribeCloudProductFieldStatisticsRequest
     * @return DescribeCloudProductFieldStatisticsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeCloudProductFieldStatisticsResponse> describeCloudProductFieldStatistics(DescribeCloudProductFieldStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudProductFieldStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudProductFieldStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudProductFieldStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCloudVendorAccountAKList  DescribeCloudVendorAccountAKListRequest
     * @return DescribeCloudVendorAccountAKListResponse
     */
    @Override
    public CompletableFuture<DescribeCloudVendorAccountAKListResponse> describeCloudVendorAccountAKList(DescribeCloudVendorAccountAKListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudVendorAccountAKList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudVendorAccountAKListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudVendorAccountAKListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterBasicInfo  DescribeClusterBasicInfoRequest
     * @return DescribeClusterBasicInfoResponse
     */
    @Override
    public CompletableFuture<DescribeClusterBasicInfoResponse> describeClusterBasicInfo(DescribeClusterBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterBasicInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterHostSecuritySummary  DescribeClusterHostSecuritySummaryRequest
     * @return DescribeClusterHostSecuritySummaryResponse
     */
    @Override
    public CompletableFuture<DescribeClusterHostSecuritySummaryResponse> describeClusterHostSecuritySummary(DescribeClusterHostSecuritySummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterHostSecuritySummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterHostSecuritySummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterHostSecuritySummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterImageSecuritySummary  DescribeClusterImageSecuritySummaryRequest
     * @return DescribeClusterImageSecuritySummaryResponse
     */
    @Override
    public CompletableFuture<DescribeClusterImageSecuritySummaryResponse> describeClusterImageSecuritySummary(DescribeClusterImageSecuritySummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterImageSecuritySummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterImageSecuritySummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterImageSecuritySummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterInfoList  DescribeClusterInfoListRequest
     * @return DescribeClusterInfoListResponse
     */
    @Override
    public CompletableFuture<DescribeClusterInfoListResponse> describeClusterInfoList(DescribeClusterInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterInfoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterNetwork  DescribeClusterNetworkRequest
     * @return DescribeClusterNetworkResponse
     */
    @Override
    public CompletableFuture<DescribeClusterNetworkResponse> describeClusterNetwork(DescribeClusterNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterVulStatistics  DescribeClusterVulStatisticsRequest
     * @return DescribeClusterVulStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterVulStatisticsResponse> describeClusterVulStatistics(DescribeClusterVulStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusterVulStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterVulStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterVulStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCommonOverallConfig  DescribeCommonOverallConfigRequest
     * @return DescribeCommonOverallConfigResponse
     */
    @Override
    public CompletableFuture<DescribeCommonOverallConfigResponse> describeCommonOverallConfig(DescribeCommonOverallConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonOverallConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonOverallConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonOverallConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCommonOverallConfigList  DescribeCommonOverallConfigListRequest
     * @return DescribeCommonOverallConfigListResponse
     */
    @Override
    public CompletableFuture<DescribeCommonOverallConfigListResponse> describeCommonOverallConfigList(DescribeCommonOverallConfigListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonOverallConfigList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonOverallConfigListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonOverallConfigListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCommonTargetConfig  DescribeCommonTargetConfigRequest
     * @return DescribeCommonTargetConfigResponse
     */
    @Override
    public CompletableFuture<DescribeCommonTargetConfigResponse> describeCommonTargetConfig(DescribeCommonTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCommonTargetResultList  DescribeCommonTargetResultListRequest
     * @return DescribeCommonTargetResultListResponse
     */
    @Override
    public CompletableFuture<DescribeCommonTargetResultListResponse> describeCommonTargetResultList(DescribeCommonTargetResultListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonTargetResultList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonTargetResultListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonTargetResultListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeConcernNecessity  DescribeConcernNecessityRequest
     * @return DescribeConcernNecessityResponse
     */
    @Override
    public CompletableFuture<DescribeConcernNecessityResponse> describeConcernNecessity(DescribeConcernNecessityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeConcernNecessity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeConcernNecessityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeConcernNecessityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerApps  DescribeContainerAppsRequest
     * @return DescribeContainerAppsResponse
     */
    @Override
    public CompletableFuture<DescribeContainerAppsResponse> describeContainerApps(DescribeContainerAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerCriteria  DescribeContainerCriteriaRequest
     * @return DescribeContainerCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeContainerCriteriaResponse> describeContainerCriteria(DescribeContainerCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerFieldStatistics  DescribeContainerFieldStatisticsRequest
     * @return DescribeContainerFieldStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeContainerFieldStatisticsResponse> describeContainerFieldStatistics(DescribeContainerFieldStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerFieldStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerFieldStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerFieldStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerGroupedFieldDetail  DescribeContainerGroupedFieldDetailRequest
     * @return DescribeContainerGroupedFieldDetailResponse
     */
    @Override
    public CompletableFuture<DescribeContainerGroupedFieldDetailResponse> describeContainerGroupedFieldDetail(DescribeContainerGroupedFieldDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroupedFieldDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupedFieldDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupedFieldDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerInstances  DescribeContainerInstancesRequest
     * @return DescribeContainerInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeContainerInstancesResponse> describeContainerInstances(DescribeContainerInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerScanConfig  DescribeContainerScanConfigRequest
     * @return DescribeContainerScanConfigResponse
     */
    @Override
    public CompletableFuture<DescribeContainerScanConfigResponse> describeContainerScanConfig(DescribeContainerScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerServiceK8sClusterKritisStatus  DescribeContainerServiceK8sClusterKritisStatusRequest
     * @return DescribeContainerServiceK8sClusterKritisStatusResponse
     */
    @Override
    public CompletableFuture<DescribeContainerServiceK8sClusterKritisStatusResponse> describeContainerServiceK8sClusterKritisStatus(DescribeContainerServiceK8sClusterKritisStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerServiceK8sClusterKritisStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerServiceK8sClusterKritisStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerServiceK8sClusterKritisStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerServiceK8sClusterNamespaces  DescribeContainerServiceK8sClusterNamespacesRequest
     * @return DescribeContainerServiceK8sClusterNamespacesResponse
     */
    @Override
    public CompletableFuture<DescribeContainerServiceK8sClusterNamespacesResponse> describeContainerServiceK8sClusterNamespaces(DescribeContainerServiceK8sClusterNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerServiceK8sClusterNamespaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerServiceK8sClusterNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerServiceK8sClusterNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerServiceK8sClusters  DescribeContainerServiceK8sClustersRequest
     * @return DescribeContainerServiceK8sClustersResponse
     */
    @Override
    public CompletableFuture<DescribeContainerServiceK8sClustersResponse> describeContainerServiceK8sClusters(DescribeContainerServiceK8sClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerServiceK8sClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerServiceK8sClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerServiceK8sClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only users who created a Container Registry Enterprise Edition instance can call this operation.</p>
     * 
     * @param request the request parameters of DescribeContainerStatistics  DescribeContainerStatisticsRequest
     * @return DescribeContainerStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeContainerStatisticsResponse> describeContainerStatistics(DescribeContainerStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerTags  DescribeContainerTagsRequest
     * @return DescribeContainerTagsResponse
     */
    @Override
    public CompletableFuture<DescribeContainerTagsResponse> describeContainerTags(DescribeContainerTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCountNotScannedImage  DescribeCountNotScannedImageRequest
     * @return DescribeCountNotScannedImageResponse
     */
    @Override
    public CompletableFuture<DescribeCountNotScannedImageResponse> describeCountNotScannedImage(DescribeCountNotScannedImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCountNotScannedImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCountNotScannedImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCountNotScannedImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCountScannedImage  DescribeCountScannedImageRequest
     * @return DescribeCountScannedImageResponse
     */
    @Override
    public CompletableFuture<DescribeCountScannedImageResponse> describeCountScannedImage(DescribeCountScannedImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCountScannedImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCountScannedImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCountScannedImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCriteria  DescribeCriteriaRequest
     * @return DescribeCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeCriteriaResponse> describeCriteria(DescribeCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomBlockInstances  DescribeCustomBlockInstancesRequest
     * @return DescribeCustomBlockInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeCustomBlockInstancesResponse> describeCustomBlockInstances(DescribeCustomBlockInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomBlockInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomBlockInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomBlockInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomBlockRecords  DescribeCustomBlockRecordsRequest
     * @return DescribeCustomBlockRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeCustomBlockRecordsResponse> describeCustomBlockRecords(DescribeCustomBlockRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomBlockRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomBlockRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomBlockRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomizeReportConfigDetail  DescribeCustomizeReportConfigDetailRequest
     * @return DescribeCustomizeReportConfigDetailResponse
     */
    @Override
    public CompletableFuture<DescribeCustomizeReportConfigDetailResponse> describeCustomizeReportConfigDetail(DescribeCustomizeReportConfigDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomizeReportConfigDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomizeReportConfigDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomizeReportConfigDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomizeReportList  DescribeCustomizeReportListRequest
     * @return DescribeCustomizeReportListResponse
     */
    @Override
    public CompletableFuture<DescribeCustomizeReportListResponse> describeCustomizeReportList(DescribeCustomizeReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomizeReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomizeReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomizeReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomizedDictUploadInfo  DescribeCustomizedDictUploadInfoRequest
     * @return DescribeCustomizedDictUploadInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCustomizedDictUploadInfoResponse> describeCustomizedDictUploadInfo(DescribeCustomizedDictUploadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomizedDictUploadInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomizedDictUploadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomizedDictUploadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCustomizedStrategyTargets  DescribeCustomizedStrategyTargetsRequest
     * @return DescribeCustomizedStrategyTargetsResponse
     */
    @Override
    public CompletableFuture<DescribeCustomizedStrategyTargetsResponse> describeCustomizedStrategyTargets(DescribeCustomizedStrategyTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomizedStrategyTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomizedStrategyTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomizedStrategyTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCycleTaskList  DescribeCycleTaskListRequest
     * @return DescribeCycleTaskListResponse
     */
    @Override
    public CompletableFuture<DescribeCycleTaskListResponse> describeCycleTaskList(DescribeCycleTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCycleTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCycleTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCycleTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataSource  DescribeDataSourceRequest
     * @return DescribeDataSourceResponse
     */
    @Override
    public CompletableFuture<DescribeDataSourceResponse> describeDataSource(DescribeDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDefaultKeyInfo  DescribeDefaultKeyInfoRequest
     * @return DescribeDefaultKeyInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDefaultKeyInfoResponse> describeDefaultKeyInfo(DescribeDefaultKeyInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDefaultKeyInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDefaultKeyInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDefaultKeyInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDefaultProxyInstallVersion  DescribeDefaultProxyInstallVersionRequest
     * @return DescribeDefaultProxyInstallVersionResponse
     */
    @Override
    public CompletableFuture<DescribeDefaultProxyInstallVersionResponse> describeDefaultProxyInstallVersion(DescribeDefaultProxyInstallVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDefaultProxyInstallVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDefaultProxyInstallVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDefaultProxyInstallVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDingTalk  DescribeDingTalkRequest
     * @return DescribeDingTalkResponse
     */
    @Override
    public CompletableFuture<DescribeDingTalkResponse> describeDingTalk(DescribeDingTalkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDingTalk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDingTalkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDingTalkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainCount  DescribeDomainCountRequest
     * @return DescribeDomainCountResponse
     */
    @Override
    public CompletableFuture<DescribeDomainCountResponse> describeDomainCount(DescribeDomainCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainDetail  DescribeDomainDetailRequest
     * @return DescribeDomainDetailResponse
     */
    @Override
    public CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainList  DescribeDomainListRequest
     * @return DescribeDomainListResponse
     */
    @Override
    public CompletableFuture<DescribeDomainListResponse> describeDomainList(DescribeDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainSecureAlarmList  DescribeDomainSecureAlarmListRequest
     * @return DescribeDomainSecureAlarmListResponse
     */
    @Override
    public CompletableFuture<DescribeDomainSecureAlarmListResponse> describeDomainSecureAlarmList(DescribeDomainSecureAlarmListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainSecureAlarmList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainSecureAlarmListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainSecureAlarmListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainSecureRiskList  DescribeDomainSecureRiskListRequest
     * @return DescribeDomainSecureRiskListResponse
     */
    @Override
    public CompletableFuture<DescribeDomainSecureRiskListResponse> describeDomainSecureRiskList(DescribeDomainSecureRiskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainSecureRiskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainSecureRiskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainSecureRiskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainSecureScore  DescribeDomainSecureScoreRequest
     * @return DescribeDomainSecureScoreResponse
     */
    @Override
    public CompletableFuture<DescribeDomainSecureScoreResponse> describeDomainSecureScore(DescribeDomainSecureScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainSecureScore").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainSecureScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainSecureScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainSecureStatistics  DescribeDomainSecureStatisticsRequest
     * @return DescribeDomainSecureStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeDomainSecureStatisticsResponse> describeDomainSecureStatistics(DescribeDomainSecureStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainSecureStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainSecureStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainSecureStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainSecureVulList  DescribeDomainSecureVulListRequest
     * @return DescribeDomainSecureVulListResponse
     */
    @Override
    public CompletableFuture<DescribeDomainSecureVulListResponse> describeDomainSecureVulList(DescribeDomainSecureVulListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainSecureVulList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainSecureVulListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainSecureVulListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDynamicDict  DescribeDynamicDictRequest
     * @return DescribeDynamicDictResponse
     */
    @Override
    public CompletableFuture<DescribeDynamicDictResponse> describeDynamicDict(DescribeDynamicDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDynamicDict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDynamicDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDynamicDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDynamicDictUploadInfo  DescribeDynamicDictUploadInfoRequest
     * @return DescribeDynamicDictUploadInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDynamicDictUploadInfoResponse> describeDynamicDictUploadInfo(DescribeDynamicDictUploadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDynamicDictUploadInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDynamicDictUploadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDynamicDictUploadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEmgUserAgreement  DescribeEmgUserAgreementRequest
     * @return DescribeEmgUserAgreementResponse
     */
    @Override
    public CompletableFuture<DescribeEmgUserAgreementResponse> describeEmgUserAgreement(DescribeEmgUserAgreementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEmgUserAgreement").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEmgUserAgreementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEmgUserAgreementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEmgVulItem  DescribeEmgVulItemRequest
     * @return DescribeEmgVulItemResponse
     */
    @Override
    public CompletableFuture<DescribeEmgVulItemResponse> describeEmgVulItem(DescribeEmgVulItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEmgVulItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEmgVulItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEmgVulItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEventLevelCount  DescribeEventLevelCountRequest
     * @return DescribeEventLevelCountResponse
     */
    @Override
    public CompletableFuture<DescribeEventLevelCountResponse> describeEventLevelCount(DescribeEventLevelCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventLevelCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventLevelCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventLevelCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEventOnStage  DescribeEventOnStageRequest
     * @return DescribeEventOnStageResponse
     */
    @Override
    public CompletableFuture<DescribeEventOnStageResponse> describeEventOnStage(DescribeEventOnStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventOnStage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventOnStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventOnStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExcludeSystemPath  DescribeExcludeSystemPathRequest
     * @return DescribeExcludeSystemPathResponse
     */
    @Override
    public CompletableFuture<DescribeExcludeSystemPathResponse> describeExcludeSystemPath(DescribeExcludeSystemPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExcludeSystemPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExcludeSystemPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExcludeSystemPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExportInfo  DescribeExportInfoRequest
     * @return DescribeExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeExportInfoResponse> describeExportInfo(DescribeExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedCheckWarning  DescribeExposedCheckWarningRequest
     * @return DescribeExposedCheckWarningResponse
     */
    @Override
    public CompletableFuture<DescribeExposedCheckWarningResponse> describeExposedCheckWarning(DescribeExposedCheckWarningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedCheckWarning").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedCheckWarningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedCheckWarningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedInstanceCriteria  DescribeExposedInstanceCriteriaRequest
     * @return DescribeExposedInstanceCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeExposedInstanceCriteriaResponse> describeExposedInstanceCriteria(DescribeExposedInstanceCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedInstanceCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedInstanceCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedInstanceCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedInstanceDetail  DescribeExposedInstanceDetailRequest
     * @return DescribeExposedInstanceDetailResponse
     */
    @Override
    public CompletableFuture<DescribeExposedInstanceDetailResponse> describeExposedInstanceDetail(DescribeExposedInstanceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedInstanceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedInstanceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedInstanceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedInstanceList  DescribeExposedInstanceListRequest
     * @return DescribeExposedInstanceListResponse
     */
    @Override
    public CompletableFuture<DescribeExposedInstanceListResponse> describeExposedInstanceList(DescribeExposedInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedStatistics  DescribeExposedStatisticsRequest
     * @return DescribeExposedStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeExposedStatisticsResponse> describeExposedStatistics(DescribeExposedStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExposedStatisticsDetail  DescribeExposedStatisticsDetailRequest
     * @return DescribeExposedStatisticsDetailResponse
     */
    @Override
    public CompletableFuture<DescribeExposedStatisticsDetailResponse> describeExposedStatisticsDetail(DescribeExposedStatisticsDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExposedStatisticsDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExposedStatisticsDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExposedStatisticsDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFieldStatistics  DescribeFieldStatisticsRequest
     * @return DescribeFieldStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeFieldStatisticsResponse> describeFieldStatistics(DescribeFieldStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFieldStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFieldStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFieldStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFixUsedCount  DescribeFixUsedCountRequest
     * @return DescribeFixUsedCountResponse
     */
    @Override
    public CompletableFuture<DescribeFixUsedCountResponse> describeFixUsedCount(DescribeFixUsedCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFixUsedCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFixUsedCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFixUsedCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFrontVulPatchList  DescribeFrontVulPatchListRequest
     * @return DescribeFrontVulPatchListResponse
     */
    @Override
    public CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFrontVulPatchList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFrontVulPatchListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFrontVulPatchListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupStruct  DescribeGroupStructRequest
     * @return DescribeGroupStructResponse
     */
    @Override
    public CompletableFuture<DescribeGroupStructResponse> describeGroupStruct(DescribeGroupStructRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupStruct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupStructResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupStructResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupedContainerInstances  DescribeGroupedContainerInstancesRequest
     * @return DescribeGroupedContainerInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeGroupedContainerInstancesResponse> describeGroupedContainerInstances(DescribeGroupedContainerInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupedContainerInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupedContainerInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupedContainerInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupedInstances  DescribeGroupedInstancesRequest
     * @return DescribeGroupedInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeGroupedInstancesResponse> describeGroupedInstances(DescribeGroupedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupedMaliciousFiles  DescribeGroupedMaliciousFilesRequest
     * @return DescribeGroupedMaliciousFilesResponse
     */
    @Override
    public CompletableFuture<DescribeGroupedMaliciousFilesResponse> describeGroupedMaliciousFiles(DescribeGroupedMaliciousFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupedMaliciousFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupedMaliciousFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupedMaliciousFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupedTags  DescribeGroupedTagsRequest
     * @return DescribeGroupedTagsResponse
     */
    @Override
    public CompletableFuture<DescribeGroupedTagsResponse> describeGroupedTags(DescribeGroupedTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupedTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupedTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupedTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupedVul  DescribeGroupedVulRequest
     * @return DescribeGroupedVulResponse
     */
    @Override
    public CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupedVul").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupedVulResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupedVulResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHcExportInfo  DescribeHcExportInfoRequest
     * @return DescribeHcExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeHcExportInfoResponse> describeHcExportInfo(DescribeHcExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHcExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHcExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHcExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHoneyPotAuth  DescribeHoneyPotAuthRequest
     * @return DescribeHoneyPotAuthResponse
     */
    @Override
    public CompletableFuture<DescribeHoneyPotAuthResponse> describeHoneyPotAuth(DescribeHoneyPotAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHoneyPotAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHoneyPotAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHoneyPotAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHoneyPotSuspStatistics  DescribeHoneyPotSuspStatisticsRequest
     * @return DescribeHoneyPotSuspStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeHoneyPotSuspStatisticsResponse> describeHoneyPotSuspStatistics(DescribeHoneyPotSuspStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHoneyPotSuspStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHoneyPotSuspStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHoneyPotSuspStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHybridProxyClusterList  DescribeHybridProxyClusterListRequest
     * @return DescribeHybridProxyClusterListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridProxyClusterListResponse> describeHybridProxyClusterList(DescribeHybridProxyClusterListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridProxyClusterList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridProxyClusterListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridProxyClusterListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHybridProxyLinkedClientList  DescribeHybridProxyLinkedClientListRequest
     * @return DescribeHybridProxyLinkedClientListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridProxyLinkedClientListResponse> describeHybridProxyLinkedClientList(DescribeHybridProxyLinkedClientListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridProxyLinkedClientList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridProxyLinkedClientListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridProxyLinkedClientListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHybridProxyList  DescribeHybridProxyListRequest
     * @return DescribeHybridProxyListResponse
     */
    @Override
    public CompletableFuture<DescribeHybridProxyListResponse> describeHybridProxyList(DescribeHybridProxyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridProxyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridProxyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridProxyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHybridProxyPolicy  DescribeHybridProxyPolicyRequest
     * @return DescribeHybridProxyPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeHybridProxyPolicyResponse> describeHybridProxyPolicy(DescribeHybridProxyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHybridProxyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHybridProxyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHybridProxyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeIdcAssetCriteria  DescribeIdcAssetCriteriaRequest
     * @return DescribeIdcAssetCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeIdcAssetCriteriaResponse> describeIdcAssetCriteria(DescribeIdcAssetCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIdcAssetCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIdcAssetCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIdcAssetCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeIdcProbeScanResultList  DescribeIdcProbeScanResultListRequest
     * @return DescribeIdcProbeScanResultListResponse
     */
    @Override
    public CompletableFuture<DescribeIdcProbeScanResultListResponse> describeIdcProbeScanResultList(DescribeIdcProbeScanResultListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIdcProbeScanResultList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIdcProbeScanResultListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIdcProbeScanResultListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImage  DescribeImageRequest
     * @return DescribeImageResponse
     */
    @Override
    public CompletableFuture<DescribeImageResponse> describeImage(DescribeImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBaselineCheckResult  DescribeImageBaselineCheckResultRequest
     * @return DescribeImageBaselineCheckResultResponse
     */
    @Override
    public CompletableFuture<DescribeImageBaselineCheckResultResponse> describeImageBaselineCheckResult(DescribeImageBaselineCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBaselineCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBaselineCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBaselineCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBaselineCheckSummary  DescribeImageBaselineCheckSummaryRequest
     * @return DescribeImageBaselineCheckSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeImageBaselineCheckSummaryResponse> describeImageBaselineCheckSummary(DescribeImageBaselineCheckSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBaselineCheckSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBaselineCheckSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBaselineCheckSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBaselineDetail  DescribeImageBaselineDetailRequest
     * @return DescribeImageBaselineDetailResponse
     */
    @Override
    public CompletableFuture<DescribeImageBaselineDetailResponse> describeImageBaselineDetail(DescribeImageBaselineDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBaselineDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBaselineDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBaselineDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBaselineItemList  DescribeImageBaselineItemListRequest
     * @return DescribeImageBaselineItemListResponse
     */
    @Override
    public CompletableFuture<DescribeImageBaselineItemListResponse> describeImageBaselineItemList(DescribeImageBaselineItemListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBaselineItemList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBaselineItemListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBaselineItemListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBaselineStrategy  DescribeImageBaselineStrategyRequest
     * @return DescribeImageBaselineStrategyResponse
     */
    @Override
    public CompletableFuture<DescribeImageBaselineStrategyResponse> describeImageBaselineStrategy(DescribeImageBaselineStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBaselineStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBaselineStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBaselineStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBuildRiskByKey  DescribeImageBuildRiskByKeyRequest
     * @return DescribeImageBuildRiskByKeyResponse
     */
    @Override
    public CompletableFuture<DescribeImageBuildRiskByKeyResponse> describeImageBuildRiskByKey(DescribeImageBuildRiskByKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBuildRiskByKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBuildRiskByKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBuildRiskByKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageBuildRiskList  DescribeImageBuildRiskListRequest
     * @return DescribeImageBuildRiskListResponse
     */
    @Override
    public CompletableFuture<DescribeImageBuildRiskListResponse> describeImageBuildRiskList(DescribeImageBuildRiskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageBuildRiskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageBuildRiskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageBuildRiskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageCriteria  DescribeImageCriteriaRequest
     * @return DescribeImageCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeImageCriteriaResponse> describeImageCriteria(DescribeImageCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageEventOperationCondition  DescribeImageEventOperationConditionRequest
     * @return DescribeImageEventOperationConditionResponse
     */
    @Override
    public CompletableFuture<DescribeImageEventOperationConditionResponse> describeImageEventOperationCondition(DescribeImageEventOperationConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageEventOperationCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageEventOperationConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageEventOperationConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageEventOperationPage  DescribeImageEventOperationPageRequest
     * @return DescribeImageEventOperationPageResponse
     */
    @Override
    public CompletableFuture<DescribeImageEventOperationPageResponse> describeImageEventOperationPage(DescribeImageEventOperationPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageEventOperationPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageEventOperationPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageEventOperationPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageFixCycleConfig  DescribeImageFixCycleConfigRequest
     * @return DescribeImageFixCycleConfigResponse
     */
    @Override
    public CompletableFuture<DescribeImageFixCycleConfigResponse> describeImageFixCycleConfig(DescribeImageFixCycleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageFixCycleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageFixCycleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageFixCycleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageFixTask  DescribeImageFixTaskRequest
     * @return DescribeImageFixTaskResponse
     */
    @Override
    public CompletableFuture<DescribeImageFixTaskResponse> describeImageFixTask(DescribeImageFixTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageFixTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageFixTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageFixTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageGroupedVulList  DescribeImageGroupedVulListRequest
     * @return DescribeImageGroupedVulListResponse
     */
    @Override
    public CompletableFuture<DescribeImageGroupedVulListResponse> describeImageGroupedVulList(DescribeImageGroupedVulListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageGroupedVulList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageGroupedVulListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageGroupedVulListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageInfoList  DescribeImageInfoListRequest
     * @return DescribeImageInfoListResponse
     */
    @Override
    public CompletableFuture<DescribeImageInfoListResponse> describeImageInfoList(DescribeImageInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageInfoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageInstances  DescribeImageInstancesRequest
     * @return DescribeImageInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeImageInstancesResponse> describeImageInstances(DescribeImageInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageLatestScanTask  DescribeImageLatestScanTaskRequest
     * @return DescribeImageLatestScanTaskResponse
     */
    @Override
    public CompletableFuture<DescribeImageLatestScanTaskResponse> describeImageLatestScanTask(DescribeImageLatestScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageLatestScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageLatestScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageLatestScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageListByBuildRisk  DescribeImageListByBuildRiskRequest
     * @return DescribeImageListByBuildRiskResponse
     */
    @Override
    public CompletableFuture<DescribeImageListByBuildRiskResponse> describeImageListByBuildRisk(DescribeImageListByBuildRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageListByBuildRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageListByBuildRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageListByBuildRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageListBySensitiveFile  DescribeImageListBySensitiveFileRequest
     * @return DescribeImageListBySensitiveFileResponse
     */
    @Override
    public CompletableFuture<DescribeImageListBySensitiveFileResponse> describeImageListBySensitiveFile(DescribeImageListBySensitiveFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageListBySensitiveFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageListBySensitiveFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageListBySensitiveFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageListWithBaselineName  DescribeImageListWithBaselineNameRequest
     * @return DescribeImageListWithBaselineNameResponse
     */
    @Override
    public CompletableFuture<DescribeImageListWithBaselineNameResponse> describeImageListWithBaselineName(DescribeImageListWithBaselineNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageListWithBaselineName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageListWithBaselineNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageListWithBaselineNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageRepoCriteria  DescribeImageRepoCriteriaRequest
     * @return DescribeImageRepoCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeImageRepoCriteriaResponse> describeImageRepoCriteria(DescribeImageRepoCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageRepoCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageRepoCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageRepoCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageRepoDetailList  DescribeImageRepoDetailListRequest
     * @return DescribeImageRepoDetailListResponse
     */
    @Override
    public CompletableFuture<DescribeImageRepoDetailListResponse> describeImageRepoDetailList(DescribeImageRepoDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageRepoDetailList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageRepoDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageRepoDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageRepoList  DescribeImageRepoListRequest
     * @return DescribeImageRepoListResponse
     */
    @Override
    public CompletableFuture<DescribeImageRepoListResponse> describeImageRepoList(DescribeImageRepoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageRepoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageRepoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageRepoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageScanAuthCount  DescribeImageScanAuthCountRequest
     * @return DescribeImageScanAuthCountResponse
     */
    @Override
    public CompletableFuture<DescribeImageScanAuthCountResponse> describeImageScanAuthCount(DescribeImageScanAuthCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageScanAuthCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageScanAuthCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageScanAuthCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageSensitiveFileByKey  DescribeImageSensitiveFileByKeyRequest
     * @return DescribeImageSensitiveFileByKeyResponse
     */
    @Override
    public CompletableFuture<DescribeImageSensitiveFileByKeyResponse> describeImageSensitiveFileByKey(DescribeImageSensitiveFileByKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSensitiveFileByKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSensitiveFileByKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSensitiveFileByKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageSensitiveFileList  DescribeImageSensitiveFileListRequest
     * @return DescribeImageSensitiveFileListResponse
     */
    @Override
    public CompletableFuture<DescribeImageSensitiveFileListResponse> describeImageSensitiveFileList(DescribeImageSensitiveFileListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSensitiveFileList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSensitiveFileListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSensitiveFileListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Security Center can scan for security risks and collect statistics only for <strong>Container Registry Enterprise Edition instances</strong>.</p>
     * <blockquote>
     * <p> Security Center cannot scan for security risks or collect statistics for <strong>default</strong> Container Registry instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeImageStatistics  DescribeImageStatisticsRequest
     * @return DescribeImageStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeImageStatisticsResponse> describeImageStatistics(DescribeImageStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To query the information about the recently detected image vulnerabilities, call the <a href="~~PublicCreateImageScanTask~~">PublicCreateImageScanTask</a> operation. Wait 1 to 5 minutes until the call is successful and call the DescribeImageVulList operation.</p>
     * 
     * @param request the request parameters of DescribeImageVulList  DescribeImageVulListRequest
     * @return DescribeImageVulListResponse
     */
    @Override
    public CompletableFuture<DescribeImageVulListResponse> describeImageVulList(DescribeImageVulListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageVulList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageVulListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageVulListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageVulWhiteList  DescribeImageVulWhiteListRequest
     * @return DescribeImageVulWhiteListResponse
     */
    @Override
    public CompletableFuture<DescribeImageVulWhiteListResponse> describeImageVulWhiteList(DescribeImageVulWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageVulWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageVulWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageVulWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstallCaptcha  DescribeInstallCaptchaRequest
     * @return DescribeInstallCaptchaResponse
     */
    @Override
    public CompletableFuture<DescribeInstallCaptchaResponse> describeInstallCaptcha(DescribeInstallCaptchaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstallCaptcha").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstallCaptchaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstallCaptchaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstallCode  DescribeInstallCodeRequest
     * @return DescribeInstallCodeResponse
     */
    @Override
    public CompletableFuture<DescribeInstallCodeResponse> describeInstallCode(DescribeInstallCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstallCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstallCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstallCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the commands that are used to manually install the Security Center agent on the server. The return result contains the installation verification code and the server information. If you want to manually install the Security Center agent on your server, you can call this operation to query installation commands.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstallCodes  DescribeInstallCodesRequest
     * @return DescribeInstallCodesResponse
     */
    @Override
    public CompletableFuture<DescribeInstallCodesResponse> describeInstallCodes(DescribeInstallCodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstallCodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstallCodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstallCodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceAntiBruteForceRules  DescribeInstanceAntiBruteForceRulesRequest
     * @return DescribeInstanceAntiBruteForceRulesResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAntiBruteForceRulesResponse> describeInstanceAntiBruteForceRules(DescribeInstanceAntiBruteForceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAntiBruteForceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAntiBruteForceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAntiBruteForceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceRebootStatus  DescribeInstanceRebootStatusRequest
     * @return DescribeInstanceRebootStatusResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceRebootStatusResponse> describeInstanceRebootStatus(DescribeInstanceRebootStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRebootStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRebootStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRebootStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceStatistics  DescribeInstanceStatisticsRequest
     * @return DescribeInstanceStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceVulStatistics  DescribeInstanceVulStatisticsRequest
     * @return DescribeInstanceVulStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceVulStatisticsResponse> describeInstanceVulStatistics(DescribeInstanceVulStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVulStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceVulStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceVulStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLatestScanTask  DescribeLatestScanTaskRequest
     * @return DescribeLatestScanTaskResponse
     */
    @Override
    public CompletableFuture<DescribeLatestScanTaskResponse> describeLatestScanTask(DescribeLatestScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLatestScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLatestScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLatestScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogMeta  DescribeLogMetaRequest
     * @return DescribeLogMetaResponse
     */
    @Override
    public CompletableFuture<DescribeLogMetaResponse> describeLogMeta(DescribeLogMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogShipperStatus  DescribeLogShipperStatusRequest
     * @return DescribeLogShipperStatusResponse
     */
    @Override
    public CompletableFuture<DescribeLogShipperStatusResponse> describeLogShipperStatus(DescribeLogShipperStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogShipperStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogShipperStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogShipperStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLoginBaseConfigs  DescribeLoginBaseConfigsRequest
     * @return DescribeLoginBaseConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeLoginBaseConfigsResponse> describeLoginBaseConfigs(DescribeLoginBaseConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoginBaseConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoginBaseConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoginBaseConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLoginSwitchConfigs  DescribeLoginSwitchConfigsRequest
     * @return DescribeLoginSwitchConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeLoginSwitchConfigsResponse> describeLoginSwitchConfigs(DescribeLoginSwitchConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoginSwitchConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoginSwitchConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoginSwitchConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogstoreStorage  DescribeLogstoreStorageRequest
     * @return DescribeLogstoreStorageResponse
     */
    @Override
    public CompletableFuture<DescribeLogstoreStorageResponse> describeLogstoreStorage(DescribeLogstoreStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogstoreStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogstoreStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogstoreStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMachineCanReboot  DescribeMachineCanRebootRequest
     * @return DescribeMachineCanRebootResponse
     */
    @Override
    public CompletableFuture<DescribeMachineCanRebootResponse> describeMachineCanReboot(DescribeMachineCanRebootRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMachineCanReboot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMachineCanRebootResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMachineCanRebootResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMatchedMaliciousNames  DescribeMatchedMaliciousNamesRequest
     * @return DescribeMatchedMaliciousNamesResponse
     */
    @Override
    public CompletableFuture<DescribeMatchedMaliciousNamesResponse> describeMatchedMaliciousNames(DescribeMatchedMaliciousNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMatchedMaliciousNames").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMatchedMaliciousNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMatchedMaliciousNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeModuleConfig  DescribeModuleConfigRequest
     * @return DescribeModuleConfigResponse
     */
    @Override
    public CompletableFuture<DescribeModuleConfigResponse> describeModuleConfig(DescribeModuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMonitorAccounts  DescribeMonitorAccountsRequest
     * @return DescribeMonitorAccountsResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorAccountsResponse> describeMonitorAccounts(DescribeMonitorAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNeedAsyncQuery  DescribeNeedAsyncQueryRequest
     * @return DescribeNeedAsyncQueryResponse
     */
    @Override
    public CompletableFuture<DescribeNeedAsyncQueryResponse> describeNeedAsyncQuery(DescribeNeedAsyncQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNeedAsyncQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNeedAsyncQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNeedAsyncQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNoticeConfig  DescribeNoticeConfigRequest
     * @return DescribeNoticeConfigResponse
     */
    @Override
    public CompletableFuture<DescribeNoticeConfigResponse> describeNoticeConfig(DescribeNoticeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNoticeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNoticeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNoticeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNsasSuspEventType  DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    @Override
    public CompletableFuture<DescribeNsasSuspEventTypeResponse> describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNsasSuspEventType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNsasSuspEventTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNsasSuspEventTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOfflineMachines  DescribeOfflineMachinesRequest
     * @return DescribeOfflineMachinesResponse
     */
    @Override
    public CompletableFuture<DescribeOfflineMachinesResponse> describeOfflineMachines(DescribeOfflineMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOfflineMachines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOfflineMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOfflineMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOnceTask  DescribeOnceTaskRequest
     * @return DescribeOnceTaskResponse
     */
    @Override
    public CompletableFuture<DescribeOnceTaskResponse> describeOnceTask(DescribeOnceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOnceTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOnceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOnceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOnceTaskLeafRecordPage  DescribeOnceTaskLeafRecordPageRequest
     * @return DescribeOnceTaskLeafRecordPageResponse
     */
    @Override
    public CompletableFuture<DescribeOnceTaskLeafRecordPageResponse> describeOnceTaskLeafRecordPage(DescribeOnceTaskLeafRecordPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOnceTaskLeafRecordPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOnceTaskLeafRecordPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOnceTaskLeafRecordPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyCount  DescribePropertyCountRequest
     * @return DescribePropertyCountResponse
     */
    @Override
    public CompletableFuture<DescribePropertyCountResponse> describePropertyCount(DescribePropertyCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyCronDetail  DescribePropertyCronDetailRequest
     * @return DescribePropertyCronDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyCronDetailResponse> describePropertyCronDetail(DescribePropertyCronDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyCronDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyCronDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyCronDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyCronItem  DescribePropertyCronItemRequest
     * @return DescribePropertyCronItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyCronItemResponse> describePropertyCronItem(DescribePropertyCronItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyCronItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyCronItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyCronItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyPortDetail  DescribePropertyPortDetailRequest
     * @return DescribePropertyPortDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyPortDetailResponse> describePropertyPortDetail(DescribePropertyPortDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyPortDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyPortDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyPortDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyPortItem  DescribePropertyPortItemRequest
     * @return DescribePropertyPortItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyPortItemResponse> describePropertyPortItem(DescribePropertyPortItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyPortItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyPortItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyPortItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyProcDetail  DescribePropertyProcDetailRequest
     * @return DescribePropertyProcDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyProcDetailResponse> describePropertyProcDetail(DescribePropertyProcDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyProcDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyProcDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyProcDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyProcItem  DescribePropertyProcItemRequest
     * @return DescribePropertyProcItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyProcItemResponse> describePropertyProcItem(DescribePropertyProcItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyProcItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyProcItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyProcItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyScaDetail  DescribePropertyScaDetailRequest
     * @return DescribePropertyScaDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyScaDetailResponse> describePropertyScaDetail(DescribePropertyScaDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyScaDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyScaDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyScaDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyScaItem  DescribePropertyScaItemRequest
     * @return DescribePropertyScaItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyScaItemResponse> describePropertyScaItem(DescribePropertyScaItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyScaItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyScaItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyScaItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyScaProcessDetail  DescribePropertyScaProcessDetailRequest
     * @return DescribePropertyScaProcessDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyScaProcessDetailResponse> describePropertyScaProcessDetail(DescribePropertyScaProcessDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyScaProcessDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyScaProcessDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyScaProcessDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyScheduleConfig  DescribePropertyScheduleConfigRequest
     * @return DescribePropertyScheduleConfigResponse
     */
    @Override
    public CompletableFuture<DescribePropertyScheduleConfigResponse> describePropertyScheduleConfig(DescribePropertyScheduleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyScheduleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyScheduleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyScheduleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertySoftwareDetail  DescribePropertySoftwareDetailRequest
     * @return DescribePropertySoftwareDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertySoftwareDetailResponse> describePropertySoftwareDetail(DescribePropertySoftwareDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertySoftwareDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertySoftwareDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertySoftwareDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertySoftwareItem  DescribePropertySoftwareItemRequest
     * @return DescribePropertySoftwareItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertySoftwareItemResponse> describePropertySoftwareItem(DescribePropertySoftwareItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertySoftwareItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertySoftwareItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertySoftwareItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyTypeScaItem  DescribePropertyTypeScaItemRequest
     * @return DescribePropertyTypeScaItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyTypeScaItemResponse> describePropertyTypeScaItem(DescribePropertyTypeScaItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyTypeScaItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyTypeScaItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyTypeScaItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribePropertyUsageNewest is deprecated, please use Sas::2018-12-03::DescribeOnceTask instead.  * @param request  the request parameters of DescribePropertyUsageNewest  DescribePropertyUsageNewestRequest
     * @return DescribePropertyUsageNewestResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribePropertyUsageNewestResponse> describePropertyUsageNewest(DescribePropertyUsageNewestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyUsageNewest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyUsageNewestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyUsageNewestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only users who purchase the Enterprise or Ultimate edition of Security Center can call this operation.</p>
     * 
     * @param request the request parameters of DescribePropertyUsageTop  DescribePropertyUsageTopRequest
     * @return DescribePropertyUsageTopResponse
     */
    @Override
    public CompletableFuture<DescribePropertyUsageTopResponse> describePropertyUsageTop(DescribePropertyUsageTopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyUsageTop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyUsageTopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyUsageTopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyUserDetail  DescribePropertyUserDetailRequest
     * @return DescribePropertyUserDetailResponse
     */
    @Override
    public CompletableFuture<DescribePropertyUserDetailResponse> describePropertyUserDetail(DescribePropertyUserDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyUserDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyUserDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyUserDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePropertyUserItem  DescribePropertyUserItemRequest
     * @return DescribePropertyUserItemResponse
     */
    @Override
    public CompletableFuture<DescribePropertyUserItemResponse> describePropertyUserItem(DescribePropertyUserItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePropertyUserItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePropertyUserItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePropertyUserItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQuaraFileDownloadInfo  DescribeQuaraFileDownloadInfoRequest
     * @return DescribeQuaraFileDownloadInfoResponse
     */
    @Override
    public CompletableFuture<DescribeQuaraFileDownloadInfoResponse> describeQuaraFileDownloadInfo(DescribeQuaraFileDownloadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQuaraFileDownloadInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQuaraFileDownloadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQuaraFileDownloadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeReportExport  DescribeReportExportRequest
     * @return DescribeReportExportResponse
     */
    @Override
    public CompletableFuture<DescribeReportExportResponse> describeReportExport(DescribeReportExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReportExport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReportExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReportExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeReportRecipientStatus  DescribeReportRecipientStatusRequest
     * @return DescribeReportRecipientStatusResponse
     */
    @Override
    public CompletableFuture<DescribeReportRecipientStatusResponse> describeReportRecipientStatus(DescribeReportRecipientStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReportRecipientStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReportRecipientStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReportRecipientStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the data on your servers is encrypted by ransomware, you can create a restoration task to restore the data on your servers by using backup data in Security Center.</p>
     * <blockquote>
     * <p> After you enable an anti-ransomware policy, the data on your servers is backed up based on the policy. For more information about anti-ransomware policies, see <a href="https://help.aliyun.com/document_detail/164781.html">Manage protection policies</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRestoreJobs  DescribeRestoreJobsRequest
     * @return DescribeRestoreJobsResponse
     */
    @Override
    public CompletableFuture<DescribeRestoreJobsResponse> describeRestoreJobs(DescribeRestoreJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRestoreJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRestoreJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRestoreJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRestorePlans  DescribeRestorePlansRequest
     * @return DescribeRestorePlansResponse
     */
    @Override
    public CompletableFuture<DescribeRestorePlansResponse> describeRestorePlans(DescribeRestorePlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRestorePlans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRestorePlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRestorePlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRiskCheckItemResult is deprecated  * @description This operation is phased out. You can use the ListCheckInstanceResult operation.
     * 
     * @param request the request parameters of DescribeRiskCheckItemResult  DescribeRiskCheckItemResultRequest
     * @return DescribeRiskCheckItemResultResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeRiskCheckItemResultResponse> describeRiskCheckItemResult(DescribeRiskCheckItemResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskCheckItemResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskCheckItemResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskCheckItemResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRiskCheckResult is deprecated  * @description This operation is phased out. You can use the [ListCheckResult](~~ListCheckResult~~) operation.
     * 
     * @param request the request parameters of DescribeRiskCheckResult  DescribeRiskCheckResultRequest
     * @return DescribeRiskCheckResultResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeRiskCheckResultResponse> describeRiskCheckResult(DescribeRiskCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRiskCheckSummary is deprecated  * @description This operation is phased out. You can use the GetCheckSummary operation.
     * 
     * @param request the request parameters of DescribeRiskCheckSummary  DescribeRiskCheckSummaryRequest
     * @return DescribeRiskCheckSummaryResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeRiskCheckSummaryResponse> describeRiskCheckSummary(DescribeRiskCheckSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskCheckSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskCheckSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskCheckSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRiskItemType is deprecated  * @description This operation is phased out. You can use the ListCheckStandard operation instead.
     * 
     * @param request the request parameters of DescribeRiskItemType  DescribeRiskItemTypeRequest
     * @return DescribeRiskItemTypeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeRiskItemTypeResponse> describeRiskItemType(DescribeRiskItemTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskItemType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskItemTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskItemTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRiskListCheckResult is deprecated  * @description This operation is phased out. You can use the ListCheckResult operation. When you call the ListCheckResult operation, set the Statuses parameter to NOT_PASS.
     * 
     * @param request the request parameters of DescribeRiskListCheckResult  DescribeRiskListCheckResultRequest
     * @return DescribeRiskListCheckResultResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeRiskListCheckResultResponse> describeRiskListCheckResult(DescribeRiskListCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskListCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskListCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskListCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRiskType  DescribeRiskTypeRequest
     * @return DescribeRiskTypeResponse
     */
    @Override
    public CompletableFuture<DescribeRiskTypeResponse> describeRiskType(DescribeRiskTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRisks  DescribeRisksRequest
     * @return DescribeRisksResponse
     */
    @Override
    public CompletableFuture<DescribeRisksResponse> describeRisks(DescribeRisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSasPmAgentList  DescribeSasPmAgentListRequest
     * @return DescribeSasPmAgentListResponse
     */
    @Override
    public CompletableFuture<DescribeSasPmAgentListResponse> describeSasPmAgentList(DescribeSasPmAgentListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSasPmAgentList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSasPmAgentListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSasPmAgentListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScanTaskProgress  DescribeScanTaskProgressRequest
     * @return DescribeScanTaskProgressResponse
     */
    @Override
    public CompletableFuture<DescribeScanTaskProgressResponse> describeScanTaskProgress(DescribeScanTaskProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScanTaskProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScanTaskProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScanTaskProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScanTaskStatistics  DescribeScanTaskStatisticsRequest
     * @return DescribeScanTaskStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeScanTaskStatisticsResponse> describeScanTaskStatistics(DescribeScanTaskStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScanTaskStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScanTaskStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScanTaskStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeScreenScoreThread  DescribeScreenScoreThreadRequest
     * @return DescribeScreenScoreThreadResponse
     */
    @Override
    public CompletableFuture<DescribeScreenScoreThreadResponse> describeScreenScoreThread(DescribeScreenScoreThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScreenScoreThread").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScreenScoreThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScreenScoreThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSearchCondition  DescribeSearchConditionRequest
     * @return DescribeSearchConditionResponse
     */
    @Override
    public CompletableFuture<DescribeSearchConditionResponse> describeSearchCondition(DescribeSearchConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSearchCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSearchConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSearchConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecureSuggestion  DescribeSecureSuggestionRequest
     * @return DescribeSecureSuggestionResponse
     */
    @Override
    public CompletableFuture<DescribeSecureSuggestionResponse> describeSecureSuggestion(DescribeSecureSuggestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecureSuggestion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecureSuggestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecureSuggestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeSecurityCheckScheduleConfig is deprecated  * @description This operation is phased out. You can use the GetCheckConfig operation.
     * 
     * @param request the request parameters of DescribeSecurityCheckScheduleConfig  DescribeSecurityCheckScheduleConfigRequest
     * @return DescribeSecurityCheckScheduleConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeSecurityCheckScheduleConfigResponse> describeSecurityCheckScheduleConfig(DescribeSecurityCheckScheduleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityCheckScheduleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityCheckScheduleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityCheckScheduleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityEventMarkMissList  DescribeSecurityEventMarkMissListRequest
     * @return DescribeSecurityEventMarkMissListResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventMarkMissListResponse> describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventMarkMissList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventMarkMissListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventMarkMissListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityEventOperationStatus  DescribeSecurityEventOperationStatusRequest
     * @return DescribeSecurityEventOperationStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventOperationStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventOperationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventOperationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityEventOperations  DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventOperations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityStatInfo  DescribeSecurityStatInfoRequest
     * @return DescribeSecurityStatInfoResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityStatInfoResponse> describeSecurityStatInfo(DescribeSecurityStatInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityStatInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityStatInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityStatInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeServiceLinkedRoleStatus  DescribeServiceLinkedRoleStatusRequest
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    @Override
    public CompletableFuture<DescribeServiceLinkedRoleStatusResponse> describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeServiceLinkedRoleStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeServiceLinkedRoleStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeServiceLinkedRoleStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSimilarEventScenarios  DescribeSimilarEventScenariosRequest
     * @return DescribeSimilarEventScenariosResponse
     */
    @Override
    public CompletableFuture<DescribeSimilarEventScenariosResponse> describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSimilarEventScenarios").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSimilarEventScenariosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSimilarEventScenariosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSimilarSecurityEvents  DescribeSimilarSecurityEventsRequest
     * @return DescribeSimilarSecurityEventsResponse
     */
    @Override
    public CompletableFuture<DescribeSimilarSecurityEventsResponse> describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSimilarSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSimilarSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSimilarSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategies  DescribeSoarStrategiesRequest
     * @return DescribeSoarStrategiesResponse
     */
    @Override
    public CompletableFuture<DescribeSoarStrategiesResponse> describeSoarStrategies(DescribeSoarStrategiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSoarStrategies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSoarStrategiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSoarStrategiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyParam  DescribeSoarStrategyParamRequest
     * @return DescribeSoarStrategyParamResponse
     */
    @Override
    public CompletableFuture<DescribeSoarStrategyParamResponse> describeSoarStrategyParam(DescribeSoarStrategyParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSoarStrategyParam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSoarStrategyParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSoarStrategyParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTaskDetail  DescribeSoarStrategyTaskDetailRequest
     * @return DescribeSoarStrategyTaskDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSoarStrategyTaskDetailResponse> describeSoarStrategyTaskDetail(DescribeSoarStrategyTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSoarStrategyTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSoarStrategyTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSoarStrategyTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarStrategyTasks  DescribeSoarStrategyTasksRequest
     * @return DescribeSoarStrategyTasksResponse
     */
    @Override
    public CompletableFuture<DescribeSoarStrategyTasksResponse> describeSoarStrategyTasks(DescribeSoarStrategyTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSoarStrategyTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSoarStrategyTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSoarStrategyTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of DescribeSoarSubscribedStrategy  DescribeSoarSubscribedStrategyRequest
     * @return DescribeSoarSubscribedStrategyResponse
     */
    @Override
    public CompletableFuture<DescribeSoarSubscribedStrategyResponse> describeSoarSubscribedStrategy(DescribeSoarSubscribedStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSoarSubscribedStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSoarSubscribedStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSoarSubscribedStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeStrategy  DescribeStrategyRequest
     * @return DescribeStrategyResponse
     */
    @Override
    public CompletableFuture<DescribeStrategyResponse> describeStrategy(DescribeStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeStrategyDetail  DescribeStrategyDetailRequest
     * @return DescribeStrategyDetailResponse
     */
    @Override
    public CompletableFuture<DescribeStrategyDetailResponse> describeStrategyDetail(DescribeStrategyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStrategyDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStrategyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStrategyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeStrategyExecDetail  DescribeStrategyExecDetailRequest
     * @return DescribeStrategyExecDetailResponse
     */
    @Override
    public CompletableFuture<DescribeStrategyExecDetailResponse> describeStrategyExecDetail(DescribeStrategyExecDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStrategyExecDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStrategyExecDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStrategyExecDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeStrategyTarget  DescribeStrategyTargetRequest
     * @return DescribeStrategyTargetResponse
     */
    @Override
    public CompletableFuture<DescribeStrategyTargetResponse> describeStrategyTarget(DescribeStrategyTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStrategyTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStrategyTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStrategyTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSummaryInfo  DescribeSummaryInfoRequest
     * @return DescribeSummaryInfoResponse
     */
    @Override
    public CompletableFuture<DescribeSummaryInfoResponse> describeSummaryInfo(DescribeSummaryInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSummaryInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSummaryInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSummaryInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSupervisonInfo  DescribeSupervisonInfoRequest
     * @return DescribeSupervisonInfoResponse
     */
    @Override
    public CompletableFuture<DescribeSupervisonInfoResponse> describeSupervisonInfo(DescribeSupervisonInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSupervisonInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSupervisonInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSupervisonInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSupportRegion  DescribeSupportRegionRequest
     * @return DescribeSupportRegionResponse
     */
    @Override
    public CompletableFuture<DescribeSupportRegionResponse> describeSupportRegion(DescribeSupportRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSupportRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSupportRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSupportRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEventDetail  DescribeSuspEventDetailRequest
     * @return DescribeSuspEventDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventDetailResponse> describeSuspEventDetail(DescribeSuspEventDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEventDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEventExportInfo  DescribeSuspEventExportInfoRequest
     * @return DescribeSuspEventExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventExportInfoResponse> describeSuspEventExportInfo(DescribeSuspEventExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEventExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEventQuaraFiles  DescribeSuspEventQuaraFilesRequest
     * @return DescribeSuspEventQuaraFilesResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEventQuaraFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventQuaraFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventQuaraFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEventUserSetting  DescribeSuspEventUserSettingRequest
     * @return DescribeSuspEventUserSettingResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventUserSettingResponse> describeSuspEventUserSetting(DescribeSuspEventUserSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEventUserSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventUserSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventUserSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEvents  DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspiciousOverallConfig  DescribeSuspiciousOverallConfigRequest
     * @return DescribeSuspiciousOverallConfigResponse
     */
    @Override
    public CompletableFuture<DescribeSuspiciousOverallConfigResponse> describeSuspiciousOverallConfig(DescribeSuspiciousOverallConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspiciousOverallConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspiciousOverallConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspiciousOverallConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspiciousUUIDConfig  DescribeSuspiciousUUIDConfigRequest
     * @return DescribeSuspiciousUUIDConfigResponse
     */
    @Override
    public CompletableFuture<DescribeSuspiciousUUIDConfigResponse> describeSuspiciousUUIDConfig(DescribeSuspiciousUUIDConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspiciousUUIDConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspiciousUUIDConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspiciousUUIDConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSyncAssetTaskList  DescribeSyncAssetTaskListRequest
     * @return DescribeSyncAssetTaskListResponse
     */
    @Override
    public CompletableFuture<DescribeSyncAssetTaskListResponse> describeSyncAssetTaskList(DescribeSyncAssetTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSyncAssetTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyncAssetTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyncAssetTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSyncAssetTaskLogDetail  DescribeSyncAssetTaskLogDetailRequest
     * @return DescribeSyncAssetTaskLogDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSyncAssetTaskLogDetailResponse> describeSyncAssetTaskLogDetail(DescribeSyncAssetTaskLogDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSyncAssetTaskLogDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSyncAssetTaskLogDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSyncAssetTaskLogDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTarget  DescribeTargetRequest
     * @return DescribeTargetResponse
     */
    @Override
    public CompletableFuture<DescribeTargetResponse> describeTarget(DescribeTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTaskErrorLog  DescribeTaskErrorLogRequest
     * @return DescribeTaskErrorLogResponse
     */
    @Override
    public CompletableFuture<DescribeTaskErrorLogResponse> describeTaskErrorLog(DescribeTaskErrorLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTaskErrorLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskErrorLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskErrorLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTotalStatistics  DescribeTotalStatisticsRequest
     * @return DescribeTotalStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeTotalStatisticsResponse> describeTotalStatistics(DescribeTotalStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTotalStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTotalStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTotalStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTraceInfoDetail  DescribeTraceInfoDetailRequest
     * @return DescribeTraceInfoDetailResponse
     */
    @Override
    public CompletableFuture<DescribeTraceInfoDetailResponse> describeTraceInfoDetail(DescribeTraceInfoDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTraceInfoDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTraceInfoDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTraceInfoDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTraceInfoNode  DescribeTraceInfoNodeRequest
     * @return DescribeTraceInfoNodeResponse
     */
    @Override
    public CompletableFuture<DescribeTraceInfoNodeResponse> describeTraceInfoNode(DescribeTraceInfoNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTraceInfoNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTraceInfoNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTraceInfoNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniBackupDatabase  DescribeUniBackupDatabaseRequest
     * @return DescribeUniBackupDatabaseResponse
     */
    @Override
    public CompletableFuture<DescribeUniBackupDatabaseResponse> describeUniBackupDatabase(DescribeUniBackupDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniBackupDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniBackupDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniBackupDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniBackupPolicies  DescribeUniBackupPoliciesRequest
     * @return DescribeUniBackupPoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeUniBackupPoliciesResponse> describeUniBackupPolicies(DescribeUniBackupPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniBackupPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniBackupPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniBackupPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniBackupPolicyDetail  DescribeUniBackupPolicyDetailRequest
     * @return DescribeUniBackupPolicyDetailResponse
     */
    @Override
    public CompletableFuture<DescribeUniBackupPolicyDetailResponse> describeUniBackupPolicyDetail(DescribeUniBackupPolicyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniBackupPolicyDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniBackupPolicyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniBackupPolicyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniBackupStatistics  DescribeUniBackupStatisticsRequest
     * @return DescribeUniBackupStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeUniBackupStatisticsResponse> describeUniBackupStatistics(DescribeUniBackupStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniBackupStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniBackupStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniBackupStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniRecoverableList  DescribeUniRecoverableListRequest
     * @return DescribeUniRecoverableListResponse
     */
    @Override
    public CompletableFuture<DescribeUniRecoverableListResponse> describeUniRecoverableList(DescribeUniRecoverableListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniRecoverableList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniRecoverableListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniRecoverableListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUniSupportRegion  DescribeUniSupportRegionRequest
     * @return DescribeUniSupportRegionResponse
     */
    @Override
    public CompletableFuture<DescribeUniSupportRegionResponse> describeUniSupportRegion(DescribeUniSupportRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUniSupportRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUniSupportRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUniSupportRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserBackupMachines  DescribeUserBackupMachinesRequest
     * @return DescribeUserBackupMachinesResponse
     */
    @Override
    public CompletableFuture<DescribeUserBackupMachinesResponse> describeUserBackupMachines(DescribeUserBackupMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBackupMachines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserBackupMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserBackupMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserBaselineAuthorization  DescribeUserBaselineAuthorizationRequest
     * @return DescribeUserBaselineAuthorizationResponse
     */
    @Override
    public CompletableFuture<DescribeUserBaselineAuthorizationResponse> describeUserBaselineAuthorization(DescribeUserBaselineAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBaselineAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserBaselineAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserBaselineAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserSetting  DescribeUserSettingRequest
     * @return DescribeUserSettingResponse
     */
    @Override
    public CompletableFuture<DescribeUserSettingResponse> describeUserSetting(DescribeUserSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUuidsByVulNames  DescribeUuidsByVulNamesRequest
     * @return DescribeUuidsByVulNamesResponse
     */
    @Override
    public CompletableFuture<DescribeUuidsByVulNamesResponse> describeUuidsByVulNames(DescribeUuidsByVulNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUuidsByVulNames").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUuidsByVulNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUuidsByVulNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVendorList  DescribeVendorListRequest
     * @return DescribeVendorListResponse
     */
    @Override
    public CompletableFuture<DescribeVendorListResponse> describeVendorList(DescribeVendorListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVendorList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVendorListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVendorListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVersionConfig  DescribeVersionConfigRequest
     * @return DescribeVersionConfigResponse
     */
    @Override
    public CompletableFuture<DescribeVersionConfigResponse> describeVersionConfig(DescribeVersionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVersionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVersionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVersionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVolDingdingMessage  DescribeVolDingdingMessageRequest
     * @return DescribeVolDingdingMessageResponse
     */
    @Override
    public CompletableFuture<DescribeVolDingdingMessageResponse> describeVolDingdingMessage(DescribeVolDingdingMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVolDingdingMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVolDingdingMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVolDingdingMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcHoneyPotCriteria  DescribeVpcHoneyPotCriteriaRequest
     * @return DescribeVpcHoneyPotCriteriaResponse
     */
    @Override
    public CompletableFuture<DescribeVpcHoneyPotCriteriaResponse> describeVpcHoneyPotCriteria(DescribeVpcHoneyPotCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcHoneyPotCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcHoneyPotCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcHoneyPotCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you specify only the Action request parameter in your request, Security Center returns the list of all VPCs regardless of whether a honeypot is deployed on a VPC.</p>
     * 
     * @param request the request parameters of DescribeVpcHoneyPotList  DescribeVpcHoneyPotListRequest
     * @return DescribeVpcHoneyPotListResponse
     */
    @Override
    public CompletableFuture<DescribeVpcHoneyPotListResponse> describeVpcHoneyPotList(DescribeVpcHoneyPotListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcHoneyPotList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcHoneyPotListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcHoneyPotListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcList  DescribeVpcListRequest
     * @return DescribeVpcListResponse
     */
    @Override
    public CompletableFuture<DescribeVpcListResponse> describeVpcList(DescribeVpcListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulCheckTaskStatusDetail  DescribeVulCheckTaskStatusDetailRequest
     * @return DescribeVulCheckTaskStatusDetailResponse
     */
    @Override
    public CompletableFuture<DescribeVulCheckTaskStatusDetailResponse> describeVulCheckTaskStatusDetail(DescribeVulCheckTaskStatusDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulCheckTaskStatusDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulCheckTaskStatusDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulCheckTaskStatusDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulConfig  DescribeVulConfigRequest
     * @return DescribeVulConfigResponse
     */
    @Override
    public CompletableFuture<DescribeVulConfigResponse> describeVulConfig(DescribeVulConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulDefendCountStatistics  DescribeVulDefendCountStatisticsRequest
     * @return DescribeVulDefendCountStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeVulDefendCountStatisticsResponse> describeVulDefendCountStatistics(DescribeVulDefendCountStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulDefendCountStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulDefendCountStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulDefendCountStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulDetails  DescribeVulDetailsRequest
     * @return DescribeVulDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeVulDetailsResponse> describeVulDetails(DescribeVulDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the value of ExportStatus is success, the URL at which you can download the exported Excel file is returned.</p>
     * 
     * @param request the request parameters of DescribeVulExportInfo  DescribeVulExportInfoRequest
     * @return DescribeVulExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeVulExportInfoResponse> describeVulExportInfo(DescribeVulExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulFixStatistics  DescribeVulFixStatisticsRequest
     * @return DescribeVulFixStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeVulFixStatisticsResponse> describeVulFixStatistics(DescribeVulFixStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulFixStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulFixStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulFixStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulList  DescribeVulListRequest
     * @return DescribeVulListResponse
     */
    @Override
    public CompletableFuture<DescribeVulListResponse> describeVulList(DescribeVulListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulListPage  DescribeVulListPageRequest
     * @return DescribeVulListPageResponse
     */
    @Override
    public CompletableFuture<DescribeVulListPageResponse> describeVulListPage(DescribeVulListPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulListPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulListPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulListPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulMetaCountStatistics  DescribeVulMetaCountStatisticsRequest
     * @return DescribeVulMetaCountStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeVulMetaCountStatisticsResponse> describeVulMetaCountStatistics(DescribeVulMetaCountStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulMetaCountStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulMetaCountStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulMetaCountStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulNumStatistics  DescribeVulNumStatisticsRequest
     * @return DescribeVulNumStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeVulNumStatisticsResponse> describeVulNumStatistics(DescribeVulNumStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulNumStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulNumStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulNumStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulTargetConfig  DescribeVulTargetConfigRequest
     * @return DescribeVulTargetConfigResponse
     */
    @Override
    public CompletableFuture<DescribeVulTargetConfigResponse> describeVulTargetConfig(DescribeVulTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulTargetStatistics  DescribeVulTargetStatisticsRequest
     * @return DescribeVulTargetStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeVulTargetStatisticsResponse> describeVulTargetStatistics(DescribeVulTargetStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulTargetStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulTargetStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulTargetStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulWhitelist  DescribeVulWhitelistRequest
     * @return DescribeVulWhitelistResponse
     */
    @Override
    public CompletableFuture<DescribeVulWhitelistResponse> describeVulWhitelist(DescribeVulWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWarningExportInfo  DescribeWarningExportInfoRequest
     * @return DescribeWarningExportInfoResponse
     */
    @Override
    public CompletableFuture<DescribeWarningExportInfoResponse> describeWarningExportInfo(DescribeWarningExportInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWarningExportInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWarningExportInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWarningExportInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWarningMachines  DescribeWarningMachinesRequest
     * @return DescribeWarningMachinesResponse
     */
    @Override
    public CompletableFuture<DescribeWarningMachinesResponse> describeWarningMachines(DescribeWarningMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWarningMachines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWarningMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWarningMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockBindList  DescribeWebLockBindListRequest
     * @return DescribeWebLockBindListResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockBindListResponse> describeWebLockBindList(DescribeWebLockBindListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockBindList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockBindListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockBindListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockConfigList  DescribeWebLockConfigListRequest
     * @return DescribeWebLockConfigListResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockConfigListResponse> describeWebLockConfigList(DescribeWebLockConfigListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockConfigList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockConfigListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockConfigListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockExclusiveFileType  DescribeWebLockExclusiveFileTypeRequest
     * @return DescribeWebLockExclusiveFileTypeResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockExclusiveFileTypeResponse> describeWebLockExclusiveFileType(DescribeWebLockExclusiveFileTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockExclusiveFileType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockExclusiveFileTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockExclusiveFileTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockFileChangeStatistics  DescribeWebLockFileChangeStatisticsRequest
     * @return DescribeWebLockFileChangeStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockFileChangeStatisticsResponse> describeWebLockFileChangeStatistics(DescribeWebLockFileChangeStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockFileChangeStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockFileChangeStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockFileChangeStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockFileEvents  DescribeWebLockFileEventsRequest
     * @return DescribeWebLockFileEventsResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockFileEventsResponse> describeWebLockFileEvents(DescribeWebLockFileEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockFileEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockFileEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockFileEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockFileTypeSummary  DescribeWebLockFileTypeSummaryRequest
     * @return DescribeWebLockFileTypeSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockFileTypeSummaryResponse> describeWebLockFileTypeSummary(DescribeWebLockFileTypeSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockFileTypeSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockFileTypeSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockFileTypeSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockInclusiveFileType  DescribeWebLockInclusiveFileTypeRequest
     * @return DescribeWebLockInclusiveFileTypeResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockInclusiveFileTypeResponse> describeWebLockInclusiveFileType(DescribeWebLockInclusiveFileTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockInclusiveFileType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockInclusiveFileTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockInclusiveFileTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockProcessBlockStatistics  DescribeWebLockProcessBlockStatisticsRequest
     * @return DescribeWebLockProcessBlockStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockProcessBlockStatisticsResponse> describeWebLockProcessBlockStatistics(DescribeWebLockProcessBlockStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockProcessBlockStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockProcessBlockStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockProcessBlockStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockProcessList  DescribeWebLockProcessListRequest
     * @return DescribeWebLockProcessListResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockProcessListResponse> describeWebLockProcessList(DescribeWebLockProcessListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockProcessList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockProcessListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockProcessListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockStatus  DescribeWebLockStatusRequest
     * @return DescribeWebLockStatusResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockStatusResponse> describeWebLockStatus(DescribeWebLockStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebLockTotalFileChangeCount  DescribeWebLockTotalFileChangeCountRequest
     * @return DescribeWebLockTotalFileChangeCountResponse
     */
    @Override
    public CompletableFuture<DescribeWebLockTotalFileChangeCountResponse> describeWebLockTotalFileChangeCount(DescribeWebLockTotalFileChangeCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebLockTotalFileChangeCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebLockTotalFileChangeCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebLockTotalFileChangeCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWebPath  DescribeWebPathRequest
     * @return DescribeWebPathResponse
     */
    @Override
    public CompletableFuture<DescribeWebPathResponse> describeWebPath(DescribeWebPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWebPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWebPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWebPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListAsset  DescribeWhiteListAssetRequest
     * @return DescribeWhiteListAssetResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListAssetResponse> describeWhiteListAsset(DescribeWhiteListAssetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListAsset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListAssetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListAssetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListAuthorize  DescribeWhiteListAuthorizeRequest
     * @return DescribeWhiteListAuthorizeResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListAuthorizeResponse> describeWhiteListAuthorize(DescribeWhiteListAuthorizeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListAuthorize").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListAuthorizeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListAuthorizeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in-use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListEffectiveAssets  DescribeWhiteListEffectiveAssetsRequest
     * @return DescribeWhiteListEffectiveAssetsResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListEffectiveAssetsResponse> describeWhiteListEffectiveAssets(DescribeWhiteListEffectiveAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListEffectiveAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListEffectiveAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListEffectiveAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListProcess  DescribeWhiteListProcessRequest
     * @return DescribeWhiteListProcessResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListProcessResponse> describeWhiteListProcess(DescribeWhiteListProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyList  DescribeWhiteListStrategyListRequest
     * @return DescribeWhiteListStrategyListResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListStrategyListResponse> describeWhiteListStrategyList(DescribeWhiteListStrategyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListStrategyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListStrategyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListStrategyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyStatistics  DescribeWhiteListStrategyStatisticsRequest
     * @return DescribeWhiteListStrategyStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListStrategyStatisticsResponse> describeWhiteListStrategyStatistics(DescribeWhiteListStrategyStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListStrategyStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListStrategyStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListStrategyStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in-use, you can call this operation.</p>
     * 
     * @param request the request parameters of DescribeWhiteListStrategyUuidCount  DescribeWhiteListStrategyUuidCountRequest
     * @return DescribeWhiteListStrategyUuidCountResponse
     */
    @Override
    public CompletableFuture<DescribeWhiteListStrategyUuidCountResponse> describeWhiteListStrategyUuidCount(DescribeWhiteListStrategyUuidCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhiteListStrategyUuidCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhiteListStrategyUuidCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhiteListStrategyUuidCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DingTalkOnlineTest  DingTalkOnlineTestRequest
     * @return DingTalkOnlineTestResponse
     */
    @Override
    public CompletableFuture<DingTalkOnlineTestResponse> dingTalkOnlineTest(DingTalkOnlineTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DingTalkOnlineTest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DingTalkOnlineTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DingTalkOnlineTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableBruteForceRecord  DisableBruteForceRecordRequest
     * @return DisableBruteForceRecordResponse
     */
    @Override
    public CompletableFuture<DisableBruteForceRecordResponse> disableBruteForceRecord(DisableBruteForceRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableBruteForceRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableBruteForceRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableBruteForceRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableCustomBlockRecord  DisableCustomBlockRecordRequest
     * @return DisableCustomBlockRecordResponse
     */
    @Override
    public CompletableFuture<DisableCustomBlockRecordResponse> disableCustomBlockRecord(DisableCustomBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableCustomBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableCustomBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableCustomBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableBruteForceRecord  EnableBruteForceRecordRequest
     * @return EnableBruteForceRecordResponse
     */
    @Override
    public CompletableFuture<EnableBruteForceRecordResponse> enableBruteForceRecord(EnableBruteForceRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableBruteForceRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableBruteForceRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableBruteForceRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableCustomBlockRecord  EnableCustomBlockRecordRequest
     * @return EnableCustomBlockRecordResponse
     */
    @Override
    public CompletableFuture<EnableCustomBlockRecordResponse> enableCustomBlockRecord(EnableCustomBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableCustomBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableCustomBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableCustomBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableCustomInstanceBlockRecord  EnableCustomInstanceBlockRecordRequest
     * @return EnableCustomInstanceBlockRecordResponse
     */
    @Override
    public CompletableFuture<EnableCustomInstanceBlockRecordResponse> enableCustomInstanceBlockRecord(EnableCustomInstanceBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableCustomInstanceBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableCustomInstanceBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableCustomInstanceBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the management account of your resource directory or a delegated administrator account of Security Center to call this operation.</p>
     * 
     * @param request the request parameters of EnableServiceAccessResourceDirectory  EnableServiceAccessResourceDirectoryRequest
     * @return EnableServiceAccessResourceDirectoryResponse
     */
    @Override
    public CompletableFuture<EnableServiceAccessResourceDirectoryResponse> enableServiceAccessResourceDirectory(EnableServiceAccessResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableServiceAccessResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableServiceAccessResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableServiceAccessResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecStrategy  ExecStrategyRequest
     * @return ExecStrategyResponse
     */
    @Override
    public CompletableFuture<ExecStrategyResponse> execStrategy(ExecStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportCustomizeReport  ExportCustomizeReportRequest
     * @return ExportCustomizeReportResponse
     */
    @Override
    public CompletableFuture<ExportCustomizeReportResponse> exportCustomizeReport(ExportCustomizeReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportCustomizeReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportCustomizeReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportCustomizeReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to export the following check result lists:</p>
     * <ul>
     * <li>The list of servers on the Host page.</li>
     * <li>The lists of image system vulnerabilities, image application vulnerabilities, image baseline check results, and malicious image samples on the Image Security page.</li>
     * <li>The list of attack analysis data on the Attack Awareness page.</li>
     * <li>The list of check results for AccessKey pair leaks on the AK leak detection page.</li>
     * </ul>
     * 
     * @param request the request parameters of ExportRecord  ExportRecordRequest
     * @return ExportRecordResponse
     */
    @Override
    public CompletableFuture<ExportRecordResponse> exportRecord(ExportRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportSuspEvents  ExportSuspEventsRequest
     * @return ExportSuspEventsResponse
     */
    @Override
    public CompletableFuture<ExportSuspEventsResponse> exportSuspEvents(ExportSuspEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportSuspEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportSuspEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportSuspEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ExportVul operation to export the following types of vulnerabilities: Linux software vulnerabilities, Windows system vulnerabilities, Web-CMS vulnerabilities, application vulnerabilities, and urgent vulnerabilities.
     * You can use this operation together with the DescribeVulExportInfo operation. After you call the ExportVul operation to create a vulnerability export task, you can call the DescribeVulExportInfo operation to query the progress of the task by specifying the ID of the task.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ExportVul  ExportVulRequest
     * @return ExportVulResponse
     */
    @Override
    public CompletableFuture<ExportVulResponse> exportVul(ExportVulRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportVul").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportVulResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportVulResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportWarning  ExportWarningRequest
     * @return ExportWarningResponse
     */
    @Override
    public CompletableFuture<ExportWarningResponse> exportWarning(ExportWarningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportWarning").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportWarningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportWarningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindContainerNetworkConnect  FindContainerNetworkConnectRequest
     * @return FindContainerNetworkConnectResponse
     */
    @Override
    public CompletableFuture<FindContainerNetworkConnectResponse> findContainerNetworkConnect(FindContainerNetworkConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindContainerNetworkConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindContainerNetworkConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindContainerNetworkConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FinishGuidTask  FinishGuidTaskRequest
     * @return FinishGuidTaskResponse
     */
    @Override
    public CompletableFuture<FinishGuidTaskResponse> finishGuidTask(FinishGuidTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FinishGuidTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishGuidTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishGuidTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FixCheckWarnings  FixCheckWarningsRequest
     * @return FixCheckWarningsResponse
     */
    @Override
    public CompletableFuture<FixCheckWarningsResponse> fixCheckWarnings(FixCheckWarningsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FixCheckWarnings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FixCheckWarningsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FixCheckWarningsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateDynamicDict  GenerateDynamicDictRequest
     * @return GenerateDynamicDictResponse
     */
    @Override
    public CompletableFuture<GenerateDynamicDictResponse> generateDynamicDict(GenerateDynamicDictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDynamicDict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDynamicDictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDynamicDictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateK8sAccessInfo  GenerateK8sAccessInfoRequest
     * @return GenerateK8sAccessInfoResponse
     */
    @Override
    public CompletableFuture<GenerateK8sAccessInfoResponse> generateK8sAccessInfo(GenerateK8sAccessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateK8sAccessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateK8sAccessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateK8sAccessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateOnceTask  GenerateOnceTaskRequest
     * @return GenerateOnceTaskResponse
     */
    @Override
    public CompletableFuture<GenerateOnceTaskResponse> generateOnceTask(GenerateOnceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateOnceTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateOnceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateOnceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountLabel  GetAccountLabelRequest
     * @return GetAccountLabelResponse
     */
    @Override
    public CompletableFuture<GetAccountLabelResponse> getAccountLabel(GetAccountLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Ultimate edition of Security Center supports this operation.</p>
     * 
     * @param request the request parameters of GetAegisContainerPluginRule  GetAegisContainerPluginRuleRequest
     * @return GetAegisContainerPluginRuleResponse
     */
    @Override
    public CompletableFuture<GetAegisContainerPluginRuleResponse> getAegisContainerPluginRule(GetAegisContainerPluginRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAegisContainerPluginRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAegisContainerPluginRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAegisContainerPluginRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAegisContainerPluginRuleCriteria  GetAegisContainerPluginRuleCriteriaRequest
     * @return GetAegisContainerPluginRuleCriteriaResponse
     */
    @Override
    public CompletableFuture<GetAegisContainerPluginRuleCriteriaResponse> getAegisContainerPluginRuleCriteria(GetAegisContainerPluginRuleCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAegisContainerPluginRuleCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAegisContainerPluginRuleCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAegisContainerPluginRuleCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentlessTaskCount  GetAgentlessTaskCountRequest
     * @return GetAgentlessTaskCountResponse
     */
    @Override
    public CompletableFuture<GetAgentlessTaskCountResponse> getAgentlessTaskCount(GetAgentlessTaskCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentlessTaskCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentlessTaskCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentlessTaskCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlarmMachineCount  GetAlarmMachineCountRequest
     * @return GetAlarmMachineCountResponse
     */
    @Override
    public CompletableFuture<GetAlarmMachineCountResponse> getAlarmMachineCount(GetAlarmMachineCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAlarmMachineCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlarmMachineCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlarmMachineCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAppNetwork  GetAppNetworkRequest
     * @return GetAppNetworkResponse
     */
    @Override
    public CompletableFuture<GetAppNetworkResponse> getAppNetwork(GetAppNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAppNetwork").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAssetDetailByUuid  GetAssetDetailByUuidRequest
     * @return GetAssetDetailByUuidResponse
     */
    @Override
    public CompletableFuture<GetAssetDetailByUuidResponse> getAssetDetailByUuid(GetAssetDetailByUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAssetDetailByUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAssetDetailByUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAssetDetailByUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAssetSelectionConfig  GetAssetSelectionConfigRequest
     * @return GetAssetSelectionConfigResponse
     */
    @Override
    public CompletableFuture<GetAssetSelectionConfigResponse> getAssetSelectionConfig(GetAssetSelectionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAssetSelectionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAssetSelectionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAssetSelectionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAssetsPropertyDetail  GetAssetsPropertyDetailRequest
     * @return GetAssetsPropertyDetailResponse
     */
    @Override
    public CompletableFuture<GetAssetsPropertyDetailResponse> getAssetsPropertyDetail(GetAssetsPropertyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAssetsPropertyDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAssetsPropertyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAssetsPropertyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAssetsPropertyItem  GetAssetsPropertyItemRequest
     * @return GetAssetsPropertyItemResponse
     */
    @Override
    public CompletableFuture<GetAssetsPropertyItemResponse> getAssetsPropertyItem(GetAssetsPropertyItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAssetsPropertyItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAssetsPropertyItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAssetsPropertyItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAttackTypeList  GetAttackTypeListRequest
     * @return GetAttackTypeListResponse
     */
    @Override
    public CompletableFuture<GetAttackTypeListResponse> getAttackTypeList(GetAttackTypeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAttackTypeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAttackTypeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAttackTypeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAuthSummary  GetAuthSummaryRequest
     * @return GetAuthSummaryResponse
     */
    @Override
    public CompletableFuture<GetAuthSummaryResponse> getAuthSummary(GetAuthSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuthSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuthSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuthSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAuthVersionStatistic  GetAuthVersionStatisticRequest
     * @return GetAuthVersionStatisticResponse
     */
    @Override
    public CompletableFuture<GetAuthVersionStatisticResponse> getAuthVersionStatistic(GetAuthVersionStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuthVersionStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuthVersionStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuthVersionStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBackupAutoConfigStatus  GetBackupAutoConfigStatusRequest
     * @return GetBackupAutoConfigStatusResponse
     */
    @Override
    public CompletableFuture<GetBackupAutoConfigStatusResponse> getBackupAutoConfigStatus(GetBackupAutoConfigStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBackupAutoConfigStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBackupAutoConfigStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBackupAutoConfigStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBackupStorageCount  GetBackupStorageCountRequest
     * @return GetBackupStorageCountResponse
     */
    @Override
    public CompletableFuture<GetBackupStorageCountResponse> getBackupStorageCount(GetBackupStorageCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBackupStorageCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBackupStorageCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBackupStorageCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBuildRiskDefineRuleConfig  GetBuildRiskDefineRuleConfigRequest
     * @return GetBuildRiskDefineRuleConfigResponse
     */
    @Override
    public CompletableFuture<GetBuildRiskDefineRuleConfigResponse> getBuildRiskDefineRuleConfig(GetBuildRiskDefineRuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBuildRiskDefineRuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBuildRiskDefineRuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBuildRiskDefineRuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCanTrySas  GetCanTrySasRequest
     * @return GetCanTrySasResponse
     */
    @Override
    public CompletableFuture<GetCanTrySasResponse> getCanTrySas(GetCanTrySasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCanTrySas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCanTrySasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCanTrySasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckConfig  GetCheckConfigRequest
     * @return GetCheckConfigResponse
     */
    @Override
    public CompletableFuture<GetCheckConfigResponse> getCheckConfig(GetCheckConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckDetail  GetCheckDetailRequest
     * @return GetCheckDetailResponse
     */
    @Override
    public CompletableFuture<GetCheckDetailResponse> getCheckDetail(GetCheckDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckProcess  GetCheckProcessRequest
     * @return GetCheckProcessResponse
     */
    @Override
    public CompletableFuture<GetCheckProcessResponse> getCheckProcess(GetCheckProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckRiskStatistics  GetCheckRiskStatisticsRequest
     * @return GetCheckRiskStatisticsResponse
     */
    @Override
    public CompletableFuture<GetCheckRiskStatisticsResponse> getCheckRiskStatistics(GetCheckRiskStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckRiskStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckRiskStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckRiskStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckSale  GetCheckSaleRequest
     * @return GetCheckSaleResponse
     */
    @Override
    public CompletableFuture<GetCheckSaleResponse> getCheckSale(GetCheckSaleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckSale").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckSaleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckSaleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase the configuration assessment feature before you can use the feature.</p>
     * 
     * @param request the request parameters of GetCheckStructure  GetCheckStructureRequest
     * @return GetCheckStructureResponse
     */
    @Override
    public CompletableFuture<GetCheckStructureResponse> getCheckStructure(GetCheckStructureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckStructure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckStructureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckStructureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCheckSummary  GetCheckSummaryRequest
     * @return GetCheckSummaryResponse
     */
    @Override
    public CompletableFuture<GetCheckSummaryResponse> getCheckSummary(GetCheckSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientRatioStatistic  GetClientRatioStatisticRequest
     * @return GetClientRatioStatisticResponse
     */
    @Override
    public CompletableFuture<GetClientRatioStatisticResponse> getClientRatioStatistic(GetClientRatioStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientRatioStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientRatioStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientRatioStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientUserDefineRule  GetClientUserDefineRuleRequest
     * @return GetClientUserDefineRuleResponse
     */
    @Override
    public CompletableFuture<GetClientUserDefineRuleResponse> getClientUserDefineRule(GetClientUserDefineRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientUserDefineRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientUserDefineRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientUserDefineRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCloudAssetCriteria  GetCloudAssetCriteriaRequest
     * @return GetCloudAssetCriteriaResponse
     */
    @Override
    public CompletableFuture<GetCloudAssetCriteriaResponse> getCloudAssetCriteria(GetCloudAssetCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCloudAssetCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCloudAssetCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCloudAssetCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCloudAssetDetail  GetCloudAssetDetailRequest
     * @return GetCloudAssetDetailResponse
     */
    @Override
    public CompletableFuture<GetCloudAssetDetailResponse> getCloudAssetDetail(GetCloudAssetDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCloudAssetDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCloudAssetDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCloudAssetDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCloudAssetSummary  GetCloudAssetSummaryRequest
     * @return GetCloudAssetSummaryResponse
     */
    @Override
    public CompletableFuture<GetCloudAssetSummaryResponse> getCloudAssetSummary(GetCloudAssetSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCloudAssetSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCloudAssetSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCloudAssetSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterCheckItemWarningStatistics  GetClusterCheckItemWarningStatisticsRequest
     * @return GetClusterCheckItemWarningStatisticsResponse
     */
    @Override
    public CompletableFuture<GetClusterCheckItemWarningStatisticsResponse> getClusterCheckItemWarningStatistics(GetClusterCheckItemWarningStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClusterCheckItemWarningStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterCheckItemWarningStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterCheckItemWarningStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterRuleSummary  GetClusterRuleSummaryRequest
     * @return GetClusterRuleSummaryResponse
     */
    @Override
    public CompletableFuture<GetClusterRuleSummaryResponse> getClusterRuleSummary(GetClusterRuleSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClusterRuleSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterRuleSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterRuleSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterStrategyCount  GetClusterStrategyCountRequest
     * @return GetClusterStrategyCountResponse
     */
    @Override
    public CompletableFuture<GetClusterStrategyCountResponse> getClusterStrategyCount(GetClusterStrategyCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClusterStrategyCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterStrategyCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterStrategyCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterSuspEventStatistics  GetClusterSuspEventStatisticsRequest
     * @return GetClusterSuspEventStatisticsResponse
     */
    @Override
    public CompletableFuture<GetClusterSuspEventStatisticsResponse> getClusterSuspEventStatistics(GetClusterSuspEventStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClusterSuspEventStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterSuspEventStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterSuspEventStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCommonSwitchConfig  GetCommonSwitchConfigRequest
     * @return GetCommonSwitchConfigResponse
     */
    @Override
    public CompletableFuture<GetCommonSwitchConfigResponse> getCommonSwitchConfig(GetCommonSwitchConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCommonSwitchConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCommonSwitchConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCommonSwitchConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContainerDefenseRuleDetail  GetContainerDefenseRuleDetailRequest
     * @return GetContainerDefenseRuleDetailResponse
     */
    @Override
    public CompletableFuture<GetContainerDefenseRuleDetailResponse> getContainerDefenseRuleDetail(GetContainerDefenseRuleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContainerDefenseRuleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContainerDefenseRuleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContainerDefenseRuleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCurrentVersionPublish  GetCurrentVersionPublishRequest
     * @return GetCurrentVersionPublishResponse
     */
    @Override
    public CompletableFuture<GetCurrentVersionPublishResponse> getCurrentVersionPublish(GetCurrentVersionPublishRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCurrentVersionPublish").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCurrentVersionPublishResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCurrentVersionPublishResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataTrend  GetDataTrendRequest
     * @return GetDataTrendResponse
     */
    @Override
    public CompletableFuture<GetDataTrendResponse> getDataTrend(GetDataTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDefenceCount  GetDefenceCountRequest
     * @return GetDefenceCountResponse
     */
    @Override
    public CompletableFuture<GetDefenceCountResponse> getDefenceCount(GetDefenceCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDefenceCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDefenceCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDefenceCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileDetectApiInvokeInfo  GetFileDetectApiInvokeInfoRequest
     * @return GetFileDetectApiInvokeInfoResponse
     */
    @Override
    public CompletableFuture<GetFileDetectApiInvokeInfoResponse> getFileDetectApiInvokeInfo(GetFileDetectApiInvokeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileDetectApiInvokeInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileDetectApiInvokeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileDetectApiInvokeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileDetectReport  GetFileDetectReportRequest
     * @return GetFileDetectReportResponse
     */
    @Override
    public CompletableFuture<GetFileDetectReportResponse> getFileDetectReport(GetFileDetectReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileDetectReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileDetectReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileDetectReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only MD5 hash values are supported. Before you call this operation, calculate the MD5 hash value of the file.</p>
     * 
     * @param request the request parameters of GetFileDetectResult  GetFileDetectResultRequest
     * @return GetFileDetectResultResponse
     */
    @Override
    public CompletableFuture<GetFileDetectResultResponse> getFileDetectResult(GetFileDetectResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileDetectResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileDetectResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileDetectResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileProtectDashboard  GetFileProtectDashboardRequest
     * @return GetFileProtectDashboardResponse
     */
    @Override
    public CompletableFuture<GetFileProtectDashboardResponse> getFileProtectDashboard(GetFileProtectDashboardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileProtectDashboard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileProtectDashboardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileProtectDashboardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileProtectEvent  GetFileProtectEventRequest
     * @return GetFileProtectEventResponse
     */
    @Override
    public CompletableFuture<GetFileProtectEventResponse> getFileProtectEvent(GetFileProtectEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileProtectEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileProtectEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileProtectEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileProtectEventCount  GetFileProtectEventCountRequest
     * @return GetFileProtectEventCountResponse
     */
    @Override
    public CompletableFuture<GetFileProtectEventCountResponse> getFileProtectEventCount(GetFileProtectEventCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileProtectEventCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileProtectEventCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileProtectEventCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileProtectRule  GetFileProtectRuleRequest
     * @return GetFileProtectRuleResponse
     */
    @Override
    public CompletableFuture<GetFileProtectRuleResponse> getFileProtectRule(GetFileProtectRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileProtectRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileProtectRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileProtectRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileUploadLimit  GetFileUploadLimitRequest
     * @return GetFileUploadLimitResponse
     */
    @Override
    public CompletableFuture<GetFileUploadLimitResponse> getFileUploadLimit(GetFileUploadLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileUploadLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileUploadLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileUploadLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneyPotUploadPolicyInfo  GetHoneyPotUploadPolicyInfoRequest
     * @return GetHoneyPotUploadPolicyInfoResponse
     */
    @Override
    public CompletableFuture<GetHoneyPotUploadPolicyInfoResponse> getHoneyPotUploadPolicyInfo(GetHoneyPotUploadPolicyInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneyPotUploadPolicyInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneyPotUploadPolicyInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneyPotUploadPolicyInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotAttackStatistics  GetHoneypotAttackStatisticsRequest
     * @return GetHoneypotAttackStatisticsResponse
     */
    @Override
    public CompletableFuture<GetHoneypotAttackStatisticsResponse> getHoneypotAttackStatistics(GetHoneypotAttackStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotAttackStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotAttackStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotAttackStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotEventTrend  GetHoneypotEventTrendRequest
     * @return GetHoneypotEventTrendResponse
     */
    @Override
    public CompletableFuture<GetHoneypotEventTrendResponse> getHoneypotEventTrend(GetHoneypotEventTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotEventTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotEventTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotEventTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotNode  GetHoneypotNodeRequest
     * @return GetHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<GetHoneypotNodeResponse> getHoneypotNode(GetHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotNodeMetricList  GetHoneypotNodeMetricListRequest
     * @return GetHoneypotNodeMetricListResponse
     */
    @Override
    public CompletableFuture<GetHoneypotNodeMetricListResponse> getHoneypotNodeMetricList(GetHoneypotNodeMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotNodeMetricList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotNodeMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotNodeMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotPreset  GetHoneypotPresetRequest
     * @return GetHoneypotPresetResponse
     */
    @Override
    public CompletableFuture<GetHoneypotPresetResponse> getHoneypotPreset(GetHoneypotPresetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotPreset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotPresetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotPresetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotProbe  GetHoneypotProbeRequest
     * @return GetHoneypotProbeResponse
     */
    @Override
    public CompletableFuture<GetHoneypotProbeResponse> getHoneypotProbe(GetHoneypotProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHoneypotStatistics  GetHoneypotStatisticsRequest
     * @return GetHoneypotStatisticsResponse
     */
    @Override
    public CompletableFuture<GetHoneypotStatisticsResponse> getHoneypotStatistics(GetHoneypotStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHoneypotStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHoneypotStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHoneypotStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageEventOperation  GetImageEventOperationRequest
     * @return GetImageEventOperationResponse
     */
    @Override
    public CompletableFuture<GetImageEventOperationResponse> getImageEventOperation(GetImageEventOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageEventOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageEventOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageEventOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageScanNumInPeriod  GetImageScanNumInPeriodRequest
     * @return GetImageScanNumInPeriodResponse
     */
    @Override
    public CompletableFuture<GetImageScanNumInPeriodResponse> getImageScanNumInPeriod(GetImageScanNumInPeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageScanNumInPeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageScanNumInPeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageScanNumInPeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInterceptionRuleDetail  GetInterceptionRuleDetailRequest
     * @return GetInterceptionRuleDetailResponse
     */
    @Override
    public CompletableFuture<GetInterceptionRuleDetailResponse> getInterceptionRuleDetail(GetInterceptionRuleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInterceptionRuleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInterceptionRuleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInterceptionRuleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInterceptionSummary  GetInterceptionSummaryRequest
     * @return GetInterceptionSummaryResponse
     */
    @Override
    public CompletableFuture<GetInterceptionSummaryResponse> getInterceptionSummary(GetInterceptionSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInterceptionSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInterceptionSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInterceptionSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInterceptionTargetDetail  GetInterceptionTargetDetailRequest
     * @return GetInterceptionTargetDetailResponse
     */
    @Override
    public CompletableFuture<GetInterceptionTargetDetailResponse> getInterceptionTargetDetail(GetInterceptionTargetDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInterceptionTargetDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInterceptionTargetDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInterceptionTargetDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLastOnceTaskInfo  GetLastOnceTaskInfoRequest
     * @return GetLastOnceTaskInfoResponse
     */
    @Override
    public CompletableFuture<GetLastOnceTaskInfoResponse> getLastOnceTaskInfo(GetLastOnceTaskInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLastOnceTaskInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLastOnceTaskInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLastOnceTaskInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLocalDefaultRegion  GetLocalDefaultRegionRequest
     * @return GetLocalDefaultRegionResponse
     */
    @Override
    public CompletableFuture<GetLocalDefaultRegionResponse> getLocalDefaultRegion(GetLocalDefaultRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLocalDefaultRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLocalDefaultRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLocalDefaultRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLogMeta  GetLogMetaRequest
     * @return GetLogMetaResponse
     */
    @Override
    public CompletableFuture<GetLogMetaResponse> getLogMeta(GetLogMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLogMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMaliciousFileWhitelistConfig  GetMaliciousFileWhitelistConfigRequest
     * @return GetMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<GetMaliciousFileWhitelistConfigResponse> getMaliciousFileWhitelistConfig(GetMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModuleConfig  GetModuleConfigRequest
     * @return GetModuleConfigResponse
     */
    @Override
    public CompletableFuture<GetModuleConfigResponse> getModuleConfig(GetModuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModuleConfigStatus  GetModuleConfigStatusRequest
     * @return GetModuleConfigStatusResponse
     */
    @Override
    public CompletableFuture<GetModuleConfigStatusResponse> getModuleConfigStatus(GetModuleConfigStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModuleConfigStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModuleConfigStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModuleConfigStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModuleTrialAuthInfo  GetModuleTrialAuthInfoRequest
     * @return GetModuleTrialAuthInfoResponse
     */
    @Override
    public CompletableFuture<GetModuleTrialAuthInfoResponse> getModuleTrialAuthInfo(GetModuleTrialAuthInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModuleTrialAuthInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModuleTrialAuthInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModuleTrialAuthInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetObjectScanEvent  GetObjectScanEventRequest
     * @return GetObjectScanEventResponse
     */
    @Override
    public CompletableFuture<GetObjectScanEventResponse> getObjectScanEvent(GetObjectScanEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetObjectScanEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetObjectScanEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetObjectScanEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOnceTaskResultInfo  GetOnceTaskResultInfoRequest
     * @return GetOnceTaskResultInfoResponse
     */
    @Override
    public CompletableFuture<GetOnceTaskResultInfoResponse> getOnceTaskResultInfo(GetOnceTaskResultInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOnceTaskResultInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOnceTaskResultInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOnceTaskResultInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaClusterBaseLineList  GetOpaClusterBaseLineListRequest
     * @return GetOpaClusterBaseLineListResponse
     */
    @Override
    public CompletableFuture<GetOpaClusterBaseLineListResponse> getOpaClusterBaseLineList(GetOpaClusterBaseLineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaClusterBaseLineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaClusterBaseLineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaClusterBaseLineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaClusterImageList  GetOpaClusterImageListRequest
     * @return GetOpaClusterImageListResponse
     */
    @Override
    public CompletableFuture<GetOpaClusterImageListResponse> getOpaClusterImageList(GetOpaClusterImageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaClusterImageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaClusterImageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaClusterImageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaClusterLabelList  GetOpaClusterLabelListRequest
     * @return GetOpaClusterLabelListResponse
     */
    @Override
    public CompletableFuture<GetOpaClusterLabelListResponse> getOpaClusterLabelList(GetOpaClusterLabelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaClusterLabelList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaClusterLabelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaClusterLabelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaClusterNamespaceList  GetOpaClusterNamespaceListRequest
     * @return GetOpaClusterNamespaceListResponse
     */
    @Override
    public CompletableFuture<GetOpaClusterNamespaceListResponse> getOpaClusterNamespaceList(GetOpaClusterNamespaceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaClusterNamespaceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaClusterNamespaceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaClusterNamespaceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaPluginStatus  GetOpaPluginStatusRequest
     * @return GetOpaPluginStatusResponse
     */
    @Override
    public CompletableFuture<GetOpaPluginStatusResponse> getOpaPluginStatus(GetOpaPluginStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaPluginStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaPluginStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaPluginStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaStrategyDetailNew  GetOpaStrategyDetailNewRequest
     * @return GetOpaStrategyDetailNewResponse
     */
    @Override
    public CompletableFuture<GetOpaStrategyDetailNewResponse> getOpaStrategyDetailNew(GetOpaStrategyDetailNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaStrategyDetailNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaStrategyDetailNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaStrategyDetailNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOpaStrategyTemplateSummary  GetOpaStrategyTemplateSummaryRequest
     * @return GetOpaStrategyTemplateSummaryResponse
     */
    @Override
    public CompletableFuture<GetOpaStrategyTemplateSummaryResponse> getOpaStrategyTemplateSummary(GetOpaStrategyTemplateSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpaStrategyTemplateSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpaStrategyTemplateSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpaStrategyTemplateSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOssBucketScanStatistic  GetOssBucketScanStatisticRequest
     * @return GetOssBucketScanStatisticResponse
     */
    @Override
    public CompletableFuture<GetOssBucketScanStatisticResponse> getOssBucketScanStatistic(GetOssBucketScanStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOssBucketScanStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOssBucketScanStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOssBucketScanStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOssScanConfig  GetOssScanConfigRequest
     * @return GetOssScanConfigResponse
     */
    @Override
    public CompletableFuture<GetOssScanConfigResponse> getOssScanConfig(GetOssScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOssScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOssScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOssScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPropertyScheduleConfig  GetPropertyScheduleConfigRequest
     * @return GetPropertyScheduleConfigResponse
     */
    @Override
    public CompletableFuture<GetPropertyScheduleConfigResponse> getPropertyScheduleConfig(GetPropertyScheduleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPropertyScheduleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPropertyScheduleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPropertyScheduleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the management account of a resource directory or a delegated administrator account of Security Center.</p>
     * 
     * @param request the request parameters of GetRdTree  GetRdTreeRequest
     * @return GetRdTreeResponse
     */
    @Override
    public CompletableFuture<GetRdTreeResponse> getRdTree(GetRdTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRdTree").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRdTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRdTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRulesCount  GetRulesCountRequest
     * @return GetRulesCountResponse
     */
    @Override
    public CompletableFuture<GetRulesCountResponse> getRulesCount(GetRulesCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRulesCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRulesCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRulesCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSasContainerWebDefenseRuleApplication  GetSasContainerWebDefenseRuleApplicationRequest
     * @return GetSasContainerWebDefenseRuleApplicationResponse
     */
    @Override
    public CompletableFuture<GetSasContainerWebDefenseRuleApplicationResponse> getSasContainerWebDefenseRuleApplication(GetSasContainerWebDefenseRuleApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSasContainerWebDefenseRuleApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSasContainerWebDefenseRuleApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSasContainerWebDefenseRuleApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSasContainerWebDefenseRuleCriteria  GetSasContainerWebDefenseRuleCriteriaRequest
     * @return GetSasContainerWebDefenseRuleCriteriaResponse
     */
    @Override
    public CompletableFuture<GetSasContainerWebDefenseRuleCriteriaResponse> getSasContainerWebDefenseRuleCriteria(GetSasContainerWebDefenseRuleCriteriaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSasContainerWebDefenseRuleCriteria").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSasContainerWebDefenseRuleCriteriaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSasContainerWebDefenseRuleCriteriaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSecurityScoreRule  GetSecurityScoreRuleRequest
     * @return GetSecurityScoreRuleResponse
     */
    @Override
    public CompletableFuture<GetSecurityScoreRuleResponse> getSecurityScoreRule(GetSecurityScoreRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecurityScoreRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecurityScoreRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecurityScoreRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSensitiveDefineRuleConfig  GetSensitiveDefineRuleConfigRequest
     * @return GetSensitiveDefineRuleConfigResponse
     */
    @Override
    public CompletableFuture<GetSensitiveDefineRuleConfigResponse> getSensitiveDefineRuleConfig(GetSensitiveDefineRuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSensitiveDefineRuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSensitiveDefineRuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSensitiveDefineRuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceTrail  GetServiceTrailRequest
     * @return GetServiceTrailResponse
     */
    @Override
    public CompletableFuture<GetServiceTrailResponse> getServiceTrail(GetServiceTrailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceTrail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceTrailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceTrailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStrategyTemplateDetail  GetStrategyTemplateDetailRequest
     * @return GetStrategyTemplateDetailResponse
     */
    @Override
    public CompletableFuture<GetStrategyTemplateDetailResponse> getStrategyTemplateDetail(GetStrategyTemplateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStrategyTemplateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStrategyTemplateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStrategyTemplateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSupportedModules  GetSupportedModulesRequest
     * @return GetSupportedModulesResponse
     */
    @Override
    public CompletableFuture<GetSupportedModulesResponse> getSupportedModules(GetSupportedModulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSupportedModules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSupportedModulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSupportedModulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSuspiciousStatistics  GetSuspiciousStatisticsRequest
     * @return GetSuspiciousStatisticsResponse
     */
    @Override
    public CompletableFuture<GetSuspiciousStatisticsResponse> getSuspiciousStatistics(GetSuspiciousStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSuspiciousStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSuspiciousStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSuspiciousStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSwitchRegionDetail  GetSwitchRegionDetailRequest
     * @return GetSwitchRegionDetailResponse
     */
    @Override
    public CompletableFuture<GetSwitchRegionDetailResponse> getSwitchRegionDetail(GetSwitchRegionDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSwitchRegionDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSwitchRegionDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSwitchRegionDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTenantCheckAvailable  GetTenantCheckAvailableRequest
     * @return GetTenantCheckAvailableResponse
     */
    @Override
    public CompletableFuture<GetTenantCheckAvailableResponse> getTenantCheckAvailable(GetTenantCheckAvailableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTenantCheckAvailable").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTenantCheckAvailableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTenantCheckAvailableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserLang  GetUserLangRequest
     * @return GetUserLangResponse
     */
    @Override
    public CompletableFuture<GetUserLangResponse> getUserLang(GetUserLangRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserLang").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserLangResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserLangResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVirusScanConfig  GetVirusScanConfigRequest
     * @return GetVirusScanConfigResponse
     */
    @Override
    public CompletableFuture<GetVirusScanConfigResponse> getVirusScanConfig(GetVirusScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVirusScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVirusScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVirusScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVirusScanLatestTaskStatistic  GetVirusScanLatestTaskStatisticRequest
     * @return GetVirusScanLatestTaskStatisticResponse
     */
    @Override
    public CompletableFuture<GetVirusScanLatestTaskStatisticResponse> getVirusScanLatestTaskStatistic(GetVirusScanLatestTaskStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVirusScanLatestTaskStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVirusScanLatestTaskStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVirusScanLatestTaskStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVulStatistics  GetVulStatisticsRequest
     * @return GetVulStatisticsResponse
     */
    @Override
    public CompletableFuture<GetVulStatisticsResponse> getVulStatistics(GetVulStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVulStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVulStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVulStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVulWhitelist  GetVulWhitelistRequest
     * @return GetVulWhitelistResponse
     */
    @Override
    public CompletableFuture<GetVulWhitelistResponse> getVulWhitelist(GetVulWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVulWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVulWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVulWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HandleSecurityEvents  HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    @Override
    public CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HandleSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HandleSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HandleSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HandleSimilarSecurityEvents  HandleSimilarSecurityEventsRequest
     * @return HandleSimilarSecurityEventsResponse
     */
    @Override
    public CompletableFuture<HandleSimilarSecurityEventsResponse> handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HandleSimilarSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HandleSimilarSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HandleSimilarSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IgnoreCheckItems  IgnoreCheckItemsRequest
     * @return IgnoreCheckItemsResponse
     */
    @Override
    public CompletableFuture<IgnoreCheckItemsResponse> ignoreCheckItems(IgnoreCheckItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IgnoreCheckItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IgnoreCheckItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IgnoreCheckItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI IgnoreHcCheckWarnings is deprecated, please use Sas::2018-12-03::IgnoreCheckItems instead.  * @param request  the request parameters of IgnoreHcCheckWarnings  IgnoreHcCheckWarningsRequest
     * @return IgnoreHcCheckWarningsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<IgnoreHcCheckWarningsResponse> ignoreHcCheckWarnings(IgnoreHcCheckWarningsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IgnoreHcCheckWarnings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IgnoreHcCheckWarningsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IgnoreHcCheckWarningsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IgnoreIdcProbeScanResult  IgnoreIdcProbeScanResultRequest
     * @return IgnoreIdcProbeScanResultResponse
     */
    @Override
    public CompletableFuture<IgnoreIdcProbeScanResultResponse> ignoreIdcProbeScanResult(IgnoreIdcProbeScanResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IgnoreIdcProbeScanResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IgnoreIdcProbeScanResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IgnoreIdcProbeScanResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallBackupClient  InstallBackupClientRequest
     * @return InstallBackupClientResponse
     */
    @Override
    public CompletableFuture<InstallBackupClientResponse> installBackupClient(InstallBackupClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallBackupClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallBackupClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallBackupClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that the Security Center agent on your servers is online and the servers can access Alibaba Cloud services.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InstallCloudMonitor  InstallCloudMonitorRequest
     * @return InstallCloudMonitorResponse
     */
    @Override
    public CompletableFuture<InstallCloudMonitorResponse> installCloudMonitor(InstallCloudMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallCloudMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallCloudMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallCloudMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallHybridProxy  InstallHybridProxyRequest
     * @return InstallHybridProxyResponse
     */
    @Override
    public CompletableFuture<InstallHybridProxyResponse> installHybridProxy(InstallHybridProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallHybridProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallHybridProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallHybridProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallPmAgent  InstallPmAgentRequest
     * @return InstallPmAgentResponse
     */
    @Override
    public CompletableFuture<InstallPmAgentResponse> installPmAgent(InstallPmAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallPmAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallPmAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallPmAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallUniBackupAgent  InstallUniBackupAgentRequest
     * @return InstallUniBackupAgentResponse
     */
    @Override
    public CompletableFuture<InstallUniBackupAgentResponse> installUniBackupAgent(InstallUniBackupAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallUniBackupAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallUniBackupAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallUniBackupAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of JoinWebLockProcessWhiteList  JoinWebLockProcessWhiteListRequest
     * @return JoinWebLockProcessWhiteListResponse
     */
    @Override
    public CompletableFuture<JoinWebLockProcessWhiteListResponse> joinWebLockProcessWhiteList(JoinWebLockProcessWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinWebLockProcessWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinWebLockProcessWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinWebLockProcessWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the management account of your resource directory or a delegated administrator account of Security Center to call this operation.</p>
     * 
     * @param request the request parameters of ListAccountsInResourceDirectory  ListAccountsInResourceDirectoryRequest
     * @return ListAccountsInResourceDirectoryResponse
     */
    @Override
    public CompletableFuture<ListAccountsInResourceDirectoryResponse> listAccountsInResourceDirectory(ListAccountsInResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccountsInResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccountsInResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccountsInResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAegisContainerPluginRule  ListAegisContainerPluginRuleRequest
     * @return ListAegisContainerPluginRuleResponse
     */
    @Override
    public CompletableFuture<ListAegisContainerPluginRuleResponse> listAegisContainerPluginRule(ListAegisContainerPluginRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAegisContainerPluginRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAegisContainerPluginRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAegisContainerPluginRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentlessMaliciousFiles  ListAgentlessMaliciousFilesRequest
     * @return ListAgentlessMaliciousFilesResponse
     */
    @Override
    public CompletableFuture<ListAgentlessMaliciousFilesResponse> listAgentlessMaliciousFiles(ListAgentlessMaliciousFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentlessMaliciousFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentlessMaliciousFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentlessMaliciousFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentlessRegion  ListAgentlessRegionRequest
     * @return ListAgentlessRegionResponse
     */
    @Override
    public CompletableFuture<ListAgentlessRegionResponse> listAgentlessRegion(ListAgentlessRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentlessRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentlessRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentlessRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentlessRelateMalicious  ListAgentlessRelateMaliciousRequest
     * @return ListAgentlessRelateMaliciousResponse
     */
    @Override
    public CompletableFuture<ListAgentlessRelateMaliciousResponse> listAgentlessRelateMalicious(ListAgentlessRelateMaliciousRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentlessRelateMalicious").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentlessRelateMaliciousResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentlessRelateMaliciousResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentlessRiskUuid  ListAgentlessRiskUuidRequest
     * @return ListAgentlessRiskUuidResponse
     */
    @Override
    public CompletableFuture<ListAgentlessRiskUuidResponse> listAgentlessRiskUuid(ListAgentlessRiskUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentlessRiskUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentlessRiskUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentlessRiskUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentlessTask  ListAgentlessTaskRequest
     * @return ListAgentlessTaskResponse
     */
    @Override
    public CompletableFuture<ListAgentlessTaskResponse> listAgentlessTask(ListAgentlessTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentlessTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentlessTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentlessTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssetCleanConfig  ListAssetCleanConfigRequest
     * @return ListAssetCleanConfigResponse
     */
    @Override
    public CompletableFuture<ListAssetCleanConfigResponse> listAssetCleanConfig(ListAssetCleanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssetCleanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssetCleanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssetCleanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssetInfoPublish  ListAssetInfoPublishRequest
     * @return ListAssetInfoPublishResponse
     */
    @Override
    public CompletableFuture<ListAssetInfoPublishResponse> listAssetInfoPublish(ListAssetInfoPublishRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssetInfoPublish").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssetInfoPublishResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssetInfoPublishResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssetRefreshTaskConfig  ListAssetRefreshTaskConfigRequest
     * @return ListAssetRefreshTaskConfigResponse
     */
    @Override
    public CompletableFuture<ListAssetRefreshTaskConfigResponse> listAssetRefreshTaskConfig(ListAssetRefreshTaskConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssetRefreshTaskConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssetRefreshTaskConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssetRefreshTaskConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssetSelectionSelectedTarget  ListAssetSelectionSelectedTargetRequest
     * @return ListAssetSelectionSelectedTargetResponse
     */
    @Override
    public CompletableFuture<ListAssetSelectionSelectedTargetResponse> listAssetSelectionSelectedTarget(ListAssetSelectionSelectedTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssetSelectionSelectedTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssetSelectionSelectedTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssetSelectionSelectedTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAssetSelectionTarget  ListAssetSelectionTargetRequest
     * @return ListAssetSelectionTargetResponse
     */
    @Override
    public CompletableFuture<ListAssetSelectionTargetResponse> listAssetSelectionTarget(ListAssetSelectionTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAssetSelectionTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAssetSelectionTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAssetSelectionTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoTagRules  ListAutoTagRulesRequest
     * @return ListAutoTagRulesResponse
     */
    @Override
    public CompletableFuture<ListAutoTagRulesResponse> listAutoTagRules(ListAutoTagRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoTagRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoTagRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoTagRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableHoneypot  ListAvailableHoneypotRequest
     * @return ListAvailableHoneypotResponse
     */
    @Override
    public CompletableFuture<ListAvailableHoneypotResponse> listAvailableHoneypot(ListAvailableHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBackupRecord  ListBackupRecordRequest
     * @return ListBackupRecordResponse
     */
    @Override
    public CompletableFuture<ListBackupRecordResponse> listBackupRecord(ListBackupRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBackupRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBackupRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBackupRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBaselineCheckWhiteRecord  ListBaselineCheckWhiteRecordRequest
     * @return ListBaselineCheckWhiteRecordResponse
     */
    @Override
    public CompletableFuture<ListBaselineCheckWhiteRecordResponse> listBaselineCheckWhiteRecord(ListBaselineCheckWhiteRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBaselineCheckWhiteRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBaselineCheckWhiteRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBaselineCheckWhiteRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckInstanceResult  ListCheckInstanceResultRequest
     * @return ListCheckInstanceResultResponse
     */
    @Override
    public CompletableFuture<ListCheckInstanceResultResponse> listCheckInstanceResult(ListCheckInstanceResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckInstanceResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckInstanceResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckInstanceResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckItem  ListCheckItemRequest
     * @return ListCheckItemResponse
     */
    @Override
    public CompletableFuture<ListCheckItemResponse> listCheckItem(ListCheckItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckItemWarningMachine  ListCheckItemWarningMachineRequest
     * @return ListCheckItemWarningMachineResponse
     */
    @Override
    public CompletableFuture<ListCheckItemWarningMachineResponse> listCheckItemWarningMachine(ListCheckItemWarningMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckItemWarningMachine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckItemWarningMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckItemWarningMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckItemWarningSummary  ListCheckItemWarningSummaryRequest
     * @return ListCheckItemWarningSummaryResponse
     */
    @Override
    public CompletableFuture<ListCheckItemWarningSummaryResponse> listCheckItemWarningSummary(ListCheckItemWarningSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckItemWarningSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckItemWarningSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckItemWarningSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckResult  ListCheckResultRequest
     * @return ListCheckResultResponse
     */
    @Override
    public CompletableFuture<ListCheckResultResponse> listCheckResult(ListCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckStandard  ListCheckStandardRequest
     * @return ListCheckStandardResponse
     */
    @Override
    public CompletableFuture<ListCheckStandardResponse> listCheckStandard(ListCheckStandardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckStandard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckStandardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckStandardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCheckTypes  ListCheckTypesRequest
     * @return ListCheckTypesResponse
     */
    @Override
    public CompletableFuture<ListCheckTypesResponse> listCheckTypes(ListCheckTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCheckTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCheckTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCheckTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClientAlertMode  ListClientAlertModeRequest
     * @return ListClientAlertModeResponse
     */
    @Override
    public CompletableFuture<ListClientAlertModeResponse> listClientAlertMode(ListClientAlertModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientAlertMode").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientAlertModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientAlertModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClientUserDefineRuleTypes  ListClientUserDefineRuleTypesRequest
     * @return ListClientUserDefineRuleTypesResponse
     */
    @Override
    public CompletableFuture<ListClientUserDefineRuleTypesResponse> listClientUserDefineRuleTypes(ListClientUserDefineRuleTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientUserDefineRuleTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientUserDefineRuleTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientUserDefineRuleTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClientUserDefineRules  ListClientUserDefineRulesRequest
     * @return ListClientUserDefineRulesResponse
     */
    @Override
    public CompletableFuture<ListClientUserDefineRulesResponse> listClientUserDefineRules(ListClientUserDefineRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientUserDefineRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientUserDefineRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientUserDefineRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCloudAssetInstances  ListCloudAssetInstancesRequest
     * @return ListCloudAssetInstancesResponse
     */
    @Override
    public CompletableFuture<ListCloudAssetInstancesResponse> listCloudAssetInstances(ListCloudAssetInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCloudAssetInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCloudAssetInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCloudAssetInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCloudVendorRegions  ListCloudVendorRegionsRequest
     * @return ListCloudVendorRegionsResponse
     */
    @Override
    public CompletableFuture<ListCloudVendorRegionsResponse> listCloudVendorRegions(ListCloudVendorRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCloudVendorRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCloudVendorRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCloudVendorRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterCnnfStatusDetail  ListClusterCnnfStatusDetailRequest
     * @return ListClusterCnnfStatusDetailResponse
     */
    @Override
    public CompletableFuture<ListClusterCnnfStatusDetailResponse> listClusterCnnfStatusDetail(ListClusterCnnfStatusDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusterCnnfStatusDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterCnnfStatusDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterCnnfStatusDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterInterceptionConfig  ListClusterInterceptionConfigRequest
     * @return ListClusterInterceptionConfigResponse
     */
    @Override
    public CompletableFuture<ListClusterInterceptionConfigResponse> listClusterInterceptionConfig(ListClusterInterceptionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusterInterceptionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterInterceptionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterInterceptionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterPluginInfo  ListClusterPluginInfoRequest
     * @return ListClusterPluginInfoResponse
     */
    @Override
    public CompletableFuture<ListClusterPluginInfoResponse> listClusterPluginInfo(ListClusterPluginInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusterPluginInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterPluginInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterPluginInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the detection results of files only if the files are pushed to the cloud for detection and in the form of packages. You can repeatedly query the detection results of files within 5 hours because the results are retained for 5 hours. For more information about how to push a file to the cloud for detection, see the CreateFileDetect operation. For more information about how to query file detection results, see the GetFileDetectResult operation.
     * The HashKey parameter is included in all API operations that are related to the file detection feature. The parameter specifies the unique identifier of a file. Only hexadecimal MD5 hash values of complete file content are supported. You must calculate the required MD5 hash value before you call this operation.
     * To calculate the hexadecimal MD5 hash value for a file, you can perform the following steps:
     * 1\. Use the MD5 algorithm to encrypt data and generate a 128-bit hash value. You can use a tool such as MessageDigest for Java and the hashlib module for Python.
     * 2\. Convert the hash value to a hexadecimal string. You can use a tool such as Codec for Java and the hex() function for Python.</p>
     * 
     * @param request the request parameters of ListCompressFileDetectResult  ListCompressFileDetectResultRequest
     * @return ListCompressFileDetectResultResponse
     */
    @Override
    public CompletableFuture<ListCompressFileDetectResultResponse> listCompressFileDetectResult(ListCompressFileDetectResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCompressFileDetectResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCompressFileDetectResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCompressFileDetectResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContainerDefenseRule  ListContainerDefenseRuleRequest
     * @return ListContainerDefenseRuleResponse
     */
    @Override
    public CompletableFuture<ListContainerDefenseRuleResponse> listContainerDefenseRule(ListContainerDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContainerDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContainerDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContainerDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContainerDefenseRuleClusters  ListContainerDefenseRuleClustersRequest
     * @return ListContainerDefenseRuleClustersResponse
     */
    @Override
    public CompletableFuture<ListContainerDefenseRuleClustersResponse> listContainerDefenseRuleClusters(ListContainerDefenseRuleClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContainerDefenseRuleClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContainerDefenseRuleClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContainerDefenseRuleClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCriteriaStrategy  ListCriteriaStrategyRequest
     * @return ListCriteriaStrategyResponse
     */
    @Override
    public CompletableFuture<ListCriteriaStrategyResponse> listCriteriaStrategy(ListCriteriaStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCriteriaStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCriteriaStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCriteriaStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileProtectEvent  ListFileProtectEventRequest
     * @return ListFileProtectEventResponse
     */
    @Override
    public CompletableFuture<ListFileProtectEventResponse> listFileProtectEvent(ListFileProtectEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileProtectEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileProtectEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileProtectEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileProtectPluginStatus  ListFileProtectPluginStatusRequest
     * @return ListFileProtectPluginStatusResponse
     */
    @Override
    public CompletableFuture<ListFileProtectPluginStatusResponse> listFileProtectPluginStatus(ListFileProtectPluginStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileProtectPluginStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileProtectPluginStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileProtectPluginStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileProtectRule  ListFileProtectRuleRequest
     * @return ListFileProtectRuleResponse
     */
    @Override
    public CompletableFuture<ListFileProtectRuleResponse> listFileProtectRule(ListFileProtectRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileProtectRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileProtectRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileProtectRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    @Override
    public CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypot  ListHoneypotRequest
     * @return ListHoneypotResponse
     */
    @Override
    public CompletableFuture<ListHoneypotResponse> listHoneypot(ListHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotAlarmEvents  ListHoneypotAlarmEventsRequest
     * @return ListHoneypotAlarmEventsResponse
     */
    @Override
    public CompletableFuture<ListHoneypotAlarmEventsResponse> listHoneypotAlarmEvents(ListHoneypotAlarmEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotAlarmEvents").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotAlarmEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotAlarmEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotAttackerPortrait  ListHoneypotAttackerPortraitRequest
     * @return ListHoneypotAttackerPortraitResponse
     */
    @Override
    public CompletableFuture<ListHoneypotAttackerPortraitResponse> listHoneypotAttackerPortrait(ListHoneypotAttackerPortraitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotAttackerPortrait").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotAttackerPortraitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotAttackerPortraitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotAttackerSource  ListHoneypotAttackerSourceRequest
     * @return ListHoneypotAttackerSourceResponse
     */
    @Override
    public CompletableFuture<ListHoneypotAttackerSourceResponse> listHoneypotAttackerSource(ListHoneypotAttackerSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotAttackerSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotAttackerSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotAttackerSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotEventFlows  ListHoneypotEventFlowsRequest
     * @return ListHoneypotEventFlowsResponse
     */
    @Override
    public CompletableFuture<ListHoneypotEventFlowsResponse> listHoneypotEventFlows(ListHoneypotEventFlowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotEventFlows").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotEventFlowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotEventFlowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotEvents  ListHoneypotEventsRequest
     * @return ListHoneypotEventsResponse
     */
    @Override
    public CompletableFuture<ListHoneypotEventsResponse> listHoneypotEvents(ListHoneypotEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotEvents").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotNode  ListHoneypotNodeRequest
     * @return ListHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<ListHoneypotNodeResponse> listHoneypotNode(ListHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotPreset  ListHoneypotPresetRequest
     * @return ListHoneypotPresetResponse
     */
    @Override
    public CompletableFuture<ListHoneypotPresetResponse> listHoneypotPreset(ListHoneypotPresetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotPreset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotPresetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotPresetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotProbe  ListHoneypotProbeRequest
     * @return ListHoneypotProbeResponse
     */
    @Override
    public CompletableFuture<ListHoneypotProbeResponse> listHoneypotProbe(ListHoneypotProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHoneypotProbeUuid  ListHoneypotProbeUuidRequest
     * @return ListHoneypotProbeUuidResponse
     */
    @Override
    public CompletableFuture<ListHoneypotProbeUuidResponse> listHoneypotProbeUuid(ListHoneypotProbeUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHoneypotProbeUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHoneypotProbeUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHoneypotProbeUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageBuildRiskItem  ListImageBuildRiskItemRequest
     * @return ListImageBuildRiskItemResponse
     */
    @Override
    public CompletableFuture<ListImageBuildRiskItemResponse> listImageBuildRiskItem(ListImageBuildRiskItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageBuildRiskItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageBuildRiskItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageBuildRiskItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageRegistryRegion  ListImageRegistryRegionRequest
     * @return ListImageRegistryRegionResponse
     */
    @Override
    public CompletableFuture<ListImageRegistryRegionResponse> listImageRegistryRegion(ListImageRegistryRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageRegistryRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageRegistryRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageRegistryRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImageRisk  ListImageRiskRequest
     * @return ListImageRiskResponse
     */
    @Override
    public CompletableFuture<ListImageRiskResponse> listImageRisk(ListImageRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceCatalog  ListInstanceCatalogRequest
     * @return ListInstanceCatalogResponse
     */
    @Override
    public CompletableFuture<ListInstanceCatalogResponse> listInstanceCatalog(ListInstanceCatalogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceCatalog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceCatalogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceCatalogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceRiskLevels  ListInstanceRiskLevelsRequest
     * @return ListInstanceRiskLevelsResponse
     */
    @Override
    public CompletableFuture<ListInstanceRiskLevelsResponse> listInstanceRiskLevels(ListInstanceRiskLevelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceRiskLevels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceRiskLevelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceRiskLevelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceRiskNum  ListInstanceRiskNumRequest
     * @return ListInstanceRiskNumResponse
     */
    @Override
    public CompletableFuture<ListInstanceRiskNumResponse> listInstanceRiskNum(ListInstanceRiskNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceRiskNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceRiskNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceRiskNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInterceptionHistory  ListInterceptionHistoryRequest
     * @return ListInterceptionHistoryResponse
     */
    @Override
    public CompletableFuture<ListInterceptionHistoryResponse> listInterceptionHistory(ListInterceptionHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInterceptionHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInterceptionHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInterceptionHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInterceptionRulePage  ListInterceptionRulePageRequest
     * @return ListInterceptionRulePageResponse
     */
    @Override
    public CompletableFuture<ListInterceptionRulePageResponse> listInterceptionRulePage(ListInterceptionRulePageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInterceptionRulePage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInterceptionRulePageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInterceptionRulePageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInterceptionTargetPage  ListInterceptionTargetPageRequest
     * @return ListInterceptionTargetPageResponse
     */
    @Override
    public CompletableFuture<ListInterceptionTargetPageResponse> listInterceptionTargetPage(ListInterceptionTargetPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInterceptionTargetPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInterceptionTargetPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInterceptionTargetPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the access information about Kubernetes clusters.</p>
     * 
     * @param request the request parameters of ListK8sAccessInfo  ListK8sAccessInfoRequest
     * @return ListK8sAccessInfoResponse
     */
    @Override
    public CompletableFuture<ListK8sAccessInfoResponse> listK8sAccessInfo(ListK8sAccessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListK8sAccessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListK8sAccessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListK8sAccessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogShipperRegions  ListLogShipperRegionsRequest
     * @return ListLogShipperRegionsResponse
     */
    @Override
    public CompletableFuture<ListLogShipperRegionsResponse> listLogShipperRegions(ListLogShipperRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLogShipperRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogShipperRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogShipperRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMaliciousFileWhitelistConfigs  ListMaliciousFileWhitelistConfigsRequest
     * @return ListMaliciousFileWhitelistConfigsResponse
     */
    @Override
    public CompletableFuture<ListMaliciousFileWhitelistConfigsResponse> listMaliciousFileWhitelistConfigs(ListMaliciousFileWhitelistConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMaliciousFileWhitelistConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMaliciousFileWhitelistConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMaliciousFileWhitelistConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListObjectScanEvent  ListObjectScanEventRequest
     * @return ListObjectScanEventResponse
     */
    @Override
    public CompletableFuture<ListObjectScanEventResponse> listObjectScanEvent(ListObjectScanEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListObjectScanEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListObjectScanEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListObjectScanEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOpaClusterStrategyNew  ListOpaClusterStrategyNewRequest
     * @return ListOpaClusterStrategyNewResponse
     */
    @Override
    public CompletableFuture<ListOpaClusterStrategyNewResponse> listOpaClusterStrategyNew(ListOpaClusterStrategyNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOpaClusterStrategyNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOpaClusterStrategyNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOpaClusterStrategyNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOperationProcess  ListOperationProcessRequest
     * @return ListOperationProcessResponse
     */
    @Override
    public CompletableFuture<ListOperationProcessResponse> listOperationProcess(ListOperationProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOperationProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOperationProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOperationProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOperationProcessDetail  ListOperationProcessDetailRequest
     * @return ListOperationProcessDetailResponse
     */
    @Override
    public CompletableFuture<ListOperationProcessDetailResponse> listOperationProcessDetail(ListOperationProcessDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOperationProcessDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOperationProcessDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOperationProcessDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOssBucket  ListOssBucketRequest
     * @return ListOssBucketResponse
     */
    @Override
    public CompletableFuture<ListOssBucketResponse> listOssBucket(ListOssBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOssBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOssBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOssBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOssBucketScanInfo  ListOssBucketScanInfoRequest
     * @return ListOssBucketScanInfoResponse
     */
    @Override
    public CompletableFuture<ListOssBucketScanInfoResponse> listOssBucketScanInfo(ListOssBucketScanInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOssBucketScanInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOssBucketScanInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOssBucketScanInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOssScanConfig  ListOssScanConfigRequest
     * @return ListOssScanConfigResponse
     */
    @Override
    public CompletableFuture<ListOssScanConfigResponse> listOssScanConfig(ListOssScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOssScanConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOssScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOssScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPluginForUuid  ListPluginForUuidRequest
     * @return ListPluginForUuidResponse
     */
    @Override
    public CompletableFuture<ListPluginForUuidResponse> listPluginForUuid(ListPluginForUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPluginForUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginForUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginForUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPodRisk  ListPodRiskRequest
     * @return ListPodRiskResponse
     */
    @Override
    public CompletableFuture<ListPodRiskResponse> listPodRisk(ListPodRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPodRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPodRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPodRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateK8s  ListPrivateK8sRequest
     * @return ListPrivateK8sResponse
     */
    @Override
    public CompletableFuture<ListPrivateK8sResponse> listPrivateK8s(ListPrivateK8sRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateK8s").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateK8sResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateK8sResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateRegistryList  ListPrivateRegistryListRequest
     * @return ListPrivateRegistryListResponse
     */
    @Override
    public CompletableFuture<ListPrivateRegistryListResponse> listPrivateRegistryList(ListPrivateRegistryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateRegistryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateRegistryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateRegistryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateRegistryType  ListPrivateRegistryTypeRequest
     * @return ListPrivateRegistryTypeResponse
     */
    @Override
    public CompletableFuture<ListPrivateRegistryTypeResponse> listPrivateRegistryType(ListPrivateRegistryTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateRegistryType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateRegistryTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateRegistryTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishBatch  ListPublishBatchRequest
     * @return ListPublishBatchResponse
     */
    @Override
    public CompletableFuture<ListPublishBatchResponse> listPublishBatch(ListPublishBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublishBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListQueryRaspAppInfo  ListQueryRaspAppInfoRequest
     * @return ListQueryRaspAppInfoResponse
     */
    @Override
    public CompletableFuture<ListQueryRaspAppInfoResponse> listQueryRaspAppInfo(ListQueryRaspAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQueryRaspAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQueryRaspAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQueryRaspAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must use the management account of your resource directory or a delegated administrator account of Security Center to call this operation.</p>
     * 
     * @param request the request parameters of ListRdDefaultSyncList  ListRdDefaultSyncListRequest
     * @return ListRdDefaultSyncListResponse
     */
    @Override
    public CompletableFuture<ListRdDefaultSyncListResponse> listRdDefaultSyncList(ListRdDefaultSyncListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRdDefaultSyncList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRdDefaultSyncListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRdDefaultSyncListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuleTargetAll  ListRuleTargetAllRequest
     * @return ListRuleTargetAllResponse
     */
    @Override
    public CompletableFuture<ListRuleTargetAllResponse> listRuleTargetAll(ListRuleTargetAllRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRuleTargetAll").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuleTargetAllResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuleTargetAllResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSasContainerWebDefenseRule  ListSasContainerWebDefenseRuleRequest
     * @return ListSasContainerWebDefenseRuleResponse
     */
    @Override
    public CompletableFuture<ListSasContainerWebDefenseRuleResponse> listSasContainerWebDefenseRule(ListSasContainerWebDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSasContainerWebDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSasContainerWebDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSasContainerWebDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSupportObjectSuffix  ListSupportObjectSuffixRequest
     * @return ListSupportObjectSuffixResponse
     */
    @Override
    public CompletableFuture<ListSupportObjectSuffixResponse> listSupportObjectSuffix(ListSupportObjectSuffixRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSupportObjectSuffix").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupportObjectSuffixResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupportObjectSuffixResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemAggregationRules  ListSystemAggregationRulesRequest
     * @return ListSystemAggregationRulesResponse
     */
    @Override
    public CompletableFuture<ListSystemAggregationRulesResponse> listSystemAggregationRules(ListSystemAggregationRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemAggregationRules").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemAggregationRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemAggregationRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemClientRuleTypes  ListSystemClientRuleTypesRequest
     * @return ListSystemClientRuleTypesResponse
     */
    @Override
    public CompletableFuture<ListSystemClientRuleTypesResponse> listSystemClientRuleTypes(ListSystemClientRuleTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemClientRuleTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemClientRuleTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemClientRuleTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemClientRules  ListSystemClientRulesRequest
     * @return ListSystemClientRulesResponse
     */
    @Override
    public CompletableFuture<ListSystemClientRulesResponse> listSystemClientRules(ListSystemClientRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemClientRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemClientRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemClientRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemRuleAggregationTypes  ListSystemRuleAggregationTypesRequest
     * @return ListSystemRuleAggregationTypesResponse
     */
    @Override
    public CompletableFuture<ListSystemRuleAggregationTypesResponse> listSystemRuleAggregationTypes(ListSystemRuleAggregationTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemRuleAggregationTypes").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemRuleAggregationTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemRuleAggregationTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUnfinishedOnceTask  ListUnfinishedOnceTaskRequest
     * @return ListUnfinishedOnceTaskResponse
     */
    @Override
    public CompletableFuture<ListUnfinishedOnceTaskResponse> listUnfinishedOnceTask(ListUnfinishedOnceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUnfinishedOnceTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUnfinishedOnceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUnfinishedOnceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUninstallAegisMachines  ListUninstallAegisMachinesRequest
     * @return ListUninstallAegisMachinesResponse
     */
    @Override
    public CompletableFuture<ListUninstallAegisMachinesResponse> listUninstallAegisMachines(ListUninstallAegisMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUninstallAegisMachines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUninstallAegisMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUninstallAegisMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUuidsByWebPath  ListUuidsByWebPathRequest
     * @return ListUuidsByWebPathResponse
     */
    @Override
    public CompletableFuture<ListUuidsByWebPathResponse> listUuidsByWebPath(ListUuidsByWebPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUuidsByWebPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUuidsByWebPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUuidsByWebPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVirusScanMachine  ListVirusScanMachineRequest
     * @return ListVirusScanMachineResponse
     */
    @Override
    public CompletableFuture<ListVirusScanMachineResponse> listVirusScanMachine(ListVirusScanMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVirusScanMachine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirusScanMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirusScanMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVirusScanMachineEvent  ListVirusScanMachineEventRequest
     * @return ListVirusScanMachineEventResponse
     */
    @Override
    public CompletableFuture<ListVirusScanMachineEventResponse> listVirusScanMachineEvent(ListVirusScanMachineEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVirusScanMachineEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirusScanMachineEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirusScanMachineEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVirusScanTask  ListVirusScanTaskRequest
     * @return ListVirusScanTaskResponse
     */
    @Override
    public CompletableFuture<ListVirusScanTaskResponse> listVirusScanTask(ListVirusScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVirusScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirusScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirusScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVulAutoRepairConfig  ListVulAutoRepairConfigRequest
     * @return ListVulAutoRepairConfigResponse
     */
    @Override
    public CompletableFuture<ListVulAutoRepairConfigResponse> listVulAutoRepairConfig(ListVulAutoRepairConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVulAutoRepairConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVulAutoRepairConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVulAutoRepairConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVulGlobalConfig  ListVulGlobalConfigRequest
     * @return ListVulGlobalConfigResponse
     */
    @Override
    public CompletableFuture<ListVulGlobalConfigResponse> listVulGlobalConfig(ListVulGlobalConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVulGlobalConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVulGlobalConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVulGlobalConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MarkMonitorAccounts  MarkMonitorAccountsRequest
     * @return MarkMonitorAccountsResponse
     */
    @Override
    public CompletableFuture<MarkMonitorAccountsResponse> markMonitorAccounts(MarkMonitorAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MarkMonitorAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MarkMonitorAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MarkMonitorAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAccessKeyLeakDeal  ModifyAccessKeyLeakDealRequest
     * @return ModifyAccessKeyLeakDealResponse
     */
    @Override
    public CompletableFuture<ModifyAccessKeyLeakDealResponse> modifyAccessKeyLeakDeal(ModifyAccessKeyLeakDealRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccessKeyLeakDeal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccessKeyLeakDealResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccessKeyLeakDealResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAntiBruteForceRule  ModifyAntiBruteForceRuleRequest
     * @return ModifyAntiBruteForceRuleResponse
     */
    @Override
    public CompletableFuture<ModifyAntiBruteForceRuleResponse> modifyAntiBruteForceRule(ModifyAntiBruteForceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAntiBruteForceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAntiBruteForceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAntiBruteForceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAppVulScanCycle  ModifyAppVulScanCycleRequest
     * @return ModifyAppVulScanCycleResponse
     */
    @Override
    public CompletableFuture<ModifyAppVulScanCycleResponse> modifyAppVulScanCycle(ModifyAppVulScanCycleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAppVulScanCycle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAppVulScanCycleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAppVulScanCycleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAssetCleanConfig  ModifyAssetCleanConfigRequest
     * @return ModifyAssetCleanConfigResponse
     */
    @Override
    public CompletableFuture<ModifyAssetCleanConfigResponse> modifyAssetCleanConfig(ModifyAssetCleanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAssetCleanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAssetCleanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAssetCleanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyAssetGroup operation to change the server group to which one or more servers belong. After you create a server group by calling the <a href="~~CreateOrUpdateAssetGroup~~">CreateOrUpdateAssetGroup</a> operation, you can call the ModifyAssetGroup operation to change the server group to which your servers belong.</p>
     * <h3>Limits</h3>
     * <p>You can call this API operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyAssetGroup  ModifyAssetGroupRequest
     * @return ModifyAssetGroupResponse
     */
    @Override
    public CompletableFuture<ModifyAssetGroupResponse> modifyAssetGroup(ModifyAssetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAssetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAssetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAssetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAssetImportant  ModifyAssetImportantRequest
     * @return ModifyAssetImportantResponse
     */
    @Override
    public CompletableFuture<ModifyAssetImportantResponse> modifyAssetImportant(ModifyAssetImportantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAssetImportant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAssetImportantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAssetImportantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAttestor  ModifyAttestorRequest
     * @return ModifyAttestorResponse
     */
    @Override
    public CompletableFuture<ModifyAttestorResponse> modifyAttestor(ModifyAttestorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAttestor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAttestorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAttestorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAutoDelConfig  ModifyAutoDelConfigRequest
     * @return ModifyAutoDelConfigResponse
     */
    @Override
    public CompletableFuture<ModifyAutoDelConfigResponse> modifyAutoDelConfig(ModifyAutoDelConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoDelConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoDelConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoDelConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackupPolicyStatus  ModifyBackupPolicyStatusRequest
     * @return ModifyBackupPolicyStatusResponse
     */
    @Override
    public CompletableFuture<ModifyBackupPolicyStatusResponse> modifyBackupPolicyStatus(ModifyBackupPolicyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupPolicyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupPolicyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupPolicyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deleted logs cannot be restored. Before you call this operation to delete all logs and free up log storage, we recommend that you export and save your logs to your computer.</p>
     * 
     * @param request the request parameters of ModifyClearLogstoreStorage  ModifyClearLogstoreStorageRequest
     * @return ModifyClearLogstoreStorageResponse
     */
    @Override
    public CompletableFuture<ModifyClearLogstoreStorageResponse> modifyClearLogstoreStorage(ModifyClearLogstoreStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClearLogstoreStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClearLogstoreStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClearLogstoreStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClientConfSetup  ModifyClientConfSetupRequest
     * @return ModifyClientConfSetupResponse
     */
    @Override
    public CompletableFuture<ModifyClientConfSetupResponse> modifyClientConfSetup(ModifyClientConfSetupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClientConfSetup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClientConfSetupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClientConfSetupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClientConfStrategy  ModifyClientConfStrategyRequest
     * @return ModifyClientConfStrategyResponse
     */
    @Override
    public CompletableFuture<ModifyClientConfStrategyResponse> modifyClientConfStrategy(ModifyClientConfStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClientConfStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClientConfStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClientConfStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClientUserDefineRule  ModifyClientUserDefineRuleRequest
     * @return ModifyClientUserDefineRuleResponse
     */
    @Override
    public CompletableFuture<ModifyClientUserDefineRuleResponse> modifyClientUserDefineRule(ModifyClientUserDefineRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClientUserDefineRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClientUserDefineRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClientUserDefineRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCloudVendorAccountAK  ModifyCloudVendorAccountAKRequest
     * @return ModifyCloudVendorAccountAKResponse
     */
    @Override
    public CompletableFuture<ModifyCloudVendorAccountAKResponse> modifyCloudVendorAccountAK(ModifyCloudVendorAccountAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCloudVendorAccountAK").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCloudVendorAccountAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCloudVendorAccountAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClusterCnnfStatusUserConfirm  ModifyClusterCnnfStatusUserConfirmRequest
     * @return ModifyClusterCnnfStatusUserConfirmResponse
     */
    @Override
    public CompletableFuture<ModifyClusterCnnfStatusUserConfirmResponse> modifyClusterCnnfStatusUserConfirm(ModifyClusterCnnfStatusUserConfirmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClusterCnnfStatusUserConfirm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterCnnfStatusUserConfirmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterCnnfStatusUserConfirmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyConcernNecessity  ModifyConcernNecessityRequest
     * @return ModifyConcernNecessityResponse
     */
    @Override
    public CompletableFuture<ModifyConcernNecessityResponse> modifyConcernNecessity(ModifyConcernNecessityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyConcernNecessity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyConcernNecessityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyConcernNecessityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyContainerDefenseRule  ModifyContainerDefenseRuleRequest
     * @return ModifyContainerDefenseRuleResponse
     */
    @Override
    public CompletableFuture<ModifyContainerDefenseRuleResponse> modifyContainerDefenseRule(ModifyContainerDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyContainerDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyContainerDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyContainerDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyContainerDefenseRuleSwitch  ModifyContainerDefenseRuleSwitchRequest
     * @return ModifyContainerDefenseRuleSwitchResponse
     */
    @Override
    public CompletableFuture<ModifyContainerDefenseRuleSwitchResponse> modifyContainerDefenseRuleSwitch(ModifyContainerDefenseRuleSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyContainerDefenseRuleSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyContainerDefenseRuleSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyContainerDefenseRuleSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyContainerPluginRule  ModifyContainerPluginRuleRequest
     * @return ModifyContainerPluginRuleResponse
     */
    @Override
    public CompletableFuture<ModifyContainerPluginRuleResponse> modifyContainerPluginRule(ModifyContainerPluginRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyContainerPluginRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyContainerPluginRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyContainerPluginRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyContainerScanConfig  ModifyContainerScanConfigRequest
     * @return ModifyContainerScanConfigResponse
     */
    @Override
    public CompletableFuture<ModifyContainerScanConfigResponse> modifyContainerScanConfig(ModifyContainerScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyContainerScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyContainerScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyContainerScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCreateVulWhitelist  ModifyCreateVulWhitelistRequest
     * @return ModifyCreateVulWhitelistResponse
     */
    @Override
    public CompletableFuture<ModifyCreateVulWhitelistResponse> modifyCreateVulWhitelist(ModifyCreateVulWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCreateVulWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCreateVulWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCreateVulWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCustomBlockRecord  ModifyCustomBlockRecordRequest
     * @return ModifyCustomBlockRecordResponse
     */
    @Override
    public CompletableFuture<ModifyCustomBlockRecordResponse> modifyCustomBlockRecord(ModifyCustomBlockRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustomBlockRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustomBlockRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustomBlockRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCycleTask  ModifyCycleTaskRequest
     * @return ModifyCycleTaskResponse
     */
    @Override
    public CompletableFuture<ModifyCycleTaskResponse> modifyCycleTask(ModifyCycleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCycleTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCycleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCycleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you use Security Center Enterprise.</p>
     * 
     * @param request the request parameters of ModifyDingTalkStatus  ModifyDingTalkStatusRequest
     * @return ModifyDingTalkStatusResponse
     */
    @Override
    public CompletableFuture<ModifyDingTalkStatusResponse> modifyDingTalkStatus(ModifyDingTalkStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDingTalkStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDingTalkStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDingTalkStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyEmgVulSubmit  ModifyEmgVulSubmitRequest
     * @return ModifyEmgVulSubmitResponse
     */
    @Override
    public CompletableFuture<ModifyEmgVulSubmitResponse> modifyEmgVulSubmit(ModifyEmgVulSubmitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEmgVulSubmit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEmgVulSubmitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEmgVulSubmitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyGroupProperty  ModifyGroupPropertyRequest
     * @return ModifyGroupPropertyResponse
     */
    @Override
    public CompletableFuture<ModifyGroupPropertyResponse> modifyGroupProperty(ModifyGroupPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGroupProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGroupPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGroupPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyIdcProbe  ModifyIdcProbeRequest
     * @return ModifyIdcProbeResponse
     */
    @Override
    public CompletableFuture<ModifyIdcProbeResponse> modifyIdcProbe(ModifyIdcProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIdcProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIdcProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIdcProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyImageFixCycleConfig  ModifyImageFixCycleConfigRequest
     * @return ModifyImageFixCycleConfigResponse
     */
    @Override
    public CompletableFuture<ModifyImageFixCycleConfigResponse> modifyImageFixCycleConfig(ModifyImageFixCycleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageFixCycleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageFixCycleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageFixCycleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyImageRegistry  ModifyImageRegistryRequest
     * @return ModifyImageRegistryResponse
     */
    @Override
    public CompletableFuture<ModifyImageRegistryResponse> modifyImageRegistry(ModifyImageRegistryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageRegistry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageRegistryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageRegistryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceAntiBruteForceRule  ModifyInstanceAntiBruteForceRuleRequest
     * @return ModifyInstanceAntiBruteForceRuleResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceAntiBruteForceRuleResponse> modifyInstanceAntiBruteForceRule(ModifyInstanceAntiBruteForceRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAntiBruteForceRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAntiBruteForceRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAntiBruteForceRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInterceptionRule  ModifyInterceptionRuleRequest
     * @return ModifyInterceptionRuleResponse
     */
    @Override
    public CompletableFuture<ModifyInterceptionRuleResponse> modifyInterceptionRule(ModifyInterceptionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInterceptionRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInterceptionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInterceptionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInterceptionRuleSwitch  ModifyInterceptionRuleSwitchRequest
     * @return ModifyInterceptionRuleSwitchResponse
     */
    @Override
    public CompletableFuture<ModifyInterceptionRuleSwitchResponse> modifyInterceptionRuleSwitch(ModifyInterceptionRuleSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInterceptionRuleSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInterceptionRuleSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInterceptionRuleSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInterceptionTarget  ModifyInterceptionTargetRequest
     * @return ModifyInterceptionTargetResponse
     */
    @Override
    public CompletableFuture<ModifyInterceptionTargetResponse> modifyInterceptionTarget(ModifyInterceptionTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInterceptionTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInterceptionTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInterceptionTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLogMetaStatus  ModifyLogMetaStatusRequest
     * @return ModifyLogMetaStatusResponse
     */
    @Override
    public CompletableFuture<ModifyLogMetaStatusResponse> modifyLogMetaStatus(ModifyLogMetaStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLogMetaStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLogMetaStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLogMetaStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLoginBaseConfig  ModifyLoginBaseConfigRequest
     * @return ModifyLoginBaseConfigResponse
     */
    @Override
    public CompletableFuture<ModifyLoginBaseConfigResponse> modifyLoginBaseConfig(ModifyLoginBaseConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoginBaseConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoginBaseConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoginBaseConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLoginSwitchConfig  ModifyLoginSwitchConfigRequest
     * @return ModifyLoginSwitchConfigResponse
     */
    @Override
    public CompletableFuture<ModifyLoginSwitchConfigResponse> modifyLoginSwitchConfig(ModifyLoginSwitchConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoginSwitchConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoginSwitchConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoginSwitchConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyNoticeConfig  ModifyNoticeConfigRequest
     * @return ModifyNoticeConfigResponse
     */
    @Override
    public CompletableFuture<ModifyNoticeConfigResponse> modifyNoticeConfig(ModifyNoticeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNoticeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNoticeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNoticeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>* <a href="https://www.alibabacloud.com/help/en/log-service/latest/billable-items">Simple Log Service</a> is activated. A service-linked role for Security Center is created, and Security Center is authorized to access cloud resources. You can call the <a href="~~CreateServiceLinkedRole~~">CreateServiceLinkedRole</a> operation to create a service-linked role for Security Center and authorize Security Center to access cloud resources. <strong>Scenarios</strong> Before you use the log analysis feature of Security Center, you must call the <a href="~~ModifyOpenLogShipper~~">ModifyOpenLogShipper</a> operation to activate Simple Log Service.</p>
     * 
     * @param request the request parameters of ModifyOpenLogShipper  ModifyOpenLogShipperRequest
     * @return ModifyOpenLogShipperResponse
     */
    @Override
    public CompletableFuture<ModifyOpenLogShipperResponse> modifyOpenLogShipper(ModifyOpenLogShipperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyOpenLogShipper").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyOpenLogShipperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyOpenLogShipperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyOperateVul  ModifyOperateVulRequest
     * @return ModifyOperateVulResponse
     */
    @Override
    public CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyOperateVul").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyOperateVulResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyOperateVulResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPostPayModuleSwitch  ModifyPostPayModuleSwitchRequest
     * @return ModifyPostPayModuleSwitchResponse
     */
    @Override
    public CompletableFuture<ModifyPostPayModuleSwitchResponse> modifyPostPayModuleSwitch(ModifyPostPayModuleSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPostPayModuleSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPostPayModuleSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPostPayModuleSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of ModifyProcessWhiteList  ModifyProcessWhiteListRequest
     * @return ModifyProcessWhiteListResponse
     */
    @Override
    public CompletableFuture<ModifyProcessWhiteListResponse> modifyProcessWhiteList(ModifyProcessWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyProcessWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyProcessWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyProcessWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPropertyScheduleConfig  ModifyPropertyScheduleConfigRequest
     * @return ModifyPropertyScheduleConfigResponse
     */
    @Override
    public CompletableFuture<ModifyPropertyScheduleConfigResponse> modifyPropertyScheduleConfig(ModifyPropertyScheduleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPropertyScheduleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPropertyScheduleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPropertyScheduleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPushAllTask  ModifyPushAllTaskRequest
     * @return ModifyPushAllTaskResponse
     */
    @Override
    public CompletableFuture<ModifyPushAllTaskResponse> modifyPushAllTask(ModifyPushAllTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPushAllTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPushAllTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPushAllTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRefreshProcessInfo  ModifyRefreshProcessInfoRequest
     * @return ModifyRefreshProcessInfoResponse
     */
    @Override
    public CompletableFuture<ModifyRefreshProcessInfoResponse> modifyRefreshProcessInfo(ModifyRefreshProcessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRefreshProcessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRefreshProcessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRefreshProcessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySasContainerWebDefenseRule  ModifySasContainerWebDefenseRuleRequest
     * @return ModifySasContainerWebDefenseRuleResponse
     */
    @Override
    public CompletableFuture<ModifySasContainerWebDefenseRuleResponse> modifySasContainerWebDefenseRule(ModifySasContainerWebDefenseRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySasContainerWebDefenseRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySasContainerWebDefenseRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySasContainerWebDefenseRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySearchCondition  ModifySearchConditionRequest
     * @return ModifySearchConditionResponse
     */
    @Override
    public CompletableFuture<ModifySearchConditionResponse> modifySearchCondition(ModifySearchConditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySearchCondition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySearchConditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySearchConditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifySecurityCheckScheduleConfig is deprecated, please use Sas::2018-12-03::ChangeCheckConfig instead.  * @description This operation is phased out. You can use the ChangeCheckConfig operation.
     * 
     * @param request the request parameters of ModifySecurityCheckScheduleConfig  ModifySecurityCheckScheduleConfigRequest
     * @return ModifySecurityCheckScheduleConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ModifySecurityCheckScheduleConfigResponse> modifySecurityCheckScheduleConfig(ModifySecurityCheckScheduleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityCheckScheduleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityCheckScheduleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityCheckScheduleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySecurityEventMarkMissIndividually  ModifySecurityEventMarkMissIndividuallyRequest
     * @return ModifySecurityEventMarkMissIndividuallyResponse
     */
    @Override
    public CompletableFuture<ModifySecurityEventMarkMissIndividuallyResponse> modifySecurityEventMarkMissIndividually(ModifySecurityEventMarkMissIndividuallyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityEventMarkMissIndividually").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityEventMarkMissIndividuallyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityEventMarkMissIndividuallyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only the Enterprise and Ultimate editions of Security Center support this API operation.</p>
     * 
     * @param request the request parameters of ModifySoarStrategySubscribe  ModifySoarStrategySubscribeRequest
     * @return ModifySoarStrategySubscribeResponse
     */
    @Override
    public CompletableFuture<ModifySoarStrategySubscribeResponse> modifySoarStrategySubscribe(ModifySoarStrategySubscribeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySoarStrategySubscribe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySoarStrategySubscribeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySoarStrategySubscribeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyStartVulScan  ModifyStartVulScanRequest
     * @return ModifyStartVulScanResponse
     */
    @Override
    public CompletableFuture<ModifyStartVulScanResponse> modifyStartVulScan(ModifyStartVulScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStartVulScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStartVulScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStartVulScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyStrategy  ModifyStrategyRequest
     * @return ModifyStrategyResponse
     */
    @Override
    public CompletableFuture<ModifyStrategyResponse> modifyStrategy(ModifyStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyStrategyTarget  ModifyStrategyTargetRequest
     * @return ModifyStrategyTargetResponse
     */
    @Override
    public CompletableFuture<ModifyStrategyTargetResponse> modifyStrategyTarget(ModifyStrategyTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStrategyTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStrategyTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStrategyTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTagWithUuid  ModifyTagWithUuidRequest
     * @return ModifyTagWithUuidResponse
     */
    @Override
    public CompletableFuture<ModifyTagWithUuidResponse> modifyTagWithUuid(ModifyTagWithUuidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTagWithUuid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTagWithUuidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTagWithUuidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyUniBackupPolicy  ModifyUniBackupPolicyRequest
     * @return ModifyUniBackupPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyUniBackupPolicyResponse> modifyUniBackupPolicy(ModifyUniBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUniBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUniBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUniBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyVpcHoneyPot is deprecated  * @param request  the request parameters of ModifyVpcHoneyPot  ModifyVpcHoneyPotRequest
     * @return ModifyVpcHoneyPotResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ModifyVpcHoneyPotResponse> modifyVpcHoneyPot(ModifyVpcHoneyPotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcHoneyPot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcHoneyPotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcHoneyPotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVulConfig  ModifyVulConfigRequest
     * @return ModifyVulConfigResponse
     */
    @Override
    public CompletableFuture<ModifyVulConfigResponse> modifyVulConfig(ModifyVulConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVulConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVulConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVulConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVulTarget  ModifyVulTargetRequest
     * @return ModifyVulTargetResponse
     */
    @Override
    public CompletableFuture<ModifyVulTargetResponse> modifyVulTarget(ModifyVulTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVulTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVulTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVulTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVulTargetConfig  ModifyVulTargetConfigRequest
     * @return ModifyVulTargetConfigResponse
     */
    @Override
    public CompletableFuture<ModifyVulTargetConfigResponse> modifyVulTargetConfig(ModifyVulTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVulTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVulTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVulTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVulWhitelistTarget  ModifyVulWhitelistTargetRequest
     * @return ModifyVulWhitelistTargetResponse
     */
    @Override
    public CompletableFuture<ModifyVulWhitelistTargetResponse> modifyVulWhitelistTarget(ModifyVulWhitelistTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVulWhitelistTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVulWhitelistTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVulWhitelistTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockCreateConfig  ModifyWebLockCreateConfigRequest
     * @return ModifyWebLockCreateConfigResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockCreateConfigResponse> modifyWebLockCreateConfig(ModifyWebLockCreateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockCreateConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockCreateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockCreateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you delete a directory that has web tamper proofing enabled on a server, files in the directory are no longer protected by web tamper proofing. The information about the websites that are hosted on the server may be maliciously modified by attackers. Proceed with caution.</p>
     * 
     * @param request the request parameters of ModifyWebLockDeleteConfig  ModifyWebLockDeleteConfigRequest
     * @return ModifyWebLockDeleteConfigResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockDeleteConfigResponse> modifyWebLockDeleteConfig(ModifyWebLockDeleteConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockDeleteConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockDeleteConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockDeleteConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockProcessStatus  ModifyWebLockProcessStatusRequest
     * @return ModifyWebLockProcessStatusResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockProcessStatusResponse> modifyWebLockProcessStatus(ModifyWebLockProcessStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockProcessStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockProcessStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockProcessStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If an exception occurs when you enable or disable the web tamper proofing feature for a server, you can call this operation to refresh the status of the web tamper proofing feature.</p>
     * 
     * @param request the request parameters of ModifyWebLockRefresh  ModifyWebLockRefreshRequest
     * @return ModifyWebLockRefreshResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockRefreshResponse> modifyWebLockRefresh(ModifyWebLockRefreshRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockRefresh").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockRefreshResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockRefreshResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockStart  ModifyWebLockStartRequest
     * @return ModifyWebLockStartResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockStartResponse> modifyWebLockStart(ModifyWebLockStartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockStart").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockStartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockStartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockStatus  ModifyWebLockStatusRequest
     * @return ModifyWebLockStatusResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockStatusResponse> modifyWebLockStatus(ModifyWebLockStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockUnbind  ModifyWebLockUnbindRequest
     * @return ModifyWebLockUnbindResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockUnbindResponse> modifyWebLockUnbind(ModifyWebLockUnbindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockUnbind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockUnbindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockUnbindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebLockUpdateConfig  ModifyWebLockUpdateConfigRequest
     * @return ModifyWebLockUpdateConfigResponse
     */
    @Override
    public CompletableFuture<ModifyWebLockUpdateConfigResponse> modifyWebLockUpdateConfig(ModifyWebLockUpdateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebLockUpdateConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebLockUpdateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebLockUpdateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWebPath  ModifyWebPathRequest
     * @return ModifyWebPathResponse
     */
    @Override
    public CompletableFuture<ModifyWebPathResponse> modifyWebPath(ModifyWebPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWebPath").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWebPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWebPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenBackupAutoConfig  OpenBackupAutoConfigRequest
     * @return OpenBackupAutoConfigResponse
     */
    @Override
    public CompletableFuture<OpenBackupAutoConfigResponse> openBackupAutoConfig(OpenBackupAutoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenBackupAutoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenBackupAutoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenBackupAutoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenPartialBuy  OpenPartialBuyRequest
     * @return OpenPartialBuyResponse
     */
    @Override
    public CompletableFuture<OpenPartialBuyResponse> openPartialBuy(OpenPartialBuyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenPartialBuy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenPartialBuyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenPartialBuyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenSensitiveFileScan  OpenSensitiveFileScanRequest
     * @return OpenSensitiveFileScanResponse
     */
    @Override
    public CompletableFuture<OpenSensitiveFileScanResponse> openSensitiveFileScan(OpenSensitiveFileScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenSensitiveFileScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenSensitiveFileScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenSensitiveFileScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateAgentClientInstall  OperateAgentClientInstallRequest
     * @return OperateAgentClientInstallResponse
     */
    @Override
    public CompletableFuture<OperateAgentClientInstallResponse> operateAgentClientInstall(OperateAgentClientInstallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateAgentClientInstall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateAgentClientInstallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateAgentClientInstallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateApplication  OperateApplicationRequest
     * @return OperateApplicationResponse
     */
    @Override
    public CompletableFuture<OperateApplicationResponse> operateApplication(OperateApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateBucketScanTask  OperateBucketScanTaskRequest
     * @return OperateBucketScanTaskResponse
     */
    @Override
    public CompletableFuture<OperateBucketScanTaskResponse> operateBucketScanTask(OperateBucketScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateBucketScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateBucketScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateBucketScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateCommonOverallConfig  OperateCommonOverallConfigRequest
     * @return OperateCommonOverallConfigResponse
     */
    @Override
    public CompletableFuture<OperateCommonOverallConfigResponse> operateCommonOverallConfig(OperateCommonOverallConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateCommonOverallConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateCommonOverallConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateCommonOverallConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateCommonTargetConfig  OperateCommonTargetConfigRequest
     * @return OperateCommonTargetConfigResponse
     */
    @Override
    public CompletableFuture<OperateCommonTargetConfigResponse> operateCommonTargetConfig(OperateCommonTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateCommonTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateCommonTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateCommonTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateImageBaselineWhitelist  OperateImageBaselineWhitelistRequest
     * @return OperateImageBaselineWhitelistResponse
     */
    @Override
    public CompletableFuture<OperateImageBaselineWhitelistResponse> operateImageBaselineWhitelist(OperateImageBaselineWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateImageBaselineWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateImageBaselineWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateImageBaselineWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateImageVul  OperateImageVulRequest
     * @return OperateImageVulResponse
     */
    @Override
    public CompletableFuture<OperateImageVulResponse> operateImageVul(OperateImageVulRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateImageVul").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateImageVulResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateImageVulResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateSuspiciousOverallConfig  OperateSuspiciousOverallConfigRequest
     * @return OperateSuspiciousOverallConfigResponse
     */
    @Override
    public CompletableFuture<OperateSuspiciousOverallConfigResponse> operateSuspiciousOverallConfig(OperateSuspiciousOverallConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateSuspiciousOverallConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateSuspiciousOverallConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateSuspiciousOverallConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateSuspiciousTargetConfig  OperateSuspiciousTargetConfigRequest
     * @return OperateSuspiciousTargetConfigResponse
     */
    @Override
    public CompletableFuture<OperateSuspiciousTargetConfigResponse> operateSuspiciousTargetConfig(OperateSuspiciousTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateSuspiciousTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateSuspiciousTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateSuspiciousTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateSwitchStatus  OperateSwitchStatusRequest
     * @return OperateSwitchStatusResponse
     */
    @Override
    public CompletableFuture<OperateSwitchStatusResponse> operateSwitchStatus(OperateSwitchStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateSwitchStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateSwitchStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateSwitchStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateVirusEvents  OperateVirusEventsRequest
     * @return OperateVirusEventsResponse
     */
    @Override
    public CompletableFuture<OperateVirusEventsResponse> operateVirusEvents(OperateVirusEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateVirusEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateVirusEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateVirusEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateVuls  OperateVulsRequest
     * @return OperateVulsResponse
     */
    @Override
    public CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateVuls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateVulsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateVulsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateWebLockFileEvents  OperateWebLockFileEventsRequest
     * @return OperateWebLockFileEventsResponse
     */
    @Override
    public CompletableFuture<OperateWebLockFileEventsResponse> operateWebLockFileEvents(OperateWebLockFileEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateWebLockFileEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateWebLockFileEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateWebLockFileEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperationCancelIgnoreSuspEvent  OperationCancelIgnoreSuspEventRequest
     * @return OperationCancelIgnoreSuspEventResponse
     */
    @Override
    public CompletableFuture<OperationCancelIgnoreSuspEventResponse> operationCancelIgnoreSuspEvent(OperationCancelIgnoreSuspEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperationCancelIgnoreSuspEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperationCancelIgnoreSuspEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperationCancelIgnoreSuspEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperationCustomizeReportChart  OperationCustomizeReportChartRequest
     * @return OperationCustomizeReportChartResponse
     */
    @Override
    public CompletableFuture<OperationCustomizeReportChartResponse> operationCustomizeReportChart(OperationCustomizeReportChartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperationCustomizeReportChart").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperationCustomizeReportChartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperationCustomizeReportChartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperationSuspEvents  OperationSuspEventsRequest
     * @return OperationSuspEventsResponse
     */
    @Override
    public CompletableFuture<OperationSuspEventsResponse> operationSuspEvents(OperationSuspEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperationSuspEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperationSuspEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperationSuspEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageImageRegistry  PageImageRegistryRequest
     * @return PageImageRegistryResponse
     */
    @Override
    public CompletableFuture<PageImageRegistryResponse> pageImageRegistry(PageImageRegistryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageImageRegistry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageImageRegistryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageImageRegistryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PauseClient  PauseClientRequest
     * @return PauseClientResponse
     */
    @Override
    public CompletableFuture<PauseClientResponse> pauseClient(PauseClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call the PublicCreateImageScanTask operation, we recommend that you call the <a href="~~PublicPreCheckImageScanTask~~">PublicPreCheckImageScanTask</a> operation to query the number of images to scan and the quota for container image scan to be consumed by the image scan task. Make sure that the remaining quota for container image scan is sufficient. This prevents the task from being stopped due to an insufficient quota.</p>
     * 
     * @param request the request parameters of PublicCreateImageScanTask  PublicCreateImageScanTaskRequest
     * @return PublicCreateImageScanTaskResponse
     */
    @Override
    public CompletableFuture<PublicCreateImageScanTaskResponse> publicCreateImageScanTask(PublicCreateImageScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublicCreateImageScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublicCreateImageScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublicCreateImageScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the PublicPreCheckImageScanTask operation to estimate the quota for container image scan to be consumed by the task. This ensures that you know the quota to be consumed before you perform the task. If the remaining quota for container image scan is less than the quota to be consumed by the task, you must purchase a sufficient quota. This prevents the task from being stopped due to an insufficient quota.
     * If you do not specify the optional parameters when you call this operation, the total number of protected images and the quota for container image scan to be consumed by scanning all the protected images are queried. If you specify the optional parameters, the number of images that meet the specified conditions and the quota for container image scan to be consumed by scanning the images are queried.</p>
     * 
     * @param request the request parameters of PublicPreCheckImageScanTask  PublicPreCheckImageScanTaskRequest
     * @return PublicPreCheckImageScanTaskResponse
     */
    @Override
    public CompletableFuture<PublicPreCheckImageScanTaskResponse> publicPreCheckImageScanTask(PublicPreCheckImageScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublicPreCheckImageScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublicPreCheckImageScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublicPreCheckImageScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublicSyncAndCreateImageScanTask  PublicSyncAndCreateImageScanTaskRequest
     * @return PublicSyncAndCreateImageScanTaskResponse
     */
    @Override
    public CompletableFuture<PublicSyncAndCreateImageScanTaskResponse> publicSyncAndCreateImageScanTask(PublicSyncAndCreateImageScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublicSyncAndCreateImageScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublicSyncAndCreateImageScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublicSyncAndCreateImageScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAssetDetailByUUID  QueryAssetDetailByUUIDRequest
     * @return QueryAssetDetailByUUIDResponse
     */
    @Override
    public CompletableFuture<QueryAssetDetailByUUIDResponse> queryAssetDetailByUUID(QueryAssetDetailByUUIDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAssetDetailByUUID").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAssetDetailByUUIDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAssetDetailByUUIDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAttackCount  QueryAttackCountRequest
     * @return QueryAttackCountResponse
     */
    @Override
    public CompletableFuture<QueryAttackCountResponse> queryAttackCount(QueryAttackCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAttackCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAttackCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAttackCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDiscoverDatabase  QueryDiscoverDatabaseRequest
     * @return QueryDiscoverDatabaseResponse
     */
    @Override
    public CompletableFuture<QueryDiscoverDatabaseResponse> queryDiscoverDatabase(QueryDiscoverDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDiscoverDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDiscoverDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDiscoverDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the QueryGroupIdByGroupName operation to query the ID of an asset group to which your assets belong by using the name of the asset group. When you call operations such as <a href="~~GetSuspiciousStatistics~~">GetSuspiciousStatistics</a> and <a href="~~DeleteGroup~~">DeleteGroup</a>, you must specify the ID of the asset group. To query the ID of an asset group, call the QueryGroupIdByGroupName operation.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryGroupIdByGroupName  QueryGroupIdByGroupNameRequest
     * @return QueryGroupIdByGroupNameResponse
     */
    @Override
    public CompletableFuture<QueryGroupIdByGroupNameResponse> queryGroupIdByGroupName(QueryGroupIdByGroupNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGroupIdByGroupName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGroupIdByGroupNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGroupIdByGroupNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryGroupedSecurityEventMarkMissList  QueryGroupedSecurityEventMarkMissListRequest
     * @return QueryGroupedSecurityEventMarkMissListResponse
     */
    @Override
    public CompletableFuture<QueryGroupedSecurityEventMarkMissListResponse> queryGroupedSecurityEventMarkMissList(QueryGroupedSecurityEventMarkMissListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGroupedSecurityEventMarkMissList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGroupedSecurityEventMarkMissListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGroupedSecurityEventMarkMissListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryGuidTaskList  QueryGuidTaskListRequest
     * @return QueryGuidTaskListResponse
     */
    @Override
    public CompletableFuture<QueryGuidTaskListResponse> queryGuidTaskList(QueryGuidTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGuidTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGuidTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGuidTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentIconList  QueryIncidentIconListRequest
     * @return QueryIncidentIconListResponse
     */
    @Override
    public CompletableFuture<QueryIncidentIconListResponse> queryIncidentIconList(QueryIncidentIconListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentIconList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentIconListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentIconListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentSubNodesCount  QueryIncidentSubNodesCountRequest
     * @return QueryIncidentSubNodesCountResponse
     */
    @Override
    public CompletableFuture<QueryIncidentSubNodesCountResponse> queryIncidentSubNodesCount(QueryIncidentSubNodesCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentSubNodesCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentSubNodesCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentSubNodesCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentTracingDetail  QueryIncidentTracingDetailRequest
     * @return QueryIncidentTracingDetailResponse
     */
    @Override
    public CompletableFuture<QueryIncidentTracingDetailResponse> queryIncidentTracingDetail(QueryIncidentTracingDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentTracingDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentTracingDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentTracingDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentTracingJudge  QueryIncidentTracingJudgeRequest
     * @return QueryIncidentTracingJudgeResponse
     */
    @Override
    public CompletableFuture<QueryIncidentTracingJudgeResponse> queryIncidentTracingJudge(QueryIncidentTracingJudgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentTracingJudge").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentTracingJudgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentTracingJudgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentVertexExtendInfo  QueryIncidentVertexExtendInfoRequest
     * @return QueryIncidentVertexExtendInfoResponse
     */
    @Override
    public CompletableFuture<QueryIncidentVertexExtendInfoResponse> queryIncidentVertexExtendInfo(QueryIncidentVertexExtendInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentVertexExtendInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentVertexExtendInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentVertexExtendInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIncidentVertexNodes  QueryIncidentVertexNodesRequest
     * @return QueryIncidentVertexNodesResponse
     */
    @Override
    public CompletableFuture<QueryIncidentVertexNodesResponse> queryIncidentVertexNodes(QueryIncidentVertexNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryIncidentVertexNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIncidentVertexNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIncidentVertexNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryJenkinsImageRegistryPersistenceDay  QueryJenkinsImageRegistryPersistenceDayRequest
     * @return QueryJenkinsImageRegistryPersistenceDayResponse
     */
    @Override
    public CompletableFuture<QueryJenkinsImageRegistryPersistenceDayResponse> queryJenkinsImageRegistryPersistenceDay(QueryJenkinsImageRegistryPersistenceDayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryJenkinsImageRegistryPersistenceDay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryJenkinsImageRegistryPersistenceDayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryJenkinsImageRegistryPersistenceDayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPreCheckDatabase  QueryPreCheckDatabaseRequest
     * @return QueryPreCheckDatabaseResponse
     */
    @Override
    public CompletableFuture<QueryPreCheckDatabaseResponse> queryPreCheckDatabase(QueryPreCheckDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPreCheckDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPreCheckDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPreCheckDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebootMachine  RebootMachineRequest
     * @return RebootMachineResponse
     */
    @Override
    public CompletableFuture<RebootMachineResponse> rebootMachine(RebootMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootMachine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReceiveFunctionTrialRewardByAliUid  ReceiveFunctionTrialRewardByAliUidRequest
     * @return ReceiveFunctionTrialRewardByAliUidResponse
     */
    @Override
    public CompletableFuture<ReceiveFunctionTrialRewardByAliUidResponse> receiveFunctionTrialRewardByAliUid(ReceiveFunctionTrialRewardByAliUidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReceiveFunctionTrialRewardByAliUid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReceiveFunctionTrialRewardByAliUidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReceiveFunctionTrialRewardByAliUidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshAssets  RefreshAssetsRequest
     * @return RefreshAssetsResponse
     */
    @Override
    public CompletableFuture<RefreshAssetsResponse> refreshAssets(RefreshAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshContainerAssets  RefreshContainerAssetsRequest
     * @return RefreshContainerAssetsResponse
     */
    @Override
    public CompletableFuture<RefreshContainerAssetsResponse> refreshContainerAssets(RefreshContainerAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshContainerAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshContainerAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshContainerAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshOssBucketScanInfo  RefreshOssBucketScanInfoRequest
     * @return RefreshOssBucketScanInfoResponse
     */
    @Override
    public CompletableFuture<RefreshOssBucketScanInfoResponse> refreshOssBucketScanInfo(RefreshOssBucketScanInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshOssBucketScanInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshOssBucketScanInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshOssBucketScanInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshRegistryToken  RefreshRegistryTokenRequest
     * @return RefreshRegistryTokenResponse
     */
    @Override
    public CompletableFuture<RefreshRegistryTokenResponse> refreshRegistryToken(RefreshRegistryTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshRegistryToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshRegistryTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshRegistryTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseSasInstance  ReleaseSasInstanceRequest
     * @return ReleaseSasInstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseSasInstanceResponse> releaseSasInstance(ReleaseSasInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseSasInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseSasInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseSasInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveCheckInstanceResultWhiteList  RemoveCheckInstanceResultWhiteListRequest
     * @return RemoveCheckInstanceResultWhiteListResponse
     */
    @Override
    public CompletableFuture<RemoveCheckInstanceResultWhiteListResponse> removeCheckInstanceResultWhiteList(RemoveCheckInstanceResultWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveCheckInstanceResultWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveCheckInstanceResultWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveCheckInstanceResultWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveCheckResultWhiteList  RemoveCheckResultWhiteListRequest
     * @return RemoveCheckResultWhiteListResponse
     */
    @Override
    public CompletableFuture<RemoveCheckResultWhiteListResponse> removeCheckResultWhiteList(RemoveCheckResultWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveCheckResultWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveCheckResultWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveCheckResultWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetHoneypot  ResetHoneypotRequest
     * @return ResetHoneypotResponse
     */
    @Override
    public CompletableFuture<ResetHoneypotResponse> resetHoneypot(ResetHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetLogShipper  ResetLogShipperRequest
     * @return ResetLogShipperResponse
     */
    @Override
    public CompletableFuture<ResetLogShipperResponse> resetLogShipper(ResetLogShipperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetLogShipper").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetLogShipperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetLogShipperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryAgentlessTask  RetryAgentlessTaskRequest
     * @return RetryAgentlessTaskResponse
     */
    @Override
    public CompletableFuture<RetryAgentlessTaskResponse> retryAgentlessTask(RetryAgentlessTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryAgentlessTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryAgentlessTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryAgentlessTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryInstallProbe  RetryInstallProbeRequest
     * @return RetryInstallProbeResponse
     */
    @Override
    public CompletableFuture<RetryInstallProbeResponse> retryInstallProbe(RetryInstallProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryInstallProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryInstallProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryInstallProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackSuspEventQuaraFile  RollbackSuspEventQuaraFileRequest
     * @return RollbackSuspEventQuaraFileResponse
     */
    @Override
    public CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackSuspEventQuaraFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackSuspEventQuaraFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackSuspEventQuaraFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SasInstallCode  SasInstallCodeRequest
     * @return SasInstallCodeResponse
     */
    @Override
    public CompletableFuture<SasInstallCodeResponse> sasInstallCode(SasInstallCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SasInstallCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SasInstallCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SasInstallCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveCustomizeReportConfig  SaveCustomizeReportConfigRequest
     * @return SaveCustomizeReportConfigResponse
     */
    @Override
    public CompletableFuture<SaveCustomizeReportConfigResponse> saveCustomizeReportConfig(SaveCustomizeReportConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveCustomizeReportConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveCustomizeReportConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveCustomizeReportConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveImageBaselineStrategy  SaveImageBaselineStrategyRequest
     * @return SaveImageBaselineStrategyResponse
     */
    @Override
    public CompletableFuture<SaveImageBaselineStrategyResponse> saveImageBaselineStrategy(SaveImageBaselineStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveImageBaselineStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveImageBaselineStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveImageBaselineStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveSuspEventUserSetting  SaveSuspEventUserSettingRequest
     * @return SaveSuspEventUserSettingResponse
     */
    @Override
    public CompletableFuture<SaveSuspEventUserSettingResponse> saveSuspEventUserSetting(SaveSuspEventUserSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveSuspEventUserSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveSuspEventUserSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveSuspEventUserSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or enabled the feature, you can call this operation.</p>
     * 
     * @param request the request parameters of SaveWhiteListStrategy  SaveWhiteListStrategyRequest
     * @return SaveWhiteListStrategyResponse
     */
    @Override
    public CompletableFuture<SaveWhiteListStrategyResponse> saveWhiteListStrategy(SaveWhiteListStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveWhiteListStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveWhiteListStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveWhiteListStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveWhiteListStrategyAssets  SaveWhiteListStrategyAssetsRequest
     * @return SaveWhiteListStrategyAssetsResponse
     */
    @Override
    public CompletableFuture<SaveWhiteListStrategyAssetsResponse> saveWhiteListStrategyAssets(SaveWhiteListStrategyAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveWhiteListStrategyAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveWhiteListStrategyAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveWhiteListStrategyAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendCustomizeReport  SendCustomizeReportRequest
     * @return SendCustomizeReportResponse
     */
    @Override
    public CompletableFuture<SendCustomizeReportResponse> sendCustomizeReport(SendCustomizeReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendCustomizeReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendCustomizeReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendCustomizeReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetBuildRiskDefineRuleConfig  SetBuildRiskDefineRuleConfigRequest
     * @return SetBuildRiskDefineRuleConfigResponse
     */
    @Override
    public CompletableFuture<SetBuildRiskDefineRuleConfigResponse> setBuildRiskDefineRuleConfig(SetBuildRiskDefineRuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetBuildRiskDefineRuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetBuildRiskDefineRuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetBuildRiskDefineRuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetClusterInterceptionConfig  SetClusterInterceptionConfigRequest
     * @return SetClusterInterceptionConfigResponse
     */
    @Override
    public CompletableFuture<SetClusterInterceptionConfigResponse> setClusterInterceptionConfig(SetClusterInterceptionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetClusterInterceptionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetClusterInterceptionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetClusterInterceptionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetImageBuildRiskStatus  SetImageBuildRiskStatusRequest
     * @return SetImageBuildRiskStatusResponse
     */
    @Override
    public CompletableFuture<SetImageBuildRiskStatusResponse> setImageBuildRiskStatus(SetImageBuildRiskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetImageBuildRiskStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetImageBuildRiskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetImageBuildRiskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetImageSensitiveFileStatus  SetImageSensitiveFileStatusRequest
     * @return SetImageSensitiveFileStatusResponse
     */
    @Override
    public CompletableFuture<SetImageSensitiveFileStatusResponse> setImageSensitiveFileStatus(SetImageSensitiveFileStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetImageSensitiveFileStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetImageSensitiveFileStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetImageSensitiveFileStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetRegistryScanDayNum  SetRegistryScanDayNumRequest
     * @return SetRegistryScanDayNumResponse
     */
    @Override
    public CompletableFuture<SetRegistryScanDayNumResponse> setRegistryScanDayNum(SetRegistryScanDayNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetRegistryScanDayNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRegistryScanDayNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRegistryScanDayNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSensitiveDefineRuleConfig  SetSensitiveDefineRuleConfigRequest
     * @return SetSensitiveDefineRuleConfigResponse
     */
    @Override
    public CompletableFuture<SetSensitiveDefineRuleConfigResponse> setSensitiveDefineRuleConfig(SetSensitiveDefineRuleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSensitiveDefineRuleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSensitiveDefineRuleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSensitiveDefineRuleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSyncRefreshRegion  SetSyncRefreshRegionRequest
     * @return SetSyncRefreshRegionResponse
     */
    @Override
    public CompletableFuture<SetSyncRefreshRegionResponse> setSyncRefreshRegion(SetSyncRefreshRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSyncRefreshRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSyncRefreshRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSyncRefreshRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI StartBaselineSecurityCheck is deprecated, please use Sas::2018-12-03::SubmitCheck instead.  * @param request  the request parameters of StartBaselineSecurityCheck  StartBaselineSecurityCheckRequest
     * @return StartBaselineSecurityCheckResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<StartBaselineSecurityCheckResponse> startBaselineSecurityCheck(StartBaselineSecurityCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartBaselineSecurityCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartBaselineSecurityCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartBaselineSecurityCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartDiscoverDatabaseTask  StartDiscoverDatabaseTaskRequest
     * @return StartDiscoverDatabaseTaskResponse
     */
    @Override
    public CompletableFuture<StartDiscoverDatabaseTaskResponse> startDiscoverDatabaseTask(StartDiscoverDatabaseTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDiscoverDatabaseTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDiscoverDatabaseTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDiscoverDatabaseTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartHoneypot  StartHoneypotRequest
     * @return StartHoneypotResponse
     */
    @Override
    public CompletableFuture<StartHoneypotResponse> startHoneypot(StartHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartIdcProbeScan  StartIdcProbeScanRequest
     * @return StartIdcProbeScanResponse
     */
    @Override
    public CompletableFuture<StartIdcProbeScanResponse> startIdcProbeScan(StartIdcProbeScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartIdcProbeScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartIdcProbeScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartIdcProbeScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartPreCheckDatabase  StartPreCheckDatabaseRequest
     * @return StartPreCheckDatabaseResponse
     */
    @Override
    public CompletableFuture<StartPreCheckDatabaseResponse> startPreCheckDatabase(StartPreCheckDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPreCheckDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPreCheckDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPreCheckDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartVirusScanTask  StartVirusScanTaskRequest
     * @return StartVirusScanTaskResponse
     */
    @Override
    public CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartVirusScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartVirusScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartVirusScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopHoneypot  StopHoneypotRequest
     * @return StopHoneypotResponse
     */
    @Override
    public CompletableFuture<StopHoneypotResponse> stopHoneypot(StopHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitCheck  SubmitCheckRequest
     * @return SubmitCheckResponse
     */
    @Override
    public CompletableFuture<SubmitCheckResponse> submitCheck(SubmitCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitOperationTask  SubmitOperationTaskRequest
     * @return SubmitOperationTaskResponse
     */
    @Override
    public CompletableFuture<SubmitOperationTaskResponse> submitOperationTask(SubmitOperationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitOperationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitOperationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitOperationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitTenantCheck  SubmitTenantCheckRequest
     * @return SubmitTenantCheckResponse
     */
    @Override
    public CompletableFuture<SubmitTenantCheckResponse> submitTenantCheck(SubmitTenantCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTenantCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTenantCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTenantCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerCheck  TriggerCheckRequest
     * @return TriggerCheckResponse
     */
    @Override
    public CompletableFuture<TriggerCheckResponse> triggerCheck(TriggerCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnBindHybridProxy  UnBindHybridProxyRequest
     * @return UnBindHybridProxyResponse
     */
    @Override
    public CompletableFuture<UnBindHybridProxyResponse> unBindHybridProxy(UnBindHybridProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnBindHybridProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnBindHybridProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnBindHybridProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnMarkMonitorAccounts  UnMarkMonitorAccountsRequest
     * @return UnMarkMonitorAccountsResponse
     */
    @Override
    public CompletableFuture<UnMarkMonitorAccountsResponse> unMarkMonitorAccounts(UnMarkMonitorAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnMarkMonitorAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnMarkMonitorAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnMarkMonitorAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you no longer require protection for servers that are not deployed on Alibaba Cloud, you can call this operation to unbind the servers from Security Center. After you unbind a server that is not deployed on Alibaba Cloud from Security Center, the server no longer consumes the quota of protected servers or protected server vCPUs. This way, you can install the Security Center agent on other servers to meet your business requirements.</p>
     * <blockquote>
     * <p>You can unbind only the servers that are not deployed on Alibaba Cloud from Security Center. If you use an Alibaba Cloud Elastic Compute Service (ECS) instance, you do not need to unbind the ECS instance. If you uninstall the Security Center agent from an ECS instance, the ECS instance still exists as a disconnected server in the asset list of the Security Center console. The ECS instance is not removed from the asset list.
     * <strong>Prerequisites</strong></p>
     * </blockquote>
     * <ul>
     * <li>The server that you want to unbind from Security Center is not deployed on Alibaba Cloud and the Security Center agent is disabled for the server. In this case, the agent is in the Close state and Security Center does not protect the server. You can call the <a href="~~PauseClient~~">PauseClient</a> operation to disable the agent.</li>
     * <li>The client protection feature is disabled for the server that you want to unbind from Security Center. For more information about how to disable the client protection feature, see <a href="https://www.alibabacloud.com/help/en/security-center/latest/local-file-detection-engine">Use the client protection feature</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UnbindAegis  UnbindAegisRequest
     * @return UnbindAegisResponse
     */
    @Override
    public CompletableFuture<UnbindAegisResponse> unbindAegis(UnbindAegisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindAegis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindAegisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindAegisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallBackupClient  UninstallBackupClientRequest
     * @return UninstallBackupClientResponse
     */
    @Override
    public CompletableFuture<UninstallBackupClientResponse> uninstallBackupClient(UninstallBackupClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallBackupClient").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallBackupClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallBackupClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallUniBackupAgent  UninstallUniBackupAgentRequest
     * @return UninstallUniBackupAgentResponse
     */
    @Override
    public CompletableFuture<UninstallUniBackupAgentResponse> uninstallUniBackupAgent(UninstallUniBackupAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallUniBackupAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallUniBackupAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallUniBackupAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlarmEvent  UpdateAlarmEventRequest
     * @return UpdateAlarmEventResponse
     */
    @Override
    public CompletableFuture<UpdateAlarmEventResponse> updateAlarmEvent(UpdateAlarmEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAlarmEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlarmEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlarmEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBaselineCheckWhiteRecord  UpdateBaselineCheckWhiteRecordRequest
     * @return UpdateBaselineCheckWhiteRecordResponse
     */
    @Override
    public CompletableFuture<UpdateBaselineCheckWhiteRecordResponse> updateBaselineCheckWhiteRecord(UpdateBaselineCheckWhiteRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBaselineCheckWhiteRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBaselineCheckWhiteRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBaselineCheckWhiteRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClientAlertMode  UpdateClientAlertModeRequest
     * @return UpdateClientAlertModeResponse
     */
    @Override
    public CompletableFuture<UpdateClientAlertModeResponse> updateClientAlertMode(UpdateClientAlertModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientAlertMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientAlertModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientAlertModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCommonSwitchConfig  UpdateCommonSwitchConfigRequest
     * @return UpdateCommonSwitchConfigResponse
     */
    @Override
    public CompletableFuture<UpdateCommonSwitchConfigResponse> updateCommonSwitchConfig(UpdateCommonSwitchConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCommonSwitchConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCommonSwitchConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCommonSwitchConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomizeReportStatus  UpdateCustomizeReportStatusRequest
     * @return UpdateCustomizeReportStatusResponse
     */
    @Override
    public CompletableFuture<UpdateCustomizeReportStatusResponse> updateCustomizeReportStatus(UpdateCustomizeReportStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomizeReportStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomizeReportStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomizeReportStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFileProtectEventStatus  UpdateFileProtectEventStatusRequest
     * @return UpdateFileProtectEventStatusResponse
     */
    @Override
    public CompletableFuture<UpdateFileProtectEventStatusResponse> updateFileProtectEventStatus(UpdateFileProtectEventStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFileProtectEventStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileProtectEventStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileProtectEventStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFileProtectRemark  UpdateFileProtectRemarkRequest
     * @return UpdateFileProtectRemarkResponse
     */
    @Override
    public CompletableFuture<UpdateFileProtectRemarkResponse> updateFileProtectRemark(UpdateFileProtectRemarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFileProtectRemark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileProtectRemarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileProtectRemarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFileProtectRule  UpdateFileProtectRuleRequest
     * @return UpdateFileProtectRuleResponse
     */
    @Override
    public CompletableFuture<UpdateFileProtectRuleResponse> updateFileProtectRule(UpdateFileProtectRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFileProtectRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileProtectRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileProtectRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFileUploadLimit  UpdateFileUploadLimitRequest
     * @return UpdateFileUploadLimitResponse
     */
    @Override
    public CompletableFuture<UpdateFileUploadLimitResponse> updateFileUploadLimit(UpdateFileUploadLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFileUploadLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileUploadLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileUploadLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoneypot  UpdateHoneypotRequest
     * @return UpdateHoneypotResponse
     */
    @Override
    public CompletableFuture<UpdateHoneypotResponse> updateHoneypot(UpdateHoneypotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHoneypot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoneypotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoneypotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoneypotNode  UpdateHoneypotNodeRequest
     * @return UpdateHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<UpdateHoneypotNodeResponse> updateHoneypotNode(UpdateHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoneypotPreset  UpdateHoneypotPresetRequest
     * @return UpdateHoneypotPresetResponse
     */
    @Override
    public CompletableFuture<UpdateHoneypotPresetResponse> updateHoneypotPreset(UpdateHoneypotPresetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHoneypotPreset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoneypotPresetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoneypotPresetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoneypotProbe  UpdateHoneypotProbeRequest
     * @return UpdateHoneypotProbeResponse
     */
    @Override
    public CompletableFuture<UpdateHoneypotProbeResponse> updateHoneypotProbe(UpdateHoneypotProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHoneypotProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoneypotProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoneypotProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHoneypotProbeBind  UpdateHoneypotProbeBindRequest
     * @return UpdateHoneypotProbeBindResponse
     */
    @Override
    public CompletableFuture<UpdateHoneypotProbeBindResponse> updateHoneypotProbeBind(UpdateHoneypotProbeBindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHoneypotProbeBind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHoneypotProbeBindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHoneypotProbeBindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateImageEventOperation  UpdateImageEventOperationRequest
     * @return UpdateImageEventOperationResponse
     */
    @Override
    public CompletableFuture<UpdateImageEventOperationResponse> updateImageEventOperation(UpdateImageEventOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImageEventOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageEventOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageEventOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateImageVulWhitelistTarget  UpdateImageVulWhitelistTargetRequest
     * @return UpdateImageVulWhitelistTargetResponse
     */
    @Override
    public CompletableFuture<UpdateImageVulWhitelistTargetResponse> updateImageVulWhitelistTarget(UpdateImageVulWhitelistTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImageVulWhitelistTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageVulWhitelistTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageVulWhitelistTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJenkinsImageRegistryName  UpdateJenkinsImageRegistryNameRequest
     * @return UpdateJenkinsImageRegistryNameResponse
     */
    @Override
    public CompletableFuture<UpdateJenkinsImageRegistryNameResponse> updateJenkinsImageRegistryName(UpdateJenkinsImageRegistryNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateJenkinsImageRegistryName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJenkinsImageRegistryNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJenkinsImageRegistryNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJenkinsImageRegistryPersistenceDay  UpdateJenkinsImageRegistryPersistenceDayRequest
     * @return UpdateJenkinsImageRegistryPersistenceDayResponse
     */
    @Override
    public CompletableFuture<UpdateJenkinsImageRegistryPersistenceDayResponse> updateJenkinsImageRegistryPersistenceDay(UpdateJenkinsImageRegistryPersistenceDayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateJenkinsImageRegistryPersistenceDay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJenkinsImageRegistryPersistenceDayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJenkinsImageRegistryPersistenceDayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMaliciousFileWhitelistConfig  UpdateMaliciousFileWhitelistConfigRequest
     * @return UpdateMaliciousFileWhitelistConfigResponse
     */
    @Override
    public CompletableFuture<UpdateMaliciousFileWhitelistConfigResponse> updateMaliciousFileWhitelistConfig(UpdateMaliciousFileWhitelistConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMaliciousFileWhitelistConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMaliciousFileWhitelistConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMaliciousFileWhitelistConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOpaStrategyNew  UpdateOpaStrategyNewRequest
     * @return UpdateOpaStrategyNewResponse
     */
    @Override
    public CompletableFuture<UpdateOpaStrategyNewResponse> updateOpaStrategyNew(UpdateOpaStrategyNewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOpaStrategyNew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOpaStrategyNewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOpaStrategyNewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOssScanConfig  UpdateOssScanConfigRequest
     * @return UpdateOssScanConfigResponse
     */
    @Override
    public CompletableFuture<UpdateOssScanConfigResponse> updateOssScanConfig(UpdateOssScanConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOssScanConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOssScanConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOssScanConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePublishAutoUpgrade  UpdatePublishAutoUpgradeRequest
     * @return UpdatePublishAutoUpgradeResponse
     */
    @Override
    public CompletableFuture<UpdatePublishAutoUpgradeResponse> updatePublishAutoUpgrade(UpdatePublishAutoUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePublishAutoUpgrade").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublishAutoUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublishAutoUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePublishBatch  UpdatePublishBatchRequest
     * @return UpdatePublishBatchResponse
     */
    @Override
    public CompletableFuture<UpdatePublishBatchResponse> updatePublishBatch(UpdatePublishBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePublishBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublishBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublishBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePublishCron  UpdatePublishCronRequest
     * @return UpdatePublishCronResponse
     */
    @Override
    public CompletableFuture<UpdatePublishCronResponse> updatePublishCron(UpdatePublishCronRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePublishCron").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublishCronResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublishCronResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePublishGraySwitch  UpdatePublishGraySwitchRequest
     * @return UpdatePublishGraySwitchResponse
     */
    @Override
    public CompletableFuture<UpdatePublishGraySwitchResponse> updatePublishGraySwitch(UpdatePublishGraySwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePublishGraySwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublishGraySwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublishGraySwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSelectionKeyByType  UpdateSelectionKeyByTypeRequest
     * @return UpdateSelectionKeyByTypeResponse
     */
    @Override
    public CompletableFuture<UpdateSelectionKeyByTypeResponse> updateSelectionKeyByType(UpdateSelectionKeyByTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSelectionKeyByType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSelectionKeyByTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSelectionKeyByTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTargetListByBatch  UpdateTargetListByBatchRequest
     * @return UpdateTargetListByBatchResponse
     */
    @Override
    public CompletableFuture<UpdateTargetListByBatchResponse> updateTargetListByBatch(UpdateTargetListByBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTargetListByBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTargetListByBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTargetListByBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The application whitelist feature is in public preview. You cannot apply for a trial of the feature. If you applied for a trial of the feature or the feature is in use, you can call this operation.</p>
     * 
     * @param request the request parameters of UpdateWhiteListStrategyStatus  UpdateWhiteListStrategyStatusRequest
     * @return UpdateWhiteListStrategyStatusResponse
     */
    @Override
    public CompletableFuture<UpdateWhiteListStrategyStatusResponse> updateWhiteListStrategyStatus(UpdateWhiteListStrategyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWhiteListStrategyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWhiteListStrategyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWhiteListStrategyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeBackupPolicyVersion  UpgradeBackupPolicyVersionRequest
     * @return UpgradeBackupPolicyVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeBackupPolicyVersionResponse> upgradeBackupPolicyVersion(UpgradeBackupPolicyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeBackupPolicyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeBackupPolicyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeBackupPolicyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeHoneypotNode  UpgradeHoneypotNodeRequest
     * @return UpgradeHoneypotNodeResponse
     */
    @Override
    public CompletableFuture<UpgradeHoneypotNodeResponse> upgradeHoneypotNode(UpgradeHoneypotNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeHoneypotNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeHoneypotNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeHoneypotNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeVersionByUuids  UpgradeVersionByUuidsRequest
     * @return UpgradeVersionByUuidsResponse
     */
    @Override
    public CompletableFuture<UpgradeVersionByUuidsResponse> upgradeVersionByUuids(UpgradeVersionByUuidsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeVersionByUuids").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeVersionByUuidsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeVersionByUuidsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadedHoneyPotFile  UploadedHoneyPotFileRequest
     * @return UploadedHoneyPotFileResponse
     */
    @Override
    public CompletableFuture<UploadedHoneyPotFileResponse> uploadedHoneyPotFile(UploadedHoneyPotFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadedHoneyPotFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadedHoneyPotFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadedHoneyPotFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateHcWarnings  ValidateHcWarningsRequest
     * @return ValidateHcWarningsResponse
     */
    @Override
    public CompletableFuture<ValidateHcWarningsResponse> validateHcWarnings(ValidateHcWarningsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateHcWarnings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateHcWarningsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateHcWarningsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyCheckInstanceResult  VerifyCheckInstanceResultRequest
     * @return VerifyCheckInstanceResultResponse
     */
    @Override
    public CompletableFuture<VerifyCheckInstanceResultResponse> verifyCheckInstanceResult(VerifyCheckInstanceResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyCheckInstanceResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyCheckInstanceResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyCheckInstanceResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyCheckResult  VerifyCheckResultRequest
     * @return VerifyCheckResultResponse
     */
    @Override
    public CompletableFuture<VerifyCheckResultResponse> verifyCheckResult(VerifyCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
