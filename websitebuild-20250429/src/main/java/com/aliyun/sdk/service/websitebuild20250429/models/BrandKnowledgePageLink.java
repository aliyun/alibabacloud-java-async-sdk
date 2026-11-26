// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgePageLink} extends {@link TeaModel}
 *
 * <p>BrandKnowledgePageLink</p>
 */
public class BrandKnowledgePageLink extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private BrandKnowledgePageLink(Builder builder) {
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgePageLink create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String title; 
        private String url; 

        private Builder() {
        } 

        private Builder(BrandKnowledgePageLink model) {
            this.title = model.title;
            this.url = model.url;
        } 

        /**
         * <p>The web page or content title.</p>
         * 
         * <strong>example:</strong>
         * <p>About Sample Technology</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The original web address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/about">https://example.com/about</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public BrandKnowledgePageLink build() {
            return new BrandKnowledgePageLink(this);
        } 

    } 

}
