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
 * {@link LibraryReview} extends {@link TeaModel}
 *
 * <p>LibraryReview</p>
 */
public class LibraryReview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.NameInMap("artificatId")
    private String artificatId;

    @com.aliyun.core.annotation.NameInMap("developerName")
    private String developerName;

    @com.aliyun.core.annotation.NameInMap("feedbackLibraryInstruction")
    private String feedbackLibraryInstruction;

    @com.aliyun.core.annotation.NameInMap("feedbackLibrarySchema")
    private String feedbackLibrarySchema;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("libraryName")
    private String libraryName;

    @com.aliyun.core.annotation.NameInMap("libraryUrl")
    private String libraryUrl;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private String marketId;

    @com.aliyun.core.annotation.NameInMap("marketName")
    private String marketName;

    @com.aliyun.core.annotation.NameInMap("remainTime")
    private String remainTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    private String reviewerId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private LibraryReview(Builder builder) {
        this.applicant = builder.applicant;
        this.artificatId = builder.artificatId;
        this.developerName = builder.developerName;
        this.feedbackLibraryInstruction = builder.feedbackLibraryInstruction;
        this.feedbackLibrarySchema = builder.feedbackLibrarySchema;
        this.gmtCreate = builder.gmtCreate;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.libraryName = builder.libraryName;
        this.libraryUrl = builder.libraryUrl;
        this.marketId = builder.marketId;
        this.marketName = builder.marketName;
        this.remainTime = builder.remainTime;
        this.requestId = builder.requestId;
        this.reviewerId = builder.reviewerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryReview create() {
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
     * @return artificatId
     */
    public String getArtificatId() {
        return this.artificatId;
    }

    /**
     * @return developerName
     */
    public String getDeveloperName() {
        return this.developerName;
    }

    /**
     * @return feedbackLibraryInstruction
     */
    public String getFeedbackLibraryInstruction() {
        return this.feedbackLibraryInstruction;
    }

    /**
     * @return feedbackLibrarySchema
     */
    public String getFeedbackLibrarySchema() {
        return this.feedbackLibrarySchema;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return libraryName
     */
    public String getLibraryName() {
        return this.libraryName;
    }

    /**
     * @return libraryUrl
     */
    public String getLibraryUrl() {
        return this.libraryUrl;
    }

    /**
     * @return marketId
     */
    public String getMarketId() {
        return this.marketId;
    }

    /**
     * @return marketName
     */
    public String getMarketName() {
        return this.marketName;
    }

    /**
     * @return remainTime
     */
    public String getRemainTime() {
        return this.remainTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String applicant; 
        private String artificatId; 
        private String developerName; 
        private String feedbackLibraryInstruction; 
        private String feedbackLibrarySchema; 
        private String gmtCreate; 
        private String groupId; 
        private Long id; 
        private String libraryName; 
        private String libraryUrl; 
        private String marketId; 
        private String marketName; 
        private String remainTime; 
        private String requestId; 
        private String reviewerId; 
        private String status; 

        private Builder() {
        } 

        private Builder(LibraryReview model) {
            this.applicant = model.applicant;
            this.artificatId = model.artificatId;
            this.developerName = model.developerName;
            this.feedbackLibraryInstruction = model.feedbackLibraryInstruction;
            this.feedbackLibrarySchema = model.feedbackLibrarySchema;
            this.gmtCreate = model.gmtCreate;
            this.groupId = model.groupId;
            this.id = model.id;
            this.libraryName = model.libraryName;
            this.libraryUrl = model.libraryUrl;
            this.marketId = model.marketId;
            this.marketName = model.marketName;
            this.remainTime = model.remainTime;
            this.requestId = model.requestId;
            this.reviewerId = model.reviewerId;
            this.status = model.status;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.applicant = applicant;
            return this;
        }

        /**
         * artificatId.
         */
        public Builder artificatId(String artificatId) {
            this.artificatId = artificatId;
            return this;
        }

        /**
         * developerName.
         */
        public Builder developerName(String developerName) {
            this.developerName = developerName;
            return this;
        }

        /**
         * feedbackLibraryInstruction.
         */
        public Builder feedbackLibraryInstruction(String feedbackLibraryInstruction) {
            this.feedbackLibraryInstruction = feedbackLibraryInstruction;
            return this;
        }

        /**
         * feedbackLibrarySchema.
         */
        public Builder feedbackLibrarySchema(String feedbackLibrarySchema) {
            this.feedbackLibrarySchema = feedbackLibrarySchema;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
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
         * libraryName.
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /**
         * libraryUrl.
         */
        public Builder libraryUrl(String libraryUrl) {
            this.libraryUrl = libraryUrl;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(String marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * marketName.
         */
        public Builder marketName(String marketName) {
            this.marketName = marketName;
            return this;
        }

        /**
         * remainTime.
         */
        public Builder remainTime(String remainTime) {
            this.remainTime = remainTime;
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

        public LibraryReview build() {
            return new LibraryReview(this);
        } 

    } 

}
