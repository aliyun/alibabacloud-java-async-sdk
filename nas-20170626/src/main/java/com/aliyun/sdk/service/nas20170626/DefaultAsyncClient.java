// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.nas20170626.models.*;
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
        this.product = "NAS";
        this.version = "2017-06-26";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou-finance", "nas.cn-hangzhou-dg-a01.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "nas.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "nas.aliyuncs.com"),
            new TeaPair("cn-fujian", "nas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "nas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "nas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "nas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "nas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "nas.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @deprecated OpenAPI AddClientToBlackList is deprecated  * @description The API operation is available only for CPFS file systems.
     * 
     * @param request the request parameters of AddClientToBlackList  AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AddClientToBlackListResponse> addClientToBlackList(AddClientToBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddClientToBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddClientToBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddClientToBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Only Advanced Extreme NAS file systems support this operation. Before you call this operation, complete the following preparations:</p>
     * <ul>
     * <li>An Advanced Extreme NAS file system is created. When you invoke the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li>FileSystemType: extreme</li>
     * <li>StorageType: advance</li>
     * </ul>
     * </li>
     * <li>An automatic snapshot policy is created. For more information, see <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createautosnapshotpolicy">CreateAutoSnapshotPolicy</a>.</li>
     * <li>The AliyunNASManageENIRole console authorization is completed. Before you create an Extreme NAS file system, associate the service-linked role AliyunNASManageENIRole with File Storage NAS to allow NAS to manage elastic network interfaces (ENIs), which are network interface controller (NIC) resources. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage NAS service-linked roles</a>.
     * <strong>Usage notes</strong>
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add auto-refresh configurations only for data flows in the <code>Running</code> state.</li>
     * <li>You can add up to five auto-refresh configurations for a data flow.</li>
     * <li>It takes 2 to 5 minutes to create an auto-refresh configuration. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to query the data flow status.</li>
     * <li>Auto-refresh relies on EventBridge to collect object modification events from the source OSS storage. <a href="https://help.aliyun.com/document_detail/182246.html">Activate EventBridge</a> before you proceed.<blockquote>
     * <p>The event buses and event rules that CPFS creates in EventBridge contain the description <code>Create for cpfs auto refresh</code>. Do not modify or delete these event buses or event rules. Otherwise, auto-refresh cannot work properly.</p>
     * </blockquote>
     * </li>
     * <li>Auto-refresh targets a prefix specified by the RefreshPath parameter. When you configure auto-refresh for a prefix in a CPFS data flow, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When objects within the prefix of the source OSS bucket are modified, OSS events are generated in EventBridge and processed by the CPFS data flow.</li>
     * <li>After you configure auto-refresh (AutoRefresh), when data changes in the source storage, the changed metadata is automatically synchronized to the CPFS file system. The changed data is loaded on demand when a user accesses the file, or loaded by starting a data flow node to load data.</li>
     * <li>The auto-refresh interval (AutoRefreshInterval) specifies the interval at which CPFS checks whether data updates exist in the prefix of the source OSS bucket. If data updates exist, an auto-refresh node is started. When the frequency of object modification events in the source OSS bucket exceeds the processing capacity of the CPFS data flow, automatic synchronization nodes accumulate, metadata updates are delayed, and the data stream status changes to Misconfigured. To resolve this issue, upgrade the data stream specifications or reduce the modification frequency in OSS.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyDataFlowAutoRefresh  ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    @Override
    public CompletableFuture<ApplyDataFlowAutoRefreshResponse> applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyDataFlowAutoRefresh").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyDataFlowAutoRefreshResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyDataFlowAutoRefreshResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachVscToFilesystems  AttachVscToFilesystemsRequest
     * @return AttachVscToFilesystemsResponse
     */
    @Override
    public CompletableFuture<AttachVscToFilesystemsResponse> attachVscToFilesystems(AttachVscToFilesystemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachVscToFilesystems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachVscToFilesystemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachVscToFilesystemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: An automatic snapshot policy has been applied to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: An automatic snapshot policy has been applied to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>该接口仅适用于CPFS文件系统。</li>
     * <li>仅CPFS 2.2.0及以上版本支持数据流动。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>仅支持取消<code>Running（正常）</code>、<code>Stopped（停止）</code>状态数据流动的自动更新配置。</li>
     * <li>取消自动更新配置一般耗时2～5分钟，您可以通过<a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a>查询取消自动更新任务的状态。</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowAutoRefresh  CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    @Override
    public CompletableFuture<CancelDataFlowAutoRefreshResponse> cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDataFlowAutoRefresh").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDataFlowAutoRefreshResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDataFlowAutoRefreshResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisite resource creation process</em>*
     * Before canceling a data flow streaming subtask, create resources in the following order:</p>
     * <ol>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> to create a data flow.</li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> to create a StreamImport or StreamExport task.</li>
     * <li>Create a data flow streaming subtask: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowsubtask-bmcpfs">CreateDataFlowSubTask</a> to create a streaming subtask.<blockquote>
     * <p>CPFS for Lingjun file systems must be created in the console.
     * <strong>Operation description</strong></p>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later are supported. You can view the version information on the file system details page in the console.</li>
     * <li>Prerequisites: A CPFS for Lingjun file system is created, the DataFlow is in the Running state, the DataFlowTask is in the Executing state, and the DataFlowSubTask is in the CREATED or RUNNING state.</li>
     * <li>You can cancel a data flow streaming subtask only when it is in the CREATED or RUNNING state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowSubTask  CancelDataFlowSubTaskRequest
     * @return CancelDataFlowSubTaskResponse
     */
    @Override
    public CompletableFuture<CancelDataFlowSubTaskResponse> cancelDataFlowSubTask(CancelDataFlowSubTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDataFlowSubTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDataFlowSubTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDataFlowSubTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each layer are in the required state:</p>
     * <ol>
     * <li>Create a file system: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a CPFS file system.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a mount target: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createmounttarget-cpfs">CreateMountTarget</a> to create a mount target.<ul>
     * <li>State requirement: The mount target is in the Active state.</li>
     * </ul>
     * </li>
     * <li>Create a fileset: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfileset-cpfs">CreateFileset</a> to create a fileset.<ul>
     * <li>State requirement: The fileset is created.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a data flow task.
     * <strong>Operation description</strong></li>
     * </ol>
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flow tasks. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flow tasks in the <code>Pending</code> state can be canceled.</li>
     * <li>Canceling a data flow task typically takes 5 to 10 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status.</li>
     * <li>If a streaming task contains running streaming subtasks, the streaming task cannot be canceled. Otherwise, the InvalidStatus.ResourceMismatch error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowTask  CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    @Override
    public CompletableFuture<CancelDataFlowTaskResponse> cancelDataFlowTask(CancelDataFlowTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDataFlowTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDataFlowTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDataFlowTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of CancelDirQuota  CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    @Override
    public CompletableFuture<CancelDirQuotaResponse> cancelDirQuota(CancelDirQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelDirQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDirQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDirQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS for Lingjun 2.7.0 and later support quota cancellation.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation applies only to CPFS for Lingjun file systems of version 2.7.0 or later.</li>
     * <li>The file system ID must start with <code>bmcpfs-</code>.</li>
     * <li>Before you call this operation, make sure that a quota has been configured for the target fileset by calling the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-setfilesetquota-bmcpfs">SetFilesetQuota</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelFilesetQuota  CancelFilesetQuotaRequest
     * @return CancelFilesetQuotaResponse
     */
    @Override
    public CompletableFuture<CancelFilesetQuotaResponse> cancelFilesetQuota(CancelFilesetQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelFilesetQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelFilesetQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelFilesetQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of CancelLifecycleRetrieveJob  CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    @Override
    public CompletableFuture<CancelLifecycleRetrieveJobResponse> cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelLifecycleRetrieveJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelLifecycleRetrieveJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelLifecycleRetrieveJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.</li>
     * <li>If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.</li>
     * <li>If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelRecycleBinJob  CancelRecycleBinJobRequest
     * @return CancelRecycleBinJobResponse
     */
    @Override
    public CompletableFuture<CancelRecycleBinJobResponse> cancelRecycleBinJob(CancelRecycleBinJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelRecycleBinJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRecycleBinJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRecycleBinJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create up to 20 permission groups in a single region within an Alibaba Cloud account.</li>
     * <li>A permission group supports up to 300 rules.</li>
     * <li>Only permission groups of the VPC network type can be created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessGroup  CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    @Override
    public CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you invoke the CreateAccessPoint operation to create an access point, some resources are generated asynchronously. After the CreateAccessPoint operation succeeds, invoke the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the access point status. Mount the file system only after the access point status becomes <strong>Active</strong>. Otherwise, the mount operation may fail.</li>
     * <li>Only General-purpose NAS file systems that use the NFS protocol support this feature.</li>
     * <li>If you enable the RAM policy (EnabledRam), configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage access points</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessPoint  CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    @Override
    public CompletableFuture<CreateAccessPointResponse> createAccessPoint(CreateAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A maximum of 300 rules can be added to a permission group.</p>
     * 
     * @param request the request parameters of CreateAccessRule  CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    @Override
    public CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Complete the following preparations before calling this operation:</p>
     * <ol>
     * <li><strong>An Agentic file system is created</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call this operation CreateAgenticSpace to create an Agentic space.</li>
     * <li>To modify the Agentic space configuration, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-modifyagenticspace">ModifyAgenticSpace</a> operation.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgenticSpace  CreateAgenticSpaceRequest
     * @return CreateAgenticSpaceResponse
     */
    @Override
    public CompletableFuture<CreateAgenticSpaceResponse> createAgenticSpace(CreateAgenticSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgenticSpace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgenticSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgenticSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can create up to 100 automatic snapshot policies in a region.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and creates the next automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> represents the year, <code>M</code> represents the month, and <code>d</code> represents the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can create up to 100 automatic snapshot policies in a region.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and creates the next automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> represents the year, <code>M</code> represents the month, and <code>d</code> represents the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an access point for a CPFS for Lingjun file system.</p>
     * 
     * @param request the request parameters of CreateCpfsAccessPoint  CreateCpfsAccessPointRequest
     * @return CreateCpfsAccessPointResponse
     */
    @Override
    public CompletableFuture<CreateCpfsAccessPointResponse> createCpfsAccessPoint(CreateCpfsAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCpfsAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCpfsAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCpfsAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to the following products:<table>
     * <thead>
     * <tr>
     * <th>Product</th>
     * <th>File system ID format</th>
     * <th>Minimum version that supports data flows</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><strong>CPFS General-purpose</strong></td>
     * <td>Starts with <code>cpfs-</code>, such as cpfs-125487****</td>
     * <td>2.2.0 or later</td>
     * </tr>
     * <tr>
     * <td><strong>CPFS for Lingjun</strong></td>
     * <td>Starts with <code>bmcpfs-</code>, such as bmcpfs-0015****</td>
     * <td>2.4.0 or later</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>CPFS General-purpose and CPFS for Lingjun share the same set of APIs but differ in parameter values and feature support. Refer to the corresponding section based on your product type.</p>
     * </blockquote>
     * </li>
     * <li>Basic operations<ul>
     * <li>You can create a data flow only when the CPFS General-purpose or CPFS for Lingjun file system is in the Running state.</li>
     * <li>A maximum of <strong>10</strong> data flows can be created for a single CPFS General-purpose or CPFS for Lingjun file system.</li>
     * <li>Creating a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to check whether the data flow is created.</li>
     * </ul>
     * </li>
     * <li>Permissions.
     *   When you create a data flow, Cloud Parallel File Storage associates the <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code> service-linked roles. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>CPFS General-purpose usage notes.
     *    This section applies to CPFS General-purpose file systems whose IDs start with <code>cpfs-</code>.<ul>
     * <li>Billing<ul>
     * <li>Creating a data flow incurs charges based on the data flow bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">CPFS General-purpose billing</a>.</li>
     * <li>When you use auto-refresh (AutoRefresh), EventBridge collects object modification events from the source OSS storage, which incurs fees. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">EventBridge billing</a>.</li>
     * </ul>
     * </li>
     * <li>Data flow specifications<ul>
     * <li>Data flow bandwidth (Throughput) supports three specifications: 600 MB/s, 1200 MB/s, and 1500 MB/s. The data flow bandwidth refers to the maximum transfer bandwidth that the data flow can achieve during data import or export.</li>
     * <li>Creating a data flow consumes one vSwitch IP address used by the Cloud Parallel File Storage General-purpose mount target. Ensure that sufficient vSwitch IP resources are available.</li>
     * <li>Inventory check: When DryRun is set to true, you can verify whether the resources required to create a data flow of the specified specification are available.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination of a data flow is a Fileset in the CPFS General-purpose file system. A Fileset is a new directory tree structure in the CPFS General-purpose file system. It is a small file system within the parent file system that has an independent inode space and management capability.</li>
     * <li>The Fileset must already exist when you create a data flow, and it cannot be nested with other Filesets. Only one data flow can be created on a Fileset, corresponding to one source storage.</li>
     * <li>The maximum number of files in a Fileset is 1 million. If the number of files imported from an OSS bucket exceeds this limit, creating new files returns a <code>no space</code> error.<blockquote>
     * <p>If data already exists in the Fileset, the existing data in the Fileset is cleared and replaced with data synchronized from OSS after the data flow is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Auto-refresh<ul>
     * <li>After auto-refresh (AutoRefresh) is configured, when data in the source storage changes, the changed metadata is automatically synchronized to the Cloud Parallel File Storage General-purpose file system. The changed data is loaded on demand when a user accesses the file, or loaded by starting a data flow task to load data.</li>
     * <li>Auto-refresh relies on EventBridge to collect object modification events from the source OSS storage. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The scope of auto-refresh is a prefix, specified by the RefreshPath parameter. A maximum of 5 auto-refresh directories can be configured for a data flow.</li>
     * <li>The auto-refresh interval (AutoRefreshInterval) specifies the interval at which Cloud Parallel File Storage General-purpose checks whether data updates exist in the specified prefix of the source OSS bucket. If data updates exist, an auto-refresh task is started. When the frequency of object modification events in the source OSS exceeds the processing capacity of the Cloud Parallel File Storage General-purpose data flow, auto-refresh tasks accumulate, metadata updates are delayed, and the data flow status becomes <code>Misconfigured</code>. You can resolve this issue by upgrading the data flow specification or reducing the OSS modification frequency.</li>
     * <li>When auto-refresh is configured for a prefix in the Cloud Parallel File Storage General-purpose data flow, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object modification occurs in the prefix of the source OSS bucket, an OSS event is generated in EventBridge and processed by the Cloud Parallel File Storage General-purpose data flow.<blockquote>
     * <p>The event bus and event rules created by Cloud Parallel File Storage General-purpose in EventBridge have the description <code>Create for cpfs auto refresh</code>. Do not modify or delete the event bus or event rules. Otherwise, auto-refresh does not work properly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>Cloud Parallel File Storage General-purpose data flows support both encrypted and non-encrypted access to OSS. When you select encrypted (SSL) access to OSS, confirm that the encryption in transit settings of the OSS bucket support encrypted access.</li>
     * <li>If multiple Cloud Parallel File Storage General-purpose data flows or multiple data flows of the same Cloud Parallel File Storage General-purpose file system use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple Cloud Parallel File Storage General-purpose file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the Cloud Parallel File Storage General-purpose file system.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the Cloud Parallel File Storage General-purpose data flow can access the data in the bucket. Do not delete or modify this tag during the use of the data flow. Otherwise, the Cloud Parallel File Storage General-purpose data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun usage notes.
     *    This section applies to CPFS for Lingjun file systems whose IDs start with <code>bmcpfs-</code>.<ul>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support both encrypted and non-encrypted access to OSS. When you select encrypted (SSL) access to OSS, ensure that the encryption in transit of the OSS bucket supports encrypted access.</li>
     * <li>If multiple CPFS for Lingjun data flows or multiple data flows of the same CPFS for Lingjun file system use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple CPFS for Lingjun file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the CPFS for Lingjun file system.</li>
     * <li>CPFS for Lingjun 2.6.0 or later supports creating data flows with cross-account OSS.</li>
     * <li>The account ID parameter is required only when you use cross-account OSS.</li>
     * <li>When you use cross-account OSS, authorize the accounts first. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Cross-account data flow authorization</a>.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the CPFS for Lingjun data flow can access the data in the bucket. Do not delete or modify this tag during the use of the data flow. Otherwise, the CPFS for Lingjun data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Data flow restrictions on the file system.<ul>
     * <li>In the file system path associated with the data flow, you cannot rename non-empty directories. Otherwise, a Permission Denied or directory not empty error is returned.</li>
     * <li>Use special characters in directory and file names with caution. Supported characters include uppercase and lowercase letters, digits, exclamation marks (!), hyphens (-), underscores (_), periods (.), asterisks (*), and parentheses (()).</li>
     * <li>Excessively long paths are not supported. The maximum path length supported by data flows is 1023 characters.</li>
     * </ul>
     * </li>
     * <li>Data flow import restrictions.<ul>
     * <li>After Symlink files are imported to CPFS for Lingjun, they are converted to regular files that contain data, and the Symlink information is lost.</li>
     * <li>If the OSS bucket has multiple versions, only the latest version is copied.</li>
     * <li>File names or subdirectory names longer than 255 bytes are not supported.</li>
     * </ul>
     * </li>
     * <li>Data flow export restrictions<ul>
     * <li>After Symlink files are synchronized to OSS, the files pointed to by the Symlink are not synchronized. Instead, the Symlink becomes a regular empty object with no data.</li>
     * <li>Hardlink files are synchronized to OSS as regular files.</li>
     * <li>Socket, Device, and Pipe files exported to the OSS bucket become regular empty objects with no data.</li>
     * <li>Directory paths longer than 1023 characters are not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlow  CreateDataFlowRequest
     * @return CreateDataFlowResponse
     */
    @Override
    public CompletableFuture<CreateDataFlowResponse> createDataFlow(CreateDataFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each level are in the required state:</p>
     * <ol>
     * <li>Create a file system: Create a CPFS for Lingjun file system in the console.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.<ul>
     * <li>State requirement: The data flow task is in the Executing state.
     * <strong>Operation description</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>You can create subtasks only for data flow streaming tasks that are in the Executing state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowsubtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * <li>When the data flow task type is a streaming task, the Executing state only indicates that you can create streaming import or streaming export tasks. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlowSubTask  CreateDataFlowSubTaskRequest
     * @return CreateDataFlowSubTaskResponse
     */
    @Override
    public CompletableFuture<CreateDataFlowSubTaskResponse> createDataFlowSubTask(CreateDataFlowSubTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataFlowSubTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataFlowSubTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataFlowSubTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Notes on CPFS<ul>
     * <li>Only CPFS 2.2.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you manually run a data flow task, the automatic data update task of the data flow is interrupted and waits.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS does not exceed 1,023 characters.</li>
     * </ul>
     * </li>
     * <li>Notes on CPFS for Lingjun<ul>
     * <li>Only CPFS for Lingjun 2.4.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS for Lingjun does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports two task types: batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task type overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlowTask  CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    @Override
    public CompletableFuture<CreateDataFlowTaskResponse> createDataFlowTask(CreateDataFlowTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataFlowTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataFlowTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataFlowTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * @param request the request parameters of CreateDir  CreateDirRequest
     * @return CreateDirResponse
     */
    @Override
    public CompletableFuture<CreateDirResponse> createDir(CreateDirRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDir").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDirResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDirResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is available only to specific users.</li>
     * <li>Only General-purpose NAS file systems that use the SMB Protocol Type and have access control enabled are supported. Alibaba Cloud Key Management Service (KMS) must also be activated.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before calling this API to create a file, complete the following four steps:</p>
     * <ol>
     * <li><strong>Create an SMB General-purpose NAS file system</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation with ProtocolType set to SMB to create a General-purpose NAS file system that supports the SMB protocol.</li>
     * <li><strong>Activate KMS</strong>: Activate KMS by using one of the following methods:<ul>
     * <li>Call the Kms.OpenKmsService API operation.</li>
     * <li>Go to the <a href="https://common-buy.aliyun.com/?commodityCode=kms#/open">console activation page</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Enable SMB ACL</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablesmbacl">EnableSmbAcl</a> operation to enable the SMB ACL feature. Recommended configuration:<ul>
     * <li>AuthMethod=NTLM</li>
     * <li>AuthCenter=EDS</li>
     * <li>This configuration does not require an AD domain Keytab and is easier to use.</li>
     * </ul>
     * </li>
     * <li><strong>Call CreateFile</strong>: After completing the preceding steps, call this operation to create a directory or file.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    @Override
    public CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.aliyun.com/price/product?#/nas/">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role associated with the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.alibabacloud.com/zh/product/nas/pricing?_p_lc=1&spm=a2796.7960336.8215766810.64.414bb91aiZQiRG&spm=a2c4g.11186623.help-menu-27516.d_5_1_4_2_0.572a1880hEiKCk">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role associated with the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileSystem  CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    @Override
    public CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS使用说明<ul>
     * <li>仅支持CPFS 2.2.0及以上版本创建Fileset。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>单个CPFS文件系统最多支持创建10个Fileset。</li>
     * <li>父目录必须是已存在的目录。</li>
     * <li>Fileset路径支持的最大深度为8层，根目录/为0层。例如，Fileset路径为/test/aaa/ccc/，则表示路径深度为3层。</li>
     * <li>不支持Fileset中嵌套Fileset。即当父目录已指定为Fileset，其子目录不支持指定为Fileset。</li>
     * <li>Fileset最多支持100万个文件，如果文件数量超过此上限，添加新文件会返回<code>no space</code>错误信息。</li>
     * </ul>
     * </li>
     * <li>CPFS智算版使用说明<ul>
     * <li>仅支持CPFS智算版 2.7.0及以上版本创建Fileset。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>单个CPFS文件系统最多支持创建500个Fileset。</li>
     * <li>Fileset路径必须为新路径，不能为已存在路径，Fileset 路径不支持重命名，不支持路径为软链接。</li>
     * <li>Fileset路径支持的最大深度为8层，根目录/为0层。例如，Fileset路径为/test/aaa/ccc/，则表示路径深度为3层。</li>
     * <li>Fileset路径为多层目录时，父目录必须是已存在的目录。</li>
     * <li>不支持在 Fileset 中嵌套 Fileset，即当父目录已指定为Fileset，其子目录不支持指定为Fileset。一个 Fileset 路径只支持一个配额。</li>
     * <li>Fileset容量配额，最小起步10 GiB，扩容单位为1 GiB。</li>
     * <li>Fileset最多支持100亿个文件或目录，最小起步10000，扩容单位为1。</li>
     * <li>修改目录配额时，设置的配额容量或文件数必须高于已使用容量或文件数。</li>
     * <li>配额的统计有15分钟的延迟，当前的实际使用量15分钟之后才会生效。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileset  CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    @Override
    public CompletableFuture<CreateFilesetResponse> createFileset(CreateFilesetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFileset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFilesetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFilesetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateLDAPConfig is deprecated  * @param request  the request parameters of CreateLDAPConfig  CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateLDAPConfigResponse> createLDAPConfig(CreateLDAPConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLDAPConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLDAPConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLDAPConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems and CPFS for Lingjun support creating lifecycle management policies.</li>
     * <li>Each CPFS for Lingjun file system supports up to 10 Auto-type and 100 OnDemand-type lifecycle management policies.</li>
     * <li>Up to 20 lifecycle management policies for General-purpose NAS can be created in each region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLifecyclePolicy  CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    @Override
    public CompletableFuture<CreateLifecyclePolicyResponse> createLifecyclePolicy(CreateLifecyclePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLifecyclePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLifecyclePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLifecyclePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can have up to 20 running data retrieval tasks in the same region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLifecycleRetrieveJob  CreateLifecycleRetrieveJobRequest
     * @return CreateLifecycleRetrieveJobResponse
     */
    @Override
    public CompletableFuture<CreateLifecycleRetrieveJobResponse> createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLifecycleRetrieveJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLifecycleRetrieveJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLifecycleRetrieveJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLogAnalysis  CreateLogAnalysisRequest
     * @return CreateLogAnalysisResponse
     */
    @Override
    public CompletableFuture<CreateLogAnalysisResponse> createLogAnalysis(CreateLogAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call the CreateMountTarget operation to create a mount target, some resources are generated asynchronously. After the CreateMountTarget operation succeeds, first invoke the DescribeMountTargets operation to query the mount target status. Execute the file system mount operation only after the mount target status changes to <strong>Active</strong>. Otherwise, the mount operation may fail.</li>
     * <li>Invoking this operation triggers the automatic creation of the service-linked role required for the operation. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMountTarget  CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    @Override
    public CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * </li>
     * <li><p>Before you begin</p>
     * <p>The target CPFS file system must be in the Running state, and a protocol service must have been created.</p>
     * </li>
     * <li><p>Other information</p>
     * <ul>
     * <li>The VPC CIDR block of the protocol service export must not overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple exports on the same protocol service must not overlap with each other.</li>
     * <li>You can create up to 10 export directories for a single protocol service.</li>
     * <li>Creating a protocol service export directory consumes IP addresses from the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateProtocolMountTarget  CreateProtocolMountTargetRequest
     * @return CreateProtocolMountTargetResponse
     */
    @Override
    public CompletableFuture<CreateProtocolMountTargetResponse> createProtocolMountTarget(CreateProtocolMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProtocolMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProtocolMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProtocolMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation is applicable only to CPFS file systems.</p>
     * </li>
     * <li><p>Only CPFS 2.3.0 and later support protocol services. You can call the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation to query the version of the file system.</p>
     * </li>
     * <li><p>Protocol service specifications.
     * Protocol services include two Protocol Types: General and Cache. Compared with the General type, the Cache type provides hot spot data caching. When the cache is hit, the bandwidth of the Cache type protocol service can exceed the bandwidth of the CPFS file system and reach the maximum bandwidth configured for the protocol service.</p>
     * <ul>
     * <li>General: Provides NFS protocol access and <a href="https://help.aliyun.com/document_detail/427175.html">folder-level mount targets</a> for CPFS. You do not need to configure a POSIX client cluster management. This feature is free of charge.</li>
     * <li>Cache: Provides server-side in-memory caching based on the LRU policy in addition to the General type capabilities. When data is cached in memory, CPFS can provide higher internal network bandwidth. The Cache type protocol service is available in two specifications: Cache L1 and Cache L2, which differ in internal network bandwidth and memory cache size.<blockquote>
     * <p> The Cache type protocol service is a paid service and is in invitational preview. For information about the billing of the Cache type protocol service, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, join the DingTalk user group (group ID: 31045006299) to communicate with CPFS engineers.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Protocol type.
     * Only NFSv3 is supported.</p>
     * </li>
     * <li><p>Prerequisites.
     * The CPFS file system must be created and in the Running state.</p>
     * </li>
     * <li><p>Other information.</p>
     * <ul>
     * <li>Only one protocol service can be created for each CPFS file system.</li>
     * <li>Creating a protocol service consumes IP addresses on the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateProtocolService  CreateProtocolServiceRequest
     * @return CreateProtocolServiceResponse
     */
    @Override
    public CompletableFuture<CreateProtocolServiceResponse> createProtocolService(CreateProtocolServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProtocolService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProtocolServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProtocolServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>The recycle bin must be enabled.</li>
     * <li>Mount the file system by using NFS or SMB (mount the file system on an ECS instance in the same VPC), and then delete the target file in the mount directory to move it to the recycle bin.</li>
     * <li>When you permanently delete a directory, the contents of the directory are recursively deleted.</li>
     * <li>Only one permanent deletion task can be run at a time for a single file system. While a file or directory is being permanently deleted, you cannot initiate a new restoration or cleanup task.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinDeleteJob  CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    @Override
    public CompletableFuture<CreateRecycleBinDeleteJobResponse> createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRecycleBinDeleteJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecycleBinDeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecycleBinDeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>A single file system can execute only one file restoration or cleanup task at a time. While a file is being restored, you cannot initiate a new file restoration or cleanup task.</li>
     * <li>A single restoration task can restore only one file or directory. Restoring a specified directory recursively restores all files in the directory.</li>
     * <li>After a file is restored, data reorganization is performed. Read request performance slightly decreases during data reorganization.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinRestoreJob  CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    @Override
    public CompletableFuture<CreateRecycleBinRestoreJobResponse> createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRecycleBinRestoreJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRecycleBinRestoreJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRecycleBinRestoreJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 128 snapshots for a file system.</li>
     * <li>The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.</li>
     * <li>You can create only one snapshot for a file system at a time.</li>
     * <li>If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.</li>
     * <li>When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.</li>
     * <li>A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.</li>
     * <li>Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The default access group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteAccessGroup  DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    @Override
    public CompletableFuture<DeleteAccessGroupResponse> deleteAccessGroup(DeleteAccessGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose Network File System (NFS) file systems support access points.</p>
     * <ul>
     * <li>After an access point is deleted, all I/O operations that are being performed on the directory accessed over the access point are interrupted immediately. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccessPoint  DeleteAccessPointRequest
     * @return DeleteAccessPointResponse
     */
    @Override
    public CompletableFuture<DeleteAccessPointResponse> deleteAccessPoint(DeleteAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteAccessRule  DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    @Override
    public CompletableFuture<DeleteAccessRuleResponse> deleteAccessRule(DeleteAccessRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Applicable to agentic file systems.</p>
     * 
     * @param request the request parameters of DeleteAgenticSpace  DeleteAgenticSpaceRequest
     * @return DeleteAgenticSpaceResponse
     */
    @Override
    public CompletableFuture<DeleteAgenticSpaceResponse> deleteAgenticSpace(DeleteAgenticSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgenticSpace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgenticSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgenticSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * @param request the request parameters of DeleteCpfsAccessPoint  DeleteCpfsAccessPointRequest
     * @return DeleteCpfsAccessPointResponse
     */
    @Override
    public CompletableFuture<DeleteCpfsAccessPointResponse> deleteCpfsAccessPoint(DeleteCpfsAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCpfsAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCpfsAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCpfsAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅CPFS 2.2.0及以上版本、智算CPFS 2.4.0及以上版本支持数据流动。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>仅支持删除<code>Running</code>、<code>Stopped</code>状态的数据流动。</li>
     * <li>删除后，数据流动相关的资源会被释放，且无法恢复。如需数据流动，请您重新创建。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataFlow  DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    @Override
    public CompletableFuture<DeleteDataFlowResponse> deleteDataFlow(DeleteDataFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅当文件系统的挂载点数目为0时，支持删除文件系统实例。</li>
     * <li>当文件系统未创建生命周期策略时，支持删除文件系统实例。</li>
     * <li>文件系统实例一旦删除，数据将不可恢复，请谨慎操作。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    @Override
    public CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support fileset deletion. After a fileset is deleted, all data in the directory is permanently deleted and cannot be recovered. Proceed with caution.</li>
     * <li>If deletion protection is enabled, you must disable deletion protection before you can delete the fileset.</li>
     * <li>All filesets on the target file system must be in the CREATED desired state before you can perform the delete operation.</li>
     * <li>Deleting a CPFS general-purpose fileset immediately releases disk space. Deleting a CPFS for Lingjun fileset gradually releases disk space. Deleted data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileset  DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    @Override
    public CompletableFuture<DeleteFilesetResponse> deleteFileset(DeleteFilesetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFileset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFilesetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFilesetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated  * @description # 说明
     * 本接口只支持CPFS并行文件系统。
     * 
     * @param request the request parameters of DeleteLDAPConfig  DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteLDAPConfigResponse> deleteLDAPConfig(DeleteLDAPConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLDAPConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLDAPConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLDAPConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅通用型NAS文件系统和CPFS智算版支持该功能。</p>
     * 
     * @param request the request parameters of DeleteLifecyclePolicy  DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     */
    @Override
    public CompletableFuture<DeleteLifecyclePolicyResponse> deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLifecyclePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLifecyclePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLifecyclePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLogAnalysis  DeleteLogAnalysisRequest
     * @return DeleteLogAnalysisResponse
     */
    @Override
    public CompletableFuture<DeleteLogAnalysisResponse> deleteLogAnalysis(DeleteLogAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>删除挂载点后，无法恢复，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteMountTarget  DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    @Override
    public CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>该接口仅适用于CPFS文件系统。</p>
     * 
     * @param request the request parameters of DeleteProtocolMountTarget  DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    @Override
    public CompletableFuture<DeleteProtocolMountTargetResponse> deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProtocolMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProtocolMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProtocolMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>该接口仅适用于CPFS文件系统。</li>
     * <li>删除协议服务时，会同时删除协议服务中的导出目录。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProtocolService  DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    @Override
    public CompletableFuture<DeleteProtocolServiceResponse> deleteProtocolService(DeleteProtocolServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProtocolService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProtocolServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProtocolServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessGroups  DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeAccessGroupsResponse> describeAccessGroups(DescribeAccessGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems that use the NFS protocol support this feature.</p>
     * 
     * @param request the request parameters of DescribeAccessPoint  DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    @Override
    public CompletableFuture<DescribeAccessPointResponse> describeAccessPoint(DescribeAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use NAS::2017-06-26::ListAccessPoints instead.  * @description Only General-purpose NAS NFS file systems support this feature.
     * 
     * @param request the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessRules  DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    @Override
    public CompletableFuture<DescribeAccessRulesResponse> describeAccessRules(DescribeAccessRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Applicable to Agentic file systems.</p>
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, create resources in the following order:</p>
     * <ol>
     * <li><strong>Create an Agentic file system</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system with the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.</li>
     * </ul>
     * </li>
     * <li><strong>Query the AgenticSpace list</strong>: After the file system is created (status is Running), call this operation DescribeAgenticSpaces to query the list of AgenticSpaces in the file system.<ul>
     * <li>If AgenticSpaces have been created in the file system, the complete list is returned.</li>
     * <li>If no AgenticSpaces have been created in the file system, an empty list is returned.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of DescribeAgenticSpaces  DescribeAgenticSpacesRequest
     * @return DescribeAgenticSpacesResponse
     */
    @Override
    public CompletableFuture<DescribeAgenticSpacesResponse> describeAgenticSpaces(DescribeAgenticSpacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAgenticSpaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAgenticSpacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAgenticSpacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> protocol is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> protocol is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotPolicies  DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeAutoSnapshotPoliciesResponse> describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoSnapshotPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoSnapshotPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotTasks  DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    @Override
    public CompletableFuture<DescribeAutoSnapshotTasksResponse> describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoSnapshotTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoSnapshotTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeBlackListClients is deprecated  * @description The API operation is available only for CPFS file systems.
     * 
     * @param request the request parameters of DescribeBlackListClients  DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeBlackListClientsResponse> describeBlackListClients(DescribeBlackListClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBlackListClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBlackListClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBlackListClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of clients mounted to an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request the request parameters of DescribeCpfsAccessPointMountedClients  DescribeCpfsAccessPointMountedClientsRequest
     * @return DescribeCpfsAccessPointMountedClientsResponse
     */
    @Override
    public CompletableFuture<DescribeCpfsAccessPointMountedClientsResponse> describeCpfsAccessPointMountedClients(DescribeCpfsAccessPointMountedClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCpfsAccessPointMountedClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCpfsAccessPointMountedClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCpfsAccessPointMountedClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries access points of CPFS for Lingjun.</p>
     * 
     * @param request the request parameters of DescribeCpfsAccessPoints  DescribeCpfsAccessPointsRequest
     * @return DescribeCpfsAccessPointsResponse
     */
    @Override
    public CompletableFuture<DescribeCpfsAccessPointsResponse> describeCpfsAccessPoints(DescribeCpfsAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCpfsAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCpfsAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCpfsAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS for Lingjun 2.6.0 and later support this operation. You can view the version information on the file system details page in the console.
     * <strong>Before you begin</strong>
     * Before calling this operation to query data flow subtasks, complete resource creation and task startup in the following order:</p>
     * <ol>
     * <li><strong>Create a bmcpfs file system</strong>: Create a CPFS for Lingjun file system in the console and wait until the status changes to Running.</li>
     * <li><strong>Create a data flow</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> to create a data flow channel on the file system.</li>
     * <li><strong>Start a data flow task</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> to create and start a data flow task. The task status must be Running.</li>
     * <li><strong>Query subtasks</strong>: Subtasks are automatically generated during the execution of a data flow task. Call the DescribeDataFlowSubTasks operation to query the list of these subtasks.</li>
     * </ol>
     * 
     * @param request the request parameters of DescribeDataFlowSubTasks  DescribeDataFlowSubTasksRequest
     * @return DescribeDataFlowSubTasksResponse
     */
    @Override
    public CompletableFuture<DescribeDataFlowSubTasksResponse> describeDataFlowSubTasks(DescribeDataFlowSubTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataFlowSubTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataFlowSubTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataFlowSubTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support querying data flow tasks. You can view the version information on the file system details page in the console.</p>
     * 
     * @param request the request parameters of DescribeDataFlowTasks  DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    @Override
    public CompletableFuture<DescribeDataFlowTasksResponse> describeDataFlowTasks(DescribeDataFlowTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataFlowTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataFlowTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataFlowTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds, DataFlowIds, SourceStorage, ThroughputList, and Status require exact match. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined queries are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDataFlows  DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    @Override
    public CompletableFuture<DescribeDataFlowsResponse> describeDataFlows(DescribeDataFlowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataFlows").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataFlowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataFlowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of DescribeDirQuotas  DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    @Override
    public CompletableFuture<DescribeDirQuotasResponse> describeDirQuotas(DescribeDirQuotasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDirQuotas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDirQuotasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDirQuotasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.  * @param request  the request parameters of DescribeFileSystemStatistics  DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeFileSystemStatisticsResponse> describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileSystemStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileSystemStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileSystemStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFileSystems  DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    @Override
    public CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileSystems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileSystemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileSystemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support filesets. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds requires an exact match, while FileSystemPath and Description support fuzzy match.</li>
     * <li>Combination queries are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesets  DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    @Override
    public CompletableFuture<DescribeFilesetsResponse> describeFilesets(DescribeFilesetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFilesets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFilesetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFilesetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持CPFS智算版文件系统。</li>
     * <li>此接口为批量接口，每次最多允许查询 20 个文件系统。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesystemsAssociatedHpnZones  DescribeFilesystemsAssociatedHpnZonesRequest
     * @return DescribeFilesystemsAssociatedHpnZonesResponse
     */
    @Override
    public CompletableFuture<DescribeFilesystemsAssociatedHpnZonesResponse> describeFilesystemsAssociatedHpnZones(DescribeFilesystemsAssociatedHpnZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFilesystemsAssociatedHpnZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFilesystemsAssociatedHpnZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFilesystemsAssociatedHpnZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch execution is supported. In batch execution mode, only one VscId can be associated with multiple FileSystemIds. This means the ResourceIds.VscId values must be the same.</li>
     * <li>To query the association results between file systems and virtual storage channels, call AttachVscToFilesystems to complete the association first. You can call ListVscs of Lingjun Intelligent Computing eflo-controller/2022-12-15 to query VscIds. If no virtual storage channel has been created, call CreateVsc to create one.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesystemsVscAttachInfo  DescribeFilesystemsVscAttachInfoRequest
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    @Override
    public CompletableFuture<DescribeFilesystemsVscAttachInfoResponse> describeFilesystemsVscAttachInfo(DescribeFilesystemsVscAttachInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFilesystemsVscAttachInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFilesystemsVscAttachInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFilesystemsVscAttachInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * @param request the request parameters of DescribeLifecyclePolicies  DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeLifecyclePoliciesResponse> describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLifecyclePolicies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLifecyclePoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLifecyclePoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution logs of a lifecycle management policy. You can query logs from the last 90 days, with a maximum of 1000 log entries. Only CPFS for Lingjun is supported.</p>
     * 
     * @param request the request parameters of DescribeLifecyclePolicyLogs  DescribeLifecyclePolicyLogsRequest
     * @return DescribeLifecyclePolicyLogsResponse
     */
    @Override
    public CompletableFuture<DescribeLifecyclePolicyLogsResponse> describeLifecyclePolicyLogs(DescribeLifecyclePolicyLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLifecyclePolicyLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLifecyclePolicyLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLifecyclePolicyLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogAnalysis  DescribeLogAnalysisRequest
     * @return DescribeLogAnalysisResponse
     */
    @Override
    public CompletableFuture<DescribeLogAnalysisResponse> describeLogAnalysis(DescribeLogAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMountTargets  DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    @Override
    public CompletableFuture<DescribeMountTargetsResponse> describeMountTargets(DescribeMountTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMountTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMountTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMountTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅通用型NAS支持该接口。</li>
     * <li>客户端列表显示近一分钟对文件系统有读写访问的客户端IP，部分已挂载而没有访问文件系统的客户端IP可能不在此列表中显示。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMountedClients  DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    @Override
    public CompletableFuture<DescribeMountedClientsResponse> describeMountedClients(DescribeMountedClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMountedClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMountedClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMountedClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅通用型NAS NFS协议文件系统支持该功能。</p>
     * 
     * @param request the request parameters of DescribeNfsAcl  DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    @Override
    public CompletableFuture<DescribeNfsAclResponse> describeNfsAcl(DescribeNfsAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNfsAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNfsAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNfsAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * @param request the request parameters of DescribeProtocolMountTarget  DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    @Override
    public CompletableFuture<DescribeProtocolMountTargetResponse> describeProtocolMountTarget(DescribeProtocolMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProtocolMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProtocolMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProtocolMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>该接口仅适用于CPFS文件系统。</p>
     * 
     * @param request the request parameters of DescribeProtocolService  DescribeProtocolServiceRequest
     * @return DescribeProtocolServiceResponse
     */
    @Override
    public CompletableFuture<DescribeProtocolServiceResponse> describeProtocolService(DescribeProtocolServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProtocolService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProtocolServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProtocolServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <ul>
     * <li>Before you begin: Before calling this API, ensure that the KMS service is activated in the target region. You can activate it by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or through the console. This restriction also applies to unencrypted file systems with EncryptType=0.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSmbAcl  DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    @Override
    public CompletableFuture<DescribeSmbAclResponse> describeSmbAcl(DescribeSmbAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmbAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmbAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmbAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeStoragePackages  DescribeStoragePackagesRequest
     * @return DescribeStoragePackagesResponse
     */
    @Override
    public CompletableFuture<DescribeStoragePackagesResponse> describeStoragePackages(DescribeStoragePackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStoragePackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStoragePackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStoragePackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachVscFromFilesystems  DetachVscFromFilesystemsRequest
     * @return DetachVscFromFilesystemsResponse
     */
    @Override
    public CompletableFuture<DetachVscFromFilesystemsResponse> detachVscFromFilesystems(DetachVscFromFilesystemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachVscFromFilesystems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachVscFromFilesystemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachVscFromFilesystemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you disable the recycle bin, all files in the recycle bin are permanently deleted.</li>
     * <li>If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableAndCleanRecycleBin  DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    @Override
    public CompletableFuture<DisableAndCleanRecycleBinResponse> disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAndCleanRecycleBin").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAndCleanRecycleBinResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAndCleanRecycleBinResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableDataInsight  DisableDataInsightRequest
     * @return DisableDataInsightResponse
     */
    @Override
    public CompletableFuture<DisableDataInsightResponse> disableDataInsight(DisableDataInsightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDataInsight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDataInsightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDataInsightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅通用型NAS NFS协议文件系统支持该功能。</p>
     * 
     * @param request the request parameters of DisableNfsAcl  DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    @Override
    public CompletableFuture<DisableNfsAclResponse> disableNfsAcl(DisableNfsAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableNfsAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableNfsAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableNfsAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, ensure that Key Management Service (KMS) is activated in the target region. You can activate KMS by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or through the console. The file system protocol type must be SMB. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to verify the file system protocol type.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableSmbAcl  DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    @Override
    public CompletableFuture<DisableSmbAclResponse> disableSmbAcl(DisableSmbAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSmbAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSmbAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSmbAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableDataInsight  EnableDataInsightRequest
     * @return EnableDataInsightResponse
     */
    @Override
    public CompletableFuture<EnableDataInsightResponse> enableDataInsight(EnableDataInsightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDataInsight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDataInsightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDataInsightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅通用型NAS NFS协议文件系统支持该功能。</p>
     * 
     * @param request the request parameters of EnableNfsAcl  EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    @Override
    public CompletableFuture<EnableNfsAclResponse> enableNfsAcl(EnableNfsAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableNfsAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableNfsAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableNfsAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of EnableRecycleBin  EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    @Override
    public CompletableFuture<EnableRecycleBinResponse> enableRecycleBin(EnableRecycleBinRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableRecycleBin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableRecycleBinResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableRecycleBinResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By connecting the mount target of an SMB file system to an AD domain, you can implement user identity authentication management and file-level access permissions control in the AD domain. Before you mount and use an SMB file system as an AD domain user, you must register the service for the SMB file system in the AD domain, generate a Keytab file, and upload it to the NAS console to enable the SMB ACL feature. <a href="https://help.aliyun.com/document_detail/154930.html">Generate a Keytab file</a>.</li>
     * <li>Before you begin: Before invoking this API, confirm that Key Management Service (KMS) is activated in the target area. You can invoke the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or activate it in the console.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableSmbAcl  EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    @Override
    public CompletableFuture<EnableSmbAclResponse> enableSmbAcl(EnableSmbAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSmbAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSmbAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSmbAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Applies to agentic-type file systems.</p>
     * 
     * @param request the request parameters of GetAgenticSpace  GetAgenticSpaceRequest
     * @return GetAgenticSpaceResponse
     */
    @Override
    public CompletableFuture<GetAgenticSpaceResponse> getAgenticSpace(GetAgenticSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgenticSpace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgenticSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgenticSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of GetDirectoryOrFileProperties  GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    @Override
    public CompletableFuture<GetDirectoryOrFilePropertiesResponse> getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDirectoryOrFileProperties").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDirectoryOrFilePropertiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDirectoryOrFilePropertiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅CPFS 2.2.0和CPFS智算版2.7.0及以上版本支持Fileset。您可以在控制台文件系统详情页面查看版本信息。</p>
     * 
     * @param request the request parameters of GetFileset  GetFilesetRequest
     * @return GetFilesetResponse
     */
    @Override
    public CompletableFuture<GetFilesetResponse> getFileset(GetFilesetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFilesetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFilesetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the export directory information of a protocol service.
     * <strong>Before you begin</strong>
     * Before you call this operation, make sure that each dependent resource in the following three-layer resource model already exists:</p>
     * <ol>
     * <li><strong>File system (FileSystem)</strong>: Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to obtain the FileSystemId.</li>
     * <li><strong>Protocol service (ProtocolService)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to obtain the ProtocolServiceId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> to create one.</li>
     * <li><strong>Export directory (ProtocolMountTarget)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create an export directory and obtain the ExportId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the ExportId.</li>
     * </ol>
     * 
     * @param request the request parameters of GetProtocolMountTarget  GetProtocolMountTargetRequest
     * @return GetProtocolMountTargetResponse
     */
    @Override
    public CompletableFuture<GetProtocolMountTargetResponse> getProtocolMountTarget(GetProtocolMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProtocolMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProtocolMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProtocolMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of GetRecycleBinAttribute  GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    @Override
    public CompletableFuture<GetRecycleBinAttributeResponse> getRecycleBinAttribute(GetRecycleBinAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRecycleBinAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRecycleBinAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRecycleBinAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems are supported.</p>
     * 
     * @param request the request parameters of ListAccessPoints  ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    @Override
    public CompletableFuture<ListAccessPointsResponse> listAccessPoints(ListAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataInsightDirectories  ListDataInsightDirectoriesRequest
     * @return ListDataInsightDirectoriesResponse
     */
    @Override
    public CompletableFuture<ListDataInsightDirectoriesResponse> listDataInsightDirectories(ListDataInsightDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataInsightDirectories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataInsightDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataInsightDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ListDirectoriesAndFiles  ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    @Override
    public CompletableFuture<ListDirectoriesAndFilesResponse> listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDirectoriesAndFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDirectoriesAndFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDirectoriesAndFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ListLifecycleRetrieveJobs  ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    @Override
    public CompletableFuture<ListLifecycleRetrieveJobsResponse> listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLifecycleRetrieveJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLifecycleRetrieveJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLifecycleRetrieveJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.
     * <strong>Before you begin</strong>
     * Before calling this operation, make sure that the recycle bin feature is enabled for the file system. If the recycle bin is not enabled, this operation cannot return the list of recently deleted directories.
     * <strong>Enable the recycle bin</strong>
     * To enable the recycle bin feature, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablerecyclebin">EnableRecycleBin</a> operation. After the recycle bin is enabled, deleted directories in the file system are moved to the recycle bin. You can call this operation to query the list of recently deleted directories.</p>
     * 
     * @param request the request parameters of ListRecentlyRecycledDirectories  ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    @Override
    public CompletableFuture<ListRecentlyRecycledDirectoriesResponse> listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRecentlyRecycledDirectories").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecentlyRecycledDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecentlyRecycledDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can query up to 50 most recently executed tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecycleBinJobs  ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    @Override
    public CompletableFuture<ListRecycleBinJobsResponse> listRecycleBinJobs(ListRecycleBinJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRecycleBinJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecycleBinJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecycleBinJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ListRecycledDirectoriesAndFiles  ListRecycledDirectoriesAndFilesRequest
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    @Override
    public CompletableFuture<ListRecycledDirectoriesAndFilesResponse> listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRecycledDirectoriesAndFiles").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecycledDirectoriesAndFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecycledDirectoriesAndFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessGroup  ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    @Override
    public CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccessGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccessGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccessGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of ModifyAccessPoint  ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    @Override
    public CompletableFuture<ModifyAccessPointResponse> modifyAccessPoint(ModifyAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessRule  ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    @Override
    public CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccessRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccessRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccessRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>Call this operation (ModifyAgenticSpace) to modify the Agentic space configurations.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAgenticSpace  ModifyAgenticSpaceRequest
     * @return ModifyAgenticSpaceResponse
     */
    @Override
    public CompletableFuture<ModifyAgenticSpaceResponse> modifyAgenticSpace(ModifyAgenticSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAgenticSpace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAgenticSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAgenticSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request the request parameters of ModifyCpfsAccessPoint  ModifyCpfsAccessPointRequest
     * @return ModifyCpfsAccessPointResponse
     */
    @Override
    public CompletableFuture<ModifyCpfsAccessPointResponse> modifyCpfsAccessPoint(ModifyCpfsAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCpfsAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCpfsAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCpfsAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data streams.</li>
     * <li>Only data streams in the <code>Running (Normal)</code> state can have their properties modified.</li>
     * <li>Modifying a data stream typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the data stream modification.</li>
     * <li>CPFS data stream specifications:<ul>
     * <li>Data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data stream bandwidth refers to the maximum transmission bandwidth that can be achieved when the data stream imports or exports data.</li>
     * <li>Inventory query: When you set DryRun to true, you can verify whether the resources required to modify the data stream with the specified specifications are sufficient.</li>
     * </ul>
     * </li>
     * <li>CPFS billing
     * Modifying the data stream bandwidth (Throughput) involves data stream bandwidth billing. Familiarize yourself with the billable methods of CPFS in advance. For more details, see <a href="https://help.aliyun.com/document_detail/111858.html">CPFS billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDataFlow  ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    @Override
    public CompletableFuture<ModifyDataFlowResponse> modifyDataFlow(ModifyDataFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDataFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDataFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDataFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the automatic update configuration only for dataflows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Modifying the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the automatic update task modification.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDataFlowAutoRefresh  ModifyDataFlowAutoRefreshRequest
     * @return ModifyDataFlowAutoRefreshResponse
     */
    @Override
    public CompletableFuture<ModifyDataFlowAutoRefreshResponse> modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDataFlowAutoRefresh").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDataFlowAutoRefreshResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDataFlowAutoRefreshResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyFileSystem  ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    @Override
    public CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅支持CPFS 2.2.0和CPFS智算版2.7.0及以上版本修改Fileset信息。</p>
     * 
     * @param request the request parameters of ModifyFileset  ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    @Override
    public CompletableFuture<ModifyFilesetResponse> modifyFileset(ModifyFilesetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFileset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFilesetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFilesetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated  * @description The API operation is available only for Cloud Parallel File Storage (CPFS) file systems.
     * 
     * @param request the request parameters of ModifyLDAPConfig  ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ModifyLDAPConfigResponse> modifyLDAPConfig(ModifyLDAPConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLDAPConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLDAPConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLDAPConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ModifyLifecyclePolicy  ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    @Override
    public CompletableFuture<ModifyLifecyclePolicyResponse> modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLifecyclePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLifecyclePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLifecyclePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only mount target information of General-purpose NAS or Extreme NAS file systems can be modified.</p>
     * 
     * @param request the request parameters of ModifyMountTarget  ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    @Override
    public CompletableFuture<ModifyMountTargetResponse> modifyMountTarget(ModifyMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Status prerequisite: Before calling this operation, the export directory corresponding to ExportId must be in the AVAILABLE state. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the status and wait until the creation is complete before retrying.</li>
     * <li>Dependency chain:<ol>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> (with FileSystemType set to cpfs) to obtain the CPFS file system.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to verify that the protocol service is in the Running state.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to verify that the export directory is in the AVAILABLE state.</li>
     * <li>If no export directory exists, call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create one first.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyProtocolMountTarget  ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    @Override
    public CompletableFuture<ModifyProtocolMountTargetResponse> modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyProtocolMountTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyProtocolMountTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyProtocolMountTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>This operation allows you to modify the description of a protocol service.</li>
     * <li>You can obtain the protocol service ID (ProtocolServiceId) by using one of the following methods:<ul>
     * <li>Call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> operation to create a protocol service. The protocol service ID is returned in the response.</li>
     * <li>Call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation to query existing protocol services.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyProtocolService  ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    @Override
    public CompletableFuture<ModifyProtocolServiceResponse> modifyProtocolService(ModifyProtocolServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyProtocolService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyProtocolServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyProtocolServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Make sure that Key Management Service (KMS) is activated in the target region. Call sequence: Activate KMS → Call EnableSmbAcl to initialize → Call ModifySmbAcl.</p>
     * 
     * @param request the request parameters of ModifySmbAcl  ModifySmbAclRequest
     * @return ModifySmbAclResponse
     */
    @Override
    public CompletableFuture<ModifySmbAclResponse> modifySmbAcl(ModifySmbAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySmbAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySmbAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySmbAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenNASService  OpenNASServiceRequest
     * @return OpenNASServiceResponse
     */
    @Override
    public CompletableFuture<OpenNASServiceResponse> openNASService(OpenNASServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenNASService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenNASServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenNASServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated  * @description The API operation is available only for CPFS file systems.
     * 
     * @param request the request parameters of RemoveClientFromBlackList  RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<RemoveClientFromBlackListResponse> removeClientFromBlackList(RemoveClientFromBlackListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveClientFromBlackList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveClientFromBlackListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveClientFromBlackListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole permission in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole permission in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).</li>
     * </ul>
     * 
     * @param request the request parameters of ResetFileSystem  ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    @Override
    public CompletableFuture<ResetFileSystemResponse> resetFileSystem(ResetFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of RetryLifecycleRetrieveJob  RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    @Override
    public CompletableFuture<RetryLifecycleRetrieveJobResponse> retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryLifecycleRetrieveJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryLifecycleRetrieveJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryLifecycleRetrieveJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set <code>StorageType=Agentic</code>.<ul>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAgenticSpaceQuota  SetAgenticSpaceQuotaRequest
     * @return SetAgenticSpaceQuotaResponse
     */
    @Override
    public CompletableFuture<SetAgenticSpaceQuotaResponse> setAgenticSpaceQuota(SetAgenticSpaceQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAgenticSpaceQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAgenticSpaceQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAgenticSpaceQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of SetDirQuota  SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    @Override
    public CompletableFuture<SetDirQuotaResponse> setDirQuota(SetDirQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDirQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDirQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDirQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support setting quotas for filesets.</li>
     * <li>The minimum fileset capacity quota is 10 GiB, and the capacity is increased in increments of 1 GiB.</li>
     * <li>A fileset supports up to 10 billion files or directories. The minimum value is 10,000, and the value is increased in increments of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>Specify at least one of the capacity limit and file count limit.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * @param request the request parameters of SetFilesetQuota  SetFilesetQuotaRequest
     * @return SetFilesetQuotaResponse
     */
    @Override
    public CompletableFuture<SetFilesetQuotaResponse> setFilesetQuota(SetFilesetQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetFilesetQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetFilesetQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetFilesetQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>该接口仅适用于CPFS文件系统。</li>
     * <li>仅CPFS 2.2.0及以上版本支持数据流动。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>只能启动<code>Stopped（停止）</code>状态的数据流动。</li>
     * <li>当DryRun为<code>true</code>时，可校验启动该规格的数据流动的资源是否充足。如果库存资源不足，数据流动则无法启动。</li>
     * <li>启动数据流动一般耗时2～5分钟，您可通过<a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a>查询数据流动状态。</li>
     * </ul>
     * 
     * @param request the request parameters of StartDataFlow  StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    @Override
    public CompletableFuture<StartDataFlowResponse> startDataFlow(StartDataFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDataFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDataFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDataFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only when the <code>LifecyclePolicyType</code> of a lifecycle policy is set to <code>OnDemand</code> for a CPFS AI-Computing Edition file system.</p>
     * 
     * @param request the request parameters of StartLifecyclePolicyExecution  StartLifecyclePolicyExecutionRequest
     * @return StartLifecyclePolicyExecutionResponse
     */
    @Override
    public CompletableFuture<StartLifecyclePolicyExecutionResponse> startLifecyclePolicyExecution(StartLifecyclePolicyExecutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLifecyclePolicyExecution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLifecyclePolicyExecutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLifecyclePolicyExecutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>该接口仅适用于CPFS文件系统。</li>
     * <li>仅CPFS 2.2.0及以上版本支持数据流动。您可以在控制台文件系统详情页面查看版本信息。</li>
     * <li>只能停用<code>Running（正常）</code>状态的数据流动。</li>
     * <li>停用后，不可在数据流动上创建数据流动任务。如果配置了自动更新，源端发生的数据更新也不会同步到CPFS上。</li>
     * <li>停用后，由于资源被回收，数据流动带宽将不再计费，但重新启动数据流动可能因为库存不足导致启动失败。</li>
     * <li>停用数据流动一般耗时2～5分钟，您可通过<a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a>查询数据流动状态。</li>
     * </ul>
     * 
     * @param request the request parameters of StopDataFlow  StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    @Override
    public CompletableFuture<StopDataFlowResponse> stopDataFlow(StopDataFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDataFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDataFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDataFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Stops the execution of a lifecycle policy.
     * This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * @param request the request parameters of StopLifecyclePolicyExecution  StopLifecyclePolicyExecutionRequest
     * @return StopLifecyclePolicyExecutionResponse
     */
    @Override
    public CompletableFuture<StopLifecyclePolicyExecutionResponse> stopLifecyclePolicyExecution(StopLifecyclePolicyExecutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLifecyclePolicyExecution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLifecyclePolicyExecutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLifecyclePolicyExecutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UpdateLifecyclePolicy  UpdateLifecyclePolicyRequest
     * @return UpdateLifecyclePolicyResponse
     */
    @Override
    public CompletableFuture<UpdateLifecyclePolicyResponse> updateLifecyclePolicy(UpdateLifecyclePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLifecyclePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLifecyclePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLifecyclePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of UpdateRecycleBinAttribute  UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateRecycleBinAttributeResponse> updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRecycleBinAttribute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRecycleBinAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRecycleBinAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持极速型NAS文件系统和CPFS文件系统扩容。</li>
     * <li>通用型NAS按需自动扩容，无须使用本API。</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeFileSystem  UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    @Override
    public CompletableFuture<UpgradeFileSystemResponse> upgradeFileSystem(UpgradeFileSystemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeFileSystem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeFileSystemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeFileSystemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
