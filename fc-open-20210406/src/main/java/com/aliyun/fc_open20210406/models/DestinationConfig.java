// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DestinationConfig} extends {@link TeaModel}
 *
 * <p>DestinationConfig</p>
 */
public class DestinationConfig extends TeaModel {
    @NameInMap("onFailure")
    private Destination onFailure;

    @NameInMap("onSuccess")
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
         * <p>onFailure.</p>
         */
        public Builder onFailure(Destination onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        /**
         * <p>onSuccess.</p>
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
