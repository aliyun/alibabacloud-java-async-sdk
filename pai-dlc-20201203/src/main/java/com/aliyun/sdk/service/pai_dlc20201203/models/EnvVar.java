// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link EnvVar} extends {@link TeaModel}
 *
 * <p>EnvVar</p>
 */
public class EnvVar extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private EnvVar(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvVar create() {
        return builder().build();
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
        private String name; 
        private String value; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public EnvVar build() {
            return new EnvVar(this);
        } 

    } 

}
