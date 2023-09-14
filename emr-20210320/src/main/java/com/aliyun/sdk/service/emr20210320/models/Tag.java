// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Tag} extends {@link TeaModel}
 *
 * <p>Tag</p>
 */
public class Tag extends TeaModel {
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @NameInMap("Value")
    private String value;

    private Tag(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tag create() {
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
         * 标签键。必填参数，不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或https://。
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * 标签值。非必填，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Tag build() {
            return new Tag(this);
        } 

    } 

}
