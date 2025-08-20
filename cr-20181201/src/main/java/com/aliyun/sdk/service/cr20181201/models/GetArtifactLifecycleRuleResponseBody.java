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
 * {@link GetArtifactLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactLifecycleRuleResponseBody</p>
 */
public class GetArtifactLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Auto")
    private Boolean auto;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("EnableDeleteTag")
    private Boolean enableDeleteTag;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.NameInMap("NextTime")
    private Long nextTime;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetentionTagCount")
    private Long retentionTagCount;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    private String scheduleTime;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("TagRegexp")
    private String tagRegexp;

    private GetArtifactLifecycleRuleResponseBody(Builder builder) {
        this.auto = builder.auto;
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.enableDeleteTag = builder.enableDeleteTag;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.namespaceName = builder.namespaceName;
        this.nextTime = builder.nextTime;
        this.policies = builder.policies;
        this.repoName = builder.repoName;
        this.requestId = builder.requestId;
        this.retentionTagCount = builder.retentionTagCount;
        this.ruleId = builder.ruleId;
        this.scheduleTime = builder.scheduleTime;
        this.scope = builder.scope;
        this.tagRegexp = builder.tagRegexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactLifecycleRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auto
     */
    public Boolean getAuto() {
        return this.auto;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return enableDeleteTag
     */
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
     * @return nextTime
     */
    public Long getNextTime() {
        return this.nextTime;
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retentionTagCount
     */
    public Long getRetentionTagCount() {
        return this.retentionTagCount;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tagRegexp
     */
    public String getTagRegexp() {
        return this.tagRegexp;
    }

    public static final class Builder {
        private Boolean auto; 
        private String code; 
        private Long createTime; 
        private Boolean enableDeleteTag; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String namespaceName; 
        private Long nextTime; 
        private java.util.List<Policies> policies; 
        private String repoName; 
        private String requestId; 
        private Long retentionTagCount; 
        private String ruleId; 
        private String scheduleTime; 
        private String scope; 
        private String tagRegexp; 

        private Builder() {
        } 

        private Builder(GetArtifactLifecycleRuleResponseBody model) {
            this.auto = model.auto;
            this.code = model.code;
            this.createTime = model.createTime;
            this.enableDeleteTag = model.enableDeleteTag;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.namespaceName = model.namespaceName;
            this.nextTime = model.nextTime;
            this.policies = model.policies;
            this.repoName = model.repoName;
            this.requestId = model.requestId;
            this.retentionTagCount = model.retentionTagCount;
            this.ruleId = model.ruleId;
            this.scheduleTime = model.scheduleTime;
            this.scope = model.scope;
            this.tagRegexp = model.tagRegexp;
        } 

        /**
         * <p>Indicates whether the lifecycle management rule is automatically executed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder auto(Boolean auto) {
            this.auto = auto;
            return this;
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
         * <p>The time when the lifecycle management rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926439000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether lifecycle management is enabled for the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDeleteTag(Boolean enableDeleteTag) {
            this.enableDeleteTag = enableDeleteTag;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
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
         * <p>The time when the lifecycle management rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1638259914000</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-namespace</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The time when the lifecycle management rule is next executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1701878400000</p>
         */
        public Builder nextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }

        /**
         * Policies.
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>724402D0-75CD-4794-BC20-7D37208****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of retained images.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionTagCount(Long retentionTagCount) {
            this.retentionTagCount = retentionTagCount;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cralr-a18bkiajy8****</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The execution cycle of the lifecycle management rule.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * <p>The deletion scope of artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The regular expression that indicates which image tags are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>.*-alpine</p>
         */
        public Builder tagRegexp(String tagRegexp) {
            this.tagRegexp = tagRegexp;
            return this;
        }

        public GetArtifactLifecycleRuleResponseBody build() {
            return new GetArtifactLifecycleRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArtifactLifecycleRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactLifecycleRuleResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastPullOlderThanDays")
        private Integer lastPullOlderThanDays;

        @com.aliyun.core.annotation.NameInMap("LastPushOlderThanDays")
        private Integer lastPushOlderThanDays;

        @com.aliyun.core.annotation.NameInMap("LatestTagCount")
        private Integer latestTagCount;

        private Condition(Builder builder) {
            this.lastPullOlderThanDays = builder.lastPullOlderThanDays;
            this.lastPushOlderThanDays = builder.lastPushOlderThanDays;
            this.latestTagCount = builder.latestTagCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return lastPullOlderThanDays
         */
        public Integer getLastPullOlderThanDays() {
            return this.lastPullOlderThanDays;
        }

        /**
         * @return lastPushOlderThanDays
         */
        public Integer getLastPushOlderThanDays() {
            return this.lastPushOlderThanDays;
        }

        /**
         * @return latestTagCount
         */
        public Integer getLatestTagCount() {
            return this.latestTagCount;
        }

        public static final class Builder {
            private Integer lastPullOlderThanDays; 
            private Integer lastPushOlderThanDays; 
            private Integer latestTagCount; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.lastPullOlderThanDays = model.lastPullOlderThanDays;
                this.lastPushOlderThanDays = model.lastPushOlderThanDays;
                this.latestTagCount = model.latestTagCount;
            } 

            /**
             * LastPullOlderThanDays.
             */
            public Builder lastPullOlderThanDays(Integer lastPullOlderThanDays) {
                this.lastPullOlderThanDays = lastPullOlderThanDays;
                return this;
            }

            /**
             * LastPushOlderThanDays.
             */
            public Builder lastPushOlderThanDays(Integer lastPushOlderThanDays) {
                this.lastPushOlderThanDays = lastPushOlderThanDays;
                return this;
            }

            /**
             * LatestTagCount.
             */
            public Builder latestTagCount(Integer latestTagCount) {
                this.latestTagCount = latestTagCount;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetArtifactLifecycleRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactLifecycleRuleResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagWildcard")
        private String tagWildcard;

        private Filter(Builder builder) {
            this.tagWildcard = builder.tagWildcard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return tagWildcard
         */
        public String getTagWildcard() {
            return this.tagWildcard;
        }

        public static final class Builder {
            private String tagWildcard; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.tagWildcard = model.tagWildcard;
            } 

            /**
             * TagWildcard.
             */
            public Builder tagWildcard(String tagWildcard) {
                this.tagWildcard = tagWildcard;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetArtifactLifecycleRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactLifecycleRuleResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Policies(Builder builder) {
            this.condition = builder.condition;
            this.filter = builder.filter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public Condition getCondition() {
            return this.condition;
        }

        /**
         * @return filter
         */
        public Filter getFilter() {
            return this.filter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Condition condition; 
            private Filter filter; 
            private String type; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.condition = model.condition;
                this.filter = model.filter;
                this.type = model.type;
            } 

            /**
             * Condition.
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Filter.
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
