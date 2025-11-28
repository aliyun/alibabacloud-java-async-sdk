// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetScanRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetScanRuleResponseBody</p>
 */
public class GetScanRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanRule")
    private ScanRule scanRule;

    private GetScanRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.scanRule = builder.scanRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanRuleResponseBody create() {
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanRule
     */
    public ScanRule getScanRule() {
        return this.scanRule;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private ScanRule scanRule; 

        private Builder() {
        } 

        private Builder(GetScanRuleResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.scanRule = model.scanRule;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * ScanRule.
         */
        public Builder scanRule(ScanRule scanRule) {
            this.scanRule = scanRule;
            return this;
        }

        public GetScanRuleResponseBody build() {
            return new GetScanRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScanRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetScanRuleResponseBody</p>
     */
    public static class ScanRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<String> namespaces;

        @com.aliyun.core.annotation.NameInMap("RepoNames")
        private java.util.List<String> repoNames;

        @com.aliyun.core.annotation.NameInMap("RepoTagFilterPattern")
        private String repoTagFilterPattern;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScanRuleId")
        private String scanRuleId;

        @com.aliyun.core.annotation.NameInMap("ScanScope")
        private String scanScope;

        @com.aliyun.core.annotation.NameInMap("ScanType")
        private String scanType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ScanRule(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.namespaces = builder.namespaces;
            this.repoNames = builder.repoNames;
            this.repoTagFilterPattern = builder.repoTagFilterPattern;
            this.ruleName = builder.ruleName;
            this.scanRuleId = builder.scanRuleId;
            this.scanScope = builder.scanScope;
            this.scanType = builder.scanType;
            this.triggerType = builder.triggerType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanRule create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespaces
         */
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return repoNames
         */
        public java.util.List<String> getRepoNames() {
            return this.repoNames;
        }

        /**
         * @return repoTagFilterPattern
         */
        public String getRepoTagFilterPattern() {
            return this.repoTagFilterPattern;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scanRuleId
         */
        public String getScanRuleId() {
            return this.scanRuleId;
        }

        /**
         * @return scanScope
         */
        public String getScanScope() {
            return this.scanScope;
        }

        /**
         * @return scanType
         */
        public String getScanType() {
            return this.scanType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String instanceId; 
            private java.util.List<String> namespaces; 
            private java.util.List<String> repoNames; 
            private String repoTagFilterPattern; 
            private String ruleName; 
            private String scanRuleId; 
            private String scanScope; 
            private String scanType; 
            private String triggerType; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ScanRule model) {
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.namespaces = model.namespaces;
                this.repoNames = model.repoNames;
                this.repoTagFilterPattern = model.repoTagFilterPattern;
                this.ruleName = model.ruleName;
                this.scanRuleId = model.scanRuleId;
                this.scanScope = model.scanScope;
                this.scanType = model.scanType;
                this.triggerType = model.triggerType;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespaces.
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * RepoNames.
             */
            public Builder repoNames(java.util.List<String> repoNames) {
                this.repoNames = repoNames;
                return this;
            }

            /**
             * RepoTagFilterPattern.
             */
            public Builder repoTagFilterPattern(String repoTagFilterPattern) {
                this.repoTagFilterPattern = repoTagFilterPattern;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ScanRuleId.
             */
            public Builder scanRuleId(String scanRuleId) {
                this.scanRuleId = scanRuleId;
                return this;
            }

            /**
             * ScanScope.
             */
            public Builder scanScope(String scanScope) {
                this.scanScope = scanScope;
                return this;
            }

            /**
             * ScanType.
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ScanRule build() {
                return new ScanRule(this);
            } 

        } 

    }
}
