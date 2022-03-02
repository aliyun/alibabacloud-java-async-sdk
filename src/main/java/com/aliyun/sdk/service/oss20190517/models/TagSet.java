// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
         * A short description of struct
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
