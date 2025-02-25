// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link DeleteInstancePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstancePolicyRequest</p>
 */
public class DeleteInstancePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyVersion;

    private DeleteInstancePolicyRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstancePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<DeleteInstancePolicyRequest, Builder> {
        private String instanceName; 
        private Long policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstancePolicyRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.policyVersion = request.policyVersion;
        } 

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-test-12345</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The version of the instance policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder policyVersion(Long policyVersion) {
            this.putBodyParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public DeleteInstancePolicyRequest build() {
            return new DeleteInstancePolicyRequest(this);
        } 

    } 

}
