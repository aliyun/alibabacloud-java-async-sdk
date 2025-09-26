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
 * {@link CreateDomainInput} extends {@link TeaModel}
 *
 * <p>CreateDomainInput</p>
 */
public class CreateDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private CreateDomainInput(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.name = builder.name;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainInput create() {
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
        private String name; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(CreateDomainInput model) {
            this.certIdentifier = model.certIdentifier;
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

        public CreateDomainInput build() {
            return new CreateDomainInput(this);
        } 

    } 

}
