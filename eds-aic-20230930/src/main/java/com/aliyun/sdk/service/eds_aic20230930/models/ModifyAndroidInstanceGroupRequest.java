// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAndroidInstanceGroupRequest</p>
 */
public class ModifyAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInstanceGroupName")
    private String newInstanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    private ModifyAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.instanceGroupId = builder.instanceGroupId;
        this.newInstanceGroupName = builder.newInstanceGroupName;
        this.policyGroupId = builder.policyGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAndroidInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return newInstanceGroupName
     */
    public String getNewInstanceGroupName() {
        return this.newInstanceGroupName;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyAndroidInstanceGroupRequest, Builder> {
        private String instanceGroupId; 
        private String newInstanceGroupName; 
        private String policyGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAndroidInstanceGroupRequest request) {
            super(request);
            this.instanceGroupId = request.instanceGroupId;
            this.newInstanceGroupName = request.newInstanceGroupName;
            this.policyGroupId = request.policyGroupId;
        } 

        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-cuv4scs4obxhs****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * <p>The new name of the instance group.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>newName</p>
         */
        public Builder newInstanceGroupName(String newInstanceGroupName) {
            this.putQueryParameter("NewInstanceGroupName", newInstanceGroupName);
            this.newInstanceGroupName = newInstanceGroupName;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-2w97kp89gnsif****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        @Override
        public ModifyAndroidInstanceGroupRequest build() {
            return new ModifyAndroidInstanceGroupRequest(this);
        } 

    } 

}
