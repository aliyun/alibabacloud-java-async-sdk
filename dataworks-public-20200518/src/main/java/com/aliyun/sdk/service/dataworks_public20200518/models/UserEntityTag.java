// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserEntityTag} extends {@link TeaModel}
 *
 * <p>UserEntityTag</p>
 */
public class UserEntityTag extends TeaModel {
    @NameInMap("TagKey")
    private String tagKey;

    @NameInMap("TagValue")
    private String tagValue;

    private UserEntityTag(Builder builder) {
        this.tagKey = builder.tagKey;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserEntityTag create() {
        return builder().build();
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder {
        private String tagKey; 
        private String tagValue; 

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public UserEntityTag build() {
            return new UserEntityTag(this);
        } 

    } 

}
