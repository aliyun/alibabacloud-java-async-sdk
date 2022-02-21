// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendResponseBody} extends {@link TeaModel}
 *
 * <p>RecommendResponseBody</p>
 */
public class RecommendResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public RecommendResponseBody build() {
            return new RecommendResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ItemId")
        private String itemId;

        @NameInMap("ItemType")
        private String itemType;

        @NameInMap("MatchInfo")
        private String matchInfo;

        @NameInMap("Position")
        private Integer position;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("TraceInfo")
        private String traceInfo;

        @NameInMap("Weight")
        private Float weight;

        private Result(Builder builder) {
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.matchInfo = builder.matchInfo;
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
            private String itemId; 
            private String itemType; 
            private String matchInfo; 
            private Integer position; 
            private String traceId; 
            private String traceInfo; 
            private Float weight; 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * MatchInfo.
             */
            public Builder matchInfo(String matchInfo) {
                this.matchInfo = matchInfo;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * TraceInfo.
             */
            public Builder traceInfo(String traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            /**
             * Weight.
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
