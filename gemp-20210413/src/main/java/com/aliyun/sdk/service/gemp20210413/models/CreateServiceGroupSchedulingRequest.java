// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceGroupSchedulingRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceGroupSchedulingRequest</p>
 */
public class CreateServiceGroupSchedulingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fastScheduling")
    private FastScheduling fastScheduling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fineScheduling")
    private FineScheduling fineScheduling;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schedulingWay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schedulingWay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private CreateServiceGroupSchedulingRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fastScheduling = builder.fastScheduling;
        this.fineScheduling = builder.fineScheduling;
        this.schedulingWay = builder.schedulingWay;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceGroupSchedulingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateServiceGroupSchedulingRequest, Builder> {
        private String clientToken; 
        private FastScheduling fastScheduling; 
        private FineScheduling fineScheduling; 
        private String schedulingWay; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceGroupSchedulingRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fastScheduling = request.fastScheduling;
            this.fineScheduling = request.fineScheduling;
            this.schedulingWay = request.schedulingWay;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * fastScheduling.
         */
        public Builder fastScheduling(FastScheduling fastScheduling) {
            this.putBodyParameter("fastScheduling", fastScheduling);
            this.fastScheduling = fastScheduling;
            return this;
        }

        /**
         * fineScheduling.
         */
        public Builder fineScheduling(FineScheduling fineScheduling) {
            this.putBodyParameter("fineScheduling", fineScheduling);
            this.fineScheduling = fineScheduling;
            return this;
        }

        /**
         * schedulingWay.
         */
        public Builder schedulingWay(String schedulingWay) {
            this.putBodyParameter("schedulingWay", schedulingWay);
            this.schedulingWay = schedulingWay;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public CreateServiceGroupSchedulingRequest build() {
            return new CreateServiceGroupSchedulingRequest(this);
        } 

    } 

    public static class SchedulingUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @com.aliyun.core.annotation.NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        private SchedulingUsers(Builder builder) {
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
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
        public Long getSchedulingOrder() {
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

        public static final class Builder {
            private String schedulingObjectType; 
            private Long schedulingOrder; 
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 

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

            public SchedulingUsers build() {
                return new SchedulingUsers(this);
            } 

        } 

    }
    public static class FastScheduling extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dutyPlan")
        private String dutyPlan;

        @com.aliyun.core.annotation.NameInMap("schedulingUsers")
        private java.util.List < SchedulingUsers> schedulingUsers;

        @com.aliyun.core.annotation.NameInMap("singleDuration")
        private Integer singleDuration;

        @com.aliyun.core.annotation.NameInMap("singleDurationUnit")
        private String singleDurationUnit;

        private FastScheduling(Builder builder) {
            this.dutyPlan = builder.dutyPlan;
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
        @com.aliyun.core.annotation.NameInMap("cycleOrder")
        private Integer cycleOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @com.aliyun.core.annotation.NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @com.aliyun.core.annotation.NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        @com.aliyun.core.annotation.NameInMap("shiftName")
        private String shiftName;

        @com.aliyun.core.annotation.NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingFineShifts(Builder builder) {
            this.cycleOrder = builder.cycleOrder;
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
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
        public Integer getCycleOrder() {
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
            private Integer cycleOrder; 
            private String schedulingEndTime; 
            private String schedulingObjectType; 
            private Integer schedulingOrder; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 
            private String shiftName; 
            private Boolean skipOneDay; 

            /**
             * cycleOrder.
             */
            public Builder cycleOrder(Integer cycleOrder) {
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
        @com.aliyun.core.annotation.NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @com.aliyun.core.annotation.NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        private Long schedulingUserId;

        @com.aliyun.core.annotation.NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        @com.aliyun.core.annotation.NameInMap("schedulingUserName")
        private String schedulingUserName;

        @com.aliyun.core.annotation.NameInMap("skipOneDay")
        private Boolean skipOneDay;

        private SchedulingTemplateFineShifts(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
            this.schedulingUserName = builder.schedulingUserName;
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
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 
            private String schedulingUserName; 
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
        @com.aliyun.core.annotation.NameInMap("period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("periodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("schedulingFineShifts")
        private java.util.List < SchedulingFineShifts> schedulingFineShifts;

        @com.aliyun.core.annotation.NameInMap("schedulingTemplateFineShifts")
        private java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts;

        @com.aliyun.core.annotation.NameInMap("shiftType")
        private String shiftType;

        private FineScheduling(Builder builder) {
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
            private Integer period; 
            private String periodUnit; 
            private java.util.List < SchedulingFineShifts> schedulingFineShifts; 
            private java.util.List < SchedulingTemplateFineShifts> schedulingTemplateFineShifts; 
            private String shiftType; 

            /**
             * period.
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
}
