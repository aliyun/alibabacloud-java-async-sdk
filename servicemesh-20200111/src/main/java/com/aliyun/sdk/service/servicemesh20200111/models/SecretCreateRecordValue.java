// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SecretCreateRecordValue} extends {@link TeaModel}
 *
 * <p>SecretCreateRecordValue</p>
 */
public class SecretCreateRecordValue extends TeaModel {
    @NameInMap("State")
    private String state;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Message")
    private String message;

    private SecretCreateRecordValue(Builder builder) {
        this.state = builder.state;
        this.clusterId = builder.clusterId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecretCreateRecordValue create() {
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
         * The result of creating the secret. Valid values:
         * <p>
         * 
         * *   `success`: The secret was created.
         * *   `fail`: The secret failed to be created.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The ID of the cluster on the data plane.
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

        public SecretCreateRecordValue build() {
            return new SecretCreateRecordValue(this);
        } 

    } 

}
