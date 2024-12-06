// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListILMPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListILMPoliciesRequest</p>
 */
public class ListILMPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyName")
    private String policyName;

    private ListILMPoliciesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListILMPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<ListILMPoliciesRequest, Builder> {
        private String instanceId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(ListILMPoliciesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-m7r23wodb006n****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * policyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public ListILMPoliciesRequest build() {
            return new ListILMPoliciesRequest(this);
        } 

    } 

}
