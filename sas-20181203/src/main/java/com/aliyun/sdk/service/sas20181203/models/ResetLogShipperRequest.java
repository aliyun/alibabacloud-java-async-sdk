// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<LogMetaList> logMetaList;

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
    public java.util.List<LogMetaList> getLogMetaList() {
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
        private java.util.List<LogMetaList> logMetaList; 
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
         * <p>The global retention period of hot data.</p>
         * <blockquote>
         * <p> The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder hotTtl(Integer hotTtl) {
            this.putQueryParameter("HotTtl", hotTtl);
            this.hotTtl = hotTtl;
            return this;
        }

        /**
         * <p>The settings of the log analysis feature.</p>
         */
        public Builder logMetaList(java.util.List<LogMetaList> logMetaList) {
            this.putQueryParameter("LogMetaList", logMetaList);
            this.logMetaList = logMetaList;
            return this;
        }

        /**
         * <p>The global log retention period.</p>
         * <blockquote>
         * <p> This parameter is supported only when the log analysis feature uses the pay-as-you-go billing method.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>180</p>
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

    /**
     * 
     * {@link ResetLogShipperRequest} extends {@link TeaModel}
     *
     * <p>ResetLogShipperRequest</p>
     */
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
             * <p>The Logstore that you want to configure.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to query the Logstore.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sas-security-log</p>
             */
            public Builder configLogStore(String configLogStore) {
                this.configLogStore = configLogStore;
                return this;
            }

            /**
             * <p>The retention period of hot data in the Logstore.</p>
             * <blockquote>
             * <p> The value of this parameter must be at least 7 and smaller than the log retention period. Unit: days. If you specify this parameter for the Logstore, the global retention period of hot data specified by the HotTtl parameter is overwritten.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder hotTtl(Integer hotTtl) {
                this.hotTtl = hotTtl;
                return this;
            }

            /**
             * <p>The status of the log analysis feature. Valid values:</p>
             * <ul>
             * <li><strong>disabled</strong></li>
             * <li><strong>enabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The log retention period of the Logstore.</p>
             * <blockquote>
             * <p> If you specify this parameter for the Logstore, the global log retention period specified by the Ttl parameter is overwritten.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
