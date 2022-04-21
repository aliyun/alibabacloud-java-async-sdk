// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServicePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServicePolicyResponseBody</p>
 */
public class UpdateServicePolicyResponseBody extends TeaModel {
    @NameInMap("CollectionName")
    private String collectionName;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("PolicyName")
    private String policyName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("SpaceId")
    private String spaceId;

    private UpdateServicePolicyResponseBody(Builder builder) {
        this.collectionName = builder.collectionName;
        this.policy = builder.policy;
        this.policyName = builder.policyName;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServicePolicyResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String collectionName; 
        private String policy; 
        private String policyName; 
        private String requestId; 
        private String serviceName; 
        private String spaceId; 

        /**
         * CollectionName.
         */
        public Builder collectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        public UpdateServicePolicyResponseBody build() {
            return new UpdateServicePolicyResponseBody(this);
        } 

    } 

}
