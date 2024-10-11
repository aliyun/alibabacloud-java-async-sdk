// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchSetVodDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchSetVodDomainConfigsRequest</p>
 */
public class BatchSetVodDomainConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private BatchSetVodDomainConfigsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functions = builder.functions;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetVodDomainConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<BatchSetVodDomainConfigsRequest, Builder> {
        private String domainNames; 
        private String functions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetVodDomainConfigsRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functions = request.functions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The domain name for CDN. Separate multiple domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The features to configure.</p>
         * <ul>
         * <li>Set this parameter in the following format: <code>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;domain_name&quot;,&quot;argValue&quot;:&quot;www.example.com&quot;}],&quot;functionName&quot;:&quot;set_req_host_header&quot;}]</code>.</li>
         * <li>Specific features, such as filetype_based_ttl_set, support more than one configuration record. To update one of the configuration records, use the configId field to specify the record. <code>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;file_type&quot;,&quot;argValue&quot;:&quot;jpg&quot;},{&quot;argName&quot;:&quot;ttl&quot;,&quot;argValue&quot;:&quot;18&quot;},{&quot;argName&quot;:&quot;weight&quot;,&quot;argValue&quot;:&quot;30&quot;}],&quot;functionName&quot;:&quot;filetype_based_ttl_set&quot;,&quot;configId&quot;:5068995}]</code></li>
         * <li>For more information, see the <strong>Feature description</strong> section.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;domain_name&quot;,&quot;argValue&quot;:&quot;<a href="http://www.example.com%22%7D%5D,%22functionName%22:%22set_req_host_header%22%7D%5D">www.example.com&quot;}],&quot;functionName&quot;:&quot;set_req_host_header&quot;}]</a></p>
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public BatchSetVodDomainConfigsRequest build() {
            return new BatchSetVodDomainConfigsRequest(this);
        } 

    } 

}
