// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceIntegrationDataSource} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIntegrationDataSource</p>
 */
public class GrafanaWorkspaceIntegrationDataSource extends TeaModel {
    @NameInMap("clusterType")
    private String clusterType;

    @NameInMap("datasourceId")
    private String datasourceId;

    @NameInMap("datasourceName")
    private String datasourceName;

    @NameInMap("datasourceUrl")
    private String datasourceUrl;

    @NameInMap("description")
    private String description;

    @NameInMap("exploreUrl")
    private String exploreUrl;

    @NameInMap("folderUrl")
    private String folderUrl;

    @NameInMap("regionId")
    private String regionId;

    @NameInMap("status")
    private String status;

    @NameInMap("type")
    private String type;

    private GrafanaWorkspaceIntegrationDataSource(Builder builder) {
        this.clusterType = builder.clusterType;
        this.datasourceId = builder.datasourceId;
        this.datasourceName = builder.datasourceName;
        this.datasourceUrl = builder.datasourceUrl;
        this.description = builder.description;
        this.exploreUrl = builder.exploreUrl;
        this.folderUrl = builder.folderUrl;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIntegrationDataSource create() {
        return builder().build();
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return datasourceUrl
     */
    public String getDatasourceUrl() {
        return this.datasourceUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exploreUrl
     */
    public String getExploreUrl() {
        return this.exploreUrl;
    }

    /**
     * @return folderUrl
     */
    public String getFolderUrl() {
        return this.folderUrl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String clusterType; 
        private String datasourceId; 
        private String datasourceName; 
        private String datasourceUrl; 
        private String description; 
        private String exploreUrl; 
        private String folderUrl; 
        private String regionId; 
        private String status; 
        private String type; 

        /**
         * clusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * datasourceId.
         */
        public Builder datasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * datasourceName.
         */
        public Builder datasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * datasourceUrl.
         */
        public Builder datasourceUrl(String datasourceUrl) {
            this.datasourceUrl = datasourceUrl;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * exploreUrl.
         */
        public Builder exploreUrl(String exploreUrl) {
            this.exploreUrl = exploreUrl;
            return this;
        }

        /**
         * folderUrl.
         */
        public Builder folderUrl(String folderUrl) {
            this.folderUrl = folderUrl;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GrafanaWorkspaceIntegrationDataSource build() {
            return new GrafanaWorkspaceIntegrationDataSource(this);
        } 

    } 

}
