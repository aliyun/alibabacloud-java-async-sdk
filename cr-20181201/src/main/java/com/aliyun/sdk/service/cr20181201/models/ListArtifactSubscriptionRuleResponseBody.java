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
 * {@link ListArtifactSubscriptionRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactSubscriptionRuleResponseBody</p>
 */
public class ListArtifactSubscriptionRuleResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListArtifactSubscriptionRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactSubscriptionRuleResponseBody create() {
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
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
        private java.util.List<Rules> rules; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListArtifactSubscriptionRuleResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>07FC5654-C82A-59FA-A9D1-78B4EE443F86</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried artifact subscription rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactSubscriptionRuleResponseBody build() {
            return new ListArtifactSubscriptionRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactSubscriptionRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactSubscriptionRuleResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accelerate")
        private Boolean accelerate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("Override")
        private Boolean override;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private java.util.List<String> platform;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
        private String sourceNamespaceName;

        @com.aliyun.core.annotation.NameInMap("SourceProvider")
        private String sourceProvider;

        @com.aliyun.core.annotation.NameInMap("SourceRepoName")
        private String sourceRepoName;

        @com.aliyun.core.annotation.NameInMap("TagCount")
        private Long tagCount;

        @com.aliyun.core.annotation.NameInMap("TagRegexp")
        private String tagRegexp;

        private Rules(Builder builder) {
            this.accelerate = builder.accelerate;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.namespaceName = builder.namespaceName;
            this.override = builder.override;
            this.platform = builder.platform;
            this.repoName = builder.repoName;
            this.ruleId = builder.ruleId;
            this.sourceNamespaceName = builder.sourceNamespaceName;
            this.sourceProvider = builder.sourceProvider;
            this.sourceRepoName = builder.sourceRepoName;
            this.tagCount = builder.tagCount;
            this.tagRegexp = builder.tagRegexp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return accelerate
         */
        public Boolean getAccelerate() {
            return this.accelerate;
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
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return override
         */
        public Boolean getOverride() {
            return this.override;
        }

        /**
         * @return platform
         */
        public java.util.List<String> getPlatform() {
            return this.platform;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return sourceNamespaceName
         */
        public String getSourceNamespaceName() {
            return this.sourceNamespaceName;
        }

        /**
         * @return sourceProvider
         */
        public String getSourceProvider() {
            return this.sourceProvider;
        }

        /**
         * @return sourceRepoName
         */
        public String getSourceRepoName() {
            return this.sourceRepoName;
        }

        /**
         * @return tagCount
         */
        public Long getTagCount() {
            return this.tagCount;
        }

        /**
         * @return tagRegexp
         */
        public String getTagRegexp() {
            return this.tagRegexp;
        }

        public static final class Builder {
            private Boolean accelerate; 
            private Long createTime; 
            private String instanceId; 
            private Long modifiedTime; 
            private String namespaceName; 
            private Boolean override; 
            private java.util.List<String> platform; 
            private String repoName; 
            private String ruleId; 
            private String sourceNamespaceName; 
            private String sourceProvider; 
            private String sourceRepoName; 
            private Long tagCount; 
            private String tagRegexp; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.accelerate = model.accelerate;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.namespaceName = model.namespaceName;
                this.override = model.override;
                this.platform = model.platform;
                this.repoName = model.repoName;
                this.ruleId = model.ruleId;
                this.sourceNamespaceName = model.sourceNamespaceName;
                this.sourceProvider = model.sourceProvider;
                this.sourceRepoName = model.sourceRepoName;
                this.tagCount = model.tagCount;
                this.tagRegexp = model.tagRegexp;
            } 

            /**
             * <p>Indicates whether an acceleration link is enabled for image subscription. The subscription acceleration feature is in public preview. The feature is optimized based on scheduling policies and network links to accelerate image subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accelerate(Boolean accelerate) {
                this.accelerate = accelerate;
                return this;
            }

            /**
             * <p>The time when the subscription rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1638187989000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-brlg4cbj2yl****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the subscription rule was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1678341923385</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the source namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-ns</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>Indicates whether the original image is overwritten.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder override(Boolean override) {
                this.override = override;
                return this;
            }

            /**
             * <p>The operating system and architecture. If the source repository contains a multi-arch image, only the images with the specified operating system and architecture are subscribed to the destination repository of the Enterprise Edition instance.</p>
             */
            public Builder platform(java.util.List<String> platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The name of the source repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test-repo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>crasr-mdbpung4i1rm****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The source namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>library</p>
             */
            public Builder sourceNamespaceName(String sourceNamespaceName) {
                this.sourceNamespaceName = sourceNamespaceName;
                return this;
            }

            /**
             * <p>The source of the artifact.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DOCKER_HUB: Docker Hub</li>
             * <li>GCR: GCR</li>
             * <li>QUAY: Quay.io</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOCKER_HUB</p>
             */
            public Builder sourceProvider(String sourceProvider) {
                this.sourceProvider = sourceProvider;
                return this;
            }

            /**
             * <p>The source repository.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder sourceRepoName(String sourceRepoName) {
                this.sourceRepoName = sourceRepoName;
                return this;
            }

            /**
             * <p>The number of subscribed images.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagCount(Long tagCount) {
                this.tagCount = tagCount;
                return this;
            }

            /**
             * <p>The image tag in the subscription source repository. Regular expressions are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>release.*</p>
             */
            public Builder tagRegexp(String tagRegexp) {
                this.tagRegexp = tagRegexp;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
