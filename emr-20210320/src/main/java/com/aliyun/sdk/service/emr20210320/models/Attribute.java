// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link Attribute} extends {@link TeaModel}
 *
 * <p>Attribute</p>
 */
public class Attribute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private Attribute(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Attribute create() {
        return builder().build();
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

        /**
         * <p>键。</p>
         * 
         * <strong>example:</strong>
         * <p>currentYarnRangerPluginState</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>值。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Attribute build() {
            return new Attribute(this);
        } 

    } 

}
