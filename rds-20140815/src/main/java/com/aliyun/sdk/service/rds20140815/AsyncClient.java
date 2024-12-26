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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">Use the cloud migration feature</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ActivateMigrationTargetInstance  ActivateMigrationTargetInstanceRequest
     * @return ActivateMigrationTargetInstanceResponse
     */
    CompletableFuture<ActivateMigrationTargetInstanceResponse> activateMigrationTargetInstance(ActivateMigrationTargetInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Each tag consists of a tag key and a tag value. The tag key is required, and the tag value is optional.</li>
     * <li>The tag key and tag value cannot start with aliyun.</li>
     * <li>The tag key and tag value are not case-sensitive.</li>
     * <li>The maximum length of a tag key is 64 characters, and the maximum length of a tag value is 128 characters.</li>
     * <li>A maximum of 10 tags can be added to each instance. Each tag that is added to the same instance must have a unique tag key. If you add a new tag to the instance and the key of the new tag is the same as that of an existing tag, the new tag overwrites the existing tag.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTagsToResource  AddTagsToResourceRequest
     * @return AddTagsToResourceResponse
     */
    CompletableFuture<AddTagsToResourceResponse> addTagsToResource(AddTagsToResourceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <p>If read-only instances are attached to a primary ApsaraDB RDS for SQL Server instance, you can call this operation to apply for a unified read-only routing endpoint for the primary instance. After you apply for a read-only routing endpoint for a primary instance, the existing endpoints of the primary instance and its read-only instances remain valid. In addition, you can still apply for internal and public endpoints.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.</li>
     * <li>The instance is in the Running state.</li>
     * <li>Read-only instances are attached to the primary instance.</li>
     * <li>The instance does not have an ongoing Data Transmission Service (DTS) migration task.</li>
     * <li>The instance runs one of the following database versions and RDS editions:<ul>
     * <li>SQL Server on RDS Cluster Edition</li>
     * <li>MySQL 5.7 on RDS High-availability Edition (with local disks)</li>
     * <li>MySQL 5.6</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AllocateReadWriteSplittingConnection  AllocateReadWriteSplittingConnectionRequest
     * @return AllocateReadWriteSplittingConnectionResponse
     */
    CompletableFuture<AllocateReadWriteSplittingConnectionResponse> allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request);

    /**
     * @param request the request parameters of AssociateEipAddressWithRCInstance  AssociateEipAddressWithRCInstanceRequest
     * @return AssociateEipAddressWithRCInstanceResponse
     */
    CompletableFuture<AssociateEipAddressWithRCInstanceResponse> associateEipAddressWithRCInstance(AssociateEipAddressWithRCInstanceRequest request);

    /**
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of AttachWhitelistTemplateToInstance  AttachWhitelistTemplateToInstanceRequest
     * @return AttachWhitelistTemplateToInstanceResponse
     */
    CompletableFuture<AttachWhitelistTemplateToInstanceResponse> attachWhitelistTemplateToInstance(AttachWhitelistTemplateToInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <p>When the <a href="https://help.aliyun.com/document_detail/51073.html">read/write splitting</a> feature is enabled, this operation is used to calculate system-assigned read weights. For more information about custom read weights, see <a href="https://help.aliyun.com/document_detail/610423.html">DescribeDBInstanceNetInfo</a>.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>If the instance runs MySQL, the instance uses a shared proxy.</li>
     * <li>The instance runs one of the following MySQL versions and RDS editions:<ul>
     * <li>MySQL 5.7 on RDS High-availability Edition (with local disks)</li>
     * <li>MySQL 5.6</li>
     * <li>SQL Server on RDS Cluster Edition</li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">Scheduled events for ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">Scheduled events for ApsaraDB RDS for PostgreSQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">Scheduled events for ApsaraDB RDS for SQL Server instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">Scheduled events for ApsaraDB RDS for MariaDB instances</a></li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Tasks cannot be canceled in the following situations:</p>
     * <ul>
     * <li>The allowCancel parameter is set to 0.</li>
     * <li>The current time is later than the task start time.</li>
     * <li>The status of the task is not set to 3. The value 3 specifies that the task is waiting to be executed.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckAccountNameAvailable  CheckAccountNameAvailableRequest
     * @return CheckAccountNameAvailableResponse
     */
    CompletableFuture<CheckAccountNameAvailableResponse> checkAccountNameAvailable(CheckAccountNameAvailableRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server<blockquote>
     * <p> If your ApsaraDB RDS for PostgreSQL instance uses the new architecture and is created after October 10, 2022, this feature is not supported for the RDS instance. For more information, see <a href="~~452313~~">[Notice] SLR authorization is required to create an ApsaraDB RDS for PostgreSQL instance from October 10, 2022</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance</a> and <a href="https://help.aliyun.com/document_detail/120875.html">Restore the data of an ApsaraDB RDS for MySQL instance across regions</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature of an ApsaraDB RDS for PostgreSQL instance</a> and <a href="https://help.aliyun.com/document_detail/206662.html">Restore the data of an ApsaraDB RDS for PostgreSQL across regions</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature of an ApsaraDB RDS for SQL Server instance</a> and <a href="https://help.aliyun.com/document_detail/187924.html">Restore the data of an ApsaraDB RDS for SQL Server across regions</a></li>
     * </ul>
     * 
     * @param request the request parameters of CheckCreateDdrDBInstance  CheckCreateDdrDBInstanceRequest
     * @return CheckCreateDdrDBInstanceResponse
     */
    CompletableFuture<CheckCreateDdrDBInstanceResponse> checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of CheckDBNameAvailable  CheckDBNameAvailableRequest
     * @return CheckDBNameAvailableResponse
     */
    CompletableFuture<CheckDBNameAvailableResponse> checkDBNameAvailable(CheckDBNameAvailableRequest request);

    /**
     * @param request the request parameters of CheckInstanceExist  CheckInstanceExistRequest
     * @return CheckInstanceExistResponse
     */
    CompletableFuture<CheckInstanceExistResponse> checkInstanceExist(CheckInstanceExistRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of CloneParameterGroup  CloneParameterGroupRequest
     * @return CloneParameterGroupResponse
     */
    CompletableFuture<CloneParameterGroupResponse> cloneParameterGroup(CloneParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/610443.html">QueryNotify</a> operation to query notifications for an instance, you can call this operation to mark the notifications as confirmed.</p>
     * 
     * @param request the request parameters of ConfirmNotify  ConfirmNotifyRequest
     * @return ConfirmNotifyResponse
     */
    CompletableFuture<ConfirmNotifyResponse> confirmNotify(ConfirmNotifyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of CopyDatabase  CopyDatabaseRequest
     * @return CopyDatabaseResponse
     */
    CompletableFuture<CopyDatabaseResponse> copyDatabase(CopyDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS SQL Server</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95702.html">Replicate databases between ApsaraDB RDS for SQL Server instances</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CopyDatabaseBetweenInstances  CopyDatabaseBetweenInstancesRequest
     * @return CopyDatabaseBetweenInstancesResponse
     */
    CompletableFuture<CopyDatabaseBetweenInstancesResponse> copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96089.html">Create an account on an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96753.html">Create an account on an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95810.html">Create an account on an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97132.html">Create an account on an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <p>This operation uses the backup feature of ApsaraDB RDS to create a backup set. You can also call an operation of Database Backup (DBS) to create a backup set. For more information, see <a href="https://help.aliyun.com/document_detail/2402073.html">List of operations by function</a>.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance does not have ongoing backup tasks.</li>
     * <li>The number of backup sets that can be created for an instance per day cannot exceed 20.</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/378074.html">Use the data backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96772.html">Use the data backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95717.html">Use the data backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97147.html">Use the data backup feature for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">Use the cloud migration feature</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudMigrationPrecheckTask  CreateCloudMigrationPrecheckTaskRequest
     * @return CreateCloudMigrationPrecheckTaskResponse
     */
    CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> createCloudMigrationPrecheckTask(CreateCloudMigrationPrecheckTaskRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/365562.html">Use the cloud migration feature</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudMigrationTask  CreateCloudMigrationTaskRequest
     * @return CreateCloudMigrationTaskResponse
     */
    CompletableFuture<CreateCloudMigrationTaskResponse> createCloudMigrationTask(CreateCloudMigrationTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/148036.html">Create an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/412231.html">Create a serverless ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/148038.html">Create an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/607753.html">Create a serverless ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/428615.html">Enable Babelfish for an ApsaraDB RDS for PostgreSQL instance</a></li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/464132.html">Create a read-only endpoint for a cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBInstanceEndpoint  CreateDBInstanceEndpointRequest
     * @return CreateDBInstanceEndpointResponse
     */
    CompletableFuture<CreateDBInstanceEndpointResponse> createDBInstanceEndpoint(CreateDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You can create a public endpoint of an endpoint type only when no public endpoint is created for this endpoint type.</li>
     * <li>The node weights and other configurations are the same as those of the internal endpoint of this endpoint type. Each type of endpoint can contain an internal endpoint and a public endpoint.</li>
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
     * <h3>References</h3>
     * <blockquote>
     * <p>: Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96065.html">Manage ApsaraDB RDS for MySQL instances in the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96752.html">Manage ApsaraDB RDS for PostgreSQL instances in the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95669.html">Manage ApsaraDB RDS for SQL Server instances in the recycle bin</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97131.html">Manage ApsaraDB RDS for MariaDB instances in the recycle bin</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstanceForRebuild  CreateDBInstanceForRebuildRequest
     * @return CreateDBInstanceForRebuildResponse
     */
    CompletableFuture<CreateDBInstanceForRebuildResponse> createDBInstanceForRebuild(CreateDBInstanceForRebuildRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of CreateDBInstanceSecurityGroupRule  CreateDBInstanceSecurityGroupRuleRequest
     * @return CreateDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<CreateDBInstanceSecurityGroupRuleResponse> createDBInstanceSecurityGroupRule(CreateDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/464129.html">Add a node to an ApsaraDB RDS for MySQL cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBNodes  CreateDBNodesRequest
     * @return CreateDBNodesResponse
     */
    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBProxyEndpointAddress  CreateDBProxyEndpointAddressRequest
     * @return CreateDBProxyEndpointAddressResponse
     */
    CompletableFuture<CreateDBProxyEndpointAddressResponse> createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96105.html">Create a database in an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96758.html">Create a database in an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95698.html">Create a database in an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97136.html">Create a database in an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before restoration, you can call the CheckCreateDdrDBInstance operation to check whether a cross-region backup set can be used for cross-region restoration.</p>
     * </blockquote>
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateDdrInstance  CreateDdrInstanceRequest
     * @return CreateDdrInstanceResponse
     */
    CompletableFuture<CreateDdrInstanceResponse> createDdrInstance(CreateDdrInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/328592.html">Create and release an ApsaraDB RDS global active database cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGADInstance  CreateGADInstanceRequest
     * @return CreateGADInstanceResponse
     */
    CompletableFuture<CreateGADInstanceResponse> createGADInstance(CreateGADInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/331851.html">Add or remove unit nodes</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGadInstanceMember  CreateGadInstanceMemberRequest
     * @return CreateGadInstanceMemberResponse
     */
    CompletableFuture<CreateGadInstanceMemberResponse> createGadInstanceMember(CreateGadInstanceMemberRequest request);

    /**
     * @param request the request parameters of CreateMaskingRules  CreateMaskingRulesRequest
     * @return CreateMaskingRulesResponse
     */
    CompletableFuture<CreateMaskingRulesResponse> createMaskingRules(CreateMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>Limits</h3>
     * <p>Data migration across Alibaba Cloud accounts is not supported. For example, backup files in an Object Storage Service (OSS) bucket within Alibaba Cloud Account A cannot be migrated to an ApsaraDB RDS for SQL Server instance within Alibaba Cloud Account B.</p>
     * <blockquote>
     * <p> You can migrate backup files from an OSS bucket within Alibaba Cloud Account A to an OSS bucket within Alibaba Cloud Account B. Make sure that the data in the OSS bucket and the RDS instance belong to the same Alibaba Cloud account. Then, you can call this operation to create a migration task. For more information, see <a href="https://help.aliyun.com/document_detail/342762.html">Use Data Online Migration to migrate data between accounts</a>.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, carefully read the following topic. Make sure that you fully understand the prerequisites, preparations, and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/100019.html">Migrate data from a self-managed SQL Server instance to an ApsaraDB RDS for SQL Server instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateMigrateTask  CreateMigrateTaskRequest
     * @return CreateMigrateTaskResponse
     */
    CompletableFuture<CreateMigrateTaskResponse> createMigrateTask(CreateMigrateTaskRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * This operation is used to migrate backup data to the cloud. Before you call this operation, make sure that you understand the descriptions in the following topics:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/95737.html">Migrate the full backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2008 R2</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95738.html">Migrate full backup data of SQL Server 2012, 2014, 2016, 2017, or 2019 databases</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95736.html">Migrate incremental backup data to ApsaraDB RDS for SQL Server 2012, 2014, 2016, 2017, or 2019</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateOnlineDatabaseTask  CreateOnlineDatabaseTaskRequest
     * @return CreateOnlineDatabaseTaskResponse
     */
    CompletableFuture<CreateOnlineDatabaseTaskResponse> createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/464130.html">Delete a node from an ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOrderForDeleteDBNodes  CreateOrderForDeleteDBNodesRequest
     * @return CreateOrderForDeleteDBNodesResponse
     */
    CompletableFuture<CreateOrderForDeleteDBNodesResponse> createOrderForDeleteDBNodes(CreateOrderForDeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateParameterGroup  CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Install only the extensions that are supported by the major engine version of the instance. Otherwise, the installation fails.</p>
     * <ul>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/142340.html">Supported extensions</a>.</li>
     * <li>You can call an API operation to query the major engine version of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a>.</li>
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
     * @param request the request parameters of CreateRCDisk  CreateRCDiskRequest
     * @return CreateRCDiskResponse
     */
    CompletableFuture<CreateRCDiskResponse> createRCDisk(CreateRCDiskRequest request);

    /**
     * @param request the request parameters of CreateRCNodePool  CreateRCNodePoolRequest
     * @return CreateRCNodePoolResponse
     */
    CompletableFuture<CreateRCNodePoolResponse> createRCNodePool(CreateRCNodePoolRequest request);

    /**
     * <b>description</b> :
     * <p>In the following scenarios, you cannot create snapshots for a specific disk:</p>
     * <ul>
     * <li>The number of manual snapshots of the disk has reached 256.</li>
     * <li>A snapshot is being created for the disk.</li>
     * <li>The instance to which the disk is attached has never been started.</li>
     * <li>The instance to which the disk is attached is not in the <strong>Stopped</strong> or <strong>Running</strong> state.
     * When you create a snapshot, take note of the following items:</li>
     * <li>If a snapshot is being created, the snapshot cannot be used to create a custom image by calling the CreateImage operation.</li>
     * <li>When a snapshot is being created for a disk that is attached to an RDS Custom instance, do not change the instance state.</li>
     * <li>You can create snapshots for a disk that is in the <strong>Expired</strong> state. If the release time scheduled for a disk arrives when a snapshot is being created for the disk, the snapshot in the Creating state is deleted when the disk is released.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRCSnapshot  CreateRCSnapshotRequest
     * @return CreateRCSnapshotResponse
     */
    CompletableFuture<CreateRCSnapshotResponse> createRCSnapshot(CreateRCSnapshotRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/56991.html">Create a read-only ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/108959.html">Create a read-only ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/99005.html">Create a read-only ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateReadOnlyDBInstance  CreateReadOnlyDBInstanceRequest
     * @return CreateReadOnlyDBInstanceResponse
     */
    CompletableFuture<CreateReadOnlyDBInstanceResponse> createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of CreateReplicationLink  CreateReplicationLinkRequest
     * @return CreateReplicationLinkResponse
     */
    CompletableFuture<CreateReplicationLinkResponse> createReplicationLink(CreateReplicationLinkRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/342840.html">Service-linked roles</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>Your RDS instance runs SQL Server 2008 R2 with local disks.</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/95724.html">Restore the data of an ApsaraDB RDS for SQL Server instance by using a temporary RDS instance</a></p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteADSetting  DeleteADSettingRequest
     * @return DeleteADSettingResponse
     */
    CompletableFuture<DeleteADSettingResponse> deleteADSetting(DeleteADSettingRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL<blockquote>
     * <p>Only instances that run RDS High-availability Edition are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Description</h3>
     * <p>You can call this operation to delete backup sets of the instance itself. Backup sets of the associated instances such as read-only, disaster recovery, and cloned instances are not deleted.</p>
     * <h3>Precautions</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>If the log backup feature is disabled, instances cannot be restored by point in time. You can delete data backup sets that are retained for more than seven days.</li>
     * <li>If the log backup feature is enabled and the log backup retention period is shorter than the data backup retention period, you can delete the data backup files that are retained for a period longer than the log backup retention period.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS SQL Server</p>
     * <blockquote>
     * <p> This operation is available only for users that are added to the whitelist.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteBackupFile  DeleteBackupFileRequest
     * @return DeleteBackupFileResponse
     */
    CompletableFuture<DeleteBackupFileResponse> deleteBackupFile(DeleteBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Note Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/464133.html">Delete the read-only endpoint of an ApsaraDB RDS for MySQL cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDBInstanceEndpoint  DeleteDBInstanceEndpointRequest
     * @return DeleteDBInstanceEndpointResponse
     */
    CompletableFuture<DeleteDBInstanceEndpointResponse> deleteDBInstanceEndpoint(DeleteDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>You can delete only the public endpoint of each endpoint type from the instance. If you want to delete an internal endpoint of any endpoint type, you can directly delete the type of endpoint.</p>
     * 
     * @param request the request parameters of DeleteDBInstanceEndpointAddress  DeleteDBInstanceEndpointAddressRequest
     * @return DeleteDBInstanceEndpointAddressResponse
     */
    CompletableFuture<DeleteDBInstanceEndpointAddressResponse> deleteDBInstanceEndpointAddress(DeleteDBInstanceEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of DeleteDBInstanceSecurityGroupRule  DeleteDBInstanceSecurityGroupRuleRequest
     * @return DeleteDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<DeleteDBInstanceSecurityGroupRuleResponse> deleteDBInstanceSecurityGroupRule(DeleteDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/464130.html">Delete a node from an ApsaraDB RDS for MySQL cluster</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDBNodes  DeleteDBNodesRequest
     * @return DeleteDBNodesResponse
     */
    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Configure the dedicated proxy endpoint for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBProxyEndpointAddress  DeleteDBProxyEndpointAddressRequest
     * @return DeleteDBProxyEndpointAddressResponse
     */
    CompletableFuture<DeleteDBProxyEndpointAddressResponse> deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#">Usage notes</a></h3>
     * <ul>
     * <li>A global active database cluster cannot be restored after it is deleted. Proceed with caution.</li>
     * <li>If you delete a global active database cluster, the system removes all nodes and Data Transmission Service (DTS) synchronization tasks from the cluster. However, the system does not release the ApsaraDB RDS for MySQL instances that run as nodes in the cluster. If you no longer need the ApsaraDB RDS for MySQL instances, you can call the <a href="https://help.aliyun.com/document_detail/26229.html">DeleteDBInstance</a> to release the instances one after another.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteGadInstance  DeleteGadInstanceRequest
     * @return DeleteGadInstanceResponse
     */
    CompletableFuture<DeleteGadInstanceResponse> deleteGadInstance(DeleteGadInstanceRequest request);

    /**
     * @param request the request parameters of DeleteMaskingRules  DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of DeleteParameterGroup  DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Manual snapshots of the disk are retained.</li>
     * <li>The disk must be in the Unattached (Available) state.</li>
     * <li>If no disk with the specified disk ID exists, the request will be ignored.</li>
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
     * <p>After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</p>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the specified snapshot ID does not exist, the request will be ignored.</li>
     * <li>If the snapshot is used to create custom images, the snapshot cannot be deleted. You must delete the created custom images before you can delete the snapshot.</li>
     * <li>If the snapshot is used to create cloud disks and <code>Force</code> is not specified or is set to <code>false</code>, the snapshot cannot be directly deleted. If you want to delete the snapshot, set <code>Force</code> to true to forcefully delete the snapshot. The cloud disks created from the snapshot cannot be re-initialized after the snapshot is forcefully deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRCSnapshot  DeleteRCSnapshotRequest
     * @return DeleteRCSnapshotResponse
     */
    CompletableFuture<DeleteRCSnapshotResponse> deleteRCSnapshot(DeleteRCSnapshotRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>You can delete a replication slot only when the status of the slot is <strong>INACTIVE</strong>. You can call the DescribeSlots operation to query the status of a replication slot.</p>
     * 
     * @param request the request parameters of DeleteSlot  DeleteSlotRequest
     * @return DeleteSlotResponse
     */
    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the data of a self-managed MySQL 5.7 instance to the cloud</a>.</li>
     * <li>This operation deletes full backup files only from the ApsaraDB RDS console. This operation does not affect the full backup files that are stored as objects in Object Storage Service (OSS) buckets. After you call this operation to delete a full backup file, you can call the ImportUserBackupFile operation to reimport the full backup file.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUserBackupFile  DeleteUserBackupFileRequest
     * @return DeleteUserBackupFileResponse
     */
    CompletableFuture<DeleteUserBackupFileResponse> deleteUserBackupFile(DeleteUserBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescibeImportsFromDatabase  DescibeImportsFromDatabaseRequest
     * @return DescibeImportsFromDatabaseResponse
     */
    CompletableFuture<DescibeImportsFromDatabaseResponse> descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeADInfo  DescribeADInfoRequest
     * @return DescribeADInfoResponse
     */
    CompletableFuture<DescribeADInfoResponse> describeADInfo(DescribeADInfoRequest request);

    /**
     * @param request the request parameters of DescribeAccountMaskingPrivilege  DescribeAccountMaskingPrivilegeRequest
     * @return DescribeAccountMaskingPrivilegeResponse
     */
    CompletableFuture<DescribeAccountMaskingPrivilegeResponse> describeAccountMaskingPrivilege(DescribeAccountMaskingPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActionEventPolicy  DescribeActionEventPolicyRequest
     * @return DescribeActionEventPolicyResponse
     */
    CompletableFuture<DescribeActionEventPolicyResponse> describeActionEventPolicy(DescribeActionEventPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAllWhitelistTemplate  DescribeAllWhitelistTemplateRequest
     * @return DescribeAllWhitelistTemplateResponse
     */
    CompletableFuture<DescribeAllWhitelistTemplateResponse> describeAllWhitelistTemplate(DescribeAllWhitelistTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/155180.html">Create and view an analytic instance</a></p>
     * 
     * @param request the request parameters of DescribeAnalyticdbByPrimaryDBInstance  DescribeAnalyticdbByPrimaryDBInstanceRequest
     * @return DescribeAnalyticdbByPrimaryDBInstanceResponse
     */
    CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> describeAnalyticdbByPrimaryDBInstance(DescribeAnalyticdbByPrimaryDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableClasses  DescribeAvailableClassesRequest
     * @return DescribeAvailableClassesResponse
     */
    CompletableFuture<DescribeAvailableClassesResponse> describeAvailableClasses(DescribeAvailableClassesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableCrossRegion  DescribeAvailableCrossRegionRequest
     * @return DescribeAvailableCrossRegionResponse
     */
    CompletableFuture<DescribeAvailableCrossRegionResponse> describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View the Enhanced Monitoring metrics</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableMetrics  DescribeAvailableMetricsRequest
     * @return DescribeAvailableMetricsResponse
     */
    CompletableFuture<DescribeAvailableMetricsResponse> describeAvailableMetrics(DescribeAvailableMetricsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To view the time range within which you can restore data from a standard backup set, see DescribeBackups.</p>
     * </blockquote>
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>ApsaraDB RDS for MySQL instances with local disks</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableRecoveryTime  DescribeAvailableRecoveryTimeRequest
     * @return DescribeAvailableRecoveryTimeResponse
     */
    CompletableFuture<DescribeAvailableRecoveryTimeResponse> describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB<blockquote>
     * <p>You can call this operation to query the available zones for an instance. The query result may be different from the zones available on the buy page of the ApsaraDB RDS console. The values of some parameters on the buy page vary based on the actual sales policy. The actual information on the <a href="https://rdsbuy.console.aliyun.com/create/rds/PostgreSQL">buy page</a> prevails.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableZones  DescribeAvailableZonesRequest
     * @return DescribeAvailableZonesResponse
     */
    CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is phased out.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeBackupDatabase  DescribeBackupDatabaseRequest
     * @return DescribeBackupDatabaseResponse
     */
    CompletableFuture<DescribeBackupDatabaseResponse> describeBackupDatabase(DescribeBackupDatabaseRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
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
     * <h3><a href="#"></a>Supported database engines</h3>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>If the return value of the <strong>DownloadLink</strong> parameter is NULL, ApsaraDB RDS does not provide a download URL.</li>
     * <li>If the return value of the <strong>DownloadLink</strong> parameter is not NULL, ApsaraDB RDS provides a URL for you to download backup files. The expiration time of the URL is specified by the <strong>LinkExpiredTime</strong> parameter. You must download the backup files before the expiration time.</li>
     * <li>If you use a RAM user to download backup files, you must grant permissions to the RAM user. For more information, see <a href="https://help.aliyun.com/document_detail/100043.html">Grant backup file download permissions to a RAM user with read-only permissions</a>.</li>
     * <li>Each log file that is returned by this operation contains the log entries that are generated over the time range that is specified by the StartTime and EndTime parameters.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBinlogFiles  DescribeBinlogFilesRequest
     * @return DescribeBinlogFilesResponse
     */
    CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCharacterSetName  DescribeCharacterSetNameRequest
     * @return DescribeCharacterSetNameResponse
     */
    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudMigrationResult  DescribeCloudMigrationResultRequest
     * @return DescribeCloudMigrationResultResponse
     */
    CompletableFuture<DescribeCloudMigrationResultResponse> describeCloudMigrationResult(DescribeCloudMigrationResultRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>SQL Server</p>
     * 
     * @param request the request parameters of DescribeCollationTimeZones  DescribeCollationTimeZonesRequest
     * @return DescribeCollationTimeZonesResponse
     */
    CompletableFuture<DescribeCollationTimeZonesResponse> describeCollationTimeZones(DescribeCollationTimeZonesRequest request);

    /**
     * <b>description</b> :
     * <p>ApsaraDB RDS for MySQL instances support cross-region backup and restoration. For more information, see <a href="https://help.aliyun.com/document_detail/120824.html">Back up an ApsaraDB RDS for MySQL instance across regions</a> and <a href="https://help.aliyun.com/document_detail/120875.html">Restore the data of an ApsaraDB RDS for MySQL instance across regions</a>.
     * Before you call this operation, make sure that the instance runs one of the following database engines:</p>
     * <ul>
     * <li>MySQL. For more information, see <a href="https://help.aliyun.com/document_detail/120824.html">Back up an ApsaraDB RDS for MySQL instance across regions</a>.</li>
     * <li>SQL Server. For more information, see <a href="https://help.aliyun.com/document_detail/187923.html">Back up an ApsaraDB RDS for SQL Server instance across regions</a>.</li>
     * <li>PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/206671.html">Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossBackupMetaList  DescribeCrossBackupMetaListRequest
     * @return DescribeCrossBackupMetaListResponse
     */
    CompletableFuture<DescribeCrossBackupMetaListResponse> describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCrossRegionBackupDBInstance  DescribeCrossRegionBackupDBInstanceRequest
     * @return DescribeCrossRegionBackupDBInstanceResponse
     */
    CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL instances with local disks</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a><blockquote>
     * <p> For more information about how to query cross-region log backup files, see DescribeCrossRegionLogBackupFiles.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a><blockquote>
     * <p> For more information about how to query cross-region data backup files, see <a href="https://help.aliyun.com/document_detail/121733.html">DescribeCrossRegionBackups</a>.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceByTags  DescribeDBInstanceByTagsRequest
     * @return DescribeDBInstanceByTagsResponse
     */
    CompletableFuture<DescribeDBInstanceByTagsResponse> describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceConnectivity  DescribeDBInstanceConnectivityRequest
     * @return DescribeDBInstanceConnectivityResponse
     */
    CompletableFuture<DescribeDBInstanceConnectivityResponse> describeDBInstanceConnectivity(DescribeDBInstanceConnectivityRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDetail  DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
     */
    CompletableFuture<DescribeDBInstanceDetailResponse> describeDBInstanceDetail(DescribeDBInstanceDetailRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceEncryptionKey  DescribeDBInstanceEncryptionKeyRequest
     * @return DescribeDBInstanceEncryptionKeyResponse
     */
    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * 
     * @param request the request parameters of DescribeDBInstanceEndpoints  DescribeDBInstanceEndpointsRequest
     * @return DescribeDBInstanceEndpointsResponse
     */
    CompletableFuture<DescribeDBInstanceEndpointsResponse> describeDBInstanceEndpoints(DescribeDBInstanceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceIPArrayList  DescribeDBInstanceIPArrayListRequest
     * @return DescribeDBInstanceIPArrayListResponse
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <ul>
     * <li>The RDS instance runs RDS Basic Edition, RDS High-availability Edition, or RDS Cluster Edition. If your RDS instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.</li>
     * <li>The RDS instance belongs to a general-purpose or dedicated instance family. The shared instance family is not supported.</li>
     * <li>If the RDS instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the Creation Time parameter of an instance in the Status section of the Basic Information page in the ApsaraDB RDS console.</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/124321.html">Configure a distributed transaction whitelist</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/124188.html">Connect Kingdee K/3 WISE to an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceIpHostname  DescribeDBInstanceIpHostnameRequest
     * @return DescribeDBInstanceIpHostnameResponse
     */
    CompletableFuture<DescribeDBInstanceIpHostnameResponse> describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View the Enhanced Monitoring metrics</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBInstanceMetrics  DescribeDBInstanceMetricsRequest
     * @return DescribeDBInstanceMetricsResponse
     */
    CompletableFuture<DescribeDBInstanceMetricsResponse> describeDBInstanceMetrics(DescribeDBInstanceMetricsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceMonitor  DescribeDBInstanceMonitorRequest
     * @return DescribeDBInstanceMonitorResponse
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceNetInfoForChannel  DescribeDBInstanceNetInfoForChannelRequest
     * @return DescribeDBInstanceNetInfoForChannelResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> describeDBInstanceNetInfoForChannel(DescribeDBInstanceNetInfoForChannelRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancePerformance  DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
     * @deprecated OpenAPI DescribeDBInstancePromoteActivity is deprecated  * @param request  the request parameters of DescribeDBInstancePromoteActivity  DescribeDBInstancePromoteActivityRequest
     * @return DescribeDBInstancePromoteActivityResponse
     */
    @Deprecated
    CompletableFuture<DescribeDBInstancePromoteActivityResponse> describeDBInstancePromoteActivity(DescribeDBInstancePromoteActivityRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <p>This operation is used to query the shared proxy settings of an instance that runs MySQL or the read/write splitting settings of an instance that runs SQL Server. For more information about how to query the dedicated proxy settings of an ApsaraDB RDS for MySQL instance, see <a href="https://help.aliyun.com/document_detail/610506.html">DescribeDBProxy</a>.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The shared proxy feature must be enabled for the primary instance.</li>
     * <li>The read/write splitting feature must be enabled for the primary instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceProxyConfiguration  DescribeDBInstanceProxyConfigurationRequest
     * @return DescribeDBInstanceProxyConfigurationResponse
     */
    CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of DescribeDBInstanceSecurityGroupRule  DescribeDBInstanceSecurityGroupRuleRequest
     * @return DescribeDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<DescribeDBInstanceSecurityGroupRuleResponse> describeDBInstanceSecurityGroupRule(DescribeDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceTDE  DescribeDBInstanceTDERequest
     * @return DescribeDBInstanceTDEResponse
     */
    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeDBInstancesAsCsv is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description >  The DescribeDBInstancesAsCsv operation is phased out. You can call the DescribeDBInstances operation.
     * 
     * @param request the request parameters of DescribeDBInstancesAsCsv  DescribeDBInstancesAsCsvRequest
     * @return DescribeDBInstancesAsCsvResponse
     */
    @Deprecated
    CompletableFuture<DescribeDBInstancesAsCsvResponse> describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancesByExpireTime  DescribeDBInstancesByExpireTimeRequest
     * @return DescribeDBInstancesByExpireTimeResponse
     */
    CompletableFuture<DescribeDBInstancesByExpireTimeResponse> describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstancesByPerformance  DescribeDBInstancesByPerformanceRequest
     * @return DescribeDBInstancesByPerformanceResponse
     */
    CompletableFuture<DescribeDBInstancesByPerformanceResponse> describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstancesForClone  DescribeDBInstancesForCloneRequest
     * @return DescribeDBInstancesForCloneResponse
     */
    CompletableFuture<DescribeDBInstancesForCloneResponse> describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Before you purchase or upgrade an instance that runs MySQL or PostgreSQL, you can call the DescribeDBMiniEngineVersions operation to query the minor engine versions that are available for the instance.</p>
     * 
     * @param request the request parameters of DescribeDBMiniEngineVersions  DescribeDBMiniEngineVersionsRequest
     * @return DescribeDBMiniEngineVersionsResponse
     */
    CompletableFuture<DescribeDBMiniEngineVersionsResponse> describeDBMiniEngineVersions(DescribeDBMiniEngineVersionsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBProxy  DescribeDBProxyRequest
     * @return DescribeDBProxyResponse
     */
    CompletableFuture<DescribeDBProxyResponse> describeDBProxy(DescribeDBProxyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL<blockquote>
     * <p> Starting October 17, 2023, ApsaraDB RDS provides a dedicated proxy free of charge for each ApsaraDB RDS for MySQL instance on RDS Cluster Edition. For more information, see <a href="~~2555466~~">[Special offers/Price changes] One proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/194241.html">View the monitoring data of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418275.html">View the monitoring data of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBProxyPerformance  DescribeDBProxyPerformanceRequest
     * @return DescribeDBProxyPerformanceResponse
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/124321.html">Configures a distributed transaction whitelist for an ApsaraDB RDS for SQL Server instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDTCSecurityIpHostsForSQLServer  DescribeDTCSecurityIpHostsForSQLServerRequest
     * @return DescribeDTCSecurityIpHostsForSQLServerResponse
     */
    CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDatabases  DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances in a cluster at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of DescribeDedicatedHostGroups  DescribeDedicatedHostGroupsRequest
     * @return DescribeDedicatedHostGroupsResponse
     */
    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>MySQL</p>
     * <blockquote>
     * <p>This operation is available only for instances that use local disks.</p>
     * </blockquote>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * For more information about how to retain the data backup files of an instance after the instance is released, see <a href="https://help.aliyun.com/document_detail/98818.html">Configure automatic backup</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDetachedBackups  DescribeDetachedBackupsRequest
     * @return DescribeDetachedBackupsResponse
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    /**
     * @deprecated OpenAPI DescribeDiagnosticReportList is deprecated  * @description >  This operation is phased out.
     * 
     * @param request the request parameters of DescribeDiagnosticReportList  DescribeDiagnosticReportListRequest
     * @return DescribeDiagnosticReportListResponse
     */
    @Deprecated
    CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeErrorLogs  DescribeErrorLogsRequest
     * @return DescribeErrorLogsResponse
     */
    CompletableFuture<DescribeErrorLogsResponse> describeErrorLogs(DescribeErrorLogsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/129759.html">Historical events of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131008.html">Historical events of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131013.html">Historical events of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131010.html">Historical events of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeGadInstances  DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
     */
    CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/207467.html">What is availability detection?</a></p>
     * 
     * @param request the request parameters of DescribeHADiagnoseConfig  DescribeHADiagnoseConfigRequest
     * @return DescribeHADiagnoseConfigResponse
     */
    CompletableFuture<DescribeHADiagnoseConfigResponse> describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/474275.html">Tasks of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/474537.html">Tasks of an ApsaraDB RDS for PostrgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/614826.html">Tasks of an ApsaraDB RDS for SQL Server instance</a></li>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisite</h3>
     * <ul>
     * <li>The instance meets the following requirements:<ul>
     * <li>The instance resides in a region other than the China (Zhangjiakou) region.</li>
     * <li>The instance runs RDS Basic Edition, RDS Cluster Edition, or RDS High-availability Edition. If your instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.</li>
     * <li>The instance belongs to the general-purpose or dedicated instance family. The shared instance family is not supported.</li>
     * <li>The instance resides in a virtual private cloud (VPC). For more information about how to change the network type of an RDS instance, see <a href="https://help.aliyun.com/document_detail/95707.html">Change the network type</a>.</li>
     * <li>If the instance runs RDS High-availability Edition or RDS Cluster Edition, the instance is created on or after January 1, 2021. If the instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the <strong>Creation Time</strong> parameter of an instance in the <strong>Status</strong> section of the <strong>Basic Information</strong> page in the ApsaraDB RDS console.</li>
     * </ul>
     * </li>
     * <li>Your <strong>Alibaba Cloud account</strong> is used for logons.</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/354862.html">Create a host account and use the host account for logons</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeHostWebShell  DescribeHostWebShellRequest
     * @return DescribeHostWebShellResponse
     */
    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceCrossBackupPolicy  DescribeInstanceCrossBackupPolicyRequest
     * @return DescribeInstanceCrossBackupPolicyResponse
     */
    CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceKeywords  DescribeInstanceKeywordsRequest
     * @return DescribeInstanceKeywordsResponse
     */
    CompletableFuture<DescribeInstanceKeywordsResponse> describeInstanceKeywords(DescribeInstanceKeywordsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceLinkedWhitelistTemplate  DescribeInstanceLinkedWhitelistTemplateRequest
     * @return DescribeInstanceLinkedWhitelistTemplateResponse
     */
    CompletableFuture<DescribeInstanceLinkedWhitelistTemplateResponse> describeInstanceLinkedWhitelistTemplate(DescribeInstanceLinkedWhitelistTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeKmsAssociateResources  DescribeKmsAssociateResourcesRequest
     * @return DescribeKmsAssociateResourcesResponse
     */
    CompletableFuture<DescribeKmsAssociateResourcesResponse> describeKmsAssociateResources(DescribeKmsAssociateResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLocalAvailableRecoveryTime  DescribeLocalAvailableRecoveryTimeRequest
     * @return DescribeLocalAvailableRecoveryTimeResponse
     */
    CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>SQL Server</p>
     * <blockquote>
     * <p> You can call the DescribeBinlogFiles operation to query the log files of instances that run different database engines.</p>
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
     * @param request the request parameters of DescribeMaskingRules  DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <blockquote>
     * <p>This operation is available for RDS instances that run MySQL 8.0, MySQL 5.7, and MySQL 5.6 on RDS High-availability Edition with local disks.</p>
     * </blockquote>
     * <h3><a href="#"></a>Description</h3>
     * <p>Before you call the <a href="https://help.aliyun.com/document_detail/131510.html">RestoreTable</a> operation to restore individual databases or tables of an ApsaraDB RDS for MySQL instance, you can call this operation to query the information about the databases and tables that can be restored. For more information, see <a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables of an ApsaraDB RDS for MySQL instance</a>.</p>
     * 
     * @param request the request parameters of DescribeMetaList  DescribeMetaListRequest
     * @return DescribeMetaListResponse
     */
    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMigrateTaskById  DescribeMigrateTaskByIdRequest
     * @return DescribeMigrateTaskByIdResponse
     */
    CompletableFuture<DescribeMigrateTaskByIdResponse> describeMigrateTaskById(DescribeMigrateTaskByIdRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>This operation allows you to query the migration tasks that are created for the instance over the last week.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>This operation is supported only for migration tasks that are created to migrate full backup files.</li>
     * <li>This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMigrateTasks  DescribeMigrateTasksRequest
     * @return DescribeMigrateTasksResponse
     */
    CompletableFuture<DescribeMigrateTasksResponse> describeMigrateTasks(DescribeMigrateTasksRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * 
     * @param request the request parameters of DescribeModifyPGHbaConfigLog  DescribeModifyPGHbaConfigLogRequest
     * @return DescribeModifyPGHbaConfigLogResponse
     */
    CompletableFuture<DescribeModifyPGHbaConfigLogResponse> describeModifyPGHbaConfigLog(DescribeModifyPGHbaConfigLogRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModifyParameterLog  DescribeModifyParameterLogRequest
     * @return DescribeModifyParameterLogResponse
     */
    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#">Usage notes</a></h3>
     * <p>This operation is not supported for instances that run SQL Server 2017 EE or SQL Server 2019 EE.</p>
     * 
     * @param request the request parameters of DescribeOssDownloads  DescribeOssDownloadsRequest
     * @return DescribeOssDownloadsResponse
     */
    CompletableFuture<DescribeOssDownloadsResponse> describeOssDownloads(DescribeOssDownloadsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * 
     * @param request the request parameters of DescribePGHbaConfig  DescribePGHbaConfigRequest
     * @return DescribePGHbaConfigResponse
     */
    CompletableFuture<DescribePGHbaConfigResponse> describePGHbaConfig(DescribePGHbaConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterGroup  DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
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
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribePostgresExtensions  DescribePostgresExtensionsRequest
     * @return DescribePostgresExtensionsResponse
     */
    CompletableFuture<DescribePostgresExtensionsResponse> describePostgresExtensions(DescribePostgresExtensionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
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
     * <b>description</b> :
     * <p>Kubeconfig files store identity and authentication information that is used by clients to access ACK clusters. To use kubectl to manage an ACK cluster, you must use the kubeconfig file to connect to the ACK cluster. We recommend that you keep kubeconfig files confidential and revoke kubeconfig files that are not in use. This helps prevent data leaks caused by the disclosure of kubeconfig files.</p>
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
     * <p>The address returned is valid only for 15 seconds. If you do not use the returned address to establish a connection within 15 seconds, the address expires and you must call the operation again to obtain a new address.</p>
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
     * @param request the request parameters of DescribeRCMetricList  DescribeRCMetricListRequest
     * @return DescribeRCMetricListResponse
     */
    CompletableFuture<DescribeRCMetricListResponse> describeRCMetricList(DescribeRCMetricListRequest request);

    /**
     * @param request the request parameters of DescribeRCNodePool  DescribeRCNodePoolRequest
     * @return DescribeRCNodePoolResponse
     */
    CompletableFuture<DescribeRCNodePoolResponse> describeRCNodePool(DescribeRCNodePoolRequest request);

    /**
     * @param request the request parameters of DescribeRCSnapshots  DescribeRCSnapshotsRequest
     * @return DescribeRCSnapshotsResponse
     */
    CompletableFuture<DescribeRCSnapshotsResponse> describeRCSnapshots(DescribeRCSnapshotsRequest request);

    /**
     * @deprecated OpenAPI DescribeRdsResourceSettings is deprecated  * @param request  the request parameters of DescribeRdsResourceSettings  DescribeRdsResourceSettingsRequest
     * @return DescribeRdsResourceSettingsResponse
     */
    @Deprecated
    CompletableFuture<DescribeRdsResourceSettingsResponse> describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeReadDBInstanceDelay  DescribeReadDBInstanceDelayRequest
     * @return DescribeReadDBInstanceDelayResponse
     */
    CompletableFuture<DescribeReadDBInstanceDelayResponse> describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegionInfos  DescribeRegionInfosRequest
     * @return DescribeRegionInfosResponse
     */
    CompletableFuture<DescribeRegionInfosResponse> describeRegionInfos(DescribeRegionInfosRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeResourceUsage  DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     */
    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLCollectorPolicy  DescribeSQLCollectorPolicyRequest
     * @return DescribeSQLCollectorPolicyResponse
     */
    CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLCollectorRetention  DescribeSQLCollectorRetentionRequest
     * @return DescribeSQLCollectorRetentionResponse
     */
    CompletableFuture<DescribeSQLCollectorRetentionResponse> describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server
     * **
     * <strong>Note</strong> If your instance runs SQL Server, only SQL Server 2008 R2 is supported.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>The DescribeSQLLogFiles operation does not return the log files that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.</li>
     * <li>The DescribeSQLLogFiles operation does not return the log files that are generated by the SQL Explorer feature and manually exported from the ApsaraDB RDS console. The DescribeSQLLogFiles operation returns the SQL Explorer log files that are generated by calling the <a href="https://help.aliyun.com/document_detail/610533.html">DescribeSQLLogRecords</a> operation with the request parameter <strong>Form</strong> set to <strong>File</strong>.</li>
     * <li>The exported files are retained for only two days.
     * **
     * <strong>Note</strong> If you have enabled Database Autonomy Service (DAS) Enterprise Edition V2 or V3 and have enabled the SQL Explorer and Audit feature, the exported files are retained for seven days. You can call the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation to query the information about the enabled DAS Enterprise Edition.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogFiles  DescribeSQLLogFilesRequest
     * @return DescribeSQLLogFilesResponse
     */
    CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#">Usage notes</a></h3>
     * <ul>
     * <li>You can call this operation up to 1,000 times per minute per account. The calls initiated by using both your Alibaba Cloud account and RAM users within your Alibaba Cloud account are counted.</li>
     * <li>This operation cannot be used to query the logs that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.</li>
     * <li>When you call this operation and set the <strong>Form</strong> parameter to <strong>File</strong> to generate an audit file, a maximum of 1 million log entries can be recorded in the audit file, and you cannot filter log entries by keyword.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogRecords  DescribeSQLLogRecordsRequest
     * @return DescribeSQLLogRecordsResponse
     */
    CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLLogReportList  DescribeSQLLogReportListRequest
     * @return DescribeSQLLogReportListResponse
     */
    CompletableFuture<DescribeSQLLogReportListResponse> describeSQLLogReportList(DescribeSQLLogReportListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecrets  DescribeSecretsRequest
     * @return DescribeSecretsResponse
     */
    CompletableFuture<DescribeSecretsResponse> describeSecrets(DescribeSecretsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlots  DescribeSlotsRequest
     * @return DescribeSlotsResponse
     */
    CompletableFuture<DescribeSlotsResponse> describeSlots(DescribeSlotsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>The response parameters returned by this operation are updated every minute.</p>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL
     * **
     * <strong>Note</strong> This operation is not supported for RDS instances that run MySQL 5.7 on RDS Basic Edition.</li>
     * <li>SQL Server
     * **
     * <strong>Note</strong> This operation is supported only for RDS instances that run SQL Server 2008 R2.</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <ul>
     * <li>Slow query logs are not collected in real time and may show a latency of 6 to 8 hours.</li>
     * <li>If the return result is empty, check whether the StartTime and EndTime parameters are in UTC. If yes, no slow logs are generated within the specified time range.</li>
     * <li>Starting from September 01, 2024, the template algorithm for slow queries is optimized. When you call the operation, you must change the value of the <strong>SQLHASH</strong> parameter. For more information, see <a href="~~2845725~~">[Notice] Optimization of the template algorithm for slow queries</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlowLogs  DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>SQL Server</p>
     * 
     * @param request the request parameters of DescribeSupportOnlineResizeDisk  DescribeSupportOnlineResizeDiskRequest
     * @return DescribeSupportOnlineResizeDiskResponse
     */
    CompletableFuture<DescribeSupportOnlineResizeDiskResponse> describeSupportOnlineResizeDisk(DescribeSupportOnlineResizeDiskRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#">Usage notes</a></h3>
     * <ul>
     * <li>If an instance ID is specified, all tags that are added to this instance are queried, and other filter conditions are invalid.</li>
     * <li>If you specify only TagKey, the results that match the specified TagKey are returned. If you specify both TagKey and TagValue, the results that match both the specified TagKey and TagValue are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL
     * PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2794383.html">Check report for the major engine version upgrade of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/218391.html">Introduction to the check report of a major engine version upgrade for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUpgradeMajorVersionPrecheckTask  DescribeUpgradeMajorVersionPrecheckTaskRequest
     * @return DescribeUpgradeMajorVersionPrecheckTaskResponse
     */
    CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> describeUpgradeMajorVersionPrecheckTask(DescribeUpgradeMajorVersionPrecheckTaskRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PostgreSQL</p>
     * 
     * @param request the request parameters of DescribeUpgradeMajorVersionTasks  DescribeUpgradeMajorVersionTasksRequest
     * @return DescribeUpgradeMajorVersionTasksResponse
     */
    CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> describeUpgradeMajorVersionTasks(DescribeUpgradeMajorVersionTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeWhitelistTemplateLinkedInstance  DescribeWhitelistTemplateLinkedInstanceRequest
     * @return DescribeWhitelistTemplateLinkedInstanceResponse
     */
    CompletableFuture<DescribeWhitelistTemplateLinkedInstanceResponse> describeWhitelistTemplateLinkedInstance(DescribeWhitelistTemplateLinkedInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The DestroyDBInstance operation is phased out.</p>
     * 
     * @param request the request parameters of DestroyDBInstance  DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
     */
    CompletableFuture<DestroyDBInstanceResponse> destroyDBInstance(DestroyDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#">Usage notes</a></h3>
     * <p>This operation can be used to remove only unit nodes.</p>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DetachWhitelistTemplateToInstance  DetachWhitelistTemplateToInstanceRequest
     * @return DetachWhitelistTemplateToInstanceResponse
     */
    CompletableFuture<DetachWhitelistTemplateToInstanceResponse> detachWhitelistTemplateToInstance(DetachWhitelistTemplateToInstanceRequest request);

    /**
     * @param request the request parameters of EvaluateLocalExtendDisk  EvaluateLocalExtendDiskRequest
     * @return EvaluateLocalExtendDiskResponse
     */
    CompletableFuture<EvaluateLocalExtendDiskResponse> evaluateLocalExtendDisk(EvaluateLocalExtendDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * 
     * @param request the request parameters of GetDBInstanceTopology  GetDBInstanceTopologyRequest
     * @return GetDBInstanceTopologyResponse
     */
    CompletableFuture<GetDBInstanceTopologyResponse> getDBInstanceTopology(GetDBInstanceTopologyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * 
     * @param request the request parameters of GetDbProxyInstanceSsl  GetDbProxyInstanceSslRequest
     * @return GetDbProxyInstanceSslResponse
     */
    CompletableFuture<GetDbProxyInstanceSslResponse> getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request);

    /**
     * <b>description</b> :
     * <p>Each account can be granted permissions on one or more databases. Before you call this operation, make sure that the instance is in the Running state.</p>
     * <blockquote>
     * <p>This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL with local disks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96102.html">Grant permissions to the service account of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95693.html">Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of GrantOperatorPermission  GrantOperatorPermissionRequest
     * @return GrantOperatorPermissionResponse
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The self-managed MySQL instance runs MySQL 5.7 and is backed up by using XtraBackup. The name of the backup file ends with <code>_qp.xb</code>. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the data of a self-managed MySQL 5.7 instance to the cloud</a>.</li>
     * <li>The full backup file of the self-managed MySQL instance is uploaded to an Object Storage Service (OSS) bucket in the region of the ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the data of a self-managed MySQL 5.7 instance to the cloud</a>.<blockquote>
     * <p> This operation is supported only for MySQL 5.7.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportUserBackupFile  ImportUserBackupFileRequest
     * @return ImportUserBackupFileResponse
     */
    CompletableFuture<ImportUserBackupFileResponse> importUserBackupFile(ImportUserBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ListClasses  ListClassesRequest
     * @return ListClassesResponse
     */
    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>Feature description</h3>
     * <ul>
     * <li>A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the data of a self-managed MySQL 5.7 instance to the cloud</a>.</li>
     * <li>Before you call the <a href="https://help.aliyun.com/document_detail/26228.html">CreateDBInstance</a> operation to create an ApsaraDB RDS for MySQL instance into which you want to import full backup files, you can call this operation to query the IDs of full backup files.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/260266.html">ImportUserBackupFile</a> operation to import a full backup file into an ApsaraDB RDS for MySQL instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserBackupFiles  ListUserBackupFilesRequest
     * @return ListUserBackupFilesResponse
     */
    CompletableFuture<ListUserBackupFilesResponse> listUserBackupFiles(ListUserBackupFilesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/147649.html">Lock an account of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of LockAccount  LockAccountRequest
     * @return LockAccountResponse
     */
    CompletableFuture<LockAccountResponse> lockAccount(LockAccountRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for MySQL instance across zones in the same region</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95658.html">Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateConnectionToOtherZone  MigrateConnectionToOtherZoneRequest
     * @return MigrateConnectionToOtherZoneResponse
     */
    CompletableFuture<MigrateConnectionToOtherZoneResponse> migrateConnectionToOtherZone(MigrateConnectionToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of MigrateDBInstance  MigrateDBInstanceRequest
     * @return MigrateDBInstanceResponse
     */
    CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96117.html">Change the whitelist mode of an ApsaraDB RDS for MySQL instance to the enhanced whitelist mode</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96767.html">Change the whitelist mode of an ApsaraDB RDS for PostgreSQL instance to the enhanced whitelist mode</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateSecurityIPMode  MigrateSecurityIPModeRequest
     * @return MigrateSecurityIPModeResponse
     */
    CompletableFuture<MigrateSecurityIPModeResponse> migrateSecurityIPMode(MigrateSecurityIPModeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96053.html">Migrate an ApsaraDB RDS for MySQL instance across zones in the same region</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96746.html">Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95658.html">Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region</a></li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/170734.html">Connect an RDS instance to a self-managed domain</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyADInfo  ModifyADInfoRequest
     * @return ModifyADInfoResponse
     */
    CompletableFuture<ModifyADInfoResponse> modifyADInfo(ModifyADInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAccountCheckPolicy  ModifyAccountCheckPolicyRequest
     * @return ModifyAccountCheckPolicyResponse
     */
    CompletableFuture<ModifyAccountCheckPolicyResponse> modifyAccountCheckPolicy(ModifyAccountCheckPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountMaskingPrivilege  ModifyAccountMaskingPrivilegeRequest
     * @return ModifyAccountMaskingPrivilegeResponse
     */
    CompletableFuture<ModifyAccountMaskingPrivilegeResponse> modifyAccountMaskingPrivilege(ModifyAccountMaskingPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>SQL Server (This parameter is unavailable for ApsaraDB RDS for SQL Server instances that belong to the shared instance family and run SQL Server 2008 R2.)</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95640.html">Create a custom password policy for an account of an ApsaraDB RDS for SQL Server instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyAccountSecurityPolicy  ModifyAccountSecurityPolicyRequest
     * @return ModifyAccountSecurityPolicyResponse
     */
    CompletableFuture<ModifyAccountSecurityPolicyResponse> modifyAccountSecurityPolicy(ModifyAccountSecurityPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/129759.html">View the event history of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131008.html">View the event history of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131013.html">View the event history of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/131010.html">View the event history of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyActionEventPolicy  ModifyActionEventPolicyRequest
     * @return ModifyActionEventPolicyResponse
     */
    CompletableFuture<ModifyActionEventPolicyResponse> modifyActionEventPolicy(ModifyActionEventPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">Scheduled events for ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">Scheduled events for ApsaraDB RDS for PostgreSQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">Scheduled events for ApsaraDB RDS for SQL Server instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">Scheduled events for ApsaraDB RDS for MariaDB instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/95700.html">Change the character set collation and the time zone of system databases</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyCollationTimeZone  ModifyCollationTimeZoneRequest
     * @return ModifyCollationTimeZoneResponse
     */
    CompletableFuture<ModifyCollationTimeZoneResponse> modifyCollationTimeZone(ModifyCollationTimeZoneRequest request);

    /**
     * @param request the request parameters of ModifyCustinsResource  ModifyCustinsResourceRequest
     * @return ModifyCustinsResourceResponse
     */
    CompletableFuture<ModifyCustinsResourceResponse> modifyCustinsResource(ModifyCustinsResourceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBDescription  ModifyDBDescriptionRequest
     * @return ModifyDBDescriptionResponse
     */
    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96059.html">Modify automatic update settings for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146895.html">Modify automatic update settings for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceAutoUpgradeMinorVersion  ModifyDBInstanceAutoUpgradeMinorVersionRequest
     * @return ModifyDBInstanceAutoUpgradeMinorVersionResponse
     */
    CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * <li>SQL Server<blockquote>
     * <p> The configuration items that are supported are pgbouncer and clear_errorlog. For more information, see <a href="https://help.aliyun.com/document_detail/2398301.html">PgBouncer of ApsaraDB RDS for PostgreSQL instances</a> and <a href="https://help.aliyun.com/document_detail/95645.html">Error log cleanup of ApsaraDB RDS for SQL Server instances</a>.</p>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96163.html">Change the endpoint and port number of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96788.html">Change the endpoint and port number of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95740.html">Change the endpoint and port number of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97157.html">Change the endpoint and port number of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96056.html">Configure a data replication latency for a read-only ApsaraDB RDS for MySQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDelayedReplicationTime  ModifyDBInstanceDelayedReplicationTimeRequest
     * @return ModifyDBInstanceDelayedReplicationTimeResponse
     */
    CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> modifyDBInstanceDelayedReplicationTime(ModifyDBInstanceDelayedReplicationTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/414512.html">Enable and disable instance release protection for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/471512.html">Enable and disable instance release protection for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/416209.html">Enable and disable instance release protection for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/414512.html">Enable and disable release protection for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDeletionProtection  ModifyDBInstanceDeletionProtectionRequest
     * @return ModifyDBInstanceDeletionProtectionResponse
     */
    CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> modifyDBInstanceDeletionProtection(ModifyDBInstanceDeletionProtectionRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * 
     * @param request the request parameters of ModifyDBInstanceEndpoint  ModifyDBInstanceEndpointRequest
     * @return ModifyDBInstanceEndpointResponse
     */
    CompletableFuture<ModifyDBInstanceEndpointResponse> modifyDBInstanceEndpoint(ModifyDBInstanceEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You can modify the following information about the endpoint of an instance: the public and internal endpoints, the public and internal ports, and the virtual private cloud (VPC), vSwitch, and IP address of the internal endpoint.</li>
     * <li>The VPC and vSwitch must be modified at the same time. If you specify the VPC, vSwitch, and IP address of the internal endpoint, you do not need to specify the endpoint and port. If you specify the endpoint and port, you do not need to specify the VPC, vSwitch, and IP address of the internal endpoint.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceEndpointAddress  ModifyDBInstanceEndpointAddressRequest
     * @return ModifyDBInstanceEndpointAddressResponse
     */
    CompletableFuture<ModifyDBInstanceEndpointAddressResponse> modifyDBInstanceEndpointAddress(ModifyDBInstanceEndpointAddressRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceHAConfig  ModifyDBInstanceHAConfigRequest
     * @return ModifyDBInstanceHAConfigResponse
     */
    CompletableFuture<ModifyDBInstanceHAConfigResponse> modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96052.html">Set a maintenance window for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96799.html">Set a maintenance window for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95657.html">Set a maintenance window for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97473.html">Set a maintenance window for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/299200.html">View the Enhanced Monitoring metrics</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBInstanceMetrics  ModifyDBInstanceMetricsRequest
     * @return ModifyDBInstanceMetricsResponse
     */
    CompletableFuture<ModifyDBInstanceMetricsResponse> modifyDBInstanceMetrics(ModifyDBInstanceMetricsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>If you use the Every 5 Seconds monitoring frequency, you are charged additional fees. Before you call this operation, make sure that you understand the <a href="https://help.aliyun.com/document_detail/45020.html">billing methods and pricing</a> of ApsaraDB RDS.</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96112.html">Configure the monitoring frequency for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95710.html">Configure the monitoring frequency for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceMonitor  ModifyDBInstanceMonitorRequest
     * @return ModifyDBInstanceMonitorResponse
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96110.html">Configure the hybrid access solution for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95708.html">Configure the hybrid access solution for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkExpireTime  ModifyDBInstanceNetworkExpireTimeRequest
     * @return ModifyDBInstanceNetworkExpireTimeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the following topics:</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96120.html">Use the SSL encryption feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/229517.html">Use the SSL encryption feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95715.html">Use the SSL encryption feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of ModifyDBInstanceSecurityGroupRule  ModifyDBInstanceSecurityGroupRuleRequest
     * @return ModifyDBInstanceSecurityGroupRuleResponse
     */
    CompletableFuture<ModifyDBInstanceSecurityGroupRuleResponse> modifyDBInstanceSecurityGroupRule(ModifyDBInstanceSecurityGroupRuleRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96061.html">Change the specifications of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96750.html">Change the specifications of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95665.html">Change the specifications of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97129.html">Change the specifications of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSpec  ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96121.html">Configure TDE for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/465652.html">Configure TDE for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95716.html">Configure TDE for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceTDE  ModifyDBInstanceTDERequest
     * @return ModifyDBInstanceTDEResponse
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2627998.html">Change instance specifications</a></p>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the related topics.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBNode  ModifyDBNodeRequest
     * @return ModifyDBNodeResponse
     */
    CompletableFuture<ModifyDBNodeResponse> modifyDBNode(ModifyDBNodeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL<blockquote>
     * <p> Starting October 17, 2023, ApsaraDB RDS for MySQL instances that run RDS Cluster Edition offer one free-of-charge dedicated database proxy for each unit in phases. For more information, see <a href="~~2555466~~">[Special offers/Price changes] One dedicated proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/197456.html">Enable the database proxy feature of ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418272.html">Enable the database proxy feature of ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxy  ModifyDBProxyRequest
     * @return ModifyDBProxyResponse
     */
    CompletableFuture<ModifyDBProxyResponse> modifyDBProxy(ModifyDBProxyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2621331.html">Configure the connection settings for a database proxy endpoint for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418273.html">Configure the connection settings for a database proxy endpoint for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyEndpoint  ModifyDBProxyEndpointRequest
     * @return ModifyDBProxyEndpointResponse
     */
    CompletableFuture<ModifyDBProxyEndpointResponse> modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Configure the database proxy endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Configure the database proxy endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyEndpointAddress  ModifyDBProxyEndpointAddressRequest
     * @return ModifyDBProxyEndpointAddressResponse
     */
    CompletableFuture<ModifyDBProxyEndpointAddressResponse> modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL<blockquote>
     * <p> Starting October 17, 2023, ApsaraDB RDS for MySQL instances that run RDS Cluster Edition offer one free-of-charge dedicated database proxy for each unit in phases. For more information, see <a href="~~2555466~~">[Special offers/Price changes] One dedicated proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition</a>.</p>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/124321.html">Configure a distributed transaction whitelist</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDTCSecurityIpHostsForSQLServer  ModifyDTCSecurityIpHostsForSQLServerRequest
     * @return ModifyDTCSecurityIpHostsForSQLServerResponse
     */
    CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/173826.html">Configure automatic storage expansion for ApsaraDB RDS for MySQL</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/432496.html">Configure automatic storage expansion for ApsaraDB RDS for PostgreSQL</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDasInstanceConfig  ModifyDasInstanceConfigRequest
     * @return ModifyDasInstanceConfigResponse
     */
    CompletableFuture<ModifyDasInstanceConfigResponse> modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can call this operation to modify the database properties of an ApsaraDB RDS for SQL Server instance and archive data from an instance that uses cloud disks to an Object Storage Service (OSS) bucket. Before you call this operation to archive data to an OSS bucket, you must enable the data archiving feature in the ApsaraDB RDS console. For more information, see <a href="https://help.aliyun.com/document_detail/2401398.html">Modify database properties</a> and <a href="https://help.aliyun.com/document_detail/2767189.html">Archive cloud disk data to an OSS bucket</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDatabaseConfig  ModifyDatabaseConfigRequest
     * @return ModifyDatabaseConfigResponse
     */
    CompletableFuture<ModifyDatabaseConfigResponse> modifyDatabaseConfig(ModifyDatabaseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
     * <a href="https://help.aliyun.com/document_detail/188164.html">Configure SSL encryption for a proxy endpoint</a></p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/207467.html">What is availability check?</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyHADiagnoseConfig  ModifyHADiagnoseConfigRequest
     * @return ModifyHADiagnoseConfigResponse
     */
    CompletableFuture<ModifyHADiagnoseConfigResponse> modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96054.html">Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96747.html">Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95659.html">Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97127.html">Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyHASwitchConfig  ModifyHASwitchConfigRequest
     * @return ModifyHASwitchConfigResponse
     */
    CompletableFuture<ModifyHASwitchConfigResponse> modifyHASwitchConfig(ModifyHASwitchConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Notice: Fees are generated if the call is successful. Before you call this operation, carefully read the following topics:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96049.html">Use the auto-renewal feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96740.html">Use the auto-renewal feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95635.html">Use the auto-renewal feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97121.html">Use the auto-renewal feature for an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/206671.html">Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/187923.html">Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceCrossBackupPolicy  ModifyInstanceCrossBackupPolicyRequest
     * @return ModifyInstanceCrossBackupPolicyResponse
     */
    CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyMaskingRules  ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/349288.html">Connect an ApsaraDB RDS for PostgreSQL instance to a self-managed AD domain</a></li>
     * <li><a href="https://www.postgresql.org/docs/11/auth-pg-hba-conf.html">The pg_hba.conf File</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPGHbaConfig  ModifyPGHbaConfigRequest
     * @return ModifyPGHbaConfigResponse
     */
    CompletableFuture<ModifyPGHbaConfigResponse> modifyPGHbaConfig(ModifyPGHbaConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96063.html">Modify the parameters of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96751.html">Modify the parameters of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95667.html">Modify the parameters of an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97130.html">Modify the parameters of an ApsaraDB RDS for MariaDB instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameter  ModifyParameterRequest
     * @return ModifyParameterResponse
     */
    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/130565.html">Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/457176.html">Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameterGroup  ModifyParameterGroupRequest
     * @return ModifyParameterGroupResponse
     */
    CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the billing methods, pricing, and refund rules of RDS Custom.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot change the instance type of an expired instance. You can renew the instance and try again.</li>
     * <li>When you downgrade the instance type of an instance, take note of the following items:<ul>
     * <li>The instance must be in the Stopped state.</li>
     * <li>The price difference is refunded to the payment account you used. Vouchers that have been redeemed are not refundable.</li>
     * </ul>
     * </li>
     * <li>The operation is asynchronous. Wait 5 to 10 seconds for the instance type change to complete. Then, restart the instance by calling the RebootInstance operation or by using the console for the instance type change to take effect. If you restart only the operating system of the instance, the instance type change does not take effect. If the instance is in the Stopped state, you need only to start the instance. You do not need to restart the instance after it enters the Running state.</li>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.</li>
     * <li>The read/write splitting feature is enabled for your ApsaraDB RDS for MySQL instance.</li>
     * <li>The instance must run one of the following database engine versions and RDS editions:<ul>
     * <li>MySQL 5.7 on RDS High-availability Edition with local disks</li>
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
     * <h3>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/96056.html">Set the data replication latency of a read-only ApsaraDB RDS for MySQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyReadonlyInstanceDelayReplicationTime  ModifyReadonlyInstanceDelayReplicationTimeRequest
     * @return ModifyReadonlyInstanceDelayReplicationTimeResponse
     */
    CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/94487.html">Transfer resources across resource groups</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server<blockquote>
     * <p> If DAS Enterprise Edition is supported in the region in which the instance resides, the most recent version of DAS Enterprise Edition is enabled when you call the operation to enable the SQL Audit feature for the instance. For more information about the database engines and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Supported databases and regions</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/476574.html">Use the SQL Explorer and Audit feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96766.html">Use the SQL Audit feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95712.html">Use the SQL Audit feature for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifySQLCollectorPolicy  ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * <h3>Precautions</h3>
     * <p>After you shorten the log backup retention period, log backup files that are stored longer than the specified log backup retention period are immediately deleted.</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/476574.html">Use the SQL Explorer and Audit feature</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySQLCollectorRetention  ModifySQLCollectorRetentionRequest
     * @return ModifySQLCollectorRetentionResponse
     */
    CompletableFuture<ModifySQLCollectorRetentionResponse> modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP address whitelist for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/43187.html">Configure an IP address whitelist for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/43186.html">Configure an IP address whitelist for an ApsaraDB RDS for SQL Server instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/90336.html">Configure an IP address whitelist for an ApsaraDB RDS for MariaDB instance</a></li>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>Description</h3>
     * <p>The system automatically uploads log backup files to Object Storage Service (OSS) buckets. If the remaining storage of an instance is insufficient, you can call this operation to upload the log backup files of the instance to OSS buckets. After the upload is complete, the system deletes these files from the instance to release storage. This operation is called to upload log backup files from an instance to OSS buckets and then delete these files from the instance. If the instance runs SQL Server, transaction log backup files are compressed before they are uploaded.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>When you upload log backup files, the data restoration feature is not affected.</li>
     * <li>This operation is called to release storage. The backup storage usage is not reduced.</li>
     * <li>The OSS buckets to which log backup files are uploaded are provided by the system. You do not need to purchase these OSS buckets. In addition, you cannot access these OSS buckets.</li>
     * </ul>
     * 
     * @param request the request parameters of PurgeDBInstanceLog  PurgeDBInstanceLogRequest
     * @return PurgeDBInstanceLogResponse
     */
    CompletableFuture<PurgeDBInstanceLogResponse> purgeDBInstanceLog(PurgeDBInstanceLogRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>Feature description</h3>
     * <p>The notifications are highlighted at the top of the ApsaraDB RDS console. The notifications include renewal reminders and reminders of instance creation failures.
     * After you call this operation to query notifications, you can call the <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> operation to mark the notifications as confirmed, which means that you understand the content of the notifications.</p>
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
     * @param request the request parameters of RebootRCInstance  RebootRCInstanceRequest
     * @return RebootRCInstanceResponse
     */
    CompletableFuture<RebootRCInstanceResponse> rebootRCInstance(RebootRCInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of RebuildDBInstance  RebuildDBInstanceRequest
     * @return RebuildDBInstanceResponse
     */
    CompletableFuture<RebuildDBInstanceResponse> rebuildDBInstance(RebuildDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of RebuildReplicationLink  RebuildReplicationLinkRequest
     * @return RebuildReplicationLinkResponse
     */
    CompletableFuture<RebuildReplicationLinkResponse> rebuildReplicationLink(RebuildReplicationLinkRequest request);

    /**
     * <b>description</b> :
     * <p>The operation is phased out.</p>
     * 
     * @param request the request parameters of ReceiveDBInstance  ReceiveDBInstanceRequest
     * @return ReceiveDBInstanceResponse
     */
    CompletableFuture<ReceiveDBInstanceResponse> receiveDBInstance(ReceiveDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>SQL Server 2012 or later</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/95722.html">Restore the data of an ApsaraDB RDS for SQL Server instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of RecoveryDBInstance  RecoveryDBInstanceRequest
     * @return RecoveryDBInstanceResponse
     */
    CompletableFuture<RecoveryDBInstanceResponse> recoveryDBInstance(RecoveryDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.</li>
     * <li>The read/write splitting feature is enabled for the instance.</li>
     * <li>The instance must run one of the following database engine versions and RDS editions:<ul>
     * <li>MySQL 5.7 on RDS High-availability Edition (with local disks)</li>
     * <li>MySQL 5.6</li>
     * <li>SQL Server on RDS Cluster Edition</li>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>A maximum of 10 tags can be removed in a single request.</li>
     * <li>If a tag is removed from all instances to which the tag is added, the tag is automatically deleted.</li>
     * <li>If you specify only TagKey, all tags that match the TagKey condition are removed.</li>
     * <li>You must specify at least TagKey or a pair of TagKey and TagValue.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveTagsFromResource  RemoveTagsFromResourceRequest
     * @return RemoveTagsFromResourceResponse
     */
    CompletableFuture<RemoveTagsFromResourceResponse> removeTagsFromResource(RemoveTagsFromResourceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the following topics:</p>
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
     * @param request the request parameters of ReplaceRCInstanceSystemDisk  ReplaceRCInstanceSystemDiskRequest
     * @return ReplaceRCInstanceSystemDiskResponse
     */
    CompletableFuture<ReplaceRCInstanceSystemDiskResponse> replaceRCInstanceSystemDisk(ReplaceRCInstanceSystemDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/140724.html">Reset of the permissions of privileged accounts</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccount  ResetAccountRequest
     * @return ResetAccountResponse
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * @param request the request parameters of ResizeRCInstanceDisk  ResizeRCInstanceDiskRequest
     * @return ResizeRCInstanceDiskResponse
     */
    CompletableFuture<ResizeRCInstanceDiskResponse> resizeRCInstanceDisk(ResizeRCInstanceDiskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <p> Before restoration, you can call the CheckCreateDdrDBInstance operation to check whether a cross-region backup set can be used for cross-region restoration.</p>
     * </blockquote>
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/120824.html">Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/120875.html">Restore the data of an ApsaraDB RDS for MySQL instance across regions</a></li>
     * </ul>
     * 
     * @param request the request parameters of RestoreDdrTable  RestoreDdrTableRequest
     * @return RestoreDdrTableResponse
     */
    CompletableFuture<RestoreDdrTableResponse> restoreDdrTable(RestoreDdrTableRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/103175.html">Restore individual databases and tables</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of RestoreTable  RestoreTableRequest
     * @return RestoreTableResponse
     */
    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The database is in the Running state.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>The permissions that can be revoked include SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, and TRIGGER.</li>
     * <li>This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition and run PostgreSQL.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeAccountPrivilege  RevokeAccountPrivilegeRequest
     * @return RevokeAccountPrivilegeResponse
     */
    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
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
     * <b>description</b> :
     * <p>  Before you create RDS Custom instances, you must submit a ticket to add your Alibaba Cloud account to a whitelist.</p>
     * <ul>
     * <li>You can create only subscription RDS Custom instances.</li>
     * <li>Subscription RDS Custom instances are supported in the China (Shanghai), China (Shenzhen), China (Beijing), and China (Hangzhou) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of RunRCInstances  RunRCInstancesRequest
     * @return RunRCInstancesResponse
     */
    CompletableFuture<RunRCInstancesResponse> runRCInstances(RunRCInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/462504.html">Start an ApsaraDB RDS for SQL instance</a></p>
     * </blockquote>
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
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     *   <a href="https://help.aliyun.com/document_detail/462504.html">Suspend an ApsaraDB RDS for SQL Server instance</a></p>
     * </blockquote>
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
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96054.html">Switch workloads between primary and secondary ApsaraDB RDS for MySQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96747.html">Switch workloads between primary and secondary ApsaraDB RDS for PostgreSQL instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95659.html">Switch workloads between primary and secondary ApsaraDB RDS for SQL Server instances</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97127.html">Switch workloads between primary and secondary ApsaraDB RDS for MariaDB instances</a></li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceHA  SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The instance is connected by using its internal or public endpoint.</li>
     * <li>The instance is in the Running state.</li>
     * <li>The number of times that you have switched the instance between its internal and public endpoints within the last 24 hours does not reach 20.</li>
     * <li>The instance resides in the classic network.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>After the endpoint that is used to connect to the instance is changed, you must update the endpoint information in the code of your application and restart the application.</p>
     * 
     * @param request the request parameters of SwitchDBInstanceNetType  SwitchDBInstanceNetTypeRequest
     * @return SwitchDBInstanceNetTypeResponse
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/137567.html">Change the VPC and vSwitch for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146885.html">Change the vSwitch for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/347675.html">Change the VPC and vSwitch for an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceVpc  SwitchDBInstanceVpcRequest
     * @return SwitchDBInstanceVpcResponse
     */
    CompletableFuture<SwitchDBInstanceVpcResponse> switchDBInstanceVpc(SwitchDBInstanceVpcRequest request);

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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
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
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of TerminateMigrateTask  TerminateMigrateTaskRequest
     * @return TerminateMigrateTaskResponse
     */
    CompletableFuture<TerminateMigrateTaskResponse> terminateMigrateTask(TerminateMigrateTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Fees are generated if the call is successful. Before you call this operation, you must read the following documentation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96048.html">Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription</a> or <a href="https://help.aliyun.com/document_detail/161875.html">Change the billing method of an ApsaraDB RDS for MySQL instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96743.html">Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription</a> or <a href="https://help.aliyun.com/document_detail/162756.html">Change the billing method of an ApsaraDB RDS for PostgreSQL instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/95631.html">Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription</a> or <a href="https://help.aliyun.com/document_detail/162755.html">Change the billing method of an ApsaraDB RDS for SQL Server instance from subscription to pay-as-you-go</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/97120.html">Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription</a> or <a href="https://help.aliyun.com/document_detail/169252.html">Change the billing method of an ApsaraDB RDS for MariaDB instance from subscription to pay-as-you-go</a></li>
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
     * <h3>Supported database engine</h3>
     * <p>PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/147649.html">Lock an account of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UnlockAccount  UnlockAccountRequest
     * @return UnlockAccountResponse
     */
    CompletableFuture<UnlockAccountResponse> unlockAccount(UnlockAccountRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * <li>MariaDB</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You can remove up to 20 tags at a time.</li>
     * <li>If a tag is removed from an instance and is not added to other instances, the tag is automatically deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePostgresExtensions  UpdatePostgresExtensionsRequest
     * @return UpdatePostgresExtensionsResponse
     */
    CompletableFuture<UpdatePostgresExtensionsResponse> updatePostgresExtensions(UpdatePostgresExtensionsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * <h3>References</h3>
     * <p>A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/251779.html">Migrate the data of a self-managed MySQL 5.7 or MySQL 8.0 instance to an ApsaraDB RDS for MySQL instance</a>.</p>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateUserBackupFile  UpdateUserBackupFileRequest
     * @return UpdateUserBackupFileResponse
     */
    CompletableFuture<UpdateUserBackupFileResponse> updateUserBackupFile(UpdateUserBackupFileRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>MySQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/96058.html">Upgrade the major engine version of an ApsaraDB RDS for MySQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * <li>SQL Server</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/96059.html">Update the minor engine version of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/213582.html">Update the minor engine version of an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeDBInstanceKernelVersion  UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>PostgreSQL</p>
     * <h3>References</h3>
     * <p>Fees are generated if the call is successful. Before you call this operation, read the following documentation and make sure that you fully understand the billing rules, prerequisites, and impacts of this operation.
     * <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * 
     * @param request the request parameters of UpgradeDBInstanceMajorVersion  UpgradeDBInstanceMajorVersionRequest
     * @return UpgradeDBInstanceMajorVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionResponse> upgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>PostgreSQL</p>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceMajorVersionPrecheck  UpgradeDBInstanceMajorVersionPrecheckRequest
     * @return UpgradeDBInstanceMajorVersionPrecheckResponse
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> upgradeDBInstanceMajorVersionPrecheck(UpgradeDBInstanceMajorVersionPrecheckRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/197465.html">Upgrade the database proxy version of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418469.html">Upgrade the database proxy version of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeDBProxyInstanceKernelVersion  UpgradeDBProxyInstanceKernelVersionRequest
     * @return UpgradeDBProxyInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request);

}
