// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.smartag20180313.models.*;
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
     * @param request the request parameters of ActivateSmartAccessGateway  ActivateSmartAccessGatewayRequest
     * @return ActivateSmartAccessGatewayResponse
     */
    CompletableFuture<ActivateSmartAccessGatewayResponse> activateSmartAccessGateway(ActivateSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of ActiveFlowLog  ActiveFlowLogRequest
     * @return ActiveFlowLogResponse
     */
    CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request);

    /**
     * @param request the request parameters of AddACLRule  AddACLRuleRequest
     * @return AddACLRuleResponse
     */
    CompletableFuture<AddACLRuleResponse> addACLRule(AddACLRuleRequest request);

    /**
     * @param request the request parameters of AddDnatEntry  AddDnatEntryRequest
     * @return AddDnatEntryResponse
     */
    CompletableFuture<AddDnatEntryResponse> addDnatEntry(AddDnatEntryRequest request);

    /**
     * @param request the request parameters of AddSmartAccessGatewayDnsForward  AddSmartAccessGatewayDnsForwardRequest
     * @return AddSmartAccessGatewayDnsForwardResponse
     */
    CompletableFuture<AddSmartAccessGatewayDnsForwardResponse> addSmartAccessGatewayDnsForward(AddSmartAccessGatewayDnsForwardRequest request);

    /**
     * @param request the request parameters of AddSnatEntry  AddSnatEntryRequest
     * @return AddSnatEntryResponse
     */
    CompletableFuture<AddSnatEntryResponse> addSnatEntry(AddSnatEntryRequest request);

    /**
     * @param request the request parameters of AssociateACL  AssociateACLRequest
     * @return AssociateACLResponse
     */
    CompletableFuture<AssociateACLResponse> associateACL(AssociateACLRequest request);

    /**
     * @param request the request parameters of AssociateFlowLog  AssociateFlowLogRequest
     * @return AssociateFlowLogResponse
     */
    CompletableFuture<AssociateFlowLogResponse> associateFlowLog(AssociateFlowLogRequest request);

    /**
     * @param request the request parameters of AssociateQos  AssociateQosRequest
     * @return AssociateQosResponse
     */
    CompletableFuture<AssociateQosResponse> associateQos(AssociateQosRequest request);

    /**
     * <b>description</b> :
     * <p>Before you associate a bandwidth plan for application acceleration with a Smart Access Gateway instance, make sure that the following conditions are met:</p>
     * <ul>
     * <li>If you want to associate the bandwidth plan with a Smart Access Gateway hardware instance, make sure that the version of the Smart Access Gateway device is 2.4.0 or later.
     * If the version of your Smart Access Gateway device is earlier than 2.4.0, upgrade the device. For more information, see <a href="https://help.aliyun.com/document_detail/163948.html">Update the version</a>.</li>
     * <li>If you want to associate the bandwidth plan with a SAG app instance, make sure that the version of the SAG app client you downloaded is 2.4.0 or later.
     * If the version of your client is earlier than 2.4.0, upgrade the client. For more information, see <a href="https://help.aliyun.com/document_detail/102544.html">Install the client</a>.</li>
     * <li>The Smart Access Gateway instance that you want to associate is in the Available state.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateSmartAGWithApplicationBandwidthPackage  AssociateSmartAGWithApplicationBandwidthPackageRequest
     * @return AssociateSmartAGWithApplicationBandwidthPackageResponse
     */
    CompletableFuture<AssociateSmartAGWithApplicationBandwidthPackageResponse> associateSmartAGWithApplicationBandwidthPackage(AssociateSmartAGWithApplicationBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>Attaches a Cloud Connect Network (CCN) instance to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request the request parameters of AttachCcnInstanceToCen  AttachCcnInstanceToCenRequest
     * @return AttachCcnInstanceToCenResponse
     */
    CompletableFuture<AttachCcnInstanceToCenResponse> attachCcnInstanceToCen(AttachCcnInstanceToCenRequest request);

    /**
     * @param request the request parameters of BindSerialNumber  BindSerialNumberRequest
     * @return BindSerialNumberResponse
     */
    CompletableFuture<BindSerialNumberResponse> bindSerialNumber(BindSerialNumberRequest request);

    /**
     * @param request the request parameters of BindSmartAccessGateway  BindSmartAccessGatewayRequest
     * @return BindSmartAccessGatewayResponse
     */
    CompletableFuture<BindSmartAccessGatewayResponse> bindSmartAccessGateway(BindSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of BindVbr  BindVbrRequest
     * @return BindVbrResponse
     */
    CompletableFuture<BindVbrResponse> bindVbr(BindVbrRequest request);

    /**
     * @param request the request parameters of ClearSagCipher  ClearSagCipherRequest
     * @return ClearSagCipherResponse
     */
    CompletableFuture<ClearSagCipherResponse> clearSagCipher(ClearSagCipherRequest request);

    /**
     * @param request the request parameters of ClearSagRouteableAddress  ClearSagRouteableAddressRequest
     * @return ClearSagRouteableAddressResponse
     */
    CompletableFuture<ClearSagRouteableAddressResponse> clearSagRouteableAddress(ClearSagRouteableAddressRequest request);

    /**
     * @param request the request parameters of CreateACL  CreateACLRequest
     * @return CreateACLResponse
     */
    CompletableFuture<CreateACLResponse> createACL(CreateACLRequest request);

    /**
     * <b>description</b> :
     * <p>A Cloud Connect Network (CCN) is a device access matrix that consists of Alibaba Cloud distributed access gateways. CCN is another important component of Smart Access Gateway. After you attach Smart Access Gateway to a CCN, Smart Access Gateway can connect your on-premises network to Alibaba Cloud through the CCN via network connectivity. For more information, see <a href="https://help.aliyun.com/document_detail/93667.html">Cloud Connect Network overview</a>.</p>
     * 
     * @param request the request parameters of CreateCloudConnectNetwork  CreateCloudConnectNetworkRequest
     * @return CreateCloudConnectNetworkResponse
     */
    CompletableFuture<CreateCloudConnectNetworkResponse> createCloudConnectNetwork(CreateCloudConnectNetworkRequest request);

    /**
     * @param request the request parameters of CreateEnterpriseCode  CreateEnterpriseCodeRequest
     * @return CreateEnterpriseCodeResponse
     */
    CompletableFuture<CreateEnterpriseCodeResponse> createEnterpriseCode(CreateEnterpriseCodeRequest request);

    /**
     * @param request the request parameters of CreateFlowLog  CreateFlowLogRequest
     * @return CreateFlowLogResponse
     */
    CompletableFuture<CreateFlowLogResponse> createFlowLog(CreateFlowLogRequest request);

    /**
     * @param request the request parameters of CreateHealthCheck  CreateHealthCheckRequest
     * @return CreateHealthCheckResponse
     */
    CompletableFuture<CreateHealthCheckResponse> createHealthCheck(CreateHealthCheckRequest request);

    /**
     * @param request the request parameters of CreateProbeTask  CreateProbeTaskRequest
     * @return CreateProbeTaskResponse
     */
    CompletableFuture<CreateProbeTaskResponse> createProbeTask(CreateProbeTaskRequest request);

    /**
     * @param request the request parameters of CreateQos  CreateQosRequest
     * @return CreateQosResponse
     */
    CompletableFuture<CreateQosResponse> createQos(CreateQosRequest request);

    /**
     * @param request the request parameters of CreateQosCar  CreateQosCarRequest
     * @return CreateQosCarResponse
     */
    CompletableFuture<CreateQosCarResponse> createQosCar(CreateQosCarRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create 5-tuple rules for a QoS policy, make sure that you have created a bandwidth throttling rule for the QoS policy. For more information, see <a href="https://help.aliyun.com/document_detail/131806.html">CreateQosCar</a>.</p>
     * 
     * @param request the request parameters of CreateQosPolicy  CreateQosPolicyRequest
     * @return CreateQosPolicyResponse
     */
    CompletableFuture<CreateQosPolicyResponse> createQosPolicy(CreateQosPolicyRequest request);

    /**
     * @param request the request parameters of CreateSagExpressConnectInterface  CreateSagExpressConnectInterfaceRequest
     * @return CreateSagExpressConnectInterfaceResponse
     */
    CompletableFuture<CreateSagExpressConnectInterfaceResponse> createSagExpressConnectInterface(CreateSagExpressConnectInterfaceRequest request);

    /**
     * @param request the request parameters of CreateSagStaticRoute  CreateSagStaticRouteRequest
     * @return CreateSagStaticRouteResponse
     */
    CompletableFuture<CreateSagStaticRouteResponse> createSagStaticRoute(CreateSagStaticRouteRequest request);

    /**
     * @param request the request parameters of CreateServiceAddress  CreateServiceAddressRequest
     * @return CreateServiceAddressResponse
     */
    CompletableFuture<CreateServiceAddressResponse> createServiceAddress(CreateServiceAddressRequest request);

    /**
     * @param request the request parameters of CreateSmartAccessGateway  CreateSmartAccessGatewayRequest
     * @return CreateSmartAccessGatewayResponse
     */
    CompletableFuture<CreateSmartAccessGatewayResponse> createSmartAccessGateway(CreateSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of CreateSmartAccessGatewayClientUser  CreateSmartAccessGatewayClientUserRequest
     * @return CreateSmartAccessGatewayClientUserResponse
     */
    CompletableFuture<CreateSmartAccessGatewayClientUserResponse> createSmartAccessGatewayClientUser(CreateSmartAccessGatewayClientUserRequest request);

    /**
     * @param request the request parameters of CreateSmartAccessGatewaySoftware  CreateSmartAccessGatewaySoftwareRequest
     * @return CreateSmartAccessGatewaySoftwareResponse
     */
    CompletableFuture<CreateSmartAccessGatewaySoftwareResponse> createSmartAccessGatewaySoftware(CreateSmartAccessGatewaySoftwareRequest request);

    /**
     * @param request the request parameters of DeactiveFlowLog  DeactiveFlowLogRequest
     * @return DeactiveFlowLogResponse
     */
    CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request);

    /**
     * @param request the request parameters of DeleteACL  DeleteACLRequest
     * @return DeleteACLResponse
     */
    CompletableFuture<DeleteACLResponse> deleteACL(DeleteACLRequest request);

    /**
     * @param request the request parameters of DeleteACLRule  DeleteACLRuleRequest
     * @return DeleteACLRuleResponse
     */
    CompletableFuture<DeleteACLRuleResponse> deleteACLRule(DeleteACLRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Make sure that the CCN instance you want to delete is not associated with a Smart Access Gateway (SAG) instance or a Cloud Enterprise Network (CEN) instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCloudConnectNetwork  DeleteCloudConnectNetworkRequest
     * @return DeleteCloudConnectNetworkResponse
     */
    CompletableFuture<DeleteCloudConnectNetworkResponse> deleteCloudConnectNetwork(DeleteCloudConnectNetworkRequest request);

    /**
     * @param request the request parameters of DeleteDnatEntry  DeleteDnatEntryRequest
     * @return DeleteDnatEntryResponse
     */
    CompletableFuture<DeleteDnatEntryResponse> deleteDnatEntry(DeleteDnatEntryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete an enterprise code, note the following information:</p>
     * <ul>
     * <li>You cannot delete the default enterprise code.
     * If the enterprise code you want to delete is the default enterprise code, change the default enterprise code to a regular enterprise code and then delete it. For more information, see <a href="https://help.aliyun.com/document_detail/197700.html">UpdateEnterpriseCode</a>.</li>
     * <li>You cannot delete an enterprise code that is attached to a Smart Access Gateway app instance.
     * If the enterprise code you want to delete has an attached Smart Access Gateway app instance, change the enterprise code of the Smart Access Gateway app instance to another enterprise code and then delete the current enterprise code. For more information, see <a href="https://help.aliyun.com/document_detail/197701.html">UpdateSmartAGEnterpriseCode</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEnterpriseCode  DeleteEnterpriseCodeRequest
     * @return DeleteEnterpriseCodeResponse
     */
    CompletableFuture<DeleteEnterpriseCodeResponse> deleteEnterpriseCode(DeleteEnterpriseCodeRequest request);

    /**
     * @param request the request parameters of DeleteFlowLog  DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     */
    CompletableFuture<DeleteFlowLogResponse> deleteFlowLog(DeleteFlowLogRequest request);

    /**
     * @param request the request parameters of DeleteHealthCheck  DeleteHealthCheckRequest
     * @return DeleteHealthCheckResponse
     */
    CompletableFuture<DeleteHealthCheckResponse> deleteHealthCheck(DeleteHealthCheckRequest request);

    /**
     * @param request the request parameters of DeleteProbeTask  DeleteProbeTaskRequest
     * @return DeleteProbeTaskResponse
     */
    CompletableFuture<DeleteProbeTaskResponse> deleteProbeTask(DeleteProbeTaskRequest request);

    /**
     * @param request the request parameters of DeleteQos  DeleteQosRequest
     * @return DeleteQosResponse
     */
    CompletableFuture<DeleteQosResponse> deleteQos(DeleteQosRequest request);

    /**
     * @param request the request parameters of DeleteQosCar  DeleteQosCarRequest
     * @return DeleteQosCarResponse
     */
    CompletableFuture<DeleteQosCarResponse> deleteQosCar(DeleteQosCarRequest request);

    /**
     * @param request the request parameters of DeleteQosPolicy  DeleteQosPolicyRequest
     * @return DeleteQosPolicyResponse
     */
    CompletableFuture<DeleteQosPolicyResponse> deleteQosPolicy(DeleteQosPolicyRequest request);

    /**
     * @param request the request parameters of DeleteRouteDistributionStrategy  DeleteRouteDistributionStrategyRequest
     * @return DeleteRouteDistributionStrategyResponse
     */
    CompletableFuture<DeleteRouteDistributionStrategyResponse> deleteRouteDistributionStrategy(DeleteRouteDistributionStrategyRequest request);

    /**
     * @param request the request parameters of DeleteSagExpressConnectInterface  DeleteSagExpressConnectInterfaceRequest
     * @return DeleteSagExpressConnectInterfaceResponse
     */
    CompletableFuture<DeleteSagExpressConnectInterfaceResponse> deleteSagExpressConnectInterface(DeleteSagExpressConnectInterfaceRequest request);

    /**
     * @param request the request parameters of DeleteSagStaticRoute  DeleteSagStaticRouteRequest
     * @return DeleteSagStaticRouteResponse
     */
    CompletableFuture<DeleteSagStaticRouteResponse> deleteSagStaticRoute(DeleteSagStaticRouteRequest request);

    /**
     * @param request the request parameters of DeleteServiceAddress  DeleteServiceAddressRequest
     * @return DeleteServiceAddressResponse
     */
    CompletableFuture<DeleteServiceAddressResponse> deleteServiceAddress(DeleteServiceAddressRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Smart Access Gateway instance you want to delete is a hardware instance or a vCPE instance.</li>
     * <li>The Smart Access Gateway instance you want to delete is in the financial lock state.</li>
     * <li>The Smart Access Gateway instance you want to delete is not associated with any Cloud Connect Network (CCN) or Virtual Border Router (VBR) instances. If the instance is associated with network instances, disassociate them first. For more information, see <a href="https://help.aliyun.com/document_detail/164903.html">Disassociate a network instance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSmartAccessGateway  DeleteSmartAccessGatewayRequest
     * @return DeleteSmartAccessGatewayResponse
     */
    CompletableFuture<DeleteSmartAccessGatewayResponse> deleteSmartAccessGateway(DeleteSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of DeleteSmartAccessGatewayClientUser  DeleteSmartAccessGatewayClientUserRequest
     * @return DeleteSmartAccessGatewayClientUserResponse
     */
    CompletableFuture<DeleteSmartAccessGatewayClientUserResponse> deleteSmartAccessGatewayClientUser(DeleteSmartAccessGatewayClientUserRequest request);

    /**
     * @param request the request parameters of DeleteSmartAccessGatewayDnsForward  DeleteSmartAccessGatewayDnsForwardRequest
     * @return DeleteSmartAccessGatewayDnsForwardResponse
     */
    CompletableFuture<DeleteSmartAccessGatewayDnsForwardResponse> deleteSmartAccessGatewayDnsForward(DeleteSmartAccessGatewayDnsForwardRequest request);

    /**
     * @param request the request parameters of DeleteSnatEntry  DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
     */
    CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request);

    /**
     * @param request the request parameters of DescribeACLAttribute  DescribeACLAttributeRequest
     * @return DescribeACLAttributeResponse
     */
    CompletableFuture<DescribeACLAttributeResponse> describeACLAttribute(DescribeACLAttributeRequest request);

    /**
     * @param request the request parameters of DescribeACLs  DescribeACLsRequest
     * @return DescribeACLsResponse
     */
    CompletableFuture<DescribeACLsResponse> describeACLs(DescribeACLsRequest request);

    /**
     * @param request the request parameters of DescribeBindableSmartAccessGateways  DescribeBindableSmartAccessGatewaysRequest
     * @return DescribeBindableSmartAccessGatewaysResponse
     */
    CompletableFuture<DescribeBindableSmartAccessGatewaysResponse> describeBindableSmartAccessGateways(DescribeBindableSmartAccessGatewaysRequest request);

    /**
     * @param request the request parameters of DescribeClientUserDNS  DescribeClientUserDNSRequest
     * @return DescribeClientUserDNSResponse
     */
    CompletableFuture<DescribeClientUserDNSResponse> describeClientUserDNS(DescribeClientUserDNSRequest request);

    /**
     * @param request the request parameters of DescribeCloudConnectNetworks  DescribeCloudConnectNetworksRequest
     * @return DescribeCloudConnectNetworksResponse
     */
    CompletableFuture<DescribeCloudConnectNetworksResponse> describeCloudConnectNetworks(DescribeCloudConnectNetworksRequest request);

    /**
     * @param request the request parameters of DescribeDeviceAutoUpgradePolicy  DescribeDeviceAutoUpgradePolicyRequest
     * @return DescribeDeviceAutoUpgradePolicyResponse
     */
    CompletableFuture<DescribeDeviceAutoUpgradePolicyResponse> describeDeviceAutoUpgradePolicy(DescribeDeviceAutoUpgradePolicyRequest request);

    /**
     * @param request the request parameters of DescribeDnatEntries  DescribeDnatEntriesRequest
     * @return DescribeDnatEntriesResponse
     */
    CompletableFuture<DescribeDnatEntriesResponse> describeDnatEntries(DescribeDnatEntriesRequest request);

    /**
     * @param request the request parameters of DescribeFlowLogSags  DescribeFlowLogSagsRequest
     * @return DescribeFlowLogSagsResponse
     */
    CompletableFuture<DescribeFlowLogSagsResponse> describeFlowLogSags(DescribeFlowLogSagsRequest request);

    /**
     * @param request the request parameters of DescribeFlowLogs  DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     */
    CompletableFuture<DescribeFlowLogsResponse> describeFlowLogs(DescribeFlowLogsRequest request);

    /**
     * @param request the request parameters of DescribeGrantRules  DescribeGrantRulesRequest
     * @return DescribeGrantRulesResponse
     */
    CompletableFuture<DescribeGrantRulesResponse> describeGrantRules(DescribeGrantRulesRequest request);

    /**
     * @param request the request parameters of DescribeGrantSagRules  DescribeGrantSagRulesRequest
     * @return DescribeGrantSagRulesResponse
     */
    CompletableFuture<DescribeGrantSagRulesResponse> describeGrantSagRules(DescribeGrantSagRulesRequest request);

    /**
     * @param request the request parameters of DescribeGrantSagVbrRules  DescribeGrantSagVbrRulesRequest
     * @return DescribeGrantSagVbrRulesResponse
     */
    CompletableFuture<DescribeGrantSagVbrRulesResponse> describeGrantSagVbrRules(DescribeGrantSagVbrRulesRequest request);

    /**
     * @param request the request parameters of DescribeHealthCheckAttribute  DescribeHealthCheckAttributeRequest
     * @return DescribeHealthCheckAttributeResponse
     */
    CompletableFuture<DescribeHealthCheckAttributeResponse> describeHealthCheckAttribute(DescribeHealthCheckAttributeRequest request);

    /**
     * @param request the request parameters of DescribeHealthChecks  DescribeHealthChecksRequest
     * @return DescribeHealthChecksResponse
     */
    CompletableFuture<DescribeHealthChecksResponse> describeHealthChecks(DescribeHealthChecksRequest request);

    /**
     * @param request the request parameters of DescribeQosCars  DescribeQosCarsRequest
     * @return DescribeQosCarsResponse
     */
    CompletableFuture<DescribeQosCarsResponse> describeQosCars(DescribeQosCarsRequest request);

    /**
     * @param request the request parameters of DescribeQosPolicies  DescribeQosPoliciesRequest
     * @return DescribeQosPoliciesResponse
     */
    CompletableFuture<DescribeQosPoliciesResponse> describeQosPolicies(DescribeQosPoliciesRequest request);

    /**
     * @param request the request parameters of DescribeQoses  DescribeQosesRequest
     * @return DescribeQosesResponse
     */
    CompletableFuture<DescribeQosesResponse> describeQoses(DescribeQosesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRouteDistributionStrategies  DescribeRouteDistributionStrategiesRequest
     * @return DescribeRouteDistributionStrategiesResponse
     */
    CompletableFuture<DescribeRouteDistributionStrategiesResponse> describeRouteDistributionStrategies(DescribeRouteDistributionStrategiesRequest request);

    /**
     * @param request the request parameters of DescribeSAGDeviceInfo  DescribeSAGDeviceInfoRequest
     * @return DescribeSAGDeviceInfoResponse
     */
    CompletableFuture<DescribeSAGDeviceInfoResponse> describeSAGDeviceInfo(DescribeSAGDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeSagCurrentDns  DescribeSagCurrentDnsRequest
     * @return DescribeSagCurrentDnsResponse
     */
    CompletableFuture<DescribeSagCurrentDnsResponse> describeSagCurrentDns(DescribeSagCurrentDnsRequest request);

    /**
     * @param request the request parameters of DescribeSagDropTopN  DescribeSagDropTopNRequest
     * @return DescribeSagDropTopNResponse
     */
    CompletableFuture<DescribeSagDropTopNResponse> describeSagDropTopN(DescribeSagDropTopNRequest request);

    /**
     * @param request the request parameters of DescribeSagExpressConnectInterfaceList  DescribeSagExpressConnectInterfaceListRequest
     * @return DescribeSagExpressConnectInterfaceListResponse
     */
    CompletableFuture<DescribeSagExpressConnectInterfaceListResponse> describeSagExpressConnectInterfaceList(DescribeSagExpressConnectInterfaceListRequest request);

    /**
     * @param request the request parameters of DescribeSagGlobalRouteProtocol  DescribeSagGlobalRouteProtocolRequest
     * @return DescribeSagGlobalRouteProtocolResponse
     */
    CompletableFuture<DescribeSagGlobalRouteProtocolResponse> describeSagGlobalRouteProtocol(DescribeSagGlobalRouteProtocolRequest request);

    /**
     * @param request the request parameters of DescribeSagHa  DescribeSagHaRequest
     * @return DescribeSagHaResponse
     */
    CompletableFuture<DescribeSagHaResponse> describeSagHa(DescribeSagHaRequest request);

    /**
     * @param request the request parameters of DescribeSagLanList  DescribeSagLanListRequest
     * @return DescribeSagLanListResponse
     */
    CompletableFuture<DescribeSagLanListResponse> describeSagLanList(DescribeSagLanListRequest request);

    /**
     * @param request the request parameters of DescribeSagManagementPort  DescribeSagManagementPortRequest
     * @return DescribeSagManagementPortResponse
     */
    CompletableFuture<DescribeSagManagementPortResponse> describeSagManagementPort(DescribeSagManagementPortRequest request);

    /**
     * @param request the request parameters of DescribeSagOnlineClientStatistics  DescribeSagOnlineClientStatisticsRequest
     * @return DescribeSagOnlineClientStatisticsResponse
     */
    CompletableFuture<DescribeSagOnlineClientStatisticsResponse> describeSagOnlineClientStatistics(DescribeSagOnlineClientStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeSagPortList  DescribeSagPortListRequest
     * @return DescribeSagPortListResponse
     */
    CompletableFuture<DescribeSagPortListResponse> describeSagPortList(DescribeSagPortListRequest request);

    /**
     * @param request the request parameters of DescribeSagPortRouteProtocolList  DescribeSagPortRouteProtocolListRequest
     * @return DescribeSagPortRouteProtocolListResponse
     */
    CompletableFuture<DescribeSagPortRouteProtocolListResponse> describeSagPortRouteProtocolList(DescribeSagPortRouteProtocolListRequest request);

    /**
     * @param request the request parameters of DescribeSagRemoteAccess  DescribeSagRemoteAccessRequest
     * @return DescribeSagRemoteAccessResponse
     */
    CompletableFuture<DescribeSagRemoteAccessResponse> describeSagRemoteAccess(DescribeSagRemoteAccessRequest request);

    /**
     * @param request the request parameters of DescribeSagRouteList  DescribeSagRouteListRequest
     * @return DescribeSagRouteListResponse
     */
    CompletableFuture<DescribeSagRouteListResponse> describeSagRouteList(DescribeSagRouteListRequest request);

    /**
     * @param request the request parameters of DescribeSagRouteProtocolBgp  DescribeSagRouteProtocolBgpRequest
     * @return DescribeSagRouteProtocolBgpResponse
     */
    CompletableFuture<DescribeSagRouteProtocolBgpResponse> describeSagRouteProtocolBgp(DescribeSagRouteProtocolBgpRequest request);

    /**
     * @param request the request parameters of DescribeSagRouteProtocolOspf  DescribeSagRouteProtocolOspfRequest
     * @return DescribeSagRouteProtocolOspfResponse
     */
    CompletableFuture<DescribeSagRouteProtocolOspfResponse> describeSagRouteProtocolOspf(DescribeSagRouteProtocolOspfRequest request);

    /**
     * @param request the request parameters of DescribeSagStaticRouteList  DescribeSagStaticRouteListRequest
     * @return DescribeSagStaticRouteListResponse
     */
    CompletableFuture<DescribeSagStaticRouteListResponse> describeSagStaticRouteList(DescribeSagStaticRouteListRequest request);

    /**
     * @param request the request parameters of DescribeSagTrafficTopN  DescribeSagTrafficTopNRequest
     * @return DescribeSagTrafficTopNResponse
     */
    CompletableFuture<DescribeSagTrafficTopNResponse> describeSagTrafficTopN(DescribeSagTrafficTopNRequest request);

    /**
     * @param request the request parameters of DescribeSagUserDns  DescribeSagUserDnsRequest
     * @return DescribeSagUserDnsResponse
     */
    CompletableFuture<DescribeSagUserDnsResponse> describeSagUserDns(DescribeSagUserDnsRequest request);

    /**
     * @param request the request parameters of DescribeSagVbrRelations  DescribeSagVbrRelationsRequest
     * @return DescribeSagVbrRelationsResponse
     */
    CompletableFuture<DescribeSagVbrRelationsResponse> describeSagVbrRelations(DescribeSagVbrRelationsRequest request);

    /**
     * @param request the request parameters of DescribeSagWan4G  DescribeSagWan4GRequest
     * @return DescribeSagWan4GResponse
     */
    CompletableFuture<DescribeSagWan4GResponse> describeSagWan4G(DescribeSagWan4GRequest request);

    /**
     * @param request the request parameters of DescribeSagWanList  DescribeSagWanListRequest
     * @return DescribeSagWanListResponse
     */
    CompletableFuture<DescribeSagWanListResponse> describeSagWanList(DescribeSagWanListRequest request);

    /**
     * @param request the request parameters of DescribeSagWanSnat  DescribeSagWanSnatRequest
     * @return DescribeSagWanSnatResponse
     */
    CompletableFuture<DescribeSagWanSnatResponse> describeSagWanSnat(DescribeSagWanSnatRequest request);

    /**
     * @param request the request parameters of DescribeSagWifi  DescribeSagWifiRequest
     * @return DescribeSagWifiResponse
     */
    CompletableFuture<DescribeSagWifiResponse> describeSagWifi(DescribeSagWifiRequest request);

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayAttribute  DescribeSmartAccessGatewayAttributeRequest
     * @return DescribeSmartAccessGatewayAttributeResponse
     */
    CompletableFuture<DescribeSmartAccessGatewayAttributeResponse> describeSmartAccessGatewayAttribute(DescribeSmartAccessGatewayAttributeRequest request);

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayClientUsers  DescribeSmartAccessGatewayClientUsersRequest
     * @return DescribeSmartAccessGatewayClientUsersResponse
     */
    CompletableFuture<DescribeSmartAccessGatewayClientUsersResponse> describeSmartAccessGatewayClientUsers(DescribeSmartAccessGatewayClientUsersRequest request);

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayHa  DescribeSmartAccessGatewayHaRequest
     * @return DescribeSmartAccessGatewayHaResponse
     */
    CompletableFuture<DescribeSmartAccessGatewayHaResponse> describeSmartAccessGatewayHa(DescribeSmartAccessGatewayHaRequest request);

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayVersions  DescribeSmartAccessGatewayVersionsRequest
     * @return DescribeSmartAccessGatewayVersionsResponse
     */
    CompletableFuture<DescribeSmartAccessGatewayVersionsResponse> describeSmartAccessGatewayVersions(DescribeSmartAccessGatewayVersionsRequest request);

    /**
     * @param request the request parameters of DescribeSmartAccessGateways  DescribeSmartAccessGatewaysRequest
     * @return DescribeSmartAccessGatewaysResponse
     */
    CompletableFuture<DescribeSmartAccessGatewaysResponse> describeSmartAccessGateways(DescribeSmartAccessGatewaysRequest request);

    /**
     * @param request the request parameters of DescribeSnatEntries  DescribeSnatEntriesRequest
     * @return DescribeSnatEntriesResponse
     */
    CompletableFuture<DescribeSnatEntriesResponse> describeSnatEntries(DescribeSnatEntriesRequest request);

    /**
     * @param request the request parameters of DescribeUnbindFlowLogSags  DescribeUnbindFlowLogSagsRequest
     * @return DescribeUnbindFlowLogSagsResponse
     */
    CompletableFuture<DescribeUnbindFlowLogSagsResponse> describeUnbindFlowLogSags(DescribeUnbindFlowLogSagsRequest request);

    /**
     * @param request the request parameters of DescribeUserFlowStatistics  DescribeUserFlowStatisticsRequest
     * @return DescribeUserFlowStatisticsResponse
     */
    CompletableFuture<DescribeUserFlowStatisticsResponse> describeUserFlowStatistics(DescribeUserFlowStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeUserOnlineClientStatistics  DescribeUserOnlineClientStatisticsRequest
     * @return DescribeUserOnlineClientStatisticsResponse
     */
    CompletableFuture<DescribeUserOnlineClientStatisticsResponse> describeUserOnlineClientStatistics(DescribeUserOnlineClientStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeUserOnlineClients  DescribeUserOnlineClientsRequest
     * @return DescribeUserOnlineClientsResponse
     */
    CompletableFuture<DescribeUserOnlineClientsResponse> describeUserOnlineClients(DescribeUserOnlineClientsRequest request);

    /**
     * <b>description</b> :
     * <p>Disassociates a Cloud Connect Network (CCN) from a Cloud Enterprise Network (CEN).</p>
     * 
     * @param request the request parameters of DetachCcnInstanceFromCen  DetachCcnInstanceFromCenRequest
     * @return DetachCcnInstanceFromCenResponse
     */
    CompletableFuture<DetachCcnInstanceFromCenResponse> detachCcnInstanceFromCen(DetachCcnInstanceFromCenRequest request);

    /**
     * @param request the request parameters of DiagnoseSmartAccessGateway  DiagnoseSmartAccessGatewayRequest
     * @return DiagnoseSmartAccessGatewayResponse
     */
    CompletableFuture<DiagnoseSmartAccessGatewayResponse> diagnoseSmartAccessGateway(DiagnoseSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of DisableSmartAGDpiMonitor  DisableSmartAGDpiMonitorRequest
     * @return DisableSmartAGDpiMonitorResponse
     */
    CompletableFuture<DisableSmartAGDpiMonitorResponse> disableSmartAGDpiMonitor(DisableSmartAGDpiMonitorRequest request);

    /**
     * @param request the request parameters of DisableSmartAccessGatewayUser  DisableSmartAccessGatewayUserRequest
     * @return DisableSmartAccessGatewayUserResponse
     */
    CompletableFuture<DisableSmartAccessGatewayUserResponse> disableSmartAccessGatewayUser(DisableSmartAccessGatewayUserRequest request);

    /**
     * @param request the request parameters of DisassociateACL  DisassociateACLRequest
     * @return DisassociateACLResponse
     */
    CompletableFuture<DisassociateACLResponse> disassociateACL(DisassociateACLRequest request);

    /**
     * @param request the request parameters of DisassociateFlowLog  DisassociateFlowLogRequest
     * @return DisassociateFlowLogResponse
     */
    CompletableFuture<DisassociateFlowLogResponse> disassociateFlowLog(DisassociateFlowLogRequest request);

    /**
     * @param request the request parameters of DisassociateQos  DisassociateQosRequest
     * @return DisassociateQosResponse
     */
    CompletableFuture<DisassociateQosResponse> disassociateQos(DisassociateQosRequest request);

    /**
     * @param request the request parameters of DiscribeSmartAccessGatewayDiagnosisReport  DiscribeSmartAccessGatewayDiagnosisReportRequest
     * @return DiscribeSmartAccessGatewayDiagnosisReportResponse
     */
    CompletableFuture<DiscribeSmartAccessGatewayDiagnosisReportResponse> discribeSmartAccessGatewayDiagnosisReport(DiscribeSmartAccessGatewayDiagnosisReportRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DissociateSmartAGFromApplicationBandwidthPackage</strong> operation, you can specify the <strong>SmartAGId</strong> parameter to disassociate a bandwidth plan for application acceleration from a specified Smart Access Gateway instance. You can also specify the <strong>SmartAGIdList</strong> parameter to disassociate the bandwidth plan for application acceleration from multiple Smart Access Gateway instances at the same time.</p>
     * 
     * @param request the request parameters of DissociateSmartAGFromApplicationBandwidthPackage  DissociateSmartAGFromApplicationBandwidthPackageRequest
     * @return DissociateSmartAGFromApplicationBandwidthPackageResponse
     */
    CompletableFuture<DissociateSmartAGFromApplicationBandwidthPackageResponse> dissociateSmartAGFromApplicationBandwidthPackage(DissociateSmartAGFromApplicationBandwidthPackageRequest request);

    /**
     * @param request the request parameters of DowngradeSmartAccessGateway  DowngradeSmartAccessGatewayRequest
     * @return DowngradeSmartAccessGatewayResponse
     */
    CompletableFuture<DowngradeSmartAccessGatewayResponse> downgradeSmartAccessGateway(DowngradeSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of DowngradeSmartAccessGatewaySoftware  DowngradeSmartAccessGatewaySoftwareRequest
     * @return DowngradeSmartAccessGatewaySoftwareResponse
     */
    CompletableFuture<DowngradeSmartAccessGatewaySoftwareResponse> downgradeSmartAccessGatewaySoftware(DowngradeSmartAccessGatewaySoftwareRequest request);

    /**
     * <b>description</b> :
     * <p>  The DPI feature is enabled for the SAG instance. For more information, see <a href="https://help.aliyun.com/document_detail/196146.html">UpdateSmartAGDpiAttribute</a>.</p>
     * <ul>
     * <li>Log Service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Quick Start</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableSmartAGDpiMonitor  EnableSmartAGDpiMonitorRequest
     * @return EnableSmartAGDpiMonitorResponse
     */
    CompletableFuture<EnableSmartAGDpiMonitorResponse> enableSmartAGDpiMonitor(EnableSmartAGDpiMonitorRequest request);

    /**
     * @param request the request parameters of EnableSmartAccessGatewayUser  EnableSmartAccessGatewayUserRequest
     * @return EnableSmartAccessGatewayUserResponse
     */
    CompletableFuture<EnableSmartAccessGatewayUserResponse> enableSmartAccessGatewayUser(EnableSmartAccessGatewayUserRequest request);

    /**
     * <b>description</b> :
     * <p>  An application-aware ACL is created. For more information, see <a href="https://help.aliyun.com/document_detail/114012.html">AddACLRule</a>.</p>
     * <ul>
     * <li>The application-aware ACL is applied to a Smart Access Gateway (SAG) instance. For more information, see <a href="https://help.aliyun.com/document_detail/114009.html">AssociateACL</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAclAttribute  GetAclAttributeRequest
     * @return GetAclAttributeResponse
     */
    CompletableFuture<GetAclAttributeResponse> getAclAttribute(GetAclAttributeRequest request);

    /**
     * @param request the request parameters of GetAdvancedMonitorState  GetAdvancedMonitorStateRequest
     * @return GetAdvancedMonitorStateResponse
     */
    CompletableFuture<GetAdvancedMonitorStateResponse> getAdvancedMonitorState(GetAdvancedMonitorStateRequest request);

    /**
     * @param request the request parameters of GetCloudConnectNetworkUseLimit  GetCloudConnectNetworkUseLimitRequest
     * @return GetCloudConnectNetworkUseLimitResponse
     */
    CompletableFuture<GetCloudConnectNetworkUseLimitResponse> getCloudConnectNetworkUseLimit(GetCloudConnectNetworkUseLimitRequest request);

    /**
     * @param request the request parameters of GetQosAttribute  GetQosAttributeRequest
     * @return GetQosAttributeResponse
     */
    CompletableFuture<GetQosAttributeResponse> getQosAttribute(GetQosAttributeRequest request);

    /**
     * @param request the request parameters of GetSmartAGDpiAttribute  GetSmartAGDpiAttributeRequest
     * @return GetSmartAGDpiAttributeResponse
     */
    CompletableFuture<GetSmartAGDpiAttributeResponse> getSmartAGDpiAttribute(GetSmartAGDpiAttributeRequest request);

    /**
     * @param request the request parameters of GetSmartAccessGatewayUseLimit  GetSmartAccessGatewayUseLimitRequest
     * @return GetSmartAccessGatewayUseLimitResponse
     */
    CompletableFuture<GetSmartAccessGatewayUseLimitResponse> getSmartAccessGatewayUseLimit(GetSmartAccessGatewayUseLimitRequest request);

    /**
     * @param request the request parameters of GrantInstanceToCbn  GrantInstanceToCbnRequest
     * @return GrantInstanceToCbnResponse
     */
    CompletableFuture<GrantInstanceToCbnResponse> grantInstanceToCbn(GrantInstanceToCbnRequest request);

    /**
     * @param request the request parameters of GrantSagInstanceToCcn  GrantSagInstanceToCcnRequest
     * @return GrantSagInstanceToCcnResponse
     */
    CompletableFuture<GrantSagInstanceToCcnResponse> grantSagInstanceToCcn(GrantSagInstanceToCcnRequest request);

    /**
     * @param request the request parameters of GrantSagInstanceToVbr  GrantSagInstanceToVbrRequest
     * @return GrantSagInstanceToVbrResponse
     */
    CompletableFuture<GrantSagInstanceToVbrResponse> grantSagInstanceToVbr(GrantSagInstanceToVbrRequest request);

    /**
     * @param request the request parameters of KickOutClients  KickOutClientsRequest
     * @return KickOutClientsResponse
     */
    CompletableFuture<KickOutClientsResponse> kickOutClients(KickOutClientsRequest request);

    /**
     * @param request the request parameters of ListAccessPointNetworkQualities  ListAccessPointNetworkQualitiesRequest
     * @return ListAccessPointNetworkQualitiesResponse
     */
    CompletableFuture<ListAccessPointNetworkQualitiesResponse> listAccessPointNetworkQualities(ListAccessPointNetworkQualitiesRequest request);

    /**
     * <b>description</b> :
     * <p>An access point connects Smart Access Gateway (SAG) instances to Cloud Connect Network (CCN). Some regions may contain more than one access point. After an SAG instance is associated with a CCN instance, the system selects the nearest access point to establish connections to Alibaba Cloud. This topic describes how to query access points in a specific region. For more information about the areas that support CCN, see <a href="https://help.aliyun.com/document_detail/93667.html">Introduction to CCN</a>.</p>
     * 
     * @param request the request parameters of ListAccessPoints  ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    CompletableFuture<ListAccessPointsResponse> listAccessPoints(ListAccessPointsRequest request);

    /**
     * @param request the request parameters of ListAvailableServiceAddress  ListAvailableServiceAddressRequest
     * @return ListAvailableServiceAddressResponse
     */
    CompletableFuture<ListAvailableServiceAddressResponse> listAvailableServiceAddress(ListAvailableServiceAddressRequest request);

    /**
     * <b>description</b> :
     * <p>If you have configured an application-based access control instance or a quality of service (QoS) policy instance and associated it with a Smart Access Gateway instance, you can invoke this operation to check whether the access control rules or 5-tuple rules of the QoS policy that you created are successfully applied to the destination Smart Access Gateway instance. If any configurations fail to be applied, this operation returns the configuration exception information.</p>
     * 
     * @param request the request parameters of ListDpiConfigError  ListDpiConfigErrorRequest
     * @return ListDpiConfigErrorResponse
     */
    CompletableFuture<ListDpiConfigErrorResponse> listDpiConfigError(ListDpiConfigErrorRequest request);

    /**
     * @param request the request parameters of ListDpiGroups  ListDpiGroupsRequest
     * @return ListDpiGroupsResponse
     */
    CompletableFuture<ListDpiGroupsResponse> listDpiGroups(ListDpiGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation lets you:</p>
     * <ul>
     * <li>Query all applications supported by SAG in a specified region.</li>
     * <li>Query a specific application by its ID in a specified region.</li>
     * <li>Query a specific application by its name in a specified region.</li>
     * <li>Query all applications in a specific application group by the group ID in a specified region.
     * If this is the first time you call this operation, we recommend that you query all applications supported by SAG in a region. This helps you obtain the information required for subsequent queries of specific applications.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDpiSignatures  ListDpiSignaturesRequest
     * @return ListDpiSignaturesResponse
     */
    CompletableFuture<ListDpiSignaturesResponse> listDpiSignatures(ListDpiSignaturesRequest request);

    /**
     * @param request the request parameters of ListEnterpriseCode  ListEnterpriseCodeRequest
     * @return ListEnterpriseCodeResponse
     */
    CompletableFuture<ListEnterpriseCodeResponse> listEnterpriseCode(ListEnterpriseCodeRequest request);

    /**
     * @param request the request parameters of ListProbeTask  ListProbeTaskRequest
     * @return ListProbeTaskResponse
     */
    CompletableFuture<ListProbeTaskResponse> listProbeTask(ListProbeTaskRequest request);

    /**
     * @param request the request parameters of ListSmartAGApiUnsupportedFeature  ListSmartAGApiUnsupportedFeatureRequest
     * @return ListSmartAGApiUnsupportedFeatureResponse
     */
    CompletableFuture<ListSmartAGApiUnsupportedFeatureResponse> listSmartAGApiUnsupportedFeature(ListSmartAGApiUnsupportedFeatureRequest request);

    /**
     * @param request the request parameters of ListSmartAGByAccessPoint  ListSmartAGByAccessPointRequest
     * @return ListSmartAGByAccessPointResponse
     */
    CompletableFuture<ListSmartAGByAccessPointResponse> listSmartAGByAccessPoint(ListSmartAGByAccessPointRequest request);

    /**
     * @param request the request parameters of ModifyACL  ModifyACLRequest
     * @return ModifyACLResponse
     */
    CompletableFuture<ModifyACLResponse> modifyACL(ModifyACLRequest request);

    /**
     * @param request the request parameters of ModifyACLRule  ModifyACLRuleRequest
     * @return ModifyACLRuleResponse
     */
    CompletableFuture<ModifyACLRuleResponse> modifyACLRule(ModifyACLRuleRequest request);

    /**
     * @param request the request parameters of ModifyClientUserDNS  ModifyClientUserDNSRequest
     * @return ModifyClientUserDNSResponse
     */
    CompletableFuture<ModifyClientUserDNSResponse> modifyClientUserDNS(ModifyClientUserDNSRequest request);

    /**
     * @param request the request parameters of ModifyCloudConnectNetwork  ModifyCloudConnectNetworkRequest
     * @return ModifyCloudConnectNetworkResponse
     */
    CompletableFuture<ModifyCloudConnectNetworkResponse> modifyCloudConnectNetwork(ModifyCloudConnectNetworkRequest request);

    /**
     * @param request the request parameters of ModifyDeviceAutoUpgradePolicy  ModifyDeviceAutoUpgradePolicyRequest
     * @return ModifyDeviceAutoUpgradePolicyResponse
     */
    CompletableFuture<ModifyDeviceAutoUpgradePolicyResponse> modifyDeviceAutoUpgradePolicy(ModifyDeviceAutoUpgradePolicyRequest request);

    /**
     * @param request the request parameters of ModifyFlowLogAttribute  ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
     * @param request the request parameters of ModifyHealthCheck  ModifyHealthCheckRequest
     * @return ModifyHealthCheckResponse
     */
    CompletableFuture<ModifyHealthCheckResponse> modifyHealthCheck(ModifyHealthCheckRequest request);

    /**
     * @param request the request parameters of ModifyQos  ModifyQosRequest
     * @return ModifyQosResponse
     */
    CompletableFuture<ModifyQosResponse> modifyQos(ModifyQosRequest request);

    /**
     * @param request the request parameters of ModifyQosCar  ModifyQosCarRequest
     * @return ModifyQosCarResponse
     */
    CompletableFuture<ModifyQosCarResponse> modifyQosCar(ModifyQosCarRequest request);

    /**
     * @param request the request parameters of ModifyQosPolicy  ModifyQosPolicyRequest
     * @return ModifyQosPolicyResponse
     */
    CompletableFuture<ModifyQosPolicyResponse> modifyQosPolicy(ModifyQosPolicyRequest request);

    /**
     * @param request the request parameters of ModifyRouteDistributionStrategy  ModifyRouteDistributionStrategyRequest
     * @return ModifyRouteDistributionStrategyResponse
     */
    CompletableFuture<ModifyRouteDistributionStrategyResponse> modifyRouteDistributionStrategy(ModifyRouteDistributionStrategyRequest request);

    /**
     * @param request the request parameters of ModifySAGAdminPassword  ModifySAGAdminPasswordRequest
     * @return ModifySAGAdminPasswordResponse
     */
    CompletableFuture<ModifySAGAdminPasswordResponse> modifySAGAdminPassword(ModifySAGAdminPasswordRequest request);

    /**
     * @param request the request parameters of ModifySagExpressConnectInterface  ModifySagExpressConnectInterfaceRequest
     * @return ModifySagExpressConnectInterfaceResponse
     */
    CompletableFuture<ModifySagExpressConnectInterfaceResponse> modifySagExpressConnectInterface(ModifySagExpressConnectInterfaceRequest request);

    /**
     * @param request the request parameters of ModifySagGlobalRouteProtocol  ModifySagGlobalRouteProtocolRequest
     * @return ModifySagGlobalRouteProtocolResponse
     */
    CompletableFuture<ModifySagGlobalRouteProtocolResponse> modifySagGlobalRouteProtocol(ModifySagGlobalRouteProtocolRequest request);

    /**
     * @param request the request parameters of ModifySagHa  ModifySagHaRequest
     * @return ModifySagHaResponse
     */
    CompletableFuture<ModifySagHaResponse> modifySagHa(ModifySagHaRequest request);

    /**
     * @param request the request parameters of ModifySagLan  ModifySagLanRequest
     * @return ModifySagLanResponse
     */
    CompletableFuture<ModifySagLanResponse> modifySagLan(ModifySagLanRequest request);

    /**
     * @param request the request parameters of ModifySagManagementPort  ModifySagManagementPortRequest
     * @return ModifySagManagementPortResponse
     */
    CompletableFuture<ModifySagManagementPortResponse> modifySagManagementPort(ModifySagManagementPortRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you modify the role of a port, the current role configurations of the port are deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySagPortRole  ModifySagPortRoleRequest
     * @return ModifySagPortRoleResponse
     */
    CompletableFuture<ModifySagPortRoleResponse> modifySagPortRole(ModifySagPortRoleRequest request);

    /**
     * @param request the request parameters of ModifySagPortRouteProtocol  ModifySagPortRouteProtocolRequest
     * @return ModifySagPortRouteProtocolResponse
     */
    CompletableFuture<ModifySagPortRouteProtocolResponse> modifySagPortRouteProtocol(ModifySagPortRouteProtocolRequest request);

    /**
     * @param request the request parameters of ModifySagRemoteAccess  ModifySagRemoteAccessRequest
     * @return ModifySagRemoteAccessResponse
     */
    CompletableFuture<ModifySagRemoteAccessResponse> modifySagRemoteAccess(ModifySagRemoteAccessRequest request);

    /**
     * @param request the request parameters of ModifySagRouteProtocolBgp  ModifySagRouteProtocolBgpRequest
     * @return ModifySagRouteProtocolBgpResponse
     */
    CompletableFuture<ModifySagRouteProtocolBgpResponse> modifySagRouteProtocolBgp(ModifySagRouteProtocolBgpRequest request);

    /**
     * @param request the request parameters of ModifySagRouteProtocolOspf  ModifySagRouteProtocolOspfRequest
     * @return ModifySagRouteProtocolOspfResponse
     */
    CompletableFuture<ModifySagRouteProtocolOspfResponse> modifySagRouteProtocolOspf(ModifySagRouteProtocolOspfRequest request);

    /**
     * @param request the request parameters of ModifySagStaticRoute  ModifySagStaticRouteRequest
     * @return ModifySagStaticRouteResponse
     */
    CompletableFuture<ModifySagStaticRouteResponse> modifySagStaticRoute(ModifySagStaticRouteRequest request);

    /**
     * @param request the request parameters of ModifySagUserDns  ModifySagUserDnsRequest
     * @return ModifySagUserDnsResponse
     */
    CompletableFuture<ModifySagUserDnsResponse> modifySagUserDns(ModifySagUserDnsRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you understand the functionality of a WAN port before you modify its settings. For more information, see <a href="https://help.aliyun.com/document_detail/163955.html">Configure a WAN port</a>.</p>
     * 
     * @param request the request parameters of ModifySagWan  ModifySagWanRequest
     * @return ModifySagWanResponse
     */
    CompletableFuture<ModifySagWanResponse> modifySagWan(ModifySagWanRequest request);

    /**
     * @param request the request parameters of ModifySagWanSnat  ModifySagWanSnatRequest
     * @return ModifySagWanSnatResponse
     */
    CompletableFuture<ModifySagWanSnatResponse> modifySagWanSnat(ModifySagWanSnatRequest request);

    /**
     * @param request the request parameters of ModifySagWifi  ModifySagWifiRequest
     * @return ModifySagWifiResponse
     */
    CompletableFuture<ModifySagWifiResponse> modifySagWifi(ModifySagWifiRequest request);

    /**
     * @param request the request parameters of ModifySmartAccessGateway  ModifySmartAccessGatewayRequest
     * @return ModifySmartAccessGatewayResponse
     */
    CompletableFuture<ModifySmartAccessGatewayResponse> modifySmartAccessGateway(ModifySmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of ModifySmartAccessGatewayClientUser  ModifySmartAccessGatewayClientUserRequest
     * @return ModifySmartAccessGatewayClientUserResponse
     */
    CompletableFuture<ModifySmartAccessGatewayClientUserResponse> modifySmartAccessGatewayClientUser(ModifySmartAccessGatewayClientUserRequest request);

    /**
     * @param request the request parameters of ModifySmartAccessGatewayUpBandwidth  ModifySmartAccessGatewayUpBandwidthRequest
     * @return ModifySmartAccessGatewayUpBandwidthResponse
     */
    CompletableFuture<ModifySmartAccessGatewayUpBandwidthResponse> modifySmartAccessGatewayUpBandwidth(ModifySmartAccessGatewayUpBandwidthRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to test the connectivity between an SAG instance and a specified access point.</p>
     * <ul>
     * <li>If the SAG instance can connect to the access point, the ID of the request is returned in this operation.</li>
     * <li>If the SAG instance cannot connect to the access point, the ID of the request and corresponding error messages are returned in this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ProbeAccessPointNetworkQuality  ProbeAccessPointNetworkQualityRequest
     * @return ProbeAccessPointNetworkQualityResponse
     */
    CompletableFuture<ProbeAccessPointNetworkQualityResponse> probeAccessPointNetworkQuality(ProbeAccessPointNetworkQualityRequest request);

    /**
     * @param request the request parameters of RebootSmartAccessGateway  RebootSmartAccessGatewayRequest
     * @return RebootSmartAccessGatewayResponse
     */
    CompletableFuture<RebootSmartAccessGatewayResponse> rebootSmartAccessGateway(RebootSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of ResetSmartAccessGatewayClientUserPassword  ResetSmartAccessGatewayClientUserPasswordRequest
     * @return ResetSmartAccessGatewayClientUserPasswordResponse
     */
    CompletableFuture<ResetSmartAccessGatewayClientUserPasswordResponse> resetSmartAccessGatewayClientUserPassword(ResetSmartAccessGatewayClientUserPasswordRequest request);

    /**
     * @param request the request parameters of RevokeInstanceFromCbn  RevokeInstanceFromCbnRequest
     * @return RevokeInstanceFromCbnResponse
     */
    CompletableFuture<RevokeInstanceFromCbnResponse> revokeInstanceFromCbn(RevokeInstanceFromCbnRequest request);

    /**
     * @param request the request parameters of RevokeInstanceFromVbr  RevokeInstanceFromVbrRequest
     * @return RevokeInstanceFromVbrResponse
     */
    CompletableFuture<RevokeInstanceFromVbrResponse> revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request);

    /**
     * @param request the request parameters of RevokeSagInstanceFromCcn  RevokeSagInstanceFromCcnRequest
     * @return RevokeSagInstanceFromCcnResponse
     */
    CompletableFuture<RevokeSagInstanceFromCcnResponse> revokeSagInstanceFromCcn(RevokeSagInstanceFromCcnRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>RoamClientUser</code> operation, understand the SAG app roaming feature and its description. For more information, see <a href="https://help.aliyun.com/document_detail/177220.html">Configure client roaming</a>.</p>
     * 
     * @param request the request parameters of RoamClientUser  RoamClientUserRequest
     * @return RoamClientUserResponse
     */
    CompletableFuture<RoamClientUserResponse> roamClientUser(RoamClientUserRequest request);

    /**
     * @param request the request parameters of SetAdvancedMonitorState  SetAdvancedMonitorStateRequest
     * @return SetAdvancedMonitorStateResponse
     */
    CompletableFuture<SetAdvancedMonitorStateResponse> setAdvancedMonitorState(SetAdvancedMonitorStateRequest request);

    /**
     * <b>description</b> :
     * <p><em>SynchronizeSmartAGWebConfig</em>* is an asynchronous operation. After you send a request, the request ID is returned but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/164279.html">DescribeSAGDeviceInfo</a> operation to query the status of an SAG device.</p>
     * <ul>
     * <li>If an SAG device is in the <strong>Synchronizing</strong> state, the settings of the SAG device are being synchronized to the associated SAG instance.</li>
     * <li>If an SAG device is in the <strong>Synchronized</strong> state, the settings of the SAG device are synchronized to the associated SAG instance.</li>
     * </ul>
     * 
     * @param request the request parameters of SynchronizeSmartAGWebConfig  SynchronizeSmartAGWebConfigRequest
     * @return SynchronizeSmartAGWebConfigResponse
     */
    CompletableFuture<SynchronizeSmartAGWebConfigResponse> synchronizeSmartAGWebConfig(SynchronizeSmartAGWebConfigRequest request);

    /**
     * @param request the request parameters of UnbindSerialNumber  UnbindSerialNumberRequest
     * @return UnbindSerialNumberResponse
     */
    CompletableFuture<UnbindSerialNumberResponse> unbindSerialNumber(UnbindSerialNumberRequest request);

    /**
     * @param request the request parameters of UnbindSmartAccessGateway  UnbindSmartAccessGatewayRequest
     * @return UnbindSmartAccessGatewayResponse
     */
    CompletableFuture<UnbindSmartAccessGatewayResponse> unbindSmartAccessGateway(UnbindSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of UnbindVbr  UnbindVbrRequest
     * @return UnbindVbrResponse
     */
    CompletableFuture<UnbindVbrResponse> unbindVbr(UnbindVbrRequest request);

    /**
     * @param request the request parameters of UnlockSmartAccessGateway  UnlockSmartAccessGatewayRequest
     * @return UnlockSmartAccessGatewayResponse
     */
    CompletableFuture<UnlockSmartAccessGatewayResponse> unlockSmartAccessGateway(UnlockSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of UpdateEnterpriseCode  UpdateEnterpriseCodeRequest
     * @return UpdateEnterpriseCodeResponse
     */
    CompletableFuture<UpdateEnterpriseCodeResponse> updateEnterpriseCode(UpdateEnterpriseCodeRequest request);

    /**
     * @param request the request parameters of UpdateProbeTask  UpdateProbeTaskRequest
     * @return UpdateProbeTaskResponse
     */
    CompletableFuture<UpdateProbeTaskResponse> updateProbeTask(UpdateProbeTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/183876.html">ListAccessPoints</a> operation to view the switchable access points of the SAG instance.</p>
     * 
     * @param request the request parameters of UpdateSmartAGAccessPoint  UpdateSmartAGAccessPointRequest
     * @return UpdateSmartAGAccessPointResponse
     */
    CompletableFuture<UpdateSmartAGAccessPointResponse> updateSmartAGAccessPoint(UpdateSmartAGAccessPointRequest request);

    /**
     * @param request the request parameters of UpdateSmartAGDpiAttribute  UpdateSmartAGDpiAttributeRequest
     * @return UpdateSmartAGDpiAttributeResponse
     */
    CompletableFuture<UpdateSmartAGDpiAttributeResponse> updateSmartAGDpiAttribute(UpdateSmartAGDpiAttributeRequest request);

    /**
     * @param request the request parameters of UpdateSmartAGEnterpriseCode  UpdateSmartAGEnterpriseCodeRequest
     * @return UpdateSmartAGEnterpriseCodeResponse
     */
    CompletableFuture<UpdateSmartAGEnterpriseCodeResponse> updateSmartAGEnterpriseCode(UpdateSmartAGEnterpriseCodeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you set a maximum bandwidth value for a client, take note of the following rules:</p>
     * <ul>
     * <li>The maximum bandwidth value of a client cannot exceed that of the SAG app instance to which the client belongs.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is less than 5 Mbit/s, for example, 4 Mbit/s, the maximum bandwidth value of each client that belongs to the SAG app instance is 4 Mbit/s by default.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is 5 Mbit/s or higher, the maximum bandwidth value of each client that belongs to the SAG app instance is 5 Mbit/s by default.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSmartAGUserAccelerateConfig  UpdateSmartAGUserAccelerateConfigRequest
     * @return UpdateSmartAGUserAccelerateConfigResponse
     */
    CompletableFuture<UpdateSmartAGUserAccelerateConfigResponse> updateSmartAGUserAccelerateConfig(UpdateSmartAGUserAccelerateConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later support modifying the administrator password of the Smart Access Gateway device.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayAdminPassword  UpdateSmartAccessGatewayAdminPasswordRequest
     * @return UpdateSmartAccessGatewayAdminPasswordResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayAdminPasswordResponse> updateSmartAccessGatewayAdminPassword(UpdateSmartAccessGatewayAdminPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayBgpRoute  UpdateSmartAccessGatewayBgpRouteRequest
     * @return UpdateSmartAccessGatewayBgpRouteResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayBgpRouteResponse> updateSmartAccessGatewayBgpRoute(UpdateSmartAccessGatewayBgpRouteRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayDns  UpdateSmartAccessGatewayDnsRequest
     * @return UpdateSmartAccessGatewayDnsResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayDnsResponse> updateSmartAccessGatewayDns(UpdateSmartAccessGatewayDnsRequest request);

    /**
     * @param request the request parameters of UpdateSmartAccessGatewayDnsForward  UpdateSmartAccessGatewayDnsForwardRequest
     * @return UpdateSmartAccessGatewayDnsForwardResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayDnsForwardResponse> updateSmartAccessGatewayDnsForward(UpdateSmartAccessGatewayDnsForwardRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the global routing protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayGlobalRouteProtocol  UpdateSmartAccessGatewayGlobalRouteProtocolRequest
     * @return UpdateSmartAccessGatewayGlobalRouteProtocolResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayGlobalRouteProtocolResponse> updateSmartAccessGatewayGlobalRouteProtocol(UpdateSmartAccessGatewayGlobalRouteProtocolRequest request);

    /**
     * <b>description</b> :
     * <p>Only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later support modifying the OSPF dynamic routing protocol configurations of Smart Access Gateway devices.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayOspfRoute  UpdateSmartAccessGatewayOspfRouteRequest
     * @return UpdateSmartAccessGatewayOspfRouteResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayOspfRouteResponse> updateSmartAccessGatewayOspfRoute(UpdateSmartAccessGatewayOspfRouteRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the port protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayPortRouteProtocol  UpdateSmartAccessGatewayPortRouteProtocolRequest
     * @return UpdateSmartAccessGatewayPortRouteProtocolResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayPortRouteProtocolResponse> updateSmartAccessGatewayPortRouteProtocol(UpdateSmartAccessGatewayPortRouteProtocolRequest request);

    /**
     * @param request the request parameters of UpdateSmartAccessGatewayVersion  UpdateSmartAccessGatewayVersionRequest
     * @return UpdateSmartAccessGatewayVersionResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayVersionResponse> updateSmartAccessGatewayVersion(UpdateSmartAccessGatewayVersionRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the SNAT configuration of the WAN port only on SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayWanSnat  UpdateSmartAccessGatewayWanSnatRequest
     * @return UpdateSmartAccessGatewayWanSnatResponse
     */
    CompletableFuture<UpdateSmartAccessGatewayWanSnatResponse> updateSmartAccessGatewayWanSnat(UpdateSmartAccessGatewayWanSnatRequest request);

    /**
     * @param request the request parameters of UpgradeSmartAccessGateway  UpgradeSmartAccessGatewayRequest
     * @return UpgradeSmartAccessGatewayResponse
     */
    CompletableFuture<UpgradeSmartAccessGatewayResponse> upgradeSmartAccessGateway(UpgradeSmartAccessGatewayRequest request);

    /**
     * @param request the request parameters of UpgradeSmartAccessGatewaySoftware  UpgradeSmartAccessGatewaySoftwareRequest
     * @return UpgradeSmartAccessGatewaySoftwareResponse
     */
    CompletableFuture<UpgradeSmartAccessGatewaySoftwareResponse> upgradeSmartAccessGatewaySoftware(UpgradeSmartAccessGatewaySoftwareRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayBgpRoute  ViewSmartAccessGatewayBgpRouteRequest
     * @return ViewSmartAccessGatewayBgpRouteResponse
     */
    CompletableFuture<ViewSmartAccessGatewayBgpRouteResponse> viewSmartAccessGatewayBgpRoute(ViewSmartAccessGatewayBgpRouteRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later support querying the DNS information of Smart Access Gateway devices.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayDns  ViewSmartAccessGatewayDnsRequest
     * @return ViewSmartAccessGatewayDnsResponse
     */
    CompletableFuture<ViewSmartAccessGatewayDnsResponse> viewSmartAccessGatewayDns(ViewSmartAccessGatewayDnsRequest request);

    /**
     * @param request the request parameters of ViewSmartAccessGatewayDnsForwards  ViewSmartAccessGatewayDnsForwardsRequest
     * @return ViewSmartAccessGatewayDnsForwardsResponse
     */
    CompletableFuture<ViewSmartAccessGatewayDnsForwardsResponse> viewSmartAccessGatewayDnsForwards(ViewSmartAccessGatewayDnsForwardsRequest request);

    /**
     * <b>description</b> :
     * <p>Only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later support retrieving the global routing protocol of a Smart Access Gateway device.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayGlobalRouteProtocol  ViewSmartAccessGatewayGlobalRouteProtocolRequest
     * @return ViewSmartAccessGatewayGlobalRouteProtocolResponse
     */
    CompletableFuture<ViewSmartAccessGatewayGlobalRouteProtocolResponse> viewSmartAccessGatewayGlobalRouteProtocol(ViewSmartAccessGatewayGlobalRouteProtocolRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later and have OSPF enabled.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayOspfRoute  ViewSmartAccessGatewayOspfRouteRequest
     * @return ViewSmartAccessGatewayOspfRouteResponse
     */
    CompletableFuture<ViewSmartAccessGatewayOspfRouteResponse> viewSmartAccessGatewayOspfRoute(ViewSmartAccessGatewayOspfRouteRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the list of ports that have a routable protocol enabled only on SCG5000 and SCG5000-5G devices of version 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayPortRouteProtocol  ViewSmartAccessGatewayPortRouteProtocolRequest
     * @return ViewSmartAccessGatewayPortRouteProtocolResponse
     */
    CompletableFuture<ViewSmartAccessGatewayPortRouteProtocolResponse> viewSmartAccessGatewayPortRouteProtocol(ViewSmartAccessGatewayPortRouteProtocolRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the route details only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayRoutes  ViewSmartAccessGatewayRoutesRequest
     * @return ViewSmartAccessGatewayRoutesResponse
     */
    CompletableFuture<ViewSmartAccessGatewayRoutesResponse> viewSmartAccessGatewayRoutes(ViewSmartAccessGatewayRoutesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the SNAT configuration of the WAN port only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayWanSnat  ViewSmartAccessGatewayWanSnatRequest
     * @return ViewSmartAccessGatewayWanSnatResponse
     */
    CompletableFuture<ViewSmartAccessGatewayWanSnatResponse> viewSmartAccessGatewayWanSnat(ViewSmartAccessGatewayWanSnatRequest request);

}
