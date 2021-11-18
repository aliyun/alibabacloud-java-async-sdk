// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateChartNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateChartNamespaceRequest</p>
 */
public class UpdateChartNamespaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;


    private UpdateChartNamespaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.namespaceName = builder.namespaceName;
        this.instanceId = builder.instanceId;
        this.defaultRepoType = builder.defaultRepoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChartNamespaceRequest create() {
        return builder().build();
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
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private Boolean autoCreateRepo; 
        private String namespaceName; 
        private String instanceId; 
        private String defaultRepoType; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a repository. Valid values:
-"true": automatically creates a repository.
-"false": does not automatically create a repository.</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * <p>The namespace of the image repository.</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The default repository type. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository
</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        public UpdateChartNamespaceRequest build() {
            return new UpdateChartNamespaceRequest(this);
        } 

    } 

}
