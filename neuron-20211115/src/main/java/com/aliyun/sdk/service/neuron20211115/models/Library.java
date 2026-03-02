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
 * {@link Library} extends {@link TeaModel}
 *
 * <p>Library</p>
 */
public class Library extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("assetType")
    private String assetType;

    @com.aliyun.core.annotation.NameInMap("company")
    private String company;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("dependCount")
    private Integer dependCount;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("isWatched")
    private Boolean isWatched;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerName")
    private String providerName;

    @com.aliyun.core.annotation.NameInMap("repoUrl")
    private String repoUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("reviewId")
    private Long reviewId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("stepStatus")
    private String stepStatus;

    @com.aliyun.core.annotation.NameInMap("watchCount")
    private Integer watchCount;

    private Library(Builder builder) {
        this.artifactId = builder.artifactId;
        this.assetType = builder.assetType;
        this.company = builder.company;
        this.companyId = builder.companyId;
        this.dependCount = builder.dependCount;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.industry = builder.industry;
        this.isWatched = builder.isWatched;
        this.name = builder.name;
        this.provider = builder.provider;
        this.providerName = builder.providerName;
        this.repoUrl = builder.repoUrl;
        this.requestId = builder.requestId;
        this.reviewId = builder.reviewId;
        this.status = builder.status;
        this.stepStatus = builder.stepStatus;
        this.watchCount = builder.watchCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Library create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return dependCount
     */
    public Integer getDependCount() {
        return this.dependCount;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return isWatched
     */
    public Boolean getIsWatched() {
        return this.isWatched;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return repoUrl
     */
    public String getRepoUrl() {
        return this.repoUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reviewId
     */
    public Long getReviewId() {
        return this.reviewId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stepStatus
     */
    public String getStepStatus() {
        return this.stepStatus;
    }

    /**
     * @return watchCount
     */
    public Integer getWatchCount() {
        return this.watchCount;
    }

    public static final class Builder {
        private String artifactId; 
        private String assetType; 
        private String company; 
        private Long companyId; 
        private Integer dependCount; 
        private String description; 
        private String groupId; 
        private Long id; 
        private String industry; 
        private Boolean isWatched; 
        private String name; 
        private String provider; 
        private String providerName; 
        private String repoUrl; 
        private String requestId; 
        private Long reviewId; 
        private String status; 
        private String stepStatus; 
        private Integer watchCount; 

        private Builder() {
        } 

        private Builder(Library model) {
            this.artifactId = model.artifactId;
            this.assetType = model.assetType;
            this.company = model.company;
            this.companyId = model.companyId;
            this.dependCount = model.dependCount;
            this.description = model.description;
            this.groupId = model.groupId;
            this.id = model.id;
            this.industry = model.industry;
            this.isWatched = model.isWatched;
            this.name = model.name;
            this.provider = model.provider;
            this.providerName = model.providerName;
            this.repoUrl = model.repoUrl;
            this.requestId = model.requestId;
            this.reviewId = model.reviewId;
            this.status = model.status;
            this.stepStatus = model.stepStatus;
            this.watchCount = model.watchCount;
        } 

        /**
         * artifactId.
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * assetType.
         */
        public Builder assetType(String assetType) {
            this.assetType = assetType;
            return this;
        }

        /**
         * company.
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * dependCount.
         */
        public Builder dependCount(Integer dependCount) {
            this.dependCount = dependCount;
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
         * industry.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * isWatched.
         */
        public Builder isWatched(Boolean isWatched) {
            this.isWatched = isWatched;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * providerName.
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * reviewId.
         */
        public Builder reviewId(Long reviewId) {
            this.reviewId = reviewId;
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
         * stepStatus.
         */
        public Builder stepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }

        /**
         * watchCount.
         */
        public Builder watchCount(Integer watchCount) {
            this.watchCount = watchCount;
            return this;
        }

        public Library build() {
            return new Library(this);
        } 

    } 

}
