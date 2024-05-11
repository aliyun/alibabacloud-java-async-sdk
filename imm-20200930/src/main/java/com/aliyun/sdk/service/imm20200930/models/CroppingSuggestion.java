// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CroppingSuggestion} extends {@link TeaModel}
 *
 * <p>CroppingSuggestion</p>
 */
public class CroppingSuggestion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AspectRatio")
    private String aspectRatio;

    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Float confidence;

    private CroppingSuggestion(Builder builder) {
        this.aspectRatio = builder.aspectRatio;
        this.boundary = builder.boundary;
        this.confidence = builder.confidence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CroppingSuggestion create() {
        return builder().build();
    }

    /**
     * @return aspectRatio
     */
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * @return boundary
     */
    public Boundary getBoundary() {
        return this.boundary;
    }

    /**
     * @return confidence
     */
    public Float getConfidence() {
        return this.confidence;
    }

    public static final class Builder {
        private String aspectRatio; 
        private Boundary boundary; 
        private Float confidence; 

        /**
         * AspectRatio.
         */
        public Builder aspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * Boundary.
         */
        public Builder boundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }

        /**
         * Confidence.
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }

        public CroppingSuggestion build() {
            return new CroppingSuggestion(this);
        } 

    } 

}
