// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallGlobalAppRequest} extends {@link RequestModel}
 *
 * <p>InstallGlobalAppRequest</p>
 */
public class InstallGlobalAppRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("InstalledAppName")
    @Validation(required = true)
    private String installedAppName;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private InstallGlobalAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.installedAppName = builder.installedAppName;
        this.namespaceName = builder.namespaceName;
        this.source = builder.source;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallGlobalAppRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return installedAppName
     */
    public String getInstalledAppName() {
        return this.installedAppName;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<InstallGlobalAppRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String installedAppName; 
        private String namespaceName; 
        private String source; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(InstallGlobalAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.installedAppName = request.installedAppName;
            this.namespaceName = request.namespaceName;
            this.source = request.source;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * InstalledAppName.
         */
        public Builder installedAppName(String installedAppName) {
            this.putQueryParameter("InstalledAppName", installedAppName);
            this.installedAppName = installedAppName;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public InstallGlobalAppRequest build() {
            return new InstallGlobalAppRequest(this);
        } 

    } 

}
