// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.rds20140815.models.*;
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
        this.product = "Rds";
        this.version = "2014-08-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rds.aliyuncs.com"),
            new TeaPair("cn-heyuan", "rds.aliyuncs.com"),
            new TeaPair("cn-hongkong", "rds.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "rds.aliyuncs.com"),
            new TeaPair("us-west-1", "rds.aliyuncs.com"),
            new TeaPair("us-east-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "rds.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "rds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "rds.aliyuncs.com"),
            new TeaPair("cn-fujian", "rds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "rds-vpc.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "rds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "rds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "rds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "rds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "rds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "rds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "rds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "rds.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "rds.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "rds.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cloud migration feature](~~365562~~)
      *
     */
    @Override
    public CompletableFuture<ActivateMigrationTargetInstanceResponse> activateMigrationTargetInstance(ActivateMigrationTargetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateMigrationTargetInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateMigrationTargetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateMigrationTargetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   Each tag consists of a tag key and a tag value. The tag key is required, and the tag value is optional.
      * *   The tag key and tag value cannot start with aliyun.
      * *   The tag key and tag value are not case-sensitive.
      * *   The maximum length of a tag key is 64 characters, and the maximum length of a tag value is 128 characters.
      * *   A maximum of 10 tags can be added to each instance. Each tag that is added to the same instance must have a unique tag key. If you add a new tag to the instance and the key of the new tag is the same as that of an existing tag, the new tag overwrites the existing tag.
      *
     */
    @Override
    public CompletableFuture<AddTagsToResourceResponse> addTagsToResource(AddTagsToResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTagsToResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagsToResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagsToResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Apply for a public endpoint for an ApsaraDB RDS for MySQL instance](~~26128~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for PostgreSQL instance](~~97738~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for SQL Server instance](~~97736~~)
      * *   [Apply for a public endpoint for an ApsaraDB RDS for MariaDB instance](~~97740~~)
      *
     */
    @Override
    public CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateInstancePublicConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateInstancePublicConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateInstancePublicConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Feature description
      * If read-only instances are attached to a primary ApsaraDB RDS for SQL Server instance, you can call this operation to apply for a unified read-only routing endpoint for the primary instance. After you apply for a read-only routing endpoint for a primary instance, the existing endpoints of the primary instance and its read-only instances remain valid. In addition, you can still apply for internal and public endpoints.
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The instance is in the Running state.
      * *   Read-only instances are attached to the primary instance.
      * *   The instance does not have an ongoing Data Transmission Service (DTS) migration task.
      * *   The instance runs one of the following database versions and RDS editions:
      *     *   SQL Server on RDS Cluster Edition
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *
     */
    @Override
    public CompletableFuture<AllocateReadWriteSplittingConnectionResponse> allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateReadWriteSplittingConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateReadWriteSplittingConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateReadWriteSplittingConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<AttachWhitelistTemplateToInstanceResponse> attachWhitelistTemplateToInstance(AttachWhitelistTemplateToInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachWhitelistTemplateToInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachWhitelistTemplateToInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachWhitelistTemplateToInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Feature description
      * When the [read/write splitting](~~51073~~) feature is enabled, this operation is used to calculate system-assigned read weights. For more information about custom read weights, see [DescribeDBInstanceNetInfo](~~610423~~).
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   If the instance runs MySQL, the instance uses a shared proxy.
      * *   The instance runs one of the following MySQL versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    @Override
    public CompletableFuture<CalculateDBInstanceWeightResponse> calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CalculateDBInstanceWeight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CalculateDBInstanceWeightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CalculateDBInstanceWeightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      * ### [](#)Supported database engines
      * *   RDS SQL Server
      * ### [](#)Description
      * This operation is supported for instances that run SQL Server and belong to the dedicated or dedicated host instance family. For more information about how to start a migration task, see [ImportDatabaseBetweenInstances](~~610592~~).
      * ### [](#)Usage notes
      * This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    @Override
    public CompletableFuture<CancelImportResponse> cancelImport(CancelImportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelImport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelImportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelImportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<CheckAccountNameAvailableResponse> checkAccountNameAvailable(CheckAccountNameAvailableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckAccountNameAvailable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAccountNameAvailableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAccountNameAvailableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCloudResourceAuthorized").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCloudResourceAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCloudResourceAuthorizedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * >  If your ApsaraDB RDS for PostgreSQL instance uses the new architecture and is created after October 10, 2022, this feature is not supported for the RDS instance. For more information, see [\\[Notice\\] SLR authorization is required to create an ApsaraDB RDS for PostgreSQL instance from October 10, 2022](~~452313~~).
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~) and [Restore the data of an ApsaraDB RDS for MySQL instance across regions](~~120875~~)
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for PostgreSQL instance](~~206671~~) and [Restore the data of an ApsaraDB RDS for PostgreSQL across regions](~~206662~~)
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for SQL Server instance](~~187923~~) and [Restore the data of an ApsaraDB RDS for SQL Server across regions](~~187924~~)
      *
     */
    @Override
    public CompletableFuture<CheckCreateDdrDBInstanceResponse> checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCreateDdrDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCreateDdrDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCreateDdrDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<CheckDBNameAvailableResponse> checkDBNameAvailable(CheckDBNameAvailableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDBNameAvailable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDBNameAvailableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDBNameAvailableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CheckInstanceExistResponse> checkInstanceExist(CheckInstanceExistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckInstanceExist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceExistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceExistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    @Override
    public CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Restore data of an ApsaraDB RDS for MySQL instance](~~96147~~)
      * *   [Restore data of an ApsaraDB RDS for PostgreSQL instance](~~96776~~)
      * *   [Restore data of an ApsaraDB RDS for SQL Server instance](~~95722~~)
      * *   [Restore data of an ApsaraDB RDS for MariaDB instance](~~97151~~)
      *
     */
    @Override
    public CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloneDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<CloneParameterGroupResponse> cloneParameterGroup(CloneParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloneParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Feature description
      * After you call the [QueryNotify](~~610443~~) operation to query notifications for an instance, you can call this operation to mark the notifications as confirmed.
      *
     */
    @Override
    public CompletableFuture<ConfirmNotifyResponse> confirmNotify(ConfirmNotifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmNotify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmNotifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmNotifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<CopyDatabaseResponse> copyDatabase(CopyDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS SQL Server
      * ### References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Replicate databases between ApsaraDB RDS for SQL Server instances](~~95702~~)
      *
     */
    @Override
    public CompletableFuture<CopyDatabaseBetweenInstancesResponse> copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyDatabaseBetweenInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyDatabaseBetweenInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyDatabaseBetweenInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create an account on an ApsaraDB RDS for MySQL instance](~~96089~~)
      * *   [Create an account on an ApsaraDB RDS for PostgreSQL instance](~~96753~~)
      * *   [Create an account on an ApsaraDB RDS for SQL Server instance](~~95810~~)
      * *   [Create an account on an ApsaraDB RDS for MariaDB instance](~~97132~~)
      *
     */
    @Override
    public CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * This operation uses the backup feature of ApsaraDB RDS to create a backup set. You can also use an operation of Database Backup (DBS) to create a backup set. For more information, see [List of operations by function of DBS](~~437245~~).
      * ### [](#)Precautions
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance does not have ongoing backup tasks.
      * *   The number of backup files that are created per day for an instance cannot exceed 20.
      * ### [](#)References
      * *   [Use the data backup feature for an ApsaraDB RDS for MySQL instance](~~378074~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for PostgreSQL instance](~~96772~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for SQL Server instance](~~95717~~)
      * *   [Use the data backup feature for an ApsaraDB RDS for MariaDB instance](~~97147~~)
      *
     */
    @Override
    public CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cloud migration feature](~~365562~~)
      *
     */
    @Override
    public CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> createCloudMigrationPrecheckTask(CreateCloudMigrationPrecheckTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudMigrationPrecheckTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudMigrationPrecheckTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cloud migration feature](~~365562~~)
      *
     */
    @Override
    public CompletableFuture<CreateCloudMigrationTaskResponse> createCloudMigrationTask(CreateCloudMigrationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudMigrationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudMigrationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudMigrationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Create an ApsaraDB RDS for MySQL instance](~~148036~~)
      * *   [Create a serverless ApsaraDB RDS for MySQL instance](~~412231~~)
      * *   [Create an ApsaraDB RDS for PostgreSQL instance](~~148038~~)
      * *   [Create a serverless ApsaraDB RDS for PostgreSQL instance](~~607753~~)
      * *   [Enable Babelfish for an ApsaraDB RDS for PostgreSQL instance](~~428615~~)
      * *   [Create an ApsaraDB RDS for SQL Server instance](~~148037~~)
      * *   [Create a serverless ApsaraDB RDS for SQL Server instance](~~603465~~)
      * *   [Create an ApsaraDB RDS for MariaDB instance](~~148040~~)
      *
     */
    @Override
    public CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * [Add a read-only endpoint for a cluster](~~464132~~)
      *
     */
    @Override
    public CompletableFuture<CreateDBInstanceEndpointResponse> createDBInstanceEndpoint(CreateDBInstanceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstanceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### Precautions
      * *   You can create a public endpoint of an endpoint type only when no public endpoint is created for this endpoint type.
      * *   The node weights and other configurations are the same as those of the internal endpoint of this endpoint type. Only one public endpoint and one internal endpoint can be created for each endpoint type.
      *
     */
    @Override
    public CompletableFuture<CreateDBInstanceEndpointAddressResponse> createDBInstanceEndpointAddress(CreateDBInstanceEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstanceEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Manage ApsaraDB RDS for MySQL instances in the recycle bin](~~96065~~)
      * *   [Manage ApsaraDB RDS for PostgreSQL instances in the recycle bin](~~96752~~)
      * *   [Manage ApsaraDB RDS for SQL Server instances in the recycle bin](~~95669~~)
      * *   [Manage ApsaraDB RDS for MariaDB instances in the recycle bin](~~97131~~)
      *
     */
    @Override
    public CompletableFuture<CreateDBInstanceForRebuildResponse> createDBInstanceForRebuild(CreateDBInstanceForRebuildRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstanceForRebuild").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceForRebuildResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceForRebuildResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * MySQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Add a node to an ApsaraDB RDS for MySQL cluster](~~464129~~)
      *
     */
    @Override
    public CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    @Override
    public CompletableFuture<CreateDBProxyEndpointAddressResponse> createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBProxyEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBProxyEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBProxyEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create a database in an ApsaraDB RDS for MySQL instance](~~96105~~)
      * *   [Create a database in an ApsaraDB RDS for PostgreSQL instance](~~96758~~)
      * *   [Create a database in an ApsaraDB RDS for SQL Server instance](~~95698~~)
      * *   [Create a database in an ApsaraDB RDS for MariaDB instance](~~97136~~)
      *
     */
    @Override
    public CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  Before restoration, you can call the [CheckCreateDdrDBInstance](~~121721~~) operation to check whether a cross-region backup set can be used for cross-region restoration.
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    @Override
    public CompletableFuture<CreateDdrInstanceResponse> createDdrInstance(CreateDdrInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDdrInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDdrInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDdrInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation is no longer maintained. You can use the CreateDiagnosticReport operation of Database Autonomy Service (DAS) to create a diagnostic report.
      * After you call this operation to create a diagnostic report, you can call the DescribeDiagnosticReportList operation to download the diagnostic report.
      *
     */
    @Override
    public CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiagnosticReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosticReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosticReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   MySQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Create and release an ApsaraDB RDS global active database cluster](~~328592~~)
      *
     */
    @Override
    public CompletableFuture<CreateGADInstanceResponse> createGADInstance(CreateGADInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGADInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGADInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGADInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Add or remove unit nodes](~~331851~~)
      *
     */
    @Override
    public CompletableFuture<CreateGadInstanceMemberResponse> createGadInstanceMember(CreateGadInstanceMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGadInstanceMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGadInstanceMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGadInstanceMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * SQL Server
      * ### [](#)Limits
      * Data migration across Alibaba Cloud accounts is not supported. For example, backup files in an Object Storage Service (OSS) bucket within Alibaba Cloud Account A cannot be migrated to an ApsaraDB RDS for SQL Server instance within Alibaba Cloud Account B.
      * >  You can migrate backup files from an OSS bucket within Alibaba Cloud Account A to an OSS bucket within Alibaba Cloud Account B. Make sure that the data in the OSS bucket and the RDS instance belong to the same Alibaba Cloud account. Then, you can call this operation to create a migration task. For more information, see [Use Data Online Migration to migrate data between accounts](~~342762~~).
      * ### [](#)References
      * >  Before you call this operation, carefully read the following topic. Make sure that you fully understand the prerequisites, preparations, and impacts for calling this operation.
      * [Migrate data from a self-managed SQL Server instance to an ApsaraDB RDS for SQL Server instance](~~100019~~)
      *
     */
    @Override
    public CompletableFuture<CreateMigrateTaskResponse> createMigrateTask(CreateMigrateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMigrateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMigrateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMigrateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * This operation is used to migrate backup data to the cloud. Before you call this operation, make sure that you understand the descriptions in the following topics:
      * *   [Migrate the full backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2008 R2](~~95737~~)
      * *   [Migrate full backup data of SQL Server 2012, 2014, 2016, 2017, or 2019 databases](~~95738~~)
      * *   [Migrate incremental backup data to ApsaraDB RDS for SQL Server 2012, 2014, 2016, 2017, or 2019](~~95736~~)
      *
     */
    @Override
    public CompletableFuture<CreateOnlineDatabaseTaskResponse> createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOnlineDatabaseTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOnlineDatabaseTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOnlineDatabaseTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Add a node to an ApsaraDB RDS for MySQL cluster](~~464129~~)
      *
     */
    @Override
    public CompletableFuture<CreateOrderForCreateDBNodesResponse> createOrderForCreateDBNodes(CreateOrderForCreateDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrderForCreateDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderForCreateDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderForCreateDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Delete a node from an ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition](~~464130~~)
      *
     */
    @Override
    public CompletableFuture<CreateOrderForDeleteDBNodesResponse> createOrderForDeleteDBNodes(CreateOrderForDeleteDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrderForDeleteDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderForDeleteDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderForDeleteDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      * ### [](#)Precautions
      * Install only the plug-ins that are supported by the major engine version of the instance. Otherwise, the installation fails.
      * *   For more information, see [Extensions supported by ApsaraDB RDS for PostgreSQL](~~142340~~).
      * *   You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the major engine version of an instance.
      *
     */
    @Override
    public CompletableFuture<CreatePostgresExtensionsResponse> createPostgresExtensions(CreatePostgresExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePostgresExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePostgresExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePostgresExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Create a read-only ApsaraDB RDS for MySQL instance](~~56991~~)
      * *   [Create a read-only ApsaraDB RDS for PostgreSQL instance](~~108959~~)
      * *   [Create a read-only ApsaraDB RDS for SQL Server instance](~~99005~~)
      *
     */
    @Override
    public CompletableFuture<CreateReadOnlyDBInstanceResponse> createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateReadOnlyDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateReadOnlyDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateReadOnlyDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      *
     */
    @Override
    public CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Service-linked roles](~~342840~~)
      *
     */
    @Override
    public CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * Your RDS instance runs SQL Server 2008 R2 with local disks.
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Restore the data of an ApsaraDB RDS for SQL Server instance by using a temporary RDS instance](~~95724~~)
      *
     */
    @Override
    public CompletableFuture<CreateTempDBInstanceResponse> createTempDBInstance(CreateTempDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTempDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTempDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTempDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateYouhuiForOrderResponse> createYouhuiForOrder(CreateYouhuiForOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateYouhuiForOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYouhuiForOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYouhuiForOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DeleteADSettingResponse> deleteADSetting(DeleteADSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteADSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteADSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteADSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Delete a database account from an ApsaraDB RDS for MySQL instance](~~96104~~)
      * *   [Delete a database account from an ApsaraDB RDS for PostgreSQL instance](~~147649~~)
      * *   [Delete a database account from an ApsaraDB RDS for SQL Server instance](~~95694~~)
      * *   [Delete a database account from an ApsaraDB RDS for MariaDB instance](~~97135~~)
      *
     */
    @Override
    public CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * > Only instances that run RDS High-availability Edition are supported.
      * ### Description
      * You can call this operation to delete backup sets of the instance itself. Backup sets of the associated instances such as read-only, disaster recovery, and cloned instances are not deleted.
      * ### Precautions
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   If the log backup feature is disabled, instances cannot be restored by point in time. You can delete data backup sets that are retained for more than seven days.
      * *   If the log backup feature is enabled and the log backup retention period is shorter than the data backup retention period, you can delete the data backup files that are retained for a period longer than the log backup retention period.
      *
     */
    @Override
    public CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS SQL Server
      * >  This operation is available only for users that are added to the whitelist.
      *
     */
    @Override
    public CompletableFuture<DeleteBackupFileResponse> deleteBackupFile(DeleteBackupFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackupFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackupFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackupFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Note Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Release an ApsaraDB RDS for MySQL instance](~~96057~~)
      * *   [Release an ApsaraDB RDS for PostgreSQL instance](~~96749~~)
      * *   [Release an ApsaraDB RDS for SQL Server instance](~~95662~~)
      * *   [Release an ApsaraDB RDS for MariaDB instance](~~97128~~)
      *
     */
    @Override
    public CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Delete the read-only endpoint of an ApsaraDB RDS for MySQL cluster](~~464133~~)
      *
     */
    @Override
    public CompletableFuture<DeleteDBInstanceEndpointResponse> deleteDBInstanceEndpoint(DeleteDBInstanceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstanceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### Precautions
      * You can delete only the public endpoint of each endpoint type from the instance. If you want to delete an internal endpoint of any endpoint type, you can delete the type of endpoint.
      *
     */
    @Override
    public CompletableFuture<DeleteDBInstanceEndpointAddressResponse> deleteDBInstanceEndpointAddress(DeleteDBInstanceEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstanceEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Delete a node from an ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition](~~464130~~)
      *
     */
    @Override
    public CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint for an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    @Override
    public CompletableFuture<DeleteDBProxyEndpointAddressResponse> deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBProxyEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBProxyEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBProxyEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### [](#)References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Delete a database from an ApsaraDB RDS for MySQL instance](~~96106~~)
      * *   [Delete a database from an ApsaraDB RDS for PostgreSQL instance](~~96759~~)
      * *   [Delete a database from an ApsaraDB RDS for SQL Server instance](~~95699~~)
      * *   [Delete a database from an ApsaraDB RDS for MariaDB instance](~~97137~~)
      *
     */
    @Override
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [Usage notes](#)
      * *   A global active database cluster cannot be restored after it is deleted. Proceed with caution.
      * *   If you delete a global active database cluster, the system removes all nodes and Data Transmission Service (DTS) synchronization tasks from the cluster. However, the system does not release the ApsaraDB RDS for MySQL instances that run as nodes in the cluster. If you no longer need the ApsaraDB RDS for MySQL instances, you can call the [DeleteDBInstance](~~26229~~) to release the instances one after another.
      *
     */
    @Override
    public CompletableFuture<DeleteGadInstanceResponse> deleteGadInstance(DeleteGadInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGadInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGadInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGadInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    @Override
    public CompletableFuture<DeletePostgresExtensionsResponse> deletePostgresExtensions(DeletePostgresExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePostgresExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePostgresExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePostgresExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   PostgreSQL
      * ### [](#)Precautions
      * You can delete a replication slot only when the status of the slot is **INACTIVE**. You can call the DescribeSlots operation to query the status of a replication slot.
      *
     */
    @Override
    public CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSlot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSlotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSlotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   MySQL
      * ### [](#)Usage notes
      * *   A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   This operation deletes full backup files only from the ApsaraDB RDS console. This operation does not affect the full backup files that are stored as objects in Object Storage Service (OSS) buckets. After you call this operation to delete a full backup file, you can call the ImportUserBackupFile operation to reimport the full backup file.
      *
     */
    @Override
    public CompletableFuture<DeleteUserBackupFileResponse> deleteUserBackupFile(DeleteUserBackupFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUserBackupFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserBackupFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserBackupFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      *
     */
    @Override
    public CompletableFuture<DescibeImportsFromDatabaseResponse> descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescibeImportsFromDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescibeImportsFromDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescibeImportsFromDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeADInfoResponse> describeADInfo(DescribeADInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeADInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeADInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeADInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeActionEventPolicyResponse> describeActionEventPolicy(DescribeActionEventPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActionEventPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActionEventPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActionEventPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeAllWhitelistTemplateResponse> describeAllWhitelistTemplate(DescribeAllWhitelistTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAllWhitelistTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAllWhitelistTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAllWhitelistTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * [Create and view an analytic instance](~~155180~~)
      *
     */
    @Override
    public CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> describeAnalyticdbByPrimaryDBInstance(DescribeAnalyticdbByPrimaryDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAnalyticdbByPrimaryDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAnalyticdbByPrimaryDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableClassesResponse> describeAvailableClasses(DescribeAvailableClassesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableClasses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableClassesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableClassesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableCrossRegionResponse> describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableCrossRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableCrossRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableCrossRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableMetricsResponse> describeAvailableMetrics(DescribeAvailableMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  To view the time range within which you can restore data from a standard backup set, see DescribeBackups.
      * ### [](#)Supported database engines
      * ApsaraDB RDS for MySQL instances with local disks
      * ### [](#)References
      * >  Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the cross-region backup feature](~~120824~~)
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableRecoveryTimeResponse> describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableRecoveryTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableRecoveryTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableRecoveryTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeBackupDatabaseResponse> describeBackupDatabase(DescribeBackupDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackupTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   MariaDB
      * ### Usage notes
      * *   If the return value of the **DownloadLink** parameter is NULL, ApsaraDB RDS does not provide a download URL.
      * *   If the return value of the **DownloadLink** parameter is not NULL, ApsaraDB RDS provides a URL for you to download backup files. The expiration time of the URL is specified by the **LinkExpiredTime** parameter. You must download the backup files before the expiration time.
      * *   If you use a RAM user to download backup files, you must grant permissions to the RAM user. For more information, see [Grant backup file download permissions to a RAM user with read-only permissions](~~100043~~).
      * *   Each log file that is returned by this operation contains the log entries that are generated over the time range that is specified by the StartTime and EndTime parameters.
      *
     */
    @Override
    public CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBinlogFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBinlogFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBinlogFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCharacterSetName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCharacterSetNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCharacterSetNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeClassDetailsResponse> describeClassDetails(DescribeClassDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClassDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClassDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClassDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeCloudMigrationPrecheckResultResponse> describeCloudMigrationPrecheckResult(DescribeCloudMigrationPrecheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudMigrationPrecheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudMigrationPrecheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudMigrationPrecheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeCloudMigrationResultResponse> describeCloudMigrationResult(DescribeCloudMigrationResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudMigrationResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudMigrationResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudMigrationResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeCollationTimeZonesResponse> describeCollationTimeZones(DescribeCollationTimeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCollationTimeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCollationTimeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCollationTimeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ApsaraDB RDS for MySQL instances support cross-region backup and restoration. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~) and [Restore the data of an ApsaraDB RDS for MySQL instance across regions](~~120875~~).
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    @Override
    public CompletableFuture<DescribeCrossBackupMetaListResponse> describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCrossBackupMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCrossBackupMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCrossBackupMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    @Override
    public CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCrossRegionBackupDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCrossRegionBackupDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   ApsaraDB RDS for MySQL instances with local disks
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * ### [](#)References
      * >  Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * >  For more information about how to query cross-region log backup files, see DescribeCrossRegionLogBackupFiles.
      *
     */
    @Override
    public CompletableFuture<DescribeCrossRegionBackupsResponse> describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCrossRegionBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCrossRegionBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCrossRegionBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * >  For more information about how to query cross-region data backup files, see [DescribeCrossRegionBackups](~~121733~~).
      *
     */
    @Override
    public CompletableFuture<DescribeCrossRegionLogBackupFilesResponse> describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCrossRegionLogBackupFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCrossRegionLogBackupFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCrossRegionLogBackupFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCurrentModifyOrderResponse> describeCurrentModifyOrder(DescribeCurrentModifyOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCurrentModifyOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCurrentModifyOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCurrentModifyOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustinsResourceInfoResponse> describeCustinsResourceInfo(DescribeCustinsResourceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustinsResourceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustinsResourceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustinsResourceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceByTagsResponse> describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDBInstanceConnectivityResponse> describeDBInstanceConnectivity(DescribeDBInstanceConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceConnectivity").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceDetailResponse> describeDBInstanceDetail(DescribeDBInstanceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceEncryptionKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceEncryptionKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceEndpointsResponse> describeDBInstanceEndpoints(DescribeDBInstanceEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Query the data replication mode of an ApsaraDB RDS for MySQL instance](~~96055~~)
      * *   [Query the data replication mode of an ApsaraDB RDS for PostgreSQL instance](~~151265~~)
      * *   [Query the data replication mode of an ApsaraDB RDS for SQL Server instance](~~415433~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceHAConfigResponse> describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceHAConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceHAConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceHAConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceIPArrayList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceIPArrayListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceIPArrayListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS SQL Server
      * ### [](#)Prerequisites
      * *   The RDS instance runs RDS Basic Edition, RDS High-availability Edition, or RDS Cluster Edition. If your RDS instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.
      * *   The RDS instance belongs to a general-purpose or dedicated instance family. The shared instance family is not supported.
      * *   If the RDS instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the Creation Time
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Configure a distributed transaction whitelist](~~124321~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceIpHostnameResponse> describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceIpHostname").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceIpHostnameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceIpHostnameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceMetricsResponse> describeDBInstanceMetrics(DescribeDBInstanceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceNetInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceNetInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceNetInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> describeDBInstanceNetInfoForChannel(DescribeDBInstanceNetInfoForChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceNetInfoForChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceNetInfoForChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancePerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancePerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancePerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancePromoteActivityResponse> describeDBInstancePromoteActivity(DescribeDBInstancePromoteActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancePromoteActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancePromoteActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancePromoteActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Feature description
      * This operation is used to query the shared proxy settings of an instance that runs MySQL or the read/write splitting settings of an instance that runs SQL Server. For more information about how to query the dedicated proxy settings of an ApsaraDB RDS for MySQL instance, see [DescribeDBProxy](~~610506~~).
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature must be enabled for the primary instance.
      * *   The read/write splitting feature must be enabled for the primary instance.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceProxyConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceProxyConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceTDEResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      * >  The DescribeDBInstancesAsCsv operation is phased out. You can call the DescribeDBInstances operation.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesAsCsvResponse> describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancesAsCsv").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesAsCsvResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesAsCsvResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesByExpireTimeResponse> describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancesByExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesByExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesByExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesByPerformanceResponse> describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancesByPerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesByPerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesByPerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeDBInstancesForCloneResponse> describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstancesForClone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstancesForCloneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstancesForCloneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)Usage notes
      * Before you purchase or upgrade an instance that runs MySQL or PostgreSQL, you can call the DescribeDBMiniEngineVersions operation to query the minor engine versions that are available for the instance.
      *
     */
    @Override
    public CompletableFuture<DescribeDBMiniEngineVersionsResponse> describeDBMiniEngineVersions(DescribeDBMiniEngineVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBMiniEngineVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBMiniEngineVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBMiniEngineVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeDBProxyResponse> describeDBProxy(DescribeDBProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeDBProxyEndpointResponse> describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBProxyEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBProxyEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBProxyEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * >  Starting October 17, 2023, ApsaraDB RDS provides a dedicated proxy free of charge for each ApsaraDB RDS for MySQL instance on RDS Cluster Edition. For more information, see [\\[Special offers/Price changes\\] One proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition](~~2555466~~).
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [View the monitoring data of an ApsaraDB RDS for MySQL instance](~~194241~~)
      * *   [View the monitoring data of an ApsaraDB RDS for PostgreSQL instance](~~418275~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBProxyPerformance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBProxyPerformanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBProxyPerformanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Configures a distributed transaction whitelist for an ApsaraDB RDS for SQL Server instance](~~124321~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDTCSecurityIpHostsForSQLServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDTCSecurityIpHostsForSQLServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Dedicated clusters allow you to manage a number of instances in a cluster at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * > This operation is available only for instances that use local disks.
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * For more information about how to retain the data backup files of an instance after the instance is released, see [Configure automatic backup](~~98818~~).
      *
     */
    @Override
    public CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDetachedBackups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDetachedBackupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDetachedBackupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      * >  This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeErrorLogsResponse> describeErrorLogs(DescribeErrorLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeErrorLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeErrorLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeErrorLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Historical events of an ApsaraDB RDS for MySQL instance](~~129759~~)
      * *   [Historical events of an ApsaraDB RDS for PostgreSQL instance](~~131008~~)
      * *   [Historical events of an ApsaraDB RDS for SQL Server instance](~~131013~~)
      * *   [Historical events of an ApsaraDB RDS for MariaDB instance](~~131010~~)
      *
     */
    @Override
    public CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      *
     */
    @Override
    public CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGadInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGadInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGadInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * [What is availability detection?](~~207467~~)
      *
     */
    @Override
    public CompletableFuture<DescribeHADiagnoseConfigResponse> describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHADiagnoseConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHADiagnoseConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHADiagnoseConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeHASwitchConfigResponse> describeHASwitchConfig(DescribeHASwitchConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHASwitchConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHASwitchConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHASwitchConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHistoryEventsResponse> describeHistoryEvents(DescribeHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHistoryEventsStatResponse> describeHistoryEventsStat(DescribeHistoryEventsStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryEventsStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryEventsStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryEventsStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Tasks of an ApsaraDB RDS for MySQL instance](~~474275~~)
      * *   [Tasks of an ApsaraDB RDS for PostrgreSQL instance](~~474537~~)
      * *   [Tasks of an ApsaraDB RDS for SQL Server instance](~~614826~~)
      *
     */
    @Override
    public CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHistoryTasksStatResponse> describeHistoryTasksStat(DescribeHistoryTasksStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryTasksStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryTasksStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryTasksStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHostGroupElasticStrategyParametersResponse> describeHostGroupElasticStrategyParameters(DescribeHostGroupElasticStrategyParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHostGroupElasticStrategyParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHostGroupElasticStrategyParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHostGroupElasticStrategyParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      * ### [](#)Prerequisite
      * *   The instance meets the following requirements:
      *     *   The instance resides in a region other than the China (Zhangjiakou) region.
      *     *   The instance runs RDS Basic Edition, RDS Cluster Edition, or RDS High-availability Edition. If your instance runs RDS High-availability Edition, make sure that the instance runs SQL Server 2012 or later.
      *     *   The instance belongs to the general-purpose or dedicated instance family. The shared instance family is not supported.
      *     *   The instance resides in a virtual private cloud (VPC). For more information about how to change the network type of an RDS instance, see [Change the network type](~~95707~~).
      *     *   If the instance runs RDS High-availability Edition or RDS Cluster Edition, the instance is created on or after January 1, 2021. If the instance runs RDS Basic Edition, the instance is created on or after September 02, 2022. You can view the **Creation Time** parameter of an instance in the **Status** section of the **Basic Information** page in the ApsaraDB RDS console.
      * *   Your **Alibaba Cloud account** is used for logons.
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Create a host account and use the host account for logons](~~354862~~)
      *
     */
    @Override
    public CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHostWebShell").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHostWebShellResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHostWebShellResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewalAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAutoRenewalAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceCrossBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceCrossBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceKeywordsResponse> describeInstanceKeywords(DescribeInstanceKeywordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceKeywords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceKeywordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceKeywordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceLinkedWhitelistTemplateResponse> describeInstanceLinkedWhitelistTemplate(DescribeInstanceLinkedWhitelistTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceLinkedWhitelistTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceLinkedWhitelistTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceLinkedWhitelistTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeKmsAssociateResourcesResponse> describeKmsAssociateResources(DescribeKmsAssociateResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKmsAssociateResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKmsAssociateResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKmsAssociateResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLocalAvailableRecoveryTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLocalAvailableRecoveryTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * SQL Server
      * >  You can call the DescribeBinlogFiles operation to query the log files of instances that run different database engines.
      *
     */
    @Override
    public CompletableFuture<DescribeLogBackupFilesResponse> describeLogBackupFiles(DescribeLogBackupFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogBackupFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogBackupFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogBackupFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeMarketingActivityResponse> describeMarketingActivity(DescribeMarketingActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMarketingActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMarketingActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMarketingActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * MySQL
      * > This operation is available for RDS instances that run MySQL 8.0, MySQL 5.7, and MySQL 5.6 on RDS High-availability Edition with local disks.
      * ### [](#)Description
      * Before you call the [RestoreTable](~~131510~~) operation to restore individual databases or tables of an ApsaraDB RDS for MySQL instance, you can call this operation to query the information about the databases and tables that can be restored. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      *
     */
    @Override
    public CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetaList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetaListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetaListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeMigrateTaskByIdResponse> describeMigrateTaskById(DescribeMigrateTaskByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrateTaskById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrateTaskByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrateTaskByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      * ### [](#)Usage notes
      * This operation allows you to query the migration tasks that are created for the instance over the last week.
      * ### [](#)Precautions
      * *   This operation is supported only for migration tasks that are created to migrate full backup files.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    @Override
    public CompletableFuture<DescribeMigrateTasksResponse> describeMigrateTasks(DescribeMigrateTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMigrateTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMigrateTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMigrateTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeModifyPGHbaConfigLogResponse> describeModifyPGHbaConfigLog(DescribeModifyPGHbaConfigLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModifyPGHbaConfigLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModifyPGHbaConfigLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModifyPGHbaConfigLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModifyParameterLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModifyParameterLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModifyParameterLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      * ### [Usage notes](#)
      * This operation is not supported for instances that run SQL Server 2017 EE or SQL Server 2019 EE.
      *
     */
    @Override
    public CompletableFuture<DescribeOssDownloadsResponse> describeOssDownloads(DescribeOssDownloadsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOssDownloads").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOssDownloadsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOssDownloadsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribePGHbaConfigResponse> describePGHbaConfig(DescribePGHbaConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePGHbaConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePGHbaConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePGHbaConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template for an ApsaraDB RDS for MySQL instance](~~130565~~)
      * *   [Use a parameter template for an ApsaraDB RDS for PostgreSQL instance](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Applicable engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    @Override
    public CompletableFuture<DescribePostgresExtensionsResponse> describePostgresExtensions(DescribePostgresExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePostgresExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePostgresExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePostgresExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeQuickSaleConfigResponse> describeQuickSaleConfig(DescribeQuickSaleConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQuickSaleConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQuickSaleConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQuickSaleConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeRdsResourceSettingsResponse> describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRdsResourceSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRdsResourceSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRdsResourceSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeReadDBInstanceDelayResponse> describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReadDBInstanceDelay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReadDBInstanceDelayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReadDBInstanceDelayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeRegionInfosResponse> describeRegionInfos(DescribeRegionInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegionInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call the [CreateDBInstance](~~26228~~) operation to create an RDS instance, you can call the DescribeRegions operation to query the available regions and zones.
      * >  If a zone supports the multi-zone deployment method, the value of the ZoneId parameter for the zone contains an MAZ part. Examples: cn-hangzhou-MAZ6(b,f) and cn-hangzhou-MAZ5(b,e,f).
      *
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRenewalPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRenewalPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRenewalPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeResourceDetailsResponse> describeResourceDetails(DescribeResourceDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLCollectorPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLCollectorPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLCollectorPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeSQLCollectorRetentionResponse> describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLCollectorRetention").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLCollectorRetentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLCollectorRetentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      *     **
      *     **Note** Only SQL Server 2008 R2 is supported.
      * ### [](#)Precautions
      * *   The DescribeSQLLogFiles operation does not return the log files that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   The DescribeSQLLogFiles operation does not return the log files that are generated by the SQL Explorer feature and manually exported from the ApsaraDB RDS console. The DescribeSQLLogFiles operation returns the SQL Explorer log files that are generated by calling the [DescribeSQLLogRecords](~~610533~~) operation with the request parameter **Form** set to **File**.
      *
     */
    @Override
    public CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLLogFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLLogFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLLogFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [Usage notes](#)
      * *   You can call this operation up to 1,000 times per minute per account. The calls initiated by using both your Alibaba Cloud account and RAM users within your Alibaba Cloud account are counted.
      * *   This operation cannot be used to query the logs that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   When you call this operation and set the **Form** parameter to **File** to generate an audit file, a maximum of 1 million log entries can be recorded in the audit file, and you cannot filter log entries by keyword.
      *
     */
    @Override
    public CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeSQLLogReportListResponse> describeSQLLogReportList(DescribeSQLLogReportListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLLogReportList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLLogReportListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLLogReportListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   MySQL
      *
     */
    @Override
    public CompletableFuture<DescribeSecretsResponse> describeSecrets(DescribeSecretsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecrets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecretsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecretsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure a security group for an ApsaraDB RDS for MySQL instance](~~201042~~)
      * *   [Configure a security group for an ApsaraDB RDS for PostgreSQL instance](~~206310~~)
      * *   [Configure a security group for an ApsaraDB RDS for SQL Server instance](~~2392322~~)
      *
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeSlotsResponse> describeSlots(DescribeSlotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### Precautions
      * The response parameters returned by this operation are updated every minute.
      *
     */
    @Override
    public CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      *     **
      *     **Note** This operation is not supported for RDS instances that run MySQL 5.7 on RDS Basic Edition.
      * *   SQL Server
      *     **
      *     **Note** This operation is supported only for RDS instances that run SQL Server 2008 R2.
      * *   MariaDB
      * ### [](#)Precautions
      * *   Slow query logs are not collected in real time and may show a latency of 6 to 8 hours.
      * *   If the return result is empty, check whether the StartTime and EndTime parameters meet the UTC format. If the parameters meet the UTC format, no slow logs are generated within the specified time range.
      *
     */
    @Override
    public CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlowLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlowLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlowLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeSupportOnlineResizeDiskResponse> describeSupportOnlineResizeDisk(DescribeSupportOnlineResizeDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSupportOnlineResizeDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSupportOnlineResizeDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSupportOnlineResizeDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [Usage notes](#)
      * *   If an instance ID is specified, all tags that are added to this instance are queried, and other filter conditions are invalid.
      * *   If you specify only TagKey, the results that match the specified TagKey are returned. If you specify both TagKey and TagValue, the results that match both the specified TagKey and TagValue are returned.
      *
     */
    @Override
    public CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * PostgreSQL
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~)
      * *   [Introduction to the check report of a major engine version upgrade for an ApsaraDB RDS for PostgreSQL instance](~~218391~~)
      *
     */
    @Override
    public CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> describeUpgradeMajorVersionPrecheckTask(DescribeUpgradeMajorVersionPrecheckTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpgradeMajorVersionPrecheckTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpgradeMajorVersionPrecheckTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * PostgreSQL
      *
     */
    @Override
    public CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> describeUpgradeMajorVersionTasks(DescribeUpgradeMajorVersionTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpgradeMajorVersionTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpgradeMajorVersionTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVSwitchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVSwitchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeWhitelistTemplateResponse> describeWhitelistTemplate(DescribeWhitelistTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhitelistTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhitelistTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhitelistTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DescribeWhitelistTemplateLinkedInstanceResponse> describeWhitelistTemplateLinkedInstance(DescribeWhitelistTemplateLinkedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhitelistTemplateLinkedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhitelistTemplateLinkedInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhitelistTemplateLinkedInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The DestroyDBInstance operation is phased out.
      *
     */
    @Override
    public CompletableFuture<DestroyDBInstanceResponse> destroyDBInstance(DestroyDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DestroyDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DestroyDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DestroyDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [Usage notes](#)
      * This operation can be used to remove only unit nodes.
      *
     */
    @Override
    public CompletableFuture<DetachGadInstanceMemberResponse> detachGadInstanceMember(DetachGadInstanceMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachGadInstanceMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachGadInstanceMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachGadInstanceMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<DetachWhitelistTemplateToInstanceResponse> detachWhitelistTemplateToInstance(DetachWhitelistTemplateToInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachWhitelistTemplateToInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachWhitelistTemplateToInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachWhitelistTemplateToInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EvaluateLocalExtendDiskResponse> evaluateLocalExtendDisk(EvaluateLocalExtendDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EvaluateLocalExtendDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvaluateLocalExtendDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvaluateLocalExtendDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<GetDBInstanceTopologyResponse> getDBInstanceTopology(GetDBInstanceTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDBInstanceTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDBInstanceTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDBInstanceTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    @Override
    public CompletableFuture<GetDbProxyInstanceSslResponse> getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDbProxyInstanceSsl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDbProxyInstanceSslResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDbProxyInstanceSslResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Each account can be granted permissions on one or more databases. Before you call this operation, make sure that the instance is in the Running state.
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL with local disks.
      *
     */
    @Override
    public CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantAccountPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantAccountPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantAccountPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Grant permissions to the service account of an ApsaraDB RDS for MySQL instance](~~96102~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance](~~95693~~)
      *
     */
    @Override
    public CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantOperatorPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantOperatorPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantOperatorPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)Description
      * A full backup file contains the data of a self-managed MySQL instance. You can restore the data of a self-managed MySQL instance from a full backup file to an ApsaraDB RDS for MySQL instance.
      * ### [](#)Usage notes
      * Before you call this operation, make sure that the following requirements are met:
      * *   The self-managed MySQL instance runs MySQL 5.7 and is backed up by using XtraBackup. The name of the backup file ends with `_qp.xb`. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   The full backup file of the self-managed MySQL instance is uploaded to an Object Storage Service (OSS) bucket in the region of the ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * >  This operation is supported only for MySQL 5.7.
      *
     */
    @Override
    public CompletableFuture<ImportUserBackupFileResponse> importUserBackupFile(ImportUserBackupFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportUserBackupFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportUserBackupFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportUserBackupFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClasses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClassesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClassesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      *
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)Feature description
      * *   A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   Before you call the [CreateDBInstance](~~26228~~) operation to create an ApsaraDB RDS for MySQL instance into which you want to import full backup files, you can call this operation to query the IDs of full backup files.
      * *   You can call the [ImportUserBackupFile](~~260266~~) operation to import a full backup file into an ApsaraDB RDS for MySQL instance.
      *
     */
    @Override
    public CompletableFuture<ListUserBackupFilesResponse> listUserBackupFiles(ListUserBackupFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserBackupFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserBackupFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserBackupFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Lock an account of an ApsaraDB RDS for PostgreSQL instance](~~147649~~)
      *
     */
    @Override
    public CompletableFuture<LockAccountResponse> lockAccount(LockAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LockAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LockAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LockAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Migrate an ApsaraDB RDS for MySQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region](~~95658~~)
      *
     */
    @Override
    public CompletableFuture<MigrateConnectionToOtherZoneResponse> migrateConnectionToOtherZone(MigrateConnectionToOtherZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateConnectionToOtherZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateConnectionToOtherZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateConnectionToOtherZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    @Override
    public CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Change the whitelist mode of an ApsaraDB RDS for MySQL instance to the enhanced whitelist mode](~~96117~~)
      * *   [Change the whitelist mode of an ApsaraDB RDS for PostgreSQL instance to the enhanced whitelist mode](~~96767~~)
      *
     */
    @Override
    public CompletableFuture<MigrateSecurityIPModeResponse> migrateSecurityIPMode(MigrateSecurityIPModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateSecurityIPMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateSecurityIPModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateSecurityIPModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Migrate an ApsaraDB RDS for MySQL instance across zones in the same region](~~96053~~)
      * *   [Migrate an ApsaraDB RDS for PostgreSQL instance across zones in the same region](~~96746~~)
      * *   [Migrate an ApsaraDB RDS for SQL Server instance across zones in the same region](~~95658~~)
      *
     */
    @Override
    public CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateToOtherZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateToOtherZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateToOtherZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Connect an RDS instance to a self-managed domain](~~170734~~)
      *
     */
    @Override
    public CompletableFuture<ModifyADInfoResponse> modifyADInfo(ModifyADInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyADInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyADInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyADInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [View the event history of an ApsaraDB RDS for MySQL instance](~~129759~~)
      * *   [View the event history of an ApsaraDB RDS for PostgreSQL instance](~~131008~~)
      * *   [View the event history of an ApsaraDB RDS for SQL Server instance](~~131013~~)
      * *   [View the event history of an ApsaraDB RDS for MariaDB instance](~~131010~~)
      *
     */
    @Override
    public CompletableFuture<ModifyActionEventPolicyResponse> modifyActionEventPolicy(ModifyActionEventPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActionEventPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActionEventPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActionEventPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Scheduled events for ApsaraDB RDS for MySQL instances](~~104183~~)
      * *   [Scheduled events for ApsaraDB RDS for PostgreSQL instances](~~104452~~)
      * *   [Scheduled events for ApsaraDB RDS for SQL Server instances](~~104451~~)
      * *   [Scheduled events for ApsaraDB RDS for MariaDB instances](~~104454~~)
      *
     */
    @Override
    public CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for MySQL instance](~~98818~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for PostgreSQL instance](~~96772~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for SQL Server instance](~~95717~~)
      * *   [Configure an automatic backup policy for an ApsaraDB RDS for MariaDB instance](~~97147~~)
      *
     */
    @Override
    public CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS SQL Server
      * ### [](#)References
      * >  Before you call this operation, read the following topics and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Change the character set collation and the time zone of system databases](~~95700~~)
      *
     */
    @Override
    public CompletableFuture<ModifyCollationTimeZoneResponse> modifyCollationTimeZone(ModifyCollationTimeZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCollationTimeZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCollationTimeZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCollationTimeZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyCustinsResourceResponse> modifyCustinsResource(ModifyCustinsResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustinsResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustinsResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustinsResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      *
     */
    @Override
    public CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Modify automatic update settings for an ApsaraDB RDS for MySQL instance](~~96059~~)
      * *   [Modify automatic update settings for an ApsaraDB RDS for PostgreSQL instance](~~146895~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceAutoUpgradeMinorVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceAutoUpgradeMinorVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * >  The configuration item that is supported is [PgBouncer](~~2398301~~) of ApsaraDB RDS for PostgreSQL instances.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > The API has been taken offline
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceConnectionModeResponse> modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceConnectionMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceConnectionModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceConnectionModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * *   [Change the endpoint and port number of an ApsaraDB RDS for MySQL instance](~~96163~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for PostgreSQL instance](~~96788~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for SQL Server instance](~~95740~~)
      * *   [Change the endpoint and port number of an ApsaraDB RDS for MariaDB instance](~~97157~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceConnectionString").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceConnectionStringResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceConnectionStringResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure a data replication latency for a read-only ApsaraDB RDS for MySQL instance](~~96056~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> modifyDBInstanceDelayedReplicationTime(ModifyDBInstanceDelayedReplicationTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceDelayedReplicationTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceDelayedReplicationTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Enable and disable instance release protection for an ApsaraDB RDS for MySQL instance](~~414512~~)
      * *   [Enable and disable instance release protection for an ApsaraDB RDS for PostgreSQL instance](~~471512~~)
      * *   [Enable and disable instance release protection for an ApsaraDB RDS for SQL Server instance](~~416209~~)
      * *   [Enable and disable release protection for an ApsaraDB RDS for MariaDB instance](~~414512~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> modifyDBInstanceDeletionProtection(ModifyDBInstanceDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceEndpointResponse> modifyDBInstanceEndpoint(ModifyDBInstanceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      * ### [](#)Precautions
      * *   You can modify the following information about the endpoint of an instance: the public and internal endpoints, the public and internal ports, and the virtual private cloud (VPC), vSwitch, and IP address of the internal endpoint.
      * *   The VPC and vSwitch must be modified at the same time. If you specify the VPC, vSwitch, and IP address of the internal endpoint, you do not need to specify the endpoint and port. If you specify the endpoint and port, you do not need to specify the VPC, vSwitch, and IP address of the internal endpoint.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceEndpointAddressResponse> modifyDBInstanceEndpointAddress(ModifyDBInstanceEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDBInstanceHAConfigResponse> modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceHAConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceHAConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceHAConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Set a maintenance window for an ApsaraDB RDS for MySQL instance](~~96052~~)
      * *   [Set a maintenance window for an ApsaraDB RDS for PostgreSQL instance](~~96799~~)
      * *   [Set a maintenance window for an ApsaraDB RDS for SQL Server instance](~~95657~~)
      * *   [Set a maintenance window for an ApsaraDB RDS for MariaDB instance](~~97473~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceMaintainTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceMaintainTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceMaintainTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [View the Enhanced Monitoring metrics](~~299200~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceMetricsResponse> modifyDBInstanceMetrics(ModifyDBInstanceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Usage notes
      * If you use the Every 5 Seconds monitoring frequency, you are charged additional fees. Before you call this operation, make sure that you understand the [billing methods and pricing](~~45020~~) of ApsaraDB RDS.
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure the monitoring frequency for an ApsaraDB RDS for MySQL instance](~~96112~~)
      * *   [Configure the monitoring frequency for an ApsaraDB RDS for SQL Server instance](~~95710~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)References
      * *   [Configure the hybrid access solution for an ApsaraDB RDS for MySQL instance](~~96110~~)
      * *   [Configure the hybrid access solution for an ApsaraDB RDS for SQL Server instance](~~95708~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceNetworkExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceNetworkExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Change the network type of an ApsaraDB RDS for MySQL instance](~~96109~~)
      * *   [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~)
      * *   [Change the network type of an ApsaraDB RDS for SQL Server instance](~~95707~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceNetworkType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceNetworkTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceNetworkTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * >  Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the following topics:
      * *   [Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription](~~96048~~)
      * *   [Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription](~~96743~~)
      * *   [Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription](~~95631~~)
      * *   [Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription](~~97120~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstancePayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstancePayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstancePayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceProxyConfigurationResponse> modifyDBInstanceProxyConfiguration(ModifyDBInstanceProxyConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceProxyConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceProxyConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceProxyConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for MySQL instance](~~96120~~)
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for PostgreSQL instance](~~229517~~)
      * *   [Use the SSL encryption feature for an ApsaraDB RDS for SQL Server instance](~~95715~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Fees are generated if the call is successful. Before you call this operation, carefully read the following documentation:
      * *   [Change the specifications of an ApsaraDB RDS for MySQL instance](~~96061~~)
      * *   [Change the specifications of an ApsaraDB RDS for PostgreSQL instance](~~96750~~)
      * *   [Change the specifications of an ApsaraDB RDS for SQL Server instance](~~95665~~)
      * *   [Change the specifications of an ApsaraDB RDS for MariaDB instance](~~97129~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure TDE for an ApsaraDB RDS for MySQL instance](~~96121~~)
      * *   [Configure TDE for an ApsaraDB RDS for PostgreSQL instance](~~465652~~)
      * *   [Configure TDE for an ApsaraDB RDS for SQL Server instance](~~95716~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceTDE").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceTDEResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceTDEResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * ### [](#)References
      * > Fees are generated if the call is successful. Before you call this operation, carefully read the following topics:
      * *   [Change the specifications of an ApsaraDB RDS for MySQL instance](~~96061~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBNodeResponse> modifyDBNode(ModifyDBNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * >  Starting October 17, 2023, ApsaraDB RDS provides a dedicated proxy free of charge for each ApsaraDB RDS for MySQL instance on RDS Cluster Edition. For more information, see [\\[Special offers/Price changes\\] One proxy is provided free of charge for ApsaraDB RDS for MySQL instances on RDS Cluster Edition](~~2555466~~).
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Enable and configure the dedicated proxy feature for an ApsaraDB RDS for MySQL instance](~~197456~~)
      * *   [Enable and configure the dedicated proxy feature for an ApsaraDB RDS for PostgreSQL instance](~~418272~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBProxyResponse> modifyDBProxy(ModifyDBProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Enable and configure the dedicated proxy feature](~~197456~~)
      * *   [Create a database proxy terminal for an ApsaraDB RDS for PostgreSQL instance](~~418273~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBProxyEndpointResponse> modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBProxyEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBProxyEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBProxyEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance](~~184921~~)
      * *   [Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance](~~418274~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBProxyEndpointAddressResponse> modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBProxyEndpointAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBProxyEndpointAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBProxyEndpointAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call the ModifyDBProxyInstance operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDBProxyInstanceResponse> modifyDBProxyInstance(ModifyDBProxyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBProxyInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBProxyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBProxyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Configure a distributed transaction whitelist](~~124321~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDTCSecurityIpHostsForSQLServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDTCSecurityIpHostsForSQLServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure automatic storage expansion for ApsaraDB RDS for MySQL](~~173826~~)
      * *   [Configure automatic storage expansion for ApsaraDB RDS for PostgreSQL](~~432496~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDasInstanceConfigResponse> modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDasInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDasInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDasInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engine
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<ModifyDatabaseConfigResponse> modifyDatabaseConfig(ModifyDatabaseConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDatabaseConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDatabaseConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDatabaseConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS MySQL
      * ### [](#)References
      * > : Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * [Configure SSL encryption for a proxy endpoint](~~188164~~)
      *
     */
    @Override
    public CompletableFuture<ModifyDbProxyInstanceSslResponse> modifyDbProxyInstanceSsl(ModifyDbProxyInstanceSslRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDbProxyInstanceSsl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDbProxyInstanceSslResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDbProxyInstanceSslResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyEventInfoResponse> modifyEventInfo(ModifyEventInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEventInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEventInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEventInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [What is availability check?](~~207467~~)
      *
     */
    @Override
    public CompletableFuture<ModifyHADiagnoseConfigResponse> modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHADiagnoseConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHADiagnoseConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHADiagnoseConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MySQL instance](~~96054~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for PostgreSQL instance](~~96747~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for SQL Server instance](~~95659~~)
      * *   [Use the automatic primary/secondary switchover feature for an ApsaraDB RDS for MariaDB instance](~~97127~~)
      *
     */
    @Override
    public CompletableFuture<ModifyHASwitchConfigResponse> modifyHASwitchConfig(ModifyHASwitchConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHASwitchConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHASwitchConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHASwitchConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * ><notice>Fees are generated if the call is successful. Before you call this operation, carefully read the following topics:></notice>
      * *   [Use the auto-renewal feature for an ApsaraDB RDS for MySQL instance](~~96049~~)
      * *   [Use the auto-renewal feature for an ApsaraDB RDS for PostgreSQL instance](~~96740~~)
      * *   [Use the auto-renewal feature for an ApsaraDB RDS for SQL Server instance](~~95635~~)
      * *   [Use the auto-renewal feature for an ApsaraDB RDS for MariaDB instance](~~97121~~)
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoRenewalAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoRenewalAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the cross-region backup feature of an ApsaraDB RDS for MySQL instance](~~120824~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for PostgreSQL instance](~~206671~~)
      * *   [Use the cross-region backup feature for an ApsaraDB RDS for SQL Server instance](~~187923~~)
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceCrossBackupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceCrossBackupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * RDS PostgreSQL
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Connect an ApsaraDB RDS for PostgreSQL instance to a self-managed AD domain](~~349288~~)
      * *   [The pg_hba.conf File](https://www.postgresql.org/docs/11/auth-pg-hba-conf.html)
      *
     */
    @Override
    public CompletableFuture<ModifyPGHbaConfigResponse> modifyPGHbaConfig(ModifyPGHbaConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPGHbaConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPGHbaConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPGHbaConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Modify the parameters of an ApsaraDB RDS for MySQL instance](~~96063~~)
      * *   [Modify the parameters of an ApsaraDB RDS for PostgreSQL instance](~~96751~~)
      * *   [Modify the parameters of an ApsaraDB RDS for SQL Server instance](~~95667~~)
      * *   [Modify the parameters of an ApsaraDB RDS for MariaDB instance](~~97130~~)
      *
     */
    @Override
    public CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~)
      * *   [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~)
      *
     */
    @Override
    public CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyParameterGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyParameterGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyParameterGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The read/write splitting feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition with local disks
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    @Override
    public CompletableFuture<ModifyReadWriteSplittingConnectionResponse> modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReadWriteSplittingConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReadWriteSplittingConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReadWriteSplittingConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Set the data replication latency of a read-only ApsaraDB RDS for MySQL instance](~~96056~~)
      *
     */
    @Override
    public CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReadonlyInstanceDelayReplicationTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReadonlyInstanceDelayReplicationTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Transfer resources across resource groups](~~94487~~)
      *
     */
    @Override
    public CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Use the SQL Explorer and Audit feature for an ApsaraDB RDS for MySQL instance](~~476574~~)
      * *   [Use the SQL Audit feature for an ApsaraDB RDS for PostgreSQL instance](~~96766~~)
      * *   [Use the SQL Audit feature for an ApsaraDB RDS for SQL Server instance](~~95712~~)
      *
     */
    @Override
    public CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySQLCollectorPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySQLCollectorPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySQLCollectorPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### Precautions
      * After you shorten the log backup retention period, log backup files that are stored longer than the specified log backup retention period are immediately deleted.
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Use the SQL Explorer and Audit feature](~~476574~~)
      *
     */
    @Override
    public CompletableFuture<ModifySQLCollectorRetentionResponse> modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySQLCollectorRetention").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySQLCollectorRetentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySQLCollectorRetentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Configure a security group for an ApsaraDB RDS for MySQL instance](~~201042~~)
      * *   [Configure a security group for an ApsaraDB RDS for PostgreSQL instance](~~206310~~)
      * *   [Configure a security group for an ApsaraDB RDS for SQL Server instance](~~2392322~~)
      *
     */
    @Override
    public CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for MySQL instance](~~96118~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for PostgreSQL instance](~~43187~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for SQL Server instance](~~43186~~)
      * *   [Configure an IP address whitelist for an ApsaraDB RDS for MariaDB instance](~~90336~~)
      *
     */
    @Override
    public CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTaskInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTaskInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTaskInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      *
     */
    @Override
    public CompletableFuture<ModifyWhitelistTemplateResponse> modifyWhitelistTemplate(ModifyWhitelistTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWhitelistTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWhitelistTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWhitelistTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PreCheckCreateOrderForCreateDBNodesResponse> preCheckCreateOrderForCreateDBNodes(PreCheckCreateOrderForCreateDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreCheckCreateOrderForCreateDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreCheckCreateOrderForCreateDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreCheckCreateOrderForCreateDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PreCheckCreateOrderForDeleteDBNodesResponse> preCheckCreateOrderForDeleteDBNodes(PreCheckCreateOrderForDeleteDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreCheckCreateOrderForDeleteDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreCheckCreateOrderForDeleteDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreCheckCreateOrderForDeleteDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Description
      * The system automatically uploads log backup files to Object Storage Service (OSS) buckets. If the remaining storage of an instance is insufficient, you can call this operation to upload the log backup files of the instance to OSS buckets. After the upload is complete, the system deletes these files from the instance to release storage. This operation is called to upload log backup files from an instance to OSS buckets and then delete these files from the instance. If the instance runs SQL Server, transaction log backup files are compressed before they are uploaded.
      * ### Precautions
      * *   When you upload log backup files, the data restoration feature is not affected.
      * *   This operation is called to release storage. The backup storage usage is not reduced.
      * *   The OSS buckets to which log backup files are uploaded are provided by the system. You do not need to purchase these OSS buckets. In addition, you cannot access these OSS buckets.
      *
     */
    @Override
    public CompletableFuture<PurgeDBInstanceLogResponse> purgeDBInstanceLog(PurgeDBInstanceLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurgeDBInstanceLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PurgeDBInstanceLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PurgeDBInstanceLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### Feature description
      * The notifications are highlighted at the top of the ApsaraDB RDS console. The notifications include renewal reminders and reminders of instance creation failures.
      * After you call this operation to query notifications, you can call the [ConfirmNotify](~~610444~~) operation to mark the notifications as confirmed, which means that you understand the content of the notifications.
      *
     */
    @Override
    public CompletableFuture<QueryNotifyResponse> queryNotify(QueryNotifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryNotify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryNotifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryNotifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryRecommendByCodeResponse> queryRecommendByCode(QueryRecommendByCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRecommendByCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRecommendByCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRecommendByCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    @Override
    public CompletableFuture<RebuildDBInstanceResponse> rebuildDBInstance(RebuildDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebuildDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebuildDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebuildDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The operation is phased out.
      *
     */
    @Override
    public CompletableFuture<ReceiveDBInstanceResponse> receiveDBInstance(ReceiveDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReceiveDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReceiveDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReceiveDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * SQL Server 2012 or later
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Restore the data of an ApsaraDB RDS for SQL Server instance](~~95722~~)
      *
     */
    @Override
    public CompletableFuture<RecoveryDBInstanceResponse> recoveryDBInstance(RecoveryDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoveryDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoveryDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoveryDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * *   [Release the public endpoint of an ApsaraDB RDS for MySQL instance](~~26128~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for PostgreSQL instance](~~97738~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for SQL Server instance](~~97736~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for MariaDB instance](~~97740~~)
      *
     */
    @Override
    public CompletableFuture<ReleaseInstanceConnectionResponse> releaseInstanceConnection(ReleaseInstanceConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseInstanceConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstanceConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstanceConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Release the public endpoint of an ApsaraDB RDS for MySQL instance](~~26128~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for PostgreSQL instance](~~97738~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for SQL Server instance](~~97736~~)
      * *   [Release the public endpoint of an ApsaraDB RDS for MariaDB instance](~~97740~~)
      *
     */
    @Override
    public CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseInstancePublicConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstancePublicConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstancePublicConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The read/write splitting feature is enabled for the instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    @Override
    public CompletableFuture<ReleaseReadWriteSplittingConnectionResponse> releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseReadWriteSplittingConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseReadWriteSplittingConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseReadWriteSplittingConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   A maximum of 10 tags can be removed in a single request.
      * *   If a tag is removed from all instances to which the tag is added, the tag is automatically deleted.
      * *   If you specify only TagKey, all tags that match the TagKey condition are removed.
      * *   You must specify at least TagKey or a pair of TagKey and TagValue.
      *
     */
    @Override
    public CompletableFuture<RemoveTagsFromResourceResponse> removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTagsFromResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTagsFromResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTagsFromResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * >  Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the following topics:
      * *   [Manually renew an ApsaraDB RDS for MySQL instance](~~96050~~)
      * *   [Manually renew an ApsaraDB RDS for PostgreSQL instance](~~96741~~)
      * *   [Manually renew an ApsaraDB RDS for SQL Server instance](~~95637~~)
      * *   [Manually renew an ApsaraDB RDS for MariaDB instance](~~97122~~)
      *
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Reset of the permissions of privileged accounts](~~140724~~)
      *
     */
    @Override
    public CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Reset the password of an ApsaraDB RDS for MySQL instance](~~96100~~)
      * *   [Reset the password of an ApsaraDB RDS for PostgreSQL instance](~~96814~~)
      * *   [Reset the password of an ApsaraDB RDS for SQL Server instance](~~95691~~)
      * *   [Reset the password of an ApsaraDB RDS for MariaDB instance](~~97133~~)
      *
     */
    @Override
    public CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAccountPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAccountPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAccountPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   RDS MySQL
      * *   RDS PostgreSQL
      * *   RDS SQL Server
      * *   RDS MariaDB
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Restart an ApsaraDB RDS for MySQL instance](~~96051~~)
      * *   [Restart an ApsaraDB RDS for PostgreSQL instance](~~96798~~)
      * *   [Restart an ApsaraDB RDS for SQL Server instance](~~95656~~)
      * *   [Restart an ApsaraDB RDS for MariaDB instance](~~97472~~)
      *
     */
    @Override
    public CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  Before restoration, you can call the [CheckCreateDdrDBInstance](~~121721~~) operation to check whether a cross-region backup set can be used for cross-region restoration.
      * ### [](#)Supported database engine
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~)
      * *   [Restore the data of an ApsaraDB RDS for MySQL instance across regions](~~120875~~)
      *
     */
    @Override
    public CompletableFuture<RestoreDdrTableResponse> restoreDdrTable(RestoreDdrTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreDdrTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreDdrTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreDdrTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * MySQL
      * ### [](#)References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Restore individual databases and tables](~~103175~~)
      *
     */
    @Override
    public CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Prerequisites
      * *   The instance is in the Running state.
      * *   The database is in the Running state.
      * ### [](#)Precautions
      * *   The permissions that can be revoked include SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, and TRIGGER.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition and run PostgreSQL.
      *
     */
    @Override
    public CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeAccountPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeAccountPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeAccountPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Grant permissions to the service account of an ApsaraDB RDS for MySQL instance](~~96102~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for PostgreSQL instance](~~146887~~)
      * *   [Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance](~~95693~~)
      *
     */
    @Override
    public CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeOperatorPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeOperatorPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeOperatorPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:
      * *   [Resume an ApsaraDB RDS for MySQL instance](~~427093~~)
      * *   [Resume an ApsaraDB RDS for PostgreSQL instance](~~452314~~)
      * *   [Resume an ApsaraDB RDS for SQL Server instance](~~462504~~)
      *
     */
    @Override
    public CompletableFuture<StartDBInstanceResponse> startDBInstance(StartDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Suspend an ApsaraDB RDS for MySQL instance](~~427093~~)
      * *   [Suspend an ApsaraDB RDS for PostgreSQL instance](~~452314~~)
      * *   [Suspend an ApsaraDB RDS for SQL Server instance](~~462504~~)
      *
     */
    @Override
    public CompletableFuture<StopDBInstanceResponse> stopDBInstance(StopDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for MySQL instances](~~96054~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for PostgreSQL instances](~~96747~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for SQL Server instances](~~95659~~)
      * *   [Switch workloads between primary and secondary ApsaraDB RDS for MariaDB instances](~~97127~~)
      *
     */
    @Override
    public CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchDBInstanceHA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchDBInstanceHAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchDBInstanceHAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   SQL Server
      * ### Prerequisites
      * *   The instance is connected by using its internal or public endpoint.
      * *   The instance is in the Running state.
      * *   The number of times that you have switched the instance between its internal and public endpoints within the last 24 hours does not reach 20.
      * *   The instance resides in the classic network.
      * ### Usage notes
      * After the endpoint that is used to connect to the instance is changed, you must update the endpoint information in the code of your application and restart the application.
      *
     */
    @Override
    public CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchDBInstanceNetType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchDBInstanceNetTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchDBInstanceNetTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Change the VPC and vSwitch for an ApsaraDB RDS for MySQL instance](~~137567~~)
      * *   [Change the vSwitch for an ApsaraDB RDS for PostgreSQL instance](~~146885~~)
      * *   [Change the VPC and vSwitch for an ApsaraDB RDS for SQL Server instance](~~347675~~)
      *
     */
    @Override
    public CompletableFuture<SwitchDBInstanceVpcResponse> switchDBInstanceVpc(SwitchDBInstanceVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchDBInstanceVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchDBInstanceVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchDBInstanceVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is phased out.
      *
     */
    @Override
    public CompletableFuture<SwitchGuardToMasterInstanceResponse> switchGuardToMasterInstance(SwitchGuardToMasterInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchGuardToMasterInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchGuardToMasterInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchGuardToMasterInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * *   [Create tags for an ApsaraDB RDS for MySQL instance](~~96149~~)
      * *   [Create tags for an ApsaraDB RDS for PostgreSQL instance](~~96777~~)
      * *   [Create tags for an ApsaraDB RDS for SQL Server instance](~~95726~~)
      * *   [Create tags for an ApsaraDB RDS for MariaDB instance](~~97152~~)
      *
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   SQL Server
      *
     */
    @Override
    public CompletableFuture<TerminateMigrateTaskResponse> terminateMigrateTask(TerminateMigrateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateMigrateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateMigrateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateMigrateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### References
      * > Fees are generated if the call is successful. Before you call this operation, you must read the following documentation.
      * *   [Change the billing method of an ApsaraDB RDS for MySQL instance from pay-as-you-go to subscription](~~96048~~) or [Change the billing method of an ApsaraDB RDS for MySQL instance from subscription to pay-as-you-go](~~161875~~)
      * *   [Change the billing method of an ApsaraDB RDS for PostgreSQL instance from pay-as-you-go to subscription](~~96743~~) or [Change the billing method of an ApsaraDB RDS for PostgreSQL instance from subscription to pay-as-you-go](~~162756~~)
      * *   [Change the billing method of an ApsaraDB RDS for SQL Server instance from pay-as-you-go to subscription](~~95631~~) or [Change the billing method of an ApsaraDB RDS for SQL Server instance from subscription to pay-as-you-go](~~162755~~)
      * *   [Change the billing method of an ApsaraDB RDS for MariaDB instance from pay-as-you-go to subscription](~~97120~~) or [Change the billing method of an ApsaraDB RDS for MariaDB instance from subscription to pay-as-you-go](~~169252~~)
      *
     */
    @Override
    public CompletableFuture<TransformDBInstancePayTypeResponse> transformDBInstancePayType(TransformDBInstancePayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformDBInstancePayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformDBInstancePayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformDBInstancePayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Lock an account of an ApsaraDB RDS for PostgreSQL instance](~~147649~~)
      *
     */
    @Override
    public CompletableFuture<UnlockAccountResponse> unlockAccount(UnlockAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * *   MariaDB
      * ### [](#)Usage notes
      * *   You can remove up to 20 tags at a time.
      * *   If a tag is removed from an instance and is not added to other instances, the tag is automatically deleted.
      *
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS PostgreSQL
      * ### References
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Manage extensions](~~2402409~~)
      *
     */
    @Override
    public CompletableFuture<UpdatePostgresExtensionsResponse> updatePostgresExtensions(UpdatePostgresExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePostgresExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePostgresExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePostgresExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * RDS MySQL
      * ### References
      * A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 or MySQL 8.0 instance to an ApsaraDB RDS for MySQL instance](~~251779~~).
      * > : Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      *
     */
    @Override
    public CompletableFuture<UpdateUserBackupFileResponse> updateUserBackupFile(UpdateUserBackupFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserBackupFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserBackupFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserBackupFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * MySQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for MySQL instance](~~96058~~)
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceEngineVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceEngineVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceEngineVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * *   SQL Server
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Update the minor engine version of an ApsaraDB RDS for MySQL instance](~~96059~~)
      * *   [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~)
      * *   [Update the minor engine version of an ApsaraDB RDS for SQL Server instance](~~213582~~)
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceKernelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceKernelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceKernelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * Fees are generated if the call is successful. Before you call this operation, read the following documentation and make sure that you fully understand the billing rules, prerequisites, and impacts of this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~)
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceMajorVersionResponse> upgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceMajorVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceMajorVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceMajorVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engine
      * PostgreSQL
      * ### References
      * > Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
      * [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~)
      *
     */
    @Override
    public CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> upgradeDBInstanceMajorVersionPrecheck(UpgradeDBInstanceMajorVersionPrecheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBInstanceMajorVersionPrecheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBInstanceMajorVersionPrecheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Supported database engines
      * *   MySQL
      * *   PostgreSQL
      * ### References
      * > Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.
      * *   [Upgrade the dedicated proxy version of an ApsaraDB RDS for MySQL instance](~~197465~~)
      * *   [Upgrade the dedicated proxy version of an ApsaraDB RDS for PostgreSQL instance](~~418469~~)
      *
     */
    @Override
    public CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeDBProxyInstanceKernelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeDBProxyInstanceKernelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
