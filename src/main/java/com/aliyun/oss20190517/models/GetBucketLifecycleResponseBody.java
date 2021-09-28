// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLifecycleResponseBody</p>
 */
public class GetBucketLifecycleResponseBody extends TeaModel {
    @ParentIgnore("LifecycleConfiguration")
    @NameInMap("Rule")
    private LifecycleRule rule;


    private GetBucketLifecycleResponseBody(Builder builder) {
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLifecycleResponseBody create() {
        return builder().build();
    }

    /**
     * @return rule
     */
    public LifecycleRule rule() {
        return this.rule;
    }

    public static final class Builder {
        private LifecycleRule rule; 

        /**
         * <p>Rule.</p>
         */
        public Builder rule(LifecycleRule rule) {
            this.rule = rule;
            return this;
        }

        public GetBucketLifecycleResponseBody build() {
            return new GetBucketLifecycleResponseBody(this);
        } 

    } 

}
