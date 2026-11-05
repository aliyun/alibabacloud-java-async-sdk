// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ObserveGroupDiscoverRulesPreview} extends {@link TeaModel}
 *
 * <p>ObserveGroupDiscoverRulesPreview</p>
 */
public class ObserveGroupDiscoverRulesPreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogRevision")
    private String catalogRevision;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("entitySummaries")
    private java.util.List<ObserveGroupEntitySummary> entitySummaries;

    @com.aliyun.core.annotation.NameInMap("filteredCount")
    private Integer filteredCount;

    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<ObserveGroupInstance> instances;

    @com.aliyun.core.annotation.NameInMap("mainCount")
    private Long mainCount;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("relatedCount")
    private Long relatedCount;

    @com.aliyun.core.annotation.NameInMap("ruleCounts")
    private java.util.List<ObserveGroupRuleCount> ruleCounts;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ObserveGroupDiscoverRulesPreview(Builder builder) {
        this.catalogRevision = builder.catalogRevision;
        this.count = builder.count;
        this.entitySummaries = builder.entitySummaries;
        this.filteredCount = builder.filteredCount;
        this.instances = builder.instances;
        this.mainCount = builder.mainCount;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.relatedCount = builder.relatedCount;
        this.ruleCounts = builder.ruleCounts;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupDiscoverRulesPreview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogRevision
     */
    public String getCatalogRevision() {
        return this.catalogRevision;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return entitySummaries
     */
    public java.util.List<ObserveGroupEntitySummary> getEntitySummaries() {
        return this.entitySummaries;
    }

    /**
     * @return filteredCount
     */
    public Integer getFilteredCount() {
        return this.filteredCount;
    }

    /**
     * @return instances
     */
    public java.util.List<ObserveGroupInstance> getInstances() {
        return this.instances;
    }

    /**
     * @return mainCount
     */
    public Long getMainCount() {
        return this.mainCount;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return relatedCount
     */
    public Long getRelatedCount() {
        return this.relatedCount;
    }

    /**
     * @return ruleCounts
     */
    public java.util.List<ObserveGroupRuleCount> getRuleCounts() {
        return this.ruleCounts;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String catalogRevision; 
        private Integer count; 
        private java.util.List<ObserveGroupEntitySummary> entitySummaries; 
        private Integer filteredCount; 
        private java.util.List<ObserveGroupInstance> instances; 
        private Long mainCount; 
        private Integer maxResults; 
        private String nextToken; 
        private Long relatedCount; 
        private java.util.List<ObserveGroupRuleCount> ruleCounts; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ObserveGroupDiscoverRulesPreview model) {
            this.catalogRevision = model.catalogRevision;
            this.count = model.count;
            this.entitySummaries = model.entitySummaries;
            this.filteredCount = model.filteredCount;
            this.instances = model.instances;
            this.mainCount = model.mainCount;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.relatedCount = model.relatedCount;
            this.ruleCounts = model.ruleCounts;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The global association catalog version used for this preview.</p>
         * 
         * <strong>example:</strong>
         * <p>03ac8b5b92cb9c2675119d64c31d2520c069647aa9b88979df1bb115472c02b4</p>
         */
        public Builder catalogRevision(String catalogRevision) {
            this.catalogRevision = catalogRevision;
            return this;
        }

        /**
         * <p>The number of entities returned on this page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The primary entities, associated sub-entities, and total count by entity type.</p>
         */
        public Builder entitySummaries(java.util.List<ObserveGroupEntitySummary> entitySummaries) {
            this.entitySummaries = entitySummaries;
            return this;
        }

        /**
         * <p>The total count after filtering by entity role, type, and keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder filteredCount(Integer filteredCount) {
            this.filteredCount = filteredCount;
            return this;
        }

        /**
         * <p>The list of matched entities on this page.</p>
         */
        public Builder instances(java.util.List<ObserveGroupInstance> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The deduplicated count of primary entities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder mainCount(Long mainCount) {
            this.mainCount = mainCount;
            return this;
        }

        /**
         * <p>The maximum number of entities returned on this page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The next page token, which is empty if there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjEwLCJyZXF1ZXN0SGFzaCI6IjAzYWM4YjViOTJjYjljMjY3NTExOWQ2NGMzMWQyNTIwYzA2OTY0N2FhOWI4ODk3OWRmMWJiMTE1NDcyYzAyYjQifQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The deduplicated count of associated sub-entities.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder relatedCount(Long relatedCount) {
            this.relatedCount = relatedCount;
            return this;
        }

        /**
         * <p>The primary entities, associated sub-entities, and total count by rule.</p>
         */
        public Builder ruleCounts(java.util.List<ObserveGroupRuleCount> ruleCounts) {
            this.ruleCounts = ruleCounts;
            return this;
        }

        /**
         * <p>The deduplicated total count of entities.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ObserveGroupDiscoverRulesPreview build() {
            return new ObserveGroupDiscoverRulesPreview(this);
        } 

    } 

}
