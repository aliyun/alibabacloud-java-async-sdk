// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SecretDeleteRecordValue} extends {@link TeaModel}
 *
 * <p>SecretDeleteRecordValue</p>
 */
public class SecretDeleteRecordValue extends TeaModel {
    @NameInMap("State")
    private String state;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Message")
    private String message;

    private SecretDeleteRecordValue(Builder builder) {
        this.state = builder.state;
        this.clusterId = builder.clusterId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecretDeleteRecordValue create() {
        return builder().build();
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String state; 
        private String clusterId; 
        private String message; 

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public SecretDeleteRecordValue build() {
            return new SecretDeleteRecordValue(this);
        } 

    } 

}
