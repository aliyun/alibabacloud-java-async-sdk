// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rds20140815.models.*;
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
     * @param request the request parameters of AcceptRCInquiredSystemEvent  AcceptRCInquiredSystemEventRequest
     * @return AcceptRCInquiredSystemEventResponse
     */
    CompletableFuture<AcceptRCInquiredSystemEventResponse> acceptRCInquiredSystemEvent(AcceptRCInquiredSystemEventRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">One-click cloud migration</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ActivateMigrationTargetInstance  ActivateMigrationTargetInstanceRequest
     * @return ActivateMigrationTargetInstanceResponse
     */
    CompletableFuture<ActivateMigrationTargetInstanceResponse> activateMigrationTargetInstance(ActivateMigrationTargetInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Instances with local disks are not allowed to join a deployment set by default, and the error UNSUPPORTED_DBINSTANCE_OPERATEION is returned. To add such instances, contact technical support. Ask the administrator to add the UID to the whitelist. Cloud disk instances do not have this restriction.
     * Forcibly adding instances to a deployment set may cause instance restarts. Use this feature with caution.</p>
     * 
     * @param request the request parameters of AddRCInstancesToDeploymentSet  AddRCInstancesToDeploymentSetRequest
     * @return AddRCInstancesToDeploymentSetResponse
     */
    CompletableFuture<AddRCInstancesToDeploymentSetResponse> addRCInstancesToDeploymentSet(AddRCInstancesToDeploymentSetRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Each tag consists of a tag key (TagKey) and a tag value (TagValue). TagKey cannot be empty, but TagValue can be empty.</li>
     * <li>The values of TagKey and TagValue cannot start with aliyun.</li>
     * <li>TagKey and TagValue are case-insensitive.</li>
     * <li>TagKey can be up to 64 characters in length. TagValue can be up to 128 characters in length.</li>
     * <li>Each instance can have up to 10 tags. The TagKey of each tag bound to an instance must be unique. If you bind a tag that has the same TagKey as an existing tag, the new tag overwrites the existing tag.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTagsToResource  AddTagsToResourceRequest
     * @return AddTagsToResourceResponse
     */
    CompletableFuture<AddTagsToResourceResponse> addTagsToResource(AddTagsToResourceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/26128.html">Apply for a public endpoint for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97738.html">Apply for a public endpoint for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97736.html">Apply for a public endpoint for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97740.html">Apply for a public endpoint for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Feature description</h3>
     * <p>For an ApsaraDB RDS for SQL Server primary instance that has read-only instances, you can create a unified read-only endpoint. After the endpoint is created, the existing endpoints of the primary instance and read-only instances are not affected, and you can still apply for public and internal endpoints as expected.</p>
     * <h3>Before you begin</h3>
     * <p>When you invoke this operation, the instance must meet the following conditions. Otherwise, the operation is failed:</p>
     * <ul>
     * <li>The ApsaraDB RDS for MySQL instance uses a shared database proxy.</li>
     * <li>The instance status is Normal.</li>
     * <li>The instance has read-only instances.</li>
     * <li>The instance does not have an ongoing Data Transmission Service (DTS) migration node that is being executed.</li>
     * <li>The instance runs one of the following editions:<ul>
     * <li>ApsaraDB RDS for SQL Server Cluster Edition.</li>
     * <li>ApsaraDB RDS for MySQL 5.7 High-availability Edition (local SSDs)</li>
     * <li>ApsaraDB RDS for MySQL 5.6<blockquote>
     * <p>To access this feature, the instance must be active and in high availability mode.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AllocateReadWriteSplittingConnection  AllocateReadWriteSplittingConnectionRequest
     * @return AllocateReadWriteSplittingConnectionResponse
     */
    CompletableFuture<AllocateReadWriteSplittingConnectionResponse> allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2844223.html">Introduction to RDS Custom for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2864363.html">Introduction to RDS Custom for SQL Server</a></li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>If the RDS Custom instance has a public IP address enabled, the existing public IP address undergoes automatic release after you associate an EIP with the instance.</p>
     * 
     * @param request the request parameters of AssociateEipAddressWithRCInstance  AssociateEipAddressWithRCInstanceRequest
     * @return AssociateEipAddressWithRCInstanceResponse
     */
    CompletableFuture<AssociateEipAddressWithRCInstanceResponse> associateEipAddressWithRCInstance(AssociateEipAddressWithRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>The cloud disk must be in the Available state.</li>
     * <li>When you mount a data cloud disk:<ul>
     * <li>The destination RDS Custom instance must be in the Running or Stopped state.</li>
     * <li>If the cloud disk is purchased separately, the billable methods must be pay-as-you-go.</li>
     * <li>If a system cloud disk detached from an RDS Custom instance is mounted as a data cloud disk, no billing method restriction applies.</li>
     * <li>An elastic ephemeral disk can be remounted only to its original instance after it is uninstalled.</li>
     * </ul>
     * </li>
     * <li>When you mount a system cloud disk:<ul>
     * <li>The destination RDS Custom instance must be the source instance from which the system cloud disk was detached.</li>
     * <li>The destination RDS Custom instance must be in the Stopped state.</li>
     * <li>You must configure the logon credentials for the instance under Settings.</li>
     * <li>Elastic ephemeral disks cannot be mounted as system cloud disks.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachRCDisk  AttachRCDiskRequest
     * @return AttachRCDiskResponse
     */
    CompletableFuture<AttachRCDiskResponse> attachRCDisk(AttachRCDiskRequest request);

    /**
     * @param request the request parameters of AttachRCInstances  AttachRCInstancesRequest
     * @return AttachRCInstancesResponse
     */
    CompletableFuture<AttachRCInstancesResponse> attachRCInstances(AttachRCInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of AttachWhitelistTemplateToInstance  AttachWhitelistTemplateToInstanceRequest
     * @return AttachWhitelistTemplateToInstanceResponse
     */
    CompletableFuture<AttachWhitelistTemplateToInstanceResponse> attachWhitelistTemplateToInstance(AttachWhitelistTemplateToInstanceRequest request);

    /**
     * @param request the request parameters of AuthorizeBackupEncryption  AuthorizeBackupEncryptionRequest
     * @return AuthorizeBackupEncryptionResponse
     */
    CompletableFuture<AuthorizeBackupEncryptionResponse> authorizeBackupEncryption(AuthorizeBackupEncryptionRequest request);

    /**
     * @param request the request parameters of AuthorizeRCSecurityGroupPermission  AuthorizeRCSecurityGroupPermissionRequest
     * @return AuthorizeRCSecurityGroupPermissionResponse
     */
    CompletableFuture<AuthorizeRCSecurityGroupPermissionResponse> authorizeRCSecurityGroupPermission(AuthorizeRCSecurityGroupPermissionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Feature description</h3>
     * <p>When <a href="https://help.aliyun.com/document_detail/51073.html">read/write splitting</a> is enabled, this operation calculates the system-assigned weights. To query custom read weights, see <a href="https://help.aliyun.com/document_detail/610423.html">DescribeDBInstanceNetInfo</a>.</p>
     * <h3>Before you begin</h3>
     * <p>When you invoke this operation, the instance must meet the following conditions. Otherwise, the operation fails:</p>
     * <ul>
     * <li>The MySQL instance uses a shared database proxy.</li>
     * <li>The instance runs one of the following editions:<ul>
     * <li>MySQL 5.7 High-availability Edition (local SSDs)</li>
     * <li>MySQL 5.6</li>
     * <li>SQL Server Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CalculateDBInstanceWeight  CalculateDBInstanceWeightRequest
     * @return CalculateDBInstanceWeightResponse
     */
    CompletableFuture<CalculateDBInstanceWeightResponse> calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">Scheduled events of ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">Scheduled events of ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">Scheduled events of ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">Scheduled events of ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * <h3>Limits</h3>
     * <p>A task cannot be canceled in the following cases:</p>
     * <ul>
     * <li>The value of allowCancel is 0.</li>
     * <li>The current time is later than the task start time.</li>
     * <li>The task status is not 3 (waiting for execution).</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckAccountNameAvailable  CheckAccountNameAvailableRequest
     * @return CheckAccountNameAvailableResponse
     */
    CompletableFuture<CheckAccountNameAvailableResponse> checkAccountNameAvailable(CheckAccountNameAvailableRequest request);

    /**
     * @param request the request parameters of CheckBackupEncryptionAuthorized  CheckBackupEncryptionAuthorizedRequest
     * @return CheckBackupEncryptionAuthorizedResponse
     */
    CompletableFuture<CheckBackupEncryptionAuthorizedResponse> checkBackupEncryptionAuthorized(CheckBackupEncryptionAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">MySQL cross-region backup</a> and <a href="https://help.aliyun.com/document_detail/120875.html">MySQL cross-region restoration</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">PostgreSQL cross-region backup</a> and <a href="https://help.aliyun.com/document_detail/206662.html">PostgreSQL cross-region restoration</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">SQL Server cross-region backup</a> and <a href="https://help.aliyun.com/document_detail/187924.html">SQL Server cross-region restoration</a></li>
     * </ul>
     * 
     * @param request the request parameters of CheckCreateDdrDBInstance  CheckCreateDdrDBInstanceRequest
     * @return CheckCreateDdrDBInstanceResponse
     */
    CompletableFuture<CheckCreateDdrDBInstanceResponse> checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckDBNameAvailable  CheckDBNameAvailableRequest
     * @return CheckDBNameAvailableResponse
     */
    CompletableFuture<CheckDBNameAvailableResponse> checkDBNameAvailable(CheckDBNameAvailableRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckInstanceExist  CheckInstanceExistRequest
     * @return CheckInstanceExistResponse
     */
    CompletableFuture<CheckInstanceExistResponse> checkInstanceExist(CheckInstanceExistRequest request);

    /**
     * @param request the request parameters of CheckRdsCustomInit  CheckRdsCustomInitRequest
     * @return CheckRdsCustomInitResponse
     */
    CompletableFuture<CheckRdsCustomInitResponse> checkRdsCustomInit(CheckRdsCustomInitRequest request);

    /**
     * @param request the request parameters of CheckRegionSupportBackupEncryption  CheckRegionSupportBackupEncryptionRequest
     * @return CheckRegionSupportBackupEncryptionResponse
     */
    CompletableFuture<CheckRegionSupportBackupEncryptionResponse> checkRegionSupportBackupEncryption(CheckRegionSupportBackupEncryptionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before you proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96147.html">Restore data of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96776.html">Restore data of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95722.html">Restore data of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97151.html">Restore data of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CloneDBInstance  CloneDBInstanceRequest
     * @return CloneDBInstanceResponse
     */
    CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of CloneParameterGroup  CloneParameterGroupRequest
     * @return CloneParameterGroupResponse
     */
    CompletableFuture<CloneParameterGroupResponse> cloneParameterGroup(CloneParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Description</h3>
     * <p>Call <a href="https://help.aliyun.com/document_detail/610443.html">QueryNotify</a> to query notifications, and then call this operation to mark a notification as confirmed, which indicates that you have acknowledged the notification content.</p>
     * 
     * @param request the request parameters of ConfirmNotify  ConfirmNotifyRequest
     * @return ConfirmNotifyResponse
     */
    CompletableFuture<ConfirmNotifyResponse> confirmNotify(ConfirmNotifyRequest request);

    /**
     * @param request the request parameters of CopyDatabase  CopyDatabaseRequest
     * @return CopyDatabaseResponse
     */
    CompletableFuture<CopyDatabaseResponse> copyDatabase(CopyDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server.</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95702.html">Copy a database between ApsaraDB RDS for SQL Server instances</a></p>
     * </blockquote>
     * <h3>Limits</h3>
     * <ul>
     * <li>The source and target instances must belong to the same Alibaba Cloud account.</li>
     * <li>The target instance <strong>must not contain</strong> a database that has the same name as the database to be copied from the source instance.</li>
     * <li>The available storage of the target instance <strong>must be greater than</strong> the storage used by the database to be copied from the source instance. If the storage is insufficient, <a href="https://help.aliyun.com/document_detail/95665.html">expand the storage</a> in a timely manner.</li>
     * <li>The source and target instances must be in the same region (zones can be different) and must use the same network type.</li>
     * <li>The source and target instances do not support <a href="https://help.aliyun.com/document_detail/603466.html">serverless instances</a>. To migrate a serverless instance, <a href="https://help.aliyun.com/document_detail/210947.html">use DTS</a>.</li>
     * <li>You <strong>must specify</strong> either BackupId or RestoreTime. An error is returned if neither parameter is specified.</li>
     * </ul>
     * 
     * @param request the request parameters of CopyDatabaseBetweenInstances  CopyDatabaseBetweenInstancesRequest
     * @return CopyDatabaseBetweenInstancesResponse
     */
    CompletableFuture<CopyDatabaseBetweenInstancesResponse> copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96089.html">Create an account for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96753.html">Create an account for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95810.html">Create an account for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97132.html">Create an account for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation calls the built-in backup feature of ApsaraDB RDS. You can also use Database Backup Service (DBS). For more information, &lt;props=&quot;china&quot;&gt;refer to <a href="https://help.aliyun.com/document_detail/2841997.html">DBS API overview</a>&lt;props=&quot;intl&quot;&gt;refer to <a href="https://help.aliyun.com/document_detail/2402073.html">DBS API overview</a>.</p>
     * <h3>Precautions</h3>
     * <p>When you invoke this operation, the instance must meet the following conditions. Otherwise, the operation is failed:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>No backup node is being executed.</li>
     * <li>A maximum of 20 backup sets can be created for a single instance per day.</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/378074.html">Back up an RDS MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96772.html">Back up an RDS PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95717.html">Back up an RDS SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97147.html">Back up an RDS MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">One-click migration to RDS</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudMigrationPrecheckTask  CreateCloudMigrationPrecheckTaskRequest
     * @return CreateCloudMigrationPrecheckTaskResponse
     */
    CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> createCloudMigrationPrecheckTask(CreateCloudMigrationPrecheckTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">Migrate to the cloud</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudMigrationTask  CreateCloudMigrationTaskRequest
     * @return CreateCloudMigrationTaskResponse
     */
    CompletableFuture<CreateCloudMigrationTaskResponse> createCloudMigrationTask(CreateCloudMigrationTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related feature documentation carefully before you call this operation.
     * If an error is returned when you call this operation, search for the error message to find the cause.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/148036.html">Create an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/412231.html">Create a serverless ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/148038.html">Create an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/607753.html">Create a serverless ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/428615.html">Create a Babelfish for ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/148037.html">Create an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/603465.html">Create a serverless ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/148040.html">Create an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li>RDS MySQL: <a href="https://help.aliyun.com/document_detail/464132.html">Add a cluster read-only endpoint</a></li>
     * <li>RDS PostgreSQL: <a href="https://help.aliyun.com/document_detail/96788.html">Add a cluster read-only endpoint</a>
     * &lt;props=&quot;intl&quot;&gt;
     * <a href="https://help.aliyun.com/document_detail/464132.html">Add a cluster read-only endpoint</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstanceEndpoint  CreateDBInstanceEndpointRequest
     * @return CreateDBInstanceEndpointResponse
     */
    CompletableFuture<CreateDBInstanceEndpointResponse> createDBInstanceEndpoint(CreateDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>You can create a public endpoint for an endpoint only when the endpoint does not have a public endpoint.</li>
     * <li>The configurations such as traffic distribution weights are the same as those of the internal endpoint of the endpoint. Each endpoint can have only one public endpoint and one internal endpoint.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstanceEndpointAddress  CreateDBInstanceEndpointAddressRequest
     * @return CreateDBInstanceEndpointAddressResponse
     */
    CompletableFuture<CreateDBInstanceEndpointAddressResponse> createDBInstanceEndpointAddress(CreateDBInstanceEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related feature documentation carefully before you perform this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96065.html">Rebuild an RDS MySQL instance from the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96752.html">Rebuild an RDS PostgreSQL instance from the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95669.html">Rebuild an RDS SQL Server instance from the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97131.html">Rebuild an RDS MariaDB instance from the recycle bin</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstanceForRebuild  CreateDBInstanceForRebuildRequest
     * @return CreateDBInstanceForRebuildResponse
     */
    CompletableFuture<CreateDBInstanceForRebuildResponse> createDBInstanceForRebuild(CreateDBInstanceForRebuildRequest request);

    /**
     * @param request the request parameters of CreateDBInstanceReplication  CreateDBInstanceReplicationRequest
     * @return CreateDBInstanceReplicationResponse
     */
    CompletableFuture<CreateDBInstanceReplicationResponse> createDBInstanceReplication(CreateDBInstanceReplicationRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of CreateDBInstanceSecurityGroupRule  CreateDBInstanceSecurityGroupRuleRequest
     * @return CreateDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<CreateDBInstanceSecurityGroupRuleResponse> createDBInstanceSecurityGroupRule(CreateDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following feature documentation carefully to fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li>RDS MySQL: <a href="https://help.aliyun.com/document_detail/464129.html">Add nodes to an ApsaraDB RDS for MySQL instance that runs the Cluster Edition</a></li>
     * <li>RDS PostgreSQL: <a href="https://help.aliyun.com/document_detail/2778876.html">Add nodes to an ApsaraDB RDS for PostgreSQL instance that runs the Cluster Edition</a>
     * &lt;props=&quot;intl&quot;&gt;
     * <a href="https://help.aliyun.com/document_detail/464129.html">Add nodes to an ApsaraDB RDS for MySQL instance that runs the Cluster Edition</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBNodes  CreateDBNodesRequest
     * @return CreateDBNodesResponse
     */
    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you invoke this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Create an internal or public database proxy endpoint for an RDS MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Create an internal or public database proxy endpoint for an RDS PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBProxyEndpointAddress  CreateDBProxyEndpointAddressRequest
     * @return CreateDBProxyEndpointAddressResponse
     */
    CompletableFuture<CreateDBProxyEndpointAddressResponse> createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96105.html">Create a database on an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96758.html">Create a database on an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95698.html">Create a database on an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97136.html">Create a database on an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Suggestions</h3>
     * <p>Before you perform a restoration, call the CheckCreateDdrDBInstance operation to check whether the cross-region backup set of the destination ApsaraDB RDS instance can be used for cross-region restoration.</p>
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDdrInstance  CreateDdrInstanceRequest
     * @return CreateDdrInstanceResponse
     */
    CompletableFuture<CreateDdrInstanceResponse> createDdrInstance(CreateDdrInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/328592.html">Create and release a GAD cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGADInstance  CreateGADInstanceRequest
     * @return CreateGADInstanceResponse
     */
    CompletableFuture<CreateGADInstanceResponse> createGADInstance(CreateGADInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the documentation to fully understand the prerequisites and potential impacts, and then proceed.
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/331851.html">Add or remove unit nodes</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGadInstanceMember  CreateGadInstanceMemberRequest
     * @return CreateGadInstanceMemberResponse
     */
    CompletableFuture<CreateGadInstanceMemberResponse> createGadInstanceMember(CreateGadInstanceMemberRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a data import task for importing data to an ApsaraDB RDS for MySQL instance with native replication.</p>
     * 
     * @param request the request parameters of CreateImportTask  CreateImportTaskRequest
     * @return CreateImportTaskResponse
     */
    CompletableFuture<CreateImportTaskResponse> createImportTask(CreateImportTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that the column encryption service is activated in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when you invoke this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption service through Cloud Hardware Security Module (CloudHSM) before trying again.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMaskingRules  CreateMaskingRulesRequest
     * @return CreateMaskingRulesResponse
     */
    CompletableFuture<CreateMaskingRulesResponse> createMaskingRules(CreateMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <h3>Before you begin</h3>
     * <p><a href="https://help.aliyun.com/document_detail/100019.html">Upload self-managed SQL Server backup data to OSS</a>.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>Cross-account data replication is not supported. For example, you cannot migrate a backup file from OSS under Alibaba Cloud account A to an ApsaraDB RDS for SQL Server instance under Alibaba Cloud account B.</li>
     * <li>To migrate data across accounts, first <a href="https://help.aliyun.com/document_detail/2401486.html">copy the OSS data from source account A to an OSS bucket under target account B</a>. Make sure that the OSS data and the ApsaraDB RDS for SQL Server instance belong to the same Alibaba Cloud account before you call the operation described in this topic to create a migration node.</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following feature documentation carefully. Make sure that you fully understand the <strong>prerequisites</strong>, <strong>preparations</strong>, and potential impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/100019.html">Migrate data to an ApsaraDB RDS for SQL Server instance at the instance level</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateMigrateTask  CreateMigrateTaskRequest
     * @return CreateMigrateTaskResponse
     */
    CompletableFuture<CreateMigrateTaskResponse> createMigrateTask(CreateMigrateTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.
     * This operation is used for backup data migration to the cloud. Read the following documentation before you call this operation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/95737.html">Migrate full backup data to ApsaraDB RDS for SQL Server 2008 R2</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95738.html">Migrate full backup data to ApsaraDB RDS for SQL Server 2012, 2014, 2016, 2017, and 2019</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95736.html">Migrate incremental backup data to ApsaraDB RDS for SQL Server 2012, 2014, 2016, 2017, and 2019</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateOnlineDatabaseTask  CreateOnlineDatabaseTaskRequest
     * @return CreateOnlineDatabaseTaskResponse
     */
    CompletableFuture<CreateOnlineDatabaseTaskResponse> createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/464130.html">Delete nodes from an ApsaraDB RDS for MySQL Cluster Edition instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOrderForDeleteDBNodes  CreateOrderForDeleteDBNodesRequest
     * @return CreateOrderForDeleteDBNodesResponse
     */
    CompletableFuture<CreateOrderForDeleteDBNodesResponse> createOrderForDeleteDBNodes(CreateOrderForDeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateParameterGroup  CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;You can join the RDS PostgreSQL extension exchange DingTalk group (103525002795) to consult, communicate, provide feedback, and obtain more information about extensions.</p>
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts. Proceed only after you understand the information.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * <h3>Precautions</h3>
     * <p>You can install only extensions that are supported by the major engine version of the instance. Otherwise, the installation fails.</p>
     * <ul>
     * <li>For information about supported extensions, see <a href="https://help.aliyun.com/document_detail/142340.html">Supported extensions</a>.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> to query the major engine version of the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePostgresExtensions  CreatePostgresExtensionsRequest
     * @return CreatePostgresExtensionsResponse
     */
    CompletableFuture<CreatePostgresExtensionsResponse> createPostgresExtensions(CreatePostgresExtensionsRequest request);

    /**
     * @param request the request parameters of CreateRCDeploymentSet  CreateRCDeploymentSetRequest
     * @return CreateRCDeploymentSetResponse
     */
    CompletableFuture<CreateRCDeploymentSetResponse> createRCDeploymentSet(CreateRCDeploymentSetRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Supported cloud disk types: ultra cloud disk, standard SSD, ESSD, and premium performance disk (default).</li>
     * <li>If the billing method of the cloud disk is subscription (<strong>Prepaid</strong>), you must specify the instance ID of a subscription instance (<strong>InstanceId</strong>) to which the cloud disk is mounted. The expiration time of the cloud disk is the same as that of the instance.</li>
     * <li>You can create a pay-as-you-go (<strong>Postpaid</strong>) cloud disk separately without mounting it to an instance. You can also mount it to an instance of any billing method during creation as needed.</li>
     * <li>The cloud disk types and the number of cloud disks that can be mounted vary based on instance specifications.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRCDisk  CreateRCDiskRequest
     * @return CreateRCDiskResponse
     */
    CompletableFuture<CreateRCDiskResponse> createRCDisk(CreateRCDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2844223.html">Introduction to RDS Custom for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2864363.html">Introduction to RDS Custom for SQL Server</a></li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Method 1: Create a custom image from a snapshot of the <strong>system cloud disk</strong>. Specify SnapshotId and ImageName together.</li>
     * <li>Method 2: Create a custom image from an RDS Custom instance. Specify InstanceId and ImageName together.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRCImage  CreateRCImageRequest
     * @return CreateRCImageResponse
     */
    CompletableFuture<CreateRCImageResponse> createRCImage(CreateRCImageRequest request);

    /**
     * @param request the request parameters of CreateRCNodePool  CreateRCNodePoolRequest
     * @return CreateRCNodePoolResponse
     */
    CompletableFuture<CreateRCNodePoolResponse> createRCNodePool(CreateRCNodePoolRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot create a snapshot for a cloud disk in the following scenarios:</p>
     * <ul>
     * <li>The number of manual snapshots retained for the cloud disk has reached 256.</li>
     * <li>The previous snapshot has not been created yet.</li>
     * <li>The instance to which the cloud disk is mounted has never been started.</li>
     * <li>The instance to which the cloud disk is mounted is not in the <strong>Stopped</strong> or <strong>Running</strong> instance status.
     * When you create a snapshot, take note of the following items:</li>
     * <li>If the snapshot has not been created, the snapshot cannot be used to create a custom image (CreateImage).</li>
     * <li>If the cloud disk is mounted to an RDS Custom instance, do not change the instance status while the snapshot is being created.</li>
     * <li>You can create snapshots for cloud disks in the <strong>Expired</strong> state. If the cloud disk reaches its expiration release time while the snapshot is being created, the cloud disk is released and the snapshot in the Creating state is also deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRCSnapshot  CreateRCSnapshotRequest
     * @return CreateRCSnapshotResponse
     */
    CompletableFuture<CreateRCSnapshotResponse> createRCSnapshot(CreateRCSnapshotRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/56991.html">Create a read-only ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2950002.html">Create a DuckDB-based analytical instance for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/108959.html">Create a read-only ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2977241.html">Create a DuckDB-based analytical instance for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/99005.html">Create a read-only ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateReadOnlyDBInstance  CreateReadOnlyDBInstanceRequest
     * @return CreateReadOnlyDBInstanceResponse
     */
    CompletableFuture<CreateReadOnlyDBInstanceResponse> createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server<blockquote>
     * <p>The parameter requirements vary by engine. Specify parameters based on the engine type.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateReplicationLink  CreateReplicationLinkRequest
     * @return CreateReplicationLinkResponse
     */
    CompletableFuture<CreateReplicationLinkResponse> createReplicationLink(CreateReplicationLinkRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/342840.html">Service-linked role</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server 2008 R2 (with Premium Local SSDs)</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95724.html">Restore SQL Server data by using a temporary instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateTempDBInstance  CreateTempDBInstanceRequest
     * @return CreateTempDBInstanceResponse
     */
    CompletableFuture<CreateTempDBInstanceResponse> createTempDBInstance(CreateTempDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateYouhuiForOrder  CreateYouhuiForOrderRequest
     * @return CreateYouhuiForOrderResponse
     */
    CompletableFuture<CreateYouhuiForOrderResponse> createYouhuiForOrder(CreateYouhuiForOrderRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteADSetting  DeleteADSettingRequest
     * @return DeleteADSettingResponse
     */
    CompletableFuture<DeleteADSettingResponse> deleteADSetting(DeleteADSettingRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96104.html">Delete a database account from an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/147649.html">Delete a database account from an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95694.html">Delete a database account from an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97135.html">Delete a database account from an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL<blockquote>
     * <p>Only High-availability Edition instances are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>When you invoke this operation to delete data backup files, only the backup sets of the instance itself are deleted. The backup sets of associated instances, such as read-only instances, disaster recovery instances, and clone instances, are not deleted.</p>
     * <h3>Precautions</h3>
     * <p>When you invoke this operation, the instance must meet the following conditions. Otherwise, the operation is failed:</p>
     * <ul>
     * <li>The instance status is active (Running).</li>
     * <li>If log backup is shutdown, the ApsaraDB RDS instance does not support the point-in-time restoration feature. In this case, you can delete any data backup files that were generated more than seven days ago.</li>
     * <li>If log backup is enabled and the log backup retention period is shorter than the data backup retention period, data backup files that have exceeded the log backup retention period can be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p><strong>This operation is not available to new users.</strong> You can use other methods to <a href="https://help.aliyun.com/document_detail/95718.html">reduce or save backup storage costs</a>. Users who were previously added to the whitelist can still use this operation normally. Before you delete backup sets, confirm the availability of the backup sets. Deleted backup sets cannot be recovered.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteBackupFile  DeleteBackupFileRequest
     * @return DeleteBackupFileResponse
     */
    CompletableFuture<DeleteBackupFileResponse> deleteBackupFile(DeleteBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96057.html">Release an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96749.html">Release an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95662.html">Release an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97128.html">Release an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;ApsaraDB RDS for MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li>ApsaraDB RDS for MySQL: <a href="https://help.aliyun.com/document_detail/464133.html">Delete a cluster read-only endpoint</a></li>
     * <li>ApsaraDB RDS for PostgreSQL: <a href="https://help.aliyun.com/document_detail/96788.html">Delete a cluster read-only endpoint</a>
     * &lt;props=&quot;intl&quot;&gt;
     * ApsaraDB RDS for MySQL: <a href="https://help.aliyun.com/document_detail/464133.html">Delete a cluster read-only endpoint</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBInstanceEndpoint  DeleteDBInstanceEndpointRequest
     * @return DeleteDBInstanceEndpointResponse
     */
    CompletableFuture<DeleteDBInstanceEndpointResponse> deleteDBInstanceEndpoint(DeleteDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>You can delete only the public endpoint from an endpoint. To delete the internal endpoint, delete the endpoint directly.</p>
     * 
     * @param request the request parameters of DeleteDBInstanceEndpointAddress  DeleteDBInstanceEndpointAddressRequest
     * @return DeleteDBInstanceEndpointAddressResponse
     */
    CompletableFuture<DeleteDBInstanceEndpointAddressResponse> deleteDBInstanceEndpointAddress(DeleteDBInstanceEndpointAddressRequest request);

    /**
     * @param request the request parameters of DeleteDBInstanceReplication  DeleteDBInstanceReplicationRequest
     * @return DeleteDBInstanceReplicationResponse
     */
    CompletableFuture<DeleteDBInstanceReplicationResponse> deleteDBInstanceReplication(DeleteDBInstanceReplicationRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of DeleteDBInstanceSecurityGroupRule  DeleteDBInstanceSecurityGroupRuleRequest
     * @return DeleteDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<DeleteDBInstanceSecurityGroupRuleResponse> deleteDBInstanceSecurityGroupRule(DeleteDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li>RDS MySQL: <a href="https://help.aliyun.com/document_detail/464130.html">Delete nodes from an ApsaraDB RDS for MySQL instance that runs Cluster Edition</a></li>
     * <li>RDS PostgreSQL: <a href="https://help.aliyun.com/document_detail/2778876.html">Delete nodes from an ApsaraDB RDS for PostgreSQL instance that runs Cluster Edition</a>
     * &lt;props=&quot;intl&quot;&gt;
     * <a href="https://help.aliyun.com/document_detail/464130.html">Delete nodes from an ApsaraDB RDS for MySQL instance that runs Cluster Edition</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBNodes  DeleteDBNodesRequest
     * @return DeleteDBNodesResponse
     */
    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Settings for database proxy endpoints for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Settings for database proxy endpoints for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBProxyEndpointAddress  DeleteDBProxyEndpointAddressRequest
     * @return DeleteDBProxyEndpointAddressResponse
     */
    CompletableFuture<DeleteDBProxyEndpointAddressResponse> deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96106.html">Delete a database from an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96759.html">Delete a database from an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95699.html">Delete a database from an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97137.html">Delete a database from an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDatabase  DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>A deleted ApsaraDB RDS global active database cluster cannot be recovered. Proceed with caution.</li>
     * <li>Deleting an ApsaraDB RDS global active database cluster removes all nodes and DTS synchronization tasks in the cluster but does not release the corresponding ApsaraDB RDS for MySQL instances. If you no longer need these instances, invoke <a href="https://help.aliyun.com/document_detail/26229.html">DeleteDBInstance</a> to manually release them.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteGadInstance  DeleteGadInstanceRequest
     * @return DeleteGadInstanceResponse
     */
    CompletableFuture<DeleteGadInstanceResponse> deleteGadInstance(DeleteGadInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when invoking this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature in Cloud Hardware Security Module (CloudHSM).</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMaskingRules  DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteParameterGroup  DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96063.html">Set instance parameters for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96751.html">Set instance parameters for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteParameterTimedScheduleTask  DeleteParameterTimedScheduleTaskRequest
     * @return DeleteParameterTimedScheduleTaskResponse
     */
    CompletableFuture<DeleteParameterTimedScheduleTaskResponse> deleteParameterTimedScheduleTask(DeleteParameterTimedScheduleTaskRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;You can join the RDS PostgreSQL extension exchange DingTalk group (103525002795) to consult, communicate, provide feedback, and obtain more information about extensions.</p>
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DeletePostgresExtensions  DeletePostgresExtensionsRequest
     * @return DeletePostgresExtensionsResponse
     */
    CompletableFuture<DeletePostgresExtensionsResponse> deletePostgresExtensions(DeletePostgresExtensionsRequest request);

    /**
     * @param request the request parameters of DeleteRCClusterNodes  DeleteRCClusterNodesRequest
     * @return DeleteRCClusterNodesResponse
     */
    CompletableFuture<DeleteRCClusterNodesResponse> deleteRCClusterNodes(DeleteRCClusterNodesRequest request);

    /**
     * @param request the request parameters of DeleteRCDeploymentSet  DeleteRCDeploymentSetRequest
     * @return DeleteRCDeploymentSetResponse
     */
    CompletableFuture<DeleteRCDeploymentSetResponse> deleteRCDeploymentSet(DeleteRCDeploymentSetRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Manual snapshots of the cloud disk are retained.</li>
     * <li>When you release a cloud disk, the cloud disk must be in the <strong>Unattached</strong> (Available) state.</li>
     * <li>If the cloud disk with the specified ID does not exist, the request is ignored.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRCDisk  DeleteRCDiskRequest
     * @return DeleteRCDiskResponse
     */
    CompletableFuture<DeleteRCDiskResponse> deleteRCDisk(DeleteRCDiskRequest request);

    /**
     * @param request the request parameters of DeleteRCInstance  DeleteRCInstanceRequest
     * @return DeleteRCInstanceResponse
     */
    CompletableFuture<DeleteRCInstanceResponse> deleteRCInstance(DeleteRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>After an instance is released, all physical resources used by the instance are reclaimed, and all related data is permanently lost and cannot be recovered.</p>
     * 
     * @param request the request parameters of DeleteRCInstances  DeleteRCInstancesRequest
     * @return DeleteRCInstancesResponse
     */
    CompletableFuture<DeleteRCInstancesResponse> deleteRCInstances(DeleteRCInstancesRequest request);

    /**
     * @param request the request parameters of DeleteRCNodePool  DeleteRCNodePoolRequest
     * @return DeleteRCNodePoolResponse
     */
    CompletableFuture<DeleteRCNodePoolResponse> deleteRCNodePool(DeleteRCNodePoolRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>If the specified snapshot ID does not exist, the request is ignored.</li>
     * <li>If the snapshot has been used to create a custom image, the snapshot cannot be deleted. You must delete the custom image before you can delete the snapshot.</li>
     * <li>If the snapshot has been used to create a cloud disk and the Force parameter is not specified or is set to false, the snapshot cannot be directly deleted. If you want to delete the snapshot, set Force to true to force delete it. After the snapshot is force deleted, the corresponding cloud disk cannot perform initialization again.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRCSnapshot  DeleteRCSnapshotRequest
     * @return DeleteRCSnapshotResponse
     */
    CompletableFuture<DeleteRCSnapshotResponse> deleteRCSnapshot(DeleteRCSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteRCVCluster  DeleteRCVClusterRequest
     * @return DeleteRCVClusterResponse
     */
    CompletableFuture<DeleteRCVClusterResponse> deleteRCVCluster(DeleteRCVClusterRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteReplicationLink  DeleteReplicationLinkRequest
     * @return DeleteReplicationLinkResponse
     */
    CompletableFuture<DeleteReplicationLinkResponse> deleteReplicationLink(DeleteReplicationLinkRequest request);

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>A replication slot can be deleted only when its status (SlotStatus) is <strong>INACTIVE</strong>. You can call the DescribeSlots operation to query the replication slot status.</p>
     * 
     * @param request the request parameters of DeleteSlot  DeleteSlotRequest
     * @return DeleteSlotResponse
     */
    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>A user backup is a full backup of a self-managed MySQL database. You can restore a user backup to the cloud. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the full data of a self-managed MySQL 5.7 database to the cloud</a>.</li>
     * <li>This operation only deletes the specified user backup from the ApsaraDB RDS console and does not affect the original backup file in Object Storage Service (OSS). After the deletion, you can call the ImportUserBackupFile operation to re-import the user backup.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUserBackupFile  DeleteUserBackupFileRequest
     * @return DeleteUserBackupFileResponse
     */
    CompletableFuture<DeleteUserBackupFileResponse> deleteUserBackupFile(DeleteUserBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescibeImportsFromDatabase  DescibeImportsFromDatabaseRequest
     * @return DescibeImportsFromDatabaseResponse
     */
    CompletableFuture<DescibeImportsFromDatabaseResponse> descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeADInfo  DescribeADInfoRequest
     * @return DescribeADInfoResponse
     */
    CompletableFuture<DescribeADInfoResponse> describeADInfo(DescribeADInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before you invoke this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive the error message ColumnEncryptionErrorCode.NOT_PURCHASED when you invoke this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature before using it.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAccountMaskingPrivilege  DescribeAccountMaskingPrivilegeRequest
     * @return DescribeAccountMaskingPrivilegeResponse
     */
    CompletableFuture<DescribeAccountMaskingPrivilegeResponse> describeAccountMaskingPrivilege(DescribeAccountMaskingPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActionEventPolicy  DescribeActionEventPolicyRequest
     * @return DescribeActionEventPolicyResponse
     */
    CompletableFuture<DescribeActionEventPolicyResponse> describeActionEventPolicy(DescribeActionEventPolicyRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationMaintainConf  DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    CompletableFuture<DescribeActiveOperationMaintainConfResponse> describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">Scheduled events for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">Scheduled events for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">Scheduled events for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">Scheduled events for ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAllWhitelistTemplate  DescribeAllWhitelistTemplateRequest
     * @return DescribeAllWhitelistTemplateResponse
     */
    CompletableFuture<DescribeAllWhitelistTemplateResponse> describeAllWhitelistTemplate(DescribeAllWhitelistTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS MySQL</p>
     * <h3>Related documentation</h3>
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/155180.html">Create and view MySQL analytical instances</a></p>
     * 
     * @param request the request parameters of DescribeAnalyticdbByPrimaryDBInstance  DescribeAnalyticdbByPrimaryDBInstanceRequest
     * @return DescribeAnalyticdbByPrimaryDBInstanceResponse
     */
    CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> describeAnalyticdbByPrimaryDBInstance(DescribeAnalyticdbByPrimaryDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableClasses  DescribeAvailableClassesRequest
     * @return DescribeAvailableClassesResponse
     */
    CompletableFuture<DescribeAvailableClassesResponse> describeAvailableClasses(DescribeAvailableClassesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableCrossRegion  DescribeAvailableCrossRegionRequest
     * @return DescribeAvailableCrossRegionResponse
     */
    CompletableFuture<DescribeAvailableCrossRegionResponse> describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View enhanced monitoring</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableMetrics  DescribeAvailableMetricsRequest
     * @return DescribeAvailableMetricsResponse
     */
    CompletableFuture<DescribeAvailableMetricsResponse> describeAvailableMetrics(DescribeAvailableMetricsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To query the restorable time range of a regular backup file, see DescribeBackups.</p>
     * </blockquote>
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL (with Premium Local SSDs)</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableRecoveryTime  DescribeAvailableRecoveryTimeRequest
     * @return DescribeAvailableRecoveryTimeResponse
     */
    CompletableFuture<DescribeAvailableRecoveryTimeResponse> describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL<blockquote>
     * <p>This operation is used only to query available zone resources and is not used for the sales of ApsaraDB RDS for PostgreSQL on the console. Due to differences in actual sales policies, some parameter values on the buy page may slightly differ. When making a purchase, refer to the <a href="https://rdsbuy.console.aliyun.com/create/rds/PostgreSQL">buy page</a>.</p>
     * </blockquote>
     * </li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableZones  DescribeAvailableZonesRequest
     * @return DescribeAvailableZonesResponse
     */
    CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request);

    /**
     * @param request the request parameters of DescribeBackupDatabase  DescribeBackupDatabaseRequest
     * @return DescribeBackupDatabaseResponse
     */
    CompletableFuture<DescribeBackupDatabaseResponse> describeBackupDatabase(DescribeBackupDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackupTasks  DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>If <strong>DownloadLink</strong> is NULL, ApsaraDB RDS does not provide a download URL.</li>
     * <li>If <strong>DownloadLink</strong> is not NULL, you can use this URL to download the backup file. The URL has an expiration time specified by <strong>LinkExpiredTime</strong>. Download the file before the expiration time.</li>
     * <li>To download backup files by using Resource Access Management (RAM) users, grant authorization to the RAM users. For details, see <a href="https://help.aliyun.com/document_detail/100043.html">Grant a read-only RAM user the permissions to download backup files</a>.</li>
     * <li>The returned log list contains all log records whose log record end time is later than the query start time and whose log record start time is earlier than the query end time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBinlogFiles  DescribeBinlogFilesRequest
     * @return DescribeBinlogFilesResponse
     */
    CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCharacterSetName  DescribeCharacterSetNameRequest
     * @return DescribeCharacterSetNameResponse
     */
    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClassDetails  DescribeClassDetailsRequest
     * @return DescribeClassDetailsResponse
     */
    CompletableFuture<DescribeClassDetailsResponse> describeClassDetails(DescribeClassDetailsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudMigrationPrecheckResult  DescribeCloudMigrationPrecheckResultRequest
     * @return DescribeCloudMigrationPrecheckResultResponse
     */
    CompletableFuture<DescribeCloudMigrationPrecheckResultResponse> describeCloudMigrationPrecheckResult(DescribeCloudMigrationPrecheckResultRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudMigrationResult  DescribeCloudMigrationResultRequest
     * @return DescribeCloudMigrationResultResponse
     */
    CompletableFuture<DescribeCloudMigrationResultResponse> describeCloudMigrationResult(DescribeCloudMigrationResultRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server.</p>
     * 
     * @param request the request parameters of DescribeCollationTimeZones  DescribeCollationTimeZonesRequest
     * @return DescribeCollationTimeZonesResponse
     */
    CompletableFuture<DescribeCollationTimeZonesResponse> describeCollationTimeZones(DescribeCollationTimeZonesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2928780.html">Committed serverless</a></p>
     * 
     * @param request the request parameters of DescribeComputeBurstConfig  DescribeComputeBurstConfigRequest
     * @return DescribeComputeBurstConfigResponse
     */
    CompletableFuture<DescribeComputeBurstConfigResponse> describeComputeBurstConfig(DescribeComputeBurstConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossBackupMetaList  DescribeCrossBackupMetaListRequest
     * @return DescribeCrossBackupMetaListResponse
     */
    CompletableFuture<DescribeCrossBackupMetaListResponse> describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossRegionBackupDBInstance  DescribeCrossRegionBackupDBInstanceRequest
     * @return DescribeCrossRegionBackupDBInstanceResponse
     */
    CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL (<a href="https://help.aliyun.com/document_detail/69795.html">storage type</a> must be <strong>Premium Local SSDs</strong>. Cloud disks are not supported.)</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a><blockquote>
     * <p>To query cross-region log backup files, refer to DescribeCrossRegionLogBackupFiles.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossRegionBackups  DescribeCrossRegionBackupsRequest
     * @return DescribeCrossRegionBackupsResponse
     */
    CompletableFuture<DescribeCrossRegionBackupsResponse> describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL (the <a href="https://help.aliyun.com/document_detail/69795.html">storage type</a> must be <strong>Premium Local SSDs</strong>. Cloud disks are not supported.)</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a><blockquote>
     * <p>To query cross-region data backup files, refer to DescribeCrossRegionBackups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossRegionLogBackupFiles  DescribeCrossRegionLogBackupFilesRequest
     * @return DescribeCrossRegionLogBackupFilesResponse
     */
    CompletableFuture<DescribeCrossRegionLogBackupFilesResponse> describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request);

    /**
     * @param request the request parameters of DescribeCurrentModifyOrder  DescribeCurrentModifyOrderRequest
     * @return DescribeCurrentModifyOrderResponse
     */
    CompletableFuture<DescribeCurrentModifyOrderResponse> describeCurrentModifyOrder(DescribeCurrentModifyOrderRequest request);

    /**
     * @param request the request parameters of DescribeCustinsResourceInfo  DescribeCustinsResourceInfoRequest
     * @return DescribeCustinsResourceInfoResponse
     */
    CompletableFuture<DescribeCustinsResourceInfoResponse> describeCustinsResourceInfo(DescribeCustinsResourceInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceByTags  DescribeDBInstanceByTagsRequest
     * @return DescribeDBInstanceByTagsResponse
     */
    CompletableFuture<DescribeDBInstanceByTagsResponse> describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before you invoke this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when invoking this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceCLS  DescribeDBInstanceCLSRequest
     * @return DescribeDBInstanceCLSResponse
     */
    CompletableFuture<DescribeDBInstanceCLSResponse> describeDBInstanceCLS(DescribeDBInstanceCLSRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceConnectivity  DescribeDBInstanceConnectivityRequest
     * @return DescribeDBInstanceConnectivityResponse
     */
    CompletableFuture<DescribeDBInstanceConnectivityResponse> describeDBInstanceConnectivity(DescribeDBInstanceConnectivityRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS SQL Server.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDetail  DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
     */
    CompletableFuture<DescribeDBInstanceDetailResponse> describeDBInstanceDetail(DescribeDBInstanceDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceEncryptionKey  DescribeDBInstanceEncryptionKeyRequest
     * @return DescribeDBInstanceEncryptionKeyResponse
     */
    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceEndpoints  DescribeDBInstanceEndpointsRequest
     * @return DescribeDBInstanceEndpointsResponse
     */
    CompletableFuture<DescribeDBInstanceEndpointsResponse> describeDBInstanceEndpoints(DescribeDBInstanceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before you proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96055.html">Query the data replication mode of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/151265.html">Query the data replication mode of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/415433.html">Query the data replication mode of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceHAConfig  DescribeDBInstanceHAConfigRequest
     * @return DescribeDBInstanceHAConfigResponse
     */
    CompletableFuture<DescribeDBInstanceHAConfigResponse> describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceIPArrayList  DescribeDBInstanceIPArrayListRequest
     * @return DescribeDBInstanceIPArrayListResponse
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instance edition: Basic Edition, High-availability Edition (SQL Server 2012 or later), or Cluster Edition</li>
     * <li>Instance type: general-purpose or dedicated (shared instance types are not supported)</li>
     * <li>Instance creation time: Basic Edition instances must be created on or after September 2, 2022. You can view the instance creation time in the Running Status section on the Basic Information page.</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/124321.html">Configure a distributed transaction whitelist</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/124188.html">Migrate Kingdee K/3 WISE to Alibaba Cloud: Best practices for distributed transactions between ECS and RDS SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceIpHostname  DescribeDBInstanceIpHostnameRequest
     * @return DescribeDBInstanceIpHostnameResponse
     */
    CompletableFuture<DescribeDBInstanceIpHostnameResponse> describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View enhanced monitoring</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBInstanceMetrics  DescribeDBInstanceMetricsRequest
     * @return DescribeDBInstanceMetricsResponse
     */
    CompletableFuture<DescribeDBInstanceMetricsResponse> describeDBInstanceMetrics(DescribeDBInstanceMetricsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceMonitor  DescribeDBInstanceMonitorRequest
     * @return DescribeDBInstanceMonitorResponse
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceNetInfoForChannel  DescribeDBInstanceNetInfoForChannelRequest
     * @return DescribeDBInstanceNetInfoForChannelResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> describeDBInstanceNetInfoForChannel(DescribeDBInstanceNetInfoForChannelRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancePerformance  DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
     * @deprecated OpenAPI DescribeDBInstancePromoteActivity is deprecated  * @description This operation is no longer maintained. **You can still call this operation, but Alibaba Cloud no longer maintains it**.
     * 
     * @param request the request parameters of DescribeDBInstancePromoteActivity  DescribeDBInstancePromoteActivityRequest
     * @return DescribeDBInstancePromoteActivityResponse
     */
    @Deprecated
    CompletableFuture<DescribeDBInstancePromoteActivityResponse> describeDBInstancePromoteActivity(DescribeDBInstancePromoteActivityRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS MySQL</p>
     * <h3>Description</h3>
     * <p>This operation queries the MySQL shared database proxy. To query the dedicated dedicated proxy of an ApsaraDB RDS for MySQL instance, see <a href="https://help.aliyun.com/document_detail/610506.html">DescribeDBProxy</a>.</p>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation, make sure that the ApsaraDB RDS for MySQL instance uses a <strong>shared database proxy</strong>. Otherwise, the operation fails.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceProxyConfiguration  DescribeDBInstanceProxyConfigurationRequest
     * @return DescribeDBInstanceProxyConfigurationResponse
     */
    CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before you proceed.
     * <a href="https://help.aliyun.com/document_detail/2856487.html">RDS MySQL native replication instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBInstanceReplication  DescribeDBInstanceReplicationRequest
     * @return DescribeDBInstanceReplicationResponse
     */
    CompletableFuture<DescribeDBInstanceReplicationResponse> describeDBInstanceReplication(DescribeDBInstanceReplicationRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported DPI engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96120.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/229518.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95715.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for ApsaraDB RDS for SQL Server</a></p>
     * 
     * @param request the request parameters of DescribeDBInstanceSecurityGroupRule  DescribeDBInstanceSecurityGroupRuleRequest
     * @return DescribeDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<DescribeDBInstanceSecurityGroupRuleResponse> describeDBInstanceSecurityGroupRule(DescribeDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the primary/secondary switchover logs of an instance. This operation is applicable to ApsaraDB RDS for MySQL High-availability Edition instances, ApsaraDB RDS for MySQL RDS Enterprise Edition Enterprise instances, ApsaraDB RDS for SQL Server instances, ApsaraDB RDS for PostgreSQL instances, and PPAS instances.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceSwitchLog  DescribeDBInstanceSwitchLogRequest
     * @return DescribeDBInstanceSwitchLogResponse
     */
    CompletableFuture<DescribeDBInstanceSwitchLogResponse> describeDBInstanceSwitchLog(DescribeDBInstanceSwitchLogRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceTDE  DescribeDBInstanceTDERequest
     * @return DescribeDBInstanceTDEResponse
     */
    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeDBInstancesAsCsv is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description This operation is no longer maintained: **the operation can still be called, but Alibaba Cloud no longer maintains it**. Use the **DescribeDBInstances** operation instead.
     * 
     * @param request the request parameters of DescribeDBInstancesAsCsv  DescribeDBInstancesAsCsvRequest
     * @return DescribeDBInstancesAsCsvResponse
     */
    @Deprecated
    CompletableFuture<DescribeDBInstancesAsCsvResponse> describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancesByExpireTime  DescribeDBInstancesByExpireTimeRequest
     * @return DescribeDBInstancesByExpireTimeResponse
     */
    CompletableFuture<DescribeDBInstancesByExpireTimeResponse> describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request);

    /**
     * @param request the request parameters of DescribeDBInstancesByPerformance  DescribeDBInstancesByPerformanceRequest
     * @return DescribeDBInstancesByPerformanceResponse
     */
    CompletableFuture<DescribeDBInstancesByPerformanceResponse> describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request);

    /**
     * @deprecated OpenAPI DescribeDBInstancesForClone is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description This operation is no longer maintained: **the operation can still be called, but Alibaba Cloud no longer maintains it**. Use the [DescribeDBInstances](https://help.aliyun.com/document_detail/610396.html) operation to query the details of new instances.
     * 
     * @param request the request parameters of DescribeDBInstancesForClone  DescribeDBInstancesForCloneRequest
     * @return DescribeDBInstancesForCloneResponse
     */
    @Deprecated
    CompletableFuture<DescribeDBInstancesForCloneResponse> describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation is used to query the details of minor engine versions before you purchase or upgrade an ApsaraDB RDS for MySQL or ApsaraDB RDS for PostgreSQL instance, so that you can select a version as needed.</p>
     * 
     * @param request the request parameters of DescribeDBMiniEngineVersions  DescribeDBMiniEngineVersionsRequest
     * @return DescribeDBMiniEngineVersionsResponse
     */
    CompletableFuture<DescribeDBMiniEngineVersionsResponse> describeDBMiniEngineVersions(DescribeDBMiniEngineVersionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBProxy  DescribeDBProxyRequest
     * @return DescribeDBProxyResponse
     */
    CompletableFuture<DescribeDBProxyResponse> describeDBProxy(DescribeDBProxyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBProxyEndpoint  DescribeDBProxyEndpointRequest
     * @return DescribeDBProxyEndpointResponse
     */
    CompletableFuture<DescribeDBProxyEndpointResponse> describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL<blockquote>
     * <p>Starting from October 17, 2023, ApsaraDB RDS for MySQL Cluster Edition instances are progressively provided with a complimentary dedicated proxy service with one proxy node across regions. For more information, see <a href="https://help.aliyun.com/document_detail/2555466.html">ApsaraDB RDS for MySQL Cluster Edition complimentary dedicated proxy service with one proxy node</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following feature documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/194241.html">View monitoring data for RDS MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418275.html">View monitoring data for RDS PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBProxyPerformance  DescribeDBProxyPerformanceRequest
     * @return DescribeDBProxyPerformanceResponse
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/124321.html">Configure a distributed transaction whitelist for SQL Server</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDTCSecurityIpHostsForSQLServer  DescribeDTCSecurityIpHostsForSQLServerRequest
     * @return DescribeDTCSecurityIpHostsForSQLServerResponse
     */
    CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDatabases  DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
     * <b>description</b> :
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
     * 
     * @param request the request parameters of DescribeDedicatedHostGroups  DescribeDedicatedHostGroupsRequest
     * @return DescribeDedicatedHostGroupsResponse
     */
    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS MySQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2836955.html">Set the backup retention policy after an instance is released</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDetachedBackups  DescribeDetachedBackupsRequest
     * @return DescribeDetachedBackupsResponse
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeErrorLogs  DescribeErrorLogsRequest
     * @return DescribeErrorLogsResponse
     */
    CompletableFuture<DescribeErrorLogsResponse> describeErrorLogs(DescribeErrorLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before proceeding.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/468953.html">RDS MySQL historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2569306.html">RDS PostgreSQL historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2571444.html">RDS SQL Server historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2571339.html">RDS MariaDB historical events</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeGadInstances  DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
     */
    CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/207467.html">What is an availability check method</a></p>
     * 
     * @param request the request parameters of DescribeHADiagnoseConfig  DescribeHADiagnoseConfigRequest
     * @return DescribeHADiagnoseConfigResponse
     */
    CompletableFuture<DescribeHADiagnoseConfigResponse> describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHASwitchConfig  DescribeHASwitchConfigRequest
     * @return DescribeHASwitchConfigResponse
     */
    CompletableFuture<DescribeHASwitchConfigResponse> describeHASwitchConfig(DescribeHASwitchConfigRequest request);

    /**
     * @param request the request parameters of DescribeHistoryEvents  DescribeHistoryEventsRequest
     * @return DescribeHistoryEventsResponse
     */
    CompletableFuture<DescribeHistoryEventsResponse> describeHistoryEvents(DescribeHistoryEventsRequest request);

    /**
     * @param request the request parameters of DescribeHistoryEventsStat  DescribeHistoryEventsStatRequest
     * @return DescribeHistoryEventsStatResponse
     */
    CompletableFuture<DescribeHistoryEventsStatResponse> describeHistoryEventsStat(DescribeHistoryEventsStatRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/474275.html">Task list of ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/474537.html">Task list of ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/614826.html">Task list of ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHistoryTasks  DescribeHistoryTasksRequest
     * @return DescribeHistoryTasksResponse
     */
    CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request);

    /**
     * @param request the request parameters of DescribeHistoryTasksStat  DescribeHistoryTasksStatRequest
     * @return DescribeHistoryTasksStatResponse
     */
    CompletableFuture<DescribeHistoryTasksStatResponse> describeHistoryTasksStat(DescribeHistoryTasksStatRequest request);

    /**
     * @param request the request parameters of DescribeHostGroupElasticStrategyParameters  DescribeHostGroupElasticStrategyParametersRequest
     * @return DescribeHostGroupElasticStrategyParametersResponse
     */
    CompletableFuture<DescribeHostGroupElasticStrategyParametersResponse> describeHostGroupElasticStrategyParameters(DescribeHostGroupElasticStrategyParametersRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The RDS instance must meet the following conditions:<ul>
     * <li>Region: All regions except China (Zhangjiakou) support this feature.</li>
     * <li>Instance edition: Basic Edition, high-availability series (SQL Server 2012 or later), or Cluster Edition.</li>
     * <li>Instance type: general-purpose or dedicated. Shared instance types are not supported.</li>
     * <li>Network type: VPC. To change the network type, see <a href="https://help.aliyun.com/document_detail/95707.html">Change the network type</a>.</li>
     * <li>Instance creation time: High-availability series and Cluster Edition instances must be created on or after January 1, 2021. Basic Edition instances must be created on or after September 2, 2022. You can view the <strong>creation time</strong> in the <strong>Running Status</strong> section on the <strong>Basic Information</strong> page.</li>
     * </ul>
     * </li>
     * <li>You must log on with an <strong>Alibaba Cloud account</strong>.</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/354862.html">Create a host account and log on</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeHostWebShell  DescribeHostWebShellRequest
     * @return DescribeHostWebShellResponse
     */
    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a data import task.</p>
     * 
     * @param request the request parameters of DescribeImportTask  DescribeImportTaskRequest
     * @return DescribeImportTaskResponse
     */
    CompletableFuture<DescribeImportTaskResponse> describeImportTask(DescribeImportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of an import task dry run.</p>
     * 
     * @param request the request parameters of DescribeImportTaskValidation  DescribeImportTaskValidationRequest
     * @return DescribeImportTaskValidationResponse
     */
    CompletableFuture<DescribeImportTaskValidationResponse> describeImportTaskValidation(DescribeImportTaskValidationRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceCrossBackupPolicy  DescribeInstanceCrossBackupPolicyRequest
     * @return DescribeInstanceCrossBackupPolicyResponse
     */
    CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceKeywords  DescribeInstanceKeywordsRequest
     * @return DescribeInstanceKeywordsResponse
     */
    CompletableFuture<DescribeInstanceKeywordsResponse> describeInstanceKeywords(DescribeInstanceKeywordsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceLinkedWhitelistTemplate  DescribeInstanceLinkedWhitelistTemplateRequest
     * @return DescribeInstanceLinkedWhitelistTemplateResponse
     */
    CompletableFuture<DescribeInstanceLinkedWhitelistTemplateResponse> describeInstanceLinkedWhitelistTemplate(DescribeInstanceLinkedWhitelistTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeKmsAssociateResources  DescribeKmsAssociateResourcesRequest
     * @return DescribeKmsAssociateResourcesResponse
     */
    CompletableFuture<DescribeKmsAssociateResourcesResponse> describeKmsAssociateResources(DescribeKmsAssociateResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLocalAvailableRecoveryTime  DescribeLocalAvailableRecoveryTimeRequest
     * @return DescribeLocalAvailableRecoveryTimeResponse
     */
    CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p>To view log files of other engines, call DescribeBinlogFiles.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeLogBackupFiles  DescribeLogBackupFilesRequest
     * @return DescribeLogBackupFilesResponse
     */
    CompletableFuture<DescribeLogBackupFilesResponse> describeLogBackupFiles(DescribeLogBackupFilesRequest request);

    /**
     * @param request the request parameters of DescribeMarketingActivity  DescribeMarketingActivityRequest
     * @return DescribeMarketingActivityResponse
     */
    CompletableFuture<DescribeMarketingActivityResponse> describeMarketingActivity(DescribeMarketingActivityRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when you invoke this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column Cloud Hardware Security Module (CloudHSM) feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMaskingRules  DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <blockquote>
     * <p>Only MySQL 8.0, 5.7, and 5.6 High-availability Edition (local SSD) are supported.</p>
     * </blockquote>
     * <h3>Description</h3>
     * <p>Before you call the <a href="https://help.aliyun.com/document_detail/131510.html">RestoreTable</a> operation to perform <a href="https://help.aliyun.com/document_detail/103175.html">individual database and table restoration for MySQL</a>, you can call this operation to query the databases and tables that can be restored.</p>
     * 
     * @param request the request parameters of DescribeMetaList  DescribeMetaListRequest
     * @return DescribeMetaListResponse
     */
    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMigrateTaskById  DescribeMigrateTaskByIdRequest
     * @return DescribeMigrateTaskByIdResponse
     */
    CompletableFuture<DescribeMigrateTaskByIdResponse> describeMigrateTaskById(DescribeMigrateTaskByIdRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Description</h3>
     * <p>This operation queries backup data migration task records for an instance within the last week.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The source backup file for backup data migration must be a full backup (FULL) file.</li>
     * <li>ApsaraDB RDS for SQL Server 2017 Cluster Edition instances are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMigrateTasks  DescribeMigrateTasksRequest
     * @return DescribeMigrateTasksResponse
     */
    CompletableFuture<DescribeMigrateTasksResponse> describeMigrateTasks(DescribeMigrateTasksRequest request);

    /**
     * @param request the request parameters of DescribeModifyPGHbaConfigLog  DescribeModifyPGHbaConfigLogRequest
     * @return DescribeModifyPGHbaConfigLogResponse
     */
    CompletableFuture<DescribeModifyPGHbaConfigLogResponse> describeModifyPGHbaConfigLog(DescribeModifyPGHbaConfigLogRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModifyParameterLog  DescribeModifyParameterLogRequest
     * @return DescribeModifyParameterLogResponse
     */
    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>This operation does not support SQL Server 2017 Enterprise Edition or SQL Server 2019 Enterprise Edition Enterprise instances.</p>
     * 
     * @param request the request parameters of DescribeOssDownloads  DescribeOssDownloadsRequest
     * @return DescribeOssDownloadsResponse
     */
    CompletableFuture<DescribeOssDownloadsResponse> describeOssDownloads(DescribeOssDownloadsRequest request);

    /**
     * @param request the request parameters of DescribePGHbaConfig  DescribePGHbaConfigRequest
     * @return DescribePGHbaConfigResponse
     */
    CompletableFuture<DescribePGHbaConfigResponse> describePGHbaConfig(DescribePGHbaConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterGroup  DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96063.html">Set instance parameters for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96751.html">Set instance parameters for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterTimedScheduleTask  DescribeParameterTimedScheduleTaskRequest
     * @return DescribeParameterTimedScheduleTaskResponse
     */
    CompletableFuture<DescribeParameterTimedScheduleTaskResponse> describeParameterTimedScheduleTask(DescribeParameterTimedScheduleTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;You can join the RDS PostgreSQL extension exchange DingTalk group (103525002795) to consult, communicate, provide feedback, and obtain more information about extensions.</p>
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribePostgresExtensions  DescribePostgresExtensionsRequest
     * @return DescribePostgresExtensionsResponse
     */
    CompletableFuture<DescribePostgresExtensionsResponse> describePostgresExtensions(DescribePostgresExtensionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeQuickSaleConfig  DescribeQuickSaleConfigRequest
     * @return DescribeQuickSaleConfigResponse
     */
    CompletableFuture<DescribeQuickSaleConfigResponse> describeQuickSaleConfig(DescribeQuickSaleConfigRequest request);

    /**
     * @param request the request parameters of DescribeRCAvailableResource  DescribeRCAvailableResourceRequest
     * @return DescribeRCAvailableResourceResponse
     */
    CompletableFuture<DescribeRCAvailableResourceResponse> describeRCAvailableResource(DescribeRCAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeRCCloudAssistantStatus  DescribeRCCloudAssistantStatusRequest
     * @return DescribeRCCloudAssistantStatusResponse
     */
    CompletableFuture<DescribeRCCloudAssistantStatusResponse> describeRCCloudAssistantStatus(DescribeRCCloudAssistantStatusRequest request);

    /**
     * <b>description</b> :
     * <p>KubeConfig is used to configure access credentials for an ACK cluster on the client. It contains identity and authentication data for accessing the target cluster. When you use kubectl for cluster management, you need to connect through KubeConfig. Properly manage the KubeConfig credentials of the cluster and revoke them promptly when they are no longer needed to avoid security risks such as data leaks caused by KubeConfig exposure.</p>
     * 
     * @param request the request parameters of DescribeRCClusterConfig  DescribeRCClusterConfigRequest
     * @return DescribeRCClusterConfigResponse
     */
    CompletableFuture<DescribeRCClusterConfigResponse> describeRCClusterConfig(DescribeRCClusterConfigRequest request);

    /**
     * @param request the request parameters of DescribeRCClusterNodes  DescribeRCClusterNodesRequest
     * @return DescribeRCClusterNodesResponse
     */
    CompletableFuture<DescribeRCClusterNodesResponse> describeRCClusterNodes(DescribeRCClusterNodesRequest request);

    /**
     * @param request the request parameters of DescribeRCClusters  DescribeRCClustersRequest
     * @return DescribeRCClustersResponse
     */
    CompletableFuture<DescribeRCClustersResponse> describeRCClusters(DescribeRCClustersRequest request);

    /**
     * @param request the request parameters of DescribeRCDeploymentSets  DescribeRCDeploymentSetsRequest
     * @return DescribeRCDeploymentSetsResponse
     */
    CompletableFuture<DescribeRCDeploymentSetsResponse> describeRCDeploymentSets(DescribeRCDeploymentSetsRequest request);

    /**
     * @param request the request parameters of DescribeRCDisks  DescribeRCDisksRequest
     * @return DescribeRCDisksResponse
     */
    CompletableFuture<DescribeRCDisksResponse> describeRCDisks(DescribeRCDisksRequest request);

    /**
     * @param request the request parameters of DescribeRCElasticScaling  DescribeRCElasticScalingRequest
     * @return DescribeRCElasticScalingResponse
     */
    CompletableFuture<DescribeRCElasticScalingResponse> describeRCElasticScaling(DescribeRCElasticScalingRequest request);

    /**
     * @param request the request parameters of DescribeRCImageList  DescribeRCImageListRequest
     * @return DescribeRCImageListResponse
     */
    CompletableFuture<DescribeRCImageListResponse> describeRCImageList(DescribeRCImageListRequest request);

    /**
     * @param request the request parameters of DescribeRCInstanceAttribute  DescribeRCInstanceAttributeRequest
     * @return DescribeRCInstanceAttributeResponse
     */
    CompletableFuture<DescribeRCInstanceAttributeResponse> describeRCInstanceAttribute(DescribeRCInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2864363.html">Introduction to RDS Custom</a>
     * &lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>A DDoS attack, short for Distributed Denial of Service attack, is a common Network Security attack method. This type of attack primarily consumes the resources of networks or network devices through malicious traffic, causing websites to malfunction or online services to become unavailable. For information about the causes of DDoS attacks, common Attack Type, and methods to identify and mitigate DDoS attacks, see <a href="https://www.aliyun.com/getting-started/what-is/what-is-ddos">DDoS attacks</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRCInstanceDdosCount  DescribeRCInstanceDdosCountRequest
     * @return DescribeRCInstanceDdosCountResponse
     */
    CompletableFuture<DescribeRCInstanceDdosCountResponse> describeRCInstanceDdosCount(DescribeRCInstanceDdosCountRequest request);

    /**
     * @param request the request parameters of DescribeRCInstanceHistoryEvents  DescribeRCInstanceHistoryEventsRequest
     * @return DescribeRCInstanceHistoryEventsResponse
     */
    CompletableFuture<DescribeRCInstanceHistoryEventsResponse> describeRCInstanceHistoryEvents(DescribeRCInstanceHistoryEventsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2864363.html">Introduction to RDS Custom</a></p>
     * <blockquote>
     * <p>When an <a href="https://help.aliyun.com/document_detail/63643.html">Anti-DDoS Origin</a> instance contains one or more assets that are assigned public IP addresses, you can invoke this operation to query the DDoS mitigation information of RDS Custom for SQL Server instances under the current Alibaba Cloud account and the details of the associated Anti-DDoS Origin instance, such as the basic DDoS Mitigation Threshold, traffic scrubbing threshold, DDoS mitigation status of assets that are assigned public IP addresses, instance ID, and instance mitigation status.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRCInstanceIpAddress  DescribeRCInstanceIpAddressRequest
     * @return DescribeRCInstanceIpAddressResponse
     */
    CompletableFuture<DescribeRCInstanceIpAddressResponse> describeRCInstanceIpAddress(DescribeRCInstanceIpAddressRequest request);

    /**
     * @param request the request parameters of DescribeRCInstanceTypeFamilies  DescribeRCInstanceTypeFamiliesRequest
     * @return DescribeRCInstanceTypeFamiliesResponse
     */
    CompletableFuture<DescribeRCInstanceTypeFamiliesResponse> describeRCInstanceTypeFamilies(DescribeRCInstanceTypeFamiliesRequest request);

    /**
     * @param request the request parameters of DescribeRCInstanceTypes  DescribeRCInstanceTypesRequest
     * @return DescribeRCInstanceTypesResponse
     */
    CompletableFuture<DescribeRCInstanceTypesResponse> describeRCInstanceTypes(DescribeRCInstanceTypesRequest request);

    /**
     * <b>description</b> :
     * <p>The VNC logon URL is time-sensitive and valid for 15 seconds. If you do not use the URL within 15 seconds after the call succeeds, the URL automatically expires. In this case, call the operation again to obtain a new URL.</p>
     * 
     * @param request the request parameters of DescribeRCInstanceVncUrl  DescribeRCInstanceVncUrlRequest
     * @return DescribeRCInstanceVncUrlResponse
     */
    CompletableFuture<DescribeRCInstanceVncUrlResponse> describeRCInstanceVncUrl(DescribeRCInstanceVncUrlRequest request);

    /**
     * @param request the request parameters of DescribeRCInstances  DescribeRCInstancesRequest
     * @return DescribeRCInstancesResponse
     */
    CompletableFuture<DescribeRCInstancesResponse> describeRCInstances(DescribeRCInstancesRequest request);

    /**
     * @param request the request parameters of DescribeRCInvocationResults  DescribeRCInvocationResultsRequest
     * @return DescribeRCInvocationResultsResponse
     */
    CompletableFuture<DescribeRCInvocationResultsResponse> describeRCInvocationResults(DescribeRCInvocationResultsRequest request);

    /**
     * @param request the request parameters of DescribeRCMetricList  DescribeRCMetricListRequest
     * @return DescribeRCMetricListResponse
     */
    CompletableFuture<DescribeRCMetricListResponse> describeRCMetricList(DescribeRCMetricListRequest request);

    /**
     * @param request the request parameters of DescribeRCNetworkInterfaces  DescribeRCNetworkInterfacesRequest
     * @return DescribeRCNetworkInterfacesResponse
     */
    CompletableFuture<DescribeRCNetworkInterfacesResponse> describeRCNetworkInterfaces(DescribeRCNetworkInterfacesRequest request);

    /**
     * @param request the request parameters of DescribeRCNodePool  DescribeRCNodePoolRequest
     * @return DescribeRCNodePoolResponse
     */
    CompletableFuture<DescribeRCNodePoolResponse> describeRCNodePool(DescribeRCNodePoolRequest request);

    /**
     * @param request the request parameters of DescribeRCResourcesModification  DescribeRCResourcesModificationRequest
     * @return DescribeRCResourcesModificationResponse
     */
    CompletableFuture<DescribeRCResourcesModificationResponse> describeRCResourcesModification(DescribeRCResourcesModificationRequest request);

    /**
     * @param request the request parameters of DescribeRCSecurityGroupList  DescribeRCSecurityGroupListRequest
     * @return DescribeRCSecurityGroupListResponse
     */
    CompletableFuture<DescribeRCSecurityGroupListResponse> describeRCSecurityGroupList(DescribeRCSecurityGroupListRequest request);

    /**
     * @param request the request parameters of DescribeRCSecurityGroupPermission  DescribeRCSecurityGroupPermissionRequest
     * @return DescribeRCSecurityGroupPermissionResponse
     */
    CompletableFuture<DescribeRCSecurityGroupPermissionResponse> describeRCSecurityGroupPermission(DescribeRCSecurityGroupPermissionRequest request);

    /**
     * @param request the request parameters of DescribeRCSnapshots  DescribeRCSnapshotsRequest
     * @return DescribeRCSnapshotsResponse
     */
    CompletableFuture<DescribeRCSnapshotsResponse> describeRCSnapshots(DescribeRCSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeRCVCluster  DescribeRCVClusterRequest
     * @return DescribeRCVClusterResponse
     */
    CompletableFuture<DescribeRCVClusterResponse> describeRCVCluster(DescribeRCVClusterRequest request);

    /**
     * @deprecated OpenAPI DescribeRdsResourceSettings is deprecated  * @description This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it.
     * 
     * @param request the request parameters of DescribeRdsResourceSettings  DescribeRdsResourceSettingsRequest
     * @return DescribeRdsResourceSettingsResponse
     */
    @Deprecated
    CompletableFuture<DescribeRdsResourceSettingsResponse> describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeReadDBInstanceDelay  DescribeReadDBInstanceDelayRequest
     * @return DescribeReadDBInstanceDelayResponse
     */
    CompletableFuture<DescribeReadDBInstanceDelayResponse> describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegionInfos  DescribeRegionInfosRequest
     * @return DescribeRegionInfosResponse
     */
    CompletableFuture<DescribeRegionInfosResponse> describeRegionInfos(DescribeRegionInfosRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeReplicationLinkLogs  DescribeReplicationLinkLogsRequest
     * @return DescribeReplicationLinkLogsResponse
     */
    CompletableFuture<DescribeReplicationLinkLogsResponse> describeReplicationLinkLogs(DescribeReplicationLinkLogsRequest request);

    /**
     * @param request the request parameters of DescribeResourceDetails  DescribeResourceDetailsRequest
     * @return DescribeResourceDetailsResponse
     */
    CompletableFuture<DescribeResourceDetailsResponse> describeResourceDetails(DescribeResourceDetailsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeResourceUsage  DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     */
    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation instead.</p>
     * 
     * @param request the request parameters of DescribeSQLCollectorPolicy  DescribeSQLCollectorPolicyRequest
     * @return DescribeSQLCollectorPolicyResponse
     */
    CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation instead.</p>
     * 
     * @param request the request parameters of DescribeSQLCollectorRetention  DescribeSQLCollectorRetentionRequest
     * @return DescribeSQLCollectorRetentionResponse
     */
    CompletableFuture<DescribeSQLCollectorRetentionResponse> describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server<blockquote>
     * <p>Only SQL Server 2008 R2 is supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation does not support querying the SQL Explorer list for the trial edition of SQL Explorer on ApsaraDB RDS for MySQL instances.</li>
     * <li>This operation does not support querying SQL Explorer log files that are manually exported from the console. This operation supports querying only the list of SQL Explorer files that are generated by calling the <a href="https://help.aliyun.com/document_detail/610533.html">DescribeSQLLogRecords</a> operation with the <strong>Form</strong> request parameter set to <strong>File</strong>.</li>
     * <li>The exported files are retained for only 2 days.<blockquote>
     * <p>If DAS Enterprise Edition V2 or Enterprise Edition V3 is enabled and you use the SQL Explorer and Audit feature provided by DAS Enterprise Edition, the exported files are retained for 7 days. You can call <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> to query the enabled DAS Enterprise Edition information.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogFiles  DescribeSQLLogFilesRequest
     * @return DescribeSQLLogFilesResponse
     */
    CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation has been discontinued: The operation can still be invoked normally, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2360999.html">GetDasSQLLogHotData</a> operation instead.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Regardless of whether this operation is invoked successfully or failed, a single user (including the Alibaba Cloud account and Resource Access Management (RAM) users) can invoke this operation up to 1,000 times per minute.</li>
     * <li>This operation does not support querying SQL Explorer logs for the trial edition of SQL Explorer for MySQL instances.</li>
     * <li>When this operation generates an audit file (the <strong>Form</strong> request parameter is set to <strong>File</strong>), a maximum of 1,000,000 log entries are recorded, and keyword-based log filtering is not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogRecords  DescribeSQLLogRecordsRequest
     * @return DescribeSQLLogRecordsResponse
     */
    CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogReportList  DescribeSQLLogReportListRequest
     * @return DescribeSQLLogReportListResponse
     */
    CompletableFuture<DescribeSQLLogReportListResponse> describeSQLLogReportList(DescribeSQLLogReportListRequest request);

    /**
     * <b>description</b> :
     * <p>Applicable engine:</p>
     * <ul>
     * <li>SQL Server (only versions 2016 and earlier are supported)</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLServerUpgradeVersions  DescribeSQLServerUpgradeVersionsRequest
     * @return DescribeSQLServerUpgradeVersionsResponse
     */
    CompletableFuture<DescribeSQLServerUpgradeVersionsResponse> describeSQLServerUpgradeVersions(DescribeSQLServerUpgradeVersionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecrets  DescribeSecretsRequest
     * @return DescribeSecretsResponse
     */
    CompletableFuture<DescribeSecretsResponse> describeSecrets(DescribeSecretsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/201042.html">Configure a security group for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206310.html">Configure a security group for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2392322.html">Configure a security group for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroupConfiguration  DescribeSecurityGroupConfigurationRequest
     * @return DescribeSecurityGroupConfigurationResponse
     */
    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlots  DescribeSlotsRequest
     * @return DescribeSlotsResponse
     */
    CompletableFuture<DescribeSlotsResponse> describeSlots(DescribeSlotsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The response parameters of this operation are updated every minute.</li>
     * <li>A certain delay may occur when you call this operation to retrieve data. Wait for the response to be returned.</li>
     * <li>Starting from September 1, 2024, due to the optimization of the SQL template algorithm, the value of the SQLHash field will change when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/2845725.html">Notice: Optimization of the SQL template algorithm for slow SQL statements</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL<blockquote>
     * <p>MySQL 5.7 Basic Edition is not supported.</p>
     * </blockquote>
     * </li>
     * <li>ApsaraDB RDS for SQL Server<blockquote>
     * <p>Only SQL Server 2008 R2 is supported.</p>
     * </blockquote>
     * </li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Slow query log statistics are not collected in real time. A latency of 6 to 8 hours may occur.</li>
     * <li>If the response is empty, check whether the values of StartTime and EndTime are in the required UTC format. If the values are valid, no slow query logs exist within the specified time range.</li>
     * <li>Starting from September 1, 2024, the value of the <strong>SQLHash</strong> field will change when you call this operation due to the optimization of the SQL template algorithm. For more information, see <a href="https://help.aliyun.com/document_detail/2845725.html">Notice: SQL template algorithm optimization</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogs  DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server.</p>
     * 
     * @param request the request parameters of DescribeSupportOnlineResizeDisk  DescribeSupportOnlineResizeDiskRequest
     * @return DescribeSupportOnlineResizeDiskResponse
     */
    CompletableFuture<DescribeSupportOnlineResizeDiskResponse> describeSupportOnlineResizeDisk(DescribeSupportOnlineResizeDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>If you specify an instance ID, all tags of the instance are returned and other filter conditions are ignored.</li>
     * <li>If you specify only a tag key (TagKey) without a tag value (TagValue), all results that match the tag key are returned. If you specify both a tag key and a tag value, only results that match both conditions are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p>For ApsaraDB RDS for MySQL and ApsaraDB RDS for PostgreSQL instances, use <a href="https://help.aliyun.com/document_detail/2627863.html">DescribeHistoryTasks</a> to query tasks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engines</h3>
     * <p>ApsaraDB RDS for MySQL
     * ApsaraDB RDS for PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before you proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2794383.html">Major engine version upgrade check report for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL database</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/218391.html">Understand the major engine version upgrade check report for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUpgradeMajorVersionPrecheckTask  DescribeUpgradeMajorVersionPrecheckTaskRequest
     * @return DescribeUpgradeMajorVersionPrecheckTaskResponse
     */
    CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> describeUpgradeMajorVersionPrecheckTask(DescribeUpgradeMajorVersionPrecheckTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL.</p>
     * 
     * @param request the request parameters of DescribeUpgradeMajorVersionTasks  DescribeUpgradeMajorVersionTasksRequest
     * @return DescribeUpgradeMajorVersionTasksResponse
     */
    CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> describeUpgradeMajorVersionTasks(DescribeUpgradeMajorVersionTasksRequest request);

    /**
     * @param request the request parameters of DescribeVSwitchList  DescribeVSwitchListRequest
     * @return DescribeVSwitchListResponse
     */
    CompletableFuture<DescribeVSwitchListResponse> describeVSwitchList(DescribeVSwitchListRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeWhitelistTemplate  DescribeWhitelistTemplateRequest
     * @return DescribeWhitelistTemplateResponse
     */
    CompletableFuture<DescribeWhitelistTemplateResponse> describeWhitelistTemplate(DescribeWhitelistTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeWhitelistTemplateLinkedInstance  DescribeWhitelistTemplateLinkedInstanceRequest
     * @return DescribeWhitelistTemplateLinkedInstanceResponse
     */
    CompletableFuture<DescribeWhitelistTemplateLinkedInstanceResponse> describeWhitelistTemplateLinkedInstance(DescribeWhitelistTemplateLinkedInstanceRequest request);

    /**
     * @param request the request parameters of DestroyDBInstance  DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     */
    CompletableFuture<DestroyDBInstanceResponse> destroyDBInstance(DestroyDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>Only unit nodes can be removed.</p>
     * 
     * @param request the request parameters of DetachGadInstanceMember  DetachGadInstanceMemberRequest
     * @return DetachGadInstanceMemberResponse
     */
    CompletableFuture<DetachGadInstanceMemberResponse> detachGadInstanceMember(DetachGadInstanceMemberRequest request);

    /**
     * @param request the request parameters of DetachRCDisk  DetachRCDiskRequest
     * @return DetachRCDiskResponse
     */
    CompletableFuture<DetachRCDiskResponse> detachRCDisk(DetachRCDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DetachWhitelistTemplateToInstance  DetachWhitelistTemplateToInstanceRequest
     * @return DetachWhitelistTemplateToInstanceResponse
     */
    CompletableFuture<DetachWhitelistTemplateToInstanceResponse> detachWhitelistTemplateToInstance(DetachWhitelistTemplateToInstanceRequest request);

    /**
     * @param request the request parameters of EnableBackupEncryption  EnableBackupEncryptionRequest
     * @return EnableBackupEncryptionResponse
     */
    CompletableFuture<EnableBackupEncryptionResponse> enableBackupEncryption(EnableBackupEncryptionRequest request);

    /**
     * @param request the request parameters of EvaluateLocalExtendDisk  EvaluateLocalExtendDiskRequest
     * @return EvaluateLocalExtendDiskResponse
     */
    CompletableFuture<EvaluateLocalExtendDiskResponse> evaluateLocalExtendDisk(EvaluateLocalExtendDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS MySQL.</p>
     * 
     * @param request the request parameters of GetDBInstanceTopology  GetDBInstanceTopologyRequest
     * @return GetDBInstanceTopologyResponse
     */
    CompletableFuture<GetDBInstanceTopologyResponse> getDBInstanceTopology(GetDBInstanceTopologyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL.</p>
     * 
     * @param request the request parameters of GetDbProxyInstanceSsl  GetDbProxyInstanceSslRequest
     * @return GetDbProxyInstanceSslResponse
     */
    CompletableFuture<GetDbProxyInstanceSslResponse> getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96101.html">Modify account permissions for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95692.html">Modify account permissions for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97134.html">Modify account permissions for ApsaraDB RDS for MariaDB</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/257684.html">Permission details for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96102.html">Grant permissions to a service account for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95693.html">Grant permissions to a service account for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of GrantOperatorPermission  GrantOperatorPermissionRequest
     * @return GrantOperatorPermissionResponse
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * </ul>
     * <h3>Description</h3>
     * <p>A user backup is a full backup of a self-managed MySQL database. You can restore a user backup to the cloud.</p>
     * <h3>Before you begin</h3>
     * <p><strong>To call this operation, the following conditions must be met:</strong></p>
     * <ul>
     * <li>You have backed up a self-managed MySQL 5.7 or 8.0 database by using XtraBackup, and the backup file name ends with <code>_qp.xb</code>. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Full migration of self-managed MySQL 5.7 or 8.0 databases to the cloud</a>.</li>
     * <li>You have uploaded the backup file of the self-managed MySQL 5.7 or 8.0 database to an OSS bucket in the corresponding region. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Full migration of self-managed MySQL 5.7 or 8.0 databases to the cloud</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportUserBackupFile  ImportUserBackupFileRequest
     * @return ImportUserBackupFileResponse
     */
    CompletableFuture<ImportUserBackupFileResponse> importUserBackupFile(ImportUserBackupFileRequest request);

    /**
     * @param request the request parameters of InstallRCCloudAssistant  InstallRCCloudAssistantRequest
     * @return InstallRCCloudAssistantResponse
     */
    CompletableFuture<InstallRCCloudAssistantResponse> installRCCloudAssistant(InstallRCCloudAssistantRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ListClasses  ListClassesRequest
     * @return ListClassesResponse
     */
    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a list of data import tasks for native replication instances.</p>
     * 
     * @param request the request parameters of ListImportTasks  ListImportTasksRequest
     * @return ListImportTasksResponse
     */
    CompletableFuture<ListImportTasksResponse> listImportTasks(ListImportTasksRequest request);

    /**
     * @param request the request parameters of ListRCVClusters  ListRCVClustersRequest
     * @return ListRCVClustersResponse
     */
    CompletableFuture<ListRCVClustersResponse> listRCVClusters(ListRCVClustersRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>A user backup is a full backup of a self-managed MySQL database. You can restore a user backup to the cloud. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the full data of a self-managed MySQL 5.7 database to the cloud</a>.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/26228.html">CreateDBInstance</a> operation to create an ApsaraDB RDS for MySQL instance from a backup, you can call this operation to query the user backup ID.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/260266.html">ImportUserBackupFile</a> operation to import a user backup to ApsaraDB RDS.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserBackupFiles  ListUserBackupFilesRequest
     * @return ListUserBackupFilesResponse
     */
    CompletableFuture<ListUserBackupFilesResponse> listUserBackupFiles(ListUserBackupFilesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts. Proceed only after you understand the information.
     * <a href="https://help.aliyun.com/document_detail/147649.html">Lock an RDS PostgreSQL account</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of LockAccount  LockAccountRequest
     * @return LockAccountResponse
     */
    CompletableFuture<LockAccountResponse> lockAccount(LockAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for MySQL instance across zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for PostgreSQL instance across zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95658.html">Migrate an ApsaraDB RDS for SQL Server instance across zones</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateConnectionToOtherZone  MigrateConnectionToOtherZoneRequest
     * @return MigrateConnectionToOtherZoneResponse
     */
    CompletableFuture<MigrateConnectionToOtherZoneResponse> migrateConnectionToOtherZone(MigrateConnectionToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <p>The dedicated cluster feature allows you to manage instances in batches in the form of clusters. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
     * 
     * @param request the request parameters of MigrateDBInstance  MigrateDBInstanceRequest
     * @return MigrateDBInstanceResponse
     */
    CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request);

    /**
     * @param request the request parameters of MigrateDBNodes  MigrateDBNodesRequest
     * @return MigrateDBNodesResponse
     */
    CompletableFuture<MigrateDBNodesResponse> migrateDBNodes(MigrateDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96117.html">Switch to the enhanced whitelist mode for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96767.html">Switch to the enhanced whitelist mode for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateSecurityIPMode  MigrateSecurityIPModeRequest
     * @return MigrateSecurityIPModeResponse
     */
    CompletableFuture<MigrateSecurityIPModeResponse> migrateSecurityIPMode(MigrateSecurityIPModeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96053.html">Migrate an ApsaraDB RDS for MySQL instance across zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for PostgreSQL instance across zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95658.html">Migrate an ApsaraDB RDS for SQL Server instance across zones</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/170734.html">Connect an ApsaraDB RDS for SQL Server instance to a self-managed domain</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyADInfo  ModifyADInfoRequest
     * @return ModifyADInfoResponse
     */
    CompletableFuture<ModifyADInfoResponse> modifyADInfo(ModifyADInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for SQL Server (shared instance types and 2008 R2 instances are not supported)</p>
     * <blockquote>
     * <p>Before calling this operation, set the SQL Server account password policy. For more information, see <a href="https://help.aliyun.com/document_detail/2848321.html">ModifyAccountSecurityPolicy</a>.</p>
     * </blockquote>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2845728.html">Custom account password policies for ApsaraDB RDS for SQL Server</a></p>
     * 
     * @param request the request parameters of ModifyAccountCheckPolicy  ModifyAccountCheckPolicyRequest
     * @return ModifyAccountCheckPolicyResponse
     */
    CompletableFuture<ModifyAccountCheckPolicyResponse> modifyAccountCheckPolicy(ModifyAccountCheckPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before you invoke this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when you invoke this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature before trying again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAccountMaskingPrivilege  ModifyAccountMaskingPrivilegeRequest
     * @return ModifyAccountMaskingPrivilegeResponse
     */
    CompletableFuture<ModifyAccountMaskingPrivilegeResponse> modifyAccountMaskingPrivilege(ModifyAccountMaskingPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server (shared instance types and the 2008 R2 edition are not supported)</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following feature documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95640.html">Custom password policies for ApsaraDB RDS for SQL Server accounts</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyAccountSecurityPolicy  ModifyAccountSecurityPolicyRequest
     * @return ModifyAccountSecurityPolicyResponse
     */
    CompletableFuture<ModifyAccountSecurityPolicyResponse> modifyAccountSecurityPolicy(ModifyAccountSecurityPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/129759.html">ApsaraDB RDS for MySQL historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131008.html">ApsaraDB RDS for PostgreSQL historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131013.html">ApsaraDB RDS for SQL Server historical events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131010.html">ApsaraDB RDS for MariaDB historical events</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyActionEventPolicy  ModifyActionEventPolicyRequest
     * @return ModifyActionEventPolicyResponse
     */
    CompletableFuture<ModifyActionEventPolicyResponse> modifyActionEventPolicy(ModifyActionEventPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">Scheduled events of ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">Scheduled events of ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">Scheduled events of ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">Scheduled events of ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98818.html">Configure an automatic backup policy for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96772.html">Configure an automatic backup policy for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95717.html">Configure an automatic backup policy for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97147.html">Configure an automatic backup policy for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you invoke this operation, carefully read the feature documentation to fully understand the prerequisites and impacts. Then proceed with the operation.
     * <a href="https://help.aliyun.com/document_detail/95717.html">Manual backup of SQL Server data</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyBackupSetExpireTime  ModifyBackupSetExpireTimeRequest
     * @return ModifyBackupSetExpireTimeResponse
     */
    CompletableFuture<ModifyBackupSetExpireTimeResponse> modifyBackupSetExpireTime(ModifyBackupSetExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95700.html">Modify the character set collation and time zone</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyCollationTimeZone  ModifyCollationTimeZoneRequest
     * @return ModifyCollationTimeZoneResponse
     */
    CompletableFuture<ModifyCollationTimeZoneResponse> modifyCollationTimeZone(ModifyCollationTimeZoneRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2928780.html">Committed Serverless</a></p>
     * 
     * @param request the request parameters of ModifyComputeBurstConfig  ModifyComputeBurstConfigRequest
     * @return ModifyComputeBurstConfigResponse
     */
    CompletableFuture<ModifyComputeBurstConfigResponse> modifyComputeBurstConfig(ModifyComputeBurstConfigRequest request);

    /**
     * @param request the request parameters of ModifyCustinsResource  ModifyCustinsResourceRequest
     * @return ModifyCustinsResourceResponse
     */
    CompletableFuture<ModifyCustinsResourceResponse> modifyCustinsResource(ModifyCustinsResourceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBDescription  ModifyDBDescriptionRequest
     * @return ModifyDBDescriptionResponse
     */
    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBInstance  ModifyDBInstanceRequest
     * @return ModifyDBInstanceResponse
     */
    CompletableFuture<ModifyDBInstanceResponse> modifyDBInstance(ModifyDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96059.html">Modify the automatic upgrade settings for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146895.html">Modify the automatic upgrade settings for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceAutoUpgradeMinorVersion  ModifyDBInstanceAutoUpgradeMinorVersionRequest
     * @return ModifyDBInstanceAutoUpgradeMinorVersionResponse
     */
    CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive a fault message when invoking this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature before trying again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceCLS  ModifyDBInstanceCLSRequest
     * @return ModifyDBInstanceCLSResponse
     */
    CompletableFuture<ModifyDBInstanceCLSResponse> modifyDBInstanceCLS(ModifyDBInstanceCLSRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server<blockquote>
     * <p>Currently supported configuration items include <a href="https://help.aliyun.com/document_detail/2398301.html">ApsaraDB RDS for PostgreSQL PgBouncer</a>, <a href="https://help.aliyun.com/document_detail/124822.html">ApsaraDB RDS for PostgreSQL cloud disk encryption</a>, <a href="https://help.aliyun.com/document_detail/135391.html">ApsaraDB RDS for SQL Server cloud disk encryption</a>&lt;props=&quot;china&quot;&gt;, <a href="https://help.aliyun.com/document_detail/2618484.html">ApsaraDB RDS for SQL Server simple recovery</a>, and <a href="https://help.aliyun.com/document_detail/95645.html">ApsaraDB RDS for SQL Server error log cleanup</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceConfig  ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96163.html">Modify the endpoint and port of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96788.html">Modify the endpoint and port of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95740.html">Modify the endpoint and port of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97157.html">Modify the endpoint and port of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96056.html">Read-only instance delayed replication</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDelayedReplicationTime  ModifyDBInstanceDelayedReplicationTimeRequest
     * @return ModifyDBInstanceDelayedReplicationTimeResponse
     */
    CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> modifyDBInstanceDelayedReplicationTime(ModifyDBInstanceDelayedReplicationTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/414512.html">Enable and disable instance release protection for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/471512.html">Enable and disable instance release protection for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/416209.html">Enable and disable instance release protection for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/414512.html">Enable and disable instance release protection for ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDeletionProtection  ModifyDBInstanceDeletionProtectionRequest
     * @return ModifyDBInstanceDeletionProtectionResponse
     */
    CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> modifyDBInstanceDeletionProtection(ModifyDBInstanceDeletionProtectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceEndpoint  ModifyDBInstanceEndpointRequest
     * @return ModifyDBInstanceEndpointResponse
     */
    CompletableFuture<ModifyDBInstanceEndpointResponse> modifyDBInstanceEndpoint(ModifyDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported DPI engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL
     * &lt;props=&quot;intl&quot;&gt;RDS MySQL</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>You can modify endpoint connection information, including the connection string and port for public and internal network endpoints, and the VPC, vSwitch, and IP address for internal network connections.</li>
     * <li>When modifying, VpcId and VSwitchId are treated as a group. The internal network connection parameters (VpcId, VSwitchId, and PrivateIpAddress) and the connection parameters (ConnectionStringPrefix and Port) cannot be specified at the same time. However, you must specify at least one of them.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceEndpointAddress  ModifyDBInstanceEndpointAddressRequest
     * @return ModifyDBInstanceEndpointAddressResponse
     */
    CompletableFuture<ModifyDBInstanceEndpointAddressResponse> modifyDBInstanceEndpointAddress(ModifyDBInstanceEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96055.html">Modify the data replication method of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/151265.html">Modify the data replication method of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceHAConfig  ModifyDBInstanceHAConfigRequest
     * @return ModifyDBInstanceHAConfigResponse
     */
    CompletableFuture<ModifyDBInstanceHAConfigResponse> modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96052.html">Set the maintenance window of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96799.html">Set the maintenance window of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95657.html">Set the maintenance window of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97473.html">Set the maintenance window of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View enhanced monitoring</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBInstanceMetrics  ModifyDBInstanceMetricsRequest
     * @return ModifyDBInstanceMetricsResponse
     */
    CompletableFuture<ModifyDBInstanceMetricsResponse> modifyDBInstanceMetrics(ModifyDBInstanceMetricsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>Second-level monitoring for ApsaraDB RDS for MySQL incurs additional fees. Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/45020.html">billing methods and pricing</a> of ApsaraDB RDS.</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before using this operation, carefully read the following documentation to fully understand the prerequisites and potential impacts, and then proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96112.html">Set the monitoring frequency for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95710.html">Set the monitoring frequency for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceMonitor  ModifyDBInstanceMonitorRequest
     * @return ModifyDBInstanceMonitorResponse
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96110.html">Temporary hybrid access solution for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95708.html">Temporary hybrid access solution for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkExpireTime  ModifyDBInstanceNetworkExpireTimeRequest
     * @return ModifyDBInstanceNetworkExpireTimeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96109.html">Change the network type of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96761.html">Change the network type of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95707.html">Change the network type of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkType  ModifyDBInstanceNetworkTypeRequest
     * @return ModifyDBInstanceNetworkTypeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves billing changes. After the conversion, the instance is immediately billed on a subscription basis. Calculate the estimated costs in advance and read the related documentation before you call this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96048.html">Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96743.html">Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95631.html">Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97120.html">Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstancePayType  ModifyDBInstancePayTypeRequest
     * @return ModifyDBInstancePayTypeResponse
     */
    CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request);

    /**
     * <b>description</b> :
     * <p>ApsaraDB RDS for MySQL instances with native replication enabled must meet the following requirements:</p>
     * <ul>
     * <li>Database engine version: MySQL 5.7</li>
     * <li>Instance edition: Basic Edition</li>
     * <li>Billing method: pay-as-you-go or subscription</li>
     * <li>Minor engine version: 20240930 or later
     * For more information about native replication, see <a href="https://help.aliyun.com/document_detail/2856530.html">RDS native replication</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceReplicationSwitch  ModifyDBInstanceReplicationSwitchRequest
     * @return ModifyDBInstanceReplicationSwitchResponse
     */
    CompletableFuture<ModifyDBInstanceReplicationSwitchResponse> modifyDBInstanceReplicationSwitch(ModifyDBInstanceReplicationSwitchRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported DPI engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96120.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/229517.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95715.html">Settings for Secure Sockets Layer (SSL) encryption for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for ApsaraDB RDS for SQL Server</a></p>
     * 
     * @param request the request parameters of ModifyDBInstanceSecurityGroupRule  ModifyDBInstanceSecurityGroupRuleRequest
     * @return ModifyDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<ModifyDBInstanceSecurityGroupRuleResponse> modifyDBInstanceSecurityGroupRule(ModifyDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines.</h3>
     * 
     * @param request the request parameters of ModifyDBInstanceSpec  ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the feature documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96121.html">Settings for transparent data encryption TDE on ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465652.html">Settings for transparent data encryption TDE on ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95716.html">Settings for transparent data encryption TDE on ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceTDE  ModifyDBInstanceTDERequest
     * @return ModifyDBInstanceTDEResponse
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the feature documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2998661.html">RDS MySQL vector storage</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceVectorSupportStatus  ModifyDBInstanceVectorSupportStatusRequest
     * @return ModifyDBInstanceVectorSupportStatusResponse
     */
    CompletableFuture<ModifyDBInstanceVectorSupportStatusResponse> modifyDBInstanceVectorSupportStatus(ModifyDBInstanceVectorSupportStatusRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <p> <a href="https://help.aliyun.com/document_detail/2627998.html">Modify node configurations</a></p>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related documentation carefully before you perform this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBNode  ModifyDBNodeRequest
     * @return ModifyDBNodeResponse
     */
    CompletableFuture<ModifyDBNodeResponse> modifyDBNode(ModifyDBNodeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL<blockquote>
     * <p>Starting from October 17, 2023, ApsaraDB RDS for MySQL Cluster Edition instances are progressively granted a complimentary dedicated proxy service with one proxy node across regions. For details, see <a href="https://help.aliyun.com/document_detail/2555466.html">ApsaraDB RDS for MySQL Cluster Edition complimentary dedicated proxy service with one proxy node</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you invoke this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/197456.html">Enable database proxy for RDS MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418272.html">Enable database proxy for RDS PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxy  ModifyDBProxyRequest
     * @return ModifyDBProxyResponse
     */
    CompletableFuture<ModifyDBProxyResponse> modifyDBProxy(ModifyDBProxyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2621331.html">Configure the access policy for a database proxy endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418273.html">Configure the access policy for a database proxy endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyEndpoint  ModifyDBProxyEndpointRequest
     * @return ModifyDBProxyEndpointResponse
     */
    CompletableFuture<ModifyDBProxyEndpointResponse> modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the following documentation, make sure that you fully understand the prerequisites and impacts of this operation, and then proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Configure the database proxy endpoint for RDS MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Configure the database proxy endpoint for RDS PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyEndpointAddress  ModifyDBProxyEndpointAddressRequest
     * @return ModifyDBProxyEndpointAddressResponse
     */
    CompletableFuture<ModifyDBProxyEndpointAddressResponse> modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL<blockquote>
     * <p>Starting from October 17, 2023, ApsaraDB RDS for MySQL Cluster Edition progressively provides a complimentary dedicated proxy service with one proxy node across regions. For more information, see <a href="https://help.aliyun.com/document_detail/2555466.html">ApsaraDB RDS for MySQL Cluster Edition complimentary dedicated proxy service with one proxy node</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyInstance  ModifyDBProxyInstanceRequest
     * @return ModifyDBProxyInstanceResponse
     */
    CompletableFuture<ModifyDBProxyInstanceResponse> modifyDBProxyInstance(ModifyDBProxyInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/124321.html">Configure a distributed transaction whitelist</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDTCSecurityIpHostsForSQLServer  ModifyDTCSecurityIpHostsForSQLServerRequest
     * @return ModifyDTCSecurityIpHostsForSQLServerResponse
     */
    CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/173826.html">Automatic storage expansion for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/432496.html">Automatic storage expansion for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2573613.html">Automatic storage expansion for ApsaraDB RDS for SQL Server</a>
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li><a href="https://help.aliyun.com/document_detail/173826.html">Automatic storage expansion for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/432496.html">Automatic storage expansion for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDasInstanceConfig  ModifyDasInstanceConfigRequest
     * @return ModifyDasInstanceConfigResponse
     */
    CompletableFuture<ModifyDasInstanceConfigResponse> modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <p>This operation supports the following features: <a href="https://help.aliyun.com/document_detail/2401398.html">Modify SQL Server database attributes</a> and <a href="https://help.aliyun.com/document_detail/2767189.html">Archive cloud disk data to OSS</a>. Before using the data archiving to OSS feature through the API, enable the data archiving feature in the console first.</p>
     * <blockquote>
     * <p>Notice: Before calling this operation, carefully read the feature documentation to fully understand the prerequisites and potential impacts, and then proceed.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDatabaseConfig  ModifyDatabaseConfigRequest
     * @return ModifyDatabaseConfigResponse
     */
    CompletableFuture<ModifyDatabaseConfigResponse> modifyDatabaseConfig(ModifyDatabaseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/188164.html">Settings for database proxy SSL encryption of an ApsaraDB RDS for MySQL database</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDbProxyInstanceSsl  ModifyDbProxyInstanceSslRequest
     * @return ModifyDbProxyInstanceSslResponse
     */
    CompletableFuture<ModifyDbProxyInstanceSslResponse> modifyDbProxyInstanceSsl(ModifyDbProxyInstanceSslRequest request);

    /**
     * @param request the request parameters of ModifyEventInfo  ModifyEventInfoRequest
     * @return ModifyEventInfoResponse
     */
    CompletableFuture<ModifyEventInfoResponse> modifyEventInfo(ModifyEventInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/207467.html">What is the availability detection method</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyHADiagnoseConfig  ModifyHADiagnoseConfigRequest
     * @return ModifyHADiagnoseConfigResponse
     */
    CompletableFuture<ModifyHADiagnoseConfigResponse> modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96054.html">Automatic primary/secondary switchover for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96747.html">Automatic primary/secondary switchover for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95659.html">Automatic primary/secondary switchover for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97127.html">Automatic primary/secondary switchover for ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyHASwitchConfig  ModifyHASwitchConfigRequest
     * @return ModifyHASwitchConfigResponse
     */
    CompletableFuture<ModifyHASwitchConfigResponse> modifyHASwitchConfig(ModifyHASwitchConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies a data import task for an ApsaraDB RDS for MySQL native replication instance.</p>
     * 
     * @param request the request parameters of ModifyImportTask  ModifyImportTaskRequest
     * @return ModifyImportTaskResponse
     */
    CompletableFuture<ModifyImportTaskResponse> modifyImportTask(ModifyImportTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related documentation carefully before you perform this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96049.html">Auto-renewal of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96740.html">Auto-renewal of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95635.html">Auto-renewal of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97121.html">Auto-renewal of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Cross-region backup for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Cross-region backup for ApsaraDB RDS for SQL Server</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceCrossBackupPolicy  ModifyInstanceCrossBackupPolicyRequest
     * @return ModifyInstanceCrossBackupPolicyResponse
     */
    CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that the column encryption service is activated in DAS Security Center.</li>
     * <li>If you receive the fault message ColumnEncryptionErrorCode.NOT_PURCHASED when you invoke this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption service before trying again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyMaskingRules  ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request);

    /**
     * @param request the request parameters of ModifyPGHbaConfig  ModifyPGHbaConfigRequest
     * @return ModifyPGHbaConfigResponse
     */
    CompletableFuture<ModifyPGHbaConfigResponse> modifyPGHbaConfig(ModifyPGHbaConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96063.html">Configure the parameters of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96751.html">Configure the parameters of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95667.html">Configure the parameters of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97130.html">Configure the parameters of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameter  ModifyParameterRequest
     * @return ModifyParameterResponse
     */
    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameterGroup  ModifyParameterGroupRequest
     * @return ModifyParameterGroupResponse
     */
    CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the feature documentation to fully understand the prerequisites and impacts of calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96063.html">Set instance parameters for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96751.html">Set instance parameters for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameterTimedScheduleTask  ModifyParameterTimedScheduleTaskRequest
     * @return ModifyParameterTimedScheduleTaskResponse
     */
    CompletableFuture<ModifyParameterTimedScheduleTaskResponse> modifyParameterTimedScheduleTask(ModifyParameterTimedScheduleTaskRequest request);

    /**
     * @param request the request parameters of ModifyRCDeploymentSetAttribute  ModifyRCDeploymentSetAttributeRequest
     * @return ModifyRCDeploymentSetAttributeResponse
     */
    CompletableFuture<ModifyRCDeploymentSetAttributeResponse> modifyRCDeploymentSetAttribute(ModifyRCDeploymentSetAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation with the DiskId parameter to modify the name, description, release behavior, and other attributes of a block storage device.</p>
     * 
     * @param request the request parameters of ModifyRCDiskAttribute  ModifyRCDiskAttributeRequest
     * @return ModifyRCDiskAttributeResponse
     */
    CompletableFuture<ModifyRCDiskAttributeResponse> modifyRCDiskAttribute(ModifyRCDiskAttributeRequest request);

    /**
     * @param request the request parameters of ModifyRCDiskChargeType  ModifyRCDiskChargeTypeRequest
     * @return ModifyRCDiskChargeTypeResponse
     */
    CompletableFuture<ModifyRCDiskChargeTypeResponse> modifyRCDiskChargeType(ModifyRCDiskChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: To minimize the impact of Upgrade/Downgrade operations on your business, perform this operation during off-peak hours.
     * When you invoke this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>ESSD cloud disks support upgrading and lowering performance levels (PLs), but you cannot decrease the quota to PL0.</li>
     * <li>The ESSD cloud disk must be in the In_Use or Available state.</li>
     * <li>If the ESSD cloud disk is mounted to an instance, the instance must be in the Running or Stopped state and cannot have an overdue payment or be expired.</li>
     * <li>Because the performance level (PL) of an ESSD cloud disk is limited by its capacity, if you cannot upgrade the performance level (PL), expand the disk capacity and try again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyRCDiskSpec  ModifyRCDiskSpecRequest
     * @return ModifyRCDiskSpecResponse
     */
    CompletableFuture<ModifyRCDiskSpecResponse> modifyRCDiskSpec(ModifyRCDiskSpecRequest request);

    /**
     * @param request the request parameters of ModifyRCElasticScaling  ModifyRCElasticScalingRequest
     * @return ModifyRCElasticScalingResponse
     */
    CompletableFuture<ModifyRCElasticScalingResponse> modifyRCElasticScaling(ModifyRCElasticScalingRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, make sure that you fully understand the billing methods, pricing, and refund rules for downgrading RDS Custom instances.
     * When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot modify the instance type of an expired instance. Complete the renewal and try again.</li>
     * <li>Only <strong>Standard Edition cloud disk instances</strong> support instance type changes.</li>
     * <li>When you upgrade or downgrade the instance type, take note of the following items:<ul>
     * <li>The instance must be in the <strong>Running</strong> or <strong>Paused</strong> (Stopped) state.</li>
     * <li>The price difference after you decrease the quota is refunded to your original payment method. Coupons that have been used are not refunded. The payer receives the refund.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyRCInstance  ModifyRCInstanceRequest
     * @return ModifyRCInstanceResponse
     */
    CompletableFuture<ModifyRCInstanceResponse> modifyRCInstance(ModifyRCInstanceRequest request);

    /**
     * @param request the request parameters of ModifyRCInstanceAttribute  ModifyRCInstanceAttributeRequest
     * @return ModifyRCInstanceAttributeResponse
     */
    CompletableFuture<ModifyRCInstanceAttributeResponse> modifyRCInstanceAttribute(ModifyRCInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the subscription and pay-as-you-go billing methods and pricing of RDS Custom.</li>
     * <li>Make sure that the target instance is in the <strong>Running</strong> or <strong>Stopped</strong> state and that your account does not have an overdue payment.</li>
     * <li>Make sure that the cloud disk is in the <strong>In_use</strong> state and that the billing method of the cloud disk has not been successfully changed within the last 15 minutes.</li>
     * <li>After the billing method is changed, fees are automatically deducted by default. Make sure that your account balance is sufficient. Otherwise, an abnormal order is generated, and you can only void the order.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Refer to the corresponding feature documentation:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2878542.html">Change the billing method of an instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2878547.html">Change the billing method of a cloud disk</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyRCInstanceChargeType  ModifyRCInstanceChargeTypeRequest
     * @return ModifyRCInstanceChargeTypeResponse
     */
    CompletableFuture<ModifyRCInstanceChargeTypeResponse> modifyRCInstanceChargeType(ModifyRCInstanceChargeTypeRequest request);

    /**
     * @param request the request parameters of ModifyRCInstanceDescription  ModifyRCInstanceDescriptionRequest
     * @return ModifyRCInstanceDescriptionResponse
     */
    CompletableFuture<ModifyRCInstanceDescriptionResponse> modifyRCInstanceDescription(ModifyRCInstanceDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyRCInstanceKeyPair  ModifyRCInstanceKeyPairRequest
     * @return ModifyRCInstanceKeyPairResponse
     */
    CompletableFuture<ModifyRCInstanceKeyPairResponse> modifyRCInstanceKeyPair(ModifyRCInstanceKeyPairRequest request);

    /**
     * @param request the request parameters of ModifyRCInstanceNetworkSpec  ModifyRCInstanceNetworkSpecRequest
     * @return ModifyRCInstanceNetworkSpecResponse
     */
    CompletableFuture<ModifyRCInstanceNetworkSpecResponse> modifyRCInstanceNetworkSpec(ModifyRCInstanceNetworkSpecRequest request);

    /**
     * @param request the request parameters of ModifyRCInstanceVpcAttribute  ModifyRCInstanceVpcAttributeRequest
     * @return ModifyRCInstanceVpcAttributeResponse
     */
    CompletableFuture<ModifyRCInstanceVpcAttributeResponse> modifyRCInstanceVpcAttribute(ModifyRCInstanceVpcAttributeRequest request);

    /**
     * @param request the request parameters of ModifyRCSecurityGroupPermission  ModifyRCSecurityGroupPermissionRequest
     * @return ModifyRCSecurityGroupPermissionResponse
     */
    CompletableFuture<ModifyRCSecurityGroupPermissionResponse> modifyRCSecurityGroupPermission(ModifyRCSecurityGroupPermissionRequest request);

    /**
     * @param request the request parameters of ModifyRCVCluster  ModifyRCVClusterRequest
     * @return ModifyRCVClusterResponse
     */
    CompletableFuture<ModifyRCVClusterResponse> modifyRCVCluster(ModifyRCVClusterRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>The instance must meet the following conditions when you invoke this operation. Otherwise, the operation fails:</p>
     * <ul>
     * <li>The MySQL instance uses a shared database proxy.</li>
     * <li>Read/write splitting is enabled for the MySQL instance.</li>
     * <li>The instance runs one of the following versions:<ul>
     * <li>MySQL 5.7 high-availability series (local SSDs)</li>
     * <li>MySQL 5.6</li>
     * <li>SQL Server on RDS Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyReadWriteSplittingConnection  ModifyReadWriteSplittingConnectionRequest
     * @return ModifyReadWriteSplittingConnectionResponse
     */
    CompletableFuture<ModifyReadWriteSplittingConnectionResponse> modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/96056.html">Delayed replication of ApsaraDB RDS for MySQL read-only instances</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyReadonlyInstanceDelayReplicationTime  ModifyReadonlyInstanceDelayReplicationTimeRequest
     * @return ModifyReadonlyInstanceDelayReplicationTimeResponse
     */
    CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/94487.html">Move resources across resource groups</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation instead.</p>
     * 
     * @param request the request parameters of ModifySQLCollectorPolicy  ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained: the operation can still be called normally, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation instead.</p>
     * 
     * @param request the request parameters of ModifySQLCollectorRetention  ModifySQLCollectorRetentionRequest
     * @return ModifySQLCollectorRetentionResponse
     */
    CompletableFuture<ModifySQLCollectorRetentionResponse> modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/201042.html">Configure a security group for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206310.html">Configure a security group for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2392322.html">Configure a security group for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupConfiguration  ModifySecurityGroupConfigurationRequest
     * @return ModifySecurityGroupConfigurationResponse
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP whitelist for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/43187.html">Configure an IP whitelist for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/43186.html">Configure an IP whitelist for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/90336.html">Configure an IP whitelist for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
    CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyWhitelistTemplate  ModifyWhitelistTemplateRequest
     * @return ModifyWhitelistTemplateResponse
     */
    CompletableFuture<ModifyWhitelistTemplateResponse> modifyWhitelistTemplate(ModifyWhitelistTemplateRequest request);

    /**
     * @param request the request parameters of PreCheckCreateOrderForDeleteDBNodes  PreCheckCreateOrderForDeleteDBNodesRequest
     * @return PreCheckCreateOrderForDeleteDBNodesResponse
     */
    CompletableFuture<PreCheckCreateOrderForDeleteDBNodesResponse> preCheckCreateOrderForDeleteDBNodes(PreCheckCreateOrderForDeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2977241.html">DuckDB-based analytical instance</a></p>
     * 
     * @param request the request parameters of PrecheckDuckDBDependency  PrecheckDuckDBDependencyRequest
     * @return PrecheckDuckDBDependencyResponse
     */
    CompletableFuture<PrecheckDuckDBDependencyResponse> precheckDuckDBDependency(PrecheckDuckDBDependencyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Description</h3>
     * <p>ApsaraDB RDS instances have an automatic log backup upload mechanism. However, when the instance storage is insufficient, you can use this operation to manually upload log backups and release storage space in advance. After the upload, the system automatically clears duplicate binary log backups.
     * Calling this operation uploads binary log backups to OSS (for SQL Server, the transaction log is shrunk before the upload), and then clears the binary log backups to release storage space.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Uploading log backups does not affect data restoration.</li>
     * <li>The released space is storage space, not backup storage space. Therefore, the backup storage usage is not reduced.</li>
     * <li>The OSS to which log backups are uploaded is provided by ApsaraDB RDS. You do not need to purchase OSS, and you cannot access this OSS.</li>
     * </ul>
     * 
     * @param request the request parameters of PurgeDBInstanceLog  PurgeDBInstanceLogRequest
     * @return PurgeDBInstanceLogResponse
     */
    CompletableFuture<PurgeDBInstanceLogResponse> purgeDBInstanceLog(PurgeDBInstanceLogRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Description</h3>
     * <p>ApsaraDB RDS notifications are displayed in a highlighted banner at the top of the ApsaraDB RDS console. Notifications include renewal reminders and instance creation failure alerts.
     * After you query notifications by calling this operation, you can call <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> to mark a notification as confirmed, which indicates that you have acknowledged the notification.</p>
     * 
     * @param request the request parameters of QueryNotify  QueryNotifyRequest
     * @return QueryNotifyResponse
     */
    CompletableFuture<QueryNotifyResponse> queryNotify(QueryNotifyRequest request);

    /**
     * @param request the request parameters of QueryRecommendByCode  QueryRecommendByCodeRequest
     * @return QueryRecommendByCodeResponse
     */
    CompletableFuture<QueryRecommendByCodeResponse> queryRecommendByCode(QueryRecommendByCodeRequest request);

    /**
     * @param request the request parameters of RdsCustomInit  RdsCustomInitRequest
     * @return RdsCustomInitResponse
     */
    CompletableFuture<RdsCustomInitResponse> rdsCustomInit(RdsCustomInitRequest request);

    /**
     * @param request the request parameters of RebootRCInstance  RebootRCInstanceRequest
     * @return RebootRCInstanceResponse
     */
    CompletableFuture<RebootRCInstanceResponse> rebootRCInstance(RebootRCInstanceRequest request);

    /**
     * @param request the request parameters of RebootRCInstances  RebootRCInstancesRequest
     * @return RebootRCInstancesResponse
     */
    CompletableFuture<RebootRCInstancesResponse> rebootRCInstances(RebootRCInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. Each dedicated cluster contains multiple hosts, and each host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
     * 
     * @param request the request parameters of RebuildDBInstance  RebuildDBInstanceRequest
     * @return RebuildDBInstanceResponse
     */
    CompletableFuture<RebuildDBInstanceResponse> rebuildDBInstance(RebuildDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of RebuildReplicationLink  RebuildReplicationLinkRequest
     * @return RebuildReplicationLinkResponse
     */
    CompletableFuture<RebuildReplicationLinkResponse> rebuildReplicationLink(RebuildReplicationLinkRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL.</p>
     * 
     * @param request the request parameters of ReceiveDBInstance  ReceiveDBInstanceRequest
     * @return ReceiveDBInstanceResponse
     */
    CompletableFuture<ReceiveDBInstanceResponse> receiveDBInstance(ReceiveDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server (instances running SQL Server 2012 or later) </p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95722.html">Restore SQL Server data</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of RecoveryDBInstance  RecoveryDBInstanceRequest
     * @return RecoveryDBInstanceResponse
     */
    CompletableFuture<RecoveryDBInstanceResponse> recoveryDBInstance(RecoveryDBInstanceRequest request);

    /**
     * @param request the request parameters of RedeployRCInstance  RedeployRCInstanceRequest
     * @return RedeployRCInstanceResponse
     */
    CompletableFuture<RedeployRCInstanceResponse> redeployRCInstance(RedeployRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/26128.html">Release the public endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97738.html">Release the public endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97736.html">Release the public endpoint of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97740.html">Release the public endpoint of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstanceConnection  ReleaseInstanceConnectionRequest
     * @return ReleaseInstanceConnectionResponse
     */
    CompletableFuture<ReleaseInstanceConnectionResponse> releaseInstanceConnection(ReleaseInstanceConnectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/26128.html">Release the public endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97738.html">Release the public endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97736.html">Release the public endpoint of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97740.html">Release the public endpoint of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation, make sure that the instance meets the following requirements. Otherwise, the operation fails:</p>
     * <ul>
     * <li>The MySQL instance uses a shared database proxy.</li>
     * <li>Read/write splitting is enabled for the instance.</li>
     * <li>The instance runs one of the following versions:<ul>
     * <li>MySQL 5.7 on RDS High-availability Edition with local SSDs</li>
     * <li>MySQL 5.6</li>
     * <li>SQL Server Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseReadWriteSplittingConnection  ReleaseReadWriteSplittingConnectionRequest
     * @return ReleaseReadWriteSplittingConnectionResponse
     */
    CompletableFuture<ReleaseReadWriteSplittingConnectionResponse> releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Removing instances from a deployment set is a non-disruptive operation and does not cause instance restarts.</p>
     * 
     * @param request the request parameters of RemoveRCInstancesFromDeploymentSet  RemoveRCInstancesFromDeploymentSetRequest
     * @return RemoveRCInstancesFromDeploymentSetResponse
     */
    CompletableFuture<RemoveRCInstancesFromDeploymentSetResponse> removeRCInstancesFromDeploymentSet(RemoveRCInstancesFromDeploymentSetRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>You can unbind up to 10 tags at a time.</li>
     * <li>If all instances bound to a tag are unbound, the tag is automatically deleted.</li>
     * <li>If you specify only a tag key (TagKey) without a tag value (TagValue) when unbinding tags, all tags that match the tag key are unbound.</li>
     * <li>You must specify at least one key-value pair or a single tag key.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveTagsFromResource  RemoveTagsFromResourceRequest
     * @return RemoveTagsFromResourceResponse
     */
    CompletableFuture<RemoveTagsFromResourceResponse> removeTagsFromResource(RemoveTagsFromResourceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related documentation carefully before you perform this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96050.html">Manually renew an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96741.html">Manually renew an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95637.html">Manually renew an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97122.html">Manually renew an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RenewRCInstance  RenewRCInstanceRequest
     * @return RenewRCInstanceResponse
     */
    CompletableFuture<RenewRCInstanceResponse> renewRCInstance(RenewRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the Stopped state.</li>
     * <li>Reinstalling the operating system deletes all data on the original system cloud disk. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceRCInstanceSystemDisk  ReplaceRCInstanceSystemDiskRequest
     * @return ReplaceRCInstanceSystemDiskResponse
     */
    CompletableFuture<ReplaceRCInstanceSystemDiskResponse> replaceRCInstanceSystemDisk(ReplaceRCInstanceSystemDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/140724.html">Reset the permissions of a privileged account</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccount  ResetAccountRequest
     * @return ResetAccountResponse
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96100.html">Reset the password of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96814.html">Reset the password of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95691.html">Reset the password of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97133.html">Reset the password of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>Instances with local disks do not support storage space changes.</p>
     * 
     * @param request the request parameters of ResizeRCInstanceDisk  ResizeRCInstanceDiskRequest
     * @return ResizeRCInstanceDiskResponse
     */
    CompletableFuture<ResizeRCInstanceDiskResponse> resizeRCInstanceDisk(ResizeRCInstanceDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96051.html">Restart an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96798.html">Restart an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95656.html">Restart an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97472.html">Restart an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before the restoration, you can call the CheckCreateDdrDBInstance operation to check whether an ApsaraDB RDS instance can be restored across regions by using a cross-region backup set.</p>
     * </blockquote>
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Cross-region backup for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/120875.html">Cross-region restoration for ApsaraDB RDS for MySQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of RestoreDdrTable  RestoreDdrTableRequest
     * @return RestoreDdrTableResponse
     */
    CompletableFuture<RestoreDdrTableResponse> restoreDdrTable(RestoreDdrTableRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/613672.html">Restore specific databases of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of RestoreTable  RestoreTableRequest
     * @return RestoreTableResponse
     */
    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported DPI engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The database is in the Running state.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The revoked permissions include SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, and TRIGGER.</li>
     * <li>This operation does not support SQL Server 2017 Cluster Edition or PostgreSQL instances.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeAccountPrivilege  RevokeAccountPrivilegeRequest
     * @return RevokeAccountPrivilegeResponse
     */
    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96102.html">Grant permissions to the service account of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146887.html">Grant permissions to the service account of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95693.html">Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of RevokeOperatorPermission  RevokeOperatorPermissionRequest
     * @return RevokeOperatorPermissionResponse
     */
    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    /**
     * @param request the request parameters of RevokeRCSecurityGroupPermission  RevokeRCSecurityGroupPermissionRequest
     * @return RevokeRCSecurityGroupPermissionResponse
     */
    CompletableFuture<RevokeRCSecurityGroupPermissionResponse> revokeRCSecurityGroupPermission(RevokeRCSecurityGroupPermissionRequest request);

    /**
     * @param request the request parameters of RunRCCommand  RunRCCommandRequest
     * @return RunRCCommandResponse
     */
    CompletableFuture<RunRCCommandResponse> runRCCommand(RunRCCommandRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before creating an RDS Custom instance, submit a ticket to request that your Alibaba Cloud account be added to the whitelist.</li>
     * <li>Only subscription RDS Custom instances can be created.</li>
     * <li>Supported regions are Beijing, Shanghai, Shenzhen, and Hangzhou.</li>
     * </ul>
     * 
     * @param request the request parameters of RunRCInstances  RunRCInstancesRequest
     * @return RunRCInstancesResponse
     */
    CompletableFuture<RunRCInstancesResponse> runRCInstances(RunRCInstancesRequest request);

    /**
     * @param request the request parameters of ShareRCDeploymentSet  ShareRCDeploymentSetRequest
     * @return ShareRCDeploymentSetResponse
     */
    CompletableFuture<ShareRCDeploymentSetResponse> shareRCDeploymentSet(ShareRCDeploymentSetRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/427093.html">Start an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/452314.html">Start an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462504.html">Start an ApsaraDB RDS for SQL Server instance</a>
     * &lt;props=&quot;intl&quot;&gt;
     * <a href="https://help.aliyun.com/document_detail/462504.html">Start an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of StartDBInstance  StartDBInstanceRequest
     * @return StartDBInstanceResponse
     */
    CompletableFuture<StartDBInstanceResponse> startDBInstance(StartDBInstanceRequest request);

    /**
     * @param request the request parameters of StartRCInstance  StartRCInstanceRequest
     * @return StartRCInstanceResponse
     */
    CompletableFuture<StartRCInstanceResponse> startRCInstance(StartRCInstanceRequest request);

    /**
     * @param request the request parameters of StartRCInstances  StartRCInstancesRequest
     * @return StartRCInstancesResponse
     */
    CompletableFuture<StartRCInstancesResponse> startRCInstances(StartRCInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * &lt;props=&quot;china&quot;&gt; </p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/427093.html">Pause an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/452314.html">Pause an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462504.html">Pause an ApsaraDB RDS for SQL Server instance</a>
     * &lt;props=&quot;intl&quot;&gt;
     * <a href="https://help.aliyun.com/document_detail/462504.html">Pause an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of StopDBInstance  StopDBInstanceRequest
     * @return StopDBInstanceResponse
     */
    CompletableFuture<StopDBInstanceResponse> stopDBInstance(StopDBInstanceRequest request);

    /**
     * @param request the request parameters of StopRCInstance  StopRCInstanceRequest
     * @return StopRCInstanceResponse
     */
    CompletableFuture<StopRCInstanceResponse> stopRCInstance(StopRCInstanceRequest request);

    /**
     * @param request the request parameters of StopRCInstances  StopRCInstancesRequest
     * @return StopRCInstancesResponse
     */
    CompletableFuture<StopRCInstancesResponse> stopRCInstances(StopRCInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96054.html">Primary/secondary switchover for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96747.html">Primary/secondary switchover for ApsaraDB RDS for PostgreSQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95659.html">Primary/secondary switchover for ApsaraDB RDS for SQL Server</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97127.html">Primary/secondary switchover for ApsaraDB RDS for MariaDB</a></li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceHA  SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The instance has only one of the following addresses: an internal endpoint or a public endpoint.</li>
     * <li>The instance is in the Running state.</li>
     * <li>The number of switchovers within the last 24 hours is less than 20.</li>
     * <li>The network type of the instance is classic network.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>After the switchover, the endpoint changes. You must update the endpoint in your code and restart the application.</p>
     * 
     * @param request the request parameters of SwitchDBInstanceNetType  SwitchDBInstanceNetTypeRequest
     * @return SwitchDBInstanceNetTypeResponse
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/137567.html">Switch the VPC and vSwitch of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146885.html">Switch the vSwitch of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/347675.html">Switch the VPC and vSwitch of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceVpc  SwitchDBInstanceVpcRequest
     * @return SwitchDBInstanceVpcResponse
     */
    CompletableFuture<SwitchDBInstanceVpcResponse> switchDBInstanceVpc(SwitchDBInstanceVpcRequest request);

    /**
     * <b>description</b> :
     * <p>Applicable engine:</p>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchOverMajorVersionUpgrade  SwitchOverMajorVersionUpgradeRequest
     * @return SwitchOverMajorVersionUpgradeResponse
     */
    CompletableFuture<SwitchOverMajorVersionUpgradeResponse> switchOverMajorVersionUpgrade(SwitchOverMajorVersionUpgradeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS SQL Server.</p>
     * 
     * @param request the request parameters of SwitchReplicationLink  SwitchReplicationLinkRequest
     * @return SwitchReplicationLinkResponse
     */
    CompletableFuture<SwitchReplicationLinkResponse> switchReplicationLink(SwitchReplicationLinkRequest request);

    /**
     * @param request the request parameters of SyncRCKeyPair  SyncRCKeyPairRequest
     * @return SyncRCKeyPairResponse
     */
    CompletableFuture<SyncRCKeyPairResponse> syncRCKeyPair(SyncRCKeyPairRequest request);

    /**
     * @param request the request parameters of SyncRCSecurityGroup  SyncRCSecurityGroupRequest
     * @return SyncRCSecurityGroupResponse
     */
    CompletableFuture<SyncRCSecurityGroupResponse> syncRCSecurityGroup(SyncRCSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation before you proceed.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96149.html">Create tags for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96777.html">Create tags for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95726.html">Create tags for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97152.html">Create tags for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of TerminateMigrateTask  TerminateMigrateTaskRequest
     * @return TerminateMigrateTaskResponse
     */
    CompletableFuture<TerminateMigrateTaskResponse> terminateMigrateTask(TerminateMigrateTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves fees. Read the related documentation carefully before you perform this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96048.html">Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription</a> and <a href="https://help.aliyun.com/document_detail/161875.html">Change the billing method of an ApsaraDB RDS for MySQL instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96743.html">Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription</a> and <a href="https://help.aliyun.com/document_detail/162756.html">Change the billing method of an ApsaraDB RDS for PostgreSQL instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95631.html">Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription</a> and <a href="https://help.aliyun.com/document_detail/162755.html">Change the billing method of an ApsaraDB RDS for SQL Server instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97120.html">Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription</a> and <a href="https://help.aliyun.com/document_detail/169252.html">Change the billing method of an ApsaraDB RDS for MariaDB instance from subscription to pay-as-you-go</a></li>
     * </ul>
     * 
     * @param request the request parameters of TransformDBInstancePayType  TransformDBInstancePayTypeRequest
     * @return TransformDBInstancePayTypeResponse
     */
    CompletableFuture<TransformDBInstancePayTypeResponse> transformDBInstancePayType(TransformDBInstancePayTypeRequest request);

    /**
     * @param request the request parameters of UnassociateEipAddressWithRCInstance  UnassociateEipAddressWithRCInstanceRequest
     * @return UnassociateEipAddressWithRCInstanceResponse
     */
    CompletableFuture<UnassociateEipAddressWithRCInstanceResponse> unassociateEipAddressWithRCInstance(UnassociateEipAddressWithRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/147649.html">Lock an account of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UnlockAccount  UnlockAccountRequest
     * @return UnlockAccountResponse
     */
    CompletableFuture<UnlockAccountResponse> unlockAccount(UnlockAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>ApsaraDB RDS for MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>You can unbind up to 20 tags at a time.</li>
     * <li>If a tag is unbound from an instance and is not bound to any other instances, the tag is automatically deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2856487.html">RDS MySQL native replication instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDBInstanceReplication  UpdateDBInstanceReplicationRequest
     * @return UpdateDBInstanceReplicationResponse
     */
    CompletableFuture<UpdateDBInstanceReplicationResponse> updateDBInstanceReplication(UpdateDBInstanceReplicationRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;You can join the RDS PostgreSQL extension exchange DingTalk group (103525002795) to consult, communicate, provide feedback, and obtain more information about extensions.</p>
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation to fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePostgresExtensions  UpdatePostgresExtensionsRequest
     * @return UpdatePostgresExtensionsResponse
     */
    CompletableFuture<UpdatePostgresExtensionsResponse> updatePostgresExtensions(UpdatePostgresExtensionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related feature documentation</h3>
     * <p>A user backup is a full backup of a self-managed MySQL database. You can restore a user backup to the cloud. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the full data of a self-managed MySQL 5.7 or 8.0 database to the cloud</a>.</p>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the feature documentation to fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateUserBackupFile  UpdateUserBackupFileRequest
     * @return UpdateUserBackupFileResponse
     */
    CompletableFuture<UpdateUserBackupFileResponse> updateUserBackupFile(UpdateUserBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/96058.html">Upgrade the database engine version of an ApsaraDB RDS for MySQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96059.html">Upgrade the minor engine version of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146895.html">Upgrade the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/213582.html">Upgrade the minor engine version of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeDBInstanceKernelVersion  UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p>This API operation involves fees. Carefully read the related documentation to fully understand the fees, prerequisites, and impacts before you proceed.
     * <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * 
     * @param request the request parameters of UpgradeDBInstanceMajorVersion  UpgradeDBInstanceMajorVersionRequest
     * @return UpgradeDBInstanceMajorVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionResponse> upgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engines</h3>
     * <p>RDS MySQL
     * RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2794383.html">Major engine version upgrade check report for RDS MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2879540.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeDBInstanceMajorVersionPrecheck  UpgradeDBInstanceMajorVersionPrecheckRequest
     * @return UpgradeDBInstanceMajorVersionPrecheckResponse
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> upgradeDBInstanceMajorVersionPrecheck(UpgradeDBInstanceMajorVersionPrecheckRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Notice: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/197465.html">Upgrade the minor engine version of the database proxy for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418469.html">Upgrade the minor engine version of the database proxy for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeDBProxyInstanceKernelVersion  UpgradeDBProxyInstanceKernelVersionRequest
     * @return UpgradeDBProxyInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a precheck for a data import task of an ApsaraDB RDS for MySQL native replication instance.</p>
     * 
     * @param request the request parameters of ValidateImportTask  ValidateImportTaskRequest
     * @return ValidateImportTaskResponse
     */
    CompletableFuture<ValidateImportTaskResponse> validateImportTask(ValidateImportTaskRequest request);

}
