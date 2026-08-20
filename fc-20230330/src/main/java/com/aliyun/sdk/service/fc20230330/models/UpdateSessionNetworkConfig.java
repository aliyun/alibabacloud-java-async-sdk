// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link UpdateSessionNetworkConfig} extends {@link TeaModel}
 *
 * <p>UpdateSessionNetworkConfig</p>
 */
public class UpdateSessionNetworkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowOut")
    private java.util.List<String> allowOut;

    @com.aliyun.core.annotation.NameInMap("denyOut")
    private java.util.List<String> denyOut;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.Map<String, java.util.List<SessionNetworkRule>> rules;

    private UpdateSessionNetworkConfig(Builder builder) {
        this.allowOut = builder.allowOut;
        this.denyOut = builder.denyOut;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionNetworkConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowOut
     */
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    /**
     * @return denyOut
     */
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    /**
     * @return rules
     */
    public java.util.Map<String, java.util.List<SessionNetworkRule>> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List<String> allowOut; 
        private java.util.List<String> denyOut; 
        private java.util.Map<String, java.util.List<SessionNetworkRule>> rules; 

        private Builder() {
        } 

        private Builder(UpdateSessionNetworkConfig model) {
            this.allowOut = model.allowOut;
            this.denyOut = model.denyOut;
            this.rules = model.rules;
        } 

        /**
         * allowOut.
         */
        public Builder allowOut(java.util.List<String> allowOut) {
            this.allowOut = allowOut;
            return this;
        }

        /**
         * denyOut.
         */
        public Builder denyOut(java.util.List<String> denyOut) {
            this.denyOut = denyOut;
            return this;
        }

        /**
         * rules.
         */
        public Builder rules(java.util.Map<String, java.util.List<SessionNetworkRule>> rules) {
            this.rules = rules;
            return this;
        }

        public UpdateSessionNetworkConfig build() {
            return new UpdateSessionNetworkConfig(this);
        } 

    } 

}
