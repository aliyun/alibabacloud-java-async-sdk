// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @Query
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;


    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.namespaceName = builder.namespaceName;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.defaultRepoType = builder.defaultRepoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String regionId; 
        private String namespaceName; 
        private Boolean autoCreateRepo; 
        private String defaultRepoType; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Region</p>
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
         * <p>Allow automatic repository creation during push</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.putQueryParameter("AutoCreateRepo", autoCreateRepo);
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * <p>The default repository type. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.putQueryParameter("DefaultRepoType", defaultRepoType);
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
