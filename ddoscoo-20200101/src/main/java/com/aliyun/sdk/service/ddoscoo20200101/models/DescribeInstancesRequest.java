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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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
        this.regionId = builder.regionId;
        this.edition = builder.edition;
        this.enabled = builder.enabled;
        this.expireEndTime = builder.expireEndTime;
        this.expireStartTime = builder.expireStartTime;
        this.instanceIds = builder.instanceIds;
        this.ip = builder.ip;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Integer edition; 
        private Integer enabled; 
        private Long expireEndTime; 
        private Long expireStartTime; 
        private java.util.List < String > instanceIds; 
        private String ip; 
        private String pageNumber; 
        private String pageSize; 
        private String remark; 
        private String resourceGroupId; 
        private java.util.List < Integer > status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.edition = request.edition;
            this.enabled = request.enabled;
            this.expireEndTime = request.expireEndTime;
            this.expireStartTime = request.expireStartTime;
            this.instanceIds = request.instanceIds;
            this.ip = request.ip;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tag = request.tag;
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
         * The mitigation plan of the instance to query. Valid values:
         * <p>
         * 
         * *   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan
         * *   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan
         * *   **2**: Anti-DDoS Premium instance of the Chinese Mainland Acceleration (CMA) mitigation plan
         * *   **9**: Anti-DDoS Pro instance of the Profession mitigation plan
         */
        public Builder edition(Integer edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * The traffic forwarding status of the instance to query. Valid values:
         * <p>
         * 
         * *   **0**: The instance no longer forwards service traffic.
         * *   **1**: The instance forwards service traffic as expected.
         */
        public Builder enabled(Integer enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * The end of the time range to query. Instances whose expiration time is earlier than the point in time are queried.**** The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder expireEndTime(Long expireEndTime) {
            this.putQueryParameter("ExpireEndTime", expireEndTime);
            this.expireEndTime = expireEndTime;
            return this;
        }

        /**
         * The beginning of the time range to query. Instances whose expiration time is later than the point in time are queried.**** The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder expireStartTime(Long expireStartTime) {
            this.putQueryParameter("ExpireStartTime", expireStartTime);
            this.expireStartTime = expireStartTime;
            return this;
        }

        /**
         * An array that consists of the IDs of instances to query.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The IP address of the instance to query.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The description of the instance to query. Fuzzy match is supported.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management.
         * <p>
         * 
         * If you do not configure this parameter, the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * An array that consists of the states of the instances to query.
         */
        public Builder status(java.util.List < Integer > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * An array consisting of the tags that are added to the instance to query.
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
             * The key of tag N that is added to the instance to query. The maximum value of N is 200. You can specify up to 200 tags. When you specify tags, take note of the following rules:
             * <p>
             * 
             * *   Each tag consists of a key (**Key**) and a value (**Value**), which are separated by a comma (,).
             * *   Separate multiple tags with commas (,).
             * 
             * > : The tag key (**Key**) and tag value (**Value**) must be specified in pairs.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that is added to the instance to query. The maximum value of N is 200. You can specify up to 200 tags. When you specify tags, take note of the following rules:
             * <p>
             * 
             * *   Each tag consists of a key (**Key**) and a value (**Value**), which are separated by a comma (,).
             * *   Separate multiple tags with commas (,).
             * 
             * > : The tag key (**Key**) and tag value (**Value**) must be specified in pairs.
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
