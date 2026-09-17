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
 * {@link ApmFilterConfig} extends {@link TeaModel}
 *
 * <p>ApmFilterConfig</p>
 */
public class ApmFilterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ApmFilterConfig(Builder builder) {
        this.key = builder.key;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmFilterConfig create() {
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
        private String key; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(ApmFilterConfig model) {
            this.key = model.key;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The dimension key name of the APM query filter condition. Specifies which dimension to filter by, such as hostname or service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>host.name</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The matching type of the APM query filter condition. Valid values:</p>
         * <ul>
         * <li>ALL: Matches all values.</li>
         * <li>EQ: Exact match.</li>
         * <li>NE: Not equal to.</li>
         * <li>DISABLED: Disables the filter condition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EQ</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The filter value. Can be empty when type is set to ALL or DISABLED.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ApmFilterConfig build() {
            return new ApmFilterConfig(this);
        } 

    } 

}
