// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertHistoriesResponseBody</p>
 */
public class SearchAlertHistoriesResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private SearchAlertHistoriesResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertHistoriesResponseBody create() {
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

        public SearchAlertHistoriesResponseBody build() {
            return new SearchAlertHistoriesResponseBody(this);
        } 

    } 

    public static class AlarmHistories extends TeaModel {
        @NameInMap("AlarmContent")
        private String alarmContent;

        @NameInMap("AlarmResponseCode")
        private Integer alarmResponseCode;

        @NameInMap("AlarmSources")
        private String alarmSources;

        @NameInMap("AlarmTime")
        private Long alarmTime;

        @NameInMap("AlarmType")
        private Integer alarmType;

        @NameInMap("Emails")
        private String emails;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Phones")
        private String phones;

        @NameInMap("StrategyId")
        private String strategyId;

        @NameInMap("Target")
        private String target;

        @NameInMap("UserId")
        private String userId;

        private AlarmHistories(Builder builder) {
            this.alarmContent = builder.alarmContent;
            this.alarmResponseCode = builder.alarmResponseCode;
            this.alarmSources = builder.alarmSources;
            this.alarmTime = builder.alarmTime;
            this.alarmType = builder.alarmType;
            this.emails = builder.emails;
            this.id = builder.id;
            this.phones = builder.phones;
            this.strategyId = builder.strategyId;
            this.target = builder.target;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmHistories create() {
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
        public Integer getAlarmResponseCode() {
            return this.alarmResponseCode;
        }

        /**
         * @return alarmSources
         */
        public String getAlarmSources() {
            return this.alarmSources;
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
         * @return emails
         */
        public String getEmails() {
            return this.emails;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return phones
         */
        public String getPhones() {
            return this.phones;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String alarmContent; 
            private Integer alarmResponseCode; 
            private String alarmSources; 
            private Long alarmTime; 
            private Integer alarmType; 
            private String emails; 
            private Long id; 
            private String phones; 
            private String strategyId; 
            private String target; 
            private String userId; 

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
            public Builder alarmResponseCode(Integer alarmResponseCode) {
                this.alarmResponseCode = alarmResponseCode;
                return this;
            }

            /**
             * AlarmSources.
             */
            public Builder alarmSources(String alarmSources) {
                this.alarmSources = alarmSources;
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
             * Emails.
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AlarmHistories build() {
                return new AlarmHistories(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("AlarmHistories")
        private java.util.List < AlarmHistories> alarmHistories;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageBean(Builder builder) {
            this.alarmHistories = builder.alarmHistories;
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
         * @return alarmHistories
         */
        public java.util.List < AlarmHistories> getAlarmHistories() {
            return this.alarmHistories;
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
            private java.util.List < AlarmHistories> alarmHistories; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * AlarmHistories.
             */
            public Builder alarmHistories(java.util.List < AlarmHistories> alarmHistories) {
                this.alarmHistories = alarmHistories;
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
