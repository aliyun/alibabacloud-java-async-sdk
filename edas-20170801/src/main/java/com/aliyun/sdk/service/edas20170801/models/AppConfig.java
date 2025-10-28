// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link AppConfig} extends {@link TeaModel}
 *
 * <p>AppConfig</p>
 */
public class AppConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private java.util.List<String> commandArgs;

    @com.aliyun.core.annotation.NameInMap("ConfigMountDescs")
    private java.util.List<ConfigMountDescs> configMountDescs;

    @com.aliyun.core.annotation.NameInMap("DeployAcrossNodes")
    private Boolean deployAcrossNodes;

    @com.aliyun.core.annotation.NameInMap("DeployAcrossZones")
    private Boolean deployAcrossZones;

    @com.aliyun.core.annotation.NameInMap("EmptyDirs")
    private java.util.List<EmptyDirs> emptyDirs;

    @com.aliyun.core.annotation.NameInMap("EnableAhas")
    private Boolean enableAhas;

    @com.aliyun.core.annotation.NameInMap("EnvFroms")
    private java.util.List<EnvFroms> envFroms;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @com.aliyun.core.annotation.NameInMap("IsMultilingualApp")
    private Boolean isMultilingualApp;

    @com.aliyun.core.annotation.NameInMap("JavaStartUpConfig")
    private String javaStartUpConfig;

    @com.aliyun.core.annotation.NameInMap("LimitCpu")
    private String limitCpu;

    @com.aliyun.core.annotation.NameInMap("LimitMem")
    private String limitMem;

    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.NameInMap("LocalVolumes")
    private java.util.List<LocalVolumes> localVolumes;

    @com.aliyun.core.annotation.NameInMap("NasId")
    private String nasId;

    @com.aliyun.core.annotation.NameInMap("NasMountDescs")
    private java.util.List<NasMountDescs> nasMountDescs;

    @com.aliyun.core.annotation.NameInMap("NasStorageType")
    private String nasStorageType;

    @com.aliyun.core.annotation.NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @com.aliyun.core.annotation.NameInMap("PostStart")
    private String postStart;

    @com.aliyun.core.annotation.NameInMap("PreStop")
    private String preStop;

    @com.aliyun.core.annotation.NameInMap("PvcMountDescs")
    private java.util.List<PvcMountDescs> pvcMountDescs;

    @com.aliyun.core.annotation.NameInMap("Readiness")
    private String readiness;

    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Long replicas;

    @com.aliyun.core.annotation.NameInMap("RequestCpu")
    private String requestCpu;

    @com.aliyun.core.annotation.NameInMap("RequestMem")
    private String requestMem;

    @com.aliyun.core.annotation.NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @com.aliyun.core.annotation.NameInMap("SlsConfigs")
    private java.util.List<SlsConfigs> slsConfigs;

    @com.aliyun.core.annotation.NameInMap("WebContainerConfig")
    private WebContainerConfig webContainerConfig;

    private AppConfig(Builder builder) {
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMountDescs = builder.configMountDescs;
        this.deployAcrossNodes = builder.deployAcrossNodes;
        this.deployAcrossZones = builder.deployAcrossZones;
        this.emptyDirs = builder.emptyDirs;
        this.enableAhas = builder.enableAhas;
        this.envFroms = builder.envFroms;
        this.envs = builder.envs;
        this.imageConfig = builder.imageConfig;
        this.isMultilingualApp = builder.isMultilingualApp;
        this.javaStartUpConfig = builder.javaStartUpConfig;
        this.limitCpu = builder.limitCpu;
        this.limitMem = builder.limitMem;
        this.liveness = builder.liveness;
        this.localVolumes = builder.localVolumes;
        this.nasId = builder.nasId;
        this.nasMountDescs = builder.nasMountDescs;
        this.nasStorageType = builder.nasStorageType;
        this.packageConfig = builder.packageConfig;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.pvcMountDescs = builder.pvcMountDescs;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.requestCpu = builder.requestCpu;
        this.requestMem = builder.requestMem;
        this.runtimeClassName = builder.runtimeClassName;
        this.slsConfigs = builder.slsConfigs;
        this.webContainerConfig = builder.webContainerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public java.util.List<String> getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMountDescs
     */
    public java.util.List<ConfigMountDescs> getConfigMountDescs() {
        return this.configMountDescs;
    }

    /**
     * @return deployAcrossNodes
     */
    public Boolean getDeployAcrossNodes() {
        return this.deployAcrossNodes;
    }

    /**
     * @return deployAcrossZones
     */
    public Boolean getDeployAcrossZones() {
        return this.deployAcrossZones;
    }

    /**
     * @return emptyDirs
     */
    public java.util.List<EmptyDirs> getEmptyDirs() {
        return this.emptyDirs;
    }

    /**
     * @return enableAhas
     */
    public Boolean getEnableAhas() {
        return this.enableAhas;
    }

    /**
     * @return envFroms
     */
    public java.util.List<EnvFroms> getEnvFroms() {
        return this.envFroms;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return imageConfig
     */
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    /**
     * @return isMultilingualApp
     */
    public Boolean getIsMultilingualApp() {
        return this.isMultilingualApp;
    }

    /**
     * @return javaStartUpConfig
     */
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    /**
     * @return limitCpu
     */
    public String getLimitCpu() {
        return this.limitCpu;
    }

    /**
     * @return limitMem
     */
    public String getLimitMem() {
        return this.limitMem;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return localVolumes
     */
    public java.util.List<LocalVolumes> getLocalVolumes() {
        return this.localVolumes;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return nasMountDescs
     */
    public java.util.List<NasMountDescs> getNasMountDescs() {
        return this.nasMountDescs;
    }

    /**
     * @return nasStorageType
     */
    public String getNasStorageType() {
        return this.nasStorageType;
    }

    /**
     * @return packageConfig
     */
    public PackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return pvcMountDescs
     */
    public java.util.List<PvcMountDescs> getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    /**
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
    }

    /**
     * @return replicas
     */
    public Long getReplicas() {
        return this.replicas;
    }

    /**
     * @return requestCpu
     */
    public String getRequestCpu() {
        return this.requestCpu;
    }

    /**
     * @return requestMem
     */
    public String getRequestMem() {
        return this.requestMem;
    }

    /**
     * @return runtimeClassName
     */
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    /**
     * @return slsConfigs
     */
    public java.util.List<SlsConfigs> getSlsConfigs() {
        return this.slsConfigs;
    }

    /**
     * @return webContainerConfig
     */
    public WebContainerConfig getWebContainerConfig() {
        return this.webContainerConfig;
    }

    public static final class Builder {
        private String command; 
        private java.util.List<String> commandArgs; 
        private java.util.List<ConfigMountDescs> configMountDescs; 
        private Boolean deployAcrossNodes; 
        private Boolean deployAcrossZones; 
        private java.util.List<EmptyDirs> emptyDirs; 
        private Boolean enableAhas; 
        private java.util.List<EnvFroms> envFroms; 
        private java.util.List<Envs> envs; 
        private ImageConfig imageConfig; 
        private Boolean isMultilingualApp; 
        private String javaStartUpConfig; 
        private String limitCpu; 
        private String limitMem; 
        private String liveness; 
        private java.util.List<LocalVolumes> localVolumes; 
        private String nasId; 
        private java.util.List<NasMountDescs> nasMountDescs; 
        private String nasStorageType; 
        private PackageConfig packageConfig; 
        private String postStart; 
        private String preStop; 
        private java.util.List<PvcMountDescs> pvcMountDescs; 
        private String readiness; 
        private Long replicas; 
        private String requestCpu; 
        private String requestMem; 
        private String runtimeClassName; 
        private java.util.List<SlsConfigs> slsConfigs; 
        private WebContainerConfig webContainerConfig; 

        private Builder() {
        } 

        private Builder(AppConfig model) {
            this.command = model.command;
            this.commandArgs = model.commandArgs;
            this.configMountDescs = model.configMountDescs;
            this.deployAcrossNodes = model.deployAcrossNodes;
            this.deployAcrossZones = model.deployAcrossZones;
            this.emptyDirs = model.emptyDirs;
            this.enableAhas = model.enableAhas;
            this.envFroms = model.envFroms;
            this.envs = model.envs;
            this.imageConfig = model.imageConfig;
            this.isMultilingualApp = model.isMultilingualApp;
            this.javaStartUpConfig = model.javaStartUpConfig;
            this.limitCpu = model.limitCpu;
            this.limitMem = model.limitMem;
            this.liveness = model.liveness;
            this.localVolumes = model.localVolumes;
            this.nasId = model.nasId;
            this.nasMountDescs = model.nasMountDescs;
            this.nasStorageType = model.nasStorageType;
            this.packageConfig = model.packageConfig;
            this.postStart = model.postStart;
            this.preStop = model.preStop;
            this.pvcMountDescs = model.pvcMountDescs;
            this.readiness = model.readiness;
            this.replicas = model.replicas;
            this.requestCpu = model.requestCpu;
            this.requestMem = model.requestMem;
            this.runtimeClassName = model.runtimeClassName;
            this.slsConfigs = model.slsConfigs;
            this.webContainerConfig = model.webContainerConfig;
        } 

        /**
         * Command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * CommandArgs.
         */
        public Builder commandArgs(java.util.List<String> commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * ConfigMountDescs.
         */
        public Builder configMountDescs(java.util.List<ConfigMountDescs> configMountDescs) {
            this.configMountDescs = configMountDescs;
            return this;
        }

        /**
         * DeployAcrossNodes.
         */
        public Builder deployAcrossNodes(Boolean deployAcrossNodes) {
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }

        /**
         * DeployAcrossZones.
         */
        public Builder deployAcrossZones(Boolean deployAcrossZones) {
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }

        /**
         * EmptyDirs.
         */
        public Builder emptyDirs(java.util.List<EmptyDirs> emptyDirs) {
            this.emptyDirs = emptyDirs;
            return this;
        }

        /**
         * EnableAhas.
         */
        public Builder enableAhas(Boolean enableAhas) {
            this.enableAhas = enableAhas;
            return this;
        }

        /**
         * EnvFroms.
         */
        public Builder envFroms(java.util.List<EnvFroms> envFroms) {
            this.envFroms = envFroms;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * ImageConfig.
         */
        public Builder imageConfig(ImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * IsMultilingualApp.
         */
        public Builder isMultilingualApp(Boolean isMultilingualApp) {
            this.isMultilingualApp = isMultilingualApp;
            return this;
        }

        /**
         * JavaStartUpConfig.
         */
        public Builder javaStartUpConfig(String javaStartUpConfig) {
            this.javaStartUpConfig = javaStartUpConfig;
            return this;
        }

        /**
         * LimitCpu.
         */
        public Builder limitCpu(String limitCpu) {
            this.limitCpu = limitCpu;
            return this;
        }

        /**
         * LimitMem.
         */
        public Builder limitMem(String limitMem) {
            this.limitMem = limitMem;
            return this;
        }

        /**
         * Liveness.
         */
        public Builder liveness(String liveness) {
            this.liveness = liveness;
            return this;
        }

        /**
         * LocalVolumes.
         */
        public Builder localVolumes(java.util.List<LocalVolumes> localVolumes) {
            this.localVolumes = localVolumes;
            return this;
        }

        /**
         * NasId.
         */
        public Builder nasId(String nasId) {
            this.nasId = nasId;
            return this;
        }

        /**
         * NasMountDescs.
         */
        public Builder nasMountDescs(java.util.List<NasMountDescs> nasMountDescs) {
            this.nasMountDescs = nasMountDescs;
            return this;
        }

        /**
         * NasStorageType.
         */
        public Builder nasStorageType(String nasStorageType) {
            this.nasStorageType = nasStorageType;
            return this;
        }

        /**
         * PackageConfig.
         */
        public Builder packageConfig(PackageConfig packageConfig) {
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * PostStart.
         */
        public Builder postStart(String postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * PreStop.
         */
        public Builder preStop(String preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * PvcMountDescs.
         */
        public Builder pvcMountDescs(java.util.List<PvcMountDescs> pvcMountDescs) {
            this.pvcMountDescs = pvcMountDescs;
            return this;
        }

        /**
         * Readiness.
         */
        public Builder readiness(String readiness) {
            this.readiness = readiness;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Long replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * RequestCpu.
         */
        public Builder requestCpu(String requestCpu) {
            this.requestCpu = requestCpu;
            return this;
        }

        /**
         * RequestMem.
         */
        public Builder requestMem(String requestMem) {
            this.requestMem = requestMem;
            return this;
        }

        /**
         * RuntimeClassName.
         */
        public Builder runtimeClassName(String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        /**
         * SlsConfigs.
         */
        public Builder slsConfigs(java.util.List<SlsConfigs> slsConfigs) {
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * WebContainerConfig.
         */
        public Builder webContainerConfig(WebContainerConfig webContainerConfig) {
            this.webContainerConfig = webContainerConfig;
            return this;
        }

        public AppConfig build() {
            return new AppConfig(this);
        } 

    } 

    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class MountItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private MountItems(Builder builder) {
            this.key = builder.key;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountItems create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String key; 
            private String path; 

            private Builder() {
            } 

            private Builder(MountItems model) {
                this.key = model.key;
                this.path = model.path;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public MountItems build() {
                return new MountItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class ConfigMountDescs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountItems")
        private java.util.List<MountItems> mountItems;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ConfigMountDescs(Builder builder) {
            this.mountItems = builder.mountItems;
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigMountDescs create() {
            return builder().build();
        }

        /**
         * @return mountItems
         */
        public java.util.List<MountItems> getMountItems() {
            return this.mountItems;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<MountItems> mountItems; 
            private String mountPath; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ConfigMountDescs model) {
                this.mountItems = model.mountItems;
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * MountItems.
             */
            public Builder mountItems(java.util.List<MountItems> mountItems) {
                this.mountItems = mountItems;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConfigMountDescs build() {
                return new ConfigMountDescs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class EmptyDirs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPathExpr")
        private String subPathExpr;

        private EmptyDirs(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPathExpr = builder.subPathExpr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyDirs create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPathExpr
         */
        public String getSubPathExpr() {
            return this.subPathExpr;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private Boolean readOnly; 
            private String subPathExpr; 

            private Builder() {
            } 

            private Builder(EmptyDirs model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.readOnly = model.readOnly;
                this.subPathExpr = model.subPathExpr;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * SubPathExpr.
             */
            public Builder subPathExpr(String subPathExpr) {
                this.subPathExpr = subPathExpr;
                return this;
            }

            public EmptyDirs build() {
                return new EmptyDirs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class EnvFroms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapRef")
        private String configMapRef;

        @com.aliyun.core.annotation.NameInMap("SecretRef")
        private String secretRef;

        private EnvFroms(Builder builder) {
            this.configMapRef = builder.configMapRef;
            this.secretRef = builder.secretRef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvFroms create() {
            return builder().build();
        }

        /**
         * @return configMapRef
         */
        public String getConfigMapRef() {
            return this.configMapRef;
        }

        /**
         * @return secretRef
         */
        public String getSecretRef() {
            return this.secretRef;
        }

        public static final class Builder {
            private String configMapRef; 
            private String secretRef; 

            private Builder() {
            } 

            private Builder(EnvFroms model) {
                this.configMapRef = model.configMapRef;
                this.secretRef = model.secretRef;
            } 

            /**
             * ConfigMapRef.
             */
            public Builder configMapRef(String configMapRef) {
                this.configMapRef = configMapRef;
                return this;
            }

            /**
             * SecretRef.
             */
            public Builder secretRef(String secretRef) {
                this.secretRef = secretRef;
                return this;
            }

            public EnvFroms build() {
                return new EnvFroms(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueFrom")
        private String valueFrom;

        private Envs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
            this.valueFrom = builder.valueFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueFrom
         */
        public String getValueFrom() {
            return this.valueFrom;
        }

        public static final class Builder {
            private String name; 
            private String value; 
            private String valueFrom; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.name = model.name;
                this.value = model.value;
                this.valueFrom = model.valueFrom;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueFrom.
             */
            public Builder valueFrom(String valueFrom) {
                this.valueFrom = valueFrom;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class ImageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerRegistryId")
        private String containerRegistryId;

        @com.aliyun.core.annotation.NameInMap("CrInstanceId")
        private String crInstanceId;

        @com.aliyun.core.annotation.NameInMap("CrRegionId")
        private String crRegionId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        private ImageConfig(Builder builder) {
            this.containerRegistryId = builder.containerRegistryId;
            this.crInstanceId = builder.crInstanceId;
            this.crRegionId = builder.crRegionId;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageConfig create() {
            return builder().build();
        }

        /**
         * @return containerRegistryId
         */
        public String getContainerRegistryId() {
            return this.containerRegistryId;
        }

        /**
         * @return crInstanceId
         */
        public String getCrInstanceId() {
            return this.crInstanceId;
        }

        /**
         * @return crRegionId
         */
        public String getCrRegionId() {
            return this.crRegionId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String containerRegistryId; 
            private String crInstanceId; 
            private String crRegionId; 
            private String imageUrl; 

            private Builder() {
            } 

            private Builder(ImageConfig model) {
                this.containerRegistryId = model.containerRegistryId;
                this.crInstanceId = model.crInstanceId;
                this.crRegionId = model.crRegionId;
                this.imageUrl = model.imageUrl;
            } 

            /**
             * ContainerRegistryId.
             */
            public Builder containerRegistryId(String containerRegistryId) {
                this.containerRegistryId = containerRegistryId;
                return this;
            }

            /**
             * CrInstanceId.
             */
            public Builder crInstanceId(String crInstanceId) {
                this.crInstanceId = crInstanceId;
                return this;
            }

            /**
             * CrRegionId.
             */
            public Builder crRegionId(String crRegionId) {
                this.crRegionId = crRegionId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public ImageConfig build() {
                return new ImageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class LocalVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodePath")
        private String nodePath;

        @com.aliyun.core.annotation.NameInMap("OpsAuth")
        private Long opsAuth;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private LocalVolumes(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.nodePath = builder.nodePath;
            this.opsAuth = builder.opsAuth;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalVolumes create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodePath
         */
        public String getNodePath() {
            return this.nodePath;
        }

        /**
         * @return opsAuth
         */
        public Long getOpsAuth() {
            return this.opsAuth;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private String nodePath; 
            private Long opsAuth; 
            private String type; 

            private Builder() {
            } 

            private Builder(LocalVolumes model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.nodePath = model.nodePath;
                this.opsAuth = model.opsAuth;
                this.type = model.type;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodePath.
             */
            public Builder nodePath(String nodePath) {
                this.nodePath = nodePath;
                return this;
            }

            /**
             * OpsAuth.
             */
            public Builder opsAuth(Long opsAuth) {
                this.opsAuth = opsAuth;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LocalVolumes build() {
                return new LocalVolumes(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class NasMountDescs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("NasPath")
        private String nasPath;

        private NasMountDescs(Builder builder) {
            this.mountPath = builder.mountPath;
            this.nasPath = builder.nasPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NasMountDescs create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return nasPath
         */
        public String getNasPath() {
            return this.nasPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String nasPath; 

            private Builder() {
            } 

            private Builder(NasMountDescs model) {
                this.mountPath = model.mountPath;
                this.nasPath = model.nasPath;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * NasPath.
             */
            public Builder nasPath(String nasPath) {
                this.nasPath = nasPath;
                return this;
            }

            public NasMountDescs build() {
                return new NasMountDescs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class PackageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @com.aliyun.core.annotation.NameInMap("Jdk")
        private String jdk;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("UriEncoding")
        private String uriEncoding;

        @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @com.aliyun.core.annotation.NameInMap("WebContainer")
        private String webContainer;

        private PackageConfig(Builder builder) {
            this.edasContainerVersion = builder.edasContainerVersion;
            this.jdk = builder.jdk;
            this.packageType = builder.packageType;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
            this.timezone = builder.timezone;
            this.uriEncoding = builder.uriEncoding;
            this.useBodyEncoding = builder.useBodyEncoding;
            this.webContainer = builder.webContainer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageConfig create() {
            return builder().build();
        }

        /**
         * @return edasContainerVersion
         */
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        /**
         * @return jdk
         */
        public String getJdk() {
            return this.jdk;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return uriEncoding
         */
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        /**
         * @return useBodyEncoding
         */
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        /**
         * @return webContainer
         */
        public String getWebContainer() {
            return this.webContainer;
        }

        public static final class Builder {
            private String edasContainerVersion; 
            private String jdk; 
            private String packageType; 
            private String packageUrl; 
            private String packageVersion; 
            private String timezone; 
            private String uriEncoding; 
            private Boolean useBodyEncoding; 
            private String webContainer; 

            private Builder() {
            } 

            private Builder(PackageConfig model) {
                this.edasContainerVersion = model.edasContainerVersion;
                this.jdk = model.jdk;
                this.packageType = model.packageType;
                this.packageUrl = model.packageUrl;
                this.packageVersion = model.packageVersion;
                this.timezone = model.timezone;
                this.uriEncoding = model.uriEncoding;
                this.useBodyEncoding = model.useBodyEncoding;
                this.webContainer = model.webContainer;
            } 

            /**
             * EdasContainerVersion.
             */
            public Builder edasContainerVersion(String edasContainerVersion) {
                this.edasContainerVersion = edasContainerVersion;
                return this;
            }

            /**
             * Jdk.
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * PackageVersion.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * UriEncoding.
             */
            public Builder uriEncoding(String uriEncoding) {
                this.uriEncoding = uriEncoding;
                return this;
            }

            /**
             * UseBodyEncoding.
             */
            public Builder useBodyEncoding(Boolean useBodyEncoding) {
                this.useBodyEncoding = useBodyEncoding;
                return this;
            }

            /**
             * WebContainer.
             */
            public Builder webContainer(String webContainer) {
                this.webContainer = webContainer;
                return this;
            }

            public PackageConfig build() {
                return new PackageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class MountPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPathExpr")
        private String subPathExpr;

        private MountPaths(Builder builder) {
            this.mountPath = builder.mountPath;
            this.readOnly = builder.readOnly;
            this.subPathExpr = builder.subPathExpr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPaths create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPathExpr
         */
        public String getSubPathExpr() {
            return this.subPathExpr;
        }

        public static final class Builder {
            private String mountPath; 
            private Boolean readOnly; 
            private String subPathExpr; 

            private Builder() {
            } 

            private Builder(MountPaths model) {
                this.mountPath = model.mountPath;
                this.readOnly = model.readOnly;
                this.subPathExpr = model.subPathExpr;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * SubPathExpr.
             */
            public Builder subPathExpr(String subPathExpr) {
                this.subPathExpr = subPathExpr;
                return this;
            }

            public MountPaths build() {
                return new MountPaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class PvcMountDescs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPaths")
        private java.util.List<MountPaths> mountPaths;

        @com.aliyun.core.annotation.NameInMap("PvcName")
        private String pvcName;

        private PvcMountDescs(Builder builder) {
            this.mountPaths = builder.mountPaths;
            this.pvcName = builder.pvcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PvcMountDescs create() {
            return builder().build();
        }

        /**
         * @return mountPaths
         */
        public java.util.List<MountPaths> getMountPaths() {
            return this.mountPaths;
        }

        /**
         * @return pvcName
         */
        public String getPvcName() {
            return this.pvcName;
        }

        public static final class Builder {
            private java.util.List<MountPaths> mountPaths; 
            private String pvcName; 

            private Builder() {
            } 

            private Builder(PvcMountDescs model) {
                this.mountPaths = model.mountPaths;
                this.pvcName = model.pvcName;
            } 

            /**
             * MountPaths.
             */
            public Builder mountPaths(java.util.List<MountPaths> mountPaths) {
                this.mountPaths = mountPaths;
                return this;
            }

            /**
             * PvcName.
             */
            public Builder pvcName(String pvcName) {
                this.pvcName = pvcName;
                return this;
            }

            public PvcMountDescs build() {
                return new PvcMountDescs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class SlsConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogDir")
        private String logDir;

        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SlsConfigs(Builder builder) {
            this.logDir = builder.logDir;
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigs create() {
            return builder().build();
        }

        /**
         * @return logDir
         */
        public String getLogDir() {
            return this.logDir;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String logDir; 
            private String logstore; 
            private String project; 
            private String type; 

            private Builder() {
            } 

            private Builder(SlsConfigs model) {
                this.logDir = model.logDir;
                this.logstore = model.logstore;
                this.project = model.project;
                this.type = model.type;
            } 

            /**
             * LogDir.
             */
            public Builder logDir(String logDir) {
                this.logDir = logDir;
                return this;
            }

            /**
             * Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SlsConfigs build() {
                return new SlsConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link AppConfig} extends {@link TeaModel}
     *
     * <p>AppConfig</p>
     */
    public static class WebContainerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectorType")
        private String connectorType;

        @com.aliyun.core.annotation.NameInMap("ContextInputType")
        private String contextInputType;

        @com.aliyun.core.annotation.NameInMap("ContextPath")
        private String contextPath;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private Long httpPort;

        @com.aliyun.core.annotation.NameInMap("MaxThreads")
        private Long maxThreads;

        @com.aliyun.core.annotation.NameInMap("ServerXml")
        private String serverXml;

        @com.aliyun.core.annotation.NameInMap("UriEncoding")
        private String uriEncoding;

        @com.aliyun.core.annotation.NameInMap("UseAdvancedServerXml")
        private Boolean useAdvancedServerXml;

        @com.aliyun.core.annotation.NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @com.aliyun.core.annotation.NameInMap("UseDefaultConfig")
        private Boolean useDefaultConfig;

        private WebContainerConfig(Builder builder) {
            this.connectorType = builder.connectorType;
            this.contextInputType = builder.contextInputType;
            this.contextPath = builder.contextPath;
            this.httpPort = builder.httpPort;
            this.maxThreads = builder.maxThreads;
            this.serverXml = builder.serverXml;
            this.uriEncoding = builder.uriEncoding;
            this.useAdvancedServerXml = builder.useAdvancedServerXml;
            this.useBodyEncoding = builder.useBodyEncoding;
            this.useDefaultConfig = builder.useDefaultConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebContainerConfig create() {
            return builder().build();
        }

        /**
         * @return connectorType
         */
        public String getConnectorType() {
            return this.connectorType;
        }

        /**
         * @return contextInputType
         */
        public String getContextInputType() {
            return this.contextInputType;
        }

        /**
         * @return contextPath
         */
        public String getContextPath() {
            return this.contextPath;
        }

        /**
         * @return httpPort
         */
        public Long getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return maxThreads
         */
        public Long getMaxThreads() {
            return this.maxThreads;
        }

        /**
         * @return serverXml
         */
        public String getServerXml() {
            return this.serverXml;
        }

        /**
         * @return uriEncoding
         */
        public String getUriEncoding() {
            return this.uriEncoding;
        }

        /**
         * @return useAdvancedServerXml
         */
        public Boolean getUseAdvancedServerXml() {
            return this.useAdvancedServerXml;
        }

        /**
         * @return useBodyEncoding
         */
        public Boolean getUseBodyEncoding() {
            return this.useBodyEncoding;
        }

        /**
         * @return useDefaultConfig
         */
        public Boolean getUseDefaultConfig() {
            return this.useDefaultConfig;
        }

        public static final class Builder {
            private String connectorType; 
            private String contextInputType; 
            private String contextPath; 
            private Long httpPort; 
            private Long maxThreads; 
            private String serverXml; 
            private String uriEncoding; 
            private Boolean useAdvancedServerXml; 
            private Boolean useBodyEncoding; 
            private Boolean useDefaultConfig; 

            private Builder() {
            } 

            private Builder(WebContainerConfig model) {
                this.connectorType = model.connectorType;
                this.contextInputType = model.contextInputType;
                this.contextPath = model.contextPath;
                this.httpPort = model.httpPort;
                this.maxThreads = model.maxThreads;
                this.serverXml = model.serverXml;
                this.uriEncoding = model.uriEncoding;
                this.useAdvancedServerXml = model.useAdvancedServerXml;
                this.useBodyEncoding = model.useBodyEncoding;
                this.useDefaultConfig = model.useDefaultConfig;
            } 

            /**
             * ConnectorType.
             */
            public Builder connectorType(String connectorType) {
                this.connectorType = connectorType;
                return this;
            }

            /**
             * ContextInputType.
             */
            public Builder contextInputType(String contextInputType) {
                this.contextInputType = contextInputType;
                return this;
            }

            /**
             * ContextPath.
             */
            public Builder contextPath(String contextPath) {
                this.contextPath = contextPath;
                return this;
            }

            /**
             * HttpPort.
             */
            public Builder httpPort(Long httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * MaxThreads.
             */
            public Builder maxThreads(Long maxThreads) {
                this.maxThreads = maxThreads;
                return this;
            }

            /**
             * ServerXml.
             */
            public Builder serverXml(String serverXml) {
                this.serverXml = serverXml;
                return this;
            }

            /**
             * UriEncoding.
             */
            public Builder uriEncoding(String uriEncoding) {
                this.uriEncoding = uriEncoding;
                return this;
            }

            /**
             * UseAdvancedServerXml.
             */
            public Builder useAdvancedServerXml(Boolean useAdvancedServerXml) {
                this.useAdvancedServerXml = useAdvancedServerXml;
                return this;
            }

            /**
             * UseBodyEncoding.
             */
            public Builder useBodyEncoding(Boolean useBodyEncoding) {
                this.useBodyEncoding = useBodyEncoding;
                return this;
            }

            /**
             * UseDefaultConfig.
             */
            public Builder useDefaultConfig(Boolean useDefaultConfig) {
                this.useDefaultConfig = useDefaultConfig;
                return this;
            }

            public WebContainerConfig build() {
                return new WebContainerConfig(this);
            } 

        } 

    }
}
