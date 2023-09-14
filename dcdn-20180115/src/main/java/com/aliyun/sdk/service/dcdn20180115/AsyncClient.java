// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dcdn20180115.models.*;
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
      * > 
      * *   Dynamic Content Delivery Network (DCDN) is activated.
      * *   Internet content provider (ICP) filing is complete for the accelerated domain name.
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<AddDcdnDomainResponse> addDcdnDomain(AddDcdnDomainRequest request);

    /**
      * > 
      * *   Make sure that the IPA service is activated before you add a domain name to accelerate.
      * *   Make sure that the Internet content provider (ICP) filling is complete for the domain name to accelerate.
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review is complete by the end of the next business day after you submit the request.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<AddDcdnIpaDomainResponse> addDcdnIpaDomain(AddDcdnIpaDomainRequest request);

    /**
      * **Prerequisites**:
      * *   The [DCDN service is activated](~~64926~~).
      * *   Internet content provider (ICP) filing is complete for the accelerated domain names.
      * > *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. After you submit the request, the review is complete by the end of the following business day.
      * >*   You can specify up to 50 domain names in each request.
      * >*   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchAddDcdnDomainResponse> batchAddDcdnDomain(BatchAddDcdnDomainRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<BatchCreateDcdnWafRulesResponse> batchCreateDcdnWafRules(BatchCreateDcdnWafRulesRequest request);

    /**
      * > - You can specify up to 50 domain names in each request.
      * > - You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchDeleteDcdnDomainConfigsResponse> batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request);

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    CompletableFuture<BatchDeleteDcdnWafRulesResponse> batchDeleteDcdnWafRules(BatchDeleteDcdnWafRulesRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<BatchModifyDcdnWafRulesResponse> batchModifyDcdnWafRules(BatchModifyDcdnWafRulesRequest request);

    CompletableFuture<BatchPutDcdnKvResponse> batchPutDcdnKv(BatchPutDcdnKvRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<BatchSetDcdnDomainCertificateResponse> batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request);

    /**
      * > 
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchSetDcdnDomainConfigsResponse> batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<BatchSetDcdnIpaDomainConfigsResponse> batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request);

    /**
      * #
      * *   You can call this operation up to 20 times per second.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    CompletableFuture<BatchSetDcdnWafDomainConfigsResponse> batchSetDcdnWafDomainConfigs(BatchSetDcdnWafDomainConfigsRequest request);

    /**
      * > 
      * *   If an accelerated domain name is in an invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchStartDcdnDomainResponse> batchStartDcdnDomain(BatchStartDcdnDomainRequest request);

    /**
      * > *   After an accelerated domain name is disabled, Dynamic Content Delivery Network (DCDN) retains the domain name information. The system automatically reroutes all requests that are destined for the accelerated domain name to the origin.
      * >*   You can specify up to 50 domain names in each request.
      * >*   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchStopDcdnDomainResponse> batchStopDcdnDomain(BatchStopDcdnDomainRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CheckDcdnProjectExistResponse> checkDcdnProjectExist(CheckDcdnProjectExistRequest request);

    /**
      * >  The call frequency of the API is no more than 100 queries per second.
      *
     */
    CompletableFuture<CommitStagingRoutineCodeResponse> commitStagingRoutineCode(CommitStagingRoutineCodeRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<CreateDcdnDeliverTaskResponse> createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateDcdnSLSRealTimeLogDeliveryResponse> createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request);

    /**
      * > 
      * *   This operation allows you to customize an operations report for a specific domain name. You can view the statistics about the domain name in the report.
      * *   You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<CreateDcdnSubTaskResponse> createDcdnSubTask(CreateDcdnSubTaskRequest request);

    CompletableFuture<CreateDcdnWafGroupResponse> createDcdnWafGroup(CreateDcdnWafGroupRequest request);

    /**
      * *   You can call this operation up to 20 times per second per user.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
     */
    CompletableFuture<CreateDcdnWafPolicyResponse> createDcdnWafPolicy(CreateDcdnWafPolicyRequest request);

    /**
      * > 
      * *   The parameters must comply with the rules of EnvConf. The description of a routine cannot exceed 50 characters in length.
      * *   You can only specify the production and staging environments when you call this operation.
      * *   You can call this operation up to 100 times per second.
      *
     */
    CompletableFuture<CreateRoutineResponse> createRoutine(CreateRoutineRequest request);

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateSlrAndSlsProjectResponse> createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 3.
      *
     */
    CompletableFuture<DeleteDcdnDeliverTaskResponse> deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request);

    /**
      * > *   Before you delete your domain name, you need to request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * > *   If you call the **DeleteDcdnDomain** operation, all the information about the accelerated domain name is deleted. If you want to disable an accelerated domain name, call the [StopDcdnDomain](~~130622~~) operation.
      * > *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnDomainResponse> deleteDcdnDomain(DeleteDcdnDomainRequest request);

    /**
      * > 
      * *   Before you delete your domain name, we recommend that you request the Domain Name System (DNS) provider to restore the A record of the domain name. Otherwise, the domain name may become inaccessible after you delete it.
      * *   This operation deletes all records of the specified accelerated domain name. If you want to temporarily disable an accelerated domain name, call the **StopDcdnIpaDomain** operation.****
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnIpaDomainResponse> deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnIpaSpecificConfigResponse> deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request);

    CompletableFuture<DeleteDcdnKvResponse> deleteDcdnKv(DeleteDcdnKvRequest request);

    CompletableFuture<DeleteDcdnKvNamespaceResponse> deleteDcdnKvNamespace(DeleteDcdnKvNamespaceRequest request);

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnRealTimeLogProjectResponse> deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnSpecificConfigResponse> deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnSpecificStagingConfigResponse> deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request);

    /**
      * > You can call this operation up to 3 times per second per account.
      *
     */
    CompletableFuture<DeleteDcdnSubTaskResponse> deleteDcdnSubTask(DeleteDcdnSubTaskRequest request);

    CompletableFuture<DeleteDcdnUserConfigResponse> deleteDcdnUserConfig(DeleteDcdnUserConfigRequest request);

    CompletableFuture<DeleteDcdnWafGroupResponse> deleteDcdnWafGroup(DeleteDcdnWafGroupRequest request);

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    CompletableFuture<DeleteDcdnWafPolicyResponse> deleteDcdnWafPolicy(DeleteDcdnWafPolicyRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRoutineResponse> deleteRoutine(DeleteRoutineRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRoutineCodeRevisionResponse> deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request);

    /**
      * > 
      * *   This operation deletes only custom preset canary release environments. You cannot delete production or staging environments.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRoutineConfEnvsResponse> deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnAclFieldsResponse> describeDcdnAclFields(DescribeDcdnAclFieldsRequest request);

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both of them empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range from the start time to the end time is 31 days. The start time is specified by the StartTime parameter and the end time is specified by the EndTime parameter.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnBgpBpsDataResponse> describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request);

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.
      * *   If you specify multiple Internet service providers (ISPs), the data for the ISPs is aggregated.
      * *   You can query data in the last 90 days.
      * *   The maximum time range that you can specify is 31 days. StartTime specifies the start time and EndTime specifies the end time of the time range.
      * *   If the time range from the start time to the end time is 72 hours or shorter, you can specify the interval as 5 minutes. If the time range is longer than 72 hours, you must specify the interval as 1 hour.
      * *   You can call this operation up to five times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnBgpTrafficDataResponse> describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnBlockedRegionsResponse> describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnCertificateDetailResponse> describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnCertificateListResponse> describeDcdnCertificateList(DescribeDcdnCertificateListRequest request);

    CompletableFuture<DescribeDcdnDdosServiceResponse> describeDcdnDdosService(DescribeDcdnDdosServiceRequest request);

    CompletableFuture<DescribeDcdnDdosSpecInfoResponse> describeDcdnDdosSpecInfo(DescribeDcdnDdosSpecInfoRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDeletedDomainsResponse> describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request);

    /**
      * **
      * **You can call this operation up to three times per second.
      *
     */
    CompletableFuture<DescribeDcdnDeliverListResponse> describeDcdnDeliverList(DescribeDcdnDeliverListRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainBpsDataResponse> describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set **StartTime** or **EndTime**, the request returns the data collected in the last 24 hours. If you set both **StartTime** and **EndTime**, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainBpsDataByLayerResponse> describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainByCertificateResponse> describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request);

    /**
      * > 
      * *   If you do not configure the StartTime or EndTime parameter, data collected over the last 24 hours is queried. If you configure both the StartTime and EndTime parameters, data collected within the specified time range is queried.
      * *   You can query data collected over the last 30 days.
      * *   You can call the RefreshObjectCaches operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainCcActivityLogResponse> describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainCertificateInfoResponse> describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request);

    /**
      * > You can call this operation up to 80 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainCnameResponse> describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request);

    /**
      * > 
      * *   You can query the configurations of one or more features in a request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainConfigsResponse> describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainDetailResponse> describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request);

    /**
      * #
      * *   You can call this operation up to 100 times per second per account.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table. |Time granularity |Maximum time range per query |Historical data available |Data delay | -------------- | -------------- | ------ |5 minutes |3 days |93 days |15 minutes |1 hour |31 days |186 days |4 hours |1 day |366 days |366 days |04:00 on the next day
      *
     */
    CompletableFuture<DescribeDcdnDomainHitRateDataResponse> describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request);

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainHttpCodeDataResponse> describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per account.
      * * You cannot query the distribution of HTTP status codes by IP protocol.
      * * If you do not specify the **StartTime** or **EndTime** parameter, the data that is collected within the last 24 hours is collected. If you specify both the **StartTime** and **EndTime** parameters, the data that is collected within the time range that you specify is collected.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainHttpCodeDataByLayerResponse> describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request);

    /**
      * > 
      * *   The bandwidth is measured in bit/s.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainIpaBpsDataResponse> describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request);

    /**
      * *   You can call this operation up to 10 times per second per user.
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   The minimum time granularity at which the data is queried is 5 minutes. The maximum time range for a single query is 31 days. The period within which historical data is available is 366 days. The data latency is no more than 10 minutes.
      *
     */
    CompletableFuture<DescribeDcdnDomainIpaConnDataResponse> describeDcdnDomainIpaConnData(DescribeDcdnDomainIpaConnDataRequest request);

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * *   Unit: bytes.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainIpaTrafficDataResponse> describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request);

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   If **StartTime** is set but **EndTime** is not set, the data within the hour that starts from **StartTime** is queried.
      * *   If **EndTime** is set but **StartTime** is not set, the data within the last hour that precedes **EndTime** is queried.
      * *   You can query data of a domain name or all domain names that belong to your account.
      * *   You can view data that is collected over the last seven days. The interval at which data is queried is based on the time range specified by **StartTime** and **EndTime**.
      *     *   **If the time range is shorter than or equal to one hour**, data is queried every minute.
      *     *   **If the time range is longer than 1 hour but shorter than or equal to three days**, data is queried every five minutes.
      *     *   **If the time range is longer than three days but shorter than or equal to seven days**, data is queried every hour.
      *
     */
    CompletableFuture<DescribeDcdnDomainIspDataResponse> describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request);

    /**
      * > 
      * *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.********
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainLogResponse> describeDcdnDomainLog(DescribeDcdnDomainLogRequest request);

    /**
      * *   If you do not set the StartTime or EndTime parameter, data within the last 10 minutes is queried. You can set both the StartTime and EndTime parameters to specify a time range.
      * *   You can specify one or more accelerated domain names. Separate domain names with commas (,).
      * *   You can query data within the last 90 days.
      * *   The time range cannot exceed 1 hour.
      *
     */
    CompletableFuture<DescribeDcdnDomainMultiUsageDataResponse> describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainOriginBpsDataResponse> describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request);

    /**
      * - You can call this operation up to 100 times per second per account.
      * - If you do not set the **StartTime** or **EndTime** parameters, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay. 
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * | ---------------- | ---------------------------- | ------------------------- | ---------- |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      * | 1 day | 366 days | 366 days | 04:00 on the next day |
      *
     */
    CompletableFuture<DescribeDcdnDomainOriginTrafficDataResponse> describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainPropertyResponse> describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request);

    CompletableFuture<DescribeDcdnDomainPvDataResponse> describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainQpsDataResponse> describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainQpsDataByLayerResponse> describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeBpsDataResponse> describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay |
      * |----|------|-----|--------|
      * | 1 minute | 1 hour | 7 days | 5 minutes |
      * | 5 minutes | 3 days | 93 days | 15 minutes |
      * | 1 hour | 31 days | 186 days | 4 hours |
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeByteHitRateDataResponse> describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeDetailDataResponse> describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeHttpCodeDataResponse> describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeQpsDataResponse> describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per user.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last hour. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeReqHitRateDataResponse> describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * | Time granularity | Maximum time range per query | Historical data available | Data delay | 
      * |-----|-----|-----|--------| 
      * | 1 minute | 1 hour | 7 days | 5 minutes | 
      * | 5 minutes | 3 days | 93 days | 15 minutes | | 1 hour | 31 days | 186 days | 4 hours |
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcBpsDataResponse> describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse> describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request);

    /**
      * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeSrcTrafficDataResponse> describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request);

    /**
      * You can call this operation up to 50 times per second per user.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDcdnDomainRealTimeTrafficDataResponse> describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request);

    /**
      * > 
      * *   If you do not specify the StartTime and EndTime parameters, the data within the last 24 hours is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnDomainRegionDataResponse> describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request);

    /**
      * The name of the accelerated domain.
      *
     */
    CompletableFuture<DescribeDcdnDomainStagingConfigResponse> describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request);

    /**
      * *   If you do not set the StartTime parameter, the data on the previous day is queried.
      * *   You can specify only one domain name.
      *
     */
    CompletableFuture<DescribeDcdnDomainTopReferVisitResponse> describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request);

    /**
      * > You can query data in the last seven days.
      *
     */
    CompletableFuture<DescribeDcdnDomainTopUrlVisitResponse> describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request);

    /**
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainTrafficDataResponse> describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * Usage data includes traffic (measured in bytes), bandwidth values (measured in bit/s), and the number of requests.
      * **Time granularity**:
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainUsageDataResponse> describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request);

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   You can specify only one accelerated domain name or all the accelerated domain names that belong to your Alibaba Cloud account.
      *
     */
    CompletableFuture<DescribeDcdnDomainUvDataResponse> describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainWebsocketBpsDataResponse> describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request);

    /**
      * You can call this operation up to 100 times per second per account.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainWebsocketHttpCodeDataResponse> describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the last 24 hours. If you set both the **StartTime** and **EndTime** parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDcdnDomainWebsocketTrafficDataResponse> describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 1 hour. The maximum time span for a query is 24 hours. The time period within which historical data is available for a query is 366 days.
      *
     */
    CompletableFuture<DescribeDcdnErUsageDataResponse> describeDcdnErUsageData(DescribeDcdnErUsageDataRequest request);

    /**
      * *   If you specify IP addresses or CIDR blocks, IP addresses that are effective and corresponding expiration time are returned. If you do not specify IP addresses or CIDR blocks, all effective IP addresses and the corresponding expiration time are returned.
      * *   The results are written to OSS and returned as OSS URLs. The OSS objects are in the format of `IP address-Corresponding expiration time`. The expiration time is in the yyyy-MM-dd HH:mm:ss format.
      * *   You can share URLs of OSS objects with others. The shared URLs are valid for three days.
      *
     */
    CompletableFuture<DescribeDcdnFullDomainsBlockIPConfigResponse> describeDcdnFullDomainsBlockIPConfig(DescribeDcdnFullDomainsBlockIPConfigRequest request);

    /**
      * *   For a specified IP addresses and time range, the time when the IP address was delivered to the edge and the corresponding result are returned.
      * *   If a specified IP address or CIDR block has multiple blocking records in a specified time range, the records are sorted by delivery time in descending order.
      * *   The maximum time range to query is 90 days.
      * *   If no blocking record exists or delivery fails for the given IP address and time range, the delivery time is empty.
      *
     */
    CompletableFuture<DescribeDcdnFullDomainsBlockIPHistoryResponse> describeDcdnFullDomainsBlockIPHistory(DescribeDcdnFullDomainsBlockIPHistoryRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
     */
    CompletableFuture<DescribeDcdnHttpsDomainListResponse> describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnIpInfoResponse> describeDcdnIpInfo(DescribeDcdnIpInfoRequest request);

    CompletableFuture<DescribeDcdnIpaDomainCidrResponse> describeDcdnIpaDomainCidr(DescribeDcdnIpaDomainCidrRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnIpaDomainConfigsResponse> describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnIpaDomainDetailResponse> describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request);

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
     */
    CompletableFuture<DescribeDcdnIpaServiceResponse> describeDcdnIpaService(DescribeDcdnIpaServiceRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnIpaUserDomainsResponse> describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request);

    CompletableFuture<DescribeDcdnKvAccountResponse> describeDcdnKvAccount(DescribeDcdnKvAccountRequest request);

    CompletableFuture<DescribeDcdnKvAccountStatusResponse> describeDcdnKvAccountStatus(DescribeDcdnKvAccountStatusRequest request);

    CompletableFuture<DescribeDcdnKvNamespaceResponse> describeDcdnKvNamespace(DescribeDcdnKvNamespaceRequest request);

    CompletableFuture<DescribeDcdnL2IpsResponse> describeDcdnL2Ips(DescribeDcdnL2IpsRequest request);

    CompletableFuture<DescribeDcdnL2VipsResponse> describeDcdnL2Vips(DescribeDcdnL2VipsRequest request);

    /**
      * >  You can call this API operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnRealTimeDeliveryFieldResponse> describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request);

    /**
      * > 
      * *   You can call the **RefreshDcdnObjectCaches** operation to refresh content and call the **PreloadDcdnObjectCaches** operation to prefetch content.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnRefreshQuotaResponse> describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request);

    /**
      * > 
      * *   You can query data within the last three days.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnRefreshTaskByIdResponse> describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request);

    /**
      * > 
      * *   You can query the refresh or prefetch tasks by ID or URL.
      * *   You can set both **TaskId** and **ObjectPath** in a request. If you do not set **TaskId** or **ObjectPath**, the data in the last 3 days on the first page is returned. By default, a maximum of 20 entries can be displayed on each page.
      * *   If you specify **DomainName** or **Status**, you must also specify **ObjectType**.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnRefreshTasksResponse> describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request);

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnRegionAndIspResponse> describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnReportResponse> describeDcdnReport(DescribeDcdnReportRequest request);

    /**
      * > * This operation queries the metadata of all operations reports. The statistics in the reports are not returned.
      * > * You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnReportListResponse> describeDcdnReportList(DescribeDcdnReportListRequest request);

    CompletableFuture<DescribeDcdnSLSRealTimeLogTypeResponse> describeDcdnSLSRealTimeLogType(DescribeDcdnSLSRealTimeLogTypeRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSLSRealtimeLogDeliveryResponse> describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSMCertificateDetailResponse> describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request);

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSMCertificateListResponse> describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSecFuncInfoResponse> describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSecSpecInfoResponse> describeDcdnSecSpecInfo(DescribeDcdnSecSpecInfoRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnServiceResponse> describeDcdnService(DescribeDcdnServiceRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnStagingIpResponse> describeDcdnStagingIp(DescribeDcdnStagingIpRequest request);

    /**
      * > 
      * *   By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.
      * *   You can call this API operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnSubListResponse> describeDcdnSubList(DescribeDcdnSubListRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnTagResourcesResponse> describeDcdnTagResources(DescribeDcdnTagResourcesRequest request);

    /**
      * If you do not specify the StartTime and EndTime parameters, the data within the current month is queried. If you specify the StartTime and EndTime parameters, the data within the specified time range is queried.
      *
     */
    CompletableFuture<DescribeDcdnTopDomainsByFlowResponse> describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserBillHistoryResponse> describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request);

    CompletableFuture<DescribeDcdnUserBillTypeResponse> describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserCertificateExpireCountResponse> describeDcdnUserCertificateExpireCount(DescribeDcdnUserCertificateExpireCountRequest request);

    /**
      * You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserConfigsResponse> describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request);

    /**
      * > You can call this operation up to 80 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserDomainsResponse> describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserDomainsByFuncResponse> describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 30.
      *
     */
    CompletableFuture<DescribeDcdnUserQuotaResponse> describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserRealTimeDeliveryFieldResponse> describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request);

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 30.
      *
     */
    CompletableFuture<DescribeDcdnUserResourcePackageResponse> describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserSecDropResponse> describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserSecDropByMinuteResponse> describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnUserTagsResponse> describeDcdnUserTags(DescribeDcdnUserTagsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnVerifyContentResponse> describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request);

    CompletableFuture<DescribeDcdnWafBotAppKeyResponse> describeDcdnWafBotAppKey(DescribeDcdnWafBotAppKeyRequest request);

    CompletableFuture<DescribeDcdnWafDefaultRulesResponse> describeDcdnWafDefaultRules(DescribeDcdnWafDefaultRulesRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafDomainResponse> describeDcdnWafDomain(DescribeDcdnWafDomainRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafDomainDetailResponse> describeDcdnWafDomainDetail(DescribeDcdnWafDomainDetailRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafDomainsResponse> describeDcdnWafDomains(DescribeDcdnWafDomainsRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafFilterInfoResponse> describeDcdnWafFilterInfo(DescribeDcdnWafFilterInfoRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafGeoInfoResponse> describeDcdnWafGeoInfo(DescribeDcdnWafGeoInfoRequest request);

    CompletableFuture<DescribeDcdnWafGroupResponse> describeDcdnWafGroup(DescribeDcdnWafGroupRequest request);

    CompletableFuture<DescribeDcdnWafGroupsResponse> describeDcdnWafGroups(DescribeDcdnWafGroupsRequest request);

    /**
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   The log data is collected every hour.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafLogsResponse> describeDcdnWafLogs(DescribeDcdnWafLogsRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafPoliciesResponse> describeDcdnWafPolicies(DescribeDcdnWafPoliciesRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafPolicyResponse> describeDcdnWafPolicy(DescribeDcdnWafPolicyRequest request);

    /**
      * You can call this operation up to 20 times per second per user.
      *
     */
    CompletableFuture<DescribeDcdnWafPolicyDomainsResponse> describeDcdnWafPolicyDomains(DescribeDcdnWafPolicyDomainsRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafPolicyValidDomainsResponse> describeDcdnWafPolicyValidDomains(DescribeDcdnWafPolicyValidDomainsRequest request);

    /**
      * #
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafRuleResponse> describeDcdnWafRule(DescribeDcdnWafRuleRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafRulesResponse> describeDcdnWafRules(DescribeDcdnWafRulesRequest request);

    /**
      * You can call this operation up to 20 times per second per user.
      *
     */
    CompletableFuture<DescribeDcdnWafScenesResponse> describeDcdnWafScenes(DescribeDcdnWafScenesRequest request);

    /**
      * # Usage notes
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafServiceResponse> describeDcdnWafService(DescribeDcdnWafServiceRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnWafSpecInfoResponse> describeDcdnWafSpecInfo(DescribeDcdnWafSpecInfoRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   The minimum time granularity for a query is 5 minutes. The maximum time span for a query is 31 days. The time period within which historical data is available for a query is 90 days.
      *
     */
    CompletableFuture<DescribeDcdnWafUsageDataResponse> describeDcdnWafUsageData(DescribeDcdnWafUsageDataRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDcdnsecServiceResponse> describeDcdnsecService(DescribeDcdnsecServiceRequest request);

    CompletableFuture<DescribeDdosAllEventListResponse> describeDdosAllEventList(DescribeDdosAllEventListRequest request);

    CompletableFuture<DescribeEncryptRoutineUidResponse> describeEncryptRoutineUid(DescribeEncryptRoutineUidRequest request);

    CompletableFuture<DescribeHighlightInfoResponse> describeHighlightInfo(DescribeHighlightInfoRequest request);

    CompletableFuture<DescribeRDDomainConfigResponse> describeRDDomainConfig(DescribeRDDomainConfigRequest request);

    /**
      * A domain name can be in one of the following states:
      * *   online
      * *   offline
      * *   configuring
      * *   configure_failed
      * *   checking
      * *   check_failed
      *
     */
    CompletableFuture<DescribeRDDomainsResponse> describeRDDomains(DescribeRDDomainsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRoutineResponse> describeRoutine(DescribeRoutineRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRoutineCanaryEnvsResponse> describeRoutineCanaryEnvs(DescribeRoutineCanaryEnvsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRoutineCodeRevisionResponse> describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request);

    CompletableFuture<DescribeRoutineRelatedDomainsResponse> describeRoutineRelatedDomains(DescribeRoutineRelatedDomainsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRoutineSpecResponse> describeRoutineSpec(DescribeRoutineSpecRequest request);

    /**
      * >  You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRoutineUserInfoResponse> describeRoutineUserInfo(DescribeRoutineUserInfoRequest request);

    /**
      * **
      * **The maximum number of times that each user can call this operation per second is 20.
      *
     */
    CompletableFuture<DescribeUserDcdnIpaStatusResponse> describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeUserDcdnStatusResponse> describeUserDcdnStatus(DescribeUserDcdnStatusRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeUserErStatusResponse> describeUserErStatus(DescribeUserErStatusRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeUserLogserviceStatusResponse> describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request);

    /**
      * > 
      * *   This operation modifies only the specified configurations. Other configurations remain unchanged.
      * *   If you want to delete a setting, delete the parameter value.
      * *   This operation can add canary release environments. Make sure that the environment names comply with the naming rules. Otherwise, you will fail to add the environments.
      * *   Dynamic Route for CDN (DCDN) provides 35 canary release environments. Among these environments, 34 are deployed in China and 1 is deployed outside China. The canary release environments are:
      *     *   Outside China: presetCanaryOverseas.
      *     *   In China: The 34 canary release environments are named in the format of presetCanaryXX. For example, presetCanaryBeijing represents the canary release environment in Beijing. A canary release environment is in each of the following regions: Anhui, Beijing, Chongqing, Fujian, Gansu, Guangdong, Guangxi, Guizhou, Hainan, Hebei, Heilongjiang, Henan, Hong Kong, Hubei, Hunan, Jiangsu, Jiangxi, Jilin, Liaoning, Macao, Neimenggu, Ningxia, Qinghai, Shaanxi, Shandong, Shanghai, Shanxi, Sichuan, Taiwan, Tianjin, Xinjiang, Xizang, Yunan, and Zhejiang.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<EditRoutineConfResponse> editRoutineConf(EditRoutineConfRequest request);

    CompletableFuture<GetDcdnKvResponse> getDcdnKv(GetDcdnKvRequest request);

    CompletableFuture<ListDcdnKvResponse> listDcdnKv(ListDcdnKvRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListDcdnRealTimeDeliveryProjectResponse> listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ModifyDCdnDomainSchdmByPropertyResponse> modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request);

    CompletableFuture<ModifyDcdnWafGroupResponse> modifyDcdnWafGroup(ModifyDcdnWafGroupRequest request);

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      *
     */
    CompletableFuture<ModifyDcdnWafPolicyResponse> modifyDcdnWafPolicy(ModifyDcdnWafPolicyRequest request);

    /**
      * # Usage notes
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Route for CDN (DCDN) supports POST requests.
      *
     */
    CompletableFuture<ModifyDcdnWafPolicyDomainsResponse> modifyDcdnWafPolicyDomains(ModifyDcdnWafPolicyDomainsRequest request);

    /**
      * *   You can call this operation up to 20 times per second per account.
      * *   Alibaba Cloud Dynamic Content Delivery Network (DCDN) supports POST requests.
      * *   You must configure at least one of the **RuleStatus**, **RuleName** and **RuleConfig** parameters.
      *
     */
    CompletableFuture<ModifyDcdnWafRuleResponse> modifyDcdnWafRule(ModifyDcdnWafRuleRequest request);

    /**
      * > 
      * *   DCDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must pass real-name verification.
      * *   You can call this operation up to five times per second per user.
      *
     */
    CompletableFuture<OpenDcdnServiceResponse> openDcdnService(OpenDcdnServiceRequest request);

    /**
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   Dynamic Content Delivery Network (DCDN) supports POST requests in which parameters are sent as a form.
      * *   By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.
      * *   You can specify up to 100 URLs to prefetch.
      * *   The prefetch queue of each Alibaba Cloud account can contain up to 100,000 URLs. DCDN executes prefetch tasks based on the time at which you submit the URLs.
      * *   You can call this operation up to 15 times per second per account.
      * ## Description
      * *   After a refresh task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.
      * *   To allow RAM users to perform this operation, you need to first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
     */
    CompletableFuture<PreloadDcdnObjectCachesResponse> preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<PublishDcdnStagingConfigToProductionResponse> publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<PublishRoutineCodeRevisionResponse> publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request);

    CompletableFuture<PutDcdnKvResponse> putDcdnKv(PutDcdnKvRequest request);

    CompletableFuture<PutDcdnKvNamespaceResponse> putDcdnKvNamespace(PutDcdnKvNamespaceRequest request);

    /**
      * #
      * *   DCDN supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshDcdnObjectCaches](~~130620~~) operation to refresh content and call the [PreloadDcdnObjectCaches](~~130636~~) operation to prefetch content.
      * *   By default, each Alibaba Cloud account can refresh content from a maximum of 10,000 URLs and 100 directories per day, including subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to request a quota increase. DCDN evaluates your application based on your workloads.
      * *   You can specify up to 1,000 URLs or 100 directories that you want to refresh in each request.
      * *   You can refresh up to 1,000 URLs per minute for each domain name.
      * *   You can call this operation up to 30 times per second per account.
      * # Precautions
      * *   After a refresh task is submitted and completed, your resources that are stored on DCDN POPs are removed. When a POP receives a request to your resources, the request is redirected to the origin server to retrieve the resources. Then, the resources are returned to the client and cached on the POP. If you frequently run refresh tasks, more requests will be redirected back to the origin server for resources, which result in high bandwidth costs and undue pressure on the origin server.
      * *   A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.
      * *   If you want to use RAM users to refresh or prefetch resources, you need to obtain the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~445051~~).
      *
     */
    CompletableFuture<RefreshDcdnObjectCachesResponse> refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<RollbackDcdnStagingConfigResponse> rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request);

    /**
      * @deprecated
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetDcdnDomainCertificateResponse> setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetDcdnDomainSMCertificateResponse> setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request);

    CompletableFuture<SetDcdnDomainSSLCertificateResponse> setDcdnDomainSSLCertificate(SetDcdnDomainSSLCertificateRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetDcdnDomainStagingConfigResponse> setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<SetDcdnFullDomainsBlockIPResponse> setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetDcdnUserConfigResponse> setDcdnUserConfig(SetDcdnUserConfigRequest request);

    /**
      * > 
      * *   Each subdomain is globally unique. Resource Access Management (RAM) users cannot create duplicate subdomains.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SetRoutineSubdomainResponse> setRoutineSubdomain(SetRoutineSubdomainRequest request);

    /**
      * > 
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<StartDcdnDomainResponse> startDcdnDomain(StartDcdnDomainRequest request);

    /**
      * *   If an accelerated domain name is in invalid state or your account has an overdue payment, the accelerated domain name cannot be enabled.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<StartDcdnIpaDomainResponse> startDcdnIpaDomain(StartDcdnIpaDomainRequest request);

    /**
      * > 
      * *   After an accelerated domain is disabled, Dynamic Content Delivery Network (DCDN) retains its information and routes all the requests that are destined for the accelerated domain to the origin server.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<StopDcdnDomainResponse> stopDcdnDomain(StopDcdnDomainRequest request);

    /**
      * > 
      * *   If you disable an accelerated domain, the configurations of the accelerated domain are still retained. The system automatically forwards all the requests that are destined for this domain to the origin.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<StopDcdnIpaDomainResponse> stopDcdnIpaDomain(StopDcdnIpaDomainRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<TagDcdnResourcesResponse> tagDcdnResources(TagDcdnResourcesRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UntagDcdnResourcesResponse> untagDcdnResources(UntagDcdnResourcesRequest request);

    /**
      * The parameters that specify the time interval at which the tracking task sends operations reports. The settings must be escaped in JSON.
      *
     */
    CompletableFuture<UpdateDcdnDeliverTaskResponse> updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request);

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<UpdateDcdnDomainResponse> updateDcdnDomain(UpdateDcdnDomainRequest request);

    /**
      * >  You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<UpdateDcdnIpaDomainResponse> updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UpdateDcdnSLSRealtimeLogDeliveryResponse> updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<UpdateDcdnSubTaskResponse> updateDcdnSubTask(UpdateDcdnSubTaskRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UpdateDcdnUserRealTimeDeliveryFieldResponse> updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request);

    /**
      * > 
      * *   Each time you submit code, a version of the code is generated. You can manage and publish code by version.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you must call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UploadRoutineCodeResponse> uploadRoutineCode(UploadRoutineCodeRequest request);

    /**
      * > 
      * *   Each time you upload code to a routine, a version is generated. The number of versions is counted by CodeRev. The uploaded code is used only for testing.
      * *   The code is automatically published to a staging environment.
      * *   Each routine can retain at most 10 versions. If the upper limit is reached, you need to call the DeleteRoutineCodeRevision operation to manually delete versions that are no longer needed before new versions can be saved.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UploadStagingRoutineCodeResponse> uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<VerifyDcdnDomainOwnerResponse> verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request);

}
