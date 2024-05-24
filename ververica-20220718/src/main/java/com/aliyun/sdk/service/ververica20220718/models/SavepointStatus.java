// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SavepointStatus} extends {@link TeaModel}
 *
 * <p>SavepointStatus</p>
 */
public class SavepointStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failure")
    private SavepointFailure failure;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private SavepointStatus(Builder builder) {
        this.failure = builder.failure;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SavepointStatus create() {
        return builder().build();
    }

    /**
     * @return failure
     */
    public SavepointFailure getFailure() {
        return this.failure;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private SavepointFailure failure; 
        private String state; 

        /**
         * failure.
         */
        public Builder failure(SavepointFailure failure) {
            this.failure = failure;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public SavepointStatus build() {
            return new SavepointStatus(this);
        } 

    } 

}
