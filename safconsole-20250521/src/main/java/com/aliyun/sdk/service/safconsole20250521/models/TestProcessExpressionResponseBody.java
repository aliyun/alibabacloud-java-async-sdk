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
 * {@link TestProcessExpressionResponseBody} extends {@link TeaModel}
 *
 * <p>TestProcessExpressionResponseBody</p>
 */
public class TestProcessExpressionResponseBody extends TeaModel {
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

    private TestProcessExpressionResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestProcessExpressionResponseBody create() {
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

        private Builder(TestProcessExpressionResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TestProcessExpressionResponseBody build() {
            return new TestProcessExpressionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestProcessExpressionResponseBody} extends {@link TeaModel}
     *
     * <p>TestProcessExpressionResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        private ResultObject(Builder builder) {
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private Double score; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.score = model.score;
            } 

            /**
             * <p>Test score.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
