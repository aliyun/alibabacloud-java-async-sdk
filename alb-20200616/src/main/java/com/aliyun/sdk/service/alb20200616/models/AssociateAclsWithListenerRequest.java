// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateAclsWithListenerRequest} extends {@link RequestModel}
 *
 * <p>AssociateAclsWithListenerRequest</p>
 */
public class AssociateAclsWithListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > aclIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    private AssociateAclsWithListenerRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
        this.aclType = builder.aclType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAclsWithListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<AssociateAclsWithListenerRequest, Builder> {
        private java.util.List < String > aclIds; 
        private String aclType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAclsWithListenerRequest request) {
            super(request);
            this.aclIds = request.aclIds;
            this.aclType = request.aclType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
        } 

        /**
         * <p>The IDs of the ACLs. You can specify up to three IDs in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>The type of the ACL. Valid values:</p>
         * <ul>
         * <li><strong>White</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. The whitelist applies to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured for a listener, only requests from IP addresses that are added to the whitelist are forwarded by the listener. If you enable a whitelist but do not add an IP address to the whitelist, the listener forwards all requests.</li>
         * <li><strong>Black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. The blacklist applies to scenarios in which you want to block access from specific IP addresses to an application. If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>White</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public AssociateAclsWithListenerRequest build() {
            return new AssociateAclsWithListenerRequest(this);
        } 

    } 

}
