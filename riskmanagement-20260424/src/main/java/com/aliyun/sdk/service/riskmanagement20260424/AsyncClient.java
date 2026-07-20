// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.riskmanagement20260424.models.*;
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
     * @param request the request parameters of BindAuthToMachine  BindAuthToMachineRequest
     * @return BindAuthToMachineResponse
     */
    CompletableFuture<BindAuthToMachineResponse> bindAuthToMachine(BindAuthToMachineRequest request);

    /**
     * @param request the request parameters of CreateSasTrial  CreateSasTrialRequest
     * @return CreateSasTrialResponse
     */
    CompletableFuture<CreateSasTrialResponse> createSasTrial(CreateSasTrialRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateVirusScanOnceTask  CreateVirusScanOnceTaskRequest
     * @return CreateVirusScanOnceTaskResponse
     */
    CompletableFuture<CreateVirusScanOnceTaskResponse> createVirusScanOnceTask(CreateVirusScanOnceTaskRequest request);

    /**
     * @param request the request parameters of DescribeCloudCenterInstances  DescribeCloudCenterInstancesRequest
     * @return DescribeCloudCenterInstancesResponse
     */
    CompletableFuture<DescribeCloudCenterInstancesResponse> describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request);

    /**
     * @param request the request parameters of DescribeServiceLinkedRoleStatus  DescribeServiceLinkedRoleStatusRequest
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    CompletableFuture<DescribeServiceLinkedRoleStatusResponse> describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request);

    /**
     * @param request the request parameters of DescribeSuspEvents  DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    /**
     * @param request the request parameters of DescribeVersionConfig  DescribeVersionConfigRequest
     * @return DescribeVersionConfigResponse
     */
    CompletableFuture<DescribeVersionConfigResponse> describeVersionConfig(DescribeVersionConfigRequest request);

    /**
     * @param request the request parameters of GetAlertRecordAnalysisResult  GetAlertRecordAnalysisResultRequest
     * @return GetAlertRecordAnalysisResultResponse
     */
    CompletableFuture<GetAlertRecordAnalysisResultResponse> getAlertRecordAnalysisResult(GetAlertRecordAnalysisResultRequest request);

    /**
     * @param request the request parameters of GetAliYunSafeCenterResult  GetAliYunSafeCenterResultRequest
     * @return GetAliYunSafeCenterResultResponse
     */
    CompletableFuture<GetAliYunSafeCenterResultResponse> getAliYunSafeCenterResult(GetAliYunSafeCenterResultRequest request);

    /**
     * @param request the request parameters of GetCanTrySas  GetCanTrySasRequest
     * @return GetCanTrySasResponse
     */
    CompletableFuture<GetCanTrySasResponse> getCanTrySas(GetCanTrySasRequest request);

    /**
     * @param request the request parameters of GetCompliancePackId  GetCompliancePackIdRequest
     * @return GetCompliancePackIdResponse
     */
    CompletableFuture<GetCompliancePackIdResponse> getCompliancePackId(GetCompliancePackIdRequest request);

    /**
     * @param request the request parameters of GetDisposalToolStatus  GetDisposalToolStatusRequest
     * @return GetDisposalToolStatusResponse
     */
    CompletableFuture<GetDisposalToolStatusResponse> getDisposalToolStatus(GetDisposalToolStatusRequest request);

    /**
     * @param request the request parameters of GetNotificationClickRecord  GetNotificationClickRecordRequest
     * @return GetNotificationClickRecordResponse
     */
    CompletableFuture<GetNotificationClickRecordResponse> getNotificationClickRecord(GetNotificationClickRecordRequest request);

    /**
     * @param request the request parameters of GetNotificationContacts  GetNotificationContactsRequest
     * @return GetNotificationContactsResponse
     */
    CompletableFuture<GetNotificationContactsResponse> getNotificationContacts(GetNotificationContactsRequest request);

    /**
     * @param request the request parameters of GetNotificationPendNumber  GetNotificationPendNumberRequest
     * @return GetNotificationPendNumberResponse
     */
    CompletableFuture<GetNotificationPendNumberResponse> getNotificationPendNumber(GetNotificationPendNumberRequest request);

    /**
     * @param request the request parameters of GetResourceControlEvent  GetResourceControlEventRequest
     * @return GetResourceControlEventResponse
     */
    CompletableFuture<GetResourceControlEventResponse> getResourceControlEvent(GetResourceControlEventRequest request);

    /**
     * @param request the request parameters of GetSecurityCheckBaseInfo  GetSecurityCheckBaseInfoRequest
     * @return GetSecurityCheckBaseInfoResponse
     */
    CompletableFuture<GetSecurityCheckBaseInfoResponse> getSecurityCheckBaseInfo(GetSecurityCheckBaseInfoRequest request);

    /**
     * @param request the request parameters of GetSecurityCheckResultBaseInfo  GetSecurityCheckResultBaseInfoRequest
     * @return GetSecurityCheckResultBaseInfoResponse
     */
    CompletableFuture<GetSecurityCheckResultBaseInfoResponse> getSecurityCheckResultBaseInfo(GetSecurityCheckResultBaseInfoRequest request);

    /**
     * @param request the request parameters of GetSecuritySuggestionList  GetSecuritySuggestionListRequest
     * @return GetSecuritySuggestionListResponse
     */
    CompletableFuture<GetSecuritySuggestionListResponse> getSecuritySuggestionList(GetSecuritySuggestionListRequest request);

    /**
     * @param request the request parameters of GetSecuritySuggestionNumber  GetSecuritySuggestionNumberRequest
     * @return GetSecuritySuggestionNumberResponse
     */
    CompletableFuture<GetSecuritySuggestionNumberResponse> getSecuritySuggestionNumber(GetSecuritySuggestionNumberRequest request);

    /**
     * @param request the request parameters of GetServiceLinkedRoleStatus  GetServiceLinkedRoleStatusRequest
     * @return GetServiceLinkedRoleStatusResponse
     */
    CompletableFuture<GetServiceLinkedRoleStatusResponse> getServiceLinkedRoleStatus(GetServiceLinkedRoleStatusRequest request);

    /**
     * @param request the request parameters of GetValidDeductInstances  GetValidDeductInstancesRequest
     * @return GetValidDeductInstancesResponse
     */
    CompletableFuture<GetValidDeductInstancesResponse> getValidDeductInstances(GetValidDeductInstancesRequest request);

    /**
     * @param request the request parameters of InitSasModuleRule  InitSasModuleRuleRequest
     * @return InitSasModuleRuleResponse
     */
    CompletableFuture<InitSasModuleRuleResponse> initSasModuleRule(InitSasModuleRuleRequest request);

    /**
     * @param request the request parameters of ListVirusScanMachineEvent  ListVirusScanMachineEventRequest
     * @return ListVirusScanMachineEventResponse
     */
    CompletableFuture<ListVirusScanMachineEventResponse> listVirusScanMachineEvent(ListVirusScanMachineEventRequest request);

    /**
     * @param request the request parameters of OpenTrialPackage  OpenTrialPackageRequest
     * @return OpenTrialPackageResponse
     */
    CompletableFuture<OpenTrialPackageResponse> openTrialPackage(OpenTrialPackageRequest request);

    /**
     * @param request the request parameters of QueryAccountSafetyIncident  QueryAccountSafetyIncidentRequest
     * @return QueryAccountSafetyIncidentResponse
     */
    CompletableFuture<QueryAccountSafetyIncidentResponse> queryAccountSafetyIncident(QueryAccountSafetyIncidentRequest request);

    /**
     * @param request the request parameters of QueryGuideSubStatus  QueryGuideSubStatusRequest
     * @return QueryGuideSubStatusResponse
     */
    CompletableFuture<QueryGuideSubStatusResponse> queryGuideSubStatus(QueryGuideSubStatusRequest request);

    /**
     * @param request the request parameters of QueryResourceControlEvents  QueryResourceControlEventsRequest
     * @return QueryResourceControlEventsResponse
     */
    CompletableFuture<QueryResourceControlEventsResponse> queryResourceControlEvents(QueryResourceControlEventsRequest request);

    /**
     * @param request the request parameters of QuerySecurityCheckReport  QuerySecurityCheckReportRequest
     * @return QuerySecurityCheckReportResponse
     */
    CompletableFuture<QuerySecurityCheckReportResponse> querySecurityCheckReport(QuerySecurityCheckReportRequest request);

    /**
     * @param request the request parameters of StartDisposalToolService  StartDisposalToolServiceRequest
     * @return StartDisposalToolServiceResponse
     */
    CompletableFuture<StartDisposalToolServiceResponse> startDisposalToolService(StartDisposalToolServiceRequest request);

    /**
     * @param request the request parameters of StartSecurityCheckService  StartSecurityCheckServiceRequest
     * @return StartSecurityCheckServiceResponse
     */
    CompletableFuture<StartSecurityCheckServiceResponse> startSecurityCheckService(StartSecurityCheckServiceRequest request);

    /**
     * @param request the request parameters of SubmitApplyRecord  SubmitApplyRecordRequest
     * @return SubmitApplyRecordResponse
     */
    CompletableFuture<SubmitApplyRecordResponse> submitApplyRecord(SubmitApplyRecordRequest request);

    /**
     * @param request the request parameters of UpdatePostPaidBindRel  UpdatePostPaidBindRelRequest
     * @return UpdatePostPaidBindRelResponse
     */
    CompletableFuture<UpdatePostPaidBindRelResponse> updatePostPaidBindRel(UpdatePostPaidBindRelRequest request);

    /**
     * @param request the request parameters of UpdateSecurityCheckResult  UpdateSecurityCheckResultRequest
     * @return UpdateSecurityCheckResultResponse
     */
    CompletableFuture<UpdateSecurityCheckResultResponse> updateSecurityCheckResult(UpdateSecurityCheckResultRequest request);

}
