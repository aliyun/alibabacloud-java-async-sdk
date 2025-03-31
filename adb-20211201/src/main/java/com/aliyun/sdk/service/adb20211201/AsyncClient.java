// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adb20211201.models.*;
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
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of AllocateClusterPublicConnection  AllocateClusterPublicConnectionRequest
     * @return AllocateClusterPublicConnectionResponse
     */
    CompletableFuture<AllocateClusterPublicConnectionResponse> allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ApplyAdviceById  ApplyAdviceByIdRequest
     * @return ApplyAdviceByIdResponse
     */
    CompletableFuture<ApplyAdviceByIdResponse> applyAdviceById(ApplyAdviceByIdRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of AttachUserENI  AttachUserENIRequest
     * @return AttachUserENIResponse
     */
    CompletableFuture<AttachUserENIResponse> attachUserENI(AttachUserENIRequest request);

    /**
     * @param request the request parameters of BatchApplyAdviceByIdList  BatchApplyAdviceByIdListRequest
     * @return BatchApplyAdviceByIdListResponse
     */
    CompletableFuture<BatchApplyAdviceByIdListResponse> batchApplyAdviceByIdList(BatchApplyAdviceByIdListRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of BindAccount  BindAccountRequest
     * @return BindAccountResponse
     */
    CompletableFuture<BindAccountResponse> bindAccount(BindAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of BindDBResourceGroupWithUser  BindDBResourceGroupWithUserRequest
     * @return BindDBResourceGroupWithUserResponse
     */
    CompletableFuture<BindDBResourceGroupWithUserResponse> bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request);

    /**
     * @param request the request parameters of CancelSparkReplStatement  CancelSparkReplStatementRequest
     * @return CancelSparkReplStatementResponse
     */
    CompletableFuture<CancelSparkReplStatementResponse> cancelSparkReplStatement(CancelSparkReplStatementRequest request);

    /**
     * @param request the request parameters of CancelSparkWarehouseBatchSQL  CancelSparkWarehouseBatchSQLRequest
     * @return CancelSparkWarehouseBatchSQLResponse
     */
    CompletableFuture<CancelSparkWarehouseBatchSQLResponse> cancelSparkWarehouseBatchSQL(CancelSparkWarehouseBatchSQLRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CheckBindRamUser  CheckBindRamUserRequest
     * @return CheckBindRamUserResponse
     */
    CompletableFuture<CheckBindRamUserResponse> checkBindRamUser(CheckBindRamUserRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CheckSampleDataSet  CheckSampleDataSetRequest
     * @return CheckSampleDataSetResponse
     */
    CompletableFuture<CheckSampleDataSetResponse> checkSampleDataSet(CheckSampleDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CreateAPSJob  CreateAPSJobRequest
     * @return CreateAPSJobResponse
     */
    CompletableFuture<CreateAPSJobResponse> createAPSJob(CreateAPSJobRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateApsCopyWorkload  CreateApsCopyWorkloadRequest
     * @return CreateApsCopyWorkloadResponse
     */
    CompletableFuture<CreateApsCopyWorkloadResponse> createApsCopyWorkload(CreateApsCopyWorkloadRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CreateApsDatasoure  CreateApsDatasoureRequest
     * @return CreateApsDatasoureResponse
     */
    CompletableFuture<CreateApsDatasoureResponse> createApsDatasoure(CreateApsDatasoureRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CreateApsHiveJob  CreateApsHiveJobRequest
     * @return CreateApsHiveJobResponse
     */
    CompletableFuture<CreateApsHiveJobResponse> createApsHiveJob(CreateApsHiveJobRequest request);

    /**
     * @param request the request parameters of CreateApsSlsADBJob  CreateApsSlsADBJobRequest
     * @return CreateApsSlsADBJobResponse
     */
    CompletableFuture<CreateApsSlsADBJobResponse> createApsSlsADBJob(CreateApsSlsADBJobRequest request);

    /**
     * <b>description</b> :
     * <p>CreateDBCluster</p>
     * 
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of CreateDBResourceGroup  CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of CreateElasticPlan  CreateElasticPlanRequest
     * @return CreateElasticPlanResponse
     */
    CompletableFuture<CreateElasticPlanResponse> createElasticPlan(CreateElasticPlanRequest request);

    /**
     * @param request the request parameters of CreateLakeStorage  CreateLakeStorageRequest
     * @return CreateLakeStorageResponse
     */
    CompletableFuture<CreateLakeStorageResponse> createLakeStorage(CreateLakeStorageRequest request);

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateOssSubDirectory  CreateOssSubDirectoryRequest
     * @return CreateOssSubDirectoryResponse
     */
    CompletableFuture<CreateOssSubDirectoryResponse> createOssSubDirectory(CreateOssSubDirectoryRequest request);

    /**
     * @param request the request parameters of CreatePerformanceView  CreatePerformanceViewRequest
     * @return CreatePerformanceViewResponse
     */
    CompletableFuture<CreatePerformanceViewResponse> createPerformanceView(CreatePerformanceViewRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSparkTemplate  CreateSparkTemplateRequest
     * @return CreateSparkTemplateResponse
     */
    CompletableFuture<CreateSparkTemplateResponse> createSparkTemplate(CreateSparkTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DeleteApsDatasoure  DeleteApsDatasoureRequest
     * @return DeleteApsDatasoureResponse
     */
    CompletableFuture<DeleteApsDatasoureResponse> deleteApsDatasoure(DeleteApsDatasoureRequest request);

    /**
     * <b>description</b> :
     * <p>  Deleting backup sets is an asynchronous operation and may require 10 to 20 minutes to complete.</p>
     * <ul>
     * <li>You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</li>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApsJob  DeleteApsJobRequest
     * @return DeleteApsJobResponse
     */
    CompletableFuture<DeleteApsJobResponse> deleteApsJob(DeleteApsJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</p>
     * <ul>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackups  DeleteBackupsRequest
     * @return DeleteBackupsResponse
     */
    CompletableFuture<DeleteBackupsResponse> deleteBackups(DeleteBackupsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can delete only pay-as-you-go clusters.</li>
     * <li>The cluster that you want to delete must be in the Running state.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DeleteDBResourceGroup  DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DeleteElasticPlan  DeleteElasticPlanRequest
     * @return DeleteElasticPlanResponse
     */
    CompletableFuture<DeleteElasticPlanResponse> deleteElasticPlan(DeleteElasticPlanRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DeleteLakeStorage  DeleteLakeStorageRequest
     * @return DeleteLakeStorageResponse
     */
    CompletableFuture<DeleteLakeStorageResponse> deleteLakeStorage(DeleteLakeStorageRequest request);

    /**
     * @param request the request parameters of DeletePerformanceView  DeletePerformanceViewRequest
     * @return DeletePerformanceViewResponse
     */
    CompletableFuture<DeletePerformanceViewResponse> deletePerformanceView(DeletePerformanceViewRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProcessInstance  DeleteProcessInstanceRequest
     * @return DeleteProcessInstanceResponse
     */
    CompletableFuture<DeleteProcessInstanceResponse> deleteProcessInstance(DeleteProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSparkTemplate  DeleteSparkTemplateRequest
     * @return DeleteSparkTemplateResponse
     */
    CompletableFuture<DeleteSparkTemplateResponse> deleteSparkTemplate(DeleteSparkTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSparkTemplateFile  DeleteSparkTemplateFileRequest
     * @return DeleteSparkTemplateFileResponse
     */
    CompletableFuture<DeleteSparkTemplateFileResponse> deleteSparkTemplateFile(DeleteSparkTemplateFileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the performance data of a cluster over a time range based on performance metrics. The collection granularity is 30 seconds. This operation allows you to query information about slow queries, such as the SQL query duration, number of scanned rows, and amount of scanned data.</p>
     * 
     * @param request the request parameters of DescribeAPSADBInstances  DescribeAPSADBInstancesRequest
     * @return DescribeAPSADBInstancesResponse
     */
    CompletableFuture<DescribeAPSADBInstancesResponse> describeAPSADBInstances(DescribeAPSADBInstancesRequest request);

    /**
     * @param request the request parameters of DescribeAbnormalPatternDetection  DescribeAbnormalPatternDetectionRequest
     * @return DescribeAbnormalPatternDetectionResponse
     */
    CompletableFuture<DescribeAbnormalPatternDetectionResponse> describeAbnormalPatternDetection(DescribeAbnormalPatternDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeAccountAllPrivileges  DescribeAccountAllPrivilegesRequest
     * @return DescribeAccountAllPrivilegesResponse
     */
    CompletableFuture<DescribeAccountAllPrivilegesResponse> describeAccountAllPrivileges(DescribeAccountAllPrivilegesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeAccountPrivilegeObjects  DescribeAccountPrivilegeObjectsRequest
     * @return DescribeAccountPrivilegeObjectsResponse
     */
    CompletableFuture<DescribeAccountPrivilegeObjectsResponse> describeAccountPrivilegeObjects(DescribeAccountPrivilegeObjectsRequest request);

    /**
     * @param request the request parameters of DescribeAccountPrivileges  DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     */
    CompletableFuture<DescribeAccountPrivilegesResponse> describeAccountPrivileges(DescribeAccountPrivilegesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAdbMySqlColumns  DescribeAdbMySqlColumnsRequest
     * @return DescribeAdbMySqlColumnsResponse
     */
    CompletableFuture<DescribeAdbMySqlColumnsResponse> describeAdbMySqlColumns(DescribeAdbMySqlColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAdbMySqlSchemas  DescribeAdbMySqlSchemasRequest
     * @return DescribeAdbMySqlSchemasResponse
     */
    CompletableFuture<DescribeAdbMySqlSchemasResponse> describeAdbMySqlSchemas(DescribeAdbMySqlSchemasRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAdbMySqlTables  DescribeAdbMySqlTablesRequest
     * @return DescribeAdbMySqlTablesResponse
     */
    CompletableFuture<DescribeAdbMySqlTablesResponse> describeAdbMySqlTables(DescribeAdbMySqlTablesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeAdviceServiceEnabled  DescribeAdviceServiceEnabledRequest
     * @return DescribeAdviceServiceEnabledResponse
     */
    CompletableFuture<DescribeAdviceServiceEnabledResponse> describeAdviceServiceEnabled(DescribeAdviceServiceEnabledRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAllDataSource  DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeAppliedAdvices  DescribeAppliedAdvicesRequest
     * @return DescribeAppliedAdvicesResponse
     */
    CompletableFuture<DescribeAppliedAdvicesResponse> describeAppliedAdvices(DescribeAppliedAdvicesRequest request);

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApsActionLogs  DescribeApsActionLogsRequest
     * @return DescribeApsActionLogsResponse
     */
    CompletableFuture<DescribeApsActionLogsResponse> describeApsActionLogs(DescribeApsActionLogsRequest request);

    /**
     * @param request the request parameters of DescribeApsDatasource  DescribeApsDatasourceRequest
     * @return DescribeApsDatasourceResponse
     */
    CompletableFuture<DescribeApsDatasourceResponse> describeApsDatasource(DescribeApsDatasourceRequest request);

    /**
     * @param request the request parameters of DescribeApsDatasources  DescribeApsDatasourcesRequest
     * @return DescribeApsDatasourcesResponse
     */
    CompletableFuture<DescribeApsDatasourcesResponse> describeApsDatasources(DescribeApsDatasourcesRequest request);

    /**
     * @param request the request parameters of DescribeApsHiveWorkload  DescribeApsHiveWorkloadRequest
     * @return DescribeApsHiveWorkloadResponse
     */
    CompletableFuture<DescribeApsHiveWorkloadResponse> describeApsHiveWorkload(DescribeApsHiveWorkloadRequest request);

    /**
     * @param request the request parameters of DescribeApsJobDetail  DescribeApsJobDetailRequest
     * @return DescribeApsJobDetailResponse
     */
    CompletableFuture<DescribeApsJobDetailResponse> describeApsJobDetail(DescribeApsJobDetailRequest request);

    /**
     * @param request the request parameters of DescribeApsJobs  DescribeApsJobsRequest
     * @return DescribeApsJobsResponse
     */
    CompletableFuture<DescribeApsJobsResponse> describeApsJobs(DescribeApsJobsRequest request);

    /**
     * @param request the request parameters of DescribeApsMigrationWorkloads  DescribeApsMigrationWorkloadsRequest
     * @return DescribeApsMigrationWorkloadsResponse
     */
    CompletableFuture<DescribeApsMigrationWorkloadsResponse> describeApsMigrationWorkloads(DescribeApsMigrationWorkloadsRequest request);

    /**
     * @param request the request parameters of DescribeApsProgress  DescribeApsProgressRequest
     * @return DescribeApsProgressResponse
     */
    CompletableFuture<DescribeApsProgressResponse> describeApsProgress(DescribeApsProgressRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApsResourceGroups  DescribeApsResourceGroupsRequest
     * @return DescribeApsResourceGroupsResponse
     */
    CompletableFuture<DescribeApsResourceGroupsResponse> describeApsResourceGroups(DescribeApsResourceGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * <ul>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditLogRecords  DescribeAuditLogRecordsRequest
     * @return DescribeAuditLogRecordsResponse
     */
    CompletableFuture<DescribeAuditLogRecordsResponse> describeAuditLogRecords(DescribeAuditLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeAvailableAdvices  DescribeAvailableAdvicesRequest
     * @return DescribeAvailableAdvicesResponse
     */
    CompletableFuture<DescribeAvailableAdvicesResponse> describeAvailableAdvices(DescribeAvailableAdvicesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeBadSqlDetection  DescribeBadSqlDetectionRequest
     * @return DescribeBadSqlDetectionResponse
     */
    CompletableFuture<DescribeBadSqlDetectionResponse> describeBadSqlDetection(DescribeBadSqlDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeClusterAccessWhiteList  DescribeClusterAccessWhiteListRequest
     * @return DescribeClusterAccessWhiteListResponse
     */
    CompletableFuture<DescribeClusterAccessWhiteListResponse> describeClusterAccessWhiteList(DescribeClusterAccessWhiteListRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeClusterNetInfo  DescribeClusterNetInfoRequest
     * @return DescribeClusterNetInfoResponse
     */
    CompletableFuture<DescribeClusterNetInfoResponse> describeClusterNetInfo(DescribeClusterNetInfoRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeClusterResourceDetail  DescribeClusterResourceDetailRequest
     * @return DescribeClusterResourceDetailResponse
     */
    CompletableFuture<DescribeClusterResourceDetailResponse> describeClusterResourceDetail(DescribeClusterResourceDetailRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeClusterResourceUsage  DescribeClusterResourceUsageRequest
     * @return DescribeClusterResourceUsageResponse
     */
    CompletableFuture<DescribeClusterResourceUsageResponse> describeClusterResourceUsage(DescribeClusterResourceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeColumns  DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    /**
     * @param request the request parameters of DescribeCompactionServiceSwitch  DescribeCompactionServiceSwitchRequest
     * @return DescribeCompactionServiceSwitchResponse
     */
    CompletableFuture<DescribeCompactionServiceSwitchResponse> describeCompactionServiceSwitch(DescribeCompactionServiceSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeComputeResourceUsage  DescribeComputeResourceUsageRequest
     * @return DescribeComputeResourceUsageResponse
     */
    CompletableFuture<DescribeComputeResourceUsageResponse> describeComputeResourceUsage(DescribeComputeResourceUsageRequest request);

    /**
     * @param request the request parameters of DescribeControllerDetection  DescribeControllerDetectionRequest
     * @return DescribeControllerDetectionResponse
     */
    CompletableFuture<DescribeControllerDetectionResponse> describeControllerDetection(DescribeControllerDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusterAttribute  DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusterHealthStatus  DescribeDBClusterHealthStatusRequest
     * @return DescribeDBClusterHealthStatusResponse
     */
    CompletableFuture<DescribeDBClusterHealthStatusResponse> describeDBClusterHealthStatus(DescribeDBClusterHealthStatusRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusterSpaceSummary  DescribeDBClusterSpaceSummaryRequest
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    CompletableFuture<DescribeDBClusterSpaceSummaryResponse> describeDBClusterSpaceSummary(DescribeDBClusterSpaceSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusterStatus  DescribeDBClusterStatusRequest
     * @return DescribeDBClusterStatusResponse
     */
    CompletableFuture<DescribeDBClusterStatusResponse> describeDBClusterStatus(DescribeDBClusterStatusRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBClusters  DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeDBResourceGroup  DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisDimensions  DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisRecords  DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisSQLInfo  DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeDownloadRecords  DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeElasticPlanAttribute  DescribeElasticPlanAttributeRequest
     * @return DescribeElasticPlanAttributeResponse
     */
    CompletableFuture<DescribeElasticPlanAttributeResponse> describeElasticPlanAttribute(DescribeElasticPlanAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeElasticPlanJobs  DescribeElasticPlanJobsRequest
     * @return DescribeElasticPlanJobsResponse
     */
    CompletableFuture<DescribeElasticPlanJobsResponse> describeElasticPlanJobs(DescribeElasticPlanJobsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeElasticPlanSpecifications  DescribeElasticPlanSpecificationsRequest
     * @return DescribeElasticPlanSpecificationsResponse
     */
    CompletableFuture<DescribeElasticPlanSpecificationsResponse> describeElasticPlanSpecifications(DescribeElasticPlanSpecificationsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeElasticPlans  DescribeElasticPlansRequest
     * @return DescribeElasticPlansResponse
     */
    CompletableFuture<DescribeElasticPlansResponse> describeElasticPlans(DescribeElasticPlansRequest request);

    /**
     * @param request the request parameters of DescribeEnabledPrivileges  DescribeEnabledPrivilegesRequest
     * @return DescribeEnabledPrivilegesResponse
     */
    CompletableFuture<DescribeEnabledPrivilegesResponse> describeEnabledPrivileges(DescribeEnabledPrivilegesRequest request);

    /**
     * @param request the request parameters of DescribeEssdCacheConfig  DescribeEssdCacheConfigRequest
     * @return DescribeEssdCacheConfigResponse
     */
    CompletableFuture<DescribeEssdCacheConfigResponse> describeEssdCacheConfig(DescribeEssdCacheConfigRequest request);

    /**
     * @param request the request parameters of DescribeExcessivePrimaryKeys  DescribeExcessivePrimaryKeysRequest
     * @return DescribeExcessivePrimaryKeysResponse
     */
    CompletableFuture<DescribeExcessivePrimaryKeysResponse> describeExcessivePrimaryKeys(DescribeExcessivePrimaryKeysRequest request);

    /**
     * @param request the request parameters of DescribeExecutorDetection  DescribeExecutorDetectionRequest
     * @return DescribeExecutorDetectionResponse
     */
    CompletableFuture<DescribeExecutorDetectionResponse> describeExecutorDetection(DescribeExecutorDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeInclinedNodes  DescribeInclinedNodesRequest
     * @return DescribeInclinedNodesResponse
     */
    CompletableFuture<DescribeInclinedNodesResponse> describeInclinedNodes(DescribeInclinedNodesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeJobResourceUsage  DescribeJobResourceUsageRequest
     * @return DescribeJobResourceUsageResponse
     */
    CompletableFuture<DescribeJobResourceUsageResponse> describeJobResourceUsage(DescribeJobResourceUsageRequest request);

    /**
     * @param request the request parameters of DescribeKernelVersion  DescribeKernelVersionRequest
     * @return DescribeKernelVersionResponse
     */
    CompletableFuture<DescribeKernelVersionResponse> describeKernelVersion(DescribeKernelVersionRequest request);

    /**
     * @param request the request parameters of DescribeLakeCacheSize  DescribeLakeCacheSizeRequest
     * @return DescribeLakeCacheSizeResponse
     */
    CompletableFuture<DescribeLakeCacheSizeResponse> describeLakeCacheSize(DescribeLakeCacheSizeRequest request);

    /**
     * @param request the request parameters of DescribeOperatorPermission  DescribeOperatorPermissionRequest
     * @return DescribeOperatorPermissionResponse
     */
    CompletableFuture<DescribeOperatorPermissionResponse> describeOperatorPermission(DescribeOperatorPermissionRequest request);

    /**
     * @param request the request parameters of DescribeOversizeNonPartitionTableInfos  DescribeOversizeNonPartitionTableInfosRequest
     * @return DescribeOversizeNonPartitionTableInfosResponse
     */
    CompletableFuture<DescribeOversizeNonPartitionTableInfosResponse> describeOversizeNonPartitionTableInfos(DescribeOversizeNonPartitionTableInfosRequest request);

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePatternPerformance  DescribePatternPerformanceRequest
     * @return DescribePatternPerformanceResponse
     */
    CompletableFuture<DescribePatternPerformanceResponse> describePatternPerformance(DescribePatternPerformanceRequest request);

    /**
     * @param request the request parameters of DescribePerformanceViewAttribute  DescribePerformanceViewAttributeRequest
     * @return DescribePerformanceViewAttributeResponse
     */
    CompletableFuture<DescribePerformanceViewAttributeResponse> describePerformanceViewAttribute(DescribePerformanceViewAttributeRequest request);

    /**
     * @param request the request parameters of DescribePerformanceViews  DescribePerformanceViewsRequest
     * @return DescribePerformanceViewsResponse
     */
    CompletableFuture<DescribePerformanceViewsResponse> describePerformanceViews(DescribePerformanceViewsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLPatterns  DescribeSQLPatternsRequest
     * @return DescribeSQLPatternsResponse
     */
    CompletableFuture<DescribeSQLPatternsResponse> describeSQLPatterns(DescribeSQLPatternsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSchemas  DescribeSchemasRequest
     * @return DescribeSchemasResponse
     */
    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    /**
     * @param request the request parameters of DescribeSparkAppDiagnosisInfo  DescribeSparkAppDiagnosisInfoRequest
     * @return DescribeSparkAppDiagnosisInfoResponse
     */
    CompletableFuture<DescribeSparkAppDiagnosisInfoResponse> describeSparkAppDiagnosisInfo(DescribeSparkAppDiagnosisInfoRequest request);

    /**
     * @param request the request parameters of DescribeSparkAppType  DescribeSparkAppTypeRequest
     * @return DescribeSparkAppTypeResponse
     */
    CompletableFuture<DescribeSparkAppTypeResponse> describeSparkAppType(DescribeSparkAppTypeRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSparkCodeLog  DescribeSparkCodeLogRequest
     * @return DescribeSparkCodeLogResponse
     */
    CompletableFuture<DescribeSparkCodeLogResponse> describeSparkCodeLog(DescribeSparkCodeLogRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSparkCodeOutput  DescribeSparkCodeOutputRequest
     * @return DescribeSparkCodeOutputResponse
     */
    CompletableFuture<DescribeSparkCodeOutputResponse> describeSparkCodeOutput(DescribeSparkCodeOutputRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSparkCodeWebUi  DescribeSparkCodeWebUiRequest
     * @return DescribeSparkCodeWebUiResponse
     */
    CompletableFuture<DescribeSparkCodeWebUiResponse> describeSparkCodeWebUi(DescribeSparkCodeWebUiRequest request);

    /**
     * @param request the request parameters of DescribeSparkSQLDiagnosisAttribute  DescribeSparkSQLDiagnosisAttributeRequest
     * @return DescribeSparkSQLDiagnosisAttributeResponse
     */
    CompletableFuture<DescribeSparkSQLDiagnosisAttributeResponse> describeSparkSQLDiagnosisAttribute(DescribeSparkSQLDiagnosisAttributeRequest request);

    /**
     * @param request the request parameters of DescribeSparkSQLDiagnosisList  DescribeSparkSQLDiagnosisListRequest
     * @return DescribeSparkSQLDiagnosisListResponse
     */
    CompletableFuture<DescribeSparkSQLDiagnosisListResponse> describeSparkSQLDiagnosisList(DescribeSparkSQLDiagnosisListRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeSqlPattern  DescribeSqlPatternRequest
     * @return DescribeSqlPatternResponse
     */
    CompletableFuture<DescribeSqlPatternResponse> describeSqlPattern(DescribeSqlPatternRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeStorageResourceUsage  DescribeStorageResourceUsageRequest
     * @return DescribeStorageResourceUsageResponse
     */
    CompletableFuture<DescribeStorageResourceUsageResponse> describeStorageResourceUsage(DescribeStorageResourceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DescribeTableAccessCount  DescribeTableAccessCountRequest
     * @return DescribeTableAccessCountResponse
     */
    CompletableFuture<DescribeTableAccessCountResponse> describeTableAccessCount(DescribeTableAccessCountRequest request);

    /**
     * @param request the request parameters of DescribeTableDetail  DescribeTableDetailRequest
     * @return DescribeTableDetailResponse
     */
    CompletableFuture<DescribeTableDetailResponse> describeTableDetail(DescribeTableDetailRequest request);

    /**
     * @param request the request parameters of DescribeTablePartitionDiagnose  DescribeTablePartitionDiagnoseRequest
     * @return DescribeTablePartitionDiagnoseResponse
     */
    CompletableFuture<DescribeTablePartitionDiagnoseResponse> describeTablePartitionDiagnose(DescribeTablePartitionDiagnoseRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTables  DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeUserQuota  DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     */
    CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request);

    /**
     * @param request the request parameters of DescribeWorkerDetection  DescribeWorkerDetectionRequest
     * @return DescribeWorkerDetectionResponse
     */
    CompletableFuture<DescribeWorkerDetectionResponse> describeWorkerDetection(DescribeWorkerDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DetachUserENI  DetachUserENIRequest
     * @return DetachUserENIResponse
     */
    CompletableFuture<DetachUserENIResponse> detachUserENI(DetachUserENIRequest request);

    /**
     * @param request the request parameters of DisableAdviceService  DisableAdviceServiceRequest
     * @return DisableAdviceServiceResponse
     */
    CompletableFuture<DisableAdviceServiceResponse> disableAdviceService(DisableAdviceServiceRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DisableElasticPlan  DisableElasticPlanRequest
     * @return DisableElasticPlanResponse
     */
    CompletableFuture<DisableElasticPlanResponse> disableElasticPlan(DisableElasticPlanRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of DownloadDiagnosisRecords  DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    /**
     * @param request the request parameters of DownloadInstanceCACertificate  DownloadInstanceCACertificateRequest
     * @return DownloadInstanceCACertificateResponse
     */
    CompletableFuture<DownloadInstanceCACertificateResponse> downloadInstanceCACertificate(DownloadInstanceCACertificateRequest request);

    /**
     * @param request the request parameters of EnableAdviceService  EnableAdviceServiceRequest
     * @return EnableAdviceServiceResponse
     */
    CompletableFuture<EnableAdviceServiceResponse> enableAdviceService(EnableAdviceServiceRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of EnableElasticPlan  EnableElasticPlanRequest
     * @return EnableElasticPlanResponse
     */
    CompletableFuture<EnableElasticPlanResponse> enableElasticPlan(EnableElasticPlanRequest request);

    /**
     * @param request the request parameters of ExecuteSparkReplStatement  ExecuteSparkReplStatementRequest
     * @return ExecuteSparkReplStatementResponse
     */
    CompletableFuture<ExecuteSparkReplStatementResponse> executeSparkReplStatement(ExecuteSparkReplStatementRequest request);

    /**
     * @param request the request parameters of ExecuteSparkWarehouseBatchSQL  ExecuteSparkWarehouseBatchSQLRequest
     * @return ExecuteSparkWarehouseBatchSQLResponse
     */
    CompletableFuture<ExecuteSparkWarehouseBatchSQLResponse> executeSparkWarehouseBatchSQL(ExecuteSparkWarehouseBatchSQLRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ExistRunningSQLEngine  ExistRunningSQLEngineRequest
     * @return ExistRunningSQLEngineResponse
     */
    CompletableFuture<ExistRunningSQLEngineResponse> existRunningSQLEngine(ExistRunningSQLEngineRequest request);

    /**
     * @param request the request parameters of GetApsManagedDatabases  GetApsManagedDatabasesRequest
     * @return GetApsManagedDatabasesResponse
     */
    CompletableFuture<GetApsManagedDatabasesResponse> getApsManagedDatabases(GetApsManagedDatabasesRequest request);

    /**
     * @param request the request parameters of GetCreateTableSQL  GetCreateTableSQLRequest
     * @return GetCreateTableSQLResponse
     */
    CompletableFuture<GetCreateTableSQLResponse> getCreateTableSQL(GetCreateTableSQLRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDatabaseObjects  GetDatabaseObjectsRequest
     * @return GetDatabaseObjectsResponse
     */
    CompletableFuture<GetDatabaseObjectsResponse> getDatabaseObjects(GetDatabaseObjectsRequest request);

    /**
     * @param request the request parameters of GetLakeStorage  GetLakeStorageRequest
     * @return GetLakeStorageResponse
     */
    CompletableFuture<GetLakeStorageResponse> getLakeStorage(GetLakeStorageRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppAttemptLog  GetSparkAppAttemptLogRequest
     * @return GetSparkAppAttemptLogResponse
     */
    CompletableFuture<GetSparkAppAttemptLogResponse> getSparkAppAttemptLog(GetSparkAppAttemptLogRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppInfo  GetSparkAppInfoRequest
     * @return GetSparkAppInfoResponse
     */
    CompletableFuture<GetSparkAppInfoResponse> getSparkAppInfo(GetSparkAppInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppLog  GetSparkAppLogRequest
     * @return GetSparkAppLogResponse
     */
    CompletableFuture<GetSparkAppLogResponse> getSparkAppLog(GetSparkAppLogRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppMetrics  GetSparkAppMetricsRequest
     * @return GetSparkAppMetricsResponse
     */
    CompletableFuture<GetSparkAppMetricsResponse> getSparkAppMetrics(GetSparkAppMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppState  GetSparkAppStateRequest
     * @return GetSparkAppStateResponse
     */
    CompletableFuture<GetSparkAppStateResponse> getSparkAppState(GetSparkAppStateRequest request);

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkAppWebUiAddress  GetSparkAppWebUiAddressRequest
     * @return GetSparkAppWebUiAddressResponse
     */
    CompletableFuture<GetSparkAppWebUiAddressResponse> getSparkAppWebUiAddress(GetSparkAppWebUiAddressRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkConfigLogPath  GetSparkConfigLogPathRequest
     * @return GetSparkConfigLogPathResponse
     */
    CompletableFuture<GetSparkConfigLogPathResponse> getSparkConfigLogPath(GetSparkConfigLogPathRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkLogAnalyzeTask  GetSparkLogAnalyzeTaskRequest
     * @return GetSparkLogAnalyzeTaskResponse
     */
    CompletableFuture<GetSparkLogAnalyzeTaskResponse> getSparkLogAnalyzeTask(GetSparkLogAnalyzeTaskRequest request);

    /**
     * @param request the request parameters of GetSparkReplSession  GetSparkReplSessionRequest
     * @return GetSparkReplSessionResponse
     */
    CompletableFuture<GetSparkReplSessionResponse> getSparkReplSession(GetSparkReplSessionRequest request);

    /**
     * @param request the request parameters of GetSparkReplStatement  GetSparkReplStatementRequest
     * @return GetSparkReplStatementResponse
     */
    CompletableFuture<GetSparkReplStatementResponse> getSparkReplStatement(GetSparkReplStatementRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkSQLEngineState  GetSparkSQLEngineStateRequest
     * @return GetSparkSQLEngineStateResponse
     */
    CompletableFuture<GetSparkSQLEngineStateResponse> getSparkSQLEngineState(GetSparkSQLEngineStateRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkTemplateFileContent  GetSparkTemplateFileContentRequest
     * @return GetSparkTemplateFileContentResponse
     */
    CompletableFuture<GetSparkTemplateFileContentResponse> getSparkTemplateFileContent(GetSparkTemplateFileContentRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkTemplateFolderTree  GetSparkTemplateFolderTreeRequest
     * @return GetSparkTemplateFolderTreeResponse
     */
    CompletableFuture<GetSparkTemplateFolderTreeResponse> getSparkTemplateFolderTree(GetSparkTemplateFolderTreeRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSparkTemplateFullTree  GetSparkTemplateFullTreeRequest
     * @return GetSparkTemplateFullTreeResponse
     */
    CompletableFuture<GetSparkTemplateFullTreeResponse> getSparkTemplateFullTree(GetSparkTemplateFullTreeRequest request);

    /**
     * @param request the request parameters of GetSparkWarehouseBatchSQL  GetSparkWarehouseBatchSQLRequest
     * @return GetSparkWarehouseBatchSQLResponse
     */
    CompletableFuture<GetSparkWarehouseBatchSQLResponse> getSparkWarehouseBatchSQL(GetSparkWarehouseBatchSQLRequest request);

    /**
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTableColumns  GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    CompletableFuture<GetTableColumnsResponse> getTableColumns(GetTableColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTableDDL  GetTableDDLRequest
     * @return GetTableDDLResponse
     */
    CompletableFuture<GetTableDDLResponse> getTableDDL(GetTableDDLRequest request);

    /**
     * @param request the request parameters of GetTableObjects  GetTableObjectsRequest
     * @return GetTableObjectsResponse
     */
    CompletableFuture<GetTableObjectsResponse> getTableObjects(GetTableObjectsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetViewDDL  GetViewDDLRequest
     * @return GetViewDDLResponse
     */
    CompletableFuture<GetViewDDLResponse> getViewDDL(GetViewDDLRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetViewObjects  GetViewObjectsRequest
     * @return GetViewObjectsResponse
     */
    CompletableFuture<GetViewObjectsResponse> getViewObjects(GetViewObjectsRequest request);

    /**
     * @param request the request parameters of GrantOperatorPermission  GrantOperatorPermissionRequest
     * @return GrantOperatorPermissionResponse
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    /**
     * @param request the request parameters of KillProcess  KillProcessRequest
     * @return KillProcessResponse
     */
    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of KillSparkApp  KillSparkAppRequest
     * @return KillSparkAppResponse
     */
    CompletableFuture<KillSparkAppResponse> killSparkApp(KillSparkAppRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of KillSparkLogAnalyzeTask  KillSparkLogAnalyzeTaskRequest
     * @return KillSparkLogAnalyzeTaskResponse
     */
    CompletableFuture<KillSparkLogAnalyzeTaskResponse> killSparkLogAnalyzeTask(KillSparkLogAnalyzeTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of KillSparkSQLEngine  KillSparkSQLEngineRequest
     * @return KillSparkSQLEngineResponse
     */
    CompletableFuture<KillSparkSQLEngineResponse> killSparkSQLEngine(KillSparkSQLEngineRequest request);

    /**
     * @param request the request parameters of ListApsLifecycleStrategy  ListApsLifecycleStrategyRequest
     * @return ListApsLifecycleStrategyResponse
     */
    CompletableFuture<ListApsLifecycleStrategyResponse> listApsLifecycleStrategy(ListApsLifecycleStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ListApsOptimizationStrategy  ListApsOptimizationStrategyRequest
     * @return ListApsOptimizationStrategyResponse
     */
    CompletableFuture<ListApsOptimizationStrategyResponse> listApsOptimizationStrategy(ListApsOptimizationStrategyRequest request);

    /**
     * @param request the request parameters of ListApsOptimizationTasks  ListApsOptimizationTasksRequest
     * @return ListApsOptimizationTasksResponse
     */
    CompletableFuture<ListApsOptimizationTasksResponse> listApsOptimizationTasks(ListApsOptimizationTasksRequest request);

    /**
     * @param request the request parameters of ListLakeStorages  ListLakeStoragesRequest
     * @return ListLakeStoragesResponse
     */
    CompletableFuture<ListLakeStoragesResponse> listLakeStorages(ListLakeStoragesRequest request);

    /**
     * @param request the request parameters of ListResultExportJobHistory  ListResultExportJobHistoryRequest
     * @return ListResultExportJobHistoryResponse
     */
    CompletableFuture<ListResultExportJobHistoryResponse> listResultExportJobHistory(ListResultExportJobHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSparkAppAttempts  ListSparkAppAttemptsRequest
     * @return ListSparkAppAttemptsResponse
     */
    CompletableFuture<ListSparkAppAttemptsResponse> listSparkAppAttempts(ListSparkAppAttemptsRequest request);

    /**
     * @param request the request parameters of ListSparkApps  ListSparkAppsRequest
     * @return ListSparkAppsResponse
     */
    CompletableFuture<ListSparkAppsResponse> listSparkApps(ListSparkAppsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSparkLogAnalyzeTasks  ListSparkLogAnalyzeTasksRequest
     * @return ListSparkLogAnalyzeTasksResponse
     */
    CompletableFuture<ListSparkLogAnalyzeTasksResponse> listSparkLogAnalyzeTasks(ListSparkLogAnalyzeTasksRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSparkTemplateFileIds  ListSparkTemplateFileIdsRequest
     * @return ListSparkTemplateFileIdsResponse
     */
    CompletableFuture<ListSparkTemplateFileIdsResponse> listSparkTemplateFileIds(ListSparkTemplateFileIdsRequest request);

    /**
     * @param request the request parameters of ListSparkWarehouseBatchSQL  ListSparkWarehouseBatchSQLRequest
     * @return ListSparkWarehouseBatchSQLResponse
     */
    CompletableFuture<ListSparkWarehouseBatchSQLResponse> listSparkWarehouseBatchSQL(ListSparkWarehouseBatchSQLRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of LoadSampleDataSet  LoadSampleDataSetRequest
     * @return LoadSampleDataSetResponse
     */
    CompletableFuture<LoadSampleDataSetResponse> loadSampleDataSet(LoadSampleDataSetRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyAccountPrivileges  ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     */
    CompletableFuture<ModifyAccountPrivilegesResponse> modifyAccountPrivileges(ModifyAccountPrivilegesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can call this operation only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</li>
     * <li>You cannot modify the number of nodes for the USER_DEFAULT resource group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApsDatasoure  ModifyApsDatasoureRequest
     * @return ModifyApsDatasoureResponse
     */
    CompletableFuture<ModifyApsDatasoureResponse> modifyApsDatasoure(ModifyApsDatasoureRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyApsJob  ModifyApsJobRequest
     * @return ModifyApsJobResponse
     */
    CompletableFuture<ModifyApsJobResponse> modifyApsJob(ModifyApsJobRequest request);

    /**
     * @param request the request parameters of ModifyApsSlsADBJob  ModifyApsSlsADBJobRequest
     * @return ModifyApsSlsADBJobResponse
     */
    CompletableFuture<ModifyApsSlsADBJobResponse> modifyApsSlsADBJob(ModifyApsSlsADBJobRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyApsWorkloadName  ModifyApsWorkloadNameRequest
     * @return ModifyApsWorkloadNameResponse
     */
    CompletableFuture<ModifyApsWorkloadNameResponse> modifyApsWorkloadName(ModifyApsWorkloadNameRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyAuditLogConfig  ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyClickhouseEngine  ModifyClickhouseEngineRequest
     * @return ModifyClickhouseEngineResponse
     */
    CompletableFuture<ModifyClickhouseEngineResponse> modifyClickhouseEngine(ModifyClickhouseEngineRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of ModifyClusterAccessWhiteList  ModifyClusterAccessWhiteListRequest
     * @return ModifyClusterAccessWhiteListResponse
     */
    CompletableFuture<ModifyClusterAccessWhiteListResponse> modifyClusterAccessWhiteList(ModifyClusterAccessWhiteListRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyClusterConnectionString  ModifyClusterConnectionStringRequest
     * @return ModifyClusterConnectionStringResponse
     */
    CompletableFuture<ModifyClusterConnectionStringResponse> modifyClusterConnectionString(ModifyClusterConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifyCompactionServiceSwitch  ModifyCompactionServiceSwitchRequest
     * @return ModifyCompactionServiceSwitchResponse
     */
    CompletableFuture<ModifyCompactionServiceSwitchResponse> modifyCompactionServiceSwitch(ModifyCompactionServiceSwitchRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>During a scaling event, you are not allowed to execute the <code>SUBMIT JOB</code> statement to submit asynchronous jobs. If your business requires asynchronous jobs, perform scaling during appropriate periods.</li>
     * <li>When you scale a cluster, data in the cluster is migrated for redistribution. The amount of time that is required to migrate data is proportional to the data volume. During a scaling event, the services provided by the cluster are not interrupted. When you downgrade cluster specifications, data migration may require up to dozens of hours to complete. Proceed with caution especially if your cluster contains a large amount of data.</li>
     * <li>If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.</li>
     * <li>When the scaling process is about to end, transient connections may occur. We recommend that you scale your cluster during off-peak hours or make sure that your application is configured to automatically reconnect to your cluster.</li>
     * <li>You can change an AnalyticDB for MySQL cluster from Data Warehouse Edition to Data Lakehouse Edition, but not the other way around. For more information, see Change a cluster from Data Warehouse Edition to Data Lakehouse Edition.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBCluster  ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyDBClusterDescription  ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyDBClusterMaintainTime  ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterResourceGroup  ModifyDBClusterResourceGroupRequest
     * @return ModifyDBClusterResourceGroupResponse
     */
    CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterVip  ModifyDBClusterVipRequest
     * @return ModifyDBClusterVipResponse
     */
    CompletableFuture<ModifyDBClusterVipResponse> modifyDBClusterVip(ModifyDBClusterVipRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyDBResourceGroup  ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * @param request the request parameters of ModifyElasticPlan  ModifyElasticPlanRequest
     * @return ModifyElasticPlanResponse
     */
    CompletableFuture<ModifyElasticPlanResponse> modifyElasticPlan(ModifyElasticPlanRequest request);

    /**
     * @param request the request parameters of ModifyEssdCacheConfig  ModifyEssdCacheConfigRequest
     * @return ModifyEssdCacheConfigResponse
     */
    CompletableFuture<ModifyEssdCacheConfigResponse> modifyEssdCacheConfig(ModifyEssdCacheConfigRequest request);

    /**
     * @param request the request parameters of ModifyLakeCacheSize  ModifyLakeCacheSizeRequest
     * @return ModifyLakeCacheSizeResponse
     */
    CompletableFuture<ModifyLakeCacheSizeResponse> modifyLakeCacheSize(ModifyLakeCacheSizeRequest request);

    /**
     * @param request the request parameters of ModifyPerformanceView  ModifyPerformanceViewRequest
     * @return ModifyPerformanceViewResponse
     */
    CompletableFuture<ModifyPerformanceViewResponse> modifyPerformanceView(ModifyPerformanceViewRequest request);

    /**
     * @param request the request parameters of ModifyUserEniVswitchOptions  ModifyUserEniVswitchOptionsRequest
     * @return ModifyUserEniVswitchOptionsResponse
     */
    CompletableFuture<ModifyUserEniVswitchOptionsResponse> modifyUserEniVswitchOptions(ModifyUserEniVswitchOptionsRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of PreloadSparkAppMetrics  PreloadSparkAppMetricsRequest
     * @return PreloadSparkAppMetricsResponse
     */
    CompletableFuture<PreloadSparkAppMetricsResponse> preloadSparkAppMetrics(PreloadSparkAppMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ReleaseClusterPublicConnection  ReleaseClusterPublicConnectionRequest
     * @return ReleaseClusterPublicConnectionResponse
     */
    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of RevokeOperatorPermission  RevokeOperatorPermissionRequest
     * @return RevokeOperatorPermissionResponse
     */
    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SetSparkAppLogRootPath  SetSparkAppLogRootPathRequest
     * @return SetSparkAppLogRootPathResponse
     */
    CompletableFuture<SetSparkAppLogRootPathResponse> setSparkAppLogRootPath(SetSparkAppLogRootPathRequest request);

    /**
     * @param request the request parameters of StartApsJob  StartApsJobRequest
     * @return StartApsJobResponse
     */
    CompletableFuture<StartApsJobResponse> startApsJob(StartApsJobRequest request);

    /**
     * @param request the request parameters of StartSparkReplSession  StartSparkReplSessionRequest
     * @return StartSparkReplSessionResponse
     */
    CompletableFuture<StartSparkReplSessionResponse> startSparkReplSession(StartSparkReplSessionRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartSparkSQLEngine  StartSparkSQLEngineRequest
     * @return StartSparkSQLEngineResponse
     */
    CompletableFuture<StartSparkSQLEngineResponse> startSparkSQLEngine(StartSparkSQLEngineRequest request);

    /**
     * @param request the request parameters of SubmitResultExportJob  SubmitResultExportJobRequest
     * @return SubmitResultExportJobResponse
     */
    CompletableFuture<SubmitResultExportJobResponse> submitResultExportJob(SubmitResultExportJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSparkApp  SubmitSparkAppRequest
     * @return SubmitSparkAppResponse
     */
    CompletableFuture<SubmitSparkAppResponse> submitSparkApp(SubmitSparkAppRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSparkLogAnalyzeTask  SubmitSparkLogAnalyzeTaskRequest
     * @return SubmitSparkLogAnalyzeTaskResponse
     */
    CompletableFuture<SubmitSparkLogAnalyzeTaskResponse> submitSparkLogAnalyzeTask(SubmitSparkLogAnalyzeTaskRequest request);

    /**
     * @param request the request parameters of SuspendApsJob  SuspendApsJobRequest
     * @return SuspendApsJobResponse
     */
    CompletableFuture<SuspendApsJobResponse> suspendApsJob(SuspendApsJobRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of UnbindAccount  UnbindAccountRequest
     * @return UnbindAccountResponse
     */
    CompletableFuture<UnbindAccountResponse> unbindAccount(UnbindAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of UnbindDBResourceGroupWithUser  UnbindDBResourceGroupWithUserRequest
     * @return UnbindDBResourceGroupWithUserResponse
     */
    CompletableFuture<UnbindDBResourceGroupWithUserResponse> unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request);

    /**
     * @param request the request parameters of UpdateLakeStorage  UpdateLakeStorageRequest
     * @return UpdateLakeStorageResponse
     */
    CompletableFuture<UpdateLakeStorageResponse> updateLakeStorage(UpdateLakeStorageRequest request);

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSparkTemplateFile  UpdateSparkTemplateFileRequest
     * @return UpdateSparkTemplateFileResponse
     */
    CompletableFuture<UpdateSparkTemplateFileResponse> updateSparkTemplateFile(UpdateSparkTemplateFileRequest request);

    /**
     * @param request the request parameters of UpgradeKernelVersion  UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    CompletableFuture<UpgradeKernelVersionResponse> upgradeKernelVersion(UpgradeKernelVersionRequest request);

}
