// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link RemoveUserLoginPoliciesRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserLoginPoliciesRequest</p>
 */
public class RemoveUserLoginPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    private RemoveUserLoginPoliciesRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.policyIds = builder.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserLoginPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public static final class Builder extends Request.Builder<RemoveUserLoginPoliciesRequest, Builder> {
        private String businessChannel; 
        private java.util.List<String> policyIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserLoginPoliciesRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.policyIds = request.policyIds;
        } 

        /**
         * <p>The business channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The list of policy IDs.</p>
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        @Override
        public RemoveUserLoginPoliciesRequest build() {
            return new RemoveUserLoginPoliciesRequest(this);
        } 

    } 

}
