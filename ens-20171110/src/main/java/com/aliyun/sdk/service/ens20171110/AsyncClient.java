// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ens20171110.models.*;
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
     * @param request the request parameters of AccosicateNetworkAcl  AccosicateNetworkAclRequest
     * @return AccosicateNetworkAclResponse
     */
    CompletableFuture<AccosicateNetworkAclResponse> accosicateNetworkAcl(AccosicateNetworkAclRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of AddBackendServers  AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second.</li>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * <li>Internal networks and IPv4 addresses are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of AddNetworkInterfaceToInstance  AddNetworkInterfaceToInstanceRequest
     * @return AddNetworkInterfaceToInstanceResponse
     */
    CompletableFuture<AddNetworkInterfaceToInstanceResponse> addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request);

    /**
     * @param request the request parameters of AddSnatIpForSnatEntry  AddSnatIpForSnatEntryRequest
     * @return AddSnatIpForSnatEntryResponse
     */
    CompletableFuture<AddSnatIpForSnatEntryResponse> addSnatIpForSnatEntry(AddSnatIpForSnatEntryRequest request);

    /**
     * @param request the request parameters of AssignPrivateIpAddresses  AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     */
    CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request);

    /**
     * @param request the request parameters of AssociateEnsEipAddress  AssociateEnsEipAddressRequest
     * @return AssociateEnsEipAddressResponse
     */
    CompletableFuture<AssociateEnsEipAddressResponse> associateEnsEipAddress(AssociateEnsEipAddressRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to associate an HAVIP, take note of the following items:</p>
     * <ul>
     * <li>An HAVIP immediately takes effect after it is associated. You do not need to restart the ENS instance. However, you need to associate the HAVIP with the ENI of the ENS instance.</li>
     * <li>The HAVIP and ENS instance must belong to the same vSwitch.</li>
     * <li>The ENS instance must be in the Running or Stopped state.</li>
     * <li>The HAVIP must be in the Available or InUse state.</li>
     * <li>AssociateHaVip is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the DescribeHaVips operation to query the status of an HAVIP:<ul>
     * <li>If the HAVIP is in the Associating state, the HAVIP is being associated.<!----></li>
     * <li>If the HAVIP is in the InUse state, the HAVIP is associated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
     */
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>After you execute the command, the instance restarts loading.</li>
     * <li>Limits: The instance has at least two vCPUs and 4 GB memory. An image of CentOS 7.4 or later is required.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachEnsInstances  AttachEnsInstancesRequest
     * @return AttachEnsInstancesResponse
     */
    CompletableFuture<AttachEnsInstancesResponse> attachEnsInstances(AttachEnsInstancesRequest request);

    /**
     * @param request the request parameters of AttachInstanceSDG  AttachInstanceSDGRequest
     * @return AttachInstanceSDGResponse
     */
    CompletableFuture<AttachInstanceSDGResponse> attachInstanceSDG(AttachInstanceSDGRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>The ENI must be in the Available state.</li>
     * <li>An ENI can be attached to only one instance that is the same zone and the same Virtual Private Cloud (VPC).</li>
     * <li>The instance must be in the Stopped state.</li>
     * <li>A maximum of 10 ENIs can be attached to an instance.</li>
     * <li>This operation is an asynchronous operation. After you call this operation to attach an ENI, you can view the status of the ENI to check whether the ENI is attached.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachNetworkInterface  AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     */
    CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of AuthorizeSecurityGroup  AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
     */
    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.</p>
     * 
     * @param request the request parameters of AuthorizeSecurityGroupEgress  AuthorizeSecurityGroupEgressRequest
     * @return AuthorizeSecurityGroupEgressResponse
     */
    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    /**
     * @param request the request parameters of CleanDistData  CleanDistDataRequest
     * @return CleanDistDataResponse
     */
    CompletableFuture<CleanDistDataResponse> cleanDistData(CleanDistDataRequest request);

    /**
     * @param request the request parameters of CopySDG  CopySDGRequest
     * @return CopySDGResponse
     */
    CompletableFuture<CopySDGResponse> copySDG(CopySDGRequest request);

    /**
     * @param request the request parameters of CopySnapshot  CopySnapshotRequest
     * @return CopySnapshotResponse
     */
    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    /**
     * @param request the request parameters of CreateARMServerInstances  CreateARMServerInstancesRequest
     * @return CreateARMServerInstancesResponse
     */
    CompletableFuture<CreateARMServerInstancesResponse> createARMServerInstances(CreateARMServerInstancesRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateClassicNetwork  CreateClassicNetworkRequest
     * @return CreateClassicNetworkResponse
     */
    CompletableFuture<CreateClassicNetworkResponse> createClassicNetwork(CreateClassicNetworkRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>Creating a cluster is an asynchronous operation. After this operation returns the response, it takes 10 to 20 minutes to initialize the cluster. You can call the DescribeCluster operation to query the cluster status. After you create a cluster, you can call the DescribeClusterKubeConfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateDisk  CreateDiskRequest
     * @return CreateDiskResponse
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5,000 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 50 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEipInstance  CreateEipInstanceRequest
     * @return CreateEipInstanceResponse
     */
    CompletableFuture<CreateEipInstanceResponse> createEipInstance(CreateEipInstanceRequest request);

    /**
     * @param request the request parameters of CreateEnsRouteEntry  CreateEnsRouteEntryRequest
     * @return CreateEnsRouteEntryResponse
     */
    CompletableFuture<CreateEnsRouteEntryResponse> createEnsRouteEntry(CreateEnsRouteEntryRequest request);

    /**
     * @param request the request parameters of CreateEnsSaleControl  CreateEnsSaleControlRequest
     * @return CreateEnsSaleControlResponse
     */
    CompletableFuture<CreateEnsSaleControlResponse> createEnsSaleControl(CreateEnsSaleControlRequest request);

    /**
     * @param request the request parameters of CreateEnsService  CreateEnsServiceRequest
     * @return CreateEnsServiceResponse
     */
    CompletableFuture<CreateEnsServiceResponse> createEnsService(CreateEnsServiceRequest request);

    /**
     * @param request the request parameters of CreateEpnInstance  CreateEpnInstanceRequest
     * @return CreateEpnInstanceResponse
     */
    CompletableFuture<CreateEpnInstanceResponse> createEpnInstance(CreateEpnInstanceRequest request);

    /**
     * @param request the request parameters of CreateFileSystem  CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    /**
     * @param request the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
     * @param request the request parameters of CreateHaVip  CreateHaVipRequest
     * @return CreateHaVipResponse
     */
    CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request);

    /**
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>We recommend that you increase the request time because instance creation is an asynchronous operation. If the return code of the API operation is 0, it indicates that the request is successful, but does not indicate that the instance is created. If the request is successful, an instance ID is returned. You can check whether the instance is created based on the instance ID.</li>
     * <li>InvalidUserData.NotInWhiteList operation restriction: You can create an instance only if you are in the whitelist in which members have the purchase permissions. Otherwise, an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceActiveOpsTask  CreateInstanceActiveOpsTaskRequest
     * @return CreateInstanceActiveOpsTaskResponse
     */
    CompletableFuture<CreateInstanceActiveOpsTaskResponse> createInstanceActiveOpsTask(CreateInstanceActiveOpsTaskRequest request);

    /**
     * <b>description</b> :
     * <p>An SSH key pair consists of a public key and a private key. ENS stores the public key and returns the unencrypted private key that is PEM-encoded in the PKCS#8 format. You must securely lock away the private key.</p>
     * 
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPListener  CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPSListener  CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerTCPListener  CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerUDPListener  CreateLoadBalancerUDPListenerRequest
     * @return CreateLoadBalancerUDPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Precautions</h2>
     * <p>After you call this operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the Active state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * 
     * @param request the request parameters of CreateMountTarget  CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request);

    /**
     * @param request the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNetwork  CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    CompletableFuture<CreateNetworkResponse> createNetwork(CreateNetworkRequest request);

    /**
     * @param request the request parameters of CreateNetworkAcl  CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     */
    CompletableFuture<CreateNetworkAclResponse> createNetworkAcl(CreateNetworkAclRequest request);

    /**
     * @param request the request parameters of CreateNetworkAclEntry  CreateNetworkAclEntryRequest
     * @return CreateNetworkAclEntryResponse
     */
    CompletableFuture<CreateNetworkAclEntryResponse> createNetworkAclEntry(CreateNetworkAclEntryRequest request);

    /**
     * @param request the request parameters of CreateNetworkInterface  CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     */
    CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>A SDG can be regarded as a data partition image of a virtual device. You can save a data partition of a virtual device as an SDG. A created SDG can be deployed in data partitions of other virtual devices to achieve rapid data distribution and application. The procedure for calling SDG-related API operations:</p>
     * <ul>
     * <li>Call the <a href="~~CreateSDG~~">CreateSDG</a> operation to create an SDG, which is bound to AIC Instance A (InstanceId). After you create the SDG, a blank cloud disk (also known as an original cloud disk) is attached to Device A (InstanceId).</li>
     * <li>Install applications on and deliver files to AIC Instance A (InstanceId).</li>
     * <li>Call the <a href="~~SaveSDG~~">SaveSDG</a> operation to save the data disk of AIC instance A as SDG A.</li>
     * <li>Call the <a href="~~DeploySDG~~">DeploySDG</a> operation to deploy SDG A to AIC Instance B. This operattion is executed asynchronously. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to query the status of AIC Instance B. If the status of AIC Instance B changes to success, AIC insance B is available, and AIC Instances A and B have the same applications running.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSDG  CreateSDGRequest
     * @return CreateSDGResponse
     */
    CompletableFuture<CreateSDGResponse> createSDG(CreateSDGRequest request);

    /**
     * @param request the request parameters of CreateSecurityGroup  CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     */
    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of CreateSnatEntry  CreateSnatEntryRequest
     * @return CreateSnatEntryResponse
     */
    CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request);

    /**
     * @param request the request parameters of CreateStorageGateway  CreateStorageGatewayRequest
     * @return CreateStorageGatewayResponse
     */
    CompletableFuture<CreateStorageGatewayResponse> createStorageGateway(CreateStorageGatewayRequest request);

    /**
     * @param request the request parameters of CreateStorageVolume  CreateStorageVolumeRequest
     * @return CreateStorageVolumeResponse
     */
    CompletableFuture<CreateStorageVolumeResponse> createStorageVolume(CreateStorageVolumeRequest request);

    /**
     * @param request the request parameters of CreateVSwitch  CreateVSwitchRequest
     * @return CreateVSwitchResponse
     */
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>  Only the Alibaba Cloud Account ID owner of a bucket can delete the bucket from the account.</p>
     * <ul>
     * <li>You cannot delete buckets that store objects. You can only delete empty buckets.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBucket  DeleteBucketRequest
     * @return DeleteBucketResponse
     */
    CompletableFuture<DeleteBucketResponse> deleteBucket(DeleteBucketRequest request);

    /**
     * @param request the request parameters of DeleteBucketLifecycle  DeleteBucketLifecycleRequest
     * @return DeleteBucketLifecycleResponse
     */
    CompletableFuture<DeleteBucketLifecycleResponse> deleteBucketLifecycle(DeleteBucketLifecycleRequest request);

    /**
     * <b>description</b> :
     * <p>When you release a disk, the disk must be in the Available state.</p>
     * 
     * @param request the request parameters of DeleteDisk  DeleteDiskRequest
     * @return DeleteDiskResponse
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    /**
     * @param request the request parameters of DeleteEip  DeleteEipRequest
     * @return DeleteEipResponse
     */
    CompletableFuture<DeleteEipResponse> deleteEip(DeleteEipRequest request);

    /**
     * @param request the request parameters of DeleteEnsRouteEntry  DeleteEnsRouteEntryRequest
     * @return DeleteEnsRouteEntryResponse
     */
    CompletableFuture<DeleteEnsRouteEntryResponse> deleteEnsRouteEntry(DeleteEnsRouteEntryRequest request);

    /**
     * @param request the request parameters of DeleteEnsSaleConditionControl  DeleteEnsSaleConditionControlRequest
     * @return DeleteEnsSaleConditionControlResponse
     */
    CompletableFuture<DeleteEnsSaleConditionControlResponse> deleteEnsSaleConditionControl(DeleteEnsSaleConditionControlRequest request);

    /**
     * @param request the request parameters of DeleteEnsSaleControl  DeleteEnsSaleControlRequest
     * @return DeleteEnsSaleControlResponse
     */
    CompletableFuture<DeleteEnsSaleControlResponse> deleteEnsSaleControl(DeleteEnsSaleControlRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete an EPN instance only when the instance group information is empty.</p>
     * 
     * @param request the request parameters of DeleteEpnInstance  DeleteEpnInstanceRequest
     * @return DeleteEpnInstanceResponse
     */
    CompletableFuture<DeleteEpnInstanceResponse> deleteEpnInstance(DeleteEpnInstanceRequest request);

    /**
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * @param request the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
     * @param request the request parameters of DeleteHaVips  DeleteHaVipsRequest
     * @return DeleteHaVipsResponse
     */
    CompletableFuture<DeleteHaVipsResponse> deleteHaVips(DeleteHaVipsRequest request);

    /**
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>  After you delete an SSH key pair, you can no longer query the key pair by calling the DescribeKeyPairs operation.</p>
     * <ul>
     * <li>If you delete an SSH key pair that is bound to an Edge Node Service (ENS) instance, ENS no longer stores the SSH key pair. However, you can still use the key pair to access the instance. When you call the DescribeInstance operation to query instance information, no other information but the name of the key pair (<strong>KeyPairName</strong>) is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLoadBalancerListener  DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    /**
     * <b>description</b> :
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteMountTarget  DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request);

    /**
     * @param request the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
     * @param request the request parameters of DeleteNetwork  DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request);

    /**
     * @param request the request parameters of DeleteNetworkAcl  DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     */
    CompletableFuture<DeleteNetworkAclResponse> deleteNetworkAcl(DeleteNetworkAclRequest request);

    /**
     * @param request the request parameters of DeleteNetworkAclEntry  DeleteNetworkAclEntryRequest
     * @return DeleteNetworkAclEntryResponse
     */
    CompletableFuture<DeleteNetworkAclEntryResponse> deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request);

    /**
     * @param request the request parameters of DeleteNetworkInterfaces  DeleteNetworkInterfacesRequest
     * @return DeleteNetworkInterfacesResponse
     */
    CompletableFuture<DeleteNetworkInterfacesResponse> deleteNetworkInterfaces(DeleteNetworkInterfacesRequest request);

    /**
     * @param request the request parameters of DeleteObject  DeleteObjectRequest
     * @return DeleteObjectResponse
     */
    CompletableFuture<DeleteObjectResponse> deleteObject(DeleteObjectRequest request);

    /**
     * <b>description</b> :
     * <p>If all the SDGs corresponding to the original disk are deleted, the original disk is automatically cleared.</p>
     * 
     * @param request the request parameters of DeleteSDG  DeleteSDGRequest
     * @return DeleteSDGResponse
     */
    CompletableFuture<DeleteSDGResponse> deleteSDG(DeleteSDGRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a security group, make sure that no instances exist in the security group.</p>
     * 
     * @param request the request parameters of DeleteSecurityGroup  DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteSnatEntry  DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
     */
    CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request);

    /**
     * @param request the request parameters of DeleteSnatIpForSnatEntry  DeleteSnatIpForSnatEntryRequest
     * @return DeleteSnatIpForSnatEntryResponse
     */
    CompletableFuture<DeleteSnatIpForSnatEntryResponse> deleteSnatIpForSnatEntry(DeleteSnatIpForSnatEntryRequest request);

    /**
     * @param request the request parameters of DeleteStorageGateway  DeleteStorageGatewayRequest
     * @return DeleteStorageGatewayResponse
     */
    CompletableFuture<DeleteStorageGatewayResponse> deleteStorageGateway(DeleteStorageGatewayRequest request);

    /**
     * @param request the request parameters of DeleteStorageVolume  DeleteStorageVolumeRequest
     * @return DeleteStorageVolumeResponse
     */
    CompletableFuture<DeleteStorageVolumeResponse> deleteStorageVolume(DeleteStorageVolumeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a vSwitch, make sure that no instances exist in the vSwitch.</p>
     * 
     * @param request the request parameters of DeleteVSwitch  DeleteVSwitchRequest
     * @return DeleteVSwitchResponse
     */
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    /**
     * @param request the request parameters of DeployInstanceSDG  DeployInstanceSDGRequest
     * @return DeployInstanceSDGResponse
     */
    CompletableFuture<DeployInstanceSDGResponse> deployInstanceSDG(DeployInstanceSDGRequest request);

    /**
     * @param request the request parameters of DeploySDG  DeploySDGRequest
     * @return DeploySDGResponse
     */
    CompletableFuture<DeploySDGResponse> deploySDG(DeploySDGRequest request);

    /**
     * @param request the request parameters of DescribeAICImages  DescribeAICImagesRequest
     * @return DescribeAICImagesResponse
     */
    CompletableFuture<DescribeAICImagesResponse> describeAICImages(DescribeAICImagesRequest request);

    /**
     * @param request the request parameters of DescribeARMServerInstances  DescribeARMServerInstancesRequest
     * @return DescribeARMServerInstancesResponse
     */
    CompletableFuture<DescribeARMServerInstancesResponse> describeARMServerInstances(DescribeARMServerInstancesRequest request);

    /**
     * @param request the request parameters of DescribeApplication  DescribeApplicationRequest
     * @return DescribeApplicationResponse
     */
    CompletableFuture<DescribeApplicationResponse> describeApplication(DescribeApplicationRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResourceInfo  DescribeAvailableResourceInfoRequest
     * @return DescribeAvailableResourceInfoResponse
     */
    CompletableFuture<DescribeAvailableResourceInfoResponse> describeAvailableResourceInfo(DescribeAvailableResourceInfoRequest request);

    /**
     * @param request the request parameters of DescribeBandWithdChargeType  DescribeBandWithdChargeTypeRequest
     * @return DescribeBandWithdChargeTypeResponse
     */
    CompletableFuture<DescribeBandWithdChargeTypeResponse> describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request);

    /**
     * @param request the request parameters of DescribeBandwitdhByInternetChargeType  DescribeBandwitdhByInternetChargeTypeRequest
     * @return DescribeBandwitdhByInternetChargeTypeResponse
     */
    CompletableFuture<DescribeBandwitdhByInternetChargeTypeResponse> describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request);

    /**
     * @param request the request parameters of DescribeCloudDiskAvailableResourceInfo  DescribeCloudDiskAvailableResourceInfoRequest
     * @return DescribeCloudDiskAvailableResourceInfoResponse
     */
    CompletableFuture<DescribeCloudDiskAvailableResourceInfoResponse> describeCloudDiskAvailableResourceInfo(DescribeCloudDiskAvailableResourceInfoRequest request);

    /**
     * @param request the request parameters of DescribeCloudDiskTypes  DescribeCloudDiskTypesRequest
     * @return DescribeCloudDiskTypesResponse
     */
    CompletableFuture<DescribeCloudDiskTypesResponse> describeCloudDiskTypes(DescribeCloudDiskTypesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * <b>description</b> :
     * <p>  The maximum number of times that each user can call this operation per second is 100.</p>
     * 
     * @param request the request parameters of DescribeClusterKubeConfig  DescribeClusterKubeConfigRequest
     * @return DescribeClusterKubeConfigResponse
     */
    CompletableFuture<DescribeClusterKubeConfigResponse> describeClusterKubeConfig(DescribeClusterKubeConfigRequest request);

    /**
     * @param request the request parameters of DescribeCreatePrePaidInstanceResult  DescribeCreatePrePaidInstanceResultRequest
     * @return DescribeCreatePrePaidInstanceResultResponse
     */
    CompletableFuture<DescribeCreatePrePaidInstanceResultResponse> describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request);

    /**
     * @param request the request parameters of DescribeDataDistResult  DescribeDataDistResultRequest
     * @return DescribeDataDistResultResponse
     */
    CompletableFuture<DescribeDataDistResultResponse> describeDataDistResult(DescribeDataDistResultRequest request);

    /**
     * @param request the request parameters of DescribeDataDownloadURL  DescribeDataDownloadURLRequest
     * @return DescribeDataDownloadURLResponse
     */
    CompletableFuture<DescribeDataDownloadURLResponse> describeDataDownloadURL(DescribeDataDownloadURLRequest request);

    /**
     * @param request the request parameters of DescribeDataPushResult  DescribeDataPushResultRequest
     * @return DescribeDataPushResultResponse
     */
    CompletableFuture<DescribeDataPushResultResponse> describeDataPushResult(DescribeDataPushResultRequest request);

    /**
     * @param request the request parameters of DescribeDeviceService  DescribeDeviceServiceRequest
     * @return DescribeDeviceServiceResponse
     */
    CompletableFuture<DescribeDeviceServiceResponse> describeDeviceService(DescribeDeviceServiceRequest request);

    /**
     * @param request the request parameters of DescribeDiskIopsList  DescribeDiskIopsListRequest
     * @return DescribeDiskIopsListResponse
     */
    CompletableFuture<DescribeDiskIopsListResponse> describeDiskIopsList(DescribeDiskIopsListRequest request);

    /**
     * @param request the request parameters of DescribeDisks  DescribeDisksRequest
     * @return DescribeDisksResponse
     */
    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    /**
     * @param request the request parameters of DescribeElbAvailableResourceInfo  DescribeElbAvailableResourceInfoRequest
     * @return DescribeElbAvailableResourceInfoResponse
     */
    CompletableFuture<DescribeElbAvailableResourceInfoResponse> describeElbAvailableResourceInfo(DescribeElbAvailableResourceInfoRequest request);

    /**
     * @param request the request parameters of DescribeEnsCommodityCode  DescribeEnsCommodityCodeRequest
     * @return DescribeEnsCommodityCodeResponse
     */
    CompletableFuture<DescribeEnsCommodityCodeResponse> describeEnsCommodityCode(DescribeEnsCommodityCodeRequest request);

    /**
     * @param request the request parameters of DescribeEnsCommodityModuleCode  DescribeEnsCommodityModuleCodeRequest
     * @return DescribeEnsCommodityModuleCodeResponse
     */
    CompletableFuture<DescribeEnsCommodityModuleCodeResponse> describeEnsCommodityModuleCode(DescribeEnsCommodityModuleCodeRequest request);

    /**
     * @param request the request parameters of DescribeEnsEipAddresses  DescribeEnsEipAddressesRequest
     * @return DescribeEnsEipAddressesResponse
     */
    CompletableFuture<DescribeEnsEipAddressesResponse> describeEnsEipAddresses(DescribeEnsEipAddressesRequest request);

    /**
     * @param request the request parameters of DescribeEnsNetDistrict  DescribeEnsNetDistrictRequest
     * @return DescribeEnsNetDistrictResponse
     */
    CompletableFuture<DescribeEnsNetDistrictResponse> describeEnsNetDistrict(DescribeEnsNetDistrictRequest request);

    /**
     * @param request the request parameters of DescribeEnsNetLevel  DescribeEnsNetLevelRequest
     * @return DescribeEnsNetLevelResponse
     */
    CompletableFuture<DescribeEnsNetLevelResponse> describeEnsNetLevel(DescribeEnsNetLevelRequest request);

    /**
     * @param request the request parameters of DescribeEnsNetSaleDistrict  DescribeEnsNetSaleDistrictRequest
     * @return DescribeEnsNetSaleDistrictResponse
     */
    CompletableFuture<DescribeEnsNetSaleDistrictResponse> describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request);

    /**
     * @param request the request parameters of DescribeEnsRegionIdIpv6Info  DescribeEnsRegionIdIpv6InfoRequest
     * @return DescribeEnsRegionIdIpv6InfoResponse
     */
    CompletableFuture<DescribeEnsRegionIdIpv6InfoResponse> describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of DescribeEnsRegionIdResource  DescribeEnsRegionIdResourceRequest
     * @return DescribeEnsRegionIdResourceResponse
     */
    CompletableFuture<DescribeEnsRegionIdResourceResponse> describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request);

    /**
     * @param request the request parameters of DescribeEnsRegions  DescribeEnsRegionsRequest
     * @return DescribeEnsRegionsResponse
     */
    CompletableFuture<DescribeEnsRegionsResponse> describeEnsRegions(DescribeEnsRegionsRequest request);

    /**
     * @param request the request parameters of DescribeEnsResourceUsage  DescribeEnsResourceUsageRequest
     * @return DescribeEnsResourceUsageResponse
     */
    CompletableFuture<DescribeEnsResourceUsageResponse> describeEnsResourceUsage(DescribeEnsResourceUsageRequest request);

    /**
     * @param request the request parameters of DescribeEnsRouteEntryList  DescribeEnsRouteEntryListRequest
     * @return DescribeEnsRouteEntryListResponse
     */
    CompletableFuture<DescribeEnsRouteEntryListResponse> describeEnsRouteEntryList(DescribeEnsRouteEntryListRequest request);

    /**
     * @param request the request parameters of DescribeEnsRouteTables  DescribeEnsRouteTablesRequest
     * @return DescribeEnsRouteTablesResponse
     */
    CompletableFuture<DescribeEnsRouteTablesResponse> describeEnsRouteTables(DescribeEnsRouteTablesRequest request);

    /**
     * @param request the request parameters of DescribeEnsSaleControl  DescribeEnsSaleControlRequest
     * @return DescribeEnsSaleControlResponse
     */
    CompletableFuture<DescribeEnsSaleControlResponse> describeEnsSaleControl(DescribeEnsSaleControlRequest request);

    /**
     * @param request the request parameters of DescribeEnsSaleControlAvailableResource  DescribeEnsSaleControlAvailableResourceRequest
     * @return DescribeEnsSaleControlAvailableResourceResponse
     */
    CompletableFuture<DescribeEnsSaleControlAvailableResourceResponse> describeEnsSaleControlAvailableResource(DescribeEnsSaleControlAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeEnsSaleControlStock  DescribeEnsSaleControlStockRequest
     * @return DescribeEnsSaleControlStockResponse
     */
    CompletableFuture<DescribeEnsSaleControlStockResponse> describeEnsSaleControlStock(DescribeEnsSaleControlStockRequest request);

    /**
     * @param request the request parameters of DescribeEpnBandWidthData  DescribeEpnBandWidthDataRequest
     * @return DescribeEpnBandWidthDataResponse
     */
    CompletableFuture<DescribeEpnBandWidthDataResponse> describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request);

    /**
     * @param request the request parameters of DescribeEpnBandwitdhByInternetChargeType  DescribeEpnBandwitdhByInternetChargeTypeRequest
     * @return DescribeEpnBandwitdhByInternetChargeTypeResponse
     */
    CompletableFuture<DescribeEpnBandwitdhByInternetChargeTypeResponse> describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>In internal networking mode, the value of Instances is empty in the response. In public networking mode, the value of VSwitches is empty in the response.</p>
     * 
     * @param request the request parameters of DescribeEpnInstanceAttribute  DescribeEpnInstanceAttributeRequest
     * @return DescribeEpnInstanceAttributeResponse
     */
    CompletableFuture<DescribeEpnInstanceAttributeResponse> describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeEpnInstances  DescribeEpnInstancesRequest
     * @return DescribeEpnInstancesResponse
     */
    CompletableFuture<DescribeEpnInstancesResponse> describeEpnInstances(DescribeEpnInstancesRequest request);

    /**
     * @param request the request parameters of DescribeEpnMeasurementData  DescribeEpnMeasurementDataRequest
     * @return DescribeEpnMeasurementDataResponse
     */
    CompletableFuture<DescribeEpnMeasurementDataResponse> describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query information about all custom images in your account. The information include the image properties, image export status, and the Object Storage Service (OSS) download links.</p>
     * <ul>
     * <li>Empty strings are returned for images that are not exported.</li>
     * <li>The download links may become invalid if you delete objects in OSS.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeExportImageInfo  DescribeExportImageInfoRequest
     * @return DescribeExportImageInfoResponse
     */
    CompletableFuture<DescribeExportImageInfoResponse> describeExportImageInfo(DescribeExportImageInfoRequest request);

    /**
     * @param request the request parameters of DescribeExportImageStatus  DescribeExportImageStatusRequest
     * @return DescribeExportImageStatusResponse
     */
    CompletableFuture<DescribeExportImageStatusResponse> describeExportImageStatus(DescribeExportImageStatusRequest request);

    /**
     * @param request the request parameters of DescribeFileSystems  DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request);

    /**
     * @param request the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    /**
     * @param request the request parameters of DescribeHaVips  DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     */
    CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request);

    /**
     * @param request the request parameters of DescribeImageInfos  DescribeImageInfosRequest
     * @return DescribeImageInfosResponse
     */
    CompletableFuture<DescribeImageInfosResponse> describeImageInfos(DescribeImageInfosRequest request);

    /**
     * @param request the request parameters of DescribeImageSharePermission  DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     */
    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    /**
     * @param request the request parameters of DescribeImages  DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAutoRenewAttribute  DescribeInstanceAutoRenewAttributeRequest
     * @return DescribeInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceBandwidthDetail  DescribeInstanceBandwidthDetailRequest
     * @return DescribeInstanceBandwidthDetailResponse
     */
    CompletableFuture<DescribeInstanceBandwidthDetailResponse> describeInstanceBandwidthDetail(DescribeInstanceBandwidthDetailRequest request);

    /**
     * @param request the request parameters of DescribeInstanceBootConfiguration  DescribeInstanceBootConfigurationRequest
     * @return DescribeInstanceBootConfigurationResponse
     */
    CompletableFuture<DescribeInstanceBootConfigurationResponse> describeInstanceBootConfiguration(DescribeInstanceBootConfigurationRequest request);

    /**
     * @param request the request parameters of DescribeInstanceMonitorData  DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
     */
    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSDGStatus  DescribeInstanceSDGStatusRequest
     * @return DescribeInstanceSDGStatusResponse
     */
    CompletableFuture<DescribeInstanceSDGStatusResponse> describeInstanceSDGStatus(DescribeInstanceSDGStatusRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSpec  DescribeInstanceSpecRequest
     * @return DescribeInstanceSpecResponse
     */
    CompletableFuture<DescribeInstanceSpecResponse> describeInstanceSpec(DescribeInstanceSpecRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 800 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per user.</li>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeKeyPairs  DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerAttribute  DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPListenerAttribute  DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPSListenerAttribute  DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerListenMonitor  DescribeLoadBalancerListenMonitorRequest
     * @return DescribeLoadBalancerListenMonitorResponse
     */
    CompletableFuture<DescribeLoadBalancerListenMonitorResponse> describeLoadBalancerListenMonitor(DescribeLoadBalancerListenMonitorRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerListeners  DescribeLoadBalancerListenersRequest
     * @return DescribeLoadBalancerListenersResponse
     */
    CompletableFuture<DescribeLoadBalancerListenersResponse> describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerSpec  DescribeLoadBalancerSpecRequest
     * @return DescribeLoadBalancerSpecResponse
     */
    CompletableFuture<DescribeLoadBalancerSpecResponse> describeLoadBalancerSpec(DescribeLoadBalancerSpecRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerTCPListenerAttribute  DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerUDPListenerAttribute  DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancers  DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    /**
     * @param request the request parameters of DescribeMeasurementData  DescribeMeasurementDataRequest
     * @return DescribeMeasurementDataResponse
     */
    CompletableFuture<DescribeMeasurementDataResponse> describeMeasurementData(DescribeMeasurementDataRequest request);

    /**
     * @param request the request parameters of DescribeMountTargets  DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    CompletableFuture<DescribeMountTargetsResponse> describeMountTargets(DescribeMountTargetsRequest request);

    /**
     * @param request the request parameters of DescribeNCInformation  DescribeNCInformationRequest
     * @return DescribeNCInformationResponse
     */
    CompletableFuture<DescribeNCInformationResponse> describeNCInformation(DescribeNCInformationRequest request);

    /**
     * @param request the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    /**
     * @param request the request parameters of DescribeNetworkAcls  DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     */
    CompletableFuture<DescribeNetworkAclsResponse> describeNetworkAcls(DescribeNetworkAclsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNetworkAttribute  DescribeNetworkAttributeRequest
     * @return DescribeNetworkAttributeResponse
     */
    CompletableFuture<DescribeNetworkAttributeResponse> describeNetworkAttribute(DescribeNetworkAttributeRequest request);

    /**
     * @param request the request parameters of DescribeNetworkInterfaces  DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     */
    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNetworks  DescribeNetworksRequest
     * @return DescribeNetworksResponse
     */
    CompletableFuture<DescribeNetworksResponse> describeNetworks(DescribeNetworksRequest request);

    /**
     * @param request the request parameters of DescribePrePaidInstanceStock  DescribePrePaidInstanceStockRequest
     * @return DescribePrePaidInstanceStockResponse
     */
    CompletableFuture<DescribePrePaidInstanceStockResponse> describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request);

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeRegionIsps  DescribeRegionIspsRequest
     * @return DescribeRegionIspsResponse
     */
    CompletableFuture<DescribeRegionIspsResponse> describeRegionIsps(DescribeRegionIspsRequest request);

    /**
     * @param request the request parameters of DescribeRegionResource  DescribeRegionResourceRequest
     * @return DescribeRegionResourceResponse
     */
    CompletableFuture<DescribeRegionResourceResponse> describeRegionResource(DescribeRegionResourceRequest request);

    /**
     * @param request the request parameters of DescribeReservedResource  DescribeReservedResourceRequest
     * @return DescribeReservedResourceResponse
     */
    CompletableFuture<DescribeReservedResourceResponse> describeReservedResource(DescribeReservedResourceRequest request);

    /**
     * @param request the request parameters of DescribeResourceTimeline  DescribeResourceTimelineRequest
     * @return DescribeResourceTimelineResponse
     */
    CompletableFuture<DescribeResourceTimelineResponse> describeResourceTimeline(DescribeResourceTimelineRequest request);

    /**
     * @param request the request parameters of DescribeSDG  DescribeSDGRequest
     * @return DescribeSDGResponse
     */
    CompletableFuture<DescribeSDGResponse> describeSDG(DescribeSDGRequest request);

    /**
     * @param request the request parameters of DescribeSDGDeploymentStatus  DescribeSDGDeploymentStatusRequest
     * @return DescribeSDGDeploymentStatusResponse
     */
    CompletableFuture<DescribeSDGDeploymentStatusResponse> describeSDGDeploymentStatus(DescribeSDGDeploymentStatusRequest request);

    /**
     * @param request the request parameters of DescribeSDGs  DescribeSDGsRequest
     * @return DescribeSDGsResponse
     */
    CompletableFuture<DescribeSDGsResponse> describeSDGs(DescribeSDGsRequest request);

    /**
     * @param request the request parameters of DescribeSecondaryPublicIpAddresses  DescribeSecondaryPublicIpAddressesRequest
     * @return DescribeSecondaryPublicIpAddressesResponse
     */
    CompletableFuture<DescribeSecondaryPublicIpAddressesResponse> describeSecondaryPublicIpAddresses(DescribeSecondaryPublicIpAddressesRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroupAttribute  DescribeSecurityGroupAttributeRequest
     * @return DescribeSecurityGroupAttributeResponse
     */
    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * @param request the request parameters of DescribeSelfImages  DescribeSelfImagesRequest
     * @return DescribeSelfImagesResponse
     */
    CompletableFuture<DescribeSelfImagesResponse> describeSelfImages(DescribeSelfImagesRequest request);

    /**
     * @param request the request parameters of DescribeServcieSchedule  DescribeServcieScheduleRequest
     * @return DescribeServcieScheduleResponse
     */
    CompletableFuture<DescribeServcieScheduleResponse> describeServcieSchedule(DescribeServcieScheduleRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeServerLoadBalancerListenMonitor  DescribeServerLoadBalancerListenMonitorRequest
     * @return DescribeServerLoadBalancerListenMonitorResponse
     */
    CompletableFuture<DescribeServerLoadBalancerListenMonitorResponse> describeServerLoadBalancerListenMonitor(DescribeServerLoadBalancerListenMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeServerLoadBalancerMonitor  DescribeServerLoadBalancerMonitorRequest
     * @return DescribeServerLoadBalancerMonitorResponse
     */
    CompletableFuture<DescribeServerLoadBalancerMonitorResponse> describeServerLoadBalancerMonitor(DescribeServerLoadBalancerMonitorRequest request);

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeSnatAttribute  DescribeSnatAttributeRequest
     * @return DescribeSnatAttributeResponse
     */
    CompletableFuture<DescribeSnatAttributeResponse> describeSnatAttribute(DescribeSnatAttributeRequest request);

    /**
     * @param request the request parameters of DescribeSnatTableEntries  DescribeSnatTableEntriesRequest
     * @return DescribeSnatTableEntriesResponse
     */
    CompletableFuture<DescribeSnatTableEntriesResponse> describeSnatTableEntries(DescribeSnatTableEntriesRequest request);

    /**
     * @param request the request parameters of DescribeStorageGateway  DescribeStorageGatewayRequest
     * @return DescribeStorageGatewayResponse
     */
    CompletableFuture<DescribeStorageGatewayResponse> describeStorageGateway(DescribeStorageGatewayRequest request);

    /**
     * @param request the request parameters of DescribeStorageVolume  DescribeStorageVolumeRequest
     * @return DescribeStorageVolumeResponse
     */
    CompletableFuture<DescribeStorageVolumeResponse> describeStorageVolume(DescribeStorageVolumeRequest request);

    /**
     * @param request the request parameters of DescribeUserBandWidthData  DescribeUserBandWidthDataRequest
     * @return DescribeUserBandWidthDataResponse
     */
    CompletableFuture<DescribeUserBandWidthDataResponse> describeUserBandWidthData(DescribeUserBandWidthDataRequest request);

    /**
     * @param request the request parameters of DescribeVSwitchAttributes  DescribeVSwitchAttributesRequest
     * @return DescribeVSwitchAttributesResponse
     */
    CompletableFuture<DescribeVSwitchAttributesResponse> describeVSwitchAttributes(DescribeVSwitchAttributesRequest request);

    /**
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DetachDisk  DetachDiskRequest
     * @return DetachDiskResponse
     */
    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    /**
     * @param request the request parameters of DetachInstanceSDG  DetachInstanceSDGRequest
     * @return DetachInstanceSDGResponse
     */
    CompletableFuture<DetachInstanceSDGResponse> detachInstanceSDG(DetachInstanceSDGRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot detach a primary ENI from an instance.</li>
     * <li>The ENI must be in the InUse state.</li>
     * <li>The instances are in the Stopped state.</li>
     * <li>This operation is an asynchronous operation. After this operation is called to detach an ENI, you can check the state of the ENI to determine whether the ENI is detached.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachNetworkInterface  DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     */
    CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of DistApplicationData  DistApplicationDataRequest
     * @return DistApplicationDataResponse
     */
    CompletableFuture<DistApplicationDataResponse> distApplicationData(DistApplicationDataRequest request);

    /**
     * @param request the request parameters of ExportBillDetailData  ExportBillDetailDataRequest
     * @return ExportBillDetailDataResponse
     */
    CompletableFuture<ExportBillDetailDataResponse> exportBillDetailData(ExportBillDetailDataRequest request);

    /**
     * @param request the request parameters of ExportImage  ExportImageRequest
     * @return ExportImageResponse
     */
    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    /**
     * @param request the request parameters of ExportMeasurementData  ExportMeasurementDataRequest
     * @return ExportMeasurementDataResponse
     */
    CompletableFuture<ExportMeasurementDataResponse> exportMeasurementData(ExportMeasurementDataRequest request);

    /**
     * @param request the request parameters of GetBucketAcl  GetBucketAclRequest
     * @return GetBucketAclResponse
     */
    CompletableFuture<GetBucketAclResponse> getBucketAcl(GetBucketAclRequest request);

    /**
     * @param request the request parameters of GetBucketInfo  GetBucketInfoRequest
     * @return GetBucketInfoResponse
     */
    CompletableFuture<GetBucketInfoResponse> getBucketInfo(GetBucketInfoRequest request);

    /**
     * @param request the request parameters of GetBucketLifecycle  GetBucketLifecycleRequest
     * @return GetBucketLifecycleResponse
     */
    CompletableFuture<GetBucketLifecycleResponse> getBucketLifecycle(GetBucketLifecycleRequest request);

    /**
     * @param request the request parameters of GetOssStorageAndAccByBuckets  GetOssStorageAndAccByBucketsRequest
     * @return GetOssStorageAndAccByBucketsResponse
     */
    CompletableFuture<GetOssStorageAndAccByBucketsResponse> getOssStorageAndAccByBuckets(GetOssStorageAndAccByBucketsRequest request);

    /**
     * <b>description</b> :
     * <p>The query and aggregation granularity of bandwidth and storage usage cannot exceed one day. Data aggregation is to collect the maximum values of usage data within a period of time.</p>
     * 
     * @param request the request parameters of GetOssUsageData  GetOssUsageDataRequest
     * @return GetOssUsageDataResponse
     */
    CompletableFuture<GetOssUsageDataResponse> getOssUsageData(GetOssUsageDataRequest request);

    /**
     * @param request the request parameters of ImportImage  ImportImageRequest
     * @return ImportImageResponse
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
     * <b>description</b> :
     * <p>  After the key pair is imported, ENS stores the public key. You must securely store the private key.</p>
     * <ul>
     * <li>The key pair can be only in the ssh-rsa format.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
     * @param request the request parameters of JoinPublicIpsToEpnInstance  JoinPublicIpsToEpnInstanceRequest
     * @return JoinPublicIpsToEpnInstanceResponse
     */
    CompletableFuture<JoinPublicIpsToEpnInstanceResponse> joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to add an instance to a security group, make sure that the instance is in the Stopped or Running state.</p>
     * 
     * @param request the request parameters of JoinSecurityGroup  JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
     * @param request the request parameters of JoinVSwitchesToEpnInstance  JoinVSwitchesToEpnInstanceRequest
     * @return JoinVSwitchesToEpnInstanceResponse
     */
    CompletableFuture<JoinVSwitchesToEpnInstanceResponse> joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you remove an instance from a security group, the instance must be in the Stopped or Running state.</p>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListBuckets  ListBucketsRequest
     * @return ListBucketsResponse
     */
    CompletableFuture<ListBucketsResponse> listBuckets(ListBucketsRequest request);

    /**
     * @param request the request parameters of ListObjects  ListObjectsRequest
     * @return ListObjectsResponse
     */
    CompletableFuture<ListObjectsResponse> listObjects(ListObjectsRequest request);

    /**
     * @param request the request parameters of ListProductAbilities  ListProductAbilitiesRequest
     * @return ListProductAbilitiesResponse
     */
    CompletableFuture<ListProductAbilitiesResponse> listProductAbilities(ListProductAbilitiesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyEnsEipAddressAttribute  ModifyEnsEipAddressAttributeRequest
     * @return ModifyEnsEipAddressAttributeResponse
     */
    CompletableFuture<ModifyEnsEipAddressAttributeResponse> modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request);

    /**
     * @param request the request parameters of ModifyEnsRouteEntry  ModifyEnsRouteEntryRequest
     * @return ModifyEnsRouteEntryResponse
     */
    CompletableFuture<ModifyEnsRouteEntryResponse> modifyEnsRouteEntry(ModifyEnsRouteEntryRequest request);

    /**
     * @param request the request parameters of ModifyEpnInstance  ModifyEpnInstanceRequest
     * @return ModifyEpnInstanceResponse
     */
    CompletableFuture<ModifyEpnInstanceResponse> modifyEpnInstance(ModifyEpnInstanceRequest request);

    /**
     * @param request the request parameters of ModifyFileSystem  ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    /**
     * @param request the request parameters of ModifyForwardEntry  ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
     */
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
     * @param request the request parameters of ModifyHaVipAttribute  ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     */
    CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request);

    /**
     * @param request the request parameters of ModifyImageAttribute  ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
     * @param request the request parameters of ModifyImageSharePermission  ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>  If an instance is in the Starting state, you cannot reset the password of the instance.</p>
     * <ul>
     * <li>When the instance is in the Running state, you cannot change the password of the instance.</li>
     * <li>After resetting the password, you must Restart the instance in the ECS console or call the RebootInstance operation to validate the modifications. The restart operation within the instance does not validate the modifications.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAutoRenewAttribute  ModifyInstanceAutoRenewAttributeRequest
     * @return ModifyInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceBootConfiguration  ModifyInstanceBootConfigurationRequest
     * @return ModifyInstanceBootConfigurationResponse
     */
    CompletableFuture<ModifyInstanceBootConfigurationResponse> modifyInstanceBootConfiguration(ModifyInstanceBootConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of ENS.
     * The instances must be in the Running or Stopped state, and you have no overdue payments for them.</p>
     * 
     * @param request the request parameters of ModifyInstanceChargeType  ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyLoadBalancerAttribute  ModifyLoadBalancerAttributeRequest
     * @return ModifyLoadBalancerAttributeResponse
     */
    CompletableFuture<ModifyLoadBalancerAttributeResponse> modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNetworkAttribute  ModifyNetworkAttributeRequest
     * @return ModifyNetworkAttributeResponse
     */
    CompletableFuture<ModifyNetworkAttributeResponse> modifyNetworkAttribute(ModifyNetworkAttributeRequest request);

    /**
     * @param request the request parameters of ModifyNetworkInterfaceAttribute  ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     */
    CompletableFuture<ModifyNetworkInterfaceAttributeResponse> modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupAttribute  ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     */
    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    /**
     * @param request the request parameters of ModifySnapshotAttribute  ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
    CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request);

    /**
     * @param request the request parameters of ModifySnatEntry  ModifySnatEntryRequest
     * @return ModifySnatEntryResponse
     */
    CompletableFuture<ModifySnatEntryResponse> modifySnatEntry(ModifySnatEntryRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVSwitchAttribute  ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
     */
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
     * @param request the request parameters of MountInstanceSDG  MountInstanceSDGRequest
     * @return MountInstanceSDGResponse
     */
    CompletableFuture<MountInstanceSDGResponse> mountInstanceSDG(MountInstanceSDGRequest request);

    /**
     * @param request the request parameters of PreloadRegionSDG  PreloadRegionSDGRequest
     * @return PreloadRegionSDGResponse
     */
    CompletableFuture<PreloadRegionSDGResponse> preloadRegionSDG(PreloadRegionSDGRequest request);

    /**
     * @param request the request parameters of PrepareUpload  PrepareUploadRequest
     * @return PrepareUploadResponse
     */
    CompletableFuture<PrepareUploadResponse> prepareUpload(PrepareUploadRequest request);

    /**
     * @param request the request parameters of PushApplicationData  PushApplicationDataRequest
     * @return PushApplicationDataResponse
     */
    CompletableFuture<PushApplicationDataResponse> pushApplicationData(PushApplicationDataRequest request);

    /**
     * @param request the request parameters of PutBucket  PutBucketRequest
     * @return PutBucketResponse
     */
    CompletableFuture<PutBucketResponse> putBucket(PutBucketRequest request);

    /**
     * @param request the request parameters of PutBucketAcl  PutBucketAclRequest
     * @return PutBucketAclResponse
     */
    CompletableFuture<PutBucketAclResponse> putBucketAcl(PutBucketAclRequest request);

    /**
     * <b>description</b> :
     * <p>  You can configure up to 1,000 rules.</p>
     * <ul>
     * <li>If an object meets multiple rules, the rule that has the earliest expiration time prevails.</li>
     * </ul>
     * 
     * @param request the request parameters of PutBucketLifecycle  PutBucketLifecycleRequest
     * @return PutBucketLifecycleResponse
     */
    CompletableFuture<PutBucketLifecycleResponse> putBucketLifecycle(PutBucketLifecycleRequest request);

    /**
     * @param request the request parameters of ReInitDisk  ReInitDiskRequest
     * @return ReInitDiskResponse
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
     * @param request the request parameters of RebootAICInstance  RebootAICInstanceRequest
     * @return RebootAICInstanceResponse
     */
    CompletableFuture<RebootAICInstanceResponse> rebootAICInstance(RebootAICInstanceRequest request);

    /**
     * @param request the request parameters of RebootARMServerInstance  RebootARMServerInstanceRequest
     * @return RebootARMServerInstanceResponse
     */
    CompletableFuture<RebootARMServerInstanceResponse> rebootARMServerInstance(RebootARMServerInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Only instances that are in the Running state can be restarted.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
     * @param request the request parameters of RebootInstances  RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
     * @param request the request parameters of RecoverAICInstance  RecoverAICInstanceRequest
     * @return RecoverAICInstanceResponse
     */
    CompletableFuture<RecoverAICInstanceResponse> recoverAICInstance(RecoverAICInstanceRequest request);

    /**
     * @param request the request parameters of ReinitInstance  ReinitInstanceRequest
     * @return ReinitInstanceResponse
     */
    CompletableFuture<ReinitInstanceResponse> reinitInstance(ReinitInstanceRequest request);

    /**
     * @param request the request parameters of ReinitInstances  ReinitInstancesRequest
     * @return ReinitInstancesResponse
     */
    CompletableFuture<ReinitInstancesResponse> reinitInstances(ReinitInstancesRequest request);

    /**
     * @param request the request parameters of ReleaseAICInstance  ReleaseAICInstanceRequest
     * @return ReleaseAICInstanceResponse
     */
    CompletableFuture<ReleaseAICInstanceResponse> releaseAICInstance(ReleaseAICInstanceRequest request);

    /**
     * @param request the request parameters of ReleaseARMServerInstance  ReleaseARMServerInstanceRequest
     * @return ReleaseARMServerInstanceResponse
     */
    CompletableFuture<ReleaseARMServerInstanceResponse> releaseARMServerInstance(ReleaseARMServerInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10,000 times per second per account.</p>
     * <ul>
     * <li>The maximum number of times that each user can call this operation per second is 50.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of ReleasePostPaidInstance  ReleasePostPaidInstanceRequest
     * @return ReleasePostPaidInstanceResponse
     */
    CompletableFuture<ReleasePostPaidInstanceResponse> releasePostPaidInstance(ReleasePostPaidInstanceRequest request);

    /**
     * @param request the request parameters of ReleasePrePaidInstance  ReleasePrePaidInstanceRequest
     * @return ReleasePrePaidInstanceResponse
     */
    CompletableFuture<ReleasePrePaidInstanceResponse> releasePrePaidInstance(ReleasePrePaidInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveBackendServers  RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    /**
     * @param request the request parameters of RemoveInstanceSDG  RemoveInstanceSDGRequest
     * @return RemoveInstanceSDGResponse
     */
    CompletableFuture<RemoveInstanceSDGResponse> removeInstanceSDG(RemoveInstanceSDGRequest request);

    /**
     * @param request the request parameters of RemovePublicIpsFromEpnInstance  RemovePublicIpsFromEpnInstanceRequest
     * @return RemovePublicIpsFromEpnInstanceResponse
     */
    CompletableFuture<RemovePublicIpsFromEpnInstanceResponse> removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request);

    /**
     * @param request the request parameters of RemoveSDG  RemoveSDGRequest
     * @return RemoveSDGResponse
     */
    CompletableFuture<RemoveSDGResponse> removeSDG(RemoveSDGRequest request);

    /**
     * @param request the request parameters of RemoveVSwitchesFromEpnInstance  RemoveVSwitchesFromEpnInstanceRequest
     * @return RemoveVSwitchesFromEpnInstanceResponse
     */
    CompletableFuture<RemoveVSwitchesFromEpnInstanceResponse> removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request);

    /**
     * @param request the request parameters of RenewARMServerInstance  RenewARMServerInstanceRequest
     * @return RenewARMServerInstanceResponse
     */
    CompletableFuture<RenewARMServerInstanceResponse> renewARMServerInstance(RenewARMServerInstanceRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RescaleApplication  RescaleApplicationRequest
     * @return RescaleApplicationResponse
     */
    CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request);

    /**
     * @param request the request parameters of RescaleDeviceService  RescaleDeviceServiceRequest
     * @return RescaleDeviceServiceResponse
     */
    CompletableFuture<RescaleDeviceServiceResponse> rescaleDeviceService(RescaleDeviceServiceRequest request);

    /**
     * @param request the request parameters of ResetAICInstance  ResetAICInstanceRequest
     * @return ResetAICInstanceResponse
     */
    CompletableFuture<ResetAICInstanceResponse> resetAICInstance(ResetAICInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the In Use (In_Use) or Unattached (Available) state.</li>
     * <li>The instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the <a href="~~StopInstance~~">StopInstance</a> operation to stop an instance.</li>
     * <li>The specified snapshot must be created from the disk specified by the DiskId parameter.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an ENS instance by calling the <a href="~~DescribeInstances~~">DescribeInstances</a> operation, the instance is locked for security reasons and no operations are allowed on the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDisk  ResetDiskRequest
     * @return ResetDiskResponse
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
     * @param request the request parameters of ResizeDisk  ResizeDiskRequest
     * @return ResizeDiskResponse
     */
    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    /**
     * <b>description</b> :
     * <p>  In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * <ul>
     * <li>You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.</li>
     * <li>You can specify one or more of the following parameters to remove access control for a CIDR block: IpProtocol, PortRange, Policy, and SourceCidrIp.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RevokeSecurityGroupEgress  RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
     * @param request the request parameters of RollbackApplication  RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    /**
     * @param request the request parameters of RunInstances  RunInstancesRequest
     * @return RunInstancesResponse
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    /**
     * @param request the request parameters of RunServiceSchedule  RunServiceScheduleRequest
     * @return RunServiceScheduleResponse
     */
    CompletableFuture<RunServiceScheduleResponse> runServiceSchedule(RunServiceScheduleRequest request);

    /**
     * @param request the request parameters of SaveSDG  SaveSDGRequest
     * @return SaveSDGResponse
     */
    CompletableFuture<SaveSDGResponse> saveSDG(SaveSDGRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of SetBackendServers  SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPListenerAttribute  SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPSListenerAttribute  SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerStatus  SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerTCPListenerAttribute  SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerUDPListenerAttribute  SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    /**
     * @param request the request parameters of StartEpnInstance  StartEpnInstanceRequest
     * @return StartEpnInstanceResponse
     */
    CompletableFuture<StartEpnInstanceResponse> startEpnInstance(StartEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the operation only when the instance is in the Stopped state.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * @param request the request parameters of StartInstances  StartInstancesRequest
     * @return StartInstancesResponse
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of StartLoadBalancerListener  StartLoadBalancerListenerRequest
     * @return StartLoadBalancerListenerResponse
     */
    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    /**
     * @param request the request parameters of StartSnatIpForSnatEntry  StartSnatIpForSnatEntryRequest
     * @return StartSnatIpForSnatEntryResponse
     */
    CompletableFuture<StartSnatIpForSnatEntryResponse> startSnatIpForSnatEntry(StartSnatIpForSnatEntryRequest request);

    /**
     * @param request the request parameters of StopEpnInstance  StopEpnInstanceRequest
     * @return StopEpnInstanceResponse
     */
    CompletableFuture<StopEpnInstanceResponse> stopEpnInstance(StopEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to stop instances that are only in the Running state.</p>
     * <ul>
     * <li>If the call is successful, the state of the instance becomes Stopping.</li>
     * <li>Once the instance is stopped, the state of the instance becomes Stopped.</li>
     * <li>Force stop is supported, which is equivalent to power-off. Data that is not written to disks on the instance may be lost.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of StopInstances  StopInstancesRequest
     * @return StopInstancesResponse
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of StopLoadBalancerListener  StopLoadBalancerListenerRequest
     * @return StopLoadBalancerListenerResponse
     */
    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    /**
     * @param request the request parameters of StopSnatIpForSnatEntry  StopSnatIpForSnatEntryRequest
     * @return StopSnatIpForSnatEntryResponse
     */
    CompletableFuture<StopSnatIpForSnatEntryResponse> stopSnatIpForSnatEntry(StopSnatIpForSnatEntryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add tags to a resource, Alibaba Cloud checks the number of existing tags on the resource. If the number exceeds the upper limit, an error message is returned. Only instance resources, such as virtual machines and bare machines, are supported.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnAssociateEnsEipAddress  UnAssociateEnsEipAddressRequest
     * @return UnAssociateEnsEipAddressResponse
     */
    CompletableFuture<UnAssociateEnsEipAddressResponse> unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request);

    /**
     * @param request the request parameters of UnassignPrivateIpAddresses  UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     */
    CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request);

    /**
     * @param request the request parameters of UnassociateHaVip  UnassociateHaVipRequest
     * @return UnassociateHaVipResponse
     */
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    /**
     * @param request the request parameters of UnassociateNetworkAcl  UnassociateNetworkAclRequest
     * @return UnassociateNetworkAclResponse
     */
    CompletableFuture<UnassociateNetworkAclResponse> unassociateNetworkAcl(UnassociateNetworkAclRequest request);

    /**
     * @param request the request parameters of UnloadRegionSDG  UnloadRegionSDGRequest
     * @return UnloadRegionSDGResponse
     */
    CompletableFuture<UnloadRegionSDGResponse> unloadRegionSDG(UnloadRegionSDGRequest request);

    /**
     * @param request the request parameters of UnmountInstanceSDG  UnmountInstanceSDGRequest
     * @return UnmountInstanceSDGResponse
     */
    CompletableFuture<UnmountInstanceSDGResponse> unmountInstanceSDG(UnmountInstanceSDGRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateEnsSaleControl  UpdateEnsSaleControlRequest
     * @return UpdateEnsSaleControlResponse
     */
    CompletableFuture<UpdateEnsSaleControlResponse> updateEnsSaleControl(UpdateEnsSaleControlRequest request);

    /**
     * @param request the request parameters of UpgradeAICInstanceImage  UpgradeAICInstanceImageRequest
     * @return UpgradeAICInstanceImageResponse
     */
    CompletableFuture<UpgradeAICInstanceImageResponse> upgradeAICInstanceImage(UpgradeAICInstanceImageRequest request);

    /**
     * @param request the request parameters of UpgradeApplication  UpgradeApplicationRequest
     * @return UpgradeApplicationResponse
     */
    CompletableFuture<UpgradeApplicationResponse> upgradeApplication(UpgradeApplicationRequest request);

}
