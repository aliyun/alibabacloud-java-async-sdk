// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestinationConfig} extends {@link TeaModel}
 *
 * <p>DestinationConfig</p>
 */
public class DestinationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("onFailure")
    private Destination onFailure;

    @com.aliyun.core.annotation.NameInMap("onSuccess")
    private Destination onSuccess;

    private DestinationConfig(Builder builder) {
        this.onFailure = builder.onFailure;
        this.onSuccess = builder.onSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DestinationConfig create() {
        return builder().build();
    }

    /**
     * @return onFailure
     */
    public Destination getOnFailure() {
        return this.onFailure;
    }

    /**
     * @return onSuccess
     */
    public Destination getOnSuccess() {
        return this.onSuccess;
    }

    public static final class Builder {
        private Destination onFailure; 
        private Destination onSuccess; 

        /**
         * onFailure.
         */
        public Builder onFailure(Destination onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        /**
         * onSuccess.
         */
        public Builder onSuccess(Destination onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }

        public DestinationConfig build() {
            return new DestinationConfig(this);
        } 

    } 

}
