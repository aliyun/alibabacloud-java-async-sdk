// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sddp20260120.models.*;
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
     * <p>Checks the permissions, engine, and runtime conditions of an instance before creating column encryption rules. Check both ErrorCode and ErrorMessage in the response. Only ErrorCode=Success indicates that the check passed. A successful request alone does not mean the instance meets all encryption conditions. This check does not create column encryption rules.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * @param request the request parameters of CheckDataMaskingInstance  CheckDataMaskingInstanceRequest
     * @return CheckDataMaskingInstanceResponse
     */
    CompletableFuture<CheckDataMaskingInstanceResponse> checkDataMaskingInstance(CheckDataMaskingInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a column encryption rule for a specified database, table, and columns under the same instance. Before invoking this operation, verify the instance status, supported algorithms, key, target columns, and accounts. SubRuleList is a list of target columns grouped by table. Columns is a comma-separated string of column names. Accounts in UserList are granted fullAccess plaintext access permissions. A successful request indicates only that the request has been accepted. You must invoke <a href="https://help.aliyun.com/document_detail/2859325.html">ListDataMaskingColumns</a> and <a href="https://help.aliyun.com/document_detail/2859330.html">ListDataAssetAccounts</a> to confirm the column status, account access permissions, and expiration time.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. A successful request does not mean that the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * @param request the request parameters of CreateDataMaskingRule  CreateDataMaskingRuleRequest
     * @return CreateDataMaskingRuleResponse
     */
    CompletableFuture<CreateDataMaskingRuleResponse> createDataMaskingRule(CreateDataMaskingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Disables column encryption rules for specified columns within the same instance. SubRuleList precisely specifies the database, table, and columns. If no matching rule is found, no new operation object is created. The disable request is processed asynchronously. Use ListDataMaskingColumns to verify that the column has recovered to NotEncrypted or that the target rule has been removed. DeleteFailed indicates that the shutdown failed.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained by querying your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not indicate that the business operation is complete. Poll the status as described in the operation description.</p>
     * 
     * @param request the request parameters of DeleteDataMaskingRule  DeleteDataMaskingRuleRequest
     * @return DeleteDataMaskingRuleResponse
     */
    CompletableFuture<DeleteDataMaskingRuleResponse> deleteDataMaskingRule(DeleteDataMaskingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the permission statistics of database accounts in the current region by product scope. Plaintext accounts correspond to FullAccessCount. Restricted access and decryption-prohibited accounts are counted in RestrictedAccessCount and NoneAccessCount, respectively. The number of accounts without configured permissions can be obtained by subtracting the preceding three account types from TotalCount. This operation does not accept filter conditions such as instance, database, table, or column.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying the current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of GetDataMaskingAccountCount  GetDataMaskingAccountCountRequest
     * @return GetDataMaskingAccountCountResponse
     */
    CompletableFuture<GetDataMaskingAccountCountResponse> getDataMaskingAccountCount(GetDataMaskingAccountCountRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the total number of columns, the number of sensitive columns, the number of encrypted columns, and the number of columns that failed to be encrypted by region, product, and categorization template. This operation returns statistics card data and does not follow the instance, database name, table name, column name, or model filters in the column list.
     * For compatible with historical detection results, if no initial results are found for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To enforce strict template ownership, verify the results by using the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace the values with the regions, resource identifiers, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of GetDataMaskingColumnCount  GetDataMaskingColumnCountRequest
     * @return GetDataMaskingColumnCountResponse
     */
    CompletableFuture<GetDataMaskingColumnCountResponse> getDataMaskingColumnCount(GetDataMaskingColumnCountRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the DPI engine, current kernel version, O&amp;M window, and KMS encryption support of an instance. After a kernel upgrade, you can read back CurrentKernelVersion to verify the target version. If ErrorCode or ErrorMessage is present, handle the property query exception first.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and configure the common parameter RegionId in Settings, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of GetInstanceAttribute  GetInstanceAttributeRequest
     * @return GetInstanceAttributeResponse
     */
    CompletableFuture<GetInstanceAttributeResponse> getInstanceAttribute(GetInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries columns and detection results of a data table with paging. When both DataAssetSourceId and InstanceName are specified, DataAssetSourceId takes precedence. For PostgreSQL and Oracle scenarios, you can use the schema.table format for TableName and pass in the corresponding EngineType. To query the execute status of column encryption, invoke ListDataMaskingColumns.
     * For compatible with historical detection results, if the specified template has no initial results and no filtering by sensitivity level or detection model is applied, the results may fall back to built-in general detection results. To strictly verify template ownership, use the sensitivity level or model conditions within the template for verification.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries database accounts and their column encryption access permissions with paging. Use this operation to select plaintext accounts when creating rules, and to verify AuthRole, EncryptionKeyMode, and ExpireTime before and after modifying account permissions. AccountName filters by exact account name. The account identity is obtained from Items[].Id.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account query.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataAssetAccounts  ListDataAssetAccountsRequest
     * @return ListDataAssetAccountsResponse
     */
    CompletableFuture<ListDataAssetAccountsResponse> listDataAssetAccounts(ListDataAssetAccountsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paging query on columns and their encryption status, sensitivity levels, and detection models. You can filter results by combining template, product, instance, database, table, column name, model, and sensitivity level. Use this operation to read back results after creating or shutting down a rule. Processing and Deleting are intermediate states. Failed and DeleteFailed indicate operation failures. The casing of the parameter name RiskLeveLId must be preserved as-is.
     * When querying by product, use a single ProductId or the corresponding ProductCode. Column queries do not support multi-product filtering through ProductIds. Query each product separately for multi-product scenarios.
     * For compatibility with historical detection results, if no first-page results are found for the specified template and no sensitivity level or detection model filter is applied, the results may fall back to built-in general detection results. To enforce strict template ownership, also use a level or model condition from that template for verification.
     * Parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, for example, cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingColumns  ListDataMaskingColumnsRequest
     * @return ListDataMaskingColumnsResponse
     */
    CompletableFuture<ListDataMaskingColumnsResponse> listDataMaskingColumns(ListDataMaskingColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the available column encryption algorithms for a specified instance and the restriction reasons for each algorithm. Before selecting an algorithm, check the ErrorCode and ErrorMessage of the corresponding entry. Do not assume that all instances support the same set of algorithms.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingEncryptionAlgorithms  ListDataMaskingEncryptionAlgorithmsRequest
     * @return ListDataMaskingEncryptionAlgorithmsResponse
     */
    CompletableFuture<ListDataMaskingEncryptionAlgorithmsResponse> listDataMaskingEncryptionAlgorithms(ListDataMaskingEncryptionAlgorithmsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries column encryption instances by paging and supports filtering by product, detection template, and database/table/column. Instance-level status filtering differs from column-level status filtering in scope. To find all unencrypted sensitive columns, first enumerate the instances of the target product, and then use ListDataMaskingColumns to filter by NotEncrypted. This prevents you from missing instances that are partially encrypted.
     * To filter precisely by EngineType, read all candidate pages and then filter by the returned values. Some query paths do not apply this parameter. The matching semantics of InstanceId vary depending on the query combination. To precisely locate an instance, verify the complete instance identity in the response.
     * The parameter examples are provided only to illustrate the format. Replace the values with the region IDs, resource identities, and configuration values that you obtain from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataMaskingInstances  ListDataMaskingInstancesRequest
     * @return ListDataMaskingInstancesResponse
     */
    CompletableFuture<ListDataMaskingInstancesResponse> listDataMaskingInstances(ListDataMaskingInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query on managed data sources by using paging. In relational database scenarios, locate the instance by using ProductCode and InstanceId, and select a database from Items[].DbName. This operation queries the database inventory and does not filter by data categorization and classification templates.
     * Parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke this operation.
     * Use the service registration endpoint of the region where the target asset resides and configure the settings of the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the valid sensitive data detection models within a specified template and returns RuleList. If TemplateId is not specified, the currently enabled template is used. Use RuleList[].Id to obtain model identifiers, which can be used for filtering with TemplateRuleIds.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * @param request the request parameters of ListIdentifyModels  ListIdentifyModelsRequest
     * @return ListIdentifyModelsResponse
     */
    CompletableFuture<ListIdentifyModelsResponse> listIdentifyModels(ListIdentifyModelsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the available KMS key identities and aliases for column encryption configuration of a specified instance. Before using a KMS key, verify the key status and usage conditions by invoking the DescribeKey operation of KMS. This operation does not return key plaintext.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListKmsKeys  ListKmsKeysRequest
     * @return ListKmsKeysResponse
     */
    CompletableFuture<ListKmsKeysResponse> listKmsKeys(ListKmsKeysRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the kernel versions available for an instance. When upgrading, select the target version from KernelVersions[].KernelVersion. Do not manually construct version numbers.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListMiniEngineVersions  ListMiniEngineVersionsRequest
     * @return ListMiniEngineVersionsResponse
     */
    CompletableFuture<ListMiniEngineVersionsResponse> listMiniEngineVersions(ListMiniEngineVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of regions where the assets owned by the current account are located. You can use this list to select the RegionId for subsequent region-specific API operations. You can filter the regions based on whether auditing or detection is enabled. The returned region list is not the same as the list of all regions supported by Alibaba Cloud services.
     * The parameter examples are for format illustration only. When you call this operation, replace them with the regions, resource identifiers, and configuration values queried from the current account.</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the sensitivity levels in a data classification template. Use the returned level ID for subsequent queries. Do not use level names such as S1 or S2 directly as the RiskLevelId.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * @param request the request parameters of ListRiskLevels  ListRiskLevelsRequest
     * @return ListRiskLevelsResponse
     */
    CompletableFuture<ListRiskLevelsResponse> listRiskLevels(ListRiskLevelsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paging query on data tables and detection results in a database. For relational database scenarios, set DataAssetSourceId to the instance identity and DataSourceName to the database name. Table names in PostgreSQL and Oracle may include a schema prefix. Pass the table name as-is in subsequent column queries.
     * For compatibility with historical detection results, if no results are found on the first page for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To strictly verify template ownership, also use the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the classification and grading templates available to the current account. Use Items[].Id as the TemplateId for subsequent API calls. Detection models and sensitivity levels must come from the same template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.</p>
     * 
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the statistics of sensitive data from the overview, data catalog, or aggregated by region. CountType=41 returns overview statistics, 42 returns data catalog statistics for a specified product, and 43 returns data aggregated by region and template. The column encryption console uses CountType=43 with ProductCodeList to obtain region and template candidates. The statistics may come from pre-generated summary results and do not indicate that a recently initiated synchronization or encryption operation has completed.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained by querying your current account.</p>
     * 
     * @param request the request parameters of ListTotalSensitiveInfo  ListTotalSensitiveInfoRequest
     * @return ListTotalSensitiveInfoResponse
     */
    CompletableFuture<ListTotalSensitiveInfoResponse> listTotalSensitiveInfo(ListTotalSensitiveInfoRequest request);

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
    CompletableFuture<SyncDataAssetsResponse> syncDataAssets(SyncDataAssetsRequest request);

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
    CompletableFuture<UpdateDataMaskingEncryptionAlgorithmResponse> updateDataMaskingEncryptionAlgorithm(UpdateDataMaskingEncryptionAlgorithmRequest request);

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
    CompletableFuture<UpdateDataMaskingUsersResponse> updateDataMaskingUsers(UpdateDataMaskingUsersRequest request);

    /**
     * <b>description</b> :
     * <p>Upgrades the database kernel of a specified instance at the selected time. Invoke ListMiniEngineVersions first to select a version, and check the current instance status and maintenance window. SpecifyTime requires a future SwitchTime value. PolarDB-X 2.0 does not support this time option. The upgrade is an asynchronous operation. Read back the CurrentKernelVersion field from GetInstanceAttribute to verify the result.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, for example, cn-zhangjiakou. The product code and instance identity must match the target asset.
     * This operation returns only a RequestId. A successful request does not mean the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * @param request the request parameters of UpgradeKernelVersion  UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    CompletableFuture<UpgradeKernelVersionResponse> upgradeKernelVersion(UpgradeKernelVersionRequest request);

}
