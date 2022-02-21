// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertsResponseBody</p>
 */
public class DescribeSslVpnClientCertsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SslVpnClientCertKeys")
    private SslVpnClientCertKeys sslVpnClientCertKeys;

    @NameInMap("TotalCount")
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
         * SslVpnClientCertKeys.
         */
        public Builder sslVpnClientCertKeys(SslVpnClientCertKeys sslVpnClientCertKeys) {
            this.sslVpnClientCertKeys = sslVpnClientCertKeys;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SslVpnClientCertId")
        private String sslVpnClientCertId;

        @NameInMap("SslVpnServerId")
        private String sslVpnServerId;

        @NameInMap("Status")
        private String status;

        private SslVpnClientCertKey(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
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
            private String sslVpnClientCertId; 
            private String sslVpnServerId; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * SslVpnClientCertId.
             */
            public Builder sslVpnClientCertId(String sslVpnClientCertId) {
                this.sslVpnClientCertId = sslVpnClientCertId;
                return this;
            }

            /**
             * SslVpnServerId.
             */
            public Builder sslVpnServerId(String sslVpnServerId) {
                this.sslVpnServerId = sslVpnServerId;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("SslVpnClientCertKey")
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
