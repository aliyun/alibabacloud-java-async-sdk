// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbs20210101.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ConfigureBackupSetInfo  ConfigureBackupSetInfoRequest
     * @return ConfigureBackupSetInfoResponse
     */
    CompletableFuture<ConfigureBackupSetInfoResponse> configureBackupSetInfo(ConfigureBackupSetInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAdvancedPolicy  CreateAdvancedPolicyRequest
     * @return CreateAdvancedPolicyResponse
     */
    CompletableFuture<CreateAdvancedPolicyResponse> createAdvancedPolicy(CreateAdvancedPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDownload  CreateDownloadRequest
     * @return CreateDownloadResponse
     */
    CompletableFuture<CreateDownloadResponse> createDownload(CreateDownloadRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DeleteSandboxInstance  DeleteSandboxInstanceRequest
     * @return DeleteSandboxInstanceResponse
     */
    CompletableFuture<DeleteSandboxInstanceResponse> deleteSandboxInstance(DeleteSandboxInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID: 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/88172.html">Back up data of PolarDB for MySQL</a></p>
     * 
     * @param request the request parameters of DescribeBackupDataList  DescribeBackupDataListRequest
     * @return DescribeBackupDataListResponse
     */
    CompletableFuture<DescribeBackupDataListResponse> describeBackupDataList(DescribeBackupDataListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> The API operation is available only to specific customers. If you want to call this API operation, request permissions by joining the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/280422.html">Topics related to backup policies of PolarDB for MySQL instances</a></p>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBakDataSourceStorageAccessInfo  DescribeBakDataSourceStorageAccessInfoRequest
     * @return DescribeBakDataSourceStorageAccessInfoResponse
     */
    CompletableFuture<DescribeBakDataSourceStorageAccessInfoResponse> describeBakDataSourceStorageAccessInfo(DescribeBakDataSourceStorageAccessInfoRequest request);

    /**
     * @param request the request parameters of DescribeCostInfoByDbsInstance  DescribeCostInfoByDbsInstanceRequest
     * @return DescribeCostInfoByDbsInstanceResponse
     */
    CompletableFuture<DescribeCostInfoByDbsInstanceResponse> describeCostInfoByDbsInstance(DescribeCostInfoByDbsInstanceRequest request);

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryBackupSet  DescribeDBTablesRecoveryBackupSetRequest
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    CompletableFuture<DescribeDBTablesRecoveryBackupSetResponse> describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request);

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryState  DescribeDBTablesRecoveryStateRequest
     * @return DescribeDBTablesRecoveryStateResponse
     */
    CompletableFuture<DescribeDBTablesRecoveryStateResponse> describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request);

    /**
     * @param request the request parameters of DescribeDBTablesRecoveryTimeRange  DescribeDBTablesRecoveryTimeRangeRequest
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    CompletableFuture<DescribeDBTablesRecoveryTimeRangeResponse> describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL that uses Enterprise SSDs (ESSDs)</li>
     * <li>RDS PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadBackupSetStorageInfo  DescribeDownloadBackupSetStorageInfoRequest
     * @return DescribeDownloadBackupSetStorageInfoResponse
     */
    CompletableFuture<DescribeDownloadBackupSetStorageInfoResponse> describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadSupport  DescribeDownloadSupportRequest
     * @return DescribeDownloadSupportResponse
     */
    CompletableFuture<DescribeDownloadSupportResponse> describeDownloadSupport(DescribeDownloadSupportRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDownloadTask  DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxBackupSets  DescribeSandboxBackupSetsRequest
     * @return DescribeSandboxBackupSetsResponse
     */
    CompletableFuture<DescribeSandboxBackupSetsResponse> describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxInstances  DescribeSandboxInstancesRequest
     * @return DescribeSandboxInstancesResponse
     */
    CompletableFuture<DescribeSandboxInstancesResponse> describeSandboxInstances(DescribeSandboxInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * @param request the request parameters of DescribeSandboxRecoveryTime  DescribeSandboxRecoveryTimeRequest
     * @return DescribeSandboxRecoveryTimeResponse
     */
    CompletableFuture<DescribeSandboxRecoveryTimeResponse> describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyDBTablesRecoveryState  ModifyDBTablesRecoveryStateRequest
     * @return ModifyDBTablesRecoveryStateResponse
     */
    CompletableFuture<ModifyDBTablesRecoveryStateResponse> modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request);

    /**
     * @param request the request parameters of RetryDownloadTask  RetryDownloadTaskRequest
     * @return RetryDownloadTaskResponse
     */
    CompletableFuture<RetryDownloadTaskResponse> retryDownloadTask(RetryDownloadTaskRequest request);

    /**
     * @param request the request parameters of SupportDBTableRecovery  SupportDBTableRecoveryRequest
     * @return SupportDBTableRecoveryResponse
     */
    CompletableFuture<SupportDBTableRecoveryResponse> supportDBTableRecovery(SupportDBTableRecoveryRequest request);

}
