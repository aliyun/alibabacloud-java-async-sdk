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
 * {@link DescribeUserAbnormalTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserAbnormalTypeRequest</p>
 */
public class DescribeUserAbnormalTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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

    private DescribeUserAbnormalTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.startTime = builder.startTime;
        this.userStatusList = builder.userStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAbnormalTypeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUserAbnormalTypeRequest, Builder> {
        private String clusterId; 
        private Long endTime; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long startTime; 
        private java.util.List<String> userStatusList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserAbnormalTypeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.startTime = request.startTime;
            this.userStatusList = request.userStatusList;
        } 

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query the IDs of hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>993</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time as a UNIX timestamp in seconds. The time is in UTC.</p>
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
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-g4***201</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ac***lani</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time as a UNIX timestamp in seconds. The time is in UTC.</p>
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
         * <p>The list of risk states for which to collect statistics.</p>
         * <blockquote>
         * <p>By default, statistics are collected for risks in the <strong>toBeConfirmed</strong>, <strong>toBeFixed</strong>, <strong>toBeVerified</strong>, and <strong>notFixed</strong> states.</p>
         * </blockquote>
         */
        public Builder userStatusList(java.util.List<String> userStatusList) {
            this.putQueryParameter("UserStatusList", userStatusList);
            this.userStatusList = userStatusList;
            return this;
        }

        @Override
        public DescribeUserAbnormalTypeRequest build() {
            return new DescribeUserAbnormalTypeRequest(this);
        } 

    } 

}
