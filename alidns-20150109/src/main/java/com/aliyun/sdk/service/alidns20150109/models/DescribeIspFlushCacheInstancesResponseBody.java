// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeIspFlushCacheInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheInstancesResponseBody</p>
 */
public class DescribeIspFlushCacheInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IspFlushCacheInstances")
    private java.util.List<IspFlushCacheInstances> ispFlushCacheInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeIspFlushCacheInstancesResponseBody(Builder builder) {
        this.ispFlushCacheInstances = builder.ispFlushCacheInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspFlushCacheInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ispFlushCacheInstances
     */
    public java.util.List<IspFlushCacheInstances> getIspFlushCacheInstances() {
        return this.ispFlushCacheInstances;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<IspFlushCacheInstances> ispFlushCacheInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeIspFlushCacheInstancesResponseBody model) {
            this.ispFlushCacheInstances = model.ispFlushCacheInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * IspFlushCacheInstances.
         */
        public Builder ispFlushCacheInstances(java.util.List<IspFlushCacheInstances> ispFlushCacheInstances) {
            this.ispFlushCacheInstances = ispFlushCacheInstances;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeIspFlushCacheInstancesResponseBody build() {
            return new DescribeIspFlushCacheInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIspFlushCacheInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspFlushCacheInstancesResponseBody</p>
     */
    public static class QuotaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceQuota")
        private Integer instanceQuota;

        @com.aliyun.core.annotation.NameInMap("InstanceQuotaUsed")
        private Integer instanceQuotaUsed;

        private QuotaInfo(Builder builder) {
            this.instanceQuota = builder.instanceQuota;
            this.instanceQuotaUsed = builder.instanceQuotaUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfo create() {
            return builder().build();
        }

        /**
         * @return instanceQuota
         */
        public Integer getInstanceQuota() {
            return this.instanceQuota;
        }

        /**
         * @return instanceQuotaUsed
         */
        public Integer getInstanceQuotaUsed() {
            return this.instanceQuotaUsed;
        }

        public static final class Builder {
            private Integer instanceQuota; 
            private Integer instanceQuotaUsed; 

            private Builder() {
            } 

            private Builder(QuotaInfo model) {
                this.instanceQuota = model.instanceQuota;
                this.instanceQuotaUsed = model.instanceQuotaUsed;
            } 

            /**
             * InstanceQuota.
             */
            public Builder instanceQuota(Integer instanceQuota) {
                this.instanceQuota = instanceQuota;
                return this;
            }

            /**
             * InstanceQuotaUsed.
             */
            public Builder instanceQuotaUsed(Integer instanceQuotaUsed) {
                this.instanceQuotaUsed = instanceQuotaUsed;
                return this;
            }

            public QuotaInfo build() {
                return new QuotaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIspFlushCacheInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspFlushCacheInstancesResponseBody</p>
     */
    public static class IspFlushCacheInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("QuotaInfo")
        private QuotaInfo quotaInfo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private IspFlushCacheInstances(Builder builder) {
            this.expireTime = builder.expireTime;
            this.expireTimestamp = builder.expireTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isp = builder.isp;
            this.quotaInfo = builder.quotaInfo;
            this.status = builder.status;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspFlushCacheInstances create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return quotaInfo
         */
        public QuotaInfo getQuotaInfo() {
            return this.quotaInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String expireTime; 
            private Long expireTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private String isp; 
            private QuotaInfo quotaInfo; 
            private String status; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(IspFlushCacheInstances model) {
                this.expireTime = model.expireTime;
                this.expireTimestamp = model.expireTimestamp;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.isp = model.isp;
                this.quotaInfo = model.quotaInfo;
                this.status = model.status;
                this.versionCode = model.versionCode;
            } 

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * QuotaInfo.
             */
            public Builder quotaInfo(QuotaInfo quotaInfo) {
                this.quotaInfo = quotaInfo;
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
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public IspFlushCacheInstances build() {
                return new IspFlushCacheInstances(this);
            } 

        } 

    }
}
