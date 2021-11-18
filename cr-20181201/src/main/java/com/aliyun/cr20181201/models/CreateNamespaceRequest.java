// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @Query
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.defaultRepoType = builder.defaultRepoType;
        this.namespaceName = builder.namespaceName;
        this.instanceId = builder.instanceId;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceRequest create() {
        return builder().build();
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
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
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String defaultRepoType; 
        private String namespaceName; 
        private String instanceId; 
        private Boolean autoCreateRepo; 
        private String regionId; 

        /**
         * <p>The default type of the automatic repository creation. Valid values:

-"PUBLIC": Public

-"PRIVATE": Private</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
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
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether to automatically create an image repository.</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

}
