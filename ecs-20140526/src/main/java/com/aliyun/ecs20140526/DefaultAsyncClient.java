// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526;

import com.aliyun.core.http.*;
import com.aliyun.ecs20140526.models.*;
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
    public CompletableFuture<AcceptInquiredSystemEventResponse> acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptInquiredSystemEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Create proprietary host front, you can call the [DescribeAvailableResource](~~ 66186 ~~) view specified geographical or available area the resource supply.
    
    Create proprietary host opportunities fee, recommends that you know in advance the resources billing. For more details, see [billing Overview](~~ 68978 ~~).
    
    -Single most multi-can create 100 annual commitment monthly or quantity pay proprietary host.
    
    -Create after successful, you can the returned proprietary Host ID list as a request parameter, call [DescribeDedicatedHosts](~~ 134242 ~~) query new proprietary host state.
    
    -Submit to create proprietary the host request, the specified parameter value non-compliance or insufficient inventory when error. Specific error reason, please see the error code.
    
    -Create proprietary host rear, you can pass [ModifyInstanceDeployment](~~ 134248 ~~) will ECS instance from sharing host migration to proprietary host, can also two proprietary host adjusting instance deployment.
     */
    @Override
    public CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Remove distribution public network IP outside, you can also VPC type ECS instance binding elastic public network IP(EIP). For more information, see [AssociateEipAddress](~~ 36017 ~~).
    
    > After An EIP is bound to a VPC instance, no public IP address can be assigned.
     */
    @Override
    public CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocatePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can specify elastic network card belongs switch lower CIDR IPv6 address, you can also specify IPv6 address number automatically create IPv6 address. Note:
    
    -Elastic network card belongs switch must be opened IPv6. More information, please see [to existing switch open IPv6 segment](~~ 98923 ~~).
    
    -Elastic network card must be in Available (Available) or has been binding (InUse) state.
    
    -Main network card associated with the ECS instance must be Running in (Running) or Stopped (Stopped) state.
    
    -A single network card can assigned IPv6 address number and network card additional instances dimension.
    -If elastic network card is Available (Available) state, most can be assigned 10 IPv6 address.
    
    -If elastic network card to mount on the instance, able to allocate the IPv6 address count will be instance specification limits. More information, please see [instance dimension family](~~ 25378 ~~).
    
    -Successful call the interface after you can from return results in get assigned IPv6 address information.
    
     */
    @Override
    public CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Only Enis in the Available (Available) or InUse state are supported.
    
    -When operating the primary Eni, the attached instance must be in the Running (Running) or Stopped (Stopped) state.
    
    -When the Eni is in the Available (Available) state, a maximum of 10 secondary private IP addresses can be assigned. Once attached to an instance, the number of secondary private IP addresses that the NIC can assign is limited by the instance type. For more information, see [instance type family](~~ 25378 ~~).
    
    -After you call this operation, you can obtain the allocated secondary private IP addresses from the returned results.
     */
    @Override
    public CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Cloud status must be **stay Mount** ("available").
    
    -Mount data disk:
    
    -Target ECS instance must be in the **run in** ("running") or **has stopped** ("stopped") state.
    -If you purchase separately cloud, billing way must be quantity pay.
    -From ECS instance uninstall the system disk as data disk mount when, not limit billing.
    
    -Mount system disk:
    
    -Target ECS instance must be uninstall system disk when the source instance.
    -Target ECS instance must be in the **has stopped** ("stopped") state.
    -You must set the instance login credentials.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    <props="china">
    -Open multiple mounting characteristics of cloud, only to mount support NVMe protocol instance. More information, please see [ESSD cloud support NVMe](~~ 256487 ~~) and [use multiple mounting function](~~ 262105 ~~).
    
    </props>
    
     */
    @Override
    public CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    -Binding SSH key pair rear disabled user name with password verification.
    -If the instance is in the **Running**(Running) state, restart the instance ([RebootInstance](~~ 25502 ~~)) and the SSH key pair takes effect.
    -If the instance is in the **Stopped**(Stopped) status, the SSH key pair takes effect after the instance is started ([StartInstance](~~ 25500 ~~).
    -If the instance is bound with an SSH key pair, the new SSH key pair automatically replaces the original SSH key pair.
     */
    @Override
    public CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -The instance must be in the Running (Running) or Stopped (Stopped) state. Some instance types must be in the Stopped (Stopped) state when binding Enis. For more information, for more information, see the ECS instance types to be stopped in [bind an Eni](~~ 58503 ~~).
    
    > If the instance was last started before April 1, 2018 (including but not limited to starting, restarting, and restarting a new instance), you must call the RebootInstance to restart the instance that remains running. Otherwise, you cannot attach an Eni.
    
    -An instance can be attached with multiple Enis at the same time. For more information, see [Enis Overview](~~ 58496 ~~).
    
    -The vSwitch of the instance and the Eni must belong to the same zone and VPC.
    
    
     */
    @Override
    public CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call the interface, you need to know:
    
    -Outlet direction and inbound direction security group rules cannot exceed 200 bar.
    
    -Security Group rule Priority (Priority) optional range is 1~100. The lower the number, the representative of the higher the priority.
    
    -The same priority security group rules, to deny access (drop) rules priority.
    
    -Source end device can be the specified IP ADDRESS range (SourceCidrIp, Ipv6SourceCidrIp, SourcePrefixListId) or other security group (SourceGroupId) in the ECS instance.
    
    -If a matching security group rules already exists, the AuthorizeSecurityGroup call success, but not increase the number of rules.
    
    -A security group rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Settings specify IP ADDRESS segment access permissions. At this time, classic network type security group network card type (NicType) to set public network (internet) and intranet (intranet). VPC type security group network card type (NicType) may only be set intranet (intranet). As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy and SourceCidrIp.
    
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
    
    -Set the other security group"s access. At this time, network card type (NicType) only for intranet (intranet). Classic network type security group between visits when, can set the same region in other security group to your security group access. This security group can be your can also be other Alibaba Cloud account (SourceGroupOwnerAccount). VPC type security group between visits when, can set the same VPC in-other security group access the security group access. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, SourceGroupOwnerAccount and SourceGroupId.
    
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
    
    -In the security group rules associated in the prefix list. In this case, the prefix list only supports security groups whose network type is VPC, and NicType can only be set to intranet. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy and SourcePrefixListId.
    
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
    
    -More about security group of rule settings example, see [application case](~~ 25475 ~~) and [security group five group rules introduced](~~ 97439 ~~).
     */
    @Override
    public CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call the interface, you need to know:
    
    -Outlet direction and inbound direction security group rules cannot exceed 200 bar.
    
    -Security group rules divided into accept access (accept) and deny access to (drop) two-class.
    
    -Security Group rule Priority (Priority) optional range is 1~100. The lower the number, the representative of the higher the priority.
    
    -The same priority security group rules, priority to deny access (drop) rules shall prevail.
    
    -Objective to end device can be the specified IP ADDRESS range (DestCidrIp, Ipv6DestCidrIp, DestPrefixListId) or other security group (DestGroupId) in the ECS instance.
    
    -If a matching security group rules already exists, the AuthorizeSecurityGroupEgress call success, but not increase the number of rules.
    
    -A security group rule can be determined by any of the following parameters. A security group rule cannot be determined by specifying only one parameter.
    
    -Settings specify IP ADDRESS segment access permissions. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy and DestCidrIp.
    
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
    
    -Set the other security group"s access. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, DestGroupOwnerAccount and DestGroupId.
    
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
    
    -In the security group rules associated in the prefix list. At this time, Prefix List only support network type VPC security group, network card type (NicType) can only be set to intranet (intranet). As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy and DestPrefixListId.
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConnectRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertNatPublicIpToEip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Copy rear New snapshot cannot be rolled back Source snapshot corresponding to the cloud.
    -Does not support replication encrypted snapshot.
    -No support copy local snapshot.
     */
    @Override
    public CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopySnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Pass activation code will be non-Alibaba cloud server registration for Alibaba Cloud managed instance after you can managed instance used in Alibaba Cloud provided a variety of online services (such as cloud assistant, operations, choreography and cloud effect etc. service).
    
    Non-Alibaba cloud operating system of the server need to meet the following version, and the server can access public network, only can be registered as Alibaba Cloud managed instance.
    
    -Alibaba Cloud Linux 2/3 and later
    -CentOS 6/7/8 and later
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Auto provisioning is free of charge, but you need to pay for the instance resources created from the auto provisioning group. For more information, see [preemptible instance billing](~~ 52088 ~~) and [pay-as-you-go](~~ 40653 ~~).
    
    -If you specify both the launch template ("LaunchTemplateId") and the launch configuration ("LaunchConfiguration.* "), the system preferentially uses the launch template.
     */
    @Override
    public CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call the interface to create automatic snapshot policy when you can set automatic snapshot repeated cycles of, retention time and cross-regional backup strategy. Meet your diverse data backup requirements. Create automatic snapshot policy rear, need to call [ApplyAutoSnapshotPolicy](~~ 25531 ~~) to apply the policy to target cloud. If you need to adjust automatic snapshot policy content, please call [ModifyAutoSnapshotPolicyEx](~~ 25529 ~~).
    
    When you call this operation, note that:
    
    -A Alibaba Cloud account in a geographical most multi-can create 100 strip automatic snapshot policy.
    
    -If cloud more data, single create automatic snapshot over between two points in time interval, the automatic skip the next point in time. Example: You set 09:00, 10:00, 11:00 and 12:00 for automatic snapshot point in time. Because cloud more data, 09:00 snapshot creation began, 10:20 finish create a snapshot, actual time-consuming 80 minutes. System will skip time point 10:00, wait until 11:00 continue to you create automatic snapshot.
    
    -Cross-region replication snapshot"s small print also known as see copy snapshot](~~ 159441 ~~) background information section.
     */
    @Override
    public CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can pass capacity reservation service, specify the available area, instance dimension etc. properties, system will private pool reserved attributes match resources. More information, please see [effective immediately capacity scheduled Overview](~~ 193633 ~~).
    
    -Currently services supports only take effect immediately mode. Buy effective immediately capacity reservation service rear, instance dimension began follow quantity pay standard billing, whether actual created quantity pay instance, until you self manual release or expiration system automatic release effective immediately capacity reservations with confidence.
    -You can pass [CreateInstance](~~ 25499 ~~) or [RunInstances](~~ 63440 ~~) create an instance set private pool capacity options, or pass [ModifyInstanceAttachmentAttributes](~~ 190006 ~~) modify instance private pool capacity options. Instance successful match private pool capacity rear, based on your instance configuration charge instance specifications, cloud, public network bandwidth etc. related resources fee.
    -Not actually create quantity pay instance only charge instance dimension costs.
    -Effective immediately capacity scheduled matching instance and unused capacity bill support by saving plan, regional-level reserved instance voucher deduction hours bill, does not support pass available District reserved instance voucher deduction hours bill. You first purchase Reserved Instances voucher or savings plans, Reserved Instances voucher or save plan coverage lower use effective immediately capacity reservation service, can get free resources the certainty of security.
    
    > Call API way supports only creating effective immediately capacity reservation. Pass ECS console can create effective immediately capacity scheduled or specified time entry into force capacity scheduled, more information, please see [resource reservation service](~~ 193626#section-oil-qh5-xvx ~~).
     */
    @Override
    public CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You can create the following types of command:
    
    -Windows the Bat script (RunBatScript) applicable to the instance.
    
    -Windows the PowerShell script for the instance (RunPowerShellScript).
    
    -Linux instance applicable Shell script (RunShellScript).
    
    -You can specify the parameter TimeOut for command sets the ECS instance performed in the biggest TimeOut time, command execution TimeOut after [cloud assistant client](~~ 64921 ~~) will force termination command process, cancel the command PID.
    
    -For a single implementation, after timeout, the command for the specified ECS instance the execution status of the ([InvokeRecordStatus](~~ 64845 ~~)) into execution Failed (Failed).
    
    -For cycle:
    
    -Cycle timeout time on every execution record are valid.
    
    -An execution timeout after the implementation the status of the record ([InvokeRecordStatus](~~ 64845 ~~)) into execution Failed (Failed).
    
    -Last time execution timeout or not don"t affect the next.
    
    -<props = "china"> in a geographical lower, you up can keep 100 strip cloud assistant command. You can also [submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) adjusting ownership quotas. </props>
    
    -<props = "intl"> in a geographical lower, you up can keep 100 strip cloud assistant command. You can also [submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) adjusting ownership quotas. </props>
    
    -<props = "partner"> in a geographical lower, you up can keep 100 strip cloud assistant command. You can also submit job adjusting ownership quotas. </props>
    
    -You can specify the parameter WorkingDir for command specifies the execution path. For Linux instances, default administrator of the root user home directory, specific is "/root" directory. For Windows instance, default in the cloud assistant client process Directory, for example, C:WindowsSystem32.
    
    -You can specify the parameter EnableParameter = true enable custom parameter function. Set CommandContent when can by {{parameter}} the form of custom parameters, and run the command ([InvokeCommand](~~ 64841 ~~)) when, incoming custom parameter key pair. For example, you create the command, create "echo {{name}} command, in InvokeCommand when pass Parameters parameter incoming key value pair "<name, Jack>". The custom parameter will automatically replace command, you"ll get a new command, and in the instance implementation "echo jack ".
     */
    @Override
    public CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    > Exclusive block storage cluster functionality currently supports South China 2 (Heyuan), Indonesia (Jakarta) and financial cloud south China 1 (Shenzhen) geographical.
    
    Exclusive Block Storage Cluster (Dedicated Block Storage Cluster) Is With other public clouds Storage Cluster physical isolation, owners can Exclusive entire Cluster Resources Block Storage services. More information, please see [what is exclusive block storage cluster](~~ 208883 ~~).
    
    Exclusive block storage cluster created on cloud only mount to the same available area ECS instance. You create the exclusive block storage cluster front, need to plan to which the resource belongs geographical and available area.
    
     */
    @Override
    public CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedBlockStorageCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Only supports report I/O optimization instance dimension, and proprietary network VPC type of ECS instance.
    
    > This API is in use for internal testing and has not been officially launched. We recommend that you do not use this API. Please wait.
     */
    @Override
    public CompletableFuture<CreateDemandResponse> createDemand(CreateDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    -Create ESSD cloud when, if you do not set cloud performance level, the default is PL1 level. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    -You can enable the multi-Mount feature ("MultiAttach") when creating a cloud disk. We recommend that you understand this feature and its limits. For more information, see [NVMe support for ESSDS](~~ 256487 ~~) and [use multiple Mount functions](~~ 262105 ~~).
    
    </props>
    
    <props="intl">
    -Creating a cloud disk involves resource billing. We recommend that you know the billing method of ECS in advance. For more information, see [billing Overview](~~ 25398 ~~).
    -When you create a cloud disk, the automatic snapshot is deleted when the disk is deleted. The value of "DeleteAutoSnapshot" is "true ". You can use [ModifyDiskAttribute](~~ 25517 ~~) to modify this parameter.
    -Create ESSD cloud when, if you do not set cloud performance level, the default is PL1 level. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    
    </props>
    
    <props="partner">
    -Creating a cloud disk involves resource billing. We recommend that you know the billing method of ECS in advance. For more information, see [billing Overview](~~ 25398 ~~).
    -When you create a cloud disk, the automatic snapshot is deleted when the disk is deleted. The value of "DeleteAutoSnapshot" is "true ". You can use [ModifyDiskAttribute](~~ 25517 ~~) to modify this parameter.
    -Create ESSD cloud when, if you do not set cloud performance level, the default is PL1 level. You can use [ModifyDiskSpec](~~ 123780 ~~) to modify the performance level of a cloud disk.
    -The default billing method for a cloud disk is pay-as-you-go, that is, the default "Portable" attribute is "true ".
    
    </props>
    
     */
    @Override
    public CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    Elastic security service provides a new way to purchase and use resources with both flexibility and certainty. It is a pay-as-you-go ECS instance that can be billed, provides guaranteed resource reservation services. For more information, see [Overview](~~ 193630 ~~).
    
    -Refund is not supported after you purchase the elastic protection service.
    -Only pay-as-you-go ECS instances can be created.
    -Currently, the auto guarantee mode is only available for unlimited times, that is, the "ancesttimes" parameter can only be set to "Unlimited ". The auto guarantee service in unlimited mode starts automatically after the guarantee takes effect.
     */
    @Override
    public CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Waiting for the mirror status becomes Available (Available) before use mirroring resources.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    The following describes three pass the interface create custom mirror method. Request parameters of priority: "instanceid"> "diskdevicemapping"> "snapshotid", if your in the request also contains two or more parameter, default to higher priority parameter shall prevail create a mirror.
    
    -**Method a**: Use a instance do template, only need to specify the instance ID ("instanceid"). The table instance status must be run in the ("running") or stopped ("stopped"). Interface calls after successful, the table instance of each cloud will add a snapshot. Because running instances exist cache data Men of the plate of, may lead to create a custom mirror data and instance data not completely consistent. Therefore Alibaba Cloud recommend you stop instance ([StopInstances](~~ 155372 ~~)) rear create a mirror.
    
    -**Method two**: for a instance system disk create custom mirror, only need to specify the instance system disk a history snapshot ID ("snapshotid"). Of which, the specified snapshot cannot be 2013 nian 7 yue 15 ri (including) created before the snapshot.
    
    -**Method three**: Multi-a snapshot combined into a image template, need to establish a few Cloud Data Association ("diskdevicemapping").
    
    Use method three hit custom mirror, please note:
    
    -Can only specify a system disk snapshot, system disk device name must be/dev/xvda.
    
    -You can specify multiple data disk snapshot, data disk device name, by default system ordered allocation, from/dev/xvdb turn sort to/dev/xvdz, cannot be repeated.
    
    -Can not specify "snapshotid", don"t finger timing creates a specified size no data for the empty data plate.
    
    -The specified snapshot cannot be 2013 nian 7 yue 15 ri (including) created before the snapshot.
     */
    @Override
    public CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can mirror template custom mirror content, and support cross-regional cross-account build mirror. Create image template front, you need to note:
    
    -Only supports create your own custom mirror template.
    -Only support setting Linux system public mirroring, self-define the mirror, sharing the mirror or the Mirror family.
    -By mirroring template build when mirroring, need to create transit instance auxiliary build mirror, transit instance for quantity billing ECS instance, will be charged a fee. More information, please see [quantity pay](~~ 40653 ~~).
    
    On building template content "buildcontent", you need to note:
    -If the parameter "buildcontent" set "from" command, the source mirror type "baseimagetype" and source mirror "baseimage" value set will be "from" command coverage.
    -If the parameter "buildcontent" not set "from" command, the system automatically source mirror type "baseimagetype" and source mirror "baseimage" the "from" command to add to the template content first line, format for "<BaseImageType >:< BaseImage>".
    -A mirror template content can pass Dockerfile editing, and then the content incoming "buildcontent" parameters. The content size cannot exceed 16KB. A maximum of 127 commands are supported. Support The Command description details, please see [Mirror build service support command description](~~ 200206 ~~).
    
    You cannot use an API to create an image template. This feature is only supported by console operations. For more information, see [image building Overview](~~ 197410 ~~).
    
     */
    @Override
    public CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImagePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    > You can call [DescribeAvailableResource](~~ 66186 ~~) view specified geographical or available area instance resources supply. If you want bulk create instance and the instance automatically to run in (Running) state, recommend you use [RunInstances](~~ 63440 ~~) interface.
    
    <props = "china"> create the ECS instance needs to pass real-name authentication. You can see [account real-name authentication related document](~~ 48263 ~~) complete the certification. </props>
    
    Create the ECS instance, you need to note:
    
    -**Billing * *:
    
    -Create instance will involve resource charge, recommends that you know in advance the cloud server ECS billing. For more details, see [billing Overview](~~ 25398 ~~).
    
    -If instance billing for annual commitment monthly instance ("prepaid"), payment by default when using your available coupon.
    
    -**Instance dimension * *:
    
    -Can pass parameter "iooptimized" specify whether to create I/O optimization instance.
    
    -Product selection: see [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, for more information about how to select an instance type, see [select configuration](~~ 58291 ~~).
    
    -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
    
    > If you create instance returns "quotaexceed. elasticquota" error, indicates that you in the current geographical selector instance of the dimension to be created the number exceeds the system limit, or full instance dimension vCPU quota exceeds the system limit, you can go to the [ECS console](https://ecs.console.aliyun.com/? spm = a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) apply for an increase in the quota.
    
    -**Mirror * *:
    
    -Mirroring determining instance system disk configuration, instance system disk is specify mirror the clone.
    
    -Instance memory for 512 MiB when, can"t use remove six months channels outside the Windows Server Mirror.
    
    -Instance memory for 4 GiB above, can"t use a 32-bit operating system image.
    
    -**Network type * *:
    
    -Proprietary network VPC type instance must and can only belong to a switch.
    
    -Specifies the "vswitchid" when "securitygroupid" and "vswitchid" must belong to the same VPC.
    
    -"privateipaddress" dependent on "vswitchid", can"t specify individual "privateipaddress ". Specify both "vswitchid" and "privateipaddress" when "privateipaddress" must in the switch of free subnet network segment.
    
    -**Public network bandwidth * *:
    
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. Specific speed limit policy: a single geographical lower, all use flow meter fee ECS instance the actual run bandwidth peak sum not greater than 5 Gbit/s; all fixed bandwidth billing ECS instance the actual run bandwidth peak sum no more than 50 Gbit/s.
    
    -Use "createinstance" create instance of will not dispensing public IP ADDRESS, you can call the [AllocatePublicIpAddress](~~ 25544 ~~) discretionary.
    
    -"internetchargetype" and "internetmaxbandwidthout" settings decision bandwidth costs.
    
    -Alibaba cloud network data flow free, "internetmaxbandwidthin" value and billing irrelevant.
    
    -"internetchargetype = paybybandwidth" said fixed bandwidth pay, the "internetmaxbandwidthout" for the selected fixed bandwidth value.
    
    -"internetchargetype = paybytraffic" said use flow pay, the "internetmaxbandwidthout" Image bandwidth upper limit settings, billing to actual use of network traffic based on.
    
    -**Security Group * *:
    
    -You must pre-create a security group can pass [CreateSecurityGroup](~~ 25553 ~~) created.
    
    -Same security groups can accommodate the number of instances depending group type, specific see [use restrictions](~~ 25412 ~~) security group chapters.
    
    -The same security within the group instance intranet can access each other. Different security group between default quarantine, not mutual access, but can be authorized to access. For more details, please see [AuthorizeSecurityGroup](~~ 25554 ~~) and [AuthorizeSecurityGroupEgress](~~ 25560 ~~).
    
    -**Storage * *:
    
    -According to you specify the mirror image of the instances are assigned a corresponding size system disk. System disk capacity must be greater than or equal to "max{20, ImageSize}". System disk types of see "systemdisk. category" parameter description.
    
    -I/O optimized instances system disk can only select ESSD cloud ("cloud_essd"), SSD cloud ("cloud_ssd") and efficient cloud ("cloud_efficiency").
    
    -Different types cloud data plate maximum capacity different. Details see "datadisk. N. size" parameter description.
    
    -A instance add up to 16 block data plate. Data disk mount point by the system default order distribution,/dev/xvdb start to/dev/xvdz.
    
    -**Custom data**: if instance meets use [instance Custom Data](~~ 49121 ~~) restrictions, you can incoming UserData information. UserData to Base64 way encoding. Because the transport API request when, not encrypted you set "userdata", not recommended in clear text incoming confidential information, such as passwords and private key. If you must incoming, encryption recommended rear, and then to Base64 way coding later, instance interior in the same way Anti decryption.
    
    -**Other**: in Alibaba Cloud CLI and SDK used in API, part with English period (.) the input parameters need to remove English period (.), use it again. For example, use "systemdiskcategory" said input parameters "systemdisk. category ".
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    In addition to calling CreateKeyPair create a key pair outside, you can also use third-party tools to create a key pair, and then upload ([ImportKeyPair](~~ 51774 ~~)) to a Alibaba Cloud geographical, its use method and system created for you key pair is consistent.
    
    You in each geographical key logarithmic up to 500 pair. More information, please see [use restrictions](~~ 25412 ~~).
     */
    @Override
    public CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Create a template ("createlaunchtemplate") rear, template initial version is 1, you can follow-up based on the version create multiple template version ("createlaunchtemplateversion"), version number from 1 start sequence incremented. If you create an instance ([RunInstances](~~ 63440 ~~)) when not specified template version number, will use the default version.
    
    When you call this operation, note that:
    
    -You can create a maximum of 30 instance launch templates in a region, and each template can have a maximum of 30 versions.
    
    -Instance startup template parameter most is optional. When you create the template, Alibaba Cloud does not validate the template parameters existence and effectiveness. Only real create an instance calibration parameters effectiveness.
    
    -If the instance start template set in a configuration, create an instance ([RunInstances](~~ 63440 ~~)) when unable to filter out the configuration. For example, if the template set "hostname = localhost", "runinstances" in "hostname" value is empty, instance host name is still "localhost ". If you want to override "hostname = localhost" this configuration, can "runinstances" in image "hostname = myhost" or other parameter values.
     */
    @Override
    public CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -An account in a Alibaba Cloud geographical inner default create up to 100 elastic network card. For more information, open a ticket (https://selfservice.console.aliyun.com/ticket/createIndex.htm).
    
    </props>
    
    <props="intl">
    -The newly created Eni is in the Available (Available) state.
    
    -Enis can only be attached to VPC instances in the same zone.
    
    -An Eni can be attached to only one instance. You must detach a new instance from the current instance before attaching it to the new instance.
    
    -When the Eni is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.
    
    -If you need to set an IPv6 address when creating an Eni, make sure that IPv6 is enabled for the specified vSwitch. For more information, see [what is IPv6 gateway](~~ 98896 ~~).
    
    -An account in a Alibaba Cloud geographical inner default create up to 100 elastic network card. For more information, open a ticket (https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
    
    </props>
    
    <props="partner">
    -The newly created Eni is in the Available (Available) state.
    
    -Enis can only be attached to VPC instances in the same zone.
    
    -An Eni can be attached to only one instance. You must detach a new instance from the current instance before attaching it to the new instance.
    
    -When the Eni is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.
    
    -If you need to set an IPv6 address when creating an Eni, make sure that IPv6 is enabled for the specified vSwitch. For more information, see [what is IPv6 gateway](~~ 98896 ~~).
    
    -An account in a Alibaba Cloud geographical inner default create up to 100 elastic network card. For more information, open a ticket.
    
    </props>
     */
    @Override
    public CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResource02").setMethod(HttpMethod.PUT).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Appointment analog event rear, you can pass ECS management console, [ECS API](~~ 63962 ~~) and cloud monitoring service view has an appointment analog system events.
    
    The following table for analog system events life cycle:
    
    -Scheduled (in planning): an appointment after analog system event automatically switches to Scheduled state.
    -Executed (completed): without human intervention, analog system event at a given point (NotBefore) automatically become Executed state.
    -Canceled (Canceled): You call [CancelSimulatedSystemEvents](~~ 88808 ~~) cancel simulation system event rear, become Canceled state.
    -Avoided (avoid): for system maintenance instance restart (SystemMaintenance.Reboot) simulation system event, can pass the time by [restart the instance](~~ 25502 ~~) and become Avoided state.
     */
    @Override
    public CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Originally floor snapshot turnover for snapshot zoom features available. The parameters are described as follows:
    -If you 2020 nian 12 yue 14 ri before used local snapshot. You can normal use parameter "category" and "instantaccess", but to note:
    -Parameter "category" and "instantaccess" can"t value.
    -Parameter "category" and "instantaccess" are not value when default create common snapshot.
    -If you 2020 nian 12 yue 14 ri has not been used previously local snapshot. You can only use parameter "instantaccess", can"t use the parameter "category ".
    <props = "china"> more information, please see [12 yue 14 ri Alibaba Cloud Snapshot service upgrade and add billing item notification](https://help.aliyun.com/noticelist/articleid/1060755542.html). </props>
    
    
    The following scenario, you cannot for the specified cloud create snapshot:
    
    -Cloud reserved manual snapshot reached 256.
    
    -On a snapshot also unfinished create.
    
    -Cloud mounted instance was never started.
    
    -Cloud mounted instance not in **has stopped** ("stopped") or **run in** ("running") state.
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    When you create a snapshot, you need to note:
    
    -New a cloud server ECS or replacement system disk about an hour before you can create a snapshot, add a data disk to create a snapshot time depends on the cloud the size of the data.
    
    -If you create a snapshot also unfinished, this snapshot cannot be used to create custom image ([CreateImage](~~ 25535 ~~)).
    
    -If cloud has been mounted ECS on an instance, during snapshot creation do not change the instance state.
    
    -Support in **expired** ("expired") State cloud create a snapshot. If when you create a snapshot cloud right up to expired release time, cloud released will also delete **create in** ("creating") snapshots.
    
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can set "instanceid" for instance in the specified cloud create snapshot consistency groups; Can also use only "diskid. n" for available area multiple ECS instance mounted multi-block cloud create snapshot consistency group.
    
    > "diskid. n" not and "excludediskid. n" set at the same time. In addition, if you set the "instanceid", the "diskid. n" can only set specified instance inner mounted cloud, no longer support setting multiple cross-instance cloud ID.
    
    Create a snapshot consistency group when, please note:
    
    -Stay-create a snapshot cloud must be in **in use**("In_use") or **stay Mount** ("available").
    
    -If cloud in **in use**("In_use") status you ECS instance state for **run in** ("running") or **has stopped** ("stopped").
    -If cloud in **stay Mount** ("available") status you need to guarantee cloud had to mount ECS instance history of operation. Never mount ever ECS instance cloud does not support creating snapshot.
    
    -Currently snapshot consistency group support only ESSD cloud.
    
    -A single snapshot consistency group includes up to 16 block cloud (including system disk and data plate), and total capacity no more than 32, TiB.
    
    -You create yourself snapshot remain, Please periodically delete no longer need snapshot, avoid snapshot capacity continuous buckle fee.
    
    -Open multiple mounting characteristics of cloud does not support creating snapshot consistency group. If the instance mounted open multiple mounting characteristics of cloud, you need to set up "excludediskid. n" parameter exclude the cloud.
    
    About snapshot of the consistency group function, billing, etc. information, please see [snapshot consistency group](~~ 199625 ~~).
     */
    @Override
    public CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDedicatedHostClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDedicatedHostClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * > The interface is closed beta testing in, not yet officially launched, temporarily not recommended, please wait patiently.
     */
    @Override
    public CompletableFuture<DeleteDemandResponse> deleteDemand(DeleteDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * Replication relationship only in **pause**("paused") state, you can remove. This interface only Delete replication relationship, not deleted main plate and from disk.
    
    Must be master geography Delete replication relationship after you delete from plate can mount, read, write, and expansion etc. operation.
     */
    @Override
    public CompletableFuture<DeleteDiskReplicaPairResponse> deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -The instance is under [security control](~~ 25695 ~~) and "OperationLocks" is marked with "LockReason ": "Security", even if the "DeleteWithInstance" attribute of the cloud disk is "false ", the system ignores this attribute and releases the disk.
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -The instance is under [security control](~~ 25695 ~~) and "OperationLocks" is marked with "LockReason ": "Security", even if the "DeleteWithInstance" attribute of the cloud disk is "false ", the system ignores this attribute and releases the disk.
     */
    @Override
    public CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Delete SSH key pair rear, you need to note:
    
    -Cannot pass [DescribeKeyPairs](~~ 51773 ~~) query the SSH key pair.
    
    -If have ECS instance binding the SSH key pair:
    
    -Alibaba Cloud no longer for you save the SSH key pair, but instance can use the SSH key pair.
    
    -Query instance information ([DescribeInstances](~~ 25506 ~~)), displays SSH key pair name (KeyPairName), but no longer display other relevant information.
     */
    @Override
    public CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -If the specified snapshot ID does not exist, request will be ignored.
    
    -If the snapshot has been used to create custom mirror, will not be able to perform the delete operation. You need to delete a created self-define the Mirror ([DeleteImage](~~ 25537 ~~)), to continue delete snapshot.
    
    -If the snapshot has been used to create cloud is not set "force" parameters or "force = false" when, can"t directly delete snapshot. If you are sure that you want to delete snapshot, please set "force = true" forced delete, snapshot quilt force delete after the corresponding cloud will not be able to perform re-initialized.
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    If the disk snapshot in the instance snapshot has been used to create a custom image, the relevant disk snapshots will not be deleted when the instance snapshot is deleted. If you want to delete a disk snapshot, delete the created custom image ([DeleteImage](~~ 25537 ~~), delete the disk snapshot ([DeleteSnapshot](~~ 25525 ~~)).
    
     */
    @Override
    public CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroup(DeleteSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    <props = "china">[register](https://account.aliyun.com/register/register.htm) an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, for more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "intl">[register](https://account.alibabacloud.com/register/intl_register.htm) an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, for more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "partner"> after you have registered an Alibaba Cloud account, you can create a certain number of ECS resources in different Alibaba cloud regions. For more information, for more information, see [limits](~~ 25412 ~~). </props>
    
    <props = "china"> You can also [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm) to increase the resource usage quota according to your needs. </props>
    
    <props = "intl"> You can also [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to increase the resource usage quota according to your needs. </props>
    
    <props = "partner"> You can also submit a ticket to increase the resource usage quota according to your needs. </props>
     */
    @Override
    public CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccountAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActivations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    The value of the "DestinationResource" parameter has different logic and requirements. In the following order list, order the lower the value of need to set more parameters, not supported by low-order value filters high order resource category.
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservationInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -The interface supports only classic network type instance.
    
    -Single most can only query 100 classic network type instance.
    
    -Parameter "vpcid" and "instanceid" cannot both be empty.
     */
    @Override
    public CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClassicLinkInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudAssistantStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    > Exclusive block storage cluster functionality currently supports South China 2 (Heyuan), Indonesia (Jakarta) and financial cloud south China 1 (Shenzhen) geographical.
    
    -Request parameters are similar to a filter. The filter is a logical AND (AND) relationship. If a parameter is empty, the filter does not work.
    
    -We recommend that you use the MaxResults and NextToken parameters to query data by page. Note: When querying the homepage by page, you only need to set the MaxResults to limit the number of entries returned. The NextToken in the returned results are used as the credentials for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken obtained from the last returned result as the query credential, and set the MaxResults to limit the number of returned entries.
    
     */
    @Override
    public CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedBlockStorageClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostAutoRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDemands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSetSupportedInstanceTypeFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    To query cloud practical information includes read IOPS, write IOPS, read bandwidth (B/s), write bandwidth (B/s), read delay (μ s) and write latency (μ s).
    
    When you call this operation, note that:
    
    -Can only query status is in use ("In_Use ") cloud usage information. For more details, please see [ordinary cloud status table](~~ 25689 ~~).
    
    > If the query information appears in the content missing, because cannot get time the use of information, that cloud state is not in use ("In_Use ").
    
    -A maximum returns 400 strip data, the specified "(EndTime-StartTime)/period" cannot exceed 400.
    
    -A most multi-can query near within 30 days monitoring information, the specified parameter "starttime" cannot exceed 30 days.
     */
    @Override
    public CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -The request parameter "DiskIds" is an Array in JSON format. If the parameter is empty, the filter does not work. However, if "DiskIds" is an empty Array, the filter is considered to be valid, and return null.
    
    -You can view the returned data in either of the following ways:
    -Method 1: Use "NextToken" to set the Token. The value is the value of the "NextToken" parameter returned DescribeDisks the last call. Then, use "maxresule" to set the maximum number of entries to query on a single page.
    -Method 2: Set the number of entries returned on a single page by "PageSize", and then set the page number by "pagenumerber.
    
    You can select either of the preceding methods. If a large number of entries are returned, we recommend that you use method 1. If "NextToken" is set, the request parameters "PageSize" and "pagenumerber" are invalid, and the "TotalCount" in the returned data is invalid.
    
    -A cloud disk with multiple mount features can be attached to multiple instances. You can view all the mount information of the cloud disk based on the "Attachment" list in the returned result.
    
    When calling an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with the format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
    
     */
    @Override
    public CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisksFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssuranceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssurances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    The traffic information of the secondary Eni can be queried, including the number of packets sent and received by the secondary Eni, inbound and outbound traffic over the internal network, and the number of packets lost and received by the secondary Eni. When the returned information is missing, the system may not obtain the corresponding information. For example, if the instance is in the Stopped (Stopped) state or the secondary Eni is not attached to the instance, the instance is in the Available (Available) state, and the corresponding information cannot be obtained. When you call this operation, note that:
    
    -A maximum of 400 monitoring data records can be returned at a time. If the specified parameter (EndTime-StartTime)/Peroid is greater than 400, an error is returned.
    
    -You can query the monitoring information in the last 30 days at a time. If the specified parameter StartTime more than 30 days, an error is returned.
     */
    @Override
    public CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEniMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeForwardTableEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHaVips").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHpcClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageFromFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can set "nexttoken" query credentials (Token), its value is the last call "describeimagepipelines" returned "nexttoken" parameter value, through "maxresults" settings leaflet query maximum entries for queries.
     */
    @Override
    public CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImagePipelines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSupportInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Private pool is elastic security services or capacity reservation service after creation generated, associated with private pool matching instance information. You can create an instance set private pool, instance will be and elastic security services or capacity scheduled service to match.
    
    When private pool after failure, instance and private pool match associated data will also be failure. The call the interface, return value private pool information will be empty.
     */
    @Override
    public CompletableFuture<DescribeInstanceAttachmentAttributesResponse> describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Only supports query not due annual commitment monthly ECS instance L with price information, not supported query instance drop with price information.
    
    -No support for query quantity pay ECS instance variable with when price information. Because quantity pay ECS instance variable with after the price of the new instance price consensus, so you can directly call [DescribePrice](~~ 107829 ~~) query ECS instance latest prices.
    
    -Instance L with front recommended that you call [DescribeResourcesModification](~~ 66187 ~~) query specifies the available area May with an instance of the dimension information.
    
     */
    @Override
    public CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceModificationPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Every time returns at most 400 strip monitoring data, if the specified parameter "(EndTime-StartTime)/period" is greater than 400, an error is returned information.
    
    -Single most multi-can query near within 30 days monitoring information, if the specified parameter "starttime" more than 30 days, an error is returned information.
    
    -When return information is missing in the part content, the system may be not get to the corresponding information. For example, was instance is Stopped (Stopped) state.
     */
    @Override
    public CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Pass Alibaba Cloud CLI call API when different data type of request parameters must follow the format requirements, details please see [CLI parameter format description](~~ 110340 ~~).
     */
    @Override
    public CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypeFamilies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    -Recommended you set MaxResults and NextToken parameter paging query. Specific use Description: First call the interface when you set MaxResults parameters to limit the return value in example dimension of entries, if a call just returned part quilt query to an instance of the dimension of entries is synchronous returns NextToken parameter value. Once again, you can call the interface, set the last call the interface returned NextToken parameter values, and MaxResults parameter to implement paging query instance dimension information.
    
    -DescribeInstanceTypes only query instance dimension configuration and performance information. If you need to query specific geographical can buy an instance of dimension, use the [DescribeAvailableResource](~~ 66186 ~~).
    
    -If you need to use non-sale visible instance dimension or special requirements, please [submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) contact Ali Cloud.
    
    </props>
    
    <props="intl">
    -Recommended you set MaxResults and NextToken parameter paging query. Specific use Description: First call the interface when you set MaxResults parameters to limit the return value in example dimension of entries, if a call just returned part quilt query to an instance of the dimension of entries is synchronous returns NextToken parameter value. Once again, you can call the interface, set the last call the interface returned NextToken parameter values, and MaxResults parameter to implement paging query instance dimension information.
    
    -DescribeInstanceTypes only query instance dimension configuration and performance information. If you need to query specific geographical can buy an instance of dimension, use the [DescribeAvailableResource](~~ 66186 ~~).
    
    -If you need to use non-sale visible instance dimension or special requirements, please [submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) contact Ali Cloud.
    
    </props>
    
    <props="partner">
    -Recommended you set MaxResults and NextToken parameter paging query. Specific use Description: First call the interface when you set MaxResults parameters to limit the return value in example dimension of entries, if a call just returned part quilt query to an instance of the dimension of entries is synchronous returns NextToken parameter value. Once again, you can call the interface, set the last call the interface returned NextToken parameter values, and MaxResults parameter to implement paging query instance dimension information.
    
    -DescribeInstanceTypes only query instance dimension configuration and performance information. If you need to query specific geographical can buy an instance of dimension, use the [DescribeAvailableResource](~~ 66186 ~~).
    
    </props>
     */
    @Override
    public CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Management Terminal address is valid for 15 miao, call interface after successful if 15 miao inner don"t use this link URL address automatic failure, you need to re-query.
    
    -A single management Terminal Link **lasting link**(KeepAlive) time for 60 miao, 60 miao in-you Management terminal window no interaction operation when Connection automatically disconnected.
    
    -If the connection breaks, per minute reconnect within the number of not more than 30 times.
    
    -You need to link "https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html? "Added at the end of the "vncurl =**** ", "instanceid =**** and "iswindows = true", "iswindows = false" and "password =**** ", parameter between use" & "connection. Where:
    
    -Parameter "vncurl": Call Interface after successful Will returned "vncurl" value.
    
    -Parameter "instanceid": your instance ID.
    
    -Parameter "iswindows": the instance operation whether System is Windows system. Value for "true" said is Windows system, value for "false" said not Windows system.
    
    -(Optional) parameter "password": the instance remote connection password, six numbers or case letters. Use this parameter when in connection management terminal where you don"t need to enter a password.
    
    Request example as follows:
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstancesFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplateVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeManagedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfacePermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNewProjectEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhysicalConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Request parameters "addressfamily", "prefixlistid. n" AND "prefixlistname" similar to filter for logic AND (AND). If a parameter is empty, the filter does not work.
     */
    @Override
    public CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRecommendInstanceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRenewalPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourcesModification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouterInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupReferences").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Before calling an API, note the following:
    
    -The basic information of a security group includes the security group ID and security group description. The returned parameters are sorted in descending order by security group ID.
    
    -We recommend that you use the MaxResults and NextToken parameters to query data by page. Note: When querying the homepage by page, you only need to set the MaxResults to limit the number of entries returned. The NextToken in the returned results are used as the credentials for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken obtained from the last returned result as the query credential, and set the MaxResults to limit the number of returned entries. If the NextToken in the returned result is empty, the page is the last page and no subsequent pages exist.
    
    -When calling an API through Alibaba Cloud CLI, the request parameter values of different data types must comply with certain format requirements. For more information, see [CLI parameter format description](~~ 110340 ~~).
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSendFileResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Request parameters "regionid", "diskids" and "instanceid" etc. act as a filter function, parameters is logic and relationships.
    
    -If you don"t specify any parameters, the filter does not work. When "diskids" and "snapshotlinkids" are empty array, same as the filter effective, but the return result is empty.
     */
    @Override
    public CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotLinks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Every time returns at most 400 strip monitoring data, if the specified parameter "(EndTime-StartTime)/period" is greater than 400, an error is returned.
    
    -Single most multi-can query near within 30 days monitoring information, if the specified parameter "starttime" more than 30 days, an error is returned.
     */
    @Override
    public CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * If you want to know the current geographical lower each disk snapshot use, recommended [DescribeSnapshotLinks](~~ 55837 ~~) query snapshot chain.
     */
    @Override
    public CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotsUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You can pass the interface query preemptive instance near 30 day information, facilitate you reasonable select preemptive instance specifications. Support the query information include:
    -Instance average release rate.
    -Instance average discount rate.
    -Pass discount rate calculated average price.
    
    -Only supports query proprietary network VPC, I/O optimization preemptive instance.
    
    -You can pass in any of the following ways query preemptive instance near 30 days of information:
    -Set "cores", "memory" two-parameter or "mincores", "minmemory" two parameters, query matching vCPUs and memory requirements instance dimension information.
    -Set "instancetypes. n" query the specified instance dimension information.
    -Set "cores", "memory" two-parameter or "mincores", "minmemory" two parameters rear, set again "instancetypefamily" or "instancefamilylevel", query an instance dimension family or a certain level in, meet vCPUs and memory requirements instance dimension information.
     */
    @Override
    public CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotAdvice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotPriceHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageCapacityUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSetDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTaskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRoutersForPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    DescribeZones query only Alibaba cloud the available area list and return a small inventory information. If you need to query specific available area under Buy instance of the specifications and cloud dimension, recommend you use [DescribeAvailableResource](~~ 66186 ~~).
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Cloud must already be mounted on an instance, status is in use ("In_Use ").
    
    -Unload data plate when the mounted instance must be in the **run in** ("running") or **has stopped** ("stopped") state.
    
    -Unload system disk when the mounted instance must be in the **has stopped** ("stopped") state.
    
    -The Mount instance safety control rear, "operationlocks" in can"t mark as "LockReason": "security""s lock status.
    
    -DetachDisk is asynchronous call interface after successful wait a minute left and right for the Uninstall to complete.
     */
    @Override
    public CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Do not allow separation instance main network card.
    
    -Elastic network card must be in unbundling in (Detaching) or bound (InUse) state.
    
    -Instance must be Running in (Running) or Stopped (Stopped) state.
     */
    @Override
    public CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillParams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipNotifyPaid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnablePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Export mirror front:
    
    -You need to first understand premise conditions and small print. More information, please see [export Mirror](~~ 58181 ~~).
    
    -You must pass RAM authorized cloud server ECS write OSS permissions. Specific operation as follows:
    
    1. Create role: "aliyunecsimageexportdefaultrole" (any other role name is invalid), for the role set the following role policies:
    
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
    
    2. In the role "aliyunecsimageexportdefaultrole" join the default system permission policy: "aliyunecsimageexportrolepolicy", the strategy is cloud server ECS provides export mirror default policy. For more details, please see [cloud resources access authorization](https://ram.console.aliyun.com/? spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize? request =%7B% 22requests% 22:%20% 7B%22 request1%22:%20% 7B% 22rolename% 22:%20% 22aliyunecsimageimportdefaultrole% 22,%20% 22templateid% 22:%20% 22ecsimportrole% 22% 7D,%20% 22 request2%22:%20% 7B% 22rolename% 22:%20% 22aliyunecsimageexportdefaultrole% 22,%20% 22templateid% 22:%20% 22ecsexportrole% 22% 7D%7D,%20% 22returnurl% 22:%20% 22https:%2F%2Fecs.console.aliyun.com%2F%22,%20% 22service% 22:%20% 22ECS%22% 7D). You can also create a custom policy, permissions need to include:
    
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
    
    Export after mirror:
    
    Custom image will be saved in the specified OSS bucket in the, you can download custom image. Specific operation, see [download custom image file](~~ 31912 ~~).
     */
    @Override
    public CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Cloud server ECS is virtualization cloud service, cannot access display equipment, also cannot manually screenshots. However, Alibaba Cloud caches the system command output when the instance was last started, restarted, or shut down. You can call the GetInstanceConsoleOutput to obtain the output.
    
    -[Phased-out instance types](~~ 55263 ~~) cannot obtain system command output.
    
    -Windows instance does not support obtaining system command line output.
     */
    @Override
    public CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceConsoleOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceScreenshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You must advance Upload image file to an object storage OSS. Specific operation, see [Upload file](~~ 31886 ~~).
    
    -First-time import mirrored when, you must in advance by access control RAM authorized ECS access your OSS Bucket, otherwise will error "nosetroletoecsserviceacount ". You can pass RAM management console one click authorized operation, specific authorization page, see [cloud resources access authorization](https://ram.console.aliyun.com/? spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize? request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS% 22% 7D). You can also manually completed licensing operation, part in the operation strategy and permissions are as follows. Specific operation, see [account access control](~~ 25481 ~~).
    
    1. Create a role "aliyunecsimageimportdefaultrole" (must be is this the name, or the import mirror will failed), the role of strategy:
    
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
    
    2. In the under the role, add system policy "aliyunecsimageimportrolepolicy ". You can also create a custom policy, permissions must contain:
    
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
    -Cannot delete is the imported image, can only call [CancelTask](~~ 25624 ~~) cancel import mirror task.
    
    -Import mirrored geographical must with mirror of the file upload OSS Bucket geographical same.
    
    -Parameter "diskdevicemapping. n" of N in value range is 1~17. N is 1 indicates the system disk N 2~17 said data plate.
    
    -When the parameter "architecture" value for "arm64", or parameter "platform" value for "centos stream", "anolis", "almalinux" or "rocky linux" when you need to note:
    
    -To make after import mirroring support configuration password or support modify the key pair, mirror must meet the following conditions:
    
    -Operating system kernel needs to support "CONFIG_FW_CFG_SYSFS "attribute. Linux community Kernel 4.6 version after default support this feature, CentOS kernel in 3.10.0-826.el7 version after default support this feature. You can the mirror the corresponding server running within "grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r) Command, if echo in the results contain "CONFIG_FW_CFG_SYSFS = y" information, is the mirror in the kernel has support "CONFIG_FW_CFG_SYSFS" attribute.
    
    -Operating system installed in Alibaba cloud the latest version cloud-init. Of which, 19.1 version cloud-init must 19.1.3 version and above, partial low version in the operating system 0.7.6a version cloud-init must 0.7.6 a15 version and above. Specific operation, see [mounting cloud-init](~~ 57803 ~~).
    
    -Operating system needs to support SHA-512 encryption algorithm.
    
    -To make after import mirroring support expansion cloud and expansion file system, mirror must meet the following conditions:
    
    -The kernel version of the operating system need than version 3.6.
    
    -Support growpart command. Support the command need to install "cloud-utils-growpart" bag, different operating system installation differently. Specific operation, see [extended partition and file system _linux system disk](~~ 111738 ~~).
    
    -Support resize2fs command. Support the command need to install "e2fsprogs" package, the package in the operating system installed by default, if no installation you need to install themselves.
    
    -Operating system installed in Alibaba cloud the latest version cloud-init. Of which, 19.1 version cloud-init must 19.1.3 version and above, partial low version in the operating system 0.7.6a version cloud-init must 0.7.6 a15 version and above. Specific operation, see [mounting cloud-init](~~ 57803 ~~).
     */
    @Override
    public CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You in each geographical key logarithmic up to 500 pair.
    
    -The imported key pair must support any of the following encryption:
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call InstallCloudAssistant interface after call [RebootInstance](~~ 25502 ~~), cloud assistant client to take effect.
     */
    @Override
    public CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallCloudAssistant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    -In a Alibaba Cloud geographical lower, you every day can call 5000 times InvokeCommand interface. [Submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) can apply for adjusting call count quota.
    
    -Target ECS instance with the following restrictions. Selected multiple ECS instance, if one of the table instance does not meet the conditions for implementation, you need to re-call interface.
    
    -Network type is [proprietary network VPC](~~ 34217 ~~).
    
    -Status must be run in the ("running").
    
    -Pre-installed [cloud assistant client](~~ 64921 ~~).
    
    -Perform type for PowerShell when the command, instance must have configured PowerShell module.
    
    -Single execution ("timed = false"), only executed once command.
    
    -Cycle ("timed = true"):
    
    -According to parameter "frequency" specified time frequency timing implementation, the last execution results wrong next execution have any impact.
    
    -Time set datum to UTC +0, and the time to instance system time shall prevail. Please ensure that ECS instance time or time zone with you the expected time consistent. More about time zone of the details of the, Linux instance see [settings Linux instance time zone and NTP Services](~~ 92803 ~~), windows instance see [set Windows instance NTP service](~~ 51890 ~~).
    
    -Command execution May because the target instance state exception, network anomaly or cloud assistant client exception appears cannot perform the cannot be performed when not generated execution information.
    
    -When you create command enabled when custom parameter function, need while executing the command incoming custom parameter ("parameters").
    
    </props>
    
    <props="intl">
    -In a Alibaba Cloud geographical lower, you every day can call 5000 times InvokeCommand interface. [Submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) can apply for adjusting call count quota.
    
    -Target ECS instance with the following restrictions. Selected multiple ECS instance, if one of the table instance does not meet the conditions for implementation, you need to re-call interface.
    
    -Network type is [proprietary network VPC](~~ 34217 ~~).
    
    -Status must be run in the ("running").
    
    -Pre-installed [cloud assistant client](~~ 64921 ~~).
    
    -Perform type for PowerShell when the command, instance must have configured PowerShell module.
    
    -Single execution ("timed = false"), only executed once command.
    
    -Cycle ("timed = true"):
    
    -According to parameter "frequency" specified time frequency timing implementation, the last execution results wrong next execution have any impact.
    
    -Time set datum to UTC +0, and the time to instance system time shall prevail. Please ensure that ECS instance time or time zone with you the expected time consistent. More about time zone of the details of the, Linux instance see [settings Linux instance time zone and NTP Services](~~ 92803 ~~), windows instance see [set Windows instance NTP service](~~ 51890 ~~).
    
    -Command execution May because the target instance state exception, network anomaly or cloud assistant client exception appears cannot perform the cannot be performed when not generated execution information.
    
    -When you create command enabled when custom parameter function, need while executing the command incoming custom parameter ("parameters").
    
    </props>
    
     */
    @Override
    public CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Resources is your Alibaba Cloud create cloud services entity, for example, a ECS instance, an ECS elastic network card or a ECS mirror, etc. can be resources. Resource Group is project, environment or stack infrastructure collection, in the resource group management resources can centralized monitoring and perform tasks, eliminates in the multi Alibaba Cloud services repeatedly see burden.
     */
    @Override
    public CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    > This API is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~ 25503 ~~) API to add or remove an ECS instance from a security group. Call the [ModifyNetworkInterfaceAttribute](~~ 58513 ~~) API to remove an ENI (ENI) add or remove a security group.
    
    When you call this operation, note that:
    
    -Join the security group before instance must be in the **has Stopped**(Stopped) or **run in**(Running) state.
    
    -A instance you can add up to five security group.
    
    -<props = "china"> You can [submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) application for instance add more security group, cannot exceed 16 a security group. </props>
    
    -<props = "intl"> You can [submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) application for instance add more security group, cannot exceed 16 a security group. </props>
    
    -Each ordinary security group the most multi-can Management 2000 table instance, enterprise security group the most multi-can Management 65536 table instance.
    
    -Your Security Group and instance must belong to the same Alibaba Cloud geographical.
    
    -Your Security Group and instances network must be the same type. If the network type proprietary network VPC, the security group and instance must belong to the same VPC.
    
    -Does not support also the instance and elastic network card join a security group-the parameter "instanceid" and "networkinterfaceid" can"t value.
     */
    @Override
    public CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    > This API is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~ 25503 ~~) API to add or remove an ECS instance from a security group. Call the [ModifyNetworkInterfaceAttribute](~~ 58513 ~~) API to remove an ENI (ENI) add or remove a security group.
    
    
    When you call this operation, note that:
    
    -Before removing a security group, the instance must be in the **Stopped**(Stopped) or **Running**(Running) status.
    
    -An instance must be added to at least one security group. If the instance is added to only one security group, LeaveSecurityGroup request fails.
    
    -You cannot remove an instance and an Eni from the same security group at the same time, that is, you cannot pass values for the "InstanceId" and "NetworkInterfaceId" parameters at the same time.
     */
    @Override
    public CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LeaveSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    In the request at least specify any of the following parameters to determine query object.
    
    -"resourceid. n"
    -"tag. n" ("tag. N. key" and "tag. N. value")
    -"tagfilter. n"
    
    Specify both parameter when the following return results contains only meet both conditions ECS resources.
    
    -"tag. n" and "resourceid. n"
    -"tagfilter. n" and "resourceid. n"
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Modify elastic supply set front, please note:
    
    -If you modify the supply group capacity or capacity related settings, supply group in modification completed, do a scheduling tasks.
    
    -If Supply Group is deleted in the state, cannot modify supply group.
     */
    @Override
    public CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Modify CPU oversold ratio, proprietary on the host ECS instance must be stopped ("stopped") state.
    -Modify CPU oversold than does not affect DDH running state, for small DDH in assigned number of VCPUs cannot exceed the modified total number of VCPUs, otherwise to the excess ECS instance will not start.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    Reach the set automatic release time after quantity pay proprietary host opportunity automatically released. Please ensure that you no longer use the host and has demand backup application data.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -When your annual commitment monthly proprietary host open auto-renewal after due nine days before will automatically renew buckle fee at 08:00:00(UTC +8) time point automatically. If the previous ri kou fee failed, the next day to continue timing implementation. Buckle fee success or nine days after proprietary host due locked after stop automatic buckle fee. During, you need to ensure that their payment use amount adequate.
    
    -Annual commitment monthly proprietary host Support Follow host inside the annual commitment monthly ECS instance automatic renewals. More information, please see AutoRenewWithEcs parameter description.
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostsChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    You can pass the interface modify instance dimension demand information, Alibaba Cloud according to your needs Form supply related resources.
    Only supports report I/O optimization instance dimension, and proprietary network VPC type of ECS instance.
    Only in rejected status, can modify except "demandname", "demanddescription" the other parameters.
    
    > The interface is closed beta testing in, not yet officially launched, temporarily not recommended, please wait patiently.
     */
    @Override
    public CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDeploymentSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -When you invoke the interface when set not instance release (DeleteWithInstance = false) property, once disk mounted ECS instance safety locked and OperationLocks marked in. ""LockReason" : "security"" the lock status of the, release instance ignored when disk DeleteWithInstance property was also released.
    
    -You can call "diskids. n" parameter bulk modify multi-a block storage name, description, whether with instance release etc. properties.
     */
    @Override
    public CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    <props = "china"> Please ensure that use the interface front, you have fully understand cloud billing way and [prices](https://www.aliyun.com/price/product#/disk/detail). </props>
    
    Call the interface complete the following actions when you need to note:
    
    * Modify ESSD cloud performance levels:
    
    -Annual commitment monthly ESSD Cloud supports only upgrade performance level.
    
    -Quantity pay ESSD cloud support upgrade and reducing performance level, but does not support drop with to PL0.
    
    -ESSD cloud the status must be **in use**(In_Use) state or **stay Mount**(Available) state.
    
    -If ESSD cloud has been mounted ECS on an instance, instance must be in the **run in**(Running) state or **has Stopped**(Stopped) state, ECS instance cannot is expired or account arrears state.
    
    -Because ESSD cloud performance level by capacity limit, if you cannot upgrade performance levels, can Expansion ([ResizeDisk](~~ 25522 ~~)) after the operation again. More information, please see [ESSD cloud](~~ 122389 ~~).
    
    * Change a cloud types of small print, please see [change cloud type](~~ 161980 ~~) restrictions in the chapter.
    
    * <props = "china"> open multiple mounting characteristics of cloud does not support cloud variable. </props>
    
    Call Interface rear, new cloud type take effect immediately, Alibaba Cloud under the new cloud type and cloud performance levels unit price calculation consumption bill.
    
     */
    @Override
    public CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEipAddressAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHaVipAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHpcClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageShareGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You can only share your own custom mirror to other Alibaba Cloud users.
    
    -Significant critical numbers self-define the mirror up to sharing to 10 Alibaba cloud account. So, parameter AddAccount.n or parameter RemoveAccount.n single maximum incoming 10 Alibaba Cloud account, more than 10 account system ignores the parameters.
    
    -<props = "china"> significant critical numbers self-define the mirror up can be shared 50 Alibaba cloud account. You can [submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) application shared to more users. </props>
    
    -<props = "intl"> significant critical numbers self-define the mirror up can be shared 50 Alibaba cloud account. You can [submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex)</props> Application shared to more users. </props>
    
    -Use shared mirror create the ECS instance ([RunInstances](~~ 63440 ~~)) rear, once the custom Mirror owner release mirror shared relationship, or deleted a custom mirror ([DeleteImage](~~ 25537 ~~)), the instance will be unable to initialize system disk ([ReInitDisk](~~ 25519 ~~)).
     */
    @Override
    public CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Private pool is elastic security services or capacity reservation service after creation generated, associated with private pool matching instance information. You can create an instance set whether to use the private pool start, instance will be and elastic security services or capacity scheduled service to match.
    
    -Call the interface modify instance private pool properties of the rear, instance does not need to restart.
    -When you call the following interface, system will re-match instance private pool. If the instance have matched the specified private pool, May private with pool capacity has run out or private pool failure reasons such as call failed. If call failed the problem, please first call ModifyInstanceAttachmentAttributes interface private pool match pattern modify for "open ".
    -StartInstance restart enable save shutdown mode instance
    -ReActivateInstances
    -ModifyInstanceChargeType
    -ModifyPrepayInstanceSpec
    -ReplaceSystemDisk
     */
    @Override
    public CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Query ECS instance information when, if returns the data contains the "{" OperationLocks ": {" LockReason " : " security "}}" is prohibited all operation.
    
    Call the interface complete the following actions when you need to note:
    
    -Modify host name ("hostname"): restart after an instance, modify entry into force, and must be [in ECS console restart](~~ 25440 ~~) or call API [RebootInstance](~~ 25502 ~~) restart, new host name to take effect. Operating system internal restart can"t take effect.
    
    -Reset password ("password"):
    
    -Instance state can"t for **Start in** ("starting").
    
    -Restart the instance after reset entry into force, and must be [in ECS console restart](~~ 25440 ~~) or call API [RebootInstance](~~ 25502 ~~) restart, new password to take effect. Operating system internal restart can"t take effect.
    
    -Modify custom data ("userdata"):
    
    -Instance status must be **has stopped** ("stopped").
    
    -Instance must meet custom data use restrictions. Details please see [generate instance Custom Data](~~ 49121 ~~).
    
    -Replacement instance Security Group ("securitygroupids. n"):
    
    -Support switch security group type.
    
    When ECS instance cross-type switch security group, you need to fully understand the two security group rules configuration difference, avoid affecting instance network.
    
    -No support for classic network type instance.
    
    Other small print see "securitygroupids. n" The parameter description.
    
    -Modify the primary card number of queues ("networkinterfacequeuenumber"):
    
    -Instance must be stopped ("stopped") state.
    
    -The maximum number of queues per Nic allowed by the instance type.
    
    -The number of accumulated queues for all NICs of an instance cannot exceed the total number of queues allowed by the instance type. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the maximum number of queues and total quotas of an Eni.
    
    -When value is -1 when will reset the primary card queue number corresponding instance dimension default values. Instance dimension elastic network card default number of queues can pass [DescribeInstanceTypes](~~ 25620 ~~) interface query "primaryeniqueuenumber" field.
     */
    @Override
    public CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -<props = "china"> fees are automatically deducted by default after the billing method is changed. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, parameters can be "autopay" set "false", generated normal not payment order, you can log on to [ECS management console](https://ecs.console.aliyun.com/) payment. </props>
    
    -<props = "intl"> replacement billing rear, default automatic buckle fee. You must ensure that your account balance is sufficient. Otherwise, an abnormal order will be generated. In this case, you can only cancel the order. If your account balance is insufficient, parameters can be "autopay" set "false", generated normal not payment order, you can log on to [ECS management console](https://ecs.console.aliyun.com/) payment. </props>
    
    -**Annual commitment monthly to quantity pay * *:
    
    -Whether support annual commitment monthly to quantity pay function, is based on your cloud server with use.
    
    -Annual commitment monthly instance to quantity instance when new billing will override instance of the entire life cycle. You will receive before and after modification instance of billing price difference of refund, refunded to your original payment channels, used voucher will not be returned.
    
    -**Refund rules**: you a month can free operation refund amount is limited and not cumulative, consumption after refund amount rear, can only wait for the following month conversion billing. A conversion billing consumption refund amount formula for **vCPU number * (refund number of days * 24 ± floating hours) * *.
    
    -**Quantity pay to annual commitment monthly * *:
    
    -Support the instance mounted all quantity pay data disk simultaneous conversion for annual commitment monthly data plate.
    
    -If quantity pay instance has already been set release time, you cannot call the interface.
    
     */
    @Override
    public CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Migration ECS instance to proprietary host, or migrating instance change at the same time ECS instance specifications, the following conditions must be met:
    
    -ECS instance must be in the **has Stopped**(Stopped) state, after migration instance automatically restart.
    
    -Only support proprietary network VPC type of ECS instance.
    
    -ECS instance with proprietary host must belong to the same account number, the same region and available area.
    
    -Quantity pay ECS instance can be migrated to annual commitment monthly proprietary on host. Annual commitment monthly ECS instance can only be in annual commitment monthly proprietary host between migration, and instance expiration time cannot exceed target proprietary the host expiration time.
    
    -Will ECS instance from sharing host migration to proprietary host when instance billing only way is quantity pay, not supported annual commitment monthly instance and preemptive instance.
    
    -ECS instance can specify proprietary host cluster re-deployment.
     */
    @Override
    public CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Modify instance maintenance strategies, policy contains two maintenance property.
    
    -Maintenance window: you specified period of time, operations will only within this time.
    
    -Maintenance action: you the specified instance downtime processing policy.
     */
    @Override
    public CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMetadataOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceNetworkSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    More about resources become with the Python SDK EXAMPLE information, please see [query available variable with resources](~~ 109517 ~~).
    
    When you call this operation, note that:
    
    -Account must be in no arrears state.
    
    -Instance status must be **run in** ("running") or **has stopped** ("stopped") when adjusting public network bandwidth size.
    
    -Upgrade or reduce quantity pay instance dimension front, you can pass [DescribeResourcesModification](~~ 66187 ~~) query the current instance supports variable with an instance of the specifications.
    
    -Instance status must be **has stopped** ("stopped") when to change the instance specifications.
    
    -Single can only upgrade individual configuration, the single can only modify instance dimension, or can only adjust public network bandwidth size.
    
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. The specific speed limiting policy is as follows:
    -In a single region, the total actual peak bandwidth of all ECS instances billed by traffic cannot exceed 5 Gbit/s.
    -In a single region, the total actual peak bandwidth of all ECS instances that are billed by fixed bandwidth cannot exceed 50 Gbit/s.
     */
    @Override
    public CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Password length must be six characters, must and can contain only uppercase, lowercase letters and Arab Digital three characters.
    
    -Modify password rear:
    
    -I/O optimization instance, effective immediately, without restarting the instance.
    
    -Non-I/O optimization instance, need to console [restart the instance](~~ 25440 ~~) or call API [RebootInstance](~~ 25502 ~~) to take effect.
     */
    @Override
    public CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call Interface when ECS instance status must be **has stopped** ("stopped").
    
    -When you use the interface modify instance private network IP ADDRESS or virtual switch, please note:
    
    -New ECS instance must be after restart to call the interface.
    -Success modified once rear, ECS instance must be after restart to continue call the interface.
    
    -When you use the interface modify instance proprietary network VPC when, please note:
    
    -**Instance: * *
    -No support has been associated with load balancing instance ECS instance.
    -The State of the instance cannot be locked, wait for release, expired, expired recycling in, arrears recycling. More information, please see [instance lifecycle introduced](~~ 25380 ~~).
    -Instance cannot be in other in cloud service is used. For example, instance cannot be in a migration, can"t have replacement VPC or instance deployed within the database can"t be DTS service management.
    
    -**Network: * *
    -Does not support configuration. EIP network card visible mode or multi-EIP network card visible mode instance.
    -Does not support binding High available virtual IP (havip) instance.
    -No support for switch binding custom of the routing table instance.
    -No Support opened accelerate global (GA) instance.
    -Does not support binding secondary network card instance.
    -Does not support assigned IPv6 address instance.
    -No support for main network card with multi-IP instance.
    -Incoming virtual switch must belong to target VPC.
    -Modify front and rear virtual switch available area must be consistent.
    -If you specify the primary card private network IP, the IP must be virtual switch address segment in-and available. If you do not specify the random distribution, and the target virtual switch available IP number of adequate.
    -If the target VPC open advanced network characteristics, attention is required part instance dimension family does not support this feature. More information, please see [does not support VPC high-order instance of the attribute dimension family](~~ 163466 ~~).
    -Target VPC the owner of the account (resource owner), cannot be the target VPC shared with other account (resource user) use.
    
    -**Security Group (SecurityGroupId.N):* *
    -Security group list must be of the same type.
    -Security Group quotas and instance can add security group restrictions. More information, please see [use restrictions](~~ 25412 ~~).
    -Security Group belongs VPC must be target VPC consistent.
    -Support switching security the type of group.
    When ECS instance cross-type switch security group, you need to fully understand the two security group rules configuration difference, avoid affecting instance network. More information, please see [Security Group Overview](~~ 25387 ~~).
     */
    @Override
    public CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLaunchTemplateDefaultVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Current call ModifyManagedInstance interface supports only modify one managed the name of the instance.
     */
    @Override
    public CompletableFuture<ModifyManagedInstanceResponse> modifyManagedInstance(ModifyManagedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPhysicalConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    -Specified CIDR address block should be standard form. For example, 10.0.0.0/8 is the correct form of CIDR address block, and 10.0.0.1/8 is wrong form. More information, please see [what is CIDR](https://help.aliyun.com/knowledge_detail/40637.html#section-jua-0tj-q5m).
    
    -Add or delete entry, you cannot specify duplicate CIDR address block. Example:
    -For IPv4 CIDR address block: cannot specify both two CIDR address block are 10.0.0.0/8 entry; Cannot be specified at the same time two CIDR address block respectively 10.0.0.1/32 and 10.0.0.1 entries, the two address blocks are the same.
    -For IPv6 CIDR address block: cannot specify both two strip objective to CIDR address block respectively 2001:fd01:0:0:0:0:0:0:0:0/32 and 2001:fd01::/32. The two address blocks are the same.
    
    -Add strip objective to CIDR address block can"t and delete strip objective to CIDR address block repeat. For example, you add a CIDR address block for 10.0.0.0/8 entry, can"t be deleted entry includes the CIDR address block 10.0.0.0/8.
    
    -If you need to modify strip objective to describe, need to specify strip objective to CIDR address block ("addentry. N. cidr") and the new description information ("addentry. N. description").
    
    </props>
    
    
    <props="intl">
    -Specified CIDR address block should be standard form. For example, 10.0.0.0/8 is the correct form of CIDR address block, and 10.0.0.1/8 is wrong form. More information, please see [what is CIDR](https://www.alibabacloud.com/help/doc-detail/40637.htm#section-jua-0tj-q5m).
    
    -Add or delete entry, you cannot specify duplicate CIDR address block. Example:
    -For IPv4 CIDR address block: cannot specify both two CIDR address block are 10.0.0.0/8 entry; Cannot be specified at the same time two CIDR address block respectively 10.0.0.1/32 and 10.0.0.1 entries, the two address blocks are the same.
    -For IPv6 CIDR address block: cannot specify both two strip objective to CIDR address block respectively 2001:fd01:0:0:0:0:0:0:0:0/32 and 2001:fd01::/32. The two address blocks are the same.
    
    -Add strip objective to CIDR address block can"t and delete strip objective to CIDR address block repeat. For example, you add a CIDR address block for 10.0.0.0/8 entry, can"t be deleted entry includes the CIDR address block 10.0.0.0/8.
    
    -If you need to modify strip objective to describe, need to specify strip objective to CIDR address block ("addentry. N. cidr") and the new description information ("addentry. N. description").
    
    </props>
    
     */
    @Override
    public CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Upgrade or reduce annual commitment monthly instance dimension front, you can pass [DescribeResourcesModification](~~ 66187 ~~) query the current instance supports variable with an instance of the specifications. Details see Python SDK EXAMPLE [query ECS VARIABLE with the available resources practice](~~ 109517 ~~).
    
    When you call this operation, note that:
    
    -Expired instance cannot modify instance dimension, you can renew after the operation again.
    
    -Reduce instance dimension when you need to note:
    
    -Instance must be in the **has stopped** ("stopped") state.
    -You must specify operation type, that "operatortype = downgrade ".
    -Each instance reduce configuration number can"t more than three times the price difference refunds will not be more than three times. Reduce configuration includes reduce instance specifications, reduce bandwidth configuration, annual commitment monthly cloud conversion for quantity pay cloud etc. operation.
    -Reduce front and rear instance of dimension price difference a refund will be refunded to your original pay in the way, used voucher not returned.
    
    -This interface belongs to asynchronous operation, wait about 5~10 miao after configuration changes. Then, you must call API or console restart instance, otherwise specification changes will not take effect, restart invalid operating system.
    
    -If instance is **has stopped** state, only start the instance, requiring a restart.
    -If instance settings. "rebootwhenfinished = true", is no separate restart.
     */
    @Override
    public CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrepayInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Any of the following a set of parameters can determine a security group outlet direction rules, specify only a parameter cannot determine a security group rules.
    
    -Authorization specify IP ADDRESS segment access rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp and DestCidrIp.
    
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
    
    -Authorization other security group access rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp and DestGroupId.
    
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
    
    -Associated with Prefix List security group rules. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestPrefixListId.
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupEgressRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Parameter InnerAccessPolicy value to Accept when security groups between instances of network is interworking. At this time, follow Accept priority principle that, security groups between instances of network keep interworking, not user self-Ngee Ann Group rule.
    
    -Parameter InnerAccessPolicy value of Drop, security groups between instances of network is isolation. At this time, follow user self-Ngee Ann group rules priority principle that, security groups between instances of network although is isolated, but you can self-Ngee Ann Group rule change intranet state, for example, you can pass [AuthorizeSecurityGroup](~~ 25554 ~~) security within the group two ECS instance network interconnection.
    
    -You can pass [DescribeSecurityGroupAttribute](~~ 25555 ~~) query the current security group intranet connected policy.
     */
    @Override
    public CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Security group of related in the API documentation, into the directional flow of initiator Source-side (Source) of data transmission receiver for objective to end (Dest).
    
    Any of the following a set of parameters can determine a security group into direction rules, specify only a parameter cannot determine a security group rules.
    
    -Authorization specify IP ADDRESS segment access rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp and SourceCidrIp.
    
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
    
    -Authorization other security group access rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp and SourceGroupId.
    
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
    
    -Associated with Prefix List security group rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp and SourcePrefixListId.
    
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageCapacityUnitAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVSwitchAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVirtualBorderRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseReservedInstancesOffering").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Please ensure that use the interface front, has fully understand storage capacity unit bag SCU charge of way and price. More information, please see [storage capacity unit bag billing](~~ 137897 ~~).
    
    
     */
    @Override
    public CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseStorageCapacityUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Quilt safety locking ECS instance "operationlocks" parameter contains ""LockReason": "security"" not supported when call the interface. For more information, see [API actions for security lock](~~ 25695 ~~).
    
     */
    @Override
    public CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReActivateInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Cloud status must be **in use**(In_use), cloud mounted ECS instance status must be **has Stopped**(Stopped).
    
    -Instance first start front, can not be reinitialized mount in its on the cloud.
    
    -Already exists local snapshots of the cloud, can not be reinitialized.
    
    -<props = "china"> open multiple mounting characteristics of cloud, can not be reinitialized. </props>
    
    -For the system disk initialization to mirror the initial status. If create cloud source mirror deleted cannot be initialized.
    
    -For created directly data plate, initialization to blank state.
    
    -For pass snapshot data created plate, to initialize snapshot state.
    
    > For pass snapshot data created plate, source snapshot has been deleted cannot be initialized and returns an error.
    
     */
    @Override
    public CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReInitDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -You can only reboot status for **run in** ("running") ECS instance.
    
    -Restart ECS instance after **Start in** ("starting") state.
    
    -Support Force restart ("forcestop"), force restart equated with traditional server power-down restart, may be lost instance operating systems not of data written to disk.
    
    -Quilt safety locking ECS instance "operationlocks" parameter contains "LockReason": "security", cannot restart instance. More information, please see [security lock Timing API behavior](~~ 25695 ~~).
     */
    @Override
    public CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    DDH status alarm status (UnderAssessment), the fault incubation period when, recommend that you call the interface implementation DDH fault migration, avoid DDH produce permanent fault. You can call the API [DescribeDedicatedHosts](~~ 134242 ~~) query proprietary the host status information.
     */
    @Override
    public CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    RedeployInstance for asynchronous calls interface, will restart and migration instance. Re-after successful deployment, instance to run in ("running") state. Redeployment failed when instance to return to a previous physical server, and restore to re-the state it was in before the deployment.
    
    When you call this operation, note that:
    
    -Target instance must be running or stopped state, call interface rear instance state change:
    
    -Is in run in ("running") instance of will enter stop in ("stopping") state.
    
    -Is in a stopped ("stopped") instance of Will Enter start in ("starting") state.
    
    -Does not support a re-deployment proprietary on the host instance.
    
    -Quilt safety control of the instance "operationlocks" marked in. ""LockReason": "security"" not supported when re-deployment.
    
    -No support response pass CreateSimulatedSystemEvent created analog event.
    
    -In isolation local disk system events in the process, damaged local disk quarantined but has not issued a **for system maintenance plan reboot and re-initialize bad plate** event (SystemMaintenance.RebootAndReInitErrorDisk), you can also call RedeployInstance. For more details, please see [local disk instance system events Overview](~~ 107693 ~~).
    
    RedeployInstance can Response System event type and event status see the following table.
    
    | Event name and parameter | Event status |
    | --- | --- |
    | Result of system maintenance instance restart (SystemMaintenance.Reboot)| Inquiring, Scheduled |
    | Result of system maintenance instance back deployment (SystemMaintenance.Redeploy)| Inquiring, Scheduled |
    | Result of system maintenance restart and replacement bad plate (SystemMaintenance.RebootAndIsolateErrorDisk)| Inquiring |
    | Result of system maintenance reboot and re-initialize bad plate (SystemMaintenance.RebootAndReInitErrorDisk)| Inquiring |
    | System error instance back deployment (SystemFailure.Redeploy)| Inquiring, Scheduled |
    | Use only local plate ECS instance: System error instance restart (SystemFailure.Reboot)| Executing |
    | Result of system maintenance isolation bad plate (SystemMaintenance.IsolateErrorDisk) | Inquiring |
    | Result of system maintenance re-initialize bad plate (SystemMaintenance.ReInitErrorDisk) | Inquiring |
    
    > re-deploying local Abax regular meeting re-initialize local plate, storage equipment data is cleared.
     */
    @Override
    public CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Immediate effect of capacity reservation service, when release way for manual release when, call the interface can be directly release capacity reservation service.
     */
    @Override
    public CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Release quantity pay proprietary host before, please ensure that the host machine does not exist any ECS instance.
     */
    @Override
    public CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleasePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    <props = "china"> renew payment when priority use deductible voucher, and your account must have support account balance payment or credit payment. </props>
    
    <props = "intl"> renew payment when priority use deductible voucher, and your account must have support account credit payment. </props>
    
    <props = "partner"> renew payment when priority use deductible voucher, and your account must have support account credit payment. </props>
    
     */
    @Override
    public CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Only supports for annual commitment monthly ECS instance renewal length or renew to unified due date.
    
    -Renew instance length of the renewal instance to unified expiration date operation can"t synchronous implementation, the renewal length parameter ("period", "periodunit") with unified due date parameter ("expectedrenewday") must specify one of them, but cannot be set at the same time.
    
    -<props = "china"> your account must have support account balance payment or credit payment. </props>
    
    -<props = "intl"> your account must have support credit payment. </props>
    
    -<props = "partner"> your account must have support credit payment. </props>
    
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Replacement System disk when you need to note:
    
    -No support replacement system disk the cloud type.
    
    -No support for change system disk billing.
    
    -The State of the instance must be Stopped (Stopped) state.
    
    > applies only to proprietary network VPC type instance. If ECS instance for quantity pay billing model, and open enabled by default save shutdown mode, to prevent geographical scope ECS instance insufficient inventory, caused replacement system disk can"t restart the instance. You need to stop the instance when set to ordinary shutdown mode. Specific operation, see [StopInstance](~~ 25501 ~~).
    
    -ECS instance cannot be safety locking, the instance "operationlocks" parameter value contains ""LockReason": "security"". More information, please see [security lock Timing API behavior](~~ 25695 ~~).
    
    -System disk mounted ECS instance cannot have not paid order.
    
    -You can pass parameters "systemdisk. size" re-specify the system disk capacity size.
    
    Replacement System Disk, recommends that you pass in any of the following ways verification whether replacement success:
    
    -Pass [DescribeDisks](~~ 25514 ~~) interface query the new system disk state. If mounted instance indicates that the replacement system disk operation is complete.
    
    -Pass [DescribeInstances](~~ 25506 ~~) interface query replacement system disk status of the instance. If the return value "operationlocks" is empty, then the replacement system disk operation is complete.
    
     */
    @Override
    public CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceSystemDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportInstancesStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Cloud status must be in use (In_Use).
    
    -Cloud mount status of the instance must be Stopped (Stopped). You can call the [StopInstances](~~ 155372 ~~) stop the instance.
    
    -The specified parameter SnapshotId must be by diskid created history snapshot.
    
    -Pass [DescribeInstances](~~ 25506 ~~) query ECS instance information when, if returns the data contains the "{" OperationLocks ": {" LockReason " : " security "}}", the ban all operation.
     */
    @Override
    public CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Call the interface rollback cloud front, please be sure to learn instance snapshot rollback cloud function"s small print also known. More information, please see [pass instance snapshot rollback cloud](~~ 209160 ~~).
     */
    @Override
    public CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    > expansion front, be sure to query cloud the partition format. If is MBR format not supported expansion to 2TiB above, otherwise it will cause data loss. For MBR partition expansion, recommends that you re-create and mount a piece of data plate, adopting GPT partition format rear, again will already have the data copy to the new data on your keyboard. For more details, please see [expansion cloud capacity](~~ 44986 ~~).
    
    -Support and capacity expansion of the cloud types include ordinary cloud ("cloud"), efficient cloud ("cloud_efficiency"), SSD cloud ("cloud_ssd") and ESSD("cloud_essd") cloud.
    
    -When cloud is when you create a snapshot, not allowed to expansion.
    
    -Cloud mount status of the instance must be **run in** ("running") or **has stopped** ("stopped").
    
    -Expansion when not modified cloud partition and file system, you need to expansion after distribution storage space.
    
    -<props = "china"> open multiple mounting characteristics of cloud only support offline expansion. Expansion front, you need to make sure that the mount all instances are **has stopped** ("stopped") state. </props>
    
     */
    @Override
    public CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Any of the following a set of parameters can match a security group into direction rules, specify only a parameter cannot determine a security group rules.
    
    -Undo specified IP ADDRESS segment access permissions. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp and SourceCidrIp.
    
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
    
    -Undo other security group permission settings. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp, SourceGroupId.
    
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
    -Undo associated with Prefix List security group rules. As the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) DestCidrIp and SourcePrefixListId.
    
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
    
    -If a matching Security Group rule does not exist, the RevokeSecurityGroup call is successful, but does not delete any rules.
     */
    @Override
    public CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Undo on other security group"s access, such as the following request example: IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp and DestGroupId.
    
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
    -Undo associated with Prefix List security group rules. For example, IpProtocol, PortRange, (optional) SourcePortRange, NicType, Policy, (optional) SourceCidrIp, and DestPrefixListId.
    
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
    
    -If a matching Security Group rule does not exist, the RevokeSecurityGroupEgress call is successful, but does not delete any rules.
     */
    @Override
    public CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Different in pass [CreateCommand](~~ 64844 ~~) and [InvokeCommand](~~ 64841 ~~) command execution, RunCommand just one call complete the command creation and implementation.
    
    When you call this operation, note that:
    
    -The target instance network type must be proprietary network VPC.
    
    -The target instance status must be run in the ("running").
    
    -Target instance must be pre-installed cloud assistant client ([InstallCloudAssistant](~~ 85916 ~~)).
    
    -Perform type for PowerShell when the command, you need to ensure that target ECS Windows Instance has already been configured PowerShell Module.
    
    -Cycle time set datum to UTC +0, and the time to instance system time shall prevail. ECS instance time or time zone must be with you the expected time consistent. About time zone for more information, please see [settings Linux instance time zone and NTP Services](~~ 92803 ~~) or [settings Windows instance NTP service](~~ 51890 ~~).
    
    -You can specify the parameter "timeout" for command sets the ECS instance performed in the biggest timeout time, command execution timeout after cloud assistant client will force termination process.
    -Single execution timeout rear, command the execution status of the ([InvokeRecordStatus](~~ 64845 ~~)) into execution Failed (Failed).
    -Cycle timeout time on every execution record are valid, last execution timeout does not affect the next. An execution timeout after execution state ([InvokeRecordStatus](~~ 64845 ~~)) into execution Failed (Failed).
    
    -Command May because the target instance state exception, network anomaly or cloud assistant client exception appears cannot perform the cannot be performed when not generated execution information.
    
    -"enableparameter = true" enabled when custom parameter function. Set "commandcontent" when can pass "{{parameter}}" The form of custom parameters, and when you run the command, incoming custom parameter key pair.
    
    <props="china">
    -In a geographical lower, according to your use case, most can keep 100-10000 strip cloud assistant command, every day up can perform 2000-200000 strip cloud assistant command. You can pass [DescribeAccountAttribute](~~ 73772 ~~) query quotas, can also [submit job](https://selfservice.console.aliyun.com/ticket/createIndex.htm) adjusting ownership quotas and call count quota.
    
    </props>
    
    
    <props="intl">
    -In a geographical lower, according to your use case, most can keep 100-10000 strip cloud assistant command, every day up can perform 2000-200000 strip cloud assistant command. You can pass [DescribeAccountAttribute](~~ 73772 ~~) query quotas, can also [submit job](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) adjusting ownership quotas and call count quota.
    
    </props>
     */
    @Override
    public CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## API description
    
    <props="china">
    -**Preparations * *:
    -Real-name authentication is passed. For more information, see [account real-name authentication documentation](~~ 48263 ~~).
    -Cost estimate: Learn about cloud server ECS billing. For more details, see [billing Overview](~~ 25398 ~~).
    -Product selection: call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, or see [selection configuration](~~ 58291 ~~) to learn how to select an instance type.
    -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
    -Network Planning: make sure that you have an available security group. For more details, please see [CreateSecurityGroup](~~ 25553 ~~). Create proprietary network VPC type instance front, you need to pre-in the corresponding Alibaba Cloud geographical create VPC](~~ 65430 ~~).
    
    </props>
    
    <props="intl">
    -**Preparations * *:
    -Cost estimate: Learn about cloud server ECS billing. For more details, see [billing Overview](~~ 25398 ~~).
    -Product selection: call [DescribeInstanceTypes](~~ 25620 ~~) to view the performance data of the target instance type, or see [selection configuration](~~ 58291 ~~) to learn how to select an instance type.
    -Query inventory: call [DescribeAvailableResource](~~ 66186 ~~) to view the resource supply in a specified region or zone.
    -Network Planning: make sure that you have an available security group. For more details, please see [CreateSecurityGroup](~~ 25553 ~~). Create proprietary network VPC type instance front, you need to pre-in the corresponding Alibaba Cloud geographical create VPC](~~ 65430 ~~).
    
    </props>
    
    -**"S small print also known * *:
    
    -You can create up to 100 instances at a time.
    -You can specify parameter "autoreleasetime" set the instance automatic release time.
    -After the instance is created, the instance ID list is returned. You can use [DescribeInstances](~~ 25506 ~~) to query the status of the new instance.
    -When you create an instance, the instance is automatically started until the instance status changes to running ("Running").
    -Starting from November 27, 2020, the peak bandwidth of an ECS instance is affected by the account speed limit policy. To increase the peak bandwidth, open a ticket. Specific speed limit policy: a single geographical lower, all use flow meter fee ECS instance the actual run bandwidth peak sum not greater than 5 Gbit/s; all fixed bandwidth billing ECS instance the actual run bandwidth peak sum no more than 50 Gbit/s.
    -Compared with [CreateInstance](~~ 25499 ~~), if the value of "InternetMaxBandwidthOut" is greater than 0 for an instance created by "RunInstances", the public IP address is automatically assigned to the instance.
    -RunInstances support in any of the following ways binding main network card, but needs attention one call can only use a way configuration main network card while using two ways will call fails and returns an error information.
    -Pass "securitygroupid", "vswitchid", "privateipaddress", "networkinterfacequeuenumber" and "ipv6addresscount" etc. parameter set directly main network card of the related configuration information.
    -Pass "networkinterface. N.* "set main network card and secondary network card configuration information. If "NetworkInterface.N.InstanceType" is set to "primare", the primary Eni is set. If "NetworkInterface.N.InstanceType" is set to "secondare" or null, the secondary Eni is set.
    -Submit after creating the task parameter illegal or inventory insufficient complains, specific error reason see error code.
    
    > If you create instance returns "quotaexceed. elasticquota" error, indicates that you in the current geographical selector instance of the dimension to be created the number exceeds the system limit, or full instance dimension vCPU quota exceeds the system limit, you can go to the [ECS console](https://ecs.console.aliyun.com/? spm = a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) apply for an increase in the quota.
    
    <props="china">
    -**Best practices * *:
    
    -When you create a large number of ECS instances (more than 100 ECS instances) at a time, you may encounter insufficient inventory. You do not have to specify resource configurations such as instance types or zones. You need to pay more attention to scenarios where you can quickly create instances; pair ECS instance number no specified requirements, more attention finally force vCPU number etc. scene lower, Alibaba Cloud recommend you use elastic supply group. You can use [CreateAutoProvisioningGroup](~~ 122738 ~~) to create an auto provisioning group and deploy instance clusters across billing methods, zones, and instance families in one click. For more information, see [create multiple ECS instances by using auto provisioning group APIs](~~ 200772 ~~).
    
    -"runinstances" can perform bulk create task, for ease of management and retrieval, recommends that you for each batch start an instance of the specified label ("tag. N.Key" and "Tag.N. And add an ordered suffix ("UniqueSuffix") to the hostname ("HostName") and instance name ("InstanceName").
    
    -Instance start template absolve each time you create an instance when need to fill in a lot of configuration parameters, you can create instance startup template ([CreateLaunchTemplate](~~ 74686 ~~)) rear, in "runinstances" specified in the request "launchtemplateid" and "launchtemplateversion" use starter template.
    
    -You can obtain "RunInstances" best practices when creating an ECS instance in the [ECS console](https://ecs.console.aliyun.com/). When you confirm an order, The **API workflow on the left lists the associated APIs that can be used by "RunInstances" and the values of request parameters. The programming language-oriented SDK example is provided on the right. Currently, the **Java** and **Python** Examples are supported.
    
    </props>
    
    <props="intl">
    -**Best practices * *:
    
    -When you create a large number of ECS instances (more than 100 ECS instances) at a time, you may encounter insufficient inventory. You do not have to specify resource configurations such as instance types or zones. You need to pay more attention to scenarios where you can quickly create instances; pair ECS instance number no specified requirements, more attention finally force vCPU number etc. scene lower, Alibaba Cloud recommend you use elastic supply group. You can use [CreateAutoProvisioningGroup](~~ 122738 ~~) to create an auto provisioning group and deploy instance clusters across billing methods, zones, and instance families in one click. For more information, see [create multiple ECS instances by using auto provisioning group APIs](~~ 200772 ~~).
    
    -"runinstances" can perform bulk create task, for ease of management and retrieval, recommends that you for each batch start an instance of the specified label ("tag. N.Key" and "Tag.N. And add an ordered suffix ("UniqueSuffix") to the hostname ("HostName") and instance name ("InstanceName").
    
    -Instance start template absolve each time you create an instance when need to fill in a lot of configuration parameters, you can create instance startup template ([CreateLaunchTemplate](~~ 74686 ~~)) rear, in "runinstances" specified in the request "launchtemplateid" and "launchtemplateversion" use starter template.
    
    -You can obtain "RunInstances" best practices when creating an ECS instance in the [ECS console](https://ecs.console.aliyun.com/). When you confirm an order, The **API workflow on the left lists the associated APIs that can be used by "RunInstances" and the values of request parameters. The programming language-oriented SDK example is provided on the right. Currently, the **Java** and **Python** Examples are supported.
    
    </props>
    
    <props="partner">
    -**Best practices * *:
    
    -When you create a large number of ECS instances (more than 100 ECS instances) at a time, you may encounter insufficient inventory. You do not have to specify resource configurations such as instance types or zones. You need to pay more attention to scenarios where you can quickly create instances; pair ECS instance number no specified requirements, more attention finally force vCPU number etc. scene lower, Alibaba Cloud recommend you use elastic supply group. You can use [CreateAutoProvisioningGroup](~~ 122738 ~~) to create an auto provisioning group and deploy instance clusters across billing methods, zones, and instance families in one click. For more information, see [create multiple ECS instances by using auto provisioning group APIs](~~ 200772 ~~).
    
    -"runinstances" can perform bulk create task, for ease of management and retrieval, recommends that you for each batch start an instance of the specified label ("tag. N.Key" and "Tag.N. And add an ordered suffix ("UniqueSuffix") to the hostname ("HostName") and instance name ("InstanceName").
    
    -Instance start template absolve each time you create an instance when need to fill in a lot of configuration parameters, you can create instance startup template ([CreateLaunchTemplate](~~ 74686 ~~)) rear, in "runinstances" specified in the request "launchtemplateid" and "launchtemplateversion" use starter template.
    
    -You can [ECS management console](https://partners-intl.console.aliyun.com/#/ecs) create the ECS instance get "runinstances" best practice recommendations. When you confirm an order, The **API workflow on the left lists the associated APIs that can be used by "RunInstances" and the values of request parameters. The programming language-oriented SDK example is provided on the right. Currently, the **Java** and **Python** Examples are supported.
    
    </props>
    
    
     */
    @Override
    public CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * ## Interface description:
    -Target ECS instance status must be run in the ("running").
    -Target ECS instance must be pre-installed cloud assistant client. Details please see [InstallCloudAssistant](~~ 85916 ~~).
    -Cloud assistant client version need higher than the following the corresponding version to support document issued. If the result returns "clientneedupgrade" error code, please see [upgrade or prohibited upgrade cloud assistant client](~~ 134383 ~~) document, the client to update to the latest version.
    -Linux:1.0.2.569
    -Windows:1.0.0.149
    -File content in the Base64 after the encoding size cannot exceed 32KB.
    -Files allot May because the target ECS instance state exception, network anomaly or cloud assistant client exception appears failures. Please call [DescribeSendFileResults](~~~~) troubleshooting.
     */
    @Override
    public CompletableFuture<SendFileResponse> sendFile(SendFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -ECS instance status must be **has stopped** ("stopped").
    
    -Quilt [security control](~~ 25695 ~~) instance of "operationlocks" marked in. ""LockReason" : "security"" the lock status of the when, can"t start instance.
     */
    @Override
    public CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -ECS instance status must be **has stopped** ("stopped").
    
    -When querying ECS instance information, if the returned data contains "{"OperationLocks": {"LockReason" : "security"}}", all operations are prohibited.
    
    -Batch operations are supported. You can set the batch operation mode by using the "BatchOptimization" parameter.
     */
    @Override
    public CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    <props = "china"> The Session management function is being invited for testing. To use this function, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex). </props>
    
    <props = "intl"> The Session management function is being invited for testing. To use this function, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm). </props>
    
    You can call this operation to obtain the WebSocketUrl of a remote connection to an ECS instance. Note the following when you call this operation:
    
    -The specified ECS instance must be in the Running state.
    -The cloud assistant client must be installed on the specified ECS instance. You can call [DescribeCloudAssistantStatus](~~ 87346 ~~) to query whether the cloud assistant client is installed on the ECS instance and the version number of the cloud assistant client.
    -If the cloud assistant client is not installed on your ECS instance, call [InstallCloudAssistant](~~ 85916 ~~) to install it.
    -The cloud assistant client must be later than the following version to support session management. If you want to upgrade the cloud assistant client version, see [upgrade or disable upgrade of cloud assistant client](~~ 134383 ~~).
    -Linux operating system: 2.2.3.256
    -Windows Operating system: 2.1.3.256
    -Successful call the interface after WebSocketUrl effective-long 10 fen zhong.
    -A maximum of 1,000 sessions can be created and available in a region, and a maximum of 10 sessions can be connected to a single ECS instance.
    
     */
    @Override
    public CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTerminalSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Quilt safety locking ECS instance "operationlocks" parameter contains "LockReason": "security", can"t stop the instance. More information, please see [security lock Timing API behavior](~~ 25695 ~~).
    
    -Opens the VPC inner instance save shutdown mode after, you can set "stoppedmode = keepcharging" open ordinary shutdown mode, ECS instance stop will continue after billing, and for you to retain ECS instance dimension inventory and public IP ADDRESS.
     */
    @Override
    public CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Quantity pay instance open VPC inner instance save downtime mode, you can set "stoppedmode = keepcharging" open ordinary shutdown mode, ECS instance stop will continue after billing, and for you to retain ECS instance dimension inventory and public IP ADDRESS.
    
    -Batch operations are supported. You can set the batch operation mode by using the "BatchOptimization" parameter.
     */
    @Override
    public CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Stop single command process rear, has already started to implement an instance of will continue to implement, not started execution instance will no longer perform.
    
    -Stop cycle commands after the process has already started to implement the Command continues, but follow-up will not be the next implementation.
     */
    @Override
    public CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInvocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    Binding label front, Alibaba Cloud verifies resource already has number of labels. More than limit value after return error information. For more details, please see [use restrictions](~~ 25412 ~~).
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Elastic network card must be in **Available**(Available) or **mounted**(InUse) state.
    
    -Main network card associated with the ECS instance must be in the **run in**(Running) or **has Stopped**(Stopped) state.
    
     */
    @Override
    public CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
    
    -Only support **Available**(Available) or **bound**(InUse) state under the elastic network card.
    
    -Operation Main Nic, network card additional instance must be in the **run in**(Running) or **has Stopped**(Stopped) state.
     */
    @Override
    public CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.NONE).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
