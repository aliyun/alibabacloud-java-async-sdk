// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The operation logs.</p>
         */
        public Builder changeLogs(ChangeLogs changeLogs) {
            this.changeLogs = changeLogs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0FCB52A-D512-41A0-8595-40234EDCFD8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeChangeLogsResponseBody build() {
            return new DescribeChangeLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChangeLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChangeLogsResponseBody</p>
     */
    public static class ChangeLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorSubType")
        private String creatorSubType;

        @com.aliyun.core.annotation.NameInMap("CreatorType")
        private String creatorType;

        @com.aliyun.core.annotation.NameInMap("CreatorUserId")
        private String creatorUserId;

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
            this.creatorUserId = builder.creatorUserId;
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
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
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
            private String creatorUserId; 
            private String entityId; 
            private String entityName; 
            private Long id; 
            private String operAction; 
            private String operIp; 
            private String operObject; 
            private String operTime; 
            private Long operTimestamp; 

            /**
             * <p>The operation content.</p>
             * 
             * <strong>example:</strong>
             * <p>Add RR:test.03 Type:A Line:default TTL:300 Value:172.20.XX.XX</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The operator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>141339776561****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The subtype of the operator. Valid values:</p>
             * <ul>
             * <li>CUSTOMER: Alibaba Cloud account</li>
             * <li>SUB: RAM user</li>
             * <li>STS: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
             * <li>OTHER: other types</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUB</p>
             */
            public Builder creatorSubType(String creatorSubType) {
                this.creatorSubType = creatorSubType;
                return this;
            }

            /**
             * <p>The operator type. No value or <strong>USER</strong> is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
                return this;
            }

            /**
             * <p>The unique ID of the zone, user-defined line, forwarding rule, outbound endpoint, or inbound endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>df2d03865266bd9842306db586d3****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The name of the object on which the operation was performed, such as the domain name, user-defined line, cache retention domain name, forwarding rule, outbound endpoint, or inbound endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test-api.com</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>The ID of the operation log.</p>
             * 
             * <strong>example:</strong>
             * <p>90761578646770****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The specific operation performed on the object, such as adding, deleting, modifying, or associating the object.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operAction(String operAction) {
                this.operAction = operAction;
                return this;
            }

            /**
             * <p>The public IP address of the operator terminal. If the IP address of the operator terminal is a private IP address, the value of this parameter is the public IP address to which the private IP address is mapped after network address translation (NAT).</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder operIp(String operIp) {
                this.operIp = operIp;
                return this;
            }

            /**
             * <p>The type of the object on which the operation was performed. Valid values:</p>
             * <ul>
             * <li><strong>PV_ZONE</strong>: the built-in authoritative zone</li>
             * <li><strong>PV_RECORD</strong>: the DNS record</li>
             * <li><strong>RESOLVER_RULE</strong>: the forwarding rule</li>
             * <li><strong>CUSTOM_LINE</strong>: the user-defined line</li>
             * <li><strong>RESOLVER_ENDPOINT</strong>: the outbound endpoint</li>
             * <li><strong>INBOUND_ENDPOINT</strong>: the inbound endpoint</li>
             * <li><strong>CACHE_RESERVE_DOMAIN</strong>: the cache retention domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PV_ZONE</p>
             */
            public Builder operObject(String operObject) {
                this.operObject = operObject;
                return this;
            }

            /**
             * <p>The time when the operation is performed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-01-24T07:35Z</p>
             */
            public Builder operTime(String operTime) {
                this.operTime = operTime;
                return this;
            }

            /**
             * <p>The time when the operation was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1516779348000</p>
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
    /**
     * 
     * {@link DescribeChangeLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChangeLogsResponseBody</p>
     */
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
