// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGroupedSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGroupedSecurityEventMarkMissListResponseBody</p>
 */
public class QueryGroupedSecurityEventMarkMissListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>An array that consists of the whitelist rules.</p>
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>There was an error with your request.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>965F9282-D403-4FA2-B1B9-10F62DC719BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryGroupedSecurityEventMarkMissListResponseBody build() {
            return new QueryGroupedSecurityEventMarkMissListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGroupedSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGroupedSecurityEventMarkMissListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("DisposalWay")
        private String disposalWay;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventNameOriginal")
        private String eventNameOriginal;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("EventTypeOriginal")
        private String eventTypeOriginal;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("FiledAliasName")
        private String filedAliasName;

        @com.aliyun.core.annotation.NameInMap("Operate")
        private String operate;

        @com.aliyun.core.annotation.NameInMap("Uuids")
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
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>31412647</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The handling method. Valid values:</p>
             * <ul>
             * <li><strong>auto_add_white</strong>: Automatically Added to Whitelist</li>
             * <li><strong>defense_not_notification</strong>: Defense Without Notification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto_add_white</p>
             */
            public Builder disposalWay(String disposalWay) {
                this.disposalWay = disposalWay;
                return this;
            }

            /**
             * <p>The name of the alert event. The value indicates a subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Login with unusual location</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The name of the alert event. The value indicates a type.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_location</p>
             */
            public Builder eventNameOriginal(String eventNameOriginal) {
                this.eventNameOriginal = eventNameOriginal;
                return this;
            }

            /**
             * <p>The subtype of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The type of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual logon</p>
             */
            public Builder eventTypeOriginal(String eventTypeOriginal) {
                this.eventTypeOriginal = eventTypeOriginal;
                return this;
            }

            /**
             * <p>The field that is used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The value of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * <p>The alias of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Logon Time</p>
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * <p>The operator. Valid values:</p>
             * <ul>
             * <li><strong>contains</strong>: contains</li>
             * <li><strong>notContains</strong>: does not contain</li>
             * <li><strong>strEqual</strong>: equals</li>
             * <li><strong>strNotEqual</strong>: does not equal</li>
             * <li><strong>regex</strong>: regular expression</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * <p>The UUIDs of assets. Multiple UUIDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>6985b88c-eb19-4d27-98ad-e4a42312****,5721d503-9b04-4243-89ca-1fb8ca5e****,db2678c3-10e3-4a20-92f1-265f6****</p>
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
    /**
     * 
     * {@link QueryGroupedSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGroupedSecurityEventMarkMissListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
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
