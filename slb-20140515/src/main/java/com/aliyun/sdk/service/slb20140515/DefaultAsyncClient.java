// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.slb20140515.models.*;
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
        this.product = "Slb";
        this.version = "2014-05-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "slb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "slb.aliyuncs.com"),
            new TeaPair("us-east-1", "slb.aliyuncs.com"),
            new TeaPair("us-west-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "slb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "slb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "slb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "slb.aliyuncs.com"),
            new TeaPair("cn-fujian", "slb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "slb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "slb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "slb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "slb-api.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "slb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "slb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "slb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "slb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "slb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "slb.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Each network ACL can contain one or more IP addresses or CIDR blocks. Take note of the following limits on network ACLs:</p>
     * <ul>
     * <li>The number of IP entries that can be added to a network ACL with each Alibaba Cloud account at a time: 50</li>
     * <li>The maximum number of IP entries that each network ACL can contain: 300</li>
     * </ul>
     * 
     * @param request the request parameters of AddAccessControlListEntry  AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    @Override
    public CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAccessControlListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAccessControlListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAccessControlListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If multiple identical Elastic Compute Service (ECS) instances are specified in a request, only the first ECS instance is added. The other ECS instances are ignored. If the backend server that you add is the same as one of the existing backend servers that are already associated with the listener, an error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddBackendServers  AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    @Override
    public CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddListenerWhiteListItem  AddListenerWhiteListItemRequest
     * @return AddListenerWhiteListItemResponse
     */
    @Override
    public CompletableFuture<AddListenerWhiteListItemResponse> addListenerWhiteListItem(AddListenerWhiteListItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddListenerWhiteListItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddListenerWhiteListItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddListenerWhiteListItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h1>Limits</h1>
     * <p>Before you call this API, note the following limits:</p>
     * <ul>
     * <li>You can add up to 10 tags to each SLB instance.</li>
     * <li>You can add up to five pairs of tags at a time.</li>
     * <li>All the tags and keys added to an SLB instance must be unique.</li>
     * <li>If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Override
    public CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddVServerGroupBackendServers  AddVServerGroupBackendServersRequest
     * @return AddVServerGroupBackendServersResponse
     */
    @Override
    public CompletableFuture<AddVServerGroupBackendServersResponse> addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVServerGroupBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVServerGroupBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVServerGroupBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:</p>
     * <ul>
     * <li>An account can have a maximum of 50 ACLs in each region.</li>
     * <li>You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.</li>
     * <li>Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessControlList  CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    @Override
    public CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessControlList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessControlListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessControlListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDomainExtension  CreateDomainExtensionRequest
     * @return CreateDomainExtensionResponse
     */
    @Override
    public CompletableFuture<CreateDomainExtensionResponse> createDomainExtension(CreateDomainExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDomainExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDomainExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDomainExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you create a CLB instance, call the <a href="~~DescribeAvailableResource~~">DescribeAvailableResource</a> operation to query the resources available for purchase in the region where you want to create the CLB instance.</p>
     * <ul>
     * <li>After a CLB instance is created, you are charged for using the CLB instance.</li>
     * <li>The pay-as-you-go billing method supports the pay-by-specification and pay-by-LCU metering methods.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="~~StartLoadBalancerListener~~">StartLoadBalancerListener</a> operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.</p>
     * <h2>Prerequisites</h2>
     * <p>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="~~StartLoadBalancerListener~~">CreateLoadBalancer</a>.</p>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPListener  CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancerHTTPListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerHTTPListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerHTTPListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.</p>
     * <h2>Prerequisites</h2>
     * <p>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2">CreateLoadBalancer</a>.</p>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPSListener  CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancerHTTPSListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerHTTPSListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to enable the listener to forward traffic to backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoadBalancerTCPListener  CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancerTCPListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerTCPListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerTCPListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>UDP listeners of Classic Load Balancer (CLB) instances in a classic network cannot pass client IP addresses to backend servers.</p>
     * <blockquote>
     * <p> A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to enable the listener to forward traffic to backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoadBalancerUDPListener  CreateLoadBalancerUDPListenerRequest
     * @return CreateLoadBalancerUDPListenerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancerUDPListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerUDPListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerUDPListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMasterSlaveServerGroup  CreateMasterSlaveServerGroupRequest
     * @return CreateMasterSlaveServerGroupResponse
     */
    @Override
    public CompletableFuture<CreateMasterSlaveServerGroupResponse> createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMasterSlaveServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMasterSlaveServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMasterSlaveServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRules  CreateRulesRequest
     * @return CreateRulesResponse
     */
    @Override
    public CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTLSCipherPolicy  CreateTLSCipherPolicyRequest
     * @return CreateTLSCipherPolicyResponse
     */
    @Override
    public CompletableFuture<CreateTLSCipherPolicyResponse> createTLSCipherPolicy(CreateTLSCipherPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTLSCipherPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTLSCipherPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTLSCipherPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVServerGroup  CreateVServerGroupRequest
     * @return CreateVServerGroupResponse
     */
    @Override
    public CompletableFuture<CreateVServerGroupResponse> createVServerGroup(CreateVServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete an ACL only if it is not associated with a listener.</p>
     * 
     * @param request the request parameters of DeleteAccessControlList  DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    @Override
    public CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessControlList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessControlListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessControlListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAccessLogsDownloadAttribute  DeleteAccessLogsDownloadAttributeRequest
     * @return DeleteAccessLogsDownloadAttributeResponse
     */
    @Override
    public CompletableFuture<DeleteAccessLogsDownloadAttributeResponse> deleteAccessLogsDownloadAttribute(DeleteAccessLogsDownloadAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessLogsDownloadAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessLogsDownloadAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessLogsDownloadAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete a CA certificate that is in use.</p>
     * 
     * @param request the request parameters of DeleteCACertificate  DeleteCACertificateRequest
     * @return DeleteCACertificateResponse
     */
    @Override
    public CompletableFuture<DeleteCACertificateResponse> deleteCACertificate(DeleteCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDomainExtension  DeleteDomainExtensionRequest
     * @return DeleteDomainExtensionResponse
     */
    @Override
    public CompletableFuture<DeleteDomainExtensionResponse> deleteDomainExtension(DeleteDomainExtensionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainExtension").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainExtensionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainExtensionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The listeners and tags of the SLB instance are deleted along with the SLB instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    @Override
    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete only listeners that are in the <strong>stopped</strong> or <strong>running</strong> state.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteLoadBalancerListener  DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    @Override
    public CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoadBalancerListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoadBalancerListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoadBalancerListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMasterSlaveServerGroup  DeleteMasterSlaveServerGroupRequest
     * @return DeleteMasterSlaveServerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMasterSlaveServerGroupResponse> deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMasterSlaveServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMasterSlaveServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMasterSlaveServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The RuleIds parameter is required. You can specify up to 10 forwarding rules in each request.</p>
     * 
     * @param request the request parameters of DeleteRules  DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    @Override
    public CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot delete server certificates that are in use.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteServerCertificate  DeleteServerCertificateRequest
     * @return DeleteServerCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteServerCertificateResponse> deleteServerCertificate(DeleteServerCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServerCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServerCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServerCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Slb%5C&api=DeleteTLSCipherPolicy%5C&type=RPC%5C&version=2014-05-15">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DeleteTLSCipherPolicy  DeleteTLSCipherPolicyRequest
     * @return DeleteTLSCipherPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteTLSCipherPolicyResponse> deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTLSCipherPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTLSCipherPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTLSCipherPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVServerGroup  DeleteVServerGroupRequest
     * @return DeleteVServerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteVServerGroupResponse> deleteVServerGroup(DeleteVServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessControlListAttribute  DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessControlListAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessControlListAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessControlListAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessControlLists  DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    @Override
    public CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessControlLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessControlListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessControlListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessLogsDownloadAttribute  DescribeAccessLogsDownloadAttributeRequest
     * @return DescribeAccessLogsDownloadAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeAccessLogsDownloadAttributeResponse> describeAccessLogsDownloadAttribute(DescribeAccessLogsDownloadAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessLogsDownloadAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessLogsDownloadAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessLogsDownloadAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only the available resources and zones are returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    @Override
    public CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To ensure data confidentiality, only the certificate fingerprint and name are returned. The certificate content is not returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCACertificates  DescribeCACertificatesRequest
     * @return DescribeCACertificatesResponse
     */
    @Override
    public CompletableFuture<DescribeCACertificatesResponse> describeCACertificates(DescribeCACertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCACertificates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCACertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCACertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainExtensionAttribute  DescribeDomainExtensionAttributeRequest
     * @return DescribeDomainExtensionAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeDomainExtensionAttributeResponse> describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainExtensionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainExtensionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainExtensionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainExtensions  DescribeDomainExtensionsRequest
     * @return DescribeDomainExtensionsResponse
     */
    @Override
    public CompletableFuture<DescribeDomainExtensionsResponse> describeDomainExtensions(DescribeDomainExtensionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainExtensions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainExtensionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainExtensionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHealthStatus  DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    @Override
    public CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHighDefinationMonitor  DescribeHighDefinationMonitorRequest
     * @return DescribeHighDefinationMonitorResponse
     */
    @Override
    public CompletableFuture<DescribeHighDefinationMonitorResponse> describeHighDefinationMonitor(DescribeHighDefinationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHighDefinationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHighDefinationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHighDefinationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeListenerAccessControlAttribute  DescribeListenerAccessControlAttributeRequest
     * @return DescribeListenerAccessControlAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeListenerAccessControlAttributeResponse> describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeListenerAccessControlAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeListenerAccessControlAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeListenerAccessControlAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If backend servers are deployed in a vServer group, you can call the <a href="https://help.aliyun.com/document_detail/35224.html">DescribeVServerGroupAttribute</a> operation to query the backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeLoadBalancerAttribute  DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTP listener is created. For more information about how to create an HTTP listener, see <a href="https://help.aliyun.com/document_detail/27592.html">CreateLoadBalancerHTTPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPListenerAttribute  DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerHTTPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerHTTPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTPS listener is created. For more information about how to create an HTTPS listener, see <a href="https://help.aliyun.com/document_detail/27593.html">CreateLoadBalancerHTTPSListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPSListenerAttribute  DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerHTTPSListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerHTTPSListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A CLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/2401685.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>One or more listeners are added to the CLB instance. For more information, see the following topics:<ul>
     * <li><a href="~~CreateLoadBalancerUDPListener~~">CreateLoadBalancerUDPListener</a></li>
     * <li><a href="~~CreateLoadBalancerTCPListener~~">CreateLoadBalancerTCPListener</a></li>
     * <li><a href="~~CreateLoadBalancerHTTPListener~~">CreateLoadBalancerHTTPListener</a></li>
     * <li><a href="~~CreateLoadBalancerHTTPSListener~~">CreateLoadBalancerHTTPSListener</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerListeners  DescribeLoadBalancerListenersRequest
     * @return DescribeLoadBalancerListenersResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerListenersResponse> describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerListeners").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerListenersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerListenersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLoadBalancerTCPListenerAttribute  DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerTCPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerTCPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLoadBalancerUDPListenerAttribute  DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancerUDPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancerUDPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLoadBalancers  DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    @Override
    public CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLoadBalancers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLoadBalancersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLoadBalancersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMasterSlaveServerGroupAttribute  DescribeMasterSlaveServerGroupAttributeRequest
     * @return DescribeMasterSlaveServerGroupAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeMasterSlaveServerGroupAttributeResponse> describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMasterSlaveServerGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMasterSlaveServerGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMasterSlaveServerGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMasterSlaveServerGroups  DescribeMasterSlaveServerGroupsRequest
     * @return DescribeMasterSlaveServerGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeMasterSlaveServerGroupsResponse> describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMasterSlaveServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMasterSlaveServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMasterSlaveServerGroupsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRuleAttribute  DescribeRuleAttributeRequest
     * @return DescribeRuleAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeRuleAttributeResponse> describeRuleAttribute(DescribeRuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRuleAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRules  DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    @Override
    public CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> For security reasons, only the fingerprints and names of server certificates are returned. The content of server certificates and private keys is not returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeServerCertificates  DescribeServerCertificatesRequest
     * @return DescribeServerCertificatesResponse
     */
    @Override
    public CompletableFuture<DescribeServerCertificatesResponse> describeServerCertificates(DescribeServerCertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeServerCertificates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeServerCertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeServerCertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The system queries tags based on the instance ID, tag key, and tag value specified by you.</li>
     * <li>If the logical relationship among the specified conditions is AND, only tags that match all the specified conditions are returned.</li>
     * <li>If the Tagkey parameter is specified and but Tagvalue parameter is not specified, all tags that contain the specified tag key are returned.</li>
     * <li>If you specify the Tagvalue parameter in a request, you must also specify the Tagkey parameter in the request.</li>
     * <li>If you specify both the Tagkey and Tagvalue parameters, only tags that contain the specified keys and values are returned.</li>
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
     * @param request the request parameters of DescribeVServerGroupAttribute  DescribeVServerGroupAttributeRequest
     * @return DescribeVServerGroupAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeVServerGroupAttributeResponse> describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVServerGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVServerGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVServerGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVServerGroups  DescribeVServerGroupsRequest
     * @return DescribeVServerGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeVServerGroupsResponse> describeVServerGroups(DescribeVServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVServerGroupsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of EnableHighDefinationMonitor  EnableHighDefinationMonitorRequest
     * @return EnableHighDefinationMonitorResponse
     */
    @Override
    public CompletableFuture<EnableHighDefinationMonitorResponse> enableHighDefinationMonitor(EnableHighDefinationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableHighDefinationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableHighDefinationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableHighDefinationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTLSCipherPolicies  ListTLSCipherPoliciesRequest
     * @return ListTLSCipherPoliciesResponse
     */
    @Override
    public CompletableFuture<ListTLSCipherPoliciesResponse> listTLSCipherPolicies(ListTLSCipherPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTLSCipherPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTLSCipherPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTLSCipherPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object to be queried.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you set only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified tag key are returned. If you set only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you set <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
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
     * @param request the request parameters of ModifyHighDefinationMonitor  ModifyHighDefinationMonitorRequest
     * @return ModifyHighDefinationMonitorResponse
     */
    @Override
    public CompletableFuture<ModifyHighDefinationMonitorResponse> modifyHighDefinationMonitor(ModifyHighDefinationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHighDefinationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHighDefinationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHighDefinationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>For pay-as-you-go CLB instances, you can only change the metering method from pay-by-specification to pay-by-LCU. You cannot change the metering method from pay-by-LCU to pay-by-specification.</li>
     * <li>This operation can change the metering method of only one instance at a time.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyLoadBalancerInstanceChargeType  ModifyLoadBalancerInstanceChargeTypeRequest
     * @return ModifyLoadBalancerInstanceChargeTypeResponse
     */
    @Override
    public CompletableFuture<ModifyLoadBalancerInstanceChargeTypeResponse> modifyLoadBalancerInstanceChargeType(ModifyLoadBalancerInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoadBalancerInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoadBalancerInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoadBalancerInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLoadBalancerInstanceSpec  ModifyLoadBalancerInstanceSpecRequest
     * @return ModifyLoadBalancerInstanceSpecResponse
     */
    @Override
    public CompletableFuture<ModifyLoadBalancerInstanceSpecResponse> modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoadBalancerInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoadBalancerInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoadBalancerInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>If you modify only the maximum bandwidth of a pay-by-bandwidth CLB instance, the new bandwidth immediately takes effect.</li>
     * <li>If you modify the metering method (for example, switch from pay-by-bandwidth to pay-by-data-transfer), the new metering method and the other changes specified in the operation take effect at 00:00:00 the next day.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyLoadBalancerInternetSpec  ModifyLoadBalancerInternetSpecRequest
     * @return ModifyLoadBalancerInternetSpecResponse
     */
    @Override
    public CompletableFuture<ModifyLoadBalancerInternetSpecResponse> modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoadBalancerInternetSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoadBalancerInternetSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoadBalancerInternetSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyLoadBalancerPayType is deprecated  * @param request  the request parameters of ModifyLoadBalancerPayType  ModifyLoadBalancerPayTypeRequest
     * @return ModifyLoadBalancerPayTypeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ModifyLoadBalancerPayTypeResponse> modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLoadBalancerPayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLoadBalancerPayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLoadBalancerPayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can be used only to replace backend servers in a vServer group. To modify the attributes of backend servers, such as weights, call the <a href="https://help.aliyun.com/document_detail/35217.html">SetVServerGroupAttribute</a> operation.</p>
     * 
     * @param request the request parameters of ModifyVServerGroupBackendServers  ModifyVServerGroupBackendServersRequest
     * @return ModifyVServerGroupBackendServersResponse
     */
    @Override
    public CompletableFuture<ModifyVServerGroupBackendServersResponse> modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVServerGroupBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVServerGroupBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVServerGroupBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    @Override
    public CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveAccessControlListEntry  RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    @Override
    public CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveAccessControlListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAccessControlListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAccessControlListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the backend servers that you want to remove are not in the server list of the Classic Load Balancer (CLB) instance, the request fails. However, the system does not report an error.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveBackendServers  RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    @Override
    public CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveListenerWhiteListItem  RemoveListenerWhiteListItemRequest
     * @return RemoveListenerWhiteListItemResponse
     */
    @Override
    public CompletableFuture<RemoveListenerWhiteListItemResponse> removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveListenerWhiteListItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveListenerWhiteListItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveListenerWhiteListItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Override
    public CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the backend servers specified by the <strong>BackendServers</strong> parameter do not exist in the vServer group, the backend servers are ignored. No error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveVServerGroupBackendServers  RemoveVServerGroupBackendServersRequest
     * @return RemoveVServerGroupBackendServersResponse
     */
    @Override
    public CompletableFuture<RemoveVServerGroupBackendServersResponse> removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveVServerGroupBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveVServerGroupBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveVServerGroupBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAccessControlListAttribute  SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    @Override
    public CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAccessControlListAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAccessControlListAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAccessControlListAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAccessLogsDownloadAttribute  SetAccessLogsDownloadAttributeRequest
     * @return SetAccessLogsDownloadAttributeResponse
     */
    @Override
    public CompletableFuture<SetAccessLogsDownloadAttributeResponse> setAccessLogsDownloadAttribute(SetAccessLogsDownloadAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAccessLogsDownloadAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAccessLogsDownloadAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAccessLogsDownloadAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetBackendServers  SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    @Override
    public CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetBackendServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetBackendServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetBackendServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetCACertificateName  SetCACertificateNameRequest
     * @return SetCACertificateNameResponse
     */
    @Override
    public CompletableFuture<SetCACertificateNameResponse> setCACertificateName(SetCACertificateNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCACertificateName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCACertificateNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCACertificateNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDomainExtensionAttribute  SetDomainExtensionAttributeRequest
     * @return SetDomainExtensionAttributeResponse
     */
    @Override
    public CompletableFuture<SetDomainExtensionAttributeResponse> setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDomainExtensionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDomainExtensionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDomainExtensionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetListenerAccessControlStatus  SetListenerAccessControlStatusRequest
     * @return SetListenerAccessControlStatusResponse
     */
    @Override
    public CompletableFuture<SetListenerAccessControlStatusResponse> setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetListenerAccessControlStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetListenerAccessControlStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetListenerAccessControlStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLoadBalancerDeleteProtection  SetLoadBalancerDeleteProtectionRequest
     * @return SetLoadBalancerDeleteProtectionResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerDeleteProtectionResponse> setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerDeleteProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerDeleteProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerDeleteProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</li>
     * <li>An HTTP listener is created. For more information about how to create an HTTP listener, see <a href="https://help.aliyun.com/document_detail/27592.html">CreateLoadBalancerHTTPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPListenerAttribute  SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerHTTPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerHTTPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTPS listener is created. For more information about how to create an HTTPS listener, see <a href="https://help.aliyun.com/document_detail/27593.html">CreateLoadBalancerHTTPSListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPSListenerAttribute  SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerHTTPSListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerHTTPSListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLoadBalancerModificationProtection  SetLoadBalancerModificationProtectionRequest
     * @return SetLoadBalancerModificationProtectionResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerModificationProtectionResponse> setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerModificationProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerModificationProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerModificationProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLoadBalancerName  SetLoadBalancerNameRequest
     * @return SetLoadBalancerNameResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerNameResponse> setLoadBalancerName(SetLoadBalancerNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLoadBalancerStatus  SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A CLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/2401685.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>A TCP listener is created. For more information, see <a href="~~CreateLoadBalancerTCPListener~~">CreateLoadBalancerTCPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerTCPListenerAttribute  SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerTCPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerTCPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>A UDP listener is created. For more information, see <a href="https://help.aliyun.com/document_detail/27595.html">CreateLoadBalancerUDPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerUDPListenerAttribute  SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    @Override
    public CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLoadBalancerUDPListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLoadBalancerUDPListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetRule  SetRuleRequest
     * @return SetRuleResponse
     */
    @Override
    public CompletableFuture<SetRuleResponse> setRule(SetRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetServerCertificateName  SetServerCertificateNameRequest
     * @return SetServerCertificateNameResponse
     */
    @Override
    public CompletableFuture<SetServerCertificateNameResponse> setServerCertificateName(SetServerCertificateNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetServerCertificateName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetServerCertificateNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetServerCertificateNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetTLSCipherPolicyAttribute  SetTLSCipherPolicyAttributeRequest
     * @return SetTLSCipherPolicyAttributeResponse
     */
    @Override
    public CompletableFuture<SetTLSCipherPolicyAttributeResponse> setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetTLSCipherPolicyAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTLSCipherPolicyAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTLSCipherPolicyAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can be used to modify the weights of backend servers and names of vServer groups.</p>
     * <ul>
     * <li>If you want to modify backend servers in a specified vServer group, call the <a href="https://help.aliyun.com/document_detail/35220.html">ModifyVServerGroupBackendServers</a> operation.</li>
     * <li>If you want to add backend servers to a specified vServer group, call the <a href="https://help.aliyun.com/document_detail/35218.html">AddVServerGroupBackendServers</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVServerGroupAttribute  SetVServerGroupAttributeRequest
     * @return SetVServerGroupAttributeResponse
     */
    @Override
    public CompletableFuture<SetVServerGroupAttributeResponse> setVServerGroupAttribute(SetVServerGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetVServerGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetVServerGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetVServerGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can call the operation only when the listener is in the Stopped state.</li>
     * <li>If the operation is successful, the listener switches to the Starting state.</li>
     * <li>You cannot perform this operation when the Classic Load Balancer (CLB) instance to which the listener belongs is in the Locked state.</li>
     * </ul>
     * 
     * @param request the request parameters of StartLoadBalancerListener  StartLoadBalancerListenerRequest
     * @return StartLoadBalancerListenerResponse
     */
    @Override
    public CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLoadBalancerListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLoadBalancerListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLoadBalancerListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you make this API call, note the following:</p>
     * <ul>
     * <li>After the API call is successfully made, the listener enters the stopped state.</li>
     * <li>If the Server Load Balancer (SLB) instance to which the listener to be stopped belongs is in the locked state, this API call cannot be made.<blockquote>
     * <p> If you stop the listener, your services will be disrupted. Exercise caution when you perform this action.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StopLoadBalancerListener  StopLoadBalancerListenerRequest
     * @return StopLoadBalancerListenerResponse
     */
    @Override
    public CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLoadBalancerListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLoadBalancerListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLoadBalancerListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can add at most 20 tags to each instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
     * </blockquote>
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
     * <p>You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.</p>
     * 
     * @param request the request parameters of UploadCACertificate  UploadCACertificateRequest
     * @return UploadCACertificateResponse
     */
    @Override
    public CompletableFuture<UploadCACertificateResponse> uploadCACertificate(UploadCACertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadCACertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadCACertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadCACertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can upload only one server certificate and its private key in each call.</p>
     * <ul>
     * <li>After a server certificate and its private key are uploaded, the fingerprints of all server certificates that belong to your Alibaba Cloud account are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadServerCertificate  UploadServerCertificateRequest
     * @return UploadServerCertificateResponse
     */
    @Override
    public CompletableFuture<UploadServerCertificateResponse> uploadServerCertificate(UploadServerCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadServerCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadServerCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadServerCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
