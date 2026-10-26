// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sddp20260120.models.*;
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
        this.product = "Sddp";
        this.version = "2026-01-20";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hongkong", "sddp-api.cn-hongkong.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Checks the permissions, DPI engine, and running conditions of an instance before you create column encryption. You must check both ErrorCode and ErrorMessage in the response. Only ErrorCode=Success indicates that the check is passed. A successful request does not mean that the instance meets all encryption conditions. This check does not create a column encryption rule.
     * Parameter examples are for format illustration only. When you invoke the operation, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the service registration endpoint of the region where the target asset is located and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of CheckDataMaskingInstance  CheckDataMaskingInstanceRequest
     * @return CheckDataMaskingInstanceResponse
     */
    @Override
    public CompletableFuture<CheckDataMaskingInstanceResponse> checkDataMaskingInstance(CheckDataMaskingInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDataMaskingInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDataMaskingInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDataMaskingInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a column encryption rule for specified databases, tables, and columns under the same instance. Before calling this operation, check the instance status, supported algorithms, keys, target columns, and accounts. SubRuleList is a list of targets grouped by table, and Columns is a string of column names separated by commas. Accounts in UserList are granted the fullAccess plaintext permission. A successful request only indicates that the request is accepted. You must call the ListDataMaskingColumns and ListDataAssetAccounts operations to confirm the column status, account permissions, and validity period.
     * The parameter examples are for illustrative purposes only. When calling this operation, replace them with the region, resource identifiers, and configuration values obtained by querying the current account.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match those of the target asset.
     * This operation only returns RequestId. Request acceptance does not mean that the business operation is complete. Read back the status as described in the operation description.</p>
     * 
     * @param request the request parameters of CreateDataMaskingRule  CreateDataMaskingRuleRequest
     * @return CreateDataMaskingRuleResponse
     */
    @Override
    public CompletableFuture<CreateDataMaskingRuleResponse> createDataMaskingRule(CreateDataMaskingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataMaskingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataMaskingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataMaskingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Disables encryption rules for specified columns in the same instance. SubRuleList precisely specifies databases, tables, and columns. If no rule is matched, no new operation object is created. The disable request is processed asynchronously. Use ListDataMaskingColumns to verify that the column is restored to NotEncrypted or that the target rule has been removed. DeleteFailed indicates that the disable operation failed.
     * The parameter examples are for format illustration only. When you invoke the API, replace them with the region, resource identifier, and configuration values obtained for the current account.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.
     * This operation returns only RequestId. Request acceptance does not mean that the business operation is complete. You should check the status as described in the operation description.</p>
     * 
     * @param request the request parameters of DeleteDataMaskingRule  DeleteDataMaskingRuleRequest
     * @return DeleteDataMaskingRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDataMaskingRuleResponse> deleteDataMaskingRule(DeleteDataMaskingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataMaskingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataMaskingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataMaskingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the permission statistics of database accounts in the current region by product scope. Plaintext accounts correspond to FullAccessCount. Restricted access and decryption-prohibited accounts are counted in RestrictedAccessCount and NoneAccessCount, respectively. The number of accounts without configured permissions can be obtained by subtracting the number of the preceding three types of accounts from TotalCount. This operation does not accept filter conditions such as instance, database, table, or column.
     * Parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke this operation.
     * Use the service registration endpoint of the region where the target asset is located and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must be consistent with the target asset.</p>
     * 
     * @param request the request parameters of GetDataMaskingAccountCount  GetDataMaskingAccountCountRequest
     * @return GetDataMaskingAccountCountResponse
     */
    @Override
    public CompletableFuture<GetDataMaskingAccountCountResponse> getDataMaskingAccountCount(GetDataMaskingAccountCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataMaskingAccountCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataMaskingAccountCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataMaskingAccountCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the total number of columns, the number of sensitive columns, the number of encrypted columns, and the number of columns that failed to be encrypted by region, product, and categorization and classification template. This operation returns data for statistics cards and does not filter by instance, database name, table name, column name, or model in the column list.
     * To be compatible with historical detection results, if the specified template has no first-screen results and is not filtered by sensitivity level or detection model, the results may backoff to the built-in general detection results. If strict template attribution is required, use the level or model conditions within the template for verification.
     * The parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke the operation.
     * Use the service registration endpoint of the region where the target asset is located and apply the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of GetDataMaskingColumnCount  GetDataMaskingColumnCountRequest
     * @return GetDataMaskingColumnCountResponse
     */
    @Override
    public CompletableFuture<GetDataMaskingColumnCountResponse> getDataMaskingColumnCount(GetDataMaskingColumnCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataMaskingColumnCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataMaskingColumnCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataMaskingColumnCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the instance engine, current kernel version, maintenance window, and KMS encryption support. After a kernel upgrade, you can read back CurrentKernelVersion to verify the target version. If ErrorCode or ErrorMessage is present, handle the property query exception first.
     * Parameter examples are for format illustration only. When you call the API, replace them with the region, resource ID, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance ID must match the target asset.</p>
     * 
     * @param request the request parameters of GetInstanceAttribute  GetInstanceAttributeRequest
     * @return GetInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<GetInstanceAttributeResponse> getInstanceAttribute(GetInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on the columns and detection results in a data table. If both DataAssetSourceId and InstanceName are specified, DataAssetSourceId takes precedence. In PostgreSQL and Oracle scenarios, you can use the schema.table format for TableName and pass the corresponding EngineType. To query the execution status of column encryption, call ListDataMaskingColumns.
     * To ensure compatibility with historical detection results, if the specified template has no first-screen results and is not filtered by sensitivity level or detection model, the results may fall back to the built-in general detection results. If strict template attribution is required, use the level or model conditions within the template for verification.
     * The parameter examples are for format illustration only. When you call the API, replace them with the region, resource identifier, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    @Override
    public CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListColumns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Uses paging to query database accounts and their column encryption access permissions. This operation is used to select plaintext accounts when creating rules, and to verify AuthRole, EncryptionKeyMode, and ExpireTime before and after modifying account permissions. AccountName filters accounts by exact account name, and the account ID is obtained from Items[].Id.
     * The parameter examples are for format illustration only. Replace them with the region, resource IDs, and configuration values obtained from the current account when you call the operation.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance ID must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataAssetAccounts  ListDataAssetAccountsRequest
     * @return ListDataAssetAccountsResponse
     */
    @Override
    public CompletableFuture<ListDataAssetAccountsResponse> listDataAssetAccounts(ListDataAssetAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataAssetAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataAssetAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataAssetAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on columns and their encryption status, sensitivity levels, and detection models. Supports paging and combined filtering by template, product, instance, database, table, column name, model, and sensitivity level. Use this operation to read back data after the creation or shutdown of a rule. Processing and Deleting are intermediate states, while Failed and DeleteFailed indicate operation failures. The capitalization of the RiskLeveLId parameter name must be preserved exactly as is.
     * When querying by product, use a single ProductId or the corresponding ProductCode. The current column query cannot rely on ProductIds to filter multiple products. Query each product separately.
     * To ensure compatibility with historical detection results, if the specified template yields no initial results and is not filtered by sensitivity level or detection model, the results may fall back to the built-in general detection results. To strictly verify template attribution, use the level or model conditions within the template simultaneously.
     * Parameter examples are for format illustration only. Replace them with the region, resource identifiers, and configuration values obtained from the current account when making a call.
     * Use the service registration endpoint of the region where the target asset is located, and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingColumns  ListDataMaskingColumnsRequest
     * @return ListDataMaskingColumnsResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingColumnsResponse> listDataMaskingColumns(ListDataMaskingColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingColumns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available column encryption algorithms for a specified instance and the reasons for any restrictions on each algorithm. Before selecting an algorithm, check the ErrorCode and ErrorMessage of the corresponding item. Do not assume that all instances support the same set of algorithms.
     * Parameter examples are for format illustration only. When you invoke the API, replace them with the region, resource IDs, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target asset is located and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance ID must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingEncryptionAlgorithms  ListDataMaskingEncryptionAlgorithmsRequest
     * @return ListDataMaskingEncryptionAlgorithmsResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingEncryptionAlgorithmsResponse> listDataMaskingEncryptionAlgorithms(ListDataMaskingEncryptionAlgorithmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingEncryptionAlgorithms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingEncryptionAlgorithmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingEncryptionAlgorithmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of column encryption instances, and supports filtering by conditions such as product, detect template, database, table, and column. The scope of instance-level status filtering differs from that of column-level status filtering. To find all unencrypted sensitive columns, first enumerate the instances of the target product, and then use ListDataMaskingColumns to filter by NotEncrypted to avoid missing partially encrypted instances.
     * When you need to filter precisely by EngineType, read all candidates by paging and then filter by the returned values. This parameter is not applied in some query paths. The matching semantics of InstanceId vary with query combinations. For precise positioning, verify the complete instance identity returned.
     * Parameter examples are for format illustration only. When you invoke the operation, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the service registration endpoint of the region where the target asset is located, and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingInstances  ListDataMaskingInstancesRequest
     * @return ListDataMaskingInstancesResponse
     */
    @Override
    public CompletableFuture<ListDataMaskingInstancesResponse> listDataMaskingInstances(ListDataMaskingInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataMaskingInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataMaskingInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataMaskingInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on managed data sources by using paging. In relational database scenarios, locate the instance by using ProductCode and InstanceId, and select a database from Items[].DbName. This operation queries the database inventory and does not filter by data categorization and classification templates.
     * Parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke this operation.
     * Use the service registration endpoint of the region where the target asset resides and configure the settings of the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the valid recognition models in a specified template and returns RuleList. If TemplateId is not specified, the currently enabled template is used. The model ID is obtained from RuleList[].Id and can be used to filter TemplateRuleIds.
     * Parameter examples are provided only to illustrate the format. When you call the API, replace them with the region, resource IDs, and configuration values queried from the current account.</p>
     * 
     * @param request the request parameters of ListIdentifyModels  ListIdentifyModelsRequest
     * @return ListIdentifyModelsResponse
     */
    @Override
    public CompletableFuture<ListIdentifyModelsResponse> listIdentifyModels(ListIdentifyModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIdentifyModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentifyModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentifyModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the KMS key identities and aliases available for the column encryption configuration of a specified instance. Before using a KMS key, verify the key status and usage conditions by calling the DescribeKey operation of KMS. This operation does not return the plaintext of the key.
     * The parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke the operation.
     * Use the service registration endpoint of the region where the target asset is located and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListKmsKeys  ListKmsKeysRequest
     * @return ListKmsKeysResponse
     */
    @Override
    public CompletableFuture<ListKmsKeysResponse> listKmsKeys(ListKmsKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKmsKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKmsKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKmsKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available kernel versions for an instance. For an upgrade, select the target version from KernelVersions[].KernelVersion. Do not manually construct the version number.
     * Parameter examples are for format illustration only. When you call the API, replace them with the region, resource ID, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target asset is located, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance ID must match the target asset.</p>
     * 
     * @param request the request parameters of ListMiniEngineVersions  ListMiniEngineVersionsRequest
     * @return ListMiniEngineVersionsResponse
     */
    @Override
    public CompletableFuture<ListMiniEngineVersionsResponse> listMiniEngineVersions(ListMiniEngineVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMiniEngineVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMiniEngineVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMiniEngineVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of regions where the assets owned by the current account are located. You can use this list to select the RegionId for subsequent region-specific API operations. You can filter the regions based on whether auditing or detection is enabled. The returned region list is not the same as the list of all regions supported by Alibaba Cloud services.
     * The parameter examples are for format illustration only. When you call this operation, replace them with the regions, resource identifiers, and configuration values queried from the current account.</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the sensitivity levels in a data classification template. Pass the level ID in subsequent queries. Do not use level names such as S1 or S2 directly as RiskLevelId.
     * The parameter examples are for format illustration only. When calling the API, replace them with the region, resource identifiers, and configuration values obtained for the current account.</p>
     * 
     * @param request the request parameters of ListRiskLevels  ListRiskLevelsRequest
     * @return ListRiskLevelsResponse
     */
    @Override
    public CompletableFuture<ListRiskLevelsResponse> listRiskLevels(ListRiskLevelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRiskLevels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRiskLevelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRiskLevelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries database tables and detection results in a database by using paging. For relational databases, set DataAssetSourceId to the instance identity and DataSourceName to the database name. Table names in PostgreSQL and Oracle may contain a schema prefix. Pass the table name as is for subsequent column queries.
     * To be compatible with historical detection results, if the specified template yields no initial results and no filtering is applied by sensitivity level or detection model, the results may fall back to the built-in general detection results. To strictly verify template attribution, use the level or model conditions within the template at the same time.
     * The parameter examples are provided only to illustrate the format. When you invoke the API, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the classification and grading templates available for the current account. Use Items[].Id as the TemplateId for subsequent API operations. The detection model and sensitivity level must belong to the same template. Parameter examples are for format illustration only. Replace them with the region, resource identifiers, and configuration values obtained from the current account when making the call.</p>
     * 
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the statistics of sensitive data in the overview, data catalog, or aggregated by region. If CountType is set to 41, overview statistics are returned. If CountType is set to 42, data catalog statistics for a specified product are returned. If CountType is set to 43, data aggregated by region and template is returned. The column encryption console uses CountType=43 and ProductCodeList to obtain region and template candidates. The statistics may be derived from generated summary results and do not indicate that a recently initiated synchronization or encryption operation has been completed.
     * Parameter examples are for format illustration only. When calling the API, replace them with the regions, resource identifiers, and configuration values obtained from the current account.</p>
     * 
     * @param request the request parameters of ListTotalSensitiveInfo  ListTotalSensitiveInfoRequest
     * @return ListTotalSensitiveInfoResponse
     */
    @Override
    public CompletableFuture<ListTotalSensitiveInfoResponse> listTotalSensitiveInfo(ListTotalSensitiveInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTotalSensitiveInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTotalSensitiveInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTotalSensitiveInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Triggers asset synchronization for a specified product in the current region. The scope applies to the product and region, and is not limited to a specific instance. A successful request only indicates that the request is accepted. You can then verify asset changes by checking the lists of instances, databases, tables, and columns. This operation does not return a public node identifier for polling.
     * Parameter examples are for format illustration only. When you invoke this operation, replace them with the region, resource identifiers, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target assets reside, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target assets.
     * This operation returns only RequestId. Request acceptance does not mean that the business operation is complete. You should check the status as described in the operation description.</p>
     * 
     * @param request the request parameters of SyncDataAssets  SyncDataAssetsRequest
     * @return SyncDataAssetsResponse
     */
    @Override
    public CompletableFuture<SyncDataAssetsResponse> syncDataAssets(SyncDataAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncDataAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDataAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDataAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the instance-level column encryption algorithm and key configuration, which affects the column encryption configuration of the instance. The current implementation supports ApsaraDB RDS for MySQL and PolarDB-X 2.0. Query the algorithms and keys supported by the instance before invoking this operation. This operation does not have an EncryptionKeyMode parameter. Configure the parameter based on the usage conditions of EncryptionKeyId. After a successful request, read back the instance encryption configuration and column status. Do not determine completion based solely on the RequestId.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, for example, cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only the RequestId. A successful request does not indicate that the business operation is complete. Read back the status as described in the operation description.</p>
     * 
     * @param request the request parameters of UpdateDataMaskingEncryptionAlgorithm  UpdateDataMaskingEncryptionAlgorithmRequest
     * @return UpdateDataMaskingEncryptionAlgorithmResponse
     */
    @Override
    public CompletableFuture<UpdateDataMaskingEncryptionAlgorithmResponse> updateDataMaskingEncryptionAlgorithm(UpdateDataMaskingEncryptionAlgorithmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataMaskingEncryptionAlgorithm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataMaskingEncryptionAlgorithmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataMaskingEncryptionAlgorithmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Sets the same column encryption access permissions Settings for a batch of database accounts. UserList can contain accounts from different instances under the same product and region. Each item must include InstanceId and AccountId. fullAccess allows plaintext access, restrictedAccess allows restricted access, and noneAccess prohibits decryption and is supported only by specific DPI engines and key patterns. Only fullAccess supports configuring an expiration time. After a successful request, invoke ListDataAssetAccounts to read back the results.
     * The parameter examples are for format illustration only. When invoking this operation, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the service registration endpoint of the region where the target asset is located and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not mean the business operation is complete. You must read back the status as described in the operation description.</p>
     * 
     * @param request the request parameters of UpdateDataMaskingUsers  UpdateDataMaskingUsersRequest
     * @return UpdateDataMaskingUsersResponse
     */
    @Override
    public CompletableFuture<UpdateDataMaskingUsersResponse> updateDataMaskingUsers(UpdateDataMaskingUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataMaskingUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataMaskingUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataMaskingUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Upgrades the database kernel of a specified instance at the selected time. Invoke ListMiniEngineVersions to select a version, and check the current status and maintenance window of the instance. SpecifyTime requires a future SwitchTime, and PolarDB-X 2.0 does not support these time options. The upgrade is an asynchronous operation. Invoke GetInstanceAttribute to check the CurrentKernelVersion and verify the result.
     * The parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke the operation.
     * Use the service registration endpoint of the region where the target asset is located, and configure the Settings for the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Acceptance of the request does not mean the business operation is complete. Check the status as described in the operation description.</p>
     * 
     * @param request the request parameters of UpgradeKernelVersion  UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    @Override
    public CompletableFuture<UpgradeKernelVersionResponse> upgradeKernelVersion(UpgradeKernelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeKernelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeKernelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeKernelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
