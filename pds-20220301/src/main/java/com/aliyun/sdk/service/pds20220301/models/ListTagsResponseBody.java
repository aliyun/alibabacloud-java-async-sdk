// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsResponseBody</p>
 */
public class ListTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<ImageTag> tags;

    private ListTagsResponseBody(Builder builder) {
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tags
     */
    public java.util.List<ImageTag> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private java.util.List<ImageTag> tags; 

        private Builder() {
        } 

        private Builder(ListTagsResponseBody model) {
            this.tags = model.tags;
        } 

        /**
         * <p>The information about the tags.</p>
         */
        public Builder tags(java.util.List<ImageTag> tags) {
            this.tags = tags;
            return this;
        }

        public ListTagsResponseBody build() {
            return new ListTagsResponseBody(this);
        } 

    } 

}
