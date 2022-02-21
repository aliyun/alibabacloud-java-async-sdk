// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

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
    private String deletionTaskId;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("SPIRegionId")
    private String SPIRegionId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private CheckServiceLinkedRoleForDeletingRequest(Builder builder) {
        super(builder);
        this.deletionTaskId = builder.deletionTaskId;
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
        private String roleArn; 
        private String SPIRegionId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceLinkedRoleForDeletingRequest response) {
            super(response);
            this.deletionTaskId = response.deletionTaskId;
            this.roleArn = response.roleArn;
            this.SPIRegionId = response.SPIRegionId;
            this.serviceName = response.serviceName;
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
