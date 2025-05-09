// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link RemoveIpControlPolicyItemRequest} extends {@link RequestModel}
 *
 * <p>RemoveIpControlPolicyItemRequest</p>
 */
public class RemoveIpControlPolicyItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyItemIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private RemoveIpControlPolicyItemRequest(Builder builder) {
        super(builder);
        this.ipControlId = builder.ipControlId;
        this.policyItemIds = builder.policyItemIds;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveIpControlPolicyItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return policyItemIds
     */
    public String getPolicyItemIds() {
        return this.policyItemIds;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<RemoveIpControlPolicyItemRequest, Builder> {
        private String ipControlId; 
        private String policyItemIds; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveIpControlPolicyItemRequest request) {
            super(request);
            this.ipControlId = request.ipControlId;
            this.policyItemIds = request.policyItemIds;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the ACL. The ID is unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * <p>The ID of a policy. Separate multiple IDs with semicolons (;). A maximum of 100 IDs can be entered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P151533572852362;P151533557750260</p>
         */
        public Builder policyItemIds(String policyItemIds) {
            this.putQueryParameter("PolicyItemIds", policyItemIds);
            this.policyItemIds = policyItemIds;
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
        public RemoveIpControlPolicyItemRequest build() {
            return new RemoveIpControlPolicyItemRequest(this);
        } 

    } 

}
