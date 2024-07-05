// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterRequest</p>
 */
public class UpdateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPorts")
    private String internalPorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainTime")
    private String maintainTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    private UpdateClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.effectiveTime = builder.effectiveTime;
        this.internalPorts = builder.internalPorts;
        this.maintainTime = builder.maintainTime;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return internalPorts
     */
    public String getInternalPorts() {
        return this.internalPorts;
    }

    /**
     * @return maintainTime
     */
    public String getMaintainTime() {
        return this.maintainTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateClusterRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String effectiveTime; 
        private String internalPorts; 
        private String maintainTime; 
        private String name; 
        private Long ownerId; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.effectiveTime = request.effectiveTime;
            this.internalPorts = request.internalPorts;
            this.maintainTime = request.maintainTime;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EffectiveTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * InternalPorts.
         */
        public Builder internalPorts(String internalPorts) {
            this.putQueryParameter("InternalPorts", internalPorts);
            this.internalPorts = internalPorts;
            return this;
        }

        /**
         * MaintainTime.
         */
        public Builder maintainTime(String maintainTime) {
            this.putQueryParameter("MaintainTime", maintainTime);
            this.maintainTime = maintainTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public UpdateClusterRequest build() {
            return new UpdateClusterRequest(this);
        } 

    } 

}
