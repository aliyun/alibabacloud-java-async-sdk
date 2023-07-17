// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChannelProperty} extends {@link TeaModel}
 *
 * <p>ChannelProperty</p>
 */
public class ChannelProperty extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private ChannelProperty(Builder builder) {
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelProperty create() {
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

        public ChannelProperty build() {
            return new ChannelProperty(this);
        } 

    } 

}
