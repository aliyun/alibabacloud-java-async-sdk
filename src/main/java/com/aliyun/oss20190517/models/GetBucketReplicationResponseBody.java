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
    private java.util.List < ReplicationRule > rule;


    private GetBucketReplicationResponseBody(Builder builder) {
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return rule
     */
    public java.util.List < ReplicationRule > rule() {
        return this.rule;
    }

    public static final class Builder {
        private java.util.List < ReplicationRule > rule; 

        /**
         * <p>Rule.</p>
         */
        public Builder rule(java.util.List < ReplicationRule > rule) {
            this.rule = rule;
            return this;
        }

        public GetBucketReplicationResponseBody build() {
            return new GetBucketReplicationResponseBody(this);
        } 

    } 

}
