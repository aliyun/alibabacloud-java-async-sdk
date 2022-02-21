// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRoutersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRoutersResponseBody</p>
 */
public class ListTransitRoutersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouters")
    private java.util.List < TransitRouters> transitRouters;

    private ListTransitRoutersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouters = builder.transitRouters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRoutersResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return transitRouters
     */
    public java.util.List < TransitRouters> getTransitRouters() {
        return this.transitRouters;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouters> transitRouters; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TransitRouters.
         */
        public Builder transitRouters(java.util.List < TransitRouters> transitRouters) {
            this.transitRouters = transitRouters;
            return this;
        }

        public ListTransitRoutersResponseBody build() {
            return new ListTransitRoutersResponseBody(this);
        } 

    } 

    public static class TransitRouters extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterDescription")
        private String transitRouterDescription;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterName")
        private String transitRouterName;

        @NameInMap("Type")
        private String type;

        private TransitRouters(Builder builder) {
            this.aliUid = builder.aliUid;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.transitRouterDescription = builder.transitRouterDescription;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterName = builder.transitRouterName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouters create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterDescription
         */
        public String getTransitRouterDescription() {
            return this.transitRouterDescription;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterName
         */
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long aliUid; 
            private String cenId; 
            private String creationTime; 
            private String regionId; 
            private String status; 
            private String transitRouterDescription; 
            private String transitRouterId; 
            private String transitRouterName; 
            private String type; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TransitRouterDescription.
             */
            public Builder transitRouterDescription(String transitRouterDescription) {
                this.transitRouterDescription = transitRouterDescription;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * TransitRouterName.
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TransitRouters build() {
                return new TransitRouters(this);
            } 

        } 

    }
}
