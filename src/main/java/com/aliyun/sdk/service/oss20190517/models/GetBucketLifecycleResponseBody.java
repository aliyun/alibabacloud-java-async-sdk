// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLifecycleResponseBody</p>
 */
public class GetBucketLifecycleResponseBody extends TeaModel {
    @ParentIgnore("LifecycleConfiguration")
    @NameInMap("Rule")
    private java.util.List < LifecycleRule > rules;

    private GetBucketLifecycleResponseBody(Builder builder) {
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLifecycleResponseBody create() {
        return builder().build();
    }

    /**
     * @return rules
     */
    public java.util.List < LifecycleRule > getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List < LifecycleRule > rules; 

        /**
         * Rule.
         */
        public Builder rules(java.util.List < LifecycleRule > rules) {
            this.rules = rules;
            return this;
        }

        public GetBucketLifecycleResponseBody build() {
            return new GetBucketLifecycleResponseBody(this);
        } 

    } 

}
