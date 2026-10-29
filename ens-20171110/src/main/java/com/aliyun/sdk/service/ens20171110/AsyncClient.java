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
     * <ul>
     * <li>API call rate limit: 100 calls per second.</li>
     * <li>Per-user call rate limit: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of AddBackendServers  AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 5 calls per second.</li>
     * <li>Internal networks and IPv4 are not supported.</li>
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
     * <p>When you invoke this operation to associate a high availability virtual IP address (HaVip), take note of the following items:</p>
     * <ul>
     * <li>After a HaVip is associated, you do not need to restart the ENS instance. However, you must configure the HaVip on the elastic network interface controller (NIC) of the ENS instance.</li>
     * <li>The HaVip and the ENS instance to be associated must belong to the same vSwitch.</li>
     * <li>The ENS instance to be associated must be in the Running or Stopped state.</li>
     * <li>The HaVip instance must be in the Available or InUse state.</li>
     * <li>The AssociateHaVip operation is an asynchronous operation. After you invoke this operation, the system returns a request ID, but the HaVip is not immediately associated. The association task is still running in the background. You can invoke the DescribeHaVips operation to query the association status of the HaVip:<ul>
     * <li>If the HaVip is in the Associating state, the HaVip is being associated.</li>
     * </ul>
     * <ul>
     * <li>If the HaVip is in the InUse state, the HaVip is associated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
     */
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
     * <b>description</b> :
     * <p>The maximum number of secondary CIDR blocks that you can add to a network is as follows:</p>
     * <ul>
     * <li>A network supports up to five secondary IPv4 CIDR blocks.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateNetworkCidrBlock  AssociateNetworkCidrBlockRequest
     * @return AssociateNetworkCidrBlockResponse
     */
    CompletableFuture<AssociateNetworkCidrBlockResponse> associateNetworkCidrBlock(AssociateNetworkCidrBlockRequest request);

    /**
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>After the command script is successfully executed, the instance automatically restarts.</li>
     * <li>Instance requirements: The minimum instance specification is 2 vCPUs and 4 GiB of memory, and the image must be CentOS 7.4 or later.
     * &lt;props=&quot;china&quot;&gt;Before you call this operation, you must <a href="https://cs.console.aliyun.com/#/k8s/overview">activate Container Service for Kubernetes</a>.</li>
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
     * @param request the request parameters of AttachInstancesToNodePool  AttachInstancesToNodePoolRequest
     * @return AttachInstancesToNodePoolResponse
     */
    CompletableFuture<AttachInstancesToNodePoolResponse> attachInstancesToNodePool(AttachInstancesToNodePoolRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This batch operation attaches a key pair to instances. You can only perform this operation on stopped instances.</p>
     * <ul>
     * <li>You can attach the key pair to a maximum of 30 instances in a single call.</li>
     * <li>You must specify at least one of the KeyPairName and KeyPairId parameters.</li>
     * <li>Specify KeyPairId when you call this operation. The KeyPairName parameter will be deprecated.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>Note the following when you call this operation:</p>
     * <ul>
     * <li>The elastic network interfaces (ENIs) must be in the Available state.</li>
     * <li>Each ENI can be attached to only one instance in the same zone and VPC at a time.</li>
     * <li>The instance must be in the Stopped state.</li>
     * <li>You can attach up to 10 elastic network interfaces (ENIs) to an instance.</li>
     * <li>This operation is asynchronous. After the call succeeds, you can query the ENI status to check the operation result.</li>
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
     * <p>In the API documentation for security groups, the initiator of traffic is the source, and the receiver of data transmission is the destination.</p>
     * 
     * @param request the request parameters of AuthorizeSecurityGroupEgress  AuthorizeSecurityGroupEgressRequest
     * @return AuthorizeSecurityGroupEgressResponse
     */
    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This O&amp;M operation currently supports only the following event type: Instance:SystemUpgrade.Migrate (migration required due to underlying infrastructure upgrade).</li>
     * </ul>
     * 
     * @param request the request parameters of BatchEventMigrateInstance  BatchEventMigrateInstanceRequest
     * @return BatchEventMigrateInstanceResponse
     */
    CompletableFuture<BatchEventMigrateInstanceResponse> batchEventMigrateInstance(BatchEventMigrateInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This O&amp;M operation currently supports only the following event type: Instance:SystemMaintenance.Reboot (instance restart due to system maintenance).</li>
     * </ul>
     * 
     * @param request the request parameters of BatchEventRebootInstance  BatchEventRebootInstanceRequest
     * @return BatchEventRebootInstanceResponse
     */
    CompletableFuture<BatchEventRebootInstanceResponse> batchEventRebootInstance(BatchEventRebootInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This O&amp;M operation currently supports only the following event types: Instance:SystemFailure.Redeploy (instance redeployment due to system failures) and Instance:SystemMaintenance.Redeploy (instance redeployment due to system maintenance).</li>
     * </ul>
     * 
     * @param request the request parameters of BatchEventRedeployInstance  BatchEventRedeployInstanceRequest
     * @return BatchEventRedeployInstanceResponse
     */
    CompletableFuture<BatchEventRedeployInstanceResponse> batchEventRedeployInstance(BatchEventRedeployInstanceRequest request);

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
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>Cluster creation is an asynchronous operation. After you call this operation, you must wait 10 to 20 minutes for the cluster to be initialized. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>Creating a cluster is an asynchronous operation. After the API call returns, you must wait 10 to 20 minutes for the cluster initialization to complete. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateClusterNodePool  CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     */
    CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request);

    /**
     * @param request the request parameters of CreateDisk  CreateDiskRequest
     * @return CreateDiskResponse
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call frequency: 5000 calls per second.</li>
     * <li>Per-user call frequency: 50 calls per second.</li>
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
     * <ul>
     * <li>Per-user call frequency: 10 calls per second.</li>
     * <li>Because instance creation is an asynchronous operation, increase the request timeout as needed. When the API returns Code=0, this only indicates that the request was successful, not that the instance was created successfully. An instance ID is returned upon a successful request. You can then query the instance by its ID to check whether the instance is created.</li>
     * <li>InvalidUserData.NotInWhiteList restriction: Only accounts that are added to the relevant whitelist with purchase permissions can create instances. Otherwise, an error is returned.</li>
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
     * <ul>
     * <li>API rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 5 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPListener  CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPSListener  CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 requests per second.</li>
     * <li>Per-user call rate: 10 requests per second.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancerTCPListener  CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Per-user call rate: 10 calls per second.</li>
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
     * <ul>
     * <li>API rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 5 calls per second.</li>
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
     * <p>A Data Sharing Group (SDG) can be regarded as an image of a data partition on a virtual device. You can save a data partition of a virtual device as an SDG. A created SDG can be used for deployment to the data partitions of other virtual devices to enable fast data distribution and application. The workflow for SDG-related operations is as follows:</p>
     * <ul>
     * <li>Call the <a href="~~CreateSDG~~">CreateSDG</a> operation to create an SDG. The SDG is bound to AIC instance A (InstanceId). After the SDG is created, an empty cloud disk (also known as the original cloud disk) is mounted to instance A (InstanceId) for SDG creation.</li>
     * <li>Perform required operations on AIC instance A (InstanceId), such as installing applications and distributing files.</li>
     * <li>Call the <a href="~~SaveSDG~~">SaveSDG</a> operation to save the data cloud disk on AIC instance A as SDG A.</li>
     * <li>Call the <a href="~~DeploySDG~~">DeploySDG</a> operation to deploy SDG A to another AIC instance B. This process is executed asynchronously. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to query the status of AIC instance B. When the status changes back to success, AIC instance B is available, and the applications on AIC instance B are identical to those on AIC instance A.
     * <strong>Before you begin</strong></li>
     * <li>Before you call this operation, the AIC instance must be in the <strong>success</strong> state. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation and check the AICInstances[].State field to confirm the status.</li>
     * <li>It usually takes 30 to 60 minutes to create an ARM server. Wait until the State changes from <strong>creating</strong> to <strong>success</strong> before you call this operation.</li>
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
     * @param request the request parameters of CreateSecurityGroupPermissions  CreateSecurityGroupPermissionsRequest
     * @return CreateSecurityGroupPermissionsResponse
     */
    CompletableFuture<CreateSecurityGroupPermissionsResponse> createSecurityGroupPermissions(CreateSecurityGroupPermissionsRequest request);

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
     * @param request the request parameters of DeleteAICPublicKey  DeleteAICPublicKeyRequest
     * @return DeleteAICPublicKeyResponse
     */
    CompletableFuture<DeleteAICPublicKeyResponse> deleteAICPublicKey(DeleteAICPublicKeyRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only the Alibaba Cloud account that owns the bucket can delete it.</li>
     * <li>A bucket must be empty before it can be deleted.</li>
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
     * <p>You can specify the RetainResources parameter when you delete a cluster. The default value is false. If you set this parameter to true, the Edge Node Service (ENS) compute instances on which worker nodes run are retained.
     * When you delete a cluster, all nodes and node pools in the cluster are automatically deleted. ENS compute instances that you manually added by using scripts obtained from the DescribeAttachScript operation are retained.
     * If a node pool in the cluster is being scaled out or in, wait until the scaling process is complete before you delete the cluster.</p>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call frequency per user: 10 calls per second.</li>
     * <li>Creating a cluster is an asynchronous operation. After the API call returns, wait 10 to 20 minutes for the cluster initialization to complete. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteClusterNodePool  DeleteClusterNodePoolRequest
     * @return DeleteClusterNodePoolResponse
     */
    CompletableFuture<DeleteClusterNodePoolResponse> deleteClusterNodePool(DeleteClusterNodePoolRequest request);

    /**
     * <b>description</b> :
     * <p>If ReleaseNode is set to false, you must manually stop the kubelet process on the node before you call DeleteClusterNodes. Otherwise, the node may automatically rejoin the cluster.</p>
     * 
     * @param request the request parameters of DeleteClusterNodes  DeleteClusterNodesRequest
     * @return DeleteClusterNodesResponse
     */
    CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request);

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
     * <b>description</b> :
     * <p>Deletes a NAS file system. Before deleting the file system, call DeleteMountTarget to delete all mount targets of the file system. After DeleteMountTarget succeeds, there is an eventual consistency window. Poll DescribeFileSystems to confirm that MountTargets is empty before calling this API operation.</p>
     * 
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
     * <ul>
     * <li>After you delete an SSH key pair, you can no longer query the key pair by calling the DescribeKeyPairs operation.</li>
     * <li>If you delete an SSH key pair that is bound to an Edge Node Service (ENS) instance, ENS no longer stores the SSH key pair. However, you can still use the key pair to access the instance. When you call the DescribeInstance operation to query instance information, no other information but the name of the key pair (<strong>KeyPairName</strong>) is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
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
     * @param request the request parameters of DeleteNetworkPeerConnection  DeleteNetworkPeerConnectionRequest
     * @return DeleteNetworkPeerConnectionResponse
     */
    CompletableFuture<DeleteNetworkPeerConnectionResponse> deleteNetworkPeerConnection(DeleteNetworkPeerConnectionRequest request);

    /**
     * @param request the request parameters of DeleteObject  DeleteObjectRequest
     * @return DeleteObjectResponse
     */
    CompletableFuture<DeleteObjectResponse> deleteObject(DeleteObjectRequest request);

    /**
     * <b>description</b> :
     * <p>If all SDGs associated with the original cloud disk are deleted, the original cloud disk is automatically cleaned up.</p>
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
     * @param request the request parameters of DeleteSecurityGroupPermissions  DeleteSecurityGroupPermissionsRequest
     * @return DeleteSecurityGroupPermissionsResponse
     */
    CompletableFuture<DeleteSecurityGroupPermissionsResponse> deleteSecurityGroupPermissions(DeleteSecurityGroupPermissionsRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAddon  DescribeAddonRequest
     * @return DescribeAddonResponse
     */
    CompletableFuture<DescribeAddonResponse> describeAddon(DescribeAddonRequest request);

    /**
     * @param request the request parameters of DescribeApplication  DescribeApplicationRequest
     * @return DescribeApplicationResponse
     */
    CompletableFuture<DescribeApplicationResponse> describeApplication(DescribeApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Queries available resources. A successful business response is indicated by Code=0 in the response body. Do not confuse the business code in the response body with the HTTP status code.</p>
     * 
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
     * <ul>
     * <li>Single-user call frequency: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * @param request the request parameters of DescribeClusterAttachScripts  DescribeClusterAttachScriptsRequest
     * @return DescribeClusterAttachScriptsResponse
     */
    CompletableFuture<DescribeClusterAttachScriptsResponse> describeClusterAttachScripts(DescribeClusterAttachScriptsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterDetail  DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     */
    CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Single-user call frequency: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterKubeConfig  DescribeClusterKubeConfigRequest
     * @return DescribeClusterKubeConfigResponse
     */
    CompletableFuture<DescribeClusterKubeConfigResponse> describeClusterKubeConfig(DescribeClusterKubeConfigRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterNodePools  DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     */
    CompletableFuture<DescribeClusterNodePoolsResponse> describeClusterNodePools(DescribeClusterNodePoolsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterNodes  DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     */
    CompletableFuture<DescribeClusterNodesResponse> describeClusterNodes(DescribeClusterNodesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 100 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterUserKubeconfig  DescribeClusterUserKubeconfigRequest
     * @return DescribeClusterUserKubeconfigResponse
     */
    CompletableFuture<DescribeClusterUserKubeconfigResponse> describeClusterUserKubeconfig(DescribeClusterUserKubeconfigRequest request);

    /**
     * @param request the request parameters of DescribeClustersV1  DescribeClustersV1Request
     * @return DescribeClustersV1Response
     */
    CompletableFuture<DescribeClustersV1Response> describeClustersV1(DescribeClustersV1Request request);

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
     * <b>description</b> :
     * <p>Queries the pre-push results of application data. Before calling this operation, make sure that your account has activated the Edge Node Service (ENS) edge application hosting service.</p>
     * 
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
     * <ul>
     * <li>to query information about all custom images in your account. The information include the image properties, image export status, and the Object Storage Service (OSS) download links.</li>
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
     * @param request the request parameters of DescribeForwardEntryAttribute  DescribeForwardEntryAttributeRequest
     * @return DescribeForwardEntryAttributeResponse
     */
    CompletableFuture<DescribeForwardEntryAttributeResponse> describeForwardEntryAttribute(DescribeForwardEntryAttributeRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>EventTypes must specify at least one event type for the query. Multiple event types can be queried at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHistoryEvents  DescribeHistoryEventsRequest
     * @return DescribeHistoryEventsResponse
     */
    CompletableFuture<DescribeHistoryEventsResponse> describeHistoryEvents(DescribeHistoryEventsRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Request parameters act as filters. Filters are evaluated by using the logical AND operator. If a parameter is empty, the corresponding filter does not take effect. However, if InstanceIds is set to an empty JSON array, the filter is considered valid and an empty result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceBandwidthDetail  DescribeInstanceBandwidthDetailRequest
     * @return DescribeInstanceBandwidthDetailResponse
     */
    CompletableFuture<DescribeInstanceBandwidthDetailResponse> describeInstanceBandwidthDetail(DescribeInstanceBandwidthDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the boot configuration. This operation is supported only for heterogeneous instances (PCFarm bare metal instances).</p>
     * 
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
     * <ul>
     * <li>API call frequency: 800 calls per second.</li>
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
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>API call rate per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerAttribute  DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPListenerAttribute  DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPSListenerAttribute  DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
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
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Per-user call rate: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerTCPListenerAttribute  DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API rate limit: 100 requests per second (RPS).</li>
     * <li>Per-user rate limit: 10 RPS.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerUDPListenerAttribute  DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 10 calls per second.</li>
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
     * @param request the request parameters of DescribeNASAvailableResourceInfo  DescribeNASAvailableResourceInfoRequest
     * @return DescribeNASAvailableResourceInfoResponse
     */
    CompletableFuture<DescribeNASAvailableResourceInfoResponse> describeNASAvailableResourceInfo(DescribeNASAvailableResourceInfoRequest request);

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
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 10 calls per second.</li>
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
     * @param request the request parameters of DescribeNetworkPeerConnections  DescribeNetworkPeerConnectionsRequest
     * @return DescribeNetworkPeerConnectionsResponse
     */
    CompletableFuture<DescribeNetworkPeerConnectionsResponse> describeNetworkPeerConnections(DescribeNetworkPeerConnectionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 10 calls per second.</li>
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
     * @param request the request parameters of DescribeSDGSharedDisks  DescribeSDGSharedDisksRequest
     * @return DescribeSDGSharedDisksResponse
     */
    CompletableFuture<DescribeSDGSharedDisksResponse> describeSDGSharedDisks(DescribeSDGSharedDisksRequest request);

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
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Per-user call rate: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeServerLoadBalancerListenMonitor  DescribeServerLoadBalancerListenMonitorRequest
     * @return DescribeServerLoadBalancerListenMonitorResponse
     */
    CompletableFuture<DescribeServerLoadBalancerListenMonitorResponse> describeServerLoadBalancerListenMonitor(DescribeServerLoadBalancerListenMonitorRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call frequency: 100 calls per second.</li>
     * <li>Per-user call frequency: 10 calls per second.</li>
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
     * <h2>Usage notes</h2>
     * <p>This operation detaches a key pair from multiple instances in a batch. The target instances must be in a stopped state.</p>
     * <ul>
     * <li>You can detach a key pair from a maximum of 30 instances in a single request.</li>
     * <li>The operation returns an error if you specify the <code>KeyPairName</code> parameter and any of the specified instances are not associated with that key pair name.</li>
     * <li>You must specify either the <code>KeyPairName</code> or <code>KeyPairId</code> parameter.</li>
     * <li>We recommend using the <code>KeyPairId</code> parameter. The <code>KeyPairName</code> parameter will be deprecated in a future release.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>This O&amp;M operation currently supports only the following event type: Instance:SystemUpgrade.Migrate (migration required for underlying upgrades).</li>
     * </ul>
     * 
     * @param request the request parameters of EventMigrateInstance  EventMigrateInstanceRequest
     * @return EventMigrateInstanceResponse
     */
    CompletableFuture<EventMigrateInstanceResponse> eventMigrateInstance(EventMigrateInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This O&amp;M operation currently supports only the following event type: Instance:SystemMaintenance.Reboot (instance restart due to system maintenance).</li>
     * </ul>
     * 
     * @param request the request parameters of EventRebootInstance  EventRebootInstanceRequest
     * @return EventRebootInstanceResponse
     */
    CompletableFuture<EventRebootInstanceResponse> eventRebootInstance(EventRebootInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This O\&amp;M operation supports only the following event types: <code>Instance:SystemFailure.Redeploy</code> (redeployment due to a system failure) and <code>Instance:SystemMaintenance.Redeploy</code> (redeployment for system maintenance).</li>
     * </ul>
     * 
     * @param request the request parameters of EventRedeployInstance  EventRedeployInstanceRequest
     * @return EventRedeployInstanceResponse
     */
    CompletableFuture<EventRedeployInstanceResponse> eventRedeployInstance(EventRedeployInstanceRequest request);

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
     * <b>description</b> :
     * <p>It can be deleted only when the instance group information is empty.</p>
     * 
     * @param request the request parameters of GetClusterAddonInstance  GetClusterAddonInstanceRequest
     * @return GetClusterAddonInstanceResponse
     */
    CompletableFuture<GetClusterAddonInstanceResponse> getClusterAddonInstance(GetClusterAddonInstanceRequest request);

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
     * <ul>
     * <li>After the key pair is imported, Alibaba Cloud ENS stores the public key. You must securely store the private key of the key pair.</li>
     * <li>Only the ssh-rsa format is supported.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
     * @param request the request parameters of InitializeENSECKServiceRole  InitializeENSECKServiceRoleRequest
     * @return InitializeENSECKServiceRoleResponse
     */
    CompletableFuture<InitializeENSECKServiceRoleResponse> initializeENSECKServiceRole(InitializeENSECKServiceRoleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The rate limit is 10 calls per second per user.</li>
     * <li>Cluster creation is an asynchronous operation. After the API call returns, wait 10 to 20 minutes for the cluster initialization to complete. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of InstallClusterAddons  InstallClusterAddonsRequest
     * @return InstallClusterAddonsResponse
     */
    CompletableFuture<InstallClusterAddonsResponse> installClusterAddons(InstallClusterAddonsRequest request);

    /**
     * @param request the request parameters of JoinPublicIpsToEpnInstance  JoinPublicIpsToEpnInstanceRequest
     * @return JoinPublicIpsToEpnInstanceResponse
     */
    CompletableFuture<JoinPublicIpsToEpnInstanceResponse> joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you To add an instance to a security group, make sure that the instance is in the Stopped or Running state.</p>
     * 
     * @param request the request parameters of JoinSecurityGroup  JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For the internal network connection and internal network connection with intelligent acceleration modes, instances in the vSwitch take effect automatically and do not require manual addition. For the intelligent acceleration public public mode, you only need to call the API operation to add instances to the public public mode instance information.</p>
     * 
     * @param request the request parameters of JoinVSwitchesToEpnInstance  JoinVSwitchesToEpnInstanceRequest
     * @return JoinVSwitchesToEpnInstanceResponse
     */
    CompletableFuture<JoinVSwitchesToEpnInstanceResponse> joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The instance must be in the Stopped or Running state before you remove it from a security group.</p>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
     * @param request the request parameters of ListAICPublicKeyDeliveries  ListAICPublicKeyDeliveriesRequest
     * @return ListAICPublicKeyDeliveriesResponse
     */
    CompletableFuture<ListAICPublicKeyDeliveriesResponse> listAICPublicKeyDeliveries(ListAICPublicKeyDeliveriesRequest request);

    /**
     * @param request the request parameters of ListAICPublicKeys  ListAICPublicKeysRequest
     * @return ListAICPublicKeysResponse
     */
    CompletableFuture<ListAICPublicKeysResponse> listAICPublicKeys(ListAICPublicKeysRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

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
     * @param request the request parameters of ListClusterAddonInstances  ListClusterAddonInstancesRequest
     * @return ListClusterAddonInstancesResponse
     */
    CompletableFuture<ListClusterAddonInstancesResponse> listClusterAddonInstances(ListClusterAddonInstancesRequest request);

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
     * @param request the request parameters of ManageAICLogin  ManageAICLoginRequest
     * @return ManageAICLoginResponse
     */
    CompletableFuture<ManageAICLoginResponse> manageAICLogin(ManageAICLoginRequest request);

    /**
     * @param request the request parameters of ModifyAICInstanceType  ModifyAICInstanceTypeRequest
     * @return ModifyAICInstanceTypeResponse
     */
    CompletableFuture<ModifyAICInstanceTypeResponse> modifyAICInstanceType(ModifyAICInstanceTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies an installed add-on in an ECK cluster. The target cluster must be in the running state, and ComponentName must reference an installed add-on.</p>
     * 
     * @param request the request parameters of ModifyClusterAddon  ModifyClusterAddonRequest
     * @return ModifyClusterAddonResponse
     */
    CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>Cluster creation is an asynchronous operation. After you call the API operation, you must wait 10 to 20 minutes for the cluster initialization to complete. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyClusterNodePool  ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     */
    CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request);

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
     * <ul>
     * <li>You cannot reset the password of an instance when the instance status is Starting.</li>
     * <li>You cannot modify the password of an instance when the instance status is Running.</li>
     * <li>After you reset the password, you must restart the instance in the console or invoke the RebootInstance operation for the changes to take effect. Restarting the instance from within the operating system does not take effect.</li>
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
     * <b>description</b> :
     * <p>Modifies the boot configuration of a heterogeneous instance (PCFarm bare metal instance, where InstanceTypeFamily is pc_bmi). If the current state of the instance does not support this operation, the API returns IncorrectInstanceStatus.</p>
     * 
     * @param request the request parameters of ModifyInstanceBootConfiguration  ModifyInstanceBootConfigurationRequest
     * @return ModifyInstanceBootConfigurationResponse
     */
    CompletableFuture<ModifyInstanceBootConfigurationResponse> modifyInstanceBootConfiguration(ModifyInstanceBootConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Edge Node Service (ENS).
     * The target instance must be in the Running or Stopped state and must not have an overdue payment before you can change the billing method.</p>
     * 
     * @param request the request parameters of ModifyInstanceChargeType  ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the ENS instance must be in the Stopped state.
     * Note the following when you modify the attributes:</p>
     * <ul>
     * <li>Instance:<ul>
     * <li>Instances associated with load balancing are not supported.</li>
     * </ul>
     * </li>
     * <li>Network:<ul>
     * <li>Instances bound to an elastic IP address (EIP) are not supported.</li>
     * <li>Instances bound to a high-availability virtual IP address (HAVIP) are not supported.</li>
     * <li>Instances used as the next hop in a route table are not supported.</li>
     * <li>Instances bound to secondary elastic network interfaces (ENIs) are not supported.</li>
     * <li>Instances configured with secondary IP addresses are not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkAttribute  ModifyInstanceNetworkAttributeRequest
     * @return ModifyInstanceNetworkAttributeResponse
     */
    CompletableFuture<ModifyInstanceNetworkAttributeResponse> modifyInstanceNetworkAttribute(ModifyInstanceNetworkAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyLoadBalancerAttribute  ModifyLoadBalancerAttributeRequest
     * @return ModifyLoadBalancerAttributeResponse
     */
    CompletableFuture<ModifyLoadBalancerAttributeResponse> modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit: 100 requests per second.</li>
     * <li>up to 5 times per second per user.</li>
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
     * <b>description</b> :
     * <p>Modifies the instance type of a subscription instance. Before calling this operation, stop the instance by calling StopInstance. After the specification change is complete, start the instance by calling StartInstance.</p>
     * 
     * @param request the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit: 100 requests per second.</li>
     * <li>up to 5 times per second per user.</li>
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
     * <ul>
     * <li>API rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 5 calls per second.</li>
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
     * <ul>
     * <li>Up to 1,000 rules are supported.</li>
     * <li>If an object matches multiple rules, the rule with the earliest expiration time takes precedence.</li>
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
     * <ul>
     * <li>Only instances that are in the Running state can be restarted.</li>
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
     * <ul>
     * <li>up to 10,000 times per second per account.</li>
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
     * @param request the request parameters of RemoveSDGs  RemoveSDGsRequest
     * @return RemoveSDGsResponse
     */
    CompletableFuture<RemoveSDGsResponse> removeSDGs(RemoveSDGsRequest request);

    /**
     * @param request the request parameters of RemoveVSwitchesFromEpnInstance  RemoveVSwitchesFromEpnInstanceRequest
     * @return RemoveVSwitchesFromEpnInstanceResponse
     */
    CompletableFuture<RemoveVSwitchesFromEpnInstanceResponse> removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Renews a subscription AIC server instance. The instance State must be success. You can call DescribeARMServerInstances to query the instance status. Instances in intermediate states such as creating cannot be renewed.</p>
     * 
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
     * <ul>
     * <li>In security group API documentation, the traffic initiator is referred to as the source (Source), and the data transmission receiver is referred to as the destination (Dest).</li>
     * <li>Any one of the following sets of parameters can identify an inbound security group rule. Specifying only a single parameter cannot identify a security group rule.</li>
     * <li>Revoke permission settings for a specified IP address range: IpProtocol, PortRange, Policy, SourceCidrIp.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>In the API documentation for security groups, the end that initiates traffic is referred to as the source, and the end that receives data is referred to as the destination (Dest).</p>
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
     * <b>description</b> :
     * <p>Saves a Shared Data Group (SDG). SDGs in the failed status cannot be saved. Before calling this operation, call DescribeSDGs to query the current status.</p>
     * 
     * @param request the request parameters of SaveSDG  SaveSDGRequest
     * @return SaveSDGResponse
     */
    CompletableFuture<SaveSDGResponse> saveSDG(SaveSDGRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>Scaling out a node pool is an asynchronous operation. After you call the operation, you must wait 5 to 10 minutes for the task to complete.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleClusterNodePool  ScaleClusterNodePoolRequest
     * @return ScaleClusterNodePoolResponse
     */
    CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request);

    /**
     * @param request the request parameters of SetBackendServers  SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call frequency: 100 calls per second.</li>
     * <li>Per-user call frequency: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPListenerAttribute  SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API rate limit: 100 calls per second.</li>
     * <li>Rate limit per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPSListenerAttribute  SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Call rate per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerStatus  SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate limit: 100 calls per second.</li>
     * <li>Per-user call rate limit: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerTCPListenerAttribute  SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API call rate: 100 calls per second.</li>
     * <li>Rate limit per user: 10 calls per second.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerUDPListenerAttribute  SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    /**
     * @param request the request parameters of ShareAICImage  ShareAICImageRequest
     * @return ShareAICImageResponse
     */
    CompletableFuture<ShareAICImageResponse> shareAICImage(ShareAICImageRequest request);

    /**
     * @param request the request parameters of StartEpnInstance  StartEpnInstanceRequest
     * @return StartEpnInstanceResponse
     */
    CompletableFuture<StartEpnInstanceResponse> startEpnInstance(StartEpnInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call the operation only when the instance is in the Stopped state.</li>
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
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
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
     * <ul>
     * <li>to stop instances that are only in the Running state.</li>
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
     * <ul>
     * <li>up to 100 times per second per account.</li>
     * <li>up to 10 times per second per user.</li>
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
     * <b>description</b> :
     * <p>Uninstalls add-ons from an ECK cluster. The target cluster must be in the running state. You can call DescribeClustersV1 to query the cluster state and wait until the cluster initialization is complete before you call this operation.</p>
     * 
     * @param request the request parameters of UnInstallClusterAddons  UnInstallClusterAddonsRequest
     * @return UnInstallClusterAddonsResponse
     */
    CompletableFuture<UnInstallClusterAddonsResponse> unInstallClusterAddons(UnInstallClusterAddonsRequest request);

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
     * <b>description</b> :
     * <p>Before deleting a secondary CIDR block from a network, delete the vSwitches created in the secondary CIDR block.</p>
     * 
     * @param request the request parameters of UnassociateNetworkCidrBlock  UnassociateNetworkCidrBlockRequest
     * @return UnassociateNetworkCidrBlockResponse
     */
    CompletableFuture<UnassociateNetworkCidrBlockResponse> unassociateNetworkCidrBlock(UnassociateNetworkCidrBlockRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Rate limit per user: 10 calls per second.</li>
     * <li>Updating the cluster certificate is an asynchronous operation. After you call the API operation, wait 5 to 10 minutes for the cluster certificate to be updated and the control components to restart. During this process, you can call the DescribeClustersV1 operation to query the update status of the cluster certificate. After the cluster certificate is updated, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateClusterCertificate  UpdateClusterCertificateRequest
     * @return UpdateClusterCertificateResponse
     */
    CompletableFuture<UpdateClusterCertificateResponse> updateClusterCertificate(UpdateClusterCertificateRequest request);

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

    /**
     * <b>description</b> :
     * <ul>
     * <li>The maximum call frequency per user is 10 calls per second.</li>
     * <li>Creating a cluster is an asynchronous operation. After the API call returns, you must wait 10 to 20 minutes for the cluster initialization to complete. During this process, you can call the DescribeClustersV1 operation to query the cluster creation status. After the cluster is created, you can call the DescribeClusterUserKubeconfig operation to obtain the cluster certificate.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeClusterAddons  UpgradeClusterAddonsRequest
     * @return UpgradeClusterAddonsResponse
     */
    CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request);

    /**
     * @param request the request parameters of UploadAICPublicKey  UploadAICPublicKeyRequest
     * @return UploadAICPublicKeyResponse
     */
    CompletableFuture<UploadAICPublicKeyResponse> uploadAICPublicKey(UploadAICPublicKeyRequest request);

}
