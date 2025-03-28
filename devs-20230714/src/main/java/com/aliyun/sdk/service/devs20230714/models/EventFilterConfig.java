// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EventFilterConfig} extends {@link TeaModel}
 *
 * <p>EventFilterConfig</p>
 */
public class EventFilterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private BranchFilter branch;

    private EventFilterConfig(Builder builder) {
        this.branch = builder.branch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventFilterConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branch
     */
    public BranchFilter getBranch() {
        return this.branch;
    }

    public static final class Builder {
        private BranchFilter branch; 

        private Builder() {
        } 

        private Builder(EventFilterConfig model) {
            this.branch = model.branch;
        } 

        /**
         * branch.
         */
        public Builder branch(BranchFilter branch) {
            this.branch = branch;
            return this;
        }

        public EventFilterConfig build() {
            return new EventFilterConfig(this);
        } 

    } 

}
