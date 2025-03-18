// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetNodeConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result set.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetNodeConfigResponseBody build() {
            return new GetNodeConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeConfigResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.active = model.active;
                this.dataDuplicateNumber = model.dataDuplicateNumber;
                this.dataFragmentNumber = model.dataFragmentNumber;
                this.flowRatio = model.flowRatio;
                this.minServicePercent = model.minServicePercent;
                this.published = model.published;
            } 

            /**
             * <p>Indicates whether the index is effective online.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The number of data replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dataDuplicateNumber(Integer dataDuplicateNumber) {
                this.dataDuplicateNumber = dataDuplicateNumber;
                return this;
            }

            /**
             * <p>The number of data shards.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dataFragmentNumber(Integer dataFragmentNumber) {
                this.dataFragmentNumber = dataFragmentNumber;
                return this;
            }

            /**
             * <p>The traffic percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flowRatio(Integer flowRatio) {
                this.flowRatio = flowRatio;
                return this;
            }

            /**
             * <p>The minimum service ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder minServicePercent(Integer minServicePercent) {
                this.minServicePercent = minServicePercent;
                return this;
            }

            /**
             * <p>Indicates whether the cluster is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
