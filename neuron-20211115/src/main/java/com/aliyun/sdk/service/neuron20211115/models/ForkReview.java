// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ForkReview} extends {@link TeaModel}
 *
 * <p>ForkReview</p>
 */
public class ForkReview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.NameInMap("forkId")
    private Long forkId;

    @com.aliyun.core.annotation.NameInMap("gitGroup")
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("repoUrls")
    private java.util.List<String> repoUrls;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    private String reviewerId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private ForkReview(Builder builder) {
        this.applicant = builder.applicant;
        this.forkId = builder.forkId;
        this.gitGroup = builder.gitGroup;
        this.id = builder.id;
        this.pbcName = builder.pbcName;
        this.repoUrls = builder.repoUrls;
        this.requestId = builder.requestId;
        this.reviewer = builder.reviewer;
        this.reviewerId = builder.reviewerId;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForkReview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicant
     */
    public String getApplicant() {
        return this.applicant;
    }

    /**
     * @return forkId
     */
    public Long getForkId() {
        return this.forkId;
    }

    /**
     * @return gitGroup
     */
    public String getGitGroup() {
        return this.gitGroup;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return repoUrls
     */
    public java.util.List<String> getRepoUrls() {
        return this.repoUrls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    /**
     * @return reviewerId
     */
    public String getReviewerId() {
        return this.reviewerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String applicant; 
        private Long forkId; 
        private String gitGroup; 
        private Long id; 
        private String pbcName; 
        private java.util.List<String> repoUrls; 
        private String requestId; 
        private String reviewer; 
        private String reviewerId; 
        private String status; 
        private String usage; 

        private Builder() {
        } 

        private Builder(ForkReview model) {
            this.applicant = model.applicant;
            this.forkId = model.forkId;
            this.gitGroup = model.gitGroup;
            this.id = model.id;
            this.pbcName = model.pbcName;
            this.repoUrls = model.repoUrls;
            this.requestId = model.requestId;
            this.reviewer = model.reviewer;
            this.reviewerId = model.reviewerId;
            this.status = model.status;
            this.usage = model.usage;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.applicant = applicant;
            return this;
        }

        /**
         * forkId.
         */
        public Builder forkId(Long forkId) {
            this.forkId = forkId;
            return this;
        }

        /**
         * gitGroup.
         */
        public Builder gitGroup(String gitGroup) {
            this.gitGroup = gitGroup;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * repoUrls.
         */
        public Builder repoUrls(java.util.List<String> repoUrls) {
            this.repoUrls = repoUrls;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * reviewer.
         */
        public Builder reviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        /**
         * reviewerId.
         */
        public Builder reviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public ForkReview build() {
            return new ForkReview(this);
        } 

    } 

}
