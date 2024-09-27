// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstancesRequest</p>
 */
public class DescribeDBInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceCategories")
    private java.util.List < String > DBInstanceCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
    private String DBInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceModes")
    private java.util.List < String > DBInstanceModes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStatuses")
    private java.util.List < String > DBInstanceStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDeployTypes")
    private java.util.List < String > instanceDeployTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeDBInstancesRequest(Builder builder) {
        super(builder);
        this.DBInstanceCategories = builder.DBInstanceCategories;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceIds = builder.DBInstanceIds;
        this.DBInstanceModes = builder.DBInstanceModes;
        this.DBInstanceStatuses = builder.DBInstanceStatuses;
        this.instanceDeployTypes = builder.instanceDeployTypes;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceCategories
     */
    public java.util.List < String > getDBInstanceCategories() {
        return this.DBInstanceCategories;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceIds
     */
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    /**
     * @return DBInstanceModes
     */
    public java.util.List < String > getDBInstanceModes() {
        return this.DBInstanceModes;
    }

    /**
     * @return DBInstanceStatuses
     */
    public java.util.List < String > getDBInstanceStatuses() {
        return this.DBInstanceStatuses;
    }

    /**
     * @return instanceDeployTypes
     */
    public java.util.List < String > getInstanceDeployTypes() {
        return this.instanceDeployTypes;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstancesRequest, Builder> {
        private java.util.List < String > DBInstanceCategories; 
        private String DBInstanceDescription; 
        private String DBInstanceIds; 
        private java.util.List < String > DBInstanceModes; 
        private java.util.List < String > DBInstanceStatuses; 
        private java.util.List < String > instanceDeployTypes; 
        private String instanceNetworkType; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstancesRequest request) {
            super(request);
            this.DBInstanceCategories = request.DBInstanceCategories;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceIds = request.DBInstanceIds;
            this.DBInstanceModes = request.DBInstanceModes;
            this.DBInstanceStatuses = request.DBInstanceStatuses;
            this.instanceDeployTypes = request.instanceDeployTypes;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The edition of the instance. Separate multiple values with commas (,).</p>
         */
        public Builder DBInstanceCategories(java.util.List < String > DBInstanceCategories) {
            String DBInstanceCategoriesShrink = shrink(DBInstanceCategories, "DBInstanceCategories", "simple");
            this.putQueryParameter("DBInstanceCategories", DBInstanceCategoriesShrink);
            this.DBInstanceCategories = DBInstanceCategories;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The instance ID. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }

        /**
         * <p>The resource type of the instance. Separate multiple values with commas (,).</p>
         */
        public Builder DBInstanceModes(java.util.List < String > DBInstanceModes) {
            String DBInstanceModesShrink = shrink(DBInstanceModes, "DBInstanceModes", "simple");
            this.putQueryParameter("DBInstanceModes", DBInstanceModesShrink);
            this.DBInstanceModes = DBInstanceModes;
            return this;
        }

        /**
         * <p>The state of the instance.</p>
         */
        public Builder DBInstanceStatuses(java.util.List < String > DBInstanceStatuses) {
            String DBInstanceStatusesShrink = shrink(DBInstanceStatuses, "DBInstanceStatuses", "simple");
            this.putQueryParameter("DBInstanceStatuses", DBInstanceStatusesShrink);
            this.DBInstanceStatuses = DBInstanceStatuses;
            return this;
        }

        /**
         * <p>This parameter is no longer used.</p>
         */
        public Builder instanceDeployTypes(java.util.List < String > instanceDeployTypes) {
            String instanceDeployTypesShrink = shrink(instanceDeployTypes, "InstanceDeployTypes", "simple");
            this.putQueryParameter("InstanceDeployTypes", instanceDeployTypesShrink);
            this.instanceDeployTypes = instanceDeployTypes;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
         * <li><strong>Classic</strong>: classic network.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, instances of all network types are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~86912~~">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The VPC ID. You can use this parameter to filter instances that reside in the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nqyp3tc5mx7vy6****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeDBInstancesRequest build() {
            return new DescribeDBInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
