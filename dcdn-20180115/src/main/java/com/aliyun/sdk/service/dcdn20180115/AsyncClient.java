// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dcdn20180115.models.*;
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
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) is activated.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain name.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of AddDcdnDomain  AddDcdnDomainRequest
     * @return AddDcdnDomainResponse
     */
    CompletableFuture<AddDcdnDomainResponse> addDcdnDomain(AddDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Make sure that the IPA service is activated before you add a domain name to accelerate.</li>
     * <li>Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of AddDcdnIpaDomain  AddDcdnIpaDomainRequest
     * @return AddDcdnIpaDomainResponse
     */
    CompletableFuture<AddDcdnIpaDomainResponse> addDcdnIpaDomain(AddDcdnIpaDomainRequest request);

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*:</p>
     * <ul>
     * <li>The <a href="https://help.aliyun.com/document_detail/64926.html">DCDN service is activated</a>.</li>
     * <li>Internet content provider (ICP) filing is complete for the accelerated domain names.<blockquote>
     * <ul>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchAddDcdnDomain  BatchAddDcdnDomainRequest
     * @return BatchAddDcdnDomainResponse
     */
    CompletableFuture<BatchAddDcdnDomainResponse> batchAddDcdnDomain(BatchAddDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchCreateDcdnWafRules  BatchCreateDcdnWafRulesRequest
     * @return BatchCreateDcdnWafRulesResponse
     */
    CompletableFuture<BatchCreateDcdnWafRulesResponse> batchCreateDcdnWafRules(BatchCreateDcdnWafRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of BatchDeleteDcdnDomainConfigs  BatchDeleteDcdnDomainConfigsRequest
     * @return BatchDeleteDcdnDomainConfigsResponse
     */
    CompletableFuture<BatchDeleteDcdnDomainConfigsResponse> batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request);

    /**
     * @param request the request parameters of BatchDeleteDcdnKv  BatchDeleteDcdnKvRequest
     * @return BatchDeleteDcdnKvResponse
     */
    CompletableFuture<BatchDeleteDcdnKvResponse> batchDeleteDcdnKv(BatchDeleteDcdnKvRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchDeleteDcdnWafRules  BatchDeleteDcdnWafRulesRequest
     * @return BatchDeleteDcdnWafRulesResponse
     */
    CompletableFuture<BatchDeleteDcdnWafRulesResponse> batchDeleteDcdnWafRules(BatchDeleteDcdnWafRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of BatchModifyDcdnWafRules  BatchModifyDcdnWafRulesRequest
     * @return BatchModifyDcdnWafRulesResponse
     */
    CompletableFuture<BatchModifyDcdnWafRulesResponse> batchModifyDcdnWafRules(BatchModifyDcdnWafRulesRequest request);

    /**
     * @param request the request parameters of BatchPutDcdnKv  BatchPutDcdnKvRequest
     * @return BatchPutDcdnKvResponse
     */
    CompletableFuture<BatchPutDcdnKvResponse> batchPutDcdnKv(BatchPutDcdnKvRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchSetDcdnDomainCertificate  BatchSetDcdnDomainCertificateRequest
     * @return BatchSetDcdnDomainCertificateResponse
     */
    CompletableFuture<BatchSetDcdnDomainCertificateResponse> batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchSetDcdnDomainConfigs  BatchSetDcdnDomainConfigsRequest
     * @return BatchSetDcdnDomainConfigsResponse
     */
    CompletableFuture<BatchSetDcdnDomainConfigsResponse> batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchSetDcdnIpaDomainConfigs  BatchSetDcdnIpaDomainConfigsRequest
     * @return BatchSetDcdnIpaDomainConfigsResponse
     */
    CompletableFuture<BatchSetDcdnIpaDomainConfigsResponse> batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second.</li>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchSetDcdnWafDomainConfigs  BatchSetDcdnWafDomainConfigsRequest
     * @return BatchSetDcdnWafDomainConfigsResponse
     */
    CompletableFuture<BatchSetDcdnWafDomainConfigsResponse> batchSetDcdnWafDomainConfigs(BatchSetDcdnWafDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in an invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStartDcdnDomain  BatchStartDcdnDomainRequest
     * @return BatchStartDcdnDomainResponse
     */
    CompletableFuture<BatchStartDcdnDomainResponse> batchStartDcdnDomain(BatchStartDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of BatchStopDcdnDomain  BatchStopDcdnDomainRequest
     * @return BatchStopDcdnDomainResponse
     */
    CompletableFuture<BatchStopDcdnDomainResponse> batchStopDcdnDomain(BatchStopDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckDcdnProjectExist  CheckDcdnProjectExistRequest
     * @return CheckDcdnProjectExistResponse
     */
    CompletableFuture<CheckDcdnProjectExistResponse> checkDcdnProjectExist(CheckDcdnProjectExistRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The call frequency of the API is no more than 100 queries per second.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CommitStagingRoutineCode  CommitStagingRoutineCodeRequest
     * @return CommitStagingRoutineCodeResponse
     */
    CompletableFuture<CommitStagingRoutineCodeResponse> commitStagingRoutineCode(CommitStagingRoutineCodeRequest request);

    /**
     * @param request the request parameters of CreateDcdnCertificateSigningRequest  CreateDcdnCertificateSigningRequestRequest
     * @return CreateDcdnCertificateSigningRequestResponse
     */
    CompletableFuture<CreateDcdnCertificateSigningRequestResponse> createDcdnCertificateSigningRequest(CreateDcdnCertificateSigningRequestRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**You can call this operation up to three times per second.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDcdnDeliverTask  CreateDcdnDeliverTaskRequest
     * @return CreateDcdnDeliverTaskResponse
     */
    CompletableFuture<CreateDcdnDeliverTaskResponse> createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDcdnSLSRealTimeLogDelivery  CreateDcdnSLSRealTimeLogDeliveryRequest
     * @return CreateDcdnSLSRealTimeLogDeliveryResponse
     */
    CompletableFuture<CreateDcdnSLSRealTimeLogDeliveryResponse> createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDcdnSubTask  CreateDcdnSubTaskRequest
     * @return CreateDcdnSubTaskResponse
     */
    CompletableFuture<CreateDcdnSubTaskResponse> createDcdnSubTask(CreateDcdnSubTaskRequest request);

    /**
     * @param request the request parameters of CreateDcdnWafGroup  CreateDcdnWafGroupRequest
     * @return CreateDcdnWafGroupResponse
     */
    CompletableFuture<CreateDcdnWafGroupResponse> createDcdnWafGroup(CreateDcdnWafGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDcdnWafPolicy  CreateDcdnWafPolicyRequest
     * @return CreateDcdnWafPolicyResponse
     */
    CompletableFuture<CreateDcdnWafPolicyResponse> createDcdnWafPolicy(CreateDcdnWafPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.</li>
     * <li>You can only specify the production and staging environments when you call this operation.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRoutine  CreateRoutineRequest
     * @return CreateRoutineResponse
     */
    CompletableFuture<CreateRoutineResponse> createRoutine(CreateRoutineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSlrAndSlsProject  CreateSlrAndSlsProjectRequest
     * @return CreateSlrAndSlsProjectResponse
     */
    CompletableFuture<CreateSlrAndSlsProjectResponse> createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 3.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnDeliverTask  DeleteDcdnDeliverTaskRequest
     * @return DeleteDcdnDeliverTaskResponse
     */
    CompletableFuture<DeleteDcdnDeliverTaskResponse> deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before you delete your domain name, you need to request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>If you call the <strong>DeleteDcdnDomain</strong> operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the <a href="https://help.aliyun.com/document_detail/130622.html">StopDcdnDomain</a> operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnDomain  DeleteDcdnDomainRequest
     * @return DeleteDcdnDomainResponse
     */
    CompletableFuture<DeleteDcdnDomainResponse> deleteDcdnDomain(DeleteDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.</li>
     * <li>This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the <strong>StopDcdnIpaDomain</strong> operation.****</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDcdnIpaDomain  DeleteDcdnIpaDomainRequest
     * @return DeleteDcdnIpaDomainResponse
     */
    CompletableFuture<DeleteDcdnIpaDomainResponse> deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnIpaSpecificConfig  DeleteDcdnIpaSpecificConfigRequest
     * @return DeleteDcdnIpaSpecificConfigResponse
     */
    CompletableFuture<DeleteDcdnIpaSpecificConfigResponse> deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request);

    /**
     * @param request the request parameters of DeleteDcdnKv  DeleteDcdnKvRequest
     * @return DeleteDcdnKvResponse
     */
    CompletableFuture<DeleteDcdnKvResponse> deleteDcdnKv(DeleteDcdnKvRequest request);

    /**
     * @param request the request parameters of DeleteDcdnKvNamespace  DeleteDcdnKvNamespaceRequest
     * @return DeleteDcdnKvNamespaceResponse
     */
    CompletableFuture<DeleteDcdnKvNamespaceResponse> deleteDcdnKvNamespace(DeleteDcdnKvNamespaceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnRealTimeLogProject  DeleteDcdnRealTimeLogProjectRequest
     * @return DeleteDcdnRealTimeLogProjectResponse
     */
    CompletableFuture<DeleteDcdnRealTimeLogProjectResponse> deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnSpecificConfig  DeleteDcdnSpecificConfigRequest
     * @return DeleteDcdnSpecificConfigResponse
     */
    CompletableFuture<DeleteDcdnSpecificConfigResponse> deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnSpecificStagingConfig  DeleteDcdnSpecificStagingConfigRequest
     * @return DeleteDcdnSpecificStagingConfigResponse
     */
    CompletableFuture<DeleteDcdnSpecificStagingConfigResponse> deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDcdnSubTask  DeleteDcdnSubTaskRequest
     * @return DeleteDcdnSubTaskResponse
     */
    CompletableFuture<DeleteDcdnSubTaskResponse> deleteDcdnSubTask(DeleteDcdnSubTaskRequest request);

    /**
     * @param request the request parameters of DeleteDcdnUserConfig  DeleteDcdnUserConfigRequest
     * @return DeleteDcdnUserConfigResponse
     */
    CompletableFuture<DeleteDcdnUserConfigResponse> deleteDcdnUserConfig(DeleteDcdnUserConfigRequest request);

    /**
     * @param request the request parameters of DeleteDcdnWafGroup  DeleteDcdnWafGroupRequest
     * @return DeleteDcdnWafGroupResponse
     */
    CompletableFuture<DeleteDcdnWafGroupResponse> deleteDcdnWafGroup(DeleteDcdnWafGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDcdnWafPolicy  DeleteDcdnWafPolicyRequest
     * @return DeleteDcdnWafPolicyResponse
     */
    CompletableFuture<DeleteDcdnWafPolicyResponse> deleteDcdnWafPolicy(DeleteDcdnWafPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRoutine  DeleteRoutineRequest
     * @return DeleteRoutineResponse
     */
    CompletableFuture<DeleteRoutineResponse> deleteRoutine(DeleteRoutineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRoutineCodeRevision  DeleteRoutineCodeRevisionRequest
     * @return DeleteRoutineCodeRevisionResponse
     */
    CompletableFuture<DeleteRoutineCodeRevisionResponse> deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRoutineConfEnvs  DeleteRoutineConfEnvsRequest
     * @return DeleteRoutineConfEnvsResponse
     */
    CompletableFuture<DeleteRoutineConfEnvsResponse> deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnAclFields  DescribeDcdnAclFieldsRequest
     * @return DescribeDcdnAclFieldsResponse
     */
    CompletableFuture<DescribeDcdnAclFieldsResponse> describeDcdnAclFields(DescribeDcdnAclFieldsRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnBgpBpsData  DescribeDcdnBgpBpsDataRequest
     * @return DescribeDcdnBgpBpsDataResponse
     */
    CompletableFuture<DescribeDcdnBgpBpsDataResponse> describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.</li>
     * <li>If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.</li>
     * <li>You can call this operation up to five times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnBgpTrafficData  DescribeDcdnBgpTrafficDataRequest
     * @return DescribeDcdnBgpTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnBgpTrafficDataResponse> describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnBlockedRegions  DescribeDcdnBlockedRegionsRequest
     * @return DescribeDcdnBlockedRegionsResponse
     */
    CompletableFuture<DescribeDcdnBlockedRegionsResponse> describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnCertificateDetail  DescribeDcdnCertificateDetailRequest
     * @return DescribeDcdnCertificateDetailResponse
     */
    CompletableFuture<DescribeDcdnCertificateDetailResponse> describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request);

    /**
     * @deprecated OpenAPI DescribeDcdnCertificateList is deprecated, please use dcdn::2018-01-15::DescribeDcdnSSLCertificateList instead.  * @description > You can call this operation up to 30 times per second per account.
     * 
     * @param request the request parameters of DescribeDcdnCertificateList  DescribeDcdnCertificateListRequest
     * @return DescribeDcdnCertificateListResponse
     */
    @Deprecated
    CompletableFuture<DescribeDcdnCertificateListResponse> describeDcdnCertificateList(DescribeDcdnCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeDcdnDdosService  DescribeDcdnDdosServiceRequest
     * @return DescribeDcdnDdosServiceResponse
     */
    CompletableFuture<DescribeDcdnDdosServiceResponse> describeDcdnDdosService(DescribeDcdnDdosServiceRequest request);

    /**
     * @param request the request parameters of DescribeDcdnDdosSpecInfo  DescribeDcdnDdosSpecInfoRequest
     * @return DescribeDcdnDdosSpecInfoResponse
     */
    CompletableFuture<DescribeDcdnDdosSpecInfoResponse> describeDcdnDdosSpecInfo(DescribeDcdnDdosSpecInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDeletedDomains  DescribeDcdnDeletedDomainsRequest
     * @return DescribeDcdnDeletedDomainsResponse
     */
    CompletableFuture<DescribeDcdnDeletedDomainsResponse> describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDeliverList  DescribeDcdnDeliverListRequest
     * @return DescribeDcdnDeliverListResponse
     */
    CompletableFuture<DescribeDcdnDeliverListResponse> describeDcdnDeliverList(DescribeDcdnDeliverListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainBpsData  DescribeDcdnDomainBpsDataRequest
     * @return DescribeDcdnDomainBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainBpsDataResponse> describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainBpsDataByLayer  DescribeDcdnDomainBpsDataByLayerRequest
     * @return DescribeDcdnDomainBpsDataByLayerResponse
     */
    CompletableFuture<DescribeDcdnDomainBpsDataByLayerResponse> describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainByCertificate  DescribeDcdnDomainByCertificateRequest
     * @return DescribeDcdnDomainByCertificateResponse
     */
    CompletableFuture<DescribeDcdnDomainByCertificateResponse> describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainCcActivityLog  DescribeDcdnDomainCcActivityLogRequest
     * @return DescribeDcdnDomainCcActivityLogResponse
     */
    CompletableFuture<DescribeDcdnDomainCcActivityLogResponse> describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainCertificateInfo  DescribeDcdnDomainCertificateInfoRequest
     * @return DescribeDcdnDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeDcdnDomainCertificateInfoResponse> describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainCname  DescribeDcdnDomainCnameRequest
     * @return DescribeDcdnDomainCnameResponse
     */
    CompletableFuture<DescribeDcdnDomainCnameResponse> describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can query the configurations of one or more features in a request.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainConfigs  DescribeDcdnDomainConfigsRequest
     * @return DescribeDcdnDomainConfigsResponse
     */
    CompletableFuture<DescribeDcdnDomainConfigsResponse> describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainDetail  DescribeDcdnDomainDetailRequest
     * @return DescribeDcdnDomainDetailResponse
     */
    CompletableFuture<DescribeDcdnDomainDetailResponse> describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <h1></h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainHitRateData  DescribeDcdnDomainHitRateDataRequest
     * @return DescribeDcdnDomainHitRateDataResponse
     */
    CompletableFuture<DescribeDcdnDomainHitRateDataResponse> describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainHttpCodeData  DescribeDcdnDomainHttpCodeDataRequest
     * @return DescribeDcdnDomainHttpCodeDataResponse
     */
    CompletableFuture<DescribeDcdnDomainHttpCodeDataResponse> describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>You cannot query the distribution of HTTP status codes by IP protocol.</li>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the data that is collected within the last 24 hours is collected. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the data that is collected within the time range that you specify is collected.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainHttpCodeDataByLayer  DescribeDcdnDomainHttpCodeDataByLayerRequest
     * @return DescribeDcdnDomainHttpCodeDataByLayerResponse
     */
    CompletableFuture<DescribeDcdnDomainHttpCodeDataByLayerResponse> describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The bandwidth is measured in bit/s.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainIpaBpsData  DescribeDcdnDomainIpaBpsDataRequest
     * @return DescribeDcdnDomainIpaBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainIpaBpsDataResponse> describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainIpaConnData  DescribeDcdnDomainIpaConnDataRequest
     * @return DescribeDcdnDomainIpaConnDataResponse
     */
    CompletableFuture<DescribeDcdnDomainIpaConnDataResponse> describeDcdnDomainIpaConnData(DescribeDcdnDomainIpaConnDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</li>
     * <li>Unit: bytes.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainIpaTrafficData  DescribeDcdnDomainIpaTrafficDataRequest
     * @return DescribeDcdnDomainIpaTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainIpaTrafficDataResponse> describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If <strong>StartTime</strong> is set but <strong>EndTime</strong> is not set, the data within the hour that starts from <strong>StartTime</strong> is queried.</li>
     * <li>If <strong>EndTime</strong> is set but <strong>StartTime</strong> is not set, the data within the last hour that precedes <strong>EndTime</strong> is queried.</li>
     * <li>You can query data of a domain name or all domain names that belong to your account.</li>
     * <li>You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>.<ul>
     * <li><strong>If the time range is shorter than or equal to one hour</strong>, data is queried every minute.</li>
     * <li><strong>If the time range is longer than 1 hour but shorter than or equal to three days</strong>, data is queried every five minutes.</li>
     * <li><strong>If the time range is longer than three days but shorter than or equal to seven days</strong>, data is queried every hour.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainIspData  DescribeDcdnDomainIspDataRequest
     * @return DescribeDcdnDomainIspDataResponse
     */
    CompletableFuture<DescribeDcdnDomainIspDataResponse> describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.********</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainLog  DescribeDcdnDomainLogRequest
     * @return DescribeDcdnDomainLogResponse
     */
    CompletableFuture<DescribeDcdnDomainLogResponse> describeDcdnDomainLog(DescribeDcdnDomainLogRequest request);

    /**
     * @param request the request parameters of DescribeDcdnDomainLogExTtl  DescribeDcdnDomainLogExTtlRequest
     * @return DescribeDcdnDomainLogExTtlResponse
     */
    CompletableFuture<DescribeDcdnDomainLogExTtlResponse> describeDcdnDomainLogExTtl(DescribeDcdnDomainLogExTtlRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.</p>
     * <ul>
     * <li>You can specify one or more accelerated domain names. Separate domain names with commas (,).</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>The time range cannot exceed 1 hour.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainMultiUsageData  DescribeDcdnDomainMultiUsageDataRequest
     * @return DescribeDcdnDomainMultiUsageDataResponse
     */
    CompletableFuture<DescribeDcdnDomainMultiUsageDataResponse> describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainOriginBpsData  DescribeDcdnDomainOriginBpsDataRequest
     * @return DescribeDcdnDomainOriginBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainOriginBpsDataResponse> describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameters, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainOriginTrafficData  DescribeDcdnDomainOriginTrafficDataRequest
     * @return DescribeDcdnDomainOriginTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainOriginTrafficDataResponse> describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainProperty  DescribeDcdnDomainPropertyRequest
     * @return DescribeDcdnDomainPropertyResponse
     */
    CompletableFuture<DescribeDcdnDomainPropertyResponse> describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request);

    /**
     * @param request the request parameters of DescribeDcdnDomainPvData  DescribeDcdnDomainPvDataRequest
     * @return DescribeDcdnDomainPvDataResponse
     */
    CompletableFuture<DescribeDcdnDomainPvDataResponse> describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainQpsData  DescribeDcdnDomainQpsDataRequest
     * @return DescribeDcdnDomainQpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainQpsDataResponse> describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainQpsDataByLayer  DescribeDcdnDomainQpsDataByLayerRequest
     * @return DescribeDcdnDomainQpsDataByLayerResponse
     */
    CompletableFuture<DescribeDcdnDomainQpsDataByLayerResponse> describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last hour by default. If you specify both parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeBpsData  DescribeDcdnDomainRealTimeBpsDataRequest
     * @return DescribeDcdnDomainRealTimeBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeBpsDataResponse> describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeByteHitRateData  DescribeDcdnDomainRealTimeByteHitRateDataRequest
     * @return DescribeDcdnDomainRealTimeByteHitRateDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeByteHitRateDataResponse> describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeDetailData  DescribeDcdnDomainRealTimeDetailDataRequest
     * @return DescribeDcdnDomainRealTimeDetailDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeDetailDataResponse> describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeHttpCodeData  DescribeDcdnDomainRealTimeHttpCodeDataRequest
     * @return DescribeDcdnDomainRealTimeHttpCodeDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeHttpCodeDataResponse> describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeQpsData  DescribeDcdnDomainRealTimeQpsDataRequest
     * @return DescribeDcdnDomainRealTimeQpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeQpsDataResponse> describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per user.</p>
     * <ul>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.</li>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last hour. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong> The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeReqHitRateData  DescribeDcdnDomainRealTimeReqHitRateDataRequest
     * @return DescribeDcdnDomainRealTimeReqHitRateDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeReqHitRateDataResponse> describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeSrcBpsData  DescribeDcdnDomainRealTimeSrcBpsDataRequest
     * @return DescribeDcdnDomainRealTimeSrcBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcBpsDataResponse> describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeSrcHttpCodeData  DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest
     * @return DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse> describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeSrcTrafficData  DescribeDcdnDomainRealTimeSrcTrafficDataRequest
     * @return DescribeDcdnDomainRealTimeSrcTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcTrafficDataResponse> describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per user.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeDcdnDomainRealTimeTrafficData  DescribeDcdnDomainRealTimeTrafficDataRequest
     * @return DescribeDcdnDomainRealTimeTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRealTimeTrafficDataResponse> describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainRegionData  DescribeDcdnDomainRegionDataRequest
     * @return DescribeDcdnDomainRegionDataResponse
     */
    CompletableFuture<DescribeDcdnDomainRegionDataResponse> describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainStagingConfig  DescribeDcdnDomainStagingConfigRequest
     * @return DescribeDcdnDomainStagingConfigResponse
     */
    CompletableFuture<DescribeDcdnDomainStagingConfigResponse> describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime parameter, the data on the previous day is queried.</p>
     * <ul>
     * <li>You can specify only one domain name.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainTopReferVisit  DescribeDcdnDomainTopReferVisitRequest
     * @return DescribeDcdnDomainTopReferVisitResponse
     */
    CompletableFuture<DescribeDcdnDomainTopReferVisitResponse> describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query data in the last seven days.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnDomainTopUrlVisit  DescribeDcdnDomainTopUrlVisitRequest
     * @return DescribeDcdnDomainTopUrlVisitResponse
     */
    CompletableFuture<DescribeDcdnDomainTopUrlVisitResponse> describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainTrafficData  DescribeDcdnDomainTrafficDataRequest
     * @return DescribeDcdnDomainTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainTrafficDataResponse> describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainUsageData  DescribeDcdnDomainUsageDataRequest
     * @return DescribeDcdnDomainUsageDataResponse
     */
    CompletableFuture<DescribeDcdnDomainUsageDataResponse> describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainUvData  DescribeDcdnDomainUvDataRequest
     * @return DescribeDcdnDomainUvDataResponse
     */
    CompletableFuture<DescribeDcdnDomainUvDataResponse> describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainWebsocketBpsData  DescribeDcdnDomainWebsocketBpsDataRequest
     * @return DescribeDcdnDomainWebsocketBpsDataResponse
     */
    CompletableFuture<DescribeDcdnDomainWebsocketBpsDataResponse> describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeDcdnDomainWebsocketHttpCodeData  DescribeDcdnDomainWebsocketHttpCodeDataRequest
     * @return DescribeDcdnDomainWebsocketHttpCodeDataResponse
     */
    CompletableFuture<DescribeDcdnDomainWebsocketHttpCodeDataResponse> describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the last 24 hours. If you set both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnDomainWebsocketTrafficData  DescribeDcdnDomainWebsocketTrafficDataRequest
     * @return DescribeDcdnDomainWebsocketTrafficDataResponse
     */
    CompletableFuture<DescribeDcdnDomainWebsocketTrafficDataResponse> describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request);

    /**
     * @param request the request parameters of DescribeDcdnDomainsBySource  DescribeDcdnDomainsBySourceRequest
     * @return DescribeDcdnDomainsBySourceResponse
     */
    CompletableFuture<DescribeDcdnDomainsBySourceResponse> describeDcdnDomainsBySource(DescribeDcdnDomainsBySourceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnErUsageData  DescribeDcdnErUsageDataRequest
     * @return DescribeDcdnErUsageDataResponse
     */
    CompletableFuture<DescribeDcdnErUsageDataResponse> describeDcdnErUsageData(DescribeDcdnErUsageDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>If you specify IP addresses or CIDR blocks, IP addresses that are effective and the corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.</li>
     * <li>The results are written to OSS and returned as OSS URLs. The content in OSS objects is in the format of <code>IP address-Corresponding expiration time</code>. The expiration time is in the YYYY-MM-DD hh:mm:ss format.</li>
     * <li>You can share OSS URLs with others. The shared URLs are valid for three days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnFullDomainsBlockIPConfig  DescribeDcdnFullDomainsBlockIPConfigRequest
     * @return DescribeDcdnFullDomainsBlockIPConfigResponse
     */
    CompletableFuture<DescribeDcdnFullDomainsBlockIPConfigResponse> describeDcdnFullDomainsBlockIPConfig(DescribeDcdnFullDomainsBlockIPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.</p>
     * <ul>
     * <li>If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.</li>
     * <li>The maximum time range to query is 90 days.</li>
     * <li>If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnFullDomainsBlockIPHistory  DescribeDcdnFullDomainsBlockIPHistoryRequest
     * @return DescribeDcdnFullDomainsBlockIPHistoryResponse
     */
    CompletableFuture<DescribeDcdnFullDomainsBlockIPHistoryResponse> describeDcdnFullDomainsBlockIPHistory(DescribeDcdnFullDomainsBlockIPHistoryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnHttpsDomainList  DescribeDcdnHttpsDomainListRequest
     * @return DescribeDcdnHttpsDomainListResponse
     */
    CompletableFuture<DescribeDcdnHttpsDomainListResponse> describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnIpInfo  DescribeDcdnIpInfoRequest
     * @return DescribeDcdnIpInfoResponse
     */
    CompletableFuture<DescribeDcdnIpInfoResponse> describeDcdnIpInfo(DescribeDcdnIpInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation can be called globally up to 50 times per second. This operation can be called up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnIpaDomainCidr  DescribeDcdnIpaDomainCidrRequest
     * @return DescribeDcdnIpaDomainCidrResponse
     */
    CompletableFuture<DescribeDcdnIpaDomainCidrResponse> describeDcdnIpaDomainCidr(DescribeDcdnIpaDomainCidrRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnIpaDomainConfigs  DescribeDcdnIpaDomainConfigsRequest
     * @return DescribeDcdnIpaDomainConfigsResponse
     */
    CompletableFuture<DescribeDcdnIpaDomainConfigsResponse> describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnIpaDomainDetail  DescribeDcdnIpaDomainDetailRequest
     * @return DescribeDcdnIpaDomainDetailResponse
     */
    CompletableFuture<DescribeDcdnIpaDomainDetailResponse> describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnIpaService  DescribeDcdnIpaServiceRequest
     * @return DescribeDcdnIpaServiceResponse
     */
    CompletableFuture<DescribeDcdnIpaServiceResponse> describeDcdnIpaService(DescribeDcdnIpaServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnIpaUserDomains  DescribeDcdnIpaUserDomainsRequest
     * @return DescribeDcdnIpaUserDomainsResponse
     */
    CompletableFuture<DescribeDcdnIpaUserDomainsResponse> describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request);

    /**
     * @param request the request parameters of DescribeDcdnKvAccount  DescribeDcdnKvAccountRequest
     * @return DescribeDcdnKvAccountResponse
     */
    CompletableFuture<DescribeDcdnKvAccountResponse> describeDcdnKvAccount(DescribeDcdnKvAccountRequest request);

    /**
     * @param request the request parameters of DescribeDcdnKvAccountStatus  DescribeDcdnKvAccountStatusRequest
     * @return DescribeDcdnKvAccountStatusResponse
     */
    CompletableFuture<DescribeDcdnKvAccountStatusResponse> describeDcdnKvAccountStatus(DescribeDcdnKvAccountStatusRequest request);

    /**
     * @param request the request parameters of DescribeDcdnKvNamespace  DescribeDcdnKvNamespaceRequest
     * @return DescribeDcdnKvNamespaceResponse
     */
    CompletableFuture<DescribeDcdnKvNamespaceResponse> describeDcdnKvNamespace(DescribeDcdnKvNamespaceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To use this operation, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnL2Ips  DescribeDcdnL2IpsRequest
     * @return DescribeDcdnL2IpsResponse
     */
    CompletableFuture<DescribeDcdnL2IpsResponse> describeDcdnL2Ips(DescribeDcdnL2IpsRequest request);

    /**
     * @param request the request parameters of DescribeDcdnL2Vips  DescribeDcdnL2VipsRequest
     * @return DescribeDcdnL2VipsResponse
     */
    CompletableFuture<DescribeDcdnL2VipsResponse> describeDcdnL2Vips(DescribeDcdnL2VipsRequest request);

    /**
     * @param request the request parameters of DescribeDcdnOriginSiteHealthStatus  DescribeDcdnOriginSiteHealthStatusRequest
     * @return DescribeDcdnOriginSiteHealthStatusResponse
     */
    CompletableFuture<DescribeDcdnOriginSiteHealthStatusResponse> describeDcdnOriginSiteHealthStatus(DescribeDcdnOriginSiteHealthStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnRealTimeDeliveryField  DescribeDcdnRealTimeDeliveryFieldRequest
     * @return DescribeDcdnRealTimeDeliveryFieldResponse
     */
    CompletableFuture<DescribeDcdnRealTimeDeliveryFieldResponse> describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call the <strong>RefreshDcdnObjectCaches</strong> operation to refresh content and call the <strong>PreloadDcdnObjectCaches</strong> operation to prefetch content.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnRefreshQuota  DescribeDcdnRefreshQuotaRequest
     * @return DescribeDcdnRefreshQuotaResponse
     */
    CompletableFuture<DescribeDcdnRefreshQuotaResponse> describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can query data within the last three days.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnRefreshTaskById  DescribeDcdnRefreshTaskByIdRequest
     * @return DescribeDcdnRefreshTaskByIdResponse
     */
    CompletableFuture<DescribeDcdnRefreshTaskByIdResponse> describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query the refresh or prefetch tasks by ID or URL.</p>
     * <ul>
     * <li>You can set both <strong>TaskId</strong> and <strong>ObjectPath</strong> in a request. If you do not set <strong>TaskId</strong> or <strong>ObjectPath</strong>, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.</li>
     * <li>If you specify <strong>DomainName</strong> or <strong>Status</strong>, you must also specify <strong>ObjectType</strong>.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnRefreshTasks  DescribeDcdnRefreshTasksRequest
     * @return DescribeDcdnRefreshTasksResponse
     */
    CompletableFuture<DescribeDcdnRefreshTasksResponse> describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnRegionAndIsp  DescribeDcdnRegionAndIspRequest
     * @return DescribeDcdnRegionAndIspResponse
     */
    CompletableFuture<DescribeDcdnRegionAndIspResponse> describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnReport  DescribeDcdnReportRequest
     * @return DescribeDcdnReportResponse
     */
    CompletableFuture<DescribeDcdnReportResponse> describeDcdnReport(DescribeDcdnReportRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</li>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnReportList  DescribeDcdnReportListRequest
     * @return DescribeDcdnReportListResponse
     */
    CompletableFuture<DescribeDcdnReportListResponse> describeDcdnReportList(DescribeDcdnReportListRequest request);

    /**
     * @param request the request parameters of DescribeDcdnSLSRealTimeLogType  DescribeDcdnSLSRealTimeLogTypeRequest
     * @return DescribeDcdnSLSRealTimeLogTypeResponse
     */
    CompletableFuture<DescribeDcdnSLSRealTimeLogTypeResponse> describeDcdnSLSRealTimeLogType(DescribeDcdnSLSRealTimeLogTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSLSRealtimeLogDelivery  DescribeDcdnSLSRealtimeLogDeliveryRequest
     * @return DescribeDcdnSLSRealtimeLogDeliveryResponse
     */
    CompletableFuture<DescribeDcdnSLSRealtimeLogDeliveryResponse> describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSMCertificateDetail  DescribeDcdnSMCertificateDetailRequest
     * @return DescribeDcdnSMCertificateDetailResponse
     */
    CompletableFuture<DescribeDcdnSMCertificateDetailResponse> describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSMCertificateList  DescribeDcdnSMCertificateListRequest
     * @return DescribeDcdnSMCertificateListResponse
     */
    CompletableFuture<DescribeDcdnSMCertificateListResponse> describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeDcdnSSLCertificateList  DescribeDcdnSSLCertificateListRequest
     * @return DescribeDcdnSSLCertificateListResponse
     */
    CompletableFuture<DescribeDcdnSSLCertificateListResponse> describeDcdnSSLCertificateList(DescribeDcdnSSLCertificateListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSecFuncInfo  DescribeDcdnSecFuncInfoRequest
     * @return DescribeDcdnSecFuncInfoResponse
     */
    CompletableFuture<DescribeDcdnSecFuncInfoResponse> describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSecSpecInfo  DescribeDcdnSecSpecInfoRequest
     * @return DescribeDcdnSecSpecInfoResponse
     */
    CompletableFuture<DescribeDcdnSecSpecInfoResponse> describeDcdnSecSpecInfo(DescribeDcdnSecSpecInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnService  DescribeDcdnServiceRequest
     * @return DescribeDcdnServiceResponse
     */
    CompletableFuture<DescribeDcdnServiceResponse> describeDcdnService(DescribeDcdnServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnStagingIp  DescribeDcdnStagingIpRequest
     * @return DescribeDcdnStagingIpResponse
     */
    CompletableFuture<DescribeDcdnStagingIpResponse> describeDcdnStagingIp(DescribeDcdnStagingIpRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</li>
     * <li>You can call this API operation up to three times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnSubList  DescribeDcdnSubListRequest
     * @return DescribeDcdnSubListResponse
     */
    CompletableFuture<DescribeDcdnSubListResponse> describeDcdnSubList(DescribeDcdnSubListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnTagResources  DescribeDcdnTagResourcesRequest
     * @return DescribeDcdnTagResourcesResponse
     */
    CompletableFuture<DescribeDcdnTagResourcesResponse> describeDcdnTagResources(DescribeDcdnTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not specify the StartTime and EndTime parameters, the data within the current month is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.</p>
     * 
     * @param request the request parameters of DescribeDcdnTopDomainsByFlow  DescribeDcdnTopDomainsByFlowRequest
     * @return DescribeDcdnTopDomainsByFlowResponse
     */
    CompletableFuture<DescribeDcdnTopDomainsByFlowResponse> describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserBillHistory  DescribeDcdnUserBillHistoryRequest
     * @return DescribeDcdnUserBillHistoryResponse
     */
    CompletableFuture<DescribeDcdnUserBillHistoryResponse> describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request);

    /**
     * @param request the request parameters of DescribeDcdnUserBillType  DescribeDcdnUserBillTypeRequest
     * @return DescribeDcdnUserBillTypeResponse
     */
    CompletableFuture<DescribeDcdnUserBillTypeResponse> describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnUserCertificateExpireCount  DescribeDcdnUserCertificateExpireCountRequest
     * @return DescribeDcdnUserCertificateExpireCountResponse
     */
    CompletableFuture<DescribeDcdnUserCertificateExpireCountResponse> describeDcdnUserCertificateExpireCount(DescribeDcdnUserCertificateExpireCountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnUserConfigs  DescribeDcdnUserConfigsRequest
     * @return DescribeDcdnUserConfigsResponse
     */
    CompletableFuture<DescribeDcdnUserConfigsResponse> describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 80 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserDomains  DescribeDcdnUserDomainsRequest
     * @return DescribeDcdnUserDomainsResponse
     */
    CompletableFuture<DescribeDcdnUserDomainsResponse> describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserDomainsByFunc  DescribeDcdnUserDomainsByFuncRequest
     * @return DescribeDcdnUserDomainsByFuncResponse
     */
    CompletableFuture<DescribeDcdnUserDomainsByFuncResponse> describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserQuota  DescribeDcdnUserQuotaRequest
     * @return DescribeDcdnUserQuotaResponse
     */
    CompletableFuture<DescribeDcdnUserQuotaResponse> describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserRealTimeDeliveryField  DescribeDcdnUserRealTimeDeliveryFieldRequest
     * @return DescribeDcdnUserRealTimeDeliveryFieldResponse
     */
    CompletableFuture<DescribeDcdnUserRealTimeDeliveryFieldResponse> describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request);

    /**
     * <b>description</b> :
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * 
     * @param request the request parameters of DescribeDcdnUserResourcePackage  DescribeDcdnUserResourcePackageRequest
     * @return DescribeDcdnUserResourcePackageResponse
     */
    CompletableFuture<DescribeDcdnUserResourcePackageResponse> describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserSecDrop  DescribeDcdnUserSecDropRequest
     * @return DescribeDcdnUserSecDropResponse
     */
    CompletableFuture<DescribeDcdnUserSecDropResponse> describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserSecDropByMinute  DescribeDcdnUserSecDropByMinuteRequest
     * @return DescribeDcdnUserSecDropByMinuteResponse
     */
    CompletableFuture<DescribeDcdnUserSecDropByMinuteResponse> describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserTags  DescribeDcdnUserTagsRequest
     * @return DescribeDcdnUserTagsResponse
     */
    CompletableFuture<DescribeDcdnUserTagsResponse> describeDcdnUserTags(DescribeDcdnUserTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnUserVipsByDomain  DescribeDcdnUserVipsByDomainRequest
     * @return DescribeDcdnUserVipsByDomainResponse
     */
    CompletableFuture<DescribeDcdnUserVipsByDomainResponse> describeDcdnUserVipsByDomain(DescribeDcdnUserVipsByDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnVerifyContent  DescribeDcdnVerifyContentRequest
     * @return DescribeDcdnVerifyContentResponse
     */
    CompletableFuture<DescribeDcdnVerifyContentResponse> describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request);

    /**
     * @param request the request parameters of DescribeDcdnWafBotAppKey  DescribeDcdnWafBotAppKeyRequest
     * @return DescribeDcdnWafBotAppKeyResponse
     */
    CompletableFuture<DescribeDcdnWafBotAppKeyResponse> describeDcdnWafBotAppKey(DescribeDcdnWafBotAppKeyRequest request);

    /**
     * @param request the request parameters of DescribeDcdnWafDefaultRules  DescribeDcdnWafDefaultRulesRequest
     * @return DescribeDcdnWafDefaultRulesResponse
     */
    CompletableFuture<DescribeDcdnWafDefaultRulesResponse> describeDcdnWafDefaultRules(DescribeDcdnWafDefaultRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnWafDomain  DescribeDcdnWafDomainRequest
     * @return DescribeDcdnWafDomainResponse
     */
    CompletableFuture<DescribeDcdnWafDomainResponse> describeDcdnWafDomain(DescribeDcdnWafDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafDomainDetail  DescribeDcdnWafDomainDetailRequest
     * @return DescribeDcdnWafDomainDetailResponse
     */
    CompletableFuture<DescribeDcdnWafDomainDetailResponse> describeDcdnWafDomainDetail(DescribeDcdnWafDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafDomains  DescribeDcdnWafDomainsRequest
     * @return DescribeDcdnWafDomainsResponse
     */
    CompletableFuture<DescribeDcdnWafDomainsResponse> describeDcdnWafDomains(DescribeDcdnWafDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafFilterInfo  DescribeDcdnWafFilterInfoRequest
     * @return DescribeDcdnWafFilterInfoResponse
     */
    CompletableFuture<DescribeDcdnWafFilterInfoResponse> describeDcdnWafFilterInfo(DescribeDcdnWafFilterInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnWafGeoInfo  DescribeDcdnWafGeoInfoRequest
     * @return DescribeDcdnWafGeoInfoResponse
     */
    CompletableFuture<DescribeDcdnWafGeoInfoResponse> describeDcdnWafGeoInfo(DescribeDcdnWafGeoInfoRequest request);

    /**
     * @param request the request parameters of DescribeDcdnWafGroup  DescribeDcdnWafGroupRequest
     * @return DescribeDcdnWafGroupResponse
     */
    CompletableFuture<DescribeDcdnWafGroupResponse> describeDcdnWafGroup(DescribeDcdnWafGroupRequest request);

    /**
     * @param request the request parameters of DescribeDcdnWafGroups  DescribeDcdnWafGroupsRequest
     * @return DescribeDcdnWafGroupsResponse
     */
    CompletableFuture<DescribeDcdnWafGroupsResponse> describeDcdnWafGroups(DescribeDcdnWafGroupsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnWafLogs  DescribeDcdnWafLogsRequest
     * @return DescribeDcdnWafLogsResponse
     */
    CompletableFuture<DescribeDcdnWafLogsResponse> describeDcdnWafLogs(DescribeDcdnWafLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafPolicies  DescribeDcdnWafPoliciesRequest
     * @return DescribeDcdnWafPoliciesResponse
     */
    CompletableFuture<DescribeDcdnWafPoliciesResponse> describeDcdnWafPolicies(DescribeDcdnWafPoliciesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnWafPolicy  DescribeDcdnWafPolicyRequest
     * @return DescribeDcdnWafPolicyResponse
     */
    CompletableFuture<DescribeDcdnWafPolicyResponse> describeDcdnWafPolicy(DescribeDcdnWafPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafPolicyDomains  DescribeDcdnWafPolicyDomainsRequest
     * @return DescribeDcdnWafPolicyDomainsResponse
     */
    CompletableFuture<DescribeDcdnWafPolicyDomainsResponse> describeDcdnWafPolicyDomains(DescribeDcdnWafPolicyDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafPolicyValidDomains  DescribeDcdnWafPolicyValidDomainsRequest
     * @return DescribeDcdnWafPolicyValidDomainsResponse
     */
    CompletableFuture<DescribeDcdnWafPolicyValidDomainsResponse> describeDcdnWafPolicyValidDomains(DescribeDcdnWafPolicyValidDomainsRequest request);

    /**
     * <b>description</b> :
     * <h1></h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafRule  DescribeDcdnWafRuleRequest
     * @return DescribeDcdnWafRuleResponse
     */
    CompletableFuture<DescribeDcdnWafRuleResponse> describeDcdnWafRule(DescribeDcdnWafRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafRules  DescribeDcdnWafRulesRequest
     * @return DescribeDcdnWafRulesResponse
     */
    CompletableFuture<DescribeDcdnWafRulesResponse> describeDcdnWafRules(DescribeDcdnWafRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafScenes  DescribeDcdnWafScenesRequest
     * @return DescribeDcdnWafScenesResponse
     */
    CompletableFuture<DescribeDcdnWafScenesResponse> describeDcdnWafScenes(DescribeDcdnWafScenesRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafService  DescribeDcdnWafServiceRequest
     * @return DescribeDcdnWafServiceResponse
     */
    CompletableFuture<DescribeDcdnWafServiceResponse> describeDcdnWafService(DescribeDcdnWafServiceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDcdnWafSpecInfo  DescribeDcdnWafSpecInfoRequest
     * @return DescribeDcdnWafSpecInfoResponse
     */
    CompletableFuture<DescribeDcdnWafSpecInfoResponse> describeDcdnWafSpecInfo(DescribeDcdnWafSpecInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDcdnWafUsageData  DescribeDcdnWafUsageDataRequest
     * @return DescribeDcdnWafUsageDataResponse
     */
    CompletableFuture<DescribeDcdnWafUsageDataResponse> describeDcdnWafUsageData(DescribeDcdnWafUsageDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDcdnsecService  DescribeDcdnsecServiceRequest
     * @return DescribeDcdnsecServiceResponse
     */
    CompletableFuture<DescribeDcdnsecServiceResponse> describeDcdnsecService(DescribeDcdnsecServiceRequest request);

    /**
     * @param request the request parameters of DescribeDdosAllEventList  DescribeDdosAllEventListRequest
     * @return DescribeDdosAllEventListResponse
     */
    CompletableFuture<DescribeDdosAllEventListResponse> describeDdosAllEventList(DescribeDdosAllEventListRequest request);

    /**
     * @param request the request parameters of DescribeEncryptRoutineUid  DescribeEncryptRoutineUidRequest
     * @return DescribeEncryptRoutineUidResponse
     */
    CompletableFuture<DescribeEncryptRoutineUidResponse> describeEncryptRoutineUid(DescribeEncryptRoutineUidRequest request);

    /**
     * @param request the request parameters of DescribeHighlightInfo  DescribeHighlightInfoRequest
     * @return DescribeHighlightInfoResponse
     */
    CompletableFuture<DescribeHighlightInfoResponse> describeHighlightInfo(DescribeHighlightInfoRequest request);

    /**
     * <b>description</b> :
     * <p><em>Note</em>** You can call this operation up to 5 times per second per account.</p>
     * <ul>
     * <li>The usage data indicates the number of requests.
     * <strong>Time granularity:</strong> This operation supports only the time granularity of 1 hour.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range to query</th>
     * <th>Historical data available</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>90 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeKvUsageData  DescribeKvUsageDataRequest
     * @return DescribeKvUsageDataResponse
     */
    CompletableFuture<DescribeKvUsageDataResponse> describeKvUsageData(DescribeKvUsageDataRequest request);

    /**
     * @param request the request parameters of DescribeRDDomainConfig  DescribeRDDomainConfigRequest
     * @return DescribeRDDomainConfigResponse
     */
    CompletableFuture<DescribeRDDomainConfigResponse> describeRDDomainConfig(DescribeRDDomainConfigRequest request);

    /**
     * <b>description</b> :
     * <p>A domain name can be in one of the following states:</p>
     * <ul>
     * <li>online</li>
     * <li>offline</li>
     * <li>configuring</li>
     * <li>configure_failed</li>
     * <li>checking</li>
     * <li>check_failed</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRDDomains  DescribeRDDomainsRequest
     * @return DescribeRDDomainsResponse
     */
    CompletableFuture<DescribeRDDomainsResponse> describeRDDomains(DescribeRDDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoutine  DescribeRoutineRequest
     * @return DescribeRoutineResponse
     */
    CompletableFuture<DescribeRoutineResponse> describeRoutine(DescribeRoutineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoutineCanaryEnvs  DescribeRoutineCanaryEnvsRequest
     * @return DescribeRoutineCanaryEnvsResponse
     */
    CompletableFuture<DescribeRoutineCanaryEnvsResponse> describeRoutineCanaryEnvs(DescribeRoutineCanaryEnvsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoutineCodeRevision  DescribeRoutineCodeRevisionRequest
     * @return DescribeRoutineCodeRevisionResponse
     */
    CompletableFuture<DescribeRoutineCodeRevisionResponse> describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request);

    /**
     * @param request the request parameters of DescribeRoutineRelatedDomains  DescribeRoutineRelatedDomainsRequest
     * @return DescribeRoutineRelatedDomainsResponse
     */
    CompletableFuture<DescribeRoutineRelatedDomainsResponse> describeRoutineRelatedDomains(DescribeRoutineRelatedDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoutineSpec  DescribeRoutineSpecRequest
     * @return DescribeRoutineSpecResponse
     */
    CompletableFuture<DescribeRoutineSpecResponse> describeRoutineSpec(DescribeRoutineSpecRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoutineUserInfo  DescribeRoutineUserInfoRequest
     * @return DescribeRoutineUserInfoResponse
     */
    CompletableFuture<DescribeRoutineUserInfoResponse> describeRoutineUserInfo(DescribeRoutineUserInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**The maximum number of times that each user can call this operation per second is 20.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserDcdnIpaStatus  DescribeUserDcdnIpaStatusRequest
     * @return DescribeUserDcdnIpaStatusResponse
     */
    CompletableFuture<DescribeUserDcdnIpaStatusResponse> describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserDcdnStatus  DescribeUserDcdnStatusRequest
     * @return DescribeUserDcdnStatusResponse
     */
    CompletableFuture<DescribeUserDcdnStatusResponse> describeUserDcdnStatus(DescribeUserDcdnStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserErStatus  DescribeUserErStatusRequest
     * @return DescribeUserErStatusResponse
     */
    CompletableFuture<DescribeUserErStatusResponse> describeUserErStatus(DescribeUserErStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserLogserviceStatus  DescribeUserLogserviceStatusRequest
     * @return DescribeUserLogserviceStatusResponse
     */
    CompletableFuture<DescribeUserLogserviceStatusResponse> describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation modifies only the specified configurations. Other configurations remain unchanged.</li>
     * <li>If you want to delete a setting, delete the parameter value.</li>
     * <li>This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.</li>
     * <li>Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:<ul>
     * <li>Outside China: presetCanaryOverseas.</li>
     * <li>In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.</li>
     * </ul>
     * </li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of EditRoutineConf  EditRoutineConfRequest
     * @return EditRoutineConfResponse
     */
    CompletableFuture<EditRoutineConfResponse> editRoutineConf(EditRoutineConfRequest request);

    /**
     * @param request the request parameters of GetDcdnKv  GetDcdnKvRequest
     * @return GetDcdnKvResponse
     */
    CompletableFuture<GetDcdnKvResponse> getDcdnKv(GetDcdnKvRequest request);

    /**
     * @param request the request parameters of GetDcdnKvDetail  GetDcdnKvDetailRequest
     * @return GetDcdnKvDetailResponse
     */
    CompletableFuture<GetDcdnKvDetailResponse> getDcdnKvDetail(GetDcdnKvDetailRequest request);

    /**
     * @param request the request parameters of GetDcdnKvStatus  GetDcdnKvStatusRequest
     * @return GetDcdnKvStatusResponse
     */
    CompletableFuture<GetDcdnKvStatusResponse> getDcdnKvStatus(GetDcdnKvStatusRequest request);

    /**
     * @param request the request parameters of ListDcdnKv  ListDcdnKvRequest
     * @return ListDcdnKvResponse
     */
    CompletableFuture<ListDcdnKvResponse> listDcdnKv(ListDcdnKvRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDcdnRealTimeDeliveryProject  ListDcdnRealTimeDeliveryProjectRequest
     * @return ListDcdnRealTimeDeliveryProjectResponse
     */
    CompletableFuture<ListDcdnRealTimeDeliveryProjectResponse> listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDCdnDomainSchdmByProperty  ModifyDCdnDomainSchdmByPropertyRequest
     * @return ModifyDCdnDomainSchdmByPropertyResponse
     */
    CompletableFuture<ModifyDCdnDomainSchdmByPropertyResponse> modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request);

    /**
     * @param request the request parameters of ModifyDcdnWafGroup  ModifyDcdnWafGroupRequest
     * @return ModifyDcdnWafGroupResponse
     */
    CompletableFuture<ModifyDcdnWafGroupResponse> modifyDcdnWafGroup(ModifyDcdnWafGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDcdnWafPolicy  ModifyDcdnWafPolicyRequest
     * @return ModifyDcdnWafPolicyResponse
     */
    CompletableFuture<ModifyDcdnWafPolicyResponse> modifyDcdnWafPolicy(ModifyDcdnWafPolicyRequest request);

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * <li>Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDcdnWafPolicyDomains  ModifyDcdnWafPolicyDomainsRequest
     * @return ModifyDcdnWafPolicyDomainsResponse
     */
    CompletableFuture<ModifyDcdnWafPolicyDomainsResponse> modifyDcdnWafPolicyDomains(ModifyDcdnWafPolicyDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.</li>
     * <li>You must configure at least one of the <strong>RuleStatus</strong>, <strong>RuleName</strong> and <strong>RuleConfig</strong> parameters.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDcdnWafRule  ModifyDcdnWafRuleRequest
     * @return ModifyDcdnWafRuleResponse
     */
    CompletableFuture<ModifyDcdnWafRuleResponse> modifyDcdnWafRule(ModifyDcdnWafRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.</li>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenDcdnService  OpenDcdnServiceRequest
     * @return OpenDcdnServiceResponse
     */
    CompletableFuture<OpenDcdnServiceResponse> openDcdnService(OpenDcdnServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</p>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify up to 100 URLs to prefetch.</li>
     * <li>The prefetch queue of each Alibaba Cloud account can contain up to 100,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.</li>
     * <li>You can call this operation up to 15 times per second per account.</li>
     * </ul>
     * <h2>Description</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of PreloadDcdnObjectCaches  PreloadDcdnObjectCachesRequest
     * @return PreloadDcdnObjectCachesResponse
     */
    CompletableFuture<PreloadDcdnObjectCachesResponse> preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PublishDcdnStagingConfigToProduction  PublishDcdnStagingConfigToProductionRequest
     * @return PublishDcdnStagingConfigToProductionResponse
     */
    CompletableFuture<PublishDcdnStagingConfigToProductionResponse> publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PublishRoutineCodeRevision  PublishRoutineCodeRevisionRequest
     * @return PublishRoutineCodeRevisionResponse
     */
    CompletableFuture<PublishRoutineCodeRevisionResponse> publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request);

    /**
     * @param request the request parameters of PutDcdnKv  PutDcdnKvRequest
     * @return PutDcdnKvResponse
     */
    CompletableFuture<PutDcdnKvResponse> putDcdnKv(PutDcdnKvRequest request);

    /**
     * @param request the request parameters of PutDcdnKvNamespace  PutDcdnKvNamespaceRequest
     * @return PutDcdnKvNamespaceResponse
     */
    CompletableFuture<PutDcdnKvNamespaceResponse> putDcdnKvNamespace(PutDcdnKvNamespaceRequest request);

    /**
     * @param request the request parameters of PutDcdnKvWithHighCapacity  PutDcdnKvWithHighCapacityRequest
     * @return PutDcdnKvWithHighCapacityResponse
     */
    CompletableFuture<PutDcdnKvWithHighCapacityResponse> putDcdnKvWithHighCapacity(PutDcdnKvWithHighCapacityRequest request);

    /**
     * @param request the request parameters of RefreshDcdnObjectCacheByCacheTag  RefreshDcdnObjectCacheByCacheTagRequest
     * @return RefreshDcdnObjectCacheByCacheTagResponse
     */
    CompletableFuture<RefreshDcdnObjectCacheByCacheTagResponse> refreshDcdnObjectCacheByCacheTag(RefreshDcdnObjectCacheByCacheTagRequest request);

    /**
     * <b>description</b> :
     * <p>  Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to purge content and call the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maximum of 10,000 URLs and 100 directories including subdirectories per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 200 Mbit/s, <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud determines whether to approve your application based on your workloads.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * <h4><a href="#"></a>Precautions</h4>
     * <ul>
     * <li>After a purge task is completed, your resources that are cached on points of presence (POPs) are removed. When a POP receives a request for your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on POPs. If you frequently run purge tasks, more requests are redirected to the origin server for resources. This results in high bandwidth costs and more loads on the origin server.</li>
     * <li>A purge task takes effect 5 to 6 minutes after being submitted. If the resource you want to purge has a TTL of less than 5 minutes, you wait for it to expire instead of manually running a purge task.</li>
     * <li>To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/445051.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshDcdnObjectCaches  RefreshDcdnObjectCachesRequest
     * @return RefreshDcdnObjectCachesResponse
     */
    CompletableFuture<RefreshDcdnObjectCachesResponse> refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.</li>
     * <li>Related operation: <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a>.</li>
     * <li>By default, each Alibaba Cloud account can purge content from a maxim&gt; um of 10,000 URLs and 100 directories including subdirectories per day.</li>
     * <li>You can specify up to 1,000 URLs or 100 directories that you want to purge in each request.</li>
     * <li>You can specify up to 1,000 URLs that you want to purge per minute for each domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of RefreshErObjectCaches  RefreshErObjectCachesRequest
     * @return RefreshErObjectCachesResponse
     */
    CompletableFuture<RefreshErObjectCachesResponse> refreshErObjectCaches(RefreshErObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RollbackDcdnStagingConfig  RollbackDcdnStagingConfigRequest
     * @return RollbackDcdnStagingConfigResponse
     */
    CompletableFuture<RollbackDcdnStagingConfigResponse> rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request);

    /**
     * @param request the request parameters of SetDcdnDomainCSRCertificate  SetDcdnDomainCSRCertificateRequest
     * @return SetDcdnDomainCSRCertificateResponse
     */
    CompletableFuture<SetDcdnDomainCSRCertificateResponse> setDcdnDomainCSRCertificate(SetDcdnDomainCSRCertificateRequest request);

    /**
     * @deprecated OpenAPI SetDcdnDomainCertificate is deprecated, please use dcdn::2018-01-15::SetDcdnDomainSSLCertificate instead.  * @description > You can call this operation up to 30 times per second per account.
     * 
     * @param request the request parameters of SetDcdnDomainCertificate  SetDcdnDomainCertificateRequest
     * @return SetDcdnDomainCertificateResponse
     */
    @Deprecated
    CompletableFuture<SetDcdnDomainCertificateResponse> setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDcdnDomainSMCertificate  SetDcdnDomainSMCertificateRequest
     * @return SetDcdnDomainSMCertificateResponse
     */
    CompletableFuture<SetDcdnDomainSMCertificateResponse> setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request);

    /**
     * @param request the request parameters of SetDcdnDomainSSLCertificate  SetDcdnDomainSSLCertificateRequest
     * @return SetDcdnDomainSSLCertificateResponse
     */
    CompletableFuture<SetDcdnDomainSSLCertificateResponse> setDcdnDomainSSLCertificate(SetDcdnDomainSSLCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDcdnDomainStagingConfig  SetDcdnDomainStagingConfigRequest
     * @return SetDcdnDomainStagingConfigResponse
     */
    CompletableFuture<SetDcdnDomainStagingConfigResponse> setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to block or unblock a large number of IP addresses or CIDR blocks. You can block or unblock up to 1,000 IP addresses or CIDR blocks in a request.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDcdnFullDomainsBlockIP  SetDcdnFullDomainsBlockIPRequest
     * @return SetDcdnFullDomainsBlockIPResponse
     */
    CompletableFuture<SetDcdnFullDomainsBlockIPResponse> setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDcdnUserConfig  SetDcdnUserConfigRequest
     * @return SetDcdnUserConfigResponse
     */
    CompletableFuture<SetDcdnUserConfigResponse> setDcdnUserConfig(SetDcdnUserConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of SetRoutineSubdomain  SetRoutineSubdomainRequest
     * @return SetRoutineSubdomainResponse
     */
    CompletableFuture<SetRoutineSubdomainResponse> setRoutineSubdomain(SetRoutineSubdomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDcdnDomain  StartDcdnDomainRequest
     * @return StartDcdnDomainResponse
     */
    CompletableFuture<StartDcdnDomainResponse> startDcdnDomain(StartDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDcdnIpaDomain  StartDcdnIpaDomainRequest
     * @return StartDcdnIpaDomainResponse
     */
    CompletableFuture<StartDcdnIpaDomainResponse> startDcdnIpaDomain(StartDcdnIpaDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>After an accelerated domain is disabled, Dynamic Content Delivery Network (DCDN) retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDcdnDomain  StopDcdnDomainRequest
     * @return StopDcdnDomainResponse
     */
    CompletableFuture<StopDcdnDomainResponse> stopDcdnDomain(StopDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDcdnIpaDomain  StopDcdnIpaDomainRequest
     * @return StopDcdnIpaDomainResponse
     */
    CompletableFuture<StopDcdnIpaDomainResponse> stopDcdnIpaDomain(StopDcdnIpaDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TagDcdnResources  TagDcdnResourcesRequest
     * @return TagDcdnResourcesResponse
     */
    CompletableFuture<TagDcdnResourcesResponse> tagDcdnResources(TagDcdnResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagDcdnResources  UntagDcdnResourcesRequest
     * @return UntagDcdnResourcesResponse
     */
    CompletableFuture<UntagDcdnResourcesResponse> untagDcdnResources(UntagDcdnResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnDeliverTask  UpdateDcdnDeliverTaskRequest
     * @return UpdateDcdnDeliverTaskResponse
     */
    CompletableFuture<UpdateDcdnDeliverTaskResponse> updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnDomain  UpdateDcdnDomainRequest
     * @return UpdateDcdnDomainResponse
     */
    CompletableFuture<UpdateDcdnDomainResponse> updateDcdnDomain(UpdateDcdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnIpaDomain  UpdateDcdnIpaDomainRequest
     * @return UpdateDcdnIpaDomainResponse
     */
    CompletableFuture<UpdateDcdnIpaDomainResponse> updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnSLSRealtimeLogDelivery  UpdateDcdnSLSRealtimeLogDeliveryRequest
     * @return UpdateDcdnSLSRealtimeLogDeliveryResponse
     */
    CompletableFuture<UpdateDcdnSLSRealtimeLogDeliveryResponse> updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnSubTask  UpdateDcdnSubTaskRequest
     * @return UpdateDcdnSubTaskResponse
     */
    CompletableFuture<UpdateDcdnSubTaskResponse> updateDcdnSubTask(UpdateDcdnSubTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDcdnUserRealTimeDeliveryField  UpdateDcdnUserRealTimeDeliveryFieldRequest
     * @return UpdateDcdnUserRealTimeDeliveryFieldResponse
     */
    CompletableFuture<UpdateDcdnUserRealTimeDeliveryFieldResponse> updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you submit code, a version of the code is generated. You can manage and publish code by version.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadRoutineCode  UploadRoutineCodeRequest
     * @return UploadRoutineCodeResponse
     */
    CompletableFuture<UploadRoutineCodeResponse> uploadRoutineCode(UploadRoutineCodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.</li>
     * <li>The code is automatically published to a staging environment.</li>
     * <li>Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStagingRoutineCode  UploadStagingRoutineCodeRequest
     * @return UploadStagingRoutineCodeResponse
     */
    CompletableFuture<UploadStagingRoutineCodeResponse> uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of VerifyDcdnDomainOwner  VerifyDcdnDomainOwnerRequest
     * @return VerifyDcdnDomainOwnerResponse
     */
    CompletableFuture<VerifyDcdnDomainOwnerResponse> verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request);

}
