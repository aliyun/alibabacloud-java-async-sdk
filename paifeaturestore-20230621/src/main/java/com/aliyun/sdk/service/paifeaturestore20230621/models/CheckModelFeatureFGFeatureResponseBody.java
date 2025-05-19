// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CheckModelFeatureFGFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>CheckModelFeatureFGFeatureResponseBody</p>
 */
public class CheckModelFeatureFGFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FGCheckResults")
    private java.util.List<FGCheckResults> FGCheckResults;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CheckModelFeatureFGFeatureResponseBody(Builder builder) {
        this.FGCheckResults = builder.FGCheckResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModelFeatureFGFeatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return FGCheckResults
     */
    public java.util.List<FGCheckResults> getFGCheckResults() {
        return this.FGCheckResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FGCheckResults> FGCheckResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckModelFeatureFGFeatureResponseBody model) {
            this.FGCheckResults = model.FGCheckResults;
            this.requestId = model.requestId;
        } 

        /**
         * FGCheckResults.
         */
        public Builder FGCheckResults(java.util.List<FGCheckResults> FGCheckResults) {
            this.FGCheckResults = FGCheckResults;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckModelFeatureFGFeatureResponseBody build() {
            return new CheckModelFeatureFGFeatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckModelFeatureFGFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>CheckModelFeatureFGFeatureResponseBody</p>
     */
    public static class FGCheckResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RuleCode")
        private String ruleCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private FGCheckResults(Builder builder) {
            this.message = builder.message;
            this.ruleCode = builder.ruleCode;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FGCheckResults create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return ruleCode
         */
        public String getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String ruleCode; 
            private Boolean status; 

            private Builder() {
            } 

            private Builder(FGCheckResults model) {
                this.message = model.message;
                this.ruleCode = model.ruleCode;
                this.status = model.status;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RuleCode.
             */
            public Builder ruleCode(String ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public FGCheckResults build() {
                return new FGCheckResults(this);
            } 

        } 

    }
}
