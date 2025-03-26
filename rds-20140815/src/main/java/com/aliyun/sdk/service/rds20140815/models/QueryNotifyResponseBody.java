// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryNotifyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94CB8D93-017A-5AE7-A118-6E0F89D93C0A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNotifyResponseBody build() {
            return new QueryNotifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNotifyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNotifyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NotifyItemList model) {
                this.aliUid = model.aliUid;
                this.confirmFlag = model.confirmFlag;
                this.confirmor = model.confirmor;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.idempotentCount = model.idempotentCount;
                this.idempotentId = model.idempotentId;
                this.level = model.level;
                this.notifyElement = model.notifyElement;
                this.templateName = model.templateName;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>22973492**********</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>Indicates whether the notification has been confirmed. You can call the <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> operation to mark the notification as confirmed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder confirmFlag(Boolean confirmFlag) {
                this.confirmFlag = confirmFlag;
                return this;
            }

            /**
             * <p>The UID of the contact who called the <a href="https://help.aliyun.com/document_detail/610444.html">ConfirmNotify</a> operation to mark the notification as confirmed. The contact belongs to the current Alibaba Cloud account.</p>
             * <p>The value <strong>0</strong> indicates that the notification is automatically confirmed by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder confirmor(Long confirmor) {
                this.confirmor = confirmor;
                return this;
            }

            /**
             * <p>The time when the notification was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-21T02:04:04Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the notification was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-21T02:10:47Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the notification.</p>
             * 
             * <strong>example:</strong>
             * <p>103499</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of times that repeatedly sent notifications are blocked.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder idempotentCount(String idempotentCount) {
                this.idempotentCount = idempotentCount;
                return this;
            }

            /**
             * <p>This parameter ensures the idempotence of the notification and prevents the notification from being repeatedly sent.</p>
             * 
             * <strong>example:</strong>
             * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
             */
            public Builder idempotentId(String idempotentId) {
                this.idempotentId = idempotentId;
                return this;
            }

            /**
             * <p>The level of the notification. Valid values:</p>
             * <ul>
             * <li><strong>help</strong></li>
             * <li><strong>success</strong></li>
             * <li><strong>warning</strong></li>
             * <li><strong>error</strong></li>
             * <li><strong>loading</strong></li>
             * <li><strong>notice</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The element in the notification template. This parameter is a JSON string. Fields in the JSON string vary based on the value of the <strong>TemplateName</strong> parameter.</p>
             * <ul>
             * <li><p>If the <strong>TemplateName</strong> parameter is <strong>RenewalRecommend</strong>, the JSON string contains the following fields:</p>
             * <ul>
             * <li><strong>instanceName</strong>: the ID of the instance that is about to expire</li>
             * <li><strong>reservedTime</strong>: the remaining validity period of the instance in days</li>
             * </ul>
             * </li>
             * <li><p>If the <strong>TemplateName</strong> parameter is <strong>InstanceCreateFailed</strong>, the JSON string contains the following fields:</p>
             * <ul>
             * <li><strong>orderId</strong>: the ID of the order to purchase the instance</li>
             * <li><strong>reason</strong>: the cause of the instance creation failure</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;orderId&quot;:21466**********}</p>
             */
            public Builder notifyElement(String notifyElement) {
                this.notifyElement = notifyElement;
                return this;
            }

            /**
             * <p>The template of the notification. Valid values:</p>
             * <ul>
             * <li><strong>RenewalRecommend</strong>: The template that is used to notify of renewal suggestions.</li>
             * <li><strong>InstanceCreateFailed</strong>: The template that is used to notify that an instance fails to be created and is refunded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceCreateFailed</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of the notification. Valid values:</p>
             * <ul>
             * <li><strong>Sell</strong>: sales notification</li>
             * <li><strong>Operation</strong>: O&amp;M notification</li>
             * <li><strong>Promotion</strong>: promotion notification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sell</p>
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
    /**
     * 
     * {@link QueryNotifyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNotifyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyItemList")
        private java.util.List<NotifyItemList> notifyItemList;

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
        public java.util.List<NotifyItemList> getNotifyItemList() {
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
            private java.util.List<NotifyItemList> notifyItemList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalRecordCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.notifyItemList = model.notifyItemList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalRecordCount = model.totalRecordCount;
            } 

            /**
             * <p>The details of notifications.</p>
             */
            public Builder notifyItemList(java.util.List<NotifyItemList> notifyItemList) {
                this.notifyItemList = notifyItemList;
                return this;
            }

            /**
             * <p>The page number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
