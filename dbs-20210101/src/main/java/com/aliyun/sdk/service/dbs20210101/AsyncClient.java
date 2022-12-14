// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbs20210101.models.*;
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
      * You can create an advanced download task by point in time or backup file. You can set the Download Destination parameter to URL or directly upload the downloaded data to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving. For more information, see [Advanced download](~~98819~~).
      *
     */
    CompletableFuture<CreateDownloadResponse> createDownload(CreateDownloadRequest request);

    /**
      * Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Create a sandbox instance for emergency disaster recovery of an ApsaraDB RDS for MySQL database](~~203154~~) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](~~185577~~). The API operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<CreateSandboxInstanceResponse> createSandboxInstance(CreateSandboxInstanceRequest request);

    /**
      * The API operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DeleteSandboxInstanceResponse> deleteSandboxInstance(DeleteSandboxInstanceRequest request);

    CompletableFuture<DescribeDBTablesRecoveryBackupSetResponse> describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request);

    CompletableFuture<DescribeDBTablesRecoveryStateResponse> describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request);

    CompletableFuture<DescribeDBTablesRecoveryTimeRangeResponse> describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request);

    /**
      * You can create an advanced download task by point in time or backup file. You can set the Download Destination parameter to URL or directly upload the downloaded data to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving. For more information, see [Advanced download](~~98819~~).
      *
     */
    CompletableFuture<DescribeDownloadBackupSetStorageInfoResponse> describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request);

    /**
      * You can create an advanced download task by point in time or backup file. You can set the Download Destination parameter to URL or directly upload the downloaded data to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving. For more information, see [Advanced download](~~98819~~).
      *
     */
    CompletableFuture<DescribeDownloadSupportResponse> describeDownloadSupport(DescribeDownloadSupportRequest request);

    /**
      * You can create an advanced download task by point in time or backup file. You can set the Download Destination parameter to URL or directly upload the downloaded data to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving. For more information, see [Advanced download](~~98819~~).
      *
     */
    CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request);

    /**
      * Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Create a sandbox instance for emergency disaster recovery of an ApsaraDB RDS for MySQL database](~~203154~~) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](~~185577~~). The API operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxBackupSetsResponse> describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request);

    /**
      * The API operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxInstancesResponse> describeSandboxInstances(DescribeSandboxInstancesRequest request);

    /**
      * Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Create a sandbox instance for emergency disaster recovery of an ApsaraDB RDS for MySQL database](~~203154~~) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](~~185577~~). The API operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
      *
     */
    CompletableFuture<DescribeSandboxRecoveryTimeResponse> describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request);

    CompletableFuture<ModifyDBTablesRecoveryStateResponse> modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request);

    CompletableFuture<SupportDBTableRecoveryResponse> supportDBTableRecovery(SupportDBTableRecoveryRequest request);

}
