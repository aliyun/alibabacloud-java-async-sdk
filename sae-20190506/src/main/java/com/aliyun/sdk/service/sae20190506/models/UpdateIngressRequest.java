// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIngressRequest} extends {@link RequestModel}
 *
 * <p>UpdateIngressRequest</p>
 */
public class UpdateIngressRequest extends Request {
    @Query
    @NameInMap("CertId")
    private String certId;

    @Query
    @NameInMap("CertIds")
    private String certIds;

    @Query
    @NameInMap("DefaultRule")
    private String defaultRule;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IngressId")
    @Validation(required = true)
    private Long ingressId;

    @Query
    @NameInMap("ListenerPort")
    private String listenerPort;

    @Query
    @NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @Query
    @NameInMap("LoadBalanceType")
    private String loadBalanceType;

    @Body
    @NameInMap("Rules")
    private String rules;

    private UpdateIngressRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.certIds = builder.certIds;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.ingressId = builder.ingressId;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalanceType = builder.loadBalanceType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIngressRequest create() {
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
     * @return certIds
     */
    public String getCertIds() {
        return this.certIds;
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
     * @return ingressId
     */
    public Long getIngressId() {
        return this.ingressId;
    }

    /**
     * @return listenerPort
     */
    public String getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalanceType
     */
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<UpdateIngressRequest, Builder> {
        private String certId; 
        private String certIds; 
        private String defaultRule; 
        private String description; 
        private Long ingressId; 
        private String listenerPort; 
        private String listenerProtocol; 
        private String loadBalanceType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIngressRequest request) {
            super(request);
            this.certId = request.certId;
            this.certIds = request.certIds;
            this.defaultRule = request.defaultRule;
            this.description = request.description;
            this.ingressId = request.ingressId;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalanceType = request.loadBalanceType;
            this.rules = request.rules;
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
         * CertIds.
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
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
         * IngressId.
         */
        public Builder ingressId(Long ingressId) {
            this.putQueryParameter("IngressId", ingressId);
            this.ingressId = ingressId;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(String listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * ListenerProtocol.
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * LoadBalanceType.
         */
        public Builder loadBalanceType(String loadBalanceType) {
            this.putQueryParameter("LoadBalanceType", loadBalanceType);
            this.loadBalanceType = loadBalanceType;
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

        @Override
        public UpdateIngressRequest build() {
            return new UpdateIngressRequest(this);
        } 

    } 

}
