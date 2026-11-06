// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCodeReviewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCodeReviewsResponseBody</p>
 */
public class ListCodeReviewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCodeReviewsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCodeReviewsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCodeReviewsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCodeReviewsResponseBody build() {
            return new ListCodeReviewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCodeReviewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCodeReviewsResponseBody</p>
     */
    public static class CodeReviews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FinalReviewer")
        private String finalReviewer;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReviewTime")
        private Long reviewTime;

        @com.aliyun.core.annotation.NameInMap("Reviewers")
        private java.util.List<String> reviewers;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CodeReviews(Builder builder) {
            this.command = builder.command;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.finalReviewer = builder.finalReviewer;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.reviewTime = builder.reviewTime;
            this.reviewers = builder.reviewers;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeReviews create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finalReviewer
         */
        public String getFinalReviewer() {
            return this.finalReviewer;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reviewTime
         */
        public Long getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return reviewers
         */
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String command; 
            private Long createTime; 
            private String creator; 
            private String description; 
            private String finalReviewer; 
            private String id; 
            private Long modifyTime; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private Long projectId; 
            private String regionId; 
            private Long reviewTime; 
            private java.util.List<String> reviewers; 
            private String status; 

            private Builder() {
            } 

            private Builder(CodeReviews model) {
                this.command = model.command;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.finalReviewer = model.finalReviewer;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.projectId = model.projectId;
                this.regionId = model.regionId;
                this.reviewTime = model.reviewTime;
                this.reviewers = model.reviewers;
                this.status = model.status;
            } 

            /**
             * <p>The node command of the root object.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1793145600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The account ID of the actual submitter.</p>
             * 
             * <strong>example:</strong>
             * <p>209000000000000002</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The review description provided upon creation.</p>
             * 
             * <strong>example:</strong>
             * <p>Code review</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The account ID of the final approver. This field is empty if no approval decision has been made.</p>
             * 
             * <strong>example:</strong>
             * <p>209000000000000001</p>
             */
            public Builder finalReviewer(String finalReviewer) {
                this.finalReviewer = finalReviewer;
                return this;
            }

            /**
             * <p>The unique ID of the review.</p>
             * 
             * <strong>example:</strong>
             * <p>review-id</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1793145600000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the root review object.</p>
             * 
             * <strong>example:</strong>
             * <p>8600000000000000001</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The name of the root review object.</p>
             * 
             * <strong>example:</strong>
             * <p>sales_workflow</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The root object type.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkflowDefinition</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23620</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The approval time. This field is empty if no approval decision has been made.</p>
             * 
             * <strong>example:</strong>
             * <p>1793145660000</p>
             */
            public Builder reviewTime(Long reviewTime) {
                this.reviewTime = reviewTime;
                return this;
            }

            /**
             * <p>The list of account IDs of the specified reviewers.</p>
             */
            public Builder reviewers(java.util.List<String> reviewers) {
                this.reviewers = reviewers;
                return this;
            }

            /**
             * <p>The review status.</p>
             * 
             * <strong>example:</strong>
             * <p>Reviewing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CodeReviews build() {
                return new CodeReviews(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCodeReviewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCodeReviewsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeReviews")
        private java.util.List<CodeReviews> codeReviews;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.codeReviews = builder.codeReviews;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return codeReviews
         */
        public java.util.List<CodeReviews> getCodeReviews() {
            return this.codeReviews;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CodeReviews> codeReviews; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.codeReviews = model.codeReviews;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of code reviews.</p>
             */
            public Builder codeReviews(java.util.List<CodeReviews> codeReviews) {
                this.codeReviews = codeReviews;
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
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
