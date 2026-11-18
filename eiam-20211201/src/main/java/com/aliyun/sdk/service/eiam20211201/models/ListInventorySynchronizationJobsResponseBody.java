// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInventorySynchronizationJobsResponseBody</p>
 */
public class ListInventorySynchronizationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InventorySynchronizationJobs")
    private java.util.List<InventorySynchronizationJobs> inventorySynchronizationJobs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInventorySynchronizationJobsResponseBody(Builder builder) {
        this.inventorySynchronizationJobs = builder.inventorySynchronizationJobs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInventorySynchronizationJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inventorySynchronizationJobs
     */
    public java.util.List<InventorySynchronizationJobs> getInventorySynchronizationJobs() {
        return this.inventorySynchronizationJobs;
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

    public static final class Builder {
        private java.util.List<InventorySynchronizationJobs> inventorySynchronizationJobs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInventorySynchronizationJobsResponseBody model) {
            this.inventorySynchronizationJobs = model.inventorySynchronizationJobs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The synchronization jobs.</p>
         */
        public Builder inventorySynchronizationJobs(java.util.List<InventorySynchronizationJobs> inventorySynchronizationJobs) {
            this.inventorySynchronizationJobs = inventorySynchronizationJobs;
            return this;
        }

        /**
         * <p>The maximum number of returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned by the current call for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInventorySynchronizationJobsResponseBody build() {
            return new ListInventorySynchronizationJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class Created extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Created(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Created create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Created model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Created build() {
                return new Created(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class Deleted extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Deleted(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deleted create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Deleted model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Deleted build() {
                return new Deleted(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class Same extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Same(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Same create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Same model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Same build() {
                return new Same(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class Updated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Updated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Updated create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Updated model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Updated build() {
                return new Updated(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AgentStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private Created created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Deleted deleted;

        @com.aliyun.core.annotation.NameInMap("Same")
        private Same same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private Updated updated;

        private AgentStatistics(Builder builder) {
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatistics create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Created getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public Deleted getDeleted() {
            return this.deleted;
        }

        /**
         * @return same
         */
        public Same getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public Updated getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Created created; 
            private Deleted deleted; 
            private Same same; 
            private Updated updated; 

            private Builder() {
            } 

            private Builder(AgentStatistics model) {
                this.created = model.created;
                this.deleted = model.deleted;
                this.same = model.same;
                this.updated = model.updated;
            } 

            /**
             * <p>The statistics on the creation results.</p>
             */
            public Builder created(Created created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The statistics on the deletion results.</p>
             */
            public Builder deleted(Deleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The statistics on the unchanged results.</p>
             */
            public Builder same(Same same) {
                this.same = same;
                return this;
            }

            /**
             * <p>The statistics on the update results.</p>
             */
            public Builder updated(Updated updated) {
                this.updated = updated;
                return this;
            }

            public AgentStatistics build() {
                return new AgentStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AssetStatisticsCreated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private AssetStatisticsCreated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetStatisticsCreated create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(AssetStatisticsCreated model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public AssetStatisticsCreated build() {
                return new AssetStatisticsCreated(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AssetStatisticsDeleted extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private AssetStatisticsDeleted(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetStatisticsDeleted create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(AssetStatisticsDeleted model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public AssetStatisticsDeleted build() {
                return new AssetStatisticsDeleted(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AssetStatisticsSame extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private AssetStatisticsSame(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetStatisticsSame create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(AssetStatisticsSame model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public AssetStatisticsSame build() {
                return new AssetStatisticsSame(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AssetStatisticsUpdated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private AssetStatisticsUpdated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetStatisticsUpdated create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return skipped
         */
        public Long getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Long getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long failed; 
            private Long skipped; 
            private Long success; 
            private Long total; 

            private Builder() {
            } 

            private Builder(AssetStatisticsUpdated model) {
                this.failed = model.failed;
                this.skipped = model.skipped;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of successful items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public AssetStatisticsUpdated build() {
                return new AssetStatisticsUpdated(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class AssetStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private AssetStatisticsCreated created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private AssetStatisticsDeleted deleted;

        @com.aliyun.core.annotation.NameInMap("Same")
        private AssetStatisticsSame same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private AssetStatisticsUpdated updated;

        private AssetStatistics(Builder builder) {
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetStatistics create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public AssetStatisticsCreated getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public AssetStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        /**
         * @return same
         */
        public AssetStatisticsSame getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public AssetStatisticsUpdated getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private AssetStatisticsCreated created; 
            private AssetStatisticsDeleted deleted; 
            private AssetStatisticsSame same; 
            private AssetStatisticsUpdated updated; 

            private Builder() {
            } 

            private Builder(AssetStatistics model) {
                this.created = model.created;
                this.deleted = model.deleted;
                this.same = model.same;
                this.updated = model.updated;
            } 

            /**
             * <p>The statistics on the creation results.</p>
             */
            public Builder created(AssetStatisticsCreated created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The statistics on the deletion results.</p>
             */
            public Builder deleted(AssetStatisticsDeleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The statistics on the unchanged results.</p>
             */
            public Builder same(AssetStatisticsSame same) {
                this.same = same;
                return this;
            }

            /**
             * <p>The statistics on the update results.</p>
             */
            public Builder updated(AssetStatisticsUpdated updated) {
                this.updated = updated;
                return this;
            }

            public AssetStatistics build() {
                return new AssetStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatistics")
        private AgentStatistics agentStatistics;

        @com.aliyun.core.annotation.NameInMap("AssetStatistics")
        private AssetStatistics assetStatistics;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private Result(Builder builder) {
            this.agentStatistics = builder.agentStatistics;
            this.assetStatistics = builder.assetStatistics;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentStatistics
         */
        public AgentStatistics getAgentStatistics() {
            return this.agentStatistics;
        }

        /**
         * @return assetStatistics
         */
        public AssetStatistics getAssetStatistics() {
            return this.assetStatistics;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private AgentStatistics agentStatistics; 
            private AssetStatistics assetStatistics; 
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.agentStatistics = model.agentStatistics;
                this.assetStatistics = model.assetStatistics;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>The statistics on the agent synchronization results.</p>
             */
            public Builder agentStatistics(AgentStatistics agentStatistics) {
                this.agentStatistics = agentStatistics;
                return this;
            }

            /**
             * <p>The statistics on the asset synchronization results.</p>
             */
            public Builder assetStatistics(AssetStatistics assetStatistics) {
                this.assetStatistics = assetStatistics;
                return this;
            }

            /**
             * <p>The error code of the synchronization result.</p>
             * 
             * <strong>example:</strong>
             * <p>No ErrorCode</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message of the synchronization result.</p>
             * 
             * <strong>example:</strong>
             * <p>No Error Message</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInventorySynchronizationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInventorySynchronizationJobsResponseBody</p>
     */
    public static class InventorySynchronizationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InventorySourceId")
        private String inventorySourceId;

        @com.aliyun.core.annotation.NameInMap("InventorySynchronizationJobId")
        private String inventorySynchronizationJobId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private InventorySynchronizationJobs(Builder builder) {
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.inventorySourceId = builder.inventorySourceId;
            this.inventorySynchronizationJobId = builder.inventorySynchronizationJobId;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InventorySynchronizationJobs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return inventorySourceId
         */
        public String getInventorySourceId() {
            return this.inventorySourceId;
        }

        /**
         * @return inventorySynchronizationJobId
         */
        public String getInventorySynchronizationJobId() {
            return this.inventorySynchronizationJobId;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String description; 
            private Long endTime; 
            private String inventorySourceId; 
            private String inventorySynchronizationJobId; 
            private Result result; 
            private Long startTime; 
            private String status; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(InventorySynchronizationJobs model) {
                this.description = model.description;
                this.endTime = model.endTime;
                this.inventorySourceId = model.inventorySourceId;
                this.inventorySynchronizationJobId = model.inventorySynchronizationJobId;
                this.result = model.result;
                this.startTime = model.startTime;
                this.status = model.status;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>The description of the synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>No Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time of the synchronization. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761533214</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IDs of the synchronization targets.</p>
             * 
             * <strong>example:</strong>
             * <p>src_xxxxx</p>
             */
            public Builder inventorySourceId(String inventorySourceId) {
                this.inventorySourceId = inventorySourceId;
                return this;
            }

            /**
             * <p>The ID of the synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>sync_xxxxxxx</p>
             */
            public Builder inventorySynchronizationJobId(String inventorySynchronizationJobId) {
                this.inventorySynchronizationJobId = inventorySynchronizationJobId;
                return this;
            }

            /**
             * <p>The task result of the synchronization node.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The start time of the synchronization. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761531256</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the synchronization job.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The trigger type of the synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public InventorySynchronizationJobs build() {
                return new InventorySynchronizationJobs(this);
            } 

        } 

    }
}
