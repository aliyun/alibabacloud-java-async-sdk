// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisecEventsRequest</p>
 */
public class DescribeApisecEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiFormat")
    private String apiFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiTag")
    private String apiTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackIp")
    private String attackIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventLevel")
    private String eventLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTag")
    private String eventTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchedHost")
    private String matchedHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKey")
    private String orderKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderWay")
    private String orderWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    private Long startTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private DescribeApisecEventsRequest(Builder builder) {
        super(builder);
        this.apiFormat = builder.apiFormat;
        this.apiId = builder.apiId;
        this.apiTag = builder.apiTag;
        this.attackIp = builder.attackIp;
        this.clusterId = builder.clusterId;
        this.endTs = builder.endTs;
        this.eventId = builder.eventId;
        this.eventLevel = builder.eventLevel;
        this.eventTag = builder.eventTag;
        this.instanceId = builder.instanceId;
        this.matchedHost = builder.matchedHost;
        this.orderKey = builder.orderKey;
        this.orderWay = builder.orderWay;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.startTs = builder.startTs;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiFormat
     */
    public String getApiFormat() {
        return this.apiFormat;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiTag
     */
    public String getApiTag() {
        return this.apiTag;
    }

    /**
     * @return attackIp
     */
    public String getAttackIp() {
        return this.attackIp;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventLevel
     */
    public String getEventLevel() {
        return this.eventLevel;
    }

    /**
     * @return eventTag
     */
    public String getEventTag() {
        return this.eventTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return matchedHost
     */
    public String getMatchedHost() {
        return this.matchedHost;
    }

    /**
     * @return orderKey
     */
    public String getOrderKey() {
        return this.orderKey;
    }

    /**
     * @return orderWay
     */
    public String getOrderWay() {
        return this.orderWay;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<DescribeApisecEventsRequest, Builder> {
        private String apiFormat; 
        private String apiId; 
        private String apiTag; 
        private String attackIp; 
        private String clusterId; 
        private Long endTs; 
        private String eventId; 
        private String eventLevel; 
        private String eventTag; 
        private String instanceId; 
        private String matchedHost; 
        private String orderKey; 
        private String orderWay; 
        private String origin; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long startTs; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisecEventsRequest request) {
            super(request);
            this.apiFormat = request.apiFormat;
            this.apiId = request.apiId;
            this.apiTag = request.apiTag;
            this.attackIp = request.attackIp;
            this.clusterId = request.clusterId;
            this.endTs = request.endTs;
            this.eventId = request.eventId;
            this.eventLevel = request.eventLevel;
            this.eventTag = request.eventTag;
            this.instanceId = request.instanceId;
            this.matchedHost = request.matchedHost;
            this.orderKey = request.orderKey;
            this.orderWay = request.orderWay;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.startTs = request.startTs;
            this.userStatus = request.userStatus;
        } 

        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/register.php</p>
         */
        public Builder apiFormat(String apiFormat) {
            this.putQueryParameter("ApiFormat", apiFormat);
            this.apiFormat = apiFormat;
            return this;
        }

        /**
         * <p>The ID of the event-related API.</p>
         * 
         * <strong>example:</strong>
         * <p>820b860***6205da93b935b28</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The business purpose of the API.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purposes of APIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        public Builder apiTag(String apiTag) {
            this.putQueryParameter("ApiTag", apiTag);
            this.apiTag = apiTag;
            return this;
        }

        /**
         * <p>The Attack source IP.</p>
         * 
         * <strong>example:</strong>
         * <p>42.224.<em>.</em></p>
         */
        public Builder attackIp(String attackIp) {
            this.putQueryParameter("AttackIp", attackIp);
            this.attackIp = attackIp;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p> This parameter is available only in hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683703260</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>The ID of the API security event.</p>
         * 
         * <strong>example:</strong>
         * <p>18ba94fea9***e66ba0557b7b91</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder eventLevel(String eventLevel) {
            this.putQueryParameter("EventLevel", eventLevel);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * <p>The type of the event.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported event types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ObtainSensitiveUnauthorized</p>
         */
        public Builder eventTag(String eventTag) {
            this.putQueryParameter("EventTag", eventTag);
            this.eventTag = eventTag;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-5y***d31</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The domain name or IP address of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        public Builder matchedHost(String matchedHost) {
            this.putQueryParameter("MatchedHost", matchedHost);
            this.matchedHost = matchedHost;
            return this;
        }

        /**
         * <p>The name of the sorting field. Valid values:</p>
         * <ul>
         * <li><strong>allCnt</strong>: the number of attacks</li>
         * <li><strong>startTs</strong>: the start time of the event</li>
         * <li><strong>endTs</strong>: the end time of the event</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>startTs</p>
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong> (default): descending order</li>
         * <li><strong>asc</strong>: ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderWay(String orderWay) {
            this.putQueryParameter("OrderWay", orderWay);
            this.orderWay = orderWay;
            return this;
        }

        /**
         * <p>The source of the event type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong></li>
         * <li><strong>default</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance. Value:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683648000</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public DescribeApisecEventsRequest build() {
            return new DescribeApisecEventsRequest(this);
        } 

    } 

}
