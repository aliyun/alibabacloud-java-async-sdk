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
 * {@link LabelMatcher} extends {@link TeaModel}
 *
 * <p>LabelMatcher</p>
 */
public class LabelMatcher extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private LabelMatcher(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelMatcher create() {
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

        private Builder(LabelMatcher model) {
            this.key = model.key;
            this.value = model.value;
        } 

        /**
         * <p>The key name of the label matcher. This parameter specifies the label dimension identity to match.</p>
         * 
         * <strong>example:</strong>
         * <p>_cms_workspace</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The match value of the label matcher. This parameter is used together with key to specify the value that the label key must match.</p>
         * 
         * <strong>example:</strong>
         * <p>test-123</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public LabelMatcher build() {
            return new LabelMatcher(this);
        } 

    } 

}
