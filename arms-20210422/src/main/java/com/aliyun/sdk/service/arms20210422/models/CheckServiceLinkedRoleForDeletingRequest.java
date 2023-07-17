// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceLinkedRoleForDeletingRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceLinkedRoleForDeletingRequest</p>
 */
public class CheckServiceLinkedRoleForDeletingRequest extends Request {
    @Query
    @NameInMap("DeletionTaskId")
    @Validation(required = true)
    private String deletionTaskId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RoleArn")
    @Validation(required = true)
    private String roleArn;

    @Query
    @NameInMap("SPIRegionId")
    @Validation(required = true)
    private String SPIRegionId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private CheckServiceLinkedRoleForDeletingRequest(Builder builder) {
        super(builder);
        this.deletionTaskId = builder.deletionTaskId;
        this.regionId = builder.regionId;
        this.roleArn = builder.roleArn;
        this.SPIRegionId = builder.SPIRegionId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleForDeletingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionTaskId
     */
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return SPIRegionId
     */
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CheckServiceLinkedRoleForDeletingRequest, Builder> {
        private String deletionTaskId; 
        private String regionId; 
        private String roleArn; 
        private String SPIRegionId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceLinkedRoleForDeletingRequest request) {
            super(request);
            this.deletionTaskId = request.deletionTaskId;
            this.regionId = request.regionId;
            this.roleArn = request.roleArn;
            this.SPIRegionId = request.SPIRegionId;
            this.serviceName = request.serviceName;
        } 

        /**
         * DeletionTaskId.
         */
        public Builder deletionTaskId(String deletionTaskId) {
            this.putQueryParameter("DeletionTaskId", deletionTaskId);
            this.deletionTaskId = deletionTaskId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * SPIRegionId.
         */
        public Builder SPIRegionId(String SPIRegionId) {
            this.putQueryParameter("SPIRegionId", SPIRegionId);
            this.SPIRegionId = SPIRegionId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleForDeletingRequest build() {
            return new CheckServiceLinkedRoleForDeletingRequest(this);
        } 

    } 

}
