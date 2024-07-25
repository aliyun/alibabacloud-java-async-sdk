// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayRouteDomainConfig} extends {@link TeaModel}
 *
 * <p>GatewayRouteDomainConfig</p>
 */
public class GatewayRouteDomainConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domainIds")
    private java.util.List < String > domainIds;

    private GatewayRouteDomainConfig(Builder builder) {
        this.domainIds = builder.domainIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayRouteDomainConfig create() {
        return builder().build();
    }

    /**
     * @return domainIds
     */
    public java.util.List < String > getDomainIds() {
        return this.domainIds;
    }

    public static final class Builder {
        private java.util.List < String > domainIds; 

        /**
         * domainIds.
         */
        public Builder domainIds(java.util.List < String > domainIds) {
            this.domainIds = domainIds;
            return this;
        }

        public GatewayRouteDomainConfig build() {
            return new GatewayRouteDomainConfig(this);
        } 

    } 

}
