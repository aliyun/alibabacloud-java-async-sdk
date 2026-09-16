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
 * {@link DeepfakeDetectResponseBody} extends {@link TeaModel}
 *
 * <p>DeepfakeDetectResponseBody</p>
 */
public class DeepfakeDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DeepfakeDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepfakeDetectResponseBody create() {
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
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DeepfakeDetectResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result information.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DeepfakeDetectResponseBody build() {
            return new DeepfakeDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeepfakeDetectResponseBody} extends {@link TeaModel}
     *
     * <p>DeepfakeDetectResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("RiskScore")
        private java.util.Map<String, String> riskScore;

        @com.aliyun.core.annotation.NameInMap("RiskTag")
        private String riskTag;

        private ResultObject(Builder builder) {
            this.result = builder.result;
            this.riskScore = builder.riskScore;
            this.riskTag = builder.riskTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return riskScore
         */
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        /**
         * @return riskTag
         */
        public String getRiskTag() {
            return this.riskTag;
        }

        public static final class Builder {
            private String result; 
            private java.util.Map<String, String> riskScore; 
            private String riskTag; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.result = model.result;
                this.riskScore = model.riskScore;
                this.riskTag = model.riskTag;
            } 

            /**
             * <p>The risk result. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Low risk.</li>
             * <li><strong>1</strong>: High risk.</li>
             * <li><strong>2</strong>: Suspicious.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The risk score map.</p>
             */
            public Builder riskScore(java.util.Map<String, String> riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * <p>The risk labels. Multiple labels are separated by commas (,). Valid values:</p>
             * <ul>
             * <li>SuspectDeepForgery: suspected deepfake</li>
             * <li>SuspectPSFace: suspected synthetic attack</li>
             * <li>SuspectTemple: suspected fraudulent attack</li>
             * <li>SuspectRemake: suspected recaptured face.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SuspectDeepForgery, SuspectPSFace</p>
             */
            public Builder riskTag(String riskTag) {
                this.riskTag = riskTag;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
