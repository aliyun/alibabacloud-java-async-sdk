// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomDomainRequest</p>
 */
public class CreateCustomDomainRequest extends Request {
    @Body
    @NameInMap("certConfig")
    private CertConfig certConfig;

    @Body
    @NameInMap("domainName")
    private String domainName;

    @Body
    @NameInMap("protocol")
    private String protocol;

    @Body
    @NameInMap("routeConfig")
    private RouteConfig routeConfig;


    private CreateCustomDomainRequest(Builder builder) {
        super(builder);
        this.certConfig = builder.certConfig;
        this.domainName = builder.domainName;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomDomainRequest create() {
        return builder().build();
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return routeConfig
     */
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public static final class Builder extends Request.Builder {
        private CertConfig certConfig; 
        private String domainName; 
        private String protocol; 
        private RouteConfig routeConfig; 

        /**
         * <p>certConfig.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.putBodyParameter("certConfig", certConfig);
            this.certConfig = certConfig;
            return this;
        }

        /**
         * <p>domainName.</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>protocol.</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>routeConfig.</p>
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.putBodyParameter("routeConfig", routeConfig);
            this.routeConfig = routeConfig;
            return this;
        }

        public CreateCustomDomainRequest build() {
            return new CreateCustomDomainRequest(this);
        } 

    } 

}
