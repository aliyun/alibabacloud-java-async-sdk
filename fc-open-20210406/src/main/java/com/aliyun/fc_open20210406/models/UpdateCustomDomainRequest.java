// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomDomainRequest</p>
 */
public class UpdateCustomDomainRequest extends Request {
    @Path
    @NameInMap("domainName")
    private String domainName;

    @Body
    @NameInMap("certConfig")
    private CertConfig certConfig;

    @Body
    @NameInMap("protocol")
    private String protocol;

    @Body
    @NameInMap("routeConfig")
    private RouteConfig routeConfig;


    private UpdateCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.certConfig = builder.certConfig;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainRequest create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
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
        private String domainName; 
        private CertConfig certConfig; 
        private String protocol; 
        private RouteConfig routeConfig; 

        /**
         * <p>domainName.</p>
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>certConfig.</p>
         */
        public Builder certConfig(CertConfig certConfig) {
            this.putBodyParameter("certConfig", certConfig);
            this.certConfig = certConfig;
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

        public UpdateCustomDomainRequest build() {
            return new UpdateCustomDomainRequest(this);
        } 

    } 

}
