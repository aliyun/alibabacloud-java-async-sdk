// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateVulScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVulScanTaskRequest</p>
 */
public class CreateVulScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskDescription")
    private String taskDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private CreateVulScanTaskRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.matchMode = builder.matchMode;
        this.taskDescription = builder.taskDescription;
        this.taskName = builder.taskName;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVulScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<CreateVulScanTaskRequest, Builder> {
        private Long endTimestamp; 
        private String matchMode; 
        private String taskDescription; 
        private String taskName; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateVulScanTaskRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.matchMode = request.matchMode;
            this.taskDescription = request.taskDescription;
            this.taskName = request.taskName;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The task expiration time, in seconds-level UNIX timestamp. After this time is reached, endpoints no longer pull and execute this task, and incomplete scans are not continued.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putBodyParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>The matching mode for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Takes effect only for users in specified user groups. In this case, UserGroupIds is required.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Execute a vulnerability scanning on R&amp;D department endpoints</p>
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("TaskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        /**
         * <p>The task name. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department Vulnerability Scanning</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The collection of user group IDs for which the task takes effect. This parameter is required when MatchMode is set to UserGroupNormal and cannot be specified when MatchMode is set to UserGroupAll. The collection must contain at least 1 and at most 100 entries. Duplicate values are not allowed.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of exempt usernames. Users in this list are excluded from this scan. The list can contain up to 1000 entries. Duplicate values are not allowed.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateVulScanTaskRequest build() {
            return new CreateVulScanTaskRequest(this);
        } 

    } 

}
