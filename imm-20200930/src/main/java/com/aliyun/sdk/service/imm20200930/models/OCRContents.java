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
 * {@link OCRContents} extends {@link TeaModel}
 *
 * <p>OCRContents</p>
 */
public class OCRContents extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Float confidence;

    @com.aliyun.core.annotation.NameInMap("Contents")
    private String contents;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private OCRContents(Builder builder) {
        this.boundary = builder.boundary;
        this.confidence = builder.confidence;
        this.contents = builder.contents;
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OCRContents create() {
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
     * @return contents
     */
    public String getContents() {
        return this.contents;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder {
        private Boundary boundary; 
        private Float confidence; 
        private String contents; 
        private String language; 

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
         * Contents.
         */
        public Builder contents(String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public OCRContents build() {
            return new OCRContents(this);
        } 

    } 

}
