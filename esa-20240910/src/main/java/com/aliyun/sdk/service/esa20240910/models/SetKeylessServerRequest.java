// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetKeylessServerRequest} extends {@link RequestModel}
 *
 * <p>SetKeylessServerRequest</p>
 */
public class SetKeylessServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CaCertificate")
    private String caCertificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientCertificate")
    private String clientCertificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientPrivateKey")
    private String clientPrivateKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Verify")
    private Boolean verify;

    private SetKeylessServerRequest(Builder builder) {
        super(builder);
        this.caCertificate = builder.caCertificate;
        this.clientCertificate = builder.clientCertificate;
        this.clientPrivateKey = builder.clientPrivateKey;
        this.host = builder.host;
        this.id = builder.id;
        this.name = builder.name;
        this.port = builder.port;
        this.siteId = builder.siteId;
        this.verify = builder.verify;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetKeylessServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertificate
     */
    public String getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * @return clientCertificate
     */
    public String getClientCertificate() {
        return this.clientCertificate;
    }

    /**
     * @return clientPrivateKey
     */
    public String getClientPrivateKey() {
        return this.clientPrivateKey;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return verify
     */
    public Boolean getVerify() {
        return this.verify;
    }

    public static final class Builder extends Request.Builder<SetKeylessServerRequest, Builder> {
        private String caCertificate; 
        private String clientCertificate; 
        private String clientPrivateKey; 
        private String host; 
        private String id; 
        private String name; 
        private Long port; 
        private Long siteId; 
        private Boolean verify; 

        private Builder() {
            super();
        } 

        private Builder(SetKeylessServerRequest request) {
            super(request);
            this.caCertificate = request.caCertificate;
            this.clientCertificate = request.clientCertificate;
            this.clientPrivateKey = request.clientPrivateKey;
            this.host = request.host;
            this.id = request.id;
            this.name = request.name;
            this.port = request.port;
            this.siteId = request.siteId;
            this.verify = request.verify;
        } 

        /**
         * <p>The CA certificate used to verify the server certificate of the Keyless server. This parameter takes effect only when Verify is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****</p>
         */
        public Builder caCertificate(String caCertificate) {
            this.putBodyParameter("CaCertificate", caCertificate);
            this.caCertificate = caCertificate;
            return this;
        }

        /**
         * <p>The client certificate. This parameter must be specified together with the client private key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****</p>
         */
        public Builder clientCertificate(String clientCertificate) {
            this.putBodyParameter("ClientCertificate", clientCertificate);
            this.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * <p>The client private key. This parameter must be specified together with the client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----****</p>
         */
        public Builder clientPrivateKey(String clientPrivateKey) {
            this.putBodyParameter("ClientPrivateKey", clientPrivateKey);
            this.clientPrivateKey = clientPrivateKey;
            return this;
        }

        /**
         * <p>The hostname of the Keyless server. The value can be a domain name or an IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>keyless.example.com</p>
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>Keyless server ID。</p>
         * 
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838e****</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the Keyless server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The port of the Keyless server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder port(Long port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Specifies whether to verify the server certificate of the Keyless server. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verify(Boolean verify) {
            this.putBodyParameter("Verify", verify);
            this.verify = verify;
            return this;
        }

        @Override
        public SetKeylessServerRequest build() {
            return new SetKeylessServerRequest(this);
        } 

    } 

}
