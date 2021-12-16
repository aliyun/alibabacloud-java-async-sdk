// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Tagging} extends {@link TeaModel}
 *
 * <p>Tagging</p>
 */
public class Tagging extends TeaModel {
    @NameInMap("TagSet")
    private TagSet tagSet;


    private Tagging(Builder builder) {
        this.tagSet = builder.tagSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tagging create() {
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
         * <p>the container of tags</p>
         */
        public Builder tagSet(TagSet tagSet) {
            this.tagSet = tagSet;
            return this;
        }

        public Tagging build() {
            return new Tagging(this);
        } 

    } 

}
