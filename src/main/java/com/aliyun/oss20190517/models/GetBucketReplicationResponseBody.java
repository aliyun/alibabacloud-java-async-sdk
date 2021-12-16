// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationResponseBody</p>
 */
public class GetBucketReplicationResponseBody extends TeaModel {
    @ParentIgnore("ReplicationConfiguration")
    @NameInMap("Rule")
    private java.util.List < ReplicationRule > rules;


    private GetBucketReplicationResponseBody(Builder builder) {
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return rules
     */
    public java.util.List < ReplicationRule > getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List < ReplicationRule > rules; 

        /**
         * <p>Rule.</p>
         */
        public Builder rules(java.util.List < ReplicationRule > rules) {
            this.rules = rules;
            return this;
        }

        public GetBucketReplicationResponseBody build() {
            return new GetBucketReplicationResponseBody(this);
        } 

    } 

}
