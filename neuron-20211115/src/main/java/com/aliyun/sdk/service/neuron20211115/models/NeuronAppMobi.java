// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppMobi} extends {@link TeaModel}
 *
 * <p>NeuronAppMobi</p>
 */
public class NeuronAppMobi extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appId")
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("artifactUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactUrl;

    @com.aliyun.core.annotation.NameInMap("commitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commitId;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("mobiUserId")
    private String mobiUserId;

    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.NameInMap("moduleName")
    private String moduleName;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("storeUrl")
    private String storeUrl;

    @com.aliyun.core.annotation.NameInMap("token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private NeuronAppMobi(Builder builder) {
        this.appId = builder.appId;
        this.artifactUrl = builder.artifactUrl;
        this.commitId = builder.commitId;
        this.enterpriseId = builder.enterpriseId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.mobiUserId = builder.mobiUserId;
        this.moduleId = builder.moduleId;
        this.moduleName = builder.moduleName;
        this.schemaVersion = builder.schemaVersion;
        this.status = builder.status;
        this.storeUrl = builder.storeUrl;
        this.token = builder.token;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppMobi create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return artifactUrl
     */
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * @return commitId
     */
    public String getCommitId() {
        return this.commitId;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mobiUserId
     */
    public String getMobiUserId() {
        return this.mobiUserId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storeUrl
     */
    public String getStoreUrl() {
        return this.storeUrl;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long appId; 
        private String artifactUrl; 
        private String commitId; 
        private Long enterpriseId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String mobiUserId; 
        private String moduleId; 
        private String moduleName; 
        private String schemaVersion; 
        private String status; 
        private String storeUrl; 
        private String token; 
        private String version; 

        private Builder() {
        } 

        private Builder(NeuronAppMobi model) {
            this.appId = model.appId;
            this.artifactUrl = model.artifactUrl;
            this.commitId = model.commitId;
            this.enterpriseId = model.enterpriseId;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.mobiUserId = model.mobiUserId;
            this.moduleId = model.moduleId;
            this.moduleName = model.moduleName;
            this.schemaVersion = model.schemaVersion;
            this.status = model.status;
            this.storeUrl = model.storeUrl;
            this.token = model.token;
            this.version = model.version;
        } 

        /**
         * appId.
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sda</p>
         */
        public Builder artifactUrl(String artifactUrl) {
            this.artifactUrl = artifactUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sda</p>
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * mobiUserId.
         */
        public Builder mobiUserId(String mobiUserId) {
            this.mobiUserId = mobiUserId;
            return this;
        }

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * moduleName.
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * schemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
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
         * storeUrl.
         */
        public Builder storeUrl(String storeUrl) {
            this.storeUrl = storeUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdasdaddsad</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public NeuronAppMobi build() {
            return new NeuronAppMobi(this);
        } 

    } 

}
