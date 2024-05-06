// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertsResponseBody</p>
 */
public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertKeys")
    private SslVpnClientCertKeys sslVpnClientCertKeys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSslVpnClientCertsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sslVpnClientCertKeys = builder.sslVpnClientCertKeys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSslVpnClientCertsResponseBody create() {
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
     * @return sslVpnClientCertKeys
     */
    public SslVpnClientCertKeys getSslVpnClientCertKeys() {
        return this.sslVpnClientCertKeys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SslVpnClientCertKeys sslVpnClientCertKeys; 
        private Integer totalCount; 

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the SSL client certificates.
         */
        public Builder sslVpnClientCertKeys(SslVpnClientCertKeys sslVpnClientCertKeys) {
            this.sslVpnClientCertKeys = sslVpnClientCertKeys;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSslVpnClientCertsResponseBody build() {
            return new DescribeSslVpnClientCertsResponseBody(this);
        } 

    } 

    public static class SslVpnClientCertKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
        private String sslVpnClientCertId;

        @com.aliyun.core.annotation.NameInMap("SslVpnServerId")
        private String sslVpnServerId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SslVpnClientCertKey(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.sslVpnClientCertId = builder.sslVpnClientCertId;
            this.sslVpnServerId = builder.sslVpnServerId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnClientCertKey create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return sslVpnClientCertId
         */
        public String getSslVpnClientCertId() {
            return this.sslVpnClientCertId;
        }

        /**
         * @return sslVpnServerId
         */
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private Long endTime; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String sslVpnClientCertId; 
            private String sslVpnServerId; 
            private String status; 

            /**
             * The timestamp that indicates when the SSL client certificate was created. Unit: millisecond.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp that indicates when the SSL client certificate expires. Unit: millisecond.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the SSL client certificate.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region where the SSL client certificate is created.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the SSL client certificate belongs.
             * <p>
             * 
             * You can call the [ListResourceGroups](~~158855~~) operation to query the resource group information.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the SSL client certificate.
             */
            public Builder sslVpnClientCertId(String sslVpnClientCertId) {
                this.sslVpnClientCertId = sslVpnClientCertId;
                return this;
            }

            /**
             * The ID of the SSL server.
             */
            public Builder sslVpnServerId(String sslVpnServerId) {
                this.sslVpnServerId = sslVpnServerId;
                return this;
            }

            /**
             * The status of the SSL client certificate. Valid values:
             * <p>
             * 
             * *   **expiring-soon**
             * *   **normal**
             * *   **expired**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SslVpnClientCertKey build() {
                return new SslVpnClientCertKey(this);
            } 

        } 

    }
    public static class SslVpnClientCertKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SslVpnClientCertKey")
        private java.util.List < SslVpnClientCertKey> sslVpnClientCertKey;

        private SslVpnClientCertKeys(Builder builder) {
            this.sslVpnClientCertKey = builder.sslVpnClientCertKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnClientCertKeys create() {
            return builder().build();
        }

        /**
         * @return sslVpnClientCertKey
         */
        public java.util.List < SslVpnClientCertKey> getSslVpnClientCertKey() {
            return this.sslVpnClientCertKey;
        }

        public static final class Builder {
            private java.util.List < SslVpnClientCertKey> sslVpnClientCertKey; 

            /**
             * SslVpnClientCertKey.
             */
            public Builder sslVpnClientCertKey(java.util.List < SslVpnClientCertKey> sslVpnClientCertKey) {
                this.sslVpnClientCertKey = sslVpnClientCertKey;
                return this;
            }

            public SslVpnClientCertKeys build() {
                return new SslVpnClientCertKeys(this);
            } 

        } 

    }
}
