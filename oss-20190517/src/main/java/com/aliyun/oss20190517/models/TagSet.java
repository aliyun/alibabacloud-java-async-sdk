// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link TagSet} extends {@link TeaModel}
 *
 * <p>TagSet</p>
 */
public class TagSet extends TeaModel {
    @NameInMap("Tag")
    private java.util.List < Tag > tags;


    private TagSet(Builder builder) {
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagSet create() {
        return builder().build();
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.List < Tag > tags; 

        /**
         * <p>A short description of struct</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        public TagSet build() {
            return new TagSet(this);
        } 

    } 

}
