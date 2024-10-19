// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DissociateInstanceWithPrivateDNSRequest} extends {@link RequestModel}
 *
 * <p>DissociateInstanceWithPrivateDNSRequest</p>
 */
public class DissociateInstanceWithPrivateDNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntranetDomains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > intranetDomains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DissociateInstanceWithPrivateDNSRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intranetDomains = builder.intranetDomains;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateInstanceWithPrivateDNSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intranetDomains
     */
    public java.util.List < String > getIntranetDomains() {
        return this.intranetDomains;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DissociateInstanceWithPrivateDNSRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > intranetDomains; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DissociateInstanceWithPrivateDNSRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intranetDomains = request.intranetDomains;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-hz-ead4f4b0bac8</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder intranetDomains(java.util.List < String > intranetDomains) {
            String intranetDomainsShrink = shrink(intranetDomains, "IntranetDomains", "json");
            this.putBodyParameter("IntranetDomains", intranetDomainsShrink);
            this.intranetDomains = intranetDomains;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DissociateInstanceWithPrivateDNSRequest build() {
            return new DissociateInstanceWithPrivateDNSRequest(this);
        } 

    } 

}
