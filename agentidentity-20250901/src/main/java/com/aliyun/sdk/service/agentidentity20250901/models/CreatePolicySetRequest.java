// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreatePolicySetRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicySetRequest</p>
 */
public class CreatePolicySetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicySetName")
    private String policySetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    private String sourcePlatform;

    private CreatePolicySetRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.policySetName = builder.policySetName;
        this.sourcePlatform = builder.sourcePlatform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicySetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return policySetName
     */
    public String getPolicySetName() {
        return this.policySetName;
    }

    /**
     * @return sourcePlatform
     */
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public static final class Builder extends Request.Builder<CreatePolicySetRequest, Builder> {
        private String description; 
        private String policySetName; 
        private String sourcePlatform; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicySetRequest request) {
            super(request);
            this.description = request.description;
            this.policySetName = request.policySetName;
            this.sourcePlatform = request.sourcePlatform;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        public Builder policySetName(String policySetName) {
            this.putBodyParameter("PolicySetName", policySetName);
            this.policySetName = policySetName;
            return this;
        }

        /**
         * <p>The source platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Manuel</p>
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putBodyParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        @Override
        public CreatePolicySetRequest build() {
            return new CreatePolicySetRequest(this);
        } 

    } 

}
