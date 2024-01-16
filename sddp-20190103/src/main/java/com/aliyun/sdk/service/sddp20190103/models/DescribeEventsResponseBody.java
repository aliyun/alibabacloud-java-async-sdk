// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array that consists of the anomalous events.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("Backed")
        private Boolean backed;

        @NameInMap("DealDisplayName")
        private String dealDisplayName;

        @NameInMap("DealLoginName")
        private String dealLoginName;

        @NameInMap("DealTime")
        private Long dealTime;

        @NameInMap("DealUserId")
        private Long dealUserId;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EventTime")
        private Long eventTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SubTypeCode")
        private String subTypeCode;

        @NameInMap("SubTypeName")
        private String subTypeName;

        @NameInMap("TargetProductCode")
        private String targetProductCode;

        @NameInMap("TypeCode")
        private String typeCode;

        @NameInMap("TypeName")
        private String typeName;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("WarnLevel")
        private Integer warnLevel;

        private Items(Builder builder) {
            this.alertTime = builder.alertTime;
            this.backed = builder.backed;
            this.dealDisplayName = builder.dealDisplayName;
            this.dealLoginName = builder.dealLoginName;
            this.dealTime = builder.dealTime;
            this.dealUserId = builder.dealUserId;
            this.displayName = builder.displayName;
            this.eventTime = builder.eventTime;
            this.id = builder.id;
            this.loginName = builder.loginName;
            this.productCode = builder.productCode;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.subTypeCode = builder.subTypeCode;
            this.subTypeName = builder.subTypeName;
            this.targetProductCode = builder.targetProductCode;
            this.typeCode = builder.typeCode;
            this.typeName = builder.typeName;
            this.userId = builder.userId;
            this.warnLevel = builder.warnLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
        }

        /**
         * @return backed
         */
        public Boolean getBacked() {
            return this.backed;
        }

        /**
         * @return dealDisplayName
         */
        public String getDealDisplayName() {
            return this.dealDisplayName;
        }

        /**
         * @return dealLoginName
         */
        public String getDealLoginName() {
            return this.dealLoginName;
        }

        /**
         * @return dealTime
         */
        public Long getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealUserId
         */
        public Long getDealUserId() {
            return this.dealUserId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return subTypeCode
         */
        public String getSubTypeCode() {
            return this.subTypeCode;
        }

        /**
         * @return subTypeName
         */
        public String getSubTypeName() {
            return this.subTypeName;
        }

        /**
         * @return targetProductCode
         */
        public String getTargetProductCode() {
            return this.targetProductCode;
        }

        /**
         * @return typeCode
         */
        public String getTypeCode() {
            return this.typeCode;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return warnLevel
         */
        public Integer getWarnLevel() {
            return this.warnLevel;
        }

        public static final class Builder {
            private Long alertTime; 
            private Boolean backed; 
            private String dealDisplayName; 
            private String dealLoginName; 
            private Long dealTime; 
            private Long dealUserId; 
            private String displayName; 
            private Long eventTime; 
            private Long id; 
            private String loginName; 
            private String productCode; 
            private Integer status; 
            private String statusName; 
            private String subTypeCode; 
            private String subTypeName; 
            private String targetProductCode; 
            private String typeCode; 
            private String typeName; 
            private Long userId; 
            private Integer warnLevel; 

            /**
             * The time when an alert was triggered for the anomalous event. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * Indicates whether the detection of anomalous events is enhanced. If the detection of anomalous events is enhanced, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:
             * <p>
             * 
             * *   true: yes
             * *   false: no
             */
            public Builder backed(Boolean backed) {
                this.backed = backed;
                return this;
            }

            /**
             * The display name of the account that is used to handle the anomalous event.
             */
            public Builder dealDisplayName(String dealDisplayName) {
                this.dealDisplayName = dealDisplayName;
                return this;
            }

            /**
             * The username of the account that is used to handle the anomalous event.
             */
            public Builder dealLoginName(String dealLoginName) {
                this.dealLoginName = dealLoginName;
                return this;
            }

            /**
             * The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * The ID of the account that is used to handle the anomalous event.
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * The display name of the account that triggered the anomalous event.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * The ID of the anomalous event.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The username of the account that triggered the anomalous event.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * The name of the service in which the anomalous event was detected.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The handling status for the anomalous event. Valid values:
             * <p>
             * 
             * *   0: unhandled
             * *   1: confirmed
             * *   2: marked as false positive
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the handling status for the anomalous event.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * The code of the anomalous event subtype.
             */
            public Builder subTypeCode(String subTypeCode) {
                this.subTypeCode = subTypeCode;
                return this;
            }

            /**
             * The name of the anomalous event subtype.
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            /**
             * The name of the destination service in an anomalous data flow.
             */
            public Builder targetProductCode(String targetProductCode) {
                this.targetProductCode = targetProductCode;
                return this;
            }

            /**
             * The code of the anomalous event type.
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * The name of the anomalous event type.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * The ID of the account that triggered the anomalous event.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The severity of the anomalous event.
             * <p>
             * 
             * *   **1**: low
             * *   **2**: medium
             * *   **3**: high
             */
            public Builder warnLevel(Integer warnLevel) {
                this.warnLevel = warnLevel;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
