// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeFailedNotificationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFailedNotificationsResponseBody</p>
 */
public class DescribeFailedNotificationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotificationList")
    private java.util.List<NotificationList> notificationList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFailedNotificationsResponseBody(Builder builder) {
        this.notificationList = builder.notificationList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFailedNotificationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notificationList
     */
    public java.util.List<NotificationList> getNotificationList() {
        return this.notificationList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<NotificationList> notificationList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFailedNotificationsResponseBody model) {
            this.notificationList = model.notificationList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The notification list.</p>
         */
        public Builder notificationList(java.util.List<NotificationList> notificationList) {
            this.notificationList = notificationList;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instances per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFailedNotificationsResponseBody build() {
            return new DescribeFailedNotificationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFailedNotificationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFailedNotificationsResponseBody</p>
     */
    public static class NotificationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NotificationRequestId")
        private String notificationRequestId;

        private NotificationList(Builder builder) {
            this.action = builder.action;
            this.createTime = builder.createTime;
            this.message = builder.message;
            this.notificationRequestId = builder.notificationRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return notificationRequestId
         */
        public String getNotificationRequestId() {
            return this.notificationRequestId;
        }

        public static final class Builder {
            private String action; 
            private Long createTime; 
            private String message; 
            private String notificationRequestId; 

            private Builder() {
            } 

            private Builder(NotificationList model) {
                this.action = model.action;
                this.createTime = model.createTime;
                this.message = model.message;
                this.notificationRequestId = model.notificationRequestId;
            } 

            /**
             * <p>The operation event.</p>
             * 
             * <strong>example:</strong>
             * <p>orderPay</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1665988512000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The notification message body in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;productCode&quot;:&quot;cmgj00001&quot;,&quot;orderId&quot;:&quot;123456&quot;,&quot;orderBizId&quot;:&quot;111222&quot;,&quot;action&quot;:&quot;orderPay&quot;,&quot;aliUid&quot;:&quot;12211222211&quot;,&quot;skuId&quot;:&quot;cmgj00001-prepay&quot;}</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The notification request ID (generated by UUID), used for idempotence.</p>
             * 
             * <strong>example:</strong>
             * <p>deab3673236843a3b378c7d8d25c5f01</p>
             */
            public Builder notificationRequestId(String notificationRequestId) {
                this.notificationRequestId = notificationRequestId;
                return this;
            }

            public NotificationList build() {
                return new NotificationList(this);
            } 

        } 

    }
}
