// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactLifecycleRuleResponseBody</p>
 */
public class GetArtifactLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("Auto")
    private Boolean auto;

    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("EnableDeleteTag")
    private Boolean enableDeleteTag;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("NamespaceName")
    private String namespaceName;

    @NameInMap("NextTime")
    private Long nextTime;

    @NameInMap("RepoName")
    private String repoName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetentionTagCount")
    private Long retentionTagCount;

    @NameInMap("RuleId")
    private String ruleId;

    @NameInMap("ScheduleTime")
    private String scheduleTime;

    @NameInMap("Scope")
    private String scope;

    @NameInMap("TagRegexp")
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
        private String repoName; 
        private String requestId; 
        private Long retentionTagCount; 
        private String ruleId; 
        private String scheduleTime; 
        private String scope; 
        private String tagRegexp; 

        /**
         * Auto.
         */
        public Builder auto(Boolean auto) {
            this.auto = auto;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EnableDeleteTag.
         */
        public Builder enableDeleteTag(Boolean enableDeleteTag) {
            this.enableDeleteTag = enableDeleteTag;
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
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * NextTime.
         */
        public Builder nextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
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
         * RetentionTagCount.
         */
        public Builder retentionTagCount(Long retentionTagCount) {
            this.retentionTagCount = retentionTagCount;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * TagRegexp.
         */
        public Builder tagRegexp(String tagRegexp) {
            this.tagRegexp = tagRegexp;
            return this;
        }

        public GetArtifactLifecycleRuleResponseBody build() {
            return new GetArtifactLifecycleRuleResponseBody(this);
        } 

    } 

}
