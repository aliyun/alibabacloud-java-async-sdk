// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetLogShipperRequest} extends {@link RequestModel}
 *
 * <p>ResetLogShipperRequest</p>
 */
public class ResetLogShipperRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotTtl")
    private Integer hotTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogMetaList")
    private java.util.List < LogMetaList> logMetaList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private ResetLogShipperRequest(Builder builder) {
        super(builder);
        this.hotTtl = builder.hotTtl;
        this.logMetaList = builder.logMetaList;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetLogShipperRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotTtl
     */
    public Integer getHotTtl() {
        return this.hotTtl;
    }

    /**
     * @return logMetaList
     */
    public java.util.List < LogMetaList> getLogMetaList() {
        return this.logMetaList;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<ResetLogShipperRequest, Builder> {
        private Integer hotTtl; 
        private java.util.List < LogMetaList> logMetaList; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(ResetLogShipperRequest request) {
            super(request);
            this.hotTtl = request.hotTtl;
            this.logMetaList = request.logMetaList;
            this.ttl = request.ttl;
        } 

        /**
         * The global retention period of hot data.
         * <p>
         * 
         * >  The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days.
         */
        public Builder hotTtl(Integer hotTtl) {
            this.putQueryParameter("HotTtl", hotTtl);
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * The settings of the log analysis feature.
         */
        public Builder logMetaList(java.util.List < LogMetaList> logMetaList) {
            this.putQueryParameter("LogMetaList", logMetaList);
            this.logMetaList = logMetaList;
            return this;
        }

        /**
         * The global log retention period.
         * <p>
         * 
         * >  This parameter is supported only when the log analysis feature uses the pay-as-you-go billing method.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public ResetLogShipperRequest build() {
            return new ResetLogShipperRequest(this);
        } 

    } 

    public static class LogMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigLogStore")
        private String configLogStore;

        @com.aliyun.core.annotation.NameInMap("HotTtl")
        private Integer hotTtl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private LogMetaList(Builder builder) {
            this.configLogStore = builder.configLogStore;
            this.hotTtl = builder.hotTtl;
            this.status = builder.status;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMetaList create() {
            return builder().build();
        }

        /**
         * @return configLogStore
         */
        public String getConfigLogStore() {
            return this.configLogStore;
        }

        /**
         * @return hotTtl
         */
        public Integer getHotTtl() {
            return this.hotTtl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String configLogStore; 
            private Integer hotTtl; 
            private String status; 
            private Integer ttl; 

            /**
             * The Logstore that you want to configure.
             * <p>
             * 
             * >  You can call the [DescribeLogMeta](~~DescribeLogMeta~~) operation to query the Logstore.
             */
            public Builder configLogStore(String configLogStore) {
                this.configLogStore = configLogStore;
                return this;
            }

            /**
             * The retention period of hot data in the Logstore.
             * <p>
             * 
             * >  The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days. If you specify this parameter for the Logstore, the global retention period of hot data specified by the HotTtl parameter is overwritten.
             */
            public Builder hotTtl(Integer hotTtl) {
                this.hotTtl = hotTtl;
                return this;
            }

            /**
             * The status of the log analysis feature. Valid values:
             * <p>
             * 
             * *   **disabled**
             * *   **enabled**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The log retention period of the Logstore.
             * <p>
             * 
             * >  If you specify this parameter for the Logstore, the global log retention period specified by the Ttl parameter is overwritten.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public LogMetaList build() {
                return new LogMetaList(this);
            } 

        } 

    }
}
