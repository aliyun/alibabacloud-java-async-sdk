// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link WebhookCodeContext} extends {@link TeaModel}
 *
 * <p>WebhookCodeContext</p>
 */
public class WebhookCodeContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("branch")
    private String branch;

    @com.aliyun.core.annotation.NameInMap("commitID")
    private String commitID;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("prType")
    private String prType;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    private String repoUrl;

    @com.aliyun.core.annotation.NameInMap("sourceBranch")
    private String sourceBranch;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("targetBranch")
    private String targetBranch;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private WebhookCodeContext(Builder builder) {
        this.branch = builder.branch;
        this.commitID = builder.commitID;
        this.description = builder.description;
        this.eventType = builder.eventType;
        this.message = builder.message;
        this.prType = builder.prType;
        this.repoUrl = builder.repoUrl;
        this.sourceBranch = builder.sourceBranch;
        this.tag = builder.tag;
        this.targetBranch = builder.targetBranch;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebhookCodeContext create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return commitID
     */
    public String getCommitID() {
        return this.commitID;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return prType
     */
    public String getPrType() {
        return this.prType;
    }

    /**
     * @return repoUrl
     */
    public String getRepoUrl() {
        return this.repoUrl;
    }

    /**
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return targetBranch
     */
    public String getTargetBranch() {
        return this.targetBranch;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String branch; 
        private String commitID; 
        private String description; 
        private String eventType; 
        private String message; 
        private String prType; 
        private String repoUrl; 
        private String sourceBranch; 
        private String tag; 
        private String targetBranch; 
        private String title; 

        private Builder() {
        } 

        private Builder(WebhookCodeContext model) {
            this.branch = model.branch;
            this.commitID = model.commitID;
            this.description = model.description;
            this.eventType = model.eventType;
            this.message = model.message;
            this.prType = model.prType;
            this.repoUrl = model.repoUrl;
            this.sourceBranch = model.sourceBranch;
            this.tag = model.tag;
            this.targetBranch = model.targetBranch;
            this.title = model.title;
        } 

        /**
         * branch.
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * commitID.
         */
        public Builder commitID(String commitID) {
            this.commitID = commitID;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * eventType.
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * prType.
         */
        public Builder prType(String prType) {
            this.prType = prType;
            return this;
        }

        /**
         * repoUrl.
         */
        public Builder repoUrl(String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        /**
         * sourceBranch.
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * targetBranch.
         */
        public Builder targetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public WebhookCodeContext build() {
            return new WebhookCodeContext(this);
        } 

    } 

}
