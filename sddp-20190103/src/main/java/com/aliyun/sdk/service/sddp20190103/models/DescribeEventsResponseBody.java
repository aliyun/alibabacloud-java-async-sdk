// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * <p>An array that consists of the anomalous events.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTime")
        private Long alertTime;

        @com.aliyun.core.annotation.NameInMap("Backed")
        private Boolean backed;

        @com.aliyun.core.annotation.NameInMap("DealDisplayName")
        private String dealDisplayName;

        @com.aliyun.core.annotation.NameInMap("DealLoginName")
        private String dealLoginName;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private Long dealTime;

        @com.aliyun.core.annotation.NameInMap("DealUserId")
        private Long dealUserId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("SubTypeCode")
        private String subTypeCode;

        @com.aliyun.core.annotation.NameInMap("SubTypeName")
        private String subTypeName;

        @com.aliyun.core.annotation.NameInMap("TargetProductCode")
        private String targetProductCode;

        @com.aliyun.core.annotation.NameInMap("TypeCode")
        private String typeCode;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("WarnLevel")
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
             * <p>The time when an alert was triggered for the anomalous event. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>154529000</p>
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
                return this;
            }

            /**
             * <p>Indicates whether the detection of anomalous events is enhanced. If the detection of anomalous events is enhanced, the detection accuracy and the rate of triggering alerts for anomalous events are improved. Valid values:</p>
             * <ul>
             * <li>true: yes</li>
             * <li>false: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder backed(Boolean backed) {
                this.backed = backed;
                return this;
            }

            /**
             * <p>The display name of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>yundunsr</p>
             */
            public Builder dealDisplayName(String dealDisplayName) {
                this.dealDisplayName = dealDisplayName;
                return this;
            }

            /**
             * <p>The username of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>det1111</p>
             */
            public Builder dealLoginName(String dealLoginName) {
                this.dealLoginName = dealLoginName;
                return this;
            }

            /**
             * <p>The time when the anomalous event was handled. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12223300</p>
             */
            public Builder dealTime(Long dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>The ID of the account that is used to handle the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>229157443385014***</p>
             */
            public Builder dealUserId(Long dealUserId) {
                this.dealUserId = dealUserId;
                return this;
            }

            /**
             * <p>The display name of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>yundunsr</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The time when the anomalous event occurred. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1545829129000</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The ID of the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>42233335555</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>det1111</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The name of the service in which the anomalous event was detected.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The handling status for the anomalous event. Valid values:</p>
             * <ul>
             * <li>0: unhandled</li>
             * <li>1: confirmed</li>
             * <li>2: marked as false positive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the handling status for the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * <p>The code of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>020008</p>
             */
            public Builder subTypeCode(String subTypeCode) {
                this.subTypeCode = subTypeCode;
                return this;
            }

            /**
             * <p>The name of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous volume of downloaded data</p>
             */
            public Builder subTypeName(String subTypeName) {
                this.subTypeName = subTypeName;
                return this;
            }

            /**
             * <p>The name of the destination service in an anomalous data flow.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder targetProductCode(String targetProductCode) {
                this.targetProductCode = targetProductCode;
                return this;
            }

            /**
             * <p>The code of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder typeCode(String typeCode) {
                this.typeCode = typeCode;
                return this;
            }

            /**
             * <p>The name of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous data flow</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            /**
             * <p>The ID of the account that triggered the anomalous event.</p>
             * 
             * <strong>example:</strong>
             * <p>1978132506596***</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The severity of the anomalous event.</p>
             * <ul>
             * <li><strong>1</strong>: low</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
