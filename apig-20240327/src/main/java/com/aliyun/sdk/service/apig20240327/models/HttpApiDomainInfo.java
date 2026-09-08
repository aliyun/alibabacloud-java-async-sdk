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
 * {@link HttpApiDomainInfo} extends {@link TeaModel}
 *
 * <p>HttpApiDomainInfo</p>
 */
public class HttpApiDomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private HttpApiDomainInfo(Builder builder) {
        this.domainId = builder.domainId;
        this.name = builder.name;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiDomainInfo create() {
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
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder {
        private String domainId; 
        private String name; 
        private String protocol; 

        private Builder() {
        } 

        private Builder(HttpApiDomainInfo model) {
            this.domainId = model.domainId;
            this.name = model.name;
            this.protocol = model.protocol;
        } 

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xxx</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The protocol.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HTTPS</li>
         * <li>HTTP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public HttpApiDomainInfo build() {
            return new HttpApiDomainInfo(this);
        } 

    } 

}
