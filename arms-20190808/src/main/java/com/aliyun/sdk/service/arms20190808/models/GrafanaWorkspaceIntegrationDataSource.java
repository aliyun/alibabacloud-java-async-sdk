// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GrafanaWorkspaceIntegrationDataSource} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIntegrationDataSource</p>
 */
public class GrafanaWorkspaceIntegrationDataSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("datasourceId")
    private String datasourceId;

    @com.aliyun.core.annotation.NameInMap("datasourceName")
    private String datasourceName;

    @com.aliyun.core.annotation.NameInMap("datasourceUrl")
    private String datasourceUrl;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("exploreUrl")
    private String exploreUrl;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, String> extra;

    @com.aliyun.core.annotation.NameInMap("folderUrl")
    private String folderUrl;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GrafanaWorkspaceIntegrationDataSource(Builder builder) {
        this.clusterType = builder.clusterType;
        this.datasourceId = builder.datasourceId;
        this.datasourceName = builder.datasourceName;
        this.datasourceUrl = builder.datasourceUrl;
        this.description = builder.description;
        this.exploreUrl = builder.exploreUrl;
        this.extra = builder.extra;
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
     * @return extra
     */
    public java.util.Map<String, String> getExtra() {
        return this.extra;
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
        private java.util.Map<String, String> extra; 
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
         * extra.
         */
        public Builder extra(java.util.Map<String, String> extra) {
            this.extra = extra;
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
