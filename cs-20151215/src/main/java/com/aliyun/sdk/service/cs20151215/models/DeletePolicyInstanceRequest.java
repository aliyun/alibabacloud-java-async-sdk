// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyInstanceRequest</p>
 */
public class DeletePolicyInstanceRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("policy_name")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("instance_name")
    private String instanceName;

    private DeletePolicyInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyName = builder.policyName;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<DeletePolicyInstanceRequest, Builder> {
        private String clusterId; 
        private String policyName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyName = request.policyName;
            this.instanceName = request.instanceName;
        } 

        /**
         * 目标集群id
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 策略治理规则名称
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policy_name", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * 策略规则实例id
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public DeletePolicyInstanceRequest build() {
            return new DeletePolicyInstanceRequest(this);
        } 

    } 

}
