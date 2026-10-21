// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListNormalizationRuleCapacitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationRuleCapacitiesResponseBody</p>
 */
public class ListNormalizationRuleCapacitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationRuleCapacities")
    private java.util.List<NormalizationRuleCapacities> normalizationRuleCapacities;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListNormalizationRuleCapacitiesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationRuleCapacities = builder.normalizationRuleCapacities;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationRuleCapacitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return normalizationRuleCapacities
     */
    public java.util.List<NormalizationRuleCapacities> getNormalizationRuleCapacities() {
        return this.normalizationRuleCapacities;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationRuleCapacities> normalizationRuleCapacities; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListNormalizationRuleCapacitiesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationRuleCapacities = model.normalizationRuleCapacities;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of security capabilities associated with normalization rules.</p>
         */
        public Builder normalizationRuleCapacities(java.util.List<NormalizationRuleCapacities> normalizationRuleCapacities) {
            this.normalizationRuleCapacities = normalizationRuleCapacities;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListNormalizationRuleCapacitiesResponseBody build() {
            return new ListNormalizationRuleCapacitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationRuleCapacitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationRuleCapacitiesResponseBody</p>
     */
    public static class NormalizationRuleCapacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacities")
        private java.util.List<String> capacities;

        @com.aliyun.core.annotation.NameInMap("CapacityType")
        private String capacityType;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        private NormalizationRuleCapacities(Builder builder) {
            this.capacities = builder.capacities;
            this.capacityType = builder.capacityType;
            this.normalizationRuleId = builder.normalizationRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationRuleCapacities create() {
            return builder().build();
        }

        /**
         * @return capacities
         */
        public java.util.List<String> getCapacities() {
            return this.capacities;
        }

        /**
         * @return capacityType
         */
        public String getCapacityType() {
            return this.capacityType;
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public static final class Builder {
            private java.util.List<String> capacities; 
            private String capacityType; 
            private String normalizationRuleId; 

            private Builder() {
            } 

            private Builder(NormalizationRuleCapacities model) {
                this.capacities = model.capacities;
                this.capacityType = model.capacityType;
                this.normalizationRuleId = model.normalizationRuleId;
            } 

            /**
             * <p>The list of security capabilities.</p>
             */
            public Builder capacities(java.util.List<String> capacities) {
                this.capacities = capacities;
                return this;
            }

            /**
             * <p>The type of the security capability. Valid values:</p>
             * <ul>
             * <li>detection_preset_rule: predefined analysis rule.</li>
             * <li>detection_custom_rule: custom analysis rule.</li>
             * <li>incident_investigation: security incident handling.</li>
             * <li>soar_playbooks: predefined playbook.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>detection_preset_rule</p>
             */
            public Builder capacityType(String capacityType) {
                this.capacityType = capacityType;
                return this;
            }

            /**
             * <p>The normalization rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nr-z0b2ssjteut85uoh9nzp</p>
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            public NormalizationRuleCapacities build() {
                return new NormalizationRuleCapacities(this);
            } 

        } 

    }
}
