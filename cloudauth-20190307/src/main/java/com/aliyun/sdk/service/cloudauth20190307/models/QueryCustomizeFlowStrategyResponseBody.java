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
 * {@link QueryCustomizeFlowStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomizeFlowStrategyResponseBody</p>
 */
public class QueryCustomizeFlowStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCustomizeFlowStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomizeFlowStrategyResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCustomizeFlowStrategyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Return code: 200 for success, others for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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

        /**
         * <p>Whether the response was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomizeFlowStrategyResponseBody build() {
            return new QueryCustomizeFlowStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCustomizeFlowStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomizeFlowStrategyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccumulateKey")
        private String accumulateKey;

        @com.aliyun.core.annotation.NameInMap("AccumulateWindow")
        private String accumulateWindow;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("FlowType")
        private String flowType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ResultObject(Builder builder) {
            this.accumulateKey = builder.accumulateKey;
            this.accumulateWindow = builder.accumulateWindow;
            this.apiName = builder.apiName;
            this.flowType = builder.flowType;
            this.id = builder.id;
            this.operation = builder.operation;
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
         * @return accumulateKey
         */
        public String getAccumulateKey() {
            return this.accumulateKey;
        }

        /**
         * @return accumulateWindow
         */
        public String getAccumulateWindow() {
            return this.accumulateWindow;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
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
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accumulateKey; 
            private String accumulateWindow; 
            private String apiName; 
            private String flowType; 
            private String id; 
            private String operation; 
            private String status; 
            private String threshold; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.accumulateKey = model.accumulateKey;
                this.accumulateWindow = model.accumulateWindow;
                this.apiName = model.apiName;
                this.flowType = model.flowType;
                this.id = model.id;
                this.operation = model.operation;
                this.status = model.status;
                this.threshold = model.threshold;
                this.userId = model.userId;
            } 

            /**
             * <p>AccumulateKey</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder accumulateKey(String accumulateKey) {
                this.accumulateKey = accumulateKey;
                return this;
            }

            /**
             * <p>Flow control statistical window, unit: <strong>minutes</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder accumulateWindow(String accumulateWindow) {
                this.accumulateWindow = accumulateWindow;
                return this;
            }

            /**
             * <p>API name, same as <strong>ProductCode</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Flow type:</p>
             * <ul>
             * <li><strong>ACCUMULATE</strong>: ID card reappears</li>
             * <li><strong>PASSED_RATE</strong>: Pass rate less than</li>
             * <li><strong>SUB_CODE_205</strong>: Authentication failed and liveness attack 205 ratio greater than</li>
             * <li><strong>SUB_CODE_206</strong>: Authentication failed and liveness attack 206 ratio greater than</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACCUMULATE</p>
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234822</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Operation.</p>
             * 
             * <strong>example:</strong>
             * <p>match</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
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
             * <p>disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>126005125163xxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
