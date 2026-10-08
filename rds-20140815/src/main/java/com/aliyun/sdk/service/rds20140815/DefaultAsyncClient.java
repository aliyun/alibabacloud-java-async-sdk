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
     * @param request the request parameters of AcceptRCInquiredSystemEvent  AcceptRCInquiredSystemEventRequest
     * @return AcceptRCInquiredSystemEventResponse
     */
    @Override
    public CompletableFuture<AcceptRCInquiredSystemEventResponse> acceptRCInquiredSystemEvent(AcceptRCInquiredSystemEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptRCInquiredSystemEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptRCInquiredSystemEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptRCInquiredSystemEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>Instances with local disks are not allowed to join a deployment set by default, and the error UNSUPPORTED_DBINSTANCE_OPERATEION is returned. To add such instances, contact technical support. Ask the administrator to add the UID to the whitelist. Cloud disk instances do not have this restriction.
     * Forcibly adding instances to a deployment set may cause instance restarts. Use this feature with caution.</p>
     * 
     * @param request the request parameters of AddRCInstancesToDeploymentSet  AddRCInstancesToDeploymentSetRequest
     * @return AddRCInstancesToDeploymentSetResponse
     */
    @Override
    public CompletableFuture<AddRCInstancesToDeploymentSetResponse> addRCInstancesToDeploymentSet(AddRCInstancesToDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRCInstancesToDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRCInstancesToDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRCInstancesToDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AssociateEipAddressWithRCInstanceResponse> associateEipAddressWithRCInstance(AssociateEipAddressWithRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateEipAddressWithRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateEipAddressWithRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateEipAddressWithRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AttachRCDiskResponse> attachRCDisk(AttachRCDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachRCDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachRCDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachRCDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachRCInstances  AttachRCInstancesRequest
     * @return AttachRCInstancesResponse
     */
    @Override
    public CompletableFuture<AttachRCInstancesResponse> attachRCInstances(AttachRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of AuthorizeBackupEncryption  AuthorizeBackupEncryptionRequest
     * @return AuthorizeBackupEncryptionResponse
     */
    @Override
    public CompletableFuture<AuthorizeBackupEncryptionResponse> authorizeBackupEncryption(AuthorizeBackupEncryptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeBackupEncryption").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeBackupEncryptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeBackupEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthorizeRCSecurityGroupPermission  AuthorizeRCSecurityGroupPermissionRequest
     * @return AuthorizeRCSecurityGroupPermissionResponse
     */
    @Override
    public CompletableFuture<AuthorizeRCSecurityGroupPermissionResponse> authorizeRCSecurityGroupPermission(AuthorizeRCSecurityGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeRCSecurityGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeRCSecurityGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeRCSecurityGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of CheckBackupEncryptionAuthorized  CheckBackupEncryptionAuthorizedRequest
     * @return CheckBackupEncryptionAuthorizedResponse
     */
    @Override
    public CompletableFuture<CheckBackupEncryptionAuthorizedResponse> checkBackupEncryptionAuthorized(CheckBackupEncryptionAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckBackupEncryptionAuthorized").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckBackupEncryptionAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckBackupEncryptionAuthorizedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of CheckRdsCustomInit  CheckRdsCustomInitRequest
     * @return CheckRdsCustomInitResponse
     */
    @Override
    public CompletableFuture<CheckRdsCustomInitResponse> checkRdsCustomInit(CheckRdsCustomInitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckRdsCustomInit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRdsCustomInitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRdsCustomInitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckRegionSupportBackupEncryption  CheckRegionSupportBackupEncryptionRequest
     * @return CheckRegionSupportBackupEncryptionResponse
     */
    @Override
    public CompletableFuture<CheckRegionSupportBackupEncryptionResponse> checkRegionSupportBackupEncryption(CheckRegionSupportBackupEncryptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckRegionSupportBackupEncryption").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRegionSupportBackupEncryptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRegionSupportBackupEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of CreateDBInstanceReplication  CreateDBInstanceReplicationRequest
     * @return CreateDBInstanceReplicationResponse
     */
    @Override
    public CompletableFuture<CreateDBInstanceReplicationResponse> createDBInstanceReplication(CreateDBInstanceReplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDBInstanceReplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDBInstanceReplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDBInstanceReplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <p>Creates a data import task for importing data to an ApsaraDB RDS for MySQL instance with native replication.</p>
     * 
     * @param request the request parameters of CreateImportTask  CreateImportTaskRequest
     * @return CreateImportTaskResponse
     */
    @Override
    public CompletableFuture<CreateImportTaskResponse> createImportTask(CreateImportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateRCDiskResponse> createRCDisk(CreateRCDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRCDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRCDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRCDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateRCImageResponse> createRCImage(CreateRCImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRCImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRCImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRCImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRCNodePool  CreateRCNodePoolRequest
     * @return CreateRCNodePoolResponse
     */
    @Override
    public CompletableFuture<CreateRCNodePoolResponse> createRCNodePool(CreateRCNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRCNodePool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRCNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRCNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateRCSnapshotResponse> createRCSnapshot(CreateRCSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRCSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRCSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRCSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>RDS MySQL</li>
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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
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
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p><strong>This operation is not available to new users.</strong> You can use other methods to <a href="https://help.aliyun.com/document_detail/95718.html">reduce or save backup storage costs</a>. Users who were previously added to the whitelist can still use this operation normally. Before you delete backup sets, confirm the availability of the backup sets. Deleted backup sets cannot be recovered.</p>
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
     * @param request the request parameters of DeleteDBInstanceReplication  DeleteDBInstanceReplicationRequest
     * @return DeleteDBInstanceReplicationResponse
     */
    @Override
    public CompletableFuture<DeleteDBInstanceReplicationResponse> deleteDBInstanceReplication(DeleteDBInstanceReplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDBInstanceReplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDBInstanceReplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDBInstanceReplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteParameterTimedScheduleTaskResponse> deleteParameterTimedScheduleTask(DeleteParameterTimedScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParameterTimedScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParameterTimedScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParameterTimedScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DeleteRCClusterNodes  DeleteRCClusterNodesRequest
     * @return DeleteRCClusterNodesResponse
     */
    @Override
    public CompletableFuture<DeleteRCClusterNodesResponse> deleteRCClusterNodes(DeleteRCClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCClusterNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCClusterNodesResponse> future = new CompletableFuture<>();
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
    @Override
    public CompletableFuture<DeleteRCDiskResponse> deleteRCDisk(DeleteRCDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCDiskResponse> future = new CompletableFuture<>();
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
     * <p>After an instance is released, all physical resources used by the instance are reclaimed, and all related data is permanently lost and cannot be recovered.</p>
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
     * @param request the request parameters of DeleteRCNodePool  DeleteRCNodePoolRequest
     * @return DeleteRCNodePoolResponse
     */
    @Override
    public CompletableFuture<DeleteRCNodePoolResponse> deleteRCNodePool(DeleteRCNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCNodePool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteRCSnapshotResponse> deleteRCSnapshot(DeleteRCSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRCVCluster  DeleteRCVClusterRequest
     * @return DeleteRCVClusterResponse
     */
    @Override
    public CompletableFuture<DeleteRCVClusterResponse> deleteRCVCluster(DeleteRCVClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRCVCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRCVClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRCVClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
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
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
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
     * @param request the request parameters of DescribeActiveOperationMaintainConf  DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    @Override
    public CompletableFuture<DescribeActiveOperationMaintainConfResponse> describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActiveOperationMaintainConf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActiveOperationMaintainConfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActiveOperationMaintainConfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Supported engine</h3>
     * <p>RDS MySQL</p>
     * <h3>Related documentation</h3>
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/155180.html">Create and view MySQL analytical instances</a></p>
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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server.</p>
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
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2928780.html">Committed serverless</a></p>
     * 
     * @param request the request parameters of DescribeComputeBurstConfig  DescribeComputeBurstConfigRequest
     * @return DescribeComputeBurstConfigResponse
     */
    @Override
    public CompletableFuture<DescribeComputeBurstConfigResponse> describeComputeBurstConfig(DescribeComputeBurstConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeComputeBurstConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeComputeBurstConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeComputeBurstConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeDBInstanceCLSResponse> describeDBInstanceCLS(DescribeDBInstanceCLSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceCLS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceCLSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceCLSResponse> future = new CompletableFuture<>();
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
     * <h3>Supported engine</h3>
     * <p>RDS SQL Server.</p>
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
     * @deprecated OpenAPI DescribeDBInstancePromoteActivity is deprecated  * @description This operation is no longer maintained. **You can still call this operation, but Alibaba Cloud no longer maintains it**.
     * 
     * @param request the request parameters of DescribeDBInstancePromoteActivity  DescribeDBInstancePromoteActivityRequest
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
    @Override
    public CompletableFuture<DescribeDBInstanceReplicationResponse> describeDBInstanceReplication(DescribeDBInstanceReplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceReplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceReplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceReplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for ApsaraDB RDS for SQL Server</a></p>
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
     * <p>This operation is used to query the primary/secondary switchover logs of an instance. This operation is applicable to ApsaraDB RDS for MySQL High-availability Edition instances, ApsaraDB RDS for MySQL RDS Enterprise Edition Enterprise instances, ApsaraDB RDS for SQL Server instances, ApsaraDB RDS for PostgreSQL instances, and PPAS instances.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceSwitchLog  DescribeDBInstanceSwitchLogRequest
     * @return DescribeDBInstanceSwitchLogResponse
     */
    @Override
    public CompletableFuture<DescribeDBInstanceSwitchLogResponse> describeDBInstanceSwitchLog(DescribeDBInstanceSwitchLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDBInstanceSwitchLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDBInstanceSwitchLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDBInstanceSwitchLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @deprecated OpenAPI DescribeDBInstancesAsCsv is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description This operation is no longer maintained: **the operation can still be called, but Alibaba Cloud no longer maintains it**. Use the **DescribeDBInstances** operation instead.
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
     * @deprecated OpenAPI DescribeDBInstancesForClone is deprecated, please use Rds::2014-08-15::DescribeDBInstances instead.  * @description This operation is no longer maintained: **the operation can still be called, but Alibaba Cloud no longer maintains it**. Use the [DescribeDBInstances](https://help.aliyun.com/document_detail/610396.html) operation to query the details of new instances.
     * 
     * @param request the request parameters of DescribeDBInstancesForClone  DescribeDBInstancesForCloneRequest
     * @return DescribeDBInstancesForCloneResponse
     */
    @Deprecated
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
     * <h3>Supported engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
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
     * <h3>Supported engines</h3>
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
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
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
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
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
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS MySQL</li>
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
     * <p>Queries the details of a data import task.</p>
     * 
     * @param request the request parameters of DescribeImportTask  DescribeImportTaskRequest
     * @return DescribeImportTaskResponse
     */
    @Override
    public CompletableFuture<DescribeImportTaskResponse> describeImportTask(DescribeImportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of an import task dry run.</p>
     * 
     * @param request the request parameters of DescribeImportTaskValidation  DescribeImportTaskValidationRequest
     * @return DescribeImportTaskValidationResponse
     */
    @Override
    public CompletableFuture<DescribeImportTaskValidationResponse> describeImportTaskValidation(DescribeImportTaskValidationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImportTaskValidation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImportTaskValidationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImportTaskValidationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p>To view log files of other engines, call DescribeBinlogFiles.</p>
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
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
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
    @Override
    public CompletableFuture<DescribeParameterTimedScheduleTaskResponse> describeParameterTimedScheduleTask(DescribeParameterTimedScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeParameterTimedScheduleTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeParameterTimedScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeParameterTimedScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DescribeRCAvailableResource  DescribeRCAvailableResourceRequest
     * @return DescribeRCAvailableResourceResponse
     */
    @Override
    public CompletableFuture<DescribeRCAvailableResourceResponse> describeRCAvailableResource(DescribeRCAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCCloudAssistantStatus  DescribeRCCloudAssistantStatusRequest
     * @return DescribeRCCloudAssistantStatusResponse
     */
    @Override
    public CompletableFuture<DescribeRCCloudAssistantStatusResponse> describeRCCloudAssistantStatus(DescribeRCCloudAssistantStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCCloudAssistantStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCCloudAssistantStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCCloudAssistantStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>KubeConfig is used to configure access credentials for an ACK cluster on the client. It contains identity and authentication data for accessing the target cluster. When you use kubectl for cluster management, you need to connect through KubeConfig. Properly manage the KubeConfig credentials of the cluster and revoke them promptly when they are no longer needed to avoid security risks such as data leaks caused by KubeConfig exposure.</p>
     * 
     * @param request the request parameters of DescribeRCClusterConfig  DescribeRCClusterConfigRequest
     * @return DescribeRCClusterConfigResponse
     */
    @Override
    public CompletableFuture<DescribeRCClusterConfigResponse> describeRCClusterConfig(DescribeRCClusterConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCClusterConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCClusterConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCClusterConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCClusterNodes  DescribeRCClusterNodesRequest
     * @return DescribeRCClusterNodesResponse
     */
    @Override
    public CompletableFuture<DescribeRCClusterNodesResponse> describeRCClusterNodes(DescribeRCClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCClusterNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCClusterNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCClusters  DescribeRCClustersRequest
     * @return DescribeRCClustersResponse
     */
    @Override
    public CompletableFuture<DescribeRCClustersResponse> describeRCClusters(DescribeRCClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCClustersResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRCDisks  DescribeRCDisksRequest
     * @return DescribeRCDisksResponse
     */
    @Override
    public CompletableFuture<DescribeRCDisksResponse> describeRCDisks(DescribeRCDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCDisks").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCElasticScaling  DescribeRCElasticScalingRequest
     * @return DescribeRCElasticScalingResponse
     */
    @Override
    public CompletableFuture<DescribeRCElasticScalingResponse> describeRCElasticScaling(DescribeRCElasticScalingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCElasticScaling").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCElasticScalingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCElasticScalingResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeRCInstanceDdosCountResponse> describeRCInstanceDdosCount(DescribeRCInstanceDdosCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceDdosCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceDdosCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceDdosCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCInstanceHistoryEvents  DescribeRCInstanceHistoryEventsRequest
     * @return DescribeRCInstanceHistoryEventsResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstanceHistoryEventsResponse> describeRCInstanceHistoryEvents(DescribeRCInstanceHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeRCInstanceIpAddressResponse> describeRCInstanceIpAddress(DescribeRCInstanceIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCInstanceTypeFamilies  DescribeRCInstanceTypeFamiliesRequest
     * @return DescribeRCInstanceTypeFamiliesResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstanceTypeFamiliesResponse> describeRCInstanceTypeFamilies(DescribeRCInstanceTypeFamiliesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceTypeFamilies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceTypeFamiliesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceTypeFamiliesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCInstanceTypes  DescribeRCInstanceTypesRequest
     * @return DescribeRCInstanceTypesResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstanceTypesResponse> describeRCInstanceTypes(DescribeRCInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The VNC logon URL is time-sensitive and valid for 15 seconds. If you do not use the URL within 15 seconds after the call succeeds, the URL automatically expires. In this case, call the operation again to obtain a new URL.</p>
     * 
     * @param request the request parameters of DescribeRCInstanceVncUrl  DescribeRCInstanceVncUrlRequest
     * @return DescribeRCInstanceVncUrlResponse
     */
    @Override
    public CompletableFuture<DescribeRCInstanceVncUrlResponse> describeRCInstanceVncUrl(DescribeRCInstanceVncUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInstanceVncUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInstanceVncUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInstanceVncUrlResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRCInvocationResults  DescribeRCInvocationResultsRequest
     * @return DescribeRCInvocationResultsResponse
     */
    @Override
    public CompletableFuture<DescribeRCInvocationResultsResponse> describeRCInvocationResults(DescribeRCInvocationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCInvocationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCInvocationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCInvocationResultsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRCNetworkInterfaces  DescribeRCNetworkInterfacesRequest
     * @return DescribeRCNetworkInterfacesResponse
     */
    @Override
    public CompletableFuture<DescribeRCNetworkInterfacesResponse> describeRCNetworkInterfaces(DescribeRCNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCNodePool  DescribeRCNodePoolRequest
     * @return DescribeRCNodePoolResponse
     */
    @Override
    public CompletableFuture<DescribeRCNodePoolResponse> describeRCNodePool(DescribeRCNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCNodePool").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCResourcesModification  DescribeRCResourcesModificationRequest
     * @return DescribeRCResourcesModificationResponse
     */
    @Override
    public CompletableFuture<DescribeRCResourcesModificationResponse> describeRCResourcesModification(DescribeRCResourcesModificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCResourcesModification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCResourcesModificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCResourcesModificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCSecurityGroupList  DescribeRCSecurityGroupListRequest
     * @return DescribeRCSecurityGroupListResponse
     */
    @Override
    public CompletableFuture<DescribeRCSecurityGroupListResponse> describeRCSecurityGroupList(DescribeRCSecurityGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCSecurityGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCSecurityGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCSecurityGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCSecurityGroupPermission  DescribeRCSecurityGroupPermissionRequest
     * @return DescribeRCSecurityGroupPermissionResponse
     */
    @Override
    public CompletableFuture<DescribeRCSecurityGroupPermissionResponse> describeRCSecurityGroupPermission(DescribeRCSecurityGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCSecurityGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCSecurityGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCSecurityGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCSnapshots  DescribeRCSnapshotsRequest
     * @return DescribeRCSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeRCSnapshotsResponse> describeRCSnapshots(DescribeRCSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRCVCluster  DescribeRCVClusterRequest
     * @return DescribeRCVClusterResponse
     */
    @Override
    public CompletableFuture<DescribeRCVClusterResponse> describeRCVCluster(DescribeRCVClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRCVCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRCVClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRCVClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeRdsResourceSettings is deprecated  * @description This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it.
     * 
     * @param request the request parameters of DescribeRdsResourceSettings  DescribeRdsResourceSettingsRequest
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
     * <h3>Applicable engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
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
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation instead.</p>
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
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation instead.</p>
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
     * <p>Applicable engine:</p>
     * <ul>
     * <li>SQL Server (only versions 2016 and earlier are supported)</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSQLServerUpgradeVersions  DescribeSQLServerUpgradeVersionsRequest
     * @return DescribeSQLServerUpgradeVersionsResponse
     */
    @Override
    public CompletableFuture<DescribeSQLServerUpgradeVersionsResponse> describeSQLServerUpgradeVersions(DescribeSQLServerUpgradeVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSQLServerUpgradeVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSQLServerUpgradeVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSQLServerUpgradeVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
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
     * <h3>Applicable engine</h3>
     * <p>RDS SQL Server.</p>
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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <blockquote>
     * <p>For ApsaraDB RDS for MySQL and ApsaraDB RDS for PostgreSQL instances, use <a href="https://help.aliyun.com/document_detail/2627863.html">DescribeHistoryTasks</a> to query tasks.</p>
     * </blockquote>
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
     * <h3>Supported engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL.</p>
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
     * @param request the request parameters of DescribeVSwitchList  DescribeVSwitchListRequest
     * @return DescribeVSwitchListResponse
     */
    @Override
    public CompletableFuture<DescribeVSwitchListResponse> describeVSwitchList(DescribeVSwitchListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitchList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVSwitchListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVSwitchListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    @Override
    public CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of DetachRCDisk  DetachRCDiskRequest
     * @return DetachRCDiskResponse
     */
    @Override
    public CompletableFuture<DetachRCDiskResponse> detachRCDisk(DetachRCDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachRCDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachRCDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachRCDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of EnableBackupEncryption  EnableBackupEncryptionRequest
     * @return EnableBackupEncryptionResponse
     */
    @Override
    public CompletableFuture<EnableBackupEncryptionResponse> enableBackupEncryption(EnableBackupEncryptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableBackupEncryption").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableBackupEncryptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableBackupEncryptionResponse> future = new CompletableFuture<>();
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
     * <h3>Applicable engine</h3>
     * <p>RDS MySQL.</p>
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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL.</p>
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
     * @param request the request parameters of InstallRCCloudAssistant  InstallRCCloudAssistantRequest
     * @return InstallRCCloudAssistantResponse
     */
    @Override
    public CompletableFuture<InstallRCCloudAssistantResponse> installRCCloudAssistant(InstallRCCloudAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallRCCloudAssistant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallRCCloudAssistantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallRCCloudAssistantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>Queries a list of data import tasks for native replication instances.</p>
     * 
     * @param request the request parameters of ListImportTasks  ListImportTasksRequest
     * @return ListImportTasksResponse
     */
    @Override
    public CompletableFuture<ListImportTasksResponse> listImportTasks(ListImportTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImportTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImportTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImportTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRCVClusters  ListRCVClustersRequest
     * @return ListRCVClustersResponse
     */
    @Override
    public CompletableFuture<ListRCVClustersResponse> listRCVClusters(ListRCVClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRCVClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRCVClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRCVClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>The dedicated cluster feature allows you to manage instances in batches in the form of clusters. You can create multiple dedicated clusters in a region. A dedicated cluster contains multiple hosts, and a host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
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
     * @param request the request parameters of MigrateDBNodes  MigrateDBNodesRequest
     * @return MigrateDBNodesResponse
     */
    @Override
    public CompletableFuture<MigrateDBNodesResponse> migrateDBNodes(MigrateDBNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateDBNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateDBNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateDBNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyBackupSetExpireTimeResponse> modifyBackupSetExpireTime(ModifyBackupSetExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackupSetExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackupSetExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackupSetExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2928780.html">Committed Serverless</a></p>
     * 
     * @param request the request parameters of ModifyComputeBurstConfig  ModifyComputeBurstConfigRequest
     * @return ModifyComputeBurstConfigResponse
     */
    @Override
    public CompletableFuture<ModifyComputeBurstConfigResponse> modifyComputeBurstConfig(ModifyComputeBurstConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyComputeBurstConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyComputeBurstConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyComputeBurstConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModifyDBInstance  ModifyDBInstanceRequest
     * @return ModifyDBInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceResponse> modifyDBInstance(ModifyDBInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h2>Request description</h2>
     * <ul>
     * <li>Before invoking this operation, make sure that you have activated the column encryption feature in DAS Security Center.</li>
     * <li>If you receive a fault message when invoking this operation, go to Database Autonomy Service (DAS) Security Center to purchase and activate the column encryption feature before trying again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceCLS  ModifyDBInstanceCLSRequest
     * @return ModifyDBInstanceCLSResponse
     */
    @Override
    public CompletableFuture<ModifyDBInstanceCLSResponse> modifyDBInstanceCLS(ModifyDBInstanceCLSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceCLS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceCLSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceCLSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyDBInstanceReplicationSwitchResponse> modifyDBInstanceReplicationSwitch(ModifyDBInstanceReplicationSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceReplicationSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceReplicationSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceReplicationSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for SQL Server</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2392322.html">Configure security group rules for ApsaraDB RDS for SQL Server</a></p>
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
     * <h3>Supported engines.</h3>
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
    @Override
    public CompletableFuture<ModifyDBInstanceVectorSupportStatusResponse> modifyDBInstanceVectorSupportStatus(ModifyDBInstanceVectorSupportStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDBInstanceVectorSupportStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDBInstanceVectorSupportStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDBInstanceVectorSupportStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>Modifies a data import task for an ApsaraDB RDS for MySQL native replication instance.</p>
     * 
     * @param request the request parameters of ModifyImportTask  ModifyImportTaskRequest
     * @return ModifyImportTaskResponse
     */
    @Override
    public CompletableFuture<ModifyImportTaskResponse> modifyImportTask(ModifyImportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyParameterTimedScheduleTaskResponse> modifyParameterTimedScheduleTask(ModifyParameterTimedScheduleTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyParameterTimedScheduleTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyParameterTimedScheduleTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyParameterTimedScheduleTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCDeploymentSetAttribute  ModifyRCDeploymentSetAttributeRequest
     * @return ModifyRCDeploymentSetAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyRCDeploymentSetAttributeResponse> modifyRCDeploymentSetAttribute(ModifyRCDeploymentSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCDeploymentSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCDeploymentSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCDeploymentSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation with the DiskId parameter to modify the name, description, release behavior, and other attributes of a block storage device.</p>
     * 
     * @param request the request parameters of ModifyRCDiskAttribute  ModifyRCDiskAttributeRequest
     * @return ModifyRCDiskAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyRCDiskAttributeResponse> modifyRCDiskAttribute(ModifyRCDiskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCDiskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCDiskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCDiskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCDiskChargeType  ModifyRCDiskChargeTypeRequest
     * @return ModifyRCDiskChargeTypeResponse
     */
    @Override
    public CompletableFuture<ModifyRCDiskChargeTypeResponse> modifyRCDiskChargeType(ModifyRCDiskChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCDiskChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCDiskChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCDiskChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyRCDiskSpecResponse> modifyRCDiskSpec(ModifyRCDiskSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCDiskSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCDiskSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCDiskSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCElasticScaling  ModifyRCElasticScalingRequest
     * @return ModifyRCElasticScalingResponse
     */
    @Override
    public CompletableFuture<ModifyRCElasticScalingResponse> modifyRCElasticScaling(ModifyRCElasticScalingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCElasticScaling").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCElasticScalingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCElasticScalingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of ModifyRCInstanceAttribute  ModifyRCInstanceAttributeRequest
     * @return ModifyRCInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceAttributeResponse> modifyRCInstanceAttribute(ModifyRCInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of ModifyRCInstanceDescription  ModifyRCInstanceDescriptionRequest
     * @return ModifyRCInstanceDescriptionResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceDescriptionResponse> modifyRCInstanceDescription(ModifyRCInstanceDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCInstanceKeyPair  ModifyRCInstanceKeyPairRequest
     * @return ModifyRCInstanceKeyPairResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceKeyPairResponse> modifyRCInstanceKeyPair(ModifyRCInstanceKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCInstanceNetworkSpec  ModifyRCInstanceNetworkSpecRequest
     * @return ModifyRCInstanceNetworkSpecResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceNetworkSpecResponse> modifyRCInstanceNetworkSpec(ModifyRCInstanceNetworkSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceNetworkSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceNetworkSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceNetworkSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCInstanceVpcAttribute  ModifyRCInstanceVpcAttributeRequest
     * @return ModifyRCInstanceVpcAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyRCInstanceVpcAttributeResponse> modifyRCInstanceVpcAttribute(ModifyRCInstanceVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCInstanceVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCInstanceVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCInstanceVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCSecurityGroupPermission  ModifyRCSecurityGroupPermissionRequest
     * @return ModifyRCSecurityGroupPermissionResponse
     */
    @Override
    public CompletableFuture<ModifyRCSecurityGroupPermissionResponse> modifyRCSecurityGroupPermission(ModifyRCSecurityGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCSecurityGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCSecurityGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCSecurityGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRCVCluster  ModifyRCVClusterRequest
     * @return ModifyRCVClusterResponse
     */
    @Override
    public CompletableFuture<ModifyRCVClusterResponse> modifyRCVCluster(ModifyRCVClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRCVCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRCVClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRCVClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>This operation is no longer maintained. You can still call this operation, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation instead.</p>
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
     * <p>This operation is no longer maintained: the operation can still be called normally, but Alibaba Cloud no longer maintains it. Use the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation instead.</p>
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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2977241.html">DuckDB-based analytical instance</a></p>
     * 
     * @param request the request parameters of PrecheckDuckDBDependency  PrecheckDuckDBDependencyRequest
     * @return PrecheckDuckDBDependencyResponse
     */
    @Override
    public CompletableFuture<PrecheckDuckDBDependencyResponse> precheckDuckDBDependency(PrecheckDuckDBDependencyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PrecheckDuckDBDependency").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrecheckDuckDBDependencyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrecheckDuckDBDependencyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of RdsCustomInit  RdsCustomInitRequest
     * @return RdsCustomInitResponse
     */
    @Override
    public CompletableFuture<RdsCustomInitResponse> rdsCustomInit(RdsCustomInitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RdsCustomInit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RdsCustomInitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RdsCustomInitResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RebootRCInstances  RebootRCInstancesRequest
     * @return RebootRCInstancesResponse
     */
    @Override
    public CompletableFuture<RebootRCInstancesResponse> rebootRCInstances(RebootRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The dedicated cluster feature allows you to manage instances in batches by cluster. You can create multiple dedicated clusters in a region. Each dedicated cluster contains multiple hosts, and each host contains multiple instances. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">Overview of dedicated clusters</a>.</p>
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
     * <h3>Applicable engine</h3>
     * <ul>
     * <li>RDS PostgreSQL</li>
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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for MySQL.</p>
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
     * @param request the request parameters of RedeployRCInstance  RedeployRCInstanceRequest
     * @return RedeployRCInstanceResponse
     */
    @Override
    public CompletableFuture<RedeployRCInstanceResponse> redeployRCInstance(RedeployRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedeployRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedeployRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <p>Removing instances from a deployment set is a non-disruptive operation and does not cause instance restarts.</p>
     * 
     * @param request the request parameters of RemoveRCInstancesFromDeploymentSet  RemoveRCInstancesFromDeploymentSetRequest
     * @return RemoveRCInstancesFromDeploymentSetResponse
     */
    @Override
    public CompletableFuture<RemoveRCInstancesFromDeploymentSetResponse> removeRCInstancesFromDeploymentSet(RemoveRCInstancesFromDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveRCInstancesFromDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveRCInstancesFromDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveRCInstancesFromDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of RenewRCInstance  RenewRCInstanceRequest
     * @return RenewRCInstanceResponse
     */
    @Override
    public CompletableFuture<RenewRCInstanceResponse> renewRCInstance(RenewRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ReplaceRCInstanceSystemDiskResponse> replaceRCInstanceSystemDisk(ReplaceRCInstanceSystemDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceRCInstanceSystemDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceRCInstanceSystemDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceRCInstanceSystemDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <p>Instances with local disks do not support storage space changes.</p>
     * 
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
     * @param request the request parameters of RevokeRCSecurityGroupPermission  RevokeRCSecurityGroupPermissionRequest
     * @return RevokeRCSecurityGroupPermissionResponse
     */
    @Override
    public CompletableFuture<RevokeRCSecurityGroupPermissionResponse> revokeRCSecurityGroupPermission(RevokeRCSecurityGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeRCSecurityGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeRCSecurityGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeRCSecurityGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunRCCommand  RunRCCommandRequest
     * @return RunRCCommandResponse
     */
    @Override
    public CompletableFuture<RunRCCommandResponse> runRCCommand(RunRCCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunRCCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunRCCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunRCCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of ShareRCDeploymentSet  ShareRCDeploymentSetRequest
     * @return ShareRCDeploymentSetResponse
     */
    @Override
    public CompletableFuture<ShareRCDeploymentSetResponse> shareRCDeploymentSet(ShareRCDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ShareRCDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShareRCDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShareRCDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of StartRCInstances  StartRCInstancesRequest
     * @return StartRCInstancesResponse
     */
    @Override
    public CompletableFuture<StartRCInstancesResponse> startRCInstances(StartRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of StopRCInstances  StopRCInstancesRequest
     * @return StopRCInstancesResponse
     */
    @Override
    public CompletableFuture<StopRCInstancesResponse> stopRCInstances(StopRCInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRCInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRCInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRCInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <b>description</b> :
     * <p>Applicable engine:</p>
     * <ul>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchOverMajorVersionUpgrade  SwitchOverMajorVersionUpgradeRequest
     * @return SwitchOverMajorVersionUpgradeResponse
     */
    @Override
    public CompletableFuture<SwitchOverMajorVersionUpgradeResponse> switchOverMajorVersionUpgrade(SwitchOverMajorVersionUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchOverMajorVersionUpgrade").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchOverMajorVersionUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchOverMajorVersionUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS SQL Server.</p>
     * 
     * @param request the request parameters of SwitchReplicationLink  SwitchReplicationLinkRequest
     * @return SwitchReplicationLinkResponse
     */
    @Override
    public CompletableFuture<SwitchReplicationLinkResponse> switchReplicationLink(SwitchReplicationLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchReplicationLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchReplicationLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchReplicationLinkResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SyncRCSecurityGroup  SyncRCSecurityGroupRequest
     * @return SyncRCSecurityGroupResponse
     */
    @Override
    public CompletableFuture<SyncRCSecurityGroupResponse> syncRCSecurityGroup(SyncRCSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncRCSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncRCSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncRCSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Supported engine</h3>
     * <ul>
     * <li>RDS SQL Server</li>
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
     * @param request the request parameters of UnassociateEipAddressWithRCInstance  UnassociateEipAddressWithRCInstanceRequest
     * @return UnassociateEipAddressWithRCInstanceResponse
     */
    @Override
    public CompletableFuture<UnassociateEipAddressWithRCInstanceResponse> unassociateEipAddressWithRCInstance(UnassociateEipAddressWithRCInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateEipAddressWithRCInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateEipAddressWithRCInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateEipAddressWithRCInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateDBInstanceReplicationResponse> updateDBInstanceReplication(UpdateDBInstanceReplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDBInstanceReplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDBInstanceReplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDBInstanceReplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * <h3>Applicable engine</h3>
     * <p>ApsaraDB RDS for PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p>This API operation involves fees. Carefully read the related documentation to fully understand the fees, prerequisites, and impacts before you proceed.
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

    /**
     * <b>description</b> :
     * <p>Performs a precheck for a data import task of an ApsaraDB RDS for MySQL native replication instance.</p>
     * 
     * @param request the request parameters of ValidateImportTask  ValidateImportTaskRequest
     * @return ValidateImportTaskResponse
     */
    @Override
    public CompletableFuture<ValidateImportTaskResponse> validateImportTask(ValidateImportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateImportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateImportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateImportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
