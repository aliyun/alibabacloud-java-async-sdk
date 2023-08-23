// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cdn20180510.models.*;
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
      * *   You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see [Activate Alibaba Cloud CDN](~~27272~~).
      * *   The domain name that you want to add has a valid Internet Content Provider (ICP) number.
      * *   You can add only one domain name to Alibaba Cloud CDN in each call. Each Alibaba Cloud account can add a maximum of 50 domain names to Alibaba Cloud CDN.
      * *   If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review will be completed by the end of the next business day after you submit the application.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<AddCdnDomainResponse> addCdnDomain(AddCdnDomainRequest request);

    CompletableFuture<AddFCTriggerResponse> addFCTrigger(AddFCTriggerRequest request);

    /**
      * *   You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see [Activate Alibaba Cloud CDN](~~27272~~).
      * *   If the acceleration region is Chinese Mainland Only or Global, you must apply for an ICP filing for the domain name.
      * *   You can specify multiple domain names and separate them with commas (,). You can specify at most 50 domain names in each call.
      * *   For more information, see [Add a domain name](~~122181~~).
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchAddCdnDomainResponse> batchAddCdnDomain(BatchAddCdnDomainRequest request);

    /**
      * *   You can specify up to 50 domain names in each request.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<BatchDeleteCdnDomainConfigResponse> batchDeleteCdnDomainConfig(BatchDeleteCdnDomainConfigRequest request);

    /**
      * *   You can call this operation up to 30 times per second per account.
      * *   You can specify multiple domain names and must separate them with commas (,). You can specify up to 50 domain names in each call.
      * *   If the BatchSetCdnDomainConfig operation is successful, a unique configuration ID (ConfigId) is generated. You can use configuration IDs to update or delete configurations. For more information, see [Usage notes on ConfigId](~~388994~~).
      *
     */
    CompletableFuture<BatchSetCdnDomainConfigResponse> batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   You can specify up to 10 domain names in each request. Separate multiple domain names with commas (,)
      *
     */
    CompletableFuture<BatchSetCdnDomainServerCertificateResponse> batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request);

    /**
      * *   If a domain name specified in the request is in an invalid state or your account has an overdue payment, the domain name cannot be enabled.
      * *   You can call this operation up to 30 times per second per account.
      * *   You can specify up to 50 domain names in each request.
      *
     */
    CompletableFuture<BatchStartCdnDomainResponse> batchStartCdnDomain(BatchStartCdnDomainRequest request);

    /**
      * *   After an accelerated domain name is disabled, Alibaba Cloud CDN retains its information and reroutes all the requests that are destined for the accelerated domain name to the origin.
      * *   If you need to temporarily disable CDN acceleration for a domain name, we recommend that you call the StopDomain operation.
      * *   You can call this operation up to 30 times per second per account.
      * *   You can specify up to 50 domain names in each request.
      *
     */
    CompletableFuture<BatchStopCdnDomainResponse> batchStopCdnDomain(BatchStopCdnDomainRequest request);

    /**
      * *   You can call this operation up to 30 times per second per account.
      * *   You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).
      *
     */
    CompletableFuture<BatchUpdateCdnDomainResponse> batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request);

    CompletableFuture<ChangeCdnDomainToDcdnResponse> changeCdnDomainToDcdn(ChangeCdnDomainToDcdnRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateCdnCertificateSigningRequestResponse> createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<CreateCdnDeliverTaskResponse> createCdnDeliverTask(CreateCdnDeliverTaskRequest request);

    /**
      * *   This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.
      * *   You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<CreateCdnSubTaskResponse> createCdnSubTask(CreateCdnSubTaskRequest request);

    /**
      * >  You can call this API operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateRealTimeLogDeliveryResponse> createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request);

    /**
      * *   You can create a task to query data in the last year. The maximum time range that can be queried is one month.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateUsageDetailDataExportTaskResponse> createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request);

    /**
      * *   You can create a task to query data in the last year. The maximum time range that can be queried is one month.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<CreateUserUsageDataExportTaskResponse> createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DeleteCdnDeliverTaskResponse> deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request);

    /**
      * *   We recommend that you add an A record for the domain name in the system of your DNS service provider before you remove the domain name from Alibaba Cloud CDN. Otherwise, the domain name may become inaccessible. Proceed with caution.
      * *   After you successfully call the DeleteCdnDomain operation, all records of the removed domain name are deleted. If you need to only disable the domain name, we recommend that you call the StopCdnDomain operation.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DeleteCdnDomainResponse> deleteCdnDomain(DeleteCdnDomainRequest request);

    /**
      * >  You can call this API operation up to three times per second per account.
      *
     */
    CompletableFuture<DeleteCdnSubTaskResponse> deleteCdnSubTask(DeleteCdnSubTaskRequest request);

    CompletableFuture<DeleteFCTriggerResponse> deleteFCTrigger(DeleteFCTriggerRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRealTimeLogLogstoreResponse> deleteRealTimeLogLogstore(DeleteRealTimeLogLogstoreRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteRealtimeLogDeliveryResponse> deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DeleteSpecificConfigResponse> deleteSpecificConfig(DeleteSpecificConfigRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DeleteSpecificStagingConfigResponse> deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteUsageDetailDataExportTaskResponse> deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DeleteUserUsageDataExportTaskResponse> deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeBlockedRegionsResponse> describeBlockedRegions(DescribeBlockedRegionsRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnCertificateDetailResponse> describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request);

    CompletableFuture<DescribeCdnCertificateDetailByIdResponse> describeCdnCertificateDetailById(DescribeCdnCertificateDetailByIdRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnCertificateListResponse> describeCdnCertificateList(DescribeCdnCertificateListRequest request);

    CompletableFuture<DescribeCdnConditionIPBInfoResponse> describeCdnConditionIPBInfo(DescribeCdnConditionIPBInfoRequest request);

    /**
      * > You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDeletedDomainsResponse> describeCdnDeletedDomains(DescribeCdnDeletedDomainsRequest request);

    /**
      * > You can call this operation up to 3 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDeliverListResponse> describeCdnDeliverList(DescribeCdnDeliverListRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDomainByCertificateResponse> describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDomainConfigsResponse> describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDomainDetailResponse> describeCdnDomainDetail(DescribeCdnDomainDetailRequest request);

    /**
      * *   If you do not set **StartTime** or **EndTime**, the request returns the data collected in the last 24 hours. If you set both **StartTime** and **EndTime**, the request returns the data collected within the specified time range.
      * *   The log data is collected every hour.
      * *   You can call this operation up to 100 times per second per account.
      * *   You can query only logs in the last month. The start time and the current time cannot exceed 31 days.
      *
     */
    CompletableFuture<DescribeCdnDomainLogsResponse> describeCdnDomainLogs(DescribeCdnDomainLogsRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnDomainStagingConfigResponse> describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnHttpsDomainListResponse> describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request);

    CompletableFuture<DescribeCdnOrderCommodityCodeResponse> describeCdnOrderCommodityCode(DescribeCdnOrderCommodityCodeRequest request);

    /**
      * *   The lists of ISPs and regions that are supported by Alibaba Cloud CDN are updated and published on the Alibaba Cloud International site.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnRegionAndIspResponse> describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeCdnReportResponse> describeCdnReport(DescribeCdnReportRequest request);

    /**
      * *   This operation queries the metadata of all operations reports. The statistics in the reports are not returned.
      * *   You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeCdnReportListResponse> describeCdnReportList(DescribeCdnReportListRequest request);

    /**
      * > You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnSMCertificateDetailResponse> describeCdnSMCertificateDetail(DescribeCdnSMCertificateDetailRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnSMCertificateListResponse> describeCdnSMCertificateList(DescribeCdnSMCertificateListRequest request);

    CompletableFuture<DescribeCdnSSLCertificateListResponse> describeCdnSSLCertificateList(DescribeCdnSSLCertificateListRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnServiceResponse> describeCdnService(DescribeCdnServiceRequest request);

    /**
      * *   By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.
      * *   You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<DescribeCdnSubListResponse> describeCdnSubList(DescribeCdnSubListRequest request);

    /**
      * *   You can query billing history up to the last one month.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserBillHistoryResponse> describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request);

    /**
      * You can call this operation to estimate resource usage of the current month based on the metering method that is specified on the first day of the current month. You can call this operation to estimate resource usage only of the current month within your Alibaba Cloud account. The time range used for the estimation starts at 00:00 on the first day of the current month and ends 2 hours earlier than the current time.
      * *   Pay by monthly 95th percentile: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.
      * *   Pay by average daily peak bandwidth per month: Estimated value = Sum of daily peak bandwidth values/Number of days. The current day is excluded.
      * *   Pay by 4th peak bandwidth per month: The estimated value is the 4th peak bandwidth value between the start time and end time. If the time range is less than four days, the estimated value is 0.
      * *   Pay by average daily 95th percentile bandwidth per month: Estimated value = Sum of daily 95th percentile bandwidth values/Number of days. The current day is excluded.
      * *   Pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.
      * > You can call this operation only once per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserBillPredictionResponse> describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserBillTypeResponse> describeCdnUserBillType(DescribeCdnUserBillTypeRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserConfigsResponse> describeCdnUserConfigs(DescribeCdnUserConfigsRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
     */
    CompletableFuture<DescribeCdnUserDomainsByFuncResponse> describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserQuotaResponse> describeCdnUserQuota(DescribeCdnUserQuotaRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnUserResourcePackageResponse> describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request);

    /**
      * > You can call this operation up to 150 times per second per account.
      *
     */
    CompletableFuture<DescribeCdnWafDomainResponse> describeCdnWafDomain(DescribeCdnWafDomainRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   If a certificate is associated with a domain name but the certificate is not enabled, the result of this operation shows that the certificate does not exist.
      *
     */
    CompletableFuture<DescribeCertificateInfoByIDResponse> describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeCustomLogConfigResponse> describeCustomLogConfig(DescribeCustomLogConfigRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature to for data analysis.
      * > *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * >*   You can call this operation up to 100 times per second per account.
      * >*   You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,).
      *
     */
    CompletableFuture<DescribeDomainAverageResponseTimeResponse> describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request);

    /**
      * * You can call this operation up to 150 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainBpsDataResponse> describeDomainBpsData(DescribeDomainBpsDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainBpsDataByLayerResponse> describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request);

    /**
      * *   The bandwidth is measured in bit/s.
      * *   You can specify only one accelerated domain name in each request.
      * *   The data is collected every 5 minutes.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainBpsDataByTimeStampResponse> describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request);

    /**
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.
      * *   You can specify up to 20 domain names in reach request. If you specify multiple domain names, separate them with commas (,).
      * *   You can query data collected over the last 30 days.
      * *   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainCcActivityLogResponse> describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainCertificateInfoResponse> describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request);

    CompletableFuture<DescribeDomainCnameResponse> describeDomainCname(DescribeDomainCnameRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainCustomLogConfigResponse> describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request);

    /**
      * You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainDetailDataByLayerResponse> describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainHitRateDataResponse> describeDomainHitRateData(DescribeDomainHitRateDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainHttpCodeDataResponse> describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * ### Time granularity
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainHttpCodeDataByLayerResponse> describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > *   If you do not set StartTime or EndTime, the request returns the data collected in the last 24 hours. If you set both StartTime and EndTime, the request returns the data collected within the specified time range.
      * >*   This operation queries proportions of data usage of different ISPs for only a specific accelerated domain name, or for all accelerated domain names in your Alibaba Cloud account.
      * >*   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainISPDataResponse> describeDomainISPData(DescribeDomainISPDataRequest request);

    /**
      * *   The unit of the bandwidth is bit/s.
      * *   The time granularity of the queried data is 5 minutes.
      * *   You can query data in the last 90 days.
      * *   You can specify the StartTime and EndTime parameters, or the TimePoint and Cycle parameters to query the 95th percentile bandwidth data. If you specify the StartTime and EndTime parameters and the time range that is specified by these parameters is less than or equal to 24 hours, the 95th percentile bandwidth data on the day of the start time is returned. If the time range that is specified by these parameters is more than 24 hours, the 95th percentile bandwidth data in the month of the start time is returned. If you specify the TimePoint and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned. If you do not specify parameters as previously mentioned, the 95th percentile bandwidth data in the last 24 hours is returned.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainMax95BpsDataResponse> describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request);

    /**
      * *   If you do not set StartTime or EndTime, data collected within the last 10 minutes is queried.
      * *   The maximum interval between StartTime and EndTime is 1 hour.
      * *   You can query data within the last 90 days.
      * *   You can query the traffic data and the number of requests for accelerated domain names that are deleted.
      * *   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainMultiUsageDataResponse> describeDomainMultiUsageData(DescribeDomainMultiUsageDataRequest request);

    /**
      * *   This operation is available only to users that are on the whitelist. If the daily peak bandwidth value of your workloads reaches 10 Gbit/s, you can [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex) to apply to be included in the whitelist.
      * *   You can call this API operation up to 6,000 times per second per account.
      * *   Data collection by directory is available only to specified domain names within your Alibaba Cloud account. It cannot be enabled for all domain names within your Alibaba Cloud account.
      * *   The average size of the files that belong to the domain name must be larger than 1 MB.
      * *   The number of directories specified for a single domain name cannot exceed 100. If the number of directories exceeds 100, the data accuracy reduces.
      * *   If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.
      * *   You can query data collected within the last 30 days.
      *
     */
    CompletableFuture<DescribeDomainPathDataResponse> describeDomainPathData(DescribeDomainPathDataRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature to for data analysis.
      * > *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * >*   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainPvDataResponse> describeDomainPvData(DescribeDomainPvDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainQpsDataResponse> describeDomainQpsData(DescribeDomainQpsDataRequest request);

    /**
      * * You can call this operation up to 20 times per second per user.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainQpsDataByLayerResponse> describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity** The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeBpsDataResponse> describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeByteHitRateDataResponse> describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request);

    /**
      * *   You can query data in the last seven days. Data is collected every minute.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainRealTimeDetailDataResponse> describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeHttpCodeDataResponse> describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeQpsDataResponse> describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * * By default, requests in the Go programming language use the POST request method. You must manually change the request method to GET by declaring: request.Method="GET".
      * * The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the request hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeReqHitRateDataResponse> describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeSrcBpsDataResponse> describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request);

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
    CompletableFuture<DescribeDomainRealTimeSrcHttpCodeDataResponse> describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour by default. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity varies with the time range specified by the StartTime and EndTime parameters. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |1 minute|1 hour|7 days|5 minutes|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      *
     */
    CompletableFuture<DescribeDomainRealTimeSrcTrafficDataResponse> describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request);

    /**
      * * You can call this operation up to 50 times per second per account.
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
    CompletableFuture<DescribeDomainRealTimeTrafficDataResponse> describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainRealtimeLogDeliveryResponse> describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you not use this operation because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > *   If you do not specify the **StartTime** or **EndTime** parameter, data collected within the last **24** hours is queried. If you specify both the **StartTime** and **EndTime** parameters, data collected within the specified time range is queried.
      * >*   There is delay in data collection. If you want to query data collected within the last day, we recommend that you query the data on the next day.
      * >*   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainRegionDataResponse> describeDomainRegionData(DescribeDomainRegionDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainReqHitRateDataResponse> describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the time range to query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainSrcBpsDataResponse> describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainSrcHttpCodeDataResponse> describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * ### Time granularity
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainSrcQpsDataResponse> describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > *   The data is collected at an interval of 5 minutes.
      * >*   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainSrcTopUrlVisitResponse> describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainSrcTrafficDataResponse> describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature to for data analysis.
      * > *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * >*   Data is collected every hour.
      * >*   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainTopClientIpVisitResponse> describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature or [ship real-time logs in Log Service](~~440145~~) to analyze data.
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   Data is collected at an interval of five minutes.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainTopReferVisitResponse> describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * >*   You can query data collected in the last 90 days.
      * >*   You can specify only one domain name in each call.
      * >*   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainTopUrlVisitResponse> describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request);

    /**
      * * You can call this operation up to 100 times per second per account.
      * * If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * **Time granularity**
      * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|366 days|366|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainTrafficDataResponse> describeDomainTrafficData(DescribeDomainTrafficDataRequest request);

    /**
      * * You can call this operation up to 10 times per second per account.
      * * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.
      * |Time granularity|Maximum time range per query|Historical data available|Data delay|
      * |---|---|---|---|
      * |5 minutes|3 days|93 days|15 minutes|
      * |1 hour|31 days|186 days|4 hours|
      * |1 day|90 days|366 days|04:00 on the next day|
      *
     */
    CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > 
      * *   If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
      * *   You can specify only one accelerated domain name or all accelerated domain names in your Alibaba Cloud account.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainUvDataResponse> describeDomainUvData(DescribeDomainUvDataRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeDomainsBySourceResponse> describeDomainsBySource(DescribeDomainsBySourceRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   If you do not set StartTime or EndTime, data within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.
      * *   You can query the monitoring data of a specific accelerated domain name or all accelerated domain names that belong to your Alibaba Cloud account.
      *
     */
    CompletableFuture<DescribeDomainsUsageByDayResponse> describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request);

    /**
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeEsExceptionDataResponse> describeEsExceptionData(DescribeEsExceptionDataRequest request);

    /**
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeEsExecuteDataResponse> describeEsExecuteData(DescribeEsExecuteDataRequest request);

    CompletableFuture<DescribeFCTriggerResponse> describeFCTrigger(DescribeFCTriggerRequest request);

    CompletableFuture<DescribeIpInfoResponse> describeIpInfo(DescribeIpInfoRequest request);

    /**
      * > You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DescribeIpStatusResponse> describeIpStatus(DescribeIpStatusRequest request);

    /**
      * *   This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex) to apply for permissions to use this operation.
      * *   You can call this operation up to 40 times per second per account.
      *
     */
    CompletableFuture<DescribeL2VipsByDomainResponse> describeL2VipsByDomain(DescribeL2VipsByDomainRequest request);

    /**
      * *   You can query data within the last 3 days.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribePreloadDetailByIdResponse> describePreloadDetailById(DescribePreloadDetailByIdRequest request);

    /**
      * *   The data is collected every 5 minutes.
      * *   You can call this operation up to 20 times per second per account.
      *
     */
    CompletableFuture<DescribeRangeDataByLocateAndIspServiceResponse> describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeRealtimeDeliveryAccResponse> describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request);

    /**
      * Queries the maximum and remaining numbers of URLs and directories that can be refreshed, the maximum and remaining numbers of times that you can prefetch content, and the maximum and remaining numbers of URLs and directories that can be blocked on the current day.
      *
     */
    CompletableFuture<DescribeRefreshQuotaResponse> describeRefreshQuota(DescribeRefreshQuotaRequest request);

    /**
      * *   You can query data in the last three days.
      * *   You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeRefreshTaskByIdResponse> describeRefreshTaskById(DescribeRefreshTaskByIdRequest request);

    /**
      * *   You can query the status of tasks by task ID or URL.
      * *   You can set both the **TaskId** and **ObjectPath** parameters. If you do not set the **TaskId** or **ObjectPath** parameter, data entries on the first page (20 entries) collected in the last 3 days are returned.
      * *   You can query data collected in the last 3 days.
      * *   If auto CDN cache update is enabled in the Object Storage Service (OSS) console, you cannot call the DescribeRefreshTasks operation to query automatic refresh tasks in OSS.
      * *   You can call this operation up to 10 times per second per account. If you want to query tasks at a higher frequency, call the [DescribeRefreshTaskById](~~187709~~) operation. This operation allows you to query tasks by task ID.
      *
     */
    CompletableFuture<DescribeRefreshTasksResponse> describeRefreshTasks(DescribeRefreshTasksRequest request);

    /**
      * >The maximum number of times that each user can call this operation per second is 30.
      *
     */
    CompletableFuture<DescribeStagingIpResponse> describeStagingIp(DescribeStagingIpRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 10.
      *
     */
    CompletableFuture<DescribeTagResourcesResponse> describeTagResources(DescribeTagResourcesRequest request);

    /**
      * The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the [operations report](~~279577~~) feature for data analysis.
      * > *   If you do not set the **StartTime** or **EndTime** parameter, the request returns the data collected in the current month. If you set both these parameters, the request returns the data collected within the specified time range.
      * >*   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeTopDomainsByFlowResponse> describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeUserCertificateExpireCountResponse> describeUserCertificateExpireCount(DescribeUserCertificateExpireCountRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeUserConfigsResponse> describeUserConfigs(DescribeUserConfigsRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).
      *
     */
    CompletableFuture<DescribeUserDomainsResponse> describeUserDomains(DescribeUserDomainsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeUserTagsResponse> describeUserTags(DescribeUserTagsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeUserUsageDataExportTaskResponse> describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request);

    /**
      * *   This operation has been available since July 20, 2018. You can query information about resource usage collected within the last three months.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<DescribeUserUsageDetailDataExportTaskResponse> describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<DescribeUserVipsByDomainResponse> describeUserVipsByDomain(DescribeUserVipsByDomainRequest request);

    CompletableFuture<DescribeVerifyContentResponse> describeVerifyContent(DescribeVerifyContentRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
     */
    CompletableFuture<DisableRealtimeLogDeliveryResponse> disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request);

    /**
      * >  The maximum number of times that each user can call this operation per second is 100.
      *
     */
    CompletableFuture<EnableRealtimeLogDeliveryResponse> enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListDomainsByLogConfigIdResponse> listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListFCTriggerResponse> listFCTrigger(ListFCTriggerRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListRealtimeLogDeliveryDomainsResponse> listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListRealtimeLogDeliveryInfosResponse> listRealtimeLogDeliveryInfos(ListRealtimeLogDeliveryInfosRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ListUserCustomLogConfigResponse> listUserCustomLogConfig(ListUserCustomLogConfigRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<ModifyCdnDomainResponse> modifyCdnDomain(ModifyCdnDomainRequest request);

    CompletableFuture<ModifyCdnDomainOwnerResponse> modifyCdnDomainOwner(ModifyCdnDomainOwnerRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ModifyCdnDomainSchdmByPropertyResponse> modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<ModifyRealtimeLogDeliveryResponse> modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request);

    /**
      * *   Alibaba Cloud CDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must complete real-name verification to activate Alibaba Cloud CDN.
      * *   You can call this operation up to five times per second per user.
      *
     */
    CompletableFuture<OpenCdnServiceResponse> openCdnService(OpenCdnServiceRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<PublishStagingConfigToProductionResponse> publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request);

    /**
      * *   Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshObjectCaches](~~91164~~) operation to refresh content and call the [PushObjectCache](~~91161~~) operation to prefetch content.
      * *   By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.
      * *   You can specify at most 100 URLs in each prefetch request.
      * *   For each Alibaba Cloud account, the prefetch queue can contain up to 50,000 URLs. Content is prefetched based on the time when the URLs are submitted. The URL that is submitted the earliest has the highest priority. If the number of URLs in the queue reaches 50,000, you cannot submit more URLs until the number drops below 50,000.
      * *   You can call this operation up to 50 times per second per account.
      * *   For more information about how to automate refresh or prefetch tasks, see [Run scripts to refresh and prefetch content](~~151829~~).
      * ## Precautions
      * *   After a prefetch task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.
      * *   To allow RAM users to perform this operation, you must first grant them the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~260300~~).
      *
     */
    CompletableFuture<PushObjectCacheResponse> pushObjectCache(PushObjectCacheRequest request);

    /**
      * *   Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.
      * *   You can call the [RefreshObjectCaches](~~91164~~) operation to refresh content and call the [PushObjectCache](~~91161~~) operation to prefetch content.
      * *   You can call the RefreshObjectCaches operation up to 50 times per second per account.
      * *   For more information about how to automatically refresh or prefetch tasks, see [Run scripts to refresh and prefetch content](~~151829~~).
      * ## Precautions
      * *   After a refresh task is submitted and completed, specific resources are removed from POPs. When a POP receives a request for the removed resources, the POP forwards the request to the origin server to retrieve the resources. The retrieved resources are returned to the client and cached on the POP. Multiple refresh tasks may cause a large number of resources to be removed from the POPs. This increases the number of requests that are forwarded to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.
      * *   A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.
      * *   If you want to use RAM users to refresh or prefetch resources, you must obtain the required permissions. For more information, see [Authorize a RAM user to prefetch and refresh resources](~~260300~~).
      * ### Refresh quota
      * *   By default, each Alibaba Cloud account can refresh content from up to 10,000 URLs and 100 directories per day. The directories include subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can [submit a ticket](https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex) to request a quota increase. Alibaba Cloud CDN evaluates your application based on your workloads.
      * *   By default, each Alibaba Cloud account can submit up to 20 refresh rules that contain regular expressions per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 10 Gbit/s, you can [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to request a quota increase.
      * *   You can specify up to 1,000 URL refresh rules, 100 directory refresh rules, or 1 refresh rule that contains regular expressions in each call.
      * *   You can refresh up to 1,000 URLs per minute for each domain name.
      *
     */
    CompletableFuture<RefreshObjectCachesResponse> refreshObjectCaches(RefreshObjectCachesRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<RollbackStagingConfigResponse> rollbackStagingConfig(RollbackStagingConfigRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<SetCdnDomainCSRCertificateResponse> setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetCdnDomainSMCertificateResponse> setCdnDomainSMCertificate(SetCdnDomainSMCertificateRequest request);

    /**
      * *   You can call this operation up to 30 times per second per account.
      * *   Method: POST.
      *
     */
    CompletableFuture<SetCdnDomainSSLCertificateResponse> setCdnDomainSSLCertificate(SetCdnDomainSSLCertificateRequest request);

    /**
      * >  You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetCdnDomainStagingConfigResponse> setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request);

    /**
      * @deprecated
      * *   You can call this operation up to 10 times per second per user.
      * *   Method: POST.
      *
     */
    CompletableFuture<SetDomainServerCertificateResponse> setDomainServerCertificate(SetDomainServerCertificateRequest request);

    CompletableFuture<SetReqHeaderConfigResponse> setReqHeaderConfig(SetReqHeaderConfigRequest request);

    /**
      * > You can call this operation up to 30 times per second per account.
      *
     */
    CompletableFuture<SetWaitingRoomConfigResponse> setWaitingRoomConfig(SetWaitingRoomConfigRequest request);

    /**
      * *   If the domain name is in an invalid state or you have an overdue payment in your account, the domain name cannot be enabled.
      * *   You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<StartCdnDomainResponse> startCdnDomain(StartCdnDomainRequest request);

    /**
      * *   After an accelerated domain is disabled, Alibaba Cloud CDN retains its information and routes all the requests that are destined for the accelerated domain to the origin server.
      * *   You can call this operation up to 40 times per second per account.
      *
     */
    CompletableFuture<StopCdnDomainResponse> stopCdnDomain(StopCdnDomainRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<UpdateCdnDeliverTaskResponse> updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request);

    /**
      * > You can call this operation up to three times per second per account.
      *
     */
    CompletableFuture<UpdateCdnSubTaskResponse> updateCdnSubTask(UpdateCdnSubTaskRequest request);

    CompletableFuture<UpdateFCTriggerResponse> updateFCTrigger(UpdateFCTriggerRequest request);

    /**
      * > You can call this operation up to 100 times per second per account.
      *
     */
    CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwner(VerifyDomainOwnerRequest request);

}
