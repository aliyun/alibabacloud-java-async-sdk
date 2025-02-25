// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaReviewTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaReviewTasksResponseBody</p>
 */
public class ListQuotaReviewTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListQuotaReviewTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaReviewTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the tickets. For more information, see [QuotaReviewTask](~~173609~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaReviewTasksResponseBody build() {
            return new ListQuotaReviewTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appGroupId")
        private Integer appGroupId;

        @com.aliyun.core.annotation.NameInMap("appGroupName")
        private String appGroupName;

        @com.aliyun.core.annotation.NameInMap("appGroupType")
        private String appGroupType;

        @com.aliyun.core.annotation.NameInMap("approved")
        private Boolean approved;

        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("newComputeResource")
        private Integer newComputeResource;

        @com.aliyun.core.annotation.NameInMap("newSocSize")
        private Integer newSocSize;

        @com.aliyun.core.annotation.NameInMap("newSpec")
        private String newSpec;

        @com.aliyun.core.annotation.NameInMap("oldComputeResource")
        private Integer oldComputeResource;

        @com.aliyun.core.annotation.NameInMap("oldDocSize")
        private Integer oldDocSize;

        @com.aliyun.core.annotation.NameInMap("oldSpec")
        private String oldSpec;

        @com.aliyun.core.annotation.NameInMap("pending")
        private Boolean pending;

        private Result(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.appGroupName = builder.appGroupName;
            this.appGroupType = builder.appGroupType;
            this.approved = builder.approved;
            this.available = builder.available;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.memo = builder.memo;
            this.newComputeResource = builder.newComputeResource;
            this.newSocSize = builder.newSocSize;
            this.newSpec = builder.newSpec;
            this.oldComputeResource = builder.oldComputeResource;
            this.oldDocSize = builder.oldDocSize;
            this.oldSpec = builder.oldSpec;
            this.pending = builder.pending;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return appGroupName
         */
        public String getAppGroupName() {
            return this.appGroupName;
        }

        /**
         * @return appGroupType
         */
        public String getAppGroupType() {
            return this.appGroupType;
        }

        /**
         * @return approved
         */
        public Boolean getApproved() {
            return this.approved;
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return newComputeResource
         */
        public Integer getNewComputeResource() {
            return this.newComputeResource;
        }

        /**
         * @return newSocSize
         */
        public Integer getNewSocSize() {
            return this.newSocSize;
        }

        /**
         * @return newSpec
         */
        public String getNewSpec() {
            return this.newSpec;
        }

        /**
         * @return oldComputeResource
         */
        public Integer getOldComputeResource() {
            return this.oldComputeResource;
        }

        /**
         * @return oldDocSize
         */
        public Integer getOldDocSize() {
            return this.oldDocSize;
        }

        /**
         * @return oldSpec
         */
        public String getOldSpec() {
            return this.oldSpec;
        }

        /**
         * @return pending
         */
        public Boolean getPending() {
            return this.pending;
        }

        public static final class Builder {
            private Integer appGroupId; 
            private String appGroupName; 
            private String appGroupType; 
            private Boolean approved; 
            private Boolean available; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer id; 
            private String memo; 
            private Integer newComputeResource; 
            private Integer newSocSize; 
            private String newSpec; 
            private Integer oldComputeResource; 
            private Integer oldDocSize; 
            private String oldSpec; 
            private Boolean pending; 

            /**
             * The application ID.
             */
            public Builder appGroupId(Integer appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appGroupName(String appGroupName) {
                this.appGroupName = appGroupName;
                return this;
            }

            /**
             * The application type.
             */
            public Builder appGroupType(String appGroupType) {
                this.appGroupType = appGroupType;
                return this;
            }

            /**
             * Indicates whether the ticket is approved.
             */
            public Builder approved(Boolean approved) {
                this.approved = approved;
                return this;
            }

            /**
             * Indicates whether the application is available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * The time when the ticket was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the ticket was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ticket ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * The computing resource quota that is applied for.
             */
            public Builder newComputeResource(Integer newComputeResource) {
                this.newComputeResource = newComputeResource;
                return this;
            }

            /**
             * The storage capacity quota that is applied for.
             */
            public Builder newSocSize(Integer newSocSize) {
                this.newSocSize = newSocSize;
                return this;
            }

            /**
             * The application specifications that are applied for.
             */
            public Builder newSpec(String newSpec) {
                this.newSpec = newSpec;
                return this;
            }

            /**
             * The original quota of computing resources.
             */
            public Builder oldComputeResource(Integer oldComputeResource) {
                this.oldComputeResource = oldComputeResource;
                return this;
            }

            /**
             * The original quota of storage capacity.
             */
            public Builder oldDocSize(Integer oldDocSize) {
                this.oldDocSize = oldDocSize;
                return this;
            }

            /**
             * The original specifications of the application.
             */
            public Builder oldSpec(String oldSpec) {
                this.oldSpec = oldSpec;
                return this;
            }

            /**
             * Indicates whether the ticket is pending.
             */
            public Builder pending(Boolean pending) {
                this.pending = pending;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
