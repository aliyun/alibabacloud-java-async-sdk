// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnycastEipAddressesRequest} extends {@link RequestModel}
 *
 * <p>ListAnycastEipAddressesRequest</p>
 */
public class ListAnycastEipAddressesRequest extends Request {
    @Query
    @NameInMap("AnycastEipAddress")
    private String anycastEipAddress;

    @Query
    @NameInMap("AnycastId")
    private String anycastId;

    @Query
    @NameInMap("AnycastIds")
    private java.util.List < String > anycastIds;

    @Query
    @NameInMap("BindInstanceIds")
    private java.util.List < String > bindInstanceIds;

    @Query
    @NameInMap("BusinessStatus")
    private String businessStatus;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServiceLocation")
    private String serviceLocation;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ListAnycastEipAddressesRequest(Builder builder) {
        super(builder);
        this.anycastEipAddress = builder.anycastEipAddress;
        this.anycastId = builder.anycastId;
        this.anycastIds = builder.anycastIds;
        this.bindInstanceIds = builder.bindInstanceIds;
        this.businessStatus = builder.businessStatus;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceLocation = builder.serviceLocation;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnycastEipAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastEipAddress
     */
    public String getAnycastEipAddress() {
        return this.anycastEipAddress;
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return anycastIds
     */
    public java.util.List < String > getAnycastIds() {
        return this.anycastIds;
    }

    /**
     * @return bindInstanceIds
     */
    public java.util.List < String > getBindInstanceIds() {
        return this.bindInstanceIds;
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListAnycastEipAddressesRequest, Builder> {
        private String anycastEipAddress; 
        private String anycastId; 
        private java.util.List < String > anycastIds; 
        private java.util.List < String > bindInstanceIds; 
        private String businessStatus; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String resourceGroupId; 
        private String serviceLocation; 
        private String status; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListAnycastEipAddressesRequest request) {
            super(request);
            this.anycastEipAddress = request.anycastEipAddress;
            this.anycastId = request.anycastId;
            this.anycastIds = request.anycastIds;
            this.bindInstanceIds = request.bindInstanceIds;
            this.businessStatus = request.businessStatus;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceLocation = request.serviceLocation;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * The IP address that is allocated to the Anycast EIP.
         */
        public Builder anycastEipAddress(String anycastEipAddress) {
            this.putQueryParameter("AnycastEipAddress", anycastEipAddress);
            this.anycastEipAddress = anycastEipAddress;
            return this;
        }

        /**
         * The ID of the Anycast EIP.
         * <p>
         * 
         * >  To ensure the accuracy of the query result, we do not recommend that you specify **AnycastIds** and **AnycastId** at the same time.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The IDs of Anycast EIPs.
         * <p>
         * 
         * You can enter at most 50 Anycast EIP IDs.
         * 
         * >  To ensure the accuracy of the query result, we do not recommend that you specify **AnycastIds** and **AnycastId** at the same time.
         */
        public Builder anycastIds(java.util.List < String > anycastIds) {
            this.putQueryParameter("AnycastIds", anycastIds);
            this.anycastIds = anycastIds;
            return this;
        }

        /**
         * The IDs of the cloud resources with which the Anycast EIPs are associated.
         * <p>
         * 
         * You can enter at most 100 cloud resource IDs.
         */
        public Builder bindInstanceIds(java.util.List < String > bindInstanceIds) {
            this.putQueryParameter("BindInstanceIds", bindInstanceIds);
            this.bindInstanceIds = bindInstanceIds;
            return this;
        }

        /**
         * The service status of the Anycast EIP. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **FinancialLocked**
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * The billing method of the Anycast EIP.
         * <p>
         * 
         * Set the value to **PostPaid**, which specifies the pay-as-you-go billing method.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the Anycast EIP.
         * <p>
         * 
         * Set the value to **PayByTraffic**, which specifies the pay-by-data-transfer metering method.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **20 to 100**. Default value: **50**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The name of the Anycast EIP.
         * <p>
         * 
         * The name must be 0 to 128 characters in length, and can contain digits, hyphens (-), and underscores (\_). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The access area of the Anycast EIP.
         * <p>
         * 
         * Set the value to **international**, which specifies the regions outside the Chinese mainland.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        /**
         * The status of the Anycast EIP. Valid values:
         * <p>
         * 
         * *   **Associating**
         * *   **Unassociating**
         * *   **Allocated**
         * *   **Associated**
         * *   **Modifying**
         * *   **Releasing**
         * *   **Released**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListAnycastEipAddressesRequest build() {
            return new ListAnycastEipAddressesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key of the resource. You can specify up to 20 tag keys. You cannot specify empty strings as tag keys.
             * <p>
             * 
             * The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.
             * 
             * >  You must specify at least one of **Tag.N** (**Tag.N.Key** and **Tag.N.Value**).
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the resource. You can specify up to 20 tag values. It can be an empty string.
             * <p>
             * 
             * The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.
             * 
             * >  You must specify at least one of **Tag.N** (**Tag.N.Key** and **Tag.N.Value**).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
