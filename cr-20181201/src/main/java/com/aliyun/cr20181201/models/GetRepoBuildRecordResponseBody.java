// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoBuildRecordResponseBody</p>
 */
public class GetRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("Status")
    private String status;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("BuildRecordId")
    private String buildRecordId;

    @NameInMap("Image")
    private Image image;


    private GetRepoBuildRecordResponseBody(Builder builder) {
        this.status = builder.status;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.buildRecordId = builder.buildRecordId;
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoBuildRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
        private String status; 
        private Long endTime; 
        private Long startTime; 
        private String requestId; 
        private String code; 
        private Boolean isSuccess; 
        private String buildRecordId; 
        private Image image; 

        /**
         * <p>State</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>End time</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Start time</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

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
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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

        public GetRepoBuildRecordResponseBody build() {
            return new GetRepoBuildRecordResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoName")
        private String repoName;


        private Image(Builder builder) {
            this.repoNamespaceName = builder.repoNamespaceName;
            this.imageTag = builder.imageTag;
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
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        public static final class Builder {
            private String repoNamespaceName; 
            private String imageTag; 
            private String repoName; 

            /**
             * <p>The namespace of the image repository.</p>
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
             * <p>Image repository name</p>
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
}
