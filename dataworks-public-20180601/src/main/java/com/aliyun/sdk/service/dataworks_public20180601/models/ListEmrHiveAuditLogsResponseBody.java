// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link ListEmrHiveAuditLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmrHiveAuditLogsResponseBody</p>
 */
public class ListEmrHiveAuditLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEmrHiveAuditLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrHiveAuditLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEmrHiveAuditLogsResponseBody build() {
            return new ListEmrHiveAuditLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEmrHiveAuditLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEmrHiveAuditLogsResponseBody</p>
     */
    public static class PagedData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<String> groups;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private PagedData(Builder builder) {
            this.database = builder.database;
            this.eventTime = builder.eventTime;
            this.groups = builder.groups;
            this.operation = builder.operation;
            this.table = builder.table;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagedData create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return groups
         */
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String database; 
            private Long eventTime; 
            private java.util.List<String> groups; 
            private String operation; 
            private String table; 
            private String user; 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List<String> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public PagedData build() {
                return new PagedData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEmrHiveAuditLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEmrHiveAuditLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PagedData")
        private java.util.List<PagedData> pagedData;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.pagedData = builder.pagedData;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return pagedData
         */
        public java.util.List<PagedData> getPagedData() {
            return this.pagedData;
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
            private java.util.List<PagedData> pagedData; 
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
             * PagedData.
             */
            public Builder pagedData(java.util.List<PagedData> pagedData) {
                this.pagedData = pagedData;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
