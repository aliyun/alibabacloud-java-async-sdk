// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketPortalDomainConfig} extends {@link TeaModel}
 *
 * <p>HiMarketPortalDomainConfig</p>
 */
public class HiMarketPortalDomainConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private HiMarketPortalDomainConfig(Builder builder) {
        this.domain = builder.domain;
        this.protocol = builder.protocol;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketPortalDomainConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String domain; 
        private String protocol; 
        private String type; 

        private Builder() {
        } 

        private Builder(HiMarketPortalDomainConfig model) {
            this.domain = model.domain;
            this.protocol = model.protocol;
            this.type = model.type;
        } 

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public HiMarketPortalDomainConfig build() {
            return new HiMarketPortalDomainConfig(this);
        } 

    } 

}
