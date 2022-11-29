// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerConfig} extends {@link TeaModel}
 *
 * <p>TriggerConfig</p>
 */
public class TriggerConfig extends TeaModel {
    @NameInMap("branch")
    private String branch;

    @NameInMap("commit")
    private String commit;

    @NameInMap("on")
    private String on;

    private TriggerConfig(Builder builder) {
        this.branch = builder.branch;
        this.commit = builder.commit;
        this.on = builder.on;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerConfig create() {
        return builder().build();
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commit
     */
    public String getCommit() {
        return this.commit;
    }

    /**
     * @return on
     */
    public String getOn() {
        return this.on;
    }

    public static final class Builder {
        private String branch; 
        private String commit; 
        private String on; 

        /**
         * 触发分支
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * 触发commit
         */
        public Builder commit(String commit) {
            this.commit = commit;
            return this;
        }

        /**
         * 触发条件
         */
        public Builder on(String on) {
            this.on = on;
            return this;
        }

        public TriggerConfig build() {
            return new TriggerConfig(this);
        } 

    } 

}
