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
 * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetInventorySynchronizationJobResponseBody</p>
 */
public class GetInventorySynchronizationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InventorySynchronizationJob")
    private InventorySynchronizationJob inventorySynchronizationJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInventorySynchronizationJobResponseBody(Builder builder) {
        this.inventorySynchronizationJob = builder.inventorySynchronizationJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventorySynchronizationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inventorySynchronizationJob
     */
    public InventorySynchronizationJob getInventorySynchronizationJob() {
        return this.inventorySynchronizationJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InventorySynchronizationJob inventorySynchronizationJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInventorySynchronizationJobResponseBody model) {
            this.inventorySynchronizationJob = model.inventorySynchronizationJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The inventory synchronization job.</p>
         */
        public Builder inventorySynchronizationJob(InventorySynchronizationJob inventorySynchronizationJob) {
            this.inventorySynchronizationJob = inventorySynchronizationJob;
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

        public GetInventorySynchronizationJobResponseBody build() {
            return new GetInventorySynchronizationJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The creation result statistics.</p>
             */
            public Builder created(Created created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The deletion result statistics.</p>
             */
            public Builder deleted(Deleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The unchanged result statistics.</p>
             */
            public Builder same(Same same) {
                this.same = same;
                return this;
            }

            /**
             * <p>The update result statistics.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The skipped count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The success count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total count.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The creation result statistics.</p>
             */
            public Builder created(AssetStatisticsCreated created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The deletion result statistics.</p>
             */
            public Builder deleted(AssetStatisticsDeleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The unchanged result statistics.</p>
             */
            public Builder same(AssetStatisticsSame same) {
                this.same = same;
                return this;
            }

            /**
             * <p>The update result statistics.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
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
             * <p>The agent synchronization result statistics.</p>
             */
            public Builder agentStatistics(AgentStatistics agentStatistics) {
                this.agentStatistics = agentStatistics;
                return this;
            }

            /**
             * <p>The asset synchronization result statistics.</p>
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
     * {@link GetInventorySynchronizationJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetInventorySynchronizationJobResponseBody</p>
     */
    public static class InventorySynchronizationJob extends TeaModel {
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

        private InventorySynchronizationJob(Builder builder) {
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

        public static InventorySynchronizationJob create() {
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

            private Builder(InventorySynchronizationJob model) {
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
             * <p>The synchronization job description.</p>
             * 
             * <strong>example:</strong>
             * <p>No Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The synchronization end time. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761531556</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The inventory source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src_xxxxxx</p>
             */
            public Builder inventorySourceId(String inventorySourceId) {
                this.inventorySourceId = inventorySourceId;
                return this;
            }

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>sync_xxxxxxxxx</p>
             */
            public Builder inventorySynchronizationJobId(String inventorySynchronizationJobId) {
                this.inventorySynchronizationJobId = inventorySynchronizationJobId;
                return this;
            }

            /**
             * <p>The synchronization node task result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The synchronization start time. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761531256</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The synchronization job status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The synchronization trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public InventorySynchronizationJob build() {
                return new InventorySynchronizationJob(this);
            } 

        } 

    }
}
