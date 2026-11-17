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
 * {@link ModelApiDomainInfo} extends {@link TeaModel}
 *
 * <p>ModelApiDomainInfo</p>
 */
public class ModelApiDomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("default")
    private Boolean _default;

    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("domainScope")
    private String domainScope;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private ModelApiDomainInfo(Builder builder) {
        this._default = builder._default;
        this.domainId = builder.domainId;
        this.domainScope = builder.domainScope;
        this.name = builder.name;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelApiDomainInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _default
     */
    public Boolean get_default() {
        return this._default;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainScope
     */
    public String getDomainScope() {
        return this.domainScope;
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
        private Boolean _default; 
        private String domainId; 
        private String domainScope; 
        private String name; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(ModelApiDomainInfo model) {
            this._default = model._default;
            this.domainId = model.domainId;
            this.domainScope = model.domainScope;
            this.name = model.name;
            this.protocol = model.protocol;
        } 

        /**
         * <p>Indicates whether it is the default domain name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder _default(Boolean _default) {
            this._default = _default;
            return this;
        }

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-d00000000000000000000</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain name scope.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        public Builder domainScope(String domainScope) {
            this.domainScope = domainScope;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The access protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ModelApiDomainInfo build() {
            return new ModelApiDomainInfo(this);
        } 

    } 

}
