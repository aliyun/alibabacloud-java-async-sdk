// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppConfig} extends {@link TeaModel}
 *
 * <p>AppConfig</p>
 */
public class AppConfig extends TeaModel {
    @NameInMap("Command")
    private String command;

    @NameInMap("CommandArgs")
    private java.util.List < String > commandArgs;

    @NameInMap("ConfigMountDescs")
    private java.util.List < ConfigMountDescs> configMountDescs;

    @NameInMap("DeployAcrossNodes")
    private Boolean deployAcrossNodes;

    @NameInMap("DeployAcrossZones")
    private Boolean deployAcrossZones;

    @NameInMap("EmptyDirs")
    private java.util.List < EmptyDirs> emptyDirs;

    @NameInMap("EnableAhas")
    private Boolean enableAhas;

    @NameInMap("EnvFroms")
    private java.util.List < EnvFroms> envFroms;

    @NameInMap("Envs")
    private java.util.List < Envs> envs;

    @NameInMap("ImageConfig")
    private ImageConfig imageConfig;

    @NameInMap("IsMultilingualApp")
    private Boolean isMultilingualApp;

    @NameInMap("JavaStartUpConfig")
    private String javaStartUpConfig;

    @NameInMap("LimitCpu")
    private String limitCpu;

    @NameInMap("LimitMem")
    private String limitMem;

    @NameInMap("Liveness")
    private String liveness;

    @NameInMap("LocalVolumes")
    private java.util.List < LocalVolumes> localVolumes;

    @NameInMap("NasId")
    private String nasId;

    @NameInMap("NasMountDescs")
    private java.util.List < NasMountDescs> nasMountDescs;

    @NameInMap("NasStorageType")
    private String nasStorageType;

    @NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @NameInMap("PostStart")
    private String postStart;

    @NameInMap("PreStop")
    private String preStop;

    @NameInMap("PvcMountDescs")
    private java.util.List < PvcMountDescs> pvcMountDescs;

    @NameInMap("Readiness")
    private String readiness;

    @NameInMap("Replicas")
    private Long replicas;

    @NameInMap("RequestCpu")
    private String requestCpu;

    @NameInMap("RequestMem")
    private String requestMem;

    @NameInMap("RuntimeClassName")
    private String runtimeClassName;

    @NameInMap("SlsConfigs")
    private java.util.List < SlsConfigs> slsConfigs;

    @NameInMap("WebContainerConfig")
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

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public java.util.List < String > getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMountDescs
     */
    public java.util.List < ConfigMountDescs> getConfigMountDescs() {
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
    public java.util.List < EmptyDirs> getEmptyDirs() {
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
    public java.util.List < EnvFroms> getEnvFroms() {
        return this.envFroms;
    }

    /**
     * @return envs
     */
    public java.util.List < Envs> getEnvs() {
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
    public java.util.List < LocalVolumes> getLocalVolumes() {
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
    public java.util.List < NasMountDescs> getNasMountDescs() {
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
    public java.util.List < PvcMountDescs> getPvcMountDescs() {
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
    public java.util.List < SlsConfigs> getSlsConfigs() {
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
        private java.util.List < String > commandArgs; 
        private java.util.List < ConfigMountDescs> configMountDescs; 
        private Boolean deployAcrossNodes; 
        private Boolean deployAcrossZones; 
        private java.util.List < EmptyDirs> emptyDirs; 
        private Boolean enableAhas; 
        private java.util.List < EnvFroms> envFroms; 
        private java.util.List < Envs> envs; 
        private ImageConfig imageConfig; 
        private Boolean isMultilingualApp; 
        private String javaStartUpConfig; 
        private String limitCpu; 
        private String limitMem; 
        private String liveness; 
        private java.util.List < LocalVolumes> localVolumes; 
        private String nasId; 
        private java.util.List < NasMountDescs> nasMountDescs; 
        private String nasStorageType; 
        private PackageConfig packageConfig; 
        private String postStart; 
        private String preStop; 
        private java.util.List < PvcMountDescs> pvcMountDescs; 
        private String readiness; 
        private Long replicas; 
        private String requestCpu; 
        private String requestMem; 
        private String runtimeClassName; 
        private java.util.List < SlsConfigs> slsConfigs; 
        private WebContainerConfig webContainerConfig; 

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
        public Builder commandArgs(java.util.List < String > commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * ConfigMountDescs.
         */
        public Builder configMountDescs(java.util.List < ConfigMountDescs> configMountDescs) {
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
        public Builder emptyDirs(java.util.List < EmptyDirs> emptyDirs) {
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
        public Builder envFroms(java.util.List < EnvFroms> envFroms) {
            this.envFroms = envFroms;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.List < Envs> envs) {
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
        public Builder localVolumes(java.util.List < LocalVolumes> localVolumes) {
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
        public Builder nasMountDescs(java.util.List < NasMountDescs> nasMountDescs) {
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
        public Builder pvcMountDescs(java.util.List < PvcMountDescs> pvcMountDescs) {
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
        public Builder slsConfigs(java.util.List < SlsConfigs> slsConfigs) {
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

    public static class MountItems extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Path")
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
    public static class ConfigMountDescs extends TeaModel {
        @NameInMap("MountItems")
        private java.util.List < MountItems> mountItems;

        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
        public java.util.List < MountItems> getMountItems() {
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
            private java.util.List < MountItems> mountItems; 
            private String mountPath; 
            private String name; 
            private String type; 

            /**
             * MountItems.
             */
            public Builder mountItems(java.util.List < MountItems> mountItems) {
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
    public static class EmptyDirs extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPathExpr")
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
    public static class EnvFroms extends TeaModel {
        @NameInMap("ConfigMapRef")
        private String configMapRef;

        @NameInMap("SecretRef")
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
    public static class Envs extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueFrom")
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
    public static class ImageConfig extends TeaModel {
        @NameInMap("ContainerRegistryId")
        private String containerRegistryId;

        @NameInMap("CrInstanceId")
        private String crInstanceId;

        @NameInMap("CrRegionId")
        private String crRegionId;

        @NameInMap("ImageUrl")
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
    public static class LocalVolumes extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodePath")
        private String nodePath;

        @NameInMap("OpsAuth")
        private Long opsAuth;

        @NameInMap("Type")
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
    public static class NasMountDescs extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("NasPath")
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
    public static class PackageConfig extends TeaModel {
        @NameInMap("EdasContainerVersion")
        private String edasContainerVersion;

        @NameInMap("Jdk")
        private String jdk;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("Timezone")
        private String timezone;

        @NameInMap("UriEncoding")
        private String uriEncoding;

        @NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @NameInMap("WebContainer")
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
    public static class MountPaths extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPathExpr")
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
    public static class PvcMountDescs extends TeaModel {
        @NameInMap("MountPaths")
        private java.util.List < MountPaths> mountPaths;

        @NameInMap("PvcName")
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
        public java.util.List < MountPaths> getMountPaths() {
            return this.mountPaths;
        }

        /**
         * @return pvcName
         */
        public String getPvcName() {
            return this.pvcName;
        }

        public static final class Builder {
            private java.util.List < MountPaths> mountPaths; 
            private String pvcName; 

            /**
             * MountPaths.
             */
            public Builder mountPaths(java.util.List < MountPaths> mountPaths) {
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
    public static class SlsConfigs extends TeaModel {
        @NameInMap("LogDir")
        private String logDir;

        @NameInMap("Logstore")
        private String logstore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Type")
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
    public static class WebContainerConfig extends TeaModel {
        @NameInMap("ConnectorType")
        private String connectorType;

        @NameInMap("ContextInputType")
        private String contextInputType;

        @NameInMap("ContextPath")
        private String contextPath;

        @NameInMap("HttpPort")
        private Long httpPort;

        @NameInMap("MaxThreads")
        private Long maxThreads;

        @NameInMap("ServerXml")
        private String serverXml;

        @NameInMap("UriEncoding")
        private String uriEncoding;

        @NameInMap("UseAdvancedServerXml")
        private Boolean useAdvancedServerXml;

        @NameInMap("UseBodyEncoding")
        private Boolean useBodyEncoding;

        @NameInMap("UseDefaultConfig")
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
