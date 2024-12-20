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
 * {@link DescribeIMRobotsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIMRobotsResponseBody</p>
 */
public class DescribeIMRobotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageBean")
    private PageBean pageBean;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned objects.</p>
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIMRobotsResponseBody build() {
            return new DescribeIMRobotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIMRobotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIMRobotsResponseBody</p>
     */
    public static class DispatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * <p>The ID of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Notification policy test</p>
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
    /**
     * 
     * {@link DescribeIMRobotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIMRobotsResponseBody</p>
     */
    public static class AlertIMRobots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DailyNoc")
        private Boolean dailyNoc;

        @com.aliyun.core.annotation.NameInMap("DailyNocTime")
        private String dailyNocTime;

        @com.aliyun.core.annotation.NameInMap("DingSignKey")
        private String dingSignKey;

        @com.aliyun.core.annotation.NameInMap("DispatchRules")
        private java.util.List<DispatchRules> dispatchRules;

        @com.aliyun.core.annotation.NameInMap("RobotAddr")
        private String robotAddr;

        @com.aliyun.core.annotation.NameInMap("RobotId")
        private Float robotId;

        @com.aliyun.core.annotation.NameInMap("RobotName")
        private String robotName;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<DispatchRules> getDispatchRules() {
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
            private java.util.List<DispatchRules> dispatchRules; 
            private String robotAddr; 
            private Float robotId; 
            private String robotName; 
            private String type; 

            /**
             * <p>The time when the IM chatbot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-16 17:21:48</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether daily statistics are sent. Valid values:</p>
             * <ul>
             * <li><code>false</code> (default): Daily statistics are not sent.</li>
             * <li><code>true</code>: Daily statistics are sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * <p>The point in time at which the daily statistics are sent. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.</p>
             * 
             * <strong>example:</strong>
             * <p>09:30,17:30</p>
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * <p>The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed by using the signature key. If you do not specify a signature key, a whitelist is used for authentication by default. The keyword of the whitelist is <strong>Alert</strong>.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder dingSignKey(String dingSignKey) {
                this.dingSignKey = dingSignKey;
                return this;
            }

            /**
             * <p>The notification policies.</p>
             */
            public Builder dispatchRules(java.util.List<DispatchRules> dispatchRules) {
                this.dispatchRules = dispatchRules;
                return this;
            }

            /**
             * <p>The webhook URL of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
             */
            public Builder robotAddr(String robotAddr) {
                this.robotAddr = robotAddr;
                return this;
            }

            /**
             * <p>The ID of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * <p>The name of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>Chatbot name</p>
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * <p>The type of the IM chatbot. Valid values:</p>
             * <ul>
             * <li><code>dingding</code>: DingTalk chatbot</li>
             * <li><code>wechat</code>: WeCom chatbot</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dingding</p>
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
    /**
     * 
     * {@link DescribeIMRobotsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIMRobotsResponseBody</p>
     */
    public static class PageBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertIMRobots")
        private java.util.List<AlertIMRobots> alertIMRobots;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<AlertIMRobots> getAlertIMRobots() {
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
            private java.util.List<AlertIMRobots> alertIMRobots; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The queried IM chatbots.</p>
             */
            public Builder alertIMRobots(java.util.List<AlertIMRobots> alertIMRobots) {
                this.alertIMRobots = alertIMRobots;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of IM chatbots returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of queried IM chatbots.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
