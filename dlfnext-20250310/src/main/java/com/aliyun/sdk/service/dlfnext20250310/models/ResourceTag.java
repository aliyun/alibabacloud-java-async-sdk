// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ResourceTag} extends {@link TeaModel}
 *
 * <p>ResourceTag</p>
 */
public class ResourceTag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String value;

    private ResourceTag(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceTag create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String value; 

        private Builder() {
        } 

        private Builder(ResourceTag model) {
            this.key = model.key;
            this.value = model.value;
        } 

        /**
         * <p>The tag key, up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The tag value, up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>recommendation</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ResourceTag build() {
            return new ResourceTag(this);
        } 

    } 

}
