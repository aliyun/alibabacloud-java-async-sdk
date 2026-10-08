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

        private Builder() {
        } 

        private Builder(Codes model) {
            this.boundary = model.boundary;
            this.confidence = model.confidence;
            this.content = model.content;
            this.type = model.type;
        } 

        /**
         * <p>The boundary of the code.</p>
         */
        public Builder boundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }

        /**
         * <p>The confidence level of the code. A greater value indicates a higher confidence level. A value exceeding 0.8 signifies a high degree of confidence in the result.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * <p>The content of the code.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The type of the code.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>qrcode</li>
         * <li>barcode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qrcode</p>
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
