// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssInstanceProperty} extends {@link TeaModel}
 *
 * <p>CssInstanceProperty</p>
 */
public class CssInstanceProperty extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("globalKey")
    private String globalKey;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("unit")
    private String unit;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private CssInstanceProperty(Builder builder) {
        this.code = builder.code;
        this.globalKey = builder.globalKey;
        this.name = builder.name;
        this.unit = builder.unit;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssInstanceProperty create() {
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
     * @return globalKey
     */
    public String getGlobalKey() {
        return this.globalKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String code; 
        private String globalKey; 
        private String name; 
        private String unit; 
        private String value; 

        private Builder() {
        } 

        private Builder(CssInstanceProperty model) {
            this.code = model.code;
            this.globalKey = model.globalKey;
            this.name = model.name;
            this.unit = model.unit;
            this.value = model.value;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * globalKey.
         */
        public Builder globalKey(String globalKey) {
            this.globalKey = globalKey;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public CssInstanceProperty build() {
            return new CssInstanceProperty(this);
        } 

    } 

}
