// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIngressRequest} extends {@link RequestModel}
 *
 * <p>CreateIngressRequest</p>
 */
public class CreateIngressRequest extends Request {
    @Query
    @NameInMap("CertId")
    private String certId;

    @Query
    @NameInMap("DefaultRule")
    private String defaultRule;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true)
    private Integer listenerPort;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Body
    @NameInMap("Rules")
    @Validation(required = true)
    private String rules;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    private CreateIngressRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.listenerPort = builder.listenerPort;
        this.namespaceId = builder.namespaceId;
        this.rules = builder.rules;
        this.slbId = builder.slbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIngressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return defaultRule
     */
    public String getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    public static final class Builder extends Request.Builder<CreateIngressRequest, Builder> {
        private String certId; 
        private String defaultRule; 
        private String description; 
        private Integer listenerPort; 
        private String namespaceId; 
        private String rules; 
        private String slbId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIngressRequest response) {
            super(response);
            this.certId = response.certId;
            this.defaultRule = response.defaultRule;
            this.description = response.description;
            this.listenerPort = response.listenerPort;
            this.namespaceId = response.namespaceId;
            this.rules = response.rules;
            this.slbId = response.slbId;
        } 

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * DefaultRule.
         */
        public Builder defaultRule(String defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(String rules) {
            this.putBodyParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        @Override
        public CreateIngressRequest build() {
            return new CreateIngressRequest(this);
        } 

    } 

}
