// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChangeLogsResponseBody</p>
 */
public class DescribeChangeLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeLogs")
    private ChangeLogs changeLogs;

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

    private DescribeChangeLogsResponseBody(Builder builder) {
        this.changeLogs = builder.changeLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangeLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeLogs
     */
    public ChangeLogs getChangeLogs() {
        return this.changeLogs;
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
        private ChangeLogs changeLogs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The operation logs.
         */
        public Builder changeLogs(ChangeLogs changeLogs) {
            this.changeLogs = changeLogs;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeChangeLogsResponseBody build() {
            return new DescribeChangeLogsResponseBody(this);
        } 

    } 

    public static class ChangeLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorSubType")
        private String creatorSubType;

        @com.aliyun.core.annotation.NameInMap("CreatorType")
        private String creatorType;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OperAction")
        private String operAction;

        @com.aliyun.core.annotation.NameInMap("OperIp")
        private String operIp;

        @com.aliyun.core.annotation.NameInMap("OperObject")
        private String operObject;

        @com.aliyun.core.annotation.NameInMap("OperTime")
        private String operTime;

        @com.aliyun.core.annotation.NameInMap("OperTimestamp")
        private Long operTimestamp;

        private ChangeLog(Builder builder) {
            this.content = builder.content;
            this.creatorId = builder.creatorId;
            this.creatorSubType = builder.creatorSubType;
            this.creatorType = builder.creatorType;
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.id = builder.id;
            this.operAction = builder.operAction;
            this.operIp = builder.operIp;
            this.operObject = builder.operObject;
            this.operTime = builder.operTime;
            this.operTimestamp = builder.operTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeLog create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorSubType
         */
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operAction
         */
        public String getOperAction() {
            return this.operAction;
        }

        /**
         * @return operIp
         */
        public String getOperIp() {
            return this.operIp;
        }

        /**
         * @return operObject
         */
        public String getOperObject() {
            return this.operObject;
        }

        /**
         * @return operTime
         */
        public String getOperTime() {
            return this.operTime;
        }

        /**
         * @return operTimestamp
         */
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public static final class Builder {
            private String content; 
            private String creatorId; 
            private String creatorSubType; 
            private String creatorType; 
            private String entityId; 
            private String entityName; 
            private Long id; 
            private String operAction; 
            private String operIp; 
            private String operObject; 
            private String operTime; 
            private Long operTimestamp; 

            /**
             * The details of the operation.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The operator ID.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The subtype of the operator. Valid values:
             * <p>
             * 
             * *   CUSTOMER: Alibaba Cloud account
             * *   SUB: RAM user
             * *   STS: assumed role that obtains the Security Token Service (STS) token of a RAM role
             * *   OTHER: other types
             */
            public Builder creatorSubType(String creatorSubType) {
                this.creatorSubType = creatorSubType;
                return this;
            }

            /**
             * The operator type. No value or **USER** is returned for this parameter.
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * The ID of the object on which the operation was performed.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The name of the object on which the operation was performed.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * The log ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The operation type.
             */
            public Builder operAction(String operAction) {
                this.operAction = operAction;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder operIp(String operIp) {
                this.operIp = operIp;
                return this;
            }

            /**
             * The type of the object on which the operation is performed.
             */
            public Builder operObject(String operObject) {
                this.operObject = operObject;
                return this;
            }

            /**
             * The time when the operation is performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder operTime(String operTime) {
                this.operTime = operTime;
                return this;
            }

            /**
             * The time when the operation was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder operTimestamp(Long operTimestamp) {
                this.operTimestamp = operTimestamp;
                return this;
            }

            public ChangeLog build() {
                return new ChangeLog(this);
            } 

        } 

    }
    public static class ChangeLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private java.util.List < ChangeLog> changeLog;

        private ChangeLogs(Builder builder) {
            this.changeLog = builder.changeLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeLogs create() {
            return builder().build();
        }

        /**
         * @return changeLog
         */
        public java.util.List < ChangeLog> getChangeLog() {
            return this.changeLog;
        }

        public static final class Builder {
            private java.util.List < ChangeLog> changeLog; 

            /**
             * ChangeLog.
             */
            public Builder changeLog(java.util.List < ChangeLog> changeLog) {
                this.changeLog = changeLog;
                return this;
            }

            public ChangeLogs build() {
                return new ChangeLogs(this);
            } 

        } 

    }
}
