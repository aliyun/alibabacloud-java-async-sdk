// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDevObjectDependencyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevObjectDependencyResponseBody</p>
 */
public class GetDevObjectDependencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DevObjectDependencyList")
    private java.util.List<DevObjectDependencyList> devObjectDependencyList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDevObjectDependencyResponseBody(Builder builder) {
        this.code = builder.code;
        this.devObjectDependencyList = builder.devObjectDependencyList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevObjectDependencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return devObjectDependencyList
     */
    public java.util.List<DevObjectDependencyList> getDevObjectDependencyList() {
        return this.devObjectDependencyList;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DevObjectDependencyList> devObjectDependencyList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DevObjectDependencyList.
         */
        public Builder devObjectDependencyList(java.util.List<DevObjectDependencyList> devObjectDependencyList) {
            this.devObjectDependencyList = devObjectDependencyList;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDevObjectDependencyResponseBody build() {
            return new GetDevObjectDependencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDevObjectDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDevObjectDependencyResponseBody</p>
     */
    public static class DependencyPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodOffset")
        private Integer periodOffset;

        @com.aliyun.core.annotation.NameInMap("PeriodType")
        private String periodType;

        private DependencyPeriod(Builder builder) {
            this.periodOffset = builder.periodOffset;
            this.periodType = builder.periodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependencyPeriod create() {
            return builder().build();
        }

        /**
         * @return periodOffset
         */
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        public static final class Builder {
            private Integer periodOffset; 
            private String periodType; 

            /**
             * PeriodOffset.
             */
            public Builder periodOffset(Integer periodOffset) {
                this.periodOffset = periodOffset;
                return this;
            }

            /**
             * PeriodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            public DependencyPeriod build() {
                return new DependencyPeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDevObjectDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDevObjectDependencyResponseBody</p>
     */
    public static class OutputContextParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private OutputContextParamList(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputContextParamList create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String key; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public OutputContextParamList build() {
                return new OutputContextParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDevObjectDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDevObjectDependencyResponseBody</p>
     */
    public static class OwnerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private OwnerList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OwnerList build() {
                return new OwnerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDevObjectDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDevObjectDependencyResponseBody</p>
     */
    public static class DevObjectDependencyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoParse")
        private Boolean autoParse;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private String bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("CustomCronExpression")
        private Boolean customCronExpression;

        @com.aliyun.core.annotation.NameInMap("DependFieldList")
        private java.util.List<String> dependFieldList;

        @com.aliyun.core.annotation.NameInMap("DependencyPeriod")
        private DependencyPeriod dependencyPeriod;

        @com.aliyun.core.annotation.NameInMap("DependencyStrategy")
        private String dependencyStrategy;

        @com.aliyun.core.annotation.NameInMap("DimMidNode")
        private Boolean dimMidNode;

        @com.aliyun.core.annotation.NameInMap("EffectFieldList")
        private java.util.List<String> effectFieldList;

        @com.aliyun.core.annotation.NameInMap("ExternalBizInfo")
        private String externalBizInfo;

        @com.aliyun.core.annotation.NameInMap("ManuallyAdd")
        private Boolean manuallyAdd;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutputName")
        private String nodeOutputName;

        @com.aliyun.core.annotation.NameInMap("NodeOutputTableName")
        private String nodeOutputTableName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OutputContextParamList")
        private java.util.List<OutputContextParamList> outputContextParamList;

        @com.aliyun.core.annotation.NameInMap("OwnerList")
        private java.util.List<OwnerList> ownerList;

        @com.aliyun.core.annotation.NameInMap("PeriodDiff")
        private Integer periodDiff;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("SelfDepend")
        private Boolean selfDepend;

        @com.aliyun.core.annotation.NameInMap("SubBizType")
        private String subBizType;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private Boolean valid;

        private DevObjectDependencyList(Builder builder) {
            this.autoParse = builder.autoParse;
            this.bizType = builder.bizType;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.cronExpression = builder.cronExpression;
            this.customCronExpression = builder.customCronExpression;
            this.dependFieldList = builder.dependFieldList;
            this.dependencyPeriod = builder.dependencyPeriod;
            this.dependencyStrategy = builder.dependencyStrategy;
            this.dimMidNode = builder.dimMidNode;
            this.effectFieldList = builder.effectFieldList;
            this.externalBizInfo = builder.externalBizInfo;
            this.manuallyAdd = builder.manuallyAdd;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutputName = builder.nodeOutputName;
            this.nodeOutputTableName = builder.nodeOutputTableName;
            this.nodeType = builder.nodeType;
            this.outputContextParamList = builder.outputContextParamList;
            this.ownerList = builder.ownerList;
            this.periodDiff = builder.periodDiff;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.scheduleType = builder.scheduleType;
            this.selfDepend = builder.selfDepend;
            this.subBizType = builder.subBizType;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevObjectDependencyList create() {
            return builder().build();
        }

        /**
         * @return autoParse
         */
        public Boolean getAutoParse() {
            return this.autoParse;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return bizUnitId
         */
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return customCronExpression
         */
        public Boolean getCustomCronExpression() {
            return this.customCronExpression;
        }

        /**
         * @return dependFieldList
         */
        public java.util.List<String> getDependFieldList() {
            return this.dependFieldList;
        }

        /**
         * @return dependencyPeriod
         */
        public DependencyPeriod getDependencyPeriod() {
            return this.dependencyPeriod;
        }

        /**
         * @return dependencyStrategy
         */
        public String getDependencyStrategy() {
            return this.dependencyStrategy;
        }

        /**
         * @return dimMidNode
         */
        public Boolean getDimMidNode() {
            return this.dimMidNode;
        }

        /**
         * @return effectFieldList
         */
        public java.util.List<String> getEffectFieldList() {
            return this.effectFieldList;
        }

        /**
         * @return externalBizInfo
         */
        public String getExternalBizInfo() {
            return this.externalBizInfo;
        }

        /**
         * @return manuallyAdd
         */
        public Boolean getManuallyAdd() {
            return this.manuallyAdd;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutputName
         */
        public String getNodeOutputName() {
            return this.nodeOutputName;
        }

        /**
         * @return nodeOutputTableName
         */
        public String getNodeOutputTableName() {
            return this.nodeOutputTableName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return outputContextParamList
         */
        public java.util.List<OutputContextParamList> getOutputContextParamList() {
            return this.outputContextParamList;
        }

        /**
         * @return ownerList
         */
        public java.util.List<OwnerList> getOwnerList() {
            return this.ownerList;
        }

        /**
         * @return periodDiff
         */
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return selfDepend
         */
        public Boolean getSelfDepend() {
            return this.selfDepend;
        }

        /**
         * @return subBizType
         */
        public String getSubBizType() {
            return this.subBizType;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private Boolean autoParse; 
            private String bizType; 
            private String bizUnitId; 
            private String bizUnitName; 
            private String cronExpression; 
            private Boolean customCronExpression; 
            private java.util.List<String> dependFieldList; 
            private DependencyPeriod dependencyPeriod; 
            private String dependencyStrategy; 
            private Boolean dimMidNode; 
            private java.util.List<String> effectFieldList; 
            private String externalBizInfo; 
            private Boolean manuallyAdd; 
            private String nodeId; 
            private String nodeName; 
            private String nodeOutputName; 
            private String nodeOutputTableName; 
            private String nodeType; 
            private java.util.List<OutputContextParamList> outputContextParamList; 
            private java.util.List<OwnerList> ownerList; 
            private Integer periodDiff; 
            private Long projectId; 
            private String projectName; 
            private String scheduleType; 
            private Boolean selfDepend; 
            private String subBizType; 
            private Boolean valid; 

            /**
             * AutoParse.
             */
            public Builder autoParse(Boolean autoParse) {
                this.autoParse = autoParse;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(String bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * CustomCronExpression.
             */
            public Builder customCronExpression(Boolean customCronExpression) {
                this.customCronExpression = customCronExpression;
                return this;
            }

            /**
             * DependFieldList.
             */
            public Builder dependFieldList(java.util.List<String> dependFieldList) {
                this.dependFieldList = dependFieldList;
                return this;
            }

            /**
             * DependencyPeriod.
             */
            public Builder dependencyPeriod(DependencyPeriod dependencyPeriod) {
                this.dependencyPeriod = dependencyPeriod;
                return this;
            }

            /**
             * DependencyStrategy.
             */
            public Builder dependencyStrategy(String dependencyStrategy) {
                this.dependencyStrategy = dependencyStrategy;
                return this;
            }

            /**
             * DimMidNode.
             */
            public Builder dimMidNode(Boolean dimMidNode) {
                this.dimMidNode = dimMidNode;
                return this;
            }

            /**
             * EffectFieldList.
             */
            public Builder effectFieldList(java.util.List<String> effectFieldList) {
                this.effectFieldList = effectFieldList;
                return this;
            }

            /**
             * ExternalBizInfo.
             */
            public Builder externalBizInfo(String externalBizInfo) {
                this.externalBizInfo = externalBizInfo;
                return this;
            }

            /**
             * ManuallyAdd.
             */
            public Builder manuallyAdd(Boolean manuallyAdd) {
                this.manuallyAdd = manuallyAdd;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeOutputName.
             */
            public Builder nodeOutputName(String nodeOutputName) {
                this.nodeOutputName = nodeOutputName;
                return this;
            }

            /**
             * NodeOutputTableName.
             */
            public Builder nodeOutputTableName(String nodeOutputTableName) {
                this.nodeOutputTableName = nodeOutputTableName;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OutputContextParamList.
             */
            public Builder outputContextParamList(java.util.List<OutputContextParamList> outputContextParamList) {
                this.outputContextParamList = outputContextParamList;
                return this;
            }

            /**
             * OwnerList.
             */
            public Builder ownerList(java.util.List<OwnerList> ownerList) {
                this.ownerList = ownerList;
                return this;
            }

            /**
             * PeriodDiff.
             */
            public Builder periodDiff(Integer periodDiff) {
                this.periodDiff = periodDiff;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * SelfDepend.
             */
            public Builder selfDepend(Boolean selfDepend) {
                this.selfDepend = selfDepend;
                return this;
            }

            /**
             * SubBizType.
             */
            public Builder subBizType(String subBizType) {
                this.subBizType = subBizType;
                return this;
            }

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public DevObjectDependencyList build() {
                return new DevObjectDependencyList(this);
            } 

        } 

    }
}
