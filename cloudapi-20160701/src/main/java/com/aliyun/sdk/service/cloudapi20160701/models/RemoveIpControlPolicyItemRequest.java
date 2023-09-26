// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveIpControlPolicyItemRequest} extends {@link RequestModel}
 *
 * <p>RemoveIpControlPolicyItemRequest</p>
 */
public class RemoveIpControlPolicyItemRequest extends Request {
    @Query
    @NameInMap("IpControlId")
    @Validation(required = true)
    private String ipControlId;

    @Query
    @NameInMap("PolicyItemIds")
    @Validation(required = true)
    private String policyItemIds;

    @Query
    @NameInMap("SecurityToken")
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
         * IpControlId.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * PolicyItemIds.
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
