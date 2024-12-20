// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link SearchAlertHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAlertHistoriesResponseBody</p>
 */
public class SearchAlertHistoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned struct.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FC13182-B9AF-4E6B-BE51-72669B7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchAlertHistoriesResponseBody build() {
            return new SearchAlertHistoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAlertHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertHistoriesResponseBody</p>
     */
    public static class AlarmHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmContent")
        private String alarmContent;

        @com.aliyun.core.annotation.NameInMap("AlarmResponseCode")
        private Integer alarmResponseCode;

        @com.aliyun.core.annotation.NameInMap("AlarmSources")
        private String alarmSources;

        @com.aliyun.core.annotation.NameInMap("AlarmTime")
        private Long alarmTime;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private Integer alarmType;

        @com.aliyun.core.annotation.NameInMap("Emails")
        private String emails;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Phones")
        private String phones;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
             * <p>The content of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Alert name: Alert1\nAlert time: 2020-07-24 12:14:00\nAlert content: A total of four alerts are triggered: ****&quot;</p>
             */
            public Builder alarmContent(String alarmContent) {
                this.alarmContent = alarmContent;
                return this;
            }

            /**
             * <p>The response code returned after the alert notification was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder alarmResponseCode(Integer alarmResponseCode) {
                this.alarmResponseCode = alarmResponseCode;
                return this;
            }

            /**
             * <p>The webhook URL, such as the webhook URL of a DingTalk chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f65002fefe0ab9b71e6590c5ca504348cad742ff01e9c8ab204439ca">https://oapi.dingtalk.com/robot/send?access_token=91f2f65002fefe0ab9b71e6590c5ca504348cad742ff01e9c8ab204439ca</a>****</p>
             */
            public Builder alarmSources(String alarmSources) {
                this.alarmSources = alarmSources;
                return this;
            }

            /**
             * <p>The time when the alert notification was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>1595564179000</p>
             */
            public Builder alarmTime(Long alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * <p>The type of the alert rule. Default value: 4. Valid values:</p>
             * <ul>
             * <li><code>1</code>: a custom alert rule that is used to monitor drill-down data sets</li>
             * <li><code>3</code>: a custom alert rule that is used to monitor tiled data sets</li>
             * <li><code>4</code>: an alert rule that is used to monitor web pages, including the default alert rule for browser monitoring</li>
             * <li><code>5</code>: an alert rule that is used to monitor applications, including the default alert rule for application monitoring</li>
             * <li><code>6</code>: the default alert rule for browser monitoring</li>
             * <li><code>7</code>: the default alert rule for application monitoring</li>
             * <li><code>8</code>: a Tracing Analysis alert rule</li>
             * <li><code>101</code>: a Prometheus alert rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder alarmType(Integer alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * <p>The email address of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * <p>The ID of the alert notification.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The mobile phone number of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phones(String phones) {
                this.phones = phones;
                return this;
            }

            /**
             * <p>The internal fields.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The internal fields.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>113197164949****</p>
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
    /**
     * 
     * {@link SearchAlertHistoriesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAlertHistoriesResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmHistories")
        private java.util.List<AlarmHistories> alarmHistories;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<AlarmHistories> getAlarmHistories() {
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
            private java.util.List<AlarmHistories> alarmHistories; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The information about alert records.</p>
             */
            public Builder alarmHistories(java.util.List<AlarmHistories> alarmHistories) {
                this.alarmHistories = alarmHistories;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
