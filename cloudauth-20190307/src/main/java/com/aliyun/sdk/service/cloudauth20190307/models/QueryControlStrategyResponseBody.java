// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryControlStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryControlStrategyResponseBody</p>
 */
public class QueryControlStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    private QueryControlStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryControlStrategyResponseBody create() {
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
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(QueryControlStrategyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code: 200 for success, others for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B506328A-D84B-4750-82C7-6A207C585CF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Processing result.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public QueryControlStrategyResponseBody build() {
            return new QueryControlStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryControlStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryControlStrategyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Double threshold;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.apiName = builder.apiName;
            this.bizType = builder.bizType;
            this.id = builder.id;
            this.status = builder.status;
            this.threshold = builder.threshold;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return threshold
         */
        public Double getThreshold() {
            return this.threshold;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String apiName; 
            private String bizType; 
            private Long id; 
            private String status; 
            private Double threshold; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.apiName = model.apiName;
                this.bizType = model.bizType;
                this.id = model.id;
                this.status = model.status;
                this.threshold = model.threshold;
                this.userId = model.userId;
            } 

            /**
             * <p>API name, same as the <strong>ProductCode</strong> of the authentication interface.</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Rule configuration type:</p>
             * <ul>
             * <li><strong>QPS</strong>: QPS greater than</li>
             * <li><strong>SUCCESS_RATE_5_MIN</strong>: Success rate in the last 5 minutes less than</li>
             * <li><strong>RESP_TIME_5_MIN</strong>: Average response time in the last 5 minutes greater than</li>
             * <li><strong>AMOUNT_RISE</strong>: Call volume growth ratio greater than</li>
             * <li><strong>AMOUNT_FALL</strong>: Call volume decline ratio less than</li>
             * <li><strong>PASSED_RATE_1_HOUR</strong>: Verification consistency rate in the last hour less than</li>
             * <li><strong>PARAM_ERROR_RATE_1_HOUR</strong>: Parameter error rate in the last hour greater than</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS_RATE_5_MIN</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234822</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Status:</p>
             * <ul>
             * <li><strong>disabled</strong>: Disabled</li>
             * <li><strong>normal</strong>: Enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Alarm threshold for rule configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9</p>
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>126005125163xxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
