// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChartNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateChartNamespaceRequest</p>
 */
public class UpdateChartNamespaceRequest extends Request {
    @Query
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @Query
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateChartNamespaceRequest(Builder builder) {
        super(builder);
        this.autoCreateRepo = builder.autoCreateRepo;
        this.defaultRepoType = builder.defaultRepoType;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChartNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateChartNamespaceRequest, Builder> {
        private Boolean autoCreateRepo; 
        private String defaultRepoType; 
        private String instanceId; 
        private String namespaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChartNamespaceRequest response) {
            super(response);
            this.autoCreateRepo = response.autoCreateRepo;
            this.defaultRepoType = response.defaultRepoType;
            this.instanceId = response.instanceId;
            this.namespaceName = response.namespaceName;
            this.regionId = response.regionId;
        } 

        /**
         * AutoCreateRepo.
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * DefaultRepoType.
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateChartNamespaceRequest build() {
            return new UpdateChartNamespaceRequest(this);
        } 

    } 

}
