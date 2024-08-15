// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceGroupSpecialDaySchedulingRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceGroupSpecialDaySchedulingRequest</p>
 */
public class UpdateServiceGroupSpecialDaySchedulingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schedulingDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schedulingDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schedulingSpecialDays")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SchedulingSpecialDays> schedulingSpecialDays;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private UpdateServiceGroupSpecialDaySchedulingRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.schedulingDate = builder.schedulingDate;
        this.schedulingSpecialDays = builder.schedulingSpecialDays;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceGroupSpecialDaySchedulingRequest create() {
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
     * @return schedulingDate
     */
    public String getSchedulingDate() {
        return this.schedulingDate;
    }

    /**
     * @return schedulingSpecialDays
     */
    public java.util.List < SchedulingSpecialDays> getSchedulingSpecialDays() {
        return this.schedulingSpecialDays;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceGroupSpecialDaySchedulingRequest, Builder> {
        private String clientToken; 
        private String schedulingDate; 
        private java.util.List < SchedulingSpecialDays> schedulingSpecialDays; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceGroupSpecialDaySchedulingRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.schedulingDate = request.schedulingDate;
            this.schedulingSpecialDays = request.schedulingSpecialDays;
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
         * schedulingDate.
         */
        public Builder schedulingDate(String schedulingDate) {
            this.putBodyParameter("schedulingDate", schedulingDate);
            this.schedulingDate = schedulingDate;
            return this;
        }

        /**
         * schedulingSpecialDays.
         */
        public Builder schedulingSpecialDays(java.util.List < SchedulingSpecialDays> schedulingSpecialDays) {
            this.putBodyParameter("schedulingSpecialDays", schedulingSpecialDays);
            this.schedulingSpecialDays = schedulingSpecialDays;
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
        public UpdateServiceGroupSpecialDaySchedulingRequest build() {
            return new UpdateServiceGroupSpecialDaySchedulingRequest(this);
        } 

    } 

    public static class SchedulingSpecialDays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("schedulingEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String schedulingEndTime;

        @com.aliyun.core.annotation.NameInMap("schedulingObjectType")
        private String schedulingObjectType;

        @com.aliyun.core.annotation.NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @com.aliyun.core.annotation.NameInMap("schedulingStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String schedulingStartTime;

        @com.aliyun.core.annotation.NameInMap("schedulingUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long schedulingUserId;

        @com.aliyun.core.annotation.NameInMap("schedulingUserIdList")
        private java.util.List < Long > schedulingUserIdList;

        private SchedulingSpecialDays(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingObjectType = builder.schedulingObjectType;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
            this.schedulingUserIdList = builder.schedulingUserIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulingSpecialDays create() {
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

        public static final class Builder {
            private String schedulingEndTime; 
            private String schedulingObjectType; 
            private Integer schedulingOrder; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 
            private java.util.List < Long > schedulingUserIdList; 

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

            public SchedulingSpecialDays build() {
                return new SchedulingSpecialDays(this);
            } 

        } 

    }
}
