// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
    @NameInMap("tagKey")
    private String tagKey;

    @NameInMap("tagValue")
    private String tagValue;

    private Tag(Builder builder) {
        this.tagKey = builder.tagKey;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tag create() {
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
         * 标签Key
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * 标签Value
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Tag build() {
            return new Tag(this);
        } 

    } 

}
