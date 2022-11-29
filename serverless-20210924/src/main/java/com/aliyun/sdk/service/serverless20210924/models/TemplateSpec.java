// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateSpec} extends {@link TeaModel}
 *
 * <p>TemplateSpec</p>
 */
public class TemplateSpec extends TeaModel {
    @NameInMap("content")
    @Validation(required = true)
    private String content;

    @NameInMap("contentType")
    @Validation(required = true)
    private String contentType;

    @NameInMap("ramPolicy")
    private String ramPolicy;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private TemplateSpec(Builder builder) {
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.ramPolicy = builder.ramPolicy;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateSpec create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return ramPolicy
     */
    public String getRamPolicy() {
        return this.ramPolicy;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String content; 
        private String contentType; 
        private String ramPolicy; 
        private String type; 

        /**
         * The raw content of the template.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The media type of the template content. At the moment, only "application/hcl+terraform" is supported.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * The content of RAM policy  required for this template.
         */
        public Builder ramPolicy(String ramPolicy) {
            this.ramPolicy = ramPolicy;
            return this;
        }

        /**
         * The type of the applicable resource for this template. Must be either "Environment" or "Service".
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TemplateSpec build() {
            return new TemplateSpec(this);
        } 

    } 

}
