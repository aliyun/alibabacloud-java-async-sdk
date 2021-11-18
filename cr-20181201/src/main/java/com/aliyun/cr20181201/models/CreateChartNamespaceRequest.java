// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateChartNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateChartNamespaceRequest</p>
 */
public class CreateChartNamespaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;

    @Query
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private CreateChartNamespaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.namespaceName = builder.namespaceName;
        this.defaultRepoType = builder.defaultRepoType;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChartNamespaceRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    /**
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String namespaceName; 
        private String defaultRepoType; 
        private Boolean autoCreateRepo; 
        private String instanceId; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The default type of the repository. Valid values:
-"PUBLIC": public repository

-"PRIVATE": private repository
</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a repository. Valid values:

-"True": automatically creates a repository.

-"False": The repository is not automatically created.</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
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

        public CreateChartNamespaceRequest build() {
            return new CreateChartNamespaceRequest(this);
        } 

    } 

}
