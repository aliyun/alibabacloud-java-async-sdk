// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomDomainRequest</p>
 */
public class CreateCustomDomainRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

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
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
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

    public static final class Builder extends Request.Builder<CreateCustomDomainRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private CertConfig certConfig; 
        private String domainName; 
        private String protocol; 
        private RouteConfig routeConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomDomainRequest response) {
            super(response);
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcTraceId = response.xFcTraceId;
            this.certConfig = response.certConfig;
            this.domainName = response.domainName;
            this.protocol = response.protocol;
            this.routeConfig = response.routeConfig;
        } 

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.putBodyParameter("certConfig", certConfig);
            this.certConfig = certConfig;
            return this;
        }

        /**
         * domainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * routeConfig.
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.putBodyParameter("routeConfig", routeConfig);
            this.routeConfig = routeConfig;
            return this;
        }

        @Override
        public CreateCustomDomainRequest build() {
            return new CreateCustomDomainRequest(this);
        } 

    } 

}
