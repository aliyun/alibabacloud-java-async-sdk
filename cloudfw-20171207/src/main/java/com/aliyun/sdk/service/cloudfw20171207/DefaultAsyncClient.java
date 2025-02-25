// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudfw20171207.models.*;
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
        this.product = "Cloudfw";
        this.version = "2017-12-07";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-southeast-1", "cloudfw.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudfw.cn-hangzhou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddAddressBook operation to create an address book for access control. The address book can be an IP address book, an ECS tag-based address book, a port address book, or a domain address book.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddAddressBook  AddAddressBookRequest
     * @return AddAddressBookResponse
     */
    @Override
    public CompletableFuture<AddAddressBookResponse> addAddressBook(AddAddressBookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAddressBook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAddressBookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAddressBookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddControlPolicy operation to create an access control policy to allow, block, or monitor traffic that reaches Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddControlPolicy  AddControlPolicyRequest
     * @return AddControlPolicyResponse
     */
    @Override
    public CompletableFuture<AddControlPolicyResponse> addControlPolicy(AddControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add members to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddInstanceMembers  AddInstanceMembersRequest
     * @return AddInstanceMembersResponse
     */
    @Override
    public CompletableFuture<AddInstanceMembersResponse> addInstanceMembers(AddInstanceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddInstanceMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddInstanceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddInstanceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.<br>Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy">Back up an access control policy</a>.<br>After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.<br>The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.</p>
     * 
     * @param request the request parameters of BatchCopyVpcFirewallControlPolicy  BatchCopyVpcFirewallControlPolicyRequest
     * @return BatchCopyVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<BatchCopyVpcFirewallControlPolicyResponse> batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCopyVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCopyVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCopyVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeleteVpcFirewallControlPolicy  BatchDeleteVpcFirewallControlPolicyRequest
     * @return BatchDeleteVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<BatchDeleteVpcFirewallControlPolicyResponse> batchDeleteVpcFirewallControlPolicy(BatchDeleteVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDownloadTask  CreateDownloadTaskRequest
     * @return CreateDownloadTaskResponse
     */
    @Override
    public CompletableFuture<CreateDownloadTaskResponse> createDownloadTask(CreateDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDownloadTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.</p>
     * 
     * @param request the request parameters of CreateNatFirewallControlPolicy  CreateNatFirewallControlPolicyRequest
     * @return CreateNatFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<CreateNatFirewallControlPolicyResponse> createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNatFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNatFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSecurityProxy  CreateSecurityProxyRequest
     * @return CreateSecurityProxyResponse
     */
    @Override
    public CompletableFuture<CreateSecurityProxyResponse> createSecurityProxy(CreateSecurityProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSlsLogDispatch  CreateSlsLogDispatchRequest
     * @return CreateSlsLogDispatchResponse
     */
    @Override
    public CompletableFuture<CreateSlsLogDispatchResponse> createSlsLogDispatch(CreateSlsLogDispatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSlsLogDispatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSlsLogDispatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSlsLogDispatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrFirewallV2  CreateTrFirewallV2Request
     * @return CreateTrFirewallV2Response
     */
    @Override
    public CompletableFuture<CreateTrFirewallV2Response> createTrFirewallV2(CreateTrFirewallV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrFirewallV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrFirewallV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrFirewallV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrFirewallV2RoutePolicy  CreateTrFirewallV2RoutePolicyRequest
     * @return CreateTrFirewallV2RoutePolicyResponse
     */
    @Override
    public CompletableFuture<CreateTrFirewallV2RoutePolicyResponse> createTrFirewallV2RoutePolicy(CreateTrFirewallV2RoutePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrFirewallV2RoutePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrFirewallV2RoutePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrFirewallV2RoutePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallCenConfigure operation to create a VPC firewall. The VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. The VPC firewall cannot protect mutual access traffic between VBRs, between CCN instances, or between VBRs and CCN instances. For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallCenConfigure  CreateVpcFirewallCenConfigureRequest
     * @return CreateVpcFirewallCenConfigureResponse
     */
    @Override
    public CompletableFuture<CreateVpcFirewallCenConfigureResponse> createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcFirewallCenConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcFirewallCenConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcFirewallCenConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. The VPC firewall does not control the mutual access traffic between VPCs that reside in different regions or belong to different Alibaba Cloud accounts. The firewall also does not control the mutual access traffic between VPCs and virtual border routers (VBRs). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallConfigure  CreateVpcFirewallConfigureRequest
     * @return CreateVpcFirewallConfigureResponse
     */
    @Override
    public CompletableFuture<CreateVpcFirewallConfigureResponse> createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcFirewallConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcFirewallConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcFirewallConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallControlPolicy operation to create an access control policy in a specified policy group for a VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallControlPolicy  CreateVpcFirewallControlPolicyRequest
     * @return CreateVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<CreateVpcFirewallControlPolicyResponse> createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteAddressBook operation to delete an address book for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteAddressBook  DeleteAddressBookRequest
     * @return DeleteAddressBookResponse
     */
    @Override
    public CompletableFuture<DeleteAddressBookResponse> deleteAddressBook(DeleteAddressBookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAddressBook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAddressBookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAddressBookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteControlPolicy operation to delete an access control policy that applies to inbound or outbound traffic.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteControlPolicy  DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteControlPolicyTemplate  DeleteControlPolicyTemplateRequest
     * @return DeleteControlPolicyTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteControlPolicyTemplateResponse> deleteControlPolicyTemplate(DeleteControlPolicyTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteControlPolicyTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteControlPolicyTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteControlPolicyTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete file download tasks and delete the files.
     * **
     * <strong>Warning</strong> Both tasks and involved files are deleted. You can no longer download the involved files by using the download links. This operation is irreversible. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteDownloadTask  DeleteDownloadTaskRequest
     * @return DeleteDownloadTaskResponse
     */
    @Override
    public CompletableFuture<DeleteDownloadTaskResponse> deleteDownloadTask(DeleteDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDownloadTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFirewallV2RoutePolicies  DeleteFirewallV2RoutePoliciesRequest
     * @return DeleteFirewallV2RoutePoliciesResponse
     */
    @Override
    public CompletableFuture<DeleteFirewallV2RoutePoliciesResponse> deleteFirewallV2RoutePolicies(DeleteFirewallV2RoutePoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFirewallV2RoutePolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFirewallV2RoutePoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFirewallV2RoutePoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove up to 20 members from Cloud Firewall at a time. Separate multiple members with commas (,). After a member is removed, Cloud Firewall can no longer access the cloud resources of the member. Proceed with caution. Before you call this operation, call the <a href="https://help.aliyun.com/document_detail/271704.html">DescribeInstanceMembers</a> operation to obtain the information about the members that are added to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteInstanceMembers  DeleteInstanceMembersRequest
     * @return DeleteInstanceMembersResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceMembersResponse> deleteInstanceMembers(DeleteInstanceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstanceMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to delete an outbound access control policy that is created for a NAT firewall.</p>
     * 
     * @param request the request parameters of DeleteNatFirewallControlPolicy  DeleteNatFirewallControlPolicyRequest
     * @return DeleteNatFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteNatFirewallControlPolicyResponse> deleteNatFirewallControlPolicy(DeleteNatFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteNatFirewallControlPolicyBatch  DeleteNatFirewallControlPolicyBatchRequest
     * @return DeleteNatFirewallControlPolicyBatchResponse
     */
    @Override
    public CompletableFuture<DeleteNatFirewallControlPolicyBatchResponse> deleteNatFirewallControlPolicyBatch(DeleteNatFirewallControlPolicyBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatFirewallControlPolicyBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatFirewallControlPolicyBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatFirewallControlPolicyBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecurityProxy  DeleteSecurityProxyRequest
     * @return DeleteSecurityProxyResponse
     */
    @Override
    public CompletableFuture<DeleteSecurityProxyResponse> deleteSecurityProxy(DeleteSecurityProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrFirewallV2  DeleteTrFirewallV2Request
     * @return DeleteTrFirewallV2Response
     */
    @Override
    public CompletableFuture<DeleteTrFirewallV2Response> deleteTrFirewallV2(DeleteTrFirewallV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrFirewallV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrFirewallV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrFirewallV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallCenConfigure operation to delete a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallCenConfigure  DeleteVpcFirewallCenConfigureRequest
     * @return DeleteVpcFirewallCenConfigureResponse
     */
    @Override
    public CompletableFuture<DeleteVpcFirewallCenConfigureResponse> deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcFirewallCenConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcFirewallCenConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcFirewallCenConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallConfigure operation to delete a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallConfigure  DeleteVpcFirewallConfigureRequest
     * @return DeleteVpcFirewallConfigureResponse
     */
    @Override
    public CompletableFuture<DeleteVpcFirewallConfigureResponse> deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcFirewallConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcFirewallConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcFirewallConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallControlPolicy operation to delete an access control policy from a specific policy group for a VPC firewall. Different access control policies are used for the VPC firewall that is used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewall that is used to protect each Express Connect circuit. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallControlPolicy  DeleteVpcFirewallControlPolicyRequest
     * @return DeleteVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteVpcFirewallControlPolicyResponse> deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeACLProtectTrend  DescribeACLProtectTrendRequest
     * @return DescribeACLProtectTrendResponse
     */
    @Override
    public CompletableFuture<DescribeACLProtectTrendResponse> describeACLProtectTrend(DescribeACLProtectTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeACLProtectTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeACLProtectTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeACLProtectTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details about an address book for an access control policy.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAddressBook  DescribeAddressBookRequest
     * @return DescribeAddressBookResponse
     */
    @Override
    public CompletableFuture<DescribeAddressBookResponse> describeAddressBook(DescribeAddressBookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAddressBook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddressBookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddressBookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeAssetList operation to query the assets that are protected by Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAssetList  DescribeAssetListRequest
     * @return DescribeAssetListResponse
     */
    @Override
    public CompletableFuture<DescribeAssetListResponse> describeAssetList(DescribeAssetListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetRiskList  DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     */
    @Override
    public CompletableFuture<DescribeAssetRiskListResponse> describeAssetRiskList(DescribeAssetRiskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetRiskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetRiskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetRiskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetStatistic  DescribeAssetStatisticRequest
     * @return DescribeAssetStatisticResponse
     */
    @Override
    public CompletableFuture<DescribeAssetStatisticResponse> describeAssetStatistic(DescribeAssetStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCfwRiskLevelSummary  DescribeCfwRiskLevelSummaryRequest
     * @return DescribeCfwRiskLevelSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeCfwRiskLevelSummaryResponse> describeCfwRiskLevelSummary(DescribeCfwRiskLevelSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCfwRiskLevelSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCfwRiskLevelSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCfwRiskLevelSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeControlPolicy operation to query the details about access control policies by page.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeControlPolicy  DescribeControlPolicyRequest
     * @return DescribeControlPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeControlPolicyResponse> describeControlPolicy(DescribeControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDefaultIPSConfig  DescribeDefaultIPSConfigRequest
     * @return DescribeDefaultIPSConfigResponse
     */
    @Override
    public CompletableFuture<DescribeDefaultIPSConfigResponse> describeDefaultIPSConfig(DescribeDefaultIPSConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDefaultIPSConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDefaultIPSConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDefaultIPSConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeDomainResolve is deprecated  * @description You can use this operation to query the DNS record of a domain name. This operation can retrieve DNS records only from Alibaba Cloud DNS. Before you can call this operation, make sure that your domain name is hosted on Alibaba Cloud DNS.
     * ## Limits
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of DescribeDomainResolve  DescribeDomainResolveRequest
     * @return DescribeDomainResolveResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeDomainResolveResponse> describeDomainResolve(DescribeDomainResolveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainResolve").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainResolveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainResolveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDownloadTask  DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    @Override
    public CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDownloadTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDownloadTaskType  DescribeDownloadTaskTypeRequest
     * @return DescribeDownloadTaskTypeResponse
     */
    @Override
    public CompletableFuture<DescribeDownloadTaskTypeResponse> describeDownloadTaskType(DescribeDownloadTaskTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDownloadTaskType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDownloadTaskTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDownloadTaskTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about members in Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceMembers  DescribeInstanceMembersRequest
     * @return DescribeInstanceMembersResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceMembersResponse> describeInstanceMembers(DescribeInstanceMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceRiskLevels  DescribeInstanceRiskLevelsRequest
     * @return DescribeInstanceRiskLevelsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceRiskLevelsResponse> describeInstanceRiskLevels(DescribeInstanceRiskLevelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRiskLevels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRiskLevelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRiskLevelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInternetOpenIp  DescribeInternetOpenIpRequest
     * @return DescribeInternetOpenIpResponse
     */
    @Override
    public CompletableFuture<DescribeInternetOpenIpResponse> describeInternetOpenIp(DescribeInternetOpenIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInternetOpenIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInternetOpenIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInternetOpenIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInternetTrafficTrend  DescribeInternetTrafficTrendRequest
     * @return DescribeInternetTrafficTrendResponse
     */
    @Override
    public CompletableFuture<DescribeInternetTrafficTrendResponse> describeInternetTrafficTrend(DescribeInternetTrafficTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInternetTrafficTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInternetTrafficTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInternetTrafficTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInvadeEventList  DescribeInvadeEventListRequest
     * @return DescribeInvadeEventListResponse
     */
    @Override
    public CompletableFuture<DescribeInvadeEventListResponse> describeInvadeEventList(DescribeInvadeEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvadeEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvadeEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvadeEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNatAclPageStatus  DescribeNatAclPageStatusRequest
     * @return DescribeNatAclPageStatusResponse
     */
    @Override
    public CompletableFuture<DescribeNatAclPageStatusResponse> describeNatAclPageStatus(DescribeNatAclPageStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatAclPageStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatAclPageStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatAclPageStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallControlPolicy  DescribeNatFirewallControlPolicyRequest
     * @return DescribeNatFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeNatFirewallControlPolicyResponse> describeNatFirewallControlPolicy(DescribeNatFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNatFirewallList  DescribeNatFirewallListRequest
     * @return DescribeNatFirewallListResponse
     */
    @Override
    public CompletableFuture<DescribeNatFirewallListResponse> describeNatFirewallList(DescribeNatFirewallListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatFirewallList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatFirewallListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatFirewallListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallPolicyPriorUsed  DescribeNatFirewallPolicyPriorUsedRequest
     * @return DescribeNatFirewallPolicyPriorUsedResponse
     */
    @Override
    public CompletableFuture<DescribeNatFirewallPolicyPriorUsedResponse> describeNatFirewallPolicyPriorUsed(DescribeNatFirewallPolicyPriorUsedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatFirewallPolicyPriorUsed").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatFirewallPolicyPriorUsedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatFirewallPolicyPriorUsedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOutgoingDestinationIP  DescribeOutgoingDestinationIPRequest
     * @return DescribeOutgoingDestinationIPResponse
     */
    @Override
    public CompletableFuture<DescribeOutgoingDestinationIPResponse> describeOutgoingDestinationIP(DescribeOutgoingDestinationIPRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOutgoingDestinationIP").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOutgoingDestinationIPResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOutgoingDestinationIPResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOutgoingDomain  DescribeOutgoingDomainRequest
     * @return DescribeOutgoingDomainResponse
     */
    @Override
    public CompletableFuture<DescribeOutgoingDomainResponse> describeOutgoingDomain(DescribeOutgoingDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOutgoingDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOutgoingDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOutgoingDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribePolicyAdvancedConfig operation to query whether the strict mode is enabled for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePolicyAdvancedConfig  DescribePolicyAdvancedConfigRequest
     * @return DescribePolicyAdvancedConfigResponse
     */
    @Override
    public CompletableFuture<DescribePolicyAdvancedConfigResponse> describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePolicyAdvancedConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyAdvancedConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyAdvancedConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of the access control policies that match specific query conditions.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePolicyPriorUsed  DescribePolicyPriorUsedRequest
     * @return DescribePolicyPriorUsedResponse
     */
    @Override
    public CompletableFuture<DescribePolicyPriorUsedResponse> describePolicyPriorUsed(DescribePolicyPriorUsedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePolicyPriorUsed").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyPriorUsedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyPriorUsedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use Cloud Firewall that uses the pay-as-you-go billing method, you can call this operation to query traffic details accurate to the granularity of specific resource instances. If you use Cloud Firewall that uses the subscription billing method, you can call this operation to query the overall traffic details.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficDetail  DescribePostpayTrafficDetailRequest
     * @return DescribePostpayTrafficDetailResponse
     */
    @Override
    public CompletableFuture<DescribePostpayTrafficDetailResponse> describePostpayTrafficDetail(DescribePostpayTrafficDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePostpayTrafficDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePostpayTrafficDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePostpayTrafficDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query statistics of the current Cloud Firewall from the date of purchase.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficTotal  DescribePostpayTrafficTotalRequest
     * @return DescribePostpayTrafficTotalResponse
     */
    @Override
    public CompletableFuture<DescribePostpayTrafficTotalResponse> describePostpayTrafficTotal(DescribePostpayTrafficTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePostpayTrafficTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePostpayTrafficTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePostpayTrafficTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    @Override
    public CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixLists").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeRiskEventGroup operation to query and download the details of intrusion events. We recommend that you query the details of 5 to 10 intrusion events at a time. If you do not need to query the geographical information about IP addresses, you can set the NoLocation parameter to true to prevent query timeout.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRiskEventGroup  DescribeRiskEventGroupRequest
     * @return DescribeRiskEventGroupResponse
     */
    @Override
    public CompletableFuture<DescribeRiskEventGroupResponse> describeRiskEventGroup(DescribeRiskEventGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskEventGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskEventGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskEventGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRiskEventPayload  DescribeRiskEventPayloadRequest
     * @return DescribeRiskEventPayloadResponse
     */
    @Override
    public CompletableFuture<DescribeRiskEventPayloadResponse> describeRiskEventPayload(DescribeRiskEventPayloadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRiskEventPayload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRiskEventPayloadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRiskEventPayloadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSignatureLibVersion  DescribeSignatureLibVersionRequest
     * @return DescribeSignatureLibVersionResponse
     */
    @Override
    public CompletableFuture<DescribeSignatureLibVersionResponse> describeSignatureLibVersion(DescribeSignatureLibVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSignatureLibVersion").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSignatureLibVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSignatureLibVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrFirewallPolicyBackUpAssociationList  DescribeTrFirewallPolicyBackUpAssociationListRequest
     * @return DescribeTrFirewallPolicyBackUpAssociationListResponse
     */
    @Override
    public CompletableFuture<DescribeTrFirewallPolicyBackUpAssociationListResponse> describeTrFirewallPolicyBackUpAssociationList(DescribeTrFirewallPolicyBackUpAssociationListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrFirewallPolicyBackUpAssociationList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrFirewallPolicyBackUpAssociationListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrFirewallPolicyBackUpAssociationListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrFirewallV2RoutePolicyList  DescribeTrFirewallV2RoutePolicyListRequest
     * @return DescribeTrFirewallV2RoutePolicyListResponse
     */
    @Override
    public CompletableFuture<DescribeTrFirewallV2RoutePolicyListResponse> describeTrFirewallV2RoutePolicyList(DescribeTrFirewallV2RoutePolicyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrFirewallV2RoutePolicyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrFirewallV2RoutePolicyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrFirewallV2RoutePolicyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrFirewallsV2Detail  DescribeTrFirewallsV2DetailRequest
     * @return DescribeTrFirewallsV2DetailResponse
     */
    @Override
    public CompletableFuture<DescribeTrFirewallsV2DetailResponse> describeTrFirewallsV2Detail(DescribeTrFirewallsV2DetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrFirewallsV2Detail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrFirewallsV2DetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrFirewallsV2DetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrFirewallsV2List  DescribeTrFirewallsV2ListRequest
     * @return DescribeTrFirewallsV2ListResponse
     */
    @Override
    public CompletableFuture<DescribeTrFirewallsV2ListResponse> describeTrFirewallsV2List(DescribeTrFirewallsV2ListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrFirewallsV2List").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrFirewallsV2ListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrFirewallsV2ListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrFirewallsV2RouteList  DescribeTrFirewallsV2RouteListRequest
     * @return DescribeTrFirewallsV2RouteListResponse
     */
    @Override
    public CompletableFuture<DescribeTrFirewallsV2RouteListResponse> describeTrFirewallsV2RouteList(DescribeTrFirewallsV2RouteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrFirewallsV2RouteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrFirewallsV2RouteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrFirewallsV2RouteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserAssetIPTrafficInfo  DescribeUserAssetIPTrafficInfoRequest
     * @return DescribeUserAssetIPTrafficInfoResponse
     */
    @Override
    public CompletableFuture<DescribeUserAssetIPTrafficInfoResponse> describeUserAssetIPTrafficInfo(DescribeUserAssetIPTrafficInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserAssetIPTrafficInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserAssetIPTrafficInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserAssetIPTrafficInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the edition information about Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeUserBuyVersion  DescribeUserBuyVersionRequest
     * @return DescribeUserBuyVersionResponse
     */
    @Override
    public CompletableFuture<DescribeUserBuyVersionResponse> describeUserBuyVersion(DescribeUserBuyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBuyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserBuyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserBuyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserIPSWhitelist  DescribeUserIPSWhitelistRequest
     * @return DescribeUserIPSWhitelistResponse
     */
    @Override
    public CompletableFuture<DescribeUserIPSWhitelistResponse> describeUserIPSWhitelist(DescribeUserIPSWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserIPSWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserIPSWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserIPSWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallAclGroupList operation to query the information about all policy groups of access control policies that are created for VPC firewalls.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallAclGroupList  DescribeVpcFirewallAclGroupListRequest
     * @return DescribeVpcFirewallAclGroupListResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallAclGroupListResponse> describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallAclGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallAclGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallAclGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenDetail operation to query the details about a VPC firewall. The VPC firewall protects access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenDetail  DescribeVpcFirewallCenDetailRequest
     * @return DescribeVpcFirewallCenDetailResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallCenDetailResponse> describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallCenDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallCenDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallCenDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenList operation to query VPC firewalls. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenList  DescribeVpcFirewallCenListRequest
     * @return DescribeVpcFirewallCenListResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallCenListResponse> describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallCenList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallCenListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallCenListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallControlPolicy operation to query the information about all access control policies that are created for a specified VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallControlPolicy  DescribeVpcFirewallControlPolicyRequest
     * @return DescribeVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallControlPolicyResponse> describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDefaultIPSConfig operation to query the intrusion prevention configurations of a VPC firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDefaultIPSConfig  DescribeVpcFirewallDefaultIPSConfigRequest
     * @return DescribeVpcFirewallDefaultIPSConfigResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallDefaultIPSConfigResponse> describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallDefaultIPSConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallDefaultIPSConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallDefaultIPSConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDetail operation to query the details about a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.<br>Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallconfigure">CreateVpcFirewallConfigure</a> operation.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDetail  DescribeVpcFirewallDetailRequest
     * @return DescribeVpcFirewallDetailResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallDetailResponse> describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcFirewallIPSWhitelist  DescribeVpcFirewallIPSWhitelistRequest
     * @return DescribeVpcFirewallIPSWhitelistResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallIPSWhitelistResponse> describeVpcFirewallIPSWhitelist(DescribeVpcFirewallIPSWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallIPSWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallIPSWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallIPSWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallList  DescribeVpcFirewallListRequest
     * @return DescribeVpcFirewallListResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallListResponse> describeVpcFirewallList(DescribeVpcFirewallListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of access control policies that are created for a VPC firewall in a specific policy group.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallPolicyPriorUsed  DescribeVpcFirewallPolicyPriorUsedRequest
     * @return DescribeVpcFirewallPolicyPriorUsedResponse
     */
    @Override
    public CompletableFuture<DescribeVpcFirewallPolicyPriorUsedResponse> describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcFirewallPolicyPriorUsed").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcFirewallPolicyPriorUsedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcFirewallPolicyPriorUsedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcListLite  DescribeVpcListLiteRequest
     * @return DescribeVpcListLiteResponse
     */
    @Override
    public CompletableFuture<DescribeVpcListLiteResponse> describeVpcListLite(DescribeVpcListLiteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcListLite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcListLiteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcListLiteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcZone  DescribeVpcZoneRequest
     * @return DescribeVpcZoneResponse
     */
    @Override
    public CompletableFuture<DescribeVpcZoneResponse> describeVpcZone(DescribeVpcZoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcZone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcZoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcZoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVulnerabilityProtectedList  DescribeVulnerabilityProtectedListRequest
     * @return DescribeVulnerabilityProtectedListResponse
     */
    @Override
    public CompletableFuture<DescribeVulnerabilityProtectedListResponse> describeVulnerabilityProtectedList(DescribeVulnerabilityProtectedListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVulnerabilityProtectedList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVulnerabilityProtectedListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVulnerabilityProtectedListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyAddressBook operation to modify the address book that is configured for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyAddressBook  ModifyAddressBookRequest
     * @return ModifyAddressBookResponse
     */
    @Override
    public CompletableFuture<ModifyAddressBookResponse> modifyAddressBook(ModifyAddressBookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAddressBook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAddressBookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAddressBookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an access control policy. The policy allows Cloud Firewall to allow, deny, or monitor the traffic that passes through Cloud Firewall.</p>
     * <h2><a href="#qps"></a>Limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyControlPolicy  ModifyControlPolicyRequest
     * @return ModifyControlPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyControlPolicyResponse> modifyControlPolicy(ModifyControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyControlPolicyPosition  ModifyControlPolicyPositionRequest
     * @return ModifyControlPolicyPositionResponse
     */
    @Override
    public CompletableFuture<ModifyControlPolicyPositionResponse> modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyControlPolicyPosition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyControlPolicyPositionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyControlPolicyPositionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDefaultIPSConfig  ModifyDefaultIPSConfigRequest
     * @return ModifyDefaultIPSConfigResponse
     */
    @Override
    public CompletableFuture<ModifyDefaultIPSConfigResponse> modifyDefaultIPSConfig(ModifyDefaultIPSConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDefaultIPSConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDefaultIPSConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDefaultIPSConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyFirewallV2RoutePolicySwitch  ModifyFirewallV2RoutePolicySwitchRequest
     * @return ModifyFirewallV2RoutePolicySwitchResponse
     */
    @Override
    public CompletableFuture<ModifyFirewallV2RoutePolicySwitchResponse> modifyFirewallV2RoutePolicySwitch(ModifyFirewallV2RoutePolicySwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFirewallV2RoutePolicySwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFirewallV2RoutePolicySwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFirewallV2RoutePolicySwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyInstanceMemberAttributes operation to update the information about members in Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second for each account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyInstanceMemberAttributes  ModifyInstanceMemberAttributesRequest
     * @return ModifyInstanceMemberAttributesResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceMemberAttributesResponse> modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMemberAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMemberAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMemberAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the configurations of an access control policy. The policy is used to allow, deny, or monitor traffic that reaches a NAT firewall.</p>
     * 
     * @param request the request parameters of ModifyNatFirewallControlPolicy  ModifyNatFirewallControlPolicyRequest
     * @return ModifyNatFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyNatFirewallControlPolicyResponse> modifyNatFirewallControlPolicy(ModifyNatFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyNatFirewallControlPolicyPosition  ModifyNatFirewallControlPolicyPositionRequest
     * @return ModifyNatFirewallControlPolicyPositionResponse
     */
    @Override
    public CompletableFuture<ModifyNatFirewallControlPolicyPositionResponse> modifyNatFirewallControlPolicyPosition(ModifyNatFirewallControlPolicyPositionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatFirewallControlPolicyPosition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatFirewallControlPolicyPositionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatFirewallControlPolicyPositionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyObjectGroupOperation  ModifyObjectGroupOperationRequest
     * @return ModifyObjectGroupOperationResponse
     */
    @Override
    public CompletableFuture<ModifyObjectGroupOperationResponse> modifyObjectGroupOperation(ModifyObjectGroupOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyObjectGroupOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyObjectGroupOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyObjectGroupOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyPolicyAdvancedConfig operation to enable or disable the strict mode for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyPolicyAdvancedConfig  ModifyPolicyAdvancedConfigRequest
     * @return ModifyPolicyAdvancedConfigResponse
     */
    @Override
    public CompletableFuture<ModifyPolicyAdvancedConfigResponse> modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPolicyAdvancedConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPolicyAdvancedConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPolicyAdvancedConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTrFirewallV2Configuration  ModifyTrFirewallV2ConfigurationRequest
     * @return ModifyTrFirewallV2ConfigurationResponse
     */
    @Override
    public CompletableFuture<ModifyTrFirewallV2ConfigurationResponse> modifyTrFirewallV2Configuration(ModifyTrFirewallV2ConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTrFirewallV2Configuration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTrFirewallV2ConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTrFirewallV2ConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTrFirewallV2RoutePolicyScope  ModifyTrFirewallV2RoutePolicyScopeRequest
     * @return ModifyTrFirewallV2RoutePolicyScopeResponse
     */
    @Override
    public CompletableFuture<ModifyTrFirewallV2RoutePolicyScopeResponse> modifyTrFirewallV2RoutePolicyScope(ModifyTrFirewallV2RoutePolicyScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTrFirewallV2RoutePolicyScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTrFirewallV2RoutePolicyScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTrFirewallV2RoutePolicyScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyUserIPSWhitelist  ModifyUserIPSWhitelistRequest
     * @return ModifyUserIPSWhitelistResponse
     */
    @Override
    public CompletableFuture<ModifyUserIPSWhitelistResponse> modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUserIPSWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUserIPSWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUserIPSWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenConfigure operation to modify the configurations of a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenConfigure  ModifyVpcFirewallCenConfigureRequest
     * @return ModifyVpcFirewallCenConfigureResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallCenConfigureResponse> modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallCenConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallCenConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallCenConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenSwitchStatus operation to enable or disable a VPC firewall. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. After you enable the VPC firewall, the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. After you disable the VPC firewall, the VPC firewall no longer protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance.
     * Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenSwitchStatus  ModifyVpcFirewallCenSwitchStatusRequest
     * @return ModifyVpcFirewallCenSwitchStatusResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallCenSwitchStatusResponse> modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallCenSwitchStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallCenSwitchStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallCenSwitchStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallConfigure operation to modify the configurations of a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallConfigure  ModifyVpcFirewallConfigureRequest
     * @return ModifyVpcFirewallConfigureResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallConfigureResponse> modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallConfigure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallConfigureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallConfigureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallControlPolicy operation to modify the configurations of an access control policy that is created for a VPC firewall in a specified policy group. Different access control policies are used for the VPC firewalls that are used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewalls that are used to protect each Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicy  ModifyVpcFirewallControlPolicyRequest
     * @return ModifyVpcFirewallControlPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallControlPolicyResponse> modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an access control policy that is created for a VPC firewall in a specific policy group.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicyPosition  ModifyVpcFirewallControlPolicyPositionRequest
     * @return ModifyVpcFirewallControlPolicyPositionResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallControlPolicyPositionResponse> modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallControlPolicyPosition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallControlPolicyPositionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallControlPolicyPositionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the intrusion prevention configurations of a VPC firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallDefaultIPSConfig  ModifyVpcFirewallDefaultIPSConfigRequest
     * @return ModifyVpcFirewallDefaultIPSConfigResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallDefaultIPSConfigResponse> modifyVpcFirewallDefaultIPSConfig(ModifyVpcFirewallDefaultIPSConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallDefaultIPSConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallDefaultIPSConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallDefaultIPSConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVpcFirewallIPSWhitelist  ModifyVpcFirewallIPSWhitelistRequest
     * @return ModifyVpcFirewallIPSWhitelistResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallIPSWhitelistResponse> modifyVpcFirewallIPSWhitelist(ModifyVpcFirewallIPSWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallIPSWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallIPSWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallIPSWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallSwitchStatus operation to enable or disable a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit. After you enable the VPC firewall, the VPC firewall protects access traffic between two VPCs that are connected by using an Express Connect circuit. After you disable the VPC firewall, the VPC firewall no longer protects access traffic between two VPCs that are connected by using an Express Connect circuit.
     * Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallSwitchStatus  ModifyVpcFirewallSwitchStatusRequest
     * @return ModifyVpcFirewallSwitchStatusResponse
     */
    @Override
    public CompletableFuture<ModifyVpcFirewallSwitchStatusResponse> modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcFirewallSwitchStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcFirewallSwitchStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcFirewallSwitchStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableAllFwSwitch operation to turn off all firewall switches.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutDisableAllFwSwitch  PutDisableAllFwSwitchRequest
     * @return PutDisableAllFwSwitchResponse
     */
    @Override
    public CompletableFuture<PutDisableAllFwSwitchResponse> putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDisableAllFwSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDisableAllFwSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDisableAllFwSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableFwSwitch operation to disable a firewall for specific assets. After you disable the firewall, traffic does not pass through Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutDisableFwSwitch  PutDisableFwSwitchRequest
     * @return PutDisableFwSwitchResponse
     */
    @Override
    public CompletableFuture<PutDisableFwSwitchResponse> putDisableFwSwitch(PutDisableFwSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDisableFwSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDisableFwSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDisableFwSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutEnableAllFwSwitch operation to enable a firewall for all public IP addresses within your Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutEnableAllFwSwitch  PutEnableAllFwSwitchRequest
     * @return PutEnableAllFwSwitchResponse
     */
    @Override
    public CompletableFuture<PutEnableAllFwSwitchResponse> putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutEnableAllFwSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutEnableAllFwSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutEnableAllFwSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable a firewall. After you enable a firewall, traffic passes through Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutEnableFwSwitch  PutEnableFwSwitchRequest
     * @return PutEnableFwSwitchResponse
     */
    @Override
    public CompletableFuture<PutEnableFwSwitchResponse> putEnableFwSwitch(PutEnableFwSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutEnableFwSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutEnableFwSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutEnableFwSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleasePostInstance  ReleasePostInstanceRequest
     * @return ReleasePostInstanceResponse
     */
    @Override
    public CompletableFuture<ReleasePostInstanceResponse> releasePostInstance(ReleasePostInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleasePostInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleasePostInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleasePostInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetNatFirewallRuleHitCount  ResetNatFirewallRuleHitCountRequest
     * @return ResetNatFirewallRuleHitCountResponse
     */
    @Override
    public CompletableFuture<ResetNatFirewallRuleHitCountResponse> resetNatFirewallRuleHitCount(ResetNatFirewallRuleHitCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetNatFirewallRuleHitCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetNatFirewallRuleHitCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetNatFirewallRuleHitCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the ResetVpcFirewallRuleHitCount operation to clear the count on hits of an access control policy that is created for a VPC firewall in a specific policy group.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ResetVpcFirewallRuleHitCount  ResetVpcFirewallRuleHitCountRequest
     * @return ResetVpcFirewallRuleHitCountResponse
     */
    @Override
    public CompletableFuture<ResetVpcFirewallRuleHitCountResponse> resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetVpcFirewallRuleHitCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetVpcFirewallRuleHitCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetVpcFirewallRuleHitCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchSecurityProxy  SwitchSecurityProxyRequest
     * @return SwitchSecurityProxyResponse
     */
    @Override
    public CompletableFuture<SwitchSecurityProxyResponse> switchSecurityProxy(SwitchSecurityProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchSecurityProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchSecurityProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchSecurityProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
