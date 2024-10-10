// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDIJobEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobEventsResponseBody</p>
 */
public class ListDIJobEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIJobEventsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobEventsResponseBody build() {
            return new ListDIJobEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIJobEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobEventsResponseBody</p>
     */
    public static class DIJobEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Channels")
        private String channels;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DstSql")
        private String dstSql;

        @com.aliyun.core.annotation.NameInMap("DstTable")
        private String dstTable;

        @com.aliyun.core.annotation.NameInMap("FailoverMessage")
        private String failoverMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("SrcSql")
        private String srcSql;

        @com.aliyun.core.annotation.NameInMap("SrcTable")
        private String srcTable;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DIJobEvent(Builder builder) {
            this.action = builder.action;
            this.channels = builder.channels;
            this.createTime = builder.createTime;
            this.detail = builder.detail;
            this.dstSql = builder.dstSql;
            this.dstTable = builder.dstTable;
            this.failoverMessage = builder.failoverMessage;
            this.id = builder.id;
            this.severity = builder.severity;
            this.srcSql = builder.srcSql;
            this.srcTable = builder.srcTable;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobEvent create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return dstSql
         */
        public String getDstSql() {
            return this.dstSql;
        }

        /**
         * @return dstTable
         */
        public String getDstTable() {
            return this.dstTable;
        }

        /**
         * @return failoverMessage
         */
        public String getFailoverMessage() {
            return this.failoverMessage;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return srcSql
         */
        public String getSrcSql() {
            return this.srcSql;
        }

        /**
         * @return srcTable
         */
        public String getSrcTable() {
            return this.srcTable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String action; 
            private String channels; 
            private String createTime; 
            private String detail; 
            private String dstSql; 
            private String dstTable; 
            private String failoverMessage; 
            private String id; 
            private String severity; 
            private String srcSql; 
            private String srcTable; 
            private String status; 
            private String type; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DstSql.
             */
            public Builder dstSql(String dstSql) {
                this.dstSql = dstSql;
                return this;
            }

            /**
             * DstTable.
             */
            public Builder dstTable(String dstTable) {
                this.dstTable = dstTable;
                return this;
            }

            /**
             * FailoverMessage.
             */
            public Builder failoverMessage(String failoverMessage) {
                this.failoverMessage = failoverMessage;
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
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * SrcSql.
             */
            public Builder srcSql(String srcSql) {
                this.srcSql = srcSql;
                return this;
            }

            /**
             * SrcTable.
             */
            public Builder srcTable(String srcTable) {
                this.srcTable = srcTable;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DIJobEvent build() {
                return new DIJobEvent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIJobEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobEventsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobEvent")
        private java.util.List < DIJobEvent> DIJobEvent;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.DIJobEvent = builder.DIJobEvent;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return DIJobEvent
         */
        public java.util.List < DIJobEvent> getDIJobEvent() {
            return this.DIJobEvent;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DIJobEvent> DIJobEvent; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * DIJobEvent.
             */
            public Builder DIJobEvent(java.util.List < DIJobEvent> DIJobEvent) {
                this.DIJobEvent = DIJobEvent;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
