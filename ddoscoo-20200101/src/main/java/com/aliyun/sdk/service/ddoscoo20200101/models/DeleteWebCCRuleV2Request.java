// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWebCCRuleV2Request} extends {@link RequestModel}
 *
 * <p>DeleteWebCCRuleV2Request</p>
 */
public class DeleteWebCCRuleV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNames")
    private String ruleNames;

    private DeleteWebCCRuleV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.owner = builder.owner;
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebCCRuleV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ruleNames
     */
    public String getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder extends Request.Builder<DeleteWebCCRuleV2Request, Builder> {
        private String regionId; 
        private String domain; 
        private String owner; 
        private String ruleNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebCCRuleV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.owner = request.owner;
            this.ruleNames = request.ruleNames;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The source of the rule. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong> (default): manually created.</li>
         * <li><strong>clover</strong>: automatically created. Specify this value when you want to delete intelligent protection rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The names of the rules that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;trdsss&quot;]</p>
         */
        public Builder ruleNames(String ruleNames) {
            this.putQueryParameter("RuleNames", ruleNames);
            this.ruleNames = ruleNames;
            return this;
        }

        @Override
        public DeleteWebCCRuleV2Request build() {
            return new DeleteWebCCRuleV2Request(this);
        } 

    } 

}
