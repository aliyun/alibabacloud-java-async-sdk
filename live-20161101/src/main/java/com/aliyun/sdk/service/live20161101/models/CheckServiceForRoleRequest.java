// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceForRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceForRoleRequest</p>
 */
public class CheckServiceForRoleRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("DeletionTaskId")
    @Validation(required = true)
    private String deletionTaskId;

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

    private CheckServiceForRoleRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.deletionTaskId = builder.deletionTaskId;
        this.roleArn = builder.roleArn;
        this.SPIRegionId = builder.SPIRegionId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceForRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
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

    public static final class Builder extends Request.Builder<CheckServiceForRoleRequest, Builder> {
        private String accountId; 
        private String deletionTaskId; 
        private String roleArn; 
        private String SPIRegionId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceForRoleRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.deletionTaskId = response.deletionTaskId;
            this.roleArn = response.roleArn;
            this.SPIRegionId = response.SPIRegionId;
            this.serviceName = response.serviceName;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
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
        public CheckServiceForRoleRequest build() {
            return new CheckServiceForRoleRequest(this);
        } 

    } 

}
