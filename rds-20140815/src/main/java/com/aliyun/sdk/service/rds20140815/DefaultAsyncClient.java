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
     * <b>description</b> :
     * <h3>Supported Engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * <h3>Related Function Documentation</h3>
     * <blockquote>
     * <p>Notice: Before using this interface, please carefully read the function documentation to ensure you fully understand the prerequisites and the impact of using the interface before proceeding with the operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/104183.html">RDS MySQL Scheduled Events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104452.html">RDS PostgreSQL Scheduled Events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104451.html">RDS SQL Server Scheduled Events</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/104454.html">RDS MariaDB Scheduled Events</a></li>
     * </ul>
     * <h3>Usage Restrictions</h3>
     * <p>The task cannot be canceled under the following conditions:</p>
     * <ul>
     * <li><code>allowCancel</code> is 0.</li>
     * <li>The current time is later than the task start time.</li>
     * <li>The task status is not 3 (waiting for execution).</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    @Override
    public CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelActiveOperationTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelActiveOperationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelActiveOperationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    /**
     * @param request the request parameters of CheckInstanceExist  CheckInstanceExistRequest
     * @return CheckInstanceExistResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
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
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of CopyDatabase  CopyDatabaseRequest
     * @return CopyDatabaseResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of CreateDBInstanceSecurityGroupRule  CreateDBInstanceSecurityGroupRuleRequest
     * @return CreateDBInstanceSecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<CreateDBInstanceSecurityGroupRuleResponse> createDBInstanceSecurityGroupRule(CreateDBInstanceSecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstanceSecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceSecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceSecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is no longer maintained. You can call the CreateDiagnosticReport operation of Database Autonomy Service (DAS) to create a diagnostic report.
     * After you call this operation to create a diagnostic report, you can call the DescribeDiagnosticReportList operation to download the diagnostic report.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDiagnosticReport  CreateDiagnosticReportRequest
     * @return CreateDiagnosticReportResponse
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
     * @param request the request parameters of CreateMaskingRules  CreateMaskingRulesRequest
     * @return CreateMaskingRulesResponse
     */
    @Override
    public CompletableFuture<CreateMaskingRulesResponse> createMaskingRules(CreateMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p>: Before you call this operation, carefully read the following documentation. Make sure that you fully understand the prerequisites and impacts for calling this operation.
     * <a href="https://help.aliyun.com/document_detail/2402409.html">Manage extensions</a></p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>Install only the plug-ins that are supported by the major engine version of the instance. Otherwise, the installation fails.</p>
     * <ul>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/142340.html">Extensions supported by ApsaraDB RDS for PostgreSQL</a>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to query the major engine version of an instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePostgresExtensions  CreatePostgresExtensionsRequest
     * @return CreatePostgresExtensionsResponse
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
     * @param request the request parameters of CreateRCDeploymentSet  CreateRCDeploymentSetRequest
     * @return CreateRCDeploymentSetResponse
     */
    @Override
    public CompletableFuture<CreateRCDeploymentSetResponse> createRCDeploymentSet(CreateRCDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRCDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRCDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRCDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of CreateReplicationLink  CreateReplicationLinkRequest
     * @return CreateReplicationLinkResponse
     */
    @Override
    public CompletableFuture<CreateReplicationLinkResponse> createReplicationLink(CreateReplicationLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateReplicationLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateReplicationLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateReplicationLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    /**
     * @param request the request parameters of CreateYouhuiForOrder  CreateYouhuiForOrderRequest
     * @return CreateYouhuiForOrderResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteADSetting  DeleteADSettingRequest
     * @return DeleteADSettingResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>You can delete only the public endpoint of each endpoint type from the instance. If you want to delete an internal endpoint of any endpoint type, you can directly delete the type of endpoint.</p>
     * 
     * @param request the request parameters of DeleteDBInstanceEndpointAddress  DeleteDBInstanceEndpointAddressRequest
     * @return DeleteDBInstanceEndpointAddressResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of DeleteDBInstanceSecurityGroupRule  DeleteDBInstanceSecurityGroupRuleRequest
     * @return DeleteDBInstanceSecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDBInstanceSecurityGroupRuleResponse> deleteDBInstanceSecurityGroupRule(DeleteDBInstanceSecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstanceSecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceSecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceSecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DeleteMaskingRules  DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    @Override
    public CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    /**
     * @param request the request parameters of DeleteRCDeploymentSet  DeleteRCDeploymentSetRequest
     * @return DeleteRCDeploymentSetResponse
     */
    @Override
    public CompletableFuture<DeleteRCDeploymentSetResponse> deleteRCDeploymentSet(DeleteRCDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRCInstance  DeleteRCInstanceRequest
     * @return DeleteRCInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteRCInstanceResponse> deleteRCInstance(DeleteRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</p>
     * 
     * @param request the request parameters of DeleteRCInstances  DeleteRCInstancesRequest
     * @return DeleteRCInstancesResponse
     */
    @Override
    public CompletableFuture<DeleteRCInstancesResponse> deleteRCInstances(DeleteRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteReplicationLinkResponse> deleteReplicationLink(DeleteReplicationLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteReplicationLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteReplicationLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteReplicationLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescibeImportsFromDatabase  DescibeImportsFromDatabaseRequest
     * @return DescibeImportsFromDatabaseResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeADInfo  DescribeADInfoRequest
     * @return DescribeADInfoResponse
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
     * @param request the request parameters of DescribeAccountMaskingPrivilege  DescribeAccountMaskingPrivilegeRequest
     * @return DescribeAccountMaskingPrivilegeResponse
     */
    @Override
    public CompletableFuture<DescribeAccountMaskingPrivilegeResponse> describeAccountMaskingPrivilege(DescribeAccountMaskingPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccountMaskingPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountMaskingPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountMaskingPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>MySQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/155180.html">Create and view an analytic instance</a></p>
     * 
     * @param request the request parameters of DescribeAnalyticdbByPrimaryDBInstance  DescribeAnalyticdbByPrimaryDBInstanceRequest
     * @return DescribeAnalyticdbByPrimaryDBInstanceResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is phased out.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeBackupDatabase  DescribeBackupDatabaseRequest
     * @return DescribeBackupDatabaseResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudMigrationPrecheckResult  DescribeCloudMigrationPrecheckResultRequest
     * @return DescribeCloudMigrationPrecheckResultResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudMigrationResult  DescribeCloudMigrationResultRequest
     * @return DescribeCloudMigrationResultResponse
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
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>SQL Server</p>
     * 
     * @param request the request parameters of DescribeCollationTimeZones  DescribeCollationTimeZonesRequest
     * @return DescribeCollationTimeZonesResponse
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

    /**
     * @param request the request parameters of DescribeCurrentModifyOrder  DescribeCurrentModifyOrderRequest
     * @return DescribeCurrentModifyOrderResponse
     */
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

    /**
     * @param request the request parameters of DescribeCustinsResourceInfo  DescribeCustinsResourceInfoRequest
     * @return DescribeCustinsResourceInfoResponse
     */
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

    /**
     * @param request the request parameters of DescribeDBInstanceConnectivity  DescribeDBInstanceConnectivityRequest
     * @return DescribeDBInstanceConnectivityResponse
     */
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
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDetail  DescribeDBInstanceDetailRequest
     * @return DescribeDBInstanceDetailResponse
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

    /**
     * @param request the request parameters of DescribeDBInstanceEncryptionKey  DescribeDBInstanceEncryptionKeyRequest
     * @return DescribeDBInstanceEncryptionKeyResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * 
     * @param request the request parameters of DescribeDBInstanceEndpoints  DescribeDBInstanceEndpointsRequest
     * @return DescribeDBInstanceEndpointsResponse
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
     * @deprecated OpenAPI DescribeDBInstancePromoteActivity is deprecated  * @param request  the request parameters of DescribeDBInstancePromoteActivity  DescribeDBInstancePromoteActivityRequest
     * @return DescribeDBInstancePromoteActivityResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of DescribeDBInstanceSecurityGroupRule  DescribeDBInstanceSecurityGroupRuleRequest
     * @return DescribeDBInstanceSecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSecurityGroupRuleResponse> describeDBInstanceSecurityGroupRule(DescribeDBInstanceSecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @deprecated OpenAPI DescribeDBInstancesAsCsv is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description >  The DescribeDBInstancesAsCsv operation is phased out. You can call the DescribeDBInstances operation.
     * 
     * @param request the request parameters of DescribeDBInstancesAsCsv  DescribeDBInstancesAsCsvRequest
     * @return DescribeDBInstancesAsCsvResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstancesByPerformance  DescribeDBInstancesByPerformanceRequest
     * @return DescribeDBInstancesByPerformanceResponse
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
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeDBInstancesForClone  DescribeDBInstancesForCloneRequest
     * @return DescribeDBInstancesForCloneResponse
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
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances in a cluster at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of DescribeDedicatedHostGroups  DescribeDedicatedHostGroupsRequest
     * @return DescribeDedicatedHostGroupsResponse
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
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
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
     * @deprecated OpenAPI DescribeDiagnosticReportList is deprecated  * @description >  This operation is phased out.
     * 
     * @param request the request parameters of DescribeDiagnosticReportList  DescribeDiagnosticReportListRequest
     * @return DescribeDiagnosticReportListResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeGadInstances  DescribeGadInstancesRequest
     * @return DescribeGadInstancesResponse
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

    /**
     * @param request the request parameters of DescribeHistoryEvents  DescribeHistoryEventsRequest
     * @return DescribeHistoryEventsResponse
     */
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

    /**
     * @param request the request parameters of DescribeHistoryEventsStat  DescribeHistoryEventsStatRequest
     * @return DescribeHistoryEventsStatResponse
     */
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

    /**
     * @param request the request parameters of DescribeHistoryTasksStat  DescribeHistoryTasksStatRequest
     * @return DescribeHistoryTasksStatResponse
     */
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

    /**
     * @param request the request parameters of DescribeHostGroupElasticStrategyParameters  DescribeHostGroupElasticStrategyParametersRequest
     * @return DescribeHostGroupElasticStrategyParametersResponse
     */
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

    /**
     * @param request the request parameters of DescribeMarketingActivity  DescribeMarketingActivityRequest
     * @return DescribeMarketingActivityResponse
     */
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
     * @param request the request parameters of DescribeMaskingRules  DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    @Override
    public CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMigrateTaskById  DescribeMigrateTaskByIdRequest
     * @return DescribeMigrateTaskByIdResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * 
     * @param request the request parameters of DescribeModifyPGHbaConfigLog  DescribeModifyPGHbaConfigLogRequest
     * @return DescribeModifyPGHbaConfigLogResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS PostgreSQL</p>
     * 
     * @param request the request parameters of DescribePGHbaConfig  DescribePGHbaConfigRequest
     * @return DescribePGHbaConfigResponse
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

    /**
     * @param request the request parameters of DescribeQuickSaleConfig  DescribeQuickSaleConfigRequest
     * @return DescribeQuickSaleConfigResponse
     */
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
     * @param request the request parameters of DescribeRCDeploymentSets  DescribeRCDeploymentSetsRequest
     * @return DescribeRCDeploymentSetsResponse
     */
    @Override
    public CompletableFuture<DescribeRCDeploymentSetsResponse> describeRCDeploymentSets(DescribeRCDeploymentSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCDeploymentSets").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCDeploymentSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCDeploymentSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCImageList  DescribeRCImageListRequest
     * @return DescribeRCImageListResponse
     */
    @Override
    public CompletableFuture<DescribeRCImageListResponse> describeRCImageList(DescribeRCImageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCImageList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCImageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCImageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCInstanceAttribute  DescribeRCInstanceAttributeRequest
     * @return DescribeRCInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstanceAttributeResponse> describeRCInstanceAttribute(DescribeRCInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCInstances  DescribeRCInstancesRequest
     * @return DescribeRCInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstancesResponse> describeRCInstances(DescribeRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCMetricList  DescribeRCMetricListRequest
     * @return DescribeRCMetricListResponse
     */
    @Override
    public CompletableFuture<DescribeRCMetricListResponse> describeRCMetricList(DescribeRCMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCMetricList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRdsResourceSettings is deprecated  * @param request  the request parameters of DescribeRdsResourceSettings  DescribeRdsResourceSettingsRequest
     * @return DescribeRdsResourceSettingsResponse
     */
    @Deprecated
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
    @Override
    public CompletableFuture<DescribeReplicationLinkLogsResponse> describeReplicationLinkLogs(DescribeReplicationLinkLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReplicationLinkLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReplicationLinkLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReplicationLinkLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResourceDetails  DescribeResourceDetailsRequest
     * @return DescribeResourceDetailsResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>MySQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecrets  DescribeSecretsRequest
     * @return DescribeSecretsResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSlots  DescribeSlotsRequest
     * @return DescribeSlotsResponse
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
     * <b>description</b> :
     * <h3>Supported database engine</h3>
     * <p>SQL Server</p>
     * 
     * @param request the request parameters of DescribeSupportOnlineResizeDisk  DescribeSupportOnlineResizeDiskRequest
     * @return DescribeSupportOnlineResizeDiskResponse
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
     * <b>description</b> :
     * <p>This operation is phased out.</p>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PostgreSQL</p>
     * 
     * @param request the request parameters of DescribeUpgradeMajorVersionTasks  DescribeUpgradeMajorVersionTasksRequest
     * @return DescribeUpgradeMajorVersionTasksResponse
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
     * <b>description</b> :
     * <p>The DestroyDBInstance operation is phased out.</p>
     * 
     * @param request the request parameters of DestroyDBInstance  DestroyDBInstanceRequest
     * @return DestroyDBInstanceResponse
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

    /**
     * @param request the request parameters of EvaluateLocalExtendDisk  EvaluateLocalExtendDiskRequest
     * @return EvaluateLocalExtendDiskResponse
     */
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
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>RDS MariaDB</li>
     * </ul>
     * 
     * @param request the request parameters of GetDBInstanceTopology  GetDBInstanceTopologyRequest
     * @return GetDBInstanceTopologyResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>RDS MySQL</p>
     * 
     * @param request the request parameters of GetDbProxyInstanceSsl  GetDbProxyInstanceSslRequest
     * @return GetDbProxyInstanceSslResponse
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
     * <b>description</b> :
     * <p>Each account can be granted permissions on one or more databases. Before you call this operation, make sure that the instance is in the Running state.</p>
     * <blockquote>
     * <p>This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL with local disks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
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
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of MigrateDBInstance  MigrateDBInstanceRequest
     * @return MigrateDBInstanceResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAccountCheckPolicy  ModifyAccountCheckPolicyRequest
     * @return ModifyAccountCheckPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyAccountCheckPolicyResponse> modifyAccountCheckPolicy(ModifyAccountCheckPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountCheckPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountCheckPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountCheckPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of ModifyAccountMaskingPrivilege  ModifyAccountMaskingPrivilegeRequest
     * @return ModifyAccountMaskingPrivilegeResponse
     */
    @Override
    public CompletableFuture<ModifyAccountMaskingPrivilegeResponse> modifyAccountMaskingPrivilege(ModifyAccountMaskingPrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountMaskingPrivilege").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountMaskingPrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountMaskingPrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyAccountSecurityPolicyResponse> modifyAccountSecurityPolicy(ModifyAccountSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    /**
     * @param request the request parameters of ModifyCustinsResource  ModifyCustinsResourceRequest
     * @return ModifyCustinsResourceResponse
     */
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

    /**
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>MySQL</p>
     * 
     * @param request the request parameters of ModifyDBInstanceEndpoint  ModifyDBInstanceEndpointRequest
     * @return ModifyDBInstanceEndpointResponse
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

    /**
     * @param request the request parameters of ModifyDBInstanceHAConfig  ModifyDBInstanceHAConfigRequest
     * @return ModifyDBInstanceHAConfigResponse
     */
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>SQL Server</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group settings for an ApsaraDB RDS for SQL Server instance</a></p>
     * 
     * @param request the request parameters of ModifyDBInstanceSecurityGroupRule  ModifyDBInstanceSecurityGroupRuleRequest
     * @return ModifyDBInstanceSecurityGroupRuleResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceSecurityGroupRuleResponse> modifyDBInstanceSecurityGroupRule(ModifyDBInstanceSecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceSecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceSecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceSecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <li><a href="https://help.aliyun.com/document_detail/197456.html">Enable and configure the dedicated proxy feature for an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418272.html">Enable and configure the dedicated proxy feature for an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxy  ModifyDBProxyRequest
     * @return ModifyDBProxyResponse
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
     * <b>description</b> :
     * <h3>Supported database engines</h3>
     * <ul>
     * <li>MySQL</li>
     * <li>PostgreSQL</li>
     * </ul>
     * <h3>References</h3>
     * <blockquote>
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/184921.html">Configure the dedicated proxy endpoint of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/418274.html">Configure the dedicated proxy endpoint of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBProxyEndpointAddress  ModifyDBProxyEndpointAddressRequest
     * @return ModifyDBProxyEndpointAddressResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can call this operation to modify the database properties of an ApsaraDB RDS for SQL Server instance and archive data from an instance that uses general Enterprise SSDs (ESSDs) to an Object Storage Service (OSS) bucket. Before you call this operation to archive data to an OSS bucket, you must enable the data archiving feature in the ApsaraDB RDS console. For more information, see <a href="https://help.aliyun.com/document_detail/2401398.html">Modify database properties</a> and <a href="https://help.aliyun.com/document_detail/2767189.html">Archive cloud disk data to an OSS bucket</a>.</p>
     * <blockquote>
     * <p>: Before you call this operation, read the preceding topics and make sure that you fully understand the prerequisites and impacts of this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDatabaseConfig  ModifyDatabaseConfigRequest
     * @return ModifyDatabaseConfigResponse
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

    /**
     * @param request the request parameters of ModifyEventInfo  ModifyEventInfoRequest
     * @return ModifyEventInfoResponse
     */
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
     * @param request the request parameters of ModifyMaskingRules  ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    @Override
    public CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMaskingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMaskingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMaskingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyRCInstanceResponse> modifyRCInstance(ModifyRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCInstanceChargeType  ModifyRCInstanceChargeTypeRequest
     * @return ModifyRCInstanceChargeTypeResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceChargeTypeResponse> modifyRCInstanceChargeType(ModifyRCInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    /**
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
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

    /**
     * @param request the request parameters of PreCheckCreateOrderForDeleteDBNodes  PreCheckCreateOrderForDeleteDBNodesRequest
     * @return PreCheckCreateOrderForDeleteDBNodesResponse
     */
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

    /**
     * @param request the request parameters of QueryRecommendByCode  QueryRecommendByCodeRequest
     * @return QueryRecommendByCodeResponse
     */
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
     * @param request the request parameters of RebootRCInstance  RebootRCInstanceRequest
     * @return RebootRCInstanceResponse
     */
    @Override
    public CompletableFuture<RebootRCInstanceResponse> rebootRCInstance(RebootRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB MyBase?</a></p>
     * 
     * @param request the request parameters of RebuildDBInstance  RebuildDBInstanceRequest
     * @return RebuildDBInstanceResponse
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <ul>
     * <li>PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of RebuildReplicationLink  RebuildReplicationLinkRequest
     * @return RebuildReplicationLinkResponse
     */
    @Override
    public CompletableFuture<RebuildReplicationLinkResponse> rebuildReplicationLink(RebuildReplicationLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebuildReplicationLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebuildReplicationLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebuildReplicationLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The operation is phased out.</p>
     * 
     * @param request the request parameters of ReceiveDBInstance  ReceiveDBInstanceRequest
     * @return ReceiveDBInstanceResponse
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
     * @param request the request parameters of ResizeRCInstanceDisk  ResizeRCInstanceDiskRequest
     * @return ResizeRCInstanceDiskResponse
     */
    @Override
    public CompletableFuture<ResizeRCInstanceDiskResponse> resizeRCInstanceDisk(ResizeRCInstanceDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeRCInstanceDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeRCInstanceDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeRCInstanceDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RunRCInstancesResponse> runRCInstances(RunRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>Before you call this operation, read the following documentation and make sure that you fully understand the prerequisites and impacts of this operation:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/427093.html">Resume an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/452314.html">Resume an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462504.html">Resume an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of StartDBInstance  StartDBInstanceRequest
     * @return StartDBInstanceResponse
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
     * @param request the request parameters of StartRCInstance  StartRCInstanceRequest
     * @return StartRCInstanceResponse
     */
    @Override
    public CompletableFuture<StartRCInstanceResponse> startRCInstance(StartRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <li><a href="https://help.aliyun.com/document_detail/427093.html">Suspend an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/452314.html">Suspend an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462504.html">Suspend an ApsaraDB RDS for SQL Server instance</a></li>
     * </ul>
     * 
     * @param request the request parameters of StopDBInstance  StopDBInstanceRequest
     * @return StopDBInstanceResponse
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
     * @param request the request parameters of StopRCInstance  StopRCInstanceRequest
     * @return StopRCInstanceResponse
     */
    @Override
    public CompletableFuture<StopRCInstanceResponse> stopRCInstance(StopRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of SyncRCKeyPair  SyncRCKeyPairRequest
     * @return SyncRCKeyPairResponse
     */
    @Override
    public CompletableFuture<SyncRCKeyPairResponse> syncRCKeyPair(SyncRCKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncRCKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncRCKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncRCKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>SQL Server</li>
     * </ul>
     * 
     * @param request the request parameters of TerminateMigrateTask  TerminateMigrateTaskRequest
     * @return TerminateMigrateTaskResponse
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
