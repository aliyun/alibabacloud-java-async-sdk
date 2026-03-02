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
 * {@link Pbc} extends {@link TeaModel}
 *
 * <p>Pbc</p>
 */
public class Pbc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("assetType")
    private String assetType;

    @com.aliyun.core.annotation.NameInMap("company")
    private String company;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("developerId")
    private String developerId;

    @com.aliyun.core.annotation.NameInMap("developerName")
    private String developerName;

    @com.aliyun.core.annotation.NameInMap("forkCount")
    private Integer forkCount;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("invorkCount")
    private Long invorkCount;

    @com.aliyun.core.annotation.NameInMap("isWatched")
    private Boolean isWatched;

    @com.aliyun.core.annotation.NameInMap("latestVersionId")
    private Long latestVersionId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("watchCount")
    private Long watchCount;

    private Pbc(Builder builder) {
        this.alias = builder.alias;
        this.assetType = builder.assetType;
        this.company = builder.company;
        this.companyId = builder.companyId;
        this.description = builder.description;
        this.developerId = builder.developerId;
        this.developerName = builder.developerName;
        this.forkCount = builder.forkCount;
        this.id = builder.id;
        this.industry = builder.industry;
        this.invorkCount = builder.invorkCount;
        this.isWatched = builder.isWatched;
        this.latestVersionId = builder.latestVersionId;
        this.marketId = builder.marketId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.watchCount = builder.watchCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Pbc create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return developerId
     */
    public String getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return developerName
     */
    public String getDeveloperName() {
        return this.developerName;
    }

    /**
     * @return forkCount
     */
    public Integer getForkCount() {
        return this.forkCount;
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
     * @return invorkCount
     */
    public Long getInvorkCount() {
        return this.invorkCount;
    }

    /**
     * @return isWatched
     */
    public Boolean getIsWatched() {
        return this.isWatched;
    }

    /**
     * @return latestVersionId
     */
    public Long getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return watchCount
     */
    public Long getWatchCount() {
        return this.watchCount;
    }

    public static final class Builder {
        private String alias; 
        private String assetType; 
        private String company; 
        private Long companyId; 
        private String description; 
        private String developerId; 
        private String developerName; 
        private Integer forkCount; 
        private Long id; 
        private String industry; 
        private Long invorkCount; 
        private Boolean isWatched; 
        private Long latestVersionId; 
        private Long marketId; 
        private String name; 
        private String requestId; 
        private String type; 
        private Long watchCount; 

        private Builder() {
        } 

        private Builder(Pbc model) {
            this.alias = model.alias;
            this.assetType = model.assetType;
            this.company = model.company;
            this.companyId = model.companyId;
            this.description = model.description;
            this.developerId = model.developerId;
            this.developerName = model.developerName;
            this.forkCount = model.forkCount;
            this.id = model.id;
            this.industry = model.industry;
            this.invorkCount = model.invorkCount;
            this.isWatched = model.isWatched;
            this.latestVersionId = model.latestVersionId;
            this.marketId = model.marketId;
            this.name = model.name;
            this.requestId = model.requestId;
            this.type = model.type;
            this.watchCount = model.watchCount;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
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
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * developerId.
         */
        public Builder developerId(String developerId) {
            this.developerId = developerId;
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
         * forkCount.
         */
        public Builder forkCount(Integer forkCount) {
            this.forkCount = forkCount;
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
         * invorkCount.
         */
        public Builder invorkCount(Long invorkCount) {
            this.invorkCount = invorkCount;
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
         * latestVersionId.
         */
        public Builder latestVersionId(Long latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * watchCount.
         */
        public Builder watchCount(Long watchCount) {
            this.watchCount = watchCount;
            return this;
        }

        public Pbc build() {
            return new Pbc(this);
        } 

    } 

}
