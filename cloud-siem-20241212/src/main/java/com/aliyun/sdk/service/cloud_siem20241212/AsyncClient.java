// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloud_siem20241212.models.*;
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
     * @param request the request parameters of CheckUpgradeItem  CheckUpgradeItemRequest
     * @return CheckUpgradeItemResponse
     */
    CompletableFuture<CheckUpgradeItemResponse> checkUpgradeItem(CheckUpgradeItemRequest request);

    /**
     * @param request the request parameters of CreateDataIngestion  CreateDataIngestionRequest
     * @return CreateDataIngestionResponse
     */
    CompletableFuture<CreateDataIngestionResponse> createDataIngestion(CreateDataIngestionRequest request);

    /**
     * @param request the request parameters of CreateDataSet  CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    CompletableFuture<CreateDataSetResponse> createDataSet(CreateDataSetRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateDetectionRule  CreateDetectionRuleRequest
     * @return CreateDetectionRuleResponse
     */
    CompletableFuture<CreateDetectionRuleResponse> createDetectionRule(CreateDetectionRuleRequest request);

    /**
     * @param request the request parameters of CreateExportTask  CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    CompletableFuture<CreateExportTaskResponse> createExportTask(CreateExportTaskRequest request);

    /**
     * @param request the request parameters of CreateLogStore  CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    /**
     * @param request the request parameters of CreateNormalizationRule  CreateNormalizationRuleRequest
     * @return CreateNormalizationRuleResponse
     */
    CompletableFuture<CreateNormalizationRuleResponse> createNormalizationRule(CreateNormalizationRuleRequest request);

    /**
     * @param request the request parameters of CreateNormalizationSchema  CreateNormalizationSchemaRequest
     * @return CreateNormalizationSchemaResponse
     */
    CompletableFuture<CreateNormalizationSchemaResponse> createNormalizationSchema(CreateNormalizationSchemaRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of CreateVendor  CreateVendorRequest
     * @return CreateVendorResponse
     */
    CompletableFuture<CreateVendorResponse> createVendor(CreateVendorRequest request);

    /**
     * @param request the request parameters of DeleteDataIngestion  DeleteDataIngestionRequest
     * @return DeleteDataIngestionResponse
     */
    CompletableFuture<DeleteDataIngestionResponse> deleteDataIngestion(DeleteDataIngestionRequest request);

    /**
     * @param request the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    /**
     * @param request the request parameters of DeleteDataSetRecord  DeleteDataSetRecordRequest
     * @return DeleteDataSetRecordResponse
     */
    CompletableFuture<DeleteDataSetRecordResponse> deleteDataSetRecord(DeleteDataSetRecordRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDetectionRule  DeleteDetectionRuleRequest
     * @return DeleteDetectionRuleResponse
     */
    CompletableFuture<DeleteDetectionRuleResponse> deleteDetectionRule(DeleteDetectionRuleRequest request);

    /**
     * @param request the request parameters of DeleteLogStore  DeleteLogStoreRequest
     * @return DeleteLogStoreResponse
     */
    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    /**
     * @param request the request parameters of DeleteNormalizationRule  DeleteNormalizationRuleRequest
     * @return DeleteNormalizationRuleResponse
     */
    CompletableFuture<DeleteNormalizationRuleResponse> deleteNormalizationRule(DeleteNormalizationRuleRequest request);

    /**
     * @param request the request parameters of DeleteNormalizationRuleVersion  DeleteNormalizationRuleVersionRequest
     * @return DeleteNormalizationRuleVersionResponse
     */
    CompletableFuture<DeleteNormalizationRuleVersionResponse> deleteNormalizationRuleVersion(DeleteNormalizationRuleVersionRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DeleteVendor  DeleteVendorRequest
     * @return DeleteVendorResponse
     */
    CompletableFuture<DeleteVendorResponse> deleteVendor(DeleteVendorRequest request);

    /**
     * @param request the request parameters of DisableDataIngestion  DisableDataIngestionRequest
     * @return DisableDataIngestionResponse
     */
    CompletableFuture<DisableDataIngestionResponse> disableDataIngestion(DisableDataIngestionRequest request);

    /**
     * @param request the request parameters of EnableDataIngestion  EnableDataIngestionRequest
     * @return EnableDataIngestionResponse
     */
    CompletableFuture<EnableDataIngestionResponse> enableDataIngestion(EnableDataIngestionRequest request);

    /**
     * @param request the request parameters of ExecuteLogQuery  ExecuteLogQueryRequest
     * @return ExecuteLogQueryResponse
     */
    CompletableFuture<ExecuteLogQueryResponse> executeLogQuery(ExecuteLogQueryRequest request);

    /**
     * @param request the request parameters of ExecuteUpgrade  ExecuteUpgradeRequest
     * @return ExecuteUpgradeResponse
     */
    CompletableFuture<ExecuteUpgradeResponse> executeUpgrade(ExecuteUpgradeRequest request);

    /**
     * @param request the request parameters of GetDataBatchIngestion  GetDataBatchIngestionRequest
     * @return GetDataBatchIngestionResponse
     */
    CompletableFuture<GetDataBatchIngestionResponse> getDataBatchIngestion(GetDataBatchIngestionRequest request);

    /**
     * @param request the request parameters of GetDataStorage  GetDataStorageRequest
     * @return GetDataStorageResponse
     */
    CompletableFuture<GetDataStorageResponse> getDataStorage(GetDataStorageRequest request);

    /**
     * @param request the request parameters of GetDetectionStatistic  GetDetectionStatisticRequest
     * @return GetDetectionStatisticResponse
     */
    CompletableFuture<GetDetectionStatisticResponse> getDetectionStatistic(GetDetectionStatisticRequest request);

    /**
     * @param request the request parameters of GetExportTask  GetExportTaskRequest
     * @return GetExportTaskResponse
     */
    CompletableFuture<GetExportTaskResponse> getExportTask(GetExportTaskRequest request);

    /**
     * @param request the request parameters of GetIncident  GetIncidentRequest
     * @return GetIncidentResponse
     */
    CompletableFuture<GetIncidentResponse> getIncident(GetIncidentRequest request);

    /**
     * @param request the request parameters of GetLogTicket  GetLogTicketRequest
     * @return GetLogTicketResponse
     */
    CompletableFuture<GetLogTicketResponse> getLogTicket(GetLogTicketRequest request);

    /**
     * @param request the request parameters of GetNormalizationRule  GetNormalizationRuleRequest
     * @return GetNormalizationRuleResponse
     */
    CompletableFuture<GetNormalizationRuleResponse> getNormalizationRule(GetNormalizationRuleRequest request);

    /**
     * @param request the request parameters of GetNormalizationRuleVersion  GetNormalizationRuleVersionRequest
     * @return GetNormalizationRuleVersionResponse
     */
    CompletableFuture<GetNormalizationRuleVersionResponse> getNormalizationRuleVersion(GetNormalizationRuleVersionRequest request);

    /**
     * @param request the request parameters of GetNormalizationSchema  GetNormalizationSchemaRequest
     * @return GetNormalizationSchemaResponse
     */
    CompletableFuture<GetNormalizationSchemaResponse> getNormalizationSchema(GetNormalizationSchemaRequest request);

    /**
     * @param request the request parameters of GetUserConfig  GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request);

    /**
     * @param request the request parameters of ListDataIngestionTemplates  ListDataIngestionTemplatesRequest
     * @return ListDataIngestionTemplatesResponse
     */
    CompletableFuture<ListDataIngestionTemplatesResponse> listDataIngestionTemplates(ListDataIngestionTemplatesRequest request);

    /**
     * @param request the request parameters of ListDataIngestions  ListDataIngestionsRequest
     * @return ListDataIngestionsResponse
     */
    CompletableFuture<ListDataIngestionsResponse> listDataIngestions(ListDataIngestionsRequest request);

    /**
     * @param request the request parameters of ListDataSetRecords  ListDataSetRecordsRequest
     * @return ListDataSetRecordsResponse
     */
    CompletableFuture<ListDataSetRecordsResponse> listDataSetRecords(ListDataSetRecordsRequest request);

    /**
     * @param request the request parameters of ListDataSets  ListDataSetsRequest
     * @return ListDataSetsResponse
     */
    CompletableFuture<ListDataSetsResponse> listDataSets(ListDataSetsRequest request);

    /**
     * @param request the request parameters of ListDataSourceTemplates  ListDataSourceTemplatesRequest
     * @return ListDataSourceTemplatesResponse
     */
    CompletableFuture<ListDataSourceTemplatesResponse> listDataSourceTemplates(ListDataSourceTemplatesRequest request);

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * @param request the request parameters of ListDetectionRules  ListDetectionRulesRequest
     * @return ListDetectionRulesResponse
     */
    CompletableFuture<ListDetectionRulesResponse> listDetectionRules(ListDetectionRulesRequest request);

    /**
     * @param request the request parameters of ListIncidents  ListIncidentsRequest
     * @return ListIncidentsResponse
     */
    CompletableFuture<ListIncidentsResponse> listIncidents(ListIncidentsRequest request);

    /**
     * @param request the request parameters of ListLogProjects  ListLogProjectsRequest
     * @return ListLogProjectsResponse
     */
    CompletableFuture<ListLogProjectsResponse> listLogProjects(ListLogProjectsRequest request);

    /**
     * @param request the request parameters of ListLogRegions  ListLogRegionsRequest
     * @return ListLogRegionsResponse
     */
    CompletableFuture<ListLogRegionsResponse> listLogRegions(ListLogRegionsRequest request);

    /**
     * @param request the request parameters of ListLogStores  ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    /**
     * @param request the request parameters of ListNormalizationCategories  ListNormalizationCategoriesRequest
     * @return ListNormalizationCategoriesResponse
     */
    CompletableFuture<ListNormalizationCategoriesResponse> listNormalizationCategories(ListNormalizationCategoriesRequest request);

    /**
     * @param request the request parameters of ListNormalizationFields  ListNormalizationFieldsRequest
     * @return ListNormalizationFieldsResponse
     */
    CompletableFuture<ListNormalizationFieldsResponse> listNormalizationFields(ListNormalizationFieldsRequest request);

    /**
     * @param request the request parameters of ListNormalizationRuleCapacities  ListNormalizationRuleCapacitiesRequest
     * @return ListNormalizationRuleCapacitiesResponse
     */
    CompletableFuture<ListNormalizationRuleCapacitiesResponse> listNormalizationRuleCapacities(ListNormalizationRuleCapacitiesRequest request);

    /**
     * @param request the request parameters of ListNormalizationRuleVersions  ListNormalizationRuleVersionsRequest
     * @return ListNormalizationRuleVersionsResponse
     */
    CompletableFuture<ListNormalizationRuleVersionsResponse> listNormalizationRuleVersions(ListNormalizationRuleVersionsRequest request);

    /**
     * @param request the request parameters of ListNormalizationRules  ListNormalizationRulesRequest
     * @return ListNormalizationRulesResponse
     */
    CompletableFuture<ListNormalizationRulesResponse> listNormalizationRules(ListNormalizationRulesRequest request);

    /**
     * @param request the request parameters of ListNormalizationSchemas  ListNormalizationSchemasRequest
     * @return ListNormalizationSchemasResponse
     */
    CompletableFuture<ListNormalizationSchemasResponse> listNormalizationSchemas(ListNormalizationSchemasRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListTrafficStatistics  ListTrafficStatisticsRequest
     * @return ListTrafficStatisticsResponse
     */
    CompletableFuture<ListTrafficStatisticsResponse> listTrafficStatistics(ListTrafficStatisticsRequest request);

    /**
     * @param request the request parameters of ListUpgradeItems  ListUpgradeItemsRequest
     * @return ListUpgradeItemsResponse
     */
    CompletableFuture<ListUpgradeItemsResponse> listUpgradeItems(ListUpgradeItemsRequest request);

    /**
     * @param request the request parameters of ListVendors  ListVendorsRequest
     * @return ListVendorsResponse
     */
    CompletableFuture<ListVendorsResponse> listVendors(ListVendorsRequest request);

    /**
     * @param request the request parameters of RefreshDataSource  RefreshDataSourceRequest
     * @return RefreshDataSourceResponse
     */
    CompletableFuture<RefreshDataSourceResponse> refreshDataSource(RefreshDataSourceRequest request);

    /**
     * @param request the request parameters of ResetDataStorage  ResetDataStorageRequest
     * @return ResetDataStorageResponse
     */
    CompletableFuture<ResetDataStorageResponse> resetDataStorage(ResetDataStorageRequest request);

    /**
     * @param request the request parameters of SetDefaultNormalizationRuleVersion  SetDefaultNormalizationRuleVersionRequest
     * @return SetDefaultNormalizationRuleVersionResponse
     */
    CompletableFuture<SetDefaultNormalizationRuleVersionResponse> setDefaultNormalizationRuleVersion(SetDefaultNormalizationRuleVersionRequest request);

    /**
     * @param request the request parameters of UpdateDataBatchIngestion  UpdateDataBatchIngestionRequest
     * @return UpdateDataBatchIngestionResponse
     */
    CompletableFuture<UpdateDataBatchIngestionResponse> updateDataBatchIngestion(UpdateDataBatchIngestionRequest request);

    /**
     * @param request the request parameters of UpdateDataIngestion  UpdateDataIngestionRequest
     * @return UpdateDataIngestionResponse
     */
    CompletableFuture<UpdateDataIngestionResponse> updateDataIngestion(UpdateDataIngestionRequest request);

    /**
     * @param request the request parameters of UpdateDataIngestionTemplate  UpdateDataIngestionTemplateRequest
     * @return UpdateDataIngestionTemplateResponse
     */
    CompletableFuture<UpdateDataIngestionTemplateResponse> updateDataIngestionTemplate(UpdateDataIngestionTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDataSet  UpdateDataSetRequest
     * @return UpdateDataSetResponse
     */
    CompletableFuture<UpdateDataSetResponse> updateDataSet(UpdateDataSetRequest request);

    /**
     * @param request the request parameters of UpdateDataSetRecord  UpdateDataSetRecordRequest
     * @return UpdateDataSetRecordResponse
     */
    CompletableFuture<UpdateDataSetRecordResponse> updateDataSetRecord(UpdateDataSetRecordRequest request);

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * @param request the request parameters of UpdateDataSourceTemplate  UpdateDataSourceTemplateRequest
     * @return UpdateDataSourceTemplateResponse
     */
    CompletableFuture<UpdateDataSourceTemplateResponse> updateDataSourceTemplate(UpdateDataSourceTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDataStorage  UpdateDataStorageRequest
     * @return UpdateDataStorageResponse
     */
    CompletableFuture<UpdateDataStorageResponse> updateDataStorage(UpdateDataStorageRequest request);

    /**
     * @param request the request parameters of UpdateDataStorageDelivery  UpdateDataStorageDeliveryRequest
     * @return UpdateDataStorageDeliveryResponse
     */
    CompletableFuture<UpdateDataStorageDeliveryResponse> updateDataStorageDelivery(UpdateDataStorageDeliveryRequest request);

    /**
     * @param request the request parameters of UpdateDataStorageTtl  UpdateDataStorageTtlRequest
     * @return UpdateDataStorageTtlResponse
     */
    CompletableFuture<UpdateDataStorageTtlResponse> updateDataStorageTtl(UpdateDataStorageTtlRequest request);

    /**
     * @param request the request parameters of UpdateDetectionRule  UpdateDetectionRuleRequest
     * @return UpdateDetectionRuleResponse
     */
    CompletableFuture<UpdateDetectionRuleResponse> updateDetectionRule(UpdateDetectionRuleRequest request);

    /**
     * @param request the request parameters of UpdateNormalizationRule  UpdateNormalizationRuleRequest
     * @return UpdateNormalizationRuleResponse
     */
    CompletableFuture<UpdateNormalizationRuleResponse> updateNormalizationRule(UpdateNormalizationRuleRequest request);

    /**
     * @param request the request parameters of UpdateNormalizationSchema  UpdateNormalizationSchemaRequest
     * @return UpdateNormalizationSchemaResponse
     */
    CompletableFuture<UpdateNormalizationSchemaResponse> updateNormalizationSchema(UpdateNormalizationSchemaRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * @param request the request parameters of UpdateVendor  UpdateVendorRequest
     * @return UpdateVendorResponse
     */
    CompletableFuture<UpdateVendorResponse> updateVendor(UpdateVendorRequest request);

    /**
     * @param request the request parameters of ValidateLogStore  ValidateLogStoreRequest
     * @return ValidateLogStoreResponse
     */
    CompletableFuture<ValidateLogStoreResponse> validateLogStore(ValidateLogStoreRequest request);

    /**
     * @param request the request parameters of ValidateNormalizationRule  ValidateNormalizationRuleRequest
     * @return ValidateNormalizationRuleResponse
     */
    CompletableFuture<ValidateNormalizationRuleResponse> validateNormalizationRule(ValidateNormalizationRuleRequest request);

}
