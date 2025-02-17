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
         * <p>Instance group ID.</p>
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
         * <p>New name of the instance group.</p>
         * <blockquote>
         * <ul>
         * <li>The length of the instance group name should not exceed 30 characters; it must start with a capital/lowercase letter or Chinese character, and cannot begin with http:// or https://. Only supports Chinese, English, numbers, colon (:), underscore (_), period (.), or hyphen (-).</li>
         * </ul>
         * </blockquote>
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
         * <p>Policy ID.</p>
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
