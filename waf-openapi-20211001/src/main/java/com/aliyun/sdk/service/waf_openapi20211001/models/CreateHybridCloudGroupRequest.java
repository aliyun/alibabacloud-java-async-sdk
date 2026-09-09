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
 * {@link CreateHybridCloudGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridCloudGroupRequest</p>
 */
public class CreateHybridCloudGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackSourceMark")
    private String backSourceMark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalanceIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalanceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationCode")
    private String locationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private CreateHybridCloudGroupRequest(Builder builder) {
        super(builder);
        this.backSourceMark = builder.backSourceMark;
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.instanceId = builder.instanceId;
        this.loadBalanceIp = builder.loadBalanceIp;
        this.locationCode = builder.locationCode;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridCloudGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backSourceMark
     */
    public String getBackSourceMark() {
        return this.backSourceMark;
    }

    /**
     * @return clusterId
     */
    public Long getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loadBalanceIp
     */
    public String getLoadBalanceIp() {
        return this.loadBalanceIp;
    }

    /**
     * @return locationCode
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateHybridCloudGroupRequest, Builder> {
        private String backSourceMark; 
        private Long clusterId; 
        private String groupName; 
        private String groupType; 
        private String instanceId; 
        private String loadBalanceIp; 
        private String locationCode; 
        private String regionId; 
        private String remark; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridCloudGroupRequest request) {
            super(request);
            this.backSourceMark = request.backSourceMark;
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.instanceId = request.instanceId;
            this.loadBalanceIp = request.loadBalanceIp;
            this.locationCode = request.locationCode;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The back-to-origin mark of the node group. The value is in the format of Carrier-Continent-City, which is used to identify the origin of back-to-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-asiapacific-beijing</p>
         */
        public Builder backSourceMark(String backSourceMark) {
            this.putQueryParameter("BackSourceMark", backSourceMark);
            this.backSourceMark = backSourceMark;
            return this;
        }

        /**
         * <p>The ID of the Hybrid Cloud WAF cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterId(Long clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The type of the node group. Valid values:</p>
         * <ul>
         * <li><p><strong>protect</strong>: a protection node group that processes traffic filtering.</p>
         * </li>
         * <li><p><strong>control</strong>: a control node group that manages cluster configurations.</p>
         * </li>
         * <li><p><strong>storage</strong>: a storage node group that stores logs and data.</p>
         * </li>
         * <li><p><strong>controlStorage</strong>: a node group that serves as both control and storage.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>protect</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
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
         * <p>waf-cn-n6w***x52m</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the load balancer that is associated with the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3.3.3</p>
         */
        public Builder loadBalanceIp(String loadBalanceIp) {
            this.putQueryParameter("LoadBalanceIp", loadBalanceIp);
            this.loadBalanceIp = loadBalanceIp;
            return this;
        }

        /**
         * <p>The location code of the region where the node group resides. The value is in the format of Carrier-Continent-City.</p>
         * 
         * <strong>example:</strong>
         * <p>0-410-0</p>
         */
        public Builder locationCode(String locationCode) {
            this.putQueryParameter("LocationCode", locationCode);
            this.locationCode = locationCode;
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
         * <p>The remarks on the node group. You can use this parameter to add a brief description for the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public CreateHybridCloudGroupRequest build() {
            return new CreateHybridCloudGroupRequest(this);
        } 

    } 

}
