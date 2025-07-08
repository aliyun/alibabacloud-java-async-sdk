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
 * {@link QueryShortUrlListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShortUrlListNewResponseBody</p>
 */
public class QueryShortUrlListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryShortUrlListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShortUrlListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryShortUrlListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryShortUrlListNewResponseBody build() {
            return new QueryShortUrlListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryShortUrlListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShortUrlListNewResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

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
            this.reason = builder.reason;
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
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
            private String reason; 
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
                this.reason = model.reason;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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
    /**
     * 
     * {@link QueryShortUrlListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShortUrlListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtInvalidTime")
        private String gmtInvalidTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List<Record> record;

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

        private List(Builder builder) {
            this.eventName = builder.eventName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtInvalidTime = builder.gmtInvalidTime;
            this.id = builder.id;
            this.reason = builder.reason;
            this.record = builder.record;
            this.shortUrl = builder.shortUrl;
            this.sourceUrl = builder.sourceUrl;
            this.status = builder.status;
            this.totalPv = builder.totalPv;
            this.totalUv = builder.totalUv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return record
         */
        public java.util.List<Record> getRecord() {
            return this.record;
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
            private String reason; 
            private java.util.List<Record> record; 
            private String shortUrl; 
            private String sourceUrl; 
            private Integer status; 
            private String totalPv; 
            private String totalUv; 

            private Builder() {
            } 

            private Builder(List model) {
                this.eventName = model.eventName;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtInvalidTime = model.gmtInvalidTime;
                this.id = model.id;
                this.reason = model.reason;
                this.record = model.record;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
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

            public List build() {
                return new List(this);
            } 

        } 

    }
}
