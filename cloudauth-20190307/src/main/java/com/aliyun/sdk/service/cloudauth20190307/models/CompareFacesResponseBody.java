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
 * {@link CompareFacesResponseBody} extends {@link TeaModel}
 *
 * <p>CompareFacesResponseBody</p>
 */
public class CompareFacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CompareFacesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareFacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CompareFacesResponseBody build() {
            return new CompareFacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CompareFacesResponseBody} extends {@link TeaModel}
     *
     * <p>CompareFacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidenceThresholds")
        private String confidenceThresholds;

        @com.aliyun.core.annotation.NameInMap("SimilarityScore")
        private Float similarityScore;

        private Data(Builder builder) {
            this.confidenceThresholds = builder.confidenceThresholds;
            this.similarityScore = builder.similarityScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return confidenceThresholds
         */
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

        /**
         * @return similarityScore
         */
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public static final class Builder {
            private String confidenceThresholds; 
            private Float similarityScore; 

            /**
             * ConfidenceThresholds.
             */
            public Builder confidenceThresholds(String confidenceThresholds) {
                this.confidenceThresholds = confidenceThresholds;
                return this;
            }

            /**
             * SimilarityScore.
             */
            public Builder similarityScore(Float similarityScore) {
                this.similarityScore = similarityScore;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
