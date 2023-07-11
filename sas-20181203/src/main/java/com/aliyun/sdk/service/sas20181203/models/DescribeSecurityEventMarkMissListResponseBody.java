// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventMarkMissListResponseBody</p>
 */
public class DescribeSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityEventMarkMissListResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventMarkMissListResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The ID of the rule.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityEventMarkMissListResponseBody build() {
            return new DescribeSecurityEventMarkMissListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventNameOriginal")
        private String eventNameOriginal;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("EventTypeOriginal")
        private String eventTypeOriginal;

        @NameInMap("Field")
        private String field;

        @NameInMap("FieldValue")
        private String fieldValue;

        @NameInMap("FiledAliasName")
        private String filedAliasName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Operate")
        private String operate;

        @NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.aliUid = builder.aliUid;
            this.eventName = builder.eventName;
            this.eventNameOriginal = builder.eventNameOriginal;
            this.eventType = builder.eventType;
            this.eventTypeOriginal = builder.eventTypeOriginal;
            this.field = builder.field;
            this.fieldValue = builder.fieldValue;
            this.filedAliasName = builder.filedAliasName;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.operate = builder.operate;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventNameOriginal
         */
        public String getEventNameOriginal() {
            return this.eventNameOriginal;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return eventTypeOriginal
         */
        public String getEventTypeOriginal() {
            return this.eventTypeOriginal;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        /**
         * @return filedAliasName
         */
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long aliUid; 
            private String eventName; 
            private String eventNameOriginal; 
            private String eventType; 
            private String eventTypeOriginal; 
            private String field; 
            private String fieldValue; 
            private String filedAliasName; 
            private Long id; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String operate; 
            private String uuid; 

            /**
             * The user ID.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The name of the alert event. The value indicates a subtype.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The name of the alert event. The value indicates a type.
             */
            public Builder eventNameOriginal(String eventNameOriginal) {
                this.eventNameOriginal = eventNameOriginal;
                return this;
            }

            /**
             * The subtype of the alert event.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The type of the alert event.
             */
            public Builder eventTypeOriginal(String eventTypeOriginal) {
                this.eventTypeOriginal = eventTypeOriginal;
                return this;
            }

            /**
             * The field that is used in the whitelist rule.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * The value of the field.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * The alias of the field.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The operator. Valid values:
             * <p>
             * 
             * - **contains**: contains
             * - **notContains**: does not contain
             * - **strEqual**: equals
             * - **strNotEqual**: does not equal
             * - **regex**: regular expression
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page. Default value: **20**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
