// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppToken} extends {@link TeaModel}
 *
 * <p>NeuronAppToken</p>
 */
public class NeuronAppToken extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private NeuronAppToken(Builder builder) {
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppToken create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String token; 

        private Builder() {
        } 

        private Builder(NeuronAppToken model) {
            this.token = model.token;
        } 

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public NeuronAppToken build() {
            return new NeuronAppToken(this);
        } 

    } 

}
