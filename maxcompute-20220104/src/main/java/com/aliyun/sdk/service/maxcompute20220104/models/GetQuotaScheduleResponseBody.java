// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetQuotaScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaScheduleResponseBody</p>
 */
public class GetQuotaScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error code was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>errorMsg</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc059b716696296266308790e0d3e</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaScheduleResponseBody build() {
            return new GetQuotaScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaScheduleResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("after")
        private String after;

        @com.aliyun.core.annotation.NameInMap("at")
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
             * <p>The start time when the quota plan takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-25T04:23:04Z</p>
             */
            public Builder after(String after) {
                this.after = after;
                return this;
            }

            /**
             * <p>The time when the quota plan takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>0900</p>
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
    /**
     * 
     * {@link GetQuotaScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaScheduleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("plan")
        private String plan;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>The condition value.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The ID of the quota plan.</p>
             * 
             * <strong>example:</strong>
             * <p>63</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The name of the quota plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder plan(String plan) {
                this.plan = plan;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>UTC+8</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The type of the quota plan.</p>
             * 
             * <strong>example:</strong>
             * <p>once</p>
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
