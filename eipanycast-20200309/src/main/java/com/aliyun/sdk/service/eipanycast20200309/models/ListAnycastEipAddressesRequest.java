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
    @NameInMap("ServiceLocation")
    private String serviceLocation;

    @Query
    @NameInMap("Status")
    private String status;

    private ListAnycastEipAddressesRequest(Builder builder) {
        super(builder);
        this.anycastEipAddress = builder.anycastEipAddress;
        this.anycastId = builder.anycastId;
        this.bindInstanceIds = builder.bindInstanceIds;
        this.businessStatus = builder.businessStatus;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.serviceLocation = builder.serviceLocation;
        this.status = builder.status;
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

    public static final class Builder extends Request.Builder<ListAnycastEipAddressesRequest, Builder> {
        private String anycastEipAddress; 
        private String anycastId; 
        private java.util.List < String > bindInstanceIds; 
        private String businessStatus; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String serviceLocation; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAnycastEipAddressesRequest response) {
            super(response);
            this.anycastEipAddress = response.anycastEipAddress;
            this.anycastId = response.anycastId;
            this.bindInstanceIds = response.bindInstanceIds;
            this.businessStatus = response.businessStatus;
            this.instanceChargeType = response.instanceChargeType;
            this.internetChargeType = response.internetChargeType;
            this.maxResults = response.maxResults;
            this.name = response.name;
            this.nextToken = response.nextToken;
            this.serviceLocation = response.serviceLocation;
            this.status = response.status;
        } 

        /**
         * AnycastEipAddress.
         */
        public Builder anycastEipAddress(String anycastEipAddress) {
            this.putQueryParameter("AnycastEipAddress", anycastEipAddress);
            this.anycastEipAddress = anycastEipAddress;
            return this;
        }

        /**
         * AnycastId.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * BindInstanceIds.
         */
        public Builder bindInstanceIds(java.util.List < String > bindInstanceIds) {
            this.putQueryParameter("BindInstanceIds", bindInstanceIds);
            this.bindInstanceIds = bindInstanceIds;
            return this;
        }

        /**
         * BusinessStatus.
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ServiceLocation.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAnycastEipAddressesRequest build() {
            return new ListAnycastEipAddressesRequest(this);
        } 

    } 

}
