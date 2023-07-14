// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIMRobotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIMRobotsResponseBody</p>
 */
public class DescribeIMRobotsResponseBody extends TeaModel {
    @NameInMap("PageBean")
    private PageBean pageBean;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIMRobotsResponseBody(Builder builder) {
        this.pageBean = builder.pageBean;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIMRobotsResponseBody create() {
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
         * The returned objects.
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIMRobotsResponseBody build() {
            return new DescribeIMRobotsResponseBody(this);
        } 

    } 

    public static class DispatchRules extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        private DispatchRules(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DispatchRules create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * The ID of the notification policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the notification policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DispatchRules build() {
                return new DispatchRules(this);
            } 

        } 

    }
    public static class AlertIMRobots extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DailyNoc")
        private Boolean dailyNoc;

        @NameInMap("DailyNocTime")
        private String dailyNocTime;

        @NameInMap("DingSignKey")
        private String dingSignKey;

        @NameInMap("DispatchRules")
        private java.util.List < DispatchRules> dispatchRules;

        @NameInMap("RobotAddr")
        private String robotAddr;

        @NameInMap("RobotId")
        private Float robotId;

        @NameInMap("RobotName")
        private String robotName;

        @NameInMap("Type")
        private String type;

        private AlertIMRobots(Builder builder) {
            this.createTime = builder.createTime;
            this.dailyNoc = builder.dailyNoc;
            this.dailyNocTime = builder.dailyNocTime;
            this.dingSignKey = builder.dingSignKey;
            this.dispatchRules = builder.dispatchRules;
            this.robotAddr = builder.robotAddr;
            this.robotId = builder.robotId;
            this.robotName = builder.robotName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertIMRobots create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dailyNoc
         */
        public Boolean getDailyNoc() {
            return this.dailyNoc;
        }

        /**
         * @return dailyNocTime
         */
        public String getDailyNocTime() {
            return this.dailyNocTime;
        }

        /**
         * @return dingSignKey
         */
        public String getDingSignKey() {
            return this.dingSignKey;
        }

        /**
         * @return dispatchRules
         */
        public java.util.List < DispatchRules> getDispatchRules() {
            return this.dispatchRules;
        }

        /**
         * @return robotAddr
         */
        public String getRobotAddr() {
            return this.robotAddr;
        }

        /**
         * @return robotId
         */
        public Float getRobotId() {
            return this.robotId;
        }

        /**
         * @return robotName
         */
        public String getRobotName() {
            return this.robotName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean dailyNoc; 
            private String dailyNocTime; 
            private String dingSignKey; 
            private java.util.List < DispatchRules> dispatchRules; 
            private String robotAddr; 
            private Float robotId; 
            private String robotName; 
            private String type; 

            /**
             * The time when the IM chatbot was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether daily statistics are sent. Valid values:
             * <p>
             * 
             * *   `false` (default): Daily statistics are not sent.
             * *   `true`: Daily statistics are sent.
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * The point in time at which the daily statistics are sent. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed by using the signature key. If you do not specify a signature key, a whitelist is used for authentication by default. The keyword of the whitelist is **Alert**.
             */
            public Builder dingSignKey(String dingSignKey) {
                this.dingSignKey = dingSignKey;
                return this;
            }

            /**
             * The notification policies.
             */
            public Builder dispatchRules(java.util.List < DispatchRules> dispatchRules) {
                this.dispatchRules = dispatchRules;
                return this;
            }

            /**
             * The webhook URL of the IM chatbot.
             */
            public Builder robotAddr(String robotAddr) {
                this.robotAddr = robotAddr;
                return this;
            }

            /**
             * The ID of the IM chatbot.
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * The name of the IM chatbot.
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * The type of the IM chatbot. Valid values:
             * <p>
             * 
             * *   `dingding`: DingTalk chatbot
             * *   `wechat`: WeCom chatbot
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlertIMRobots build() {
                return new AlertIMRobots(this);
            } 

        } 

    }
    public static class PageBean extends TeaModel {
        @NameInMap("AlertIMRobots")
        private java.util.List < AlertIMRobots> alertIMRobots;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
        private Long total;

        private PageBean(Builder builder) {
            this.alertIMRobots = builder.alertIMRobots;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageBean create() {
            return builder().build();
        }

        /**
         * @return alertIMRobots
         */
        public java.util.List < AlertIMRobots> getAlertIMRobots() {
            return this.alertIMRobots;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < AlertIMRobots> alertIMRobots; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * The queried IM chatbots.
             */
            public Builder alertIMRobots(java.util.List < AlertIMRobots> alertIMRobots) {
                this.alertIMRobots = alertIMRobots;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The number of IM chatbots returned per page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of queried IM chatbots.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageBean build() {
                return new PageBean(this);
            } 

        } 

    }
}
