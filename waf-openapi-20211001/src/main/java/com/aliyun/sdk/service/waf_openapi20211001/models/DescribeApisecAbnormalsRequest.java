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
 * {@link DescribeApisecAbnormalsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisecAbnormalsRequest</p>
 */
public class DescribeApisecAbnormalsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalId")
    private String abnormalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalLevel")
    private String abnormalLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbnormalTag")
    private String abnormalTag;

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
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private DescribeApisecAbnormalsRequest(Builder builder) {
        super(builder);
        this.abnormalId = builder.abnormalId;
        this.abnormalLevel = builder.abnormalLevel;
        this.abnormalTag = builder.abnormalTag;
        this.apiFormat = builder.apiFormat;
        this.apiId = builder.apiId;
        this.apiTag = builder.apiTag;
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.matchedHost = builder.matchedHost;
        this.orderKey = builder.orderKey;
        this.orderWay = builder.orderWay;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.startTime = builder.startTime;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecAbnormalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalId
     */
    public String getAbnormalId() {
        return this.abnormalId;
    }

    /**
     * @return abnormalLevel
     */
    public String getAbnormalLevel() {
        return this.abnormalLevel;
    }

    /**
     * @return abnormalTag
     */
    public String getAbnormalTag() {
        return this.abnormalTag;
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<DescribeApisecAbnormalsRequest, Builder> {
        private String abnormalId; 
        private String abnormalLevel; 
        private String abnormalTag; 
        private String apiFormat; 
        private String apiId; 
        private String apiTag; 
        private String clusterId; 
        private String endTime; 
        private String instanceId; 
        private String matchedHost; 
        private String orderKey; 
        private String orderWay; 
        private String origin; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String startTime; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisecAbnormalsRequest request) {
            super(request);
            this.abnormalId = request.abnormalId;
            this.abnormalLevel = request.abnormalLevel;
            this.abnormalTag = request.abnormalTag;
            this.apiFormat = request.apiFormat;
            this.apiId = request.apiId;
            this.apiTag = request.apiTag;
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.matchedHost = request.matchedHost;
            this.orderKey = request.orderKey;
            this.orderWay = request.orderWay;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.startTime = request.startTime;
            this.userStatus = request.userStatus;
        } 

        /**
         * <p>The ID of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>29c6401****99a2bad3943e26d8</p>
         */
        public Builder abnormalId(String abnormalId) {
            this.putQueryParameter("AbnormalId", abnormalId);
            this.abnormalId = abnormalId;
            return this;
        }

        /**
         * <p>The level of the risk. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder abnormalLevel(String abnormalLevel) {
            this.putQueryParameter("AbnormalLevel", abnormalLevel);
            this.abnormalLevel = abnormalLevel;
            return this;
        }

        /**
         * <p>The type of the risk.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of risks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LackOfSpeedLimit</p>
         */
        public Builder abnormalTag(String abnormalTag) {
            this.putQueryParameter("AbnormalTag", abnormalTag);
            this.abnormalTag = abnormalTag;
            return this;
        }

        /**
         * <p>The risk-related API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/users/login</p>
         */
        public Builder apiFormat(String apiFormat) {
            this.putQueryParameter("ApiFormat", apiFormat);
            this.apiFormat = apiFormat;
            return this;
        }

        /**
         * <p>The ID of the risk-related API.</p>
         * 
         * <strong>example:</strong>
         * <p>bd9efb8ad******d9ca6</p>
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
         * <p>RegisterAPI</p>
         */
        public Builder apiTag(String apiTag) {
            this.putQueryParameter("ApiTag", apiTag);
            this.apiTag = apiTag;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>For hybrid cloud scenarios only, you can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>546</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684382100</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * <p>waf_v2_public_cn-z***9g301</p>
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
         * <li><strong>firstTime (default)</strong>: first detection time</li>
         * <li><strong>abnormalLevel</strong>: risk level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allCnt</p>
         */
        public Builder orderKey(String orderKey) {
            this.putQueryParameter("OrderKey", orderKey);
            this.orderKey = orderKey;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li><strong>desc (default)</strong>: in descending order</li>
         * <li><strong>asc</strong>: in ascending order</li>
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
         * <p>The source of the risk type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong></li>
         * <li><strong>default</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
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
         * <p>2</p>
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
         * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: Chinese mainland</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The beginning of the time range to query. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the risk. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>toBeFixed</strong></li>
         * <li><strong>fixed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public DescribeApisecAbnormalsRequest build() {
            return new DescribeApisecAbnormalsRequest(this);
        } 

    } 

}
