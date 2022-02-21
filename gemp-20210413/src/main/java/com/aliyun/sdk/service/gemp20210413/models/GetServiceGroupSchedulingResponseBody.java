// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceGroupSchedulingResponseBody</p>
 */
public class GetServiceGroupSchedulingResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetServiceGroupSchedulingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSchedulingResponseBody create() {
        return builder().build();
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

        /**
         * 排班详情
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceGroupSchedulingResponseBody build() {
            return new GetServiceGroupSchedulingResponseBody(this);
        } 

    } 

    public static class SchedulingUsers extends TeaModel {
        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        private SchedulingUsers(Builder builder) {
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserName = builder.schedulingUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingUsers create() {
            return builder().build();
        }

        /**
         * @return schedulingOrder
         */
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        /**
         * @return schedulingUserId
         */
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        /**
         * @return schedulingUserName
         */
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        public static final class Builder {
            private Integer schedulingOrder; 
            private Long schedulingUserId; 
            private String schedulingUserName; 

            /**
             * 排班顺序
             */
            public Builder schedulingOrder(Integer schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * 轮班用户ID
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * 轮班用户名字
             */
            public Builder schedulingUserName(String schedulingUserName) {
                this.schedulingUserName = schedulingUserName;
                return this;
            }

            public SchedulingUsers build() {
                return new SchedulingUsers(this);
            } 

        } 

    }
    public static class FastScheduling extends TeaModel {
        @NameInMap("dutyPlan")
        private String dutyPlan;

        @NameInMap("id")
        private Long id;

        @NameInMap("schedulingUsers")
        private java.util.List < SchedulingUsers> schedulingUsers;

        @NameInMap("singleDuration")
        private Integer singleDuration;

        @NameInMap("singleDurationUnit")
        private String singleDurationUnit;

        private FastScheduling(Builder builder) {
            this.dutyPlan = builder.dutyPlan;
            this.id = builder.id;
            this.schedulingUsers = builder.schedulingUsers;
            this.singleDuration = builder.singleDuration;
            this.singleDurationUnit = builder.singleDurationUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FastScheduling create() {
            return builder().build();
        }

        /**
         * @return dutyPlan
         */
        public String getDutyPlan() {
            return this.dutyPlan;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return schedulingUsers
         */
        public java.util.List < SchedulingUsers> getSchedulingUsers() {
            return this.schedulingUsers;
        }

        /**
         * @return singleDuration
         */
        public Integer getSingleDuration() {
            return this.singleDuration;
        }

        /**
         * @return singleDurationUnit
         */
        public String getSingleDurationUnit() {
            return this.singleDurationUnit;
        }

        public static final class Builder {
            private String dutyPlan; 
            private Long id; 
            private java.util.List < SchedulingUsers> schedulingUsers; 
            private Integer singleDuration; 
            private String singleDurationUnit; 

            /**
             * 值班方案 dutyPlan FAST_CHOICE 快速选择   CUSTOM  自定义
             */
            public Builder dutyPlan(String dutyPlan) {
                this.dutyPlan = dutyPlan;
                return this;
            }

            /**
             * 快速排班ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 快速轮班用户
             */
            public Builder schedulingUsers(java.util.List < SchedulingUsers> schedulingUsers) {
                this.schedulingUsers = schedulingUsers;
                return this;
            }

            /**
             * 每人排班时长
             */
            public Builder singleDuration(Integer singleDuration) {
                this.singleDuration = singleDuration;
                return this;
            }

            /**
             * 每人排班时长单位 HOUR 小时 DAY 天
             */
            public Builder singleDurationUnit(String singleDurationUnit) {
                this.singleDurationUnit = singleDurationUnit;
                return this;
            }

            public FastScheduling build() {
                return new FastScheduling(this);
            } 

        } 

    }
    public static class SchedulingFineShifts extends TeaModel {
        @NameInMap("cycleOrder")
        private Long cycleOrder;

        @NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        @NameInMap("shiftName")
        private String shiftName;

        @NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingFineShifts(Builder builder) {
            this.cycleOrder = builder.cycleOrder;
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserName = builder.schedulingUserName;
            this.shiftName = builder.shiftName;
            this.skipOneDay = builder.skipOneDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingFineShifts create() {
            return builder().build();
        }

        /**
         * @return cycleOrder
         */
        public Long getCycleOrder() {
            return this.cycleOrder;
        }

        /**
         * @return schedulingEndTime
         */
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        /**
         * @return schedulingOrder
         */
        public Integer getSchedulingOrder() {
            return this.schedulingOrder;
        }

        /**
         * @return schedulingStartTime
         */
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        /**
         * @return schedulingUserId
         */
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        /**
         * @return schedulingUserName
         */
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        /**
         * @return shiftName
         */
        public String getShiftName() {
            return this.shiftName;
        }

        /**
         * @return skipOneDay
         */
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

        public static final class Builder {
            private Long cycleOrder; 
            private String schedulingEndTime; 
            private Integer schedulingOrder; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 
            private String schedulingUserName; 
            private String shiftName; 
            private Boolean skipOneDay; 

            /**
             * 循环次序
             */
            public Builder cycleOrder(Long cycleOrder) {
                this.cycleOrder = cycleOrder;
                return this;
            }

            /**
             * 排班结束时间
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * 排班顺序
             */
            public Builder schedulingOrder(Integer schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * 排班开始时间
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * 排班用户ID
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * 排班用户名字
             */
            public Builder schedulingUserName(String schedulingUserName) {
                this.schedulingUserName = schedulingUserName;
                return this;
            }

            /**
             * 班次名称
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            /**
             * 是否跨天
             */
            public Builder skipOneDay(Boolean skipOneDay) {
                this.skipOneDay = skipOneDay;
                return this;
            }

            public SchedulingFineShifts build() {
                return new SchedulingFineShifts(this);
            } 

        } 

    }
    public static class SchedulingTemplateFineShifts extends TeaModel {
        @NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @NameInMap("schedulingUserId")
        private String schedulingUserId;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        @NameInMap("shiftName")
        private String shiftName;

        @NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingTemplateFineShifts(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserName = builder.schedulingUserName;
            this.shiftName = builder.shiftName;
            this.skipOneDay = builder.skipOneDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingTemplateFineShifts create() {
            return builder().build();
        }

        /**
         * @return schedulingEndTime
         */
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        /**
         * @return schedulingOrder
         */
        public Long getSchedulingOrder() {
            return this.schedulingOrder;
        }

        /**
         * @return schedulingStartTime
         */
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        /**
         * @return schedulingUserId
         */
        public String getSchedulingUserId() {
            return this.schedulingUserId;
        }

        /**
         * @return schedulingUserName
         */
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        /**
         * @return shiftName
         */
        public String getShiftName() {
            return this.shiftName;
        }

        /**
         * @return skipOneDay
         */
        public Boolean getSkipOneDay() {
            return this.skipOneDay;
        }

        public static final class Builder {
            private String schedulingEndTime; 
            private Long schedulingOrder; 
            private String schedulingStartTime; 
            private String schedulingUserId; 
            private String schedulingUserName; 
            private String shiftName; 
            private Boolean skipOneDay; 

            /**
             * 排班结束时间
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * 排班顺序
             */
            public Builder schedulingOrder(Long schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * 排班开始时间
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * 用户ID
             */
            public Builder schedulingUserId(String schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * 排班用户名字
             */
            public Builder schedulingUserName(String schedulingUserName) {
                this.schedulingUserName = schedulingUserName;
                return this;
            }

            /**
             * 班次名称
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            /**
             * 是否跨天
             */
            public Builder skipOneDay(Boolean skipOneDay) {
                this.skipOneDay = skipOneDay;
                return this;
            }

            public SchedulingTemplateFineShifts build() {
                return new SchedulingTemplateFineShifts(this);
            } 

        } 

    }
    public static class FineScheduling extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("period")
        private Integer period;

        @NameInMap("periodUnit")
        private String periodUnit;

        @NameInMap("schedulingFineShifts")
        private java.util.List < SchedulingFineShifts> schedulingFineShifts;

        @NameInMap("schedulingTemplateFineShifts")
        private java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        @NameInMap("shiftType")
        private String shiftType;

        private FineScheduling(Builder builder) {
            this.id = builder.id;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.schedulingFineShifts = builder.schedulingFineShifts;
            this.schedulingTemplateFineShifts = builder.schedulingTemplateFineShifts;
            this.shiftType = builder.shiftType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FineScheduling create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return schedulingFineShifts
         */
        public java.util.List < SchedulingFineShifts> getSchedulingFineShifts() {
            return this.schedulingFineShifts;
        }

        /**
         * @return schedulingTemplateFineShifts
         */
        public java.util.List < SchedulingTemplateFineShifts> getSchedulingTemplateFineShifts() {
            return this.schedulingTemplateFineShifts;
        }

        /**
         * @return shiftType
         */
        public String getShiftType() {
            return this.shiftType;
        }

        public static final class Builder {
            private Long id; 
            private Integer period; 
            private String periodUnit; 
            private java.util.List < SchedulingFineShifts> schedulingFineShifts; 
            private java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts; 
            private String shiftType; 

            /**
             * 1
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 1
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * 循环周期单位 HOUR 小时 DAY 天
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * 精细排班班次人员信息
             */
            public Builder schedulingFineShifts(java.util.List < SchedulingFineShifts> schedulingFineShifts) {
                this.schedulingFineShifts = schedulingFineShifts;
                return this;
            }

            /**
             * 精细排班模版
             */
            public Builder schedulingTemplateFineShifts(java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts) {
                this.schedulingTemplateFineShifts = schedulingTemplateFineShifts;
                return this;
            }

            /**
             * 班次类型 MORNING_NIGHT 早晚班 MORNING_NOON_NIGHT 早中晚班 CUSTOM 自定义
             */
            public Builder shiftType(String shiftType) {
                this.shiftType = shiftType;
                return this;
            }

            public FineScheduling build() {
                return new FineScheduling(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("userId")
        private Long userId;

        @NameInMap("userName")
        private String userName;

        private Users(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long userId; 
            private String userName; 

            /**
             * 用户ID
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 用户名字
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("fastScheduling")
        private FastScheduling fastScheduling;

        @NameInMap("fineScheduling")
        private FineScheduling fineScheduling;

        @NameInMap("schedulingWay")
        private String schedulingWay;

        @NameInMap("serviceGroupId")
        private Long serviceGroupId;

        @NameInMap("users")
        private java.util.List < Users> users;

        private Data(Builder builder) {
            this.fastScheduling = builder.fastScheduling;
            this.fineScheduling = builder.fineScheduling;
            this.schedulingWay = builder.schedulingWay;
            this.serviceGroupId = builder.serviceGroupId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fastScheduling
         */
        public FastScheduling getFastScheduling() {
            return this.fastScheduling;
        }

        /**
         * @return fineScheduling
         */
        public FineScheduling getFineScheduling() {
            return this.fineScheduling;
        }

        /**
         * @return schedulingWay
         */
        public String getSchedulingWay() {
            return this.schedulingWay;
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private FastScheduling fastScheduling; 
            private FineScheduling fineScheduling; 
            private String schedulingWay; 
            private Long serviceGroupId; 
            private java.util.List < Users> users; 

            /**
             * 快速排班
             */
            public Builder fastScheduling(FastScheduling fastScheduling) {
                this.fastScheduling = fastScheduling;
                return this;
            }

            /**
             * 精细排班
             */
            public Builder fineScheduling(FineScheduling fineScheduling) {
                this.fineScheduling = fineScheduling;
                return this;
            }

            /**
             * 排班方式 FAST 快速排班 FINE 精细排班
             */
            public Builder schedulingWay(String schedulingWay) {
                this.schedulingWay = schedulingWay;
                return this;
            }

            /**
             * 服务组ID
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * 已经排班
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
