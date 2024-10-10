// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckDetailResponseBody</p>
 */
public class GetCheckDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssistInfo")
    private AssistInfo assistInfo;

    @com.aliyun.core.annotation.NameInMap("CustomConfigs")
    private java.util.List < CustomConfigs> customConfigs;

    @com.aliyun.core.annotation.NameInMap("Description")
    private Description description;

    @com.aliyun.core.annotation.NameInMap("RepairReset")
    @Deprecated
    private String repairReset;

    @com.aliyun.core.annotation.NameInMap("RepairSetting")
    private RepairSetting repairSetting;

    @com.aliyun.core.annotation.NameInMap("RepairSupportType")
    @Deprecated
    private Integer repairSupportType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Solution")
    private Solution solution;

    private GetCheckDetailResponseBody(Builder builder) {
        this.assistInfo = builder.assistInfo;
        this.customConfigs = builder.customConfigs;
        this.description = builder.description;
        this.repairReset = builder.repairReset;
        this.repairSetting = builder.repairSetting;
        this.repairSupportType = builder.repairSupportType;
        this.requestId = builder.requestId;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return assistInfo
     */
    public AssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    /**
     * @return customConfigs
     */
    public java.util.List < CustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    /**
     * @return description
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * @return repairReset
     */
    public String getRepairReset() {
        return this.repairReset;
    }

    /**
     * @return repairSetting
     */
    public RepairSetting getRepairSetting() {
        return this.repairSetting;
    }

    /**
     * @return repairSupportType
     */
    public Integer getRepairSupportType() {
        return this.repairSupportType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solution
     */
    public Solution getSolution() {
        return this.solution;
    }

    public static final class Builder {
        private AssistInfo assistInfo; 
        private java.util.List < CustomConfigs> customConfigs; 
        private Description description; 
        private String repairReset; 
        private RepairSetting repairSetting; 
        private Integer repairSupportType; 
        private String requestId; 
        private Solution solution; 

        /**
         * <p>The help information about the check item.</p>
         */
        public Builder assistInfo(AssistInfo assistInfo) {
            this.assistInfo = assistInfo;
            return this;
        }

        /**
         * <p>The custom configuration items of the check item.</p>
         */
        public Builder customConfigs(java.util.List < CustomConfigs> customConfigs) {
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * <p>The description of the check item.</p>
         */
        public Builder description(Description description) {
            this.description = description;
            return this;
        }

        /**
         * RepairReset.
         */
        public Builder repairReset(String repairReset) {
            this.repairReset = repairReset;
            return this;
        }

        /**
         * RepairSetting.
         */
        public Builder repairSetting(RepairSetting repairSetting) {
            this.repairSetting = repairSetting;
            return this;
        }

        /**
         * RepairSupportType.
         */
        public Builder repairSupportType(Integer repairSupportType) {
            this.repairSupportType = repairSupportType;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>15A6ED6A-DBFE-5255-A248-289907809BEC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The solution to handle the risk item.</p>
         */
        public Builder solution(Solution solution) {
            this.solution = solution;
            return this;
        }

        public GetCheckDetailResponseBody build() {
            return new GetCheckDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class AssistInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AssistInfo(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssistInfo create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * <p>The link to the help information about the risk item when the Type parameter is set to link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.alibabacloud.com/help/en/resource-access-management/latest/faq-about-ram-users">https://www.alibabacloud.com/help/en/resource-access-management/latest/faq-about-ram-users</a></p>
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * <p>The type of the help information about the risk item. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>link</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The content in the help information about the risk item when the Type parameter is set to text.</p>
             * 
             * <strong>example:</strong>
             * <p>Configure an IP address whitelist</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AssistInfo build() {
                return new AssistInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class CustomConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("TypeDefine")
        private String typeDefine;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return typeDefine
         */
        public String getTypeDefine() {
            return this.typeDefine;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String defaultValue; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String value; 

            /**
             * <p>The default value of the custom configuration item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
             * 
             * <strong>example:</strong>
             * <p>SessionTimeMax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The keyword that identifies the custom configuration item for internationalization.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum session time</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the custom configuration item. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;NUMBER&quot;,&quot;range&quot;:[1,24]}</p>
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * <p>The value of the custom configuration item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class Description extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Description(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * <p>The link to the description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies">https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies</a></p>
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * <p>The type of the description of the check item. The value is fixed as text.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The content in the description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>The MSE instance does not enable authentication by default. If public network access is enabled at the same time, the data in the configuration center may be dragged and there is a security risk.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class FlowStep extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShowText")
        private String showText;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        private FlowStep(Builder builder) {
            this.showText = builder.showText;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowStep create() {
            return builder().build();
        }

        /**
         * @return showText
         */
        public String getShowText() {
            return this.showText;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        public static final class Builder {
            private String showText; 
            private String step; 

            /**
             * ShowText.
             */
            public Builder showText(String showText) {
                this.showText = showText;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            public FlowStep build() {
                return new FlowStep(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class RepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsoleParamType")
        private String consoleParamType;

        @com.aliyun.core.annotation.NameInMap("CustomFlag")
        private Boolean customFlag;

        @com.aliyun.core.annotation.NameInMap("DataTransformType")
        private String dataTransformType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("EmptyParamSwitch")
        private String emptyParamSwitch;

        @com.aliyun.core.annotation.NameInMap("ExclusiveName")
        private java.util.List < String > exclusiveName;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("TypeDefine")
        private String typeDefine;

        @com.aliyun.core.annotation.NameInMap("UsageType")
        private String usageType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairConfigs(Builder builder) {
            this.consoleParamType = builder.consoleParamType;
            this.customFlag = builder.customFlag;
            this.dataTransformType = builder.dataTransformType;
            this.defaultValue = builder.defaultValue;
            this.emptyParamSwitch = builder.emptyParamSwitch;
            this.exclusiveName = builder.exclusiveName;
            this.flowId = builder.flowId;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.usageType = builder.usageType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairConfigs create() {
            return builder().build();
        }

        /**
         * @return consoleParamType
         */
        public String getConsoleParamType() {
            return this.consoleParamType;
        }

        /**
         * @return customFlag
         */
        public Boolean getCustomFlag() {
            return this.customFlag;
        }

        /**
         * @return dataTransformType
         */
        public String getDataTransformType() {
            return this.dataTransformType;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return emptyParamSwitch
         */
        public String getEmptyParamSwitch() {
            return this.emptyParamSwitch;
        }

        /**
         * @return exclusiveName
         */
        public java.util.List < String > getExclusiveName() {
            return this.exclusiveName;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return typeDefine
         */
        public String getTypeDefine() {
            return this.typeDefine;
        }

        /**
         * @return usageType
         */
        public String getUsageType() {
            return this.usageType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String consoleParamType; 
            private Boolean customFlag; 
            private String dataTransformType; 
            private String defaultValue; 
            private String emptyParamSwitch; 
            private java.util.List < String > exclusiveName; 
            private String flowId; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String usageType; 
            private String value; 

            /**
             * ConsoleParamType.
             */
            public Builder consoleParamType(String consoleParamType) {
                this.consoleParamType = consoleParamType;
                return this;
            }

            /**
             * CustomFlag.
             */
            public Builder customFlag(Boolean customFlag) {
                this.customFlag = customFlag;
                return this;
            }

            /**
             * DataTransformType.
             */
            public Builder dataTransformType(String dataTransformType) {
                this.dataTransformType = dataTransformType;
                return this;
            }

            /**
             * <p>The default value of the custom configuration item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * EmptyParamSwitch.
             */
            public Builder emptyParamSwitch(String emptyParamSwitch) {
                this.emptyParamSwitch = emptyParamSwitch;
                return this;
            }

            /**
             * ExclusiveName.
             */
            public Builder exclusiveName(java.util.List < String > exclusiveName) {
                this.exclusiveName = exclusiveName;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
             * 
             * <strong>example:</strong>
             * <p>SessionTimeMax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The keyword that identifies the custom configuration item for internationalization.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum session time</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the custom configuration item. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;NUMBER&quot;,&quot;range&quot;:[1,24]}</p>
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * UsageType.
             */
            public Builder usageType(String usageType) {
                this.usageType = usageType;
                return this;
            }

            /**
             * <p>The content in the description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>The MSE instance does not enable authentication by default. If public network access is enabled at the same time, the data in the configuration center may be dragged and there is a security risk.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepairConfigs build() {
                return new RepairConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class RepairSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowStep")
        private java.util.List < FlowStep> flowStep;

        @com.aliyun.core.annotation.NameInMap("RepairConfigs")
        private java.util.List < RepairConfigs> repairConfigs;

        @com.aliyun.core.annotation.NameInMap("RepairReset")
        private Boolean repairReset;

        @com.aliyun.core.annotation.NameInMap("RepairSupport")
        private Boolean repairSupport;

        @com.aliyun.core.annotation.NameInMap("RepairSupportType")
        private Integer repairSupportType;

        private RepairSetting(Builder builder) {
            this.flowStep = builder.flowStep;
            this.repairConfigs = builder.repairConfigs;
            this.repairReset = builder.repairReset;
            this.repairSupport = builder.repairSupport;
            this.repairSupportType = builder.repairSupportType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairSetting create() {
            return builder().build();
        }

        /**
         * @return flowStep
         */
        public java.util.List < FlowStep> getFlowStep() {
            return this.flowStep;
        }

        /**
         * @return repairConfigs
         */
        public java.util.List < RepairConfigs> getRepairConfigs() {
            return this.repairConfigs;
        }

        /**
         * @return repairReset
         */
        public Boolean getRepairReset() {
            return this.repairReset;
        }

        /**
         * @return repairSupport
         */
        public Boolean getRepairSupport() {
            return this.repairSupport;
        }

        /**
         * @return repairSupportType
         */
        public Integer getRepairSupportType() {
            return this.repairSupportType;
        }

        public static final class Builder {
            private java.util.List < FlowStep> flowStep; 
            private java.util.List < RepairConfigs> repairConfigs; 
            private Boolean repairReset; 
            private Boolean repairSupport; 
            private Integer repairSupportType; 

            /**
             * FlowStep.
             */
            public Builder flowStep(java.util.List < FlowStep> flowStep) {
                this.flowStep = flowStep;
                return this;
            }

            /**
             * RepairConfigs.
             */
            public Builder repairConfigs(java.util.List < RepairConfigs> repairConfigs) {
                this.repairConfigs = repairConfigs;
                return this;
            }

            /**
             * RepairReset.
             */
            public Builder repairReset(Boolean repairReset) {
                this.repairReset = repairReset;
                return this;
            }

            /**
             * RepairSupport.
             */
            public Builder repairSupport(Boolean repairSupport) {
                this.repairSupport = repairSupport;
                return this;
            }

            /**
             * RepairSupportType.
             */
            public Builder repairSupportType(Integer repairSupportType) {
                this.repairSupportType = repairSupportType;
                return this;
            }

            public RepairSetting build() {
                return new RepairSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckDetailResponseBody</p>
     */
    public static class Solution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Solution(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solution create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * <p>The link to the solution to handle the risk item when the Type parameter is set to link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies">https://www.alibabacloud.com/help/en/object-storage-service/latest/tutorial-implement-data-sharing-across-departments-based-on-bucket-policies</a></p>
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * <p>The type of the solution to handle the risk item. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>link</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The content of the solution to handle the risk item when the Type parameter is set to text.</p>
             * 
             * <strong>example:</strong>
             * <p>Enter the MSE product console - registration and configuration center - instance list, click the corresponding instance name to enter the instance details, find the public network whitelist setting option in the basic information, and configure the whitelist according to business needs. It is forbidden to configure 0.0.0.0 or the whitelist as null.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Solution build() {
                return new Solution(this);
            } 

        } 

    }
}
