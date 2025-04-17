// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link FastFailPolicy} extends {@link TeaModel}
 *
 * <p>FastFailPolicy</p>
 */
public class FastFailPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    private FastFailPolicy(Builder builder) {
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FastFailPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder {
        private String action; 

        private Builder() {
        } 

        private Builder(FastFailPolicy model) {
            this.action = model.action;
        } 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        public FastFailPolicy build() {
            return new FastFailPolicy(this);
        } 

    } 

}
