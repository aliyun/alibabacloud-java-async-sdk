// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ga20191120.models.*;
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
     * <b>description</b> :
     * <p>  <strong>AddEntriesToAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL to which you want to add IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that IP entries are added to the ACL. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that IP entries are added to the ACL.</p>
     * <ul>
     * <li>The <strong>AddEntriesToAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of AddEntriesToAcl  AddEntriesToAclRequest
     * @return AddEntriesToAclResponse
     */
    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>AssociateAclsWithListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of the listener with which you attempt to associate an ACL.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the ACL is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the ACL is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAclsWithListener</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAclsWithListener  AssociateAclsWithListenerRequest
     * @return AssociateAclsWithListenerResponse
     */
    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  Only HTTPS listeners can be associated with additional certificates.</p>
     * <ul>
     * <li><strong>AssociateAdditionalCertificatesWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener with which you want to associate an additional certificate.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateAdditionalCertificatesWithListener</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAdditionalCertificatesWithListener  AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    /**
     * @param request the request parameters of AssociateResources  AssociateResourcesRequest
     * @return AssociateResourcesResponse
     */
    CompletableFuture<AssociateResourcesResponse> associateResources(AssociateResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>AttachDdosToAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is being associated with the GA instance. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro or Anti-DDoS Premium instance is associated with the GA instance.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AttachDdosToAccelerator</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDdosToAccelerator  AttachDdosToAcceleratorRequest
     * @return AttachDdosToAcceleratorResponse
     */
    CompletableFuture<AttachDdosToAcceleratorResponse> attachDdosToAccelerator(AttachDdosToAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>AttachLogStoreToEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that a Logstore is associated with the group.</p>
     * <ul>
     * <li>The <strong>AttachLogStoreToEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachLogStoreToEndpointGroup  AttachLogStoreToEndpointGroupRequest
     * @return AttachLogStoreToEndpointGroupResponse
     */
    CompletableFuture<AttachLogStoreToEndpointGroupResponse> attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageAddAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you want to associate.
     *     *   If the bandwidth plan is in the <strong>binding</strong> state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is associated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageAddAccelerator</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of BandwidthPackageAddAccelerator  BandwidthPackageAddAcceleratorRequest
     * @return BandwidthPackageAddAcceleratorResponse
     */
    CompletableFuture<BandwidthPackageAddAcceleratorResponse> bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>BandwidthPackageRemoveAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan that you attempt to disassociate.
     *     *   If the bandwidth plan is in the <strong>unbinding</strong> state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
     *     *   If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is disassociated.</p>
     * <ul>
     * <li>The <strong>BandwidthPackageRemoveAccelerator</strong> cannot be called repeatedly for the same GA instance.</li>
     * </ul>
     * 
     * @param request the request parameters of BandwidthPackageRemoveAccelerator  BandwidthPackageRemoveAcceleratorRequest
     * @return BandwidthPackageRemoveAcceleratorResponse
     */
    CompletableFuture<BandwidthPackageRemoveAcceleratorResponse> bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>ChangeResourceGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</p>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>ConfigEndpointProbe</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that latency monitoring is configured for the endpoint.</p>
     * <ul>
     * <li>The <strong>ConfigEndpointProbe</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigEndpointProbe  ConfigEndpointProbeRequest
     * @return ConfigEndpointProbeResponse
     */
    CompletableFuture<ConfigEndpointProbeResponse> configEndpointProbe(ConfigEndpointProbeRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p><strong>CreateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the state of a GA instance.</p>
     * <ul>
     * <li>If the GA instance is in the <strong>init</strong> state, it indicates that the GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the GA instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccelerator  CreateAcceleratorRequest
     * @return CreateAcceleratorResponse
     */
    CompletableFuture<CreateAcceleratorResponse> createAccelerator(CreateAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the state of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>init</strong> state, the ACL is being created. In this case, you can only perform only query operations.</li>
     * <li>If the ACL is in the <strong>active</strong> state, the ACL is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAcl  CreateAclRequest
     * @return CreateAclResponse
     */
    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <strong>CreateApplicationMonitor</strong> operation to create an origin probing task. An origin probing task monitors the network quality between a client and an origin server and checks the availability of the origin server.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create origin detection tasks only for subscription Standard Global Accelerator (GA) instances whose specification is Medium Ⅰ.</li>
     * <li>You cannot create an origin probe task for a UDP listener.</li>
     * <li>The service port of the URL or IP address that is probed must be within the listening port range.</li>
     * <li><strong>CreateApplicationMonitor</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the status of the origin probing task.<ul>
     * <li>If the origin probing task is in the <strong>init</strong> state, it indicates that the task is being created. You can perform only query operations.</li>
     * <li>If the origin probing task is in the <strong>active</strong> state, it indicates that the task is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateApplicationMonitor</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApplicationMonitor  CreateApplicationMonitorRequest
     * @return CreateApplicationMonitorResponse
     */
    CompletableFuture<CreateApplicationMonitorResponse> createApplicationMonitor(CreateApplicationMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:</p>
     * <ul>
     * <li><strong>Basic</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.</li>
     * <li><strong>Enhanced</strong>: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.</li>
     * <li><strong>Premium</strong>: Both the default acceleration region and the default service region are outside the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the bandwidth plan.<ul>
     * <li>If the bandwidth plan is in the <strong>init</strong> state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan is in the <strong>active</strong> state, it indicates that the bandwidth plan is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateBandwidthPackage</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBandwidthPackage  CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     */
    CompletableFuture<CreateBandwidthPackageResponse> createBandwidthPackage(CreateBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIp</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address:
     *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
     *     *   If the accelerated IP address is in the <strong>active</strong> state, the accelerated IP address is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIp</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicAccelerateIp  CreateBasicAccelerateIpRequest
     * @return CreateBasicAccelerateIpResponse
     */
    CompletableFuture<CreateBasicAccelerateIpResponse> createBasicAccelerateIp(CreateBasicAccelerateIpRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
     *     *   If the status of the accelerated IP address and endpoint is <strong>binding</strong>, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
     *     *   If the status of the accelerated IP address and endpoint is <strong>bound</strong> and the status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP address is associated with the endpoint.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicAccelerateIpEndpointRelation  CreateBasicAccelerateIpEndpointRelationRequest
     * @return CreateBasicAccelerateIpEndpointRelationResponse
     */
    CompletableFuture<CreateBasicAccelerateIpEndpointRelationResponse> createBasicAccelerateIpEndpointRelation(CreateBasicAccelerateIpEndpointRelationRequest request);

    /**
     * <b>description</b> :
     * <p>  The <strong>CreateBasicAccelerateIpEndpointRelations</strong> is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> or <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
     *     *   If an accelerated IP address and the endpoint are in the <strong>binding</strong> state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
     *     *   If all the accelerated IP addresses and the endpoint are in the <strong>bound</strong> state, and the association status returned by the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> API operation is <strong>active</strong>, the accelerated IP addresses are associated with the endpoints.</p>
     * <ul>
     * <li>The <strong>CreateBasicAccelerateIpEndpointRelations</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicAccelerateIpEndpointRelations  CreateBasicAccelerateIpEndpointRelationsRequest
     * @return CreateBasicAccelerateIpEndpointRelationsResponse
     */
    CompletableFuture<CreateBasicAccelerateIpEndpointRelationsResponse> createBasicAccelerateIpEndpointRelations(CreateBasicAccelerateIpEndpointRelationsRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateBasicAccelerator</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> or <a href="https://help.aliyun.com/document_detail/353189.html">ListBasicAccelerators</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the basic GA instance is in the <strong>init</strong> state, it indicates that the basic GA instance is being created. In this case, you can perform only query operations.</li>
     * <li>If the basic GA instance is in the <strong>active</strong> state, it indicates that the basic GA instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicAccelerator  CreateBasicAcceleratorRequest
     * @return CreateBasicAcceleratorResponse
     */
    CompletableFuture<CreateBasicAcceleratorResponse> createBasicAccelerator(CreateBasicAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> API operation to query the status of an endpoint.
     *     *   If the endpoint is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint is in the <strong>active</strong> state, the endpoint is created.</p>
     * <ul>
     * <li>The <strong>CreateBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicEndpoint  CreateBasicEndpointRequest
     * @return CreateBasicEndpointResponse
     */
    CompletableFuture<CreateBasicEndpointResponse> createBasicEndpoint(CreateBasicEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns an endpoint group ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>init</strong> state, the endpoint is being created. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the endpoint group is created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpointGroup</strong> operation again on the same GA instance before the previous request is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicEndpointGroup  CreateBasicEndpointGroupRequest
     * @return CreateBasicEndpointGroupResponse
     */
    CompletableFuture<CreateBasicEndpointGroupResponse> createBasicEndpointGroup(CreateBasicEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateBasicEndpoints</strong> is an asynchronous operation. After you call this operation, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints. - If one or more endpoints are in the <strong>init</strong> state, it indicates that the endpoints are being created. In this case, you can continue to perform query operations on the endpoints. If all endpoints are in the <strong>active</strong> state, it indicates that the endpoints are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateBasicEndpoints</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicEndpoints  CreateBasicEndpointsRequest
     * @return CreateBasicEndpointsResponse
     */
    CompletableFuture<CreateBasicEndpointsResponse> createBasicEndpoints(CreateBasicEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following limits:</p>
     * <ul>
     * <li>You can specify only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.</li>
     * <li><strong>CreateBasicIpSet</strong> is an asynchronous operation. After you send a request, the system returns an acceleration region ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>init</strong> state, the acceleration region is being created. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, the acceleration region is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateBasicIpSet</strong> operation again on the same GA instance before the previous task is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBasicIpSet  CreateBasicIpSetRequest
     * @return CreateBasicIpSetResponse
     */
    CompletableFuture<CreateBasicIpSetResponse> createBasicIpSet(CreateBasicIpSetRequest request);

    /**
     * <b>description</b> :
     * <p>readAndWrite</p>
     * 
     * @param request the request parameters of CreateCustomRoutingEndpointGroupDestinations  CreateCustomRoutingEndpointGroupDestinationsRequest
     * @return CreateCustomRoutingEndpointGroupDestinationsResponse
     */
    CompletableFuture<CreateCustomRoutingEndpointGroupDestinationsResponse> createCustomRoutingEndpointGroupDestinations(CreateCustomRoutingEndpointGroupDestinationsRequest request);

    /**
     * <b>description</b> :
     * <p>Global Accelerator (GA) forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.</p>
     * <ul>
     * <li>After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.</li>
     * <li>After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * You can call this operation to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see <a href="https://help.aliyun.com/document_detail/153259.html">CreateEndpointGroup</a>.
     * When you call this operation, take note of the following items:</li>
     * <li><strong>CreateCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/449374.html">ListCustomRoutingEndpointGroups</a> operation to query the status of the endpoint groups that are associated with custom routing listeners.<ul>
     * <li>If one or more endpoint groups are in the <strong>init</strong> state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.</li>
     * <li>If all endpoint groups are in the <strong>active</strong> state, it indicates that the endpoint groups are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpointGroups</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>Make sure that the following requirements are met before you call this operation:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>A bandwidth plan is associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomRoutingEndpointGroups  CreateCustomRoutingEndpointGroupsRequest
     * @return CreateCustomRoutingEndpointGroupsResponse
     */
    CompletableFuture<CreateCustomRoutingEndpointGroupsResponse> createCustomRoutingEndpointGroups(CreateCustomRoutingEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation takes effect only when the traffic access policy of an endpoint allows traffic to specified destinations. You can call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation to query the traffic access policy of an endpoint. This operation takes effect only if the value of <strong>TrafficToEndpointPolicy</strong> is set to <strong>AllowCustom</strong>, which allows traffic to specific destinations.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being created. In this state, you can only query the traffic destinations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the traffic destinations are created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateCustomRoutingEndpointTrafficPolicies</strong> operation repeatedly for the same GA instance in a specific period of time.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>A standard GA instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>If the bandwidth metering method of the standard GA instance is <strong>pay-by-bandwidth</strong>, a bandwidth plan must be associated with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>An application that serves as the endpoint of the standard GA instance is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>The permissions to use custom routing listeners are acquired, and a custom routing listener is created. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Endpoint groups are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * <li>Endpoints are created for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449382.html">CreateCustomRoutingEndpoints</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomRoutingEndpointTrafficPolicies  CreateCustomRoutingEndpointTrafficPoliciesRequest
     * @return CreateCustomRoutingEndpointTrafficPoliciesResponse
     */
    CompletableFuture<CreateCustomRoutingEndpointTrafficPoliciesResponse> createCustomRoutingEndpointTrafficPolicies(CreateCustomRoutingEndpointTrafficPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, the protocols and port ranges of the associated endpoint groups, and the IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
     * This operation is used to create endpoints for custom routing listeners. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group and determine whether endpoints are created in the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that endpoints are being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that endpoints are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateCustomRoutingEndpoints</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <p>The following operations are complete before you call this operation:</p>
     * <ul>
     * <li>Create a standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a>.</li>
     * <li>Associate a bandwidth plan with the standard GA instance. For more information, see <a href="https://help.aliyun.com/document_detail/153239.html">BandwidthPackageAddAccelerator</a>.</li>
     * <li>Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.</li>
     * <li>Apply for permissions to use custom routing listeners and create a custom routing listener for the standard GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see <a href="https://help.aliyun.com/document_detail/153253.html">CreateListener</a>.</li>
     * <li>Create an endpoint group for the custom routing listener. For more information, see <a href="https://help.aliyun.com/document_detail/449363.html">CreateCustomRoutingEndpointGroups</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomRoutingEndpoints  CreateCustomRoutingEndpointsRequest
     * @return CreateCustomRoutingEndpointsResponse
     */
    CompletableFuture<CreateCustomRoutingEndpointsResponse> createCustomRoutingEndpoints(CreateCustomRoutingEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>After you associate an accelerated domain name that has obtained an ICP number with a Global Accelerator (GA) instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
     * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.</li>
     * <li>The same accelerated domain name cannot be repeatedly associated with the same GA instance.</li>
     * <li>You cannot repeatedly call the <strong>CreateDomain</strong> operation by using the same Alibaba Cloud account within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual endpoint group for a Layer 4 listener, make sure that a default endpoint group is created.</p>
     * <ul>
     * <li><strong>CreateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of the endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>init</strong> state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the endpoint group is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEndpointGroup  CreateEndpointGroupRequest
     * @return CreateEndpointGroupResponse
     */
    CompletableFuture<CreateEndpointGroupResponse> createEndpointGroup(CreateEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create multiple endpoint groups at a time. However, you cannot create a default endpoint group and a virtual endpoint group at the same time.</p>
     * <ul>
     * <li>You cannot create a virtual endpoint group for a Layer 4 listener. To create a virtual endpoint group for a Layer 4 listener, call the <a href="https://help.aliyun.com/document_detail/2302394.html">CreateEndpointGroup</a> operation.</li>
     * <li><strong>CreateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of endpoint groups.<ul>
     * <li>If the endpoint groups are in the <strong>init</strong> state, the endpoint groups are being created. In this case, you can perform only query operations.</li>
     * <li>If all endpoint groups are in the <strong>active</strong> state, the endpoint groups are created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEndpointGroups  CreateEndpointGroupsRequest
     * @return CreateEndpointGroupsResponse
     */
    CompletableFuture<CreateEndpointGroupsResponse> createEndpointGroups(CreateEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create forwarding rules, we recommend that you learn how forwarding rules work and how requests are matched against forwarding rules. For more information, see <a href="https://help.aliyun.com/document_detail/204224.html">Configure forwarding rules</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateForwardingRules</strong> is an asynchronous operation. After you send a request, the system returns a forwarding rule ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of a forwarding rule.<ul>
     * <li>If the forwarding rule is in the <strong>configuring</strong> state, the rule is being created. In this case, you can only perform query operations.</li>
     * <li>If the forwarding rule is in the <strong>active</strong> state, the rule is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateForwardingRules</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateForwardingRules  CreateForwardingRulesRequest
     * @return CreateForwardingRulesResponse
     */
    CompletableFuture<CreateForwardingRulesResponse> createForwardingRules(CreateForwardingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateIpSets</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If acceleration regions are in the <strong>init</strong> state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
     *     *   If acceleration regions are in the <strong>active</strong> state, it indicates that the acceleration regions are created.</p>
     * <ul>
     * <li>You cannot call the <strong>CreateIpSets</strong> operation again on the same GA instance before the previous operation is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpSets  CreateIpSetsRequest
     * @return CreateIpSetsResponse
     */
    CompletableFuture<CreateIpSetsResponse> createIpSets(CreateIpSetsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the task.<ul>
     * <li>If the listener is in the <strong>init</strong> state, the listener is being created. In this state, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, the listener is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateListener</strong> operation for the same GA instance within the specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>CreateSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that secondary IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, it indicates that secondary IP addresses are created for the CNAME that is assigned to the GA instance.</p>
     * <ul>
     * <li>The <strong>CreateSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSpareIps  CreateSpareIpsRequest
     * @return CreateSpareIpsResponse
     */
    CompletableFuture<CreateSpareIpsResponse> createSpareIps(CreateSpareIpsRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete subscription GA instances.</p>
     * <ul>
     * <li><strong>DeleteAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>deleting</strong> state, the GA instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the GA instance cannot be queried, the GA instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccelerator  DeleteAcceleratorRequest
     * @return DeleteAcceleratorResponse
     */
    CompletableFuture<DeleteAcceleratorResponse> deleteAccelerator(DeleteAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteAcl</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> operation to query the status of an ACL.</p>
     * <ul>
     * <li>If the ACL is in the <strong>deleting</strong> state, it indicates that the ACL is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the ACL cannot be queried, it indicates that the ACL is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAcl  DeleteAclRequest
     * @return DeleteAclResponse
     */
    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteApplicationMonitor</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to query the state of an origin probing task.
     *     *   If the origin probing task is in the <strong>deleting</strong> state, it indicates that the task is being deleted. In this case, you can perform only query operations.
     *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteApplicationMonitor</strong> operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApplicationMonitor  DeleteApplicationMonitorRequest
     * @return DeleteApplicationMonitorResponse
     */
    CompletableFuture<DeleteApplicationMonitorResponse> deleteApplicationMonitor(DeleteApplicationMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, subscription bandwidth plans cannot be deleted. If you want to unsubscribe from subscription bandwidth plans, go to the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you can unsubscribe from a subscription bandwidth plan that is associated with a Global Accelerator (GA) instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Bandwidth plans that are associated with GA instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</li>
     * <li><strong>DeleteBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the bandwidth plan is in the <strong>deleting</strong> state, the bandwidth plan is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the bandwidth plan cannot be found, the bandwidth plan is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBandwidthPackage</strong> operation cannot be repeatedly called for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBandwidthPackage  DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     */
    CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> operation to query the status of an accelerated IP address.
     *     *   If an accelerated IP address is in the <strong>deleting</strong> state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
     *     *   If the system fails to return information about an accelerated IP address, the accelerated IP address is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteBasicAccelerateIp</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicAccelerateIp  DeleteBasicAccelerateIpRequest
     * @return DeleteBasicAccelerateIpResponse
     */
    CompletableFuture<DeleteBasicAccelerateIpResponse> deleteBasicAccelerateIp(DeleteBasicAccelerateIpRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicAccelerateIpEndpointRelation</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
     *     *   You can call the <a href="https://help.aliyun.com/document_detail/466794.html">GetBasicAccelerateIp</a> and <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the <strong>unbinding</strong> state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
     *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/466803.html">ListBasicAccelerateIpEndpointRelations</a> operation, the accelerated IP address is disassociated from the endpoint.</p>
     * <ul>
     * <li>The <strong>DeleteBasicAccelerateIpEndpointRelation</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicAccelerateIpEndpointRelation  DeleteBasicAccelerateIpEndpointRelationRequest
     * @return DeleteBasicAccelerateIpEndpointRelationResponse
     */
    CompletableFuture<DeleteBasicAccelerateIpEndpointRelationResponse> deleteBasicAccelerateIpEndpointRelation(DeleteBasicAccelerateIpEndpointRelationRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete subscription basic GA instances. You can unsubscribe from a basic GA instance on the <a href="https://usercenter2-intl.aliyun.com/refund/refund">Unsubscribe</a> page. Before you unsubscribe from a basic GA instance, make sure that the acceleration areas and endpoint groups of the GA instance are deleted and no bandwidth plans are associated with the GA instance.
     *     *   For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.
     *     *   For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.
     *     *   For information about how to disassociate a bandwidth plan from a basic GA instance, see <a href="https://help.aliyun.com/document_detail/153240.html">BandwidthPackageRemoveAccelerator</a>.</p>
     * <ul>
     * <li>Before you call this operation to delete a pay-as-you-go basic GA instance, make sure that all data is migrated and the acceleration areas and endpoint groups of the instance are deleted.<ul>
     * <li>For information about how to delete an acceleration area, see <a href="https://help.aliyun.com/document_detail/2253388.html">DeleteBasicIpSet</a>.</li>
     * <li>For information about how to delete an endpoint group, see <a href="https://help.aliyun.com/document_detail/2253399.html">DeleteBasicEndpointGroup</a>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteBasicAccelerator</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the basic GA instance is in the <strong>deleting</strong> state, it indicates that the instance is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the information about the basic GA instance is not displayed in the response, it indicates that the instance is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicAccelerator  DeleteBasicAcceleratorRequest
     * @return DeleteBasicAcceleratorResponse
     */
    CompletableFuture<DeleteBasicAcceleratorResponse> deleteBasicAccelerator(DeleteBasicAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteBasicEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/466831.html">ListBasicEndpoints</a> operation to query the status of endpoints.
     *     *   If the endpoint is in the <strong>deleting</strong> state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteBasicEndpoint</strong> API operation cannot be repeatedly called for the same basic GA instance within a period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicEndpoint  DeleteBasicEndpointRequest
     * @return DeleteBasicEndpointResponse
     */
    CompletableFuture<DeleteBasicEndpointResponse> deleteBasicEndpoint(DeleteBasicEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete an endpoint group, take note of the following items:</p>
     * <ul>
     * <li>If an endpoint in the endpoint group is associated with an accelerated IP address, you cannot delete the endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the endpoint from the accelerated IP address.</li>
     * <li>If no endpoint in the endpoint group is associated with an accelerated IP address, you can delete the endpoint group. When you delete an endpoint group, all endpoints in the endpoint group are deleted.</li>
     * <li><strong>DeleteBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362984.html">GetBasicEndpointGroup</a> operation to query the status of the task.<ul>
     * <li>If the endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group cannot be queried, the endpoint group is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteBasicEndpointGroup</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicEndpointGroup  DeleteBasicEndpointGroupRequest
     * @return DeleteBasicEndpointGroupResponse
     */
    CompletableFuture<DeleteBasicEndpointGroupResponse> deleteBasicEndpointGroup(DeleteBasicEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  If an accelerated IP address is associated with an endpoint, you cannot delete the acceleration region. You can call the <a href="https://help.aliyun.com/document_detail/2253413.html">DeleteBasicAccelerateIpEndpointRelation</a> operation to disassociate the accelerated IP address from the endpoint.</p>
     * <ul>
     * <li>\<em>\<em>DeleteBasicIpSet\</em>\</em> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</li>
     * </ul>
     * </li>
     * <li>The \<em>\<em>DeleteBasicIpSet\</em>\</em> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBasicIpSet  DeleteBasicIpSetRequest
     * @return DeleteBasicIpSetResponse
     */
    CompletableFuture<DeleteBasicIpSetResponse> deleteBasicIpSet(DeleteBasicIpSetRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and no information about the mappings that you want to delete is found in the response when you call the <a href="https://help.aliyun.com/document_detail/449378.html">DescribeCustomRoutingEndpointGroupDestinations</a> operation, it indicates the mappings are deleted from the endpoint group.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpointGroupDestinations</strong> operation again on the same Global Accelerator (GA) instance before the previous request is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCustomRoutingEndpointGroupDestinations  DeleteCustomRoutingEndpointGroupDestinationsRequest
     * @return DeleteCustomRoutingEndpointGroupDestinationsResponse
     */
    CompletableFuture<DeleteCustomRoutingEndpointGroupDestinationsResponse> deleteCustomRoutingEndpointGroupDestinations(DeleteCustomRoutingEndpointGroupDestinationsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointGroups</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
     *     *   If the endpoint groups are in the <strong>deleting</strong> state, the endpoint groups are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.</p>
     * <ul>
     * <li>You cannot use the <strong>DeleteCustomRoutingEndpointGroups</strong> operation on the same Global Accelerator (GA) instance before the previous operation is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCustomRoutingEndpointGroups  DeleteCustomRoutingEndpointGroupsRequest
     * @return DeleteCustomRoutingEndpointGroupsResponse
     */
    CompletableFuture<DeleteCustomRoutingEndpointGroupsResponse> deleteCustomRoutingEndpointGroups(DeleteCustomRoutingEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group to check whether the traffic destinations are deleted.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the traffic destinations are being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state and the traffic destinations that you want to delete cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/449392.html">DescribeCustomRoutingEndPointTrafficPolicy</a> operation, the traffic destinations are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCustomRoutingEndpointTrafficPolicies  DeleteCustomRoutingEndpointTrafficPoliciesRequest
     * @return DeleteCustomRoutingEndpointTrafficPoliciesResponse
     */
    CompletableFuture<DeleteCustomRoutingEndpointTrafficPoliciesResponse> deleteCustomRoutingEndpointTrafficPolicies(DeleteCustomRoutingEndpointTrafficPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteCustomRoutingEndpoints</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> to query the status of the task.
     *     *   If an endpoint group is in the <strong>updating</strong> state, the endpoint is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group is in the <strong>active</strong> state and the endpoint cannot be found after you call the <a href="https://help.aliyun.com/document_detail/449386.html">DescribeCustomRoutingEndpoint</a> operation, the endpoint is deleted.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteCustomRoutingEndpoints</strong> operation again on the same Global Accelerator (GA) instance before the previous task is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCustomRoutingEndpoints  DeleteCustomRoutingEndpointsRequest
     * @return DeleteCustomRoutingEndpointsResponse
     */
    CompletableFuture<DeleteCustomRoutingEndpointsResponse> deleteCustomRoutingEndpoints(DeleteCustomRoutingEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call the <strong>DeleteDomainAcceleratorRelation</strong> operation again by using the same Alibaba Cloud account before the previous operation is complete.</p>
     * 
     * @param request the request parameters of DeleteDomainAcceleratorRelation  DeleteDomainAcceleratorRelationRequest
     * @return DeleteDomainAcceleratorRelationResponse
     */
    CompletableFuture<DeleteDomainAcceleratorRelationResponse> deleteDomainAcceleratorRelation(DeleteDomainAcceleratorRelationRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the endpoint group.
     *     *   If the endpoint group is in the <strong>deleting</strong> state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroup</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEndpointGroup  DeleteEndpointGroupRequest
     * @return DeleteEndpointGroupResponse
     */
    CompletableFuture<DeleteEndpointGroupResponse> deleteEndpointGroup(DeleteEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the status of the task.
     *     *   If an endpoint group is in the <strong>deleting</strong> state, the endpoint group is being deleted. In this case, you can perform only query operations.
     *     *   If an endpoint group cannot be queried, the endpoint group is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteEndpointGroups</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEndpointGroups  DeleteEndpointGroupsRequest
     * @return DeleteEndpointGroupsResponse
     */
    CompletableFuture<DeleteEndpointGroupsResponse> deleteEndpointGroups(DeleteEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of the task.
     *     *   If a forwarding rule is in the <strong>deleting</strong> state, the forwarding rule is being deleted. In this case, you can perform only query operations.
     *     *   If a forwarding rule cannot be queried, the forwarding rule is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteForwardingRules</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteForwardingRules  DeleteForwardingRulesRequest
     * @return DeleteForwardingRulesResponse
     */
    CompletableFuture<DeleteForwardingRulesResponse> deleteForwardingRules(DeleteForwardingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.</p>
     * <ul>
     * <li>The <strong>DeleteIpSet</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpSet  DeleteIpSetRequest
     * @return DeleteIpSetResponse
     */
    CompletableFuture<DeleteIpSetResponse> deleteIpSet(DeleteIpSetRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If the acceleration region is in the <strong>deleting</strong> state, the acceleration region is being deleted. In this case, you can perform only query operations.
     *     *   If you cannot query the acceleration region, the acceleration region is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteIpSets</strong> operation for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpSets  DeleteIpSetsRequest
     * @return DeleteIpSetsResponse
     */
    CompletableFuture<DeleteIpSetsResponse> deleteIpSets(DeleteIpSetsRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call the <strong>DeleteListener</strong> operation, make sure that no endpoint groups are associated with the listener that you want to delete. For information about how to delete an endpoint group, see the following topics:
     *     *   <a href="https://help.aliyun.com/document_detail/2253305.html">DeleteEndpointGroup</a>: deletes an endpoint group that is associated with an intelligent routing listener.
     *     *   <a href="https://help.aliyun.com/document_detail/2253311.html">DeleteEndpointGroups</a>: deletes multiple endpoint groups that are associated with intelligent routing listeners at the same time.
     *     *   <a href="https://help.aliyun.com/document_detail/2303183.html">DeleteCustomRoutingEndpointGroups</a>: deletes multiple endpoint groups that are associated with custom routing listeners at the same time.</p>
     * <ul>
     * <li><strong>DeleteListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of the listener.<ul>
     * <li>If the listener is in the <strong>deleting</strong> state, the listener is being deleted. In this case, you can perform only query operations.</li>
     * <li>If the listener cannot be queried, the listener is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteListener</strong> operation to delete the listeners of the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteListener  DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteSpareIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state and the secondary IP addresses for the CNAME cannot be queried by calling the <a href="https://help.aliyun.com/document_detail/262121.html">ListSpareIps</a> operation, it indicates that the IP addresses are deleted.</p>
     * <ul>
     * <li>The <strong>DeleteSpareIps</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSpareIps  DeleteSpareIpsRequest
     * @return DeleteSpareIpsResponse
     */
    CompletableFuture<DeleteSpareIpsResponse> deleteSpareIps(DeleteSpareIpsRequest request);

    /**
     * @param request the request parameters of DescribeAccelerator  DescribeAcceleratorRequest
     * @return DescribeAcceleratorResponse
     */
    CompletableFuture<DescribeAcceleratorResponse> describeAccelerator(DescribeAcceleratorRequest request);

    /**
     * @param request the request parameters of DescribeAcceleratorAutoRenewAttribute  DescribeAcceleratorAutoRenewAttributeRequest
     * @return DescribeAcceleratorAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeAcceleratorAutoRenewAttributeResponse> describeAcceleratorAutoRenewAttribute(DescribeAcceleratorAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeAcceleratorServiceStatus  DescribeAcceleratorServiceStatusRequest
     * @return DescribeAcceleratorServiceStatusResponse
     */
    CompletableFuture<DescribeAcceleratorServiceStatusResponse> describeAcceleratorServiceStatus(DescribeAcceleratorServiceStatusRequest request);

    /**
     * @param request the request parameters of DescribeApplicationMonitor  DescribeApplicationMonitorRequest
     * @return DescribeApplicationMonitorResponse
     */
    CompletableFuture<DescribeApplicationMonitorResponse> describeApplicationMonitor(DescribeApplicationMonitorRequest request);

    /**
     * @param request the request parameters of DescribeBandwidthPackage  DescribeBandwidthPackageRequest
     * @return DescribeBandwidthPackageResponse
     */
    CompletableFuture<DescribeBandwidthPackageResponse> describeBandwidthPackage(DescribeBandwidthPackageRequest request);

    /**
     * @param request the request parameters of DescribeBandwidthPackageAutoRenewAttribute  DescribeBandwidthPackageAutoRenewAttributeRequest
     * @return DescribeBandwidthPackageAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeBandwidthPackageAutoRenewAttributeResponse> describeBandwidthPackageAutoRenewAttribute(DescribeBandwidthPackageAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeCommodity  DescribeCommodityRequest
     * @return DescribeCommodityResponse
     */
    CompletableFuture<DescribeCommodityResponse> describeCommodity(DescribeCommodityRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2253233.html">DescribeCommodity</a> operation to query information about the commodity modules.</p>
     * 
     * @param request the request parameters of DescribeCommodityPrice  DescribeCommodityPriceRequest
     * @return DescribeCommodityPriceResponse
     */
    CompletableFuture<DescribeCommodityPriceResponse> describeCommodityPrice(DescribeCommodityPriceRequest request);

    /**
     * @param request the request parameters of DescribeCustomRoutingEndPointTrafficPolicy  DescribeCustomRoutingEndPointTrafficPolicyRequest
     * @return DescribeCustomRoutingEndPointTrafficPolicyResponse
     */
    CompletableFuture<DescribeCustomRoutingEndPointTrafficPolicyResponse> describeCustomRoutingEndPointTrafficPolicy(DescribeCustomRoutingEndPointTrafficPolicyRequest request);

    /**
     * @param request the request parameters of DescribeCustomRoutingEndpoint  DescribeCustomRoutingEndpointRequest
     * @return DescribeCustomRoutingEndpointResponse
     */
    CompletableFuture<DescribeCustomRoutingEndpointResponse> describeCustomRoutingEndpoint(DescribeCustomRoutingEndpointRequest request);

    /**
     * @param request the request parameters of DescribeCustomRoutingEndpointGroup  DescribeCustomRoutingEndpointGroupRequest
     * @return DescribeCustomRoutingEndpointGroupResponse
     */
    CompletableFuture<DescribeCustomRoutingEndpointGroupResponse> describeCustomRoutingEndpointGroup(DescribeCustomRoutingEndpointGroupRequest request);

    /**
     * @param request the request parameters of DescribeCustomRoutingEndpointGroupDestinations  DescribeCustomRoutingEndpointGroupDestinationsRequest
     * @return DescribeCustomRoutingEndpointGroupDestinationsResponse
     */
    CompletableFuture<DescribeCustomRoutingEndpointGroupDestinationsResponse> describeCustomRoutingEndpointGroupDestinations(DescribeCustomRoutingEndpointGroupDestinationsRequest request);

    /**
     * @param request the request parameters of DescribeEndpointGroup  DescribeEndpointGroupRequest
     * @return DescribeEndpointGroupResponse
     */
    CompletableFuture<DescribeEndpointGroupResponse> describeEndpointGroup(DescribeEndpointGroupRequest request);

    /**
     * @param request the request parameters of DescribeIpSet  DescribeIpSetRequest
     * @return DescribeIpSetResponse
     */
    CompletableFuture<DescribeIpSetResponse> describeIpSet(DescribeIpSetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query configuration information about a listener of a GA instance. The information includes the routing type of the listener, the status of the listener, the timestamp that indicates when the listener was created, and the listener ports.</p>
     * 
     * @param request the request parameters of DescribeListener  DescribeListenerRequest
     * @return DescribeListenerResponse
     */
    CompletableFuture<DescribeListenerResponse> describeListener(DescribeListenerRequest request);

    /**
     * @param request the request parameters of DescribeLogStoreOfEndpointGroup  DescribeLogStoreOfEndpointGroupRequest
     * @return DescribeLogStoreOfEndpointGroupResponse
     */
    CompletableFuture<DescribeLogStoreOfEndpointGroupResponse> describeLogStoreOfEndpointGroup(DescribeLogStoreOfEndpointGroupRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>  The <strong>DetachDdosFromAccelerator</strong> operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.</p>
     * <ul>
     * <li><strong>DetachDdosFromAccelerator</strong> cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachDdosFromAccelerator  DetachDdosFromAcceleratorRequest
     * @return DetachDdosFromAcceleratorResponse
     */
    CompletableFuture<DetachDdosFromAcceleratorResponse> detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DetachLogStoreFromEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.<!----></li>
     * <li>If the endpoint group is in the <strong>active</strong> state, the Log Service Logstore is disassociated from the endpoint group.</li>
     * </ul>
     * </li>
     * <li>The <strong>DetachLogStoreFromEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachLogStoreFromEndpointGroup  DetachLogStoreFromEndpointGroupRequest
     * @return DetachLogStoreFromEndpointGroupResponse
     */
    CompletableFuture<DetachLogStoreFromEndpointGroupResponse> detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request);

    /**
     * @param request the request parameters of DetectApplicationMonitor  DetectApplicationMonitorRequest
     * @return DetectApplicationMonitorResponse
     */
    CompletableFuture<DetectApplicationMonitorResponse> detectApplicationMonitor(DetectApplicationMonitorRequest request);

    /**
     * @param request the request parameters of DisableApplicationMonitor  DisableApplicationMonitorRequest
     * @return DisableApplicationMonitorResponse
     */
    CompletableFuture<DisableApplicationMonitorResponse> disableApplicationMonitor(DisableApplicationMonitorRequest request);

    /**
     * @param request the request parameters of DisassociateResources  DisassociateResourcesRequest
     * @return DisassociateResourcesResponse
     */
    CompletableFuture<DisassociateResourcesResponse> disassociateResources(DisassociateResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAclsFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of a listener:<ul>
     * <li>If the listener is in the <strong>updating</strong> state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, ACLs are disassociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAclsFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateAclsFromListener  DissociateAclsFromListenerRequest
     * @return DissociateAclsFromListenerResponse
     */
    CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>DissociateAdditionalCertificatesFromListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the state of an HTTPS listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that the additional certificate is dissociated from the listener.</li>
     * </ul>
     * </li>
     * <li>The <strong>DissociateAdditionalCertificatesFromListener</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateAdditionalCertificatesFromListener  DissociateAdditionalCertificatesFromListenerRequest
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request);

    /**
     * @param request the request parameters of EnableApplicationMonitor  EnableApplicationMonitorRequest
     * @return EnableApplicationMonitorResponse
     */
    CompletableFuture<EnableApplicationMonitorResponse> enableApplicationMonitor(EnableApplicationMonitorRequest request);

    /**
     * @param request the request parameters of GetAcl  GetAclRequest
     * @return GetAclResponse
     */
    CompletableFuture<GetAclResponse> getAcl(GetAclRequest request);

    /**
     * @param request the request parameters of GetBasicAccelerateIp  GetBasicAccelerateIpRequest
     * @return GetBasicAccelerateIpResponse
     */
    CompletableFuture<GetBasicAccelerateIpResponse> getBasicAccelerateIp(GetBasicAccelerateIpRequest request);

    /**
     * @param request the request parameters of GetBasicAccelerateIpEndpointRelation  GetBasicAccelerateIpEndpointRelationRequest
     * @return GetBasicAccelerateIpEndpointRelationResponse
     */
    CompletableFuture<GetBasicAccelerateIpEndpointRelationResponse> getBasicAccelerateIpEndpointRelation(GetBasicAccelerateIpEndpointRelationRequest request);

    /**
     * @param request the request parameters of GetBasicAccelerateIpIdleCount  GetBasicAccelerateIpIdleCountRequest
     * @return GetBasicAccelerateIpIdleCountResponse
     */
    CompletableFuture<GetBasicAccelerateIpIdleCountResponse> getBasicAccelerateIpIdleCount(GetBasicAccelerateIpIdleCountRequest request);

    /**
     * @param request the request parameters of GetBasicAccelerator  GetBasicAcceleratorRequest
     * @return GetBasicAcceleratorResponse
     */
    CompletableFuture<GetBasicAcceleratorResponse> getBasicAccelerator(GetBasicAcceleratorRequest request);

    /**
     * @param request the request parameters of GetBasicEndpoint  GetBasicEndpointRequest
     * @return GetBasicEndpointResponse
     */
    CompletableFuture<GetBasicEndpointResponse> getBasicEndpoint(GetBasicEndpointRequest request);

    /**
     * @param request the request parameters of GetBasicEndpointGroup  GetBasicEndpointGroupRequest
     * @return GetBasicEndpointGroupResponse
     */
    CompletableFuture<GetBasicEndpointGroupResponse> getBasicEndpointGroup(GetBasicEndpointGroupRequest request);

    /**
     * @param request the request parameters of GetBasicIpSet  GetBasicIpSetRequest
     * @return GetBasicIpSetResponse
     */
    CompletableFuture<GetBasicIpSetResponse> getBasicIpSet(GetBasicIpSetRequest request);

    /**
     * @param request the request parameters of GetGlobalAcceleratorResources  GetGlobalAcceleratorResourcesRequest
     * @return GetGlobalAcceleratorResourcesResponse
     */
    CompletableFuture<GetGlobalAcceleratorResourcesResponse> getGlobalAcceleratorResources(GetGlobalAcceleratorResourcesRequest request);

    /**
     * @param request the request parameters of GetHealthStatus  GetHealthStatusRequest
     * @return GetHealthStatusResponse
     */
    CompletableFuture<GetHealthStatusResponse> getHealthStatus(GetHealthStatusRequest request);

    /**
     * @param request the request parameters of GetInvalidDomainCount  GetInvalidDomainCountRequest
     * @return GetInvalidDomainCountResponse
     */
    CompletableFuture<GetInvalidDomainCountResponse> getInvalidDomainCount(GetInvalidDomainCountRequest request);

    /**
     * @param request the request parameters of GetIpsetsBandwidthLimit  GetIpsetsBandwidthLimitRequest
     * @return GetIpsetsBandwidthLimitResponse
     */
    CompletableFuture<GetIpsetsBandwidthLimitResponse> getIpsetsBandwidthLimit(GetIpsetsBandwidthLimitRequest request);

    /**
     * @param request the request parameters of GetSpareIp  GetSpareIpRequest
     * @return GetSpareIpResponse
     */
    CompletableFuture<GetSpareIpResponse> getSpareIp(GetSpareIpRequest request);

    /**
     * @param request the request parameters of ListAccelerateAreas  ListAccelerateAreasRequest
     * @return ListAccelerateAreasResponse
     */
    CompletableFuture<ListAccelerateAreasResponse> listAccelerateAreas(ListAccelerateAreasRequest request);

    /**
     * @param request the request parameters of ListAccelerators  ListAcceleratorsRequest
     * @return ListAcceleratorsResponse
     */
    CompletableFuture<ListAcceleratorsResponse> listAccelerators(ListAcceleratorsRequest request);

    /**
     * @param request the request parameters of ListAcls  ListAclsRequest
     * @return ListAclsResponse
     */
    CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request);

    /**
     * @param request the request parameters of ListApplicationMonitor  ListApplicationMonitorRequest
     * @return ListApplicationMonitorResponse
     */
    CompletableFuture<ListApplicationMonitorResponse> listApplicationMonitor(ListApplicationMonitorRequest request);

    /**
     * @param request the request parameters of ListApplicationMonitorDetectResult  ListApplicationMonitorDetectResultRequest
     * @return ListApplicationMonitorDetectResultResponse
     */
    CompletableFuture<ListApplicationMonitorDetectResultResponse> listApplicationMonitorDetectResult(ListApplicationMonitorDetectResultRequest request);

    /**
     * @param request the request parameters of ListAvailableAccelerateAreas  ListAvailableAccelerateAreasRequest
     * @return ListAvailableAccelerateAreasResponse
     */
    CompletableFuture<ListAvailableAccelerateAreasResponse> listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request);

    /**
     * @param request the request parameters of ListAvailableBusiRegions  ListAvailableBusiRegionsRequest
     * @return ListAvailableBusiRegionsResponse
     */
    CompletableFuture<ListAvailableBusiRegionsResponse> listAvailableBusiRegions(ListAvailableBusiRegionsRequest request);

    /**
     * @param request the request parameters of ListBandwidthPackages  ListBandwidthPackagesRequest
     * @return ListBandwidthPackagesResponse
     */
    CompletableFuture<ListBandwidthPackagesResponse> listBandwidthPackages(ListBandwidthPackagesRequest request);

    /**
     * <b>description</b> :
     * <p>To query the detailed information about a bandwidth plan, call the <strong>ListBandwidthPackages</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2253239.html">ListBandwidthPackages</a>.</p>
     * 
     * @param request the request parameters of ListBandwidthackages  ListBandwidthackagesRequest
     * @return ListBandwidthackagesResponse
     */
    CompletableFuture<ListBandwidthackagesResponse> listBandwidthackages(ListBandwidthackagesRequest request);

    /**
     * @param request the request parameters of ListBasicAccelerateIpEndpointRelations  ListBasicAccelerateIpEndpointRelationsRequest
     * @return ListBasicAccelerateIpEndpointRelationsResponse
     */
    CompletableFuture<ListBasicAccelerateIpEndpointRelationsResponse> listBasicAccelerateIpEndpointRelations(ListBasicAccelerateIpEndpointRelationsRequest request);

    /**
     * @param request the request parameters of ListBasicAccelerateIps  ListBasicAccelerateIpsRequest
     * @return ListBasicAccelerateIpsResponse
     */
    CompletableFuture<ListBasicAccelerateIpsResponse> listBasicAccelerateIps(ListBasicAccelerateIpsRequest request);

    /**
     * @param request the request parameters of ListBasicAccelerators  ListBasicAcceleratorsRequest
     * @return ListBasicAcceleratorsResponse
     */
    CompletableFuture<ListBasicAcceleratorsResponse> listBasicAccelerators(ListBasicAcceleratorsRequest request);

    /**
     * @param request the request parameters of ListBasicEndpoints  ListBasicEndpointsRequest
     * @return ListBasicEndpointsResponse
     */
    CompletableFuture<ListBasicEndpointsResponse> listBasicEndpoints(ListBasicEndpointsRequest request);

    /**
     * @param request the request parameters of ListBusiRegions  ListBusiRegionsRequest
     * @return ListBusiRegionsResponse
     */
    CompletableFuture<ListBusiRegionsResponse> listBusiRegions(ListBusiRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the acceleration areas and regions that you can specify on the wizard page of Global Accelerator (GA) and for free-trial GA instances. You can filter acceleration areas and regions based on specified conditions.</p>
     * 
     * @param request the request parameters of ListCommonAreas  ListCommonAreasRequest
     * @return ListCommonAreasResponse
     */
    CompletableFuture<ListCommonAreasResponse> listCommonAreas(ListCommonAreasRequest request);

    /**
     * @param request the request parameters of ListCustomRoutingEndpointGroupDestinations  ListCustomRoutingEndpointGroupDestinationsRequest
     * @return ListCustomRoutingEndpointGroupDestinationsResponse
     */
    CompletableFuture<ListCustomRoutingEndpointGroupDestinationsResponse> listCustomRoutingEndpointGroupDestinations(ListCustomRoutingEndpointGroupDestinationsRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ga%5C&api=ListCustomRoutingEndpointGroups%5C&type=RPC%5C&version=2019-11-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code for different SDKs.</a></p>
     * 
     * @param request the request parameters of ListCustomRoutingEndpointGroups  ListCustomRoutingEndpointGroupsRequest
     * @return ListCustomRoutingEndpointGroupsResponse
     */
    CompletableFuture<ListCustomRoutingEndpointGroupsResponse> listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest request);

    /**
     * @param request the request parameters of ListCustomRoutingEndpointTrafficPolicies  ListCustomRoutingEndpointTrafficPoliciesRequest
     * @return ListCustomRoutingEndpointTrafficPoliciesResponse
     */
    CompletableFuture<ListCustomRoutingEndpointTrafficPoliciesResponse> listCustomRoutingEndpointTrafficPolicies(ListCustomRoutingEndpointTrafficPoliciesRequest request);

    /**
     * @param request the request parameters of ListCustomRoutingEndpoints  ListCustomRoutingEndpointsRequest
     * @return ListCustomRoutingEndpointsResponse
     */
    CompletableFuture<ListCustomRoutingEndpointsResponse> listCustomRoutingEndpoints(ListCustomRoutingEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.</p>
     * 
     * @param request the request parameters of ListCustomRoutingPortMappings  ListCustomRoutingPortMappingsRequest
     * @return ListCustomRoutingPortMappingsResponse
     */
    CompletableFuture<ListCustomRoutingPortMappingsResponse> listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest request);

    /**
     * @param request the request parameters of ListCustomRoutingPortMappingsByDestination  ListCustomRoutingPortMappingsByDestinationRequest
     * @return ListCustomRoutingPortMappingsByDestinationResponse
     */
    CompletableFuture<ListCustomRoutingPortMappingsByDestinationResponse> listCustomRoutingPortMappingsByDestination(ListCustomRoutingPortMappingsByDestinationRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of ListEndpointGroupIpAddressCidrBlocks  ListEndpointGroupIpAddressCidrBlocksRequest
     * @return ListEndpointGroupIpAddressCidrBlocksResponse
     */
    CompletableFuture<ListEndpointGroupIpAddressCidrBlocksResponse> listEndpointGroupIpAddressCidrBlocks(ListEndpointGroupIpAddressCidrBlocksRequest request);

    /**
     * @param request the request parameters of ListEndpointGroups  ListEndpointGroupsRequest
     * @return ListEndpointGroupsResponse
     */
    CompletableFuture<ListEndpointGroupsResponse> listEndpointGroups(ListEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is used to query only custom forwarding rules, not the default forwarding rule.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListForwardingRules  ListForwardingRulesRequest
     * @return ListForwardingRulesResponse
     */
    CompletableFuture<ListForwardingRulesResponse> listForwardingRules(ListForwardingRulesRequest request);

    /**
     * @param request the request parameters of ListIpSets  ListIpSetsRequest
     * @return ListIpSetsResponse
     */
    CompletableFuture<ListIpSetsResponse> listIpSets(ListIpSetsRequest request);

    /**
     * @param request the request parameters of ListIspTypes  ListIspTypesRequest
     * @return ListIspTypesResponse
     */
    CompletableFuture<ListIspTypesResponse> listIspTypes(ListIspTypesRequest request);

    /**
     * @param request the request parameters of ListListenerCertificates  ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query information about the listeners of a GA instance, including the status of each listener, the timestamp that indicates when each listener was created, and the listener ports.</p>
     * 
     * @param request the request parameters of ListListeners  ListListenersRequest
     * @return ListListenersResponse
     */
    CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request);

    /**
     * @param request the request parameters of ListSpareIps  ListSpareIpsRequest
     * @return ListSpareIpsResponse
     */
    CompletableFuture<ListSpareIpsResponse> listSpareIps(ListSpareIpsRequest request);

    /**
     * <b>description</b> :
     * <p>You can select a TLS security policy when you create an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.</p>
     * 
     * @param request the request parameters of ListSystemSecurityPolicies  ListSystemSecurityPoliciesRequest
     * @return ListSystemSecurityPoliciesResponse
     */
    CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>  You must specify <strong>ResourceId</strong> or <strong>Tag</strong> in the request to specify the object that you want to query.********</p>
     * <ul>
     * <li><strong>Tag</strong> is a resource tag that consists of a key-value pair (Key and Value). If you specify only <strong>Key</strong>, all tag values that are associated with the specified tag key are returned. If you specify only <strong>Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag</strong> and <strong>ResourceId</strong> to filter tags, <strong>ResourceId</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain the key-value pairs are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of OpenAcceleratorService  OpenAcceleratorServiceRequest
     * @return OpenAcceleratorServiceResponse
     */
    CompletableFuture<OpenAcceleratorServiceResponse> openAcceleratorService(OpenAcceleratorServiceRequest request);

    /**
     * @param request the request parameters of QueryCrossBorderApprovalStatus  QueryCrossBorderApprovalStatusRequest
     * @return QueryCrossBorderApprovalStatusResponse
     */
    CompletableFuture<QueryCrossBorderApprovalStatusResponse> queryCrossBorderApprovalStatus(QueryCrossBorderApprovalStatusRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>RemoveEntriesFromAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/258292.html">GetAcl</a> or <a href="https://help.aliyun.com/document_detail/258291.html">ListAcls</a> operation to query the status of the ACL from which you want to delete IP entries.
     *     *   If the ACL is in the <strong>configuring</strong> state, it indicates that the IP entries are being deleted. In this case, you can perform only query operations.
     *     *   If the ACL is in the <strong>active</strong> state, it indicates that the IP entries are deleted.</p>
     * <ul>
     * <li>The <strong>RemoveEntriesFromAcl</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveEntriesFromAcl  RemoveEntriesFromAclRequest
     * @return RemoveEntriesFromAclResponse
     */
    CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The GA instance continues to forward network traffic.</li>
     * <li><strong>ReplaceBandwidthPackage</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> or <a href="https://help.aliyun.com/document_detail/153236.html">ListAccelerators</a> operation to query the status of the GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the associated bandwidth plan is replaced.</li>
     * </ul>
     * </li>
     * <li>The <strong>ReplaceBandwidthPackage</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceBandwidthPackage  ReplaceBandwidthPackageRequest
     * @return ReplaceBandwidthPackageResponse
     */
    CompletableFuture<ReplaceBandwidthPackageResponse> replaceBandwidthPackage(ReplaceBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>You can add up to 20 tags to each GA resource. When you call this operation, Alibaba Cloud first checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateAccelerator</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.
     *     *   If the GA instance is in the <strong>configuring</strong> state, the GA instance is being modified. In this case, you can perform only query operations.
     *     *   If the GA instance is in the <strong>active</strong> state, the GA instance is modified.</p>
     * <ul>
     * <li>The <strong>UpdateAccelerator</strong> operation cannot be repeatedly called for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAccelerator  UpdateAcceleratorRequest
     * @return UpdateAcceleratorResponse
     */
    CompletableFuture<UpdateAcceleratorResponse> updateAccelerator(UpdateAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateAcceleratorAutoRenewAttribute</strong> operation for the same GA instance within a specific period of time.</p>
     * 
     * @param request the request parameters of UpdateAcceleratorAutoRenewAttribute  UpdateAcceleratorAutoRenewAttributeRequest
     * @return UpdateAcceleratorAutoRenewAttributeResponse
     */
    CompletableFuture<UpdateAcceleratorAutoRenewAttributeResponse> updateAcceleratorAutoRenewAttribute(UpdateAcceleratorAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>After you modify the specification of a GA instance, you must confirm the modification. The <strong>UpdateAcceleratorConfirm</strong> operation is used to confirm the specification of a GA instance that is modified. When you call this operation to confirm the specification of a GA instance, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateAcceleratorConfirm</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of a GA instance.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, it indicates that the specification of the instance is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateAcceleratorConfirm</strong> operation cannot be called repeatedly for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAcceleratorConfirm  UpdateAcceleratorConfirmRequest
     * @return UpdateAcceleratorConfirmResponse
     */
    CompletableFuture<UpdateAcceleratorConfirmResponse> updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the type of transmission network for a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>. Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Cloud Data Transfer (CDT) is activated. When you call the <a href="https://help.aliyun.com/document_detail/206786.html">CreateAccelerator</a> operation and set <strong>BandwidthBillingType</strong> to <strong>CDT</strong> to create a <strong>standard</strong> GA instance whose bandwidth metering method is <strong>pay-by-data-transfer</strong>, CDT is automatically activated. The data transfer fees are managed by CDT.</li>
     * <li>If you want to set <strong>CrossBorderMode</strong> to <strong>private</strong>, which specifies cross-border Express Connect circuit as the type of transmission network, make sure that real-name verification is complete for your enterprise account. For more information, see <a href="https://help.aliyun.com/document_detail/52595.html">Real-name verification</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAcceleratorCrossBorderMode  UpdateAcceleratorCrossBorderModeRequest
     * @return UpdateAcceleratorCrossBorderModeResponse
     */
    CompletableFuture<UpdateAcceleratorCrossBorderModeResponse> updateAcceleratorCrossBorderMode(UpdateAcceleratorCrossBorderModeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable cross-border data transmission for basic or standard GA instances that use Cloud Data Transfer (CDT) to bill data transfers.</p>
     * 
     * @param request the request parameters of UpdateAcceleratorCrossBorderStatus  UpdateAcceleratorCrossBorderStatusRequest
     * @return UpdateAcceleratorCrossBorderStatusResponse
     */
    CompletableFuture<UpdateAcceleratorCrossBorderStatusResponse> updateAcceleratorCrossBorderStatus(UpdateAcceleratorCrossBorderStatusRequest request);

    /**
     * @param request the request parameters of UpdateAclAttribute  UpdateAclAttributeRequest
     * @return UpdateAclAttributeResponse
     */
    CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. This operation is suitable for scenarios in which the original certificate expires and needs to be replaced with a new certificate and the associated domain name remains unchanged.</p>
     * <ul>
     * <li><strong>UpdateAdditionalCertificateWithListener</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/307743.html">ListListenerCertificates</a> to query the status of the task:<ul>
     * <li>If the certificate to be replaced is in the <strong>updating</strong> state, the certificate is being replaced. In this case, you can only query the certificate.</li>
     * <li>If the new certificate is in the <strong>active</strong> state, the new certificate is in effect.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateAdditionalCertificateWithListener</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAdditionalCertificateWithListener  UpdateAdditionalCertificateWithListenerRequest
     * @return UpdateAdditionalCertificateWithListenerResponse
     */
    CompletableFuture<UpdateAdditionalCertificateWithListenerResponse> updateAdditionalCertificateWithListener(UpdateAdditionalCertificateWithListenerRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateApplicationMonitor</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/408463.html">DescribeApplicationMonitor</a> or <a href="https://help.aliyun.com/document_detail/408462.html">ListApplicationMonitor</a> operation to check whether the configurations of an origin probing task are modified.</p>
     * <ul>
     * <li>If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.</li>
     * <li>If the values of modified parameters change, it indicates that the origin probing task is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateApplicationMonitor  UpdateApplicationMonitorRequest
     * @return UpdateApplicationMonitorResponse
     */
    CompletableFuture<UpdateApplicationMonitorResponse> updateApplicationMonitor(UpdateApplicationMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateBandwidthPackagaAutoRenewAttribute</strong> operation to modify the auto-renewal settings of a bandwidth plan.</p>
     * 
     * @param request the request parameters of UpdateBandwidthPackagaAutoRenewAttribute  UpdateBandwidthPackagaAutoRenewAttributeRequest
     * @return UpdateBandwidthPackagaAutoRenewAttributeResponse
     */
    CompletableFuture<UpdateBandwidthPackagaAutoRenewAttributeResponse> updateBandwidthPackagaAutoRenewAttribute(UpdateBandwidthPackagaAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateBandwidthPackage</strong> is a synchronous operation when you call the operation to modify the configuration excluding the bandwidth value of a bandwidth plan. The new configuration immediately takes effect after the operation is performed.</li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153241.html">DescribeBandwidthPackage</a> operation to query the status of the task.<ul>
     * <li>If the parameter values of the bandwidth plan remain unchanged, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the parameter values of the bandwidth plan are changed, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateBandwidthPackage</strong> is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is associated with a GA instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153235.html">DescribeAccelerator</a> operation to query the status of the task.<ul>
     * <li>If the GA instance is in the <strong>configuring</strong> state, the bandwidth plan is being modified. In this case, you can perform only query operations.</li>
     * <li>If the GA instance is in the <strong>active</strong> state, the bandwidth plan is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBandwidthPackage</strong> operation for the same bandwidth plan within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateBandwidthPackage  UpdateBandwidthPackageRequest
     * @return UpdateBandwidthPackageResponse
     */
    CompletableFuture<UpdateBandwidthPackageResponse> updateBandwidthPackage(UpdateBandwidthPackageRequest request);

    /**
     * @param request the request parameters of UpdateBasicAccelerator  UpdateBasicAcceleratorRequest
     * @return UpdateBasicAcceleratorResponse
     */
    CompletableFuture<UpdateBasicAcceleratorResponse> updateBasicAccelerator(UpdateBasicAcceleratorRequest request);

    /**
     * @param request the request parameters of UpdateBasicEndpoint  UpdateBasicEndpointRequest
     * @return UpdateBasicEndpointResponse
     */
    CompletableFuture<UpdateBasicEndpointResponse> updateBasicEndpoint(UpdateBasicEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateBasicEndpointGroup</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. The system modifies the configurations of an endpoint group that is associated with a basic GA instance by deleting the endpoint group and creating a new endpoint group. You can call the <a href="https://help.aliyun.com/document_detail/353188.html">GetBasicAccelerator</a> operation to query the status of the task.
     *     *   If the basic GA instance is in the <strong>configuring</strong> state, the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the basic GA instance is in the <strong>active</strong> state, the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateBasicEndpointGroup</strong> operation cannot be repeatedly called for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateBasicEndpointGroup  UpdateBasicEndpointGroupRequest
     * @return UpdateBasicEndpointGroupResponse
     */
    CompletableFuture<UpdateBasicEndpointGroupResponse> updateBasicEndpointGroup(UpdateBasicEndpointGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can modify the bandwidth of an acceleration region of a basic GA instance only if the bandwidth metering method of the basic GA instance is <strong>pay-by-data-transfer</strong>.</li>
     * <li><strong>UpdateBasicIpSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/362987.html">GetBasicIpSet</a> operation to query the status of the task.<ul>
     * <li>If the acceleration region is in the <strong>updating</strong> state, it indicates that the bandwidth of the acceleration region is being modified. In this case, you can perform only query operations.</li>
     * <li>If the acceleration region is in the <strong>active</strong> state, it indicates that the bandwidth of the acceleration region is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateBasicIpSet</strong> operation for the same basic GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateBasicIpSet  UpdateBasicIpSetRequest
     * @return UpdateBasicIpSetResponse
     */
    CompletableFuture<UpdateBasicIpSetResponse> updateBasicIpSet(UpdateBasicIpSetRequest request);

    /**
     * @param request the request parameters of UpdateCustomRoutingEndpointGroupAttribute  UpdateCustomRoutingEndpointGroupAttributeRequest
     * @return UpdateCustomRoutingEndpointGroupAttributeResponse
     */
    CompletableFuture<UpdateCustomRoutingEndpointGroupAttributeResponse> updateCustomRoutingEndpointGroupAttribute(UpdateCustomRoutingEndpointGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of an endpoint group associated with a custom routing listener to check whether the mapping configurations of the endpoint group are modified.
     *     *   If the endpoint group is in the <strong>updating</strong> state, the mapping configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, the mapping configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointGroupDestinations</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCustomRoutingEndpointGroupDestinations  UpdateCustomRoutingEndpointGroupDestinationsRequest
     * @return UpdateCustomRoutingEndpointGroupDestinationsResponse
     */
    CompletableFuture<UpdateCustomRoutingEndpointGroupDestinationsResponse> updateCustomRoutingEndpointGroupDestinations(UpdateCustomRoutingEndpointGroupDestinationsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the status of the task.
     *     *   If the endpoint group is in the <strong>updating</strong> state, traffic policies are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, traffic policies are modified for endpoints in the endpoint group.</p>
     * <ul>
     * <li>The <strong>UpdateCustomRoutingEndpointTrafficPolicies</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCustomRoutingEndpointTrafficPolicies  UpdateCustomRoutingEndpointTrafficPoliciesRequest
     * @return UpdateCustomRoutingEndpointTrafficPoliciesResponse
     */
    CompletableFuture<UpdateCustomRoutingEndpointTrafficPoliciesResponse> updateCustomRoutingEndpointTrafficPolicies(UpdateCustomRoutingEndpointTrafficPoliciesRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li><strong>UpdateCustomRoutingEndpoints</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/449373.html">DescribeCustomRoutingEndpointGroup</a> operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.<ul>
     * <li>If an endpoint group is in the <strong>updating</strong> state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.</li>
     * <li>If an endpoint group is in the <strong>active</strong> state, the endpoints in the endpoint group are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateCustomRoutingEndpoints</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCustomRoutingEndpoints  UpdateCustomRoutingEndpointsRequest
     * @return UpdateCustomRoutingEndpointsResponse
     */
    CompletableFuture<UpdateCustomRoutingEndpointsResponse> updateCustomRoutingEndpoints(UpdateCustomRoutingEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify an accelerated domain name. If the new accelerated domain name is hosted in the Chinese mainland, you must obtain an Internet content provider (ICP) number for the domain name.
     * You cannot call the <strong>UpdateDomain</strong> operation again by using the same Alibaba Cloud account before the previous request is completed.</p>
     * 
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query and update the ICP filing status of an accelerated domain name.
     * The <strong>UpdateDomainState</strong> operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation with the same Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of UpdateDomainState  UpdateDomainStateRequest
     * @return UpdateDomainStateResponse
     */
    CompletableFuture<UpdateDomainStateResponse> updateDomainState(UpdateDomainStateRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateEndpointGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> operation to query the state of an endpoint group.
     *     *   If the endpoint group is in the <strong>updating</strong> state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
     *     *   If the endpoint group is in the <strong>active</strong> state, it indicates that the configurations of the endpoint group are modified.</p>
     * <ul>
     * <li>The <strong>UpdateEndpointGroup</strong> operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEndpointGroup  UpdateEndpointGroupRequest
     * @return UpdateEndpointGroupResponse
     */
    CompletableFuture<UpdateEndpointGroupResponse> updateEndpointGroup(UpdateEndpointGroupRequest request);

    /**
     * @param request the request parameters of UpdateEndpointGroupAttribute  UpdateEndpointGroupAttributeRequest
     * @return UpdateEndpointGroupAttributeResponse
     */
    CompletableFuture<UpdateEndpointGroupAttributeResponse> updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li><strong>UpdateEndpointGroups</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153260.html">DescribeEndpointGroup</a> or <a href="https://help.aliyun.com/document_detail/153261.html">ListEndpointGroups</a> operation to query the status of an endpoint group.<ul>
     * <li>If the endpoint group is in the <strong>updating</strong> state, it indicates that the configuration of the endpoint group is being modified. In this case, you can perform only query operations.</li>
     * <li>If the endpoint group is in the <strong>active</strong> state, it indicates that the configuration of the endpoint group is modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateEndpointGroups</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEndpointGroups  UpdateEndpointGroupsRequest
     * @return UpdateEndpointGroupsResponse
     */
    CompletableFuture<UpdateEndpointGroupsResponse> updateEndpointGroups(UpdateEndpointGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateForwardingRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/205817.html">ListForwardingRules</a> operation to query the status of a forwarding rule.
     *     *   If the forwarding rule is in the <strong>configuring</strong> state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
     *     *   If the forwarding rule is in the <strong>active</strong> state, it indicates that the forwarding rule is modified.</p>
     * <ul>
     * <li>The <strong>UpdateForwardingRules</strong> operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateForwardingRules  UpdateForwardingRulesRequest
     * @return UpdateForwardingRulesResponse
     */
    CompletableFuture<UpdateForwardingRulesResponse> updateForwardingRules(UpdateForwardingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateIpSet</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of an acceleration region.
     *     *   If the acceleration region is in the <strong>updating</strong> state, it indicates that the acceleration region is being modified. In this case, you can continue to perform query operations on the acceleration regions.
     *     *   If the acceleration region is in the <strong>active</strong> state, it indicates that the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot call the <strong>UpdateIpSet</strong> operation again on the same GA instance before the previous operation is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateIpSet  UpdateIpSetRequest
     * @return UpdateIpSetResponse
     */
    CompletableFuture<UpdateIpSetResponse> updateIpSet(UpdateIpSetRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateIpSets</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153246.html">DescribeIpSet</a> operation to query the status of the task.
     *     *   If an acceleration region is in the <strong>updating</strong> state, the acceleration region is being modified. In this case, you can perform only query operations.
     *     *   If an acceleration region is in the <strong>active</strong> state, the acceleration region is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UpdateIpSets</strong> operation for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateIpSets  UpdateIpSetsRequest
     * @return UpdateIpSetsResponse
     */
    CompletableFuture<UpdateIpSetsResponse> updateIpSets(UpdateIpSetsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify the configurations such as the protocol and ports of a listener to meet your business requirements.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>UpdateListener</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/153254.html">DescribeListener</a> operation to query the status of a listener.<ul>
     * <li>If the listener is in the <strong>updating</strong> state, it indicates that its configurations are being modified. In this case, you can perform only query operations.</li>
     * <li>If the listener is in the <strong>active</strong> state, it indicates that its configurations are modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateListener</strong> operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListener  UpdateListenerRequest
     * @return UpdateListenerResponse
     */
    CompletableFuture<UpdateListenerResponse> updateListener(UpdateListenerRequest request);

    /**
     * @param request the request parameters of UpdateLogStoreConfig  UpdateLogStoreConfigRequest
     * @return UpdateLogStoreConfigResponse
     */
    CompletableFuture<UpdateLogStoreConfigResponse> updateLogStoreConfig(UpdateLogStoreConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>managed</strong> Global Accelerator (GA) instances.</p>
     * <ul>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you cannot change the mode of the instance to managed mode.</li>
     * <li>After you change the control mode of a GA instance from managed mode to unmanaged mode, you can obtain all operation permissions on the instance.
     *   <warning>If you change or delete a configuration of a GA instance whose control mode is changed from managed mode to unmanaged mode, the cloud services that depend on the instance may not work as expected. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServiceManagedControl  UpdateServiceManagedControlRequest
     * @return UpdateServiceManagedControlResponse
     */
    CompletableFuture<UpdateServiceManagedControlResponse> updateServiceManagedControl(UpdateServiceManagedControlRequest request);

}
