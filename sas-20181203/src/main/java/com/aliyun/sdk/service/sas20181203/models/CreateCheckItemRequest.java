// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateCheckItemRequest} extends {@link RequestModel}
 *
 * <p>CreateCheckItemRequest</p>
 */
public class CreateCheckItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssistInfo")
    private AssistInfo assistInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckShowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkShowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private Description description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSubType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceSubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SectionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> sectionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solution")
    private Solution solution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private CreateCheckItemRequest(Builder builder) {
        super(builder);
        this.assistInfo = builder.assistInfo;
        this.checkRule = builder.checkRule;
        this.checkShowName = builder.checkShowName;
        this.description = builder.description;
        this.instanceSubType = builder.instanceSubType;
        this.instanceType = builder.instanceType;
        this.remark = builder.remark;
        this.riskLevel = builder.riskLevel;
        this.sectionIds = builder.sectionIds;
        this.solution = builder.solution;
        this.status = builder.status;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCheckItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assistInfo
     */
    public AssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    /**
     * @return checkRule
     */
    public String getCheckRule() {
        return this.checkRule;
    }

    /**
     * @return checkShowName
     */
    public String getCheckShowName() {
        return this.checkShowName;
    }

    /**
     * @return description
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * @return instanceSubType
     */
    public String getInstanceSubType() {
        return this.instanceSubType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sectionIds
     */
    public java.util.List<Long> getSectionIds() {
        return this.sectionIds;
    }

    /**
     * @return solution
     */
    public Solution getSolution() {
        return this.solution;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateCheckItemRequest, Builder> {
        private AssistInfo assistInfo; 
        private String checkRule; 
        private String checkShowName; 
        private Description description; 
        private String instanceSubType; 
        private String instanceType; 
        private String remark; 
        private String riskLevel; 
        private java.util.List<Long> sectionIds; 
        private Solution solution; 
        private String status; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateCheckItemRequest request) {
            super(request);
            this.assistInfo = request.assistInfo;
            this.checkRule = request.checkRule;
            this.checkShowName = request.checkShowName;
            this.description = request.description;
            this.instanceSubType = request.instanceSubType;
            this.instanceType = request.instanceType;
            this.remark = request.remark;
            this.riskLevel = request.riskLevel;
            this.sectionIds = request.sectionIds;
            this.solution = request.solution;
            this.status = request.status;
            this.vendor = request.vendor;
        } 

        /**
         * <p>Help information for the check item.</p>
         */
        public Builder assistInfo(AssistInfo assistInfo) {
            String assistInfoShrink = shrink(assistInfo, "AssistInfo", "json");
            this.putQueryParameter("AssistInfo", assistInfoShrink);
            this.assistInfo = assistInfo;
            return this;
        }

        /**
         * <p>Definition rule for the custom check item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;},{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testInstanceId&quot;}]}}</p>
         */
        public Builder checkRule(String checkRule) {
            this.putQueryParameter("CheckRule", checkRule);
            this.checkRule = checkRule;
            return this;
        }

        /**
         * <p>Name of the custom check item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testCheckItemName</p>
         */
        public Builder checkShowName(String checkShowName) {
            this.putQueryParameter("CheckShowName", checkShowName);
            this.checkShowName = checkShowName;
            return this;
        }

        /**
         * <p>Description information of the check item.</p>
         */
        public Builder description(Description description) {
            String descriptionShrink = shrink(description, "Description", "json");
            this.putQueryParameter("Description", descriptionShrink);
            this.description = description;
            return this;
        }

        /**
         * <p>Sub-asset type of the cloud product.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
         */
        public Builder instanceSubType(String instanceSubType) {
            this.putQueryParameter("InstanceSubType", instanceSubType);
            this.instanceSubType = instanceSubType;
            return this;
        }

        /**
         * <p>Asset type of the cloud product.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Remark information.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Risk level of the check item. Values:</p>
         * <ul>
         * <li><strong>HIGH</strong>: High risk</li>
         * <li><strong>MEDIUM</strong>: Medium risk</li>
         * <li><strong>LOW</strong>: Low risk</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>Array of section IDs associated with the check item.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sectionIds(java.util.List<Long> sectionIds) {
            this.putQueryParameter("SectionIds", sectionIds);
            this.sectionIds = sectionIds;
            return this;
        }

        /**
         * <p>Solution information for the check item.</p>
         */
        public Builder solution(Solution solution) {
            String solutionShrink = shrink(solution, "Solution", "json");
            this.putQueryParameter("Solution", solutionShrink);
            this.solution = solution;
            return this;
        }

        /**
         * <p>Status of the check item. Values:</p>
         * <ul>
         * <li><strong>EDIT</strong>: In editing</li>
         * <li><strong>RELEASE</strong>: Released</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Changing from <strong>Released</strong> to <strong>In editing</strong> will clear all historical records</li>
         * <li>Only the <strong>Released</strong> status allows the use of the check item for inspection.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EDIT</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Cloud asset vendor.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCloudAssetSchemas~~">ListCloudAssetSchemas</a> API to get the available vendors.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateCheckItemRequest build() {
            return new CreateCheckItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCheckItemRequest} extends {@link TeaModel}
     *
     * <p>CreateCheckItemRequest</p>
     */
    public static class AssistInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AssistInfo(Builder builder) {
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
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(AssistInfo model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Type of the help information for the check item risk. Values:</p>
             * <ul>
             * <li><strong>text</strong>: Text</li>
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
             * <p>Content of the help information for the check item risk.</p>
             * 
             * <strong>example:</strong>
             * <p>custom assistInfo.</p>
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
     * {@link CreateCheckItemRequest} extends {@link TeaModel}
     *
     * <p>CreateCheckItemRequest</p>
     */
    public static class Description extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Description(Builder builder) {
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
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Description model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Type of the check item description information. Values:</p>
             * <ul>
             * <li><strong>text</strong>: Text</li>
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
             * <p>Specific content of the description.</p>
             * 
             * <strong>example:</strong>
             * <p>custom description.</p>
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
     * {@link CreateCheckItemRequest} extends {@link TeaModel}
     *
     * <p>CreateCheckItemRequest</p>
     */
    public static class Solution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Solution(Builder builder) {
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
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Solution model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Type of the solution information for the check item. Values:</p>
             * <ul>
             * <li><strong>text</strong>: Text</li>
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
             * <p>Content of the solution for the check item risk.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
