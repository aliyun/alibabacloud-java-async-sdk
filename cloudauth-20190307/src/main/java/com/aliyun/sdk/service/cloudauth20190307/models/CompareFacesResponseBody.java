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

        private Builder() {
        } 

        private Builder(CompareFacesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Result of the face comparison.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Error.InternalError</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the response was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.confidenceThresholds = model.confidenceThresholds;
                this.similarityScore = model.similarityScore;
            } 

            /**
             * <p>Confidence thresholds for face comparison. The returned content is a JSON Object, with the specific structure being <code>&quot;key&quot;:&quot;value&quot;</code>.</p>
             * <ul>
             * <li><code>key</code> represents the false acceptance rate, which is the probability of misidentifying someone else as the specified person.</li>
             * <li><code>value</code> is the corresponding threshold.</li>
             * </ul>
             * <blockquote>
             * <p>Regarding the confidence thresholds (confidenceThresholds) in the example:</p>
             * </blockquote>
             * <ul>
             * <li><code>&quot;0.0001&quot;: &quot;90.07&quot;</code> indicates that the threshold is 90.07 when the false acceptance rate is 0.01%.</li>
             * <li><code>&quot;0.001&quot;: &quot;80.01&quot;</code> indicates that the threshold is 80.01 when the false acceptance rate is 0.1%.</li>
             * <li><code>&quot;0.01&quot;: &quot;70.02&quot;</code> indicates that the threshold is 70.02 when the false acceptance rate is 1%.</li>
             * </ul>
             * <p>Confidence thresholds are dynamically provided based on different images and algorithms, so do not persist these thresholds.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;0.0001&quot;:&quot;90.07&quot;,&quot;0.001&quot;:&quot;80.01&quot;,&quot;0.01&quot;:&quot;70.02&quot;}</p>
             */
            public Builder confidenceThresholds(String confidenceThresholds) {
                this.confidenceThresholds = confidenceThresholds;
                return this;
            }

            /**
             * <p>The degree of similarity between the faces in the two images. The value range is [0, 100], with higher values indicating greater similarity.</p>
             * 
             * <strong>example:</strong>
             * <p>98.7913</p>
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
