// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeploySDGRequest} extends {@link RequestModel}
 *
 * <p>DeploySDGRequest</p>
 */
public class DeploySDGRequest extends Request {
    @Query
    @NameInMap("DeploymentType")
    private String deploymentType;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("SDGId")
    @Validation(required = true)
    private String SDGId;

    private DeploySDGRequest(Builder builder) {
        super(builder);
        this.deploymentType = builder.deploymentType;
        this.instanceIds = builder.instanceIds;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploySDGRequest create() {
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
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<DeploySDGRequest, Builder> {
        private String deploymentType; 
        private java.util.List < String > instanceIds; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(DeploySDGRequest request) {
            super(request);
            this.deploymentType = request.deploymentType;
            this.instanceIds = request.instanceIds;
            this.SDGId = request.SDGId;
        } 

        /**
         * DeploymentType.
         */
        public Builder deploymentType(String deploymentType) {
            this.putQueryParameter("DeploymentType", deploymentType);
            this.deploymentType = deploymentType;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * SDGId.
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public DeploySDGRequest build() {
            return new DeploySDGRequest(this);
        } 

    } 

}
