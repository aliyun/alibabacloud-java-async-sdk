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
 * {@link AppPluginInfo} extends {@link TeaModel}
 *
 * <p>AppPluginInfo</p>
 */
public class AppPluginInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appId")
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("appVersion")
    private String appVersion;

    @com.aliyun.core.annotation.NameInMap("appVersionId")
    private Long appVersionId;

    @com.aliyun.core.annotation.NameInMap("config")
    private MobiPluginConfig config;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("pluginKey")
    private String pluginKey;

    @com.aliyun.core.annotation.NameInMap("pluginType")
    private String pluginType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private AppPluginInfo(Builder builder) {
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.appVersionId = builder.appVersionId;
        this.config = builder.config;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.pluginKey = builder.pluginKey;
        this.pluginType = builder.pluginType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppPluginInfo create() {
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
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return appVersionId
     */
    public Long getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return config
     */
    public MobiPluginConfig getConfig() {
        return this.config;
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
     * @return pluginKey
     */
    public String getPluginKey() {
        return this.pluginKey;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long appId; 
        private String appVersion; 
        private Long appVersionId; 
        private MobiPluginConfig config; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String pluginKey; 
        private String pluginType; 
        private String type; 

        private Builder() {
        } 

        private Builder(AppPluginInfo model) {
            this.appId = model.appId;
            this.appVersion = model.appVersion;
            this.appVersionId = model.appVersionId;
            this.config = model.config;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.pluginKey = model.pluginKey;
            this.pluginType = model.pluginType;
            this.type = model.type;
        } 

        /**
         * appId.
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * appVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * appVersionId.
         */
        public Builder appVersionId(Long appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * config.
         */
        public Builder config(MobiPluginConfig config) {
            this.config = config;
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
         * pluginKey.
         */
        public Builder pluginKey(String pluginKey) {
            this.pluginKey = pluginKey;
            return this;
        }

        /**
         * pluginType.
         */
        public Builder pluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AppPluginInfo build() {
            return new AppPluginInfo(this);
        } 

    } 

}
