// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNotifyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNotifyResponseBody</p>
 */
public class QueryNotifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryNotifyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNotifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNotifyResponseBody build() {
            return new QueryNotifyResponseBody(this);
        } 

    } 

    public static class NotifyItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ConfirmFlag")
        private Boolean confirmFlag;

        @com.aliyun.core.annotation.NameInMap("Confirmor")
        private Long confirmor;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdempotentCount")
        private String idempotentCount;

        @com.aliyun.core.annotation.NameInMap("IdempotentId")
        private String idempotentId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("NotifyElement")
        private String notifyElement;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NotifyItemList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.confirmFlag = builder.confirmFlag;
            this.confirmor = builder.confirmor;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.idempotentCount = builder.idempotentCount;
            this.idempotentId = builder.idempotentId;
            this.level = builder.level;
            this.notifyElement = builder.notifyElement;
            this.templateName = builder.templateName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyItemList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return confirmFlag
         */
        public Boolean getConfirmFlag() {
            return this.confirmFlag;
        }

        /**
         * @return confirmor
         */
        public Long getConfirmor() {
            return this.confirmor;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idempotentCount
         */
        public String getIdempotentCount() {
            return this.idempotentCount;
        }

        /**
         * @return idempotentId
         */
        public String getIdempotentId() {
            return this.idempotentId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return notifyElement
         */
        public String getNotifyElement() {
            return this.notifyElement;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long aliUid; 
            private Boolean confirmFlag; 
            private Long confirmor; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String idempotentCount; 
            private String idempotentId; 
            private String level; 
            private String notifyElement; 
            private String templateName; 
            private String type; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Indicates whether the notification has been confirmed. You can call the [ConfirmNotify](~~610444~~) operation to mark the notification as confirmed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder confirmFlag(Boolean confirmFlag) {
                this.confirmFlag = confirmFlag;
                return this;
            }

            /**
             * The UID of the contact who called the [ConfirmNotify](~~610444~~) operation to mark the notification as confirmed. The contact belongs to the current Alibaba Cloud account.
             * <p>
             * 
             * The value **0** indicates that the notification is automatically confirmed by the system.
             */
            public Builder confirmor(Long confirmor) {
                this.confirmor = confirmor;
                return this;
            }

            /**
             * The time when the notification was created.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The time when the notification was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the notification.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of times that repeatedly sent notifications are blocked.
             */
            public Builder idempotentCount(String idempotentCount) {
                this.idempotentCount = idempotentCount;
                return this;
            }

            /**
             * This parameter ensures the idempotence of the notification and prevents the notification from being repeatedly sent.
             */
            public Builder idempotentId(String idempotentId) {
                this.idempotentId = idempotentId;
                return this;
            }

            /**
             * The level of the notification. Valid values:
             * <p>
             * 
             * *   **help**
             * *   **success**
             * *   **warning**
             * *   **error**
             * *   **loading**
             * *   **notice**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The element in the notification template. This parameter is a JSON string. Fields in the JSON string vary based on the value of the **TemplateName** parameter.
             * <p>
             * 
             * *   If the **TemplateName** parameter is **RenewalRecommend**, the JSON string contains the following fields:
             * 
             *     *   **instanceName**: the ID of the instance that is about to expire
             *     *   **reservedTime**: the remaining validity period of the instance in days
             * 
             * *   If the **TemplateName** parameter is **InstanceCreateFailed**, the JSON string contains the following fields:
             * 
             *     *   **orderId**: the ID of the order to purchase the instance
             *     *   **reason**: the cause of the instance creation failure
             */
            public Builder notifyElement(String notifyElement) {
                this.notifyElement = notifyElement;
                return this;
            }

            /**
             * The template of the notification. Valid values:
             * <p>
             * 
             * *   **RenewalRecommend**: The template that is used to notify of renewal suggestions.
             * *   **InstanceCreateFailed**: The template that is used to notify that an instance fails to be created and is refunded.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The type of the notification. Valid values:
             * <p>
             * 
             * *   **Sell**: sales notification
             * *   **Operation**: O\&M notification
             * *   **Promotion**: promotion notification
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NotifyItemList build() {
                return new NotifyItemList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyItemList")
        private java.util.List < NotifyItemList> notifyItemList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
        private Integer totalRecordCount;

        private Data(Builder builder) {
            this.notifyItemList = builder.notifyItemList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalRecordCount = builder.totalRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return notifyItemList
         */
        public java.util.List < NotifyItemList> getNotifyItemList() {
            return this.notifyItemList;
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
         * @return totalRecordCount
         */
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

        public static final class Builder {
            private java.util.List < NotifyItemList> notifyItemList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalRecordCount; 

            /**
             * The details of notifications.
             */
            public Builder notifyItemList(java.util.List < NotifyItemList> notifyItemList) {
                this.notifyItemList = notifyItemList;
                return this;
            }

            /**
             * The page number of the page returned.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalRecordCount(Integer totalRecordCount) {
                this.totalRecordCount = totalRecordCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
