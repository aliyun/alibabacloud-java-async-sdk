// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoBuildRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoBuildRecordResponseBody</p>
 */
public class GetRepoBuildRecordResponseBody extends TeaModel {
    @NameInMap("BuildRecordId")
    private String buildRecordId;

    @NameInMap("Code")
    private String code;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("Image")
    private Image image;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    private GetRepoBuildRecordResponseBody(Builder builder) {
        this.buildRecordId = builder.buildRecordId;
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.image = builder.image;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoBuildRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String buildRecordId; 
        private String code; 
        private Long endTime; 
        private Image image; 
        private Boolean isSuccess; 
        private String requestId; 
        private Long startTime; 
        private String status; 

        /**
         * BuildRecordId.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.buildRecordId = buildRecordId;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
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
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRepoBuildRecordResponseBody build() {
            return new GetRepoBuildRecordResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        private Image(Builder builder) {
            this.imageTag = builder.imageTag;
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
}
