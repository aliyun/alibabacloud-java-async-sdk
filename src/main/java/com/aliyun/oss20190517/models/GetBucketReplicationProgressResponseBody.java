// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketReplicationProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketReplicationProgressResponseBody</p>
 */
public class GetBucketReplicationProgressResponseBody extends TeaModel {
    @ParentIgnore("ReplicationProgress")
    @NameInMap("Rule")
    private ReplicationRuleProgress rule;


    private GetBucketReplicationProgressResponseBody(Builder builder) {
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketReplicationProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return rule
     */
    public ReplicationRuleProgress rule() {
        return this.rule;
    }

    public static final class Builder {
        private ReplicationRuleProgress rule; 

        /**
         * <p>Rule.</p>
         */
        public Builder rule(ReplicationRuleProgress rule) {
            this.rule = rule;
            return this;
        }

        public GetBucketReplicationProgressResponseBody build() {
            return new GetBucketReplicationProgressResponseBody(this);
        } 

    } 

}
