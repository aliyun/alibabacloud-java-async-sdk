// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link CheckServiceLinkedRoleForDeletingRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceLinkedRoleForDeletingRequest</p>
 */
public class CheckServiceLinkedRoleForDeletingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deletionTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SPIRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SPIRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder SPIRegionId(String SPIRegionId) {
            this.putQueryParameter("SPIRegionId", SPIRegionId);
            this.SPIRegionId = SPIRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
