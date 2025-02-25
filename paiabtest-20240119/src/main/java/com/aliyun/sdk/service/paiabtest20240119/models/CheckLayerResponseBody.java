// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckLayerResponseBody} extends {@link TeaModel}
 *
 * <p>CheckLayerResponseBody</p>
 */
public class CheckLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckResults")
    private java.util.List < CheckResults> checkResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckLayerResponseBody(Builder builder) {
        this.checkResults = builder.checkResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkResults
     */
    public java.util.List < CheckResults> getCheckResults() {
        return this.checkResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckResults> checkResults; 
        private String requestId; 

        /**
         * CheckResults.
         */
        public Builder checkResults(java.util.List < CheckResults> checkResults) {
            this.checkResults = checkResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckLayerResponseBody build() {
            return new CheckLayerResponseBody(this);
        } 

    } 

    public static class CheckResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("ExperimentName")
        private String experimentName;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        private CheckResults(Builder builder) {
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
            this.paramName = builder.paramName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResults create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        public static final class Builder {
            private String experimentId; 
            private String experimentName; 
            private String paramName; 

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ExperimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            public CheckResults build() {
                return new CheckResults(this);
            } 

        } 

    }
}
