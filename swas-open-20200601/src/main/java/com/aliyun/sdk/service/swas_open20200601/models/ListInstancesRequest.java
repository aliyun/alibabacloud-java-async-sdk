// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpAddresses")
    private String publicIpAddresses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.instanceIds = builder.instanceIds;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicIpAddresses = builder.publicIpAddresses;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return publicIpAddresses
     */
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String chargeType; 
        private String instanceIds; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publicIpAddresses; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.instanceIds = request.instanceIds;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publicIpAddresses = request.publicIpAddresses;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * The billing method of the simple application servers. Set the value to PrePaid, which indicates the subscription billing method.
         * <p>
         * 
         * Default value: PrePaid.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The IDs of the simple application servers. The value can be a JSON array that consists of up to 100 simple application server IDs. Separate multiple server IDs with commas (,).
         * <p>
         * 
         * > If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that the specified IDs and the specified public IP addresses belong to the same simple application servers. Otherwise, an empty result is returned.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The name of the simple application servers, which supports fuzzy search using wildcard *.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The public IP addresses of the simple application servers. The value can be a JSON array that consists of up to 100 IP addresses. Separate multiple IP addresses with commas (,).
         * <p>
         * 
         * > If you specify both `InstanceIds` and `PublicIpAddresses`, make sure that the specified IDs and the specified public IP addresses belong to the same simple application servers. Otherwise, an empty result is returned.
         */
        public Builder publicIpAddresses(String publicIpAddresses) {
            this.putQueryParameter("PublicIpAddresses", publicIpAddresses);
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * The region ID of the simple application servers.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the simple application servers belong.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The status of the simple application servers. Valid values:
         * <p>
         * 
         * *   Pending
         * *   Starting
         * *   Running
         * *   Stopping
         * *   Stopped
         * *   Resetting
         * *   Upgrading
         * *   Disabled
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags that are added to the simple application servers.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

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
             * The tag key of the simple application servers. A tag key can be 1 to 64 characters in length. Valid values of N: 1 to 20.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the simple application servers. A tag value can be 1 to 64 characters in length. Valid values of N: 1 to 20.
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
