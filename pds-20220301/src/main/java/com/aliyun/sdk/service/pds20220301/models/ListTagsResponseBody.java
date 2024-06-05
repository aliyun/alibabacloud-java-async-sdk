// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsResponseBody</p>
 */
public class ListTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < ImageTag > tags;

    private ListTagsResponseBody(Builder builder) {
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return tags
     */
    public java.util.List < ImageTag > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.List < ImageTag > tags; 

        /**
         * The information about the tags.
         */
        public Builder tags(java.util.List < ImageTag > tags) {
            this.tags = tags;
            return this;
        }

        public ListTagsResponseBody build() {
            return new ListTagsResponseBody(this);
        } 

    } 

}
