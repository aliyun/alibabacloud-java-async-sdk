// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ModifyFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileSystemRequest</p>
 */
public class ModifyFileSystemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUpgradeConfig")
    private AutoUpgradeConfig autoUpgradeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private Options options;

    private ModifyFileSystemRequest(Builder builder) {
        super(builder);
        this.autoUpgradeConfig = builder.autoUpgradeConfig;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFileSystemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUpgradeConfig
     */
    public AutoUpgradeConfig getAutoUpgradeConfig() {
        return this.autoUpgradeConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<ModifyFileSystemRequest, Builder> {
        private AutoUpgradeConfig autoUpgradeConfig; 
        private String description; 
        private String fileSystemId; 
        private Options options; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFileSystemRequest request) {
            super(request);
            this.autoUpgradeConfig = request.autoUpgradeConfig;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.options = request.options;
        } 

        /**
         * <p>The auto-scaling configuration.</p>
         */
        public Builder autoUpgradeConfig(AutoUpgradeConfig autoUpgradeConfig) {
            String autoUpgradeConfigShrink = shrink(autoUpgradeConfig, "AutoUpgradeConfig", "json");
            this.putQueryParameter("AutoUpgradeConfig", autoUpgradeConfigShrink);
            this.autoUpgradeConfig = autoUpgradeConfig;
            return this;
        }

        /**
         * <p>The description of the file system.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter. It cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAS-test-1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose NAS: <code>31a8e4****</code>.</p>
         * </li>
         * <li><p>Extreme NAS: The ID must start with <code>extreme-</code>, for example, <code>extreme-0015****</code>.</p>
         * </li>
         * <li><p>Cloud Parallel File Storage (CPFS): The ID must start with <code>cpfs-</code>, for example, <code>cpfs-125487****</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The options.</p>
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "Options", "json");
            this.putQueryParameter("Options", optionsShrink);
            this.options = options;
            return this;
        }

        @Override
        public ModifyFileSystemRequest build() {
            return new ModifyFileSystemRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyFileSystemRequest} extends {@link TeaModel}
     *
     * <p>ModifyFileSystemRequest</p>
     */
    public static class AutoUpgradeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capacityUsedRatio")
        private Integer capacityUsedRatio;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("step")
        private Integer step;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        private AutoUpgradeConfig(Builder builder) {
            this.capacityUsedRatio = builder.capacityUsedRatio;
            this.enabled = builder.enabled;
            this.step = builder.step;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoUpgradeConfig create() {
            return builder().build();
        }

        /**
         * @return capacityUsedRatio
         */
        public Integer getCapacityUsedRatio() {
            return this.capacityUsedRatio;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer capacityUsedRatio; 
            private Boolean enabled; 
            private Integer step; 
            private Integer time; 

            private Builder() {
            } 

            private Builder(AutoUpgradeConfig model) {
                this.capacityUsedRatio = model.capacityUsedRatio;
                this.enabled = model.enabled;
                this.step = model.step;
                this.time = model.time;
            } 

            /**
             * <p>The capacity usage threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder capacityUsedRatio(Integer capacityUsedRatio) {
                this.capacityUsedRatio = capacityUsedRatio;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-scaling.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The scaling increment.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * <p>The duration.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public AutoUpgradeConfig build() {
                return new AutoUpgradeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyFileSystemRequest} extends {@link TeaModel}
     *
     * <p>ModifyFileSystemRequest</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableABE")
        private Boolean enableABE;

        @com.aliyun.core.annotation.NameInMap("EnableOplock")
        private Boolean enableOplock;

        @com.aliyun.core.annotation.NameInMap("VscAccessPointAccessOnly")
        private Boolean vscAccessPointAccessOnly;

        private Options(Builder builder) {
            this.enableABE = builder.enableABE;
            this.enableOplock = builder.enableOplock;
            this.vscAccessPointAccessOnly = builder.vscAccessPointAccessOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return enableABE
         */
        public Boolean getEnableABE() {
            return this.enableABE;
        }

        /**
         * @return enableOplock
         */
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

        /**
         * @return vscAccessPointAccessOnly
         */
        public Boolean getVscAccessPointAccessOnly() {
            return this.vscAccessPointAccessOnly;
        }

        public static final class Builder {
            private Boolean enableABE; 
            private Boolean enableOplock; 
            private Boolean vscAccessPointAccessOnly; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.enableABE = model.enableABE;
                this.enableOplock = model.enableOplock;
                this.vscAccessPointAccessOnly = model.vscAccessPointAccessOnly;
            } 

            /**
             * <p>Specifies whether to enable the SMB Access-Based Enumeration (ABE) feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableABE(Boolean enableABE) {
                this.enableABE = enableABE;
                return this;
            }

            /**
             * <p>Specifies whether the OpLock feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Not enabled.<blockquote>
             * <p>Only file systems of the SMB Protocol Type are supported.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOplock(Boolean enableOplock) {
                this.enableOplock = enableOplock;
                return this;
            }

            /**
             * <p>Specifies whether the Lingjun VSC mount target supports only access point-based access.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder vscAccessPointAccessOnly(Boolean vscAccessPointAccessOnly) {
                this.vscAccessPointAccessOnly = vscAccessPointAccessOnly;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
