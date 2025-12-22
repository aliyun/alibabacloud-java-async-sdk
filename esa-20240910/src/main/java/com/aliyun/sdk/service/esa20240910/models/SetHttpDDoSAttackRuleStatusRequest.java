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
 * {@link SetHttpDDoSAttackRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>SetHttpDDoSAttackRuleStatusRequest</p>
 */
public class SetHttpDDoSAttackRuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private SetHttpDDoSAttackRuleStatusRequest(Builder builder) {
        super(builder);
        this.ruleIds = builder.ruleIds;
        this.siteId = builder.siteId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpDDoSAttackRuleStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetHttpDDoSAttackRuleStatusRequest, Builder> {
        private String ruleIds; 
        private Long siteId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpDDoSAttackRuleStatusRequest request) {
            super(request);
            this.ruleIds = request.ruleIds;
            this.siteId = request.siteId;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87570</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetHttpDDoSAttackRuleStatusRequest build() {
            return new SetHttpDDoSAttackRuleStatusRequest(this);
        } 

    } 

}
