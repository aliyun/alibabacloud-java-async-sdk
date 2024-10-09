// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopJobRequestBody} extends {@link TeaModel}
 *
 * <p>StopJobRequestBody</p>
 */
public class StopJobRequestBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("stopStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stopStrategy;

    private StopJobRequestBody(Builder builder) {
        this.stopStrategy = builder.stopStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopJobRequestBody create() {
        return builder().build();
    }

    /**
     * @return stopStrategy
     */
    public String getStopStrategy() {
        return this.stopStrategy;
    }

    public static final class Builder {
        private String stopStrategy; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder stopStrategy(String stopStrategy) {
            this.stopStrategy = stopStrategy;
            return this;
        }

        public StopJobRequestBody build() {
            return new StopJobRequestBody(this);
        } 

    } 

}
