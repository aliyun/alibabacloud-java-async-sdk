// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DNSOption} extends {@link TeaModel}
 *
 * <p>DNSOption</p>
 */
public class DNSOption extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("value")
    private String value;

    private DNSOption(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DNSOption create() {
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
         * DNS option 名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * DNS option 值
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public DNSOption build() {
            return new DNSOption(this);
        } 

    } 

}
