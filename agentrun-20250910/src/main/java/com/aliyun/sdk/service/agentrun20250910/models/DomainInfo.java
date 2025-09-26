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
 * {@link DomainInfo} extends {@link TeaModel}
 *
 * <p>DomainInfo</p>
 */
public class DomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private DomainInfo(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.domainId = builder.domainId;
        this.name = builder.name;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
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
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String domainId; 
        private String name; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(DomainInfo model) {
            this.certIdentifier = model.certIdentifier;
            this.domainId = model.domainId;
            this.name = model.name;
            this.protocol = model.protocol;
        } 

        /**
         * certIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

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
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public DomainInfo build() {
            return new DomainInfo(this);
        } 

    } 

}
