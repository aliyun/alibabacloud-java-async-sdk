// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link SaveOpenJMeterSceneRequest} extends {@link RequestModel}
 *
 * <p>SaveOpenJMeterSceneRequest</p>
 */
public class SaveOpenJMeterSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenJMeterScene")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The details of the scenario.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link SaveOpenJMeterSceneRequest} extends {@link TeaModel}
     *
     * <p>SaveOpenJMeterSceneRequest</p>
     */
    public static class DnsCacheConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClearCacheEachIteration")
        private Boolean clearCacheEachIteration;

        @com.aliyun.core.annotation.NameInMap("DnsServers")
        private java.util.List<String> dnsServers;

        @com.aliyun.core.annotation.NameInMap("HostTable")
        private java.util.Map<String, String> hostTable;

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
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        /**
         * @return hostTable
         */
        public java.util.Map<String, String> getHostTable() {
            return this.hostTable;
        }

        public static final class Builder {
            private Boolean clearCacheEachIteration; 
            private java.util.List<String> dnsServers; 
            private java.util.Map<String, String> hostTable; 

            private Builder() {
            } 

            private Builder(DnsCacheConfig model) {
                this.clearCacheEachIteration = model.clearCacheEachIteration;
                this.dnsServers = model.dnsServers;
                this.hostTable = model.hostTable;
            } 

            /**
             * <p>Specifies whether to clear the cache in each iteration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder clearCacheEachIteration(Boolean clearCacheEachIteration) {
                this.clearCacheEachIteration = clearCacheEachIteration;
                return this;
            }

            /**
             * <p>The DNS servers.</p>
             */
            public Builder dnsServers(java.util.List<String> dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * <p>The table that contains bound domain names.</p>
             */
            public Builder hostTable(java.util.Map<String, String> hostTable) {
                this.hostTable = hostTable;
                return this;
            }

            public DnsCacheConfig build() {
                return new DnsCacheConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveOpenJMeterSceneRequest} extends {@link TeaModel}
     *
     * <p>SaveOpenJMeterSceneRequest</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileOssAddress;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("SplitCsv")
        private Boolean splitCsv;

        @com.aliyun.core.annotation.NameInMap("Tags")
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

            private Builder() {
            } 

            private Builder(FileList model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
                this.fileSize = model.fileSize;
                this.md5 = model.md5;
                this.splitCsv = model.splitCsv;
                this.tags = model.tags;
            } 

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>61232</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the test file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>baidu.jmx</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) path that is used to access the test file over the Internet.</p>
             * <blockquote>
             * <p> Only test files in the China (Shanghai) region can be accessed.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.cn-shanghai.aliyuncs.com/baidu.jmx">https://test.cn-shanghai.aliyuncs.com/baidu.jmx</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            /**
             * <p>The file size. The total file size cannot exceed 500 MB. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>28880</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The MD5 hash of the test file.</p>
             * 
             * <strong>example:</strong>
             * <p>DA70F97A74D76B6A3BEF9CC8AE0D89EB</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>Specifies whether to split the test file. This parameter is valid only for CSV files.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder splitCsv(Boolean splitCsv) {
                this.splitCsv = splitCsv;
                return this;
            }

            /**
             * <p>The file tag.</p>
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
    /**
     * 
     * {@link SaveOpenJMeterSceneRequest} extends {@link TeaModel}
     *
     * <p>SaveOpenJMeterSceneRequest</p>
     */
    public static class JMeterProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(JMeterProperties model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>https.sessioncontext.shared</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The values of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link SaveOpenJMeterSceneRequest} extends {@link TeaModel}
     *
     * <p>SaveOpenJMeterSceneRequest</p>
     */
    public static class RegionalCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("Region")
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

            private Builder() {
            } 

            private Builder(RegionalCondition model) {
                this.amount = model.amount;
                this.region = model.region;
            } 

            /**
             * <p>The number of stress tests. The sum of the number of stress tests in all regions must be equal to the AgentCount value of a specified scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link SaveOpenJMeterSceneRequest} extends {@link TeaModel}
     *
     * <p>SaveOpenJMeterSceneRequest</p>
     */
    public static class OpenJMeterScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("ConstantThroughputTimerType")
        private String constantThroughputTimerType;

        @com.aliyun.core.annotation.NameInMap("DnsCacheConfig")
        private DnsCacheConfig dnsCacheConfig;

        @com.aliyun.core.annotation.NameInMap("Duration")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("FileList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("IsVpcTest")
        private Boolean isVpcTest;

        @com.aliyun.core.annotation.NameInMap("JMeterProperties")
        private java.util.List<JMeterProperties> jMeterProperties;

        @com.aliyun.core.annotation.NameInMap("JmeterPluginLabel")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String jmeterPluginLabel;

        @com.aliyun.core.annotation.NameInMap("MaxRps")
        private Integer maxRps;

        @com.aliyun.core.annotation.NameInMap("Mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("RampUp")
        private Integer rampUp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionalCondition")
        private java.util.List<RegionalCondition> regionalCondition;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("StartConcurrency")
        private Integer startConcurrency;

        @com.aliyun.core.annotation.NameInMap("StartRps")
        private Integer startRps;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private Integer steps;

        @com.aliyun.core.annotation.NameInMap("SyncTimerType")
        private String syncTimerType;

        @com.aliyun.core.annotation.NameInMap("TestFile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String testFile;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
        public java.util.List<FileList> getFileList() {
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
        public java.util.List<JMeterProperties> getJMeterProperties() {
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
        public java.util.List<RegionalCondition> getRegionalCondition() {
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
            private java.util.List<FileList> fileList; 
            private Boolean isVpcTest; 
            private java.util.List<JMeterProperties> jMeterProperties; 
            private String jmeterPluginLabel; 
            private Integer maxRps; 
            private String mode; 
            private Integer rampUp; 
            private String regionId; 
            private java.util.List<RegionalCondition> regionalCondition; 
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

            private Builder() {
            } 

            private Builder(OpenJMeterScene model) {
                this.agentCount = model.agentCount;
                this.concurrency = model.concurrency;
                this.constantThroughputTimerType = model.constantThroughputTimerType;
                this.dnsCacheConfig = model.dnsCacheConfig;
                this.duration = model.duration;
                this.environmentId = model.environmentId;
                this.fileList = model.fileList;
                this.isVpcTest = model.isVpcTest;
                this.jMeterProperties = model.jMeterProperties;
                this.jmeterPluginLabel = model.jmeterPluginLabel;
                this.maxRps = model.maxRps;
                this.mode = model.mode;
                this.rampUp = model.rampUp;
                this.regionId = model.regionId;
                this.regionalCondition = model.regionalCondition;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.securityGroupId = model.securityGroupId;
                this.startConcurrency = model.startConcurrency;
                this.startRps = model.startRps;
                this.steps = model.steps;
                this.syncTimerType = model.syncTimerType;
                this.testFile = model.testFile;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The number of stress testers.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The maximum concurrency that is determined by the resource plans of users. You must configure this parameter when the mode is set to CONCURRENCY.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The type of the synchronization timer with fixed throughput in JMeter.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL</p>
             */
            public Builder constantThroughputTimerType(String constantThroughputTimerType) {
                this.constantThroughputTimerType = constantThroughputTimerType;
                return this;
            }

            /**
             * <p>The settings of Domain Name System (DNS).</p>
             */
            public Builder dnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
                this.dnsCacheConfig = dnsCacheConfig;
                return this;
            }

            /**
             * <p>The stress testing duration. The maximum stress testing duration is no more than one day, Unit: seconds. Valid values: 60 to 86400.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the environment associated with the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>I8PZIH</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The test files.</p>
             * <p>This parameter is required.</p>
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * <p>Specifies whether the test is a virtual private cloud (VPC) test. The default value is false, which indicates a public network test. VPC-related settings take effect only when you set this parameter to true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isVpcTest(Boolean isVpcTest) {
                this.isVpcTest = isVpcTest;
                return this;
            }

            /**
             * <p>The JMeter properties.</p>
             */
            public Builder jMeterProperties(java.util.List<JMeterProperties> jMeterProperties) {
                this.jMeterProperties = jMeterProperties;
                return this;
            }

            /**
             * <p>The JMeter plug-in tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder jmeterPluginLabel(String jmeterPluginLabel) {
                this.jmeterPluginLabel = jmeterPluginLabel;
                return this;
            }

            /**
             * <p>The maximum RPS that takes effect in RPS mode.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxRps(Integer maxRps) {
                this.maxRps = maxRps;
                return this;
            }

            /**
             * <p>The stress model.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CONCURRENCY</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The ramp-up period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder rampUp(Integer rampUp) {
                this.rampUp = rampUp;
                return this;
            }

            /**
             * <p>The region ID that is specified in the VPC test.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The requirements for the regions of the stress testers.</p>
             */
            public Builder regionalCondition(java.util.List<RegionalCondition> regionalCondition) {
                this.regionalCondition = regionalCondition;
                return this;
            }

            /**
             * <p>The scenario ID. If you do not configure this parameter, the system creates a scenario. If you configure this parameter, the system updates the scenario corresponding to the ID specified by this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DYYPZIH</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The security group ID that is specified in the VPC test.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeid0dd7bhahsgdahspaly</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The initial concurrency that takes effect in concurrency mode. You must configure this parameter when the mode is set to CONCURRENCY.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder startConcurrency(Integer startConcurrency) {
                this.startConcurrency = startConcurrency;
                return this;
            }

            /**
             * <p>The initial RPS that takes effect in RPS mode.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder startRps(Integer startRps) {
                this.startRps = startRps;
                return this;
            }

            /**
             * <p>The number of ramp-up steps.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder steps(Integer steps) {
                this.steps = steps;
                return this;
            }

            /**
             * <p>The type of the synchronization timer in JMeter.</p>
             * 
             * <strong>example:</strong>
             * <p>GLOBAL</p>
             */
            public Builder syncTimerType(String syncTimerType) {
                this.syncTimerType = syncTimerType;
                return this;
            }

            /**
             * <p>The test file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>baidu.jmx</p>
             */
            public Builder testFile(String testFile) {
                this.testFile = testFile;
                return this;
            }

            /**
             * <p>The vSwitch ID that is specified in the VPC test.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zehsgdhsahw1r</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID that is specified in the VPC test.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze2sahjdgahsebjkqhf4pyj</p>
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
