// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryShortUrlDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShortUrlDetailNewResponseBody</p>
 */
public class QueryShortUrlDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtInvalidTime")
    private String gmtInvalidTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Record")
    private java.util.List<Record> record;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShortUrl")
    private String shortUrl;

    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    private String sourceUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TotalPv")
    private String totalPv;

    @com.aliyun.core.annotation.NameInMap("TotalUv")
    private String totalUv;

    private QueryShortUrlDetailNewResponseBody(Builder builder) {
        this.eventName = builder.eventName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtInvalidTime = builder.gmtInvalidTime;
        this.id = builder.id;
        this.record = builder.record;
        this.requestId = builder.requestId;
        this.shortUrl = builder.shortUrl;
        this.sourceUrl = builder.sourceUrl;
        this.status = builder.status;
        this.totalPv = builder.totalPv;
        this.totalUv = builder.totalUv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShortUrlDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtInvalidTime
     */
    public String getGmtInvalidTime() {
        return this.gmtInvalidTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return record
     */
    public java.util.List<Record> getRecord() {
        return this.record;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortUrl
     */
    public String getShortUrl() {
        return this.shortUrl;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return totalPv
     */
    public String getTotalPv() {
        return this.totalPv;
    }

    /**
     * @return totalUv
     */
    public String getTotalUv() {
        return this.totalUv;
    }

    public static final class Builder {
        private String eventName; 
        private String gmtCreateTime; 
        private String gmtInvalidTime; 
        private String id; 
        private java.util.List<Record> record; 
        private String requestId; 
        private String shortUrl; 
        private String sourceUrl; 
        private Integer status; 
        private String totalPv; 
        private String totalUv; 

        private Builder() {
        } 

        private Builder(QueryShortUrlDetailNewResponseBody model) {
            this.eventName = model.eventName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtInvalidTime = model.gmtInvalidTime;
            this.id = model.id;
            this.record = model.record;
            this.requestId = model.requestId;
            this.shortUrl = model.shortUrl;
            this.sourceUrl = model.sourceUrl;
            this.status = model.status;
            this.totalPv = model.totalPv;
            this.totalUv = model.totalUv;
        } 

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtInvalidTime.
         */
        public Builder gmtInvalidTime(String gmtInvalidTime) {
            this.gmtInvalidTime = gmtInvalidTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Record.
         */
        public Builder record(java.util.List<Record> record) {
            this.record = record;
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
         * ShortUrl.
         */
        public Builder shortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }

        /**
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * TotalPv.
         */
        public Builder totalPv(String totalPv) {
            this.totalPv = totalPv;
            return this;
        }

        /**
         * TotalUv.
         */
        public Builder totalUv(String totalUv) {
            this.totalUv = totalUv;
            return this;
        }

        public QueryShortUrlDetailNewResponseBody build() {
            return new QueryShortUrlDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryShortUrlDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShortUrlDetailNewResponseBody</p>
     */
    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtInvalidTime")
        private String gmtInvalidTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ShortUrl")
        private String shortUrl;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalPv")
        private String totalPv;

        @com.aliyun.core.annotation.NameInMap("TotalUv")
        private String totalUv;

        private Record(Builder builder) {
            this.eventName = builder.eventName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtInvalidTime = builder.gmtInvalidTime;
            this.id = builder.id;
            this.shortUrl = builder.shortUrl;
            this.sourceUrl = builder.sourceUrl;
            this.status = builder.status;
            this.totalPv = builder.totalPv;
            this.totalUv = builder.totalUv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtInvalidTime
         */
        public String getGmtInvalidTime() {
            return this.gmtInvalidTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return shortUrl
         */
        public String getShortUrl() {
            return this.shortUrl;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalPv
         */
        public String getTotalPv() {
            return this.totalPv;
        }

        /**
         * @return totalUv
         */
        public String getTotalUv() {
            return this.totalUv;
        }

        public static final class Builder {
            private String eventName; 
            private String gmtCreateTime; 
            private String gmtInvalidTime; 
            private String id; 
            private String shortUrl; 
            private String sourceUrl; 
            private Integer status; 
            private String totalPv; 
            private String totalUv; 

            private Builder() {
            } 

            private Builder(Record model) {
                this.eventName = model.eventName;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtInvalidTime = model.gmtInvalidTime;
                this.id = model.id;
                this.shortUrl = model.shortUrl;
                this.sourceUrl = model.sourceUrl;
                this.status = model.status;
                this.totalPv = model.totalPv;
                this.totalUv = model.totalUv;
            } 

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtInvalidTime.
             */
            public Builder gmtInvalidTime(String gmtInvalidTime) {
                this.gmtInvalidTime = gmtInvalidTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ShortUrl.
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            /**
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalPv.
             */
            public Builder totalPv(String totalPv) {
                this.totalPv = totalPv;
                return this;
            }

            /**
             * TotalUv.
             */
            public Builder totalUv(String totalUv) {
                this.totalUv = totalUv;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
}
