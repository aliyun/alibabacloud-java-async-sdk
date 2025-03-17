// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnInfoResponseBody</p>
 */
public class ListSensitiveColumnInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveColumnList")
    private SensitiveColumnList sensitiveColumnList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSensitiveColumnInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveColumnList = builder.sensitiveColumnList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveColumnList
     */
    public SensitiveColumnList getSensitiveColumnList() {
        return this.sensitiveColumnList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SensitiveColumnList sensitiveColumnList; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSensitiveColumnInfoResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.sensitiveColumnList = model.sensitiveColumnList;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * SensitiveColumnList.
         */
        public Builder sensitiveColumnList(SensitiveColumnList sensitiveColumnList) {
            this.sensitiveColumnList = sensitiveColumnList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSensitiveColumnInfoResponseBody build() {
            return new ListSensitiveColumnInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnInfoResponseBody</p>
     */
    public static class DefaultDesensitizationRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private DefaultDesensitizationRule(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultDesensitizationRule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(DefaultDesensitizationRule model) {
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public DefaultDesensitizationRule build() {
                return new DefaultDesensitizationRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnInfoResponseBody</p>
     */
    public static class SemiDesensitizationRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private SemiDesensitizationRule(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemiDesensitizationRule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(SemiDesensitizationRule model) {
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public SemiDesensitizationRule build() {
                return new SemiDesensitizationRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnInfoResponseBody</p>
     */
    public static class SemiDesensitizationRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SemiDesensitizationRule")
        private java.util.List<SemiDesensitizationRule> semiDesensitizationRule;

        private SemiDesensitizationRuleList(Builder builder) {
            this.semiDesensitizationRule = builder.semiDesensitizationRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemiDesensitizationRuleList create() {
            return builder().build();
        }

        /**
         * @return semiDesensitizationRule
         */
        public java.util.List<SemiDesensitizationRule> getSemiDesensitizationRule() {
            return this.semiDesensitizationRule;
        }

        public static final class Builder {
            private java.util.List<SemiDesensitizationRule> semiDesensitizationRule; 

            private Builder() {
            } 

            private Builder(SemiDesensitizationRuleList model) {
                this.semiDesensitizationRule = model.semiDesensitizationRule;
            } 

            /**
             * SemiDesensitizationRule.
             */
            public Builder semiDesensitizationRule(java.util.List<SemiDesensitizationRule> semiDesensitizationRule) {
                this.semiDesensitizationRule = semiDesensitizationRule;
                return this;
            }

            public SemiDesensitizationRuleList build() {
                return new SemiDesensitizationRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnInfoResponseBody</p>
     */
    public static class SensitiveColumn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DefaultDesensitizationRule")
        private DefaultDesensitizationRule defaultDesensitizationRule;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("IsPlain")
        private Boolean isPlain;

        @com.aliyun.core.annotation.NameInMap("SampleData")
        private String sampleData;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("SemiDesensitizationRuleList")
        private SemiDesensitizationRuleList semiDesensitizationRuleList;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UserSensitivityLevel")
        private String userSensitivityLevel;

        private SensitiveColumn(Builder builder) {
            this.categoryName = builder.categoryName;
            this.columnName = builder.columnName;
            this.defaultDesensitizationRule = builder.defaultDesensitizationRule;
            this.instanceId = builder.instanceId;
            this.isPlain = builder.isPlain;
            this.sampleData = builder.sampleData;
            this.schemaName = builder.schemaName;
            this.securityLevel = builder.securityLevel;
            this.semiDesensitizationRuleList = builder.semiDesensitizationRuleList;
            this.tableName = builder.tableName;
            this.userSensitivityLevel = builder.userSensitivityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumn create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return defaultDesensitizationRule
         */
        public DefaultDesensitizationRule getDefaultDesensitizationRule() {
            return this.defaultDesensitizationRule;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isPlain
         */
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        /**
         * @return sampleData
         */
        public String getSampleData() {
            return this.sampleData;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return semiDesensitizationRuleList
         */
        public SemiDesensitizationRuleList getSemiDesensitizationRuleList() {
            return this.semiDesensitizationRuleList;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return userSensitivityLevel
         */
        public String getUserSensitivityLevel() {
            return this.userSensitivityLevel;
        }

        public static final class Builder {
            private String categoryName; 
            private String columnName; 
            private DefaultDesensitizationRule defaultDesensitizationRule; 
            private Integer instanceId; 
            private Boolean isPlain; 
            private String sampleData; 
            private String schemaName; 
            private String securityLevel; 
            private SemiDesensitizationRuleList semiDesensitizationRuleList; 
            private String tableName; 
            private String userSensitivityLevel; 

            private Builder() {
            } 

            private Builder(SensitiveColumn model) {
                this.categoryName = model.categoryName;
                this.columnName = model.columnName;
                this.defaultDesensitizationRule = model.defaultDesensitizationRule;
                this.instanceId = model.instanceId;
                this.isPlain = model.isPlain;
                this.sampleData = model.sampleData;
                this.schemaName = model.schemaName;
                this.securityLevel = model.securityLevel;
                this.semiDesensitizationRuleList = model.semiDesensitizationRuleList;
                this.tableName = model.tableName;
                this.userSensitivityLevel = model.userSensitivityLevel;
            } 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * DefaultDesensitizationRule.
             */
            public Builder defaultDesensitizationRule(DefaultDesensitizationRule defaultDesensitizationRule) {
                this.defaultDesensitizationRule = defaultDesensitizationRule;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsPlain.
             */
            public Builder isPlain(Boolean isPlain) {
                this.isPlain = isPlain;
                return this;
            }

            /**
             * SampleData.
             */
            public Builder sampleData(String sampleData) {
                this.sampleData = sampleData;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * SemiDesensitizationRuleList.
             */
            public Builder semiDesensitizationRuleList(SemiDesensitizationRuleList semiDesensitizationRuleList) {
                this.semiDesensitizationRuleList = semiDesensitizationRuleList;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * UserSensitivityLevel.
             */
            public Builder userSensitivityLevel(String userSensitivityLevel) {
                this.userSensitivityLevel = userSensitivityLevel;
                return this;
            }

            public SensitiveColumn build() {
                return new SensitiveColumn(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListSensitiveColumnInfoResponseBody</p>
     */
    public static class SensitiveColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveColumn")
        private java.util.List<SensitiveColumn> sensitiveColumn;

        private SensitiveColumnList(Builder builder) {
            this.sensitiveColumn = builder.sensitiveColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnList create() {
            return builder().build();
        }

        /**
         * @return sensitiveColumn
         */
        public java.util.List<SensitiveColumn> getSensitiveColumn() {
            return this.sensitiveColumn;
        }

        public static final class Builder {
            private java.util.List<SensitiveColumn> sensitiveColumn; 

            private Builder() {
            } 

            private Builder(SensitiveColumnList model) {
                this.sensitiveColumn = model.sensitiveColumn;
            } 

            /**
             * SensitiveColumn.
             */
            public Builder sensitiveColumn(java.util.List<SensitiveColumn> sensitiveColumn) {
                this.sensitiveColumn = sensitiveColumn;
                return this;
            }

            public SensitiveColumnList build() {
                return new SensitiveColumnList(this);
            } 

        } 

    }
}
