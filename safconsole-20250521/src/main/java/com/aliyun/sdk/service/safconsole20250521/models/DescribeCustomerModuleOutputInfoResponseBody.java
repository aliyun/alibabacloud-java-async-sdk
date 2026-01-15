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
 * {@link DescribeCustomerModuleOutputInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerModuleOutputInfoResponseBody</p>
 */
public class DescribeCustomerModuleOutputInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomerModuleOutputInfoResponseBody(Builder builder) {
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

    public static DescribeCustomerModuleOutputInfoResponseBody create() {
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
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomerModuleOutputInfoResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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

        public DescribeCustomerModuleOutputInfoResponseBody build() {
            return new DescribeCustomerModuleOutputInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomerModuleOutputInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerModuleOutputInfoResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinalScoreFormat")
        private String finalScoreFormat;

        @com.aliyun.core.annotation.NameInMap("ProcessExpression")
        private String processExpression;

        @com.aliyun.core.annotation.NameInMap("TestFile")
        private String testFile;

        private ResultObject(Builder builder) {
            this.finalScoreFormat = builder.finalScoreFormat;
            this.processExpression = builder.processExpression;
            this.testFile = builder.testFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return finalScoreFormat
         */
        public String getFinalScoreFormat() {
            return this.finalScoreFormat;
        }

        /**
         * @return processExpression
         */
        public String getProcessExpression() {
            return this.processExpression;
        }

        /**
         * @return testFile
         */
        public String getTestFile() {
            return this.testFile;
        }

        public static final class Builder {
            private String finalScoreFormat; 
            private String processExpression; 
            private String testFile; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.finalScoreFormat = model.finalScoreFormat;
                this.processExpression = model.processExpression;
                this.testFile = model.testFile;
            } 

            /**
             * FinalScoreFormat.
             */
            public Builder finalScoreFormat(String finalScoreFormat) {
                this.finalScoreFormat = finalScoreFormat;
                return this;
            }

            /**
             * ProcessExpression.
             */
            public Builder processExpression(String processExpression) {
                this.processExpression = processExpression;
                return this;
            }

            /**
             * TestFile.
             */
            public Builder testFile(String testFile) {
                this.testFile = testFile;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
