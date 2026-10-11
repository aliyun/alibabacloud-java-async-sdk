// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link UpdateEgressProxyRuleGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEgressProxyRuleGroupAttributeRequest</p>
 */
public class UpdateEgressProxyRuleGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyRuleGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupName")
    private String egressProxyRuleGroupName;

    private UpdateEgressProxyRuleGroupAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRuleGroupName = builder.egressProxyRuleGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEgressProxyRuleGroupAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    /**
     * @return egressProxyRuleGroupName
     */
    public String getEgressProxyRuleGroupName() {
        return this.egressProxyRuleGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateEgressProxyRuleGroupAttributeRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyIpPoolId; 
        private String egressProxyRuleGroupId; 
        private String egressProxyRuleGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEgressProxyRuleGroupAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyIpPoolId = request.egressProxyIpPoolId;
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
            this.egressProxyRuleGroupName = request.egressProxyRuleGroupName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EgressProxyIpPoolId.
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.putBodyParameter("EgressProxyIpPoolId", egressProxyIpPoolId);
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.putBodyParameter("EgressProxyRuleGroupId", egressProxyRuleGroupId);
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        /**
         * EgressProxyRuleGroupName.
         */
        public Builder egressProxyRuleGroupName(String egressProxyRuleGroupName) {
            this.putBodyParameter("EgressProxyRuleGroupName", egressProxyRuleGroupName);
            this.egressProxyRuleGroupName = egressProxyRuleGroupName;
            return this;
        }

        @Override
        public UpdateEgressProxyRuleGroupAttributeRequest build() {
            return new UpdateEgressProxyRuleGroupAttributeRequest(this);
        } 

    } 

}
