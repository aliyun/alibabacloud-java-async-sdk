// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordResponseBody</p>
 */
public class ListRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("BuildRecords")
    private java.util.List < BuildRecords> buildRecords;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return buildRecords
     */
    public java.util.List < BuildRecords> getBuildRecords() {
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
        private java.util.List < BuildRecords> buildRecords; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * BuildRecords.
         */
        public Builder buildRecords(java.util.List < BuildRecords> buildRecords) {
            this.buildRecords = buildRecords;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRepoBuildRecordResponseBody build() {
            return new ListRepoBuildRecordResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
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

            /**
             * ImageTag.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * RepoId.
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * RepoName.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * RepoNamespaceName.
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
    public static class BuildRecords extends TeaModel {
        @NameInMap("BuildRecordId")
        private String buildRecordId;

        @NameInMap("BuildStatus")
        private String buildStatus;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Image")
        private Image image;

        @NameInMap("StartTime")
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

            /**
             * BuildRecordId.
             */
            public Builder buildRecordId(String buildRecordId) {
                this.buildRecordId = buildRecordId;
                return this;
            }

            /**
             * BuildStatus.
             */
            public Builder buildStatus(String buildStatus) {
                this.buildStatus = buildStatus;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * StartTime.
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
