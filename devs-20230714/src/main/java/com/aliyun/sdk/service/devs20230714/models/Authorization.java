// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link Authorization} extends {@link TeaModel}
 *
 * <p>Authorization</p>
 */
public class Authorization extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private Authorization(Builder builder) {
        this.parameters = builder.parameters;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Authorization create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Parameters parameters; 
        private String type; 

        private Builder() {
        } 

        private Builder(Authorization model) {
            this.parameters = model.parameters;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APIKey</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Authorization build() {
            return new Authorization(this);
        } 

    } 

    /**
     * 
     * {@link Authorization} extends {@link TeaModel}
     *
     * <p>Authorization</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeyParameter")
        private APIKeyAuthParameter apiKeyParameter;

        private Parameters(Builder builder) {
            this.apiKeyParameter = builder.apiKeyParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return apiKeyParameter
         */
        public APIKeyAuthParameter getApiKeyParameter() {
            return this.apiKeyParameter;
        }

        public static final class Builder {
            private APIKeyAuthParameter apiKeyParameter; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.apiKeyParameter = model.apiKeyParameter;
            } 

            /**
             * apiKeyParameter.
             */
            public Builder apiKeyParameter(APIKeyAuthParameter apiKeyParameter) {
                this.apiKeyParameter = apiKeyParameter;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
