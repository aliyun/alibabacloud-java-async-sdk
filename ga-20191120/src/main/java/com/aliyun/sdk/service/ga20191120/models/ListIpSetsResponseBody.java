// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpSetsResponseBody</p>
 */
public class ListIpSetsResponseBody extends TeaModel {
    @NameInMap("IpSets")
    private java.util.List < IpSets> ipSets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpSetsResponseBody(Builder builder) {
        this.ipSets = builder.ipSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipSets
     */
    public java.util.List < IpSets> getIpSets() {
        return this.ipSets;
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

    public static final class Builder {
        private java.util.List < IpSets> ipSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpSets.
         */
        public Builder ipSets(java.util.List < IpSets> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

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

        public ListIpSetsResponseBody build() {
            return new ListIpSetsResponseBody(this);
        } 

    } 

    public static class IpSets extends TeaModel {
        @NameInMap("AccelerateRegionId")
        private String accelerateRegionId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("IpAddressList")
        private java.util.List < String > ipAddressList;

        @NameInMap("IpSetId")
        private String ipSetId;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("State")
        private String state;

        private IpSets(Builder builder) {
            this.accelerateRegionId = builder.accelerateRegionId;
            this.bandwidth = builder.bandwidth;
            this.ipAddressList = builder.ipAddressList;
            this.ipSetId = builder.ipSetId;
            this.ipVersion = builder.ipVersion;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSets create() {
            return builder().build();
        }

        /**
         * @return accelerateRegionId
         */
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return ipAddressList
         */
        public java.util.List < String > getIpAddressList() {
            return this.ipAddressList;
        }

        /**
         * @return ipSetId
         */
        public String getIpSetId() {
            return this.ipSetId;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accelerateRegionId; 
            private Integer bandwidth; 
            private java.util.List < String > ipAddressList; 
            private String ipSetId; 
            private String ipVersion; 
            private String state; 

            /**
             * AccelerateRegionId.
             */
            public Builder accelerateRegionId(String accelerateRegionId) {
                this.accelerateRegionId = accelerateRegionId;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * IpAddressList.
             */
            public Builder ipAddressList(java.util.List < String > ipAddressList) {
                this.ipAddressList = ipAddressList;
                return this;
            }

            /**
             * IpSetId.
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public IpSets build() {
                return new IpSets(this);
            } 

        } 

    }
}
