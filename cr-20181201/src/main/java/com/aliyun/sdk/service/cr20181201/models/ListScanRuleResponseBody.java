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
 * {@link ListScanRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListScanRuleResponseBody</p>
 */
public class ListScanRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanRules")
    private java.util.List<ScanRules> scanRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListScanRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scanRules = builder.scanRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScanRuleResponseBody create() {
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
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanRules
     */
    public java.util.List<ScanRules> getScanRules() {
        return this.scanRules;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ScanRules> scanRules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListScanRuleResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scanRules = model.scanRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request Id</p>
         * 
         * <strong>example:</strong>
         * <p>2CB62B5E-605B-5A23-9110-728B8207A25C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of scan rules.</p>
         */
        public Builder scanRules(java.util.List<ScanRules> scanRules) {
            this.scanRules = scanRules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScanRuleResponseBody build() {
            return new ListScanRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScanRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListScanRuleResponseBody</p>
     */
    public static class ScanRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        private ScanRules(Builder builder) {
            this.createTime = builder.createTime;
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

        public static ScanRules create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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

            private Builder(ScanRules model) {
                this.createTime = model.createTime;
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
             * <p>1702361810000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The list of namespaces.</p>
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * <p>The repository name.</p>
             */
            public Builder repoNames(java.util.List<String> repoNames) {
                this.repoNames = repoNames;
                return this;
            }

            /**
             * <p>The tag that triggers the scan matches the regular expression.</p>
             * 
             * <strong>example:</strong>
             * <p>.*</p>
             */
            public Builder repoTagFilterPattern(String repoTagFilterPattern) {
                this.repoTagFilterPattern = repoTagFilterPattern;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>cicd-prod</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The scan rule id.</p>
             * 
             * <strong>example:</strong>
             * <p>crscnr-2sdveqjhpzd****</p>
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
             * <p>The scan type. Valid values:</p>
             * <ul>
             * <li><code>VUL</code>: Products Cloud Security Scanner</li>
             * <li><code>SBOM</code>: Product Content Analysis</li>
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
             * <p>The trigger type.</p>
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
             * <p>1764122725000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ScanRules build() {
                return new ScanRules(this);
            } 

        } 

    }
}
