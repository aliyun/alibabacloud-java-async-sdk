// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

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
 * {@link EntVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>EntVerifyResponseBody</p>
 */
public class EntVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private EntVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntVerifyResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(EntVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-A***B-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntVerifyResponseBody build() {
            return new EntVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EntVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>EntVerifyResponseBody</p>
     */
    public static class ModelResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private ModelResults(Builder builder) {
            this.modelName = builder.modelName;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelResults create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String modelName; 
            private String result; 

            private Builder() {
            } 

            private Builder(ModelResults model) {
                this.modelName = model.modelName;
                this.result = model.result;
            } 

            /**
             * <p>Model name</p>
             * 
             * <strong>example:</strong>
             * <p>model_1</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Model result</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public ModelResults build() {
                return new ModelResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>EntVerifyResponseBody</p>
     */
    public static class RiskVerifyResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Found")
        private Boolean found;

        @com.aliyun.core.annotation.NameInMap("ModelResults")
        private java.util.List<ModelResults> modelResults;

        private RiskVerifyResult(Builder builder) {
            this.found = builder.found;
            this.modelResults = builder.modelResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskVerifyResult create() {
            return builder().build();
        }

        /**
         * @return found
         */
        public Boolean getFound() {
            return this.found;
        }

        /**
         * @return modelResults
         */
        public java.util.List<ModelResults> getModelResults() {
            return this.modelResults;
        }

        public static final class Builder {
            private Boolean found; 
            private java.util.List<ModelResults> modelResults; 

            private Builder() {
            } 

            private Builder(RiskVerifyResult model) {
                this.found = model.found;
                this.modelResults = model.modelResults;
            } 

            /**
             * <p>Whether found</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder found(Boolean found) {
                this.found = found;
                return this;
            }

            /**
             * <p>List of enterprise risk verification model results</p>
             */
            public Builder modelResults(java.util.List<ModelResults> modelResults) {
                this.modelResults = modelResults;
                return this;
            }

            public RiskVerifyResult build() {
                return new RiskVerifyResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link EntVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>EntVerifyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskVerifyResult")
        private RiskVerifyResult riskVerifyResult;

        private Result(Builder builder) {
            this.riskVerifyResult = builder.riskVerifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return riskVerifyResult
         */
        public RiskVerifyResult getRiskVerifyResult() {
            return this.riskVerifyResult;
        }

        public static final class Builder {
            private RiskVerifyResult riskVerifyResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.riskVerifyResult = model.riskVerifyResult;
            } 

            /**
             * <p>Enterprise risk verification result</p>
             */
            public Builder riskVerifyResult(RiskVerifyResult riskVerifyResult) {
                this.riskVerifyResult = riskVerifyResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
