// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InternalPorts")
    private String internalPorts;

    @Query
    @NameInMap("MaintainTime")
    private String maintainTime;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.internalPorts = builder.internalPorts;
        this.maintainTime = builder.maintainTime;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String description; 
        private String internalPorts; 
        private String maintainTime; 
        private String name; 
        private Long ownerId; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest response) {
            super(response);
            this.description = response.description;
            this.internalPorts = response.internalPorts;
            this.maintainTime = response.maintainTime;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.securityGroupId = response.securityGroupId;
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
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
