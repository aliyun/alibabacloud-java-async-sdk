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
         * <p>Return value</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful, valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The API call was successful</p>
         * </li>
         * <li><p><code>false</code>: The API call failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C87993B5-7D61-5CAC-8D64-1AC732DD69FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scan rule.</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-03-15T17:08Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-szw6f6bhrky0c8jk</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Names of namespaces where the event is effective.</p>
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * <p>Names of repositories where the event is effective.</p>
             */
            public Builder repoNames(java.util.List<String> repoNames) {
                this.repoNames = repoNames;
                return this;
            }

            /**
             * <p>Tag filter pattern for event triggering.</p>
             * 
             * <strong>example:</strong>
             * <p>.*</p>
             */
            public Builder repoTagFilterPattern(String repoTagFilterPattern) {
                this.repoTagFilterPattern = repoTagFilterPattern;
                return this;
            }

            /**
             * <p>The event rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>protection</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The scan rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>crscnr-aemytkwad2h7fyhb</p>
             */
            public Builder scanRuleId(String scanRuleId) {
                this.scanRuleId = scanRuleId;
                return this;
            }

            /**
             * <p>The scan scope.</p>
             * 
             * <strong>example:</strong>
             * <p>REPO</p>
             */
            public Builder scanScope(String scanScope) {
                this.scanScope = scanScope;
                return this;
            }

            /**
             * <p>The vulnerability type: </p>
             * <ul>
             * <li><p><code>cve</code>: System vulnerability</p>
             * </li>
             * <li><p><code>sca</code>: Application vulnerability</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SBOM</p>
             */
            public Builder scanType(String scanType) {
                this.scanType = scanType;
                return this;
            }

            /**
             * <p>The trigger type, valid values:</p>
             * <ul>
             * <li><p><code>ALL</code>: All triggers</p>
             * </li>
             * <li><p><code>TAG_LISTTAG</code>: Trigger</p>
             * </li>
             * <li><p><code>TAG_REG_EXP</code>: Expression trigger</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-28T20:07:33.164</p>
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
