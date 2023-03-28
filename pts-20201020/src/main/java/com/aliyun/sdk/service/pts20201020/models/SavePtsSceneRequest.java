// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SavePtsSceneRequest} extends {@link RequestModel}
 *
 * <p>SavePtsSceneRequest</p>
 */
public class SavePtsSceneRequest extends Request {
    @Query
    @NameInMap("Scene")
    @Validation(required = true)
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
         * 场景详细信息
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

    public static class DomainBindingList extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Ips")
        private java.util.List < String > ips;

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
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List < String > ips; 

            /**
             * 域名
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * 对应的IP
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public DomainBindingList build() {
                return new DomainBindingList(this);
            } 

        } 

    }
    public static class AdvanceSetting extends TeaModel {
        @NameInMap("ConnectionTimeoutInSecond")
        private Integer connectionTimeoutInSecond;

        @NameInMap("DomainBindingList")
        private java.util.List < DomainBindingList> domainBindingList;

        @NameInMap("LogRate")
        private Integer logRate;

        @NameInMap("SuccessCode")
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
        public java.util.List < DomainBindingList> getDomainBindingList() {
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
            private java.util.List < DomainBindingList> domainBindingList; 
            private Integer logRate; 
            private String successCode; 

            /**
             * 超时时间，单位秒
             */
            public Builder connectionTimeoutInSecond(Integer connectionTimeoutInSecond) {
                this.connectionTimeoutInSecond = connectionTimeoutInSecond;
                return this;
            }

            /**
             * 域名绑定IP关系
             */
            public Builder domainBindingList(java.util.List < DomainBindingList> domainBindingList) {
                this.domainBindingList = domainBindingList;
                return this;
            }

            /**
             * 日志采样率，[1,50]，且是10的倍数
             */
            public Builder logRate(Integer logRate) {
                this.logRate = logRate;
                return this;
            }

            /**
             * 新增成功状态码，多个用英文逗号隔开
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
    public static class FileParameterList extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileOssAddress")
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

            /**
             * 文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件的oss地址，必须是公网可访问的
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
    public static class GlobalParameterList extends TeaModel {
        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamValue")
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

            /**
             * 参数名
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * 全局参数值，不可参数化
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
    public static class ApiLoadConfigList extends TeaModel {
        @NameInMap("ApiId")
        @Validation(required = true)
        private String apiId;

        @NameInMap("RpsBegin")
        @Validation(required = true)
        private Integer rpsBegin;

        @NameInMap("RpsLimit")
        @Validation(required = true)
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

            /**
             * API ID。
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * 起始RPS值
             */
            public Builder rpsBegin(Integer rpsBegin) {
                this.rpsBegin = rpsBegin;
                return this;
            }

            /**
             * 最大RPS值
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
    public static class Configuration extends TeaModel {
        @NameInMap("AllConcurrencyBegin")
        private Integer allConcurrencyBegin;

        @NameInMap("AllConcurrencyLimit")
        private Integer allConcurrencyLimit;

        @NameInMap("AllRpsBegin")
        private Integer allRpsBegin;

        @NameInMap("AllRpsLimit")
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

            /**
             * 所有链路的起始并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
             */
            public Builder allConcurrencyBegin(Integer allConcurrencyBegin) {
                this.allConcurrencyBegin = allConcurrencyBegin;
                return this;
            }

            /**
             * 所有链路的最大并发总值，均分给每个链路，在并发模式下使用，若不设置该值，则relationLoadConfig必须填写
             */
            public Builder allConcurrencyLimit(Integer allConcurrencyLimit) {
                this.allConcurrencyLimit = allConcurrencyLimit;
                return this;
            }

            /**
             * 所有API的起始RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
             */
            public Builder allRpsBegin(Integer allRpsBegin) {
                this.allRpsBegin = allRpsBegin;
                return this;
            }

            /**
             * 所有API的最大RPS总值，均分给每个API，在RPS模式下使用，若不设置该值，则apiLoadConfig必须填写
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
    public static class RelationLoadConfigList extends TeaModel {
        @NameInMap("ConcurrencyBegin")
        @Validation(required = true)
        private Integer concurrencyBegin;

        @NameInMap("ConcurrencyLimit")
        @Validation(required = true)
        private Integer concurrencyLimit;

        @NameInMap("RelationId")
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

            /**
             * concurrencyBegin
             */
            public Builder concurrencyBegin(Integer concurrencyBegin) {
                this.concurrencyBegin = concurrencyBegin;
                return this;
            }

            /**
             * 最大并发
             */
            public Builder concurrencyLimit(Integer concurrencyLimit) {
                this.concurrencyLimit = concurrencyLimit;
                return this;
            }

            /**
             * 链路id
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
    public static class VpcLoadConfig extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        private String regionId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        private String securityGroupId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        private String vSwitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
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

            /**
             * regionId
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 安全组的Id
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 交换机的Id
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VPC ID。
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
    public static class LoadConfig extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("ApiLoadConfigList")
        private java.util.List < ApiLoadConfigList> apiLoadConfigList;

        @NameInMap("AutoStep")
        private Boolean autoStep;

        @NameInMap("Configuration")
        @Validation(required = true)
        private Configuration configuration;

        @NameInMap("Increment")
        private Integer increment;

        @NameInMap("KeepTime")
        private Integer keepTime;

        @NameInMap("MaxRunningTime")
        @Validation(required = true)
        private Integer maxRunningTime;

        @NameInMap("RelationLoadConfigList")
        private java.util.List < RelationLoadConfigList> relationLoadConfigList;

        @NameInMap("TestMode")
        @Validation(required = true)
        private String testMode;

        @NameInMap("VpcLoadConfig")
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
        public java.util.List < ApiLoadConfigList> getApiLoadConfigList() {
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
        public java.util.List < RelationLoadConfigList> getRelationLoadConfigList() {
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
            private java.util.List < ApiLoadConfigList> apiLoadConfigList; 
            private Boolean autoStep; 
            private Configuration configuration; 
            private Integer increment; 
            private Integer keepTime; 
            private Integer maxRunningTime; 
            private java.util.List < RelationLoadConfigList> relationLoadConfigList; 
            private String testMode; 
            private VpcLoadConfig vpcLoadConfig; 

            /**
             * 指定机器数，并发必须大于250(RPS大于2000)才能使用，最大扩展机器数不能超过 最大并发/250(最大RPS/2000)
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * API的起始、最大RPS值设置，在RPS模式下使用
             */
            public Builder apiLoadConfigList(java.util.List < ApiLoadConfigList> apiLoadConfigList) {
                this.apiLoadConfigList = apiLoadConfigList;
                return this;
            }

            /**
             * 是否自动递增，只有在并发模式下有效，即 testMode=concurrency_mode 时
             */
            public Builder autoStep(Boolean autoStep) {
                this.autoStep = autoStep;
                return this;
            }

            /**
             * 场景施压量级配置信息
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * 递增百分比，取值范围[10,100]，且是整十倍；只有在并发模式且是自动递增模式下有效，即 testMode=concurrency_mode 且 autoStep=true 时
             */
            public Builder increment(Integer increment) {
                this.increment = increment;
                return this;
            }

            /**
             * 单量级持续时长，单位分钟，一定是小于施压时长 maxRunningTime
             */
            public Builder keepTime(Integer keepTime) {
                this.keepTime = keepTime;
                return this;
            }

            /**
             * 施压时长，单位分钟，[1-1440]
             */
            public Builder maxRunningTime(Integer maxRunningTime) {
                this.maxRunningTime = maxRunningTime;
                return this;
            }

            /**
             * 链路的起始、最大并发值设置，在并发模式下使用
             */
            public Builder relationLoadConfigList(java.util.List < RelationLoadConfigList> relationLoadConfigList) {
                this.relationLoadConfigList = relationLoadConfigList;
                return this;
            }

            /**
             * 施压模式，并发模式(concurrency_mode) 和RPS模式(tps_mode)
             */
            public Builder testMode(String testMode) {
                this.testMode = testMode;
                return this;
            }

            /**
             * VPC配置
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
    public static class ApiListBody extends TeaModel {
        @NameInMap("BodyValue")
        private String bodyValue;

        @NameInMap("ContentType")
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

            /**
             * body 的实际内容 形式 {"key1":"value2","key2":"value2"}
             */
            public Builder bodyValue(String bodyValue) {
                this.bodyValue = bodyValue;
                return this;
            }

            /**
             * body 类型，默认 application/x-www-form-urlencoded
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
    public static class CheckPointList extends TeaModel {
        @NameInMap("CheckPoint")
        private String checkPoint;

        @NameInMap("CheckType")
        private String checkType;

        @NameInMap("ExpectValue")
        private String expectValue;

        @NameInMap("Operator")
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

            /**
             * 检查对象 type=HEADER 时，表示header中的字段，type=EXPORTED_PARAM ，表示出参名
             */
            public Builder checkPoint(String checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * 检查点类型 响应body(BODY_TEXT)，响应header(HEADER)， 响应状态码(STATUS_CODE) ，出参（EXPORTED_PARAM）
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * 检查内容，即期望值
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * 检查条件 CheckPointOperator 中
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
    public static class ExportList extends TeaModel {
        @NameInMap("Count")
        private String count;

        @NameInMap("ExportName")
        private String exportName;

        @NameInMap("ExportType")
        private String exportType;

        @NameInMap("ExportValue")
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

            /**
             * 第几个匹配项，可以是数字 或 random（ BODY_TEXT情况下才需要count）
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * 出参名
             */
            public Builder exportName(String exportName) {
                this.exportName = exportName;
                return this;
            }

            /**
             * 出参来源 请求体(BODY_TEXT)，请求体(BODY_JSON)，请求头(HEADER)，响应状态码(STATUS_CODE)
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * 出参的解析表达式
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
    public static class HeaderList extends TeaModel {
        @NameInMap("HeaderName")
        private String headerName;

        @NameInMap("HeaderValue")
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

            /**
             * header参数名
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * 参数对应的值
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
    public static class ApiList extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        @Validation(required = true)
        private String apiName;

        @NameInMap("Body")
        private ApiListBody body;

        @NameInMap("CheckPointList")
        private java.util.List < CheckPointList> checkPointList;

        @NameInMap("ExportList")
        private java.util.List < ExportList> exportList;

        @NameInMap("HeaderList")
        private java.util.List < HeaderList> headerList;

        @NameInMap("Method")
        @Validation(required = true)
        private String method;

        @NameInMap("RedirectCountLimit")
        @Validation(required = true)
        private Integer redirectCountLimit;

        @NameInMap("TimeoutInSecond")
        private Integer timeoutInSecond;

        @NameInMap("Url")
        @Validation(required = true)
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
        public java.util.List < CheckPointList> getCheckPointList() {
            return this.checkPointList;
        }

        /**
         * @return exportList
         */
        public java.util.List < ExportList> getExportList() {
            return this.exportList;
        }

        /**
         * @return headerList
         */
        public java.util.List < HeaderList> getHeaderList() {
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
            private java.util.List < CheckPointList> checkPointList; 
            private java.util.List < ExportList> exportList; 
            private java.util.List < HeaderList> headerList; 
            private String method; 
            private Integer redirectCountLimit; 
            private Integer timeoutInSecond; 
            private String url; 

            /**
             * API的id
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * API名
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * 请求body
             */
            public Builder body(ApiListBody body) {
                this.body = body;
                return this;
            }

            /**
             * 检查点
             */
            public Builder checkPointList(java.util.List < CheckPointList> checkPointList) {
                this.checkPointList = checkPointList;
                return this;
            }

            /**
             * 出参
             */
            public Builder exportList(java.util.List < ExportList> exportList) {
                this.exportList = exportList;
                return this;
            }

            /**
             * headerList
             */
            public Builder headerList(java.util.List < HeaderList> headerList) {
                this.headerList = headerList;
                return this;
            }

            /**
             * 请求方法
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * 重定向次数，只能是0（允许重定向）或者10（不允许重定向）
             */
            public Builder redirectCountLimit(Integer redirectCountLimit) {
                this.redirectCountLimit = redirectCountLimit;
                return this;
            }

            /**
             * API超时时间，单位秒，默认5s，范围[1-60]
             */
            public Builder timeoutInSecond(Integer timeoutInSecond) {
                this.timeoutInSecond = timeoutInSecond;
                return this;
            }

            /**
             * 压测URL
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
    public static class FileParameterExplainList extends TeaModel {
        @NameInMap("BaseFile")
        private Boolean baseFile;

        @NameInMap("CycleOnce")
        private Boolean cycleOnce;

        @NameInMap("FileName")
        @Validation(required = true)
        private String fileName;

        @NameInMap("FileParamName")
        @Validation(required = true)
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

            /**
             * 是否作为基准文件
             */
            public Builder baseFile(Boolean baseFile) {
                this.baseFile = baseFile;
                return this;
            }

            /**
             * 文件是否轮询一次
             */
            public Builder cycleOnce(Boolean cycleOnce) {
                this.cycleOnce = cycleOnce;
                return this;
            }

            /**
             * 文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件使用的参数列名
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
    public static class RelationList extends TeaModel {
        @NameInMap("ApiList")
        @Validation(required = true)
        private java.util.List < ApiList> apiList;

        @NameInMap("FileParameterExplainList")
        private java.util.List < FileParameterExplainList> fileParameterExplainList;

        @NameInMap("RelationId")
        private String relationId;

        @NameInMap("RelationName")
        @Validation(required = true)
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
        public java.util.List < ApiList> getApiList() {
            return this.apiList;
        }

        /**
         * @return fileParameterExplainList
         */
        public java.util.List < FileParameterExplainList> getFileParameterExplainList() {
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
            private java.util.List < ApiList> apiList; 
            private java.util.List < FileParameterExplainList> fileParameterExplainList; 
            private String relationId; 
            private String relationName; 

            /**
             * 链路下的API信息
             */
            public Builder apiList(java.util.List < ApiList> apiList) {
                this.apiList = apiList;
                return this;
            }

            /**
             * 链路中的文件参数配置信息
             */
            public Builder fileParameterExplainList(java.util.List < FileParameterExplainList> fileParameterExplainList) {
                this.fileParameterExplainList = fileParameterExplainList;
                return this;
            }

            /**
             * 链路id
             */
            public Builder relationId(String relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * 链路名
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
    public static class Scene extends TeaModel {
        @NameInMap("AdvanceSetting")
        private AdvanceSetting advanceSetting;

        @NameInMap("FileParameterList")
        private java.util.List < FileParameterList> fileParameterList;

        @NameInMap("GlobalParameterList")
        private java.util.List < GlobalParameterList> globalParameterList;

        @NameInMap("LoadConfig")
        @Validation(required = true)
        private LoadConfig loadConfig;

        @NameInMap("RelationList")
        @Validation(required = true)
        private java.util.List < RelationList> relationList;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        @Validation(required = true)
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
        public java.util.List < FileParameterList> getFileParameterList() {
            return this.fileParameterList;
        }

        /**
         * @return globalParameterList
         */
        public java.util.List < GlobalParameterList> getGlobalParameterList() {
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
        public java.util.List < RelationList> getRelationList() {
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
            private java.util.List < FileParameterList> fileParameterList; 
            private java.util.List < GlobalParameterList> globalParameterList; 
            private LoadConfig loadConfig; 
            private java.util.List < RelationList> relationList; 
            private String sceneId; 
            private String sceneName; 

            /**
             * 高级设置
             */
            public Builder advanceSetting(AdvanceSetting advanceSetting) {
                this.advanceSetting = advanceSetting;
                return this;
            }

            /**
             * 文件参数
             */
            public Builder fileParameterList(java.util.List < FileParameterList> fileParameterList) {
                this.fileParameterList = fileParameterList;
                return this;
            }

            /**
             * 全局自定义参数
             */
            public Builder globalParameterList(java.util.List < GlobalParameterList> globalParameterList) {
                this.globalParameterList = globalParameterList;
                return this;
            }

            /**
             * 施压配置
             */
            public Builder loadConfig(LoadConfig loadConfig) {
                this.loadConfig = loadConfig;
                return this;
            }

            /**
             * 链路配置
             */
            public Builder relationList(java.util.List < RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            /**
             * 场景ID，不传为新建，传递为修改
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * 场景名
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
