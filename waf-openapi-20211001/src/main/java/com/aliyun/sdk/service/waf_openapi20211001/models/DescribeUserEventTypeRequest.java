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
 * {@link DescribeUserEventTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserEventTypeRequest</p>
 */
public class DescribeUserEventTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventScope")
    private String eventScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatusList")
    private java.util.List<String> userStatusList;

    private DescribeUserEventTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.eventScope = builder.eventScope;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.startTime = builder.startTime;
        this.userStatusList = builder.userStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEventTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventScope
     */
    public String getEventScope() {
        return this.eventScope;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userStatusList
     */
    public java.util.List<String> getUserStatusList() {
        return this.userStatusList;
    }

    public static final class Builder extends Request.Builder<DescribeUserEventTypeRequest, Builder> {
        private String clusterId; 
        private Long endTime; 
        private String eventScope; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long startTime; 
        private java.util.List<String> userStatusList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserEventTypeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.eventScope = request.eventScope;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.startTime = request.startTime;
            this.userStatusList = request.userStatusList;
        } 

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>976</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp (UTC) in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1726113600</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-5y***h0t</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>rg-aek***ktt3y</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp (UTC) in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723435200</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The list of statuses for security event statistics.</p>
         * <blockquote>
         * <p>By default, security event data in the <strong>toBeConfirmed</strong>, <strong>confirmed</strong>, and <strong>actioned</strong> statuses is included in the statistics.</p>
         * </blockquote>
         */
        public Builder userStatusList(java.util.List<String> userStatusList) {
            this.putQueryParameter("UserStatusList", userStatusList);
            this.userStatusList = userStatusList;
            return this;
        }

        @Override
        public DescribeUserEventTypeRequest build() {
            return new DescribeUserEventTypeRequest(this);
        } 

    } 

}
