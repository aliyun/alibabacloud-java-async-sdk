// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cdn20180510.models.*;
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
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>The domain name that you want to add has a valid Internet Content Provider (ICP) number.</li>
     * <li>You can add only one domain name to Alibaba Cloud CDN in each call. Each Alibaba Cloud account can add a maximum of 50 domain names to Alibaba Cloud CDN.</li>
     * <li>If the content of the origin server is not stored on Alibaba Cloud, the content must be reviewed. The review will be completed by the end of the next business day after you submit the application.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCdnDomain  AddCdnDomainRequest
     * @return AddCdnDomainResponse
     */
    CompletableFuture<AddCdnDomainResponse> addCdnDomain(AddCdnDomainRequest request);

    /**
     * @param request the request parameters of AddFCTrigger  AddFCTriggerRequest
     * @return AddFCTriggerResponse
     */
    CompletableFuture<AddFCTriggerResponse> addFCTrigger(AddFCTriggerRequest request);

    /**
     * <b>description</b> :
     * <p>  You must activate Alibaba Cloud CDN before you can add a domain name to it. For more information, see <a href="https://help.aliyun.com/document_detail/27272.html">Activate Alibaba Cloud CDN</a>.</p>
     * <ul>
     * <li>If the acceleration region is Chinese Mainland Only or Global, you must apply for an ICP filing for the domain name.</li>
     * <li>You can specify multiple domain names and separate them with commas (,). You can specify at most 50 domain names in each call.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/122181.html">Add a domain name</a>.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchAddCdnDomain  BatchAddCdnDomainRequest
     * @return BatchAddCdnDomainResponse
     */
    CompletableFuture<BatchAddCdnDomainResponse> batchAddCdnDomain(BatchAddCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify up to 50 domain names in each request.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchDeleteCdnDomainConfig  BatchDeleteCdnDomainConfigRequest
     * @return BatchDeleteCdnDomainConfigResponse
     */
    CompletableFuture<BatchDeleteCdnDomainConfigResponse> batchDeleteCdnDomainConfig(BatchDeleteCdnDomainConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 20.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchDescribeCdnIpInfo  BatchDescribeCdnIpInfoRequest
     * @return BatchDescribeCdnIpInfoResponse
     */
    CompletableFuture<BatchDescribeCdnIpInfoResponse> batchDescribeCdnIpInfo(BatchDescribeCdnIpInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify multiple domain names and must separate them with commas (,). You can specify up to 50 domain names in each call.</li>
     * <li>If the BatchSetCdnDomainConfig operation is successful, a unique configuration ID (ConfigId) is generated. You can use configuration IDs to update or delete configurations. For more information, see <a href="https://help.aliyun.com/document_detail/388994.html">Usage notes on ConfigId</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchSetCdnDomainConfig  BatchSetCdnDomainConfigRequest
     * @return BatchSetCdnDomainConfigResponse
     */
    CompletableFuture<BatchSetCdnDomainConfigResponse> batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>You can specify up to 10 domain names in each request. Separate multiple domain names with commas (,)</li>
     * <li>If the service type of a domain name is live streaming, the service may be unavailable after you configure the certificate for the domain name. Therefore, you cannot use this operation to configure the certificate for a domain name that is used for live streaming.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of BatchSetCdnDomainServerCertificate  BatchSetCdnDomainServerCertificateRequest
     * @return BatchSetCdnDomainServerCertificateResponse
     */
    CompletableFuture<BatchSetCdnDomainServerCertificateResponse> batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  If a domain name specified in the request is in an invalid state or your account has an overdue payment, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStartCdnDomain  BatchStartCdnDomainRequest
     * @return BatchStartCdnDomainResponse
     */
    CompletableFuture<BatchStartCdnDomainResponse> batchStartCdnDomain(BatchStartCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain name is disabled, Alibaba Cloud CDN retains its information and reroutes all the requests that are destined for the accelerated domain name to the origin.</p>
     * <ul>
     * <li>If you need to temporarily disable CDN acceleration for a domain name, we recommend that you call the StopDomain operation.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>You can specify up to 50 domain names in each request.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStopCdnDomain  BatchStopCdnDomainRequest
     * @return BatchStopCdnDomainResponse
     */
    CompletableFuture<BatchStopCdnDomainResponse> batchStopCdnDomain(BatchStopCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * @param request the request parameters of BatchUpdateCdnDomain  BatchUpdateCdnDomainRequest
     * @return BatchUpdateCdnDomainResponse
     */
    CompletableFuture<BatchUpdateCdnDomainResponse> batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request);

    /**
     * @param request the request parameters of CdnMigrateRegister  CdnMigrateRegisterRequest
     * @return CdnMigrateRegisterResponse
     */
    CompletableFuture<CdnMigrateRegisterResponse> cdnMigrateRegister(CdnMigrateRegisterRequest request);

    /**
     * @param request the request parameters of ChangeCdnDomainToDcdn  ChangeCdnDomainToDcdnRequest
     * @return ChangeCdnDomainToDcdnResponse
     */
    CompletableFuture<ChangeCdnDomainToDcdnResponse> changeCdnDomainToDcdn(ChangeCdnDomainToDcdnRequest request);

    /**
     * @param request the request parameters of CheckCdnDomainExist  CheckCdnDomainExistRequest
     * @return CheckCdnDomainExistResponse
     */
    CompletableFuture<CheckCdnDomainExistResponse> checkCdnDomainExist(CheckCdnDomainExistRequest request);

    /**
     * @param request the request parameters of CheckCdnDomainICP  CheckCdnDomainICPRequest
     * @return CheckCdnDomainICPResponse
     */
    CompletableFuture<CheckCdnDomainICPResponse> checkCdnDomainICP(CheckCdnDomainICPRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCdnCertificateSigningRequest  CreateCdnCertificateSigningRequestRequest
     * @return CreateCdnCertificateSigningRequestResponse
     */
    CompletableFuture<CreateCdnCertificateSigningRequestResponse> createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCdnDeliverTask  CreateCdnDeliverTaskRequest
     * @return CreateCdnDeliverTaskResponse
     */
    CompletableFuture<CreateCdnDeliverTaskResponse> createCdnDeliverTask(CreateCdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation allows you to create a custom operations report for a specific domain name. You can view the statistics about the domain name in the report.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCdnSubTask  CreateCdnSubTaskRequest
     * @return CreateCdnSubTaskResponse
     */
    CompletableFuture<CreateCdnSubTaskResponse> createCdnSubTask(CreateCdnSubTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRealTimeLogDelivery  CreateRealTimeLogDeliveryRequest
     * @return CreateRealTimeLogDeliveryResponse
     */
    CompletableFuture<CreateRealTimeLogDeliveryResponse> createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUsageDetailDataExportTask  CreateUsageDetailDataExportTaskRequest
     * @return CreateUsageDetailDataExportTaskResponse
     */
    CompletableFuture<CreateUsageDetailDataExportTaskResponse> createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create a task to query data in the last year. The maximum time range that can be queried is one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserUsageDataExportTask  CreateUserUsageDataExportTaskRequest
     * @return CreateUserUsageDataExportTaskResponse
     */
    CompletableFuture<CreateUserUsageDataExportTaskResponse> createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCdnDeliverTask  DeleteCdnDeliverTaskRequest
     * @return DeleteCdnDeliverTaskResponse
     */
    CompletableFuture<DeleteCdnDeliverTaskResponse> deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  We recommend that you add an A record for the domain name in the system of your DNS service provider before you remove the domain name from Alibaba Cloud CDN. Otherwise, the domain name may become inaccessible. Proceed with caution.</p>
     * <ul>
     * <li>After you successfully call the DeleteCdnDomain operation, all records of the removed domain name are deleted. If you need to only disable the domain name, we recommend that you call the StopCdnDomain operation.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCdnDomain  DeleteCdnDomainRequest
     * @return DeleteCdnDomainResponse
     */
    CompletableFuture<DeleteCdnDomainResponse> deleteCdnDomain(DeleteCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this API operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCdnSubTask  DeleteCdnSubTaskRequest
     * @return DeleteCdnSubTaskResponse
     */
    CompletableFuture<DeleteCdnSubTaskResponse> deleteCdnSubTask(DeleteCdnSubTaskRequest request);

    /**
     * @param request the request parameters of DeleteFCTrigger  DeleteFCTriggerRequest
     * @return DeleteFCTriggerResponse
     */
    CompletableFuture<DeleteFCTriggerResponse> deleteFCTrigger(DeleteFCTriggerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRealTimeLogLogstore  DeleteRealTimeLogLogstoreRequest
     * @return DeleteRealTimeLogLogstoreResponse
     */
    CompletableFuture<DeleteRealTimeLogLogstoreResponse> deleteRealTimeLogLogstore(DeleteRealTimeLogLogstoreRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRealtimeLogDelivery  DeleteRealtimeLogDeliveryRequest
     * @return DeleteRealtimeLogDeliveryResponse
     */
    CompletableFuture<DeleteRealtimeLogDeliveryResponse> deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteSpecificConfig  DeleteSpecificConfigRequest
     * @return DeleteSpecificConfigResponse
     */
    CompletableFuture<DeleteSpecificConfigResponse> deleteSpecificConfig(DeleteSpecificConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteSpecificStagingConfig  DeleteSpecificStagingConfigRequest
     * @return DeleteSpecificStagingConfigResponse
     */
    CompletableFuture<DeleteSpecificStagingConfigResponse> deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteUsageDetailDataExportTask  DeleteUsageDetailDataExportTaskRequest
     * @return DeleteUsageDetailDataExportTaskResponse
     */
    CompletableFuture<DeleteUsageDetailDataExportTaskResponse> deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteUserUsageDataExportTask  DeleteUserUsageDataExportTaskRequest
     * @return DeleteUserUsageDataExportTaskResponse
     */
    CompletableFuture<DeleteUserUsageDataExportTaskResponse> deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeBlockedRegions  DescribeBlockedRegionsRequest
     * @return DescribeBlockedRegionsResponse
     */
    CompletableFuture<DescribeBlockedRegionsResponse> describeBlockedRegions(DescribeBlockedRegionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnCertificateDetail  DescribeCdnCertificateDetailRequest
     * @return DescribeCdnCertificateDetailResponse
     */
    CompletableFuture<DescribeCdnCertificateDetailResponse> describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request);

    /**
     * @param request the request parameters of DescribeCdnCertificateDetailById  DescribeCdnCertificateDetailByIdRequest
     * @return DescribeCdnCertificateDetailByIdResponse
     */
    CompletableFuture<DescribeCdnCertificateDetailByIdResponse> describeCdnCertificateDetailById(DescribeCdnCertificateDetailByIdRequest request);

    /**
     * @deprecated OpenAPI DescribeCdnCertificateList is deprecated, please use Cdn::2018-05-10::DescribeCdnSSLCertificateList instead.  * @description > You can call this operation up to 30 times per second per account.
     * 
     * @param request the request parameters of DescribeCdnCertificateList  DescribeCdnCertificateListRequest
     * @return DescribeCdnCertificateListResponse
     */
    @Deprecated
    CompletableFuture<DescribeCdnCertificateListResponse> describeCdnCertificateList(DescribeCdnCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeCdnConditionIPBInfo  DescribeCdnConditionIPBInfoRequest
     * @return DescribeCdnConditionIPBInfoResponse
     */
    CompletableFuture<DescribeCdnConditionIPBInfoResponse> describeCdnConditionIPBInfo(DescribeCdnConditionIPBInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDeletedDomains  DescribeCdnDeletedDomainsRequest
     * @return DescribeCdnDeletedDomainsResponse
     */
    CompletableFuture<DescribeCdnDeletedDomainsResponse> describeCdnDeletedDomains(DescribeCdnDeletedDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 3 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDeliverList  DescribeCdnDeliverListRequest
     * @return DescribeCdnDeliverListResponse
     */
    CompletableFuture<DescribeCdnDeliverListResponse> describeCdnDeliverList(DescribeCdnDeliverListRequest request);

    /**
     * @param request the request parameters of DescribeCdnDomainAtoaLogs  DescribeCdnDomainAtoaLogsRequest
     * @return DescribeCdnDomainAtoaLogsResponse
     */
    CompletableFuture<DescribeCdnDomainAtoaLogsResponse> describeCdnDomainAtoaLogs(DescribeCdnDomainAtoaLogsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDomainByCertificate  DescribeCdnDomainByCertificateRequest
     * @return DescribeCdnDomainByCertificateResponse
     */
    CompletableFuture<DescribeCdnDomainByCertificateResponse> describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDomainConfigs  DescribeCdnDomainConfigsRequest
     * @return DescribeCdnDomainConfigsResponse
     */
    CompletableFuture<DescribeCdnDomainConfigsResponse> describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDomainDetail  DescribeCdnDomainDetailRequest
     * @return DescribeCdnDomainDetailResponse
     */
    CompletableFuture<DescribeCdnDomainDetailResponse> describeCdnDomainDetail(DescribeCdnDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set <strong>StartTime</strong> or <strong>EndTime</strong>, the request returns the data collected in the last 24 hours. If you set both <strong>StartTime</strong> and <strong>EndTime</strong>, the request returns the data collected within the specified time range.</p>
     * <ul>
     * <li>The log data is collected every hour.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can query only logs in the last month. The start time and the current time cannot exceed 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnDomainLogs  DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     */
    CompletableFuture<DescribeCdnDomainLogsResponse> describeCdnDomainLogs(DescribeCdnDomainLogsRequest request);

    /**
     * @param request the request parameters of DescribeCdnDomainLogsExTtl  DescribeCdnDomainLogsExTtlRequest
     * @return DescribeCdnDomainLogsExTtlResponse
     */
    CompletableFuture<DescribeCdnDomainLogsExTtlResponse> describeCdnDomainLogsExTtl(DescribeCdnDomainLogsExTtlRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnDomainStagingConfig  DescribeCdnDomainStagingConfigRequest
     * @return DescribeCdnDomainStagingConfigResponse
     */
    CompletableFuture<DescribeCdnDomainStagingConfigResponse> describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request);

    /**
     * @param request the request parameters of DescribeCdnFullDomainsBlockIPConfig  DescribeCdnFullDomainsBlockIPConfigRequest
     * @return DescribeCdnFullDomainsBlockIPConfigResponse
     */
    CompletableFuture<DescribeCdnFullDomainsBlockIPConfigResponse> describeCdnFullDomainsBlockIPConfig(DescribeCdnFullDomainsBlockIPConfigRequest request);

    /**
     * @param request the request parameters of DescribeCdnFullDomainsBlockIPHistory  DescribeCdnFullDomainsBlockIPHistoryRequest
     * @return DescribeCdnFullDomainsBlockIPHistoryResponse
     */
    CompletableFuture<DescribeCdnFullDomainsBlockIPHistoryResponse> describeCdnFullDomainsBlockIPHistory(DescribeCdnFullDomainsBlockIPHistoryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnHttpsDomainList  DescribeCdnHttpsDomainListRequest
     * @return DescribeCdnHttpsDomainListResponse
     */
    CompletableFuture<DescribeCdnHttpsDomainListResponse> describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a domain name is not transferred from Alibaba Cloud CDN to DCDN after it is registered in the routing center of DCDN, the registration information is retained for only one day.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnMigrateRegisterStatus  DescribeCdnMigrateRegisterStatusRequest
     * @return DescribeCdnMigrateRegisterStatusResponse
     */
    CompletableFuture<DescribeCdnMigrateRegisterStatusResponse> describeCdnMigrateRegisterStatus(DescribeCdnMigrateRegisterStatusRequest request);

    /**
     * @param request the request parameters of DescribeCdnOrderCommodityCode  DescribeCdnOrderCommodityCodeRequest
     * @return DescribeCdnOrderCommodityCodeResponse
     */
    CompletableFuture<DescribeCdnOrderCommodityCodeResponse> describeCdnOrderCommodityCode(DescribeCdnOrderCommodityCodeRequest request);

    /**
     * <b>description</b> :
     * <p>  The lists of ISPs and regions that are supported by Alibaba Cloud CDN are updated and published on the Alibaba Cloud International site.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnRegionAndIsp  DescribeCdnRegionAndIspRequest
     * @return DescribeCdnRegionAndIspResponse
     */
    CompletableFuture<DescribeCdnRegionAndIspResponse> describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnReport  DescribeCdnReportRequest
     * @return DescribeCdnReportResponse
     */
    CompletableFuture<DescribeCdnReportResponse> describeCdnReport(DescribeCdnReportRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation queries the metadata of all operations reports. The statistics in the reports are not returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnReportList  DescribeCdnReportListRequest
     * @return DescribeCdnReportListResponse
     */
    CompletableFuture<DescribeCdnReportListResponse> describeCdnReportList(DescribeCdnReportListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 20 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnSMCertificateDetail  DescribeCdnSMCertificateDetailRequest
     * @return DescribeCdnSMCertificateDetailResponse
     */
    CompletableFuture<DescribeCdnSMCertificateDetailResponse> describeCdnSMCertificateDetail(DescribeCdnSMCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnSMCertificateList  DescribeCdnSMCertificateListRequest
     * @return DescribeCdnSMCertificateListResponse
     */
    CompletableFuture<DescribeCdnSMCertificateListResponse> describeCdnSMCertificateList(DescribeCdnSMCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeCdnSSLCertificateList  DescribeCdnSSLCertificateListRequest
     * @return DescribeCdnSSLCertificateListResponse
     */
    CompletableFuture<DescribeCdnSSLCertificateListResponse> describeCdnSSLCertificateList(DescribeCdnSSLCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeCdnSecFuncInfo  DescribeCdnSecFuncInfoRequest
     * @return DescribeCdnSecFuncInfoResponse
     */
    CompletableFuture<DescribeCdnSecFuncInfoResponse> describeCdnSecFuncInfo(DescribeCdnSecFuncInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnService  DescribeCdnServiceRequest
     * @return DescribeCdnServiceResponse
     */
    CompletableFuture<DescribeCdnServiceResponse> describeCdnService(DescribeCdnServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, this operation queries all custom operations reports. However, only one operations report can be displayed. Therefore, only one operations report is returned.</p>
     * <ul>
     * <li>You can call this operation up to three times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnSubList  DescribeCdnSubListRequest
     * @return DescribeCdnSubListResponse
     */
    CompletableFuture<DescribeCdnSubListResponse> describeCdnSubList(DescribeCdnSubListRequest request);

    /**
     * @param request the request parameters of DescribeCdnTypes  DescribeCdnTypesRequest
     * @return DescribeCdnTypesResponse
     */
    CompletableFuture<DescribeCdnTypesResponse> describeCdnTypes(DescribeCdnTypesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query billing history up to the last one month.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnUserBillHistory  DescribeCdnUserBillHistoryRequest
     * @return DescribeCdnUserBillHistoryResponse
     */
    CompletableFuture<DescribeCdnUserBillHistoryResponse> describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to estimate resource usage of the current month based on the metering method that is specified on the first day of the current month. You can call this operation to estimate resource usage only of the current month within your Alibaba Cloud account. The time range used for the estimation starts at 00:00 on the first day of the current month and ends 2 hours earlier than the current time.</p>
     * <ul>
     * <li>Pay by monthly 95th percentile: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.</li>
     * <li>Pay by average daily peak bandwidth per month: Estimated value = Sum of daily peak bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 4th peak bandwidth per month: The estimated value is the 4th peak bandwidth value between the start time and end time. If the time range is less than four days, the estimated value is 0.</li>
     * <li>Pay by average daily 95th percentile bandwidth per month: Estimated value = Sum of daily 95th percentile bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00: The top 5% values between the start time and end time are excluded. The estimated value is the highest value among the remaining values.<blockquote>
     * <p>You can call this operation only once per second per account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCdnUserBillPrediction  DescribeCdnUserBillPredictionRequest
     * @return DescribeCdnUserBillPredictionResponse
     */
    CompletableFuture<DescribeCdnUserBillPredictionResponse> describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeCdnUserBillType  DescribeCdnUserBillTypeRequest
     * @return DescribeCdnUserBillTypeResponse
     */
    CompletableFuture<DescribeCdnUserBillTypeResponse> describeCdnUserBillType(DescribeCdnUserBillTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnUserConfigs  DescribeCdnUserConfigsRequest
     * @return DescribeCdnUserConfigsResponse
     */
    CompletableFuture<DescribeCdnUserConfigsResponse> describeCdnUserConfigs(DescribeCdnUserConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnUserDomainsByFunc  DescribeCdnUserDomainsByFuncRequest
     * @return DescribeCdnUserDomainsByFuncResponse
     */
    CompletableFuture<DescribeCdnUserDomainsByFuncResponse> describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnUserQuota  DescribeCdnUserQuotaRequest
     * @return DescribeCdnUserQuotaResponse
     */
    CompletableFuture<DescribeCdnUserQuotaResponse> describeCdnUserQuota(DescribeCdnUserQuotaRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnUserResourcePackage  DescribeCdnUserResourcePackageRequest
     * @return DescribeCdnUserResourcePackageResponse
     */
    CompletableFuture<DescribeCdnUserResourcePackageResponse> describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 150 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCdnWafDomain  DescribeCdnWafDomainRequest
     * @return DescribeCdnWafDomainResponse
     */
    CompletableFuture<DescribeCdnWafDomainResponse> describeCdnWafDomain(DescribeCdnWafDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If a certificate is associated with a domain name but the certificate is not enabled, the result of this operation shows that the certificate does not exist.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCertificateInfoByID  DescribeCertificateInfoByIDRequest
     * @return DescribeCertificateInfoByIDResponse
     */
    CompletableFuture<DescribeCertificateInfoByIDResponse> describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCustomLogConfig  DescribeCustomLogConfigRequest
     * @return DescribeCustomLogConfigResponse
     */
    CompletableFuture<DescribeCustomLogConfigResponse> describeCustomLogConfig(DescribeCustomLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can specify up to 500 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainAverageResponseTime  DescribeDomainAverageResponseTimeRequest
     * @return DescribeDomainAverageResponseTimeResponse
     */
    CompletableFuture<DescribeDomainAverageResponseTimeResponse> describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 150 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainBpsData  DescribeDomainBpsDataRequest
     * @return DescribeDomainBpsDataResponse
     */
    CompletableFuture<DescribeDomainBpsDataResponse> describeDomainBpsData(DescribeDomainBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainBpsDataByLayer  DescribeDomainBpsDataByLayerRequest
     * @return DescribeDomainBpsDataByLayerResponse
     */
    CompletableFuture<DescribeDomainBpsDataByLayerResponse> describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>  The bandwidth is measured in bit/s.</p>
     * <ul>
     * <li>You can specify only one accelerated domain name in each request.</li>
     * <li>The data is collected every 5 minutes.</li>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainBpsDataByTimeStamp  DescribeDomainBpsDataByTimeStampRequest
     * @return DescribeDomainBpsDataByTimeStampResponse
     */
    CompletableFuture<DescribeDomainBpsDataByTimeStampResponse> describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range. You must set both parameters or leave both parameters empty.</p>
     * <ul>
     * <li>You can specify up to 20 domain names in reach request. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>You can query data collected over the last 30 days.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainCcActivityLog  DescribeDomainCcActivityLogRequest
     * @return DescribeDomainCcActivityLogResponse
     */
    CompletableFuture<DescribeDomainCcActivityLogResponse> describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainCertificateInfo  DescribeDomainCertificateInfoRequest
     * @return DescribeDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeDomainCertificateInfoResponse> describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request);

    /**
     * @param request the request parameters of DescribeDomainCname  DescribeDomainCnameRequest
     * @return DescribeDomainCnameResponse
     */
    CompletableFuture<DescribeDomainCnameResponse> describeDomainCname(DescribeDomainCnameRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainCustomLogConfig  DescribeDomainCustomLogConfigRequest
     * @return DescribeDomainCustomLogConfigResponse
     */
    CompletableFuture<DescribeDomainCustomLogConfigResponse> describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeDomainDetailDataByLayer  DescribeDomainDetailDataByLayerRequest
     * @return DescribeDomainDetailDataByLayerResponse
     */
    CompletableFuture<DescribeDomainDetailDataByLayerResponse> describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainHitRateData  DescribeDomainHitRateDataRequest
     * @return DescribeDomainHitRateDataResponse
     */
    CompletableFuture<DescribeDomainHitRateDataResponse> describeDomainHitRateData(DescribeDomainHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainHttpCodeData  DescribeDomainHttpCodeDataRequest
     * @return DescribeDomainHttpCodeDataResponse
     */
    CompletableFuture<DescribeDomainHttpCodeDataResponse> describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
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
     * @param request the request parameters of DescribeDomainHttpCodeDataByLayer  DescribeDomainHttpCodeDataByLayerRequest
     * @return DescribeDomainHttpCodeDataByLayerResponse
     */
    CompletableFuture<DescribeDomainHttpCodeDataByLayerResponse> describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set StartTime or EndTime, the request returns the data collected in the last 24 hours. If you set both StartTime and EndTime, the request returns the data collected within the specified time range.</li>
     * <li>This operation queries proportions of data usage of different ISPs for only a specific accelerated domain name, or for all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainISPData  DescribeDomainISPDataRequest
     * @return DescribeDomainISPDataResponse
     */
    CompletableFuture<DescribeDomainISPDataResponse> describeDomainISPData(DescribeDomainISPDataRequest request);

    /**
     * <b>description</b> :
     * <p><em>You can use one of the following methods to query data:</em>*</p>
     * <ul>
     * <li>If you specify the StartTime and EndTime parameters and the time range that is specified by these parameters is less than or equal to 24 hours, the 95th percentile bandwidth data on the day of the start time is returned. If the time range that is specified by these parameters is more than 24 hours, the 95th percentile bandwidth data in the month of the start time is returned.</li>
     * <li>If you specify the TimePoint and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.</li>
     * <li>If you specify the StartTime, EndTime, and Cycle parameters, the 95th percentile bandwidth data of the cycle is returned.
     * If you do not use one of the methods, the 95th percentile bandwidth data of the previous 24 hours is returned by default.</li>
     * <li>Maximum time range to query: 90 days </li>
     * <li>Minimum data granularity to query: 1 day </li>
     * <li>Historical data available: 90 days</li>
     * </ul>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>The unit of the bandwidth data returned is bit/s.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainMax95BpsData  DescribeDomainMax95BpsDataRequest
     * @return DescribeDomainMax95BpsDataResponse
     */
    CompletableFuture<DescribeDomainMax95BpsDataResponse> describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not set StartTime or EndTime, data collected within the last 10 minutes is queried.</p>
     * <ul>
     * <li>The maximum interval between StartTime and EndTime is 1 hour.</li>
     * <li>You can query data within the last 90 days.</li>
     * <li>You can query the traffic data and the number of requests for accelerated domain names that are deleted.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainMultiUsageData  DescribeDomainMultiUsageDataRequest
     * @return DescribeDomainMultiUsageDataResponse
     */
    CompletableFuture<DescribeDomainMultiUsageDataResponse> describeDomainMultiUsageData(DescribeDomainMultiUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users that are on the whitelist. If the daily peak bandwidth value of your workloads reaches 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply to be included in the whitelist.</p>
     * <ul>
     * <li>You can call this API operation up to 6,000 times per second per account.</li>
     * <li>Data collection by directory is available only to specified domain names within your Alibaba Cloud account. It cannot be enabled for all domain names within your Alibaba Cloud account.</li>
     * <li>The average size of the files that belong to the domain name must be larger than 1 MB.</li>
     * <li>The number of directories specified for a single domain name cannot exceed 100. If the number of directories exceeds 100, the data accuracy reduces.</li>
     * <li>If you do not set StartTime or EndTime, data collected within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query data collected within the last 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainPathData  DescribeDomainPathDataRequest
     * @return DescribeDomainPathDataResponse
     */
    CompletableFuture<DescribeDomainPathDataResponse> describeDomainPathData(DescribeDomainPathDataRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainPvData  DescribeDomainPvDataRequest
     * @return DescribeDomainPvDataResponse
     */
    CompletableFuture<DescribeDomainPvDataResponse> describeDomainPvData(DescribeDomainPvDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainQpsData  DescribeDomainQpsDataRequest
     * @return DescribeDomainQpsDataResponse
     */
    CompletableFuture<DescribeDomainQpsDataResponse> describeDomainQpsData(DescribeDomainQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per user.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
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
     * @param request the request parameters of DescribeDomainQpsDataByLayer  DescribeDomainQpsDataByLayerRequest
     * @return DescribeDomainQpsDataByLayerResponse
     */
    CompletableFuture<DescribeDomainQpsDataByLayerResponse> describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainRealTimeBpsData  DescribeDomainRealTimeBpsDataRequest
     * @return DescribeDomainRealTimeBpsDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeBpsDataResponse> describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the byte hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
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
     * @param request the request parameters of DescribeDomainRealTimeByteHitRateData  DescribeDomainRealTimeByteHitRateDataRequest
     * @return DescribeDomainRealTimeByteHitRateDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeByteHitRateDataResponse> describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query data in the last seven days. Data is collected every minute.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainRealTimeDetailData  DescribeDomainRealTimeDetailDataRequest
     * @return DescribeDomainRealTimeDetailDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeDetailDataResponse> describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainRealTimeHttpCodeData  DescribeDomainRealTimeHttpCodeDataRequest
     * @return DescribeDomainRealTimeHttpCodeDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeHttpCodeDataResponse> describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainRealTimeQpsData  DescribeDomainRealTimeQpsDataRequest
     * @return DescribeDomainRealTimeQpsDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeQpsDataResponse> describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.</li>
     * <li>By default, requests in the Go programming language use the POST request method. You must manually change the request method to GET by declaring: request.Method=&quot;GET&quot;.</li>
     * <li>The network traffic destined for different domain names may be redirected to the same origin server. Therefore, the request hit ratios may be inaccurate. The accuracy of query results is based on the actual configurations.
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
     * @param request the request parameters of DescribeDomainRealTimeReqHitRateData  DescribeDomainRealTimeReqHitRateDataRequest
     * @return DescribeDomainRealTimeReqHitRateDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeReqHitRateDataResponse> describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last hour. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainRealTimeSrcBpsData  DescribeDomainRealTimeSrcBpsDataRequest
     * @return DescribeDomainRealTimeSrcBpsDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeSrcBpsDataResponse> describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request);

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
     * @param request the request parameters of DescribeDomainRealTimeSrcHttpCodeData  DescribeDomainRealTimeSrcHttpCodeDataRequest
     * @return DescribeDomainRealTimeSrcHttpCodeDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeSrcHttpCodeDataResponse> describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last hour by default. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainRealTimeSrcTrafficData  DescribeDomainRealTimeSrcTrafficDataRequest
     * @return DescribeDomainRealTimeSrcTrafficDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeSrcTrafficDataResponse> describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account.</p>
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
     * @param request the request parameters of DescribeDomainRealTimeTrafficData  DescribeDomainRealTimeTrafficDataRequest
     * @return DescribeDomainRealTimeTrafficDataResponse
     */
    CompletableFuture<DescribeDomainRealTimeTrafficDataResponse> describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainRealtimeLogDelivery  DescribeDomainRealtimeLogDeliveryRequest
     * @return DescribeDomainRealtimeLogDeliveryResponse
     */
    CompletableFuture<DescribeDomainRealtimeLogDeliveryResponse> describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you not use this operation because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, data collected within the last <strong>24</strong> hours is queried. If you specify both the <strong>StartTime</strong> and <strong>EndTime</strong> parameters, data collected within the specified time range is queried.</li>
     * <li>There is delay in data collection. If you want to query data collected within the last day, we recommend that you query the data on the next day.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainRegionData  DescribeDomainRegionDataRequest
     * @return DescribeDomainRegionDataResponse
     */
    CompletableFuture<DescribeDomainRegionDataResponse> describeDomainRegionData(DescribeDomainRegionDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainReqHitRateData  DescribeDomainReqHitRateDataRequest
     * @return DescribeDomainReqHitRateDataResponse
     */
    CompletableFuture<DescribeDomainReqHitRateDataResponse> describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you specify both the StartTime and EndTime parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainSrcBpsData  DescribeDomainSrcBpsDataRequest
     * @return DescribeDomainSrcBpsDataResponse
     */
    CompletableFuture<DescribeDomainSrcBpsDataResponse> describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter varies with the maximum time range per query. The following table describes the time period within which historical data is available and the data delay.<table>
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
     * @param request the request parameters of DescribeDomainSrcHttpCodeData  DescribeDomainSrcHttpCodeDataRequest
     * @return DescribeDomainSrcHttpCodeDataResponse
     */
    CompletableFuture<DescribeDomainSrcHttpCodeDataResponse> describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.</p>
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
     * @param request the request parameters of DescribeDomainSrcQpsData  DescribeDomainSrcQpsDataRequest
     * @return DescribeDomainSrcQpsDataResponse
     */
    CompletableFuture<DescribeDomainSrcQpsDataResponse> describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>The data is collected at an interval of 5 minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainSrcTopUrlVisit  DescribeDomainSrcTopUrlVisitRequest
     * @return DescribeDomainSrcTopUrlVisitResponse
     */
    CompletableFuture<DescribeDomainSrcTopUrlVisitResponse> describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * @param request the request parameters of DescribeDomainSrcTrafficData  DescribeDomainSrcTrafficDataRequest
     * @return DescribeDomainSrcTrafficDataResponse
     */
    CompletableFuture<DescribeDomainSrcTrafficDataResponse> describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature to for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected every hour.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainTopClientIpVisit  DescribeDomainTopClientIpVisitRequest
     * @return DescribeDomainTopClientIpVisitResponse
     */
    CompletableFuture<DescribeDomainTopClientIpVisitResponse> describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature or <a href="https://help.aliyun.com/document_detail/440145.html">ship real-time logs in Log Service</a> to analyze data.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>Data is collected at an interval of five minutes.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainTopReferVisit  DescribeDomainTopReferVisitRequest
     * @return DescribeDomainTopReferVisitResponse
     */
    CompletableFuture<DescribeDomainTopReferVisitResponse> describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can query data collected in the last 90 days.</li>
     * <li>You can specify only one domain name in each call.</li>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainTopUrlVisit  DescribeDomainTopUrlVisitRequest
     * @return DescribeDomainTopUrlVisitResponse
     */
    CompletableFuture<DescribeDomainTopUrlVisitResponse> describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
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
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainTrafficData  DescribeDomainTrafficDataRequest
     * @return DescribeDomainTrafficDataResponse
     */
    CompletableFuture<DescribeDomainTrafficDataResponse> describeDomainTrafficData(DescribeDomainTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
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
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainUsageData  DescribeDomainUsageDataRequest
     * @return DescribeDomainUsageDataResponse
     */
    CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify only one accelerated domain name or all accelerated domain names in your Alibaba Cloud account.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainUvData  DescribeDomainUvDataRequest
     * @return DescribeDomainUvDataResponse
     */
    CompletableFuture<DescribeDomainUvDataResponse> describeDomainUvData(DescribeDomainUvDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the verification content of an accelerated domain name based on whether the global resource plan is enabled.</p>
     * 
     * @param request the request parameters of DescribeDomainVerifyData  DescribeDomainVerifyDataRequest
     * @return DescribeDomainVerifyDataResponse
     */
    CompletableFuture<DescribeDomainVerifyDataResponse> describeDomainVerifyData(DescribeDomainVerifyDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainsBySource  DescribeDomainsBySourceRequest
     * @return DescribeDomainsBySourceResponse
     */
    CompletableFuture<DescribeDomainsBySourceResponse> describeDomainsBySource(DescribeDomainsBySourceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>If you do not set StartTime or EndTime, data within the last 24 hours is queried. If you set both StartTime and EndTime, data within the specified time range is queried.</li>
     * <li>You can query the monitoring data of a specific accelerated domain name or all accelerated domain names that belong to your Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainsUsageByDay  DescribeDomainsUsageByDayRequest
     * @return DescribeDomainsUsageByDayResponse
     */
    CompletableFuture<DescribeDomainsUsageByDayResponse> describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeEsExceptionData  DescribeEsExceptionDataRequest
     * @return DescribeEsExceptionDataResponse
     */
    CompletableFuture<DescribeEsExceptionDataResponse> describeEsExceptionData(DescribeEsExceptionDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeEsExecuteData  DescribeEsExecuteDataRequest
     * @return DescribeEsExecuteDataResponse
     */
    CompletableFuture<DescribeEsExecuteDataResponse> describeEsExecuteData(DescribeEsExecuteDataRequest request);

    /**
     * @param request the request parameters of DescribeFCTrigger  DescribeFCTriggerRequest
     * @return DescribeFCTriggerResponse
     */
    CompletableFuture<DescribeFCTriggerResponse> describeFCTrigger(DescribeFCTriggerRequest request);

    /**
     * @param request the request parameters of DescribeIpInfo  DescribeIpInfoRequest
     * @return DescribeIpInfoResponse
     */
    CompletableFuture<DescribeIpInfoResponse> describeIpInfo(DescribeIpInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 50 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeIpStatus  DescribeIpStatusRequest
     * @return DescribeIpStatusResponse
     */
    CompletableFuture<DescribeIpStatusResponse> describeIpStatus(DescribeIpStatusRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to users whose daily peak bandwidth value is higher than 1 Gbit/s. If you meet this requirement, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex">submit a ticket</a> to apply for permissions to use this operation.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeL2VipsByDomain  DescribeL2VipsByDomainRequest
     * @return DescribeL2VipsByDomainResponse
     */
    CompletableFuture<DescribeL2VipsByDomainResponse> describeL2VipsByDomain(DescribeL2VipsByDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query data within the last 3 days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePreloadDetailById  DescribePreloadDetailByIdRequest
     * @return DescribePreloadDetailByIdResponse
     */
    CompletableFuture<DescribePreloadDetailByIdResponse> describePreloadDetailById(DescribePreloadDetailByIdRequest request);

    /**
     * <b>description</b> :
     * <p>  The data is collected every 5 minutes.</p>
     * <ul>
     * <li>You can call this operation up to 20 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRangeDataByLocateAndIspService  DescribeRangeDataByLocateAndIspServiceRequest
     * @return DescribeRangeDataByLocateAndIspServiceResponse
     */
    CompletableFuture<DescribeRangeDataByLocateAndIspServiceResponse> describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRealtimeDeliveryAcc  DescribeRealtimeDeliveryAccRequest
     * @return DescribeRealtimeDeliveryAccResponse
     */
    CompletableFuture<DescribeRealtimeDeliveryAccResponse> describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the maximum and remaining numbers of URLs and directories that can be refreshed, the maximum and remaining numbers of times that you can prefetch content, and the maximum and remaining numbers of URLs and directories that can be blocked on the current day.</p>
     * 
     * @param request the request parameters of DescribeRefreshQuota  DescribeRefreshQuotaRequest
     * @return DescribeRefreshQuotaResponse
     */
    CompletableFuture<DescribeRefreshQuotaResponse> describeRefreshQuota(DescribeRefreshQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query data in the last three days.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRefreshTaskById  DescribeRefreshTaskByIdRequest
     * @return DescribeRefreshTaskByIdResponse
     */
    CompletableFuture<DescribeRefreshTaskByIdResponse> describeRefreshTaskById(DescribeRefreshTaskByIdRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query the status of tasks by task ID or URL.</p>
     * <ul>
     * <li>You can set both the <strong>TaskId</strong> and <strong>ObjectPath</strong> parameters. If you do not set the <strong>TaskId</strong> or <strong>ObjectPath</strong> parameter, data entries on the first page (20 entries) collected in the last 3 days are returned.</li>
     * <li>You can query data collected in the last 3 days.</li>
     * <li>If auto CDN cache update is enabled in the Object Storage Service (OSS) console, you cannot call the DescribeRefreshTasks operation to query automatic refresh tasks in OSS.</li>
     * <li>You can call this operation up to 10 times per second per account. If you want to query tasks at a higher frequency, call the <a href="https://help.aliyun.com/document_detail/187709.html">DescribeRefreshTaskById</a> operation. This operation allows you to query tasks by task ID.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRefreshTasks  DescribeRefreshTasksRequest
     * @return DescribeRefreshTasksResponse
     */
    CompletableFuture<DescribeRefreshTasksResponse> describeRefreshTasks(DescribeRefreshTasksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum number of times that each user can call this operation per second is 30.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeStagingIp  DescribeStagingIpRequest
     * @return DescribeStagingIpResponse
     */
    CompletableFuture<DescribeStagingIpResponse> describeStagingIp(DescribeStagingIpRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 10.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTagResources  DescribeTagResourcesRequest
     * @return DescribeTagResourcesResponse
     */
    CompletableFuture<DescribeTagResourcesResponse> describeTagResources(DescribeTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical analysis feature of Alibaba Cloud CDN is no longer available. The API operations related to the statistical analysis feature are no longer maintained. We recommend that you do not use the API operations because data may be missing or inaccurate. You can use the <a href="https://help.aliyun.com/document_detail/279577.html">operations report</a> feature for data analysis.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not set the <strong>StartTime</strong> or <strong>EndTime</strong> parameter, the request returns the data collected in the current month. If you set both these parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTopDomainsByFlow  DescribeTopDomainsByFlowRequest
     * @return DescribeTopDomainsByFlowResponse
     */
    CompletableFuture<DescribeTopDomainsByFlowResponse> describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request);

    /**
     * @param request the request parameters of DescribeUserCdnStatus  DescribeUserCdnStatusRequest
     * @return DescribeUserCdnStatusResponse
     */
    CompletableFuture<DescribeUserCdnStatusResponse> describeUserCdnStatus(DescribeUserCdnStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserCertificateExpireCount  DescribeUserCertificateExpireCountRequest
     * @return DescribeUserCertificateExpireCountResponse
     */
    CompletableFuture<DescribeUserCertificateExpireCountResponse> describeUserCertificateExpireCount(DescribeUserCertificateExpireCountRequest request);

    /**
     * @deprecated OpenAPI DescribeUserConfigs is deprecated  * @param request  the request parameters of DescribeUserConfigs  DescribeUserConfigsRequest
     * @return DescribeUserConfigsResponse
     */
    @Deprecated
    CompletableFuture<DescribeUserConfigsResponse> describeUserConfigs(DescribeUserConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can specify up to 50 domain names in each request. Separate multiple domain names with commas (,).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserDomains  DescribeUserDomainsRequest
     * @return DescribeUserDomainsResponse
     */
    CompletableFuture<DescribeUserDomainsResponse> describeUserDomains(DescribeUserDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserTags  DescribeUserTagsRequest
     * @return DescribeUserTagsResponse
     */
    CompletableFuture<DescribeUserTagsResponse> describeUserTags(DescribeUserTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserUsageDataExportTask  DescribeUserUsageDataExportTaskRequest
     * @return DescribeUserUsageDataExportTaskResponse
     */
    CompletableFuture<DescribeUserUsageDataExportTaskResponse> describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation has been available since July 20, 2018. You can query information about resource usage collected within the last three months.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserUsageDetailDataExportTask  DescribeUserUsageDetailDataExportTaskRequest
     * @return DescribeUserUsageDetailDataExportTaskResponse
     */
    CompletableFuture<DescribeUserUsageDetailDataExportTaskResponse> describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUserVipsByDomain  DescribeUserVipsByDomainRequest
     * @return DescribeUserVipsByDomainResponse
     */
    CompletableFuture<DescribeUserVipsByDomainResponse> describeUserVipsByDomain(DescribeUserVipsByDomainRequest request);

    /**
     * @param request the request parameters of DescribeVerifyContent  DescribeVerifyContentRequest
     * @return DescribeVerifyContentResponse
     */
    CompletableFuture<DescribeVerifyContentResponse> describeVerifyContent(DescribeVerifyContentRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableRealtimeLogDelivery  DisableRealtimeLogDeliveryRequest
     * @return DisableRealtimeLogDeliveryResponse
     */
    CompletableFuture<DisableRealtimeLogDeliveryResponse> disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The maximum number of times that each user can call this operation per second is 100.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableRealtimeLogDelivery  EnableRealtimeLogDeliveryRequest
     * @return EnableRealtimeLogDeliveryResponse
     */
    CompletableFuture<EnableRealtimeLogDeliveryResponse> enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDomainsByLogConfigId  ListDomainsByLogConfigIdRequest
     * @return ListDomainsByLogConfigIdResponse
     */
    CompletableFuture<ListDomainsByLogConfigIdResponse> listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListFCTrigger  ListFCTriggerRequest
     * @return ListFCTriggerResponse
     */
    CompletableFuture<ListFCTriggerResponse> listFCTrigger(ListFCTriggerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRealtimeLogDeliveryDomains  ListRealtimeLogDeliveryDomainsRequest
     * @return ListRealtimeLogDeliveryDomainsResponse
     */
    CompletableFuture<ListRealtimeLogDeliveryDomainsResponse> listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRealtimeLogDeliveryInfos  ListRealtimeLogDeliveryInfosRequest
     * @return ListRealtimeLogDeliveryInfosResponse
     */
    CompletableFuture<ListRealtimeLogDeliveryInfosResponse> listRealtimeLogDeliveryInfos(ListRealtimeLogDeliveryInfosRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListUserCustomLogConfig  ListUserCustomLogConfigRequest
     * @return ListUserCustomLogConfigResponse
     */
    CompletableFuture<ListUserCustomLogConfigResponse> listUserCustomLogConfig(ListUserCustomLogConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyCdnDomain  ModifyCdnDomainRequest
     * @return ModifyCdnDomainResponse
     */
    CompletableFuture<ModifyCdnDomainResponse> modifyCdnDomain(ModifyCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used in the following scenario:</p>
     * <ul>
     * <li>You have multiple Alibaba Cloud accounts and want to transfer domain names from Account A to Account B.</li>
     * <li>You are prompted that a domain name has been added when you add the domain name to Alibaba Cloud CDN. You do not know which account does the domain name belong to, and you want to transfer the domain name to your current account.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCdnDomainOwner  ModifyCdnDomainOwnerRequest
     * @return ModifyCdnDomainOwnerResponse
     */
    CompletableFuture<ModifyCdnDomainOwnerResponse> modifyCdnDomainOwner(ModifyCdnDomainOwnerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyCdnDomainSchdmByProperty  ModifyCdnDomainSchdmByPropertyRequest
     * @return ModifyCdnDomainSchdmByPropertyResponse
     */
    CompletableFuture<ModifyCdnDomainSchdmByPropertyResponse> modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request);

    /**
     * @param request the request parameters of ModifyCdnService  ModifyCdnServiceRequest
     * @return ModifyCdnServiceResponse
     */
    CompletableFuture<ModifyCdnServiceResponse> modifyCdnService(ModifyCdnServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyRealtimeLogDelivery  ModifyRealtimeLogDeliveryRequest
     * @return ModifyRealtimeLogDeliveryResponse
     */
    CompletableFuture<ModifyRealtimeLogDeliveryResponse> modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN can be activated only once per Alibaba Cloud account. The Alibaba Cloud account must complete real-name verification to activate Alibaba Cloud CDN.</p>
     * <ul>
     * <li>You can call this operation up to five times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenCdnService  OpenCdnServiceRequest
     * @return OpenCdnServiceResponse
     */
    CompletableFuture<OpenCdnServiceResponse> openCdnService(OpenCdnServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PublishStagingConfigToProduction  PublishStagingConfigToProductionRequest
     * @return PublishStagingConfigToProductionResponse
     */
    CompletableFuture<PublishStagingConfigToProductionResponse> publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request);

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 1,000 URLs per day. If the daily peak bandwidth value of your workloads exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to increase your daily quota. Alibaba Cloud reviews your application and then increases the quota accordingly.</li>
     * <li>You can specify at most 100 URLs in each prefetch request.</li>
     * <li>For each Alibaba Cloud account, the prefetch queue can contain up to 50,000 URLs. Content is prefetched based on the time when the URLs are submitted. The URL that is submitted the earliest has the highest priority. If the number of URLs in the queue reaches 50,000, you cannot submit more URLs until the number drops below 50,000.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * <li>For more information about how to automate refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a prefetch task is submitted and completed, the POPs immediately start to retrieve resources from the origin server. Therefore, a large number of refresh tasks cause a large number of concurrent download tasks. This increases the number of requests that are redirected to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>The time required for a prefetch task to complete is proportional to the size of the prefetched file. In actual practice, most prefetch tasks require 5 to 30 minutes to complete. A task with a smaller average file size requires less time.</li>
     * <li>To allow RAM users to perform this operation, you must first grant them the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of PushObjectCache  PushObjectCacheRequest
     * @return PushObjectCacheResponse
     */
    CompletableFuture<PushObjectCacheResponse> pushObjectCache(PushObjectCacheRequest request);

    /**
     * @param request the request parameters of RefreshObjectCacheByCacheTag  RefreshObjectCacheByCacheTagRequest
     * @return RefreshObjectCacheByCacheTagResponse
     */
    CompletableFuture<RefreshObjectCacheByCacheTagResponse> refreshObjectCacheByCacheTag(RefreshObjectCacheByCacheTagRequest request);

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud CDN supports POST requests in which parameters are sent as a form.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/91164.html">RefreshObjectCaches</a> operation to refresh content and call the <a href="https://help.aliyun.com/document_detail/91161.html">PushObjectCache</a> operation to prefetch content.</li>
     * <li>You can call the RefreshObjectCaches operation up to 50 times per second per account.</li>
     * <li>For more information about how to automatically refresh or prefetch tasks, see <a href="https://help.aliyun.com/document_detail/151829.html">Run scripts to refresh and prefetch content</a>.</li>
     * </ul>
     * <h2>Precautions</h2>
     * <ul>
     * <li>After a refresh task is submitted and completed, specific resources are removed from POPs. When a POP receives a request for the removed resources, the POP forwards the request to the origin server to retrieve the resources. The retrieved resources are returned to the client and cached on the POP. Multiple refresh tasks may cause a large number of resources to be removed from the POPs. This increases the number of requests that are forwarded to the origin server. The back-to-origin routing process consumes more bandwidth resources and the origin server may be overwhelmed.</li>
     * <li>A refresh task takes effect 5 to 6 minutes after being submitted. This means that if the resource you want to refresh has a TTL of less than five minutes, you wait for it to expire instead of manually running a refresh task.</li>
     * <li>If you want to use RAM users to refresh or prefetch resources, you must obtain the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/260300.html">Authorize a RAM user to prefetch and refresh resources</a>.</li>
     * </ul>
     * <h3>Refresh quota</h3>
     * <ul>
     * <li>By default, each Alibaba Cloud account can refresh content from up to 10,000 URLs and 100 directories per day. The directories include subdirectories. If the daily peak bandwidth value exceeds 200 Mbit/s, you can <a href="https://account.alibabacloud.com/login/login.htm?oauth_callback=https%3A//ticket-intl.console.aliyun.com/%23/ticket/createIndex">submit a ticket</a> to request a quota increase. Alibaba Cloud CDN evaluates your application based on your workloads.</li>
     * <li>By default, each Alibaba Cloud account can submit up to 20 refresh rules that contain regular expressions per day. If the daily peak bandwidth of your Alibaba Cloud account exceeds 10 Gbit/s, you can <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> to request a quota increase.</li>
     * <li>You can specify up to 1,000 URL refresh rules, 100 directory refresh rules, or 1 refresh rule that contains regular expressions in each call.</li>
     * <li>You can refresh up to 1,000 URLs per minute for each domain name.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshObjectCaches  RefreshObjectCachesRequest
     * @return RefreshObjectCachesResponse
     */
    CompletableFuture<RefreshObjectCachesResponse> refreshObjectCaches(RefreshObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RollbackStagingConfig  RollbackStagingConfigRequest
     * @return RollbackStagingConfigResponse
     */
    CompletableFuture<RollbackStagingConfigResponse> rollbackStagingConfig(RollbackStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCdnDomainCSRCertificate  SetCdnDomainCSRCertificateRequest
     * @return SetCdnDomainCSRCertificateResponse
     */
    CompletableFuture<SetCdnDomainCSRCertificateResponse> setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCdnDomainSMCertificate  SetCdnDomainSMCertificateRequest
     * @return SetCdnDomainSMCertificateResponse
     */
    CompletableFuture<SetCdnDomainSMCertificateResponse> setCdnDomainSMCertificate(SetCdnDomainSMCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 30 times per second per account.</p>
     * <ul>
     * <li>Method: POST.</li>
     * </ul>
     * 
     * @param request the request parameters of SetCdnDomainSSLCertificate  SetCdnDomainSSLCertificateRequest
     * @return SetCdnDomainSSLCertificateResponse
     */
    CompletableFuture<SetCdnDomainSSLCertificateResponse> setCdnDomainSSLCertificate(SetCdnDomainSSLCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCdnDomainStagingConfig  SetCdnDomainStagingConfigRequest
     * @return SetCdnDomainStagingConfigResponse
     */
    CompletableFuture<SetCdnDomainStagingConfigResponse> setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request);

    /**
     * @param request the request parameters of SetCdnFullDomainsBlockIP  SetCdnFullDomainsBlockIPRequest
     * @return SetCdnFullDomainsBlockIPResponse
     */
    CompletableFuture<SetCdnFullDomainsBlockIPResponse> setCdnFullDomainsBlockIP(SetCdnFullDomainsBlockIPRequest request);

    /**
     * @deprecated OpenAPI SetDomainServerCertificate is deprecated, please use Cdn::2018-05-10::SetCdnDomainSSLCertificate instead.  * @description *   You can call this operation up to 10 times per second per user.
     * *   Method: POST.
     * 
     * @param request the request parameters of SetDomainServerCertificate  SetDomainServerCertificateRequest
     * @return SetDomainServerCertificateResponse
     */
    @Deprecated
    CompletableFuture<SetDomainServerCertificateResponse> setDomainServerCertificate(SetDomainServerCertificateRequest request);

    /**
     * @param request the request parameters of SetReqHeaderConfig  SetReqHeaderConfigRequest
     * @return SetReqHeaderConfigResponse
     */
    CompletableFuture<SetReqHeaderConfigResponse> setReqHeaderConfig(SetReqHeaderConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetWaitingRoomConfig  SetWaitingRoomConfigRequest
     * @return SetWaitingRoomConfigResponse
     */
    CompletableFuture<SetWaitingRoomConfigResponse> setWaitingRoomConfig(SetWaitingRoomConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  If the domain name is in an invalid state or you have an overdue payment in your account, the domain name cannot be enabled.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StartCdnDomain  StartCdnDomainRequest
     * @return StartCdnDomainResponse
     */
    CompletableFuture<StartCdnDomainResponse> startCdnDomain(StartCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  After an accelerated domain is disabled, Alibaba Cloud CDN retains its information and routes all the requests that are destined for the accelerated domain to the origin server.</p>
     * <ul>
     * <li>You can call this operation up to 40 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of StopCdnDomain  StopCdnDomainRequest
     * @return StopCdnDomainResponse
     */
    CompletableFuture<StopCdnDomainResponse> stopCdnDomain(StopCdnDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateCdnDeliverTask  UpdateCdnDeliverTaskRequest
     * @return UpdateCdnDeliverTaskResponse
     */
    CompletableFuture<UpdateCdnDeliverTaskResponse> updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to three times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateCdnSubTask  UpdateCdnSubTaskRequest
     * @return UpdateCdnSubTaskResponse
     */
    CompletableFuture<UpdateCdnSubTaskResponse> updateCdnSubTask(UpdateCdnSubTaskRequest request);

    /**
     * @param request the request parameters of UpdateFCTrigger  UpdateFCTriggerRequest
     * @return UpdateFCTriggerResponse
     */
    CompletableFuture<UpdateFCTriggerResponse> updateFCTrigger(UpdateFCTriggerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of VerifyDomainOwner  VerifyDomainOwnerRequest
     * @return VerifyDomainOwnerResponse
     */
    CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwner(VerifyDomainOwnerRequest request);

}
