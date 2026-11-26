// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobDataSourceConfig} extends {@link TeaModel}
 *
 * <p>RLJobDataSourceConfig</p>
 */
public class RLJobDataSourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    private String accessPointId;

    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("DataSourceVersion")
    private String dataSourceVersion;

    @com.aliyun.core.annotation.NameInMap("EnableCache")
    private Boolean enableCache;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("MountAccess")
    private String mountAccess;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mountPath;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("RoleChain")
    private String roleChain;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private RLJobDataSourceConfig(Builder builder) {
        this.accessPointId = builder.accessPointId;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceVersion = builder.dataSourceVersion;
        this.enableCache = builder.enableCache;
        this.modelId = builder.modelId;
        this.mountAccess = builder.mountAccess;
        this.mountPath = builder.mountPath;
        this.options = builder.options;
        this.roleArn = builder.roleArn;
        this.roleChain = builder.roleChain;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobDataSourceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceVersion
     */
    public String getDataSourceVersion() {
        return this.dataSourceVersion;
    }

    /**
     * @return enableCache
     */
    public Boolean getEnableCache() {
        return this.enableCache;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return mountAccess
     */
    public String getMountAccess() {
        return this.mountAccess;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return roleChain
     */
    public String getRoleChain() {
        return this.roleChain;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String accessPointId; 
        private String dataSourceId; 
        private String dataSourceVersion; 
        private Boolean enableCache; 
        private String modelId; 
        private String mountAccess; 
        private String mountPath; 
        private String options; 
        private String roleArn; 
        private String roleChain; 
        private String uri; 

        private Builder() {
        } 

        private Builder(RLJobDataSourceConfig model) {
            this.accessPointId = model.accessPointId;
            this.dataSourceId = model.dataSourceId;
            this.dataSourceVersion = model.dataSourceVersion;
            this.enableCache = model.enableCache;
            this.modelId = model.modelId;
            this.mountAccess = model.mountAccess;
            this.mountPath = model.mountPath;
            this.options = model.options;
            this.roleArn = model.roleArn;
            this.roleChain = model.roleChain;
            this.uri = model.uri;
        } 

        /**
         * <p>The AI computing CPFS access point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-example</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>The datasource ID. You must specify one of DataSourceId, Uri, or ModelId.</p>
         * 
         * <strong>example:</strong>
         * <p>d-gx8xxxxx</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The datasource version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder dataSourceVersion(String dataSourceVersion) {
            this.dataSourceVersion = dataSourceVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable data caching.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCache(Boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        /**
         * <p>The ModelGallery model ID to mount. The latest version of the model that you have access to is used. You must specify one of DataSourceId, Uri, or ModelId. Model mounting supports read-only access only.</p>
         * 
         * <strong>example:</strong>
         * <p>model-v63llpfh7u824imbni</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The mount access mode.</p>
         * 
         * <strong>example:</strong>
         * <p>RO</p>
         */
        public Builder mountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }

        /**
         * <p>The absolute mount path in the worker container. This parameter is required for RLJob datasources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/input</p>
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>The extended datasource configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The ARN of the RAM role used to access the datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1872xxxxxxxxx:role/account-pai-prod</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The JSON string of the role chain used to access the datasource.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder roleChain(String roleChain) {
            this.roleChain = roleChain;
            return this;
        }

        /**
         * <p>The datasource URI. You must specify one of DataSourceId, Uri, or ModelId.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://example-bucket/data/</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public RLJobDataSourceConfig build() {
            return new RLJobDataSourceConfig(this);
        } 

    } 

}
