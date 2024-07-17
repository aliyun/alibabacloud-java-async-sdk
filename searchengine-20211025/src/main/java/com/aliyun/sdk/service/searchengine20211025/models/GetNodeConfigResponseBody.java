// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeConfigResponseBody</p>
 */
public class GetNodeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetNodeConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeConfigResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result set.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetNodeConfigResponseBody build() {
            return new GetNodeConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("dataDuplicateNumber")
        private Integer dataDuplicateNumber;

        @com.aliyun.core.annotation.NameInMap("dataFragmentNumber")
        private Integer dataFragmentNumber;

        @com.aliyun.core.annotation.NameInMap("flowRatio")
        private Integer flowRatio;

        @com.aliyun.core.annotation.NameInMap("minServicePercent")
        private Integer minServicePercent;

        @com.aliyun.core.annotation.NameInMap("published")
        private Boolean published;

        private Result(Builder builder) {
            this.active = builder.active;
            this.dataDuplicateNumber = builder.dataDuplicateNumber;
            this.dataFragmentNumber = builder.dataFragmentNumber;
            this.flowRatio = builder.flowRatio;
            this.minServicePercent = builder.minServicePercent;
            this.published = builder.published;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return dataDuplicateNumber
         */
        public Integer getDataDuplicateNumber() {
            return this.dataDuplicateNumber;
        }

        /**
         * @return dataFragmentNumber
         */
        public Integer getDataFragmentNumber() {
            return this.dataFragmentNumber;
        }

        /**
         * @return flowRatio
         */
        public Integer getFlowRatio() {
            return this.flowRatio;
        }

        /**
         * @return minServicePercent
         */
        public Integer getMinServicePercent() {
            return this.minServicePercent;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        public static final class Builder {
            private Boolean active; 
            private Integer dataDuplicateNumber; 
            private Integer dataFragmentNumber; 
            private Integer flowRatio; 
            private Integer minServicePercent; 
            private Boolean published; 

            /**
             * Indicates whether the index is effective online.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The number of data replicas.
             */
            public Builder dataDuplicateNumber(Integer dataDuplicateNumber) {
                this.dataDuplicateNumber = dataDuplicateNumber;
                return this;
            }

            /**
             * The number of data shards.
             */
            public Builder dataFragmentNumber(Integer dataFragmentNumber) {
                this.dataFragmentNumber = dataFragmentNumber;
                return this;
            }

            /**
             * The traffic percentage.
             */
            public Builder flowRatio(Integer flowRatio) {
                this.flowRatio = flowRatio;
                return this;
            }

            /**
             * The minimum service ratio.
             */
            public Builder minServicePercent(Integer minServicePercent) {
                this.minServicePercent = minServicePercent;
                return this;
            }

            /**
             * Indicates whether the cluster is mounted.
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
