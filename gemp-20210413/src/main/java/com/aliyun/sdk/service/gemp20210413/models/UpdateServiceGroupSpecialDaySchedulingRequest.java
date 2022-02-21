// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceGroupSpecialDaySchedulingRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceGroupSpecialDaySchedulingRequest</p>
 */
public class UpdateServiceGroupSpecialDaySchedulingRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("schedulingDate")
    @Validation(required = true)
    private String schedulingDate;

    @Body
    @NameInMap("schedulingSpecialDays")
    @Validation(required = true)
    private java.util.List < SchedulingSpecialDays> schedulingSpecialDays;

    @Body
    @NameInMap("serviceGroupId")
    @Validation(required = true)
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

        private Builder(UpdateServiceGroupSpecialDaySchedulingRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.schedulingDate = response.schedulingDate;
            this.schedulingSpecialDays = response.schedulingSpecialDays;
            this.serviceGroupId = response.serviceGroupId;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 排班日期
         */
        public Builder schedulingDate(String schedulingDate) {
            this.putBodyParameter("schedulingDate", schedulingDate);
            this.schedulingDate = schedulingDate;
            return this;
        }

        /**
         * 特殊排班信息
         */
        public Builder schedulingSpecialDays(java.util.List < SchedulingSpecialDays> schedulingSpecialDays) {
            this.putBodyParameter("schedulingSpecialDays", schedulingSpecialDays);
            this.schedulingSpecialDays = schedulingSpecialDays;
            return this;
        }

        /**
         * 服务组ID
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
        @NameInMap("schedulingEndTime")
        @Validation(required = true)
        private String schedulingEndTime;

        @NameInMap("schedulingOrder")
        private Integer schedulingOrder;

        @NameInMap("schedulingStartTime")
        @Validation(required = true)
        private String schedulingStartTime;

        @NameInMap("schedulingUserId")
        @Validation(required = true)
        private Long schedulingUserId;

        private SchedulingSpecialDays(Builder builder) {
            this.schedulingEndTime = builder.schedulingEndTime;
            this.schedulingOrder = builder.schedulingOrder;
            this.schedulingStartTime = builder.schedulingStartTime;
            this.schedulingUserId = builder.schedulingUserId;
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

        public static final class Builder {
            private String schedulingEndTime; 
            private Integer schedulingOrder; 
            private String schedulingStartTime; 
            private Long schedulingUserId; 

            /**
             * 排班结束时间
             */
            public Builder schedulingEndTime(String schedulingEndTime) {
                this.schedulingEndTime = schedulingEndTime;
                return this;
            }

            /**
             * 班次顺序
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

            public SchedulingSpecialDays build() {
                return new SchedulingSpecialDays(this);
            } 

        } 

    }
}
