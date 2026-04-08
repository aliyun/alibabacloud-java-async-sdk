// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link EnvironmentVariable} extends {@link TeaModel}
 *
 * <p>EnvironmentVariable</p>
 */
public class EnvironmentVariable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private EnvironmentVariable(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentVariable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String value; 

        private Builder() {
        } 

        private Builder(EnvironmentVariable model) {
            this.description = model.description;
            this.name = model.name;
            this.value = model.value;
        } 

        /**
         * <p>环境变量的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>A configuration key</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>环境变量的名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MY_KEY</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>环境变量的值</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public EnvironmentVariable build() {
            return new EnvironmentVariable(this);
        } 

    } 

}
