// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link TestModelResponseBody} extends {@link TeaModel}
 *
 * <p>TestModelResponseBody</p>
 */
public class TestModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TestModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Long httpStatusCode; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TestModelResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TestModelResponseBody build() {
            return new TestModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestModelResponseBody} extends {@link TeaModel}
     *
     * <p>TestModelResponseBody</p>
     */
    public static class TestResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualResult")
        private String actualResult;

        @com.aliyun.core.annotation.NameInMap("Consistency")
        private Boolean consistency;

        @com.aliyun.core.annotation.NameInMap("TestResult")
        private String testResult;

        @com.aliyun.core.annotation.NameInMap("TrainResult")
        private String trainResult;

        private TestResult(Builder builder) {
            this.actualResult = builder.actualResult;
            this.consistency = builder.consistency;
            this.testResult = builder.testResult;
            this.trainResult = builder.trainResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestResult create() {
            return builder().build();
        }

        /**
         * @return actualResult
         */
        public String getActualResult() {
            return this.actualResult;
        }

        /**
         * @return consistency
         */
        public Boolean getConsistency() {
            return this.consistency;
        }

        /**
         * @return testResult
         */
        public String getTestResult() {
            return this.testResult;
        }

        /**
         * @return trainResult
         */
        public String getTrainResult() {
            return this.trainResult;
        }

        public static final class Builder {
            private String actualResult; 
            private Boolean consistency; 
            private String testResult; 
            private String trainResult; 

            private Builder() {
            } 

            private Builder(TestResult model) {
                this.actualResult = model.actualResult;
                this.consistency = model.consistency;
                this.testResult = model.testResult;
                this.trainResult = model.trainResult;
            } 

            /**
             * ActualResult.
             */
            public Builder actualResult(String actualResult) {
                this.actualResult = actualResult;
                return this;
            }

            /**
             * Consistency.
             */
            public Builder consistency(Boolean consistency) {
                this.consistency = consistency;
                return this;
            }

            /**
             * TestResult.
             */
            public Builder testResult(String testResult) {
                this.testResult = testResult;
                return this;
            }

            /**
             * TrainResult.
             */
            public Builder trainResult(String trainResult) {
                this.trainResult = trainResult;
                return this;
            }

            public TestResult build() {
                return new TestResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link TestModelResponseBody} extends {@link TeaModel}
     *
     * <p>TestModelResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsistencyCount")
        private Long consistencyCount;

        @com.aliyun.core.annotation.NameInMap("ConsistencyRate")
        private Double consistencyRate;

        @com.aliyun.core.annotation.NameInMap("TestResult")
        private java.util.List<TestResult> testResult;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private ResultObject(Builder builder) {
            this.consistencyCount = builder.consistencyCount;
            this.consistencyRate = builder.consistencyRate;
            this.testResult = builder.testResult;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return consistencyCount
         */
        public Long getConsistencyCount() {
            return this.consistencyCount;
        }

        /**
         * @return consistencyRate
         */
        public Double getConsistencyRate() {
            return this.consistencyRate;
        }

        /**
         * @return testResult
         */
        public java.util.List<TestResult> getTestResult() {
            return this.testResult;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long consistencyCount; 
            private Double consistencyRate; 
            private java.util.List<TestResult> testResult; 
            private Long total; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.consistencyCount = model.consistencyCount;
                this.consistencyRate = model.consistencyRate;
                this.testResult = model.testResult;
                this.total = model.total;
            } 

            /**
             * ConsistencyCount.
             */
            public Builder consistencyCount(Long consistencyCount) {
                this.consistencyCount = consistencyCount;
                return this;
            }

            /**
             * ConsistencyRate.
             */
            public Builder consistencyRate(Double consistencyRate) {
                this.consistencyRate = consistencyRate;
                return this;
            }

            /**
             * TestResult.
             */
            public Builder testResult(java.util.List<TestResult> testResult) {
                this.testResult = testResult;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
