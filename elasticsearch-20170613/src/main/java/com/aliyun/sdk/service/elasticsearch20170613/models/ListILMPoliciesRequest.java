// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListILMPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListILMPoliciesRequest</p>
 */
public class ListILMPoliciesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("policyName")
    private String policyName;

    private ListILMPoliciesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<ListILMPoliciesRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(ListILMPoliciesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.policyName = request.policyName;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
