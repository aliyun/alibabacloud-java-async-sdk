// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QueryIpcQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIpcQuotaResponseBody</p>
 */
public class QueryIpcQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpcQuotaInfos")
    private java.util.List<IpcQuotaInfos> ipcQuotaInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private QueryIpcQuotaResponseBody(Builder builder) {
        this.ipcQuotaInfos = builder.ipcQuotaInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIpcQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipcQuotaInfos
     */
    public java.util.List<IpcQuotaInfos> getIpcQuotaInfos() {
        return this.ipcQuotaInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<IpcQuotaInfos> ipcQuotaInfos; 
        private String requestId; 
        private String total; 

        private Builder() {
        } 

        private Builder(QueryIpcQuotaResponseBody model) {
            this.ipcQuotaInfos = model.ipcQuotaInfos;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>List of IPC usage information.</p>
         */
        public Builder ipcQuotaInfos(java.util.List<IpcQuotaInfos> ipcQuotaInfos) {
            this.ipcQuotaInfos = ipcQuotaInfos;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public QueryIpcQuotaResponseBody build() {
            return new QueryIpcQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIpcQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIpcQuotaResponseBody</p>
     */
    public static class IpcQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        private String capability;

        @com.aliyun.core.annotation.NameInMap("ConsumedQuota")
        private Long consumedQuota;

        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("MaxQuota")
        private Long maxQuota;

        private IpcQuotaInfos(Builder builder) {
            this.capability = builder.capability;
            this.consumedQuota = builder.consumedQuota;
            this.dateTime = builder.dateTime;
            this.maxQuota = builder.maxQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpcQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public String getCapability() {
            return this.capability;
        }

        /**
         * @return consumedQuota
         */
        public Long getConsumedQuota() {
            return this.consumedQuota;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return maxQuota
         */
        public Long getMaxQuota() {
            return this.maxQuota;
        }

        public static final class Builder {
            private String capability; 
            private Long consumedQuota; 
            private String dateTime; 
            private Long maxQuota; 

            private Builder() {
            } 

            private Builder(IpcQuotaInfos model) {
                this.capability = model.capability;
                this.consumedQuota = model.consumedQuota;
                this.dateTime = model.dateTime;
                this.maxQuota = model.maxQuota;
            } 

            /**
             * <p>Capability. Valid values:</p>
             * <ul>
             * <li><p>understand: understanding</p>
             * </li>
             * <li><p>understand-reid: understanding with reid</p>
             * </li>
             * <li><p>search: search</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>understand</p>
             */
            public Builder capability(String capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>Consumed quota.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder consumedQuota(Long consumedQuota) {
                this.consumedQuota = consumedQuota;
                return this;
            }

            /**
             * <p>Corresponding time. UTC time in the format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-21T16:00:00Z</p>
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * <p>Maximum available quota.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxQuota(Long maxQuota) {
                this.maxQuota = maxQuota;
                return this;
            }

            public IpcQuotaInfos build() {
                return new IpcQuotaInfos(this);
            } 

        } 

    }
}
