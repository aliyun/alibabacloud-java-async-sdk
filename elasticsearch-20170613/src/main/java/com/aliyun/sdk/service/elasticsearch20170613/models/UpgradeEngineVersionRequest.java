// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpgradeEngineVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeEngineVersionRequest</p>
 */
public class UpgradeEngineVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("plugins")
    private java.util.List<Plugins> plugins;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateStrategy")
    private String updateStrategy;

    private UpgradeEngineVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.plugins = builder.plugins;
        this.type = builder.type;
        this.version = builder.version;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.updateStrategy = builder.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeEngineVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return plugins
     */
    public java.util.List<Plugins> getPlugins() {
        return this.plugins;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public static final class Builder extends Request.Builder<UpgradeEngineVersionRequest, Builder> {
        private String instanceId; 
        private java.util.List<Plugins> plugins; 
        private String type; 
        private String version; 
        private String clientToken; 
        private Boolean dryRun; 
        private String updateStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeEngineVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.plugins = request.plugins;
            this.type = request.type;
            this.version = request.version;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.updateStrategy = request.updateStrategy;
        } 

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * plugins.
         */
        public Builder plugins(java.util.List<Plugins> plugins) {
            this.putBodyParameter("plugins", plugins);
            this.plugins = plugins;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The moderation results.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The monitoring type. Valid values:</p>
         * <ul>
         * <li>checkClusterHealth: Cluster Health Status</li>
         * <li>checkConfigCompatible: Configuration Compatibility Status</li>
         * <li>checkClusterResource: resource space status</li>
         * <li>checkClusterSnapshot: Whether a snapshot exists</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * updateStrategy.
         */
        public Builder updateStrategy(String updateStrategy) {
            this.putQueryParameter("updateStrategy", updateStrategy);
            this.updateStrategy = updateStrategy;
            return this;
        }

        @Override
        public UpgradeEngineVersionRequest build() {
            return new UpgradeEngineVersionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeEngineVersionRequest} extends {@link TeaModel}
     *
     * <p>UpgradeEngineVersionRequest</p>
     */
    public static class Plugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("fileVersion")
        private String fileVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Plugins(Builder builder) {
            this.enable = builder.enable;
            this.fileVersion = builder.fileVersion;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plugins create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return fileVersion
         */
        public String getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String enable; 
            private String fileVersion; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Plugins model) {
                this.enable = model.enable;
                this.fileVersion = model.fileVersion;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * fileVersion.
             */
            public Builder fileVersion(String fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Plugins build() {
                return new Plugins(this);
            } 

        } 

    }
}
