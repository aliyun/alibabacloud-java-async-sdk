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
    private java.util.List < Tag > tagSet;


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
    public java.util.List < Tag > tagSet() {
        return this.tagSet;
    }

    public static final class Builder {
        private java.util.List < Tag > tagSet; 

        /**
         * <p>Tag 的容器</p>
         */
        public Builder tagSet(java.util.List < Tag > tagSet) {
            this.tagSet = tagSet;
            return this;
        }

        public Tagging build() {
            return new Tagging(this);
        } 

    } 

}
