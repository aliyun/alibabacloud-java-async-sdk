// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Body model) {
            this.boundary = model.boundary;
            this.confidence = model.confidence;
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

        public Body build() {
            return new Body(this);
        } 

    } 

}
