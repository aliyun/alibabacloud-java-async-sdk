// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordResponseBody</p>
 */
public class ListRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("BuildRecords")
    private java.util.List < BuildRecords> buildRecords;


    private ListRepoBuildRecordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.buildRecords = builder.buildRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoBuildRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return buildRecords
     */
    public java.util.List < BuildRecords> getBuildRecords() {
        return this.buildRecords;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < BuildRecords> buildRecords; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Build records</p>
         */
        public Builder buildRecords(java.util.List < BuildRecords> buildRecords) {
            this.buildRecords = buildRecords;
            return this;
        }

        public ListRepoBuildRecordResponseBody build() {
            return new ListRepoBuildRecordResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoId")
        private String repoId;

        @NameInMap("RepoName")
        private String repoName;


        private Image(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.imageTag = builder.imageTag;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
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

        public static final class Builder {
            private String repoNamespaceName; 
            private String imageTag; 
            private String repoId; 
            private String repoName; 

            /**
             * <p>The name of the repository namespace.</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>Image TAG</p>
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * <p>Warehouse ID</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>Repository name</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class BuildRecords extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("BuildStatus")
        private String buildStatus;

        @NameInMap("BuildRecordId")
        private String buildRecordId;

        @NameInMap("Image")
        private Image image;


        private BuildRecords(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.buildStatus = builder.buildStatus;
            this.buildRecordId = builder.buildRecordId;
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRecords create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return buildStatus
         */
        public String getBuildStatus() {
            return this.buildStatus;
        }

        /**
         * @return buildRecordId
         */
        public String getBuildRecordId() {
            return this.buildRecordId;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private String buildStatus; 
            private String buildRecordId; 
            private Image image; 

            /**
             * <p>End time</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Start time</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Build status</p>
             */
            public Builder buildStatus(String buildStatus) {
                this.buildStatus = buildStatus;
                return this;
            }

            /**
             * <p>Build record ID</p>
             */
            public Builder buildRecordId(String buildRecordId) {
                this.buildRecordId = buildRecordId;
                return this;
            }

            /**
             * <p>Image information</p>
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            public BuildRecords build() {
                return new BuildRecords(this);
            } 

        } 

    }
}
