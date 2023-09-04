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
         * data.
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
        @NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        private SchedulingUsers(Builder builder) {
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
            this.schedulingUserName = builder.schedulingUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingUsers create() {
            return builder().build();
        }

        /**
         * @return schedulingObjectType
         */
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
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
         * @return schedulingUserIdList
         */
        public java.util.List < Long > getSchedulingUserIdList() {
            return this.schedulingUserIdList;
        }

        /**
         * @return schedulingUserName
         */
        public String getSchedulingUserName() {
            return this.schedulingUserName;
        }

        public static final class Builder {
            private String schedulingObjectType; 
            private Integer schedulingOrder; 
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 
            private String schedulingUserName; 

            /**
             * schedulingObjectType.
             */
            public Builder schedulingObjectType(String schedulingObjectType) {
                this.schedulingObjectType = schedulingObjectType;
                return this;
            }

            /**
             * schedulingOrder.
             */
            public Builder schedulingOrder(Integer schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * schedulingUserId.
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * schedulingUserIdList.
             */
            public Builder schedulingUserIdList(java.util.List < Long > schedulingUserIdList) {
                this.schedulingUserIdList = schedulingUserIdList;
                return this;
            }

            /**
             * schedulingUserName.
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
             * dutyPlan.
             */
            public Builder dutyPlan(String dutyPlan) {
                this.dutyPlan = dutyPlan;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * schedulingUsers.
             */
            public Builder schedulingUsers(java.util.List < SchedulingUsers> schedulingUsers) {
                this.schedulingUsers = schedulingUsers;
                return this;
            }

            /**
             * singleDuration.
             */
            public Builder singleDuration(Integer singleDuration) {
                this.singleDuration = singleDuration;
                return this;
            }

            /**
             * singleDurationUnit.
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

        @NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        @NameInMap("shiftName")
        private String shiftName;

        @NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingFineShifts(Builder builder) {
            this.cycleOrder = builder.cycleOrder;
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
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
         * @return schedulingObjectType
         */
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
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
         * @return schedulingUserIdList
         */
        public java.util.List < Long > getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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
            private String schedulingObjectType; 
            private Integer schedulingOrder; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 
            private String schedulingUserName; 
            private String shiftName; 
            private Boolean skipOneDay; 

            /**
             * cycleOrder.
             */
            public Builder cycleOrder(Long cycleOrder) {
                this.cycleOrder = cycleOrder;
                return this;
            }

            /**
             * schedulingEndTime.
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * schedulingObjectType.
             */
            public Builder schedulingObjectType(String schedulingObjectType) {
                this.schedulingObjectType = schedulingObjectType;
                return this;
            }

            /**
             * schedulingOrder.
             */
            public Builder schedulingOrder(Integer schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * schedulingStartTime.
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * schedulingUserId.
             */
            public Builder schedulingUserId(Long schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * schedulingUserIdList.
             */
            public Builder schedulingUserIdList(java.util.List < Long > schedulingUserIdList) {
                this.schedulingUserIdList = schedulingUserIdList;
                return this;
            }

            /**
             * schedulingUserName.
             */
            public Builder schedulingUserName(String schedulingUserName) {
                this.schedulingUserName = schedulingUserName;
                return this;
            }

            /**
             * shiftName.
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            /**
             * skipOneDay.
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

        @NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @NameInMap("schedulingUserId")
        private String schedulingUserId;

        @NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        @NameInMap("schedulingUserName")
        private String schedulingUserName;

        @NameInMap("shiftName")
        private String shiftName;

        @NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingTemplateFineShifts(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
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
         * @return schedulingObjectType
         */
        public String getSchedulingObjectType() {
            return this.schedulingObjectType;
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
         * @return schedulingUserIdList
         */
        public java.util.List < Long > getSchedulingUserIdList() {
            return this.schedulingUserIdList;
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
            private String schedulingObjectType; 
            private Long schedulingOrder; 
            private String schedulingStartTime; 
            private String schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 
            private String schedulingUserName; 
            private String shiftName; 
            private Boolean skipOneDay; 

            /**
             * schedulingEndTime.
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * schedulingObjectType.
             */
            public Builder schedulingObjectType(String schedulingObjectType) {
                this.schedulingObjectType = schedulingObjectType;
                return this;
            }

            /**
             * schedulingOrder.
             */
            public Builder schedulingOrder(Long schedulingOrder) {
                this.schedulingOrder = schedulingOrder;
                return this;
            }

            /**
             * schedulingStartTime.
             */
            public Builder schedulingStartTime(String schedulingStartTime) {
                this.schedulingStartTime = schedulingStartTime;
                return this;
            }

            /**
             * schedulingUserId.
             */
            public Builder schedulingUserId(String schedulingUserId) {
                this.schedulingUserId = schedulingUserId;
                return this;
            }

            /**
             * schedulingUserIdList.
             */
            public Builder schedulingUserIdList(java.util.List < Long > schedulingUserIdList) {
                this.schedulingUserIdList = schedulingUserIdList;
                return this;
            }

            /**
             * schedulingUserName.
             */
            public Builder schedulingUserName(String schedulingUserName) {
                this.schedulingUserName = schedulingUserName;
                return this;
            }

            /**
             * shiftName.
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            /**
             * skipOneDay.
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
             * periodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * schedulingFineShifts.
             */
            public Builder schedulingFineShifts(java.util.List < SchedulingFineShifts> schedulingFineShifts) {
                this.schedulingFineShifts = schedulingFineShifts;
                return this;
            }

            /**
             * schedulingTemplateFineShifts.
             */
            public Builder schedulingTemplateFineShifts(java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts) {
                this.schedulingTemplateFineShifts = schedulingTemplateFineShifts;
                return this;
            }

            /**
             * shiftType.
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
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * userName.
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
             * fastScheduling.
             */
            public Builder fastScheduling(FastScheduling fastScheduling) {
                this.fastScheduling = fastScheduling;
                return this;
            }

            /**
             * fineScheduling.
             */
            public Builder fineScheduling(FineScheduling fineScheduling) {
                this.fineScheduling = fineScheduling;
                return this;
            }

            /**
             * schedulingWay.
             */
            public Builder schedulingWay(String schedulingWay) {
                this.schedulingWay = schedulingWay;
                return this;
            }

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            /**
             * users.
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
