// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Body} extends {@link TeaModel}
 *
 * <p>Body</p>
 */
public class Body extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Float confidence;

    private Body(Builder builder) {
        this.boundary = builder.boundary;
        this.confidence = builder.confidence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Body create() {
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
    public Float getConfidence() {
        return this.confidence;
    }

    public static final class Builder {
        private Boundary boundary; 
        private Float confidence; 

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

        public Body build() {
            return new Body(this);
        } 

    } 

}
