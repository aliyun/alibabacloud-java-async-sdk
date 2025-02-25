// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private Integer edition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Integer enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireEndTime")
    private Long expireEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireStartTime")
    private Long expireStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<Integer> status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
    public java.util.List<String> getInstanceIds() {
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
    public java.util.List<Integer> getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private String regionId; 
        private Integer edition; 
        private Integer enabled; 
        private Long expireEndTime; 
        private Long expireStartTime; 
        private java.util.List<String> instanceIds; 
        private String ip; 
        private String pageNumber; 
        private String pageSize; 
        private String remark; 
        private String resourceGroupId; 
        private java.util.List<Integer> status; 
        private java.util.List<Tag> tag; 

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
         * <p>The mitigation plan of the instance to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
         * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
         * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Chinese Mainland Acceleration (CMA) mitigation plan</li>
         * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder edition(Integer edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The traffic forwarding status of the instance to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The instance no longer forwards service traffic.</li>
         * <li><strong>1</strong>: The instance forwards service traffic as expected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enabled(Integer enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The end of the time range to query. Instances whose expiration time is earlier than the point in time are queried. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640361700000</p>
         */
        public Builder expireEndTime(Long expireEndTime) {
            this.putQueryParameter("ExpireEndTime", expireEndTime);
            this.expireEndTime = expireEndTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Instances whose expiration time is later than the point in time are queried. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640361500000</p>
         */
        public Builder expireStartTime(Long expireStartTime) {
            this.putQueryParameter("ExpireStartTime", expireStartTime);
            this.expireStartTime = expireStartTime;
            return this;
        }

        /**
         * <p>The IDs of the instances to query. You can specify up to 200 instance IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The IP address of the instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The remarks of the instance to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
         * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The states of the instances to query. You can specify up to two states.</p>
         */
        public Builder status(java.util.List<Integer> status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags that are added to the instances to query.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstancesRequest</p>
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
             * <p>The key of the tag that is added to the instance to query. You can specify up to 200 tag keys. When you specify tags, take note of the following rules:</p>
             * <ul>
             * <li>Each tag consists of a key (<strong>Key</strong>) and a value (<strong>Value</strong>), which are separated with a comma (,).</li>
             * <li>Separate multiple tags with commas (,).</li>
             * </ul>
             * <blockquote>
             * <p> The tag key (<strong>Key</strong>) and tag value (<strong>Value</strong>) must be specified in pairs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the instance to query. You can specify up to 200 tag values. When you specify tags, take note of the following rules:</p>
             * <ul>
             * <li>Each tag consists of a key (<strong>Key</strong>) and a value (<strong>Value</strong>), which are separated with a comma (,).</li>
             * <li>Separate multiple tags with commas (,).</li>
             * </ul>
             * <blockquote>
             * <p> The tag key (<strong>Key</strong>) and tag value (<strong>Value</strong>) must be specified in pairs.</p>
             * </blockquote>
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
