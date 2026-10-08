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

        private Builder() {
        } 

        private Builder(OCRContents model) {
            this.boundary = model.boundary;
            this.confidence = model.confidence;
            this.contents = model.contents;
            this.language = model.language;
        } 

        /**
         * <p>The boundary information.</p>
         */
        public Builder boundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }

        /**
         * <p>The confidence level of the content. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8254936695098877</p>
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>欢迎使用智能媒体管理</p>
         */
        public Builder contents(String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>The BCP 47 language code. This parameter is not supported in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-hans</p>
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
