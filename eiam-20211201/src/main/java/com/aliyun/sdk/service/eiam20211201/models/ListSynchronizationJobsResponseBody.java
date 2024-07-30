// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSynchronizationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSynchronizationJobsResponseBody</p>
 */
public class ListSynchronizationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobs")
    private java.util.List < SynchronizationJobs> synchronizationJobs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSynchronizationJobsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.synchronizationJobs = builder.synchronizationJobs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSynchronizationJobsResponseBody create() {
        return builder().build();
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
     * @return synchronizationJobs
     */
    public java.util.List < SynchronizationJobs> getSynchronizationJobs() {
        return this.synchronizationJobs;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < SynchronizationJobs> synchronizationJobs; 
        private Long totalCount; 

        /**
         * 本次调用返回的查询凭证（Token）值，用于下一次翻页查询。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SynchronizationJobs.
         */
        public Builder synchronizationJobs(java.util.List < SynchronizationJobs> synchronizationJobs) {
            this.synchronizationJobs = synchronizationJobs;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSynchronizationJobsResponseBody build() {
            return new ListSynchronizationJobsResponseBody(this);
        } 

    } 

    public static class Binded extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Binded(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Binded create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Binded build() {
                return new Binded(this);
            } 

        } 

    }
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
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
    public static class Pushed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Pushed(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pushed create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Pushed build() {
                return new Pushed(this);
            } 

        } 

    }
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
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
    public static class GroupMemberStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Binded")
        private Binded binded;

        @com.aliyun.core.annotation.NameInMap("Created")
        private Created created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Deleted deleted;

        @com.aliyun.core.annotation.NameInMap("Pushed")
        private Pushed pushed;

        @com.aliyun.core.annotation.NameInMap("Same")
        private Same same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private Updated updated;

        private GroupMemberStatistics(Builder builder) {
            this.binded = builder.binded;
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.pushed = builder.pushed;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupMemberStatistics create() {
            return builder().build();
        }

        /**
         * @return binded
         */
        public Binded getBinded() {
            return this.binded;
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
         * @return pushed
         */
        public Pushed getPushed() {
            return this.pushed;
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
            private Binded binded; 
            private Created created; 
            private Deleted deleted; 
            private Pushed pushed; 
            private Same same; 
            private Updated updated; 

            /**
             * 绑定结果统计
             */
            public Builder binded(Binded binded) {
                this.binded = binded;
                return this;
            }

            /**
             * 创建结果统计
             */
            public Builder created(Created created) {
                this.created = created;
                return this;
            }

            /**
             * 删除结果统计
             */
            public Builder deleted(Deleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * 推送结果统计
             */
            public Builder pushed(Pushed pushed) {
                this.pushed = pushed;
                return this;
            }

            /**
             * 相同结果统计
             */
            public Builder same(Same same) {
                this.same = same;
                return this;
            }

            /**
             * 更新结果统计
             */
            public Builder updated(Updated updated) {
                this.updated = updated;
                return this;
            }

            public GroupMemberStatistics build() {
                return new GroupMemberStatistics(this);
            } 

        } 

    }
    public static class GroupStatisticsBinded extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsBinded(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsBinded create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsBinded build() {
                return new GroupStatisticsBinded(this);
            } 

        } 

    }
    public static class GroupStatisticsCreated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsCreated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsCreated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsCreated build() {
                return new GroupStatisticsCreated(this);
            } 

        } 

    }
    public static class GroupStatisticsDeleted extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsDeleted(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsDeleted create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsDeleted build() {
                return new GroupStatisticsDeleted(this);
            } 

        } 

    }
    public static class GroupStatisticsPushed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsPushed(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsPushed create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsPushed build() {
                return new GroupStatisticsPushed(this);
            } 

        } 

    }
    public static class GroupStatisticsSame extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsSame(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsSame create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsSame build() {
                return new GroupStatisticsSame(this);
            } 

        } 

    }
    public static class GroupStatisticsUpdated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private GroupStatisticsUpdated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatisticsUpdated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public GroupStatisticsUpdated build() {
                return new GroupStatisticsUpdated(this);
            } 

        } 

    }
    public static class GroupStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Binded")
        private GroupStatisticsBinded binded;

        @com.aliyun.core.annotation.NameInMap("Created")
        private GroupStatisticsCreated created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private GroupStatisticsDeleted deleted;

        @com.aliyun.core.annotation.NameInMap("Pushed")
        private GroupStatisticsPushed pushed;

        @com.aliyun.core.annotation.NameInMap("Same")
        private GroupStatisticsSame same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private GroupStatisticsUpdated updated;

        private GroupStatistics(Builder builder) {
            this.binded = builder.binded;
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.pushed = builder.pushed;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupStatistics create() {
            return builder().build();
        }

        /**
         * @return binded
         */
        public GroupStatisticsBinded getBinded() {
            return this.binded;
        }

        /**
         * @return created
         */
        public GroupStatisticsCreated getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public GroupStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        /**
         * @return pushed
         */
        public GroupStatisticsPushed getPushed() {
            return this.pushed;
        }

        /**
         * @return same
         */
        public GroupStatisticsSame getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public GroupStatisticsUpdated getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private GroupStatisticsBinded binded; 
            private GroupStatisticsCreated created; 
            private GroupStatisticsDeleted deleted; 
            private GroupStatisticsPushed pushed; 
            private GroupStatisticsSame same; 
            private GroupStatisticsUpdated updated; 

            /**
             * 绑定结果统计
             */
            public Builder binded(GroupStatisticsBinded binded) {
                this.binded = binded;
                return this;
            }

            /**
             * 创建结果统计
             */
            public Builder created(GroupStatisticsCreated created) {
                this.created = created;
                return this;
            }

            /**
             * 删除结果统计
             */
            public Builder deleted(GroupStatisticsDeleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * 推送结果统计
             */
            public Builder pushed(GroupStatisticsPushed pushed) {
                this.pushed = pushed;
                return this;
            }

            /**
             * 相同结果统计
             */
            public Builder same(GroupStatisticsSame same) {
                this.same = same;
                return this;
            }

            /**
             * 更新结果统计
             */
            public Builder updated(GroupStatisticsUpdated updated) {
                this.updated = updated;
                return this;
            }

            public GroupStatistics build() {
                return new GroupStatistics(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsBinded extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsBinded(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsBinded create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsBinded build() {
                return new OrganizationalUnitStatisticsBinded(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsCreated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsCreated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsCreated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsCreated build() {
                return new OrganizationalUnitStatisticsCreated(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsDeleted extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsDeleted(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsDeleted create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsDeleted build() {
                return new OrganizationalUnitStatisticsDeleted(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsPushed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsPushed(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsPushed create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsPushed build() {
                return new OrganizationalUnitStatisticsPushed(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsSame extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsSame(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsSame create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsSame build() {
                return new OrganizationalUnitStatisticsSame(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatisticsUpdated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private OrganizationalUnitStatisticsUpdated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatisticsUpdated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public OrganizationalUnitStatisticsUpdated build() {
                return new OrganizationalUnitStatisticsUpdated(this);
            } 

        } 

    }
    public static class OrganizationalUnitStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Binded")
        private OrganizationalUnitStatisticsBinded binded;

        @com.aliyun.core.annotation.NameInMap("Created")
        private OrganizationalUnitStatisticsCreated created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private OrganizationalUnitStatisticsDeleted deleted;

        @com.aliyun.core.annotation.NameInMap("Pushed")
        private OrganizationalUnitStatisticsPushed pushed;

        @com.aliyun.core.annotation.NameInMap("Same")
        private OrganizationalUnitStatisticsSame same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private OrganizationalUnitStatisticsUpdated updated;

        private OrganizationalUnitStatistics(Builder builder) {
            this.binded = builder.binded;
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.pushed = builder.pushed;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnitStatistics create() {
            return builder().build();
        }

        /**
         * @return binded
         */
        public OrganizationalUnitStatisticsBinded getBinded() {
            return this.binded;
        }

        /**
         * @return created
         */
        public OrganizationalUnitStatisticsCreated getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public OrganizationalUnitStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        /**
         * @return pushed
         */
        public OrganizationalUnitStatisticsPushed getPushed() {
            return this.pushed;
        }

        /**
         * @return same
         */
        public OrganizationalUnitStatisticsSame getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public OrganizationalUnitStatisticsUpdated getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private OrganizationalUnitStatisticsBinded binded; 
            private OrganizationalUnitStatisticsCreated created; 
            private OrganizationalUnitStatisticsDeleted deleted; 
            private OrganizationalUnitStatisticsPushed pushed; 
            private OrganizationalUnitStatisticsSame same; 
            private OrganizationalUnitStatisticsUpdated updated; 

            /**
             * 绑定结果统计
             */
            public Builder binded(OrganizationalUnitStatisticsBinded binded) {
                this.binded = binded;
                return this;
            }

            /**
             * 创建结果统计
             */
            public Builder created(OrganizationalUnitStatisticsCreated created) {
                this.created = created;
                return this;
            }

            /**
             * 删除结果统计
             */
            public Builder deleted(OrganizationalUnitStatisticsDeleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * 推送结果统计
             */
            public Builder pushed(OrganizationalUnitStatisticsPushed pushed) {
                this.pushed = pushed;
                return this;
            }

            /**
             * 相同结果统计
             */
            public Builder same(OrganizationalUnitStatisticsSame same) {
                this.same = same;
                return this;
            }

            /**
             * 更新结果统计
             */
            public Builder updated(OrganizationalUnitStatisticsUpdated updated) {
                this.updated = updated;
                return this;
            }

            public OrganizationalUnitStatistics build() {
                return new OrganizationalUnitStatistics(this);
            } 

        } 

    }
    public static class UserStatisticsBinded extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsBinded(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsBinded create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsBinded build() {
                return new UserStatisticsBinded(this);
            } 

        } 

    }
    public static class UserStatisticsCreated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsCreated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsCreated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsCreated build() {
                return new UserStatisticsCreated(this);
            } 

        } 

    }
    public static class UserStatisticsDeleted extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsDeleted(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsDeleted create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsDeleted build() {
                return new UserStatisticsDeleted(this);
            } 

        } 

    }
    public static class UserStatisticsPushed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsPushed(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsPushed create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsPushed build() {
                return new UserStatisticsPushed(this);
            } 

        } 

    }
    public static class UserStatisticsSame extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsSame(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsSame create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsSame build() {
                return new UserStatisticsSame(this);
            } 

        } 

    }
    public static class UserStatisticsUpdated extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Long skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Long success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private UserStatisticsUpdated(Builder builder) {
            this.failed = builder.failed;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatisticsUpdated create() {
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

            /**
             * 失败数目
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * 跳过数目
             */
            public Builder skipped(Long skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 成功数目
             */
            public Builder success(Long success) {
                this.success = success;
                return this;
            }

            /**
             * 总共数目
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public UserStatisticsUpdated build() {
                return new UserStatisticsUpdated(this);
            } 

        } 

    }
    public static class UserStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Binded")
        private UserStatisticsBinded binded;

        @com.aliyun.core.annotation.NameInMap("Created")
        private UserStatisticsCreated created;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private UserStatisticsDeleted deleted;

        @com.aliyun.core.annotation.NameInMap("Pushed")
        private UserStatisticsPushed pushed;

        @com.aliyun.core.annotation.NameInMap("Same")
        private UserStatisticsSame same;

        @com.aliyun.core.annotation.NameInMap("Updated")
        private UserStatisticsUpdated updated;

        private UserStatistics(Builder builder) {
            this.binded = builder.binded;
            this.created = builder.created;
            this.deleted = builder.deleted;
            this.pushed = builder.pushed;
            this.same = builder.same;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatistics create() {
            return builder().build();
        }

        /**
         * @return binded
         */
        public UserStatisticsBinded getBinded() {
            return this.binded;
        }

        /**
         * @return created
         */
        public UserStatisticsCreated getCreated() {
            return this.created;
        }

        /**
         * @return deleted
         */
        public UserStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        /**
         * @return pushed
         */
        public UserStatisticsPushed getPushed() {
            return this.pushed;
        }

        /**
         * @return same
         */
        public UserStatisticsSame getSame() {
            return this.same;
        }

        /**
         * @return updated
         */
        public UserStatisticsUpdated getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private UserStatisticsBinded binded; 
            private UserStatisticsCreated created; 
            private UserStatisticsDeleted deleted; 
            private UserStatisticsPushed pushed; 
            private UserStatisticsSame same; 
            private UserStatisticsUpdated updated; 

            /**
             * 绑定结果统计
             */
            public Builder binded(UserStatisticsBinded binded) {
                this.binded = binded;
                return this;
            }

            /**
             * 创建结果统计
             */
            public Builder created(UserStatisticsCreated created) {
                this.created = created;
                return this;
            }

            /**
             * 删除结果统计
             */
            public Builder deleted(UserStatisticsDeleted deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * 推送结果统计
             */
            public Builder pushed(UserStatisticsPushed pushed) {
                this.pushed = pushed;
                return this;
            }

            /**
             * 相同结果统计
             */
            public Builder same(UserStatisticsSame same) {
                this.same = same;
                return this;
            }

            /**
             * 更新结果统计
             */
            public Builder updated(UserStatisticsUpdated updated) {
                this.updated = updated;
                return this;
            }

            public UserStatistics build() {
                return new UserStatistics(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GroupMemberStatistics")
        private GroupMemberStatistics groupMemberStatistics;

        @com.aliyun.core.annotation.NameInMap("GroupStatistics")
        private GroupStatistics groupStatistics;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitStatistics")
        private OrganizationalUnitStatistics organizationalUnitStatistics;

        @com.aliyun.core.annotation.NameInMap("UserStatistics")
        private UserStatistics userStatistics;

        private Result(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.groupMemberStatistics = builder.groupMemberStatistics;
            this.groupStatistics = builder.groupStatistics;
            this.organizationalUnitStatistics = builder.organizationalUnitStatistics;
            this.userStatistics = builder.userStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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

        /**
         * @return groupMemberStatistics
         */
        public GroupMemberStatistics getGroupMemberStatistics() {
            return this.groupMemberStatistics;
        }

        /**
         * @return groupStatistics
         */
        public GroupStatistics getGroupStatistics() {
            return this.groupStatistics;
        }

        /**
         * @return organizationalUnitStatistics
         */
        public OrganizationalUnitStatistics getOrganizationalUnitStatistics() {
            return this.organizationalUnitStatistics;
        }

        /**
         * @return userStatistics
         */
        public UserStatistics getUserStatistics() {
            return this.userStatistics;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private GroupMemberStatistics groupMemberStatistics; 
            private GroupStatistics groupStatistics; 
            private OrganizationalUnitStatistics organizationalUnitStatistics; 
            private UserStatistics userStatistics; 

            /**
             * 同步结果错误码
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * 同步结果错误信息描述
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * 组成员同步结果统计
             */
            public Builder groupMemberStatistics(GroupMemberStatistics groupMemberStatistics) {
                this.groupMemberStatistics = groupMemberStatistics;
                return this;
            }

            /**
             * 组同步结果统计
             */
            public Builder groupStatistics(GroupStatistics groupStatistics) {
                this.groupStatistics = groupStatistics;
                return this;
            }

            /**
             * 组织同步结果统计
             */
            public Builder organizationalUnitStatistics(OrganizationalUnitStatistics organizationalUnitStatistics) {
                this.organizationalUnitStatistics = organizationalUnitStatistics;
                return this;
            }

            /**
             * 用户同步结果统计
             */
            public Builder userStatistics(UserStatistics userStatistics) {
                this.userStatistics = userStatistics;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class SynchronizationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
        private String synchronizationJobId;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private SynchronizationJobs(Builder builder) {
            this.direction = builder.direction;
            this.endTime = builder.endTime;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.synchronizationJobId = builder.synchronizationJobId;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationJobs create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String direction; 
            private Long endTime; 
            private Result result; 
            private Long startTime; 
            private String status; 
            private String synchronizationJobId; 
            private String targetId; 
            private String targetType; 
            private String triggerType; 

            /**
             * 同步任务方向
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * 同步结束时间
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 同步任务结果
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * 同步开始时间
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 同步任务状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 同步任务ID
             */
            public Builder synchronizationJobId(String synchronizationJobId) {
                this.synchronizationJobId = synchronizationJobId;
                return this;
            }

            /**
             * 同步目标ID
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * 同步目标类型
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * 同步触发类型
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public SynchronizationJobs build() {
                return new SynchronizationJobs(this);
            } 

        } 

    }
}
