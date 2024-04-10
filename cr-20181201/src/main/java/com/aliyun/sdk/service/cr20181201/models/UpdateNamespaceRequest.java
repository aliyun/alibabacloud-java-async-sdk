// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.defaultRepoType = builder.defaultRepoType;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateNamespaceRequest, Builder> {
        private String regionId; 
        private Boolean autoCreateRepo; 
        private String defaultRepoType; 
        private String instanceId; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateRepo = request.autoCreateRepo;
            this.defaultRepoType = request.defaultRepoType;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to automatically create a repository when an image is pushed to the namespace.
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * The default type of the repository. Valid values:
         * <p>
         * 
         * *   `PUBLIC`: The repository is a public repository.
         * *   `PRIVATE`: The repository is a private repository.
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
