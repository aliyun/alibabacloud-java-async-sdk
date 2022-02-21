// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaReviewTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaReviewTasksResponseBody</p>
 */
public class ListQuotaReviewTasksResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
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
        @NameInMap("appGroupId")
        private Integer appGroupId;

        @NameInMap("appGroupName")
        private String appGroupName;

        @NameInMap("appGroupType")
        private String appGroupType;

        @NameInMap("approved")
        private Boolean approved;

        @NameInMap("available")
        private Boolean available;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("id")
        private Integer id;

        @NameInMap("memo")
        private String memo;

        @NameInMap("newComputeResource")
        private Integer newComputeResource;

        @NameInMap("newSocSize")
        private Integer newSocSize;

        @NameInMap("newSpec")
        private String newSpec;

        @NameInMap("oldComputeResource")
        private Integer oldComputeResource;

        @NameInMap("oldDocSize")
        private Integer oldDocSize;

        @NameInMap("oldSpec")
        private String oldSpec;

        @NameInMap("pending")
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
             * appGroupId.
             */
            public Builder appGroupId(Integer appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * appGroupName.
             */
            public Builder appGroupName(String appGroupName) {
                this.appGroupName = appGroupName;
                return this;
            }

            /**
             * appGroupType.
             */
            public Builder appGroupType(String appGroupType) {
                this.appGroupType = appGroupType;
                return this;
            }

            /**
             * approved.
             */
            public Builder approved(Boolean approved) {
                this.approved = approved;
                return this;
            }

            /**
             * available.
             */
            public Builder available(Boolean available) {
                this.available = available;
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
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * newComputeResource.
             */
            public Builder newComputeResource(Integer newComputeResource) {
                this.newComputeResource = newComputeResource;
                return this;
            }

            /**
             * newSocSize.
             */
            public Builder newSocSize(Integer newSocSize) {
                this.newSocSize = newSocSize;
                return this;
            }

            /**
             * newSpec.
             */
            public Builder newSpec(String newSpec) {
                this.newSpec = newSpec;
                return this;
            }

            /**
             * oldComputeResource.
             */
            public Builder oldComputeResource(Integer oldComputeResource) {
                this.oldComputeResource = oldComputeResource;
                return this;
            }

            /**
             * oldDocSize.
             */
            public Builder oldDocSize(Integer oldDocSize) {
                this.oldDocSize = oldDocSize;
                return this;
            }

            /**
             * oldSpec.
             */
            public Builder oldSpec(String oldSpec) {
                this.oldSpec = oldSpec;
                return this;
            }

            /**
             * pending.
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
