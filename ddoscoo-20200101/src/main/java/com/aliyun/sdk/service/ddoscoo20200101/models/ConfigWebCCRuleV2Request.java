// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigWebCCRuleV2Request} extends {@link RequestModel}
 *
 * <p>ConfigWebCCRuleV2Request</p>
 */
public class ConfigWebCCRuleV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expires")
    private Long expires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleList;

    private ConfigWebCCRuleV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.expires = builder.expires;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigWebCCRuleV2Request create() {
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
     * @return expires
     */
    public Long getExpires() {
        return this.expires;
    }

    /**
     * @return ruleList
     */
    public String getRuleList() {
        return this.ruleList;
    }

    public static final class Builder extends Request.Builder<ConfigWebCCRuleV2Request, Builder> {
        private String regionId; 
        private String domain; 
        private Long expires; 
        private String ruleList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigWebCCRuleV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.expires = request.expires;
            this.ruleList = request.ruleList;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Expires.
         */
        public Builder expires(Long expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * RuleList.
         */
        public Builder ruleList(String ruleList) {
            this.putQueryParameter("RuleList", ruleList);
            this.ruleList = ruleList;
            return this;
        }

        @Override
        public ConfigWebCCRuleV2Request build() {
            return new ConfigWebCCRuleV2Request(this);
        } 

    } 

}
