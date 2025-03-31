// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link TagResourceInput} extends {@link TeaModel}
 *
 * <p>TagResourceInput</p>
 */
public class TagResourceInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("resourceArn")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String resourceArn;

    @com.aliyun.core.annotation.NameInMap("tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, String> tags;

    private TagResourceInput(Builder builder) {
        this.resourceArn = builder.resourceArn;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourceInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String resourceArn; 
        private java.util.Map<String, String> tags; 

        private Builder() {
        } 

        private Builder(TagResourceInput model) {
            this.resourceArn = model.resourceArn;
            this.tags = model.tags;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:xxx:functions/f1</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }

        public TagResourceInput build() {
            return new TagResourceInput(this);
        } 

    } 

}
