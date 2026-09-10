// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecuritySuggestionListResponseBody</p>
 */
public class GetSecuritySuggestionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecuritySuggestionListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecuritySuggestionListResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecuritySuggestionListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><strong>200</strong>: Success.</li>
         * <li><strong>Other (400, 500)</strong>: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.         </li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecuritySuggestionListResponseBody build() {
            return new GetSecuritySuggestionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListResponseBody</p>
     */
    public static class ComplianceObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private ComplianceObject(Builder builder) {
            this.complianceType = builder.complianceType;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceObject create() {
            return builder().build();
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String complianceType; 
            private Integer count; 

            private Builder() {
            } 

            private Builder(ComplianceObject model) {
                this.complianceType = model.complianceType;
                this.count = model.count;
            } 

            /**
             * <p>The compliance evaluation result of the rule. Valid values:</p>
             * <ul>
             * <li><strong>COMPLIANT</strong>: Compliant.</li>
             * <li><strong>NON_COMPLIANT</strong>: Non-compliant.</li>
             * <li><strong>NOT_APPLICABLE</strong>: Not applicable.</li>
             * <li><strong>INSUFFICIENT_DATA</strong>: Insufficient data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NON_COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The number of evaluations corresponding to the summary result of the rule evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public ComplianceObject build() {
                return new ComplianceObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListResponseBody</p>
     */
    public static class CreateBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePackId")
        private String compliancePackId;

        @com.aliyun.core.annotation.NameInMap("CompliancePackName")
        private String compliancePackName;

        private CreateBy(Builder builder) {
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateBy create() {
            return builder().build();
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return compliancePackName
         */
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public static final class Builder {
            private String compliancePackId; 
            private String compliancePackName; 

            private Builder() {
            } 

            private Builder(CreateBy model) {
                this.compliancePackId = model.compliancePackId;
                this.compliancePackName = model.compliancePackName;
            } 

            /**
             * <p>The ID of the compliance package to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-fdc8626622af00f9****</p>
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * <p>The compliance package name.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the compliance package.</p>
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            public CreateBy build() {
                return new CreateBy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListResponseBody</p>
     */
    public static class ConfigRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AutomationType")
        private String automationType;

        @com.aliyun.core.annotation.NameInMap("Compliance")
        private String compliance;

        @com.aliyun.core.annotation.NameInMap("ComplianceObject")
        private ComplianceObject complianceObject;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleArn")
        private String configRuleArn;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
        private String configRuleId;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleState")
        private String configRuleState;

        @com.aliyun.core.annotation.NameInMap("CreateBy")
        private CreateBy createBy;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ResourceTypesScope")
        private String resourceTypesScope;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("SourceIdentifier")
        private String sourceIdentifier;

        @com.aliyun.core.annotation.NameInMap("SourceOwner")
        private String sourceOwner;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private ConfigRuleList(Builder builder) {
            this.accountId = builder.accountId;
            this.automationType = builder.automationType;
            this.compliance = builder.compliance;
            this.complianceObject = builder.complianceObject;
            this.configRuleArn = builder.configRuleArn;
            this.configRuleId = builder.configRuleId;
            this.configRuleName = builder.configRuleName;
            this.configRuleState = builder.configRuleState;
            this.createBy = builder.createBy;
            this.description = builder.description;
            this.resourceTypesScope = builder.resourceTypesScope;
            this.riskLevel = builder.riskLevel;
            this.sourceIdentifier = builder.sourceIdentifier;
            this.sourceOwner = builder.sourceOwner;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigRuleList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return automationType
         */
        public String getAutomationType() {
            return this.automationType;
        }

        /**
         * @return compliance
         */
        public String getCompliance() {
            return this.compliance;
        }

        /**
         * @return complianceObject
         */
        public ComplianceObject getComplianceObject() {
            return this.complianceObject;
        }

        /**
         * @return configRuleArn
         */
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return configRuleName
         */
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        /**
         * @return configRuleState
         */
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        /**
         * @return createBy
         */
        public CreateBy getCreateBy() {
            return this.createBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return resourceTypesScope
         */
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sourceIdentifier
         */
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        /**
         * @return sourceOwner
         */
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long accountId; 
            private String automationType; 
            private String compliance; 
            private ComplianceObject complianceObject; 
            private String configRuleArn; 
            private String configRuleId; 
            private String configRuleName; 
            private String configRuleState; 
            private CreateBy createBy; 
            private String description; 
            private String resourceTypesScope; 
            private Integer riskLevel; 
            private String sourceIdentifier; 
            private String sourceOwner; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(ConfigRuleList model) {
                this.accountId = model.accountId;
                this.automationType = model.automationType;
                this.compliance = model.compliance;
                this.complianceObject = model.complianceObject;
                this.configRuleArn = model.configRuleArn;
                this.configRuleId = model.configRuleId;
                this.configRuleName = model.configRuleName;
                this.configRuleState = model.configRuleState;
                this.createBy = model.createBy;
                this.description = model.description;
                this.resourceTypesScope = model.resourceTypesScope;
                this.riskLevel = model.riskLevel;
                this.sourceIdentifier = model.sourceIdentifier;
                this.sourceOwner = model.sourceOwner;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the account to which the rule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1625772519123804</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The remediation type. Only OOS (CloudOps Orchestration Service) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>OOS</p>
             */
            public Builder automationType(String automationType) {
                this.automationType = automationType;
                return this;
            }

            /**
             * <p>The aggregated compliance result of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{count=1, complianceType=NON_COMPLIANT}</p>
             */
            public Builder compliance(String compliance) {
                this.compliance = compliance;
                return this;
            }

            /**
             * <p>The aggregated compliance result of the rule.</p>
             */
            public Builder complianceObject(ComplianceObject complianceObject) {
                this.complianceObject = complianceObject;
                return this;
            }

            /**
             * <p>The ARN of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:config::100931896542****:rule/cr-fdc8626622af00f9****</p>
             */
            public Builder configRuleArn(String configRuleArn) {
                this.configRuleArn = configRuleArn;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cr-bqa2f25bc5ce00af6323</p>
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the rule.</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The rule running status. Valid values:</p>
             * <ul>
             * <li><strong>ACTIVE</strong>: Active.</li>
             * <li><strong>DELETING</strong>: Being deleted.</li>
             * <li><strong>EVALUATING</strong>: Being evaluated.</li>
             * <li><strong>INACTIVE</strong>: Inactive.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder configRuleState(String configRuleState) {
                this.configRuleState = configRuleState;
                return this;
            }

            /**
             * <p>The information about the rule creator.</p>
             */
            public Builder createBy(CreateBy createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the rule.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The resource type scope. Multiple resource types are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::EIP::EipAddress</p>
             */
            public Builder resourceTypesScope(String resourceTypesScope) {
                this.resourceTypesScope = resourceTypesScope;
                return this;
            }

            /**
             * <p>The risk level of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: High risk.</li>
             * <li><strong>2</strong>: Medium risk.</li>
             * <li><strong>3</strong>: Low risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The rule identifier.</p>
             * <ul>
             * <li><p>If the rule uses a managed rule, this parameter is the managed rule name.</p>
             * </li>
             * <li><p>If the rule uses a custom function, this parameter is the function ARN.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eip-bandwidth-limit</p>
             */
            public Builder sourceIdentifier(String sourceIdentifier) {
                this.sourceIdentifier = sourceIdentifier;
                return this;
            }

            /**
             * <p>The owner of the rule source. Valid values:</p>
             * <ul>
             * <li><strong>CUSTOM_FC</strong>: Custom rule.</li>
             * <li><strong>ALIYUN</strong>: Rule template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder sourceOwner(String sourceOwner) {
                this.sourceOwner = sourceOwner;
                return this;
            }

            /**
             * <p>The tags of the rule.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ConfigRuleList build() {
                return new ConfigRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSecuritySuggestionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySuggestionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigRuleList")
        private java.util.List<ConfigRuleList> configRuleList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.configRuleList = builder.configRuleList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configRuleList
         */
        public java.util.List<ConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ConfigRuleList> configRuleList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configRuleList = model.configRuleList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of rules.</p>
             */
            public Builder configRuleList(java.util.List<ConfigRuleList> configRuleList) {
                this.configRuleList = configRuleList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
