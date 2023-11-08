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
         * The result of deleting the secret. Valid values:
         * <p>
         * 
         * *   `success`: The secret was deleted.
         * *   `fail`: The secret failed to be deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The error message returned when exceptions occur. Otherwise, an empty value is returned.
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
