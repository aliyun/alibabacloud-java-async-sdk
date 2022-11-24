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
         * 分页对象
         */
        public Builder pageBean(PageBean pageBean) {
            this.pageBean = pageBean;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIMRobotsResponseBody build() {
            return new DescribeIMRobotsResponseBody(this);
        } 

    } 

    public static class AlertIMRobots extends TeaModel {
        @NameInMap("DailyNoc")
        private Boolean dailyNoc;

        @NameInMap("DailyNocTime")
        private String dailyNocTime;

        @NameInMap("DingSignKey")
        private String dingSignKey;

        @NameInMap("RobotAddr")
        private String robotAddr;

        @NameInMap("RobotId")
        private Float robotId;

        @NameInMap("RobotName")
        private String robotName;

        @NameInMap("Type")
        private String type;

        private AlertIMRobots(Builder builder) {
            this.dailyNoc = builder.dailyNoc;
            this.dailyNocTime = builder.dailyNocTime;
            this.dingSignKey = builder.dingSignKey;
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
            private Boolean dailyNoc; 
            private String dailyNocTime; 
            private String dingSignKey; 
            private String robotAddr; 
            private Float robotId; 
            private String robotName; 
            private String type; 

            /**
             * 是否发送每日统计信息
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * 每日统计发送时间
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * DingSignKey.
             */
            public Builder dingSignKey(String dingSignKey) {
                this.dingSignKey = dingSignKey;
                return this;
            }

            /**
             * 告警机器人地址
             */
            public Builder robotAddr(String robotAddr) {
                this.robotAddr = robotAddr;
                return this;
            }

            /**
             * 告警机器人ID
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * 告警机器人名称
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * 告警机器人类型
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
             * AlertIMRobots.
             */
            public Builder alertIMRobots(java.util.List < AlertIMRobots> alertIMRobots) {
                this.alertIMRobots = alertIMRobots;
                return this;
            }

            /**
             * 页数
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * 每一页数目
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * 总数
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
