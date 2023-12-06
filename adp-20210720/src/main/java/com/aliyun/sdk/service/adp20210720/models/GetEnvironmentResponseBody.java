// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnvironmentResponseBody</p>
 */
public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetEnvironmentResponseBody build() {
            return new GetEnvironmentResponseBody(this);
        } 

    } 

    public static class AdvancedConfigs extends TeaModel {
        @NameInMap("enableDeploySimulation")
        private Boolean enableDeploySimulation;

        @NameInMap("enableSiteSurvey")
        private Boolean enableSiteSurvey;

        private AdvancedConfigs(Builder builder) {
            this.enableDeploySimulation = builder.enableDeploySimulation;
            this.enableSiteSurvey = builder.enableSiteSurvey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedConfigs create() {
            return builder().build();
        }

        /**
         * @return enableDeploySimulation
         */
        public Boolean getEnableDeploySimulation() {
            return this.enableDeploySimulation;
        }

        /**
         * @return enableSiteSurvey
         */
        public Boolean getEnableSiteSurvey() {
            return this.enableSiteSurvey;
        }

        public static final class Builder {
            private Boolean enableDeploySimulation; 
            private Boolean enableSiteSurvey; 

            /**
             * enableDeploySimulation.
             */
            public Builder enableDeploySimulation(Boolean enableDeploySimulation) {
                this.enableDeploySimulation = enableDeploySimulation;
                return this;
            }

            /**
             * enableSiteSurvey.
             */
            public Builder enableSiteSurvey(Boolean enableSiteSurvey) {
                this.enableSiteSurvey = enableSiteSurvey;
                return this;
            }

            public AdvancedConfigs build() {
                return new AdvancedConfigs(this);
            } 

        } 

    }
    public static class Platform extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platform(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platform create() {
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

        public static final class Builder {
            private String architecture; 
            private String os; 

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

            public Platform build() {
                return new Platform(this);
            } 

        } 

    }
    public static class FailedList extends TeaModel {
        @NameInMap("ip")
        private String ip;

        @NameInMap("reason")
        private java.util.Map < String, ? > reason;

        private FailedList(Builder builder) {
            this.ip = builder.ip;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return reason
         */
        public java.util.Map < String, ? > getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String ip; 
            private java.util.Map < String, ? > reason; 

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(java.util.Map < String, ? > reason) {
                this.reason = reason;
                return this;
            }

            public FailedList build() {
                return new FailedList(this);
            } 

        } 

    }
    public static class CheckList extends TeaModel {
        @NameInMap("description")
        private java.util.Map < String, ? > description;

        @NameInMap("failedList")
        private java.util.List < FailedList> failedList;

        @NameInMap("level")
        private String level;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        private CheckList(Builder builder) {
            this.description = builder.description;
            this.failedList = builder.failedList;
            this.level = builder.level;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public java.util.Map < String, ? > getDescription() {
            return this.description;
        }

        /**
         * @return failedList
         */
        public java.util.List < FailedList> getFailedList() {
            return this.failedList;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, ? > description; 
            private java.util.List < FailedList> failedList; 
            private String level; 
            private String name; 
            private String status; 

            /**
             * description.
             */
            public Builder description(java.util.Map < String, ? > description) {
                this.description = description;
                return this;
            }

            /**
             * failedList.
             */
            public Builder failedList(java.util.List < FailedList> failedList) {
                this.failedList = failedList;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CheckList build() {
                return new CheckList(this);
            } 

        } 

    }
    public static class SiteSurveyReport extends TeaModel {
        @NameInMap("checkList")
        private java.util.List < CheckList> checkList;

        @NameInMap("result")
        private String result;

        private SiteSurveyReport(Builder builder) {
            this.checkList = builder.checkList;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteSurveyReport create() {
            return builder().build();
        }

        /**
         * @return checkList
         */
        public java.util.List < CheckList> getCheckList() {
            return this.checkList;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < CheckList> checkList; 
            private String result; 

            /**
             * checkList.
             */
            public Builder checkList(java.util.List < CheckList> checkList) {
                this.checkList = checkList;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public SiteSurveyReport build() {
                return new SiteSurveyReport(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("advancedConfigs")
        private AdvancedConfigs advancedConfigs;

        @NameInMap("clusterId")
        private String clusterId;

        @NameInMap("clusterUID")
        private String clusterUID;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("expiredAt")
        private String expiredAt;

        @NameInMap("foundationType")
        private String foundationType;

        @NameInMap("foundationVersion")
        private String foundationVersion;

        @NameInMap("foundationVersionUID")
        private String foundationVersionUID;

        @NameInMap("instanceList")
        private java.util.List < InstanceInfo > instanceList;

        @NameInMap("instanceStatus")
        private String instanceStatus;

        @NameInMap("location")
        private String location;

        @NameInMap("name")
        private String name;

        @NameInMap("oldProductVersion")
        private String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        private String oldProductVersionUID;

        @NameInMap("platform")
        private Platform platform;

        @NameInMap("platformList")
        private java.util.List < Platform > platformList;

        @NameInMap("platformStatus")
        private String platformStatus;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("siteSurveyReport")
        private SiteSurveyReport siteSurveyReport;

        @NameInMap("uid")
        private String uid;

        @NameInMap("vendorConfig")
        private String vendorConfig;

        @NameInMap("vendorType")
        private String vendorType;

        private Data(Builder builder) {
            this.advancedConfigs = builder.advancedConfigs;
            this.clusterId = builder.clusterId;
            this.clusterUID = builder.clusterUID;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.expiredAt = builder.expiredAt;
            this.foundationType = builder.foundationType;
            this.foundationVersion = builder.foundationVersion;
            this.foundationVersionUID = builder.foundationVersionUID;
            this.instanceList = builder.instanceList;
            this.instanceStatus = builder.instanceStatus;
            this.location = builder.location;
            this.name = builder.name;
            this.oldProductVersion = builder.oldProductVersion;
            this.oldProductVersionUID = builder.oldProductVersionUID;
            this.platform = builder.platform;
            this.platformList = builder.platformList;
            this.platformStatus = builder.platformStatus;
            this.productName = builder.productName;
            this.productVersion = builder.productVersion;
            this.siteSurveyReport = builder.siteSurveyReport;
            this.uid = builder.uid;
            this.vendorConfig = builder.vendorConfig;
            this.vendorType = builder.vendorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advancedConfigs
         */
        public AdvancedConfigs getAdvancedConfigs() {
            return this.advancedConfigs;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterUID
         */
        public String getClusterUID() {
            return this.clusterUID;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredAt
         */
        public String getExpiredAt() {
            return this.expiredAt;
        }

        /**
         * @return foundationType
         */
        public String getFoundationType() {
            return this.foundationType;
        }

        /**
         * @return foundationVersion
         */
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        /**
         * @return foundationVersionUID
         */
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        /**
         * @return instanceList
         */
        public java.util.List < InstanceInfo > getInstanceList() {
            return this.instanceList;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oldProductVersion
         */
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        /**
         * @return oldProductVersionUID
         */
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

        /**
         * @return platform
         */
        public Platform getPlatform() {
            return this.platform;
        }

        /**
         * @return platformList
         */
        public java.util.List < Platform > getPlatformList() {
            return this.platformList;
        }

        /**
         * @return platformStatus
         */
        public String getPlatformStatus() {
            return this.platformStatus;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return siteSurveyReport
         */
        public SiteSurveyReport getSiteSurveyReport() {
            return this.siteSurveyReport;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vendorConfig
         */
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        /**
         * @return vendorType
         */
        public String getVendorType() {
            return this.vendorType;
        }

        public static final class Builder {
            private AdvancedConfigs advancedConfigs; 
            private String clusterId; 
            private String clusterUID; 
            private String createdAt; 
            private String description; 
            private String expiredAt; 
            private String foundationType; 
            private String foundationVersion; 
            private String foundationVersionUID; 
            private java.util.List < InstanceInfo > instanceList; 
            private String instanceStatus; 
            private String location; 
            private String name; 
            private String oldProductVersion; 
            private String oldProductVersionUID; 
            private Platform platform; 
            private java.util.List < Platform > platformList; 
            private String platformStatus; 
            private String productName; 
            private String productVersion; 
            private SiteSurveyReport siteSurveyReport; 
            private String uid; 
            private String vendorConfig; 
            private String vendorType; 

            /**
             * advancedConfigs.
             */
            public Builder advancedConfigs(AdvancedConfigs advancedConfigs) {
                this.advancedConfigs = advancedConfigs;
                return this;
            }

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterUID.
             */
            public Builder clusterUID(String clusterUID) {
                this.clusterUID = clusterUID;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * expiredAt.
             */
            public Builder expiredAt(String expiredAt) {
                this.expiredAt = expiredAt;
                return this;
            }

            /**
             * foundationType.
             */
            public Builder foundationType(String foundationType) {
                this.foundationType = foundationType;
                return this;
            }

            /**
             * foundationVersion.
             */
            public Builder foundationVersion(String foundationVersion) {
                this.foundationVersion = foundationVersion;
                return this;
            }

            /**
             * foundationVersionUID.
             */
            public Builder foundationVersionUID(String foundationVersionUID) {
                this.foundationVersionUID = foundationVersionUID;
                return this;
            }

            /**
             * instanceList.
             */
            public Builder instanceList(java.util.List < InstanceInfo > instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            /**
             * instanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * oldProductVersion.
             */
            public Builder oldProductVersion(String oldProductVersion) {
                this.oldProductVersion = oldProductVersion;
                return this;
            }

            /**
             * oldProductVersionUID.
             */
            public Builder oldProductVersionUID(String oldProductVersionUID) {
                this.oldProductVersionUID = oldProductVersionUID;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(Platform platform) {
                this.platform = platform;
                return this;
            }

            /**
             * platformList.
             */
            public Builder platformList(java.util.List < Platform > platformList) {
                this.platformList = platformList;
                return this;
            }

            /**
             * platformStatus.
             */
            public Builder platformStatus(String platformStatus) {
                this.platformStatus = platformStatus;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * siteSurveyReport.
             */
            public Builder siteSurveyReport(SiteSurveyReport siteSurveyReport) {
                this.siteSurveyReport = siteSurveyReport;
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
             * vendorConfig.
             */
            public Builder vendorConfig(String vendorConfig) {
                this.vendorConfig = vendorConfig;
                return this;
            }

            /**
             * vendorType.
             */
            public Builder vendorType(String vendorType) {
                this.vendorType = vendorType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
