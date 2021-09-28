// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReplicationRuleProgress} extends {@link TeaModel}
 *
 * <p>ReplicationRuleProgress</p>
 */
public class ReplicationRuleProgress extends TeaModel {
    @NameInMap("ID")
    private String ID;

    @NameInMap("PrefixSet")
    private ReplicationPrefixSet prefixSet;

    @NameInMap("Action")
    private String action;


    private ReplicationRuleProgress(Builder builder) {
        this.ID = builder.ID;
        this.prefixSet = builder.prefixSet;
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationRuleProgress create() {
        return builder().build();
    }

    /**
     * @return ID
     */
    public String ID() {
        return this.ID;
    }

    /**
     * @return prefixSet
     */
    public ReplicationPrefixSet prefixSet() {
        return this.prefixSet;
    }

    /**
     * @return action
     */
    public String action() {
        return this.action;
    }

    public static final class Builder {
        private String ID; 
        private ReplicationPrefixSet prefixSet; 
        private String action; 

        /**
         * <p>id</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        /**
         * <p>PrefixSet.</p>
         */
        public Builder prefixSet(ReplicationPrefixSet prefixSet) {
            this.prefixSet = prefixSet;
            return this;
        }

        /**
         * <p>action</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        public ReplicationRuleProgress build() {
            return new ReplicationRuleProgress(this);
        } 

    } 

}
