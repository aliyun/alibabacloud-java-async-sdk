// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingPreviewRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupSchedulingPreviewRequest</p>
 */
public class GetServiceGroupSchedulingPreviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private GetServiceGroupSchedulingPreviewRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.fastScheduling = builder.fastScheduling;
        this.fineScheduling = builder.fineScheduling;
        this.schedulingWay = builder.schedulingWay;
        this.serviceGroupId = builder.serviceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSchedulingPreviewRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetServiceGroupSchedulingPreviewRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private FastScheduling fastScheduling; 
        private FineScheduling fineScheduling; 
        private String schedulingWay; 
        private Long serviceGroupId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceGroupSchedulingPreviewRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.fastScheduling = request.fastScheduling;
            this.fineScheduling = request.fineScheduling;
            this.schedulingWay = request.schedulingWay;
            this.serviceGroupId = request.serviceGroupId;
            this.startTime = request.startTime;
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
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
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

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetServiceGroupSchedulingPreviewRequest build() {
            return new GetServiceGroupSchedulingPreviewRequest(this);
        } 

    } 

    public static class SchedulingUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        private Long schedulingUserId;

        private SchedulingUsers(Builder builder) {
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingUserId = builder.schedulingUserId;
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

        public static final class Builder {
            private Integer schedulingOrder; 
            private Long schedulingUserId; 

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
             * FAST_CHOICE
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
             * DAY
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
        @com.aliyun.core.annotation.NameInMap("schedulingEndTime")
        private String schedulingEndTime;

        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Long schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingStartTime")
        private String schedulingStartTime;

        @com.aliyun.core.annotation.NameInMap("shiftName")
        private String shiftName;

        private SchedulingFineShifts(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.shiftName = builder.shiftName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingFineShifts create() {
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
         * @return shiftName
         */
        public String getShiftName() {
            return this.shiftName;
        }

        public static final class Builder {
            private String schedulingEndTime; 
            private Long schedulingOrder; 
            private String schedulingStartTime; 
            private String shiftName; 

            /**
             * schedulingEndTime.
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
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
             * shiftName.
             */
            public Builder shiftName(String shiftName) {
                this.shiftName = shiftName;
                return this;
            }

            public SchedulingFineShifts build() {
                return new SchedulingFineShifts(this);
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

        @com.aliyun.core.annotation.NameInMap("shiftType")
        private String shiftType;

        private FineScheduling(Builder builder) {
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.schedulingFineShifts = builder.schedulingFineShifts;
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
         * @return shiftType
         */
        public String getShiftType() {
            return this.shiftType;
        }

        public static final class Builder {
            private Integer period; 
            private String periodUnit; 
            private java.util.List < SchedulingFineShifts> schedulingFineShifts; 
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
