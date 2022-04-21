// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServicePolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateServicePolicyRequest</p>
 */
public class UpdateServicePolicyRequest extends Request {
    @Body
    @NameInMap("CollectionName")
    private String collectionName;

    @Body
    @NameInMap("Policy")
    private String policy;

    @Body
    @NameInMap("PolicyName")
    private String policyName;

    @Body
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private UpdateServicePolicyRequest(Builder builder) {
        super(builder);
        this.collectionName = builder.collectionName;
        this.policy = builder.policy;
        this.policyName = builder.policyName;
        this.serviceName = builder.serviceName;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServicePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectionName
     */
    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<UpdateServicePolicyRequest, Builder> {
        private String collectionName; 
        private String policy; 
        private String policyName; 
        private String serviceName; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServicePolicyRequest request) {
            super(request);
            this.collectionName = request.collectionName;
            this.policy = request.policy;
            this.policyName = request.policyName;
            this.serviceName = request.serviceName;
            this.spaceId = request.spaceId;
        } 

        /**
         * CollectionName.
         */
        public Builder collectionName(String collectionName) {
            this.putBodyParameter("CollectionName", collectionName);
            this.collectionName = collectionName;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public UpdateServicePolicyRequest build() {
            return new UpdateServicePolicyRequest(this);
        } 

    } 

}
