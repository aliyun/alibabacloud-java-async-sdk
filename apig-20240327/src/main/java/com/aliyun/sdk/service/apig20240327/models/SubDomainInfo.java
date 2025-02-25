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

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * networkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * protocol.
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
