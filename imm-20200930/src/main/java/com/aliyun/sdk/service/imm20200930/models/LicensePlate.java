// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LicensePlate} extends {@link TeaModel}
 *
 * <p>LicensePlate</p>
 */
public class LicensePlate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Double confidence;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    private LicensePlate(Builder builder) {
        this.boundary = builder.boundary;
        this.confidence = builder.confidence;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LicensePlate create() {
        return builder().build();
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
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder {
        private Boundary boundary; 
        private Double confidence; 
        private String content; 

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
        public Builder confidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public LicensePlate build() {
            return new LicensePlate(this);
        } 

    } 

}
