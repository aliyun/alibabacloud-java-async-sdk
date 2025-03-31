// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordResponseBody</p>
 */
public class ListRepoBuildRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuildRecords")
    private java.util.List<BuildRecords> buildRecords;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRepoBuildRecordResponseBody(Builder builder) {
        this.buildRecords = builder.buildRecords;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRecords
     */
    public java.util.List<BuildRecords> getBuildRecords() {
        return this.buildRecords;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BuildRecords> buildRecords; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRepoBuildRecordResponseBody model) {
            this.buildRecords = model.buildRecords;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of image building records.</p>
         */
        public Builder buildRecords(java.util.List<BuildRecords> buildRecords) {
            this.buildRecords = buildRecords;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D23DEDF-E91D-434B-B7D5-9D12C648D166</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRecordResponseBody build() {
            return new ListRepoBuildRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRepoBuildRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoBuildRecordResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private String imageTag;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        private Image(Builder builder) {
            this.imageTag = builder.imageTag;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        public static final class Builder {
            private String imageTag; 
            private String repoId; 
            private String repoName; 
            private String repoNamespaceName; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.imageTag = model.imageTag;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
            } 

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>The ID of the repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-gzsrlevmvoaq****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The name of the namespace to which the repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRepoBuildRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListRepoBuildRecordResponseBody</p>
     */
    public static class BuildRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildRecordId")
        private String buildRecordId;

        @com.aliyun.core.annotation.NameInMap("BuildStatus")
        private String buildStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Image")
        private Image image;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private BuildRecords(Builder builder) {
            this.buildRecordId = builder.buildRecordId;
            this.buildStatus = builder.buildStatus;
            this.endTime = builder.endTime;
            this.image = builder.image;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRecords create() {
            return builder().build();
        }

        /**
         * @return buildRecordId
         */
        public String getBuildRecordId() {
            return this.buildRecordId;
        }

        /**
         * @return buildStatus
         */
        public String getBuildStatus() {
            return this.buildStatus;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String buildRecordId; 
            private String buildStatus; 
            private String endTime; 
            private Image image; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(BuildRecords model) {
                this.buildRecordId = model.buildRecordId;
                this.buildStatus = model.buildStatus;
                this.endTime = model.endTime;
                this.image = model.image;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The ID of the image building record.</p>
             * 
             * <strong>example:</strong>
             * <p>537e08ab-735e-415f-b7c2-160eb87f8****</p>
             */
            public Builder buildRecordId(String buildRecordId) {
                this.buildRecordId = buildRecordId;
                return this;
            }

            /**
             * <p>The status of the image building.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder buildStatus(String buildStatus) {
                this.buildStatus = buildStatus;
                return this;
            }

            /**
             * <p>The time when the image building ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1572875610000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The information about the image.</p>
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The time when the image building started.</p>
             * 
             * <strong>example:</strong>
             * <p>1572872207000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public BuildRecords build() {
                return new BuildRecords(this);
            } 

        } 

    }
}
