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
 * {@link SecretDeleteRecordValue} extends {@link TeaModel}
 *
 * <p>SecretDeleteRecordValue</p>
 */
public class SecretDeleteRecordValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Message")
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

        private Builder(SecretDeleteRecordValue model) {
            this.state = model.state;
            this.clusterId = model.clusterId;
            this.message = model.message;
        } 

        /**
         * <p>The result of deleting the secret. Valid values:</p>
         * <ul>
         * <li><code>success</code>: The secret was deleted.</li>
         * <li><code>fail</code>: The secret failed to be deleted.</li>
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
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

        public SecretDeleteRecordValue build() {
            return new SecretDeleteRecordValue(this);
        } 

    } 

}
