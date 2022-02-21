// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenPrivateZoneRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenPrivateZoneRoutesResponseBody</p>
 */
public class DescribeCenPrivateZoneRoutesResponseBody extends TeaModel {
    @NameInMap("CenId")
    private String cenId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrivateZoneDnsServers")
    private String privateZoneDnsServers;

    @NameInMap("PrivateZoneInfos")
    private PrivateZoneInfos privateZoneInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenPrivateZoneRoutesResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privateZoneDnsServers = builder.privateZoneDnsServers;
        this.privateZoneInfos = builder.privateZoneInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenPrivateZoneRoutesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
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
     * @return privateZoneDnsServers
     */
    public String getPrivateZoneDnsServers() {
        return this.privateZoneDnsServers;
    }

    /**
     * @return privateZoneInfos
     */
    public PrivateZoneInfos getPrivateZoneInfos() {
        return this.privateZoneInfos;
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
        private String cenId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String privateZoneDnsServers; 
        private PrivateZoneInfos privateZoneInfos; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
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
         * PrivateZoneDnsServers.
         */
        public Builder privateZoneDnsServers(String privateZoneDnsServers) {
            this.privateZoneDnsServers = privateZoneDnsServers;
            return this;
        }

        /**
         * PrivateZoneInfos.
         */
        public Builder privateZoneInfos(PrivateZoneInfos privateZoneInfos) {
            this.privateZoneInfos = privateZoneInfos;
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

        public DescribeCenPrivateZoneRoutesResponseBody build() {
            return new DescribeCenPrivateZoneRoutesResponseBody(this);
        } 

    } 

    public static class PrivateZoneInfo extends TeaModel {
        @NameInMap("AccessRegionId")
        private String accessRegionId;

        @NameInMap("HostRegionId")
        private String hostRegionId;

        @NameInMap("HostVpcId")
        private String hostVpcId;

        @NameInMap("Status")
        private String status;

        private PrivateZoneInfo(Builder builder) {
            this.accessRegionId = builder.accessRegionId;
            this.hostRegionId = builder.hostRegionId;
            this.hostVpcId = builder.hostVpcId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateZoneInfo create() {
            return builder().build();
        }

        /**
         * @return accessRegionId
         */
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        /**
         * @return hostRegionId
         */
        public String getHostRegionId() {
            return this.hostRegionId;
        }

        /**
         * @return hostVpcId
         */
        public String getHostVpcId() {
            return this.hostVpcId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessRegionId; 
            private String hostRegionId; 
            private String hostVpcId; 
            private String status; 

            /**
             * AccessRegionId.
             */
            public Builder accessRegionId(String accessRegionId) {
                this.accessRegionId = accessRegionId;
                return this;
            }

            /**
             * HostRegionId.
             */
            public Builder hostRegionId(String hostRegionId) {
                this.hostRegionId = hostRegionId;
                return this;
            }

            /**
             * HostVpcId.
             */
            public Builder hostVpcId(String hostVpcId) {
                this.hostVpcId = hostVpcId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrivateZoneInfo build() {
                return new PrivateZoneInfo(this);
            } 

        } 

    }
    public static class PrivateZoneInfos extends TeaModel {
        @NameInMap("PrivateZoneInfo")
        private java.util.List < PrivateZoneInfo> privateZoneInfo;

        private PrivateZoneInfos(Builder builder) {
            this.privateZoneInfo = builder.privateZoneInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateZoneInfos create() {
            return builder().build();
        }

        /**
         * @return privateZoneInfo
         */
        public java.util.List < PrivateZoneInfo> getPrivateZoneInfo() {
            return this.privateZoneInfo;
        }

        public static final class Builder {
            private java.util.List < PrivateZoneInfo> privateZoneInfo; 

            /**
             * PrivateZoneInfo.
             */
            public Builder privateZoneInfo(java.util.List < PrivateZoneInfo> privateZoneInfo) {
                this.privateZoneInfo = privateZoneInfo;
                return this;
            }

            public PrivateZoneInfos build() {
                return new PrivateZoneInfos(this);
            } 

        } 

    }
}
