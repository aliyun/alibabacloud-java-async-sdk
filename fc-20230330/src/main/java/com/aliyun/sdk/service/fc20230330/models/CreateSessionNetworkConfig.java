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
 * {@link CreateSessionNetworkConfig} extends {@link TeaModel}
 *
 * <p>CreateSessionNetworkConfig</p>
 */
public class CreateSessionNetworkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowOut")
    private java.util.List<String> allowOut;

    @com.aliyun.core.annotation.NameInMap("allowPublicTraffic")
    private Boolean allowPublicTraffic;

    @com.aliyun.core.annotation.NameInMap("denyOut")
    private java.util.List<String> denyOut;

    @com.aliyun.core.annotation.NameInMap("maskRequestHost")
    private String maskRequestHost;

    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.Map<String, java.util.List<SessionNetworkRule>> rules;

    private CreateSessionNetworkConfig(Builder builder) {
        this.allowOut = builder.allowOut;
        this.allowPublicTraffic = builder.allowPublicTraffic;
        this.denyOut = builder.denyOut;
        this.maskRequestHost = builder.maskRequestHost;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionNetworkConfig create() {
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
     * @return allowPublicTraffic
     */
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    /**
     * @return denyOut
     */
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    /**
     * @return maskRequestHost
     */
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

    /**
     * @return rules
     */
    public java.util.Map<String, java.util.List<SessionNetworkRule>> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List<String> allowOut; 
        private Boolean allowPublicTraffic; 
        private java.util.List<String> denyOut; 
        private String maskRequestHost; 
        private java.util.Map<String, java.util.List<SessionNetworkRule>> rules; 

        private Builder() {
        } 

        private Builder(CreateSessionNetworkConfig model) {
            this.allowOut = model.allowOut;
            this.allowPublicTraffic = model.allowPublicTraffic;
            this.denyOut = model.denyOut;
            this.maskRequestHost = model.maskRequestHost;
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
         * allowPublicTraffic.
         */
        public Builder allowPublicTraffic(Boolean allowPublicTraffic) {
            this.allowPublicTraffic = allowPublicTraffic;
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
         * maskRequestHost.
         */
        public Builder maskRequestHost(String maskRequestHost) {
            this.maskRequestHost = maskRequestHost;
            return this;
        }

        /**
         * rules.
         */
        public Builder rules(java.util.Map<String, java.util.List<SessionNetworkRule>> rules) {
            this.rules = rules;
            return this;
        }

        public CreateSessionNetworkConfig build() {
            return new CreateSessionNetworkConfig(this);
        } 

    } 

}
