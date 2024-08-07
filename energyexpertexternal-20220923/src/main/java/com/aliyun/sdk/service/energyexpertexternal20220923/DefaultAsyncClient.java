// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.energyexpertexternal20220923.models.*;
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
        this.product = "energyExpertExternal";
        this.version = "2022-09-23";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * Given a product ID, this API initiates a task to calculate the carbon footprint result for the corresponding product. The task\\"s status can be checked using the `IsCompleted` API. Following the generation of results, other result inquiry APIs can be accessed for display content.
      *
     */
    @Override
    public CompletableFuture<GenerateResultResponse> generateResult(GenerateResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateResult").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/generate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAreaElecConstituteResponse> getAreaElecConstitute(GetAreaElecConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAreaElecConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/elec/area").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAreaElecConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAreaElecConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCarbonEmissionTrendResponse> getCarbonEmissionTrend(GetCarbonEmissionTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCarbonEmissionTrend").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/trend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCarbonEmissionTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCarbonEmissionTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * - obtain data item detail list under the current enterprise.
      *
     */
    @Override
    public CompletableFuture<GetDataItemListResponse> getDataItemList(GetDataItemListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataItemList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/data/item/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataItemListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataItemListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This API returns the data quality evaluation results based on the user-provided product ID. It\\"s useful for understanding the data quality of the carbon emission factors for each inventory of the product.
      *
     */
    @Override
    public CompletableFuture<GetDataQualityAnalysisResponse> getDataQualityAnalysis(GetDataQualityAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataQualityAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/data/quality/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call this operation to query the parameters of a data collection device based on the device ID. If the verification is passed, the device parameters are returned. If the verification fails, a null value is returned.
      * *   You can query the parameters of a single device by day. If data of the device does not exist, a null value is returned.
      * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
      * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89)</props> 
      * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en)</props> to apply for whitelist activation.
      *
     */
    @Override
    public CompletableFuture<GetDeviceInfoResponse> getDeviceInfo(GetDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceInfo").setMethod(HttpMethod.GET).setPathRegex("/api/external/getDeviceInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can query the information about data collection devices of a site based on the ID of the site. If the verification is passed, the information about the devices of the site is returned. If the verification fails, a null value is returned.
      * *   Virtual meters at the site are not returned.
      * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
      * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89)</props> 
      * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en)</props> to apply for whitelist activation.
      *
     */
    @Override
    public CompletableFuture<GetDeviceListResponse> getDeviceList(GetDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeviceList").setMethod(HttpMethod.GET).setPathRegex("/api/external/getDeviceList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDocumentAnalyzeResultResponse> getDocumentAnalyzeResult(GetDocumentAnalyzeResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentAnalyzeResult").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aidoc/document/getDocumentAnalyzeResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentAnalyzeResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentAnalyzeResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetElecConstituteResponse> getElecConstitute(GetElecConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetElecConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/elec/constitute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetElecConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetElecConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetElecTrendResponse> getElecTrend(GetElecTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetElecTrend").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/elec/trend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetElecTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetElecTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetEmissionSourceConstituteResponse> getEmissionSourceConstitute(GetEmissionSourceConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmissionSourceConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/constitute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmissionSourceConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmissionSourceConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetEmissionSummaryResponse> getEmissionSummary(GetEmissionSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmissionSummary").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmissionSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmissionSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This API returns the emission amounts for various environmental impact categories at different levels for the given product ID. It helps understand the emission quantities for different environmental impact categories and inventories of the product.
      *
     */
    @Override
    public CompletableFuture<GetEpdInventoryConstituteResponse> getEpdInventoryConstitute(GetEpdInventoryConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEpdInventoryConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/epd/inventory/constitute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEpdInventoryConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEpdInventoryConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This API takes a product ID from the user and returns the summary of environmental impact generated for the product. This info helps understand the overall emissions for different environmental impact categories of the product.
      *
     */
    @Override
    public CompletableFuture<GetEpdSummaryResponse> getEpdSummary(GetEpdSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEpdSummary").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/epd/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEpdSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEpdSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * With user-specified parameters such as enterprise code, current page, and page size, this API returns a list of matching product carbon footprints (or supply chain carbon footprints), including product names and product IDs. The product ID can be used as input parameters in other APIs to get the corresponding product\\"s detailed information.
      *
     */
    @Override
    public CompletableFuture<GetFootprintListResponse> getFootprintList(GetFootprintListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFootprintList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/product/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFootprintListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFootprintListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetGasConstituteResponse> getGasConstitute(GetGasConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGasConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/gas/constitute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGasConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGasConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This interface returns a list of proactive carbon reduction information given product ID. It\\"s used to understand the carbon reduction efforts at various levels of the product.
      *
     */
    @Override
    public CompletableFuture<GetGwpBenchmarkListResponse> getGwpBenchmarkList(GetGwpBenchmarkListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGwpBenchmarkList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/gwp/benchmark/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGwpBenchmarkListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGwpBenchmarkListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The API takes a product ID and returns data on the carbon emissions reduction along with a list of the top four contributors to carbon reduction. This info helps understand the total carbon reduction of the product and its main sources.
      *
     */
    @Override
    public CompletableFuture<GetGwpBenchmarkSummaryResponse> getGwpBenchmarkSummary(GetGwpBenchmarkSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGwpBenchmarkSummary").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/gwp/benchmark/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGwpBenchmarkSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGwpBenchmarkSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Used to obtain the carbon emission composition analysis of a specified product. Carbon emission composition analysis includes two analysis dimensions: inventory and type. In the rendering effect, including a hierarchical list and pie chart.
      *
     */
    @Override
    public CompletableFuture<GetGwpInventoryConstituteResponse> getGwpInventoryConstitute(GetGwpInventoryConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGwpInventoryConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/gwp/inventory/constitute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGwpInventoryConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGwpInventoryConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Returns the total carbon footprint data for the user-specified product ID, along with details on the top four contributors to the carbon footprint, helping to understand the overall carbon footprint and its main components.
      *
     */
    @Override
    public CompletableFuture<GetGwpInventorySummaryResponse> getGwpInventorySummary(GetGwpInventorySummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGwpInventorySummary").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/gwp/inventory/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGwpInventorySummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGwpInventorySummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This interface retrieves a descending order list of emissions for a specified product ID, environmental impact method, group level, and calculation method. It\\"s used to understand various environmental impact emission scenarios.
      *
     */
    @Override
    public CompletableFuture<GetInventoryListResponse> getInventoryList(GetInventoryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInventoryList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/inventory/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInventoryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInventoryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If an activated site exists, the information about the site and the organization to which the site belongs is returned. If no activated site exists, null is returned.
      * - By current, endpoint only supports Hangzhou: `energyexpertexternal.cn-hangzhou.aliyuncs.com`.
      * - To use this API, you need to be added to the whitelist. Please contact us through the official website <props="china">[here](https://energy.aliyun.com/ifa/web/defaultLoginPage?adapter=aliyun#/consult?source=%E8%83%BD%E8%80%97%E5%AE%9D%E7%99%BB%E5%BD%95%E9%A1%B5%EF%BC%88WEB%EF%BC%89)</props> 
      * <props="intl">[here](https://energy.alibabacloud.com/common?adapter=aliyun&lang=en-US#/home/en)</props> to apply for whitelist activation.
      *
     */
    @Override
    public CompletableFuture<GetOrgAndFactoryResponse> getOrgAndFactory(GetOrgAndFactoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrgAndFactory").setMethod(HttpMethod.GET).setPathRegex("/api/external/getOrgAndFactory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrgAndFactoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrgAndFactoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetOrgConstituteResponse> getOrgConstitute(GetOrgConstituteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrgConstitute").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/analysis/org").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrgConstituteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrgConstituteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * With the user-specified product ID, this interface retrieves detailed information and download links for previously generated PCR reports. To use it, two conditions must be met: 1) the result has already been generated; 2) the PCR report has been created.
      *
     */
    @Override
    public CompletableFuture<GetPcrInfoResponse> getPcrInfo(GetPcrInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPcrInfo").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/pcr/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPcrInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPcrInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This API returns carbon reduction proposals based on the product ID. It\\"s useful for understanding optimization tips to reduce the carbon emissions associated with a product.
      *
     */
    @Override
    public CompletableFuture<GetReductionProposalResponse> getReductionProposal(GetReductionProposalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReductionProposal").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/reduction/proposal").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReductionProposalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReductionProposalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This API checks the completion status of generating a report. It should be used before calling other result APIs, as they will only display content once the report generation is complete.
      *
     */
    @Override
    public CompletableFuture<IsCompletedResponse> isCompleted(IsCompletedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IsCompleted").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/footprint/result/completed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IsCompletedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IsCompletedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PushDeviceDataResponse> pushDeviceData(PushDeviceDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushDeviceData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/data/increment/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushDeviceDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushDeviceDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * - This interface is used for individual data item data.
      * - Data items can link data to services such as carbon footprints and carbon inventories.
      * - Depending on the platform configuration, active data on a yearly and monthly basis is supported.
      *
     */
    @Override
    public CompletableFuture<PushItemDataResponse> pushItemData(PushItemDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushItemData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/data/item/push").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushItemDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushItemDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * - After uploading the data items, you need to call this interface to recalculate the carbon inventory data.
      *
     */
    @Override
    public CompletableFuture<RecalculateCarbonEmissionResponse> recalculateCarbonEmission(RecalculateCarbonEmissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecalculateCarbonEmission").setMethod(HttpMethod.POST).setPathRegex("/api/v1/carbon/emission/data/item/recalculate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecalculateCarbonEmissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecalculateCarbonEmissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SendDocumentAskQuestionResponse> sendDocumentAskQuestion(SendDocumentAskQuestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendDocumentAskQuestion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aidoc/document/sendDocumentAskQuestion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendDocumentAskQuestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendDocumentAskQuestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
