// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReplicationConfiguration} extends {@link TeaModel}
 *
 * <p>ReplicationConfiguration</p>
 */
public class ReplicationConfiguration extends TeaModel {
    @NameInMap("Rule")
    private ReplicationRule rule;


    private ReplicationConfiguration(Builder builder) {
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationConfiguration create() {
        return builder().build();
    }

    /**
     * @return rule
     */
    public ReplicationRule rule() {
        return this.rule;
    }

    public static final class Builder {
        private ReplicationRule rule; 

        /**
         * <p>Rule.</p>
         */
        public Builder rule(ReplicationRule rule) {
            this.rule = rule;
            return this;
        }

        public ReplicationConfiguration build() {
            return new ReplicationConfiguration(this);
        } 

    } 

}
