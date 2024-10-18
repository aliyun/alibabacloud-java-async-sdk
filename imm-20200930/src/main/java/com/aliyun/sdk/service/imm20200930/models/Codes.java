// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Codes} extends {@link TeaModel}
 *
 * <p>Codes</p>
 */
public class Codes extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Float confidence;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Codes(Builder builder) {
        this.boundary = builder.boundary;
        this.confidence = builder.confidence;
        this.content = builder.content;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Codes create() {
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

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boundary boundary; 
        private Float confidence; 
        private String content; 
        private String type; 

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

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Codes build() {
            return new Codes(this);
        } 

    } 

}
