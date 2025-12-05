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
 * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpenJMeterSceneResponseBody</p>
 */
public class GetOpenJMeterSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scene")
    private Scene scene;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOpenJMeterSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scene = builder.scene;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenJMeterSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scene
     */
    public Scene getScene() {
        return this.scene;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Scene scene; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOpenJMeterSceneResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scene = model.scene;
            this.success = model.success;
        } 

        /**
         * <p>The system status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the scenario.</p>
         */
        public Builder scene(Scene scene) {
            this.scene = scene;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOpenJMeterSceneResponseBody build() {
            return new GetOpenJMeterSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenJMeterSceneResponseBody</p>
     */
    public static class BaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateName")
        private String createName;

        @com.aliyun.core.annotation.NameInMap("ModifyName")
        private String modifyName;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("Principal")
        private String principal;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        private BaseInfo(Builder builder) {
            this.createName = builder.createName;
            this.modifyName = builder.modifyName;
            this.operateType = builder.operateType;
            this.principal = builder.principal;
            this.remark = builder.remark;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseInfo create() {
            return builder().build();
        }

        /**
         * @return createName
         */
        public String getCreateName() {
            return this.createName;
        }

        /**
         * @return modifyName
         */
        public String getModifyName() {
            return this.modifyName;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return principal
         */
        public String getPrincipal() {
            return this.principal;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String createName; 
            private String modifyName; 
            private String operateType; 
            private String principal; 
            private String remark; 
            private String resource; 

            private Builder() {
            } 

            private Builder(BaseInfo model) {
                this.createName = model.createName;
                this.modifyName = model.modifyName;
                this.operateType = model.operateType;
                this.principal = model.principal;
                this.remark = model.remark;
                this.resource = model.resource;
            } 

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder createName(String createName) {
                this.createName = createName;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>里斯</p>
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * <p>The type of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>保存去压测</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * <p>The person who takes charge of the performance testing.</p>
             * 
             * <strong>example:</strong>
             * <p>test-person</p>
             */
            public Builder principal(String principal) {
                this.principal = principal;
                return this;
            }

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>小心压测</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The origin of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>create</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public BaseInfo build() {
                return new BaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenJMeterSceneResponseBody</p>
     */
    public static class DnsCacheConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClearCacheEachIteration")
        private Boolean clearCacheEachIteration;

        @com.aliyun.core.annotation.NameInMap("DnsServers")
        private java.util.List<String> dnsServers;

        @com.aliyun.core.annotation.NameInMap("HostTable")
        private java.util.Map<String, ?> hostTable;

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
        public java.util.Map<String, ?> getHostTable() {
            return this.hostTable;
        }

        public static final class Builder {
            private Boolean clearCacheEachIteration; 
            private java.util.List<String> dnsServers; 
            private java.util.Map<String, ?> hostTable; 

            private Builder() {
            } 

            private Builder(DnsCacheConfig model) {
                this.clearCacheEachIteration = model.clearCacheEachIteration;
                this.dnsServers = model.dnsServers;
                this.hostTable = model.hostTable;
            } 

            /**
             * <p>Indicates whether the cache is cleared.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder clearCacheEachIteration(Boolean clearCacheEachIteration) {
                this.clearCacheEachIteration = clearCacheEachIteration;
                return this;
            }

            /**
             * <p>The DNS servers</p>
             */
            public Builder dnsServers(java.util.List<String> dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * <p>The domain name and its bounded IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;server.com&quot;:&quot;6.6.6.6&quot;}</p>
             */
            public Builder hostTable(java.util.Map<String, ?> hostTable) {
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
     * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenJMeterSceneResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        private String fileOssAddress;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("SplitCsv")
        private Boolean splitCsv;

        private FileList(Builder builder) {
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.splitCsv = builder.splitCsv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
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
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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

        public static final class Builder {
            private String fileName; 
            private String fileOssAddress; 
            private Long fileSize; 
            private String fileType; 
            private Long id; 
            private String md5; 
            private Boolean splitCsv; 

            private Builder() {
            } 

            private Builder(FileList model) {
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
                this.fileSize = model.fileSize;
                this.fileType = model.fileType;
                this.id = model.id;
                this.md5 = model.md5;
                this.splitCsv = model.splitCsv;
            } 

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>json.jar</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>700</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The type of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>jar</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>61660</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The MD5 value of the JAR package.</p>
             * 
             * <strong>example:</strong>
             * <p>43B584026CE5E570F3DE638FA7EEF9E0</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>Indicates whether the file is split.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder splitCsv(Boolean splitCsv) {
                this.splitCsv = splitCsv;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenJMeterSceneResponseBody</p>
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
             * <p>The number of load generators.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
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
     * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenJMeterSceneResponseBody</p>
     */
    public static class Scene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("BaseInfo")
        private BaseInfo baseInfo;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Integer concurrency;

        @com.aliyun.core.annotation.NameInMap("ConstantThroughputTimerType")
        private String constantThroughputTimerType;

        @com.aliyun.core.annotation.NameInMap("DnsCacheConfig")
        private DnsCacheConfig dnsCacheConfig;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List<FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("IsVpcTest")
        private Boolean isVpcTest;

        @com.aliyun.core.annotation.NameInMap("MaxRps")
        private Integer maxRps;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Pool")
        private String pool;

        @com.aliyun.core.annotation.NameInMap("RampUp")
        private Integer rampUp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionalCondition")
        private java.util.List<RegionalCondition> regionalCondition;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
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
        private String testFile;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Scene(Builder builder) {
            this.agentCount = builder.agentCount;
            this.baseInfo = builder.baseInfo;
            this.concurrency = builder.concurrency;
            this.constantThroughputTimerType = builder.constantThroughputTimerType;
            this.dnsCacheConfig = builder.dnsCacheConfig;
            this.duration = builder.duration;
            this.environmentId = builder.environmentId;
            this.fileList = builder.fileList;
            this.isVpcTest = builder.isVpcTest;
            this.maxRps = builder.maxRps;
            this.mode = builder.mode;
            this.pool = builder.pool;
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

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return baseInfo
         */
        public BaseInfo getBaseInfo() {
            return this.baseInfo;
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
         * @return pool
         */
        public String getPool() {
            return this.pool;
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
            private BaseInfo baseInfo; 
            private Integer concurrency; 
            private String constantThroughputTimerType; 
            private DnsCacheConfig dnsCacheConfig; 
            private Integer duration; 
            private String environmentId; 
            private java.util.List<FileList> fileList; 
            private Boolean isVpcTest; 
            private Integer maxRps; 
            private String mode; 
            private String pool; 
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

            private Builder(Scene model) {
                this.agentCount = model.agentCount;
                this.baseInfo = model.baseInfo;
                this.concurrency = model.concurrency;
                this.constantThroughputTimerType = model.constantThroughputTimerType;
                this.dnsCacheConfig = model.dnsCacheConfig;
                this.duration = model.duration;
                this.environmentId = model.environmentId;
                this.fileList = model.fileList;
                this.isVpcTest = model.isVpcTest;
                this.maxRps = model.maxRps;
                this.mode = model.mode;
                this.pool = model.pool;
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
             * <p>The number of load generators. A load generator supports up to 500 concurrent virtual users.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The basic information.</p>
             */
            public Builder baseInfo(BaseInfo baseInfo) {
                this.baseInfo = baseInfo;
                return this;
            }

            /**
             * <p>The maximum number of concurrent virtual users.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The type of the constant throughput timer.</p>
             * 
             * <strong>example:</strong>
             * <p>STAND_ALONE</p>
             */
            public Builder constantThroughputTimerType(String constantThroughputTimerType) {
                this.constantThroughputTimerType = constantThroughputTimerType;
                return this;
            }

            /**
             * <p>The DNS settings.</p>
             */
            public Builder dnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
                this.dnsCacheConfig = dnsCacheConfig;
                return this;
            }

            /**
             * <p>The duration of the performance testing. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>EEDT7</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The files.</p>
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * <p>Indicates whether the load is from a virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVpcTest(Boolean isVpcTest) {
                this.isVpcTest = isVpcTest;
                return this;
            }

            /**
             * <p>The maximum RPS. This parameter is returned if you set Mode to tps_mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder maxRps(Integer maxRps) {
                this.maxRps = maxRps;
                return this;
            }

            /**
             * <p>The load application mode. Valid values: concurrency_mode and tps_mode.</p>
             * 
             * <strong>example:</strong>
             * <p>concurrency_mode</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The origin of the load. &quot;&quot; indicates the Internet and intranet-vpc indicates the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder pool(String pool) {
                this.pool = pool;
                return this;
            }

            /**
             * <p>The period of time during which the load is gradually increased to the desired level. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rampUp(Integer rampUp) {
                this.rampUp = rampUp;
                return this;
            }

            /**
             * <p>The region ID. This parameter is returned if the load is from a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Customized load generator settings for regions</p>
             */
            public Builder regionalCondition(java.util.List<RegionalCondition> regionalCondition) {
                this.regionalCondition = regionalCondition;
                return this;
            }

            /**
             * <p>The ID of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>DYYPZIH</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The name of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The ID of the security group. This parameter is returned if the load is from a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeid0dd7bhahsgdahspaly</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The start number of concurrent virtual users.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder startConcurrency(Integer startConcurrency) {
                this.startConcurrency = startConcurrency;
                return this;
            }

            /**
             * <p>The start requests per second (RPS). This parameter is returned if you set Mode to tps_mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder startRps(Integer startRps) {
                this.startRps = startRps;
                return this;
            }

            /**
             * <p>The number of incremented users per step. If RampUp or Steps is not specified, the fixed load is used. If RampUp is specified but Steps is not specified, the load increases uniformly based on the value of RampUp. If RampUp and Steps are specified and Steps is less than RampUp, the load increases based on the value of Steps. You cannot specify Steps without specifying RampUp. If you do so, the fixed load is used.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder steps(Integer steps) {
                this.steps = steps;
                return this;
            }

            /**
             * <p>The type of the synchronization timer.</p>
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
             * 
             * <strong>example:</strong>
             * <p>baidu.jmx</p>
             */
            public Builder testFile(String testFile) {
                this.testFile = testFile;
                return this;
            }

            /**
             * <p>The ID of the vSwitch. This parameter is returned if the load is from a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zehsgdhsahw1r</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC. This parameter is returned if the load is from a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze2sahjdgahsebjkqhf4pyj</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
}
