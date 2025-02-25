// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link CreateDedicatedBlockStorageClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedBlockStorageClusterRequest</p>
 */
public class CreateDedicatedBlockStorageClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Azone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String azone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capacity")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2334720, minimum = 61440)
    private Long capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbscId")
    @Deprecated
    private String dbscId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbscName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbscName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateDedicatedBlockStorageClusterRequest(Builder builder) {
        super(builder);
        this.azone = builder.azone;
        this.capacity = builder.capacity;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azone
     */
    public String getAzone() {
        return this.azone;
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return dbscName
     */
    public String getDbscName() {
        return this.dbscName;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedBlockStorageClusterRequest, Builder> {
        private String azone; 
        private Long capacity; 
        private String dbscId; 
        private String dbscName; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedBlockStorageClusterRequest request) {
            super(request);
            this.azone = request.azone;
            this.capacity = request.capacity;
            this.dbscId = request.dbscId;
            this.dbscName = request.dbscName;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the zone in which to create the dedicated block storage cluster. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan-b</p>
         */
        public Builder azone(String azone) {
            this.putQueryParameter("Azone", azone);
            this.azone = azone;
            return this;
        }

        /**
         * <p>The capacity of the dedicated block storage cluster. Valid values: 61440 to 2334720. Unit: GiB. 2,334,720 GiB is equal to 2,280 TiB. The capacity increases in a minimum increment of 12,288 GiB.</p>
         * <blockquote>
         * <p> If the capacity of a dedicated block storage cluster is less than 576 TiB, the maximum throughput per TiB cannot exceed 52 MB/s. If the capacity of a dedicated block storage cluster is greater than 576 TiB, the maximum throughput per TiB cannot exceed 26 MB/s.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>test1233</p>
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * <p>The name of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myDBSCCluster</p>
         */
        public Builder dbscName(String dbscName) {
            this.putQueryParameter("DbscName", dbscName);
            this.dbscName = dbscName;
            return this;
        }

        /**
         * <p>The subscription duration of the dedicated block storage cluster. Valid values: 6, 7, 8, 9, 10, 11, 12, 24, and 36.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration specified by <code>Period</code>. Set the value to Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the dedicated block storage cluster. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which to assign the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvs*******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags to add to the dedicated block storage cluster. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The type of the dedicated block storage cluster. Valid values:</p>
         * <ul>
         * <li>Standard: basic dedicated block storage cluster. Enterprise SSDs (ESSDs) at performance level 0 (PL0 ESSDs) can be created in basic dedicated block storage clusters.</li>
         * <li>Premium: performance dedicated block storage cluster. ESSDs at performance level 1 (PL1 ESSDs) can be created in performance dedicated block storage clusters.</li>
         * </ul>
         * <p>Default value: Premium.</p>
         * <p>For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Premium</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDedicatedBlockStorageClusterRequest build() {
            return new CreateDedicatedBlockStorageClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDedicatedBlockStorageClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateDedicatedBlockStorageClusterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The key of tag N to add to the dedicated block storage cluster.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the dedicated block storage cluster.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
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
