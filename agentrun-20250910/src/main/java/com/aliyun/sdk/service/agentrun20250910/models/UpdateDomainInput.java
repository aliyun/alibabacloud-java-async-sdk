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
 * {@link UpdateDomainInput} extends {@link TeaModel}
 *
 * <p>UpdateDomainInput</p>
 */
public class UpdateDomainInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private UpdateDomainInput(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainInput create() {
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
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(UpdateDomainInput model) {
            this.certIdentifier = model.certIdentifier;
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
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UpdateDomainInput build() {
            return new UpdateDomainInput(this);
        } 

    } 

}
