// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link EnvironmentVariablesValue} extends {@link TeaModel}
 *
 * <p>EnvironmentVariablesValue</p>
 */
public class EnvironmentVariablesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private EnvironmentVariablesValue(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentVariablesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(EnvironmentVariablesValue model) {
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The environment variable type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>plain_text</code>: plain text</li>
         * <li><code>secret_text</code>: encrypted text</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>plain_text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The environment variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public EnvironmentVariablesValue build() {
            return new EnvironmentVariablesValue(this);
        } 

    } 

}
