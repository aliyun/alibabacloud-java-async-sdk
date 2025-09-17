// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230.models;

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
 * {@link DescribePushMeteringDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePushMeteringDataResponseBody</p>
 */
public class DescribePushMeteringDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ForceFatal")
    private Boolean forceFatal;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribePushMeteringDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicMessage = builder.dynamicMessage;
        this.forceFatal = builder.forceFatal;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePushMeteringDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return forceFatal
     */
    public Boolean getForceFatal() {
        return this.forceFatal;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dynamicMessage; 
        private Boolean forceFatal; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribePushMeteringDataResponseBody model) {
            this.code = model.code;
            this.dynamicMessage = model.dynamicMessage;
            this.forceFatal = model.forceFatal;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ForceFatal.
         */
        public Builder forceFatal(Boolean forceFatal) {
            this.forceFatal = forceFatal;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePushMeteringDataResponseBody build() {
            return new DescribePushMeteringDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePushMeteringDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePushMeteringDataResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsPushBilling")
        private Boolean isPushBilling;

        @com.aliyun.core.annotation.NameInMap("MeteringAssist")
        private String meteringAssist;

        @com.aliyun.core.annotation.NameInMap("MeteringEntity")
        private String meteringEntity;

        @com.aliyun.core.annotation.NameInMap("PushOrderBizId")
        private String pushOrderBizId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Result(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.isPushBilling = builder.isPushBilling;
            this.meteringAssist = builder.meteringAssist;
            this.meteringEntity = builder.meteringEntity;
            this.pushOrderBizId = builder.pushOrderBizId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isPushBilling
         */
        public Boolean getIsPushBilling() {
            return this.isPushBilling;
        }

        /**
         * @return meteringAssist
         */
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

        /**
         * @return meteringEntity
         */
        public String getMeteringEntity() {
            return this.meteringEntity;
        }

        /**
         * @return pushOrderBizId
         */
        public String getPushOrderBizId() {
            return this.pushOrderBizId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceId; 
            private Boolean isPushBilling; 
            private String meteringAssist; 
            private String meteringEntity; 
            private String pushOrderBizId; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.isPushBilling = model.isPushBilling;
                this.meteringAssist = model.meteringAssist;
                this.meteringEntity = model.meteringEntity;
                this.pushOrderBizId = model.pushOrderBizId;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsPushBilling.
             */
            public Builder isPushBilling(Boolean isPushBilling) {
                this.isPushBilling = isPushBilling;
                return this;
            }

            /**
             * MeteringAssist.
             */
            public Builder meteringAssist(String meteringAssist) {
                this.meteringAssist = meteringAssist;
                return this;
            }

            /**
             * MeteringEntity.
             */
            public Builder meteringEntity(String meteringEntity) {
                this.meteringEntity = meteringEntity;
                return this;
            }

            /**
             * PushOrderBizId.
             */
            public Builder pushOrderBizId(String pushOrderBizId) {
                this.pushOrderBizId = pushOrderBizId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
