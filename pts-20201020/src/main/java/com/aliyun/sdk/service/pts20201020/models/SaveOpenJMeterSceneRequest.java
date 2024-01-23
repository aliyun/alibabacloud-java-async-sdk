// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveOpenJMeterSceneRequest} extends {@link RequestModel}
 *
 * <p>SaveOpenJMeterSceneRequest</p>
 */
public class SaveOpenJMeterSceneRequest extends Request {
    @Query
    @NameInMap("OpenJMeterScene")
    @Validation(required = true)
    private OpenJMeterScene openJMeterScene;

    private SaveOpenJMeterSceneRequest(Builder builder) {
        super(builder);
        this.openJMeterScene = builder.openJMeterScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveOpenJMeterSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openJMeterScene
     */
    public OpenJMeterScene getOpenJMeterScene() {
        return this.openJMeterScene;
    }

    public static final class Builder extends Request.Builder<SaveOpenJMeterSceneRequest, Builder> {
        private OpenJMeterScene openJMeterScene; 

        private Builder() {
            super();
        } 

        private Builder(SaveOpenJMeterSceneRequest request) {
            super(request);
            this.openJMeterScene = request.openJMeterScene;
        } 

        /**
         * OpenJMeterScene.
         */
        public Builder openJMeterScene(OpenJMeterScene openJMeterScene) {
            String openJMeterSceneShrink = shrink(openJMeterScene, "OpenJMeterScene", "json");
            this.putQueryParameter("OpenJMeterScene", openJMeterSceneShrink);
            this.openJMeterScene = openJMeterScene;
            return this;
        }

        @Override
        public SaveOpenJMeterSceneRequest build() {
            return new SaveOpenJMeterSceneRequest(this);
        } 

    } 

    public static class DnsCacheConfig extends TeaModel {
        @NameInMap("ClearCacheEachIteration")
        private Boolean clearCacheEachIteration;

        @NameInMap("DnsServers")
        private java.util.List < String > dnsServers;

        @NameInMap("HostTable")
        private java.util.Map < String, String > hostTable;

        private DnsCacheConfig(Builder builder) {
            this.clearCacheEachIteration = builder.clearCacheEachIteration;
            this.dnsServers = builder.dnsServers;
            this.hostTable = builder.hostTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsCacheConfig create() {
            return builder().build();
        }

        /**
         * @return clearCacheEachIteration
         */
        public Boolean getClearCacheEachIteration() {
            return this.clearCacheEachIteration;
        }

        /**
         * @return dnsServers
         */
        public java.util.List < String > getDnsServers() {
            return this.dnsServers;
        }

        /**
         * @return hostTable
         */
        public java.util.Map < String, String > getHostTable() {
            return this.hostTable;
        }

        public static final class Builder {
            private Boolean clearCacheEachIteration; 
            private java.util.List < String > dnsServers; 
            private java.util.Map < String, String > hostTable; 

            /**
             * ClearCacheEachIteration.
             */
            public Builder clearCacheEachIteration(Boolean clearCacheEachIteration) {
                this.clearCacheEachIteration = clearCacheEachIteration;
                return this;
            }

            /**
             * DnsServers.
             */
            public Builder dnsServers(java.util.List < String > dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * HostTable.
             */
            public Builder hostTable(java.util.Map < String, String > hostTable) {
                this.hostTable = hostTable;
                return this;
            }

            public DnsCacheConfig build() {
                return new DnsCacheConfig(this);
            } 

        } 

    }
    public static class FileList extends TeaModel {
        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileName")
        @Validation(required = true)
        private String fileName;

        @NameInMap("FileOssAddress")
        @Validation(required = true)
        private String fileOssAddress;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("SplitCsv")
        private Boolean splitCsv;

        @NameInMap("Tags")
        private String tags;

        private FileList(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
            this.fileSize = builder.fileSize;
            this.md5 = builder.md5;
            this.splitCsv = builder.splitCsv;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileOssAddress
         */
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return splitCsv
         */
        public Boolean getSplitCsv() {
            return this.splitCsv;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long fileId; 
            private String fileName; 
            private String fileOssAddress; 
            private Long fileSize; 
            private String md5; 
            private Boolean splitCsv; 
            private String tags; 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileOssAddress.
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * SplitCsv.
             */
            public Builder splitCsv(Boolean splitCsv) {
                this.splitCsv = splitCsv;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    public static class JMeterProperties extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private JMeterProperties(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JMeterProperties create() {
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

        public static final class Builder {
            private String name; 
            private String value; 

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

            public JMeterProperties build() {
                return new JMeterProperties(this);
            } 

        } 

    }
    public static class RegionalCondition extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("Region")
        private String region;

        private RegionalCondition(Builder builder) {
            this.amount = builder.amount;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalCondition create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer amount; 
            private String region; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionalCondition build() {
                return new RegionalCondition(this);
            } 

        } 

    }
    public static class OpenJMeterScene extends TeaModel {
        @NameInMap("AgentCount")
        @Validation(required = true)
        private Integer agentCount;

        @NameInMap("Concurrency")
        private Integer concurrency;

        @NameInMap("ConstantThroughputTimerType")
        private String constantThroughputTimerType;

        @NameInMap("DnsCacheConfig")
        private DnsCacheConfig dnsCacheConfig;

        @NameInMap("Duration")
        @Validation(required = true)
        private Integer duration;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("FileList")
        @Validation(required = true)
        private java.util.List < FileList> fileList;

        @NameInMap("IsVpcTest")
        private Boolean isVpcTest;

        @NameInMap("JMeterProperties")
        private java.util.List < JMeterProperties> jMeterProperties;

        @NameInMap("JmeterPluginLabel")
        @Validation(maxLength = 32)
        private String jmeterPluginLabel;

        @NameInMap("MaxRps")
        private Integer maxRps;

        @NameInMap("Mode")
        @Validation(required = true)
        private String mode;

        @NameInMap("RampUp")
        private Integer rampUp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionalCondition")
        private java.util.List < RegionalCondition> regionalCondition;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        @Validation(required = true)
        private String sceneName;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("StartConcurrency")
        private Integer startConcurrency;

        @NameInMap("StartRps")
        private Integer startRps;

        @NameInMap("Steps")
        private Integer steps;

        @NameInMap("SyncTimerType")
        private String syncTimerType;

        @NameInMap("TestFile")
        @Validation(required = true)
        private String testFile;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private OpenJMeterScene(Builder builder) {
            this.agentCount = builder.agentCount;
            this.concurrency = builder.concurrency;
            this.constantThroughputTimerType = builder.constantThroughputTimerType;
            this.dnsCacheConfig = builder.dnsCacheConfig;
            this.duration = builder.duration;
            this.environmentId = builder.environmentId;
            this.fileList = builder.fileList;
            this.isVpcTest = builder.isVpcTest;
            this.jMeterProperties = builder.jMeterProperties;
            this.jmeterPluginLabel = builder.jmeterPluginLabel;
            this.maxRps = builder.maxRps;
            this.mode = builder.mode;
            this.rampUp = builder.rampUp;
            this.regionId = builder.regionId;
            this.regionalCondition = builder.regionalCondition;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.securityGroupId = builder.securityGroupId;
            this.startConcurrency = builder.startConcurrency;
            this.startRps = builder.startRps;
            this.steps = builder.steps;
            this.syncTimerType = builder.syncTimerType;
            this.testFile = builder.testFile;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenJMeterScene create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return constantThroughputTimerType
         */
        public String getConstantThroughputTimerType() {
            return this.constantThroughputTimerType;
        }

        /**
         * @return dnsCacheConfig
         */
        public DnsCacheConfig getDnsCacheConfig() {
            return this.dnsCacheConfig;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return fileList
         */
        public java.util.List < FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return isVpcTest
         */
        public Boolean getIsVpcTest() {
            return this.isVpcTest;
        }

        /**
         * @return jMeterProperties
         */
        public java.util.List < JMeterProperties> getJMeterProperties() {
            return this.jMeterProperties;
        }

        /**
         * @return jmeterPluginLabel
         */
        public String getJmeterPluginLabel() {
            return this.jmeterPluginLabel;
        }

        /**
         * @return maxRps
         */
        public Integer getMaxRps() {
            return this.maxRps;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return rampUp
         */
        public Integer getRampUp() {
            return this.rampUp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionalCondition
         */
        public java.util.List < RegionalCondition> getRegionalCondition() {
            return this.regionalCondition;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return startConcurrency
         */
        public Integer getStartConcurrency() {
            return this.startConcurrency;
        }

        /**
         * @return startRps
         */
        public Integer getStartRps() {
            return this.startRps;
        }

        /**
         * @return steps
         */
        public Integer getSteps() {
            return this.steps;
        }

        /**
         * @return syncTimerType
         */
        public String getSyncTimerType() {
            return this.syncTimerType;
        }

        /**
         * @return testFile
         */
        public String getTestFile() {
            return this.testFile;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer agentCount; 
            private Integer concurrency; 
            private String constantThroughputTimerType; 
            private DnsCacheConfig dnsCacheConfig; 
            private Integer duration; 
            private String environmentId; 
            private java.util.List < FileList> fileList; 
            private Boolean isVpcTest; 
            private java.util.List < JMeterProperties> jMeterProperties; 
            private String jmeterPluginLabel; 
            private Integer maxRps; 
            private String mode; 
            private Integer rampUp; 
            private String regionId; 
            private java.util.List < RegionalCondition> regionalCondition; 
            private String sceneId; 
            private String sceneName; 
            private String securityGroupId; 
            private Integer startConcurrency; 
            private Integer startRps; 
            private Integer steps; 
            private String syncTimerType; 
            private String testFile; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * AgentCount.
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * ConstantThroughputTimerType.
             */
            public Builder constantThroughputTimerType(String constantThroughputTimerType) {
                this.constantThroughputTimerType = constantThroughputTimerType;
                return this;
            }

            /**
             * DnsCacheConfig.
             */
            public Builder dnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
                this.dnsCacheConfig = dnsCacheConfig;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EnvironmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * FileList.
             */
            public Builder fileList(java.util.List < FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * IsVpcTest.
             */
            public Builder isVpcTest(Boolean isVpcTest) {
                this.isVpcTest = isVpcTest;
                return this;
            }

            /**
             * JMeterProperties.
             */
            public Builder jMeterProperties(java.util.List < JMeterProperties> jMeterProperties) {
                this.jMeterProperties = jMeterProperties;
                return this;
            }

            /**
             * JmeterPluginLabel.
             */
            public Builder jmeterPluginLabel(String jmeterPluginLabel) {
                this.jmeterPluginLabel = jmeterPluginLabel;
                return this;
            }

            /**
             * MaxRps.
             */
            public Builder maxRps(Integer maxRps) {
                this.maxRps = maxRps;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * RampUp.
             */
            public Builder rampUp(Integer rampUp) {
                this.rampUp = rampUp;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionalCondition.
             */
            public Builder regionalCondition(java.util.List < RegionalCondition> regionalCondition) {
                this.regionalCondition = regionalCondition;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * StartConcurrency.
             */
            public Builder startConcurrency(Integer startConcurrency) {
                this.startConcurrency = startConcurrency;
                return this;
            }

            /**
             * StartRps.
             */
            public Builder startRps(Integer startRps) {
                this.startRps = startRps;
                return this;
            }

            /**
             * Steps.
             */
            public Builder steps(Integer steps) {
                this.steps = steps;
                return this;
            }

            /**
             * SyncTimerType.
             */
            public Builder syncTimerType(String syncTimerType) {
                this.syncTimerType = syncTimerType;
                return this;
            }

            /**
             * TestFile.
             */
            public Builder testFile(String testFile) {
                this.testFile = testFile;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public OpenJMeterScene build() {
                return new OpenJMeterScene(this);
            } 

        } 

    }
}
