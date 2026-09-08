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
 * {@link SubDomainInfo} extends {@link TeaModel}
 *
 * <p>SubDomainInfo</p>
 */
public class SubDomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private SubDomainInfo(Builder builder) {
        this.domainId = builder.domainId;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubDomainInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String domainId; 
        private String name; 
        private String networkType; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(SubDomainInfo model) {
            this.domainId = model.domainId;
            this.name = model.name;
            this.networkType = model.networkType;
            this.protocol = model.protocol;
        } 

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cpudb0llhtgl2djvq2sg</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The protocol type supported by the subdomain. Valid values: HTTP, HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public SubDomainInfo build() {
            return new SubDomainInfo(this);
        } 

    } 

}
