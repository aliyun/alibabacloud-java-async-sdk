// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecommendResponseBody} extends {@link TeaModel}
 *
 * <p>RecommendResponseBody</p>
 */
public class RecommendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private RecommendResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendResponseBody create() {
        return builder().build();
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>This parameter may be used in the debugging process. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Queries the recommendation results of a specified instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;i2i_common_common;NotFound;1673254401;similar product/content of clicked ones;2023-01-09 16:53:21&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The weight of the specified process.</p>
         * 
         * <strong>example:</strong>
         * <p>04707E49-642A-4649-827A-F8EEB07D4C27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The unique ID of the user.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public RecommendResponseBody build() {
            return new RecommendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecommendResponseBody} extends {@link TeaModel}
     *
     * <p>RecommendResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flowWeight")
        private Double flowWeight;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("matchInfo")
        private String matchInfo;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("position")
        private Integer position;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("traceInfo")
        private String traceInfo;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Float weight;

        private Result(Builder builder) {
            this.flowWeight = builder.flowWeight;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.matchInfo = builder.matchInfo;
            this.message = builder.message;
            this.position = builder.position;
            this.traceId = builder.traceId;
            this.traceInfo = builder.traceInfo;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return flowWeight
         */
        public Double getFlowWeight() {
            return this.flowWeight;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return matchInfo
         */
        public String getMatchInfo() {
            return this.matchInfo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return traceInfo
         */
        public String getTraceInfo() {
            return this.traceInfo;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Double flowWeight; 
            private String itemId; 
            private String itemType; 
            private String matchInfo; 
            private String message; 
            private Integer position; 
            private String traceId; 
            private String traceInfo; 
            private Float weight; 

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flowWeight(Double flowWeight) {
                this.flowWeight = flowWeight;
                return this;
            }

            /**
             * <p>The returned results.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The ID of the recommended item.</p>
             * 
             * <strong>example:</strong>
             * <p>item</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>N/A</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder matchInfo(String matchInfo) {
                this.matchInfo = matchInfo;
                return this;
            }

            /**
             * <p>The event tracking ID. This parameter is uploaded together with user behaviors on the recommended item. In this case, the value of this parameter is ali.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The string for filtering during recommendation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The status of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>ali</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>Specifies whether to perform personalized ranking based on the user IDs in the filtering and ranking phases.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;1007.62381.131491.100200300000000:bcb946ed-3f09-4e9b-bf4a-c19862f42231:792783::0:s101:::15:content___130788_stall:item:i2i_common_common:0.0205279946753756:null:null:1673258031504::context__recall_index=156,context__hour=17,context__trigger_num=2::C7EF99C9-6C55-5D45-A8D5-0754082E9DCF:hot_common,i2i_common_common,i2i_swing_common,hot_full:::::&quot;</p>
             */
            public Builder traceInfo(String traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            /**
             * <p>The weight of the recommended item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Float weight) {
                this.weight = weight;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
