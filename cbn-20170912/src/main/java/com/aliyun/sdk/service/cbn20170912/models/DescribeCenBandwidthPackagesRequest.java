// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenBandwidthPackagesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenBandwidthPackagesRequest</p>
 */
public class DescribeCenBandwidthPackagesRequest extends Request {
    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("IncludeReservationData")
    private Boolean includeReservationData;

    @Query
    @NameInMap("IsOrKey")
    private Boolean isOrKey;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeCenBandwidthPackagesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.includeReservationData = builder.includeReservationData;
        this.isOrKey = builder.isOrKey;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenBandwidthPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return includeReservationData
     */
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    /**
     * @return isOrKey
     */
    public Boolean getIsOrKey() {
        return this.isOrKey;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeCenBandwidthPackagesRequest, Builder> {
        private java.util.List < Filter> filter; 
        private Boolean includeReservationData; 
        private Boolean isOrKey; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenBandwidthPackagesRequest request) {
            super(request);
            this.filter = request.filter;
            this.includeReservationData = request.includeReservationData;
            this.isOrKey = request.isOrKey;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The filter conditions.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * Specifies whether to include renewal data. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder includeReservationData(Boolean includeReservationData) {
            this.putQueryParameter("IncludeReservationData", includeReservationData);
            this.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * The logical operator between the filter conditions. Valid values:
         * <p>
         * 
         * *   **false** (default): **AND** Bandwidth plans that meet all filter conditions are returned.
         * *   **true**: **OR** Bandwidth plans that meet one of the filter conditions are returned.
         */
        public Builder isOrKey(Boolean isOrKey) {
            this.putQueryParameter("IsOrKey", isOrKey);
            this.isOrKey = isOrKey;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeCenBandwidthPackagesRequest build() {
            return new DescribeCenBandwidthPackagesRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private java.util.List < String > value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > value; 

            /**
             * The filter condition.
             * <p>
             * 
             * You can use filter conditions to filter the bandwidth plans that you want to query. The following filter conditions are supported:
             * 
             * *   **CenId**: CEN instance ID
             * 
             * *   **Status**: bandwidth plan status. Valid values:
             * 
             *     *   **Idle**: not associated with a CEN instance.
             *     *   **InUse**: associated with a CEN instance.
             * 
             * *   **CenBandwidthPackageId**: bandwidth plan ID
             * 
             * *   **Name**: bandwidth plan name
             * 
             *     You can specify one or more filter conditions. The maximum value of **N** is **5**.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The values of condition.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
