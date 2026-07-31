// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link BindingConfigAgentsIntentFewShotConfigValue} extends {@link TeaModel}
 *
 * <p>BindingConfigAgentsIntentFewShotConfigValue</p>
 */
public class BindingConfigAgentsIntentFewShotConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    private BindingConfigAgentsIntentFewShotConfigValue(Builder builder) {
        this.query = builder.query;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindingConfigAgentsIntentFewShotConfigValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static final class Builder {
        private String query; 
        private java.util.Map<String, ?> parameters; 

        private Builder() {
        } 

        private Builder(BindingConfigAgentsIntentFewShotConfigValue model) {
            this.query = model.query;
            this.parameters = model.parameters;
        } 

        /**
         * Query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        public BindingConfigAgentsIntentFewShotConfigValue build() {
            return new BindingConfigAgentsIntentFewShotConfigValue(this);
        } 

    } 

}
