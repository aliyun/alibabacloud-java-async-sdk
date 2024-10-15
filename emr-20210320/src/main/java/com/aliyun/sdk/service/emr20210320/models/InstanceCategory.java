// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InstanceCategory} extends {@link TeaModel}
 *
 * <p>InstanceCategory</p>
 */
public class InstanceCategory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List < String > keys;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List < String > values;

    private InstanceCategory(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.keys = builder.keys;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceCategory create() {
        return builder().build();
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
    }

    /**
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private String defaultValue; 
        private java.util.List < String > keys; 
        private java.util.List < String > values; 

        /**
         * <p>默认值。</p>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Keys.
         */
        public Builder keys(java.util.List < String > keys) {
            this.keys = keys;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public InstanceCategory build() {
            return new InstanceCategory(this);
        } 

    } 

}
