// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeployInstanceSDGRequest} extends {@link RequestModel}
 *
 * <p>DeployInstanceSDGRequest</p>
 */
public class DeployInstanceSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentType")
    private String deploymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private DeployInstanceSDGRequest(Builder builder) {
        super(builder);
        this.deploymentType = builder.deploymentType;
        this.instanceIds = builder.instanceIds;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployInstanceSDGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentType
     */
    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<DeployInstanceSDGRequest, Builder> {
        private String deploymentType; 
        private java.util.List<String> instanceIds; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(DeployInstanceSDGRequest request) {
            super(request);
            this.deploymentType = request.deploymentType;
            this.instanceIds = request.instanceIds;
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The deployment type of the SDG. shared: shared read/write splitting deployment. The content of the SDG is read-only, and data updates are written to the local storage of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        public Builder deploymentType(String deploymentType) {
            this.putQueryParameter("DeploymentType", deploymentType);
            this.deploymentType = deploymentType;
            return this;
        }

        /**
         * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The ID of the SDG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public DeployInstanceSDGRequest build() {
            return new DeployInstanceSDGRequest(this);
        } 

    } 

}
