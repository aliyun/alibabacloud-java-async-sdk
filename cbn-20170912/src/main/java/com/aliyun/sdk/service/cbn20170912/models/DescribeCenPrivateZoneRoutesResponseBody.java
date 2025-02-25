// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeCenPrivateZoneRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenPrivateZoneRoutesResponseBody</p>
 */
public class DescribeCenPrivateZoneRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrivateZoneDnsServers")
    private String privateZoneDnsServers;

    @com.aliyun.core.annotation.NameInMap("PrivateZoneInfos")
    private PrivateZoneInfos privateZoneInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jmc****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IP address of the DNS server used by PrivateZone.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.XX.XX/32,100.100.XX.XX/32</p>
         */
        public Builder privateZoneDnsServers(String privateZoneDnsServers) {
            this.privateZoneDnsServers = privateZoneDnsServers;
            return this;
        }

        /**
         * <p>The detailed configuration of PrivateZone.</p>
         */
        public Builder privateZoneInfos(PrivateZoneInfos privateZoneInfos) {
            this.privateZoneInfos = privateZoneInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>461EC1B5-04A8-4706-8764-8F5BCEF48A6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenPrivateZoneRoutesResponseBody build() {
            return new DescribeCenPrivateZoneRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenPrivateZoneRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenPrivateZoneRoutesResponseBody</p>
     */
    public static class PrivateZoneInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRegionId")
        private String accessRegionId;

        @com.aliyun.core.annotation.NameInMap("HostRegionId")
        private String hostRegionId;

        @com.aliyun.core.annotation.NameInMap("HostVpcId")
        private String hostVpcId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the region where PrivateZone is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder accessRegionId(String accessRegionId) {
                this.accessRegionId = accessRegionId;
                return this;
            }

            /**
             * <p>The ID of the region where PrivateZone is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder hostRegionId(String hostRegionId) {
                this.hostRegionId = hostRegionId;
                return this;
            }

            /**
             * <p>The ID of the VPC that is associated with PrivateZone.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp18sth14qii3pnvo****</p>
             */
            public Builder hostVpcId(String hostVpcId) {
                this.hostVpcId = hostVpcId;
                return this;
            }

            /**
             * <p>The status of PrivateZone. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: being created</li>
             * <li><strong>Active</strong>: available</li>
             * <li><strong>Deleting</strong>: being deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
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
    /**
     * 
     * {@link DescribeCenPrivateZoneRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenPrivateZoneRoutesResponseBody</p>
     */
    public static class PrivateZoneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateZoneInfo")
        private java.util.List<PrivateZoneInfo> privateZoneInfo;

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
        public java.util.List<PrivateZoneInfo> getPrivateZoneInfo() {
            return this.privateZoneInfo;
        }

        public static final class Builder {
            private java.util.List<PrivateZoneInfo> privateZoneInfo; 

            /**
             * PrivateZoneInfo.
             */
            public Builder privateZoneInfo(java.util.List<PrivateZoneInfo> privateZoneInfo) {
                this.privateZoneInfo = privateZoneInfo;
                return this;
            }

            public PrivateZoneInfos build() {
                return new PrivateZoneInfos(this);
            } 

        } 

    }
}
