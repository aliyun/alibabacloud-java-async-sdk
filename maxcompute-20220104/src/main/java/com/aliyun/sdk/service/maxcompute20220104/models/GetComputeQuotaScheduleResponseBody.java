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
 * {@link GetComputeQuotaScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeQuotaScheduleResponseBody</p>
 */
public class GetComputeQuotaScheduleResponseBody extends TeaModel {
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

    private GetComputeQuotaScheduleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeQuotaScheduleResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>QUOTA_UNKNOWN_NICKNAME</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Cannot found quota **</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B42CA730-8187-50F1-9FE0-6733297036DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetComputeQuotaScheduleResponseBody build() {
            return new GetComputeQuotaScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeQuotaScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaScheduleResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("at")
        private String at;

        private Condition(Builder builder) {
            this.at = builder.at;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return at
         */
        public String getAt() {
            return this.at;
        }

        public static final class Builder {
            private String at; 

            /**
             * <p>The start time when the quota plan takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00</p>
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
     * {@link GetComputeQuotaScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaScheduleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("plan")
        private String plan;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.condition = builder.condition;
            this.id = builder.id;
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
            private String plan; 
            private String timezone; 
            private String type; 

            /**
             * <p>The value of effective condition.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The ID of the quota plan.</p>
             * 
             * <strong>example:</strong>
             * <p>89b54db44d384f26964951ea457f64a5</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * <p>The time zone property.</p>
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
             * <p>daily</p>
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
