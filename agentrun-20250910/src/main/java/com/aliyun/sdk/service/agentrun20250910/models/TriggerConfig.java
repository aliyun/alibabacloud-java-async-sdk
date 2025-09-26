// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link TriggerConfig} extends {@link TeaModel}
 *
 * <p>TriggerConfig</p>
 */
public class TriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    private TriggerConfig(Builder builder) {
        this.authType = builder.authType;
        this.methods = builder.methods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return methods
     */
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public static final class Builder {
        private String authType; 
        private java.util.List<String> methods; 

        private Builder() {
        } 

        private Builder(TriggerConfig model) {
            this.authType = model.authType;
            this.methods = model.methods;
        } 

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * methods.
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        public TriggerConfig build() {
            return new TriggerConfig(this);
        } 

    } 

}
