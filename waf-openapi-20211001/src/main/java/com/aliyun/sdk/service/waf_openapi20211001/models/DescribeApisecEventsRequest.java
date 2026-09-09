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
    @com.aliyun.core.annotation.NameInMap("Account")
    private String account;

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
    @com.aliyun.core.annotation.NameInMap("EventScope")
    private String eventScope;

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
        this.account = builder.account;
        this.apiFormat = builder.apiFormat;
        this.apiId = builder.apiId;
        this.apiTag = builder.apiTag;
        this.attackIp = builder.attackIp;
        this.clusterId = builder.clusterId;
        this.endTs = builder.endTs;
        this.eventId = builder.eventId;
        this.eventLevel = builder.eventLevel;
        this.eventScope = builder.eventScope;
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
     * @return account
     */
    public String getAccount() {
        return this.account;
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
     * @return eventScope
     */
    public String getEventScope() {
        return this.eventScope;
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
        private String account; 
        private String apiFormat; 
        private String apiId; 
        private String apiTag; 
        private String attackIp; 
        private String clusterId; 
        private Long endTs; 
        private String eventId; 
        private String eventLevel; 
        private String eventScope; 
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
            this.account = request.account;
            this.apiFormat = request.apiFormat;
            this.apiId = request.apiId;
            this.apiTag = request.apiTag;
            this.attackIp = request.attackIp;
            this.clusterId = request.clusterId;
            this.endTs = request.endTs;
            this.eventId = request.eventId;
            this.eventLevel = request.eventLevel;
            this.eventScope = request.eventScope;
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
         * <p>The account information.</p>
         * 
         * <strong>example:</strong>
         * <p>1818743389962696</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>The API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/***.php</p>
         */
        public Builder apiFormat(String apiFormat) {
            this.putQueryParameter("ApiFormat", apiFormat);
            this.apiFormat = apiFormat;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
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
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported business purposes.</p>
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
         * <p>The attack IP address.</p>
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
         * <p>The hybrid cloud cluster ID.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
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
         * <p>The end time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
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
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High-risk.</li>
         * <li><strong>medium</strong>: Medium-risk.</li>
         * <li><strong>low</strong>: Low-risk.</li>
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
         * <p>The dimension of the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder eventScope(String eventScope) {
            this.putQueryParameter("EventScope", eventScope);
            this.eventScope = eventScope;
            return this;
        }

        /**
         * <p>The event type.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported event types.</p>
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
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
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
         * <p>The domain name or IP address to which the API operation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a.***.com</p>
         */
        public Builder matchedHost(String matchedHost) {
            this.putQueryParameter("MatchedHost", matchedHost);
            this.matchedHost = matchedHost;
            return this;
        }

        /**
         * <p>The name of the field used for sorting. Valid values:</p>
         * <ul>
         * <li><strong>allCnt</strong>: attack count.</li>
         * <li><strong>startTs</strong>: event start time.</li>
         * <li><strong>endTs</strong>: event end time.</li>
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
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong>: Descending order (default).</li>
         * <li><strong>asc</strong>: Ascending order.</li>
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
         * <li><strong>custom</strong>: Custom.</li>
         * <li><strong>default</strong>: Built-in.</li>
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
         * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page.</p>
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
         * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
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
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
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
         * <p>The Alibaba Cloud resource group ID.</p>
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
         * <p>The start time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
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
         * <li><strong>toBeConfirmed</strong>: To be confirmed.</li>
         * <li><strong>confirmed</strong>: Confirmed.</li>
         * <li><strong>actioned</strong>: Handled.</li>
         * <li><strong>ignored</strong>: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignored</p>
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
