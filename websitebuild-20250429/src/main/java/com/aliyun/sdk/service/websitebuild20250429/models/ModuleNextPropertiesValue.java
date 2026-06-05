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
 * {@link ModuleNextPropertiesValue} extends {@link TeaModel}
 *
 * <p>ModuleNextPropertiesValue</p>
 */
public class ModuleNextPropertiesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<Values> values;

    private ModuleNextPropertiesValue(Builder builder) {
        this.code = builder.code;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleNextPropertiesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return values
     */
    public java.util.List<Values> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Values> values; 

        private Builder() {
        } 

        private Builder(ModuleNextPropertiesValue model) {
            this.code = model.code;
            this.values = model.values;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<Values> values) {
            this.values = values;
            return this;
        }

        public ModuleNextPropertiesValue build() {
            return new ModuleNextPropertiesValue(this);
        } 

    } 

    /**
     * 
     * {@link ModuleNextPropertiesValue} extends {@link TeaModel}
     *
     * <p>ModuleNextPropertiesValue</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Values(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.value = model.value;
            } 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
}
