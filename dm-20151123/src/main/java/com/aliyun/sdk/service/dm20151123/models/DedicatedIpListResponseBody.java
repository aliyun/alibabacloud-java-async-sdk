// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpListResponseBody} extends {@link TeaModel}
 *
 * <p>DedicatedIpListResponseBody</p>
 */
public class DedicatedIpListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Ips")
    private java.util.List<Ips> ips;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private DedicatedIpListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.hasMore = builder.hasMore;
        this.ips = builder.ips;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return ips
     */
    public java.util.List<Ips> getIps() {
        return this.ips;
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
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Boolean hasMore; 
        private java.util.List<Ips> ips; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCounts; 

        private Builder() {
        } 

        private Builder(DedicatedIpListResponseBody model) {
            this.currentPage = model.currentPage;
            this.hasMore = model.hasMore;
            this.ips = model.ips;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCounts = model.totalCounts;
        } 

        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Whether there is a next page</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>IP list</p>
         */
        public Builder ips(java.util.List<Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total amount of purchased IP data</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public DedicatedIpListResponseBody build() {
            return new DedicatedIpListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DedicatedIpListResponseBody} extends {@link TeaModel}
     *
     * <p>DedicatedIpListResponseBody</p>
     */
    public static class IpExt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("HasSendMail")
        private Boolean hasSendMail;

        @com.aliyun.core.annotation.NameInMap("LastWarmUpTypeChangedTime")
        private String lastWarmUpTypeChangedTime;

        private IpExt(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.hasSendMail = builder.hasSendMail;
            this.lastWarmUpTypeChangedTime = builder.lastWarmUpTypeChangedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpExt create() {
            return builder().build();
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return hasSendMail
         */
        public Boolean getHasSendMail() {
            return this.hasSendMail;
        }

        /**
         * @return lastWarmUpTypeChangedTime
         */
        public String getLastWarmUpTypeChangedTime() {
            return this.lastWarmUpTypeChangedTime;
        }

        public static final class Builder {
            private Boolean autoRenewal; 
            private Boolean hasSendMail; 
            private String lastWarmUpTypeChangedTime; 

            private Builder() {
            } 

            private Builder(IpExt model) {
                this.autoRenewal = model.autoRenewal;
                this.hasSendMail = model.hasSendMail;
                this.lastWarmUpTypeChangedTime = model.lastWarmUpTypeChangedTime;
            } 

            /**
             * <p>Whether auto-renewal is enabled</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>Whether an email has been sent</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasSendMail(Boolean hasSendMail) {
                this.hasSendMail = hasSendMail;
                return this;
            }

            /**
             * LastWarmUpTypeChangedTime.
             */
            public Builder lastWarmUpTypeChangedTime(String lastWarmUpTypeChangedTime) {
                this.lastWarmUpTypeChangedTime = lastWarmUpTypeChangedTime;
                return this;
            }

            public IpExt build() {
                return new IpExt(this);
            } 

        } 

    }
    /**
     * 
     * {@link DedicatedIpListResponseBody} extends {@link TeaModel}
     *
     * <p>DedicatedIpListResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpExt")
        private IpExt ipExt;

        @com.aliyun.core.annotation.NameInMap("IpPoolName")
        private String ipPoolName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WarmupStatus")
        private String warmupStatus;

        @com.aliyun.core.annotation.NameInMap("WarmupType")
        private String warmupType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Ips(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.ipExt = builder.ipExt;
            this.ipPoolName = builder.ipPoolName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.warmupStatus = builder.warmupStatus;
            this.warmupType = builder.warmupType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipExt
         */
        public IpExt getIpExt() {
            return this.ipExt;
        }

        /**
         * @return ipPoolName
         */
        public String getIpPoolName() {
            return this.ipPoolName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return warmupStatus
         */
        public String getWarmupStatus() {
            return this.warmupStatus;
        }

        /**
         * @return warmupType
         */
        public String getWarmupType() {
            return this.warmupType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String expiredTime; 
            private String id; 
            private String instanceId; 
            private String ip; 
            private IpExt ipExt; 
            private String ipPoolName; 
            private String startTime; 
            private String status; 
            private String warmupStatus; 
            private String warmupType; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.expiredTime = model.expiredTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.ipExt = model.ipExt;
                this.ipPoolName = model.ipPoolName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.warmupStatus = model.warmupStatus;
                this.warmupType = model.warmupType;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Expiration time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-12T09:19:20Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>IP ID, consistent with the purchased instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Purchased instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IP address</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Extended information</p>
             */
            public Builder ipExt(IpExt ipExt) {
                this.ipExt = ipExt;
                return this;
            }

            /**
             * <p>Name of the IP pool</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder ipPoolName(String ipPoolName) {
                this.ipPoolName = ipPoolName;
                return this;
            }

            /**
             * <p>Purchase time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-12T09:19:20Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>IP status</p>
             * 
             * <strong>example:</strong>
             * <p>sold</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Warm-up status</p>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder warmupStatus(String warmupStatus) {
                this.warmupStatus = warmupStatus;
                return this;
            }

            /**
             * <p>Warm-up method</p>
             * 
             * <strong>example:</strong>
             * <p>cusSelfManager</p>
             */
            public Builder warmupType(String warmupType) {
                this.warmupType = warmupType;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
}
