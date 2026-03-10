// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PromptTemplateItem} extends {@link TeaModel}
 *
 * <p>PromptTemplateItem</p>
 */
public class PromptTemplateItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    private PromptTemplateItem(Builder builder) {
        this.content = builder.content;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromptTemplateItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private String content; 
        private String role; 

        private Builder() {
        } 

        private Builder(PromptTemplateItem model) {
            this.content = model.content;
            this.role = model.role;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public PromptTemplateItem build() {
            return new PromptTemplateItem(this);
        } 

    } 

}
