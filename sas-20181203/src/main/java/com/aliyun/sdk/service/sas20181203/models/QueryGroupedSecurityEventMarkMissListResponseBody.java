// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupedSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGroupedSecurityEventMarkMissListResponseBody</p>
 */
public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryGroupedSecurityEventMarkMissListResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupedSecurityEventMarkMissListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The subtype of the alert event.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBody build() {
            return new QueryGroupedSecurityEventMarkMissListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("DisposalWay")
        private String disposalWay;

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

        @NameInMap("Operate")
        private String operate;

        @NameInMap("Uuids")
        private String uuids;

        private List(Builder builder) {
            this.aliUid = builder.aliUid;
            this.disposalWay = builder.disposalWay;
            this.eventName = builder.eventName;
            this.eventNameOriginal = builder.eventNameOriginal;
            this.eventType = builder.eventType;
            this.eventTypeOriginal = builder.eventTypeOriginal;
            this.field = builder.field;
            this.fieldValue = builder.fieldValue;
            this.filedAliasName = builder.filedAliasName;
            this.operate = builder.operate;
            this.uuids = builder.uuids;
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
         * @return disposalWay
         */
        public String getDisposalWay() {
            return this.disposalWay;
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
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return uuids
         */
        public String getUuids() {
            return this.uuids;
        }

        public static final class Builder {
            private Long aliUid; 
            private String disposalWay; 
            private String eventName; 
            private String eventNameOriginal; 
            private String eventType; 
            private String eventTypeOriginal; 
            private String field; 
            private String fieldValue; 
            private String filedAliasName; 
            private String operate; 
            private String uuids; 

            /**
             * The handling method. Valid values:
             * <p>
             * 
             * *   **1**: Automatically Added to Whitelist
             * *   **2**: Defense Without Notification
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The alias of the field.
             */
            public Builder disposalWay(String disposalWay) {
                this.disposalWay = disposalWay;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The handling method. Valid values:
             * <p>
             * 
             * *   **auto_add_white**: Automatically Added to Whitelist
             * *   **defense_not_notification**: Defense Without Notification
             */
            public Builder eventNameOriginal(String eventNameOriginal) {
                this.eventNameOriginal = eventNameOriginal;
                return this;
            }

            /**
             * The condition that is used to query alert events by asset. You can specify a value of the following types:
             * <p>
             * 
             * *   The IP address of the asset.
             * *   The public IP address of the asset.
             * *   The private IP address of the asset.
             * *   The name of the asset.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The language of the content within the request and response. Default value: **zh**. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder eventTypeOriginal(String eventTypeOriginal) {
                this.eventTypeOriginal = eventTypeOriginal;
                return this;
            }

            /**
             * Unusual logon
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * The name of the alert event. The value indicates a subtype.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * The number of the page to return. Default value: **1**.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * The pagination information.
             */
            public Builder uuids(String uuids) {
                this.uuids = uuids;
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Queries whitelist rules.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * QueryGroupedSecurityEventMarkMissList
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
