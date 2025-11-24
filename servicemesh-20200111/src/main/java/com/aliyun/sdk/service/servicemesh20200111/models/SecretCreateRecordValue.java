// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link SecretCreateRecordValue} extends {@link TeaModel}
 *
 * <p>SecretCreateRecordValue</p>
 */
public class SecretCreateRecordValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Message")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SecretCreateRecordValue model) {
            this.state = model.state;
            this.clusterId = model.clusterId;
            this.message = model.message;
        } 

        /**
         * <p>The result of creating the secret. Valid values:</p>
         * <ul>
         * <li><code>success</code>: The secret was created.</li>
         * <li><code>fail</code>: The secret failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The ID of the cluster on the data plane.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8xe10d****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The error message returned when exceptions occur. Otherwise, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
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
