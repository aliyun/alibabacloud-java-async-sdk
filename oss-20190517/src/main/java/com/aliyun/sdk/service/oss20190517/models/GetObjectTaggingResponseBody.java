// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetObjectTaggingResponseBody} extends {@link TeaModel}
 *
 * <p>GetObjectTaggingResponseBody</p>
 */
public class GetObjectTaggingResponseBody extends TeaModel {
    @ParentIgnore("Tagging")
    @NameInMap("TagSet")
    private TagSet tagSet;

    private GetObjectTaggingResponseBody(Builder builder) {
        this.tagSet = builder.tagSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetObjectTaggingResponseBody create() {
        return builder().build();
    }

    /**
     * @return tagSet
     */
    public TagSet getTagSet() {
        return this.tagSet;
    }

    public static final class Builder {
        private TagSet tagSet; 

        /**
         * TagSet.
         */
        public Builder tagSet(TagSet tagSet) {
            this.tagSet = tagSet;
            return this;
        }

        public GetObjectTaggingResponseBody build() {
            return new GetObjectTaggingResponseBody(this);
        } 

    } 

}
