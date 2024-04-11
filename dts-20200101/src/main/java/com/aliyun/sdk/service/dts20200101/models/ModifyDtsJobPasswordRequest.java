// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobPasswordRequest</p>
 */
public class ModifyDtsJobPasswordRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("Endpoint")
    private String endpoint;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private ModifyDtsJobPasswordRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.endpoint = builder.endpoint;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.userName = builder.userName;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobPasswordRequest, Builder> {
        private String dtsJobId; 
        private String endpoint; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private String userName; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobPasswordRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.endpoint = request.endpoint;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.userName = request.userName;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * Specifies the database to which the password belongs. Valid values:
         * <p>
         * 
         * *   **src**: source database
         * *   **dest**: destination database
         * 
         * >  This parameter must be specified.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The new password of the account.
         * <p>
         * 
         * >  This parameter must be specified and cannot be the same as the current password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The account of the source or destination database.
         * <p>
         * 
         * >  This parameter must be specified.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * ZeroEtlJob.
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public ModifyDtsJobPasswordRequest build() {
            return new ModifyDtsJobPasswordRequest(this);
        } 

    } 

}
