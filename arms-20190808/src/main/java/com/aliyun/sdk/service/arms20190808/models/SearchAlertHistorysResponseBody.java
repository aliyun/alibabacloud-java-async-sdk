// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertHistorysResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertHistorysResponseBody</p>
 */
public class SearchAlertHistorysResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private SearchAlertHistorysResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertHistorysResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageBean
     */
    public PageBean getPageBean() {
        return this.pageBean;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageBean pageBean; 
        private String requestId; 

        /**
         * PageBean.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertHistorysResponseBody build() {
            return new SearchAlertHistorysResponseBody(this);
        } 

    } 

    public static class AlertHistory extends TeaModel {
        @NameInMap("AlarmContent")
        private String alarmContent;

        @NameInMap("AlarmResponseCode")
        private String alarmResponseCode;

        @NameInMap("AlarmTime")
        private Long alarmTime;

        @NameInMap("AlarmType")
        private Integer alarmType;

        @NameInMap("AlertId")
        private Long alertId;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Phones")
        private String phones;

        @NameInMap("Tenant")
        private String tenant;

        private AlertHistory(Builder builder) {
            this.alarmContent = builder.alarmContent;
            this.alarmResponseCode = builder.alarmResponseCode;
            this.alarmTime = builder.alarmTime;
            this.alarmType = builder.alarmType;
            this.alertId = builder.alertId;
            this.id = builder.id;
            this.phones = builder.phones;
            this.tenant = builder.tenant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertHistory create() {
            return builder().build();
        }

        /**
         * @return alarmContent
         */
        public String getAlarmContent() {
            return this.alarmContent;
        }

        /**
         * @return alarmResponseCode
         */
        public String getAlarmResponseCode() {
            return this.alarmResponseCode;
        }

        /**
         * @return alarmTime
         */
        public Long getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return alarmType
         */
        public Integer getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return alertId
         */
        public Long getAlertId() {
            return this.alertId;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return phones
         */
        public String getPhones() {
            return this.phones;
        }

        /**
         * @return tenant
         */
        public String getTenant() {
            return this.tenant;
        }

        public static final class Builder {
            private String alarmContent; 
            private String alarmResponseCode; 
            private Long alarmTime; 
            private Integer alarmType; 
            private Long alertId; 
            private Integer id; 
            private String phones; 
            private String tenant; 

            /**
             * AlarmContent.
             */
            public Builder alarmContent(String alarmContent) {
                this.alarmContent = alarmContent;
                return this;
            }

            /**
             * AlarmResponseCode.
             */
            public Builder alarmResponseCode(String alarmResponseCode) {
                this.alarmResponseCode = alarmResponseCode;
                return this;
            }

            /**
             * AlarmTime.
             */
            public Builder alarmTime(Long alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(Integer alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * AlertId.
             */
            public Builder alertId(Long alertId) {
                this.alertId = alertId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Phones.
             */
            public Builder phones(String phones) {
                this.phones = phones;
                return this;
            }

            /**
             * Tenant.
             */
            public Builder tenant(String tenant) {
                this.tenant = tenant;
                return this;
            }

            public AlertHistory build() {
                return new AlertHistory(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("AlertHistory")
        private java.util.List < AlertHistory> alertHistory;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageBean(Builder builder) {
            this.alertHistory = builder.alertHistory;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return alertHistory
         */
        public java.util.List < AlertHistory> getAlertHistory() {
            return this.alertHistory;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AlertHistory> alertHistory; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * AlertHistory.
             */
            public Builder alertHistory(java.util.List < AlertHistory> alertHistory) {
                this.alertHistory = alertHistory;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
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

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
