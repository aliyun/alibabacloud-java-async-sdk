// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InstallGlobalAppRequest} extends {@link RequestModel}
 *
 * <p>InstallGlobalAppRequest</p>
 */
public class InstallGlobalAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstalledAppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String installedAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>joint-calling</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>joint-calling</p>
         */
        public Builder installedAppName(String installedAppName) {
            this.putQueryParameter("InstalledAppName", installedAppName);
            this.installedAppName = installedAppName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sentieon</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EasyGene</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-workspace</p>
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
