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
 * {@link ModifyUserPolicyBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserPolicyBasicInfoRequest</p>
 */
public class ModifyUserPolicyBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    private ModifyUserPolicyBasicInfoRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.name = builder.name;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserPolicyBasicInfoRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<ModifyUserPolicyBasicInfoRequest, Builder> {
        private String businessChannel; 
        private String name; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserPolicyBasicInfoRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.name = request.name;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The channel.</p>
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
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>deveoper-policy</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>up-89unlabdl****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public ModifyUserPolicyBasicInfoRequest build() {
            return new ModifyUserPolicyBasicInfoRequest(this);
        } 

    } 

}
