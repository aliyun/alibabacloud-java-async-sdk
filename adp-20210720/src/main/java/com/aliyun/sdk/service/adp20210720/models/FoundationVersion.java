// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FoundationVersion} extends {@link TeaModel}
 *
 * <p>FoundationVersion</p>
 */
public class FoundationVersion extends TeaModel {
    @NameInMap("clusterConfigSchema")
    private String clusterConfigSchema;

    @NameInMap("clusterEngines")
    @Validation(required = true)
    private java.util.List < ClusterEngines> clusterEngines;

    @NameInMap("defaultClusterConfig")
    private String defaultClusterConfig;

    @NameInMap("description")
    private String description;

    @NameInMap("documents")
    private String documents;

    @NameInMap("driver")
    private Driver driver;

    @NameInMap("features")
    private java.util.List < String > features;

    @NameInMap("isDefault")
    private Boolean isDefault;

    @NameInMap("labels")
    private String labels;

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("packageTools")
    private java.util.List < PackageTools> packageTools;

    @NameInMap("platforms")
    private java.util.List < Platform > platforms;

    @NameInMap("specName")
    private String specName;

    @NameInMap("status")
    @Validation(required = true)
    private String status;

    @NameInMap("tools")
    private Tools tools;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @NameInMap("uid")
    private String uid;

    @NameInMap("userWhiteList")
    private java.util.List < String > userWhiteList;

    @NameInMap("version")
    @Validation(required = true)
    private String version;

    private FoundationVersion(Builder builder) {
        this.clusterConfigSchema = builder.clusterConfigSchema;
        this.clusterEngines = builder.clusterEngines;
        this.defaultClusterConfig = builder.defaultClusterConfig;
        this.description = builder.description;
        this.documents = builder.documents;
        this.driver = builder.driver;
        this.features = builder.features;
        this.isDefault = builder.isDefault;
        this.labels = builder.labels;
        this.name = builder.name;
        this.packageTools = builder.packageTools;
        this.platforms = builder.platforms;
        this.specName = builder.specName;
        this.status = builder.status;
        this.tools = builder.tools;
        this.type = builder.type;
        this.uid = builder.uid;
        this.userWhiteList = builder.userWhiteList;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FoundationVersion create() {
        return builder().build();
    }

    /**
     * @return clusterConfigSchema
     */
    public String getClusterConfigSchema() {
        return this.clusterConfigSchema;
    }

    /**
     * @return clusterEngines
     */
    public java.util.List < ClusterEngines> getClusterEngines() {
        return this.clusterEngines;
    }

    /**
     * @return defaultClusterConfig
     */
    public String getDefaultClusterConfig() {
        return this.defaultClusterConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documents
     */
    public String getDocuments() {
        return this.documents;
    }

    /**
     * @return driver
     */
    public Driver getDriver() {
        return this.driver;
    }

    /**
     * @return features
     */
    public java.util.List < String > getFeatures() {
        return this.features;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return packageTools
     */
    public java.util.List < PackageTools> getPackageTools() {
        return this.packageTools;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platform > getPlatforms() {
        return this.platforms;
    }

    /**
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tools
     */
    public Tools getTools() {
        return this.tools;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userWhiteList
     */
    public java.util.List < String > getUserWhiteList() {
        return this.userWhiteList;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String clusterConfigSchema; 
        private java.util.List < ClusterEngines> clusterEngines; 
        private String defaultClusterConfig; 
        private String description; 
        private String documents; 
        private Driver driver; 
        private java.util.List < String > features; 
        private Boolean isDefault; 
        private String labels; 
        private String name; 
        private java.util.List < PackageTools> packageTools; 
        private java.util.List < Platform > platforms; 
        private String specName; 
        private String status; 
        private Tools tools; 
        private String type; 
        private String uid; 
        private java.util.List < String > userWhiteList; 
        private String version; 

        /**
         * clusterConfigSchema.
         */
        public Builder clusterConfigSchema(String clusterConfigSchema) {
            this.clusterConfigSchema = clusterConfigSchema;
            return this;
        }

        /**
         * clusterEngines.
         */
        public Builder clusterEngines(java.util.List < ClusterEngines> clusterEngines) {
            this.clusterEngines = clusterEngines;
            return this;
        }

        /**
         * defaultClusterConfig.
         */
        public Builder defaultClusterConfig(String defaultClusterConfig) {
            this.defaultClusterConfig = defaultClusterConfig;
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
         * documents.
         */
        public Builder documents(String documents) {
            this.documents = documents;
            return this;
        }

        /**
         * driver.
         */
        public Builder driver(Driver driver) {
            this.driver = driver;
            return this;
        }

        /**
         * features.
         */
        public Builder features(java.util.List < String > features) {
            this.features = features;
            return this;
        }

        /**
         * isDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(String labels) {
            this.labels = labels;
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
         * packageTools.
         */
        public Builder packageTools(java.util.List < PackageTools> packageTools) {
            this.packageTools = packageTools;
            return this;
        }

        /**
         * platforms.
         */
        public Builder platforms(java.util.List < Platform > platforms) {
            this.platforms = platforms;
            return this;
        }

        /**
         * specName.
         */
        public Builder specName(String specName) {
            this.specName = specName;
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
         * tools.
         */
        public Builder tools(Tools tools) {
            this.tools = tools;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * userWhiteList.
         */
        public Builder userWhiteList(java.util.List < String > userWhiteList) {
            this.userWhiteList = userWhiteList;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public FoundationVersion build() {
            return new FoundationVersion(this);
        } 

    } 

    public static class InfrastructureStatements extends TeaModel {
        @NameInMap("default")
        private Boolean _default;

        @NameInMap("distroName")
        private String distroName;

        @NameInMap("distroVersion")
        private String distroVersion;

        @NameInMap("platform")
        private Platform platform;

        private InfrastructureStatements(Builder builder) {
            this._default = builder._default;
            this.distroName = builder.distroName;
            this.distroVersion = builder.distroVersion;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfrastructureStatements create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return distroName
         */
        public String getDistroName() {
            return this.distroName;
        }

        /**
         * @return distroVersion
         */
        public String getDistroVersion() {
            return this.distroVersion;
        }

        /**
         * @return platform
         */
        public Platform getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private Boolean _default; 
            private String distroName; 
            private String distroVersion; 
            private Platform platform; 

            /**
             * default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * distroName.
             */
            public Builder distroName(String distroName) {
                this.distroName = distroName;
                return this;
            }

            /**
             * distroVersion.
             */
            public Builder distroVersion(String distroVersion) {
                this.distroVersion = distroVersion;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(Platform platform) {
                this.platform = platform;
                return this;
            }

            public InfrastructureStatements build() {
                return new InfrastructureStatements(this);
            } 

        } 

    }
    public static class NetworkList extends TeaModel {
        @NameInMap("ipFamilies")
        private java.util.List < String > ipFamilies;

        @NameInMap("name")
        private String name;

        private NetworkList(Builder builder) {
            this.ipFamilies = builder.ipFamilies;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkList create() {
            return builder().build();
        }

        /**
         * @return ipFamilies
         */
        public java.util.List < String > getIpFamilies() {
            return this.ipFamilies;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > ipFamilies; 
            private String name; 

            /**
             * ipFamilies.
             */
            public Builder ipFamilies(java.util.List < String > ipFamilies) {
                this.ipFamilies = ipFamilies;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NetworkList build() {
                return new NetworkList(this);
            } 

        } 

    }
    public static class InstallToolPackages extends TeaModel {
        @NameInMap("architecture")
        @Validation(required = true)
        private String architecture;

        @NameInMap("os")
        @Validation(required = true)
        private String os;

        @NameInMap("url")
        private String url;

        private InstallToolPackages(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallToolPackages create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 
            private String url; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public InstallToolPackages build() {
                return new InstallToolPackages(this);
            } 

        } 

    }
    public static class ClusterEnginesPackageTools extends TeaModel {
        @NameInMap("image")
        private String image;

        @NameInMap("installToolPackages")
        private java.util.List < InstallToolPackages> installToolPackages;

        @NameInMap("name")
        private String name;

        @NameInMap("packageFormat")
        @Validation(required = true)
        private String packageFormat;

        @NameInMap("type")
        private String type;

        @NameInMap("version")
        private String version;

        private ClusterEnginesPackageTools(Builder builder) {
            this.image = builder.image;
            this.installToolPackages = builder.installToolPackages;
            this.name = builder.name;
            this.packageFormat = builder.packageFormat;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterEnginesPackageTools create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return installToolPackages
         */
        public java.util.List < InstallToolPackages> getInstallToolPackages() {
            return this.installToolPackages;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageFormat
         */
        public String getPackageFormat() {
            return this.packageFormat;
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

        public static final class Builder {
            private String image; 
            private java.util.List < InstallToolPackages> installToolPackages; 
            private String name; 
            private String packageFormat; 
            private String type; 
            private String version; 

            /**
             * image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * installToolPackages.
             */
            public Builder installToolPackages(java.util.List < InstallToolPackages> installToolPackages) {
                this.installToolPackages = installToolPackages;
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
             * packageFormat.
             */
            public Builder packageFormat(String packageFormat) {
                this.packageFormat = packageFormat;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ClusterEnginesPackageTools build() {
                return new ClusterEnginesPackageTools(this);
            } 

        } 

    }
    public static class Packages extends TeaModel {
        @NameInMap("architecture")
        @Validation(required = true)
        private String architecture;

        @NameInMap("os")
        @Validation(required = true)
        private String os;

        @NameInMap("platforms")
        private java.util.List < Platform > platforms;

        @NameInMap("url")
        @Validation(required = true)
        private String url;

        private Packages(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
            this.platforms = builder.platforms;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return platforms
         */
        public java.util.List < Platform > getPlatforms() {
            return this.platforms;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 
            private java.util.List < Platform > platforms; 
            private String url; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * platforms.
             */
            public Builder platforms(java.util.List < Platform > platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class ClusterEngines extends TeaModel {
        @NameInMap("infrastructureStatements")
        private java.util.List < InfrastructureStatements> infrastructureStatements;

        @NameInMap("networkList")
        private java.util.List < NetworkList> networkList;

        @NameInMap("packageTools")
        @Validation(required = true)
        private java.util.List < ClusterEnginesPackageTools> packageTools;

        @NameInMap("packages")
        private java.util.List < Packages> packages;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        @NameInMap("version")
        @Validation(required = true)
        private String version;

        private ClusterEngines(Builder builder) {
            this.infrastructureStatements = builder.infrastructureStatements;
            this.networkList = builder.networkList;
            this.packageTools = builder.packageTools;
            this.packages = builder.packages;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterEngines create() {
            return builder().build();
        }

        /**
         * @return infrastructureStatements
         */
        public java.util.List < InfrastructureStatements> getInfrastructureStatements() {
            return this.infrastructureStatements;
        }

        /**
         * @return networkList
         */
        public java.util.List < NetworkList> getNetworkList() {
            return this.networkList;
        }

        /**
         * @return packageTools
         */
        public java.util.List < ClusterEnginesPackageTools> getPackageTools() {
            return this.packageTools;
        }

        /**
         * @return packages
         */
        public java.util.List < Packages> getPackages() {
            return this.packages;
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

        public static final class Builder {
            private java.util.List < InfrastructureStatements> infrastructureStatements; 
            private java.util.List < NetworkList> networkList; 
            private java.util.List < ClusterEnginesPackageTools> packageTools; 
            private java.util.List < Packages> packages; 
            private String type; 
            private String version; 

            /**
             * infrastructureStatements.
             */
            public Builder infrastructureStatements(java.util.List < InfrastructureStatements> infrastructureStatements) {
                this.infrastructureStatements = infrastructureStatements;
                return this;
            }

            /**
             * networkList.
             */
            public Builder networkList(java.util.List < NetworkList> networkList) {
                this.networkList = networkList;
                return this;
            }

            /**
             * packageTools.
             */
            public Builder packageTools(java.util.List < ClusterEnginesPackageTools> packageTools) {
                this.packageTools = packageTools;
                return this;
            }

            /**
             * packages.
             */
            public Builder packages(java.util.List < Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ClusterEngines build() {
                return new ClusterEngines(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("version")
        private String version;

        private Components(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
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
            private String name; 
            private String version; 

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

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Driver extends TeaModel {
        @NameInMap("components")
        private java.util.List < Components> components;

        private Driver(Builder builder) {
            this.components = builder.components;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Driver create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.List < Components> getComponents() {
            return this.components;
        }

        public static final class Builder {
            private java.util.List < Components> components; 

            /**
             * components.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            public Driver build() {
                return new Driver(this);
            } 

        } 

    }
    public static class PackageTools extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("version")
        private String version;

        private PackageTools(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageTools create() {
            return builder().build();
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
            private String name; 
            private String version; 

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

            public PackageTools build() {
                return new PackageTools(this);
            } 

        } 

    }
    public static class SiteSurvey extends TeaModel {
        @NameInMap("clusterCheckerURL")
        private String clusterCheckerURL;

        @NameInMap("clusterInfoBrief")
        private String clusterInfoBrief;

        private SiteSurvey(Builder builder) {
            this.clusterCheckerURL = builder.clusterCheckerURL;
            this.clusterInfoBrief = builder.clusterInfoBrief;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteSurvey create() {
            return builder().build();
        }

        /**
         * @return clusterCheckerURL
         */
        public String getClusterCheckerURL() {
            return this.clusterCheckerURL;
        }

        /**
         * @return clusterInfoBrief
         */
        public String getClusterInfoBrief() {
            return this.clusterInfoBrief;
        }

        public static final class Builder {
            private String clusterCheckerURL; 
            private String clusterInfoBrief; 

            /**
             * clusterCheckerURL.
             */
            public Builder clusterCheckerURL(String clusterCheckerURL) {
                this.clusterCheckerURL = clusterCheckerURL;
                return this;
            }

            /**
             * clusterInfoBrief.
             */
            public Builder clusterInfoBrief(String clusterInfoBrief) {
                this.clusterInfoBrief = clusterInfoBrief;
                return this;
            }

            public SiteSurvey build() {
                return new SiteSurvey(this);
            } 

        } 

    }
    public static class Tools extends TeaModel {
        @NameInMap("siteSurvey")
        private SiteSurvey siteSurvey;

        private Tools(Builder builder) {
            this.siteSurvey = builder.siteSurvey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return siteSurvey
         */
        public SiteSurvey getSiteSurvey() {
            return this.siteSurvey;
        }

        public static final class Builder {
            private SiteSurvey siteSurvey; 

            /**
             * siteSurvey.
             */
            public Builder siteSurvey(SiteSurvey siteSurvey) {
                this.siteSurvey = siteSurvey;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
}
