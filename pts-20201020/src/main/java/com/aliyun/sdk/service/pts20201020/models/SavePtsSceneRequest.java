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
 * {@link SavePtsSceneRequest} extends {@link RequestModel}
 *
 * <p>SavePtsSceneRequest</p>
 */
public class SavePtsSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private Scene scene;

    private SavePtsSceneRequest(Builder builder) {
        super(builder);
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SavePtsSceneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scene
     */
    public Scene getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<SavePtsSceneRequest, Builder> {
        private Scene scene; 

        private Builder() {
            super();
        } 

        private Builder(SavePtsSceneRequest request) {
            super(request);
            this.scene = request.scene;
        } 

        /**
         * <p>The information about the scenario.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scene(Scene scene) {
            String sceneShrink = shrink(scene, "Scene", "json");
            this.putQueryParameter("Scene", sceneShrink);
            this.scene = scene;
            return this;
        }

        @Override
        public SavePtsSceneRequest build() {
            return new SavePtsSceneRequest(this);
        } 

    } 

    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class DomainBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<String> ips;

        private DomainBindingList(Builder builder) {
            this.domain = builder.domain;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainBindingList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<String> ips; 

            private Builder() {
            } 

            private Builder(DomainBindingList model) {
                this.domain = model.domain;
                this.ips = model.ips;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The IP addresses.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            public DomainBindingList build() {
                return new DomainBindingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class AdvanceSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeoutInSecond")
        private Integer connectionTimeoutInSecond;

        @com.aliyun.core.annotation.NameInMap("DomainBindingList")
        private java.util.List<DomainBindingList> domainBindingList;

        @com.aliyun.core.annotation.NameInMap("LogRate")
        private Integer logRate;

        @com.aliyun.core.annotation.NameInMap("SuccessCode")
        private String successCode;

        private AdvanceSetting(Builder builder) {
            this.connectionTimeoutInSecond = builder.connectionTimeoutInSecond;
            this.domainBindingList = builder.domainBindingList;
            this.logRate = builder.logRate;
            this.successCode = builder.successCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvanceSetting create() {
            return builder().build();
        }

        /**
         * @return connectionTimeoutInSecond
         */
        public Integer getConnectionTimeoutInSecond() {
            return this.connectionTimeoutInSecond;
        }

        /**
         * @return domainBindingList
         */
        public java.util.List<DomainBindingList> getDomainBindingList() {
            return this.domainBindingList;
        }

        /**
         * @return logRate
         */
        public Integer getLogRate() {
            return this.logRate;
        }

        /**
         * @return successCode
         */
        public String getSuccessCode() {
            return this.successCode;
        }

        public static final class Builder {
            private Integer connectionTimeoutInSecond; 
            private java.util.List<DomainBindingList> domainBindingList; 
            private Integer logRate; 
            private String successCode; 

            private Builder() {
            } 

            private Builder(AdvanceSetting model) {
                this.connectionTimeoutInSecond = model.connectionTimeoutInSecond;
                this.domainBindingList = model.domainBindingList;
                this.logRate = model.logRate;
                this.successCode = model.successCode;
            } 

            /**
             * <p>The timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder connectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
                this.connectionTimeoutInSecond = connectionTimeoutInSecond;
                return this;
            }

            /**
             * <p>The domain name-IP address binding relationships</p>
             */
            public Builder domainBindingList(java.util.List<DomainBindingList> domainBindingList) {
                this.domainBindingList = domainBindingList;
                return this;
            }

            /**
             * <p>The log sampling rate. Valid values: 1, 10, 20, 30, 40, and 50.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder logRate(Integer logRate) {
                this.logRate = logRate;
                return this;
            }

            /**
             * <p>The success status code. Separate multiple status codes with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>205</p>
             */
            public Builder successCode(String successCode) {
                this.successCode = successCode;
                return this;
            }

            public AdvanceSetting build() {
                return new AdvanceSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class FileParameterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        private String fileOssAddress;

        private FileParameterList(Builder builder) {
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileParameterList create() {
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

        public static final class Builder {
            private String fileName; 
            private String fileOssAddress; 

            private Builder() {
            } 

            private Builder(FileParameterList model) {
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
            } 

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The OSS URL of the file, which must be accessible over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://jmeter-pts-testing-version.oss-cn-shanghai.aliyuncs.com/param-file.csv">https://jmeter-pts-testing-version.oss-cn-shanghai.aliyuncs.com/param-file.csv</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            public FileParameterList build() {
                return new FileParameterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class GlobalParameterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private GlobalParameterList(Builder builder) {
            this.paramName = builder.paramName;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalParameterList create() {
            return builder().build();
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramName; 
            private String paramValue; 

            private Builder() {
            } 

            private Builder(GlobalParameterList model) {
                this.paramName = model.paramName;
                this.paramValue = model.paramValue;
            } 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>11111</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public GlobalParameterList build() {
                return new GlobalParameterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class ApiLoadConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("RpsBegin")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer rpsBegin;

        @com.aliyun.core.annotation.NameInMap("RpsLimit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer rpsLimit;

        private ApiLoadConfigList(Builder builder) {
            this.apiId = builder.apiId;
            this.rpsBegin = builder.rpsBegin;
            this.rpsLimit = builder.rpsLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiLoadConfigList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return rpsBegin
         */
        public Integer getRpsBegin() {
            return this.rpsBegin;
        }

        /**
         * @return rpsLimit
         */
        public Integer getRpsLimit() {
            return this.rpsLimit;
        }

        public static final class Builder {
            private String apiId; 
            private Integer rpsBegin; 
            private Integer rpsLimit; 

            private Builder() {
            } 

            private Builder(ApiLoadConfigList model) {
                this.apiId = model.apiId;
                this.rpsBegin = model.rpsBegin;
                this.rpsLimit = model.rpsLimit;
            } 

            /**
             * <p>The ID of the API.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The starting RPS.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rpsBegin(Integer rpsBegin) {
                this.rpsBegin = rpsBegin;
                return this;
            }

            /**
             * <p>The maximum RPS.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rpsLimit(Integer rpsLimit) {
                this.rpsLimit = rpsLimit;
                return this;
            }

            public ApiLoadConfigList build() {
                return new ApiLoadConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllConcurrencyBegin")
        private Integer allConcurrencyBegin;

        @com.aliyun.core.annotation.NameInMap("AllConcurrencyLimit")
        private Integer allConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("AllRpsBegin")
        private Integer allRpsBegin;

        @com.aliyun.core.annotation.NameInMap("AllRpsLimit")
        private Integer allRpsLimit;

        private Configuration(Builder builder) {
            this.allConcurrencyBegin = builder.allConcurrencyBegin;
            this.allConcurrencyLimit = builder.allConcurrencyLimit;
            this.allRpsBegin = builder.allRpsBegin;
            this.allRpsLimit = builder.allRpsLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return allConcurrencyBegin
         */
        public Integer getAllConcurrencyBegin() {
            return this.allConcurrencyBegin;
        }

        /**
         * @return allConcurrencyLimit
         */
        public Integer getAllConcurrencyLimit() {
            return this.allConcurrencyLimit;
        }

        /**
         * @return allRpsBegin
         */
        public Integer getAllRpsBegin() {
            return this.allRpsBegin;
        }

        /**
         * @return allRpsLimit
         */
        public Integer getAllRpsLimit() {
            return this.allRpsLimit;
        }

        public static final class Builder {
            private Integer allConcurrencyBegin; 
            private Integer allConcurrencyLimit; 
            private Integer allRpsBegin; 
            private Integer allRpsLimit; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.allConcurrencyBegin = model.allConcurrencyBegin;
                this.allConcurrencyLimit = model.allConcurrencyLimit;
                this.allRpsBegin = model.allRpsBegin;
                this.allRpsLimit = model.allRpsLimit;
            } 

            /**
             * <p>The starting total number of concurrent virtual users in all sessions.</p>
             * <p>The value is evenly distributed among all sessions if you set TestMode to concurrency_mode. If you do not specify this parameter, you must configure <strong>relationLoadConfig</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allConcurrencyBegin(Integer allConcurrencyBegin) {
                this.allConcurrencyBegin = allConcurrencyBegin;
                return this;
            }

            /**
             * <p>The maximum total number of concurrent virtual users in all sessions.</p>
             * <p>The value is evenly distributed among all sessions if you set TestMode to concurrency_mode. If you do not specify this parameter, you must configure <strong>relationLoadConfig</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allConcurrencyLimit(Integer allConcurrencyLimit) {
                this.allConcurrencyLimit = allConcurrencyLimit;
                return this;
            }

            /**
             * <p>The starting RPS for all APIs.</p>
             * <p>The value is evenly distributed among all APIs if you set TestMode to RPS. If you do not specify this parameter, you must specify <strong>apiLoadConfig</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allRpsBegin(Integer allRpsBegin) {
                this.allRpsBegin = allRpsBegin;
                return this;
            }

            /**
             * <p>The maximum RPS for all APIs.</p>
             * <p>The value is evenly distributed among all APIs if you set TestMode to RPS. If you do not specify this parameter, you must specify <strong>apiLoadConfig</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allRpsLimit(Integer allRpsLimit) {
                this.allRpsLimit = allRpsLimit;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class RelationLoadConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConcurrencyBegin")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer concurrencyBegin;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyLimit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer concurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        private RelationLoadConfigList(Builder builder) {
            this.concurrencyBegin = builder.concurrencyBegin;
            this.concurrencyLimit = builder.concurrencyLimit;
            this.relationId = builder.relationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationLoadConfigList create() {
            return builder().build();
        }

        /**
         * @return concurrencyBegin
         */
        public Integer getConcurrencyBegin() {
            return this.concurrencyBegin;
        }

        /**
         * @return concurrencyLimit
         */
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        public static final class Builder {
            private Integer concurrencyBegin; 
            private Integer concurrencyLimit; 
            private String relationId; 

            private Builder() {
            } 

            private Builder(RelationLoadConfigList model) {
                this.concurrencyBegin = model.concurrencyBegin;
                this.concurrencyLimit = model.concurrencyLimit;
                this.relationId = model.relationId;
            } 

            /**
             * <p>The starting number of concurrent virtual users.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder concurrencyBegin(Integer concurrencyBegin) {
                this.concurrencyBegin = concurrencyBegin;
                return this;
            }

            /**
             * <p>The maximum number of concurrent virtual users.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder concurrencyLimit(Integer concurrencyLimit) {
                this.concurrencyLimit = concurrencyLimit;
                return this;
            }

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            public RelationLoadConfigList build() {
                return new RelationLoadConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class VpcLoadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        private VpcLoadConfig(Builder builder) {
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcLoadConfig create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
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
            private String regionId; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcLoadConfig model) {
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the region.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-jkasgfieiajidsjakjscb</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-skjfhlahsljkhsfalkjdoiw</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-akjhsdajgjsfggahjkga</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcLoadConfig build() {
                return new VpcLoadConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class LoadConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCount")
        private Integer agentCount;

        @com.aliyun.core.annotation.NameInMap("ApiLoadConfigList")
        private java.util.List<ApiLoadConfigList> apiLoadConfigList;

        @com.aliyun.core.annotation.NameInMap("AutoStep")
        private Boolean autoStep;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        @com.aliyun.core.annotation.Validation(required = true)
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("Increment")
        private Integer increment;

        @com.aliyun.core.annotation.NameInMap("KeepTime")
        private Integer keepTime;

        @com.aliyun.core.annotation.NameInMap("MaxRunningTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer maxRunningTime;

        @com.aliyun.core.annotation.NameInMap("RelationLoadConfigList")
        private java.util.List<RelationLoadConfigList> relationLoadConfigList;

        @com.aliyun.core.annotation.NameInMap("TestMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String testMode;

        @com.aliyun.core.annotation.NameInMap("VpcLoadConfig")
        private VpcLoadConfig vpcLoadConfig;

        private LoadConfig(Builder builder) {
            this.agentCount = builder.agentCount;
            this.apiLoadConfigList = builder.apiLoadConfigList;
            this.autoStep = builder.autoStep;
            this.configuration = builder.configuration;
            this.increment = builder.increment;
            this.keepTime = builder.keepTime;
            this.maxRunningTime = builder.maxRunningTime;
            this.relationLoadConfigList = builder.relationLoadConfigList;
            this.testMode = builder.testMode;
            this.vpcLoadConfig = builder.vpcLoadConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadConfig create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return apiLoadConfigList
         */
        public java.util.List<ApiLoadConfigList> getApiLoadConfigList() {
            return this.apiLoadConfigList;
        }

        /**
         * @return autoStep
         */
        public Boolean getAutoStep() {
            return this.autoStep;
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return increment
         */
        public Integer getIncrement() {
            return this.increment;
        }

        /**
         * @return keepTime
         */
        public Integer getKeepTime() {
            return this.keepTime;
        }

        /**
         * @return maxRunningTime
         */
        public Integer getMaxRunningTime() {
            return this.maxRunningTime;
        }

        /**
         * @return relationLoadConfigList
         */
        public java.util.List<RelationLoadConfigList> getRelationLoadConfigList() {
            return this.relationLoadConfigList;
        }

        /**
         * @return testMode
         */
        public String getTestMode() {
            return this.testMode;
        }

        /**
         * @return vpcLoadConfig
         */
        public VpcLoadConfig getVpcLoadConfig() {
            return this.vpcLoadConfig;
        }

        public static final class Builder {
            private Integer agentCount; 
            private java.util.List<ApiLoadConfigList> apiLoadConfigList; 
            private Boolean autoStep; 
            private Configuration configuration; 
            private Integer increment; 
            private Integer keepTime; 
            private Integer maxRunningTime; 
            private java.util.List<RelationLoadConfigList> relationLoadConfigList; 
            private String testMode; 
            private VpcLoadConfig vpcLoadConfig; 

            private Builder() {
            } 

            private Builder(LoadConfig model) {
                this.agentCount = model.agentCount;
                this.apiLoadConfigList = model.apiLoadConfigList;
                this.autoStep = model.autoStep;
                this.configuration = model.configuration;
                this.increment = model.increment;
                this.keepTime = model.keepTime;
                this.maxRunningTime = model.maxRunningTime;
                this.relationLoadConfigList = model.relationLoadConfigList;
                this.testMode = model.testMode;
                this.vpcLoadConfig = model.vpcLoadConfig;
            } 

            /**
             * <p>The number of load generators. If the number of concurrent virtual users exceeds 250 or the RPS exceeds 2,000, you can use multiple load generators. The maximum number of load generators is limited to the total number of concurrent virtual users divided by 250 or the total RPS divided by 200.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * <p>The API request load settings.</p>
             */
            public Builder apiLoadConfigList(java.util.List<ApiLoadConfigList> apiLoadConfigList) {
                this.apiLoadConfigList = apiLoadConfigList;
                return this;
            }

            /**
             * <p>Specifies whether the load is automatically incremented. This parameter takes effect only if you set <code>TestMode=concurrency_mode</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoStep(Boolean autoStep) {
                this.autoStep = autoStep;
                return this;
            }

            /**
             * <p>The load level settings of the scenario.</p>
             * <p>This parameter is required.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The increment percentage. Valid values: 10 to 100, in increments of 10.</p>
             * <p>This parameter takes effect only if you set <code>testMode=concurrency_mode</code>and <code>autoStep=true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder increment(Integer increment) {
                this.increment = increment;
                return this;
            }

            /**
             * <p>The duration of a specific load level. Unit: minutes. The value must be less than the value of <strong>maxRunningTime</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder keepTime(Integer keepTime) {
                this.keepTime = keepTime;
                return this;
            }

            /**
             * <p>The duration of load application. Unit: minutes. Valid values: 1 to 1440.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxRunningTime(Integer maxRunningTime) {
                this.maxRunningTime = maxRunningTime;
                return this;
            }

            /**
             * <p>The session settings.</p>
             */
            public Builder relationLoadConfigList(java.util.List<RelationLoadConfigList> relationLoadConfigList) {
                this.relationLoadConfigList = relationLoadConfigList;
                return this;
            }

            /**
             * <p>The load application mode. Valid values:</p>
             * <ul>
             * <li>concurrency_mode: concurrency mode</li>
             * <li>tps_mode: RPS mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>concurrency_mode</p>
             */
            public Builder testMode(String testMode) {
                this.testMode = testMode;
                return this;
            }

            /**
             * <p>The VPC settings.</p>
             */
            public Builder vpcLoadConfig(VpcLoadConfig vpcLoadConfig) {
                this.vpcLoadConfig = vpcLoadConfig;
                return this;
            }

            public LoadConfig build() {
                return new LoadConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class ApiListBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyValue")
        private String bodyValue;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        private ApiListBody(Builder builder) {
            this.bodyValue = builder.bodyValue;
            this.contentType = builder.contentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiListBody create() {
            return builder().build();
        }

        /**
         * @return bodyValue
         */
        public String getBodyValue() {
            return this.bodyValue;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        public static final class Builder {
            private String bodyValue; 
            private String contentType; 

            private Builder() {
            } 

            private Builder(ApiListBody model) {
                this.bodyValue = model.bodyValue;
                this.contentType = model.contentType;
            } 

            /**
             * <p>The data in the body. For example, {&quot;key1&quot;:&quot;value2&quot;,&quot;key2&quot;:&quot;value2&quot;}.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;global&quot;:&quot;${global}&quot;,&quot;name&quot;:&quot;${name}&quot;}</p>
             */
            public Builder bodyValue(String bodyValue) {
                this.bodyValue = bodyValue;
                return this;
            }

            /**
             * <p>The body type. Default: <code>application/x-www-form-urlencoded</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>application/x-www-form-urlencoded</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public ApiListBody build() {
                return new ApiListBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class CheckPointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckPoint")
        private String checkPoint;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private String checkType;

        @com.aliyun.core.annotation.NameInMap("ExpectValue")
        private String expectValue;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private CheckPointList(Builder builder) {
            this.checkPoint = builder.checkPoint;
            this.checkType = builder.checkType;
            this.expectValue = builder.expectValue;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPointList create() {
            return builder().build();
        }

        /**
         * @return checkPoint
         */
        public String getCheckPoint() {
            return this.checkPoint;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return expectValue
         */
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String checkPoint; 
            private String checkType; 
            private String expectValue; 
            private String operator; 

            private Builder() {
            } 

            private Builder(CheckPointList model) {
                this.checkPoint = model.checkPoint;
                this.checkType = model.checkType;
                this.expectValue = model.expectValue;
                this.operator = model.operator;
            } 

            /**
             * <p>The checked item.</p>
             * <p>This parameter specifies the fields in the header if you specify <code>CheckType=HEADER</code> or the name of the export parameter if you specify <code>CheckType=EXPORTED_PARAM</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>userId</p>
             */
            public Builder checkPoint(String checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * <p>The type of check. Valid values:</p>
             * <ul>
             * <li>BODY_TEXT: the response body</li>
             * <li>HEADER: the response headers</li>
             * <li>STATUS_CODE: the HTTP status code returned by the API</li>
             * <li>EXPORTED_PARAM: a specific export parameter</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXPORTED_PARAM</p>
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * <p>The operation or condition that is checked against the expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>ctn</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public CheckPointList build() {
                return new CheckPointList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class ExportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("ExportName")
        private String exportName;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("ExportValue")
        private String exportValue;

        private ExportList(Builder builder) {
            this.count = builder.count;
            this.exportName = builder.exportName;
            this.exportType = builder.exportType;
            this.exportValue = builder.exportValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return exportName
         */
        public String getExportName() {
            return this.exportName;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return exportValue
         */
        public String getExportValue() {
            return this.exportValue;
        }

        public static final class Builder {
            private String count; 
            private String exportName; 
            private String exportType; 
            private String exportValue; 

            private Builder() {
            } 

            private Builder(ExportList model) {
                this.count = model.count;
                this.exportName = model.exportName;
                this.exportType = model.exportType;
                this.exportValue = model.exportValue;
            } 

            /**
             * <p>The index of the matched item. You can specify a number or &quot;Random&quot;. If you set ExportType to BODY_TEXT, you must specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the export parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder exportName(String exportName) {
                this.exportName = exportName;
                return this;
            }

            /**
             * <p>The source of the export parameter. Valid values:</p>
             * <ul>
             * <li>BODY_TEXT: the request body in the BODY_TEXT format</li>
             * <li>BODY_JSON: the request body in the BODY_JSON format.</li>
             * <li>HEADER: the request header</li>
             * <li>STATUS_CODE: the HTTP status code returned by the API</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BODY_JSON</p>
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * <p>The actual path from which you want to extract the export parameter values.</p>
             * 
             * <strong>example:</strong>
             * <p>data.itemlist[0]</p>
             */
            public Builder exportValue(String exportValue) {
                this.exportValue = exportValue;
                return this;
            }

            public ExportList build() {
                return new ExportList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class HeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
        private String headerValue;

        private HeaderList(Builder builder) {
            this.headerName = builder.headerName;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderList create() {
            return builder().build();
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerName; 
            private String headerValue; 

            private Builder() {
            } 

            private Builder(HeaderList model) {
                this.headerName = model.headerName;
                this.headerValue = model.headerValue;
            } 

            /**
             * <p>The name of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>Accept-Encoding</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The value of the header.</p>
             * 
             * <strong>example:</strong>
             * <p>gzip, deflate, br</p>
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public HeaderList build() {
                return new HeaderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class ApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("Body")
        private ApiListBody body;

        @com.aliyun.core.annotation.NameInMap("CheckPointList")
        private java.util.List<CheckPointList> checkPointList;

        @com.aliyun.core.annotation.NameInMap("ExportList")
        private java.util.List<ExportList> exportList;

        @com.aliyun.core.annotation.NameInMap("HeaderList")
        private java.util.List<HeaderList> headerList;

        @com.aliyun.core.annotation.NameInMap("Method")
        @com.aliyun.core.annotation.Validation(required = true)
        private String method;

        @com.aliyun.core.annotation.NameInMap("RedirectCountLimit")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer redirectCountLimit;

        @com.aliyun.core.annotation.NameInMap("TimeoutInSecond")
        private Integer timeoutInSecond;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        private ApiList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.body = builder.body;
            this.checkPointList = builder.checkPointList;
            this.exportList = builder.exportList;
            this.headerList = builder.headerList;
            this.method = builder.method;
            this.redirectCountLimit = builder.redirectCountLimit;
            this.timeoutInSecond = builder.timeoutInSecond;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return body
         */
        public ApiListBody getBody() {
            return this.body;
        }

        /**
         * @return checkPointList
         */
        public java.util.List<CheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        /**
         * @return exportList
         */
        public java.util.List<ExportList> getExportList() {
            return this.exportList;
        }

        /**
         * @return headerList
         */
        public java.util.List<HeaderList> getHeaderList() {
            return this.headerList;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return redirectCountLimit
         */
        public Integer getRedirectCountLimit() {
            return this.redirectCountLimit;
        }

        /**
         * @return timeoutInSecond
         */
        public Integer getTimeoutInSecond() {
            return this.timeoutInSecond;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private ApiListBody body; 
            private java.util.List<CheckPointList> checkPointList; 
            private java.util.List<ExportList> exportList; 
            private java.util.List<HeaderList> headerList; 
            private String method; 
            private Integer redirectCountLimit; 
            private Integer timeoutInSecond; 
            private String url; 

            private Builder() {
            } 

            private Builder(ApiList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.body = model.body;
                this.checkPointList = model.checkPointList;
                this.exportList = model.exportList;
                this.headerList = model.headerList;
                this.method = model.method;
                this.redirectCountLimit = model.redirectCountLimit;
                this.timeoutInSecond = model.timeoutInSecond;
                this.url = model.url;
            } 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The request body.</p>
             */
            public Builder body(ApiListBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The checkpoints.</p>
             */
            public Builder checkPointList(java.util.List<CheckPointList> checkPointList) {
                this.checkPointList = checkPointList;
                return this;
            }

            /**
             * <p>The export parameters.</p>
             */
            public Builder exportList(java.util.List<ExportList> exportList) {
                this.exportList = exportList;
                return this;
            }

            /**
             * <p>The headers.</p>
             */
            public Builder headerList(java.util.List<HeaderList> headerList) {
                this.headerList = headerList;
                return this;
            }

            /**
             * <p>The request method.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The number of redirections. The value can be 0, which specifies that redirection is allowed, or 10, which specifies that redirection is not allowed. You can specify a value based on your business requirements.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder redirectCountLimit(Integer redirectCountLimit) {
                this.redirectCountLimit = redirectCountLimit;
                return this;
            }

            /**
             * <p>The timeout period of the API operation. Unit: seconds. Default: 5. Valid values: 1 to 60.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeoutInSecond(Integer timeoutInSecond) {
                this.timeoutInSecond = timeoutInSecond;
                return this;
            }

            /**
             * <p>The URL to which the API request is sent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">http://www.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ApiList build() {
                return new ApiList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class FileParameterExplainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseFile")
        private Boolean baseFile;

        @com.aliyun.core.annotation.NameInMap("CycleOnce")
        private Boolean cycleOnce;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileParamName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileParamName;

        private FileParameterExplainList(Builder builder) {
            this.baseFile = builder.baseFile;
            this.cycleOnce = builder.cycleOnce;
            this.fileName = builder.fileName;
            this.fileParamName = builder.fileParamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileParameterExplainList create() {
            return builder().build();
        }

        /**
         * @return baseFile
         */
        public Boolean getBaseFile() {
            return this.baseFile;
        }

        /**
         * @return cycleOnce
         */
        public Boolean getCycleOnce() {
            return this.cycleOnce;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileParamName
         */
        public String getFileParamName() {
            return this.fileParamName;
        }

        public static final class Builder {
            private Boolean baseFile; 
            private Boolean cycleOnce; 
            private String fileName; 
            private String fileParamName; 

            private Builder() {
            } 

            private Builder(FileParameterExplainList model) {
                this.baseFile = model.baseFile;
                this.cycleOnce = model.cycleOnce;
                this.fileName = model.fileName;
                this.fileParamName = model.fileParamName;
            } 

            /**
             * <p>Specifies whether the file is used as the baseline file.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder baseFile(Boolean baseFile) {
                this.baseFile = baseFile;
                return this;
            }

            /**
             * <p>Specifies whether the file is used for a single execution of the test.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cycleOnce(Boolean cycleOnce) {
                this.cycleOnce = cycleOnce;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fileName.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The parameter names in the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>name,uid,age</p>
             */
            public Builder fileParamName(String fileParamName) {
                this.fileParamName = fileParamName;
                return this;
            }

            public FileParameterExplainList build() {
                return new FileParameterExplainList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class RelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ApiList> apiList;

        @com.aliyun.core.annotation.NameInMap("FileParameterExplainList")
        private java.util.List<FileParameterExplainList> fileParameterExplainList;

        @com.aliyun.core.annotation.NameInMap("RelationId")
        private String relationId;

        @com.aliyun.core.annotation.NameInMap("RelationName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relationName;

        private RelationList(Builder builder) {
            this.apiList = builder.apiList;
            this.fileParameterExplainList = builder.fileParameterExplainList;
            this.relationId = builder.relationId;
            this.relationName = builder.relationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return apiList
         */
        public java.util.List<ApiList> getApiList() {
            return this.apiList;
        }

        /**
         * @return fileParameterExplainList
         */
        public java.util.List<FileParameterExplainList> getFileParameterExplainList() {
            return this.fileParameterExplainList;
        }

        /**
         * @return relationId
         */
        public String getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationName
         */
        public String getRelationName() {
            return this.relationName;
        }

        public static final class Builder {
            private java.util.List<ApiList> apiList; 
            private java.util.List<FileParameterExplainList> fileParameterExplainList; 
            private String relationId; 
            private String relationName; 

            private Builder() {
            } 

            private Builder(RelationList model) {
                this.apiList = model.apiList;
                this.fileParameterExplainList = model.fileParameterExplainList;
                this.relationId = model.relationId;
                this.relationName = model.relationName;
            } 

            /**
             * <p>The API operations on the session.</p>
             * <p>This parameter is required.</p>
             */
            public Builder apiList(java.util.List<ApiList> apiList) {
                this.apiList = apiList;
                return this;
            }

            /**
             * <p>The file parameters of the session.</p>
             */
            public Builder fileParameterExplainList(java.util.List<FileParameterExplainList> fileParameterExplainList) {
                this.fileParameterExplainList = fileParameterExplainList;
                return this;
            }

            /**
             * <p>The ID of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * <p>The name of the session.</p>
             * <p>This parameter is required.</p>
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SavePtsSceneRequest} extends {@link TeaModel}
     *
     * <p>SavePtsSceneRequest</p>
     */
    public static class Scene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceSetting")
        private AdvanceSetting advanceSetting;

        @com.aliyun.core.annotation.NameInMap("FileParameterList")
        private java.util.List<FileParameterList> fileParameterList;

        @com.aliyun.core.annotation.NameInMap("GlobalParameterList")
        private java.util.List<GlobalParameterList> globalParameterList;

        @com.aliyun.core.annotation.NameInMap("LoadConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private LoadConfig loadConfig;

        @com.aliyun.core.annotation.NameInMap("RelationList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<RelationList> relationList;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sceneName;

        private Scene(Builder builder) {
            this.advanceSetting = builder.advanceSetting;
            this.fileParameterList = builder.fileParameterList;
            this.globalParameterList = builder.globalParameterList;
            this.loadConfig = builder.loadConfig;
            this.relationList = builder.relationList;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return advanceSetting
         */
        public AdvanceSetting getAdvanceSetting() {
            return this.advanceSetting;
        }

        /**
         * @return fileParameterList
         */
        public java.util.List<FileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        /**
         * @return globalParameterList
         */
        public java.util.List<GlobalParameterList> getGlobalParameterList() {
            return this.globalParameterList;
        }

        /**
         * @return loadConfig
         */
        public LoadConfig getLoadConfig() {
            return this.loadConfig;
        }

        /**
         * @return relationList
         */
        public java.util.List<RelationList> getRelationList() {
            return this.relationList;
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

        public static final class Builder {
            private AdvanceSetting advanceSetting; 
            private java.util.List<FileParameterList> fileParameterList; 
            private java.util.List<GlobalParameterList> globalParameterList; 
            private LoadConfig loadConfig; 
            private java.util.List<RelationList> relationList; 
            private String sceneId; 
            private String sceneName; 

            private Builder() {
            } 

            private Builder(Scene model) {
                this.advanceSetting = model.advanceSetting;
                this.fileParameterList = model.fileParameterList;
                this.globalParameterList = model.globalParameterList;
                this.loadConfig = model.loadConfig;
                this.relationList = model.relationList;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
            } 

            /**
             * <p>The advanced settings.</p>
             */
            public Builder advanceSetting(AdvanceSetting advanceSetting) {
                this.advanceSetting = advanceSetting;
                return this;
            }

            /**
             * <p>The file parameters.</p>
             */
            public Builder fileParameterList(java.util.List<FileParameterList> fileParameterList) {
                this.fileParameterList = fileParameterList;
                return this;
            }

            /**
             * <p>The global customization parameters.</p>
             */
            public Builder globalParameterList(java.util.List<GlobalParameterList> globalParameterList) {
                this.globalParameterList = globalParameterList;
                return this;
            }

            /**
             * <p>The load settings.</p>
             * <p>This parameter is required.</p>
             */
            public Builder loadConfig(LoadConfig loadConfig) {
                this.loadConfig = loadConfig;
                return this;
            }

            /**
             * <p>The sessions.</p>
             * <p>This parameter is required.</p>
             */
            public Builder relationList(java.util.List<RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            /**
             * <p>The ID of the scenario. To save a new scenario, leave this parameter empty. To update an existing scenario, specify the ID of the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>IUYAHGJ</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The name of the scenario.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
}
