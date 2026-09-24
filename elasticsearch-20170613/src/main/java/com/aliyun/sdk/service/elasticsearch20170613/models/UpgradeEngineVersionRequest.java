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
         * <p>The instance ID.</p>
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
         * <p>The upgrade type. Valid values:</p>
         * <ul>
         * <li>engineVersion (default): major engine version upgrade.</li>
         * <li>aliVersion: kernel version upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>engineVersion</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The version after the upgrade. If type is set to engineVersion, the value is the instance version, such as 6.7. If type is set to aliVersion, the value is the kernel version, such as ali1.2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>6.7</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>Specifies whether to perform a pre-upgrade check. Valid values:</p>
         * <ul>
         * <li>true: performs a check.</li>
         * <li>false (default): does not perform a check.</li>
         * </ul>
         * <blockquote>
         * <p>Warning:  The version upgrade check involves checks on cluster YML, plug-in configurations, cluster status, indexes, and resources. Perform a pre-upgrade check before upgrading. Otherwise, upgrade issues may occur.</p>
         * </blockquote>
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
         * <p>The update strategy. Valid values:</p>
         * <ul>
         * <li>blue_green: blue-green deployment.</li>
         * <li>normal: in-place update.</li>
         * <li>intelligent: intelligent update.</li>
         * </ul>
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
             * <p>Specifies whether to install or uninstall the plug-in. A value of true indicates install, and a value of false indicates uninstall.</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The fileVersion of the plug-in. Refer to the response of ListUserPlugin.</p>
             */
            public Builder fileVersion(String fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>The plug-in name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Elasticsearch version for the plug-in, such as 7.16.2.</p>
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
