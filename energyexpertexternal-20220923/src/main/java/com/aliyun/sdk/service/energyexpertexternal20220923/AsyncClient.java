// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.energyexpertexternal20220923.models.*;
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
     * @param request the request parameters of BatchSaveInstructionStatus  BatchSaveInstructionStatusRequest
     * @return BatchSaveInstructionStatusResponse
     */
    CompletableFuture<BatchSaveInstructionStatusResponse> batchSaveInstructionStatus(BatchSaveInstructionStatusRequest request);

    /**
     * @param request the request parameters of BatchUpdateSystemRunningPlan  BatchUpdateSystemRunningPlanRequest
     * @return BatchUpdateSystemRunningPlanResponse
     */
    CompletableFuture<BatchUpdateSystemRunningPlanResponse> batchUpdateSystemRunningPlan(BatchUpdateSystemRunningPlanRequest request);

    /**
     * @param request the request parameters of EditProhibitedDevices  EditProhibitedDevicesRequest
     * @return EditProhibitedDevicesResponse
     */
    CompletableFuture<EditProhibitedDevicesResponse> editProhibitedDevices(EditProhibitedDevicesRequest request);

    /**
     * @param request the request parameters of EditUnfavorableAreaDevices  EditUnfavorableAreaDevicesRequest
     * @return EditUnfavorableAreaDevicesResponse
     */
    CompletableFuture<EditUnfavorableAreaDevicesResponse> editUnfavorableAreaDevices(EditUnfavorableAreaDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\&quot;s status can be checked using the <code>IsCompleted</code> API. Following the generation of results, other result inquiry APIs can be accessed for display content.</p>
     * 
     * @param request the request parameters of GenerateResult  GenerateResultRequest
     * @return GenerateResultResponse
     */
    CompletableFuture<GenerateResultResponse> generateResult(GenerateResultRequest request);

    /**
     * @param request the request parameters of GetAreaElecConstitute  GetAreaElecConstituteRequest
     * @return GetAreaElecConstituteResponse
     */
    CompletableFuture<GetAreaElecConstituteResponse> getAreaElecConstitute(GetAreaElecConstituteRequest request);

    /**
     * @param request the request parameters of GetCarbonEmissionTrend  GetCarbonEmissionTrendRequest
     * @return GetCarbonEmissionTrendResponse
     */
    CompletableFuture<GetCarbonEmissionTrendResponse> getCarbonEmissionTrend(GetCarbonEmissionTrendRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>obtain data item detail list under the current enterprise.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataItemList  GetDataItemListRequest
     * @return GetDataItemListResponse
     */
    CompletableFuture<GetDataItemListResponse> getDataItemList(GetDataItemListRequest request);

    /**
     * <b>description</b> :
     * <p>This API returns the data quality evaluation results based on the user-provided product ID. It\&quot;s useful for understanding the data quality of the carbon emission factors for each inventory of the product.</p>
     * 
     * @param request the request parameters of GetDataQualityAnalysis  GetDataQualityAnalysisRequest
     * @return GetDataQualityAnalysisResponse
     */
    CompletableFuture<GetDataQualityAnalysisResponse> getDataQualityAnalysis(GetDataQualityAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeviceInfo  GetDeviceInfoRequest
     * @return GetDeviceInfoResponse
     */
    CompletableFuture<GetDeviceInfoResponse> getDeviceInfo(GetDeviceInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.</p>
     * <ul>
     * <li>Virtual meters at the site are not returned.</li>
     * </ul>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDeviceList  GetDeviceListRequest
     * @return GetDeviceListResponse
     */
    CompletableFuture<GetDeviceListResponse> getDeviceList(GetDeviceListRequest request);

    /**
     * @param request the request parameters of GetDocumentAnalyzeResult  GetDocumentAnalyzeResultRequest
     * @return GetDocumentAnalyzeResultResponse
     */
    CompletableFuture<GetDocumentAnalyzeResultResponse> getDocumentAnalyzeResult(GetDocumentAnalyzeResultRequest request);

    /**
     * @param request the request parameters of GetElecConstitute  GetElecConstituteRequest
     * @return GetElecConstituteResponse
     */
    CompletableFuture<GetElecConstituteResponse> getElecConstitute(GetElecConstituteRequest request);

    /**
     * @param request the request parameters of GetElecTrend  GetElecTrendRequest
     * @return GetElecTrendResponse
     */
    CompletableFuture<GetElecTrendResponse> getElecTrend(GetElecTrendRequest request);

    /**
     * @param request the request parameters of GetEmissionSourceConstitute  GetEmissionSourceConstituteRequest
     * @return GetEmissionSourceConstituteResponse
     */
    CompletableFuture<GetEmissionSourceConstituteResponse> getEmissionSourceConstitute(GetEmissionSourceConstituteRequest request);

    /**
     * @param request the request parameters of GetEmissionSummary  GetEmissionSummaryRequest
     * @return GetEmissionSummaryResponse
     */
    CompletableFuture<GetEmissionSummaryResponse> getEmissionSummary(GetEmissionSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.</p>
     * 
     * @param request the request parameters of GetEpdInventoryConstitute  GetEpdInventoryConstituteRequest
     * @return GetEpdInventoryConstituteResponse
     */
    CompletableFuture<GetEpdInventoryConstituteResponse> getEpdInventoryConstitute(GetEpdInventoryConstituteRequest request);

    /**
     * <b>description</b> :
     * <p>This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.</p>
     * 
     * @param request the request parameters of GetEpdSummary  GetEpdSummaryRequest
     * @return GetEpdSummaryResponse
     */
    CompletableFuture<GetEpdSummaryResponse> getEpdSummary(GetEpdSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\&quot;s detailed information.</p>
     * 
     * @param request the request parameters of GetFootprintList  GetFootprintListRequest
     * @return GetFootprintListResponse
     */
    CompletableFuture<GetFootprintListResponse> getFootprintList(GetFootprintListRequest request);

    /**
     * @param request the request parameters of GetGasConstitute  GetGasConstituteRequest
     * @return GetGasConstituteResponse
     */
    CompletableFuture<GetGasConstituteResponse> getGasConstitute(GetGasConstituteRequest request);

    /**
     * <b>description</b> :
     * <p>This interface returns a list of proactive carbon reduction information given product ID. It\&quot;s used to understand the carbon reduction efforts at various levels of the product.</p>
     * 
     * @param request the request parameters of GetGwpBenchmarkList  GetGwpBenchmarkListRequest
     * @return GetGwpBenchmarkListResponse
     */
    CompletableFuture<GetGwpBenchmarkListResponse> getGwpBenchmarkList(GetGwpBenchmarkListRequest request);

    /**
     * <b>description</b> :
     * <p>The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.</p>
     * 
     * @param request the request parameters of GetGwpBenchmarkSummary  GetGwpBenchmarkSummaryRequest
     * @return GetGwpBenchmarkSummaryResponse
     */
    CompletableFuture<GetGwpBenchmarkSummaryResponse> getGwpBenchmarkSummary(GetGwpBenchmarkSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.</p>
     * 
     * @param request the request parameters of GetGwpInventoryConstitute  GetGwpInventoryConstituteRequest
     * @return GetGwpInventoryConstituteResponse
     */
    CompletableFuture<GetGwpInventoryConstituteResponse> getGwpInventoryConstitute(GetGwpInventoryConstituteRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.</p>
     * 
     * @param request the request parameters of GetGwpInventorySummary  GetGwpInventorySummaryRequest
     * @return GetGwpInventorySummaryResponse
     */
    CompletableFuture<GetGwpInventorySummaryResponse> getGwpInventorySummary(GetGwpInventorySummaryRequest request);

    /**
     * <b>description</b> :
     * <p>This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\&quot;s used to understand various environmental impact emission scenarios.</p>
     * 
     * @param request the request parameters of GetInventoryList  GetInventoryListRequest
     * @return GetInventoryListResponse
     */
    CompletableFuture<GetInventoryListResponse> getInventoryList(GetInventoryListRequest request);

    /**
     * <b>description</b> :
     * <p>  If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.</p>
     * <ul>
     * <li>By current, endpoint only supports Hangzhou: <code>energyexpertexternal.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>To use this API, you need to be added to the whitelist. Please contact us through  &lt;props=&quot;china&quot;&gt;<a href="https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89">official website</a> 
     * &lt;props=&quot;intl&quot;&gt;<a href="https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en">official website</a> to apply for whitelist activation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetOrgAndFactory  GetOrgAndFactoryRequest
     * @return GetOrgAndFactoryResponse
     */
    CompletableFuture<GetOrgAndFactoryResponse> getOrgAndFactory(GetOrgAndFactoryRequest request);

    /**
     * @param request the request parameters of GetOrgConstitute  GetOrgConstituteRequest
     * @return GetOrgConstituteResponse
     */
    CompletableFuture<GetOrgConstituteResponse> getOrgConstitute(GetOrgConstituteRequest request);

    /**
     * <b>description</b> :
     * <p>With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.</p>
     * 
     * @param request the request parameters of GetPcrInfo  GetPcrInfoRequest
     * @return GetPcrInfoResponse
     */
    CompletableFuture<GetPcrInfoResponse> getPcrInfo(GetPcrInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This API returns carbon reduction proposals based on the product ID. It\&quot;s useful for understanding optimization tips to reduce the carbon emissions associated with a product.</p>
     * 
     * @param request the request parameters of GetReductionProposal  GetReductionProposalRequest
     * @return GetReductionProposalResponse
     */
    CompletableFuture<GetReductionProposalResponse> getReductionProposal(GetReductionProposalRequest request);

    /**
     * <b>description</b> :
     * <p>This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.</p>
     * 
     * @param request the request parameters of IsCompleted  IsCompletedRequest
     * @return IsCompletedResponse
     */
    CompletableFuture<IsCompletedResponse> isCompleted(IsCompletedRequest request);

    /**
     * @param request the request parameters of PushDeviceData  PushDeviceDataRequest
     * @return PushDeviceDataResponse
     */
    CompletableFuture<PushDeviceDataResponse> pushDeviceData(PushDeviceDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This interface is used for individual data item data.</li>
     * <li>Data items can link data to services such as carbon footprints and carbon inventories.</li>
     * <li>Depending on the platform configuration, active data on a yearly and monthly basis is supported.</li>
     * </ul>
     * 
     * @param request the request parameters of PushItemData  PushItemDataRequest
     * @return PushItemDataResponse
     */
    CompletableFuture<PushItemDataResponse> pushItemData(PushItemDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After uploading the data items, you need to call this interface to recalculate the carbon inventory data.</li>
     * </ul>
     * 
     * @param request the request parameters of RecalculateCarbonEmission  RecalculateCarbonEmissionRequest
     * @return RecalculateCarbonEmissionResponse
     */
    CompletableFuture<RecalculateCarbonEmissionResponse> recalculateCarbonEmission(RecalculateCarbonEmissionRequest request);

    /**
     * @param request the request parameters of SendDocumentAskQuestion  SendDocumentAskQuestionRequest
     * @return SendDocumentAskQuestionResponse
     */
    CompletableFuture<SendDocumentAskQuestionResponse> sendDocumentAskQuestion(SendDocumentAskQuestionRequest request);

    /**
     * @param request the request parameters of SetRunningPlan  SetRunningPlanRequest
     * @return SetRunningPlanResponse
     */
    CompletableFuture<SetRunningPlanResponse> setRunningPlan(SetRunningPlanRequest request);

}
