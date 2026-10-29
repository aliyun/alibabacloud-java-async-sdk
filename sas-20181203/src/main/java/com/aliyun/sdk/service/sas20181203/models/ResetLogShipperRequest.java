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
         * <p>The global data retention period in the hot storage tier.</p>
         * <blockquote>
         * <p>Valid values: greater than or equal to 7 days and less than the log retention period.</p>
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
         * <p>The configuration information for log analysis in Security Center.</p>
         */
        public Builder logMetaList(java.util.List<LogMetaList> logMetaList) {
            this.putQueryParameter("LogMetaList", logMetaList);
            this.logMetaList = logMetaList;
            return this;
        }

        /**
         * <p>The global log retention period in days.</p>
         * <blockquote>
         * <p>This parameter is supported only in the pay-as-you-go billing mode for logs.</p>
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

            private Builder() {
            } 

            private Builder(LogMetaList model) {
                this.configLogStore = model.configLogStore;
                this.hotTtl = model.hotTtl;
                this.status = model.status;
                this.ttl = model.ttl;
            } 

            /**
             * <p>The Logstore to be configured.</p>
             * <blockquote>
             * <p>You can call the <a href="~~DescribeLogMeta~~">DescribeLogMeta</a> operation to obtain the value of this parameter.</p>
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
             * <p>The data retention period in the hot storage tier of the Logstore.</p>
             * <blockquote>
             * <p>Valid values: greater than or equal to 7 days and less than the log retention period. Specifying the data retention period in the hot storage tier for a single Logstore overrides the global settings.</p>
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
             * <p>The current enabling status. Valid values:</p>
             * <ul>
             * <li><strong>disabled</strong>: The feature is disabled.</li>
             * <li><strong>enabled</strong>: The feature is enabled.</li>
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
             * <p>The log retention period of the Logstore in days.</p>
             * <blockquote>
             * <p>Specifying the log retention period for a single Logstore overrides the global settings.</p>
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
