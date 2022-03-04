// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ecs20140526.models.*;
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
        this.product = "Ecs";
        this.version = "2014-05-26";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "ecs.aliyuncs.com"),
            new TeaPair("us-west-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ecs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ecs.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ecs.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ecs.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AcceptInquiredSystemEventResponse> acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptInquiredSystemEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptInquiredSystemEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptInquiredSystemEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ActivateRouterInterfaceResponse> activateRouterInterface(ActivateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AddBandwidthPackageIpsResponse> addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBandwidthPackageIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBandwidthPackageIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -You can add up to 20 tags to a single ECS resource.
    
    -The tag key ("Tag.N.Key") must match the tag value ("Tag.N.Value").
    
    -If the tag key ("Tag.N.Key") already exists on the specified resource, the new tag value ("Tag.N.Value") is used to automatically overwrite the original tag value.
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
     * ## API description
    
    Before creating a dedicated host, you can call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
    
    Fees are incurred when you create a dedicated host. We recommend that you know the billing method of resources in advance. For more information, see [billing Overview](~~ 68978 ~~).
    
    -You can create up to 100 subscription or pay-as-you-go dedicated hosts at a time.
    
    -After the DDH is created, you can use the returned DDH ID list as the request parameter and call [DescribeDedicatedHosts](~~ 134242 ~~) to query the status of the new DDH.
    
    -After you submit a request to create a dedicated host, an error is reported if the specified parameter value is not compliant or the inventory is insufficient. For more information, see error codes.
    
    -After creating a dedicated host, you can use [ModifyInstanceDeployment](~~ 134248 ~~) to migrate an ECS instance from a shared host to a dedicated host, or you can adjust the instance deployment on two dedicated hosts.
     */
    @Override
    public CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * > This operation has been upgraded. We do not recommend that you continue to use this operation. For more information, see [AllocateEipAddress](~~ 120192 ~~).
     */
    @Override
    public CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Before assigning a public IP address, the instance must be in the **running**("Running") or **stopped**("Stopped") status.
    
    -When "OperationLocks" is marked with ""LockReason" : "security"" in the instance of [security control](~~ 25695 ~~), public IP addresses cannot be assigned.
    
    -Only one public IP address can be assigned to an instance. If the instance already has a public IP address, an error "allocatedalreade" is returned ".
    
    -After the instance is restarted ([RebootInstance](~~ 25502 ~~)) or the instance is started ([StartInstance](~~ 25500 ~~)), the new public IP address takes effect.
    
    In addition to assigning a public IP address, you can bind an elastic IP address (EIP) to a VPC-type ECS instance. For more information, see [AssociateEipAddress](~~ 36017 ~~).
    
    > After An EIP is bound to a VPC instance, no public IP address can be assigned.
     */
    @Override
    public CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocatePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocatePublicIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocatePublicIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Only one automatic snapshot policy can be applied to a cloud disk.
    
    -One automatic snapshot policy can be applied to multiple disks.
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
     * ## API description
    
    You can specify the IPv6 addresses of the CIDR block of the vSwitch to which the Eni belongs, or specify the number of IPv6 addresses to automatically create IPv6 addresses. Note:
    
    -The vSwitch to which the Eni belongs must have IPv6 enabled. For more information, see [enable IPv6 CIDR blocks for existing vswitches](~~ 98923 ~~).
    
    -The Eni must be in the Available or InUse state.
    
    -The ECS instance associated with the primary Eni must be in the Running (Running) or Stopped (Stopped) state.
    
    -The number of IPv6 addresses that an eni can assign depends on the instance type attached to the eni.
    -If the Eni is in the Available state, a maximum of 10 IPv6 addresses can be allocated.
    
    -If an Eni is attached to an instance, the number of IPv6 addresses that can be allocated is limited by the instance type. For more information, see [instance type family](~~ 25378 ~~).
    
    -After you call this operation, you can obtain the assigned IPv6 address information from the returned results.
    
     */
    @Override
    public CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignIpv6AddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignIpv6AddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Only enis in the Available (Available) or InUse state are supported.
    
    -When operating the primary eni, the attached instance must be in the Running (Running) or Stopped (Stopped) state.
    
    -When the eni is in the Available (Available) state, a maximum of 10 secondary private ip addresses can be assigned. Once attached to an instance, the number of secondary private ip addresses that the nic can assign is limited by the instance type. For more information, see [instance type family](~~ 25378 ~~).
    
    -After you call this operation, you can obtain the allocated secondary private ip addresses from the returned results.
     */
    @Override
    public CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignPrivateIpAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignPrivateIpAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Before connecting to an instance of the classic network type, the instance must be in the **Running**(Running) or **Stopped**(Stopped) status.
    
    -The ClassicLink feature must be enabled for the target VPC. For more information, see [enable ClassicLink](~~ 65413 ~~).
    
    -The classic network instance and the VPC must be in the same Alibaba Cloud region.
     */
    @Override
    public CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachClassicLinkVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachClassicLinkVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The status of the disk must be **to be mounted**("Available").
    
    -When you mount a data disk:
    
    -The target ECS instance must be in the **running**("Running") or **stopped**("Stopped") status.
    -If you purchase a cloud disk separately, the billing method must be pay-as-you-go.
    -When a system disk is mounted from an ECS instance as a data disk, the billing method is not limited.
    
    -When the system disk is mounted:
    
    -The target ECS instance must be the source instance when the system disk is uninstalled.
    -The target ECS instance must be in the **stopped**("Stopped") status.
    -You must set the instance logon credential.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    <props="china">
    -Disks with multiple mount features can only be mounted to instances that support the NVMe protocol. For more information, see [support NVMe for ESSDS](~~ 256487 ~~) and [use multiple Mount functions](~~ 262105 ~~).
    
    </props>
    
     */
    @Override
    public CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you use this API, note that:
    
    -Windows instance does not support SSH key pairs.
    -After you bind an SSH key pair, the authentication method of username and password is disabled.
    -If the instance is in the **Running**(Running) state, restart the instance ([RebootInstance](~~ 25502 ~~)) and the SSH key pair takes effect.
    -If the instance is in the **Stopped**(Stopped) status, the SSH key pair takes effect after the instance is started ([StartInstance](~~ 25500 ~~).
    -If the instance is bound with an SSH key pair, the new SSH key pair automatically replaces the original SSH key pair.
     */
    @Override
    public CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Note the following when you call this operation:
    
    -The Eni must be in the **Available**("Available") state. An Eni can only be attached to one instance at a time.
    
    -The instance must be in the Running (Running) or Stopped (Stopped) state. Some instance types must be in the Stopped (Stopped) state when binding an Eni. For more information, see the ECS instance types section of the instance to be Stopped in [bind an Eni](~~ 58503 ~~).
    
    > If the instance was last started before April 1, 2018 (including but not limited to starting, restarting, and restarting a new instance), you must call the RebootInstance to restart the instance that remains in the running state in advance. Otherwise, you cannot attach an Eni.
    
    -An instance can be attached with multiple Enis at the same time. For more information, see [Enis Overview](~~ 58496 ~~).
    
    -The vSwitch of the instance and the Eni must belong to the same zone and VPC.
    
    
     */
    @Override
    public CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In the API document of the security group, the initiator of the traffic is the Source and the receiver of the data transmission is the Dest.
    
    When you call this operation, you need to understand the following:
    
    -The total number of outbound and inbound security group rules cannot exceed 200.
    
    -The Priority (Priority) of security group rules can be from 1 to 100. A smaller number indicates a higher priority.
    
    -For security group rules with the same priority, the drop rule takes precedence.
    
    -The source device can be a specified IP address range (SourceCidrIp, Ipv6SourceCidrIp, SourcePrefixListId), or an ECS instance in another security group (SourceGroupId).
    
    -If a matching Security Group rule already exists, the AuthorizeSecurityGroup is called successfully, but the number of rules is not increased.
    
    -A security group rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Set the ACL for the specified CIDR block. In this case, you can set the network card type (NicType) of the classic network security group to internet and intranet. You can only set the network interface (NicType) of a VPC security group to intranet. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, and SourceCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroup
    &SecurityGroupId=sg-F876FF7**
    &SourceCidrIp=10.0.0.0/8
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    
    -Set the access permissions of other security groups. In this case, the NIC type (NicType) can only be intranet. When mutual access between classic network security groups, you can set the access permissions of other security groups in the same region to your security group. This security group can belong to you or other Alibaba cloud accounts (SourceGroupOwnerAccount). When a VPC-type security group accesses each other, you can set the access permissions of other security groups in the same VPC to access the security group. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, SourceGroupOwnerAccount, and SourceGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroup
    &SecurityGroupId=sg-F876FF7**
    &SourceGroupId=sg-1651FBB**
    &SourceGroupOwnerAccount=test@aliyun.com
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=drop
    & <common request parameters>
    """
    
    -Associate a prefix list with a security group rule. In this case, the prefix list only supports security groups whose network type is VPC, and NicType can only be set to intranet. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, and SourcePrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroup
    &SecurityGroupId=sg-F876FF7**
    &SourcePrefixListId=pl-x1j1k5ykzqlixdcy ****
    &SourceGroupOwnerAccount=test@aliyun.com
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=drop
    & <common request parameters>
    """
    
    -For more information about how to set security group rules, see [application cases](~~ 25475 ~~) and [Introduction to security group quintuple rules](~~ 97439 ~~).
     */
    @Override
    public CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In the API document of the security group, the initiator of the traffic is the Source and the receiver of the data transmission is the Dest.
    
    When you call this operation, you need to understand the following:
    
    -The total number of outbound and inbound security group rules cannot exceed 200.
    
    -Security group rules include accept and drop.
    
    -The Priority (Priority) of security group rules can be from 1 to 100. A smaller number indicates a higher priority.
    
    -For security group rules with the same priority, the drop rule takes precedence.
    
    -The destination device can be a specified IP address range (DestCidrIp, Ipv6DestCidrIp, DestPrefixListId), or an ECS instance in another security group (DestGroupId).
    
    -If a matching Security Group rule already exists, the AuthorizeSecurityGroupEgress is called successfully, but the number of rules is not increased.
    
    -A security group rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Set the ACL for the specified CIDR block. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, and DestCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &IpProtocol=icmp
    &DestCidrIp=10.0.0.0/8
    &PortRange=-1/-1
    &NicType=intranet
    &Policy=Allow
    & <common request parameters>
    """
    
    -Set the access permissions of other security groups. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, DestGroupOwnerAccount, and DestGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &DestGroupId=sg-bp67acfmxazb4pi ***
    &DestGroupOwnerAccount=Test@aliyun.com
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=Drop
    & <common request parameters>
    """
    
    -Associate a prefix list with a security group rule. In this case, the prefix list only supports security groups whose network type is VPC, and NicType can only be set to intranet. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, and DestPrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=AuthorizeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &DestPrefixListId=pl-x1j1k5ykzqlixdcy ****
    &DestGroupOwnerAccount=Test@aliyun.com
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=Drop
    & <common request parameters>
    """
     */
    @Override
    public CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeSecurityGroupEgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeSecurityGroupEgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * ## API description
    
    When you call this operation, note that:
    
    -After you cancel the copy, the new image in the target region is automatically deleted and the source image remains unchanged.
    -If the image is copied, the operation fails and an error message is returned.
     */
    @Override
    public CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCopyImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCopyImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelSimulatedSystemEventsResponse> cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelSimulatedSystemEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelSimulatedSystemEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConnectRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConnectRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConnectRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    After the public IP address is converted to an EIP, the EIP is billed separately. Make sure that you have fully understood [the billing method of EIP](~~ 122035 ~~).
    
    When you call this operation, the ECS instance must meet the following requirements:
    
    -The status is **stopped**("Stopped") or **running**("Running").
    
    -No EIP is bound.
    
    -There are no configuration change tasks that have not taken effect.
    
    -The public network bandwidth cannot be 0 Mbit/s.
    
    -Internet bandwidth is billed by traffic.
    
    -Subscription ECS instances of the VPC type do not expire within 24 hours.
    
    
    
    
     */
    @Override
    public CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertNatPublicIpToEip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertNatPublicIpToEipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertNatPublicIpToEipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can use the copied image to create an ECS instance (RunInstances) in another region, or change the system disk (ReplaceSystemDisk) of the instance.
    
    When you call this operation, note that:
    
    -The custom image must be in the available status ("Available").
    
    -The source image must be an image under your account and cannot be copied across accounts.
    
    -When you copy an image, you cannot delete the copied image ([DeleteImage](~~ 25537 ~~), but you can cancel the copy task ([CancelCopyImage](~~ 25539 ~~)).
    
    -Only one image copy task can be run in the same region. Other tasks must be queued until the last task is completed.
    
    -You can use the "ResourceGroupId" parameter to specify the resource group to which the copied image belongs. If the "ResourceGroupId" parameter is not set, the copied image belongs to the default resource group.
     */
    @Override
    public CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The new snapshot cannot be rolled back to the disk corresponding to the source snapshot.
    -Encrypted snapshots cannot be copied.
    -Local snapshots cannot be copied.
     */
    @Override
    public CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopySnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopySnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopySnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    After you register a non-alibaba cloud server as an alibaba cloud managed instance by using an activation code, you can use various online services provided by alibaba cloud (such as cloud assistant, o & m orchestration service, and yunxiao) in the managed instance.
    
    The operating system of a non-alibaba cloud server must comply with the following versions, and the server can access the public network before it can be registered as an alibaba cloud managed instance.
    
    -Alibaba Cloud Linux 2/3 and later
    -CentOS 6, 7, 8, and later
    -Debian 8/9/10 and later
    -Ubuntu 12/14/16/18 and later
    -CoreOS
    -OpenSUSE
    -RedHat 5/6/7 and later
    -SUSE Linux Enterprise Server 11/12/15 and later
    -Window Server 2012/2016/2019 and later
    
    
     */
    @Override
    public CompletableFuture<CreateActivationResponse> createActivation(CreateActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Auto provisioning is a solution that uses preemptible instances and pay-as-you-go instances to quickly deploy instance clusters. It supports one-click deployment of instance clusters across billing methods, zones, and instance type families. For more information, see [create multiple ECS instances by using auto provisioning group APIs](~~ 200772 ~~).
    
    -Auto provisioning uses the auto provisioning group as the carrier to schedule and maintain computing resources. You can use auto provisioning groups to stably provide computing power and mitigate the instability caused by the recovery mechanism of preemptible instances.
    
    -Auto provisioning is free of charge, but you need to pay for instance resources created from the auto provisioning group. For more information, see [preemptible instance billing](~~ 52088 ~~) and [pay-as-you-go](~~ 40653 ~~).
    
    -If you specify both the launch template ("LaunchTemplateId") and the launch configuration ("LaunchConfiguration.* "), the system preferentially uses the launch template.
     */
    @Override
    public CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation to create an automatic snapshot policy, you can set the automatic snapshot repetition period, retention time, and cross-region backup policies. Meet your diverse data backup requirements. After creating an automatic snapshot policy, you must call [ApplyAutoSnapshotPolicy](~~ 25531 ~~) to apply the policy to the target disk. To adjust the content of an automatic snapshot policy, call [ModifyAutoSnapshotPolicyEx](~~ 25529 ~~).
    
    When you call this operation, note that:
    
    -An Alibaba Cloud account can create up to 100 automatic snapshot policies in a region.
    
    -If the disk data is large and the time interval between two automatic snapshots is exceeded, the next time point is automatically skipped. For example, you have set the automatic snapshot time point to 09:00, 10:00, 11:00, and 12:00. Due to the large amount of disk data, it takes 80 minutes to create a snapshot at 09:00 and create a snapshot at 10:20. The system skips the time point 10:00 and continues to create automatic snapshots for you until 11:00.
    
    -For more information about how to copy snapshots across regions, see the background information section of [copy snapshots](~~ 159441 ~~).
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
     * ## API description
    
    You can use the capacity reservation service to specify attributes such as zones and instance types. The system reserves resources that match the attributes in a private pool. For more information, see [active capacity reservation Overview](~~ 193633 ~~).
    
    -Currently, only the active mode is supported. After the subscription takes effect immediately, the instance types are billed according to the pay-as-you-go Standard. No matter whether a pay-as-you-go instance is actually created, the subscription takes effect immediately until you manually release it or when it expires.
    -You can set the private pool capacity option when creating an instance through [CreateInstance](~~ 25499 ~~) or [RunInstances](~~ 63440 ~~), or modify the private pool capacity option of the instance through [ModifyInstanceAttachmentAttributes](~~ 190006 ~~). After the instance matches the capacity of the private pool, you are charged for the instance type, cloud disk, Internet bandwidth, and other resources based on your instance configuration.
    -If no pay-as-you-go instance is created, only the instance type fee is charged.
    -Pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go pay-as-you-go. We recommend that you purchase a reserved instance or save plan first, and use the available capacity reservation service to guarantee the availability of resources for free.
    
    > You can call this operation to create a capacity reservation that takes effect immediately. In the ECS console, you can create a capacity reservation that takes effect immediately or at a specified time. For more information, see [resource reservation service](~~ 193626#section-oil-qh5-xvx ~~).
     */
    @Override
    public CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -You can create the following types of commands:
    
    -Windows the Bat script (RunBatScript) applicable to the instance.
    
    -Windows the PowerShell script for the instance (RunPowerShellScript).
    
    -The Shell script (RunShellScript) applicable to Linux instances.
    
    -You can specify the parameter TimeOut to set the maximum TimeOut period when a command is executed in an ECS instance. After the command execution times out, the [cloud assistant client](~~ 64921 ~~) forcibly terminates the command process, that is, cancels the PID of the command.
    
    -For a single execution, the execution status ([InvokeRecordStatus](~~ 64845 ~~)) of the specified ECS instance changes to Failed after the execution times out.
    
    -For periodic execution:
    
    -The timeout period for periodic execution is valid for each execution record.
    
    -After an execution times out, the status of the execution record ([InvokeRecordStatus](~~ 64845 ~~)) changes to Failed.
    
    -Whether the last execution times out does not affect the next execution.
    
    -You can keep up to 100 cloud assistant commands in a region. You can also open a ticket to adjust the quota.
    
    -You can specify the execution path for the command by specifying the parameter WorkingDir. For Linux instances, the root user of the administrator is in the home directory by default, which is the/root" directory. For Windows instances, the default directory of the cloud assistant client process is C:WindowsSystem32.
    
    -You can enable custom parameters by specifying EnableParameter = true. When setting CommandContent, you can use {{parameter}} to represent custom parameters, and pass in custom parameter key-value pairs when running the command ([InvokeCommand](~~ 64841 ~~). For example, when you create a command, you create the "echo {{name}}"command. When you InvokeCommand the command, you pass in the key-value pair"<name, Jack>"through the Parameters parameter". The custom parameters are automatically replaced by the command. You can obtain a new command and run the "echo Jack" command in the instance ".
     */
    @Override
    public CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    > The exclusive block storage cluster feature currently supports the China South 2 (Heyuan), Indonesia (Jakarta), and China South 1 (Shenzhen) regions of the financial cloud.
    
    Exclusive Block Storage Cluster (Dedicated Block Storage Cluster) is a Block Storage service that is physically isolated from other public Block Storage clusters and the owner can exclusively enjoy the entire Cluster resources. For more information, see [what is exclusive block storage cluster](~~ 208883 ~~).
    
    Disks created in the exclusive block storage cluster can only be attached to ECS instances in the same zone. Before creating an exclusive block storage cluster, you must plan the region and zone to which the resource belongs.
    
     */
    @Override
    public CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedBlockStorageCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDedicatedBlockStorageClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDedicatedBlockStorageClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDedicatedHostClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDedicatedHostClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can call this operation to submit instance type requirements. Alibaba Cloud provides relevant resources based on your requirements.
    
    Only I/O optimized instance types and VPC-connected ECS instances can be reported.
    
    > This API is in use for internal testing and has not been officially launched. We recommend that you do not use this API. Please wait.
     */
    @Override
    public CompletableFuture<CreateDemandResponse> createDemand(CreateDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDeploymentSetResponse> createDeploymentSet(CreateDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props="china">
    -Real-name authentication is required to create a cloud disk. Please go to the member information [real-name authentication](https://account.console.aliyun.com/#/auth/home).
    -Creating a cloud disk involves resource billing. We recommend that you know the billing method of ECS in advance. For more information, see [billing Overview](~~ 25398 ~~).
    -When you create a cloud disk, the automatic snapshot is deleted when the disk is deleted. The value of "DeleteAutoSnapshot" is "true ". You can use [ModifyDiskAttribute](~~ 25517 ~~) to modify this parameter.
    -If you do not set the performance level when creating an ESSD, the default value is pl1. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    -You can enable the multi-Mount feature ("MultiAttach") when creating a cloud disk. We recommend that you understand this feature and its limits. For more information, see [NVMe support for ESSDS](~~ 256487 ~~) and [use multiple Mount functions](~~ 262105 ~~).
    
    </props>
    
    <props="intl">
    -Creating a cloud disk involves resource billing. We recommend that you know the billing method of ECS in advance. For more information, see [billing Overview](~~ 25398 ~~).
    -When you create a cloud disk, the automatic snapshot is deleted when the disk is deleted. The value of "DeleteAutoSnapshot" is "true ". You can use [ModifyDiskAttribute](~~ 25517 ~~) to modify this parameter.
    -If you do not set the performance level when creating an ESSD, the default value is pl1. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    
    </props>
    
    <props="partner">
    -Creating a cloud disk involves resource billing. We recommend that you know the billing method of ECS in advance. For more information, see [billing Overview](~~ 25398 ~~).
    -When you create a cloud disk, the automatic snapshot is deleted when the disk is deleted. The value of "DeleteAutoSnapshot" is "true ". You can use [ModifyDiskAttribute](~~ 25517 ~~) to modify this parameter.
    -If you do not set the performance level when creating an ESSD, the default value is pl1. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    
    </props>
    
     */
    @Override
    public CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    Elastic guarantee service provides you with a new way to purchase and use resources with both flexibility and certainty. It is a service that allows you to purchase and use resources to pay-as-you-go ECS instances. For more information, see [Overview](~~ 193630 ~~).
    
    -Refund is not supported after you purchase the elastic protection service.
    -Only pay-as-you-go ECS instances can be created.
    -Currently, the auto guarantee mode is only available for unlimited times, that is, the "ancesttimes" parameter can only be set to "Unlimited ". The auto guarantee service in unlimited mode starts automatically after the guarantee takes effect.
     */
    @Override
    public CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateHpcClusterResponse> createHpcCluster(CreateHpcClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHpcClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHpcClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Wait until the image status becomes Available (Available) before using the image resources.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    The following describes three methods to create a custom image by using this API. The priority of request parameters is "InstanceId" > "DiskDeviceMapping"> "SnapshotId". If your request contains two or more parameters, the higher priority parameter is used by default to create an image.
    
    -**Method 1**: use an instance as a template. You only need to specify the instance ID("InstanceId"). The instance must be in the running ("Running") or stopped ("Stopped") state. After the API is called, a snapshot is added to each disk of the instance. If the cached data of a running instance is not on the disk, the data of the created custom image may be inconsistent with that of the instance. Therefore, we recommend that you stop the instance ([StopInstances](~~ 155372 ~~)) and create an image.
    
    -**Method 2**: to create a custom image for the system disk of an instance, you only need to specify a historical snapshot ID("SnapshotId") of the system disk of the instance. The specified snapshot cannot be created before July 15, 2013.
    
    -**Method 3**: combine multiple snapshots into an image template, and establish a data Association ("DiskDeviceMapping") for several cloud disks.
    
    When using method 3 to create a custom image, note the following:
    
    -Only one system disk snapshot can be specified. The device name of the system disk must be/dev/xvda.
    
    -You can specify multiple data disk snapshots. By default, the device names of data disks are assigned by the system in an orderly manner. The names are sorted from/dev/xvdb to/dev/xvdz in sequence and cannot be repeated.
    
    -You do not need to specify "SnapshotId". If you do not specify this parameter, an empty data disk of the specified size without any data is created.
    
    -The specified snapshot cannot be created before July 15, 2013.
     */
    @Override
    public CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before creating an image component, note the following:
    
    -You can only create custom image components.
    -Only Linux systems are supported, that is, "SystemType = Linux ".
    -You can only set the component type to build images, that is, "ComponentType = Build ".
    -You can edit the content of an image component by using the Dockerfile and pass the content to the "Content" parameter. The size of the content cannot exceed 16KB. The "FROM" command is not supported. A single image component supports a maximum of 127 commands. For more information about supported commands, see [commands supported by image building service](~~ 200206 ~~).
    
    You cannot use an API to create an image template. This feature is only supported by console operations. For more information, see [image building Overview](~~ 197410 ~~).
    
    
    
     */
    @Override
    public CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can customize the image content by using an image template and build images across regions and accounts. Before creating an image template, note the following:
    
    -You can only create custom image templates.
    -You can only set public images, custom images, shared images, or image families for Linux.
    -To build an image by using an image template, you need to create an intermediate instance to assist in building the image. The intermediate instance is a pay-as-you-go ECS instance, which charges a certain fee. For more information, see [pay-as-you-go](~~ 40653 ~~).
    
    For the build template content "BuildContent", note the following:
    -If the "FROM" command is set for the "BuildContent" parameter, the values of the source image "BaseImageType" and the source image "BaseImage" are overwritten by the "FROM" command.
    -If the "FROM" command is not set for the "BuildContent" parameter, the system automatically adds the "FROM" command consisting of the source image type "BaseImageType" and the source image "BaseImage" to the first line of the template content in the format of "<BaseImageType >:< BaseImage>".
    -You can edit the content of an image template through the Dockerfile and pass the content to the "BuildContent" parameter. The content size cannot exceed 16KB. A maximum of 127 commands are supported. For more information about supported commands, see [commands supported by image building service](~~ 200206 ~~).
    
    You cannot use an API to create an image template. This feature is only supported by console operations. For more information, see [image building Overview](~~ 197410 ~~).
    
     */
    @Override
    public CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImagePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImagePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImagePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    > You can call [DescribeAvailableResource](~~ 66186 ~~) to view the instance resources in the specified region or zone. We recommend that you use the [Running](~~ 63440 ~~) API if you want to create multiple instances and the instances automatically enter the Running (RunInstances) state.
    
    <props = "china"> Real-name authentication is required to create an ECS instance. For more information, see [account real-name authentication documentation](~~ 48263 ~~). </props>
    
    When creating an ECS instance, note the following:
    
    -**Billing * *:
    
    -Creating an instance involves resource billing. We recommend that you know the billing method of the ECS instance in advance. For more information, see [billing Overview](~~ 25398 ~~).
    
    -If the billing method of the instance is subscription ("PrePaid"), the available coupons are used by default when you pay for the instance.
    
    -**Instance type * *:
    
    -You can use the "IoOptimized" parameter to specify whether to create an I/O optimized instance.
    
    -Product selection: see [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, or see [selection configuration](~~ 58291 ~~) to learn how to select an instance type.
    
    -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
    
    > If the "QuotaExceed.ElasticQuota" error is returned when you create an instance, the number of instances that you want to create in the selected instance type in the current region exceeds the system limit, or the vCPU quota of the full instance type exceeds the system limit, you can go to the [ECS console](https://ecs.console.aliyun.com/? spm = a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) apply for an increase in the quota.
    
    -**Image * *:
    
    -The image determines the system disk configuration of the instance. The system disk of the instance is the full clone of the specified image.
    
    -When the instance memory is 512 MiB, you cannot use Windows Server images other than half-year channels.
    
    -32-bit operating system images cannot be used when the instance memory is 4 GiB or more.
    
    -**Network type * *:
    
    -A VPC instance must belong to only one vSwitch.
    
    -When "VSwitchId" is specified, "SecurityGroupId" and "VSwitchId" must belong to the same VPC.
    
    -"PrivateIpAddress" depends on "VSwitchId". You cannot specify "PrivateIpAddress" separately ". When "VSwitchId" and "PrivateIpAddress" are specified at the same time, "PrivateIpAddress" must be included in the idle subnet CIDR block of the vSwitch.
    
    -**Internet bandwidth * *:
    
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. Specific speed limiting policy: in a single region, the total actual peak bandwidth of all ECS instances billed by traffic is not greater than 5 Gbit/s; The total actual peak bandwidth of all ECS instances billed by fixed bandwidth is not greater than 50 Gbit/s.
    
    -Instances created with "CreateInstance" are not assigned public IP addresses. You can call [AllocatePublicIpAddress](~~ 25544 ~~) to assign public IP addresses.
    
    -The settings of "InternetChargeType" and "InternetMaxBandwidthOut" determine the bandwidth fee.
    
    -Alibaba Cloud inbound data traffic is free of charge. The value of "InternetMaxBandwidthIn" has nothing to do with billing.
    
    -"InternetChargeType = PayByBandwidth" indicates pay-by-bandwidth, and "InternetMaxBandwidthOut" indicates the selected fixed bandwidth.
    
    -"InternetChargeType = PayByTraffic" indicates that the billing method is pay-as-you-go. "InternetMaxBandwidthOut" takes the upper limit of the bandwidth. The billing method is based on the actual network traffic.
    
    -**Security Group * *:
    
    -You must create a security group in advance, which can be created through [CreateSecurityGroup](~~ 25553 ~~).
    
    -The number of instances in a security group depends on the security group type. For more information, see the security group section of [limits](~~ 25412 ~~).
    
    -Instances in the same security group can access each other over the internal network. By default, different security groups are isolated from each other and cannot access each other, but they can be authorized to access each other. For more information, see [AuthorizeSecurityGroup](~~ 25554 ~~) and [AuthorizeSecurityGroupEgress](~~ 25560 ~~).
    
    -**Storage * *:
    
    -An instance is allocated a system disk of the corresponding size based on the specified image. The system disk capacity must be greater than or equal to "max{20, ImageSize}". For more information about the types of system disks, see the "SystemDisk.Category" parameter.
    
    -The system disk of an I/O optimized instance can only be ESSD ("cloud_essd"), SSD ("cloud_ssd "), and ultra disk ("cloud_efficiency").
    
    -The maximum capacity of data disks varies with the type of cloud disks. For more information, see "DataDisk.N.Size" parameter description.
    
    -A maximum of 16 data disks can be added to an instance. Data disk mount points are allocated by default from/dev/xvdb to/dev/xvdz.
    
    -**Custom data**: If the instance meets the limits of [instance Custom Data](~~ 49121 ~~), you can enter UserData information. The UserData is encoded in Base64. Because the "UserData" you set is not encrypted when you send API requests, we recommend that you do not pass confidential information, such as passwords and private keys, in plaintext. If this parameter is required, we recommend that you encrypt it, encode it in Base64, and then decrypt it in the same way.
    
    -**Others**: when you use APIs in Alibaba Cloud CLI and SDKs, you must remove some input parameters with periods (.) before using them. For example, "systemdiskcategore" indicates the input parameter "SystemDisk. Categore ".
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In addition to calling the CreateKeyPair to create a key pair, you can also use a third-party tool to create a key pair and upload it ([ImportKeyPair](~~ 51774 ~~) to an Alibaba Cloud region. The Usage method is the same as the key pair created by the system.
    
    The maximum number of key pairs in each region is 500. For more information, see [limits](~~ 25412 ~~).
     */
    @Override
    public CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The instance launch template contains configurations for creating an instance, such as the region, image ID, instance type, security group ID, and internet bandwidth. If you do not specify an instance configuration in the template, you must specify this configuration for the instance when creating the instance.
    
    After you create a template ("CreateLaunchTemplate"), the initial version of the template is 1. You can create multiple template versions based on this version ("CreateLaunchTemplateVersion"). The version number increases from 1 to 1. If you do not specify the template version when creating an instance ([RunInstances](~~ 63440 ~~)), the default version is used.
    
    When you call this operation, note that:
    
    -You can create a maximum of 30 instance launch templates in a region, and each template can have a maximum of 30 versions.
    
    -Most parameters of the instance launch template are optional. When you create a template, Alibaba Cloud does not verify the existence and validity of the parameter values in the template. The validity of parameter values is only verified when an instance is created.
    
    -If a configuration is set in the instance launch template, the configuration cannot be filtered out when creating an instance ([RunInstances](~~ 63440 ~~). For example, if "HostName = LocalHost" is set to the template and "host" is set to null in "RunInstances", the hostname of the instance is still "LocalHost ". If you want to overwrite the "HostName = LocalHost" configuration, you can set "HostName = MyHost" or other parameter values in "RunInstances.
     */
    @Override
    public CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaunchTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaunchTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    To modify the parameters of a version, you can create a template version. A maximum of 30 versions can be created for each instance launch template.
     */
    @Override
    public CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaunchTemplateVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaunchTemplateVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNatGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNatGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props="china">
    -The newly created Eni is in the Available (Available) state.
    
    -Enis can only be attached to VPC instances in the same zone.
    
    -An Eni can be attached to only one instance. You must detach a new instance from the current instance before attaching it to the new instance.
    
    -When the Eni is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.
    
    -If you need to set an IPv6 address when creating an Eni, make sure that IPv6 is enabled for the specified vSwitch. For more information, see [what is IPv6 gateway](~~ 98896 ~~).
    
    -By default, an account can create up to 100 Enis in an Alibaba Cloud region. For more information, open a ticket (https://selfservice.console.aliyun.com/ticket/createIndex.htm).
    
    </props>
    
    <props="intl">
    -The newly created Eni is in the Available (Available) state.
    
    -Enis can only be attached to VPC instances in the same zone.
    
    -An Eni can be attached to only one instance. You must detach a new instance from the current instance before attaching it to the new instance.
    
    -When the eni is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.
    
    -If you need to set an IPv6 address when creating an eni, make sure that IPv6 is enabled for the specified vswitch. For more information, see [what is IPv6 gateway](~~ 98896 ~~).
    
    -By default, an account can create up to 100 enis in an alibaba cloud region. For more information, open a ticket (https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
    
    </props>
    
    <props="partner">
    -The newly created eni is in the Available (Available) state.
    
    -Enis can only be attached to VPC instances in the same zone.
    
    -An eni can be attached to only one instance. You must detach a new instance from the current instance before attaching it to the new instance.
    
    -When the eni is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.
    
    -If you need to set an IPv6 address when creating an eni, make sure that IPv6 is enabled for the specified vswitch. For more information, see [what is IPv6 gateway](~~ 98896 ~~).
    
    -By default, an account can create up to 100 enis in an alibaba cloud region. For more information, open a ticket.
    
    </props>
     */
    @Override
    public CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Open a ticket to apply for this feature.
     */
    @Override
    public CompletableFuture<CreateNetworkInterfacePermissionResponse> createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkInterfacePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkInterfacePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The Prefix List is a collection of network prefixes (CIDR block). You can reference the prefix list when configuring network rules for other resources. For more information about the prefix list, see [Prefix List Overview](~~ 206223 ~~).
    
    -Currently, only some regions support the prefix list function.
    
    -When creating a prefix list:
    
    -You must specify an address family (IPv4 or IPv6) for the prefix list. Entries in the same prefix list can only belong to the same address family and cannot be modified after the address family is created.
    -You must set the maximum number of entries for the prefix list and cannot modify it after it is created.
    -You can specify a number of entries for the prefix list. The entries consist of CIDR blocks and descriptions. The number of entries cannot exceed the maximum number of entries you set.
    
    -For more information about restrictions on prefix lists and other resources, see [limits](~~ 25412 ~~).
    
    -RAM users allow you to avoid sharing Alibaba Cloud account keys with other users and assign minimum permissions to users on demand, thus reducing information security risks. For more information about how to grant permissions related to the prefix list to a RAM user, see [Grant permissions related to the prefix list to a RAM user](~~ 206175 ~~).
     */
    @Override
    public CompletableFuture<CreatePrefixListResponse> createPrefixList(CreatePrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateResource02Response> createResource02(CreateResource02Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResource02").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResource02Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResource02Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateRouterInterfaceResponse> createRouterInterface(CreateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -You can create up to 100 security groups in an Alibaba Cloud region.
    
    -You must specify the VpcId parameter when creating a VPC-type security group.
     */
    @Override
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    After an event is scheduled, you can view the scheduled event in the ECS console, [ECS API](~~ 63962 ~~), and cloudmonitor.
    
    The following table describes the lifecycle of simulated system events:
    
    -Scheduled (planning): After an appointment, the simulated system event automatically switches to the Scheduled state.
    -Executed (completed): the simulated system event automatically changes to NotBefore at a specified point in time (Executed) without human intervention.
    -Canceled (Canceled): After you call [CancelSimulatedSystemEvents](~~ 88808 ~~) to cancel a simulated system event, it becomes Canceled.
    -Avoided (Avoided): for simulated system events caused by system maintenance instance restart (SystemMaintenance.Reboot), you can [restart the instance](~~ 25502 ~~) before the specified time to change to the Avoided state.
     */
    @Override
    public CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSimulatedSystemEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSimulatedSystemEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The original snapshot is replaced with the snapshot extreme available feature. The parameters are described as follows:
    -If you have used a local snapshot before December 14, 2020. You can use the "categore" and "InstantAccess" parameters. Note that:
    -The "categore" and "InstantAccess" parameters cannot be passed at the same time.
    -If the values of the "categore" and "InstantAccess" parameters are not specified, a normal snapshot is created by default.
    -If you have not used a local snapshot before December 14, 2020. You can only use the "InstantAccess" parameter, but not the "categore" parameter ".
    <props = "china"> for more information, see [Alibaba Cloud Snapshot service upgrade and new billing items notice on December 14](https://help.aliyun.com/noticelist/articleid/1060755542.html). </props>
    
    
    You cannot create snapshots for a specified disk in the following scenarios:
    
    -The number of manual snapshots of the disk is 256.
    
    -The previous snapshot has not been created.
    
    -The instance mounted to the cloud disk has never been started.
    
    -The instance attached to the disk is not in the **stopped**("Stopped") or **running**("Running") status.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    When creating a snapshot, note the following:
    
    -You can create a snapshot after creating an ECS instance or replacing the system disk for about one hour. The time to create a new data disk depends on the size of the disk data.
    
    -If you have not created a snapshot, this snapshot cannot be used to create a custom image ([CreateImage](~~ 25535 ~~)).
    
    -If the disk is attached to an ECS instance, do not change the instance status during snapshot creation.
    
    -You can create snapshots for disks in the **expired**("Expired") state. If the disk expires and is released when the snapshot is created, the snapshot that is being created ("Creating") is also deleted when the disk is released.
    
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
     * ## API description
    
    You can set "InstanceId" to create a snapshot consistency group for a specified disk in an instance, or you can use "DiskId. "to create a snapshot consistency group for multiple disks attached to multiple ECS instances in the same zone.
    
    > "DiskId. **cannot be set at the same time as "ExcludeDiskId. In addition, if "InstanceId" is set, "DiskId. "can only be set to the disks that are attached to the specified instance. You can no longer set the IDs of disks across instances.
    
    When creating a snapshot consistency group, note the following:
    
    -The disk to be created must be in the **in use** ("in_use") or **to be mounted**("Available") state.
    
    -If the disk is in the **In_use** state, the ECS instance is in the **running**("Running") or **stopped**("Stopped") state.
    -If the disk is in the **Available** state, make sure that the disk has been attached to an ECS instance. Snapshots cannot be created for disks that have never been attached to ECS instances.
    
    -Currently, snapshot consistency groups only support ESSDS.
    
    -A single snapshot consistency group can contain up to 16 cloud disks (including system disks and data disks) and the total capacity cannot exceed 32 TiB.
    
    -Snapshots created by you are retained. Delete snapshots that you no longer need on a regular basis to avoid continuous deduction of snapshot capacity.
    
    -Snapshot consistency groups cannot be created for disks with multiple mount features enabled. If multiple disks are attached to an instance, you must set the "ExcludeDiskId. **parameter to exclude the disks.
    
    For more information about the features and billing of snapshot consistency groups, see [snapshot consistency groups](~~ 199625 ~~).
     */
    @Override
    public CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    A storage set can distribute cloud disks or shared block storage. You can set the number of partitions for a storage set. A larger number of partitions indicates that the physical locations of cloud disks or shared block storage are more dispersed.
    
    When you use this API, note the following:
    
    -You can have a maximum of buckets in a region. You can call [DescribeAccountAttributes](~~ 73772 ~~) to query the number limit.
    
    -The number of partitions that you can specify in a zone is limited. You can call [DescribeAccountAttributes](~~ 73772 ~~) to query the number limit.
     */
    @Override
    public CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStorageSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStorageSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactivateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactivateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The activation code must not be used, that is, the number of registered managed instances corresponding to the activation code is 0.
     */
    @Override
    public CompletableFuture<DeleteActivationResponse> deleteActivation(DeleteActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteAutoProvisioningGroupResponse> deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDedicatedHostClusterResponse> deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDedicatedHostClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDedicatedHostClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * > This API is in the beta test and has not been officially launched. We recommend that you do not use this API. Please wait.
     */
    @Override
    public CompletableFuture<DeleteDemandResponse> deleteDemand(DeleteDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDeploymentSetResponse> deleteDeploymentSet(DeleteDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Manual snapshots of your disks are retained.
    
    -You can use [ModifyDiskAttribute](~~ 25517 ~~) to set whether to retain or release automatic snapshots at the same time. We recommend that you delete unnecessary snapshots in a timely manner to maintain sufficient snapshot quotas for periodic automatic snapshot policies.
    
    -When you release a disk, the disk must be in the Available state.
    
    -If the specified disk ID does not exist, the request is ignored.
     */
    @Override
    public CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * You can delete a replication relationship only when it is in the **paused" state. You can call this operation to delete only the replication relationship, but not the primary and secondary disks.
    
    You must delete the replication relationship in the region where the primary disk is located. After the primary disk is deleted, you can mount, read, write, and scale out the secondary disk.
     */
    @Override
    public CompletableFuture<DeleteDiskReplicaPairResponse> deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteHaVipResponse> deleteHaVip(DeleteHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteHpcClusterResponse> deleteHpcCluster(DeleteHpcClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHpcClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHpcClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -After the instance is released, all physical resources used by the instance are recycled, and all relevant data is lost and cannot be recovered.
    
    -Disks attached to the instance:
    
    -If "DeleteWithInstance = false" is set, the disks are converted to pay-as-you-go disks and retained.
    
    -If "DeleteWithInstance = true" is set, the disk is released at the same time.
    
    -If "DeleteAutoSnapshot = false", the automatic snapshot is retained.
    
    -If "DeleteAutoSnapshot = true", the automatic snapshot is released.
    
    -Keep the manual snapshot of the disk.
    
    -The instance is under [security control](~~ 25695 ~~) and "OperationLocks" is marked with ""LockReason": "security"". Even if the "DeleteWithInstance" attribute of the cloud disk is "false", the system ignores this attribute and releases the cloud disk.
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -After the instance is released, all physical resources used by the instance are recycled, and all relevant data is lost and cannot be recovered.
    
    -Disks attached to the instance:
    
    -If "DeleteWithInstance = false" is set, the disks are converted to pay-as-you-go disks and retained.
    
    -If "DeleteWithInstance = true" is set, the disk is released at the same time.
    
    -If "DeleteAutoSnapshot = false", the automatic snapshot is retained.
    
    -If "DeleteAutoSnapshot = true", the automatic snapshot is released.
    
    -Keep the manual snapshot of the disk.
    
    -The instance is under [security control](~~ 25695 ~~) and "OperationLocks" is marked with ""LockReason": "security"". Even if the "DeleteWithInstance" attribute of the cloud disk is "false", the system ignores this attribute and releases the cloud disk.
     */
    @Override
    public CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    After you delete an SSH key pair, note the following:
    
    -The SSH key pair cannot be queried through [DescribeKeyPairs](~~ 51773 ~~).
    
    -If an ECS instance is bound to the SSH key pair:
    
    -Alibaba Cloud no longer saves the SSH key pair for you, but the instance can use the SSH key pair normally.
    
    -When you query instance information ([DescribeInstances](~~ 25506 ~~)), the SSH key pair name (KeyPairName) is displayed, but no other information is displayed.
     */
    @Override
    public CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKeyPairsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKeyPairsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLaunchTemplateResponse> deleteLaunchTemplate(DeleteLaunchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaunchTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaunchTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLaunchTemplateVersionResponse> deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaunchTemplateVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaunchTemplateVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## Description
    
    -The Eni must be in the Available state.
    
    -If an Eni is attached to an ECS instance, you must detach the Eni from the instance ([DetachNetworkInterface](~~ 58514 ~~) before deleting the Eni.
    
    -After the Eni is deleted:
    
    -The primary private IP address (PrimaryIpAddress) of the Eni is automatically released.
    
    -The deleted Eni exits all security groups.
     */
    @Override
    public CompletableFuture<DeleteNetworkInterfaceResponse> deleteNetworkInterface(DeleteNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteNetworkInterfacePermissionResponse> deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkInterfacePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkInterfacePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    If the Prefix List is associated with other resources, you cannot delete it directly. You must remove the prefix list from other resources before deleting it. You can call [DescribePrefixListAssociations](~~ 204724 ~~) to query the associated resources of a specified prefix list.
     */
    @Override
    public CompletableFuture<DeletePrefixListResponse> deletePrefixList(DeletePrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteReplicaPairResponse> deleteReplicaPair(DeleteReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    Before deleting a security group, make sure that no instances exist in the security group and that no other security group has authorization ([DescribeSecurityGroupReferences](~~ 57320 ~~)). Otherwise, DeleteSecurityGroup request fails.
     */
    @Override
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -If the specified snapshot ID does not exist, the request is ignored.
    
    -If a snapshot has been used to create a custom image, you cannot delete it. You must delete the created custom image ([DeleteImage](~~ 25537 ~~)) before deleting the snapshot.
    
    -If a snapshot has been used to create a cloud disk and the "Force" parameter or "Force = false" parameter is not set, the snapshot cannot be deleted. If you want to delete a snapshot, set "Force = true" to force the snapshot to be deleted. After the snapshot is forcibly deleted, the corresponding disk cannot be reinitialized.
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
     * ## API description
    
    If the disk snapshot in the instance snapshot has been used to create a custom image, the relevant disk snapshots will not be deleted when the instance snapshot is deleted. To delete a disk snapshot, delete the created custom image ([DeleteImage](~~ 25537 ~~), and then delete the disk snapshot ([DeleteSnapshot](~~ 25525 ~~).
    
     */
    @Override
    public CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroup(DeleteSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteStorageSetResponse> deleteStorageSet(DeleteStorageSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStorageSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStorageSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteVirtualBorderRouterResponse> deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteVpcResponse> deleteVpc(DeleteVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeregisterManagedInstanceResponse> deregisterManagedInstance(DeregisterManagedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterManagedInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterManagedInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * ## API description
    
    <props = "china">[register](https://account.aliyun.com/register/register.htm) an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "intl">[register](https://account.alibabacloud.com/register/intl_register.htm) an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "partner"> after you have registered an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "china"> You can also [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) to increase the resource usage quota according to your needs. </props>
    
    <props = "intl"> You can also [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to increase the resource usage quota according to your needs. </props>
    
    <props = "partner"> You can also submit a ticket to increase the resource usage quota according to your needs. </props>
     */
    @Override
    public CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccountAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeActivationsResponse> describeActivations(DescribeActivationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActivations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActivationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActivationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupsResponse> describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoSnapshotPolicyExResponse> describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoSnapshotPolicyExResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoSnapshotPolicyExResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The value of the "DestinationResource" parameter has different logic and requirements. In the following order list, you need to set more parameters for values with a lower order. You cannot filter resource categories with a lower order.
    
    -Value sequence: "Zone > IoOptimized > InstanceType = Network = ddh > SystemDisk > DataDisk"
    
    
    -Valid values:
    
    -If the value of "DestinationResource" is "DataDisk", you must specify the "InstanceType" parameter or set the value of "ResourceType" to "disk ".
    
    -If the value of "DestinationResource" is "SystemDisk", you must specify "InstanceType ".
    
    -If the value of "DestinationResource" is "InstanceType", you must specify the parameters "IoOptimized" and "InstanceType ".
    
    -Query the ecs.g5.large inventory of all zones in a specified region: "RegionId = cn-hangzhou & DestinationResource = InstanceType & IoOptimized = optimized & InstanceType = ecs.g5.large ".
    
    -Query the List of zones with ecs.g5.large inventory in a specified region: "RegionId = cn-hangzhou & DestinationResource = Zone & IoOptimized = optimized & InstanceType = ecs.g5.large ".
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

    @Override
    public CompletableFuture<DescribeBandwidthLimitationResponse> describeBandwidthLimitation(DescribeBandwidthLimitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthLimitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthLimitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBandwidthPackagesResponse> describeBandwidthPackages(DescribeBandwidthPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCapacityReservationInstancesResponse> describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservationInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCapacityReservationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCapacityReservationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCapacityReservationsResponse> describeCapacityReservations(DescribeCapacityReservationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCapacityReservationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCapacityReservationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -This operation only supports classic network instances.
    
    -A maximum of 100 classic network instances can be queried at a time.
    
    -The "VpcId" and "InstanceId" parameters must be specified.
     */
    @Override
    public CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClassicLinkInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClassicLinkInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClassicLinkInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudAssistantStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudAssistantStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudAssistantStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    If you only enter the "Action" and "RegionId" parameters and do not enter any other request parameters, all available commands ("CommandId") that you manually create are queried by default.
     */
    @Override
    public CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    > The exclusive block storage cluster feature currently supports the China South 2 (Heyuan), Indonesia (Jakarta), and China South 1 (Shenzhen) regions of the financial cloud.
    
    -Request parameters are similar to a filter. The filter is a logical AND (AND) relationship. If a parameter is empty, the filter does not work.
    
    -We recommend that you use the MaxResults and NextToken parameters to query data by page. Note: When querying the homepage by page, you only need to set the MaxResults to limit the number of entries returned. The NextToken in the returned results are used as the credentials for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken obtained from the last returned result as the query credential, and set the MaxResults to limit the number of returned entries.
    
     */
    @Override
    public CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedBlockStorageClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedBlockStorageClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDedicatedHostAutoRenewResponse> describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostAutoRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostAutoRenewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostAutoRenewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Request parameters are similar to a filter. The filter is a logical AND (AND) relationship. If a parameter is empty, the filter does not work. However, if the value of the "DedicatedHostClusterIds" parameter is an empty JSON Array, that is, "[]", the filter is considered valid and the return value is empty.
     */
    @Override
    public CompletableFuture<DescribeDedicatedHostClustersResponse> describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDedicatedHostTypesResponse> describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can query the details of one or more dedicated hosts in any of the following ways:
    
    -Specify "DedicatedHostIds" to query the details of a dedicated host.
    -Specify "DedicatedHostClusterId" to query the details of dedicated hosts in a dedicated host cluster.
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
     * ## API description
    
    You can call this operation to query the details of the resources reported by Alibaba Cloud, including the type, delivery, and consumption of the reported resources.
    
    By default, I/O optimized instance types and the report form status of VPC-connected ECS instances are queried.
    
    If you need to obtain information about creating an ECS resource requirement report (CreateDemand), modifying the ECS resource requirement report (ModifyDemand), and deleting the ECS resource requirement report (DeleteDemand), contact your account manager.
    
    
     */
    @Override
    public CompletableFuture<DescribeDemandsResponse> describeDemands(DescribeDemandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDemands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDemandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDemandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    For more information about instance type families, see [instance type families](~~ 25378 ~~).
     */
    @Override
    public CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSetSupportedInstanceTypeFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentSetSupportedInstanceTypeFamilyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDeploymentSetsResponse> describeDeploymentSets(DescribeDeploymentSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The read IOPS, write IOPS, read bandwidth (B/s), write bandwidth (B/s), read latency (μs), and write latency (μs) of a cloud disk can be queried.
    
    When you call this operation, note that:
    
    -You can only query the disk usage information in the "in_use" status. For more information, see [basic disk Status Table](~~ 25689 ~~).
    
    > if the content in the queried information is missing, the usage information for this period of time cannot be obtained, that is, the disk status is not in use ("in_use").
    
    -A maximum of 400 data entries can be returned at a time, that is, the specified "( EndTime-StartTime)/""" cannot exceed 400.
    
    -You can query the monitoring information in the last 30 days at a time. That is, the specified "StartTime" parameter cannot exceed 30 days.
     */
    @Override
    public CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The request parameters, such as "RegionId", "ZoneId", "DiskIds", AND "InstanceId", are Filters. Parameters are logically AND.
    
    -The request parameter "DiskIds" is an Array in JSON format. If the parameter is empty, the filter does not work. However, if "DiskIds" is an empty Array, the filter is considered to be valid and the return value is empty.
    
    -You can view the returned data in either of the following ways:
    -Method 1: use "NextToken" to set the Token. The value is the value of the "NextToken" parameter returned DescribeDisks the last call. Then, use "maxresule" to set the maximum number of entries to query on a single page.
    -Method 2: Set the number of entries returned on a single page by "PageSize", and then set the page number by "pagenumerber.
    
    You can select either of the preceding methods. If a large number of entries are returned, we recommend that you use method 1. If "NextToken" is set, the request parameters "PageSize" and "pagenumerber" are invalid, and the "TotalCount" in the returned data is invalid.
    
    -A cloud disk with multiple mount features can be attached to multiple instances. You can view all the mount information of the cloud disk based on the "Attachment" list in the returned result.
    
    When calling an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with the format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
    
     */
    @Override
    public CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -All status information of block storage includes the lifecycle of block storage ("Status"), health status of block storage ("HealthStatus"), and event type of block storage ("EventType").
    
    -Because the release time, scheduled execution time, and actual execution time of block storage related events are the same, if you specify a period of time ("EventTime.Start" ~ "EventTime.End"), you can query all historical events that occurred during this period. Currently, you can query the historical events of the last week at most.
     */
    @Override
    public CompletableFuture<DescribeDisksFullStatusResponse> describeDisksFullStatus(DescribeDisksFullStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisksFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDisksFullStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDisksFullStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEipMonitorDataResponse> describeEipMonitorData(DescribeEipMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When the auto guarantee service expires, the matching associated data between the instance and the private pool of the auto guarantee service also becomes invalid. You can call this operation to query invalid services. The return value is null.
     */
    @Override
    public CompletableFuture<DescribeElasticityAssuranceInstancesResponse> describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssuranceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticityAssuranceInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticityAssuranceInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeElasticityAssurancesResponse> describeElasticityAssurances(DescribeElasticityAssurancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssurances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticityAssurancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticityAssurancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The traffic information of the secondary eni can be queried, including the number of packets sent and received by the secondary eni, inbound and outbound traffic over the internal network, and the number of packets lost and received by the secondary eni. When the returned information is missing, the system may not obtain the corresponding information. For example, if the instance is in the Stopped (Stopped) state or the secondary Eni is not attached to the instance, the instance is in the Available (Available) state, and the corresponding information cannot be obtained. When you call this operation, note that:
    
    -A maximum of 400 monitoring data records can be returned at a time. If the specified parameter (EndTime-StartTime)/Peroid is greater than 400, an error is returned.
    
    -You can query the monitoring information in the last 30 days at a time. If the specified parameter StartTime more than 30 days, an error is returned.
     */
    @Override
    public CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEniMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEniMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEniMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeForwardTableEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeForwardTableEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeForwardTableEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHaVips").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHaVipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHaVipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHpcClustersResponse> describeHpcClusters(DescribeHpcClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHpcClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHpcClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHpcClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can set the "NextToken" query credential (Token) to the value of the "NextToken" parameter returned DescribeImageComponents the last call, and then set the maximum number of entries for a single-page query through "maxresule.
     */
    @Override
    public CompletableFuture<DescribeImageComponentsResponse> describeImageComponents(DescribeImageComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    -This operation only queries the newly created custom images in the current image family, excluding public images, Alibaba Cloud marketplace images, and shared images.
    -If no custom image is available for the specified Image family, the returned result is null.
     */
    @Override
    public CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageFromFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageFromFamilyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageFromFamilyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can set the "NextToken" Token to the value of the "NextToken" parameter returned by the last call to "DescribeImagePipelines", and then set the maximum number of entries for a single-page query through "maxresule.
     */
    @Override
    public CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImagePipelines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImagePipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImagePipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeImageSupportInstanceTypesResponse> describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSupportInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSupportInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSupportInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The image resources that you can query include your custom images, public images provided by Alibaba Cloud, Alibaba Cloud marketplace images, and shared images shared by other Alibaba Cloud users.
    
    -Supports paging query. The query results include the total number of available image resources and the image resources on the current page. The number of entries per page is 10 by default.
    
    -When you call an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with the format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
    
     */
    @Override
    public CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    A private pool is generated after an elastic protection service or a capacity reservation service is created. It is associated with instance information that matches the private pool. You can set a private pool when creating an instance. The instance will match the elastic protection service or the capacity reservation service.
    
    When the private pool expires, the matching data between the instance and the private pool also becomes invalid. If you call this operation, the returned private pool information is empty.
     */
    @Override
    public CompletableFuture<DescribeInstanceAttachmentAttributesResponse> describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAttachmentAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAttachmentAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Before setting auto-renewal or manual renewal, you can check whether the instance renewal status is automatic.
    
    -Only subscription instances are supported. If you call this operation on a pay-as-you-go instance, an error is returned.
     */
    @Override
    public CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -You can query a maximum of 30 closed system events in the last 30 days. There is no query time limit for unfinished system events.
    
    -By specifying InstanceEventCycleStatus parameters, you can also query system events in the Scheduled (pending events), Executing (Executing events), and Inquiring (questioning events) states.
     */
    @Override
    public CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    You can call this operation to query the configured maintenance policies. These policies include two maintenance attributes.
    
    -Maintenance time window: the time period specified by you. Maintenance is performed only during this period.
    -Maintenance action: the action that you specify to handle instance downtime.
     */
    @Override
    public CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMaintenanceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -You can only query the upgrade price of subscription ECS instances that have not expired.
    
    -You cannot query the price of a pay-as-you-go ECS instance when it is changed. Because the price of a pay-as-you-go ECS instance after configuration change is the same as that of a new instance, you can directly call [DescribePrice](~~ 107829 ~~) to query the latest price of the ECS instance.
    
    -Before upgrading an instance, we recommend that you call [DescribeResourcesModification](~~ 66187 ~~) to query the instance types that can be upgraded in a specified zone.
    
     */
    @Override
    public CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceModificationPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceModificationPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceModificationPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -A maximum of 400 monitoring data records can be returned at a time. If the specified parameter "(EndTime-StartTime)/" is greater than 400, an error message is returned.
    
    -You can query the monitoring information in the last 30 days at a time. If the specified "StartTime" parameter exceeds 30 days, an error message is returned.
    
    -If a part of the returned information is missing, the system may not obtain the corresponding information. For example, the instance is in the Stopped (Stopped) state.
     */
    @Override
    public CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When calling an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with the format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
     */
    @Override
    public CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -For more information about the lifecycle status of an ECS instance, see [instance status table](~~ 25687 ~~).
    
    -You can call this operation to obtain the list of instances.
     */
    @Override
    public CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * > The DescribeInstanceTopology is in the beta phase. Please wait patiently. Thank you for your support!
     */
    @Override
    public CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceTypeFamiliesResponse> describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypeFamilies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTypeFamiliesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTypeFamiliesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before calling an API, note the following:
    
    <props="china">
    -We recommend that you set MaxResults and NextToken parameters for paging query. Note: When you call this operation for the first time, you set the MaxResults parameter to limit the number of instance types in the returned value. If only some of the instance types are returned at a time, the NextToken parameter values are returned simultaneously. You can call this operation again to set the NextToken parameter value and MaxResults parameter returned by the last call to query instance types by page.
    
    -DescribeInstanceTypes only queries the configuration and performance information of the instance type. To query the instance types that can be purchased in a specific region, use [DescribeAvailableResource](~~ 66186 ~~).
    
    -If you want to use non-visible instance types or special instance types, submit a ticket (https://selfservice.console.aliyun.com/ticket/createIndex.htm) to contact Alibaba Cloud.
    
    </props>
    
    <props="intl">
    -We recommend that you set MaxResults and NextToken parameters for paging query. Note: When you call this operation for the first time, you set the MaxResults parameter to limit the number of instance types in the returned value. If only some of the instance types are returned at a time, the NextToken parameter values are returned simultaneously. You can call this operation again to set the NextToken parameter value and MaxResults parameter returned by the last call to query instance types by page.
    
    -DescribeInstanceTypes only queries the configuration and performance information of the instance type. To query the instance types that can be purchased in a specific region, use [DescribeAvailableResource](~~ 66186 ~~).
    
    -If you want to use non-visible instance types or special instance types, submit a ticket (https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to contact Alibaba Cloud.
    
    </props>
    
    <props="partner">
    -We recommend that you set MaxResults and NextToken parameters for paging query. Note: When you call this operation for the first time, you set the MaxResults parameter to limit the number of instance types in the returned value. If only some of the instance types are returned at a time, the NextToken parameter values are returned simultaneously. You can call this operation again to set the NextToken parameter value and MaxResults parameter returned by the last call to query instance types by page.
    
    -DescribeInstanceTypes only queries the configuration and performance information of the instance type. To query the instance types that can be purchased in a specific region, use [DescribeAvailableResource](~~ 66186 ~~).
    
    </props>
     */
    @Override
    public CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceVncPasswdResponse> describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceVncPasswdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceVncPasswdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The validity period of the management Terminal address is 15 seconds. If the URL is not used within 15 seconds after the API is called, the URL will become invalid. You need to query it again.
    
    -The **persistent link**(KeepAlive) duration of a single management Terminal Link is 60 seconds. If there is no interaction in the management terminal window within 60 seconds, the connection is automatically disconnected.
    
    -If the connection is interrupted, the number of reconnections per minute cannot exceed 30.
    
    -Do you need to https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html in the link? Add "vncUrl =*** ", "instanceId =***", and "isWindows = True", "isWindows = False", and "password =*** "at the end of". Use "&" to connect parameters. Where:
    
    -Parameter "vncUrl": the value of "VncUrl" returned after the API is called.
    
    -Parameter "instanceId": the ID of your instance.
    
    -Parameter "isWindows": indicates whether the operating system of the instance is Windows. A value of "true" indicates that the system is Windows. A value of "false" indicates that the system is not Windows.
    
    -(Optional) "password": specifies the password of the instance. The password can contain six digits or uppercase and lowercase letters. When you use this parameter, you do not need to enter a password at the connection management terminal.
    
    Sample requests:
    
    """
    https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html? vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true
    """
    
    Or:
    
    """
    https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html? vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true&password= ****
    """
     */
    @Override
    public CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceVncUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceVncUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Request parameters are similar to a filter. The filter is a logical AND (AND) relationship. If a parameter is empty, the filter does not work. However, if the parameter InstanceIds is an empty JSON Array, the filter is considered valid and empty.
    
    -If you are using a RAM user account or RAM role, an empty list is returned if the user or role lacks interface permissions. You can add the "DryRun" parameter to the request to determine whether the list is empty due to permission issues.
    
    -When you call an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with the format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
    
    -You can view the returned data in either of the following ways:
    -Method 1: When querying the homepage by page, you only need to set "maxresule" to limit the number of returned entries. The "NextToken" in the returned result is used as the credential for querying subsequent pages. When querying subsequent pages, set the "NextToken" parameter to the "NextToken" obtained from the last returned result as the query credential, and set the "maxresule" parameter to limit the number of returned entries.
    
    -Method 2: Set the number of entries returned on a single page by "PageSize", and then set the page number by "pagenumerber.
    
    You can select either of the preceding methods. If a large number of entries are returned, we recommend that you use method 1. If the "maxresule" or "NextToken" parameter is set, the request parameters "PageSize" and "pagenumerber" are invalid, and the "TotalCount" in the returned data is invalid.
     */
    @Override
    public CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The returned results include instance system events in the instance status and to be executed (Scheduled) status.
    
    If you specify a time period, events are filtered based on the time period.
     */
    @Override
    public CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstancesFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesFullStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesFullStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -After you execute a command, it does not mean that the command is executed successfully and has the expected command effect. You can call this operation to view the actual execution results. The actual output results shall prevail.
    
    -You can query the execution information of the last two weeks. The maximum number of execution information is 100,000.
     */
    @Override
    public CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvocationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvocationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -After you execute a command, it does not necessarily mean that the command runs successfully and has the expected command effect. You need to view the actual execution result through the return value of the interface, which is subject to the actual output result.
    
    -You can query the execution information of the last two weeks. The maximum number of execution information is 100,000.
     */
    @Override
    public CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvocationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvocationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKeyPairsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKeyPairsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLaunchTemplateVersionsResponse> describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplateVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLaunchTemplateVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLaunchTemplateVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLaunchTemplatesResponse> describeLaunchTemplates(DescribeLaunchTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLaunchTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLaunchTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLimitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLimitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeManagedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeManagedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeManagedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNetworkInterfaceAttributeResponse> describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNetworkInterfacePermissionsResponse> describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfacePermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfacePermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfacePermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The "DescribeNetworkInterfaces" API supports paging queries. Note: When querying the homepage by page, you only need to set "maxresule" to limit the number of returned entries. The "NextToken" in the returned result is used as the credential for querying subsequent pages. When querying subsequent pages, set the "NextToken" parameter to the "NextToken" obtained from the last returned result as the query credential, and set the "maxresule" parameter to limit the number of returned entries.
    
    > If the "maxresule" or "NextToken" parameter is specified, the system returns the result by using the preceding pagination query method. Otherwise, the system returns the result by using the pagination query method consisting of "pagenumerber" and "PageSize.
     */
    @Override
    public CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNewProjectEipMonitorDataResponse> describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNewProjectEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNewProjectEipMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNewProjectEipMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhysicalConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhysicalConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhysicalConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePrefixListAssociationsResponse> describePrefixListAssociations(DescribePrefixListAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePrefixListAttributesResponse> describePrefixListAttributes(DescribePrefixListAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The request parameters "addressfamile", "PrefixListId. ", AND "PrefixListName" are similar to filters AND are logical AND (AND) relationships. If a parameter is empty, the filter does not work.
     */
    @Override
    public CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When you query the prices of different types of resources, the required parameters vary as follows:
    
    -When "ResourceType = instance", you must specify the "InstanceType" parameter ".
    
    -When "ResourceType = disk", you must specify both "DataDisk.1. Categore" and "DataDisk.1.Size ". When you query the price of the "disk" resource, only the pay-as-you-go price of the cloud disk is returned. The value of the "PriceUnit" parameter can only be "Hour ".
    
    -When "ResourceType = ddh" is queried, you must specify the "DedicatedHostType" parameter at the same time ".
    
    -When "ResourceType = elasticitylifecance" is queried, you must specify the "InstanceType" parameter at the same time ".
    
    -When "ResourceType = CapacityReservation" is queried, you must specify the "InstanceType" parameter at the same time ".
    
    
    -When "ResourceType = bandwidth" is queried, only the paybytraffic" price is returned.
    -When "ResourceType = instance", you can query the prices of data disks that are less than four.
    -The default billing method ("ChargeType") is pay-as-you-go ("PostPaid"). You can specify the "PriceUnit" parameter to query the prices of ECS instances in different billing cycles.
    
    
    
    
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
    public CompletableFuture<DescribeRecommendInstanceTypeResponse> describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRecommendInstanceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRecommendInstanceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRecommendInstanceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * * * * *
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
     * ## API description
    
    -You can only query the renewal duration of a subscription ECS instance or the renewal price on the unified expiration date.
    
    -Note the following when setting parameters:
    
    -If only required parameters are set, the instance renewal period of one month is queried by default.
    -You cannot query the renewal period price and the renewal price to the unified expiration date at the same time. That is, the renewal period parameter ("renew", "renewdune") and the renewal to the unified expiration date parameter ("ExpectedRenewDay") cannot be set at the same time.
    
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
    public CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReservedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReservedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeResourcesModificationResponse> describeResourcesModification(DescribeResourcesModificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourcesModification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourcesModificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourcesModificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRouterInterfacesResponse> describeRouterInterfaces(DescribeRouterInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouterInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouterInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouterInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Authorization includes inbound and outbound authorization.
    
    -This operation can return up to 100 records at a time.
    
    -If you cannot delete a security group ([DeleteSecurityGroup](~~ 25558 ~~)), you can call this operation to check whether the specified security group has been authorized by other security groups. If the specified security group has been authorized, you must revoke the authorization before deleting the security group.
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupReferences").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupReferencesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupReferencesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * 
    ## API description
    
    Before calling an api, note the following:
    
    -The basic information of a security group includes the security group ID and security group description. The returned parameters are sorted in descending order by security group ID.
    
    -We recommend that you use the MaxResults and NextToken parameters to query data by page. Note: when querying the homepage by page, you only need to set the MaxResults to limit the number of entries returned. The NextToken in the returned results are used as the credentials for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken obtained from the last returned result as the query credential, and set the MaxResults to limit the number of returned entries. If the NextToken in the returned result is empty, the page is the last page and no subsequent pages exist.
    
    -When calling an API through alibaba cloud CLI, the request parameter values of different data types must comply with certain format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    -After you deliver a file, it does not mean that the file is successfully delivered. You need to view the actual delivery result through the return value of the interface, and the actual output result shall prevail.
    -You can query the distribution records in the last two weeks. The maximum number of distribution records is 100,000.
     */
    @Override
    public CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSendFileResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSendFileResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSendFileResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    "InstanceId", "SnapshotGroupId. **, And "Status.** are not required request parameters, but filter logic can be constructed. The relationship between parameters is logical And (And).
     */
    @Override
    public CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The request parameters, such as "RegionId", "DiskIds", and "InstanceId", are used as filters. The parameters are logical and relational.
    
    -If no parameter is specified, the filter does not work. If "DiskIds" and "SnapshotLinkIds" are both empty arrays, the filter is also considered valid, but the returned result is empty.
     */
    @Override
    public CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotLinks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotLinksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotLinksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -A maximum of 400 monitoring data records can be returned at a time. If the specified parameter "(EndTime-StartTime)/" is greater than 400, an error is returned.
    
    -You can query the monitoring information in the last 30 days at a time. If the specified "StartTime" parameter exceeds 30 days, an error is returned.
     */
    @Override
    public CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnapshotPackageResponse> describeSnapshotPackage(DescribeSnapshotPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    "InstanceId", "DiskId", And "SnapshotIds" are not required request parameters, but you can construct a filter logic. The parameters are logically And.
    
    When calling an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with certain format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
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
     * If you want to know the snapshot usage of each disk in the current region, we recommend that you use [DescribeSnapshotLinks](~~ 55837 ~~) to query the snapshot chain.
     */
    @Override
    public CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotsUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -You can call this operation to query the information about preemptible instances in the last 30 days. This allows you to select the instance types of preemptible instances. You can query the following information:
    -Average instance release rate.
    -Average instance discount rate.
    -Average price calculated by discount rate.
    
    -You can only query preemptible instances of VPCs and I/O optimized instances.
    
    -You can query the information of a preemptible instance in the last 30 days in any of the following ways:
    -Set the "Cores" and "memore" parameters or the "MinCores" and "minmemore" parameters to query the instance types that meet the vCPU and memory requirements.
    -Set "InstanceTypes. **to query the specified instance types.
    -Set the "Cores" and "memore" parameters or the "MinCores" and "minmemore" parameters, and then set the "instancetypefamile" or "InstanceFamilyLevel" parameters to query the instance types that meet the vCPU and memory requirements in a certain instance family or level.
     */
    @Override
    public CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotAdvice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSpotAdviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSpotAdviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSpotPriceHistoryResponse> describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotPriceHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSpotPriceHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSpotPriceHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageCapacityUnitsResponse> describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageCapacityUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageCapacityUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageCapacityUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSetDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageSetDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageSetDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    If you specify the Tag Key (Tag.N.Key) but do not specify the Tag Value (Tag.N.Value), we query all Tag Key-Value pairs corresponding to the Tag Key. If you specify a tag key-value pair, you can query the tags that exactly match the key-value pair.
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

    @Override
    public CompletableFuture<DescribeTaskAttributeResponse> describeTaskAttribute(DescribeTaskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTaskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeUserBusinessBehaviorResponse> describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserBusinessBehaviorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserBusinessBehaviorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The Returned instance custom data is displayed in Base64.
    
    -If the instance does not have custom data, a null value is returned.
     */
    @Override
    public CompletableFuture<DescribeUserDataResponse> describeUserData(DescribeUserDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVRoutersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVRoutersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVirtualBorderRoutersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVirtualBorderRoutersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRoutersForPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVirtualBorderRoutersForPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * ## API description
    
    DescribeZones query only the list of zones provided by Alibaba Cloud and return a small amount of inventory information. We recommend that you use [DescribeAvailableResource](~~ 66186 ~~) to query the instance types and disk types that can be purchased in a specific zone.
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

    @Override
    public CompletableFuture<DetachClassicLinkVpcResponse> detachClassicLinkVpc(DetachClassicLinkVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachClassicLinkVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachClassicLinkVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Note the following when you call this operation:
    
    -The cloud disk must be attached to the instance and the status is in use ("in_use").
    
    -When you detach a data disk, the attached instance must be in the **running**("Running") or **stopped**("Stopped") status.
    
    -When you detach a system disk, the attached instance must be in the **stopped**("Stopped") state.
    
    -After the attached instance is under security control, "OperationLocks" cannot be marked as "LockReason": "security.
    
    -DetachDisk is an asynchronous operation. It takes about one minute to uninstall the operation.
     */
    @Override
    public CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachInstanceRamRoleResponse> detachInstanceRamRole(DetachInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note the following:
    
    -After unbinding the SSH key pair, you need to restart the instance ([RebootInstance](~~ 25502 ~~)) for the change to take effect.
    -After the SSH key pair is Unbound, the instance uses the username and password authentication method by default.
     */
    @Override
    public CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## Description
    
    When you call this operation, note that:
    
    -The primary ENI of the instance cannot be detached.
    
    -The Eni must be in the Detaching or InUse state.
    
    -The instance must be in the Running (Running) or Stopped (Stopped) state.
     */
    @Override
    public CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can call this operation to disable the activation code. After the activation code is disabled, you cannot register a new managed instance with this activation code, but the registered managed instance is not affected.
     */
    @Override
    public CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EipFillParamsResponse> eipFillParams(EipFillParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillParams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipFillParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipFillParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EipFillProductResponse> eipFillProduct(EipFillProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipFillProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipFillProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EipNotifyPaidResponse> eipNotifyPaid(EipNotifyPaidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipNotifyPaid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipNotifyPaidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipNotifyPaidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnablePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnablePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnablePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before exporting an image:
    
    -You must first understand the prerequisites and precautions. For more information, see [export images](~~ 58181 ~~).
    
    -You must authorize the ECS instance to write data to OSS through RAM. The operation instructions are as follows:
    
    1. Create a role: "AliyunECSImageExportDefaultRole" (any other role name is invalid). Set the following role policy for this role:
    
    """
    {
    "Statement ": [
    {
    "Action": "sts:AssumeRole ",
    "Effect": "Allow ",
    "Principal ": {
    "Service ": [
    "ecs.aliyuncs.com"
    ]
    }
    }
    ],
    "Version": "1"
    }
    """
    
    2. Under the role "AliyunECSImageExportDefaultRole", add the default system permission policy: "AliyunECSImageExportRolePolicy", which is the default policy provided by ECS to export images. For more information, see [cloud resource access authorization](https://ram.console.aliyun.com/? spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize? request =%7B%22Requests%22:%20%7B%22 request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22 request2%22:%20% 7trob% 22exexeid% 22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D). You can also create custom policies. The permissions must include:
    
    """
    {
    "Version": "1 ",
    "Statement ": [
    {
    "Action ": [
    "oss:GetObject ",
    "oss:PutObject ",
    "oss:DeleteObject ",
    "oss:GetBucketLocation ",
    "oss:GetBucketInfo ",
    "oss:AbortMultipartUpload ",
    "oss:ListMultipartUploads ",
    "oss:ListParts"
    ],
    "Resource ": "*",
    "Effect": "Allow"
    }
    ]
    }
    """
    
    After the image is exported:
    
    The custom image is saved in the specified OSS bucket. You can download the custom image. For more information, see [download a custom image file](~~ 31912 ~~).
     */
    @Override
    public CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ExportSnapshotResponse> exportSnapshot(ExportSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -An ECS instance is a virtual cloud service and cannot be connected to a display device or manually captured. However, Alibaba Cloud caches the system command output when the instance was last started, restarted, or shut down. You can call the GetInstanceConsoleOutput to obtain the output.
    
    -[Phased-out instance types](~~ 55263 ~~) cannot obtain system command output.
    
    -Windows instance does not support obtaining system command line output.
     */
    @Override
    public CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceConsoleOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceConsoleOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceConsoleOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    After the ECS instance returns a base64-encoded screenshot in JPG format, you need to decode it yourself. You can call this operation when troubleshooting. Note that:
    
    -The instance must be in the Running state.
    
    -[Phased-out instance types](~~ 55263 ~~) cannot obtain screenshot information.
    
    -If you call this operation multiple times in the same instance, the call interval must be at least 10 seconds. Otherwise, the error code "Throttling" is returned ".
     */
    @Override
    public CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceScreenshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceScreenshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceScreenshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -You must upload the image file to OSS in advance. For more information, see [Upload files](~~ 31886 ~~).
    
    -When importing an image for the first time, you must use RAM to authorize the ECS instance to access your OSS Bucket. Otherwise, an error "NoSetRoletoECSServiceAcount" is returned ". You can perform one-click authorization in the RAM console. For more information, see [cloud resource access authorization](https://ram.console.aliyun.com/? spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize? request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS% 22%7D). You can also manually grant permissions. The following table lists the policies and permissions of some operations. For more information, see [account access control](~~ 25481 ~~).
    
    1. Create the role "AliyunECSImageImportDefaultRole" (this name is required, otherwise the image import fails). The role policy is as follows:
    
    """
    {
    "Statement ": [
    {
    "Action": "sts:AssumeRole ",
    "Effect": "Allow ",
    "Principal ": {
    "Service ": [
    "ecs.aliyuncs.com"
    ]
    }
    }
    ],
    "Version": "1"
    }
    """
    
    2. Under this role, add the system policy "AliyunECSImageImportRolePolicy ". You can also create a custom policy. The permissions must include:
    
    """
    {
    "Version": "1 ",
    "Statement ": [
    {
    "Action ": [
    "oss:GetObject ",
    "oss:GetBucketLocation ",
    "oss:GetBucketInfo"
    ],
    "Resource ": "*",
    "Effect": "Allow"
    }
    ]
    }
    """
    -You cannot delete an image that is being imported. You can only call [CancelTask](~~ 25624 ~~) to cancel the image import task.
    
    -The region of the imported image must be the same as that of the OSS Bucket uploaded by the image file.
    
    -The value of N in the "DiskDeviceMapping. "parameter ranges from 1 to 17. If N is 1, it indicates the system disk. If N is 2 to 17, it indicates the data disk.
    
    -When the value of "swifture" is "arm64", or the value of "Platform" is "CentOS Stream", "Anolis", "AlmaLinux", or "Rocky Linux", note that:
    
    -To make the imported image support password configuration or key pair modification, the image must meet the following requirements:
    
    -The kernel of the operating system must support the "config_fw_cfg_sysfs "feature. By default, the Linux community kernel version 4.6 and later versions support this feature. CentOS kernel versions 3.10.0-826.el7 and later versions support this feature by default. You can run the "grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)"command on the server corresponding to the image. If the response contains "config_fw_cfg_sysfs =..., the kernel of the image supports the "config_fw_cfg_sysfs" feature.
    
    -The latest version of cloud-init is installed in the operating system. cloud-init version 19.1 must be in version 19.1.3 or later, and cloud-init version 0.7.6a in some earlier operating systems must be in version 0.7.6 a15 or later. For more information, see [install cloud-init](~~ 57803 ~~).
    
    -The operating system must support SHA-512 encryption algorithms.
    
    -To enable the imported image to support disk expansion and file system expansion, the image must meet the following requirements:
    
    -The kernel version of the operating system must be later than version 3.6.
    
    -Support the growpart command. To support this command, you must install the cloud-utils-growpart" package. Different operating systems have different installation methods. For more information, see [extended partition and file system_Linux system disk](~~ 111738 ~~).
    
    -Supports the resize2fs command. To support this command, you need to install the "e2fsprogs" package, which is installed in the operating system by default. If it is not installed, you need to install it yourself.
    
    -The latest version of cloud-init is installed in the operating system. cloud-init version 19.1 must be in version 19.1.3 or later, and cloud-init version 0.7.6a in some earlier operating systems must be in version 0.7.6 a15 or later. For more information, see [install cloud-init](~~ 57803 ~~).
     */
    @Override
    public CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The maximum number of key pairs in each region is 500.
    
    -The imported key pair must support any of the following encryption methods:
    
    -rsa
    -dsa
    -ssh-rsa
    -ssh-dss
    -ecdsa
    -ssh-rsa-cert-v00@openssh.com
    -ssh-dss-cert-v00@openssh.com
    -ssh-rsa-cert-v01@openssh.com
    -ssh-dss-cert-v01@openssh.com
    -ecdsa-sha2-nistp256-cert-v01@openssh.com
    -ecdsa-sha2-nistp384-cert-v01@openssh.com
    -ecdsa-sha2-nistp521-cert-v01@openssh.com
     */
    @Override
    public CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ImportSnapshotResponse> importSnapshot(ImportSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Call the InstallCloudAssistant API and then call [RebootInstance](~~ 25502 ~~). The Cloud assistant client takes effect.
     */
    @Override
    public CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallCloudAssistant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallCloudAssistantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallCloudAssistantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    
    <props="china">
    -In an Alibaba Cloud region, you can call InvokeCommand 5,000 times a day. [Submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) you can apply to adjust the number of calls quota.
    
    -The following limits apply to the target ECS instance. After multiple ECS instances are selected, if one of the instances does not meet the execution conditions, you need to call the interface again.
    
    -The network type is [VPC](~~ 34217 ~~).
    
    -The status must be running ("Running").
    
    -[Cloud assistant client](~~ 64921 ~~) is installed in advance.
    
    -When you run a command of the PowerShell type, the PowerShell module must be configured for the instance.
    
    -Run the command once ("1" = false").
    
    -Periodic execution ("**= true"):
    
    -The execution is scheduled based on the time frequency specified by the "renewence" parameter. The last execution result does not affect the next execution.
    
    -Set the time base to UTC +0, and the time is based on the system time of the instance. Make sure that the time or time zone of the ECS instance is the same as expected. For more information about time zones, see [set the time zone and NTP service for Linux instances](~~ 92803 ~~). For Windows instances, see [set the NTP service for Windows instances](~~ 51890 ~~).
    
    -Command execution may fail due to abnormal status of the target instance, network exception, or cloud assistant client exception. If the command fails to be executed, no execution information is generated.
    
    -When the custom parameter function is enabled when you create a command, you must pass in the custom parameter ("Parameters") when you execute the command.
    
    </props>
    
    <props="intl">
    -In an Alibaba Cloud region, you can call InvokeCommand 5,000 times a day. [Submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) you can apply to adjust the number of calls quota.
    
    -The following limits apply to the target ECS instance. After multiple ECS instances are selected, if one of the instances does not meet the execution conditions, you need to call the interface again.
    
    -The network type is [VPC](~~ 34217 ~~).
    
    -The status must be running ("Running").
    
    -[Cloud assistant client](~~ 64921 ~~) is installed in advance.
    
    -When you run a command of the PowerShell type, the PowerShell module must be configured for the instance.
    
    -Run the command once ("1" = false").
    
    -Periodic execution ("**= true"):
    
    -The execution is scheduled based on the time frequency specified by the "renewence" parameter. The last execution result does not affect the next execution.
    
    -Set the time base to UTC +0, and the time is based on the system time of the instance. Make sure that the time or time zone of the ECS instance is the same as expected. For more information about time zones, see [set the time zone and NTP service for Linux instances](~~ 92803 ~~). For Windows instances, see [set the NTP service for Windows instances](~~ 51890 ~~).
    
    -Command execution may fail due to abnormal status of the target instance, network exception, or cloud assistant client exception. If the command fails to be executed, no execution information is generated.
    
    -When the custom parameter function is enabled when you create a command, you must pass in the custom parameter ("Parameters") when you execute the command.
    
    </props>
    
     */
    @Override
    public CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    A resource is a cloud service entity that you create in Alibaba Cloud. For example, an ECS instance, an ECS Eni, or an ECS image can be resources. A resource group is a collection of infrastructure for projects, environments, or Stacks. You can manage resources in a resource group to monitor and perform tasks in a centralized manner. This eliminates the burden of repeatedly viewing multiple Alibaba cloud services.
     */
    @Override
    public CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    > This API is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~ 25503 ~~) API to add or remove an ECS instance from a security group. We recommend that you call the [ModifyNetworkInterfaceAttribute](~~ 58513 ~~) API to add or remove an ENI from a security group.
    
    When you call this operation, note that:
    
    -Before joining a security group, the instance must be in the **Stopped**(Stopped) or **Running**(Running) status.
    
    -An instance can join up to five security groups.
    
    -<props = "china"> You can [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) to apply for adding instances to more security groups. A maximum of 16 security groups can be added. </props>
    
    -<props = "intl"> You can [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to apply for adding instances to more security groups. A maximum of 16 security groups can be added. </props>
    
    -Each common security group can manage a maximum of 2,000 instances and an Enterprise Security Group can manage a maximum of 65536 instances.
    
    -Your Security Group and instance must belong to the same Alibaba Cloud region.
    
    -Your Security Group and instance must have the same network type. If the network type is VPC, the security group and the instance must belong to the same VPC.
    
    -You cannot add an instance and an Eni to a security group at the same time, that is, the values of the "InstanceId" and "NetworkInterfaceId" parameters cannot be passed at the same time.
     */
    @Override
    public CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    > This API is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~ 25503 ~~) API to add or remove an ECS instance from a security group. We recommend that you call the [ModifyNetworkInterfaceAttribute](~~ 58513 ~~) API to add or remove an ENI from a security group.
    
    
    When you call this operation, note that:
    
    -Before removing a security group, the instance must be in the **Stopped**(Stopped) or **Running**(Running) status.
    
    -An instance must be added to at least one security group. If the instance is added to only one security group, LeaveSecurityGroup request fails.
    
    -You cannot remove an instance and an Eni from the same security group at the same time, that is, you cannot pass values for the "InstanceId" and "NetworkInterfaceId" parameters at the same time.
     */
    @Override
    public CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LeaveSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LeaveSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LeaveSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Specify at least one of the following parameters in the request to determine the query object.
    
    -"ResourceId"
    -"Tag.... ("Tag.N.Key" and "Tag.N.Value")
    -"TagFilter"
    
    If the following parameters are specified, only the ECS resources that meet the two conditions are returned.
    
    -"Tag. **and "ResourceId"
    -"TagFilter. **and "ResourceId"
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
     * ## API description
    
    Before modifying an auto provisioning group, note the following:
    
    -If you modify the capacity or capacity-related settings of the provisioning group, the provisioning group performs a scheduling task after the modification is completed.
    
    -If the provisioning group is in the deleting state, the provisioning group cannot be modified.
     */
    @Override
    public CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ModifyAutoSnapshotPolicyExResponse> modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoSnapshotPolicyExResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoSnapshotPolicyExResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyBandwidthPackageSpecResponse> modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBandwidthPackageSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBandwidthPackageSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can also modify the command during command execution. After the command is modified, it is executed according to the new command content.
    
    You cannot modify the command type. For example, if the command is a Shell command (RunShellScript), it cannot be changed to a Bat command (RunBatScript).
     */
    @Override
    public CompletableFuture<ModifyCommandResponse> modifyCommand(ModifyCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When you modify the CPU oversell ratio, the ECS instance on the DDH must be in the stopped ("Stopped") state.
    -Modifying the CPU oversell ratio does not affect the running status of the DDH. However, note that the number of VCPUs allocated to the DDH cannot exceed the modified total number of VCPUs. Otherwise, the excess ECS instances cannot be started.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    The pay-as-you-go DDH is automatically released after the specified automatic release time is reached. Make sure that you no longer use the host and have backed up application data as needed.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAutoReleaseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When the auto-renewal feature is enabled for your subscription DDH, the auto-renewal is automatically performed nine days before the subscription expires. The fee is deducted at 08:00:00(UTC +8). If the deduction fails on the previous day, the scheduled execution will continue on the next day. If the fee is deducted successfully or the DDH is locked after expiration nine days later, the automatic fee deduction is stopped. During this period, you must ensure that your payment method is sufficient.
    
    -Subscription dedicated hosts support automatic renewal of subscription ECS instances. For more information, see AutoRenewWithEcs parameters.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostsChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostsChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can call this operation to modify instance type requirements. Alibaba Cloud provides relevant resources based on your requirements.
    Only I/O optimized instance types and VPC-connected ECS instances can be reported.
    You can only modify parameters other than "DemandName" and "DemandDescription" in the rejected state.
    
    > This API is in the beta test and has not been officially launched. We recommend that you do not use this API. Please wait.
     */
    @Override
    public CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDeploymentSetAttributeResponse> modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDeploymentSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDeploymentSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDeploymentSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When you call this operation, the instance is not released with the instance (DeleteWithInstance = false) attribute. Once the ECS instance attached to the disk is locked safely and the OperationLocks is marked with "LockReason": "security", the instance is released at the same time, ignoring the DeleteWithInstance attribute of the disk.
    
    -You can call the "DiskIds. **parameter to modify the names, descriptions, and release properties of multiple block stores with the instance.
     */
    @Override
    public CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "intl"> fees are automatically deducted by default after the billing method is changed. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, you can set the AutoPay parameter to false. A normal unpaid order is generated. You can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay. </props>
    
    <props = "china"> after the billing method is changed, the fee is automatically deducted by default. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, you can set the AutoPay parameter to false. A normal unpaid order is generated. You can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay. </props>
    
    When you call this operation, note the following:
    
    -When you convert a subscription cloud disk to a pay-as-you-go cloud disk, it applies to the subscription cloud disks attached to the subscription instance.
    
    -When you convert a pay-as-you-go cloud disk to a subscription cloud disk, it applies to pay-as-you-go data disks attached to a subscription instance or pay-as-you-go data disks attached to a pay-as-you-go instance.
    
    -The attached instance cannot be stopped due to overdue payments.
    
    -The billing method of each cloud disk cannot exceed three times, that is, the price difference refund cannot exceed three times.
    
    -Refund of price difference before and after the change of billing method will be returned to your original billing method, and used vouchers will not be returned.
    
    -The billing method of each cloud disk has been modified once, and cannot be modified again within five minutes.
    
    -<props = "china"> for disks with multiple mount features, only the pay-as-you-go billing method is supported, but not the subscription billing method. </props>
    
     */
    @Override
    public CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> make sure that you have fully understood the billing method and [price](https://www.aliyun.com/price/product#/disk/detail) of cloud disks before using this interface. </props>
    
    When you call this operation, note that:
    
    * Modify the performance level of an ESSD:
    
    -You can only upgrade the performance level of a subscription ESSD.
    
    -Pay-as-you-go ESSD supports performance upgrades and downgrades, but cannot be downgraded to pl0.
    
    -ESSD must be in the **in use**(In_Use) or **to be mounted**(Available) state.
    
    -If an ESSD disk is attached to an ECS instance, the instance must be in the **Running**(Running) or **Stopped**(Stopped) state. The ECS instance cannot be in the expired or overdue status.
    
    -Because the performance level of ESSD is limited by the capacity, if you cannot upgrade the performance level, you can expand ([ResizeDisk](~~ 25522 ~~)) and then re-operate. For more information, see [ESSD](~~ 122389 ~~).
    
    * For more information about how to change the type of a cloud disk, see the limits section in [change the type of a cloud disk](~~ 161980 ~~).
    
    * <props = "china"> cloud disks with multiple mount features cannot be changed. </props>
    
    After you call this operation, the new disk type takes effect immediately. Alibaba Cloud calculates the consumption bill based on the new disk type and the unit price of the disk performance level.
    
     */
    @Override
    public CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyEipAddressAttributeResponse> modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEipAddressAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEipAddressAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEipAddressAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyElasticityAssuranceResponse> modifyElasticityAssurance(ModifyElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHaVipAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHaVipAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHaVipAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyHpcClusterAttributeResponse> modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHpcClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHpcClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHpcClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyImageShareGroupPermissionResponse> modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageShareGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageShareGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageShareGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -You can only share your custom images with other Alibaba Cloud users.
    
    -Each custom image can be shared with up to 10 Alibaba cloud accounts at a time. Therefore, you can specify a maximum of 10 Alibaba cloud accounts at a time for the parameter AddAccount.n or RemoveAccount.n. The system ignores this parameter if it exceeds 10 accounts.
    
    -<props = "china"> each custom image can be shared with up to 50 Alibaba cloud accounts. You can [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) to apply for sharing with more users. </props>
    
    -<props = "intl"> each custom image can be shared with up to 50 Alibaba cloud accounts. You can [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex)</props> to apply for sharing with more users. </props>
    
    -After you create an ECS instance with a shared image ([RunInstances](~~ 63440 ~~)), once the owner of the custom image disables the image sharing relationship or deletes the custom image ([DeleteImage](~~ 25537 ~~)), the instance cannot initialize the system disk ([ReInitDisk](~~ 25519 ~~)).
     */
    @Override
    public CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    A private pool is generated after an elastic protection service or a capacity reservation service is created. It is associated with instance information that matches the private pool. When you create an instance, you can set whether to use a private pool to start the instance. The instance will match the elastic protection service or the capacity reservation service.
    
    -After you call this operation to modify the properties of an instance"s private pool, the instance does not need to be restarted.
    -The system rematches the private pool of the instance when you call the following API. If the instance matches the specified private pool, the call may fail due to insufficient capacity of the private pool or the failure of the private pool. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the matching mode of the private pool to open ".
    -StartInstance restart the instance to enable the shutdown mode.
    -ReActivateInstances
    -ModifyInstanceChargeType
    -ModifyPrepayInstanceSpec
    -ReplaceSystemDisk
     */
    @Override
    public CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttachmentAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttachmentAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    When you call this operation, note that:
    
    -Modify the hostname ("HostName"): After the instance is restarted, the modification takes effect and must be [restarted in the ECS console](~~ 25440 ~~) or restarted by calling the API [RebootInstance](~~ 25502 ~~). A restart within the operating system does not take effect.
    
    -Reset the password ("Password"):
    
    -The instance status cannot be **starting**("Starting").
    
    -After the instance is restarted, the reset takes effect. The new password takes effect only after the instance is restarted from [restart in the ECS console](~~ 25440 ~~) or by calling the API [RebootInstance](~~ 25502 ~~). A restart within the operating system does not take effect.
    
    -Modify custom data ("UserData"):
    
    -The instance status must be **stopped**("Stopped").
    
    -The instance must meet the custom data usage limits. For more information, see [generate instance Custom Data](~~ 49121 ~~).
    
    -Replace the instance Security Group ("SecurityGroupIds....):
    
    -You can change the security group type.
    
    When an ECS instance switches between different types of security groups, you must fully understand the differences between the two security group rules to avoid affecting the network of the instance.
    
    -Classic network instances are not supported.
    
    For more information, see the parameter description of "SecurityGroupIds.
    
    -Modify the number of primary Nic queues ("networkinterfacequeuenumerber"):
    
    -The instance must be in the stopped ("Stopped") state.
    
    -The maximum number of queues per Nic allowed by the instance type.
    
    -The number of accumulated queues for all NICs of an instance cannot exceed the total number of queues allowed by the instance type. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the maximum number of queues and total quotas of an Eni.
    
    -If the value is -1, the number of active Nic queues is reset to the default value of the corresponding instance type. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the "primaryeniqueuenumerber" field for the default number of Enis of the instance type.
     */
    @Override
    public CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoReleaseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.aliyun.com/price/product#/ecs/detail) before using this interface. </props>
    
    <props = "intl"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.alibabacloud.com/product/ecs#pricing) before using this interface. </props>
    
    -The auto-renewal deduction date is the 9th day before the instance expires. The deduction starts at 08:00:00 UTC +8.
    
    -<props = "china"> If the subscription period of the new instance is one week, the renewal fee will be automatically deducted on the first day of successful creation. </props>
    
    -If the automatic deduction fails on the previous day, the automatic deduction will continue on the next day until the deduction succeeds or the instance expires and is locked nine days later. You only need to ensure that your account balance or credit line is sufficient.
    
     */
    @Override
    public CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.aliyun.com/price/product#/ecs/detail) before using this interface. </props>
    
    <props = "intl"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.alibabacloud.com/product/ecs#pricing) before using this interface. </props>
    
    <props = "partner"> make sure that you have fully understood the billing method and product pricing of ECS before using this interface. </props>
    
    When you call this operation, note that:
    
    -The billing method can only be changed if the status of the target instance is **running**("Running") or **stopped**("Stopped") and there is no overdue payment.
    
    -<props = "china"> fees are automatically deducted by default after the billing method is changed. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, you can set the parameter "AutoPay" to "false" to generate a normal unpaid order. You can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay. </props>
    
    -<props = "intl"> fees are automatically deducted by default after the billing method is changed. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, you can set the parameter "AutoPay" to "false" to generate a normal unpaid order. You can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay. </props>
    
    -**Switch from subscription to pay-as-you-go * *:
    
    -Whether the subscription to pay-as-you-go feature is supported depends on your ecs usage.
    
    -When a subscription instance is converted to a pay-as-you-go instance, the new billing method will cover the entire lifecycle of the instance. You will receive a refund for the price difference of the instance before and after the modification. The refund will be returned to your original payment channel. The used vouchers will not be returned.
    
    -**Refund rules**: the refund amount that you can freely operate within a month is limited and does not accumulate. After the refund amount is used up, you can only wait for the next month to change the billing method. The formula for the refund amount consumed by one conversion is **number of vcpus * (refund days * 24 ± floating hours) * *.
    
    -**Switch from pay-as-you-go to subscription * *:
    
    -You can convert all pay-as-you-go data disks attached to an instance to subscription data disks at the same time.
    
    -You cannot call this operation if you have set the release time for a pay-as-you-go instance.
    
     */
    @Override
    public CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you migrate an ECS instance to a dedicated host or change the ECS instance type at the same time, you must meet the following requirements:
    
    -The ECS instance must be in the **Stopped**(Stopped) state. The instance will restart automatically after migration.
    
    -Only VPC-connected ECS instances are supported.
    
    -The ECS instance and the dedicated host must belong to the same account, region, and zone.
    
    -You can migrate a pay-as-you-go ECS instance to a subscription dedicated host. A subscription ECS instance can only be migrated between subscription dedicated hosts, and the expiration time of the instance cannot exceed the expiration time of the target dedicated host.
    
    -When you migrate an ECS instance from a shared host to a dedicated host, the billing method of the instance can only be pay-as-you-go. Subscription instances and preemptible instances are not supported.
    
    -You can redeploy an ECS instance by specifying a dedicated host cluster.
     */
    @Override
    public CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Modify the maintenance policy of an instance. The policy contains two maintenance attributes.
    
    -Maintenance time window: the specified period of time during which O & M is performed.
    
    -Maintenance action: the action that you specify to handle instance downtime.
     */
    @Override
    public CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMaintenanceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceMetadataOptionsResponse> modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMetadataOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMetadataOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMetadataOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. The specific speed limiting policy is as follows:
    -In a single region, the total actual peak bandwidth of all ECS instances billed by traffic cannot exceed 5 Gbit/s.
    -In a single region, the total actual peak bandwidth of all ECS instances that are billed by fixed bandwidth cannot exceed 50 Gbit/s.
    
    -When you modify the bandwidth configuration of a subscription (PrePaid) instance, a public IP address is automatically allocated when the outbound public bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value.
    
    -When you modify the bandwidth configuration of a pay-as-you-go (PostPaid) instance, the public outbound bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value. You must call [AllocatePublicIpAddress](~~ 25544 ~~) to assign a public IP address to the instance.
    
    -For a Classic network (Classic) instance, when the outbound bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value, the instance must be in the Stopped (Stopped) state.
    
    -After the bandwidth is upgraded, the fee is automatically deducted by default. You must ensure that the balance of the payment method is sufficient. Otherwise, an abnormal order will be generated and the order can only be canceled. If your account balance is insufficient, you can set the AutoPay parameter to false. A normal unpaid order is generated. You can log on to the ECS console to pay for the order.
    
    -The refund of the price difference before and after the bandwidth configuration is modified will be returned to your original payment method, and the used vouchers will not be returned.
    
     */
    @Override
    public CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceNetworkSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceNetworkSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceNetworkSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## Description
    
    <props = "china"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.aliyun.com/price/product#/ecs/detail) before using this interface. </props>
    
    For more information about Python SDK resource change examples, see [query available change resources](~~ 109517 ~~).
    
    When you call this operation, note that:
    
    -The account must be in the no overdue status.
    
    -You can adjust the Internet bandwidth only when the instance status is **running**("Running") or **stopped**("Stopped").
    
    -Before you upgrade or downgrade a pay-as-you-go instance type, you can use [DescribeResourcesModification](~~ 66187 ~~) to query the instance types that can be changed.
    
    -You can change the instance type only when the instance status is **stopped**("Stopped").
    
    -You can only upgrade a single configuration at a time, that is, you can only modify the instance type at a time, or you can only adjust the Internet bandwidth.
    
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. The specific speed limiting policy is as follows:
    -In a single region, the total actual peak bandwidth of all ECS instances billed by traffic cannot exceed 5 Gbit/s.
    -In a single region, the total actual peak bandwidth of all ECS instances that are billed by fixed bandwidth cannot exceed 50 Gbit/s.
     */
    @Override
    public CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The password must be six characters in length and can only contain uppercase letters, lowercase letters, and Arabic numerals.
    
    -After the password is changed:
    
    -I/O optimized instances take effect immediately without restarting them.
    
    -For non-I/O optimized instances, you must [restart the instance](~~ 25440 ~~) in the console or call the API [RebootInstance](~~ 25502 ~~) to take effect.
     */
    @Override
    public CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceVncPasswdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceVncPasswdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call an API, the status of the ECS instance must be **stopped**("Stopped").
    
    -When you use this operation to modify the private ip address or vswitch of an instance, note that:
    
    -The New ECS instance must be restarted to call this operation.
    -After a successful modification, the ECS instance must be restarted to call this operation.
    
    -When you use this operation to modify the VPC of an instance, note that:
    
    -**Instance: * *
    -ECS instances associated with SLB instances are not supported.
    -The status of the instance cannot be locked, pending release, expired, expired, or overdue. For more information, see [instance lifecycle](~~ 25380 ~~).
    -The instance cannot be used in other cloud services. For example, an instance cannot be migrated, a VPC cannot be replaced, or a database deployed in the instance cannot be managed by DTS.
    
    -**Network: * *
    -Instances with the EIP eni visible mode or multi-EIP eni visible mode are not supported.
    -You cannot associate an instance with a high-availability virtual IP address (HaVip).
    -Instances with custom route tables attached to a vSwitch are not supported.
    -Instances with GA enabled are not supported.
    -Instances with secondary Enis cannot be bound.
    -Instances with IPv6 addresses are not supported.
    -Instances with multiple IP addresses in the primary Eni are not supported.
    -The vSwitch must belong to the target VPC.
    -The vSwitch zones must be the same before and after modification.
    -If the private IP address of the primary eni is specified, the IP address must be within the cidr block of the vswitch and available. If this parameter is not specified, the vswitch is randomly allocated and the number of available IP addresses of the target vswitch is sufficient.
    -If the advanced network feature is enabled for the target VPC, note that some instance families do not support this feature. For more information, see [instance families that do not support high-order VPC features](~~ 163466 ~~).
    -The owner account (resource owner) of the target VPC. The target VPC cannot be shared with other accounts (resource users).
    
    -**Security group (SecurityGroupId.N):* *
    -The security group list must belong to the same type.
    -The quota of a security group depends on the limits that instances can join the security group. For more information, see [limits](~~ 25412 ~~).
    -The VPC to which the security group belongs must be the same as the target VPC.
    -You can change the security group type.
    When an ECS instance switches between different types of security groups, you must fully understand the differences between the two security group rules to avoid affecting the network of the instance. For more information, see [security group overview](~~ 25387 ~~).
     */
    @Override
    public CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLaunchTemplateDefaultVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLaunchTemplateDefaultVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    You can call the ModifyManagedInstance operation to modify the name of only one managed instance.
     */
    @Override
    public CompletableFuture<ModifyManagedInstanceResponse> modifyManagedInstance(ModifyManagedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyManagedInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyManagedInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyNetworkInterfaceAttributeResponse> modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNetworkInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNetworkInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPhysicalConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPhysicalConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPhysicalConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props="china">
    -The specified CIDR block must be in standard format. For example, 10.0.0.0/8 indicates the correct CIDR block, while 10.0.0.1/8 indicates the incorrect CIDR block. For more information, see [what is CIDR](https://help.aliyun.com/knowledge_detail/40637.html#section-jua-0tj-q5m).
    
    -Do not specify duplicate CIDR blocks when adding or deleting entries. Example:
    -For IPv4 CIDR block: you cannot specify entries with both CIDR blocks 10.0.0.0/8 at the same time. You cannot specify entries with both CIDR blocks 10.0.0.1/32 and 10.0.0.1 at the same time. The two CIDR blocks are the same.
    -IPv6 CIDR block: you cannot specify the CIDR blocks of two entries at the same time as 2001:fd01:0:0:0:0:0:0/32 and 2001:fd01::/32. The two CIDR blocks are the same.
    
    -The CIDR block of the new entry cannot overlap with the CIDR block of the deleted entry. For example, when you add an entry whose CIDR block is 10.0.0.0/8, you cannot include the CIDR block 10.0.0.0/8 in the entry to be deleted.
    
    -To modify the description of the entry, you must specify the CIDR block ("AddEntry.N.Cidr") and the new description ("AddEntry.N.Description").
    
    </props>
    
    
    <props="intl">
    -The specified CIDR block must be in standard format. For example, 10.0.0.0/8 indicates the correct CIDR block, while 10.0.0.1/8 indicates the incorrect CIDR block. For more information, see [what is CIDR](https://www.alibabacloud.com/help/doc-detail/40637.htm#section-jua-0tj-q5m).
    
    -Do not specify duplicate CIDR blocks when adding or deleting entries. Example:
    -For IPv4 CIDR block: you cannot specify entries with both CIDR blocks 10.0.0.0/8 at the same time. You cannot specify entries with both CIDR blocks 10.0.0.1/32 and 10.0.0.1 at the same time. The two CIDR blocks are the same.
    -IPv6 CIDR block: you cannot specify the CIDR blocks of two entries at the same time as 2001:fd01:0:0:0:0:0:0/32 and 2001:fd01::/32. The two CIDR blocks are the same.
    
    -The CIDR block of the new entry cannot overlap with the CIDR block of the deleted entry. For example, when you add an entry whose CIDR block is 10.0.0.0/8, you cannot include the CIDR block 10.0.0.0/8 in the entry to be deleted.
    
    -To modify the description of the entry, you must specify the CIDR block ("AddEntry.N.Cidr") and the new description ("AddEntry.N.Description").
    
    </props>
    
     */
    @Override
    public CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.aliyun.com/price/product#/ecs/detail) before using this interface. </props>
    
    <props = "intl"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.alibabacloud.com/product/ecs#pricing) before using this interface. </props>
    
    Before you upgrade or downgrade a subscription instance type, you can use [DescribeResourcesModification](~~ 66187 ~~) to query the instance types that can be changed. For more information, see Python SDK example [query available resources for ECS configuration changes](~~ 109517 ~~).
    
    When you call this operation, note that:
    
    -You cannot modify the instance type of an expired instance. You can renew the instance and try again.
    
    -Note the following when you downgrade the instance type:
    
    -The instance must be in the **stopped**("Stopped") status.
    -You must specify the operation type, that is, "OperatorType = downgrade ".
    -Each instance cannot be downgraded more than three times, that is, the price difference refund cannot exceed three times. Downgrade configurations include downgrading instance types, downgrading bandwidth configurations, and converting subscription disks to pay-as-you-go disks.
    -The refund for the price difference between the instance types before and after the reduction will be returned to your original billing method, and the used vouchers will not be returned.
    
    -This operation is asynchronous. Wait about 5 to 10 seconds for the configuration change to complete. Then, you must call the API or restart the instance in the console. Otherwise, the specification change will not take effect and the restart of the operating system will not take effect.
    
    -If the instance is in the **stopped** status, you only need to start the instance without restarting it.
    -If the instance is set to "rebootwherefinished = true", you do not need to restart the instance separately.
     */
    @Override
    public CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrepayInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPrepayInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPrepayInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReservedInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReservedInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## Description
    
    Note the following when you change Reserved instances:
    
    -You can change the zone. You can change the region and zone. However, you cannot change the region.
    
    -You can change the instance size, but you cannot change the instance type family.
    
    -When merging Reserved instances, if the original ris are regional Reserved instances, they must be in the same region. If the original ris are regional Reserved instances, they must be in the same zone.
    
    -When you merge Reserved instances, the expiration date of the original ris must be the same.
    
    -After the Reserved Instances are split, merged, or adjusted, the status of the original instances becomes invalid.
    
    -Burstable instances t5 and t6 only support zone-Level Reserved instances, but do not support regional Reserved Instances, and do not support merging, splitting, or range adjustment of Reserved Instances.
     */
    @Override
    public CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReservedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReservedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouterInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouterInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouterInterfaceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouterInterfaceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    A security group outbound rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Rules for authorizing access from specified CIDR blocks. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupEgressRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &DestCidrIp=10.0.0.0/8
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=allow
    &Description=This is a new securitygroup rule.
    & <common request parameters>
    """
    
    -Rules for authorizing access from other security groups. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupEgressRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &DestGroupId=sg-bp67acfmxa123b ****
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=allow
    &Description=This is a new securitygroup rule.
    & <common request parameters>
    """
    
    -Security group rules associated with the prefix list. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestPrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupEgressRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &DestPrefixListId=pl-x1j1k5ykzqlixdcy ****
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=allow
    &Description=This is a new securitygroup rule.
    & <common request parameters>
    """
     */
    @Override
    public CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupEgressRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupEgressRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupEgressRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -When the value of the InnerAccessPolicy parameter is Accept, the networks of instances in the security group are interconnected. In this case, the Accept priority principle is followed, that is, the networks of instances in the security group remain interconnected and are not affected by user-defined security group rules.
    
    -When the value of the parameter InnerAccessPolicy is Drop, the networks of instances in the security group are isolated. In this case, the user-defined security group rule takes precedence, that is, although the networks of instances in the security group are isolated, you can customize the security group rule to change the internal network status. For example, you can use [AuthorizeSecurityGroup](~~ 25554 ~~) to connect the two ECS instances in the security group.
    
    -You can use [DescribeSecurityGroupAttribute](~~ 25555 ~~) to query the intranet connection policy of the current security group.
     */
    @Override
    public CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In the security group-related API documents, the initiator of inbound traffic is the Source, and the receiver of data transmission is the Dest.
    
    Any of the following parameters can determine an inbound rule of a security group, but only one parameter cannot determine a security group rule.
    
    -Rules for authorizing access from specified CIDR blocks. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourceCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourceCidrIp=10.0.0.0/8
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=accept
    &Description=This is a new security group rule.
    & <common request parameters>
    """
    
    -Rules for authorizing access from other security groups. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourceGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourceGroupId=sg-bp67acfmxa123b ****
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=accept
    &Description=This is a new security group rule.
    & <common request parameters>
    """
    
    -Security group rules associated with the prefix list. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourcePrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=ModifySecurityGroupRule
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourcePrefixListId=pl-x1j1k5ykzqlixdcy ****
    &IpProtocol=tcp
    &PortRange=80/80
    &Policy=accept
    &Description=This is a new security group rule.
    & <common request parameters>
    """
     */
    @Override
    public CompletableFuture<ModifySecurityGroupRuleResponse> modifySecurityGroupRule(ModifySecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySnapshotGroupResponse> modifySnapshotGroup(ModifySnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageCapacityUnitAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStorageCapacityUnitAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyStorageSetAttributeResponse> modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStorageSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStorageSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyUserBusinessBehaviorResponse> modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUserBusinessBehaviorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUserBusinessBehaviorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVRouterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVRouterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVSwitchAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVSwitchAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVSwitchAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVirtualBorderRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVirtualBorderRouterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Make sure that you have fully understood the billing method of Reserved instances before using this operation. For more information, see [billing methods for Reserved Instances](~~ 100371 ~~).
    
    -Before purchasing a reserved instance, you can call [DescribeAvailableResource](~~ 66186 ~~) to query available instance resources.
     */
    @Override
    public CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseReservedInstancesOffering").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PurchaseReservedInstancesOfferingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PurchaseReservedInstancesOfferingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Make sure that you have fully understood the billing methods and prices of SCUs. For more information, see [storage capacity unit package billing method](~~ 137897 ~~).
    
    
     */
    @Override
    public CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseStorageCapacityUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PurchaseStorageCapacityUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PurchaseStorageCapacityUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -<props = "china"> The instance must be in the **expired**("Stopped") or **overdue recycling**("Stopped") status. </props>
    
    -<props = "intl"> The instance must be in the **expired**("Stopped") state. </props>
    
    -<props = "china"> You must pay the bill and restart the instance within 15 days after the instance is stopped due to overdue payments. If the instance is not restarted after the overdue bill is settled, the instance is automatically released 15 days after the overdue bill is settled, and the data cannot be recovered. If you restart a pay-as-you-go VPC instance, the instance may fail to be restarted. Please try again at intervals or [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm). </props>
    
    -<props = "intl"> to prevent the instance from being released and data cannot be recovered, you must clear the bill and restart the instance within 15 days after the instance is stopped due to overdue payments. If you cannot restart a VPC instance, try again at intervals or [open a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to contact Alibaba Cloud. </props>
    
    -<props = "china"> after the overdue payment is settled, the total value of your Alibaba Cloud account balance (cash balance) and voucher cannot be less than RMB 100.00. Otherwise, the instance cannot be restarted. For more information about business restrictions, see [reboot instance](~~ 34374 ~~). </props>
    
    -After the API is called, the instance enters the **starting**("Starting") state.
    
    -If the "OperationLocks" parameter of a locked ECS instance contains "LockReason ": "security", you cannot call this operation. For more information, see [API actions for security lock](~~ 25695 ~~).
    
     */
    @Override
    public CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReActivateInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReActivateInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReActivateInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The status of the cloud disk must be **in use**(In_use). The status of the ECS instance attached to the cloud disk must be **Stopped**(Stopped).
    
    -You cannot reinitialize the disks attached to the instance before it is started for the first time.
    
    -A cloud disk that already has a local snapshot cannot be reinitialized.
    
    -<props = "china"> cloud disks with multiple mount features enabled cannot be reinitialized. </props>
    
    -The system disk is initialized to the initial state of the image. If the source image of the created cloud disk is deleted, it cannot be initialized.
    
    -For directly created data disks, initialize them to the empty disk state.
    
    -Initialize a data disk created from a snapshot to the snapshot state.
    
    > for a data disk created from a snapshot, if the source snapshot has been deleted, it cannot be initialized and an error is returned.
    
     */
    @Override
    public CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReInitDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReInitDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReInitDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -You can restart only ECS instances in the **running**("Running") status.
    
    -Restart the ECS instance and enter the **starting**("Starting") status.
    
    -Force restart ("ForceStop") is supported. Force restart is equivalent to a power-off restart on a traditional server. Data that is not written to disks in the operating system of an instance may be lost.
    
    -When the "OperationLocks" parameter of a locked ECS instance contains "LockReason": "security", the instance cannot be restarted. For more information, see [API actions for security lock](~~ 25695 ~~).
     */
    @Override
    public CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -The status of the ECS instance must be **running**("Running").
    
    -Batch operations are supported. You can set the batch operation mode by using the "BatchOptimization" parameter.
    
    -Force restart ("ForceReboot") is supported. Force restart is equivalent to a power-off restart on a traditional server. Data that is not written to block storage in the operating system of an instance may be lost.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
     */
    @Override
    public CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    When the status of a DDH is UnderAssessment, that is, the latency of a fault, we recommend that you call this operation to perform a fault migration for the DDH to avoid permanent faults. You can call the API [DescribeDedicatedHosts](~~ 134242 ~~) to query the status information of the DDH.
     */
    @Override
    public CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedeployDedicatedHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedeployDedicatedHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    RedeployInstance an Asynchronous call, the instance is restarted and migrated. After the instance is redeployed, the instance enters the running ("Running") state. When the redeployment fails, the instance returns to the original physical server and returns to the state before redeployment.
    
    When you call this operation, note that:
    
    -The target instance must be in the running or stopped state. The instance status changes after the API is called:
    
    -The running ("Running") instance enters the stopped ("Stopping") state.
    
    -When the instance is in the stopped ("Stopped") state, it enters the starting ("Starting") state.
    
    -You cannot redeploy instances on dedicated hosts.
    
    -When "OperationLocks" is marked with ""LockReason": "security", the instance cannot be redeployed.
    
    -You cannot respond to simulated events created by CreateSimulatedSystemEvent.
    
    -In the system event process of isolating local disks, you can also call the SystemMaintenance when the damaged local disks are isolated but have not been released. The system maintenance plan restarts and reinitializes the damaged disks. This event (RebootAndReInitErrorDisk. RedeployInstance) occurs. For more information, see [local disk instance system Event Overview](~~ 107693 ~~).
    
    For more information about the types and status of system events that can be responded to RedeployInstance, see the following table.
    
    | Event name and parameters | Event status |
    | --- | --- |
    | Instance restart due to system maintenance (SystemMaintenance.Reboot)| Inquiring, Scheduled |
    | Instance redeployment due to system maintenance (SystemMaintenance.Redeploy)| Inquiring, Scheduled |
    | Restart due to system maintenance and replace the damaged disk (SystemMaintenance.RebootAndIsolateErrorDisk)| Inquiring |
    | Restart due to system maintenance and reinitialize the damaged disk (SystemMaintenance.RebootAndReInitErrorDisk)| Inquiring |
    | Redeploy an instance due to a system error (SystemFailure.Redeploy)| Inquiring, Scheduled |
    | Only ECS instances that use local disks: the instance is restarted due to a system error (SystemFailure.Reboot)| Executing |
    | Damaged disk due to system maintenance (SystemMaintenance.IsolateErrorDisk) | Inquiring |
    | Reinitialize the damaged disk due to system maintenance (SystemMaintenance.ReInitErrorDisk) | Inquiring |
    
    > redeploy the local disk instance will reinitialize the local disk and the data of the storage device will be cleared.
     */
    @Override
    public CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedeployInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedeployInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    The capacity reservation service that takes effect immediately. If the release method is manual release, you can call this operation to release the capacity reservation service directly.
     */
    @Override
    public CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before releasing a pay-as-you-go dedicated host, make sure that no ECS instances exist on the host.
     */
    @Override
    public CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseDedicatedHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseDedicatedHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleasePublicIpAddressResponse> releasePublicIpAddress(ReleasePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleasePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleasePublicIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleasePublicIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveBandwidthPackageIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveBandwidthPackageIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * ## API description
    
    <props = "china"> when you renew the payment, you must use the deductible voucher first, and your account must support account balance payment or credit payment. </props>
    
    <props = "intl"> when you renew the payment, you must use the deductible voucher first, and your account must support credit payment. </props>
    
    <props = "partner"> when you renew the payment, you must use the deductible voucher first, and your account must support credit payment. </props>
    
     */
    @Override
    public CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.aliyun.com/price/product#/ecs/detail) before using this interface. </props>
    
    <props = "intl"> make sure that you have fully understood the billing method and product pricing of [ECS](https://www.alibabacloud.com/product/ecs#pricing) before using this interface. </props>
    
    When you call this operation, note that:
    
    -You can only renew a subscription ECS instance for a period of time or to a unified expiration date.
    
    -The renewal period and the renewal period of the instance to the unified expiration date cannot be performed synchronously. That is, the renewal period parameter ("renew", "renewdune") and the unified expiration date parameter ("ExpectedRenewDay") must be specified, but cannot be set at the same time.
    
    -<props = "china"> your account must support account balance payment or credit payment. </props>
    
    -<props = "intl"> your account must support credit payment. </props>
    
    -<props = "partner"> your account must support credit payment. </props>
    
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
     * 
    ## API description
    
    When you change a system disk, note the following:
    
    -You cannot change the disk type of the system disk.
    
    -You cannot change the billing method of the system disk.
    
    -The instance must be in the Stopped (Stopped) state.
    
    > applies only to VPC instances. If the ECS instance is billed on a pay-as-you-go basis and the VPC mode is enabled by default, the instance cannot be restarted after the system disk is replaced due to insufficient ECS instances in the region. You must set this parameter to normal shutdown mode when you stop the instance. For more information, see [StopInstance](~~ 25501 ~~).
    
    -The ECS instance cannot be locked. The "OperationLocks" parameter value of the instance contains ""LockReason": "security"". For more information, see [API actions for security lock](~~ 25695 ~~).
    
    -The ECS instance attached to the system disk cannot have an unpaid order.
    
    -You can use the "SystemDisk.Size" parameter to specify the size of the system disk.
    
    After the system disk is replaced, we recommend that you use any of the following methods to verify that the system disk is replaced:
    
    -Call the [DescribeDisks](~~ 25514 ~~) operation to query the status of the new system disk. If an instance is attached, the system disk is replaced.
    
    -You can call the [DescribeInstances](~~ 25506 ~~) operation to query the status of the instance to which the system disk is replaced. If "OperationLocks" is null, the system disk replacement operation is completed.
    
     */
    @Override
    public CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceSystemDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceSystemDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceSystemDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReportInstancesStatusResponse> reportInstancesStatus(ReportInstancesStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportInstancesStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportInstancesStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportInstancesStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The disk must be in the In_Use state.
    
    -The status of the instance attached to the disk must be Stopped (Stopped). You can call [StopInstances](~~ 155372 ~~) to stop an instance.
    
    -The specified parameter SnapshotId must be a historical snapshot created by DiskId.
    
    -When you query ECS instance information through [DescribeInstances](~~ 25506 ~~), if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
     */
    @Override
    public CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before you call this operation to roll back a disk, make sure that you need to pay attention to the instance snapshot rollback feature. For more information, see [roll back Cloud disks from instance snapshots](~~ 209160 ~~).
     */
    @Override
    public CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    > before resizing, be sure to query the partition format used by the cloud disk. If the MBR format is used, it cannot be scaled up to more than 2TiB. Otherwise, data will be lost. For MBR partition expansion, we recommend that you recreate and mount a data disk in GPT partition format before copying the existing data to the new data disk. For more information, see [resize disk capacity](~~ 44986 ~~).
    
    -The types of cloud disks that can be resized include basic cloud disks ("cloud"), ultra cloud disks ("cloud_efficiency "), SSD cloud disks ("cloud_ssd"), and ESSD("cloud_essd").
    
    -You cannot scale out a disk when it is creating a snapshot.
    
    -The status of the instance attached to the disk must be **running**("Running") or **stopped**("Stopped").
    
    -When resizing, the disk partitions and file systems are not modified. You need to allocate your own storage space after resizing.
    
    -<props = "china"> disks with multiple mount features can only be scaled out offline. Before resizing, you must ensure that all instances attached are in the **stopped**("Stopped") status. </props>
    
     */
    @Override
    public CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In the API document of the security group, the initiator of the traffic is the Source and the receiver of the data transmission is the Dest.
    
    -Any of the following parameters can match an inbound rule of a security group. Only one parameter can be specified to determine a security group rule.
    
    -Revoke the access permission of the specified cidr block. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourceCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroup
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourceCidrIp=10.0.0.0/8
    &IpProtocol=tcp
    &PortRange=80/80
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    
    -Revoke permission settings for other security groups. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourceGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroup
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourceGroupId=sg-bp67acfmxa123b ****
    &IpProtocol=tcp
    &PortRange=80/80
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    -Revokes security group rules associated with the prefix list. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, and SourcePrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroup
    &SecurityGroupId=sg-bp67acfmxazb4p ****
    &SourcePrefixListId=pl-x1j1k5ykzqlixdcy ****
    &IpProtocol=tcp
    &PortRange=80/80
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    
    -If the specified security group rule does not exist, the RevokeSecurityGroup is called successfully, but no rules are deleted.
     */
    @Override
    public CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    In the API document of the security group, the initiator of the traffic is the Source and the receiver of the data transmission is the Dest.
    
    -A security group rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Revoke the access permission to a specified CIDR block, such as the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestCidrIp.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &IpProtocol=tcp
    &DestCidrIp=10.0.0.0/8
    &PortRange=-22/22
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    
    -Revoke access permissions to other security groups, such as IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestGroupId.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &DestGroupId=sg-bp67acfmxa123b ****
    &IpProtocol=tcp
    &PortRange=22/22
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    -Revokes security group rules associated with the prefix list. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestPrefixListId.
    
    """
    https://ecs.aliyuncs.com/? Action=RevokeSecurityGroupEgress
    &SecurityGroupId=sg-bp67acfmxazb4ph ***
    &IpProtocol=tcp
    &DestPrefixListId=pl-x1j1k5ykzqlixdcy ****
    &PortRange=-22/22
    &NicType=intranet
    &Policy=accept
    & <common request parameters>
    """
    
    -If the specified security group rule does not exist, the RevokeSecurityGroupEgress is called successfully, but no rules are deleted.
     */
    @Override
    public CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSecurityGroupEgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSecurityGroupEgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Unlike executing commands through [CreateCommand](~~ 64844 ~~) and [InvokeCommand](~~ 64841 ~~), RunCommand can create and execute commands with only one call.
    
    When you call this operation, note that:
    
    -The network type of the target instance must be VPC.
    
    -The status of the target instance must be running ("Running").
    
    -The target instance must be pre-installed with the cloud assistant client ([InstallCloudAssistant](~~ 85916 ~~)).
    
    -When you run a command of the PowerShell type, make sure that the ECS Windows module is configured for the target PowerShell instance.
    
    -The standard time for periodic execution is UTC +0, and this time is based on the system time of the instance. The time or time zone of the ECS instance must be the same as expected. For more information about time zones, see [set the Linux instance time zone and NTP service](~~ 92803 ~~) or [set the Windows instance NTP service](~~ 51890 ~~).
    
    -You can specify the "TimeOut" parameter to set the maximum timeout period when a command is executed on an ECS instance. After the command execution times out, the cloud assistant client forcibly terminates the process.
    -After a single execution times out, the command execution status ([InvokeRecordStatus](~~ 64845 ~~)) changes to Failed.
    -The timeout period of periodic execution is valid for each execution record. The last execution timeout does not affect the next execution. After an execution times out, the execution status ([InvokeRecordStatus](~~ 64845 ~~)) changes to Failed.
    
    -The command may fail to be executed due to an abnormal status, network exception, or cloud assistant client exception of the target instance. If the command fails to be executed, no execution information is generated.
    
    When-"EnableParameter = true", custom parameters are enabled. When "CommandContent" is set, you can use "{{parameter}}"to represent custom parameters, and pass in custom parameter key-value pairs when running commands.
    
    <props="china">
    -A maximum of 100 to 10,000 cloud assistant commands can be retained in a region based on your usage. A maximum of 2,000 to 200,000 cloud assistant commands can be executed per day. You can use [DescribeAccountAttribute](~~ 73772 ~~) to query the quota status, or [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) to adjust the quota of the reserved amount and the number of calls.
    
    </props>
    
    
    <props="intl">
    -A maximum of 100 to 10,000 cloud assistant commands can be retained in a region based on your usage. A maximum of 2,000 to 200,000 cloud assistant commands can be executed per day. You can use [DescribeAccountAttribute](~~ 73772 ~~) to query the quota status, or [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to adjust the quota of the reserved amount and the number of calls.
    
    </props>
     */
    @Override
    public CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description:
    -The status of the target ECS instance must be running ("Running").
    -The cloud assistant client must be installed on the target ECS instance. For more information, see [InstallCloudAssistant](~~ 85916 ~~).
    -The cloud assistant client version must be later than the following version to support file delivery. If the error code "ClientNeedUpgrade" is returned, update the client to the latest version. For more information, see [upgrade or disable cloud assistant client upgrade](~~ 134383 ~~).
    -Linux:1.0.2.569
    -Windows:1.0.0.149
    -The size of the file cannot exceed 32 KB after Base64 encoding.
    -The error message returned because the status of the target ECS instance is abnormal, the network is abnormal, or the cloud assistant client is abnormal. Call [DescribeSendFileResults](~~~) for troubleshooting.
     */
    @Override
    public CompletableFuture<SendFileResponse> sendFile(SendFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartElasticityAssuranceResponse> startElasticityAssurance(StartElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The status of the ECS instance must be **stopped**("Stopped").
    
    -When the instance "OperationLocks" of the [security control](~~ 25695 ~~) is marked as "LockReason ": "Security", the instance cannot be started.
     */
    @Override
    public CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The status of the ECS instance must be **stopped**("Stopped").
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    -Batch operations are supported. You can set the batch operation mode by using the "BatchOptimization" parameter.
     */
    @Override
    public CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props = "china"> the session management function is being invited for testing. To use this function, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex). </props>
    
    <props = "intl"> The Session management function is being invited for testing. To use this function, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm). </props>
    
    You can call this operation to obtain the WebSocketUrl of a remote connection to an ECS instance. Note the following when you call this operation:
    
    -The specified ECS instance must be in the Running state.
    -The cloud assistant client must be installed on the specified ECS instance. You can call [DescribeCloudAssistantStatus](~~ 87346 ~~) to query whether the cloud assistant client is installed on the ECS instance and the version number of the cloud assistant client.
    -If the cloud assistant client is not installed on your ECS instance, call [InstallCloudAssistant](~~ 85916 ~~) to install it.
    -The cloud assistant client must be later than the following version to support session management. If you want to upgrade the cloud assistant client version, see [upgrade or disable upgrade of cloud assistant client](~~ 134383 ~~).
    -Linux operating system: 2.2.3.256
    -Windows operating system: 2.1.3.256
    -After you call this operation, the validity period of the WebSocketUrl is 10 minutes.
    -A maximum of 1,000 sessions can be created and available in a region, and a maximum of 10 sessions can be connected to a single ECS instance.
    
     */
    @Override
    public CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTerminalSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTerminalSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTerminalSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When the "OperationLocks" parameter of a locked ECS instance contains "LockReason": "security", the instance cannot be stopped. For more information, see [API actions for security lock](~~ 25695 ~~).
    
    -After the VPC instance shutdown mode is enabled, you can enable the normal shutdown mode by setting "StoppedMode = KeepCharging". After the ECS instance is stopped, the billing continues and the ECS instance type inventory and public IP address are retained.
     */
    @Override
    public CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    -After the pay-as-you-go instance is enabled, you can set "StoppedMode = KeepCharging" to enable the normal shutdown mode. After the instance is stopped, the billing continues, and the ECS instance type inventory and public IP address are retained.
    
    -Batch operations are supported. You can set the batch operation mode by using the "BatchOptimization" parameter.
     */
    @Override
    public CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -After a single command process is stopped, instances that have already started to run will continue to run, and instances that have not started to run will no longer run.
    
    -After the periodic command process is stopped, the command that has already started to be executed will continue, but will not be executed next time.
     */
    @Override
    public CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInvocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInvocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInvocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    Before binding tags, Alibaba Cloud verifies the number of existing tags. If the limit is exceeded, an error message is returned. For more information, see [limits](~~ 25412 ~~).
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

    @Override
    public CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminatePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminatePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    When you call this operation, note that:
    
    -The Eni must be in the **Available**(Available) or **attached**(InUse) status.
    
    -The ECS instance associated with the primary Eni must be in the **Running**(Running) or **Stopped**(Stopped) status.
    
     */
    @Override
    public CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignIpv6AddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignIpv6AddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    -Only Enis in The **Available**(Available) or **InUse** state are supported.
    
    -When operating the primary Eni, the attached instance must be in the **Running**(Running) or **Stopped**(Stopped) status.
     */
    @Override
    public CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignPrivateIpAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignPrivateIpAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

}
