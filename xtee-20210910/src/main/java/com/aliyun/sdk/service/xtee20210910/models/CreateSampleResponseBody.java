// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSampleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSampleResponseBody</p>
 */
public class CreateSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private CreateSampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateSampleResponseBody build() {
            return new CreateSampleResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("communityCount")
        private Integer communityCount;

        @com.aliyun.core.annotation.NameInMap("failCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("recallProbability")
        private String recallProbability;

        @com.aliyun.core.annotation.NameInMap("riskDensity")
        private String riskDensity;

        @com.aliyun.core.annotation.NameInMap("sampleCount")
        private Integer sampleCount;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private ResultObject(Builder builder) {
            this.communityCount = builder.communityCount;
            this.failCount = builder.failCount;
            this.recallProbability = builder.recallProbability;
            this.riskDensity = builder.riskDensity;
            this.sampleCount = builder.sampleCount;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return communityCount
         */
        public Integer getCommunityCount() {
            return this.communityCount;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return recallProbability
         */
        public String getRecallProbability() {
            return this.recallProbability;
        }

        /**
         * @return riskDensity
         */
        public String getRiskDensity() {
            return this.riskDensity;
        }

        /**
         * @return sampleCount
         */
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Integer communityCount; 
            private Integer failCount; 
            private String recallProbability; 
            private String riskDensity; 
            private Integer sampleCount; 
            private Integer successCount; 

            /**
             * communityCount.
             */
            public Builder communityCount(Integer communityCount) {
                this.communityCount = communityCount;
                return this;
            }

            /**
             * failCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * recallProbability.
             */
            public Builder recallProbability(String recallProbability) {
                this.recallProbability = recallProbability;
                return this;
            }

            /**
             * riskDensity.
             */
            public Builder riskDensity(String riskDensity) {
                this.riskDensity = riskDensity;
                return this;
            }

            /**
             * sampleCount.
             */
            public Builder sampleCount(Integer sampleCount) {
                this.sampleCount = sampleCount;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
