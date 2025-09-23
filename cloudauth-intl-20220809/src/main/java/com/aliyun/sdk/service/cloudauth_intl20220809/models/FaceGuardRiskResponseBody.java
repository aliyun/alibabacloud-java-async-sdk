// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link FaceGuardRiskResponseBody} extends {@link TeaModel}
 *
 * <p>FaceGuardRiskResponseBody</p>
 */
public class FaceGuardRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private FaceGuardRiskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceGuardRiskResponseBody create() {
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

        private Builder(FaceGuardRiskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The return code. A value of Success indicates that the API operation responded successfully. For more information about how to determine the authentication result, expand the <strong>Return codes</strong> section below.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>A detailed description of the return code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>595E387B-3F0E-5C52-BD02-8EFE63D41FD5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public FaceGuardRiskResponseBody build() {
            return new FaceGuardRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FaceGuardRiskResponseBody} extends {@link TeaModel}
     *
     * <p>FaceGuardRiskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GuardRiskScore")
        private Double guardRiskScore;

        @com.aliyun.core.annotation.NameInMap("RiskExtends")
        private String riskExtends;

        @com.aliyun.core.annotation.NameInMap("RiskTags")
        private String riskTags;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.guardRiskScore = builder.guardRiskScore;
            this.riskExtends = builder.riskExtends;
            this.riskTags = builder.riskTags;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return guardRiskScore
         */
        public Double getGuardRiskScore() {
            return this.guardRiskScore;
        }

        /**
         * @return riskExtends
         */
        public String getRiskExtends() {
            return this.riskExtends;
        }

        /**
         * @return riskTags
         */
        public String getRiskTags() {
            return this.riskTags;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private Double guardRiskScore; 
            private String riskExtends; 
            private String riskTags; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.guardRiskScore = model.guardRiskScore;
                this.riskExtends = model.riskExtends;
                this.riskTags = model.riskTags;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>The device risk probability predicted by the Device Guard algorithm. A higher score indicates a higher device risk.</p>
             * <p>Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder guardRiskScore(Double guardRiskScore) {
                this.guardRiskScore = guardRiskScore;
                return this;
            }

            /**
             * <p>Extended information. This is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;code&quot;: 200
             *   &quot;message&quot;:&quot;success&quot;
             *   &quot;umid&quot;:&quot;07d3295d3d597b425d102a7f********&quot;,
             *   &quot;sip&quot;:&quot;198.51.100.1&quot;,
             *   &quot;durationMs&quot; : 4968931
             *   &quot;queryCount&quot;:1,
             *   &quot;querySessionCount&quot;:1,
             *   &quot;queryUmidCount&quot;:1
             *   &quot;platform&quot;:&quot;Android
             * }</p>
             */
            public Builder riskExtends(String riskExtends) {
                this.riskExtends = riskExtends;
                return this;
            }

            /**
             * <p>The device risk tags. Multiple risk tags are separated by commas (<strong>,</strong>). For more information about the risk tags and their meanings, expand the <strong>Risk tags (RiskTags)</strong> section below.</p>
             * 
             * <strong>example:</strong>
             * <p>ROOT,VPN,HOOK</p>
             */
            public Builder riskTags(String riskTags) {
                this.riskTags = riskTags;
                return this;
            }

            /**
             * <p>The transaction ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hk573be80f944d95ac812e019e3655a8</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
