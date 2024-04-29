// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private String repairReset;

    @com.aliyun.core.annotation.NameInMap("RepairSetting")
    private RepairSetting repairSetting;

    @com.aliyun.core.annotation.NameInMap("RepairSupportType")
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
         * The help information about the check item.
         */
        public Builder assistInfo(AssistInfo assistInfo) {
            this.assistInfo = assistInfo;
            return this;
        }

        /**
         * The custom configuration items of the check item.
         */
        public Builder customConfigs(java.util.List < CustomConfigs> customConfigs) {
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * The description of the check item.
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The solution to handle the risk item.
         */
        public Builder solution(Solution solution) {
            this.solution = solution;
            return this;
        }

        public GetCheckDetailResponseBody build() {
            return new GetCheckDetailResponseBody(this);
        } 

    } 

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
             * The link to the help information about the risk item when the Type parameter is set to link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the help information about the risk item. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content in the help information about the risk item when the Type parameter is set to text.
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
             * The default value of the custom configuration item. The value is a string.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The keyword that identifies the custom configuration item for internationalization.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The type of the custom configuration item. The value is a JSON string.
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * The value of the custom configuration item. The value is a string.
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
             * The link to the description of the check item.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the description of the check item. The value is fixed as text.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content in the description of the check item.
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
    public static class RepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomFlag")
        private Boolean customFlag;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

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

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairConfigs(Builder builder) {
            this.customFlag = builder.customFlag;
            this.defaultValue = builder.defaultValue;
            this.exclusiveName = builder.exclusiveName;
            this.flowId = builder.flowId;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairConfigs create() {
            return builder().build();
        }

        /**
         * @return customFlag
         */
        public Boolean getCustomFlag() {
            return this.customFlag;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean customFlag; 
            private String defaultValue; 
            private java.util.List < String > exclusiveName; 
            private String flowId; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String value; 

            /**
             * CustomFlag.
             */
            public Builder customFlag(Boolean customFlag) {
                this.customFlag = customFlag;
                return this;
            }

            /**
             * The default value of the custom configuration item. The value is a string.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The keyword that identifies the custom configuration item for internationalization.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The type of the custom configuration item. The value is a JSON string.
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * The content in the description of the check item.
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
             * The link to the solution to handle the risk item when the Type parameter is set to link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The type of the solution to handle the risk item. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **link**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content of the solution to handle the risk item when the Type parameter is set to text.
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
