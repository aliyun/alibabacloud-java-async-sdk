// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaScheduleResponseBody</p>
 */
public class GetQuotaScheduleResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
    private String requestId;

    private GetQuotaScheduleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * *   If the value of success was false, an error code was returned.
         * <p>
         * *   If the value of success was true, a null value was returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaScheduleResponseBody build() {
            return new GetQuotaScheduleResponseBody(this);
        } 

    } 

    public static class Condition extends TeaModel {
        @NameInMap("after")
        private String after;

        @NameInMap("at")
        private String at;

        private Condition(Builder builder) {
            this.after = builder.after;
            this.at = builder.at;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return after
         */
        public String getAfter() {
            return this.after;
        }

        /**
         * @return at
         */
        public String getAt() {
            return this.at;
        }

        public static final class Builder {
            private String after; 
            private String at; 

            /**
             * The start time when the quota plan takes effect.
             */
            public Builder after(String after) {
                this.after = after;
                return this;
            }

            /**
             * The time when the quota plan takes effect.
             */
            public Builder at(String at) {
                this.at = at;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("condition")
        private Condition condition;

        @NameInMap("id")
        private String id;

        @NameInMap("operator")
        private String operator;

        @NameInMap("plan")
        private String plan;

        @NameInMap("timezone")
        private String timezone;

        @NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.condition = builder.condition;
            this.id = builder.id;
            this.operator = builder.operator;
            this.plan = builder.plan;
            this.timezone = builder.timezone;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public Condition getCondition() {
            return this.condition;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return plan
         */
        public String getPlan() {
            return this.plan;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Condition condition; 
            private String id; 
            private String operator; 
            private String plan; 
            private String timezone; 
            private String type; 

            /**
             * The condition value.
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * The ID of the quota plan.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The name of the quota plan.
             */
            public Builder plan(String plan) {
                this.plan = plan;
                return this;
            }

            /**
             * The time zone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * The type of the quota plan.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
