// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link Tag} extends {@link TeaModel}
 *
 * <p>Tag</p>
 */
public class Tag extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("tagKey")
    private String tagKey;

    @com.aliyun.core.annotation.NameInMap("tagValue")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(Tag model) {
            this.tagKey = model.tagKey;
            this.tagValue = model.tagValue;
        } 

        /**
         * tagKey.
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        /**
         * tagValue.
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
