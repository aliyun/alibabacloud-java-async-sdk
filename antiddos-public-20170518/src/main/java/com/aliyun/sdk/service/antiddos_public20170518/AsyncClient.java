// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.antiddos_public20170518.models.*;
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
     * <p>You can call the DescribeBgpPackByIp operation to query the configurations of the Anti-DDoS Origin instance that is associated with an asset. The configurations include the basic protection threshold, burstable protection threshold, and expiration time.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeBgpPackByIp  DescribeBgpPackByIpRequest
     * @return DescribeBgpPackByIpResponse
     */
    CompletableFuture<DescribeBgpPackByIpResponse> describeBgpPackByIp(DescribeBgpPackByIpRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCap operation to query the download link to the traffic data that is captured when a DDoS attack event occurs. You can download the traffic data from the download link and use the data as evidence.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCap  DescribeCapRequest
     * @return DescribeCapResponse
     */
    CompletableFuture<DescribeCapResponse> describeCap(DescribeCapRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosCount  DescribeDdosCountRequest
     * @return DescribeDdosCountResponse
     */
    CompletableFuture<DescribeDdosCountResponse> describeDdosCount(DescribeDdosCountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosCredit operation to query the details of the security credit score of the current Alibaba Cloud account in a specific region. The details include the security credit score, security credit level, and the time period after which blackhole filtering is automatically deactivated.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosCredit  DescribeDdosCreditRequest
     * @return DescribeDdosCreditResponse
     */
    CompletableFuture<DescribeDdosCreditResponse> describeDdosCredit(DescribeDdosCreditRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEventList operation to query the details of the DDoS attack events that occur on an asset by page. The details include the start time, end time, and status of each DDoS attack event.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosEventList  DescribeDdosEventListRequest
     * @return DescribeDdosEventListResponse
     */
    CompletableFuture<DescribeDdosEventListResponse> describeDdosEventList(DescribeDdosEventListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosThreshold operation to query the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The details include the current traffic scrubbing threshold, maximum traffic scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosThreshold  DescribeDdosThresholdRequest
     * @return DescribeDdosThresholdResponse
     */
    CompletableFuture<DescribeDdosThresholdResponse> describeDdosThreshold(DescribeDdosThresholdRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstance operation to query the details of the assets that are within the current Alibaba Cloud account by page. The details include the IDs and IP addresses of the assets, the basic protection thresholds and traffic scrubbing thresholds that are configured for the assets in Anti-DDoS Origin, and whether the assets are associated with Anti-DDoS Origin instances.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeInstanceIpAddress operation to query the DDoS mitigation information and the details of the Anti-DDoS Origin instance. The information and the details include the basic protection threshold and traffic scrubbing threshold for the assets, DDoS mitigation status of the assets, ID of the instance, and the mitigation status of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceIpAddress  DescribeInstanceIpAddressRequest
     * @return DescribeInstanceIpAddressResponse
     */
    CompletableFuture<DescribeInstanceIpAddressResponse> describeInstanceIpAddress(DescribeInstanceIpAddressRequest request);

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeIpDdosThreshold operation to query the details of the DDoS mitigation threshold or traffic scrubbing threshold for a specific asset. The details include the current traffic scrubbing threshold, maximum scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeIpDdosThreshold  DescribeIpDdosThresholdRequest
     * @return DescribeIpDdosThresholdResponse
     */
    CompletableFuture<DescribeIpDdosThresholdResponse> describeIpDdosThreshold(DescribeIpDdosThresholdRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeIpLocationService operation to query the region of the public IP address for a specified asset that is within the current Alibaba Cloud account. You can also query the details of the Anti-DDoS Origin instance to which the asset is added. The details include the ID and name.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeIpLocationService  DescribeIpLocationServiceRequest
     * @return DescribeIpLocationServiceResponse
     */
    CompletableFuture<DescribeIpLocationServiceResponse> describeIpLocationService(DescribeIpLocationServiceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about the regions in which Anti-DDoS Origin Basic is available. The information includes the region ID, region name, and code.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDefenseThreshold  ModifyDefenseThresholdRequest
     * @return ModifyDefenseThresholdResponse
     */
    CompletableFuture<ModifyDefenseThresholdResponse> modifyDefenseThreshold(ModifyDefenseThresholdRequest request);

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyIpDefenseThreshold  ModifyIpDefenseThresholdRequest
     * @return ModifyIpDefenseThresholdResponse
     */
    CompletableFuture<ModifyIpDefenseThresholdResponse> modifyIpDefenseThreshold(ModifyIpDefenseThresholdRequest request);

}
