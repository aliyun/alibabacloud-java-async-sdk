// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ColdStartRankResponseBody} extends {@link TeaModel}
 *
 * <p>ColdStartRankResponseBody</p>
 */
public class ColdStartRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ColdStartRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColdStartRankResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ColdStartRankResponseBody build() {
            return new ColdStartRankResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ColdStartRankResponseBody} extends {@link TeaModel}
     *
     * <p>ColdStartRankResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("traceInfo")
        private String traceInfo;

        private Result(Builder builder) {
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.traceInfo = builder.traceInfo;
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
         * @return traceInfo
         */
        public String getTraceInfo() {
            return this.traceInfo;
        }

        public static final class Builder {
            private String itemId; 
            private String itemType; 
            private String traceInfo; 

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * itemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * traceInfo.
             */
            public Builder traceInfo(String traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
