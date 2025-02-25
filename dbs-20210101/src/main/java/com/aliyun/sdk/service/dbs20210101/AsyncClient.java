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

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateAdvancedPolicyResponse> createAdvancedPolicy(CreateAdvancedPolicyRequest request);

    /**
      * ### [](#)Supported database engines
      * *   ApsaraDB RDS for MySQL
      * *   ApsaraDB RDS for PostgreSQL
      * *   PolarDB for MySQL
      * ### [](#)References
      * For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
      * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](~~98819~~)
      * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](~~96774~~)
      * *   [Download the backup files of a PolarDB for MySQL cluster](~~2627635~~)
      *
     */
    CompletableFuture<CreateDownloadResponse> createDownload(CreateDownloadRequest request);

    /**
      * This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DeleteSandboxInstanceResponse> deleteSandboxInstance(DeleteSandboxInstanceRequest request);

    CompletableFuture<DescribeBackupDataListResponse> describeBackupDataList(DescribeBackupDataListRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeDBTablesRecoveryBackupSetResponse> describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request);

    CompletableFuture<DescribeDBTablesRecoveryStateResponse> describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request);

    CompletableFuture<DescribeDBTablesRecoveryTimeRangeResponse> describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request);

    /**
      * ### [](#)Supported database engines
      * *   ApsaraDB RDS for MySQL
      * *   ApsaraDB RDS for PostgreSQL
      * *   PolarDB for MySQL
      * ### [](#)References
      * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](~~98819~~)
      * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](~~96774~~)
      * *   [Download the backup files of a PolarDB for MySQL cluster](~~2627635~~)
      *
     */
    CompletableFuture<DescribeDownloadBackupSetStorageInfoResponse> describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request);

    /**
      * ### [](#)Supported database engines
      * *   ApsaraDB RDS for MySQL
      * *   ApsaraDB RDS for PostgreSQL
      * *   PolarDB for MySQL
      * ### [](#)References
      * You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
      * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](~~98819~~)
      * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](~~96774~~)
      * *   [Download the backup files of a PolarDB for MySQL cluster](~~2627635~~)
      *
     */
    CompletableFuture<DescribeDownloadSupportResponse> describeDownloadSupport(DescribeDownloadSupportRequest request);

    /**
      * ### [](#)Supported database engines
      * *   ApsaraDB RDS for MySQL
      * *   ApsaraDB RDS for PostgreSQL
      * *   PolarDB for MySQL
      * ### [](#)References
      * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](~~98819~~)
      * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](~~96774~~)
      * *   [Download the backup files of a PolarDB for MySQL cluster](~~2627635~~)
      *
     */
    CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request);

    /**
      * Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](~~203154~~) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](~~185577~~). This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxBackupSetsResponse> describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request);

    /**
      * This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxInstancesResponse> describeSandboxInstances(DescribeSandboxInstancesRequest request);

    /**
      * Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](~~203154~~) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](~~185577~~). This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxRecoveryTimeResponse> describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBTablesRecoveryStateResponse> modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request);

    CompletableFuture<SupportDBTableRecoveryResponse> supportDBTableRecovery(SupportDBTableRecoveryRequest request);

}
