// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @Query
    @NameInMap("Edition")
    private Integer edition;

    @Query
    @NameInMap("Enabled")
    private Integer enabled;

    @Query
    @NameInMap("ExpireEndTime")
    private Long expireEndTime;

    @Query
    @NameInMap("ExpireStartTime")
    private Long expireStartTime;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private java.util.List < Integer > status;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.edition = builder.edition;
        this.enabled = builder.enabled;
        this.expireEndTime = builder.expireEndTime;
        this.expireStartTime = builder.expireStartTime;
        this.instanceIds = builder.instanceIds;
        this.ip = builder.ip;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edition
     */
    public Integer getEdition() {
        return this.edition;
    }

    /**
     * @return enabled
     */
    public Integer getEnabled() {
        return this.enabled;
    }

    /**
     * @return expireEndTime
     */
    public Long getExpireEndTime() {
        return this.expireEndTime;
    }

    /**
     * @return expireStartTime
     */
    public Long getExpireStartTime() {
        return this.expireStartTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public java.util.List < Integer > getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private Integer edition; 
        private Integer enabled; 
        private Long expireEndTime; 
        private Long expireStartTime; 
        private java.util.List < String > instanceIds; 
        private String ip; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String remark; 
        private String resourceGroupId; 
        private java.util.List < Integer > status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest response) {
            super(response);
            this.edition = response.edition;
            this.enabled = response.enabled;
            this.expireEndTime = response.expireEndTime;
            this.expireStartTime = response.expireStartTime;
            this.instanceIds = response.instanceIds;
            this.ip = response.ip;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.remark = response.remark;
            this.resourceGroupId = response.resourceGroupId;
            this.status = response.status;
            this.tag = response.tag;
        } 

        /**
         * Edition.
         */
        public Builder edition(Integer edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Integer enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * ExpireEndTime.
         */
        public Builder expireEndTime(Long expireEndTime) {
            this.putQueryParameter("ExpireEndTime", expireEndTime);
            this.expireEndTime = expireEndTime;
            return this;
        }

        /**
         * ExpireStartTime.
         */
        public Builder expireStartTime(Long expireStartTime) {
            this.putQueryParameter("ExpireStartTime", expireStartTime);
            this.expireStartTime = expireStartTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List < Integer > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
